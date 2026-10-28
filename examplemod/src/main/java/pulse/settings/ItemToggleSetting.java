package pulse.settings;

import java.awt.Color;
import net.minecraft.item.Item;

public class ItemToggleSetting extends Setting<Boolean> {
   private final Item item;
   private Color color;

   public ItemToggleSetting(String name, String description, Item item, boolean value, Color color) {
      super(name, description, value);
      this.item = item;
      this.color = color;
   }

   public ItemToggleSetting(String name, Item item, boolean value, Color color) {
      this(name, "", item, value, color);
   }

   public ItemToggleSetting(String name, Item item, Color color) {
      this(name, "", item, false, color);
   }

   public boolean get() {
      return this.k();
   }

   public void set(boolean value) {
      super.a(value);
   }

   public void toggle() {
      this.set(!this.get());
   }

   public Item item() {
      return this.item;
   }

   public Color color() {
      return this.color;
   }

   public int rgb() {
      return this.color.getRGB();
   }

   public void setColor(Color color) {
      this.color = color;
   }

   public boolean a() {
      return this.get();
   }

   public void a(boolean value) {
      this.set(value);
   }

   public void b() {
      this.toggle();
   }

   public Item c() {
      return this.item();
   }

   public Color d() {
      return this.color();
   }

   public int e() {
      return this.rgb();
   }

   public void a(Color color) {
      this.setColor(color);
   }
}
