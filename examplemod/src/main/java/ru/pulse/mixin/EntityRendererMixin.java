package ru.pulse.mixin;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat.DrawMode;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.state.EntityRenderState;
import net.minecraft.client.render.entity.state.PlayerEntityRenderState;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.joml.Matrix4f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import pulse.IconTextureRegistry;
import pulse.PlayerListCache;

@Mixin(EntityRenderer.class)
public abstract class EntityRendererMixin<ConfigTextDialog extends Entity, ConfigBoundsDialog extends EntityRenderState> {
   @Unique
   private static final int ICON_SIZE = 8;
   @Unique
   private static final int ICON_PADDING = 2;
   @Unique
   private static final int BACKGROUND_HEIGHT = 9;
   @Unique
   private static final float BG_Z = 0.0F;
   @Unique
   private static final float ICON_Z = 0.0F;
   @Unique
   private static final float SEE_THROUGH_ALPHA = 0.1254902F;
   @Unique
   private static final float SNEAK_DARKEN = 0.5F;
   @Unique
   private boolean shouldRenderIcon = false;
   @Unique
   private boolean isRenderingName = false;
   @Unique
   private int yOffset = 0;
   @Unique
   private float textWidth = 0.0F;
   @Unique
   private boolean isEntitySneaking = false;
   @Unique
   private boolean isSeeThroughMode = false;

   @Shadow
   public abstract TextRenderer getTextRenderer();

   @Inject(method = "renderLabelIfPresent", at = @At("HEAD"))
   private void onLabelStart(ConfigBoundsDialog var1, Text var2, MatrixStack var3, VertexConsumerProvider var4, int var5, CallbackInfo var6) {
      this.shouldRenderIcon = false;
      this.isRenderingName = false;
      this.isEntitySneaking = var1.sneaking;
      this.isSeeThroughMode = !this.isEntitySneaking;
      this.yOffset = "deadmau5".equals(var2.getString()) ? -10 : 0;
      this.isRenderingName = true;
      if (var1 instanceof PlayerEntityRenderState var7 && var7.name != null && PlayerListCache.c().a(var7.name) && var2.getString().contains(var7.name)
         )
       {
         this.shouldRenderIcon = true;
      }

      this.textWidth = this.getTextRenderer().getWidth(var2);
   }

   @Unique
   private float shiftedX(float var1) {
      return this.shouldRenderIcon && this.isRenderingName ? var1 + 5.0F : var1;
   }

