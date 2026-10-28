package pulse;

import lombok.Generated;

public abstract class HudService {
   private boolean enabled;

   public void a() {
      HudServiceInfo info = this.getClass().getAnnotation(HudServiceInfo.class);
      this.a(info == null || info.enabledByDefault());
   }

   public void a(boolean enabled) {
      if (this.enabled == enabled) {
         return;
      }

      this.enabled = enabled;
      if (enabled) {
         EventBusService.EVENT_BUS.subscribe(this);
      } else {
         EventBusService.EVENT_BUS.unsubscribe(this);
      }
   }

   public void b() {
      this.a(!this.enabled);
   }

   @Generated
   public boolean c() {
      return this.enabled;
   }
}
