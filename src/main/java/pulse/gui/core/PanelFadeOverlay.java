package pulse;

import java.awt.Color;
import net.minecraft.client.util.math.MatrixStack;

public class PanelFadeOverlay implements ClickGuiOverlay {
   private static final int c = 50;
   private static final float d = 5.0F;
   private static final float e = 25.0F;
   private int f;
   private float g;
   private float h;
   private Color i;
   private boolean j;
   private float k;
   private float l;
   private float m;
   private float n;
   public static int a;
   public static boolean b;

   public PanelFadeOverlay() {
      int var2 = -292640202;
      int var1 = 558060724;
      int var10001 = (var1 | var2) & ~(var1 & var2);
      var2 = -808583504;
      var1 = var10001;
      this.f = var1 & ~var2 | ~var1 & var2;
      var10001 = (int)-190107529766654078L;
      var2 = -2098579796;
      var1 = var10001;
      var10001 = var1 & ~var2 | ~var1 & var2;
      var2 = 976946745;
      var1 = var10001;
      var10001 = (var1 | var2) - (var1 & var2);
      this.g = 5.0F;
      var2 = -1841025252;
      var1 = 2007877906;
      var10001 = (var1 | var2) & (~var1 | ~var2);
      var2 = 156189212;
      var1 = var10001;
      var10001 = var1 & ~var2 | ~var1 & var2;
      this.h = 25.0F;
      this.i = pulse.Theme.f;
      var2 = 1880138609;
      var1 = 779210013;
      var10001 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1583443564;
      var1 = var10001;
      this.j = pulse.Bool.from((var1 | var2) - (var1 & var2));
   }

   public PanelFadeOverlay(int var1, float var2, float var3) {
      int var10001 = (int)6326726521390249605L;
      int var5 = -1930926750;
      int var4 = var10001;
      var10001 = (var4 | var5) & (~var4 | ~var5);
      var5 = -1100327979;
      var4 = var10001;
      this.f = var4 + var5 - 2 * (var4 & var5);
      var10001 = (int)-1166961688841830481L;
      var5 = 625387082;
      var4 = var10001;
      var10001 = var4 & ~var5 | ~var4 & var5;
      var5 = 1114777683;
      var4 = var10001;
      var10001 = var4 & ~var5 | ~var4 & var5;
      this.g = 5.0F;
      var5 = -1786425776;
      var4 = 1329212246;
      int var10002 = (var4 | var5) - (var4 & var5);
      var5 = -624990954;
      var4 = var10002;
      var10002 = (var4 | var5) & ~(var4 & var5);
      var5 = 541463227;
      var4 = -1333025577;
      var10002 = var4 & ~var5 | ~var4 & var5;
      var5 = -1865566615;
      var4 = var10002;
      var10002 = var4 & ~var5 | ~var4 & var5;
      this.h = 25.0F;
      this.i = pulse.Theme.f;
      var5 = -639766633;
      var4 = -1060076119;
      var10001 = (var4 | var5) - (var4 & var5);
      var5 = 420309566;
      var4 = var10001;
      this.j = pulse.Bool.from(var4 + var5 - 2 * (var4 & var5));
      this.f = var1;
      this.g = var2;
      this.h = var3;
   }

