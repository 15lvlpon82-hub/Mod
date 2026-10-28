package ru.pulse.mixin;


import pulse.module.ModuleRegistry;
import java.awt.Color;
import net.minecraft.client.render.entity.equipment.EquipmentRenderer;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import pulse.HitColor;
import pulse.ArmorRenderState;
import pulse.ColorUtils;

@Mixin(EquipmentRenderer.class)
public class EquipmentRendererMixin {
   @Unique
   private static final Identifier HIT_COLOR_TEXTURE = Identifier.of("pulse", "textures/misc/white.png");

   @ModifyArg(
      method = "render(Lnet/minecraft/client/render/entity/equipment/EquipmentModel$LayerType;Lnet/minecraft/registry/RegistryKey;Lnet/minecraft/client/model/Model;Lnet/minecraft/item/ItemStack;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;ILnet/minecraft/util/Identifier;)V",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/model/Model;render(Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumer;III)V"
      ),
      index = 4
   )
   private int modifyArmorColor(int var1) {
      HitColor var2 = ModuleRegistry.HIT_COLOR;
      if (var2 != null && var2.o() && var2.p() && ArmorRenderState.a()) {
         Color var3 = var2.n();
         return ColorUtils.a(var3.getRed(), var3.getGreen(), var3.getBlue(), 255);
      } else {
         return var1;
      }
   }
}
