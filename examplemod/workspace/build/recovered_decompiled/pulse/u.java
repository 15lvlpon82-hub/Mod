/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_4587
 *  pulse.AnimationState
 *  pulse.Bool
 *  pulse.Easing
 *  pulse.Renderer2D
 *  pulse.eD
 *  pulse.et
 *  pulse.g
 *  pulse.t
 */
package pulse;

import java.awt.Color;
import net.minecraft.class_4587;
import pulse.AnimationState;
import pulse.Bool;
import pulse.Easing;
import pulse.Renderer2D;
import pulse.eD;
import pulse.et;
import pulse.g;
import pulse.t;

public class u {
    private static final float c = 2.0f;
    private static final float d = 10.0f;
    private static final float e = 15.0f;
    private static final float f = 25.0f;
    private float g = 0.0f;
    private float h = 0.0f;
    private final AnimationState i = new AnimationState();
    private boolean j;
    private float k;
    private float l;
    private final AnimationState m;
    private boolean n;
    private float o;
    private float p;
    private float q;
    private float r;
    private Color s;
    private Color t;
    private float u;
    private float v;
    private float w;
    private float x;
    private float y;
    public static int a;
    public static boolean b;

    public u() {
        int var2 = 1035775901;
        int var1 = 469256353;
        int var10001 = (var1 | var2) & (~var1 | ~var2);
        var2 = 642049852;
        var1 = var10001;
        this.j = Bool.from((int)(var1 + var2 - 2 * (var1 & var2)));
        this.k = 0.0f;
        this.l = 0.0f;
        this.m = new AnimationState();
        var2 = -1599316114;
        var1 = -1019833784;
        var10001 = (var1 | var2) & (~var1 | ~var2);
        var2 = 1671089446;
        var1 = var10001;
        this.n = Bool.from((int)((var1 | var2) - (var1 & var2)));
        this.o = 2.0f;
        var10001 = -2044069695;
        var2 = 1875650258;
        var1 = var10001;
        var10001 = var1 & ~var2 | ~var1 & var2;
        var2 = -668744156;
        var1 = var10001;
        var10001 = var1 + var2 - 2 * (var1 & var2);
        int var10002 = 74382298;
        var2 = -387472020;
        var1 = var10002;
        var10002 = (var1 | var2) & ~(var1 & var2);
        var2 = -1663491076;
        var1 = var10002;
        var2 = (var1 | var2) - (var1 & var2);
        var1 = var10001;
        var10001 = (var1 ^ var2) + 2 * (var1 & var2);
        this.p = 10.0f;
        " ".length();
        var2 = -1001400167;
        var1 = -536356302;
        var10002 = (var1 | var2) & (~var1 | ~var2);
        var2 = 608699044;
        var1 = var10002;
        var10002 = var1 & ~var2 | ~var1 & var2;
        "\ufffdb\ufffd".length();
        var10002 = 318869301;
        var2 = 852743047;
        var1 = var10002;
        var10002 = var1 & ~var2 | ~var1 & var2;
        var2 = 567434429;
        var1 = var10002;
        var10002 = var1 + var2 - 2 * (var1 & var2);
        "\ufffd\ufffd\ufffd|q".length();
        var10002 = 660532720;
        var2 = 1538555216;
        var1 = var10002;
        var10002 = (var1 | var2) & ~(var1 & var2);
        var2 = 2095747249;
        var1 = var10002;
        var10002 = (var1 | var2) & (~var1 | ~var2);
        "\ufffd\ufffd\u0010a\ufffdN\ufffd]\ufffd\ufffd\ufffd\ufffd0".length();
        var2 = 1998602607;
        var1 = 1534003569;
        var10002 = var1 & ~var2 | ~var1 & var2;
        var2 = 743393310;
        var1 = var10002;
        var10002 = (var1 | var2) - (var1 & var2);
        this.q = 15.0f;
        String var40 = "czm";
        this.r = 25.0f;
        this.s = pulse.g.b;
        this.t = pulse.g.d;
    }

