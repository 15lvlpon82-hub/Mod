package pulse;

import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import java.util.Optional;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat.DrawMode;
import net.minecraft.client.util.Window;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import org.joml.Matrix4f;
import org.lwjgl.opengl.GL11;

public class Renderer2DImpl implements Renderer2D {
   private final ScissorStack a = new ScissorStack(this);

   @Override
   public void a(float var1, float var2, float var3, float var4, float var5, Color var6, MatrixStack var7) {
      Window var8 = MinecraftClient.getInstance().getWindow();
      Optional var9 = ShaderLibrary.getRegistry().find("round_rect");
      if (var9.isPresent()) {
         PulseShaderProgram var10 = (PulseShaderProgram)var9.get();
         var10.d();
         var10.a("location", var1 * ScreenScale.d(), var8.getHeight() - var4 * ScreenScale.d() - var2 * ScreenScale.d());
         var10.a("rectSize", var3 * ScreenScale.d(), var4 * ScreenScale.d());
         var10.a("radius", var5);
         var10.a("color", var6);
         BlendRenderScope.runBlended(() -> this.a((double)var1, (double)var2, (double)var3, (double)var4));
         var10.e();
      }
   }

   @Override
   public void a(float var1, float var2, float var3, float var4, MatrixStack var5) {
      Tessellator var6 = Tessellator.getInstance();
      BufferBuilder var7 = var6.begin(DrawMode.QUADS, VertexFormats.POSITION_TEXTURE);
      var7.vertex(var1, var2, 0.0F).texture(0.0F, 0.0F);
      var7.vertex(var1, var2 + var4, 0.0F).texture(0.0F, 1.0F);
      var7.vertex(var1 + var3, var2 + var4, 0.0F).texture(1.0F, 1.0F);
      var7.vertex(var1 + var3, var2, 0.0F).texture(1.0F, 0.0F);
      BufferRenderer.drawWithGlobalProgram(var7.end());
   }

   @Override
   public Window a() {
      return MinecraftClient.getInstance().getWindow();
   }

   @Override
   public void b(float var1, float var2, float var3, float var4, float var5, float var6, Color var7, MatrixStack var8) {
      Window var9 = MinecraftClient.getInstance().getWindow();
      Optional var10 = ShaderLibrary.getRegistry().find("round_rect_outline");
      if (var10.isPresent()) {
         PulseShaderProgram var11 = (PulseShaderProgram)var10.get();
         var11.d();
         var11.a("location", var1 * ScreenScale.d(), var9.getHeight() - var4 * ScreenScale.d() - var2 * ScreenScale.d());
         var11.a("rectSize", var3 * ScreenScale.d(), var4 * ScreenScale.d());
         var11.a("radius", var5);
         var11.a("thickness", var6);
         var11.a("color", new Color(0, 0, 0, 0));
         var11.a("outlineColor", var7);
         BlendRenderScope.runBlended(() -> this.a((double)(var1 - var6), (double)(var2 - (1.0F + var6)), (double)(var3 + var6 * 2.0F), (double)(var4 + (2.0F + var6 * 2.0F))));
         var11.e();
      }
   }

   private void a(double var1, double var3, double var5, double var7) {
      PulseShaderProgram.a((float)var1, (float)var3, (float)var5, (float)var7);
   }

