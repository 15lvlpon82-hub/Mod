package pulse;




import pulse.module.ModuleRegistry;
import pulse.module.ClientModule;
import pulse.module.ModuleInfo;
import pulse.module.ModuleCategory;
import pulse.settings.BooleanSetting;
import pulse.settings.ColorSetting;
import pulse.settings.ModeSetting;
import pulse.settings.SettingGroup;
import pulse.settings.SliderSetting;
import java.awt.Color;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RotationAxis;

@ModuleInfo(a = "Custom Hand", b = "Customizes first-person hands", c = ModuleCategory.VISUALS)
public class CustomHand extends ClientModule {
   private static final String MODE_NORMAL = "Normal";
   private static final String MODE_NO_ANIMATION = "No Animation";
   private static final String MODE_TILT = "Tilt";
   private static final String MODE_SWING = "Swing";
   private static final String MODE_ROTATE = "Rotate";
   private static final String MODE_GROW = "Grow";
   private static final String MODE_SHRINK = "Shrink";
   private static final String MODE_STRETCH = "Stretch";

   private static final String SHADER_NEBULA = "Nebula";
   private static final String SHADER_STARS = "Stars";
   private static final String SHADER_WEB = "Web";
   private static final String SHADER_PLASMA = "Plasma";

   public final ModeSetting animationMode;
   public final SliderSetting animationSpeed;
   public final SliderSetting swingStrength;
   private final SettingGroup shaderSection;
   public final BooleanSetting shaderEnabled;
   public final ModeSetting shaderMode;
   public final SliderSetting shaderSpeed;
   public final SliderSetting shaderOpacity;
   public final BooleanSetting shaderOnly;
   public final BooleanSetting useClientColor;
   public final ColorSetting shaderColor;
   private final SettingGroup mainHandSection;
   public final SliderSetting mainHandScale;
   public final SliderSetting mainHandOffsetX;
   public final SliderSetting mainHandOffsetY;
   public final SliderSetting mainHandOffsetZ;
   private final SettingGroup offHandSection;
   public final SliderSetting offHandScale;
   public final SliderSetting offHandOffsetX;
   public final SliderSetting offHandOffsetY;
   public final SliderSetting offHandOffsetZ;

   public CustomHand() {
      this.animationMode = new ModeSetting(
         "Animation",
         new String[]{MODE_NORMAL, MODE_NO_ANIMATION, MODE_TILT, MODE_SWING, MODE_ROTATE, MODE_GROW, MODE_SHRINK, MODE_STRETCH},
         MODE_NORMAL
      );
      this.animationSpeed = new SliderSetting("Animation Speed", 6.0F, 1.0F, 20.0F, 1.0F);
      this.swingStrength = new SliderSetting("Swing Strength", 5.0F, 1.0F, 10.0F, 0.5F);

      this.shaderSection = new SettingGroup("Shader");
      this.shaderEnabled = new BooleanSetting("Shader", false);
      this.shaderMode = new ModeSetting("Shader Type", new String[]{SHADER_NEBULA, SHADER_STARS, SHADER_WEB, SHADER_PLASMA}, SHADER_NEBULA).a(this.shaderEnabled::a);
      this.shaderSpeed = new SliderSetting("Shader Speed", 1.0F, 0.1F, 3.0F, 0.1F).a(this.shaderEnabled::a);
      this.shaderOpacity = new SliderSetting("Shader Opacity", 0.5F, 0.1F, 1.0F, 0.05F).a(this.shaderEnabled::a);
      this.shaderOnly = new BooleanSetting("Shader Only", false).a(this.shaderEnabled::a);
      this.useClientColor = new BooleanSetting("Client Color", true).a(this.shaderEnabled::a);
      this.shaderColor = new ColorSetting("Shader Color", Color.WHITE).a(() -> this.shaderEnabled.a() && !this.useClientColor.a());

      this.mainHandSection = new SettingGroup("Main Hand");
      this.mainHandScale = new SliderSetting("Main Hand Scale", 1.0F, 0.5F, 1.5F, 0.05F);
      this.mainHandOffsetX = new SliderSetting("Main Hand X", 0.0F, -2.0F, 2.0F, 0.05F);
      this.mainHandOffsetY = new SliderSetting("Main Hand Y", 0.0F, -2.0F, 2.0F, 0.05F);
      this.mainHandOffsetZ = new SliderSetting("Main Hand Z", 0.0F, -2.0F, 2.0F, 0.05F);

      this.offHandSection = new SettingGroup("Off Hand");
      this.offHandScale = new SliderSetting("Off Hand Scale", 1.0F, 0.5F, 1.5F, 0.05F);
      this.offHandOffsetX = new SliderSetting("Off Hand X", 0.0F, -2.0F, 2.0F, 0.05F);
      this.offHandOffsetY = new SliderSetting("Off Hand Y", 0.0F, -2.0F, 2.0F, 0.05F);
      this.offHandOffsetZ = new SliderSetting("Off Hand Z", 0.0F, -2.0F, 2.0F, 0.05F);
   }

