package pulse;

import java.util.LinkedHashMap;
import java.util.Map;

public class EventDelayMarkerProvider extends AbstractEventMarkerProvider {
   private static final Map<String, MapMarkerStyle> EVENT_STYLES = new LinkedHashMap<>();

   static {
      EVENT_STYLES.put("мистический сундук", style(220, 20, 60));
      EVENT_STYLES.put("маяк убийца", style(138, 43, 226));
      EVENT_STYLES.put("вулкан", style(255, 69, 0));
      EVENT_STYLES.put("загадочный маяк", style(75, 0, 130));
      EVENT_STYLES.put("метеоритный дождь", style(0, 191, 255));
      EVENT_STYLES.put("алтарь", style(178, 34, 34));
   }

   public EventDelayMarkerProvider() {
      super("/event delay", EVENT_STYLES);
   }
}
