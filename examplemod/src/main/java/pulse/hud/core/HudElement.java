package pulse;

import java.awt.Color;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.util.math.MatrixStack;

public abstract class HudElement {
   protected final MinecraftClient a = MinecraftClient.getInstance();
   protected float b;
   protected float c;
   protected float d;
   protected float e;
   protected boolean f;
   protected float g;
   protected float h;
   protected boolean i = true;
   protected boolean j;
   protected boolean k;
   protected int l;

   private final AnimationState hoverAnimation = new AnimationState();
   private final HudElementPlacement placement = new HudElementPlacement();
   private float lastScreenWidth = -1.0F;
   private float lastScreenHeight = -1.0F;
   private HudSnapResult snapState;
   private final ModuleSettingsPanel settingsPanel = new ModuleSettingsPanel();

   public HudElement(float x, float y) {
      this.b = x;
      this.c = y;
      this.hoverAnimation.d(0.0);
   }

   public abstract void a(MatrixStack matrices, Renderer2D renderer, float screenWidth, float screenHeight);

   protected abstract void a();

   public void b() {
      this.a();
   }

   public boolean c() {
      return true;
   }

   public boolean a(double mouseX, double mouseY, int button) {
      if (this.f) {
         return true;
      }

      int x = (int)mouseX;
      int y = (int)mouseY;
      if (this.settingsPanel.c()) {
         if (this.settingsPanel.a(x, y)) {
            return true;
         }

         if (!this.settingsPanel.c(x, y)) {
            this.settingsPanel.a();
            return false;
         }
      }

      if (button == 0 && this.a(mouseX, mouseY)) {
         if (this.settingsPanel.c()) {
            this.settingsPanel.a();
         }

         this.f = true;
         this.g = (float)mouseX - this.b;
         this.h = (float)mouseY - this.c;
         return true;
      }

      return false;
   }

   public void b(double mouseX, double mouseY, int button) {
      if (button == 0) {
         if (this.f) {
            ConfigManager.a().h();
         }

         this.f = false;
         this.snapState = null;
      }

      this.settingsPanel.b((int)mouseX, (int)mouseY);
   }

   public void a(HudSnapResult snapState, float screenWidth, float screenHeight) {
      if (!this.f || snapState == null) {
         return;
      }

      this.b = snapState.a();
      this.c = snapState.b();
      this.snapState = snapState;
      this.placement.a(this.b, this.c, this.d, this.e, screenWidth, screenHeight);
      this.lastScreenWidth = screenWidth;
      this.lastScreenHeight = screenHeight;
   }

   public void a(double mouseX, double mouseY, float screenWidth, float screenHeight) {
      if (!this.f) {
         return;
      }

      float nextX = (float)mouseX - this.g;
      float nextY = (float)mouseY - this.h;
      this.b = clamp(nextX, 5.0F, screenWidth - this.d - 5.0F);
      this.c = clamp(nextY, 5.0F, screenHeight - this.e - 5.0F);
      this.placement.a(this.b, this.c, this.d, this.e, screenWidth, screenHeight);
      this.lastScreenWidth = screenWidth;
      this.lastScreenHeight = screenHeight;
   }

   public void a(float screenWidth, float screenHeight) {
      if (this.lastScreenWidth > 0.0F && this.lastScreenHeight > 0.0F) {
         this.b = clamp(this.placement.a(this.d, screenWidth), 5.0F, screenWidth - this.d - 5.0F);
         this.c = clamp(this.placement.b(this.e, screenHeight), 5.0F, screenHeight - this.e - 5.0F);
      } else {
         this.b = clamp(this.b, 5.0F, screenWidth - this.d - 5.0F);
         this.c = clamp(this.c, 5.0F, screenHeight - this.e - 5.0F);
      }

      this.lastScreenWidth = screenWidth;
      this.lastScreenHeight = screenHeight;
   }

   public void b(float screenWidth, float screenHeight) {
      this.placement.a(this.b, this.c, this.d, this.e, screenWidth, screenHeight);
      this.lastScreenWidth = screenWidth;
      this.lastScreenHeight = screenHeight;
   }

   public void a(double mouseX, double mouseY, boolean selected) {
      this.j = this.a(mouseX, mouseY);
      this.k = selected;
      boolean highlighted = (this.j && selected) || this.f;
      if (highlighted && this.hoverAnimation.i() < 1.0) {
         this.hoverAnimation.a(1.0, 0.15, Easing.h);
      } else if (!highlighted && this.hoverAnimation.i() > 0.0) {
         this.hoverAnimation.a(0.0, 0.2, Easing.h);
      }
   }

   public void d() {
      this.j = false;
      this.k = false;
      this.f = false;
      this.settingsPanel.b();
      if (this.hoverAnimation.j() > 0.0 || this.hoverAnimation.i() > 0.0) {
         this.hoverAnimation.a(0.0, 0.15, Easing.h);
      }
   }

   public void e() {
      this.hoverAnimation.a();
   }

   public void a(MatrixStack matrices, Renderer2D renderer, int mouseX, int mouseY) {
      this.settingsPanel.b(this.b, this.c, this.d, this.e);
      this.settingsPanel.a(matrices, renderer, mouseX, mouseY);
   }

   public void a(double mouseX, double mouseY, double deltaX, double deltaY) {
      this.settingsPanel.a((int)mouseX, (int)mouseY, deltaX, deltaY);
   }

   public boolean a(double mouseX, double mouseY, double amount) {
      return this.settingsPanel.a((float)amount, (int)mouseX, (int)mouseY);
   }

   public ModuleSettingsPanel f() {
      return this.settingsPanel;
   }

   public float g() {
      return this.settingsPanel.i();
   }

   public float h() {
      return (float)this.hoverAnimation.j();
   }

   public void a(Renderer2D renderer, MatrixStack matrices) {
      float alpha = this.h();
      if (alpha < 0.01F) {
         return;
      }

      int outlineAlpha = (int)(25.0F * alpha);
      renderer.a(this.b, this.c, this.d, this.e, 13.0F * this.g(), new Color(130, 105, 255, outlineAlpha), matrices);
   }

   public boolean a(double mouseX, double mouseY) {
      return mouseX >= this.b && mouseX <= this.b + this.d && mouseY >= this.c && mouseY <= this.c + this.e;
   }

   public boolean i() {
      return this.f;
   }

   public boolean j() {
      return this.i;
   }

   public void a(boolean visible) {
      this.i = visible;
   }

   public boolean k() {
      return this.j;
   }

   public float l() {
      return this.b;
   }

   public void a(float x) {
      this.b = x;
   }

   public float m() {
      return this.c;
   }

   public void b(float y) {
      this.c = y;
   }

   public float n() {
      return this.d;
   }

   public float o() {
      return this.e;
   }

   public int p() {
      return this.l;
   }

   public void a(int order) {
      this.l = order;
   }

   public HudSnapResult q() {
      return this.snapState;
   }

   public float r() {
      return this.g;
   }

   public float s() {
      return this.h;
   }

   public HudElementPlacement t() {
      return this.placement;
   }

   private static float clamp(float value, float min, float max) {
      if (max < min) {
         return min;
      }

      return Math.max(min, Math.min(value, max));
   }
}
