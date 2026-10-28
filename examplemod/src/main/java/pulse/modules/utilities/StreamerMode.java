package pulse;

import pulse.module.ClientModule;
import pulse.module.ModuleCategory;
import pulse.module.ModuleInfo;
import pulse.settings.BooleanSetting;

@ModuleInfo(a = "Streamer Mode", b = "Hides player and server information.", c = ModuleCategory.UTILITIES)
public class StreamerMode extends ClientModule {
    public final BooleanSetting hidePlayerName;
    public final BooleanSetting hideServerNumber;
    public final BooleanSetting hideDebugInfo;

    public StreamerMode() {
        this.hidePlayerName = new BooleanSetting("Hide Player Name", true);
        this.hideServerNumber = new BooleanSetting("Hide Server Number", true);
        this.hideDebugInfo = new BooleanSetting("Hide Debug Info", true);
    }
}
