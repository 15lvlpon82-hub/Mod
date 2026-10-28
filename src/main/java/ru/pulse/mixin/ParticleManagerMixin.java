package ru.pulse.mixin;


import pulse.module.ModuleRegistry;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleManager;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleTypes;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import pulse.RenderTweaks;

@Mixin(ParticleManager.class)
public class ParticleManagerMixin {
   @Inject(method = "addParticle(Lnet/minecraft/particle/ParticleEffect;DDDDDD)Lnet/minecraft/client/particle/Particle;", at = @At("HEAD"), cancellable = true)
   private void onAddParticle(
      ParticleEffect var1, double var2, double var4, double var6, double var8, double var10, double var12, CallbackInfoReturnable<Particle> var14
   ) {
      RenderTweaks var15 = ModuleRegistry.RENDER_TWEAKS;
      if (var15 != null
         && var15.u()
         && (
            var1.getType() == ParticleTypes.BUBBLE
               || var1.getType() == ParticleTypes.BUBBLE_COLUMN_UP
               || var1.getType() == ParticleTypes.BUBBLE_POP
               || var1.getType() == ParticleTypes.CURRENT_DOWN
               || var1.getType() == ParticleTypes.UNDERWATER
         )) {
         var14.setReturnValue(null);
      }
   }
}
