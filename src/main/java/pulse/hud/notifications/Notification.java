package pulse;

import java.awt.Color;

public class Notification {
   private String title;
   private int x;
   private int y;
   private int z;
   private Color color;
   private Icon icon;
   private boolean temporary;
   private long createdAt;
   private int priority;
   private String source;
   private long expiresAt;
   private boolean visible;

   public Notification(String title, int x, int y, int z, Color color, Icon icon) {
      this.title = title;
      this.x = x;
      this.y = y;
      this.z = z;
      this.color = color;
      this.icon = icon;
      this.temporary = false;
      this.createdAt = System.currentTimeMillis();
      this.priority = -1;
      this.source = null;
      this.expiresAt = 0L;
      this.visible = true;
   }

   public static Notification a(String title, int x, int y, int z, Color color, Icon icon, int priority, String source, long lifetimeMs, boolean visible) {
      Notification notification = new Notification(title, x, y, z, color, icon != null ? icon : Icon.EVENT);
      notification.temporary = true;
      notification.priority = priority;
      notification.source = source;
      notification.expiresAt = System.currentTimeMillis() + lifetimeMs;
      notification.visible = visible;
      return notification;
   }

   public String title() {
      return this.title;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public int x() {
      return this.x;
   }

   public void setX(int x) {
      this.x = x;
   }

   public int y() {
      return this.y;
   }

   public void setY(int y) {
      this.y = y;
   }

   public int z() {
      return this.z;
   }

   public void setZ(int z) {
      this.z = z;
   }

   public Color color() {
      return this.color;
   }

   public void setColor(Color color) {
      this.color = color;
   }

   public Icon icon() {
      return this.icon;
   }

   public void setIcon(Icon icon) {
      this.icon = icon;
   }

   public String coordinates() {
      return this.x + ", " + this.y + ", " + this.z;
   }

   public boolean isDeathIcon() {
      return this.icon == Icon.DEATH;
   }

   public boolean isFastIcon() {
      return this.icon == Icon.FAST;
   }

   public boolean isTemporary() {
      return this.temporary;
   }

   public long createdAt() {
      return this.createdAt;
   }

   public int priority() {
      return this.priority;
   }

   public void setPriority(int priority) {
      this.priority = priority;
   }

   public String source() {
      return this.source;
   }

   public void setSource(String source) {
      this.source = source;
   }

   public long expiresAt() {
      return this.expiresAt;
   }

   public void setExpiresAt(long expiresAt) {
      this.expiresAt = expiresAt;
   }

   public boolean isExpired() {
      return this.temporary && this.expiresAt > 0L && System.currentTimeMillis() > this.expiresAt;
   }

   public long remainingLifetimeMs() {
      if (!this.temporary || this.expiresAt <= 0L) {
         return -1L;
      }

      return Math.max(0L, this.expiresAt - System.currentTimeMillis());
   }

   public boolean isEventIcon() {
      return this.icon == Icon.EVENT;
   }

   public boolean visible() {
      return this.visible;
   }

   public void setVisible(boolean visible) {
      this.visible = visible;
   }

   public String a() {
      return this.title;
   }

   public void a(String title) {
      this.title = title;
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
      this.icon = icon;
   }

   public String g() {
      return this.coordinates();
   }

   public boolean h() {
      return this.isDeathIcon();
   }

   public boolean i() {
      return this.isFastIcon();
   }

   public boolean j() {
      return this.temporary;
   }

   public long k() {
      return this.createdAt;
   }

   public int l() {
      return this.priority;
   }

   public void d(int priority) {
      this.priority = priority;
   }

   public String m() {
      return this.source;
   }

   public void b(String source) {
      this.source = source;
   }

   public long n() {
      return this.expiresAt;
   }

   public void a(long expiresAt) {
      this.expiresAt = expiresAt;
   }

   public boolean o() {
      return this.isExpired();
   }

   public long p() {
      return this.remainingLifetimeMs();
   }

   public boolean q() {
      return this.isEventIcon();
   }

   public boolean r() {
      return this.visible;
   }

   public void a(boolean visible) {
      this.visible = visible;
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
      private final String icon;

      Icon(String id, String icon) {
         this.id = id;
         this.icon = icon;
      }

      public String id() {
         return this.id;
      }

      public String glyph() {
         return this.icon;
      }

      public String a() {
         return this.id;
      }

      public String b() {
         return this.icon;
      }
   }
}
