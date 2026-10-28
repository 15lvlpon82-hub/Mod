package pulse;

public class MouseScrollEvent extends CancellablePulseEvent {
   private final double horizontal;
   private final double vertical;

   public MouseScrollEvent(double horizontal, double vertical) {
      this.horizontal = horizontal;
      this.vertical = vertical;
   }

   public double horizontal() {
      return this.horizontal;
   }

   public double vertical() {
      return this.vertical;
   }

   public double d() {
      return this.horizontal;
   }

   public double e() {
      return this.vertical;
   }
}
