package pulse;

import meteordevelopment.orbit.EventHandler;
import pulse.module.ClientModule;
import pulse.module.ModuleCategory;
import pulse.module.ModuleInfo;
import pulse.settings.BooleanSetting;
import pulse.settings.ModeSetting;

@ModuleInfo(a = "Lock Slot", b = "Prevents dropping items from selected hotbar slots.", c = ModuleCategory.UTILITIES)
public class LockSlot extends ClientModule {
    private final BooleanSetting lockHotbarSlots;
    private final ModeSetting slots;
    private final BooleanSetting lockOnlyValuableItems;

    public LockSlot() {
        this.lockHotbarSlots = new BooleanSetting("Lock Hotbar Slots", true);
        this.slots = new ModeSetting(
            "Slots",
            new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9"},
            new int[0]
        ).a(this.lockHotbarSlots::k);
        this.lockOnlyValuableItems = new BooleanSetting("Only Valuable Items", false);
    }

    @EventHandler
    public void a(DropItemEvent event) {
    }
}