    public u(float var1, float var2) {
        int var4 = -874984519;
        int var3 = 113339011;
        int var10001 = (var3 | var4) & (~var3 | ~var4);
        var4 = -853958342;
        var3 = var10001;
        this.j = Bool.from((int)(var3 + var4 - 2 * (var3 & var4)));
        this.k = 0.0f;
        this.l = 0.0f;
        this.m = new AnimationState();
        var4 = -877861484;
        var3 = -1962288426;
        var10001 = (var3 | var4) & ~(var3 & var4);
        var4 = 1084571458;
        var3 = var10001;
        this.n = Bool.from((int)(var3 & ~var4 | ~var3 & var4));
        this.o = 2.0f;
        var4 = -544179104;
        var3 = 800549025;
        var10001 = (var3 | var4) - (var3 & var4);
        var4 = -347530740;
        var3 = var10001;
        var10001 = ((var3 | var4) & ~(var3 & var4)) * ((var3 | var4) & ~(var3 & var4));
        this.p = 10.0f;
        var10001 = 1909843511;
        var4 = -1730928377;
        var3 = var10001;
        var10001 = var3 & ~var4 | ~var3 & var4;
        var4 = 1297610581;
        var3 = var10001;
        var10001 = var3 + var4 - 2 * (var3 & var4);
        int var10002 = -258003718;
        var4 = -187386420;
        var3 = var10002;
        var10002 = var3 + var4 - 2 * (var3 & var4);
        var4 = -643321733;
        var3 = var10002;
        var4 = var3 & ~var4 | ~var3 & var4;
        var3 = var10001;
        var10001 = (var3 & ~var4) + (var4 & ~var3) + 2 * (var3 & var4);
        this.q = 15.0f;
        "\ufffd>n*\ufffdL\ufffd/\ufffdot".length();
        var10002 = 1497820230;
        var4 = -192827796;
        var3 = var10002;
        var10002 = (var3 | var4) - (var3 & var4);
        var4 = -1379450330;
        var3 = var10002;
        var10002 = (var3 | var4) & ~(var3 & var4);
        "\ufffd\ufffdQW\ufffd\ufffdA".length();
        var10002 = 2070281665;
        var4 = 1222318951;
        var3 = var10002;
        var10002 = var3 & ~var4 | ~var3 & var4;
        var4 = 868148911;
        var3 = var10002;
        var10002 = var3 + var4 - 2 * (var3 & var4);
        this.r = 25.0f;
        this.s = pulse.g.b;
        this.t = pulse.g.d;
        this.o = var1;
        this.r = var2;
    }

    public void a(float var1) {
        this.o = var1;
    }

    public void b(float var1) {
        this.p = var1;
    }

    public void c(float var1) {
        this.q = var1;
    }

    public void d(float var1) {
        this.r = var1;
    }

    public void a(Color var1) {
        this.s = var1;
    }

    public void b(Color var1) {
        this.t = var1;
    }

    public void a() {
        if (!this.j) {
            this.i.a();
            this.g = (float)this.i.j();
        }
    }

    public boolean a(float var1, float var2) {
        int var12;
        if (!(var1 > var2)) {
            var12 = -1471329240;
            int var4 = -1526539001;
            int var3 = var12;
            var12 = var3 + var4 - 2 * (var3 & var4);
            var4 = 223318319;
            var3 = var12;
            var12 = var3 + var4 - 2 * (var3 & var4);
        } else {
            int var9 = 1722641568;
            int var6 = 577970144;
            var12 = var6 & ~var9 | ~var6 & var9;
            var9 = 1155429185;
            var6 = var12;
            var12 = (var6 | var9) & ~(var6 & var9);
        }
        return Bool.from((int)var12);
    }

    public float b() {
        return this.g;
    }

    public void e(float var1) {
        this.g = var1;
        this.h = var1;
        this.i.d((double)var1);
    }

    public boolean c() {
        return this.j;
    }

