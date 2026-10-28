package pulse;

import net.minecraft.client.util.math.MatrixStack;

public interface ClickGuiTab {
   void a(MatrixStack matrices, Renderer2D renderer, float x, float y, int mouseX, int mouseY);

   void a(float x, float y, int mouseX, int mouseY);

   void b(float x, float y, int mouseX, int mouseY);

   void c(float x, float y, int mouseX, int mouseY);

   void a(float x, float y, int mouseX, int mouseY, double horizontalAmount, double verticalAmount);

   void a(float delta);

   ClickGuiTabType a();

   default boolean a(int keyCode, int scanCode, int modifiers) {
      return false;
   }

   default boolean b() {
      return false;
   }
}
