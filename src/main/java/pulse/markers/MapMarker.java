package pulse;

import java.awt.Color;

public class MapMarker {
   private String name;
   private int x;
   private int y;
   private int z;
   private Color color;
   private Icon icon;
   private boolean serverBound;
   private long createdAt;
   private int serverId;
   private String serverAddress;
   private long expiresAt;
   private boolean showTimer;

   public MapMarker(String name, int x, int y, int z, Color color, Icon icon) {
      this.name = name;
      this.x = x;
      this.y = y;
      this.z = z;
      this.color = color;
      this.icon = icon != null ? icon : Icon.EVENT;
      this.createdAt = System.currentTimeMillis();
   }

   public static MapMarker a(String name, int x, int y, int z, Color color, Icon icon, int serverId, String serverAddress, long lifetimeMs, boolean showTimer) {
      MapMarker marker = new MapMarker(name, x, y, z, color, icon);
      marker.serverBound = true;
      marker.serverId = serverId;
      marker.serverAddress = serverAddress;
      marker.expiresAt = System.currentTimeMillis() + lifetimeMs;
      marker.showTimer = showTimer;
      return marker;
   }

   public String a() {
      return this.name;
   }

   public void a(String name) {
      this.name = name;
   }

   public int b() {
      return this.x;
   }

   public void a(int x) {
      this.x = x;
   }

   public int c() {
      return this.y;
   }

   public void b(int y) {
      this.y = y;
   }

   public int d() {
      return this.z;
   }

   public void c(int z) {
      this.z = z;
   }

   public Color e() {
      return this.color;
   }

   public void a(Color color) {
      this.color = color;
   }

   public Icon f() {
      return this.icon;
   }

   public void a(Icon icon) {
      this.icon = icon != null ? icon : Icon.EVENT;
   }

   public String g() {
      return this.x + ", " + this.y + ", " + this.z;
   }

   public boolean h() {
      return this.icon == Icon.DEATH;
   }

   public boolean i() {
      return this.icon == Icon.FAST;
   }

   public boolean j() {
      return this.serverBound;
   }

   public long k() {
      return this.createdAt;
   }

   public int l() {
      return this.serverId;
   }

   public void d(int serverId) {
      this.serverId = serverId;
   }

   public String m() {
      return this.serverAddress;
   }

   public void b(String serverAddress) {
      this.serverAddress = serverAddress;
   }

   public long n() {
      return this.expiresAt;
   }

   public void a(long expiresAt) {
      this.expiresAt = expiresAt;
   }

   public boolean o() {
      return this.serverBound && this.expiresAt > 0L && System.currentTimeMillis() > this.expiresAt;
   }

   public long p() {
      if (!this.serverBound || this.expiresAt <= 0L) {
         return -1L;
      }

      return Math.max(0L, this.expiresAt - System.currentTimeMillis());
   }

   public boolean q() {
      return this.icon == Icon.EVENT;
   }

   public boolean r() {
      return this.showTimer;
   }

   public void a(boolean showTimer) {
      this.showTimer = showTimer;
   }

   public enum Icon {
      HOME("home", "\ue90f"),
      REPAIR("repair", "\ue91f"),
      FAST("fast", "\ue90b"),
      SHIELD("shield", "\ue923"),
      DEATH("death", "\ue907"),
      DIAMOND("diamond", "\ue908"),
      LOCKED("locked", "\ue914"),
      MOUNTAIN("mountain", "\ue917"),
      CALENDAR("calendar", "\ue90a"),
      EVENT("calendar", "\ue90a");

      private final String id;
      private final String glyph;

      Icon(String id, String glyph) {
         this.id = id;
         this.glyph = glyph;
      }

      public String a() {
         return this.id;
      }

      public String b() {
         return this.glyph;
      }
   }
}

