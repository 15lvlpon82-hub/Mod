package pulse.settings;

import java.util.function.Supplier;

public class TokenSetting extends Setting<String> {
   private final TokenType tokenType;
   private final String suffix;

   public TokenSetting(String name, String description, TokenType type, String value, String suffix) {
      super(name, description, value);
      this.tokenType = type;
      this.suffix = suffix;
   }

   public TokenSetting(String name, TokenType type, String value, String suffix) {
      this(name, "", type, value, suffix);
   }

   public TokenSetting(String name, String value) {
      this(name, "", TokenType.TEXT, value, "");
   }

   public TokenSetting(String name, TokenType type, String value) {
      this(name, "", type, value, "");
   }

   public String get() {
      return this.k();
   }

   public void set(String value) {
      super.a(value);
   }

   public TokenType tokenType() {
      return this.tokenType;
   }

   public String suffix() {
      return this.suffix;
   }

   public boolean isValid() {
      String value = this.k();
      if (value == null || value.isEmpty()) {
         return false;
      }

      if (this.tokenType == TokenType.NUMBER || this.tokenType == TokenType.PRICE) {
         try {
            Double.parseDouble(value);
         } catch (NumberFormatException exception) {
            return false;
         }
      }

      return true;
   }

   public TokenSetting visibleWhen(Supplier<Boolean> condition) {
      super.visibleWhen(condition);
      return this;
   }

   public String a() {
      return this.get();
   }

   public void a(String value) {
      this.set(value);
   }

   public TokenType b() {
      return this.tokenType();
   }

   public String c() {
      return this.suffix();
   }

   public boolean d() {
      return this.isValid();
   }

   public TokenSetting a(Supplier<Boolean> condition) {
      return this.visibleWhen(condition);
   }

   public enum TokenType {
      TEXT,
      COMMAND,
      PLAYER,
      NUMBER,
      PRICE
   }
}
