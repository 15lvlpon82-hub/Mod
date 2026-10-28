/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_2960
 *  net.minecraft.class_4587
 *  org.joml.Quaternionf
 *  pulse.AnimationState
 *  pulse.Bool
 *  pulse.Easing
 *  pulse.FontManager
 *  pulse.FontRenderer
 *  pulse.Renderer2D
 *  pulse.eD
 *  pulse.g
 */
package pulse;

import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import java.util.function.Consumer;
import net.minecraft.class_2960;
import net.minecraft.class_4587;
import org.joml.Quaternionf;
import pulse.AnimationState;
import pulse.Bool;
import pulse.Easing;
import pulse.FontManager;
import pulse.FontRenderer;
import pulse.Renderer2D;
import pulse.eD;
import pulse.eN;
import pulse.g;

public class p {
    private static final p c = new p();
    private static final float d = 84.5f;
    private static final float e = 10.5f;
    private static final float f = 7.0f;
    private static final float g = 9.5f;
    private static final float h = 63.5f;
    private static final float i = 41.5f;
    private static final float j = 7.0f;
    private static final float k = 4.0f;
    private static final float l = 2.0f;
    private static final float m = 9.0f;
    private static final float n = 1.5f;
    private static final float o = 3.0f;
    private static final float p = 7.0f;
    private static final float q = 1.0f;
    private boolean r;
    private final AnimationState s;
    private float t;
    private float u;
    private Edge v;
    private String w;
    private float x;
    private float y;
    private float z;
    private float A;
    private Consumer<Color> B;
    private boolean C;
    private boolean D;
    private float E;
    private float F;
    private float G;
    private float H;
    private float I;
    private float J;
    private float K;
    private float L;
    private float M;
    private float N;
    private float O;
    private float P;
    private float Q;
    private float R;
    private float S;
    public static int a;
    public static boolean b;

    private p() {
        int var2 = 508808417;
        int var1 = -1863673775;
        int var10001 = var1 + var2 - 2 * (var1 & var2);
        var2 = -1900456784;
        var1 = var10001;
        this.r = Bool.from((int)(var1 & ~var2 | ~var1 & var2));
        this.s = new AnimationState();
        this.v = Edge.BOTTOM;
        var2 = 250326980;
        var1 = -81285150;
        var10001 = var1 + var2 - 2 * (var1 & var2);
        var2 = 1266667087;
        var1 = var10001;
        var10001 = var1 & ~var2 | ~var1 & var2;
        int var10002 = 2113791962;
        var2 = -685138640;
        var1 = var10002;
        var10002 = (var1 | var2) - (var1 & var2);
        var2 = -1489645917;
        var1 = var10002;
        var2 = var1 + var2 - 2 * (var1 & var2);
        var1 = var10001;
        var10001 = 2 * (var1 | var2) - (var1 ^ var2);
        var2 = 1376017068;
        var1 = 1627927358;
        var10002 = (var1 | var2) - (var1 & var2);
        var2 = -1447418657;
        var1 = var10002;
        var10002 = var1 & ~var2 | ~var1 & var2;
        int var10003 = -336555195;
        var2 = -846859120;
        var1 = var10003;
        var10003 = var1 + var2 - 2 * (var1 & var2);
        var2 = 324422766;
        var1 = var10003;
        var10003 = (var1 | var2) & ~(var1 & var2);
        var2 = -874988411;
        var1 = -1404988358;
        var10003 = (var1 | var2) & (~var1 | ~var2);
        var2 = -1039478166;
        var1 = var10003;
        var10003 = var1 + var2 - 2 * (var1 & var2);
        var2 = 596742184;
        var1 = -391058755;
        int var10004 = var1 + var2 - 2 * (var1 & var2);
        var2 = 1800099107;
        var1 = var10004;
        var10004 = (var1 & ~var2 | ~var1 & var2) * (var1 & ~var2 | ~var1 & var2);
        var2 = -1509958419;
        var1 = -1920321890;
        var10004 = (var1 | var2) & ~(var1 & var2);
        var2 = 980823712;
        var1 = var10004;
        var10004 = var1 & ~var2 | ~var1 & var2;
        "\u0003\ufffd".length();
        var2 = -636169333;
        var1 = -114064478;
        int var10006 = (var1 | var2) & (~var1 | ~var2);
        var2 = 589778988;
        var1 = var10006;
        var10006 = var1 + var2 - 2 * (var1 & var2);
        "\u001f\ufffd\u00e6g1X".length();
        var10006 = 396237549;
        var2 = 978808713;
        var1 = var10006;
        var10006 = (var1 | var2) & (~var1 | ~var2);
        var2 = 768177510;
        var1 = var10006;
        var10006 = (var1 | var2) & ~(var1 & var2);
        "l\u0012?\ufffdRZ; \u0019\ufffd,\u0019".length();
        var2 = -1102476984;
        var1 = 1075847893;
        var10006 = (var1 | var2) - (var1 & var2);
        var2 = -26629229;
        var1 = var10006;
        var10006 = var1 & ~var2 | ~var1 & var2;
        var2 = -2010288186;
        var1 = 549959728;
        int var10005 = var1 + var2 - 2 * (var1 & var2);
        var2 = -1294412637;
        var1 = var10005;
        var10005 = (var1 | var2) & ~(var1 & var2);
        var10006 = 1348542551;
        var2 = 1275923984;
        var1 = var10006;
        var10006 = var1 + var2 - 2 * (var1 & var2);
        var2 = -1230723805;
        var1 = var10006;
        var10006 = (var1 | var2) & (~var1 | ~var2);
        var10006 = -1927209539;
        var2 = -760849056;
        var1 = var10006;
        var10006 = var1 & ~var2 | ~var1 & var2;
        var2 = 1603700561;
        var1 = var10006;
        this.w = pulse.p.a("", "`\ua7f3\ua4fa\ua061\ua910\u7d7a\u8e59\u247f\u8b78\u3474~\ua7ef\ua4b6\ua07a\ua902\u7d63\u8e43\u2435\u8b34\u3478\u007f\ua7eb\ua4ba\ua07f\ua94a\u7d55\u8e45\u2476\u8b38\u3465B\ua7ef\ua4b6\ua07a\ua900\u7d64\u8e6f\u2476\u8b32\u347aw\ua7e8\ua4a1", var10003, var10004, var10005, (var1 | var2) & (~var1 | ~var2));
        this.x = 1.0f;
        var2 = -517428328;
        var1 = -1567540253;
        var10001 = var1 & ~var2 | ~var1 & var2;
        var2 = 1136234619;
        var1 = var10001;
        this.C = Bool.from((int)((var1 | var2) & (~var1 | ~var2)));
        var10001 = -938527803;
        var2 = 439565643;
        var1 = var10001;
        var10001 = var1 + var2 - 2 * (var1 & var2);
        var2 = -767816050;
        var1 = var10001;
        this.D = Bool.from((int)(var1 & ~var2 | ~var1 & var2));
    }

    public static p a() {
        return c;
    }

