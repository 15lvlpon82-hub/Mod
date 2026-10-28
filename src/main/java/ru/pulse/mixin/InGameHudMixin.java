package ru.pulse.mixin;


import pulse.module.ModuleRegistry;
import java.util.function.Function;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.client.gui.hud.PlayerListHud;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.RenderTickCounter;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.scoreboard.ScoreboardDisplaySlot;
import net.minecraft.scoreboard.ScoreboardObjective;
import net.minecraft.util.Arm;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import pulse.EventBusService;
import pulse.HudElementManager;
import pulse.HudRenderPostEvent;
import pulse.HudRenderPreEvent;
import pulse.Cooldowns;
import pulse.FastSwap;
import pulse.HotbarSelectionAnimation;
import pulse.PlayerListScaleAnimation;
import pulse.Animations;
import pulse.Crosshair;
import pulse.RenderTweaks;
import pulse.KeyNameFormatter;
import pulse.GuiInput;
import pulse.ScreenScale;
import pulse.ScreenPoint;
import pulse.CooldownInfo;

@Mixin(InGameHud.class)
public abstract class InGameHudMixin {
   @Shadow
   @Final
   private static Identifier HOTBAR_SELECTION_TEXTURE;
   @Shadow
   @Final
   private MinecraftClient client;
   @Shadow
   @Final
   private PlayerListHud playerListHud;
   @Unique
   private boolean deferHighlight = false;
   @Unique
   private int deferredHighlightY;
   @Unique
   private boolean prevTabShown = false;

   @Shadow
   private void renderHotbarItem(DrawContext var1, int var2, int var3, RenderTickCounter var4, PlayerEntity var5, ItemStack var6, int var7) {
   }

   @Inject(method = "renderCrosshair", at = @At("HEAD"), cancellable = true)
   private void onRenderCrosshair(DrawContext var1, RenderTickCounter var2, CallbackInfo var3) {
      Crosshair var4 = ModuleRegistry.CROSSHAIR;
      if (var4 != null && var4.k()) {
         var3.cancel();
      }
   }

   @Unique
   private boolean isHotbarAnimationEnabled() {
      return ModuleRegistry.ANIMATIONS != null && ModuleRegistry.ANIMATIONS.k() && ModuleRegistry.ANIMATIONS.g.a();
   }

   @Inject(method = "renderHotbar", at = @At("HEAD"))
   private void onRenderHotbarHead(DrawContext var1, RenderTickCounter var2, CallbackInfo var3) {
      if (this.isHotbarAnimationEnabled() && this.client.player != null) {
         HotbarSelectionAnimation var4 = Animations.p();
         int var5 = this.client.player.getInventory().selectedSlot;
         int var6 = var1.getScaledWindowWidth() / 2;
         var4.a(var5, var6, (long)ModuleRegistry.ANIMATIONS.h.k().floatValue());
         var4.a();
      }
   }

