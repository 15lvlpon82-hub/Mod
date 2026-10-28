package pulse;

import meteordevelopment.orbit.EventHandler;
import pulse.module.ClientModule;
import pulse.module.ModuleCategory;
import pulse.module.ModuleInfo;

@ModuleInfo(a = "Sprint", b = "Automatically holds the sprint key.", c = ModuleCategory.UTILITIES)
public class Sprint extends ClientModule {
    @EventHandler
    public void a(ClientTickEvent event) {
        if (c.player != null) {
            c.options.sprintKey.setPressed(c.player.age > 3);
        }
    }
}
