package ru.pulse.mixin;


import pulse.module.ModuleRegistry;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.item.HeldItemRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.CrossbowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.ModelTransformationMode;
import net.minecraft.util.Arm;
import net.minecraft.util.Hand;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RotationAxis;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import pulse.CustomHand;

@Mixin(HeldItemRenderer.class)
public abstract class HeldItemRendererMixin {
   @Shadow
   @Final
   private MinecraftClient client;
   @Shadow
   private ItemStack offHand;

   @Shadow
   public abstract void renderItem(
      LivingEntity var1, ItemStack var2, ModelTransformationMode var3, boolean var4, MatrixStack var5, VertexConsumerProvider var6, int var7
   );

   @Shadow
   protected abstract void renderArmHoldingItem(MatrixStack var1, VertexConsumerProvider var2, int var3, float var4, float var5, Arm var6);

   @Shadow
   protected abstract void renderMapInOneHand(MatrixStack var1, VertexConsumerProvider var2, int var3, float var4, Arm var5, float var6, ItemStack var7);

   @Shadow
   protected abstract void renderMapInBothHands(MatrixStack var1, VertexConsumerProvider var2, int var3, float var4, float var5, float var6);

   @Shadow
   protected abstract void applyEatOrDrinkTransformation(MatrixStack var1, float var2, Arm var3, ItemStack var4, PlayerEntity var5);

   @Shadow
   private void applySwingOffset(MatrixStack var1, Arm var2, float var3) {
   }

   @Shadow
   private void applyEquipOffset(MatrixStack var1, Arm var2, float var3) {
   }

