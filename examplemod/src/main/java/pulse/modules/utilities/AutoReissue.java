package pulse;

import meteordevelopment.orbit.EventHandler;
import pulse.module.ClientModule;
import pulse.module.ModuleCategory;
import pulse.module.ModuleInfo;
import pulse.settings.BooleanSetting;

@ModuleInfo(a = "Auto Reissue", b = "Tracks auction reissue cooldowns.", c = ModuleCategory.UTILITIES)
public class AutoReissue extends ClientModule {
    private final BooleanSetting autoReissue;
    private final BooleanSetting showCooldownOverlay;
    public boolean overlayActive;
    public ElapsedTimer timer;
    public int durationMs;

    public AutoReissue() {
        this.autoReissue = new BooleanSetting("Auto Reissue", true);
        this.showCooldownOverlay = new BooleanSetting("Show Cooldown Overlay", true);
        this.overlayActive = false;
        this.timer = new ElapsedTimer();
        this.durationMs = 15_000;
    }

    @EventHandler
    public void a(PacketEvent event) {
    }

    @EventHandler
    public void a(ClientTickEvent event) {
    }

    @Override
    public void f() {
        super.f();
        this.overlayActive = false;
        this.timer.b();
    }
}
