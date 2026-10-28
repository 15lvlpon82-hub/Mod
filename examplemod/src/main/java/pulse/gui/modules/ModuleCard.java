package pulse;

import java.awt.Color;
import net.minecraft.util.Identifier;
import net.minecraft.client.util.math.MatrixStack;
import org.joml.Quaternionf;
import pulse.AnimationState;
import pulse.Bool;
import pulse.BooleanSettingWidget;
import pulse.ColorSettingWidget;
import pulse.Easing;
import pulse.GuiEntry;
import pulse.ItemToggleSettingWidget;
import pulse.KeyBindSettingWidget;
import pulse.ModeSettingWidget;
import pulse.Renderer2D;
import pulse.ScissorStack;
import pulse.SettingGroupWidget;
import pulse.SettingWidget;
import pulse.SettingWidgetList;
import pulse.SliderSettingWidget;
import pulse.TokenSettingWidget;
import pulse.GuiLayerRegistry;
import pulse.GuiInput;
import pulse.IconTextureRegistry;
import pulse.Theme;
import pulse.PulseClickGuiScreen;
import pulse.PanelFadeOverlay;
import pulse.module.ClientModule;
import pulse.settings.BooleanSetting;
import pulse.settings.ColorSetting;
import pulse.settings.ItemToggleSetting;
import pulse.settings.KeySetting;
import pulse.settings.ModeSetting;
import pulse.settings.Setting;
import pulse.settings.SettingGroup;
import pulse.settings.SliderSetting;
import pulse.settings.TokenSetting;

class ModuleCard {
    public static final float a = 150.0f;
    public static final float b = 30.0f;
    public static final float c = 100.0f;
    public static final float d = 30.0f;
    public static final float e = 9.5f;
    public static final float f = 8.0f;
    public static final float g = 8.0f;
    public static final float h = 7.0f;
    private static final int k = 25;
    private static final float l = 5.0f;
    private final GuiEntry m;
    private final ClientModule n;
    private final int o;
    private final boolean p;
    private final VerticalAlign q;
    private final boolean r;
    private float s;
    private float t;
    private final AnimationState u = new AnimationState();
    private boolean v;
    private float w;
    private float x;
    private boolean y;
    private float z;
    private float A;
    private boolean B;
    private final SettingWidgetList C;
    private final PanelFadeOverlay D;
    private final AnimationState E;
    private boolean F;
    private KeyBindSettingWidget G;
    private float H;
    private int I;
    private int J;
    public static int i;
    public static boolean j;

    public ModuleCard(GuiEntry var1, ClientModule var2, int var3, boolean var4, float var5, float var6, VerticalAlign var7) {
        this(var1, var2, var3, var4, var5, var6, var7, false);
    }

    private ModuleCard(GuiEntry var1, ClientModule var2, int var3, boolean var4, float var5, float var6, VerticalAlign var7, boolean var8) {
        int var10 = -1809910183;
        int var9 = 1738904944;
        int var10001 = (var9 | var10) & (~var9 | ~var10);
        var10 = -205823191;
        var9 = var10001;
        this.v = Bool.from((int)(var9 + var10 - 2 * (var9 & var10)));
        var10001 = -2046607386;
        var10 = 531922034;
        var9 = var10001;
        var10001 = (var9 | var10) - (var9 & var10);
        var10 = -1716042860;
        var9 = var10001;
        this.y = Bool.from((int)((var9 | var10) & ~(var9 & var10)));
        var10 = -1697986353;
        var9 = -87091070;
        var10001 = (var9 | var10) & (~var9 | ~var10);
        var10 = 1610993741;
        var9 = var10001;
        this.B = Bool.from((int)(var9 & ~var10 | ~var9 & var10));
        this.E = new AnimationState();
        var10 = -1333940191;
        var9 = -1739398168;
        var10001 = var9 + var10 - 2 * (var9 & var10);
        var10 = 674190280;
        var9 = var10001;
        this.F = Bool.from((int)((var9 | var10) & ~(var9 & var10)));
        this.H = 0.0f;
        var10 = -763132664;
        var9 = -1816513191;
        var10001 = (var9 | var10) - (var9 & var10);
        var10 = 1094299729;
        var9 = var10001;
        this.I = (var9 | var10) - (var9 & var10);
        var10001 = -1015125751;
        var10 = -1515945454;
        var9 = var10001;
        var10001 = (var9 | var10) & (~var9 | ~var10);
        var10 = 1725623067;
        var9 = var10001;
        this.J = (var9 | var10) & ~(var9 & var10);
        this.m = var1;
        this.n = var2;
        this.o = var3;
        this.p = var4;
        this.s = var5;
        this.t = var6;
        this.q = var7;
        this.r = var8;
        this.C = new SettingWidgetList();
        String var66 = "bfb";
        this.C.b(7.0f);
        var10 = 880439723;
        var9 = -1033647275;
        var10001 = var9 & ~var10 | ~var9 & var10;
        var10 = 142629618;
        var9 = var10001;
        var10001 = (var9 | var10) & ~(var9 & var10);
        this.C.a(100.0f);
        if (!var8) {
            this.z();
        } else {
            this.y();
        }
        int var10003 = -1198235318;
        var10 = 1290347514;
        var9 = var10003;
        var10003 = (var9 | var10) & ~(var9 & var10);
        var10 = -193117527;
        var9 = var10003;
        var10003 = (var9 | var10) - (var9 & var10);
        var10 = 1490025827;
        var9 = -1615974717;
        int var10004 = (var9 | var10) & ~(var9 & var10);
        var10 = -1637773714;
        var9 = var10004;
        var10004 = (var9 | var10) & ~(var9 & var10);
        int var10005 = 1046290833;
        var10 = -797053563;
        var9 = var10005;
        var10005 = var9 & ~var10 | ~var9 & var10;
        var10 = -1912470060;
        var9 = var10005;
        var10005 = var9 & ~var10 | ~var9 & var10;
        int var10006 = 1210120193;
        var10 = 971219783;
        var9 = var10006;
        var10006 = (var9 | var10) & ~(var9 & var10);
        var10 = 1479993520;
        var9 = var10006;
        var10 = (var9 | var10) & (~var9 | ~var10);
        var9 = var10005;
        var10005 = var9 - ~var10 - 1;
        this.D = new PanelFadeOverlay(var10003, 5.0f, 9.5f);
        this.u.d(0.0);
        var10 = 905202985;
        var9 = -1976736912;
        int var10002 = (var9 | var10) & ~(var9 & var10);
        var10 = -97993882;
        var9 = var10002;
        var10002 = var9 & ~var10 | ~var9 & var10;
        this.u.a(1.0, 0.25, Easing.F);
        this.E.d(1.0);
    }

    public static ModuleCard a(GuiEntry var0, ClientModule var1, int var2, boolean var3, float var4, float var5) {
        int var7 = 399857223;
        int var6 = -1550836263;
        int var10009 = (var6 | var7) & ~(var6 & var7);
        var7 = -1270527073;
        var6 = var10009;
        return new ModuleCard(var0, var1, var2, var3, var4, var5, VerticalAlign.CENTER, Bool.from((int)(var6 + var7 - 2 * (var6 & var7))));
    }

    public void a(float var1, float var2, boolean var3) {
        int var5 = 1568982738;
        int var4 = -2109087412;
        int var10001 = var4 & ~var5 | ~var4 & var5;
        var5 = -540203105;
        var4 = var10001;
        this.y = Bool.from((int)((var4 | var5) - (var4 & var5)));
        this.z = var1;
        this.A = var2;
        this.B = var3;
    }

    private void y() {
        int var10000;
        if (this.m != null) {
            var10000 = this.m.f();
            if (j) {
                int var3;
                String var10001 = "bfc";
                int var5 = -1038033820;
                int var4 = 1129355305;
                int var49 = (var4 | var5) & ~(var4 & var5);
                var5 = -685680225;
                var4 = var49;
                i = var3 = (var4 | var5) & (~var4 | ~var5);
            }
        } else {
            int var28 = 533384678;
            int var7 = 1396471812;
            var10000 = var7 & ~var28 | ~var7 & var28;
            var28 = -1291236835;
            var7 = var10000;
            var10000 = var7 & ~var28 | ~var7 & var28;
        }
        int var1 = var10000;
        int var10003 = 1570557;
        int var30 = -2051570270;
        int var9 = var10003;
        var10003 = (var9 | var30) & (~var9 | ~var30);
        var30 = -742067163;
        var9 = var10003;
        var10003 = (var9 | var30) & ~(var9 & var30);
        var30 = -1496577588;
        var9 = 420796356;
        int var10004 = (var9 | var30) & ~(var9 & var30);
        var30 = 388243611;
        var9 = var10004;
        var10004 = (var9 | var30) & ~(var9 & var30);
        var30 = -1235228039;
        var9 = -2058018347;
        int var10005 = (var9 | var30) & (~var9 | ~var30);
        var30 = 240762145;
        var9 = var10005;
        var10005 = ((var9 | var30) & (~var9 | ~var30)) * ((var9 | var30) & (~var9 | ~var30));
        var30 = 111428611;
        var9 = -468808690;
        var10005 = (var9 | var30) - (var9 & var30);
        var30 = 1041066726;
        var9 = var10005;
        var10005 = var9 + var30 - 2 * (var9 & var30);
        String var10006 = "bfd";
        int var56 = -1718111366;
        var30 = 1685822345;
        var9 = var56;
        int var57 = var9 + var30 - 2 * (var9 & var30);
        var30 = -11247618;
        var9 = var57;
        int var58 = (var9 | var30) & (~var9 | ~var30);
        var30 = -189695724;
        var9 = -829629671;
        int var10008 = var9 + var30 - 2 * (var9 & var30);
        var30 = 977117703;
        var9 = var10008;
        var10008 = (var9 | var30) & (~var9 | ~var30);
        int var10007 = 1808189825;
        var30 = 2052571901;
        var9 = var10007;
        var10007 = (var9 | var30) & ~(var9 & var30);
        var30 = 14534679;
        var9 = var10007;
        var10007 = var9 & ~var30 | ~var9 & var30;
        var30 = -1959567842;
        var9 = 1271423770;
        var10008 = (var9 | var30) - (var9 & var30);
        var30 = 1280990459;
        var9 = var10008;
        var10008 = var9 + var30 - 2 * (var9 & var30);
        var30 = -893213654;
        var9 = 1569788197;
        var10008 = var9 & ~var30 | ~var9 & var30;
        var30 = -1761356175;
        var9 = var10008;
        this.G = new KeyBindSettingWidget(pulse.ModuleCard.a("\ud655\u17e1\ud67f\u17e8\ud677\u1792\ud67f\u13fa\ud67f\u17e0\ud60d\u17e2\ud67d\u17ea\ud609\u17e2\ud677", "`\ua7f3\ua4fa\ua061\ua910\u7d7a\u8e59\u247f\u8b78\u3474~\ua7ef\ua4b6\ua07a\ua902\u7d63\u8e43\u2435\u8b34\u3478\u007f\ua7eb\ua4ba\ua07f\ua94a\u7d5b\u8e45\u247e\u8b22\u347bw\ua7d5\ua4b0\ua065\ua911\u7d7f\u8e44\u247d\u8b24\u3447s\ua7e8\ua4b0\ua07d", var10005, var58, var10007, (var9 | var30) & ~(var9 & var30)), var1);
    }

    private void z() {
        if (this.n != null) {
            for (Setting var2 : this.n.m()) {
                SettingWidget var3 = this.a(var2);
                if (var3 == null) continue;
                this.C.a(var3);
            }
        }
    }

    private SettingWidget a(Setting<?> var1) {
        if (!(var1 instanceof BooleanSetting)) {
            if (!(var1 instanceof SliderSetting)) {
                if (!(var1 instanceof ModeSetting)) {
                    if (!(var1 instanceof KeySetting)) {
                        if (!(var1 instanceof ColorSetting)) {
                            if (!(var1 instanceof TokenSetting)) {
                                if (!(var1 instanceof ItemToggleSetting)) {
                                    SettingGroupWidget settingGroupWidget;
                                    if (!(var1 instanceof SettingGroup)) {
                                        settingGroupWidget = null;
                                    } else {
                                        SettingGroup var10 = (SettingGroup)var1;
                                        settingGroupWidget = new SettingGroupWidget(var10);
                                    }
                                    return settingGroupWidget;
                                }
                                ItemToggleSetting var9 = (ItemToggleSetting)var1;
                                return new ItemToggleSettingWidget(var9);
                            }
                            TokenSetting var8 = (TokenSetting)var1;
                            TokenSettingWidget.ValueType var3 = this.a(var8.b());
                            return new TokenSettingWidget(var8, var3);
                        }
                        ColorSetting var7 = (ColorSetting)var1;
                        return new ColorSettingWidget(var7);
                    }
                    KeySetting var6 = (KeySetting)var1;
                    return new KeyBindSettingWidget(var6);
                }
                ModeSetting var5 = (ModeSetting)var1;
                return new ModeSettingWidget(var5);
            }
            SliderSetting var4 = (SliderSetting)var1;
            return new SliderSettingWidget(var4);
        }
        BooleanSetting var2 = (BooleanSetting)var1;
        return new BooleanSettingWidget(var2);
    }

