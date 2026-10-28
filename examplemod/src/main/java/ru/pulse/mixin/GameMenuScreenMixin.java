package ru.pulse.mixin;


import pulse.module.ModuleRegistry;
import net.minecraft.client.gui.screen.ConfirmScreen;
import net.minecraft.client.gui.screen.GameMenuScreen;
import net.minecraft.client.gui.screen.MessageScreen;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.TitleScreen;
import net.minecraft.client.gui.screen.multiplayer.MultiplayerScreen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.network.ServerInfo;
import net.minecraft.client.realms.gui.screen.RealmsMainScreen;
import net.minecraft.text.Text;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import pulse.PvpSafe;
import pulse.CombatState;

@Mixin(GameMenuScreen.class)
public abstract class GameMenuScreenMixin extends Screen {
   @Shadow
   @Nullable
   private ButtonWidget exitButton;

   protected GameMenuScreenMixin(Text var1) {
      super(var1);
   }

   @Inject(method = "initWidgets", at = @At("TAIL"))
   private void onInitWidgets(CallbackInfo var1) {
      if (this.exitButton != null) {
         Text var2 = this.exitButton.getMessage();
         int var3 = this.exitButton.getX();
         int var4 = this.exitButton.getY();
         int var5 = this.exitButton.getWidth();
         int var6 = this.exitButton.getHeight();
         this.remove(this.exitButton);
         this.exitButton = ButtonWidget.builder(var2, var1x -> {
            var1x.active = false;
            PvpSafe var2x = ModuleRegistry.PVP_SAFE;
            if (var2x != null && var2x.k() && CombatState.a().a()) {
               this.client.setScreen(new ConfirmScreen(var1xx -> {
                  if (var1xx) {
                     this.performDisconnect();
                  } else {
                     this.client.setScreen(this);
                  }
               }, Text.literal("Leave the server while PVP Safe is active?"), Text.empty()));
            } else {
               this.performDisconnect();
            }
         }).dimensions(var3, var4, var5, var6).build();
         this.addDrawableChild(this.exitButton);
      }
   }

   private void performDisconnect() {
      boolean var1 = this.client.isInSingleplayer();
      ServerInfo var2 = this.client.getCurrentServerEntry();
      if (this.client.world != null) {
         this.client.world.disconnect();
      }

      if (var1) {
         this.client.disconnect(new MessageScreen(Text.translatable("menu.savingLevel")));
      } else {
         this.client.disconnect();
      }

      TitleScreen var3 = new TitleScreen();
      if (var1) {
         this.client.setScreen(var3);
      } else if (var2 != null && var2.isRealm()) {
         this.client.setScreen(new RealmsMainScreen(var3));
      } else {
         this.client.setScreen(new MultiplayerScreen(var3));
      }
   }
}
