package pulse;

public class ChatSendEvent extends CancellablePulseEvent {
   private final String message;

   public ChatSendEvent(String message) {
      this.message = message;
   }

   public String getMessage() {
      return this.message;
   }

   public String d() {
      return this.message;
   }
}