   @ModifyArg(
      method = "renderLabelIfPresent",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/font/TextRenderer;draw(Lnet/minecraft/text/Text;FFIZLorg/joml/Matrix4f;Lnet/minecraft/client/render/VertexConsumerProvider;Lnet/minecraft/client/font/TextRenderer$TextLayerType;II)I",
         ordinal = 0
      ),
      index = 1
   )
   private float shiftTextFirst(float var1) {
      return this.shiftedX(var1);
   }

   @ModifyArg(
      method = "renderLabelIfPresent",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/font/TextRenderer;draw(Lnet/minecraft/text/Text;FFIZLorg/joml/Matrix4f;Lnet/minecraft/client/render/VertexConsumerProvider;Lnet/minecraft/client/font/TextRenderer$TextLayerType;II)I",
         ordinal = 1
      ),
      index = 1
   )
   private float shiftTextSecond(float var1) {
      return this.shiftedX(var1);
   }

   @Unique
   private int maybeKillBackground(int var1) {
      return this.shouldRenderIcon && this.isRenderingName ? 0 : var1;
   }

   @ModifyArg(
      method = "renderLabelIfPresent",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/font/TextRenderer;draw(Lnet/minecraft/text/Text;FFIZLorg/joml/Matrix4f;Lnet/minecraft/client/render/VertexConsumerProvider;Lnet/minecraft/client/font/TextRenderer$TextLayerType;II)I",
         ordinal = 0
      ),
      index = 8
   )
   private int killBgFirst(int var1) {
      return this.maybeKillBackground(var1);
   }

   @ModifyArg(
      method = "renderLabelIfPresent",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/font/TextRenderer;draw(Lnet/minecraft/text/Text;FFIZLorg/joml/Matrix4f;Lnet/minecraft/client/render/VertexConsumerProvider;Lnet/minecraft/client/font/TextRenderer$TextLayerType;II)I",
         ordinal = 1
      ),
      index = 8
   )
   private int killBgSecond(int var1) {
      return this.maybeKillBackground(var1);
   }

   @Inject(
      method = "renderLabelIfPresent",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/font/TextRenderer;draw(Lnet/minecraft/text/Text;FFIZLorg/joml/Matrix4f;Lnet/minecraft/client/render/VertexConsumerProvider;Lnet/minecraft/client/font/TextRenderer$TextLayerType;II)I",
         ordinal = 0
      )
   )
   private void renderCustomBackgroundAndIcon(ConfigBoundsDialog var1, Text var2, MatrixStack var3, VertexConsumerProvider var4, int var5, CallbackInfo var6) {
      if (this.shouldRenderIcon && this.isRenderingName) {
         float var7 = 10.0F + this.textWidth;
         float var8 = -var7 / 2.0F;
         float var9 = MinecraftClient.getInstance().options.getTextBackgroundOpacity(0.25F);
         int var10 = ((int)(var9 * 255.0F) & 0xFF) << 24;
         Matrix4f var11 = var3.peek().getPositionMatrix();
         RenderSystem.depthMask(false);

         try {
            this.renderCustomBackground(var11, var8, var7, var10, this.isSeeThroughMode);
            float var12 = var8;
            float var13 = this.yOffset + 0.5F;
            if (this.isSeeThroughMode) {
               this.renderIconTwoPass(var11, var12, var13);
            } else {
               this.renderIconSingleNormal(var11, var12, var13);
            }
         } finally {
            RenderSystem.depthMask(true);
            RenderSystem.depthFunc(515);
            RenderSystem.enableDepthTest();
            RenderSystem.disableBlend();
            RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
         }
      }
   }

   @Unique
   private void renderCustomBackground(Matrix4f var1, float var2, float var3, int var4, boolean var5) {
      int var6 = var4 >>> 24 & 0xFF;
      int var7 = var4 >>> 16 & 0xFF;
      int var8 = var4 >>> 8 & 0xFF;
      int var9 = var4 & 0xFF;
      RenderSystem.enableBlend();
      RenderSystem.enableDepthTest();
      RenderSystem.depthFunc(var5 ? 519 : 515);
      RenderSystem.defaultBlendFunc();
      RenderSystem.setShader(ShaderProgramKeys.POSITION_COLOR);
      Tessellator var10 = Tessellator.getInstance();
      BufferBuilder var11 = var10.begin(DrawMode.QUADS, VertexFormats.POSITION_COLOR);
      float var12 = var2 - 1.0F;
      float var13 = var2 + var3 + 1.0F;
      float var14 = this.yOffset - 1;
      float var15 = this.yOffset + 9 + 1;
      var11.vertex(var1, var12, var14, 0.0F).color(var7, var8, var9, var6);
      var11.vertex(var1, var12, var15, 0.0F).color(var7, var8, var9, var6);
      var11.vertex(var1, var13, var15, 0.0F).color(var7, var8, var9, var6);
      var11.vertex(var1, var13, var14, 0.0F).color(var7, var8, var9, var6);
      BufferRenderer.drawWithGlobalProgram(var11.end());
   }

   @Unique
   private void renderIconTwoPass(Matrix4f var1, float var2, float var3) {
      Identifier var4 = IconTextureRegistry.get("logo");
      RenderSystem.setShader(ShaderProgramKeys.POSITION_TEX_COLOR);
      RenderSystem.setShaderTexture(0, var4);
      RenderSystem.enableBlend();
      RenderSystem.enableDepthTest();
      RenderSystem.depthFunc(519);
      RenderSystem.defaultBlendFunc();
      this.drawIconQuad(var1, var2, var3, 1.0F, 1.0F, 1.0F, 0.1254902F);
      RenderSystem.depthFunc(515);
      this.drawIconQuad(var1, var2, var3, 1.0F, 1.0F, 1.0F, 1.0F);
   }

   @Unique
   private void renderIconSingleNormal(Matrix4f var1, float var2, float var3) {
      Identifier var4 = IconTextureRegistry.get("logo");
      RenderSystem.enableBlend();
      RenderSystem.enableDepthTest();
      RenderSystem.depthFunc(515);
      RenderSystem.defaultBlendFunc();
      RenderSystem.setShader(ShaderProgramKeys.POSITION_TEX_COLOR);
      RenderSystem.setShaderTexture(0, var4);
      this.drawIconQuad(var1, var2, var3, 0.5F, 0.5F, 0.5F, 1.0F);
   }

   @Unique
   private void drawIconQuad(Matrix4f var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      int var8 = (int)(var4 * 255.0F);
      int var9 = (int)(var5 * 255.0F);
      int var10 = (int)(var6 * 255.0F);
      int var11 = (int)(var7 * 255.0F);
      Tessellator var12 = Tessellator.getInstance();
      BufferBuilder var13 = var12.begin(DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
      var13.vertex(var1, var2, var3, 0.0F).texture(0.0F, 0.0F).color(var8, var9, var10, var11);
      var13.vertex(var1, var2, var3 + 8.0F, 0.0F).texture(0.0F, 1.0F).color(var8, var9, var10, var11);
      var13.vertex(var1, var2 + 8.0F, var3 + 8.0F, 0.0F).texture(1.0F, 1.0F).color(var8, var9, var10, var11);
      var13.vertex(var1, var2 + 8.0F, var3, 0.0F).texture(1.0F, 0.0F).color(var8, var9, var10, var11);
      BufferRenderer.drawWithGlobalProgram(var13.end());
   }
}
