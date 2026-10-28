package pulse;

import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.RotationAxis;

public class HudNotificationSettingsPanel {
   public static final float a = 150.0F;
   public static final float b = 30.0F;
   public static final float c = 120.0F;
   public static final float d = 9.5F;
   public static final float e = 7.0F;
   private static final int h = 25;
   private static final float i = 5.0F;
   private final AnimationState j = new AnimationState();
   private boolean k;
   private boolean l;
   private float m;
   private float n;
   private float o;
   private float p;
   private float q;
   private float r;
   private float s;
   private final SettingWidgetList t;
   private final PanelFadeOverlay u;
   private final AnimationState v;
   private boolean w;
   private final BooleanSettingWidget x;
   private final BooleanSettingWidget y;
   private final BooleanSettingWidget z;
   private final BooleanSettingWidget A;
   private final BooleanSettingWidget B;
   public static int f;
   public static boolean g;

   public HudNotificationSettingsPanel() {
      int var10001 = (int)8611781928044708041L;
      int var2 = -158261847;
      int var1 = var10001;
      var10001 = (var1 | var2) & ~(var1 & var2);
      var2 = -1498751648;
      var1 = var10001;
      this.k = pulse.Bool.from((var1 | var2) & (~var1 | ~var2));
      var10001 = (int)-6150251897136903016L;
      var2 = 1327157704;
      var1 = var10001;
      var10001 = var1 & ~var2 | ~var1 & var2;
      var2 = 1759599952;
      var1 = var10001;
      this.l = pulse.Bool.from((var1 | var2) & ~(var1 & var2));
      var2 = 1136972507;
      var1 = -818701583;
      var10001 = var1 + var2 - 2 * (var1 & var2);
      var2 = -72888925;
      var1 = var10001;
      var10001 = var1 + var2 - 2 * (var1 & var2);
      var2 = 81076751;
      var1 = 1891348553;
      int var10002 = (var1 | var2) - (var1 & var2);
      var2 = -1500420213;
      var1 = var10002;
      var2 = (var1 | var2) & (~var1 | ~var2);
      var1 = var10001;
      var10001 = (var1 ^ var2) + 2 * (var1 & var2);
      this.m = 150.0F;
      this.v = new AnimationState();
      var10001 = (int)1447727264004124865L;
      var2 = -1721261404;
      var1 = var10001;
      var10001 = (var1 | var2) & (~var1 | ~var2);
      var2 = 804950628;
      var1 = var10001;
      this.w = pulse.Bool.from(var1 & ~var2 | ~var1 & var2);
      this.t = new SettingWidgetList();
      var2 = 2101582296;
      var1 = -753658971;
      var10001 = var1 & ~var2 | ~var1 & var2;
      var2 = -705772490;
      var1 = var10001;
      var10001 = (var1 & ~var2 | ~var1 & var2) * (var1 & ~var2 | ~var1 & var2);
      this.t.b(7.0F);
      String var345 = "dqr";
      this.t.a(120.0F);
      var2 = -1805031294;
      var1 = -1206041865;
      int var10003 = (var1 | var2) & (~var1 | ~var2);
      var2 = -802896995;
      var1 = var10003;
      var10003 = (var1 | var2) & ~(var1 & var2);
      int var10004 = (int)-5533748511630621503L;
      var2 = 1413645397;
      var1 = var10004;
      var10004 = (var1 | var2) - (var1 & var2);
      var2 = -868871949;
      var1 = var10004;
      var2 = var1 + var2 - 2 * (var1 & var2);
      var1 = var10003;
      var10003 = var1 - ~var2 - 1;
      var10004 = (int)-4050202924848027370L;
      var2 = 106281160;
      var1 = var10004;
      var10004 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1298181240;
      var1 = var10004;
      var10004 = (var1 | var2) & ~(var1 & var2);
      int var10005 = (int)-5698109596628423003L;
      var2 = 1305804906;
      var1 = var10005;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1098163915;
      var1 = var10005;
      var2 = var1 & ~var2 | ~var1 & var2;
      var1 = var10004;
      var10004 = (var1 ^ var2) + 2 * (var1 & var2);
      var10005 = (int)1832637252422738499L;
      var2 = -1684019183;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var2 = 1114185367;
      var1 = var10005;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var10005 = (int)1991286018832144149L;
      var2 = 2040393633;
      var1 = var10005;
      var10005 = (var1 | var2) - (var1 & var2);
      var2 = 1349604486;
      var1 = var10005;
      var10005 = (var1 | var2) - (var1 & var2);
      int var10006 = (int)4653809544355684079L;
      var2 = 1195239711;
      var1 = var10006;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var2 = 181731939;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var10006 = (int)-8674715153958711412L;
      var2 = 948501861;
      var1 = var10006;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1007302904;
      var1 = var10006;
      var10006 = var1 & ~var2 | ~var1 & var2;
      String var10007 = "dqs";
      var2 = 2024079407;
      var1 = -551942574;
      int var473 = (var1 | var2) - (var1 & var2);
      var2 = -1460779337;
      var1 = var473;
      int var474 = var1 + var2 - 2 * (var1 & var2);
      var2 = 2068950695;
      var1 = -1634945032;
      int var10008 = (var1 | var2) - (var1 & var2);
      var2 = 1044285229;
      var1 = var10008;
      var10008 = ((var1 | var2) & ~(var1 & var2)) * ((var1 | var2) & ~(var1 & var2));
      var2 = 758868920;
      var1 = -1186716008;
      var10008 = var1 & ~var2 | ~var1 & var2;
      var2 = -1806693859;
      var1 = var10008;
      String var348 = a("ꩣ䅽ꩵ䅻ꩾ䅳ꩻ䅺ꩽ䅷ꨏ", "`ꟳꓺꁡꤐ絺蹙⑿譸㑿g\ua7e2ꓺꁸ꤈給蹆\u2435謀㑶f\ua7e3꒧ꁼ꤄絤蹁⑉謲㑣f\ua7ef꒻ꁶꤖ絆蹋⑴謲㑻", var10005, var10006, var474, var1 & ~var2 | ~var1 & var2);
      var10004 = (int)-2815682795590956653L;
      var2 = -1770701187;
      var1 = var10004;
      var10004 = var1 + var2 - 2 * (var1 & var2);
      var2 = -152406033;
      var1 = var10004;
      this.x = new BooleanSettingWidget(var348, pulse.Bool.from(var1 + var2 - 2 * (var1 & var2)));
      String var349 = "dqt";
      var2 = 1443272743;
      var1 = 1919602265;
      var10004 = (var1 | var2) & ~(var1 & var2);
      var2 = -59973389;
      var1 = var10004;
      var10004 = ((var1 | var2) - (var1 & var2)) * ((var1 | var2) - (var1 & var2));
      var2 = 1571709433;
      var1 = 193991118;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = 348127218;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = -837864250;
      var1 = 1671224604;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var2 = -221362712;
      var1 = var10005;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = 1968849557;
      var1 = 182971022;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var2 = 631688132;
      var1 = var10006;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var2 = -1767380187;
      var1 = -388211300;
      int var475 = (var1 | var2) - (var1 & var2);
      var2 = -86826472;
      var1 = var475;
      var2 = (var1 | var2) & (~var1 | ~var2);
      var1 = var10006;
      var10006 = (var1 ^ var2) + 2 * (var1 & var2);
      var10006 = (int)-8849433903078185494L;
      var2 = -189508041;
      var1 = var10006;
      var10006 = (var1 | var2) - (var1 & var2);
      var2 = 1728929243;
      var1 = var10006;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var10007 = "dqu";
      var2 = 1826600314;
      var1 = 336092760;
      int var477 = (var1 | var2) & ~(var1 & var2);
      var2 = 1932480517;
      var1 = var477;
      int var478 = var1 & ~var2 | ~var1 & var2;
      var2 = 114150604;
      var1 = 1941966168;
      int var10009 = (var1 | var2) & ~(var1 & var2);
      var2 = 1963835807;
      var1 = var10009;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var10009 = (int)7512798273535047571L;
      var2 = -1512159542;
      var1 = var10009;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var2 = 250032456;
      var1 = var10009;
      var10009 = (var1 | var2) - (var1 & var2);
      var10008 = (int)-694208432839434989L;
      var2 = -1460667730;
      var1 = var10008;
      var10008 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1747753183;
      var1 = var10008;
      String var350 = a("꩜㥓꩷㥛ꩺ㤠", "`ꟳꓺꁡꤐ絺蹙⑿譸㑿g\ua7e2ꓺꁸ꤈給蹆\u2435謀㑶f\ua7e3꒧ꁼ꤄絤蹁⑉謲㑣f\ua7ef꒻ꁶꤖ絆蹋⑴謲㑻", var10005, var10006, var478, (var1 | var2) & (~var1 | ~var2));
      var10004 = (int)-1119003682570817101L;
      var2 = 1941621257;
      var1 = var10004;
      var10004 = var1 + var2 - 2 * (var1 & var2);
      var2 = 632945595;
      var1 = var10004;
      this.y = new BooleanSettingWidget(var350, pulse.Bool.from((var1 | var2) & (var1 & var2 ^ -1)));
      var10003 = (int)7049137198481834898L;
      var2 = -910564095;
      var1 = var10003;
      var10003 = var1 & ~var2 | ~var1 & var2;
      var2 = 400213956;
      var1 = var10003;
      var10003 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1538867299;
      var1 = 1499836838;
      var10004 = (var1 | var2) - (var1 & var2);
      var2 = 764993169;
      var1 = var10004;
      var2 = (var1 | var2) & (~var1 | ~var2);
      var1 = var10003;
      var10003 = (var1 & ~var2) + (var2 & ~var1) + 2 * (var1 & var2);
      var10004 = (int)4783346161205002982L;
      var2 = -968786798;
      var1 = var10004;
      var10004 = var1 & ~var2 | ~var1 & var2;
      var2 = 1251405460;
      var1 = var10004;
      var10004 = var1 + var2 - 2 * (var1 & var2);
      var2 = -37547754;
      var1 = 1809955551;
      var10006 = (var1 | var2) - (var1 & var2);
      var2 = -1776112702;
      var1 = var10006;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1596613972;
      var1 = -931854001;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = 939343825;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      int var479 = (int)2799122626260295432L;
      var2 = 1739534871;
      var1 = var479;
      int var480 = var1 & ~var2 | ~var1 & var2;
      var2 = -626004720;
      var1 = var480;
      int var481 = var1 + var2 - 2 * (var1 & var2);
      int var482 = (int)7887403837775805877L;
      var2 = 1787065309;
      var1 = var482;
      int var483 = var1 + var2 - 2 * (var1 & var2);
      var2 = 606703224;
      var1 = var483;
      int var484 = var1 & ~var2 | ~var1 & var2;
      var10006 = (int)-3872356904674845341L;
      var2 = 705140001;
      var1 = var10006;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1935883850;
      var1 = var10006;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var10007 = "dqv";
      int var486 = (int)8030218815454713523L;
      var2 = 280649522;
      var1 = var486;
      int var487 = (var1 | var2) & ~(var1 & var2);
      var2 = 2041235721;
      var1 = var487;
      int var488 = var1 + var2 - 2 * (var1 & var2);
      var10008 = (int)5276637617501733319L;
      var2 = -695393096;
      var1 = var10008;
      var10008 = (var1 | var2) & ~(var1 & var2);
      var2 = -1628746840;
      var1 = var10008;
      var10008 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1792806744;
      var1 = -481214307;
      var10008 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1987980133;
      var1 = var10008;
      String var355 = a(
         "긆饲긓餂깦餂긐饋긮饅", "`ꟳꓺꁡꤐ絺蹙⑿譸㑿g\ua7e2ꓺꁸ꤈給蹆\u2435謀㑶f\ua7e3꒧ꁼ꤄絤蹁⑉謲㑣f\ua7ef꒻ꁶꤖ絆蹋⑴謲㑻", var10005, var10006, var488, (var1 | var2) & (~var1 | ~var2)
      );
      var10004 = (int)-5882807871177251073L;
      var2 = -2075761696;
      var1 = var10004;
      var10004 = var1 & ~var2 | ~var1 & var2;
      var2 = 1490928926;
      var1 = var10004;
      this.z = new BooleanSettingWidget(var355, pulse.Bool.from(var1 + var2 - 2 * (var1 & var2)));
      var10003 = (int)-6599553654997501913L;
      var2 = -20637758;
      var1 = var10003;
      var10003 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1796641037;
      var1 = var10003;
      var10003 = var1 + var2 - 2 * (var1 & var2);
      var10004 = (int)7962665880816846855L;
      var2 = -1201742562;
      var1 = var10004;
      var10004 = var1 & ~var2 | ~var1 & var2;
      var2 = -1066351536;
      var1 = var10004;
      var2 = (var1 | var2) - (var1 & var2);
      var1 = var10003;
      var10003 = 2 * (var1 | var2) - (var1 ^ var2);
      var10005 = (int)129561990170872252L;
      var2 = -87268087;
      var1 = var10005;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = 1783327909;
      var1 = var10005;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var2 = -849235821;
      var1 = 1804193323;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1494712648;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var10005 = (int)238798013469390298L;
      var2 = -1942974804;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1579549849;
      var1 = var10005;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1476915123;
      var1 = -504117467;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var2 = -1175181160;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var2 = -1107817743;
      var1 = 1064262320;
      var10005 = (var1 | var2) - (var1 & var2);
      var2 = -1429024049;
      var1 = var10005;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var10006 = (int)1764888116166013501L;
      var2 = 1105894236;
      var1 = var10006;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var2 = 890790245;
      var1 = var10006;
      var2 = (var1 | var2) & ~(var1 & var2);
      var1 = var10005;
      var10005 = var1 - ~var2 - 1;
      var10005 = (int)-4066439970098844643L;
      var2 = -1995264253;
      var1 = var10005;
      var10005 = (var1 | var2) - (var1 & var2);
      var2 = -1216221396;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var10006 = (int)7650924710350885124L;
      var2 = -1854043836;
      var1 = var10006;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var2 = -1846597426;
      var1 = var10006;
      var10006 = ((var1 | var2) & ~(var1 & var2)) * ((var1 | var2) & ~(var1 & var2));
      var2 = 1153005016;
      var1 = -494418285;
      var10006 = (var1 | var2) - (var1 & var2);
      var2 = 1845213750;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var10007 = "dqw";
      var2 = -1211130677;
      var1 = -620186582;
      int var490 = (var1 | var2) - (var1 & var2);
      var2 = 1777341113;
      var1 = var490;
      int var491 = (var1 | var2) - (var1 & var2);
      var2 = 177210546;
      var1 = 926047691;
      var10008 = var1 + var2 - 2 * (var1 & var2);
      var2 = 134402682;
      var1 = var10008;
      var10008 = ((var1 | var2) & (~var1 | ~var2)) * ((var1 | var2) & (~var1 | ~var2));
      var2 = -279847335;
      var1 = -1155340843;
      var10008 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1417306453;
      var1 = var10008;
      String var360 = a("꩘岙ꩵ岖ꨂ峠", "`ꟳꓺꁡꤐ絺蹙⑿譸㑿g\ua7e2ꓺꁸ꤈給蹆\u2435謀㑶f\ua7e3꒧ꁼ꤄絤蹁⑉謲㑣f\ua7ef꒻ꁶꤖ絆蹋⑴謲㑻", var10005, var10006, var491, var1 & ~var2 | ~var1 & var2);
      var10004 = (int)-32022459347550460L;
      var2 = 213456912;
      var1 = var10004;
      var10004 = var1 + var2 - 2 * (var1 & var2);
      var2 = 561522453;
      var1 = var10004;
      this.A = new BooleanSettingWidget(var360, pulse.Bool.from(var1 + var2 - 2 * (var1 & var2)));
      var10003 = (int)-8625009907367841355L;
      var2 = -657441686;
      var1 = var10003;
      var10003 = (var1 | var2) & ~(var1 & var2);
      var2 = 1594517500;
      var1 = var10003;
      var10003 = (var1 | var2) - (var1 & var2);
      var10004 = (int)-8143329140366805950L;
      var2 = 1040868248;
      var1 = var10004;
      var10004 = var1 & ~var2 | ~var1 & var2;
      var2 = 1920074402;
      var1 = var10004;
      var2 = (var1 | var2) & (~var1 | ~var2);
      var1 = var10003;
      var10003 = (var1 | var2) + (var1 & var2);
      var2 = 3260693;
      var1 = -1656565697;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = -1653403355;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var10005 = (int)-3078147607892867859L;
      var2 = 1794357266;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var2 = 1537244412;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1902349299;
      var1 = 747515083;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1575855913;
      var1 = var10005;
      var10005 = (var1 | var2) - (var1 & var2);
      String var428 = "dqx";
      var10005 = (int)-3904260829049925976L;
      var2 = -656790082;
      var1 = var10005;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1450815708;
      var1 = var10005;
      var10005 = (var1 | var2) - (var1 & var2);
      var10006 = (int)5159060016521425673L;
      var2 = -1559807524;
      var1 = var10006;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1595199129;
      var1 = var10006;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var2 = 2036001690;
      var1 = 789573280;
      int var492 = (var1 | var2) & (~var1 | ~var2);
      var2 = -2145526890;
      var1 = var492;
      var2 = (var1 | var2) & ~(var1 & var2);
      var1 = var10006;
      var10006 = 2 * (var1 | var2) - (var1 ^ var2);
      var10006 = (int)-6627203125629650843L;
      var2 = -1201320718;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var2 = -773362324;
      var1 = var10006;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var10008 = (int)-4212452717486906541L;
      var2 = -178230313;
      var1 = var10008;
      var10008 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1737488233;
      var1 = var10008;
      var10008 = var1 & ~var2 | ~var1 & var2;
      var2 = 1520983455;
      var1 = -1257715939;
      var10008 = var1 + var2 - 2 * (var1 & var2);
      var2 = -274687347;
      var1 = var10008;
      var10008 = (var1 | var2) & (~var1 | ~var2);
      var2 = -399924638;
      var1 = 1305592107;
      var10008 = var1 & ~var2 | ~var1 & var2;
      var2 = -1510448318;
      var1 = var10008;
      var10008 = var1 & ~var2 | ~var1 & var2;
      var2 = -1267859904;
      var1 = 2033387173;
      int var493 = var1 + var2 - 2 * (var1 & var2);
      var2 = -927729501;
      var1 = var493;
      int var494 = (var1 | var2) - (var1 & var2);
      var2 = -385248553;
      var1 = 408144510;
      var10008 = (var1 | var2) & ~(var1 & var2);
      var2 = 1786331753;
      var1 = var10008;
      var10008 = var1 + var2 - 2 * (var1 & var2);
      var10009 = (int)-6510422470014834002L;
      var2 = 1123272938;
      var1 = var10009;
      var10009 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1818921152;
      var1 = var10009;
      var2 = (var1 | var2) - (var1 & var2);
      var1 = var10008;
      var10008 = 2 * (var1 | var2) - (var1 ^ var2);
      var10008 = (int)165499704547968380L;
      var2 = -1451364351;
      var1 = var10008;
      var10008 = (var1 | var2) & (~var1 | ~var2);
      var2 = 356310570;
      var1 = var10008;
      String var365 = a("ꩤ굦ꩽ괟ꨆ괝꩸", "`ꟳꓺꁡꤐ絺蹙⑿譸㑿g\ua7e2ꓺꁸ꤈給蹆\u2435謀㑶f\ua7e3꒧ꁼ꤄絤蹁⑉謲㑣f\ua7ef꒻ꁶꤖ絆蹋⑴謲㑻", var10005, var10006, var494, var1 + var2 - 2 * (var1 & var2));
      var2 = -515810694;
      var1 = -1862355687;
      var10004 = var1 & ~var2 | ~var1 & var2;
      var2 = 1908404066;
      var1 = var10004;
      this.B = new BooleanSettingWidget(var365, pulse.Bool.from(var1 & (var2 ^ -1) | (var1 ^ -1) & var2));
      this.t.a(this.x);
      this.t.a(this.y);
      this.t.a(this.z);
      this.t.a(this.A);
      this.t.a(this.B);
      var2 = 1964246645;
      var1 = -1431531918;
      var10003 = var1 & ~var2 | ~var1 & var2;
      var2 = -541554658;
      var1 = var10003;
      var10003 = (var1 | var2) - (var1 & var2);
      var10005 = (int)573733300177016601L;
      var2 = 1227704248;
      var1 = var10005;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var2 = -638562132;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = 296851879;
      var1 = 707061059;
      var10005 = (var1 | var2) - (var1 & var2);
      var2 = 999652596;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var10005 = (int)-8546635503638120192L;
      var2 = 915728030;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var2 = -562542631;
      var1 = var10005;
      var10005 = (var1 | var2) - (var1 & var2);
      var10006 = (int)-1947643189436887056L;
      var2 = -493314897;
      var1 = var10006;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var2 = 297519629;
      var1 = var10006;
      var2 = (var1 | var2) - (var1 & var2);
      var1 = var10005;
      var10005 = (var1 & ~var2) + (var2 & ~var1) + 2 * (var1 & var2);
      this.u = new PanelFadeOverlay(var10003, 5.0F, 9.5F);
      this.j.d(0.0);
      this.v.d(1.0);
   }

