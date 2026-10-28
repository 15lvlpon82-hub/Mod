package pulse.settings;

import java.util.function.Supplier;

public class TextSetting extends Setting<String> {
   public TextSetting(String name, String description, String value) {
      super(name, description, value);
   }

   public TextSetting(String name, String value) {
      this(name, "", value);
   }

   public String get() {
      return this.k();
   }

   public void set(String value) {
      super.a(value);
   }

   public TextSetting visibleWhen(Supplier<Boolean> condition) {
      super.visibleWhen(condition);
      return this;
   }

   public String a() {
      return this.get();
   }

   public void a(String value) {
      this.set(value);
   }

   public TextSetting a(Supplier<Boolean> condition) {
      return this.visibleWhen(condition);
   }
}
