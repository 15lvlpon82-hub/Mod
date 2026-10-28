package pulse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import pulse.module.ClientModule;
import pulse.module.ModuleCategory;
import pulse.module.ModuleInfo;
import pulse.settings.BooleanSetting;
import pulse.settings.SliderSetting;

@ModuleInfo(a = "Healing Helper", b = "Highlights useful healing items.", c = ModuleCategory.UTILITIES)
public class HealingHelper extends ClientModule {
    private final BooleanSetting onlyWhenNeeded;
    private final SliderSetting healthThreshold;
    private final SliderSetting hungerThreshold;
    private final SliderSetting minimumPriority;
    private final Map<Item, Integer> itemPriority;

    public HealingHelper() {
        this.onlyWhenNeeded = new BooleanSetting("Only When Needed", true);
        this.healthThreshold = new SliderSetting("Health Threshold", 14.0F, 1.0F, 20.0F, 1.0F);
        this.hungerThreshold = new SliderSetting("Hunger Threshold", 15.0F, 1.0F, 20.0F, 1.0F);
        this.minimumPriority = new SliderSetting("Minimum Priority", 1.0F, 1.0F, 4.0F, 1.0F);

        Map<Item, Integer> priorities = new HashMap<>();
        priorities.put(Items.POTION, 1);
        priorities.put(Items.GOLDEN_CARROT, 2);
        priorities.put(Items.GOLDEN_APPLE, 3);
        priorities.put(Items.ENCHANTED_GOLDEN_APPLE, 4);
        this.itemPriority = Collections.unmodifiableMap(priorities);
    }

    public boolean a(ItemStack stack) {
        if (stack == null || stack.isEmpty()) {
            return false;
        }

        int priority = this.a(stack.getItem());
        if (priority < this.minimumPriority.b()) {
            return false;
        }

        return !this.onlyWhenNeeded.a() || this.shouldUseNow(stack.getItem());
    }

    public List<Item> n() {
        return new ArrayList<>(this.itemPriority.keySet());
    }

    public int a(Item item) {
        return this.itemPriority.getOrDefault(item, 0);
    }

    public BooleanSetting o() {
        return this.onlyWhenNeeded;
    }

    public SliderSetting p() {
        return this.healthThreshold;
    }

    public SliderSetting q() {
        return this.hungerThreshold;
    }

    public SliderSetting r() {
        return this.minimumPriority;
    }

    public Map<Item, Integer> s() {
        return this.itemPriority;
    }

    private boolean shouldUseNow(Item item) {
        if (c.player == null) {
            return true;
        }

        if (item == Items.GOLDEN_CARROT) {
            return c.player.getHungerManager().getFoodLevel() <= this.hungerThreshold.b();
        }

        return c.player.getHealth() + c.player.getAbsorptionAmount() <= this.healthThreshold.a();
    }
}
