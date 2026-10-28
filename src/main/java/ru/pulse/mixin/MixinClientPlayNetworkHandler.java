package ru.pulse.mixin;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.packet.s2c.play.EntityStatusS2CPacket;
import net.minecraft.network.packet.s2c.play.GameJoinS2CPacket;
import net.minecraft.network.packet.s2c.play.PlayerListS2CPacket;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import pulse.EventBusService;
import pulse.GameJoinEvent;
import pulse.WorldClearEvent;
import pulse.TotemPopEvent;
import pulse.PlayerListCache;

@Mixin(ClientPlayNetworkHandler.class)
public class MixinClientPlayNetworkHandler {
   private static final Map<UUID, ItemStack> cachedTotems = new HashMap<>();

   @Inject(method = "onEntityStatus", at = @At("HEAD"))
   private void onEntityStatus(EntityStatusS2CPacket var1, CallbackInfo var2) {
      if (var1.getStatus() == 35 && var1.getEntity(MinecraftClient.getInstance().world) instanceof LivingEntity var4) {
         ItemStack var5 = this.getCachedTotem(var4);
         EventBusService.EVENT_BUS.post(new TotemPopEvent(var4, var5));
      }
   }

   private ItemStack getCachedTotem(LivingEntity var1) {
      UUID var2 = var1.getUuid();
      ItemStack var3 = var1.getMainHandStack();
      ItemStack var4 = var1.getOffHandStack();
      ItemStack var5 = null;
      if (var3.getItem() == Items.TOTEM_OF_UNDYING) {
         var5 = var3.copy();
      } else if (var4.getItem() == Items.TOTEM_OF_UNDYING) {
         var5 = var4.copy();
      }

      if (var5 != null) {
         cachedTotems.put(var2, var5);
         return var5;
      } else {
         ItemStack var6 = cachedTotems.remove(var2);
         return var6 != null ? var6 : new ItemStack(Items.TOTEM_OF_UNDYING);
      }
   }

   @Inject(method = "onPlayerList", at = @At("RETURN"))
   private void onPlayerList(PlayerListS2CPacket var1, CallbackInfo var2) {
      PlayerListCache.c().a(var1);
   }

   @Inject(method = "onGameJoin", at = @At("TAIL"))
   public void onGameJoin(GameJoinS2CPacket var1, CallbackInfo var2) {
      EventBusService.EVENT_BUS.post(new GameJoinEvent());
      PlayerListCache.c().a();
   }

   @Inject(method = "clearWorld", at = @At("HEAD"))
   public void onClearWorld(CallbackInfo var1) {
      cachedTotems.clear();
      PlayerListCache.c().b();
      EventBusService.EVENT_BUS.post(new WorldClearEvent());
   }
}
