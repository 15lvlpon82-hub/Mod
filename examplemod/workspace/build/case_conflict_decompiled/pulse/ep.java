/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2703
 *  net.minecraft.class_640
 *  pulse.Bool
 *  pulse.eo
 */
package pulse;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import net.minecraft.class_2703;
import net.minecraft.class_640;
import pulse.Bool;
import pulse.ej;
import pulse.el;
import pulse.eo;
import pulse.eq;

public class ep
implements ThreadFactory {
    private static long a = 150L;
    private static int b;
    private static long c;
    private static double d;
    private static int e;
    private final Set<String> f = ConcurrentHashMap.newKeySet();
    private final AtomicInteger g;
    private volatile long h;
    private final Set<String> i;
    private final Set<String> j;
    private final ScheduledExecutorService k;
    private ScheduledFuture<?> l;
    private ScheduledFuture<?> m;
    private final AtomicBoolean n;
    private eo o;
    private final Map<UUID, String> p;
    private final el q;
    private final ej r;
    private static final Pattern s;

    public ep() {
        int var2 = 1196263517;
        int var1 = 486991964;
        int var10003 = (var1 | var2) - (var1 & var2);
        var2 = 1514889217;
        var1 = var10003;
        this.g = new AtomicInteger((var1 | var2) & (~var1 | ~var2));
        this.h = eq.a(Collections.emptySet());
        this.i = ConcurrentHashMap.newKeySet();
        this.j = ConcurrentHashMap.newKeySet();
        var10003 = -511757366;
        var2 = 331874884;
        var1 = var10003;
        var10003 = var1 + var2 - 2 * (var1 & var2);
        var2 = -222875250;
        var1 = var10003;
        this.n = new AtomicBoolean(Bool.from((int)((var1 | var2) & (~var1 | ~var2))));
        this.p = new ConcurrentHashMap<UUID, String>();
        this.k = Executors.newSingleThreadScheduledExecutor(this);
        this.q = new el(this);
        this.r = new ej(this);
    }

    @Override
    public Thread newThread(Runnable var1) {
        return null;
    }

    public void a(eo var1) {
    }

    public void a(class_2703 var1) {
    }

    public void a() {
    }

    public void a(Collection<class_640> var1) {
    }

    public void b(Collection<String> var1) {
    }

    public void b() {
    }

    public void a(int var1, long var2) {
    }

    public void a(long var1, boolean var3) {
    }

    public void a(boolean var1, boolean var2) {
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
        return Collections.emptySet();
    }

    public void g() {
    }

    private void j() {
    }

    void h() {
    }

    private void k() {
    }

    private void l() {
    }

    void i() {
    }

    private void m() {
    }

    private void n() {
    }

    private void o() {
    }

    private static boolean a(String var0) {
        return false;
    }

    public static String a(String var0, String var1, int var2, int var3, int var4, int var5) {
        char[] var6 = var1.toCharArray();
        char[] var7 = new char[var6.length];
        int var18 = -21332682;
        int var17 = 2041349188;
        int var10000 = (var17 | var18) & ~(var17 & var18);
        var18 = -2028537480;
        var17 = var10000;
        char[] var219 = new char[var17 & ~var18 | ~var17 & var18];
        int var10002 = -1311657741;
        var18 = -1213457695;
        var17 = var10002;
        var10002 = (var17 | var18) & ~(var17 & var18);
        var18 = 108898834;
        var17 = var10002;
        var10002 = (var17 | var18) & (~var17 | ~var18);
        var18 = -1800160643;
        var17 = 542841665;
        int var10003 = (var17 | var18) - (var17 & var18);
        var18 = -1259804402;
        var17 = var10003;
        var219[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
        var10002 = 1985223420;
        var18 = 953813646;
        var17 = var10002;
        var10002 = (var17 | var18) - (var17 & var18);
        var18 = 1317933171;
        var17 = var10002;
        var10002 = var17 + var18 - 2 * (var17 & var18);
        var10003 = -124862809;
        var18 = -472284997;
        var17 = var10003;
        var10003 = var17 & ~var18 | ~var17 & var18;
        var18 = 458694041;
        var17 = var10003;
        var219[var10002] = (char)((var17 | var18) - (var17 & var18));
        var10002 = -119089956;
        var18 = -1881452589;
        var17 = var10002;
        var10002 = var17 & ~var18 | ~var17 & var18;
        var18 = 2000526093;
        var17 = var10002;
        var10002 = (var17 | var18) - (var17 & var18);
        var10003 = -1679387882;
        var18 = -2136048775;
        var17 = var10003;
        var10003 = (var17 | var18) - (var17 & var18);
        var18 = 457755625;
        var17 = var10003;
        var219[var10002] = (char)((var17 | var18) - (var17 & var18));
        var18 = -1661620980;
        var17 = -1730139089;
        var10002 = (var17 | var18) & (~var17 | ~var18);
        var18 = 68518176;
        var17 = var10002;
        var10002 = var17 + var18 - 2 * (var17 & var18);
        var18 = -370798871;
        var17 = 933936955;
        var10003 = var17 + var18 - 2 * (var17 & var18);
        var18 = -565433919;
        var17 = var10003;
        var219[var10002] = (char)((var17 | var18) & ~(var17 & var18));
        var18 = 537101539;
        var17 = 66999684;
        var10002 = (var17 | var18) & (~var17 | ~var18);
        var18 = 603836771;
        var17 = var10002;
        var10002 = var17 & ~var18 | ~var17 & var18;
        var18 = 1366452204;
        var17 = -2059109865;
        var10003 = (var17 | var18) & (~var17 | ~var18);
        var18 = -734622498;
        var17 = var10003;
        var219[var10002] = (char)((var17 | var18) - (var17 & var18));
        var18 = -1068824355;
        var17 = -732737541;
        var10002 = var17 + var18 - 2 * (var17 & var18);
        var18 = 337135395;
        var17 = var10002;
        var10002 = var17 & ~var18 | ~var17 & var18;
        var10003 = -1930709872;
        var18 = 671624634;
        var17 = var10003;
        var10003 = (var17 | var18) & (~var17 | ~var18);
        var18 = -1528570712;
        var17 = var10003;
        var219[var10002] = (char)((var17 | var18) & ~(var17 & var18));
        var18 = -2074745112;
        var17 = -2083297795;
        var10002 = var17 + var18 - 2 * (var17 & var18);
        var18 = 126255891;
        var17 = var10002;
        var10002 = (var17 | var18) & (~var17 | ~var18);
        var18 = 861354756;
        var17 = 1008761588;
        var10003 = (var17 | var18) & ~(var17 & var18);
        var18 = 259475683;
        var17 = var10003;
        var219[var10002] = (char)((var17 | var18) - (var17 & var18));
        var18 = 110775461;
        var17 = -107304981;
        var10002 = (var17 | var18) & ~(var17 & var18);
        var18 = -16716983;
        var17 = var10002;
        var10002 = (var17 | var18) & ~(var17 & var18);
        var10003 = 153137178;
        var18 = 920358865;
        var17 = var10003;
        var10003 = (var17 | var18) - (var17 & var18);
        var18 = 1073417193;
        var17 = var10003;
        var219[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
        var10002 = 396603951;
        var18 = 142929841;
        var17 = var10002;
        var10002 = (var17 | var18) & (~var17 | ~var18);
        var18 = 522673558;
        var17 = var10002;
        var10002 = (var17 | var18) & (~var17 | ~var18);
        var10003 = -2038164867;
        var18 = 1240409087;
        var17 = var10003;
        var10003 = (var17 | var18) & ~(var17 & var18);
        var18 = -815056431;
        var17 = var10003;
        var219[var10002] = (char)((var17 | var18) - (var17 & var18));
        var18 = 500527080;
        var17 = -1816272731;
        var10002 = (var17 | var18) & (~var17 | ~var18);
        var18 = -1905750204;
        var17 = var10002;
        var10002 = var17 & ~var18 | ~var17 & var18;
        var18 = -39312373;
        var17 = -1562990897;
        var10003 = var17 & ~var18 | ~var17 & var18;
        var18 = 1602127328;
        var17 = var10003;
        var219[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
        char[] var8 = var219;
        var10000 = 420038310;
        var18 = -578959082;
        var17 = var10000;
        var10000 = (var17 | var18) - (var17 & var18);
        var18 = -998993990;
        var17 = var10000;
        char[] var222 = new char[(var17 | var18) & ~(var17 & var18)];
        var10002 = -1584237177;
        var18 = 155518367;
        var17 = var10002;
        var10002 = (var17 | var18) & ~(var17 & var18);
        var18 = -1462276072;
        var17 = var10002;
        var10002 = (var17 | var18) & (~var17 | ~var18);
        var10003 = -423891328;
        var18 = 751851266;
        var17 = var10003;
        var10003 = (var17 | var18) & ~(var17 & var18);
        var18 = -898895454;
        var17 = var10003;
        var222[var10002] = (char)((var17 | var18) - (var17 & var18));
        var18 = 1944530358;
        var17 = 284165438;
        var10002 = var17 + var18 - 2 * (var17 & var18);
        var18 = 1662462089;
        var17 = var10002;
        var10002 = (var17 | var18) & ~(var17 & var18);
        var18 = 1727000953;
        var17 = -2033071382;
        var10003 = var17 & ~var18 | ~var17 & var18;
        var18 = -532758640;
        var17 = var10003;
        var222[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
        var10002 = 468462531;
        var18 = 346175871;
        var17 = var10002;
        var10002 = var17 + var18 - 2 * (var17 & var18);
        var18 = 256774846;
        var17 = var10002;
        var10002 = (var17 | var18) & (~var17 | ~var18);
        var18 = -1883111599;
        var17 = -796127533;
        var10003 = (var17 | var18) - (var17 & var18);
        var18 = 1598912209;
        var17 = var10003;
        var222[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
        var18 = -1414481216;
        var17 = 1858589021;
        var10002 = var17 + var18 - 2 * (var17 & var18);
        var18 = -982029410;
        var17 = var10002;
        var10002 = var17 & ~var18 | ~var17 & var18;
        var10003 = -1876057376;
        var18 = 1874545675;
        var17 = var10003;
        var10003 = (var17 | var18) & ~(var17 & var18);
        var18 = -6891799;
        var17 = var10003;
        var222[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
        var18 = 1488839581;
        var17 = 1368096248;
        var10002 = var17 & ~var18 | ~var17 & var18;
        var18 = 154574433;
        var17 = var10002;
        var10002 = var17 + var18 - 2 * (var17 & var18);
        var10003 = -930393632;
        var18 = 1093354853;
        var17 = var10003;
        var10003 = var17 + var18 - 2 * (var17 & var18);
        var18 = -1985991483;
        var17 = var10003;
        var222[var10002] = (char)((var17 | var18) - (var17 & var18));
        var18 = -1941185735;
        var17 = -1174643809;
        var10002 = var17 & ~var18 | ~var17 & var18;
        var18 = 901218467;
        var17 = var10002;
        var10002 = (var17 | var18) - (var17 & var18);
        var18 = 1632212118;
        var17 = -36379748;
        var10003 = var17 + var18 - 2 * (var17 & var18);
        var18 = -1667412066;
        var17 = var10003;
        var222[var10002] = (char)((var17 | var18) - (var17 & var18));
        var10002 = 1709475924;
        var18 = -1129146133;
        var17 = var10002;
        var10002 = (var17 | var18) & ~(var17 & var18);
        var18 = -648671047;
        var17 = var10002;
        var10002 = (var17 | var18) & (~var17 | ~var18);
        var10003 = -814158672;
        var18 = -2040918353;
        var17 = var10003;
        var10003 = (var17 | var18) - (var17 & var18);
        var18 = 1226990886;
        var17 = var10003;
        var222[var10002] = (char)((var17 | var18) & ~(var17 & var18));
        var10002 = -79936739;
        var18 = -1852643777;
        var17 = var10002;
        var10002 = (var17 | var18) - (var17 & var18);
        var18 = 1789830437;
        var17 = var10002;
        var10002 = (var17 | var18) & ~(var17 & var18);
        var10003 = -1737213790;
        var18 = -212169099;
        var17 = var10003;
        var10003 = var17 & ~var18 | ~var17 & var18;
        var18 = 1798219503;
        var17 = var10003;
        var222[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
        var10002 = 688132791;
        var18 = -2066956535;
        var17 = var10002;
        var10002 = var17 + var18 - 2 * (var17 & var18);
        var18 = -1379357258;
        var17 = var10002;
        var10002 = var17 + var18 - 2 * (var17 & var18);
        var10003 = -1259022808;
        var18 = 958672110;
        var17 = var10003;
        var10003 = (var17 | var18) & (~var17 | ~var18);
        var18 = -1915717182;
        var17 = var10003;
        var222[var10002] = (char)((var17 | var18) & ~(var17 & var18));
        var10002 = -1493276437;
        var18 = 1742330689;
        var17 = var10002;
        var10002 = (var17 | var18) & (~var17 | ~var18);
        var18 = -1054362717;
        var17 = var10002;
        var10002 = var17 + var18 - 2 * (var17 & var18);
        var18 = -1851916033;
        var17 = 1276744066;
        var10003 = var17 + var18 - 2 * (var17 & var18);
        var18 = -578313650;
        var17 = var10003;
        var222[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
        char[] var9 = var222;
        var18 = 1203603036;
        var17 = -376709871;
        var10000 = (var17 | var18) & ~(var17 & var18);
        var18 = -1372169395;
        var17 = var10000;
        for (int var10 = (var17 | var18) & (var17 & var18 ^ 0xFFFFFFFF); var10 < var6.length; ++var10) {
            char var277 = var6[var10];
            char var205 = var8[var10 % var8.length];
            char var106 = var277;
            var7[var10] = (char)(var106 & ~var205 | ~var106 & var205);
        }
        char[] var19 = new char[var7.length];
        var10000 = 1980694393;
        var18 = 719406688;
        var17 = var10000;
        var10000 = var17 + var18 - 2 * (var17 & var18);
        var18 = 1559214361;
        var17 = var10000;
        for (int var11 = (var17 | var18) & (var17 ^ 0xFFFFFFFF | var18 ^ 0xFFFFFFFF); var11 < var6.length; ++var11) {
            char var278 = var7[var11];
            char var208 = var9[var11 % var9.length];
            char var109 = var278;
            var19[var11] = (char)(var109 + var208 - 2 * (var109 & var208));
        }
        String var20 = new String(var19);
        int var12 = var20.hashCode();
        var18 = var5;
        var17 = var3;
        var10000 = var17 - var18;
        var18 = var2;
        var17 = var10000;
        int var13 = (var17 ^ var18) - 2 * (~var17 & var18);
        char[] var14 = var0.toCharArray();
        char[] var15 = new char[var14.length];
        var18 = 1406650178;
        var17 = 1424685908;
        var10000 = var17 + var18 - 2 * (var17 & var18);
        var18 = 121453590;
        var17 = var10000;
        block6: for (int var16 = var17 & (var18 ^ 0xFFFFFFFF) | (var17 ^ 0xFFFFFFFF) & var18; var16 < var15.length; ++var16) {
            var18 = -575049168;
            var17 = 1997492383;
            int var10001 = (var17 | var18) & (~var17 | ~var18);
            var18 = -1430904147;
            var17 = var10001;
            switch (var16 % (var17 + var18 - 2 * (var17 & var18))) {
                case 0: {
                    var18 = var12;
                    var17 = var13;
                    var10002 = (var17 | var18) & (~var17 | ~var18);
                    char var218 = var14[var16];
                    var17 = var10002;
                    var15[var16] = (char)((var17 | var218) & (~var17 | ~var218));
                    continue block6;
                }
                case 1: {
                    var18 = var13;
                    var17 = var5;
                    var10002 = (var17 | var18) - (var17 & var18);
                    char var216 = var14[var16];
                    var17 = var10002;
                    var15[var16] = (char)(var17 & ~var216 | ~var17 & var216);
                }
            }
        }
        return new String(var15);
    }

    static {
        c = 500L;
        d = 0.3;
        int var10000 = 1966537442;
        int var1 = 1321258681;
        int var0 = var10000;
        var10000 = (var0 | var1) & (~var0 | ~var1);
        var1 = 1005990991;
        var0 = var10000;
        b = var0 + var1 - 2 * (var0 & var1);
        var1 = 1783838659;
        var0 = 1439907007;
        var10000 = var0 + var1 - 2 * (var0 & var1);
        var1 = 1065356130;
        var0 = var10000;
        e = var0 & ~var1 | ~var0 & var1;
        int var10002 = -1776068606;
        var1 = 466600328;
        var0 = var10002;
        var10002 = (var0 | var1) & ~(var0 & var1);
        var1 = 1054100093;
        var0 = var10002;
        var10002 = (var0 | var1) - (var0 & var1);
        var1 = 470253095;
        var0 = -1099006219;
        int var10003 = (var0 | var1) & ~(var0 & var1);
        var1 = -1646023235;
        var0 = var10003;
        var10003 = (var0 | var1) & ~(var0 & var1);
        var1 = 641792488;
        var0 = -492490284;
        int var10004 = var0 & ~var1 | ~var0 & var1;
        var1 = -596138575;
        var0 = var10004;
        var10004 = var0 + var1 - 2 * (var0 & var1);
        var1 = 487002951;
        var0 = -354804078;
        int var10005 = var0 + var1 - 2 * (var0 & var1);
        var1 = -141113574;
        var0 = var10005;
        s = Pattern.compile(ep.a("\udd00\uc43d\udd3f\uc44b\udd24\uc427\udd73\uc43c\udd6e\uc44b\udd67\uc439\udd03\uc41d\udd6d\uc44a\udd6f\uc450\udd23\uc442", "`\ua7f3\ua4fa\ua061\ua910\u7d7a\u8e59\u247f\u8b78\u3463`\ua7e7\ua4b6\ua07a\ua900\u7d64\u8e05\u246c\u8b65\u3438F\ua7e7\ua4b7\ua042\ua91c\u7d78\u8e49\u2457\u8b36\u3479s\ua7e1\ua4b0\ua063", var10002, var10003, var10004, var0 & ~var1 | ~var0 & var1));
    }
}
