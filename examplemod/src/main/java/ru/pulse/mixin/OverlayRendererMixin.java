package ru.pulse.mixin;


import pulse.module.ModuleRegistry;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.hud.InGameOverlayRenderer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.util.math.MatrixStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import pulse.RenderTweaks;

@Mixin(InGameOverlayRenderer.class)
public class OverlayRendererMixin {
   @Inject(method = "renderFireOverlay", at = @At("HEAD"), cancellable = true)
   private static void onRenderFireOverlay(MatrixStack var0, VertexConsumerProvider var1, CallbackInfo var2) {
      RenderTweaks var3 = ModuleRegistry.RENDER_TWEAKS;
      if (var3.p()) {
         var2.cancel();
      }
   }

   @Inject(method = "renderUnderwaterOverlay", at = @At("HEAD"), cancellable = true)
   private static void onRenderUnderwaterOverlay(MinecraftClient var0, MatrixStack var1, VertexConsumerProvider var2, CallbackInfo var3) {
      if (ModuleRegistry.NO_FLUID.k()) {
         var3.cancel();
      }
   }
}
