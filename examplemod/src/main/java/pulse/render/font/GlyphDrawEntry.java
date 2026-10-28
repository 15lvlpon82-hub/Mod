package pulse;

import java.util.Objects;

public final class GlyphDrawEntry {
   private final float x;
   private final float y;
   private final int color;
   private final FontGlyph glyph;

   public GlyphDrawEntry(float x, float y, int color, FontGlyph glyph) {
      this.x = x;
      this.y = y;
      this.color = color;
      this.glyph = glyph;
   }

   public float x() {
      return this.x;
   }

   public float y() {
      return this.y;
   }

   public int color() {
      return this.color;
   }

   public FontGlyph glyph() {
      return this.glyph;
   }

   public float a() {
      return this.x;
   }

   public float b() {
      return this.y;
   }

   public int c() {
      return this.color;
   }

   public FontGlyph d() {
      return this.glyph;
   }

   public float e() {
      return this.x;
   }

   public float f() {
      return this.y;
   }

   public int g() {
      return this.color;
   }

   public FontGlyph h() {
      return this.glyph;
   }

   @Override
   public boolean equals(Object other) {
      if (this == other) {
         return true;
      }

      if (!(other instanceof GlyphDrawEntry entry)) {
         return false;
      }

      return Float.compare(entry.x, this.x) == 0
         && Float.compare(entry.y, this.y) == 0
         && this.color == entry.color
         && Objects.equals(this.glyph, entry.glyph);
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.x, this.y, this.color, this.glyph);
   }

   @Override
   public String toString() {
      return "GlyphDrawEntry{"
         + "x="
         + this.x
         + ", y="
         + this.y
         + ", color="
         + this.color
         + ", glyph="
         + this.glyph
         + '}';
   }
}
