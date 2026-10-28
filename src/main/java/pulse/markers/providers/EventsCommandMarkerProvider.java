package pulse;

import java.util.LinkedHashMap;
import java.util.Map;

public class EventsCommandMarkerProvider extends AbstractEventMarkerProvider {
   private static final Map<String, MapMarkerStyle> EVENT_STYLES = new LinkedHashMap<>();

   static {
      EVENT_STYLES.put("пороховой карьер", style(220, 20, 60));
      EVENT_STYLES.put("павший самурай", style(105, 105, 105));
      EVENT_STYLES.put("дерево мудрости", style(34, 139, 34));
      EVENT_STYLES.put("экскалибур", style(255, 215, 0));
      EVENT_STYLES.put("пиратский корабль", style(139, 69, 19));
   }

   public EventsCommandMarkerProvider() {
      super("/events", EVENT_STYLES);
   }
}
