package pulse;

import java.awt.Color;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

abstract class AbstractEventMarkerProvider implements MarkerProvider {
   private static final Pattern XYZ_PATTERN = Pattern.compile(
      "(?:x|х)\\D*(-?\\d+)\\D+(?:y|у)\\D*(-?\\d+)\\D+(?:z|з)\\D*(-?\\d+)",
      Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE
   );
   private static final Pattern TRIPLE_NUMBER_PATTERN = Pattern.compile("(-?\\d{2,6})\\D+(-?\\d{1,4})\\D+(-?\\d{2,6})");
   private static final Pattern SECONDS_PATTERN = Pattern.compile("(\\d+)\\s*(?:сек|sec|s)", Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
   private static final Pattern MINUTES_PATTERN = Pattern.compile("(\\d+)\\s*(?:мин|min|m)", Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);

   private final String command;
   private final Map<String, MapMarkerStyle> styles;
   private final Set<String> eventNames;

   protected AbstractEventMarkerProvider(String command, Map<String, MapMarkerStyle> styles) {
      this.command = command;
      this.styles = Collections.unmodifiableMap(new LinkedHashMap<>(styles));
      this.eventNames = Collections.unmodifiableSet(this.styles.keySet());
   }

   @Override
   public boolean a(String serverAddress) {
      return serverAddress != null && !serverAddress.isBlank();
   }

   @Override
   public boolean a(String normalizedText, String originalText, MapMarkerModule markerModule) {
      String text = normalizedText != null ? normalizedText : "";
      String eventName = this.findEventName(text);
      int[] coordinates = this.findCoordinates(originalText != null ? originalText : text);

      if (eventName != null && coordinates != null) {
         markerModule.addMarker(eventName, coordinates, this.findLifetimeSeconds(text));
         return true;
      }

      if (eventName != null) {
         markerModule.setPendingMarker(eventName, markerModule.h());
         return true;
      }

      if (coordinates != null) {
         markerModule.addPendingMarker(coordinates);
         return true;
      }

      return false;
   }

   @Override
   public Set<String> a() {
      return this.eventNames;
   }

   @Override
   public Map<String, MapMarkerStyle> b() {
      return this.styles;
   }

   @Override
   public String c() {
      return this.command;
   }

   protected static MapMarkerStyle style(int red, int green, int blue) {
      return new MapMarkerStyle(new Color(red, green, blue));
   }

   private String findEventName(String text) {
      String normalizedText = text.toLowerCase(Locale.ROOT);
      for (String eventName : this.eventNames) {
         if (normalizedText.contains(eventName)) {
            return eventName;
         }
      }

      return null;
   }

   private int[] findCoordinates(String text) {
      Matcher xyzMatcher = XYZ_PATTERN.matcher(text);
      if (xyzMatcher.find()) {
         return new int[] {
            parseInt(xyzMatcher.group(1)),
            parseInt(xyzMatcher.group(2)),
            parseInt(xyzMatcher.group(3))
         };
      }

      Matcher tripleMatcher = TRIPLE_NUMBER_PATTERN.matcher(text);
      if (tripleMatcher.find()) {
         return new int[] {
            parseInt(tripleMatcher.group(1)),
            parseInt(tripleMatcher.group(2)),
            parseInt(tripleMatcher.group(3))
         };
      }

      return null;
   }

   private int findLifetimeSeconds(String text) {
      Matcher secondsMatcher = SECONDS_PATTERN.matcher(text);
      if (secondsMatcher.find()) {
         return parseInt(secondsMatcher.group(1));
      }

      Matcher minutesMatcher = MINUTES_PATTERN.matcher(text);
      if (minutesMatcher.find()) {
         return parseInt(minutesMatcher.group(1)) * 60;
      }

      return -1;
   }

   private static int parseInt(String value) {
      try {
         return Integer.parseInt(value);
      } catch (NumberFormatException ignored) {
         return 0;
      }
   }
}
