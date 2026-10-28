package ru.pulse.mixin;



import pulse.module.ModuleRegistry;
import pulse.client.MinecraftContext;
import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.scoreboard.ScoreboardObjective;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import pulse.StreamerMode;

@Mixin(InGameHud.class)
public class ScoreboardMixin implements MinecraftContext {
   @Redirect(
      method = "renderScoreboardSidebar(Lnet/minecraft/client/gui/DrawContext;Lnet/minecraft/scoreboard/ScoreboardObjective;)V",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/scoreboard/ScoreboardObjective;getDisplayName()Lnet/minecraft/text/Text;")
   )
   private Text hideScoreboardTitle(ScoreboardObjective var1) {
      StreamerMode var2 = ModuleRegistry.STREAMER_MODE;
      if (var2.k() && var2.hideServerNumber.k()) {
         if (c == null || c.getCurrentServerEntry() == null) {
            return Text.literal("pulsevisuals.pro");
         }

         String var3 = c.getCurrentServerEntry().address.toLowerCase();
         if (!var3.contains("holyworld")) {
            return Text.literal("pulsevisuals.pro");
         }
      }

      return var1.getDisplayName();
   }
}
