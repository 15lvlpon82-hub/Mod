package pulse.settings;

import java.util.function.Supplier;

public class BooleanSetting extends Setting<Boolean> {
   public BooleanSetting(String name, String description, boolean value) {
      super(name, description, value);
   }

   public BooleanSetting(String name, boolean value) {
      this(name, "", value);
   }

   public boolean get() {
      return this.k();
   }

   public void set(boolean value) {
      super.a(value);
   }

   public void toggle() {
      this.set(!this.get());
   }

   public BooleanSetting visibleWhen(Supplier<Boolean> condition) {
      super.visibleWhen(condition);
      return this;
   }

   public boolean a() {
      return this.get();
   }

   public void a(boolean value) {
      this.set(value);
   }

   public void b() {
      this.toggle();
   }

   public BooleanSetting a(Supplier<Boolean> condition) {
      return this.visibleWhen(condition);
   }
}
