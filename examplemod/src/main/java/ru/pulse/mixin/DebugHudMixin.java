package ru.pulse.mixin;


import pulse.module.ModuleRegistry;
import java.util.List;
import java.util.stream.Collectors;
import net.minecraft.client.gui.hud.DebugHud;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import pulse.StreamerMode;

@Mixin(DebugHud.class)
public class DebugHudMixin {
   @Inject(method = "getLeftText", at = @At("RETURN"), cancellable = true)
   private void hideLeftCoordinates(CallbackInfoReturnable<List<String>> var1) {
      StreamerMode var2 = ModuleRegistry.STREAMER_MODE;
      if (var2.k() && var2.hideDebugInfo.a()) {
         List<String> var3 = var1.getReturnValue();
         List<String> var4 = var3.stream()
            .filter(var0 -> !var0.contains("XYZ:") && !var0.contains("Block:") && !var0.contains("Chunk:") && !var0.contains("Facing:"))
            .collect(Collectors.toList());
         var1.setReturnValue(var4);
      }
   }

   @Inject(method = "getRightText", at = @At("RETURN"), cancellable = true)
   private void hideRightCoordinates(CallbackInfoReturnable<List<String>> var1) {
      StreamerMode var2 = ModuleRegistry.STREAMER_MODE;
      if (var2.k() && var2.hideDebugInfo.a()) {
         List<String> var3 = var1.getReturnValue();
         List<String> var4 = var3.stream()
            .filter(var0 -> !var0.contains("Targeted Block:") && !var0.contains("Targeted Fluid:") && !var0.contains("Targeted Entity"))
            .collect(Collectors.toList());
         var1.setReturnValue(var4);
      }
   }
}
