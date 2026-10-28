package pulse;

import meteordevelopment.orbit.EventHandler;
import net.minecraft.client.option.SimpleOption;
import pulse.module.ClientModule;
import pulse.module.ModuleCategory;
import pulse.module.ModuleInfo;

@ModuleInfo(a = "Full Bright", b = "Increases world brightness", c = ModuleCategory.VISUALS)
public class FullBright extends ClientModule {
   private static final double FULL_BRIGHT_GAMMA = 9999.0;

   private double previousGamma = 1.0;

   @Override
   public void e() {
      if (c.options == null) {
         return;
      }

      this.previousGamma = c.options.getGamma().getValue();
      c.options.getGamma().setValue(FULL_BRIGHT_GAMMA);
   }

   @Override
   public void f() {
      if (c.options != null) {
         c.options.getGamma().setValue(this.previousGamma);
      }

      super.f();
   }

   @EventHandler
   public void a(ClientTickEvent event) {
      if (c.options == null) {
         return;
      }

      SimpleOption<Double> gamma = c.options.getGamma();
      if (gamma.getValue() != FULL_BRIGHT_GAMMA) {
         gamma.setValue(FULL_BRIGHT_GAMMA);
      }
   }
}
