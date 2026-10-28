package ru.pulse.mixin;




import pulse.module.ModuleRegistry;
import pulse.client.MinecraftContext;
import pulse.module.ClientModule;
import net.minecraft.client.Keyboard;
import net.minecraft.client.MinecraftClient;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult.Type;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.RaycastContext.FluidHandling;
import net.minecraft.world.RaycastContext.ShapeType;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import pulse.EventBusService;
import pulse.MapMarker;
import pulse.MarkerManager;
import pulse.MarkerSettings;
import pulse.KeyInputEvent;
import pulse.ClickGuiKeyBinding;
import pulse.GuiInput;
import pulse.Theme;
import pulse.PulseClickGuiScreen;
import pulse.GuiInteractionState;
import ru.pulse.Pulse;

@Mixin(Keyboard.class)
public class KeyboardMixin {
   @Shadow
   @Final
   private MinecraftClient client;
   @Unique
   private static final double MAX_RAYCAST_DISTANCE = 500.0;

   @Inject(method = "onKey", at = @At("HEAD"))
   private void onKey(long var1, int var3, int var4, int var5, int var6, CallbackInfo var7) {
      if (var1 == this.client.getWindow().getHandle()) {
         EventBusService.EVENT_BUS.post(new KeyInputEvent(var3, var4, var5, var6));
         if (MinecraftContext.c.player == null || MinecraftContext.c.world == null) {
            return;
         }

         if (var5 != 1) {
            return;
         }

         if (MinecraftContext.c.currentScreen != null) {
            if (ClickGuiKeyBinding.OPEN_KEY.matchesKey(var3, var4) && MinecraftContext.c.currentScreen instanceof PulseClickGuiScreen var11) {
               if (GuiInteractionState.a().b()) {
                  var11.c();
               } else {
                  GuiInput.j();
                  MinecraftContext.c.setScreen(null);
               }
            }

            return;
         }

         if (ClickGuiKeyBinding.OPEN_KEY.matchesKey(var3, var4)) {
            MinecraftContext.c.setScreen(Pulse.getInstance().getClickGui());
            return;
         }

         int var8 = MarkerSettings.b();
         if (MarkerSettings.a() && var8 != 0 && var8 == var3) {
            this.createQuickMarker();
            return;
         }

         for (ClientModule var10 : ModuleRegistry.all()) {
            if (var10.j() == var3) {
               var10.d();
            }
         }
      }
   }

   @Unique
   private void createQuickMarker() {
      if (MinecraftContext.c.player != null && MinecraftContext.c.world != null) {
         Vec3d var1 = MinecraftContext.c.player.getCameraPosVec(1.0F);
         Vec3d var2 = MinecraftContext.c.player.getRotationVec(1.0F);
         Vec3d var3 = var1.add(var2.multiply(500.0));
         BlockHitResult var4 = MinecraftContext.c.world.raycast(new RaycastContext(var1, var3, ShapeType.OUTLINE, FluidHandling.NONE, MinecraftContext.c.player));
         if (var4.getType() == Type.BLOCK) {
            BlockPos var5 = var4.getBlockPos();
            MapMarker var6 = new MapMarker("Р‘С‹СЃС‚СЂР°СЏ РјРµС‚РєР°", var5.getX(), var5.getY(), var5.getZ(), Theme.X, MapMarker.Icon.FAST);
            MarkerManager.a(var6);
         }
      }
   }
}
