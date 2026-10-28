package pulse;

import pulse.module.ClientModule;
import pulse.module.ModuleCategory;
import pulse.module.ModuleInfo;
import pulse.settings.BooleanSetting;
import pulse.settings.SliderSetting;

@ModuleInfo(a = "Potions", b = "Shows active potion effects.", c = ModuleCategory.HUD)
public class PotionsHud extends ClientModule {
    private final BooleanSetting vanillaHud;
    private final SliderSetting scale;

    public PotionsHud() {
        this.vanillaHud = new BooleanSetting("Vanilla HUD", false);
        this.scale = new SliderSetting("Scale", 1.0F, 1.0F, 2.0F, 0.1F);
        this.d();
    }

    public BooleanSetting n() {
        return this.vanillaHud;
    }

    public SliderSetting o() {
        return this.scale;
    }
}
