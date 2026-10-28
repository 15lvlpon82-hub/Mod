/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_4587
 *  pulse.AnimationState
 *  pulse.Bool
 *  pulse.Easing
 *  pulse.Renderer2D
 *  pulse.client.MinecraftContext
 *  pulse.g
 */
package pulse;

import java.awt.Color;
import net.minecraft.class_4587;
import pulse.AnimationState;
import pulse.Bool;
import pulse.Easing;
import pulse.Renderer2D;
import pulse.client.MinecraftContext;
import pulse.g;

public class t {
    private static final t c = new t();
    private static final int d = 80;
    private static final int e = 150;
    private final AnimationState f = new AnimationState();
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    public static int a;
    public static boolean b;

    private t() {
        int var2 = -1142165795;
        int var1 = -1576753009;
        int var10001 = var1 + var2 - 2 * (var1 & var2);
        var2 = 435111506;
        var1 = var10001;
        this.g = Bool.from((int)((var1 | var2) - (var1 & var2)));
        var2 = -501465487;
        var1 = -276945299;
        var10001 = var1 & ~var2 | ~var1 & var2;
        var2 = 224532508;
        var1 = var10001;
        this.h = Bool.from((int)(var1 & ~var2 | ~var1 & var2));
        var10001 = 1952464376;
        var2 = 1081847640;
        var1 = var10001;
        var10001 = var1 & ~var2 | ~var1 & var2;
        var2 = 874222240;
        var1 = var10001;
        this.i = Bool.from((int)((var1 | var2) & ~(var1 & var2)));
        var10001 = -353371494;
        var2 = 1511250676;
        var1 = var10001;
        var10001 = var1 & ~var2 | ~var1 & var2;
        var2 = -1325653906;
        var1 = var10001;
        this.j = Bool.from((int)(var1 + var2 - 2 * (var1 & var2)));
        var10001 = -371003141;
        var2 = -660135689;
        var1 = var10001;
        var10001 = var1 & ~var2 | ~var1 & var2;
        var2 = 826658828;
        var1 = var10001;
        this.k = Bool.from((int)((var1 | var2) & (~var1 | ~var2)));
        var2 = 1925143261;
        var1 = -329625633;
        var10001 = (var1 | var2) - (var1 & var2);
        var2 = -1629154046;
        var1 = var10001;
        this.l = Bool.from((int)(var1 & ~var2 | ~var1 & var2));
    }

    public static t a() {
        return c;
    }

    public void a(boolean var1) {
        if (this.h != var1) {
            this.h = var1;
            this.h();
        }
    }

    public void b(boolean var1) {
        if (this.i != var1) {
            this.i = var1;
            this.h();
        }
    }

    public void c(boolean var1) {
        if (this.j != var1) {
            this.j = var1;
            this.h();
        }
    }

    public void d(boolean var1) {
        if (this.k != var1) {
            this.k = var1;
            this.h();
        }
    }

    public void e(boolean var1) {
        if (this.l != var1) {
            this.l = var1;
            this.h();
        }
    }

    public boolean b() {
        int var9;
        if (!(this.h || this.i || this.j || this.k || this.l)) {
            int var7 = -1558169206;
            int var4 = -100444874;
            var9 = var4 & ~var7 | ~var4 & var7;
            var7 = 1495493820;
            var4 = var9;
            var9 = (var4 | var7) & ~(var4 & var7);
        } else {
            int var2 = -1902275193;
            int var1 = 303971650;
            var9 = (var1 | var2) & ~(var1 & var2);
            var2 = -1669093180;
            var1 = var9;
            var9 = (var1 | var2) & ~(var1 & var2);
        }
        return Bool.from((int)var9);
    }

    public boolean c() {
        return this.k;
    }

    public boolean d() {
        return this.l;
    }

    public boolean e() {
        return this.j;
    }

    private void h() {
        boolean var1 = this.b();
        if (var1 != this.g) {
            double var12;
            double var10001;
            double d = var10001 = !var1 ? 0.0 : 1.0;
            if (!var1) {
                String var10002 = "dsm";
                var12 = 0.15;
            } else {
                int var13 = 1159955995;
                int var3 = 396953902;
                int var2 = var13;
                int var14 = (var2 | var3) & (~var2 | ~var3);
                var3 = 322380286;
                var2 = var14;
                int var15 = (var2 | var3) & ~(var2 & var3);
                var3 = -2069946405;
                var2 = 783155710;
                int var10003 = var2 & ~var3 | ~var2 & var3;
                var3 = 188216052;
                var2 = var10003;
                var3 = (var2 | var3) & (~var2 | ~var3);
                var2 = var15;
                int var16 = (var2 | var3) + (var2 & var3);
                var12 = 0.2;
            }
            this.f.a(var10001, var12, Easing.h);
            this.g = var1;
        }
    }

