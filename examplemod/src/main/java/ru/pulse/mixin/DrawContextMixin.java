package ru.pulse.mixin;


import pulse.module.ModuleRegistry;
import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import java.util.List;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.PotionItem;
import net.minecraft.util.math.ColorHelper;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import pulse.EventBusService;
import pulse.ItemOverlayRenderEvent;
import pulse.AutoReissue;
import pulse.Cooldowns;
import pulse.HealingHelper;
import pulse.ItemHighlighter;
import pulse.CooldownInfo;

@Mixin(DrawContext.class)
public abstract class DrawContextMixin {
   @Shadow
   @Final
   private MatrixStack matrices;
   @Shadow
   @Final
   private MinecraftClient client;

   @Shadow
   public abstract int drawText(TextRenderer var1, @Nullable String var2, int var3, int var4, int var5, boolean var6);

   @Shadow
   public abstract void fill(RenderLayer var1, int var2, int var3, int var4, int var5, int var6);

   @Shadow
   public abstract void fill(RenderLayer var1, int var2, int var3, int var4, int var5, int var6, int var7);

   @Inject(
      method = "drawItem(Lnet/minecraft/entity/LivingEntity;Lnet/minecraft/world/World;Lnet/minecraft/item/ItemStack;IIII)V",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/util/math/MatrixStack;push()V", shift = Shift.AFTER)
   )
   private void renderItemHighlight(LivingEntity var1, World var2, ItemStack var3, int var4, int var5, int var6, int var7, CallbackInfo var8) {
      ItemHighlighter var9 = ModuleRegistry.ITEM_HIGHLIGHTER;
      if (var9 != null && var9.k() && var9.a(var3)) {
         Color var10 = var9.a(var3.getItem());
         int var11 = var9.n();
         int var12 = new Color(var10.getRed(), var10.getGreen(), var10.getBlue(), var11).getRGB();
         this.matrices.push();
         this.matrices.translate(0.0F, 0.0F, 100.0F);
         this.fill(RenderLayer.getGuiOverlay(), var4, var5, var4 + 16, var5 + 16, var12);
         this.matrices.pop();
      }
   }