    private TokenSettingWidget.ValueType a(TokenSetting.TokenType var1) {
        switch (var1) {
            case COMMAND: {
                return TokenSettingWidget.ValueType.COMMAND;
            }
            case PLAYER: {
                return TokenSettingWidget.ValueType.PLAYER;
            }
            case NUMBER: {
                return TokenSettingWidget.ValueType.INT;
            }
            case PRICE: {
                return TokenSettingWidget.ValueType.PRICE;
            }
        }
        return TokenSettingWidget.ValueType.COMMAND;
    }

    public float a() {
        if (!this.r) {
            float var1 = this.C.m();
            String var10000 = "bfe";
            int var11 = 2087933476;
            int var5 = -62948135;
            int var10002 = var5 + var11 - 2 * (var5 & var11);
            var11 = -1514843089;
            var5 = var10002;
            var10002 = (var5 | var11) - (var5 & var11);
            var11 = -1457635998;
            var5 = 220853828;
            int var10003 = (var5 | var11) & ~(var5 & var11);
            var11 = 725071941;
            var5 = var10003;
            var11 = var5 + var11 - 2 * (var5 & var11);
            var5 = var10002;
            var10002 = (var5 ^ var11) + 2 * (var5 & var11);
            return Math.max(30.0f, Math.min(var1, 100.0f));
        }
        int var3 = 805688650;
        int var2 = -507561192;
        int var10001 = var2 & ~var3 | ~var2 & var3;
        var3 = -776278436;
        var2 = var10001;
        var10001 = var2 + var3 - 2 * (var2 & var3);
        return 30.0f;
    }

    public void a(float var1) {
        this.s = var1;
    }

    public void b() {
        if (!this.v) {
            int var2 = -1207353601;
            int var1 = 1878861735;
            int var10001 = var1 + var2 - 2 * (var1 & var2);
            var2 = -671868583;
            var1 = var10001;
            this.v = Bool.from((int)((var1 | var2) & ~(var1 & var2)));
            this.C.g();
            AnimationState var10000 = this.u;
            var2 = 395138712;
            var1 = -1185984564;
            int var10003 = (var1 | var2) & ~(var1 & var2);
            var2 = -1363011248;
            var1 = var10003;
            var10003 = (var1 | var2) - (var1 & var2);
            var2 = 1448718290;
            var1 = 443946843;
            var10003 = (var1 | var2) & (~var1 | ~var2);
            var2 = 1278195849;
            var1 = var10003;
            var10003 = var1 + var2 - 2 * (var1 & var2);
            var10003 = 1403467468;
            var2 = -1718073190;
            var1 = var10003;
            var10003 = var1 + var2 - 2 * (var1 & var2);
            var2 = -901808552;
            var1 = var10003;
            var10003 = (var1 | var2) - (var1 & var2);
            var10003 = -1315857541;
            var2 = -2143389744;
            var1 = var10003;
            var10003 = (var1 | var2) & ~(var1 & var2);
            var2 = 833612974;
            var1 = var10003;
            var10003 = var1 + var2 - 2 * (var1 & var2);
            var10000.a(0.0, 0.15, Easing.g);
        }
    }

    public void c() {
        int var10001 = -1660438827;
        int var2 = -1525854879;
        int var1 = var10001;
        var10001 = var1 + var2 - 2 * (var1 & var2);
        var2 = 940243893;
        var1 = var10001;
        this.v = Bool.from((int)((var1 | var2) - (var1 & var2)));
        this.u.d(0.0);
        this.C.g();
        if (this.r && this.G != null) {
            this.G.e();
        }
    }

    public void d() {
        int var10001 = 2112574760;
        int var2 = -207375218;
        int var1 = var10001;
        var10001 = var1 & ~var2 | ~var1 & var2;
        var2 = -1907826266;
        var1 = var10001;
        this.v = Bool.from((int)(var1 + var2 - 2 * (var1 & var2)));
        this.u.d(1.0);
        this.C.g();
    }

    public boolean e() {
        if (this.v && this.u.d()) {
            double var10000 = this.u.j();
            int var2 = -1293043063;
            int var1 = -2101007324;
            int var10001 = var1 & ~var2 | ~var1 & var2;
            var2 = 2017903381;
            var1 = var10001;
            var10001 = var1 & ~var2 | ~var1 & var2;
            int var10002 = -1841793184;
            var2 = -1265744374;
            var1 = var10002;
            var10002 = var1 & ~var2 | ~var1 & var2;
            var2 = 732164503;
            var1 = var10002;
            var2 = (var1 | var2) & (~var1 | ~var2);
            var1 = var10001;
            var10001 = (var1 ^ var2) + 2 * (var1 & var2);
            if (var10000 < 0.01) {
                int var22 = 609314491;
                var2 = -174722837;
                var1 = var22;
                int var23 = var1 & ~var2 | ~var1 & var2;
                var2 = -775645615;
                var1 = var23;
                return Bool.from((int)((var1 | var2) & (~var1 | ~var2)));
            }
        }
        int var19 = 853372688;
        int var15 = -1341754409;
        int var7 = var19;
        var19 = (var7 | var15) & (~var7 | ~var15);
        var15 = -2099569465;
        var7 = var19;
        return Bool.from((int)(var7 + var15 - 2 * (var7 & var15)));
    }

    public boolean f() {
        return this.v;
    }

    public boolean g() {
        return this.r;
    }

    public boolean a(float var1, float var2) {
        int var17;
        if (this.y) {
            int var20 = 2089384191;
            int var14 = 1038400618;
            int var9 = var20;
            var20 = (var9 | var14) - (var9 & var14);
            var14 = 1097712789;
            var9 = var20;
            return Bool.from((int)((var9 | var14) & (~var9 | ~var14)));
        }
        float var3 = this.s + this.t / 2.0f;
        if (!(var3 < var1) && !(var3 > var1 + var2)) {
            var17 = -1824622721;
            int var12 = 38334675;
            int var7 = var17;
            var17 = var7 + var12 - 2 * (var7 & var12);
            var12 = -1854502996;
            var7 = var17;
            var17 = (var7 | var12) & ~(var7 & var12);
        } else {
            var17 = -1807427381;
            int var5 = 547618603;
            int var4 = var17;
            var17 = var4 & ~var5 | ~var4 & var5;
            var5 = -1259919391;
            var4 = var17;
            var17 = (var4 | var5) & (~var4 | ~var5);
        }
        return Bool.from((int)var17);
    }

    private float b(float var1) {
        float var2 = this.a();
        switch (this.q.ordinal()) {
            case 0: {
                String var10000 = "bff";
                return 8.0f + var1 / 2.0f;
            }
            default: {
                return var2 / 2.0f;
            }
            case 2: 
        }
        int var10002 = -823038807;
        int var4 = -623600340;
        int var3 = var10002;
        var10002 = var3 & ~var4 | ~var3 & var4;
        var4 = 338030991;
        var3 = var10002;
        var10002 = var3 & ~var4 | ~var3 & var4;
        var4 = -228277321;
        var3 = -893549641;
        var10002 = (var3 | var4) & (~var3 | ~var4);
        var4 = 953761805;
        var3 = var10002;
        var10002 = var3 + var4 - 2 * (var3 & var4);
        return var2 - 8.0f - var1 / 2.0f;
    }

    public static float a(float var0, float var1, VerticalAlign var2, float var3, float var4) {
        float var5 = var0 + var1 / 2.0f;
        return var5 - (switch (var2.ordinal()) {
            case 0 -> {
                int var13 = -960694307;
                int var10 = -1060871306;
                int var10000 = (var10 | var13) & ~(var10 & var13);
                var13 = -519159503;
                var10 = var10000;
                var10000 = (var10 & ~var13 | ~var10 & var13) * (var10 & ~var13 | ~var10 & var13);
                yield 8.0f + var3 / 2.0f;
            }
            default -> var4 / 2.0f;
            case 2 -> {
                int var10001 = 1805620495;
                int var8 = -665851598;
                int var7 = var10001;
                var10001 = (var7 | var8) & ~(var7 & var8);
                var8 = -420525665;
                var7 = var10001;
                var10001 = (var7 & ~var8 | ~var7 & var8) * (var7 & ~var8 | ~var7 & var8);
                yield var4 - 8.0f - var3 / 2.0f;
            }
        });
    }

    public static boolean a(float var0, float var1, float var2, float var3) {
        int var17;
        float var4 = var0;
        float var5 = var0 + var1;
        float var6 = var2;
        float var7 = var2 + var3;
        if (!(var5 <= var6) && !(var4 >= var7)) {
            int var14 = -132238721;
            int var11 = 449464249;
            var17 = var11 + var14 - 2 * (var11 & var14);
            var14 = -489392697;
            var11 = var17;
            var17 = (var11 | var14) & ~(var11 & var14);
        } else {
            var17 = -1340169394;
            int var9 = 1307052741;
            int var8 = var17;
            var17 = var8 & ~var9 | ~var8 & var9;
            var9 = -34166389;
            var8 = var17;
            var17 = (var8 | var9) & ~(var8 & var9);
        }
        return Bool.from((int)var17);
    }

    private GuiLayerRegistry.Layer A() {
        return !this.r ? GuiLayerRegistry.Layer.SETTINGS_PANEL : GuiLayerRegistry.Layer.KEYBIND_PANEL;
    }

    public void a(MatrixStack var1, Renderer2D var2, float var3, float var4, int var5, int var6, float var7, float var8) {
        int var10009 = 540012773;
        int var10 = 1492119858;
        int var9 = var10009;
        var10009 = var9 + var10 - 2 * (var9 & var10);
        var10 = 2025849303;
        var9 = var10009;
        this.a(var1, var2, var3, var4, var5, var6, var7, var8, Bool.from((int)((var9 | var10) - (var9 & var10))));
    }

    public void a(MatrixStack var1, Renderer2D var2, float var3, float var4, int var5, int var6, float var7, float var8, boolean var9) {
        this.u.a();
        this.E.a();
        float var10 = (float)this.u.j();
        String var10001 = "bfg";
        if (!(var10 < 0.01f)) {
            int var10000;
            this.H = var10;
            this.I = var5;
            this.J = var6;
            if (!var9) {
                var10000 = var5;
            } else {
                var10000 = 2089029830;
                int var18 = 435529257;
                int var17 = var10000;
                var10000 = var17 & ~var18 | ~var17 & var18;
                var18 = -1701951216;
                var17 = var10000;
                var10000 = var17 & ~var18 | ~var17 & var18;
            }
            int var11 = var10000;
            if (!var9) {
                var10000 = var6;
            } else {
                var10000 = 715684997;
                int var35 = -1613410552;
                int var20 = var10000;
                var10000 = var20 & ~var35 | ~var20 & var35;
                var35 = 1250086002;
                var20 = var10000;
                var10000 = (var20 | var35) - (var20 & var35);
            }
            int var12 = var10000;
            float var13 = this.a();
            float var14 = pulse.PulseClickGuiScreen.d();
            float var15 = Math.max(0.0f, Math.min(1.0f, var10));
            var10000 = 950528854;
            int var37 = -1428168576;
            int var22 = var10000;
            var10000 = (var22 | var37) - (var22 & var37);
            var37 = -2045782708;
            var22 = var10000;
            var10000 = (var22 | var37) & ~(var22 & var37);
            int var59 = -432653355;
            var37 = -2003359956;
            var22 = var59;
            int var60 = (var22 | var37) & ~(var22 & var37);
            var37 = -1513147784;
            var22 = var60;
            var37 = (var22 | var37) & ~(var22 & var37);
            var22 = var10000;
            var10000 = 2 * (var22 | var37) - (var22 ^ var37);
            int var16 = (int)(255.0f * var15);
            if (!this.y) {
                this.a(var1, var2, var3, var4, var11, var12, var13, var14, var15, var16);
            } else {
                this.a(var1, var2, var3, var4, var11, var12, var13, var15, var16);
            }
            if (!this.v) {
                int var61 = 1258256687;
                var37 = -92973359;
                var22 = var61;
                int var62 = (var22 | var37) - (var22 & var37);
                var37 = -443039751;
                var22 = var62;
                int var63 = var22 & ~var37 | ~var22 & var37;
                if (var15 > 0.5f) {
                    GuiLayerRegistry var58 = GuiLayerRegistry.a();
                    GuiLayerRegistry.Layer var64 = this.A();
                    int var10004 = 524186646;
                    var37 = -42888147;
                    var22 = var10004;
                    var10004 = var22 + var37 - 2 * (var22 & var37);
                    var37 = -475307402;
                    var22 = var10004;
                    var10004 = (var22 | var37) & (~var22 | ~var37);
                    var37 = -6762224;
                    var22 = 1031674203;
                    int var10005 = var22 + var37 - 2 * (var22 & var37);
                    var37 = -1862912644;
                    var22 = var10005;
                    var37 = var22 & ~var37 | ~var22 & var37;
                    var22 = var10004;
                    var10004 = var22 - ~var37 - 1;
                    var58.a(var64, this.w, this.x, 150.0f, var13);
                }
            }
        }
    }

