package ru.pulse.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gl.Framebuffer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import pulse.CustomHandShaderCapture;

@Mixin(Framebuffer.class)
public class FramebufferMixin {
   @Inject(method = "beginWrite", at = @At("HEAD"), cancellable = true)
   private void redirectToHandFramebuffer(boolean var1, CallbackInfo var2) {
      if (!CustomHandShaderCapture.guiOpen()) {
         if (CustomHandShaderCapture.isActive()) {
            MinecraftClient var3 = MinecraftClient.getInstance();
            if (var3 != null) {
               Framebuffer var4 = var3.getFramebuffer();
               if (var4 != null) {
                  if ((Object)this == var4) {
                     Framebuffer var5 = CustomHandShaderCapture.getFramebuffer();
                     if (var5 != null && var5 != var4) {
                        var5.beginWrite(var1);
                        var2.cancel();
                     }
                  }
               }
            }
         }
      }
   }
}
