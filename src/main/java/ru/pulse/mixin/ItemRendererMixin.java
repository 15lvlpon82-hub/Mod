package ru.pulse.mixin;


import pulse.module.ModuleRegistry;
import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import java.util.List;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat.DrawMode;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.math.MathHelper;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import pulse.EventBusService;
import pulse.ItemOverlayRenderEvent;
import pulse.AutoReissue;
import pulse.Cooldowns;
import pulse.HealingHelper;
import pulse.ItemHighlighter;
import pulse.CooldownInfo;

@Mixin(ItemRenderer.class)
public abstract class ItemRendererMixin {
   public void renderGuiItemOverlay(DrawContext var1, TextRenderer var2, ItemStack var3, int var4, int var5) {
      this.renderGuiItemOverlay(var1, var2, var3, var4, var5, null);
   }

   public void renderGuiItemOverlay(DrawContext var1, TextRenderer var2, ItemStack var3, int var4, int var5, @Nullable String var6) {
      if (!var3.isEmpty()) {
         Item var7 = var3.getItem();
         ItemHighlighter var8 = ModuleRegistry.ITEM_HIGHLIGHTER;
         if (var8 != null && var8.k() && var8.a(var3)) {
            Color var9 = var8.b(var3);
            RenderSystem.disableDepthTest();
            RenderSystem.enableBlend();
            RenderSystem.defaultBlendFunc();
            BufferBuilder var10 = Tessellator.getInstance().begin(DrawMode.QUADS, VertexFormats.POSITION_COLOR);
            int var11 = var8.n();
            this.renderGuiQuad(var10, var4, var5, 16, 16, var9.getRed(), var9.getGreen(), var9.getBlue(), var11);
            RenderSystem.enableDepthTest();
         }

         if (var3.getCount() != 1 || var6 != null) {
            String var29 = var6 == null ? String.valueOf(var3.getCount()) : var6;
            var1.drawText(var2, var29, var4 + 19 - 2 - var2.getWidth(var29), var5 + 6 + 3, 16777215, true);
         }

         if (var3.isDamaged()) {
            RenderSystem.disableDepthTest();
            RenderSystem.enableBlend();
            RenderSystem.defaultBlendFunc();
            BufferBuilder var30 = Tessellator.getInstance().begin(DrawMode.QUADS, VertexFormats.POSITION_COLOR);
            float var32 = var3.getDamage();
            float var34 = var3.getMaxDamage();
            int var12 = Math.round(13.0F - var32 * 13.0F / var34);
            int var13 = MathHelper.hsvToRgb(Math.max(0.0F, (var34 - var32) / var34) / 3.0F, 1.0F, 1.0F);
            this.renderGuiQuad(var30, var4 + 2, var5 + 13, 13, 2, 0, 0, 0, 255);
            this.renderGuiQuad(var30, var4 + 2, var5 + 13, var12, 1, var13 >> 16 & 0xFF, var13 >> 8 & 0xFF, var13 & 0xFF, 255);
            RenderSystem.enableDepthTest();
         }

         ClientPlayerEntity var31 = MinecraftClient.getInstance().player;
         float var33 = 0.0F;
         CooldownInfo.ItemCooldownSnapshot var35 = CooldownInfo.a;
         if (var31 != null) {
            var35 = CooldownInfo.a(var31.getItemCooldownManager(), var7);
            var33 = var35.c();
         }

         Cooldowns var37 = ModuleRegistry.COOLDOWNS;
         if (var37 != null && var37.k()) {
            float var38 = var37.a(var7);
            if (var38 > var33) {
               var33 = var38;
            }
         }

         if (var33 > 0.0F) {
            RenderSystem.disableDepthTest();
            RenderSystem.enableBlend();
            RenderSystem.defaultBlendFunc();
            BufferBuilder var39 = Tessellator.getInstance().begin(DrawMode.QUADS, VertexFormats.POSITION_COLOR);
            short var14 = 255;
            short var15 = 255;
            short var16 = 255;
            this.renderGuiQuad(
               var39, var4, var5 + MathHelper.floor(16.0F * (1.0F - var33)), 16, MathHelper.ceil(16.0F * var33), var14, var15, var16, 127
            );
            RenderSystem.enableDepthTest();
         }

         HealingHelper var40 = ModuleRegistry.HEALING_HELPER;
         if (var40 != null && var40.k() && var40.a(var3)) {
            List<Item> var41 = var40.n();
            int var43 = var41.stream().mapToInt(var40::a).max().orElse(1);
            int var45 = var40.a(var7);
            int[] var17 = this.getColorByPriority(var45, var43);
            RenderSystem.disableDepthTest();
            RenderSystem.enableBlend();
            RenderSystem.defaultBlendFunc();
            BufferBuilder var18 = Tessellator.getInstance().begin(DrawMode.QUADS, VertexFormats.POSITION_COLOR);
            int var19 = (int)((Math.sin(System.currentTimeMillis() / 100.0) * 0.5 + 0.5) * 100.0) + 50;
            this.renderGuiQuad(var18, var4, var5, 16, 16, var17[0], var17[1], var17[2], var19);
            RenderSystem.enableDepthTest();
         }

         if (var3.getItem() == Items.CLOCK) {
            AutoReissue var42 = ModuleRegistry.AUTO_REISSUE;
            if (var42 != null && var42.k()) {
               MinecraftClient var44 = MinecraftClient.getInstance();
               if (var44.currentScreen != null && var44.player.currentScreenHandler != null) {
                  String var46 = "";

                  try {
                     var46 = var44.currentScreen.getTitle().getString();
                  } catch (Exception var28) {
                  }

                  if (var42.overlayActive) {
                     long var47 = var42.timer.a(0L) ? var42.durationMs : 0L;

                     for (int var48 = 1; var48 <= var42.durationMs / 1000 + 1; var48++) {
                        if (!var42.timer.a(var48 * 1000)) {
                           var47 = (var48 - 1) * 1000;
                           break;
                        }
                     }

                     int var49 = Math.max(0, (var42.durationMs - (int)var47) / 1000);
                     float var20 = Math.max(0.0F, 1.0F - (float)var47 / var42.durationMs);
                     if (var49 > 0) {
                        RenderSystem.disableDepthTest();
                        RenderSystem.enableBlend();
                        RenderSystem.defaultBlendFunc();
                        BufferBuilder var21 = Tessellator.getInstance().begin(DrawMode.QUADS, VertexFormats.POSITION_COLOR);
                        byte var22 = 16;
                        int var23 = MathHelper.ceil(var22 * var20);
                        int var24 = var5 + (var22 - var23);
                        this.renderGuiQuad(var21, var4, var24, 16, var23, 255, 255, 255, 127);
                        RenderSystem.enableDepthTest();
                        String var25 = String.valueOf(var49);
                        float var26 = var4 + 8 - var2.getWidth(var25) / 2.0F;
                        float var27 = var5 + 8 - 9.0F / 2.0F;
                        var1.drawText(var2, var25, (int)var26, (int)var27, 16777215, true);
                     }
                  }
               }
            }
         }

         EventBusService.EVENT_BUS.post(new ItemOverlayRenderEvent(var3, var4, var5));
      }
   }

   private void renderGuiQuad(BufferBuilder var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      var1.vertex(var2 + 0, var3 + 0, 0.0F).color(var6, var7, var8, var9);
      var1.vertex(var2 + 0, var3 + var5, 0.0F).color(var6, var7, var8, var9);
      var1.vertex(var2 + var4, var3 + var5, 0.0F).color(var6, var7, var8, var9);
      var1.vertex(var2 + var4, var3 + 0, 0.0F).color(var6, var7, var8, var9);
      BufferRenderer.drawWithGlobalProgram(var1.end());
   }

   private int[] getColorByPriority(int var1, int var2) {
      float var3 = (float)var1 / var2;
      int var4 = (int)(255.0F * (1.0F - var3));
      int var5 = (int)(255.0F * var3);
      return new int[]{var4, var5, 0};
   }
}
