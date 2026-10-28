package ru.pulse.mixin;


import pulse.client.MinecraftContext;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.RunArgs;
import net.minecraft.client.MinecraftClient.ChatRestriction;
import net.minecraft.client.gui.screen.DownloadingTerrainScreen.WorldEntryReason;
import net.minecraft.client.world.ClientWorld;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import pulse.EventBusService;
import pulse.AttackEntityEvent;
import pulse.WorldChangeEvent;
import pulse.RenderFrameTimer;
import ru.pulse.Pulse;

@Mixin(MinecraftClient.class)
public class MinecraftClientMixin implements MinecraftContext {
   @Inject(method = "joinWorld", at = @At("RETURN"))
   private void onWorldChange(ClientWorld var1, WorldEntryReason var2, CallbackInfo var3) {
      EventBusService.EVENT_BUS.post(new WorldChangeEvent());
   }

   @Inject(
      method = "<init>",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/render/debug/DebugRenderer;<init>(Lnet/minecraft/client/MinecraftClient;)V")
   )
   public void init(RunArgs var1, CallbackInfo var2) {
      Pulse.getInstance().init();
   }

   @Inject(method = "render", at = @At(value = "FIELD", target = "Lnet/minecraft/client/MinecraftClient;fpsCounter:I", opcode = 181, ordinal = 0))
   private void render(boolean var1, CallbackInfo var2) {
      try {
         Class.forName("ru.pulse.Pulse").getMethod("runtimeBrandingTick").invoke(null);
      } catch (Throwable var4) {
      }

      RenderFrameTimer.b();
   }

   @Inject(method = "isMultiplayerEnabled", at = @At("HEAD"), cancellable = true)
   public void allowsMultiplayer(CallbackInfoReturnable<Boolean> var1) {
      var1.setReturnValue(true);
   }

   @Inject(method = "getChatRestriction", at = @At("HEAD"), cancellable = true)
   public void allowsChat(CallbackInfoReturnable<ChatRestriction> var1) {
      var1.setReturnValue(ChatRestriction.ENABLED);
   }

   @Inject(method = "isRealmsEnabled", at = @At("HEAD"), cancellable = true)
   public void allowsRealms(CallbackInfoReturnable<Boolean> var1) {
      var1.setReturnValue(false);
   }

   @Inject(
      method = "doAttack",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/network/ClientPlayerInteractionManager;attackEntity(Lnet/minecraft/entity/player/PlayerEntity;Lnet/minecraft/entity/Entity;)V"
      )
   )
   private void onAttack(CallbackInfoReturnable<Boolean> var1) {
      if (c.targetedEntity != null) {
         EventBusService.EVENT_BUS.post(new AttackEntityEvent(c.targetedEntity));
      }
   }
}
