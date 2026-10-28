package pulse;

import java.awt.Color;
import java.util.Locale;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.util.DefaultSkinHelper;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.hit.HitResult.Type;
import pulse.module.ModuleRegistry;

public class TargetHudElement extends HudElement {
   private static final float WIDTH = 134.0F;
   private static final float HEIGHT = 38.0F;
   private static final float AVATAR_SIZE = 23.0F;
   private static final float CARD_RADIUS = 7.0F;
   private static final float AVATAR_RADIUS = 4.0F;
   private static final float HP_BAR_HEIGHT = 2.4F;
   private static final float HP_BAR_WIDTH = 88.0F;

   private static final Color SHADOW = new Color(0, 0, 0, 96);
   private static final Color CARD_TOP = new Color(15, 15, 26, 232);
   private static final Color CARD_BOTTOM = new Color(9, 9, 18, 236);
   private static final Color AVATAR_BACK_TOP = new Color(30, 28, 42, 245);
   private static final Color AVATAR_BACK_BOTTOM = new Color(18, 17, 28, 245);
   private static final Color BAR_BACK = new Color(22, 20, 34, 230);
   private static final Color BAR_GLOW = new Color(125, 82, 255, 150);
   private static final Color TEXT_SECONDARY = new Color(230, 230, 238, 238);

   private final AnimationState visibilityAnimation = new AnimationState();
   private final AnimationState healthAnimation = new AnimationState();
   private final AnimationState switchAnimation = new AnimationState();

   private LivingEntity target;
   private String targetName = "Target";
   private float targetHealth;
   private float targetMaxHealth = 20.0F;
   private Identifier skinTexture;
   private Identifier lastTexture;
   private long textureChangedAtMs;
   private boolean visible;
   private boolean settingsBound;

   public TargetHudElement(float x, float y) {
      super(x, y);
      this.visibilityAnimation.d(0.0);
      this.healthAnimation.d(1.0);
      this.switchAnimation.d(1.0);
      this.d = WIDTH;
      this.e = HEIGHT;
   }

   @Override
   protected void a() {
      this.bindSettings();
      float scale = this.g();
      this.d = WIDTH * scale;
      this.e = HEIGHT * scale;
   }

   @Override
   public void a(MatrixStack matrices, Renderer2D renderer, float mouseX, float mouseY) {
      if (this.a.player == null) {
         return;
      }

      this.a();
      this.updateTarget();

      float alpha = (float)this.visibilityAnimation.j();
      if (alpha < 0.01F) {
         return;
      }

      float scale = this.g();
      float x = this.b;
      float y = this.c;
      float width = WIDTH * scale;
      float height = HEIGHT * scale;
      float radius = CARD_RADIUS * scale;
      this.d = width;
      this.e = height;

      renderer.a(x, y + 1.5F * scale, width, height, radius, withAlpha(SHADOW, alpha), matrices);
      renderer.a(x, y, width, height, radius, withAlpha(CARD_TOP, alpha), withAlpha(CARD_TOP, alpha), withAlpha(CARD_BOTTOM, alpha), withAlpha(CARD_BOTTOM, alpha), matrices);

      this.drawAvatar(matrices, renderer, x + 7.0F * scale, y + 6.0F * scale, alpha, scale);
      this.drawText(matrices, x, y, width, alpha, scale);
      this.drawHealthBar(matrices, renderer, x, y, alpha, scale);
   }

   private void bindSettings() {
      if (!this.settingsBound && ModuleRegistry.TARGET_HUD != null) {
         this.f().a(ModuleRegistry.TARGET_HUD);
         this.settingsBound = true;
      }
   }

   private void updateTarget() {
      LivingEntity nextTarget = HudServiceRegistry.TARGETS.currentTarget();
      if (nextTarget == null) {
         nextTarget = this.targetFromCrosshair();
      }

      if (nextTarget == null && this.a.currentScreen instanceof ChatScreen && this.a.player != null) {
         nextTarget = this.a.player;
      }

      boolean wasVisible = this.visible;
      this.visible = nextTarget != null;

      if (nextTarget != null) {
         if (nextTarget != this.target) {
            this.target = nextTarget;
            this.switchAnimation.d(0.0);
            this.switchAnimation.a(1.0, 0.2, Easing.h);
            this.targetName = nextTarget.getName().getString();
            this.skinTexture = nextTarget instanceof PlayerEntity player ? this.skinFor(player) : DefaultSkinHelper.getTexture();
         }

         this.targetHealth = Math.max(0.0F, nextTarget.getHealth());
         this.targetMaxHealth = Math.max(1.0F, nextTarget.getMaxHealth());
         if (nextTarget instanceof PlayerEntity player) {
            this.targetName = player.getGameProfile().getName();
            this.skinTexture = this.skinFor(player);
         }
      } else {
         this.target = null;
      }

      if (this.visible && !wasVisible) {
         this.visibilityAnimation.a(1.0, 0.2, Easing.h);
      } else if (!this.visible && wasVisible) {
         this.visibilityAnimation.a(0.0, 0.2, Easing.h);
      } else if (this.visible && this.visibilityAnimation.i() < 1.0) {
         this.visibilityAnimation.a(1.0, 0.2, Easing.h);
      }

      float healthRatio = Math.max(0.0F, Math.min(1.0F, this.targetHealth / this.targetMaxHealth));
      if (Math.abs(this.healthAnimation.i() - healthRatio) > 0.01F) {
         this.healthAnimation.a(healthRatio, 0.15, Easing.h);
      }

      this.visibilityAnimation.a();
      this.healthAnimation.a();
      this.switchAnimation.a();
   }

