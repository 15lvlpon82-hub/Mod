package pulse;

import meteordevelopment.orbit.EventHandler;
import net.minecraft.entity.LivingEntity;
import pulse.module.ClientModule;
import pulse.module.ModuleCategory;
import pulse.module.ModuleInfo;
import pulse.settings.BooleanSetting;
import pulse.settings.ModeSetting;
import pulse.settings.SliderSetting;

@ModuleInfo(a = "Hit Sounds", b = "Plays a sound when you hit a target.", c = ModuleCategory.VISUALS)
public class HitSounds extends ClientModule {
    private final ModeSetting sound;
    private final SliderSetting volume;
    private final BooleanSetting onlyPlayers;
    private LivingEntity lastTarget;
    private boolean waitingForDamage;

    public HitSounds() {
        this.sound = new ModeSetting("Sound", new String[]{"Default", "Bell", "Bonk", "Bubble", "Pop", "Uwu", "Moan"}, "Default");
        this.volume = new SliderSetting("Volume", 1.0F, 0.1F, 2.0F, 0.1F);
        this.onlyPlayers = new BooleanSetting("Only Players", false);
        this.lastTarget = null;
        this.waitingForDamage = false;
    }

    @EventHandler
    public void a(AttackEntityEvent event) {
    }

    @EventHandler
    public void a(CriticalHitEvent event) {
    }

    private void n() {
        String selectedSound = this.sound.d();
        float selectedVolume = this.volume.k();
        if ("Default".equals(selectedSound)) {
            SoundPlayer.playRandomHit(selectedVolume);
        } else {
            String soundName = selectedSound.equals("Moan") ? "moan1" : selectedSound;
            SoundPlayer.play(soundName, selectedVolume);
        }
    }
}
