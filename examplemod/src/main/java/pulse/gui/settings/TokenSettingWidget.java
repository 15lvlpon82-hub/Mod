package pulse;


import pulse.settings.TokenSetting;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.client.util.math.MatrixStack;

public class TokenSettingWidget implements SettingWidget {
   private static final Set<TokenSettingWidget> d = Collections.newSetFromMap(new WeakHashMap<>());
   public static final float a = 20.0F;
   private static final float e = 8.0F;
   private static final float f = 40.0F;
   private static final float g = 100.0F;
   private static final float h = 14.0F;
   private static final float i = 4.0F;
   private static final float j = 5.0F;
   private static final int k = 16;
   private final String l;
   private final TokenSettingWidget.ValueType m;
   private String n;
   private String o;
   private final TokenSetting p;
   private boolean q;
   private int r;
   private int s;
   private int t;
   private final pulse.AnimationState u;
   private final pulse.AnimationState v;
   private final pulse.AnimationState w;
   private final pulse.AnimationState x;
   private final MarqueeText y;
   private boolean z;
   private boolean A;
   private float B;
   private float C;
   private float D;
   private float E;
   private float F;
   private String G;
   public static int b;
   public static boolean c;

   public TokenSettingWidget(TokenSetting var1, TokenSettingWidget.ValueType var2) {
      int var4 = -1609448649;
      int var3 = -155738931;
      int var10002 = (var3 | var4) & ~(var3 & var4);
      var4 = 1453744115;
      var3 = var10002;
      var10002 = var3 & ~var4 | ~var3 & var4;
      var10002 = (int)1284241876740098134L;
      var4 = -1594897046;
      var3 = var10002;
      var10002 = (var3 | var4) & (~var3 | ~var4);
      var4 = 1680442671;
      var3 = var10002;
      var10002 = var3 & ~var4 | ~var3 & var4;
      var4 = 2126651713;
      var3 = -1546943827;
      var10002 = var3 + var4 - 2 * (var3 & var4);
      var4 = -586570781;
      var3 = var10002;
      var10002 = var3 + var4 - 2 * (var3 & var4);
      String var184 = "en";
      int var10003 = (int)7691409050248164107L;
      var4 = -1976407393;
      var3 = var10003;
      var10003 = var3 & ~var4 | ~var3 & var4;
      var4 = 614884397;
      var3 = var10003;
      var10003 = (var3 + var4 - 2 * (var3 & var4)) * (var3 + var4 - 2 * (var3 & var4));
      var4 = -754753326;
      var3 = 1443544667;
      var10003 = var3 & ~var4 | ~var3 & var4;
      var4 = -1305073219;
      var3 = var10003;
      var10003 = var3 & ~var4 | ~var3 & var4;
      var4 = 680071789;
      var3 = -1339555490;
      int var10004 = var3 + var4 - 2 * (var3 & var4);
      var4 = -886992651;
      var3 = var10004;
      var10004 = (var3 | var4) - (var3 & var4);
      var10004 = (int)-7083822949540882755L;
      var4 = -435994484;
      var3 = var10004;
      var10004 = (var3 | var4) & ~(var3 & var4);
      var4 = 1695757473;
      var3 = var10004;
      var10004 = (var3 | var4) - (var3 & var4);
      int var10006 = (int)8257795722721742210L;
      var4 = -1057258711;
      var3 = var10006;
      var10006 = var3 + var4 - 2 * (var3 & var4);
      var4 = -2006298950;
      var3 = var10006;
      var10006 = (var3 | var4) & (~var3 | ~var4);
      var10006 = (int)-6122289095397694465L;
      var4 = 2062557346;
      var3 = var10006;
      var10006 = var3 & ~var4 | ~var3 & var4;
      var4 = 845316951;
      var3 = var10006;
      var10006 = (var3 | var4) & (~var3 | ~var4);
      var4 = 559442402;
      var3 = -39262056;
      var10006 = (var3 | var4) & ~(var3 & var4);
      var4 = -588218000;
      var3 = var10006;
      var10006 = (var3 | var4) & (~var3 | ~var4);
      var4 = 4795195;
      var3 = 1017433570;
      int var10005 = var3 & ~var4 | ~var3 & var4;
      var4 = 983129749;
      var3 = var10005;
      var10005 = var3 + var4 - 2 * (var3 & var4);
      String var239 = "eo";
      var4 = -1758754413;
      var3 = -1482132669;
      var10006 = var3 & ~var4 | ~var3 & var4;
      var4 = 816747066;
      var3 = var10006;
      this.n = a(
         "",
         "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謴㑸\u007f\ua7eb꒺ꁿꥊ絥蹏⑮謣㑾|\ua7e1꒦ꀾ꤬絸蹚⑯謣㑄wꟲ꒡ꁸꤋ統蹯⑶謲㑺w\ua7e8꒡",
         var10003,
         var10004,
         var10005,
         var3 + var4 - 2 * (var3 & var4)
      );
      var4 = -670024744;
      var3 = 1734113867;
      int var10001 = var3 + var4 - 2 * (var3 & var4);
      var4 = -406506176;
      var3 = var10001;
      var10001 = (var3 | var4) & ~(var3 & var4);
      String var185 = "ep";
      var10003 = (int)7069207800023920297L;
      var4 = 1014758873;
      var3 = var10003;
      var10003 = (var3 | var4) & ~(var3 & var4);
      var4 = 1383978610;
      var3 = var10003;
      var10003 = (var3 | var4) & (~var3 | ~var4);
      var4 = 652835111;
      var3 = 1992552622;
      var10003 = (var3 | var4) & ~(var3 & var4);
      var4 = 1729461949;
      var3 = var10003;
      var10003 = var3 + var4 - 2 * (var3 & var4);
      String var207 = "eq";
      var4 = 1748919055;
      var3 = -585962276;
      var10004 = var3 & ~var4 | ~var3 & var4;
      var4 = 384735496;
      var3 = var10004;
      var10004 = (var3 | var4) & (~var3 | ~var4);
      var4 = 1790031260;
      var3 = -891656053;
      var10006 = var3 & ~var4 | ~var3 & var4;
      var4 = -1603543789;
      var3 = var10006;
      var10006 = (var3 | var4) & ~(var3 & var4);
      var10006 = (int)-2554731943324787654L;
      var4 = 1039292520;
      var3 = var10006;
      var10006 = (var3 | var4) & ~(var3 & var4);
      var4 = 2017068120;
      var3 = var10006;
      var10006 = (var3 | var4) & ~(var3 & var4);
      var10005 = (int)-1444434239330165817L;
      var4 = 1606134540;
      var3 = var10005;
      var10005 = var3 + var4 - 2 * (var3 & var4);
      var4 = 131711774;
      var3 = var10005;
      var10005 = var3 & ~var4 | ~var3 & var4;
      var4 = -2133862925;
      var3 = 1847872581;
      var10006 = (var3 | var4) & ~(var3 & var4);
      var4 = -1925655775;
      var3 = var10006;
      var10006 = var3 + var4 - 2 * (var3 & var4);
      int var10007 = (int)-3556124940827586019L;
      var4 = -1513931966;
      var3 = var10007;
      var10007 = (var3 | var4) & (~var3 | ~var4);
      var4 = -1043498202;
      var3 = var10007;
      var4 = (var3 | var4) & ~(var3 & var4);
      var3 = var10006;
      var10006 = (var3 | var4) + (var3 & var4);
      var4 = -1792273362;
      var3 = 1926832425;
      var10006 = (var3 | var4) & ~(var3 & var4);
      var4 = -405723086;
      var3 = var10006;
      this.o = a(
         "",
         "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謴㑸\u007f\ua7eb꒺ꁿꥊ絥蹏⑮謣㑾|\ua7e1꒦ꀾ꤬絸蹚⑯謣㑄wꟲ꒡ꁸꤋ統蹯⑶謲㑺w\ua7e8꒡",
         var10003,
         var10004,
         var10005,
         (var3 | var4) & (~var3 | ~var4)
      );
      var4 = -835985312;
      var3 = 118779477;
      var10001 = (var3 | var4) & ~(var3 & var4);
      var4 = -918581707;
      var3 = var10001;
      this.q = pulse.Bool.from(var3 & ~var4 | ~var3 & var4);
      var4 = -1361216974;
      var3 = 306419229;
      var10001 = (var3 | var4) & (~var3 | ~var4);
      var4 = -1130435537;
      var3 = var10001;
      this.r = var3 + var4 - 2 * (var3 & var4);
      var10001 = (int)-5102252272536251047L;
      var4 = -976747294;
      var3 = var10001;
      var10001 = (var3 | var4) & (~var3 | ~var4);
      var4 = 2000416324;
      var3 = var10001;
      this.s = var3 + var4 - 2 * (var3 & var4);
      var4 = 1609879272;
      var3 = -55018596;
      var10001 = (var3 | var4) - (var3 & var4);
      var4 = 1555253899;
      var3 = var10001;
      this.t = (var3 | var4) & ~(var3 & var4);
      this.u = new pulse.AnimationState();
      this.v = new pulse.AnimationState();
      this.w = new pulse.AnimationState();
      this.x = new pulse.AnimationState();
      this.y = new MarqueeText();
      var10001 = (int)-7162842032457880256L;
      var4 = 676974219;
      var3 = var10001;
      var10001 = (var3 | var4) & (~var3 | ~var4);
      var4 = 423994315;
      var3 = var10001;
      this.z = pulse.Bool.from(var3 & ~var4 | ~var3 & var4);
      var4 = 1262522407;
      var3 = -838534911;
      var10001 = (var3 | var4) & (~var3 | ~var4);
      var4 = -2059114201;
      var3 = var10001;
      this.A = pulse.Bool.from(var3 & ~var4 | ~var3 & var4);
      this.E = 1.0F;
      var10002 = (int)1529728365521245419L;
      var4 = 121328335;
      var3 = var10002;
      var10002 = (var3 | var4) & ~(var3 & var4);
      var4 = -226441676;
      var3 = var10002;
      var10002 = (var3 | var4) & ~(var3 & var4);
      String var189 = "ArmorRenderState";
      var4 = 80442160;
      var3 = -835372930;
      var10003 = (var3 | var4) & (~var3 | ~var4);
      var4 = -1841683165;
      var3 = var10003;
      var10003 = (var3 | var4) & (~var3 | ~var4);
      var4 = -408018240;
      var3 = 2052397067;
      var10003 = (var3 | var4) & (~var3 | ~var4);
      var4 = -1429942785;
      var3 = var10003;
      var10003 = (var3 | var4) & ~(var3 & var4);
      var10005 = (int)-4682592487641005825L;
      var4 = 1916324241;
      var3 = var10005;
      var10005 = var3 + var4 - 2 * (var3 & var4);
      var4 = 1342572908;
      var3 = var10005;
      var10005 = var3 & ~var4 | ~var3 & var4;
      var10005 = (int)-6793195022267073459L;
      var4 = 64382642;
      var3 = var10005;
      var10005 = (var3 | var4) & (~var3 | ~var4);
      var4 = 2080889599;
      var3 = var10005;
      var10005 = (var3 | var4) - (var3 & var4);
      var10005 = (int)-8730429228457942904L;
      var4 = -780909839;
      var3 = var10005;
      var10005 = var3 + var4 - 2 * (var3 & var4);
      var4 = -1939348875;
      var3 = var10005;
      var10005 = var3 + var4 - 2 * (var3 & var4);
      var4 = 644601848;
      var3 = 313374284;
      var10005 = var3 & ~var4 | ~var3 & var4;
      var4 = 885416383;
      var3 = var10005;
      var10005 = (var3 | var4) & ~(var3 & var4);
      var10004 = (int)-6128371376460319123L;
      var4 = 1752740924;
      var3 = var10004;
      var10004 = var3 + var4 - 2 * (var3 & var4);
      var4 = 366259685;
      var3 = var10004;
      var10004 = (var3 | var4) & ~(var3 & var4);
      String var228 = "ChatMessages";
      var10005 = (int)-8917663924290718193L;
      var4 = -483689120;
      var3 = var10005;
      var10005 = (var3 | var4) & (~var3 | ~var4);
      var4 = 1841596178;
      var3 = var10005;
      var10005 = var3 & ~var4 | ~var3 & var4;
      String var250 = "ColorUtils";
      var10006 = (int)5809190334062349376L;
      var4 = -1668787906;
      var3 = var10006;
      var10006 = (var3 | var4) & ~(var3 & var4);
      var4 = 180628336;
      var3 = var10006;
      this.G = a(
         "",
         "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謴㑸\u007f\ua7eb꒺ꁿꥊ絥蹏⑮謣㑾|\ua7e1꒦ꀾ꤬絸蹚⑯謣㑄wꟲ꒡ꁸꤋ統蹯⑶謲㑺w\ua7e8꒡",
         var10003,
         var10004,
         var10005,
         var3 + var4 - 2 * (var3 & var4)
      );
      this.p = var1;
      this.l = var1.f();
      this.m = var2;
      this.o = var1.c();
      this.w.d(1.0);
      var4 = -692939935;
      var3 = -1564602473;
      var10001 = (var3 | var4) & (~var3 | ~var4);
      var4 = 448792311;
      var3 = var10001;
      var10001 = var3 & ~var4 | ~var3 & var4;
      this.F = 40.0F;
      var4 = -569755283;
      var3 = 93009858;
      var10001 = var3 + var4 - 2 * (var3 & var4);
      var4 = -143296182;
      var3 = var10001;
      var10001 = ((var3 | var4) & ~(var3 & var4)) * ((var3 | var4) & ~(var3 & var4));
      this.x.d(40.0);
      d.add(this);
      this.a(var1.a());
   }

   public TokenSettingWidget(String var1, TokenSettingWidget.ValueType var2) {
      int var10001 = (int)1678105882907379761L;
      int var4 = 1243121848;
      int var3 = var10001;
      var10001 = (var3 | var4) & ~(var3 & var4);
      var4 = -495283404;
      var3 = var10001;
      var10001 = (var3 | var4) & (~var3 | ~var4);
      int var10003 = (int)-6182621083859991588L;
      var4 = 2054061161;
      var3 = var10003;
      var10003 = (var3 | var4) & ~(var3 & var4);
      var4 = -373211201;
      var3 = var10003;
      var10003 = var3 + var4 - 2 * (var3 & var4);
      var4 = 12086949;
      var3 = 758905276;
      var10003 = (var3 | var4) & ~(var3 & var4);
      var4 = 763598623;
      var3 = var10003;
      var10003 = var3 + var4 - 2 * (var3 & var4);
      var4 = 119715212;
      var3 = -1698494179;
      var10003 = (var3 | var4) & (~var3 | ~var4);
      var4 = -1646150508;
      var3 = var10003;
      var10003 = var3 & ~var4 | ~var3 & var4;
      var10003 = (int)-1517300284554649956L;
      var4 = 1062024968;
      var3 = var10003;
      var10003 = var3 & ~var4 | ~var3 & var4;
      var4 = 516450712;
      var3 = var10003;
      var10003 = var3 + var4 - 2 * (var3 & var4);
      var4 = 389053727;
      var3 = 254629280;
      var10003 = (var3 | var4) & ~(var3 & var4);
      var4 = -682288561;
      var3 = var10003;
      var10003 = (var3 | var4) - (var3 & var4);
      var4 = -2045632426;
      var3 = -1333493055;
      int var10004 = var3 & ~var4 | ~var3 & var4;
      var4 = -1578758276;
      var3 = var10004;
      var4 = (var3 | var4) & ~(var3 & var4);
      var3 = var10003;
      var10003 = (var3 ^ var4) + 2 * (var3 & var4);
      var10003 = (int)3107240540069623504L;
      var4 = -201061978;
      var3 = var10003;
      var10003 = var3 + var4 - 2 * (var3 & var4);
      var4 = 766576706;
      var3 = var10003;
      var10003 = (var3 | var4) - (var3 & var4);
      var10004 = (int)843172400572796774L;
      var4 = -1052030567;
      var3 = var10004;
      var10004 = (var3 | var4) & (~var3 | ~var4);
      var4 = -592276204;
      var3 = var10004;
      var10004 = (var3 | var4) & (~var3 | ~var4);
      var4 = 1891795377;
      var3 = 1280949523;
      int var10005 = var3 + var4 - 2 * (var3 & var4);
      var4 = -1290197306;
      var3 = var10005;
      var4 = var3 & ~var4 | ~var3 & var4;
      var3 = var10004;
      var10004 = 2 * (var3 | var4) - (var3 ^ var4);
      var4 = -678992471;
      var3 = -890617171;
      var10004 = var3 + var4 - 2 * (var3 & var4);
      var4 = -1092837323;
      var3 = var10004;
      var10004 = var3 & ~var4 | ~var3 & var4;
      String var304 = "CooldownInfo";
      var4 = 1593118228;
      var3 = -1650713013;
      var10005 = var3 & ~var4 | ~var3 & var4;
      var4 = -1036420637;
      var3 = var10005;
      var10005 = (var3 | var4) & ~(var3 & var4);
      int var10006 = (int)7121589721449594514L;
      var4 = -974052231;
      var3 = var10006;
      var10006 = var3 + var4 - 2 * (var3 & var4);
      var4 = -360339598;
      var3 = var10006;
      var10006 = var3 + var4 - 2 * (var3 & var4);
      int var10007 = (int)4088616628954731510L;
      var4 = -1841850710;
      var3 = var10007;
      var10007 = var3 & ~var4 | ~var3 & var4;
      var4 = 1691481568;
      var3 = var10007;
      var4 = var3 & ~var4 | ~var3 & var4;
      var3 = var10006;
      var10006 = (var3 & ~var4) + (var4 & ~var3) + 2 * (var3 & var4);
      var10006 = (int)1088893994461807294L;
      var4 = -2146043359;
      var3 = var10006;
      var10006 = (var3 | var4) - (var3 & var4);
      var4 = 435533076;
      var3 = var10006;
      this.n = a(
         "", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謴㑸\u007f\ua7eb꒺ꁿꥊ絥蹏⑮謣㑾|\ua7e1꒦ꀾ꤬絸蹚⑯謣㑄wꟲ꒡ꁸꤋ統蹯⑶謲㑺w\ua7e8꒡", var10003, var10004, var10005, (var3 | var4) - (var3 & var4)
      );
      String var235 = "ev";
      var4 = -2041710238;
      var3 = -255506590;
      var10003 = (var3 | var4) & (~var3 | ~var4);
      var4 = 1988673037;
      var3 = var10003;
      var10003 = var3 + var4 - 2 * (var3 & var4);
      var4 = -1587941013;
      var3 = 1138507799;
      var10003 = var3 + var4 - 2 * (var3 & var4);
      var4 = -494554768;
      var3 = var10003;
      var10003 = (var3 | var4) - (var3 & var4);
      var10003 = (int)-4333233761253361184L;
      var4 = -1836896552;
      var3 = var10003;
      var10003 = var3 & ~var4 | ~var3 & var4;
      var4 = -784312524;
      var3 = var10003;
      var10003 = var3 & ~var4 | ~var3 & var4;
      var4 = 1550187296;
      var3 = 360572082;
      var10003 = var3 + var4 - 2 * (var3 & var4);
      var4 = 690154387;
      var3 = var10003;
      var10003 = var3 & ~var4 | ~var3 & var4;
      var10004 = (int)-8193292789849234243L;
      var4 = -1144726046;
      var3 = var10004;
      var10004 = var3 & ~var4 | ~var3 & var4;
      var4 = 1380693380;
      var3 = var10004;
      var4 = (var3 | var4) - (var3 & var4);
      var3 = var10003;
      var10003 = (var3 ^ var4) + 2 * (var3 & var4);
      var4 = 2014533758;
      var3 = -1801929238;
      var10003 = (var3 | var4) - (var3 & var4);
      var4 = -608955744;
      var3 = var10003;
      var10003 = (var3 | var4) & (~var3 | ~var4);
      var10004 = (int)1163287444801629117L;
      var4 = -96779817;
      var3 = var10004;
      var10004 = (var3 | var4) & ~(var3 & var4);
      var4 = -1714911402;
      var3 = var10004;
      var10004 = var3 + var4 - 2 * (var3 & var4);
      var4 = -701457037;
      var3 = 1860953973;
      var10004 = (var3 | var4) & (~var3 | ~var4);
      var4 = 461228562;
      var3 = var10004;
      var10004 = var3 & ~var4 | ~var3 & var4;
      var10005 = (int)-5155376300241244318L;
      var4 = 1022576080;
      var3 = var10005;
      var10005 = (var3 | var4) - (var3 & var4);
      var4 = -796646742;
      var3 = var10005;
      var10005 = (var3 | var4) & (~var3 | ~var4);
      var10005 = (int)6660292715590231614L;
      var4 = -1717040053;
      var3 = var10005;
      var10005 = (var3 | var4) & (~var3 | ~var4);
      var4 = 1804204237;
      var3 = var10005;
      var10005 = var3 + var4 - 2 * (var3 & var4);
      var4 = -362768110;
      var3 = 1577629930;
      var10007 = var3 + var4 - 2 * (var3 & var4);
      var4 = -1268243981;
      var3 = var10007;
      var10007 = (var3 | var4) & (~var3 | ~var4);
      var10007 = (int)7563768310882377850L;
      var4 = 1172843525;
      var3 = var10007;
      var10007 = (var3 | var4) & (~var3 | ~var4);
      var4 = 6818928;
      var3 = var10007;
      var10007 = (var3 | var4) & (~var3 | ~var4);
      var10007 = (int)-4133100642926287918L;
      var4 = 1723971808;
      var3 = var10007;
      var10007 = (var3 | var4) & (~var3 | ~var4);
      var4 = 1672551216;
      var3 = var10007;
      var10007 = (var3 | var4) - (var3 & var4);
      var10006 = (int)2509143610848673157L;
      var4 = 767877583;
      var3 = var10006;
      var10006 = var3 + var4 - 2 * (var3 & var4);
      var4 = -1025562076;
      var3 = var10006;
      this.o = a(
         "",
         "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謴㑸\u007f\ua7eb꒺ꁿꥊ絥蹏⑮謣㑾|\ua7e1꒦ꀾ꤬絸蹚⑯謣㑄wꟲ꒡ꁸꤋ統蹯⑶謲㑺w\ua7e8꒡",
         var10003,
         var10004,
         var10005,
         (var3 | var4) & ~(var3 & var4)
      );
      var4 = 1181156804;
      var3 = 453192693;
      var10001 = var3 & ~var4 | ~var3 & var4;
      var4 = 1566846513;
      var3 = var10001;
      this.q = pulse.Bool.from((var3 | var4) - (var3 & var4));
      var10001 = (int)-7855119661786709420L;
      var4 = -1899036956;
      var3 = var10001;
      var10001 = var3 & ~var4 | ~var3 & var4;
      var4 = -1513440080;
      var3 = var10001;
      this.r = (var3 | var4) & ~(var3 & var4);
      var4 = 171882143;
      var3 = 297697508;
      var10001 = (var3 | var4) & ~(var3 & var4);
      var4 = -461387388;
      var3 = var10001;
      this.s = var3 + var4 - 2 * (var3 & var4);
      var10001 = (int)-8014215290516561151L;
      var4 = 1118980035;
      var3 = var10001;
      var10001 = (var3 | var4) - (var3 & var4);
      var4 = 973871933;
      var3 = var10001;
      this.t = (var3 | var4) - (var3 & var4);
      this.u = new pulse.AnimationState();
      this.v = new pulse.AnimationState();
      this.w = new pulse.AnimationState();
      this.x = new pulse.AnimationState();
      this.y = new MarqueeText();
      var4 = -1770860342;
      var3 = 310612413;
      var10001 = (var3 | var4) & (~var3 | ~var4);
      var4 = -2064563849;
      var3 = var10001;
      this.z = pulse.Bool.from((var3 | var4) & ~(var3 & var4));
      var10001 = (int)7243570261290517489L;
      var4 = 932187056;
      var3 = var10001;
      var10001 = (var3 | var4) & (~var3 | ~var4);
      var4 = 2120091712;
      var3 = var10001;
      this.A = pulse.Bool.from((var3 | var4) & ~(var3 & var4));
      this.E = 1.0F;
      var4 = -1662419442;
      var3 = -765656728;
      int var10002 = var3 & ~var4 | ~var3 & var4;
      var4 = 1320451943;
      var3 = var10002;
      var10002 = (var3 | var4) - (var3 & var4);
      var10002 = (int)-4883412724812904541L;
      var4 = -1171927443;
      var3 = var10002;
      var10002 = (var3 | var4) & ~(var3 & var4);
      var4 = -897678044;
      var3 = var10002;
      var10002 = (var3 | var4) & ~(var3 & var4);
      var4 = 747973936;
      var3 = 960807876;
      var10003 = var3 + var4 - 2 * (var3 & var4);
      var4 = 1187126177;
      var3 = var10003;
      var4 = var3 & ~var4 | ~var3 & var4;
      var3 = var10002;
      var10002 = (var3 & ~var4) + (var4 & ~var3) + 2 * (var3 & var4);
      var10003 = (int)-3394671319285446295L;
      var4 = -1220772032;
      var3 = var10003;
      var10003 = (var3 | var4) - (var3 & var4);
      var4 = -1026515636;
      var3 = var10003;
      var10003 = ((var3 | var4) & ~(var3 & var4)) * ((var3 | var4) & ~(var3 & var4));
      var4 = -693231852;
      var3 = 1689390331;
      var10003 = (var3 | var4) & ~(var3 & var4);
      var4 = -2061245221;
      var3 = var10003;
      var10003 = (var3 | var4) & (~var3 | ~var4);
      var10005 = (int)-5588574289458992203L;
      var4 = -1113941307;
      var3 = var10005;
      var10005 = var3 & ~var4 | ~var3 & var4;
      var4 = -1368329857;
      var3 = var10005;
      var10005 = (var3 | var4) & (~var3 | ~var4);
      var4 = -1519637027;
      var3 = -1807562523;
      var10004 = (var3 | var4) - (var3 & var4);
      var4 = -1832470149;
      var3 = var10004;
      var10004 = (var3 | var4) - (var3 & var4);
      var4 = 103721005;
      var3 = 1240096877;
      var10006 = (var3 | var4) - (var3 & var4);
      var4 = 1338296397;
      var3 = var10006;
      var10006 = var3 & ~var4 | ~var3 & var4;
      var10006 = (int)9061468102092853702L;
      var4 = -1253963495;
      var3 = var10006;
      var10006 = (var3 | var4) & (~var3 | ~var4);
      var4 = 495261905;
      var3 = var10006;
      var10006 = (var3 | var4) - (var3 & var4);
      var10006 = (int)-8980059272480293664L;
      var4 = 1703675865;
      var3 = var10006;
      var10006 = var3 & ~var4 | ~var3 & var4;
      var4 = -329778379;
      var3 = var10006;
      var10006 = var3 + var4 - 2 * (var3 & var4);
      var4 = 1296462738;
      var3 = -110814883;
      var10006 = (var3 | var4) & ~(var3 & var4);
      var4 = -1272747320;
      var3 = var10006;
      var10006 = var3 + var4 - 2 * (var3 & var4);
      var10005 = (int)5891908343724809825L;
      var4 = -356814310;
      var3 = var10005;
      var10005 = var3 + var4 - 2 * (var3 & var4);
      var4 = -389870916;
      var3 = var10005;
      var10005 = (var3 | var4) - (var3 & var4);
      var10007 = (int)7173164445192222983L;
      var4 = -521422618;
      var3 = var10007;
      var10007 = (var3 | var4) & ~(var3 & var4);
      var4 = 802111973;
      var3 = var10007;
      var10007 = (var3 | var4) & ~(var3 & var4);
      var4 = -763382654;
      var3 = -1108862328;
      var10007 = (var3 | var4) & (~var3 | ~var4);
      var4 = 1872211470;
      var3 = var10007;
      var10007 = (var3 | var4) - (var3 & var4);
      var4 = 1580192647;
      var3 = 390985449;
      var10007 = var3 + var4 - 2 * (var3 & var4);
      var4 = 1231168879;
      var3 = var10007;
      var10007 = (var3 | var4) & ~(var3 & var4);
      var4 = -960003702;
      var3 = 833920440;
      var10007 = (var3 | var4) - (var3 & var4);
      var4 = -143451075;
      var3 = var10007;
      var10007 = (var3 | var4) & (~var3 | ~var4);
      var10007 = (int)8220505166719974715L;
      var4 = 215877644;
      var3 = var10007;
      var10007 = var3 & ~var4 | ~var3 & var4;
      var4 = 742749477;
      var3 = var10007;
      var10007 = var3 & ~var4 | ~var3 & var4;
      var4 = 149544884;
      var3 = 1825015604;
      var10006 = (var3 | var4) & (~var3 | ~var4);
      var4 = 1684290077;
      var3 = var10006;
      this.G = a(
         "", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謴㑸\u007f\ua7eb꒺ꁿꥊ絥蹏⑮謣㑾|\ua7e1꒦ꀾ꤬絸蹚⑯謣㑄wꟲ꒡ꁸꤋ統蹯⑶謲㑺w\ua7e8꒡", var10003, var10004, var10005, (var3 | var4) - (var3 & var4)
      );
      this.p = null;
      this.l = var1;
      this.m = var2;
      this.w.d(1.0);
      var10001 = (int)8806725883860702201L;
      var4 = -1373405269;
      var3 = var10001;
      var10001 = (var3 | var4) & ~(var3 & var4);
      var4 = 1388164719;
      var3 = var10001;
      var10001 = (var3 + var4 - 2 * (var3 & var4)) * (var3 + var4 - 2 * (var3 & var4));
      this.F = 40.0F;
      var10001 = (int)7354297398502268330L;
      var4 = 1400720175;
      var3 = var10001;
      var10001 = var3 + var4 - 2 * (var3 & var4);
      var4 = -1844473769;
      var3 = var10001;
      var10001 = (var3 | var4) - (var3 & var4);
      this.x.d(40.0);
      d.add(this);
   }

   public TokenSettingWidget(String var1, TokenSettingWidget.ValueType var2, String var3) {
      this(var1, var2);
      this.o = var3;
   }

   public TokenSettingWidget(String var1, TokenSettingWidget.ValueType var2, String var3, String var4) {
      this(var1, var2, var4);
      this.a(var3);
   }

   @Override
   public String a() {
      return this.l;
   }

   @Override
   public float b() {
      int var2 = -737825373;
      int var1 = 492783624;
      int var10000 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1999636864;
      var1 = var10000;
      var10000 = var1 & ~var2 | ~var1 & var2;
      int var10001 = (int)-6454979783366767110L;
      var2 = 22695552;
      var1 = var10001;
      var10001 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1577084852;
      var1 = var10001;
      var2 = (var1 | var2) - (var1 & var2);
      var1 = var10000;
      var10000 = 2 * (var1 | var2) - (var1 ^ var2);
      return 20.0F;
   }

   public TokenSettingWidget.ValueType c() {
      return this.m;
   }

   public String e() {
      return this.n;
   }

