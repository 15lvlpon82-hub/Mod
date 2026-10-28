package pulse;

import net.minecraft.entity.Entity;

public class CriticalHitEvent extends PulseEvent {
   private final Entity entity;

   public CriticalHitEvent(Entity entity) {
      this.entity = entity;
   }

   public Entity getEntity() {
      return this.entity;
   }

   public Entity a() {
      return this.entity;
   }
}