   public void a(float var1, float var2, float var3, float var4) {
      String var10005 = "dqy";
      this.a(var1, var2, var3, var4, 150.0F);
   }

   public void a(float var1, float var2, float var3, float var4, float var5) {
      if (this.k && !this.l) {
         this.b();
      } else {
         this.p = var1;
         this.q = var2;
         this.r = var3;
         this.s = var4;
         this.m = var5;
         this.n = var1 + var3 / 2.0F - this.m / 2.0F;
         float var10001 = var2 + var4;
         int var7 = -1519212831;
         int var6 = 630507955;
         int var10002 = (var6 | var7) & (~var6 | ~var7);
         var7 = -784800370;
         var6 = var10002;
         var10002 = var6 + var7 - 2 * (var6 & var7);
         this.o = var10001 + 11.0F;
         int var22 = (int)2703589775867021967L;
         var7 = -218117470;
         var6 = var22;
         int var23 = var6 & ~var7 | ~var6 & var7;
         var7 = 1108426796;
         var6 = var23;
         this.k = pulse.Bool.from(var6 & ~var7 | ~var6 & var7);
         var7 = 1947215346;
         var6 = -1507822454;
         int var24 = (var6 | var7) - (var6 & var7);
         var7 = -768585352;
         var6 = var24;
         this.l = pulse.Bool.from((var6 | var7) & ~(var6 & var7));
         var10002 = (int)-224325021556713956L;
         var7 = 1307363227;
         var6 = var10002;
         var10002 = var6 + var7 - 2 * (var6 & var7);
         var7 = 1610919546;
         var6 = var10002;
         var10002 = (var6 & ~var7 | ~var6 & var7) * (var6 & ~var7 | ~var6 & var7);
         this.j.a(1.0, 0.25, pulse.Easing.F);
      }
   }

