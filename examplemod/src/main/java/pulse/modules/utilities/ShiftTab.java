package pulse;

import meteordevelopment.orbit.EventHandler;
import net.minecraft.client.util.InputUtil;
import pulse.module.ClientModule;
import pulse.module.ModuleCategory;
import pulse.module.ModuleInfo;
import pulse.settings.BooleanSetting;

@ModuleInfo(a = "Shift Tab", b = "Briefly sneaks while attacking.", c = ModuleCategory.UTILITIES)
public class ShiftTab extends ClientModule {
    private static final int SNEAK_TICKS = 2;
    private final BooleanSetting triggerBeforeAttack;
    private int sneakTicksLeft;
    private boolean restorePending;
    private boolean previousSneakPressed;

    public ShiftTab() {
        this.triggerBeforeAttack = new BooleanSetting(
            "Before Attack",
            "If disabled, sneaking starts after the attack event.",
            true
        );
    }

    @EventHandler
    public void a(CriticalHitEvent event) {
        if (this.triggerBeforeAttack.k()) {
            this.startSneakBurst();
        }
    }

    @EventHandler
    public void a(AttackEntityEvent event) {
        if (!this.triggerBeforeAttack.k()) {
            this.startSneakBurst();
        }
    }

    @EventHandler
    public void a(ClientTickEvent event) {
        if (c.player == null) {
            return;
        }

        if (this.sneakTicksLeft > 0) {
            c.options.sneakKey.setPressed(true);
            this.sneakTicksLeft--;
            return;
        }

        if (this.restorePending) {
            c.options.sneakKey.setPressed(this.previousSneakPressed);
            this.restorePending = false;
        }
    }

    @Override
    public void f() {
        super.f();
        this.sneakTicksLeft = 0;
        this.restorePending = false;
        if (c != null && c.options != null) {
            c.options.sneakKey.setPressed(this.isSneakKeyPhysicallyPressed());
        }
    }

    private void startSneakBurst() {
        if (c.player == null) {
            return;
        }

        this.previousSneakPressed = this.isSneakKeyPhysicallyPressed();
        this.sneakTicksLeft = SNEAK_TICKS;
        this.restorePending = true;
        c.options.sneakKey.setPressed(true);
    }

    private boolean isSneakKeyPhysicallyPressed() {
        return c != null
            && c.getWindow() != null
            && InputUtil.isKeyPressed(c.getWindow().getHandle(), c.options.sneakKey.getDefaultKey().getCode());
    }
}
