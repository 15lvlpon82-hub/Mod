package pulse;

import java.util.UUID;

public class PlayerLeaveEvent extends PulseEvent {
   private final String playerName;
   private final UUID playerUuid;

   public PlayerLeaveEvent(String playerName, UUID playerUuid) {
      this.playerName = playerName;
      this.playerUuid = playerUuid;
   }

   public String playerName() {
      return this.playerName;
   }

   public UUID playerUuid() {
      return this.playerUuid;
   }

   public String a() {
      return this.playerName;
   }

   public UUID b() {
      return this.playerUuid;
   }
}
