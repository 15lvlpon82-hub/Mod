package ru.pulse.mixin;

import java.util.Optional;
import net.minecraft.client.option.SimpleOption.DoubleSliderCallbacks;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(DoubleSliderCallbacks.class)
public class OptionInstanceMixin {
   @Inject(method = "validate(Ljava/lang/Double;)Ljava/util/Optional;", at = @At("HEAD"), cancellable = true)
   private void unlimitGamma(Double var1, CallbackInfoReturnable<Optional<Double>> var2) {
      var2.setReturnValue(Optional.of(var1));
   }
}
