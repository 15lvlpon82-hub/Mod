package ru.pulse.mixin;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import pulse.EventBusService;
import pulse.CriticalHitEvent;

@Mixin(PlayerEntity.class)
public class PlayerEntityMixin {
   @Inject(
      method = "attack",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/player/PlayerEntity;addCritParticles(Lnet/minecraft/entity/Entity;)V")
   )
   private void onCriticalHit(Entity var1, CallbackInfo var2) {
      EventBusService.EVENT_BUS.post(new CriticalHitEvent(var1));
   }
}
