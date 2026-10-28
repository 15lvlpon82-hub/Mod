package pulse;

public class PerspectiveDistanceAnimation {
   private static final float FIRST_PERSON_DISTANCE = 1.0F;
   private static final float THIRD_PERSON_DISTANCE = 4.0F;

   private float value = THIRD_PERSON_DISTANCE;
   private float startValue = THIRD_PERSON_DISTANCE;
   private float targetValue = THIRD_PERSON_DISTANCE;
   private long startTimeMs;
   private long durationMs = 300L;
   private final EasingFunction easing = Easing.C;
   private boolean thirdPerson;

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

   public void a(boolean thirdPerson, long durationMs) {
      this.durationMs = Math.max(1L, durationMs);
      if (thirdPerson && !this.thirdPerson) {
         this.startValue = FIRST_PERSON_DISTANCE;
         this.targetValue = THIRD_PERSON_DISTANCE;
         this.value = FIRST_PERSON_DISTANCE;
         this.startTimeMs = System.currentTimeMillis();
      } else if (!thirdPerson && this.thirdPerson) {
         this.startValue = this.value;
         this.targetValue = FIRST_PERSON_DISTANCE;
         this.startTimeMs = System.currentTimeMillis();
      }

      this.thirdPerson = thirdPerson;
   }

   public float b() {
      return this.value;
   }

   public boolean c() {
      return this.startTimeMs != 0L;
   }

   public void d() {
      this.value = THIRD_PERSON_DISTANCE;
      this.startValue = THIRD_PERSON_DISTANCE;
      this.targetValue = THIRD_PERSON_DISTANCE;
      this.startTimeMs = 0L;
      this.thirdPerson = false;
   }
}
