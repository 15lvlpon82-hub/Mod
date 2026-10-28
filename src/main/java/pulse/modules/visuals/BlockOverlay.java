package pulse;

import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.block.BlockState;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.VertexFormat.DrawMode;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import org.joml.Matrix4f;
import org.lwjgl.opengl.GL11;
import pulse.module.ClientModule;
import pulse.module.ModuleCategory;
import pulse.module.ModuleInfo;
import pulse.module.ModuleRegistry;
import pulse.settings.BooleanSetting;
import pulse.settings.ColorSetting;
import pulse.settings.ModeSetting;
import pulse.settings.SettingGroup;
import pulse.settings.SliderSetting;

@ModuleInfo(a = "Block Overlay", b = "Красиво выделяет блок, на который наведен игрок", c = ModuleCategory.VISUALS)
public class BlockOverlay extends ClientModule {
   private static final String FILL_NORMAL = "Обычная";
   private static final String FILL_SHADER = "Шейдер";
   private static final String ANIMATION_NONE = "Нет";
   private static final String ANIMATION_PULSE = "Пульсация";
   private static final String ANIMATION_WAVE = "Волна";
   private static final String SHADER_NEBULA = "Небула";
   private static final String SHADER_STARS = "Звёзды";
   private static final String SHADER_WEB = "Паутина";
   private static final String SHADER_PLASMA = "Плазма";

   private final SettingGroup outlineGroup;
   private final BooleanSetting outlineEnabled;
   private final SliderSetting lineWidth;
   private final SettingGroup fillGroup;
   private final BooleanSetting fillEnabled;
   private final ModeSetting fillType;
   private final SliderSetting fillAlpha;
   private final ModeSetting shaderType;
   private final SliderSetting shaderSpeed;
   private final SliderSetting shaderAlpha;
   private final SettingGroup animationGroup;
   private final ModeSetting animationMode;
   private final SettingGroup colorGroup;
   private final BooleanSetting useClientColor;
   private final ColorSetting customColor;

   public BlockOverlay() {
      this.outlineGroup = new SettingGroup("Обводка");
      this.outlineEnabled = new BooleanSetting("Обводка", true);
      this.lineWidth = new SliderSetting("Толщина линий", 2.0F, 1.0F, 5.0F, 0.5F).a(this.outlineEnabled::a);

      this.fillGroup = new SettingGroup("Заливка");
      this.fillEnabled = new BooleanSetting("Заливка", true);
      this.fillType = new ModeSetting("Тип заливки", new String[] {FILL_NORMAL, FILL_SHADER}, FILL_NORMAL).a(this.fillEnabled::a);
      this.fillAlpha = new SliderSetting("Прозрачность заливки", 0.3F, 0.1F, 1.0F, 0.05F).a(
         () -> this.fillEnabled.a() && this.fillType.b(FILL_NORMAL)
      );
      this.shaderType = new ModeSetting("Шейдер", new String[] {SHADER_NEBULA, SHADER_STARS, SHADER_WEB, SHADER_PLASMA}, SHADER_NEBULA).a(
         () -> this.fillEnabled.a() && this.fillType.b(FILL_SHADER)
      );
      this.shaderSpeed = new SliderSetting("Скорость анимации", 1.0F, 0.1F, 3.0F, 0.1F).a(
         () -> this.fillEnabled.a() && this.fillType.b(FILL_SHADER)
      );
      this.shaderAlpha = new SliderSetting("Прозрачность", 1.0F, 0.1F, 1.0F, 0.05F).a(
         () -> this.fillEnabled.a() && this.fillType.b(FILL_SHADER)
      );

      this.animationGroup = new SettingGroup("Анимация");
      this.animationMode = new ModeSetting("Режим анимации", new String[] {ANIMATION_NONE, ANIMATION_PULSE, ANIMATION_WAVE}, ANIMATION_NONE);

      this.colorGroup = new SettingGroup("Цвет");
      this.useClientColor = new BooleanSetting("Цвет клиента", true);
      this.customColor = new ColorSetting("Кастомный цвет", Color.WHITE).a(() -> !this.useClientColor.a());
   }

