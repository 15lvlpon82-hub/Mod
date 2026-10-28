package ru.pulse.mixin;


import pulse.module.ModuleRegistry;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.render.RenderTickCounter;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.RotationAxis;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import pulse.EventBusService;
import pulse.WorldRenderEndEvent;
import pulse.CustomHandShaderCapture;
import pulse.Zoom;
import pulse.AspectRatio;
import pulse.RenderTweaks;
import pulse.WorldToScreen;

@Mixin(GameRenderer.class)
public abstract class GameRendererMixin {
   @Shadow
   private float zoom;
   @Shadow
   private float zoomX;
   @Shadow
   private float zoomY;

   @Shadow
   public abstract float getFarPlaneDistance();

   @Inject(method = "renderWorld", at = @At("HEAD"))
   private void onRenderWorldStart(RenderTickCounter var1, CallbackInfo var2) {
   }

   @Inject(method = "renderHand", at = @At("RETURN"))
   private void onRenderHandEnd(Camera var1, float var2, Matrix4f var3, CallbackInfo var4) {
      CustomHandShaderCapture.endCapture();
   }

   @Inject(method = "renderWorld", at = @At("RETURN"))
   private void onRenderWorldEnd(RenderTickCounter var1, CallbackInfo var2) {
      CustomHandShaderCapture.endCapture();
      Camera var3 = ((GameRenderer)(Object)this).getCamera();
      EventBusService.EVENT_BUS.post(new WorldRenderEndEvent(new MatrixStack(), var1.getTickDelta(true), var3));
   }

   @Inject(method = "tiltViewWhenHurt", at = @At("HEAD"), cancellable = true)
   private void onBobViewWhenHurt(MatrixStack var1, float var2, CallbackInfo var3) {
      RenderTweaks var4 = ModuleRegistry.RENDER_TWEAKS;
      if (var4.o()) {
         var3.cancel();
      }
   }

   @Inject(method = "showFloatingItem", at = @At("HEAD"), cancellable = true)
   private void onShowFloatingItem(CallbackInfo var1) {
      RenderTweaks var2 = ModuleRegistry.RENDER_TWEAKS;
      if (var2.q()) {
         var1.cancel();
      }
   }

   @Inject(method = "renderWorld", at = @At(value = "FIELD", target = "Lnet/minecraft/client/render/GameRenderer;renderHand:Z", opcode = 180, ordinal = 0))
   public void renderWorld(RenderTickCounter var1, CallbackInfo var2) {
      if (CustomHandShaderCapture.guiOpen()) {
         CustomHandShaderCapture.resetForGui();
      } else {
         Camera var3 = MinecraftClient.getInstance().gameRenderer.getCamera();
         MatrixStack var4 = new MatrixStack();
         Matrix4fStack var5 = RenderSystem.getModelViewStack();
         var5.pushMatrix();
         var5.mul(var4.peek().getPositionMatrix());
         var4.multiply(RotationAxis.POSITIVE_X.rotationDegrees(var3.getPitch()));
         var4.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(var3.getYaw() + 180.0F));
         WorldToScreen.a.set(RenderSystem.getProjectionMatrix());
         WorldToScreen.b.set(new Matrix4f(RenderSystem.getModelViewMatrix()));
         WorldToScreen.e.set(var4.peek().getPositionMatrix());
         var5.popMatrix();
         CustomHandShaderCapture.beginCapture();
      }
   }

   @Inject(method = "getBasicProjectionMatrix", at = @At("HEAD"), cancellable = true)
   public void getBasicProjectionMatrix(float var1, CallbackInfoReturnable<Matrix4f> var2) {
      if (Zoom.a) {
         var1 = (float)Zoom.b;
      }

      MatrixStack var3 = new MatrixStack();
      var3.peek().getPositionMatrix().identity();
      if (this.zoom != 1.0F) {
         var3.translate(this.zoomX, -this.zoomY, 0.0);
         var3.scale(this.zoom, this.zoom, 1.0F);
      }

      float var4 = (float)MinecraftClient.getInstance().getWindow().getFramebufferWidth() / MinecraftClient.getInstance().getWindow().getFramebufferHeight();
      AspectRatio var5 = ModuleRegistry.ASPECT_RATIO;
      if (var5.k()) {
         var4 = var5.n();
      }

      var2.setReturnValue(var3.peek().getPositionMatrix().perspective(var1 * (float) (Math.PI / 180.0), var4, 0.05F, this.getFarPlaneDistance()));
   }
}
