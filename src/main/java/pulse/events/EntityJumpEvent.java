package pulse;

import net.minecraft.entity.LivingEntity;

public class EntityJumpEvent extends PulseEvent {
   private final LivingEntity entity;

   public EntityJumpEvent(LivingEntity entity) {
      this.entity = entity;
   }

   public LivingEntity entity() {
      return this.entity;
   }

   public LivingEntity a() {
      return this.entity;
   }
}
