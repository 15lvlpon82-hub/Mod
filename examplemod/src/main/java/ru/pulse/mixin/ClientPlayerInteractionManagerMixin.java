package ru.pulse.mixin;

import net.minecraft.client.network.ClientPlayerInteractionManager;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import pulse.EventBusService;
import pulse.DropItemEvent;
import pulse.ItemUseEvent;

@Mixin(ClientPlayerInteractionManager.class)
public class ClientPlayerInteractionManagerMixin {
   @Inject(method = "interactItem", at = @At("HEAD"), cancellable = true)
   private void onRightClick(PlayerEntity var1, Hand var2, CallbackInfoReturnable<ActionResult> var3) {
      ItemUseEvent var4 = new ItemUseEvent(var1, var1.getWorld(), var2);
      EventBusService.EVENT_BUS.post(var4);
      if (var4.c()) {
         var3.setReturnValue(ActionResult.FAIL);
      }
   }

   @Inject(method = "clickSlot", at = @At("HEAD"), cancellable = true)
   private void onClickSlot(int var1, int var2, int var3, SlotActionType var4, PlayerEntity var5, CallbackInfo var6) {
      if (var4 == SlotActionType.THROW) {
         int var7 = var2;
         if (var2 >= 0 && var2 < 9) {
            var7 = var2 + 27;
         } else if (var2 >= 36 && var2 < 45) {
            var7 = var2 - 36;
         } else if (var2 == 45) {
            var7 = 40;
         }

         boolean var8 = var3 == 1;
         DropItemEvent var9 = new DropItemEvent(var7, var8);
         EventBusService.EVENT_BUS.post(var9);
         if (var9.c()) {
            var6.cancel();
         }
      }
   }
}