   public void applyCustomSwing(MatrixStack matrices, float swingProgress, Runnable vanillaSwing, boolean leftHand) {
      if (vanillaSwing == null || isNoAnimationMode()) {
         return;
      }

      float easedSwing = MathHelper.sin(MathHelper.sqrt(swingProgress) * (float)Math.PI);
      float squaredSwing = MathHelper.sin(swingProgress * swingProgress * (float)Math.PI);
      float strength = Math.max(0.1F, this.swingStrength.a());
      int side = leftHand ? -1 : 1;

      switch (this.animationMode.d()) {
         case MODE_TILT:
            matrices.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(side * easedSwing * (strength * 3.5F)));
            matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(side * squaredSwing * -(strength * 2.5F)));
            vanillaSwing.run();
            break;
         case MODE_SWING:
            matrices.translate(side * easedSwing * 0.08F, -squaredSwing * 0.08F, -easedSwing * 0.12F);
            matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(-easedSwing * (strength * 5.0F)));
            matrices.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(side * squaredSwing * (strength * 3.0F)));
            vanillaSwing.run();
            break;
         case MODE_ROTATE:
            matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(side * easedSwing * (strength * 16.0F)));
            matrices.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(side * squaredSwing * (strength * 10.0F)));
            vanillaSwing.run();
            break;
         case MODE_GROW:
            scaleUniform(matrices, 1.0F + easedSwing * 0.18F);
            vanillaSwing.run();
            break;
         case MODE_SHRINK:
            scaleUniform(matrices, 1.0F - easedSwing * 0.16F);
            vanillaSwing.run();
            break;
         case MODE_STRETCH:
            matrices.scale(1.0F + easedSwing * 0.12F, 1.0F - easedSwing * 0.08F, 1.0F + squaredSwing * 0.18F);
            vanillaSwing.run();
            break;
         case MODE_NORMAL:
         default:
            vanillaSwing.run();
      }
   }

   public boolean hasCustomSwingAnimation() {
      return !isNoAnimationMode();
   }

   public int shaderModeIndex() {
      return this.shaderMode.k();
   }

   public Color handShaderColor() {
      if (this.useClientColor.a()) {
         ClientColor clientColor = ModuleRegistry.CLIENT_COLOR;
         if (clientColor != null) {
            return clientColor.n();
         }
      }

      return this.shaderColor.a();
   }

   public boolean isNoAnimationMode() {
      return this.animationMode.b(MODE_NO_ANIMATION);
   }

   public void a(MatrixStack matrices, float swingProgress, Runnable vanillaSwing, boolean leftHand) {
      this.applyCustomSwing(matrices, swingProgress, vanillaSwing, leftHand);
   }

   public boolean n() {
      return this.hasCustomSwingAnimation();
   }

   public int o() {
      return this.shaderModeIndex();
   }

   public Color p() {
      return this.handShaderColor();
   }

   private static void scaleUniform(MatrixStack matrices, float scale) {
      matrices.scale(scale, scale, scale);
   }
}
