package pulse.settings;

import java.util.function.Supplier;

public class SettingGroup extends Setting<String> {
   public SettingGroup(String value) {
      super(value, "", value);
   }

   public SettingGroup visibleWhen(Supplier<Boolean> condition) {
      super.visibleWhen(condition);
      return this;
   }

   public SettingGroup a(Supplier<Boolean> condition) {
      return this.visibleWhen(condition);
   }
}