   public String f() {
      switch (this.m) {
         case COMMAND:
            String var1 = this.n;
            StringBuilder var105 = new StringBuilder();
            String var109 = "EntityUtils";
            int var114 = (int)-3786142923235864466L;
            int var78 = -152630688;
            int var28 = var114;
            var114 = (var28 | var78) & ~(var28 & var78);
            var78 = -2025812552;
            var28 = var114;
            var114 = (var28 | var78) - (var28 & var78);
            var78 = -623634508;
            var28 = -481204493;
            int var121 = (var28 | var78) - (var28 & var78);
            var78 = 1619246927;
            var28 = var121;
            var78 = (var28 | var78) - (var28 & var78);
            var28 = var114;
            var114 = (var28 & ~var78) + (var78 & ~var28) + 2 * (var28 & var78);
            var121 = (int)-3025304727302099741L;
            var78 = -1947056756;
            var28 = var121;
            var121 = (var28 | var78) & (~var28 | ~var78);
            var78 = -439826973;
            var28 = var121;
            var121 = (var28 + var78 - 2 * (var28 & var78)) * (var28 + var78 - 2 * (var28 & var78));
            var121 = (int)-5461504251790106070L;
            var78 = 1760354076;
            var28 = var121;
            var121 = (var28 | var78) - (var28 & var78);
            var78 = -485438974;
            var28 = var121;
            var121 = (var28 | var78) & (~var28 | ~var78);
            var78 = 1275468405;
            var28 = 1479861039;
            int var133 = (var28 | var78) - (var28 & var78);
            var78 = 199275324;
            var28 = var133;
            var133 = (var28 & ~var78 | ~var28 & var78) * (var28 & ~var78 | ~var28 & var78);
            var78 = -819903745;
            var28 = -2053760527;
            var133 = var28 + var78 - 2 * (var28 & var78);
            var78 = -1735987401;
            var28 = var133;
            var133 = (var28 | var78) - (var28 & var78);
            var78 = 306455339;
            var28 = -1763629297;
            int var148 = var28 & ~var78 | ~var28 & var78;
            var78 = -2069560273;
            var28 = var148;
            var148 = var28 & ~var78 | ~var28 & var78;
            var78 = 866749037;
            var28 = -1440679201;
            var148 = (var28 | var78) - (var28 & var78);
            var78 = -1719045984;
            var28 = var148;
            var148 = (var28 | var78) & (~var28 | ~var78);
            int var139 = (int)-2863871856733669542L;
            var78 = 357249398;
            var28 = var139;
            var139 = (var28 | var78) - (var28 & var78);
            var78 = 1508609993;
            var28 = var139;
            var139 = var28 & ~var78 | ~var28 & var78;
            int var10007 = (int)-6462812555144489998L;
            var78 = -1561967414;
            var28 = var10007;
            var10007 = var28 & ~var78 | ~var28 & var78;
            var78 = 1514919720;
            var28 = var10007;
            var10007 = var28 + var78 - 2 * (var28 & var78);
            var78 = -1438423506;
            var28 = 1966874039;
            var10007 = (var28 | var78) - (var28 & var78);
            var78 = -545293412;
            var28 = var10007;
            var10007 = (var28 | var78) & ~(var28 & var78);
            var10007 = (int)5191369083678375032L;
            var78 = -1298581834;
            var28 = var10007;
            var10007 = var28 + var78 - 2 * (var28 & var78);
            var78 = -2147415355;
            var28 = var10007;
            var10007 = var28 & ~var78 | ~var28 & var78;
            var148 = (int)7842371659949300592L;
            var78 = 1596807965;
            var28 = var148;
            var148 = var28 & ~var78 | ~var28 & var78;
            var78 = 83069940;
            var28 = var148;
            return var105.append(
                  a(
                     "왷",
                     "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謴㑸\u007f\ua7eb꒺ꁿꥊ絥蹏⑮謣㑾|\ua7e1꒦ꀾ꤬絸蹚⑯謣㑄wꟲ꒡ꁸꤋ統蹯⑶謲㑺w\ua7e8꒡",
                     var121,
                     var133,
                     var139,
                     (var28 | var78) & (~var28 | ~var78)
                  )
               )
               .append(var1)
               .toString();
         case PRICE:
            String var2 = this.n;
            StringBuilder var10000 = new StringBuilder();
            int var10001 = (int)-5932447961131322459L;
            int var4 = -2124260600;
            int var3 = var10001;
            var10001 = var3 + var4 - 2 * (var3 & var4);
            var4 = 1797080971;
            var3 = var10001;
            var10001 = (var3 | var4) - (var3 & var4);
            int var10002 = (int)-3040767577129907893L;
            var4 = 65503563;
            var3 = var10002;
            var10002 = var3 + var4 - 2 * (var3 & var4);
            var4 = -1169733800;
            var3 = var10002;
            var4 = var3 & ~var4 | ~var3 & var4;
            var3 = var10001;
            var10001 = 2 * (var3 | var4) - (var3 ^ var4);
            var10002 = (int)1226241282252411864L;
            var4 = 1200837406;
            var3 = var10002;
            var10002 = var3 & ~var4 | ~var3 & var4;
            var4 = -593057068;
            var3 = var10002;
            var10002 = (var3 | var4) & ~(var3 & var4);
            String var10003 = "ex";
            int var118 = (int)-5458929852648984006L;
            var4 = 345283633;
            var3 = var118;
            int var119 = var3 & ~var4 | ~var3 & var4;
            var4 = -1665164993;
            var3 = var119;
            int var120 = (var3 | var4) & ~(var3 & var4);
            var4 = 169525815;
            var3 = -830427395;
            int var10004 = (var3 | var4) & (~var3 | ~var4);
            var4 = -2084331513;
            var3 = var10004;
            var10004 = (var3 | var4) & ~(var3 & var4);
            var4 = 1558973135;
            var3 = 1545983604;
            int var10005 = var3 & ~var4 | ~var3 & var4;
            var4 = -2064316642;
            var3 = var10005;
            var4 = (var3 | var4) & (~var3 | ~var4);
            var3 = var10004;
            var10004 = (var3 ^ var4) + 2 * (var3 & var4);
            var10004 = (int)-4310805897401640463L;
            var4 = -1652382200;
            var3 = var10004;
            var10004 = (var3 | var4) - (var3 & var4);
            var4 = 1919726587;
            var3 = var10004;
            var10004 = var3 + var4 - 2 * (var3 & var4);
            var4 = -657274417;
            var3 = -2050972272;
            int var10006 = (var3 | var4) & ~(var3 & var4);
            var4 = 1561488476;
            var3 = var10006;
            var10006 = (var3 | var4) & (~var3 | ~var4);
            var4 = -200031690;
            var3 = 2062985471;
            var10005 = var3 + var4 - 2 * (var3 & var4);
            var4 = -1818810332;
            var3 = var10005;
            var10005 = var3 & ~var4 | ~var3 & var4;
            var10006 = (int)7460664901784214581L;
            var4 = 39448742;
            var3 = var10006;
            var10006 = (var3 | var4) & ~(var3 & var4);
            var4 = 1824508614;
            var3 = var10006;
            var10006 = ((var3 | var4) & ~(var3 & var4)) * ((var3 | var4) & ~(var3 & var4));
            var10006 = (int)-7660754709300057949L;
            var4 = 2141516454;
            var3 = var10006;
            var10006 = (var3 | var4) & (~var3 | ~var4);
            var4 = 1464351079;
            var3 = var10006;
            return var10000.append(
                  a(
                     "왼",
                     "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謴㑸\u007f\ua7eb꒺ꁿꥊ絥蹏⑮謣㑾|\ua7e1꒦ꀾ꤬絸蹚⑯謣㑄wꟲ꒡ꁸꤋ統蹯⑶謲㑺w\ua7e8꒡",
                     var120,
                     var10004,
                     var10005,
                     var3 + var4 - 2 * (var3 & var4)
                  )
               )
               .append(var2)
               .toString();
         default:
            return this.n;
      }
   }

   public String g() {
      if (this.m != pulse.TokenSettingWidget.ValueType.PRICE) {
         return this.n;
      }

      String var10000 = this.n;
      int var10001 = (int)-2594209827288794994L;
      int var2 = -494653621;
      int var1 = var10001;
      var10001 = var1 + var2 - 2 * (var1 & var2);
      var2 = 718457898;
      var1 = var10001;
      var10001 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1717572860;
      var1 = -918454992;
      int var10002 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1099020424;
      var1 = var10002;
      var10002 = var1 & ~var2 | ~var1 & var2;
      int var10003 = (int)-7220046788478937419L;
      var2 = -44261524;
      var1 = var10003;
      var10003 = (var1 | var2) & (~var1 | ~var2);
      var2 = 643649201;
      var1 = var10003;
      var2 = var1 & ~var2 | ~var1 & var2;
      var1 = var10002;
      var10002 = (var1 | var2) + (var1 & var2);
      var10003 = (int)-3640608578094628692L;
      var2 = 637691134;
      var1 = var10003;
      var10003 = (var1 | var2) - (var1 & var2);
      var2 = 465855031;
      var1 = var10003;
      var10003 = var1 + var2 - 2 * (var1 & var2);
      var10003 = (int)2269159374015928636L;
      var2 = -1951313157;
      var1 = var10003;
      var10003 = var1 + var2 - 2 * (var1 & var2);
      var2 = 645479667;
      var1 = var10003;
      var10003 = var1 + var2 - 2 * (var1 & var2);
      var2 = 653892950;
      var1 = 277809462;
      int var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = 913740904;
      var1 = var10005;
      var10005 = (var1 | var2) - (var1 & var2);
      var2 = -1266831757;
      var1 = -1550709126;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = 401580043;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1433997753;
      var1 = -1024246961;
      var10005 = (var1 | var2) - (var1 & var2);
      var2 = -1752552716;
      var1 = var10005;
      var10005 = (var1 | var2) - (var1 & var2);
      var2 = -373238707;
      var1 = 1893963064;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = -1725742734;
      var1 = var10005;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      int var10004 = (int)-469827674960421007L;
      var2 = 800469860;
      var1 = var10004;
      var10004 = var1 + var2 - 2 * (var1 & var2);
      var2 = -715461207;
      var1 = var10004;
      var10004 = var1 + var2 - 2 * (var1 & var2);
      var10005 = (int)8010781595719628557L;
      var2 = 945076012;
      var1 = var10005;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = 819265875;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      int var10006 = (int)1681023985818118353L;
      var2 = 192473312;
      var1 = var10006;
      var10006 = (var1 | var2) - (var1 & var2);
      var2 = 1505117228;
      var1 = var10006;
      var2 = (var1 | var2) & (~var1 | ~var2);
      var1 = var10005;
      var10005 = 2 * (var1 | var2) - (var1 ^ var2);
      var2 = -1751045871;
      var1 = -844014244;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1161025969;
      var1 = var10005;
      var10005 = (var1 | var2) - (var1 & var2);
      var10006 = (int)-97483010453904783L;
      var2 = -279040337;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var2 = -2078628529;
      var1 = var10006;
      var10006 = (var1 | var2) - (var1 & var2);
      var10006 = (int)-7726759881075038015L;
      var2 = -455777739;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var2 = 1667214110;
      var1 = var10006;
      String var133 = a(
         "\udf86",
         "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謴㑸\u007f\ua7eb꒺ꁿꥊ絥蹏⑮謣㑾|\ua7e1꒦ꀾ꤬絸蹚⑯謣㑄wꟲ꒡ꁸꤋ統蹯⑶謲㑺w\ua7e8꒡",
         var10003,
         var10004,
         var10005,
         (var1 | var2) & (~var1 | ~var2)
      );
      var2 = 2036787145;
      var1 = -2066895262;
      var10002 = (var1 | var2) & ~(var1 & var2);
      var2 = -830457556;
      var1 = var10002;
      var10002 = var1 & ~var2 | ~var1 & var2;
      var2 = -1056616197;
      var1 = 704597720;
      var10003 = (var1 | var2) & (~var1 | ~var2);
      var2 = -811385479;
      var1 = var10003;
      var10003 = (var1 + var2 - 2 * (var1 & var2)) * (var1 + var2 - 2 * (var1 & var2));
      var2 = 1071770246;
      var1 = 2044419271;
      var10004 = (var1 | var2) - (var1 & var2);
      var2 = 906663641;
      var1 = var10004;
      var10004 = (var1 | var2) - (var1 & var2);
      var2 = 1004102067;
      var1 = -1473102875;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = -887206348;
      var1 = var10005;
      var2 = var1 + var2 - 2 * (var1 & var2);
      var1 = var10004;
      var10004 = var1 - ~var2 - 1;
      var2 = -1664231093;
      var1 = 784879967;
      var10004 = (var1 | var2) - (var1 & var2);
      var2 = -2059763936;
      var1 = var10004;
      var10004 = var1 + var2 - 2 * (var1 & var2);
      var10006 = (int)-3526063165391713060L;
      var2 = 1610459387;
      var1 = var10006;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var2 = -54434775;
      var1 = var10006;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1428390064;
      var1 = 1070537340;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1793891011;
      var1 = var10006;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var10006 = (int)8224627910150339124L;
      var2 = -28148440;
      var1 = var10006;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var2 = -602650860;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var10006 = (int)-2564082928890160644L;
      var2 = 1892133422;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var2 = 941388765;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var10005 = (int)-6408062487649874495L;
      var2 = 134652997;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1747322851;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      int var10007 = (int)-1491133589040030726L;
      var2 = 1513310555;
      var1 = var10007;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var2 = -357641550;
      var1 = var10007;
      var10007 = (var1 | var2) & (~var1 | ~var2);
      var10007 = (int)-1415996755737796170L;
      var2 = 853278375;
      var1 = var10007;
      var10007 = (var1 | var2) - (var1 & var2);
      var2 = -1040228589;
      var1 = var10007;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      var10007 = (int)-4530798587206759740L;
      var2 = -1676895208;
      var1 = var10007;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var2 = 817862349;
      var1 = var10007;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var2 = 593780898;
      var1 = -395895689;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var2 = -343223562;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var10007 = (int)-3802034892916910494L;
      var2 = 1450689603;
      var1 = var10007;
      var10007 = (var1 | var2) & (~var1 | ~var2);
      var2 = 180106768;
      var1 = var10007;
      var10007 = ((var1 | var2) - (var1 & var2)) * ((var1 | var2) - (var1 & var2));
      var2 = 573573648;
      var1 = -1524384255;
      var10007 = (var1 | var2) & ~(var1 & var2);
      var2 = -2024077866;
      var1 = var10007;
      return var10000.replace(
         var133,
         a(
            "",
            "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謴㑸\u007f\ua7eb꒺ꁿꥊ絥蹏⑮謣㑾|\ua7e1꒦ꀾ꤬絸蹚⑯謣㑄wꟲ꒡ꁸꤋ統蹯⑶謲㑺w\ua7e8꒡",
            var10004,
            var10005,
            var10006,
            (var1 | var2) & (~var1 | ~var2)
         )
      );
   }

   public int h() {
      if (this.m != pulse.TokenSettingWidget.ValueType.INT) {
         if (this.m != pulse.TokenSettingWidget.ValueType.PRICE) {
            int var96 = 1049623938;
            int var50 = 1333073067;
            int var101 = (var50 | var96) - (var50 & var96);
            var96 = 1912269097;
            var50 = var101;
            return (var50 | var96) & ~(var50 & var96);
         }

         try {
            String var100 = this.n;
            int var55 = 535441670;
            int var9 = 1374497961;
            int var10001 = (var9 | var55) & (~var9 | ~var55);
            var55 = -1000407107;
            var9 = var10001;
            var10001 = (var9 & ~var55 | ~var9 & var55) * (var9 & ~var55 | ~var9 & var55);
            var55 = 541473897;
            var9 = 882629876;
            int var10003 = (var9 | var55) - (var9 & var55);
            var55 = 350085260;
            var9 = var10003;
            var10003 = (var9 | var55) - (var9 & var55);
            var55 = -1003791330;
            var9 = 1046668291;
            var10003 = var9 + var55 - 2 * (var9 & var55);
            var55 = -95832050;
            var9 = var10003;
            var10003 = (var9 | var55) - (var9 & var55);
            var55 = -1085748475;
            var9 = -1806691571;
            var10003 = (var9 | var55) - (var9 & var55);
            var55 = 1027905725;
            var9 = var10003;
            var10003 = (var9 | var55) - (var9 & var55);
            var10003 = (int)-203263298434747433L;
            var55 = 1593141039;
            var9 = var10003;
            var10003 = var9 & ~var55 | ~var9 & var55;
            var55 = 220636108;
            var9 = var10003;
            var10003 = (var9 | var55) & ~(var9 & var55);
            var55 = 1884376342;
            var9 = -1648574910;
            int var10004 = (var9 | var55) - (var9 & var55);
            var55 = 1752135343;
            var9 = var10004;
            var10004 = (var9 | var55) & ~(var9 & var55);
            var55 = -1514438381;
            var9 = -820066826;
            var10004 = var9 & ~var55 | ~var9 & var55;
            var55 = -1104665164;
            var9 = var10004;
            var10004 = (var9 | var55) & ~(var9 & var55);
            var55 = -1824442323;
            var9 = -3086872;
            int var10005 = (var9 | var55) - (var9 & var55);
            var55 = 722457944;
            var9 = var10005;
            var10005 = ((var9 | var55) & ~(var9 & var55)) * ((var9 | var55) & ~(var9 & var55));
            var10005 = (int)-2455906931783787485L;
            var55 = 1311545410;
            var9 = var10005;
            var10005 = (var9 | var55) & ~(var9 & var55);
            var55 = 1042301563;
            var9 = var10005;
            var10005 = var9 + var55 - 2 * (var9 & var55);
            String var10006 = "ResourceTextReader";
            var55 = 424709711;
            var9 = 1967620739;
            int var133 = var9 & ~var55 | ~var9 & var55;
            var55 = 1817807145;
            var9 = var133;
            String var103 = a(
               "ጠ",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謴㑸\u007f\ua7eb꒺ꁿꥊ絥蹏⑮謣㑾|\ua7e1꒦ꀾ꤬絸蹚⑯謣㑄wꟲ꒡ꁸꤋ統蹯⑶謲㑺w\ua7e8꒡",
               var10003,
               var10004,
               var10005,
               var9 & ~var55 | ~var9 & var55
            );
            String var10002 = "InventoryFinder";
            var55 = -1337751100;
            var9 = 2114480893;
            var10004 = var9 + var55 - 2 * (var9 & var55);
            var55 = -833887437;
            var9 = var10004;
            var10004 = var9 & ~var55 | ~var9 & var55;
            var10004 = (int)-967010371286340790L;
            var55 = -67806823;
            var9 = var10004;
            var10004 = (var9 | var55) - (var9 & var55);
            var55 = 783200981;
            var9 = var10004;
            var10004 = var9 & ~var55 | ~var9 & var55;
            var10004 = (int)-8932356916001524146L;
            var55 = 891546671;
            var9 = var10004;
            var10004 = (var9 | var55) & (~var9 | ~var55);
            var55 = -61845759;
            var9 = var10004;
            var10004 = var9 + var55 - 2 * (var9 & var55);
            var55 = -1643767156;
            var9 = 1696300937;
            var10004 = var9 + var55 - 2 * (var9 & var55);
            var55 = -870149583;
            var9 = var10004;
            var10004 = var9 + var55 - 2 * (var9 & var55);
            String var129 = "fa";
            var10005 = (int)-5065939822827420645L;
            var55 = -97510072;
            var9 = var10005;
            var10005 = var9 & ~var55 | ~var9 & var55;
            var55 = 2025128318;
            var9 = var10005;
            var10005 = (var9 | var55) & (~var9 | ~var55);
            int var134 = (int)-9174351112836233409L;
            var55 = 1465663809;
            var9 = var134;
            int var135 = (var9 | var55) - (var9 & var55);
            var55 = 1320541942;
            var9 = var135;
            int var136 = var9 & ~var55 | ~var9 & var55;
            int var137 = (int)-457323347617647286L;
            var55 = -700464182;
            var9 = var137;
            int var138 = (var9 | var55) & ~(var9 & var55);
            var55 = 1139301026;
            var9 = var138;
            int var139 = (var9 | var55) - (var9 & var55);
            var55 = 659977046;
            var9 = 346369645;
            int var10007 = var9 & ~var55 | ~var9 & var55;
            var55 = -1328073145;
            var9 = var10007;
            var10007 = (var9 | var55) & (~var9 | ~var55);
            int var10008 = (int)-8792102032819899924L;
            var55 = -1101353080;
            var9 = var10008;
            var10008 = var9 + var55 - 2 * (var9 & var55);
            var55 = -997260262;
            var9 = var10008;
            var55 = var9 + var55 - 2 * (var9 & var55);
            var9 = var10007;
            var10007 = (var9 | var55) + (var9 & var55);
            var10007 = (int)-3842982565962337015L;
            var55 = 1473987940;
            var9 = var10007;
            var10007 = (var9 | var55) & ~(var9 & var55);
            var55 = -905376596;
            var9 = var10007;
            return Integer.parseInt(
               var100.replace(
                  var103,
                  a(
                     "",
                     "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謴㑸\u007f\ua7eb꒺ꁿꥊ絥蹏⑮謣㑾|\ua7e1꒦ꀾ꤬絸蹚⑯謣㑄wꟲ꒡ꁸꤋ統蹯⑶謲㑺w\ua7e8꒡",
                     var10004,
                     var10005,
                     var139,
                     var9 & ~var55 | ~var9 & var55
                  )
               )
            );
         } catch (NumberFormatException var4) {
            int var98 = (int)-390888413288713559L;
            int var53 = 882566026;
            int var7 = var98;
            var98 = (var7 | var53) & (~var7 | ~var53);
            var53 = 394711331;
            var7 = var98;
            return var7 & ~var53 | ~var7 & var53;
         }
      } else {
         try {
            return Integer.parseInt(this.n);
         } catch (NumberFormatException var5) {
            int var3 = 1902039092;
            int var2 = -1814595888;
            int var10000 = (var2 | var3) & (~var2 | ~var3);
            var3 = -494295324;
            var2 = var10000;
            return var2 + var3 - 2 * (var2 & var3);
         }
      }
   }

   public void a(String var1) {
      if (var1 == null) {
         int var8 = 1050869416;
         int var7 = -1495231910;
         int var10000 = (var7 | var8) - (var7 & var8);
         var8 = -400393650;
         var7 = var10000;
         var10000 = ((var7 | var8) & ~(var7 & var8)) * ((var7 | var8) & ~(var7 & var8));
         int var10001 = (int)1908848290156136079L;
         var8 = 1395230425;
         var7 = var10001;
         var10001 = (var7 | var8) & ~(var7 & var8);
         var8 = -1971218097;
         var7 = var10001;
         var10001 = (var7 | var8) & ~(var7 & var8);
         var8 = -973777086;
         var7 = 1528169243;
         int var10002 = var7 + var8 - 2 * (var7 & var8);
         var8 = 186851500;
         var7 = var10002;
         var10002 = (var7 & ~var8 | ~var7 & var8) * (var7 & ~var8 | ~var7 & var8);
         var10002 = (int)-2047925320901724342L;
         var8 = 748677689;
         var7 = var10002;
         var10002 = (var7 | var8) - (var7 & var8);
         var8 = 2059397703;
         var7 = var10002;
         var10002 = (var7 | var8) - (var7 & var8);
         var8 = 1954230719;
         var7 = -932738267;
         int var10003 = (var7 | var8) & (~var7 | ~var8);
         var8 = -2103661954;
         var7 = var10003;
         var10003 = (var7 | var8) & (~var7 | ~var8);
         var8 = 812518315;
         var7 = -1694341745;
         int var10004 = (var7 | var8) - (var7 & var8);
         var8 = 635225614;
         var7 = var10004;
         var8 = var7 + var8 - 2 * (var7 & var8);
         var7 = var10003;
         var10003 = 2 * (var7 | var8) - (var7 ^ var8);
         var8 = 1707052569;
         var7 = 1045409486;
         var10003 = (var7 | var8) & (~var7 | ~var8);
         var8 = -795791130;
         var7 = var10003;
         var10003 = var7 & ~var8 | ~var7 & var8;
         int var10005 = (int)-317590233752972583L;
         var8 = 1793736811;
         var7 = var10005;
         var10005 = (var7 | var8) & (~var7 | ~var8);
         var8 = 535761595;
         var7 = var10005;
         var10005 = (var7 | var8) - (var7 & var8);
         var10005 = (int)3300649659702409133L;
         var8 = 1455037428;
         var7 = var10005;
         var10005 = (var7 | var8) & (~var7 | ~var8);
         var8 = -399938479;
         var7 = var10005;
         var10005 = (var7 | var8) - (var7 & var8);
         var8 = 1240331048;
         var7 = 513205373;
         var10005 = var7 & ~var8 | ~var7 & var8;
         var8 = 1467684677;
         var7 = var10005;
         var10005 = var7 & ~var8 | ~var7 & var8;
         var8 = -232386342;
         var7 = 321641953;
         var10005 = var7 & ~var8 | ~var7 & var8;
         var8 = -519189206;
         var7 = var10005;
         var10005 = (var7 | var8) - (var7 & var8);
         var10004 = (int)-4925566882330707445L;
         var8 = 91471156;
         var7 = var10004;
         var10004 = var7 + var8 - 2 * (var7 & var8);
         var8 = 1702671519;
         var7 = var10004;
         var10004 = (var7 | var8) & (~var7 | ~var8);
         var8 = 1902749798;
         var7 = 479190568;
         var10005 = (var7 | var8) & ~(var7 & var8);
         var8 = 528845523;
         var7 = var10005;
         var10005 = (var7 + var8 - 2 * (var7 & var8)) * (var7 + var8 - 2 * (var7 & var8));
         var8 = -1557564672;
         var7 = -1126623416;
         var10005 = var7 + var8 - 2 * (var7 & var8);
         var8 = 532193926;
         var7 = var10005;
         var1 = a(
            "",
            "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謴㑸\u007f\ua7eb꒺ꁿꥊ絥蹏⑮謣㑾|\ua7e1꒦ꀾ꤬絸蹚⑯謣㑄wꟲ꒡ꁸꤋ統蹯⑶謲㑺w\ua7e8꒡",
            var10002,
            var10003,
            var10004,
            var7 & ~var8 | ~var7 & var8
         );
      }

      StringBuilder var2 = new StringBuilder();
      char[] var3 = var1.toCharArray();
      int var4 = var3.length;
      int var108 = -1140737177;
      int var37 = -1537070600;
      int var152 = (var37 | var108) - (var37 & var108);
      var108 = 409178783;
      var37 = var152;

      for (int var5 = var37 + var108 - 2 * (var37 & var108); var5 < var4; var5++) {
         char var6 = var3[var5];
         if (this.b(var6, var2.length())) {
            var2.append(var6);
         }
      }

      this.n = var2.toString();
      if (this.m == pulse.TokenSettingWidget.ValueType.PRICE) {
         String var159 = this.n;
         int var164 = (int)-2318232376654823700L;
         var108 = 1739407344;
         var37 = var164;
         var164 = var37 & ~var108 | ~var37 & var108;
         var108 = -138028303;
         var37 = var164;
         var164 = (var37 | var108) & ~(var37 & var108);
         int var186 = (int)-4070153996276379759L;
         var108 = -1490301631;
         var37 = var186;
         var186 = var37 & ~var108 | ~var37 & var108;
         var108 = -505118014;
         var37 = var186;
         var186 = var37 + var108 - 2 * (var37 & var108);
         var108 = 1107969016;
         var37 = 277769815;
         var186 = var37 + var108 - 2 * (var37 & var108);
         var108 = -1973838582;
         var37 = var186;
         var186 = ((var37 | var108) & (~var37 | ~var108)) * ((var37 | var108) & (~var37 | ~var108));
         var186 = (int)-1570211636191581810L;
         var108 = 1473672741;
         var37 = var186;
         var186 = var37 & ~var108 | ~var37 & var108;
         var108 = 1920215199;
         var37 = var186;
         var186 = (var37 | var108) - (var37 & var108);
         String var10006 = "fb";
         int var194 = (int)-7748235645377835880L;
         var108 = -1444611724;
         var37 = var194;
         int var195 = var37 + var108 - 2 * (var37 & var108);
         var108 = -1544844672;
         var37 = var195;
         int var196 = var37 & ~var108 | ~var37 & var108;
         var108 = -946757010;
         var37 = -1560617980;
         int var10007 = var37 + var108 - 2 * (var37 & var108);
         var108 = -1141744396;
         var37 = var10007;
         var10007 = (var37 | var108) & ~(var37 & var108);
         var108 = 1880517574;
         var37 = 1219265149;
         int var10008 = (var37 | var108) & (~var37 | ~var108);
         var108 = -9168152;
         var37 = var10008;
         var108 = (var37 | var108) & (~var37 | ~var108);
         var37 = var10007;
         var10007 = 2 * (var37 | var108) - (var37 ^ var108);
         var108 = -861872970;
         var37 = -1315965445;
         var10007 = var37 & ~var108 | ~var37 & var108;
         var108 = 1677817861;
         var37 = var10007;
         var10007 = var37 & ~var108 | ~var37 & var108;
         var108 = -971359129;
         var37 = -112530929;
         var10008 = (var37 | var108) & (~var37 | ~var108);
         var108 = -1513742064;
         var37 = var10008;
         var10008 = ((var37 | var108) & ~(var37 & var108)) * ((var37 | var108) & ~(var37 & var108));
         var108 = -1701939515;
         var37 = -727058042;
         var10008 = (var37 | var108) & ~(var37 & var108);
         var108 = 1312602442;
         var37 = var10008;
         String var167 = a(
            "ꔷ",
            "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謴㑸\u007f\ua7eb꒺ꁿꥊ絥蹏⑮謣㑾|\ua7e1꒦ꀾ꤬絸蹚⑯謣㑄wꟲ꒡ꁸꤋ統蹯⑶謲㑺w\ua7e8꒡",
            var186,
            var196,
            var10007,
            var37 & ~var108 | ~var37 & var108
         );
         int var171 = (int)1589266223529011573L;
         var108 = 1897204876;
         var37 = var171;
         var171 = var37 & ~var108 | ~var37 & var108;
         var108 = 1559241194;
         var37 = var171;
         var171 = (var37 & ~var108 | ~var37 & var108) * (var37 & ~var108 | ~var37 & var108);
         var108 = 1261079691;
         var37 = 1223261753;
         int var197 = (var37 | var108) & (~var37 | ~var108);
         var108 = 63173282;
         var37 = var197;
         int var198 = (var37 | var108) & ~(var37 & var108);
         var108 = 1343546829;
         var37 = -1597322860;
         int var199 = var37 + var108 - 2 * (var37 & var108);
         var108 = -253875127;
         var37 = var199;
         int var200 = var37 + var108 - 2 * (var37 & var108);
         int var201 = (int)-9153543676131608705L;
         var108 = 862386886;
         var37 = var201;
         int var202 = (var37 | var108) & (~var37 | ~var108);
         var108 = -1011626891;
         var37 = var202;
         int var203 = (var37 | var108) - (var37 & var108);
         var108 = -523376675;
         var37 = -787982510;
         int var204 = var37 & ~var108 | ~var37 & var108;
         var108 = 117065659;
         var37 = var204;
         int var205 = (var37 | var108) & (~var37 | ~var108);
         String var210 = "fc";
         var10007 = (int)4942692315619340359L;
         var108 = -347971977;
         var37 = var10007;
         var10007 = var37 + var108 - 2 * (var37 & var108);
         var108 = 1521241440;
         var37 = var10007;
         var10007 = (var37 | var108) - (var37 & var108);
         var10008 = (int)-9053234546240467603L;
         var108 = 2083186342;
         var37 = var10008;
         var10008 = (var37 | var108) - (var37 & var108);
         var108 = -818977476;
         var37 = var10008;
         var10008 = ((var37 | var108) & ~(var37 & var108)) * ((var37 | var108) & ~(var37 & var108));
         var10008 = (int)5713793594788704265L;
         var108 = 403604608;
         var37 = var10008;
         var10008 = (var37 | var108) & ~(var37 & var108);
         var108 = 1720091177;
         var37 = var10008;
         var10008 = (var37 | var108) & (~var37 | ~var108);
         var108 = 1663905516;
         var37 = -702678693;
         int var10009 = (var37 | var108) & ~(var37 & var108);
         var108 = 1632015084;
         var37 = var10009;
         var10009 = (var37 | var108) & (~var37 | ~var108);
         var10009 = (int)-4241653743939526116L;
         var108 = 1017700289;
         var37 = var10009;
         var10009 = (var37 | var108) & ~(var37 & var108);
         var108 = -1734122448;
         var37 = var10009;
         this.n = this.b(
            var159.replace(
               var167,
               a(
                  "",
                  "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謴㑸\u007f\ua7eb꒺ꁿꥊ絥蹏⑮謣㑾|\ua7e1꒦ꀾ꤬絸蹚⑯謣㑄wꟲ꒡ꁸꤋ統蹯⑶謲㑺w\ua7e8꒡",
                  var205,
                  var10007,
                  var10008,
                  (var37 | var108) - (var37 & var108)
               )
            )
         );
      }

      this.r = Math.min(this.r, this.n.length());
      this.H();
      this.t();
      this.q();
   }

   private void q() {
      if (this.p != null) {
         this.p.a(this.n);
      }
   }

   public boolean i() {
      return this.q;
   }

   @Override
   public boolean a_() {
      return this.q;
   }

