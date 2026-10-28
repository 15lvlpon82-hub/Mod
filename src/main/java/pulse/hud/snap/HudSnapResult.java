package pulse;

import java.util.Collections;
import java.util.List;

public class HudSnapResult {
   private final float x;
   private final float y;
   private final List<HudSnapGuide> guides;
   private final boolean snappedX;
   private final boolean snappedY;

   public HudSnapResult(float x, float y, List<HudSnapGuide> guides, boolean snappedX, boolean snappedY) {
      this.x = x;
      this.y = y;
      this.guides = guides;
      this.snappedX = snappedX;
      this.snappedY = snappedY;
   }

   public static HudSnapResult none(float x, float y) {
      return new HudSnapResult(x, y, Collections.emptyList(), false, false);
   }

   public float x() {
      return this.x;
   }

   public float y() {
      return this.y;
   }

   public List<HudSnapGuide> guides() {
      return this.guides;
   }

   public boolean snappedX() {
      return this.snappedX;
   }

   public boolean snappedY() {
      return this.snappedY;
   }

   public boolean snapped() {
      return this.snappedX || this.snappedY;
   }

   public static HudSnapResult a(float x, float y) {
      return none(x, y);
   }

   public float a() {
      return this.x();
   }

   public float b() {
      return this.y();
   }

   public List<HudSnapGuide> c() {
      return this.guides();
   }

   public boolean d() {
      return this.snappedX();
   }

   public boolean e() {
      return this.snappedY();
   }

   public boolean f() {
      return this.snapped();
   }
}
