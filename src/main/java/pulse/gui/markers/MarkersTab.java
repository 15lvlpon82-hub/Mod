package pulse;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import net.minecraft.client.util.math.MatrixStack;

public class MarkersTab implements TabHost, ClickGuiTab {
   private static final String[] c;
   private static final float d = 48.0F;
   private static final float e = 19.0F;
   private static final float f = 5.0F;
   private int g;
   private final TabSelector h;
   private final MarkersTab.MarkerEntrySource i;
   private final PanelFadeOverlay j;
   private final NotificationListPanel k;
   private final NotificationEditorPanel l;
   private int m;
   private int n;
   private boolean o;
   public static int a;
   public static boolean b;

   public MarkersTab() {
      int var2 = 460957289;
      int var1 = 584221166;
      int var10001 = (var1 | var2) - (var1 & var2);
      var2 = 967518087;
      var1 = var10001;
      this.g = var1 & ~var2 | ~var1 & var2;
      var2 = -266622914;
      var1 = -271755183;
      var10001 = var1 + var2 - 2 * (var1 & var2);
      var2 = 534179951;
      var1 = var10001;
      this.o = pulse.Bool.from((var1 | var2) & ~(var1 & var2));
      this.h = new TabSelector(this);
      this.i = new MarkersTab.MarkerEntrySource();
      int var10003 = (int)918283960782530265L;
      var2 = 1032460162;
      var1 = var10003;
      var10003 = (var1 | var2) & ~(var1 & var2);
      var2 = -1729384126;
      var1 = var10003;
      var10003 = var1 & ~var2 | ~var1 & var2;
      String var10004 = "brw";
      String var10005 = "brx";
      this.j = new PanelFadeOverlay(var10003, 10.0F, 7.5F);
      this.k = new NotificationListPanel();
      this.l = new NotificationEditorPanel();
      this.k.a(var1x -> this.l.a(var1x));
      this.k.b(var1x -> this.l.a(var1x));
      this.l.a(var1x -> {
         Notification var2x = this.k.b(var1x);
         if (var2x != null) {
            this.k.c(var2x);
            this.l.a(var2x);
         } else {
            this.l.a((Notification)null);
         }
      });
   }

   private void g() {
      if (!this.o && !this.k.g()) {
         Notification var1 = this.k.d();
         if (var1 != null) {
            this.k.c(var1);
            this.l.a(var1);
         }

         int var3 = -1064958453;
         int var2 = 1228327057;
         int var10001 = var2 & ~var3 | ~var2 & var3;
         var3 = -1984901477;
         var2 = var10001;
         this.o = pulse.Bool.from((var2 | var3) - (var2 & var3));
      }
   }

   @Override
   public String[] c() {
      return c;
   }

   @Override
   public int d() {
      return this.g;
   }

   @Override
   public void a(int var1) {
      if (var1 >= 0 && var1 < c.length && this.g != var1) {
         this.g = var1;
         int var10001 = (int)5328637306900838748L;
         int var3 = 1028005021;
         int var2 = var10001;
         var10001 = (var2 | var3) & ~(var2 & var3);
         var3 = -873339456;
         var2 = var10001;
         if (var1 != ((var2 | var3) & ~(var2 & var3))) {
            this.i.c();
         } else {
            this.i.a();
            if (b) {
               var3 = -925632690;
               var2 = 586017040;
               int var10000 = (var2 | var3) & ~(var2 & var3);
               var3 = -365027746;
               var2 = var10000;
               var10000 = (var2 | var3) & ~(var2 & var3);
               var10001 = (int)-2408804373986168706L;
               var3 = 1963753343;
               var2 = var10001;
               var10001 = (var2 | var3) & ~(var2 & var3);
               var3 = 1579798273;
               var2 = var10001;
               var10000 /= (var2 | var3) - (var2 & var3);
            }
         }

         this.l.c();
      }
   }

   public void e() {
      this.l.c();
   }

   public void f() {
      this.i.c();
   }

   public void a(MatrixStack var1, Renderer2D var2, int var3, int var4) {
      int var6 = -1999700644;
      int var5 = -1097147264;
      int var10001 = var5 + var6 - 2 * (var5 & var6);
      var6 = 911483357;
      var5 = var10001;
      if (this.g == ((var5 | var6) & ~(var5 & var6))) {
         this.i.a(var1, var2, var3, var4);
      }
   }

   @Override
   public void a(MatrixStack var1, Renderer2D var2, float var3, float var4, int var5, int var6) {
      this.m = var5;
      this.n = var6;
      this.g();
      this.h.a(var1, var2, var3, var4, var5, var6);
      if (this.g != 0) {
         this.i.a(var1, var2, var3, var4, var5, var6);
         this.j.a(var1, var2, var3, var4, var5, var6);
      } else {
         this.b(var1, var2, var3, var4, var5, var6);
      }
   }

   private void b(MatrixStack var1, Renderer2D var2, float var3, float var4, int var5, int var6) {
      float var7 = pulse.PulseClickGuiScreen.d();
      float var8 = pulse.PulseClickGuiScreen.e();
      int var10001 = (int)-5126537204204841824L;
      int var20 = 1821540838;
      int var19 = var10001;
      var10001 = var19 & ~var20 | ~var19 & var20;
      var20 = -988003132;
      var19 = var10001;
      var10001 = var19 + var20 - 2 * (var19 & var20);
      var20 = 909018094;
      var19 = -740934737;
      int var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = 653081116;
      var19 = var10002;
      var20 = (var19 | var20) - (var19 & var20);
      var19 = var10001;
      var10001 = (var19 | var20) + (var19 & var20);
      float var9 = var4 + 48.0F;
      var20 = -1914604678;
      var19 = -857237255;
      var10001 = var19 + var20 - 2 * (var19 & var20);
      var20 = 934413803;
      var19 = var10001;
      var10001 = ((var19 | var20) & ~(var19 & var20)) * ((var19 | var20) & ~(var19 & var20));
      float var10000 = var8 - 48.0F;
      var10001 = (int)8951824935015197318L;
      var20 = 1248397434;
      var19 = var10001;
      var10001 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1447705537;
      var19 = var10001;
      var10001 = ((var19 | var20) & (~var19 | ~var20)) * ((var19 | var20) & (~var19 | ~var20));
      float var10 = var10000 - 9.5F;
      var20 = 133843747;
      var19 = 1620628190;
      var10001 = (var19 | var20) & ~(var19 & var20);
      var20 = -63668014;
      var19 = var10001;
      var10001 = var19 & ~var20 | ~var19 & var20;
      var20 = -184323254;
      var19 = -217328820;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = -169964790;
      var19 = var10002;
      var20 = (var19 | var20) & ~(var19 & var20);
      var19 = var10001;
      var10001 = (var19 & ~var20) + (var20 & ~var19) + 2 * (var19 & var20);
      float var11 = var3 + 19.0F;
      float var12 = var9;
      var20 = -1381798745;
      var19 = 1563983049;
      var10001 = (var19 | var20) & ~(var19 & var20);
      var20 = -15662234;
      var19 = var10001;
      var10001 = (var19 & ~var20 | ~var19 & var20) * (var19 & ~var20 | ~var19 & var20);
      float var13 = var10 - 5.0F;
      NotificationListPanel var105 = this.k;
      var20 = -1105989823;
      var19 = -1638936464;
      int var10005 = (var19 | var20) - (var19 & var20);
      var20 = 2044030959;
      var19 = var10005;
      var10005 = (var19 | var20) & (~var19 | ~var20);
      float var10004 = var12 + 7.0F;
      var20 = -2041271609;
      var19 = 1553350442;
      int var10007 = (var19 | var20) & ~(var19 & var20);
      var20 = -624781843;
      var19 = var10007;
      var10007 = (var19 | var20) & (~var19 | ~var20);
      var20 = 173947385;
      var19 = 595016370;
      var10007 = (var19 | var20) & (~var19 | ~var20);
      var20 = 690553676;
      var19 = var10007;
      var10007 = (var19 | var20) - (var19 & var20);
      var10007 = (int)4436575371904186943L;
      var20 = -122258975;
      var19 = var10007;
      var10007 = (var19 | var20) & ~(var19 & var20);
      var20 = -1926364200;
      var19 = var10007;
      var10007 = var19 + var20 - 2 * (var19 & var20);
      var105.a(var1, var2, var11, var10004, var13 - 7.0F, var5, var6, 1.0F);
      var20 = -2004750566;
      var19 = 2098194471;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = -175241417;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = -1303883365;
      var19 = -1653250848;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = 792540520;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = -674569204;
      var19 = 213939404;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = -620064571;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var10000 = var11 + 115.5F;
      var10001 = (int)135656668296944736L;
      var20 = -2108895128;
      var19 = var10001;
      var10001 = (var19 | var20) & ~(var19 & var20);
      var20 = -1878619838;
      var19 = var10001;
      var10001 = (var19 | var20) & (~var19 | ~var20);
      var20 = -1224701358;
      var19 = -1467476539;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = -553277402;
      var19 = var10002;
      var20 = (var19 | var20) & (~var19 | ~var20);
      var19 = var10001;
      var10001 = (var19 & ~var20) + (var20 & ~var19) + 2 * (var19 & var20);
      float var14 = var10000 + 5.0F;
      String var131 = "bry";
      var10000 = var7 - 38.0F;
      var10001 = (int)-2620178712273224855L;
      var20 = 1105943738;
      var19 = var10001;
      var10001 = var19 & ~var20 | ~var19 & var20;
      var20 = 1300797915;
      var19 = var10001;
      var10001 = (var19 + var20 - 2 * (var19 & var20)) * (var19 + var20 - 2 * (var19 & var20));
      var10000 -= 115.5F;
      var20 = -1823778194;
      var19 = 1294684376;
      var10001 = (var19 | var20) - (var19 & var20);
      var20 = -295471805;
      var19 = var10001;
      var10001 = ((var19 | var20) & (~var19 | ~var20)) * ((var19 | var20) & (~var19 | ~var20));
      float var15 = var10000 - 5.0F;
      float var16 = var13;
      if (!this.k.g()) {
         if (b) {
            int var109 = (int)7889186452108115059L;
            var20 = 238085907;
            var19 = var109;
            int var110 = (var19 | var20) & ~(var19 & var20);
            var20 = -1580939775;
            var19 = var110;
            int var111 = (var19 | var20) - (var19 & var20);
            int var112 = (int)-8508981496494387066L;
            var20 = 1549544556;
            var19 = var112;
            int var113 = var19 & ~var20 | ~var19 & var20;
            var20 = 609636364;
            var19 = var113;
            int var18 = var19 & ~var20 | ~var19 & var20;
            a = var18;
         }

         if (this.l.a() == null) {
            this.b(var1, var2, var14, var12, var15, var16);
         } else {
            this.l.a(var1, var2, var14, var12, var15, var16, var5, var6, 1.0F);
         }
      } else {
         this.a(var1, var2, var14, var12, var15, var16);
      }

      this.l.a(var1, var2, var5, var6, 1.0F);
   }

   private void a(MatrixStack var1, Renderer2D var2, float var3, float var4, float var5, float var6) {
      int var10001 = (int)8633484091805022277L;
      int var18 = -348292206;
      int var17 = var10001;
      var10001 = var17 & ~var18 | ~var17 & var18;
      var18 = -113556529;
      var17 = var10001;
      FontRenderer var7 = FontManager.b[(var17 | var18) - (var17 & var18)];
      var18 = 1980655355;
      var17 = 297797424;
      var10001 = (var17 | var18) - (var17 & var18);
      var18 = 1741578692;
      var17 = var10001;
      FontRenderer var8 = FontManager.a[var17 & ~var18 | ~var17 & var18];
      String var10000 = "brz";
      var10001 = (int)-8167995529699115504L;
      var18 = 1940271958;
      var17 = var10001;
      var10001 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1242614820;
      var17 = var10001;
      var10001 = ((var17 | var18) - (var17 & var18)) * ((var17 | var18) - (var17 & var18));
      int var10002 = (int)-5186887774197539435L;
      var18 = -923429966;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -1407706645;
      var17 = var10002;
      var10002 = ((var17 | var18) & (~var17 | ~var18)) * ((var17 | var18) & (~var17 | ~var18));
      var18 = 1143232210;
      var17 = 701483740;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -62444254;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      String var10003 = "bsa";
      var18 = 931489763;
      var17 = -956488400;
      int var159 = (var17 | var18) & (~var17 | ~var18);
      var18 = -810872363;
      var17 = var159;
      int var160 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1932968972;
      var17 = 667217644;
      int var10004 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1294717425;
      var17 = var10004;
      var10004 = ((var17 | var18) & (~var17 | ~var18)) * ((var17 | var18) & (~var17 | ~var18));
      var18 = -1067379791;
      var17 = -848085412;
      var10004 = var17 & ~var18 | ~var17 & var18;
      var18 = 456079305;
      var17 = var10004;
      var10004 = var17 & ~var18 | ~var17 & var18;
      int var10005 = (int)5016397400644787191L;
      var18 = -1562413036;
      var17 = var10005;
      var10005 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1118420507;
      var17 = var10005;
      var10005 = var17 & ~var18 | ~var17 & var18;
      var10005 = (int)-1386887452378428375L;
      var18 = -607318490;
      var17 = var10005;
      var10005 = var17 + var18 - 2 * (var17 & var18);
      var18 = 309654127;
      var17 = var10005;
      String var9 = b(
         "葵䄺萔䔯葧䕕聶䔥葨䔠葦䄷萑䕘葨䄺葫䔯萔䕙聶䔦董䕘葨䔠聶䄠聾",
         "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁼ꤄絤蹁⑿謥㑤=\ua7cb꒴ꁣꤎ絳蹘⑩謚㑲|ꟳ",
         var10002,
         var160,
         var10004,
         (var17 | var18) & ~(var17 & var18)
      );
      int var123 = (int)4355083497173793668L;
      var18 = -835995695;
      var17 = var123;
      int var124 = (var17 | var18) - (var17 & var18);
      var18 = 271663038;
      var17 = var124;
      int var125 = ((var17 | var18) - (var17 & var18)) * ((var17 | var18) - (var17 & var18));
      var18 = 162322024;
      var17 = -317161732;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -457922411;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var10002 = (int)2399849762335798742L;
      var18 = -304573007;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 999039085;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var10002 = (int)242938094401598121L;
      var18 = 1284139275;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -1346511958;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -1151963987;
      var17 = -750602570;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 1746197002;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      String var147 = "bsb";
      var18 = -999932340;
      var17 = -1583990313;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -195250505;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      int var161 = (int)-6976741528569463352L;
      var18 = 493642001;
      var17 = var161;
      int var162 = var17 & ~var18 | ~var17 & var18;
      var18 = -197790341;
      var17 = var162;
      int var163 = var17 + var18 - 2 * (var17 & var18);
      int var164 = (int)-7481145960894586470L;
      var18 = 66929642;
      var17 = var164;
      int var165 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1792816266;
      var17 = var165;
      int var166 = var17 & ~var18 | ~var17 & var18;
      var10004 = (int)8648689172125571293L;
      var18 = 621032696;
      var17 = var10004;
      var10004 = var17 & ~var18 | ~var17 & var18;
      var18 = 2029971826;
      var17 = var10004;
      var10004 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1722575588;
      var17 = 183673853;
      var10005 = (var17 | var18) & ~(var17 & var18);
      var18 = -1372561475;
      var17 = var10005;
      var18 = (var17 | var18) - (var17 & var18);
      var17 = var10004;
      var10004 = 2 * (var17 | var18) - (var17 ^ var18);
      var18 = 1472663064;
      var17 = -1037837191;
      var10004 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1748571557;
      var17 = var10004;
      var10004 = var17 & ~var18 | ~var17 & var18;
      var10005 = (int)7828067751126499826L;
      var18 = 1437205879;
      var17 = var10005;
      var10005 = var17 + var18 - 2 * (var17 & var18);
      var18 = 747891959;
      var17 = var10005;
      var10005 = (var17 + var18 - 2 * (var17 & var18)) * (var17 + var18 - 2 * (var17 & var18));
      var10005 = (int)8480062526690928195L;
      var18 = 1981901637;
      var17 = var10005;
      var10005 = var17 + var18 - 2 * (var17 & var18);
      var18 = 647269222;
      var17 = var10005;
      String var10 = b(
         "葋猪葠猦葮眺葫猪聶猥葭獔萗猢葬眶聶猢聶献葨猫葦猨萚眺葫猤葤獙萘眺葪猯萔猠萕",
         "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁼ꤄絤蹁⑿謥㑤=\ua7cb꒴ꁣꤎ絳蹘⑩謚㑲|ꟳ",
         var10002,
         var166,
         var10004,
         var17 + var18 - 2 * (var17 & var18)
      );
      float var11 = var7.a(var9);
      float var12 = var8.a(var10);
      float var13 = var3 + (var5 - var11) / 2.0F;
      float var126 = var4 + var6 / 2.0F;
      String var132 = "bsc";
      float var14 = var126 - 20.0F;
      float var15 = var3 + (var5 - var12) / 2.0F;
      var10002 = (int)6524200356672049402L;
      var18 = -1503649382;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -125161104;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var10002 = (int)-7459449632136049280L;
      var18 = 591266509;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -73216189;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var10002 = (int)4743632203700604062L;
      var18 = -1942886670;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1298371971;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      float var16 = var14 + 15.0F;
      var7.a(var9, var13, var14, pulse.Theme.a, var1);
      var8.a(var10, var15, var16, pulse.Theme.b, var1);
   }

