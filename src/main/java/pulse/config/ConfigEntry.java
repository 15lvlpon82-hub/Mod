package pulse;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ConfigEntry {
   private static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("dd.MM HH:mm");

   private String name;
   private final String data;
   private final LocalDateTime createdAt;
   private boolean selected;
   private final boolean shared;
   private final int remoteId;
   private final String owner;

   public ConfigEntry(String name, String data, LocalDateTime createdAt) {
      this.name = name;
      this.data = data;
      this.createdAt = createdAt;
      this.selected = false;
      this.shared = false;
      this.remoteId = 0;
      this.owner = null;
   }

   public ConfigEntry(String name, String data) {
      this(name, data, LocalDateTime.now());
   }

   public ConfigEntry(int remoteId, String name, String data, String owner, LocalDateTime createdAt) {
      this.name = name;
      this.data = data;
      this.createdAt = createdAt;
      this.selected = false;
      this.shared = true;
      this.remoteId = remoteId;
      this.owner = owner;
   }

   public String a() {
      return this.name;
   }

   public void a(String name) {
      this.name = name;
   }

   public String b() {
      return this.data;
   }

   public LocalDateTime c() {
      return this.createdAt;
   }

   public String d() {
      return this.createdAt.format(DATE_FORMAT);
   }

   public boolean e() {
      return this.selected;
   }

   public void a(boolean selected) {
      this.selected = selected;
   }

   public boolean f() {
      return this.shared;
   }

   public int g() {
      return this.remoteId;
   }

   public String h() {
      return this.owner;
   }
}