    public void a(class_4587 var1, Renderer2D var2, float var3, float var4, float var5, float var6, float var7, int var8, int var9, boolean var10) {
        if (!(var6 <= var7)) {
            int var107;
            this.u = var3;
            this.v = var4;
            this.w = var5;
            this.x = var6;
            this.y = var7;
            float var11 = var6 - var7;
            float var12 = this.g / var11;
            float var13 = var7 / var6;
            float var14 = Math.max(this.q, var5 * var13);
            float var15 = var4 + (var5 - var14) * var12;
            boolean var16 = pulse.t.a().b();
            if (!var10 && !var16 && eD.a((float)(var3 - this.p / 2.0f), (float)var4, (float)(this.o + this.p), (float)var5, (double)var8, (double)var9)) {
                int var68 = -1245753024;
                int var28 = 1225888403;
                var107 = (var28 | var68) - (var28 & var68);
                var68 = -55655470;
                var28 = var107;
                var107 = (var28 | var68) & ~(var28 & var68);
            } else {
                int var24 = 1400827256;
                int var23 = 670211395;
                var107 = var23 & ~var24 | ~var23 & var24;
                var24 = 1955360827;
                var23 = var107;
                var107 = (var23 | var24) - (var23 & var24);
            }
            int var17 = var107;
            if (!this.j && var17 == 0) {
                var107 = -1950793872;
                int var90 = -287470309;
                int var50 = var107;
                var107 = (var50 | var90) & (~var50 | ~var90);
                var90 = 1701098091;
                var50 = var107;
                var107 = var50 + var90 - 2 * (var50 & var90);
            } else {
                int var22;
                int var70 = 1803145412;
                int var30 = 2044786200;
                var107 = (var30 | var70) & ~(var30 & var70);
                var70 = 312026845;
                var30 = var107;
                var107 = (var30 | var70) & (~var30 | ~var70);
                var70 = 1447774180;
                var30 = -1780381444;
                int var10001 = var30 + var70 - 2 * (var30 & var70);
                var70 = -459316318;
                var30 = var10001;
                var10001 = (var30 | var70) & (~var30 | ~var70);
                var70 = 1733299253;
                var30 = -789900749;
                int var10002 = (var30 | var70) & (~var30 | ~var70);
                var70 = 1674375199;
                var30 = var10002;
                var70 = (var30 | var70) - (var30 & var70);
                var30 = var10001;
                var10001 = (var30 ^ var70) + 2 * (var30 & var70);
                var70 = -505359278;
                var30 = 940985788;
                var10001 = (var30 | var70) & ~(var30 & var70);
                var70 = -735170501;
                var30 = var10001;
                a = var22 = (var30 | var70) & (~var30 | ~var70);
                var70 = -1199455423;
                var30 = 1625912781;
                var10001 = var30 + var70 - 2 * (var30 & var70);
                var70 = -624609550;
                var30 = var10001;
                var10001 = (var30 | var70) & (~var30 | ~var70);
                var70 = 289139476;
                var30 = -1832187605;
                var10002 = var30 + var70 - 2 * (var30 & var70);
                var70 = 638759334;
                var30 = var10002;
                var70 = (var30 | var70) & (~var30 | ~var70);
                var30 = var10001;
                var10001 = (var30 ^ var70) + 2 * (var30 & var70);
                var70 = -846040149;
                var30 = -616749221;
                var10001 = var30 + var70 - 2 * (var30 & var70);
                if (((var30 = var10001) | (var70 = 268432304)) - (var30 & var70) < a) {
                    var10001 = -1092511318;
                    var70 = 20065666;
                    var30 = var10001;
                    var10001 = (var30 | var70) & ~(var30 & var70);
                    var70 = -1076644824;
                    var30 = var10001;
                    var10001 = (var30 | var70) & ~(var30 & var70);
                    var10002 = -2077289912;
                    var70 = 165195082;
                    var30 = var10002;
                    var10002 = (var30 | var70) & ~(var30 & var70);
                    var70 = -1913143550;
                    var30 = var10002;
                    var10001 /= (var30 | var70) & ~(var30 & var70);
                }
            }
            int var18 = var107;
            if (var16 && this.n) {
                int var25;
                String var143 = "czn";
                this.m.a(0.0, 0.15, Easing.h);
                int var135 = 1441791870;
                int var94 = 2057095654;
                int var54 = var135;
                var135 = var54 & ~var94 | ~var54 & var94;
                var94 = 796079768;
                var54 = var135;
                this.n = Bool.from((int)(var54 & ~var94 | ~var54 & var94));
                String var113 = "czo";
                var107 = -444191190;
                var94 = -1034997469;
                var54 = var107;
                var107 = (var54 | var94) & ~(var54 & var94);
                var94 = 721415720;
                var54 = var107;
                a = var25 = (var54 | var94) & ~(var54 & var94);
                String var116 = "czp";
                var107 = -1402919026;
                var94 = 1130439241;
                var54 = var107;
                var107 = (var54 | var94) & ~(var54 & var94);
                var94 = -494169073;
                var54 = var107;
                if ((var54 & ~var94 | ~var54 & var94) < a) {
                    var94 = -1909816511;
                    var54 = 135511572;
                    var107 = var54 & ~var94 | ~var54 & var94;
                    var94 = -1668618090;
                    var54 = var107;
                    var107 = (var54 | var94) & (~var54 | ~var94);
                    var94 = 1388192259;
                    var54 = 2118277542;
                    var135 = var54 + var94 - 2 * (var54 & var94);
                    var94 = 615781691;
                    var54 = var135;
                    var94 = (var54 | var94) - (var54 & var94);
                    var54 = var107;
                    var107 = 2 * (var54 | var94) - (var54 ^ var94);
                    var94 = 377472310;
                    var54 = 92339175;
                    var107 = (var54 | var94) - (var54 & var94);
                    var94 = -1224414531;
                    var54 = var107;
                    var25 = var54 + var94 - 2 * (var54 & var94);
                }
            } else if (!var16 && Bool.from((int)var18) != this.n) {
                double var134 = var18 == 0 ? 0.0 : 1.0;
                int var92 = -1102127117;
                int var52 = -1211628486;
                int var141 = (var52 | var92) - (var52 & var92);
                var92 = 299659260;
                var52 = var141;
                var141 = var52 + var92 - 2 * (var52 & var92);
                this.m.a(var134, 0.15, Easing.h);
                this.n = Bool.from((int)var18);
            }
            this.m.a();
            float var19 = (float)this.m.j();
            Color var20 = et.a((Color)this.s, (Color)this.t, (float)var19);
            var2.a(var3, var15, this.o, var14, this.o / 2.0f, var20, var1);
        }
    }