   private String r() {
      switch (this.m) {
         case COMMAND:
            int var150 = (int)2034748231826553380L;
            int var122 = -391037512;
            int var50 = var150;
            var150 = (var50 | var122) & ~(var50 & var122);
            var122 = -1918596488;
            var50 = var150;
            var150 = var50 & ~var122 | ~var50 & var122;
            int var157 = (int)-1809231704927464440L;
            var122 = 1605941950;
            var50 = var157;
            var157 = (var50 | var122) & (~var50 | ~var122);
            var122 = 1188773389;
            var50 = var157;
            var122 = (var50 | var122) - (var50 & var122);
            var50 = var150;
            var150 = (var50 ^ var122) + 2 * (var50 & var122);
            var122 = -1028146612;
            var50 = 1848629686;
            int var173 = var50 + var122 - 2 * (var50 & var122);
            var122 = -1399299075;
            var50 = var173;
            var173 = var50 + var122 - 2 * (var50 & var122);
            String var175 = "fd";
            var173 = (int)2783585187675885698L;
            var122 = -1321266886;
            var50 = var173;
            var173 = (var50 | var122) - (var50 & var122);
            var122 = 1869952652;
            var50 = var173;
            var173 = var50 & ~var122 | ~var50 & var122;
            var122 = -1912144347;
            var50 = -427036995;
            int var186 = (var50 | var122) & (~var50 | ~var122);
            var122 = 160056088;
            var50 = var186;
            var186 = ((var50 | var122) & (~var50 | ~var122)) * ((var50 | var122) & (~var50 | ~var122));
            var186 = (int)-5394476925639020174L;
            var122 = -1801474785;
            var50 = var186;
            var186 = var50 + var122 - 2 * (var50 & var122);
            var122 = -816415292;
            var50 = var186;
            var186 = var50 & ~var122 | ~var50 & var122;
            var122 = 1864713483;
            var50 = -2003641731;
            int var208 = var50 + var122 - 2 * (var50 & var122);
            var122 = -1328130473;
            var50 = var208;
            var208 = ((var50 | var122) - (var50 & var122)) * ((var50 | var122) - (var50 & var122));
            var208 = (int)8079283243134877782L;
            var122 = 583910731;
            var50 = var208;
            var208 = (var50 | var122) - (var50 & var122);
            var122 = -78590690;
            var50 = var208;
            var208 = var50 + var122 - 2 * (var50 & var122);
            int var10006 = (int)-5358135497910304666L;
            var122 = -792321835;
            var50 = var10006;
            var10006 = (var50 | var122) & (~var50 | ~var122);
            var122 = -329031496;
            var50 = var10006;
            var10006 = (var50 | var122) - (var50 & var122);
            var122 = 434389092;
            var50 = 1817465482;
            var10006 = (var50 | var122) & (~var50 | ~var122);
            var122 = 1974473446;
            var50 = var10006;
            var10006 = var50 & ~var122 | ~var50 & var122;
            var10006 = (int)1058209738875800249L;
            var122 = -2013996829;
            var50 = var10006;
            var10006 = (var50 | var122) - (var50 & var122);
            var122 = 410636882;
            var50 = var10006;
            var10006 = (var50 | var122) & ~(var50 & var122);
            var122 = -379670981;
            var50 = 2059376153;
            int var219 = var50 + var122 - 2 * (var50 & var122);
            var122 = -1813336881;
            var50 = var219;
            return a(
               "⊓",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謴㑸\u007f\ua7eb꒺ꁿꥊ絥蹏⑮謣㑾|\ua7e1꒦ꀾ꤬絸蹚⑯謣㑄wꟲ꒡ꁸꤋ統蹯⑶謲㑺w\ua7e8꒡",
               var173,
               var186,
               var208,
               (var50 | var122) & (~var50 | ~var122)
            );
         case PRICE:
            int var101 = 2039962263;
            int var29 = 1435560227;
            int var148 = (var29 | var101) & ~(var29 & var101);
            var101 = -859317317;
            var29 = var148;
            var148 = (var29 & ~var101 | ~var29 & var101) * (var29 & ~var101 | ~var29 & var101);
            int var10001 = (int)-2843053314742124579L;
            var101 = -1066778249;
            var29 = var10001;
            var10001 = var29 + var101 - 2 * (var29 & var101);
            var101 = 1221337799;
            var29 = var10001;
            var10001 = (var29 | var101) & ~(var29 & var101);
            var101 = 1564426105;
            var29 = -550533418;
            int var169 = (var29 | var101) & (~var29 | ~var101);
            var101 = 263039900;
            var29 = var169;
            var101 = (var29 | var101) & (~var29 | ~var101);
            var29 = var10001;
            var10001 = (var29 & ~var101) + (var101 & ~var29) + 2 * (var29 & var101);
            String var170 = "fe";
            var101 = -1437049231;
            var29 = 221954518;
            var169 = (var29 | var101) & (~var29 | ~var101);
            var101 = -1872926573;
            var29 = var169;
            var169 = var29 + var101 - 2 * (var29 & var101);
            var101 = -334257247;
            var29 = 481753561;
            int var181 = (var29 | var101) - (var29 & var101);
            var101 = 1554334439;
            var29 = var181;
            var181 = (var29 | var101) & ~(var29 & var101);
            var181 = (int)2622474551565382952L;
            var101 = -1834190902;
            var29 = var181;
            var181 = (var29 | var101) & (~var29 | ~var101);
            var101 = 1041075534;
            var29 = var181;
            var181 = var29 + var101 - 2 * (var29 & var101);
            int var203 = (int)2891817416959232296L;
            var101 = -205593809;
            var29 = var203;
            var203 = (var29 | var101) & (~var29 | ~var101);
            var101 = 454982390;
            var29 = var203;
            var203 = ((var29 | var101) & ~(var29 & var101)) * ((var29 | var101) & ~(var29 & var101));
            var101 = -468676461;
            var29 = 1538088825;
            var203 = var29 + var101 - 2 * (var29 & var101);
            var101 = -1177388461;
            var29 = var203;
            var203 = var29 & ~var101 | ~var29 & var101;
            var101 = 631416957;
            var29 = 1496961521;
            int var216 = (var29 | var101) - (var29 & var101);
            var101 = -1204730867;
            var29 = var216;
            var216 = ((var29 | var101) & ~(var29 & var101)) * ((var29 | var101) & ~(var29 & var101));
            var101 = 2092211929;
            var29 = 1152218803;
            var216 = (var29 | var101) & (~var29 | ~var101);
            var101 = 945433242;
            var29 = var216;
            return a(
               "⊘",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謴㑸\u007f\ua7eb꒺ꁿꥊ絥蹏⑮謣㑾|\ua7e1꒦ꀾ꤬絸蹚⑯謣㑄wꟲ꒡ꁸꤋ統蹯⑶謲㑺w\ua7e8꒡",
               var169,
               var181,
               var203,
               var29 & ~var101 | ~var29 & var101
            );
         default:
            int var2 = 1572766322;
            int var1 = -871533319;
            int var10000 = (var1 | var2) - (var1 & var2);
            var2 = -764202580;
            var1 = var10000;
            var10000 = (var1 & ~var2 | ~var1 & var2) * (var1 & ~var2 | ~var1 & var2);
            var2 = 837019117;
            var1 = -1458337806;
            int var10002 = (var1 | var2) - (var1 & var2);
            var2 = -1729076710;
            var1 = var10002;
            var10002 = var1 + var2 - 2 * (var1 & var2);
            var10002 = (int)2907689875962276402L;
            var2 = -405148824;
            var1 = var10002;
            var10002 = (var1 | var2) & ~(var1 & var2);
            var2 = -1167933100;
            var1 = var10002;
            var10002 = var1 + var2 - 2 * (var1 & var2);
            var10002 = (int)136325512304416107L;
            var2 = -806453203;
            var1 = var10002;
            var10002 = var1 & ~var2 | ~var1 & var2;
            var2 = 840314880;
            var1 = var10002;
            var10002 = (var1 | var2) & (~var1 | ~var2);
            var10002 = (int)-2921652250635500804L;
            var2 = 1496723343;
            var1 = var10002;
            var10002 = (var1 | var2) & ~(var1 & var2);
            var2 = -1649452473;
            var1 = var10002;
            var10002 = var1 & ~var2 | ~var1 & var2;
            var2 = 187123183;
            var1 = -1426484848;
            int var10004 = (var1 | var2) & (~var1 | ~var2);
            var2 = -1579232131;
            var1 = var10004;
            var10004 = (var1 | var2) & ~(var1 & var2);
            var2 = -423859944;
            var1 = -1958287781;
            var10004 = var1 & ~var2 | ~var1 & var2;
            var2 = 1845137222;
            var1 = var10004;
            var10004 = var1 + var2 - 2 * (var1 & var2);
            var10004 = (int)1313149184486609998L;
            var2 = -166300531;
            var1 = var10004;
            var10004 = (var1 | var2) & (~var1 | ~var2);
            var2 = 545087690;
            var1 = var10004;
            var10004 = (var1 | var2) - (var1 & var2);
            int var10003 = (int)-8189781198758806745L;
            var2 = 1515857756;
            var1 = var10003;
            var10003 = (var1 | var2) - (var1 & var2);
            var2 = 598762040;
            var1 = var10003;
            var10003 = (var1 | var2) - (var1 & var2);
            var2 = -1278652747;
            var1 = -1378170691;
            var10004 = (var1 | var2) & ~(var1 & var2);
            var2 = 2132335883;
            var1 = var10004;
            var10004 = (var1 | var2) & (~var1 | ~var2);
            int var10005 = (int)-5005858519754977769L;
            var2 = -1055423411;
            var1 = var10005;
            var10005 = var1 + var2 - 2 * (var1 & var2);
            var2 = 53324695;
            var1 = var10005;
            var2 = (var1 | var2) & (~var1 | ~var2);
            var1 = var10004;
            var10004 = 2 * (var1 | var2) - (var1 ^ var2);
            var10004 = (int)-2424074408342931418L;
            var2 = 1514237831;
            var1 = var10004;
            var10004 = (var1 | var2) & (~var1 | ~var2);
            var2 = 1786122652;
            var1 = var10004;
            var10004 = (var1 | var2) & (~var1 | ~var2);
            String var214 = "ff";
            var2 = 193184920;
            var1 = -364313816;
            var10005 = var1 + var2 - 2 * (var1 & var2);
            var2 = -504220105;
            var1 = var10005;
            return a(
               "",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謴㑸\u007f\ua7eb꒺ꁿꥊ絥蹏⑮謣㑾|\ua7e1꒦ꀾ꤬絸蹚⑯謣㑄wꟲ꒡ꁸꤋ統蹯⑶謲㑺w\ua7e8꒡",
               var10002,
               var10003,
               var10004,
               (var1 | var2) - (var1 & var2)
            );
      }
   }

   private String s() {
      String var2 = this.n;
      String var1 = this.r();
      return var1 + var2;
   }

   private boolean b(char var1, int var2) {
      switch (this.m) {
         case COMMAND:
            label121: {
               int var195 = -883360982;
               int var85 = 114000491;
               int var282 = (var85 | var195) & ~(var85 & var195);
               var195 = -845973216;
               var85 = var282;
               if (var1 >= var85 + var195 - 2 * (var85 & var195)) {
                  var195 = -599011028;
                  var85 = -1356655130;
                  var282 = (var85 | var195) & (~var85 | ~var195);
                  var195 = 1936245936;
                  var85 = var282;
                  if (var1 <= var85 + var195 - 2 * (var85 & var195)) {
                     break label121;
                  }
               }

               var195 = 903697311;
               var85 = 1308722058;
               var282 = (var85 | var195) & ~(var85 & var195);
               var195 = 2078068820;
               var85 = var282;
               if (var1 >= (var85 & ~var195 | ~var85 & var195)) {
                  var282 = (int)-6771020017933868464L;
                  var195 = -865682768;
                  var85 = var282;
                  var282 = var85 + var195 - 2 * (var85 & var195);
                  var195 = -879191878;
                  var85 = var282;
                  if (var1 <= ((var85 | var195) & ~(var85 & var195))) {
                     break label121;
                  }
               }

               var195 = -1269311160;
               var85 = -1292147376;
               var282 = (var85 | var195) & ~(var85 & var195);
               var195 = 111983656;
               var85 = var282;
               if (var1 < (var85 | var195) - (var85 & var195)) {
                  var195 = 1961749996;
                  var85 = 1772903756;
                  var282 = (var85 | var195) & (~var85 | ~var195);
                  var195 = 490844323;
                  var85 = var282;
                  var282 = (var85 | var195) & (~var85 | ~var195);
                  var282 = (int)1810500793327842045L;
                  var195 = 1023725034;
                  var85 = var282;
                  var282 = var85 + var195 - 2 * (var85 & var195);
                  var195 = 920305425;
                  var85 = var282;
                  var282 = (var85 | var195) & ~(var85 & var195);
                  var195 = -550096018;
                  var85 = 1451583131;
                  var282 = var85 & ~var195 | ~var85 & var195;
                  var195 = -1984735760;
                  var85 = var282;
                  var282 = (var85 | var195) - (var85 & var195);
                  var282 = (int)7089727108802747949L;
                  var195 = -1175223648;
                  var85 = var282;
                  var282 = (var85 | var195) & (~var85 | ~var195);
                  var195 = -1420387199;
                  var85 = var282;
                  var282 = (var85 | var195) - (var85 & var195);
                  int var242 = (int)-2039089937882201877L;
                  var195 = -991338760;
                  var85 = var242;
                  var242 = var85 & ~var195 | ~var85 & var195;
                  var195 = -1836466123;
                  var85 = var242;
                  int var7 = var85 & ~var195 | ~var85 & var195;
                  var195 = 823250334;
                  var85 = 2067854688;
                  var242 = (var85 | var195) - (var85 & var195);
                  var195 = 183298376;
                  var85 = var242;
                  var242 = ((var85 | var195) & (~var85 | ~var195)) * ((var85 | var195) & (~var85 | ~var195));
                  var242 = (int)3191132509172846182L;
                  var195 = -241123775;
                  var85 = var242;
                  var242 = var85 + var195 - 2 * (var85 & var195);
                  var195 = -7461125;
                  var85 = var242;
                  if ((var85 | var195) - (var85 & var195) >= var7) {
                     String var248 = "fg";
                     var242 = (int)-7424677475364142021L;
                     var195 = -427930304;
                     var85 = var242;
                     var242 = var85 + var195 - 2 * (var85 & var195);
                     var195 = -1791976777;
                     var85 = var242;
                     var7 = (var85 | var195) & (~var85 | ~var195);
                  }
               } else {
                  var282 = (int)-3659338133024129807L;
                  var195 = 532456077;
                  var85 = var282;
                  var282 = var85 + var195 - 2 * (var85 & var195);
                  var195 = 1001561669;
                  var85 = var282;
                  if (var1 <= var85 + var195 - 2 * (var85 & var195)) {
                     break label121;
                  }
               }

               var195 = 1592802103;
               var85 = -1481303893;
               var282 = (var85 | var195) & ~(var85 & var195);
               var195 = -112909380;
               var85 = var282;
               if (var1 != ((var85 | var195) & (~var85 | ~var195))) {
                  int var251 = (int)-6876994230598026433L;
                  var195 = -782988961;
                  var85 = var251;
                  var251 = (var85 | var195) & (~var85 | ~var195);
                  var195 = 866103904;
                  var85 = var251;
                  return pulse.Bool.from((var85 | var195) - (var85 & var195));
               }
            }

            int var227 = -1617946304;
            int var117 = 1529438825;
            int var254 = (var117 | var227) - (var117 & var227);
            var227 = -994477272;
            var117 = var254;
            return pulse.Bool.from((var117 | var227) & ~(var117 & var227));
         case PRICE:
            int var187 = 1166553990;
            int var77 = -2069051308;
            int var279 = var77 + var187 - 2 * (var77 & var187);
            var187 = -1054540830;
            var77 = var279;
            if (var1 >= (var77 & ~var187 | ~var77 & var187)) {
               var279 = (int)-5359274094647543635L;
               var187 = -599713619;
               var77 = var279;
               var279 = var77 + var187 - 2 * (var77 & var187);
               var187 = -623550407;
               var77 = var279;
               if (var1 <= (var77 | var187) - (var77 & var187)) {
                  int var240 = (int)-8276834447482317797L;
                  var187 = 933857980;
                  var77 = var240;
                  var240 = var77 & ~var187 | ~var77 & var187;
                  var187 = 447749798;
                  var77 = var240;
                  return pulse.Bool.from((var77 | var187) - (var77 & var187));
               }
            }

            int var237 = (int)6047773903682496826L;
            var187 = -28966101;
            var77 = var237;
            var237 = var77 + var187 - 2 * (var77 & var187);
            var187 = 1419340305;
            var77 = var237;
            return pulse.Bool.from((var77 | var187) - (var77 & var187));
         case PLAYER:
            label120: {
               int var267 = (int)641515759185837008L;
               int var169 = -1866821427;
               int var59 = var267;
               var267 = (var59 | var169) & ~(var59 & var169);
               var169 = -1330861188;
               var59 = var267;
               if (var1 >= (var59 & ~var169 | ~var59 & var169)) {
                  var267 = (int)4847571951274910776L;
                  var169 = -508461153;
                  var59 = var267;
                  var267 = var59 + var169 - 2 * (var59 & var169);
                  var169 = 1934760925;
                  var59 = var267;
                  if (var1 <= (var59 & ~var169 | ~var59 & var169)) {
                     break label120;
                  }
               }

               var267 = (int)6732034196308398824L;
               var169 = 1074270745;
               var59 = var267;
               var267 = var59 & ~var169 | ~var59 & var169;
               var169 = 1186365616;
               var59 = var267;
               if (var1 >= var59 + var169 - 2 * (var59 & var169)) {
                  var169 = 845794399;
                  var59 = -1952567383;
                  var267 = (var59 | var169) - (var59 & var169);
                  var169 = -1174936660;
                  var59 = var267;
                  if (var1 <= (var59 & ~var169 | ~var59 & var169)) {
                     break label120;
                  }
               }

               var169 = -1558024093;
               var59 = 434009063;
               var267 = (var59 | var169) - (var59 & var169);
               var169 = -1157889100;
               var59 = var267;
               if (var1 >= ((var59 | var169) & ~(var59 & var169))) {
                  var267 = (int)8448977065363261477L;
                  var169 = 1817856588;
                  var59 = var267;
                  var267 = var59 & ~var169 | ~var59 & var169;
                  var169 = 876347984;
                  var59 = var267;
                  if (var1 <= ((var59 | var169) & (~var59 | ~var169))) {
                     break label120;
                  }
               }

               var267 = (int)386973017826381259L;
               var169 = 1063117548;
               var59 = var267;
               var267 = var59 & ~var169 | ~var59 & var169;
               var169 = -294768776;
               var59 = var267;
               if (var1 != (var59 & ~var169 | ~var59 & var169)) {
                  var169 = 808966178;
                  var59 = -2048763705;
                  int var234 = (var59 | var169) & ~(var59 & var169);
                  var169 = -1244299035;
                  var59 = var234;
                  return pulse.Bool.from((var59 | var169) & (~var59 | ~var169));
               }
            }

            int var185 = -1670664151;
            int var75 = 187217464;
            int var236 = var75 + var185 - 2 * (var75 & var185);
            var185 = -1757215216;
            var75 = var236;
            return pulse.Bool.from((var75 | var185) & ~(var75 & var185));
         case INT:
            label132: {
               label119: {
                  int var10001 = (int)-3759902865380887132L;
                  int var120 = -584547490;
                  int var10 = var10001;
                  var10001 = (var10 | var120) & (~var10 | ~var120);
                  var120 = 467089098;
                  var10 = var10001;
                  if (var1 >= (var10 | var120) - (var10 & var120)) {
                     var10001 = (int)5372089460360897477L;
                     var120 = -1558349326;
                     var10 = var10001;
                     var10001 = var10 + var120 - 2 * (var10 & var120);
                     var120 = 1903368718;
                     var10 = var10001;
                     if (var1 <= (var10 | var120) - (var10 & var120)) {
                        break label119;
                     }
                  }

                  var10001 = (int)6965691993672645897L;
                  var120 = -49296026;
                  var10 = var10001;
                  var10001 = var10 + var120 - 2 * (var10 & var120);
                  var120 = -1666437054;
                  var10 = var10001;
                  if (var1 != var10 + var120 - 2 * (var10 & var120) || var2 != 0) {
                     break label132;
                  }

                  String var229 = this.n;
                  var120 = 1110576057;
                  var10 = -1836692993;
                  int var10002 = var10 + var120 - 2 * (var10 & var120);
                  var120 = -793492921;
                  var10 = var10002;
                  var10002 = var10 + var120 - 2 * (var10 & var120);
                  var120 = 1028349070;
                  var10 = -667456269;
                  var10002 = var10 + var120 - 2 * (var10 & var120);
                  var120 = -444845966;
                  var10 = var10002;
                  var10002 = (var10 | var120) & (~var10 | ~var120);
                  var120 = -1283978138;
                  var10 = -631869669;
                  var10002 = (var10 | var120) & (~var10 | ~var120);
                  var120 = 1764647791;
                  var10 = var10002;
                  var10002 = (var10 | var120) & ~(var10 & var120);
                  var10002 = (int)-3526394650507022726L;
                  var120 = 1764017587;
                  var10 = var10002;
                  var10002 = (var10 | var120) - (var10 & var120);
                  var120 = -678155324;
                  var10 = var10002;
                  var10002 = (var10 | var120) & ~(var10 & var120);
                  var120 = 1527816058;
                  var10 = -913283944;
                  var10002 = var10 + var120 - 2 * (var10 & var120);
                  var120 = -1721769112;
                  var10 = var10002;
                  var10002 = (var10 & ~var120 | ~var10 & var120) * (var10 & ~var120 | ~var10 & var120);
                  var120 = -1169922284;
                  var10 = -1181109623;
                  int var10003 = (var10 | var120) & (~var10 | ~var120);
                  var120 = -1844100268;
                  var10 = var10003;
                  var10003 = var10 + var120 - 2 * (var10 & var120);
                  var10003 = (int)1192801703930112251L;
                  var120 = -981007874;
                  var10 = var10003;
                  var10003 = (var10 | var120) - (var10 & var120);
                  var120 = -2004558287;
                  var10 = var10003;
                  var10003 = (var10 | var120) & ~(var10 & var120);
                  var120 = 47827276;
                  var10 = 1939312984;
                  int var10004 = (var10 | var120) - (var10 & var120);
                  var120 = 1031501476;
                  var10 = var10004;
                  var10004 = ((var10 | var120) - (var10 & var120)) * ((var10 | var120) - (var10 & var120));
                  var10004 = (int)-4322977720569522004L;
                  var120 = -974032190;
                  var10 = var10004;
                  var10004 = (var10 | var120) & ~(var10 & var120);
                  var120 = 1188715272;
                  var10 = var10004;
                  var10004 = var10 & ~var120 | ~var10 & var120;
                  var120 = 2089412851;
                  var10 = 516887853;
                  int var10006 = var10 + var120 - 2 * (var10 & var120);
                  var120 = 1648819671;
                  var10 = var10006;
                  var10006 = (var10 | var120) & (~var10 | ~var120);
                  var10006 = (int)3092442417084579565L;
                  var120 = -708446424;
                  var10 = var10006;
                  var10006 = var10 & ~var120 | ~var10 & var120;
                  var120 = -1150760510;
                  var10 = var10006;
                  var10006 = var10 & ~var120 | ~var10 & var120;
                  var10006 = (int)-314538652345807178L;
                  var120 = -384309102;
                  var10 = var10006;
                  var10006 = var10 & ~var120 | ~var10 & var120;
                  var120 = -136600019;
                  var10 = var10006;
                  var10006 = (var10 | var120) & (~var10 | ~var120);
                  var120 = 1670950491;
                  var10 = 1239172728;
                  int var10005 = (var10 | var120) & ~(var10 & var120);
                  var120 = 556495797;
                  var10 = var10005;
                  var10005 = (var10 | var120) - (var10 & var120);
                  var120 = 1093315438;
                  var10 = -302255569;
                  var10006 = (var10 | var120) & (~var10 | ~var120);
                  var120 = -2107222619;
                  var10 = var10006;
                  var10006 = (var10 | var120) & (~var10 | ~var120);
                  var10006 = (int)1995964531379192310L;
                  var120 = -680111162;
                  var10 = var10006;
                  var10006 = (var10 | var120) & ~(var10 & var120);
                  var120 = 1514403450;
                  var10 = var10006;
                  if (var229.contains(
                     a(
                        "ꋱ",
                        "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謴㑸\u007f\ua7eb꒺ꁿꥊ絥蹏⑮謣㑾|\ua7e1꒦ꀾ꤬絸蹚⑯謣㑄wꟲ꒡ꁸꤋ統蹯⑶謲㑺w\ua7e8꒡",
                        var10003,
                        var10004,
                        var10005,
                        var10 & ~var120 | ~var10 & var120
                     )
                  )) {
                     break label132;
                  }
               }

               int var232 = (int)2009782912023202600L;
               int var158 = -1404577653;
               int var48 = var232;
               var232 = (var48 | var158) - (var48 & var158);
               var158 = -1366502494;
               var48 = var232;
               var232 = (var48 | var158) - (var48 & var158);
               String var260 = "fh";
               int var261 = (int)7939650998985802506L;
               var158 = -1283409431;
               var48 = var261;
               int var262 = var48 & ~var158 | ~var48 & var158;
               var158 = -472926397;
               var48 = var262;
               int var4 = var48 & ~var158 | ~var48 & var158;
               b = var4;
               var158 = 1418972580;
               var48 = -453163500;
               int var263 = (var48 | var158) & ~(var48 & var158);
               var158 = -1088506435;
               var48 = var263;
               int var264 = var48 + var158 - 2 * (var48 & var158);
               int var311 = (int)1908798256259905380L;
               var158 = -2037015323;
               var48 = var311;
               var311 = (var48 | var158) - (var48 & var158);
               var158 = -1607021148;
               var48 = var311;
               var158 = (var48 | var158) & (~var48 | ~var158);
               var48 = var264;
               int var265 = (var48 ^ var158) + 2 * (var48 & var158);
               var158 = -134788710;
               var48 = 1688330121;
               int var266 = (var48 | var158) & (~var48 | ~var158);
               var158 = -185246722;
               var48 = var266;
               if (((var48 | var158) & ~(var48 & var158)) < b) {
                  throw new IllegalStateException();
               }

               return pulse.Bool.from(var232);
            }

            int var156 = 1249168748;
            int var46 = 1379724906;
            int var230 = var46 + var156 - 2 * (var46 & var156);
            var156 = 407380742;
            var46 = var230;
            return pulse.Bool.from((var46 | var156) & (~var46 | ~var156));
         default:
            int var6 = -738431171;
            int var5 = -228380571;
            int var10000 = var5 & ~var6 | ~var5 & var6;
            var6 = 564092761;
            var5 = var10000;
            return pulse.Bool.from((var5 | var6) & (var5 ^ -1 | var6 ^ -1));
      }
   }

   private boolean a(char var1) {
      return this.b(var1, this.r);
   }