   private void b(MatrixStack var1, Renderer2D var2, float var3, float var4, float var5, float var6) {
      int var10001 = (int)-7388082004559827255L;
      int var18 = -1297945498;
      int var17 = var10001;
      var10001 = (var17 | var18) - (var17 & var18);
      var18 = 811827895;
      var17 = var10001;
      FontRenderer var7 = FontManager.b[(var17 | var18) - (var17 & var18)];
      var18 = 555976964;
      var17 = 1060008773;
      var10001 = var17 + var18 - 2 * (var17 & var18);
      var18 = 504232526;
      var17 = var10001;
      FontRenderer var8 = FontManager.a[(var17 | var18) & ~(var17 & var18)];
      var18 = 1017906476;
      var17 = 31915617;
      int var10000 = var17 & ~var18 | ~var17 & var18;
      var18 = 793387213;
      var17 = var10000;
      var10000 = var17 + var18 - 2 * (var17 & var18);
      var18 = 228788949;
      var17 = 933348323;
      int var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 973261095;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -1344873695;
      var17 = 983537532;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -1790358438;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var10002 = (int)-759011605498251762L;
      var18 = 408545912;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 1102666854;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -1875241806;
      var17 = -1964444629;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 450027669;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -1504478456;
      var17 = 1642582756;
      int var10003 = (var17 | var18) - (var17 & var18);
      var18 = -944461343;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)-1455922486561909106L;
      var18 = 2107095732;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 711912503;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 2058163917;
      var17 = -443255706;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 244700039;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var10003 = (int)7681609782519621176L;
      var18 = 242069306;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 254528784;
      var17 = var10003;
      var10003 = ((var17 | var18) & ~(var17 & var18)) * ((var17 | var18) & ~(var17 & var18));
      var18 = -717746401;
      var17 = -1700944287;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -626990224;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -1597168414;
      var17 = 1602891641;
      int var10005 = (var17 | var18) & (~var17 | ~var18);
      var18 = -12121206;
      var17 = var10005;
      var10005 = (var17 | var18) - (var17 & var18);
      var18 = -950716480;
      var17 = -417038271;
      var10005 = var17 + var18 - 2 * (var17 & var18);
      var18 = 544323456;
      var17 = var10005;
      var10005 = (var17 | var18) & (~var17 | ~var18);
      int var10004 = (int)-8650649682626730307L;
      var18 = -1860290083;
      var17 = var10004;
      var10004 = (var17 | var18) - (var17 & var18);
      var18 = -1051972148;
      var17 = var10004;
      var10004 = (var17 | var18) & ~(var17 & var18);
      var18 = -1461765858;
      var17 = 1663767657;
      var10005 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1311926645;
      var17 = var10005;
      var10005 = ((var17 | var18) - (var17 & var18)) * ((var17 | var18) - (var17 & var18));
      var18 = 1542700110;
      var17 = 4730069;
      var10005 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1536358758;
      var17 = var10005;
      String var9 = b(
         "鯛䍓鯸䌭鮉䌠鿩䌤鯼䍚鯳䍛", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁼ꤄絤蹁⑿謥㑤=\ua7cb꒴ꁣꤎ絳蹘⑩謚㑲|ꟳ", var10002, var10003, var10004, (var17 | var18) - (var17 & var18)
      );
      var18 = -2053841077;
      var17 = 629788264;
      var10000 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1737706166;
      var17 = var10000;
      var10000 = var17 + var18 - 2 * (var17 & var18);
      var10001 = (int)6101005493800805125L;
      var18 = -1860100492;
      var17 = var10001;
      var10001 = (var17 | var18) - (var17 & var18);
      var18 = 1564935445;
      var17 = var10001;
      var18 = var17 & ~var18 | ~var17 & var18;
      var17 = var10000;
      var10000 = (var17 & ~var18) + (var18 & ~var17) + 2 * (var17 & var18);
      var18 = 408241186;
      var17 = 516371802;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 110260600;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -214262791;
      var17 = -2031944322;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -1474434981;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 1107740417;
      var17 = 1168915386;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 1429117428;
      var17 = var10003;
      var18 = (var17 | var18) - (var17 & var18);
      var17 = var10002;
      var10002 = var17 - ~var18 - 1;
      var18 = -703188388;
      var17 = 588170607;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1689536031;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)6867382717423655327L;
      var18 = 1203816843;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 345419703;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var10004 = (int)-2142796157603875636L;
      var18 = 589130735;
      var17 = var10004;
      var10004 = (var17 | var18) & ~(var17 & var18);
      var18 = 591260132;
      var17 = var10004;
      var18 = var17 & ~var18 | ~var17 & var18;
      var17 = var10003;
      var10003 = (var17 ^ var18) + 2 * (var17 & var18);
      var18 = 1096565983;
      var17 = 647672620;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -215998641;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1555521575;
      var17 = -694760385;
      var10004 = var17 & ~var18 | ~var17 & var18;
      var18 = 1768034839;
      var17 = var10004;
      var10004 = (var17 | var18) & ~(var17 & var18);
      var18 = 1002494929;
      var17 = -1112967494;
      var10005 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1994303199;
      var17 = var10005;
      var18 = var17 & ~var18 | ~var17 & var18;
      var17 = var10004;
      var10004 = (var17 ^ var18) + 2 * (var17 & var18);
      var18 = -266335979;
      var17 = -1840394052;
      var10004 = (var17 | var18) & (~var17 | ~var18);
      var18 = 2058252627;
      var17 = var10004;
      var10004 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1220678742;
      var17 = 1354873643;
      var10005 = var17 & ~var18 | ~var17 & var18;
      var18 = -797431353;
      var17 = var10005;
      var10005 = ((var17 | var18) - (var17 & var18)) * ((var17 | var18) - (var17 & var18));
      var18 = -116455439;
      var17 = -336720741;
      var10005 = var17 + var18 - 2 * (var17 & var18);
      var18 = 317326273;
      var17 = var10005;
      String var10 = b(
         "鯮∌鯷≿鮂♮鯴≾鮈∌鮉≰鯱∌鮅♮鯵≻鮋≴鮊♢鿩≱鮉≰鮈∌鯷♮鯻∅鯸≻鮉≶鿩≰鯽≳鮊♮鯱≹鿩∍鯿≻鿩∏鯷≹鯽≾鯴≳鮂∋",
         "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁼ꤄絤蹁⑿謥㑤=\ua7cb꒴ꁣꤎ絳蹘⑩謚㑲|ꟳ",
         var10002,
         var10003,
         var10004,
         (var17 | var18) & ~(var17 & var18)
      );
      float var11 = var7.a(var9);
      float var12 = var8.a(var10);
      float var13 = var3 + (var5 - var11) / 2.0F;
      float var165 = var4 + var6 / 2.0F;
      String var170 = "bsd";
      float var14 = var165 - 20.0F;
      float var15 = var3 + (var5 - var12) / 2.0F;
      var10002 = (int)-5421779836904553745L;
      var18 = 969166365;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -349598496;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 604898893;
      var17 = -1148010861;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1617119023;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -2033262920;
      var17 = -991213671;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1109760301;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      float var16 = var14 + 15.0F;
      var7.a(var9, var13, var14, pulse.Theme.a, var1);
      var8.a(var10, var15, var16, pulse.Theme.b, var1);
   }

   @Override
   public void a(float var1, float var2, int var3, int var4) {
      this.h.a(var1, var2, var3, var4);
      if (this.g != 0) {
         this.i.a(var1, var2, var3, var4);
      } else {
         float var5 = pulse.PulseClickGuiScreen.d();
         float var6 = pulse.PulseClickGuiScreen.e();
         int var15 = 716835048;
         int var14 = 1820101550;
         int var10001 = (var14 | var15) - (var14 & var15);
         var15 = -869466477;
         var14 = var10001;
         var10001 = var14 & ~var15 | ~var14 & var15;
         float var7 = var2 + 48.0F;
         var10001 = (int)-5148132735288074276L;
         var15 = -231880648;
         var14 = var10001;
         var10001 = var14 + var15 - 2 * (var14 & var15);
         var15 = -1422337955;
         var14 = var10001;
         var10001 = ((var14 | var15) & ~(var14 & var15)) * ((var14 | var15) & ~(var14 & var15));
         float var10000 = var6 - 48.0F;
         var10001 = (int)9079172707040863599L;
         var15 = -441380596;
         var14 = var10001;
         var10001 = (var14 | var15) & (~var14 | ~var15);
         var15 = 1964162148;
         var14 = var10001;
         var10001 = var14 + var15 - 2 * (var14 & var15);
         int var10002 = (int)-8805370711395378197L;
         var15 = 1223422512;
         var14 = var10002;
         var10002 = var14 + var15 - 2 * (var14 & var15);
         var15 = -670568457;
         var14 = var10002;
         var15 = var14 + var15 - 2 * (var14 & var15);
         var14 = var10001;
         var10001 = (var14 & ~var15) + (var15 & ~var14) + 2 * (var14 & var15);
         float var8 = var10000 - 9.5F;
         float var9 = var7;
         var10001 = (int)3086680975032447935L;
         var15 = 1333539207;
         var14 = var10001;
         var10001 = (var14 | var15) - (var14 & var15);
         var15 = 749477445;
         var14 = var10001;
         var10001 = ((var14 | var15) - (var14 & var15)) * ((var14 | var15) - (var14 & var15));
         float var10 = var8 - 5.0F;
         var15 = 1697645215;
         var14 = -1822824314;
         var10001 = var14 + var15 - 2 * (var14 & var15);
         var15 = 253719054;
         var14 = var10001;
         var10001 = var14 + var15 - 2 * (var14 & var15);
         float var11 = var1 + 19.0F;
         var10001 = (int)-394638124040026912L;
         var15 = -956078403;
         var14 = var10001;
         var10001 = (var14 | var15) & ~(var14 & var15);
         var15 = 904316505;
         var14 = var10001;
         var10001 = var14 + var15 - 2 * (var14 & var15);
         var10000 = var11 + 115.5F;
         String var98 = "bse";
         float var12 = var10000 + 5.0F;
         var10001 = (int)-7746231171537074715L;
         var15 = 624746477;
         var14 = var10001;
         var10001 = var14 & ~var15 | ~var14 & var15;
         var15 = 1353305680;
         var14 = var10001;
         var10001 = ((var14 | var15) - (var14 & var15)) * ((var14 | var15) - (var14 & var15));
         var10000 = var5 - 38.0F;
         var15 = 1939999903;
         var14 = 2069389156;
         var10001 = var14 & ~var15 | ~var14 & var15;
         var15 = 1967335170;
         var14 = var10001;
         var10001 = (var14 + var15 - 2 * (var14 & var15)) * (var14 + var15 - 2 * (var14 & var15));
         var10000 -= 115.5F;
         var10002 = (int)-7194018822007731767L;
         var15 = -516059338;
         var14 = var10002;
         var10002 = (var14 | var15) & ~(var14 & var15);
         var15 = -671299854;
         var14 = var10002;
         var10002 = (var14 | var15) & ~(var14 & var15);
         float var13 = var10000 - 5.0F;
         if (this.l.a() != null && this.l.a(var12, var9, var13, var10, var3, var4)) {
            return;
         }

         NotificationListPanel var81 = this.k;
         int var10004 = (int)564993475726201076L;
         var15 = 645626705;
         var14 = var10004;
         var10004 = var14 + var15 - 2 * (var14 & var15);
         var15 = -1150702665;
         var14 = var10004;
         var10004 = (var14 | var15) & ~(var14 & var15);
         var15 = 1293977514;
         var14 = -1219713630;
         var10004 = (var14 | var15) & (~var14 | ~var15);
         var15 = -93576693;
         var14 = var10004;
         var10004 = (var14 | var15) & ~(var14 & var15);
         var10004 = (int)-5046577182913622419L;
         var15 = 1990960582;
         var14 = var10004;
         var10004 = var14 & ~var15 | ~var14 & var15;
         var15 = 914107309;
         var14 = var10004;
         var10004 = var14 & ~var15 | ~var14 & var15;
         float var108 = var9 + 7.0F;
         var10004 = (int)-713952080911310604L;
         var15 = 215890020;
         var14 = var10004;
         var10004 = var14 + var15 - 2 * (var14 & var15);
         var15 = 1555602133;
         var14 = var10004;
         var10004 = (var14 | var15) & ~(var14 & var15);
         var15 = 919190771;
         var14 = -370416120;
         int var10005 = (var14 | var15) & (~var14 | ~var15);
         var15 = 1751041064;
         var14 = var10005;
         var15 = var14 & ~var15 | ~var14 & var15;
         var14 = var10004;
         var10004 = (var14 | var15) + (var14 & var15);
         if (var81.a(var11, var108, var10 - 7.0F, var3, var4)) {
            return;
         }
      }
   }

   @Override
   public void b(float var1, float var2, int var3, int var4) {
      if (this.g != 0) {
         this.i.b(var1, var2, var3, var4);
      } else if (this.l.a(var3, var4)) {
         return;
      }
   }

   @Override
   public void c(float var1, float var2, int var3, int var4) {
      if (this.g != 0) {
         this.i.c(var1, var2, var3, var4);
      } else {
         this.k.a(var3, var4);
         this.l.b(var3, var4);
         int var10000 = (int)-8553347631609611701L;
         int var8 = -721648322;
         int var7 = var10000;
         var10000 = var7 + var8 - 2 * (var7 & var8);
         var8 = 601247320;
         var7 = var10000;
         var10000 = (var7 | var8) & (~var7 | ~var8);
         var8 = -2034576533;
         var7 = -1094337174;
         int var10001 = (var7 | var8) & (~var7 | ~var8);
         var8 = -1143609058;
         var7 = var10001;
         var8 = (var7 | var8) & (~var7 | ~var8);
         var7 = var10000;
         var10000 = (var7 & ~var8) + (var8 & ~var7) + 2 * (var7 & var8);
         var8 = -1751362177;
         var7 = -1082307061;
         var10000 = var7 + var8 - 2 * (var7 & var8);
         var8 = 842570714;
         var7 = var10000;
         int var6 = (var7 | var8) - (var7 & var8);
         a = var6;
         var10000 = (int)8060154022894794872L;
         var8 = 387298515;
         var7 = var10000;
         var10000 = (var7 | var8) & ~(var7 & var8);
         var8 = -2109969428;
         var7 = var10000;
         var10000 = (var7 | var8) - (var7 & var8);
         var8 = -1001119049;
         var7 = 943490241;
         var10001 = (var7 | var8) & (~var7 | ~var8);
         var8 = 2143390629;
         var7 = var10001;
         var8 = (var7 | var8) & (~var7 | ~var8);
         var7 = var10000;
         var10000 = var7 - ~var8 - 1;
         var8 = 2023794945;
         var7 = -641943907;
         var10000 = (var7 | var8) - (var7 & var8);
         var8 = -304992173;
         var7 = var10000;
         if (((var7 | var8) & ~(var7 & var8)) <= a) {
            var8 = -1072400690;
            var7 = -2024284191;
            var10000 = (var7 | var8) & (~var7 | ~var8);
            var8 = 1195616559;
            var7 = var10000;
            var10000 = (var7 | var8) & ~(var7 & var8);
            var10001 = (int)1391606936648074909L;
            var8 = 117652584;
            var7 = var10001;
            var10001 = (var7 | var8) - (var7 & var8);
            var8 = -1025246475;
            var7 = var10001;
            var10000 /= (var7 | var8) & (~var7 | ~var8);
         }
      }
   }

   @Override
   public void a(float var1, float var2, int var3, int var4, double var5, double var7) {
      if (this.g != 0) {
         this.i.a(var1, var2, var3, var4, var5, var7);
      } else {
         this.k.a(var3, var4, var5, var7);
         this.l.a(var3, var4, var5, var7);
      }
   }

   @Override
   public void a(float var1) {
      if (this.g != 0) {
         this.i.a(var1);
      } else {
         this.k.a(var1, this.m, this.n);
      }
   }

   @Override
   public boolean a(int var1, int var2, int var3) {
      if (this.g != 0) {
         if (this.i.a(var1, var2, var3)) {
            int var5 = 147888185;
            int var4 = 1921479216;
            int var10000 = (var4 | var5) & ~(var4 & var5);
            var5 = 2052581896;
            var4 = var10000;
            return pulse.Bool.from((var4 | var5) - (var4 & var5));
         }
      } else {
         if (this.k.a(var1, var2, var3)) {
            int var23 = (int)-2275321850278586960L;
            int var18 = 1728036186;
            int var11 = var23;
            var23 = (var11 | var18) - (var11 & var18);
            var18 = 1921673451;
            var11 = var23;
            return pulse.Bool.from((var11 | var18) & (var11 & var18 ^ -1));
         }

         if (this.l.a(var1, var2, var3)) {
            int var16 = -1805902;
            int var9 = -1466764532;
            int var22 = var9 & ~var16 | ~var9 & var16;
            var16 = 1467384511;
            var9 = var22;
            return pulse.Bool.from((var9 | var16) - (var9 & var16));
         }
      }

      int var20 = (int)-550784634159970380L;
      int var14 = -592340588;
      int var7 = var20;
      var20 = var7 + var14 - 2 * (var7 & var14);
      var14 = -1047044576;
      var7 = var20;
      return pulse.Bool.from((var7 | var14) & (var7 & var14 ^ -1));
   }

   @Override
   public boolean b() {
      if (this.g != 0) {
         int var30 = 789378341;
         int var13 = -831264021;
         int var46 = var13 + var30 - 2 * (var13 & var30);
         var30 = -383601508;
         var13 = var46;
         var46 = ((var13 | var30) & ~(var13 & var30)) * ((var13 | var30) & ~(var13 & var30));
         var46 = (int)-6541085367381879496L;
         var30 = -1059229071;
         var13 = var46;
         var46 = (var13 | var30) & ~(var13 & var30);
         var30 = 1293639656;
         var13 = var46;
         int var2 = (var13 | var30) & ~(var13 & var30);
         a = var2;
         String var50 = "bsf";
         var30 = 1641200617;
         var13 = 726686109;
         var46 = (var13 | var30) - (var13 & var30);
         var30 = 535161957;
         var13 = var46;
         if (((var13 | var30) & ~(var13 & var30)) <= a) {
            var46 = (int)-5329630589114381013L;
            var30 = -577300587;
            var13 = var46;
            var46 = (var13 | var30) & ~(var13 & var30);
            var30 = -410235996;
            var13 = var46;
            var46 = (var13 | var30) & (~var13 | ~var30);
            var30 = -1781488070;
            var13 = 1040763775;
            var46 = var13 & ~var30 | ~var13 & var30;
            var30 = 1765587002;
            var13 = var46;
            var2 = var13 & ~var30 | ~var13 & var30;
         }

         return this.i.b();
      } else {
         int var41;
         if (!this.k.f() && !this.l.d()) {
            if (a != a) {
               int var24 = 318362;
               int var7 = -1716525235;
               var41 = (var7 | var24) & ~(var7 & var24);
               var24 = -1716831017;
               var7 = var41;
               var41 = (var7 | var24) & (~var7 | ~var24);
               int var10001 = (int)-8676589232553309418L;
               var24 = 1230142220;
               var7 = var10001;
               var10001 = var7 + var24 - 2 * (var7 & var24);
               var24 = 184299546;
               var7 = var10001;
               var41 /= var7 & ~var24 | ~var7 & var24;
            }

            int var28 = -671564390;
            int var11 = -1439663371;
            var41 = (var11 | var28) & ~(var11 & var28);
            var28 = 2110310255;
            var11 = var41;
            var41 = (var11 | var28) - (var11 & var28);
         } else {
            var41 = (int)3788049041308135716L;
            int var4 = 858750228;
            int var3 = var41;
            var41 = var3 + var4 - 2 * (var3 & var4);
            var4 = 1237404721;
            var3 = var41;
            var41 = var3 + var4 - 2 * (var3 & var4);
         }

         return pulse.Bool.from(var41);
      }
   }

   public boolean a(char var1, int var2) {
      if (this.g == 0) {
         if (this.k.a(var1, var2)) {
            int var13 = 595253489;
            int var8 = -1143266320;
            int var16 = var8 & ~var13 | ~var8 & var13;
            var13 = -1734214912;
            var8 = var16;
            return pulse.Bool.from((var8 | var13) & (var8 & var13 ^ -1));
         }

         if (this.l.a(var1, var2)) {
            int var11 = 1995809245;
            int var6 = -535139149;
            int var15 = var6 + var11 - 2 * (var6 & var11);
            var11 = -1762669201;
            var6 = var15;
            return pulse.Bool.from((var6 | var11) & (var6 ^ -1 | var11 ^ -1));
         }
      }

      int var4 = 344620188;
      int var3 = -796519087;
      int var10000 = var3 & ~var4 | ~var3 & var4;
      var4 = -1005819443;
      var3 = var10000;
      return pulse.Bool.from((var3 | var4) - (var3 & var4));
   }

   @Override
   public ClickGuiTabType a() {
      return ClickGuiTabType.MARKERS;
   }

   static {
      int var10000 = (int)-6103620742488348522L;
      int var1 = 699350030;
      int var0 = var10000;
      var10000 = (var0 | var1) & ~(var0 & var1);
      var1 = -1041656678;
      var0 = var10000;
      String[] var117 = new String[var0 + var1 - 2 * (var0 & var1)];
      var1 = 1690259865;
      var0 = -1443442439;
      int var10002 = (var0 | var1) - (var0 & var1);
      var1 = -850820768;
      var0 = var10002;
      var10002 = (var0 | var1) - (var0 & var1);
      int var10003 = (int)-1633321875778663185L;
      var1 = -120235783;
      var0 = var10003;
      var10003 = (var0 | var1) - (var0 & var1);
      var1 = 1942900985;
      var0 = var10003;
      var10003 = (var0 & ~var1 | ~var0 & var1) * (var0 & ~var1 | ~var0 & var1);
      var1 = 1529463709;
      var0 = 497811329;
      int var10004 = (var0 | var1) - (var0 & var1);
      var1 = -1929447610;
      var0 = var10004;
      var10004 = ((var0 | var1) & ~(var0 & var1)) * ((var0 | var1) & ~(var0 & var1));
      var1 = 1097889321;
      var0 = 1353139967;
      int var10006 = var0 & ~var1 | ~var0 & var1;
      var1 = 299315411;
      var0 = var10006;
      var10006 = (var0 | var1) & (~var0 | ~var1);
      var1 = -825467978;
      var0 = -558708031;
      var10006 = (var0 | var1) & ~(var0 & var1);
      var1 = 276730226;
      var0 = var10006;
      var10006 = var0 + var1 - 2 * (var0 & var1);
      int var10005 = (int)5524765674065806037L;
      var1 = 153333496;
      var0 = var10005;
      var10005 = (var0 | var1) - (var0 & var1);
      var1 = 1970920705;
      var0 = var10005;
      var10005 = (var0 | var1) - (var0 & var1);
      var10006 = (int)-3354537914675709884L;
      var1 = 170191292;
      var0 = var10006;
      var10006 = var0 & ~var1 | ~var0 & var1;
      var1 = 653777936;
      var0 = var10006;
      var10006 = ((var0 | var1) & (~var0 | ~var1)) * ((var0 | var1) & (~var0 | ~var1));
      var1 = -458080368;
      var0 = -780283030;
      var10006 = (var0 | var1) & (~var0 | ~var1);
      var1 = 734041789;
      var0 = var10006;
      var10006 = var0 + var1 - 2 * (var0 & var1);
      String var10007 = "bsg";
      int var161 = (int)2478699964194707975L;
      var1 = 538690263;
      var0 = var161;
      int var162 = (var0 | var1) & (~var0 | ~var1);
      var1 = 898434921;
      var0 = var162;
      int var163 = (var0 | var1) & ~(var0 & var1);
      String var10008 = "bsh";
      var1 = -1596604459;
      var0 = 1162070345;
      int var172 = (var0 | var1) & (~var0 | ~var1);
      var1 = -438645522;
      var0 = var172;
      var117[var10002] = b("뮙냮믇냡뮽", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁼ꤄絤蹁⑿謥㑤=\ua7cb꒴ꁣꤎ絳蹘⑩謚㑲|ꟳ", var10005, var10006, var163, var0 & ~var1 | ~var0 & var1);
      var10002 = (int)-8636755882181683220L;
      var1 = 1402547495;
      var0 = var10002;
      var10002 = var0 & ~var1 | ~var0 & var1;
      var1 = -1923958070;
      var0 = var10002;
      var10002 = (var0 | var1) - (var0 & var1);
      var10004 = (int)7760355789273664715L;
      var1 = -1784476209;
      var0 = var10004;
      var10004 = (var0 | var1) & ~(var0 & var1);
      var1 = -202473216;
      var0 = var10004;
      var10004 = var0 + var1 - 2 * (var0 & var1);
      var1 = -1424077936;
      var0 = 265489222;
      var10004 = (var0 | var1) - (var0 & var1);
      var1 = -1530052399;
      var0 = var10004;
      var10004 = (var0 | var1) - (var0 & var1);
      var10004 = (int)-128680334153737947L;
      var1 = 203323539;
      var0 = var10004;
      var10004 = var0 & ~var1 | ~var0 & var1;
      var1 = -181509708;
      var0 = var10004;
      var10004 = var0 & ~var1 | ~var0 & var1;
      var1 = -2082223952;
      var0 = -1913427754;
      var10004 = (var0 | var1) & ~(var0 & var1);
      var1 = 235970678;
      var0 = var10004;
      var10004 = (var0 | var1) & ~(var0 & var1);
      var10005 = (int)-4950349815777631L;
      var1 = 77929031;
      var0 = var10005;
      var10005 = var0 + var1 - 2 * (var0 & var1);
      var1 = -653103903;
      var0 = var10005;
      var10005 = (var0 | var1) & ~(var0 & var1);
      var10005 = (int)-76248047670846493L;
      var1 = 474047708;
      var0 = var10005;
      var10005 = var0 & ~var1 | ~var0 & var1;
      var1 = -410878160;
      var0 = var10005;
      var10005 = (var0 | var1) - (var0 & var1);
      var10005 = (int)-3983155361130745779L;
      var1 = -1538615608;
      var0 = var10005;
      var10005 = (var0 | var1) & (~var0 | ~var1);
      var1 = 645017222;
      var0 = var10005;
      var10005 = ((var0 | var1) & (~var0 | ~var1)) * ((var0 | var1) & (~var0 | ~var1));
      var1 = 2008456270;
      var0 = -1590066533;
      var10005 = (var0 | var1) - (var0 & var1);
      var1 = 1193521145;
      var0 = var10005;
      var10005 = (var0 | var1) - (var0 & var1);
      var1 = 425857471;
      var0 = -2115144913;
      var10006 = (var0 | var1) & (~var0 | ~var1);
      var1 = -782092625;
      var0 = var10006;
      var10006 = var0 & ~var1 | ~var0 & var1;
      int var164 = (int)4964466723296196998L;
      var1 = 849323303;
      var0 = var164;
      int var165 = var0 + var1 - 2 * (var0 & var1);
      var1 = -526873026;
      var0 = var165;
      var1 = (var0 | var1) & (~var0 | ~var1);
      var0 = var10006;
      var10006 = (var0 ^ var1) + 2 * (var0 & var1);
      var1 = 1167510061;
      var0 = -650725186;
      var10006 = (var0 | var1) - (var0 & var1);
      var1 = -2126152420;
      var0 = var10006;
      var10006 = (var0 | var1) - (var0 & var1);
      int var166 = (int)8006501944927028177L;
      var1 = -1860307187;
      var0 = var166;
      int var167 = (var0 | var1) - (var0 & var1);
      var1 = -2110821713;
      var0 = var167;
      int var168 = var0 & ~var1 | ~var0 & var1;
      var1 = -2029910694;
      var0 = -698762352;
      int var173 = var0 + var1 - 2 * (var0 & var1);
      var1 = -960059012;
      var0 = var173;
      var1 = (var0 | var1) & ~(var0 & var1);
      var0 = var168;
      int var169 = (var0 & ~var1) + (var1 & ~var0) + 2 * (var0 & var1);
      var1 = 1781880352;
      var0 = -1831446097;
      int var170 = (var0 | var1) & (~var0 | ~var1);
      var1 = -362104755;
      var0 = var170;
      int var171 = (var0 | var1) & ~(var0 & var1);
      int var174 = (int)327692072322888514L;
      var1 = -876489278;
      var0 = var174;
      int var175 = (var0 | var1) & (~var0 | ~var1);
      var1 = 1984498118;
      var0 = var175;
      int var176 = var0 & ~var1 | ~var0 & var1;
      var1 = -540313661;
      var0 = -1529099359;
      int var177 = (var0 | var1) & ~(var0 & var1);
      var1 = 2066936792;
      var0 = var177;
      var117[var10002] = b(
         "뮘䔣믄䕑믅䔭뮼䔩뮽", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁼ꤄絤蹁⑿謥㑤=\ua7cb꒴ꁣꤎ絳蹘⑩謚㑲|ꟳ", var10005, var10006, var171, (var0 | var1) & (~var0 | ~var1)
      );
      c = var117;
   }

   public static String b(String var0, String var1, int var2, int var3, int var4, int var5) {
      char[] var6 = var1.toCharArray();
      char[] var7 = new char[var6.length];
      int var20 = 1075488914;
      int var19 = -1414976340;
      int var10000 = var19 & ~var20 | ~var19 & var20;
      var20 = -340556748;
      var19 = var10000;
      char[] var265 = new char[(var19 | var20) & ~(var19 & var20)];
      var20 = 128434877;
      var19 = 539351299;
      int var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = 662838206;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      int var10003 = (int)-6417834540271466800L;
      var20 = -454569452;
      var19 = var10003;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = -83583754;
      var19 = var10003;
      var265[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      var10002 = (int)6435788649531053920L;
      var20 = 1355241324;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = -536002547;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = -1460838114;
      var19 = -1931726747;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = 607220478;
      var19 = var10003;
      var265[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      var10002 = (int)-7698178205766725021L;
      var20 = -1087246292;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = -592502195;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = 1944874908;
      var19 = 1733470849;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = 348055195;
      var19 = var10003;
      var265[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      var20 = -1622467834;
      var19 = 1933897656;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = -334498627;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var10003 = (int)5756144427671622274L;
      var20 = 315748473;
      var19 = var10003;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = -783074891;
      var19 = var10003;
      var10003 = ((var19 | var20) & ~(var19 & var20)) * ((var19 | var20) & ~(var19 & var20));
      var10003 = (int)-4280289621794081500L;
      var20 = 1604406702;
      var19 = var10003;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = 177070233;
      var19 = var10003;
      var265[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      var20 = 1650980855;
      var19 = 1670435299;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = 32974352;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var10003 = (int)4446621249043179181L;
      var20 = -282711670;
      var19 = var10003;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = -40371020;
      var19 = var10003;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var10003 = (int)-9024038563572671452L;
      var20 = -1007020939;
      var19 = var10003;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = 556374388;
      var19 = var10003;
      var265[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      var20 = -164953390;
      var19 = -107710840;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = 264205407;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = -1523493354;
      var19 = 172883321;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = -1350766867;
      var19 = var10003;
      var265[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      var20 = -619062080;
      var19 = 1718359710;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = -1116353960;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = 259066103;
      var19 = 717970601;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = 632970573;
      var19 = var10003;
      var265[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      var10002 = (int)-3382801376787174693L;
      var20 = 774370517;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = 952245769;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var10003 = (int)-5170566463188966602L;
      var20 = -2007645834;
      var19 = var10003;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = -632875422;
      var19 = var10003;
      var265[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      var20 = 505220034;
      var19 = -1963941532;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = -1796363602;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var10003 = (int)-6791960836898657834L;
      var20 = -351497249;
      var19 = var10003;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = 1195831898;
      var19 = var10003;
      var265[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      var10002 = (int)-2462576885773444473L;
      var20 = 995954220;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = -1740647262;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var10003 = (int)4936456848194217885L;
      var20 = -788977496;
      var19 = var10003;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = -2058352623;
      var19 = var10003;
      var265[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      char[] var8 = var265;
      var20 = -948022442;
      var19 = -551213846;
      var10000 = var19 + var20 - 2 * (var19 & var20);
      var20 = 408647606;
      var19 = var10000;
      char[] var267 = new char[var19 + var20 - 2 * (var19 & var20)];
      var10002 = (int)8633552287125304785L;
      var20 = 117322466;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = 19089203;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var10003 = (int)4667721326537339884L;
      var20 = -936302000;
      var19 = var10003;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = 318017948;
      var19 = var10003;
      var267[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      var10002 = (int)6847124438015371804L;
      var20 = -262212785;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = -460089006;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = 457004837;
      var19 = -1956171182;
      int var10004 = var19 + var20 - 2 * (var19 & var20);
      var20 = -1873123981;
      var19 = var10004;
      var10004 = (var19 | var20) - (var19 & var20);
      var10004 = (int)-3947251274282964987L;
      var20 = 1179067874;
      var19 = var10004;
      var10004 = (var19 | var20) & (~var19 | ~var20);
      var20 = 1667288557;
      var19 = var10004;
      var10004 = (var19 | var20) & (~var19 | ~var20);
      var10004 = (int)1375461147452056342L;
      var20 = -349351592;
      var19 = var10004;
      var10004 = var19 & ~var20 | ~var19 & var20;
      var20 = -1558810042;
      var19 = var10004;
      var10004 = (var19 | var20) & ~(var19 & var20);
      var20 = -1173133150;
      var19 = 2100746736;
      var10004 = var19 + var20 - 2 * (var19 & var20);
      var20 = -953831103;
      var19 = var10004;
      var10004 = var19 + var20 - 2 * (var19 & var20);
      var10003 = (int)-7342169783334798528L;
      var20 = -1325780473;
      var19 = var10003;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = 927092036;
      var19 = var10003;
      var267[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      var20 = -962333116;
      var19 = 208329569;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = -892785369;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var10003 = (int)4109803916740627247L;
      var20 = 351021177;
      var19 = var10003;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = 662418101;
      var19 = var10003;
      var10003 = (var19 | var20) - (var19 & var20);
      var10003 = (int)-4026275563183845716L;
      var20 = -1782442132;
      var19 = var10003;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = -1923752301;
      var19 = var10003;
      var267[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      var10002 = (int)2649328041362186669L;
      var20 = -514886330;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = -7301912;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = 2128054944;
      var19 = 85508349;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = 2077192799;
      var19 = var10003;
      var267[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      var10002 = (int)-8204223166872662137L;
      var20 = -2087430977;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = -485352644;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = -2045187934;
      var19 = 295767314;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = -1749426704;
      var19 = var10003;
      var267[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      var10002 = (int)-2251914223164755470L;
      var20 = 1313294119;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = -1176881456;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var10003 = (int)1216322095248215913L;
      var20 = -727295591;
      var19 = var10003;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = -2028147100;
      var19 = var10003;
      var267[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      var20 = 1026982354;
      var19 = 643587740;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = 459988808;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      String var369 = "bsi";
      var20 = -949689966;
      var19 = 1565150795;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = -1708250912;
      var19 = var10003;
      var267[var10002] = (char)((var19 | var20) - (var19 & var20));
      var20 = 1993185495;
      var19 = -713327189;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = -1548294789;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = 743275041;
      var19 = -1648183716;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = -1315972027;
      var19 = var10003;
      var267[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      var10002 = (int)-1850477999443834228L;
      var20 = -1461782867;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = -89686999;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var10003 = (int)-7868368294415128588L;
      var20 = -2110697856;
      var19 = var10003;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = 74610817;
      var19 = var10003;
      var10003 = ((var19 | var20) & ~(var19 & var20)) * ((var19 | var20) & ~(var19 & var20));
      var20 = -516142255;
      var19 = 1121503718;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = -1545338445;
      var19 = var10003;
      var267[var10002] = (char)((var19 | var20) & ~(var19 & var20));
      var10002 = (int)-2260177886350412842L;
      var20 = 2044198806;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = -1959523255;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var10003 = (int)-5080293753125410405L;
      var20 = -881179245;
      var19 = var10003;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = 1227398971;
      var19 = var10003;
      var267[var10002] = (char)((var19 | var20) & ~(var19 & var20));
      char[] var9 = var267;
      var10000 = (int)-6506986444620851618L;
      var20 = -1572366595;
      var19 = var10000;
      var10000 = (var19 | var20) & ~(var19 & var20);
      var20 = 2018508963;
      var19 = var10000;

      for (int var10 = (var19 | var20) - (var19 & var20); var10 < var6.length; var10++) {
         char var331 = var6[var10];
         char var245 = var8[var10 % var8.length];
         char var124 = var331;
         var7[var10] = (char)(var124 & ~var245 | ~var124 & var245);
      }

      char[] var21 = new char[var7.length];
      var20 = -356242282;
      var19 = -2008097259;
      var10000 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1653273219;
      var19 = var10000;

      for (int var11 = (var19 | var20) & (~var19 | ~var20); var11 < var6.length; var11++) {
         char var332 = var7[var11];
         char var248 = var9[var11 % var9.length];
         char var127 = var332;
         var21[var11] = (char)((var127 | var248) & (~var127 | ~var248));
      }

      String var22 = new String(var21);
      int var12 = var22.hashCode();
      var20 = var5;
      var19 = var3;
      var10000 = (var19 & ~var20) - (~var19 & var20);
      var20 = var2;
      var19 = var10000;
      int var13 = var19 + ~var20 + 1;
      char[] var14 = var0.toCharArray();
      char[] var15 = new char[var14.length];
      var20 = 553306617;
      var19 = -1412435438;
      var10000 = (var19 | var20) & ~(var19 & var20);
      var20 = -1959445525;
      var19 = var10000;

      for (int var16 = (var19 | var20) - (var19 & var20); var16 < var15.length; var16++) {
         if (b) {
            var20 = -1370790365;
            var19 = -1602166855;
            int var10001 = var19 & ~var20 | ~var19 & var20;
            var20 = 248232337;
            var19 = var10001;
            var10001 = (var19 | var20) & ~(var19 & var20);
            var10001 = (int)-674570690017314477L;
            var20 = 1501352585;
            var19 = var10001;
            var10001 = (var19 | var20) - (var19 & var20);
            var20 = 1423731672;
            var19 = var10001;
            var10001 = var19 & ~var20 | ~var19 & var20;
            var10000 = (int)-7836090917321816062L;
            var20 = -1532015981;
            var19 = var10000;
            var10000 = (var19 | var20) & (~var19 | ~var20);
            var20 = 4904994;
            var19 = var10000;
            int var18 = var19 & ~var20 | ~var19 & var20;
         }

         int var279 = (int)7404934715006928348L;
         var20 = -503797358;
         var19 = var279;
         var279 = (var19 | var20) & ~(var19 & var20);
         var20 = 151710796;
         var19 = var279;
         switch (var16 % ((var19 | var20) - (var19 & var20))) {
            case 0:
               var20 = var12;
               var19 = var13;
               var10002 = var19 + var20 - 2 * (var19 & var20);
               char var264 = var14[var16];
               var19 = var10002;
               var15[var16] = (char)(var19 + var264 - 2 * (var19 & var264));
               break;
            case 1:
               var20 = var13;
               var19 = var5;
               var10002 = var19 & ~var20 | ~var19 & var20;
               char var262 = var14[var16];
               var19 = var10002;
               var15[var16] = (char)((var19 | var262) - (var19 & var262));
         }
      }

      return new String(var15);
   }

   private static class MarkerToggleEntry implements GuiEntry {
      private final String c;
      private final Supplier<Boolean> d;
      private final Consumer<Boolean> e;
      public static int a;
      public static boolean b;

      public MarkerToggleEntry(String var1, Supplier<Boolean> var2, Consumer<Boolean> var3) {
         this.c = var1;
         this.d = var2;
         this.e = var3;
      }

      @Override
      public String a() {
         return this.c;
      }

      @Override
      public boolean b() {
         return this.d.get();
      }

      @Override
      public void a(boolean var1) {
         this.e.accept(var1);
      }

      @Override
      public boolean d() {
         int var2 = -1101362726;
         int var1 = -188438935;
         int var10000 = (var1 | var2) & ~(var1 & var2);
         var2 = 1251880883;
         var1 = var10000;
         return pulse.Bool.from((var1 | var2) - (var1 & var2));
      }

      public static String b(String var0, String var1, int var2, int var3, int var4, int var5) {
         char[] var6 = var1.toCharArray();
         char[] var7 = new char[var6.length];
         int var18 = -190608091;
         int var17 = -1230589654;
         int var10000 = (var17 | var18) & ~(var17 & var18);
         var18 = 1107639301;
         var17 = var10000;
         char[] var243 = new char[(var17 | var18) - (var17 & var18)];
         var18 = -374982781;
         var17 = 1543370026;
         int var10002 = (var17 | var18) - (var17 & var18);
         var18 = -1302609239;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = 2044418315;
         var17 = 1087972436;
         int var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = 956446061;
         var17 = var10003;
         var243[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var10002 = (int)-7090780721894938049L;
         var18 = 289391400;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = -1837340394;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = 338110662;
         var17 = 1182154620;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = 1381053503;
         var17 = var10003;
         var243[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         var18 = -1272013980;
         var17 = -329242342;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = 1481552508;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = -1036946744;
         var17 = 1698606786;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = -1492123764;
         var17 = var10003;
         var243[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var10002 = (int)8930351076452811348L;
         var18 = -220816651;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = -576071518;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var10003 = (int)-5077141382881969588L;
         var18 = -700498832;
         var17 = var10003;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = -1309219797;
         var17 = var10003;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = 916279384;
         var17 = -328100009;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = -622043364;
         var17 = var10003;
         var243[var10002] = (char)((var17 | var18) & ~(var17 & var18));
         var10002 = (int)9046443232884398285L;
         var18 = -1313594912;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = 24885545;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var10003 = (int)-6700632698004085873L;
         var18 = 1642116280;
         var17 = var10003;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = 1920533611;
         var17 = var10003;
         var10003 = ((var17 | var18) & (~var17 | ~var18)) * ((var17 | var18) & (~var17 | ~var18));
         var10003 = (int)-4424252958249893364L;
         var18 = -1238194972;
         var17 = var10003;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = -1120307251;
         var17 = var10003;
         var243[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var10002 = (int)2736485862423764299L;
         var18 = 1702302018;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = -674067444;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var10003 = (int)-2319870091527309654L;
         var18 = 1000549058;
         var17 = var10003;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = 1591040490;
         var17 = var10003;
         var243[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         var10002 = (int)1193426817410427332L;
         var18 = 1687022147;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = 1772192641;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var10003 = (int)2351382146021681540L;
         var18 = 887375772;
         var17 = var10003;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = -1137367285;
         var17 = var10003;
         var243[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         var18 = 1562752930;
         var17 = 1804009879;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = 916633138;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var10003 = (int)-7586121520088613373L;
         var18 = -1380363550;
         var17 = var10003;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = 160602307;
         var17 = var10003;
         var243[var10002] = (char)((var17 | var18) & ~(var17 & var18));
         var18 = 755407291;
         var17 = 2104205103;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = 1349322396;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var10003 = (int)3579633734250938064L;
         var18 = 1753574594;
         var17 = var10003;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = 210590273;
         var17 = var10003;
         var243[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var18 = -952638517;
         var17 = 1512568787;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = -1659890671;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var10003 = (int)5285902396900408637L;
         var18 = -279782935;
         var17 = var10003;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = -1276075024;
         var17 = var10003;
         var243[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         char[] var8 = var243;
         var10000 = (int)6897344427434853526L;
         var18 = -737505001;
         var17 = var10000;
         var10000 = var17 & ~var18 | ~var17 & var18;
         var18 = 1590482315;
         var17 = var10000;
         char[] var246 = new char[(var17 | var18) & ~(var17 & var18)];
         var10002 = (int)-6137903979519144730L;
         var18 = -1168775081;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = 2031871153;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var10003 = (int)8028361448446338798L;
         var18 = 936047188;
         var17 = var10003;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = -1327555430;
         var17 = var10003;
         var246[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var10002 = (int)1279338007841222641L;
         var18 = -1462882909;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = 2043019859;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var10003 = (int)-6809141707857928317L;
         var18 = 403704235;
         var17 = var10003;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = 1816449389;
         var17 = var10003;
         var10003 = (var17 + var18 - 2 * (var17 & var18)) * (var17 + var18 - 2 * (var17 & var18));
         var10003 = (int)458133822416043104L;
         var18 = -791530658;
         var17 = var10003;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = 274828093;
         var17 = var10003;
         var246[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var18 = 166869287;
         var17 = 1901172300;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = 2023993193;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         int var10004 = (int)-7737057413850625977L;
         var18 = -140158346;
         var17 = var10004;
         var10004 = (var17 | var18) - (var17 & var18);
         var18 = -1358638544;
         var17 = var10004;
         var10004 = (var17 | var18) & (~var17 | ~var18);
         var10004 = (int)8509683387382410440L;
         var18 = 1432571419;
         var17 = var10004;
         var10004 = (var17 | var18) - (var17 & var18);
         var18 = 177988289;
         var17 = var10004;
         var10004 = (var17 | var18) & (~var17 | ~var18);
         var18 = -35694652;
         var17 = 989166189;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = -953505030;
         var17 = var10003;
         var246[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var18 = 470350497;
         var17 = -1299659097;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = -1367327739;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = -331451728;
         var17 = 1012540598;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = -798724604;
         var17 = var10003;
         var246[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var18 = -1408637742;
         var17 = 1925775852;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = -557783750;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var10003 = (int)-3614164349362796897L;
         var18 = 1417890965;
         var17 = var10003;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = 282784330;
         var17 = var10003;
         var246[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var10002 = (int)-6469592247396036388L;
         var18 = -1890234699;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = 1392762476;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var10003 = (int)108782041996239007L;
         var18 = -1315160600;
         var17 = var10003;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = 1790748131;
         var17 = var10003;
         var246[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var10002 = (int)-3798509425706107063L;
         var18 = -66462195;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = -2133221054;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = -943324149;
         var17 = 827622754;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = 483072446;
         var17 = var10003;
         var10003 = (var17 | var18) - (var17 & var18);
         var10003 = (int)-631830457308641181L;
         var18 = 221293018;
         var17 = var10003;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = -51861888;
         var17 = var10003;
         var246[var10002] = (char)((var17 | var18) - (var17 & var18));
         var10002 = (int)-3091475976317439585L;
         var18 = 19647072;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = -1764082696;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = -1024445245;
         var17 = -963695047;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = 75434690;
         var17 = var10003;
         var246[var10002] = (char)((var17 | var18) - (var17 & var18));
         var18 = -870448686;
         var17 = 1778590947;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = -1508039367;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         String var347 = "bru";
         var18 = -408335935;
         var17 = -287319166;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = 158732615;
         var17 = var10003;
         var246[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         var10002 = (int)-6489356996243425178L;
         var18 = -1892925589;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = 622511876;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var10003 = (int)-4581996034812921579L;
         var18 = -1132235378;
         var17 = var10003;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = 1111064488;
         var17 = var10003;
         var246[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         char[] var9 = var246;
         var10000 = (int)1984664354758200510L;
         var18 = -195083681;
         var17 = var10000;
         var10000 = var17 & ~var18 | ~var17 & var18;
         var18 = -740208927;
         var17 = var10000;

         for (int var10 = (var17 | var18) & (~var17 | ~var18); var10 < var6.length; var10++) {
            char var304 = var6[var10];
            char var229 = var8[var10 % var8.length];
            char var118 = var304;
            var7[var10] = (char)(var118 + var229 - 2 * (var118 & var229));
         }

         char[] var19 = new char[var7.length];
         var18 = -13408177;
         var17 = -1355432492;
         var10000 = (var17 | var18) - (var17 & var18);
         var18 = 1342625179;
         var17 = var10000;

         for (int var11 = (var17 | var18) & (~var17 | ~var18); var11 < var6.length; var11++) {
            char var305 = var7[var11];
            char var232 = var9[var11 % var9.length];
            char var121 = var305;
            var19[var11] = (char)(var121 & ~var232 | ~var121 & var232);
         }

         String var20 = new String(var19);
         int var12 = var20.hashCode();
         var18 = var5;
         var17 = var3;
         var10000 = (var17 ^ var18) - 2 * (~var17 & var18);
         var18 = var2;
         var17 = var10000;
         int var13 = 2 * (var17 & ~var18) - (var17 ^ var18);
         char[] var14 = var0.toCharArray();
         char[] var15 = new char[var14.length];
         var10000 = (int)-965289056190479030L;
         var18 = -64098918;
         var17 = var10000;
         var10000 = var17 & ~var18 | ~var17 & var18;
         var18 = 1075587280;
         var17 = var10000;

         for (int var16 = (var17 | var18) & (~var17 | ~var18); var16 < var15.length; var16++) {
            int var10001 = (int)-8021884793460026796L;
            var18 = -1421248903;
            var17 = var10001;
            var10001 = var17 & ~var18 | ~var17 & var18;
            var18 = -1812175825;
            var17 = var10001;
            switch (var16 % ((var17 | var18) - (var17 & var18))) {
               case 0:
                  var18 = var12;
                  var17 = var13;
                  var10002 = (var17 | var18) - (var17 & var18);
                  char var242 = var14[var16];
                  var17 = var10002;
                  var15[var16] = (char)(var17 & ~var242 | ~var17 & var242);
                  break;
               case 1:
                  var18 = var13;
                  var17 = var5;
                  var10002 = var17 & ~var18 | ~var17 & var18;
                  char var240 = var14[var16];
                  var17 = var10002;
                  var15[var16] = (char)((var17 | var240) & ~(var17 & var240));
            }
         }

         return new String(var15);
      }
   }

   private static class AddMarkerEntry implements GuiEntry {
      public static int a;
      public static boolean b;

      @Override
      public String a() {
         int var2 = -1095248775;
         int var1 = -1920460454;
         int var10000 = (var1 | var2) & (~var1 | ~var2);
         var2 = -122202146;
         var1 = var10000;
         var10000 = (var1 | var2) & ~(var1 & var2);
         String var10001 = "brm";
         int var10002 = (int)-569294428176960090L;
         var2 = -776834008;
         var1 = var10002;
         var10002 = (var1 | var2) & ~(var1 & var2);
         var2 = 424366620;
         var1 = var10002;
         var10002 = (var1 | var2) & (~var1 | ~var2);
         int var10003 = (int)4403557064053674819L;
         var2 = 1389659919;
         var1 = var10003;
         var10003 = (var1 | var2) & ~(var1 & var2);
         var2 = 578351806;
         var1 = var10003;
         var2 = (var1 | var2) & ~(var1 & var2);
         var1 = var10002;
         var10002 = 2 * (var1 | var2) - (var1 ^ var2);
         var2 = -1118896826;
         var1 = -842012599;
         var10002 = (var1 | var2) - (var1 & var2);
         var2 = -1038323733;
         var1 = var10002;
         var10002 = (var1 | var2) & (~var1 | ~var2);
         int var10004 = (int)-2382866814905495191L;
         var2 = 623011470;
         var1 = var10004;
         var10004 = (var1 | var2) & (~var1 | ~var2);
         var2 = -1688225809;
         var1 = var10004;
         var10004 = (var1 | var2) - (var1 & var2);
         var2 = -1232433314;
         var1 = 1411413902;
         var10004 = (var1 | var2) - (var1 & var2);
         var2 = -492111649;
         var1 = var10004;
         var10004 = (var1 | var2) & (~var1 | ~var2);
         var10004 = (int)-6621683527023174763L;
         var2 = 1556719263;
         var1 = var10004;
         var10004 = (var1 | var2) & ~(var1 & var2);
         var2 = 141819161;
         var1 = var10004;
         var10004 = var1 + var2 - 2 * (var1 & var2);
         var10004 = (int)3851417033803093638L;
         var2 = 94610370;
         var1 = var10004;
         var10004 = (var1 | var2) - (var1 & var2);
         var2 = -266635948;
         var1 = var10004;
         var10004 = var1 & ~var2 | ~var1 & var2;
         var2 = -35672572;
         var1 = -448122819;
         var10003 = (var1 | var2) - (var1 & var2);
         var2 = -1229509812;
         var1 = var10003;
         var10003 = (var1 | var2) & ~(var1 & var2);
         var2 = 2005410945;
         var1 = -239376715;
         var10004 = (var1 | var2) - (var1 & var2);
         var2 = 614245116;
         var1 = var10004;
         var10004 = var1 & ~var2 | ~var1 & var2;
         int var10005 = (int)-2970909600443581184L;
         var2 = 1993646716;
         var1 = var10005;
         var10005 = (var1 | var2) & (~var1 | ~var2);
         var2 = -1775367999;
         var1 = var10005;
         var2 = var1 & ~var2 | ~var1 & var2;
         var1 = var10004;
         var10004 = (var1 | var2) + (var1 & var2);
         var2 = 1283944902;
         var1 = 1394025667;
         var10004 = var1 & ~var2 | ~var1 & var2;
         var2 = 213649562;
         var1 = var10004;
         var10004 = (var1 | var2) - (var1 & var2);
         var10005 = (int)7795602769850607156L;
         var2 = 125309201;
         var1 = var10005;
         var10005 = (var1 | var2) & ~(var1 & var2);
         var2 = 637319103;
         var1 = var10005;
         var10005 = ((var1 | var2) - (var1 & var2)) * ((var1 | var2) - (var1 & var2));
         var2 = 1541018677;
         var1 = 1359823984;
         var10005 = (var1 | var2) & (~var1 | ~var2);
         var2 = 181733333;
         var1 = var10005;
         return b(
            "鷲낡鷖낡鷑낯鶢났鶮남駅낭鷕냞鷟",
            "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁼ꤄絤蹁⑿謥㑤=\ua7cb꒴ꁣꤎ絳蹘⑩謚㑲|ꟳꓱꁜꤜ絥蹞⑿謥㑾}ꟳ꒦ꁓ꤀絷蹉⑵謹㑃}\ua7e1꒲ꁽ꤀絓蹄⑮謥㑮",
            var10002,
            var10003,
            var10004,
            (var1 | var2) & ~(var1 & var2)
         );
      }

      @Override
      public boolean b() {
         return MarkerOptions.e();
      }

      @Override
      public void a(boolean var1) {
         MarkerOptions.d(var1);
      }

      @Override
      public boolean d() {
         int var10000 = (int)2668084806610769475L;
         int var2 = 2121688732;
         int var1 = var10000;
         var10000 = var1 & ~var2 | ~var1 & var2;
         var2 = -1496272673;
         var1 = var10000;
         return pulse.Bool.from((var1 | var2) - (var1 & var2));
      }

      @Override
      public boolean c() {
         return MarkerOptions.d();
      }

      public static String b(String var0, String var1, int var2, int var3, int var4, int var5) {
         char[] var6 = var1.toCharArray();
         char[] var7 = new char[var6.length];
         int var18 = 254328968;
         int var17 = 1876772239;
         int var10000 = (var17 | var18) - (var17 & var18);
         var18 = 1626703117;
         var17 = var10000;
         char[] var249 = new char[var17 + var18 - 2 * (var17 & var18)];
         int var10002 = (int)-1592653940631875967L;
         var18 = 1552543656;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = -1106566871;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = -1552037823;
         var17 = 2082264400;
         int var10003 = (var17 | var18) - (var17 & var18);
         var18 = -547269341;
         var17 = var10003;
         var249[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var18 = 1254480327;
         var17 = 214421630;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = 1174538680;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var10003 = (int)1083348773782347129L;
         var18 = -1099677810;
         var17 = var10003;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = -212680334;
         var17 = var10003;
         var249[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var10002 = (int)6285957037328374152L;
         var18 = 2075180218;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = -2132564688;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = 459457229;
         var17 = 804320955;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = 881989616;
         var17 = var10003;
         var249[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var10002 = (int)703899099758140738L;
         var18 = 147610679;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = 2114011510;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = 1882280542;
         var17 = -1151114404;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = 1452486254;
         var17 = var10003;
         var10003 = ((var17 | var18) & ~(var17 & var18)) * ((var17 | var18) & ~(var17 & var18));
         var10003 = (int)5311385403209124082L;
         var18 = 178302394;
         var17 = var10003;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = 366591323;
         var17 = var10003;
         var249[var10002] = (char)((var17 | var18) - (var17 & var18));
         var10002 = (int)-7456279063015929462L;
         var18 = 1456987013;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = 672600587;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var10003 = (int)-3378410189997559956L;
         var18 = 654476662;
         var17 = var10003;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = 1790164567;
         var17 = var10003;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var10003 = (int)-6225117146065710593L;
         var18 = -2079223291;
         var17 = var10003;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = -1952558369;
         var17 = var10003;
         var249[var10002] = (char)((var17 | var18) - (var17 & var18));
         var10002 = (int)-2148411218656296085L;
         var18 = -908265554;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = -379849536;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var10003 = (int)7405102268416783327L;
         var18 = 961793243;
         var17 = var10003;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = 1127774854;
         var17 = var10003;
         var249[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         var10002 = (int)-1083981960783930793L;
         var18 = 1588801437;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = 37352908;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var10003 = (int)-1793120314578245960L;
         var18 = -467510795;
         var17 = var10003;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = -433801634;
         var17 = var10003;
         var249[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var10002 = (int)-1302775224868619057L;
         var18 = -125022503;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = 587919889;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = -1298578987;
         var17 = 686569744;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = -1703588633;
         var17 = var10003;
         var249[var10002] = (char)((var17 | var18) & ~(var17 & var18));
         var18 = 568858004;
         var17 = 912718980;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = 395241752;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = 16408236;
         var17 = 1997183599;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = 2012269712;
         var17 = var10003;
         var249[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var10002 = (int)-6391183585657687648L;
         var18 = -1973042671;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = -2131414088;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var10003 = (int)-1953414756363118468L;
         var18 = -1083562141;
         var17 = var10003;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = 1284667451;
         var17 = var10003;
         var249[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         char[] var8 = var249;
         var18 = -1704276573;
         var17 = -696471025;
         var10000 = (var17 | var18) & (~var17 | ~var18);
         var18 = 1276542886;
         var17 = var10000;
         char[] var251 = new char[var17 & ~var18 | ~var17 & var18];
         var18 = -339063563;
         var17 = -1481808480;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = 1281829205;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = 960654543;
         var17 = 935165678;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = 251615745;
         var17 = var10003;
         var251[var10002] = (char)((var17 | var18) & ~(var17 & var18));
         var10002 = (int)2905906087728454703L;
         var18 = 886306741;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = -111088741;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var10003 = (int)-3266030682569736098L;
         var18 = 1478443228;
         var17 = var10003;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = 1854106828;
         var17 = var10003;
         var10003 = ((var17 | var18) & (~var17 | ~var18)) * ((var17 | var18) & (~var17 | ~var18));
         var18 = 2114449089;
         var17 = 130516753;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = 2042686931;
         var17 = var10003;
         var251[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var10002 = (int)-2449021777059854259L;
         var18 = 1764892094;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = 974444017;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var10003 = (int)-5405269889564357332L;
         var18 = -986541269;
         var17 = var10003;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = -1867846893;
         var17 = var10003;
         var10003 = (var17 & ~var18 | ~var17 & var18) * (var17 & ~var18 | ~var17 & var18);
         var10003 = (int)-3334651183565070545L;
         var18 = -1125946019;
         var17 = var10003;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = 757560609;
         var17 = var10003;
         var251[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var10002 = (int)3272124020669437610L;
         var18 = -625722521;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = 62025166;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var10003 = (int)-8456397256954442613L;
         var18 = -1093643110;
         var17 = var10003;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = 359981075;
         var17 = var10003;
         var251[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var10002 = (int)-5431757418630765730L;
         var18 = 1879023253;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = 1670659535;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = -743944857;
         var17 = -1270874015;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = 1743287622;
         var17 = var10003;
         var251[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var10002 = (int)-7103924627165352013L;
         var18 = 1520619275;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = -871751491;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = 463594137;
         var17 = 1027922068;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = 652542617;
         var17 = var10003;
         var251[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         var18 = 1768465115;
         var17 = 38647547;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = 1797592102;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var10003 = (int)8541597173648148255L;
         var18 = -1589969022;
         var17 = var10003;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = 1741162127;
         var17 = var10003;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = -1918728500;
         var17 = -2042588311;
         int var10004 = var17 & ~var18 | ~var17 & var18;
         var18 = 1838810748;
         var17 = var10004;
         var18 = var17 & ~var18 | ~var17 & var18;
         var17 = var10003;
         var10003 = var17 - ~var18 - 1;
         var18 = 63573870;
         var17 = 1100462841;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = 1113404078;
         var17 = var10003;
         var251[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var10002 = (int)-4633812004338899305L;
         var18 = -782079045;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = -1542320853;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = -1841559995;
         var17 = 2106788719;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = -273736430;
         var17 = var10003;
         var251[var10002] = (char)((var17 | var18) & ~(var17 & var18));
         var18 = -1889837231;
         var17 = 1826982288;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = -474032439;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var10003 = (int)-1463002560374060975L;
         var18 = 1365134703;
         var17 = var10003;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = 533438074;
         var17 = var10003;
         var10003 = ((var17 | var18) - (var17 & var18)) * ((var17 | var18) - (var17 & var18));
         var18 = 2053987078;
         var17 = 826596421;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = 1260979271;
         var17 = var10003;
         var251[var10002] = (char)((var17 | var18) - (var17 & var18));
         var10002 = (int)-945017352650958318L;
         var18 = 1522848633;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = -563345054;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var10003 = (int)-923878302134320148L;
         var18 = 522249770;
         var17 = var10003;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = 1589057269;
         var17 = var10003;
         var251[var10002] = (char)((var17 | var18) - (var17 & var18));
         char[] var9 = var251;
         var10000 = (int)1852924363714044928L;
         var18 = 1289280157;
         var17 = var10000;
         var10000 = var17 & ~var18 | ~var17 & var18;
         var18 = 1913618077;
         var17 = var10000;

         for (int var10 = var17 + var18 - 2 * (var17 & var18); var10 < var6.length; var10++) {
            char var312 = var6[var10];
            char var235 = var8[var10 % var8.length];
            char var121 = var312;
            var7[var10] = (char)(var121 + var235 - 2 * (var121 & var235));
         }

         char[] var19 = new char[var7.length];
         var10000 = (int)1210952579503004065L;
         var18 = 854752675;
         var17 = var10000;
         var10000 = var17 & ~var18 | ~var17 & var18;
         var18 = -1209211902;
         var17 = var10000;

         for (int var11 = var17 & ~var18 | ~var17 & var18; var11 < var6.length; var11++) {
            char var313 = var7[var11];
            char var238 = var9[var11 % var9.length];
            char var124 = var313;
            var19[var11] = (char)(var124 & ~var238 | ~var124 & var238);
         }

         String var20 = new String(var19);
         int var12 = var20.hashCode();
         var18 = var5;
         var17 = var3;
         var10000 = (var17 & ~var18) - (~var17 & var18);
         var18 = var2;
         var17 = var10000;
         int var13 = 2 * (var17 & ~var18) - (var17 ^ var18);
         char[] var14 = var0.toCharArray();
         char[] var15 = new char[var14.length];
         var18 = -1269725578;
         var17 = 1989914207;
         var10000 = var17 + var18 - 2 * (var17 & var18);
         var18 = -1026938839;
         var17 = var10000;

         for (int var16 = (var17 | var18) & (~var17 | ~var18); var16 < var15.length; var16++) {
            var18 = -117276450;
            var17 = -609924171;
            int var10001 = var17 + var18 - 2 * (var17 & var18);
            var18 = 581421929;
            var17 = var10001;
            switch (var16 % ((var17 | var18) & ~(var17 & var18))) {
               case 0:
                  var18 = var12;
                  var17 = var13;
                  var10002 = var17 & ~var18 | ~var17 & var18;
                  char var248 = var14[var16];
                  var17 = var10002;
                  var15[var16] = (char)(var17 & ~var248 | ~var17 & var248);
                  break;
               case 1:
                  var18 = var13;
                  var17 = var5;
                  var10002 = (var17 | var18) & (~var17 | ~var18);
                  char var246 = var14[var16];
                  var17 = var10002;
                  var15[var16] = (char)(var17 + var246 - 2 * (var17 & var246));
            }
         }

         return new String(var15);
      }
   }

   private static class MarkerHeaderEntry implements GuiEntry {
      public static int a;
      public static boolean b;

      @Override
      public String a() {
         int var10000 = (int)8071427760344579578L;
         int var2 = 636512714;
         int var1 = var10000;
         var10000 = (var1 | var2) & (~var1 | ~var2);
         var2 = -120608902;
         var1 = var10000;
         var10000 = var1 & ~var2 | ~var1 & var2;
         var2 = 585334373;
         var1 = -1183051128;
         int var10001 = (var1 | var2) - (var1 & var2);
         var2 = 388757012;
         var1 = var10001;
         var10001 = (var1 & ~var2 | ~var1 & var2) * (var1 & ~var2 | ~var1 & var2);
         String var10002 = "dqo";
         int var54 = (int)-5399566123935901912L;
         var2 = 2028739465;
         var1 = var54;
         int var55 = (var1 | var2) - (var1 & var2);
         var2 = -1625347666;
         var1 = var55;
         int var56 = (var1 | var2) & (~var1 | ~var2);
         var2 = -1712475146;
         var1 = -380194902;
         int var10003 = var1 & ~var2 | ~var1 & var2;
         var2 = -1839524156;
         var1 = var10003;
         var10003 = ((var1 | var2) & (~var1 | ~var2)) * ((var1 | var2) & (~var1 | ~var2));
         var2 = 1725037157;
         var1 = 1962161153;
         var10003 = (var1 | var2) - (var1 & var2);
         var2 = 404889571;
         var1 = var10003;
         var10003 = var1 & ~var2 | ~var1 & var2;
         int var10004 = (int)-6987147774333258177L;
         var2 = -534015761;
         var1 = var10004;
         var10004 = var1 & ~var2 | ~var1 & var2;
         var2 = -70070434;
         var1 = var10004;
         var10004 = (var1 | var2) & ~(var1 & var2);
         int var10005 = (int)769123852882084274L;
         var2 = 1485128747;
         var1 = var10005;
         var10005 = (var1 | var2) - (var1 & var2);
         var2 = 1544912804;
         var1 = var10005;
         var2 = (var1 | var2) - (var1 & var2);
         var1 = var10004;
         var10004 = (var1 | var2) + (var1 & var2);
         var10004 = (int)3987183312345681428L;
         var2 = -1135177265;
         var1 = var10004;
         var10004 = (var1 | var2) & ~(var1 & var2);
         var2 = 1403804041;
         var1 = var10004;
         var10004 = var1 & ~var2 | ~var1 & var2;
         var2 = 130361571;
         var1 = 216106211;
         int var10006 = var1 + var2 - 2 * (var1 & var2);
         var2 = 186952722;
         var1 = var10006;
         var10006 = var1 + var2 - 2 * (var1 & var2);
         var10006 = (int)2136479323355714660L;
         var2 = -1210064414;
         var1 = var10006;
         var10006 = var1 + var2 - 2 * (var1 & var2);
         var2 = -1253411449;
         var1 = var10006;
         var10006 = (var1 | var2) - (var1 & var2);
         var10006 = (int)-5231798529411721875L;
         var2 = -723334749;
         var1 = var10006;
         var10006 = (var1 | var2) & (~var1 | ~var2);
         var2 = 987897055;
         var1 = var10006;
         var10006 = (var1 | var2) & ~(var1 & var2);
         var10005 = (int)-8024380940192239901L;
         var2 = -1555892929;
         var1 = var10005;
         var10005 = (var1 | var2) - (var1 & var2);
         var2 = 1712149163;
         var1 = var10005;
         return b(
            "舟渽艏渴艎湆艁橖舲湃艌湌舾",
            "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁼ꤄絤蹁⑿謥㑤=\ua7cb꒴ꁣꤎ絳蹘⑩謚㑲|ꟳꓱꁀꤐ絿蹉⑱謚㑶`\ua7ed꒰ꁣꤱ絹蹍⑽謻㑲W\ua7e8꒡ꁣꤜ",
            var56,
            var10003,
            var10004,
            var1 + var2 - 2 * (var1 & var2)
         );
      }

      @Override
      public boolean b() {
         return MarkerOptions.a();
      }

      @Override
      public void a(boolean var1) {
         MarkerOptions.a(var1);
      }

      @Override
      public boolean d() {
         int var10000 = (int)714528658815108510L;
         int var2 = 878584235;
         int var1 = var10000;
         var10000 = (var1 | var2) & (~var1 | ~var2);
         var2 = -1092819916;
         var1 = var10000;
         return pulse.Bool.from(var1 + var2 - 2 * (var1 & var2));
      }

      @Override
      public int f() {
         return MarkerOptions.b();
      }

      @Override
      public void a(int var1) {
         MarkerOptions.a(var1);
      }

      @Override
      public boolean h() {
         int var2 = 407125703;
         int var1 = -1889560010;
         int var10000 = var1 + var2 - 2 * (var1 & var2);
         var2 = -1759795983;
         var1 = var10000;
         return pulse.Bool.from(var1 & (var2 ^ -1) | (var1 ^ -1) & var2);
      }

      public static String b(String var0, String var1, int var2, int var3, int var4, int var5) {
         char[] var6 = var1.toCharArray();
         char[] var7 = new char[var6.length];
         int var18 = 1838533073;
         int var17 = 1688584286;
         int var10000 = (var17 | var18) & (~var17 | ~var18);
         var18 = 154143109;
         var17 = var10000;
         char[] var253 = new char[(var17 | var18) & (~var17 | ~var18)];
         var18 = -510908054;
         var17 = 2076538554;
         int var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = -1706467376;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = 1618299189;
         var17 = -773609965;
         int var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = -1315526892;
         var17 = var10003;
         var253[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         var10002 = (int)7838937912661962263L;
         var18 = -680109725;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = 335066997;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var10003 = (int)1415393227923136512L;
         var18 = -239762394;
         var17 = var10003;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = -1234204765;
         var17 = var10003;
         var253[var10002] = (char)((var17 | var18) & ~(var17 & var18));
         var18 = -1621328549;
         var17 = -885269427;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = 1416077588;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = -662224398;
         var17 = 1574267949;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = -2058219943;
         var17 = var10003;
         var253[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         var10002 = (int)2607528921810007338L;
         var18 = 820839069;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = 115865524;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         int var10004 = (int)2736925544281883225L;
         var18 = -356392059;
         var17 = var10004;
         var10004 = var17 & ~var18 | ~var17 & var18;
         var18 = -245587497;
         var17 = var10004;
         var10004 = (var17 | var18) - (var17 & var18);
         var18 = -878104657;
         var17 = -85635099;
         var10004 = var17 & ~var18 | ~var17 & var18;
         var18 = 827088969;
         var17 = var10004;
         var10004 = (var17 | var18) - (var17 & var18);
         var10004 = (int)-3084562299657036205L;
         var18 = 618531429;
         var17 = var10004;
         var10004 = (var17 | var18) - (var17 & var18);
         var18 = 1170166846;
         var17 = var10004;
         var10004 = var17 + var18 - 2 * (var17 & var18);
         var10003 = (int)-6535844159296289940L;
         var18 = 354248167;
         var17 = var10003;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = -2067218792;
         var17 = var10003;
         var253[var10002] = (char)((var17 | var18) - (var17 & var18));
         var10002 = (int)-392613011579931010L;
         var18 = -145143599;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = 969785003;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = 769852135;
         var17 = -1417255089;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = 445802030;
         var17 = var10003;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var10003 = (int)2947634839959434561L;
         var18 = -1777569581;
         var17 = var10003;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = -1655434057;
         var17 = var10003;
         var253[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var10002 = (int)-3371433834206052981L;
         var18 = -1931965222;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = -726486700;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var10003 = (int)-4044148865387436272L;
         var18 = -1595271124;
         var17 = var10003;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = 52574910;
         var17 = var10003;
         var253[var10002] = (char)((var17 | var18) & ~(var17 & var18));
         var18 = -183375811;
         var17 = 199207557;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = -20036930;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = 278197036;
         var17 = 1012304110;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = 750940881;
         var17 = var10003;
         var253[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         var10002 = (int)5814055082447652069L;
         var18 = 276948405;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = 89727319;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = 758413142;
         var17 = -1731370868;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = -1241963528;
         var17 = var10003;
         var253[var10002] = (char)((var17 | var18) & ~(var17 & var18));
         var18 = -78423500;
         var17 = 739544612;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = -683158504;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var10003 = (int)-2369278120019726346L;
         var18 = -2076312437;
         var17 = var10003;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = -702309586;
         var17 = var10003;
         var253[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var18 = 689466511;
         var17 = -747278870;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = -93519508;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var10003 = (int)371689295169496465L;
         var18 = 522022415;
         var17 = var10003;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = -897987398;
         var17 = var10003;
         var253[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         char[] var8 = var253;
         var10000 = (int)7338149408640925193L;
         var18 = -586361961;
         var17 = var10000;
         var10000 = var17 + var18 - 2 * (var17 & var18);
         var18 = -675009132;
         var17 = var10000;
         char[] var256 = new char[var17 + var18 - 2 * (var17 & var18)];
         var18 = -559540034;
         var17 = 1217929623;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = -1774307031;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var10003 = (int)7793577327034922967L;
         var18 = -2013589470;
         var17 = var10003;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = -326160427;
         var17 = var10003;
         var256[var10002] = (char)((var17 | var18) & ~(var17 & var18));
         var18 = 957633899;
         var17 = 1699196587;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = 1549007809;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var10003 = (int)8619166478171478684L;
         var18 = -943328781;
         var17 = var10003;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = 2863967;
         var17 = var10003;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = -1212401121;
         var17 = -1828342200;
         var10004 = (var17 | var18) & (~var17 | ~var18);
         var18 = -946783245;
         var17 = var10004;
         var18 = (var17 | var18) & (~var17 | ~var18);
         var17 = var10003;
         var10003 = var17 - ~var18 - 1;
         var18 = -1660776724;
         var17 = 1291047884;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = -772679389;
         var17 = var10003;
         var256[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var18 = -666999516;
         var17 = 124681872;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = -548398154;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         String var337 = "dqp";
         var18 = 571098176;
         var17 = 996427021;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = 426673694;
         var17 = var10003;
         var256[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         var18 = 1657837801;
         var17 = 70837794;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = 1726512840;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = 170508748;
         var17 = -957243489;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = -858233263;
         var17 = var10003;
         var256[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var18 = 196337973;
         var17 = -405283203;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = -328974516;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var10003 = (int)-1819224385265227588L;
         var18 = 886713760;
         var17 = var10003;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = 1498660188;
         var17 = var10003;
         var256[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         var18 = 831427950;
         var17 = 1289287963;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = 2102815856;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var10003 = (int)8804325664157047183L;
         var18 = 2128348415;
         var17 = var10003;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = 741582308;
         var17 = var10003;
         var256[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         var18 = 720518793;
         var17 = 514111978;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = 878085989;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = 269418777;
         var17 = 1383794557;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = -404279424;
         var17 = var10003;
         var10003 = ((var17 | var18) - (var17 & var18)) * ((var17 | var18) - (var17 & var18));
         var18 = 2027390140;
         var17 = 9547980;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = 2017899337;
         var17 = var10003;
         var256[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var18 = 1549954416;
         var17 = -1428183362;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = -155333687;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var10003 = (int)2815535071709725836L;
         var18 = -312258115;
         var17 = var10003;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = 344638729;
         var17 = var10003;
         var256[var10002] = (char)((var17 | var18) & ~(var17 & var18));
         var18 = 1191210468;
         var17 = 629833515;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = 1653215943;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var10003 = (int)3915269602094211442L;
         var18 = 1329213603;
         var17 = var10003;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = -244844616;
         var17 = var10003;
         var10003 = (var17 & ~var18 | ~var17 & var18) * (var17 & ~var18 | ~var17 & var18);
         var18 = 80060138;
         var17 = 1545644306;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = 1491449084;
         var17 = var10003;
         var256[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var10002 = (int)6257328897846051067L;
         var18 = 400873024;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = -1056811342;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = 1648120018;
         var17 = 1609447568;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = 1037196145;
         var17 = var10003;
         var256[var10002] = (char)((var17 | var18) & ~(var17 & var18));
         char[] var9 = var256;
         var10000 = (int)8148199793400119527L;
         var18 = -1524226095;
         var17 = var10000;
         var10000 = var17 + var18 - 2 * (var17 & var18);
         var18 = 564176694;
         var17 = var10000;

         for (int var10 = var17 + var18 - 2 * (var17 & var18); var10 < var6.length; var10++) {
            char var309 = var6[var10];
            char var239 = var8[var10 % var8.length];
            char var123 = var309;
            var7[var10] = (char)((var123 | var239) - (var123 & var239));
         }

         char[] var19 = new char[var7.length];
         var10000 = (int)-3277930377826880152L;
         var18 = -1861056804;
         var17 = var10000;
         var10000 = var17 & ~var18 | ~var17 & var18;
         var18 = -700959820;
         var17 = var10000;

         for (int var11 = (var17 | var18) & ~(var17 & var18); var11 < var6.length; var11++) {
            char var310 = var7[var11];
            char var242 = var9[var11 % var9.length];
            char var126 = var310;
            var19[var11] = (char)((var126 | var242) - (var126 & var242));
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
         var10000 = (int)-1154935644637996549L;
         var18 = -771577301;
         var17 = var10000;
         var10000 = (var17 | var18) - (var17 & var18);
         var18 = -1461128240;
         var17 = var10000;

         for (int var16 = (var17 | var18) & (~var17 | ~var18); var16 < var15.length; var16++) {
            var18 = 173783867;
            var17 = -2085395189;
            int var10001 = (var17 | var18) & (~var17 | ~var18);
            var18 = -1981227470;
            var17 = var10001;
            switch (var16 % ((var17 | var18) - (var17 & var18))) {
               case 0:
                  var18 = var12;
                  var17 = var13;
                  var10002 = (var17 | var18) & (~var17 | ~var18);
                  char var252 = var14[var16];
                  var17 = var10002;
                  var15[var16] = (char)((var17 | var252) & ~(var17 & var252));
                  break;
               case 1:
                  var18 = var13;
                  var17 = var5;
                  var10002 = var17 & ~var18 | ~var17 & var18;
                  char var250 = var14[var16];
                  var17 = var10002;
                  var15[var16] = (char)((var17 | var250) & (~var17 | ~var250));
            }
         }

         return new String(var15);
      }
   }

   private static class MarkerEntrySource implements GuiEntrySource {
      private final List<GuiEntry> c = new ArrayList<>();
      private final ModuleGrid d;
      public static int a;
      public static boolean b;

      public MarkerEntrySource() {
         this.c.add(new MarkersTab.MarkerHeaderEntry());
         int var10003 = (int)3829097809442721798L;
         int var2 = -1843443137;
         int var1 = var10003;
         var10003 = (var1 | var2) & (~var1 | ~var2);
         var2 = 1662377994;
         var1 = var10003;
         var10003 = (var1 + var2 - 2 * (var1 & var2)) * (var1 + var2 - 2 * (var1 & var2));
         var2 = -1117609674;
         var1 = -137789290;
         int var10004 = (var1 | var2) & (~var1 | ~var2);
         var2 = -1233849102;
         var1 = var10004;
         var10004 = ((var1 | var2) & ~(var1 & var2)) * ((var1 | var2) & ~(var1 & var2));
         var2 = 1263406909;
         var1 = -771210254;
         int var10005 = (var1 | var2) & (~var1 | ~var2);
         var2 = 388980313;
         var1 = var10005;
         var10005 = (var1 | var2) - (var1 & var2);
         var2 = -548873238;
         var1 = -1387497370;
         int var10006 = (var1 | var2) & ~(var1 & var2);
         var2 = -995408871;
         var1 = var10006;
         var2 = var1 + var2 - 2 * (var1 & var2);
         var1 = var10005;
         var10005 = var1 - ~var2 - 1;
         var2 = -1670329175;
         var1 = 890975605;
         var10005 = (var1 | var2) & (~var1 | ~var2);
         var2 = 775327458;
         var1 = var10005;
         var10005 = (var1 | var2) - (var1 & var2);
         var2 = -1616828424;
         var1 = 801036373;
         var10006 = var1 & ~var2 | ~var1 & var2;
         var2 = 1203209215;
         var1 = var10006;
         var10006 = (var1 | var2) & ~(var1 & var2);
         int var10007 = (int)3893473439190939708L;
         var2 = 1518153648;
         var1 = var10007;
         var10007 = (var1 | var2) & ~(var1 & var2);
         var2 = -905226638;
         var1 = var10007;
         var2 = (var1 | var2) & ~(var1 & var2);
         var1 = var10006;
         var10006 = (var1 ^ var2) + 2 * (var1 & var2);
         var2 = 1731933910;
         var1 = -1326072183;
         var10006 = (var1 | var2) & ~(var1 & var2);
         var2 = 604731873;
         var1 = var10006;
         var10006 = (var1 | var2) & ~(var1 & var2);
         var2 = -626359477;
         var1 = -1117290176;
         var10007 = (var1 | var2) & (~var1 | ~var2);
         var2 = 1799496609;
         var1 = var10007;
         var10007 = var1 & ~var2 | ~var1 & var2;
         int var10008 = (int)6902249076478781138L;
         var2 = -57544151;
         var1 = var10008;
         var10008 = (var1 | var2) & (~var1 | ~var2);
         var2 = 1641950865;
         var1 = var10008;
         var2 = (var1 | var2) & ~(var1 & var2);
         var1 = var10007;
         var10007 = var1 - ~var2 - 1;
         var10007 = (int)-984498361239103492L;
         var2 = -519014947;
         var1 = var10007;
         var10007 = var1 & ~var2 | ~var1 & var2;
         var2 = 361791494;
         var1 = var10007;
         var10007 = (var1 | var2) & ~(var1 & var2);
         var2 = 1354774721;
         var1 = 77900429;
         var10008 = var1 & ~var2 | ~var1 & var2;
         var2 = 1330134925;
         var1 = var10008;
         var10008 = (var1 | var2) & ~(var1 & var2);
         var2 = -2098947418;
         var1 = -970361966;
         int var10009 = (var1 | var2) & (~var1 | ~var2);
         var2 = 589838473;
         var1 = var10009;
         var2 = var1 & ~var2 | ~var1 & var2;
         var1 = var10008;
         var10008 = 2 * (var1 | var2) - (var1 ^ var2);
         var10008 = (int)-7452051344378976720L;
         var2 = 1640511830;
         var1 = var10008;
         var10008 = var1 & ~var2 | ~var1 & var2;
         var2 = -1819023512;
         var1 = var10008;
         this.c
            .add(
               new MarkersTab.MarkerToggleEntry(
                  b(
                     "煐繉焎繆煼穜焍繀煹縼焎繄",
                     "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁼ꤄絤蹁⑿謥㑤=\ua7cb꒴ꁣꤎ絳蹘⑩謚㑲|ꟳꓱꁂ꤀絢蹞⑳謹㑰aꟅ꒺ꁿꤑ絳蹄⑮",
                     var10005,
                     var10006,
                     var10007,
                     (var1 | var2) & (~var1 | ~var2)
                  ),
                  MarkerOptions::c,
                  MarkerOptions::b
               )
            );
         List var10000 = this.c;
         var2 = -174338190;
         var1 = 1497003934;
         var10004 = (var1 | var2) & (~var1 | ~var2);
         var2 = -1398687490;
         var1 = var10004;
         var10004 = (var1 | var2) & (~var1 | ~var2);
         var2 = -1436051576;
         var1 = -1396172516;
         var10004 = (var1 | var2) & ~(var1 & var2);
         var2 = 112168603;
         var1 = var10004;
         var10004 = var1 & ~var2 | ~var1 & var2;
         var2 = 1346524005;
         var1 = -1053383613;
         var10005 = (var1 | var2) - (var1 & var2);
         var2 = -1854605533;
         var1 = var10005;
         var10005 = (var1 | var2) & ~(var1 & var2);
         var10005 = (int)5571361734328963142L;
         var2 = 1846793551;
         var1 = var10005;
         var10005 = (var1 | var2) - (var1 & var2);
         var2 = -806222588;
         var1 = var10005;
         var10005 = var1 + var2 - 2 * (var1 & var2);
         var2 = -829096805;
         var1 = 987639107;
         var10005 = var1 & ~var2 | ~var1 & var2;
         var2 = -2121005488;
         var1 = var10005;
         var10005 = var1 + var2 - 2 * (var1 & var2);
         var2 = -923608145;
         var1 = -720330802;
         var10006 = (var1 | var2) & ~(var1 & var2);
         var2 = 2094859724;
         var1 = var10006;
         var2 = var1 & ~var2 | ~var1 & var2;
         var1 = var10005;
         var10005 = (var1 & ~var2) + (var2 & ~var1) + 2 * (var1 & var2);
         var2 = -126723019;
         var1 = -2202039;
         var10005 = var1 + var2 - 2 * (var1 & var2);
         var2 = -2131669694;
         var1 = var10005;
         var10005 = var1 & ~var2 | ~var1 & var2;
         String var156 = "bnj";
         var10006 = (int)-63862963144422013L;
         var2 = 907896831;
         var1 = var10006;
         var10006 = (var1 | var2) & ~(var1 & var2);
         var2 = -356926952;
         var1 = var10006;
         var10006 = var1 & ~var2 | ~var1 & var2;
         var10007 = (int)-2870989834663711618L;
         var2 = 751752994;
         var1 = var10007;
         var10007 = (var1 | var2) - (var1 & var2);
         var2 = 273806450;
         var1 = var10007;
         var10007 = var1 + var2 - 2 * (var1 & var2);
         var2 = 1545365221;
         var1 = 1130999966;
         var10008 = var1 & ~var2 | ~var1 & var2;
         var2 = -1562985137;
         var1 = var10008;
         var2 = (var1 | var2) & (~var1 | ~var2);
         var1 = var10007;
         var10007 = (var1 & ~var2) + (var2 & ~var1) + 2 * (var1 & var2);
         var2 = 631392529;
         var1 = 69003549;
         var10007 = (var1 | var2) - (var1 & var2);
         var2 = 14682554;
         var1 = var10007;
         var10007 = (var1 | var2) & (~var1 | ~var2);
         var10009 = (int)-7828426206016510162L;
         var2 = 1896065555;
         var1 = var10009;
         var10009 = var1 & ~var2 | ~var1 & var2;
         var2 = -653963970;
         var1 = var10009;
         var10009 = var1 + var2 - 2 * (var1 & var2);
         var2 = -268452403;
         var1 = 1282787370;
         var10009 = var1 + var2 - 2 * (var1 & var2);
         var2 = -1551206943;
         var1 = var10009;
         var10009 = var1 + var2 - 2 * (var1 & var2);
         var10009 = (int)-6377411106875884874L;
         var2 = 1828850178;
         var1 = var10009;
         var10009 = (var1 | var2) & (~var1 | ~var2);
         var2 = 1225404599;
         var1 = var10009;
         var10009 = var1 + var2 - 2 * (var1 & var2);
         var10008 = (int)5629234312466458745L;
         var2 = -269080356;
         var1 = var10008;
         var10008 = (var1 | var2) & ~(var1 & var2);
         var2 = -1345022447;
         var1 = var10008;
         var10000.add(
            new MarkersTab.MarkerToggleEntry(
               b(
                  "煜僴焎僸畬僺煹傄煶僾畠哦焍僸煽傍焎僾焃",
                  "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁼ꤄絤蹁⑿謥㑤=\ua7cb꒴ꁣꤎ絳蹘⑩謚㑲|ꟳꓱꁂ꤀絢蹞⑳謹㑰aꟅ꒺ꁿꤑ絳蹄⑮",
                  var10005,
                  var10006,
                  var10007,
                  var1 + var2 - 2 * (var1 & var2)
               ),
               MarkerOptions::d,
               MarkerOptions::c
            )
         );
         this.c.add(new MarkersTab.AddMarkerEntry());
         this.d = new ModuleGrid(this);
      }

      @Override
      public List<? extends GuiEntry> e() {
         return this.c.stream().filter(GuiEntry::c).collect(Collectors.toList());
      }

      @Override
      public int f() {
         int var10000 = (int)7882201469061827138L;
         int var2 = -2109584553;
         int var1 = var10000;
         var10000 = var1 & ~var2 | ~var1 & var2;
         var2 = -247709420;
         var1 = var10000;
         return (var1 | var2) - (var1 & var2);
      }

      public void a(MatrixStack var1, Renderer2D var2, float var3, float var4, int var5, int var6) {
         this.d.a(var1, var2, var3, var4, var5, var6);
      }

      public void a(MatrixStack var1, Renderer2D var2, int var3, int var4) {
         this.d.a(var1, var2, var3, var4);
      }

      public void a(float var1, float var2, int var3, int var4) {
         this.d.a(var1, var2, var3, var4);
      }

      public void b(float var1, float var2, int var3, int var4) {
         this.d.b(var1, var2, var3, var4);
      }

      public void c(float var1, float var2, int var3, int var4) {
         this.d.c(var1, var2, var3, var4);
      }

      public void a(float var1, float var2, int var3, int var4, double var5, double var7) {
         this.d.a(var1, var2, var3, var4, var5, var7);
      }

      public void a(float var1) {
         this.d.a(var1);
      }

      public void a() {
         this.d.d();
      }

      public boolean a(int var1, int var2, int var3) {
         return this.d.a(var1, var2, var3);
      }

      public boolean b() {
         return this.d.c();
      }

      public void c() {
         this.d.g();
      }

      public static String b(String var0, String var1, int var2, int var3, int var4, int var5) {
         char[] var6 = var1.toCharArray();
         char[] var7 = new char[var6.length];
         int var20 = -1721107978;
         int var19 = 1303781909;
         int var10000 = var19 + var20 - 2 * (var19 & var20);
         var20 = -723526679;
         var19 = var10000;
         char[] var276 = new char[(var19 | var20) - (var19 & var20)];
         int var10002 = (int)8850975258936391937L;
         var20 = 1446719750;
         var19 = var10002;
         var10002 = (var19 | var20) & ~(var19 & var20);
         var20 = -694712313;
         var19 = var10002;
         var10002 = (var19 | var20) & ~(var19 & var20);
         var20 = -417736945;
         var19 = 1623657291;
         int var10003 = var19 + var20 - 2 * (var19 & var20);
         var20 = -2015456138;
         var19 = var10003;
         var276[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
         var20 = 1155258363;
         var19 = -1937391046;
         var10002 = var19 + var20 - 2 * (var19 & var20);
         var20 = -933358144;
         var19 = var10002;
         var10002 = (var19 | var20) - (var19 & var20);
         var10003 = (int)-5214595216075913217L;
         var20 = 439101112;
         var19 = var10003;
         var10003 = (var19 | var20) & (~var19 | ~var20);
         var20 = 1752433346;
         var19 = var10003;
         var276[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
         var20 = 1208765936;
         var19 = -369851955;
         var10002 = (var19 | var20) - (var19 & var20);
         var20 = -1577530305;
         var19 = var10002;
         var10002 = (var19 | var20) & ~(var19 & var20);
         var10003 = (int)5821394251245170400L;
         var20 = -938398566;
         var19 = var10003;
         var10003 = (var19 | var20) & (~var19 | ~var20);
         var20 = -1293344260;
         var19 = var10003;
         var276[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
         var10002 = (int)-3080078921951756731L;
         var20 = -1613558706;
         var19 = var10002;
         var10002 = (var19 | var20) - (var19 & var20);
         var20 = -2026458616;
         var19 = var10002;
         var10002 = var19 + var20 - 2 * (var19 & var20);
         var20 = 13031354;
         var19 = 1314213302;
         var10003 = (var19 | var20) & ~(var19 & var20);
         var20 = 756847524;
         var19 = var10003;
         var10003 = ((var19 | var20) & ~(var19 & var20)) * ((var19 | var20) & ~(var19 & var20));
         var20 = -1122184619;
         var19 = -697835005;
         var10003 = (var19 | var20) - (var19 & var20);
         var20 = 1803266117;
         var19 = var10003;
         var276[var10002] = (char)((var19 | var20) & ~(var19 & var20));
         var10002 = (int)-4301006247537436738L;
         var20 = -119806304;
         var19 = var10002;
         var10002 = (var19 | var20) & (~var19 | ~var20);
         var20 = -32476902;
         var19 = var10002;
         var10002 = var19 & ~var20 | ~var19 & var20;
         String var359 = "bnk";
         var10003 = (int)-8283438307978806366L;
         var20 = 1441341296;
         var19 = var10003;
         var10003 = (var19 | var20) & (~var19 | ~var20);
         var20 = 1139209719;
         var19 = var10003;
         var276[var10002] = (char)((var19 | var20) & ~(var19 & var20));
         var20 = -724585987;
         var19 = 286595922;
         var10002 = (var19 | var20) & (~var19 | ~var20);
         var20 = -975525206;
         var19 = var10002;
         var10002 = var19 & ~var20 | ~var19 & var20;
         var20 = -471492245;
         var19 = 61959468;
         var10003 = (var19 | var20) & (~var19 | ~var20);
         var20 = -531320379;
         var19 = var10003;
         var276[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
         var20 = -1565406769;
         var19 = -1911708871;
         var10002 = (var19 | var20) & (~var19 | ~var20);
         var20 = 750545648;
         var19 = var10002;
         var10002 = (var19 | var20) & ~(var19 & var20);
         var10003 = (int)4659849340742468850L;
         var20 = -896188409;
         var19 = var10003;
         var10003 = var19 & ~var20 | ~var19 & var20;
         var20 = -1621209626;
         var19 = var10003;
         var276[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
         var10002 = (int)629280913841454679L;
         var20 = -1229625830;
         var19 = var10002;
         var10002 = var19 + var20 - 2 * (var19 & var20);
         var20 = -2084136886;
         var19 = var10002;
         var10002 = (var19 | var20) & ~(var19 & var20);
         var20 = -1907932727;
         var19 = -295045275;
         var10003 = (var19 | var20) & (~var19 | ~var20);
         var20 = 1613660814;
         var19 = var10003;
         var276[var10002] = (char)((var19 | var20) - (var19 & var20));
         var20 = -819101325;
         var19 = 208141916;
         var10002 = (var19 | var20) & ~(var19 & var20);
         var20 = -1018527961;
         var19 = var10002;
         var10002 = (var19 | var20) - (var19 & var20);
         var10003 = (int)-5368785492578702317L;
         var20 = 384058248;
         var19 = var10003;
         var10003 = (var19 | var20) & ~(var19 & var20);
         var20 = 158803912;
         var19 = var10003;
         var276[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
         var20 = -1156566600;
         var19 = -933619947;
         var10002 = (var19 | var20) & ~(var19 & var20);
         var20 = 1934239396;
         var19 = var10002;
         var10002 = (var19 | var20) & ~(var19 & var20);
         var20 = -1024472227;
         var19 = 1015499102;
         var10003 = (var19 | var20) & (~var19 | ~var20);
         var20 = -26704601;
         var19 = var10003;
         var276[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
         char[] var8 = var276;
         var20 = -325367717;
         var19 = -1620459125;
         var10000 = var19 + var20 - 2 * (var19 & var20);
         var20 = 1945274842;
         var19 = var10000;
         char[] var278 = new char[var19 + var20 - 2 * (var19 & var20)];
         var20 = -387833479;
         var19 = 1890155271;
         var10002 = (var19 | var20) - (var19 & var20);
         var20 = -1739892098;
         var19 = var10002;
         var10002 = (var19 | var20) & ~(var19 & var20);
         var20 = -1499486646;
         var19 = 1835562794;
         var10003 = (var19 | var20) - (var19 & var20);
         var20 = -872965824;
         var19 = var10003;
         var278[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
         var20 = -1636683878;
         var19 = 1324259281;
         var10002 = var19 & ~var20 | ~var19 & var20;
         var20 = -795035574;
         var19 = var10002;
         var10002 = var19 & ~var20 | ~var19 & var20;
         var10003 = (int)-8598868151408910492L;
         var20 = -1066828327;
         var19 = var10003;
         var10003 = var19 + var20 - 2 * (var19 & var20);
         var20 = 2059410123;
         var19 = var10003;
         var10003 = (var19 & ~var20 | ~var19 & var20) * (var19 & ~var20 | ~var19 & var20);
         var10003 = (int)9036176248096719283L;
         var20 = 8673447;
         var19 = var10003;
         var10003 = (var19 | var20) & ~(var19 & var20);
         var20 = 52714775;
         var19 = var10003;
         var278[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
         var20 = 1282234418;
         var19 = 1175770511;
         var10002 = var19 & ~var20 | ~var19 & var20;
         var20 = 175738303;
         var19 = var10002;
         var10002 = var19 + var20 - 2 * (var19 & var20);
         var20 = 933254415;
         var19 = 1277600814;
         var10003 = var19 + var20 - 2 * (var19 & var20);
         var20 = -767743558;
         var19 = var10003;
         var10003 = (var19 + var20 - 2 * (var19 & var20)) * (var19 + var20 - 2 * (var19 & var20));
         var10003 = (int)3775818240158845848L;
         var20 = -1345775386;
         var19 = var10003;
         var10003 = (var19 | var20) & ~(var19 & var20);
         var20 = -2100145107;
         var19 = var10003;
         var278[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
         var10002 = (int)-1777594641554872041L;
         var20 = -325565157;
         var19 = var10002;
         var10002 = var19 + var20 - 2 * (var19 & var20);
         var20 = -1612469233;
         var19 = var10002;
         var10002 = (var19 | var20) - (var19 & var20);
         var20 = -1305320574;
         var19 = 1528187432;
         var10003 = (var19 | var20) - (var19 & var20);
         var20 = -383512152;
         var19 = var10003;
         var278[var10002] = (char)((var19 | var20) & ~(var19 & var20));
         var10002 = (int)7469176534878766173L;
         var20 = -517968563;
         var19 = var10002;
         var10002 = (var19 | var20) & (~var19 | ~var20);
         var20 = -821974764;
         var19 = var10002;
         var10002 = (var19 | var20) - (var19 & var20);
         var10003 = (int)-1068274822531273714L;
         var20 = -1426049238;
         var19 = var10003;
         var10003 = (var19 | var20) & (~var19 | ~var20);
         var20 = -746085532;
         var19 = var10003;
         var278[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
         var10002 = (int)3496849902580300063L;
         var20 = -1711511899;
         var19 = var10002;
         var10002 = (var19 | var20) - (var19 & var20);
         var20 = 232005567;
         var19 = var10002;
         var10002 = var19 + var20 - 2 * (var19 & var20);
         var20 = 324340317;
         var19 = 53288376;
         var10003 = (var19 | var20) & (~var19 | ~var20);
         var20 = 276311921;
         var19 = var10003;
         var278[var10002] = (char)((var19 | var20) & ~(var19 & var20));
         var10002 = (int)8143342982702868114L;
         var20 = -1920766523;
         var19 = var10002;
         var10002 = var19 + var20 - 2 * (var19 & var20);
         var20 = -1515205807;
         var19 = var10002;
         var10002 = (var19 | var20) & ~(var19 & var20);
         int var10004 = (int)-31003244908134119L;
         var20 = 1893194495;
         var19 = var10004;
         var10004 = (var19 | var20) & (~var19 | ~var20);
         var20 = -125166611;
         var19 = var10004;
         var10004 = var19 + var20 - 2 * (var19 & var20);
         var10004 = (int)-2943247529714487872L;
         var20 = -1380613288;
         var19 = var10004;
         var10004 = var19 + var20 - 2 * (var19 & var20);
         var20 = -1796739436;
         var19 = var10004;
         var10004 = (var19 | var20) - (var19 & var20);
         var20 = 1529246831;
         var19 = 503339082;
         var10004 = (var19 | var20) - (var19 & var20);
         var20 = 1160129583;
         var19 = var10004;
         var10004 = var19 + var20 - 2 * (var19 & var20);
         var10003 = (int)-488951143026176700L;
         var20 = -1231328710;
         var19 = var10003;
         var10003 = var19 + var20 - 2 * (var19 & var20);
         var20 = 301768775;
         var19 = var10003;
         var278[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
         var10002 = (int)-5472486572161524338L;
         var20 = 1815651799;
         var19 = var10002;
         var10002 = var19 + var20 - 2 * (var19 & var20);
         var20 = 1745827934;
         var19 = var10002;
         var10002 = (var19 | var20) & (~var19 | ~var20);
         var10003 = (int)-2006832844262798451L;
         var20 = 1575249671;
         var19 = var10003;
         var10003 = (var19 | var20) - (var19 & var20);
         var20 = 2009431218;
         var19 = var10003;
         var278[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
         var10002 = (int)-5186058914372091023L;
         var20 = -943150855;
         var19 = var10002;
         var10002 = var19 + var20 - 2 * (var19 & var20);
         var20 = 928131968;
         var19 = var10002;
         var10002 = (var19 | var20) & (~var19 | ~var20);
         String var387 = "bnl";
         var10003 = (int)5815272368671821484L;
         var20 = 1613784751;
         var19 = var10003;
         var10003 = var19 & ~var20 | ~var19 & var20;
         var20 = -18552057;
         var19 = var10003;
         var278[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
         var20 = 442508240;
         var19 = 1131620647;
         var10002 = (var19 | var20) & ~(var19 & var20);
         var20 = 1494420222;
         var19 = var10002;
         var10002 = (var19 | var20) - (var19 & var20);
         var20 = 1431378780;
         var19 = -1812770393;
         var10003 = (var19 | var20) & (~var19 | ~var20);
         var20 = -962430520;
         var19 = var10003;
         var278[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
         char[] var9 = var278;
         var20 = -754534540;
         var19 = 1785848915;
         var10000 = (var19 | var20) & ~(var19 & var20);
         var20 = -1183362265;
         var19 = var10000;

         for (int var10 = var19 & ~var20 | ~var19 & var20; var10 < var6.length; var10++) {
            char var348 = var6[var10];
            char var247 = var8[var10 % var8.length];
            char var121 = var348;
            var7[var10] = (char)((var121 | var247) - (var121 & var247));
         }

         char[] var21 = new char[var7.length];
         var20 = 769009480;
         var19 = 577331030;
         var10000 = var19 + var20 - 2 * (var19 & var20);
         var20 = 264206366;
         var19 = var10000;

         for (int var11 = var19 + var20 - 2 * (var19 & var20); var11 < var6.length; var11++) {
            char var349 = var7[var11];
            char var250 = var9[var11 % var9.length];
            char var124 = var349;
            var21[var11] = (char)(var124 & ~var250 | ~var124 & var250);
         }

         String var22 = new String(var21);
         int var12 = var22.hashCode();
         var20 = var5;
         var19 = var3;
         var10000 = var19 + ~var20 + 1;
         var20 = var2;
         var19 = var10000;
         int var13 = (var19 & ~var20) - (~var19 & var20);
         char[] var14 = var0.toCharArray();
         char[] var15 = new char[var14.length];
         var20 = -443323812;
         var19 = 1594607598;
         var10000 = var19 & ~var20 | ~var19 & var20;
         var20 = -1164399182;
         var19 = var10000;
         int var16 = var19 + var20 - 2 * (var19 & var20);
         var20 = -2043379151;
         var19 = 607031159;
         var10000 = var19 + var20 - 2 * (var19 & var20);
         var20 = -1017915856;
         var19 = var10000;
         var10000 = (var19 | var20) - (var19 & var20);
         var20 = -1914256049;
         var19 = -2116923761;
         int var10001 = (var19 | var20) & (~var19 | ~var20);
         var20 = 934924442;
         var19 = var10001;
         var20 = var19 & ~var20 | ~var19 & var20;
         var19 = var10000;
         var10000 = 2 * (var19 | var20) - (var19 ^ var20);
         var20 = 105256890;
         var19 = -777084811;
         var10000 = (var19 | var20) - (var19 & var20);
         var20 = -1624736888;
         var19 = var10000;
         int var18 = var19 & ~var20 | ~var19 & var20;
         a = var18;
         var10000 = (int)-8195996480779126026L;
         var20 = -1777918971;
         var19 = var10000;
         var10000 = (var19 | var20) & ~(var19 & var20);
         var20 = 940018176;
         var19 = var10000;
         var10000 = (var19 | var20) & (~var19 | ~var20);
         var10000 = (int)4860889999612369565L;
         var20 = 76887697;
         var19 = var10000;
         var10000 = var19 & ~var20 | ~var19 & var20;
         var20 = 1029228130;
         var19 = var10000;
         if ((var19 & ~var20 | ~var19 & var20) <= a) {
            var10000 = (int)5748745563713242831L;
            var20 = -956387539;
            var19 = var10000;
            var10000 = var19 & ~var20 | ~var19 & var20;
            var20 = 1566924016;
            var19 = var10000;
            var10000 = ((var19 | var20) - (var19 & var20)) * ((var19 | var20) - (var19 & var20));
            var10000 = (int)-5711370003093067654L;
            var20 = -1844349400;
            var19 = var10000;
            var10000 = var19 + var20 - 2 * (var19 & var20);
            var20 = -950758992;
            var19 = var10000;
            var18 = (var19 | var20) & (~var19 | ~var20);
            a = var18;
         }

         for (; var16 < var15.length; var16++) {
            var10001 = (int)2929012559192455649L;
            var20 = 887033500;
            var19 = var10001;
            var10001 = var19 + var20 - 2 * (var19 & var20);
            var20 = 1502476159;
            var19 = var10001;
            switch (var16 % ((var19 | var20) & (~var19 | ~var20))) {
               case 0:
                  var20 = var12;
                  var19 = var13;
                  var10002 = (var19 | var20) & (~var19 | ~var20);
                  char var275 = var14[var16];
                  var19 = var10002;
                  var15[var16] = (char)((var19 | var275) & ~(var19 & var275));
                  break;
               case 1:
                  var20 = var13;
                  var19 = var5;
                  var10002 = (var19 | var20) & (~var19 | ~var20);
                  char var273 = var14[var16];
                  var19 = var10002;
                  var15[var16] = (char)((var19 | var273) - (var19 & var273));
            }
         }

         return new String(var15);
      }
   }
}
