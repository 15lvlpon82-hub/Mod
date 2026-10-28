package pulse;

import pulse.module.ClientModule;
import pulse.module.ModuleCategory;
import pulse.module.ModuleInfo;
import pulse.settings.SliderSetting;

@ModuleInfo(a = "Hotkeys", b = "Displays active key bindings.", c = ModuleCategory.HUD)
public class HotkeysHud extends ClientModule {
    private final SliderSetting scale;

    public HotkeysHud() {
        this.scale = new SliderSetting("Scale", 1.0F, 1.0F, 2.0F, 0.1F);
        this.d();
    }

    public SliderSetting n() {
        return this.scale;
    }
}
