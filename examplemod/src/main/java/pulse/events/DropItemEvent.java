package pulse;

public class DropItemEvent extends CancellablePulseEvent {
   private final int slot;
   private final boolean dropEntireStack;

   public DropItemEvent(int slot, boolean dropEntireStack) {
      this.slot = slot;
      this.dropEntireStack = dropEntireStack;
   }

   public int slot() {
      return this.slot;
   }

   public boolean dropEntireStack() {
      return this.dropEntireStack;
   }

   public int d() {
      return this.slot;
   }

   public boolean e() {
      return this.dropEntireStack;
   }
}
