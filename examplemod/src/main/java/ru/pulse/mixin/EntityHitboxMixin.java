package ru.pulse.mixin;


import pulse.module.ModuleRegistry;
import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat.DrawMode;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.util.math.MatrixStack.Entry;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import org.joml.Matrix4f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import pulse.HitboxCustomizer;

@Mixin(EntityRenderDispatcher.class)
public class EntityHitboxMixin {
   @Inject(method = "renderHitbox", at = @At("HEAD"), cancellable = true)
   private static void renderCustomHitbox(MatrixStack var0, VertexConsumer var1, Entity var2, float var3, float var4, float var5, float var6, CallbackInfo var7) {
      HitboxCustomizer var8 = ModuleRegistry.HITBOX_CUSTOMIZER;
      if (var8.k()) {
         MinecraftClient var9 = MinecraftClient.getInstance();
         if (var9.player == null || !var9.player.hasStatusEffect(StatusEffects.BLINDNESS)) {
            Box var10 = var2.getBoundingBox().offset(-var2.getX(), -var2.getY(), -var2.getZ());
            if (var8.o()) {
               renderFilledBox(var0, var10, var8);
            }

            renderHitboxOutline(var0, var1, var10, var8);
            if (var8.n() && var2 instanceof LivingEntity) {
               renderEyeLine(var0, var1, var2, var3, var8);
            }

            var7.cancel();
         }
      }
   }

   private static void renderFilledBox(MatrixStack var0, Box var1, HitboxCustomizer var2) {
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.setShader(ShaderProgramKeys.POSITION_COLOR);
      RenderSystem.enableDepthTest();
      RenderSystem.depthFunc(515);
      RenderSystem.disableCull();
      Tessellator var3 = Tessellator.getInstance();
      BufferBuilder var4 = var3.begin(DrawMode.QUADS, VertexFormats.POSITION_COLOR);
      Color var5 = var2.p();
      int var6 = var5.getRed();
      int var7 = var5.getGreen();
      int var8 = var5.getBlue();
      byte var9 = 64;
      Matrix4f var10 = var0.peek().getPositionMatrix();
      float var11 = (float)var1.minX;
      float var12 = (float)var1.minY;
      float var13 = (float)var1.minZ;
      float var14 = (float)var1.maxX;
      float var15 = (float)var1.maxY;
      float var16 = (float)var1.maxZ;
      var4.vertex(var10, var11, var12, var13).color(var6, var7, var8, var9);
      var4.vertex(var10, var11, var15, var13).color(var6, var7, var8, var9);
      var4.vertex(var10, var14, var15, var13).color(var6, var7, var8, var9);
      var4.vertex(var10, var14, var12, var13).color(var6, var7, var8, var9);
      var4.vertex(var10, var14, var12, var16).color(var6, var7, var8, var9);
      var4.vertex(var10, var14, var15, var16).color(var6, var7, var8, var9);
      var4.vertex(var10, var11, var15, var16).color(var6, var7, var8, var9);
      var4.vertex(var10, var11, var12, var16).color(var6, var7, var8, var9);
      var4.vertex(var10, var11, var12, var13).color(var6, var7, var8, var9);
      var4.vertex(var10, var11, var12, var16).color(var6, var7, var8, var9);
      var4.vertex(var10, var11, var15, var16).color(var6, var7, var8, var9);
      var4.vertex(var10, var11, var15, var13).color(var6, var7, var8, var9);
      var4.vertex(var10, var14, var15, var13).color(var6, var7, var8, var9);
      var4.vertex(var10, var14, var15, var16).color(var6, var7, var8, var9);
      var4.vertex(var10, var14, var12, var16).color(var6, var7, var8, var9);
      var4.vertex(var10, var14, var12, var13).color(var6, var7, var8, var9);
      var4.vertex(var10, var11, var12, var13).color(var6, var7, var8, var9);
      var4.vertex(var10, var14, var12, var13).color(var6, var7, var8, var9);
      var4.vertex(var10, var14, var12, var16).color(var6, var7, var8, var9);
      var4.vertex(var10, var11, var12, var16).color(var6, var7, var8, var9);
      var4.vertex(var10, var11, var15, var16).color(var6, var7, var8, var9);
      var4.vertex(var10, var14, var15, var16).color(var6, var7, var8, var9);
      var4.vertex(var10, var14, var15, var13).color(var6, var7, var8, var9);
      var4.vertex(var10, var11, var15, var13).color(var6, var7, var8, var9);
      BufferRenderer.drawWithGlobalProgram(var4.end());
      RenderSystem.enableCull();
      RenderSystem.disableBlend();
   }