    public void a(MatrixStack var1, Renderer2D var2, int var3, int var4) {
        if (!this.r) {
            float var5 = (float)this.u.j();
            int var8 = -134219546;
            int var7 = -1002151147;
            int var10001 = var7 & ~var8 | ~var7 & var8;
            var8 = 1159234336;
            var7 = var10001;
            var10001 = ((var7 | var8) & (~var7 | ~var8)) * ((var7 | var8) & (~var7 | ~var8));
            if (!(var5 < 0.1f)) {
                float var6 = Math.max(0.0f, Math.min(1.0f, var5));
                this.C.a(var1, var2, var3, var4, var6, var6);
            }
        }
    }

    public void b(MatrixStack var1, Renderer2D var2, int var3, int var4) {
    }

    private void a(MatrixStack var1, Renderer2D var2, float var3, float var4, int var5, int var6, float var7, float var8, int var9) {
        this.w = this.z;
        this.x = this.A;
        int var30 = -428706386;
        int var29 = 1146577357;
        int var10001 = (var29 | var30) & (~var29 | ~var30);
        var30 = -265393766;
        var29 = var10001;
        var10001 = (var29 | var30) & (~var29 | ~var30);
        float var10 = this.w + 75.0f;
        float var11 = this.x + var7 / 2.0f;
        int var10000 = -1333695254;
        var30 = 834449037;
        var29 = var10000;
        var10000 = (var29 | var30) & ~(var29 & var30);
        var30 = 1400484152;
        var29 = var10000;
        var10000 = var29 & ~var30 | ~var29 & var30;
        float var12 = 150.0f * var8;
        float var13 = var7 * var8;
        float var14 = var10 - var12 / 2.0f;
        float var15 = var11 - var13 / 2.0f;
        Color var16 = pulse.Theme.a((Color)pulse.Theme.q, (int)var9);
        Color var17 = pulse.Theme.a((Color)pulse.Theme.r, (int)var9);
        int var10002 = -244163473;
        var30 = -1985484669;
        var29 = var10002;
        var10002 = var29 & ~var30 | ~var29 & var30;
        var30 = -908987383;
        var29 = var10002;
        var10002 = var29 + var30 - 2 * (var29 & var30);
        float var204 = var14 - 0.5f * var8;
        int var10003 = -1599973909;
        var30 = -1235636678;
        var29 = var10003;
        var10003 = var29 + var30 - 2 * (var29 & var30);
        var30 = -1563073667;
        var29 = var10003;
        var10003 = ((var29 | var30) & ~(var29 & var30)) * ((var29 | var30) & ~(var29 & var30));
        float var224 = var15 - 0.5f * var8;
        float var259 = var12 + var8;
        float var10004 = var13 + var8;
        var30 = 1378682573;
        var29 = -1289640740;
        int var10005 = var29 + var30 - 2 * (var29 & var30);
        var30 = -591321944;
        var29 = var10005;
        var10005 = var29 + var30 - 2 * (var29 & var30);
        var2.a(var204, var224, var259, var10004, 9.5f * var8, var16, var16, var17, var17, var1);
        Color var18 = pulse.Theme.a((Color)pulse.Theme.e, (int)var9);
        Color var19 = pulse.Theme.a((Color)pulse.Theme.f, (int)var9);
        String var275 = "bfh";
        var2.a(var14, var15, var12, var13, 9.5f * var8, var18, var18, var19, var19, var1);
        String var194 = "bfi";
        var10001 = -1121797921;
        var30 = 80996332;
        var29 = var10001;
        var10001 = var29 & ~var30 | ~var29 & var30;
        var30 = 1002564009;
        var29 = var10001;
        var10001 = ((var29 | var30) & (~var29 | ~var30)) * ((var29 | var30) & (~var29 | ~var30));
        var10002 = -573049750;
        var30 = -576486794;
        var29 = var10002;
        var10002 = (var29 | var30) & ~(var29 & var30);
        var30 = 788066204;
        var29 = var10002;
        var10002 = (var29 | var30) - (var29 & var30);
        var10002 = 1693048861;
        var30 = 896149755;
        var29 = var10002;
        var10002 = (var29 | var30) & (~var29 | ~var30);
        var30 = -1926993395;
        var29 = var10002;
        var10002 = (var29 | var30) & ~(var29 & var30);
        var30 = -1156474540;
        var29 = 773834957;
        var10003 = (var29 | var30) & ~(var29 & var30);
        var30 = -679757827;
        var29 = var10003;
        var10003 = (var29 | var30) - (var29 & var30);
        var30 = -1557229484;
        var29 = 1814038752;
        int var266 = (var29 | var30) & ~(var29 & var30);
        var30 = 1999376747;
        var29 = var266;
        var30 = var29 & ~var30 | ~var29 & var30;
        var29 = var10003;
        var10003 = (var29 & ~var30) + (var30 & ~var29) + 2 * (var29 & var30);
        var30 = -1427113808;
        var29 = 236769606;
        var10003 = (var29 | var30) - (var29 & var30);
        var30 = -1898376734;
        var29 = var10003;
        var10003 = (var29 | var30) & ~(var29 & var30);
        int var267 = -173707453;
        var30 = 832457078;
        var29 = var267;
        int var268 = var29 + var30 - 2 * (var29 & var30);
        var30 = 2009542705;
        var29 = var268;
        int var269 = (var29 | var30) & (~var29 | ~var30);
        var10005 = -403616314;
        var30 = 598193540;
        var29 = var10005;
        var10005 = (var29 | var30) - (var29 & var30);
        var30 = 1698910431;
        var29 = var10005;
        var30 = var29 & ~var30 | ~var29 & var30;
        var29 = var269;
        int var270 = (var29 ^ var30) + 2 * (var29 & var30);
        int var271 = -353326077;
        var30 = 113500677;
        var29 = var271;
        int var272 = var29 + var30 - 2 * (var29 & var30);
        var30 = -356773993;
        var29 = var272;
        int var273 = (var29 | var30) - (var29 & var30);
        var30 = -42998806;
        var29 = -462105300;
        var10005 = (var29 | var30) - (var29 & var30);
        var30 = 658657434;
        var29 = var10005;
        var10005 = (var29 | var30) & ~(var29 & var30);
        var30 = 159313021;
        var29 = -1495791986;
        int var10006 = var29 + var30 - 2 * (var29 & var30);
        var30 = 2081947308;
        var29 = var10006;
        var30 = (var29 | var30) & (~var29 | ~var30);
        var29 = var10005;
        var10005 = var29 - ~var30 - 1;
        var30 = 1026408495;
        var29 = 1379779411;
        var10005 = var29 + var30 - 2 * (var29 & var30);
        var30 = 1864732739;
        var29 = var10005;
        IconTextureRegistry.TextureInfo var20 = IconTextureRegistry.getInfo((String)pulse.ModuleCard.a("\ua360\u92a7\ua373\u92ba\ua376\u928a\ua377", "`\ua7f3\ua4fa\ua061\ua910\u7d7a\u8e59\u247f\u8b78\u3474~\ua7ef\ua4b6\ua07a\ua902\u7d63\u8e43\u2435\u8b34\u3478\u007f\ua7eb\ua4ba\ua07f\ua94a\u7d5b\u8e45\u247e\u8b22\u347bw\ua7d5\ua4b0\ua065\ua911\u7d7f\u8e44\u247d\u8b24\u3447s\ua7e8\ua4b0\ua07d", var10002, var10003, var273, (var29 | var30) - (var29 & var30)));
        if (var20 != null) {
            Identifier var21 = var20.a();
            float var22 = (float)var20.b() / 2.0f * var8;
            float var23 = (float)var20.c() / 2.0f * var8;
            float var24 = var14 + var12 / 2.0f;
            float var25 = var15 + var13 + var22 / 2.0f + 1.0f;
            Color var26 = pulse.Theme.a((Color)pulse.Theme.aa, (int)var9);
            var1.push();
            var1.translate(var24, var25, 0.0f);
            Quaternionf var208 = new Quaternionf();
            var30 = 932168843;
            var29 = 770761572;
            var10002 = var29 & ~var30 | ~var29 & var30;
            var30 = -2129280102;
            var29 = var10002;
            var10002 = ((var29 | var30) & ~(var29 & var30)) * ((var29 | var30) & ~(var29 & var30));
            var1.multiply(var208.rotationZ((float)Math.toRadians(90.0)));
            var1.translate(-var24, -var25, 0.0f);
            float var195 = var24 - var22 / 2.0f;
            var30 = -273484167;
            var29 = -142270243;
            var10001 = (var29 | var30) & ~(var29 & var30);
            var30 = 513174616;
            var29 = var10001;
            var10001 = (var29 | var30) & ~(var29 & var30);
            var10002 = -416097963;
            var30 = -1473835515;
            var29 = var10002;
            var10002 = var29 + var30 - 2 * (var29 & var30);
            var30 = 603894758;
            var29 = var10002;
            var30 = var29 + var30 - 2 * (var29 & var30);
            var29 = var10001;
            var10001 = (var29 ^ var30) + 2 * (var29 & var30);
            float var27 = var195 - 0.5f;
            float var28 = var25 - var23 / 2.0f;
            var2.a(var21, var27, var28, var22, var23, var26, var1);
            var1.pop();
        }
        if (this.r) {
            var30 = -514599887;
            var29 = -471419162;
            var10002 = var29 + var30 - 2 * (var29 & var30);
            var30 = 45441746;
            var29 = var10002;
            var10002 = (var29 | var30) & (~var29 | ~var30);
            var30 = -1954055285;
            var29 = -1144840748;
            var10002 = var29 & ~var30 | ~var29 & var30;
            var30 = 809789023;
            var29 = var10002;
            var10002 = (var29 | var30) - (var29 & var30);
            var30 = 1459214800;
            var29 = -1632754990;
            var10002 = var29 + var30 - 2 * (var29 & var30);
            var30 = -933758199;
            var29 = var10002;
            var10002 = (var29 | var30) - (var29 & var30);
            if (var8 > 0.1f && this.G != null) {
                String var221 = "bfj";
                float var32 = var14 + 3.0f * var8;
                String var248 = "bfk";
                float var34 = var15 + (var13 - 20.0f * var8) / 2.0f;
                var30 = 1666967037;
                var29 = 1158468243;
                var10002 = (var29 | var30) & ~(var29 & var30);
                var30 = 643250023;
                var29 = var10002;
                var10002 = (var29 | var30) & ~(var29 & var30);
                var10002 = 1154421787;
                var30 = 451476613;
                var29 = var10002;
                var10002 = var29 + var30 - 2 * (var29 & var30);
                var30 = 1579673743;
                var29 = var10002;
                var10002 = (var29 | var30) - (var29 & var30);
                var10002 = -650523928;
                var30 = -1758844107;
                var29 = var10002;
                var10002 = var29 & ~var30 | ~var29 & var30;
                var30 = 1309925848;
                var29 = var10002;
                var10002 = (var29 | var30) & ~(var29 & var30);
                float var36 = var12 - 6.0f * var8;
                this.G.a(var1, var2, var32, var34, var36, var5, var6, var8, var8);
                return;
            }
        }
        if (!this.r) {
            var10001 = -1866999332;
            var30 = 150381609;
            var29 = var10001;
            var10001 = var29 & ~var30 | ~var29 & var30;
            var30 = 1238044591;
            var29 = var10001;
            var10001 = (var29 | var30) & (~var29 | ~var30);
            if (var8 > 0.1f) {
                var30 = 595753099;
                var29 = -2079555300;
                var10002 = (var29 | var30) - (var29 & var30);
                var30 = -1483802224;
                var29 = var10002;
                var10002 = (var29 | var30) - (var29 & var30);
                var30 = 1108891587;
                var29 = 789363745;
                var10002 = (var29 | var30) & (~var29 | ~var30);
                var30 = 1830087664;
                var29 = var10002;
                var10002 = (var29 | var30) & ~(var29 & var30);
                float var31 = var15 + 7.0f * var8;
                var30 = 1237865288;
                var29 = 1071932424;
                var10001 = var29 & ~var30 | ~var29 & var30;
                var30 = -1430292943;
                var29 = var10001;
                var10001 = (var29 | var30) - (var29 & var30);
                float var196 = var13 - 7.0f;
                var30 = 1370789167;
                var29 = -12045008;
                var10001 = (var29 | var30) & ~(var29 & var30);
                var30 = 1931980004;
                var29 = var10001;
                var10001 = (var29 | var30) & (~var29 | ~var30);
                float var33 = (var196 - 6.0f) * var8;
                if (var12 > 0.0f && var33 > 0.0f) {
                    ScissorStack var197 = var2.b();
                    var30 = -650711599;
                    var29 = 1223901851;
                    var10005 = (var29 | var30) & (~var29 | ~var30);
                    var30 = -1598492961;
                    var29 = var10005;
                    var10005 = ((var29 | var30) & (~var29 | ~var30)) * ((var29 | var30) & (~var29 | ~var30));
                    var197.a(var14, var31, var12, var33, 9.5f * var8, var1);
                    this.C.a(var1, var2, var14, var15, var12, var13, var5, var6, var8, var8);
                    float var35 = var15 + var13;
                    boolean var37 = this.C.e(var35);
                    if (this.C.d(var13) && !var37) {
                        var10000 = 83894166;
                        var30 = -808975362;
                        var29 = var10000;
                        var10000 = var29 & ~var30 | ~var29 & var30;
                        var30 = -892855191;
                        var29 = var10000;
                        var10000 = (var29 | var30) & ~(var29 & var30);
                    } else {
                        var10000 = 1554657327;
                        var30 = -577827762;
                        var29 = var10000;
                        var10000 = var29 & ~var30 | ~var29 & var30;
                        var30 = -2128266143;
                        var29 = var10000;
                        var10000 = (var29 | var30) & (~var29 | ~var30);
                    }
                    int var38 = var10000;
                    if (Bool.from((int)var38) != this.F) {
                        double var219 = var38 == 0 ? 0.0 : 1.0;
                        var30 = 431047875;
                        var29 = 505825581;
                        var10002 = (var29 | var30) & ~(var29 & var30);
                        var30 = 1518425010;
                        var29 = var10002;
                        var10002 = (var29 | var30) & (~var29 | ~var30);
                        var30 = -371265027;
                        var29 = 574162739;
                        var10003 = (var29 | var30) & ~(var29 & var30);
                        var30 = -688684156;
                        var29 = var10003;
                        var30 = (var29 | var30) - (var29 & var30);
                        var29 = var10002;
                        var10002 = 2 * (var29 | var30) - (var29 ^ var30);
                        this.E.a(var219, 0.15, Easing.h);
                        this.F = Bool.from((int)var38);
                    }
                    float var39 = (float)this.E.j();
                    String var220 = "bfl";
                    if (var39 > 0.01f) {
                        this.D.a(var1, var2, var14, var15, var12, var13, var8 * var39);
                    }
                    var2.b().a(var1);
                }
            }
        }
    }

