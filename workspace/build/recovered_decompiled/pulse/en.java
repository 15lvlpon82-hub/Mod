/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  okhttp3.OkHttpClient
 *  okhttp3.Response
 *  okhttp3.WebSocket
 *  okhttp3.WebSocketListener
 *  org.json.JSONArray
 *  org.json.JSONObject
 *  pulse.av
 *  pulse.eo
 *  pulse.ep
 */
package pulse;

import java.security.SecureRandom;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import org.json.JSONArray;
import org.json.JSONObject;
import pulse.av;
import pulse.eo;
import pulse.ep;

public class en
extends WebSocketListener
implements Runnable,
eo {
    private static final SecureRandom u = new SecureRandom();
    private final Map v = new ConcurrentHashMap();
    private final Set w = ConcurrentHashMap.newKeySet();
    private final ConcurrentLinkedQueue x = new ConcurrentLinkedQueue();
    private final Map y = new ConcurrentHashMap();
    private final ConcurrentHashMap<String, CompletableFuture<JSONObject>> z = new ConcurrentHashMap();
    public final ep a;
    public final av b;
    public OkHttpClient c;
    public ScheduledExecutorService d;
    private WebSocket A;
    private ScheduledFuture B;
    private ScheduledFuture C;
    private volatile int D = 8;
    private volatile int E = 0;
    private volatile int F = 0;
    private volatile int G = 0;
    private volatile int H = 0;
    private volatile long I = 0L;
    private volatile long J = 0L;
    private volatile long K = 0L;
    private volatile long L = 0L;
    private volatile long M = 0L;
    public volatile String e;
    public volatile String f;
    public volatile String g;
    public volatile String h;
    public volatile String i;
    public volatile String j;
    public volatile String k;
    public volatile String l;
    public volatile String m;
    public volatile String n;
    public volatile String o;
    public volatile String p;
    public volatile String q;
    public volatile String r;
    public volatile String s;
    public volatile String t;
    private volatile byte[] N;
    private volatile byte[] O;
    private volatile byte[] P;
    private volatile JSONArray Q = new JSONArray();
    private volatile JSONArray R = new JSONArray();
    private volatile JSONArray S = new JSONArray();
    private volatile List T;
    private volatile Set U;
    private volatile String V;
    private volatile String W;
    private volatile long X;
    private volatile String Y;
    private volatile boolean Z;
    private volatile boolean aa;
    private volatile int ab;
    private volatile int ac;
    private volatile int ad;
    private volatile String ae;
    private volatile String af;
    private static volatile en ag;

    private en() {
        this.a = new ep();
        this.b = new av(this);
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

    public ep g() {
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
        return "";
    }

    public String n() {
        return "";
    }

    public String o() {
        return "";
    }

    public String p() {
        return "";
    }

    public byte[] q() {
        return new byte[0];
    }

    public long r() {
        return 0L;
    }

    public String s() {
        return "";
    }

    public String t() {
        return "";
    }

    public boolean a(String var1, String var2) {
        return false;
    }

    @Override
    public void run() {
    }

    private void a(int var1) {
    }

    private void B() {
    }

    private void C() {
    }

    private void D() {
    }

    private void E() {
    }

    private void F() {
    }

    private void G() {
    }

    private void a(JSONObject var1, int var2) {
    }

    private void b(int var1) {
    }

    private void a(int var1, long var2) {
    }

    public void b(String var1, String var2) {
    }

    public void u() {
    }

    public void v() {
    }

    public void a(String var1) {
    }

    public void b(String var1) {
    }

    public void w() {
    }

    public void x() {
    }

    public boolean c(String var1) {
        return false;
    }

    public Integer c(String var1, String var2) {
        return null;
    }

    public void y() {
    }

    public void d(String var1) {
    }

    public void z() {
    }

    public JSONObject a(int var1, int var2, JSONObject var3) {
        return null;
    }

    public void a(int var1, Set var2) {
    }

    public void a(int var1, long var2, List var4) {
    }

    public void onOpen(WebSocket var1, Response var2) {
    }

    public void onMessage(WebSocket var1, String var2) {
    }

    private void a(JSONObject var1, String var2) {
    }

    private void H() {
    }

    private void I() {
    }

    public void onClosed(WebSocket var1, int var2, String var3) {
    }

    public void onFailure(WebSocket var1, Throwable var2, Response var3) {
    }

    private void J() {
    }

    public static en A() {
        ag = new en();
        return ag;
    }
}
