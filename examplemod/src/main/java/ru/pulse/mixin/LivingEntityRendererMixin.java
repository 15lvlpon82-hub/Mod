package ru.pulse.mixin;


import pulse.module.ModuleRegistry;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.state.LivingEntityRenderState;
import net.minecraft.client.render.entity.state.PlayerEntityRenderState;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import pulse.EventBusService;
import pulse.LivingEntityRenderEvent;

@Mixin(LivingEntityRenderer.class)
public abstract class LivingEntityRendererMixin<T extends LivingEntity, S extends LivingEntityRenderState, M extends EntityModel<? super S>>
   extends EntityRenderer<T, S> {
   @Shadow
   protected M model;
   private static LivingEntity capturedEntity;

   protected LivingEntityRendererMixin() {
      super(null);
   }

   @Inject(
      method = "updateRenderState(Lnet/minecraft/entity/LivingEntity;Lnet/minecraft/client/render/entity/state/LivingEntityRenderState;F)V",
      at = @At("HEAD")
   )
   private void captureEntity(T var1, S var2, float var3, CallbackInfo var4) {
      capturedEntity = var1;
   }

   @Inject(
      method = "render(Lnet/minecraft/client/render/entity/state/LivingEntityRenderState;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/render/entity/LivingEntityRenderer;shouldRenderFeatures(Lnet/minecraft/client/render/entity/state/LivingEntityRenderState;)Z"
      )
   )
   private void onRenderEntity(S var1, MatrixStack var2, VertexConsumerProvider var3, int var4, CallbackInfo var5) {
      LivingEntityRenderEvent var6 = new LivingEntityRenderEvent(capturedEntity, var1, var2, this.model, var3);
      EventBusService.EVENT_BUS.post(var6);
   }

   @Inject(
      method = "render(Lnet/minecraft/client/render/entity/state/LivingEntityRenderState;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V",
      at = @At("TAIL")
   )
   private void renderSelfNametag(S var1, MatrixStack var2, VertexConsumerProvider var3, int var4, CallbackInfo var5) {
      if (var1 instanceof PlayerEntityRenderState var6) {
         MinecraftClient var7 = MinecraftClient.getInstance();
         if (var7.player != null && var6.id == var7.player.getId()) {
            if (ModuleRegistry.SELF_NAMETAG.k() && !var7.options.getPerspective().isFirstPerson()) {
               if (var6.squaredDistanceToCamera < 4096.0) {
                  var2.push();
                  if (var6.playerName != null) {
                     super.renderLabelIfPresent(var1, var6.playerName, var2, var3, var4);
                     var2.translate(0.0, 0.25875F, 0.0);
                  }

                  Text var8 = getServerDisplayName(var7, var6.name);
                  super.renderLabelIfPresent(var1, var8, var2, var3, var4);
                  var2.pop();
               }
            }
         }
      }
   }

   private static Text getServerDisplayName(MinecraftClient var0, String var1) {
      if (var0.getNetworkHandler() != null && var0.player != null) {
         PlayerListEntry var2 = var0.getNetworkHandler().getPlayerListEntry(var0.player.getUuid());
         if (var2 != null && var2.getDisplayName() != null) {
            return var2.getDisplayName();
         }
      }

      return Text.literal(var1);
   }
}
