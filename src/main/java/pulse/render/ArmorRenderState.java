package pulse;

public final class ArmorRenderState {
   private static boolean hurt;

   private ArmorRenderState() {
   }

   public static void a(boolean value) {
      hurt = value;
   }

   public static boolean a() {
      return hurt;
   }

   public static void b() {
      hurt = false;
   }
}
