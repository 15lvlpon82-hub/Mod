package pulse;

public class HudElementPlacement {
   private float normalizedCenterX;
   private float normalizedCenterY;

   public void update(float x, float y, float width, float height, float screenWidth, float screenHeight) {
      float centerX = x + width / 2.0F;
      float centerY = y + height / 2.0F;
      this.normalizedCenterX = clamp01(centerX / screenWidth);
      this.normalizedCenterY = clamp01(centerY / screenHeight);
   }

   public float resolveX(float width, float screenWidth) {
      return this.normalizedCenterX * screenWidth - width / 2.0F;
   }

   public float resolveY(float height, float screenHeight) {
      return this.normalizedCenterY * screenHeight - height / 2.0F;
   }

   public float normalizedCenterX() {
      return this.normalizedCenterX;
   }

   public float normalizedCenterY() {
      return this.normalizedCenterY;
   }

   public void setNormalizedCenterX(float normalizedCenterX) {
      this.normalizedCenterX = clamp01(normalizedCenterX);
   }

   public void setNormalizedCenterY(float normalizedCenterY) {
      this.normalizedCenterY = clamp01(normalizedCenterY);
   }

   public void a(float x, float y, float width, float height, float screenWidth, float screenHeight) {
      this.update(x, y, width, height, screenWidth, screenHeight);
   }

   public float a(float width, float screenWidth) {
      return this.resolveX(width, screenWidth);
   }

   public float b(float height, float screenHeight) {
      return this.resolveY(height, screenHeight);
   }

   public float a() {
      return this.normalizedCenterX();
   }

   public float b() {
      return this.normalizedCenterY();
   }

   public void a(float normalizedCenterX) {
      this.setNormalizedCenterX(normalizedCenterX);
   }

   public void b(float normalizedCenterY) {
      this.setNormalizedCenterY(normalizedCenterY);
   }

   private static float clamp01(float value) {
      return Math.max(0.0F, Math.min(1.0F, value));
   }
}