   public PanelFadeOverlay(int var1, float var2, float var3, Color var4) {
      int var6 = -1605492870;
      int var5 = -935290090;
      int var10001 = (var5 | var6) - (var5 & var6);
      var6 = 1745781854;
      var5 = var10001;
      this.f = (var5 | var6) & ~(var5 & var6);
      var10001 = (int)-6711978216686516288L;
      var6 = -1584416276;
      var5 = var10001;
      var10001 = (var5 | var6) & ~(var5 & var6);
      var6 = -210581532;
      var5 = var10001;
      var10001 = var5 & ~var6 | ~var5 & var6;
      int var10002 = (int)-2530279078543346936L;
      var6 = -411733852;
      var5 = var10002;
      var10002 = var5 & ~var6 | ~var5 & var6;
      var6 = 1636478871;
      var5 = var10002;
      var6 = (var5 | var6) & ~(var5 & var6);
      var5 = var10001;
      var10001 = var5 - ~var6 - 1;
      this.g = 5.0F;
      var6 = 1361368452;
      var5 = 1678087487;
      var10001 = (var5 | var6) & (~var5 | ~var6);
      var6 = 589259121;
      var5 = var10001;
      var10001 = (var5 | var6) - (var5 & var6);
      var6 = -236655543;
      var5 = 1995450438;
      var10002 = var5 + var6 - 2 * (var5 & var6);
      var6 = -618787591;
      var5 = var10002;
      var6 = (var5 | var6) - (var5 & var6);
      var5 = var10001;
      var10001 = (var5 & ~var6) + (var6 & ~var5) + 2 * (var5 & var6);
      this.h = 25.0F;
      this.i = pulse.Theme.f;
      var6 = 587626854;
      var5 = -1683055327;
      var10001 = var5 & ~var6 | ~var5 & var6;
      var6 = -1196891065;
      var5 = var10001;
      this.j = pulse.Bool.from((var5 | var6) & (~var5 | ~var6));
      this.f = var1;
      this.g = var2;
      this.h = var3;
      this.i = var4;
   }

   public void a(int var1) {
      this.f = var1;
   }

   public void a(float var1) {
      this.g = var1;
   }

   public void b(float var1) {
      this.h = var1;
   }

   public void a(Color var1) {
      this.i = var1;
   }

   public void a(float var1, float var2, float var3, float var4) {
      int var10001 = (int)-7991913527954756350L;
      int var6 = 741549108;
      int var5 = var10001;
      var10001 = var5 & ~var6 | ~var5 & var6;
      var6 = 1856833847;
      var5 = var10001;
      this.j = pulse.Bool.from(var5 & ~var6 | ~var5 & var6);
      this.k = var1;
      this.l = var2;
      this.m = var3;
      this.n = var4;
   }

   public void a() {
      int var2 = 771587741;
      int var1 = 448675370;
      int var10001 = (var1 | var2) & (~var1 | ~var2);
      var2 = 927154359;
      var1 = var10001;
      this.j = pulse.Bool.from((var1 | var2) & ~(var1 & var2));
   }

   @Override
   public void a(MatrixStack var1, Renderer2D var2, float var3, float var4, int var5, int var6) {
      float var7;
      float var8;
      float var9;
      float var10;
      if (!this.j) {
         var7 = var3;
         var8 = var4;
         var9 = pulse.PulseClickGuiScreen.d();
         var10 = pulse.PulseClickGuiScreen.e();
      } else {
         var7 = this.k;
         var8 = this.l;
         var9 = this.m;
         var10 = this.n;
         if (b) {
            int var15 = -1680797238;
            int var14 = 2088127483;
            int var10000 = (var14 | var15) & ~(var14 & var15);
            var15 = 276674541;
            var14 = var10000;
            var10000 = ((var14 | var15) & ~(var14 & var15)) * ((var14 | var15) & ~(var14 & var15));
            var10000 = (int)-9198626353600874936L;
            var15 = 208671500;
            var14 = var10000;
            var10000 = (var14 | var15) - (var14 & var15);
            var15 = -984433052;
            var14 = var10000;
            int var13 = (var14 | var15) - (var14 & var15);
         }
      }

      int var10001 = (int)7785860743249212013L;
      int var24 = -564904983;
      int var19 = var10001;
      var10001 = (var19 | var24) & ~(var19 & var24);
      var24 = -1638725244;
      var19 = var10001;
      Color var11 = pulse.Theme.a(this.i, var19 & ~var24 | ~var19 & var24);
      var2.a(var7, var8 + var10 - this.f - this.g, var9, this.f, this.h, var11, var11, this.i, this.i, var1);
   }

   public void a(MatrixStack var1, Renderer2D var2, float var3, float var4, float var5, float var6, float var7) {
      Color var8 = pulse.Theme.a(this.i, var7);
      int var11 = 306059719;
      int var10 = 1305714227;
      int var10001 = (var10 | var11) & (~var10 | ~var11);
      var11 = 1609402356;
      var10 = var10001;
      Color var9 = pulse.Theme.a(this.i, (var10 | var11) - (var10 & var11));
      var2.a(var3, var4 + var6 - this.f - this.g, var5, this.f, 0.0F, var9, var9, var8, var8, var1);
   }

