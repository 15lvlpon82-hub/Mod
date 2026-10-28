package ru.pulse.mixin;


import pulse.module.ModuleRegistry;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import pulse.EventBusService;
import pulse.ChatSendEvent;
import pulse.HudElementManager;
import pulse.Animations;
import pulse.ChatInputSlideAnimation;
import pulse.GuiInput;

@Mixin(ChatScreen.class)
public abstract class ChatScreenMixin extends Screen {
   @Shadow
   protected TextFieldWidget chatField;
   @Unique
   private boolean matrixPushed = false;
   @Unique
   private int originalChatFieldY = 0;

   protected ChatScreenMixin(Text var1) {
      super(var1);
   }

   @Unique
   private boolean isChatAnimationEnabled() {
      return ModuleRegistry.ANIMATIONS != null && ModuleRegistry.ANIMATIONS.k() && ModuleRegistry.ANIMATIONS.e.a();
   }

   @Inject(method = "sendMessage", at = @At("HEAD"), cancellable = true)
   private void onSendMessage(String var1, boolean var2, CallbackInfo var3) {
      ChatSendEvent var4 = new ChatSendEvent(var1);
      EventBusService.EVENT_BUS.post(var4);
      if (var4.c()) {
         var3.cancel();
      }
   }

   @Inject(method = "init", at = @At("TAIL"))
   private void onInit(CallbackInfo var1) {
      HudElementManager.a().a(true);
      if (this.isChatAnimationEnabled()) {
         ChatInputSlideAnimation var2 = Animations.o();
         var2.d();
         var2.a((long)ModuleRegistry.ANIMATIONS.f.k().floatValue());
         this.originalChatFieldY = this.chatField.getY();
      }
   }

   @Inject(method = "removed", at = @At("HEAD"))
   private void onRemoved(CallbackInfo var1) {
      HudElementManager.a().a(false);
      if (HudElementManager.a().h() != null) {
         HudElementManager.a().h().i().c();
         HudElementManager.a().h().g();
      }

      GuiInput.j();
      Animations.o().d();
   }

   @Inject(method = "mouseClicked", at = @At("HEAD"), cancellable = true)
   private void onMouseClicked(double var1, double var3, int var5, CallbackInfoReturnable<Boolean> var6) {
      if (HudElementManager.a().a(var1, var3, var5)) {
         var6.setReturnValue(true);
      }
   }

   public boolean mouseReleased(double var1, double var3, int var5) {
      return HudElementManager.a().b(var1, var3, var5) ? true : super.mouseReleased(var1, var3, var5);
   }

   public boolean mouseDragged(double var1, double var3, int var5, double var6, double var8) {
      HudElementManager.a().a(var1, var3, var6, var8);
      return HudElementManager.a().b(var1, var3) ? true : super.mouseDragged(var1, var3, var5, var6, var8);
   }

   @Inject(method = "mouseScrolled", at = @At("HEAD"), cancellable = true)
   private void onMouseScrolled(double var1, double var3, double var5, double var7, CallbackInfoReturnable<Boolean> var9) {
      if (HudElementManager.a().a(var1, var3, var7)) {
         var9.setReturnValue(true);
      } else {
         if (this.isChatAnimationEnabled() && Animations.o().c()) {
            var9.setReturnValue(false);
         }
      }
   }

   @Inject(method = "keyPressed", at = @At("HEAD"), cancellable = true)
   private void onKeyPressed(int var1, int var2, int var3, CallbackInfoReturnable<Boolean> var4) {
      if (HudElementManager.a().a(var1, var3)) {
         var4.setReturnValue(true);
      } else {
         if (this.isChatAnimationEnabled() && Animations.o().c() && var1 != 256) {
            var4.setReturnValue(false);
         }
      }
   }

   @Inject(method = "render", at = @At("HEAD"))
   private void onRenderHead(DrawContext var1, int var2, int var3, float var4, CallbackInfo var5) {
      GuiInput.h();
      if (this.isChatAnimationEnabled()) {
         ChatInputSlideAnimation var6 = Animations.o();
         var6.a();
         float var7 = var6.b();
         if (var7 > 0.0F) {
            this.chatField.setY(this.originalChatFieldY + (int)var7);
            var1.getMatrices().push();
            var1.getMatrices().translate(0.0F, var7, 0.0F);
            this.matrixPushed = true;
         } else {
            this.matrixPushed = false;
         }
      } else {
         this.matrixPushed = false;
      }
   }

   @Inject(method = "render", at = @At("TAIL"))
   private void onRender(DrawContext var1, int var2, int var3, float var4, CallbackInfo var5) {
      if (this.matrixPushed) {
         var1.getMatrices().pop();
         this.matrixPushed = false;
      }

      MinecraftClient var6 = MinecraftClient.getInstance();
      if (var6.isWindowFocused()) {
         HudElementManager.a().a((double)var2, (double)var3);
         if (HudElementManager.a().h() != null) {
            double var7 = var2 * var6.getWindow().getScaleFactor() / 2.0;
            double var9 = var3 * var6.getWindow().getScaleFactor() / 2.0;
            HudElementManager.a().h().a(var7, var9);
         }
      } else {
         HudElementManager.a().a((double)var2, (double)var3);
         if (HudElementManager.a().h() != null) {
            HudElementManager.a().h().g();
         }
      }

      GuiInput.i();
   }
}
