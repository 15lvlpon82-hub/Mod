package ru.pulse.mixin;

import net.minecraft.client.network.ClientPlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import pulse.EventBusService;
import pulse.DropItemEvent;
import pulse.ClientTickEvent;

@Mixin(ClientPlayerEntity.class)
public class ClientPlayerEntityMixin {
   @Inject(method = "tick", at = @At("HEAD"))
   private void onTick(CallbackInfo var1) {
      EventBusService.EVENT_BUS.post(new ClientTickEvent());
   }

   @Inject(method = "dropSelectedItem", at = @At("HEAD"), cancellable = true)
   private void onDropSelectedItem(boolean var1, CallbackInfoReturnable<Boolean> var2) {
      ClientPlayerEntity var3 = (ClientPlayerEntity)(Object)this;
      DropItemEvent var4 = new DropItemEvent(var3.getInventory().selectedSlot, var1);
      EventBusService.EVENT_BUS.post(var4);
      if (var4.c()) {
         var2.setReturnValue(false);
      }
   }
}
