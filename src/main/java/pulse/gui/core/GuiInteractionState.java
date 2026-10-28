package pulse;

import java.awt.Color;
import net.minecraft.client.util.math.MatrixStack;
import pulse.client.MinecraftContext;

public final class GuiInteractionState {
   private static final GuiInteractionState INSTANCE = new GuiInteractionState();
   private static final int DEFAULT_OVERLAY_ALPHA = 80;
   private static final int STRONG_OVERLAY_ALPHA = 150;

   private final AnimationState overlayAnimation = new AnimationState();
   private boolean overlayVisible;
   private boolean draggingMainPanel;
   private boolean draggingCategoryList;
   private boolean draggingConfigMenu;
   private boolean draggingPopup;
   private boolean strongOverlay;

   private GuiInteractionState() {
      this.overlayAnimation.d(0.0);
   }

   public static GuiInteractionState a() {
      return INSTANCE;
   }

   public void a(boolean value) {
      this.setDraggingMainPanel(value);
   }

   public void b(boolean value) {
      this.draggingCategoryList = value;
      this.updateOverlayAnimation();
   }

   public void c(boolean value) {
      this.draggingConfigMenu = value;
      this.updateOverlayAnimation();
   }

   public void d(boolean value) {
      this.draggingPopup = value;
      this.updateOverlayAnimation();
   }

   public void e(boolean value) {
      this.strongOverlay = value;
      this.updateOverlayAnimation();
   }

   public boolean b() {
      return this.draggingMainPanel
         || this.draggingCategoryList
         || this.draggingConfigMenu
         || this.draggingPopup
         || this.strongOverlay;
   }

   public boolean c() {
      return this.draggingPopup;
   }

   public boolean d() {
      return this.strongOverlay;
   }

   public boolean e() {
      return this.draggingConfigMenu;
   }

   public void f() {
      this.draggingMainPanel = false;
      this.draggingCategoryList = false;
      this.draggingConfigMenu = false;
      this.draggingPopup = false;
      this.strongOverlay = false;
      this.overlayVisible = false;
      this.overlayAnimation.d(0.0);
   }

   public void a(MatrixStack matrices, Renderer2D renderer) {
      this.overlayAnimation.a();
      float progress = (float)this.overlayAnimation.j();
      if (progress <= 0.01F) {
         return;
      }

      int width = MinecraftContext.d.getWidth() / 2;
      int height = MinecraftContext.d.getHeight() / 2;
      int baseAlpha = this.strongOverlay ? STRONG_OVERLAY_ALPHA : DEFAULT_OVERLAY_ALPHA;
      Color overlay = Theme.a(Theme.FriendCard, (int)(baseAlpha * progress));
      renderer.a(0.0F, 0.0F, width, height, overlay, matrices);
   }

   public float g() {
      return (float)this.overlayAnimation.j();
   }

   private void setDraggingMainPanel(boolean value) {
      this.draggingMainPanel = value;
      this.updateOverlayAnimation();
   }

   private void updateOverlayAnimation() {
      boolean active = this.b();
      if (active == this.overlayVisible) {
         return;
      }

      this.overlayAnimation.a(active ? 1.0 : 0.0, active ? 0.2 : 0.15, Easing.h);
      this.overlayVisible = active;
   }
}
