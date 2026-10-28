package pulse;

import net.minecraft.item.ItemStack;

public class ItemOverlayRenderEvent extends PulseEvent {
   private final ItemStack stack;
   private final int x;
   private final int y;

   public ItemOverlayRenderEvent(ItemStack stack, int x, int y) {
      this.stack = stack;
      this.x = x;
      this.y = y;
   }

   public ItemStack stack() {
      return this.stack;
   }

   public int x() {
      return this.x;
   }

   public int y() {
      return this.y;
   }

   public ItemStack a() {
      return this.stack;
   }

   public int b() {
      return this.x;
   }

   public int c() {
      return this.y;
   }
}
