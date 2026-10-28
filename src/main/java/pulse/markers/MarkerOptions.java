package pulse;

public final class MarkerOptions {
   private static boolean markersEnabled = true;
   private static int markerMode;
   private static boolean showFriendMarkers;
   private static boolean showEventMarkers = true;
   private static boolean showHiddenMarkers;

   private MarkerOptions() {
   }

   public static boolean markersEnabled() {
      return markersEnabled;
   }

   public static void setMarkersEnabled(boolean enabled) {
      markersEnabled = enabled;
   }

   public static int markerMode() {
      return markerMode;
   }

   public static void setMarkerMode(int mode) {
      markerMode = mode;
   }

   public static boolean showFriendMarkers() {
      return showFriendMarkers;
   }

   public static void setShowFriendMarkers(boolean enabled) {
      showFriendMarkers = enabled;
   }

   public static boolean showEventMarkers() {
      return showEventMarkers;
   }

   public static void setShowEventMarkers(boolean enabled) {
      showEventMarkers = enabled;
   }

   public static boolean showHiddenMarkers() {
      return showHiddenMarkers;
   }

   public static void setShowHiddenMarkers(boolean enabled) {
      showHiddenMarkers = enabled;
   }

   public static boolean a() {
      return markersEnabled();
   }

   public static void a(boolean enabled) {
      setMarkersEnabled(enabled);
   }

   public static int b() {
      return markerMode();
   }

   public static void a(int mode) {
      setMarkerMode(mode);
   }

   public static boolean c() {
      return showFriendMarkers();
   }

   public static void b(boolean enabled) {
      setShowFriendMarkers(enabled);
   }

   public static boolean d() {
      return showEventMarkers();
   }

   public static void c(boolean enabled) {
      setShowEventMarkers(enabled);
   }

   public static boolean e() {
      return showHiddenMarkers();
   }

   public static void d(boolean enabled) {
      setShowHiddenMarkers(enabled);
   }
}
