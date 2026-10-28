package pulse;

import meteordevelopment.orbit.ICancellable;

public abstract class CancellablePulseEvent extends PulseEvent implements ICancellable {
   private boolean cancelled;

   public void a() {
      this.setCancelled(true);
   }

   public void b() {
      this.setCancelled(false);
   }

   public boolean c() {
      return this.cancelled;
   }

   public void a(boolean cancelled) {
      this.setCancelled(cancelled);
   }

   @Override
   public boolean isCancelled() {
      return this.cancelled;
   }

   @Override
   public void setCancelled(boolean cancelled) {
      this.cancelled = cancelled;
   }
}

