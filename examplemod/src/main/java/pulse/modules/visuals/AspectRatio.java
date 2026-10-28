package pulse;

import pulse.module.ClientModule;
import pulse.module.ModuleCategory;
import pulse.module.ModuleInfo;
import pulse.settings.ModeSetting;
import pulse.settings.SliderSetting;

@ModuleInfo(a = "Aspect Ratio", b = "Changes the screen aspect ratio", c = ModuleCategory.VISUALS)
public class AspectRatio extends ClientModule {
   private static final String MODE_16_9 = "16:9";
   private static final String MODE_4_3 = "4:3";
   private static final String MODE_21_9 = "21:9";
   private static final String MODE_1_1 = "1:1";
   private static final String MODE_CUSTOM = "Custom";

   public final ModeSetting a;
   public final SliderSetting b;

   public AspectRatio() {
      this.a = new ModeSetting("Mode", new String[]{MODE_16_9, MODE_4_3, MODE_21_9, MODE_1_1, MODE_CUSTOM}, MODE_16_9);
      this.b = new SliderSetting("Custom Ratio", 1.78F, 0.5F, 3.0F, 0.01F).a(() -> this.a.b(MODE_CUSTOM));
   }

   public float n() {
      return switch (this.a.d()) {
         case MODE_4_3 -> 4.0F / 3.0F;
         case MODE_21_9 -> 21.0F / 9.0F;
         case MODE_1_1 -> 1.0F;
         case MODE_CUSTOM -> this.b.a();
         default -> 16.0F / 9.0F;
      };
   }
}
