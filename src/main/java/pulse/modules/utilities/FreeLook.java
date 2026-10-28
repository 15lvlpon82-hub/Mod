package pulse;

import meteordevelopment.orbit.EventHandler;
import net.minecraft.client.option.Perspective;
import org.lwjgl.glfw.GLFW;
import pulse.module.ClientModule;
import pulse.module.ModuleCategory;
import pulse.module.ModuleInfo;
import pulse.settings.KeySetting;
import pulse.settings.ModeSetting;

@ModuleInfo(a = "Free Look", b = "Lets the camera rotate independently from the player.", c = ModuleCategory.UTILITIES)
public class FreeLook extends ClientModule {
    public final ModeSetting mode;
    public final KeySetting key;
    public static boolean active;
    public static float cameraYaw;
    public static float cameraPitch;
    private Perspective previousPerspective;
    private boolean activatedByThisModule;
    private boolean previousKeyPressed;

    public FreeLook() {
        this.mode = new ModeSetting("Mode", new String[]{"Hold", "Toggle"}, 0);
        this.key = new KeySetting("Key", GLFW.GLFW_KEY_LEFT_ALT);
        this.previousPerspective = Perspective.FIRST_PERSON;
        this.activatedByThisModule = false;
        this.previousKeyPressed = false;
    }

    @EventHandler
    public void a(ClientTickEvent event) {
        if (c == null || c.player == null || c.world == null || c.getWindow() == null || c.currentScreen != null) {
            this.resetIfNeeded();
            return;
        }

        int keyCode = this.key.a();
        if (keyCode <= GLFW.GLFW_KEY_UNKNOWN) {
            this.resetIfNeeded();
            return;
        }

        boolean pressed = GLFW.glfwGetKey(c.getWindow().getHandle(), keyCode) == GLFW.GLFW_PRESS;
        boolean toggleMode = this.mode.k() != 0;
        if (toggleMode) {
            if (pressed && !this.previousKeyPressed) {
                if (active) {
                    this.disableFreeLook();
                    this.activatedByThisModule = false;
                } else {
                    this.enableFreeLook();
                    this.activatedByThisModule = true;
                }
            }
        } else if (pressed && !active) {
            this.enableFreeLook();
            this.activatedByThisModule = true;
        } else if (!pressed && active && this.activatedByThisModule) {
            this.disableFreeLook();
            this.activatedByThisModule = false;
        }

        this.previousKeyPressed = pressed;
    }

    private void enableFreeLook() {
        if (c == null || c.player == null || c.options == null) {
            return;
        }

        this.previousPerspective = c.options.getPerspective();
        cameraYaw = c.player.getYaw(1.0F);
        cameraPitch = c.player.getPitch(1.0F);
        c.options.setPerspective(Perspective.THIRD_PERSON_BACK);
        active = true;
    }

    private void disableFreeLook() {
        if (c != null && c.options != null) {
            c.options.setPerspective(this.previousPerspective);
        }

        active = false;
    }

    private void resetIfNeeded() {
        if (active && this.activatedByThisModule) {
            this.disableFreeLook();
        }

        this.activatedByThisModule = false;
        this.previousKeyPressed = false;
    }

    @Override
    public void f() {
        if (active) {
            this.disableFreeLook();
        }

        this.activatedByThisModule = false;
        this.previousKeyPressed = false;
        super.f();
    }
}