    private void a(MatrixStack var1, Renderer2D var2, float var3, float var4, int var5, int var6, float var7, float var8, float var9, int var10) {
        float var11 = this.s + this.t / 2.0f;
        int var10000 = -1891549420;
        int var39 = 215814895;
        int var38 = var10000;
        var10000 = (var38 | var39) & (~var38 | ~var39);
        var39 = 831780372;
        var38 = var10000;
        var10000 = var38 & ~var39 | ~var38 & var39;
        var39 = 1958503979;
        var38 = 1290185701;
        int var10001 = (var38 | var39) & ~(var38 & var39);
        var39 = -211649016;
        var38 = var10001;
        var10001 = ((var38 | var39) - (var38 & var39)) * ((var38 | var39) - (var38 & var39));
        var39 = 1139734604;
        var38 = -1884383509;
        int var10002 = var38 + var39 - 2 * (var38 & var39);
        var39 = 181312786;
        var38 = var10002;
        var10002 = (var38 & ~var39 | ~var38 & var39) * (var38 & ~var39 | ~var38 & var39);
        var39 = -1299009300;
        var38 = 9182467;
        var10002 = (var38 | var39) & (~var38 | ~var39);
        var39 = 1857621764;
        var38 = var10002;
        var10002 = var38 & ~var39 | ~var38 & var39;
        var39 = -1767404714;
        var38 = -490673055;
        int var10003 = (var38 | var39) - (var38 & var39);
        var39 = 779306084;
        var38 = var10003;
        var10003 = ((var38 | var39) & (~var38 | ~var39)) * ((var38 | var39) & (~var38 | ~var39));
        var39 = 1903997068;
        var38 = -1186658117;
        var10003 = (var38 | var39) - (var38 & var39);
        var39 = -1283973368;
        var38 = var10003;
        var10003 = (var38 | var39) - (var38 & var39);
        var39 = -2139533041;
        var38 = 1914949743;
        int var10005 = var38 + var39 - 2 * (var38 & var39);
        var39 = -228949651;
        var38 = var10005;
        var10005 = var38 & ~var39 | ~var38 & var39;
        var10005 = 894876190;
        var39 = -1692164223;
        var38 = var10005;
        var10005 = (var38 | var39) & (~var38 | ~var39);
        var39 = -1368054380;
        var38 = var10005;
        var10005 = (var38 | var39) - (var38 & var39);
        var10005 = -1271906120;
        var39 = 2036207166;
        var38 = var10005;
        var10005 = (var38 | var39) - (var38 & var39);
        var39 = -848408948;
        var38 = var10005;
        var10005 = var38 + var39 - 2 * (var38 & var39);
        var10005 = -1149162549;
        var39 = -1395280680;
        var38 = var10005;
        var10005 = (var38 | var39) - (var38 & var39);
        var39 = 391421721;
        var38 = var10005;
        var10005 = (var38 | var39) & (~var38 | ~var39);
        var39 = -1421609291;
        var38 = -1906405697;
        var10005 = (var38 | var39) & ~(var38 & var39);
        var39 = 622688256;
        var38 = var10005;
        var10005 = (var38 | var39) & ~(var38 & var39);
        int var10004 = -2125902389;
        var39 = -1987243549;
        var38 = var10004;
        var10004 = var38 + var39 - 2 * (var38 & var39);
        var39 = 401039311;
        var38 = var10004;
        var10004 = (var38 | var39) & ~(var38 & var39);
        String var431 = "bfm";
        var39 = -2086761644;
        var38 = -1501075546;
        var10005 = (var38 | var39) & (~var38 | ~var39);
        var39 = 623354358;
        var38 = var10005;
        IconTextureRegistry.TextureInfo var12 = IconTextureRegistry.getInfo((String)pulse.ModuleCard.a("\u15da\ufa26\u15c9\ufa3b\u15cc\ufa0b\u15cd", "`\ua7f3\ua4fa\ua061\ua910\u7d7a\u8e59\u247f\u8b78\u3474~\ua7ef\ua4b6\ua07a\ua902\u7d63\u8e43\u2435\u8b34\u3478\u007f\ua7eb\ua4ba\ua07f\ua94a\u7d5b\u8e45\u247e\u8b22\u347bw\ua7d5\ua4b0\ua065\ua911\u7d7f\u8e44\u247d\u8b24\u3447s\ua7e8\ua4b0\ua07d", var10002, var10003, var10004, var38 + var39 - 2 * (var38 & var39)));
        float var13 = var12 != null ? (float)var12.b() / 2.0f : 0.0f;
        float var14 = var12 != null ? (float)var12.c() / 2.0f : 0.0f;
        float var15 = this.b(var14);
        this.x = var11 - var15;
        if (!this.p) {
            if (i != i) {
                var39 = 1204957791;
                var38 = -1555582174;
                var10000 = (var38 | var39) & ~(var38 & var39);
                var39 = 1288269896;
                var38 = var10000;
                var10000 = (var38 | var39) - (var38 & var39);
                var39 = 825355688;
                var38 = 283168427;
                var10001 = var38 + var39 - 2 * (var38 & var39);
                var39 = -777549948;
                var38 = var10001;
                var39 = var38 & ~var39 | ~var38 & var39;
                var38 = var10000;
                var10000 = 2 * (var38 | var39) - (var38 ^ var39);
                var10000 = 992604952;
                var39 = 1012789893;
                var38 = var10000;
                var10000 = (var38 | var39) - (var38 & var39);
                var39 = 145403505;
                var38 = var10000;
                int n = (var38 | var39) & (~var38 | ~var39);
            }
            float var335 = var3 + var8;
            String var369 = "bfn";
            this.w = var335 + 8.0f + var13;
        } else {
            int var45;
            var10002 = 1501308305;
            var39 = -672468959;
            var38 = var10002;
            var10002 = (var38 | var39) & (~var38 | ~var39);
            var39 = 992779171;
            var38 = var10002;
            var10002 = (var38 + var39 - 2 * (var38 & var39)) * (var38 + var39 - 2 * (var38 & var39));
            float var336 = var3 - 8.0f - var13;
            var39 = 1048779829;
            var38 = 1904633688;
            var10002 = var38 + var39 - 2 * (var38 & var39);
            var39 = 1450834721;
            var38 = var10002;
            var10002 = (var38 | var39) & ~(var38 & var39);
            var39 = -1369966950;
            var38 = 1643945752;
            var10003 = var38 & ~var39 | ~var38 & var39;
            var39 = 185755162;
            var38 = var10003;
            var39 = (var38 | var39) & (~var38 | ~var39);
            var38 = var10002;
            var10002 = 2 * (var38 | var39) - (var38 ^ var39);
            this.w = var336 - 150.0f;
            var10000 = -1755010251;
            var39 = 1416030352;
            var38 = var10000;
            var10000 = (var38 | var39) & ~(var38 & var39);
            var39 = -1886569419;
            var38 = var10000;
            var10000 = var38 & ~var39 | ~var38 & var39;
            var39 = -1645850307;
            var38 = 1221627613;
            var10001 = (var38 | var39) - (var38 & var39);
            var39 = 1757731772;
            var38 = var10001;
            var39 = (var38 | var39) - (var38 & var39);
            var38 = var10000;
            var10000 = 2 * (var38 | var39) - (var38 ^ var39);
            var39 = -551507344;
            var38 = -426174708;
            var10000 = (var38 | var39) & (~var38 | ~var39);
            var39 = 943146596;
            var38 = var10000;
            i = var45 = (var38 | var39) - (var38 & var39);
            var39 = 843249216;
            var38 = 359439634;
            var10000 = var38 + var39 - 2 * (var38 & var39);
            var39 = -1203266797;
            var38 = var10000;
            var10000 = var38 & ~var39 | ~var38 & var39;
            var10000 = -1395260338;
            var39 = -758278440;
            var38 = var10000;
            var10000 = var38 & ~var39 | ~var38 & var39;
            if ((((var38 = var10000) | (var39 = 1824649604)) & ~(var38 & var39)) < i) {
                var10000 = 541313337;
                var39 = 446283268;
                var38 = var10000;
                var10000 = (var38 | var39) & ~(var38 & var39);
                var39 = 987395901;
                var38 = var10000;
                var10000 = (var38 | var39) & (~var38 | ~var39);
                var10001 = -511284730;
                var39 = 189856539;
                var38 = var10001;
                var10001 = (var38 | var39) & ~(var38 & var39);
                var39 = -355036899;
                var38 = var10001;
                var10000 /= var38 + var39 - 2 * (var38 & var39);
            }
        }
        var39 = -1392399706;
        var38 = 2090006465;
        var10001 = var38 + var39 - 2 * (var38 & var39);
        var39 = -860364417;
        var38 = var10001;
        var10001 = (var38 + var39 - 2 * (var38 & var39)) * (var38 + var39 - 2 * (var38 & var39));
        float var16 = this.w + 75.0f;
        float var17 = this.x + var7 / 2.0f;
        var39 = -749444030;
        var38 = 852990438;
        var10001 = (var38 | var39) - (var38 & var39);
        var39 = -511443538;
        var38 = var10001;
        var10001 = (var38 | var39) & ~(var38 & var39);
        var10001 = 2038771524;
        var39 = 63436510;
        var38 = var10001;
        var10001 = (var38 | var39) & ~(var38 & var39);
        var39 = 2051201416;
        var38 = var10001;
        var10001 = (var38 | var39) & (~var38 | ~var39);
        float var18 = 150.0f * var9;
        float var19 = var7 * var9;
        float var20 = var13 * var9;
        float var21 = var14 * var9;
        float var22 = var16 - var18 / 2.0f;
        float var23 = var17 - var19 / 2.0f;
        float var24 = var11 - var21 / 2.0f;
        float var25 = !this.p ? var22 - var20 : var22 + var18;
        Color var26 = pulse.Theme.a((Color)pulse.Theme.q, (int)var10);
        Color var27 = pulse.Theme.a((Color)pulse.Theme.r, (int)var10);
        String var376 = "bfo";
        float var347 = var22 - 0.5f * var9;
        var39 = -2114782688;
        var38 = -941790366;
        var10004 = (var38 | var39) - (var38 & var39);
        var39 = 1177522496;
        var38 = var10004;
        var10004 = var38 & ~var39 | ~var38 & var39;
        var10004 = 10505518;
        var39 = 1371223601;
        var38 = var10004;
        var10004 = (var38 | var39) & ~(var38 & var39);
        var39 = 1360755481;
        var38 = var10004;
        var10004 = var38 + var39 - 2 * (var38 & var39);
        var39 = -1883579380;
        var38 = 34658615;
        var10004 = (var38 | var39) & (~var38 | ~var39);
        var39 = -1918237391;
        var38 = var10004;
        var10004 = var38 + var39 - 2 * (var38 & var39);
        float var377 = var23 - 0.5f * var9;
        float var401 = var18 + var9;
        float var418 = var19 + var9;
        var10005 = 2123617644;
        var39 = 1708524950;
        var38 = var10005;
        var10005 = var38 + var39 - 2 * (var38 & var39);
        var39 = 1994259790;
        var38 = var10005;
        var10005 = ((var38 | var39) & ~(var38 & var39)) * ((var38 | var39) & ~(var38 & var39));
        var2.a(var347, var377, var401, var418, 9.5f * var9, var26, var26, var27, var27, var1);
        Color var28 = pulse.Theme.a((Color)pulse.Theme.e, (int)var10);
        Color var29 = pulse.Theme.a((Color)pulse.Theme.f, (int)var10);
        var39 = -1922622044;
        var38 = 917538629;
        var10005 = var38 & ~var39 | ~var38 & var39;
        var39 = -497226161;
        var38 = var10005;
        var10005 = var38 & ~var39 | ~var38 & var39;
        int var10006 = -396803123;
        var39 = 1746244887;
        var38 = var10006;
        var10006 = (var38 | var39) & (~var38 | ~var39);
        var39 = -1988430929;
        var38 = var10006;
        var39 = (var38 | var39) & (~var38 | ~var39);
        var38 = var10005;
        var10005 = (var38 ^ var39) + 2 * (var38 & var39);
        var2.a(var22, var23, var18, var19, 9.5f * var9, var28, var28, var29, var29, var1);
        if (var12 != null) {
            Identifier var30 = var12.a();
            Color var31 = pulse.Theme.a((Color)pulse.Theme.aa, (int)var10);
            if (!this.p) {
                var10000 = 1629932781;
                var39 = 1133579414;
                var38 = var10000;
                var10000 = (var38 | var39) & ~(var38 & var39);
                var39 = 1205236622;
                var38 = var10000;
                var10000 = var38 + var39 - 2 * (var38 & var39);
                var39 = -403277227;
                var38 = 1524845875;
                var10000 = (var38 | var39) & (~var38 | ~var39);
                var39 = -1016492724;
                var38 = var10000;
                int var46 = var38 + var39 - 2 * (var38 & var39);
                var39 = 8126495;
                var38 = 1643614086;
                var10000 = (var38 | var39) - (var38 & var39);
                var39 = 570038002;
                var38 = var10000;
                var10000 = ((var38 | var39) & ~(var38 & var39)) * ((var38 | var39) & ~(var38 & var39));
                var39 = -315920306;
                var38 = -1305089833;
                var10000 = var38 + var39 - 2 * (var38 & var39);
                if ((var38 = var10000) + (var39 = 2045389081) - 2 * (var38 & var39) >= var46) {
                    throw new RuntimeException();
                }
                var39 = 1348989616;
                var38 = -650435463;
                int var10009 = (var38 | var39) - (var38 & var39);
                var39 = 57724489;
                var38 = var10009;
                var10009 = ((var38 | var39) & ~(var38 & var39)) * ((var38 | var39) & ~(var38 & var39));
                var2.a(var30, var25, var24, var20, var21, 0.0f, 1.0f, 0.0f, -1.0f, 1.0f, var31, var1);
            } else {
                var2.a(var30, var25, var24, var20, var21, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, var31, var1);
            }
        }
        if (this.r) {
            var10001 = 815827661;
            var39 = 211954481;
            var38 = var10001;
            var10001 = (var38 | var39) - (var38 & var39);
            var39 = 384888537;
            var38 = var10001;
            var10001 = (var38 + var39 - 2 * (var38 & var39)) * (var38 + var39 - 2 * (var38 & var39));
            if (var9 > 0.1f && this.G != null) {
                var39 = 1507768148;
                var38 = -1074363853;
                var10001 = var38 + var39 - 2 * (var38 & var39);
                var39 = 1487133115;
                var38 = var10001;
                var10001 = (var38 | var39) & ~(var38 & var39);
                float var41 = var22 + 3.0f * var9;
                var10002 = -1839714730;
                var39 = -68225865;
                var38 = var10002;
                var10002 = var38 + var39 - 2 * (var38 & var39);
                var39 = -1909718059;
                var38 = var10002;
                var10002 = (var38 | var39) & ~(var38 & var39);
                var39 = 269781495;
                var38 = -794046466;
                var10003 = var38 + var39 - 2 * (var38 & var39);
                var39 = -259978883;
                var38 = var10003;
                var39 = var38 + var39 - 2 * (var38 & var39);
                var38 = var10002;
                var10002 = (var38 ^ var39) + 2 * (var38 & var39);
                float var43 = var23 + (var19 - 20.0f * var9) / 2.0f;
                var39 = -131310266;
                var38 = -22029725;
                var10001 = (var38 | var39) & ~(var38 & var39);
                var39 = -1762415929;
                var38 = var10001;
                var10001 = (var38 | var39) - (var38 & var39);
                var39 = 2042341759;
                var38 = 1612286221;
                var10002 = (var38 | var39) - (var38 & var39);
                var39 = -900009615;
                var38 = var10002;
                var39 = (var38 | var39) & ~(var38 & var39);
                var38 = var10001;
                var10001 = (var38 | var39) + (var38 & var39);
                float var44 = var18 - 6.0f * var9;
                this.G.a(var1, var2, var41, var43, var44, var5, var6, var9, var9);
                return;
            }
        }
        if (!this.r) {
            var10001 = -221900691;
            var39 = 1317180513;
            var38 = var10001;
            var10001 = var38 + var39 - 2 * (var38 & var39);
            var39 = -1184241899;
            var38 = var10001;
            var10001 = (var38 & ~var39 | ~var38 & var39) * (var38 & ~var39 | ~var38 & var39);
            if (var9 > 0.1f) {
                var39 = -1887087079;
                var38 = 1364492473;
                var10001 = var38 + var39 - 2 * (var38 & var39);
                var39 = -1911327329;
                var38 = var10001;
                var10001 = (var38 | var39) & ~(var38 & var39);
                float var40 = var23 + 7.0f * var9;
                var10001 = -442554627;
                var39 = 1081887578;
                var38 = var10001;
                var10001 = (var38 | var39) & (~var38 | ~var39);
                var39 = 1215265237;
                var38 = var10001;
                var10001 = var38 + var39 - 2 * (var38 & var39);
                var39 = 254942772;
                var38 = -1285585713;
                var10002 = var38 + var39 - 2 * (var38 & var39);
                var39 = -1702481520;
                var38 = var10002;
                var39 = var38 & ~var39 | ~var38 & var39;
                var38 = var10001;
                var10001 = 2 * (var38 | var39) - (var38 ^ var39);
                float var326 = var19 - 7.0f;
                var39 = -223154224;
                var38 = -1104124450;
                var10002 = var38 & ~var39 | ~var38 & var39;
                var39 = 1283623429;
                var38 = var10002;
                var10002 = var38 & ~var39 | ~var38 & var39;
                var39 = 393042942;
                var38 = -1346858275;
                var10002 = (var38 | var39) & ~(var38 & var39);
                var39 = -1193948895;
                var38 = var10002;
                var10002 = (var38 | var39) - (var38 & var39);
                var10002 = 17253746;
                var39 = 801080128;
                var38 = var10002;
                var10002 = (var38 | var39) - (var38 & var39);
                var39 = 783861297;
                var38 = var10002;
                var10002 = (var38 | var39) & ~(var38 & var39);
                var10002 = 987800394;
                var39 = -1221944941;
                var38 = var10002;
                var10002 = var38 & ~var39 | ~var38 & var39;
                var39 = -1916126497;
                var38 = var10002;
                var10002 = (var38 | var39) & ~(var38 & var39);
                float var42 = (var326 - 6.0f) * var9;
                if (var18 > 0.0f && var42 > 0.0f) {
                    ScissorStack var327 = var2.b();
                    var10006 = -1950914844;
                    var39 = -1889749986;
                    var38 = var10006;
                    var10006 = (var38 | var39) - (var38 & var39);
                    var39 = 82563826;
                    var38 = var10006;
                    var10006 = var38 & ~var39 | ~var38 & var39;
                    var327.a(var22, var40, var18, var42, 9.5f * var9, var1);
                    this.C.a(var1, var2, var22, var23, var18, var19, var5, var6, var9, var9);
                    float var32 = var23 + var19;
                    boolean var33 = this.C.e(var32);
                    if (this.C.d(var19) && !var33) {
                        var10000 = -84862031;
                        var39 = -2078446976;
                        var38 = var10000;
                        var10000 = (var38 | var39) - (var38 & var39);
                        var39 = 2129424688;
                        var38 = var10000;
                        var10000 = var38 + var39 - 2 * (var38 & var39);
                    } else {
                        var39 = -1981321233;
                        var38 = -1466698936;
                        var10000 = var38 & ~var39 | ~var38 & var39;
                        var39 = 561290407;
                        var38 = var10000;
                        var10000 = var38 + var39 - 2 * (var38 & var39);
                    }
                    int var34 = var10000;
                    if (Bool.from((int)var34) != this.F) {
                        AnimationState var332 = this.E;
                        double var360 = var34 == 0 ? 0.0 : 1.0;
                        var10003 = -1812357464;
                        var39 = 1514409966;
                        var38 = var10003;
                        var10003 = (var38 | var39) - (var38 & var39);
                        var39 = -910323390;
                        var38 = var10003;
                        var10003 = (var38 | var39) - (var38 & var39);
                        var10003 = -1651256563;
                        var39 = -1963333770;
                        var38 = var10003;
                        var10003 = var38 & ~var39 | ~var38 & var39;
                        var39 = 392836218;
                        var38 = var10003;
                        var10003 = var38 + var39 - 2 * (var38 & var39);
                        var332.a(var360, 0.15, Easing.h);
                        this.F = Bool.from((int)var34);
                    }
                    float var35 = (float)this.E.j();
                    var10002 = 671384971;
                    var39 = -136617007;
                    var38 = var10002;
                    var10002 = (var38 | var39) & ~(var38 & var39);
                    var39 = -538974635;
                    var38 = var10002;
                    var10002 = (var38 | var39) - (var38 & var39);
                    if (var35 > 0.01f) {
                        this.D.a(var1, var2, var22, var23, var18, var19, var9 * var35);
                    }
                    var2.b().a(var1);
                }
            }
        }
    }