   private void drawAvatar(MatrixStack matrices, Renderer2D renderer, float x, float y, float alpha, float scale) {
      float size = AVATAR_SIZE * scale;
      float radius = AVATAR_RADIUS * scale;
      renderer.a(x - 0.5F * scale, y - 0.5F * scale, size + scale, size + scale, radius, withAlpha(AVATAR_BACK_TOP, alpha), withAlpha(AVATAR_BACK_TOP, alpha), withAlpha(AVATAR_BACK_BOTTOM, alpha), withAlpha(AVATAR_BACK_BOTTOM, alpha), matrices);

      Identifier texture = this.skinTexture != null ? this.skinTexture : DefaultSkinHelper.getTexture();
      if (this.lastTexture == null || !this.lastTexture.equals(texture)) {
         this.lastTexture = texture;
         this.textureChangedAtMs = System.currentTimeMillis();
      }

      if (System.currentTimeMillis() - this.textureChangedAtMs < 100L) {
         renderer.a(x, y, size, size, radius, withAlpha(new Color(35, 31, 45), alpha), matrices);
         return;
      }

      Color textureTint = withAlpha(Color.WHITE, alpha);
      renderer.a(texture, x, y, size, size, radius, 0.125F, 0.125F, 0.125F, 0.125F, textureTint, matrices);
      renderer.a(texture, x, y, size, size, radius, 0.625F, 0.125F, 0.125F, 0.125F, textureTint, matrices);

      if (this.target != null && this.target.hurtTime > 0) {
         float hurtAlpha = this.target.hurtTime / 10.0F * 0.5F * alpha;
         renderer.a(x, y, size, size, radius, new Color(255, 70, 70, (int)(hurtAlpha * 155.0F)), matrices);
      }
   }

   private void drawText(MatrixStack matrices, float x, float y, float width, float alpha, float scale) {
      FontRenderer nameFont = FontManager.b[Math.max(6, Math.min(16, Math.round(12.0F * scale)))];
      FontRenderer hpFont = FontManager.a[Math.max(6, Math.min(15, Math.round(10.8F * scale)))];
      float textX = x + 40.0F * scale;
      int maxNameWidth = Math.max(1, (int)(width - 47.0F * scale));
      String name = this.targetName == null || this.targetName.isBlank() ? "Target" : this.targetName;
      nameFont.a(nameFont.a(name, maxNameWidth, false), textX, y + 7.0F * scale, withAlpha(Color.WHITE, alpha), matrices);

      String healthText = ("HP / " + String.format(Locale.ROOT, "%.1f", Math.max(0.0F, this.targetMaxHealth))).replace('.', ',');
      hpFont.a(healthText, textX, y + 19.5F * scale, withAlpha(TEXT_SECONDARY, alpha), matrices);
   }

   private void drawHealthBar(MatrixStack matrices, Renderer2D renderer, float x, float y, float alpha, float scale) {
      float barX = x + 40.0F * scale;
      float barY = y + 31.5F * scale;
      float barWidth = HP_BAR_WIDTH * scale;
      float barHeight = HP_BAR_HEIGHT * scale;
      float radius = 1.3F * scale;
      renderer.a(barX, barY, barWidth, barHeight, radius, withAlpha(BAR_BACK, alpha), matrices);

      float healthRatio = Math.max(0.0F, Math.min(1.0F, (float)this.healthAnimation.j()));
      float filledWidth = barWidth * healthRatio;
      if (filledWidth <= 0.0F) {
         return;
      }

      Color clientColor = ModuleRegistry.CLIENT_COLOR.n();
      Color darkerClientColor = new Color(Math.max(0, clientColor.getRed() - 34), Math.max(0, clientColor.getGreen() - 34), Math.max(0, clientColor.getBlue() - 34), clientColor.getAlpha());
      renderer.a(barX - 0.55F * scale, barY - 0.55F * scale, filledWidth + 1.1F * scale, barHeight + 1.1F * scale, 2.0F * scale, withAlpha(BAR_GLOW, alpha), matrices);
      renderer.a(barX, barY, filledWidth, barHeight, radius, withAlpha(clientColor, alpha), withAlpha(clientColor, alpha), withAlpha(darkerClientColor, alpha), withAlpha(darkerClientColor, alpha), matrices);
      renderer.a(barX + 0.9F * scale, barY + 0.35F * scale, Math.max(0.0F, filledWidth - 1.8F * scale), 0.55F * scale, 0.45F * scale, withAlpha(new Color(235, 235, 245, 120), alpha), matrices);
   }

   private Identifier skinFor(PlayerEntity player) {
      if (player instanceof AbstractClientPlayerEntity clientPlayer) {
         Identifier texture = clientPlayer.getSkinTextures().texture();
         if (texture != null) {
            return texture;
         }
      }

      return DefaultSkinHelper.getTexture();
   }

   private LivingEntity targetFromCrosshair() {
      if (this.a.player == null || this.a.world == null) {
         return null;
      }

      HitResult hitResult = this.a.crosshairTarget;
      if (hitResult != null && hitResult.getType() == Type.ENTITY && hitResult instanceof EntityHitResult entityHitResult) {
         Entity entity = entityHitResult.getEntity();
         if (entity instanceof LivingEntity livingEntity && livingEntity != this.a.player && livingEntity.isAlive() && !livingEntity.isRemoved()) {
            return livingEntity;
         }
      }

      return null;
   }

   private static Color withAlpha(Color color, float alpha) {
      int value = Math.max(0, Math.min(255, (int)(color.getAlpha() * alpha)));
      return new Color(color.getRed(), color.getGreen(), color.getBlue(), value);
   }
}