   @EventHandler
   public void onBlockOutline(BlockOutlineEvent event) {
      event.b();

      BlockState blockState = event.blockState();
      if (blockState.isAir()) {
         return;
      }

      Box outlineBox = blockState.getOutlineShape(c.world, event.blockPos())
         .getBoundingBox()
         .offset(
            event.blockPos().getX() - event.cameraX(),
            event.blockPos().getY() - event.cameraY(),
            event.blockPos().getZ() - event.cameraZ()
         );

      this.renderOverlay(event.matrices(), this.applyPrimaryAnimation(outlineBox), this.overlayColor());

      if (this.animationMode.b(ANIMATION_WAVE)) {
         this.renderWave(event.matrices(), outlineBox, this.overlayColor());
      }
   }

   private Box applyPrimaryAnimation(Box box) {
      if (!this.animationMode.b(ANIMATION_PULSE)) {
         return box;
      }

      float progress = (float)((Math.sin(System.currentTimeMillis() / 260.0D) + 1.0D) * 0.5D);
      return scaleBox(box, 1.0F + progress * 0.04F);
   }

   private void renderOverlay(MatrixStack matrices, Box box, Color color) {
      matrices.push();
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.disableCull();
      RenderSystem.depthMask(false);
      RenderSystem.depthFunc(GL11.GL_ALWAYS);

      if (this.fillEnabled.a()) {
         this.drawFill(matrices, box, color);
      }

      if (this.outlineEnabled.a()) {
         this.drawOutline(matrices, box, color, 1.0F, this.lineWidth.a());
      }

      RenderSystem.depthFunc(GL11.GL_LEQUAL);
      RenderSystem.depthMask(true);
      RenderSystem.enableCull();
      RenderSystem.disableBlend();
      matrices.pop();
   }

   private void renderWave(MatrixStack matrices, Box box, Color color) {
      float progress = (System.currentTimeMillis() % 1000L) / 1000.0F;
      Box waveBox = scaleBox(box, 1.0F + progress * 0.18F);

      matrices.push();
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.depthFunc(GL11.GL_ALWAYS);
      this.drawOutline(matrices, waveBox, color, 1.0F - progress, Math.max(1.0F, this.lineWidth.a() - 0.5F));
      RenderSystem.depthFunc(GL11.GL_LEQUAL);
      RenderSystem.disableBlend();
      matrices.pop();
   }

   private void drawOutline(MatrixStack matrices, Box box, Color color, float alpha, float width) {
      GL11.glEnable(GL11.GL_LINE_SMOOTH);
      RenderSystem.setShader(ShaderProgramKeys.POSITION_COLOR);
      RenderSystem.lineWidth(width);

      BufferBuilder buffer = Tessellator.getInstance().begin(DrawMode.DEBUG_LINES, VertexFormats.POSITION_COLOR);
      Matrix4f matrix = matrices.peek().getPositionMatrix();
      addBoxLines(buffer, matrix, box, color, alpha);
      BufferRenderer.drawWithGlobalProgram(buffer.end());

      RenderSystem.lineWidth(1.0F);
      GL11.glDisable(GL11.GL_LINE_SMOOTH);
   }

   private void drawFill(MatrixStack matrices, Box box, Color baseColor) {
      RenderSystem.setShader(ShaderProgramKeys.POSITION_COLOR);

      BufferBuilder buffer = Tessellator.getInstance().begin(DrawMode.QUADS, VertexFormats.POSITION_COLOR);
      Matrix4f matrix = matrices.peek().getPositionMatrix();

      if (this.fillType.b(FILL_SHADER)) {
         addShaderBoxQuads(buffer, matrix, box, this.shaderAlpha.a());
      } else {
         addBoxQuads(buffer, matrix, box, baseColor, this.fillAlpha.a());
      }

      BufferRenderer.drawWithGlobalProgram(buffer.end());
   }

   private Color overlayColor() {
      return this.useClientColor.a() ? ModuleRegistry.CLIENT_COLOR.n() : this.customColor.a();
   }