   @Override
   public void a(int var1, float var2, float var3, float var4, float var5, Color var6, MatrixStack var7) {
      GlStateManager._bindTexture(var1);
      RenderSystem.setShaderTexture(0, var1);
      RenderSystem.setShader(ShaderProgramKeys.POSITION_TEX_COLOR);
      BlendRenderScope.runBlended(
         () -> {
            Matrix4f var6x = var7.peek().getPositionMatrix();
            Tessellator var7x = Tessellator.getInstance();
            BufferBuilder var8 = var7x.begin(DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
            var8.vertex(var6x, var2, var3, 0.0F).texture(0.0F, 1.0F).color(var6.getRed(), var6.getGreen(), var6.getBlue(), var6.getAlpha());
            var8.vertex(var6x, var2, var3 + var5, 0.0F)
               .texture(0.0F, 0.0F)
               .color(var6.getRed(), var6.getGreen(), var6.getBlue(), var6.getAlpha());
            var8.vertex(var6x, var2 + var4, var3 + var5, 0.0F)
               .texture(1.0F, 0.0F)
               .color(var6.getRed(), var6.getGreen(), var6.getBlue(), var6.getAlpha());
            var8.vertex(var6x, var2 + var4, var3, 0.0F)
               .texture(1.0F, 1.0F)
               .color(var6.getRed(), var6.getGreen(), var6.getBlue(), var6.getAlpha());
            BufferRenderer.drawWithGlobalProgram(var8.end());
         }
      );
      GlStateManager._bindTexture(0);
   }

   @Override
   public void a(Identifier var1, float var2, float var3, float var4, float var5, Color var6, MatrixStack var7) {
      this.a(MinecraftClient.getInstance().getTextureManager().getTexture(var1).getGlId(), var2, var3, var4, var5, var6, var7);
   }

   @Override
   public void a(float var1, float var2, float var3, Color var4, MatrixStack var5) {
      Window var6 = MinecraftClient.getInstance().getWindow();
      Optional var7 = ShaderLibrary.getRegistry().find("drop_shadow");
      if (var7.isPresent()) {
         PulseShaderProgram var8 = (PulseShaderProgram)var7.get();
         var8.d();
         float var9 = var3 * 2.0F * ScreenScale.d();
         var1 -= var3;
         var2 -= var3;
         var8.a("location", var1 * ScreenScale.d(), var6.getHeight() - var9 * ScreenScale.d() - var2 * ScreenScale.d());
         var8.a("rectSize", var9 * ScreenScale.d(), var9 * ScreenScale.d());
         var8.a("radius", var9);
         var8.a("shadowColor", var4);
         float var10 = var1;
         float var11 = var2;
         BlendRenderScope.runBlended(() -> this.a((double)var10, (double)var11, (double)var9, (double)var9));
         var8.e();
      }
   }

   @Override
   public void a(float var1, float var2, float var3, float var4, float var5, float var6, Color var7, MatrixStack var8) {
      Window var9 = MinecraftClient.getInstance().getWindow();
      Optional var10 = ShaderLibrary.getRegistry().find("rect_glow");
      if (var10.isPresent()) {
         PulseShaderProgram var11 = (PulseShaderProgram)var10.get();
         var11.d();
         float var12 = ScreenScale.d();
         float var13 = var1 - var5;
         float var14 = var2 - var5;
         float var15 = var3 + var5 * 2.0F;
         float var16 = var4 + var5 * 2.0F;
         var11.a("location", var13 * var12, var9.getHeight() - var16 * var12 - var14 * var12);
         var11.a("rectSize", var15 * var12, var16 * var12);
         var11.a("glowRadius", var5 * var12);
         var11.a("cornerRadius", var6 * var12);
         var11.a("glowColor", var7);
         BlendRenderScope.runBlended(() -> this.a((double)var13, (double)var14, (double)var15, (double)var16));
         var11.e();
      }
   }

   @Override
   public void a(
      Identifier var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      Color var11,
      MatrixStack var12
   ) {
      Window var13 = MinecraftClient.getInstance().getWindow();
      Optional var14 = ShaderLibrary.getRegistry().find("round_texture");
      if (var14.isPresent()) {
         PulseShaderProgram var15 = (PulseShaderProgram)var14.get();
         int var16 = MinecraftClient.getInstance().getTextureManager().getTexture(var1).getGlId();
         GlStateManager._activeTexture(33984);
         GlStateManager._bindTexture(var16);
         var15.d();
         var15.a("location", var2 * ScreenScale.d(), var13.getHeight() - var5 * ScreenScale.d() - var3 * ScreenScale.d());
         var15.a("rectSize", var4 * ScreenScale.d(), var5 * ScreenScale.d());
         var15.a("radius", var6);
         var15.b("tex", 0);
         var15.a("u", var7);
         var15.a("v", var8);
         var15.a("w", var9);
         var15.a("h", var10);
         var15.a("tintColor", var11);
         BlendRenderScope.runBlended(() -> this.a((double)var2, (double)var3, (double)var4, (double)var5));
         var15.e();
      }
   }

   @Override
   public void b(float var1, float var2, float var3, float var4, MatrixStack var5) {
      Window var6 = MinecraftClient.getInstance().getWindow();
      float var7 = ScreenScale.d();
      int var8 = (int)(var1 * var7);
      int var9 = (int)(var6.getFramebufferHeight() - (var2 + var4) * var7);
      int var10 = (int)(var3 * var7);
      int var11 = (int)(var4 * var7);
      GL11.glEnable(3089);
      GL11.glScissor(var8, var9, var10, var11);
   }

   @Override
   public void a(float var1, float var2, float var3, float var4, float var5, MatrixStack var6) {
      this.b(var1, var2, var3, var4, var6);
   }

   @Override
   public void a(MatrixStack var1) {
      GL11.glDisable(3089);
   }

   @Override
   public ScissorStack b() {
      return this.a;
   }

   @Override
   public void a(
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      Color var9,
      Color var10,
      Color var11,
      Color var12,
      MatrixStack var13
   ) {
      Window var14 = MinecraftClient.getInstance().getWindow();
      Optional var15 = ShaderLibrary.getRegistry().find("gradient");
      if (var15.isPresent()) {
         PulseShaderProgram var16 = (PulseShaderProgram)var15.get();
         var16.d();
         float var17 = ScreenScale.d();
         var16.a("location", var1 * var17, var14.getHeight() - var4 * var17 - var2 * var17);
         var16.a("rectSize", var3 * var17, var4 * var17);
         var16.a("radii", var5 * var17, var6 * var17, var7 * var17, var8 * var17);
         var16.a("topLeftColor", var9);
         var16.a("topRightColor", var10);
         var16.a("bottomLeftColor", var11);
         var16.a("bottomRightColor", var12);
         BlendRenderScope.runBlended(() -> this.a((double)var1, (double)var2, (double)var3, (double)var4));
         var16.e();
      }
   }

   @Override
   public void a(float var1, float var2, float var3, float var4, float var5, float var6, MatrixStack var7) {
      Window var8 = MinecraftClient.getInstance().getWindow();
      Optional var9 = ShaderLibrary.getRegistry().find("hue_bar");
      if (var9.isPresent()) {
         PulseShaderProgram var10 = (PulseShaderProgram)var9.get();
         var10.d();
         var10.a("location", var1 * ScreenScale.d(), var8.getHeight() - var4 * ScreenScale.d() - var2 * ScreenScale.d());
         var10.a("rectSize", var3 * ScreenScale.d(), var4 * ScreenScale.d());
         var10.a("radius", var5 * ScreenScale.d());
         BlendRenderScope.runBlended(() -> this.a((double)var1, (double)var2, (double)var3, (double)var4));
         var10.e();
      }
   }

   @Override
   public void c(float var1, float var2, float var3, float var4, MatrixStack var5) {
      FramebufferCapture.begin(var1, var2, var3, var4);
   }

   @Override
   public void a(float var1, MatrixStack var2) {
      FramebufferCapture.end(this, var1, var2);
   }
}
