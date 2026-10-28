package pulse;

import pulse.module.ClientModule;
import pulse.module.ModuleCategory;
import pulse.module.ModuleInfo;
import pulse.settings.SliderSetting;

@ModuleInfo(a = "Cooldowns HUD", b = "Displays item cooldowns on screen.", c = ModuleCategory.HUD)
public class CooldownsHud extends ClientModule {
    private final SliderSetting scale;

    public CooldownsHud() {
        this.scale = new SliderSetting("Scale", 1.0F, 1.0F, 2.0F, 0.1F);
        this.d();
    }

    public SliderSetting n() {
        return this.scale;
    }
}