   public void a(float var1) {
      this.m = var1;
   }

   public float a() {
      return this.m;
   }

   public void b() {
      if (this.k) {
         int var10001 = (int)3626629273475408414L;
         int var2 = 1301784639;
         int var1 = var10001;
         var10001 = var1 + var2 - 2 * (var1 & var2);
         var2 = 1142901280;
         var1 = var10001;
         this.l = pulse.Bool.from(var1 + var2 - 2 * (var1 & var2));
         this.t.g();
         int var10002 = (int)8709402425177477932L;
         var2 = 1992826650;
         var1 = var10002;
         var10002 = var1 & ~var2 | ~var1 & var2;
         var2 = -321809437;
         var1 = var10002;
         var10002 = (var1 + var2 - 2 * (var1 & var2)) * (var1 + var2 - 2 * (var1 & var2));
         this.j.a(0.0, 0.15, pulse.Easing.g);
      }
   }

   public void c() {
      int var10001 = (int)7764586769523453765L;
      int var2 = -176517302;
      int var1 = var10001;
      var10001 = (var1 | var2) - (var1 & var2);
      var2 = -1268899825;
      var1 = var10001;
      this.k = pulse.Bool.from((var1 | var2) & (~var1 | ~var2));
      var2 = 1914220212;
      var1 = 632210134;
      var10001 = var1 & ~var2 | ~var1 & var2;
      var2 = 1471573090;
      var1 = var10001;
      this.l = pulse.Bool.from((var1 | var2) & ~(var1 & var2));
      this.j.d(0.0);
      this.t.g();
   }

