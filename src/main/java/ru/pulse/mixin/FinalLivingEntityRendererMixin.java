package ru.pulse.mixin;


import pulse.module.ModuleRegistry;
import java.awt.Color;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.state.LivingEntityRenderState;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import pulse.HitColor;
import pulse.ColorUtils;

@Mixin(LivingEntityRenderer.class)
public abstract class FinalLivingEntityRendererMixin<S extends LivingEntityRenderState, M extends EntityModel<? super S>> {
   @Shadow
   protected M model;
   @Unique
   private static boolean currentStateHurt = false;
   @Unique
   private static VertexConsumerProvider currentVertexConsumers;
   @Unique
   private static final Identifier HIT_COLOR_TEXTURE = Identifier.of("pulse", "textures/misc/white.png");

   @Inject(
      method = "render(Lnet/minecraft/client/render/entity/state/LivingEntityRenderState;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V",
      at = @At("HEAD")
   )
   private void captureState(S var1, MatrixStack var2, VertexConsumerProvider var3, int var4, CallbackInfo var5) {
      currentStateHurt = var1.hurt;
      currentVertexConsumers = var3;
   }

   @Inject(
      method = "render(Lnet/minecraft/client/render/entity/state/LivingEntityRenderState;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V",
      at = @At("RETURN")
   )
   private void clearState(S var1, MatrixStack var2, VertexConsumerProvider var3, int var4, CallbackInfo var5) {
      currentStateHurt = false;
      currentVertexConsumers = null;
   }

   @ModifyArg(
      method = "render(Lnet/minecraft/client/render/entity/state/LivingEntityRenderState;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/render/entity/model/EntityModel;render(Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumer;III)V"
      ),
      index = 1
   )
   private VertexConsumer modifyVertexConsumer(VertexConsumer var1) {
      HitColor var2 = ModuleRegistry.HIT_COLOR;
      return var2 != null && var2.o() && currentStateHurt && currentVertexConsumers != null
         ? currentVertexConsumers.getBuffer(RenderLayer.getEntityTranslucent(HIT_COLOR_TEXTURE))
         : var1;
   }

   @ModifyArg(
      method = "render(Lnet/minecraft/client/render/entity/state/LivingEntityRenderState;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/render/entity/model/EntityModel;render(Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumer;III)V"
      ),
      index = 4
   )
   private int modifyColor(int var1) {
      HitColor var2 = ModuleRegistry.HIT_COLOR;
      if (var2 != null && var2.o() && currentStateHurt) {
         Color var3 = var2.n();
         return ColorUtils.a(var3.getRed(), var3.getGreen(), var3.getBlue(), 255);
      } else {
         return var1;
      }
   }
}
