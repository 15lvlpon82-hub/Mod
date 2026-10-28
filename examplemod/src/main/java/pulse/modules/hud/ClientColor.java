package pulse;

import java.awt.Color;
import pulse.module.ClientModule;
import pulse.module.ModuleCategory;
import pulse.module.ModuleInfo;
import pulse.settings.ColorSetting;
import pulse.settings.ModeSetting;

@ModuleInfo(a = "Client Color", b = "Настройка основного цвета клиента", c = ModuleCategory.HUD)
public class ClientColor extends ClientModule {
   private static final String MODE_STATIC = "Статичный";
   private static final String MODE_GRADIENT = "Градиент";
   private static final String MODE_ASTOLFO = "Астольфо";
   private static final String MODE_RAINBOW = "Радуга";
   private static final String[] MODES = {MODE_STATIC, MODE_GRADIENT, MODE_ASTOLFO, MODE_RAINBOW};

   private static final int GRADIENT_DURATION_MS = 4000;
   private static final int ASTOLFO_DURATION_MS = 6000;
   private static final int RAINBOW_DURATION_MS = 6000;

   private static final Color DEFAULT_COLOR = new Color(138, 43, 226);
   private static final Color DEFAULT_GRADIENT_START = Color.WHITE;
   private static final Color DEFAULT_GRADIENT_END = new Color(0, 125, 245);
   private static final Color[] ASTOLFO_COLORS = {
      new Color(255, 121, 198),
      new Color(170, 70, 255),
      new Color(80, 181, 255)
   };

   public final ModeSetting a;
   public final ColorSetting b;
   public final ColorSetting e;
   public final ColorSetting f;
   public static int g;
   public static boolean h;

   public ClientColor() {
      this.a = new ModeSetting("Режим", MODES, MODE_STATIC);
      this.b = new ColorSetting("Цвет", DEFAULT_COLOR).a(() -> this.a.b(MODE_STATIC));
      this.e = new ColorSetting("Цвет #1", DEFAULT_GRADIENT_START).a(() -> this.a.b(MODE_GRADIENT));
      this.f = new ColorSetting("Цвет #2", DEFAULT_GRADIENT_END).a(() -> this.a.b(MODE_GRADIENT));
   }

   public Color n() {
      String mode = this.a.d();

      if (MODE_STATIC.equals(mode)) {
         return this.b.a();
      }

      if (MODE_GRADIENT.equals(mode)) {
         return this.animatedGradient();
      }

      if (MODE_ASTOLFO.equals(mode)) {
         return cycleColors(ASTOLFO_COLORS, ASTOLFO_DURATION_MS);
      }

      if (MODE_RAINBOW.equals(mode)) {
         return Color.getHSBColor(linearProgress(RAINBOW_DURATION_MS), 1.0F, 1.0F);
      }

      return this.b.a();
   }

   public int o() {
      return this.n().getRGB();
   }

   private Color animatedGradient() {
      float progress = sineProgress(GRADIENT_DURATION_MS);
      return interpolate(this.e.a(), this.f.a(), progress);
   }

   private static Color cycleColors(Color[] colors, int durationMs) {
      if (colors.length == 0) {
         return Color.WHITE;
      }

      float scaledProgress = linearProgress(durationMs) * colors.length;
      int currentIndex = (int)scaledProgress % colors.length;
      int nextIndex = (currentIndex + 1) % colors.length;
      float localProgress = scaledProgress - (int)scaledProgress;

      return interpolate(colors[currentIndex], colors[nextIndex], localProgress);
   }

   private static float sineProgress(int durationMs) {
      double cycle = (System.currentTimeMillis() % durationMs) * (Math.PI * 2.0D / durationMs);
      return (float)(0.5D * (1.0D + Math.sin(cycle)));
   }

   private static float linearProgress(int durationMs) {
      return (float)(System.currentTimeMillis() % durationMs) / (float)durationMs;
   }

   private static Color interpolate(Color start, Color end, float progress) {
      float clampedProgress = Math.max(0.0F, Math.min(1.0F, progress));
      int red = lerp(start.getRed(), end.getRed(), clampedProgress);
      int green = lerp(start.getGreen(), end.getGreen(), clampedProgress);
      int blue = lerp(start.getBlue(), end.getBlue(), clampedProgress);
      int alpha = lerp(start.getAlpha(), end.getAlpha(), clampedProgress);
      return new Color(red, green, blue, alpha);
   }

   private static int lerp(int start, int end, float progress) {
      return (int)(start + (end - start) * progress);
   }
}
