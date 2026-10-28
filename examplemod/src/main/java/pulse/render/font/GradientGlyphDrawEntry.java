package pulse;

import java.util.Objects;

public final class GradientGlyphDrawEntry {
   private final float x;
   private final float y;
   private final int topColor;
   private final int bottomColor;
   private final FontGlyph glyph;
   private final float totalHeight;

   public GradientGlyphDrawEntry(float x, float y, int topColor, int bottomColor, FontGlyph glyph, float totalHeight) {
      this.x = x;
      this.y = y;
      this.topColor = topColor;
      this.bottomColor = bottomColor;
      this.glyph = glyph;
      this.totalHeight = totalHeight;
   }

   public float x() {
      return this.x;
   }

   public float y() {
      return this.y;
   }

   public int topColor() {
      return this.topColor;
   }

   public int bottomColor() {
      return this.bottomColor;
   }

   public FontGlyph glyph() {
      return this.glyph;
   }

   public float totalHeight() {
      return this.totalHeight;
   }

   public float a() {
      return this.x;
   }

   public float b() {
      return this.y;
   }

   public int c() {
      return this.topColor;
   }

   public int d() {
      return this.bottomColor;
   }

   public FontGlyph e() {
      return this.glyph;
   }

   public float f() {
      return this.totalHeight;
   }

   @Override
   public boolean equals(Object other) {
      if (this == other) {
         return true;
      }

      if (!(other instanceof GradientGlyphDrawEntry entry)) {
         return false;
      }

      return Float.compare(entry.x, this.x) == 0
         && Float.compare(entry.y, this.y) == 0
         && this.topColor == entry.topColor
         && this.bottomColor == entry.bottomColor
         && Float.compare(entry.totalHeight, this.totalHeight) == 0
         && Objects.equals(this.glyph, entry.glyph);
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.x, this.y, this.topColor, this.bottomColor, this.glyph, this.totalHeight);
   }

   @Override
   public String toString() {
      return "GradientGlyphDrawEntry{"
         + "x="
         + this.x
         + ", y="
         + this.y
         + ", topColor="
         + this.topColor
         + ", bottomColor="
         + this.bottomColor
         + ", glyph="
         + this.glyph
         + ", totalHeight="
         + this.totalHeight
         + '}';
   }
}