   private Color shaderColor(float x, float y, float z, float alpha) {
      float time = (System.currentTimeMillis() % 100_000L) / 1000.0F * this.shaderSpeed.a();
      String shader = this.shaderType.d();

      if (SHADER_STARS.equals(shader)) {
         float twinkle = (float)((Math.sin((x * 7.0F + y * 11.0F + z * 13.0F + time * 4.0F)) + 1.0D) * 0.5D);
         int light = 90 + Math.round(twinkle * 165.0F);
         return new Color(light, light, 255, Math.round(alpha * 255.0F));
      }

      if (SHADER_WEB.equals(shader)) {
         float web = Math.abs((float)Math.sin((x + z) * 8.0F + time * 2.0F));
         int value = 170 + Math.round(web * 85.0F);
         return new Color(value, value, value, Math.round(alpha * 255.0F));
      }

      if (SHADER_PLASMA.equals(shader)) {
         float hue = wrap((float)(Math.sin(x * 2.4F + time) + Math.cos(z * 2.8F - time)) * 0.12F + time * 0.08F);
         return withAlpha(Color.getHSBColor(hue, 0.9F, 1.0F), alpha);
      }

      float hue = wrap(0.64F + (float)Math.sin((x + y + z) * 1.7F + time) * 0.08F + time * 0.03F);
      return withAlpha(Color.getHSBColor(hue, 0.75F, 1.0F), alpha);
   }

   private static Box scaleBox(Box box, float scale) {
      Vec3d center = box.getCenter();
      double halfX = (box.maxX - box.minX) * 0.5D * scale;
      double halfY = (box.maxY - box.minY) * 0.5D * scale;
      double halfZ = (box.maxZ - box.minZ) * 0.5D * scale;
      return new Box(center.x - halfX, center.y - halfY, center.z - halfZ, center.x + halfX, center.y + halfY, center.z + halfZ);
   }

   private static void addBoxLines(BufferBuilder buffer, Matrix4f matrix, Box box, Color color, float alpha) {
      float minX = (float)box.minX;
      float minY = (float)box.minY;
      float minZ = (float)box.minZ;
      float maxX = (float)box.maxX;
      float maxY = (float)box.maxY;
      float maxZ = (float)box.maxZ;

      line(buffer, matrix, minX, minY, minZ, maxX, minY, minZ, color, alpha);
      line(buffer, matrix, minX, minY, minZ, minX, maxY, minZ, color, alpha);
      line(buffer, matrix, minX, minY, minZ, minX, minY, maxZ, color, alpha);
      line(buffer, matrix, maxX, maxY, maxZ, minX, maxY, maxZ, color, alpha);
      line(buffer, matrix, maxX, maxY, maxZ, maxX, minY, maxZ, color, alpha);
      line(buffer, matrix, maxX, maxY, maxZ, maxX, maxY, minZ, color, alpha);
      line(buffer, matrix, minX, maxY, minZ, maxX, maxY, minZ, color, alpha);
      line(buffer, matrix, maxX, minY, minZ, maxX, minY, maxZ, color, alpha);
      line(buffer, matrix, minX, minY, maxZ, maxX, minY, maxZ, color, alpha);
      line(buffer, matrix, minX, maxY, maxZ, minX, maxY, minZ, color, alpha);
      line(buffer, matrix, minX, maxY, maxZ, minX, minY, maxZ, color, alpha);
      line(buffer, matrix, maxX, maxY, minZ, maxX, minY, minZ, color, alpha);
   }

   private static void addBoxQuads(BufferBuilder buffer, Matrix4f matrix, Box box, Color color, float alpha) {
      float minX = (float)box.minX;
      float minY = (float)box.minY;
      float minZ = (float)box.minZ;
      float maxX = (float)box.maxX;
      float maxY = (float)box.maxY;
      float maxZ = (float)box.maxZ;

      quad(buffer, matrix, color, alpha, minX, minY, maxZ, maxX, minY, maxZ, maxX, maxY, maxZ, minX, maxY, maxZ);
      quad(buffer, matrix, color, alpha, minX, maxY, minZ, maxX, maxY, minZ, maxX, minY, minZ, minX, minY, minZ);
      quad(buffer, matrix, color, alpha, minX, minY, minZ, minX, minY, maxZ, minX, maxY, maxZ, minX, maxY, minZ);
      quad(buffer, matrix, color, alpha, maxX, maxY, minZ, maxX, maxY, maxZ, maxX, minY, maxZ, maxX, minY, minZ);
      quad(buffer, matrix, color, alpha, minX, maxY, minZ, minX, maxY, maxZ, maxX, maxY, maxZ, maxX, maxY, minZ);
      quad(buffer, matrix, color, alpha, maxX, minY, minZ, maxX, minY, maxZ, minX, minY, maxZ, minX, minY, minZ);
   }

