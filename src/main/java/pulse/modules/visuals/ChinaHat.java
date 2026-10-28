package pulse;

import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.VertexFormat.DrawMode;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import org.joml.Matrix4f;
import pulse.module.ClientModule;
import pulse.module.ModuleCategory;
import pulse.module.ModuleInfo;
import pulse.module.ModuleRegistry;
import pulse.settings.BooleanSetting;
import pulse.settings.ColorSetting;
import pulse.settings.SettingGroup;
import pulse.settings.SliderSetting;

@ModuleInfo(a = "China Hat", b = "Draws a cone hat above players.", c = ModuleCategory.VISUALS)
public class ChinaHat extends ClientModule {
   private static final int SEGMENTS = 90;

   private final SliderSetting height;
   private final SliderSetting radius;
   private final BooleanSetting followSneaking;
   private final SettingGroup colorGroup;
   private final BooleanSetting useClientColor;
   private final ColorSetting color;

   public ChinaHat() {
      this.height = new SliderSetting("Height", 0.3F, 0.1F, 0.6F, 0.05F);
      this.radius = new SliderSetting("Radius", 0.5F, 0.1F, 1.0F, 0.05F);
      this.followSneaking = new BooleanSetting("Follow Sneaking", true);
      this.colorGroup = new SettingGroup("Color");
      this.useClientColor = new BooleanSetting("Use Client Color", true);
      this.color = new ColorSetting("Custom Color", new Color(120, 80, 255)).a(() -> !this.useClientColor.a());
   }

   @EventHandler
   public void a(WorldRenderEvent event) {
      if (c.player == null || c.world == null || c.gameRenderer == null) {
         return;
      }

      MatrixStack matrices = event.a();
      Vec3d camera = c.gameRenderer.getCamera().getPos();
      matrices.push();
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.disableCull();
      RenderSystem.enableDepthTest();
      RenderSystem.depthMask(false);

      for (PlayerEntity player : c.world.getPlayers()) {
         if (player.isInvisible()) {
            continue;
         }

         if (player == c.player && c.options.getPerspective().isFirstPerson()) {
            continue;
         }

         this.renderHat(matrices, camera, player, event.b());
      }

      RenderSystem.depthMask(true);
      RenderSystem.enableCull();
      RenderSystem.disableBlend();
      matrices.pop();
   }

   private void renderHat(MatrixStack matrices, Vec3d camera, PlayerEntity player, float tickDelta) {
      double x = MathHelper.lerp(tickDelta, player.prevX, player.getX()) - camera.x;
      double y = MathHelper.lerp(tickDelta, player.prevY, player.getY()) - camera.y + player.getHeight() + 0.05D;
      double z = MathHelper.lerp(tickDelta, player.prevZ, player.getZ()) - camera.z;

      if (this.followSneaking.a() && player.isSneaking()) {
         y -= 0.18D;
      }

      float radiusValue = this.radius.a();
      float heightValue = this.height.a();
      Color baseColor = this.n();
      Matrix4f matrix = matrices.peek().getPositionMatrix();

      RenderSystem.setShader(ShaderProgramKeys.POSITION_COLOR);
      BufferBuilder fill = Tessellator.getInstance().begin(DrawMode.TRIANGLES, VertexFormats.POSITION_COLOR);
      for (int segment = 0; segment < SEGMENTS; segment++) {
         float progress = (float)segment / SEGMENTS;
         float nextProgress = (float)(segment + 1) / SEGMENTS;
         double angle = progress * Math.PI * 2.0D;
         double nextAngle = nextProgress * Math.PI * 2.0D;
         Color segmentColor = this.a(baseColor, progress);

         vertex(fill, matrix, x, y + heightValue, z, segmentColor, 0.55F);
         vertex(fill, matrix, x + Math.cos(angle) * radiusValue, y, z + Math.sin(angle) * radiusValue, segmentColor, 0.28F);
         vertex(fill, matrix, x + Math.cos(nextAngle) * radiusValue, y, z + Math.sin(nextAngle) * radiusValue, this.a(baseColor, nextProgress), 0.28F);
      }
      BufferRenderer.drawWithGlobalProgram(fill.end());

      RenderSystem.lineWidth(2.0F);
      BufferBuilder outline = Tessellator.getInstance().begin(DrawMode.DEBUG_LINES, VertexFormats.POSITION_COLOR);
      for (int segment = 0; segment < SEGMENTS; segment++) {
         float progress = (float)segment / SEGMENTS;
         float nextProgress = (float)(segment + 1) / SEGMENTS;
         double angle = progress * Math.PI * 2.0D;
         double nextAngle = nextProgress * Math.PI * 2.0D;
         Color segmentColor = this.a(baseColor, progress);

         vertex(outline, matrix, x + Math.cos(angle) * radiusValue, y, z + Math.sin(angle) * radiusValue, segmentColor, 0.95F);
         vertex(outline, matrix, x + Math.cos(nextAngle) * radiusValue, y, z + Math.sin(nextAngle) * radiusValue, this.a(baseColor, nextProgress), 0.95F);
      }
      BufferRenderer.drawWithGlobalProgram(outline.end());
      RenderSystem.lineWidth(1.0F);
   }

   private Color n() {
      return this.useClientColor.a() ? ModuleRegistry.CLIENT_COLOR.n() : this.color.a();
   }

   private Color a(Color color, float offset) {
      float[] hsb = Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), null);
      hsb[0] = (hsb[0] + (float)Math.sin(offset * Math.PI) * 0.08F) % 1.0F;
      if (hsb[0] < 0.0F) {
         hsb[0] += 1.0F;
      }
      return Color.getHSBColor(hsb[0], hsb[1], hsb[2]);
   }

   private static void vertex(BufferBuilder buffer, Matrix4f matrix, double x, double y, double z, Color color, float alpha) {
      buffer.vertex(matrix, (float)x, (float)y, (float)z)
         .color(color.getRed() / 255.0F, color.getGreen() / 255.0F, color.getBlue() / 255.0F, alpha);
   }
}