   private String b(String var1) {
      if (!var1.isEmpty()) {
         try {
            long var2 = Long.parseLong(var1);
            StringBuilder var4 = new StringBuilder();
            String var5 = String.valueOf(var2);
            int var119 = 1928479444;
            int var37 = -1925017846;
            int var180 = (var37 | var119) & ~(var37 & var119);
            var119 = -5190178;
            var37 = var180;
            int var6 = (var37 | var119) & ~(var37 & var119);
            var180 = var5.length();
            int var195 = (int)1646814024505479107L;
            var119 = -1538043919;
            var37 = var195;
            var195 = (var37 | var119) & ~(var37 & var119);
            var119 = -376143821;
            var37 = var195;
            var119 = var37 + var119 - 2 * (var37 & var119);
            var37 = var180;

            for (int var7 = var37 - var119; var7 >= 0; var7--) {
               if (var6 > 0) {
                  var195 = (int)1966321715510771406L;
                  var119 = 1860746097;
                  var37 = var195;
                  var195 = (var37 | var119) & (~var37 | ~var119);
                  var119 = -909163076;
                  var37 = var195;
                  if (var6 % ((var37 | var119) - (var37 & var119)) != 0) {
                     if (c) {
                        var180 = (int)5109793849619515658L;
                        var119 = -1326965905;
                        var37 = var180;
                        var180 = (var37 | var119) & ~(var37 & var119);
                        var119 = 1780323137;
                        var37 = var180;
                        var180 = (var37 & ~var119 | ~var37 & var119) * (var37 & ~var119 | ~var37 & var119);
                        var180 = (int)-7316303260571195242L;
                        var119 = -827649598;
                        var37 = var180;
                        var180 = (var37 | var119) & (~var37 | ~var119);
                        var119 = -877794050;
                        var37 = var180;
                        int var9 = (var37 | var119) & ~(var37 & var119);
                        b = var9;
                     }
                  } else {
                     var119 = 297415326;
                     var37 = 846053724;
                     var195 = (var37 | var119) & ~(var37 & var119);
                     var119 = 601355202;
                     var37 = var195;
                     var195 = (var37 | var119) - (var37 & var119);
                     int var205 = (int)-5157509024986705045L;
                     var119 = -1743061223;
                     var37 = var205;
                     var205 = (var37 | var119) & (~var37 | ~var119);
                     var119 = 437109853;
                     var37 = var205;
                     var205 = (var37 | var119) - (var37 & var119);
                     var119 = -937668047;
                     var37 = -1060290685;
                     int var214 = var37 & ~var119 | ~var37 & var119;
                     var119 = -373781042;
                     var37 = var214;
                     var119 = var37 + var119 - 2 * (var37 & var119);
                     var37 = var205;
                     var205 = var37 - ~var119 - 1;
                     var119 = -554631615;
                     var37 = 1793203899;
                     int var219 = var37 & ~var119 | ~var37 & var119;
                     var119 = -1273831175;
                     var37 = var219;
                     var219 = (var37 | var119) & (~var37 | ~var119);
                     var119 = 156022315;
                     var37 = -430953520;
                     var219 = (var37 | var119) & ~(var37 & var119);
                     var119 = -283337238;
                     var37 = var219;
                     var219 = var37 + var119 - 2 * (var37 & var119);
                     var119 = -1754019912;
                     var37 = 1486166425;
                     var219 = (var37 | var119) - (var37 & var119);
                     var119 = -806953431;
                     var37 = var219;
                     var219 = (var37 | var119) & (~var37 | ~var119);
                     var119 = -8501991;
                     var37 = -1541839576;
                     var219 = (var37 | var119) - (var37 & var119);
                     var119 = 1533485106;
                     var37 = var219;
                     var219 = (var37 | var119) & ~(var37 & var119);
                     var119 = 518119530;
                     var37 = 142168068;
                     var219 = var37 & ~var119 | ~var37 & var119;
                     var119 = 1058616850;
                     var37 = var219;
                     var219 = (var37 | var119) & ~(var37 & var119);
                     int var232 = (int)3332949542417490410L;
                     var119 = -645859102;
                     var37 = var232;
                     var232 = (var37 | var119) & ~(var37 & var119);
                     var119 = -1780516764;
                     var37 = var232;
                     var119 = var37 + var119 - 2 * (var37 & var119);
                     var37 = var219;
                     var219 = (var37 ^ var119) + 2 * (var37 & var119);
                     var119 = -1199039493;
                     var37 = -2008843213;
                     var219 = (var37 | var119) & ~(var37 & var119);
                     var119 = 133468412;
                     var37 = var219;
                     var219 = (var37 | var119) & (~var37 | ~var119);
                     int var246 = (int)5899373457784162382L;
                     var119 = -1168861982;
                     var37 = var246;
                     var246 = var37 + var119 - 2 * (var37 & var119);
                     var119 = -289186648;
                     var37 = var246;
                     var246 = var37 & ~var119 | ~var37 & var119;
                     var119 = -40105608;
                     var37 = -36509527;
                     var246 = (var37 | var119) & (~var37 | ~var119);
                     var119 = 5169619;
                     var37 = var246;
                     var246 = (var37 | var119) - (var37 & var119);
                     var119 = -1045918977;
                     var37 = 393307784;
                     var246 = var37 + var119 - 2 * (var37 & var119);
                     var119 = -690361217;
                     var37 = var246;
                     var246 = var37 & ~var119 | ~var37 & var119;
                     var232 = (int)8424037813209415517L;
                     var119 = -1429924661;
                     var37 = var232;
                     var232 = (var37 | var119) & ~(var37 & var119);
                     var119 = 294337766;
                     var37 = var232;
                     var232 = (var37 | var119) - (var37 & var119);
                     var246 = (int)5769797924796409555L;
                     var119 = -2022452483;
                     var37 = var246;
                     var246 = var37 & ~var119 | ~var37 & var119;
                     var119 = 1181596273;
                     var37 = var246;
                     var246 = (var37 | var119) & ~(var37 & var119);
                     var119 = 833425389;
                     var37 = -751629915;
                     var246 = var37 & ~var119 | ~var37 & var119;
                     var119 = -191220142;
                     var37 = var246;
                     var246 = (var37 | var119) & (~var37 | ~var119);
                     var119 = 189771943;
                     var37 = 1828575015;
                     int var10007 = var37 + var119 - 2 * (var37 & var119);
                     var119 = -1385270137;
                     var37 = var10007;
                     var10007 = ((var37 | var119) & (~var37 | ~var119)) * ((var37 | var119) & (~var37 | ~var119));
                     var10007 = (int)6031890723712807817L;
                     var119 = -569929582;
                     var37 = var10007;
                     var10007 = (var37 | var119) & (~var37 | ~var119);
                     var119 = 2026133425;
                     var37 = var10007;
                     var4.insert(
                        var195,
                        a(
                           "\udc8a",
                           "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謴㑸\u007f\ua7eb꒺ꁿꥊ絥蹏⑮謣㑾|\ua7e1꒦ꀾ꤬絸蹚⑯謣㑄wꟲ꒡ꁸꤋ統蹯⑶謲㑺w\ua7e8꒡",
                           var219,
                           var232,
                           var246,
                           (var37 | var119) & (~var37 | ~var119)
                        )
                     );
                  }
               }

               var119 = -586823534;
               var37 = -2129330409;
               var195 = (var37 | var119) & (~var37 | ~var119);
               var119 = 1544632197;
               var37 = var195;
               var4.insert((var37 | var119) - (var37 & var119), var5.charAt(var7));
               var6++;
            }

            var119 = -352637932;
            var37 = -395940335;
            var180 = var37 & ~var119 | ~var37 & var119;
            var119 = 1661523031;
            var37 = var180;
            var180 = ((var37 | var119) - (var37 & var119)) * ((var37 | var119) - (var37 & var119));
            var119 = 1613592162;
            var37 = -60430131;
            var180 = var37 & ~var119 | ~var37 & var119;
            var119 = -1682797821;
            var37 = var180;
            int var13 = (var37 | var119) & (~var37 | ~var119);
            b = var13;
            var119 = -778231377;
            var37 = -1431913125;
            var180 = var37 & ~var119 | ~var37 & var119;
            var119 = 748514405;
            var37 = var180;
            var180 = (var37 & ~var119 | ~var37 & var119) * (var37 & ~var119 | ~var37 & var119);
            var119 = 416140861;
            var37 = -278549194;
            var180 = (var37 | var119) - (var37 & var119);
            var119 = -363767493;
            var37 = var180;
            if (((var37 | var119) & ~(var37 & var119)) <= b) {
               throw new IllegalAccessError();
            } else {
               return var4.toString();
            }
         } catch (NumberFormatException var12) {
            return var1;
         }
      } else {
         int var10000 = (int)-2931345769572023656L;
         int var11 = -42427866;
         int var10 = var10000;
         var10000 = var10 + var11 - 2 * (var10 & var11);
         var11 = -239514227;
         var10 = var10000;
         var10000 = ((var10 | var11) & ~(var10 & var11)) * ((var10 | var11) & ~(var10 & var11));
         int var10001 = (int)-4668462602275011186L;
         var11 = -47576193;
         var10 = var10001;
         var10001 = var10 & ~var11 | ~var10 & var11;
         var11 = 807365187;
         var10 = var10001;
         var10001 = var10 & ~var11 | ~var10 & var11;
         String var10002 = "fi";
         int var202 = (int)3402063940439741372L;
         var11 = 282174820;
         var10 = var202;
         int var203 = (var10 | var11) & (~var10 | ~var11);
         var11 = 654164460;
         var10 = var203;
         int var204 = (var10 | var11) - (var10 & var11);
         int var10003 = (int)-8304117916341684323L;
         var11 = 1627116296;
         var10 = var10003;
         var10003 = (var10 | var11) - (var10 & var11);
         var11 = -1052548440;
         var10 = var10003;
         var10003 = (var10 | var11) - (var10 & var11);
         var10003 = (int)6901604469117269103L;
         var11 = 918248673;
         var10 = var10003;
         var10003 = var10 & ~var11 | ~var10 & var11;
         var11 = 1914715688;
         var10 = var10003;
         var10003 = var10 & ~var11 | ~var10 & var11;
         int var10004 = (int)-5645143141500451005L;
         var11 = -345538128;
         var10 = var10004;
         var10004 = var10 + var11 - 2 * (var10 & var11);
         var11 = 1486605024;
         var10 = var10004;
         var10004 = ((var10 | var11) - (var10 & var11)) * ((var10 | var11) - (var10 & var11));
         var11 = 365871600;
         var10 = -1535701154;
         var10004 = var10 & ~var11 | ~var10 & var11;
         var11 = -1082013914;
         var10 = var10004;
         var10004 = (var10 | var11) & ~(var10 & var11);
         int var10006 = (int)-7812306840549014952L;
         var11 = 701566153;
         var10 = var10006;
         var10006 = (var10 | var11) & ~(var10 & var11);
         var11 = -848703870;
         var10 = var10006;
         var10006 = (var10 | var11) - (var10 & var11);
         var10006 = (int)2008964657759462460L;
         var11 = 1226907520;
         var10 = var10006;
         var10006 = (var10 | var11) & (~var10 | ~var11);
         var11 = 288373691;
         var10 = var10006;
         var10006 = (var10 | var11) & (~var10 | ~var11);
         var11 = 1557738696;
         var10 = -1900441506;
         var10006 = (var10 | var11) & ~(var10 & var11);
         var11 = -765418338;
         var10 = var10006;
         var10006 = var10 & ~var11 | ~var10 & var11;
         var11 = 1038178936;
         var10 = 2009247760;
         var10006 = (var10 | var11) & (~var10 | ~var11);
         var11 = 1243867771;
         var10 = var10006;
         var10006 = (var10 | var11) - (var10 & var11);
         var11 = -227928857;
         var10 = -1756826252;
         int var10005 = var10 + var11 - 2 * (var10 & var11);
         var11 = 1697010291;
         var10 = var10005;
         return a(
            "",
            "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謴㑸\u007f\ua7eb꒺ꁿꥊ絥蹏⑮謣㑾|\ua7e1꒦ꀾ꤬絸蹚⑯謣㑄wꟲ꒡ꁸꤋ統蹯⑶謲㑺w\ua7e8꒡",
            var204,
            var10003,
            var10004,
            var10 & ~var11 | ~var10 & var11
         );
      }
   }

   private void t() {
      int var10001 = (int)-6120187570861491663L;
      int var8 = 1601368195;
      int var7 = var10001;
      var10001 = (var7 | var8) & (~var7 | ~var8);
      var8 = -948385092;
      var7 = var10001;
      FontRenderer var1 = FontManager.a[(var7 | var8) & (~var7 | ~var8)];
      String var2 = this.s();
      String var32;
      if (!var2.isEmpty()) {
         var32 = var2;
      } else {
         String var6 = this.o;
         String var5 = this.r();
         var32 = var5 + var6;
      }

      float var3 = var1.a(var32);
      var10001 = (int)-5654565524755032686L;
      var8 = -620719338;
      var7 = var10001;
      var10001 = (var7 | var8) - (var7 & var8);
      var8 = -1329203575;
      var7 = var10001;
      var10001 = var7 + var8 - 2 * (var7 & var8);
      int var10002 = (int)900408827281819344L;
      var8 = 42747357;
      var7 = var10002;
      var10002 = (var7 | var8) - (var7 & var8);
      var8 = -974407956;
      var7 = var10002;
      var8 = (var7 | var8) & ~(var7 & var8);
      var7 = var10001;
      var10001 = (var7 ^ var8) + 2 * (var7 & var8);
      float var4 = var3 + 10.0F;
      var8 = 2006873731;
      var7 = -1391837658;
      int var10000 = (var7 | var8) - (var7 & var8);
      var8 = 532373345;
      var7 = var10000;
      var10000 = ((var7 | var8) & ~(var7 & var8)) * ((var7 | var8) & ~(var7 & var8));
      var10001 = (int)-7560197753315571725L;
      var8 = -90429589;
      var7 = var10001;
      var10001 = var7 + var8 - 2 * (var7 & var8);
      var8 = -167243399;
      var7 = var10001;
      var10001 = (var7 & ~var8 | ~var7 & var8) * (var7 & ~var8 | ~var7 & var8);
      var4 = Math.max(40.0F, Math.min(100.0F, var4));
      if (Math.abs(var4 - this.F) > 1.0F) {
         double var40 = var4;
         String var42 = "fj";
         this.x.a(var40, 0.15, pulse.Easing.h);
      }
   }

   private void u() {
      int var6 = -468473747;
      int var5 = 2081980212;
      int var10001 = var5 & ~var6 | ~var5 & var6;
      var6 = -84912403;
      var5 = var10001;
      var10001 = ((var5 | var6) - (var5 & var6)) * ((var5 | var6) - (var5 & var6));
      int var10002 = (int)2396612585955199391L;
      var6 = 505576465;
      var5 = var10002;
      var10002 = (var5 | var6) & (~var5 | ~var6);
      var6 = -174069114;
      var5 = var10002;
      var10002 = var5 & ~var6 | ~var5 & var6;
      var6 = -1270761706;
      var5 = -510488093;
      int var10003 = var5 + var6 - 2 * (var5 & var6);
      var6 = -581184504;
      var5 = var10003;
      var6 = (var5 | var6) & ~(var5 & var6);
      var5 = var10002;
      var10002 = (var5 & ~var6) + (var6 & ~var5) + 2 * (var5 & var6);
      var6 = 2050293779;
      var5 = 1607181628;
      var10003 = var5 + var6 - 2 * (var5 & var6);
      var6 = 133485000;
      var5 = var10003;
      var10003 = (var5 | var6) & (~var5 | ~var6);
      var6 = 2107539707;
      var5 = -40288762;
      var10003 = var5 & ~var6 | ~var5 & var6;
      var6 = -1221047863;
      var5 = var10003;
      var10003 = (var5 | var6) & (~var5 | ~var6);
      int var10004 = (int)6021358852628490909L;
      var6 = -2038707408;
      var5 = var10004;
      var10004 = var5 & ~var6 | ~var5 & var6;
      var6 = 463277764;
      var5 = var10004;
      var10004 = var5 & ~var6 | ~var5 & var6;
      var10004 = (int)-2418391971926190078L;
      var6 = -193663069;
      var5 = var10004;
      var10004 = var5 + var6 - 2 * (var5 & var6);
      var6 = 79023909;
      var5 = var10004;
      var10004 = var5 & ~var6 | ~var5 & var6;
      var6 = -1947363428;
      var5 = 1449925572;
      int var10006 = var5 & ~var6 | ~var5 & var6;
      var6 = -578712492;
      var5 = var10006;
      var10006 = var5 + var6 - 2 * (var5 & var6);
      var6 = -885901897;
      var5 = 733221214;
      int var10005 = (var5 | var6) & ~(var5 & var6);
      var6 = -527692928;
      var5 = var10005;
      var10005 = var5 + var6 - 2 * (var5 & var6);
      var10006 = (int)-7440636333552003886L;
      var6 = -1402148387;
      var5 = var10006;
      var10006 = (var5 | var6) & (~var5 | ~var6);
      var6 = 981079306;
      var5 = var10006;
      var10006 = var5 + var6 - 2 * (var5 & var6);
      var6 = -1406473404;
      var5 = -2145195863;
      var10006 = (var5 | var6) - (var5 & var6);
      var6 = 742455030;
      var5 = var10006;
      this.G = a(
         "",
         "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謴㑸\u007f\ua7eb꒺ꁿꥊ絥蹏⑮謣㑾|\ua7e1꒦ꀾ꤬絸蹚⑯謣㑄wꟲ꒡ꁸꤋ統蹯⑶謲㑺w\ua7e8꒡",
         var10003,
         var10004,
         var10005,
         var5 + var6 - 2 * (var5 & var6)
      );
      if (this.m == pulse.TokenSettingWidget.ValueType.PLAYER && !this.n.isEmpty()) {
         List<String> var1 = this.v();
         String var2 = this.n.toLowerCase(Locale.ROOT);

         for (String var4 : var1) {
            if (var4.toLowerCase(Locale.ROOT).startsWith(var2) && !var4.equalsIgnoreCase(this.n)) {
               this.G = var4.substring(this.n.length());
               break;
            }

            if (b != b) {
               throw new IllegalStateException();
            }
         }
      }
   }

   private List<String> v() {
      ArrayList var1 = new ArrayList();
      MinecraftClient var2 = MinecraftClient.getInstance();
      if (var2.getNetworkHandler() != null) {
         for (PlayerListEntry var5 : var2.getNetworkHandler().getPlayerList()) {
            if (var5.getProfile() != null && var5.getProfile().getName() != null) {
               var1.add(var5.getProfile().getName());
            }
         }
      }

      return var1;
   }

   private void w() {
      if (!this.G.isEmpty()) {
         String var2 = this.G;
         String var1 = this.n;
         this.n = var1 + var2;
         this.r = this.n.length();
         String var10001 = "fk";
         int var10002 = (int)-2660697028960581347L;
         int var4 = -1036225635;
         int var3 = var10002;
         var10002 = var3 & ~var4 | ~var3 & var4;
         var4 = 951867074;
         var3 = var10002;
         var10002 = (var3 | var4) & ~(var3 & var4);
         var4 = 1491983020;
         var3 = 683355850;
         int var10003 = (var3 | var4) & ~(var3 & var4);
         var4 = -1472838779;
         var3 = var10003;
         var10003 = (var3 & ~var4 | ~var3 & var4) * (var3 & ~var4 | ~var3 & var4);
         var10003 = (int)1947519177195538757L;
         var4 = -842206955;
         var3 = var10003;
         var10003 = (var3 | var4) - (var3 & var4);
         var4 = 1962102628;
         var3 = var10003;
         var10003 = (var3 | var4) - (var3 & var4);
         String var10004 = "fl";
         var4 = -41765657;
         var3 = -307129596;
         int var33 = (var3 | var4) & (~var3 | ~var4);
         var4 = -1259014681;
         var3 = var33;
         int var34 = var3 + var4 - 2 * (var3 & var4);
         String var10005 = "fm";
         var4 = 1790090918;
         var3 = 1377515643;
         int var35 = (var3 | var4) & ~(var3 & var4);
         var4 = 774086207;
         var3 = var35;
         int var36 = (var3 | var4) & (~var3 | ~var4);
         String var10006 = "fn";
         var4 = -1949497180;
         var3 = 484902182;
         int var37 = (var3 | var4) & (~var3 | ~var4);
         var4 = -1758935592;
         var3 = var37;
         this.G = a(
            "", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謴㑸\u007f\ua7eb꒺ꁿꥊ絥蹏⑮謣㑾|\ua7e1꒦ꀾ꤬絸蹚⑯謣㑄wꟲ꒡ꁸꤋ統蹯⑶謲㑺w\ua7e8꒡", var10003, var34, var36, var3 & ~var4 | ~var3 & var4
         );
         this.H();
         this.t();
      }
   }

   private static void a(TokenSettingWidget var0) {
      for (TokenSettingWidget var2 : d) {
         if (var2 != var0 && var2.q) {
            int var10001 = (int)-5534311390889658603L;
            int var4 = -865668437;
            int var3 = var10001;
            var10001 = var3 & ~var4 | ~var3 & var4;
            var4 = 1643726270;
            var3 = var10001;
            var2.q = pulse.Bool.from((var3 | var4) & (~var3 | ~var4));
            pulse.AnimationState var10000 = var2.u;
            var4 = -1882797378;
            var3 = -798429001;
            int var10003 = (var3 | var4) & ~(var3 & var4);
            var4 = 1605253658;
            var3 = var10003;
            var10003 = (var3 | var4) - (var3 & var4);
            var10000.a(0.0, 0.2, pulse.Easing.h);
            var4 = 1944035352;
            var3 = 1515593247;
            var10001 = (var3 | var4) & ~(var3 & var4);
            var4 = 525418310;
            var3 = var10001;
            var10001 = ((var3 | var4) & ~(var3 & var4)) * ((var3 | var4) & ~(var3 & var4));
            String var10002 = "fo";
            var4 = -1135566933;
            var3 = -977623297;
            var10003 = (var3 | var4) - (var3 & var4);
            var4 = 802971278;
            var3 = var10003;
            var10003 = (var3 | var4) & ~(var3 & var4);
            var4 = -677329664;
            var3 = -2132008094;
            int var10004 = (var3 | var4) & ~(var3 & var4);
            var4 = -1331080;
            var3 = var10004;
            var4 = (var3 | var4) - (var3 & var4);
            var3 = var10003;
            var10003 = (var3 | var4) + (var3 & var4);
            var4 = 1633325410;
            var3 = 1683275536;
            var10003 = (var3 | var4) - (var3 & var4);
            var4 = 842127686;
            var3 = var10003;
            var10003 = var3 & ~var4 | ~var3 & var4;
            var4 = 1854322990;
            var3 = -1110936804;
            var10004 = (var3 | var4) - (var3 & var4);
            var4 = -454844065;
            var3 = var10004;
            var10004 = (var3 | var4) & (~var3 | ~var4);
            var4 = -82580257;
            var3 = 564098186;
            var10004 = var3 + var4 - 2 * (var3 & var4);
            var4 = -2027470807;
            var3 = var10004;
            var10004 = (var3 | var4) & (~var3 | ~var4);
            int var10005 = (int)8766225793440069840L;
            var4 = -1276634969;
            var3 = var10005;
            var10005 = (var3 | var4) & ~(var3 & var4);
            var4 = 1777657718;
            var3 = var10005;
            var10005 = (var3 + var4 - 2 * (var3 & var4)) * (var3 + var4 - 2 * (var3 & var4));
            var4 = -1097256208;
            var3 = -2073651188;
            var10005 = (var3 | var4) - (var3 & var4);
            var4 = 858103606;
            var3 = var10005;
            var10005 = (var3 | var4) & ~(var3 & var4);
            int var10006 = (int)-5669519585797787915L;
            var4 = 2089327486;
            var3 = var10006;
            var10006 = var3 + var4 - 2 * (var3 & var4);
            var4 = 1754433423;
            var3 = var10006;
            var10006 = (var3 | var4) & ~(var3 & var4);
            int var10007 = (int)-7363508635421368975L;
            var4 = -1548318108;
            var3 = var10007;
            var10007 = (var3 | var4) & (~var3 | ~var4);
            var4 = -1816880148;
            var3 = var10007;
            var4 = (var3 | var4) & ~(var3 & var4);
            var3 = var10006;
            var10006 = (var3 ^ var4) + 2 * (var3 & var4);
            var4 = -558046707;
            var3 = -1102675197;
            var10006 = (var3 | var4) - (var3 & var4);
            var4 = 1626818371;
            var3 = var10006;
            var2.G = a(
               "",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謴㑸\u007f\ua7eb꒺ꁿꥊ絥蹏⑮謣㑾|\ua7e1꒦ꀾ꤬絸蹚⑯謣㑄wꟲ꒡ꁸꤋ統蹯⑶謲㑺w\ua7e8꒡",
               var10003,
               var10004,
               var10005,
               var3 & ~var4 | ~var3 & var4
            );
         }
      }
   }

   public static boolean m() {
      for (TokenSettingWidget var1 : d) {
         if (var1.q) {
            int var3 = 770165259;
            int var2 = -1109862055;
            int var10000 = (var2 | var3) & ~(var2 & var3);
            var3 = -1874914477;
            var2 = var10000;
            return pulse.Bool.from(var2 + var3 - 2 * (var2 & var3));
         }
      }

      int var10 = (int)3514472724489924110L;
      int var8 = 1761765540;
      int var5 = var10;
      var10 = (var5 | var8) & (~var5 | ~var8);
      var8 = -452524374;
      var5 = var10;
      return pulse.Bool.from((var5 | var8) & (var5 ^ -1 | var8 ^ -1));
   }

   public static TokenSettingWidget n() {
      for (TokenSettingWidget var1 : d) {
         if (var1.q) {
            return var1;
         }
      }

      return null;
   }

   public static void o() {
      for (TokenSettingWidget var1 : d) {
         if (!var1.q) {
            if (c) {
               throw new RuntimeException();
            }
         } else {
            int var10001 = (int)3906509012771200320L;
            int var5 = -275691453;
            int var4 = var10001;
            var10001 = (var4 | var5) - (var4 & var5);
            var5 = 226989315;
            var4 = var10001;
            var1.q = pulse.Bool.from(var4 & ~var5 | ~var4 & var5);
            var1.u.d(0.0);
            var5 = -1060726396;
            var4 = 1574210387;
            var10001 = var4 + var5 - 2 * (var4 & var5);
            var5 = -80213644;
            var4 = var10001;
            var10001 = (var4 | var5) & (~var4 | ~var5);
            int var10002 = (int)9118762099941010122L;
            var5 = -897070296;
            var4 = var10002;
            var10002 = var4 + var5 - 2 * (var4 & var5);
            var5 = 816198285;
            var4 = var10002;
            var5 = var4 + var5 - 2 * (var4 & var5);
            var4 = var10001;
            var10001 = 2 * (var4 | var5) - (var4 ^ var5);
            var5 = 256718284;
            var4 = -1712656465;
            var10002 = (var4 | var5) - (var4 & var5);
            var5 = -6013668;
            var4 = var10002;
            var10002 = ((var4 | var5) & (~var4 | ~var5)) * ((var4 | var5) & (~var4 | ~var5));
            var5 = -1045347344;
            var4 = 584062526;
            int var10003 = var4 + var5 - 2 * (var4 & var5);
            var5 = 824735262;
            var4 = var10003;
            var10003 = var4 + var5 - 2 * (var4 & var5);
            var5 = 1811746279;
            var4 = -215320453;
            var10003 = var4 + var5 - 2 * (var4 & var5);
            var5 = -1343716696;
            var4 = var10003;
            var10003 = var4 + var5 - 2 * (var4 & var5);
            int var10004 = (int)-4112390186879603728L;
            var5 = -1591886967;
            var4 = var10004;
            var10004 = (var4 | var5) & (~var4 | ~var5);
            var5 = 2056956896;
            var4 = var10004;
            var10004 = (var4 | var5) & (~var4 | ~var5);
            var10004 = (int)7585706553663695296L;
            var5 = 1468601180;
            var4 = var10004;
            var10004 = var4 + var5 - 2 * (var4 & var5);
            var5 = -1213206593;
            var4 = var10004;
            var10004 = (var4 | var5) & (~var4 | ~var5);
            var5 = 640159531;
            var4 = -67796357;
            int var10005 = var4 & ~var5 | ~var4 & var5;
            var5 = -2113947972;
            var4 = var10005;
            var10005 = (var4 | var5) & (~var4 | ~var5);
            var5 = 762187816;
            var4 = 2055128299;
            var10005 = var4 & ~var5 | ~var4 & var5;
            var5 = 2002569301;
            var4 = var10005;
            var10005 = (var4 | var5) & ~(var4 & var5);
            String var10006 = "fp";
            var5 = 2133161424;
            var4 = -2143883899;
            int var107 = (var4 | var5) - (var4 & var5);
            var5 = -15695112;
            var4 = var107;
            var1.G = a(
               "",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謴㑸\u007f\ua7eb꒺ꁿꥊ絥蹏⑮謣㑾|\ua7e1꒦ꀾ꤬絸蹚⑯謣㑄wꟲ꒡ꁸꤋ統蹯⑶謲㑺w\ua7e8꒡",
               var10003,
               var10004,
               var10005,
               var4 & ~var5 | ~var4 & var5
            );
            var1.H();
         }

         int var10000 = (int)952511288710396521L;
         int var64 = 1045511439;
         int var29 = var10000;
         var10000 = (var29 | var64) & ~(var29 & var64);
         var64 = -1339814034;
         var29 = var10000;
         var10000 = var29 + var64 - 2 * (var29 & var64);
         int var91 = (int)2733524846436323759L;
         var64 = 1153875427;
         var29 = var91;
         var91 = (var29 | var64) - (var29 & var64);
         var64 = -1285299673;
         var29 = var91;
         var64 = (var29 | var64) & (~var29 | ~var64);
         var29 = var10000;
         var10000 = (var29 | var64) + (var29 & var64);
         var64 = 1030823387;
         var29 = -1549972807;
         var10000 = (var29 | var64) - (var29 & var64);
         var64 = -1518648566;
         var29 = var10000;
         int var3 = (var29 | var64) & (~var29 | ~var64);
         var64 = 533528888;
         var29 = 1162883533;
         var10000 = var29 + var64 - 2 * (var29 & var64);
         var64 = 1961667605;
         var29 = var10000;
         var10000 = var29 & ~var64 | ~var29 & var64;
         var64 = -874277861;
         var29 = -329853427;
         var10000 = var29 & ~var64 | ~var29 & var64;
         var64 = 949347871;
         var29 = var10000;
         if ((var29 & ~var64 | ~var29 & var64) >= var3) {
            String var84 = "fq";
            var10000 = (int)-1501857309450783406L;
            var64 = 727641889;
            var29 = var10000;
            var10000 = (var29 | var64) & ~(var29 & var64);
            var64 = -1435157551;
            var29 = var10000;
            var3 = var29 + var64 - 2 * (var29 & var64);
            b = var3;
         }
      }
   }

