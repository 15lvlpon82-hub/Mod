package ru.pulse.mixin;


import pulse.module.ModuleRegistry;
import net.minecraft.client.render.LightmapTextureManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import pulse.FullBright;

@Mixin(LightmapTextureManager.class)
public class LightmapTextureManagerMixin {
   @Inject(method = "getDarknessFactor", at = @At("HEAD"), cancellable = true)
   private void getDarknessFactor(float var1, CallbackInfoReturnable<Float> var2) {
      FullBright var3 = ModuleRegistry.FULL_BRIGHT;
      if (var3.k()) {
         var2.setReturnValue(0.0F);
      }
   }

   @Inject(method = "getBrightness(Lnet/minecraft/world/dimension/DimensionType;I)F", at = @At("HEAD"), cancellable = true)
   private static void onGetBrightness(CallbackInfoReturnable<Float> var0) {
      FullBright var1 = ModuleRegistry.FULL_BRIGHT;
      if (var1.k()) {
         var0.setReturnValue(1.0F);
      }
   }

   @Inject(method = "getBrightness(FI)F", at = @At("HEAD"), cancellable = true)
   private static void onGetBrightnessAmbient(CallbackInfoReturnable<Float> var0) {
      FullBright var1 = ModuleRegistry.FULL_BRIGHT;
      if (var1.k()) {
         var0.setReturnValue(1.0F);
      }
   }
}
