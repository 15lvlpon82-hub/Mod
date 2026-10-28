package ru.pulse.mixin;


import pulse.module.ModuleRegistry;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.Fog;
import net.minecraft.client.render.FrameGraphBuilder;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.render.RenderTickCounter;
import net.minecraft.client.render.WorldRenderer;
import net.minecraft.client.util.ObjectAllocator;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.Vec3d;
import org.joml.Matrix4f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import pulse.EventBusService;
import pulse.WorldRenderStartEvent;
import pulse.WorldRenderEvent;

@Mixin(WorldRenderer.class)
public abstract class WorldRendererMixin {
   @Inject(method = "renderWeather", at = @At("HEAD"), cancellable = true)
   private void onRenderWeather(FrameGraphBuilder var1, Vec3d var2, float var3, Fog var4, CallbackInfo var5) {
      if (ModuleRegistry.RENDER_TWEAKS.n()) {
         var5.cancel();
      }
   }

   @Inject(method = "render", at = @At("HEAD"))
   private void preRender(
      ObjectAllocator var1, RenderTickCounter var2, boolean var3, Camera var4, GameRenderer var5, Matrix4f var6, Matrix4f var7, CallbackInfo var8
   ) {
      EventBusService.EVENT_BUS.post(new WorldRenderStartEvent(var2.getTickDelta(true)));
   }

   @Inject(method = "render", at = @At("RETURN"))
   private void postRenderEvent(
      ObjectAllocator var1, RenderTickCounter var2, boolean var3, Camera var4, GameRenderer var5, Matrix4f var6, Matrix4f var7, CallbackInfo var8
   ) {
      this.restoreRenderState();
      MatrixStack var9 = new MatrixStack();
      var9.peek().getPositionMatrix().set(var6);
      EventBusService.EVENT_BUS.post(new WorldRenderEvent(var9, var2.getTickDelta(true)));
      this.restoreRenderState();
   }

   private void restoreRenderState() {
      RenderSystem.enableDepthTest();
      RenderSystem.depthFunc(515);
      RenderSystem.depthMask(true);
      RenderSystem.enableCull();
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
   }
}
