package pulse;

public class PlayerListScaleAnimation {
   private float value;
   private float startValue;
   private float targetValue = 1.0F;
   private long startTimeMs;
   private long durationMs = 200L;
   private final EasingFunction easing = Easing.h;
   private boolean shown;
   private boolean renderable;

   public void a(long durationMs) {
      this.durationMs = Math.max(1L, durationMs);
      this.startValue = this.value;
      this.targetValue = 1.0F;
      this.startTimeMs = System.currentTimeMillis();
      this.shown = true;
      this.renderable = true;
   }

   public void b(long durationMs) {
      this.durationMs = Math.max(1L, durationMs);
      this.startValue = this.value;
      this.targetValue = 0.0F;
      this.startTimeMs = System.currentTimeMillis();
      this.shown = false;
      this.renderable = true;
   }

   public void a() {
      if (this.startTimeMs == 0L) {
         return;
      }

      long elapsed = System.currentTimeMillis() - this.startTimeMs;
      if (elapsed >= this.durationMs) {
         this.value = this.targetValue;
         this.startTimeMs = 0L;
         if (!this.shown) {
            this.renderable = false;
         }
         return;
      }

      double progress = (double)elapsed / (double)this.durationMs;
      double easedProgress = this.easing.ease(progress);
      this.value = (float)(this.startValue + (this.targetValue - this.startValue) * easedProgress);
   }

   public float b() {
      return this.value;
   }

   public boolean c() {
      return this.shown;
   }

   public boolean d() {
      return this.renderable;
   }

   public boolean e() {
      return this.startTimeMs != 0L;
   }

   public void f() {
      this.value = 1.0F;
      this.startTimeMs = 0L;
      this.shown = true;
      this.renderable = true;
   }
}
