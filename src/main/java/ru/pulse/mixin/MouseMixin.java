package ru.pulse.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.Mouse;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;
import pulse.EventBusService;
import pulse.KeyInputEvent;
import pulse.MouseButtonEvent;
import pulse.MouseScrollEvent;

@Mixin(Mouse.class)
public class MouseMixin {
   @Shadow
   @Final
   private MinecraftClient client;

   @Inject(method = "onMouseButton", at = @At("HEAD"), cancellable = true)
   private void onMouseButton(long var1, int var3, int var4, int var5, CallbackInfo var6) {
      if (var1 == this.client.getWindow().getHandle()) {
         double var7 = this.client.mouse.getX() * this.client.getWindow().getScaledWidth() / this.client.getWindow().getWidth();
         double var9 = this.client.mouse.getY() * this.client.getWindow().getScaledHeight() / this.client.getWindow().getHeight();
         MouseButtonEvent var11 = new MouseButtonEvent(var3, var4, var5, var7, var9);
         EventBusService.EVENT_BUS.post(var11);
         if (var11.c()) {
            var6.cancel();
         }
      }
   }

   @Inject(method = "onMouseScroll", at = @At("HEAD"), cancellable = true)
   private void onMouseScroll(long var1, double var3, double var5, CallbackInfo var7) {
      if (var1 == this.client.getWindow().getHandle()) {
         MouseScrollEvent var8 = new MouseScrollEvent(var3, var5);
         EventBusService.EVENT_BUS.post(var8);
         if (var8.c()) {
            var7.cancel();
         }
      }
   }

   @Inject(method = "onMouseButton", at = @At("TAIL"), locals = LocalCapture.CAPTURE_FAILSOFT)
   private void onMouseButton1(long var1, int var3, int var4, int var5, CallbackInfo var6) {
      if (var3 > 1) {
         EventBusService.EVENT_BUS.post(new KeyInputEvent(1450 + var3, 0, var4, var5));
      }
   }
}