    public boolean a(int var1, int var2) {
        if (!this.v) {
            double var10000 = this.u.j();
            int var18 = 1242270219;
            int var17 = 1522947253;
            int var10001 = (var17 | var18) & (~var17 | ~var18);
            var18 = 1173293327;
            var17 = var10001;
            var10001 = ((var17 | var18) - (var17 & var18)) * ((var17 | var18) - (var17 & var18));
            if (!(var10000 < 0.5)) {
                boolean var3 = this.f(var1, var2);
                if (this.d(var1, var2)) {
                    if (i != i) {
                        var18 = 580511892;
                        var17 = -1631666770;
                        int var63 = (var17 | var18) - (var17 & var18);
                        var18 = 1994392473;
                        var17 = var63;
                        int var64 = var17 & ~var18 | ~var17 & var18;
                        var18 = 2021391473;
                        var17 = 1337664115;
                        int var65 = (var17 | var18) - (var17 & var18);
                        var18 = -217957761;
                        var17 = var65;
                        int n = (var17 | var18) - (var17 & var18);
                    }
                } else {
                    int var19;
                    if (!var3) {
                        if (!this.C.d()) {
                            var18 = -706623147;
                            var17 = 1208000939;
                            int var73 = var17 + var18 - 2 * (var17 & var18);
                            var18 = -1646171906;
                            var17 = var73;
                            return Bool.from((int)((var17 | var18) & ~(var17 & var18)));
                        }
                        this.C.g();
                        int var71 = 437242397;
                        var18 = 1075204942;
                        var17 = var71;
                        int var72 = (var17 | var18) & (~var17 | ~var18);
                        var18 = 1511627090;
                        var17 = var72;
                        return Bool.from((int)((var17 | var18) - (var17 & var18)));
                    }
                    String var66 = "bfp";
                    var18 = 270271073;
                    var17 = -1143641969;
                    int var67 = var17 + var18 - 2 * (var17 & var18);
                    var18 = -1350296290;
                    var17 = var67;
                    i = var19 = var17 & ~var18 | ~var17 & var18;
                    var10001 = -988190689;
                    var18 = 1120741252;
                    var17 = var10001;
                    var10001 = var17 & ~var18 | ~var17 & var18;
                    var18 = -2016129124;
                    var17 = var10001;
                    var10001 = var17 & ~var18 | ~var17 & var18;
                    int var68 = 377454268;
                    var18 = 486952762;
                    var17 = var68;
                    int var69 = var17 & ~var18 | ~var17 & var18;
                    var18 = 213194390;
                    var17 = var69;
                    if (var17 + var18 - 2 * (var17 & var18) < i) {
                        throw new RuntimeException();
                    }
                }
                if (this.r && this.G != null) {
                    float var4 = this.a();
                    float var5 = (float)Math.max(0.0, Math.min(1.0, this.u.j()));
                    String var70 = "bfq";
                    float var6 = 150.0f * var5;
                    float var7 = var4 * var5;
                    var10001 = -1355524720;
                    var18 = 1008161523;
                    var17 = var10001;
                    var10001 = (var17 | var18) - (var17 & var18);
                    var18 = 174066193;
                    var17 = var10001;
                    var10001 = (var17 | var18) & (~var17 | ~var18);
                    float var8 = this.w + 75.0f;
                    float var9 = this.x + var4 / 2.0f;
                    float var10 = var8 - var6 / 2.0f;
                    float var11 = var9 - var7 / 2.0f;
                    String var81 = "bfr";
                    float var12 = var10 + 3.0f * var5;
                    int var10002 = 1897396986;
                    var18 = -456718774;
                    var17 = var10002;
                    var10002 = (var17 | var18) - (var17 & var18);
                    var18 = -1048771787;
                    var17 = var10002;
                    var10002 = (var17 + var18 - 2 * (var17 & var18)) * (var17 + var18 - 2 * (var17 & var18));
                    float var13 = var11 + (var7 - 20.0f * var5) / 2.0f;
                    String var82 = "bfs";
                    float var14 = var6 - 6.0f * var5;
                    return this.G.a(var12, var13, var14, var1, var2);
                }
                String var10003 = "bft";
                return this.C.a(this.w, this.x, 150.0f, this.a(), var1, var2);
            }
        }
        int var42 = 1490780967;
        int var21 = 1632817824;
        int var62 = (var21 | var42) & (~var21 | ~var42);
        var42 = 965300615;
        var21 = var62;
        return Bool.from((int)((var21 | var42) - (var21 & var42)));
    }

