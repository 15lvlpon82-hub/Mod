package pulse;

import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.VertexFormat.DrawMode;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.ChargedProjectilesComponent;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.RaycastContext;
import org.joml.Matrix4f;
import pulse.module.ClientModule;
import pulse.module.ModuleCategory;
import pulse.module.ModuleInfo;
import pulse.module.ModuleRegistry;
import pulse.settings.BooleanSetting;
import pulse.settings.ColorSetting;
import pulse.settings.SettingGroup;
import pulse.settings.SliderSetting;

@ModuleInfo(a = "Predictions", b = "Predicts projectile trajectories.", c = ModuleCategory.UTILITIES)
public class Predictions extends ClientModule {
   private static final int MAX_STEPS = 220;
   private static final int MARKER_SEGMENTS = 48;

   private final SettingGroup projectileGroup;
   private final BooleanSetting arrows;
   private final BooleanSetting enderPearls;
   private final BooleanSetting tridents;
   private final BooleanSetting potions;
   private final SettingGroup lineGroup;
   private final SliderSetting lineWidth;
   private final BooleanSetting useClientColor;
   private final ColorSetting lineColor;
   private final BooleanSetting gradient;
   private final ColorSetting gradientColor;
   private final BooleanSetting fadeOut;
   private final SliderSetting fadeStart;
   private final SettingGroup markerGroup;
   private final BooleanSetting impactMarker;
   private final SliderSetting markerSize;
   private final BooleanSetting markerPulse;
   private final SliderSetting markerPulseSpeed;
   private final ColorSetting hitColor;

   private final List<Vec3d> path = new ArrayList<>();
   private Vec3d impactPoint;
   private boolean hitEntity;

   public Predictions() {
      this.projectileGroup = new SettingGroup("Projectiles");
      this.arrows = new BooleanSetting("Arrows", true);
      this.enderPearls = new BooleanSetting("Ender Pearls", true);
      this.tridents = new BooleanSetting("Tridents", true);
      this.potions = new BooleanSetting("Potions", true);

      this.lineGroup = new SettingGroup("Line");
      this.lineWidth = new SliderSetting("Line Width", 2.0F, 1.0F, 6.0F, 0.25F);
      this.useClientColor = new BooleanSetting("Use Client Color", true);
      this.lineColor = new ColorSetting("Line Color", new Color(120, 80, 255)).a(() -> !this.useClientColor.a());
      this.gradient = new BooleanSetting("Gradient", true);
      this.gradientColor = new ColorSetting("Gradient Color", new Color(80, 180, 255)).a(this.gradient::a);
      this.fadeOut = new BooleanSetting("Fade Out", true);
      this.fadeStart = new SliderSetting("Fade Start", 0.65F, 0.1F, 0.95F, 0.05F).a(this.fadeOut::a);

      this.markerGroup = new SettingGroup("Impact Marker");
      this.impactMarker = new BooleanSetting("Impact Marker", true);
      this.markerSize = new SliderSetting("Marker Size", 0.35F, 0.1F, 1.2F, 0.05F).a(this.impactMarker::a);
      this.markerPulse = new BooleanSetting("Pulse", true).a(this.impactMarker::a);
      this.markerPulseSpeed = new SliderSetting("Pulse Speed", 1.0F, 0.2F, 3.0F, 0.1F).a(() -> this.impactMarker.a() && this.markerPulse.a());
      this.hitColor = new ColorSetting("Hit Color", new Color(255, 85, 110)).a(this.impactMarker::a);
   }

   @EventHandler
   public void a(WorldRenderEvent event) {
      if (c.player == null || c.world == null || c.gameRenderer == null) {
         this.clearPrediction();
         return;
      }

      ItemStack stack = this.currentProjectileStack();
      ProjectileType type = ProjectileType.from(stack);
      if (type == null || !this.isEnabled(type) || !this.isReady(stack, type)) {
         this.clearPrediction();
         return;
      }

      this.simulate(event.b(), stack, type);
      if (this.path.size() > 1) {
         this.render(event);
      }
   }

   private ItemStack currentProjectileStack() {
      ItemStack mainHand = c.player.getMainHandStack();
      if (ProjectileType.from(mainHand) != null) {
         return mainHand;
      }

      ItemStack offHand = c.player.getOffHandStack();
      return ProjectileType.from(offHand) != null ? offHand : ItemStack.EMPTY;
   }

   private boolean isEnabled(ProjectileType type) {
      return switch (type) {
         case ARROW -> this.arrows.a();
         case ENDER_PEARL -> this.enderPearls.a();
         case TRIDENT -> this.tridents.a();
         case POTION -> this.potions.a();
      };
   }

