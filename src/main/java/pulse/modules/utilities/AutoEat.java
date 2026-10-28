package pulse;

import meteordevelopment.orbit.EventHandler;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.item.ItemStack;
import pulse.module.ClientModule;
import pulse.module.ModuleCategory;
import pulse.module.ModuleInfo;
import pulse.settings.ModeSetting;
import pulse.settings.SliderSetting;
import pulse.settings.TokenSetting;

@ModuleInfo(a = "Auto Eat", b = "Automatically eats food at the selected hunger level.", c = ModuleCategory.UTILITIES)
public class AutoEat extends ClientModule {
    private final ModeSetting mode;
    private final TokenSetting command;
    private final SliderSetting hungerLevel;

    public AutoEat() {
        this.mode = new ModeSetting("Mode", new String[]{"Hand", "Command"}, "Hand");
        this.command = new TokenSetting("Command", TokenSetting.TokenType.COMMAND, "/feed", "").a(() -> this.mode.b("Command"));
        this.hungerLevel = new SliderSetting("Hunger Level", 15.0F, 1.0F, 20.0F, 1.0F);
    }

    @EventHandler
    public void a(ClientTickEvent event) {
    }

    private boolean a(ItemStack stack) {
        return stack != null && stack.getComponents().contains(DataComponentTypes.FOOD);
    }

    @Override
    public void f() {
        super.f();
    }
}
