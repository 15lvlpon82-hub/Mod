package pulse;

import meteordevelopment.orbit.EventHandler;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.text.Text;
import pulse.module.ClientModule;
import pulse.module.ModuleCategory;
import pulse.module.ModuleInfo;
import pulse.settings.BooleanSetting;
import pulse.settings.SettingGroup;

@ModuleInfo(a = "HW Helper", b = "Shows helper timers for HolyWorld utility items.", c = ModuleCategory.UTILITIES)
public class HwHelper extends ClientModule {
    private static final long MESSAGE_DURATION_MS = 4_000L;
    private final BooleanSetting trackItems;
    private final BooleanSetting showStunTrap;
    private final BooleanSetting showExplosiveTrap;
    private final SettingGroup renderGroup;
    private final BooleanSetting renderNearbyTrapBox;
    private boolean stunTrapCooldownActive;
    private long stunTrapStartMs;
    private int lastStunTrapCount;
    private boolean explosiveTrapCooldownActive;
    private long explosiveTrapStartMs;
    private int lastExplosiveTrapCount;

    public HwHelper() {
        this.trackItems = new BooleanSetting("Track Items", true);
        this.showStunTrap = new BooleanSetting("Stun Trap", true);
        this.showExplosiveTrap = new BooleanSetting("Explosive Trap", true);
        this.renderGroup = new SettingGroup("Render");
        this.renderNearbyTrapBox = new BooleanSetting("Render Nearby Trap Box", true);
        this.lastStunTrapCount = 0;
        this.lastExplosiveTrapCount = 0;
    }

    @EventHandler
    public void a(WorldRenderEvent event) {
    }

    @EventHandler
    public void a(ClientTickEvent event) {
        if (c.world == null || c.player == null || !this.trackItems.k()) {
            return;
        }

        this.updateTrackedItem(Items.PRISMARINE_SHARD, this.showStunTrap.k(), true);
        this.updateTrackedItem(Items.POPPED_CHORUS_FRUIT, this.showExplosiveTrap.k(), false);
        this.showOverlayMessage();
    }

    private void updateTrackedItem(Item item, boolean enabled, boolean stunTrap) {
        int currentCount = this.countItem(item);
        boolean coolingDown = c.player.getItemCooldownManager().isCoolingDown(item.getDefaultStack());
        int previousCount = stunTrap ? this.lastStunTrapCount : this.lastExplosiveTrapCount;
        if (enabled && coolingDown && currentCount < previousCount) {
            if (stunTrap) {
                this.stunTrapCooldownActive = true;
                this.stunTrapStartMs = System.currentTimeMillis();
            } else {
                this.explosiveTrapCooldownActive = true;
                this.explosiveTrapStartMs = System.currentTimeMillis();
            }
        }

        if (stunTrap) {
            this.lastStunTrapCount = currentCount;
        } else {
            this.lastExplosiveTrapCount = currentCount;
        }
    }

    private int countItem(Item item) {
        int count = 0;
        for (int slot = 0; slot < c.player.getInventory().size(); slot++) {
            ItemStack stack = c.player.getInventory().getStack(slot);
            if (stack.getItem() == item) {
                count += stack.getCount();
            }
        }
        return count;
    }

    private void showOverlayMessage() {
        long now = System.currentTimeMillis();
        String stunMessage = this.getCooldownMessage("Stun Trap", now, this.stunTrapStartMs, this.stunTrapCooldownActive);
        if (stunMessage == null) {
            this.stunTrapCooldownActive = false;
        }

        String explosiveMessage = this.getCooldownMessage("Explosive Trap", now, this.explosiveTrapStartMs, this.explosiveTrapCooldownActive);
        if (explosiveMessage == null) {
            this.explosiveTrapCooldownActive = false;
        }

        String message;
        if (stunMessage != null && explosiveMessage != null) {
            message = stunMessage + " | " + explosiveMessage;
        } else {
            message = stunMessage != null ? stunMessage : explosiveMessage;
        }

        if (message != null) {
            c.inGameHud.setOverlayMessage(Text.of(message), false);
        }
    }

    private String getCooldownMessage(String name, long now, long startedAt, boolean active) {
        if (!active) {
            return null;
        }

        long elapsedMs = now - startedAt;
        if (elapsedMs >= MESSAGE_DURATION_MS) {
            return null;
        }

        double secondsLeft = (MESSAGE_DURATION_MS - elapsedMs) / 1000.0;
        return String.format("%ModuleCard cooldown: %.1fs", name, secondsLeft);
    }
}
