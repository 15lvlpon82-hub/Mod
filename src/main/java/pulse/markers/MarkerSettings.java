package pulse;

public final class MarkerSettings {
   private static boolean quickMarkerEnabled;
   private static int quickMarkerKey;
   private static boolean markersVisible;
   private static boolean markerDistanceFilter;
   private static boolean pvpSafeFilter;

   private MarkerSettings() {
   }

   public static boolean a() {
      return quickMarkerEnabled;
   }

   public static void a(boolean enabled) {
      quickMarkerEnabled = enabled;
   }

   public static int b() {
      return quickMarkerKey;
   }

   public static void a(int key) {
      quickMarkerKey = key;
   }

   public static boolean c() {
      return markersVisible;
   }

   public static void b(boolean visible) {
      markersVisible = visible;
   }

   public static boolean d() {
      return markerDistanceFilter;
   }

   public static void c(boolean enabled) {
      markerDistanceFilter = enabled;
   }

   public static boolean e() {
      return pvpSafeFilter;
   }

   public static void d(boolean enabled) {
      pvpSafeFilter = enabled;
   }
}
