package pulse;

public class AccountServiceRecord {
   public final String key;
   public final String value;

   public AccountServiceRecord(String key, String value) {
      this.key = key;
      this.value = value;
   }

   public String a() {
      return this.key;
   }

   public String b() {
      return this.value;
   }
}