    public boolean b(int var1, int var2) {
        if (!this.v) {
            double var10000 = this.u.j();
            String var10001 = "bfu";
            if (!(var10000 < 0.5)) {
                boolean var3 = this.f(var1, var2);
                if (!this.d(var1, var2) && !var3) {
                    if (!this.C.d()) {
                        int var32 = 1151032792;
                        int var18 = -1300258641;
                        int var38 = (var18 | var32) & ~(var18 & var32);
                        var32 = -152765065;
                        var18 = var38;
                        return Bool.from((int)(var18 + var32 - 2 * (var18 & var32)));
                    }
                    this.C.g();
                    int var36 = 1048498291;
                    int var30 = -808318232;
                    int var16 = var36;
                    int var37 = var16 & ~var30 | ~var16 & var30;
                    var30 = -240330086;
                    var16 = var37;
                    return Bool.from((int)((var16 | var30) & (~var16 | ~var30)));
                }
                if (!this.C.d()) {
                    int var28 = 1674878441;
                    int var14 = -1188693339;
                    int var41 = var14 & ~var28 | ~var14 & var28;
                    var28 = -1697098155;
                    var14 = var41;
                    var41 = ((var14 | var28) - (var14 & var28)) * ((var14 | var28) - (var14 & var28));
                    return this.C.b(this.w, this.x, 150.0f, this.a(), var1, var2);
                }
                if (!this.C.b(var1, var2)) {
                    this.C.g();
                    int var26 = 1075287437;
                    int var12 = -664725121;
                    int var35 = (var12 | var26) & (~var12 | ~var26);
                    var26 = -1737061133;
                    var12 = var35;
                    return Bool.from((int)((var12 | var26) & ~(var12 & var26)));
                }
                int var21 = 295567869;
                int var7 = 1981998140;
                int var10003 = var7 & ~var21 | ~var7 & var21;
                var21 = -1908492960;
                var7 = var10003;
                var10003 = (var7 | var21) & ~(var7 & var21);
                var21 = 1179572479;
                var7 = -1652840153;
                int var10004 = var7 + var21 - 2 * (var7 & var21);
                var21 = -318169898;
                var7 = var10004;
                var21 = var7 + var21 - 2 * (var7 & var21);
                var7 = var10003;
                var10003 = var7 - ~var21 - 1;
                return this.C.b(this.w, this.x, 150.0f, this.a(), var1, var2);
            }
        }
        int var5 = 876273476;
        int var4 = -1630641989;
        int var34 = (var4 | var5) - (var4 & var5);
        var5 = -1426800641;
        var4 = var34;
        return Bool.from((int)((var4 | var5) & (~var4 | ~var5)));
    }

    public void c(int var1, int var2) {
        if (this.r && this.G != null) {
            this.G.a(var1, var2);
        } else {
            this.C.c(var1, var2);
        }
    }

    public void a(int var1, int var2, double var3, double var5) {
        if (!this.r) {
            this.C.a(this.a(), var1, var2, var3, var5);
        }
    }

    public void a(float var1, int var2, int var3) {
        if (this.r) {
            int var5;
            int var7 = -52925788;
            int var6 = 1534246815;
            int var10000 = var6 & ~var7 | ~var6 & var7;
            var7 = 2146757823;
            var6 = var10000;
            var10000 = (var6 | var7) & ~(var6 & var7);
            var10000 = 1726282351;
            var7 = -678123983;
            var6 = var10000;
            var10000 = (var6 | var7) & ~(var6 & var7);
            var7 = -1774983805;
            var6 = var10000;
            i = var5 = var6 & ~var7 | ~var6 & var7;
            var7 = 1907451063;
            var6 = 1564057262;
            var10000 = var6 & ~var7 | ~var6 & var7;
            var7 = -2113330812;
            var6 = var10000;
            var10000 = var6 & ~var7 | ~var6 & var7;
            var7 = 685843337;
            var6 = 1905534146;
            var10000 = var6 + var7 - 2 * (var6 & var7);
            if (((var6 = var10000) | (var7 = 1782009778)) - (var6 & var7) < i) {
                var10000 = 1480152403;
                var7 = 69389783;
                var6 = var10000;
                var10000 = (var6 | var7) & (~var6 | ~var7);
                var7 = -376566857;
                var6 = var10000;
                var10000 = (var6 | var7) - (var6 & var7);
                int var10001 = 627965810;
                var7 = -297255905;
                var6 = var10001;
                var10001 = var6 + var7 - 2 * (var6 & var7);
                var7 = -2131519149;
                var6 = var10001;
                var7 = (var6 | var7) & ~(var6 & var7);
                var6 = var10000;
                var10000 = (var6 ^ var7) + 2 * (var6 & var7);
                var7 = 790216094;
                var6 = 1702052219;
                var10000 = (var6 | var7) & ~(var6 & var7);
                var7 = -1665338851;
                var6 = var10000;
                i = var5 = (var6 | var7) & (~var6 | ~var7);
            }
        } else if (!this.d(var2, var3)) {
            int var9;
            int var58 = -106875275;
            int var25 = -1759113051;
            int var88 = var25 + var58 - 2 * (var25 & var58);
            var58 = -1536483459;
            var25 = var88;
            var88 = ((var25 | var58) & ~(var25 & var58)) * ((var25 | var58) & ~(var25 & var58));
            var88 = -1192945117;
            var58 = -396520234;
            var25 = var88;
            var88 = (var25 | var58) & ~(var25 & var58);
            var58 = 1916741643;
            var25 = var88;
            i = var9 = (var25 | var58) & ~(var25 & var58);
            var88 = -659549593;
            var58 = 371766827;
            var25 = var88;
            var88 = (var25 | var58) & (~var25 | ~var58);
            var58 = -1903070729;
            var25 = var88;
            var88 = var25 + var58 - 2 * (var25 & var58);
            var58 = -970457556;
            var25 = -1339696242;
            int var101 = var25 & ~var58 | ~var25 & var58;
            var58 = -1935272555;
            var25 = var101;
            var58 = (var25 | var58) & ~(var25 & var58);
            var25 = var88;
            var88 = 2 * (var25 | var58) - (var25 ^ var58);
            var88 = 112009126;
            var58 = -491472138;
            var25 = var88;
            var88 = (var25 | var58) - (var25 & var58);
            if (((var25 = var88) & ~(var58 = -1711326413) | ~var25 & var58) < i) {
                var58 = 1804516290;
                var25 = -1675804838;
                var101 = var25 & ~var58 | ~var25 & var58;
                var58 = -141327211;
                var25 = var101;
                var101 = (var25 | var58) & ~(var25 & var58);
                var58 = -1245898170;
                var25 = -1342997894;
                var101 = (var25 | var58) - (var25 & var58);
                var58 = 441344051;
                var25 = var101;
                var101 = (var25 | var58) & ~(var25 & var58);
                var58 = -1073922204;
                var25 = -1759635364;
                var101 = (var25 | var58) - (var25 & var58);
                var58 = 685975348;
                var25 = var101;
                var101 = var25 & ~var58 | ~var25 & var58;
                var88 = -1056686759;
                var58 = -760558632;
                var25 = var88;
                var88 = var25 & ~var58 | ~var25 & var58;
                var58 = -2046100666;
                var25 = var88;
                i = var9 = (var25 | var58) - (var25 & var58);
            }
        } else {
            this.C.a(var1, this.a());
        }
    }

    public boolean a(int var1, int var2, int var3) {
        if (this.r && this.G != null) {
            boolean var4 = this.G.a(var1, var2, var3);
            if (var4 && this.m != null) {
                this.m.a(this.G.c());
            }
            return var4;
        }
        return this.C.a(var1, var2, var3);
    }

    public boolean a(char var1, int var2) {
        return this.r ? false : this.C.a(var1, var2);
    }

    public boolean h() {
        if (!this.v) {
            double var10000 = this.u.j();
            String var10001 = "bfw";
            if (!(var10000 < 0.5)) {
                if (!this.r) {
                    if (i != i) {
                        int var15 = 1494518396;
                        int var9 = -1239090151;
                        int var4 = var15;
                        int var16 = (var4 | var9) & ~(var4 & var9);
                        var9 = -282036635;
                        var4 = var16;
                        int var17 = (var4 | var9) & ~(var4 & var9);
                        var9 = 342362908;
                        var4 = 804311800;
                        int var19 = (var4 | var9) - (var4 & var9);
                        var9 = 999872996;
                        var4 = var19;
                        int n = var17 / ((var4 | var9) - (var4 & var9));
                    }
                } else if (this.G != null) {
                    return this.G.a_();
                }
                return this.C.l();
            }
        }
        int var13 = -1862753647;
        int var2 = -1770090013;
        int var1 = var13;
        var13 = var1 + var2 - 2 * (var1 & var2);
        var2 = 109458290;
        var1 = var13;
        return Bool.from((int)((var1 | var2) & ~(var1 & var2)));
    }

