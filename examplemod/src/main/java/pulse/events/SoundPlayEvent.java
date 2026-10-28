package pulse;

import net.minecraft.client.sound.SoundInstance;

public class SoundPlayEvent extends CancellablePulseEvent {
   private final SoundInstance sound;
   private float volume;
   private float pitch;

   public SoundPlayEvent(SoundInstance sound) {
      this.sound = sound;
      try {
         this.volume = sound.getVolume();
         this.pitch = sound.getPitch();
      } catch (NullPointerException ignored) {
         this.volume = 1.0F;
         this.pitch = 1.0F;
      }
   }

   public SoundInstance sound() {
      return this.sound;
   }

   public float volume() {
      return this.volume;
   }

   public void setVolume(float volume) {
      this.volume = volume;
   }

   public float pitch() {
      return this.pitch;
   }

   public void setPitch(float pitch) {
      this.pitch = pitch;
   }

   public SoundInstance d() {
      return this.sound;
   }

   public float e() {
      return this.volume;
   }

   public void a(float volume) {
      this.volume = volume;
   }

   public float f() {
      return this.pitch;
   }

   public void b(float pitch) {
      this.pitch = pitch;
   }
}
