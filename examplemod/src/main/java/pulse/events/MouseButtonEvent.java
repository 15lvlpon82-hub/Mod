package pulse;

public class MouseButtonEvent extends CancellablePulseEvent {
   private final int button;
   private final int action;
   private final int modifiers;
   private final double mouseX;
   private final double mouseY;

   public MouseButtonEvent(int button, int action, int modifiers, double mouseX, double mouseY) {
      this.button = button;
      this.action = action;
      this.modifiers = modifiers;
      this.mouseX = mouseX;
      this.mouseY = mouseY;
   }

   public int button() {
      return this.button;
   }

   public int action() {
      return this.action;
   }

   public int modifiers() {
      return this.modifiers;
   }

   public double mouseX() {
      return this.mouseX;
   }

   public double mouseY() {
      return this.mouseY;
   }

   public int d() {
      return this.button;
   }

   public int e() {
      return this.action;
   }

   public int f() {
      return this.modifiers;
   }

   public double g() {
      return this.mouseX;
   }

   public double h() {
      return this.mouseY;
   }
}