    public void a(float var1, float var2, Edge var3, String var4, Color var5, float var6, Consumer<Color> var7) {
        String var10001;
        if (this.r) {
            this.b();
        }
        this.t = var1;
        this.u = var2;
        Edge edge = this.v = var3 != null ? var3 : Edge.BOTTOM;
        if (var4 != null) {
            var10001 = var4;
        } else {
            int var95 = -1661046047;
            int var10 = -637894014;
            int var9 = var95;
            int var96 = (var9 | var10) - (var9 & var10);
            var10 = 279029537;
            var9 = var96;
            int var97 = (var9 | var10) & (~var9 | ~var10);
            var10 = -373317112;
            var9 = -1885632990;
            int var10002 = var9 + var10 - 2 * (var9 & var10);
            var10 = 756409668;
            var9 = var10002;
            var10 = (var9 | var10) & ~(var9 & var10);
            var9 = var97;
            int var98 = var9 - ~var10 - 1;
            "".length();
            var10 = 824851856;
            var9 = -1779470260;
            int var10003 = var9 + var10 - 2 * (var9 & var10);
            var10 = -1530573351;
            var9 = var10003;
            var10003 = (var9 | var10) & (~var9 | ~var10);
            "\ufffd&9D\ufffdkKb\ufffdk".length();
            var10003 = 1660020815;
            var10 = -253968056;
            var9 = var10003;
            var10003 = (var9 | var10) & ~(var9 & var10);
            var10 = -1842534131;
            var9 = var10003;
            var10003 = (var9 | var10) - (var9 & var10);
            "\ufffd\ufffd\ufffdD\ufffd\ufffd\ufffd\u001e3".length();
            var10 = 965047407;
            var9 = -1222180971;
            var10003 = (var9 | var10) & (~var9 | ~var10);
            var10 = -1901884430;
            var9 = var10003;
            var10003 = (var9 | var10) - (var9 & var10);
            var10 = -1559961886;
            var9 = -818486316;
            var10003 = (var9 | var10) & ~(var9 & var10);
            var10 = 269183430;
            var9 = var10003;
            var10003 = (var9 & ~var10 | ~var9 & var10) * (var9 & ~var10 | ~var9 & var10);
            var10 = 52494447;
            var9 = -1357137915;
            var10003 = (var9 | var10) & (~var9 | ~var10);
            var10 = 162087615;
            var9 = var10003;
            var10003 = var9 & ~var10 | ~var9 & var10;
            int var10004 = -1961781840;
            var10 = -1942938277;
            var9 = var10004;
            var10004 = (var9 | var10) - (var9 & var10);
            var10 = -2139186807;
            var9 = var10004;
            var10004 = ((var9 | var10) - (var9 & var10)) * ((var9 | var10) - (var9 & var10));
            var10004 = 1852001741;
            var10 = 368416891;
            var9 = var10004;
            var10004 = (var9 | var10) & ~(var9 & var10);
            var10 = -564490845;
            var9 = var10004;
            var10004 = (var9 | var10) & (~var9 | ~var10);
            var10 = 1815470510;
            var9 = 2128924420;
            int var10005 = (var9 | var10) - (var9 & var10);
            var10 = -937609386;
            var9 = var10005;
            var10005 = (var9 | var10) & (~var9 | ~var10);
            int var10006 = 97171504;
            var10 = -567898242;
            var9 = var10006;
            var10006 = var9 + var10 - 2 * (var9 & var10);
            var10 = -189691211;
            var9 = var10006;
            var10 = var9 + var10 - 2 * (var9 & var10);
            var9 = var10005;
            var10005 = 2 * (var9 | var10) - (var9 ^ var10);
            var10005 = -261979665;
            var10 = 557847310;
            var9 = var10005;
            var10005 = (var9 | var10) & ~(var9 & var10);
            var10 = -237575588;
            var9 = var10005;
            var10005 = var9 & ~var10 | ~var9 & var10;
            var10 = -1760323995;
            var9 = 1036328044;
            var10006 = (var9 | var10) & (~var9 | ~var10);
            var10 = -1026169921;
            var9 = var10006;
            var10006 = var9 & ~var10 | ~var9 & var10;
            var10006 = 1903832684;
            var10 = 438271280;
            var9 = var10006;
            var10006 = (var9 | var10) & ~(var9 & var10);
            var10 = 1801545130;
            var9 = var10006;
            var10001 = pulse.p.a("", "`\ua7f3\ua4fa\ua061\ua910\u7d7a\u8e59\u247f\u8b78\u3474~\ua7ef\ua4b6\ua07a\ua902\u7d63\u8e43\u2435\u8b34\u3478\u007f\ua7eb\ua4ba\ua07f\ua94a\u7d55\u8e45\u2476\u8b38\u3465B\ua7ef\ua4b6\ua07a\ua900\u7d64\u8e6f\u2476\u8b32\u347aw\ua7e8\ua4a1", var10003, var10004, var10005, var9 & ~var10 | ~var9 & var10);
        }
        this.w = var10001;
        this.x = var6;
        this.B = var7;
        float[] var8 = Color.RGBtoHSB(var5.getRed(), var5.getGreen(), var5.getBlue(), null);
        int var82 = 1610623199;
        int var40 = -1751340660;
        int var100 = (var40 | var82) & (~var40 | ~var82);
        var82 = -140738221;
        var40 = var100;
        this.y = var8[var40 + var82 - 2 * (var40 & var82)];
        var100 = 870720528;
        var82 = 1953349924;
        var40 = var100;
        var100 = var40 + var82 - 2 * (var40 & var82);
        var82 = 1200350517;
        var40 = var100;
        this.z = var8[(var40 | var82) - (var40 & var82)];
        var100 = -729317611;
        var82 = -1592270086;
        var40 = var100;
        var100 = (var40 | var82) & (~var40 | ~var82);
        var82 = 1972411885;
        var40 = var100;
        this.A = var8[(var40 | var82) & ~(var40 & var82)];
        var82 = 513689485;
        var40 = -1172378675;
        int var99 = var40 + var82 - 2 * (var40 & var82);
        var82 = -1535071167;
        var40 = var99;
        this.r = Bool.from((int)(var40 + var82 - 2 * (var40 & var82)));
        this.s.d(0.0);
        var100 = -557858500;
        var82 = -1183748177;
        var40 = var100;
        var100 = (var40 | var82) & ~(var40 & var82);
        var82 = 696725235;
        var40 = var100;
        var100 = (var40 | var82) & ~(var40 & var82);
        int var119 = -615834526;
        var82 = -1120669099;
        var40 = var119;
        var119 = var40 + var82 - 2 * (var40 & var82);
        var82 = -1941420297;
        var40 = var119;
        var82 = (var40 | var82) - (var40 & var82);
        var40 = var100;
        var100 = (var40 ^ var82) + 2 * (var40 & var82);
        this.s.a(1.0, 0.2, Easing.h);
    }

    public void a(float var1, float var2, String var3, Color var4, float var5, Consumer<Color> var6) {
        this.a(var1, var2, Edge.BOTTOM, var3, var4, var5, var6);
    }

    public void b() {
        if (this.r) {
            int var2 = 1174382390;
            int var1 = -515730322;
            int var10001 = (var1 | var2) & (~var1 | ~var2);
            var2 = -1531104424;
            var1 = var10001;
            this.r = Bool.from((int)((var1 | var2) & (~var1 | ~var2)));
            String var10002 = "dbj";
            this.s.a(0.0, 0.15, Easing.h);
            var10001 = 1339489628;
            var2 = -1325055007;
            var1 = var10001;
            var10001 = (var1 | var2) - (var1 & var2);
            var2 = -19677507;
            var1 = var10001;
            this.C = Bool.from((int)((var1 | var2) - (var1 & var2)));
            var2 = -1525370662;
            var1 = -1774313039;
            var10001 = (var1 | var2) - (var1 & var2);
            var2 = 858427755;
            var1 = var10001;
            this.D = Bool.from((int)((var1 | var2) & ~(var1 & var2)));
        }
    }

    public boolean c() {
        if (!this.r) {
            double var10000 = this.s.j();
            int var10001 = 745058927;
            int var2 = -1737562809;
            int var1 = var10001;
            var10001 = (var1 | var2) & ~(var1 & var2);
            var2 = 1450222198;
            var1 = var10001;
            var10001 = (var1 | var2) - (var1 & var2);
            if (!(var10000 > 0.01)) {
                int var15 = -338082243;
                var2 = -326642215;
                var1 = var15;
                int var16 = var1 & ~var2 | ~var1 & var2;
                var2 = 123638756;
                var1 = var16;
                return Bool.from((int)(var1 & ~var2 | ~var1 & var2));
            }
        }
        int var9 = 1396331532;
        int var4 = 1874422539;
        int var13 = (var4 | var9) & ~(var4 & var9);
        var9 = 1015234310;
        var4 = var13;
        return Bool.from((int)(var4 + var9 - 2 * (var4 & var9)));
    }

    public boolean d() {
        if (this.r) {
            double var10000 = this.s.j();
            int var10001 = 1600000859;
            int var2 = 172582295;
            int var1 = var10001;
            var10001 = var1 + var2 - 2 * (var1 & var2);
            var2 = 1990289557;
            var1 = var10001;
            var10001 = (var1 | var2) & (~var1 | ~var2);
            int var10002 = 538106630;
            var2 = 42623336;
            var1 = var10002;
            var10002 = (var1 | var2) & (~var1 | ~var2);
            var2 = 624879188;
            var1 = var10002;
            var2 = (var1 | var2) & (~var1 | ~var2);
            var1 = var10001;
            var10001 = (var1 & ~var2) + (var2 & ~var1) + 2 * (var1 & var2);
            if (var10000 > 0.5) {
                var2 = 2077551655;
                var1 = 16100014;
                int var22 = var1 + var2 - 2 * (var1 & var2);
                var2 = 2065778312;
                var1 = var22;
                return Bool.from((int)((var1 | var2) - (var1 & var2)));
            }
        }
        int var19 = 2023175397;
        int var15 = -1571562351;
        int var7 = var19;
        var19 = (var7 | var15) - (var7 & var15);
        var15 = -624629644;
        var7 = var19;
        return Bool.from((int)((var7 | var15) & (~var7 | ~var15)));
    }

    public Color e() {
        return Color.getHSBColor(this.y, this.z, this.A);
    }

    public float[] f() {
        if (this.c()) {
            float var1 = (float)this.s.j();
            float var2 = this.G * var1;
            float var3 = this.H * var1;
            float var4 = this.I - var2 / 2.0f;
            float var5 = this.J - var3 / 2.0f;
            int var10000 = 829105602;
            int var7 = 2132102124;
            int var6 = var10000;
            var10000 = (var6 | var7) - (var6 & var7);
            var7 = 1316908586;
            var6 = var10000;
            float[] var27 = new float[var6 + var7 - 2 * (var6 & var7)];
            int var10002 = 60854899;
            var7 = -1314099570;
            var6 = var10002;
            var10002 = (var6 | var7) & ~(var6 & var7);
            var7 = -1307771651;
            var6 = var10002;
            var27[var6 + var7 - 2 * (var6 & var7)] = var4;
            var7 = 1512763410;
            var6 = 1819678637;
            var10002 = var6 & ~var7 | ~var6 & var7;
            var7 = 912058302;
            var6 = var10002;
            var27[(var6 | var7) & (var6 ^ 0xFFFFFFFF | var7 ^ 0xFFFFFFFF)] = var5;
            var10002 = 921335709;
            var7 = 713107950;
            var6 = var10002;
            var10002 = (var6 | var7) - (var6 & var7);
            var7 = 476798577;
            var6 = var10002;
            var27[(var6 | var7) & (var6 ^ 0xFFFFFFFF | var7 ^ 0xFFFFFFFF)] = var2;
            var7 = 403422723;
            var6 = -448392500;
            var10002 = var6 + var7 - 2 * (var6 & var7);
            var7 = -45241140;
            var6 = var10002;
            var27[(var6 | var7) & (var6 ^ 0xFFFFFFFF | var7 ^ 0xFFFFFFFF)] = var3;
            return var27;
        }
        return null;
    }

