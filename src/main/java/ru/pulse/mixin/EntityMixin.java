package ru.pulse.mixin;


import pulse.module.ModuleRegistry;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import pulse.FreeLook;
import pulse.RenderTweaks;

@Mixin(Entity.class)
public abstract class EntityMixin {
   @Shadow
   private boolean glowing;

   @Inject(method = "changeLookDirection", at = @At("HEAD"), cancellable = true)
   public void changeLookDirection(double var1, double var3, CallbackInfo var5) {
      if (FreeLook.active && (Object)this instanceof ClientPlayerEntity) {
         float var6 = (float)(var1 * 0.15);
         float var7 = (float)(var3 * 0.15);
         FreeLook.cameraYaw += var6;
         FreeLook.cameraPitch = MathHelper.clamp(FreeLook.cameraPitch + var7, -90.0F, 90.0F);
         var5.cancel();
      }
   }

   @Shadow
   public abstract boolean isGlowing();

   @Inject(method = "isGlowing", at = @At("HEAD"), cancellable = true)
   private void onIsGlowing(CallbackInfoReturnable<Boolean> var1) {
      RenderTweaks var2 = ModuleRegistry.RENDER_TWEAKS;
      if (var2.v()) {
         var1.setReturnValue(false);
      }
   }
}
