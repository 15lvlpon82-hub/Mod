package pulse.module;

public enum ModuleCategory {
   VISUALS("Visuals"),
   HUD("HUD"),
   UTILITIES("Utilities");

   private final String displayName;

   ModuleCategory(String displayName) {
      this.displayName = displayName;
   }

   public String displayName() {
      return this.displayName;
   }

   public String a() {
      return this.displayName();
   }
}