   private boolean isReady(ItemStack stack, ProjectileType type) {
      Item item = stack.getItem();
      if (item == Items.BOW || item == Items.TRIDENT) {
         return c.player.isUsingItem() && c.player.getItemUseTimeLeft() > 0;
      }

      if (item == Items.CROSSBOW) {
         ChargedProjectilesComponent chargedProjectiles = stack.get(DataComponentTypes.CHARGED_PROJECTILES);
         return chargedProjectiles != null && !chargedProjectiles.isEmpty();
      }

      return type == ProjectileType.ENDER_PEARL || type == ProjectileType.POTION;
   }

   private void simulate(float tickDelta, ItemStack stack, ProjectileType type) {
      this.path.clear();
      this.impactPoint = null;
      this.hitEntity = false;

      Vec3d position = c.player.getCameraPosVec(tickDelta);
      Vec3d velocity = this.initialVelocity(stack, type);
      this.path.add(position);

      for (int step = 0; step < MAX_STEPS; step++) {
         Vec3d nextPosition = position.add(velocity);
         BlockHitResult blockHit = c.world.raycast(
            new RaycastContext(position, nextPosition, RaycastContext.ShapeType.COLLIDER, RaycastContext.FluidHandling.NONE, c.player)
         );

         boolean collided = false;
         if (blockHit.getType() != HitResult.Type.MISS) {
            nextPosition = blockHit.getPos();
            collided = true;
         }

         EntityHitResult entityHit = this.findEntityHit(position, nextPosition);
         if (entityHit != null) {
            nextPosition = entityHit.getPos();
            this.hitEntity = true;
            collided = true;
         }

         this.path.add(nextPosition);
         if (collided) {
            this.impactPoint = nextPosition;
            return;
         }

         if (nextPosition.y < c.world.getBottomY() - 16.0D) {
            return;
         }

         position = nextPosition;
         velocity = velocity.multiply(type.drag).subtract(0.0D, type.gravity, 0.0D);
      }
   }

   private Vec3d initialVelocity(ItemStack stack, ProjectileType type) {
      Vec3d direction = this.lookDirection();
      double speed = type.baseSpeed;
      Item item = stack.getItem();

      if (item == Items.BOW) {
         int usedTicks = stack.getMaxUseTime(c.player) - c.player.getItemUseTimeLeft();
         float charge = Math.min(1.0F, Math.max(0.05F, (usedTicks / 20.0F * usedTicks / 20.0F + usedTicks / 20.0F * 2.0F) / 3.0F));
         speed = 3.0D * charge;
      } else if (item == Items.TRIDENT) {
         int usedTicks = stack.getMaxUseTime(c.player) - c.player.getItemUseTimeLeft();
         float charge = Math.min(1.0F, Math.max(0.1F, usedTicks / 10.0F));
         speed = 2.5D * charge;
      }

      return direction.multiply(speed).add(c.player.getVelocity().multiply(0.35D));
   }

   private Vec3d lookDirection() {
      float yaw = c.player.getYaw();
      float pitch = c.player.getPitch();
      float pitchCos = (float)Math.cos(-pitch * (Math.PI / 180.0D));
      float pitchSin = (float)Math.sin(-pitch * (Math.PI / 180.0D));
      float yawCos = (float)Math.cos(-yaw * (Math.PI / 180.0D) - Math.PI);
      float yawSin = (float)Math.sin(-yaw * (Math.PI / 180.0D) - Math.PI);
      return new Vec3d(yawSin * pitchCos, pitchSin, yawCos * pitchCos).normalize();
   }

   private EntityHitResult findEntityHit(Vec3d from, Vec3d to) {
      Entity closestEntity = null;
      Vec3d closestHit = null;
      double closestDistance = Double.MAX_VALUE;
      Box searchBox = new Box(from, to).expand(1.0D);

      for (Entity entity : c.world.getOtherEntities(c.player, searchBox)) {
         if (entity == c.player || entity.isSpectator() || !entity.isAlive() || !(entity instanceof LivingEntity)) {
            continue;
         }

         Optional<Vec3d> hit = entity.getBoundingBox().expand(0.3D).raycast(from, to);
         if (hit.isPresent()) {
            double distance = from.squaredDistanceTo(hit.get());
            if (distance < closestDistance) {
               closestDistance = distance;
               closestEntity = entity;
               closestHit = hit.get();
            }
         }
      }

      return closestEntity == null ? null : new EntityHitResult(closestEntity, closestHit);
   }

