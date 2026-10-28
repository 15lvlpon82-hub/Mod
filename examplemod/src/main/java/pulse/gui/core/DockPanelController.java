package pulse;

import net.minecraft.client.util.math.MatrixStack;

class DockPanelController implements ClickGuiOverlay {
   private final PulseClickGuiScreen screen;
   private Dock dock = Dock.BOTTOM;
   private boolean open;
   private boolean dragging;

   DockPanelController(PulseClickGuiScreen screen) {
      this.screen = screen;
   }

   public Dock a() {
      return this.dock;
   }

   public void a(Dock dock) {
      if (dock != null) {
         this.dock = dock;
      }
   }

   public boolean b() {
      return this.open;
   }

   public boolean c() {
      return this.dragging;
   }

   public boolean d() {
      return this.open || this.dragging;
   }

   public void e() {
      this.open = false;
      this.dragging = false;
   }

   public void b(MatrixStack matrices, Renderer2D renderer, float x, float y, int mouseX, int mouseY) {
      this.a(matrices, renderer, x, y, mouseX, mouseY);
   }

   @Override
   public void a(MatrixStack matrices, Renderer2D renderer, float x, float y, int mouseX, int mouseY) {
   }

   @Override
   public void a(float x, float y, int mouseX, int mouseY) {
      this.open = true;
      this.dragging = true;
   }

   @Override
   public void b(float x, float y, int mouseX, int mouseY) {
      this.dragging = false;
   }

   public void c(float x, float y, int mouseX, int mouseY) {
      this.dragging = false;
   }

   public void a(float x, float y, int mouseX, int mouseY, double horizontalAmount, double verticalAmount) {
   }

   enum Dock {
      BOTTOM,
      LEFT,
      RIGHT
   }
}
