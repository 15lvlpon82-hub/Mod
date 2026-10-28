package pulse;

import java.util.Collection;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.network.packet.s2c.play.PlayerListS2CPacket;

public final class PlayerListCache {
   private static final PlayerListCache INSTANCE = new PlayerListCache();

   private final Map<String, Integer> capeIdsByName = new ConcurrentHashMap<>();
   private final AccountServiceClient accountService = AccountServiceClient.A();
   private volatile String currentServer = "";

   private PlayerListCache() {
   }

   public static PlayerListCache c() {
      return INSTANCE;
   }

   public void a() {
      this.refreshServer();
      this.capeIdsByName.clear();
   }

   public void b() {
      this.currentServer = "";
      this.capeIdsByName.clear();
   }

   public void a(PlayerListS2CPacket packet) {
      this.refreshServer();
   }

   public boolean a(String playerName) {
      return this.b(playerName) != null;
   }

   public Integer b(String playerName) {
      if (playerName == null || playerName.isBlank()) {
         return null;
      }

      String key = normalize(playerName);
      Integer cachedCape = this.capeIdsByName.get(key);
      if (cachedCape != null) {
         return cachedCape;
      }

      Integer cape = this.a(playerName, this.e());
      if (cape != null) {
         this.capeIdsByName.put(key, cape);
      }
      return cape;
   }

   public Integer a(String playerName, String serverAddress) {
      if (playerName == null || playerName.isBlank()) {
         return null;
      }

      try {
         return this.accountService.c(playerName, serverAddress == null ? "" : serverAddress);
      } catch (RuntimeException ignored) {
         return null;
      }
   }

   private Collection<PlayerListEntry> d() {
      MinecraftClient client = MinecraftClient.getInstance();
      ClientPlayNetworkHandler networkHandler = client.getNetworkHandler();
      return networkHandler == null ? Collections.emptyList() : networkHandler.getListedPlayerListEntries();
   }

   private String e() {
      this.refreshServer();
      return this.currentServer;
   }

   private void refreshServer() {
      MinecraftClient client = MinecraftClient.getInstance();
      this.currentServer = client.getCurrentServerEntry() == null ? "" : client.getCurrentServerEntry().address;
   }

   private static String normalize(String playerName) {
      return playerName.toLowerCase(Locale.ROOT);
   }
}
