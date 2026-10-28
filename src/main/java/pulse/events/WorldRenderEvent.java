package pulse;

import net.minecraft.client.util.math.MatrixStack;

public class WorldRenderEvent extends PulseEvent {
   private final MatrixStack matrices;
   private final float tickDelta;

   public WorldRenderEvent(MatrixStack matrices, float tickDelta) {
      this.matrices = matrices;
      this.tickDelta = tickDelta;
   }

   public MatrixStack matrices() {
      return this.matrices;
   }

   public float tickDelta() {
      return this.tickDelta;
   }

   public MatrixStack a() {
      return this.matrices;
   }

   public float b() {
      return this.tickDelta;
   }
}