    public void f() {
        int var2 = 864603333;
        int var1 = -2000203915;
        int var10001 = (var1 | var2) - (var1 & var2);
        var2 = -1152416848;
        var1 = var10001;
        this.h = Bool.from((int)((var1 | var2) & (~var1 | ~var2)));
        var2 = 1078498349;
        var1 = -328901100;
        var10001 = (var1 | var2) - (var1 & var2);
        var2 = -1406285255;
        var1 = var10001;
        this.i = Bool.from((int)((var1 | var2) & (~var1 | ~var2)));
        var2 = -1765552973;
        var1 = -1644542843;
        var10001 = var1 + var2 - 2 * (var1 & var2);
        var2 = 188319798;
        var1 = var10001;
        this.j = Bool.from((int)((var1 | var2) & (~var1 | ~var2)));
        var2 = 1958895284;
        var1 = 2140194508;
        var10001 = var1 & ~var2 | ~var1 & var2;
        var2 = 189962360;
        var1 = var10001;
        this.k = Bool.from((int)((var1 | var2) & ~(var1 & var2)));
        var2 = -771868800;
        var1 = -1424782948;
        var10001 = (var1 | var2) & ~(var1 & var2);
        var2 = 2062401052;
        var1 = var10001;
        this.l = Bool.from((int)((var1 | var2) & ~(var1 & var2)));
        var10001 = 1475690897;
        var2 = 317682187;
        var1 = var10001;
        var10001 = (var1 | var2) & ~(var1 & var2);
        var2 = 1159345050;
        var1 = var10001;
        this.g = Bool.from((int)(var1 & ~var2 | ~var1 & var2));
        this.f.d(0.0);
    }

    public void a(class_4587 var1, Renderer2D var2) {
        this.f.a();
        float var3 = (float)this.f.j();
        "".length();
        int var10002 = 253615226;
        int var8 = -2098673978;
        int var7 = var10002;
        var10002 = (var7 | var8) - (var7 & var8);
        var8 = -1913316692;
        var7 = var10002;
        var10002 = (var7 | var8) - (var7 & var8);
        "4".length();
        var8 = -1405691019;
        var7 = 796164684;
        var10002 = (var7 | var8) - (var7 & var8);
        var8 = -2092803784;
        var7 = var10002;
        var10002 = var7 + var8 - 2 * (var7 & var8);
        "%\ufffd\u001c7\ufffd\ufffd~\ufffd\ufffd%\ufffdK\ufffd\ufffd\ufffd\ufffdpa".length();
        var10002 = 604618079;
        var8 = 227637531;
        var7 = var10002;
        var10002 = (var7 | var8) & (~var7 | ~var8);
        var8 = 697877579;
        var7 = var10002;
        var10002 = var7 + var8 - 2 * (var7 & var8);
        if (var3 > 0.01f) {
            int var27;
            int var4 = (int)((float)MinecraftContext.d.method_4480() / 2.0f);
            int var5 = (int)((float)MinecraftContext.d.method_4507() / 2.0f);
            if (!this.l) {
                var8 = 1770684253;
                var7 = -458134690;
                var27 = (var7 | var8) - (var7 & var8);
                var8 = -1925508013;
                var7 = var27;
                var27 = var7 + var8 - 2 * (var7 & var8);
            } else {
                var8 = 1989778119;
                var7 = 1902124486;
                var27 = var7 + var8 - 2 * (var7 & var8);
                var8 = 133793687;
                var7 = var27;
                var27 = var7 & ~var8 | ~var7 & var8;
            }
            int var6 = var27;
            var2.a(0.0f, 0.0f, (float)var4, (float)var5, pulse.g.a((Color)pulse.g.ab, (int)((int)((float)var6 * var3))), var1);
        }
    }

    public float g() {
        return (float)this.f.j();
    }

