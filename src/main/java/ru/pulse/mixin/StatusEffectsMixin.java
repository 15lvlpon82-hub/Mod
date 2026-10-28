package ru.pulse.mixin;


import pulse.module.ModuleRegistry;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.registry.entry.RegistryEntry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import pulse.RenderTweaks;

@Mixin(LivingEntity.class)
public class StatusEffectsMixin {
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