   private void addShaderBoxQuads(BufferBuilder buffer, Matrix4f matrix, Box box, float alpha) {
      float minX = (float)box.minX;
      float minY = (float)box.minY;
      float minZ = (float)box.minZ;
      float maxX = (float)box.maxX;
      float maxY = (float)box.maxY;
      float maxZ = (float)box.maxZ;

      shaderQuad(buffer, matrix, alpha, minX, minY, maxZ, maxX, minY, maxZ, maxX, maxY, maxZ, minX, maxY, maxZ);
      shaderQuad(buffer, matrix, alpha, minX, maxY, minZ, maxX, maxY, minZ, maxX, minY, minZ, minX, minY, minZ);
      shaderQuad(buffer, matrix, alpha, minX, minY, minZ, minX, minY, maxZ, minX, maxY, maxZ, minX, maxY, minZ);
      shaderQuad(buffer, matrix, alpha, maxX, maxY, minZ, maxX, maxY, maxZ, maxX, minY, maxZ, maxX, minY, minZ);
      shaderQuad(buffer, matrix, alpha, minX, maxY, minZ, minX, maxY, maxZ, maxX, maxY, maxZ, maxX, maxY, minZ);
      shaderQuad(buffer, matrix, alpha, maxX, minY, minZ, maxX, minY, maxZ, minX, minY, maxZ, minX, minY, minZ);
   }

   private static void line(
      BufferBuilder buffer,
      Matrix4f matrix,
      float x1,
      float y1,
      float z1,
      float x2,
      float y2,
      float z2,
      Color color,
      float alpha
   ) {
      vertex(buffer, matrix, x1, y1, z1, color, alpha);
      vertex(buffer, matrix, x2, y2, z2, color, alpha);
   }

   private static void quad(
      BufferBuilder buffer,
      Matrix4f matrix,
      Color color,
      float alpha,
      float x1,
      float y1,
      float z1,
      float x2,
      float y2,
      float z2,
      float x3,
      float y3,
      float z3,
      float x4,
      float y4,
      float z4
   ) {
      vertex(buffer, matrix, x1, y1, z1, color, alpha);
      vertex(buffer, matrix, x2, y2, z2, color, alpha);
      vertex(buffer, matrix, x3, y3, z3, color, alpha);
      vertex(buffer, matrix, x4, y4, z4, color, alpha);
   }

   private void shaderQuad(
      BufferBuilder buffer,
      Matrix4f matrix,
      float alpha,
      float x1,
      float y1,
      float z1,
      float x2,
      float y2,
      float z2,
      float x3,
      float y3,
      float z3,
      float x4,
      float y4,
      float z4
   ) {
      vertex(buffer, matrix, x1, y1, z1, this.shaderColor(x1, y1, z1, alpha), alpha);
      vertex(buffer, matrix, x2, y2, z2, this.shaderColor(x2, y2, z2, alpha), alpha);
      vertex(buffer, matrix, x3, y3, z3, this.shaderColor(x3, y3, z3, alpha), alpha);
      vertex(buffer, matrix, x4, y4, z4, this.shaderColor(x4, y4, z4, alpha), alpha);
   }

   private static void vertex(BufferBuilder buffer, Matrix4f matrix, float x, float y, float z, Color color, float alpha) {
      float red = color.getRed() / 255.0F;
      float green = color.getGreen() / 255.0F;
      float blue = color.getBlue() / 255.0F;
      float combinedAlpha = (color.getAlpha() / 255.0F) * alpha;
      buffer.vertex(matrix, x, y, z).color(red, green, blue, combinedAlpha);
   }

   private static Color withAlpha(Color color, float alpha) {
      return new Color(color.getRed(), color.getGreen(), color.getBlue(), Math.round(alpha * 255.0F));
   }

   private static float wrap(float value) {
      float wrapped = value % 1.0F;
      return wrapped < 0.0F ? wrapped + 1.0F : wrapped;
   }
}
