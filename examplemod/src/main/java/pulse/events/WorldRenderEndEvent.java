package pulse;

import net.minecraft.client.render.Camera;
import net.minecraft.client.util.math.MatrixStack;

public class WorldRenderEndEvent extends PulseEvent {
   private final MatrixStack matrices;
   private final float tickDelta;
   private final Camera camera;

   public WorldRenderEndEvent(MatrixStack matrices, float tickDelta, Camera camera) {
      this.matrices = matrices;
      this.tickDelta = tickDelta;
      this.camera = camera;
   }

   public MatrixStack matrices() {
      return this.matrices;
   }

   public float tickDelta() {
      return this.tickDelta;
   }

   public Camera camera() {
      return this.camera;
   }

   public MatrixStack a() {
      return this.matrices;
   }

   public float b() {
      return this.tickDelta;
   }

   public Camera c() {
      return this.camera;
   }
}
