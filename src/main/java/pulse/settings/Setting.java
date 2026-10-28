package pulse.settings;

import java.util.Objects;
import java.util.function.Supplier;
import pulse.ConfigManager;

public abstract class Setting<ConfigTextDialog> {
   private final String name;
   private final String description;
   private ConfigTextDialog value;
   private final ConfigTextDialog defaultValue;
   private final ConfigTextDialog minValue;
   private final ConfigTextDialog maxValue;
   private Supplier<Boolean> visibleCondition = () -> true;

   protected Setting(String name, String description, ConfigTextDialog value) {
      this(name, description, value, null, null);
   }

   protected Setting(String name, String description, ConfigTextDialog value, ConfigTextDialog minValue, ConfigTextDialog maxValue) {
      this.name = name;
      this.description = description;
      this.value = value;
      this.defaultValue = value;
      this.minValue = minValue;
      this.maxValue = maxValue;
   }

   public String name() {
      return this.name;
   }

   public String description() {
      return this.description;
   }

   public ConfigTextDialog value() {
      return this.value;
   }

   public ConfigTextDialog defaultValue() {
      return this.defaultValue;
   }

   public ConfigTextDialog minValue() {
      return this.minValue;
   }

   public ConfigTextDialog maxValue() {
      return this.maxValue;
   }

   public void setValue(ConfigTextDialog value) {
      if (!Objects.equals(this.value, value)) {
         this.value = value;
         ConfigManager.a().h();
      }
   }

   public Setting<ConfigTextDialog> visibleWhen(Supplier<Boolean> condition) {
      this.visibleCondition = condition != null ? condition : () -> true;
      return this;
   }

   public boolean isVisible() {
      return this.visibleCondition.get();
   }

   public void reset() {
      this.value = this.defaultValue;
   }

   public String f() {
      return this.name();
   }

   public String g() {
      return this.description();
   }

   public Supplier<Boolean> h() {
      return this.visibleCondition;
   }

   public ConfigTextDialog i() {
      return this.defaultValue();
   }

   public ConfigTextDialog j() {
      return this.minValue();
   }

   public ConfigTextDialog k() {
      return this.value();
   }

   public void a(ConfigTextDialog value) {
      this.setValue(value);
   }

   public void l() {
      this.reset();
   }

   public Setting<ConfigTextDialog> b(Supplier<Boolean> condition) {
      return this.visibleWhen(condition);
   }

   public boolean m() {
      return this.isVisible();
   }
}