   public boolean d() {
      return this.k;
   }

   public boolean e() {
      if (this.l && this.j.d()) {
         double var10000 = this.j.j();
         int var4 = 1711568406;
         int var3 = -603020103;
         int var10001 = var3 & ~var4 | ~var3 & var4;
         var4 = -1399591097;
         var3 = var10001;
         var10001 = (var3 & ~var4 | ~var3 & var4) * (var3 & ~var4 | ~var3 & var4);
         if (var10000 < 0.01) {
            int var32 = (int)2508256920492777708L;
            var4 = -1615781761;
            var3 = var32;
            int var33 = (var3 | var4) & ~(var3 & var4);
            var4 = -1596850030;
            var3 = var33;
            int var31 = (var3 | var4) & (~var3 | ~var4);
            if (f != f) {
               var10001 = (int)296974296433179965L;
               var4 = 284308767;
               var3 = var10001;
               var10001 = var3 & ~var4 | ~var3 & var4;
               var4 = -1897003861;
               var3 = var10001;
               var10001 = var3 + var4 - 2 * (var3 & var4);
               var4 = -543472535;
               var3 = 1234007923;
               int var10002 = (var3 | var4) & (~var3 | ~var4);
               var4 = -1179461459;
               var3 = var10002;
               var4 = (var3 | var4) - (var3 & var4);
               var3 = var10001;
               var10001 = 2 * (var3 | var4) - (var3 ^ var4);
               var10001 = (int)4853342044683168647L;
               var4 = 1202587818;
               var3 = var10001;
               var10001 = (var3 | var4) & (~var3 | ~var4);
               var4 = 381593216;
               var3 = var10001;
               int var2 = (var3 | var4) & (~var3 | ~var4);
               f = var2;
            }

            return pulse.Bool.from(var31);
         }
      }

      int var29 = (int)5963987670949319939L;
      int var18 = 688387919;
      int var6 = var29;
      var29 = (var6 | var18) & (~var6 | ~var18);
      var18 = 45720140;
      var6 = var29;
      return pulse.Bool.from((var6 | var18) & ~(var6 & var18));
   }

   public void f() {
      this.j.a();
      this.v.a();
      if (this.e()) {
         int var2 = -727099633;
         int var1 = -551027173;
         int var10001 = (var1 | var2) & ~(var1 & var2);
         var2 = 193898772;
         var1 = var10001;
         this.k = pulse.Bool.from(var1 & ~var2 | ~var1 & var2);
         var10001 = (int)7816528622122679302L;
         var2 = -1033201587;
         var1 = var10001;
         var10001 = var1 & ~var2 | ~var1 & var2;
         var2 = -132045749;
         var1 = var10001;
         this.l = pulse.Bool.from(var1 & ~var2 | ~var1 & var2);
      }
   }

   public float g() {
      float var1 = this.t.m();
      int var3 = 700610329;
      int var2 = 482992578;
      int var10001 = (var2 | var3) & ~(var2 & var3);
      var3 = 889951959;
      var2 = var10001;
      var10001 = var2 & ~var3 | ~var2 & var3;
      var10001 = (int)-5907806103889610263L;
      var3 = 1293548628;
      var2 = var10001;
      var10001 = var2 & ~var3 | ~var2 & var3;
      var3 = 1927251384;
      var2 = var10001;
      var10001 = (var2 | var3) & (~var2 | ~var3);
      var3 = 693377100;
      var2 = -1117357456;
      var10001 = (var2 | var3) & (~var2 | ~var3);
      var3 = -1808637388;
      var2 = var10001;
      var10001 = var2 + var3 - 2 * (var2 & var3);
      var3 = 1307320097;
      var2 = 1420279796;
      int var10002 = (var2 | var3) & (~var2 | ~var3);
      var3 = 1222859488;
      var2 = var10002;
      var10002 = var2 + var3 - 2 * (var2 & var3);
      var3 = -1905919777;
      var2 = -2017986864;
      int var10003 = (var2 | var3) & (~var2 | ~var3);
      var3 = 400299780;
      var2 = var10003;
      var3 = var2 & ~var3 | ~var2 & var3;
      var2 = var10002;
      var10002 = 2 * (var2 | var3) - (var2 ^ var3);
      return Math.max(30.0F, Math.min(var1, 120.0F));
   }

