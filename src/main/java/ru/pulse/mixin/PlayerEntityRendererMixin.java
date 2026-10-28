package ru.pulse.mixin;


import pulse.module.ModuleRegistry;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.PlayerEntityRenderer;
import net.minecraft.client.render.entity.state.PlayerEntityRenderState;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PlayerEntityRenderer.class)
public abstract class PlayerEntityRendererMixin extends EntityRenderer<AbstractClientPlayerEntity, PlayerEntityRenderState> {
   protected PlayerEntityRendererMixin() {
      super(null);
   }

   @Inject(
      method = "renderLabelIfPresent(Lnet/minecraft/client/render/entity/state/PlayerEntityRenderState;Lnet/minecraft/text/Text;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V",
      at = @At("HEAD")
   )
   private void onRenderLabel(PlayerEntityRenderState var1, Text var2, MatrixStack var3, VertexConsumerProvider var4, int var5, CallbackInfo var6) {
      MinecraftClient var7 = MinecraftClient.getInstance();
      if (var7.player != null && var1.id == var7.player.getId()) {
         if (ModuleRegistry.SELF_NAMETAG.k() && !var7.options.getPerspective().isFirstPerson()) {
            if (var1.squaredDistanceToCamera < 4096.0) {
               var3.push();
               if (var1.playerName != null) {
                  super.renderLabelIfPresent(var1, var1.playerName, var3, var4, var5);
                  var3.translate(0.0, 0.25875F, 0.0);
               }

               Object var8;
               if (var7.getNetworkHandler() != null) {
                  PlayerListEntry var9 = var7.getNetworkHandler().getPlayerListEntry(var7.player.getUuid());
                  if (var9 != null && var9.getDisplayName() != null) {
                     var8 = var9.getDisplayName();
                  } else {
                     var8 = Text.literal(var1.name);
                  }
               } else {
                  var8 = Text.literal(var1.name);
               }

               super.renderLabelIfPresent(var1, (Text)var8, var3, var4, var5);
               var3.pop();
            }
         }
      }
   }
}
