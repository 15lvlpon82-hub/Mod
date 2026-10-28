package pulse;

public class AnimationState {
   private long startTimeMs;
   private double durationMs;
   private double startValue;
   private double targetValue;
   private double currentValue;
   private EasingFunction easing;
   private AnimationMode mode;

   public AnimationState() {
      this(Easing.f, AnimationMode.EASING);
   }

   public AnimationState(EasingFunction easing, AnimationMode mode) {
      this.easing = easing;
      this.mode = mode;
   }

   public AnimationState a(double target, double seconds, EasingFunction easing, boolean keepCurrentAnimation) {
      if (this.a(keepCurrentAnimation, target)) {
         return this;
      }

      this.a(AnimationMode.EASING)
         .a(easing)
         .a(seconds * 1000.0)
         .a(System.currentTimeMillis())
         .b(this.currentValue)
         .c(target);
      return this;
   }

   public AnimationState a(double target, double seconds) {
      return this.a(target, seconds, Easing.f, false);
   }

   public AnimationState a(double target, double seconds, EasingFunction easing) {
      return this.a(target, seconds, easing, false);
   }

   public AnimationState a(double target, double seconds, boolean keepCurrentAnimation) {
      return this.a(target, seconds, Easing.f, keepCurrentAnimation);
   }

   public boolean a() {
      if (this.b()) {
         this.e(this.a(this.startValue, this.targetValue, this.easing.ease(this.e())));
         return true;
      }

      this.d(this.targetValue);
      this.a(0L);
      return false;
   }

   public boolean b() {
      return !this.d();
   }

   public boolean c() {
      return this.j() > 0.0;
   }

   public boolean d() {
      return this.e() >= 1.0;
   }

   public double e() {
      return this.durationMs > 0.0 ? (System.currentTimeMillis() - this.startTimeMs) / this.durationMs : 1.0;
   }

   public boolean a(boolean keepCurrentAnimation, double target) {
      return keepCurrentAnimation
         && this.b()
         && (target == this.startValue || target == this.targetValue || target == this.currentValue);
   }

   public double a(double start, double end, double progress) {
      return start + (end - start) * progress;
   }

   public AnimationState a(long startTimeMs) {
      this.startTimeMs = startTimeMs;
      return this;
   }

   public AnimationState a(double durationMs) {
      this.durationMs = durationMs;
      return this;
   }

   public AnimationState b(double startValue) {
      this.startValue = startValue;
      return this;
   }

   public AnimationState c(double targetValue) {
      this.targetValue = targetValue;
      return this;
   }

   public AnimationState d(double value) {
      this.currentValue = value;
      this.startValue = value;
      this.targetValue = value;
      return this;
   }

   private AnimationState e(double currentValue) {
      this.currentValue = currentValue;
      return this;
   }

   public AnimationState a(EasingFunction easing) {
      this.easing = easing;
      return this;
   }

   public AnimationState a(AnimationMode mode) {
      this.mode = mode;
      return this;
   }

   public long f() {
      return this.startTimeMs;
   }

   public double g() {
      return this.durationMs;
   }

   public double h() {
      return this.startValue;
   }

   public double i() {
      return this.targetValue;
   }

   public double j() {
      return this.currentValue;
   }

   public EasingFunction k() {
      return this.easing;
   }

   public AnimationMode l() {
      return this.mode;
   }
}
