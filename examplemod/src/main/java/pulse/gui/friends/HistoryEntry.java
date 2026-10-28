package pulse;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class HistoryEntry {
   private static final DateTimeFormatter DISPLAY_DATE_FORMAT = DateTimeFormatter.ofPattern("dd.MM.yyyy", Locale.ROOT);

   private String name;
   private LocalDate date;

   public HistoryEntry(String name) {
      this(name, LocalDate.now());
   }

   public HistoryEntry(String name, LocalDate date) {
      this.name = name;
      this.date = date;
   }

   public String name() {
      return this.name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public LocalDate date() {
      return this.date;
   }

   public void setDate(LocalDate date) {
      this.date = date;
   }

   public String formattedDate() {
      return this.date.format(DISPLAY_DATE_FORMAT);
   }

   public String a() {
      return this.name;
   }

   public void a(String name) {
      this.name = name;
   }

   public LocalDate b() {
      return this.date;
   }

   public void a(LocalDate date) {
      this.date = date;
   }

   public String c() {
      return this.formattedDate();
   }
}
