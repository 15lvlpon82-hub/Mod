package pulse;

import net.minecraft.network.packet.Packet;

public class PacketEvent extends CancellablePulseEvent {
   private final Packet<?> packet;
   private final MessageDirection direction;

   public PacketEvent(Packet<?> packet, MessageDirection direction) {
      this.packet = packet;
      this.direction = direction;
   }

   public Packet<?> packet() {
      return this.packet;
   }

   public MessageDirection direction() {
      return this.direction;
   }

   public Packet<?> d() {
      return this.packet;
   }

   public MessageDirection e() {
      return this.direction;
   }

   public enum MessageDirection {
      RECEIVE,
      SEND;

      public static final MessageDirection RECIEVE = RECEIVE;
   }
}