   @Override
   public void a(MatrixStack var1, Renderer2D var2, float var3, float var4, float var5, int var6, int var7, float var8, float var9) {
      int var49 = 1496739966;
      int var48 = -738857432;
      int var10001 = (var48 | var49) & (~var48 | ~var49);
      var49 = -1966891432;
      var48 = var10001;
      FontRenderer var10 = FontManager.a[(var48 | var49) & (~var48 | ~var49)];
      var49 = -2032377536;
      var48 = -1857587418;
      var10001 = (var48 | var49) & ~(var48 & var49);
      var49 = 396039789;
      var48 = var10001;
      var10001 = (var48 | var49) - (var48 & var49);
      float var11 = 20.0F * var9;
      String var10000 = "fr";
      float var12 = 8.0F * var9;
      this.E = var9;
      boolean var13 = GuiInput.a(var3, var4, var5, var11, var6, var7);
      this.y.a(var13);
      this.u.a();
      this.v.a();
      this.x.a();
      this.F = (float)this.x.j();
      if (!this.q) {
         this.w.d(1.0);
         var10001 = (int)-7076759558485199498L;
         var49 = 1432317405;
         var48 = var10001;
         var10001 = (var48 | var49) & ~(var48 & var49);
         var49 = 1459411114;
         var48 = var10001;
         this.A = pulse.Bool.from((var48 | var49) & (~var48 | ~var49));
      } else {
         this.w.a();
         if (this.w.d()) {
            if (this.A) {
               var10001 = (int)9018851147580952012L;
               var49 = -431848612;
               var48 = var10001;
               var10001 = var48 & ~var49 | ~var48 & var49;
               var49 = 1408061072;
               var48 = var10001;
               var10001 = (var48 | var49) & ~(var48 & var49);
            } else {
               var10001 = (int)1457028594718836086L;
               var49 = -1184449936;
               var48 = var10001;
               var10001 = var48 & ~var49 | ~var48 & var49;
               var49 = 1051410183;
               var48 = var10001;
               var10001 = (var48 | var49) & ~(var48 & var49);
            }

            this.A = pulse.Bool.from(var10001);
            double var363;
            if (!this.A) {
               var49 = -837463289;
               var48 = 1726122893;
               var10001 = var48 + var49 - 2 * (var48 & var49);
               var49 = -894197000;
               var48 = var10001;
               var10001 = var48 + var49 - 2 * (var48 & var49);
               int var10002 = (int)8312194536602236659L;
               var49 = -759679225;
               var48 = var10002;
               var10002 = var48 + var49 - 2 * (var48 & var49);
               var49 = -2073159513;
               var48 = var10002;
               var49 = (var48 | var49) & (~var48 | ~var49);
               var48 = var10001;
               var10001 = (var48 & ~var49) + (var49 & ~var48) + 2 * (var48 & var49);
               var363 = 0.3;
            } else {
               var363 = 1.0;
            }

            int var396 = (int)3523231575839330701L;
            var49 = 2043345266;
            var48 = var396;
            var396 = (var48 | var49) - (var48 & var49);
            var49 = 2115339343;
            var48 = var396;
            var396 = var48 + var49 - 2 * (var48 & var49);
            this.w.a(var363, 0.5, pulse.Easing.i);
            var10000 = "fs";
            var49 = 989849010;
            var48 = 1303253026;
            int var314 = (var48 | var49) - (var48 & var49);
            var49 = 255753808;
            var48 = var314;
            int var47 = (var48 | var49) - (var48 & var49);
            var10001 = (int)-7959978458706989078L;
            var49 = 952742924;
            var48 = var10001;
            var10001 = (var48 | var49) & (~var48 | ~var49);
            var49 = -976512009;
            var48 = var10001;
            var10001 = (var48 | var49) - (var48 & var49);
            int var315 = (int)-6400952095953581717L;
            var49 = 1090801035;
            var48 = var315;
            int var316 = var48 & ~var49 | ~var48 & var49;
            var49 = -1245997835;
            var48 = var316;
            if (((var48 | var49) & ~(var48 & var49)) >= var47) {
               int var317 = (int)-7788020927391998060L;
               var49 = -1587842833;
               var48 = var317;
               int var318 = (var48 | var49) & (~var48 | ~var49);
               var49 = 237416315;
               var48 = var318;
               int var319 = var48 + var49 - 2 * (var48 & var49);
               var10001 = (int)-7544021818533541004L;
               var49 = 501244663;
               var48 = var10001;
               var10001 = var48 + var49 - 2 * (var48 & var49);
               var49 = 1566796163;
               var48 = var10001;
               int var320 = var319 / ((var48 | var49) & (~var48 | ~var49));
            }
         }
      }

      var10000 = "ft";
      int var14 = (int)(255.0F * var8);
      float var15 = this.F * var9;
      var10000 = "fu";
      float var16 = 14.0F * var9;
      float var17 = var3 + var5 - var12 - var15;
      float var18 = var4 + var11 / 2.0F - var16 / 2.0F;
      float var323 = var17 - (var3 + var12);
      var10001 = (int)-4826140723208933176L;
      var49 = -439535342;
      var48 = var10001;
      var10001 = (var48 | var49) & (~var48 | ~var49);
      var49 = -1133089238;
      var48 = var10001;
      var10001 = var48 & ~var49 | ~var48 & var49;
      float var19 = var323 - 4.0F * var9;
      float var324 = var4 + var11 / 2.0F;
      float var372 = var10.b(this.l) * var9;
      int var399 = (int)3941264435853360517L;
      var49 = -1756941163;
      var48 = var399;
      var399 = var48 + var49 - 2 * (var48 & var49);
      var49 = -721868114;
      var48 = var399;
      var399 = (var48 | var49) & ~(var48 & var49);
      int var10003 = (int)-6423097569978695740L;
      var49 = 864998216;
      var48 = var10003;
      var10003 = (var48 | var49) & ~(var48 & var49);
      var49 = 91740334;
      var48 = var10003;
      var49 = var48 & ~var49 | ~var48 & var49;
      var48 = var399;
      var399 = (var48 ^ var49) + 2 * (var48 & var49);
      float var20 = var324 - var372 / 4.0F - 1.0F;
      this.y.a(var1, var2, var10, this.l, var3 + var12, var20, var19, var9, pulse.Theme.a, var8);
      this.B = var17;
      this.C = var18;
      this.D = var15;
      boolean var21 = GuiInput.a(var17, var18, var15, var16, var6, var7);
      if (var21 != this.z) {
         double var373 = !var21 ? 0.0 : 1.0;
         String var403 = "fv";
         this.v.a(var373, 0.15, pulse.Easing.h);
         this.z = var21;
      }

      float var22 = (float)this.u.j();
      float var23 = (float)this.v.j();
      Color var24 = ColorUtils.a(pulse.Theme.m, pulse.Theme.y, var22);
      Color var25 = ColorUtils.a(pulse.Theme.r, pulse.Theme.z, var22);
      Color var26 = pulse.Theme.a(var24, var14);
      Color var27 = pulse.Theme.a(var25, var14);
      var10003 = (int)6063140439629581067L;
      var49 = -313603371;
      var48 = var10003;
      var10003 = (var48 | var49) & (~var48 | ~var49);
      var49 = -232554027;
      var48 = var10003;
      var10003 = var48 + var49 - 2 * (var48 & var49);
      var10003 = (int)-5990550125097184394L;
      var49 = -1926150517;
      var48 = var10003;
      var10003 = (var48 | var49) & (~var48 | ~var49);
      var49 = 89675247;
      var48 = var10003;
      var10003 = var48 & ~var49 | ~var48 & var49;
      var10003 = (int)1848493119227267284L;
      var49 = -1800983966;
      var48 = var10003;
      var10003 = var48 + var49 - 2 * (var48 & var49);
      var49 = 703374005;
      var48 = var10003;
      var10003 = var48 & ~var49 | ~var48 & var49;
      float var374 = var17 - 0.5F * var9;
      String var428 = "fw";
      float var404 = var18 - 0.5F * var9;
      float var429 = var15 + var9;
      float var10004 = var16 + var9;
      int var10005 = (int)7581043862831916032L;
      var49 = 503926165;
      var48 = var10005;
      var10005 = (var48 | var49) - (var48 & var49);
      var49 = -165110251;
      var48 = var10005;
      var10005 = ((var48 | var49) - (var48 & var49)) * ((var48 | var49) - (var48 & var49));
      var2.a(var374, var404, var429, var10004, 4.0F * var9, var26, var26, var27, var27, var1);
      String var375 = "fx";
      int var28 = (int)(var23 * 3.0F);
      Color var29 = pulse.Theme.a(pulse.Theme.b(pulse.Theme.e, var28), var14);
      Color var30 = pulse.Theme.a(pulse.Theme.b(pulse.Theme.f, var28), var14);
      String var450 = "fy";
      var2.a(var17, var18, var15, var16, 4.0F * var9, var29, var29, var30, var30, var1);
      var49 = -1248232901;
      var48 = 1205288448;
      int var325 = var48 + var49 - 2 * (var48 & var49);
      var49 = 1196318905;
      var48 = var325;
      int var326 = var48 + var49 - 2 * (var48 & var49);
      var10001 = (int)-9104242806491123107L;
      var49 = 787168565;
      var48 = var10001;
      var10001 = (var48 | var49) & ~(var48 & var49);
      var49 = 549650223;
      var48 = var10001;
      var49 = (var48 | var49) - (var48 & var49);
      var48 = var326;
      int var327 = 2 * (var48 | var49) - (var48 ^ var49);
      float var31 = 5.0F * var9;
      float var32 = var17 + var31;
      float var33 = var15 - var31 * 2.0F;
      var2.b().a(var32 - 1.0F, var18, var33 + 2.0F, var16, var1);
      String var34 = this.r();
      String var35 = this.s();
      float var328 = var18 + var16 / 2.0F;
      var49 = 1135373235;
      var48 = -1885177039;
      var399 = (var48 | var49) & ~(var48 & var49);
      var49 = 1324755786;
      var48 = var399;
      var399 = ((var48 | var49) - (var48 & var49)) * ((var48 | var49) - (var48 & var49));
      var10003 = (int)-5965665469849431387L;
      var49 = 1427999127;
      var48 = var10003;
      var10003 = (var48 | var49) & (~var48 | ~var49);
      var49 = 1202531236;
      var48 = var10003;
      var10003 = (var48 | var49) & (~var48 | ~var49);
      var49 = 1713509274;
      var48 = -696566518;
      int var437 = var48 + var49 - 2 * (var48 & var49);
      var49 = 406993897;
      var48 = var437;
      var49 = (var48 | var49) & ~(var48 & var49);
      var48 = var10003;
      var10003 = var48 - ~var49 - 1;
      var49 = -327482850;
      var48 = -1347210463;
      int var438 = var48 + var49 - 2 * (var48 & var49);
      var49 = -1575683281;
      var48 = var438;
      int var439 = (var48 | var49) & (~var48 | ~var49);
      var10005 = (int)7866760755072849874L;
      var49 = -2100973094;
      var48 = var10005;
      var10005 = var48 & ~var49 | ~var48 & var49;
      var49 = -389538317;
      var48 = var10005;
      var49 = var48 & ~var49 | ~var48 & var49;
      var48 = var439;
      int var440 = var48 - ~var49 - 1;
      int var441 = (int)3496950500174989212L;
      var49 = -1754440750;
      var48 = var441;
      int var442 = (var48 | var49) & (~var48 | ~var49);
      var49 = 1750903674;
      var48 = var442;
      int var443 = var48 & ~var49 | ~var48 & var49;
      String var453 = "fz";
      var10005 = (int)4488720519616063231L;
      var49 = -1350364981;
      var48 = var10005;
      var10005 = (var48 | var49) - (var48 & var49);
      var49 = -1813056649;
      var48 = var10005;
      var10005 = var48 & ~var49 | ~var48 & var49;
      int var10006 = (int)3559317843461448209L;
      var49 = 989075525;
      var48 = var10006;
      var10006 = (var48 | var49) & ~(var48 & var49);
      var49 = -2096563947;
      var48 = var10006;
      var10006 = var48 + var49 - 2 * (var48 & var49);
      var10006 = (int)-8318682140636007895L;
      var49 = 582282793;
      var48 = var10006;
      var10006 = (var48 | var49) & (~var48 | ~var49);
      var49 = -99525935;
      var48 = var10006;
      var10006 = (var48 | var49) & (~var48 | ~var49);
      int var10007 = (int)4206998810904648870L;
      var49 = 1296364617;
      var48 = var10007;
      var10007 = var48 & ~var49 | ~var48 & var49;
      var49 = 469919939;
      var48 = var10007;
      var10007 = (var48 + var49 - 2 * (var48 & var49)) * (var48 + var49 - 2 * (var48 & var49));
      var49 = -1988196292;
      var48 = 1271722137;
      var10007 = var48 + var49 - 2 * (var48 & var49);
      var49 = -1023691556;
      var48 = var10007;
      float var378 = var10.b(
            a(
               "뛣",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謴㑸\u007f\ua7eb꒺ꁿꥊ絥蹏⑮謣㑾|\ua7e1꒦ꀾ꤬絸蹚⑯謣㑄wꟲ꒡ꁸꤋ統蹯⑶謲㑺w\ua7e8꒡",
               var443,
               var10005,
               var10006,
               (var48 | var49) & (~var48 | ~var49)
            )
         )
         * var9;
      var49 = -139524220;
      var48 = 1811828088;
      var399 = (var48 | var49) - (var48 & var49);
      var49 = 86305496;
      var48 = var399;
      var399 = ((var48 | var49) & ~(var48 & var49)) * ((var48 | var49) & ~(var48 & var49));
      float var36 = var328 - var378 / 4.0F;
      if (this.n.isEmpty() && !this.q) {
         String var45 = this.o;
         String var44 = var34;
         String var51 = var44 + var45;
         if (!var51.isEmpty()) {
            Color var55 = pulse.Theme.a(pulse.Theme.b, var14);
            var1.push();
            var1.translate(var32, var36, 0.0F);
            var1.scale(var9, var9, 1.0F);
            var1.translate(-var32, -var36, 0.0F);
            var10.a(var51, var32, var36, var55, var1);
            var1.pop();
         }
      } else {
         if (this.G()) {
            int var37 = Math.min(this.s, this.t);
            int var38 = Math.max(this.s, this.t);
            float var39 = var10.a(var34) * var9;
            float var40 = var32 + var39 + var10.a(this.n, var37) * var9;
            float var41 = var32 + var39 + var10.a(this.n, var38) * var9;
            float var42 = var41 - var40;
            Color var43 = new Color(pulse.Theme.A.getRed(), pulse.Theme.A.getGreen(), pulse.Theme.A.getBlue(), (int)(pulse.Theme.A.getAlpha() * var8));
            float var409 = var18 + 2.0F * var9;
            var10005 = (int)4310552971936384257L;
            var49 = -590476627;
            var48 = var10005;
            var10005 = (var48 | var49) & (~var48 | ~var49);
            var49 = -749752283;
            var48 = var10005;
            var10005 = (var48 & ~var49 | ~var48 & var49) * (var48 & ~var49 | ~var48 & var49);
            var2.a(var40, var409, var42, var16 - 4.0F * var9, 2.0F * var9, var43, var1);
         }

         Color var50 = pulse.Theme.a(pulse.Theme.a, var14);
         var1.push();
         var1.translate(var32, var36, 0.0F);
         var1.scale(var9, var9, 1.0F);
         var1.translate(-var32, -var36, 0.0F);
         var10.a(var35, var32, var36, var50, var1);
         var1.pop();
         if (this.m == pulse.TokenSettingWidget.ValueType.PLAYER && !this.G.isEmpty() && this.q) {
            float var53 = var32 + var10.a(var35) * var9;
            Color var57 = pulse.Theme.a(pulse.Theme.d, var14);
            var1.push();
            var1.translate(var53, var36, 0.0F);
            var1.scale(var9, var9, 1.0F);
            var1.translate(-var53, -var36, 0.0F);
            var10.a(this.G, var53, var36, var57, var1);
            var1.pop();
         }

         if (this.q) {
            if (this.G()) {
               var10001 = (int)-5809406731154371136L;
               var49 = -1891707756;
               var48 = var10001;
               var10001 = (var48 | var49) & ~(var48 & var49);
               var49 = 116988230;
               var48 = var10001;
               var10001 = (var48 | var49) & (~var48 | ~var49);
               var49 = 2038131797;
               var48 = -1323001969;
               var10001 = (var48 | var49) & (~var48 | ~var49);
               var49 = -933233719;
               var48 = var10001;
               var10001 = (var48 | var49) - (var48 & var49);
               var49 = 1733474571;
               var48 = -734928379;
               var10001 = (var48 | var49) & (~var48 | ~var49);
               var49 = -1285334242;
               var48 = var10001;
               var10001 = var48 & ~var49 | ~var48 & var49;
               var49 = -1668757840;
               var48 = 1227582934;
               int var329 = (var48 | var49) & ~(var48 & var49);
               var49 = -2137326077;
               var48 = var329;
               int var63 = var48 + var49 - 2 * (var48 & var49);
               b = var63;
               var49 = 1976012102;
               var48 = 1069758145;
               int var330 = (var48 | var49) & ~(var48 & var49);
               var49 = -577596159;
               var48 = var330;
               int var331 = var48 & ~var49 | ~var48 & var49;
               var10001 = (int)2064670969415436802L;
               var49 = 149864686;
               var48 = var10001;
               var10001 = (var48 | var49) - (var48 & var49);
               var49 = 1152323920;
               var48 = var10001;
               var49 = var48 + var49 - 2 * (var48 & var49);
               var48 = var331;
               int var332 = (var48 & ~var49) + (var49 & ~var48) + 2 * (var48 & var49);
               int var333 = (int)-3381654651803663358L;
               var49 = -711342104;
               var48 = var333;
               int var334 = var48 + var49 - 2 * (var48 & var49);
               var49 = 1181906316;
               var48 = var334;
               if (((var48 | var49) & (~var48 | ~var49)) < b) {
                  var49 = -798012476;
                  var48 = 298817622;
                  int var335 = (var48 | var49) & ~(var48 & var49);
                  var49 = 847832283;
                  var48 = var335;
                  int var336 = (var48 | var49) & ~(var48 & var49);
                  int var337 = (int)3894595374354275164L;
                  var49 = -1885910672;
                  var48 = var337;
                  int var338 = (var48 | var49) - (var48 & var49);
                  var49 = 585487790;
                  var48 = var338;
                  var63 = var48 & ~var49 | ~var48 & var49;
                  b = var63;
               }
            } else {
               float var54 = (float)this.w.j();
               String var388 = "ga";
               if (!(var54 > 0.3F)) {
                  var49 = -1847869680;
                  var48 = -1752879935;
                  int var339 = (var48 | var49) & (~var48 | ~var49);
                  var49 = 120846199;
                  var48 = var339;
                  int var340 = (var48 | var49) & ~(var48 & var49);
                  int var341 = (int)-1331608571190551525L;
                  var49 = -661007169;
                  var48 = var341;
                  int var342 = (var48 | var49) & (~var48 | ~var49);
                  var49 = -1161690212;
                  var48 = var342;
                  int var65 = (var48 | var49) & (~var48 | ~var49);
                  var49 = 1886260533;
                  var48 = 761917109;
                  var10001 = var48 & ~var49 | ~var48 & var49;
                  var49 = 1560798089;
                  var48 = var10001;
                  var10001 = (var48 | var49) & ~(var48 & var49);
                  int var343 = (int)-9066075995137288870L;
                  var49 = -1342617871;
                  var48 = var343;
                  int var344 = (var48 | var49) - (var48 & var49);
                  var49 = 285837715;
                  var48 = var344;
                  if ((var48 | var49) - (var48 & var49) >= var65) {
                     int var345 = (int)8562314245355371563L;
                     var49 = 475133972;
                     var48 = var345;
                     int var346 = var48 + var49 - 2 * (var48 & var49);
                     var49 = -308942004;
                     var48 = var346;
                     int var347 = var48 + var49 - 2 * (var48 & var49);
                     var10001 = (int)-8342067083831976344L;
                     var49 = 1521887664;
                     var48 = var10001;
                     var10001 = var48 & ~var49 | ~var48 & var49;
                     var49 = 612845133;
                     var48 = var10001;
                     var49 = var48 & ~var49 | ~var48 & var49;
                     var48 = var347;
                     int var348 = (var48 & ~var49) + (var49 & ~var48) + 2 * (var48 & var49);
                     var49 = 1255037479;
                     var48 = -1771404606;
                     int var349 = var48 + var49 - 2 * (var48 & var49);
                     var49 = -187511227;
                     var48 = var349;
                     var65 = (var48 | var49) - (var48 & var49);
                  }
               } else {
                  float var58 = var10.a(var34) * var9;
                  float var60 = var32 + var58 + var10.a(this.n, this.r) * var9;
                  Color var350 = pulse.Theme.a;
                  var399 = (int)-1161835171588788817L;
                  var49 = -1918187232;
                  var48 = var399;
                  var399 = (var48 | var49) - (var48 & var49);
                  var49 = -1605376894;
                  var48 = var399;
                  var399 = (var48 | var49) & (~var48 | ~var49);
                  var399 = (int)7844897787915507957L;
                  var49 = -226619218;
                  var48 = var399;
                  var399 = (var48 | var49) - (var48 & var49);
                  var49 = -1450342305;
                  var48 = var399;
                  var399 = (var48 | var49) & (~var48 | ~var49);
                  Color var62 = pulse.Theme.a(var350, (int)(255.0F * var8 * var54));
                  String var434 = "gb";
                  float var416 = var18 + 3.0F * var9;
                  float var435 = 1.0F * var9;
                  var49 = -2045448575;
                  var48 = 1564853390;
                  var10005 = (var48 | var49) & ~(var48 & var49);
                  var49 = 1577717382;
                  var48 = var10005;
                  var10005 = var48 + var49 - 2 * (var48 & var49);
                  var2.a(var60, var416, var435, var16 - 6.0F * var9, var62, var1);
               }
            }
         }
      }

      if (this.n.isEmpty() && this.q && !this.G()) {
         float var52 = (float)this.w.j();
         float var56 = var10.a(var34) * var9;
         Color var59 = pulse.Theme.a(pulse.Theme.a, var14);
         var1.push();
         var1.translate(var32, var36, 0.0F);
         var1.scale(var9, var9, 1.0F);
         var1.translate(-var32, -var36, 0.0F);
         var10.a(var34, var32, var36, var59, var1);
         var1.pop();
         String var393 = "gc";
         Color var61 = pulse.Theme.a(pulse.Theme.a, (int)(255.0F * var8 * var52));
         float var394 = var32 + var56;
         var49 = 702408145;
         var48 = -793043961;
         int var444 = (var48 | var49) - (var48 & var49);
         var49 = -110691885;
         var48 = var444;
         int var445 = var48 + var49 - 2 * (var48 & var49);
         var49 = -212133118;
         var48 = -1275246421;
         int var446 = (var48 | var49) & ~(var48 & var49);
         var49 = 1084642235;
         var48 = var446;
         int var447 = (var48 | var49) & (~var48 | ~var49);
         float var417 = var18 + 3.0F * var9;
         float var436 = 1.0F * var9;
         var49 = -628868879;
         var48 = 1110965474;
         var10005 = var48 + var49 - 2 * (var48 & var49);
         var49 = -6081572;
         var48 = var10005;
         var10005 = (var48 | var49) & (~var48 | ~var49);
         var49 = -1099773985;
         var48 = 148615297;
         var10006 = (var48 | var49) & (~var48 | ~var49);
         var49 = -1356158860;
         var48 = var10006;
         var49 = var48 & ~var49 | ~var48 & var49;
         var48 = var10005;
         var10005 = (var48 | var49) + (var48 & var49);
         var2.a(var394, var417, var436, var16 - 6.0F * var9, var61, var1);
      }

      var2.b().a(var1);
      if (var21 || this.q) {
         GuiInput.g();
      }
   }

   @Override
   public boolean a(float var1, float var2, float var3, int var4, int var5) {
      int var10000 = (int)1142542971697558623L;
      int var18 = 890314793;
      int var17 = var10000;
      var10000 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1868605188;
      var17 = var10000;
      var10000 = ((var17 | var18) & (~var17 | ~var18)) * ((var17 | var18) & (~var17 | ~var18));
      float var6 = 8.0F;
      float var7 = this.F;
      var18 = -705008734;
      var17 = 798431424;
      var10000 = (var17 | var18) - (var17 & var18);
      var18 = 829576551;
      var17 = var10000;
      var10000 = var17 + var18 - 2 * (var17 & var18);
      float var8 = 14.0F;
      float var9 = var1 + var3 - var6 - var7;
      int var10002 = (int)-7436761694490013572L;
      var18 = 1330408883;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -1208173119;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var10002 = (int)963710361954471721L;
      var18 = -136210595;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 692672612;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1483102775;
      var17 = 1890288483;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -684579141;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var10002 = (int)-2293876864342994291L;
      var18 = 1971030612;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 1126357212;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      float var10 = var2 + 10.0F - var8 / 2.0F;
      if (!GuiInput.a(var9, var10, var7, var8, var4, var5)) {
         if (this.q) {
            var18 = 415267924;
            var17 = 1440678263;
            int var162 = var17 + var18 - 2 * (var17 & var18);
            var18 = 1293909283;
            var17 = var162;
            this.q = pulse.Bool.from((var17 | var18) & (~var17 | ~var18));
            var10002 = (int)-8204245958608210892L;
            var18 = -275357805;
            var17 = var10002;
            var10002 = var17 & ~var18 | ~var17 & var18;
            var18 = -100126411;
            var17 = var10002;
            var10002 = ((var17 | var18) & (~var17 | ~var18)) * ((var17 | var18) & (~var17 | ~var18));
            this.u.a(0.0, 0.2, pulse.Easing.h);
            String var163 = "gd";
            var18 = -1549322235;
            var17 = -1764391815;
            var10002 = var17 + var18 - 2 * (var17 & var18);
            var18 = 1804416081;
            var17 = var10002;
            var10002 = ((var17 | var18) - (var17 & var18)) * ((var17 | var18) - (var17 & var18));
            var18 = 174890408;
            var17 = 429812653;
            int var187 = (var17 | var18) - (var17 & var18);
            var18 = 1683243552;
            var17 = var187;
            var187 = (var17 | var18) - (var17 & var18);
            int var10004 = (int)2723022578764979258L;
            var18 = -827516933;
            var17 = var10004;
            var10004 = (var17 | var18) & ~(var17 & var18);
            var18 = 1445074202;
            var17 = var10004;
            var18 = var17 & ~var18 | ~var17 & var18;
            var17 = var187;
            var187 = (var17 & ~var18) + (var18 & ~var17) + 2 * (var17 & var18);
            var187 = (int)3802028060165071860L;
            var18 = 120086152;
            var17 = var187;
            var187 = (var17 | var18) - (var17 & var18);
            var18 = 1076054600;
            var17 = var187;
            var187 = (var17 | var18) & (~var17 | ~var18);
            String var194 = "ge";
            var18 = -1746264522;
            var17 = 1773380122;
            var10004 = (var17 | var18) - (var17 & var18);
            var18 = -1028312034;
            var17 = var10004;
            var10004 = (var17 | var18) - (var17 & var18);
            var18 = 130060734;
            var17 = -2085467192;
            int var10005 = var17 & ~var18 | ~var17 & var18;
            var18 = 2017296845;
            var17 = var10005;
            var10005 = (var17 | var18) & (~var17 | ~var18);
            var10005 = (int)-6316637415770766878L;
            var18 = 322044530;
            var17 = var10005;
            var10005 = var17 + var18 - 2 * (var17 & var18);
            var18 = -1011461519;
            var17 = var10005;
            var10005 = (var17 | var18) & (~var17 | ~var18);
            var18 = 77089577;
            var17 = -1656314187;
            int var10006 = (var17 | var18) - (var17 & var18);
            var18 = 1993486716;
            var17 = var10006;
            var10006 = (var17 | var18) & (~var17 | ~var18);
            var18 = 1978880047;
            var17 = 1436616127;
            var10006 = (var17 | var18) - (var17 & var18);
            var18 = 542416614;
            var17 = var10006;
            this.G = a(
               "",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謴㑸\u007f\ua7eb꒺ꁿꥊ絥蹏⑮謣㑾|\ua7e1꒦ꀾ꤬絸蹚⑯謣㑄wꟲ꒡ꁸꤋ統蹯⑶謲㑺w\ua7e8꒡",
               var187,
               var10004,
               var10005,
               (var17 | var18) & ~(var17 & var18)
            );
         }

         var10000 = (int)5917624173606751412L;
         var18 = -542874024;
         var17 = var10000;
         var10000 = (var17 | var18) - (var17 & var18);
         var18 = -507761940;
         var17 = var10000;
         return pulse.Bool.from(var17 + var18 - 2 * (var17 & var18));
      } else {
         a(this);
         if (!this.q) {
            int var10001 = (int)-5199310406390475762L;
            var18 = -882969301;
            var17 = var10001;
            var10001 = var17 + var18 - 2 * (var17 & var18);
            var18 = 1296326948;
            var17 = var10001;
            this.q = pulse.Bool.from(var17 & ~var18 | ~var17 & var18);
            var18 = 272029732;
            var17 = -686829619;
            var10002 = (var17 | var18) - (var17 & var18);
            var18 = 602715396;
            var17 = var10002;
            var10002 = var17 + var18 - 2 * (var17 & var18);
            var18 = -999165765;
            var17 = -136494359;
            int var10003 = var17 + var18 - 2 * (var17 & var18);
            var18 = 1838869774;
            var17 = var10003;
            var18 = (var17 | var18) & ~(var17 & var18);
            var17 = var10002;
            var10002 = (var17 ^ var18) + 2 * (var17 & var18);
            this.u.a(1.0, 0.2, pulse.Easing.h);
            this.w.d(1.0);
            var18 = -327803946;
            var17 = -333470513;
            var10001 = var17 + var18 - 2 * (var17 & var18);
            var18 = 6930201;
            var17 = var10001;
            this.A = pulse.Bool.from(var17 & ~var18 | ~var17 & var18);
            var10001 = (int)-7034167023384790634L;
            var18 = -1928857896;
            var17 = var10001;
            var10001 = (var17 | var18) & (~var17 | ~var18);
            var18 = 510520045;
            var17 = var10001;
            var10001 = var17 & ~var18 | ~var17 & var18;
            var10002 = (int)3268993802129107808L;
            var18 = 1208548420;
            var17 = var10002;
            var10002 = (var17 | var18) & ~(var17 & var18);
            var18 = -1046595482;
            var17 = var10002;
            var18 = (var17 | var18) & ~(var17 & var18);
            var17 = var10001;
            var10001 = (var17 ^ var18) + 2 * (var17 & var18);
            var10002 = (int)-1333889591456216898L;
            var18 = 1879883609;
            var17 = var10002;
            var10002 = (var17 | var18) - (var17 & var18);
            var18 = -1410379971;
            var17 = var10002;
            var10002 = (var17 | var18) - (var17 & var18);
            this.w.a(0.3, 0.5, pulse.Easing.i);
         }

         int var159 = (int)3032935742648291042L;
         var18 = -1809924199;
         var17 = var159;
         var159 = var17 + var18 - 2 * (var17 & var18);
         var18 = -1958891147;
         var17 = var159;
         FontRenderer var11 = FontManager.a[var17 + var18 - 2 * (var17 & var18)];
         String var12 = this.r();
         float var13 = var11.a(var12);
         var10000 = (int)545292459059822906L;
         var18 = -877159344;
         var17 = var10000;
         var10000 = (var17 | var18) & ~(var17 & var18);
         var18 = -1519625344;
         var17 = var10000;
         var10000 = var17 & ~var18 | ~var17 & var18;
         var18 = 193961717;
         var17 = 1884663914;
         var159 = var17 + var18 - 2 * (var17 & var18);
         var18 = -902487592;
         var17 = var159;
         var18 = var17 & ~var18 | ~var17 & var18;
         var17 = var10000;
         var10000 = (var17 | var18) + (var17 & var18);
         float var14 = 5.0F;
         float var15 = var9 + var14 + var13;
         float var16 = var4 - var15;
         this.r = var11.a(this.n, var16);
         this.H();
         this.u();
         var10000 = (int)7770732024713082486L;
         var18 = -400995085;
         var17 = var10000;
         var10000 = (var17 | var18) & (~var17 | ~var18);
         var18 = 299842180;
         var17 = var10000;
         return pulse.Bool.from((var17 | var18) & (var17 ^ -1 | var18 ^ -1));
      }
   }