    public boolean a(float var1, float var2, float var3, float var4, float var5, int var6, int var7) {
        if (!(var4 <= var5)) {
            if (!eD.a((float)(var1 - this.p / 2.0f), (float)var2, (float)(this.o + this.p), (float)var3, (double)var6, (double)var7)) {
                int var26 = 1913294569;
                int var22 = -900673297;
                int var15 = var26;
                var26 = (var15 | var22) & ~(var15 & var22);
                var22 = -1202037242;
                var15 = var26;
                return Bool.from((int)((var15 | var22) - (var15 & var22)));
            }
            int var10001 = -1786170431;
            int var18 = -19485;
            int var11 = var10001;
            var10001 = var11 & ~var18 | ~var11 & var18;
            var18 = 1786150947;
            var11 = var10001;
            this.j = Bool.from((int)(var11 + var18 - 2 * (var11 & var18)));
            this.k = var7;
            this.l = this.g;
            var18 = 1011383090;
            var11 = -2119528817;
            int var25 = var11 & ~var18 | ~var11 & var18;
            var18 = -1109199428;
            var11 = var25;
            return Bool.from((int)(var11 + var18 - 2 * (var11 & var18)));
        }
        int var10000 = -421690952;
        int var9 = -1591435260;
        int var8 = var10000;
        var10000 = (var8 | var9) & (~var8 | ~var9);
        var9 = 1207509436;
        var8 = var10000;
        return Bool.from((int)((var8 | var9) - (var8 & var9)));
    }

    public void d() {
        if (this.j) {
            int var10001 = -1347291864;
            int var2 = 452995404;
            int var1 = var10001;
            var10001 = var1 + var2 - 2 * (var1 & var2);
            var2 = -1263412124;
            var1 = var10001;
            this.j = Bool.from((int)((var1 | var2) & (~var1 | ~var2)));
            this.h = this.g;
            this.i.d((double)this.g);
        }
    }

    public void a(int var1, float var2, float var3) {
        if (this.j && !(var2 <= var3)) {
            float var4 = var2 - var3;
            float var5 = this.w;
            float var6 = var3 / var2;
            float var7 = Math.max(this.q, var5 * var6);
            float var8 = var5 - var7;
            float var9 = (float)var1 - this.k;
            float var10 = var9 / var8 * var4;
            this.g = this.l + var10;
            this.h = this.g = Math.max(0.0f, Math.min(this.g, var4));
            this.i.d((double)this.g);
        }
    }

    public void a(float var1, float var2, float var3) {
        if (!this.j && !(var2 <= var3)) {
            float var4 = Math.max(0.0f, var2 - var3);
            this.h -= var1 * this.r;
            this.h = Math.max(0.0f, Math.min(this.h, var4));
            double var10001 = this.h;
            int var10002 = -1081721421;
            int var6 = -1541587521;
            int var5 = var10002;
            var10002 = var5 & ~var6 | ~var5 & var6;
            var6 = -62166615;
            var5 = var10002;
            var10002 = (var5 & ~var6 | ~var5 & var6) * (var5 & ~var6 | ~var5 & var6);
            this.i.a(var10001, 0.15, Easing.h);
        }
    }

