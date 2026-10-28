package pulse;

import net.minecraft.client.util.math.MatrixStack;

public interface ClickGuiOverlay {
   void a(MatrixStack matrices, Renderer2D renderer, float x, float y, int mouseX, int mouseY);

   void a(float x, float y, int mouseX, int mouseY);

   default void b(float x, float y, int mouseX, int mouseY) {
   }
}
