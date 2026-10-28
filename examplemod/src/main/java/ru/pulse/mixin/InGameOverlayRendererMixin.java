package ru.pulse.mixin;


import pulse.module.ModuleRegistry;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.hud.InGameOverlayRenderer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.VertexConsumerProvider.Immediate;
import net.minecraft.client.util.math.MatrixStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import pulse.CustomHandShaderCapture;
import pulse.RenderTweaks;

@Mixin(InGameOverlayRenderer.class)
public class InGameOverlayRendererMixin {
   @Inject(method = "renderFireOverlay", at = @At("HEAD"), cancellable = true)
   private static void onRenderFireOverlay(MatrixStack var0, VertexConsumerProvider var1, CallbackInfo var2) {
      if (CustomHandShaderCapture.isActive()) {
         if (var1 instanceof Immediate var3) {
            var3.draw();
         }

         CustomHandShaderCapture.endCapture();
      }

      RenderTweaks var4 = ModuleRegistry.RENDER_TWEAKS;
      if (var4 != null && var4.p()) {
         var2.cancel();
      }
   }

   @Inject(method = "renderUnderwaterOverlay", at = @At("HEAD"), cancellable = true)
   private static void onRenderUnderwaterOverlay(MinecraftClient var0, MatrixStack var1, VertexConsumerProvider var2, CallbackInfo var3) {
      if (CustomHandShaderCapture.isActive()) {
         if (var2 instanceof Immediate var4) {
            var4.draw();
         }

         CustomHandShaderCapture.endCapture();
      }

      if (ModuleRegistry.NO_FLUID != null && ModuleRegistry.NO_FLUID.k()) {
         var3.cancel();
      }
   }
}
