package pulse;

public class HudSnapGuide {
   private final Orientation orientation;
   private final Anchor anchor;
   private final float position;
   private final float start;
   private final float end;

   public HudSnapGuide(Orientation orientation, Anchor anchor, float position, float start, float end) {
      this.orientation = orientation;
      this.anchor = anchor;
      this.position = position;
      this.start = start;
      this.end = end;
   }

   public Orientation orientation() {
      return this.orientation;
   }

   public Anchor anchor() {
      return this.anchor;
   }

   public float position() {
      return this.position;
   }

   public float start() {
      return this.start;
   }

   public float end() {
      return this.end;
   }

   public Orientation a() {
      return this.orientation();
   }

   public Anchor b() {
      return this.anchor();
   }

   public float c() {
      return this.position();
   }

   public float d() {
      return this.start();
   }

   public float e() {
      return this.end();
   }

   public enum Anchor {
      SCREEN_EDGE,
      SCREEN_CENTER,
      ELEMENT_EDGE,
      ELEMENT_CENTER
   }

   public enum Orientation {
      HORIZONTAL,
      VERTICAL
   }
}
