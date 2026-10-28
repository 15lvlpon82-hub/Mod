package pulse;

import pulse.client.MinecraftContext;

@HudServiceInfo(enabledByDefault = true)
public class ModuleAccessService extends HudService implements MinecraftContext {
   @Override
   public void a() {
      this.initialize();
   }

   public void initialize() {
      // Module access is local-only in this source tree. Keep the service so
      // existing module lifecycle code has one place to ask for permission.
   }

   public boolean isModuleAllowed(String moduleName) {
      return true;
   }

   public boolean a(String moduleName) {
      return this.isModuleAllowed(moduleName);
   }
}
