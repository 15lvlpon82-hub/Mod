package pulse;



import pulse.module.ClientModule;
import pulse.module.ModuleInfo;
import pulse.module.ModuleCategory;
import pulse.settings.KeySetting;
import pulse.settings.SliderSetting;
import meteordevelopment.orbit.EventHandler;

@ModuleInfo(a = "Zoom", b = "Плавный зум с регулировкой колесиком мыши", c = ModuleCategory.UTILITIES)
public class Zoom extends ClientModule {
   private final KeySetting g;
   private final SliderSetting h;
   private double i;
   private double j;
   private double k;
   private double l;
   private boolean m;
   private boolean n;
   private int o;
   public static volatile boolean a;
   public static volatile double b = 70.0;
   public static int e;
   public static boolean f;

   public Zoom() {
      int var10003 = (int)4273848236767108003L;
      int var2 = 1294092316;
      int var1 = var10003;
      var10003 = (var1 | var2) & (~var1 | ~var2);
      var2 = -185860458;
      var1 = var10003;
      var10003 = (var1 | var2) & ~(var1 & var2);
      int var10004 = (int)-7689003747481862984L;
      var2 = 71702411;
      var1 = var10004;
      var10004 = var1 & ~var2 | ~var1 & var2;
      var2 = 498950102;
      var1 = var10004;
      var2 = (var1 | var2) & ~(var1 & var2);
      var1 = var10003;
      var10003 = (var1 | var2) + (var1 & var2);
      String var163 = "bud";
      int var10005 = (int)-4020044652774314016L;
      var2 = 1448322471;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = 90757813;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var2 = 159040525;
      var1 = -132315077;
      int var10006 = var1 & ~var2 | ~var1 & var2;
      var2 = -1087905581;
      var1 = var10006;
      var2 = var1 & ~var2 | ~var1 & var2;
      var1 = var10005;
      var10005 = 2 * (var1 | var2) - (var1 ^ var2);
      var10005 = (int)-1187971194778314011L;
      var2 = 1854378740;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var2 = -1681281021;
      var1 = var10005;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var2 = -560295884;
      var1 = 1832773534;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var2 = 272580848;
      var1 = var10006;
      var10006 = ((var1 | var2) & ~(var1 & var2)) * ((var1 | var2) & ~(var1 & var2));
      var2 = 239938025;
      var1 = -1325489269;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var2 = -307906618;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      int var10007 = (int)487323277738663414L;
      var2 = 932686463;
      var1 = var10007;
      var10007 = (var1 | var2) & ~(var1 & var2);
      var2 = 559531281;
      var1 = var10007;
      var10007 = ((var1 | var2) - (var1 & var2)) * ((var1 | var2) - (var1 & var2));
      var2 = 606416490;
      var1 = 1936948427;
      var10007 = (var1 | var2) - (var1 & var2);
      var2 = 1381943752;
      var1 = var10007;
      var10007 = (var1 | var2) & (~var1 | ~var2);
      var2 = -251481674;
      var1 = 1211960881;
      int var10008 = (var1 | var2) & ~(var1 & var2);
      var2 = -917217499;
      var1 = var10008;
      var10008 = var1 & ~var2 | ~var1 & var2;
      int var10009 = (int)-7514890739589283180L;
      var2 = -2042218483;
      var1 = var10009;
      var10009 = (var1 | var2) - (var1 & var2);
      var2 = 1499294076;
      var1 = var10009;
      var2 = (var1 | var2) & ~(var1 & var2);
      var1 = var10008;
      var10008 = (var1 ^ var2) + 2 * (var1 & var2);
      var10008 = (int)1070932890626313302L;
      var2 = -1916627964;
      var1 = var10008;
      var10008 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1312007310;
      var1 = var10008;
      String var157 = c("빺蕯빞蕭빚蕢멀蕥븣蕮빐", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7dc꒺ꁾ꤈絛蹅⑾謢㑻w", var10005, var10006, var10007, (var1 | var2) & (~var1 | ~var2));
      var10004 = (int)5549865222344339282L;
      var2 = -1953918302;
      var1 = var10004;
      var10004 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1655274931;
      var1 = var10004;
      this.g = new KeySetting(var157, (var1 | var2) & ~(var1 & var2));
      var2 = -267348327;
      var1 = -1037767087;
      var10003 = (var1 | var2) & (~var1 | ~var2);
      var2 = 671035581;
      var1 = var10003;
      var10003 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1984399588;
      var1 = -384731321;
      var10004 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1473883015;
      var1 = var10004;
      var2 = (var1 | var2) - (var1 & var2);
      var1 = var10003;
      var10003 = (var1 ^ var2) + 2 * (var1 & var2);
      var2 = 459470260;
      var1 = 182451535;
      var10004 = (var1 | var2) & ~(var1 & var2);
      var2 = 569352215;
      var1 = var10004;
      var10004 = ((var1 | var2) & (~var1 | ~var2)) * ((var1 | var2) & (~var1 | ~var2));
      String var176 = "bue";
      var10005 = (int)4842152654114124567L;
      var2 = 712925140;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = -330820399;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var10006 = (int)-1462014821893800830L;
      var2 = -1654466000;
      var1 = var10006;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var2 = 550465248;
      var1 = var10006;
      var10006 = ((var1 | var2) & (~var1 | ~var2)) * ((var1 | var2) & (~var1 | ~var2));
      var2 = -1039284653;
      var1 = -382297662;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var2 = 2016112549;
      var1 = var10006;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var10007 = (int)-4520168314926621963L;
      var2 = 2067369043;
      var1 = var10007;
      var10007 = (var1 | var2) - (var1 & var2);
      var2 = 1753286887;
      var1 = var10007;
      var10007 = (var1 | var2) & (~var1 | ~var2);
      var10007 = (int)-4812040676892226495L;
      var2 = 1297796290;
      var1 = var10007;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var2 = -1308607221;
      var1 = var10007;
      var10007 = (var1 | var2) & (~var1 | ~var2);
      var10008 = (int)-3105309828016589087L;
      var2 = 1464431617;
      var1 = var10008;
      var10008 = var1 & ~var2 | ~var1 & var2;
      var2 = -991482360;
      var1 = var10008;
      var10008 = var1 + var2 - 2 * (var1 & var2);
      var2 = 345714456;
      var1 = -1509344875;
      var10009 = (var1 | var2) & ~(var1 & var2);
      var2 = 1521357507;
      var1 = var10009;
      var2 = (var1 | var2) - (var1 & var2);
      var1 = var10008;
      var10008 = 2 * (var1 | var2) - (var1 ^ var2);
      var10008 = (int)5033455577912947157L;
      var2 = -845791024;
      var1 = var10008;
      var10008 = var1 & ~var2 | ~var1 & var2;
      var2 = -809794379;
      var1 = var10008;
      String var161 = c("빁玀빐玂븢珼빒玉빙矢먦瞍먶", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7dc꒺ꁾ꤈絛蹅⑾謢㑻w", var10005, var10006, var10007, var1 + var2 - 2 * (var1 & var2));
      String var169 = "buf";
      String var189 = "bug";
      this.h = new SliderSetting(var161, 50.0F, 2.0F, 120.0F, 1.0F);
      var2 = 2067215539;
      var1 = 1458475029;
      int var10002 = (var1 | var2) & ~(var1 & var2);
      var2 = 769238184;
      var1 = var10002;
      var10002 = (var1 | var2) - (var1 & var2);
      var10002 = (int)6929913334606242036L;
      var2 = 1634807235;
      var1 = var10002;
      var10002 = (var1 | var2) - (var1 & var2);
      var2 = 1208192312;
      var1 = var10002;
      var10002 = (var1 | var2) & (~var1 | ~var2);
      var2 = 2136911814;
      var1 = 1838905100;
      var10002 = (var1 | var2) - (var1 & var2);
      var2 = 314955975;
      var1 = var10002;
      var10002 = (var1 | var2) & ~(var1 & var2);
      var2 = -1812963328;
      var1 = -2077433544;
      var10002 = var1 + var2 - 2 * (var1 & var2);
      var2 = 400326969;
      var1 = var10002;
      var10002 = (var1 | var2) - (var1 & var2);
      this.i = 70.0;
      String var10001 = "buh";
      this.j = 70.0;
      var10001 = "bui";
      this.k = 70.0;
      var2 = -2124536945;
      var1 = 196764226;
      int var140 = (var1 | var2) & (~var1 | ~var2);
      var2 = -6277175;
      var1 = var140;
      int var141 = ((var1 | var2) - (var1 & var2)) * ((var1 | var2) - (var1 & var2));
      this.l = 0.5;
      var2 = 46640949;
      var1 = 2046599151;
      int var142 = (var1 | var2) & ~(var1 & var2);
      var2 = 2067476698;
      var1 = var142;
      this.m = pulse.Bool.from((var1 | var2) - (var1 & var2));
      var2 = 141483387;
      var1 = -1610691534;
      int var143 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1752166071;
      var1 = var143;
      this.n = pulse.Bool.from((var1 | var2) & ~(var1 & var2));
      int var144 = (int)-3579569789995287683L;
      var2 = 684435126;
      var1 = var144;
      int var145 = (var1 | var2) & ~(var1 & var2);
      var2 = -497558069;
      var1 = var145;
      this.o = (var1 | var2) & ~(var1 & var2);
   }

   @Override
   public void e() {
      super.e();
      if (c.options != null) {
         this.i = ((Integer)c.options.getFov().getValue()).intValue();
         this.j = this.i;
         this.k = this.i;
         this.l = (Double)c.options.getMouseSensitivity().getValue();
      }
   }

   @Override
   public void f() {
      this.p();
      super.f();
   }

   private void n() {
      if (c.options != null && c.player != null && c.world != null) {
         if (!this.n) {
            this.i = ((Integer)c.options.getFov().getValue()).intValue();
            this.l = (Double)c.options.getMouseSensitivity().getValue();
            int var2 = -1346153481;
            int var1 = -1638513491;
            int var10001 = var1 + var2 - 2 * (var1 & var2);
            var2 = 831854427;
            var1 = var10001;
            this.n = pulse.Bool.from(var1 & ~var2 | ~var1 & var2);
         }

         int var12 = 1333923410;
         int var4 = 149025347;
         int var10002 = (var4 | var12) - (var4 & var12);
         var12 = -642920008;
         var4 = var10002;
         var10002 = (var4 | var12) & ~(var4 & var12);
         int var10003 = (int)5180236165898853179L;
         var12 = -1806338051;
         var4 = var10003;
         var10003 = (var4 | var12) & (~var4 | ~var12);
         var12 = 7163338;
         var4 = var10003;
         var12 = var4 & ~var12 | ~var4 & var12;
         var4 = var10002;
         var10002 = (var4 | var12) + (var4 & var12);
         this.j = Math.min(this.i, Math.max(2.0, this.h.a()));
         this.k = ((Integer)c.options.getFov().getValue()).intValue();
         this.o = c.player.getInventory().selectedSlot;
         var12 = 1569114462;
         var4 = 799814439;
         int var19 = var4 + var12 - 2 * (var4 & var12);
         var12 = 1915419256;
         var4 = var19;
         this.m = pulse.Bool.from((var4 | var12) - (var4 & var12));
      }
   }

   private void o() {
      if (c.options != null) {
         int var10001 = (int)-1848609433514308419L;
         int var2 = 1129707825;
         int var1 = var10001;
         var10001 = var1 + var2 - 2 * (var1 & var2);
         var2 = -106662516;
         var1 = var10001;
         this.m = pulse.Bool.from(var1 + var2 - 2 * (var1 & var2));
         this.j = this.i;
         c.options.getMouseSensitivity().setValue(this.l);
         var10001 = (int)-6074624288449698962L;
         var2 = -1981339601;
         var1 = var10001;
         var10001 = (var1 | var2) - (var1 & var2);
         var2 = 2132396865;
         var1 = var10001;
         c.options.smoothCameraEnabled = pulse.Bool.from((var1 | var2) - (var1 & var2));
      }
   }

   private void p() {
      if (c.options != null) {
         c.options.getMouseSensitivity().setValue(this.l);
         int var2 = -1984293656;
         int var1 = 1674102773;
         int var10001 = var1 + var2 - 2 * (var1 & var2);
         var2 = -361573603;
         var1 = var10001;
         c.options.smoothCameraEnabled = pulse.Bool.from(var1 + var2 - 2 * (var1 & var2));
      }

      int var11 = -100699296;
      int var4 = 1329190641;
      int var18 = var4 & ~var11 | ~var4 & var11;
      var11 = -1228495471;
      var4 = var18;
      this.m = pulse.Bool.from((var4 | var11) & ~(var4 & var11));
      var11 = 1787139782;
      var4 = 1831647164;
      var18 = (var4 | var11) - (var4 & var11);
      var11 = 128524666;
      var4 = var18;
      this.n = pulse.Bool.from((var4 | var11) - (var4 & var11));
      int var10000 = (int)1942328997750662329L;
      var11 = 289205292;
      var4 = var10000;
      var10000 = var4 & ~var11 | ~var4 & var11;
      var11 = -1427994475;
      var4 = var10000;
      a = pulse.Bool.from((var4 | var11) & (~var4 | ~var11));
      this.j = this.i;
      this.k = this.i;
   }

   @EventHandler
   public void a(WorldRenderEndEvent var1) {
      if (c.options != null) {
         if (this.m && c.currentScreen != null) {
            this.o();
         } else {
            if (!this.m) {
               int var7 = -1337382525;
               int var6 = -528159177;
               int var10003 = var6 + var7 - 2 * (var6 & var7);
               var7 = 1767341197;
               var6 = var10003;
               var10003 = var6 & ~var7 | ~var6 & var7;
               if (this.b(this.k, this.j, 0.2)) {
                  double var2 = ((Integer)c.options.getFov().getValue()).intValue();
                  this.i = var2;
                  this.j = var2;
                  this.k = var2;
                  this.l = (Double)c.options.getMouseSensitivity().getValue();
                  int var10001 = (int)-7994974134969522496L;
                  var7 = 337153238;
                  var6 = var10001;
                  var10001 = (var6 | var7) - (var6 & var7);
                  var7 = 1017915926;
                  var6 = var10001;
                  this.n = pulse.Bool.from(var6 + var7 - 2 * (var6 & var7));
               }
            }

            double var39 = this.k;
            double var10002 = this.j;
            int var10004 = (int)-7133497047620772684L;
            int var27 = 1240916478;
            int var14 = var10004;
            var10004 = var14 + var27 - 2 * (var14 & var27);
            var27 = -1347224245;
            var14 = var10004;
            var10004 = (var14 | var27) & (~var14 | ~var27);
            var27 = 1972629820;
            var14 = -348738896;
            var10004 = var14 + var27 - 2 * (var14 & var27);
            var27 = -1633330292;
            var14 = var10004;
            var10004 = (var14 | var27) - (var14 & var27);
            if (this.b(var39, var10002, 0.1)) {
               this.k = this.j;
            } else {
               double var8 = Math.max(1.0, this.q());
               var27 = 619294641;
               var14 = 1062140852;
               int var10000 = var14 + var27 - 2 * (var14 & var27);
               var27 = 427814070;
               var14 = var10000;
               var10000 = (var14 | var27) & ~(var14 & var27);
               double var4 = 24.0 / var8;
               this.k = this.k + (this.j - this.k) * var4;
               var27 = 1019697716;
               var14 = 1795306910;
               int var43 = var14 & ~var27 | ~var14 & var27;
               var27 = 419098965;
               var14 = var43;
               var43 = var14 & ~var27 | ~var14 & var27;
               if (this.b(this.k, this.j, 0.2)) {
                  this.k = this.j;
               }
            }

            a = this.n;
            b = this.k;
            if (this.m) {
               if (c.player != null) {
                  c.player.getInventory().selectedSlot = this.o;
               }

               var27 = 426696568;
               var14 = 80111588;
               int var40 = (var14 | var27) & (~var14 | ~var27);
               var27 = -1116025672;
               var14 = var40;
               int var41 = ((var14 | var27) & ~(var14 & var27)) * ((var14 | var27) & ~(var14 & var27));
               double var9 = !(this.i <= 2.0) ? this.j / this.i : 1.0;
               double var10 = this.l * var9;
               c.options.getMouseSensitivity().setValue(Math.min(this.l, Math.max(var10, 0.0)));
            }
         }
      }
   }

   @EventHandler
   public void a(KeyInputEvent var1) {
      if (this.k()) {
         int var10000 = (int)-4311578314636863700L;
         int var5 = 1211192580;
         int var4 = var10000;
         var10000 = (var4 | var5) - (var4 & var5);
         var5 = -2090410153;
         var4 = var10000;
         var10000 = var4 + var5 - 2 * (var4 & var5);
         var5 = 1342418654;
         var4 = 196801488;
         var10000 = var4 & ~var5 | ~var4 & var5;
         var5 = 1493568070;
         var4 = var10000;
         int var3 = (var4 | var5) & ~(var4 & var5);
         e = var3;
         var5 = -1885049346;
         var4 = -2113307549;
         var10000 = (var4 | var5) & (~var4 | ~var5);
         var5 = 2012613444;
         var4 = var10000;
         var10000 = var4 & ~var5 | ~var4 & var5;
         int var10001 = (int)5133341472227178089L;
         var5 = 2064968926;
         var4 = var10001;
         var10001 = (var4 | var5) & ~(var4 & var5);
         var5 = -544703603;
         var4 = var10001;
         var5 = (var4 | var5) - (var4 & var5);
         var4 = var10000;
         var10000 = (var4 & ~var5) + (var5 & ~var4) + 2 * (var4 & var5);
         var10000 = (int)8943241234223299771L;
         var5 = 570454684;
         var4 = var10000;
         var10000 = var4 + var5 - 2 * (var4 & var5);
         var5 = -859860324;
         var4 = var10000;
         if (((var4 | var5) & (~var4 | ~var5)) <= e) {
            var5 = -1736934424;
            var4 = 1902300359;
            var10000 = (var4 | var5) - (var4 & var5);
            var5 = -1001042365;
            var4 = var10000;
            var10000 = (var4 + var5 - 2 * (var4 & var5)) * (var4 + var5 - 2 * (var4 & var5));
            var5 = 833972397;
            var4 = -850443757;
            var10000 = var4 + var5 - 2 * (var4 & var5);
            var5 = -521386724;
            var4 = var10000;
            var3 = (var4 | var5) & (~var4 | ~var5);
            e = var3;
         }

         if (this.g.b() && var1.a() == this.g.a()) {
            if (c.currentScreen == null) {
               var10000 = var1.c();
               var5 = -997685481;
               var4 = 1700553714;
               var10001 = var4 + var5 - 2 * (var4 & var5);
               var5 = -1579883292;
               var4 = var10001;
               if (var10000 != (var4 | var5) - (var4 & var5)) {
                  if (var1.c() == 0) {
                     this.o();
                  }
               } else {
                  this.n();
               }
            }
         }
      }
   }

   @EventHandler
   public void a(MouseScrollEvent var1) {
      if (this.k() && this.m) {
         if (c.currentScreen == null) {
            int var10001 = (int)-110453481268174231L;
            int var7 = -2063128153;
            int var6 = var10001;
            var10001 = var6 + var7 - 2 * (var6 & var7);
            var7 = 1506347983;
            var6 = var10001;
            var1.a(pulse.Bool.from(var6 & (var7 ^ -1) | (var6 ^ -1) & var7));
            double var2 = var1.e();
            double var10000 = -var2;
            var10001 = (int)5195883269672947033L;
            var7 = 492144790;
            var6 = var10001;
            var10001 = (var6 | var7) - (var6 & var7);
            var7 = -1447293185;
            var6 = var10001;
            var10001 = var6 + var7 - 2 * (var6 & var7);
            int var10002 = (int)6467779941143330248L;
            var7 = -954148180;
            var6 = var10002;
            var10002 = (var6 | var7) - (var6 & var7);
            var7 = -2078960913;
            var6 = var10002;
            var7 = var6 + var7 - 2 * (var6 & var7);
            var6 = var10001;
            var10001 = var6 - ~var7 - 1;
            double var4 = var10000 * 20.0;
            var7 = -2003668360;
            var6 = -415144478;
            var10001 = (var6 | var7) - (var6 & var7);
            var7 = 1638081778;
            var6 = var10001;
            var10001 = ((var6 | var7) - (var6 & var7)) * ((var6 | var7) - (var6 & var7));
            if (this.i > 2.0) {
               var7 = -1336335432;
               var6 = -768209123;
               var10002 = var6 + var7 - 2 * (var6 & var7);
               var7 = 45657381;
               var6 = var10002;
               var10002 = (var6 | var7) & (~var6 | ~var7);
               double var39 = this.j - 2.0;
               String var10003 = "buj";
               var4 *= var39 / (this.i - 2.0);
            }

            double var43 = this.j + var4;
            var7 = 1503807950;
            var6 = -1647734657;
            int var44 = var6 & ~var7 | ~var6 & var7;
            var7 = 2008883634;
            var6 = var44;
            var44 = (var6 | var7) & ~(var6 & var7);
            this.j = this.a(var43, 2.0, this.i);
         }
      }
   }

   private int q() {
      String var1 = c.fpsDebugString;
      if (var1 != null && !var1.isEmpty()) {
         int var46 = -408603858;
         int var10 = -2065036480;
         int var10001 = (var10 | var46) & (~var10 | ~var46);
         var46 = -1162177385;
         var10 = var10001;
         var10001 = (var10 | var46) & (~var10 | ~var46);
         var46 = 808126307;
         var10 = -1561298762;
         int var10002 = (var10 | var46) - (var10 & var46);
         var46 = -1414836396;
         var10 = var10002;
         var46 = (var10 | var46) - (var10 & var46);
         var10 = var10001;
         var10001 = (var10 | var46) + (var10 & var46);
         var46 = 232167040;
         var10 = -403569427;
         int var10003 = (var10 | var46) - (var10 & var46);
         var46 = -366701981;
         var10 = var10003;
         var10003 = var10 + var46 - 2 * (var10 & var46);
         var46 = 267839437;
         var10 = -1489059646;
         var10003 = (var10 | var46) & (~var10 | ~var46);
         var46 = -1463277815;
         var10 = var10003;
         var10003 = (var10 | var46) & ~(var10 & var46);
         var46 = -239452000;
         var10 = 348904360;
         var10003 = (var10 | var46) - (var10 & var46);
         var46 = -445539557;
         var10 = var10003;
         var10003 = (var10 | var46) & (~var10 | ~var46);
         var46 = -1728818900;
         var10 = 1388161871;
         var10003 = (var10 | var46) & ~(var10 & var46);
         var46 = 435019087;
         var10 = var10003;
         var10003 = (var10 + var46 - 2 * (var10 & var46)) * (var10 + var46 - 2 * (var10 & var46));
         var10003 = (int)4407251214042419533L;
         var46 = 31364496;
         var10 = var10003;
         var10003 = (var10 | var46) & (~var10 | ~var46);
         var46 = 263158991;
         var10 = var10003;
         var10003 = (var10 | var46) & (~var10 | ~var46);
         String var10004 = "buk";
         var46 = -859882466;
         var10 = 2052937143;
         int var101 = var10 & ~var46 | ~var10 & var46;
         var46 = -1684344384;
         var10 = var101;
         int var102 = var10 & ~var46 | ~var10 & var46;
         String var10005 = "bul";
         var46 = 198879077;
         var10 = -1854704929;
         int var103 = (var10 | var46) - (var10 & var46);
         var46 = -1874698701;
         var10 = var103;
         int var104 = (var10 | var46) & ~(var10 & var46);
         var46 = -1088099150;
         var10 = 1308996565;
         int var10006 = var10 & ~var46 | ~var10 & var46;
         var46 = 1202919124;
         var10 = var10006;
         var10006 = (var10 + var46 - 2 * (var10 & var46)) * (var10 + var46 - 2 * (var10 & var46));
         var46 = 21198045;
         var10 = 1405494481;
         var10006 = var10 + var46 - 2 * (var10 & var46);
         var46 = 1385666349;
         var10 = var10006;
         String[] var2 = var1.split(c("ꄄ", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7dc꒺ꁾ꤈絛蹅⑾謢㑻w", var10003, var102, var104, var10 & ~var46 | ~var10 & var46));
         if (var2.length != 0) {
            var46 = -1543332434;
            var10 = 1466253402;
            var10001 = var10 & ~var46 | ~var10 & var46;
            var46 = -211296780;
            var10 = var10001;
            String var3 = var2[var10 + var46 - 2 * (var10 & var46)];
            var46 = 603816098;
            var10 = -110407386;
            var10001 = var10 + var46 - 2 * (var10 & var46);
            var46 = -627650133;
            var10 = var10001;
            int var4 = var3.lastIndexOf(var10 + var46 - 2 * (var10 & var46));
            var46 = 809894442;
            var10 = 1293949033;
            var10001 = (var10 | var46) - (var10 & var46);
            var46 = -2103843396;
            var10 = var10001;
            if (var4 != ((var10 | var46) & (~var10 | ~var46))) {
               var46 = 1273999885;
               var10 = -1096764244;
               var10001 = (var10 | var46) - (var10 & var46);
               var46 = -179370335;
               var10 = var10001;
               var3 = var3.substring(var10 & ~var46 | ~var10 & var46, var4);
            }

            try {
               return Integer.parseInt(var3);
            } catch (NumberFormatException var8) {
               var46 = 1811735237;
               var10 = -818369799;
               int var84 = var10 + var46 - 2 * (var10 & var46);
               var46 = -1530640384;
               var10 = var84;
               return (var10 | var46) & (~var10 | ~var46);
            }
         } else {
            int var82 = (int)1894647677471288155L;
            var46 = 1876313990;
            var10 = var82;
            var82 = var10 + var46 - 2 * (var10 & var46);
            var46 = 1374137569;
            var10 = var82;
            return (var10 | var46) - (var10 & var46);
         }
      } else {
         int var10000 = (int)5885093631118019517L;
         int var7 = 862437876;
         int var6 = var10000;
         var10000 = (var6 | var7) - (var6 & var7);
         var7 = 735300213;
         var6 = var10000;
         return (var6 | var7) - (var6 & var7);
      }
   }

   private double a(double var1, double var3, double var5) {
      if (!(var1 < var3)) {
         return !(var1 > var5) ? var1 : var5;
      } else {
         return var3;
      }
   }

   private boolean b(double var1, double var3, double var5) {
      int var15;
      if (!(Math.abs(var1 - var3) <= var5)) {
         int var8 = 611041768;
         int var7 = 394361314;
         var15 = (var7 | var8) & (~var7 | ~var8);
         var8 = 871020554;
         var7 = var15;
         var15 = var7 + var8 - 2 * (var7 & var8);
      } else {
         int var13 = -1096747439;
         int var10 = -1677019474;
         var15 = (var10 | var13) & ~(var10 & var13);
         var13 = 581583102;
         var10 = var15;
         var15 = (var10 | var13) & ~(var10 & var13);
      }

      return pulse.Bool.from(var15);
   }

   static {
      int var1 = -184684402;
      int var0 = 1229423522;
      int var10000 = (var0 | var1) & (~var0 | ~var1);
      var1 = -1111854292;
      var0 = var10000;
      a = pulse.Bool.from(var0 + var1 - 2 * (var0 & var1));
      int var10001 = (int)-2697176229114379876L;
      var1 = -260821729;
      var0 = var10001;
      var10001 = (var0 | var1) - (var0 & var1);
      var1 = 2004266128;
      var0 = var10001;
      var10001 = var0 & ~var1 | ~var0 & var1;
   }

   public static String c(String var0, String var1, int var2, int var3, int var4, int var5) {
      char[] var6 = var1.toCharArray();
      char[] var7 = new char[var6.length];
      int var10000 = (int)-1349802429254535539L;
      int var18 = -1258194016;
      int var17 = var10000;
      var10000 = var17 & ~var18 | ~var17 & var18;
      var18 = 575900967;
      var17 = var10000;
      char[] var262 = new char[(var17 | var18) - (var17 & var18)];
      int var10002 = (int)-8401662709932272376L;
      var18 = -350214248;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1862831472;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -35756015;
      var17 = -323366950;
      int var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 292024313;
      var17 = var10003;
      var262[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var18 = -826623839;
      var17 = 1767989934;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -1478764018;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 2129167784;
      var17 = -202470361;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -1928975862;
      var17 = var10003;
      var262[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var18 = 668406408;
      var17 = -196954221;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -745167591;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 1143775295;
      var17 = 682082621;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 1821065860;
      var17 = var10003;
      var262[var10002] = (char)((var17 | var18) - (var17 & var18));
      var18 = -1513524183;
      var17 = -196432289;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 1367595637;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)-4378831676467577821L;
      var18 = 1565411128;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1171292028;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -626662027;
      var17 = 550921826;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -93119740;
      var17 = var10003;
      var262[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var10002 = (int)3126366027466324358L;
      var18 = 1991522357;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 240026039;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var10003 = (int)2490053124247357449L;
      var18 = -1560593532;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1945714180;
      var17 = var10003;
      var10003 = (var17 & ~var18 | ~var17 & var18) * (var17 & ~var18 | ~var17 & var18);
      var18 = 306791841;
      var17 = -1846594001;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -2086214997;
      var17 = var10003;
      var262[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var18 = 1837543834;
      var17 = 1070403941;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 1380688122;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)-498023424810584828L;
      var18 = -799301607;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -1576234849;
      var17 = var10003;
      var262[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var18 = 1656579407;
      var17 = -309316276;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1892855803;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 1217008034;
      var17 = 1626405358;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 679141727;
      var17 = var10003;
      var262[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var18 = 35926114;
      var17 = -857584094;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -825852345;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -1359310718;
      var17 = 616651834;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -1975781222;
      var17 = var10003;
      var262[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var18 = 843195889;
      var17 = -125043422;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -892741413;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)-2885196278598753626L;
      var18 = -859421569;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1374556534;
      var17 = var10003;
      var262[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var10002 = (int)7738465683926578163L;
      var18 = -1194437721;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -1406132131;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var10003 = (int)2529293202120631862L;
      var18 = 76232338;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 968808320;
      var17 = var10003;
      var262[var10002] = (char)((var17 | var18) - (var17 & var18));
      char[] var8 = var262;
      var10000 = (int)-2481794735221664209L;
      var18 = 1841173520;
      var17 = var10000;
      var10000 = (var17 | var18) & ~(var17 & var18);
      var18 = 202605109;
      var17 = var10000;
      char[] var265 = new char[var17 + var18 - 2 * (var17 & var18)];
      var10002 = (int)-6424660291123039604L;
      var18 = -70147229;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -757329425;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1659887367;
      var17 = -1896085558;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 334262035;
      var17 = var10003;
      var265[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var18 = 737638948;
      var17 = 1931410631;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1491699426;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      int var10004 = (int)-5382631611475712678L;
      var18 = 1852746038;
      var17 = var10004;
      var10004 = (var17 | var18) & (~var17 | ~var18);
      var18 = 928844901;
      var17 = var10004;
      var10004 = (var17 | var18) & ~(var17 & var18);
      var10003 = (int)5498836666306159848L;
      var18 = -1672171186;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -1052356187;
      var17 = var10003;
      var265[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var10002 = (int)6003781877901667151L;
      var18 = -369552936;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 347650709;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 426387004;
      var17 = -1118330512;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 269235465;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var10004 = (int)-9059080626669323554L;
      var18 = -554747881;
      var17 = var10004;
      var10004 = (var17 | var18) & ~(var17 & var18);
      var18 = 1442748719;
      var17 = var10004;
      var18 = (var17 | var18) - (var17 & var18);
      var17 = var10003;
      var10003 = var17 - ~var18 - 1;
      var10003 = (int)-382420579405116020L;
      var18 = 1830123775;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 886551072;
      var17 = var10003;
      var265[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var18 = 1882174816;
      var17 = 561074419;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1365173648;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1912065541;
      var17 = 423477123;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 1758087556;
      var17 = var10003;
      var265[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var10002 = (int)-1592287495655496955L;
      var18 = 1811475393;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -355432256;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -1194206540;
      var17 = 65644245;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -1153940447;
      var17 = var10003;
      var265[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var10002 = (int)495879282853826419L;
      var18 = -708995489;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1279777065;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var10003 = (int)-1457117409176066860L;
      var18 = -147055696;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 1228523504;
      var17 = var10003;
      var265[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var10002 = (int)-541342377097795672L;
      var18 = -708358178;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 855582832;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1371515121;
      var17 = 1804343047;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 315572116;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -933090399;
      var17 = -2100971719;
      var10004 = var17 & ~var18 | ~var17 & var18;
      var18 = 1126428635;
      var17 = var10004;
      var18 = (var17 | var18) - (var17 & var18);
      var17 = var10003;
      var10003 = 2 * (var17 | var18) - (var17 ^ var18);
      var18 = -849631233;
      var17 = 1452691257;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -1681035265;
      var17 = var10003;
      var265[var10002] = (char)((var17 | var18) - (var17 & var18));
      var10002 = (int)-3251958146149749187L;
      var18 = -1392775074;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 515219044;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var10003 = (int)-644324657509237216L;
      var18 = -392286984;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1380138272;
      var17 = var10003;
      var265[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var10002 = (int)432412291971123305L;
      var18 = 1702367586;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 638294275;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var10003 = (int)3510411777401796720L;
      var18 = 767234661;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 1859242803;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 648959909;
      var17 = 126252411;
      var10004 = (var17 | var18) & ~(var17 & var18);
      var18 = 490529369;
      var17 = var10004;
      var18 = var17 & ~var18 | ~var17 & var18;
      var17 = var10003;
      var10003 = 2 * (var17 | var18) - (var17 ^ var18);
      var18 = -1508768899;
      var17 = 1478166584;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -32929727;
      var17 = var10003;
      var265[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var10002 = (int)-1793753773021270082L;
      var18 = -1388004922;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -708290959;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 312389745;
      var17 = -1195558578;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1440499188;
      var17 = var10003;
      var265[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      char[] var9 = var265;
      var10000 = (int)7618978073650011478L;
      var18 = -1460236410;
      var17 = var10000;
      var10000 = var17 + var18 - 2 * (var17 & var18);
      var18 = 2005963472;
      var17 = var10000;

      for (int var10 = (var17 | var18) - (var17 & var18); var10 < var6.length; var10++) {
         char var322 = var6[var10];
         char var247 = var8[var10 % var8.length];
         char var127 = var322;
         var7[var10] = (char)((var127 | var247) - (var127 & var247));
      }

      char[] var19 = new char[var7.length];
      var18 = -597387727;
      var17 = 1591305780;
      var10000 = (var17 | var18) & ~(var17 & var18);
      var18 = -2101481467;
      var17 = var10000;

      for (int var11 = var17 & ~var18 | ~var17 & var18; var11 < var6.length; var11++) {
         char var323 = var7[var11];
         char var250 = var9[var11 % var9.length];
         char var130 = var323;
         var19[var11] = (char)(var130 & ~var250 | ~var130 & var250);
      }

      String var20 = new String(var19);
      int var12 = var20.hashCode();
      var18 = var5;
      var17 = var3;
      var10000 = var17 - var18;
      var18 = var2;
      var17 = var10000;
      int var13 = 2 * (var17 & ~var18) - (var17 ^ var18);
      char[] var14 = var0.toCharArray();
      char[] var15 = new char[var14.length];
      var18 = -1936892151;
      var17 = 2101568967;
      var10000 = var17 + var18 - 2 * (var17 & var18);
      var18 = -238142770;
      var17 = var10000;

      for (int var16 = var17 + var18 - 2 * (var17 & var18); var16 < var15.length; var16++) {
         int var10001 = (int)-6925111334469752014L;
         var18 = 196174633;
         var17 = var10001;
         var10001 = (var17 | var18) & (~var17 | ~var18);
         var18 = -1789442023;
         var17 = var10001;
         switch (var16 % ((var17 | var18) - (var17 & var18))) {
            case 0:
               var18 = var12;
               var17 = var13;
               var10002 = (var17 | var18) & (~var17 | ~var18);
               char var260 = var14[var16];
               var17 = var10002;
               var15[var16] = (char)((var17 | var260) - (var17 & var260));
               break;
            case 1:
               var18 = var13;
               var17 = var5;
               var10002 = (var17 | var18) & (~var17 | ~var18);
               char var258 = var14[var16];
               var17 = var10002;
               var15[var16] = (char)(var17 & ~var258 | ~var17 & var258);
         }
      }

      return new String(var15);
   }
}
