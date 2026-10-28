package pulse;

import com.mojang.blaze3d.systems.RenderSystem;

public final class BlendRenderScope {
   private BlendRenderScope() {
   }

   public static void runBlended(Runnable action) {
      RenderSystem.enableBlend();
      FramebufferCapture.applyBlendState();
      action.run();
      RenderSystem.disableBlend();
   }
}