   @Redirect(
      method = "renderHotbar",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/gui/DrawContext;drawGuiTexture(Ljava/util/function/Function;Lnet/minecraft/util/Identifier;IIII)V",
         ordinal = 1
      )
   )
   private void redirectHotbarSelection(DrawContext var1, Function<Identifier, RenderLayer> var2, Identifier var3, int var4, int var5, int var6, int var7) {
      if (this.isHotbarAnimationEnabled()) {
         this.deferredHighlightY = var5;
         this.deferHighlight = true;
      } else {
         var1.drawGuiTexture(var2, var3, var4, var5, var6, var7);
      }
   }

   @Inject(method = "renderHotbar", at = @At("RETURN"))
   private void renderDeferredHighlight(DrawContext var1, RenderTickCounter var2, CallbackInfo var3) {
      if (this.deferHighlight) {
         this.deferHighlight = false;
         int var4 = Math.round(Animations.p().b());
         var1.draw();
         MatrixStack var5 = var1.getMatrices();
         var5.push();
         var5.translate(0.0F, 0.0F, 200.0F);
         var1.drawGuiTexture(RenderLayer::getGuiTextured, HOTBAR_SELECTION_TEXTURE, var4, this.deferredHighlightY, 24, 23);
         var5.pop();
      }
   }

   @Inject(method = "renderHotbar", at = @At("RETURN"))
   private void renderArmorHud(DrawContext var1, RenderTickCounter var2, CallbackInfo var3) {
      if (ModuleRegistry.ARMOR_HUD.k() && MinecraftClient.getInstance().player != null) {
         ClientPlayerEntity var4 = this.client.player;
         if (var4 != null) {
            int var5 = var1.getScaledWindowWidth() / 2;
            ItemStack var6 = var4.getOffHandStack();
            Arm var7 = var4.getMainArm().getOpposite();
            int var8 = var7 == Arm.RIGHT && !var6.isEmpty() ? 24 : 0;

            for (int var9 = 0; var9 < 4; var9++) {
               int var10 = var5 + 92 + 10 + var9 * 20 + 2 + var8;
               int var11 = var1.getScaledWindowHeight() - 16 - 3;
               ItemStack var12 = var4.getInventory().getArmorStack(3 - var9);
               this.renderHotbarItem(var1, var10, var11, var2, var4, var12, var9 + 1);
            }
         }
      }
   }

   @Inject(
      method = "renderScoreboardSidebar(Lnet/minecraft/client/gui/DrawContext;Lnet/minecraft/scoreboard/ScoreboardObjective;)V",
      at = @At("HEAD"),
      cancellable = true
   )
   private void onRenderScoreboardSidebar(DrawContext var1, ScoreboardObjective var2, CallbackInfo var3) {
      RenderTweaks var4 = ModuleRegistry.RENDER_TWEAKS;
      if (var4 != null && var4.r()) {
         var3.cancel();
      }
   }

   @Inject(method = "render", at = @At("HEAD"))
   private void onRenderPre(DrawContext var1, RenderTickCounter var2, CallbackInfo var3) {
      int var4 = (int)GuiInput.e();
      int var5 = (int)GuiInput.f();
      ScreenPoint var6 = ScreenScale.a(var4, var5);
      EventBusService.EVENT_BUS.post(new HudRenderPreEvent(var1.getMatrices(), var6.a(), var6.b(), var2.getTickDelta(true)));
   }

   @Inject(method = "render", at = @At("TAIL"))
   private void onRender(DrawContext var1, RenderTickCounter var2, CallbackInfo var3) {
      int var4 = (int)GuiInput.e();
      int var5 = (int)GuiInput.f();
      ScreenPoint var6 = ScreenScale.a(var4, var5);
      ScreenScale.a(2.0);
      EventBusService.EVENT_BUS.post(new HudRenderPostEvent(var1.getMatrices(), var6.a(), var6.b(), var2.getTickDelta(true)));
      ScreenScale.a();
      HudElementManager.a().a(var1.getMatrices());
      HudElementManager.a().b(var1.getMatrices());
   }

   @Inject(method = "renderPlayerList", at = @At("HEAD"), cancellable = true)
   private void onRenderPlayerList(DrawContext var1, RenderTickCounter var2, CallbackInfo var3) {
      if (ModuleRegistry.ANIMATIONS != null && ModuleRegistry.ANIMATIONS.k() && ModuleRegistry.ANIMATIONS.a.a()) {
         var3.cancel();
         if (this.client.world != null && this.client.player != null) {
            Scoreboard var4 = this.client.world.getScoreboard();
            ScoreboardObjective var5 = var4.getObjectiveForSlot(ScoreboardDisplaySlot.LIST);
            boolean var6 = this.client.options.playerListKey.isPressed();
            boolean var7 = this.client.isInSingleplayer() && this.client.player.networkHandler.getListedPlayerListEntries().size() <= 1 && var5 == null;
            boolean var8 = var6 && !var7;
            PlayerListScaleAnimation var9 = Animations.n();
            long var10 = (long)ModuleRegistry.ANIMATIONS.b.k().floatValue();
            if (var8 && !this.prevTabShown) {
               var9.a(var10);
            } else if (!var8 && this.prevTabShown) {
               var9.b(var10);
            }

            this.prevTabShown = var8;
            var9.a();
            boolean var12 = var8 || var9.d();
            if (!var12) {
               this.playerListHud.setVisible(false);
            } else {
               this.playerListHud.setVisible(true);
               float var13 = var9.b();
               if (var13 < 0.001F) {
                  this.playerListHud.setVisible(false);
               } else {
                  MatrixStack var14 = var1.getMatrices();
                  var14.push();
                  float var15 = var1.getScaledWindowWidth() / 2.0F;
                  var14.translate(var15, 0.0F, 0.0F);
                  var14.scale(var13, var13, 1.0F);
                  var14.translate(-var15, 0.0F, 0.0F);
                  this.playerListHud.render(var1, var1.getScaledWindowWidth(), var4, var5);
                  var14.pop();
               }
            }
         }
      } else {
         this.prevTabShown = false;
      }
   }

   @Inject(method = "renderHotbar", at = @At("TAIL"))
   private void renderHotbarItemBinds(DrawContext var1, RenderTickCounter var2, CallbackInfo var3) {
      MinecraftClient var4 = MinecraftClient.getInstance();
      ClientPlayerEntity var5 = var4.player;
      if (var5 != null) {
         FastSwap var6 = ModuleRegistry.FAST_SWAP;
         boolean var7 = var6 != null && var6.E().k() && var6.k();
         Cooldowns var8 = ModuleRegistry.COOLDOWNS;
         boolean var9 = var8 != null && var8.k() && var8.n();
         TextRenderer var10 = var4.textRenderer;
         int var11 = var1.getScaledWindowWidth();
         int var12 = var1.getScaledWindowHeight();

         for (int var13 = 0; var13 < 9; var13++) {
            ItemStack var14 = var5.getInventory().getStack(var13);
            if (!var14.isEmpty()) {
               int var15 = this.getKey(var14, var6);
               boolean var16 = var9 && this.hasAnyCooldown(var14, var8);
               boolean var17 = var15 != -1 && var15 != 0;
               if (var16 || var17) {
                  int var18 = var11 / 2 - 91 + var13 * 20 + 2;
                  int var19 = var12 - 16 - 3;
                  if (var17 && !var16 && var7) {
                     String var20 = KeyNameFormatter.a(var15);
                     float var21 = var10.getWidth(var20);
                     float var22 = 14.0F;
                     float var23 = Math.min(1.0F, var22 / var21);
                     float var24 = var6.F().k();
                     float var25 = var23 * var24;
                     MatrixStack var26 = var1.getMatrices();
                     var26.push();
                     var26.translate(0.0F, 0.0F, 400.0F);
                     var26.scale(var25, var25, 1.0F);
                     var1.drawText(var10, var20, (int)((var18 + 2.0F) / var25), (int)((var19 + 1.0F) / var25), 16777215, true);
                     var26.pop();
                  }

                  if (var16) {
                     CooldownInfo.ItemCooldownSnapshot var30 = CooldownInfo.a(var5.getItemCooldownManager(), var14.getItem());
                     int var31;
                     int var32;
                     if (Cooldowns.a(var14) && var8.b(var14.getItem())) {
                        float var34 = var8.a(var14.getItem());
                        var31 = (int)Math.ceil(var34 * 18.5);
                        var32 = var34 <= 0.33F ? 65280 : (var34 <= 0.66F ? 16776960 : 16711680);
                     } else {
                        var31 = (int)Math.ceil(var30.b());
                        float var33 = var30.c();
                        var32 = var33 <= 0.33F ? 65280 : (var33 <= 0.66F ? 16776960 : 16711680);
                     }

                     String var35 = String.valueOf(var31);
                     float var36 = var10.getWidth(var35);
                     float var37 = 14.0F;
                     float var38 = Math.min(1.0F, var37 / var36);
                     float var27 = var8.q().k();
                     float var28 = var38 * var27;
                     MatrixStack var29 = var1.getMatrices();
                     var29.push();
                     var29.translate(0.0F, 0.0F, 400.0F);
                     var29.scale(var28, var28, 1.0F);
                     var1.drawText(var10, var35, (int)((var18 + 2.0F) / var28), (int)((var19 + 1.0F) / var28), var32, true);
                     var29.pop();
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
