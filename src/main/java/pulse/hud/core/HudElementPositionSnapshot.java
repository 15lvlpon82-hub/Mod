package pulse;

public class HudElementPositionSnapshot {
   private final HudElement element;
   private final float x;
   private final float y;

   public HudElementPositionSnapshot(HudElement element) {
      this.element = element;
      this.x = element.l();
      this.y = element.m();
   }

   public void restore() {
      this.element.a(this.x);
      this.element.b(this.y);
   }

   public HudElement element() {
      return this.element;
   }

   public float x() {
      return this.x;
   }

   public float y() {
      return this.y;
   }

   public void a() {
      this.restore();
   }

   public HudElement b() {
      return this.element();
   }

   public float c() {
      return this.x();
   }

   public float d() {
      return this.y();
   }
}
