package pulse;

public class HotbarSelectionAnimation {
   private static final int UNSET_SLOT = -1;
   private static final int HOTBAR_LEFT_OFFSET = 91;
   private static final int HOTBAR_SLOT_WIDTH = 20;
   private static final int SELECTION_TEXTURE_OFFSET = 1;

   private float value = Float.NaN;
   private float startValue;
   private float targetValue;
   private long startTimeMs;
   private long durationMs = 160L;
   private int selectedSlot = UNSET_SLOT;
   private final EasingFunction easing = Easing.h;

   public void a() {
      if (Float.isNaN(this.value) || this.startTimeMs == 0L) {
         return;
      }

      long elapsed = System.currentTimeMillis() - this.startTimeMs;
      if (elapsed >= this.durationMs) {
         this.value = this.targetValue;
         this.startTimeMs = 0L;
         return;
      }

      double progress = (double)elapsed / (double)this.durationMs;
      double easedProgress = this.easing.ease(progress);
      this.value = (float)(this.startValue + (this.targetValue - this.startValue) * easedProgress);
   }

   public void a(int selectedSlot, int centerX, long durationMs) {
      this.durationMs = Math.max(1L, durationMs);
      float newTarget = centerX - HOTBAR_LEFT_OFFSET - SELECTION_TEXTURE_OFFSET + selectedSlot * HOTBAR_SLOT_WIDTH;

      if (this.selectedSlot == UNSET_SLOT || Float.isNaN(this.value)) {
         this.selectedSlot = selectedSlot;
         this.value = newTarget;
         this.startValue = newTarget;
         this.targetValue = newTarget;
         this.startTimeMs = 0L;
      } else if (selectedSlot == this.selectedSlot) {
         this.targetValue = newTarget;
         if (this.startTimeMs == 0L) {
            this.value = newTarget;
         }
      } else {
         this.startValue = this.value;
         this.targetValue = newTarget;
         this.startTimeMs = System.currentTimeMillis();
         this.selectedSlot = selectedSlot;
      }
   }

   public float b() {
      return !Float.isNaN(this.value) ? this.value : 0.0F;
   }

   public boolean c() {
      return this.startTimeMs != 0L;
   }

   public void d() {
      this.value = Float.NaN;
      this.startTimeMs = 0L;
      this.selectedSlot = UNSET_SLOT;
   }
}
