package pulse;

import pulse.module.ClientModule;

public interface GuiEntry {
   String a();

   boolean b();

   void a(boolean enabled);

   default boolean c() {
      return true;
   }

   default boolean d() {
      return false;
   }

   default ClientModule e() {
      return null;
   }

   default int f() {
      ClientModule module = this.e();
      return module != null ? module.j() : -1;
   }

   default void a(int bindKey) {
      ClientModule module = this.e();
      if (module != null) {
         module.a(bindKey);
      }
   }

   default boolean g() {
      ClientModule module = this.e();
      return module != null && !module.m().isEmpty();
   }

   default boolean h() {
      return this.d();
   }
}