   @Override
   public boolean a(int var1, int var2, int var3) {
      if (this.q) {
         int var116 = -1676838238;
         int var9 = -324131791;
         int var10001 = (var9 | var116) & (~var9 | ~var116);
         var116 = 1889754769;
         var9 = var10001;
         var116 = var9 & ~var116 | ~var9 & var116;
         var9 = var3;
         int var224;
         if ((~var9 | var116) - ~var9 == 0) {
            var224 = (int)6114798859156076007L;
            var116 = -2142205672;
            var9 = var224;
            var224 = (var9 | var116) & ~(var9 & var116);
            var116 = -1331249921;
            var9 = var224;
            var224 = var9 + var116 - 2 * (var9 & var116);
         } else {
            var224 = (int)-2012696130754938585L;
            var116 = 1231546916;
            var9 = var224;
            var224 = (var9 | var116) & ~(var9 & var116);
            var116 = 753636098;
            var9 = var224;
            var224 = (var9 | var116) & ~(var9 & var116);
         }

         int var4 = var224;
         var116 = 1225825838;
         var9 = -131140973;
         var10001 = var9 + var116 - 2 * (var9 & var116);
         var116 = -1321308996;
         var9 = var10001;
         var116 = (var9 | var116) & (~var9 | ~var116);
         var9 = var3;
         if ((~var9 | var116) - ~var9 == 0) {
            var116 = 1739550313;
            var9 = -183289091;
            var224 = var9 & ~var116 | ~var9 & var116;
            var116 = -1833151340;
            var9 = var224;
            var224 = (var9 | var116) - (var9 & var116);
         } else {
            var116 = -1735626375;
            var9 = -1909972237;
            var224 = (var9 | var116) - (var9 & var116);
            var116 = 379868043;
            var9 = var224;
            var224 = (var9 | var116) - (var9 & var116);
         }

         int var5 = var224;
         if (var4 != 0) {
            switch (var1) {
               case 65:
                  this.C();
                  var116 = -1400127229;
                  var9 = 1743578677;
                  var224 = var9 + var116 - 2 * (var9 & var116);
                  var116 = -882432201;
                  var9 = var224;
                  return pulse.Bool.from((var9 | var116) & (var9 & var116 ^ -1));
               case 67:
                  this.D();
                  var224 = (int)5254154364019233048L;
                  var116 = 168050360;
                  var9 = var224;
                  var224 = (var9 | var116) & ~(var9 & var116);
                  var116 = 1684762529;
                  var9 = var224;
                  return pulse.Bool.from(var9 & (var116 ^ -1) | (var9 ^ -1) & var116);
               case 86:
                  this.E();
                  var224 = (int)-1038250769804333968L;
                  var116 = -1346040993;
                  var9 = var224;
                  var224 = (var9 | var116) - (var9 & var116);
                  var116 = 1372350254;
                  var9 = var224;
                  return pulse.Bool.from(var9 + var116 - 2 * (var9 & var116));
               case 88:
                  this.F();
                  var116 = -392135344;
                  var9 = -1905540862;
                  var224 = (var9 | var116) - (var9 & var116);
                  var116 = 1724628051;
                  var9 = var224;
                  return pulse.Bool.from((var9 | var116) & (var9 & var116 ^ -1));
            }
         }

         switch (var1) {
            case 256:
               var10001 = (int)-1667221053948285811L;
               var116 = -1519086431;
               var9 = var10001;
               var10001 = (var9 | var116) & ~(var9 & var116);
               var116 = 1076410412;
               var9 = var10001;
               this.q = pulse.Bool.from((var9 | var116) & (~var9 | ~var116));
               pulse.AnimationState var243 = this.u;
               int var279 = (int)-4585438540887478711L;
               var116 = -1800279832;
               var9 = var279;
               var279 = var9 & ~var116 | ~var9 & var116;
               var116 = -2085239126;
               var9 = var279;
               var279 = var9 & ~var116 | ~var9 & var116;
               var116 = 987186731;
               var9 = 550127653;
               var279 = var9 + var116 - 2 * (var9 & var116);
               var116 = 438111755;
               var9 = var279;
               var279 = var9 + var116 - 2 * (var9 & var116);
               var243.a(0.0, 0.2, pulse.Easing.h);
               var10001 = (int)6938642521663566561L;
               var116 = 1813863721;
               var9 = var10001;
               var10001 = (var9 | var116) & (~var9 | ~var116);
               var116 = 878880160;
               var9 = var10001;
               var10001 = (var9 | var116) & ~(var9 & var116);
               var116 = -1463017619;
               var9 = -1532711484;
               int var271 = (var9 | var116) & ~(var9 & var116);
               var116 = -292656503;
               var9 = var271;
               var116 = (var9 | var116) - (var9 & var116);
               var9 = var10001;
               var10001 = (var9 ^ var116) + 2 * (var9 & var116);
               var271 = (int)-9184055305651079608L;
               var116 = 1061118678;
               var9 = var271;
               var271 = var9 + var116 - 2 * (var9 & var116);
               var116 = -2041525290;
               var9 = var271;
               var271 = var9 + var116 - 2 * (var9 & var116);
               var279 = (int)2112610232702111237L;
               var116 = 1566094684;
               var9 = var279;
               var279 = (var9 | var116) & (~var9 | ~var116);
               var116 = 1083391343;
               var9 = var279;
               var116 = (var9 | var116) - (var9 & var116);
               var9 = var271;
               var271 = (var9 & ~var116) + (var116 & ~var9) + 2 * (var9 & var116);
               var279 = (int)8083984042458788144L;
               var116 = 1872458797;
               var9 = var279;
               var279 = var9 + var116 - 2 * (var9 & var116);
               var116 = 489079057;
               var9 = var279;
               var279 = (var9 | var116) & ~(var9 & var116);
               int var293 = (int)-1759812089501393188L;
               var116 = 282020766;
               var9 = var293;
               var293 = var9 + var116 - 2 * (var9 & var116);
               var116 = 1522188744;
               var9 = var293;
               var116 = var9 + var116 - 2 * (var9 & var116);
               var9 = var279;
               var279 = var9 - ~var116 - 1;
               var116 = -2012672643;
               var9 = -342085757;
               var279 = (var9 | var116) & (~var9 | ~var116);
               var116 = 1420481994;
               var9 = var279;
               var279 = var9 & ~var116 | ~var9 & var116;
               var116 = -1436885449;
               var9 = 373936172;
               var293 = var9 + var116 - 2 * (var9 & var116);
               var116 = -1685498753;
               var9 = var293;
               var293 = var9 & ~var116 | ~var9 & var116;
               var293 = (int)-8295130017692132547L;
               var116 = 174688650;
               var9 = var293;
               var293 = (var9 | var116) - (var9 & var116);
               var116 = -116393031;
               var9 = var293;
               var293 = var9 & ~var116 | ~var9 & var116;
               String var306 = "gf";
               var116 = 377561724;
               var9 = -907193078;
               int var307 = var9 & ~var116 | ~var9 & var116;
               var116 = -745679512;
               var9 = var307;
               int var308 = var9 + var116 - 2 * (var9 & var116);
               int var10007 = (int)-5951933852994943016L;
               var116 = -92041336;
               var9 = var10007;
               var10007 = (var9 | var116) & ~(var9 & var116);
               var116 = -14759846;
               var9 = var10007;
               var10007 = (var9 | var116) & (~var9 | ~var116);
               int var317 = (int)-4465290023799216201L;
               var116 = -861070955;
               var9 = var317;
               var317 = (var9 | var116) & (~var9 | ~var116);
               var116 = 1693850421;
               var9 = var317;
               this.G = a(
                  "",
                  "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謴㑸\u007f\ua7eb꒺ꁿꥊ絥蹏⑮謣㑾|\ua7e1꒦ꀾ꤬絸蹚⑯謣㑄wꟲ꒡ꁸꤋ統蹯⑶謲㑺w\ua7e8꒡",
                  var279,
                  var293,
                  var308,
                  (var9 | var116) & ~(var9 & var116)
               );
               this.H();
               var116 = 48166665;
               var9 = -280916014;
               var224 = (var9 | var116) & (~var9 | ~var116);
               var116 = -308315942;
               var9 = var224;
               return pulse.Bool.from((var9 | var116) & (var9 & var116 ^ -1));
            case 257:
               var10001 = (int)-4877425168175588046L;
               var116 = 642773645;
               var9 = var10001;
               var10001 = (var9 | var116) & ~(var9 & var116);
               var116 = -1642598465;
               var9 = var10001;
               this.q = pulse.Bool.from((var9 | var116) & (~var9 | ~var116));
               int var10002 = (int)2207147059077390074L;
               var116 = 95906727;
               var9 = var10002;
               var10002 = var9 & ~var116 | ~var9 & var116;
               var116 = -394636345;
               var9 = var10002;
               var10002 = var9 + var116 - 2 * (var9 & var116);
               this.u.a(0.0, 0.2, pulse.Easing.h);
               var10001 = (int)259576320338738048L;
               var116 = 1796350753;
               var9 = var10001;
               var10001 = var9 + var116 - 2 * (var9 & var116);
               var116 = -1122232430;
               var9 = var10001;
               var10001 = var9 & ~var116 | ~var9 & var116;
               var10002 = (int)-94331343427842669L;
               var116 = 64159916;
               var9 = var10002;
               var10002 = var9 & ~var116 | ~var9 & var116;
               var116 = 44082203;
               var9 = var10002;
               var116 = var9 + var116 - 2 * (var9 & var116);
               var9 = var10001;
               var10001 = 2 * (var9 | var116) - (var9 ^ var116);
               var10002 = (int)-3909026999371708189L;
               var116 = -2144381641;
               var9 = var10002;
               var10002 = var9 + var116 - 2 * (var9 & var116);
               var116 = -855231633;
               var9 = var10002;
               var10002 = ((var9 | var116) & (~var9 | ~var116)) * ((var9 | var116) & (~var9 | ~var116));
               String var10003 = "gg";
               int var276 = (int)-7172588847832398202L;
               var116 = 426074626;
               var9 = var276;
               int var277 = (var9 | var116) - (var9 & var116);
               var116 = -882961488;
               var9 = var277;
               int var278 = var9 + var116 - 2 * (var9 & var116);
               var116 = -2015236330;
               var9 = 1198092664;
               int var10005 = (var9 | var116) & ~(var9 & var116);
               var116 = -1064788373;
               var9 = var10005;
               var10005 = (var9 | var116) & (~var9 | ~var116);
               var10005 = (int)-5146372346143862202L;
               var116 = -146882229;
               var9 = var10005;
               var10005 = var9 & ~var116 | ~var9 & var116;
               var116 = -586329339;
               var9 = var10005;
               var10005 = (var9 | var116) - (var9 & var116);
               var116 = -1135504864;
               var9 = -1971566956;
               int var10004 = (var9 | var116) & (~var9 | ~var116);
               var116 = 216922606;
               var9 = var10004;
               var10004 = (var9 | var116) - (var9 & var116);
               var116 = 383136695;
               var9 = -508188335;
               int var10006 = var9 + var116 - 2 * (var9 & var116);
               var116 = -144467228;
               var9 = var10006;
               var10006 = (var9 | var116) & ~(var9 & var116);
               var116 = -136582509;
               var9 = -247085319;
               var10006 = (var9 | var116) & (~var9 | ~var116);
               var116 = 111029354;
               var9 = var10006;
               var10006 = (var9 | var116) & ~(var9 & var116);
               var116 = 1847907334;
               var9 = 1471914009;
               var10006 = (var9 | var116) & (~var9 | ~var116);
               var116 = 966751245;
               var9 = var10006;
               var10006 = (var9 | var116) & ~(var9 & var116);
               var116 = -1586596137;
               var9 = -263469216;
               var10005 = (var9 | var116) & ~(var9 & var116);
               var116 = 1288877444;
               var9 = var10005;
               var10005 = (var9 | var116) & (~var9 | ~var116);
               String var314 = "gh";
               var10006 = (int)4960646886237467065L;
               var116 = -802355369;
               var9 = var10006;
               var10006 = (var9 | var116) & (~var9 | ~var116);
               var116 = -1503240307;
               var9 = var10006;
               this.G = a(
                  "",
                  "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謴㑸\u007f\ua7eb꒺ꁿꥊ絥蹏⑮謣㑾|\ua7e1꒦ꀾ꤬絸蹚⑯謣㑄wꟲ꒡ꁸꤋ統蹯⑶謲㑺w\ua7e8꒡",
                  var278,
                  var10004,
                  var10005,
                  var9 & ~var116 | ~var9 & var116
               );
               this.H();
               var224 = (int)726061890241875331L;
               var116 = -1422551206;
               var9 = var224;
               var224 = (var9 | var116) & ~(var9 & var116);
               var116 = -1746576680;
               var9 = var224;
               return pulse.Bool.from((var9 | var116) & (var9 & var116 ^ -1));
            case 258:
               if (this.m != pulse.TokenSettingWidget.ValueType.PLAYER) {
                  var116 = 1861770219;
                  var9 = 451915265;
                  var224 = var9 + var116 - 2 * (var9 & var116);
                  var116 = 1947727338;
                  var9 = var224;
                  return pulse.Bool.from((var9 | var116) & (var9 & var116 ^ -1));
               }

               this.w();
               var224 = (int)-541892132540855925L;
               var116 = 1625861126;
               var9 = var224;
               var224 = (var9 | var116) & (~var9 | ~var116);
               var116 = -1648728692;
               var9 = var224;
               return pulse.Bool.from(var9 + var116 - 2 * (var9 & var116));
            case 259:
               this.y();
               var116 = -858747685;
               var9 = -1420579588;
               var224 = (var9 | var116) - (var9 & var116);
               var116 = 1736646694;
               var9 = var224;
               return pulse.Bool.from((var9 | var116) & (var9 ^ -1 | var116 ^ -1));
            case 260:
            case 264:
            case 265:
            case 266:
            case 267:
            default:
               var224 = (int)-4209663337391594970L;
               var116 = -1165448480;
               var9 = var224;
               var224 = (var9 | var116) & ~(var9 & var116);
               var116 = 742475974;
               var9 = var224;
               return pulse.Bool.from(var9 + var116 - 2 * (var9 & var116));
            case 261:
               this.z();
               var116 = 1679841866;
               var9 = 1339022453;
               var224 = (var9 | var116) & ~(var9 & var116);
               var116 = 737117758;
               var9 = var224;
               return pulse.Bool.from(var9 & (var116 ^ -1) | (var9 ^ -1) & var116);
            case 262:
               this.b(pulse.Bool.from(var5), pulse.Bool.from(var4));
               var116 = -817194105;
               var9 = 1601024796;
               var224 = (var9 | var116) - (var9 & var116);
               var116 = -1876481894;
               var9 = var224;
               return pulse.Bool.from(var9 & (var116 ^ -1) | (var9 ^ -1) & var116);
            case 263:
               this.a(pulse.Bool.from(var5), pulse.Bool.from(var4));
               var116 = 165010581;
               var9 = 355403793;
               var224 = var9 & ~var116 | ~var9 & var116;
               var116 = 486200453;
               var9 = var224;
               return pulse.Bool.from(var9 & (var116 ^ -1) | (var9 ^ -1) & var116);
            case 268:
               this.a(pulse.Bool.from(var5));
               var116 = -468047234;
               var9 = 1500468203;
               var224 = var9 + var116 - 2 * (var9 & var116);
               var116 = -1116374636;
               var9 = var224;
               return pulse.Bool.from((var9 | var116) - (var9 & var116));
            case 269:
               this.b(pulse.Bool.from(var5));
               var116 = 932484729;
               var9 = 1154537249;
               var224 = (var9 | var116) & (~var9 | ~var116);
               var116 = 1933853017;
               var9 = var224;
               return pulse.Bool.from(var9 + var116 - 2 * (var9 & var116));
         }
      } else {
         int var7 = -1751904970;
         int var6 = -882087937;
         int var10000 = var6 & ~var7 | ~var6 & var7;
         var7 = 1559784137;
         var6 = var10000;
         return pulse.Bool.from((var6 | var7) & (var6 ^ -1 | var7 ^ -1));
      }
   }

   @Override
   public boolean a(char var1, int var2) {
      if (this.q) {
         if (!Character.isISOControl(var1)) {
            if (this.a(var1)) {
               int var139 = this.n.length();
               int var78 = -786860361;
               int var16 = 112823611;
               int var10001 = (var16 | var78) & (~var16 | ~var78);
               var78 = -677315684;
               var16 = var10001;
               if (var139 >= (var16 | var78) - (var16 & var78) && !this.G()) {
                  var78 = 615380511;
                  var16 = 1607477241;
                  var139 = (var16 | var78) & ~(var16 & var78);
                  var78 = 2071843303;
                  var16 = var139;
                  return pulse.Bool.from((var16 | var78) & (var16 & var78 ^ -1));
               }

               if (!this.G()) {
                  var78 = 463389021;
                  var16 = -883480189;
                  var139 = var16 + var78 - 2 * (var16 & var78);
                  var78 = 809349906;
                  var16 = var139;
                  var139 = (var16 | var78) & (~var16 | ~var78);
                  var78 = -768658113;
                  var16 = 1968139075;
                  var139 = (var16 | var78) & ~(var16 & var78);
                  var78 = -18761522;
                  var16 = var139;
                  int var8 = var16 & ~var78 | ~var16 & var78;
                  var78 = -1164266453;
                  var16 = -1842502036;
                  var139 = (var16 | var78) & ~(var16 & var78);
                  var78 = -1252175543;
                  var16 = var139;
                  var139 = (var16 | var78) - (var16 & var78);
                  var78 = -1159047514;
                  var16 = -1965059893;
                  var139 = var16 + var78 - 2 * (var16 & var78);
                  var78 = 347381061;
                  var16 = var139;
                  if ((var16 | var78) - (var16 & var78) >= var8) {
                     throw new RuntimeException();
                  }
               } else {
                  this.I();
               }

               var139 = this.n.length();
               var78 = -1527636541;
               var16 = -1004626467;
               var10001 = var16 + var78 - 2 * (var16 & var78);
               var78 = 1626112014;
               var16 = var10001;
               if (var139 < ((var16 | var78) & ~(var16 & var78))) {
                  int var10002 = (int)-6264690121987978740L;
                  var78 = 924810065;
                  var16 = var10002;
                  var10002 = (var16 | var78) & ~(var16 & var78);
                  var78 = -1407356579;
                  var16 = var10002;
                  String var150 = this.n.substring(var16 + var78 - 2 * (var16 & var78), this.r);
                  String var6 = this.n.substring(this.r);
                  char var5 = var1;
                  String var4 = var150;
                  this.n = var4 + var5 + var6;
                  var10002 = (int)-3463136114497110278L;
                  var78 = -383179292;
                  var16 = var10002;
                  var10002 = (var16 | var78) & (~var16 | ~var78);
                  var78 = -1883530465;
                  var16 = var10002;
                  var78 = var16 & ~var78 | ~var16 & var78;
                  var16 = this.r;
                  this.r = (var16 | var78) + (var16 & var78);
                  if (this.m == pulse.TokenSettingWidget.ValueType.PRICE) {
                     int var3 = this.x();
                     String var154 = this.n;
                     String var10003 = "gi";
                     String var10004 = "gj";
                     var78 = 167844214;
                     var16 = 212477620;
                     int var10005 = (var16 | var78) & (~var16 | ~var78);
                     var78 = -13580958;
                     var16 = var10005;
                     var10005 = var16 & ~var78 | ~var16 & var78;
                     var78 = -757099466;
                     var16 = -629762433;
                     var10005 = (var16 | var78) & (~var16 | ~var78);
                     var78 = 1066857853;
                     var16 = var10005;
                     var10005 = (var16 | var78) & (~var16 | ~var78);
                     int var10006 = (int)-7892630241917827877L;
                     var78 = 1116624062;
                     var16 = var10006;
                     var10006 = (var16 | var78) - (var16 & var78);
                     var78 = 358568859;
                     var16 = var10006;
                     var10006 = (var16 & ~var78 | ~var16 & var78) * (var16 & ~var78 | ~var16 & var78);
                     var78 = -1882283947;
                     var16 = 490788043;
                     var10006 = (var16 | var78) & (~var16 | ~var78);
                     var78 = 110449275;
                     var16 = var10006;
                     var10006 = (var16 | var78) - (var16 & var78);
                     String var10007 = "gk";
                     var78 = 1887192651;
                     var16 = 270811300;
                     int var169 = var16 + var78 - 2 * (var16 & var78);
                     var78 = 1721171945;
                     var16 = var169;
                     int var170 = var16 + var78 - 2 * (var16 & var78);
                     var78 = 294354718;
                     var16 = -1617931439;
                     int var10008 = (var16 | var78) - (var16 & var78);
                     var78 = -879928751;
                     var16 = var10008;
                     var10008 = (var16 | var78) - (var16 & var78);
                     var10008 = (int)824390784198763908L;
                     var78 = 1298038434;
                     var16 = var10008;
                     var10008 = (var16 | var78) & ~(var16 & var78);
                     var78 = -1521012773;
                     var16 = var10008;
                     var10003 = a(
                        "趬",
                        "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謴㑸\u007f\ua7eb꒺ꁿꥊ絥蹏⑮謣㑾|\ua7e1꒦ꀾ꤬絸蹚⑯謣㑄wꟲ꒡ꁸꤋ統蹯⑶謲㑺w\ua7e8꒡",
                        var10005,
                        var10006,
                        var170,
                        (var16 | var78) & ~(var16 & var78)
                     );
                     var78 = 1982184710;
                     var16 = -1942438265;
                     int var156 = (var16 | var78) & (~var16 | ~var78);
                     var78 = 929172632;
                     var16 = var156;
                     int var157 = ((var16 | var78) & ~(var16 & var78)) * ((var16 | var78) & ~(var16 & var78));
                     String var161 = "gl";
                     var78 = -491794946;
                     var16 = 428641450;
                     int var171 = (var16 | var78) & (~var16 | ~var78);
                     var78 = -81575595;
                     var16 = var171;
                     int var172 = (var16 | var78) & (~var16 | ~var78);
                     int var173 = (int)6682370459765035512L;
                     var78 = 127191395;
                     var16 = var173;
                     int var174 = var16 & ~var78 | ~var16 & var78;
                     var78 = 1078925448;
                     var16 = var174;
                     int var175 = var16 + var78 - 2 * (var16 & var78);
                     var78 = 504222784;
                     var16 = -189031907;
                     int var176 = (var16 | var78) - (var16 & var78);
                     var78 = -357151156;
                     var16 = var176;
                     int var177 = (var16 | var78) & (~var16 | ~var78);
                     var10006 = (int)-3103654247291214186L;
                     var78 = 935582153;
                     var16 = var10006;
                     var10006 = var16 + var78 - 2 * (var16 & var78);
                     var78 = -328267669;
                     var16 = var10006;
                     var10006 = (var16 | var78) - (var16 & var78);
                     var78 = 933161144;
                     var16 = 1167229217;
                     var10008 = (var16 | var78) & (~var16 | ~var78);
                     var78 = 1913416087;
                     var16 = var10008;
                     var10008 = (var16 | var78) & ~(var16 & var78);
                     var78 = -1973137123;
                     var16 = -1836596984;
                     int var178 = (var16 | var78) & (~var16 | ~var78);
                     var78 = -1959183456;
                     var16 = var178;
                     int var179 = (var16 | var78) & ~(var16 & var78);
                     var78 = -6573282;
                     var16 = 2035720439;
                     var10008 = (var16 | var78) & (~var16 | ~var78);
                     var78 = 612901151;
                     var16 = var10008;
                     var10008 = ((var16 | var78) & (~var16 | ~var78)) * ((var16 | var78) & (~var16 | ~var78));
                     var78 = -681035480;
                     var16 = -187492861;
                     var10008 = (var16 | var78) - (var16 & var78);
                     var78 = 614092373;
                     var16 = var10008;
                     var10008 = var16 & ~var78 | ~var16 & var78;
                     int var10009 = (int)-8830239821909057456L;
                     var78 = 1336927602;
                     var16 = var10009;
                     var10009 = (var16 | var78) & ~(var16 & var78);
                     var78 = -8423794;
                     var16 = var10009;
                     var10009 = (var16 + var78 - 2 * (var16 & var78)) * (var16 + var78 - 2 * (var16 & var78));
                     var78 = -1868944578;
                     var16 = 1990036635;
                     var10009 = (var16 | var78) - (var16 & var78);
                     var78 = -435446168;
                     var16 = var10009;
                     this.n = this.b(
                        var154.replace(
                           var10003,
                           a(
                              "",
                              "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謴㑸\u007f\ua7eb꒺ꁿꥊ絥蹏⑮謣㑾|\ua7e1꒦ꀾ꤬絸蹚⑯謣㑄wꟲ꒡ꁸꤋ統蹯⑶謲㑺w\ua7e8꒡",
                              var10006,
                              var179,
                              var10008,
                              (var16 | var78) - (var16 & var78)
                           )
                        )
                     );
                     this.r = this.a(var3);
                  }

                  this.J();
                  this.u();
                  this.t();
                  this.q();
               }

               var78 = -1299933830;
               var16 = 1378360703;
               var139 = var16 & ~var78 | ~var16 & var78;
               var78 = -525563900;
               var16 = var139;
               return pulse.Bool.from((var16 | var78) & (var16 & var78 ^ -1));
            } else {
               int var137 = (int)-6816815195828424449L;
               int var76 = -1391802269;
               int var14 = var137;
               var137 = var14 + var76 - 2 * (var14 & var76);
               var76 = -467421027;
               var14 = var137;
               return pulse.Bool.from(var14 & (var76 ^ -1) | (var14 ^ -1) & var76);
            }
         } else {
            int var74 = 1939903890;
            int var12 = -1295833534;
            int var136 = (var12 | var74) & (~var12 | ~var74);
            var74 = -1050430512;
            var12 = var136;
            return pulse.Bool.from((var12 | var74) - (var12 & var74));
         }
      } else {
         int var10000 = (int)8326454390187183404L;
         int var10 = 1936940843;
         int var9 = var10000;
         var10000 = var9 & ~var10 | ~var9 & var10;
         var10 = 1995051527;
         var9 = var10000;
         return pulse.Bool.from((var9 | var10) & (var9 ^ -1 | var10 ^ -1));
      }
   }

   private int x() {
      int var10001 = (int)5475181086399054115L;
      int var3 = 1542425055;
      int var2 = var10001;
      var10001 = (var2 | var3) & ~(var2 & var3);
      var3 = 741296380;
      var2 = var10001;
      String var1 = this.n.substring((var2 | var3) - (var2 & var3), this.r);
      var10001 = (int)8465322566698053382L;
      var3 = -1203437992;
      var2 = var10001;
      var10001 = (var2 | var3) - (var2 & var3);
      var3 = -500595170;
      var2 = var10001;
      var10001 = (var2 | var3) & (~var2 | ~var3);
      var3 = 1378458492;
      var2 = 542491216;
      int var10002 = (var2 | var3) & ~(var2 & var3);
      var3 = 436811927;
      var2 = var10002;
      var3 = var2 + var3 - 2 * (var2 & var3);
      var2 = var10001;
      var10001 = (var2 | var3) + (var2 & var3);
      var3 = -1314599735;
      var2 = 1307210804;
      var10002 = var2 + var3 - 2 * (var2 & var3);
      var3 = 1064831043;
      var2 = var10002;
      var10002 = (var2 & ~var3 | ~var2 & var3) * (var2 & ~var3 | ~var2 & var3);
      String var10003 = "gm";
      var3 = -1115011830;
      var2 = 452247521;
      int var138 = (var2 | var3) - (var2 & var3);
      var3 = -1874784801;
      var2 = var138;
      int var139 = var2 + var3 - 2 * (var2 & var3);
      int var10005 = (int)6988682002376128750L;
      var3 = 1523858740;
      var2 = var10005;
      var10005 = var2 + var3 - 2 * (var2 & var3);
      var3 = -1122023981;
      var2 = var10005;
      var10005 = var2 & ~var3 | ~var2 & var3;
      var3 = 1027223682;
      var2 = 1884488634;
      var10005 = var2 & ~var3 | ~var2 & var3;
      var3 = 1298740010;
      var2 = var10005;
      var10005 = (var2 | var3) & (~var2 | ~var3);
      var10005 = (int)2491627382180248688L;
      var3 = -361207181;
      var2 = var10005;
      var10005 = (var2 | var3) - (var2 & var3);
      var3 = -922413550;
      var2 = var10005;
      var10005 = (var2 | var3) & (~var2 | ~var3);
      int var10004 = (int)-7120424839163190859L;
      var3 = 1260698160;
      var2 = var10004;
      var10004 = (var2 | var3) - (var2 & var3);
      var3 = -1781736110;
      var2 = var10004;
      var10004 = (var2 | var3) & (~var2 | ~var3);
      var3 = 792217152;
      var2 = 1812847113;
      var10005 = (var2 | var3) & (~var2 | ~var3);
      var3 = 1902173781;
      var2 = var10005;
      var10005 = var2 & ~var3 | ~var2 & var3;
      var3 = 1274518039;
      var2 = 1300297449;
      int var10006 = var2 + var3 - 2 * (var2 & var3);
      var3 = 516708910;
      var2 = var10006;
      var3 = (var2 | var3) & ~(var2 & var3);
      var2 = var10005;
      var10005 = (var2 ^ var3) + 2 * (var2 & var3);
      var3 = -1332762316;
      var2 = -1832844937;
      var10005 = (var2 | var3) & (~var2 | ~var3);
      var3 = 578693028;
      var2 = var10005;
      var10005 = (var2 | var3) & ~(var2 & var3);
      String var174 = "gn";
      var10006 = (int)1876115288109515325L;
      var3 = -952616914;
      var2 = var10006;
      var10006 = (var2 | var3) & (~var2 | ~var3);
      var3 = -569592479;
      var2 = var10006;
      String var131 = a(
         "\uf729",
         "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謴㑸\u007f\ua7eb꒺ꁿꥊ絥蹏⑮謣㑾|\ua7e1꒦ꀾ꤬絸蹚⑯謣㑄wꟲ꒡ꁸꤋ統蹯⑶謲㑺w\ua7e8꒡",
         var139,
         var10004,
         var10005,
         (var2 | var3) & (~var2 | ~var3)
      );
      var10002 = (int)-8763291660714095437L;
      var3 = -34601406;
      var2 = var10002;
      var10002 = var2 & ~var3 | ~var2 & var3;
      var3 = -1780330522;
      var2 = var10002;
      var10002 = (var2 | var3) & (~var2 | ~var3);
      int var140 = (int)6486667974019840392L;
      var3 = 1859075976;
      var2 = var140;
      int var141 = (var2 | var3) & (~var2 | ~var3);
      var3 = 633860599;
      var2 = var141;
      var3 = var2 + var3 - 2 * (var2 & var3);
      var2 = var10002;
      var10002 = (var2 & ~var3) + (var3 & ~var2) + 2 * (var2 & var3);
      var10004 = (int)-1058331708393061912L;
      var3 = 1603157862;
      var2 = var10004;
      var10004 = var2 + var3 - 2 * (var2 & var3);
      var3 = 2101165697;
      var2 = var10004;
      var10004 = var2 + var3 - 2 * (var2 & var3);
      var10004 = (int)-63736513146952080L;
      var3 = -935295459;
      var2 = var10004;
      var10004 = var2 & ~var3 | ~var2 & var3;
      var3 = 1458036832;
      var2 = var10004;
      var10004 = (var2 | var3) & (~var2 | ~var3);
      var3 = -2044997631;
      var2 = -1835734573;
      var10004 = var2 + var3 - 2 * (var2 & var3);
      var3 = 344930768;
      var2 = var10004;
      var10004 = (var2 | var3) - (var2 & var3);
      var3 = -149710025;
      var2 = 889095835;
      var10004 = (var2 | var3) - (var2 & var3);
      var3 = 152013976;
      var2 = var10004;
      var10004 = (var2 | var3) & ~(var2 & var3);
      var3 = -1056232340;
      var2 = -1213013289;
      var10004 = var2 + var3 - 2 * (var2 & var3);
      var3 = 1099315599;
      var2 = var10004;
      var10004 = (var2 | var3) & ~(var2 & var3);
      var10005 = (int)-3063175627530766727L;
      var3 = 1716770714;
      var2 = var10005;
      var10005 = (var2 | var3) - (var2 & var3);
      var3 = -1514565292;
      var2 = var10005;
      var10005 = (var2 & ~var3 | ~var2 & var3) * (var2 & ~var3 | ~var2 & var3);
      var10005 = (int)-322984296509838619L;
      var3 = -299194917;
      var2 = var10005;
      var10005 = var2 + var3 - 2 * (var2 & var3);
      var3 = -240758488;
      var2 = var10005;
      var10005 = var2 & ~var3 | ~var2 & var3;
      var10006 = (int)4780897870868670310L;
      var3 = 1002729491;
      var2 = var10006;
      var10006 = (var2 | var3) - (var2 & var3);
      var3 = 450999508;
      var2 = var10006;
      var10006 = (var2 | var3) & (~var2 | ~var3);
      var3 = 1140824770;
      var2 = -383290126;
      int var10007 = (var2 | var3) & (~var2 | ~var3);
      var3 = 1921816034;
      var2 = var10007;
      var3 = var2 & ~var3 | ~var2 & var3;
      var2 = var10006;
      var10006 = (var2 & ~var3) + (var3 & ~var2) + 2 * (var2 & var3);
      var3 = 794574403;
      var2 = 1696027733;
      var10006 = (var2 | var3) & ~(var2 & var3);
      var3 = 1471618332;
      var2 = var10006;
      var10006 = (var2 | var3) & (~var2 | ~var3);
      int var10008 = (int)9106218040446254218L;
      var3 = -1230127444;
      var2 = var10008;
      var10008 = (var2 | var3) & (~var2 | ~var3);
      var3 = 715178533;
      var2 = var10008;
      var10008 = var2 & ~var3 | ~var2 & var3;
      var3 = -18680157;
      var2 = -1138875187;
      var10008 = (var2 | var3) & (~var2 | ~var3);
      var3 = 1123865190;
      var2 = var10008;
      var10008 = (var2 | var3) & ~(var2 & var3);
      var10008 = (int)-9187392470906730689L;
      var3 = -208875154;
      var2 = var10008;
      var10008 = (var2 | var3) & (~var2 | ~var3);
      var3 = -1945282980;
      var2 = var10008;
      var10008 = (var2 | var3) & (~var2 | ~var3);
      var3 = -1109980829;
      var2 = -731571635;
      var10007 = var2 & ~var3 | ~var2 & var3;
      var3 = 1771681183;
      var2 = var10007;
      return var1.replace(
            var131,
            a(
               "",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謴㑸\u007f\ua7eb꒺ꁿꥊ絥蹏⑮謣㑾|\ua7e1꒦ꀾ꤬絸蹚⑯謣㑄wꟲ꒡ꁸꤋ統蹯⑶謲㑺w\ua7e8꒡",
               var10004,
               var10005,
               var10006,
               (var2 | var3) & ~(var2 & var3)
            )
         )
         .length();
   }

   private int a(int var1) {
      String var10000 = this.n;
      int var7 = -2136528544;
      int var6 = -481719665;
      int var10001 = (var6 | var7) - (var6 & var7);
      var7 = -785203148;
      var6 = var10001;
      var10001 = (var6 | var7) - (var6 & var7);
      int var10003 = (int)-1259689106626777413L;
      var7 = -1262996377;
      var6 = var10003;
      var10003 = (var6 | var7) & ~(var6 & var7);
      var7 = 883743442;
      var6 = var10003;
      var10003 = var6 + var7 - 2 * (var6 & var7);
      var7 = 43942274;
      var6 = -828693836;
      var10003 = var6 + var7 - 2 * (var6 & var7);
      var7 = -872045785;
      var6 = var10003;
      var10003 = var6 + var7 - 2 * (var6 & var7);
      var7 = -1476936605;
      var6 = 1600945108;
      var10003 = (var6 | var7) & ~(var6 & var7);
      var7 = -124008516;
      var6 = var10003;
      var10003 = var6 + var7 - 2 * (var6 & var7);
      var10003 = (int)-7095160664914174157L;
      var7 = 1253410192;
      var6 = var10003;
      var10003 = (var6 | var7) & ~(var6 & var7);
      var7 = 56094251;
      var6 = var10003;
      var10003 = var6 + var7 - 2 * (var6 & var7);
      var7 = 1833226953;
      var6 = 1303201389;
      int var10004 = var6 & ~var7 | ~var6 & var7;
      var7 = -184179941;
      var6 = var10004;
      var7 = (var6 | var7) & ~(var6 & var7);
      var6 = var10003;
      var10003 = (var6 & ~var7) + (var7 & ~var6) + 2 * (var6 & var7);
      var10003 = (int)-1364802738739790324L;
      var7 = 2136519343;
      var6 = var10003;
      var10003 = (var6 | var7) & ~(var6 & var7);
      var7 = -1467450473;
      var6 = var10003;
      var10003 = var6 + var7 - 2 * (var6 & var7);
      String var144 = "go";
      var7 = -1952584748;
      var6 = 666105294;
      var10004 = (var6 | var7) & (~var6 | ~var7);
      var7 = -245415336;
      var6 = var10004;
      var10004 = (var6 | var7) - (var6 & var7);
      String var10005 = "gp";
      int var152 = (int)1081455100170042901L;
      var7 = 1089583935;
      var6 = var152;
      int var153 = (var6 | var7) & ~(var6 & var7);
      var7 = 1456062012;
      var6 = var153;
      int var154 = var6 + var7 - 2 * (var6 & var7);
      var7 = 864299008;
      var6 = -1004688204;
      int var10006 = var6 + var7 - 2 * (var6 & var7);
      var7 = 1588625365;
      var6 = var10006;
      var10006 = (var6 | var7) & ~(var6 & var7);
      var10006 = (int)-6510635870218820563L;
      var7 = -1410880609;
      var6 = var10006;
      var10006 = var6 + var7 - 2 * (var6 & var7);
      var7 = 374559099;
      var6 = var10006;
      String var123 = a(
         "녝", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謴㑸\u007f\ua7eb꒺ꁿꥊ絥蹏⑮謣㑾|\ua7e1꒦ꀾ꤬絸蹚⑯謣㑄wꟲ꒡ꁸꤋ統蹯⑶謲㑺w\ua7e8꒡", var10003, var10004, var154, var6 & ~var7 | ~var6 & var7
      );
      String var10002 = "gq";
      var10003 = (int)-2821459067470767853L;
      var7 = 1340168555;
      var6 = var10003;
      var10003 = (var6 | var7) & ~(var6 & var7);
      var7 = 1584005943;
      var6 = var10003;
      var10003 = (var6 & ~var7 | ~var6 & var7) * (var6 & ~var7 | ~var6 & var7);
      var7 = -104499380;
      var6 = -1407856675;
      var10004 = (var6 | var7) & (~var6 | ~var7);
      var7 = -1767393852;
      var6 = var10004;
      var10004 = (var6 | var7) & ~(var6 & var7);
      var7 = -747592002;
      var6 = -1391033023;
      int var155 = (var6 | var7) & (~var6 | ~var7);
      var7 = 1565419006;
      var6 = var155;
      var7 = (var6 | var7) & (~var6 | ~var7);
      var6 = var10004;
      var10004 = (var6 | var7) + (var6 & var7);
      var7 = -1942737356;
      var6 = 1426263930;
      var10004 = (var6 | var7) - (var6 & var7);
      var7 = -301410694;
      var6 = var10004;
      var10004 = (var6 | var7) & ~(var6 & var7);
      var10005 = "gr";
      var7 = 1237188244;
      var6 = 845861003;
      int var157 = (var6 | var7) - (var6 & var7);
      var7 = 643115153;
      var6 = var157;
      int var158 = var6 & ~var7 | ~var6 & var7;
      var7 = -1655102319;
      var6 = -1099204247;
      int var10007 = (var6 | var7) & (~var6 | ~var7);
      var7 = 589454847;
      var6 = var10007;
      var10007 = var6 + var7 - 2 * (var6 & var7);
      var10007 = (int)8450772839685809085L;
      var7 = 1407654765;
      var6 = var10007;
      var10007 = (var6 | var7) - (var6 & var7);
      var7 = -249890608;
      var6 = var10007;
      var10007 = (var6 | var7) & (~var6 | ~var7);
      var10007 = (int)2201223774644696781L;
      var7 = 1724966069;
      var6 = var10007;
      var10007 = (var6 | var7) - (var6 & var7);
      var7 = 537367167;
      var6 = var10007;
      var10007 = (var6 | var7) & (~var6 | ~var7);
      var10006 = (int)7547672884353758124L;
      var7 = -439277689;
      var6 = var10006;
      var10006 = (var6 | var7) - (var6 & var7);
      var7 = 95344295;
      var6 = var10006;
      var10006 = (var6 | var7) & (~var6 | ~var7);
      String var172 = "gs";
      var10007 = (int)-209520792962090533L;
      var7 = -613336602;
      var6 = var10007;
      var10007 = (var6 | var7) & (~var6 | ~var7);
      var7 = 822757672;
      var6 = var10007;
      String var2 = var10000.replace(
         var123,
         a(
            "",
            "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謴㑸\u007f\ua7eb꒺ꁿꥊ絥蹏⑮謣㑾|\ua7e1꒦ꀾ꤬絸蹚⑯謣㑄wꟲ꒡ꁸꤋ統蹯⑶謲㑺w\ua7e8꒡",
            var10004,
            var158,
            var10006,
            var6 + var7 - 2 * (var6 & var7)
         )
      );
      if (var1 > var2.length()) {
         var1 = var2.length();
      }

      int var116 = (int)-4739384697124506704L;
      var7 = 774814116;
      var6 = var116;
      int var117 = var6 + var7 - 2 * (var6 & var7);
      var7 = 1607862804;
      var6 = var117;
      int var3 = (var6 | var7) - (var6 & var7);
      int var118 = (int)-4674665547769805828L;
      var7 = 2109948180;
      var6 = var118;
      int var119 = (var6 | var7) & ~(var6 & var7);
      var7 = -659569944;
      var6 = var119;
      int var4 = var6 & ~var7 | ~var6 & var7;
      var7 = 2044957444;
      var6 = -2021689957;
      int var120 = (var6 | var7) & (~var6 | ~var7);
      var7 = -23271777;
      var6 = var120;

      for (int var5 = var6 & ~var7 | ~var6 & var7; var5 < this.n.length() && var3 < var1; var5++) {
         char var121 = this.n.charAt(var5);
         var10001 = (int)4884515604914842293L;
         var7 = 815334037;
         var6 = var10001;
         var10001 = (var6 | var7) & (~var6 | ~var7);
         var7 = 173287436;
         var6 = var10001;
         if (var121 != var6 + var7 - 2 * (var6 & var7)) {
            var3++;
         }

         var10001 = (int)-4957545068445245114L;
         var7 = -758194417;
         var6 = var10001;
         var10001 = var6 + var7 - 2 * (var6 & var7);
         var7 = 395984456;
         var6 = var10001;
         var7 = var6 & ~var7 | ~var6 & var7;
         var6 = var5;
         var4 = (var6 ^ var7) + 2 * (var6 & var7);
      }

      return var4;
   }

