package ru.pulse.mixin;


import pulse.module.ModuleRegistry;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.option.Perspective;
import net.minecraft.client.render.Camera;
import net.minecraft.entity.Entity;
import net.minecraft.world.BlockView;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import pulse.FreeLook;
import pulse.PerspectiveDistanceAnimation;
import pulse.Animations;

@Mixin(Camera.class)
public abstract class CameraMixin {
   @Shadow
   protected abstract void setRotation(float var1, float var2);

   @Inject(method = "update", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/render/Camera;setRotation(FF)V", ordinal = 0, shift = Shift.AFTER))
   public void onUpdate(BlockView var1, Entity var2, boolean var3, boolean var4, float var5, CallbackInfo var6) {
      if (FreeLook.active && var2 instanceof ClientPlayerEntity) {
         this.setRotation(FreeLook.cameraYaw, FreeLook.cameraPitch);
      }
   }

   @Unique
   private boolean isPerspectiveAnimationEnabled() {
      return ModuleRegistry.ANIMATIONS != null && ModuleRegistry.ANIMATIONS.k() && ModuleRegistry.ANIMATIONS.i.a();
   }

   @Inject(method = "update", at = @At("HEAD"))
   private void onUpdateHead(BlockView var1, Entity var2, boolean var3, boolean var4, float var5, CallbackInfo var6) {
      if (this.isPerspectiveAnimationEnabled()) {
         PerspectiveDistanceAnimation var7 = Animations.q();
         var7.a(var3, (long)(ModuleRegistry.ANIMATIONS.j.k() * 1.5F));
         var7.a();
      }
   }

   @ModifyArg(method = "update", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/render/Camera;clipToSpace(F)F"), index = 0)
   private float modifyCameraDistance(float var1) {
      if (this.isPerspectiveAnimationEnabled()) {
         MinecraftClient var2 = MinecraftClient.getInstance();
         if (var2.options.getPerspective() != Perspective.FIRST_PERSON) {
            return Animations.q().b();
         }
      }

      return var1;
   }
}
