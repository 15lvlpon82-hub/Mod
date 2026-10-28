package pulse.settings;

import java.util.Locale;
import org.lwjgl.glfw.GLFW;

public class KeySetting extends Setting<Integer> {
   public KeySetting(String name, String description, int key) {
      super(name, description, key);
   }

   public KeySetting(String name, int key) {
      this(name, "", key);
   }

   public KeySetting(String name) {
      this(name, "", GLFW.GLFW_KEY_UNKNOWN);
   }

   public int key() {
      return this.k();
   }

   public void setKey(int key) {
      super.a(key);
   }

   public boolean isBound() {
      return this.key() != GLFW.GLFW_KEY_UNKNOWN;
   }

   public void clear() {
      this.setKey(GLFW.GLFW_KEY_UNKNOWN);
   }

   public String displayName() {
      int key = this.key();
      if (key == GLFW.GLFW_KEY_UNKNOWN) {
         return "";
      }

      String name = GLFW.glfwGetKeyName(key, 0);
      return name != null ? name.toUpperCase(Locale.ROOT) : "KEY " + key;
   }

   public int a() {
      return this.key();
   }

   public void a(int key) {
      this.setKey(key);
   }

   public boolean b() {
      return this.isBound();
   }

   public void c() {
      this.clear();
   }

   public String d() {
      return this.displayName();
   }
}