    private float a(float var1, float var2, float var3) {
        return var2 + (var1 - var2) * var3;
    }

    private float a(float var1, float var2) {
        return var1 * var2;
    }

    public void a(class_4587 var1, Renderer2D var2, int var3, int var4, float var5) {
        float var6;
        this.s.a();
        this.S = var6 = (float)this.s.j();
        int var10001 = -1409740389;
        int var55 = -830400128;
        int var54 = var10001;
        var10001 = var54 & ~var55 | ~var54 & var55;
        var55 = 24297032;
        var54 = var10001;
        var10001 = var54 & ~var55 | ~var54 & var55;
        if (!(var6 < 0.01f)) {
            var55 = -198949830;
            var54 = -1913649331;
            var10001 = var54 + var55 - 2 * (var54 & var55);
            var55 = 2043954041;
            var54 = var10001;
            FontRenderer var7 = FontManager.a[var54 & ~var55 | ~var54 & var55];
            "\u00075U".length();
            var10001 = -1882905587;
            var55 = 713171135;
            var54 = var10001;
            var10001 = (var54 | var55) - (var54 & var55);
            var55 = -1522072413;
            var54 = var10001;
            var10001 = (var54 | var55) & ~(var54 & var55);
            "\ufffdH\nZ\ufffd0W\ufffd(\r\ufffd\ufffd\ufffdx".length();
            var55 = 1825979123;
            var54 = -1539111963;
            var10001 = (var54 | var55) - (var54 & var55);
            var55 = -929744636;
            var54 = var10001;
            var10001 = var54 + var55 - 2 * (var54 & var55);
            "<\ufffd\ufffdm\u0097\u0001\ufffdC\ufffdT\ufffd\ufffdU\u03ebyS".length();
            var10001 = 758127518;
            var55 = -1001922604;
            var54 = var10001;
            var10001 = (var54 | var55) - (var54 & var55);
            var55 = -378026918;
            var54 = var10001;
            var10001 = var54 & ~var55 | ~var54 & var55;
            float var8 = 84.5f * this.x;
            "\u05ff\u0005\ufffdZ\ufffd\u0018\ufffd\ufffdy\ufffd\ufffd\ufffd\u0017\ufffd".length();
            var10001 = -142568011;
            var55 = -2073377649;
            var54 = var10001;
            var10001 = (var54 | var55) & (~var54 | ~var55);
            var55 = 1944736060;
            var54 = var10001;
            var10001 = (var54 | var55) & (~var54 | ~var55);
            float var9 = 10.5f * this.x;
            String var10000 = "dbk";
            float var10 = 7.0f * this.x;
            var10000 = "dbl";
            float var11 = 9.5f * this.x;
            "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdL\ufffd\ufffd".length();
            var55 = -1448989432;
            var54 = -186104934;
            var10001 = (var54 | var55) & (~var54 | ~var55);
            var55 = 1565159070;
            var54 = var10001;
            var10001 = (var54 | var55) - (var54 & var55);
            "\ufffd*U8\u04bb\ufffd\ufffd\ufffd\ufffdw\ufffd\ufffdw\ufffd \u05fc".length();
            var55 = -1685884385;
            var54 = 975861530;
            var10001 = (var54 | var55) & ~(var54 & var55);
            var55 = -1582758643;
            var54 = var10001;
            var10001 = var54 & ~var55 | ~var54 & var55;
            float var12 = 63.5f * this.x;
            var10000 = "dbm";
            float var13 = 41.5f * this.x;
            "/I\u0013H;\u0011{{z\ufffd\ufffd".length();
            var55 = 763327125;
            var54 = 1425643254;
            var10001 = (var54 | var55) & ~(var54 & var55);
            var55 = 2038883427;
            var54 = var10001;
            var10001 = (var54 | var55) - (var54 & var55);
            "=".length();
            var55 = -1617804471;
            var54 = 1172687025;
            var10001 = (var54 | var55) & ~(var54 & var55);
            var55 = -629699606;
            var54 = var10001;
            var10001 = (var54 | var55) & ~(var54 & var55);
            float var14 = 4.0f * this.x;
            float var15 = var7.b(this.w) * this.x + 2.0f * this.x;
            float var16 = var15 + var13 + var10 + var14;
            float var17 = var16 + var9 * 2.0f;
            this.G = var8;
            this.H = var17;
            this.b(var8, var17);
            this.I = this.E + var8 / 2.0f;
            this.J = this.F + var17 / 2.0f;
            float var18 = this.a(this.E, this.I, var6);
            float var19 = this.a(this.F, this.J, var6);
            float var20 = this.a(var8, var6);
            float var21 = this.a(var17, var6);
            float var22 = this.a(var11, var6);
            float var23 = this.a(var9, var6);
            float var24 = this.a(var10, var6);
            this.a(var1, var2, var6, var5);
            Color var25 = this.a(pulse.g.x, var5 * var6);
            Color var26 = this.a(pulse.g.x, var5 * var6);
            String var10002 = "dbn";
            float var223 = var18 - 0.5f * this.x * var6;
            var55 = 661469747;
            var54 = 552685005;
            int var10003 = var54 + var55 - 2 * (var54 & var55);
            var55 = -1002382931;
            var54 = var10003;
            var10003 = (var54 + var55 - 2 * (var54 & var55)) * (var54 + var55 - 2 * (var54 & var55));
            var2.a(var223, var19 - 0.5f * this.x * var6, var20 + this.x * var6, var21 + this.x * var6, var22, var25, var25, var26, var26, var1);
            Color var27 = this.a(pulse.g.e, var5 * var6);
            Color var28 = this.a(pulse.g.f, var5 * var6);
            var2.a(var18, var19, var20, var21, var22, var27, var27, var28, var28, var1);
            String var224 = "dbo";
            if (var6 > 0.3f) {
                int var233 = -1091856094;
                var55 = -1229809571;
                var54 = var233;
                int var234 = (var54 | var55) & ~(var54 & var55);
                var55 = 954028638;
                var54 = var234;
                int var235 = (var54 + var55 - 2 * (var54 & var55)) * (var54 + var55 - 2 * (var54 & var55));
                float var225 = var6 - 0.3f;
                "\ufffd,\ufffd\u0013\ufffd\u001bJ\u00006,w\ufffd7\u0011\ufffd".length();
                var10003 = 728003261;
                var55 = -299713693;
                var54 = var10003;
                var10003 = (var54 | var55) & (~var54 | ~var55);
                var55 = -985216562;
                var54 = var10003;
                var10003 = (var54 | var55) & ~(var54 & var55);
                "9S\ufffd\ufffdr4".length();
                var10003 = 332750511;
                var55 = -920207578;
                var54 = var10003;
                var10003 = var54 & ~var55 | ~var54 & var55;
                var55 = -621551206;
                var54 = var10003;
                var10003 = (var54 | var55) - (var54 & var55);
                "=".length();
                var55 = -265888509;
                var54 = 23740995;
                var10003 = var54 + var55 - 2 * (var54 & var55);
                var55 = -246636726;
                var54 = var10003;
                var10003 = (var54 | var55) & ~(var54 & var55);
                "".length();
                var55 = -2074227422;
                var54 = -455166658;
                var10003 = (var54 | var55) - (var54 & var55);
                var55 = 1619228688;
                var54 = var10003;
                var10003 = var54 + var55 - 2 * (var54 & var55);
                float var29 = Math.min(1.0f, var225 / 0.7f);
                var55 = -1566976896;
                var54 = -282237909;
                int var189 = (var54 | var55) & (~var54 | ~var55);
                var55 = -1301503739;
                var54 = var189;
                int var190 = (var54 | var55) & (~var54 | ~var55);
                int var30 = (int)(255.0f * var5 * var29);
                var2.b().a(var18, var19, var20, var21, var22, var1);
                float var31 = this.E + var9;
                float var32 = this.F + var9;
                float var33 = this.a(var31, this.I, var6);
                float var34 = this.a(var32, this.J, var6);
                float var35 = this.a(var15, var6);
                float var36 = this.x * var6;
                Color var37 = pulse.g.a((Color)pulse.g.a, (int)var30);
                var1.method_22903();
                var1.method_46416(var33, var34, 0.0f);
                var1.method_22905(var36, var36, 1.0f);
                var1.method_46416(-var33, -var34, 0.0f);
                var7.a(this.w, (double)var33, (double)var34, var37, var1);
                var1.method_22909();
                float var38 = var31;
                float var39 = var32 + var15;
                this.K = this.a(var38, this.I, var6);
                this.L = this.a(var39, this.J, var6);
                this.M = this.a(var12, var6);
                this.N = this.a(var13, var6);
                "s\ufffd\ufffd\ufffd\ufffdN\u0688\ufffdG\ufffd\ufffd\ufffde\ufffd".length();
                var55 = 1487722048;
                var54 = 939947416;
                int var236 = var54 & ~var55 | ~var54 & var55;
                var55 = 1621795793;
                var54 = var236;
                int var237 = var54 + var55 - 2 * (var54 & var55);
                "\ufffdE4\ufffdr\ufffdWe\u001c\ufffd`\u0010\ufffd5\ufffd\ufffd\ufffd\u0002".length();
                var55 = 1192148549;
                var54 = 1212532844;
                int var238 = (var54 | var55) & (~var54 | ~var55);
                var55 = 256603691;
                var54 = var238;
                int var239 = (var54 | var55) - (var54 & var55);
                float var40 = this.a(7.0f * this.x, var6);
                this.a(var1, var2, this.K, this.L, this.M, this.N, var40, var29 * var5);
                float var41 = var38 + this.z * var12;
                float var42 = var39 + (1.0f - this.A) * var13;
                float var43 = this.a(var41, this.I, var6);
                float var44 = this.a(var42, this.J, var6);
                this.a(var1, var2, var43, var44, var6, var29 * var5);
                float var45 = var31;
                float var46 = var39 + var13 + var10;
                this.O = this.a(var45, this.I, var6);
                this.P = this.a(var46, this.J, var6);
                this.Q = this.a(var12, var6);
                this.R = this.a(var14, var6);
                float var47 = this.a(2.0f * this.x, var6);
                this.b(var1, var2, this.O, this.P, this.Q, this.R, var47, var29 * var5);
                float var48 = var45 + this.y * var12;
                float var49 = var46 + var14 / 2.0f;
                float var50 = this.a(var48, this.I, var6);
                float var51 = this.a(var49, this.J, var6);
                this.b(var1, var2, var50, var51, var6, var29 * var5);
                var2.b().a(var1);
            }
            if (!this.r) {
                int var53;
                "e-\ufffdU\ufffdB\ufffd6*\ufffd\u0002\u001e\ufffd\ufffd\ufffd\ufffdM".length();
                var55 = -345263352;
                var54 = 1735135216;
                var10001 = var54 & ~var55 | ~var54 & var55;
                var55 = -1945649922;
                var54 = var10001;
                var10001 = var54 + var55 - 2 * (var54 & var55);
                "\ufffd\ufffd\ufffd8L\u0105\ufffd\n\ufffd".length();
                var10001 = -2131361930;
                var55 = 872927691;
                var54 = var10001;
                var10001 = var54 & ~var55 | ~var54 & var55;
                var55 = -1259196745;
                var54 = var10001;
                var10001 = var54 & ~var55 | ~var54 & var55;
                var55 = 1854315715;
                var54 = -985030342;
                int var191 = (var54 | var55) & (~var54 | ~var55);
                var55 = -447141043;
                var54 = var191;
                a = var53 = var54 & ~var55 | ~var54 & var55;
                int var192 = 448192777;
                var55 = 1291966340;
                var54 = var192;
                int var193 = (var54 | var55) & ~(var54 & var55);
                var55 = -1695076348;
                var54 = var193;
                int var194 = var54 & ~var55 | ~var54 & var55;
                var55 = 1543362231;
                var54 = -381465967;
                var10001 = var54 + var55 - 2 * (var54 & var55);
                var55 = -21449324;
                var54 = var10001;
                var55 = (var54 | var55) & ~(var54 & var55);
                var54 = var194;
                int var195 = (var54 & ~var55) + (var55 & ~var54) + 2 * (var54 & var55);
                int var196 = 36472515;
                var55 = -480528236;
                var54 = var196;
                int var197 = (var54 | var55) & (~var54 | ~var55);
                var55 = -2063800914;
                var54 = var197;
                if ((var54 & ~var55 | ~var54 & var55) < a) {
                    var10000 = "dbp";
                    int var199 = 1964125229;
                    var55 = -967891513;
                    var54 = var199;
                    int var200 = (var54 | var55) & (~var54 | ~var55);
                    var55 = -1059628600;
                    var54 = var200;
                    a = var53 = var54 + var55 - 2 * (var54 & var55);
                }
            } else {
                "v\ufffd\u001a\ufffdp\"\ufffd\uef6d\ufffd1y\ufffd\ufffd".length();
                var55 = -1073373417;
                var54 = -1364904922;
                int var240 = (var54 | var55) - (var54 & var55);
                var55 = 1856023354;
                var54 = var240;
                int var241 = (var54 | var55) & (~var54 | ~var55);
                if (var6 > 0.8f) {
                    boolean var56 = eD.a((float)this.K, (float)this.L, (float)this.M, (float)this.N, (double)var3, (double)var4);
                    var55 = 1019909720;
                    var54 = -1178028423;
                    int var242 = (var54 | var55) & (~var54 | ~var55);
                    var55 = 1119452248;
                    var54 = var242;
                    int var243 = (var54 | var55) - (var54 & var55);
                    var55 = 596905005;
                    var54 = -2059012374;
                    var10003 = (var54 | var55) & ~(var54 & var55);
                    var55 = 1635197527;
                    var54 = var10003;
                    var55 = var54 & ~var55 | ~var54 & var55;
                    var54 = var243;
                    int var244 = (var54 ^ var55) + 2 * (var54 & var55);
                    float var232 = this.P - 4.0f * this.x * var6;
                    var55 = 1191833122;
                    var54 = 582290792;
                    int var10004 = (var54 | var55) & ~(var54 & var55);
                    var55 = 338173343;
                    var54 = var10004;
                    var10004 = (var54 | var55) & (~var54 | ~var55);
                    var55 = -1309597643;
                    var54 = -1979938976;
                    int var10005 = (var54 | var55) & ~(var54 & var55);
                    var55 = -1098971931;
                    var54 = var10005;
                    var55 = var54 + var55 - 2 * (var54 & var55);
                    var54 = var10004;
                    var10004 = (var54 ^ var55) + 2 * (var54 & var55);
                    boolean var57 = eD.a((float)this.O, (float)var232, (float)this.Q, (float)(this.R + 8.0f * this.x * var6), (double)var3, (double)var4);
                    if (var56 || var57 || this.C || this.D) {
                        eD.g();
                    }
                }
            }
        }
    }

