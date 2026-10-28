package pulse;

import java.util.Collections;
import java.util.List;

public final class NotificationStore {
   private NotificationStore() {
   }

   public static void add(Notification notification) {
   }

   public static void remove(Notification notification) {
   }

   public static List<Notification> visibleNotifications() {
      return Collections.emptyList();
   }

   public static void clear() {
   }

   public static void reset() {
   }

   public static boolean isEmpty() {
      return true;
   }

   public static void pruneExpired() {
   }

   public static Notification hitTest(int mouseX, int mouseY, int mouseButton) {
      return null;
   }

   public static List<Notification> savedNotifications() {
      return Collections.emptyList();
   }

   public static List<Notification> allNotifications() {
      return Collections.emptyList();
   }

   public static void a(Notification notification) {
      add(notification);
   }

   public static void b(Notification notification) {
      remove(notification);
   }

   public static List<Notification> a() {
      return visibleNotifications();
   }

   public static void b() {
      clear();
   }

   public static void c() {
      reset();
   }

   public static boolean d() {
      return isEmpty();
   }

   public static void e() {
      pruneExpired();
   }

   public static Notification a(int mouseX, int mouseY, int mouseButton) {
      return hitTest(mouseX, mouseY, mouseButton);
   }

   public static List<Notification> f() {
      return savedNotifications();
   }

   public static List<Notification> g() {
      return allNotifications();
   }
}
