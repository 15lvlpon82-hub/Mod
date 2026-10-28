package pulse;

public class ChatInputSlideAnimation {
   private static final float START_OFFSET = 14.0F;

   private float value = Float.NaN;
   private float startValue;
   private float targetValue;
   private long startTimeMs;
   private long durationMs = 160L;
   private final EasingFunction easing = Easing.h;

   public void a() {
      if (Float.isNaN(this.value) || this.startTimeMs == 0L) {
         return;
      }

      long elapsed = System.currentTimeMillis() - this.startTimeMs;
      if (elapsed >= this.durationMs) {
         this.value = this.targetValue;
         this.startTimeMs = 0L;
         return;
      }

      double progress = (double)elapsed / (double)this.durationMs;
      double easedProgress = this.easing.ease(progress);
      this.value = (float)(this.startValue + (this.targetValue - this.startValue) * easedProgress);
   }

   public void a(long durationMs) {
      this.durationMs = Math.max(1L, durationMs);
      if (!Float.isNaN(this.value)) {
         if (this.value != this.targetValue) {
            this.startValue = this.value;
            this.targetValue = 0.0F;
            this.startTimeMs = System.currentTimeMillis();
         }
         return;
      }

      this.value = START_OFFSET;
      this.startValue = START_OFFSET;
      this.targetValue = 0.0F;
      this.startTimeMs = System.currentTimeMillis();
   }

   public float b() {
      return !Float.isNaN(this.value) ? this.value : 0.0F;
   }

   public boolean c() {
      return this.b() > 0.0F;
   }

   public void d() {
      this.value = Float.NaN;
      this.startTimeMs = 0L;
   }
}
