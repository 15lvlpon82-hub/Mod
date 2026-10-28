package ru.pulse.mixin;


import pulse.module.ModuleRegistry;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import pulse.RenderTweaks;

@Mixin(World.class)
public class WorldMixin {
   @Inject(method = "isRaining", at = @At("HEAD"), cancellable = true)
   private void onIsRaining(CallbackInfoReturnable<Boolean> var1) {
      RenderTweaks var2 = ModuleRegistry.RENDER_TWEAKS;
      if (var2 != null && var2.n()) {
         var1.setReturnValue(false);
      }
   }

   @Inject(method = "isThundering", at = @At("HEAD"), cancellable = true)
   private void onIsThundering(CallbackInfoReturnable<Boolean> var1) {
      RenderTweaks var2 = ModuleRegistry.RENDER_TWEAKS;
      if (var2 != null && var2.n()) {
         var1.setReturnValue(false);
      }
   }

   @Inject(method = "hasRain", at = @At("HEAD"), cancellable = true)
   private void onHasRain(BlockPos var1, CallbackInfoReturnable<Boolean> var2) {
      RenderTweaks var3 = ModuleRegistry.RENDER_TWEAKS;
      if (var3 != null && var3.n()) {
         var2.setReturnValue(false);
      }
   }

   @Inject(method = "getRainGradient", at = @At("HEAD"), cancellable = true)
   private void onGetRainGradient(float var1, CallbackInfoReturnable<Float> var2) {
      RenderTweaks var3 = ModuleRegistry.RENDER_TWEAKS;
      if (var3 != null && var3.n()) {
         var2.setReturnValue(0.0F);
      }
   }

   @Inject(method = "getThunderGradient", at = @At("HEAD"), cancellable = true)
   private void onGetThunderGradient(float var1, CallbackInfoReturnable<Float> var2) {
      RenderTweaks var3 = ModuleRegistry.RENDER_TWEAKS;
      if (var3 != null && var3.n()) {
         var2.setReturnValue(0.0F);
      }
   }
}