   private static void renderHitboxOutline(MatrixStack var0, VertexConsumer var1, Box var2, HitboxCustomizer var3) {
      if (var3.q()) {
         renderCornerOutline(var0, var1, var2, var3);
      } else {
         renderFullOutline(var0, var1, var2, var3);
      }
   }

   private static void renderFullOutline(MatrixStack var0, VertexConsumer var1, Box var2, HitboxCustomizer var3) {
      Entry var4 = var0.peek();
      Color var5 = var3.p();
      float var6 = var5.getRed() / 255.0F;
      float var7 = var5.getGreen() / 255.0F;
      float var8 = var5.getBlue() / 255.0F;
      float var9 = 1.0F;
      var1.vertex(var4, (float)var2.minX, (float)var2.minY, (float)var2.minZ)
         .color(var6, var7, var8, var9)
         .normal(var4, 1.0F, 0.0F, 0.0F);
      var1.vertex(var4, (float)var2.maxX, (float)var2.minY, (float)var2.minZ)
         .color(var6, var7, var8, var9)
         .normal(var4, 1.0F, 0.0F, 0.0F);
      var1.vertex(var4, (float)var2.maxX, (float)var2.minY, (float)var2.minZ)
         .color(var6, var7, var8, var9)
         .normal(var4, 0.0F, 1.0F, 0.0F);
      var1.vertex(var4, (float)var2.maxX, (float)var2.maxY, (float)var2.minZ)
         .color(var6, var7, var8, var9)
         .normal(var4, 0.0F, 1.0F, 0.0F);
      var1.vertex(var4, (float)var2.maxX, (float)var2.maxY, (float)var2.minZ)
         .color(var6, var7, var8, var9)
         .normal(var4, -1.0F, 0.0F, 0.0F);
      var1.vertex(var4, (float)var2.minX, (float)var2.maxY, (float)var2.minZ)
         .color(var6, var7, var8, var9)
         .normal(var4, -1.0F, 0.0F, 0.0F);
      var1.vertex(var4, (float)var2.minX, (float)var2.maxY, (float)var2.minZ)
         .color(var6, var7, var8, var9)
         .normal(var4, 0.0F, -1.0F, 0.0F);
      var1.vertex(var4, (float)var2.minX, (float)var2.minY, (float)var2.minZ)
         .color(var6, var7, var8, var9)
         .normal(var4, 0.0F, -1.0F, 0.0F);
      var1.vertex(var4, (float)var2.minX, (float)var2.minY, (float)var2.maxZ)
         .color(var6, var7, var8, var9)
         .normal(var4, 1.0F, 0.0F, 0.0F);
      var1.vertex(var4, (float)var2.maxX, (float)var2.minY, (float)var2.maxZ)
         .color(var6, var7, var8, var9)
         .normal(var4, 1.0F, 0.0F, 0.0F);
      var1.vertex(var4, (float)var2.maxX, (float)var2.minY, (float)var2.maxZ)
         .color(var6, var7, var8, var9)
         .normal(var4, 0.0F, 1.0F, 0.0F);
      var1.vertex(var4, (float)var2.maxX, (float)var2.maxY, (float)var2.maxZ)
         .color(var6, var7, var8, var9)
         .normal(var4, 0.0F, 1.0F, 0.0F);
      var1.vertex(var4, (float)var2.maxX, (float)var2.maxY, (float)var2.maxZ)
         .color(var6, var7, var8, var9)
         .normal(var4, -1.0F, 0.0F, 0.0F);
      var1.vertex(var4, (float)var2.minX, (float)var2.maxY, (float)var2.maxZ)
         .color(var6, var7, var8, var9)
         .normal(var4, -1.0F, 0.0F, 0.0F);
      var1.vertex(var4, (float)var2.minX, (float)var2.maxY, (float)var2.maxZ)
         .color(var6, var7, var8, var9)
         .normal(var4, 0.0F, -1.0F, 0.0F);
      var1.vertex(var4, (float)var2.minX, (float)var2.minY, (float)var2.maxZ)
         .color(var6, var7, var8, var9)
         .normal(var4, 0.0F, -1.0F, 0.0F);
      var1.vertex(var4, (float)var2.minX, (float)var2.minY, (float)var2.minZ)
         .color(var6, var7, var8, var9)
         .normal(var4, 0.0F, 0.0F, 1.0F);
      var1.vertex(var4, (float)var2.minX, (float)var2.minY, (float)var2.maxZ)
         .color(var6, var7, var8, var9)
         .normal(var4, 0.0F, 0.0F, 1.0F);
      var1.vertex(var4, (float)var2.maxX, (float)var2.minY, (float)var2.minZ)
         .color(var6, var7, var8, var9)
         .normal(var4, 0.0F, 0.0F, 1.0F);
      var1.vertex(var4, (float)var2.maxX, (float)var2.minY, (float)var2.maxZ)
         .color(var6, var7, var8, var9)
         .normal(var4, 0.0F, 0.0F, 1.0F);
      var1.vertex(var4, (float)var2.maxX, (float)var2.maxY, (float)var2.minZ)
         .color(var6, var7, var8, var9)
         .normal(var4, 0.0F, 0.0F, 1.0F);
      var1.vertex(var4, (float)var2.maxX, (float)var2.maxY, (float)var2.maxZ)
         .color(var6, var7, var8, var9)
         .normal(var4, 0.0F, 0.0F, 1.0F);
      var1.vertex(var4, (float)var2.minX, (float)var2.maxY, (float)var2.minZ)
         .color(var6, var7, var8, var9)
         .normal(var4, 0.0F, 0.0F, 1.0F);
      var1.vertex(var4, (float)var2.minX, (float)var2.maxY, (float)var2.maxZ)
         .color(var6, var7, var8, var9)
         .normal(var4, 0.0F, 0.0F, 1.0F);
   }

