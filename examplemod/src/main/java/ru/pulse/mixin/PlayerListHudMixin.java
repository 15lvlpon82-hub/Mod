package ru.pulse.mixin;


import pulse.module.ModuleRegistry;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.hud.PlayerListHud;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.text.Text;
import net.minecraft.text.Text.Serialization;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import pulse.StreamerMode;
import pulse.IconTextureRegistry;
import pulse.PlayerListCache;

@Mixin(PlayerListHud.class)
public class PlayerListHudMixin {
   @Shadow
   @Final
   private MinecraftClient client;
   @Shadow
   private Text header;
   @Unique
   private static final int ICON_SIZE = 8;
   @Unique
   private static final int ICON_PADDING = 2;

   @Redirect(
      method = "render",
      at = @At(value = "FIELD", target = "Lnet/minecraft/client/gui/hud/PlayerListHud;header:Lnet/minecraft/text/Text;", opcode = 180)
   )
   private Text getModifiedHeader(PlayerListHud var1) {
      StreamerMode var2 = ModuleRegistry.STREAMER_MODE;
      if (var2.k() && var2.hideServerNumber.k() && this.header != null) {
         String var3 = this.header.getString();
         if (var3.contains("Анархия-")) {
            try {
               MinecraftClient var4 = MinecraftClient.getInstance();
               String var5 = Serialization.toJsonString(this.header, var4.getNetworkHandler().getRegistryManager());
               String var6 = var5.replaceAll("Анархия-\\d+", "Анархия-***");
               return Serialization.fromJson(var6, var4.getNetworkHandler().getRegistryManager());
            } catch (Exception var7) {
               return Text.literal(var3.replaceAll("Анархия-\\d+", "Анархия-***"));
            }
         }
      }

      return this.header;
   }

   @Redirect(
      method = "render",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/gui/DrawContext;drawTextWithShadow(Lnet/minecraft/client/font/TextRenderer;Lnet/minecraft/text/Text;III)I"
      )
   )
   private int redirectDrawTextWithShadow(DrawContext var1, TextRenderer var2, Text var3, int var4, int var5, int var6) {
      String var7 = this.extractPlayerNameFromText(var3.getString());
      if (var7 != null && PlayerListCache.c().a(var7)) {
         this.renderIcon(var1, var4, var5);
         return var1.drawTextWithShadow(var2, var3, var4 + 8 + 2, var5, var6);
      } else {
         return var1.drawTextWithShadow(var2, var3, var4, var5, var6);
      }
   }

   @Unique
   private String extractPlayerNameFromText(String var1) {
      if (var1 != null && !var1.isEmpty()) {
         if (this.client.player != null && this.client.player.networkHandler != null) {
            for (PlayerListEntry var4 : this.client.player.networkHandler.getListedPlayerListEntries().stream().toList()) {
               if (var4.getProfile() != null && var4.getProfile().getName() != null) {
                  String var5 = var4.getProfile().getName();
                  if (var1.contains(var5)) {
                     return var5;
                  }
               }
            }

            return null;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   @Unique
   private void renderIcon(DrawContext var1, int var2, int var3) {
      Identifier var4 = IconTextureRegistry.get("logo");
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.setShader(ShaderProgramKeys.POSITION_TEX);
      RenderSystem.setShaderTexture(0, var4);
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
      var1.drawTexture(RenderLayer::getGuiTextured, var4, var2, var3, 0.0F, 0.0F, 8, 8, 8, 8);
      RenderSystem.disableBlend();
   }
}
