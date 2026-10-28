package pulse;

import java.util.List;
import java.util.Set;

public interface AccountServiceListener {
   void a(int status, Set<String> names);

   void a(int status, long timestamp, List<AccountServiceRecord> records);
}
