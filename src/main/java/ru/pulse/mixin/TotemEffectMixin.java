package ru.pulse.mixin;


import pulse.module.ModuleRegistry;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import pulse.RenderTweaks;

@Mixin(InGameHud.class)
public abstract class TotemEffectMixin {
   @Shadow
   @Final
   private MinecraftClient client;
   @Final
   private static Identifier TOTEM_OF_UNDYING_TEXTURE;
   @Shadow
   private int heldItemTooltipFade;
   @Shadow
   private ItemStack currentStack;

   @Inject(method = "renderHeldItemTooltip", at = @At("HEAD"), cancellable = true)
   private void onRenderHeldItemTooltip(DrawContext var1, CallbackInfo var2) {
      RenderTweaks var3 = ModuleRegistry.RENDER_TWEAKS;
      if (var3.q() && this.heldItemTooltipFade > 0 && !this.currentStack.isEmpty()) {
         var2.cancel();
      }
   }

   @Inject(method = "tick()V", at = @At("HEAD"))
   private void onTick(CallbackInfo var1) {
      RenderTweaks var2 = ModuleRegistry.RENDER_TWEAKS;
      if (var2.q() && this.heldItemTooltipFade > 0) {
         this.heldItemTooltipFade = 0;
      }
   }
}
