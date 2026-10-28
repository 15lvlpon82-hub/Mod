package ru.pulse.mixin;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.feature.ArmorFeatureRenderer;
import net.minecraft.client.render.entity.state.BipedEntityRenderState;
import net.minecraft.client.util.math.MatrixStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import pulse.ArmorRenderState;

@Mixin(ArmorFeatureRenderer.class)
public class ArmorFeatureRendererMixin {
   @Inject(
      method = "render(Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;ILnet/minecraft/client/render/entity/state/BipedEntityRenderState;FF)V",
      at = @At("HEAD")
   )
   private void captureState(MatrixStack var1, VertexConsumerProvider var2, int var3, BipedEntityRenderState var4, float var5, float var6, CallbackInfo var7) {
      ArmorRenderState.a(var4.hurt);
   }

   @Inject(
      method = "render(Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;ILnet/minecraft/client/render/entity/state/BipedEntityRenderState;FF)V",
      at = @At("RETURN")
   )
   private void clearState(MatrixStack var1, VertexConsumerProvider var2, int var3, BipedEntityRenderState var4, float var5, float var6, CallbackInfo var7) {
      ArmorRenderState.b();
   }
}
