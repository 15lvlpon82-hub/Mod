package pulse;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.state.LivingEntityRenderState;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;

public class LivingEntityRenderEvent extends PulseEvent {
   private final LivingEntity entity;
   private final LivingEntityRenderState renderState;
   private final MatrixStack matrices;
   private final EntityModel<?> model;
   private final VertexConsumerProvider vertexConsumers;

   public LivingEntityRenderEvent(
      LivingEntity entity, LivingEntityRenderState renderState, MatrixStack matrices, EntityModel<?> model, VertexConsumerProvider vertexConsumers
   ) {
      this.entity = entity;
      this.renderState = renderState;
      this.matrices = matrices;
      this.model = model;
      this.vertexConsumers = vertexConsumers;
   }

   public LivingEntity entity() {
      return this.entity;
   }

   public LivingEntityRenderState renderState() {
      return this.renderState;
   }

   public MatrixStack matrices() {
      return this.matrices;
   }

   public EntityModel<?> model() {
      return this.model;
   }

   public VertexConsumerProvider vertexConsumers() {
      return this.vertexConsumers;
   }

   public LivingEntity a() {
      return this.entity;
   }

   public LivingEntityRenderState b() {
      return this.renderState;
   }

   public MatrixStack c() {
      return this.matrices;
   }

   public EntityModel<?> d() {
      return this.model;
   }

   public VertexConsumerProvider e() {
      return this.vertexConsumers;
   }
}
