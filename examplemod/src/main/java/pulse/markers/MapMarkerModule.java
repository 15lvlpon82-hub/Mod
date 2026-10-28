package pulse;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lombok.Generated;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.network.packet.s2c.play.GameMessageS2CPacket;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import pulse.client.MinecraftContext;
import ru.pulse.mixin.accessor.PlayerListHudAccessor;

@HudServiceInfo(enabledByDefault = true)
public class MapMarkerModule extends HudService implements MinecraftContext {
   private static final long DEFAULT_MARKER_LIFETIME_MS = 600_000L;
   private static final int JOIN_REFRESH_DELAY_TICKS = 20;
   private static final Pattern SERVER_NUMBER_PATTERN = Pattern.compile("(?:анархия|сервер|гриф)\\D*(\\d+)", Pattern.CASE_INSENSITIVE);
   private static final Pattern HEADER_SERVER_PATTERN = Pattern.compile("(?:анархия|сервер|гриф)\\D*(\\d+)(?:\\D+([a-z0-9_.:-]+))?", Pattern.CASE_INSENSITIVE);

   private final List<MarkerProvider> providers = new ArrayList<>();
   private MarkerProvider activeProvider;
   private boolean needsProviderRefresh;
   private boolean waitingForCommandResponse;
   private String pendingMarkerName;
   private int pendingServerId = -1;
   public static int a;
   public static boolean b;

   public MapMarkerModule() {
      this.providers.add(new EventDelayMarkerProvider());
      this.providers.add(new EventsCommandMarkerProvider());
      this.providers.add(new ActiveEventMarkerProvider());
   }

   @EventHandler
   private void onGameMessage(PacketEvent event) {
      if (!MarkerSettings.d() || c.player == null || !(event.d() instanceof GameMessageS2CPacket packet)) {
         return;
      }

      String originalText = packet.content().getString();
      String normalizedText = Formatting.strip(originalText).toLowerCase(Locale.ROOT);
      this.updateActiveProvider();

      boolean wasWaitingForResponse = this.waitingForCommandResponse;
      String serverAddress = this.currentServerAddress();
      for (MarkerProvider provider : this.providers) {
         if (!provider.supportsServer(serverAddress)) {
            continue;
         }

         boolean handled = provider.handleMessage(normalizedText, originalText, this);
         if (handled && wasWaitingForResponse) {
            event.b();
         }

         if (handled) {
            return;
         }
      }
   }

   @EventHandler
   private void onClientTick(ClientTickEvent event) {
      if (!MarkerSettings.d() || c.player == null || !this.isConnectedToMarkedServer()) {
         return;
      }

      this.updateActiveProvider();
      this.refreshProviderAfterJoin();
      MarkerManager.e();

      if (this.activeProvider != null) {
         this.activeProvider.tick(this);
      }
   }

   @EventHandler
   private void onWorldChanged(WorldChangeEvent event) {
      if (MarkerSettings.d()) {
         this.needsProviderRefresh = true;
      }
   }

   private void updateActiveProvider() {
      String serverAddress = this.currentServerAddress();
      if (serverAddress == null) {
         this.activeProvider = null;
         return;
      }

      if (this.activeProvider != null && this.activeProvider.supportsServer(serverAddress)) {
         return;
      }

      for (MarkerProvider provider : this.providers) {
         if (provider.supportsServer(serverAddress)) {
            this.activeProvider = provider;
            return;
         }
      }

      this.activeProvider = null;
   }

   private void refreshProviderAfterJoin() {
      if (!this.needsProviderRefresh || c.player.age <= JOIN_REFRESH_DELAY_TICKS || this.activeProvider == null) {
         return;
      }

      this.requestProviderCommand();
      this.needsProviderRefresh = false;
   }

   public void d() {
      this.clearMarkers();
   }

   public void clearMarkers() {
      MarkerManager.c();
      this.pendingMarkerName = null;
   }

   public void a(String command, String argument) {
      this.sendCommand(command, argument);
   }

   public void sendCommand(String command, String argument) {
      if (command == null || !this.waitingForCommandResponse) {
         return;
      }

      String safeArgument = argument != null ? argument : "";
      HudNotificationCenter.a("%s %s", command, safeArgument);
      this.waitingForCommandResponse = false;
   }

   public void a(String name, int timeoutSeconds) {
      this.sendTimedLookup(name, timeoutSeconds);
   }

   public void sendTimedLookup(String name, int timeoutSeconds) {
      if (!this.waitingForCommandResponse) {
         return;
      }

      HudNotificationCenter.a("%s %s", this.formatSeconds(timeoutSeconds), this.capitalizeEventName(name));
      this.waitingForCommandResponse = false;
   }

   public void a(int timeoutSeconds) {
      this.sendDelayLookup(timeoutSeconds);
   }

   public void sendDelayLookup(int timeoutSeconds) {
      if (!this.waitingForCommandResponse || this.activeProvider == null) {
         return;
      }

      HudNotificationCenter.a("%s %s", this.activeProvider.command(), this.formatSeconds(timeoutSeconds));
      this.waitingForCommandResponse = false;
   }

   public void e() {
      this.requestProviderCommand();
   }

   public void requestProviderCommand() {
      if (this.activeProvider == null) {
         return;
      }

      HudNotificationCenter.a(this.activeProvider.command());
      this.waitingForCommandResponse = true;
   }

   private String formatSeconds(int seconds) {
      return seconds + " сек.";
   }

   public boolean f() {
      return this.waitingForCommandResponse;
   }

   public void g() {
      this.waitingForCommandResponse = true;
   }

   public void a(String eventName, int[] coordinates, int lifetimeSeconds) {
      this.addMarker(eventName, coordinates, lifetimeSeconds);
   }