    public boolean d(int var1, int var2) {
        if (!this.v) {
            double var10000 = this.u.j();
            int var8 = -492020534;
            int var7 = -1510762496;
            int var10001 = (var7 | var8) - (var7 & var8);
            var8 = -1491967429;
            var7 = var10001;
            var10001 = (var7 & ~var8 | ~var7 & var8) * (var7 & ~var8 | ~var7 & var8);
            if (!(var10000 < 0.5)) {
                if (!this.y) {
                    float var81;
                    var10001 = 822358796;
                    var8 = 1063709705;
                    var7 = var10001;
                    var10001 = var7 & ~var8 | ~var7 & var8;
                    var8 = 241360653;
                    var7 = var10001;
                    var10001 = var7 & ~var8 | ~var7 & var8;
                    var8 = -1926897300;
                    var7 = 2092796827;
                    var10001 = (var7 | var8) & ~(var7 & var8);
                    var8 = -241669390;
                    var7 = var10001;
                    var10001 = (var7 | var8) - (var7 & var8);
                    var10001 = 237023483;
                    var8 = -1951585191;
                    var7 = var10001;
                    var10001 = var7 & ~var8 | ~var7 & var8;
                    var8 = -2054316881;
                    var7 = var10001;
                    var10001 = var7 & ~var8 | ~var7 & var8;
                    var10001 = -298921554;
                    var8 = 1186932219;
                    var7 = var10001;
                    var10001 = (var7 | var8) & (~var7 | ~var8);
                    var8 = -969812974;
                    var7 = var10001;
                    var10001 = (var7 | var8) - (var7 & var8);
                    int var95 = 952370673;
                    var8 = 1349143244;
                    var7 = var95;
                    var95 = (var7 | var8) - (var7 & var8);
                    var8 = -2116349211;
                    var7 = var95;
                    var95 = var7 + var8 - 2 * (var7 & var8);
                    var8 = 1631361402;
                    var7 = 1433775405;
                    var95 = var7 & ~var8 | ~var7 & var8;
                    var8 = -387017028;
                    var7 = var95;
                    var95 = (var7 | var8) & (~var7 | ~var8);
                    int var10003 = -2026406996;
                    var8 = -2103589778;
                    var7 = var10003;
                    var10003 = var7 + var8 - 2 * (var7 & var8);
                    var8 = -1165384509;
                    var7 = var10003;
                    var10003 = var7 & ~var8 | ~var7 & var8;
                    var10003 = -2106162097;
                    var8 = 2050615687;
                    var7 = var10003;
                    var10003 = (var7 | var8) & ~(var7 & var8);
                    var8 = -1112007886;
                    var7 = var10003;
                    var10003 = (var7 | var8) & (~var7 | ~var8);
                    int var10004 = -1749997303;
                    var8 = 441570424;
                    var7 = var10004;
                    var10004 = (var7 | var8) & (~var7 | ~var8);
                    var8 = -1495227823;
                    var7 = var10004;
                    var10004 = (var7 & ~var8 | ~var7 & var8) * (var7 & ~var8 | ~var7 & var8);
                    var10004 = 1536576572;
                    var8 = 461918601;
                    var7 = var10004;
                    var10004 = var7 + var8 - 2 * (var7 & var8);
                    var8 = 1495037452;
                    var7 = var10004;
                    var10004 = (var7 | var8) - (var7 & var8);
                    int var10005 = -2030465006;
                    var8 = -702555536;
                    var7 = var10005;
                    var10005 = (var7 | var8) - (var7 & var8);
                    var8 = 578808459;
                    var7 = var10005;
                    var10005 = (var7 | var8) & ~(var7 & var8);
                    int var10006 = -841106148;
                    var8 = -328843494;
                    var7 = var10006;
                    var10006 = (var7 | var8) - (var7 & var8);
                    var8 = -1017214919;
                    var7 = var10006;
                    var8 = (var7 | var8) & ~(var7 & var8);
                    var7 = var10005;
                    var10005 = 2 * (var7 | var8) - (var7 ^ var8);
                    var10005 = 621920358;
                    var8 = -1383740508;
                    var7 = var10005;
                    var10005 = (var7 | var8) & ~(var7 & var8);
                    var8 = -2001374014;
                    var7 = var10005;
                    IconTextureRegistry.TextureInfo var3 = IconTextureRegistry.getInfo((String)pulse.ModuleCard.a("\uf785\u2a7d\uf796\u2a60\uf793\u2a50\uf792", "`\ua7f3\ua4fa\ua061\ua910\u7d7a\u8e59\u247f\u8b78\u3474~\ua7ef\ua4b6\ua07a\ua902\u7d63\u8e43\u2435\u8b34\u3478\u007f\ua7eb\ua4ba\ua07f\ua94a\u7d5b\u8e45\u247e\u8b22\u347bw\ua7d5\ua4b0\ua065\ua911\u7d7f\u8e44\u247d\u8b24\u3447s\ua7e8\ua4b0\ua07d", var95, var10003, var10004, (var7 | var8) - (var7 & var8)));
                    float var4 = var3 != null ? (float)var3.b() / 2.0f : 0.0f;
                    var8 = -2005049162;
                    var7 = -1024416566;
                    int var79 = var7 + var8 - 2 * (var7 & var8);
                    var8 = -1898870392;
                    var7 = var79;
                    int var80 = ((var7 | var8) & (~var7 | ~var8)) * ((var7 | var8) & (~var7 | ~var8));
                    float var5 = 150.0f + var4;
                    if (!this.p) {
                        if (j) {
                            throw new RuntimeException();
                        }
                        var81 = this.w - var4;
                    } else {
                        var81 = this.w;
                    }
                    float var6 = var81;
                    return GuiInput.a((float)var6, (float)this.x, (float)var5, (float)this.a(), (double)var1, (double)var2);
                }
                var8 = 1272230108;
                var7 = 761382429;
                int var10002 = var7 + var8 - 2 * (var7 & var8);
                var8 = -127258794;
                var7 = var10002;
                var10002 = ((var7 | var8) & (~var7 | ~var8)) * ((var7 | var8) & (~var7 | ~var8));
                return GuiInput.a((float)this.w, (float)this.x, (float)150.0f, (float)this.a(), (double)var1, (double)var2);
            }
        }
        int var77 = -1365213413;
        int var44 = -1864644666;
        int var10 = var77;
        var77 = (var10 | var44) & (~var10 | ~var44);
        var44 = 1048295645;
        var10 = var77;
        return Bool.from((int)((var10 | var44) & ~(var10 & var44)));
    }

    public boolean e(int var1, int var2) {
        if (!this.v) {
            double var10000 = this.u.j();
            int var10002 = 255076244;
            int var4 = -1296760959;
            int var3 = var10002;
            var10002 = var3 + var4 - 2 * (var3 & var4);
            var4 = -1115629562;
            var3 = var10002;
            var10002 = var3 & ~var4 | ~var3 & var4;
            var10002 = -1228697834;
            var4 = -507218445;
            var3 = var10002;
            var10002 = (var3 | var4) & (~var3 | ~var4);
            var4 = 1460140773;
            var3 = var10002;
            var10002 = (var3 | var4) & ~(var3 & var4);
            if (!(var10000 < 0.5)) {
                float var20 = this.w;
                float var10001 = this.x;
                int var10003 = -350521142;
                var4 = 1142892335;
                var3 = var10003;
                var10003 = var3 & ~var4 | ~var3 & var4;
                var4 = -1358667805;
                var3 = var10003;
                var10003 = var3 & ~var4 | ~var3 & var4;
                return GuiInput.a((float)var20, (float)var10001, (float)150.0f, (float)this.a(), (double)var1, (double)var2);
            }
        }
        int var15 = -2033762315;
        int var8 = 1744497415;
        int var19 = (var8 | var15) & (~var8 | ~var15);
        var15 = -516041486;
        var8 = var19;
        return Bool.from((int)(var8 & ~var15 | ~var8 & var15));
    }

    public boolean a(ModuleCard var1) {
        int var19;
        if (this.p != var1.p) {
            int var22 = 1275306075;
            int var16 = 179605713;
            int var11 = var22;
            var22 = var11 + var16 - 2 * (var11 & var16);
            var16 = 1186410634;
            var11 = var22;
            return Bool.from((int)(var11 & ~var16 | ~var11 & var16));
        }
        float var2 = this.x;
        float var3 = this.x + this.a();
        float var4 = var1.x;
        float var5 = var1.x + var1.a();
        if (!(var3 <= var4) && !(var2 >= var5)) {
            var19 = 1107688416;
            int var14 = 4039128;
            int var9 = var19;
            var19 = (var9 | var14) & (~var9 | ~var14);
            var14 = 1110989369;
            var9 = var19;
            var19 = var9 + var14 - 2 * (var9 & var14);
        } else {
            var19 = -684511014;
            int var7 = 73757389;
            int var6 = var19;
            var19 = var6 + var7 - 2 * (var6 & var7);
            var7 = -749321705;
            var6 = var19;
            var19 = var6 & ~var7 | ~var6 & var7;
        }
        return Bool.from((int)var19);
    }

    public float i() {
        return !this.y ? this.x : this.A;
    }

    public float j() {
        return !this.y ? this.w : this.z;
    }

    public float k() {
        return this.a();
    }

    public GuiEntry l() {
        return this.m;
    }

    public int m() {
        return this.o;
    }

    public boolean n() {
        return this.p;
    }

    public VerticalAlign o() {
        return this.q;
    }

    public float p() {
        return this.s;
    }

    public SettingWidgetList q() {
        return this.C;
    }

    public boolean r() {
        return this.y;
    }

    public KeyBindSettingWidget s() {
        return this.G;
    }

    public int t() {
        if (this.G != null) {
            return this.G.c();
        }
        int var2 = 1507474036;
        int var1 = 72658033;
        int var10000 = (var1 | var2) - (var1 & var2);
        var2 = -1569625606;
        var1 = var10000;
        return var1 & ~var2 | ~var1 & var2;
    }

    public void a(int var1) {
        if (this.G != null) {
            this.G.a(var1);
        }
    }

    public boolean u() {
        if (!this.r) {
            return this.C.h();
        }
        int var10000 = -1962825858;
        int var2 = 1570162512;
        int var1 = var10000;
        var10000 = (var1 | var2) & ~(var1 & var2);
        var2 = -694722514;
        var1 = var10000;
        return Bool.from((int)(var1 + var2 - 2 * (var1 & var2)));
    }

    public void v() {
        if (!this.r) {
            this.C.i();
        }
    }

    public float[] w() {
        return !this.r ? this.C.j() : null;
    }

    public boolean x() {
        return this.C.d();
    }

    public boolean f(int var1, int var2) {
        if (!this.r) {
            return this.C.a(var1, var2);
        }
        int var10000 = 898490927;
        int var4 = -939961064;
        int var3 = var10000;
        var10000 = (var3 | var4) & (~var3 | ~var4);
        var4 = -227231945;
        var3 = var10000;
        return Bool.from((int)(var3 & ~var4 | ~var3 & var4));
    }

