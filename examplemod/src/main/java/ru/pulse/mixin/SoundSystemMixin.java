package ru.pulse.mixin;

import net.minecraft.client.sound.SoundInstance;
import net.minecraft.client.sound.SoundSystem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import pulse.EventBusService;
import pulse.SoundPlayEvent;
import pulse.VolumeScaledSoundInstance;

@Mixin(SoundSystem.class)
public class SoundSystemMixin {
   @ModifyVariable(method = "play(Lnet/minecraft/client/sound/SoundInstance;)V", at = @At("HEAD"), argsOnly = true)
   private SoundInstance modifySound(SoundInstance var1) {
      if (var1 != null && !(var1 instanceof VolumeScaledSoundInstance)) {
         SoundPlayEvent var2 = new SoundPlayEvent(var1);
         EventBusService.EVENT_BUS.post(var2);
         if (var2.c()) {
            return null;
         } else {
            return var2.e() != 1.0F ? new VolumeScaledSoundInstance(var1, var2.e()) : var1;
         }
      } else {
         return var1;
      }
   }
}
