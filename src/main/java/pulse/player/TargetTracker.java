package pulse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.hit.HitResult.Type;
import pulse.client.MinecraftContext;

@HudServiceInfo
public class TargetTracker extends HudService implements MinecraftContext {
   private static final long TARGET_MEMORY_MS = 1000L;

   private LivingEntity currentTarget;
   private final Map<LivingEntity, ElapsedTimer> recentlySeenTargets = new HashMap<>();
   private final ElapsedTimer clearTimer = new ElapsedTimer();
   private boolean waitingToClearTarget;

   @EventHandler
   public void onClientTick(ClientTickEvent event) {
      if (c.player == null || c.world == null) {
         return;
      }

      HitResult hitResult = c.crosshairTarget;
      if (hitResult != null && hitResult.getType() == Type.ENTITY) {
         Entity entity = ((EntityHitResult)hitResult).getEntity();
         if (entity instanceof LivingEntity livingEntity && entity != c.player && !livingEntity.isInvisible() && !EntityUtils.a(livingEntity)) {
            this.currentTarget = livingEntity;
            this.recentlySeenTargets.put(livingEntity, new ElapsedTimer());
            this.clearTimer.reset();
            this.waitingToClearTarget = true;
         }
      } else if (this.waitingToClearTarget && this.clearTimer.hasElapsed(TARGET_MEMORY_MS)) {
         this.currentTarget = null;
         this.waitingToClearTarget = false;
      }

      this.recentlySeenTargets.entrySet().removeIf(entry -> {
         LivingEntity entity = entry.getKey();
         if (!entry.getValue().hasElapsed(TARGET_MEMORY_MS)) {
            return false;
         }

         if (entity instanceof PlayerEntity && entity.isInvisible() && this.currentTarget == entity) {
            this.currentTarget = null;
            this.waitingToClearTarget = false;
         }

         return true;
      });
   }

   public boolean hasTarget() {
      return this.currentTarget != null;
   }

   public List<LivingEntity> recentTargets() {
      return new ArrayList<>(this.recentlySeenTargets.keySet());
   }

   public void clearTarget() {
      this.currentTarget = null;
      this.waitingToClearTarget = false;
      this.clearTimer.reset();
   }

   public void clearAll() {
      this.clearTarget();
      this.recentlySeenTargets.clear();
   }

   public LivingEntity currentTarget() {
      return this.currentTarget;
   }

   public void a(ClientTickEvent event) {
      this.onClientTick(event);
   }

   public boolean d() {
      return this.hasTarget();
   }

   public List<LivingEntity> e() {
      return this.recentTargets();
   }

   public void f() {
      this.clearTarget();
   }

   public void g() {
      this.clearAll();
   }

   public LivingEntity h() {
      return this.currentTarget();
   }
}
