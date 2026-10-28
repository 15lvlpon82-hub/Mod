package pulse;


import pulse.module.ModuleRegistry;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.ProjectionType;
import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import java.util.Optional;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gl.Framebuffer;
import net.minecraft.client.gl.SimpleFramebuffer;
import org.joml.Matrix4f;
import org.lwjgl.opengl.GL30;

public final class CustomHandShaderCapture {
   private static final MinecraftClient a = MinecraftClient.getInstance();
   private static Framebuffer b = null;
   private static int c = 0;
   private static int d = 0;
   private static boolean e = false;

   private CustomHandShaderCapture() {
   }

   public static void beginCapture() {
      if (!guiOpen()) {
         if (!e) {
            CustomHand var0 = ModuleRegistry.CUSTOM_HAND;
            if (var0 != null && var0.k() && var0.shaderEnabled.a()) {
               int var1 = a.getWindow().getFramebufferWidth();
               int var2 = a.getWindow().getFramebufferHeight();
               if (b == null || c != var1 || d != var2) {
                  if (b != null) {
                     b.delete();
                  }

                  b = new SimpleFramebuffer(var1, var2, true);
                  b.setClearColor(0.0F, 0.0F, 0.0F, 0.0F);
                  c = var1;
                  d = var2;
               }

               GL30.glBindFramebuffer(36008, a.getFramebuffer().fbo);
               GL30.glBindFramebuffer(36009, b.fbo);
               GL30.glBlitFramebuffer(0, 0, var1, var2, 0, 0, var1, var2, 256, 9728);
               b.beginWrite(false);
               RenderSystem.clearColor(0.0F, 0.0F, 0.0F, 0.0F);
               RenderSystem.clear(16384);
               e = true;
            }
         }
      }
   }

   public static void endCapture() {
      if (guiOpen()) {
         resetForGui();
      } else if (e && b != null) {
         e = false;
         a.getFramebuffer().beginWrite(true);
         CustomHand var0 = ModuleRegistry.CUSTOM_HAND;
         if (var0 != null && var0.k() && var0.shaderEnabled.a()) {
            a(var0);
         }
      }
   }

   private static void a(CustomHand var0) {
      Optional var1 = ShaderLibrary.getRegistry().find("hand_shader");
      if (!var1.isEmpty() && ((PulseShaderProgram)var1.get()).b()) {
         Color var2 = var0.handShaderColor();
         float var3 = (float)(System.currentTimeMillis() % 100000L) / 1000.0F * var0.shaderSpeed.a();
         float var4 = var0.shaderOpacity.a();
         int var5 = a.getWindow().getFramebufferWidth();
         int var6 = a.getWindow().getFramebufferHeight();
         Matrix4f var7 = new Matrix4f(RenderSystem.getProjectionMatrix());
         Matrix4f var8 = new Matrix4f().ortho(0.0F, var5, var6, 0.0F, -1.0F, 1.0F);
         RenderSystem.setProjectionMatrix(var8, ProjectionType.ORTHOGRAPHIC);
         RenderSystem.getModelViewStack().pushMatrix();
         RenderSystem.getModelViewStack().identity();
         RenderSystem.disableDepthTest();
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         GlStateManager._activeTexture(33984);
         GlStateManager._bindTexture(b.getColorAttachment());
         PulseShaderProgram var9 = (PulseShaderProgram)var1.get();
         var9.d();
         var9.a("time", var3);
         var9.a("screenSize", (float)var5, (float)var6);
         var9.a("baseColor", var2.getRed() / 255.0F, var2.getGreen() / 255.0F, var2.getBlue() / 255.0F, 1.0F);
         var9.a("alpha", var4);
         var9.b("handTexture", 0);
         var9.b("shaderMode", var0.shaderModeIndex());
         var9.b("shaderOnlyMode", var0.shaderOnly.a() ? 1 : 0);
         PulseShaderProgram.a(0.0F, 0.0F, var5, var6);
         var9.e();
         RenderSystem.getModelViewStack().popMatrix();
         RenderSystem.setProjectionMatrix(var7, ProjectionType.PERSPECTIVE);
         GlStateManager._bindTexture(0);
         RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
         RenderSystem.enableDepthTest();
         RenderSystem.defaultBlendFunc();
         RenderSystem.disableBlend();
      }
   }

   public static boolean isActive() {
      return guiOpen() ? false : e;
   }

   public static Framebuffer getFramebuffer() {
      return b;
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

   public static boolean guiOpen() {
      try {
         Object var0 = Class.forName("net.minecraft.client.MinecraftClient").getMethod("getInstance").invoke(null);
         return var0 != null && var0.getClass().getField("currentScreen").get(var0) != null;
      } catch (Throwable var2) {
         return false;
      }
   }

   public static void resetForGui() {
      try {
         if (!e) {
            return;
         }

         e = false;
         Object var0 = Class.forName("net.minecraft.client.MinecraftClient").getMethod("getInstance").invoke(null);
         if (var0 == null) {
            return;
         }

         Object var1 = var0.getClass().getMethod("getFramebuffer").invoke(var0);
         if (var1 != null) {
            var1.getClass().getMethod("beginWrite", boolean.class).invoke(var1, Boolean.TRUE);
         }

         Class var2 = Class.forName("com.mojang.blaze3d.systems.RenderSystem");
         var2.getMethod("setShaderColor", float.class, float.class, float.class, float.class).invoke(null, 1.0F, 1.0F, 1.0F, 1.0F);
         var2.getMethod("enableDepthTest").invoke(null);
         var2.getMethod("disableBlend").invoke(null);
      } catch (Throwable var4) {
      }
   }

   public static void beginGuiRender() {
      try {
         resetForGui();
         Class var0 = Class.forName("com.mojang.blaze3d.systems.RenderSystem");
         var0.getMethod("enableBlend").invoke(null);
         var0.getMethod("defaultBlendFunc").invoke(null);
         var0.getMethod("disableDepthTest").invoke(null);
         var0.getMethod("setShaderColor", float.class, float.class, float.class, float.class).invoke(null, 1.0F, 1.0F, 1.0F, 1.0F);
      } catch (Throwable var2) {
      }
   }

   public static void endGuiRender() {
      try {
         Class var0 = Class.forName("com.mojang.blaze3d.systems.RenderSystem");
         var0.getMethod("enableDepthTest").invoke(null);
         var0.getMethod("setShaderColor", float.class, float.class, float.class, float.class).invoke(null, 1.0F, 1.0F, 1.0F, 1.0F);
      } catch (Throwable var2) {
      }
   }
}
