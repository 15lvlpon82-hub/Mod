package pulse;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadFactory;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.network.packet.s2c.play.PlayerListS2CPacket;

public class PlayerListTracker implements ThreadFactory {
   private final Set<String> names = ConcurrentHashMap.newKeySet();
   private AccountServiceListener listener;

   @Override
   public Thread newThread(Runnable task) {
      Thread thread = new Thread(task, "pulse-player-list");
      thread.setDaemon(true);
      return thread;
   }

   public void a(AccountServiceListener listener) {
      this.listener = listener;
   }

   public void a(PlayerListS2CPacket packet) {
   }

   public void a() {
   }

   public void a(Collection<PlayerListEntry> entries) {
   }

   public void b(Collection<String> names) {
      this.names.clear();
      if (names != null) {
         this.names.addAll(names);
      }
   }

   public void b() {
   }

   public void a(int status, long timestamp) {
      if (this.listener != null) {
         this.listener.a(status, timestamp, Collections.emptyList());
      }
   }

   public void a(long value, boolean enabled) {
   }

   public void a(boolean first, boolean second) {
   }

   public void c() {
   }

   public int d() {
      return 0;
   }

   public long e() {
      return 0L;
   }

   public Set<String> f() {
      return Collections.unmodifiableSet(this.names);
   }

   public void g() {
   }
}
