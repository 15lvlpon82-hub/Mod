package pulse;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import pulse.module.ClientModule;
import pulse.module.ModuleCategory;
import pulse.module.ModuleInfo;

@ModuleInfo(a = "Totem Tracker", b = "Tracks totem pops from recently attacked entities.", c = ModuleCategory.UTILITIES)
public class TotemTracker extends ClientModule {
    private static final long TARGET_MEMORY_MS = 5_000L;
    private final Map<UUID, ElapsedTimer> attackedTargets = new HashMap<>();
    private int lastNotificationAge = -1;

    @EventHandler
    public void a(AttackEntityEvent event) {
        if (c.player == null || !(event.a() instanceof LivingEntity target) || target == c.player) {
            return;
        }

        this.attackedTargets.put(target.getUuid(), new ElapsedTimer());
    }

    @EventHandler
    public void a(TotemPopEvent event) {
        if (c.player == null) {
            return;
        }

        LivingEntity target = event.a();
        if (target == c.player) {
            return;
        }

        ElapsedTimer timer = this.attackedTargets.get(target.getUuid());
        if (timer != null && !timer.hasElapsed(TARGET_MEMORY_MS)) {
            this.notifyTotemPop(target, event.b());
        }

        this.removeExpiredTargets();
    }

    private void notifyTotemPop(LivingEntity target, ItemStack totemStack) {
        int playerAge = c.player.age;
        if (playerAge == this.lastNotificationAge) {
            return;
        }

        this.lastNotificationAge = playerAge;
        String targetName = target.getName().getString();
        String totemType = EnchantmentHelper.getEnchantments(totemStack).isEmpty() ? "regular" : "enchanted";
        ChatMessages.a((Object)("Totem Tracker: " + targetName + " popped a " + totemType + " totem."));
    }

    private void removeExpiredTargets() {
        this.attackedTargets.entrySet().removeIf(entry -> entry.getValue().hasElapsed(TARGET_MEMORY_MS));
    }

    @Override
    public void f() {
        super.f();
        this.attackedTargets.clear();
        this.lastNotificationAge = -1;
    }
}