    private void b(float var1, float var2) {
        int var10000 = -1310778309;
        int var6 = 78825238;
        int var5 = var10000;
        var10000 = (var5 | var6) & ~(var5 & var6);
        var6 = -760789548;
        var5 = var10000;
        var10000 = ((var5 | var6) - (var5 & var6)) * ((var5 | var6) - (var5 & var6));
        "\ufffdO\u001f\ufffd\u0455\u001d }\ufffdv*U".length();
        int var10002 = 1924231440;
        var6 = 832583069;
        var5 = var10002;
        var10002 = var5 & ~var6 | ~var5 & var6;
        var6 = 1125205129;
        var5 = var10002;
        var10002 = (var5 | var6) & (~var5 | ~var6);
        "".length();
        var6 = 993525370;
        var5 = 160114277;
        var10002 = var5 & ~var6 | ~var5 & var6;
        var6 = 851236882;
        var5 = var10002;
        var10002 = var5 + var6 - 2 * (var5 & var6);
        String var53 = "dbq";
        var6 = 1302901600;
        var5 = 1880275551;
        var10002 = (var5 | var6) - (var5 & var6);
        var6 = -1742081046;
        var5 = var10002;
        var10002 = (var5 | var6) & ~(var5 & var6);
        String var10003 = "dbr";
        var6 = 899121331;
        var5 = 1728266668;
        int var56 = (var5 | var6) - (var5 & var6);
        var6 = -1028657913;
        var5 = var56;
        int var57 = (var5 | var6) & (~var5 | ~var6);
        var6 = 1656068429;
        var5 = -1151704397;
        int var10004 = var5 & ~var6 | ~var5 & var6;
        var6 = -1505199239;
        var5 = var10004;
        var10004 = (var5 | var6) - (var5 & var6);
        var10004 = -1947709516;
        var6 = -1375506930;
        var5 = var10004;
        var10004 = (var5 | var6) & (~var5 | ~var6);
        var6 = 936411158;
        var5 = var10004;
        var10004 = (var5 | var6) & ~(var5 & var6);
        var6 = -1382618004;
        var5 = -2105982743;
        int var10005 = var5 & ~var6 | ~var5 & var6;
        var6 = -2090558135;
        var5 = var10005;
        var10005 = var5 & ~var6 | ~var5 & var6;
        var6 = 1367295335;
        var5 = 629054168;
        int var10006 = var5 & ~var6 | ~var5 & var6;
        var6 = 2041480442;
        var5 = var10006;
        var6 = (var5 | var6) - (var5 & var6);
        var5 = var10005;
        var10005 = (var5 | var6) + (var5 & var6);
        var6 = 1542274321;
        var5 = -842150241;
        var10005 = var5 + var6 - 2 * (var5 & var6);
        var6 = -1775745048;
        var5 = var10005;
        eN.a var3 = eN.b((String)pulse.p.a("\u8669\uc8c9\u867a\uc8d4\u867f\uc8e4\u867e", "`\ua7f3\ua4fa\ua061\ua910\u7d7a\u8e59\u247f\u8b78\u3474~\ua7ef\ua4b6\ua07a\ua902\u7d63\u8e43\u2435\u8b34\u3478\u007f\ua7eb\ua4ba\ua07f\ua94a\u7d55\u8e45\u2476\u8b38\u3465B\ua7ef\ua4b6\ua07a\ua900\u7d64\u8e6f\u2476\u8b32\u347aw\ua7e8\ua4a1", var10002, var57, var10004, var5 & ~var6 | ~var5 & var6));
        float var4 = var3 != null ? (float)var3.b() / 2.0f * this.x : 0.0f;
        switch (this.v.ordinal()) {
            case 0: {
                this.E = this.t - var1 / 2.0f;
                this.F = this.u - var2 - var4 - 1.0f * this.x;
                break;
            }
            case 1: {
                this.E = this.t - var1 / 2.0f;
                this.F = this.u + var4 + 1.0f * this.x;
                break;
            }
            case 2: {
                this.E = this.t - var1 - var4 - 1.0f * this.x;
                this.F = this.u - var2 / 2.0f;
                break;
            }
            case 3: {
                this.E = this.t + var4 + 1.0f * this.x;
                this.F = this.u - var2 / 2.0f;
            }
        }
    }