   public void a(MatrixStack var1, Renderer2D var2, int var3, int var4) {
      if (this.k) {
         this.f();
         float var5 = (float)this.j.j();
         String var10001 = "dqz";
         if (!(var5 < 0.01F)) {
            float var6 = this.g();
            float var7 = Math.max(0.0F, Math.min(1.0F, var5));
            int var197 = (int)7068522404664803076L;
            int var29 = -1577906716;
            int var28 = var197;
            int var198 = var28 & ~var29 | ~var28 & var29;
            var29 = -1994624275;
            var28 = var198;
            int var199 = var28 + var29 - 2 * (var28 & var29);
            int var200 = (int)4159020294702958842L;
            var29 = 2057081115;
            var28 = var200;
            int var201 = var28 + var29 - 2 * (var28 & var29);
            var29 = 1442159078;
            var28 = var201;
            int var202 = (var28 | var29) & ~(var28 & var29);
            var29 = -1261529040;
            var28 = 1993639617;
            int var203 = var28 & ~var29 | ~var28 & var29;
            var29 = -1038475521;
            var28 = var203;
            int var204 = var28 & ~var29 | ~var28 & var29;
            int var8 = (int)(255.0F * var7);
            float var9 = this.n + this.m / 2.0F;
            float var10 = this.o + var6 / 2.0F;
            float var11 = this.m * var7;
            float var12 = var6 * var7;
            float var13 = var9 - var11 / 2.0F;
            float var14 = var10 - var12 / 2.0F;
            Color var15 = pulse.Theme.a(pulse.Theme.q, var8);
            Color var16 = pulse.Theme.a(pulse.Theme.r, var8);
            var29 = 737730267;
            var28 = -635130243;
            int var10002 = var28 + var29 - 2 * (var28 & var29);
            var29 = 1039501993;
            var28 = var10002;
            var10002 = ((var28 | var29) - (var28 & var29)) * ((var28 | var29) - (var28 & var29));
            float var205 = var13 - 0.5F * var7;
            var29 = -484317968;
            var28 = -2138745013;
            int var10003 = (var28 | var29) & (~var28 | ~var29);
            var29 = -132528560;
            var28 = var10003;
            var10003 = var28 + var29 - 2 * (var28 & var29);
            float var225 = var14 - 0.5F * var7;
            float var239 = var11 + var7;
            float var10004 = var12 + var7;
            var29 = 1968076339;
            var28 = -1294418726;
            int var10005 = (var28 | var29) - (var28 & var29);
            var29 = -1548171118;
            var28 = var10005;
            var10005 = var28 + var29 - 2 * (var28 & var29);
            var2.a(var205, var225, var239, var10004, 9.5F * var7, var15, var15, var16, var16, var1);
            Color var17 = pulse.Theme.a(pulse.Theme.e, var8);
            Color var18 = pulse.Theme.a(pulse.Theme.f, var8);
            var10005 = (int)-6946483954834737778L;
            var29 = 1842486949;
            var28 = var10005;
            var10005 = (var28 | var29) & ~(var28 & var29);
            var29 = 1227180192;
            var28 = var10005;
            var10005 = ((var28 | var29) - (var28 & var29)) * ((var28 | var29) - (var28 & var29));
            var2.a(var13, var14, var11, var12, 9.5F * var7, var17, var17, var18, var18, var1);
            var29 = -1340873489;
            var28 = -851345257;
            int var10000 = var28 + var29 - 2 * (var28 & var29);
            var29 = 1639290411;
            var28 = var10000;
            var10000 = (var28 | var29) & (~var28 | ~var29);
            int var206 = (int)-4668216578305882562L;
            var29 = 1062389956;
            var28 = var206;
            int var207 = var28 & ~var29 | ~var28 & var29;
            var29 = 1740001673;
            var28 = var207;
            var29 = (var28 | var29) & (~var28 | ~var29);
            var28 = var10000;
            var10000 = 2 * (var28 | var29) - (var28 ^ var29);
            var29 = 937021189;
            var28 = 1444296448;
            int var208 = var28 & ~var29 | ~var28 & var29;
            var29 = -1277489180;
            var28 = var208;
            int var209 = (var28 | var29) & ~(var28 & var29);
            String var226 = "dra";
            var10002 = (int)2050466125938965657L;
            var29 = 353014461;
            var28 = var10002;
            var10002 = var28 + var29 - 2 * (var28 & var29);
            var29 = -1362689514;
            var28 = var10002;
            var10002 = var28 + var29 - 2 * (var28 & var29);
            var29 = -79193482;
            var28 = -371423621;
            var10003 = var28 + var29 - 2 * (var28 & var29);
            var29 = 1112302621;
            var28 = var10003;
            var10003 = (var28 | var29) & (~var28 | ~var29);
            var29 = -1204894300;
            var28 = 1669218990;
            var10003 = (var28 | var29) & ~(var28 & var29);
            var29 = -54873204;
            var28 = var10003;
            var10003 = var28 + var29 - 2 * (var28 & var29);
            int var244 = (int)7264688781612315198L;
            var29 = 249994361;
            var28 = var244;
            int var245 = (var28 | var29) & (~var28 | ~var29);
            var29 = -504775896;
            var28 = var245;
            int var246 = (var28 | var29) - (var28 & var29);
            var29 = 376538722;
            var28 = 1354351943;
            var10005 = var28 + var29 - 2 * (var28 & var29);
            var29 = 1268282116;
            var28 = var10005;
            var29 = (var28 | var29) & ~(var28 & var29);
            var28 = var246;
            int var247 = (var28 | var29) + (var28 & var29);
            int var248 = (int)3222501745764772670L;
            var29 = -241176393;
            var28 = var248;
            int var249 = (var28 | var29) & (~var28 | ~var29);
            var29 = 1482593693;
            var28 = var249;
            int var250 = (var28 | var29) - (var28 & var29);
            var29 = -2024490918;
            var28 = -304438350;
            var10005 = (var28 | var29) & (~var28 | ~var29);
            var29 = -1618718536;
            var28 = var10005;
            var10005 = var28 & ~var29 | ~var28 & var29;
            var10005 = (int)-8550855381885380726L;
            var29 = 1267275711;
            var28 = var10005;
            var10005 = (var28 | var29) - (var28 & var29);
            var29 = -281786741;
            var28 = var10005;
            IconTextureRegistry.TextureInfo var19 = IconTextureRegistry.getInfo(
               a(
                  "\uedc5ݚ\uedd6݇\uedd3ݷ\uedd2",
                  "`ꟳꓺꁡꤐ絺蹙⑿譸㑿g\ua7e2ꓺꁸ꤈給蹆\u2435謀㑶f\ua7e3꒧ꁼ꤄絤蹁⑉謲㑣f\ua7ef꒻ꁶꤖ絆蹋⑴謲㑻",
                  var10002,
                  var10003,
                  var250,
                  (var28 | var29) & ~(var28 & var29)
               )
            );
            if (var19 != null) {
               Identifier var20 = var19.a();
               var29 = 1417449777;
               var28 = -387346608;
               var10000 = (var28 | var29) - (var28 & var29);
               var29 = -1131078047;
               var28 = var10000;
               RenderSystem.setShaderTexture((var28 | var29) & ~(var28 & var29), var20);
               float var21 = var19.b() / 2.0F * var7;
               float var22 = var19.c() / 2.0F * var7;
               float var23 = var13 + var11 / 2.0F;
               float var24 = var14 - var21 / 2.0F - 1.0F;
               Color var25 = pulse.Theme.a(pulse.Theme.aa, var8);
               var1.push();
               var1.translate(var23, var24, 0.0F);
               var29 = -1354544023;
               var28 = -784079736;
               var10002 = (var28 | var29) & ~(var28 & var29);
               var29 = -126268338;
               var28 = var10002;
               var10002 = ((var28 | var29) - (var28 & var29)) * ((var28 | var29) - (var28 & var29));
               var1.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(-90.0F));
               var1.translate(-var23, -var24, 0.0F);
               float var183 = var23 - var21 / 2.0F;
               var29 = 1287520656;
               var28 = 559066185;
               var10002 = var28 & ~var29 | ~var28 & var29;
               var29 = 1844227542;
               var28 = var10002;
               var10002 = var28 + var29 - 2 * (var28 & var29);
               float var26 = var183 - 0.5F;
               float var27 = var24 - var22 / 2.0F;
               var2.a(var20, var26, var27, var21, var22, var25, var1);
               var1.pop();
            }

            int var210 = (int)8419945120952847622L;
            var29 = -1858611236;
            var28 = var210;
            int var211 = var28 & ~var29 | ~var28 & var29;
            var29 = 504581800;
            var28 = var211;
            int var212 = (var28 | var29) - (var28 & var29);
            if (var7 > 0.1F) {
               var29 = 819171311;
               var28 = 149816061;
               int var213 = (var28 | var29) - (var28 & var29);
               var29 = 1353502274;
               var28 = var213;
               int var214 = var28 & ~var29 | ~var28 & var29;
               var29 = 757739802;
               var28 = -1952744132;
               var10002 = (var28 | var29) - (var28 & var29);
               var29 = -2143492375;
               var28 = var10002;
               var29 = (var28 | var29) - (var28 & var29);
               var28 = var214;
               int var215 = (var28 ^ var29) + 2 * (var28 & var29);
               float var30 = var14 + 7.0F * var7;
               var10001 = "drb";
               float var184 = var12 - 7.0F;
               var10001 = "drc";
               float var31 = (var184 - 6.0F) * var7;
               ScissorStack var185 = var2.b();
               var29 = -1594347503;
               var28 = 1216086260;
               var10005 = (var28 | var29) & (~var28 | ~var29);
               var29 = -1224654460;
               var28 = var10005;
               var10005 = var28 & ~var29 | ~var28 & var29;
               var29 = -249348694;
               var28 = -1316595078;
               int var10006 = (var28 | var29) & ~(var28 & var29);
               var29 = 877595599;
               var28 = var10006;
               var29 = (var28 | var29) & ~(var28 & var29);
               var28 = var10005;
               var10005 = 2 * (var28 | var29) - (var28 ^ var29);
               var185.a(var13, var30, var11, var31, 9.5F * var7, var1);
               if (!this.l) {
                  if (g) {
                     var29 = -176794908;
                     var28 = -1934369326;
                     var10000 = var28 & ~var29 | ~var28 & var29;
                     var29 = 2042990390;
                     var28 = var10000;
                     var10000 = (var28 | var29) - (var28 & var29);
                     int var218 = (int)3059631933698230487L;
                     var29 = 76330064;
                     var28 = var218;
                     int var219 = var28 & ~var29 | ~var28 & var29;
                     var29 = 1930099847;
                     var28 = var219;
                     var10000 /= (var28 | var29) - (var28 & var29);
                  }

                  var10000 = var3;
               } else {
                  var29 = -1682676869;
                  var28 = -2033552658;
                  var10000 = (var28 | var29) & (~var28 | ~var29);
                  var29 = -494801302;
                  var28 = var10000;
                  var10000 = var28 + var29 - 2 * (var28 & var29);
               }

               int var32 = var10000;
               if (!this.l) {
                  var10000 = var4;
               } else {
                  var10000 = (int)5880649326235892389L;
                  var29 = -1159059886;
                  var28 = var10000;
                  var10000 = var28 & ~var29 | ~var28 & var29;
                  var29 = -269560;
                  var28 = var10000;
                  var10000 = (var28 | var29) & (~var28 | ~var29);
               }

               int var33 = var10000;
               this.t.a(var1, var2, var13, var14, var11, var12, var32, var33, var7, var7);
               float var34 = var14 + var12;
               boolean var35 = this.t.e(var34);
               if (this.t.d(var12) && !var35) {
                  var29 = -1747130675;
                  var28 = 1691350069;
                  var10000 = (var28 | var29) & ~(var28 & var29);
                  var29 = -216853767;
                  var28 = var10000;
                  var10000 = var28 + var29 - 2 * (var28 & var29);
               } else {
                  var29 = -2019000380;
                  var28 = 1755696996;
                  var10000 = (var28 | var29) & ~(var28 & var29);
                  var29 = -284315488;
                  var28 = var10000;
                  var10000 = var28 + var29 - 2 * (var28 & var29);
               }

               int var36 = var10000;
               if (pulse.Bool.from(var36) != this.w) {
                  double var220 = var36 == 0 ? 0.0 : 1.0;
                  var10002 = (int)-8813261151012953946L;
                  var29 = -16543769;
                  var28 = var10002;
                  var10002 = var28 + var29 - 2 * (var28 & var29);
                  var29 = -1295819359;
                  var28 = var10002;
                  var10002 = ((var28 | var29) & ~(var28 & var29)) * ((var28 | var29) & ~(var28 & var29));
                  this.v.a(var220, 0.15, pulse.Easing.h);
                  this.w = pulse.Bool.from(var36);
               }

               float var37 = (float)this.v.j();
               int var221 = (int)8323467270889200889L;
               var29 = -2135079757;
               var28 = var221;
               int var222 = (var28 | var29) - (var28 & var29);
               var29 = -1607395397;
               var28 = var222;
               int var223 = ((var28 | var29) & ~(var28 & var29)) * ((var28 | var29) & ~(var28 & var29));
               if (var37 > 0.01F) {
                  this.u.a(var1, var2, var13, var14, var11, var12, var7 * var37);
               }

               var2.b().a(var1);
            }
         }
      }
   }

   public boolean a(int var1, int var2) {
      if (this.k && !this.l) {
         double var10000 = this.j.j();
         String var10001 = "drd";
         if (!(var10000 < 0.5)) {
            if (this.d(var1, var2)) {
               boolean var3 = this.t.a(this.n, this.o, this.m, this.g(), var1, var2);
               if (var3) {
                  ConfigManager.a().h();
               }

               return var3;
            }

            if (!this.t.d()) {
               int var20 = (int)-3158619995209742045L;
               int var14 = -1786005528;
               int var9 = var20;
               int var21 = var9 + var14 - 2 * (var9 & var14);
               var14 = -526876981;
               var9 = var21;
               return pulse.Bool.from((var9 | var14) & (var9 ^ -1 | var14 ^ -1));
            }

            this.t.g();
            int var18 = (int)-2801704033736334028L;
            int var12 = -1510632348;
            int var7 = var18;
            int var19 = (var7 | var12) & ~(var7 & var12);
            var12 = -626495151;
            var7 = var19;
            return pulse.Bool.from((var7 | var12) & (var7 ^ -1 | var12 ^ -1));
         }
      }

      int var16 = (int)4531796029578790727L;
      int var5 = -1546740248;
      int var4 = var16;
      var16 = (var4 | var5) & ~(var4 & var5);
      var5 = -631285073;
      var4 = var16;
      return pulse.Bool.from(var4 & (var5 ^ -1) | (var4 ^ -1) & var5);
   }

   public boolean b(int var1, int var2) {
      if (this.k && !this.l) {
         double var10000 = this.j.j();
         int var10002 = (int)-5754969847706164413L;
         int var4 = -392761809;
         int var3 = var10002;
         var10002 = var3 & ~var4 | ~var3 & var4;
         var4 = -822801043;
         var3 = var10002;
         var10002 = var3 + var4 - 2 * (var3 & var4);
         var4 = -1933706777;
         var3 = 444889121;
         var10002 = var3 + var4 - 2 * (var3 & var4);
         var4 = -1774616121;
         var3 = var10002;
         var10002 = (var3 | var4) - (var3 & var4);
         var10002 = (int)3953474970901961318L;
         var4 = 1663785091;
         var3 = var10002;
         var10002 = (var3 | var4) & ~(var3 & var4);
         var4 = 1177092837;
         var3 = var10002;
         var10002 = var3 + var4 - 2 * (var3 & var4);
         var4 = 1279024548;
         var3 = -1565179809;
         var10002 = (var3 | var4) - (var3 & var4);
         var4 = -293003780;
         var3 = var10002;
         var10002 = (var3 | var4) & (~var3 | ~var4);
         if (!(var10000 < 0.5)) {
            if (this.d(var1, var2)) {
               if (!this.t.d()) {
                  return this.t.b(this.n, this.o, this.m, this.g(), var1, var2);
               }

               this.t.g();
               var4 = -1115419208;
               var3 = -1955061950;
               int var39 = (var3 | var4) & (~var3 | ~var4);
               var4 = 922489595;
               var3 = var39;
               return pulse.Bool.from((var3 | var4) & (var3 & var4 ^ -1));
            }

            if (!this.t.d()) {
               var4 = 1112671949;
               var3 = -2128194142;
               int var38 = var3 + var4 - 2 * (var3 & var4);
               var4 = -1015786641;
               var3 = var38;
               return pulse.Bool.from(var3 & (var4 ^ -1) | (var3 ^ -1) & var4);
            }

            this.t.g();
            int var36 = (int)-104338983917976653L;
            var4 = 1005572948;
            var3 = var36;
            int var37 = (var3 | var4) - (var3 & var4);
            var4 = 213373158;
            var3 = var37;
            return pulse.Bool.from(var3 & (var4 ^ -1) | (var3 ^ -1) & var4);
         }
      }

      int var27 = -1737019585;
      int var12 = -1619509513;
      int var35 = (var12 | var27) & (~var12 | ~var27);
      var27 = 118428104;
      var12 = var35;
      return pulse.Bool.from(var12 & (var27 ^ -1) | (var12 ^ -1) & var27);
   }

   public void c(int var1, int var2) {
      if (!this.k) {
         int var10000 = (int)1274854408711635737L;
         int var6 = 1115527248;
         int var5 = var10000;
         var10000 = var5 + var6 - 2 * (var5 & var6);
         var6 = 1317489992;
         var5 = var10000;
         var10000 = (var5 | var6) & (~var5 | ~var6);
         var10000 = (int)-2133075958948819071L;
         var6 = 840496375;
         var5 = var10000;
         var10000 = (var5 | var6) & ~(var5 & var6);
         var6 = -251667656;
         var5 = var10000;
         int var4 = var5 & ~var6 | ~var5 & var6;
         String var29 = "dre";
         var6 = 2130397923;
         var5 = -562018613;
         var10000 = var5 & ~var6 | ~var5 & var6;
         var6 = -1751761518;
         var5 = var10000;
         if (((var5 | var6) & ~(var5 & var6)) >= var4) {
            var10000 = (int)4913547452023714923L;
            var6 = 1043259857;
            var5 = var10000;
            var10000 = var5 & ~var6 | ~var5 & var6;
            var6 = -557263430;
            var5 = var10000;
            var10000 = var5 & ~var6 | ~var5 & var6;
            int var10001 = (int)1627349478959999275L;
            var6 = -350278083;
            var5 = var10001;
            var10001 = var5 + var6 - 2 * (var5 & var6);
            var6 = 1238157078;
            var5 = var10001;
            var10000 /= var5 & ~var6 | ~var5 & var6;
         }
      } else {
         this.t.c(var1, var2);
      }
   }

   public void a(int var1, int var2, double var3, double var5) {
      if (this.k && !this.l) {
         this.t.a(this.g(), var1, var2, var3, var5);
      }
   }

   public boolean a(float var1, int var2, int var3) {
      if (!this.k || this.l) {
         int var14 = 1365765169;
         int var9 = 2002044982;
         int var17 = (var9 | var14) & (~var9 | ~var14);
         var14 = 640885767;
         var9 = var17;
         return pulse.Bool.from(var9 + var14 - 2 * (var9 & var14));
      } else if (!this.d(var2, var3)) {
         int var12 = 1028013837;
         int var7 = 1277056673;
         int var16 = (var7 | var12) & ~(var7 & var12);
         var12 = 1901619628;
         var7 = var16;
         return pulse.Bool.from((var7 | var12) & (var7 & var12 ^ -1));
      } else {
         this.t.a(var1, this.g());
         int var5 = -378481490;
         int var4 = 1618750702;
         int var10000 = (var4 | var5) - (var4 & var5);
         var5 = -1995638719;
         var4 = var10000;
         return pulse.Bool.from((var4 | var5) - (var4 & var5));
      }
   }

   public boolean d(int var1, int var2) {
      if (this.k) {
         double var10000 = this.j.j();
         String var10001 = "drf";
         if (!(var10000 < 0.5)) {
            return GuiInput.a(this.n, this.o, this.m, this.g(), var1, var2);
         }
      }

      int var4 = 384613159;
      int var3 = 656262110;
      int var7 = var3 & ~var4 | ~var3 & var4;
      var4 = 837908729;
      var3 = var7;
      return pulse.Bool.from((var3 | var4) & (var3 & var4 ^ -1));
   }

   public void b(float var1, float var2, float var3, float var4) {
      this.p = var1;
      this.q = var2;
      this.r = var3;
      this.s = var4;
   }

   public boolean h() {
      return this.x.c();
   }

   public boolean i() {
      return this.y.c();
   }

   public boolean j() {
      return this.z.c();
   }

   public boolean k() {
      return this.A.c();
   }

   public boolean l() {
      return this.B.c();
   }

   public void a(boolean var1) {
      this.x.a(var1);
   }

   public void b(boolean var1) {
      this.y.a(var1);
   }

   public void c(boolean var1) {
      this.z.a(var1);
   }

   public void d(boolean var1) {
      this.A.a(var1);
   }

   public void e(boolean var1) {
      this.B.a(var1);
   }

   public static String a(String var0, String var1, int var2, int var3, int var4, int var5) {
      char[] var6 = var1.toCharArray();
      char[] var7 = new char[var6.length];
      int var10000 = (int)-1354063477104447062L;
      int var20 = -12634870;
      int var19 = var10000;
      var10000 = (var19 | var20) & (~var19 | ~var20);
      var20 = -320551766;
      var19 = var10000;
      char[] var275 = new char[(var19 | var20) & ~(var19 & var20)];
      int var10002 = (int)-481650403633944672L;
      var20 = -122343618;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = 2043447454;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      int var10003 = (int)1079011034831746901L;
      var20 = -671520018;
      var19 = var10003;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = 1747342729;
      var19 = var10003;
      var275[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      var10002 = (int)-2492852737749744561L;
      var20 = 1840759477;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = -458832133;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = 1864924735;
      var19 = 1919679475;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = 490972745;
      var19 = var10003;
      var275[var10002] = (char)((var19 | var20) & ~(var19 & var20));
      var10002 = (int)-4998240579262075267L;
      var20 = 1462742531;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = -1676967812;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var10003 = (int)-2332556128175247948L;
      var20 = -927193191;
      var19 = var10003;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = -1714935381;
      var19 = var10003;
      var275[var10002] = (char)((var19 | var20) - (var19 & var20));
      var20 = 889525348;
      var19 = 199938295;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = 1055900816;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      String var356 = "drg";
      var20 = -1032913322;
      var19 = -2134952741;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = 1121014430;
      var19 = var10003;
      var275[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      var20 = -115236591;
      var19 = 346170773;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = -310147968;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = -963247536;
      var19 = 2032208784;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = -248531669;
      var19 = var10003;
      var10003 = (var19 + var20 - 2 * (var19 & var20)) * (var19 + var20 - 2 * (var19 & var20));
      var20 = 233145466;
      var19 = 328136523;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = 510386708;
      var19 = var10003;
      var275[var10002] = (char)((var19 | var20) & ~(var19 & var20));
      var20 = 1229290553;
      var19 = -1086260956;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = -167410408;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var10003 = (int)-1784247521684369987L;
      var20 = -371466283;
      var19 = var10003;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = -8759318;
      var19 = var10003;
      var275[var10002] = (char)((var19 | var20) & ~(var19 & var20));
      var20 = 490043232;
      var19 = 520899977;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = 37305071;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var10003 = (int)-7502662220420861047L;
      var20 = -1247437829;
      var19 = var10003;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = -1346920095;
      var19 = var10003;
      var275[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      var20 = -892581949;
      var19 = 2137891397;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = -1247681151;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = 1497637928;
      var19 = 1395071535;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = 174262821;
      var19 = var10003;
      var275[var10002] = (char)((var19 | var20) - (var19 & var20));
      var10002 = (int)-2450421685975673185L;
      var20 = -903430032;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = 1806128871;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var10003 = (int)-4101606292840557357L;
      var20 = 1916748461;
      var19 = var10003;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = -1601954259;
      var19 = var10003;
      var275[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      var10002 = (int)-8035043991912695506L;
      var20 = -1775121602;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = 89780761;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = 2135974618;
      var19 = 1414746673;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = 721631183;
      var19 = var10003;
      var275[var10002] = (char)((var19 | var20) & ~(var19 & var20));
      char[] var8 = var275;
      var10000 = (int)-1240158482541772980L;
      var20 = -1003369805;
      var19 = var10000;
      var10000 = var19 + var20 - 2 * (var19 & var20);
      var20 = -2099694091;
      var19 = var10000;
      char[] var278 = new char[(var19 | var20) - (var19 & var20)];
      var10002 = (int)4393009262056490199L;
      var20 = -723066812;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = -620354413;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = -929028232;
      var19 = -1554767545;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = 1811172895;
      var19 = var10003;
      var278[var10002] = (char)((var19 | var20) - (var19 & var20));
      var10002 = (int)2192071683215441555L;
      var20 = 1321053449;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = -1098771557;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      String var370 = "drh";
      var10003 = (int)-6862123689747466235L;
      var20 = 648824106;
      var19 = var10003;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = 1566832940;
      var19 = var10003;
      var278[var10002] = (char)((var19 | var20) - (var19 & var20));
      var20 = 36966087;
      var19 = 738863789;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = 775824488;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = 966068349;
      var19 = 564768335;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = -1264103113;
      var19 = var10003;
      var10003 = ((var19 | var20) & ~(var19 & var20)) * ((var19 | var20) & ~(var19 & var20));
      var20 = 465412842;
      var19 = 15023149;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = 458758548;
      var19 = var10003;
      var278[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      var20 = 2089770253;
      var19 = 398317788;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = 1798473170;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = -106193376;
      var19 = -543618428;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = 640855206;
      var19 = var10003;
      var278[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      var10002 = (int)-8948845684357083336L;
      var20 = 764645870;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = 2005425874;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var10003 = (int)-3235212343089700292L;
      var20 = 622349039;
      var19 = var10003;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = -399142765;
      var19 = var10003;
      var278[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      var20 = 1321668736;
      var19 = 478156593;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = 1380386740;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var10003 = (int)-332811873805918282L;
      var20 = -432638973;
      var19 = var10003;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = -755870943;
      var19 = var10003;
      var278[var10002] = (char)((var19 | var20) - (var19 & var20));
      var10002 = (int)-2173987656430893583L;
      var20 = -858378639;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = 1686924166;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = -2039967020;
      var19 = 1166353318;
      int var10004 = (var19 | var20) - (var19 & var20);
      var20 = -1007832711;
      var19 = var10004;
      var10004 = var19 + var20 - 2 * (var19 & var20);
      var10004 = (int)-4485197022898158961L;
      var20 = -33723175;
      var19 = var10004;
      var10004 = var19 + var20 - 2 * (var19 & var20);
      var20 = -1015452070;
      var19 = var10004;
      var10004 = (var19 | var20) & (~var19 | ~var20);
      var10004 = (int)-5157318688931435819L;
      var20 = -1980860816;
      var19 = var10004;
      var10004 = (var19 | var20) & (~var19 | ~var20);
      var20 = -1456710485;
      var19 = var10004;
      var10004 = (var19 | var20) & (~var19 | ~var20);
      var10003 = (int)-4231297466273609204L;
      var20 = -254149836;
      var19 = var10003;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = -1625737727;
      var19 = var10003;
      var278[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      var20 = 774705570;
      var19 = -1972064685;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = -1537622026;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var10003 = (int)6540979569490078446L;
      var20 = 2015264489;
      var19 = var10003;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = 848643135;
      var19 = var10003;
      var278[var10002] = (char)((var19 | var20) - (var19 & var20));
      var10002 = (int)-5344177364290479945L;
      var20 = 575218061;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = 1518434610;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var10003 = (int)-4077062997450562243L;
      var20 = 476910689;
      var19 = var10003;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = -1631936611;
      var19 = var10003;
      var10003 = (var19 | var20) - (var19 & var20);
      var10003 = (int)-3486559870286025987L;
      var20 = 2035889176;
      var19 = var10003;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = 975281633;
      var19 = var10003;
      var278[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      var10002 = (int)7625110198588150218L;
      var20 = -1942711438;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = -197492047;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var10003 = (int)5180833707349418128L;
      var20 = 1223531368;
      var19 = var10003;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = -167573301;
      var19 = var10003;
      var278[var10002] = (char)((var19 | var20) - (var19 & var20));
      char[] var9 = var278;
      var20 = -1845993109;
      var19 = 2061100285;
      var10000 = (var19 | var20) & ~(var19 & var20);
      var20 = -350124650;
      var19 = var10000;

      for (int var10 = (var19 | var20) & (~var19 | ~var20); var10 < var6.length; var10++) {
         char var348 = var6[var10];
         char var246 = var8[var10 % var8.length];
         char var121 = var348;
         var7[var10] = (char)((var121 | var246) & ~(var121 & var246));
      }

      char[] var21 = new char[var7.length];
      var20 = -116194470;
      var19 = 1204715704;
      var10000 = var19 + var20 - 2 * (var19 & var20);
      var20 = -1092779038;
      var19 = var10000;
      int var11 = var19 + var20 - 2 * (var19 & var20);
      var10000 = (int)1585179855032366169L;
      var20 = 1132167477;
      var19 = var10000;
      var10000 = (var19 | var20) & ~(var19 & var20);
      var20 = -283563671;
      var19 = var10000;
      var10000 = (var19 | var20) - (var19 & var20);
      var10000 = (int)290834670994453000L;
      var20 = -1015611948;
      var19 = var10000;
      var10000 = (var19 | var20) & (~var19 | ~var20);
      var20 = 2002850137;
      var19 = var10000;
      int var18 = var19 & ~var20 | ~var19 & var20;
      f = var18;
      var20 = 1725032887;
      var19 = 902402295;
      var10000 = (var19 | var20) & ~(var19 & var20);
      var20 = -727989775;
      var19 = var10000;
      var10000 = (var19 & ~var20 | ~var19 & var20) * (var19 & ~var20 | ~var19 & var20);
      var20 = -481182249;
      var19 = -2074520362;
      var10000 = var19 + var20 - 2 * (var19 & var20);
      var20 = 764735177;
      var19 = var10000;
      if (((var19 | var20) & (~var19 | ~var20)) < f) {
         var20 = 1625721978;
         var19 = -1996602436;
         int var10001 = (var19 | var20) & ~(var19 & var20);
         var20 = -401027121;
         var19 = var10001;
         var10001 = (var19 | var20) & (~var19 | ~var20);
         var10001 = (int)-5083285562090039310L;
         var20 = -68022361;
         var19 = var10001;
         var10001 = (var19 | var20) - (var19 & var20);
         var20 = 1211258973;
         var19 = var10001;
         var10001 = (var19 | var20) - (var19 & var20);
         var20 = 413583161;
         var19 = -1370888985;
         var10000 = (var19 | var20) & (~var19 | ~var20);
         var20 = -2103186956;
         var19 = var10000;
         var18 = (var19 | var20) - (var19 & var20);
         f = var18;
      }

      while (var11 < var6.length) {
         char var349 = var7[var11];
         char var263 = var9[var11 % var9.length];
         char var138 = var349;
         var21[var11] = (char)((var138 | var263) & ~(var138 & var263));
         var11++;
      }

      String var22 = new String(var21);
      int var12 = var22.hashCode();
      var20 = var5;
      var19 = var3;
      var10000 = var19 - var20;
      var20 = var2;
      var19 = var10000;
      int var13 = 2 * (var19 & ~var20) - (var19 ^ var20);
      char[] var14 = var0.toCharArray();
      char[] var15 = new char[var14.length];
      var20 = 1200897600;
      var19 = 1245473107;
      var10000 = (var19 | var20) & (~var19 | ~var20);
      var20 = 229136147;
      var19 = var10000;

      for (int var16 = var19 + var20 - 2 * (var19 & var20); var16 < var15.length; var16++) {
         int var296 = (int)4830787333877561440L;
         var20 = 1026704424;
         var19 = var296;
         var296 = (var19 | var20) - (var19 & var20);
         var20 = 1879587914;
         var19 = var296;
         switch (var16 % ((var19 | var20) & (~var19 | ~var20))) {
            case 0:
               var20 = var12;
               var19 = var13;
               var10002 = (var19 | var20) & (~var19 | ~var20);
               char var273 = var14[var16];
               var19 = var10002;
               var15[var16] = (char)((var19 | var273) - (var19 & var273));
               break;
            case 1:
               var20 = var13;
               var19 = var5;
               var10002 = (var19 | var20) & ~(var19 & var20);
               char var271 = var14[var16];
               var19 = var10002;
               var15[var16] = (char)((var19 | var271) & (~var19 | ~var271));
         }
      }

      return new String(var15);
   }
}
