package ru.pulse.mixin;

import net.minecraft.block.BlockState;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.WorldRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import pulse.BlockOutlineEvent;
import pulse.EventBusService;
import pulse.module.ModuleRegistry;

@Mixin(WorldRenderer.class)
public class BlockOutlineMixin {
   @Inject(method = "drawBlockOutline", at = @At("HEAD"), cancellable = true)
   private void onDrawBlockOutline(
      MatrixStack matrices,
      VertexConsumer vertexConsumer,
      Entity entity,
      double cameraX,
      double cameraY,
      double cameraZ,
      BlockPos blockPos,
      BlockState blockState,
      int color,
      CallbackInfo callbackInfo
   ) {
      if (ModuleRegistry.BLOCK_OVERLAY.k()) {
         BlockOutlineEvent event = new BlockOutlineEvent(matrices, vertexConsumer, entity, cameraX, cameraY, cameraZ, blockPos, blockState);
         EventBusService.EVENT_BUS.post(event);
         if (event.c()) {
            callbackInfo.cancel();
         }
      }
   }
}