    private void a(class_4587 var1, Renderer2D var2, float var3, float var4) {
        "$' \ufffd>\ufffd".length();
        int var10001 = -878110757;
        int var21 = 1948888203;
        int var20 = var10001;
        var10001 = (var20 | var21) - (var20 & var21);
        var21 = -1082082475;
        var20 = var10001;
        var10001 = (var20 | var21) & ~(var20 & var21);
        "=J\ufffd \ufffdWfY".length();
        var10001 = -1087278402;
        var21 = 333160662;
        var20 = var10001;
        var10001 = var20 & ~var21 | ~var20 & var21;
        var21 = -1393896852;
        var20 = var10001;
        var10001 = var20 & ~var21 | ~var20 & var21;
        "\ufffdY\ufffdB-n\ufffd".length();
        var21 = 1745328876;
        var20 = -912501055;
        int var10002 = (var20 | var21) & (~var20 | ~var21);
        var21 = -1583625184;
        var20 = var10002;
        var10002 = (var20 | var21) & (~var20 | ~var21);
        "O\ufffd\ufffdd\ufffd\ufffd\u037c\ufffd6\ufffdy\u0019\ufffd!\ufffd\u0007\ufffd".length();
        var10002 = -1678046712;
        var21 = 1320635292;
        var20 = var10002;
        var10002 = var20 + var21 - 2 * (var20 & var21);
        var21 = -716422764;
        var20 = var10002;
        var10002 = var20 + var21 - 2 * (var20 & var21);
        var21 = -631820780;
        var20 = 433424201;
        var10002 = (var20 | var21) & ~(var20 & var21);
        var21 = 508337792;
        var20 = var10002;
        var10002 = (var20 | var21) - (var20 & var21);
        int var10003 = -437751464;
        var21 = -1772368021;
        var20 = var10003;
        var10003 = (var20 | var21) & ~(var20 & var21);
        var21 = 1393052798;
        var20 = var10003;
        var21 = (var20 | var21) & ~(var20 & var21);
        var20 = var10002;
        var10002 = var20 - ~var21 - 1;
        var10002 = -934708765;
        var21 = -615567790;
        var20 = var10002;
        var10002 = var20 + var21 - 2 * (var20 & var21);
        var21 = -1231704732;
        var20 = var10002;
        var10002 = (var20 | var21) & (~var20 | ~var21);
        String var151 = "dbs";
        var21 = -820688462;
        var20 = -785000496;
        var10003 = var20 + var21 - 2 * (var20 & var21);
        var21 = 1562831219;
        var20 = var10003;
        var10003 = (var20 | var21) & (~var20 | ~var21);
        int var10004 = 1155740207;
        var21 = -924079506;
        var20 = var10004;
        var10004 = (var20 | var21) - (var20 & var21);
        var21 = 188277198;
        var20 = var10004;
        var10004 = (var20 & ~var21 | ~var20 & var21) * (var20 & ~var21 | ~var20 & var21);
        var10004 = -2001446692;
        var21 = 1108800291;
        var20 = var10004;
        var10004 = (var20 | var21) & ~(var20 & var21);
        var21 = -764294322;
        var20 = var10004;
        var10004 = (var20 | var21) & ~(var20 & var21);
        String var10005 = "dbt";
        var21 = 351585595;
        var20 = 1616931910;
        int var159 = (var20 | var21) - (var20 & var21);
        var21 = 1955071316;
        var20 = var159;
        eN.a var5 = eN.b((String)pulse.p.a("\u2aa7\u7c48\u2ab4\u7c55\u2ab1\u7c65\u2ab0", "`\ua7f3\ua4fa\ua061\ua910\u7d7a\u8e59\u247f\u8b78\u3474~\ua7ef\ua4b6\ua07a\ua902\u7d63\u8e43\u2435\u8b34\u3478\u007f\ua7eb\ua4ba\ua07f\ua94a\u7d55\u8e45\u2476\u8b38\u3465B\ua7ef\ua4b6\ua07a\ua900\u7d64\u8e6f\u2476\u8b32\u347aw\ua7e8\ua4a1", var10002, var10003, var10004, var20 & ~var21 | ~var20 & var21));
        if (var5 != null) {
            float var16;
            float var15;
            class_2960 var6 = var5.a();
            var21 = -1007655215;
            var20 = -210810962;
            int var10000 = (var20 | var21) & (~var20 | ~var21);
            var21 = 815735167;
            var20 = var10000;
            RenderSystem.setShaderTexture((int)(var20 & ~var21 | ~var20 & var21), (class_2960)var6);
            float var7 = (float)var5.b() / 2.0f * this.x * var3;
            float var8 = (float)var5.c() / 2.0f * this.x * var3;
            Color var9 = pulse.g.a((Color)pulse.g.aa, (float)(var4 * var3));
            float var10 = this.a(this.E, this.I, var3);
            float var110 = this.a(this.F, this.J, var3);
            var21 = 1301512087;
            var20 = 1129863889;
            var10001 = var20 + var21 - 2 * (var20 & var21);
            var21 = 1899451870;
            var20 = var10001;
            var10001 = var20 & ~var21 | ~var20 & var21;
            var10002 = 898615182;
            var21 = -703957217;
            var20 = var10002;
            var10002 = var20 + var21 - 2 * (var20 & var21);
            var21 = -2007248886;
            var20 = var10002;
            var21 = (var20 | var21) & ~(var20 & var21);
            var20 = var10001;
            var10001 = 2 * (var20 | var21) - (var20 ^ var21);
            float var11 = var110 + 2.5f;
            float var12 = this.a(this.G, var3);
            float var13 = this.a(this.H, var3);
            float var14 = 1.0f * this.x * var3;
            float var17 = switch (this.v.ordinal()) {
                case 0 -> {
                    var15 = var10 + var12 / 2.0f;
                    var16 = var11 + var13 + var8 / 2.0f + var14;
                    var21 = 1658969952;
                    var20 = 944717795;
                    var10000 = var20 & ~var21 | ~var20 & var21;
                    var21 = 1046363583;
                    var20 = var10000;
                    var10000 = var20 + var21 - 2 * (var20 & var21);
                    var10001 = 1569917691;
                    var21 = -595323998;
                    var20 = var10001;
                    var10001 = (var20 | var21) & (~var20 | ~var21);
                    var21 = -751364748;
                    var20 = var10001;
                    var21 = (var20 | var21) & ~(var20 & var21);
                    var20 = var10000;
                    var10000 = 2 * (var20 | var21) - (var20 ^ var21);
                    yield 90.0f;
                }
                case 1 -> {
                    var15 = var10 + var12 / 2.0f;
                    var16 = var11 - var8 / 2.0f - var14;
                    var10000 = -589138570;
                    var21 = 1138201845;
                    var20 = var10000;
                    var10000 = var20 & ~var21 | ~var20 & var21;
                    var21 = 556036830;
                    var20 = var10000;
                    var10000 = ((var20 | var21) - (var20 & var21)) * ((var20 | var21) - (var20 & var21));
                    yield -90.0f;
                }
                case 2 -> {
                    var15 = var10 + var12 + var7 / 2.0f + var14;
                    var16 = var11 + var13 / 2.0f;
                    yield 0.0f;
                }
                default -> {
                    var15 = var10 - var7 / 2.0f - var14;
                    var16 = var11 + var13 / 2.0f;
                    "?$\ufffdK".length();
                    var10001 = 418508774;
                    var21 = 705873766;
                    var20 = var10001;
                    var10001 = (var20 | var21) & ~(var20 & var21);
                    var21 = 853747840;
                    var20 = var10001;
                    var10001 = (var20 | var21) & (~var20 | ~var21);
                    "\ufffd".length();
                    var21 = -616497373;
                    var20 = 989279493;
                    var10001 = (var20 | var21) - (var20 & var21);
                    var21 = -508048850;
                    var20 = var10001;
                    var10001 = var20 & ~var21 | ~var20 & var21;
                    "\ufffd\"J\ufffd\ufffd\u02a2!\u0007\ufffd\ufffd".length();
                    var10001 = -812396830;
                    var21 = 1044143216;
                    var20 = var10001;
                    var10001 = (var20 | var21) - (var20 & var21);
                    var21 = -240151936;
                    var20 = var10001;
                    var10001 = (var20 | var21) & ~(var20 & var21);
                    "".length();
                    var10001 = -2086703765;
                    var21 = -638966621;
                    var20 = var10001;
                    var10001 = (var20 | var21) & ~(var20 & var21);
                    var21 = 1517636040;
                    var20 = var10001;
                    var10001 = var20 & ~var21 | ~var20 & var21;
                    yield 180.0f;
                }
            };
            var1.method_22903();
            var1.method_46416(var15, var16, 0.0f);
            var1.method_22907(new Quaternionf().rotationZ((float)Math.toRadians(var17)));
            var1.method_46416(-var15, -var16, 0.0f);
            float var18 = var15 - var7 / 2.0f;
            float var19 = var16 - var8 / 2.0f;
            var2.a(var6, var18, var19, var7, var8, var9, var1);
            var1.method_22909();
        }
    }

