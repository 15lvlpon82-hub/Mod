package pulse;

import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class PulseLogoOverlay implements ClickGuiOverlay {
   private static final float LOGO_TOP_PADDING = 12.0F;
   private static final float LOGO_SCALE = 0.5F;

   @Override
   public void a(MatrixStack matrices, Renderer2D renderer, float x, float y, int mouseX, int mouseY) {
      IconTextureRegistry.TextureInfo logo = IconTextureRegistry.getInfo(IconTextureRegistry.PULSE_ICO);
      if (logo == null) {
         return;
      }

      Identifier texture = logo.a();
      RenderSystem.setShaderTexture(0, texture);

      float logoWidth = logo.b() * LOGO_SCALE;
      float logoHeight = logo.c() * LOGO_SCALE;
      float logoX = x + (PulseClickGuiScreen.d() - logoWidth) / 2.0F;
      float logoY = y - logoHeight - LOGO_TOP_PADDING;

      renderer.a(texture, logoX, logoY, logoWidth, logoHeight, Color.WHITE, matrices);
   }

   @Override
   public void a(float x, float y, int mouseX, int mouseY) {
   }
}
