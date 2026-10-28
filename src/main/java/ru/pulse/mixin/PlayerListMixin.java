package ru.pulse.mixin;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.network.packet.s2c.play.GameJoinS2CPacket;
import net.minecraft.network.packet.s2c.play.PlayerListS2CPacket;
import net.minecraft.network.packet.s2c.play.PlayerListS2CPacket.Action;
import net.minecraft.network.packet.s2c.play.PlayerListS2CPacket.Entry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import pulse.EventBusService;
import pulse.PlayerJoinEvent;
import pulse.PlayerLeaveEvent;

@Mixin(ClientPlayNetworkHandler.class)
public class PlayerListMixin {
   @Unique
   private static final ConcurrentHashMap<UUID, String> uuidToNameCache = new ConcurrentHashMap<>();

   @Inject(method = "onPlayerList", at = @At("HEAD"))
   private void onPlayerListUpdate(PlayerListS2CPacket var1, CallbackInfo var2) {
      for (Entry var4 : var1.getEntries()) {
         UUID var5 = var4.profileId();
         if (var1.getActions().contains(Action.ADD_PLAYER) && var4.profile() != null && var4.profile().getName() != null) {
            String var6 = var4.profile().getName();
            if (!uuidToNameCache.containsKey(var5)) {
               uuidToNameCache.put(var5, var6);
               EventBusService.EVENT_BUS.post(new PlayerJoinEvent(var6, var5));
            }
         }

         if (var1.getActions().contains(Action.UPDATE_LISTED) && !var4.listed()) {
            String var7 = uuidToNameCache.get(var5);
            if (var7 != null) {
               EventBusService.EVENT_BUS.post(new PlayerLeaveEvent(var7, var5));
               uuidToNameCache.remove(var5);
            } else {
               EventBusService.EVENT_BUS.post(new PlayerLeaveEvent("", var5));
            }
         }
      }
   }

   @Inject(method = "onGameJoin", at = @At("HEAD"))
   private void onGameJoin(GameJoinS2CPacket var1, CallbackInfo var2) {
      uuidToNameCache.clear();
   }
}
