package ru.pulse.mixin;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import pulse.EventBusService;
import pulse.ItemUseFinishEvent;

@Mixin(ItemStack.class)
public class ItemStackMixin {
   @Inject(method = "finishUsing", at = @At("HEAD"))
   private void onItemUseFinish(World var1, LivingEntity var2, CallbackInfoReturnable<ItemStack> var3) {
      ItemUseFinishEvent var4 = new ItemUseFinishEvent((ItemStack)(Object)this, var1, var2);
      EventBusService.EVENT_BUS.post(var4);
      if (var4.c()) {
         var3.cancel();
      }
   }
}
