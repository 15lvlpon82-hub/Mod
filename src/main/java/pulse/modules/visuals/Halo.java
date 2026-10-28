package pulse;

import java.awt.Color;
import meteordevelopment.orbit.EventHandler;
import pulse.module.ClientModule;
import pulse.module.ModuleCategory;
import pulse.module.ModuleInfo;
import pulse.module.ModuleRegistry;
import pulse.settings.BooleanSetting;
import pulse.settings.ColorSetting;
import pulse.settings.SettingGroup;
import pulse.settings.SliderSetting;

@ModuleInfo(a = "Halo", b = "Draws a halo above the player.", c = ModuleCategory.VISUALS)
public class Halo extends ClientModule {
    private final SliderSetting lineWidth;
    private final SliderSetting radius;
    private final SliderSetting yOffset;
    private final SettingGroup colorGroup;
    private final BooleanSetting useClientColor;
    private final ColorSetting color;

    public Halo() {
        this.lineWidth = new SliderSetting("Line Width", 0.05F, 0.01F, 0.2F, 0.01F);
        this.radius = new SliderSetting("Radius", 0.5F, 0.3F, 1.5F, 0.05F);
        this.yOffset = new SliderSetting("Y Offset", -0.1F, -1.0F, 0.5F, 0.05F);
        this.colorGroup = new SettingGroup("Color");
        this.useClientColor = new BooleanSetting("Use Client Color", true);
        this.color = new ColorSetting("Custom Color", Color.WHITE).a(() -> !this.useClientColor.a());
    }

    @EventHandler
    public void a(LivingEntityRenderEvent event) {
    }

    private Color n() {
        return this.useClientColor.a() ? ModuleRegistry.CLIENT_COLOR.n() : this.color.a();
    }
}
