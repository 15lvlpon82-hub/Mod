package pulse;

public class ChatMessageSlideAnimation {
   private float value;
   private float startValue;
   private float targetValue;
   private long startTimeMs;
   private long durationMs;
   private final EasingFunction easing;

   public ChatMessageSlideAnimation(float startValue, float targetValue, long durationMs) {
      this.easing = Easing.h;
      this.value = startValue;
      this.startValue = startValue;
      this.targetValue = targetValue;
      this.durationMs = Math.max(1L, durationMs);
      this.startTimeMs = System.currentTimeMillis();
   }

   public void a() {
      if (this.startTimeMs == 0L) {
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

   public float b() {
      return this.value;
   }

   public boolean c() {
      return this.startTimeMs != 0L;
   }

   public boolean d() {
      return this.startTimeMs == 0L && this.value == this.targetValue;
   }
}
