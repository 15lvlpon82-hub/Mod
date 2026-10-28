package ru.pulse.mixin;


import pulse.module.ModuleRegistry;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.screen.slot.Slot;
import net.minecraft.screen.slot.SlotActionType;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.glfw.GLFW;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import pulse.Cooldowns;
import pulse.FastSwap;
import pulse.KeyNameFormatter;
import pulse.ElapsedTimer;
import pulse.CooldownInfo;

@Mixin(HandledScreen.class)
public class HandledScreenMixin {
   @Shadow
   protected int x;
   @Shadow
   protected int y;
   @Shadow
   @Nullable
   protected Slot focusedSlot;
   @Unique
   private ElapsedTimer scrollTime;

   @Unique
   private ElapsedTimer getScrollTime() {
      if (this.scrollTime == null) {
         this.scrollTime = new ElapsedTimer();
      }

      return this.scrollTime;
   }

   @Inject(method = "render", at = @At("TAIL"))
   private void renderItemBindsOverlay(DrawContext var1, int var2, int var3, float var4, CallbackInfo var5) {
      HandledScreen var6 = (HandledScreen)(Object)this;
      FastSwap var7 = ModuleRegistry.FAST_SWAP;
      boolean var8 = var7 != null && var7.E().k() && var7.k();
      Cooldowns var9 = ModuleRegistry.COOLDOWNS;
      TextRenderer var10 = MinecraftClient.getInstance().textRenderer;

      for (Slot var12 : var6.getScreenHandler().slots) {
         ItemStack var13 = var12.getStack();
         if (!var13.isEmpty()) {
            int var14 = this.getKey(var13, var7);
            boolean var15 = var9 != null && var9.k() && var9.n() && this.hasAnyCooldown(var13, var9);
            boolean var16 = var14 != -1 && var14 != 0;
            if (var15 || var16) {
               int var17 = var12.x + this.x;
               int var18 = var12.y + this.y;
               if (var16 && !var15 && var8) {
                  MatrixStack var19 = var1.getMatrices();
                  var19.push();
                  var19.translate(0.0F, 0.0F, 300.0F);
                  String var20 = KeyNameFormatter.a(var14);
                  float var21 = var10.getWidth(var20);
                  float var22 = 14.0F;
                  float var23 = Math.min(1.0F, var22 / var21);
                  float var24 = var7.F().k();
                  float var25 = var23 * var24;
                  var19.scale(var25, var25, 1.0F);
                  var1.drawText(var10, var20, (int)((var17 + 0.5F) / var25), (int)((var18 + 0.5F) / var25), 16777215, true);
                  var19.pop();
               }

               if (var15) {
                  CooldownInfo.ItemCooldownSnapshot var29 = CooldownInfo.a(MinecraftClient.getInstance().player.getItemCooldownManager(), var13.getItem());
                  int var30;
                  int var31;
                  if (Cooldowns.a(var13) && var9.b(var13.getItem())) {
                     float var33 = var9.a(var13.getItem());
                     var30 = (int)Math.ceil(var33 * 18.5);
                     var31 = var33 <= 0.33F ? 65280 : (var33 <= 0.66F ? 16776960 : 16711680);
                  } else {
                     var30 = (int)Math.ceil(var29.b());
                     float var32 = var29.c();
                     var31 = var32 <= 0.33F ? 65280 : (var32 <= 0.66F ? 16776960 : 16711680);
                  }

                  MatrixStack var34 = var1.getMatrices();
                  var34.push();
                  var34.translate(0.0F, 0.0F, 300.0F);
                  String var35 = String.valueOf(var30);
                  float var36 = var10.getWidth(var35);
                  float var37 = 14.0F;
                  float var26 = Math.min(1.0F, var37 / var36);
                  float var27 = var9.q().k();
                  float var28 = var26 * var27;
                  var34.scale(var28, var28, 1.0F);
                  var1.drawText(var10, var35, (int)((var17 + 0.5F) / var28), (int)((var18 + 0.5F) / var28), var31, true);
                  var34.pop();
               }
            }
         }
      }

      this.handleItemScroller();
   }

   @Unique
   private void handleItemScroller() {
      if (ModuleRegistry.ITEM_SCROLLER.k()) {
         MinecraftClient var1 = MinecraftClient.getInstance();
         if (var1.player != null && var1.currentScreen != null) {
            if (this.focusedSlot != null && this.focusedSlot.hasStack() && this.focusedSlot.getStack().getItem() != Items.AIR) {
               long var2 = var1.getWindow().getHandle();
               boolean var4 = GLFW.glfwGetMouseButton(var2, 0) == 1;
               boolean var5 = GLFW.glfwGetKey(var2, 340) == 1;
               if (var4 && var5) {
                  long var6 = ModuleRegistry.ITEM_SCROLLER.delay.k().longValue();
                  if (this.getScrollTime().a(var6)) {
                     HandledScreen var8 = (HandledScreen)(Object)this;
                     var1.interactionManager.clickSlot(var8.getScreenHandler().syncId, this.focusedSlot.id, 0, SlotActionType.QUICK_MOVE, var1.player);
                     this.getScrollTime().b();
                  }
               }
            }
         }
      }
   }

   @Unique
   private boolean hasAnyCooldown(ItemStack var1, Cooldowns var2) {
      CooldownInfo.ItemCooldownSnapshot var3 = CooldownInfo.a(MinecraftClient.getInstance().player.getItemCooldownManager(), var1.getItem());
      return var3.a() || Cooldowns.a(var1) && var2.b(var1.getItem());
   }

   @Unique
   private int getKey(ItemStack var1, FastSwap var2) {
      if (var2 == null) {
         return -1;
      } else {
         Item var3 = var1.getItem();
         if (var3 == Items.NETHERITE_SCRAP) {
            return this.getKeyOrDefault(var2.q().a());
         } else if (var3 == Items.DRIED_KELP) {
            return this.getKeyOrDefault(var2.r().a());
         } else if (var3 == Items.ENDER_EYE) {
            int var4 = var2.s().a();
            return var4 > 0 ? var4 : this.getKeyOrDefault(var2.y().a());
         } else if (var3 == Items.SUGAR) {
            return this.getKeyOrDefault(var2.t().a());
         } else if (var3 == Items.CHORUS_FRUIT) {
            return this.getKeyOrDefault(var2.n().a());
         } else if (var3 == Items.ENDER_PEARL) {
            return this.getKeyOrDefault(var2.o().a());
         } else if (var3 == Items.POTION && var2.a(var1)) {
            return this.getKeyOrDefault(var2.p().a());
         } else if (var3 == Items.NETHER_STAR) {
            return this.getKeyOrDefault(var2.u().a());
         } else if (var3 == Items.SLIME_BALL) {
            return this.getKeyOrDefault(var2.v().a());
         } else if (var3 == Items.TURTLE_SCUTE) {
            return this.getKeyOrDefault(var2.w().a());
         } else if (var3 == Items.COBWEB) {
            return this.getKeyOrDefault(var2.x().a());
         } else {
            return var3 == Items.FIREWORK_STAR ? this.getKeyOrDefault(var2.z().a()) : -1;
         }
      }
   }

   @Unique
   private int getKeyOrDefault(int var1) {
      return var1 <= 0 ? -1 : var1;
   }
}