    public void e() {
        this.g = 0.0f;
        this.h = 0.0f;
        this.i.d(0.0);
        int var2 = 1010506136;
        int var1 = -141872958;
        int var10001 = (var1 | var2) - (var1 & var2);
        var2 = -877647526;
        var1 = var10001;
        this.j = Bool.from((int)((var1 | var2) - (var1 & var2)));
    }

    public void b(float var1, float var2) {
        if (!(var1 <= var2)) {
            float var3 = var1 - var2;
            if (this.g > var3 || this.h > var3) {
                this.h = var3;
                double var10001 = var3;
                int var13 = 111066792;
                int var10 = -1653765479;
                int var7 = var13;
                var13 = (var7 | var10) & ~(var7 & var10);
                var10 = 939550926;
                var7 = var13;
                var13 = (var7 | var10) - (var7 & var10);
                this.i.a(var10001, 0.15, Easing.h);
            }
        } else if (this.g > 0.0f || this.h > 0.0f) {
            this.h = 0.0f;
            int var5 = 375846814;
            int var4 = 854766246;
            int var10002 = (var4 | var5) & (~var4 | ~var5);
            var5 = 448925575;
            var4 = var10002;
            var10002 = (var4 & ~var5 | ~var4 & var5) * (var4 & ~var5 | ~var4 & var5);
            this.i.a(0.0, 0.15, Easing.h);
        }
    }

