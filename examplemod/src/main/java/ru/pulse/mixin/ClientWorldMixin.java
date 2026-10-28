package ru.pulse.mixin;


import pulse.module.ModuleRegistry;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.util.math.ColorHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.dimension.DimensionType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import pulse.RenderTweaks;
import pulse.TimeChanger;
import pulse.WorldCustomizer;

@Mixin(ClientWorld.class)
public abstract class ClientWorldMixin {
   @Inject(method = "getSkyColor", at = @At("HEAD"), cancellable = true)
   private void onGetSkyColor(Vec3d var1, float var2, CallbackInfoReturnable<Integer> var3) {
      WorldCustomizer var4 = ModuleRegistry.WORLD_CUSTOMIZER;
      if (var4 != null && var4.r()) {
         var3.setReturnValue(var4.t());
      } else {
         RenderTweaks var5 = ModuleRegistry.RENDER_TWEAKS;
         if (var5 != null && var5.n()) {
            ClientWorld var6 = (ClientWorld)(Object)this;
            float var7 = var6.getSkyAngle(var2);
            float var8 = (float)(1.0 - Math.cos(var7 * Math.PI * 2.0) * 2.0 + 0.5);
            var8 = Math.max(0.0F, Math.min(1.0F, var8));
            float var9 = 0.7529412F * var8;
            float var10 = 0.84705883F * var8;
            float var11 = 1.0F * var8;
            int var12 = ColorHelper.fromFloats(1.0F, var9, var10, var11);
            var3.setReturnValue(var12);
         }
      }
   }

   @Inject(method = "getCloudsColor", at = @At("HEAD"), cancellable = true)
   private void onGetCloudsColor(float var1, CallbackInfoReturnable<Integer> var2) {
      RenderTweaks var3 = ModuleRegistry.RENDER_TWEAKS;
      if (var3.n()) {
         ClientWorld var4 = (ClientWorld)(Object)this;
         float var5 = var4.getSkyAngle(var1);
         float var6 = (float)(Math.cos(var5 * Math.PI * 2.0) * 2.0 + 0.5);
         var6 = Math.max(0.0F, Math.min(1.0F, var6));
         float var7 = var6 * 0.9F + 0.1F;
         int var8 = ColorHelper.fromFloats(1.0F, var7, var7, var7 * 0.85F + 0.15F);
         var2.setReturnValue(var8);
      }
   }

   @Inject(method = "getLightningTicksLeft", at = @At("HEAD"), cancellable = true)
   private void onGetLightningTicks(CallbackInfoReturnable<Integer> var1) {
      RenderTweaks var2 = ModuleRegistry.RENDER_TWEAKS;
      if (var2.n()) {
         var1.setReturnValue(0);
      }
   }

   @Inject(method = "getSkyBrightness", at = @At("HEAD"), cancellable = true)
   private void onGetSkyBrightness(float var1, CallbackInfoReturnable<Float> var2) {
      TimeChanger var3 = ModuleRegistry.TIME_CHANGER;
      if (var3 != null && var3.k()) {
         ClientWorld var4 = (ClientWorld)(Object)this;
         DimensionType var5 = var4.getDimension();
         long var6 = var3.n();
         float var8 = var5.getSkyAngle(var6);
         float var9 = 1.0F - (float)(Math.cos(var8 * Math.PI * 2.0) * 2.0 + 0.2);
         var9 = Math.max(0.0F, Math.min(1.0F, var9));
         var9 = 1.0F - var9;
         var9 *= 0.8F;
         var9 += 0.2F;
         var2.setReturnValue(var9);
      }
   }

   @Inject(method = "getStarBrightness", at = @At("HEAD"), cancellable = true)
   private void onGetStarBrightness(float var1, CallbackInfoReturnable<Float> var2) {
      TimeChanger var3 = ModuleRegistry.TIME_CHANGER;
      if (var3 != null && var3.k()) {
         ClientWorld var4 = (ClientWorld)(Object)this;
         DimensionType var5 = var4.getDimension();
         long var6 = var3.n();
         float var8 = var5.getSkyAngle(var6);
         float var9 = 1.0F - (float)(Math.cos(var8 * Math.PI * 2.0) * 2.0 + 0.25);
         var9 = Math.max(0.0F, Math.min(1.0F, var9));
         var2.setReturnValue(var9 * var9 * 0.5F);
      }
   }
}