   private void render(WorldRenderEvent event) {
      MatrixStack matrices = event.a();
      Vec3d camera = c.gameRenderer.getCamera().getPos();

      matrices.push();
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.disableCull();
      RenderSystem.disableDepthTest();
      RenderSystem.depthMask(false);
      RenderSystem.setShader(ShaderProgramKeys.POSITION_COLOR);

      Matrix4f matrix = matrices.peek().getPositionMatrix();
      RenderSystem.lineWidth(this.lineWidth.a());
      BufferBuilder line = Tessellator.getInstance().begin(DrawMode.LINE_STRIP, VertexFormats.POSITION_COLOR);
      for (int index = 0; index < this.path.size(); index++) {
         Vec3d point = this.path.get(index);
         float progress = this.path.size() <= 1 ? 0.0F : (float)index / (float)(this.path.size() - 1);
         Color color = this.pathColor(progress);
         float alpha = this.alpha(progress);
         vertex(line, matrix, point.subtract(camera), color, alpha);
      }
      BufferRenderer.drawWithGlobalProgram(line.end());
      RenderSystem.lineWidth(1.0F);

      if (this.impactMarker.a() && this.impactPoint != null) {
         this.renderImpactMarker(matrix, camera);
      }

      RenderSystem.depthMask(true);
      RenderSystem.enableDepthTest();
      RenderSystem.enableCull();
      RenderSystem.disableBlend();
      matrices.pop();
   }

   private void renderImpactMarker(Matrix4f matrix, Vec3d camera) {
      Color color = this.hitEntity ? this.hitColor.a() : this.pathColor(1.0F);
      float pulse = this.markerPulse.a()
         ? 1.0F + 0.18F * (float)Math.sin(System.currentTimeMillis() * 0.006D * this.markerPulseSpeed.a())
         : 1.0F;
      float size = this.markerSize.a() * pulse;
      Vec3d center = this.impactPoint.subtract(camera);

      RenderSystem.lineWidth(2.0F);
      BufferBuilder ring = Tessellator.getInstance().begin(DrawMode.DEBUG_LINES, VertexFormats.POSITION_COLOR);
      for (int segment = 0; segment < MARKER_SEGMENTS; segment++) {
         double angle = Math.PI * 2.0D * segment / MARKER_SEGMENTS;
         double nextAngle = Math.PI * 2.0D * (segment + 1) / MARKER_SEGMENTS;
         vertex(ring, matrix, center.add(Math.cos(angle) * size, 0.01D, Math.sin(angle) * size), color, 0.9F);
         vertex(ring, matrix, center.add(Math.cos(nextAngle) * size, 0.01D, Math.sin(nextAngle) * size), color, 0.9F);
      }
      BufferRenderer.drawWithGlobalProgram(ring.end());
      RenderSystem.lineWidth(1.0F);
   }

   private Color pathColor(float progress) {
      Color start = this.useClientColor.a() ? ModuleRegistry.CLIENT_COLOR.n() : this.lineColor.a();
      if (!this.gradient.a()) {
         return start;
      }

      Color end = this.gradientColor.a();
      return new Color(
         lerp(start.getRed(), end.getRed(), progress),
         lerp(start.getGreen(), end.getGreen(), progress),
         lerp(start.getBlue(), end.getBlue(), progress)
      );
   }

   private float alpha(float progress) {
      if (!this.fadeOut.a() || progress <= this.fadeStart.a()) {
         return 1.0F;
      }

      float range = 1.0F - this.fadeStart.a();
      return Math.max(0.0F, 1.0F - (progress - this.fadeStart.a()) / range);
   }

   private void clearPrediction() {
      this.path.clear();
      this.impactPoint = null;
      this.hitEntity = false;
   }

   private static int lerp(int start, int end, float progress) {
      return Math.round(start + (end - start) * Math.max(0.0F, Math.min(1.0F, progress)));
   }

   private static void vertex(BufferBuilder buffer, Matrix4f matrix, Vec3d point, Color color, float alpha) {
      buffer.vertex(matrix, (float)point.x, (float)point.y, (float)point.z)
         .color(color.getRed() / 255.0F, color.getGreen() / 255.0F, color.getBlue() / 255.0F, alpha);
   }

   private enum ProjectileType {
      ENDER_PEARL(1.5D, 0.99D, 0.03D),
      TRIDENT(2.5D, 0.99D, 0.05D),
      ARROW(3.0D, 0.99D, 0.05D),
      POTION(0.5D, 0.99D, 0.05D);

      private final double baseSpeed;
      private final double drag;
      private final double gravity;

      ProjectileType(double baseSpeed, double drag, double gravity) {
         this.baseSpeed = baseSpeed;
         this.drag = drag;
         this.gravity = gravity;
      }

      private static ProjectileType from(ItemStack stack) {
         if (stack == null || stack.isEmpty()) {
            return null;
         }

         Item item = stack.getItem();
         if (item == Items.ENDER_PEARL) {
            return ENDER_PEARL;
         }
         if (item == Items.TRIDENT) {
            return TRIDENT;
         }
         if (item == Items.BOW || item == Items.CROSSBOW) {
            return ARROW;
         }
         return item == Items.SPLASH_POTION || item == Items.LINGERING_POTION ? POTION : null;
      }
   }
}