    public static String a(String var0, String var1, int var2, int var3, int var4, int var5) {
        char[] var6 = var1.toCharArray();
        char[] var7 = new char[var6.length];
        int var10000 = -776145242;
        int var20 = -149990431;
        int var19 = var10000;
        var10000 = var19 & ~var20 | ~var19 & var20;
        var20 = 649307469;
        var19 = var10000;
        char[] var297 = new char[(var19 | var20) & (~var19 | ~var20)];
        int var10002 = 131126459;
        var20 = 1021242530;
        var19 = var10002;
        var10002 = var19 + var20 - 2 * (var19 & var20);
        var20 = 990787609;
        var19 = var10002;
        var10002 = var19 + var20 - 2 * (var19 & var20);
        var20 = 1838115981;
        var19 = -446878136;
        int var10003 = var19 + var20 - 2 * (var19 & var20);
        var20 = -1999500553;
        var19 = var10003;
        var297[var10002] = (char)((var19 | var20) & ~(var19 & var20));
        var20 = 704080533;
        var19 = 1830969947;
        var10002 = (var19 | var20) & ~(var19 & var20);
        var20 = 1154812111;
        var19 = var10002;
        var10002 = (var19 | var20) - (var19 & var20);
        var20 = -1488393003;
        var19 = 732566844;
        var10003 = var19 + var20 - 2 * (var19 & var20);
        var20 = -1931290004;
        var19 = var10003;
        var297[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
        var20 = -1541095968;
        var19 = -2147210297;
        var10002 = var19 & ~var20 | ~var19 & var20;
        var20 = 606115365;
        var19 = var10002;
        var10002 = var19 + var20 - 2 * (var19 & var20);
        var10003 = -36996711;
        var20 = 1653194608;
        var19 = var10003;
        var10003 = var19 + var20 - 2 * (var19 & var20);
        var20 = -1623005841;
        var19 = var10003;
        var297[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
        var10002 = -735858807;
        var20 = -791449742;
        var19 = var10002;
        var10002 = (var19 | var20) & (~var19 | ~var20);
        var20 = 82886904;
        var19 = var10002;
        var10002 = var19 & ~var20 | ~var19 & var20;
        var20 = 144992888;
        var19 = -102863132;
        var10003 = var19 & ~var20 | ~var19 & var20;
        var20 = 263553511;
        var19 = var10003;
        var10003 = ((var19 | var20) & ~(var19 & var20)) * ((var19 | var20) & ~(var19 & var20));
        var20 = -164684444;
        var19 = 1598406656;
        var10003 = (var19 | var20) - (var19 & var20);
        var20 = -1452653193;
        var19 = var10003;
        var297[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
        var10002 = 1628345530;
        var20 = -591091102;
        var19 = var10002;
        var10002 = (var19 | var20) - (var19 & var20);
        var20 = -1110819108;
        var19 = var10002;
        var10002 = var19 + var20 - 2 * (var19 & var20);
        "cE\ufffd\u0001\u051e\ufffd\ufffd\ufffd".length();
        int var10004 = -2056765536;
        var20 = 290850485;
        var19 = var10004;
        var10004 = (var19 | var20) - (var19 & var20);
        var20 = -1807861477;
        var19 = var10004;
        var10004 = (var19 | var20) & ~(var19 & var20);
        "\ufffd\u04a4\ufffd\u04b6u\ufffda\ufffd\ufffd\u001f\ufffdK\ufffd \u001f\ufffd".length();
        var10004 = -1830952499;
        var20 = 487622100;
        var19 = var10004;
        var10004 = var19 + var20 - 2 * (var19 & var20);
        var20 = -1882364897;
        var19 = var10004;
        var10004 = (var19 | var20) - (var19 & var20);
        "\u05a6I\"p\ufffd".length();
        var20 = 933111646;
        var19 = 1908586809;
        var10004 = (var19 | var20) & (~var19 | ~var20);
        var20 = 1180474989;
        var19 = var10004;
        var10004 = (var19 | var20) & ~(var19 & var20);
        "\ufffd".length();
        var10004 = -1519580239;
        var20 = -1199242956;
        var19 = var10004;
        var10004 = (var19 | var20) & (~var19 | ~var20);
        var20 = 501746313;
        var19 = var10004;
        var10004 = (var19 | var20) - (var19 & var20);
        var20 = -1825806896;
        var19 = -1323670912;
        var10003 = (var19 | var20) & ~(var19 & var20);
        var20 = 574002805;
        var19 = var10003;
        var297[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
        var20 = 2053195518;
        var19 = 38684238;
        var10002 = var19 & ~var20 | ~var19 & var20;
        var20 = 2016346293;
        var19 = var10002;
        var10002 = (var19 | var20) - (var19 & var20);
        var10003 = -1071424577;
        var20 = 338956478;
        var19 = var10003;
        var10003 = (var19 | var20) & (~var19 | ~var20);
        var20 = -736686461;
        var19 = var10003;
        var297[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
        var20 = -251677692;
        var19 = 1293349619;
        var10002 = var19 & ~var20 | ~var19 & var20;
        var20 = -1108785423;
        var19 = var10002;
        var10002 = var19 & ~var20 | ~var19 & var20;
        var10003 = -1381428891;
        var20 = 1808138983;
        var19 = var10003;
        var10003 = var19 + var20 - 2 * (var19 & var20);
        var20 = -965797231;
        var19 = var10003;
        var297[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
        var20 = -1805013188;
        var19 = -1056966725;
        var10002 = var19 & ~var20 | ~var19 & var20;
        var20 = 1419139200;
        var19 = var10002;
        var10002 = (var19 | var20) & ~(var19 & var20);
        var20 = -1646256643;
        var19 = 1658154242;
        var10003 = (var19 | var20) - (var19 & var20);
        var20 = -13286179;
        var19 = var10003;
        var297[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
        var20 = 1707423929;
        var19 = 1883842436;
        var10002 = var19 + var20 - 2 * (var19 & var20);
        var20 = 361504565;
        var19 = var10002;
        var10002 = (var19 | var20) & (~var19 | ~var20);
        var10003 = 2028093505;
        var20 = -274967701;
        var19 = var10003;
        var10003 = var19 & ~var20 | ~var19 & var20;
        var20 = -1753343111;
        var19 = var10003;
        var297[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
        var10002 = 731091637;
        var20 = 909710862;
        var19 = var10002;
        var10002 = (var19 | var20) & ~(var19 & var20);
        var20 = 497714354;
        var19 = var10002;
        var10002 = (var19 | var20) & (~var19 | ~var20);
        var20 = 835866726;
        var19 = -522383689;
        var10003 = (var19 | var20) & ~(var19 & var20);
        var20 = -787523083;
        var19 = var10003;
        var297[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
        char[] var8 = var297;
        var10000 = 1415276052;
        var20 = 710543927;
        var19 = var10000;
        var10000 = (var19 | var20) & (~var19 | ~var20);
        var20 = 2114022441;
        var19 = var10000;
        char[] var300 = new char[var19 + var20 - 2 * (var19 & var20)];
        var20 = 1684939438;
        var19 = -2068651144;
        var10002 = (var19 | var20) - (var19 & var20);
        var20 = -522403370;
        var19 = var10002;
        var10002 = (var19 | var20) - (var19 & var20);
        var20 = 1804120225;
        var19 = 708915743;
        var10003 = (var19 | var20) - (var19 & var20);
        var20 = 1103743646;
        var19 = var10003;
        var300[var10002] = (char)((var19 | var20) & ~(var19 & var20));
        var20 = 1818304332;
        var19 = -688717356;
        var10002 = (var19 | var20) & (~var19 | ~var20);
        var20 = -1164829031;
        var19 = var10002;
        var10002 = (var19 | var20) - (var19 & var20);
        var10003 = 1911841151;
        var20 = -591624704;
        var19 = var10003;
        var10003 = (var19 | var20) & (~var19 | ~var20);
        var20 = 523407907;
        var19 = var10003;
        var10003 = (var19 | var20) & (~var19 | ~var20);
        var20 = -1665097745;
        var19 = -2018698829;
        var10003 = var19 & ~var20 | ~var19 & var20;
        var20 = 460128863;
        var19 = var10003;
        var300[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
        var20 = -268161959;
        var19 = 880976436;
        var10002 = (var19 | var20) & (~var19 | ~var20);
        var20 = -997814673;
        var19 = var10002;
        var10002 = var19 & ~var20 | ~var19 & var20;
        var10003 = 1436985300;
        var20 = -1116237330;
        var19 = var10003;
        var10003 = (var19 | var20) - (var19 & var20);
        var20 = -949616983;
        var19 = var10003;
        var10003 = var19 & ~var20 | ~var19 & var20;
        var10004 = -1776812186;
        var20 = 1498857704;
        var19 = var10004;
        var10004 = var19 & ~var20 | ~var19 & var20;
        var20 = 2015706655;
        var19 = var10004;
        var20 = var19 & ~var20 | ~var19 & var20;
        var19 = var10003;
        var10003 = (var19 | var20) + (var19 & var20);
        var10003 = 170201940;
        var20 = 2133400912;
        var19 = var10003;
        var10003 = var19 + var20 - 2 * (var19 & var20);
        var20 = 1963755863;
        var19 = var10003;
        var300[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
        var20 = 665837665;
        var19 = 2024671935;
        var10002 = (var19 | var20) - (var19 & var20);
        var20 = 1593961181;
        var19 = var10002;
        var10002 = var19 & ~var20 | ~var19 & var20;
        var20 = 1230155925;
        var19 = 864842924;
        var10003 = (var19 | var20) & (~var19 | ~var20);
        var20 = 2061433915;
        var19 = var10003;
        var300[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
        var10002 = -77046683;
        var20 = -1426358724;
        var19 = var10002;
        var10002 = var19 + var20 - 2 * (var19 & var20);
        var20 = 1368597085;
        var19 = var10002;
        var10002 = (var19 | var20) & (~var19 | ~var20);
        var10003 = 1932599541;
        var20 = -1978693158;
        var19 = var10003;
        var10003 = (var19 | var20) & ~(var19 & var20);
        var20 = -113340049;
        var19 = var10003;
        var300[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
        var10002 = -1534830372;
        var20 = 1062870464;
        var19 = var10002;
        var10002 = var19 & ~var20 | ~var19 & var20;
        var20 = -1679932135;
        var19 = var10002;
        var10002 = (var19 | var20) & (~var19 | ~var20);
        var20 = -533931116;
        var19 = -1092073739;
        var10003 = (var19 | var20) & (~var19 | ~var20);
        var20 = 1589945845;
        var19 = var10003;
        var300[var10002] = (char)((var19 | var20) - (var19 & var20));
        var20 = 259986220;
        var19 = 1361866541;
        var10002 = (var19 | var20) & ~(var19 & var20);
        var20 = 1582529543;
        var19 = var10002;
        var10002 = var19 + var20 - 2 * (var19 & var20);
        "%&\ufffd\ufffd\ufffdw\u01dei\u0003\ufffd6\u078ei".length();
        var20 = -1615922735;
        var19 = -472050459;
        var10004 = var19 + var20 - 2 * (var19 & var20);
        var20 = 2087972151;
        var19 = var10004;
        var10004 = var19 + var20 - 2 * (var19 & var20);
        "\u0014N\ufffdO\ufffd\ufffd\ufffd".length();
        var20 = 2076160433;
        var19 = 465124493;
        var10004 = var19 + var20 - 2 * (var19 & var20);
        var20 = 1611042097;
        var19 = var10004;
        var10004 = (var19 | var20) - (var19 & var20);
        var10003 = 775547172;
        var20 = -148044510;
        var19 = var10003;
        var10003 = (var19 | var20) - (var19 & var20);
        var20 = -652973249;
        var19 = var10003;
        var300[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
        var20 = 1547609399;
        var19 = 515808641;
        var10002 = var19 + var20 - 2 * (var19 & var20);
        var20 = 1115699377;
        var19 = var10002;
        var10002 = (var19 | var20) & (~var19 | ~var20);
        var10003 = 2088808889;
        var20 = 1325864540;
        var19 = var10003;
        var10003 = (var19 | var20) & (~var19 | ~var20);
        var20 = 864532445;
        var19 = var10003;
        var300[var10002] = (char)((var19 | var20) - (var19 & var20));
        var10002 = -308859836;
        var20 = 2031486723;
        var19 = var10002;
        var10002 = var19 & ~var20 | ~var19 & var20;
        var20 = -1803474097;
        var19 = var10002;
        var10002 = var19 & ~var20 | ~var19 & var20;
        String var405 = "dsn";
        var10003 = 331934644;
        var20 = -1780586270;
        var19 = var10003;
        var10003 = var19 & ~var20 | ~var19 & var20;
        var20 = -2045378478;
        var19 = var10003;
        var300[var10002] = (char)((var19 | var20) & ~(var19 & var20));
        var20 = -813538762;
        var19 = -1295835103;
        var10002 = (var19 | var20) - (var19 & var20);
        var20 = 2101428766;
        var19 = var10002;
        var10002 = (var19 | var20) - (var19 & var20);
        var20 = 402565802;
        var19 = 1922704250;
        var10003 = var19 + var20 - 2 * (var19 & var20);
        var20 = 1701100259;
        var19 = var10003;
        var300[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
        char[] var9 = var300;
        var10000 = -1614770557;
        var20 = -1644549368;
        var19 = var10000;
        var10000 = (var19 | var20) & (~var19 | ~var20);
        var20 = 37397899;
        var19 = var10000;
        for (int var10 = (var19 | var20) - (var19 & var20); var10 < var6.length; ++var10) {
            char var367 = var6[var10];
            char var266 = var8[var10 % var8.length];
            char var130 = var367;
            var7[var10] = (char)((var130 | var266) & (~var130 | ~var266));
        }
        char[] var21 = new char[var7.length];
        var20 = 2118524915;
        var19 = 352755886;
        var10000 = var19 & ~var20 | ~var19 & var20;
        var20 = 1799405405;
        var19 = var10000;
        for (int var11 = (var19 | var20) & (var19 ^ 0xFFFFFFFF | var20 ^ 0xFFFFFFFF); var11 < var6.length; ++var11) {
            String var304 = "dso";
            var20 = -1837460135;
            var19 = -794316748;
            var10000 = (var19 | var20) & (~var19 | ~var20);
            var20 = 1361063668;
            var19 = var10000;
            int var18 = var19 & ~var20 | ~var19 & var20;
            var10000 = -535467330;
            var20 = -808883067;
            var19 = var10000;
            var10000 = var19 & ~var20 | ~var19 & var20;
            var20 = 2007451413;
            var19 = var10000;
            var10000 = (var19 | var20) & (~var19 | ~var20);
            int var10001 = 1999723064;
            var20 = -952768729;
            var19 = var10001;
            var10001 = var19 + var20 - 2 * (var19 & var20);
            var20 = 385804487;
            var19 = var10001;
            var20 = var19 & ~var20 | ~var19 & var20;
            var19 = var10000;
            var10000 = var19 - ~var20 - 1;
            var10000 = -286623690;
            var20 = 2060513482;
            var19 = var10000;
            var10000 = (var19 | var20) & (~var19 | ~var20);
            if (((var19 = var10000) & ~(var20 = -1775544018) | ~var19 & var20) >= var18) {
                var20 = -1703608756;
                var19 = 1231278931;
                var10000 = var19 & ~var20 | ~var19 & var20;
                var20 = -1590800837;
                var19 = var10000;
                var10000 = (var19 | var20) & (~var19 | ~var20);
                var20 = 418482438;
                var19 = 587735071;
                var10001 = (var19 | var20) & ~(var19 & var20);
                var20 = -252490743;
                var19 = var10001;
                var20 = (var19 | var20) & (~var19 | ~var20);
                var19 = var10000;
                var10000 = (var19 ^ var20) + 2 * (var19 & var20);
                var20 = 1399199815;
                var19 = -1584520395;
                var10000 = var19 & ~var20 | ~var19 & var20;
                var20 = -560273965;
                var19 = var10000;
                var18 = (var19 | var20) & (~var19 | ~var20);
            }
            char var368 = var7[var11];
            char var285 = var9[var11 % var9.length];
            char var149 = var368;
            var21[var11] = (char)((var149 | var285) & ~(var149 & var285));
        }
        String var22 = new String(var21);
        int var12 = var22.hashCode();
        var20 = var5;
        var19 = var3;
        var10000 = (var19 ^ var20) - 2 * (~var19 & var20);
        var20 = var2;
        var19 = var10000;
        int var13 = (var19 & ~var20) - (~var19 & var20);
        char[] var14 = var0.toCharArray();
        char[] var15 = new char[var14.length];
        var20 = -2051198697;
        var19 = 285954052;
        var10000 = var19 & ~var20 | ~var19 & var20;
        var20 = -1799986925;
        var19 = var10000;
        block6: for (int var16 = var19 & (var20 ^ 0xFFFFFFFF) | (var19 ^ 0xFFFFFFFF) & var20; var16 < var15.length; ++var16) {
            var20 = 770744836;
            var19 = 1653345708;
            int var320 = (var19 | var20) & (~var19 | ~var20);
            var20 = 1333571498;
            var19 = var320;
            switch (var16 % (var19 & ~var20 | ~var19 & var20)) {
                case 0: {
                    var20 = var12;
                    var19 = var13;
                    var10002 = var19 & ~var20 | ~var19 & var20;
                    char var295 = var14[var16];
                    var19 = var10002;
                    var15[var16] = (char)(var19 & ~var295 | ~var19 & var295);
                    continue block6;
                }
                case 1: {
                    var20 = var13;
                    var19 = var5;
                    var10002 = var19 + var20 - 2 * (var19 & var20);
                    char var293 = var14[var16];
                    var19 = var10002;
                    var15[var16] = (char)((var19 | var293) - (var19 & var293));
                }
            }
        }
        return new String(var15);
    }
}