   @Override
   public void a(float var1, float var2, int var3, int var4) {
   }

   public static String b(String var0, String var1, int var2, int var3, int var4, int var5) {
      char[] var6 = var1.toCharArray();
      char[] var7 = new char[var6.length];
      int var10000 = (int)-6989970876190124820L;
      int var18 = -72195482;
      int var17 = var10000;
      var10000 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1039070848;
      var17 = var10000;
      char[] var242 = new char[(var17 | var18) & (~var17 | ~var18)];
      var18 = 1328689903;
      var17 = 708985640;
      int var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1701867975;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      int var10003 = (int)-3079572531228764576L;
      var18 = 1672591394;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 62842480;
      var17 = var10003;
      var242[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var18 = 1996942262;
      var17 = -412384061;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -1871876236;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)-7416950865151000918L;
      var18 = -45832793;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -480151416;
      var17 = var10003;
      var242[var10002] = (char)((var17 | var18) - (var17 & var18));
      var18 = 60846740;
      var17 = -224594523;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -247691469;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)-2415583156844268445L;
      var18 = 1937577501;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1180941832;
      var17 = var10003;
      var242[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var10002 = (int)-4785397596147631996L;
      var18 = 520262922;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -1818350195;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      String var306 = "bjm";
      var10003 = (int)-2498652637463599161L;
      var18 = 1807563763;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 1298007079;
      var17 = var10003;
      var242[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var10002 = (int)-7774411371094034321L;
      var18 = 425635937;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 1768949770;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -791490739;
      var17 = 1034871488;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1377418338;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 1973271688;
      var17 = 569201923;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1416657070;
      var17 = var10003;
      var242[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var10002 = (int)-2242515994781160628L;
      var18 = 591123745;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -1529594264;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -412478596;
      var17 = 2127747595;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -1715958539;
      var17 = var10003;
      var242[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var18 = -861657949;
      var17 = 859688554;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -6690097;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)573216779138293038L;
      var18 = 465645638;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -1206524805;
      var17 = var10003;
      var242[var10002] = (char)((var17 | var18) - (var17 & var18));
      var10002 = (int)5169074979585368177L;
      var18 = -371864400;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 2120117446;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 375387878;
      var17 = 561401049;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 925470237;
      var17 = var10003;
      var242[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var10002 = (int)5698139702111273462L;
      var18 = -1227709785;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -835312807;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -933314879;
      var17 = -98214779;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 846981655;
      var17 = var10003;
      var242[var10002] = (char)((var17 | var18) - (var17 & var18));
      var18 = 1692226383;
      var17 = -2011590766;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -322642732;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 176387508;
      var17 = -1104209240;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -1263769544;
      var17 = var10003;
      var242[var10002] = (char)((var17 | var18) - (var17 & var18));
      char[] var8 = var242;
      var10000 = (int)-3203384698136096997L;
      var18 = -1422649091;
      var17 = var10000;
      var10000 = var17 + var18 - 2 * (var17 & var18);
      var18 = 2006521836;
      var17 = var10000;
      char[] var245 = new char[(var17 | var18) - (var17 & var18)];
      var18 = -785198935;
      var17 = -892018556;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 468070445;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 19689177;
      var17 = 1147818997;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 1162245388;
      var17 = var10003;
      var245[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var18 = -1066531861;
      var17 = -818783583;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 257710411;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 249146521;
      var17 = 1056253360;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1353869232;
      var17 = var10003;
      var10003 = (var17 + var18 - 2 * (var17 & var18)) * (var17 + var18 - 2 * (var17 & var18));
      var10003 = (int)4801323368075401674L;
      var18 = 1135809909;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 1851328700;
      var17 = var10003;
      var245[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var10002 = (int)-717226884820720952L;
      var18 = -703531738;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 351688684;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      String var323 = "bjn";
      var10003 = (int)6771984704684555895L;
      var18 = 306675660;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -1990326552;
      var17 = var10003;
      var245[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var18 = 1523319053;
      var17 = 728030341;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 1906892171;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var10003 = (int)5710399265254757288L;
      var18 = -258311186;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -2085416892;
      var17 = var10003;
      var245[var10002] = (char)((var17 | var18) - (var17 & var18));
      var18 = 228477663;
      var17 = -1673348977;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -1847791020;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)-6017339450081565785L;
      var18 = -1981172689;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 1226321864;
      var17 = var10003;
      var245[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var18 = 161949376;
      var17 = 1205907756;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 1313314793;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var10003 = (int)-8727544171837705760L;
      var18 = -516382420;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 355313752;
      var17 = var10003;
      var245[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var10002 = (int)1950713203048378487L;
      var18 = 482349236;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1164123963;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1095966969;
      var17 = 1570805209;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1252910398;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)1733743403770730541L;
      var18 = -540840085;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 2125312127;
      var17 = var10003;
      var245[var10002] = (char)((var17 | var18) - (var17 & var18));
      var18 = -287850399;
      var17 = -1953538468;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1700306490;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -584571977;
      var17 = -1296170189;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1872113852;
      var17 = var10003;
      var245[var10002] = (char)((var17 | var18) - (var17 & var18));
      var18 = 1955689552;
      var17 = 525702178;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1808064634;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var10003 = (int)8383494738794244928L;
      var18 = -1767697965;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1785138367;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 641954604;
      var17 = -1175539813;
      int var10004 = (var17 | var18) & (~var17 | ~var18);
      var18 = -449303314;
      var17 = var10004;
      var18 = var17 & ~var18 | ~var17 & var18;
      var17 = var10003;
      var10003 = (var17 ^ var18) + 2 * (var17 & var18);
      var18 = 2025661429;
      var17 = 50713626;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 2075686123;
      var17 = var10003;
      var245[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var18 = 441158933;
      var17 = -1440576328;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -1335295580;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)390078026452710231L;
      var18 = 1931065985;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -1971340571;
      var17 = var10003;
      var245[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      char[] var9 = var245;
      var18 = -1486831325;
      var17 = -2075362157;
      var10000 = var17 + var18 - 2 * (var17 & var18);
      var18 = 590134704;
      var17 = var10000;

      for (int var10 = (var17 | var18) & (~var17 | ~var18); var10 < var6.length; var10++) {
         char var297 = var6[var10];
         char var227 = var8[var10 % var8.length];
         char var117 = var297;
         var7[var10] = (char)(var117 + var227 - 2 * (var117 & var227));
      }

      char[] var19 = new char[var7.length];
      var18 = 351125664;
      var17 = 1537055851;
      var10000 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1332763851;
      var17 = var10000;

      for (int var11 = var17 & ~var18 | ~var17 & var18; var11 < var6.length; var11++) {
         char var298 = var7[var11];
         char var230 = var9[var11 % var9.length];
         char var120 = var298;
         var19[var11] = (char)((var120 | var230) & ~(var120 & var230));
      }

      String var20 = new String(var19);
      int var12 = var20.hashCode();
      var18 = var5;
      var17 = var3;
      var10000 = (var17 ^ var18) - 2 * (~var17 & var18);
      var18 = var2;
      var17 = var10000;
      int var13 = var17 - var18;
      char[] var14 = var0.toCharArray();
      char[] var15 = new char[var14.length];
      var18 = 1118325032;
      var17 = -1114653680;
      var10000 = (var17 | var18) & ~(var17 & var18);
      var18 = -14158536;
      var17 = var10000;

      for (int var16 = var17 & ~var18 | ~var17 & var18; var16 < var15.length; var16++) {
         int var10001 = (int)-9152241911572206187L;
         var18 = 36629191;
         var17 = var10001;
         var10001 = var17 + var18 - 2 * (var17 & var18);
         var18 = -664467632;
         var17 = var10001;
         switch (var16 % ((var17 | var18) & ~(var17 & var18))) {
            case 0:
               var18 = var12;
               var17 = var13;
               var10002 = var17 + var18 - 2 * (var17 & var18);
               char var240 = var14[var16];
               var17 = var10002;
               var15[var16] = (char)(var17 & ~var240 | ~var17 & var240);
               break;
            case 1:
               var18 = var13;
               var17 = var5;
               var10002 = (var17 | var18) - (var17 & var18);
               char var238 = var14[var16];
               var17 = var10002;
               var15[var16] = (char)((var17 | var238) & (~var17 | ~var238));
         }
      }

      return new String(var15);
   }
}
