package ru.pulse.mixin;


import pulse.module.ModuleRegistry;
import net.minecraft.block.enums.CameraSubmersionType;
import net.minecraft.client.render.BackgroundRenderer;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.Fog;
import net.minecraft.client.render.FogShape;
import net.minecraft.client.render.BackgroundRenderer.FogType;
import net.minecraft.client.world.ClientWorld;
import org.joml.Vector4f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(BackgroundRenderer.class)
public class BackgroundRendererMixin {
   @Inject(method = "getFogColor", at = @At("RETURN"), cancellable = true)
   private static void customizeFogColor(Camera var0, float var1, ClientWorld var2, int var3, float var4, CallbackInfoReturnable<Vector4f> var5) {
      if (ModuleRegistry.WORLD_CUSTOMIZER.n()) {
         int var6 = ModuleRegistry.WORLD_CUSTOMIZER.s();
         float var7 = (var6 >> 16 & 0xFF) / 255.0F;
         float var8 = (var6 >> 8 & 0xFF) / 255.0F;
         float var9 = (var6 & 0xFF) / 255.0F;
         var5.setReturnValue(new Vector4f(var7, var8, var9, 1.0F));
      }
   }

   @Inject(method = "applyFog", at = @At("HEAD"), cancellable = true)
   private static void onApplyFog(Camera var0, FogType var1, Vector4f var2, float var3, boolean var4, float var5, CallbackInfoReturnable<Fog> var6) {
      if (ModuleRegistry.NO_FLUID.k()) {
         CameraSubmersionType var7 = var0.getSubmersionType();
         if (var7 == CameraSubmersionType.WATER || var7 == CameraSubmersionType.LAVA) {
            var6.setReturnValue(Fog.DUMMY);
         }
      }

      if (ModuleRegistry.WORLD_CUSTOMIZER.o()) {
         float var9 = ModuleRegistry.WORLD_CUSTOMIZER.p();
         float var8 = ModuleRegistry.WORLD_CUSTOMIZER.q();
         var6.setReturnValue(new Fog(var9, var8, FogShape.SPHERE, var2.x, var2.y, var2.z, var2.w));
      }
   }
}
