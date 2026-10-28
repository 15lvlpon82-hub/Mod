package pulse;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import meteordevelopment.orbit.EventHandler;
import pulse.module.ClientModule;
import pulse.module.ModuleCategory;
import pulse.module.ModuleInfo;

@ModuleInfo(a = "PVP Safe", b = "Blocks risky commands while PvP mode is active.", c = ModuleCategory.UTILITIES)
public class PvpSafe extends ClientModule {
    private static final long WARNING_COOLDOWN_MS = 3_000L;
    private final Pattern dangerousCommandPattern;
    private final Map<String, ElapsedTimer> warningTimers;

    public PvpSafe() {
        this.dangerousCommandPattern = Pattern.compile(
            "^/(spawn|home|hub|lobby|rtp|warp|back|logout|server|suicide|kill|BedrockModelParser|auction|trade|duel|pay|msg|tell|w)(ModuleCard.*)?$",
            Pattern.CASE_INSENSITIVE
        );
        this.warningTimers = new ConcurrentHashMap<>();
    }

    @EventHandler
    private void a(ChatSendEvent event) {
        String command = event.d();
        if (command == null || !command.startsWith("/") || !CombatState.a().a()) {
            return;
        }

        Matcher matcher = this.dangerousCommandPattern.matcher(command.trim());
        if (!matcher.matches()) {
            return;
        }

        String commandName = matcher.group(1).toLowerCase();
        ElapsedTimer timer = this.warningTimers.remove(commandName);
        if (timer != null && !timer.a(WARNING_COOLDOWN_MS)) {
            event.b();
            return;
        }

        this.warningTimers.put(commandName, new ElapsedTimer());
        ChatMessages.a((Object)("PVP Safe blocked /" + commandName + " while PvP mode is active."));
        event.b();
    }

    @EventHandler
    private void a(ClientTickEvent event) {
        this.warningTimers.values().removeIf(timer -> timer.a(WARNING_COOLDOWN_MS));
    }
}