   public void addMarker(String eventName, int[] coordinates, int lifetimeSeconds) {
      if (eventName == null || coordinates == null || coordinates.length < 3) {
         return;
      }

      int serverId = this.h();
      String serverAddress = this.i();
      MapMarker existingMarker = MarkerManager.a(coordinates[0], coordinates[1], coordinates[2]);

      if (existingMarker != null) {
         existingMarker.a(this.capitalizeEventName(eventName));
         if (lifetimeSeconds > 0) {
            existingMarker.a(System.currentTimeMillis() + lifetimeSeconds * 1000L);
            existingMarker.a(true);
         }
         return;
      }

      MapMarkerStyle style = this.a(eventName.toLowerCase(Locale.ROOT));
      long lifetimeMs = lifetimeSeconds > 0 ? lifetimeSeconds * 1000L : DEFAULT_MARKER_LIFETIME_MS;
      boolean showTimer = lifetimeSeconds > 0;
      MapMarker marker = MapMarker.a(
         this.capitalizeEventName(eventName),
         coordinates[0],
         coordinates[1],
         coordinates[2],
         style.a,
         style.b,
         serverId,
         serverAddress,
         lifetimeMs,
         showTimer
      );
      MarkerManager.a(marker);
   }

   public void b(String eventName, int serverId) {
      this.setPendingMarker(eventName, serverId);
   }

   public void setPendingMarker(String eventName, int serverId) {
      this.pendingMarkerName = eventName;
      this.pendingServerId = serverId;
   }

   public void a(int[] coordinates) {
      this.addPendingMarker(coordinates);
   }

   public void addPendingMarker(int[] coordinates) {
      if (this.pendingMarkerName != null && coordinates != null) {
         this.addMarker(this.pendingMarkerName, coordinates, -1);
      }
   }

   public void b(int timeoutSeconds) {
      this.updatePendingMarkerTimer(timeoutSeconds);
   }

   public void updatePendingMarkerTimer(int timeoutSeconds) {
      if (this.pendingMarkerName == null) {
         return;
      }

      String markerName = this.capitalizeEventName(this.pendingMarkerName);
      for (MapMarker marker : MarkerManager.f()) {
         if (marker.a().equalsIgnoreCase(markerName)) {
            marker.a(System.currentTimeMillis() + timeoutSeconds * 1000L);
            marker.a(true);
            break;
         }
      }
   }

   public int h() {
      Text header = this.playerListHeader();
      if (header == null) {
         return -1;
      }

      Matcher matcher = SERVER_NUMBER_PATTERN.matcher(Formatting.strip(header.getString()));
      return matcher.find() ? parseInt(matcher.group(1), -1) : -1;
   }

   public String i() {
      Text header = this.playerListHeader();
      if (header == null) {
         return null;
      }

      Matcher matcher = HEADER_SERVER_PATTERN.matcher(Formatting.strip(header.getString()));
      return matcher.find() ? matcher.group(2) : null;
   }

   public boolean j() {
      return this.isConnectedToMarkedServer();
   }

   public boolean isConnectedToMarkedServer() {
      if (c.player == null) {
         return false;
      }

      String displayName = c.player.getDisplayName().getString();
      return !displayName.equals(Formatting.strip(displayName));
   }

   public boolean k() {
      return this.canRenderServerBoundMarkers();
   }

   public boolean canRenderServerBoundMarkers() {
      return c.world != null
         && "minecraft:overworld".equals(c.world.getRegistryKey().getValue().toString())
         && !c.isInSingleplayer();
   }

   public MapMarkerStyle a(String eventName) {
      return this.findStyle(eventName);
   }

   public MapMarkerStyle findStyle(String eventName) {
      if (eventName == null) {
         return this.defaultStyle();
      }

      String normalizedName = eventName.toLowerCase(Locale.ROOT);
      if (this.activeProvider != null) {
         Map<String, MapMarkerStyle> activeStyles = this.activeProvider.styles();
         if (activeStyles.containsKey(normalizedName)) {
            return activeStyles.get(normalizedName);
         }
      }

      for (MarkerProvider provider : this.providers) {
         Map<String, MapMarkerStyle> styles = provider.styles();
         if (styles.containsKey(normalizedName)) {
            return styles.get(normalizedName);
         }
      }

      return this.defaultStyle();
   }

   private MapMarkerStyle defaultStyle() {
      return new MapMarkerStyle(new Color(255, 165, 0));
   }

   private String capitalizeEventName(String eventName) {
      if (eventName == null || eventName.isEmpty()) {
         return eventName;
      }

      return eventName.substring(0, 1).toUpperCase(Locale.ROOT) + eventName.substring(1);
   }

   private Text playerListHeader() {
      if (c.inGameHud == null || c.inGameHud.getPlayerListHud() == null) {
         return null;
      }

      return ((PlayerListHudAccessor)c.inGameHud.getPlayerListHud()).getHeader();
   }

   private String currentServerAddress() {
      return c.getCurrentServerEntry() != null ? c.getCurrentServerEntry().address : null;
   }

   private static int parseInt(String value, int fallback) {
      try {
         return Integer.parseInt(value);
      } catch (NumberFormatException ignored) {
         return fallback;
      }
   }

   @Generated
   public List<MarkerProvider> l() {
      return this.providers;
   }

   @Generated
   public MarkerProvider m() {
      return this.activeProvider;
   }

   @Generated
   public boolean n() {
      return this.needsProviderRefresh;
   }

   @Generated
   public String o() {
      return this.pendingMarkerName;
   }

   @Generated
   public int p() {
      return this.pendingServerId;
   }
}
