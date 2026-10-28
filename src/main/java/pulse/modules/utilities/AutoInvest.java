package pulse;

import java.util.regex.Pattern;
import meteordevelopment.orbit.EventHandler;
import pulse.module.ClientModule;
import pulse.module.ModuleCategory;
import pulse.module.ModuleInfo;
import pulse.settings.TokenSetting;

@ModuleInfo(a = "Auto Invest", b = "Automatically invests clan money above the configured limit.", c = ModuleCategory.UTILITIES)
public class AutoInvest extends ClientModule {
    private final TokenSetting limit;
    private final Pattern numberPattern;
    private long lastInvestTime;

    public AutoInvest() {
        this.limit = new TokenSetting("Limit", "Minimum balance before investing.", TokenSetting.TokenType.PRICE, "1000000", "$");
        this.numberPattern = Pattern.compile("\\d+");
        this.lastInvestTime = -1L;
    }

    @EventHandler
    private void a(ClientTickEvent event) {
    }

    private long n() {
        try {
            return Long.parseLong(this.limit.k().replace("$", "").replace(" ", ""));
        } catch (NumberFormatException exception) {
            return 0L;
        }
    }

    private long o() {
        return this.lastInvestTime;
    }

    @Override
    public void f() {
        super.f();
        this.lastInvestTime = -1L;
    }
}
