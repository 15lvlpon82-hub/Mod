package ru.pulse.mixin;


import pulse.module.ModuleRegistry;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.hud.ChatHud;
import net.minecraft.client.gui.hud.ChatHudLine.Visible;
import net.minecraft.text.OrderedText;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import pulse.ChatMessageSlideAnimation;

@Mixin(ChatHud.class)
public abstract class ChatHudMixin {
   @Shadow
   @Final
   private MinecraftClient client;
   @Shadow
   @Final
   private List<Visible> visibleMessages;
   @Shadow
   private int scrolledLines;
   @Unique
   private Map<Visible, ChatMessageSlideAnimation> messageAnimators;
   @Unique
   private int currentRenderIndex;

   @Shadow
   public abstract int getWidth();

   @Unique
   private Map<Visible, ChatMessageSlideAnimation> getAnimators() {
      if (this.messageAnimators == null) {
         this.messageAnimators = new IdentityHashMap<>();
      }

      return this.messageAnimators;
   }

   @Unique
   private boolean isChatAnimationEnabled() {
      return ModuleRegistry.ANIMATIONS != null && ModuleRegistry.ANIMATIONS.k() && ModuleRegistry.ANIMATIONS.e.a();
   }

   @Inject(method = "render", at = @At("HEAD"))
   private void onRenderHead(DrawContext var1, int var2, int var3, int var4, boolean var5, CallbackInfo var6) {
      if (this.isChatAnimationEnabled()) {
         Map<Visible, ChatMessageSlideAnimation> var7 = this.getAnimators();
         var7.values().forEach(ChatMessageSlideAnimation::a);
         var7.entrySet().removeIf(var0 -> var0.getValue().d());
         this.currentRenderIndex = 0;
      }
   }

   @Redirect(
      method = "render",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/gui/DrawContext;drawTextWithShadow(Lnet/minecraft/client/font/TextRenderer;Lnet/minecraft/text/OrderedText;III)I"
      )
   )
   private int redirectDrawTextWithShadow(DrawContext var1, TextRenderer var2, OrderedText var3, int var4, int var5, int var6) {
      float var7 = 0.0F;
      if (this.isChatAnimationEnabled()) {
         int var8 = this.currentRenderIndex + this.scrolledLines;
         if (var8 >= 0 && var8 < this.visibleMessages.size()) {
            Visible var9 = this.visibleMessages.get(var8);
            ChatMessageSlideAnimation var10 = this.getAnimators().get(var9);
            if (var10 != null) {
               var7 = var10.b();
            }
         }

         this.currentRenderIndex++;
      }

      return var1.drawTextWithShadow(var2, var3, var4 + (int)var7, var5, var6);
   }

   @Inject(
      method = "addMessage(Lnet/minecraft/text/Text;Lnet/minecraft/network/message/MessageSignatureData;Lnet/minecraft/client/gui/hud/MessageIndicator;)V",
      at = @At("TAIL")
   )
   private void onAddMessage(CallbackInfo var1) {
      if (this.isChatAnimationEnabled()) {
         if (!this.visibleMessages.isEmpty()) {
            int var2 = this.getWidth();
            long var3 = (long)ModuleRegistry.ANIMATIONS.f.k().floatValue();
            Visible var5 = this.visibleMessages.get(0);
            Map var6 = this.getAnimators();
            if (!var6.containsKey(var5)) {
               var6.put(var5, new ChatMessageSlideAnimation(-var2, 0.0F, var3));
            }
         }
      }
   }

   @Inject(method = "clear", at = @At("HEAD"))
   private void onClear(boolean var1, CallbackInfo var2) {
      if (this.messageAnimators != null) {
         this.messageAnimators.clear();
      }
   }
}