    private void a(class_4587 var1, Renderer2D var2, float var3, float var4, float var5, float var6, float var7, float var8) {
        Color var9 = Color.getHSBColor(this.y, 1.0f, 1.0f);
        String var10000 = "dbu";
        int var10 = (int)(255.0f * var8);
        Color var11 = pulse.g.a((Color)pulse.g.aa, (int)var10);
        Color var12 = pulse.g.a((Color)var9, (int)var10);
        Color var13 = pulse.g.a((Color)pulse.g.ab, (int)var10);
        var2.a(var3, var4, var5, var6, var7, var11, var12, var13, var13, var1);
    }

    private void a(class_4587 var1, Renderer2D var2, float var3, float var4, float var5, float var6) {
        int var15 = 1325477388;
        int var14 = -598874762;
        int var10000 = (var14 | var15) & (~var14 | ~var15);
        var15 = -97803938;
        var14 = var10000;
        var10000 = ((var14 | var15) & ~(var14 & var15)) * ((var14 | var15) & ~(var14 & var15));
        float var7 = 9.0f * this.x * var5;
        var15 = -1036346977;
        var14 = 1568315693;
        var10000 = (var14 | var15) & (~var14 | ~var15);
        var15 = 1436888903;
        var14 = var10000;
        var10000 = var14 + var15 - 2 * (var14 & var15);
        float var8 = 1.5f * this.x * var5;
        float var9 = var7 - var8 * 2.0f;
        "\ufffdTj3\ufffdI}<\ufffd\u0007\ufffd\ufffd\ufffd".length();
        var15 = 1271147315;
        var14 = 1100658897;
        int var10001 = (var14 | var15) & ~(var14 & var15);
        var15 = 173970402;
        var14 = var10001;
        var10001 = (var14 | var15) - (var14 & var15);
        int var10 = (int)(255.0f * var6);
        float var30 = var3 - var9 / 2.0f - 2.0f;
        float var10002 = var4 - var9 / 2.0f - 2.0f;
        String var10003 = "dbv";
        var2.a(var30, var10002, 5.0f, pulse.g.ad, var1);
        Color var11 = pulse.g.a((Color)pulse.g.aa, (int)var10);
        var2.a(var3 - var7 / 2.0f, var4 - var7 / 2.0f, var7, var7, var7, var11, var1);
        Color var12 = this.e();
        Color var13 = pulse.g.a((Color)var12, (int)var10);
        var2.a(var3 - var9 / 2.0f, var4 - var9 / 2.0f, var9, var9, var9, var13, var1);
    }

    private void b(class_4587 var1, Renderer2D var2, float var3, float var4, float var5, float var6, float var7, float var8) {
        var2.a(var3, var4, var5, var6, var7, var8, var1);
    }

    private void b(class_4587 var1, Renderer2D var2, float var3, float var4, float var5, float var6) {
        String var10000 = "dbw";
        float var7 = 3.0f * this.x * var5;
        "\ufffd\u0010\ufffd\ufffd".length();
        int var10001 = -492928529;
        int var11 = 1435630615;
        int var10 = var10001;
        var10001 = (var10 | var11) & (~var10 | ~var11);
        var11 = -1223721478;
        var10 = var10001;
        var10001 = (var10 | var11) & (~var10 | ~var11);
        "\ufffd\u035cJ\ufffdi\ufffd\n\ufffd\ufffd\ufffd\ufffd7kd\ufffd".length();
        var10001 = 326913019;
        var11 = 1361113414;
        var10 = var10001;
        var10001 = var10 + var11 - 2 * (var10 & var11);
        var11 = 1113373371;
        var10 = var10001;
        var10001 = var10 + var11 - 2 * (var10 & var11);
        ":\u031b\ufffd\ufffd\u001b\ufffd\u0014\ufffdIB".length();
        var10001 = 1731180910;
        var11 = -79471539;
        var10 = var10001;
        var10001 = var10 + var11 - 2 * (var10 & var11);
        var11 = -1670585045;
        var10 = var10001;
        var10001 = var10 + var11 - 2 * (var10 & var11);
        float var8 = 7.0f * this.x * var5;
        Color var9 = pulse.g.a((Color)pulse.g.aa, (float)var6);
        var2.a(var3 - var7 / 2.0f, var4 - var8 / 2.0f, var7, var8, var7, var9, var1);
    }

    public boolean a(int var1, int var2) {
        if (!this.r) {
            if (b) {
                throw new RuntimeException();
            }
        } else {
            double var10000 = this.s.j();
            int var10001 = -1903723583;
            int var5 = -1094360101;
            int var4 = var10001;
            var10001 = (var4 | var5) & ~(var4 & var5);
            var5 = 954588316;
            var4 = var10001;
            var10001 = (var4 | var5) & (~var4 | ~var5);
            if (!(var10000 < 0.5)) {
                if (!eD.a((float)this.K, (float)this.L, (float)this.M, (float)this.N, (double)var1, (double)var2)) {
                    "\ufffd\ufffdN\u001a".length();
                    var10001 = -1954714740;
                    var5 = 1786166968;
                    var4 = var10001;
                    var10001 = var4 & ~var5 | ~var4 & var5;
                    var5 = -519318235;
                    var4 = var10001;
                    var10001 = var4 & ~var5 | ~var4 & var5;
                    "d\ufffd(b\ufffd\\\ufffd$\ufffd\u0013W\ufffd.\ufffd".length();
                    var10001 = -1115586808;
                    var5 = 95256879;
                    var4 = var10001;
                    var10001 = var4 & ~var5 | ~var4 & var5;
                    var5 = -1205010912;
                    var4 = var10001;
                    var10001 = var4 & ~var5 | ~var4 & var5;
                    "\ufffd=\ufffd\ufffd\ufffd\ufffd;\u001b\ufffd'|\ufffd".length();
                    var5 = 1043265635;
                    var4 = 63025138;
                    var10001 = var4 & ~var5 | ~var4 & var5;
                    var5 = 1039095705;
                    var4 = var10001;
                    var10001 = (var4 | var5) & (~var4 | ~var5);
                    float var3 = 4.0f * this.x * this.S;
                    if (!eD.a((float)this.O, (float)(this.P - var3), (float)this.Q, (float)(this.R + var3 * 2.0f), (double)var1, (double)var2)) {
                        return this.c(var1, var2);
                    }
                    var5 = -1887402069;
                    var4 = -881623806;
                    var10001 = var4 + var5 - 2 * (var4 & var5);
                    var5 = 1156840104;
                    var4 = var10001;
                    this.D = Bool.from((int)((var4 | var5) - (var4 & var5)));
                    this.a(var1);
                    var5 = -1868722251;
                    var4 = 1744057694;
                    int var44 = var4 & ~var5 | ~var4 & var5;
                    var5 = -144065814;
                    var4 = var44;
                    return Bool.from((int)(var4 & ~var5 | ~var4 & var5));
                }
                var5 = 625349656;
                var4 = 1108776991;
                var10001 = (var4 | var5) - (var4 & var5);
                var5 = 1733331974;
                var4 = var10001;
                this.C = Bool.from((int)(var4 & ~var5 | ~var4 & var5));
                this.d(var1, var2);
                int var42 = -1732780798;
                var5 = 1322007802;
                var4 = var42;
                int var43 = (var4 | var5) & (~var4 | ~var5);
                var5 = -696524295;
                var4 = var43;
                return Bool.from((int)((var4 | var5) & (~var4 | ~var5)));
            }
        }
        int var40 = 255564821;
        int var24 = 938508316;
        int var7 = var40;
        var40 = (var7 | var24) - (var7 & var24);
        var24 = 952835081;
        var7 = var40;
        return Bool.from((int)((var7 | var24) & ~(var7 & var24)));
    }

