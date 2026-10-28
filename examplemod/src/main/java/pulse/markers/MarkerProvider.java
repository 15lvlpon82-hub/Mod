package pulse;

import java.awt.Color;
import java.util.Map;
import java.util.Set;

public interface MarkerProvider {
   boolean a(String text);

   boolean a(String text, String serverAddress, MapMarkerModule markerModule);

   Set<String> a();

   Map<String, MapMarkerStyle> b();

   String c();

   default boolean supportsServer(String serverAddress) {
      return this.a(serverAddress);
   }

   default boolean handleMessage(String normalizedText, String originalText, MapMarkerModule markerModule) {
      return this.a(normalizedText, originalText, markerModule);
   }

   default Set<String> eventNames() {
      return this.a();
   }

   default Map<String, MapMarkerStyle> styles() {
      return this.b();
   }

   default String command() {
      return this.c();
   }

   default MapMarkerStyle d() {
      return new MapMarkerStyle(new Color(255, 165, 0));
   }

   default void a(MapMarkerModule markerModule) {
   }

   default void tick(MapMarkerModule markerModule) {
      this.a(markerModule);
   }
}
