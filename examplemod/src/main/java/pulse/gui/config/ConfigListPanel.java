package pulse;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import net.minecraft.client.util.math.MatrixStack;

public class ConfigListPanel {
   private static final float c = 6.0F;
   private static final float d = -5.0F;
   private static final float e = 4.0F;
   private static final float f = 2.0F;
   private final List<ConfigEntry> g = new ArrayList<>();
   private final List<ConfigCard> h = new ArrayList<>();
   private final ScrollBar i;
   private final PanelFadeOverlay j;
   private final SearchBox k;
   private final ConfigActionMenu l;
   private final ConfigNameDialog m;
   private final ConfigBoundsDialog n;
   private final ConfigTextDialog o;
   private String p;
   private List<ConfigCard> q;
   private Consumer<ConfigEntry> r;
   private Consumer<ConfigEntry> s;
   private ConfigListPanel.RenameCallback t;
   private Consumer<ConfigEntry> u;
   private float v;
   private float w;
   private float x;
   private float y;
   private ConfigEntry z;
   public static int a;
   public static boolean b;

   public ConfigListPanel(SearchBox var1) {
      int var10001 = (int)-8355756910270822029L;
      int var3 = -301078591;
      int var2 = var10001;
      var10001 = (var2 | var3) - (var2 & var3);
      var3 = -1918314098;
      var2 = var10001;
      var10001 = var2 & ~var3 | ~var2 & var3;
      var3 = 576494531;
      var2 = 535784116;
      int var10002 = (var2 | var3) & ~(var2 & var3);
      var3 = 1581210161;
      var2 = var10002;
      var3 = (var2 | var3) & ~(var2 & var3);
      var2 = var10001;
      var10001 = 2 * (var2 | var3) - (var2 ^ var3);
      int var10003 = (int)9002797456320113038L;
      var3 = 2073598976;
      var2 = var10003;
      var10003 = var2 + var3 - 2 * (var2 & var3);
      var3 = 190363022;
      var2 = var10003;
      var10003 = (var2 | var3) & ~(var2 & var3);
      var3 = -594534614;
      var2 = 194771511;
      var10003 = (var2 | var3) & (~var2 | ~var3);
      var3 = -687086308;
      var2 = var10003;
      var10003 = (var2 | var3) - (var2 & var3);
      var10003 = (int)6341644571373353778L;
      var3 = -637937302;
      var2 = var10003;
      var10003 = (var2 | var3) & (~var2 | ~var3);
      var3 = -1182277034;
      var2 = var10003;
      var10003 = var2 & ~var3 | ~var2 & var3;
      var10003 = (int)-9056881052092872116L;
      var3 = 1193057303;
      var2 = var10003;
      var10003 = (var2 | var3) - (var2 & var3);
      var3 = 1097597422;
      var2 = var10003;
      var10003 = (var2 | var3) - (var2 & var3);
      var10003 = (int)3223701787602714756L;
      var3 = 1558265471;
      var2 = var10003;
      var10003 = (var2 | var3) - (var2 & var3);
      var3 = 896263314;
      var2 = var10003;
      var10003 = (var2 | var3) & (~var2 | ~var3);
      var3 = -1950663512;
      var2 = -1346874426;
      int var10004 = (var2 | var3) & ~(var2 & var3);
      var3 = 2111128137;
      var2 = var10004;
      var10004 = (var2 | var3) & ~(var2 & var3);
      var3 = 1898675589;
      var2 = -1561373645;
      var10004 = (var2 | var3) & (~var2 | ~var3);
      var3 = 1762362070;
      var2 = var10004;
      var10004 = (var2 | var3) - (var2 & var3);
      String var10005 = "si";
      var3 = -1537812575;
      var2 = 1981329333;
      int var116 = (var2 | var3) & (~var2 | ~var3);
      var3 = -234690759;
      var2 = var116;
      int var117 = (var2 | var3) & (~var2 | ~var3);
      int var10006 = (int)-429756246405128042L;
      var3 = 702665989;
      var2 = var10006;
      var10006 = (var2 | var3) & (~var2 | ~var3);
      var3 = -1826496100;
      var2 = var10006;
      var10006 = ((var2 | var3) & (~var2 | ~var3)) * ((var2 | var3) & (~var2 | ~var3));
      var10006 = (int)5965836351187968018L;
      var3 = -205656554;
      var2 = var10006;
      var10006 = var2 + var3 - 2 * (var2 & var3);
      var3 = 1731641473;
      var2 = var10006;
      this.p = a("", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩講㑾aꟲꒅꁰꤋ絳蹆", var10003, var10004, var117, var2 + var3 - 2 * (var2 & var3));
      this.q = new ArrayList<>();
      this.k = var1;
      this.k.a(this::d);
      String var115 = "sj";
      this.i = new ScrollBar(2.0F, 20.0F);
      ScrollBar var10000 = this.i;
      var3 = -602963379;
      var2 = -1564373534;
      var10002 = (var2 | var3) - (var2 & var3);
      var3 = 2127433639;
      var2 = var10002;
      var10002 = (var2 | var3) & ~(var2 & var3);
      var3 = -644533280;
      var2 = 1265687193;
      var10002 = (var2 | var3) - (var2 & var3);
      var3 = -1830426248;
      var2 = var10002;
      var10002 = (var2 | var3) - (var2 & var3);
      var10002 = (int)8991921386254945348L;
      var3 = 1107342494;
      var2 = var10002;
      var10002 = (var2 | var3) & ~(var2 & var3);
      var3 = 1240889563;
      var2 = var10002;
      var10002 = var2 & ~var3 | ~var2 & var3;
      var10002 = (int)-396500698534698435L;
      var3 = 171022265;
      var2 = var10002;
      var10002 = var2 + var3 - 2 * (var2 & var3);
      var3 = 747943317;
      var2 = var10002;
      var10002 = (var2 | var3) & ~(var2 & var3);
      var10002 = (int)8189251270593975781L;
      var3 = -1222041294;
      var2 = var10002;
      var10002 = var2 + var3 - 2 * (var2 & var3);
      var3 = -687688506;
      var2 = var10002;
      var10002 = (var2 | var3) & ~(var2 & var3);
      var10000.b(10.0F);
      this.i.a(pulse.Theme.b);
      this.i.b(pulse.Theme.d);
      var10003 = (int)-3348435292547685152L;
      var3 = -818011144;
      var2 = var10003;
      var10003 = var2 + var3 - 2 * (var2 & var3);
      var3 = 1433290497;
      var2 = var10003;
      var10003 = (var2 | var3) & (~var2 | ~var3);
      int var118 = (int)-9206507469480134069L;
      var3 = 1027069947;
      var2 = var118;
      int var119 = (var2 | var3) & ~(var2 & var3);
      var3 = 781200800;
      var2 = var119;
      int var120 = (var2 | var3) - (var2 & var3);
      var10005 = "sk";
      this.j = new PanelFadeOverlay(var10003, 5.0F, 9.0F);
      this.l = new ConfigActionMenu();
      this.m = new ConfigNameDialog();
      this.n = new ConfigBoundsDialog();
      this.o = new ConfigTextDialog();
      this.i();
   }

   private void i() {
      this.l.a((java.util.function.Consumer<ConfigActionMenu.Action>)this::a);
      this.l.a(() -> this.z = null);
      this.m
         .a(
            var1 -> {
               ConfigManager var2 = ConfigManager.a();
               if (var2.i()) {
                  var2.c(
                     var1,
                     () -> {
                        int var2x = 1437786757;
                        int var1x = -197991071;
                        int var10000x = (var1x | var2x) & (~var1x | ~var2x);
                        var2x = -1736156784;
                        var1x = var10000x;
                        var10000x = var1x + var2x - 2 * (var1x & var2x);
                        var2x = 369130768;
                        var1x = 484863469;
                        int var10001x = (var1x | var2x) - (var1x & var2x);
                        var2x = -147032842;
                        var1x = var10001x;
                        var2x = var1x + var2x - 2 * (var1x & var2x);
                        var1x = var10000x;
                        var10000x = (var1x | var2x) + (var1x & var2x);
                        var10001x = (int)7188687087883168477L;
                        var2x = -442715157;
                        var1x = var10001x;
                        var10001x = (var1x | var2x) - (var1x & var2x);
                        var2x = 441150034;
                        var1x = var10001x;
                        var10001x = ((var1x | var2x) - (var1x & var2x)) * ((var1x | var2x) - (var1x & var2x));
                        String var10002x = "we";
                        var2x = 1378866747;
                        var1x = -1465544879;
                        int var56x = (var1x | var2x) & (~var1x | ~var2x);
                        var2x = -1260748029;
                        var1x = var56x;
                        int var57x = var1x + var2x - 2 * (var1x & var2x);
                        String var10003x = "wf";
                        int var58x = (int)2045041896734536885L;
                        var2x = -1426966103;
                        var1x = var58x;
                        int var59x = var1x + var2x - 2 * (var1x & var2x);
                        var2x = -1363540663;
                        var1x = var59x;
                        int var60x = (var1x | var2x) & ~(var1x & var2x);
                        int var10004x = (int)1886095021908854970L;
                        var2x = 1791143133;
                        var1x = var10004x;
                        var10004x = var1x & ~var2x | ~var1x & var2x;
                        var2x = -1673951478;
                        var1x = var10004x;
                        var10004x = var1x + var2x - 2 * (var1x & var2x);
                        int var10005x = (int)-7132811061442737749L;
                        var2x = -1619178138;
                        var1x = var10005x;
                        var10005x = (var1x | var2x) - (var1x & var2x);
                        var2x = 967676391;
                        var1x = var10005x;
                        var2x = (var1x | var2x) & ~(var1x & var2x);
                        var1x = var10004x;
                        var10004x = (var1x ^ var2x) + 2 * (var1x & var2x);
                        var10004x = (int)9083752503291900288L;
                        var2x = -630639118;
                        var1x = var10004x;
                        var10004x = (var1x | var2x) - (var1x & var2x);
                        var2x = -42120005;
                        var1x = var10004x;
                        var10004x = (var1x | var2x) & (~var1x | ~var2x);
                        var10005x = (int)5279334355533884751L;
                        var2x = 189484302;
                        var1x = var10005x;
                        var10005x = var1x + var2x - 2 * (var1x & var2x);
                        var2x = -1558585756;
                        var1x = var10005x;
                        var10005x = (var1x | var2x) & (~var1x | ~var2x);
                        int var10006 = (int)1949872552058849668L;
                        var2x = 200214202;
                        var1x = var10006;
                        var10006 = (var1x | var2x) & ~(var1x & var2x);
                        var2x = -594917984;
                        var1x = var10006;
                        var2x = (var1x | var2x) & ~(var1x & var2x);
                        var1x = var10005x;
                        var10005x = (var1x & ~var2x) + (var2x & ~var1x) + 2 * (var1x & var2x);
                        var10005x = (int)8081131299699728087L;
                        var2x = -1864683314;
                        var1x = var10005x;
                        var10005x = var1x + var2x - 2 * (var1x & var2x);
                        var2x = 1695739272;
                        var1x = var10005x;
                        ChatMessages.a(
                           (Object)a(
                              "㐨귴㐏궎㐊극〒귲㐎귵㐌궊㑰귲㑲귴㐀귺㐏ꧫ",
                              "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩講㑾aꟲꒅꁰꤋ絳蹆",
                              var57x,
                              var60x,
                              var10004x,
                              (var1x | var2x) & (~var1x | ~var2x)
                           )
                        );
                        this.j();
                     },
                     var1x -> ChatMessages.a((Object)this.a(var1x))
                  );
               } else {
                  int var10000 = (int)-1327619513202472604L;
                  int var4 = 191319861;
                  int var3 = var10000;
                  var10000 = (var3 | var4) - (var3 & var4);
                  var4 = -805034913;
                  var3 = var10000;
                  var10000 = var3 + var4 - 2 * (var3 & var4);
                  var4 = 652670815;
                  var3 = 23051621;
                  int var10001 = var3 & ~var4 | ~var3 & var4;
                  var4 = -925013716;
                  var3 = var10001;
                  var10001 = (var3 + var4 - 2 * (var3 & var4)) * (var3 + var4 - 2 * (var3 & var4));
                  var4 = -1162411993;
                  var3 = 115419676;
                  int var10002 = (var3 | var4) - (var3 & var4);
                  var4 = 687323931;
                  var3 = var10002;
                  var10002 = var3 & ~var4 | ~var3 & var4;
                  int var10003 = (int)-4406855186913934526L;
                  var4 = -1034823727;
                  var3 = var10003;
                  var10003 = var3 & ~var4 | ~var3 & var4;
                  var4 = -762401579;
                  var3 = var10003;
                  var4 = (var3 | var4) & ~(var3 & var4);
                  var3 = var10002;
                  var10002 = (var3 ^ var4) + 2 * (var3 & var4);
                  var10002 = (int)-6145028320081759844L;
                  var4 = 1395897295;
                  var3 = var10002;
                  var10002 = (var3 | var4) & ~(var3 & var4);
                  var4 = -340993990;
                  var3 = var10002;
                  var10002 = var3 + var4 - 2 * (var3 & var4);
                  var4 = -1816856737;
                  var3 = 1679875674;
                  var10003 = (var3 | var4) - (var3 & var4);
                  var4 = 1314412558;
                  var3 = var10003;
                  var10003 = (var3 | var4) & (~var3 | ~var4);
                  var4 = -1584489070;
                  var3 = -1689409808;
                  int var10004 = (var3 | var4) - (var3 & var4);
                  var4 = 1985205461;
                  var3 = var10004;
                  var4 = (var3 | var4) & ~(var3 & var4);
                  var3 = var10003;
                  var10003 = (var3 | var4) + (var3 & var4);
                  var4 = 2138030314;
                  var3 = 1064611095;
                  var10003 = var3 + var4 - 2 * (var3 & var4);
                  var4 = 1510631751;
                  var3 = var10003;
                  var10003 = (var3 | var4) & (~var3 | ~var4);
                  int var10005 = (int)8847807768536865299L;
                  var4 = 12567857;
                  var3 = var10005;
                  var10005 = var3 & ~var4 | ~var3 & var4;
                  var4 = -1406460128;
                  var3 = var10005;
                  var10005 = var3 & ~var4 | ~var3 & var4;
                  var4 = -2084634074;
                  var3 = 1351181025;
                  var10004 = (var3 | var4) - (var3 & var4);
                  var4 = -778574834;
                  var3 = var10004;
                  var10004 = var3 + var4 - 2 * (var3 & var4);
                  var10005 = (int)284973199513711431L;
                  var4 = -393047398;
                  var3 = var10005;
                  var10005 = var3 + var4 - 2 * (var3 & var4);
                  var4 = 1972626387;
                  var3 = var10005;
                  var10005 = ((var3 | var4) & (~var3 | ~var4)) * ((var3 | var4) & (~var3 | ~var4));
                  var4 = 116460106;
                  var3 = 1890568620;
                  var10005 = (var3 | var4) - (var3 & var4);
                  var4 = 1980890130;
                  var3 = var10005;
                  ChatMessages.a(
                     (Object)a(
                        "㐮톗㐉퇭㐌톚㐌행㐁퇠㑥행㐃톙㐇퇩㑷톟㐄퇧㑶퇨㑻햇〚햇",
                        "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩講㑾aꟲꒅꁰꤋ絳蹆",
                        var10002,
                        var10003,
                        var10004,
                        (var3 | var4) & ~(var3 & var4)
                     )
                  );
               }
            }
         );
      this.n
         .a(
            (var1, var2) -> {
               ConfigManager var3 = ConfigManager.a();
               if (var3.i()) {
                  ConfigEntry var4 = this.n.d();
                  if (var4 != null) {
                     Object var5 = null;
                     var3.a(var4.a(), var1, (Integer)var5, var2, var2x -> this.o.a(var2x, var4), var1x -> ChatMessages.a((Object)this.b(var1x)));
                  }
               } else {
                  int var7 = 642841391;
                  int var6 = 1461755872;
                  int var10000 = (var6 | var7) & (~var6 | ~var7);
                  var7 = 1475866096;
                  var6 = var10000;
                  var10000 = var6 & ~var7 | ~var6 & var7;
                  int var10001 = (int)-374367886912673609L;
                  var7 = -261817143;
                  var6 = var10001;
                  var10001 = var6 & ~var7 | ~var6 & var7;
                  var7 = 1522005238;
                  var6 = var10001;
                  var7 = (var6 | var7) - (var6 & var7);
                  var6 = var10000;
                  var10000 = var6 - ~var7 - 1;
                  int var10002 = (int)1242139618633593642L;
                  var7 = -266614148;
                  var6 = var10002;
                  var10002 = var6 & ~var7 | ~var6 & var7;
                  var7 = 436468052;
                  var6 = var10002;
                  var10002 = (var6 | var7) & (~var6 | ~var7);
                  var10002 = (int)7022782936111456857L;
                  var7 = 1993549049;
                  var6 = var10002;
                  var10002 = (var6 | var7) & ~(var6 & var7);
                  var7 = 927598258;
                  var6 = var10002;
                  var10002 = var6 + var7 - 2 * (var6 & var7);
                  String var56 = "wc";
                  var7 = 212120367;
                  var6 = 2053310196;
                  var10002 = (var6 | var7) & ~(var6 & var7);
                  var7 = 949448626;
                  var6 = var10002;
                  var10002 = var6 + var7 - 2 * (var6 & var7);
                  int var10003 = (int)6417663120230787421L;
                  var7 = -760090067;
                  var6 = var10003;
                  var10003 = var6 & ~var7 | ~var6 & var7;
                  var7 = 297285656;
                  var6 = var10003;
                  var10003 = (var6 | var7) - (var6 & var7);
                  var10003 = (int)-2795988473010441474L;
                  var7 = -2035717470;
                  var6 = var10003;
                  var10003 = var6 & ~var7 | ~var6 & var7;
                  var7 = -1318108746;
                  var6 = var10003;
                  var10003 = (var6 | var7) - (var6 & var7);
                  int var10004 = (int)8125073401630347743L;
                  var7 = 215858983;
                  var6 = var10004;
                  var10004 = (var6 | var7) - (var6 & var7);
                  var7 = 539277958;
                  var6 = var10004;
                  var10004 = ((var6 | var7) - (var6 & var7)) * ((var6 | var7) - (var6 & var7));
                  var10004 = (int)-433644116088370031L;
                  var7 = -1840618750;
                  var6 = var10004;
                  var10004 = var6 + var7 - 2 * (var6 & var7);
                  var7 = -1052254261;
                  var6 = var10004;
                  var10004 = (var6 | var7) & ~(var6 & var7);
                  String var10005 = "wd";
                  var7 = 1637055636;
                  var6 = -2050365723;
                  int var69 = var6 & ~var7 | ~var6 & var7;
                  var7 = -461451440;
                  var6 = var69;
                  ChatMessages.a(
                     (Object)a(
                        "㐓뭿㐴묅㐱뭲㐱뽡㐼묈㑘뽡㐾뭱㐺묁㑊뭷㐹묏㑋묀㑆뽯〧뽯",
                        "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩講㑾aꟲꒅꁰꤋ絳蹆",
                        var10002,
                        var10003,
                        var10004,
                        var6 & ~var7 | ~var6 & var7
                     )
                  );
               }
            }
         );
   }

   private String a(String var1) {
      if (var1 == null) {
         String var770 = "sl";
         String var822 = "sm";
         int var882 = (int)4434718145915970412L;
         int var723 = 178451158;
         int var357 = var882;
         var882 = (var357 | var723) & (~var357 | ~var723);
         var723 = -1227122225;
         var357 = var882;
         var882 = var357 + var723 - 2 * (var357 & var723);
         var882 = (int)-5086416447450173584L;
         var723 = 2094090406;
         var357 = var882;
         var882 = (var357 | var723) & ~(var357 & var723);
         var723 = -1803108929;
         var357 = var882;
         var882 = (var357 | var723) - (var357 & var723);
         var723 = -295577895;
         var357 = -1921338486;
         int var957 = var357 & ~var723 | ~var357 & var723;
         var723 = 1591387062;
         var357 = var957;
         var957 = (var357 + var723 - 2 * (var357 & var723)) * (var357 + var723 - 2 * (var357 & var723));
         var723 = 515217752;
         var357 = 1021514822;
         var957 = var357 & ~var723 | ~var357 & var723;
         var723 = -1030016612;
         var357 = var957;
         var957 = (var357 | var723) & (~var357 | ~var723);
         int var1037 = (int)-4373608754543083102L;
         var723 = 1271789473;
         var357 = var1037;
         var1037 = var357 & ~var723 | ~var357 & var723;
         var723 = -1599158428;
         var357 = var1037;
         var1037 = (var357 | var723) & (~var357 | ~var723);
         var723 = 234290001;
         var357 = -1065288384;
         int var1110 = var357 & ~var723 | ~var357 & var723;
         var723 = 1823118702;
         var357 = var1110;
         var723 = (var357 | var723) & (~var357 | ~var723);
         var357 = var1037;
         var1037 = (var357 | var723) + (var357 & var723);
         var723 = -86529786;
         var357 = 233791519;
         var1037 = var357 & ~var723 | ~var357 & var723;
         var723 = -439278911;
         var357 = var1037;
         var1037 = var357 + var723 - 2 * (var357 & var723);
         var723 = -802503048;
         var357 = 1965447510;
         var1110 = var357 + var723 - 2 * (var357 & var723);
         var723 = 868599248;
         var357 = var1110;
         var1110 = ((var357 | var723) & ~(var357 & var723)) * ((var357 | var723) & ~(var357 & var723));
         var723 = 650202595;
         var357 = 2039262133;
         var1110 = (var357 | var723) & (~var357 | ~var723);
         var723 = 1598207528;
         var357 = var1110;
         return a(
            "俯에俊엒俀에侳얧俏엕侽쇅俌얭俊엔俈엕", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩講㑾aꟲꒅꁰꤋ絳蹆", var882, var957, var1037, (var357 | var723) & ~(var357 & var723)
         );
      }

      String var2 = var1;
      int var10000 = (int)633212160974728962L;
      int var8 = 1993049262;
      int var7 = var10000;
      var10000 = (var7 | var8) & (~var7 | ~var8);
      var8 = -1955638189;
      var7 = var10000;
      int var3 = var7 & ~var8 | ~var7 & var8;
      switch (var2.hashCode()) {
         case -2026653947:
            var8 = 1418939355;
            var7 = -1831783629;
            int var785 = var7 & ~var8 | ~var7 & var8;
            var8 = -121863375;
            var7 = var785;
            var785 = (var7 & ~var8 | ~var7 & var8) * (var7 & ~var8 | ~var7 & var8);
            var8 = -188686700;
            var7 = -886993757;
            int var840 = (var7 | var8) - (var7 & var8);
            var8 = 425040757;
            var7 = var840;
            var840 = (var7 + var8 - 2 * (var7 & var8)) * (var7 + var8 - 2 * (var7 & var8));
            int var913 = (int)-5297531748657702659L;
            var8 = 1623874817;
            var7 = var913;
            var913 = (var7 | var8) & (~var7 | ~var8);
            var8 = -1542638104;
            var7 = var913;
            var913 = var7 & ~var8 | ~var7 & var8;
            int var996 = (int)-7441158327685740974L;
            var8 = 2075851565;
            var7 = var996;
            var996 = (var7 | var8) & (~var7 | ~var8);
            var8 = -411996240;
            var7 = var996;
            var8 = (var7 | var8) & (~var7 | ~var8);
            var7 = var913;
            var913 = var7 - ~var8 - 1;
            var913 = (int)-1048254730181263102L;
            var8 = 1629933910;
            var7 = var913;
            var913 = var7 & ~var8 | ~var7 & var8;
            var8 = 1511672381;
            var7 = var913;
            var913 = (var7 | var8) & (~var7 | ~var8);
            var8 = -1576894436;
            var7 = -673224310;
            var996 = (var7 | var8) & (~var7 | ~var8);
            var8 = 311171332;
            var7 = var996;
            var996 = (var7 | var8) & (~var7 | ~var8);
            var8 = -1688126094;
            var7 = 1472611639;
            int var1065 = (var7 | var8) & (~var7 | ~var8);
            var8 = -478857589;
            var7 = var1065;
            var8 = (var7 | var8) & (~var7 | ~var8);
            var7 = var996;
            var996 = (var7 ^ var8) + 2 * (var7 & var8);
            var8 = 1945485651;
            var7 = -1863445356;
            var996 = var7 + var8 - 2 * (var7 & var8);
            var8 = 65976075;
            var7 = var996;
            var996 = (var7 | var8) - (var7 & var8);
            String var1066 = "ss";
            var1065 = (int)-3499808787371945141L;
            var8 = 1720037943;
            var7 = var1065;
            var1065 = var7 + var8 - 2 * (var7 & var8);
            var8 = 649917252;
            var7 = var1065;
            var1065 = var7 & ~var8 | ~var7 & var8;
            var8 = -1595613195;
            var7 = -851293070;
            int var1145 = (var7 | var8) & ~(var7 & var8);
            var8 = -886339045;
            var7 = var1145;
            var1145 = ((var7 | var8) & ~(var7 & var8)) * ((var7 | var8) & ~(var7 & var8));
            var1145 = (int)1877423614471508163L;
            var8 = 1729321104;
            var7 = var1145;
            var1145 = var7 & ~var8 | ~var7 & var8;
            var8 = -156975461;
            var7 = var1145;
            if (var2.equals(
               a("䮻朽䮆朶䮀朽䮓朿䯒朶䮀朡䮝朡", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩講㑾aꟲꒅꁰꤋ絳蹆", var913, var996, var1065, (var7 | var8) & (~var7 | ~var8))
            )) {
               var10000 = (int)2749629212778590035L;
               var8 = -592875716;
               var7 = var10000;
               var10000 = var7 & ~var8 | ~var7 & var8;
               var8 = -1222836117;
               var7 = var10000;
               var3 = var7 & ~var8 | ~var7 & var8;
            }
            break;
         case -1694123818:
            String var784 = "sn";
            var8 = 1158170294;
            var7 = -229062110;
            int var838 = (var7 | var8) - (var7 & var8);
            var8 = -710463255;
            var7 = var838;
            var838 = var7 + var8 - 2 * (var7 & var8);
            int var906 = (int)-4174026793710487695L;
            var8 = 184970574;
            var7 = var906;
            var906 = (var7 | var8) & (~var7 | ~var8);
            var8 = 1533849232;
            var7 = var906;
            var906 = var7 + var8 - 2 * (var7 & var8);
            int var991 = (int)-1198817159689881369L;
            var8 = 1838843385;
            var7 = var991;
            var991 = var7 + var8 - 2 * (var7 & var8);
            var8 = -1486807258;
            var7 = var991;
            var8 = var7 & ~var8 | ~var7 & var8;
            var7 = var906;
            var906 = var7 - ~var8 - 1;
            var906 = (int)7567999976815799187L;
            var8 = 1604153661;
            var7 = var906;
            var906 = var7 & ~var8 | ~var7 & var8;
            var8 = -678919993;
            var7 = var906;
            var906 = var7 & ~var8 | ~var7 & var8;
            String var993 = "so";
            var8 = 1966435202;
            var7 = 350113086;
            var991 = var7 & ~var8 | ~var7 & var8;
            var8 = -2130561427;
            var7 = var991;
            var991 = (var7 | var8) & (~var7 | ~var8);
            var8 = 2083227073;
            var7 = -1918185422;
            int var1133 = var7 & ~var8 | ~var7 & var8;
            var8 = -243182095;
            var7 = var1133;
            var1133 = var7 & ~var8 | ~var7 & var8;
            var8 = -1593240813;
            var7 = 12788109;
            var1133 = (var7 | var8) - (var7 & var8);
            var8 = -1580584298;
            var7 = var1133;
            var1133 = var7 & ~var8 | ~var7 & var8;
            var8 = 1091705878;
            var7 = -655896214;
            var1133 = (var7 | var8) - (var7 & var8);
            var8 = -1711944329;
            var7 = var1133;
            var1133 = var7 & ~var8 | ~var7 & var8;
            var8 = -498738100;
            var7 = -583794548;
            var1133 = var7 & ~var8 | ~var7 & var8;
            var8 = 1064426691;
            var7 = var1133;
            var1133 = (var7 | var8) & ~(var7 & var8);
            var8 = 202275091;
            var7 = -2083345435;
            int var1063 = (var7 | var8) & ~(var7 & var8);
            var8 = -2020570496;
            var7 = var1063;
            var1063 = (var7 | var8) - (var7 & var8);
            var8 = -311451425;
            var7 = 595968804;
            var1133 = var7 + var8 - 2 * (var7 & var8);
            var8 = -1924287261;
            var7 = var1133;
            var1133 = (var7 | var8) & ~(var7 & var8);
            var8 = 3738339;
            var7 = 1636420227;
            int var10007 = (var7 | var8) & ~(var7 & var8);
            var8 = -1191874296;
            var7 = var10007;
            var8 = (var7 | var8) & ~(var7 & var8);
            var7 = var1133;
            var1133 = (var7 | var8) + (var7 & var8);
            var8 = -428461957;
            var7 = 730118991;
            var1133 = (var7 | var8) & (~var7 | ~var8);
            var8 = -841469959;
            var7 = var1133;
            if (var2.equals(
               a("䮹㔓䮫㔉䮼㔙䮦㔉䮴㔙䮧㔘䮶", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩講㑾aꟲꒅꁰꤋ絳蹆", var906, var991, var1063, var7 & ~var8 | ~var7 & var8)
            )) {
               var8 = -653634035;
               var7 = -728039237;
               var10000 = var7 + var8 - 2 * (var7 & var8);
               var8 = 227628726;
               var7 = var10000;
               var3 = var7 + var8 - 2 * (var7 & var8);
            }
            break;
         case -1656561260:
            var8 = 366957893;
            var7 = 14000683;
            int var781 = (var7 | var8) & ~(var7 & var8);
            var8 = -320318038;
            var7 = var781;
            var781 = (var7 | var8) - (var7 & var8);
            var8 = 2052736511;
            var7 = 1501104281;
            int var833 = (var7 | var8) & ~(var7 & var8);
            var8 = 1585623522;
            var7 = var833;
            var8 = (var7 | var8) - (var7 & var8);
            var7 = var781;
            var781 = (var7 ^ var8) + 2 * (var7 & var8);
            var833 = (int)3527435777908589182L;
            var8 = -333432041;
            var7 = var833;
            var833 = (var7 | var8) & ~(var7 & var8);
            var8 = 663473037;
            var7 = var833;
            var833 = (var7 | var8) - (var7 & var8);
            int var897 = (int)6131734769767189049L;
            var8 = -1216875316;
            var7 = var897;
            var897 = var7 + var8 - 2 * (var7 & var8);
            var8 = -167982029;
            var7 = var897;
            var8 = var7 + var8 - 2 * (var7 & var8);
            var7 = var833;
            var833 = 2 * (var7 | var8) - (var7 ^ var8);
            var897 = (int)5018381633099659604L;
            var8 = 1493122313;
            var7 = var897;
            var897 = var7 & ~var8 | ~var7 & var8;
            var8 = 2119474332;
            var7 = var897;
            var897 = (var7 | var8) - (var7 & var8);
            int var984 = (int)2660400047748630871L;
            var8 = -1540414005;
            var7 = var984;
            var984 = (var7 | var8) - (var7 & var8);
            var8 = 230574523;
            var7 = var984;
            var8 = (var7 | var8) & (~var7 | ~var8);
            var7 = var897;
            var897 = (var7 ^ var8) + 2 * (var7 & var8);
            var897 = (int)-226293234101989898L;
            var8 = 1489104931;
            var7 = var897;
            var897 = (var7 | var8) & ~(var7 & var8);
            var8 = -1328027716;
            var7 = var897;
            var897 = var7 + var8 - 2 * (var7 & var8);
            var984 = (int)2980447882952434012L;
            var8 = 1224327961;
            var7 = var984;
            var984 = var7 & ~var8 | ~var7 & var8;
            var8 = 1267385777;
            var7 = var984;
            var984 = (var7 | var8) & (~var7 | ~var8);
            var8 = 1564509246;
            var7 = -18446309;
            var984 = (var7 | var8) - (var7 & var8);
            var8 = 1131072507;
            var7 = var984;
            var984 = (var7 | var8) - (var7 & var8);
            int var1057 = (int)-6437677082014545846L;
            var8 = 1867031656;
            var7 = var1057;
            var1057 = (var7 | var8) & (~var7 | ~var8);
            var8 = 1538853155;
            var7 = var1057;
            var1057 = var7 + var8 - 2 * (var7 & var8);
            int var1127 = (int)1711140161831147461L;
            var8 = 1643112301;
            var7 = var1127;
            var1127 = (var7 | var8) & ~(var7 & var8);
            var8 = 1352120511;
            var7 = var1127;
            var8 = var7 & ~var8 | ~var7 & var8;
            var7 = var1057;
            var1057 = (var7 | var8) + (var7 & var8);
            var8 = 842899143;
            var7 = -679302409;
            var1057 = var7 & ~var8 | ~var7 & var8;
            var8 = -265233381;
            var7 = var1057;
            var1057 = (var7 | var8) & (~var7 | ~var8);
            var8 = -424490789;
            var7 = 2070324599;
            var1127 = (var7 | var8) & (~var7 | ~var8);
            var8 = -1725415368;
            var7 = var1127;
            var1127 = var7 & ~var8 | ~var7 & var8;
            var1127 = (int)881351300614256848L;
            var8 = -98985612;
            var7 = var1127;
            var1127 = (var7 | var8) - (var7 & var8);
            var8 = 1634155134;
            var7 = var1127;
            if (var2.equals(
               a("䮙쨤䮋쩡䮛쨲䯒쨳䮗쨰䮇쨨䮀쨤䮖", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩講㑾aꟲꒅꁰꤋ絳蹆", var897, var984, var1057, (var7 | var8) - (var7 & var8))
            )) {
               var10000 = (int)4723776503624466206L;
               var8 = 1412908576;
               var7 = var10000;
               var10000 = var7 & ~var8 | ~var7 & var8;
               var8 = -2065155779;
               var7 = var10000;
               var3 = var7 + var8 - 2 * (var7 & var8);
            }
            break;
         case -532953636:
            int var771 = (int)-3533530676977407611L;
            var8 = 364393299;
            var7 = var771;
            var771 = (var7 | var8) - (var7 & var8);
            var8 = 1177890521;
            var7 = var771;
            var771 = var7 + var8 - 2 * (var7 & var8);
            var8 = -1507806819;
            var7 = -781514913;
            int var829 = (var7 | var8) - (var7 & var8);
            var8 = 2006300284;
            var7 = var829;
            var8 = var7 & ~var8 | ~var7 & var8;
            var7 = var771;
            var771 = (var7 & ~var8) + (var8 & ~var7) + 2 * (var7 & var8);
            var829 = (int)765505211788035495L;
            var8 = 553499358;
            var7 = var829;
            var829 = var7 + var8 - 2 * (var7 & var8);
            var8 = -472014275;
            var7 = var829;
            var829 = (var7 + var8 - 2 * (var7 & var8)) * (var7 + var8 - 2 * (var7 & var8));
            String var894 = "st";
            var8 = 1164701517;
            var7 = -131542632;
            int var895 = (var7 | var8) - (var7 & var8);
            var8 = -216800068;
            var7 = var895;
            int var896 = (var7 | var8) & ~(var7 & var8);
            int var978 = (int)-2994501588808626188L;
            var8 = -895910496;
            var7 = var978;
            var978 = (var7 | var8) & (~var7 | ~var8);
            var8 = 1184308243;
            var7 = var978;
            var978 = (var7 | var8) - (var7 & var8);
            var8 = 641021731;
            var7 = -686011693;
            int var1053 = var7 + var8 - 2 * (var7 & var8);
            var8 = 403580891;
            var7 = var1053;
            var8 = (var7 | var8) & (~var7 | ~var8);
            var7 = var978;
            var978 = (var7 & ~var8) + (var8 & ~var7) + 2 * (var7 & var8);
            var8 = 1659985191;
            var7 = -1402848718;
            var978 = var7 + var8 - 2 * (var7 & var8);
            var8 = 777595355;
            var7 = var978;
            var978 = (var7 | var8) & (~var7 | ~var8);
            String var1054 = "su";
            var8 = -1663414577;
            var7 = 1973807278;
            var1053 = (var7 | var8) & ~(var7 & var8);
            var8 = -30913859;
            var7 = var1053;
            var1053 = (var7 | var8) - (var7 & var8);
            var8 = 2127179979;
            var7 = -1488141336;
            int var1123 = (var7 | var8) & (~var7 | ~var8);
            var8 = -1965923606;
            var7 = var1123;
            var1123 = ((var7 | var8) & ~(var7 & var8)) * ((var7 | var8) & ~(var7 & var8));
            var1123 = (int)6578527043706376359L;
            var8 = -2084417742;
            var7 = var1123;
            var1123 = var7 + var8 - 2 * (var7 & var8);
            var8 = 1654848863;
            var7 = var1123;
            if (!var2.equals(
               a("䮼猾䮆獱䮑猾䮜猿䮗猲䮆猴䮖", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩講㑾aꟲꒅꁰꤋ絳蹆", var896, var978, var1053, var7 + var8 - 2 * (var7 & var8))
            )) {
               var771 = (int)899909107511738881L;
               var8 = -918548957;
               var7 = var771;
               var771 = (var7 | var8) & ~(var7 & var8);
               var8 = 1914719271;
               var7 = var771;
               var771 = (var7 | var8) - (var7 & var8);
               var8 = 1219439632;
               var7 = -1658148059;
               var771 = (var7 | var8) - (var7 & var8);
               var8 = -712669383;
               var7 = var771;
               var771 = var7 & ~var8 | ~var7 & var8;
               var8 = -543698813;
               var7 = 71044511;
               var10000 = var7 + var8 - 2 * (var7 & var8);
               var8 = -607569686;
               var7 = var10000;
               int var6 = (var7 | var8) & (~var7 | ~var8);
               a = var6;
               String var747 = "sv";
               var10000 = (int)-5564709500691116813L;
               var8 = 107927094;
               var7 = var10000;
               var10000 = var7 + var8 - 2 * (var7 & var8);
               var8 = 869334002;
               var7 = var10000;
               if (((var7 | var8) & ~(var7 & var8)) < a) {
                  var8 = 85559828;
                  var7 = 1423323533;
                  var10000 = (var7 | var8) & ~(var7 & var8);
                  var8 = 1999730809;
                  var7 = var10000;
                  var10000 = (var7 | var8) - (var7 & var8);
                  var8 = 1498048891;
                  var7 = 1046873830;
                  var771 = var7 + var8 - 2 * (var7 & var8);
                  var8 = -1798520603;
                  var7 = var771;
                  var8 = var7 + var8 - 2 * (var7 & var8);
                  var7 = var10000;
                  var10000 = var7 - ~var8 - 1;
                  var10000 = (int)-2201330651249813042L;
                  var8 = -1254276923;
                  var7 = var10000;
                  var10000 = (var7 | var8) - (var7 & var8);
                  var8 = -541360456;
                  var7 = var10000;
                  var6 = (var7 | var8) & (~var7 | ~var8);
                  a = var6;
               }
            } else {
               var8 = 348157685;
               var7 = -751853307;
               var10000 = var7 & ~var8 | ~var7 & var8;
               var8 = -940582923;
               var7 = var10000;
               var3 = (var7 | var8) - (var7 & var8);
            }
            break;
         case 1583442217:
            int var823 = (int)-4365725992085582434L;
            var8 = -101333738;
            var7 = var823;
            var823 = (var7 | var8) & (~var7 | ~var8);
            var8 = -956741491;
            var7 = var823;
            var823 = var7 + var8 - 2 * (var7 & var8);
            var8 = -287846937;
            var7 = 553403788;
            var823 = (var7 | var8) & ~(var7 & var8);
            var8 = -715934925;
            var7 = var823;
            var823 = var7 + var8 - 2 * (var7 & var8);
            var8 = -1143060608;
            var7 = -433858073;
            int var890 = var7 & ~var8 | ~var7 & var8;
            var8 = 2063101974;
            var7 = var890;
            var8 = var7 + var8 - 2 * (var7 & var8);
            var7 = var823;
            var823 = var7 - ~var8 - 1;
            int var969 = (int)2817213400610394923L;
            var8 = 1577389567;
            var7 = var969;
            var969 = (var7 | var8) & ~(var7 & var8);
            var8 = 31416025;
            var7 = var969;
            var969 = var7 + var8 - 2 * (var7 & var8);
            var8 = 1209331859;
            var7 = 789406527;
            var969 = var7 + var8 - 2 * (var7 & var8);
            var8 = 1729729468;
            var7 = var969;
            var969 = (var7 | var8) & (~var7 | ~var8);
            var890 = (int)1612623351251343978L;
            var8 = -1566481456;
            var7 = var890;
            var890 = (var7 | var8) & ~(var7 & var8);
            var8 = 992453587;
            var7 = var890;
            var890 = (var7 | var8) & ~(var7 & var8);
            String var974 = "sr";
            var969 = (int)1822661394156146210L;
            var8 = 1203571140;
            var7 = var969;
            var969 = var7 + var8 - 2 * (var7 & var8);
            var8 = 926535990;
            var7 = var969;
            var969 = (var7 | var8) & (~var7 | ~var8);
            int var1048 = (int)9065758001932492032L;
            var8 = 111658415;
            var7 = var1048;
            var1048 = var7 & ~var8 | ~var7 & var8;
            var8 = -1297536520;
            var7 = var1048;
            var1048 = (var7 | var8) & ~(var7 & var8);
            var8 = 462322908;
            var7 = 1586096647;
            var1048 = (var7 | var8) - (var7 & var8);
            var8 = 1708985783;
            var7 = var1048;
            var1048 = (var7 | var8) & (~var7 | ~var8);
            int var1118 = (int)-6047536337140690082L;
            var8 = 1104914387;
            var7 = var1118;
            var1118 = var7 + var8 - 2 * (var7 & var8);
            var8 = -1807745928;
            var7 = var1118;
            var1118 = (var7 | var8) - (var7 & var8);
            var1118 = (int)4310232616022748183L;
            var8 = -666326709;
            var7 = var1118;
            var1118 = (var7 | var8) & (~var7 | ~var8);
            var8 = -1859801200;
            var7 = var1118;
            if (var2.equals(
               a("䮹㬒䮫㬈䮷㬏䮺㬖䮧㬄䮦㬒䮶", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩講㑾aꟲꒅꁰꤋ絳蹆", var890, var969, var1048, var7 + var8 - 2 * (var7 & var8))
            )) {
               var10000 = (int)1912922936529987579L;
               var8 = -1971831488;
               var7 = var10000;
               var10000 = (var7 | var8) & ~(var7 & var8);
               var8 = 417929913;
               var7 = var10000;
               var3 = (var7 | var8) & (~var7 | ~var8);
            }
            break;
         case 1810386181:
            String var10001 = "sp";
            String var10002 = "sq";
            var8 = 1447075746;
            var7 = 1432243150;
            int var10004 = (var7 | var8) & (~var7 | ~var8);
            var8 = 52352110;
            var7 = var10004;
            var10004 = (var7 | var8) & (~var7 | ~var8);
            var10004 = (int)-1605283092158829018L;
            var8 = 771944280;
            var7 = var10004;
            var10004 = var7 & ~var8 | ~var7 & var8;
            var8 = 1240220021;
            var7 = var10004;
            var10004 = var7 + var8 - 2 * (var7 & var8);
            int var10003 = (int)-9069437639194560525L;
            var8 = -34050081;
            var7 = var10003;
            var10003 = (var7 | var8) - (var7 & var8);
            var8 = 1357414981;
            var7 = var10003;
            var10003 = var7 & ~var8 | ~var7 & var8;
            var8 = -218824609;
            var7 = -361561730;
            var10004 = (var7 | var8) & ~(var7 & var8);
            var8 = 554427742;
            var7 = var10004;
            var10004 = ((var7 | var8) - (var7 & var8)) * ((var7 | var8) - (var7 & var8));
            var8 = 151914598;
            var7 = -1695583321;
            var10004 = var7 + var8 - 2 * (var7 & var8);
            var8 = 1930417525;
            var7 = var10004;
            var10004 = (var7 | var8) & ~(var7 & var8);
            var8 = -263627867;
            var7 = 1597401608;
            int var10005 = var7 & ~var8 | ~var7 & var8;
            var8 = 1525994879;
            var7 = var10005;
            var10005 = (var7 | var8) & ~(var7 & var8);
            var8 = 1892828550;
            var7 = -1274761968;
            int var10006 = (var7 | var8) - (var7 & var8);
            var8 = 129072890;
            var7 = var10006;
            var8 = (var7 | var8) & (~var7 | ~var8);
            var7 = var10005;
            var10005 = 2 * (var7 | var8) - (var7 ^ var8);
            var10005 = (int)-1094012480169063056L;
            var8 = -1540122843;
            var7 = var10005;
            var10005 = var7 + var8 - 2 * (var7 & var8);
            var8 = -1126846525;
            var7 = var10005;
            var10005 = (var7 | var8) & (~var7 | ~var8);
            var8 = -692173050;
            var7 = 562943332;
            var10006 = var7 & ~var8 | ~var7 & var8;
            var8 = 861052230;
            var7 = var10006;
            var10006 = ((var7 | var8) & ~(var7 & var8)) * ((var7 | var8) & ~(var7 & var8));
            var10006 = (int)-5360643869753361053L;
            var8 = 892171983;
            var7 = var10006;
            var10006 = (var7 | var8) & ~(var7 & var8);
            var8 = 1390709020;
            var7 = var10006;
            if (var2.equals(
               a("䮹퍮䮫퍴䮷퍳䮢퍢䮠퍮䮶", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩講㑾aꟲꒅꁰꤋ絳蹆", var10003, var10004, var10005, (var7 | var8) & ~(var7 & var8))
            )) {
               var8 = -313102575;
               var7 = 1252157868;
               var10000 = (var7 | var8) - (var7 & var8);
               var8 = -1477179716;
               var7 = var10000;
               var3 = var7 + var8 - 2 * (var7 & var8);
            }
      }

      switch (var3) {
         case 0:
            var8 = -1380178643;
            var7 = -1149274914;
            int var817 = (var7 | var8) & ~(var7 & var8);
            var8 = 381899255;
            var7 = var817;
            var817 = (var7 | var8) - (var7 & var8);
            var8 = -998184377;
            var7 = -1509600920;
            var817 = var7 + var8 - 2 * (var7 & var8);
            var8 = -1856896106;
            var7 = var817;
            var817 = (var7 | var8) - (var7 & var8);
            var8 = 705036068;
            var7 = 1116648825;
            int var875 = var7 + var8 - 2 * (var7 & var8);
            var8 = 415577682;
            var7 = var875;
            var8 = (var7 | var8) - (var7 & var8);
            var7 = var817;
            var817 = var7 - ~var8 - 1;
            var8 = -1338706862;
            var7 = 1299782079;
            var875 = (var7 | var8) - (var7 & var8);
            var8 = -178197640;
            var7 = var875;
            var875 = var7 & ~var8 | ~var7 & var8;
            int var951 = (int)1200479653868408513L;
            var8 = -1124811281;
            var7 = var951;
            var951 = (var7 | var8) & (~var7 | ~var8);
            var8 = -815908470;
            var7 = var951;
            var8 = var7 & ~var8 | ~var7 & var8;
            var7 = var875;
            var875 = 2 * (var7 | var8) - (var7 ^ var8);
            var875 = (int)-639891305013460121L;
            var8 = 1013842248;
            var7 = var875;
            var875 = (var7 | var8) & ~(var7 & var8);
            var8 = -403630010;
            var7 = var875;
            var875 = (var7 | var8) & ~(var7 & var8);
            String var953 = "sw";
            var951 = (int)3995870138743193577L;
            var8 = -1218184226;
            var7 = var951;
            var951 = var7 & ~var8 | ~var7 & var8;
            var8 = 198415172;
            var7 = var951;
            var951 = (var7 | var8) - (var7 & var8);
            String var1034 = "sx";
            var8 = -190832848;
            var7 = -704878336;
            int var1035 = (var7 | var8) & (~var7 | ~var8);
            var8 = 703026310;
            var7 = var1035;
            int var1036 = (var7 | var8) - (var7 & var8);
            int var1155 = (int)-3350246949306011288L;
            var8 = -1209695235;
            var7 = var1155;
            var1155 = var7 + var8 - 2 * (var7 & var8);
            var8 = -752684397;
            var7 = var1155;
            var1155 = (var7 | var8) & ~(var7 & var8);
            var1155 = (int)-5019098769647622298L;
            var8 = -514726288;
            var7 = var1155;
            var1155 = var7 + var8 - 2 * (var7 & var8);
            var8 = 131875099;
            var7 = var1155;
            var1155 = var7 + var8 - 2 * (var7 & var8);
            var8 = -1306862725;
            var7 = 773133908;
            var1155 = (var7 | var8) & (~var7 | ~var8);
            var8 = -1676686020;
            var7 = var1155;
            var1155 = (var7 | var8) & ~(var7 & var8);
            var8 = 905155431;
            var7 = -960631908;
            int var1109 = (var7 | var8) & (~var7 | ~var8);
            var8 = -212053100;
            var7 = var1109;
            return a(
               "俨뻏侼뺳䯒뻉俇뫔俏뻄俋뻀俇뻉䯜뫔俭뺴俌뻆俇뺴侾뺶俇뫔俍뺴係뻆俊뻏侾뻉俌뺵侰뺸䯒뻆俀뻊俆뻄䯜",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩講㑾aꟲꒅꁰꤋ絳蹆",
               var875,
               var951,
               var1036,
               (var7 | var8) - (var7 & var8)
            );
         case 1:
            int var809 = (int)6068319967723898453L;
            var8 = 769113776;
            var7 = var809;
            var809 = (var7 | var8) - (var7 & var8);
            var8 = -700417803;
            var7 = var809;
            var809 = var7 + var8 - 2 * (var7 & var8);
            var8 = 287822502;
            var7 = 864528477;
            var809 = var7 + var8 - 2 * (var7 & var8);
            var8 = 580942578;
            var7 = var809;
            var809 = (var7 | var8) & (~var7 | ~var8);
            var8 = -179192572;
            var7 = 1007485916;
            var809 = (var7 | var8) & ~(var7 & var8);
            var8 = -916668709;
            var7 = var809;
            var809 = (var7 | var8) & (~var7 | ~var8);
            String var816 = "sy";
            int var869 = (int)-4619860106558894088L;
            var8 = -1203516033;
            var7 = var869;
            var869 = var7 & ~var8 | ~var7 & var8;
            var8 = -1281385368;
            var7 = var869;
            var869 = ((var7 | var8) & ~(var7 & var8)) * ((var7 | var8) & ~(var7 & var8));
            var869 = (int)-1540076663053638794L;
            var8 = 1073449131;
            var7 = var869;
            var869 = var7 + var8 - 2 * (var7 & var8);
            var8 = 846918068;
            var7 = var869;
            var869 = (var7 | var8) & ~(var7 & var8);
            String var947 = "sz";
            int var948 = (int)4173491355665238394L;
            var8 = -1477375176;
            var7 = var948;
            int var949 = (var7 | var8) & ~(var7 & var8);
            var8 = -658965199;
            var7 = var949;
            int var950 = (var7 | var8) - (var7 & var8);
            int var1029 = (int)6413400485687655104L;
            var8 = 1060206087;
            var7 = var1029;
            var1029 = var7 & ~var8 | ~var7 & var8;
            var8 = 845572231;
            var7 = var1029;
            var1029 = (var7 | var8) & ~(var7 & var8);
            var8 = 327776904;
            var7 = 1573904224;
            var1029 = (var7 | var8) - (var7 & var8);
            var8 = 1276804588;
            var7 = var1029;
            var1029 = (var7 | var8) & ~(var7 & var8);
            int var1104 = (int)7367187319826509527L;
            var8 = -349590615;
            var7 = var1104;
            var1104 = (var7 | var8) & ~(var7 & var8);
            var8 = -1886276916;
            var7 = var1104;
            var1104 = (var7 | var8) & ~(var7 & var8);
            var8 = 1301823152;
            var7 = -300045702;
            int var1154 = (var7 | var8) & (~var7 | ~var8);
            var8 = 1620291488;
            var7 = var1154;
            var8 = (var7 | var8) - (var7 & var8);
            var7 = var1104;
            var1104 = 2 * (var7 | var8) - (var7 ^ var8);
            var8 = -276420176;
            var7 = -1000532433;
            var1104 = (var7 | var8) - (var7 & var8);
            var8 = 737914096;
            var7 = var1104;
            return a(
               "俓ڴ俌ێ䯒ۀ俇ۍ侳ڶ俀ی侽˔俈ۏ侼ڳ係˔俊ڵ侰ڥ俈˚",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩講㑾aꟲꒅꁰꤋ絳蹆",
               var869,
               var950,
               var1029,
               (var7 | var8) - (var7 & var8)
            );
         case 2:
            String var769 = "ta";
            var8 = -1337724103;
            var7 = 13313524;
            int var806 = (var7 | var8) & (~var7 | ~var8);
            var8 = -1784786895;
            var7 = var806;
            var806 = var7 & ~var8 | ~var7 & var8;
            var8 = 378882477;
            var7 = 2053749446;
            int var866 = (var7 | var8) & ~(var7 & var8);
            var8 = 516412251;
            var7 = var866;
            var8 = (var7 | var8) & (~var7 | ~var8);
            var7 = var806;
            var806 = (var7 & ~var8) + (var8 & ~var7) + 2 * (var7 & var8);
            int var938 = (int)4963339094474584194L;
            var8 = -885548642;
            var7 = var938;
            var938 = (var7 | var8) & ~(var7 & var8);
            var8 = -1027544814;
            var7 = var938;
            var938 = var7 & ~var8 | ~var7 & var8;
            var8 = 1881239753;
            var7 = 863902788;
            var866 = var7 & ~var8 | ~var7 & var8;
            var8 = 219133668;
            var7 = var866;
            var866 = (var7 | var8) & (~var7 | ~var8);
            var8 = -839962042;
            var7 = 547635080;
            var938 = var7 + var8 - 2 * (var7 & var8);
            var8 = 2127422359;
            var7 = var938;
            var938 = (var7 | var8) & ~(var7 & var8);
            var8 = 1430693478;
            var7 = 279970405;
            int var1023 = var7 + var8 - 2 * (var7 & var8);
            var8 = 1180600370;
            var7 = var1023;
            var8 = var7 & ~var8 | ~var7 & var8;
            var7 = var938;
            var938 = var7 - ~var8 - 1;
            var938 = (int)5912488997556692616L;
            var8 = 1917775910;
            var7 = var938;
            var938 = var7 & ~var8 | ~var7 & var8;
            var8 = 2001787803;
            var7 = var938;
            var938 = (var7 | var8) & (~var7 | ~var8);
            var8 = -2075056805;
            var7 = 612124924;
            var1023 = (var7 | var8) & ~(var7 & var8);
            var8 = 1419877331;
            var7 = var1023;
            var1023 = (var7 | var8) & ~(var7 & var8);
            var1023 = (int)-3033177474098576024L;
            var8 = 1252079973;
            var7 = var1023;
            var1023 = (var7 | var8) - (var7 & var8);
            var8 = 949115080;
            var7 = var1023;
            var1023 = (var7 | var8) - (var7 & var8);
            int var1099 = (int)-7351950592125489882L;
            var8 = 562373939;
            var7 = var1099;
            var1099 = var7 & ~var8 | ~var7 & var8;
            var8 = 1800516700;
            var7 = var1099;
            var1099 = var7 + var8 - 2 * (var7 & var8);
            var1099 = (int)-565152312941753472L;
            var8 = 1390256933;
            var7 = var1099;
            var1099 = var7 + var8 - 2 * (var7 & var8);
            var8 = 1709001108;
            var7 = var1099;
            return a(
               "俨뒑侼듭䯒듩俄뒟䯒뒒侳뒕俌뒑侾뒝俌뒘係뒗䯒뒖係뒐侳뒒俎뒚俉듦俏뒔俇낊俈뒔俉뒒侵뒟侳듨俀뒔䯒듪係뒝䯜",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩講㑾aꟲꒅꁰꤋ絳蹆",
               var866,
               var938,
               var1023,
               (var7 | var8) - (var7 & var8)
            );
         case 3:
            var10000 = (int)-5734955474807921528L;
            var8 = -425781713;
            var7 = var10000;
            var10000 = (var7 | var8) & ~(var7 & var8);
            var8 = 226482200;
            var7 = var10000;
            var10000 = var7 & ~var8 | ~var7 & var8;
            int var800 = (int)-4689310926382303217L;
            var8 = 707632321;
            var7 = var800;
            var800 = var7 + var8 - 2 * (var7 & var8);
            var8 = 176105816;
            var7 = var800;
            var8 = (var7 | var8) & ~(var7 & var8);
            var7 = var10000;
            var10000 = (var7 & ~var8) + (var8 & ~var7) + 2 * (var7 & var8);
            var800 = (int)362814865683869839L;
            var8 = -479606216;
            var7 = var800;
            var800 = var7 & ~var8 | ~var7 & var8;
            var8 = -1843514943;
            var7 = var800;
            var800 = var7 & ~var8 | ~var7 & var8;
            var8 = -1160952794;
            var7 = -302094313;
            int var863 = (var7 | var8) & (~var7 | ~var8);
            var8 = 1990609651;
            var7 = var863;
            var8 = var7 & ~var8 | ~var7 & var8;
            var7 = var800;
            var800 = 2 * (var7 | var8) - (var7 ^ var8);
            var8 = 1232124043;
            var7 = -1674554302;
            int var931 = var7 & ~var8 | ~var7 & var8;
            var8 = -717165373;
            var7 = var931;
            var931 = var7 & ~var8 | ~var7 & var8;
            var8 = 1024624363;
            var7 = -358977764;
            var863 = (var7 | var8) & (~var7 | ~var8);
            var8 = -1713884258;
            var7 = var863;
            var863 = var7 & ~var8 | ~var7 & var8;
            var931 = (int)6357459285422107657L;
            var8 = -1973966712;
            var7 = var931;
            var931 = var7 + var8 - 2 * (var7 & var8);
            var8 = -1864497113;
            var7 = var931;
            var931 = (var7 & ~var8 | ~var7 & var8) * (var7 & ~var8 | ~var7 & var8);
            var8 = -129062765;
            var7 = -1401008655;
            var931 = (var7 | var8) - (var7 & var8);
            var8 = -1259484148;
            var7 = var931;
            var931 = (var7 | var8) - (var7 & var8);
            int var1089 = (int)1350639332439107253L;
            var8 = 122675123;
            var7 = var1089;
            var1089 = (var7 | var8) & ~(var7 & var8);
            var8 = 452720910;
            var7 = var1089;
            var1089 = var7 & ~var8 | ~var7 & var8;
            var8 = -1088842996;
            var7 = -550744617;
            var1089 = (var7 | var8) - (var7 & var8);
            var8 = 1614143186;
            var7 = var1089;
            var1089 = (var7 | var8) & (~var7 | ~var8);
            var1089 = (int)1022911764625160989L;
            var8 = 1672246885;
            var7 = var1089;
            var1089 = (var7 | var8) - (var7 & var8);
            var8 = -325022350;
            var7 = var1089;
            var1089 = var7 + var8 - 2 * (var7 & var8);
            var8 = 1271679378;
            var7 = 1078897275;
            int var1021 = (var7 | var8) & (~var7 | ~var8);
            var8 = 171760153;
            var7 = var1021;
            var1021 = (var7 | var8) & ~(var7 & var8);
            String var1097 = "tb";
            var8 = 1092736368;
            var7 = -214338420;
            var1089 = var7 + var8 - 2 * (var7 & var8);
            var8 = -1308222314;
            var7 = var1089;
            return a(
               "俠⣃俇⣅俊⢳俇ⳑ俈⣊侼⢶䯒⣅俉⢾䯒⣁俈⢳俊⣃係⢷俊⣉䯜",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩講㑾aꟲꒅꁰꤋ絳蹆",
               var863,
               var931,
               var1021,
               (var7 | var8) & (~var7 | ~var8)
            );
         case 4:
            var10000 = (int)-5774856238955589375L;
            var8 = 2135225124;
            var7 = var10000;
            var10000 = (var7 | var8) - (var7 & var8);
            var8 = 1238605124;
            var7 = var10000;
            var10000 = ((var7 | var8) & ~(var7 & var8)) * ((var7 | var8) & ~(var7 & var8));
            String var799 = "tc";
            String var859 = "td";
            int var860 = (int)5208586775060507933L;
            var8 = 651085864;
            var7 = var860;
            int var861 = (var7 | var8) & (~var7 | ~var8);
            var8 = 903446364;
            var7 = var861;
            int var862 = var7 & ~var8 | ~var7 & var8;
            var8 = 782996300;
            var7 = 59398509;
            int var1015 = var7 + var8 - 2 * (var7 & var8);
            var8 = 757189161;
            var7 = var1015;
            var1015 = var7 + var8 - 2 * (var7 & var8);
            int var928 = (int)2679532758767337788L;
            var8 = -1473478378;
            var7 = var928;
            var928 = var7 & ~var8 | ~var7 & var8;
            var8 = -1567545404;
            var7 = var928;
            var928 = var7 + var8 - 2 * (var7 & var8);
            String var1017 = "te";
            var1015 = (int)-2974786967665320721L;
            var8 = 545530605;
            var7 = var1015;
            var1015 = (var7 | var8) & (~var7 | ~var8);
            var8 = -1162418793;
            var7 = var1015;
            var1015 = (var7 | var8) - (var7 & var8);
            int var1085 = (int)-9205473699001063646L;
            var8 = 2034795828;
            var7 = var1085;
            var1085 = (var7 | var8) & (~var7 | ~var8);
            var8 = 2099634926;
            var7 = var1085;
            var1085 = (var7 | var8) & ~(var7 & var8);
            var8 = 2085168570;
            var7 = 1692876681;
            var1085 = var7 + var8 - 2 * (var7 & var8);
            var8 = 411804121;
            var7 = var1085;
            return a(
               "俠⹌侱⸳侲⹄俏⹌侽⸾䯒⹏侺⹉促⹋係⩑侳⹄侲⹃俇⸱係⩟䯒\u2e6e俌⹎侲⹏促⸲俋⸳俇⩑俍⹏俅⹇俇⩟",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩講㑾aꟲꒅꁰꤋ絳蹆",
               var862,
               var928,
               var1015,
               (var7 | var8) & ~(var7 & var8)
            );
         case 5:
            var8 = 288431348;
            var7 = 1430725461;
            int var787 = (var7 | var8) & ~(var7 & var8);
            var8 = 1148600240;
            var7 = var787;
            var787 = (var7 | var8) & (~var7 | ~var8);
            var787 = (int)861766827215334956L;
            var8 = -1450410754;
            var7 = var787;
            var787 = var7 & ~var8 | ~var7 & var8;
            var8 = -1494297902;
            var7 = var787;
            var787 = var7 + var8 - 2 * (var7 & var8);
            var787 = (int)-5861416109921579201L;
            var8 = 292798041;
            var7 = var787;
            var787 = var7 + var8 - 2 * (var7 & var8);
            var8 = 1982656870;
            var7 = var787;
            var787 = var7 & ~var8 | ~var7 & var8;
            var8 = 982719859;
            var7 = 41096469;
            var787 = var7 & ~var8 | ~var7 & var8;
            var8 = 954206305;
            var7 = var787;
            var787 = var7 & ~var8 | ~var7 & var8;
            var8 = -1878322949;
            var7 = 584374372;
            var787 = (var7 | var8) & ~(var7 & var8);
            var8 = 891461372;
            var7 = var787;
            var787 = var7 + var8 - 2 * (var7 & var8);
            int var853 = (int)5607525186774241081L;
            var8 = 1399911767;
            var7 = var853;
            var853 = var7 & ~var8 | ~var7 & var8;
            var8 = 770818762;
            var7 = var853;
            var853 = ((var7 | var8) - (var7 & var8)) * ((var7 | var8) - (var7 & var8));
            var853 = (int)3857845217975125340L;
            var8 = -962889914;
            var7 = var853;
            var853 = (var7 | var8) - (var7 & var8);
            var8 = -1089247117;
            var7 = var853;
            var853 = var7 + var8 - 2 * (var7 & var8);
            int var923 = (int)-5014804023254527692L;
            var8 = 1183398811;
            var7 = var923;
            var923 = (var7 | var8) - (var7 & var8);
            var8 = 1224855508;
            var7 = var923;
            var923 = (var7 | var8) - (var7 & var8);
            var8 = -1416939613;
            var7 = 566500108;
            var923 = (var7 | var8) & ~(var7 & var8);
            var8 = 1800361715;
            var7 = var923;
            var923 = (var7 | var8) & (~var7 | ~var8);
            var8 = 1866021425;
            var7 = 585975252;
            int var1010 = (var7 | var8) & (~var7 | ~var8);
            var8 = -14540576;
            var7 = var1010;
            var1010 = (var7 | var8) & (~var7 | ~var8);
            var1010 = (int)-5839398011659982449L;
            var8 = -801198562;
            var7 = var1010;
            var1010 = (var7 | var8) & ~(var7 & var8);
            var8 = -1346124272;
            var7 = var1010;
            var1010 = (var7 | var8) - (var7 & var8);
            var8 = -1811284364;
            var7 = -1713650807;
            int var1082 = var7 & ~var8 | ~var7 & var8;
            var8 = 1829836714;
            var7 = var1082;
            var1082 = (var7 | var8) & ~(var7 & var8);
            var8 = 57897479;
            var7 = 372010732;
            var1082 = (var7 | var8) & ~(var7 & var8);
            var8 = 354226867;
            var7 = var1082;
            return a(
               "俯鯶侰鿣俍鯽俆鯹俉鮍侵鯶俏鯻侽鿣俈鿣侳鯶侲鯱俇鮃侱鿭", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩講㑾aꟲꒅꁰꤋ絳蹆", var853, var923, var1010, var7 & ~var8 | ~var7 & var8
            );
         default:
            String var4 = var1;
            StringBuilder var761 = new StringBuilder();
            int var842 = (int)-5535837982494186226L;
            var8 = 41994714;
            var7 = var842;
            var842 = (var7 | var8) - (var7 & var8);
            var8 = 1574005969;
            var7 = var842;
            var842 = (var7 | var8) - (var7 & var8);
            var8 = 1614311509;
            var7 = -1058191944;
            var842 = (var7 | var8) & ~(var7 & var8);
            var8 = -1596639762;
            var7 = var842;
            var842 = (var7 | var8) - (var7 & var8);
            var842 = (int)-7837401725117912231L;
            var8 = -761024139;
            var7 = var842;
            var842 = var7 & ~var8 | ~var7 & var8;
            var8 = 385063463;
            var7 = var842;
            var842 = var7 + var8 - 2 * (var7 & var8);
            var842 = (int)-6358399300900522596L;
            var8 = -1949012450;
            var7 = var842;
            var842 = (var7 | var8) - (var7 & var8);
            var8 = 1404227887;
            var7 = var842;
            var842 = ((var7 | var8) & ~(var7 & var8)) * ((var7 | var8) & ~(var7 & var8));
            var8 = 1470320529;
            var7 = 1559492223;
            int var1003 = (var7 | var8) - (var7 & var8);
            var8 = 189839844;
            var7 = var1003;
            var1003 = (var7 | var8) & ~(var7 & var8);
            var1003 = (int)4502480431958519305L;
            var8 = -1133699316;
            var7 = var1003;
            var1003 = (var7 | var8) & ~(var7 & var8);
            var8 = -1083838188;
            var7 = var1003;
            var1003 = (var7 | var8) & ~(var7 & var8);
            int var920 = (int)-3447613593557285204L;
            var8 = -1987317817;
            var7 = var920;
            var920 = (var7 | var8) & ~(var7 & var8);
            var8 = 921629442;
            var7 = var920;
            var920 = (var7 | var8) & ~(var7 & var8);
            int var1070 = (int)-3112255722127659626L;
            var8 = -1146014853;
            var7 = var1070;
            var1070 = (var7 | var8) & ~(var7 & var8);
            var8 = -1143578909;
            var7 = var1070;
            var1070 = var7 + var8 - 2 * (var7 & var8);
            var1070 = (int)8183387632833963800L;
            var8 = -1471713883;
            var7 = var1070;
            var1070 = (var7 | var8) & ~(var7 & var8);
            var8 = 2049166005;
            var7 = var1070;
            var1070 = var7 & ~var8 | ~var7 & var8;
            var8 = -388291502;
            var7 = -1392778930;
            var1070 = (var7 | var8) & ~(var7 & var8);
            var8 = 1142998296;
            var7 = var1070;
            var1070 = (var7 | var8) - (var7 & var8);
            var8 = 1108627377;
            var7 = -1656719035;
            var1003 = (var7 | var8) - (var7 & var8);
            var8 = 1068318885;
            var7 = var1003;
            var1003 = var7 + var8 - 2 * (var7 & var8);
            String var1078 = "tf";
            var1070 = (int)7359943245469978908L;
            var8 = 1291145921;
            var7 = var1070;
            var1070 = (var7 | var8) & ~(var7 & var8);
            var8 = 1128374821;
            var7 = var1070;
            var1070 = var7 & ~var8 | ~var7 & var8;
            int var1149 = (int)7892441067594894487L;
            var8 = 826445125;
            var7 = var1149;
            var1149 = var7 & ~var8 | ~var7 & var8;
            var8 = -572456913;
            var7 = var1149;
            var1149 = (var7 + var8 - 2 * (var7 & var8)) * (var7 + var8 - 2 * (var7 & var8));
            var1149 = (int)2469376373070659355L;
            var8 = -1036955320;
            var7 = var1149;
            var1149 = (var7 | var8) - (var7 & var8);
            var8 = -1617681378;
            var7 = var1149;
            return var761.append(
                  a("俬龞俊鿧俈鿦䯒鿦俈龔俊鿤係龐俊鿮䯈鯶", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩講㑾aꟲꒅꁰꤋ絳蹆", var920, var1003, var1070, (var7 | var8) - (var7 & var8))
               )
               .append(var4)
               .toString();
      }
   }

   private String b(String var1) {
      if (var1 == null) {
         String var1164 = "tg";
         String var1230 = "th";
         int var1107 = -994342209;
         int var550 = -2035104212;
         int var1306 = (var550 | var1107) & (~var550 | ~var1107);
         var1107 = 1932442402;
         var550 = var1306;
         var1306 = var550 & ~var1107 | ~var550 & var1107;
         var1107 = 918213871;
         var550 = -398979069;
         int var1405 = (var550 | var1107) & (~var550 | ~var1107);
         var1107 = -1704121435;
         var550 = var1405;
         var1107 = var550 + var1107 - 2 * (var550 & var1107);
         var550 = var1306;
         var1306 = 2 * (var550 | var1107) - (var550 ^ var1107);
         var1306 = (int)-5228693818681142128L;
         var1107 = 665205531;
         var550 = var1306;
         var1306 = (var550 | var1107) & (~var550 | ~var1107);
         var1107 = -741591582;
         var550 = var1306;
         var1306 = (var550 | var1107) - (var550 & var1107);
         String var1406 = "ti";
         var1107 = -1014140902;
         var550 = -906541779;
         var1405 = var550 + var1107 - 2 * (var550 & var1107);
         var1107 = -467786826;
         var550 = var1405;
         var1405 = (var550 | var1107) - (var550 & var1107);
         var1107 = -1254749040;
         var550 = 788367908;
         int var1543 = var550 & ~var1107 | ~var550 & var1107;
         var1107 = 834020388;
         var550 = var1543;
         var1543 = (var550 | var1107) & ~(var550 & var1107);
         var1107 = 1874834066;
         var550 = 754307143;
         int var1685 = var550 & ~var1107 | ~var550 & var1107;
         var1107 = 759990550;
         var550 = var1685;
         var1107 = (var550 | var1107) - (var550 & var1107);
         var550 = var1543;
         var1543 = (var550 | var1107) + (var550 & var1107);
         var1543 = (int)4822341009013329111L;
         var1107 = 468378525;
         var550 = var1543;
         var1543 = (var550 | var1107) & ~(var550 & var1107);
         var1107 = 261654898;
         var550 = var1543;
         var1543 = (var550 | var1107) & (~var550 | ~var1107);
         String var1686 = "tj";
         var1685 = (int)328312690304008374L;
         var1107 = 1247179629;
         var550 = var1685;
         var1685 = (var550 | var1107) & (~var550 | ~var1107);
         var1107 = 1250703335;
         var550 = var1685;
         return a(
            "榨㟕榍㟗榇㟕槴㞢榈㟐槺㏀榋㞨榍㟑榏㟐",
            "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩講㑾aꟲꒅꁰꤋ絳蹆",
            var1306,
            var1405,
            var1543,
            (var550 | var1107) & ~(var550 & var1107)
         );
      }

      String var2 = var1;
      int var10000 = (int)5280882511375752117L;
      int var8 = 1783784275;
      int var7 = var10000;
      var10000 = (var7 | var8) - (var7 & var8);
      var8 = -1162721511;
      var7 = var10000;
      int var3 = (var7 | var8) & ~(var7 & var8);
      switch (var2.hashCode()) {
         case -2026653947:
            var8 = 379137832;
            var7 = -918480252;
            int var1188 = (var7 | var8) & (~var7 | ~var8);
            var8 = 1774159743;
            var7 = var1188;
            var1188 = (var7 & ~var8 | ~var7 & var8) * (var7 & ~var8 | ~var7 & var8);
            int var1259 = (int)-9075804254942106582L;
            var8 = -1232913301;
            var7 = var1259;
            var1259 = (var7 | var8) & (~var7 | ~var8);
            var8 = -1648530675;
            var7 = var1259;
            var1259 = ((var7 | var8) - (var7 & var8)) * ((var7 | var8) - (var7 & var8));
            int var1459 = (int)380554937942052147L;
            var8 = -1660620909;
            var7 = var1459;
            var1459 = (var7 | var8) - (var7 & var8);
            var8 = -1198890323;
            var7 = var1459;
            var1459 = var7 & ~var8 | ~var7 & var8;
            var8 = 2086792378;
            var7 = -98009803;
            var1459 = var7 + var8 - 2 * (var7 & var8);
            var8 = -2041998946;
            var7 = var1459;
            var1459 = (var7 | var8) & ~(var7 & var8);
            var1459 = (int)6978689092902763337L;
            var8 = 785836994;
            var7 = var1459;
            var1459 = var7 & ~var8 | ~var7 & var8;
            var8 = 1921667211;
            var7 = var1459;
            var1459 = (var7 | var8) & ~(var7 & var8);
            var8 = -1855635858;
            var7 = -1143728808;
            int var1356 = (var7 | var8) & (~var7 | ~var8);
            var8 = 1692528991;
            var7 = var1356;
            var1356 = var7 + var8 - 2 * (var7 & var8);
            var8 = -109705567;
            var7 = 854593649;
            int var1612 = var7 & ~var8 | ~var7 & var8;
            var8 = -880404776;
            var7 = var1612;
            var1612 = var7 + var8 - 2 * (var7 & var8);
            var1612 = (int)-608720387534273419L;
            var8 = -832074305;
            var7 = var1612;
            var1612 = (var7 | var8) - (var7 & var8);
            var8 = -1826829876;
            var7 = var1612;
            var1612 = (var7 | var8) & (~var7 | ~var8);
            var8 = 468044271;
            var7 = 1275720485;
            var1612 = var7 & ~var8 | ~var7 & var8;
            var8 = 1475099355;
            var7 = var1612;
            var1612 = (var7 | var8) - (var7 & var8);
            var1612 = (int)8054344919665256189L;
            var8 = -2044536905;
            var7 = var1612;
            var1612 = var7 & ~var8 | ~var7 & var8;
            var8 = 1564242252;
            var7 = var1612;
            var1612 = (var7 | var8) - (var7 & var8);
            var8 = -2007760837;
            var7 = -272522527;
            var1612 = var7 & ~var8 | ~var7 & var8;
            var8 = 1737859785;
            var7 = var1612;
            var1612 = var7 + var8 - 2 * (var7 & var8);
            var1459 = (int)5756318358443449787L;
            var8 = 1847630836;
            var7 = var1459;
            var1459 = var7 + var8 - 2 * (var7 & var8);
            var8 = -106855530;
            var7 = var1459;
            var1459 = var7 + var8 - 2 * (var7 & var8);
            var8 = -799719852;
            var7 = -1046851830;
            var1612 = var7 & ~var8 | ~var7 & var8;
            var8 = -2102501043;
            var7 = var1612;
            var1612 = ((var7 | var8) & ~(var7 & var8)) * ((var7 | var8) & ~(var7 & var8));
            var1612 = (int)2137272006360691189L;
            var8 = -1956996125;
            var7 = var1612;
            var1612 = (var7 | var8) & (~var7 | ~var8);
            var8 = 1949002230;
            var7 = var1612;
            var1612 = (var7 | var8) & (~var7 | ~var8);
            int var1734 = (int)-5503775654853905508L;
            var8 = -850565945;
            var7 = var1734;
            var1734 = var7 & ~var8 | ~var7 & var8;
            var8 = -1259862209;
            var7 = var1734;
            var1734 = ((var7 | var8) & ~(var7 & var8)) * ((var7 | var8) & ~(var7 & var8));
            var8 = -447273137;
            var7 = -1197916787;
            var1734 = var7 + var8 - 2 * (var7 & var8);
            var8 = 1576282454;
            var7 = var1734;
            if (var2.equals(
               a("淼萦淁萭淇萦淔萤涕萭淇萺淚萺", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩講㑾aꟲꒅꁰꤋ絳蹆", var1356, var1459, var1612, (var7 | var8) & ~(var7 & var8))
            )) {
               var8 = -141951856;
               var7 = 1801494902;
               var10000 = (var7 | var8) - (var7 & var8);
               var8 = -1662427677;
               var7 = var10000;
               var3 = (var7 | var8) & (~var7 | ~var8);
            }
            break;
         case -1926714738:
            String var1180 = "tk";
            var8 = -1091634199;
            var7 = 750986679;
            int var1344 = var7 + var8 - 2 * (var7 & var8);
            var8 = -1842487721;
            var7 = var1344;
            var1344 = (var7 | var8) & ~(var7 & var8);
            var1344 = (int)-6443906797026152240L;
            var8 = 185520846;
            var7 = var1344;
            var1344 = var7 + var8 - 2 * (var7 & var8);
            var8 = -964091361;
            var7 = var1344;
            var1344 = (var7 | var8) & ~(var7 & var8);
            var8 = -2088878848;
            var7 = 788472269;
            var1344 = (var7 | var8) - (var7 & var8);
            var8 = -1384047424;
            var7 = var1344;
            var1344 = (var7 | var8) - (var7 & var8);
            var8 = -761878609;
            var7 = -513971565;
            var1344 = (var7 | var8) & ~(var7 & var8);
            var8 = -255304710;
            var7 = var1344;
            var1344 = (var7 | var8) - (var7 & var8);
            var1344 = (int)7043810971969381291L;
            var8 = -804703633;
            var7 = var1344;
            var1344 = var7 + var8 - 2 * (var7 & var8);
            var8 = -10351699;
            var7 = var1344;
            var1344 = (var7 | var8) & ~(var7 & var8);
            var8 = -2136786290;
            var7 = 739775030;
            int var1604 = (var7 | var8) & (~var7 | ~var8);
            var8 = -1397020502;
            var7 = var1604;
            var1604 = (var7 | var8) & ~(var7 & var8);
            var8 = 988220810;
            var7 = 1158762732;
            int var1457 = (var7 | var8) - (var7 & var8);
            var8 = -1854421832;
            var7 = var1457;
            var1457 = (var7 | var8) - (var7 & var8);
            var8 = 67971069;
            var7 = 1419947691;
            var1604 = (var7 | var8) - (var7 & var8);
            var8 = 1268495058;
            var7 = var1604;
            var1604 = (var7 | var8) & ~(var7 & var8);
            int var1731 = (int)2390909059168061479L;
            var8 = -1376642714;
            var7 = var1731;
            var1731 = (var7 | var8) - (var7 & var8);
            var8 = 616398485;
            var7 = var1731;
            var8 = var7 + var8 - 2 * (var7 & var8);
            var7 = var1604;
            var1604 = (var7 | var8) + (var7 & var8);
            var1604 = (int)5348019228684506442L;
            var8 = -1463605343;
            var7 = var1604;
            var1604 = (var7 | var8) - (var7 & var8);
            var8 = -386331990;
            var7 = var1604;
            var1604 = var7 + var8 - 2 * (var7 & var8);
            var8 = 917154345;
            var7 = -1904203268;
            int var1782 = (var7 | var8) & ~(var7 & var8);
            var8 = -1205173282;
            var7 = var1782;
            var1782 = (var7 | var8) & (~var7 | ~var8);
            var8 = -318043924;
            var7 = -319639551;
            var1731 = var7 & ~var8 | ~var7 & var8;
            var8 = 31440756;
            var7 = var1731;
            if (var2.equals(
               a("淾뀀淬뀚淹뀌淸뀌淡뀚淧뀀淴뀆淽뀀深", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩講㑾aꟲꒅꁰꤋ絳蹆", var1344, var1457, var1604, var7 + var8 - 2 * (var7 & var8))
            )) {
               var8 = 1894649363;
               var7 = -161516651;
               var10000 = (var7 | var8) & (~var7 | ~var8);
               var8 = -2035188346;
               var7 = var10000;
               var3 = var7 + var8 - 2 * (var7 & var8);
               String var1140 = "tl";
               var10000 = (int)-4059898989190609502L;
               var8 = 1470269070;
               var7 = var10000;
               var10000 = (var7 | var8) - (var7 & var8);
               var8 = 2109792039;
               var7 = var10000;
               int var9 = (var7 | var8) & (~var7 | ~var8);
               a = var9;
               var8 = 1766813280;
               var7 = -169678384;
               int var1181 = (var7 | var8) & ~(var7 & var8);
               var8 = -1666349135;
               var7 = var1181;
               int var1182 = var7 & ~var8 | ~var7 & var8;
               int var1183 = (int)5203312450742473521L;
               var8 = 2012513538;
               var7 = var1183;
               int var1184 = (var7 | var8) - (var7 & var8);
               var8 = 2116802109;
               var7 = var1184;
               int var1185 = (var7 | var8) & (~var7 | ~var8);
               var8 = -1844834719;
               var7 = 318424636;
               int var1186 = var7 & ~var8 | ~var7 & var8;
               var8 = -2131703732;
               var7 = var1186;
               int var1187 = (var7 | var8) - (var7 & var8);
               var10000 = (int)2286915161427431801L;
               var8 = 1942807217;
               var7 = var10000;
               var10000 = (var7 | var8) & ~(var7 & var8);
               var8 = 1625198919;
               var7 = var10000;
               if (var7 + var8 - 2 * (var7 & var8) < a) {
                  var8 = 1091610920;
                  var7 = -412083961;
                  var10000 = (var7 | var8) & (~var7 | ~var8);
                  var8 = -260255687;
                  var7 = var10000;
                  var10000 = (var7 & ~var8 | ~var7 & var8) * (var7 & ~var8 | ~var7 & var8);
                  var10000 = (int)-210775408000315329L;
                  var8 = -823021432;
                  var7 = var10000;
                  var10000 = (var7 | var8) & ~(var7 & var8);
                  var8 = 717041266;
                  var7 = var10000;
                  var9 = (var7 | var8) & (~var7 | ~var8);
               }
            }
            break;
         case -1557786393:
            var8 = -1586632591;
            var7 = -1339831360;
            int var1177 = (var7 | var8) & ~(var7 & var8);
            var8 = 947258155;
            var7 = var1177;
            var1177 = (var7 | var8) - (var7 & var8);
            var8 = 309937692;
            var7 = 1969951065;
            int var1254 = (var7 | var8) & (~var7 | ~var8);
            var8 = 1190688242;
            var7 = var1254;
            var8 = var7 & ~var8 | ~var7 & var8;
            var7 = var1177;
            var1177 = (var7 ^ var8) + 2 * (var7 & var8);
            var1254 = (int)-2899459804655339274L;
            var8 = -532728303;
            var7 = var1254;
            var1254 = (var7 | var8) & (~var7 | ~var8);
            var8 = 1369740381;
            var7 = var1254;
            var1254 = (var7 | var8) - (var7 & var8);
            var8 = -832294063;
            var7 = 368952605;
            int var1339 = var7 + var8 - 2 * (var7 & var8);
            var8 = -973086990;
            var7 = var1339;
            var8 = (var7 | var8) & (~var7 | ~var8);
            var7 = var1254;
            var1254 = (var7 & ~var8) + (var8 & ~var7) + 2 * (var7 & var8);
            String var1340 = "tv";
            var1339 = (int)-5771850463071847767L;
            var8 = -900016172;
            var7 = var1339;
            var1339 = (var7 | var8) & ~(var7 & var8);
            var8 = 535279380;
            var7 = var1339;
            var1339 = var7 + var8 - 2 * (var7 & var8);
            int var1591 = (int)-7794195079484930518L;
            var8 = -1069337594;
            var7 = var1591;
            var1591 = var7 & ~var8 | ~var7 & var8;
            var8 = 561459745;
            var7 = var1591;
            var1591 = (var7 | var8) & ~(var7 & var8);
            var8 = -158320087;
            var7 = 2086823805;
            var1591 = (var7 | var8) & (~var7 | ~var8);
            var8 = -1963827887;
            var7 = var1591;
            var1591 = var7 + var8 - 2 * (var7 & var8);
            var8 = 1471566719;
            var7 = 985877630;
            var1591 = (var7 | var8) & ~(var7 & var8);
            var8 = 1836392204;
            var7 = var1591;
            var1591 = (var7 | var8) & ~(var7 & var8);
            var8 = 264811865;
            var7 = -898303533;
            int var1455 = (var7 | var8) & (~var7 | ~var8);
            var8 = 725550532;
            var7 = var1455;
            var1455 = (var7 | var8) & (~var7 | ~var8);
            var1591 = (int)-2708559078690380039L;
            var8 = -610286476;
            var7 = var1591;
            var1591 = (var7 | var8) & ~(var7 & var8);
            var8 = 50158367;
            var7 = var1591;
            var1591 = (var7 | var8) & (~var7 | ~var8);
            var1591 = (int)5399155877121729704L;
            var8 = 340199775;
            var7 = var1591;
            var1591 = var7 & ~var8 | ~var7 & var8;
            var8 = 479911333;
            var7 = var1591;
            var1591 = (var7 | var8) - (var7 & var8);
            String var1729 = "tw";
            var8 = 1435816131;
            var7 = 455693340;
            int var1730 = (var7 | var8) & (~var7 | ~var8);
            var8 = 1318728662;
            var7 = var1730;
            if (var2.equals(
               a("添º淁õ淜»淜¡淜´淙¼淏°淑", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩講㑾aꟲꒅꁰꤋ絳蹆", var1339, var1455, var1591, var7 + var8 - 2 * (var7 & var8))
            )) {
               var8 = -1633639422;
               var7 = -1367297682;
               var10000 = var7 + var8 - 2 * (var7 & var8);
               var8 = 807409003;
               var7 = var10000;
               var3 = var7 + var8 - 2 * (var7 & var8);
            }
            break;
         case -1038596745:
            int var1174 = (int)8359063489060622230L;
            var8 = -1874082296;
            var7 = var1174;
            var1174 = (var7 | var8) & (~var7 | ~var8);
            var8 = -404272525;
            var7 = var1174;
            var1174 = (var7 | var8) & ~(var7 & var8);
            String var1253 = "tm";
            int var1445 = (int)-3107992769702596488L;
            var8 = 1327012913;
            var7 = var1445;
            var1445 = (var7 | var8) & (~var7 | ~var8);
            var8 = -1166250940;
            var7 = var1445;
            var1445 = var7 + var8 - 2 * (var7 & var8);
            var8 = -2127169358;
            var7 = 1415691409;
            int var1337 = (var7 | var8) & ~(var7 & var8);
            var8 = -1694196150;
            var7 = var1337;
            var1337 = var7 & ~var8 | ~var7 & var8;
            var1445 = (int)-6958757962821128272L;
            var8 = 1350975100;
            var7 = var1445;
            var1445 = (var7 | var8) & (~var7 | ~var8);
            var8 = 1366172954;
            var7 = var1445;
            var1445 = (var7 | var8) - (var7 & var8);
            var8 = 795412431;
            var7 = -945438719;
            int var1586 = (var7 | var8) & ~(var7 & var8);
            var8 = 1515747104;
            var7 = var1586;
            var8 = var7 & ~var8 | ~var7 & var8;
            var7 = var1445;
            var1445 = (var7 & ~var8) + (var8 & ~var7) + 2 * (var7 & var8);
            var1445 = (int)5231143241284928703L;
            var8 = -1727795635;
            var7 = var1445;
            var1445 = (var7 | var8) & (~var7 | ~var8);
            var8 = -1634704076;
            var7 = var1445;
            var1445 = (var7 | var8) - (var7 & var8);
            var8 = 900063736;
            var7 = 2082772006;
            var1586 = var7 + var8 - 2 * (var7 & var8);
            var8 = 5402419;
            var7 = var1586;
            var1586 = var7 & ~var8 | ~var7 & var8;
            var8 = -1915195830;
            var7 = -1142313321;
            var1586 = var7 + var8 - 2 * (var7 & var8);
            var8 = 704509845;
            var7 = var1586;
            var1586 = (var7 | var8) - (var7 & var8);
            var8 = 1000041749;
            var7 = 1230912614;
            int var1726 = var7 + var8 - 2 * (var7 & var8);
            var8 = -1632455288;
            var7 = var1726;
            var1726 = ((var7 | var8) & (~var7 | ~var8)) * ((var7 | var8) & (~var7 | ~var8));
            var8 = 111385323;
            var7 = -292074408;
            var1726 = (var7 | var8) & ~(var7 & var8);
            var8 = -398726350;
            var7 = var1726;
            if (var2.equals(
               a("淾記淬訂淹訔淸訔淡訂淰訅淶記淰訙淰訙", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩講㑾aꟲꒅꁰꤋ絳蹆", var1337, var1445, var1586, (var7 | var8) - (var7 & var8))
            )) {
               var8 = 454619485;
               var7 = 207341325;
               var10000 = var7 + var8 - 2 * (var7 & var8);
               var8 = 390280785;
               var7 = var10000;
               var3 = var7 + var8 - 2 * (var7 & var8);
               if (b) {
                  String var1136 = "tn";
                  var8 = -765908338;
                  var7 = -618803594;
                  var10000 = (var7 | var8) - (var7 & var8);
                  var8 = 847369561;
                  var7 = var10000;
                  int var6 = var7 & ~var8 | ~var7 & var8;
               }
            }
            break;
         case -532953636:
            String var1173 = "ts";
            String var1252 = "tt";
            int var1436 = (int)-5743247364662898508L;
            var8 = -920235047;
            var7 = var1436;
            var1436 = (var7 | var8) & ~(var7 & var8);
            var8 = -1523088544;
            var7 = var1436;
            var1436 = (var7 | var8) & (~var7 | ~var8);
            var8 = -32190916;
            var7 = 1701373946;
            var1436 = (var7 | var8) & (~var7 | ~var8);
            var8 = -1686361663;
            var7 = var1436;
            var1436 = var7 & ~var8 | ~var7 & var8;
            int var1334 = (int)-4966590628148624079L;
            var8 = 1574818736;
            var7 = var1334;
            var1334 = var7 & ~var8 | ~var7 & var8;
            var8 = 1541917928;
            var7 = var1334;
            var1334 = (var7 | var8) & ~(var7 & var8);
            String var1441 = "tu";
            var1436 = (int)2679033040143626397L;
            var8 = -952638040;
            var7 = var1436;
            var1436 = (var7 | var8) - (var7 & var8);
            var8 = 840152695;
            var7 = var1436;
            var1436 = (var7 | var8) & (~var7 | ~var8);
            var8 = -880012138;
            var7 = -1023336567;
            int var1581 = var7 & ~var8 | ~var7 & var8;
            var8 = 1505668996;
            var7 = var1581;
            var1581 = (var7 | var8) & (~var7 | ~var8);
            var1581 = (int)-2968822619211118930L;
            var8 = 5167192;
            var7 = var1581;
            var1581 = var7 & ~var8 | ~var7 & var8;
            var8 = -1107832927;
            var7 = var1581;
            var1581 = var7 & ~var8 | ~var7 & var8;
            var8 = 1900799124;
            var7 = 194231798;
            int var1771 = var7 & ~var8 | ~var7 & var8;
            var8 = 2060999027;
            var7 = var1771;
            var1771 = var7 & ~var8 | ~var7 & var8;
            var1771 = (int)3884263764736724656L;
            var8 = 1133099552;
            var7 = var1771;
            var1771 = var7 + var8 - 2 * (var7 & var8);
            var8 = 881095826;
            var7 = var1771;
            var1771 = (var7 | var8) & ~(var7 & var8);
            var8 = 1223692051;
            var7 = 304594276;
            var1771 = var7 & ~var8 | ~var7 & var8;
            var8 = 1524085368;
            var7 = var1771;
            var1771 = (var7 | var8) & ~(var7 & var8);
            var8 = 340047748;
            var7 = -953385728;
            var1771 = (var7 | var8) - (var7 & var8);
            var8 = -748107116;
            var7 = var1771;
            var1771 = (var7 | var8) & ~(var7 & var8);
            var8 = 933279533;
            var7 = 1758447521;
            var1771 = var7 & ~var8 | ~var7 & var8;
            var8 = 1601138816;
            var7 = var1771;
            var1771 = (var7 | var8) & (~var7 | ~var8);
            var8 = -23548995;
            var7 = -127389190;
            int var1725 = (var7 | var8) & ~(var7 & var8);
            var8 = 115657402;
            var7 = var1725;
            if (var2.equals(
               a(
                  "添\ue74e淁\ue701淖\ue74e淛\ue74f淐\ue742淁\ue744淑",
                  "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩講㑾aꟲꒅꁰꤋ絳蹆",
                  var1334,
                  var1436,
                  var1581,
                  var7 & ~var8 | ~var7 & var8
               )
            )) {
               var10000 = (int)-1217200347475588173L;
               var8 = -1187658472;
               var7 = var10000;
               var10000 = (var7 | var8) & ~(var7 & var8);
               var8 = 487165613;
               var7 = var10000;
               var3 = (var7 | var8) & ~(var7 & var8);
            }
            break;
         case -347113380:
            var8 = -805242531;
            var7 = -931726673;
            int var1171 = var7 & ~var8 | ~var7 & var8;
            var8 = 1451603661;
            var7 = var1171;
            var1171 = ((var7 | var8) - (var7 & var8)) * ((var7 | var8) - (var7 & var8));
            String var1251 = "tx";
            String var1331 = "ty";
            var8 = 1682197420;
            var7 = -1642248442;
            int var1332 = var7 & ~var8 | ~var7 & var8;
            var8 = -1274423613;
            var7 = var1332;
            int var1333 = (var7 | var8) & ~(var7 & var8);
            var8 = -2039110706;
            var7 = -1345648657;
            int var1567 = (var7 | var8) & (~var7 | ~var8);
            var8 = 700359725;
            var7 = var1567;
            var1567 = (var7 | var8) - (var7 & var8);
            var1567 = (int)9150524898963736420L;
            var8 = -171550836;
            var7 = var1567;
            var1567 = (var7 | var8) & ~(var7 & var8);
            var8 = 182423787;
            var7 = var1567;
            var1567 = (var7 | var8) & ~(var7 & var8);
            var1567 = (int)-6879658606961217258L;
            var8 = 1833833114;
            var7 = var1567;
            var1567 = (var7 | var8) & (~var7 | ~var8);
            var8 = 22029193;
            var7 = var1567;
            var1567 = (var7 | var8) & (~var7 | ~var8);
            var8 = 409450209;
            var7 = -1291592984;
            int var1434 = var7 & ~var8 | ~var7 & var8;
            var8 = 1170410395;
            var7 = var1434;
            var1434 = (var7 | var8) - (var7 & var8);
            var1567 = (int)9186384808209823066L;
            var8 = -1064562779;
            var7 = var1567;
            var1567 = (var7 | var8) & ~(var7 & var8);
            var8 = -1169990334;
            var7 = var1567;
            var1567 = var7 & ~var8 | ~var7 & var8;
            var8 = -368538431;
            var7 = -485890856;
            int var1721 = (var7 | var8) - (var7 & var8);
            var8 = -2144737689;
            var7 = var1721;
            var8 = (var7 | var8) & ~(var7 & var8);
            var7 = var1567;
            var1567 = (var7 ^ var8) + 2 * (var7 & var8);
            var8 = -2043040907;
            var7 = 833604445;
            var1567 = (var7 | var8) & ~(var7 & var8);
            var8 = -1272115717;
            var7 = var1567;
            var1567 = var7 & ~var8 | ~var7 & var8;
            var8 = -370589095;
            var7 = 1287163594;
            var1721 = var7 & ~var8 | ~var7 & var8;
            var8 = -1222955694;
            var7 = var1721;
            var1721 = (var7 & ~var8 | ~var7 & var8) * (var7 & ~var8 | ~var7 & var8);
            var8 = 1515059794;
            var7 = -496509648;
            var1721 = (var7 | var8) & (~var7 | ~var8);
            var8 = -1201540561;
            var7 = var1721;
            if (var2.equals(
               a("添拾涕拺淐拨涕拸淛抱淇拴淆拡淚拿淆拴", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩講㑾aꟲꒅꁰꤋ絳蹆", var1333, var1434, var1567, (var7 | var8) & (~var7 | ~var8))
            )) {
               var8 = 712703857;
               var7 = 508055669;
               var10000 = var7 + var8 - 2 * (var7 & var8);
               var8 = 875736844;
               var7 = var10000;
               var3 = (var7 | var8) & (~var7 | ~var8);
            }
            break;
         case -288711231:
            int var1242 = (int)-4479560085068594982L;
            var8 = 1937351204;
            var7 = var1242;
            var1242 = var7 + var8 - 2 * (var7 & var8);
            var8 = 1745773293;
            var7 = var1242;
            var1242 = (var7 | var8) & (~var7 | ~var8);
            var1242 = (int)-1179954137725966097L;
            var8 = -1158876895;
            var7 = var1242;
            var1242 = (var7 | var8) & (~var7 | ~var8);
            var8 = 461085122;
            var7 = var1242;
            var1242 = var7 & ~var8 | ~var7 & var8;
            var8 = -1930084369;
            var7 = -388074448;
            var1242 = var7 + var8 - 2 * (var7 & var8);
            var8 = 1680559062;
            var7 = var1242;
            var1242 = (var7 | var8) & (~var7 | ~var8);
            String var1250 = "tr";
            int var1325 = (int)5846575608164050921L;
            var8 = -1413639043;
            var7 = var1325;
            var1325 = (var7 | var8) & (~var7 | ~var8);
            var8 = 422192512;
            var7 = var1325;
            var1325 = (var7 & ~var8 | ~var7 & var8) * (var7 & ~var8 | ~var7 & var8);
            var1325 = (int)6944864529119618339L;
            var8 = 664399685;
            var7 = var1325;
            var1325 = (var7 | var8) & (~var7 | ~var8);
            var8 = 246124559;
            var7 = var1325;
            var1325 = var7 + var8 - 2 * (var7 & var8);
            var8 = -4332481;
            var7 = 1883264049;
            int var1563 = var7 + var8 - 2 * (var7 & var8);
            var8 = -1879199730;
            var7 = var1563;
            var1563 = var7 & ~var8 | ~var7 & var8;
            var8 = -1994585686;
            var7 = 724906284;
            int var1432 = (var7 | var8) & (~var7 | ~var8);
            var8 = 1283538625;
            var7 = var1432;
            var1432 = (var7 | var8) & ~(var7 & var8);
            int var1712 = (int)680412725579981325L;
            var8 = 646376985;
            var7 = var1712;
            var1712 = (var7 | var8) & (~var7 | ~var8);
            var8 = -27309025;
            var7 = var1712;
            var1712 = (var7 | var8) & (~var7 | ~var8);
            var1712 = (int)6764386058540363971L;
            var8 = 1318663804;
            var7 = var1712;
            var1712 = var7 + var8 - 2 * (var7 & var8);
            var8 = -1602353476;
            var7 = var1712;
            var1712 = var7 + var8 - 2 * (var7 & var8);
            int var687 = 33101;
            var7 = -177677734;
            var1712 = var7 & ~var687 | ~var7 & var687;
            var687 = -177710317;
            var7 = var1712;
            var1712 = (var7 | var687) - (var7 & var687);
            var687 = -1738439158;
            var7 = -233772663;
            var1563 = var7 + var687 - 2 * (var7 & var687);
            var687 = 2116500749;
            var7 = var1563;
            var1563 = (var7 | var687) & (~var7 | ~var687);
            int var1766 = (int)-2103910815144928576L;
            var687 = -93488586;
            var7 = var1766;
            var1766 = (var7 | var687) - (var7 & var687);
            var687 = 1111646448;
            var7 = var1766;
            var1766 = var7 & ~var687 | ~var7 & var687;
            var687 = -1679867248;
            var7 = 1861222330;
            var1766 = (var7 | var687) & ~(var7 & var687);
            var687 = -181355208;
            var7 = var1766;
            var1766 = (var7 | var687) - (var7 & var687);
            var687 = 2054744453;
            var7 = 173187490;
            var1712 = (var7 | var687) - (var7 & var687);
            var687 = 1885813797;
            var7 = var1712;
            if (var2.equals(
               a(
                  "淖쎱淛쎸淜쎹深쎿淁쎿涕쎷淆쏾淇쎻淄쎫淜쎬淐쎺",
                  "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩講㑾aꟲꒅꁰꤋ絳蹆",
                  var1325,
                  var1432,
                  var1563,
                  var7 & ~var687 | ~var7 & var687
               )
            )) {
               var10000 = (int)-4687472623881949135L;
               var687 = 656835856;
               var7 = var10000;
               var10000 = (var7 | var687) & (~var7 | ~var687);
               var687 = -133991131;
               var7 = var10000;
               var3 = (var7 | var687) & (~var7 | ~var687);
            }
            break;
         case 782165529:
            var8 = 183196371;
            var7 = -1189191906;
            int var1236 = (var7 | var8) - (var7 & var8);
            var8 = -1275787825;
            var7 = var1236;
            var1236 = (var7 | var8) - (var7 & var8);
            var1236 = (int)-7341467915067146891L;
            var8 = 1049915116;
            var7 = var1236;
            var1236 = (var7 | var8) & (~var7 | ~var8);
            var8 = -957688939;
            var7 = var1236;
            var1236 = var7 + var8 - 2 * (var7 & var8);
            String var1241 = "to";
            int var1419 = (int)-3803970113162462479L;
            var8 = -780240796;
            var7 = var1419;
            var1419 = (var7 | var8) - (var7 & var8);
            var8 = -842939754;
            var7 = var1419;
            var1419 = (var7 | var8) & ~(var7 & var8);
            var8 = -1574168119;
            var7 = -1263366196;
            var1419 = var7 + var8 - 2 * (var7 & var8);
            var8 = 379491861;
            var7 = var1419;
            var1419 = (var7 | var8) - (var7 & var8);
            var1419 = (int)-7202675644227387404L;
            var8 = 1380589573;
            var7 = var1419;
            var1419 = (var7 | var8) & (~var7 | ~var8);
            var8 = -348266506;
            var7 = var1419;
            var1419 = var7 & ~var8 | ~var7 & var8;
            var8 = 555912505;
            var7 = -470804252;
            var1419 = var7 & ~var8 | ~var7 & var8;
            var8 = -1026386468;
            var7 = var1419;
            var1419 = (var7 | var8) & ~(var7 & var8);
            int var1322 = (int)546909419424711498L;
            var8 = -888033915;
            var7 = var1322;
            var1322 = var7 & ~var8 | ~var7 & var8;
            var8 = -1604225882;
            var7 = var1322;
            var1322 = (var7 | var8) & (~var7 | ~var8);
            String var1429 = "tp";
            var8 = -918162352;
            var7 = 675130961;
            var1419 = var7 + var8 - 2 * (var7 & var8);
            var8 = 267351094;
            var7 = var1419;
            var1419 = (var7 | var8) - (var7 & var8);
            int var1700 = (int)-4180803235263699988L;
            var8 = 404963408;
            var7 = var1700;
            var1700 = (var7 | var8) & (~var7 | ~var8);
            var8 = -1502682196;
            var7 = var1700;
            var1700 = var7 + var8 - 2 * (var7 & var8);
            var8 = 873863347;
            var7 = 1775169067;
            var1700 = (var7 | var8) - (var7 & var8);
            var8 = 1574499992;
            var7 = var1700;
            var1700 = (var7 | var8) & (~var7 | ~var8);
            var1700 = (int)-4168321164723913304L;
            var8 = -273266070;
            var7 = var1700;
            var1700 = (var7 | var8) - (var7 & var8);
            var8 = -1386924085;
            var7 = var1700;
            var1700 = (var7 | var8) - (var7 & var8);
            var8 = 430463737;
            var7 = -1021025866;
            var1700 = (var7 | var8) & ~(var7 & var8);
            var8 = -628343999;
            var7 = var1700;
            var1700 = (var7 | var8) & ~(var7 & var8);
            int var1560 = (int)8354721916721845898L;
            var8 = 591736350;
            var7 = var1560;
            var1560 = (var7 | var8) - (var7 & var8);
            var8 = 1591134230;
            var7 = var1560;
            var1560 = (var7 | var8) & ~(var7 & var8);
            int var1752 = (int)-4080294729626398476L;
            var8 = 430353780;
            var7 = var1752;
            var1752 = var7 + var8 - 2 * (var7 & var8);
            var8 = -736166516;
            var7 = var1752;
            var1752 = (var7 | var8) - (var7 & var8);
            var8 = 1495958513;
            var7 = -1009626021;
            var1752 = (var7 | var8) & ~(var7 & var8);
            var8 = -1694967904;
            var7 = var1752;
            var1752 = (var7 | var8) & (~var7 | ~var8);
            var1752 = (int)-5387273463557961133L;
            var8 = -715862263;
            var7 = var1752;
            var1752 = var7 + var8 - 2 * (var7 & var8);
            var8 = 636061008;
            var7 = var1752;
            var1752 = var7 & ~var8 | ~var7 & var8;
            var1752 = (int)1287481983617601182L;
            var8 = -603100777;
            var7 = var1752;
            var1752 = (var7 | var8) & (~var7 | ~var8);
            var8 = 741566210;
            var7 = var1752;
            var1752 = var7 & ~var8 | ~var7 & var8;
            var1752 = (int)-6902969925628506511L;
            var8 = -1432275616;
            var7 = var1752;
            var1752 = (var7 | var8) - (var7 & var8);
            var8 = -1122731235;
            var7 = var1752;
            var1752 = var7 & ~var8 | ~var7 & var8;
            var1700 = (int)-1532504808488189507L;
            var8 = 1625902791;
            var7 = var1700;
            var1700 = (var7 | var8) & (~var7 | ~var8);
            var8 = 1772688520;
            var7 = var1700;
            if (var2.equals(
               a("淶ⱡ添ⱨ淼Ⱪ淪Ⱡ淺ⱺ淪ⱨ淺ⱻ添ⱪ", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩講㑾aꟲꒅꁰꤋ絳蹆", var1322, var1419, var1560, var7 & ~var8 | ~var7 & var8)
            )) {
               var8 = -1054891757;
               var7 = -945411107;
               var10000 = var7 & ~var8 | ~var7 & var8;
               var8 = 112822988;
               var7 = var10000;
               var3 = var7 & ~var8 | ~var7 & var8;
            }
            break;
         case 1266212642:
            int var1167 = (int)-3035590246760782889L;
            var8 = 1842487972;
            var7 = var1167;
            var1167 = var7 & ~var8 | ~var7 & var8;
            var8 = 308433860;
            var7 = var1167;
            var1167 = (var7 | var8) & ~(var7 & var8);
            int var1233 = (int)-2883800694307551782L;
            var8 = -2059556174;
            var7 = var1233;
            var1233 = (var7 | var8) & (~var7 | ~var8);
            var8 = 37106178;
            var7 = var1233;
            var8 = var7 + var8 - 2 * (var7 & var8);
            var7 = var1167;
            var1167 = (var7 ^ var8) + 2 * (var7 & var8);
            String var1235 = "tq";
            var8 = 53950517;
            var7 = 139460709;
            int var1318 = (var7 | var8) & ~(var7 & var8);
            var8 = 447155944;
            var7 = var1318;
            var1318 = ((var7 | var8) - (var7 & var8)) * ((var7 | var8) - (var7 & var8));
            var8 = -1173858973;
            var7 = -1644184096;
            var1318 = (var7 | var8) & (~var7 | ~var8);
            var8 = 1772565226;
            var7 = var1318;
            var1318 = (var7 | var8) - (var7 & var8);
            int var1413 = (int)-3088875417099651118L;
            var8 = 2127197479;
            var7 = var1413;
            var1413 = (var7 | var8) - (var7 & var8);
            var8 = 1280895131;
            var7 = var1413;
            var1413 = (var7 + var8 - 2 * (var7 & var8)) * (var7 + var8 - 2 * (var7 & var8));
            var1413 = (int)-1714395397647220916L;
            var8 = 1904573924;
            var7 = var1413;
            var1413 = var7 & ~var8 | ~var7 & var8;
            var8 = -1987527041;
            var7 = var1413;
            var1413 = (var7 | var8) & (~var7 | ~var8);
            var8 = 31006335;
            var7 = 1261622040;
            int var1555 = (var7 | var8) & ~(var7 & var8);
            var8 = 3185173;
            var7 = var1555;
            var1555 = ((var7 | var8) & ~(var7 & var8)) * ((var7 | var8) & ~(var7 & var8));
            var1555 = (int)1765786386676256992L;
            var8 = 1216895533;
            var7 = var1555;
            var1555 = (var7 | var8) & (~var7 | ~var8);
            var8 = -1440339062;
            var7 = var1555;
            var1555 = (var7 | var8) - (var7 & var8);
            int var1694 = (int)8458989059294997856L;
            var8 = -1743046897;
            var7 = var1694;
            var1694 = (var7 | var8) & ~(var7 & var8);
            var8 = 1069163268;
            var7 = var1694;
            var1694 = (var7 | var8) & (~var7 | ~var8);
            var8 = 1772247235;
            var7 = -1918986851;
            int var1751 = var7 + var8 - 2 * (var7 & var8);
            var8 = 1900919835;
            var7 = var1751;
            var8 = var7 + var8 - 2 * (var7 & var8);
            var7 = var1694;
            var1694 = (var7 & ~var8) + (var8 & ~var7) + 2 * (var7 & var8);
            var1694 = (int)-943706304567967000L;
            var8 = -1541304078;
            var7 = var1694;
            var1694 = var7 + var8 - 2 * (var7 & var8);
            var8 = 193591432;
            var7 = var1694;
            if (var2.equals(
               a(
                  "淖\udd21淛\udd28淜\udd29添\udd2f淘\udd2b涕\udd27淆\udd6e淇\udd2b淄\udd3b淜\udd3c淐\udd2a",
                  "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩講㑾aꟲꒅꁰꤋ絳蹆",
                  var1318,
                  var1413,
                  var1555,
                  (var7 | var8) & (~var7 | ~var8)
               )
            )) {
               var8 = -149723550;
               var7 = -940224337;
               var10000 = (var7 | var8) & ~(var7 & var8);
               var8 = 820393678;
               var7 = var10000;
               var3 = (var7 | var8) - (var7 & var8);
            }
            break;
         case 1333715397:
            int var10001 = (int)-1155832552799538137L;
            var8 = -1224335703;
            var7 = var10001;
            var10001 = (var7 | var8) & (~var7 | ~var8);
            var8 = 533365763;
            var7 = var10001;
            var10001 = ((var7 | var8) & (~var7 | ~var8)) * ((var7 | var8) & (~var7 | ~var8));
            var8 = 1762103834;
            var7 = 2049116791;
            int var10002 = (var7 | var8) & (~var7 | ~var8);
            var8 = 1426537408;
            var7 = var10002;
            var10002 = (var7 | var8) - (var7 & var8);
            int var10003 = (int)-8991844669922926909L;
            var8 = 1722019280;
            var7 = var10003;
            var10003 = (var7 | var8) & (~var7 | ~var8);
            var8 = -508169291;
            var7 = var10003;
            var8 = (var7 | var8) - (var7 & var8);
            var7 = var10002;
            var10002 = 2 * (var7 | var8) - (var7 ^ var8);
            var8 = -57208005;
            var7 = -766934739;
            var10003 = var7 + var8 - 2 * (var7 & var8);
            var8 = -490891550;
            var7 = var10003;
            var10003 = var7 & ~var8 | ~var7 & var8;
            var8 = -873790146;
            var7 = 344047203;
            int var10004 = var7 + var8 - 2 * (var7 & var8);
            var8 = -692532603;
            var7 = var10004;
            var8 = var7 & ~var8 | ~var7 & var8;
            var7 = var10003;
            var10003 = var7 - ~var8 - 1;
            var8 = 803567498;
            var7 = 395855368;
            var10003 = (var7 | var8) & ~(var7 & var8);
            var8 = 1982721003;
            var7 = var10003;
            var10003 = (var7 | var8) - (var7 & var8);
            var8 = -1382554318;
            var7 = 356363765;
            var10004 = var7 & ~var8 | ~var7 & var8;
            var8 = -2004719338;
            var7 = var10004;
            var10004 = ((var7 | var8) - (var7 & var8)) * ((var7 | var8) - (var7 & var8));
            var8 = 675348492;
            var7 = -1867884839;
            var10004 = (var7 | var8) & ~(var7 & var8);
            var8 = 1450137083;
            var7 = var10004;
            var10004 = (var7 | var8) & ~(var7 & var8);
            int var10005 = (int)6974797603615605045L;
            var8 = -1226079772;
            var7 = var10005;
            var10005 = (var7 | var8) & (~var7 | ~var8);
            var8 = -330375941;
            var7 = var10005;
            var10005 = var7 & ~var8 | ~var7 & var8;
            var8 = 1917088239;
            var7 = 2010710509;
            int var10006 = (var7 | var8) - (var7 & var8);
            var8 = 1362661162;
            var7 = var10006;
            var8 = (var7 | var8) - (var7 & var8);
            var7 = var10005;
            var10005 = 2 * (var7 | var8) - (var7 ^ var8);
            var10005 = (int)-2488296812894114410L;
            var8 = -198098218;
            var7 = var10005;
            var10005 = var7 + var8 - 2 * (var7 & var8);
            var8 = -1976874115;
            var7 = var10005;
            var10005 = (var7 | var8) & ~(var7 & var8);
            var8 = 801260234;
            var7 = -1751688791;
            var10006 = (var7 | var8) - (var7 & var8);
            var8 = -851560756;
            var7 = var10006;
            var10006 = (var7 | var8) - (var7 & var8);
            var8 = 574525150;
            var7 = -910285730;
            int var10007 = var7 & ~var8 | ~var7 & var8;
            var8 = -1828909769;
            var7 = var10007;
            var8 = var7 & ~var8 | ~var7 & var8;
            var7 = var10006;
            var10006 = (var7 | var8) + (var7 & var8);
            var10006 = (int)-4464491659767606420L;
            var8 = 268490763;
            var7 = var10006;
            var10006 = (var7 | var8) & (~var7 | ~var8);
            var8 = 1425226638;
            var7 = var10006;
            if (var2.equals(
               a(
                  "添읚涕응淔읁淔윕淜읛涕읇淐읆淅읚淛읆淐",
                  "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩講㑾aꟲꒅꁰꤋ絳蹆",
                  var10003,
                  var10004,
                  var10005,
                  var7 + var8 - 2 * (var7 & var8)
               )
            )) {
               var10000 = (int)-6762344468255218468L;
               var8 = 2123752085;
               var7 = var10000;
               var10000 = (var7 | var8) - (var7 & var8);
               var8 = -1505491392;
               var7 = var10000;
               var3 = (var7 | var8) & ~(var7 & var8);
            }
      }

      switch (var3) {
         case 0:
            String var1163 = "tz";
            var8 = 856775949;
            var7 = 157420627;
            int var1228 = var7 & ~var8 | ~var7 & var8;
            var8 = 412194634;
            var7 = var1228;
            var1228 = ((var7 | var8) & ~(var7 & var8)) * ((var7 | var8) & ~(var7 & var8));
            var8 = -1261665352;
            var7 = -2013206334;
            int var1301 = var7 + var8 - 2 * (var7 & var8);
            var8 = -203915006;
            var7 = var1301;
            var1301 = ((var7 | var8) - (var7 & var8)) * ((var7 | var8) - (var7 & var8));
            var1301 = (int)3592495950324051971L;
            var8 = -47969319;
            var7 = var1301;
            var1301 = var7 + var8 - 2 * (var7 & var8);
            var8 = -1016274509;
            var7 = var1301;
            var1301 = (var7 | var8) & ~(var7 & var8);
            String var1401 = "ua";
            int var1402 = (int)3216254303635342596L;
            var8 = -290166033;
            var7 = var1402;
            int var1403 = (var7 | var8) - (var7 & var8);
            var8 = -1415551621;
            var7 = var1403;
            int var1404 = var7 & ~var8 | ~var7 & var8;
            String var1540 = "ub";
            var8 = -225835905;
            var7 = -1107709702;
            int var1541 = (var7 | var8) - (var7 & var8);
            var8 = 1262266072;
            var7 = var1541;
            int var1542 = (var7 | var8) & ~(var7 & var8);
            String var1682 = "uc";
            int var1683 = (int)-64076931390187300L;
            var8 = 1152053685;
            var7 = var1683;
            int var1684 = var7 & ~var8 | ~var7 & var8;
            var8 = -1767648990;
            var7 = var1684;
            return a(
               "榡䮩槴䯕榍䮤榈䯔槷侷榎䮯榉䮯槷侷榏䮬槻䯐榀䮮涕便榉䮧榏䯖榍䮫槶䮫涕侥涅侾涛侷榖䮣榅䮬榍䯕榀侷榈䮢榍䯖榊䮩榎䯛概䯔榀䮫槾䮢涕䮭榎䯙槲䮯涛",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩講㑾aꟲꒅꁰꤋ絳蹆",
               var1301,
               var1404,
               var1542,
               (var7 | var8) & ~(var7 & var8)
            );
         case 1:
            var8 = -300340715;
            var7 = 635573123;
            var10000 = (var7 | var8) & ~(var7 & var8);
            var8 = -910889717;
            var7 = var10000;
            var10000 = var7 & ~var8 | ~var7 & var8;
            int var1224 = (int)7611533444237433038L;
            var8 = 1891129391;
            var7 = var1224;
            var1224 = (var7 | var8) & ~(var7 & var8);
            var8 = -1360534029;
            var7 = var1224;
            var1224 = (var7 | var8) & ~(var7 & var8);
            int var1294 = (int)4626082645331950710L;
            var8 = 112437362;
            var7 = var1294;
            var1294 = (var7 | var8) - (var7 & var8);
            var8 = 1879649996;
            var7 = var1294;
            var8 = (var7 | var8) - (var7 & var8);
            var7 = var1224;
            var1224 = (var7 & ~var8) + (var8 & ~var7) + 2 * (var7 & var8);
            var1294 = (int)-8011394129831232086L;
            var8 = 1233281326;
            var7 = var1294;
            var1294 = var7 + var8 - 2 * (var7 & var8);
            var8 = 883336426;
            var7 = var1294;
            var1294 = var7 & ~var8 | ~var7 & var8;
            var8 = 2096021240;
            var7 = -661925733;
            var1294 = var7 + var8 - 2 * (var7 & var8);
            var8 = -365579254;
            var7 = var1294;
            var1294 = var7 & ~var8 | ~var7 & var8;
            var8 = 1918551362;
            var7 = -2006366361;
            int var1535 = (var7 | var8) - (var7 & var8);
            var8 = -97287636;
            var7 = var1535;
            var1535 = (var7 | var8) & (~var7 | ~var8);
            var8 = 1385979654;
            var7 = -982576131;
            int var1399 = (var7 | var8) - (var7 & var8);
            var8 = 2038310771;
            var7 = var1399;
            var1399 = var7 & ~var8 | ~var7 & var8;
            int var1664 = (int)1042952515434090564L;
            var8 = 2113728946;
            var7 = var1664;
            var1664 = (var7 | var8) & ~(var7 & var8);
            var8 = 99639798;
            var7 = var1664;
            var1664 = (var7 | var8) & (~var7 | ~var8);
            var1664 = (int)-215688159018342682L;
            var8 = 228787844;
            var7 = var1664;
            var1664 = (var7 | var8) & ~(var7 & var8);
            var8 = 383197285;
            var7 = var1664;
            var1664 = var7 & ~var8 | ~var7 & var8;
            var1664 = (int)-6210598728943447363L;
            var8 = -1893505828;
            var7 = var1664;
            var1664 = (var7 | var8) & (~var7 | ~var8);
            var8 = -101304730;
            var7 = var1664;
            var1664 = var7 & ~var8 | ~var7 & var8;
            var1664 = (int)8899821834631368073L;
            var8 = -1897067485;
            var7 = var1664;
            var1664 = var7 & ~var8 | ~var7 & var8;
            var8 = -1483030109;
            var7 = var1664;
            var1664 = var7 & ~var8 | ~var7 & var8;
            var1664 = (int)4141834819338135014L;
            var8 = 615640728;
            var7 = var1664;
            var1664 = (var7 | var8) & (~var7 | ~var8);
            var8 = -1068528779;
            var7 = var1664;
            var1664 = (var7 | var8) & ~(var7 & var8);
            var1535 = (int)-7311052144770396423L;
            var8 = 625031363;
            var7 = var1535;
            var1535 = (var7 | var8) & (~var7 | ~var8);
            var8 = 1568898072;
            var7 = var1535;
            var1535 = var7 + var8 - 2 * (var7 & var8);
            var8 = -2121146943;
            var7 = -1147405677;
            var1664 = (var7 | var8) & (~var7 | ~var8);
            var8 = 51347040;
            var7 = var1664;
            var1664 = (var7 & ~var8 | ~var7 & var8) * (var7 & ~var8 | ~var7 & var8);
            var8 = -402626877;
            var7 = -662869603;
            var1664 = (var7 | var8) & (~var7 | ~var8);
            var8 = 810341917;
            var7 = var1664;
            return a(
               "榨檪榇檡概檣榋檩榈檡涕櫞榋檨榁檯槷櫓涕櫞槷檡榎櫓榏檡涕檥榎櫑槲檪榌溱涕檼榉檪榈櫓槽檧槷檪涕檥榋檤榍櫘榀櫞槷檭榋溿榍檤榍溿槶檫榅檤榍櫝榀溿槴櫝榅櫟槾檪涕檥榎櫑槲檧涛",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩講㑾aꟲꒅꁰꤋ絳蹆",
               var1294,
               var1399,
               var1535,
               (var7 | var8) - (var7 & var8)
            );
         case 2:
            var10000 = (int)-9025061151167387879L;
            var8 = -1720577395;
            var7 = var10000;
            var10000 = (var7 | var8) - (var7 & var8);
            var8 = 1285722538;
            var7 = var10000;
            var10000 = (var7 | var8) & ~(var7 & var8);
            String var1223 = "ud";
            int var1289 = (int)4591568323550759150L;
            var8 = 1756547808;
            var7 = var1289;
            var1289 = (var7 | var8) - (var7 & var8);
            var8 = -1988920668;
            var7 = var1289;
            var1289 = var7 + var8 - 2 * (var7 & var8);
            var8 = 1868789533;
            var7 = -1176600582;
            var1289 = (var7 | var8) & ~(var7 & var8);
            var8 = -1729244530;
            var7 = var1289;
            var1289 = (var7 | var8) & ~(var7 & var8);
            int var1392 = (int)-8106888070283482663L;
            var8 = -2055719920;
            var7 = var1392;
            var1392 = (var7 | var8) & ~(var7 & var8);
            var8 = 554773037;
            var7 = var1392;
            var1392 = (var7 | var8) & ~(var7 & var8);
            var8 = 2048634957;
            var7 = -1636896858;
            int var1531 = var7 & ~var8 | ~var7 & var8;
            var8 = -591362468;
            var7 = var1531;
            var8 = (var7 | var8) - (var7 & var8);
            var7 = var1392;
            var1392 = (var7 & ~var8) + (var8 & ~var7) + 2 * (var7 & var8);
            var1392 = (int)2636634562079077893L;
            var8 = -1574460218;
            var7 = var1392;
            var1392 = (var7 | var8) - (var7 & var8);
            var8 = 1734660392;
            var7 = var1392;
            var1392 = var7 + var8 - 2 * (var7 & var8);
            var8 = 764721301;
            var7 = 1973630082;
            int var1655 = (var7 | var8) & (~var7 | ~var8);
            var8 = 1480035335;
            var7 = var1655;
            var1655 = (var7 | var8) & (~var7 | ~var8);
            var1655 = (int)6408753889257998086L;
            var8 = 934765516;
            var7 = var1655;
            var1655 = var7 & ~var8 | ~var7 & var8;
            var8 = 966206664;
            var7 = var1655;
            var1655 = (var7 | var8) - (var7 & var8);
            var8 = 1994941100;
            var7 = -1514592592;
            var1655 = (var7 | var8) & ~(var7 & var8);
            var8 = -749648869;
            var7 = var1655;
            var1655 = (var7 | var8) & (~var7 | ~var8);
            var1531 = (int)-8388882470683512778L;
            var8 = -1914199320;
            var7 = var1531;
            var1531 = (var7 | var8) & (~var7 | ~var8);
            var8 = 1127007858;
            var7 = var1531;
            var1531 = (var7 | var8) & (~var7 | ~var8);
            String var1662 = "ue";
            var8 = -259671645;
            var7 = -1120502854;
            var1655 = (var7 | var8) & ~(var7 & var8);
            var8 = 1301345215;
            var7 = var1655;
            return a(
               "榯艄榈舾榍艉涕艇榀虚榈艊榌艎榀艇涛虚榔艇榅舽榅艁榅虚槴艄槰舺榅艇榍舸榀虚榏艄榈舾榍艉涛",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩講㑾aꟲꒅꁰꤋ絳蹆",
               var1289,
               var1392,
               var1531,
               (var7 | var8) & (~var7 | ~var8)
            );
         case 3:
            int var1215 = (int)2023077263866275171L;
            var8 = -1238951576;
            var7 = var1215;
            var1215 = (var7 | var8) - (var7 & var8);
            var8 = 936131586;
            var7 = var1215;
            var1215 = var7 + var8 - 2 * (var7 & var8);
            var8 = 412849972;
            var7 = -1795492749;
            var1215 = var7 + var8 - 2 * (var7 & var8);
            var8 = -1939774643;
            var7 = var1215;
            var1215 = (var7 | var8) & ~(var7 & var8);
            var1215 = (int)-8469753574445858841L;
            var8 = -1100468865;
            var7 = var1215;
            var1215 = (var7 | var8) - (var7 & var8);
            var8 = 1923884268;
            var7 = var1215;
            var1215 = ((var7 | var8) - (var7 & var8)) * ((var7 | var8) - (var7 & var8));
            int var1283 = (int)-1043398267585713600L;
            var8 = 1484810759;
            var7 = var1283;
            var1283 = (var7 | var8) & (~var7 | ~var8);
            var8 = 698441303;
            var7 = var1283;
            var1283 = ((var7 | var8) & (~var7 | ~var8)) * ((var7 | var8) & (~var7 | ~var8));
            var1283 = (int)-4285169746643746484L;
            var8 = -739657531;
            var7 = var1283;
            var1283 = (var7 | var8) - (var7 & var8);
            var8 = 615900128;
            var7 = var1283;
            var1283 = (var7 | var8) - (var7 & var8);
            String var1388 = "uf";
            int var1389 = (int)909290678323501937L;
            var8 = -288310554;
            var7 = var1389;
            int var1390 = (var7 | var8) - (var7 & var8);
            var8 = -411109654;
            var7 = var1390;
            int var1391 = (var7 | var8) & (~var7 | ~var8);
            String var1527 = "ug";
            int var1528 = (int)-8662032066676396879L;
            var8 = -533749072;
            var7 = var1528;
            int var1529 = (var7 | var8) - (var7 & var8);
            var8 = 1349065808;
            var7 = var1529;
            int var1530 = (var7 | var8) & ~(var7 & var8);
            var8 = -1624812041;
            var7 = -373084433;
            int var1652 = var7 & ~var8 | ~var7 & var8;
            var8 = 1341690725;
            var7 = var1652;
            var1652 = (var7 & ~var8 | ~var7 & var8) * (var7 & ~var8 | ~var7 & var8);
            var8 = 624356748;
            var7 = -529506654;
            var1652 = (var7 | var8) & (~var7 | ~var8);
            var8 = -989022698;
            var7 = var1652;
            return a(
               "榨뛑涕뚧榏뛔概뛔榈뛚涕뛜榉뚫涕뛞榋뛙槱뛜榆뛔涛", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩講㑾aꟲꒅꁰꤋ絳蹆", var1283, var1391, var1530, var7 & ~var8 | ~var7 & var8
            );
         case 4:
            String var1157 = "uh";
            String var1214 = "ui";
            var8 = -1111527443;
            var7 = 2118487906;
            int var1279 = (var7 | var8) & (~var7 | ~var8);
            var8 = 1158772279;
            var7 = var1279;
            var1279 = var7 & ~var8 | ~var7 & var8;
            var8 = 329019566;
            var7 = -1672967067;
            var1279 = (var7 | var8) - (var7 & var8);
            var8 = -1048303966;
            var7 = var1279;
            var1279 = var7 + var8 - 2 * (var7 & var8);
            int var1511 = (int)2318408212236235655L;
            var8 = -70952922;
            var7 = var1511;
            var1511 = var7 & ~var8 | ~var7 & var8;
            var8 = -1250612315;
            var7 = var1511;
            var1511 = (var7 | var8) & (~var7 | ~var8);
            var8 = -674324069;
            var7 = 794527043;
            var1511 = var7 + var8 - 2 * (var7 & var8);
            var8 = -124443432;
            var7 = var1511;
            var1511 = (var7 | var8) & (~var7 | ~var8);
            var1511 = (int)1750406762556146691L;
            var8 = -649345137;
            var7 = var1511;
            var1511 = (var7 | var8) & (~var7 | ~var8);
            var8 = -137231475;
            var7 = var1511;
            var1511 = (var7 | var8) - (var7 & var8);
            var8 = 460265907;
            var7 = 661016353;
            var1511 = (var7 | var8) - (var7 & var8);
            var8 = 1007244929;
            var7 = var1511;
            var1511 = (var7 | var8) & ~(var7 & var8);
            var8 = -269218857;
            var7 = -1940189842;
            int var1386 = var7 + var8 - 2 * (var7 & var8);
            var8 = -1928873119;
            var7 = var1386;
            var1386 = var7 & ~var8 | ~var7 & var8;
            var1511 = (int)-4569825658832640194L;
            var8 = -1229591855;
            var7 = var1511;
            var1511 = (var7 | var8) & ~(var7 & var8);
            var8 = -1590784106;
            var7 = var1511;
            var1511 = (var7 | var8) & ~(var7 & var8);
            int var1647 = (int)-113483024283707044L;
            var8 = -923928884;
            var7 = var1647;
            var1647 = (var7 | var8) - (var7 & var8);
            var8 = -349045377;
            var7 = var1647;
            var8 = (var7 | var8) & ~(var7 & var8);
            var7 = var1511;
            var1511 = (var7 | var8) + (var7 & var8);
            var8 = -774169729;
            var7 = 1471952351;
            var1511 = var7 & ~var8 | ~var7 & var8;
            var8 = -1981811582;
            var7 = var1511;
            var1511 = (var7 | var8) - (var7 & var8);
            var8 = 106184390;
            var7 = -1853483535;
            var1647 = (var7 | var8) & (~var7 | ~var8);
            var8 = -851846101;
            var7 = var1647;
            var1647 = ((var7 | var8) & (~var7 | ~var8)) * ((var7 | var8) & (~var7 | ~var8));
            var8 = 1875487386;
            var7 = 317123477;
            var1647 = (var7 | var8) & ~(var7 & var8);
            var8 = 2103601820;
            var7 = var1647;
            return a(
               "榡顿榈顲槾顺涕页榋顲槱顷榆顿涕顱槷頎槶頍槴頍榇頌槻頍涛鱯榔顲榅須榅顴榅鱯槴顱槰頏榅顲榍頍榀鱯榏顱榈頋榍顼涛",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩講㑾aꟲꒅꁰꤋ絳蹆",
               var1279,
               var1386,
               var1511,
               var7 & ~var8 | ~var7 & var8
            );
         case 5:
            var10000 = (int)9180501623858090028L;
            var8 = 370827564;
            var7 = var10000;
            var10000 = (var7 | var8) & (~var7 | ~var8);
            var8 = 182485030;
            var7 = var10000;
            var10000 = (var7 | var8) - (var7 & var8);
            int var1211 = (int)-5278019536811530126L;
            var8 = -712061306;
            var7 = var1211;
            var1211 = var7 & ~var8 | ~var7 & var8;
            var8 = 1810990728;
            var7 = var1211;
            var8 = (var7 | var8) - (var7 & var8);
            var7 = var10000;
            var10000 = 2 * (var7 | var8) - (var7 ^ var8);
            String var1213 = "uj";
            int var1273 = (int)-4179083019782487889L;
            var8 = 908422111;
            var7 = var1273;
            var1273 = (var7 | var8) & ~(var7 & var8);
            var8 = 1385310478;
            var7 = var1273;
            var1273 = var7 & ~var8 | ~var7 & var8;
            var1273 = (int)-6569691221665467421L;
            var8 = 684441885;
            var7 = var1273;
            var1273 = var7 + var8 - 2 * (var7 & var8);
            var8 = 641443991;
            var7 = var1273;
            var1273 = var7 + var8 - 2 * (var7 & var8);
            int var1501 = (int)-6518480254023500097L;
            var8 = -1405454126;
            var7 = var1501;
            var1501 = (var7 | var8) & (~var7 | ~var8);
            var8 = 1673365101;
            var7 = var1501;
            var1501 = (var7 | var8) & ~(var7 & var8);
            var1501 = (int)9165591543628494738L;
            var8 = 1730806129;
            var7 = var1501;
            var1501 = (var7 | var8) - (var7 & var8);
            var8 = -177801504;
            var7 = var1501;
            var1501 = var7 + var8 - 2 * (var7 & var8);
            var8 = 1113111532;
            var7 = -1085840266;
            int var1384 = (var7 | var8) - (var7 & var8);
            var8 = 327110604;
            var7 = var1384;
            var1384 = (var7 | var8) - (var7 & var8);
            String var1507 = "uk";
            var1501 = (int)6716139214242214528L;
            var8 = 1951625126;
            var7 = var1501;
            var1501 = (var7 | var8) & (~var7 | ~var8);
            var8 = 2035968883;
            var7 = var1501;
            var1501 = var7 & ~var8 | ~var7 & var8;
            int var1641 = (int)2057914247082661909L;
            var8 = -181644310;
            var7 = var1641;
            var1641 = var7 & ~var8 | ~var7 & var8;
            var8 = -425289342;
            var7 = var1641;
            var1641 = (var7 | var8) - (var7 & var8);
            int var1749 = (int)-1146754124685933982L;
            var8 = -68813676;
            var7 = var1749;
            var1749 = (var7 | var8) - (var7 & var8);
            var8 = -1937944460;
            var7 = var1749;
            var8 = var7 & ~var8 | ~var7 & var8;
            var7 = var1641;
            var1641 = (var7 & ~var8) + (var8 & ~var7) + 2 * (var7 & var8);
            var1641 = (int)6459839545885776023L;
            var8 = 1138990093;
            var7 = var1641;
            var1641 = (var7 | var8) - (var7 & var8);
            var8 = 493730443;
            var7 = var1641;
            return a(
               "榧䷰槶䶏槵䷸榈䷰槺䶂涕䷳槽䷵榄䷷榅䧭槴䷸槵䷿榀䶍榅䧣涕䷒榋䷲槵䷳榄䶎榌䶏榀䧭榊䷳概䷻榀䧣",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩講㑾aꟲꒅꁰꤋ絳蹆",
               var1273,
               var1384,
               var1501,
               var7 + var8 - 2 * (var7 & var8)
            );
         case 6:
            int var1202 = (int)-4477743726092629032L;
            var8 = -296436370;
            var7 = var1202;
            var1202 = (var7 | var8) - (var7 & var8);
            var8 = -849905997;
            var7 = var1202;
            var1202 = var7 + var8 - 2 * (var7 & var8);
            var1202 = (int)3099265315850895329L;
            var8 = 1240891512;
            var7 = var1202;
            var1202 = (var7 | var8) & ~(var7 & var8);
            var8 = 504217490;
            var7 = var1202;
            var1202 = var7 + var8 - 2 * (var7 & var8);
            var8 = 322070791;
            var7 = 1902395643;
            var1202 = var7 + var8 - 2 * (var7 & var8);
            var8 = -1089337293;
            var7 = var1202;
            var1202 = (var7 | var8) & (~var7 | ~var8);
            var8 = -1661357148;
            var7 = -875112565;
            int var1269 = var7 + var8 - 2 * (var7 & var8);
            var8 = 610390144;
            var7 = var1269;
            var8 = (var7 | var8) & ~(var7 & var8);
            var7 = var1202;
            var1202 = 2 * (var7 | var8) - (var7 ^ var8);
            String var1270 = "ul";
            var8 = 811961246;
            var7 = -1067303333;
            var1269 = (var7 | var8) & ~(var7 & var8);
            var8 = -1101566036;
            var7 = var1269;
            var1269 = var7 & ~var8 | ~var7 & var8;
            var8 = -1636811022;
            var7 = -901474658;
            int var1494 = var7 + var8 - 2 * (var7 & var8);
            var8 = 1412737127;
            var7 = var1494;
            var1494 = (var7 | var8) & ~(var7 & var8);
            var8 = -696869894;
            var7 = 1929194531;
            int var1382 = (var7 | var8) - (var7 & var8);
            var8 = 1255669130;
            var7 = var1382;
            var1382 = var7 + var8 - 2 * (var7 & var8);
            var8 = -945121263;
            var7 = 1133300904;
            var1494 = var7 + var8 - 2 * (var7 & var8);
            var8 = 2069427798;
            var7 = var1494;
            var1494 = (var7 | var8) & ~(var7 & var8);
            var8 = -1985106827;
            var7 = -861588562;
            int var1639 = (var7 | var8) - (var7 & var8);
            var8 = 1136532748;
            var7 = var1639;
            var8 = var7 & ~var8 | ~var7 & var8;
            var7 = var1494;
            var1494 = var7 - ~var8 - 1;
            var8 = 1927981746;
            var7 = 2069511137;
            var1494 = var7 & ~var8 | ~var7 & var8;
            var8 = 190671050;
            var7 = var1494;
            var1494 = (var7 | var8) & ~(var7 & var8);
            int var1743 = (int)-7344937078722156534L;
            var8 = 1678111495;
            var7 = var1743;
            var1743 = (var7 | var8) & (~var7 | ~var8);
            var8 = 959339279;
            var7 = var1743;
            var1743 = var7 & ~var8 | ~var7 & var8;
            var1743 = (int)3656770052288545811L;
            var8 = -430700862;
            var7 = var1743;
            var1743 = (var7 | var8) & ~(var7 & var8);
            var8 = 296092376;
            var7 = var1743;
            var1743 = var7 & ~var8 | ~var7 & var8;
            var8 = -921226014;
            var7 = 1695664867;
            var1639 = var7 + var8 - 2 * (var7 & var8);
            var8 = -1408874993;
            var7 = var1639;
            return a(
               "榨௧槷\u0ff2榊௬榁௨榎ஜ槲௧榈௪槺\u0ff2榏\u0ff2槴௧槵\u0be0榀ஒ槶\u0ffc",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩講㑾aꟲꒅꁰꤋ絳蹆",
               var1269,
               var1382,
               var1494,
               (var7 | var8) & ~(var7 & var8)
            );
         case 7:
            var8 = 1390150834;
            var7 = -763263603;
            var10000 = var7 & ~var8 | ~var7 & var8;
            var8 = 2015454481;
            var7 = var10000;
            var10000 = (var7 | var8) - (var7 & var8);
            var8 = 2122903091;
            var7 = -1825256929;
            int var1199 = var7 & ~var8 | ~var7 & var8;
            var8 = 2049446508;
            var7 = var1199;
            var1199 = var7 + var8 - 2 * (var7 & var8);
            var8 = -441718074;
            var7 = 48594047;
            int var1265 = var7 + var8 - 2 * (var7 & var8);
            var8 = 282927060;
            var7 = var1265;
            var8 = (var7 | var8) & (~var7 | ~var8);
            var7 = var1199;
            var1199 = (var7 ^ var8) + 2 * (var7 & var8);
            String var1266 = "um";
            var8 = 1849327972;
            var7 = -185360714;
            var1265 = (var7 | var8) - (var7 & var8);
            var8 = -728119877;
            var7 = var1265;
            var1265 = (var7 | var8) - (var7 & var8);
            int var1479 = (int)5958835343881422817L;
            var8 = 1280601545;
            var7 = var1479;
            var1479 = var7 + var8 - 2 * (var7 & var8);
            var8 = -951309766;
            var7 = var1479;
            var1479 = (var7 | var8) - (var7 & var8);
            var1479 = (int)2574322080260344704L;
            var8 = -1590398151;
            var7 = var1479;
            var1479 = (var7 | var8) & (~var7 | ~var8);
            var8 = 1248377009;
            var7 = var1479;
            var1479 = (var7 | var8) & (~var7 | ~var8);
            var1479 = (int)-7288526594474713512L;
            var8 = -2094983673;
            var7 = var1479;
            var1479 = (var7 | var8) & ~(var7 & var8);
            var8 = 997836889;
            var7 = var1479;
            var1479 = var7 + var8 - 2 * (var7 & var8);
            int var1379 = (int)-6627737897272799049L;
            var8 = -1292612404;
            var7 = var1379;
            var1379 = (var7 | var8) - (var7 & var8);
            var8 = 885120337;
            var7 = var1379;
            var1379 = (var7 | var8) - (var7 & var8);
            var1479 = (int)1533318557514566837L;
            var8 = -1288775898;
            var7 = var1479;
            var1479 = (var7 | var8) - (var7 & var8);
            var8 = 1109387159;
            var7 = var1479;
            var1479 = ((var7 | var8) & ~(var7 & var8)) * ((var7 | var8) & ~(var7 & var8));
            var1479 = (int)-4037160979307910637L;
            var8 = -439707267;
            var7 = var1479;
            var1479 = var7 + var8 - 2 * (var7 & var8);
            var8 = 1227221518;
            var7 = var1479;
            var1479 = (var7 | var8) & (~var7 | ~var8);
            String var1637 = "un";
            var8 = 414228675;
            var7 = 1844917219;
            int var1638 = (var7 | var8) & (~var7 | ~var8);
            var8 = 1963425221;
            var7 = var1638;
            return a(
               "榔崁槴嵻榀崅榅夙榀嵰槤夙榈崌涕崁榈崁槳崁榅崂榍崎榍嵹榋崋榅崄榅夗涕崦榋崍榋崏榁崁槷崌涛",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩講㑾aꟲꒅꁰꤋ絳蹆",
               var1265,
               var1379,
               var1479,
               (var7 | var8) & (~var7 | ~var8)
            );
         case 8:
         case 9:
            var8 = -1133063078;
            var7 = -1705784473;
            int var1191 = var7 & ~var8 | ~var7 & var8;
            var8 = 639967035;
            var7 = var1191;
            var1191 = (var7 | var8) & ~(var7 & var8);
            var1191 = (int)-7762049767180074154L;
            var8 = -969288463;
            var7 = var1191;
            var1191 = var7 & ~var8 | ~var7 & var8;
            var8 = 1684920228;
            var7 = var1191;
            var1191 = (var7 | var8) & (~var7 | ~var8);
            var1191 = (int)-4298213956710678080L;
            var8 = -376658895;
            var7 = var1191;
            var1191 = (var7 | var8) - (var7 & var8);
            var8 = 1210471905;
            var7 = var1191;
            var1191 = (var7 | var8) & (~var7 | ~var8);
            int var1365 = (int)-5143895790829155106L;
            var8 = 2120038962;
            var7 = var1365;
            var1365 = var7 & ~var8 | ~var7 & var8;
            var8 = 1549629182;
            var7 = var1365;
            var1365 = (var7 | var8) - (var7 & var8);
            var8 = -1094661431;
            var7 = -1902109283;
            var1365 = var7 + var8 - 2 * (var7 & var8);
            var8 = 811652946;
            var7 = var1365;
            var1365 = var7 & ~var8 | ~var7 & var8;
            var1365 = (int)-4876568793710790182L;
            var8 = -803670371;
            var7 = var1365;
            var1365 = var7 & ~var8 | ~var7 & var8;
            var8 = 537136965;
            var7 = var1365;
            var1365 = var7 & ~var8 | ~var7 & var8;
            var8 = 283860465;
            var7 = 1439370891;
            var1365 = (var7 | var8) & ~(var7 & var8);
            var8 = 1159746417;
            var7 = var1365;
            var1365 = (var7 | var8) - (var7 & var8);
            int var1262 = (int)-2447441258349610904L;
            var8 = -445218498;
            var7 = var1262;
            var1262 = (var7 | var8) & (~var7 | ~var8);
            var8 = 675930943;
            var7 = var1262;
            var1262 = (var7 | var8) & (~var7 | ~var8);
            var8 = 144163760;
            var7 = -1530108382;
            var1365 = var7 + var8 - 2 * (var7 & var8);
            var8 = -364380891;
            var7 = var1365;
            var1365 = (var7 | var8) & ~(var7 & var8);
            var8 = -708346800;
            var7 = -1170949120;
            var1365 = var7 + var8 - 2 * (var7 & var8);
            var8 = -2122740001;
            var7 = var1365;
            var1365 = (var7 | var8) & ~(var7 & var8);
            int var1474 = (int)-4563126133278821626L;
            var8 = -1962732938;
            var7 = var1474;
            var1474 = (var7 | var8) & (~var7 | ~var8);
            var8 = 894536494;
            var7 = var1474;
            var1474 = (var7 | var8) & ~(var7 & var8);
            var8 = 822451874;
            var7 = 225337235;
            var1474 = var7 + var8 - 2 * (var7 & var8);
            var8 = 572515260;
            var7 = var1474;
            var1474 = (var7 | var8) & (~var7 | ~var8);
            String var1634 = "uo";
            int var1635 = (int)8611273566887573392L;
            var8 = -916551942;
            var7 = var1635;
            int var1636 = (var7 | var8) - (var7 & var8);
            var8 = -1954853600;
            var7 = var1636;
            return a(
               "榔ྣ槵ྤ榀࿖涕ྫ榀ஶ榇ྣ槵ྫ槶ྭ涕ྫྷ榎࿘槲ஸ涕ྉ榋ྩ槵ྨ榄࿕榌࿔榀ஶ榀\u0fdf槤ஶ槵ྦ概ஸ",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩講㑾aꟲꒅꁰꤋ絳蹆",
               var1262,
               var1365,
               var1474,
               (var7 | var8) & (~var7 | ~var8)
            );
         default:
            String var4 = var1;
            StringBuilder var1150 = new StringBuilder();
            String var1190 = "up";
            var8 = 1677427548;
            var7 = -841148343;
            int var1358 = (var7 | var8) - (var7 & var8);
            var8 = -1373201639;
            var7 = var1358;
            var1358 = (var7 | var8) & ~(var7 & var8);
            var8 = 1706189203;
            var7 = -1606623433;
            var1358 = (var7 | var8) & (~var7 | ~var8);
            var8 = -980500820;
            var7 = var1358;
            var1358 = (var7 | var8) & ~(var7 & var8);
            String var1362 = "uq";
            var8 = -1294566796;
            var7 = -1317057631;
            var1358 = (var7 | var8) - (var7 & var8);
            var8 = 1308224444;
            var7 = var1358;
            var1358 = var7 + var8 - 2 * (var7 & var8);
            String var1470 = "ur";
            int var1471 = (int)-7926183238564983183L;
            var8 = 1286534308;
            var7 = var1471;
            int var1472 = (var7 | var8) - (var7 & var8);
            var8 = 2057132822;
            var7 = var1472;
            int var1473 = var7 + var8 - 2 * (var7 & var8);
            int var1629 = (int)1034444438605600111L;
            var8 = 863640875;
            var7 = var1629;
            var1629 = var7 + var8 - 2 * (var7 & var8);
            var8 = -69299116;
            var7 = var1629;
            var1629 = ((var7 | var8) & (~var7 | ~var8)) * ((var7 | var8) & (~var7 | ~var8));
            var8 = -968937780;
            var7 = 1934538487;
            var1629 = (var7 | var8) & (~var7 | ~var8);
            var8 = -1490500107;
            var7 = var1629;
            var1629 = (var7 | var8) - (var7 & var8);
            int var1738 = (int)8217672417112342178L;
            var8 = -16703477;
            var7 = var1738;
            var1738 = var7 & ~var8 | ~var7 & var8;
            var8 = 1325806756;
            var7 = var1738;
            var1738 = (var7 | var8) & (~var7 | ~var8);
            int var1784 = (int)2359218763259591010L;
            var8 = -354054538;
            var7 = var1784;
            var1784 = var7 & ~var8 | ~var7 & var8;
            var8 = -1993434556;
            var7 = var1784;
            var8 = (var7 | var8) & (~var7 | ~var8);
            var7 = var1738;
            var1738 = var7 - ~var8 - 1;
            var8 = 911988829;
            var7 = -1078408581;
            var1738 = (var7 | var8) - (var7 & var8);
            var8 = -1985880744;
            var7 = var1738;
            return var1150.append(
                  a(
                     "榫糪榍粓榏粒涕糣榋粕榁粒榈粚槺碂榏粙槻糥榅碘涕",
                     "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩講㑾aꟲꒅꁰꤋ絳蹆",
                     var1358,
                     var1473,
                     var1629,
                     (var7 | var8) - (var7 & var8)
                  )
               )
               .append(var4)
               .toString();
      }
   }

   private void j() {
      ConfigManager var1 = ConfigManager.a();
      if (var1.i()) {
         this.b();
         CloudConfigRepository var2 = var1.j();
         if (var2 != null) {
            String var3 = var1.g();

            for (CloudConfigRepository.RemoteConfigRecord var5 : var2.f()) {
               LocalDateTime var6 = LocalDateTime.ofInstant(Instant.ofEpochMilli(var5.g), ZoneId.systemDefault());
               ConfigEntry var7 = new ConfigEntry(var5.b, var5.c, var6);
               var7.a(var5.b.equals(var3));
               this.a(var7);
            }
         }
      }
   }
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void a(ConfigActionMenu.Action var1) {
      if (this.z != null) {
         boolean var2 = this.z.e();
         switch (var1) {
            case SAVE_TO:
               if (this.z.f()) {
                  this.d(this.z);
               }
               break;
            case SHARE:
               this.n.a(this.z);
               break;
            case RENAME:
               if (var2) {
                  return;
               }

               for (ConfigCard var4 : this.h) {
                  if (var4.a() == this.z) {
                     var4.b();
                     return;
                  }
               }
               break;
            case DELETE:
               if (var2) {
                  return;
               }

               this.b(this.z);
         }
      }
   }

   public void a(ConfigEntry var1) {
      ConfigCard var2 = new ConfigCard(var1);
      if (!var1.f()) {
         var2.a((var1x, var2x) -> {
            this.z = var1x;
            ConfigActionMenu var10000x = this.l;
            int var10002 = (int)7527158195123084783L;
            int var4x = -1618530490;
            int var3x = var10002;
            var10002 = (var3x | var4x) - (var3x & var4x);
            var4x = -335777111;
            var3x = var10002;
            float var10001x = var2x[(var3x | var4x) & (~var3x | ~var4x)];
            var4x = -1243710018;
            var3x = -920187459;
            int var10003 = (var3x | var4x) & (~var3x | ~var4x);
            var4x = 2096721922;
            var3x = var10003;
            float var16x = var2x[(var3x | var4x) & (~var3x | ~var4x)];
            var4x = 459961426;
            var3x = 1342580960;
            int var10004 = var3x + var4x - 2 * (var3x & var4x);
            var4x = 1265392816;
            var3x = var10004;
            var10000x.a(var10001x, var16x, var2x[(var3x | var4x) & (~var3x | ~var4x)], var1x);
         });
         var2.b(this::c);
         var2.b((var2x, var3x) -> {
            boolean var4x = this.g.stream().anyMatch(var2xx -> {
               int var11x;
               if (var2xx != var1 && var2xx.a().equalsIgnoreCase(var3x)) {
                  var11x = (int)903391007442558029L;
                  int var9x = 1711394027;
                  int var6x = var11x;
                  var11x = (var6x | var9x) - (var6x & var9x);
                  var9x = -572223321;
                  var6x = var11x;
                  var11x = (var6x | var9x) & ~(var6x & var9x);
               } else {
                  int var4xx = -344963564;
                  int var3xx = 183096382;
                  var11x = (var3xx | var4xx) - (var3xx & var4xx);
                  var4xx = -510029270;
                  var3xx = var11x;
                  var11x = (var3xx | var4xx) - (var3xx & var4xx);
               }

               return pulse.Bool.from(var11x);
            });
            if (!var4x) {
               if (this.t != null) {
                  this.t.onRenamed(var1, var2x, var3x);
               }
            } else {
               var1.a(var2x);
            }
         });
         int var6 = -2095609832;
         int var5 = 1904265206;
         int var10000 = (var5 | var6) & (~var5 | ~var6);
         var6 = -224964626;
         var5 = var10000;
         int var3 = var5 + var6 - 2 * (var5 & var6);
         var10000 = (int)7704878335914103098L;
         var6 = -1951128742;
         var5 = var10000;
         var10000 = (var5 | var6) - (var5 & var6);
         var6 = -1300794784;
         var5 = var10000;

         for (int var4 = var5 + var6 - 2 * (var5 & var6); var4 < this.g.size(); var4++) {
            if (this.g.get(var4).f()) {
               var3 = var4;
               break;
            }

            var6 = 365224141;
            var5 = 659480390;
            int var10001 = (var5 | var6) & ~(var5 & var6);
            var6 = 847921034;
            var5 = var10001;
            var6 = var5 & ~var6 | ~var5 & var6;
            var5 = var4;
            var3 = var5 - ~var6 - 1;
         }

         this.g.add(var3, var1);
         this.h.add(var3, var2);
      } else {
         var2.c(this::d);
         this.g.add(var1);
         this.h.add(var2);
      }

      this.k();
   }

   private void c(ConfigEntry var1) {
      if (!var1.f()) {
         for (ConfigEntry var3 : this.g) {
            int var10001 = (int)-3584142181402325123L;
            int var5 = 132166693;
            int var4 = var10001;
            var10001 = (var4 | var5) - (var4 & var5);
            var5 = -219808936;
            var4 = var10001;
            var3.a(pulse.Bool.from(var4 & (var5 ^ -1) | (var4 ^ -1) & var5));
         }

         int var13 = (int)129613510780662798L;
         int var10 = 1134041376;
         int var7 = var13;
         var13 = var7 + var10 - 2 * (var7 & var10);
         var10 = 1739861295;
         var7 = var13;
         var1.a(pulse.Bool.from(var7 & (var10 ^ -1) | (var7 ^ -1) & var10));
         if (this.r != null) {
            this.r.accept(var1);
         }
      }
   }

   public void b(ConfigEntry var1) {
      int var2 = this.g.indexOf(var1);
      if (var2 >= 0) {
         this.g.remove(var2);
         this.h.remove(var2);
         this.k();
         int var6 = -108723033;
         int var5 = -1699013197;
         int var10001 = (var5 | var6) - (var5 & var6);
         var6 = -667556509;
         var5 = var10001;
         var10001 = (var5 | var6) & ~(var5 & var6);
         var6 = 511544986;
         var5 = 743886262;
         int var10002 = var5 & ~var6 | ~var5 & var6;
         var6 = -1857942334;
         var5 = var10002;
         var6 = var5 & ~var6 | ~var5 & var6;
         var5 = var10001;
         var10001 = (var5 | var6) + (var5 & var6);
         float var10000 = this.y - -5.0F;
         var6 = -2046149838;
         var5 = -558287037;
         var10002 = var5 + var6 - 2 * (var5 & var6);
         var6 = 1488129144;
         var5 = var10002;
         var10002 = (var5 | var6) & ~(var5 & var6);
         var10002 = (int)-3919321980580177613L;
         var6 = -1789468286;
         var5 = var10002;
         var10002 = (var5 | var6) & (~var5 | ~var6);
         var6 = 108378294;
         var5 = var10002;
         var10002 = var5 & ~var6 | ~var5 & var6;
         float var3 = var10000 - 4.0F;
         float var4 = this.l();
         if (!(var4 <= var3)) {
            this.i.b(var4, var3);
         } else {
            this.i.e();
         }

         if (this.s != null) {
            this.s.accept(var1);
         }
      }
   }

   private void d(ConfigEntry var1) {
      if (var1.f()) {
         ConfigManager var2 = ConfigManager.a();
         if (var2.i()) {
            var2.a(
               var1.g(),
               var2x -> {
                  var2.a(var2x);
                  var2.e();
                  String var3x = var1.a();
                  StringBuilder var10000 = new StringBuilder();
                  String var10001x = "wa";
                  int var5x = 458409829;
                  int var4x = 1373193932;
                  int var10002x = var4x & ~var5x | ~var4x & var5x;
                  var5x = 2023186065;
                  var4x = var10002x;
                  var10002x = (var4x | var5x) & ~(var4x & var5x);
                  var5x = 1412492170;
                  var4x = -852735932;
                  int var10003x = var4x & ~var5x | ~var4x & var5x;
                  var5x = -306252530;
                  var4x = var10003x;
                  var5x = var4x & ~var5x | ~var4x & var5x;
                  var4x = var10002x;
                  var10002x = (var4x & ~var5x) + (var5x & ~var4x) + 2 * (var4x & var5x);
                  var10003x = (int)2650632550314669814L;
                  var5x = -573012236;
                  var4x = var10003x;
                  var10003x = (var4x | var5x) & (~var4x | ~var5x);
                  var5x = 1337448694;
                  var4x = var10003x;
                  var10003x = (var4x + var5x - 2 * (var4x & var5x)) * (var4x + var5x - 2 * (var4x & var5x));
                  var10003x = (int)-6169130407594476940L;
                  var5x = -884996289;
                  var4x = var10003x;
                  var10003x = (var4x | var5x) & ~(var4x & var5x);
                  var5x = -279582942;
                  var4x = var10003x;
                  var10003x = (var4x | var5x) & ~(var4x & var5x);
                  var5x = 1652612840;
                  var4x = 965148892;
                  int var10004x = var4x & ~var5x | ~var4x & var5x;
                  var5x = 1621903177;
                  var4x = var10004x;
                  var10004x = (var4x | var5x) - (var4x & var5x);
                  int var10005x = (int)9079710415172071181L;
                  var5x = -1540117413;
                  var4x = var10005x;
                  var10005x = (var4x | var5x) & (~var4x | ~var5x);
                  var5x = -1287672929;
                  var4x = var10005x;
                  var5x = var4x & ~var5x | ~var4x & var5x;
                  var4x = var10004x;
                  var10004x = (var4x & ~var5x) + (var5x & ~var4x) + 2 * (var4x & var5x);
                  var5x = -1528617491;
                  var4x = -516778470;
                  var10004x = (var4x | var5x) & (~var4x | ~var5x);
                  var5x = -125162081;
                  var4x = var10004x;
                  var10004x = var4x + var5x - 2 * (var4x & var5x);
                  var5x = -1546005910;
                  var4x = 754712952;
                  var10005x = (var4x | var5x) - (var4x & var5x);
                  var5x = -1396813905;
                  var4x = var10005x;
                  var10005x = (var4x | var5x) - (var4x & var5x);
                  var5x = 476671288;
                  var4x = 952542205;
                  var10005x = var4x & ~var5x | ~var4x & var5x;
                  var5x = 941234246;
                  var4x = var10005x;
                  var10005x = (var4x | var5x) & ~(var4x & var5x);
                  var5x = -64728010;
                  var4x = 12371353;
                  int var10006x = (var4x | var5x) & (~var4x | ~var5x);
                  var5x = -1458012419;
                  var4x = var10006x;
                  var10006x = (var4x | var5x) - (var4x & var5x);
                  var5x = 449089308;
                  var4x = 1698576454;
                  int var10007 = (var4x | var5x) - (var4x & var5x);
                  var5x = -1064039648;
                  var4x = var10007;
                  var5x = var4x & ~var5x | ~var4x & var5x;
                  var4x = var10006x;
                  var10006x = (var4x ^ var5x) + 2 * (var4x & var5x);
                  var10006x = (int)3850436883434690941L;
                  var5x = -217393253;
                  var4x = var10006x;
                  var10006x = (var4x | var5x) & (~var4x | ~var5x);
                  var5x = 404074083;
                  var4x = var10006x;
                  var10000 = var10000.append(
                        a(
                           "ﴌ螿ﴦ蟃ﴫ螼ﴯ菟ﴩ蟁ﴮ螻ﴫ蟌盧菝",
                           "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩講㑾aꟲꒅꁰꤋ絳蹆",
                           var10003x,
                           var10004x,
                           var10005x,
                           var4x & ~var5x | ~var4x & var5x
                        )
                     )
                     .append(var3x);
                  var5x = -955474301;
                  var4x = -1295276434;
                  int var111 = (var4x | var5x) & (~var4x | ~var5x);
                  var5x = -1026470550;
                  var4x = var111;
                  int var112 = (var4x | var5x) - (var4x & var5x);
                  var10002x = (int)6572227048359670983L;
                  var5x = 1424480352;
                  var4x = var10002x;
                  var10002x = (var4x | var5x) & (~var4x | ~var5x);
                  var5x = -1095794150;
                  var4x = var10002x;
                  var10002x = ((var4x | var5x) & (~var4x | ~var5x)) * ((var4x | var5x) & (~var4x | ~var5x));
                  String var124 = "wb";
                  var10003x = (int)-5873179871998658662L;
                  var5x = 1459511286;
                  var4x = var10003x;
                  var10003x = var4x + var5x - 2 * (var4x & var5x);
                  var5x = 52769285;
                  var4x = var10003x;
                  var10003x = var4x & ~var5x | ~var4x & var5x;
                  var10004x = (int)1686003940220710517L;
                  var5x = 155722164;
                  var4x = var10004x;
                  var10004x = var4x & ~var5x | ~var4x & var5x;
                  var5x = -625193096;
                  var4x = var10004x;
                  var10004x = var4x + var5x - 2 * (var4x & var5x);
                  var10004x = (int)-4166746024294201062L;
                  var5x = 2003830266;
                  var4x = var10004x;
                  var10004x = var4x & ~var5x | ~var4x & var5x;
                  var5x = -223690977;
                  var4x = var10004x;
                  var10004x = (var4x | var5x) & (~var4x | ~var5x);
                  var10006x = (int)-1804334955026895141L;
                  var5x = 1114252383;
                  var4x = var10006x;
                  var10006x = (var4x | var5x) & (~var4x | ~var5x);
                  var5x = 1336347267;
                  var4x = var10006x;
                  var10006x = var4x & ~var5x | ~var4x & var5x;
                  var5x = 150327401;
                  var4x = -1133459382;
                  var10006x = var4x + var5x - 2 * (var4x & var5x);
                  var5x = -1266345941;
                  var4x = var10006x;
                  var10006x = (var4x | var5x) - (var4x & var5x);
                  var5x = -1875585144;
                  var4x = -333631609;
                  var10006x = var4x & ~var5x | ~var4x & var5x;
                  var5x = 2083125255;
                  var4x = var10006x;
                  var10006x = var4x & ~var5x | ~var4x & var5x;
                  var10005x = (int)-2616057720427092521L;
                  var5x = 595474398;
                  var4x = var10005x;
                  var10005x = (var4x | var5x) & ~(var4x & var5x);
                  var5x = 593631703;
                  var4x = var10005x;
                  var10005x = (var4x | var5x) & (~var4x | ~var5x);
                  var5x = -1386525714;
                  var4x = -1827445333;
                  var10007 = (var4x | var5x) & ~(var4x & var5x);
                  var5x = 1044917845;
                  var4x = var10007;
                  var10007 = (var4x | var5x) & ~(var4x & var5x);
                  var5x = -1673700995;
                  var4x = -538838771;
                  var10007 = (var4x | var5x) & (~var4x | ~var5x);
                  var5x = 1138532451;
                  var4x = var10007;
                  var10007 = var4x + var5x - 2 * (var4x & var5x);
                  var10007 = (int)2263387258587393107L;
                  var5x = 327426534;
                  var4x = var10007;
                  var10007 = var4x & ~var5x | ~var4x & var5x;
                  var5x = 1387990436;
                  var4x = var10007;
                  var10007 = var4x & ~var5x | ~var4x & var5x;
                  var5x = 1891959742;
                  var4x = 600250631;
                  var10006x = (var4x | var5x) & (~var4x | ~var5x);
                  var5x = 1397353637;
                  var4x = var10006x;
                  ChatMessages.a(
                     (Object)var10000.append(
                           a(
                              "櫓핆ﴬ턦ﴫ텚ﴦ텛﵂텛盧템盧텖ﴩ턤ﴫ텔ﴮ텘ﴯ턥盧템ﴭ텛ﵗ텞ﴠ턥綠",
                              "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩講㑾aꟲꒅꁰꤋ絳蹆",
                              var10003x,
                              var10004x,
                              var10005x,
                              var4x + var5x - 2 * (var4x & var5x)
                           )
                        )
                        .toString()
                  );
               },
               var1x -> ChatMessages.a((Object)this.c(var1x))
            );
         } else {
            int var10001 = (int)-1327399418252539225L;
            int var4 = -795308538;
            int var3 = var10001;
            var10001 = (var3 | var4) - (var3 & var4);
            var4 = -546847577;
            var3 = var10001;
            var10001 = (var3 | var4) & ~(var3 & var4);
            var4 = 818685515;
            var3 = 1627968268;
            var10001 = var3 & ~var4 | ~var3 & var4;
            var4 = 1371862343;
            var3 = var10001;
            var10001 = (var3 | var4) & (~var3 | ~var4);
            var10001 = (int)-6758660672348874670L;
            var4 = 1156256308;
            var3 = var10001;
            var10001 = var3 + var4 - 2 * (var3 & var4);
            var4 = 802490984;
            var3 = var10001;
            var10001 = (var3 | var4) & ~(var3 & var4);
            var10001 = (int)-8369443368898547339L;
            var4 = 595447233;
            var3 = var10001;
            var10001 = var3 & ~var4 | ~var3 & var4;
            var4 = 1181777072;
            var3 = var10001;
            var10001 = var3 & ~var4 | ~var3 & var4;
            var10001 = (int)6128888684968757013L;
            var4 = 822889237;
            var3 = var10001;
            var10001 = (var3 | var4) & (~var3 | ~var4);
            var4 = 1450511376;
            var3 = var10001;
            var10001 = (var3 | var4) & (~var3 | ~var4);
            String var76 = "us";
            var4 = -1513883195;
            var3 = -373522667;
            int var10002 = var3 + var4 - 2 * (var3 & var4);
            var4 = 1003866318;
            var3 = var10002;
            var10002 = (var3 & ~var4 | ~var3 & var4) * (var3 & ~var4 | ~var3 & var4);
            var10002 = (int)-1144982782776010619L;
            var4 = 1322526766;
            var3 = var10002;
            var10002 = (var3 | var4) & (~var3 | ~var4);
            var4 = -1237947710;
            var3 = var10002;
            var10002 = var3 & ~var4 | ~var3 & var4;
            int var10003 = (int)4537294207832219515L;
            var4 = 898030475;
            var3 = var10003;
            var10003 = (var3 | var4) & (~var3 | ~var4);
            var4 = 1303185834;
            var3 = var10003;
            var10003 = (var3 | var4) - (var3 & var4);
            var4 = 1971347922;
            var3 = -2058661026;
            var10003 = (var3 | var4) & ~(var3 & var4);
            var4 = 572672359;
            var3 = var10003;
            var10003 = var3 + var4 - 2 * (var3 & var4);
            String var10004 = "ut";
            int var85 = (int)-2475365000252987553L;
            var4 = -1881234432;
            var3 = var85;
            int var86 = var3 & ~var4 | ~var3 & var4;
            var4 = 888832707;
            var3 = var86;
            int var87 = var3 + var4 - 2 * (var3 & var4);
            int var10006 = (int)-160887437060277428L;
            var4 = 941797971;
            var3 = var10006;
            var10006 = (var3 | var4) & ~(var3 & var4);
            var4 = 1091586317;
            var3 = var10006;
            var10006 = (var3 | var4) - (var3 & var4);
            var4 = 1239881355;
            var3 = 1495570853;
            var10006 = var3 + var4 - 2 * (var3 & var4);
            var4 = 281251630;
            var3 = var10006;
            var10006 = (var3 | var4) - (var3 & var4);
            var4 = 1618064291;
            var3 = 2048950347;
            var10006 = var3 + var4 - 2 * (var3 & var4);
            var4 = 441529337;
            var3 = var10006;
            var10006 = var3 & ~var4 | ~var3 & var4;
            var4 = 252608815;
            var3 = 996341397;
            var10006 = (var3 | var4) & (~var3 | ~var4);
            var4 = 879523775;
            var3 = var10006;
            var10006 = (var3 | var4) & ~(var3 & var4);
            var4 = -1263462727;
            var3 = -1563331623;
            int var10005 = (var3 | var4) - (var3 & var4);
            var4 = 376762934;
            var3 = var10005;
            ChatMessages.a(
               (Object)a(
                  "푤饏퐅饈푽餻큥饀푻饇퐁饂푶饄푷鵚푰餳퐔鵚푸饏큥饂푸饂퐃饂푵饁푽饍푽餺푻饈푵饇큫",
                  "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩講㑾aꟲꒅꁰꤋ絳蹆",
                  var10002,
                  var10003,
                  var87,
                  (var3 | var4) & ~(var3 & var4)
               )
            );
         }
      }
   }

   private String c(String var1) {
      if (var1 == null) {
         int var936 = 939539260;
         int var463 = 1433616152;
         int var985 = var463 + var936 - 2 * (var463 & var936);
         var936 = 117542438;
         var463 = var985;
         var985 = (var463 | var936) & ~(var463 & var936);
         int var1046 = (int)3801470887081259993L;
         var936 = -386833423;
         var463 = var1046;
         var1046 = var463 + var936 - 2 * (var463 & var936);
         var936 = -1417805967;
         var463 = var1046;
         var936 = var463 + var936 - 2 * (var463 & var936);
         var463 = var985;
         var985 = (var463 & ~var936) + (var936 & ~var463) + 2 * (var463 & var936);
         var1046 = (int)8784576760493233523L;
         var936 = -1916983246;
         var463 = var1046;
         var1046 = var463 & ~var936 | ~var463 & var936;
         var936 = -1351346852;
         var463 = var1046;
         var1046 = ((var463 | var936) - (var463 & var936)) * ((var463 | var936) - (var463 & var936));
         String var1126 = "uu";
         var936 = -1001865907;
         var463 = -841022607;
         int var1127 = var463 + var936 - 2 * (var463 & var936);
         var936 = 1204249685;
         var463 = var1127;
         int var1128 = var463 & ~var936 | ~var463 & var936;
         var936 = -317928857;
         var463 = 2124065831;
         int var1220 = (var463 | var936) - (var463 & var936);
         var936 = -266412799;
         var463 = var1220;
         var1220 = ((var463 | var936) - (var463 & var936)) * ((var463 | var936) - (var463 & var936));
         var1220 = (int)-3507859383803923327L;
         var936 = -1568670974;
         var463 = var1220;
         var1220 = (var463 | var936) & ~(var463 & var936);
         var936 = 1413419633;
         var463 = var1220;
         var1220 = (var463 | var936) & ~(var463 & var936);
         var936 = -1853120153;
         var463 = -23099680;
         int var1333 = (var463 | var936) - (var463 & var936);
         var936 = -451047085;
         var463 = var1333;
         var1333 = (var463 & ~var936 | ~var463 & var936) * (var463 & ~var936 | ~var463 & var936);
         var1333 = (int)8662640757424146778L;
         var936 = 1233967851;
         var463 = var1333;
         var1333 = var463 + var936 - 2 * (var463 & var936);
         var936 = 482038100;
         var463 = var1333;
         var1333 = (var463 | var936) & ~(var463 & var936);
         String var1428 = "uv";
         var936 = 1014789763;
         var463 = 1664839536;
         int var1429 = (var463 | var936) & (~var463 | ~var936);
         var936 = 1595391243;
         var463 = var1429;
         return a(
            "å繜Ә縪Ì繙Ã繗¹縥Ә繖¸繑Ä繜Å繑º縥Ә繖¸繜Ä繑»繕Ә繓Æ織¼繑Ë穇",
            "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩講㑾aꟲꒅꁰꤋ絳蹆",
            var1128,
            var1220,
            var1333,
            var463 + var936 - 2 * (var463 & var936)
         );
      }

      String var2 = var1;
      int var8 = -200257175;
      int var7 = -1848590924;
      int var10000 = var7 + var8 - 2 * (var7 & var8);
      var8 = -1707142366;
      var7 = var10000;
      int var3 = (var7 | var8) & ~(var7 & var8);
      switch (var2.hashCode()) {
         case -1557786393:
            int var1014 = (int)-3001746373124068695L;
            var8 = 1293663200;
            var7 = var1014;
            var1014 = (var7 | var8) & (~var7 | ~var8);
            var8 = 883414724;
            var7 = var1014;
            var1014 = var7 & ~var8 | ~var7 & var8;
            int var1061 = (int)-9206739904167999883L;
            var8 = -908208431;
            var7 = var1061;
            var1061 = var7 & ~var8 | ~var7 & var8;
            var8 = 469973658;
            var7 = var1061;
            var8 = var7 & ~var8 | ~var7 & var8;
            var7 = var1014;
            var1014 = 2 * (var7 | var8) - (var7 ^ var8);
            String var1063 = "ux";
            int var1163 = (int)6430462262555571788L;
            var8 = -1756251003;
            var7 = var1163;
            var1163 = var7 + var8 - 2 * (var7 & var8);
            var8 = 1589473633;
            var7 = var1163;
            var1163 = (var7 & ~var8 | ~var7 & var8) * (var7 & ~var8 | ~var7 & var8);
            var1163 = (int)1677906222514914766L;
            var8 = 497715190;
            var7 = var1163;
            var1163 = var7 + var8 - 2 * (var7 & var8);
            var8 = -1802430383;
            var7 = var1163;
            var1163 = (var7 | var8) & (~var7 | ~var8);
            int var1377 = (int)-8579433411810681723L;
            var8 = -584384902;
            var7 = var1377;
            var1377 = var7 & ~var8 | ~var7 & var8;
            var8 = 1472389887;
            var7 = var1377;
            var1377 = (var7 | var8) - (var7 & var8);
            var1377 = (int)7992594783375037449L;
            var8 = -856492858;
            var7 = var1377;
            var1377 = (var7 | var8) & (~var7 | ~var8);
            var8 = 742875358;
            var7 = var1377;
            var1377 = var7 + var8 - 2 * (var7 & var8);
            var1377 = (int)7947007350221900294L;
            var8 = -241356830;
            var7 = var1377;
            var1377 = (var7 | var8) & ~(var7 & var8);
            var8 = -1997003295;
            var7 = var1377;
            var1377 = var7 + var8 - 2 * (var7 & var8);
            int var1259 = (int)-2147851960141140829L;
            var8 = -1148608650;
            var7 = var1259;
            var1259 = (var7 | var8) & (~var7 | ~var8);
            var8 = 1037698273;
            var7 = var1259;
            var1259 = (var7 | var8) - (var7 & var8);
            var1377 = (int)2522240536653979546L;
            var8 = 1022967136;
            var7 = var1377;
            var1377 = var7 & ~var8 | ~var7 & var8;
            var8 = -1669269147;
            var7 = var1377;
            var1377 = var7 & ~var8 | ~var7 & var8;
            var8 = 1290176122;
            var7 = -849049238;
            int var1456 = (var7 | var8) & (~var7 | ~var8);
            var8 = -415852752;
            var7 = var1456;
            var8 = (var7 | var8) & ~(var7 & var8);
            var7 = var1377;
            var1377 = (var7 & ~var8) + (var8 & ~var7) + 2 * (var7 & var8);
            var8 = 789447317;
            var7 = -1522017770;
            var1377 = (var7 | var8) & (~var7 | ~var8);
            var8 = -1820664136;
            var7 = var1377;
            var1377 = var7 & ~var8 | ~var7 & var8;
            int var1511 = (int)-3542713786827309933L;
            var8 = 1720939158;
            var7 = var1511;
            var1511 = (var7 | var8) - (var7 & var8);
            var8 = -573305335;
            var7 = var1511;
            var1511 = var7 + var8 - 2 * (var7 & var8);
            var8 = -509964013;
            var7 = 1455559687;
            var1511 = var7 + var8 - 2 * (var7 & var8);
            var8 = -1218935547;
            var7 = var1511;
            var1511 = (var7 | var8) - (var7 & var8);
            var8 = -2077478316;
            var7 = 1697030001;
            var1511 = (var7 | var8) & ~(var7 & var8);
            var8 = -519394012;
            var7 = var1511;
            var1511 = var7 & ~var8 | ~var7 & var8;
            var8 = 699018600;
            var7 = 894229902;
            var1456 = (var7 | var8) - (var7 & var8);
            var8 = 483659484;
            var7 = var1456;
            if (var2.equals(
               a(
                  "Ҷ\u20c4Ҍ₋ґ\u20c5ґ⃟ґ\u20caҔ\u20c2҂\u20ceҜ",
                  "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩講㑾aꟲꒅꁰꤋ絳蹆",
                  var1163,
                  var1259,
                  var1377,
                  (var7 | var8) & (~var7 | ~var8)
               )
            )) {
               var10000 = (int)1205479318284839411L;
               var8 = 673175823;
               var7 = var10000;
               var10000 = var7 & ~var8 | ~var7 & var8;
               var8 = -1100123907;
               var7 = var10000;
               var3 = var7 + var8 - 2 * (var7 & var8);
            }
            break;
         case -1110739040:
            var8 = -96547939;
            var7 = -535170719;
            int var1011 = var7 & ~var8 | ~var7 & var8;
            var8 = 1038227489;
            var7 = var1011;
            var1011 = var7 & ~var8 | ~var7 & var8;
            int var1056 = (int)-2406142393785072850L;
            var8 = 1739372129;
            var7 = var1056;
            var1056 = var7 + var8 - 2 * (var7 & var8);
            var8 = 709829256;
            var7 = var1056;
            var8 = var7 + var8 - 2 * (var7 & var8);
            var7 = var1011;
            var1011 = (var7 | var8) + (var7 & var8);
            var8 = 277924082;
            var7 = -496875807;
            var1056 = var7 + var8 - 2 * (var7 & var8);
            var8 = -1255262658;
            var7 = var1056;
            var1056 = (var7 | var8) - (var7 & var8);
            int var1155 = (int)6466021964188042342L;
            var8 = -1205358168;
            var7 = var1155;
            var1155 = var7 & ~var8 | ~var7 & var8;
            var8 = -134520122;
            var7 = var1155;
            var8 = var7 + var8 - 2 * (var7 & var8);
            var7 = var1056;
            var1056 = 2 * (var7 | var8) - (var7 ^ var8);
            var8 = -989114810;
            var7 = -705884185;
            var1155 = (var7 | var8) - (var7 & var8);
            var8 = 1211759080;
            var7 = var1155;
            var1155 = (var7 | var8) & ~(var7 & var8);
            int var1255 = (int)1019461874095081811L;
            var8 = 1688648370;
            var7 = var1255;
            var1255 = (var7 | var8) - (var7 & var8);
            var8 = -320696333;
            var7 = var1255;
            var8 = (var7 | var8) - (var7 & var8);
            var7 = var1155;
            var1155 = (var7 & ~var8) + (var8 & ~var7) + 2 * (var7 & var8);
            var1155 = (int)-7649088032991536635L;
            var8 = 608403964;
            var7 = var1155;
            var1155 = var7 + var8 - 2 * (var7 & var8);
            var8 = -2083896944;
            var7 = var1155;
            var1155 = (var7 | var8) - (var7 & var8);
            int var1365 = (int)5145746875169913563L;
            var8 = -312479879;
            var7 = var1365;
            var1365 = (var7 | var8) - (var7 & var8);
            var8 = -338963038;
            var7 = var1365;
            var1365 = (var7 | var8) - (var7 & var8);
            var1365 = (int)-4808336857457891913L;
            var8 = 1965340418;
            var7 = var1365;
            var1365 = (var7 | var8) & (~var7 | ~var8);
            var8 = -404139332;
            var7 = var1365;
            var1365 = (var7 | var8) & (~var7 | ~var8);
            var1365 = (int)8533343938463197543L;
            var8 = -2066991794;
            var7 = var1365;
            var1365 = var7 & ~var8 | ~var7 & var8;
            var8 = 848878625;
            var7 = var1365;
            var1365 = (var7 | var8) & ~(var7 & var8);
            var8 = -245226993;
            var7 = -1556352779;
            var1255 = var7 & ~var8 | ~var7 & var8;
            var8 = 1905418216;
            var7 = var1255;
            var1255 = var7 + var8 - 2 * (var7 & var8);
            var8 = -1212182507;
            var7 = 1654037971;
            int var1441 = (var7 | var8) & (~var7 | ~var8);
            var8 = -718729785;
            var7 = var1441;
            var1441 = var7 & ~var8 | ~var7 & var8;
            var1441 = (int)2078839975151506761L;
            var8 = -1583096032;
            var7 = var1441;
            var1441 = var7 + var8 - 2 * (var7 & var8);
            var8 = -697677202;
            var7 = var1441;
            var1441 = (var7 | var8) - (var7 & var8);
            var8 = -805367726;
            var7 = 765695561;
            var1441 = (var7 | var8) - (var7 & var8);
            var8 = -497252847;
            var7 = var1441;
            var1441 = (var7 | var8) & (~var7 | ~var8);
            var1441 = (int)-6183568221026842150L;
            var8 = 499684661;
            var7 = var1441;
            var1441 = (var7 | var8) - (var7 & var8);
            var8 = 411409662;
            var7 = var1441;
            var1441 = (var7 | var8) & ~(var7 & var8);
            var1441 = (int)3903403148160497712L;
            var8 = 1946544191;
            var7 = var1441;
            var1441 = (var7 | var8) & ~(var7 & var8);
            var8 = 423268381;
            var7 = var1441;
            var1441 = (var7 | var8) & ~(var7 & var8);
            var1365 = (int)2516531352496096360L;
            var8 = 132362585;
            var7 = var1365;
            var1365 = var7 + var8 - 2 * (var7 & var8);
            var8 = -2072848607;
            var7 = var1365;
            var1365 = (var7 | var8) & (~var7 | ~var8);
            int var1502 = (int)-7802316689386739196L;
            var8 = 2013184480;
            var7 = var1502;
            var1502 = var7 + var8 - 2 * (var7 & var8);
            var8 = 1342090231;
            var7 = var1502;
            var1502 = (var7 | var8) & ~(var7 & var8);
            var8 = -1094335587;
            var7 = 80286958;
            var1502 = (var7 | var8) & ~(var7 & var8);
            var8 = -1173563536;
            var7 = var1502;
            var1502 = (var7 | var8) & (~var7 | ~var8);
            var8 = -1069591086;
            var7 = -2064460630;
            var1502 = var7 + var8 - 2 * (var7 & var8);
            var8 = 1154318716;
            var7 = var1502;
            var1502 = (var7 | var8) & ~(var7 & var8);
            var8 = -1211817359;
            var7 = -50373699;
            var1502 = (var7 | var8) - (var7 & var8);
            var8 = 1262123486;
            var7 = var1502;
            var1502 = var7 & ~var8 | ~var7 & var8;
            var1441 = (int)-452109242442888571L;
            var8 = 1090363492;
            var7 = var1441;
            var1441 = (var7 | var8) & ~(var7 & var8);
            var8 = 1417363193;
            var7 = var1441;
            if (var2.equals(
               a("Ҷ૦Әૻҝૺ҈૦Җૺҝ", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩講㑾aꟲꒅꁰꤋ絳蹆", var1155, var1255, var1365, (var7 | var8) - (var7 & var8))
            )) {
               var8 = -753189263;
               var7 = 1843677241;
               var10000 = var7 & ~var8 | ~var7 & var8;
               var8 = -1090554291;
               var7 = var10000;
               var3 = (var7 | var8) & (~var7 | ~var8);
            }
            break;
         case -916893481:
            String var1010 = "vb";
            int var1053 = (int)-8146530613527058896L;
            var8 = -482678225;
            var7 = var1053;
            var1053 = (var7 | var8) & (~var7 | ~var8);
            var8 = -748275452;
            var7 = var1053;
            var1053 = (var7 | var8) & (~var7 | ~var8);
            int var1149 = (int)5673932474939171444L;
            var8 = 1434046766;
            var7 = var1149;
            var1149 = (var7 | var8) & (~var7 | ~var8);
            var8 = -1890904490;
            var7 = var1149;
            var1149 = ((var7 | var8) & ~(var7 & var8)) * ((var7 | var8) & ~(var7 & var8));
            var1149 = (int)-4367405415038452374L;
            var8 = 1837358077;
            var7 = var1149;
            var1149 = (var7 | var8) & ~(var7 & var8);
            var8 = 1028717822;
            var7 = var1149;
            var1149 = var7 + var8 - 2 * (var7 & var8);
            int var1354 = (int)8503807638390899835L;
            var8 = 2070088231;
            var7 = var1354;
            var1354 = (var7 | var8) & ~(var7 & var8);
            var8 = -1880617383;
            var7 = var1354;
            var1354 = (var7 | var8) & (~var7 | ~var8);
            var1354 = (int)8707020575886371384L;
            var8 = 1858751841;
            var7 = var1354;
            var1354 = var7 + var8 - 2 * (var7 & var8);
            var8 = -1821169829;
            var7 = var1354;
            var1354 = (var7 | var8) & ~(var7 & var8);
            int var1252 = (int)-1701748779696310117L;
            var8 = -1584951517;
            var7 = var1252;
            var1252 = (var7 | var8) & ~(var7 & var8);
            var8 = -861824210;
            var7 = var1252;
            var1252 = var7 + var8 - 2 * (var7 & var8);
            var1354 = (int)6982538409847654103L;
            var8 = -625801421;
            var7 = var1354;
            var1354 = (var7 | var8) & ~(var7 & var8);
            var8 = -915369681;
            var7 = var1354;
            var1354 = (var7 & ~var8 | ~var7 & var8) * (var7 & ~var8 | ~var7 & var8);
            var8 = -530386217;
            var7 = -969703231;
            var1354 = (var7 | var8) & (~var7 | ~var8);
            var8 = 1021060787;
            var7 = var1354;
            var1354 = var7 + var8 - 2 * (var7 & var8);
            String var1438 = "vc";
            int var1439 = (int)-4714606227437781759L;
            var8 = 1342359692;
            var7 = var1439;
            int var1440 = var7 + var8 - 2 * (var7 & var8);
            var8 = 770328081;
            var7 = var1440;
            if (var2.equals(
               a("Ҷ굂Ҭ굒Ҩ굘Ҫ굎Ұ굌ҫ굈Ҽ", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩講㑾aꟲꒅꁰꤋ絳蹆", var1149, var1252, var1354, (var7 | var8) & ~(var7 & var8))
            )) {
               var10000 = (int)-169522470149850725L;
               var8 = -1680508150;
               var7 = var10000;
               var10000 = var7 + var8 - 2 * (var7 & var8);
               var8 = -1299185006;
               var7 = var10000;
               var3 = (var7 | var8) - (var7 & var8);
            }
            break;
         case -532953636:
            var8 = -1647321922;
            var7 = 729700137;
            int var1008 = (var7 | var8) - (var7 & var8);
            var8 = -302222137;
            var7 = var1008;
            var1008 = ((var7 | var8) & (~var7 | ~var8)) * ((var7 | var8) & (~var7 | ~var8));
            var8 = 247692204;
            var7 = -218354101;
            int var1051 = var7 & ~var8 | ~var7 & var8;
            var8 = 984460122;
            var7 = var1051;
            var1051 = (var7 & ~var8 | ~var7 & var8) * (var7 & ~var8 | ~var7 & var8);
            var8 = 931558604;
            var7 = -1352479471;
            int var1236 = (var7 | var8) & ~(var7 & var8);
            var8 = -1729840675;
            var7 = var1236;
            var1236 = (var7 | var8) - (var7 & var8);
            var1236 = (int)7061085242538587942L;
            var8 = -300888131;
            var7 = var1236;
            var1236 = (var7 | var8) - (var7 & var8);
            var8 = 72562832;
            var7 = var1236;
            var1236 = var7 & ~var8 | ~var7 & var8;
            var8 = -685369257;
            var7 = -78902414;
            var1236 = (var7 | var8) & ~(var7 & var8);
            var8 = 745149238;
            var7 = var1236;
            var1236 = (var7 | var8) - (var7 & var8);
            var1236 = (int)2353401641089894496L;
            var8 = -120646899;
            var7 = var1236;
            var1236 = var7 & ~var8 | ~var7 & var8;
            var8 = 640883555;
            var7 = var1236;
            var1236 = (var7 | var8) & (~var7 | ~var8);
            var8 = 600387920;
            var7 = -1010538711;
            int var1147 = var7 & ~var8 | ~var7 & var8;
            var8 = -1369601008;
            var7 = var1147;
            var1147 = var7 & ~var8 | ~var7 & var8;
            var1236 = (int)4858237505546260765L;
            var8 = -206613820;
            var7 = var1236;
            var1236 = (var7 | var8) & (~var7 | ~var8);
            var8 = -111999626;
            var7 = var1236;
            var1236 = (var7 + var8 - 2 * (var7 & var8)) * (var7 + var8 - 2 * (var7 & var8));
            var1236 = (int)3212811192039450438L;
            var8 = -813539067;
            var7 = var1236;
            var1236 = var7 + var8 - 2 * (var7 & var8);
            var8 = 746307433;
            var7 = var1236;
            var1236 = (var7 | var8) - (var7 & var8);
            String var1351 = "uw";
            var8 = -775237169;
            var7 = 1516399508;
            int var1352 = (var7 | var8) & ~(var7 & var8);
            var8 = -1815080175;
            var7 = var1352;
            int var1353 = (var7 | var8) - (var7 & var8);
            var8 = -1769089623;
            var7 = 365585109;
            int var1434 = (var7 | var8) & ~(var7 & var8);
            var8 = 1857164539;
            var7 = var1434;
            var1434 = (var7 & ~var8 | ~var7 & var8) * (var7 & ~var8 | ~var7 & var8);
            var1434 = (int)-8188681380931144891L;
            var8 = 1656541412;
            var7 = var1434;
            var1434 = (var7 | var8) & ~(var7 & var8);
            var8 = 72082321;
            var7 = var1434;
            if (var2.equals(
               a("Ҷ黎Ҍ麁қ黎Җ黏ҝ黂Ҍ黄Ҝ", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩講㑾aꟲꒅꁰꤋ絳蹆", var1147, var1236, var1353, (var7 | var8) & (~var7 | ~var8))
            )) {
               var8 = -226042460;
               var7 = 1313988922;
               var10000 = (var7 | var8) & (~var7 | ~var8);
               var8 = -1126744930;
               var7 = var10000;
               var3 = (var7 | var8) - (var7 & var8);
            }
            break;
         case 280577614:
            int var1005 = (int)5203004628412863422L;
            var8 = -1187358440;
            var7 = var1005;
            var1005 = var7 + var8 - 2 * (var7 & var8);
            var8 = -19301542;
            var7 = var1005;
            var1005 = (var7 + var8 - 2 * (var7 & var8)) * (var7 + var8 - 2 * (var7 & var8));
            var8 = 779470622;
            var7 = 872445943;
            int var1132 = (var7 | var8) - (var7 & var8);
            var8 = 443920611;
            var7 = var1132;
            var1132 = (var7 | var8) - (var7 & var8);
            var1132 = (int)-6705976585487055286L;
            var8 = 1420140825;
            var7 = var1132;
            var1132 = (var7 | var8) & (~var7 | ~var8);
            var8 = 290498369;
            var7 = var1132;
            var1132 = (var7 | var8) - (var7 & var8);
            var1132 = (int)3635358640448918175L;
            var8 = -1719767033;
            var7 = var1132;
            var1132 = (var7 | var8) - (var7 & var8);
            var8 = -1302027620;
            var7 = var1132;
            var1132 = (var7 | var8) - (var7 & var8);
            var1132 = (int)6140721946578007255L;
            var8 = 747784382;
            var7 = var1132;
            var1132 = var7 & ~var8 | ~var7 & var8;
            var8 = 2124971108;
            var7 = var1132;
            var1132 = (var7 | var8) & ~(var7 & var8);
            String var1143 = "vd";
            var1132 = (int)-1501597520456996405L;
            var8 = 1484583369;
            var7 = var1132;
            var1132 = var7 + var8 - 2 * (var7 & var8);
            var8 = -610172309;
            var7 = var1132;
            var1132 = var7 & ~var8 | ~var7 & var8;
            int var1231 = (int)-1076800905312692801L;
            var8 = -1876860494;
            var7 = var1231;
            var1231 = (var7 | var8) & ~(var7 & var8);
            var8 = -1855636743;
            var7 = var1231;
            var1231 = (var7 | var8) - (var7 & var8);
            var8 = -700495079;
            var7 = 1488861648;
            var1231 = var7 + var8 - 2 * (var7 & var8);
            var8 = -1387550486;
            var7 = var1231;
            var1231 = (var7 | var8) & (~var7 | ~var8);
            int var1345 = (int)-3743679015745936092L;
            var8 = -80164667;
            var7 = var1345;
            var1345 = var7 + var8 - 2 * (var7 & var8);
            var8 = 1831188779;
            var7 = var1345;
            var1345 = (var7 | var8) & ~(var7 & var8);
            var1345 = (int)-4497058766189597619L;
            var8 = -394779106;
            var7 = var1345;
            var1345 = var7 + var8 - 2 * (var7 & var8);
            var8 = 248003813;
            var7 = var1345;
            var1345 = (var7 | var8) & ~(var7 & var8);
            var8 = 173276711;
            var7 = 1117267009;
            int var1430 = (var7 | var8) & ~(var7 & var8);
            var8 = -622686071;
            var7 = var1430;
            var1430 = var7 + var8 - 2 * (var7 & var8);
            int var1500 = (int)-127816051256507364L;
            var8 = 3732024;
            var7 = var1500;
            var1500 = (var7 | var8) & ~(var7 & var8);
            var8 = -805598195;
            var7 = var1500;
            var8 = var7 + var8 - 2 * (var7 & var8);
            var7 = var1430;
            var1430 = (var7 & ~var8) + (var8 & ~var7) + 2 * (var7 & var8);
            var8 = -1666530207;
            var7 = -67536442;
            var1430 = (var7 | var8) & (~var7 | ~var8);
            var8 = 1733336206;
            var7 = var1430;
            if (var2.equals(
               a(
                  "ҹ￨Ҩ\ufff4ҡ\uffe7Ҿ\ufff9ұ\ufff4ҽ￼",
                  "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩講㑾aꟲꒅꁰꤋ絳蹆",
                  var1132,
                  var1231,
                  var1345,
                  var7 & ~var8 | ~var7 & var8
               )
            )) {
               var10000 = (int)-1882506199794128542L;
               var8 = 1641528168;
               var7 = var10000;
               var10000 = var7 & ~var8 | ~var7 & var8;
               var8 = -1340386802;
               var7 = var10000;
               var3 = (var7 | var8) & (~var7 | ~var8);
            }
            break;
         case 1023286998:
            int var10001 = (int)844081601673360391L;
            var8 = 1120712668;
            var7 = var10001;
            var10001 = var7 + var8 - 2 * (var7 & var8);
            var8 = 230831191;
            var7 = var10001;
            var10001 = var7 + var8 - 2 * (var7 & var8);
            String var10002 = "uy";
            String var10003 = "uz";
            int var1129 = (int)-3355751453646618833L;
            var8 = 1414279529;
            var7 = var1129;
            int var1130 = (var7 | var8) & ~(var7 & var8);
            var8 = 16290863;
            var7 = var1130;
            int var1131 = (var7 | var8) - (var7 & var8);
            int var10004 = (int)1958858296990481052L;
            var8 = -2020887602;
            var7 = var10004;
            var10004 = (var7 | var8) - (var7 & var8);
            var8 = 119107045;
            var7 = var10004;
            var10004 = (var7 | var8) & (~var7 | ~var8);
            int var10005 = (int)-2549079352006592600L;
            var8 = 369782622;
            var7 = var10005;
            var10005 = var7 + var8 - 2 * (var7 & var8);
            var8 = 338884163;
            var7 = var10005;
            var8 = var7 & ~var8 | ~var7 & var8;
            var7 = var10004;
            var10004 = 2 * (var7 | var8) - (var7 ^ var8);
            var10004 = (int)-7212601626970787409L;
            var8 = 52483714;
            var7 = var10004;
            var10004 = (var7 | var8) - (var7 & var8);
            var8 = -422636626;
            var7 = var10004;
            var10004 = var7 + var8 - 2 * (var7 & var8);
            var10005 = (int)151895120249145300L;
            var8 = -737122230;
            var7 = var10005;
            var10005 = var7 & ~var8 | ~var7 & var8;
            var8 = -1277890633;
            var7 = var10005;
            var10005 = (var7 | var8) - (var7 & var8);
            var10005 = (int)-554820077482772266L;
            var8 = -1596684910;
            var7 = var10005;
            var10005 = (var7 | var8) & (~var7 | ~var8);
            var8 = -2125675112;
            var7 = var10005;
            var10005 = (var7 | var8) & ~(var7 & var8);
            int var10007 = (int)-8288260895551575730L;
            var8 = -622946346;
            var7 = var10007;
            var10007 = (var7 | var8) & ~(var7 & var8);
            var8 = 809352854;
            var7 = var10007;
            var10007 = (var7 | var8) - (var7 & var8);
            var8 = 320587550;
            var7 = -1118685518;
            int var10006 = (var7 | var8) & ~(var7 & var8);
            var8 = -1368520155;
            var7 = var10006;
            if (var2.equals(
               a("Ҷ╗Ҭ╇Ҿ╗ҭ╖Ҽ", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩講㑾aꟲꒅꁰꤋ絳蹆", var1131, var10004, var10005, (var7 | var8) & (~var7 | ~var8))
            )) {
               var8 = -245161164;
               var7 = 445988612;
               var10000 = var7 + var8 - 2 * (var7 & var8);
               var8 = -336192462;
               var7 = var10000;
               var3 = (var7 | var8) & ~(var7 & var8);
               String var956 = "va";
               var8 = 1388141116;
               var7 = 304907737;
               var10000 = (var7 | var8) - (var7 & var8);
               var8 = 1160546834;
               var7 = var10000;
               int var6 = var7 & ~var8 | ~var7 & var8;
               a = var6;
               var8 = 843007817;
               var7 = -567821510;
               var10001 = (var7 | var8) & ~(var7 & var8);
               var8 = -333906832;
               var7 = var10001;
               var10001 = var7 + var8 - 2 * (var7 & var8);
               var10001 = (int)-8516471686657501442L;
               var8 = 1976251895;
               var7 = var10001;
               var10001 = (var7 | var8) - (var7 & var8);
               var8 = -53435623;
               var7 = var10001;
               var10001 = var7 & ~var8 | ~var7 & var8;
               var10001 = (int)-543104008547012870L;
               var8 = 1964399686;
               var7 = var10001;
               var10001 = var7 + var8 - 2 * (var7 & var8);
               var8 = 1801499318;
               var7 = var10001;
               var10001 = (var7 | var8) & (~var7 | ~var8);
               var8 = -846705117;
               var7 = -1925615659;
               var10001 = var7 & ~var8 | ~var7 & var8;
               var8 = 1085350398;
               var7 = var10001;
               var10001 = (var7 | var8) & (~var7 | ~var8);
               var10001 = (int)1896011211635142003L;
               var8 = 372001942;
               var7 = var10001;
               var10001 = (var7 | var8) & ~(var7 & var8);
               var8 = -779623964;
               var7 = var10001;
               var10001 = (var7 | var8) & (~var7 | ~var8);
               var8 = -1026054768;
               var7 = 1750927742;
               var10000 = (var7 | var8) & (~var7 | ~var8);
               var8 = -1336294769;
               var7 = var10000;
               if (((var7 | var8) & (~var7 | ~var8)) < a) {
                  var10000 = (int)5833652999068554319L;
                  var8 = -369615501;
                  var7 = var10000;
                  var10000 = (var7 | var8) - (var7 & var8);
                  var8 = 1235716412;
                  var7 = var10000;
                  var10000 = var7 & ~var8 | ~var7 & var8;
                  var10001 = (int)8294541367550609864L;
                  var8 = 967417149;
                  var7 = var10001;
                  var10001 = (var7 | var8) & ~(var7 & var8);
                  var8 = 1376425205;
                  var7 = var10001;
                  var10000 /= var7 + var8 - 2 * (var7 & var8);
               }
            }
      }

      switch (var3) {
         case 0:
            var10000 = (int)3658518477684231828L;
            var8 = -240364129;
            var7 = var10000;
            var10000 = var7 & ~var8 | ~var7 & var8;
            var8 = 1444999286;
            var7 = var10000;
            var10000 = (var7 | var8) - (var7 & var8);
            var8 = 1758801565;
            var7 = -1647727436;
            int var1043 = var7 + var8 - 2 * (var7 & var8);
            var8 = 77501864;
            var7 = var1043;
            var8 = var7 + var8 - 2 * (var7 & var8);
            var7 = var10000;
            var10000 = (var7 ^ var8) + 2 * (var7 & var8);
            var8 = 815506718;
            var7 = -247160173;
            var1043 = var7 + var8 - 2 * (var7 & var8);
            var8 = 218700590;
            var7 = var1043;
            var1043 = (var7 | var8) & (~var7 | ~var8);
            int var1121 = (int)3753201454894429500L;
            var8 = 812758255;
            var7 = var1121;
            var1121 = var7 & ~var8 | ~var7 & var8;
            var8 = -1519125206;
            var7 = var1121;
            var1121 = ((var7 | var8) - (var7 & var8)) * ((var7 | var8) - (var7 & var8));
            var8 = -1831617266;
            var7 = -1281909479;
            var1121 = var7 + var8 - 2 * (var7 & var8);
            var8 = 1863645822;
            var7 = var1121;
            var1121 = (var7 | var8) - (var7 & var8);
            var8 = 610334912;
            var7 = 983879646;
            int var1215 = var7 & ~var8 | ~var7 & var8;
            var8 = -1369681105;
            var7 = var1215;
            var1215 = (var7 | var8) - (var7 & var8);
            int var1328 = (int)9086530115374857914L;
            var8 = -1055478026;
            var7 = var1328;
            var1328 = (var7 | var8) & (~var7 | ~var8);
            var8 = 231718730;
            var7 = var1328;
            var8 = var7 + var8 - 2 * (var7 & var8);
            var7 = var1215;
            var1215 = (var7 & ~var8) + (var8 & ~var7) + 2 * (var7 & var8);
            var8 = -514767467;
            var7 = -349635407;
            var1215 = (var7 | var8) & ~(var7 & var8);
            var8 = 780045250;
            var7 = var1215;
            var1215 = var7 & ~var8 | ~var7 & var8;
            int var1420 = (int)471771289317071L;
            var8 = -979004080;
            var7 = var1420;
            var1420 = (var7 | var8) & (~var7 | ~var8);
            var8 = 364444567;
            var7 = var1420;
            var1420 = (var7 | var8) - (var7 & var8);
            var1420 = (int)-6648689415151498252L;
            var8 = 746938820;
            var7 = var1420;
            var1420 = var7 + var8 - 2 * (var7 & var8);
            var8 = 796633634;
            var7 = var1420;
            var1420 = var7 & ~var8 | ~var7 & var8;
            var1328 = (int)3724631306301110048L;
            var8 = -1849246188;
            var7 = var1328;
            var1328 = var7 & ~var8 | ~var7 & var8;
            var8 = -389808989;
            var7 = var1328;
            var1328 = var7 & ~var8 | ~var7 & var8;
            String var1426 = "ve";
            var8 = 1171915464;
            var7 = -693729586;
            var1420 = (var7 | var8) - (var7 & var8);
            var8 = -1824260630;
            var7 = var1420;
            return a(
               "åꍈºꝝ¹ꍃÍꍉÀꍀÍꍀÀꌲӘꌼӘꌼÍꌽÊꍈ¸ꍃÄꝓӘꍢ¸ꍃÊꍈ¸ꌱºꍈӘꍅÅꌿÍꌽÅꍈºꝐÇꍃÌꍇÃꌳ¿ꍈÅꍅÍꝓ",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩講㑾aꟲꒅꁰꤋ絳蹆",
               var1121,
               var1215,
               var1328,
               (var7 | var8) - (var7 & var8)
            );
         case 1:
            String var980 = "vf";
            String var1042 = "vg";
            int var1114 = (int)-2982855649481031318L;
            var8 = 2034599477;
            var7 = var1114;
            var1114 = (var7 | var8) - (var7 & var8);
            var8 = 1485694364;
            var7 = var1114;
            var1114 = (var7 | var8) & ~(var7 & var8);
            int var1210 = (int)2962848822499711328L;
            var8 = -1339787023;
            var7 = var1210;
            var1210 = (var7 | var8) - (var7 & var8);
            var8 = -1164074515;
            var7 = var1210;
            var8 = (var7 | var8) & (~var7 | ~var8);
            var7 = var1114;
            var1114 = (var7 ^ var8) + 2 * (var7 & var8);
            var1114 = (int)-572213125240761553L;
            var8 = -1280215552;
            var7 = var1114;
            var1114 = var7 & ~var8 | ~var7 & var8;
            var8 = 1138032454;
            var7 = var1114;
            var1114 = var7 + var8 - 2 * (var7 & var8);
            var8 = -95272360;
            var7 = 420973796;
            int var1314 = (var7 | var8) & (~var7 | ~var8);
            var8 = -481964367;
            var7 = var1314;
            var1314 = var7 & ~var8 | ~var7 & var8;
            var1314 = (int)2449620804683962229L;
            var8 = -248236732;
            var7 = var1314;
            var1314 = (var7 | var8) & ~(var7 & var8);
            var8 = 1487675939;
            var7 = var1314;
            var1314 = var7 + var8 - 2 * (var7 & var8);
            var1314 = (int)5047085312836434214L;
            var8 = 1614157934;
            var7 = var1314;
            var1314 = (var7 | var8) & ~(var7 & var8);
            var8 = -1769807537;
            var7 = var1314;
            var1314 = var7 + var8 - 2 * (var7 & var8);
            var8 = 1461270822;
            var7 = 1898321014;
            var1314 = (var7 | var8) & ~(var7 & var8);
            var8 = 641674579;
            var7 = var1314;
            var1314 = (var7 | var8) - (var7 & var8);
            var1210 = (int)4821259716525543134L;
            var8 = 471725283;
            var7 = var1210;
            var1210 = var7 & ~var8 | ~var7 & var8;
            var8 = 981673315;
            var7 = var1210;
            var1210 = var7 + var8 - 2 * (var7 & var8);
            String var1324 = "vh";
            var1314 = (int)-1217937420214631914L;
            var8 = 2024685838;
            var7 = var1314;
            var1314 = var7 + var8 - 2 * (var7 & var8);
            var8 = -571982573;
            var7 = var1314;
            var1314 = (var7 | var8) & (~var7 | ~var8);
            int var1490 = (int)-704686075444383046L;
            var8 = 1484878201;
            var7 = var1490;
            var1490 = var7 & ~var8 | ~var7 & var8;
            var8 = 578307010;
            var7 = var1490;
            var1490 = var7 & ~var8 | ~var7 & var8;
            var1490 = (int)5607515264329893882L;
            var8 = 1797491012;
            var7 = var1490;
            var1490 = var7 + var8 - 2 * (var7 & var8);
            var8 = 567627437;
            var7 = var1490;
            var1490 = var7 & ~var8 | ~var7 & var8;
            var8 = -600561523;
            var7 = 700929623;
            var1490 = var7 & ~var8 | ~var7 & var8;
            var8 = -168591669;
            var7 = var1490;
            var1490 = (var7 | var8) & (~var7 | ~var8);
            var8 = 1625621164;
            var7 = -730674782;
            int var1419 = var7 & ~var8 | ~var7 & var8;
            var8 = -1264145046;
            var7 = var1419;
            return a(
               "Ù변¸볇À벴Ә볏Æ볈¼볍Ë볋Ê룕Í벼©룕Å변Ә볍Å볍¾볍È볎À볂À벵Æ볇È볈Ӗ룕ç볋Ç벵Æ별»볌º변Ә볊Æ볂Î변Ӗ",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩講㑾aꟲꒅꁰꤋ絳蹆",
               var1114,
               var1210,
               var1314,
               var7 & ~var8 | ~var7 & var8
            );
         case 2:
            String var979 = "vi";
            int var1039 = (int)-4248866949307897747L;
            var8 = 895614416;
            var7 = var1039;
            var1039 = (var7 | var8) & (~var7 | ~var8);
            var8 = 985126958;
            var7 = var1039;
            var1039 = ((var7 | var8) & (~var7 | ~var8)) * ((var7 | var8) & (~var7 | ~var8));
            int var1108 = (int)-1143099033693228653L;
            var8 = -1412890459;
            var7 = var1108;
            var1108 = var7 & ~var8 | ~var7 & var8;
            var8 = 1844275717;
            var7 = var1108;
            var1108 = (var7 & ~var8 | ~var7 & var8) * (var7 & ~var8 | ~var7 & var8);
            var1108 = (int)696318137418886307L;
            var8 = -1678458065;
            var7 = var1108;
            var1108 = (var7 | var8) - (var7 & var8);
            var8 = -903367195;
            var7 = var1108;
            var1108 = (var7 | var8) & (~var7 | ~var8);
            var8 = -885584062;
            var7 = -808097365;
            int var1205 = var7 & ~var8 | ~var7 & var8;
            var8 = 1870487774;
            var7 = var1205;
            var1205 = var7 + var8 - 2 * (var7 & var8);
            int var1305 = (int)997376690187046920L;
            var8 = -980423926;
            var7 = var1305;
            var1305 = (var7 | var8) & ~(var7 & var8);
            var8 = 991607217;
            var7 = var1305;
            var8 = (var7 | var8) & ~(var7 & var8);
            var7 = var1205;
            var1205 = var7 - ~var8 - 1;
            var8 = -1537031754;
            var7 = -273408266;
            var1205 = (var7 | var8) & ~(var7 & var8);
            var8 = 1876398440;
            var7 = var1205;
            var1205 = (var7 | var8) & (~var7 | ~var8);
            var1305 = (int)7183786861622451771L;
            var8 = 1935295058;
            var7 = var1305;
            var1305 = (var7 | var8) & ~(var7 & var8);
            var8 = -129142796;
            var7 = var1305;
            var1305 = var7 + var8 - 2 * (var7 & var8);
            var8 = 1556980974;
            var7 = 151885918;
            int var1416 = (var7 | var8) & (~var7 | ~var8);
            var8 = 390107659;
            var7 = var1416;
            var8 = (var7 | var8) & ~(var7 & var8);
            var7 = var1305;
            var1305 = (var7 ^ var8) + 2 * (var7 & var8);
            var1305 = (int)5349373373272965233L;
            var8 = 1694751907;
            var7 = var1305;
            var1305 = (var7 | var8) & (~var7 | ~var8);
            var8 = -860758134;
            var7 = var1305;
            var1305 = var7 + var8 - 2 * (var7 & var8);
            int var1480 = (int)-8125403531318537060L;
            var8 = -22916024;
            var7 = var1480;
            var1480 = var7 & ~var8 | ~var7 & var8;
            var8 = 632258773;
            var7 = var1480;
            var1480 = (var7 | var8) & ~(var7 & var8);
            var8 = -2072417126;
            var7 = -642042591;
            var1480 = var7 + var8 - 2 * (var7 & var8);
            var8 = 1573018033;
            var7 = var1480;
            var1480 = (var7 | var8) & (~var7 | ~var8);
            var8 = 1975516720;
            var7 = -1030628350;
            var1480 = (var7 | var8) - (var7 & var8);
            var8 = -1221713374;
            var7 = var1480;
            var1480 = (var7 | var8) & (~var7 | ~var8);
            var1480 = (int)-5406053137356892451L;
            var8 = -777565172;
            var7 = var1480;
            var1480 = (var7 | var8) - (var7 & var8);
            var8 = -1219257662;
            var7 = var1480;
            var1480 = var7 & ~var8 | ~var7 & var8;
            var1416 = (int)519283064951758967L;
            var8 = 1777057279;
            var7 = var1416;
            var1416 = (var7 | var8) & (~var7 | ~var8);
            var8 = 696338598;
            var7 = var1416;
            return a(
               "ç俿Í侃À俼Ä䮟Â侁Å俻À侌Ә侂Í䮟Å侏Á例Í侂Ӗ",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩講㑾aꟲꒅꁰꤋ絳蹆",
               var1108,
               var1205,
               var1305,
               (var7 | var8) - (var7 & var8)
            );
         case 3:
            int var1036 = (int)-3533952633462323513L;
            var8 = 712523744;
            var7 = var1036;
            var1036 = (var7 | var8) & ~(var7 & var8);
            var8 = -1626064587;
            var7 = var1036;
            var1036 = var7 + var8 - 2 * (var7 & var8);
            var8 = -1913491478;
            var7 = -255513379;
            int var1092 = (var7 | var8) & ~(var7 & var8);
            var8 = 2100773668;
            var7 = var1092;
            var1092 = (var7 | var8) & ~(var7 & var8);
            var8 = 1169280863;
            var7 = 355360389;
            var1092 = (var7 | var8) - (var7 & var8);
            var8 = 1352634841;
            var7 = var1092;
            var1092 = var7 & ~var8 | ~var7 & var8;
            var8 = -986339769;
            var7 = -1920661244;
            var1092 = var7 & ~var8 | ~var7 & var8;
            var8 = 1219538762;
            var7 = var1092;
            var1092 = (var7 | var8) & (~var7 | ~var8);
            var1092 = (int)-1999935036532843937L;
            var8 = -1266095322;
            var7 = var1092;
            var1092 = var7 & ~var8 | ~var7 & var8;
            var8 = -1726811791;
            var7 = var1092;
            var1092 = (var7 | var8) & (~var7 | ~var8);
            var1092 = (int)-5001637505067495644L;
            var8 = 1368510423;
            var7 = var1092;
            var1092 = (var7 | var8) - (var7 & var8);
            var8 = 759350349;
            var7 = var1092;
            var1092 = (var7 | var8) & (~var7 | ~var8);
            var8 = 1762721451;
            var7 = -1407594444;
            int var1199 = (var7 | var8) & (~var7 | ~var8);
            var8 = 1276707049;
            var7 = var1199;
            var8 = (var7 | var8) & (~var7 | ~var8);
            var7 = var1092;
            var1092 = var7 - ~var8 - 1;
            var1092 = (int)4971493977387035056L;
            var8 = 1579526112;
            var7 = var1092;
            var1092 = (var7 | var8) & (~var7 | ~var8);
            var8 = -1118792647;
            var7 = var1092;
            var1092 = var7 + var8 - 2 * (var7 & var8);
            var8 = 307983181;
            var7 = -8620649;
            var1199 = (var7 | var8) - (var7 & var8);
            var8 = -743494632;
            var7 = var1199;
            var1199 = (var7 | var8) & (~var7 | ~var8);
            var1199 = (int)-4703326141739023552L;
            var8 = -269341472;
            var7 = var1199;
            var1199 = (var7 | var8) - (var7 & var8);
            var8 = -691977899;
            var7 = var1199;
            var1199 = (var7 | var8) & (~var7 | ~var8);
            var8 = -346862559;
            var7 = -1880999484;
            int var1300 = var7 & ~var8 | ~var7 & var8;
            var8 = -865005937;
            var7 = var1300;
            var1300 = (var7 | var8) & (~var7 | ~var8);
            var1300 = (int)6805408795070400780L;
            var8 = 1007114764;
            var7 = var1300;
            var1300 = var7 & ~var8 | ~var7 & var8;
            var8 = 1008715761;
            var7 = var1300;
            var1300 = (var7 | var8) & ~(var7 & var8);
            String var1414 = "vj";
            var8 = 2119009360;
            var7 = -451512985;
            int var1415 = var7 & ~var8 | ~var7 & var8;
            var8 = -1689877300;
            var7 = var1415;
            return a(
               "ê꼡Ә꽗ÍꭊÇ꼪À꽔É꼪Í꽑Àꭊµ꼨Æ꼨Ә꽐Æ꽗¼꽒Ëꭄ",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩講㑾aꟲꒅꁰꤋ絳蹆",
               var1092,
               var1199,
               var1300,
               var7 & ~var8 | ~var7 & var8
            );
         case 4:
            var8 = 77492699;
            var7 = 669490890;
            var10000 = (var7 | var8) & ~(var7 & var8);
            var8 = 393644277;
            var7 = var10000;
            var10000 = (var7 + var8 - 2 * (var7 & var8)) * (var7 + var8 - 2 * (var7 & var8));
            int var1032 = (int)5818273833436113551L;
            var8 = 1192903964;
            var7 = var1032;
            var1032 = (var7 | var8) & (~var7 | ~var8);
            var8 = -275478631;
            var7 = var1032;
            var1032 = (var7 | var8) & ~(var7 & var8);
            var8 = -1801436235;
            var7 = 1742572494;
            int var1084 = (var7 | var8) & ~(var7 & var8);
            var8 = 466931008;
            var7 = var1084;
            var8 = (var7 | var8) & (~var7 | ~var8);
            var7 = var1032;
            var1032 = (var7 & ~var8) + (var8 & ~var7) + 2 * (var7 & var8);
            var1084 = (int)-2784690901427301712L;
            var8 = -1628946197;
            var7 = var1084;
            var1084 = var7 & ~var8 | ~var7 & var8;
            var8 = 1660372106;
            var7 = var1084;
            var1084 = (var7 | var8) - (var7 & var8);
            var8 = -929157753;
            var7 = -654286099;
            int var1192 = var7 & ~var8 | ~var7 & var8;
            var8 = 476157626;
            var7 = var1192;
            var8 = var7 & ~var8 | ~var7 & var8;
            var7 = var1084;
            var1084 = 2 * (var7 | var8) - (var7 ^ var8);
            var1084 = (int)1040413641795741975L;
            var8 = -1941067190;
            var7 = var1084;
            var1084 = (var7 | var8) & (~var7 | ~var8);
            var8 = 548002100;
            var7 = var1084;
            var1084 = (var7 | var8) & ~(var7 & var8);
            var8 = -58255317;
            var7 = 535534248;
            var1192 = (var7 | var8) & ~(var7 & var8);
            var8 = -1985436184;
            var7 = var1192;
            var1192 = var7 & ~var8 | ~var7 & var8;
            int var1294 = (int)3187472489354768283L;
            var8 = -1575516467;
            var7 = var1294;
            var1294 = var7 + var8 - 2 * (var7 & var8);
            var8 = -1324628422;
            var7 = var1294;
            var8 = var7 + var8 - 2 * (var7 & var8);
            var7 = var1192;
            var1192 = 2 * (var7 | var8) - (var7 ^ var8);
            var1192 = (int)-7262826078813186609L;
            var8 = 1528990321;
            var7 = var1192;
            var1192 = (var7 | var8) & ~(var7 & var8);
            var8 = 705836807;
            var7 = var1192;
            var1192 = var7 & ~var8 | ~var7 & var8;
            String var1296 = "vk";
            var1294 = (int)2734316600432365675L;
            var8 = 1644501803;
            var7 = var1294;
            var1294 = (var7 | var8) - (var7 & var8);
            var8 = 2019974808;
            var7 = var1294;
            var1294 = (var7 | var8) - (var7 & var8);
            int var1408 = (int)319097662908165390L;
            var8 = -1087176582;
            var7 = var1408;
            var1408 = var7 + var8 - 2 * (var7 & var8);
            var8 = -910606842;
            var7 = var1408;
            var1408 = var7 + var8 - 2 * (var7 & var8);
            int var1478 = (int)-6654217121647964610L;
            var8 = -1336844024;
            var7 = var1478;
            var1478 = (var7 | var8) & ~(var7 & var8);
            var8 = -906208975;
            var7 = var1478;
            var8 = var7 & ~var8 | ~var7 & var8;
            var7 = var1408;
            var1408 = (var7 & ~var8) + (var8 & ~var7) + 2 * (var7 & var8);
            var1408 = (int)-7607262113635160303L;
            var8 = -178098505;
            var7 = var1408;
            var1408 = var7 & ~var8 | ~var7 & var8;
            var8 = 1444032025;
            var7 = var1408;
            return a(
               "å딛Ә땭Ì딞Ã딐¹땢Ә딑¸딖Ä딛Å딖º땢Ә디Æ딓¼딖Ë넀Ә딱Æ딑¸딐É땭Á땬Í넎Ç딐Ï딘Í넀",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩講㑾aꟲꒅꁰꤋ絳蹆",
               var1084,
               var1192,
               var1294,
               var7 & ~var8 | ~var7 & var8
            );
         case 5:
            var8 = 829340705;
            var7 = 1841118630;
            var10000 = (var7 | var8) - (var7 & var8);
            var8 = 83760254;
            var7 = var10000;
            var10000 = (var7 | var8) & (~var7 | ~var8);
            var8 = -394658530;
            var7 = -1740475958;
            int var1030 = var7 + var8 - 2 * (var7 & var8);
            var8 = -651284114;
            var7 = var1030;
            var1030 = var7 + var8 - 2 * (var7 & var8);
            int var1079 = (int)1069422751416730388L;
            var8 = 1145212401;
            var7 = var1079;
            var1079 = (var7 | var8) - (var7 & var8);
            var8 = -1481747917;
            var7 = var1079;
            var1079 = ((var7 | var8) & (~var7 | ~var8)) * ((var7 | var8) & (~var7 | ~var8));
            var8 = 497655510;
            var7 = -1098377122;
            var1079 = (var7 | var8) & ~(var7 & var8);
            var8 = -311337759;
            var7 = var1079;
            var1079 = var7 + var8 - 2 * (var7 & var8);
            int var1285 = (int)-73052210015039739L;
            var8 = 1123114498;
            var7 = var1285;
            var1285 = var7 & ~var8 | ~var7 & var8;
            var8 = -1458679530;
            var7 = var1285;
            var1285 = var7 + var8 - 2 * (var7 & var8);
            var8 = 825448655;
            var7 = -37545595;
            int var1190 = (var7 | var8) & (~var7 | ~var8);
            var8 = -284186566;
            var7 = var1190;
            var1190 = var7 + var8 - 2 * (var7 & var8);
            var1285 = (int)-1178404793984145802L;
            var8 = 1403594339;
            var7 = var1285;
            var1285 = (var7 | var8) & (~var7 | ~var8);
            var8 = -911985540;
            var7 = var1285;
            var1285 = ((var7 | var8) & ~(var7 & var8)) * ((var7 | var8) & ~(var7 & var8));
            var1285 = (int)-7386051188349774635L;
            var8 = -2055993352;
            var7 = var1285;
            var1285 = var7 + var8 - 2 * (var7 & var8);
            var8 = 1474873800;
            var7 = var1285;
            var1285 = (var7 | var8) - (var7 & var8);
            var8 = 1644223642;
            var7 = 1686014500;
            int var1405 = (var7 | var8) & ~(var7 & var8);
            var8 = 1985824613;
            var7 = var1405;
            var1405 = var7 + var8 - 2 * (var7 & var8);
            var8 = 1673752726;
            var7 = -26899520;
            var1405 = (var7 | var8) - (var7 & var8);
            var8 = -1650537696;
            var7 = var1405;
            return a(
               "Ù\uead2¸\uead5Í\ueaa7Ә\ueadaÍ\ueec7Æ\ueaa5Ê\uead2¿\uead7Í\ueaa5Ӗ\ueec7ç\uead9Ç\ueaa7Æ\uead6»\ueadeº\uead2Ә\uead8Æ\uead0Î\uead2Ӗ",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩講㑾aꟲꒅꁰꤋ絳蹆",
               var1079,
               var1190,
               var1285,
               (var7 | var8) & (~var7 | ~var8)
            );
         default:
            var8 = 1240937215;
            var7 = -1093137688;
            int var1018 = (var7 | var8) - (var7 & var8);
            var8 = 1433614869;
            var7 = var1018;
            var1018 = (var7 + var8 - 2 * (var7 & var8)) * (var7 + var8 - 2 * (var7 & var8));
            int var1064 = (int)2826575147792449225L;
            var8 = 1590277367;
            var7 = var1064;
            var1064 = (var7 | var8) - (var7 & var8);
            var8 = 991711885;
            var7 = var1064;
            var1064 = (var7 + var8 - 2 * (var7 & var8)) * (var7 + var8 - 2 * (var7 & var8));
            String var1169 = "vl";
            int var1170 = (int)-4182405153142128413L;
            var8 = -1744560342;
            var7 = var1170;
            int var1171 = (var7 | var8) - (var7 & var8);
            var8 = -93878880;
            var7 = var1171;
            int var1172 = var7 & ~var8 | ~var7 & var8;
            String var1262 = "vm";
            var8 = -821008146;
            var7 = -1571494369;
            int var1263 = (var7 | var8) & (~var7 | ~var8);
            var8 = 1320463151;
            var7 = var1263;
            int var1264 = var7 + var8 - 2 * (var7 & var8);
            int var1458 = (int)-4688079924640153248L;
            var8 = 717621000;
            var7 = var1458;
            var1458 = (var7 | var8) & (~var7 | ~var8);
            var8 = -1880553862;
            var7 = var1458;
            var1458 = (var7 | var8) & ~(var7 & var8);
            var1458 = (int)-7703418701317300697L;
            var8 = 1601336890;
            var7 = var1458;
            var1458 = (var7 | var8) & ~(var7 & var8);
            var8 = 814999581;
            var7 = var1458;
            var1458 = (var7 | var8) & ~(var7 & var8);
            var1458 = (int)-3638562948122778277L;
            var8 = -137878890;
            var7 = var1458;
            var1458 = var7 + var8 - 2 * (var7 & var8);
            var8 = 670451678;
            var7 = var1458;
            var1458 = (var7 | var8) & (~var7 | ~var8);
            var8 = -1068564845;
            var7 = -238550439;
            int var1392 = (var7 | var8) - (var7 & var8);
            var8 = 570594110;
            var7 = var1392;
            var1392 = (var7 | var8) & (~var7 | ~var8);
            var1458 = (int)3079460645489459635L;
            var8 = -1844462676;
            var7 = var1458;
            var1458 = (var7 | var8) & ~(var7 & var8);
            var8 = 594850540;
            var7 = var1458;
            var1458 = (var7 & ~var8 | ~var7 & var8) * (var7 & ~var8 | ~var7 & var8);
            var1458 = (int)-4023337584848957509L;
            var8 = -1987909109;
            var7 = var1458;
            var1458 = (var7 | var8) & ~(var7 & var8);
            var8 = -231536300;
            var7 = var1458;
            if (!var1.contains(
               a("Ҍ눜ҕ눐җ눀Ҍ", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩講㑾aꟲꒅꁰꤋ絳蹆", var1172, var1264, var1392, var7 & ~var8 | ~var7 & var8)
            )) {
               var8 = -1566654132;
               var7 = -2016050319;
               var1018 = var7 & ~var8 | ~var7 & var8;
               var8 = 76377055;
               var7 = var1018;
               var1018 = (var7 | var8) & (~var7 | ~var8);
               var8 = -1241969819;
               var7 = -1516775047;
               var1064 = var7 + var8 - 2 * (var7 & var8);
               var8 = 749612181;
               var7 = var1064;
               var8 = (var7 | var8) - (var7 & var8);
               var7 = var1018;
               var1018 = 2 * (var7 | var8) - (var7 ^ var8);
               var8 = -1603271670;
               var7 = 290093940;
               int var1173 = var7 & ~var8 | ~var7 & var8;
               var8 = -1321566349;
               var7 = var1173;
               int var1174 = var7 + var8 - 2 * (var7 & var8);
               var8 = -239464951;
               var7 = 1653435214;
               int var1265 = var7 + var8 - 2 * (var7 & var8);
               var8 = -1825086137;
               var7 = var1265;
               int var1266 = var7 + var8 - 2 * (var7 & var8);
               var8 = 888667501;
               var7 = -1137883332;
               int var1267 = var7 & ~var8 | ~var7 & var8;
               var8 = -1998931362;
               var7 = var1267;
               int var1268 = (var7 | var8) & ~(var7 & var8);
               int var1269 = (int)7288429311680389170L;
               var8 = 542121915;
               var7 = var1269;
               int var1270 = var7 & ~var8 | ~var7 & var8;
               var8 = -49201275;
               var7 = var1270;
               int var1271 = var7 & ~var8 | ~var7 & var8;
               int var1175 = (int)5015231842474188594L;
               var8 = -1459186310;
               var7 = var1175;
               int var1176 = (var7 | var8) & (~var7 | ~var8);
               var8 = 330338337;
               var7 = var1176;
               int var1177 = (var7 | var8) & (~var7 | ~var8);
               var1262 = "vn";
               var8 = 2134771059;
               var7 = 960581677;
               int var1273 = var7 + var8 - 2 * (var7 & var8);
               var8 = 1651900713;
               var7 = var1273;
               int var1274 = var7 & ~var8 | ~var7 & var8;
               String var1394 = "vo";
               var8 = -1895338555;
               var7 = -1105628897;
               var1392 = var7 + var8 - 2 * (var7 & var8);
               var8 = 1069140442;
               var7 = var1392;
               var1392 = var7 & ~var8 | ~var7 & var8;
               int var1518 = (int)112557796628213842L;
               var8 = 2000937633;
               var7 = var1518;
               var1518 = (var7 | var8) & ~(var7 & var8);
               var8 = 1274696434;
               var7 = var1518;
               var1518 = var7 + var8 - 2 * (var7 & var8);
               var1518 = (int)-7014247785117528036L;
               var8 = 1527833538;
               var7 = var1518;
               var1518 = (var7 | var8) & ~(var7 & var8);
               var8 = 711930847;
               var7 = var1518;
               var1518 = (var7 | var8) - (var7 & var8);
               var1458 = (int)-745350414825250205L;
               var8 = -436139653;
               var7 = var1458;
               var1458 = (var7 | var8) & ~(var7 & var8);
               var8 = -848940955;
               var7 = var1458;
               if (!var1.contains(
                  a("Ҭ䖅ҕ䖉җ䖙Ҍ", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩講㑾aꟲꒅꁰꤋ絳蹆", var1177, var1274, var1392, (var7 | var8) & (~var7 | ~var8))
               )) {
                  String var4 = var1;
                  StringBuilder var974 = new StringBuilder();
                  var1018 = (int)6225964446692164453L;
                  var8 = 547872193;
                  var7 = var1018;
                  var1018 = var7 & ~var8 | ~var7 & var8;
                  var8 = 722889481;
                  var7 = var1018;
                  var1018 = (var7 | var8) & (~var7 | ~var8);
                  var1064 = (int)-4120697651071479524L;
                  var8 = 570282572;
                  var7 = var1064;
                  var1064 = var7 + var8 - 2 * (var7 & var8);
                  var8 = 1589254645;
                  var7 = var1064;
                  var8 = var7 + var8 - 2 * (var7 & var8);
                  var7 = var1018;
                  var1018 = (var7 ^ var8) + 2 * (var7 & var8);
                  var1064 = (int)1702283042855794512L;
                  var8 = 1863125221;
                  var7 = var1064;
                  var1064 = var7 & ~var8 | ~var7 & var8;
                  var8 = -1657253104;
                  var7 = var1064;
                  var1064 = (var7 | var8) - (var7 & var8);
                  int var1183 = (int)-5094727561173983987L;
                  var8 = 2079376989;
                  var7 = var1183;
                  int var1184 = (var7 | var8) - (var7 & var8);
                  var8 = 550561073;
                  var7 = var1184;
                  int var1185 = var7 & ~var8 | ~var7 & var8;
                  int var1280 = (int)4538384264202216817L;
                  var8 = 13841133;
                  var7 = var1280;
                  int var1281 = (var7 | var8) & ~(var7 & var8);
                  var8 = -1637302920;
                  var7 = var1281;
                  var8 = (var7 | var8) & ~(var7 & var8);
                  var7 = var1185;
                  int var1186 = var7 - ~var8 - 1;
                  int var1187 = (int)4443393210831208709L;
                  var8 = 1336155106;
                  var7 = var1187;
                  int var1188 = (var7 | var8) - (var7 & var8);
                  var8 = 1225703566;
                  var7 = var1188;
                  int var1189 = (var7 | var8) & ~(var7 & var8);
                  var1262 = "vp";
                  var8 = 73806094;
                  var7 = -1373193298;
                  int var1283 = (var7 | var8) & (~var7 | ~var8);
                  var8 = -1907484637;
                  var7 = var1283;
                  int var1284 = (var7 | var8) & (~var7 | ~var8);
                  String var1402 = "vq";
                  var8 = -1931873700;
                  var7 = 231217420;
                  var1392 = var7 & ~var8 | ~var7 & var8;
                  var8 = -1965647383;
                  var7 = var1392;
                  var1392 = (var7 | var8) - (var7 & var8);
                  var8 = 2127492184;
                  var7 = -1949824656;
                  var1458 = var7 + var8 - 2 * (var7 & var8);
                  var8 = -2017323785;
                  var7 = var1458;
                  var1458 = (var7 | var8) & (~var7 | ~var8);
                  var8 = 149724977;
                  var7 = -1536896963;
                  var1518 = var7 + var8 - 2 * (var7 & var8);
                  var8 = 647476936;
                  var7 = var1518;
                  var8 = var7 & ~var8 | ~var7 & var8;
                  var7 = var1458;
                  var1458 = 2 * (var7 | var8) - (var7 ^ var8);
                  var8 = -963639811;
                  var7 = -102876165;
                  var1458 = (var7 | var8) - (var7 & var8);
                  var8 = 1057548175;
                  var7 = var1458;
                  return var974.append(
                        a(
                           "å̭Ә͛Į̀Ã̦¹͔Ә̧¸̠Ä̭Å̠º͔Ә̧¸̭Ä̠»̤Ә̢Æ̥¼̠ËܢӘ",
                           "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩講㑾aꟲꒅꁰꤋ絳蹆",
                           var1189,
                           var1284,
                           var1392,
                           (var7 | var8) - (var7 & var8)
                        )
                     )
                     .append(var4)
                     .toString();
               }
            }

            var10000 = (int)4055558930343174116L;
            var8 = -1252151695;
            var7 = var10000;
            var10000 = var7 & ~var8 | ~var7 & var8;
            var8 = 252115314;
            var7 = var10000;
            var10000 = var7 + var8 - 2 * (var7 & var8);
            var8 = 944795269;
            var7 = -718921622;
            var1018 = var7 & ~var8 | ~var7 & var8;
            var8 = -1564066320;
            var7 = var1018;
            var1018 = (var7 | var8) & ~(var7 & var8);
            var8 = -636584882;
            var7 = 1983696380;
            var1064 = (var7 | var8) - (var7 & var8);
            var8 = -1569210495;
            var7 = var1064;
            var8 = var7 & ~var8 | ~var7 & var8;
            var7 = var1018;
            var1018 = (var7 & ~var8) + (var8 & ~var7) + 2 * (var7 & var8);
            var1064 = (int)-2873228427229167657L;
            var8 = 638196149;
            var7 = var1064;
            var1064 = var7 & ~var8 | ~var7 & var8;
            var8 = 2123737851;
            var7 = var1064;
            var1064 = ((var7 | var8) & (~var7 | ~var8)) * ((var7 | var8) & (~var7 | ~var8));
            var8 = -2113793425;
            var7 = 1080120246;
            var1064 = (var7 | var8) - (var7 & var8);
            var8 = -1942774864;
            var7 = var1064;
            var1064 = var7 + var8 - 2 * (var7 & var8);
            var8 = 1539264648;
            var7 = 80212826;
            int var1178 = (var7 | var8) - (var7 & var8);
            var8 = 1280678794;
            var7 = var1178;
            int var1179 = var7 & ~var8 | ~var7 & var8;
            int var1180 = (int)793821434306596206L;
            var8 = -1395551173;
            var7 = var1180;
            int var1181 = (var7 | var8) & ~(var7 & var8);
            var8 = -237483734;
            var7 = var1181;
            int var1182 = (var7 | var8) & ~(var7 & var8);
            var8 = 739837537;
            var7 = -1422597266;
            int var1275 = (var7 | var8) & ~(var7 & var8);
            var8 = -1891199196;
            var7 = var1275;
            int var1276 = (var7 | var8) & (~var7 | ~var8);
            var1392 = (int)-7976969423957085676L;
            var8 = 513162715;
            var7 = var1392;
            var1392 = var7 + var8 - 2 * (var7 & var8);
            var8 = 1889135735;
            var7 = var1392;
            var8 = var7 & ~var8 | ~var7 & var8;
            var7 = var1276;
            int var1277 = var7 - ~var8 - 1;
            var8 = 1357961806;
            var7 = -1960018793;
            int var1278 = var7 + var8 - 2 * (var7 & var8);
            var8 = -91948232;
            var7 = var1278;
            int var1279 = (var7 | var8) - (var7 & var8);
            var8 = -1813291673;
            var7 = 1788032794;
            var1392 = (var7 | var8) & ~(var7 & var8);
            var8 = 1578251778;
            var7 = var1392;
            var1392 = (var7 & ~var8 | ~var7 & var8) * (var7 & ~var8 | ~var7 & var8);
            var8 = -488832857;
            var7 = -900286674;
            var1392 = var7 + var8 - 2 * (var7 & var8);
            var8 = 680861708;
            var7 = var1392;
            return a(
               "ç䵔Í䴦³䵜Í䴩Æ䤴Ê䵔Í䴨·䤴Æ䴢À䴠È䴩À䵛Ӗ䤴ç䵔Æ䴦Í䵔´䵖Í䤴À䴩º䴡¸䴩Í䵖ӕ䴫Æ䴠Â䴯¶䵓Í䴩À䴡Ӗ",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩講㑾aꟲꒅꁰꤋ絳蹆",
               var1064,
               var1182,
               var1279,
               var7 + var8 - 2 * (var7 & var8)
            );
      }
   }

   public List<ConfigEntry> a() {
      return this.g;
   }

   public void b() {
      this.g.clear();
      this.h.clear();
      this.q.clear();
      this.i.e();
   }

   public void c() {
      int var10000 = this.g.size();
      int var5 = 1108382780;
      int var4 = 4692135;
      int var10001 = (var4 | var5) - (var4 & var5);
      var5 = 1113001114;
      var4 = var10001;
      var5 = var4 & ~var5 | ~var4 & var5;
      var4 = var10000;

      for (int var1 = var4 - var5; var1 >= 0; var1--) {
         if (!this.g.get(var1).f()) {
            var10000 = (int)-3818221689425456210L;
            var5 = 1544811305;
            var4 = var10000;
            var10000 = (var4 | var5) & (~var4 | ~var5);
            var5 = 2013119852;
            var4 = var10000;
            var10000 = (var4 | var5) - (var4 & var5);
            var10001 = (int)12421108308774178L;
            var5 = 42653631;
            var4 = var10001;
            var10001 = (var4 | var5) & ~(var4 & var5);
            var5 = 320032586;
            var4 = var10001;
            var5 = var4 & ~var5 | ~var4 & var5;
            var4 = var10000;
            var10000 = 2 * (var4 | var5) - (var4 ^ var5);
            var10000 = (int)-2087444772700859665L;
            var5 = 384606033;
            var4 = var10000;
            var10000 = (var4 | var5) - (var4 & var5);
            var5 = -576804230;
            var4 = var10000;
            int var3 = (var4 | var5) & (~var4 | ~var5);
            a = var3;
            var10000 = (int)8664662322950069573L;
            var5 = -1402429210;
            var4 = var10000;
            var10000 = (var4 | var5) & ~(var4 & var5);
            var5 = 269819050;
            var4 = var10000;
            var10000 = (var4 + var5 - 2 * (var4 & var5)) * (var4 + var5 - 2 * (var4 & var5));
            var10000 = (int)3422609047604450056L;
            var5 = 988030146;
            var4 = var10000;
            var10000 = var4 + var5 - 2 * (var4 & var5);
            var5 = -84339988;
            var4 = var10000;
            if (((var4 | var5) & ~(var4 & var5)) <= a) {
               var5 = -220127322;
               var4 = -257803830;
               var10001 = var4 + var5 - 2 * (var4 & var5);
               var5 = 37955183;
               var4 = var10001;
               var10001 = (var4 | var5) & (~var4 | ~var5);
               var5 = 1887833204;
               var4 = 1370890459;
               var10001 = var4 + var5 - 2 * (var4 & var5);
               var5 = 556805280;
               var4 = var10001;
               var10001 = var4 + var5 - 2 * (var4 & var5);
               var10001 = (int)-886861727972530913L;
               var5 = -334993062;
               var4 = var10001;
               var10001 = (var4 | var5) & (~var4 | ~var5);
               var5 = -414806971;
               var4 = var10001;
               var10001 = (var4 | var5) & (~var4 | ~var5);
               var10001 = (int)-1894313324963918305L;
               var5 = -1867740634;
               var4 = var10001;
               var10001 = var4 & ~var5 | ~var4 & var5;
               var5 = -728759239;
               var4 = var10001;
               var10001 = (var4 | var5) & (~var4 | ~var5);
               var10001 = (int)2835310922282073260L;
               var5 = 58509306;
               var4 = var10001;
               var10001 = var4 & ~var5 | ~var4 & var5;
               var5 = -48972965;
               var4 = var10001;
               var10001 = (var4 | var5) & ~(var4 & var5);
               var5 = 17469616;
               var4 = 1945193169;
               var10000 = (var4 | var5) & (~var4 | ~var5);
               var5 = 1037610460;
               var4 = var10000;
               var3 = (var4 | var5) & (~var4 | ~var5);
            }
         } else {
            this.g.remove(var1);
            this.h.remove(var1);
         }
      }

      this.k();
   }

   public void a(Consumer<ConfigEntry> var1) {
      this.r = var1;
   }

   public void b(Consumer<ConfigEntry> var1) {
      this.s = var1;
   }

   public void a(ConfigListPanel.RenameCallback var1) {
      this.t = var1;
   }

   public void c(Consumer<ConfigEntry> var1) {
      this.u = var1;
   }

   private void d(String var1) {
      this.p = var1.toLowerCase().trim();
      this.k();
      this.i.e();
   }

   private void k() {
      if (!this.p.isEmpty()) {
         this.q = this.h.stream().filter(var1 -> {
            int var10;
            if (!var1.a().a().toLowerCase().contains(this.p) && !var1.a().b().toLowerCase().contains(this.p)) {
               int var8 = -59173611;
               int var5 = 732415717;
               var10 = (var5 | var8) - (var5 & var8);
               var8 = -673262608;
               var5 = var10;
               var10 = var5 & ~var8 | ~var5 & var8;
            } else {
               int var3 = -1226882977;
               int var2 = 1894245653;
               var10 = (var2 | var3) - (var2 & var3);
               var3 = -969366197;
               var2 = var10;
               var10 = (var2 | var3) & (~var2 | ~var3);
            }

            return pulse.Bool.from(var10);
         }).collect(Collectors.toList());
      } else {
         this.q = new ArrayList<>(this.h);
      }
   }

   public void a(MatrixStack var1, Renderer2D var2, float var3, float var4, float var5, float var6, int var7, int var8, float var9) {
      this.v = var3;
      this.w = var4;
      this.x = var5;
      this.y = var6;
      this.i.a();
      if (!this.q.isEmpty()) {
         int var22 = -1391106477;
         int var21 = 423684231;
         int var10001 = var21 + var22 - 2 * (var21 & var22);
         var22 = -1468353306;
         var21 = var10001;
         var10001 = var21 + var22 - 2 * (var21 & var22);
         int var10002 = (int)-9136915617726407045L;
         var22 = -1732188960;
         var21 = var10002;
         var10002 = (var21 | var22) & (~var21 | ~var22);
         var22 = 1309313649;
         var21 = var10002;
         var22 = var21 & ~var22 | ~var21 & var22;
         var21 = var10001;
         var10001 = 2 * (var21 | var22) - (var21 ^ var22);
         float var10 = var4 + -5.0F;
         var10001 = (int)320022111274067888L;
         var22 = 1990350296;
         var21 = var10001;
         var10001 = var21 & ~var22 | ~var21 & var22;
         var22 = -1327934971;
         var21 = var10001;
         var10001 = var21 & ~var22 | ~var21 & var22;
         var10002 = (int)465461344781408146L;
         var22 = -2044989485;
         var21 = var10002;
         var10002 = (var21 | var22) - (var21 & var22);
         var22 = -1839833342;
         var21 = var10002;
         var22 = (var21 | var22) & ~(var21 & var22);
         var21 = var10001;
         var10001 = (var21 | var22) + (var21 & var22);
         float var10000 = var6 - -5.0F;
         var22 = -957980141;
         var21 = 1497074439;
         var10001 = var21 & ~var22 | ~var21 & var22;
         var22 = -1993203315;
         var21 = var10001;
         var10001 = (var21 | var22) & (~var21 | ~var22);
         var10002 = (int)4440384869239835915L;
         var22 = -1675198844;
         var21 = var10002;
         var10002 = (var21 | var22) & ~(var21 & var22);
         var22 = 1023735454;
         var21 = var10002;
         var22 = var21 & ~var22 | ~var21 & var22;
         var21 = var10001;
         var10001 = (var21 | var22) + (var21 & var22);
         float var11 = var10000 - 4.0F;
         float var12 = this.l();
         int var128;
         if (!(var12 > var11)) {
            var22 = -1447152579;
            var21 = -931916856;
            int var127 = var21 & ~var22 | ~var21 & var22;
            var22 = 1640638453;
            var21 = var127;
            var128 = (var21 | var22) - (var21 & var22);
         } else {
            int var129 = (int)-7561916336476048733L;
            var22 = -945844401;
            var21 = var129;
            int var130 = (var21 | var22) & ~(var21 & var22);
            var22 = -662651411;
            var21 = var130;
            var128 = (var21 | var22) & (~var21 | ~var22);
         }

         int var13 = var128;
         if (var13 == 0) {
            this.i.e();
         }

         int var131 = (int)2700410889930473584L;
         var22 = 1098091617;
         var21 = var131;
         int var132 = (var21 | var22) & ~(var21 & var22);
         var22 = -527135723;
         var21 = var132;
         int var14 = (var21 | var22) & (~var21 | ~var22);
         ScissorStack var133 = var2.b();
         float var167 = var4 + var14;
         var22 = 1235731758;
         var21 = -508861693;
         int var10003 = var21 + var22 - 2 * (var21 & var22);
         var22 = -1289875794;
         var21 = var10003;
         var10003 = (var21 | var22) & (~var21 | ~var22);
         int var10004 = (int)5468467650652253021L;
         var22 = -1993902624;
         var21 = var10004;
         var10004 = (var21 | var22) - (var21 & var22);
         var22 = 1451370310;
         var21 = var10004;
         var22 = (var21 | var22) & (~var21 | ~var22);
         var21 = var10003;
         var10003 = 2 * (var21 | var22) - (var21 ^ var22);
         float var168 = var167 - 6.0F;
         var22 = 762604370;
         var21 = 1377447148;
         int var10006 = var21 & ~var22 | ~var21 & var22;
         var22 = 2137933756;
         var21 = var10006;
         float var175 = var6 - var14 * (var21 & ~var22 | ~var21 & var22);
         int var10005 = (int)1860682399993316689L;
         var22 = 1765392250;
         var21 = var10005;
         var10005 = (var21 | var22) - (var21 & var22);
         var22 = 230313294;
         var21 = var10005;
         var10005 = ((var21 | var22) & (~var21 | ~var22)) * ((var21 | var22) & (~var21 | ~var22));
         var133.a(var3, var168, var5, var175 + 6.0F, var1);
         float var15 = var10 - this.i.b();

         for (ConfigCard var17 : this.h) {
            var10001 = (int)-6661466626381812062L;
            var22 = 179949289;
            var21 = var10001;
            var10001 = (var21 | var22) & (~var21 | ~var22);
            var22 = -1072262492;
            var21 = var10001;
            var10001 = (var21 | var22) & (~var21 | ~var22);
            var10002 = (int)-5791412807621846707L;
            var22 = 1348903170;
            var21 = var10002;
            var10002 = var21 & ~var22 | ~var21 & var22;
            var22 = -152443909;
            var21 = var10002;
            var22 = (var21 | var22) & ~(var21 & var22);
            var21 = var10001;
            var10001 = (var21 & ~var22) + (var22 & ~var21) + 2 * (var21 & var22);
            float var18 = var15 + 4.0F;
            var22 = 866437895;
            var21 = -1513819184;
            var10001 = (var21 | var22) & (~var21 | ~var22);
            var22 = -654516932;
            var21 = var10001;
            var10001 = (var21 | var22) & (~var21 | ~var22);
            var22 = 1116982916;
            var21 = -1827266707;
            var10002 = var21 + var22 - 2 * (var21 & var22);
            var22 = -2028019843;
            var21 = var10002;
            var22 = (var21 | var22) - (var21 & var22);
            var21 = var10001;
            var10001 = 2 * (var21 | var22) - (var21 ^ var22);
            if (var18 + 36.5F >= var10 && var18 <= var10 + var11) {
               var17.a(var1, var2, var3 + 1.0F, var18, var5 - 2.0F, var7, var8, var9);
            }

            var10001 = (int)1599949179049440225L;
            var22 = -1152816977;
            var21 = var10001;
            var10001 = (var21 | var22) & (~var21 | ~var22);
            var22 = 1818502332;
            var21 = var10001;
            var10001 = (var21 + var22 - 2 * (var21 & var22)) * (var21 + var22 - 2 * (var21 & var22));
            var15 += 42.5F;
         }

         if (b) {
            var22 = -286495473;
            var21 = -656884100;
            int var134 = (var21 | var22) & (~var21 | ~var22);
            var22 = -696219812;
            var21 = var134;
            int var135 = var21 & ~var22 | ~var21 & var22;
            int var136 = (int)4557505462609567385L;
            var22 = -1442308203;
            var21 = var136;
            int var137 = (var21 | var22) & ~(var21 & var22);
            var22 = 1957960833;
            var21 = var137;
            int var20 = var21 + var22 - 2 * (var21 & var22);
            a = var20;
         }

         var2.b().a(var1);
         if (var13 == 0) {
            if (b) {
               var22 = -558558509;
               var21 = 1209607051;
               int var138 = (var21 | var22) & (~var21 | ~var22);
               var22 = -237012702;
               var21 = var138;
               int var139 = (var21 + var22 - 2 * (var21 & var22)) * (var21 + var22 - 2 * (var21 & var22));
               var22 = -514606718;
               var21 = 2026569306;
               int var140 = var21 & ~var22 | ~var21 & var22;
               var22 = 680194526;
               var21 = var140;
               int var24 = (var21 | var22) - (var21 & var22);
            }
         } else {
            var10000 = var3 + var5;
            String var161 = "vr";
            float var23 = var10000 + 18.0F;
            int var10010 = (int)1705956956879763326L;
            var22 = 2038560278;
            var21 = var10010;
            var10010 = (var21 | var22) - (var21 & var22);
            var22 = 695026024;
            var21 = var10010;
            this.i.a(var1, var2, var23, var10, var11, var12, var11, var7, var8, pulse.Bool.from(var21 + var22 - 2 * (var21 & var22)));
         }

         String var178 = "vs";
         this.j.a(var1, var2, var3, var4 + 1.5F, var5, var6, var9);
      } else {
         this.a(var1, var2, var3, var4, var5, var6);
      }
   }

   public void a(MatrixStack var1, Renderer2D var2, float var3, float var4, int var5, int var6) {
      this.l.a(var1, var2, var5, var6);
      this.m.a(var1, var2, var3, var4, var5, var6);
      this.n.a(var1, var2, var3, var4, var5, var6);
      this.o.a(var1, var2, var3, var4, var5, var6);
   }

   private void a(MatrixStack var1, Renderer2D var2, float var3, float var4, float var5, float var6) {
      int var10001 = (int)5644125298710644719L;
      int var13 = 1998268738;
      int var12 = var10001;
      var10001 = var12 & ~var13 | ~var12 & var13;
      var13 = 1584049827;
      var12 = var10001;
      FontRenderer var7 = FontManager.b[var12 + var13 - 2 * (var12 & var13)];
      String var106;
      if (!this.g.isEmpty()) {
         var13 = -71780365;
         var12 = 1146359911;
         int var10000 = var12 + var13 - 2 * (var12 & var13);
         var13 = 1300626676;
         var12 = var10000;
         int var104 = var12 & ~var13 | ~var12 & var13;
         var13 = 1319268552;
         var12 = 615045593;
         var10001 = (var12 | var13) & (~var12 | ~var13);
         var13 = 346671249;
         var12 = var10001;
         var13 = (var12 | var13) - (var12 & var13);
         var12 = var104;
         int var105 = (var12 & ~var13) + (var13 & ~var12) + 2 * (var12 & var13);
         var13 = -576019688;
         var12 = 545284185;
         var10001 = var12 + var13 - 2 * (var12 & var13);
         var13 = -47955307;
         var12 = var10001;
         var10001 = var12 + var13 - 2 * (var12 & var13);
         var13 = 301130517;
         var12 = 1616647920;
         int var10002 = var12 & ~var13 | ~var12 & var13;
         var13 = -260863123;
         var12 = var10002;
         var13 = var12 + var13 - 2 * (var12 & var13);
         var12 = var10001;
         var10001 = var12 - ~var13 - 1;
         String var120 = "vv";
         var10002 = (int)2008696335182161225L;
         var13 = -660847266;
         var12 = var10002;
         var10002 = var12 + var13 - 2 * (var12 & var13);
         var13 = 921041534;
         var12 = var10002;
         var10002 = var12 + var13 - 2 * (var12 & var13);
         int var10003 = (int)-7848622846406225899L;
         var13 = -178115656;
         var12 = var10003;
         var10003 = (var12 | var13) & ~(var12 & var13);
         var13 = 2047450139;
         var12 = var10003;
         var10003 = (var12 | var13) & ~(var12 & var13);
         int var10004 = (int)4085695188982874322L;
         var13 = 649142532;
         var12 = var10004;
         var10004 = var12 + var13 - 2 * (var12 & var13);
         var13 = 1970119420;
         var12 = var10004;
         var13 = var12 + var13 - 2 * (var12 & var13);
         var12 = var10003;
         var10003 = (var12 ^ var13) + 2 * (var12 & var13);
         var10003 = (int)-6065861775688953611L;
         var13 = 1680690337;
         var12 = var10003;
         var10003 = (var12 | var13) - (var12 & var13);
         var13 = -334473912;
         var12 = var10003;
         var10003 = (var12 | var13) & (~var12 | ~var13);
         String var137 = "vw";
         var13 = 1427018830;
         var12 = -852167440;
         var10004 = (var12 | var13) & (~var12 | ~var13);
         var13 = -1769719824;
         var12 = var10004;
         var10004 = var12 & ~var13 | ~var12 & var13;
         int var10005 = (int)-954274257712359986L;
         var13 = -2061354585;
         var12 = var10005;
         var10005 = (var12 | var13) & ~(var12 & var13);
         var13 = -1212883850;
         var12 = var10005;
         var10005 = ((var12 | var13) - (var12 & var13)) * ((var12 | var13) - (var12 & var13));
         var10005 = (int)-5798232188695533086L;
         var13 = -944670715;
         var12 = var10005;
         var10005 = (var12 | var13) & (~var12 | ~var13);
         var13 = -1272566562;
         var12 = var10005;
         var106 = a(
            "\uef0e䡻\uef54䡶\uef20䡽\ueb33䡾\uef26䱣\uef2e䡳\uef2a䡷\uef26䡾\uef2d",
            "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩講㑾aꟲꒅꁰꤋ絳蹆",
            var10002,
            var10003,
            var10004,
            var12 + var13 - 2 * (var12 & var13)
         );
      } else {
         var13 = -1272228036;
         var12 = -207214615;
         int var107 = (var12 | var13) & ~(var12 & var13);
         var13 = -477460968;
         var12 = var107;
         int var108 = (var12 | var13) & (~var12 | ~var13);
         var10001 = (int)3476753806580844935L;
         var13 = -1938255950;
         var12 = var10001;
         var10001 = (var12 | var13) & (~var12 | ~var13);
         var13 = 424862340;
         var12 = var10001;
         var13 = var12 + var13 - 2 * (var12 & var13);
         var12 = var108;
         int var109 = (var12 ^ var13) + 2 * (var12 & var13);
         var10001 = (int)352754175860758029L;
         var13 = -6042901;
         var12 = var10001;
         var10001 = (var12 | var13) & ~(var12 & var13);
         var13 = 663372895;
         var12 = var10001;
         var10001 = ((var12 | var13) - (var12 & var13)) * ((var12 | var13) - (var12 & var13));
         String var124 = "vt";
         var13 = 752540176;
         var12 = 417312172;
         int var125 = (var12 | var13) & ~(var12 & var13);
         var13 = 2052435413;
         var12 = var125;
         int var126 = var12 & ~var13 | ~var12 & var13;
         String var133 = "vu";
         var13 = 1324801372;
         var12 = 139498846;
         int var134 = (var12 | var13) & ~(var12 & var13);
         var13 = -1121239870;
         var12 = var134;
         int var135 = var12 + var13 - 2 * (var12 & var13);
         var13 = -1825901278;
         var12 = 35237273;
         int var140 = var12 & ~var13 | ~var12 & var13;
         var13 = 780142444;
         var12 = var140;
         var140 = (var12 & ~var13 | ~var12 & var13) * (var12 & ~var13 | ~var12 & var13);
         var13 = -1444110693;
         var12 = -2133456530;
         var140 = var12 + var13 - 2 * (var12 & var13);
         var13 = 830440211;
         var12 = var140;
         var140 = var12 + var13 - 2 * (var12 & var13);
         var13 = -41347246;
         var12 = 126868225;
         int var148 = var12 + var13 - 2 * (var12 & var13);
         var13 = 929791442;
         var12 = var148;
         var148 = var12 & ~var13 | ~var12 & var13;
         var13 = 323090216;
         var12 = -1612467424;
         var148 = (var12 | var13) & ~(var12 & var13);
         var13 = -1931203371;
         var12 = var148;
         var106 = a(
            "\uef30妇\uef51嶒\uef22巨\ueb33嶘\uef2d嶝\uef23妊\uef54工\uef2d妇\uef2e嶒\uef51巤\ueb33嶝\uef2d嶚\uef57嶟\uef20嶙\uef21妇\ueb29妏",
            "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩講㑾aꟲꒅꁰꤋ絳蹆",
            var126,
            var135,
            var140,
            (var12 | var13) - (var12 & var13)
         );
      }

      String var8 = var106;
      float var9 = var7.a(var8);
      float var10 = var3 + (var5 - var9) / 2.0F;
      float var11 = var4 + var6 / 2.0F - var7.b(var8) / 2.0F;
      var7.a(var8, var10, var11, pulse.Theme.b, var1);
   }

   private float l() {
      if (!this.q.isEmpty()) {
         float var10000 = this.q.size();
         int var10002 = (int)2802953058345995910L;
         int var2 = -281555022;
         int var1 = var10002;
         var10002 = (var1 | var2) & ~(var1 & var2);
         var2 = 1543045414;
         var1 = var10002;
         var10002 = (var1 | var2) - (var1 & var2);
         var10002 = (int)-8243719989454253123L;
         var2 = -738847954;
         var1 = var10002;
         var10002 = var1 + var2 - 2 * (var1 & var2);
         var2 = 322748561;
         var1 = var10002;
         var10002 = var1 + var2 - 2 * (var1 & var2);
         var10002 = (int)-4984897621518726953L;
         var2 = -277241049;
         var1 = var10002;
         var10002 = (var1 | var2) & (~var1 | ~var2);
         var2 = -724145167;
         var1 = var10002;
         var10002 = (var1 | var2) & ~(var1 & var2);
         var10000 *= 42.5F;
         var2 = -1147321335;
         var1 = 1396004515;
         int var10001 = var1 + var2 - 2 * (var1 & var2);
         var2 = -1192593441;
         var1 = var10001;
         var10001 = (var1 | var2) - (var1 & var2);
         var10002 = (int)-7143119417014217121L;
         var2 = -378552250;
         var1 = var10002;
         var10002 = (var1 | var2) - (var1 & var2);
         var2 = -2115073068;
         var1 = var10002;
         var2 = (var1 | var2) & (~var1 | ~var2);
         var1 = var10001;
         var10001 = (var1 ^ var2) + 2 * (var1 & var2);
         return var10000 - 6.0F;
      } else {
         return 0.0F;
      }
   }

   public boolean a(float var1, float var2, float var3, float var4, int var5, int var6) {
      if (!this.o.b()) {
         if (this.m.c()) {
            ConfigNameDialog var135 = this.m;
            float var154 = this.x;
            int var171 = (int)-7714510211378338957L;
            int var111 = 222246415;
            int var58 = var171;
            var171 = (var58 | var111) & (~var58 | ~var111);
            var111 = 261395837;
            var58 = var171;
            var171 = (var58 | var111) & ~(var58 & var111);
            var111 = -835919555;
            var58 = 2070176441;
            var171 = var58 & ~var111 | ~var58 & var111;
            var111 = -1253538931;
            var58 = var171;
            var171 = (var58 | var111) & ~(var58 & var111);
            var154 += 100.0F;
            float var161 = this.y;
            int var181 = (int)-5776397588440068427L;
            var111 = -320577966;
            var58 = var181;
            var181 = (var58 | var111) - (var58 & var111);
            var111 = -1753280266;
            var58 = var181;
            var181 = var58 + var111 - 2 * (var58 & var111);
            var181 = (int)-6328462102000856497L;
            var111 = -981739348;
            var58 = var181;
            var181 = var58 & ~var111 | ~var58 & var111;
            var111 = -1228125460;
            var58 = var181;
            var181 = var58 & ~var111 | ~var58 & var111;
            var111 = 103654527;
            var58 = -789843114;
            var181 = (var58 | var111) & (~var58 | ~var111);
            var111 = -691644634;
            var58 = var181;
            var181 = (var58 | var111) & ~(var58 & var111);
            var181 = (int)3159867234795095975L;
            var111 = 1109294411;
            var58 = var181;
            var181 = var58 & ~var111 | ~var58 & var111;
            var111 = 1631976163;
            var58 = var181;
            var181 = var58 & ~var111 | ~var58 & var111;
            return var135.a(var154, var161 + 100.0F, var5, var6);
         }

         if (!this.n.b()) {
            if (b) {
               int var123 = (int)-6383400611627118327L;
               int var86 = -640212224;
               int var33 = var123;
               var123 = var33 & ~var86 | ~var33 & var86;
               var86 = 1025733129;
               var33 = var123;
               var123 = (var33 | var86) & (~var33 | ~var86);
               var86 = -1056807892;
               var33 = 210428909;
               int var138 = var33 + var86 - 2 * (var33 & var86);
               var86 = -846690367;
               var33 = var138;
               var123 /= (var33 | var86) & ~(var33 & var86);
            }

            if (this.l.b() && this.l.a(var5, var6)) {
               int var133 = (int)1195302521094742371L;
               int var109 = -1943511292;
               int var56 = var133;
               var133 = var56 & ~var109 | ~var56 & var109;
               var109 = -724337050;
               var56 = var133;
               return pulse.Bool.from((var56 | var109) - (var56 & var109));
            }

            int var139 = (int)6635849026015143147L;
            int var90 = -1465887180;
            int var37 = var139;
            var139 = var37 & ~var90 | ~var37 & var90;
            var90 = -1278556655;
            var37 = var139;
            var139 = (var37 & ~var90 | ~var37 & var90) * (var37 & ~var90 | ~var37 & var90);
            float var7 = var2 + -5.0F;
            var139 = (int)-2945061938662096082L;
            var90 = 1338844885;
            var37 = var139;
            var139 = (var37 | var90) & (~var37 | ~var90);
            var90 = 1074661246;
            var37 = var139;
            var139 = (var37 | var90) - (var37 & var90);
            var90 = -262879441;
            var37 = 293886885;
            int var160 = (var37 | var90) & ~(var37 & var90);
            var90 = -192879856;
            var37 = var160;
            var90 = var37 + var90 - 2 * (var37 & var90);
            var37 = var139;
            var139 = var37 - ~var90 - 1;
            float var127 = var4 - -5.0F;
            var90 = -309245664;
            var37 = 1271970398;
            var139 = var37 + var90 - 2 * (var37 & var90);
            var90 = 1860752318;
            var37 = var139;
            var139 = (var37 | var90) & ~(var37 & var90);
            float var8 = var127 - 4.0F;
            float var9 = this.l();
            if (var9 > var8) {
               var127 = var1 + var3;
               var90 = -13205179;
               var37 = -2036047831;
               var139 = (var37 | var90) & (~var37 | ~var90);
               var90 = -1819636820;
               var37 = var139;
               var139 = ((var37 | var90) & ~(var37 & var90)) * ((var37 | var90) & ~(var37 & var90));
               float var10 = var127 + 18.0F;
               if (this.i.a(var10, var7, var8, var9, var8, var5, var6)) {
                  int var131 = (int)8025144586516079936L;
                  var90 = 1022033996;
                  var37 = var131;
                  int var132 = (var37 | var90) - (var37 & var90);
                  var90 = 1117496589;
                  var37 = var132;
                  return pulse.Bool.from(var37 & (var90 ^ -1) | (var37 ^ -1) & var90);
               }
            }

            if (GuiInput.a(var1, var2, var3, var4, var5, var6)) {
               float var16 = var7 - this.i.b();

               for (ConfigCard var12 : this.h) {
                  var139 = (int)-499252706420156429L;
                  var90 = 123111093;
                  var37 = var139;
                  var139 = (var37 | var90) & ~(var37 & var90);
                  var90 = 1978315829;
                  var37 = var139;
                  var139 = (var37 & ~var90 | ~var37 & var90) * (var37 & ~var90 | ~var37 & var90);
                  float var13 = var16 + 4.0F;
                  if (var12.a(var1 + 1.0F, var13, var3 - 2.0F, var5, var6)) {
                     var90 = 1417149630;
                     var37 = 466152545;
                     int var129 = (var37 | var90) & (~var37 | ~var90);
                     var90 = 1337921758;
                     var37 = var129;
                     return pulse.Bool.from((var37 | var90) - (var37 & var90));
                  }

                  String var153 = "vx";
                  var16 += 42.5F;
               }
            }

            var90 = 368553477;
            var37 = 756885233;
            int var130 = (var37 | var90) & (~var37 | ~var90);
            var90 = 954894580;
            var37 = var130;
            return pulse.Bool.from(var37 & (var90 ^ -1) | (var37 ^ -1) & var90);
         } else {
            ConfigBoundsDialog var10000 = this.n;
            float var136 = this.x;
            int var76 = 1589887164;
            int var23 = 1040298833;
            int var166 = (var23 | var76) & (~var23 | ~var76);
            var76 = 1623356389;
            var23 = var166;
            var166 = var23 & ~var76 | ~var23 & var76;
            var166 = (int)6579193851568713129L;
            var76 = -889247243;
            var23 = var166;
            var166 = var23 & ~var76 | ~var23 & var76;
            var76 = -439303086;
            var23 = var166;
            var166 = (var23 | var76) & ~(var23 & var76);
            var136 += 100.0F;
            float var159 = this.y;
            var76 = -1394841207;
            var23 = -1721358944;
            int var10004 = (var23 | var76) & ~(var23 & var76);
            var76 = 901401656;
            var23 = var10004;
            var10004 = var23 & ~var76 | ~var23 & var76;
            var76 = -1436397948;
            var23 = -741208256;
            var10004 = var23 & ~var76 | ~var23 & var76;
            var76 = 2041594325;
            var23 = var10004;
            var10004 = (var23 | var76) & (~var23 | ~var76);
            var76 = 2008681519;
            var23 = 919805388;
            var10004 = var23 & ~var76 | ~var23 & var76;
            var76 = 1097404912;
            var23 = var10004;
            var10004 = (var23 | var76) - (var23 & var76);
            return var10000.a(var136, var159 + 100.0F, var5, var6);
         }
      } else {
         int var10002 = (int)-3921798972777677903L;
         int var15 = 1453716955;
         int var14 = var10002;
         var10002 = (var14 | var15) - (var14 & var15);
         var15 = -2010687376;
         var14 = var10002;
         var10002 = (var14 | var15) & (~var14 | ~var15);
         int var10003 = (int)3417090505693267576L;
         var15 = -1957417011;
         var14 = var10003;
         var10003 = (var14 | var15) & ~(var14 & var15);
         var15 = 73769560;
         var14 = var10003;
         var15 = var14 + var15 - 2 * (var14 & var15);
         var14 = var10002;
         var10002 = 2 * (var14 | var15) - (var14 ^ var15);
         float var10001 = this.x + 100.0F;
         var10003 = (int)-1171724278764647925L;
         var15 = -365340204;
         var14 = var10003;
         var10003 = (var14 | var15) - (var14 & var15);
         var15 = -1263068756;
         var14 = var10003;
         var10003 = (var14 & ~var15 | ~var14 & var15) * (var14 & ~var15 | ~var14 & var15);
         return this.o.a(var10001, this.y + 100.0F, var5, var6);
      }
   }

   public void a(int var1, int var2) {
      this.i.d();
      if (this.o.b()) {
         this.o.a(var1, var2);
      }
   }

   public void a(int var1, int var2, double var3, double var5) {
      if (!this.o.b()) {
         if (this.i.c()) {
            int var10 = -95611806;
            int var9 = 1324868556;
            int var10001 = (var9 | var10) & ~(var9 & var10);
            var10 = -440488436;
            var9 = var10001;
            var10001 = var9 + var10 - 2 * (var9 & var10);
            var10 = 690170077;
            var9 = 1029913284;
            int var10002 = (var9 | var10) - (var9 & var10);
            var10 = 1136534192;
            var9 = var10002;
            var10 = (var9 | var10) & (~var9 | ~var10);
            var9 = var10001;
            var10001 = var9 - ~var10 - 1;
            float var10000 = this.y - -5.0F;
            var10 = 309408336;
            var9 = 159864209;
            var10001 = (var9 | var10) - (var9 & var10);
            var10 = 1663148635;
            var9 = var10001;
            var10001 = var9 + var10 - 2 * (var9 & var10);
            float var7 = var10000 - 4.0F;
            float var8 = this.l();
            this.i.a(var2, var8, var7);
         }
      } else {
         this.o.a(var1, var2, var3, var5);
      }
   }

   public void a(float var1, int var2, int var3) {
      if (!this.o.b()) {
         if (this.l.b()) {
            int var10000 = (int)7607708509980167240L;
            int var9 = -967243795;
            int var8 = var10000;
            var10000 = var8 & ~var9 | ~var8 & var9;
            var9 = -1814668172;
            var8 = var10000;
            var10000 = var8 & ~var9 | ~var8 & var9;
            var9 = -1500532866;
            var8 = 266012264;
            int var10001 = var8 & ~var9 | ~var8 & var9;
            var9 = 1845470058;
            var8 = var10001;
            var9 = var8 & ~var9 | ~var8 & var9;
            var8 = var10000;
            var10000 = (var8 ^ var9) + 2 * (var8 & var9);
            var10000 = (int)-7253093222270630914L;
            var9 = -312536499;
            var8 = var10000;
            var10000 = (var8 | var9) - (var8 & var9);
            var9 = 583368290;
            var8 = var10000;
            int var7 = (var8 | var9) - (var8 & var9);
            a = var7;
            var10000 = (int)-9120284694826082310L;
            var9 = 1436651534;
            var8 = var10000;
            var10000 = (var8 | var9) & ~(var8 & var9);
            var9 = 1285038747;
            var8 = var10000;
            var10000 = var8 + var9 - 2 * (var8 & var9);
            var10000 = (int)8304948071782721535L;
            var9 = -478666077;
            var8 = var10000;
            var10000 = var8 & ~var9 | ~var8 & var9;
            var9 = -1907469565;
            var8 = var10000;
            if (((var8 | var9) & (~var8 | ~var9)) < a) {
               throw new IllegalAccessError();
            }
         } else if (!this.m.c() && !this.n.b() && !this.m()) {
            if (GuiInput.a(this.v, this.w, this.x, this.y, var2, var3)) {
               int var87 = (int)8734434101309851744L;
               int var54 = 1821245509;
               int var21 = var87;
               var87 = (var21 | var54) - (var21 & var54);
               var54 = -709246359;
               var21 = var87;
               var87 = (var21 | var54) - (var21 & var54);
               var87 = (int)7455325908917169042L;
               var54 = 2104686459;
               var21 = var87;
               var87 = (var21 | var54) & (~var21 | ~var54);
               var54 = 1969946822;
               var21 = var87;
               int var10 = var21 & ~var54 | ~var21 & var54;
               a = var10;
               var54 = 622367953;
               var21 = -1438419625;
               var87 = (var21 | var54) & (~var21 | ~var54);
               var54 = -259113692;
               var21 = var87;
               var87 = (var21 | var54) & (~var21 | ~var54);
               int var103 = (int)-6048719764951220791L;
               var54 = -1776562346;
               var21 = var103;
               var103 = var21 + var54 - 2 * (var21 & var54);
               var54 = 837757903;
               var21 = var103;
               var54 = var21 + var54 - 2 * (var21 & var54);
               var21 = var87;
               var87 = var21 - ~var54 - 1;
               var87 = (int)6600633712632819217L;
               var54 = 801168132;
               var21 = var87;
               var87 = (var21 | var54) - (var21 & var54);
               var54 = -1932120522;
               var21 = var87;
               if (((var21 | var54) & (~var21 | ~var54)) < a) {
                  var87 = (int)-4300740393172003241L;
                  var54 = -2043988114;
                  var21 = var87;
                  var87 = var21 + var54 - 2 * (var21 & var54);
                  var54 = -1746656967;
                  var21 = var87;
                  var87 = (var21 | var54) & (~var21 | ~var54);
                  var54 = 1734545410;
                  var21 = -2098607689;
                  var103 = (var21 | var54) & (~var21 | ~var54);
                  var54 = -443885131;
                  var21 = var103;
                  var87 /= (var21 | var54) - (var21 & var54);
               }

               float var101 = this.y;
               int var10002 = (int)-378172279826943567L;
               var54 = -742436775;
               var21 = var10002;
               var10002 = var21 + var54 - 2 * (var21 & var54);
               var54 = 2126291433;
               var21 = var10002;
               var10002 = var21 + var54 - 2 * (var21 & var54);
               var54 = 2001360996;
               var21 = -656122117;
               var10002 = var21 + var54 - 2 * (var21 & var54);
               var54 = -1347549548;
               var21 = var10002;
               var10002 = (var21 | var54) & (~var21 | ~var54);
               var10002 = (int)3511811505310761894L;
               var54 = 1594463015;
               var21 = var10002;
               var10002 = var21 & ~var54 | ~var21 & var54;
               var54 = 1931743360;
               var21 = var10002;
               var10002 = (var21 | var54) & (~var21 | ~var54);
               float var102 = var101 - -5.0F;
               var54 = 2087421736;
               var21 = -1747902039;
               var103 = (var21 | var54) & (~var21 | ~var54);
               var54 = 1471297400;
               var21 = var103;
               var103 = (var21 + var54 - 2 * (var21 & var54)) * (var21 + var54 - 2 * (var21 & var54));
               float var4 = var102 - 4.0F;
               float var5 = this.l();
               this.i.a(var1, var5, var4);
               return;
            }

            return;
         }
      } else {
         this.o.a(var1, var2, var3);
      }
   }

   public boolean a(int var1, int var2, int var3) {
      for (ConfigCard var5 : this.h) {
         if (var5.d()) {
            return var5.a(var1, var2, var3);
         }
      }

      if (!this.o.b()) {
         int var10000 = (int)2098532682558843157L;
         int var9 = 574347313;
         int var8 = var10000;
         var10000 = var8 + var9 - 2 * (var8 & var9);
         var9 = 1394899787;
         var8 = var10000;
         var10000 = (var8 | var9) & (~var8 | ~var9);
         var9 = -2023088135;
         var8 = 848373574;
         int var10001 = var8 + var9 - 2 * (var8 & var9);
         var9 = -124193604;
         var8 = var10001;
         var9 = var8 + var9 - 2 * (var8 & var9);
         var8 = var10000;
         var10000 = (var8 & ~var9) + (var9 & ~var8) + 2 * (var8 & var9);
         var10000 = (int)-8945225836838511363L;
         var9 = 1886599680;
         var8 = var10000;
         var10000 = (var8 | var9) & (~var8 | ~var9);
         var9 = -1700135099;
         var8 = var10000;
         int var7 = var8 & ~var9 | ~var8 & var9;
         a = var7;
         var10001 = (int)-2981276082478633901L;
         var9 = 1949014512;
         var8 = var10001;
         var10001 = (var8 | var9) & ~(var8 & var9);
         var9 = -1168788048;
         var8 = var10001;
         var10001 = (var8 | var9) - (var8 & var9);
         var9 = 18149329;
         var8 = 748344577;
         var10001 = (var8 | var9) - (var8 & var9);
         var9 = 764295891;
         var8 = var10001;
         var10001 = (var8 | var9) & (~var8 | ~var9);
         var9 = 1130806479;
         var8 = -1010009885;
         var10001 = var8 + var9 - 2 * (var8 & var9);
         var9 = -2136292290;
         var8 = var10001;
         var10001 = (var8 | var9) & ~(var8 & var9);
         var9 = 1178455027;
         var8 = -1121599662;
         var10001 = (var8 | var9) & ~(var8 & var9);
         var9 = -82283358;
         var8 = var10001;
         var10001 = var8 & ~var9 | ~var8 & var9;
         var9 = -838644064;
         var8 = -1649296433;
         var10001 = var8 + var9 - 2 * (var8 & var9);
         var9 = 1404237159;
         var8 = var10001;
         var10001 = var8 & ~var9 | ~var8 & var9;
         var10000 = (int)-7572069113352280092L;
         var9 = 1472273628;
         var8 = var10000;
         var10000 = var8 & ~var9 | ~var8 & var9;
         var9 = -1281410444;
         var8 = var10000;
         if ((var8 | var9) - (var8 & var9) < a) {
            var9 = -604065273;
            var8 = 277560200;
            var10000 = (var8 | var9) & ~(var8 & var9);
            var9 = 334697408;
            var8 = var10000;
            var10000 = var8 & ~var9 | ~var8 & var9;
            var10001 = (int)944895256837566040L;
            var9 = -754014355;
            var8 = var10001;
            var10001 = (var8 | var9) & (~var8 | ~var9);
            var9 = 1062482730;
            var8 = var10001;
            var9 = (var8 | var9) & ~(var8 & var9);
            var8 = var10000;
            var10000 = (var8 & ~var9) + (var9 & ~var8) + 2 * (var8 & var9);
            var10000 = (int)4862055692441295544L;
            var9 = -287449760;
            var8 = var10000;
            var10000 = (var8 | var9) - (var8 & var9);
            var9 = -1449481324;
            var8 = var10000;
            var7 = (var8 | var9) - (var8 & var9);
            a = var7;
         }

         if (!this.m.c()) {
            if (!this.n.b()) {
               String var94 = "vy";
               var9 = -643355067;
               var8 = -1429510902;
               var10000 = (var8 | var9) - (var8 & var9);
               var9 = 2097595162;
               var8 = var10000;
               var7 = var8 & ~var9 | ~var8 & var9;
               a = var7;
               String var96 = "vz";
               var10000 = (int)-6584303313220341499L;
               var9 = 878575791;
               var8 = var10000;
               var10000 = (var8 | var9) & (~var8 | ~var9);
               var9 = -1000678305;
               var8 = var10000;
               if (((var8 | var9) & ~(var8 & var9)) < a) {
                  var9 = -2032007685;
                  var8 = -1136531832;
                  var10000 = var8 & ~var9 | ~var8 & var9;
                  var9 = 983819123;
                  var8 = var10000;
                  var10000 = (var8 | var9) & ~(var8 & var9);
                  var10001 = (int)-534196743614384795L;
                  var9 = -1193785557;
                  var8 = var10001;
                  var10001 = (var8 | var9) & (~var8 | ~var9);
                  var9 = -529927602;
                  var8 = var10001;
                  var10000 /= (var8 | var9) & (~var8 | ~var9);
               }

               var10000 = (int)6170398079055270503L;
               var9 = -1810406169;
               var8 = var10000;
               var10000 = var8 + var9 - 2 * (var8 & var9);
               var9 = -859769216;
               var8 = var10000;
               return pulse.Bool.from(var8 + var9 - 2 * (var8 & var9));
            } else {
               return this.n.a(var1, var2, var3);
            }
         } else {
            return this.m.a(var1, var2, var3);
         }
      } else {
         return this.o.a(var1, var2, var3);
      }
   }

   public boolean a(char var1, int var2) {
      for (ConfigCard var4 : this.h) {
         if (var4.d()) {
            return var4.a(var1, var2);
         }
      }

      if (!this.o.b()) {
         if (!this.m.c()) {
            if (!this.n.b()) {
               int var10000 = (int)7041939428185378889L;
               int var6 = 562533403;
               int var5 = var10000;
               var10000 = var5 + var6 - 2 * (var5 & var6);
               var6 = -2092366766;
               var5 = var10000;
               return pulse.Bool.from((var5 | var6) - (var5 & var6));
            } else {
               return this.n.a(var1, var2);
            }
         } else {
            return this.m.a(var1, var2);
         }
      } else {
         return this.o.a(var1, var2);
      }
   }

   public boolean d() {
      int var9;
      if (!this.m.e() && !this.n.e() && !this.o.d() && !this.m()) {
         var9 = (int)-6485517938482113269L;
         int var7 = 1079514118;
         int var4 = var9;
         var9 = (var4 | var7) & ~(var4 & var7);
         var7 = -1274969843;
         var4 = var9;
         var9 = (var4 | var7) - (var4 & var7);
      } else {
         int var2 = 2080547231;
         int var1 = -1344386523;
         var9 = (var1 | var2) & ~(var1 & var2);
         var2 = -740496453;
         var1 = var9;
         var9 = (var1 | var2) & (~var1 | ~var2);
      }

      return pulse.Bool.from(var9);
   }

   public boolean e() {
      int var10;
      if (!this.l.b() && !this.m.c() && !this.n.b() && !this.o.b()) {
         var10 = (int)7821250136185444858L;
         int var7 = -1601079181;
         int var4 = var10;
         var10 = (var4 | var7) - (var4 & var7);
         var7 = -1034002039;
         var4 = var10;
         var10 = var4 & ~var7 | ~var4 & var7;
      } else {
         var10 = (int)-2517281972529282522L;
         int var2 = -133350931;
         int var1 = var10;
         var10 = (var1 | var2) & ~(var1 & var2);
         var2 = -337052726;
         var1 = var10;
         var10 = (var1 | var2) - (var1 & var2);
      }

      return pulse.Bool.from(var10);
   }

   private boolean m() {
      for (ConfigCard var2 : this.h) {
         if (var2.d()) {
            int var4 = 1507438384;
            int var3 = 1653078826;
            int var10000 = var3 + var4 - 2 * (var3 & var4);
            var4 = 996037659;
            var3 = var10000;
            return pulse.Bool.from(var3 & (var4 ^ -1) | (var3 ^ -1) & var4);
         }
      }

      int var9 = 1488844546;
      int var6 = -945024408;
      int var11 = var6 & ~var9 | ~var6 & var9;
      var9 = -1626217110;
      var6 = var11;
      return pulse.Bool.from((var6 | var9) & (var6 & var9 ^ -1));
   }

   public boolean f() {
      return this.g.isEmpty();
   }

   public void g() {
      this.m.a();
   }

   public void h() {
      if (this.l.b()) {
         this.l.a();
      }

      if (this.m.c()) {
         this.m.b();
      }

      if (!this.n.b()) {
         int var6 = -2007576988;
         int var5 = 753544569;
         int var10000 = (var5 | var6) - (var5 & var6);
         var6 = -89042537;
         var5 = var10000;
         var10000 = var5 + var6 - 2 * (var5 & var6);
         var10000 = (int)-8310391336244276335L;
         var6 = 1043836820;
         var5 = var10000;
         var10000 = var5 & ~var6 | ~var5 & var6;
         var6 = 1508434292;
         var5 = var10000;
         int var4 = (var5 | var6) & ~(var5 & var6);
         a = var4;
         var6 = -1126473734;
         var5 = -835031230;
         var10000 = (var5 | var6) - (var5 & var6);
         var6 = 2055232129;
         var5 = var10000;
         var10000 = (var5 | var6) - (var5 & var6);
         var6 = 1533429493;
         var5 = 826355309;
         int var10001 = var5 & ~var6 | ~var5 & var6;
         var6 = -453002237;
         var5 = var10001;
         var6 = (var5 | var6) & (~var5 | ~var6);
         var5 = var10000;
         var10000 = (var5 | var6) + (var5 & var6);
         var6 = -1360989115;
         var5 = -717711858;
         var10000 = var5 & ~var6 | ~var5 & var6;
         var6 = 695637283;
         var5 = var10000;
         if ((var5 & ~var6 | ~var5 & var6) < a) {
            throw new RuntimeException();
         }
      } else {
         this.n.a();
      }

      if (this.o.b()) {
         this.o.a();
      }

      for (ConfigCard var2 : this.h) {
         if (!var2.d()) {
            if (b) {
               int var52 = (int)8830724009968166164L;
               int var36 = 1796231918;
               int var18 = var52;
               var52 = (var18 | var36) - (var18 & var36);
               var36 = 1085945847;
               var18 = var52;
               var52 = var18 & ~var36 | ~var18 & var36;
               var52 = (int)-3003036869901298582L;
               var36 = 861485961;
               var18 = var52;
               var52 = (var18 | var36) & (~var18 | ~var36);
               var36 = -1720127512;
               var18 = var52;
               var52 = var18 & ~var36 | ~var18 & var36;
               var36 = -323114103;
               var18 = -503588146;
               int var51 = (var18 | var36) - (var18 & var36);
               var36 = -1352147637;
               var18 = var51;
               int var7 = var18 + var36 - 2 * (var18 & var36);
               a = var7;
            }
         } else {
            int var58 = (int)4695591038334003141L;
            int var42 = 185284825;
            int var24 = var58;
            var58 = var24 & ~var42 | ~var24 & var42;
            var42 = -1049829604;
            var24 = var58;
            var2.a(pulse.Bool.from(var24 + var42 - 2 * (var24 & var42)));
         }
      }
   }

   public static String a(String var0, String var1, int var2, int var3, int var4, int var5) {
      char[] var6 = var1.toCharArray();
      char[] var7 = new char[var6.length];
      int var10000 = (int)3086860227897289717L;
      int var20 = 1087850846;
      int var19 = var10000;
      var10000 = (var19 | var20) - (var19 & var20);
      var20 = -70376799;
      var19 = var10000;
      char[] var307 = new char[var19 & ~var20 | ~var19 & var20];
      var20 = 1749914785;
      var19 = 53298552;
      int var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1801507289;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = 10942788;
      var19 = 1823772664;
      int var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1813134990;
      var19 = var10003;
      var307[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      var20 = -1777746305;
      var19 = -1887943303;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = 426900231;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = 549162485;
      var19 = -630168547;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = -87307667;
      var19 = var10003;
      var307[var10002] = (char)((var19 | var20) - (var19 & var20));
      var10002 = (int)-4885582447151428298L;
      var20 = 224246457;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = 972715917;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var10003 = (int)-551916034140932115L;
      var20 = 1743215437;
      var19 = var10003;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = -523727066;
      var19 = var10003;
      var307[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      var10002 = (int)-5423340815800335580L;
      var20 = -725347864;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = -828632369;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = -885770994;
      var19 = 566648300;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = 1531279751;
      var19 = var10003;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = 1133200661;
      var19 = -1592106046;
      int var10004 = (var19 | var20) & ~(var19 & var20);
      var20 = -1410805100;
      var19 = var10004;
      var20 = (var19 | var20) & ~(var19 & var20);
      var19 = var10003;
      var10003 = 2 * (var19 | var20) - (var19 ^ var20);
      var20 = -1197981170;
      var19 = -1172021723;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = 45909048;
      var19 = var10003;
      var307[var10002] = (char)((var19 | var20) & ~(var19 & var20));
      var10002 = (int)-2515057511564146877L;
      var20 = -1174262466;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = 2072554105;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1753748783;
      var19 = 413805278;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = -502721569;
      var19 = var10003;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = -100357714;
      var19 = -733471448;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = 776742307;
      var19 = var10003;
      var307[var10002] = (char)((var19 | var20) & ~(var19 & var20));
      var10002 = (int)8774361055286854836L;
      var20 = -149882705;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = -797574114;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var10003 = (int)-2533391316223514916L;
      var20 = 258377132;
      var19 = var10003;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = 941025010;
      var19 = var10003;
      var307[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      var20 = -726192952;
      var19 = -603029310;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = 146385932;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var10003 = (int)990528962965878226L;
      var20 = -1844501580;
      var19 = var10003;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = -1822548107;
      var19 = var10003;
      var307[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      var10002 = (int)8329818193710175784L;
      var20 = 830647661;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = -1104348350;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var10003 = (int)-4736383585831268020L;
      var20 = -17205177;
      var19 = var10003;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = -529523415;
      var19 = var10003;
      var307[var10002] = (char)((var19 | var20) & ~(var19 & var20));
      var10002 = (int)-419374143062576622L;
      var20 = -1204858564;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = -286645466;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = -467018254;
      var19 = 322447826;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = -149816205;
      var19 = var10003;
      var307[var10002] = (char)((var19 | var20) & ~(var19 & var20));
      var10002 = (int)8005900308598995380L;
      var20 = -1375382469;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = 1329524102;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var10003 = (int)5560004084078469465L;
      var20 = 1692618550;
      var19 = var10003;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = -103503541;
      var19 = var10003;
      var307[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      char[] var8 = var307;
      var10000 = (int)-2148657732154585090L;
      var20 = -2113419575;
      var19 = var10000;
      var10000 = (var19 | var20) & ~(var19 & var20);
      var20 = -1191163587;
      var19 = var10000;
      char[] var310 = new char[(var19 | var20) & ~(var19 & var20)];
      var10002 = (int)6899278943518293522L;
      var20 = 119888841;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = 764945883;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var10003 = (int)-4471849431327164593L;
      var20 = 1657833396;
      var19 = var10003;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = -161023781;
      var19 = var10003;
      var310[var10002] = (char)((var19 | var20) - (var19 & var20));
      var20 = 499185037;
      var19 = -1584455919;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = -1135613283;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var10003 = (int)-6265359030964055740L;
      var20 = 1086496500;
      var19 = var10003;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = -1477748026;
      var19 = var10003;
      var10003 = (var19 | var20) - (var19 & var20);
      var10003 = (int)3414260389215180491L;
      var20 = 629046879;
      var19 = var10003;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = 547712151;
      var19 = var10003;
      var310[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      var10002 = (int)-2712122641797948983L;
      var20 = 1863601328;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = -884828805;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var10004 = (int)3859144536580012447L;
      var20 = -1789417296;
      var19 = var10004;
      var10004 = (var19 | var20) & ~(var19 & var20);
      var20 = -219541185;
      var19 = var10004;
      var10004 = (var19 | var20) & (~var19 | ~var20);
      var20 = -1302517914;
      var19 = 1195006947;
      var10004 = var19 + var20 - 2 * (var19 & var20);
      var20 = -177767281;
      var19 = var10004;
      var10004 = var19 + var20 - 2 * (var19 & var20);
      var20 = -748183057;
      var19 = 736205661;
      var10004 = var19 + var20 - 2 * (var19 & var20);
      var20 = -125420871;
      var19 = var10004;
      var10004 = (var19 | var20) & ~(var19 & var20);
      var20 = 183100431;
      var19 = -1870505097;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = -1704249301;
      var19 = var10003;
      var310[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      var20 = -1261642680;
      var19 = 886006690;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = -2147237911;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = 1244565810;
      var19 = -1941478681;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = -966145065;
      var19 = var10003;
      var310[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      var20 = -650238740;
      var19 = -1808485314;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = 1292538070;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1413805143;
      var19 = -1612945159;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = -879188754;
      var19 = var10003;
      var310[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      var20 = 625090574;
      var19 = -589518587;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = -107050738;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var10003 = (int)-2659288713332057019L;
      var20 = 1415627961;
      var19 = var10003;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = 1657004136;
      var19 = var10003;
      var310[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      var10002 = (int)-7935533601935299304L;
      var20 = -1242792236;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = 211030986;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = -1494669066;
      var19 = -1566136407;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = -1956943572;
      var19 = var10003;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = -1138317977;
      var19 = -1893037524;
      var10004 = var19 & ~var20 | ~var19 & var20;
      var20 = 1354166958;
      var19 = var10004;
      var20 = var19 & ~var20 | ~var19 & var20;
      var19 = var10003;
      var10003 = (var19 & ~var20) + (var20 & ~var19) + 2 * (var19 & var20);
      var20 = -1843220533;
      var19 = -2040599922;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = 343720572;
      var19 = var10003;
      var310[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      var10002 = (int)2067379784056504447L;
      var20 = -1123917390;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1904304586;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = -95467317;
      var19 = 248676878;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = -190981379;
      var19 = var10003;
      var310[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      var20 = -1619371446;
      var19 = -1106948202;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = 561976788;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      String var429 = "wg";
      var10003 = (int)5410092920093561885L;
      var20 = -28632282;
      var19 = var10003;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = 776195135;
      var19 = var10003;
      var310[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      var20 = -1839172943;
      var19 = 936006577;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = -1515577079;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var10003 = (int)3891794493712116059L;
      var20 = 1821502866;
      var19 = var10003;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = -1676019718;
      var19 = var10003;
      var310[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      char[] var9 = var310;
      var20 = 1100470947;
      var19 = -52386533;
      var10000 = (var19 | var20) & ~(var19 & var20);
      var20 = -1116241992;
      var19 = var10000;

      for (int var10 = (var19 | var20) & ~(var19 & var20); var10 < var6.length; var10++) {
         var20 = 636629534;
         var19 = -1298434346;
         int var10001 = (var19 | var20) - (var19 & var20);
         var20 = -1754708787;
         var19 = var10001;
         var10001 = var19 + var20 - 2 * (var19 & var20);
         var20 = 1924976398;
         var19 = -43216967;
         var10001 = (var19 | var20) & ~(var19 & var20);
         var20 = -1882177345;
         var19 = var10001;
         var10001 = var19 + var20 - 2 * (var19 & var20);
         var10000 = (int)6286195646769704117L;
         var20 = -1039106100;
         var19 = var10000;
         var10000 = (var19 | var20) & (~var19 | ~var20);
         var20 = 1673820684;
         var19 = var10000;
         int var18 = (var19 | var20) - (var19 & var20);
         a = var18;
         var20 = -1028803428;
         var19 = 418639396;
         var10001 = var19 + var20 - 2 * (var19 & var20);
         var20 = -631350606;
         var19 = var10001;
         var10001 = (var19 | var20) & (~var19 | ~var20);
         var20 = 2033190652;
         var19 = 180713654;
         var10001 = var19 & ~var20 | ~var19 & var20;
         var20 = 1945468504;
         var19 = var10001;
         var10001 = var19 + var20 - 2 * (var19 & var20);
         var20 = 2017445013;
         var19 = 1004565732;
         var10001 = (var19 | var20) - (var19 & var20);
         var20 = 1138733172;
         var19 = var10001;
         var10001 = var19 & ~var20 | ~var19 & var20;
         var10001 = (int)-3001348491211492671L;
         var20 = -330601078;
         var19 = var10001;
         var10001 = (var19 | var20) & ~(var19 & var20);
         var20 = 442785604;
         var19 = var10001;
         var10001 = var19 & ~var20 | ~var19 & var20;
         var20 = 2006659250;
         var19 = -650751124;
         var10000 = var19 + var20 - 2 * (var19 & var20);
         var20 = -743450881;
         var19 = var10000;
         if (((var19 | var20) & (~var19 | ~var20)) < a) {
            throw new RuntimeException();
         }

         char var389 = var6[var10];
         char var286 = var8[var10 % var8.length];
         char var145 = var389;
         var7[var10] = (char)(var145 & ~var286 | ~var145 & var286);
      }

      char[] var21 = new char[var7.length];
      var10000 = (int)-8705342989133882377L;
      var20 = 2088780920;
      var19 = var10000;
      var10000 = (var19 | var20) & (~var19 | ~var20);
      var20 = -532897905;
      var19 = var10000;
      int var11 = var19 & ~var20 | ~var19 & var20;
      if (b) {
         var20 = 893215702;
         var19 = 2095133719;
         int var333 = (var19 | var20) & ~(var19 & var20);
         var20 = 1239177170;
         var19 = var333;
         var333 = var19 + var20 - 2 * (var19 & var20);
         var20 = -1187460364;
         var19 = 451642752;
         var333 = (var19 | var20) - (var19 & var20);
         var20 = -1546432668;
         var19 = var333;
         var333 = (var19 | var20) - (var19 & var20);
         var10000 = (int)7531120085344303210L;
         var20 = 893382037;
         var19 = var10000;
         var10000 = (var19 | var20) - (var19 & var20);
         var20 = -1354003085;
         var19 = var10000;
         int var23 = (var19 | var20) & ~(var19 & var20);
         a = var23;
      }

      while (var11 < var6.length) {
         char var390 = var7[var11];
         char var295 = var9[var11 % var9.length];
         char var154 = var390;
         var21[var11] = (char)((var154 | var295) - (var154 & var295));
         var11++;
      }

      String var22 = new String(var21);
      int var12 = var22.hashCode();
      var20 = var5;
      var19 = var3;
      var10000 = (var19 ^ var20) - 2 * (~var19 & var20);
      var20 = var2;
      var19 = var10000;
      int var13 = (var19 ^ var20) - 2 * (~var19 & var20);
      char[] var14 = var0.toCharArray();
      char[] var15 = new char[var14.length];
      var20 = 1008259455;
      var19 = 2036267570;
      var10000 = (var19 | var20) & ~(var19 & var20);
      var20 = 1162226509;
      var19 = var10000;

      for (int var16 = (var19 | var20) - (var19 & var20); var16 < var15.length; var16++) {
         int var337 = (int)-5536208283968477750L;
         var20 = -650546118;
         var19 = var337;
         var337 = (var19 | var20) & ~(var19 & var20);
         var20 = 239243762;
         var19 = var337;
         switch (var16 % ((var19 | var20) - (var19 & var20))) {
            case 0:
               var20 = var12;
               var19 = var13;
               var10002 = (var19 | var20) & (~var19 | ~var20);
               char var305 = var14[var16];
               var19 = var10002;
               var15[var16] = (char)((var19 | var305) & ~(var19 & var305));
               break;
            case 1:
               var20 = var13;
               var19 = var5;
               var10002 = (var19 | var20) - (var19 & var20);
               char var303 = var14[var16];
               var19 = var10002;
               var15[var16] = (char)((var19 | var303) & (~var19 | ~var303));
         }
      }

      return new String(var15);
   }

   @FunctionalInterface
   public interface RenameCallback {
      void onRenamed(ConfigEntry var1, String var2, String var3);

      static String a(String var0, String var1, int var2, int var3, int var4, int var5) {
         char[] var6 = var1.toCharArray();
         char[] var7 = new char[var6.length];
         int var10000 = (int)-3133512021379412265L;
         int var18 = 1744091709;
         int var17 = var10000;
         var10000 = (var17 | var18) & (~var17 | ~var18);
         var18 = 1303852256;
         var17 = var10000;
         char[] var264 = new char[(var17 | var18) - (var17 & var18)];
         int var10002 = (int)3041352917256316581L;
         var18 = -768409999;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = -1617176364;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         int var10003 = (int)8156188590804363133L;
         var18 = -610945074;
         var17 = var10003;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = -2140596095;
         var17 = var10003;
         var264[var10002] = (char)((var17 | var18) - (var17 & var18));
         var10002 = (int)-7317880720275769986L;
         var18 = 763047687;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = -1707910536;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = 1524113738;
         var17 = 1789346391;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = 813645976;
         var17 = var10003;
         var264[var10002] = (char)((var17 | var18) - (var17 & var18));
         var10002 = (int)5350339948095338333L;
         var18 = -881034715;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = 716279162;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = -2141042021;
         var17 = -646426399;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = 1494891004;
         var17 = var10003;
         var264[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var18 = 2115643457;
         var17 = 633945744;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = 1540560594;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var10003 = (int)-2023837983829910069L;
         var18 = -206278740;
         var17 = var10003;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = 291637744;
         var17 = var10003;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = -976833377;
         var17 = -844438069;
         int var10004 = (var17 | var18) & (~var17 | ~var18);
         var18 = -954584126;
         var17 = var10004;
         var18 = var17 & ~var18 | ~var17 & var18;
         var17 = var10003;
         var10003 = (var17 & ~var18) + (var18 & ~var17) + 2 * (var17 & var18);
         var18 = -338041347;
         var17 = 1132449886;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = -1465471568;
         var17 = var10003;
         var264[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         var10002 = (int)511429031253421079L;
         var18 = -2061416830;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = 42986129;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = -1183723708;
         var17 = -858163365;
         var10004 = var17 & ~var18 | ~var17 & var18;
         var18 = 1973991448;
         var17 = var10004;
         var10004 = (var17 | var18) - (var17 & var18);
         var10004 = (int)-2195931022995641037L;
         var18 = 712782422;
         var17 = var10004;
         var10004 = (var17 | var18) & (~var17 | ~var18);
         var18 = 1432985447;
         var17 = var10004;
         var10004 = (var17 | var18) & ~(var17 & var18);
         var10004 = (int)8544967114791685498L;
         var18 = -568297580;
         var17 = var10004;
         var10004 = var17 & ~var18 | ~var17 & var18;
         var18 = -2001863940;
         var17 = var10004;
         var10004 = (var17 | var18) & (~var17 | ~var18);
         var18 = -1138358220;
         var17 = 587873281;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = -1624464112;
         var17 = var10003;
         var264[var10002] = (char)((var17 | var18) - (var17 & var18));
         var18 = -7874264;
         var17 = 237034955;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = -240712474;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var10003 = (int)-3859175061094927669L;
         var18 = 584149298;
         var17 = var10003;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = -1347232133;
         var17 = var10003;
         var264[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var18 = 1861282759;
         var17 = -697872744;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = -1198021287;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = -29032512;
         var17 = 237872907;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = -261533224;
         var17 = var10003;
         var264[var10002] = (char)((var17 | var18) & ~(var17 & var18));
         var18 = 434391358;
         var17 = 774973855;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = 936730790;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var10003 = (int)-7363580704293604949L;
         var18 = -1722658628;
         var17 = var10003;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = -1661283019;
         var17 = var10003;
         var264[var10002] = (char)((var17 | var18) & ~(var17 & var18));
         var18 = -360877418;
         var17 = -1418126318;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = 1090809484;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = 1236788414;
         var17 = 221903383;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = 1150162682;
         var17 = var10003;
         var264[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var10002 = (int)7894730168220414694L;
         var18 = -1323473269;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = 994776164;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = -947958797;
         var17 = -1386826597;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = 1781135436;
         var17 = var10003;
         var264[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         char[] var8 = var264;
         var10000 = (int)8995156162998211265L;
         var18 = 615620908;
         var17 = var10000;
         var10000 = (var17 | var18) - (var17 & var18);
         var18 = 371012583;
         var17 = var10000;
         char[] var267 = new char[var17 + var18 - 2 * (var17 & var18)];
         var18 = 1412766800;
         var17 = -1691456117;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = -820284965;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var10003 = (int)-5967632857647354533L;
         var18 = -1697665283;
         var17 = var10003;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = 859114374;
         var17 = var10003;
         var267[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         var10002 = (int)-220047348980369876L;
         var18 = 175312385;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = 271661100;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var10003 = (int)5093061256057054553L;
         var18 = 1182465480;
         var17 = var10003;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = -11988237;
         var17 = var10003;
         var10003 = (var17 & ~var18 | ~var17 & var18) * (var17 & ~var18 | ~var17 & var18);
         var18 = 321353367;
         var17 = -540143033;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = -857087789;
         var17 = var10003;
         var267[var10002] = (char)((var17 | var18) & ~(var17 & var18));
         var10002 = (int)7879584409460090805L;
         var18 = 1008423795;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = -74943292;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var10004 = (int)5199512568421499817L;
         var18 = 1084533594;
         var17 = var10004;
         var10004 = (var17 | var18) - (var17 & var18);
         var18 = -1118443275;
         var17 = var10004;
         var10004 = (var17 | var18) & ~(var17 & var18);
         var10004 = (int)-5440712889128685687L;
         var18 = 1344334739;
         var17 = var10004;
         var10004 = (var17 | var18) - (var17 & var18);
         var18 = 1186497546;
         var17 = var10004;
         var10004 = (var17 | var18) & (~var17 | ~var18);
         var18 = -153113907;
         var17 = -485832590;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = 366339564;
         var17 = var10003;
         var267[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var18 = 1224541316;
         var17 = 1439673365;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = 489859218;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var10003 = (int)5451040162957676645L;
         var18 = -481589410;
         var17 = var10003;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = 1513189177;
         var17 = var10003;
         var267[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         var10002 = (int)7118802743896743135L;
         var18 = -1659205599;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = 1963988218;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = 1199403156;
         var17 = 231366665;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = 1253517533;
         var17 = var10003;
         var267[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var18 = 2061419390;
         var17 = 1873115515;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = 360430080;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = 766051537;
         var17 = 1813211728;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = 1102730773;
         var17 = var10003;
         var267[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var18 = 1484172882;
         var17 = 1366122058;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = 152825886;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         String var352 = "cao";
         var18 = -1047967455;
         var17 = 1215050062;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = -1981415594;
         var17 = var10003;
         var267[var10002] = (char)((var17 | var18) - (var17 & var18));
         var18 = 648089449;
         var17 = 505782485;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = 948219835;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = -390618740;
         var17 = 1981045524;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = -1633424736;
         var17 = var10003;
         var267[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         var18 = 1133269438;
         var17 = -6594112;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = -1139330954;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = -1628482811;
         var17 = -1207706549;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = 1122924172;
         var17 = var10003;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = 1634397554;
         var17 = -2105530183;
         var10004 = var17 + var18 - 2 * (var17 & var18);
         var18 = 1838958439;
         var17 = var10004;
         var18 = var17 + var18 - 2 * (var17 & var18);
         var17 = var10003;
         var10003 = 2 * (var17 | var18) - (var17 ^ var18);
         var10003 = (int)5826860072853023775L;
         var18 = 78085233;
         var17 = var10003;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = 988304234;
         var17 = var10003;
         var267[var10002] = (char)((var17 | var18) - (var17 & var18));
         var10002 = (int)7786313938194954798L;
         var18 = 262009392;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = -464156649;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = -823693463;
         var17 = -1055144812;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = 268212430;
         var17 = var10003;
         var267[var10002] = (char)((var17 | var18) & ~(var17 & var18));
         char[] var9 = var267;
         var10000 = (int)7175257641931357225L;
         var18 = 1952786380;
         var17 = var10000;
         var10000 = (var17 | var18) & (~var17 | ~var18);
         var18 = 1398578149;
         var17 = var10000;

         for (int var10 = (var17 | var18) & (~var17 | ~var18); var10 < var6.length; var10++) {
            char var321 = var6[var10];
            char var249 = var8[var10 % var8.length];
            char var128 = var321;
            var7[var10] = (char)((var128 | var249) - (var128 & var249));
         }

         char[] var19 = new char[var7.length];
         var18 = 1400050590;
         var17 = 1451561433;
         var10000 = (var17 | var18) & (~var17 | ~var18);
         var18 = 100008519;
         var17 = var10000;

         for (int var11 = (var17 | var18) & (~var17 | ~var18); var11 < var6.length; var11++) {
            char var322 = var7[var11];
            char var252 = var9[var11 % var9.length];
            char var131 = var322;
            var19[var11] = (char)((var131 | var252) & ~(var131 & var252));
         }

         String var20 = new String(var19);
         int var12 = var20.hashCode();
         var18 = var5;
         var17 = var3;
         var10000 = 2 * (var17 & ~var18) - (var17 ^ var18);
         var18 = var2;
         var17 = var10000;
         int var13 = (var17 & ~var18) - (~var17 & var18);
         char[] var14 = var0.toCharArray();
         char[] var15 = new char[var14.length];
         var18 = 1174721717;
         var17 = 497741335;
         var10000 = (var17 | var18) - (var17 & var18);
         var18 = 1538144930;
         var17 = var10000;

         for (int var16 = (var17 | var18) & ~(var17 & var18); var16 < var15.length; var16++) {
            var18 = -1694232187;
            var17 = -258553185;
            int var10001 = (var17 | var18) - (var17 & var18);
            var18 = 1804786456;
            var17 = var10001;
            switch (var16 % ((var17 | var18) & ~(var17 & var18))) {
               case 0:
                  var18 = var12;
                  var17 = var13;
                  var10002 = (var17 | var18) & ~(var17 & var18);
                  char var262 = var14[var16];
                  var17 = var10002;
                  var15[var16] = (char)((var17 | var262) - (var17 & var262));
                  break;
               case 1:
                  var18 = var13;
                  var17 = var5;
                  var10002 = (var17 | var18) - (var17 & var18);
                  char var260 = var14[var16];
                  var17 = var10002;
                  var15[var16] = (char)((var17 | var260) - (var17 & var260));
            }
         }

         return new String(var15);
      }
   }
}
