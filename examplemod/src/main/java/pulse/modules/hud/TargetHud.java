package pulse;

import pulse.module.ClientModule;
import pulse.module.ModuleCategory;
import pulse.module.ModuleInfo;
import pulse.settings.SliderSetting;

@ModuleInfo(a = "Target HUD", b = "Shows target information.", c = ModuleCategory.HUD)
public class TargetHud extends ClientModule {
    private final SliderSetting scale;

    public TargetHud() {
        this.scale = new SliderSetting("Scale", 1.0F, 1.0F, 2.0F, 0.1F);
        this.d();
    }

    public SliderSetting n() {
        return this.scale;
    }
}
