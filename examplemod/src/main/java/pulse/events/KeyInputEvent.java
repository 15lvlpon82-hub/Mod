package pulse;

public class KeyInputEvent extends PulseEvent {
   private final int keyCode;
   private final int scanCode;
   private final int action;
   private final int modifiers;

   public KeyInputEvent(int keyCode, int scanCode, int action, int modifiers) {
      this.keyCode = keyCode;
      this.scanCode = scanCode;
      this.action = action;
      this.modifiers = modifiers;
   }

   public int keyCode() {
      return this.keyCode;
   }

   public int scanCode() {
      return this.scanCode;
   }

   public int action() {
      return this.action;
   }

   public int modifiers() {
      return this.modifiers;
   }

   public int a() {
      return this.keyCode;
   }

   public int b() {
      return this.scanCode;
   }

   public int c() {
      return this.action;
   }

   public int d() {
      return this.modifiers;
   }
}
