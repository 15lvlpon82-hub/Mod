package ru.pulse.mixin;


import pulse.module.ModuleRegistry;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectUtil;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.registry.entry.RegistryEntry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import pulse.EventBusService;
import pulse.EntityJumpEvent;
import pulse.PlayerDeathEvent;
import pulse.CustomHand;
import pulse.RenderTweaks;

@Mixin(LivingEntity.class)
public class LivingEntityMixin {
   @Overwrite
   private int getHandSwingDuration() {
      LivingEntity var1 = (LivingEntity)(Object)this;
      if (StatusEffectUtil.hasHaste(var1)) {
         return 6 - (1 + StatusEffectUtil.getHasteAmplifier(var1));
      } else {
         CustomHand var2 = ModuleRegistry.CUSTOM_HAND;
         if (var2 != null && var2.k()) {
            int var3 = var2.animationSpeed.b();
            return var1.hasStatusEffect(StatusEffects.MINING_FATIGUE) ? var3 + (1 + var1.getStatusEffect(StatusEffects.MINING_FATIGUE).getAmplifier()) * 2 : var3;
         } else {
            return var1.hasStatusEffect(StatusEffects.MINING_FATIGUE) ? 6 + (1 + var1.getStatusEffect(StatusEffects.MINING_FATIGUE).getAmplifier()) * 2 : 6;
         }
      }
   }

   @Inject(method = "jump", at = @At("HEAD"))
   private void onJump(CallbackInfo var1) {
      LivingEntity var2 = (LivingEntity)(Object)this;
      EventBusService.EVENT_BUS.post(new EntityJumpEvent(var2));
   }

   @Inject(method = "handleStatus", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/LivingEntity;getDeathSound()Lnet/minecraft/sound/SoundEvent;"))
   public void handleStatus(byte var1, CallbackInfo var2) {
      LivingEntity var3 = (LivingEntity)(Object)this;
      if (var3 instanceof ClientPlayerEntity var4) {
         PlayerDeathEvent var5 = new PlayerDeathEvent(var4, var4.getX(), var4.getY(), var4.getZ());
         EventBusService.EVENT_BUS.post(var5);
      }
   }

   @Inject(method = "hasStatusEffect", at = @At("HEAD"), cancellable = true)
   private void onHasStatusEffect(RegistryEntry<StatusEffect> var1, CallbackInfoReturnable<Boolean> var2) {
      if ((Object)this instanceof ClientPlayerEntity) {
         RenderTweaks var3 = ModuleRegistry.RENDER_TWEAKS;
         if (var3 != null && var1 == StatusEffects.WITHER && var3.t()) {
            var2.setReturnValue(false);
         }
      }
   }
}
