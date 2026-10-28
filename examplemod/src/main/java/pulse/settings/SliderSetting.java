package pulse.settings;

import java.util.function.Supplier;

public class SliderSetting extends Setting<Float> {
   private final float min;
   private final float max;
   private final float step;

   public SliderSetting(String name, String description, float value, float min, float max, float step) {
      super(name, description, value);
      this.min = min;
      this.max = max;
      this.step = step;
      this.set(value);
   }

   public SliderSetting(String name, float value, float min, float max, float step) {
      this(name, "", value, min, max, step);
   }

   public SliderSetting(String name, float value, float min, float max) {
      this(name, "", value, min, max, 0.1F);
   }

   public float get() {
      return this.k();
   }

   public void set(float value) {
      float rounded = Math.round(value / this.step) * this.step;
      super.a(Math.max(this.min, Math.min(this.max, rounded)));
   }

   public int roundedInt() {
      return Math.round(this.get());
   }

   public float min() {
      return this.min;
   }

   public float max() {
      return this.max;
   }

   public float step() {
      return this.step;
   }

   public SliderSetting visibleWhen(Supplier<Boolean> condition) {
      super.visibleWhen(condition);
      return this;
   }

   public float a() {
      return this.get();
   }

   public void a(float value) {
      this.set(value);
   }

   public int b() {
      return this.roundedInt();
   }

   public float c() {
      return this.min();
   }

   public float d() {
      return this.max();
   }

   public float e() {
      return this.step();
   }

   public SliderSetting a(Supplier<Boolean> condition) {
      return this.visibleWhen(condition);
   }
}
