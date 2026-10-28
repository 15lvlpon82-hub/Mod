package pulse;

import net.minecraft.entity.player.PlayerEntity;

public class PlayerDeathEvent extends PulseEvent {
   private final PlayerEntity player;
   private final double x;
   private final double y;
   private final double z;

   public PlayerDeathEvent(PlayerEntity player, double x, double y, double z) {
      this.player = player;
      this.x = x;
      this.y = y;
      this.z = z;
   }

   public PlayerEntity player() {
      return this.player;
   }

   public double x() {
      return this.x;
   }

   public double y() {
      return this.y;
   }

   public double z() {
      return this.z;
   }

   public PlayerEntity a() {
      return this.player;
   }

   public double b() {
      return this.x;
   }

   public double c() {
      return this.y;
   }

   public double d() {
      return this.z;
   }
}