    public void b(int var1, int var2) {
        int var10001 = 1272580852;
        int var4 = 1505231278;
        int var3 = var10001;
        var10001 = var3 + var4 - 2 * (var3 & var4);
        var4 = 308415322;
        var3 = var10001;
        this.C = Bool.from((int)(var3 + var4 - 2 * (var3 & var4)));
        var4 = 1384938253;
        var3 = 1557985826;
        var10001 = var3 & ~var4 | ~var3 & var4;
        var4 = 240156975;
        var3 = var10001;
        this.D = Bool.from((int)((var3 | var4) & (~var3 | ~var4)));
    }

    public void a(int var1, int var2, double var3, double var5) {
        if (this.r) {
            if (this.C) {
                this.d(var1, var2);
            }
            if (this.D) {
                this.a(var1);
            }
        }
    }

    private void d(int var1, int var2) {
        float var3 = (float)var1 - this.K;
        float var4 = (float)var2 - this.L;
        this.z = Math.max(0.0f, Math.min(1.0f, var3 / this.M));
        this.A = Math.max(0.0f, Math.min(1.0f, 1.0f - var4 / this.N));
        this.g();
    }

    private void a(int var1) {
        float var2 = (float)var1 - this.O;
        this.y = Math.max(0.0f, Math.min(1.0f, var2 / this.Q));
        this.g();
    }

    private void g() {
        if (this.B != null) {
            this.B.accept(this.e());
        }
    }

    public boolean c(int var1, int var2) {
        if (this.c()) {
            float var3 = (float)this.s.j();
            float var4 = this.G * var3;
            float var5 = this.H * var3;
            float var6 = this.I - var4 / 2.0f;
            float var7 = this.J - var5 / 2.0f;
            return eD.a((float)var6, (float)var7, (float)var4, (float)var5, (double)var1, (double)var2);
        }
        int var9 = 2013833528;
        int var8 = 559741318;
        int var10000 = var8 & ~var9 | ~var8 & var9;
        var9 = 1498697918;
        var8 = var10000;
        return Bool.from((int)((var8 | var9) - (var8 & var9)));
    }

    private Color a(Color var1, float var2) {
        return pulse.g.b((Color)var1, (float)var2);
    }

