package ru.pulse.mixin;

import io.netty.channel.ChannelHandlerContext;
import net.minecraft.network.ClientConnection;
import net.minecraft.network.PacketCallbacks;
import net.minecraft.network.packet.Packet;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import pulse.EventBusService;
import pulse.PacketEvent;

@Mixin(ClientConnection.class)
public class ClientConnectionMixin {
   @Inject(
      method = "channelRead0(Lio/netty/channel/ChannelHandlerContext;Lnet/minecraft/network/packet/Packet;)V",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/network/ClientConnection;handlePacket(Lnet/minecraft/network/packet/Packet;Lnet/minecraft/network/listener/PacketListener;)V"
      ),
      cancellable = true
   )
   private void onChannelRead(ChannelHandlerContext var1, Packet<?> var2, CallbackInfo var3) {
      PacketEvent var4 = new PacketEvent(var2, PacketEvent.MessageDirection.RECIEVE);
      EventBusService.EVENT_BUS.post(var4);
      if (var4.c()) {
         var3.cancel();
      }
   }

   @Inject(method = "send(Lnet/minecraft/network/packet/Packet;Lnet/minecraft/network/PacketCallbacks;)V", at = @At("HEAD"), cancellable = true)
   private void onSendPacket(Packet<?> var1, PacketCallbacks var2, CallbackInfo var3) {
      PacketEvent var4 = new PacketEvent(var1, PacketEvent.MessageDirection.SEND);
      EventBusService.EVENT_BUS.post(var4);
      if (var4.c()) {
         var3.cancel();
      }
   }
}
