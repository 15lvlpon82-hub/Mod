package pulse;

public final class Easing {
   public static final double BACK_OVERSHOOT = 1.70158;
   public static final double BACK_OVERSHOOT_IN_OUT = 2.5949095;
   public static final double BACK_OVERSHOOT_PLUS_ONE = 2.70158;
   public static final double ELASTIC_PERIOD = Math.PI * 2.0 / 3.0;
   public static final double ELASTIC_PERIOD_IN_OUT = Math.PI * 4.0 / 9.0;

   public static final EasingFunction f = progress -> progress;

   public static final EasingFunction g = a(2.0);
   public static final EasingFunction h = b(2.0);
   public static final EasingFunction i = c(2.0);
   public static final EasingFunction j = a(3.0);
   public static final EasingFunction k = b(3.0);
   public static final EasingFunction l = c(3.0);
   public static final EasingFunction m = a(4.0);
   public static final EasingFunction n = b(4.0);
   public static final EasingFunction o = c(4.0);
   public static final EasingFunction p = a(5.0);
   public static final EasingFunction q = b(5.0);
   public static final EasingFunction r = c(5.0);

   public static final EasingFunction s = progress -> 1.0 - Math.cos(progress * Math.PI / 2.0);
   public static final EasingFunction t = progress -> Math.sin(progress * Math.PI / 2.0);
   public static final EasingFunction u = progress -> -(Math.cos(Math.PI * progress) - 1.0) / 2.0;

   public static final EasingFunction v = progress -> 1.0 - Math.sqrt(1.0 - Math.pow(progress, 2.0));
   public static final EasingFunction w = progress -> Math.sqrt(1.0 - Math.pow(progress - 1.0, 2.0));
   public static final EasingFunction x = progress -> progress < 0.5
      ? (1.0 - Math.sqrt(1.0 - Math.pow(2.0 * progress, 2.0))) / 2.0
      : (Math.sqrt(1.0 - Math.pow(-2.0 * progress + 2.0, 2.0)) + 1.0) / 2.0;

   public static final EasingFunction y = progress -> progress == 0.0 ? 0.0 : Math.pow(2.0, 10.0 * progress - 10.0);
   public static final EasingFunction z = progress -> progress == 1.0 ? 1.0 : 1.0 - Math.pow(2.0, -10.0 * progress);
   public static final EasingFunction A = progress -> {
      if (progress == 0.0 || progress == 1.0) {
         return progress;
      }

      return progress < 0.5
         ? Math.pow(2.0, 20.0 * progress - 10.0) / 2.0
         : (2.0 - Math.pow(2.0, -20.0 * progress + 10.0)) / 2.0;
   };

   public static final EasingFunction B = progress ->
      BACK_OVERSHOOT_PLUS_ONE * Math.pow(progress, 3.0) - BACK_OVERSHOOT * Math.pow(progress, 2.0);

   public static final EasingFunction C = progress ->
      1.0 + BACK_OVERSHOOT_PLUS_ONE * Math.pow(progress - 1.0, 3.0) + BACK_OVERSHOOT * Math.pow(progress - 1.0, 2.0);

   public static final EasingFunction D = progress -> progress < 0.5
      ? Math.pow(2.0 * progress, 2.0) * ((BACK_OVERSHOOT_IN_OUT + 1.0) * 2.0 * progress - BACK_OVERSHOOT_IN_OUT) / 2.0
      : (
            Math.pow(2.0 * progress - 2.0, 2.0)
               * ((BACK_OVERSHOOT_IN_OUT + 1.0) * (progress * 2.0 - 2.0) + BACK_OVERSHOOT_IN_OUT)
               + 2.0
         ) / 2.0;

   public static final EasingFunction E = progress -> {
      if (progress == 0.0 || progress == 1.0) {
         return progress;
      }

      return -Math.pow(2.0, 10.0 * progress - 10.0) * Math.sin((progress * 10.0 - 10.75) * ELASTIC_PERIOD);
   };

   public static final EasingFunction F = progress -> {
      if (progress == 0.0 || progress == 1.0) {
         return progress;
      }

      return Math.pow(2.0, -10.0 * progress) * Math.sin((progress * 10.0 - 0.75) * ELASTIC_PERIOD) + 1.0;
   };

   public static final EasingFunction G = progress -> {
      if (progress == 0.0 || progress == 1.0) {
         return progress;
      }

      return progress < 0.5
         ? -(Math.pow(2.0, 20.0 * progress - 10.0) * Math.sin((20.0 * progress - 11.125) * ELASTIC_PERIOD_IN_OUT)) / 2.0
         : Math.pow(2.0, -20.0 * progress + 10.0) * Math.sin((20.0 * progress - 11.125) * ELASTIC_PERIOD_IN_OUT) / 2.0 + 1.0;
   };

   public static final EasingFunction H = progress -> {
      double first = 7.5625;
      double second = 2.75;

      if (progress < 1.0 / second) {
         return first * progress * progress;
      }

      if (progress < 2.0 / second) {
         double shifted = progress - 1.5 / second;
         return first * shifted * shifted + 0.75;
      }

      if (progress < 2.5 / second) {
         double shifted = progress - 2.25 / second;
         return first * shifted * shifted + 0.9375;
      }

      double shifted = progress - 2.625 / second;
      return first * shifted * shifted + 0.984375;
   };

   public static final EasingFunction I = progress -> 1.0 - H.ease(1.0 - progress);
   public static final EasingFunction J = progress -> progress < 0.5
      ? (1.0 - H.ease(1.0 - 2.0 * progress)) / 2.0
      : (1.0 + H.ease(2.0 * progress - 1.0)) / 2.0;

   private Easing() {
   }

   public static EasingFunction a(double power) {
      return progress -> Math.pow(progress, power);
   }

   public static EasingFunction a(int power) {
      return a((double)power);
   }

   public static EasingFunction b(double power) {
      return progress -> 1.0 - Math.pow(1.0 - progress, power);
   }

   public static EasingFunction b(int power) {
      return b((double)power);
   }

   public static EasingFunction c(double power) {
      return progress -> progress < 0.5
         ? Math.pow(2.0, power - 1.0) * Math.pow(progress, power)
         : 1.0 - Math.pow(-2.0 * progress + 2.0, power) / 2.0;
   }
}
