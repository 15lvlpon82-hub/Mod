package ru.pulse.mixin;

import net.minecraft.client.input.Input;
import net.minecraft.client.input.KeyboardInput;
import net.minecraft.client.option.GameOptions;
import net.minecraft.util.PlayerInput;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import pulse.EventBusService;
import pulse.MovementInputEvent;

@Mixin(KeyboardInput.class)
public class KeyboardInputMixin extends Input {
   @Shadow
   @Final
   private GameOptions settings;

   @Inject(method = "tick", at = @At("HEAD"), cancellable = true)
   private void onTick(CallbackInfo var1) {
      this.playerInput = new PlayerInput(
         this.settings.forwardKey.isPressed(),
         this.settings.backKey.isPressed(),
         this.settings.leftKey.isPressed(),
         this.settings.rightKey.isPressed(),
         this.settings.jumpKey.isPressed(),
         this.settings.sneakKey.isPressed(),
         this.settings.sprintKey.isPressed()
      );
      this.movementForward = getMovementMultiplier(this.playerInput.forward(), this.playerInput.backward());
      this.movementSideways = getMovementMultiplier(this.playerInput.left(), this.playerInput.right());
      MovementInputEvent var2 = new MovementInputEvent(this.movementForward, this.movementSideways, this.playerInput.jump(), this.playerInput.sneak(), 0.3F);
      EventBusService.EVENT_BUS.post(var2);
      if (var2.c()) {
         this.movementForward = 0.0F;
         this.movementSideways = 0.0F;
         this.playerInput = new PlayerInput(false, false, false, false, false, false, this.playerInput.sprint());
      } else {
         this.movementForward = var2.d();
         this.movementSideways = var2.e();
         this.playerInput = new PlayerInput(
            var2.d() > 0.0F, var2.d() < 0.0F, var2.e() > 0.0F, var2.e() < 0.0F, var2.f(), var2.g(), this.playerInput.sprint()
         );
      }

      var1.cancel();
   }

   @Unique
   private static float getMovementMultiplier(boolean var0, boolean var1) {
      if (var0 == var1) {
         return 0.0F;
      } else {
         return var0 ? 1.0F : -1.0F;
      }
   }
}
