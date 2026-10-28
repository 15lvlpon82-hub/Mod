package pulse;

import ru.pulse.Pulse;

public final class FriendLookup {
   private FriendLookup() {
   }

   public static boolean isFriendName(String name) {
      if (!(Pulse.getInstance().getClickGui() instanceof PulseClickGuiScreen)) {
         return false;
      }

      PulseClickGuiScreen clickGui = (PulseClickGuiScreen)Pulse.getInstance().getClickGui();
      FriendsTab friendsTab = clickGui.h();
      if (friendsTab == null) {
         return false;
      }

      return friendsTab.e().a().stream().anyMatch(entry -> entry.a().equalsIgnoreCase(name));
   }

   public static boolean a(String name) {
      return isFriendName(name);
   }
}
