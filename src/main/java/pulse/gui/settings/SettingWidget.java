package pulse;

import net.minecraft.client.util.math.MatrixStack;

public interface SettingWidget {
   String a();

   float b();

   void a(MatrixStack matrices, Renderer2D renderer, float x, float y, float width, int mouseX, int mouseY, float scroll, float alpha);

   boolean a(float x, float y, float width, int mouseX, int mouseY);

   default boolean b(float x, float y, float width, int mouseX, int mouseY) {
      return false;
   }

   default void a(int mouseX, int mouseY) {
   }

   default void a(int mouseX, int mouseY, double deltaX, double deltaY) {
   }

   default boolean a(int keyCode, int scanCode, int modifiers) {
      return false;
   }

   default boolean a(char character, int modifiers) {
      return false;
   }

   default boolean a_() {
      return false;
   }

   default void a(MatrixStack matrices, Renderer2D renderer, float x, float y, float width, float height, int mouseX, int mouseY, float scroll, float alpha) {
   }

   default boolean j() {
      return false;
   }

   default boolean l() {
      return false;
   }

   default boolean d() {
      return true;
   }
}