   @Inject(method = "applySwingOffset", at = @At("HEAD"), cancellable = true)
   private void applySwingOffset_tr(MatrixStack var1, Arm var2, float var3, CallbackInfo var4) {
      CustomHand customHand = ModuleRegistry.CUSTOM_HAND;
      if (customHand.k() && customHand.hasCustomSwingAnimation()) {
         int var10 = var2 == Arm.RIGHT ? 1 : -1;
         float var11 = customHand.swingStrength.a() * 10.0F;
         float var12 = MathHelper.sin(var3 * var3 * (float) Math.PI);
         var1.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(var10 * (45.0F + var12 * (-var11 / 4.0F))));
         float var9 = MathHelper.sin(MathHelper.sqrt(var3) * (float) Math.PI);
         var1.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(var10 * var9 * -(var11 / 4.0F)));
         var1.multiply(RotationAxis.POSITIVE_X.rotationDegrees(var9 * -var11));
         var1.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(var10 * -45.0F));
      } else {
         int var6 = var2 == Arm.RIGHT ? 1 : -1;
         float var7 = MathHelper.sin(var3 * var3 * (float) Math.PI);
         var1.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(var6 * (45.0F + var7 * -20.0F)));
         float var8 = MathHelper.sin(MathHelper.sqrt(var3) * (float) Math.PI);
         var1.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(var6 * var8 * -20.0F));
         var1.multiply(RotationAxis.POSITIVE_X.rotationDegrees(var8 * -80.0F));
         var1.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(var6 * -45.0F));
      }

      var4.cancel();
   }

   @Inject(method = "applyEquipOffset", at = @At("HEAD"), cancellable = true)
   private void applyEquipOffset_tr(MatrixStack var1, Arm var2, float var3, CallbackInfo var4) {
      CustomHand customHand = ModuleRegistry.CUSTOM_HAND;
      int var6 = var2 == Arm.RIGHT ? 1 : -1;
      if (customHand.k()) {
         boolean var11 = var2 == this.client.options.getMainArm().getValue();
         float var7;
         float var8;
         float var9;
         float var10;
         if (var11) {
            var7 = customHand.mainHandScale.a();
            var8 = customHand.mainHandOffsetX.a();
            var9 = customHand.mainHandOffsetY.a();
            var10 = customHand.mainHandOffsetZ.a();
         } else {
            var7 = customHand.offHandScale.a();
            var8 = customHand.offHandOffsetX.a();
            var9 = customHand.offHandOffsetY.a();
            var10 = customHand.offHandOffsetZ.a();
         }

         boolean var12 = customHand.isNoAnimationMode();
         var1.translate(var6 * 0.56F, -0.52F + var3 * (var12 ? -0.6F : (customHand.hasCustomSwingAnimation() ? 0.0F : -0.6F)), -0.72F);
         var1.scale(var7, var7, var7);
         var1.translate(var8, var9, var10);
      } else {
         var1.translate(var6 * 0.56F, -0.52F + var3 * -0.6F, -0.72F);
      }

      var4.cancel();
   }

   @Inject(method = "renderFirstPersonItem", at = @At("HEAD"), cancellable = true)
   private void renderFirstPersonItem(
      AbstractClientPlayerEntity var1,
      float var2,
      float var3,
      Hand var4,
      float var5,
      ItemStack var6,
      float var7,
      MatrixStack var8,
      VertexConsumerProvider var9,
      int var10,
      CallbackInfo var11
   ) {
      if (var1.isUsingSpyglass()) {
         var11.cancel();
      } else {
         boolean var12 = var4 == Hand.MAIN_HAND;
         Arm var13 = var12 ? var1.getMainArm() : var1.getMainArm().getOpposite();
         CustomHand var14 = ModuleRegistry.CUSTOM_HAND;
         var8.push();
         if (var6.isEmpty()) {
            if (var12 && !var1.isInvisible()) {
               this.renderArmHoldingItem(var8, var9, var10, var7, var5, var13);
            }
         } else if (var6.isOf(Items.FILLED_MAP)) {
            if (var12 && this.offHand.isEmpty()) {
               this.renderMapInBothHands(var8, var9, var10, var3, var7, var5);
            } else {
               this.renderMapInOneHand(var8, var9, var10, var7, var13, var5, var6);
            }
         } else if (var6.isOf(Items.CROSSBOW)) {
            boolean var15 = CrossbowItem.isCharged(var6);
            boolean var20 = var13 == Arm.RIGHT;
            int var21 = var20 ? 1 : -1;
            if (var1.isUsingItem() && var1.getItemUseTimeLeft() > 0 && var1.getActiveHand() == var4) {
               this.applyEquipOffset(var8, var13, var7);
               var8.translate(var21 * -0.4785682F, -0.094387F, 0.05731531F);
               var8.multiply(RotationAxis.POSITIVE_X.rotationDegrees(-11.935F));
               var8.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(var21 * 65.3F));
               var8.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(var21 * -9.785F));
               float var26 = var6.getMaxUseTime(var1) - (var1.getItemUseTimeLeft() - var2 + 1.0F);
               float var31 = var26 / CrossbowItem.getPullTime(var6, var1);
               if (var31 > 1.0F) {
                  var31 = 1.0F;
               }

               if (var31 > 0.1F) {
                  float var34 = MathHelper.sin((var26 - 0.1F) * 1.3F);
                  float var19 = var31 - 0.1F;
                  float var22 = var34 * var19;
                  var8.translate(var22 * 0.0F, var22 * 0.004F, var22 * 0.0F);
               }

               var8.translate(var31 * 0.0F, var31 * 0.0F, var31 * 0.04F);
               var8.scale(1.0F, 1.0F, 1.0F + var31 * 0.2F);
               var8.multiply(RotationAxis.NEGATIVE_Y.rotationDegrees(var21 * 45.0F));
            } else {
               float var16 = -0.4F * MathHelper.sin(MathHelper.sqrt(var5) * (float) Math.PI);
               float var17 = 0.2F * MathHelper.sin(MathHelper.sqrt(var5) * (float) (Math.PI * 2));
               float var18 = -0.2F * MathHelper.sin(var5 * (float) Math.PI);
               var8.translate(var21 * var16, var17, var18);
               this.applyEquipOffset(var8, var13, var7);
               this.applySwingOffset(var8, var13, var5);
               if (var15 && var5 < 0.001F && var12) {
                  var8.translate(var21 * -0.641864F, 0.0F, 0.0F);
                  var8.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(var21 * 10.0F));
               }
            }

            this.renderItem(var1, var6, var20 ? ModelTransformationMode.FIRST_PERSON_RIGHT_HAND : ModelTransformationMode.FIRST_PERSON_LEFT_HAND, !var20, var8, var9, var10);
         } else {
            boolean var25 = var13 == Arm.RIGHT;
            if (var1.isUsingItem() && var1.getItemUseTimeLeft() > 0 && var1.getActiveHand() == var4) {
               int var40 = var25 ? 1 : -1;
               switch (var6.getUseAction()) {
                  case NONE:
                     this.applyEquipOffset(var8, var13, var7);
                     break;
                  case EAT:
                  case DRINK:
                     this.applyEatOrDrinkTransformation(var8, var2, var13, var6, var1);
                     this.applyEquipOffset(var8, var13, var7);
                     break;
                  case BLOCK:
                     this.applyEquipOffset(var8, var13, var7);
                     break;
                  case BOW:
                     this.applyEquipOffset(var8, var13, var7);
                     var8.translate(var40 * -0.2785682F, 0.18344387F, 0.15731531F);
                     var8.multiply(RotationAxis.POSITIVE_X.rotationDegrees(-13.935F));
                     var8.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(var40 * 35.3F));
                     var8.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(var40 * -9.785F));
                     float var43 = var6.getMaxUseTime(var1) - (var1.getItemUseTimeLeft() - var2 + 1.0F);
                     float var29 = var43 / 20.0F;
                     var29 = (var29 * var29 + var29 * 2.0F) / 3.0F;
                     if (var29 > 1.0F) {
                        var29 = 1.0F;
                     }

                     if (var29 > 0.1F) {
                        float var33 = MathHelper.sin((var43 - 0.1F) * 1.3F);
                        float var36 = var29 - 0.1F;
                        float var38 = var33 * var36;
                        var8.translate(var38 * 0.0F, var38 * 0.004F, var38 * 0.0F);
                     }

                     var8.translate(var29 * 0.0F, var29 * 0.0F, var29 * 0.04F);
                     var8.scale(1.0F, 1.0F, 1.0F + var29 * 0.2F);
                     var8.multiply(RotationAxis.NEGATIVE_Y.rotationDegrees(var40 * 45.0F));
                     break;
                  case SPEAR:
                     this.applyEquipOffset(var8, var13, var7);
                     var8.translate(var40 * -0.5F, 0.7F, 0.1F);
                     var8.multiply(RotationAxis.POSITIVE_X.rotationDegrees(-55.0F));
                     var8.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(var40 * 35.3F));
                     var8.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(var40 * -9.785F));
                     float var42 = var6.getMaxUseTime(var1) - (var1.getItemUseTimeLeft() - var2 + 1.0F);
                     float var28 = var42 / 10.0F;
                     if (var28 > 1.0F) {
                        var28 = 1.0F;
                     }

                     if (var28 > 0.1F) {
                        float var32 = MathHelper.sin((var42 - 0.1F) * 1.3F);
                        float var35 = var28 - 0.1F;
                        float var37 = var32 * var35;
                        var8.translate(var37 * 0.0F, var37 * 0.004F, var37 * 0.0F);
                     }

                     var8.translate(0.0F, 0.0F, var28 * 0.2F);
                     var8.scale(1.0F, 1.0F, 1.0F + var28 * 0.2F);
                     var8.multiply(RotationAxis.NEGATIVE_Y.rotationDegrees(var40 * 45.0F));
                  case BRUSH:
               }
            } else if (var1.isUsingRiptide()) {
               this.applyEquipOffset(var8, var13, var7);
               int var39 = var25 ? 1 : -1;
               var8.translate(var39 * -0.4F, 0.8F, 0.3F);
               var8.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(var39 * 65.0F));
               var8.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(var39 * -85.0F));
            } else {
               float var44 = -0.4F * MathHelper.sin(MathHelper.sqrt(var5) * (float) Math.PI);
               float var41 = 0.2F * MathHelper.sin(MathHelper.sqrt(var5) * (float) (Math.PI * 2));
               float var27 = -0.2F * MathHelper.sin(var5 * (float) Math.PI);
               int var23 = var25 ? 1 : -1;
               if (var14 == null || !var14.k() || var14.isNoAnimationMode()) {
                  var8.translate(var23 * var44, var41, var27);
               }

               this.applyEquipOffset(var8, var13, var7);
               boolean var24 = var4 == Hand.MAIN_HAND;
               if (var14 == null || !var14.k() || !var24) {
                  this.applySwingOffset(var8, var13, var5);
               } else if (var14.isNoAnimationMode()) {
                  this.applySwingOffset(var8, var13, var5);
               } else if (var14.hasCustomSwingAnimation()) {
                  var14.applyCustomSwing(var8, var5, () -> this.applySwingOffset(var8, var13, var5), var13 == Arm.LEFT);
               } else {
                  this.applySwingOffset(var8, var13, var5);
               }
            }

            this.renderItem(var1, var6, var25 ? ModelTransformationMode.FIRST_PERSON_RIGHT_HAND : ModelTransformationMode.FIRST_PERSON_LEFT_HAND, !var25, var8, var9, var10);
         }

         var8.pop();
         var11.cancel();
      }
   }
}
