package pulse;

import net.minecraft.client.util.math.MatrixStack;

public class HudRenderPreEvent extends PulseEvent {
   private final MatrixStack matrices;
   private final int width;
   private final int height;
   private final float tickDelta;

   public HudRenderPreEvent(MatrixStack matrices, int width, int height, float tickDelta) {
      this.matrices = matrices;
      this.width = width;
      this.height = height;
      this.tickDelta = tickDelta;
   }

   public MatrixStack matrices() {
      return this.matrices;
   }

   public int width() {
      return this.width;
   }

   public int height() {
      return this.height;
   }

   public float tickDelta() {
      return this.tickDelta;
   }

   public MatrixStack a() {
      return this.matrices;
   }

   public int b() {
      return this.width;
   }

   public int c() {
      return this.height;
   }

   public float d() {
      return this.tickDelta;
   }
}