    public static String a(String var0, String var1, int var2, int var3, int var4, int var5) {
        char[] var6 = var1.toCharArray();
        char[] var7 = new char[var6.length];
        int var10000 = -782049997;
        int var18 = 1614600826;
        int var17 = var10000;
        var10000 = (var17 | var18) & (~var17 | ~var18);
        var18 = -1319237821;
        var17 = var10000;
        char[] var248 = new char[var17 & ~var18 | ~var17 & var18];
        var18 = -845454684;
        var17 = 325455491;
        int var10002 = var17 + var18 - 2 * (var17 & var18);
        var18 = -553817049;
        var17 = var10002;
        var10002 = var17 & ~var18 | ~var17 & var18;
        int var10003 = -2063096490;
        var18 = 2075100046;
        var17 = var10003;
        var10003 = (var17 | var18) & ~(var17 & var18);
        var18 = -22515990;
        var17 = var10003;
        var248[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
        var18 = -1062795766;
        var17 = -477228775;
        var10002 = (var17 | var18) & ~(var17 & var18);
        var18 = 589895442;
        var17 = var10002;
        var10002 = var17 & ~var18 | ~var17 & var18;
        var18 = 23388710;
        var17 = -1205284673;
        var10003 = (var17 | var18) & ~(var17 & var18);
        var18 = -1186197220;
        var17 = var10003;
        var248[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
        var10002 = -1540711650;
        var18 = -918157683;
        var17 = var10002;
        var10002 = var17 + var18 - 2 * (var17 & var18);
        var18 = 1835834769;
        var17 = var10002;
        var10002 = (var17 | var18) - (var17 & var18);
        var10003 = -1100487696;
        var18 = 2005244694;
        var17 = var10003;
        var10003 = var17 & ~var18 | ~var17 & var18;
        var18 = -907912352;
        var17 = var10003;
        var248[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
        var10002 = 1407910909;
        var18 = 498248330;
        var17 = var10002;
        var10002 = (var17 | var18) & ~(var17 & var18);
        var18 = 1314498932;
        var17 = var10002;
        var10002 = (var17 | var18) - (var17 & var18);
        var10003 = 939050659;
        var18 = -688935734;
        var17 = var10003;
        var10003 = (var17 | var18) & ~(var17 & var18);
        var18 = 513050588;
        var17 = var10003;
        var10003 = (var17 | var18) & (~var17 | ~var18);
        int var10004 = 1549928592;
        var18 = 1555634804;
        var17 = var10004;
        var10004 = var17 & ~var18 | ~var17 & var18;
        var18 = 248643245;
        var17 = var10004;
        var18 = var17 & ~var18 | ~var17 & var18;
        var17 = var10003;
        var10003 = 2 * (var17 | var18) - (var17 ^ var18);
        var10003 = -330449262;
        var18 = -77121998;
        var17 = var10003;
        var10003 = var17 + var18 - 2 * (var17 & var18);
        var18 = 388632755;
        var17 = var10003;
        var248[var10002] = (char)((var17 | var18) & ~(var17 & var18));
        var18 = -1917344104;
        var17 = -1373017050;
        var10002 = var17 + var18 - 2 * (var17 & var18);
        var18 = 597609146;
        var17 = var10002;
        var10002 = (var17 | var18) & ~(var17 & var18);
        String var321 = "bfx";
        var10003 = -620271554;
        var18 = -1245585632;
        var17 = var10003;
        var10003 = (var17 | var18) & (~var17 | ~var18);
        var18 = 1858479675;
        var17 = var10003;
        var248[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
        var18 = -1627953475;
        var17 = 1840211737;
        var10002 = (var17 | var18) & (~var17 | ~var18);
        var18 = -212336223;
        var17 = var10002;
        var10002 = var17 & ~var18 | ~var17 & var18;
        var18 = -1355247469;
        var17 = 1240190634;
        var10003 = (var17 | var18) & ~(var17 & var18);
        var18 = -422372421;
        var17 = var10003;
        var248[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
        var18 = -1744349583;
        var17 = 1676525443;
        var10002 = (var17 | var18) & (~var17 | ~var18);
        var18 = -68490764;
        var17 = var10002;
        var10002 = (var17 | var18) & ~(var17 & var18);
        var10003 = 1142240937;
        var18 = -1490713084;
        var17 = var10003;
        var10003 = var17 & ~var18 | ~var17 & var18;
        var18 = -483345986;
        var17 = var10003;
        var248[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
        var10002 = 1857238119;
        var18 = 993325876;
        var17 = var10002;
        var10002 = (var17 | var18) & ~(var17 & var18);
        var18 = 1434961748;
        var17 = var10002;
        var10002 = var17 & ~var18 | ~var17 & var18;
        var10003 = -272261165;
        var18 = 959906594;
        var17 = var10003;
        var10003 = (var17 | var18) & ~(var17 & var18);
        var18 = -688740141;
        var17 = var10003;
        var248[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
        var10002 = 753612291;
        var18 = -1569988012;
        var17 = var10002;
        var10002 = var17 & ~var18 | ~var17 & var18;
        var18 = -1904159649;
        var17 = var10002;
        var10002 = var17 + var18 - 2 * (var17 & var18);
        var18 = -2040473365;
        var17 = 1186787617;
        var10003 = (var17 | var18) & ~(var17 & var18);
        var18 = -1059315303;
        var17 = var10003;
        var248[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
        var10002 = -816610076;
        var18 = -1573412400;
        var17 = var10002;
        var10002 = var17 & ~var18 | ~var17 & var18;
        var18 = 1835279677;
        var17 = var10002;
        var10002 = var17 + var18 - 2 * (var17 & var18);
        var10003 = 595165472;
        var18 = -1539842001;
        var17 = var10003;
        var10003 = (var17 | var18) - (var17 & var18);
        var18 = -2024905173;
        var17 = var10003;
        var248[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
        char[] var8 = var248;
        var18 = 1866979017;
        var17 = -1424150887;
        var10000 = var17 & ~var18 | ~var17 & var18;
        var18 = -1000671142;
        var17 = var10000;
        char[] var250 = new char[var17 + var18 - 2 * (var17 & var18)];
        var10002 = 484176426;
        var18 = -704032267;
        var17 = var10002;
        var10002 = var17 + var18 - 2 * (var17 & var18);
        var18 = -892165153;
        var17 = var10002;
        var10002 = (var17 | var18) & (~var17 | ~var18);
        var18 = 441882012;
        var17 = -283635889;
        var10003 = (var17 | var18) - (var17 & var18);
        var18 = -179383565;
        var17 = var10003;
        var250[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
        var18 = 1836907558;
        var17 = -1021933942;
        var10002 = (var17 | var18) & ~(var17 & var18);
        var18 = -1368753491;
        var17 = var10002;
        var10002 = (var17 | var18) & ~(var17 & var18);
        var10003 = 582757436;
        var18 = 152268574;
        var17 = var10003;
        var10003 = var17 & ~var18 | ~var17 & var18;
        var18 = -944121725;
        var17 = var10003;
        var10003 = ((var17 | var18) & ~(var17 & var18)) * ((var17 | var18) & ~(var17 & var18));
        var10003 = 1157267134;
        var18 = -1894054216;
        var17 = var10003;
        var10003 = (var17 | var18) - (var17 & var18);
        var18 = -874382331;
        var17 = var10003;
        var250[var10002] = (char)((var17 | var18) & ~(var17 & var18));
        var10002 = 288083835;
        var18 = 1260478653;
        var17 = var10002;
        var10002 = (var17 | var18) - (var17 & var18);
        var18 = 1510649796;
        var17 = var10002;
        var10002 = (var17 | var18) & (~var17 | ~var18);
        var18 = -1925528296;
        var17 = -911695341;
        var10003 = var17 & ~var18 | ~var17 & var18;
        var18 = 1193190609;
        var17 = var10003;
        var10003 = (var17 | var18) & (~var17 | ~var18);
        var10004 = -1980571513;
        var18 = -1815282012;
        var17 = var10004;
        var10004 = var17 & ~var18 | ~var17 & var18;
        var18 = -145644190;
        var17 = var10004;
        var18 = (var17 | var18) - (var17 & var18);
        var17 = var10003;
        var10003 = (var17 | var18) + (var17 & var18);
        var10003 = 1344199761;
        var18 = -154509632;
        var17 = var10003;
        var10003 = (var17 | var18) - (var17 & var18);
        var18 = -1496054334;
        var17 = var10003;
        var250[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
        var10002 = -668589099;
        var18 = -1664176699;
        var17 = var10002;
        var10002 = (var17 | var18) & ~(var17 & var18);
        var18 = 1156091411;
        var17 = var10002;
        var10002 = var17 & ~var18 | ~var17 & var18;
        var10003 = -1800377830;
        var18 = 1512705168;
        var17 = var10003;
        var10003 = (var17 | var18) & ~(var17 & var18);
        var18 = -828744056;
        var17 = var10003;
        var250[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
        var18 = -250935401;
        var17 = -963724035;
        var10002 = (var17 | var18) - (var17 & var18);
        var18 = 931511150;
        var17 = var10002;
        var10002 = var17 + var18 - 2 * (var17 & var18);
        var18 = -1400117614;
        var17 = -1379002630;
        var10003 = (var17 | var18) & (~var17 | ~var18);
        var18 = 21350440;
        var17 = var10003;
        var250[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
        var10002 = 17051443;
        var18 = 745286358;
        var17 = var10002;
        var10002 = var17 & ~var18 | ~var17 & var18;
        var18 = 761791968;
        var17 = var10002;
        var10002 = (var17 | var18) & (~var17 | ~var18);
        var18 = 207013592;
        var17 = 297945539;
        var10003 = var17 + var18 - 2 * (var17 & var18);
        var18 = 496285583;
        var17 = var10003;
        var250[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
        var10002 = 633404654;
        var18 = 1940443319;
        var17 = var10002;
        var10002 = (var17 | var18) & (~var17 | ~var18);
        var18 = 1449667679;
        var17 = var10002;
        var10002 = (var17 | var18) - (var17 & var18);
        String var347 = "bfy";
        var18 = 897300548;
        var17 = -1005705723;
        var10003 = (var17 | var18) & ~(var17 & var18);
        var18 = -243984008;
        var17 = var10003;
        var250[var10002] = (char)((var17 | var18) & ~(var17 & var18));
        var18 = 924798853;
        var17 = 2089041247;
        var10002 = (var17 | var18) - (var17 & var18);
        var18 = 1268478685;
        var17 = var10002;
        var10002 = (var17 | var18) & ~(var17 & var18);
        var18 = -1765468722;
        var17 = 643617439;
        var10003 = var17 + var18 - 2 * (var17 & var18);
        var18 = -1332095127;
        var17 = var10003;
        var250[var10002] = (char)((var17 | var18) - (var17 & var18));
        var10002 = 2072755255;
        var18 = 1760776205;
        var17 = var10002;
        var10002 = var17 + var18 - 2 * (var17 & var18);
        var18 = 326691890;
        var17 = var10002;
        var10002 = var17 + var18 - 2 * (var17 & var18);
        var10004 = -174919382;
        var18 = -390140064;
        var17 = var10004;
        var10004 = (var17 | var18) & ~(var17 & var18);
        var18 = 489430595;
        var17 = var10004;
        var10004 = (var17 | var18) - (var17 & var18);
        var18 = 1331278544;
        var17 = -1416775249;
        var10003 = (var17 | var18) & (~var17 | ~var18);
        var18 = -455833477;
        var17 = var10003;
        var250[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
        var10002 = 946728769;
        var18 = -441796540;
        var17 = var10002;
        var10002 = (var17 | var18) & (~var17 | ~var18);
        var18 = -574138612;
        var17 = var10002;
        var10002 = (var17 | var18) - (var17 & var18);
        var10003 = 66078252;
        var18 = -1539062575;
        var17 = var10003;
        var10003 = (var17 | var18) & (~var17 | ~var18);
        var18 = -1481395762;
        var17 = var10003;
        var250[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
        char[] var9 = var250;
        var18 = 152881114;
        var17 = -760496670;
        var10000 = (var17 | var18) - (var17 & var18);
        var18 = -608732616;
        var17 = var10000;
        for (int var10 = var17 + var18 - 2 * (var17 & var18); var10 < var6.length; ++var10) {
            char var307 = var6[var10];
            char var233 = var8[var10 % var8.length];
            char var120 = var307;
            var7[var10] = (char)(var120 & ~var233 | ~var120 & var233);
        }
        char[] var19 = new char[var7.length];
        var18 = 1639830779;
        var17 = 734392572;
        var10000 = (var17 | var18) & ~(var17 & var18);
        var18 = 1249387527;
        var17 = var10000;
        for (int var11 = (var17 | var18) - (var17 & var18); var11 < var6.length; ++var11) {
            char var308 = var7[var11];
            char var236 = var9[var11 % var9.length];
            char var123 = var308;
            var19[var11] = (char)((var123 | var236) & (~var123 | ~var236));
        }
        String var20 = new String(var19);
        int var12 = var20.hashCode();
        var18 = var5;
        var17 = var3;
        var10000 = var17 + ~var18 + 1;
        var18 = var2;
        var17 = var10000;
        int var13 = var17 + ~var18 + 1;
        char[] var14 = var0.toCharArray();
        char[] var15 = new char[var14.length];
        var10000 = 41494148;
        var18 = -751270257;
        var17 = var10000;
        var10000 = var17 + var18 - 2 * (var17 & var18);
        var18 = -784228341;
        var17 = var10000;
        block6: for (int var16 = var17 & (var18 ^ 0xFFFFFFFF) | (var17 ^ 0xFFFFFFFF) & var18; var16 < var15.length; ++var16) {
            var18 = -1443561934;
            var17 = 723085126;
            int var10001 = var17 & ~var18 | ~var17 & var18;
            var18 = -2098357898;
            var17 = var10001;
            switch (var16 % (var17 & ~var18 | ~var17 & var18)) {
                case 0: {
                    var18 = var12;
                    var17 = var13;
                    var10002 = (var17 | var18) & ~(var17 & var18);
                    char var246 = var14[var16];
                    var17 = var10002;
                    var15[var16] = (char)((var17 | var246) - (var17 & var246));
                    continue block6;
                }
                case 1: {
                    var18 = var13;
                    var17 = var5;
                    var10002 = (var17 | var18) & (~var17 | ~var18);
                    char var244 = var14[var16];
                    var17 = var10002;
                    var15[var16] = (char)(var17 & ~var244 | ~var17 & var244);
                }
            }
        }
        return new String(var15);
    }

    public static enum VerticalAlign {
        TOP,
        CENTER,
        BOTTOM;

        public static int d;
        public static boolean e;

        public static String a(String value, String key, int seed1, int seed2, int seed3, int seed4) {
            return value;
        }
    }
}
