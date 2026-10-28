package ru.pulse.mixin;



import pulse.module.ModuleRegistry;
import pulse.client.MinecraftContext;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.text.Style;
import net.minecraft.text.PlainTextContent.Literal;
import net.minecraft.text.StringVisitable.StyledVisitor;
import net.minecraft.text.StringVisitable.Visitor;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import pulse.StreamerMode;

@Mixin(Literal.class)
public class TextMixin implements MinecraftContext {
   @Shadow
   @Final
   private String string;
   @Unique
   private static final Pattern holyWorldPattern = Pattern.compile("(СолоЛайт|ДуоЛайт|ТриоЛайт|КланЛайт)\\s*#(\\d{1,2})");
   @Unique
   private static final Pattern funTimePattern = Pattern.compile("Анархия-(\\d+)");

   @Redirect(
      method = "visit(Lnet/minecraft/text/StringVisitable$Visitor;)Ljava/util/Optional;",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/text/StringVisitable$Visitor;accept(Ljava/lang/String;)Ljava/util/Optional;")
   )
   private <ConfigTextDialog> Optional<ConfigTextDialog> redirectVisitor(Visitor<ConfigTextDialog> var1, String var2) {
      return var1.accept(this.getProcessedText(var2));
   }

   @Redirect(
      method = "visit(Lnet/minecraft/text/StringVisitable$StyledVisitor;Lnet/minecraft/text/Style;)Ljava/util/Optional;",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/text/StringVisitable$StyledVisitor;accept(Lnet/minecraft/text/Style;Ljava/lang/String;)Ljava/util/Optional;"
      )
   )
   private <ConfigTextDialog> Optional<ConfigTextDialog> redirectStyledVisitor(StyledVisitor<ConfigTextDialog> var1, Style var2, String var3) {
      return var1.accept(var2, this.getProcessedText(var3));
   }

   @Unique
   private String getProcessedText(String var1) {
      String var2 = var1;
      if (this.shouldReplaceNick() && c.getSession() != null) {
         var2 = var2.replace(c.getSession().getUsername(), "pulse");
      }

      if (this.shouldHideServerNumber()) {
         var2 = this.hideServerNumber(var2);
      }

      return var2;
   }

   @Unique
   private boolean shouldReplaceNick() {
      try {
         StreamerMode var1 = ModuleRegistry.STREAMER_MODE;
         return var1 != null && var1.k() && var1.hidePlayerName.k() && c != null && c.getSession() != null;
      } catch (Exception var2) {
         return false;
      }
   }

   @Unique
   private boolean shouldHideServerNumber() {
      try {
         StreamerMode var1 = ModuleRegistry.STREAMER_MODE;
         if (var1 == null || !var1.k() || !var1.hideServerNumber.k()) {
            return false;
         } else if (c != null && c.getCurrentServerEntry() != null) {
            String var2 = c.getCurrentServerEntry().address.toLowerCase();
            return var2.contains("holyworld") || var2.contains("funtime");
         } else {
            return false;
         }
      } catch (Exception var3) {
         return false;
      }
   }

   @Unique
   private String hideServerNumber(String var1) {
      if (var1 == null) {
         return var1;
      }

      Matcher var2 = holyWorldPattern.matcher(var1);
      if (var2.find()) {
         return var2.replaceAll("pulsevisuals.pro");
      }

      Matcher var3 = funTimePattern.matcher(var1);
      return var3.find() ? var3.replaceAll("pulsevisuals.pro") : var1;
   }
}
