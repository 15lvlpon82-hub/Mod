package pulse;

public class WorldRenderStartEvent extends PulseEvent {
   private final float tickDelta;

   public WorldRenderStartEvent(float tickDelta) {
      this.tickDelta = tickDelta;
   }

   public float tickDelta() {
      return this.tickDelta;
   }

   public float a() {
      return this.tickDelta;
   }
}
