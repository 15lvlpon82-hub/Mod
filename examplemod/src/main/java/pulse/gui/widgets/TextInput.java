package pulse;

import java.awt.Color;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;
import net.minecraft.client.util.math.MatrixStack;

class TextInput {
   private static final Set<TextInput> ACTIVE_INPUTS = new HashSet<>();

   private final InputType inputType;
   private String value;
   private String placeholder;
   private int maxLength = 256;
   private float x;
   private float y;
   private float width = 100.0F;
   private float height = 16.0F;
   private boolean focused;
   private boolean visible = true;
   private boolean editable = true;
   private Consumer<String> changeListener;
   private Color background = Theme.e;
   private Color foreground = Theme.a;

   TextInput(InputType inputType) {
      this(inputType, "", "");
   }

   TextInput(InputType inputType, String placeholder) {
      this(inputType, "", placeholder);
   }

   TextInput(InputType inputType, String value, String placeholder) {
      this.inputType = inputType == null ? InputType.TEXT : inputType;
      this.value = this.clean(value);
      this.placeholder = placeholder == null ? "" : placeholder;
   }

   public void a(float x, float y) {
      this.x = x;
      this.y = y;
   }

   public void b(float width, float height) {
      this.width = Math.max(1.0F, width);
      this.height = Math.max(1.0F, height);
   }

   public void a(float width) {
      this.width = Math.max(1.0F, width);
   }

   public void a(float x, float y, float width, float height) {
      this.x = x;
      this.y = y;
      this.width = Math.max(1.0F, width);
      this.height = Math.max(1.0F, height);
   }

   public void b(float height) {
      this.height = Math.max(1.0F, height);
   }

   public void a(Color background, Color foreground) {
      if (background != null) {
         this.background = background;
      }
      if (foreground != null) {
         this.foreground = foreground;
      }
   }

   public void a(boolean focused) {
      this.focused = focused;
      if (focused) {
         ACTIVE_INPUTS.add(this);
      } else {
         ACTIVE_INPUTS.remove(this);
      }
   }

   public void a(int maxLength) {
      this.maxLength = Math.max(0, maxLength);
      if (this.value.length() > this.maxLength) {
         this.value = this.value.substring(0, this.maxLength);
      }
   }

   public void a(String value) {
      this.setValue(value);
   }

   public void b(boolean visible) {
      this.visible = visible;
   }

   public void a(Consumer<String> changeListener) {
      this.changeListener = changeListener;
   }

   public String a() {
      return this.value;
   }

   public String b() {
      return this.placeholder;
   }

   public void b(String placeholder) {
      this.placeholder = placeholder == null ? "" : placeholder;
   }

   public int c() {
      return this.maxLength;
   }

   public void b(int maxLength) {
      this.a(maxLength);
   }

   public boolean d() {
      return this.focused;
   }

   public void c(boolean editable) {
      this.editable = editable;
   }

   public void d(boolean focused) {
      this.a(focused);
   }

   public boolean e() {
      return this.editable;
   }

   public static boolean f() {
      return !ACTIVE_INPUTS.isEmpty();
   }

   public void a(MatrixStack matrices, Renderer2D renderer, float x, float y, float width, float height, int mouseX, int mouseY, float alpha) {
      this.a(x, y, width, height);
   }

   public boolean a(int mouseX, int mouseY) {
      return this.visible && this.contains(mouseX, mouseY);
   }

   public boolean a(int mouseX, int mouseY, int button) {
      boolean hit = this.a(mouseX, mouseY);
      if (button == 0) {
         this.a(hit);
      }
      return hit;
   }

   public boolean a(char character, int modifiers) {
      if (!this.focused || !this.editable || Character.isISOControl(character)) {
         return false;
      }
      this.setValue(this.value + character);
      return true;
   }

   public float g() {
      return this.x;
   }

   public float h() {
      return this.y;
   }

   public float i() {
      return this.width;
   }

   public float j() {
      return this.height;
   }

   static String a(String value, String key, int a, int b, int c, int d) {
      return value;
   }

   private void setValue(String value) {
      String next = this.clean(value);
      if (next.length() > this.maxLength) {
         next = next.substring(0, this.maxLength);
      }
      this.value = next;
      if (this.changeListener != null) {
         this.changeListener.accept(this.value);
      }
   }

   private String clean(String value) {
      if (value == null) {
         return "";
      }
      return switch (this.inputType) {
         case INT -> value.replaceAll("[^0-9-]", "");
         case COORDINATE -> value.replaceAll("[^0-9+\\-., ]", "");
         case KEY, PLAYER, FILENAME, TEXT -> value;
      };
   }

   private boolean contains(int mouseX, int mouseY) {
      return mouseX >= this.x && mouseY >= this.y && mouseX <= this.x + this.width && mouseY <= this.y + this.height;
   }

   enum InputType {
      TEXT,
      INT,
      COORDINATE,
      PLAYER,
      KEY,
      FILENAME
   }
}
