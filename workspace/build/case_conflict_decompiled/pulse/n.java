/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_4587
 *  pulse.AnimationState
 *  pulse.Bool
 *  pulse.Easing
 *  pulse.FontManager
 *  pulse.FontRenderer
 *  pulse.Renderer2D
 *  pulse.as
 *  pulse.client.MinecraftContext
 *  pulse.eC
 *  pulse.eC$Layer
 *  pulse.eD
 *  pulse.et
 *  pulse.g
 *  pulse.h
 *  pulse.i
 *  pulse.k
 */
package pulse;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_4587;
import pulse.AnimationState;
import pulse.Bool;
import pulse.Easing;
import pulse.FontManager;
import pulse.FontRenderer;
import pulse.Renderer2D;
import pulse.as;
import pulse.client.MinecraftContext;
import pulse.eC;
import pulse.eD;
import pulse.et;
import pulse.g;
import pulse.h;
import pulse.i;
import pulse.k;
import pulse.t;

public class n
implements i {
    private final h c;
    private final List<a> d;
    private static final float e = 12.0f;
    private static final float f = 22.0f;
    private static final float g = 6.0f;
    private static final float h = 6.0f;
    private static final long i = 150L;
    private Dock j = Dock.BOTTOM;
    private boolean k;
    private boolean l;
    private long m;
    private float n;
    private float o;
    private float p;
    private float q;
    private Dock r;
    private float s;
    private float t;
    private final AnimationState u;
    private final AnimationState v;
    private final AnimationState w;
    private final AnimationState x;
    private final AnimationState y;
    private float z;
    private float A;
    private float B;
    private float C;
    private boolean D;
    private int E;
    private int F;
    private Dock G;
    public static int a;
    public static boolean b;

    public n(h var1) {
        int var10 = -750551487;
        int var9 = 142906032;
        int var10001 = (var9 | var10) & (~var9 | ~var10);
        var10 = -607654671;
        var9 = var10001;
        this.k = Bool.from((int)((var9 | var10) - (var9 & var10)));
        var10001 = 1688067760;
        var10 = -327690032;
        var9 = var10001;
        var10001 = var9 + var10 - 2 * (var9 & var10);
        var10 = -1997928864;
        var9 = var10001;
        this.l = Bool.from((int)((var9 | var10) & ~(var9 & var10)));
        this.m = 0L;
        this.n = 0.0f;
        this.o = 0.0f;
        this.p = 0.0f;
        this.q = 0.0f;
        this.r = Dock.BOTTOM;
        this.s = 0.0f;
        this.t = 0.0f;
        this.u = new AnimationState();
        this.v = new AnimationState();
        this.w = new AnimationState();
        this.x = new AnimationState();
        this.y = new AnimationState();
        this.z = 0.0f;
        this.A = 0.0f;
        this.B = 0.0f;
        this.C = 0.0f;
        var10 = -1600648365;
        var9 = -968683734;
        var10001 = var9 & ~var10 | ~var9 & var10;
        var10 = 1725629561;
        var9 = var10001;
        this.D = Bool.from((int)(var9 & ~var10 | ~var9 & var10));
        var10001 = -783145321;
        var10 = 507913848;
        var9 = var10001;
        var10001 = (var9 | var10) & ~(var9 & var10);
        var10 = 820772624;
        var9 = var10001;
        this.E = (var9 | var10) & ~(var9 & var10);
        var10 = 1118412121;
        var9 = -1129436851;
        var10001 = var9 & ~var10 | ~var9 & var10;
        var10 = 33049579;
        var9 = var10001;
        this.F = var9 + var10 - 2 * (var9 & var10);
        this.G = null;
        this.c = var1;
        this.d = new ArrayList<a>();
        k var2 = var1.k();
        k[] var3 = pulse.k.values();
        int var4 = var3.length;
        var10 = 1400524986;
        var9 = -974147997;
        int var10000 = (var9 | var10) & (~var9 | ~var10);
        var10 = -1768554791;
        var9 = var10000;
        for (int var5 = var9 & (var10 ^ 0xFFFFFFFF) | (var9 ^ 0xFFFFFFFF) & var10; var5 < var4; ++var5) {
            k var6 = var3[var5];
            a var7 = new a(var6);
            if (var6 != var2) {
                var10 = -1203435095;
                var9 = 1835518258;
                var10000 = (var9 | var10) - (var9 & var10);
                var10 = -719142757;
                var9 = var10000;
                var10000 = (var9 | var10) - (var9 & var10);
            } else {
                var10 = 1621342664;
                var9 = -1286855514;
                var10000 = var9 & ~var10 | ~var9 & var10;
                var10 = -739271313;
                var9 = var10000;
                var10000 = var9 & ~var10 | ~var9 & var10;
            }
            int var8 = var10000;
            var7.a(Bool.from((int)var8));
            this.d.add(var7);
        }
        this.w.d(0.0);
    }

    public Dock a() {
        return this.j;
    }

    public void a(Dock var1) {
        if (this.j != var1) {
            this.j = var1;
            int var3 = 1722150316;
            int var2 = -2048702388;
            int var10001 = (var2 | var3) & ~(var2 & var3);
            var3 = -481909280;
            var2 = var10001;
            this.D = Bool.from((int)(var2 + var3 - 2 * (var2 & var3)));
            as.a().h();
        }
    }

    public boolean b() {
        return this.k;
    }

    public boolean c() {
        return this.l;
    }

    public boolean d() {
        int var42;
        if (!this.k && !this.l) {
            var42 = 1749169008;
            int var24 = 632978702;
            int var6 = var42;
            var42 = var6 + var24 - 2 * (var6 & var24);
            var24 = -357199952;
            var6 = var42;
            var42 = (var6 | var24) & ~(var6 & var24);
            int var10001 = -1616843888;
            var24 = 542503049;
            var6 = var10001;
            var10001 = (var6 | var24) - (var6 & var24);
            var24 = 741139321;
            var6 = var10001;
            var24 = var6 + var24 - 2 * (var6 & var24);
            var6 = var42;
            var42 = (var6 ^ var24) + 2 * (var6 & var24);
            var42 = 864558442;
            var24 = -653083430;
            var6 = var42;
            var42 = var6 & ~var24 | ~var6 & var24;
            var24 = -2140567754;
            var6 = var42;
            int var2 = (var6 | var24) & ~(var6 & var24);
            "<".length();
            var10001 = -2144331227;
            var24 = -1580013813;
            var6 = var10001;
            var10001 = (var6 | var24) & ~(var6 & var24);
            var24 = 568524079;
            var6 = var10001;
            var10001 = (var6 | var24) & (~var6 | ~var24);
            "\ufffd\ufffd0\ufffd\r\ufffd9\ufffd\ufffd\u0012".length();
            var24 = 2092522834;
            var6 = -1241379045;
            var10001 = (var6 | var24) - (var6 & var24);
            var24 = -893693364;
            var6 = var10001;
            var10001 = (var6 | var24) & ~(var6 & var24);
            "\ufffd\ufffd".length();
            var24 = -455244634;
            var6 = -1977931253;
            var10001 = (var6 | var24) & ~(var6 & var24);
            var24 = 1858514602;
            var6 = var10001;
            var10001 = var6 & ~var24 | ~var6 & var24;
            var24 = 714461928;
            var6 = 129982457;
            var42 = (var6 | var24) & (~var6 | ~var24);
            var24 = 1720587142;
            var6 = var42;
            if ((var6 & ~var24 | ~var6 & var24) >= var2) {
                throw new ExceptionInInitializerError();
            }
            var24 = -628818697;
            var6 = 2019662482;
            var42 = var6 & ~var24 | ~var6 & var24;
            var24 = -1562024347;
            var6 = var42;
            var42 = (var6 | var24) - (var6 & var24);
        } else {
            var42 = 363082291;
            int var4 = 1504066073;
            int var3 = var42;
            var42 = var3 + var4 - 2 * (var3 & var4);
            var4 = 1275201579;
            var3 = var42;
            var42 = var3 & ~var4 | ~var3 & var4;
        }
        return Bool.from((int)var42);
    }

    public void e() {
        if (!this.k) {
            if (a != a) {
                int var5 = -1623280988;
                int var4 = 1728205142;
                int var10000 = (var4 | var5) & ~(var4 & var5);
                var5 = -2034520261;
                var4 = var10000;
                var10000 = ((var4 | var5) & (~var4 | ~var5)) * ((var4 | var5) & (~var4 | ~var5));
                var10000 = -1555684234;
                var5 = -2043534286;
                var4 = var10000;
                var10000 = var4 & ~var5 | ~var4 & var5;
                var5 = 1142222329;
                var4 = var10000;
                int n2 = var4 + var5 - 2 * (var4 & var5);
            }
        } else {
            int var95;
            int var10001 = -2129922620;
            int var49 = 1885206980;
            int var11 = var10001;
            var10001 = (var11 | var49) - (var11 & var49);
            var49 = -246019072;
            var11 = var10001;
            this.k = Bool.from((int)((var11 | var49) & ~(var11 & var49)));
            eD.c();
            int var10002 = -474073298;
            var49 = 2033274279;
            var11 = var10002;
            var10002 = (var11 | var49) & (~var11 | ~var49);
            var49 = 896452144;
            var11 = var10002;
            var10002 = var11 + var49 - 2 * (var11 & var49);
            int var10003 = -1157739040;
            var49 = 2092449835;
            var11 = var10003;
            var10003 = var11 & ~var49 | ~var11 & var49;
            var49 = 1987534134;
            var11 = var10003;
            var49 = (var11 | var49) - (var11 & var49);
            var11 = var10002;
            var10002 = 2 * (var11 | var49) - (var11 ^ var49);
            this.x.a(0.0, 0.15, Easing.h);
            t var87 = pulse.t.a();
            var10001 = 522178344;
            var49 = -721155901;
            var11 = var10001;
            var10001 = var11 + var49 - 2 * (var11 & var49);
            var49 = -904149013;
            var11 = var10001;
            var87.b(Bool.from((int)(var11 & ~var49 | ~var11 & var49)));
            this.j = this.r;
            this.u.d((double)this.B);
            this.v.d((double)this.C);
            double var101 = this.s;
            var10002 = 994032589;
            var49 = -1870843865;
            var11 = var10002;
            var10002 = (var11 | var49) & ~(var11 & var49);
            var49 = 1862321079;
            var11 = var10002;
            var10002 = ((var11 | var49) & ~(var11 & var49)) * ((var11 | var49) & ~(var11 & var49));
            this.u.a(var101, 0.3, Easing.h);
            double var102 = this.t;
            var49 = 1283826844;
            var11 = 574485499;
            var10002 = (var11 | var49) & (~var11 | ~var49);
            var49 = -245430551;
            var11 = var10002;
            var10002 = (var11 | var49) & ~(var11 & var49);
            this.v.a(var102, 0.3, Easing.h);
            if (this.r == Dock.BOTTOM) {
                "\ufffdd.\ufffdiH\u0015\ufffdA\ufffdL\ufffd\u0007\ufffd".length();
                var49 = -936355973;
                var11 = 863952351;
                var10001 = (var11 | var49) & ~(var11 & var49);
                var49 = -78738773;
                var11 = var10001;
                var10001 = (var11 | var49) - (var11 & var49);
                "-?\ufffdT\ufffd\ufffd6\ufffd\ufffd\ufffd?z\ufffd\u0015".length();
                var10001 = 787136624;
                var49 = 1418352949;
                var11 = var10001;
                var10001 = (var11 | var49) & ~(var11 & var49);
                var49 = 2053151044;
                var11 = var10001;
                var10001 = var11 & ~var49 | ~var11 & var49;
                var49 = 34313726;
                var11 = 1715394043;
                int var88 = (var11 | var49) & ~(var11 & var49);
                var49 = 200234092;
                var11 = var88;
                int var6 = (var11 | var49) & ~(var11 & var49);
                String var89 = "cwy";
                int var90 = -1486217317;
                var49 = -1362347592;
                var11 = var90;
                int var91 = (var11 | var49) & ~(var11 & var49);
                var49 = 1479124124;
                var11 = var91;
                if ((var11 & ~var49 | ~var11 & var49) >= var6) {
                    "mp\u0019\ufffd".length();
                    var10001 = 247451552;
                    var49 = 485718764;
                    var11 = var10001;
                    var10001 = (var11 | var49) & (~var11 | ~var49);
                    var49 = 307017026;
                    var11 = var10001;
                    var10001 = (var11 | var49) - (var11 & var49);
                    "NN\ufffd\ufffd\ufffd\u0374\u001bk-/\u053f3\ufffd1\u001c".length();
                    var49 = 963324630;
                    var11 = 477657714;
                    var10001 = var11 & ~var49 | ~var11 & var49;
                    var49 = 622022823;
                    var11 = var10001;
                    var10001 = (var11 | var49) & ~(var11 & var49);
                    var49 = -1823098236;
                    var11 = 1380114845;
                    int var92 = (var11 | var49) & ~(var11 & var49);
                    var49 = -607439054;
                    var11 = var92;
                    var6 = (var11 | var49) - (var11 & var49);
                }
                int var93 = -1022198747;
                var49 = 902113479;
                var11 = var93;
                int var94 = (var11 | var49) & ~(var11 & var49);
                var49 = -153660190;
                var11 = var94;
                var95 = var11 & ~var49 | ~var11 & var49;
            } else {
                int var96 = -925042291;
                var49 = 1724780227;
                var11 = var96;
                int var97 = var11 + var49 - 2 * (var11 & var49);
                var49 = -1374488753;
                var11 = var97;
                var95 = (var11 | var49) - (var11 & var49);
            }
            int var1 = var95;
            double var113 = var1 == 0 ? 0.0 : 1.0;
            var49 = -841022391;
            var11 = 381583342;
            var10002 = var11 & ~var49 | ~var11 & var49;
            var49 = 240125241;
            var11 = var10002;
            var10002 = var11 & ~var49 | ~var11 & var49;
            this.w.a(var113, 0.3, Easing.h);
            this.G = null;
        }
        int var82 = -256703605;
        int var44 = -1939597904;
        int var114 = var44 + var82 - 2 * (var44 & var82);
        var82 = 2094470715;
        var44 = var114;
        this.l = Bool.from((int)((var44 | var82) & ~(var44 & var82)));
        this.m = 0L;
    }

    private float f() {
        int var2 = 470836849;
        int var1 = -1483402718;
        int var10000 = var1 & ~var2 | ~var1 & var2;
        var2 = -1939118813;
        var1 = var10000;
        var10000 = ((var1 | var2) - (var1 & var2)) * ((var1 | var2) - (var1 & var2));
        var2 = -1312457251;
        var1 = 403828330;
        int var10001 = (var1 | var2) - (var1 & var2);
        var2 = -1687675136;
        var1 = var10001;
        var10001 = (var1 | var2) & ~(var1 & var2);
        float var10 = 12.0f + 28.0f * (float)this.d.size();
        String var12 = "cwz";
        return var10 - 6.0f;
    }

    private float g() {
        int var2 = -1534947369;
        int var1 = 605709350;
        int var10000 = var1 & ~var2 | ~var1 & var2;
        var2 = 1738493811;
        var1 = var10000;
        var10000 = ((var1 | var2) & ~(var1 & var2)) * ((var1 | var2) & ~(var1 & var2));
        return 34.0f;
    }

    private float h() {
        "".length();
        int var10001 = -825553586;
        int var2 = -872710358;
        int var1 = var10001;
        var10001 = var1 & ~var2 | ~var1 & var2;
        var2 = 87061093;
        var1 = var10001;
        var10001 = (var1 | var2) - (var1 & var2);
        "".length();
        var2 = 1841407100;
        var1 = 2099242598;
        var10001 = var1 & ~var2 | ~var1 & var2;
        var2 = 283001352;
        var1 = var10001;
        var10001 = (var1 | var2) & (~var1 | ~var2);
        "\ufffd\u7533\ufffd\u0012\u0004\ufffd\u0013\ufffd\ufffd_\ufffd\ufffd\ufffdO\ufffd".length();
        var10001 = 100215467;
        var2 = 1976395111;
        var1 = var10001;
        var10001 = var1 + var2 - 2 * (var1 & var2);
        var2 = 1882476486;
        var1 = var10001;
        var10001 = (var1 | var2) & (~var1 | ~var2);
        return 34.0f;
    }

    private float i() {
        "\ufffd\ufffd\ufffd\u007f\u0017I1\r\ufffd\u0007\ufffdP\ufffdW1Qp\u0426".length();
        int var10001 = -2013559143;
        int var2 = 977390420;
        int var1 = var10001;
        var10001 = (var1 | var2) & (~var1 | ~var2);
        var2 = -1111863844;
        var1 = var10001;
        var10001 = var1 + var2 - 2 * (var1 & var2);
        "\u0019\f\u0095\ufffd\ufffd.\ufffd".length();
        var2 = 1414224220;
        var1 = -326960421;
        var10001 = (var1 | var2) & ~(var1 & var2);
        var2 = -1194744951;
        var1 = var10001;
        var10001 = var1 + var2 - 2 * (var1 & var2);
        "\ufffd\u0011".length();
        var2 = 8264196;
        var1 = -1026944527;
        var10001 = var1 & ~var2 | ~var1 & var2;
        var2 = -1028387843;
        var1 = var10001;
        var10001 = (var1 | var2) & ~(var1 & var2);
        String var23 = "cxa";
        float var10000 = 12.0f + 28.0f * (float)this.d.size();
        var10001 = 709615191;
        var2 = -1062184110;
        var1 = var10001;
        var10001 = var1 & ~var2 | ~var1 & var2;
        var2 = 675817423;
        var1 = var10001;
        var10001 = var1 & ~var2 | ~var1 & var2;
        return var10000 - 6.0f;
    }

    private float b(Dock var1) {
        return var1 != Dock.BOTTOM ? this.h() : this.f();
    }

    private float c(Dock var1) {
        if (var1 != Dock.BOTTOM) {
            int var3;
            int var5 = 770183242;
            int var4 = -8864180;
            int var10000 = var4 + var5 - 2 * (var4 & var5);
            var5 = 626243008;
            var4 = var10000;
            var10000 = (var4 | var5) & ~(var4 & var5);
            var5 = 50077871;
            var4 = -873430156;
            var10000 = (var4 | var5) - (var4 & var5);
            var5 = -869489626;
            var4 = var10000;
            a = var3 = (var4 | var5) & (~var4 | ~var5);
            "\ufffd\ufffd\ufffdsq\ufffd\u0001\ufffd\u0007\ufffd\ufffd\ufffd\ufffd+g".length();
            int var10001 = -827118233;
            var5 = 1677580493;
            var4 = var10001;
            var10001 = var4 + var5 - 2 * (var4 & var5);
            var5 = -1387334232;
            var4 = var10001;
            var10001 = (var4 | var5) - (var4 & var5);
            "\ufffdu\ufffd\ufffd\u07ads\ufffdBx\ufffd".length();
            var5 = 606574370;
            var4 = -173662630;
            var10001 = var4 & ~var5 | ~var4 & var5;
            var5 = -780039818;
            var4 = var10001;
            var10001 = (var4 | var5) & (~var4 | ~var5);
            "\ufffd\ufffdv0\ufffd\ufffd;".length();
            var5 = 385670613;
            var4 = 1414943131;
            var10001 = (var4 | var5) & ~(var4 & var5);
            var5 = 1118473287;
            var4 = var10001;
            var10001 = (var4 | var5) - (var4 & var5);
            "^\u0000\ufffd\ufffdf\ufffdQ".length();
            var5 = 1472897545;
            var4 = 758318212;
            var10001 = var4 & ~var5 | ~var4 & var5;
            var5 = 2063181445;
            var4 = var10001;
            var10001 = (var4 | var5) & (~var4 | ~var5);
            var5 = 116279935;
            var4 = -267530791;
            var10000 = (var4 | var5) - (var4 & var5);
            var5 = -259832740;
            var4 = var10000;
            if ((var4 | var5) - (var4 & var5) < a) {
                var10000 = -817863029;
                var5 = 1482157320;
                var4 = var10000;
                var10000 = var4 + var5 - 2 * (var4 & var5);
                var5 = -1439986047;
                var4 = var10000;
                var10000 = var4 & ~var5 | ~var4 & var5;
                var5 = 863636824;
                var4 = 1289830903;
                var10001 = (var4 | var5) & (~var4 | ~var5);
                var5 = -1192012311;
                var4 = var10001;
                var5 = var4 & ~var5 | ~var4 & var5;
                var4 = var10000;
                var10000 = var4 - ~var5 - 1;
                var10000 = 539719973;
                var5 = 1999548371;
                var4 = var10000;
                var10000 = var4 & ~var5 | ~var4 & var5;
                var5 = -755599921;
                var4 = var10000;
                a = var3 = (var4 | var5) & ~(var4 & var5);
            }
            return this.i();
        }
        return this.g();
    }

    private float j() {
        float var1 = (float)this.w.j();
        return this.f() + (this.h() - this.f()) * var1;
    }

    private float k() {
        float var1 = (float)this.w.j();
        return this.g() + (this.i() - this.g()) * var1;
    }

    private float a(float var1, Dock var2) {
        float var3 = pulse.h.d();
        float var4 = this.b(var2);
        switch (var2.ordinal()) {
            case 0: {
                return (int)(var1 + (var3 - var4) / 2.0f);
            }
            case 1: {
                float var19 = var1 - var4;
                int var23 = -550782394;
                int var17 = -1555149405;
                int var11 = var23;
                var23 = (var11 | var17) - (var11 & var17);
                var17 = -376309169;
                var11 = var23;
                var23 = ((var11 | var17) - (var11 & var17)) * ((var11 | var17) - (var11 & var17));
                return (int)(var19 - 12.0f);
            }
            case 2: {
                float var10000 = var1 + var3;
                int var10001 = -1024516910;
                int var6 = 1509230377;
                int var5 = var10001;
                var10001 = (var5 | var6) & ~(var5 & var6);
                var6 = 721546270;
                var5 = var10001;
                var10001 = (var5 | var6) - (var5 & var6);
                int var10002 = -590405357;
                var6 = -146034836;
                var5 = var10002;
                var10002 = var5 + var6 - 2 * (var5 & var6);
                var6 = -1542179443;
                var5 = var10002;
                var6 = (var5 | var6) & (~var5 | ~var6);
                var5 = var10001;
                var10001 = (var5 & ~var6) + (var6 & ~var5) + 2 * (var5 & var6);
                return (int)(var10000 + 12.0f);
            }
        }
        return var1;
    }

    private float b(float var1, Dock var2) {
        float var3 = pulse.h.e();
        float var4 = this.c(var2);
        switch (var2.ordinal()) {
            case 0: {
                float var10000 = var1 + var3;
                "\u0640'\ufffd".length();
                int var10002 = -1558012123;
                int var6 = -2046410036;
                int var5 = var10002;
                var10002 = var5 + var6 - 2 * (var5 & var6);
                var6 = 623173090;
                var5 = var10002;
                var10002 = var5 & ~var6 | ~var5 & var6;
                "\ufffdU\ufffd\ufffdP\u052f\u000b\u001c\ufffd\ufffd".length();
                var6 = -1957255058;
                var5 = -233052938;
                var10002 = (var5 | var6) & ~(var5 & var6);
                var6 = 2035109021;
                var5 = var10002;
                var10002 = var5 & ~var6 | ~var5 & var6;
                "5_\ufffd".length();
                var6 = 497129819;
                var5 = -138673618;
                var10002 = (var5 | var6) & ~(var5 & var6);
                var6 = -367158425;
                var5 = var10002;
                var10002 = (var5 | var6) - (var5 & var6);
                return (int)(var10000 + 12.0f);
            }
            case 1: 
            case 2: {
                return (int)(var1 + (var3 - var4) / 2.0f);
            }
        }
        return var1;
    }

    public void b(class_4587 var1, Renderer2D var2, float var3, float var4, int var5, int var6) {
        if (this.k) {
            this.x.a();
            float var7 = (float)this.x.j();
            this.a(var1, var2, var3, var4, var5, var6, var7);
        }
    }

    /*
     * Unable to fully structure code
     */
    public void a(class_4587 var1, Renderer2D var2, float var3, float var4, int var5, int var6) {
        block20: {
            var7 = MinecraftContext.d.method_4480();
            var8 = MinecraftContext.d.method_4507();
            if (!this.D) {
                this.B = this.a(var3, this.j);
                this.C = this.b(var4, this.j);
                this.u.d((double)this.B);
                this.v.d((double)this.C);
                this.w.d(this.j != Dock.BOTTOM ? 1.0 : 0.0);
                this.E = var7;
                this.F = var8;
                var10001 = -974549055;
                var32 = 204262135;
                var31 = var10001;
                var10001 = (var31 | var32) & (~var31 | ~var32);
                var32 = -909818569;
                var31 = var10001;
                this.D = Bool.from((int)(var31 + var32 - 2 * (var31 & var32)));
            }
            if (!(this.k || this.l || var7 == this.E && var8 == this.F)) {
                var9 = this.a(var3, this.j);
                var10 = this.b(var4, this.j);
                this.B = var9;
                this.C = var10;
                this.u.d((double)var9);
                this.v.d((double)var10);
                this.E = var7;
                this.F = var8;
            }
            if (this.l && !this.k) {
                var33 = System.currentTimeMillis() - this.m;
                var123 = -1258759014;
                var46 = 1468088641;
                var234 = (var46 | var123) & ~(var46 & var123);
                var123 = 567616934;
                var46 = var234;
                var234 = ((var46 | var123) & (~var46 | ~var123)) * ((var46 | var123) & (~var46 | ~var123));
                if (var33 >= 150L) {
                    this.a(var3, var4, this.n, this.o);
                }
            }
            if (!this.k) {
                this.u.a();
                this.v.a();
                this.w.a();
                this.B = (float)this.u.j();
                this.C = (float)this.v.j();
            }
            this.x.a();
            this.y.a();
            if (!this.k) {
                var34 = this.B;
                var35 = this.C;
            } else {
                var11 = this.j();
                var12 = this.k();
                var10000 = MinecraftContext.d.method_4480();
                "\ufffd)\ufffd^z\ufffdO\ufffd/".length();
                var125 = -1872004102;
                var48 = 1395980679;
                var10002 = var48 + var125 - 2 * (var48 & var125);
                var125 = -1017150868;
                var48 = var10002;
                var10002 = (var48 | var125) & (~var48 | ~var125);
                var13 = var10000 / 4.0f;
                var10000 = MinecraftContext.d.method_4507();
                var236 = 354168329;
                var125 = -1750500436;
                var48 = var236;
                var236 = var48 + var125 - 2 * (var48 & var125);
                var125 = 1399578153;
                var48 = var236;
                var236 = (var48 + var125 - 2 * (var48 & var125)) * (var48 + var125 - 2 * (var48 & var125));
                var14 = var10000 / 4.0f;
                var15 = (float)var5 - this.p;
                var16 = (float)var6 - this.q;
                var17 = Math.max(0.0f, Math.min(var15, var13 * 2.0f - var11));
                var18 = Math.max(0.0f, Math.min(var16, var14 * 2.0f - var12));
                var19 = (float)this.y.j();
                var34 = this.z + (var17 - this.z) * var19;
                var35 = this.A + (var18 - this.A) * var19;
            }
            var36 = this.j();
            var37 = this.k();
            eC.a().a(eC.Layer.CATEGORIES, var34, var35, var36, var37);
            if (!this.k) {
                var202 = -1321264647;
                var129 = -1876800543;
                var52 = var202;
                var202 = (var52 | var129) - (var52 & var129);
                var129 = 555569895;
                var52 = var202;
                var202 = (var52 | var129) - (var52 & var129);
            } else {
                var202 = -2025824965;
                var131 = 242929690;
                var54 = var202;
                var202 = var54 & ~var131 | ~var54 & var131;
                var131 = -1992651287;
                var54 = var202;
                var202 = var54 & ~var131 | ~var54 & var131;
            }
            var38 = var202;
            var249 = -1935371822;
            var133 = 278556701;
            var56 = var249;
            var249 = (var56 | var133) - (var56 & var133);
            var133 = -1548022882;
            var56 = var249;
            var249 = (var56 + var133 - 2 * (var56 & var133)) * (var56 + var133 - 2 * (var56 & var133));
            var239 = var34 - 0.5f;
            var10003 = "cxb";
            var252 = var35 - 0.5f;
            var269 = var36 + 1.0f;
            var10004 = var37 + 1.0f;
            var133 = -1201524082;
            var56 = 428575352;
            var10005 = var56 & ~var133 | ~var56 & var133;
            var133 = 56983079;
            var56 = var10005;
            var10005 = ((var56 | var133) & ~(var56 & var133)) * ((var56 | var133) & ~(var56 & var133));
            var2.a(var239, var252, var269, var10004, 9.5f, pulse.g.a((Color)pulse.g.q, (int)var38), pulse.g.a((Color)pulse.g.q, (int)var38), pulse.g.a((Color)pulse.g.r, (int)var38), pulse.g.a((Color)pulse.g.r, (int)var38), var1);
            "=\ufffd\ufffd\ufffdB\ufffd\u010c\ufffdo\r\ufffd\ufffdH".length();
            var10006 = -620830529;
            var133 = -120390494;
            var56 = var10006;
            var10006 = (var56 | var133) - (var56 & var133);
            var133 = 573316110;
            var56 = var10006;
            var10006 = var56 & ~var133 | ~var56 & var133;
            "\ufffd".length();
            var133 = -1011651611;
            var56 = 1030502045;
            var10006 = var56 & ~var133 | ~var56 & var133;
            var133 = -18915973;
            var56 = var10006;
            var10006 = (var56 | var133) & (~var56 | ~var133);
            "}%Q\ufffd\ufffd".length();
            var10006 = 682061858;
            var133 = 1197761956;
            var56 = var10006;
            var10006 = (var56 | var133) & (~var56 | ~var133);
            var133 = 1875056015;
            var56 = var10006;
            var10006 = var56 + var133 - 2 * (var56 & var133);
            var2.a(var34, var35, var36, var37, 9.5f, pulse.g.a((Color)pulse.g.f, (int)var38), pulse.g.a((Color)pulse.g.f, (int)var38), pulse.g.a((Color)pulse.g.e, (int)var38), pulse.g.a((Color)pulse.g.e, (int)var38), var1);
            var39 = this.c.k();
            var202 = -502814366;
            var133 = -519693150;
            var56 = var202;
            var202 = var56 + var133 - 2 * (var56 & var133);
            var133 = 50443712;
            var56 = var202;
            var40 = (var56 | var133) & ~(var56 & var133);
            var41 = (float)this.w.j();
            var42 = pulse.t.a().b();
            if (this.k) ** GOTO lbl-1000
            if (!this.l) break block20;
            if (pulse.n.a != pulse.n.a) {
                throw new ExceptionInInitializerError();
            }
            ** GOTO lbl-1000
        }
        if (eD.a((eC.Layer)eC.Layer.CATEGORIES, (double)var5, (double)var6) && !var42) {
            var133 = -258537256;
            var56 = 167845199;
            var202 = (var56 | var133) & ~(var56 & var133);
            var133 = -90827369;
            var56 = var202;
            var202 = (var56 | var133) - (var56 & var133);
        } else lbl-1000:
        // 3 sources

        {
            var202 = -67310667;
            var133 = 567579305;
            var56 = var202;
            var202 = (var56 | var133) & (~var56 | ~var133);
            var133 = -634881763;
            var56 = var202;
            var202 = var56 + var133 - 2 * (var56 & var133);
        }
        var43 = var202;
        var202 = 1161369675;
        var149 = 573743107;
        var72 = var202;
        var202 = (var72 | var149) & ~(var72 & var149);
        var149 = 1728821320;
        var72 = var202;
        for (var44 = var72 & (var149 ^ -1) | (var72 ^ -1) & var149; var44 < this.d.size(); ++var44) {
            block21: {
                var20 = this.d.get(var44);
                var149 = 1399667426;
                var72 = -1357751115;
                var240 = (var72 | var149) & (~var72 | ~var149);
                var149 = -1206020828;
                var72 = var240;
                var240 = (var72 | var149) & ~(var72 & var149);
                var253 = 499325034;
                var149 = -602339292;
                var72 = var253;
                var253 = var72 + var149 - 2 * (var72 & var149);
                var149 = -929020926;
                var72 = var253;
                var149 = (var72 | var149) & ~(var72 & var149);
                var72 = var240;
                var240 = (var72 & ~var149) + (var149 & ~var72) + 2 * (var72 & var149);
                var213 = var34 + 6.0f;
                var243 = var44;
                "G\ufffd\ufffd\t8".length();
                var270 = 528599311;
                var149 = 1150655302;
                var72 = var270;
                var270 = var72 + var149 - 2 * (var72 & var149);
                var149 = 1528058434;
                var72 = var270;
                var270 = (var72 | var149) - (var72 & var149);
                "\u0005#\ufffdD\ufffd\ufffdC\ufffd\u0012".length();
                var149 = 829386941;
                var72 = 1686458297;
                var270 = var72 + var149 - 2 * (var72 & var149);
                var149 = 1441414917;
                var72 = var270;
                var270 = (var72 | var149) & ~(var72 & var149);
                "\ufffd".length();
                var149 = 1949876855;
                var72 = 662216302;
                var270 = (var72 | var149) & (~var72 | ~var149);
                var149 = 1396726804;
                var72 = var270;
                var270 = (var72 | var149) - (var72 & var149);
                "4\ufffd\ufffd5?".length();
                var149 = 534780948;
                var72 = 1960201093;
                var270 = var72 & ~var149 | ~var72 & var149;
                var149 = 1798723456;
                var72 = var270;
                var270 = (var72 | var149) & ~(var72 & var149);
                var21 = var213 + var243 * 28.0f;
                var244 = "cxc";
                var22 = var35 + 6.0f;
                "\ufffdo".length();
                var253 = 961652886;
                var149 = 2049197058;
                var72 = var253;
                var253 = (var72 | var149) & (~var72 | ~var149);
                var149 = 1131801734;
                var72 = var253;
                var253 = var72 & ~var149 | ~var72 & var149;
                "".length();
                var149 = -552756064;
                var72 = 844562566;
                var253 = var72 & ~var149 | ~var72 & var149;
                var149 = -312828887;
                var72 = var253;
                var253 = (var72 | var149) & ~(var72 & var149);
                "S\ufffd-Ywl\u001d\ufffd\ufffd;\ufffd".length();
                var253 = 564066368;
                var149 = 1654309790;
                var72 = var253;
                var253 = var72 & ~var149 | ~var72 & var149;
                var149 = 1124350932;
                var72 = var253;
                var253 = (var72 | var149) - (var72 & var149);
                var23 = var34 + 6.0f;
                "\ufffd\ufffd\ufffd6\ueb5b\ufffdMghu\ufffdk\ufffd#".length();
                var253 = -2075641992;
                var149 = 1525404249;
                var72 = var253;
                var253 = (var72 | var149) & (~var72 | ~var149);
                var149 = -559684308;
                var72 = var253;
                var253 = (var72 | var149) - (var72 & var149);
                var214 = var35 + 6.0f;
                var245 = var44;
                "$R\ufffd\ufffdV\ufffd\ufffd\ufffd:".length();
                var149 = 118850688;
                var72 = -1346533733;
                var270 = (var72 | var149) - (var72 & var149);
                var149 = -1465384425;
                var72 = var270;
                var270 = (var72 | var149) & ~(var72 & var149);
                "^\u0013\ufffd0\ufffd\ufffd\ufffd".length();
                var270 = -975824022;
                var149 = 980374581;
                var72 = var270;
                var270 = var72 + var149 - 2 * (var72 & var149);
                var149 = -4632740;
                var72 = var270;
                var270 = (var72 | var149) - (var72 & var149);
                ".uA\ufffd9\ufffdM\ufffd\"".length();
                var270 = 1825887575;
                var149 = -1530778769;
                var72 = var270;
                var270 = var72 & ~var149 | ~var72 & var149;
                var149 = -938017226;
                var72 = var270;
                var270 = (var72 | var149) & (~var72 | ~var149);
                var24 = var214 + var245 * 28.0f;
                var25 = var21 + (var23 - var21) * var41;
                var26 = var22 + (var24 - var22) * var41;
                if (var20.a() != var39) {
                    var149 = -2046375786;
                    var72 = -1250262485;
                    var202 = var72 & ~var149 | ~var72 & var149;
                    var149 = 863783613;
                    var72 = var202;
                    var202 = (var72 | var149) - (var72 & var149);
                } else {
                    var202 = 661034129;
                    var149 = 1732190012;
                    var72 = var202;
                    var202 = (var72 | var149) & (~var72 | ~var149);
                    var149 = 1079610284;
                    var72 = var202;
                    var202 = (var72 | var149) & (~var72 | ~var149);
                }
                var27 = var202;
                var20.b(Bool.from((int)var27));
                if (var43 == 0) break block21;
                var219 = "cxd";
                var149 = -669654302;
                var72 = 1949441524;
                var202 = (var72 | var149) & (~var72 | ~var149);
                var149 = -1939789769;
                var72 = var202;
                pulse.n.a = var30 = (var72 | var149) & (~var72 | ~var149);
                var202 = -1997536132;
                var149 = -1242758842;
                var72 = var202;
                var202 = (var72 | var149) - (var72 & var149);
                var149 = 1355914911;
                var72 = var202;
                var202 = var72 + var149 - 2 * (var72 & var149);
                var240 = -1259377304;
                var149 = 1050971555;
                var72 = var240;
                var240 = (var72 | var149) & ~(var72 & var149);
                var149 = 374486114;
                var72 = var240;
                var149 = (var72 | var149) - (var72 & var149);
                var72 = var202;
                var202 = (var72 | var149) + (var72 & var149);
                var202 = -349662307;
                var149 = -1349295528;
                var72 = var202;
                var202 = var72 & ~var149 | ~var72 & var149;
                if ((((var72 = var202) | (var149 = 1071479099)) & ~(var72 & var149)) < pulse.n.a) {
                    throw new ExceptionInInitializerError();
                }
                ** GOTO lbl-1000
            }
            var253 = -690635052;
            var149 = -266647493;
            var72 = var253;
            var253 = (var72 | var149) & (~var72 | ~var149);
            var149 = -1663019732;
            var72 = var253;
            var253 = ((var72 | var149) & (~var72 | ~var149)) * ((var72 | var149) & (~var72 | ~var149));
            var287 = "cxe";
            if (eD.a((float)var25, (float)var26, (float)22.0f, (float)22.0f, (double)var5, (double)var6)) {
                var202 = -1939638995;
                var149 = -972986551;
                var72 = var202;
                var202 = (var72 | var149) & ~(var72 & var149);
                var149 = 1247941221;
                var72 = var202;
                var202 = var72 + var149 - 2 * (var72 & var149);
            } else lbl-1000:
            // 2 sources

            {
                var149 = 757016365;
                var72 = -580265850;
                var202 = (var72 | var149) - (var72 & var149);
                var149 = -260636757;
                var72 = var202;
                var202 = (var72 | var149) - (var72 & var149);
            }
            var28 = var202;
            if (var28 != 0 && var27 == 0) {
                var202 = -95129963;
                var149 = -825679445;
                var72 = var202;
                var202 = (var72 | var149) - (var72 & var149);
                var149 = 882724671;
                var72 = var202;
                var40 = var72 & ~var149 | ~var72 & var149;
            }
            var20.a(var1, var2, var25, var26, Bool.from((int)var28), Bool.from((int)var43));
        }
        if (var40 != 0 && var43 == 0) {
            eD.g();
        }
    }

    private void a(class_4587 var1, Renderer2D var2, float var3, float var4, int var5, int var6, float var7) {
        this.G = null;
        Dock[] var8 = Dock.values();
        int var9 = var8.length;
        int var22 = -1952528601;
        int var21 = -510604648;
        int var10000 = (var21 | var22) & (~var21 | ~var22);
        var22 = 1779305919;
        var21 = var10000;
        for (int var10 = var21 + var22 - 2 * (var21 & var22); var10 < var9; ++var10) {
            int var23;
            Dock var11 = var8[var10];
            if (var11 != this.j) {
                var22 = 2002269158;
                var21 = 60162957;
                var10000 = (var21 | var22) & ~(var21 & var22);
                var22 = -571005860;
                var21 = var10000;
                var10000 = var21 + var22 - 2 * (var21 & var22);
                var22 = -1287188057;
                var21 = -949505499;
                int var10001 = var21 + var22 - 2 * (var21 & var22);
                var22 = -1511114591;
                var21 = var10001;
                var22 = (var21 | var22) & ~(var21 & var22);
                var21 = var10000;
                var10000 = (var21 | var22) + (var21 & var22);
                var10000 = -275519558;
                var22 = -1901769822;
                var21 = var10000;
                var10000 = (var21 | var22) & ~(var21 & var22);
                var22 = 142743147;
                var21 = var10000;
                int var20 = (var21 | var22) & (~var21 | ~var22);
                var10000 = -423545048;
                var22 = 605743752;
                var21 = var10000;
                var10000 = (var21 | var22) & (~var21 | ~var22);
                var22 = 1314479899;
                var21 = var10000;
                var10000 = var21 + var22 - 2 * (var21 & var22);
                var10001 = -950329848;
                var22 = -819174476;
                var21 = var10001;
                var10001 = var21 & ~var22 | ~var21 & var22;
                var22 = 1811013734;
                var21 = var10001;
                var22 = var21 + var22 - 2 * (var21 & var22);
                var21 = var10000;
                var10000 = var21 - ~var22 - 1;
                var22 = -279775666;
                var21 = -138623614;
                var10000 = (var21 | var22) & (~var21 | ~var22);
                if ((((var21 = var10000) | (var22 = 1008827292)) & (~var21 | ~var22)) >= var20) {
                    throw new IllegalAccessError();
                }
                float var12 = this.a(var3, var11) - 2.0f;
                float var13 = this.b(var4, var11) - 2.0f;
                float var14 = this.b(var11);
                float var15 = this.c(var11);
                var22 = 1264967473;
                var21 = 509870139;
                var10001 = var21 + var22 - 2 * (var21 & var22);
                var22 = 1379912228;
                var21 = var10001;
                var10001 = (var21 | var22) - (var21 & var22);
                int var10002 = 1896356538;
                var22 = 1233208269;
                var21 = var10002;
                var10002 = var21 & ~var22 | ~var21 & var22;
                var22 = 2021453022;
                var21 = var10002;
                var22 = (var21 | var22) & (~var21 | ~var22);
                var21 = var10001;
                var10001 = (var21 ^ var22) + 2 * (var21 & var22);
                float var114 = var12 - 15.0f;
                String var131 = "cxf";
                float var129 = var13 - 15.0f;
                var22 = -2033012115;
                var21 = -938681636;
                int var10003 = (var21 | var22) & ~(var21 & var22);
                var22 = -1603058639;
                var21 = var10003;
                var10003 = (var21 | var22) & (~var21 | ~var22);
                float var132 = var14 + 30.0f;
                var22 = -1674785090;
                var21 = 1598004935;
                int var10004 = (var21 | var22) & (~var21 | ~var22);
                var22 = 1045125910;
                var21 = var10004;
                var10004 = (var21 | var22) & (~var21 | ~var22);
                var22 = -816794462;
                var21 = 825387543;
                int var10005 = (var21 | var22) - (var21 & var22);
                var22 = 53791346;
                var21 = var10005;
                var22 = var21 + var22 - 2 * (var21 & var22);
                var21 = var10004;
                var10004 = (var21 | var22) + (var21 & var22);
                boolean var16 = eD.a((float)var114, (float)var129, (float)var132, (float)(var15 + 30.0f), (double)var5, (double)var6);
                if (var16) {
                    this.G = var11;
                }
                if (!var16) {
                    var10000 = -1658465481;
                    var22 = -1167711966;
                    var21 = var10000;
                    var10000 = var21 + var22 - 2 * (var21 & var22);
                    var22 = 658764300;
                    var21 = var10000;
                    var10000 = (var21 | var22) & (~var21 | ~var22);
                } else {
                    var22 = 2002678489;
                    var21 = 1965783142;
                    var10000 = (var21 | var22) - (var21 & var22);
                    var22 = 41224845;
                    var21 = var10000;
                    var10000 = (var21 | var22) & ~(var21 & var22);
                }
                int var17 = var10000;
                Color var18 = pulse.g.a((Color)pulse.g.aa, (int)((int)((float)var17 * var7)));
                var10005 = -1602111413;
                var22 = 49455323;
                var21 = var10005;
                var10005 = (var21 | var22) - (var21 & var22);
                var22 = 1056604512;
                var21 = var10005;
                var10005 = var21 & ~var22 | ~var21 & var22;
                int var10006 = -1099708770;
                var22 = -622562271;
                var21 = var10006;
                var10006 = var21 & ~var22 | ~var21 & var22;
                var22 = 561239782;
                var21 = var10006;
                var22 = var21 & ~var22 | ~var21 & var22;
                var21 = var10005;
                var10005 = 2 * (var21 | var22) - (var21 ^ var22);
                var2.a(var12, var13, var14, var15, 9.5f, var18, var1);
                continue;
            }
            if (a == a) continue;
            var10000 = 1176264960;
            var22 = 1140405284;
            var21 = var10000;
            var10000 = (var21 | var22) & (~var21 | ~var22);
            var22 = -765587017;
            var21 = var10000;
            var10000 = ((var21 | var22) & ~(var21 & var22)) * ((var21 | var22) & ~(var21 & var22));
            var10000 = 175411459;
            var22 = -181761290;
            var21 = var10000;
            var10000 = (var21 | var22) & (~var21 | ~var22);
            var22 = -340354065;
            var21 = var10000;
            a = var23 = (var21 | var22) - (var21 & var22);
            if (a == a) continue;
            throw new ExceptionInInitializerError();
        }
    }

    public void a(float var1, float var2, int var3, int var4) {
        float var8;
        float var7;
        float var6;
        float var5;
        if (!this.k && !this.l && eD.a((eC.Layer)eC.Layer.CATEGORIES, (double)var3, (double)var4) && !pulse.t.a().b() && eD.a((float)(var5 = this.B), (float)(var6 = this.C), (float)(var7 = this.j()), (float)(var8 = this.k()), (double)var3, (double)var4)) {
            int var20 = 773242374;
            int var19 = -1304119732;
            int var10000 = (var19 | var20) & ~(var19 & var20);
            var20 = -1672345526;
            var19 = var10000;
            int var9 = var19 + var20 - 2 * (var19 & var20);
            float var10 = (float)this.w.j();
            var10000 = -1146078854;
            var20 = -1366788524;
            var19 = var10000;
            var10000 = var19 + var20 - 2 * (var19 & var20);
            var20 = 356011822;
            var19 = var10000;
            for (int var11 = var19 & (var20 ^ 0xFFFFFFFF) | (var19 ^ 0xFFFFFFFF) & var20; var11 < this.d.size(); ++var11) {
                a var12 = this.d.get(var11);
                var20 = 1475249794;
                var19 = 325136502;
                int var10001 = (var19 | var20) & (~var19 | ~var20);
                var20 = 1155958294;
                var19 = var10001;
                var10001 = (var19 | var20) & ~(var19 & var20);
                float var107 = var5 + 6.0f;
                float var112 = var11;
                "\ufffdXr\ufffd<\ufffd\u0004+\u04a4\u001f9".length();
                int var10003 = 613179992;
                var20 = -2100656767;
                var19 = var10003;
                var10003 = (var19 | var20) & ~(var19 & var20);
                var20 = -1505302564;
                var19 = var10003;
                var10003 = var19 + var20 - 2 * (var19 & var20);
                "xp|\u0017\ufffd\ufffdd\ufffd\u0007\u0015:\ufffd\ufffd;".length();
                var10003 = -1996973554;
                var20 = -2121065458;
                var19 = var10003;
                var10003 = (var19 | var20) & ~(var19 & var20);
                var20 = 158041607;
                var19 = var10003;
                var10003 = (var19 | var20) - (var19 & var20);
                "\ufffdW\u0456\ufffd".length();
                var20 = 816512997;
                var19 = 487830130;
                var10003 = var19 & ~var20 | ~var19 & var20;
                var20 = 767118737;
                var19 = var10003;
                var10003 = (var19 | var20) - (var19 & var20);
                "\ufffd/\ufffd(\ufffd*\u0015\ufffdZ!\ufffd}\ufffdTZv".length();
                var20 = 1996594111;
                var19 = -159415002;
                var10003 = (var19 | var20) & (~var19 | ~var20);
                var20 = -2122441058;
                var19 = var10003;
                var10003 = (var19 | var20) & ~(var19 & var20);
                float var13 = var107 + var112 * 28.0f;
                var20 = 1857425392;
                var19 = -1968720095;
                var10001 = var19 & ~var20 | ~var19 & var20;
                var20 = -366460063;
                var19 = var10001;
                var10001 = var19 + var20 - 2 * (var19 & var20);
                var20 = -1177754360;
                var19 = 826081550;
                int var10002 = (var19 | var20) - (var19 & var20);
                var20 = 441668569;
                var19 = var10002;
                var20 = (var19 | var20) & (~var19 | ~var20);
                var19 = var10001;
                var10001 = (var19 & ~var20) + (var20 & ~var19) + 2 * (var19 & var20);
                float var14 = var6 + 6.0f;
                var20 = 1233385948;
                var19 = -1781793037;
                var10001 = var19 & ~var20 | ~var19 & var20;
                var20 = 1831061870;
                var19 = var10001;
                var10001 = (var19 | var20) & ~(var19 & var20);
                float var15 = var5 + 6.0f;
                var20 = 292666622;
                var19 = 1490608933;
                var10001 = (var19 | var20) & (~var19 | ~var20);
                var20 = 2146507688;
                var19 = var10001;
                var10001 = (var19 | var20) & (~var19 | ~var20);
                var20 = 1781476883;
                var19 = -1533847973;
                var10002 = (var19 | var20) & ~(var19 & var20);
                var20 = 1224383727;
                var19 = var10002;
                var20 = var19 + var20 - 2 * (var19 & var20);
                var19 = var10001;
                var10001 = (var19 | var20) + (var19 & var20);
                float var108 = var6 + 6.0f;
                float var121 = var11;
                "\ufffdl \ufffdf\f&1[\ufffd\ufffd[\ufffdr".length();
                var10003 = 891469744;
                var20 = 1891079692;
                var19 = var10003;
                var10003 = (var19 | var20) & (~var19 | ~var20);
                var20 = 1167403444;
                var19 = var10003;
                var10003 = (var19 | var20) - (var19 & var20);
                "\ufffd\ufffd\ufffd".length();
                var10003 = -1872050042;
                var20 = -527179771;
                var19 = var10003;
                var10003 = var19 + var20 - 2 * (var19 & var20);
                var20 = 1895377024;
                var19 = var10003;
                var10003 = (var19 | var20) & (~var19 | ~var20);
                "tX)/\ufffd\u0010\ufffd\ufffd\u001a\ufffdK\ufffd\ufffdA\ufffd\ufffd\ufffd".length();
                var10003 = 532687442;
                var20 = -701426404;
                var19 = var10003;
                var10003 = (var19 | var20) & ~(var19 & var20);
                var20 = -906936500;
                var19 = var10003;
                var10003 = (var19 | var20) & ~(var19 & var20);
                float var16 = var108 + var121 * 28.0f;
                float var17 = var13 + (var15 - var13) * var10;
                float var18 = var14 + (var16 - var14) * var10;
                var20 = 108128625;
                var19 = -612084407;
                var10002 = (var19 | var20) & (~var19 | ~var20);
                var20 = -1469318339;
                var19 = var10002;
                var10002 = var19 + var20 - 2 * (var19 & var20);
                var20 = -1820171602;
                var19 = 1094355270;
                var10003 = (var19 | var20) & ~(var19 & var20);
                var20 = -611011246;
                var19 = var10003;
                var20 = (var19 | var20) & (~var19 | ~var20);
                var19 = var10002;
                var10002 = (var19 ^ var20) + 2 * (var19 & var20);
                var20 = -704968354;
                var19 = 383443909;
                var10003 = (var19 | var20) - (var19 & var20);
                var20 = 1034375975;
                var19 = var10003;
                var10003 = var19 & ~var20 | ~var19 & var20;
                if (!eD.a((float)var17, (float)var18, (float)22.0f, (float)22.0f, (double)var3, (double)var4)) continue;
                this.c.a(var12.a());
                var10000 = -666439768;
                var20 = -1917327026;
                var19 = var10000;
                var10000 = var19 & ~var20 | ~var19 & var20;
                var20 = 1441859303;
                var19 = var10000;
                var9 = var19 & ~var20 | ~var19 & var20;
                break;
            }
            if (var9 == 0) {
                int var122 = -1772856299;
                var20 = -1160893663;
                var19 = var122;
                var122 = (var19 | var20) - (var19 & var20);
                var20 = 748320565;
                var19 = var122;
                this.l = Bool.from((int)((var19 | var20) & ~(var19 & var20)));
                this.m = System.currentTimeMillis();
                this.n = var3;
                this.o = var4;
                this.p = (float)var3 - var5;
                this.q = (float)var4 - var6;
                this.r = this.j;
                this.s = this.B;
                this.t = this.C;
            }
        }
    }

    private void a(float var1, float var2, float var3, float var4) {
        int var8 = -1025269706;
        int var7 = -1168253736;
        int var10001 = (var7 | var8) & (~var7 | ~var8);
        var8 = 2025749742;
        var7 = var10001;
        this.l = Bool.from((int)(var7 + var8 - 2 * (var7 & var8)));
        var8 = -1473453628;
        var7 = 1797179617;
        var10001 = (var7 | var8) & (~var7 | ~var8);
        var8 = -1020122844;
        var7 = var10001;
        this.k = Bool.from((int)((var7 | var8) - (var7 & var8)));
        eD.b();
        this.z = this.B;
        this.A = this.C;
        float var5 = this.j();
        float var6 = this.k();
        this.p = var5 / 2.0f;
        this.q = var6 / 2.0f;
        this.y.d(0.0);
        int var10002 = -637410918;
        var8 = -1310358941;
        var7 = var10002;
        var10002 = (var7 | var8) & (~var7 | ~var8);
        var8 = 128698488;
        var7 = var10002;
        var10002 = var7 + var8 - 2 * (var7 & var8);
        var8 = 115806154;
        var7 = -1502084599;
        int var10003 = (var7 | var8) - (var7 & var8);
        var8 = -429939228;
        var7 = var10003;
        var8 = var7 + var8 - 2 * (var7 & var8);
        var7 = var10002;
        var10002 = (var7 | var8) + (var7 & var8);
        this.y.a(1.0, 0.2, Easing.h);
        var8 = -1691302187;
        var7 = -1524310000;
        var10002 = (var7 | var8) & ~(var7 & var8);
        var8 = -649498736;
        var7 = var10002;
        var10002 = ((var7 | var8) & ~(var7 & var8)) * ((var7 | var8) & ~(var7 & var8));
        this.x.a(1.0, 0.2, Easing.h);
        t var10000 = pulse.t.a();
        var10001 = 1476030272;
        var8 = 560120342;
        var7 = var10001;
        var10001 = (var7 | var8) - (var7 & var8);
        var8 = 1989717335;
        var7 = var10001;
        var10000.b(Bool.from((int)(var7 & ~var8 | ~var7 & var8)));
    }

    public void c(float var1, float var2, int var3, int var4) {
        if (this.l && !this.k) {
            int var70 = 775403094;
            int var46 = 1435043001;
            int var92 = var46 + var70 - 2 * (var46 & var70);
            var70 = 2076095215;
            var46 = var92;
            this.l = Bool.from((int)((var46 | var70) - (var46 & var70)));
            this.m = 0L;
        } else if (this.k) {
            int var81;
            int var76;
            int var23 = 1051554269;
            int var22 = 919694332;
            int var10001 = (var22 | var23) & ~(var22 & var23);
            var23 = 142350881;
            var22 = var10001;
            this.k = Bool.from((int)(var22 & ~var23 | ~var22 & var23));
            eD.c();
            var23 = 1460909768;
            var22 = 1148137599;
            int var10002 = (var22 | var23) - (var22 & var23);
            var23 = 944589354;
            var22 = var10002;
            var10002 = (var22 | var23) - (var22 & var23);
            this.x.a(0.0, 0.15, Easing.h);
            t var10000 = pulse.t.a();
            var10001 = -1299300008;
            var23 = -1121759916;
            var22 = var10001;
            var10001 = (var22 | var23) & (~var22 | ~var23);
            var23 = 262999052;
            var22 = var10001;
            var10000.b(Bool.from((int)((var22 | var23) - (var22 & var23))));
            Dock var5 = this.j;
            if (this.G != null) {
                var5 = this.G;
            }
            float var6 = this.j();
            float var7 = this.k();
            float var72 = MinecraftContext.d.method_4480();
            var23 = 507318886;
            var22 = 767388989;
            var10001 = var22 & ~var23 | ~var22 & var23;
            var23 = 730233125;
            var22 = var10001;
            var10001 = var22 + var23 - 2 * (var22 & var23);
            var10002 = 288854620;
            var23 = -1231174319;
            var22 = var10002;
            var10002 = (var22 | var23) & (~var22 | ~var23);
            var23 = -373282453;
            var22 = var10002;
            var23 = var22 & ~var23 | ~var22 & var23;
            var22 = var10001;
            var10001 = (var22 | var23) + (var22 & var23);
            float var8 = var72 / 4.0f;
            float var73 = MinecraftContext.d.method_4507();
            String var88 = "cxg";
            float var9 = var73 / 4.0f;
            float var10 = (float)var3 - this.p;
            float var11 = (float)var4 - this.q;
            float var12 = Math.max(0.0f, Math.min(var10, var8 * 2.0f - var6));
            float var13 = Math.max(0.0f, Math.min(var11, var9 * 2.0f - var7));
            float var14 = (float)this.y.j();
            float var15 = this.z + (var12 - this.z) * var14;
            float var16 = this.A + (var13 - this.A) * var14;
            if (this.j == Dock.BOTTOM) {
                int var74 = -1461442731;
                var23 = -2067954969;
                var22 = var74;
                int var75 = (var22 | var23) - (var22 & var23);
                var23 = 744072626;
                var22 = var75;
                var76 = (var22 | var23) & ~(var22 & var23);
            } else {
                int var77 = 571545266;
                var23 = 740188697;
                var22 = var77;
                int var78 = var22 + var23 - 2 * (var22 & var23);
                var23 = 235893930;
                var22 = var78;
                var76 = var22 & ~var23 | ~var22 & var23;
            }
            int var17 = var76;
            if (var5 == Dock.BOTTOM) {
                int var79 = -1267243649;
                var23 = -2028179535;
                var22 = var79;
                int var80 = (var22 | var23) - (var22 & var23);
                var23 = 862653134;
                var22 = var80;
                var81 = (var22 | var23) - (var22 & var23);
            } else {
                var23 = 319448412;
                var22 = 1166162405;
                int var82 = var22 & ~var23 | ~var22 & var23;
                var23 = 1451777208;
                var22 = var82;
                var81 = var22 & ~var23 | ~var22 & var23;
            }
            int var18 = var81;
            if (this.j != var5) {
                this.j = var5;
                as.a().h();
            }
            float var19 = this.a(var1, this.j);
            float var20 = this.b(var2, this.j);
            this.u.d((double)var15);
            this.v.d((double)var16);
            double var89 = var19;
            var10002 = -1229039167;
            var23 = -1495993611;
            var22 = var10002;
            var10002 = (var22 | var23) - (var22 & var23);
            var23 = 19429692;
            var22 = var10002;
            var10002 = (var22 | var23) & (~var22 | ~var23);
            this.u.a(var89, 0.3, Easing.h);
            double var90 = var20;
            String var99 = "cxh";
            this.v.a(var90, 0.3, Easing.h);
            if (var17 != var18) {
                float var21 = var18 == 0 ? 0.0f : 1.0f;
                double var91 = var21;
                var10002 = -2142516607;
                var23 = 1716114926;
                var22 = var10002;
                var10002 = (var22 | var23) - (var22 & var23);
                var23 = -1039628222;
                var22 = var10002;
                var10002 = var22 + var23 - 2 * (var22 & var23);
                this.w.a(var91, 0.3, Easing.h);
            }
            this.G = null;
        }
    }

    public void a(float var1, float var2, int var3, int var4, double var5, double var7) {
        if (this.l && !this.k) {
            this.n = var3;
            this.o = var4;
        }
    }

    public static String b(String var0, String var1, int var2, int var3, int var4, int var5) {
        char[] var6 = var1.toCharArray();
        char[] var7 = new char[var6.length];
        int var18 = -1646912555;
        int var17 = 1469039126;
        int var10000 = var17 + var18 - 2 * (var17 & var18);
        var18 = -900081207;
        var17 = var10000;
        char[] var245 = new char[(var17 | var18) - (var17 & var18)];
        int var10002 = 465929485;
        var18 = -1724205713;
        var17 = var10002;
        var10002 = (var17 | var18) & (~var17 | ~var18);
        var18 = -2097205150;
        var17 = var10002;
        var10002 = (var17 | var18) & (~var17 | ~var18);
        var18 = -1544689086;
        var17 = 804229644;
        int var10003 = (var17 | var18) - (var17 & var18);
        var18 = -1946013572;
        var17 = var10003;
        var245[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
        var18 = -735188982;
        var17 = -988103095;
        var10002 = var17 + var18 - 2 * (var17 & var18);
        var18 = 288839234;
        var17 = var10002;
        var10002 = (var17 | var18) & (~var17 | ~var18);
        var18 = -1900756817;
        var17 = -1563326178;
        var10003 = (var17 | var18) & (~var17 | ~var18);
        var18 = 744843828;
        var17 = var10003;
        var245[var10002] = (char)((var17 | var18) & ~(var17 & var18));
        var10002 = -1329382735;
        var18 = 614854009;
        var17 = var10002;
        var10002 = var17 & ~var18 | ~var17 & var18;
        var18 = -1805199414;
        var17 = var10002;
        var10002 = var17 + var18 - 2 * (var17 & var18);
        var10003 = -444895118;
        var18 = -174425824;
        var17 = var10003;
        var10003 = var17 + var18 - 2 * (var17 & var18);
        var18 = 283192020;
        var17 = var10003;
        var245[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
        var10002 = 1576588948;
        var18 = 203984848;
        var17 = var10002;
        var10002 = (var17 | var18) & ~(var17 & var18);
        var18 = 1372608839;
        var17 = var10002;
        var10002 = var17 + var18 - 2 * (var17 & var18);
        var10003 = 1862591668;
        var18 = -1424636848;
        var17 = var10003;
        var10003 = (var17 | var18) & (~var17 | ~var18);
        var18 = -1158959976;
        var17 = var10003;
        var10003 = var17 & ~var18 | ~var17 & var18;
        var10003 = 937559052;
        var18 = -1513208234;
        var17 = var10003;
        var10003 = (var17 | var18) - (var17 & var18);
        var18 = -1842554295;
        var17 = var10003;
        var245[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
        var10002 = -2018802517;
        var18 = -602547902;
        var17 = var10002;
        var10002 = var17 & ~var18 | ~var17 & var18;
        var18 = 1539202541;
        var17 = var10002;
        var10002 = var17 & ~var18 | ~var17 & var18;
        var18 = 1450970833;
        var17 = -116250435;
        var10003 = (var17 | var18) & ~(var17 & var18);
        var18 = -933661231;
        var17 = var10003;
        var10003 = ((var17 | var18) - (var17 & var18)) * ((var17 | var18) - (var17 & var18));
        var18 = 2031064992;
        var17 = -1480103929;
        var10003 = (var17 | var18) & (~var17 | ~var18);
        var18 = -557289854;
        var17 = var10003;
        var245[var10002] = (char)((var17 | var18) & ~(var17 & var18));
        var18 = 1780495144;
        var17 = 756062366;
        var10002 = var17 + var18 - 2 * (var17 & var18);
        var18 = 1194372019;
        var17 = var10002;
        var10002 = var17 & ~var18 | ~var17 & var18;
        var10003 = -21916080;
        var18 = -2017743382;
        var17 = var10003;
        var10003 = (var17 | var18) & (~var17 | ~var18);
        var18 = 2030730808;
        var17 = var10003;
        var245[var10002] = (char)((var17 | var18) & ~(var17 & var18));
        var10002 = -1531859870;
        var18 = 565319854;
        var17 = var10002;
        var10002 = (var17 | var18) - (var17 & var18);
        var18 = -2063354678;
        var17 = var10002;
        var10002 = var17 & ~var18 | ~var17 & var18;
        var10003 = 673696766;
        var18 = -1050459155;
        var17 = var10003;
        var10003 = var17 + var18 - 2 * (var17 & var18);
        var18 = -381386496;
        var17 = var10003;
        var245[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
        var10002 = -870317919;
        var18 = 1573540970;
        var17 = var10002;
        var10002 = var17 & ~var18 | ~var17 & var18;
        var18 = -1846913844;
        var17 = var10002;
        var10002 = (var17 | var18) & (~var17 | ~var18);
        var18 = 631158166;
        var17 = 1339373199;
        var10003 = (var17 | var18) - (var17 & var18);
        var18 = 1783347003;
        var17 = var10003;
        var245[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
        var18 = 939518754;
        var17 = 1390539863;
        var10002 = (var17 | var18) - (var17 & var18);
        var18 = 1696472957;
        var17 = var10002;
        var10002 = var17 & ~var18 | ~var17 & var18;
        var18 = -1562150034;
        var17 = -1628377523;
        var10003 = var17 + var18 - 2 * (var17 & var18);
        var18 = 1007918448;
        var17 = var10003;
        var245[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
        var18 = -19223532;
        var17 = 160533519;
        var10002 = (var17 | var18) & (~var17 | ~var18);
        var18 = -146071534;
        var17 = var10002;
        var10002 = var17 + var18 - 2 * (var17 & var18);
        var18 = 347746501;
        var17 = -490340323;
        var10003 = (var17 | var18) & (~var17 | ~var18);
        var18 = -159631364;
        var17 = var10003;
        var245[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
        char[] var8 = var245;
        var18 = -1921752954;
        var17 = 1714422226;
        var10000 = (var17 | var18) - (var17 & var18);
        var18 = -347840162;
        var17 = var10000;
        char[] var247 = new char[var17 + var18 - 2 * (var17 & var18)];
        var10002 = -733114288;
        var18 = 455503405;
        var17 = var10002;
        var10002 = var17 & ~var18 | ~var17 & var18;
        var18 = -815006083;
        var17 = var10002;
        var10002 = (var17 | var18) & ~(var17 & var18);
        var10003 = 721129226;
        var18 = 2046066662;
        var17 = var10003;
        var10003 = (var17 | var18) & (~var17 | ~var18);
        var18 = 1393539276;
        var17 = var10003;
        var247[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
        var18 = 514731213;
        var17 = 490735849;
        var10002 = (var17 | var18) - (var17 & var18);
        var18 = 65938469;
        var17 = var10002;
        var10002 = (var17 | var18) - (var17 & var18);
        var10003 = -175757258;
        var18 = -1135852031;
        var17 = var10003;
        var10003 = (var17 | var18) - (var17 & var18);
        var18 = -426037977;
        var17 = var10003;
        var10003 = (var17 | var18) - (var17 & var18);
        var18 = 2081910213;
        var17 = 1644469740;
        int var10004 = (var17 | var18) & ~(var17 & var18);
        var18 = 1701744915;
        var17 = var10004;
        var18 = (var17 | var18) - (var17 & var18);
        var17 = var10003;
        var10003 = (var17 | var18) + (var17 & var18);
        var18 = 665279262;
        var17 = 1723376972;
        var10003 = (var17 | var18) & ~(var17 & var18);
        var18 = 1092581969;
        var17 = var10003;
        var247[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
        var10002 = -721650084;
        var18 = -1161329404;
        var17 = var10002;
        var10002 = (var17 | var18) & ~(var17 & var18);
        var18 = 1849424730;
        var17 = var10002;
        var10002 = (var17 | var18) & ~(var17 & var18);
        "\ufffdHTX\ufffd\ufffdp\ufffd\ufffd\u0745\ufffd\ufffd".length();
        var10004 = 559648820;
        var18 = 141061275;
        var17 = var10004;
        var10004 = var17 & ~var18 | ~var17 & var18;
        var18 = 691272864;
        var17 = var10004;
        var10004 = var17 + var18 - 2 * (var17 & var18);
        "0\ufffd\ufffd\ufffd\u0012".length();
        var18 = 801911153;
        var17 = -1951088114;
        var10004 = var17 & ~var18 | ~var17 & var18;
        var18 = -1535577233;
        var17 = var10004;
        var10004 = (var17 | var18) - (var17 & var18);
        var18 = -1406347489;
        var17 = -1333955866;
        var10003 = var17 & ~var18 | ~var17 & var18;
        var18 = 475079338;
        var17 = var10003;
        var247[var10002] = (char)((var17 | var18) & ~(var17 & var18));
        var18 = -1381340450;
        var17 = -559287868;
        var10002 = var17 + var18 - 2 * (var17 & var18);
        var18 = 1929616153;
        var17 = var10002;
        var10002 = (var17 | var18) & (~var17 | ~var18);
        var10003 = -367194413;
        var18 = -1079170027;
        var17 = var10003;
        var10003 = (var17 | var18) & ~(var17 & var18);
        var18 = 1437604548;
        var17 = var10003;
        var247[var10002] = (char)((var17 | var18) - (var17 & var18));
        var18 = 1877313543;
        var17 = 422916149;
        var10002 = var17 & ~var18 | ~var17 & var18;
        var18 = 1993390134;
        var17 = var10002;
        var10002 = var17 & ~var18 | ~var17 & var18;
        var10003 = 1665696830;
        var18 = 948296372;
        var17 = var10003;
        var10003 = (var17 | var18) & ~(var17 & var18);
        var18 = 1540187850;
        var17 = var10003;
        var247[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
        var10002 = 471893747;
        var18 = -1963794434;
        var17 = var10002;
        var10002 = (var17 | var18) & ~(var17 & var18);
        var18 = -1764599544;
        var17 = var10002;
        var10002 = (var17 | var18) - (var17 & var18);
        var10003 = 1719236678;
        var18 = 479228722;
        var17 = var10003;
        var10003 = (var17 | var18) & ~(var17 & var18);
        var18 = 2062103520;
        var17 = var10003;
        var247[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
        var10002 = -2097515966;
        var18 = -1733219728;
        var17 = var10002;
        var10002 = var17 & ~var18 | ~var17 & var18;
        var18 = 441145396;
        var17 = var10002;
        var10002 = (var17 | var18) - (var17 & var18);
        String var339 = "cxi";
        var10003 = 508723481;
        var18 = 528190707;
        var17 = var10003;
        var10003 = var17 & ~var18 | ~var17 & var18;
        var18 = 19499731;
        var17 = var10003;
        var247[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
        var18 = -620787129;
        var17 = -488504298;
        var10002 = (var17 | var18) - (var17 & var18);
        var18 = 941461078;
        var17 = var10002;
        var10002 = (var17 | var18) - (var17 & var18);
        var10003 = -154545659;
        var18 = 2076891292;
        var17 = var10003;
        var10003 = (var17 | var18) & ~(var17 & var18);
        var18 = -1929176415;
        var17 = var10003;
        var247[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
        var10002 = -1015793562;
        var18 = 64170509;
        var17 = var10002;
        var10002 = var17 & ~var18 | ~var17 & var18;
        var18 = -1062792605;
        var17 = var10002;
        var10002 = (var17 | var18) & ~(var17 & var18);
        String var344 = "cxj";
        var18 = -2131975903;
        var17 = 972118822;
        var10003 = var17 & ~var18 | ~var17 & var18;
        var18 = -1189250813;
        var17 = var10003;
        var247[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
        var18 = -131327337;
        var17 = 586611059;
        var10002 = (var17 | var18) & (~var17 | ~var18);
        var18 = -623189011;
        var17 = var10002;
        var10002 = (var17 | var18) & (~var17 | ~var18);
        var10003 = -1897707305;
        var18 = -2134481833;
        var17 = var10003;
        var10003 = (var17 | var18) & ~(var17 & var18);
        var18 = 237313971;
        var17 = var10003;
        var247[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
        char[] var9 = var247;
        var18 = 1427565004;
        var17 = 1979017078;
        var10000 = (var17 | var18) & ~(var17 & var18);
        var18 = 551784122;
        var17 = var10000;
        for (int var10 = var17 & (var18 ^ 0xFFFFFFFF) | (var17 ^ 0xFFFFFFFF) & var18; var10 < var6.length; ++var10) {
            char var303 = var6[var10];
            char var231 = var8[var10 % var8.length];
            char var119 = var303;
            var7[var10] = (char)((var119 | var231) & ~(var119 & var231));
        }
        char[] var19 = new char[var7.length];
        var18 = -1158477989;
        var17 = -886233180;
        var10000 = (var17 | var18) & ~(var17 & var18);
        var18 = 1910382847;
        var17 = var10000;
        for (int var11 = (var17 | var18) & (var17 ^ 0xFFFFFFFF | var18 ^ 0xFFFFFFFF); var11 < var6.length; ++var11) {
            char var304 = var7[var11];
            char var234 = var9[var11 % var9.length];
            char var122 = var304;
            var19[var11] = (char)(var122 & ~var234 | ~var122 & var234);
        }
        String var20 = new String(var19);
        int var12 = var20.hashCode();
        var18 = var5;
        var17 = var3;
        var10000 = 2 * (var17 & ~var18) - (var17 ^ var18);
        var18 = var2;
        var17 = var10000;
        int var13 = 2 * (var17 & ~var18) - (var17 ^ var18);
        char[] var14 = var0.toCharArray();
        char[] var15 = new char[var14.length];
        var10000 = -50818117;
        var18 = -440486184;
        var17 = var10000;
        var10000 = (var17 | var18) & (~var17 | ~var18);
        var18 = 424027491;
        var17 = var10000;
        block6: for (int var16 = (var17 | var18) & (var17 ^ 0xFFFFFFFF | var18 ^ 0xFFFFFFFF); var16 < var15.length; ++var16) {
            var18 = -627155497;
            var17 = 784735979;
            int var10001 = var17 + var18 - 2 * (var17 & var18);
            var18 = -195542210;
            var17 = var10001;
            switch (var16 % (var17 & ~var18 | ~var17 & var18)) {
                case 0: {
                    var18 = var12;
                    var17 = var13;
                    var10002 = var17 & ~var18 | ~var17 & var18;
                    char var244 = var14[var16];
                    var17 = var10002;
                    var15[var16] = (char)((var17 | var244) & ~(var17 & var244));
                    continue block6;
                }
                case 1: {
                    var18 = var13;
                    var17 = var5;
                    var10002 = var17 + var18 - 2 * (var17 & var18);
                    char var242 = var14[var16];
                    var17 = var10002;
                    var15[var16] = (char)(var17 + var242 - 2 * (var17 & var242));
                }
            }
        }
        return new String(var15);
    }

    public static enum Dock {
        BOTTOM,
        LEFT,
        RIGHT;

        public static int d;
        public static boolean e;

        public static String a(String value, String key, int seed1, int seed2, int seed3, int seed4) {
            return value;
        }
    }

    private static class a {
        private final k c;
        private boolean d;
        private final AnimationState e = new AnimationState();
        private final AnimationState f = new AnimationState();
        private boolean g;
        public static int a;
        public static boolean b;

        public a(k var1) {
            int var10001 = -1642248981;
            int var3 = 1978998971;
            int var2 = var10001;
            var10001 = (var2 | var3) & (~var2 | ~var3);
            var3 = -337091504;
            var2 = var10001;
            this.g = Bool.from((int)((var2 | var3) & (~var2 | ~var3)));
            this.c = var1;
            var3 = 1133481960;
            var2 = 124694021;
            var10001 = var2 + var3 - 2 * (var2 & var3);
            var3 = 1155604973;
            var2 = var10001;
            this.d = Bool.from((int)(var2 & ~var3 | ~var2 & var3));
        }

        public k a() {
            return this.c;
        }

        public void a(boolean var1) {
            double var10001;
            this.d = var1;
            if (!var1) {
                var10001 = 0.0;
            } else {
                var10001 = 1.0;
                if (b) {
                    int var3 = -797037795;
                    int var2 = -1154815872;
                    int var10002 = (var2 | var3) & ~(var2 & var3);
                    var3 = 1800717213;
                    var2 = var10002;
                    var10002 = (var2 | var3) & ~(var2 & var3);
                    int var10003 = 817434876;
                    var3 = 1932208659;
                    var2 = var10003;
                    var10003 = (var2 | var3) & ~(var2 & var3);
                    var3 = 1133656815;
                    var2 = var10003;
                    var10002 /= (var2 | var3) & ~(var2 & var3);
                }
            }
            this.e.d(var10001);
        }

        public void b(boolean var1) {
            if (this.d != var1) {
                this.d = var1;
                AnimationState var10000 = this.e;
                double var10001 = !var1 ? 0.0 : 1.0;
                "\ufffd\ufffd(pC\ufffd/\ufffd\u0007q\ufffd".length();
                int var10003 = 59629683;
                int var3 = -1037950427;
                int var2 = var10003;
                var10003 = var2 & ~var3 | ~var2 & var3;
                var3 = -1045446051;
                var2 = var10003;
                var10003 = (var2 | var3) & ~(var2 & var3);
                "".length();
                var10003 = 206152189;
                var3 = -1974105729;
                var2 = var10003;
                var10003 = var2 & ~var3 | ~var2 & var3;
                var3 = -2044974957;
                var2 = var10003;
                var10003 = (var2 | var3) & (~var2 | ~var3);
                var10000.a(var10001, 0.25, Easing.h);
            }
        }

        public void a(class_4587 var1, Renderer2D var2, float var3, float var4, boolean var5) {
            int var10006 = -380367979;
            int var7 = -1202925888;
            int var6 = var10006;
            var10006 = (var6 | var7) & (~var6 | ~var7);
            var7 = 1360577877;
            var6 = var10006;
            this.a(var1, var2, var3, var4, var5, Bool.from((int)((var6 | var7) & (~var6 | ~var7))));
        }

        public void a(class_4587 var1, Renderer2D var2, float var3, float var4, boolean var5, boolean var6) {
            if (var6 && this.g) {
                AnimationState var196 = this.f;
                "V\n\ufffd!\ufffd\ufffd\u001d\ufffdw9\ufffd\ufffd}b\ufffd\ufffd".length();
                int var133 = -1785739198;
                int var63 = 1382626267;
                int var229 = var63 & ~var133 | ~var63 & var133;
                var133 = -941163626;
                var63 = var229;
                var229 = (var63 | var133) & (~var63 | ~var133);
                var196.a(0.0, 0.15, Easing.h);
                var133 = 1007374004;
                var63 = -1322608075;
                int var204 = var63 + var133 - 2 * (var63 & var133);
                var133 = -1927162751;
                var63 = var204;
                this.g = Bool.from((int)(var63 + var133 - 2 * (var63 & var133)));
                if (a != a) {
                    String var197 = "dmz";
                    int var198 = 1768306395;
                    var133 = 1521118001;
                    var63 = var198;
                    int var199 = var63 & ~var133 | ~var63 & var133;
                    var133 = 717857005;
                    var63 = var199;
                    int n2 = (var63 | var133) - (var63 & var133);
                }
            } else if (var6) {
                int var10000 = -207965542;
                int var37 = 85448029;
                int var36 = var10000;
                var10000 = (var36 | var37) - (var36 & var37);
                var37 = 526028766;
                var36 = var10000;
                var10000 = var36 & ~var37 | ~var36 & var37;
                int var10001 = -1222278422;
                var37 = 1516600117;
                var36 = var10001;
                var10001 = (var36 | var37) - (var36 & var37);
                var37 = -892414651;
                var36 = var10001;
                var37 = (var36 | var37) - (var36 & var37);
                var36 = var10000;
                var10000 = (var36 ^ var37) + 2 * (var36 & var37);
                var10000 = 1251418884;
                var37 = 417200406;
                var36 = var10000;
                var10000 = (var36 | var37) - (var36 & var37);
                var37 = 725269865;
                var36 = var10000;
                int var35 = (var36 | var37) & (~var36 | ~var37);
                var37 = 1101101047;
                var36 = -741639806;
                var10000 = var36 + var37 - 2 * (var36 & var37);
                var37 = 966645177;
                var36 = var10000;
                var10000 = var36 + var37 - 2 * (var36 & var37);
                var37 = 850012230;
                var36 = 1719011118;
                var10001 = (var36 | var37) - (var36 & var37);
                var37 = -281632243;
                var36 = var10001;
                var37 = (var36 | var37) & ~(var36 & var37);
                var36 = var10000;
                var10000 = (var36 | var37) + (var36 & var37);
                var10000 = -635582357;
                var37 = 1861186548;
                var36 = var10000;
                var10000 = var36 & ~var37 | ~var36 & var37;
                if (((var36 = var10000) | (var37 = -100541618)) - (var36 & var37) >= var35) {
                    var10000 = 993554812;
                    var37 = 1245840511;
                    var36 = var10000;
                    var10000 = (var36 | var37) & ~(var36 & var37);
                    var37 = 396151010;
                    var36 = var10000;
                    var10000 = ((var36 | var37) & (~var36 | ~var37)) * ((var36 | var37) & (~var36 | ~var37));
                    var10000 = 1949648213;
                    var37 = -432759596;
                    var36 = var10000;
                    var10000 = (var36 | var37) - (var36 & var37);
                    var37 = 783532585;
                    var36 = var10000;
                    var35 = (var36 | var37) - (var36 & var37);
                }
            } else if (var5 != this.g) {
                AnimationState var195 = this.f;
                double var203 = !var5 ? 0.0 : 1.0;
                "\ufffdyv\ufffd\ufffdUsZ+\u001c".length();
                int var127 = -666426930;
                int var57 = -617285870;
                int var10003 = (var57 | var127) - (var57 & var127);
                var127 = 57923283;
                var57 = var10003;
                var10003 = var57 + var127 - 2 * (var57 & var127);
                "\ufffd\u0007\ufffd\ufffd\u000e\u0003d".length();
                var10003 = -1229076909;
                var127 = 8020578;
                var57 = var10003;
                var10003 = (var57 | var127) - (var57 & var127);
                var127 = -1228430286;
                var57 = var10003;
                var10003 = (var57 | var127) & ~(var57 & var127);
                "l".length();
                var127 = 696415727;
                var57 = 84007007;
                var10003 = (var57 | var127) & (~var57 | ~var127);
                var127 = 746827187;
                var57 = var10003;
                var10003 = (var57 | var127) & (~var57 | ~var127);
                var195.a(var203, 0.15, Easing.h);
                this.g = var5;
            }
            this.e.a();
            this.f.a();
            float var7 = (float)this.e.j();
            float var8 = (float)this.f.j();
            int var205 = 914638192;
            int var139 = -278029088;
            int var69 = var205;
            var205 = var69 + var139 - 2 * (var69 & var139);
            var139 = -1010060060;
            var69 = var205;
            var205 = (var69 | var139) - (var69 & var139);
            if (var7 > 0.01f) {
                int var231 = 194521839;
                var139 = -50905778;
                var69 = var231;
                var231 = var69 & ~var139 | ~var69 & var139;
                var139 = -2055573143;
                var69 = var231;
                var231 = (var69 + var139 - 2 * (var69 & var139)) * (var69 + var139 - 2 * (var69 & var139));
                float var10002 = var4 + 1.5f;
                var231 = 234014750;
                var139 = -1253559679;
                var69 = var231;
                var231 = (var69 | var139) - (var69 & var139);
                var139 = 2053482954;
                var69 = var231;
                var231 = (var69 | var139) - (var69 & var139);
                Color var10004 = pulse.g.ad;
                String var10005 = "dna";
                float var247 = 255.0f * var7;
                "\ufffdV)\ufffdC%\ufffd\ufffd(\ufffd\ufffd".length();
                var139 = -553689777;
                var69 = -928144518;
                int var10007 = var69 & ~var139 | ~var69 & var139;
                var139 = 374537782;
                var69 = var10007;
                var10007 = (var69 | var139) - (var69 & var139);
                "\ufffdE-\u001bM\u0002\n\ufffdg".length();
                var10007 = -21795495;
                var139 = -1310005972;
                var69 = var10007;
                var10007 = var69 + var139 - 2 * (var69 & var139);
                var139 = 1331267705;
                var69 = var10007;
                var10007 = (var69 | var139) & (~var69 | ~var139);
                "m\ufffdH\ufffd\ufffd]\ufffd\u001b)P".length();
                var139 = -1747541360;
                var69 = -1929919921;
                var10007 = (var69 | var139) & (~var69 | ~var139);
                var139 = 455172309;
                var69 = var10007;
                var10007 = (var69 | var139) & (~var69 | ~var139);
                "\ufffdi\ufffd^j\u057d\ufffdd\ufffd".length();
                var10007 = -585184171;
                var139 = 612438920;
                var69 = var10007;
                var10007 = (var69 | var139) & (~var69 | ~var139);
                var139 = -106962983;
                var69 = var10007;
                var10007 = var69 + var139 - 2 * (var69 & var139);
                var2.a(var3, var10002, 10.7f, pulse.g.a((Color)var10004, (int)((int)(var247 * 0.7f))), var1);
            }
            Color var9 = pulse.g.q;
            Color var10 = pulse.g.r;
            Color var11 = pulse.g.C;
            Color var12 = pulse.g.D;
            Color var13 = et.a((Color)var9, (Color)var11, (float)var7);
            Color var14 = et.a((Color)var10, (Color)var12, (float)var7);
            var139 = -967671342;
            var69 = -669062888;
            int var215 = var69 & ~var139 | ~var69 & var139;
            var139 = -1007540771;
            var69 = var215;
            var215 = (var69 | var139) & ~(var69 & var139);
            int var237 = 57152320;
            var139 = 1722591161;
            var69 = var237;
            var237 = (var69 | var139) & ~(var69 & var139);
            var139 = -77114793;
            var69 = var237;
            var139 = (var69 | var139) - (var69 & var139);
            var69 = var215;
            var215 = var69 - ~var139 - 1;
            float var208 = var3 - 0.5f;
            var139 = -1370938608;
            var69 = 462716852;
            var237 = (var69 | var139) & (~var69 | ~var139);
            var139 = 1003959410;
            var69 = var237;
            var237 = var69 & ~var139 | ~var69 & var139;
            float var218 = var4 - 0.5f;
            String var241 = "dnb";
            var139 = 429585847;
            var69 = 1687607846;
            int var243 = var69 & ~var139 | ~var69 & var139;
            var139 = -599142736;
            var69 = var243;
            var243 = (var69 | var139) & ~(var69 & var139);
            int var248 = -262659716;
            var139 = 1968791985;
            var69 = var248;
            var248 = (var69 | var139) - (var69 & var139);
            var139 = 835766268;
            var69 = var248;
            var139 = var69 & ~var139 | ~var69 & var139;
            var69 = var243;
            var243 = var69 - ~var139 - 1;
            var139 = -341933583;
            var69 = 1274204136;
            var248 = var69 & ~var139 | ~var69 & var139;
            var139 = -1179966338;
            var69 = var248;
            var248 = ((var69 | var139) & ~(var69 & var139)) * ((var69 | var139) & ~(var69 & var139));
            var2.a(var208, var218, 23.0f, 23.0f, 6.0f, var13, var13, var14, var14, var1);
            Color var15 = pulse.g.f;
            Color var16 = pulse.g.e;
            Color var17 = pulse.g.y;
            Color var18 = pulse.g.z;
            String var209 = "dnc";
            int var19 = (int)(var8 * 8.0f);
            Color var20 = pulse.g.b((Color)var15, (int)var19);
            Color var21 = pulse.g.b((Color)var16, (int)var19);
            Color var22 = et.a((Color)var20, (Color)var17, (float)var7);
            Color var23 = et.a((Color)var21, (Color)var18, (float)var7);
            String var242 = "dnd";
            String var246 = "dne";
            var139 = 1139286856;
            var69 = 1862545785;
            var248 = (var69 | var139) & ~(var69 & var139);
            var139 = 941477484;
            var69 = var248;
            var248 = (var69 | var139) & ~(var69 & var139);
            var139 = 521927633;
            var69 = -1650394790;
            int var10006 = var69 + var139 - 2 * (var69 & var139);
            var139 = -613920193;
            var69 = var10006;
            var139 = (var69 | var139) - (var69 & var139);
            var69 = var248;
            var248 = (var69 ^ var139) + 2 * (var69 & var139);
            var2.a(var3, var4, 22.0f, 22.0f, 6.0f, var22, var22, var23, var23, var1);
            var205 = 733573515;
            var139 = -1724985720;
            var69 = var205;
            var205 = (var69 | var139) & ~(var69 & var139);
            var139 = -1298677989;
            var69 = var205;
            FontRenderer var24 = FontManager.e[(var69 | var139) & (~var69 | ~var139)];
            String var25 = this.c.b();
            Color var26 = pulse.g.b;
            Color var27 = pulse.g.a;
            Color var28 = pulse.g.d;
            Color var29 = et.a((Color)et.a((Color)var26, (Color)var28, (float)(var8 * (1.0f - var7))), (Color)var27, (float)var7);
            float var30 = var24.a(var25);
            float var31 = var24.b(var25);
            var205 = 1814960381;
            var139 = -437178306;
            var69 = var205;
            var205 = var69 & ~var139 | ~var69 & var139;
            var139 = -286456737;
            var69 = var205;
            var205 = var69 + var139 - 2 * (var69 & var139);
            float var32 = var3 + 11.0f - var30 / 2.0f;
            "\u0592w<:\ufffd\ufffdU\ufffd\u0019".length();
            var139 = -2102014264;
            var69 = 1687709978;
            var215 = (var69 | var139) - (var69 & var139);
            var139 = -433215527;
            var69 = var215;
            var215 = (var69 | var139) - (var69 & var139);
            float var200 = var4 + 11.0f;
            var139 = -1243983866;
            var69 = 1955682841;
            var215 = var69 & ~var139 | ~var69 & var139;
            var139 = -1249515482;
            var69 = var215;
            var215 = (var69 & ~var139 | ~var69 & var139) * (var69 & ~var139 | ~var69 & var139);
            float var33 = var200 - var31 / 4.0f;
            var24.a(var25, (double)var32, (double)var33, var29, var1);
        }

        public static String a(String var0, String var1, int var2, int var3, int var4, int var5) {
            char[] var6 = var1.toCharArray();
            char[] var7 = new char[var6.length];
            int var10000 = 1722003064;
            int var18 = -1220930824;
            int var17 = var10000;
            var10000 = (var17 | var18) & (~var17 | ~var18);
            var18 = -778453878;
            var17 = var10000;
            char[] var254 = new char[(var17 | var18) & ~(var17 & var18)];
            var18 = 697633246;
            var17 = 1067503329;
            int var10002 = var17 & ~var18 | ~var17 & var18;
            var18 = 372623167;
            var17 = var10002;
            var10002 = var17 + var18 - 2 * (var17 & var18);
            var18 = -641068332;
            var17 = -1132427953;
            int var10003 = (var17 | var18) & (~var17 | ~var18);
            var18 = 1699405737;
            var17 = var10003;
            var254[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
            var10002 = -1851174341;
            var18 = 1820971920;
            var17 = var10002;
            var10002 = (var17 | var18) & (~var17 | ~var18);
            var18 = -48201302;
            var17 = var10002;
            var10002 = var17 & ~var18 | ~var17 & var18;
            var18 = -410787672;
            var17 = -1976694150;
            var10003 = (var17 | var18) & (~var17 | ~var18);
            var18 = 1840105815;
            var17 = var10003;
            var254[var10002] = (char)((var17 | var18) - (var17 & var18));
            var10002 = -2082922159;
            var18 = -1815419017;
            var17 = var10002;
            var10002 = (var17 | var18) & (~var17 | ~var18);
            var18 = 269731364;
            var17 = var10002;
            var10002 = var17 & ~var18 | ~var17 & var18;
            var18 = -1321212931;
            var17 = 1695038807;
            var10003 = var17 + var18 - 2 * (var17 & var18);
            var18 = -734528212;
            var17 = var10003;
            var254[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
            var18 = -1573431017;
            var17 = 1949127267;
            var10002 = (var17 | var18) & ~(var17 & var18);
            var18 = -702936201;
            var17 = var10002;
            var10002 = (var17 | var18) & (~var17 | ~var18);
            var18 = 2080725417;
            var17 = -2043006351;
            var10003 = (var17 | var18) & ~(var17 & var18);
            var18 = -339891969;
            var17 = var10003;
            var10003 = var17 & ~var18 | ~var17 & var18;
            var10003 = 1795382150;
            var18 = 1872836773;
            var17 = var10003;
            var10003 = var17 + var18 - 2 * (var17 & var18);
            var18 = 77790000;
            var17 = var10003;
            var254[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
            var18 = 1714490291;
            var17 = -1386777008;
            var10002 = (var17 | var18) - (var17 & var18);
            var18 = -882475545;
            var17 = var10002;
            var10002 = (var17 | var18) - (var17 & var18);
            var18 = 72814012;
            var17 = -1280237181;
            var10003 = (var17 | var18) & ~(var17 & var18);
            var18 = -1865572500;
            var17 = var10003;
            var10003 = ((var17 | var18) - (var17 & var18)) * ((var17 | var18) - (var17 & var18));
            var10003 = -159387795;
            var18 = 679898212;
            var17 = var10003;
            var10003 = var17 & ~var18 | ~var17 & var18;
            var18 = -554102228;
            var17 = var10003;
            var254[var10002] = (char)((var17 | var18) - (var17 & var18));
            var10002 = 1165030902;
            var18 = 1281693918;
            var17 = var10002;
            var10002 = (var17 | var18) - (var17 & var18);
            var18 = 152431917;
            var17 = var10002;
            var10002 = (var17 | var18) - (var17 & var18);
            var18 = -1625242863;
            var17 = -1937890459;
            var10003 = (var17 | var18) & ~(var17 & var18);
            var18 = 324969974;
            var17 = var10003;
            var254[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
            var18 = -1888659553;
            var17 = 1694581457;
            var10002 = (var17 | var18) - (var17 & var18);
            var18 = -362015416;
            var17 = var10002;
            var10002 = (var17 | var18) & ~(var17 & var18);
            var18 = 1740438823;
            var17 = 1432484121;
            var10003 = var17 & ~var18 | ~var17 & var18;
            var18 = 853347629;
            var17 = var10003;
            var254[var10002] = (char)((var17 | var18) & ~(var17 & var18));
            var10002 = -1342930397;
            var18 = 937967032;
            var17 = var10002;
            var10002 = var17 + var18 - 2 * (var17 & var18);
            var18 = -1742946404;
            var17 = var10002;
            var10002 = (var17 | var18) & (~var17 | ~var18);
            var10003 = 1536308421;
            var18 = -1004066874;
            var17 = var10003;
            var10003 = var17 + var18 - 2 * (var17 & var18);
            var18 = -1615517919;
            var17 = var10003;
            var254[var10002] = (char)((var17 | var18) - (var17 & var18));
            var10002 = -1054340728;
            var18 = -1289070215;
            var17 = var10002;
            var10002 = var17 + var18 - 2 * (var17 & var18);
            var18 = 1912754425;
            var17 = var10002;
            var10002 = var17 + var18 - 2 * (var17 & var18);
            var10003 = 379071711;
            var18 = -1311581210;
            var17 = var10003;
            var10003 = (var17 | var18) & (~var17 | ~var18);
            var18 = -1488257174;
            var17 = var10003;
            var254[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
            var10002 = -983790914;
            var18 = 408795015;
            var17 = var10002;
            var10002 = (var17 | var18) & (~var17 | ~var18);
            var18 = -587121360;
            var17 = var10002;
            var10002 = var17 + var18 - 2 * (var17 & var18);
            var10003 = 1565913772;
            var18 = -186669548;
            var17 = var10003;
            var10003 = var17 & ~var18 | ~var17 & var18;
            var18 = -1450552420;
            var17 = var10003;
            var254[var10002] = (char)((var17 | var18) & ~(var17 & var18));
            char[] var8 = var254;
            var10000 = 455691253;
            var18 = 2123560114;
            var17 = var10000;
            var10000 = var17 & ~var18 | ~var17 & var18;
            var18 = 1706803021;
            var17 = var10000;
            char[] var257 = new char[(var17 | var18) & (~var17 | ~var18)];
            var18 = 955963389;
            var17 = -404494258;
            var10002 = var17 + var18 - 2 * (var17 & var18);
            var18 = -551993421;
            var17 = var10002;
            var10002 = var17 + var18 - 2 * (var17 & var18);
            var18 = -1808869341;
            var17 = 21224519;
            var10003 = var17 & ~var18 | ~var17 & var18;
            var18 = -1787999164;
            var17 = var10003;
            var257[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
            var18 = 1071663383;
            var17 = -745096792;
            var10002 = var17 + var18 - 2 * (var17 & var18);
            var18 = -327749442;
            var17 = var10002;
            var10002 = var17 + var18 - 2 * (var17 & var18);
            var18 = 1827620473;
            var17 = 1205393362;
            var10003 = (var17 | var18) & ~(var17 & var18);
            var18 = 1700715570;
            var17 = var10003;
            var10003 = (var17 + var18 - 2 * (var17 & var18)) * (var17 + var18 - 2 * (var17 & var18));
            var10003 = 533383422;
            var18 = 537313153;
            var17 = var10003;
            var10003 = var17 & ~var18 | ~var17 & var18;
            var18 = 1070396284;
            var17 = var10003;
            var257[var10002] = (char)((var17 | var18) & ~(var17 & var18));
            var18 = -386467277;
            var17 = -746022186;
            var10002 = (var17 | var18) & (~var17 | ~var18);
            var18 = 998138087;
            var17 = var10002;
            var10002 = (var17 | var18) - (var17 & var18);
            var10003 = -498290689;
            var18 = 1856132503;
            var17 = var10003;
            var10003 = (var17 | var18) & (~var17 | ~var18);
            var18 = -217923871;
            var17 = var10003;
            var10003 = (var17 | var18) - (var17 & var18);
            var10003 = -2108063419;
            var18 = 1039017492;
            var17 = var10003;
            var10003 = (var17 | var18) & ~(var17 & var18);
            var18 = -1078517758;
            var17 = var10003;
            var257[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
            var10002 = 1055669356;
            var18 = 1376290183;
            var17 = var10002;
            var10002 = (var17 | var18) & (~var17 | ~var18);
            var18 = 1826929128;
            var17 = var10002;
            var10002 = (var17 | var18) - (var17 & var18);
            var10003 = -661872311;
            var18 = -1730168472;
            var17 = var10003;
            var10003 = (var17 | var18) & ~(var17 & var18);
            var18 = 1079189539;
            var17 = var10003;
            var257[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
            var10002 = -330359129;
            var18 = 1141800488;
            var17 = var10002;
            var10002 = var17 & ~var18 | ~var17 & var18;
            var18 = -1472110453;
            var17 = var10002;
            var10002 = (var17 | var18) - (var17 & var18);
            var18 = -196764710;
            var17 = 1622689737;
            var10003 = (var17 | var18) & ~(var17 & var18);
            var18 = -1795300269;
            var17 = var10003;
            var257[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
            var10002 = 1233459628;
            var18 = 1380142791;
            var17 = var10002;
            var10002 = (var17 | var18) - (var17 & var18);
            var18 = 465983342;
            var17 = var10002;
            var10002 = var17 + var18 - 2 * (var17 & var18);
            var10003 = 1067440361;
            var18 = -759704496;
            var17 = var10003;
            var10003 = (var17 | var18) & (~var17 | ~var18);
            var18 = -316132307;
            var17 = var10003;
            var257[var10002] = (char)((var17 | var18) & ~(var17 & var18));
            var10002 = -44848536;
            var18 = 49761461;
            var17 = var10002;
            var10002 = var17 & ~var18 | ~var17 & var18;
            var18 = -5970213;
            var17 = var10002;
            var10002 = (var17 | var18) & (~var17 | ~var18);
            String var357 = "dnf";
            var18 = -1008816741;
            var17 = 1546272006;
            var10003 = (var17 | var18) & (~var17 | ~var18);
            var18 = -1611393116;
            var17 = var10003;
            var257[var10002] = (char)((var17 | var18) & ~(var17 & var18));
            var18 = -1609446564;
            var17 = -173292685;
            var10002 = (var17 | var18) & ~(var17 & var18);
            var18 = 1438255144;
            var17 = var10002;
            var10002 = var17 & ~var18 | ~var17 & var18;
            var18 = -512463096;
            var17 = -1410599224;
            var10003 = var17 + var18 - 2 * (var17 & var18);
            var18 = 1251969528;
            var17 = var10003;
            var257[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
            var18 = 398644716;
            var17 = 335473317;
            var10002 = var17 & ~var18 | ~var17 & var18;
            var18 = 71057217;
            var17 = var10002;
            var10002 = (var17 | var18) & ~(var17 & var18);
            var10003 = 932106947;
            var18 = -389953224;
            var17 = var10003;
            var10003 = (var17 | var18) - (var17 & var18);
            var18 = 1911978604;
            var17 = var10003;
            var10003 = (var17 | var18) & (~var17 | ~var18);
            int var10004 = 423819167;
            var18 = 505769561;
            var17 = var10004;
            var10004 = (var17 | var18) & ~(var17 & var18);
            var18 = 1620937917;
            var17 = var10004;
            var18 = var17 + var18 - 2 * (var17 & var18);
            var17 = var10003;
            var10003 = (var17 & ~var18) + (var18 & ~var17) + 2 * (var17 & var18);
            var10003 = -341642583;
            var18 = -439137562;
            var17 = var10003;
            var10003 = (var17 | var18) & (~var17 | ~var18);
            var18 = 242301771;
            var17 = var10003;
            var257[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
            var10002 = 85347080;
            var18 = -1273087943;
            var17 = var10002;
            var10002 = var17 + var18 - 2 * (var17 & var18);
            var18 = -1324846280;
            var17 = var10002;
            var10002 = var17 + var18 - 2 * (var17 & var18);
            var18 = 576313352;
            var17 = -83666480;
            var10003 = (var17 | var18) & (~var17 | ~var18);
            var18 = -648367381;
            var17 = var10003;
            var257[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
            char[] var9 = var257;
            var10000 = -74688560;
            var18 = -1838759035;
            var17 = var10000;
            var10000 = (var17 | var18) - (var17 & var18);
            var18 = 1776981077;
            var17 = var10000;
            for (int var10 = var17 + var18 - 2 * (var17 & var18); var10 < var6.length; ++var10) {
                if (a != a) {
                    var10000 = 1244783830;
                    var18 = 717056893;
                    var17 = var10000;
                    var10000 = (var17 | var18) - (var17 & var18);
                    var18 = 1619824555;
                    var17 = var10000;
                    var10000 = var17 & ~var18 | ~var17 & var18;
                    var18 = 1704107505;
                    var17 = -1959362450;
                    int var10001 = var17 + var18 - 2 * (var17 & var18);
                    var18 = -291234401;
                    var17 = var10001;
                    var10000 /= (var17 | var18) & ~(var17 & var18);
                }
                char var320 = var6[var10];
                char var239 = var8[var10 % var8.length];
                char var123 = var320;
                var7[var10] = (char)(var123 + var239 - 2 * (var123 & var239));
            }
            char[] var19 = new char[var7.length];
            var10000 = 132601750;
            var18 = -1302080367;
            var17 = var10000;
            var10000 = var17 + var18 - 2 * (var17 & var18);
            var18 = -1249606905;
            var17 = var10000;
            for (int var11 = (var17 | var18) & (var17 & var18 ^ 0xFFFFFFFF); var11 < var6.length; ++var11) {
                char var321 = var7[var11];
                char var242 = var9[var11 % var9.length];
                char var126 = var321;
                var19[var11] = (char)(var126 & ~var242 | ~var126 & var242);
            }
            String var20 = new String(var19);
            int var12 = var20.hashCode();
            var18 = var5;
            var17 = var3;
            var10000 = (var17 ^ var18) - 2 * (~var17 & var18);
            var18 = var2;
            var17 = var10000;
            int var13 = (var17 & ~var18) - (~var17 & var18);
            char[] var14 = var0.toCharArray();
            char[] var15 = new char[var14.length];
            var10000 = -1289613547;
            var18 = 486727830;
            var17 = var10000;
            var10000 = (var17 | var18) - (var17 & var18);
            var18 = -1373573245;
            var17 = var10000;
            block6: for (int var16 = (var17 | var18) & (var17 & var18 ^ 0xFFFFFFFF); var16 < var15.length; ++var16) {
                var18 = -765853676;
                var17 = -1503784192;
                int var269 = (var17 | var18) - (var17 & var18);
                var18 = 1946424086;
                var17 = var269;
                switch (var16 % (var17 + var18 - 2 * (var17 & var18))) {
                    case 0: {
                        var18 = var12;
                        var17 = var13;
                        var10002 = var17 & ~var18 | ~var17 & var18;
                        char var252 = var14[var16];
                        var17 = var10002;
                        var15[var16] = (char)((var17 | var252) & (~var17 | ~var252));
                        continue block6;
                    }
                    case 1: {
                        var18 = var13;
                        var17 = var5;
                        var10002 = (var17 | var18) - (var17 & var18);
                        char var250 = var14[var16];
                        var17 = var10002;
                        var15[var16] = (char)((var17 | var250) - (var17 & var250));
                    }
                }
            }
            return new String(var15);
        }
    }
}
