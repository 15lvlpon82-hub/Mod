package pulse;

import java.util.List;
import java.util.Set;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import org.json.JSONArray;
import org.json.JSONObject;

public class AccountServiceClient extends WebSocketListener implements Runnable, AccountServiceListener {
   private static volatile AccountServiceClient instance;

   public final PlayerListTracker a;
   public final CloudConfigRepository b;

   private AccountServiceClient() {
      this.a = new PlayerListTracker();
      this.b = new CloudConfigRepository(this);
   }

   public static AccountServiceClient getInstance() {
      instance = new AccountServiceClient();
      return instance;
   }

   public static AccountServiceClient A() {
      return getInstance();
   }

   public boolean a() {
      return false;
   }

   public boolean b() {
      return false;
   }

   public boolean c() {
      return false;
   }

   public boolean d() {
      return false;
   }

   public boolean e() {
      return false;
   }

   public boolean f() {
      return false;
   }

   public PlayerListTracker g() {
      return null;
   }

   public JSONArray h() {
      return null;
   }

   public JSONArray i() {
      return null;
   }

   public JSONArray j() {
      return null;
   }

   public long k() {
      return 0L;
   }

   public long l() {
      return 0L;
   }

   public String m() {
      return null;
   }

   public String n() {
      return null;
   }

   public String o() {
      return null;
   }

   public String p() {
      return null;
   }

   public byte[] q() {
      return null;
   }

   public long r() {
      return 0L;
   }

   public String s() {
      return null;
   }

   public String t() {
      return null;
   }

   public boolean a(String name, String server) {
      return false;
   }

   @Override
   public void run() {
   }

   public void b(String name, String server) {
   }

   public void u() {
   }

   public void v() {
   }

   public void a(String value) {
   }

   public void b(String value) {
   }

   public void w() {
   }

   public void x() {
   }

   public boolean c(String value) {
      return false;
   }

   public Integer c(String name, String server) {
      return null;
   }

   public void y() {
   }

   public void d(String value) {
   }

   public void z() {
   }

   public JSONObject a(int requestId, int type, JSONObject payload) {
      return null;
   }

   @Override
   public void a(int status, Set<String> names) {
   }

   @Override
   public void a(int status, long timestamp, List<AccountServiceRecord> records) {
   }

   @Override
   public void onOpen(WebSocket webSocket, Response response) {
   }

   @Override
   public void onMessage(WebSocket webSocket, String text) {
   }

   @Override
   public void onClosed(WebSocket webSocket, int code, String reason) {
   }

   @Override
   public void onFailure(WebSocket webSocket, Throwable throwable, Response response) {
   }
}