   private void y() {
      if (!this.G()) {
         if (this.r > 0) {
            int var10002 = (int)843989438737306555L;
            int var5 = -1599108993;
            int var4 = var10002;
            var10002 = (var4 | var5) - (var4 & var5);
            var5 = -491660348;
            var4 = var10002;
            var10002 = var4 & ~var5 | ~var4 & var5;
            int var10004 = (int)8728118028480290789L;
            var5 = 1046699152;
            var4 = var10004;
            var10004 = var4 & ~var5 | ~var4 & var5;
            var5 = 1260602228;
            var4 = var10004;
            var5 = (var4 | var5) & ~(var4 & var5);
            var4 = this.r;
            String var10001 = this.n.substring(var10002, var4 - var5);
            String var3 = this.n.substring(this.r);
            String var2 = var10001;
            this.n = var2 + var3;
            var5 = -1215553858;
            var4 = -1643372460;
            var10002 = var4 + var5 - 2 * (var4 & var5);
            var5 = 696270571;
            var4 = var10002;
            var5 = (var4 | var5) & (~var4 | ~var5);
            var4 = this.r;
            this.r = (var4 ^ var5) - 2 * (~var4 & var5);
            if (this.m == pulse.TokenSettingWidget.ValueType.PRICE) {
               int var1 = this.x();
               String var143 = this.n;
               int var10003 = (int)-1817582338734599821L;
               var5 = -620261286;
               var4 = var10003;
               var10003 = (var4 | var5) & ~(var4 & var5);
               var5 = -101571631;
               var4 = var10003;
               var10003 = var4 + var5 - 2 * (var4 & var5);
               var5 = -1677088650;
               var4 = -1643351453;
               int var10005 = (var4 | var5) - (var4 & var5);
               var5 = 33937949;
               var4 = var10005;
               var10005 = (var4 | var5) - (var4 & var5);
               var10005 = (int)6088377690499050895L;
               var5 = 322585462;
               var4 = var10005;
               var10005 = (var4 | var5) & ~(var4 & var5);
               var5 = 1872867065;
               var4 = var10005;
               var10005 = (var4 | var5) & ~(var4 & var5);
               var5 = 943826157;
               var4 = 1749607282;
               int var10006 = (var4 | var5) & (~var4 | ~var5);
               var5 = 1342785435;
               var4 = var10006;
               var10006 = (var4 | var5) & (~var4 | ~var5);
               var10006 = (int)6521092231998772247L;
               var5 = 17170820;
               var4 = var10006;
               var10006 = var4 & ~var5 | ~var4 & var5;
               var5 = -1294035566;
               var4 = var10006;
               var10006 = var4 + var5 - 2 * (var4 & var5);
               var10006 = (int)2896866864014591859L;
               var5 = 811114620;
               var4 = var10006;
               var10006 = (var4 | var5) & ~(var4 & var5);
               var5 = -1217911033;
               var4 = var10006;
               var10006 = var4 & ~var5 | ~var4 & var5;
               var5 = -1605801933;
               var4 = -1757074915;
               var10006 = (var4 | var5) - (var4 & var5);
               var5 = 923550269;
               var4 = var10006;
               var10006 = (var4 | var5) - (var4 & var5);
               var10005 = (int)3810073613330861124L;
               var5 = -1127388343;
               var4 = var10005;
               var10005 = (var4 | var5) - (var4 & var5);
               var5 = 1230917689;
               var4 = var10005;
               var10005 = (var4 | var5) - (var4 & var5);
               var5 = 1079075940;
               var4 = 589291210;
               var10006 = (var4 | var5) & ~(var4 & var5);
               var5 = -160206262;
               var4 = var10006;
               var10006 = (var4 | var5) & ~(var4 & var5);
               var5 = -1506476043;
               var4 = -841259902;
               int var10007 = var4 & ~var5 | ~var4 & var5;
               var5 = -1999015687;
               var4 = var10007;
               var5 = (var4 | var5) - (var4 & var5);
               var4 = var10006;
               var10006 = (var4 | var5) + (var4 & var5);
               var10006 = (int)1925085033668391301L;
               var5 = -1269845515;
               var4 = var10006;
               var10006 = (var4 | var5) & (~var4 | ~var5);
               var5 = 179513822;
               var4 = var10006;
               var10006 = var4 + var5 - 2 * (var4 & var5);
               var5 = -1058493098;
               var4 = -95764161;
               var10007 = (var4 | var5) & (~var4 | ~var5);
               var5 = 1584498255;
               var4 = var10007;
               var10007 = var4 & ~var5 | ~var4 & var5;
               var5 = 2124924635;
               var4 = 926889120;
               int var10008 = (var4 | var5) & ~(var4 & var5);
               var5 = -953457373;
               var4 = var10008;
               var5 = (var4 | var5) & (~var4 | ~var5);
               var4 = var10007;
               var10007 = 2 * (var4 | var5) - (var4 ^ var5);
               var5 = -1770463543;
               var4 = 572928446;
               var10007 = (var4 | var5) & (~var4 | ~var5);
               var5 = -1384480853;
               var4 = var10007;
               var10007 = (var4 | var5) - (var4 & var5);
               var10008 = (int)312439664913633367L;
               var5 = 1935436889;
               var4 = var10008;
               var10008 = (var4 | var5) - (var4 & var5);
               var5 = -1045493601;
               var4 = var10008;
               var10008 = (var4 | var5) & ~(var4 & var5);
               int var10009 = (int)877865491749948290L;
               var5 = -386125653;
               var4 = var10009;
               var10009 = (var4 | var5) & (~var4 | ~var5);
               var5 = -1735247879;
               var4 = var10009;
               var5 = (var4 | var5) - (var4 & var5);
               var4 = var10008;
               var10008 = (var4 | var5) + (var4 & var5);
               var5 = -794278555;
               var4 = -921780890;
               var10008 = (var4 | var5) & ~(var4 & var5);
               var5 = 431347520;
               var4 = var10008;
               String var146 = a(
                  "\uf42f",
                  "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謴㑸\u007f\ua7eb꒺ꁿꥊ絥蹏⑮謣㑾|\ua7e1꒦ꀾ꤬絸蹚⑯謣㑄wꟲ꒡ꁸꤋ統蹯⑶謲㑺w\ua7e8꒡",
                  var10005,
                  var10006,
                  var10007,
                  var4 & ~var5 | ~var4 & var5
               );
               var10005 = (int)8470753340102223613L;
               var5 = -718388137;
               var4 = var10005;
               var10005 = var4 + var5 - 2 * (var4 & var5);
               var5 = -1114545497;
               var4 = var10005;
               var10005 = (var4 | var5) & ~(var4 & var5);
               var10005 = (int)-6000386480157043794L;
               var5 = -2051405600;
               var4 = var10005;
               var10005 = var4 + var5 - 2 * (var4 & var5);
               var5 = -1835556832;
               var4 = var10005;
               var10005 = (var4 | var5) - (var4 & var5);
               var10006 = (int)-7722087419030291352L;
               var5 = 1327660494;
               var4 = var10006;
               var10006 = var4 + var5 - 2 * (var4 & var5);
               var5 = 1997832319;
               var4 = var10006;
               var10006 = (var4 + var5 - 2 * (var4 & var5)) * (var4 + var5 - 2 * (var4 & var5));
               var5 = -1187215639;
               var4 = 296541594;
               var10006 = var4 & ~var5 | ~var4 & var5;
               var5 = -1615877049;
               var4 = var10006;
               var10006 = var4 & ~var5 | ~var4 & var5;
               var10007 = (int)3459384597258902958L;
               var5 = 977667741;
               var4 = var10007;
               var10007 = (var4 | var5) & ~(var4 & var5);
               var5 = 1015656475;
               var4 = var10007;
               var10007 = var4 + var5 - 2 * (var4 & var5);
               var5 = 1690891021;
               var4 = -2000516009;
               var10008 = var4 + var5 - 2 * (var4 & var5);
               var5 = -693111009;
               var4 = var10008;
               var5 = var4 & ~var5 | ~var4 & var5;
               var4 = var10007;
               var10007 = (var4 & ~var5) + (var5 & ~var4) + 2 * (var4 & var5);
               var10007 = (int)-8899139405213829608L;
               var5 = -95879490;
               var4 = var10007;
               var10007 = var4 & ~var5 | ~var4 & var5;
               var5 = 1866018786;
               var4 = var10007;
               var10007 = var4 & ~var5 | ~var4 & var5;
               var5 = 30909542;
               var4 = 1638839167;
               var10009 = (var4 | var5) & (~var4 | ~var5);
               var5 = 1618548509;
               var4 = var10009;
               var10009 = var4 & ~var5 | ~var4 & var5;
               var10008 = (int)6674902317379935935L;
               var5 = -966849844;
               var4 = var10008;
               var10008 = (var4 | var5) - (var4 & var5);
               var5 = 980050755;
               var4 = var10008;
               var10008 = (var4 | var5) & (~var4 | ~var5);
               var5 = -2087487465;
               var4 = -1920416569;
               var10009 = var4 + var5 - 2 * (var4 & var5);
               var5 = -41801150;
               var4 = var10009;
               var10009 = (var4 | var5) - (var4 & var5);
               var5 = 1135295468;
               var4 = 16303077;
               var10009 = var4 & ~var5 | ~var4 & var5;
               var5 = 1125668048;
               var4 = var10009;
               this.n = this.b(
                  var143.replace(
                     var146,
                     a(
                        "",
                        "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謴㑸\u007f\ua7eb꒺ꁿꥊ絥蹏⑮謣㑾|\ua7e1꒦ꀾ꤬絸蹚⑯謣㑄wꟲ꒡ꁸꤋ統蹯⑶謲㑺w\ua7e8꒡",
                        var10006,
                        var10007,
                        var10008,
                        var4 + var5 - 2 * (var4 & var5)
                     )
                  )
               );
               this.r = this.a(var1);
            }
         }
      } else {
         this.I();
      }

      this.J();
      this.u();
      this.t();
      this.q();
   }

   private void z() {
      if (!this.G()) {
         if (this.r < this.n.length()) {
            int var5 = 1360677935;
            int var4 = 563506538;
            int var10002 = (var4 | var5) & (~var4 | ~var5);
            var5 = 1888231749;
            var4 = var10002;
            String var10001 = this.n.substring(var4 & ~var5 | ~var4 & var5, this.r);
            int var10004 = (int)-5643090624564225123L;
            var5 = -654261336;
            var4 = var10004;
            var10004 = (var4 | var5) & ~(var4 & var5);
            var5 = 1988352052;
            var4 = var10004;
            var5 = (var4 | var5) & ~(var4 & var5);
            var4 = this.r;
            String var3 = this.n.substring(var4 - ~var5 - 1);
            String var2 = var10001;
            this.n = var2 + var3;
            if (this.m == pulse.TokenSettingWidget.ValueType.PRICE) {
               int var1 = this.x();
               String var100 = this.n;
               String var10003 = "gt";
               var10004 = (int)2903695047651282829L;
               var5 = -1463515580;
               var4 = var10004;
               var10004 = (var4 | var5) & (~var4 | ~var5);
               var5 = -1522045880;
               var4 = var10004;
               var10004 = ((var4 | var5) - (var4 & var5)) * ((var4 | var5) - (var4 & var5));
               var5 = -2126188842;
               var4 = -1182815551;
               int var10005 = var4 + var5 - 2 * (var4 & var5);
               var5 = -1948532226;
               var4 = var10005;
               var10005 = var4 & ~var5 | ~var4 & var5;
               int var10006 = (int)-6996429149562471471L;
               var5 = -1764290890;
               var4 = var10006;
               var10006 = var4 & ~var5 | ~var4 & var5;
               var5 = -505086891;
               var4 = var10006;
               var5 = var4 + var5 - 2 * (var4 & var5);
               var4 = var10005;
               var10005 = (var4 & ~var5) + (var5 & ~var4) + 2 * (var4 & var5);
               var5 = -1297001239;
               var4 = -1111712669;
               var10005 = (var4 | var5) & ~(var4 & var5);
               var5 = 942817214;
               var4 = var10005;
               var10005 = (var4 | var5) - (var4 & var5);
               var5 = -528375419;
               var4 = 243663341;
               var10006 = (var4 | var5) & (~var4 | ~var5);
               var5 = 803527925;
               var4 = var10006;
               var10006 = (var4 | var5) & ~(var4 & var5);
               var10006 = (int)-4483253237984800481L;
               var5 = 1509562961;
               var4 = var10006;
               var10006 = (var4 | var5) - (var4 & var5);
               var5 = 1712205548;
               var4 = var10006;
               var10006 = var4 + var5 - 2 * (var4 & var5);
               int var10007 = (int)2783244252768754494L;
               var5 = 517245233;
               var4 = var10007;
               var10007 = (var4 | var5) & ~(var4 & var5);
               var5 = 376986752;
               var4 = var10007;
               var10007 = (var4 & ~var5 | ~var4 & var5) * (var4 & ~var5 | ~var4 & var5);
               var10007 = (int)-2116489544098719892L;
               var5 = -1546394054;
               var4 = var10007;
               var10007 = (var4 | var5) - (var4 & var5);
               var5 = -1630459599;
               var4 = var10007;
               var10007 = (var4 | var5) & ~(var4 & var5);
               int var10008 = (int)-5523650123694752665L;
               var5 = -170725898;
               var4 = var10008;
               var10008 = (var4 | var5) & ~(var4 & var5);
               var5 = -1489150050;
               var4 = var10008;
               var10008 = ((var4 | var5) & ~(var4 & var5)) * ((var4 | var5) & ~(var4 & var5));
               var5 = 1137721153;
               var4 = -372427345;
               var10008 = (var4 | var5) - (var4 & var5);
               var5 = -1436662123;
               var4 = var10008;
               var10003 = a(
                  "囫",
                  "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謴㑸\u007f\ua7eb꒺ꁿꥊ絥蹏⑮謣㑾|\ua7e1꒦ꀾ꤬絸蹚⑯謣㑄wꟲ꒡ꁸꤋ統蹯⑶謲㑺w\ua7e8꒡",
                  var10005,
                  var10006,
                  var10007,
                  var4 & ~var5 | ~var4 & var5
               );
               String var106 = "gu";
               var10005 = (int)-6159634289341853126L;
               var5 = 382601502;
               var4 = var10005;
               var10005 = (var4 | var5) & ~(var4 & var5);
               var5 = -2093452340;
               var4 = var10005;
               var10005 = var4 + var5 - 2 * (var4 & var5);
               var5 = 278460774;
               var4 = -403594565;
               var10006 = (var4 | var5) & ~(var4 & var5);
               var5 = 227136139;
               var4 = var10006;
               var10006 = ((var4 | var5) & (~var4 | ~var5)) * ((var4 | var5) & (~var4 | ~var5));
               var5 = -763669393;
               var4 = -1615450984;
               var10006 = var4 + var5 - 2 * (var4 & var5);
               var5 = 2062716867;
               var4 = var10006;
               var10006 = (var4 | var5) - (var4 & var5);
               var5 = 855981184;
               var4 = -1205123832;
               var10008 = (var4 | var5) & ~(var4 & var5);
               var5 = -1959888501;
               var4 = var10008;
               var10008 = var4 & ~var5 | ~var4 & var5;
               var10008 = (int)5968335897504418572L;
               var5 = 1335982731;
               var4 = var10008;
               var10008 = var4 & ~var5 | ~var4 & var5;
               var5 = -1051201142;
               var4 = var10008;
               var10008 = (var4 | var5) - (var4 & var5);
               var5 = -1379548160;
               var4 = 237821226;
               var10008 = (var4 | var5) & ~(var4 & var5);
               var5 = -1545004768;
               var4 = var10008;
               var10008 = (var4 | var5) & ~(var4 & var5);
               var5 = 58664671;
               var4 = -89075646;
               var10007 = var4 & ~var5 | ~var4 & var5;
               var5 = 696913648;
               var4 = var10007;
               var10007 = (var4 | var5) & (~var4 | ~var5);
               var10008 = (int)-686819152010617230L;
               var5 = 1689881389;
               var4 = var10008;
               var10008 = var4 & ~var5 | ~var4 & var5;
               var5 = 1643054851;
               var4 = var10008;
               var10008 = ((var4 | var5) & (~var4 | ~var5)) * ((var4 | var5) & (~var4 | ~var5));
               var5 = -1437026457;
               var4 = -692067351;
               var10008 = (var4 | var5) & (~var4 | ~var5);
               var5 = 2025691073;
               var4 = var10008;
               var10008 = var4 & ~var5 | ~var4 & var5;
               var5 = 1918862009;
               var4 = -2129222171;
               int var10009 = var4 + var5 - 2 * (var4 & var5);
               var5 = 224721122;
               var4 = var10009;
               var10009 = (var4 + var5 - 2 * (var4 & var5)) * (var4 + var5 - 2 * (var4 & var5));
               var10009 = (int)6734747257692943807L;
               var5 = 1132266826;
               var4 = var10009;
               var10009 = (var4 | var5) & (~var4 | ~var5);
               var5 = -1712934989;
               var4 = var10009;
               this.n = this.b(
                  var100.replace(
                     var10003,
                     a(
                        "",
                        "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謴㑸\u007f\ua7eb꒺ꁿꥊ絥蹏⑮謣㑾|\ua7e1꒦ꀾ꤬絸蹚⑯謣㑄wꟲ꒡ꁸꤋ統蹯⑶謲㑺w\ua7e8꒡",
                        var10006,
                        var10007,
                        var10008,
                        var4 + var5 - 2 * (var4 & var5)
                     )
                  )
               );
               this.r = this.a(var1);
            }
         }
      } else {
         this.I();
      }

      this.J();
      this.u();
      this.t();
      this.q();
   }

   private void a(boolean var1, boolean var2) {
      int var3 = this.r;
      if (!var2) {
         int var5 = 804550581;
         int var4 = 748225932;
         int var10000 = (var4 | var5) & ~(var4 & var5);
         var5 = 57504313;
         var4 = var10000;
         var10000 = var4 & ~var5 | ~var4 & var5;
         var5 = -610013273;
         var4 = 1811709703;
         int var10002 = (var4 | var5) & ~(var4 & var5);
         var5 = -1335914335;
         var4 = var10002;
         var5 = (var4 | var5) & (~var4 | ~var5);
         var4 = this.r;
         var3 = Math.max(var10000, (var4 ^ var5) - 2 * (~var4 & var5));
      } else {
         var3 = this.A();
      }

      if (!var1) {
         if (this.G()) {
            var3 = Math.min(this.s, this.t);
         }

         this.H();
      } else {
         if (!this.G()) {
            this.s = this.r;
         }

         this.t = var3;
      }

      this.r = var3;
      this.J();
   }

   private void b(boolean var1, boolean var2) {
      int var3 = this.r;
      if (!var2) {
         int var10000 = this.n.length();
         int var10002 = (int)4596739501904287150L;
         int var5 = -2107937074;
         int var4 = var10002;
         var10002 = (var4 | var5) - (var4 & var5);
         var5 = 1918483297;
         var4 = var10002;
         var5 = (var4 | var5) & (~var4 | ~var5);
         var4 = this.r;
         var3 = Math.min(var10000, 2 * (var4 | var5) - (var4 ^ var5));
      } else {
         var3 = this.B();
      }

      if (!var1) {
         if (this.G()) {
            var3 = Math.max(this.s, this.t);
         }

         this.H();
      } else {
         if (!this.G()) {
            this.s = this.r;
         }

         this.t = var3;
      }

      this.r = var3;
      this.J();
   }

   private void a(boolean var1) {
      if (!var1) {
         this.H();
      } else {
         if (!this.G()) {
            this.s = this.r;
         }

         int var3 = -1462468466;
         int var2 = -627197756;
         int var10001 = var2 + var3 - 2 * (var2 & var3);
         var3 = 1917401162;
         var2 = var10001;
         this.t = (var2 | var3) - (var2 & var3);
      }

      int var10 = (int)1200027518320477925L;
      int var8 = 1500471118;
      int var5 = var10;
      var10 = (var5 | var8) & (~var5 | ~var8);
      var8 = 658561451;
      var5 = var10;
      this.r = (var5 | var8) & ~(var5 & var8);
      this.J();
   }

   private void b(boolean var1) {
      if (!var1) {
         this.H();
      } else {
         if (!this.G()) {
            this.s = this.r;
         }

         this.t = this.n.length();
      }

      this.r = this.n.length();
      this.J();
   }

   private int A() {
      if (this.r == 0) {
         int var10000 = (int)4260493541376194236L;
         int var16 = -1340240072;
         int var9 = var10000;
         var10000 = var9 & ~var16 | ~var9 & var16;
         var16 = 898595204;
         var9 = var10000;
         return (var9 | var16) & ~(var9 & var16);
      }

      int var3 = 671364328;
      int var2 = -1396104018;
      int var10001 = var2 & ~var3 | ~var2 & var3;
      var3 = -2066935737;
      var2 = var10001;
      var3 = (var2 | var3) & ~(var2 & var3);
      var2 = this.r;
      int var1 = var2 - var3;

      while (var1 > 0 && Character.isWhitespace(this.n.charAt(var1))) {
         var1--;
      }

      while (var1 > 0) {
         var3 = -524353180;
         var2 = -1272781835;
         int var10002 = (var2 | var3) - (var2 & var3);
         var3 = 1419633296;
         var2 = var10002;
         var3 = (var2 | var3) & (~var2 | ~var3);
         var2 = var1;
         if (Character.isWhitespace(this.n.charAt(2 * (var2 & ~var3) - (var2 ^ var3)))) {
            break;
         }

         var1--;
      }

      return var1;
   }

   private int B() {
      if (this.r >= this.n.length()) {
         return this.n.length();
      }

      int var1 = this.r;

      while (var1 < this.n.length() && !Character.isWhitespace(this.n.charAt(var1))) {
         var1++;
      }

      while (var1 < this.n.length() && Character.isWhitespace(this.n.charAt(var1))) {
         var1++;
      }

      return var1;
   }

   private void C() {
      int var10001 = (int)-2345882693683779875L;
      int var2 = -1384640176;
      int var1 = var10001;
      var10001 = (var1 | var2) & (~var1 | ~var2);
      var2 = -750389363;
      var1 = var10001;
      this.s = (var1 | var2) & (~var1 | ~var2);
      this.t = this.n.length();
      this.r = this.n.length();
   }

   private void D() {
      if (this.G()) {
         int var1 = Math.min(this.s, this.t);
         int var2 = Math.max(this.s, this.t);
         String var3 = this.n.substring(var1, var2);
         MinecraftClient.getInstance().keyboard.setClipboard(var3);
      }
   }