   private static void renderCornerOutline(MatrixStack var0, VertexConsumer var1, Box var2, HitboxCustomizer var3) {
      Entry var4 = var0.peek();
      Color var5 = var3.p();
      float var6 = var5.getRed() / 255.0F;
      float var7 = var5.getGreen() / 255.0F;
      float var8 = var5.getBlue() / 255.0F;
      float var9 = 1.0F;
      float var10 = var3.r();
      float var11 = (float)var2.minX;
      float var12 = (float)var2.minY;
      float var13 = (float)var2.minZ;
      float var14 = (float)var2.maxX;
      float var15 = (float)var2.maxY;
      float var16 = (float)var2.maxZ;
      var1.vertex(var4, var11, var12, var13).color(var6, var7, var8, var9).normal(var4, 1.0F, 0.0F, 0.0F);
      var1.vertex(var4, var11 + var10, var12, var13).color(var6, var7, var8, var9).normal(var4, 1.0F, 0.0F, 0.0F);
      var1.vertex(var4, var11, var12, var13).color(var6, var7, var8, var9).normal(var4, 0.0F, 1.0F, 0.0F);
      var1.vertex(var4, var11, var12 + var10, var13).color(var6, var7, var8, var9).normal(var4, 0.0F, 1.0F, 0.0F);
      var1.vertex(var4, var11, var12, var13).color(var6, var7, var8, var9).normal(var4, 0.0F, 0.0F, 1.0F);
      var1.vertex(var4, var11, var12, var13 + var10).color(var6, var7, var8, var9).normal(var4, 0.0F, 0.0F, 1.0F);
      var1.vertex(var4, var14, var12, var13).color(var6, var7, var8, var9).normal(var4, -1.0F, 0.0F, 0.0F);
      var1.vertex(var4, var14 - var10, var12, var13).color(var6, var7, var8, var9).normal(var4, -1.0F, 0.0F, 0.0F);
      var1.vertex(var4, var14, var12, var13).color(var6, var7, var8, var9).normal(var4, 0.0F, 1.0F, 0.0F);
      var1.vertex(var4, var14, var12 + var10, var13).color(var6, var7, var8, var9).normal(var4, 0.0F, 1.0F, 0.0F);
      var1.vertex(var4, var14, var12, var13).color(var6, var7, var8, var9).normal(var4, 0.0F, 0.0F, 1.0F);
      var1.vertex(var4, var14, var12, var13 + var10).color(var6, var7, var8, var9).normal(var4, 0.0F, 0.0F, 1.0F);
      var1.vertex(var4, var11, var15, var13).color(var6, var7, var8, var9).normal(var4, 1.0F, 0.0F, 0.0F);
      var1.vertex(var4, var11 + var10, var15, var13).color(var6, var7, var8, var9).normal(var4, 1.0F, 0.0F, 0.0F);
      var1.vertex(var4, var11, var15, var13).color(var6, var7, var8, var9).normal(var4, 0.0F, -1.0F, 0.0F);
      var1.vertex(var4, var11, var15 - var10, var13).color(var6, var7, var8, var9).normal(var4, 0.0F, -1.0F, 0.0F);
      var1.vertex(var4, var11, var15, var13).color(var6, var7, var8, var9).normal(var4, 0.0F, 0.0F, 1.0F);
      var1.vertex(var4, var11, var15, var13 + var10).color(var6, var7, var8, var9).normal(var4, 0.0F, 0.0F, 1.0F);
      var1.vertex(var4, var14, var15, var13).color(var6, var7, var8, var9).normal(var4, -1.0F, 0.0F, 0.0F);
      var1.vertex(var4, var14 - var10, var15, var13).color(var6, var7, var8, var9).normal(var4, -1.0F, 0.0F, 0.0F);
      var1.vertex(var4, var14, var15, var13).color(var6, var7, var8, var9).normal(var4, 0.0F, -1.0F, 0.0F);
      var1.vertex(var4, var14, var15 - var10, var13).color(var6, var7, var8, var9).normal(var4, 0.0F, -1.0F, 0.0F);
      var1.vertex(var4, var14, var15, var13).color(var6, var7, var8, var9).normal(var4, 0.0F, 0.0F, 1.0F);
      var1.vertex(var4, var14, var15, var13 + var10).color(var6, var7, var8, var9).normal(var4, 0.0F, 0.0F, 1.0F);
      var1.vertex(var4, var11, var12, var16).color(var6, var7, var8, var9).normal(var4, 1.0F, 0.0F, 0.0F);
      var1.vertex(var4, var11 + var10, var12, var16).color(var6, var7, var8, var9).normal(var4, 1.0F, 0.0F, 0.0F);
      var1.vertex(var4, var11, var12, var16).color(var6, var7, var8, var9).normal(var4, 0.0F, 1.0F, 0.0F);
      var1.vertex(var4, var11, var12 + var10, var16).color(var6, var7, var8, var9).normal(var4, 0.0F, 1.0F, 0.0F);
      var1.vertex(var4, var11, var12, var16).color(var6, var7, var8, var9).normal(var4, 0.0F, 0.0F, -1.0F);
      var1.vertex(var4, var11, var12, var16 - var10).color(var6, var7, var8, var9).normal(var4, 0.0F, 0.0F, -1.0F);
      var1.vertex(var4, var14, var12, var16).color(var6, var7, var8, var9).normal(var4, -1.0F, 0.0F, 0.0F);
      var1.vertex(var4, var14 - var10, var12, var16).color(var6, var7, var8, var9).normal(var4, -1.0F, 0.0F, 0.0F);
      var1.vertex(var4, var14, var12, var16).color(var6, var7, var8, var9).normal(var4, 0.0F, 1.0F, 0.0F);
      var1.vertex(var4, var14, var12 + var10, var16).color(var6, var7, var8, var9).normal(var4, 0.0F, 1.0F, 0.0F);
      var1.vertex(var4, var14, var12, var16).color(var6, var7, var8, var9).normal(var4, 0.0F, 0.0F, -1.0F);
      var1.vertex(var4, var14, var12, var16 - var10).color(var6, var7, var8, var9).normal(var4, 0.0F, 0.0F, -1.0F);
      var1.vertex(var4, var11, var15, var16).color(var6, var7, var8, var9).normal(var4, 1.0F, 0.0F, 0.0F);
      var1.vertex(var4, var11 + var10, var15, var16).color(var6, var7, var8, var9).normal(var4, 1.0F, 0.0F, 0.0F);
      var1.vertex(var4, var11, var15, var16).color(var6, var7, var8, var9).normal(var4, 0.0F, -1.0F, 0.0F);
      var1.vertex(var4, var11, var15 - var10, var16).color(var6, var7, var8, var9).normal(var4, 0.0F, -1.0F, 0.0F);
      var1.vertex(var4, var11, var15, var16).color(var6, var7, var8, var9).normal(var4, 0.0F, 0.0F, -1.0F);
      var1.vertex(var4, var11, var15, var16 - var10).color(var6, var7, var8, var9).normal(var4, 0.0F, 0.0F, -1.0F);
      var1.vertex(var4, var14, var15, var16).color(var6, var7, var8, var9).normal(var4, -1.0F, 0.0F, 0.0F);
      var1.vertex(var4, var14 - var10, var15, var16).color(var6, var7, var8, var9).normal(var4, -1.0F, 0.0F, 0.0F);
      var1.vertex(var4, var14, var15, var16).color(var6, var7, var8, var9).normal(var4, 0.0F, -1.0F, 0.0F);
      var1.vertex(var4, var14, var15 - var10, var16).color(var6, var7, var8, var9).normal(var4, 0.0F, -1.0F, 0.0F);
      var1.vertex(var4, var14, var15, var16).color(var6, var7, var8, var9).normal(var4, 0.0F, 0.0F, -1.0F);
      var1.vertex(var4, var14, var15, var16 - var10).color(var6, var7, var8, var9).normal(var4, 0.0F, 0.0F, -1.0F);
   }

   private static void renderEyeLine(MatrixStack var0, VertexConsumer var1, Entity var2, float var3, HitboxCustomizer var4) {
      Entry var5 = var0.peek();
      Vec3d var6 = new Vec3d(0.0, var2.getEyeHeight(var2.getPose()), 0.0);
      Vec3d var7 = var2.getRotationVec(var3);
      Vec3d var8 = var6.add(var7.multiply(2.0));
      Color var9 = var4.p();
      float var10 = var9.getRed() / 255.0F;
      float var11 = var9.getGreen() / 255.0F;
      float var12 = var9.getBlue() / 255.0F;
      var1.vertex(var5, (float)var6.x, (float)var6.y, (float)var6.z)
         .color(var10, var11, var12, 1.0F)
         .normal(var5, (float)var7.x, (float)var7.y, (float)var7.z);
      var1.vertex(var5, (float)var8.x, (float)var8.y, (float)var8.z)
         .color(var10, var11, var12, 1.0F)
         .normal(var5, (float)var7.x, (float)var7.y, (float)var7.z);
   }
}
