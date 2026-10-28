package pulse;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;
import java.io.InputStream;

public class FontManager {
   public static final FontRenderer[] REGULAR = new FontRenderer[65];
   public static final FontRenderer[] MEDIUM;
   public static final FontRenderer[] ICONS;
   public static final FontRenderer[] PULSE_ICONS;
   public static final FontRenderer[] SMALL_ICONS;

   private static FontRenderer load(float size, String fileName) {
      try (InputStream stream = FontManager.class.getResourceAsStream("/assets/pulse/font/".concat(fileName))) {
         assert stream != null;
         Font font = Font.createFont(Font.TRUETYPE_FONT, stream).deriveFont(Font.PLAIN, size / 2.0F);
         return new FontRenderer(font, size / 2.0F);
      } catch (IOException | FontFormatException exception) {
         throw new RuntimeException(exception);
      }
   }

   static {
      for (int size = 6; size < 65; size++) {
         REGULAR[size] = load(size, "sfprodisplayregular.ttf");
      }

      MEDIUM = new FontRenderer[65];

      for (int size = 6; size < 65; size++) {
         MEDIUM[size] = load(size, "sfprodisplay-medium-test.ttf");
      }

      ICONS = new FontRenderer[65];

      for (int size = 6; size < 65; size++) {
         ICONS[size] = load(size, "icons.ttf");
      }

      PULSE_ICONS = new FontRenderer[265];

      for (int size = 6; size < 265; size++) {
         PULSE_ICONS[size] = load(size, "pulseicon.ttf");
      }

      SMALL_ICONS = new FontRenderer[65];

      for (int size = 6; size < 65; size++) {
         SMALL_ICONS[size] = load(size, "pulse_icons.ttf");
      }

      a = REGULAR;
      b = MEDIUM;
      c = ICONS;
      d = PULSE_ICONS;
      e = SMALL_ICONS;
   }

   public static final FontRenderer[] a;
   public static final FontRenderer[] b;
   public static final FontRenderer[] c;
   public static final FontRenderer[] d;
   public static final FontRenderer[] e;
}