    public static String a(String var0, String var1, int var2, int var3, int var4, int var5) {
        char[] var6 = var1.toCharArray();
        char[] var7 = new char[var6.length];
        int var18 = 347393172;
        int var17 = 1772475112;
        int var10000 = (var17 | var18) - (var17 & var18);
        var18 = 2098273910;
        var17 = var10000;
        char[] var253 = new char[var17 & ~var18 | ~var17 & var18];
        var18 = 400607597;
        var17 = 100875798;
        int var10002 = (var17 | var18) & ~(var17 & var18);
        var18 = 300152699;
        var17 = var10002;
        var10002 = (var17 | var18) & ~(var17 & var18);
        var18 = -42999097;
        var17 = -1154519818;
        int var10003 = (var17 | var18) - (var17 & var18);
        var18 = 1178650115;
        var17 = var10003;
        var253[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
        var18 = 575934444;
        var17 = -607486956;
        var10002 = var17 & ~var18 | ~var17 & var18;
        var18 = -107056135;
        var17 = var10002;
        var10002 = var17 & ~var18 | ~var17 & var18;
        var10003 = -607599059;
        var18 = -752237547;
        var17 = var10003;
        var10003 = (var17 | var18) & ~(var17 & var18);
        var18 = 148971965;
        var17 = var10003;
        var253[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
        var10002 = 274328678;
        var18 = 757254482;
        var17 = var10002;
        var10002 = (var17 | var18) & ~(var17 & var18);
        var18 = 1031480630;
        var17 = var10002;
        var10002 = (var17 | var18) & ~(var17 & var18);
        var10003 = 2054676632;
        var18 = -735523769;
        var17 = var10003;
        var10003 = var17 + var18 - 2 * (var17 & var18);
        var18 = -1369501863;
        var17 = var10003;
        var253[var10002] = (char)((var17 | var18) - (var17 & var18));
        var18 = -395274505;
        var17 = -1183444974;
        var10002 = var17 + var18 - 2 * (var17 & var18);
        var18 = 1359382246;
        var17 = var10002;
        var10002 = (var17 | var18) & (~var17 | ~var18);
        var10003 = 1239733225;
        var18 = -1499987368;
        var17 = var10003;
        var10003 = var17 + var18 - 2 * (var17 & var18);
        var18 = -1998878742;
        var17 = var10003;
        var10003 = var17 & ~var18 | ~var17 & var18;
        var18 = -1786349363;
        var17 = -528385321;
        int var10004 = (var17 | var18) - (var17 & var18);
        var18 = -272928448;
        var17 = var10004;
        var18 = (var17 | var18) & (~var17 | ~var18);
        var17 = var10003;
        var10003 = 2 * (var17 | var18) - (var17 ^ var18);
        var18 = -835297784;
        var17 = -472539503;
        var10003 = (var17 | var18) & (~var17 | ~var18);
        var18 = 769874058;
        var17 = var10003;
        var253[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
        var10002 = -439824164;
        var18 = -1880474999;
        var17 = var10002;
        var10002 = var17 & ~var18 | ~var17 & var18;
        var18 = 1780673105;
        var17 = var10002;
        var10002 = (var17 | var18) & ~(var17 & var18);
        var18 = 992478894;
        var17 = 928391218;
        var10003 = var17 + var18 - 2 * (var17 & var18);
        var18 = -522471723;
        var17 = var10003;
        var10003 = (var17 | var18) & (~var17 | ~var18);
        var10003 = 782202352;
        var18 = -846697045;
        var17 = var10003;
        var10003 = (var17 | var18) & ~(var17 & var18);
        var18 = -484996738;
        var17 = var10003;
        var253[var10002] = (char)((var17 | var18) & ~(var17 & var18));
        var10002 = 1559510673;
        var18 = 644702562;
        var17 = var10002;
        var10002 = (var17 | var18) & ~(var17 & var18);
        var18 = 2056871926;
        var17 = var10002;
        var10002 = (var17 | var18) & ~(var17 & var18);
        var10003 = 76188808;
        var18 = -816881525;
        var17 = var10003;
        var10003 = var17 & ~var18 | ~var17 & var18;
        var18 = -876238463;
        var17 = var10003;
        var253[var10002] = (char)((var17 | var18) & ~(var17 & var18));
        var18 = 1664163499;
        var17 = 810762781;
        var10002 = var17 & ~var18 | ~var17 & var18;
        var18 = 1398955184;
        var17 = var10002;
        var10002 = var17 + var18 - 2 * (var17 & var18);
        var18 = -1642397672;
        var17 = -756875115;
        var10003 = (var17 | var18) & (~var17 | ~var18);
        var18 = 1291323806;
        var17 = var10003;
        var253[var10002] = (char)((var17 | var18) & ~(var17 & var18));
        var10002 = 537339955;
        var18 = 587503257;
        var17 = var10002;
        var10002 = var17 & ~var18 | ~var17 & var18;
        var18 = 50577069;
        var17 = var10002;
        var10002 = (var17 | var18) - (var17 & var18);
        var10003 = -1872750944;
        var18 = -1147129164;
        var17 = var10003;
        var10003 = (var17 | var18) & ~(var17 & var18);
        var18 = 734007350;
        var17 = var10003;
        var253[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
        var10002 = -2134081949;
        var18 = -1929025969;
        var17 = var10002;
        var10002 = (var17 | var18) & (~var17 | ~var18);
        var18 = 231282724;
        var17 = var10002;
        var10002 = (var17 | var18) & (~var17 | ~var18);
        var18 = -1189630105;
        var17 = 1222832221;
        var10003 = (var17 | var18) & ~(var17 & var18);
        var18 = -235579543;
        var17 = var10003;
        var253[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
        var10002 = 36543198;
        var18 = 548236108;
        var17 = var10002;
        var10002 = var17 + var18 - 2 * (var17 & var18);
        var18 = 578875803;
        var17 = var10002;
        var10002 = var17 & ~var18 | ~var17 & var18;
        var10003 = 498007737;
        var18 = -289282929;
        var17 = var10003;
        var10003 = (var17 | var18) & ~(var17 & var18);
        var18 = -210821870;
        var17 = var10003;
        var253[var10002] = (char)((var17 | var18) & ~(var17 & var18));
        char[] var8 = var253;
        var10000 = -815846649;
        var18 = -1361943254;
        var17 = var10000;
        var10000 = (var17 | var18) - (var17 & var18);
        var18 = 1636650535;
        var17 = var10000;
        char[] var256 = new char[(var17 | var18) - (var17 & var18)];
        var10002 = -1644981294;
        var18 = -173895046;
        var17 = var10002;
        var10002 = (var17 | var18) & (~var17 | ~var18);
        var18 = 1750139304;
        var17 = var10002;
        var10002 = (var17 | var18) - (var17 & var18);
        var10003 = -2142163388;
        var18 = 796899562;
        var17 = var10003;
        var10003 = (var17 | var18) - (var17 & var18);
        var18 = -1355882866;
        var17 = var10003;
        var256[var10002] = (char)((var17 | var18) & ~(var17 & var18));
        var10002 = -1036822878;
        var18 = 835068639;
        var17 = var10002;
        var10002 = (var17 | var18) & (~var17 | ~var18);
        var18 = -202017668;
        var17 = var10002;
        var10002 = (var17 | var18) & ~(var17 & var18);
        var10003 = 812790766;
        var18 = 1445288153;
        var17 = var10003;
        var10003 = var17 & ~var18 | ~var17 & var18;
        var18 = -1332897167;
        var17 = var10003;
        var10003 = (var17 | var18) - (var17 & var18);
        var18 = -1875662994;
        var17 = 1297498885;
        var10003 = (var17 | var18) & ~(var17 & var18);
        var18 = -580558744;
        var17 = var10003;
        var256[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
        var18 = -1633165042;
        var17 = 233588778;
        var10002 = (var17 | var18) & (~var17 | ~var18);
        var18 = -1823758042;
        var17 = var10002;
        var10002 = (var17 | var18) & (~var17 | ~var18);
        "\ufffd\ufffd\u0001I\u001f\ufffd\ufffdy\ufffd".length();
        var10004 = 1307308033;
        var18 = -513499544;
        var17 = var10004;
        var10004 = var17 & ~var18 | ~var17 & var18;
        var18 = -1399886216;
        var17 = var10004;
        var10004 = (var17 | var18) - (var17 & var18);
        "\u001a?\ufffd!\ufffd$at\ufffd+E\u0014\u0019".length();
        var18 = -1835206085;
        var17 = 1177208775;
        var10004 = (var17 | var18) - (var17 & var18);
        var18 = -726254087;
        var17 = var10004;
        var10004 = var17 + var18 - 2 * (var17 & var18);
        var10003 = 1371771668;
        var18 = -1827270174;
        var17 = var10003;
        var10003 = var17 & ~var18 | ~var17 & var18;
        var18 = -1026226779;
        var17 = var10003;
        var256[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
        var10002 = 1954474534;
        var18 = 220616970;
        var17 = var10002;
        var10002 = (var17 | var18) - (var17 & var18);
        var18 = 2035856175;
        var17 = var10002;
        var10002 = var17 + var18 - 2 * (var17 & var18);
        var18 = 1351636731;
        var17 = 1752415592;
        var10003 = (var17 | var18) & ~(var17 & var18);
        var18 = 954454929;
        var17 = var10003;
        var256[var10002] = (char)((var17 | var18) - (var17 & var18));
        var18 = -754064289;
        var17 = -1638928442;
        var10002 = (var17 | var18) - (var17 & var18);
        var18 = 1296173981;
        var17 = var10002;
        var10002 = (var17 | var18) - (var17 & var18);
        var10003 = 2118447362;
        var18 = 1921281880;
        var17 = var10003;
        var10003 = (var17 | var18) & ~(var17 & var18);
        var18 = 213952026;
        var17 = var10003;
        var256[var10002] = (char)((var17 | var18) & ~(var17 & var18));
        var10002 = 49990795;
        var18 = -259070057;
        var17 = var10002;
        var10002 = var17 & ~var18 | ~var17 & var18;
        var18 = -227267815;
        var17 = var10002;
        var10002 = var17 + var18 - 2 * (var17 & var18);
        var10003 = 1934392729;
        var18 = -206804495;
        var17 = var10003;
        var10003 = var17 & ~var18 | ~var17 & var18;
        var18 = -2132792068;
        var17 = var10003;
        var256[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
        var18 = 1863895904;
        var17 = 533531263;
        var10002 = (var17 | var18) - (var17 & var18);
        var18 = 1893056793;
        var17 = var10002;
        var10002 = (var17 | var18) - (var17 & var18);
        var10003 = -803249017;
        var18 = 544131755;
        var17 = var10003;
        var10003 = var17 & ~var18 | ~var17 & var18;
        var18 = 440961161;
        var17 = var10003;
        var10003 = var17 & ~var18 | ~var17 & var18;
        var10003 = 2129125987;
        var18 = -1848975784;
        var17 = var10003;
        var10003 = (var17 | var18) & (~var17 | ~var18);
        var18 = -282215678;
        var17 = var10003;
        var256[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
        var10002 = -684501123;
        var18 = -72372697;
        var17 = var10002;
        var10002 = var17 + var18 - 2 * (var17 & var18);
        var18 = 748484957;
        var17 = var10002;
        var10002 = (var17 | var18) & ~(var17 & var18);
        var10003 = 413168327;
        var18 = -121131276;
        var17 = var10003;
        var10003 = (var17 | var18) & (~var17 | ~var18);
        var18 = -530068469;
        var17 = var10003;
        var256[var10002] = (char)((var17 | var18) & ~(var17 & var18));
        var18 = 75050411;
        var17 = -157688564;
        var10002 = var17 & ~var18 | ~var17 & var18;
        var18 = -220139345;
        var17 = var10002;
        var10002 = (var17 | var18) - (var17 & var18);
        var18 = 1925263342;
        var17 = -351324221;
        var10003 = (var17 | var18) & (~var17 | ~var18);
        var18 = -1954668507;
        var17 = var10003;
        var10003 = (var17 + var18 - 2 * (var17 & var18)) * (var17 + var18 - 2 * (var17 & var18));
        var18 = 1064237008;
        var17 = 281204578;
        var10003 = var17 + var18 - 2 * (var17 & var18);
        var18 = 799843254;
        var17 = var10003;
        var256[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
        var10002 = -1764540441;
        var18 = 1120720414;
        var17 = var10002;
        var10002 = var17 & ~var18 | ~var17 & var18;
        var18 = -736106000;
        var17 = var10002;
        var10002 = var17 & ~var18 | ~var17 & var18;
        var10003 = -624947946;
        var18 = -1860834154;
        var17 = var10003;
        var10003 = (var17 | var18) & (~var17 | ~var18);
        var18 = 1272304307;
        var17 = var10003;
        var256[var10002] = (char)((var17 | var18) - (var17 & var18));
        char[] var9 = var256;
        var10000 = -1640130658;
        var18 = -1888690299;
        var17 = var10000;
        var10000 = var17 + var18 - 2 * (var17 & var18);
        var18 = 290539547;
        var17 = var10000;
        for (int var10 = (var17 | var18) - (var17 & var18); var10 < var6.length; ++var10) {
            char var314 = var6[var10];
            char var239 = var8[var10 % var8.length];
            char var123 = var314;
            var7[var10] = (char)((var123 | var239) & (~var123 | ~var239));
        }
        char[] var19 = new char[var7.length];
        var10000 = -946425158;
        var18 = 1912346617;
        var17 = var10000;
        var10000 = (var17 | var18) & (~var17 | ~var18);
        var18 = -1234524861;
        var17 = var10000;
        for (int var11 = (var17 | var18) & (var17 ^ 0xFFFFFFFF | var18 ^ 0xFFFFFFFF); var11 < var6.length; ++var11) {
            char var315 = var7[var11];
            char var242 = var9[var11 % var9.length];
            char var126 = var315;
            var19[var11] = (char)((var126 | var242) & ~(var126 & var242));
        }
        String var20 = new String(var19);
        int var12 = var20.hashCode();
        var18 = var5;
        var17 = var3;
        var10000 = var17 + ~var18 + 1;
        var18 = var2;
        var17 = var10000;
        int var13 = 2 * (var17 & ~var18) - (var17 ^ var18);
        char[] var14 = var0.toCharArray();
        char[] var15 = new char[var14.length];
        var18 = 316378176;
        var17 = -1651220971;
        var10000 = (var17 | var18) - (var17 & var18);
        var18 = -1890594219;
        var17 = var10000;
        block6: for (int var16 = (var17 | var18) & (var17 ^ 0xFFFFFFFF | var18 ^ 0xFFFFFFFF); var16 < var15.length; ++var16) {
            var18 = 1183094056;
            var17 = 641516456;
            int var10001 = var17 + var18 - 2 * (var17 & var18);
            var18 = 1622693506;
            var17 = var10001;
            switch (var16 % ((var17 | var18) - (var17 & var18))) {
                case 0: {
                    var18 = var12;
                    var17 = var13;
                    var10002 = var17 + var18 - 2 * (var17 & var18);
                    char var252 = var14[var16];
                    var17 = var10002;
                    var15[var16] = (char)(var17 & ~var252 | ~var17 & var252);
                    continue block6;
                }
                case 1: {
                    var18 = var13;
                    var17 = var5;
                    var10002 = (var17 | var18) & ~(var17 & var18);
                    char var250 = var14[var16];
                    var17 = var10002;
                    var15[var16] = (char)((var17 | var250) - (var17 & var250));
                }
            }
        }
        return new String(var15);
    }
}