   private void E() {
      String var1 = MinecraftClient.getInstance().keyboard.getClipboard();
      if (var1 != null && !var1.isEmpty()) {
         int var10001 = (int)-664793488989419833L;
         int var11 = 1912851846;
         int var10 = var10001;
         var10001 = (var10 | var11) - (var10 & var11);
         var11 = -580880348;
         var10 = var10001;
         var10001 = (var10 + var11 - 2 * (var10 & var11)) * (var10 + var11 - 2 * (var10 & var11));
         var11 = 2068328516;
         var10 = -1552570015;
         int var10002 = (var10 | var11) & (~var10 | ~var11);
         var11 = -1566363858;
         var10 = var10002;
         var10002 = (var10 | var11) - (var10 & var11);
         int var10004 = (int)-7553163667827462584L;
         var11 = -195398786;
         var10 = var10004;
         var10004 = var10 & ~var11 | ~var10 & var11;
         var11 = 1822137650;
         var10 = var10004;
         var10004 = (var10 | var11) - (var10 & var11);
         var11 = -509669645;
         var10 = -516811454;
         var10004 = var10 + var11 - 2 * (var10 & var11);
         var11 = 11344823;
         var10 = var10004;
         var10004 = var10 + var11 - 2 * (var10 & var11);
         int var10003 = (int)7603916692265281994L;
         var11 = -826156371;
         var10 = var10003;
         var10003 = var10 & ~var11 | ~var10 & var11;
         var11 = 970753107;
         var10 = var10003;
         var10003 = var10 + var11 - 2 * (var10 & var11);
         String var266 = "gv";
         var11 = 1560822928;
         var10 = 1410475469;
         var10004 = (var10 | var11) & (~var10 | ~var11);
         var11 = 884496271;
         var10 = var10004;
         var10004 = (var10 | var11) & (~var10 | ~var11);
         var11 = 559747054;
         var10 = 326325919;
         int var10005 = (var10 | var11) - (var10 & var11);
         var11 = 539761309;
         var10 = var10005;
         var10005 = (var10 | var11) & (~var10 | ~var11);
         int var10006 = (int)-8061066256599364389L;
         var11 = 1326363223;
         var10 = var10006;
         var10006 = var10 + var11 - 2 * (var10 & var11);
         var11 = -1365202822;
         var10 = var10006;
         var11 = (var10 | var11) & ~(var10 & var11);
         var10 = var10005;
         var10005 = (var10 ^ var11) + 2 * (var10 & var11);
         var11 = 472877332;
         var10 = 452375077;
         var10005 = var10 & ~var11 | ~var10 & var11;
         var11 = 171774618;
         var10 = var10005;
         var10005 = (var10 | var11) - (var10 & var11);
         String var312 = "gw";
         var11 = 605726872;
         var10 = -1259278234;
         var10006 = var10 & ~var11 | ~var10 & var11;
         var11 = -1864336907;
         var10 = var10006;
         String var239 = a(
            "\ue9fc㿄\ue9d5㿄\ue9c9㿄\ue9d3㿅",
            "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謴㑸\u007f\ua7eb꒺ꁿꥊ絥蹏⑮謣㑾|\ua7e1꒦ꀾ꤬絸蹚⑯謣㑄wꟲ꒡ꁸꤋ統蹯⑶謲㑺w\ua7e8꒡",
            var10003,
            var10004,
            var10005,
            (var10 | var11) - (var10 & var11)
         );
         var11 = -1316048583;
         var10 = -145195857;
         var10003 = var10 + var11 - 2 * (var10 & var11);
         var11 = 1188482451;
         var10 = var10003;
         var10003 = (var10 | var11) - (var10 & var11);
         var10004 = (int)5542206412557300210L;
         var11 = -1607844134;
         var10 = var10004;
         var10004 = (var10 | var11) & (~var10 | ~var11);
         var11 = -327905479;
         var10 = var10004;
         var10004 = var10 & ~var11 | ~var10 & var11;
         var11 = 1420942896;
         var10 = -1435036505;
         var10004 = var10 & ~var11 | ~var10 & var11;
         var11 = -20526446;
         var10 = var10004;
         var10004 = var10 + var11 - 2 * (var10 & var11);
         var10004 = (int)-576856092662876062L;
         var11 = -1600105804;
         var10 = var10004;
         var10004 = var10 & ~var11 | ~var10 & var11;
         var11 = 116353734;
         var10 = var10004;
         var10004 = var10 + var11 - 2 * (var10 & var11);
         String var277 = "gx";
         var11 = 1252999255;
         var10 = -1391382567;
         var10004 = (var10 | var11) & (~var10 | ~var11);
         var11 = -796813126;
         var10 = var10004;
         var10004 = var10 & ~var11 | ~var10 & var11;
         String var287 = "gy";
         var10005 = (int)-7352809742190928566L;
         var11 = -1641441082;
         var10 = var10005;
         var10005 = (var10 | var11) - (var10 & var11);
         var11 = -1405613951;
         var10 = var10005;
         var10005 = (var10 | var11) & ~(var10 & var11);
         var11 = -1963139950;
         var10 = 1690012407;
         var10006 = (var10 | var11) & (~var10 | ~var11);
         var11 = 111885359;
         var10 = var10006;
         var10006 = (var10 | var11) & (~var10 | ~var11);
         int var10007 = (int)6137606848776660530L;
         var11 = 1448037327;
         var10 = var10007;
         var10007 = (var10 | var11) - (var10 & var11);
         var11 = -359993866;
         var10 = var10007;
         var11 = var10 + var11 - 2 * (var10 & var11);
         var10 = var10006;
         var10006 = (var10 | var11) + (var10 & var11);
         var10006 = (int)-6193556614472943413L;
         var11 = 1096495477;
         var10 = var10006;
         var10006 = (var10 | var11) & (~var10 | ~var11);
         var11 = -1141655433;
         var10 = var10006;
         var10006 = (var10 | var11) & (~var10 | ~var11);
         String var327 = "gz";
         var11 = -2147106384;
         var10 = 322829466;
         var10007 = var10 & ~var11 | ~var10 & var11;
         var11 = -1826895252;
         var10 = var10007;
         var1 = var1.replaceAll(
            var239,
            a(
               "",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謴㑸\u007f\ua7eb꒺ꁿꥊ絥蹏⑮謣㑾|\ua7e1꒦ꀾ꤬絸蹚⑯謣㑄wꟲ꒡ꁸꤋ統蹯⑶謲㑺w\ua7e8꒡",
               var10004,
               var10005,
               var10006,
               (var10 | var11) - (var10 & var11)
            )
         );
         StringBuilder var2 = new StringBuilder();
         int var10000 = (int)79237843041252933L;
         var11 = 559737616;
         var10 = var10000;
         var10000 = (var10 | var11) & (~var10 | ~var11);
         var11 = -564060843;
         var10 = var10000;

         for (int var3 = (var10 | var11) - (var10 & var11); var3 < var1.length(); var3++) {
            char var4 = var1.charAt(var3);
            var10002 = this.r;
            var11 = var2.length();
            var10 = var10002;
            if (this.b(var4, (var10 & ~var11) + (var11 & ~var10) + 2 * (var10 & var11))) {
               var2.append(var4);
            }
         }

         var1 = var2.toString();
         if (!this.G()) {
            if (b != b) {
               var10001 = (int)-7811913711295834507L;
               var11 = 1116381665;
               var10 = var10001;
               var10001 = (var10 | var11) & ~(var10 & var11);
               var11 = 750778271;
               var10 = var10001;
               var10001 = (var10 | var11) & (~var10 | ~var11);
               var11 = 808155146;
               var10 = -263442199;
               var10001 = var10 + var11 - 2 * (var10 & var11);
               var11 = -1066972942;
               var10 = var10001;
               var10001 = var10 & ~var11 | ~var10 & var11;
               var11 = 509965895;
               var10 = 1516106209;
               var10000 = (var10 | var11) & (~var10 | ~var11);
               var11 = -387351129;
               var10 = var10000;
               int var9 = (var10 | var11) - (var10 & var11);
            }
         } else {
            this.I();
         }

         var10000 = (int)-5399711226981797638L;
         var11 = -872142756;
         var10 = var10000;
         var10000 = (var10 | var11) & (~var10 | ~var11);
         var11 = -1240753994;
         var10 = var10000;
         var10000 = var10 & ~var11 | ~var10 & var11;
         var11 = this.n.length();
         var10 = var10000;
         int var14 = var10 + ~var11 + 1;
         if (var1.length() > var14) {
            var10001 = (int)6046786377574388838L;
            var11 = 845659068;
            var10 = var10001;
            var10001 = var10 + var11 - 2 * (var10 & var11);
            var11 = 1637461978;
            var10 = var10001;
            var1 = var1.substring((var10 | var11) & ~(var10 & var11), var14);
         }

         if (!var1.isEmpty()) {
            var10002 = (int)-3945143140192090587L;
            var11 = 1362341670;
            var10 = var10002;
            var10002 = (var10 | var11) & ~(var10 & var11);
            var11 = 234596611;
            var10 = var10002;
            String var247 = this.n.substring((var10 | var11) & (~var10 | ~var11), this.r);
            String var7 = this.n.substring(this.r);
            String var6 = var1;
            String var5 = var247;
            this.n = var5 + var6 + var7;
            var10001 = this.r;
            var11 = var1.length();
            var10 = var10001;
            this.r = (var10 ^ var11) + 2 * (var10 & var11);
            if (this.m == pulse.TokenSettingWidget.ValueType.PRICE) {
               int var15 = this.x();
               String var253 = this.n;
               var10003 = (int)-1318446417589564521L;
               var11 = 835264620;
               var10 = var10003;
               var10003 = var10 + var11 - 2 * (var10 & var11);
               var11 = -20702998;
               var10 = var10003;
               var10003 = var10 & ~var11 | ~var10 & var11;
               var10005 = (int)1143058262823303003L;
               var11 = -1127358819;
               var10 = var10005;
               var10005 = (var10 | var11) & (~var10 | ~var11);
               var11 = -1377457728;
               var10 = var10005;
               var10005 = var10 + var11 - 2 * (var10 & var11);
               var10005 = (int)-3599031635832106768L;
               var11 = -1274266606;
               var10 = var10005;
               var10005 = (var10 | var11) & (~var10 | ~var11);
               var11 = 114928878;
               var10 = var10005;
               var10005 = var10 & ~var11 | ~var10 & var11;
               var10005 = (int)6549114021588132789L;
               var11 = -1122665720;
               var10 = var10005;
               var10005 = var10 & ~var11 | ~var10 & var11;
               var11 = -1084286788;
               var10 = var10005;
               var10005 = (var10 | var11) & (~var10 | ~var11);
               var10005 = (int)-9205199879016692325L;
               var11 = -1584119314;
               var10 = var10005;
               var10005 = (var10 | var11) & (~var10 | ~var11);
               var11 = -1792441220;
               var10 = var10005;
               var10005 = (var10 | var11) & ~(var10 & var11);
               var10005 = (int)3413804473952241081L;
               var11 = -1065204492;
               var10 = var10005;
               var10005 = (var10 | var11) & (~var10 | ~var11);
               var11 = 320775527;
               var10 = var10005;
               var10005 = var10 + var11 - 2 * (var10 & var11);
               var11 = -505721074;
               var10 = 2069254504;
               var10005 = (var10 | var11) - (var10 & var11);
               var11 = -1380783790;
               var10 = var10005;
               var10005 = var10 & ~var11 | ~var10 & var11;
               var10007 = (int)-1705300270547954423L;
               var11 = -2094200948;
               var10 = var10007;
               var10007 = (var10 | var11) & (~var10 | ~var11);
               var11 = -508456308;
               var10 = var10007;
               var10007 = (var10 | var11) - (var10 & var11);
               var11 = -752563194;
               var10 = 566942487;
               var10006 = (var10 | var11) & ~(var10 & var11);
               var11 = -821502669;
               var10 = var10006;
               var10006 = var10 + var11 - 2 * (var10 & var11);
               var10007 = (int)-3125352981171065127L;
               var11 = -548431522;
               var10 = var10007;
               var10007 = (var10 | var11) & ~(var10 & var11);
               var11 = 1225964322;
               var10 = var10007;
               var10007 = var10 + var11 - 2 * (var10 & var11);
               int var10008 = (int)-7412664746077553233L;
               var11 = 488673071;
               var10 = var10008;
               var10008 = var10 & ~var11 | ~var10 & var11;
               var11 = 657465328;
               var10 = var10008;
               var11 = (var10 | var11) & (~var10 | ~var11);
               var10 = var10007;
               var10007 = (var10 & ~var11) + (var11 & ~var10) + 2 * (var10 & var11);
               var11 = 1424686526;
               var10 = 1992611029;
               var10007 = (var10 | var11) & ~(var10 & var11);
               var11 = 835225589;
               var10 = var10007;
               var10007 = (var10 | var11) & (~var10 | ~var11);
               var10008 = (int)4664915654476337093L;
               var11 = -597737152;
               var10 = var10008;
               var10008 = var10 & ~var11 | ~var10 & var11;
               var11 = 1489823216;
               var10 = var10008;
               var10008 = (var10 | var11) & ~(var10 & var11);
               int var10009 = (int)-6690553319266149298L;
               var11 = 1562229805;
               var10 = var10009;
               var10009 = (var10 | var11) - (var10 & var11);
               var11 = -1279285431;
               var10 = var10009;
               var11 = var10 + var11 - 2 * (var10 & var11);
               var10 = var10008;
               var10008 = (var10 & ~var11) + (var11 & ~var10) + 2 * (var10 & var11);
               var10008 = (int)-977138157363667835L;
               var11 = 197047048;
               var10 = var10008;
               var10008 = var10 & ~var11 | ~var10 & var11;
               var11 = -366224426;
               var10 = var10008;
               String var261 = a(
                  "\ue98b",
                  "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謴㑸\u007f\ua7eb꒺ꁿꥊ絥蹏⑮謣㑾|\ua7e1꒦ꀾ꤬絸蹚⑯謣㑄wꟲ꒡ꁸꤋ統蹯⑶謲㑺w\ua7e8꒡",
                  var10005,
                  var10006,
                  var10007,
                  (var10 | var11) - (var10 & var11)
               );
               var10004 = (int)-7463232319591970045L;
               var11 = 1378531023;
               var10 = var10004;
               var10004 = var10 & ~var11 | ~var10 & var11;
               var11 = 1478164664;
               var10 = var10004;
               var10004 = (var10 & ~var11 | ~var10 & var11) * (var10 & ~var11 | ~var10 & var11);
               var10005 = (int)-1311883161876429546L;
               var11 = -1248021712;
               var10 = var10005;
               var10005 = (var10 | var11) & ~(var10 & var11);
               var11 = 373837246;
               var10 = var10005;
               var10005 = ((var10 | var11) & (~var10 | ~var11)) * ((var10 | var11) & (~var10 | ~var11));
               String var322 = "ha";
               var10006 = (int)-4984383843771333750L;
               var11 = 1267061643;
               var10 = var10006;
               var10006 = var10 & ~var11 | ~var10 & var11;
               var11 = 325740341;
               var10 = var10006;
               var10006 = (var10 | var11) & ~(var10 & var11);
               var10007 = (int)3423294468983140300L;
               var11 = -1786930242;
               var10 = var10007;
               var10007 = var10 & ~var11 | ~var10 & var11;
               var11 = -1036691383;
               var10 = var10007;
               var10007 = (var10 | var11) - (var10 & var11);
               var10007 = (int)6758291622374611224L;
               var11 = 1188236385;
               var10 = var10007;
               var10007 = (var10 | var11) & (~var10 | ~var11);
               var11 = 187346606;
               var10 = var10007;
               var10007 = var10 + var11 - 2 * (var10 & var11);
               var11 = -298982832;
               var10 = 1552750204;
               var10008 = (var10 | var11) & ~(var10 & var11);
               var11 = 1760055815;
               var10 = var10008;
               var10008 = ((var10 | var11) & (~var10 | ~var11)) * ((var10 | var11) & (~var10 | ~var11));
               var11 = -907132446;
               var10 = 2115481684;
               var10008 = (var10 | var11) & ~(var10 & var11);
               var11 = -1594759586;
               var10 = var10008;
               var10008 = var10 & ~var11 | ~var10 & var11;
               var11 = 1118741444;
               var10 = 2023414176;
               var10009 = (var10 | var11) & (~var10 | ~var11);
               var11 = -2060683038;
               var10 = var10009;
               var10009 = (var10 | var11) - (var10 & var11);
               var10009 = (int)-272885748792724945L;
               var11 = 1103862637;
               var10 = var10009;
               var10009 = var10 + var11 - 2 * (var10 & var11);
               var11 = 930631506;
               var10 = var10009;
               this.n = this.b(
                  var253.replace(
                     var261,
                     a(
                        "",
                        "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謴㑸\u007f\ua7eb꒺ꁿꥊ絥蹏⑮謣㑾|\ua7e1꒦ꀾ꤬絸蹚⑯謣㑄wꟲ꒡ꁸꤋ統蹯⑶謲㑺w\ua7e8꒡",
                        var10006,
                        var10007,
                        var10008,
                        var10 & ~var11 | ~var10 & var11
                     )
                  )
               );
               this.r = this.a(var15);
            }
         }

         this.J();
         this.u();
         this.t();
         this.q();
      }
   }

   private void F() {
      if (this.G()) {
         this.D();
         this.I();
      }
   }

   private boolean G() {
      int var2 = 9447898;
      int var1 = 201143240;
      int var10001 = (var1 | var2) - (var1 & var2);
      var2 = -191699475;
      var1 = var10001;
      if (this.s != ((var1 | var2) & ~(var1 & var2))) {
         var10001 = (int)-6624300907040972645L;
         var2 = 1094526615;
         var1 = var10001;
         var10001 = var1 & ~var2 | ~var1 & var2;
         var2 = -1337673229;
         var1 = var10001;
         if (this.t != var1 + var2 - 2 * (var1 & var2) && this.s != this.t) {
            var2 = -977654904;
            var1 = 792578901;
            int var18 = var1 & ~var2 | ~var1 & var2;
            var2 = -360193828;
            var1 = var18;
            return pulse.Bool.from(var1 & ~var2 | ~var1 & var2);
         }
      }

      var2 = -1659082319;
      var1 = 655044425;
      int var10000 = var1 & ~var2 | ~var1 & var2;
      var2 = -1172879624;
      var1 = var10000;
      return pulse.Bool.from((var1 | var2) & (~var1 | ~var2));
   }

   private void H() {
      int var2 = 459389947;
      int var1 = -612154393;
      int var10001 = (var1 | var2) & ~(var1 & var2);
      var2 = 1058867171;
      var1 = var10001;
      this.s = (var1 | var2) & ~(var1 & var2);
      var2 = 1362240287;
      var1 = -911050658;
      var10001 = var1 & ~var2 | ~var1 & var2;
      var2 = 1736418494;
      var1 = var10001;
      this.t = var1 + var2 - 2 * (var1 & var2);
   }

   private void I() {
      if (this.G()) {
         int var1 = Math.min(this.s, this.t);
         int var2 = Math.max(this.s, this.t);
         int var9 = -1271321528;
         int var8 = 988886495;
         int var10002 = (var8 | var9) & (~var8 | ~var9);
         var9 = -1899488873;
         var8 = var10002;
         String var10001 = this.n.substring(var8 + var9 - 2 * (var8 & var9), var1);
         String var5 = this.n.substring(var2);
         String var4 = var10001;
         this.n = var4 + var5;
         this.r = var1;
         this.H();
         if (this.m != pulse.TokenSettingWidget.ValueType.PRICE) {
            if (c) {
               int var130 = (int)-1923854618164132134L;
               var9 = -617341257;
               var8 = var130;
               int var131 = (var8 | var9) - (var8 & var9);
               var9 = 803280997;
               var8 = var131;
               int var132 = var8 + var9 - 2 * (var8 & var9);
               int var133 = (int)6051404607211258454L;
               var9 = -1664129661;
               var8 = var133;
               int var134 = (var8 | var9) & ~(var8 & var9);
               var9 = 674375621;
               var8 = var134;
               int var135 = var8 + var9 - 2 * (var8 & var9);
               int var136 = (int)-4701787601581522494L;
               var9 = -852552536;
               var8 = var136;
               int var137 = (var8 | var9) & (~var8 | ~var9);
               var9 = -1421159062;
               var8 = var137;
               int var138 = (var8 | var9) - (var8 & var9);
               var9 = -890362975;
               var8 = -89950704;
               int var10000 = (var8 | var9) & ~(var8 & var9);
               var9 = -1006255875;
               var8 = var10000;
               int var7 = var8 & ~var9 | ~var8 & var9;
            }
         } else {
            int var3 = this.x();
            String var139 = this.n;
            var9 = -698387278;
            var8 = 1335699839;
            int var10003 = (var8 | var9) - (var8 & var9);
            var9 = -915570926;
            var8 = var10003;
            var10003 = (var8 & ~var9 | ~var8 & var9) * (var8 & ~var9 | ~var8 & var9);
            int var10004 = (int)-873896672810120019L;
            var9 = 1788786321;
            var8 = var10004;
            var10004 = (var8 | var9) - (var8 & var9);
            var9 = 600215135;
            var8 = var10004;
            var10004 = (var8 | var9) & (~var8 | ~var9);
            var9 = -1291083138;
            var8 = 2119959079;
            int var10006 = var8 + var9 - 2 * (var8 & var9);
            var9 = -849895343;
            var8 = var10006;
            var10006 = var8 & ~var9 | ~var8 & var9;
            var10006 = (int)-6503827603422276292L;
            var9 = -10210559;
            var8 = var10006;
            var10006 = var8 + var9 - 2 * (var8 & var9);
            var9 = 516335163;
            var8 = var10006;
            var10006 = var8 + var9 - 2 * (var8 & var9);
            var10006 = (int)-382664559172204416L;
            var9 = 1242895288;
            var8 = var10006;
            var10006 = (var8 | var9) & ~(var8 & var9);
            var9 = 679336745;
            var8 = var10006;
            var10006 = (var8 | var9) & ~(var8 & var9);
            int var10005 = (int)4045682980582735870L;
            var9 = 216138374;
            var8 = var10005;
            var10005 = (var8 | var9) & (~var8 | ~var9);
            var9 = 1487391308;
            var8 = var10005;
            var10005 = (var8 | var9) & (~var8 | ~var9);
            var10006 = (int)-2103982373661274284L;
            var9 = 383582739;
            var8 = var10006;
            var10006 = (var8 | var9) & (~var8 | ~var9);
            var9 = -1963926269;
            var8 = var10006;
            var10006 = (var8 | var9) & (~var8 | ~var9);
            var9 = 2860566;
            var8 = 2073390007;
            int var10007 = (var8 | var9) & (~var8 | ~var9);
            var9 = -861268338;
            var8 = var10007;
            var9 = (var8 | var9) - (var8 & var9);
            var8 = var10006;
            var10006 = var8 - ~var9 - 1;
            var10006 = (int)7889843949126676935L;
            var9 = 1759416193;
            var8 = var10006;
            var10006 = var8 + var9 - 2 * (var8 & var9);
            var9 = -1745297211;
            var8 = var10006;
            var10006 = var8 + var9 - 2 * (var8 & var9);
            var9 = -1864235204;
            var8 = -1717903589;
            var10007 = (var8 | var9) & ~(var8 & var9);
            var9 = -973133968;
            var8 = var10007;
            var10007 = (var8 | var9) & (~var8 | ~var9);
            var9 = -2117962807;
            var8 = -585935252;
            var10007 = (var8 | var9) & ~(var8 & var9);
            var9 = 1152562479;
            var8 = var10007;
            var10007 = (var8 | var9) & (~var8 | ~var9);
            String var10008 = "hb";
            int var181 = (int)6403950471959698719L;
            var9 = 539937952;
            var8 = var181;
            int var182 = var8 & ~var9 | ~var8 & var9;
            var9 = 1884289681;
            var8 = var182;
            String var141 = a(
               "쬹",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謴㑸\u007f\ua7eb꒺ꁿꥊ絥蹏⑮謣㑾|\ua7e1꒦ꀾ꤬絸蹚⑯謣㑄wꟲ꒡ꁸꤋ統蹯⑶謲㑺w\ua7e8꒡",
               var10005,
               var10006,
               var10007,
               var8 & ~var9 | ~var8 & var9
            );
            var10004 = (int)3491897263350593021L;
            var9 = -1881270451;
            var8 = var10004;
            var10004 = var8 & ~var9 | ~var8 & var9;
            var9 = 2009123729;
            var8 = var10004;
            var10004 = ((var8 | var9) & (~var8 | ~var9)) * ((var8 | var9) & (~var8 | ~var9));
            var10006 = (int)6001209139127097470L;
            var9 = -1044533165;
            var8 = var10006;
            var10006 = (var8 | var9) & (~var8 | ~var9);
            var9 = 1371678754;
            var8 = var10006;
            var10006 = (var8 | var9) - (var8 & var9);
            var9 = 1489302484;
            var8 = -1912111462;
            var10006 = (var8 | var9) - (var8 & var9);
            var9 = -691827377;
            var8 = var10006;
            var10006 = (var8 | var9) - (var8 & var9);
            var9 = -1567408086;
            var8 = 455036943;
            var10006 = (var8 | var9) & (~var8 | ~var9);
            var9 = -1182003148;
            var8 = var10006;
            var10006 = var8 & ~var9 | ~var8 & var9;
            String var170 = "hc";
            var10006 = (int)454396206747663198L;
            var9 = 1328880431;
            var8 = var10006;
            var10006 = var8 & ~var9 | ~var8 & var9;
            var9 = 846223173;
            var8 = var10006;
            var10006 = var8 & ~var9 | ~var8 & var9;
            String var178 = "hd";
            var9 = 1472894122;
            var8 = -1821415171;
            var10007 = var8 + var9 - 2 * (var8 & var9);
            var9 = 996376584;
            var8 = var10007;
            var10007 = (var8 | var9) & ~(var8 & var9);
            int var183 = (int)5438190760317369995L;
            var9 = -262275415;
            var8 = var183;
            int var184 = (var8 | var9) & ~(var8 & var9);
            var9 = 542303884;
            var8 = var184;
            int var185 = var8 & ~var9 | ~var8 & var9;
            var9 = 1286107057;
            var8 = 1217870918;
            int var10009 = var8 & ~var9 | ~var8 & var9;
            var9 = 952478805;
            var8 = var10009;
            var9 = var8 + var9 - 2 * (var8 & var9);
            var8 = var185;
            int var186 = (var8 | var9) + (var8 & var9);
            int var187 = (int)-3809480781402922382L;
            var9 = 1683958089;
            var8 = var187;
            int var188 = var8 & ~var9 | ~var8 & var9;
            var9 = -985407948;
            var8 = var188;
            int var189 = (var8 | var9) & ~(var8 & var9);
            var10009 = (int)-8413274276053485290L;
            var9 = -600204892;
            var8 = var10009;
            var10009 = (var8 | var9) & ~(var8 & var9);
            var9 = -1019423413;
            var8 = var10009;
            var10009 = var8 + var9 - 2 * (var8 & var9);
            int var10010 = (int)5928626341252319253L;
            var9 = 961915272;
            var8 = var10010;
            var10010 = (var8 | var9) - (var8 & var9);
            var9 = 586982885;
            var8 = var10010;
            var9 = var8 + var9 - 2 * (var8 & var9);
            var8 = var10009;
            var10009 = (var8 & ~var9) + (var9 & ~var8) + 2 * (var8 & var9);
            var9 = 1339730479;
            var8 = 1763213365;
            var10009 = (var8 | var9) - (var8 & var9);
            var9 = 653026064;
            var8 = var10009;
            this.n = this.b(
               var139.replace(
                  var141,
                  a(
                     "",
                     "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謴㑸\u007f\ua7eb꒺ꁿꥊ絥蹏⑮謣㑾|\ua7e1꒦ꀾ꤬絸蹚⑯謣㑄wꟲ꒡ꁸꤋ統蹯⑶謲㑺w\ua7e8꒡",
                     var10006,
                     var10007,
                     var189,
                     (var8 | var9) - (var8 & var9)
                  )
               )
            );
            this.r = this.a(var3);
         }

         this.u();
         this.t();
         this.q();
      }
   }

   private void J() {
      this.w.d(1.0);
      int var2 = 860978161;
      int var1 = 34321081;
      int var10001 = var1 & ~var2 | ~var1 & var2;
      var2 = 828033352;
      var1 = var10001;
      this.A = pulse.Bool.from((var1 | var2) & ~(var1 & var2));
      var2 = 2131344397;
      var1 = 113715363;
      var10001 = (var1 | var2) & (~var1 | ~var2);
      var2 = -931350932;
      var1 = var10001;
      var10001 = (var1 + var2 - 2 * (var1 & var2)) * (var1 + var2 - 2 * (var1 & var2));
      var2 = 2123508543;
      var1 = 1008395479;
      int var10002 = (var1 | var2) & (~var1 | ~var2);
      var2 = -594087163;
      var1 = var10002;
      var10002 = ((var1 | var2) - (var1 & var2)) * ((var1 | var2) - (var1 & var2));
      this.w.a(0.3, 0.5, pulse.Easing.i);
   }

   public boolean p() {
      if (this.m == pulse.TokenSettingWidget.ValueType.PLAYER) {
         int var17 = this.n.length();
         int var11 = 19629413;
         int var4 = 1024448423;
         int var10001 = (var4 | var11) - (var4 & var11);
         var11 = 1009013441;
         var4 = var10001;
         if (var17 < ((var4 | var11) & ~(var4 & var11))) {
            var11 = 2102807436;
            var4 = -1003697257;
            var17 = (var4 | var11) & ~(var4 & var11);
            var11 = -1183154149;
            var4 = var17;
            var17 = (var4 | var11) & ~(var4 & var11);
         } else {
            var17 = (int)1846233099403365924L;
            var11 = -1203042635;
            var4 = var17;
            var17 = (var4 | var11) & (~var4 | ~var11);
            var11 = 1724549264;
            var4 = var17;
            var17 = (var4 | var11) & (~var4 | ~var11);
         }

         return pulse.Bool.from(var17);
      } else {
         int var2 = -9059941;
         int var1 = 163934391;
         int var10000 = var1 & ~var2 | ~var1 & var2;
         var2 = -156192467;
         var1 = var10000;
         return pulse.Bool.from(var1 & (var2 ^ -1) | (var1 ^ -1) & var2);
      }
   }

   @Override
   public boolean d() {
      int var9;
      if (this.p != null && !this.p.m()) {
         int var7 = -309218184;
         int var4 = 1384127765;
         var9 = (var4 | var7) - (var4 & var7);
         var7 = -1089361555;
         var4 = var9;
         var9 = (var4 | var7) - (var4 & var7);
      } else {
         int var2 = -148431978;
         int var1 = 1508042137;
         var9 = var1 & ~var2 | ~var1 & var2;
         var2 = -1362756082;
         var1 = var9;
         var9 = (var1 | var2) & ~(var1 & var2);
      }

      return pulse.Bool.from(var9);
   }

   public static String a(String var0, String var1, int var2, int var3, int var4, int var5) {
      char[] var6 = var1.toCharArray();
      char[] var7 = new char[var6.length];
      int var10000 = (int)1606947346394835963L;
      int var18 = 607556934;
      int var17 = var10000;
      var10000 = (var17 | var18) & ~(var17 & var18);
      var18 = -559382857;
      var17 = var10000;
      char[] var246 = new char[var17 + var18 - 2 * (var17 & var18)];
      int var10002 = (int)619898480182123074L;
      var18 = -1744669197;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -1139986511;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1968040036;
      var17 = 969219917;
      int var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1284030237;
      var17 = var10003;
      var246[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var10002 = (int)8997983706283214881L;
      var18 = -545439817;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 884914071;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 255089461;
      var17 = 884548295;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 999119479;
      var17 = var10003;
      var246[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var10002 = (int)6007355930557610284L;
      var18 = -262904889;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 141335273;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)-7383659716648659705L;
      var18 = 1617816059;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -962175110;
      var17 = var10003;
      var246[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var18 = 1705890472;
      var17 = -557389265;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1150601084;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      String var311 = "he";
      var18 = -1473233980;
      var17 = 1458578847;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -20937144;
      var17 = var10003;
      var246[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var10002 = (int)562045794287861728L;
      var18 = 1669803543;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 1870696947;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 1427373169;
      var17 = -32829390;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -1190042293;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var10003 = (int)7380667040493909810L;
      var18 = 710433452;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -2008384325;
      var17 = var10003;
      var246[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var18 = -1451502704;
      var17 = 1054065957;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -1750591824;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)-8466853017182035607L;
      var18 = -849419359;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -2076899510;
      var17 = var10003;
      var246[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var18 = 998767649;
      var17 = 200622026;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 812827629;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)-746689816998535262L;
      var18 = -1837244797;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -568637390;
      var17 = var10003;
      var246[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var18 = -1361988640;
      var17 = -567701389;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1895310228;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var10003 = (int)-4897348818157194101L;
      var18 = -774697713;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1453552218;
      var17 = var10003;
      var246[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var18 = 1604646375;
      var17 = -445255574;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1160706683;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -2120117326;
      var17 = 704827602;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -1415361741;
      var17 = var10003;
      var246[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var10002 = (int)8945974098314008714L;
      var18 = -1608553738;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -876252555;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)-4740618086876920027L;
      var18 = 854688552;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1323744471;
      var17 = var10003;
      var246[var10002] = (char)((var17 | var18) - (var17 & var18));
      char[] var8 = var246;
      var18 = 1488891155;
      var17 = -1181509202;
      var10000 = (var17 | var18) & (~var17 | ~var18);
      var18 = -517131081;
      var17 = var10000;
      char[] var248 = new char[(var17 | var18) & (~var17 | ~var18)];
      var18 = 1483253245;
      var17 = -200239563;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1401408568;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)-7401951977799714572L;
      var18 = -701132572;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 1619697712;
      var17 = var10003;
      var248[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var10002 = (int)922298848963132428L;
      var18 = 756790948;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -2010559831;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)6402131792925062960L;
      var18 = -925852304;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1503448993;
      var17 = var10003;
      var10003 = ((var17 | var18) - (var17 & var18)) * ((var17 | var18) - (var17 & var18));
      var18 = 1144882246;
      var17 = 1097575082;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 89565935;
      var17 = var10003;
      var248[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var18 = 1018925013;
      var17 = 605357419;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 414091964;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -1859601218;
      var17 = -915299070;
      int var10004 = var17 & ~var18 | ~var17 & var18;
      var18 = 1482234298;
      var17 = var10004;
      var10004 = var17 & ~var18 | ~var17 & var18;
      var18 = -43530025;
      var17 = -635685685;
      var10004 = var17 + var18 - 2 * (var17 & var18);
      var18 = 662436893;
      var17 = var10004;
      var10004 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)-2188920414234808623L;
      var18 = 956254448;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 856760690;
      var17 = var10003;
      var248[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var18 = 739954788;
      var17 = -196334591;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -665387930;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -983051865;
      var17 = 815216037;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -168764416;
      var17 = var10003;
      var248[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var18 = 1705698128;
      var17 = -522956431;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -2055294427;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)-9180706271586801443L;
      var18 = -1103679423;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 686366940;
      var17 = var10003;
      var248[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var18 = 249788602;
      var17 = -1141075895;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1256199946;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -692917416;
      var17 = 2097287410;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1414479042;
      var17 = var10003;
      var248[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var10002 = (int)2862480818671531771L;
      var18 = 1164036290;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 807992895;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      String var338 = "hf";
      var10003 = (int)3823677381366633372L;
      var18 = -708038268;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 29451553;
      var17 = var10003;
      var248[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var10002 = (int)5401681996998184326L;
      var18 = -1014643645;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -281622078;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)-337914348315115615L;
      var18 = 2120311014;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -1236660353;
      var17 = var10003;
      var248[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var18 = 1278046677;
      var17 = -352450816;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -1496090915;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -335644748;
      var17 = -2074012154;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 204398052;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 697567272;
      var17 = -409836944;
      var10004 = var17 & ~var18 | ~var17 & var18;
      var18 = -1442785667;
      var17 = var10004;
      var18 = var17 + var18 - 2 * (var17 & var18);
      var17 = var10003;
      var10003 = (var17 ^ var18) + 2 * (var17 & var18);
      var18 = 1492467278;
      var17 = 1662874220;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 1005113126;
      var17 = var10003;
      var248[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var18 = -896698216;
      var17 = 1221770322;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -2107652925;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 1100768239;
      var17 = -976296650;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -2074954262;
      var17 = var10003;
      var248[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      char[] var9 = var248;
      var10000 = (int)-6616453858053479972L;
      var18 = -198880156;
      var17 = var10000;
      var10000 = (var17 | var18) - (var17 & var18);
      var18 = 1909519800;
      var17 = var10000;

      for (int var10 = (var17 | var18) & (~var17 | ~var18); var10 < var6.length; var10++) {
         char var304 = var6[var10];
         char var231 = var8[var10 % var8.length];
         char var119 = var304;
         var7[var10] = (char)(var119 + var231 - 2 * (var119 & var231));
      }

      char[] var19 = new char[var7.length];
      var10000 = (int)-5927470886241288174L;
      var18 = -1089597809;
      var17 = var10000;
      var10000 = (var17 | var18) & (~var17 | ~var18);
      var18 = -300921187;
      var17 = var10000;

      for (int var11 = var17 + var18 - 2 * (var17 & var18); var11 < var6.length; var11++) {
         char var305 = var7[var11];
         char var234 = var9[var11 % var9.length];
         char var122 = var305;
         var19[var11] = (char)(var122 + var234 - 2 * (var122 & var234));
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
      var10000 = (int)-6174955482415513347L;
      var18 = 115304407;
      var17 = var10000;
      var10000 = (var17 | var18) - (var17 & var18);
      var18 = 2015012650;
      var17 = var10000;

      for (int var16 = (var17 | var18) & (~var17 | ~var18); var16 < var15.length; var16++) {
         int var10001 = (int)6868514420155128465L;
         var18 = -2102095962;
         var17 = var10001;
         var10001 = var17 + var18 - 2 * (var17 & var18);
         var18 = -515238603;
         var17 = var10001;
         switch (var16 % (var17 & ~var18 | ~var17 & var18)) {
            case 0:
               var18 = var12;
               var17 = var13;
               var10002 = (var17 | var18) & ~(var17 & var18);
               char var244 = var14[var16];
               var17 = var10002;
               var15[var16] = (char)(var17 + var244 - 2 * (var17 & var244));
               break;
            case 1:
               var18 = var13;
               var17 = var5;
               var10002 = var17 + var18 - 2 * (var17 & var18);
               char var242 = var14[var16];
               var17 = var10002;
               var15[var16] = (char)((var17 | var242) & (~var17 | ~var242));
         }
      }

      return new String(var15);
   }

   public enum ValueType {
      COMMAND,
      PRICE,
      PLAYER,
      INT;

      public static int e;
      public static boolean f;

      public static String a(String value, String key, int seed1, int seed2, int seed3, int seed4) {
         return value;
      }
   }
}
