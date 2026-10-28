package pulse;

import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.platform.GlStateManager.DstFactor;
import com.mojang.blaze3d.platform.GlStateManager.SrcFactor;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gl.Framebuffer;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.client.gl.SimpleFramebuffer;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat.DrawMode;
import net.minecraft.client.util.math.MatrixStack;
import org.lwjgl.opengl.GL14;

public class FramebufferCapture {
   private static final MinecraftClient a = MinecraftClient.getInstance();
   private static Framebuffer b = null;
   private static int c = 0;
   private static int d = 0;
   private static boolean e = false;
   private static float f = 0.0F;
   private static float g = 0.0F;
   private static float h = 0.0F;
   private static float i = 0.0F;

   public static void begin(float var0, float var1, float var2, float var3) {
      if (!e) {
         int var4 = a.getWindow().getFramebufferWidth();
         int var5 = a.getWindow().getFramebufferHeight();
         if (b == null || c != var4 || d != var5) {
            if (b != null) {
               b.delete();
            }

            b = new SimpleFramebuffer(var4, var5, true);
            b.setClearColor(0.0F, 0.0F, 0.0F, 0.0F);
            c = var4;
            d = var5;
         }

         f = var0;
         g = var1;
         h = var2;
         i = var3;
         b.clear();
         b.beginWrite(true);
         e = true;
      }
   }

   public static void end(Renderer2D var0, float var1, MatrixStack var2) {
      if (e) {
         e = false;
         a.getFramebuffer().beginWrite(true);
         if (var1 > 0.001F) {
            drawCaptured(var1);
         }
      }
   }

   public static boolean isCapturing() {
      return e;
   }

   public static void applyBlendState() {
      if (e) {
         GL14.glBlendFuncSeparate(770, 771, 1, 771);
      } else {
         RenderSystem.defaultBlendFunc();
      }
   }

   private static void drawCaptured(float var0) {
      if (b != null) {
         RenderSystem.enableBlend();
         RenderSystem.blendFuncSeparate(SrcFactor.ONE, DstFactor.ONE_MINUS_SRC_ALPHA, SrcFactor.ONE, DstFactor.ONE_MINUS_SRC_ALPHA);
         GlStateManager._bindTexture(b.getColorAttachment());
         RenderSystem.setShaderTexture(0, b.getColorAttachment());
         RenderSystem.setShader(ShaderProgramKeys.POSITION_TEX_COLOR);
         RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
         float var1 = ScreenScale.d();
         float var2 = a.getWindow().getFramebufferWidth();
         float var3 = a.getWindow().getFramebufferHeight();
         float var4 = f * var1 / var2;
         float var5 = 1.0F - (g + i) * var1 / var3;
         float var6 = (f + h) * var1 / var2;
         float var7 = 1.0F - g * var1 / var3;
         int var8 = (int)(var0 * 255.0F);
         Tessellator var9 = Tessellator.getInstance();
         BufferBuilder var10 = var9.begin(DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
         var10.vertex(f, g, 0.0F).texture(var4, var7).color(var8, var8, var8, var8);
         var10.vertex(f, g + i, 0.0F).texture(var4, var5).color(var8, var8, var8, var8);
         var10.vertex(f + h, g + i, 0.0F).texture(var6, var5).color(var8, var8, var8, var8);
         var10.vertex(f + h, g, 0.0F).texture(var6, var7).color(var8, var8, var8, var8);
         BufferRenderer.drawWithGlobalProgram(var10.end());
         GlStateManager._bindTexture(0);
         RenderSystem.defaultBlendFunc();
      }
   }

   public static void dispose() {
      if (b != null) {
         b.delete();
         b = null;
      }

      c = 0;
      d = 0;
      e = false;
   }
}