   @Inject(
      method = "drawStackOverlay(Lnet/minecraft/client/font/TextRenderer;Lnet/minecraft/item/ItemStack;IILjava/lang/String;)V",
      at = @At("HEAD"),
      cancellable = true
   )
   private void onDrawStackOverlay(TextRenderer var1, ItemStack var2, int var3, int var4, @Nullable String var5, CallbackInfo var6) {
      if (!var2.isEmpty()) {
         this.matrices.push();
         if (var2.getCount() != 1 || var5 != null) {
            String var7 = var5 == null ? String.valueOf(var2.getCount()) : var5;
            this.matrices.translate(0.0F, 0.0F, 200.0F);
            this.drawText(var1, var7, var3 + 19 - 2 - var1.getWidth(var7), var4 + 6 + 3, -1, true);
         }

         if (var2.isItemBarVisible()) {
            int var26 = var2.getItemBarStep();
            int var8 = var2.getItemBarColor();
            int var9 = var3 + 2;
            int var10 = var4 + 13;
            this.fill(RenderLayer.getGui(), var9, var10, var9 + 13, var10 + 2, 200, -16777216);
            this.fill(RenderLayer.getGui(), var9, var10, var9 + var26, var10 + 1, 200, ColorHelper.fullAlpha(var8));
         }

         ClientPlayerEntity var27 = MinecraftClient.getInstance().player;
         Item var28 = var2.getItem();
         float var29 = 0.0F;
         if (var27 != null) {
            CooldownInfo.ItemCooldownSnapshot var30 = CooldownInfo.a(var27.getItemCooldownManager(), var28);
            var29 = var30.c();
         }

         Cooldowns var31 = ModuleRegistry.COOLDOWNS;
         boolean var11 = Cooldowns.a(var2);
         if (var31 != null && var31.k() && Cooldowns.a(var2)) {
            float var12 = var31.a(var2.getItem());
            if (var12 > var29) {
               var29 = var12;
            }
         }

         if (var29 > 0.0F) {
            boolean var32 = true;
            if (var2.getItem() instanceof PotionItem) {
               var32 = var11;
            }

            if (var32) {
               RenderSystem.disableDepthTest();
               RenderSystem.enableBlend();
               RenderSystem.defaultBlendFunc();
               int var13 = MathHelper.ceil(16.0F * var29);
               int var14 = var4 + MathHelper.floor(16.0F * (1.0F - var29));
               this.fill(RenderLayer.getGui(), var3, var14, var3 + 16, var14 + var13, 200, new Color(255, 255, 255, 127).getRGB());
               RenderSystem.enableDepthTest();
            }
         }

         if (var2.getItem() == Items.CLOCK) {
            AutoReissue var33 = ModuleRegistry.AUTO_REISSUE;
            if (var33 != null && var33.k()) {
               MinecraftClient var35 = MinecraftClient.getInstance();
               if (var35.currentScreen != null && var35.player.currentScreenHandler != null) {
                  String var38 = "";

                  try {
                     var38 = var35.currentScreen.getTitle().getString();
                  } catch (Exception var25) {
                  }

                  if (var33.overlayActive) {
                     long var15 = var33.timer.a(0L) ? var33.durationMs : 0L;

                     for (int var17 = 1; var17 <= var33.durationMs / 1000 + 1; var17++) {
                        if (!var33.timer.a(var17 * 1000)) {
                           var15 = (var17 - 1) * 1000;
                           break;
                        }
                     }

                     int var41 = Math.max(0, (var33.durationMs - (int)var15) / 1000);
                     float var18 = Math.max(0.0F, 1.0F - (float)var15 / var33.durationMs);
                     if (var41 > 0) {
                        byte var19 = 16;
                        int var20 = MathHelper.ceil(var19 * var18);
                        int var21 = var4 + (var19 - var20);
                        this.fill(RenderLayer.getGui(), var3, var21, var3 + 16, var21 + var20, 200, new Color(255, 255, 255, 127).getRGB());
                        String var22 = String.valueOf(var41);
                        int var23 = var3 + 8 - var1.getWidth(var22) / 2;
                        int var24 = var4 + 8 - 9 / 2;
                        this.matrices.push();
                        this.matrices.translate(0.0F, 0.0F, 300.0F);
                        this.drawText(var1, var22, var23, var24, -1, true);
                        this.matrices.pop();
                     }
                  }
               }
            }
         }

         HealingHelper var34 = ModuleRegistry.HEALING_HELPER;
         if (var34 != null && var34.k() && var34.a(var2)) {
            List<Item> var36 = var34.n();
            int var39 = var36.stream().mapToInt(var34::a).max().orElse(1);
            int var40 = var34.a(var2.getItem());
            float var16 = MathHelper.clamp((float)var40 / var39, 0.0F, 1.0F);
            int var42 = (int)(255.0F * (1.0F - var16));
            int var43 = (int)(255.0F * var16);
            int var44 = (int)((Math.sin(System.currentTimeMillis() / 100.0) * 0.5 + 0.5) * 100.0) + 50;
            int var45 = new Color(var42, var43, 0, var44).getRGB();
            this.matrices.push();
            this.matrices.translate(0.0F, 0.0F, 200.0F);
            this.fill(RenderLayer.getGuiOverlay(), var3, var4, var3 + 16, var4 + 16, var45);
            this.matrices.pop();
         }

         DrawContext var37 = (DrawContext)(Object)this;
         EventBusService.EVENT_BUS.post(new ItemOverlayRenderEvent(var2, var3, var4));
         this.matrices.pop();
         var6.cancel();
      }
   }
}