    public static String a(String var0, String var1, int var2, int var3, int var4, int var5) {
        char[] var6 = var1.toCharArray();
        char[] var7 = new char[var6.length];
        int var10000 = -2007469002;
        int var18 = 376548555;
        int var17 = var10000;
        var10000 = (var17 | var18) & ~(var17 & var18);
        var18 = -1641424649;
        var17 = var10000;
        char[] var258 = new char[var17 + var18 - 2 * (var17 & var18)];
        var18 = 1572392492;
        var17 = -416256663;
        int var10002 = var17 + var18 - 2 * (var17 & var18);
        var18 = -1165450427;
        var17 = var10002;
        var10002 = var17 + var18 - 2 * (var17 & var18);
        var18 = 1627240426;
        var17 = 936847246;
        int var10003 = (var17 | var18) - (var17 & var18);
        var18 = 1462425686;
        var17 = var10003;
        var258[var10002] = (char)((var17 | var18) & ~(var17 & var18));
        var10002 = -1148752633;
        var18 = 2034969572;
        var17 = var10002;
        var10002 = (var17 | var18) & (~var17 | ~var18);
        var18 = -1026799902;
        var17 = var10002;
        var10002 = var17 + var18 - 2 * (var17 & var18);
        var18 = 1207071934;
        var17 = 1897751723;
        var10003 = var17 & ~var18 | ~var17 & var18;
        var18 = 921645968;
        var17 = var10003;
        var258[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
        var10002 = -974760775;
        var18 = -2056347206;
        var17 = var10002;
        var10002 = var17 + var18 - 2 * (var17 & var18);
        var18 = 1082717441;
        var17 = var10002;
        var10002 = (var17 | var18) & (~var17 | ~var18);
        var18 = 1152415357;
        var17 = 2047037716;
        var10003 = var17 & ~var18 | ~var17 & var18;
        var18 = 1051919599;
        var17 = var10003;
        var258[var10002] = (char)((var17 | var18) & ~(var17 & var18));
        var10002 = -363094246;
        var18 = -474065344;
        var17 = var10002;
        var10002 = (var17 | var18) & ~(var17 & var18);
        var18 = 166054233;
        var17 = var10002;
        var10002 = var17 & ~var18 | ~var17 & var18;
        var10003 = -2034208384;
        var18 = 1804392250;
        var17 = var10003;
        var10003 = (var17 | var18) - (var17 & var18);
        var18 = 1729188301;
        var17 = var10003;
        var10003 = var17 & ~var18 | ~var17 & var18;
        var10003 = -374862541;
        var18 = -1592278272;
        var17 = var10003;
        var10003 = var17 + var18 - 2 * (var17 & var18);
        var18 = 1220498976;
        var17 = var10003;
        var258[var10002] = (char)((var17 | var18) & ~(var17 & var18));
        var10002 = 1843976937;
        var18 = -1807880997;
        var17 = var10002;
        var10002 = (var17 | var18) & (~var17 | ~var18);
        var18 = -103467466;
        var17 = var10002;
        var10002 = (var17 | var18) & ~(var17 & var18);
        "=\u011c\ufffd\ufffd\ufffd]qkr\u0661\ufffd8&\u0010".length();
        var18 = -679916525;
        var17 = -1526069471;
        int var10004 = var17 + var18 - 2 * (var17 & var18);
        var18 = 1920158519;
        var17 = var10004;
        var10004 = var17 & ~var18 | ~var17 & var18;
        "%1\ufffd5e\ufffd/*\u001d\ufffd\ufffd\u000b\ufffd\ufffd\u00d8\ufffd\u0002s".length();
        var10004 = -214476364;
        var18 = -1564070823;
        var17 = var10004;
        var10004 = var17 + var18 - 2 * (var17 & var18);
        var18 = 1374778858;
        var17 = var10004;
        var10004 = (var17 | var18) - (var17 & var18);
        "\ufffd\u00100c\ufffd\ufffd\ufffdn\ufffd!X\ufffdx\ufffd>is\ufffd".length();
        var10004 = -819103217;
        var18 = 262531938;
        var17 = var10004;
        var10004 = (var17 | var18) & ~(var17 & var18);
        var18 = -1064791707;
        var17 = var10004;
        var10004 = (var17 | var18) & (~var17 | ~var18);
        "\ufffd\ufffd>\ufffd\ufffdQ\ufffd\u0007:\u0005\ufffdT\ufffdA\ufffd\ufffd\ufffd".length();
        var18 = 153910241;
        var17 = 1394422724;
        var10004 = var17 + var18 - 2 * (var17 & var18);
        var18 = 1513179171;
        var17 = var10004;
        var10004 = (var17 | var18) & (~var17 | ~var18);
        var10003 = 2024321159;
        var18 = -1098946822;
        var17 = var10003;
        var10003 = var17 & ~var18 | ~var17 & var18;
        var18 = -958970024;
        var17 = var10003;
        var258[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
        var18 = 1423049658;
        var17 = 1341798185;
        var10002 = (var17 | var18) - (var17 & var18);
        var18 = 455619734;
        var17 = var10002;
        var10002 = (var17 | var18) - (var17 & var18);
        var10003 = -2003264146;
        var18 = 142864056;
        var17 = var10003;
        var10003 = var17 + var18 - 2 * (var17 & var18);
        var18 = -2145700268;
        var17 = var10003;
        var258[var10002] = (char)((var17 | var18) & ~(var17 & var18));
        var10002 = -399199969;
        var18 = -606642085;
        var17 = var10002;
        var10002 = var17 & ~var18 | ~var17 & var18;
        var18 = 870568258;
        var17 = var10002;
        var10002 = (var17 | var18) & ~(var17 & var18);
        var10003 = -317076178;
        var18 = -1128768588;
        var17 = var10003;
        var10003 = (var17 | var18) & (~var17 | ~var18);
        var18 = 1369546633;
        var17 = var10003;
        var258[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
        var10002 = 707194709;
        var18 = -75257236;
        var17 = var10002;
        var10002 = var17 + var18 - 2 * (var17 & var18);
        var18 = -777697986;
        var17 = var10002;
        var10002 = var17 + var18 - 2 * (var17 & var18);
        var18 = 93730527;
        var17 = 1518638607;
        var10003 = (var17 | var18) - (var17 & var18);
        var18 = 1595053298;
        var17 = var10003;
        var258[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
        var10002 = -1993189656;
        var18 = -1134810411;
        var17 = var10002;
        var10002 = var17 + var18 - 2 * (var17 & var18);
        var18 = 896433205;
        var17 = var10002;
        var10002 = var17 & ~var18 | ~var17 & var18;
        var10003 = 1456101871;
        var18 = -703192913;
        var17 = var10003;
        var10003 = (var17 | var18) & (~var17 | ~var18);
        var18 = -2133036781;
        var17 = var10003;
        var258[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
        var18 = 304959047;
        var17 = -1262578394;
        var10002 = (var17 | var18) & ~(var17 & var18);
        var18 = -1500259480;
        var17 = var10002;
        var10002 = (var17 | var18) & ~(var17 & var18);
        var10003 = -1672965589;
        var18 = 1343009783;
        var17 = var10003;
        var10003 = (var17 | var18) & (~var17 | ~var18);
        var18 = -867948808;
        var17 = var10003;
        var258[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
        char[] var8 = var258;
        var10000 = 1820849168;
        var18 = 27289052;
        var17 = var10000;
        var10000 = (var17 | var18) & (~var17 | ~var18);
        var18 = 1831309766;
        var17 = var10000;
        char[] var261 = new char[(var17 | var18) & (~var17 | ~var18)];
        var18 = 741610705;
        var17 = -1688663066;
        var10002 = (var17 | var18) & ~(var17 & var18);
        var18 = -1217585353;
        var17 = var10002;
        var10002 = var17 + var18 - 2 * (var17 & var18);
        var10003 = 2027754045;
        var18 = -1183882508;
        var17 = var10003;
        var10003 = (var17 | var18) - (var17 & var18);
        var18 = -1045284631;
        var17 = var10003;
        var261[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
        var18 = 1791682390;
        var17 = 861813764;
        var10002 = (var17 | var18) - (var17 & var18);
        var18 = 1502927699;
        var17 = var10002;
        var10002 = var17 & ~var18 | ~var17 & var18;
        String var342 = "dbx";
        var18 = -952002699;
        var17 = -1627183016;
        var10003 = (var17 | var18) & ~(var17 & var18);
        var18 = 1480735534;
        var17 = var10003;
        var261[var10002] = (char)((var17 | var18) & ~(var17 & var18));
        var18 = -680720204;
        var17 = 1126456940;
        var10002 = var17 + var18 - 2 * (var17 & var18);
        var18 = -1807132966;
        var17 = var10002;
        var10002 = (var17 | var18) & (~var17 | ~var18);
        var10003 = 77611616;
        var18 = 720237332;
        var17 = var10003;
        var10003 = (var17 | var18) & ~(var17 & var18);
        var18 = -1593021492;
        var17 = var10003;
        var10003 = (var17 | var18) & ~(var17 & var18);
        var18 = -1892963371;
        var17 = 348296255;
        var10003 = (var17 | var18) & ~(var17 & var18);
        var18 = -1679181639;
        var17 = var10003;
        var261[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
        var18 = 511316473;
        var17 = 1716588108;
        var10002 = (var17 | var18) & ~(var17 & var18);
        var18 = 2016092086;
        var17 = var10002;
        var10002 = (var17 | var18) & (~var17 | ~var18);
        var10003 = -1592441820;
        var18 = -445757750;
        var17 = var10003;
        var10003 = var17 + var18 - 2 * (var17 & var18);
        var18 = 1148926700;
        var17 = var10003;
        var261[var10002] = (char)((var17 | var18) & ~(var17 & var18));
        var10002 = -1289008130;
        var18 = 1532708117;
        var17 = var10002;
        var10002 = var17 & ~var18 | ~var17 & var18;
        var18 = -395309329;
        var17 = var10002;
        var10002 = (var17 | var18) & ~(var17 & var18);
        var18 = 314434845;
        var17 = -1090678032;
        var10003 = (var17 | var18) - (var17 & var18);
        var18 = -1405071443;
        var17 = var10003;
        var261[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
        var10002 = -20855368;
        var18 = 1890107228;
        var17 = var10002;
        var10002 = (var17 | var18) & ~(var17 & var18);
        var18 = -1905689887;
        var17 = var10002;
        var10002 = var17 + var18 - 2 * (var17 & var18);
        var10003 = 1282770391;
        var18 = -1640452083;
        var17 = var10003;
        var10003 = (var17 | var18) & (~var17 | ~var18);
        var18 = -766702258;
        var17 = var10003;
        var261[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
        var18 = -32932317;
        var17 = -1473013585;
        var10002 = (var17 | var18) - (var17 & var18);
        var18 = 1446700682;
        var17 = var10002;
        var10002 = (var17 | var18) - (var17 & var18);
        var10003 = -1496312813;
        var18 = -1114988272;
        var17 = var10003;
        var10003 = (var17 | var18) & ~(var17 & var18);
        var18 = 1469715022;
        var17 = var10003;
        var10003 = (var17 | var18) & ~(var17 & var18);
        var18 = 237789503;
        var17 = 813725561;
        var10004 = (var17 | var18) - (var17 & var18);
        var18 = -894632903;
        var17 = var10004;
        var18 = (var17 | var18) - (var17 & var18);
        var17 = var10003;
        var10003 = (var17 | var18) + (var17 & var18);
        var10003 = 420662286;
        var18 = 341035559;
        var17 = var10003;
        var10003 = var17 & ~var18 | ~var17 & var18;
        var18 = 222396688;
        var17 = var10003;
        var261[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
        var18 = 1224426729;
        var17 = 375606902;
        var10002 = (var17 | var18) & (~var17 | ~var18);
        var18 = 1587022488;
        var17 = var10002;
        var10002 = var17 + var18 - 2 * (var17 & var18);
        var10003 = 1614004651;
        var18 = 587504794;
        var17 = var10003;
        var10003 = (var17 | var18) & ~(var17 & var18);
        var18 = 1127697673;
        var17 = var10003;
        var261[var10002] = (char)((var17 | var18) - (var17 & var18));
        var18 = 1064325589;
        var17 = 179392654;
        var10002 = (var17 | var18) & (~var17 | ~var18);
        var18 = 901841235;
        var17 = var10002;
        var10002 = var17 + var18 - 2 * (var17 & var18);
        var18 = 1561614468;
        var17 = -1606943608;
        var10003 = var17 + var18 - 2 * (var17 & var18);
        var18 = -1469145591;
        var17 = var10003;
        var10003 = ((var17 | var18) & (~var17 | ~var18)) * ((var17 | var18) & (~var17 | ~var18));
        var10003 = 682188856;
        var18 = 897578353;
        var17 = var10003;
        var10003 = var17 & ~var18 | ~var17 & var18;
        var18 = 500569677;
        var17 = var10003;
        var261[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
        var10002 = 172864439;
        var18 = -388428113;
        var17 = var10002;
        var10002 = (var17 | var18) & ~(var17 & var18);
        var18 = -493568751;
        var17 = var10002;
        var10002 = var17 + var18 - 2 * (var17 & var18);
        var10003 = 1980561564;
        var18 = 474166737;
        var17 = var10003;
        var10003 = var17 & ~var18 | ~var17 & var18;
        var18 = 1783627390;
        var17 = var10003;
        var261[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
        char[] var9 = var261;
        var10000 = 1581225459;
        var18 = -1557487182;
        var17 = var10000;
        var10000 = var17 + var18 - 2 * (var17 & var18);
        var18 = -48942015;
        var17 = var10000;
        for (int var10 = var17 + var18 - 2 * (var17 & var18); var10 < var6.length; ++var10) {
            char var318 = var6[var10];
            char var243 = var8[var10 % var8.length];
            char var125 = var318;
            var7[var10] = (char)((var125 | var243) - (var125 & var243));
        }
        char[] var19 = new char[var7.length];
        var10000 = -2040919412;
        var18 = 1319396785;
        var17 = var10000;
        var10000 = (var17 | var18) & ~(var17 & var18);
        var18 = -922849475;
        var17 = var10000;
        for (int var11 = (var17 | var18) - (var17 & var18); var11 < var6.length; ++var11) {
            char var319 = var7[var11];
            char var246 = var9[var11 % var9.length];
            char var128 = var319;
            var19[var11] = (char)(var128 + var246 - 2 * (var128 & var246));
        }
        String var20 = new String(var19);
        int var12 = var20.hashCode();
        var18 = var5;
        var17 = var3;
        var10000 = (var17 ^ var18) - 2 * (~var17 & var18);
        var18 = var2;
        var17 = var10000;
        int var13 = var17 + ~var18 + 1;
        char[] var14 = var0.toCharArray();
        char[] var15 = new char[var14.length];
        var10000 = 1312564403;
        var18 = -1185807103;
        var17 = var10000;
        var10000 = (var17 | var18) & (~var17 | ~var18);
        var18 = -143777358;
        var17 = var10000;
        block6: for (int var16 = (var17 | var18) - (var17 & var18); var16 < var15.length; ++var16) {
            var18 = 1179324500;
            var17 = -900215178;
            int var10001 = (var17 | var18) & (~var17 | ~var18);
            var18 = -1944265184;
            var17 = var10001;
            switch (var16 % ((var17 | var18) - (var17 & var18))) {
                case 0: {
                    var18 = var12;
                    var17 = var13;
                    var10002 = var17 + var18 - 2 * (var17 & var18);
                    char var256 = var14[var16];
                    var17 = var10002;
                    var15[var16] = (char)((var17 | var256) & (~var17 | ~var256));
                    continue block6;
                }
                case 1: {
                    var18 = var13;
                    var17 = var5;
                    var10002 = (var17 | var18) - (var17 & var18);
                    char var254 = var14[var16];
                    var17 = var10002;
                    var15[var16] = (char)(var17 + var254 - 2 * (var17 & var254));
                }
            }
        }
        return new String(var15);
    }

    public static enum Edge {
        TOP,
        BOTTOM,
        LEFT,
        RIGHT;

        public static int e;
        public static boolean f;

        public static String a(String value, String key, int seed1, int seed2, int seed3, int seed4) {
            return value;
        }
    }
}
