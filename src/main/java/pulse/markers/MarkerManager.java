package pulse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class MarkerManager {
   private static final List<MapMarker> MARKERS = Collections.synchronizedList(new ArrayList<>());

   private MarkerManager() {
   }

   public static void a(MapMarker marker) {
      if (marker != null) {
         MARKERS.add(marker);
      }
   }

   public static void b(MapMarker marker) {
      MARKERS.remove(marker);
   }

   public static List<MapMarker> a() {
      synchronized (MARKERS) {
         return new ArrayList<>(MARKERS);
      }
   }

   public static void b() {
      MARKERS.clear();
   }

   public static void c() {
      MARKERS.clear();
   }

   public static boolean d() {
      return MARKERS.isEmpty();
   }

   public static void e() {
      MARKERS.removeIf(MapMarker::o);
   }

   public static MapMarker a(int x, int y, int z) {
      synchronized (MARKERS) {
         for (MapMarker marker : MARKERS) {
            if (marker.b() == x && marker.c() == y && marker.d() == z) {
               return marker;
            }
         }
      }

      return null;
   }

   public static List<MapMarker> f() {
      return a();
   }

   public static List<MapMarker> g() {
      return a();
   }
}
