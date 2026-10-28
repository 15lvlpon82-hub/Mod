package pulse.settings;

import java.awt.Color;
import java.util.function.Supplier;

public class ColorSetting extends Setting<Color> {
   private float hue;
   private float saturation;
   private float brightness;

   public ColorSetting(String name, String description, Color color) {
      super(name, description, color);
      this.updateHsb(color);
   }

   public ColorSetting(String name, Color color) {
      this(name, "", color);
   }

   public ColorSetting(String name, int red, int green, int blue) {
      this(name, "", new Color(red, green, blue));
   }

   public Color getColor() {
      return Color.getHSBColor(this.hue, this.saturation, this.brightness);
   }

   public void setColor(Color color) {
      this.updateHsb(color);
      super.a(color);
   }

   public int rgb() {
      return this.getColor().getRGB();
   }

   public float hue() {
      return this.hue;
   }

   public void setHue(float hue) {
      this.setHsb(hue, this.saturation, this.brightness);
   }

   public float saturation() {
      return this.saturation;
   }

   public void setSaturation(float saturation) {
      this.setHsb(this.hue, saturation, this.brightness);
   }

   public float brightness() {
      return this.brightness;
   }

   public void setBrightness(float brightness) {
      this.setHsb(this.hue, this.saturation, brightness);
   }

   public void setHsb(float hue, float saturation, float brightness) {
      this.hue = hue;
      this.saturation = saturation;
      this.brightness = brightness;
      super.a(this.getColor());
   }

   public ColorSetting visibleWhen(Supplier<Boolean> condition) {
      super.visibleWhen(condition);
      return this;
   }

   private void updateHsb(Color color) {
      float[] hsb = Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), null);
      this.hue = hsb[0];
      this.saturation = hsb[1];
      this.brightness = hsb[2];
   }

   public Color a() {
      return this.getColor();
   }

   public void a(Color color) {
      this.setColor(color);
   }

   public int b() {
      return this.rgb();
   }

   public float c() {
      return this.hue();
   }

   public void a(float value) {
      this.setHue(value);
   }

   public float d() {
      return this.saturation();
   }

   public void b(float value) {
      this.setSaturation(value);
   }

   public float e() {
      return this.brightness();
   }

   public void c(float value) {
      this.setBrightness(value);
   }

   public void a(float hue, float saturation, float brightness) {
      this.setHsb(hue, saturation, brightness);
   }

   public ColorSetting a(Supplier<Boolean> condition) {
      return this.visibleWhen(condition);
   }
}
