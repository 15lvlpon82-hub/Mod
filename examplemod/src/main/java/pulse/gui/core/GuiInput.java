package pulse;

import lombok.Generated;
import net.minecraft.client.MinecraftClient;
import org.lwjgl.glfw.GLFW;

public class GuiInput {
   private static final double[] c;
   private static final double[] d;
   private static long e = 0L;
   private static long f = 0L;
   private static boolean g;
   private static boolean h;
   private static boolean i;
   private static float j;
   private static float k;
   private static float l;
   private static float m;
   public static int a;
   public static boolean b;

   public static void a(float var0, float var1, float var2, float var3) {
      int var5 = 1602251850;
      int var4 = -1658291234;
      int var10000 = (var4 | var5) - (var4 & var5);
      var5 = -1029171307;
      var4 = var10000;
      i = pulse.Bool.from(var4 & ~var5 | ~var4 & var5);
      j = var0;
      k = var1;
      l = var2;
      m = var3;
   }

   public static void a() {
      int var10000 = (int)-1262985224511892761L;
      int var1 = 1220055950;
      int var0 = var10000;
      var10000 = (var0 | var1) - (var0 & var1);
      var1 = 148783465;
      var0 = var10000;
      i = pulse.Bool.from(var0 + var1 - 2 * (var0 & var1));
   }

   public static void b() {
      int var1 = -1858074050;
      int var0 = 434509428;
      int var10000 = (var0 | var1) - (var0 & var1);
      var1 = -2002379701;
      var0 = var10000;
      h = pulse.Bool.from(var0 & ~var1 | ~var0 & var1);
   }

   public static void c() {
      int var10000 = (int)2030171069974883770L;
      int var1 = -1051148584;
      int var0 = var10000;
      var10000 = var0 + var1 - 2 * (var0 & var1);
      var1 = 846730082;
      var0 = var10000;
      h = pulse.Bool.from((var0 | var1) & ~(var0 & var1));
   }

   public static boolean d() {
      return h;
   }

   public static boolean a(double var0, double var2) {
      if (!i) {
         int var19 = (int)-1423595845494593901L;
         int var14 = -198701221;
         int var9 = var19;
         var19 = (var9 | var14) - (var9 & var14);
         var14 = 163228105;
         var9 = var19;
         return pulse.Bool.from(var9 + var14 - 2 * (var9 & var14));
      }

      int var17;
      if (var0 >= j && var2 >= k && var0 <= j + l && var2 <= k + m) {
         int var12 = -1377259887;
         int var7 = -1020980061;
         var17 = (var7 | var12) & (~var7 | ~var12);
         var12 = 1858976307;
         var7 = var17;
         var17 = var7 + var12 - 2 * (var7 & var12);
      } else {
         var17 = (int)-2309214926694368901L;
         int var5 = -1036833587;
         int var4 = var17;
         var17 = (var4 | var5) & ~(var4 & var5);
         var5 = -1972824650;
         var4 = var17;
         var17 = var4 & ~var5 | ~var4 & var5;
      }

      return pulse.Bool.from(var17);
   }

   public static boolean a(double var0, double var2, double var4, double var6, double var8, double var10) {
      int var49;
      if (var8 >= var0 && var10 >= var2 && var8 <= var0 + var4 && var10 <= var2 + var6) {
         var49 = (int)2538533214047013403L;
         int var34 = 736001585;
         int var19 = var49;
         var49 = var19 + var34 - 2 * (var19 & var34);
         var34 = 34862123;
         var19 = var49;
         var49 = (var19 | var34) & (~var19 | ~var34);
      } else {
         var49 = (int)-5539605352649600775L;
         int var17 = -524615604;
         int var16 = var49;
         var49 = (var16 | var17) - (var16 & var17);
         var17 = -942878539;
         var16 = var49;
         var49 = (var16 | var17) & (~var16 | ~var17);
      }

      int var12 = var49;
      if (var12 != 0) {
         if (!i) {
            if (a != a) {
               int var42 = 1526553184;
               int var27 = 1254775365;
               int var10001 = var27 & ~var42 | ~var27 & var42;
               var42 = 272039976;
               var27 = var10001;
               var10001 = var27 + var42 - 2 * (var27 & var42);
               var42 = -2080310857;
               var27 = 1655953146;
               var49 = (var27 | var42) & (~var27 | ~var42);
               var42 = 669210363;
               var27 = var49;
               int var15 = (var27 | var42) & (~var27 | ~var42);
            }

            int var46 = -75057783;
            int var31 = -2076511529;
            var49 = var31 & ~var46 | ~var31 & var46;
            var46 = 2143045471;
            var31 = var49;
            return pulse.Bool.from((var31 | var46) & (var31 & var46 ^ -1));
         } else {
            if (var8 >= j && var10 >= k && var8 <= j + l && var10 <= k + m) {
               int var40 = -1264383514;
               int var25 = -218457002;
               var49 = var25 & ~var40 | ~var25 & var40;
               var40 = 1180276145;
               var25 = var49;
               var49 = (var25 | var40) - (var25 & var40);
            } else {
               int var38 = -1000908759;
               int var23 = -1927751674;
               var49 = var23 + var38 - 2 * (var23 & var38);
               var38 = 1229946927;
               var23 = var49;
               var49 = (var23 | var38) & ~(var23 & var38);
            }

            return pulse.Bool.from(var49);
         }
      } else {
         var49 = (int)3621845257215297204L;
         int var36 = 1368054597;
         int var21 = var49;
         var49 = var21 & ~var36 | ~var21 & var36;
         var36 = 575315441;
         var21 = var49;
         return pulse.Bool.from(var21 & (var36 ^ -1) | (var21 ^ -1) & var36);
      }
   }

   public static boolean a(float var0, float var1, float var2, float var3, double var4, double var6) {
      return a((double)var0, (double)var1, (double)var2, (double)var3, var4, var6);
   }

   public static boolean a(GuiLayerRegistry.Layer var0, double var1, double var3) {
      if (i) {
         int var19;
         if (var1 >= j && var3 >= k && var1 <= j + l && var3 <= k + m) {
            var19 = (int)7394923530774859416L;
            int var14 = 955414761;
            int var9 = var19;
            var19 = (var9 | var14) & ~(var9 & var14);
            var14 = 1240544880;
            var9 = var19;
            var19 = (var9 | var14) & ~(var9 & var14);
         } else {
            var19 = (int)-4387934801772840656L;
            int var7 = -1808139382;
            int var6 = var19;
            var19 = (var6 | var7) & ~(var6 & var7);
            var7 = 1593344698;
            var6 = var19;
            var19 = (var6 | var7) & ~(var6 & var7);
         }

         int var5 = var19;
         if (var5 == 0) {
            var19 = (int)1683970723990257237L;
            int var16 = -368937956;
            int var11 = var19;
            var19 = (var11 | var16) & ~(var11 & var16);
            var16 = 1704643145;
            var11 = var19;
            return pulse.Bool.from(var11 & (var16 ^ -1) | (var11 ^ -1) & var16);
         }
      }

      return GuiLayerRegistry.a().a(var0, var1, var3);
   }

   public static boolean a(GuiLayerRegistry.Layer var0, float var1, float var2, float var3, float var4, double var5, double var7) {
      if (a(var1, var2, var3, var4, var5, var7)) {
         return a(var0, var5, var7);
      }

      int var10000 = (int)305629268681457678L;
      int var10 = -473094119;
      int var9 = var10000;
      var10000 = (var9 | var10) & ~(var9 & var10);
      var10 = -1149917161;
      var9 = var10000;
      return pulse.Bool.from((var9 | var10) & (var9 & var10 ^ -1));
   }

   public static boolean b(GuiLayerRegistry.Layer var0, double var1, double var3) {
      return GuiLayerRegistry.a().d(var0, var1, var3);
   }

   public static double e() {
      MinecraftClient var0 = MinecraftClient.getInstance();
      if (var0.getWindow() == null) {
         return 0.0;
      }

      long var1 = var0.getWindow().getHandle();
      GLFW.glfwGetCursorPos(var1, c, d);
      int var10001 = (int)5247348806892905899L;
      int var4 = -1902070004;
      int var3 = var10001;
      var10001 = (var3 | var4) & (~var3 | ~var4);
      var4 = -1580510553;
      var3 = var10001;
      return c[(var3 | var4) & ~(var3 & var4)] * var0.getWindow().getScaledWidth() / var0.getWindow().getWidth();
   }

   public static double f() {
      MinecraftClient var0 = MinecraftClient.getInstance();
      if (var0.getWindow() == null) {
         return 0.0;
      }

      long var1 = var0.getWindow().getHandle();
      GLFW.glfwGetCursorPos(var1, c, d);
      int var10001 = (int)-5791225392315582739L;
      int var4 = 1952279300;
      int var3 = var10001;
      var10001 = var3 + var4 - 2 * (var3 & var4);
      var4 = 680779241;
      var3 = var10001;
      return d[var3 & ~var4 | ~var3 & var4] * var0.getWindow().getScaledHeight() / var0.getWindow().getHeight();
   }

   public static void g() {
      if (!h) {
         int var1 = -1205457760;
         int var0 = -1277970433;
         int var10000 = (var0 | var1) & ~(var0 & var1);
         var1 = 200645470;
         var0 = var10000;
         g = pulse.Bool.from((var0 | var1) - (var0 & var1));
      }
   }

   public static void h() {
      int var1 = -542544590;
      int var0 = -799002377;
      int var10000 = (var0 | var1) & (~var0 | ~var1);
      var1 = 264854981;
      var0 = var10000;
      g = pulse.Bool.from((var0 | var1) - (var0 & var1));
   }

   public static void i() {
      MinecraftClient var0 = MinecraftClient.getInstance();
      if (var0.getWindow() != null) {
         long var1 = var0.getWindow().getHandle();
         if (!g) {
            if (f == 0L) {
               int var10000 = (int)-2807251405718708969L;
               int var4 = -1193113604;
               int var3 = var10000;
               var10000 = (var3 | var4) & (~var3 | ~var4);
               var4 = 742287897;
               var3 = var10000;
               var10000 = var3 + var4 - 2 * (var3 & var4);
               var4 = -664142754;
               var3 = -796442353;
               int var10001 = (var3 | var4) - (var3 & var4);
               var4 = -457112042;
               var3 = var10001;
               var4 = var3 & ~var4 | ~var3 & var4;
               var3 = var10000;
               var10000 = var3 - ~var4 - 1;
               var4 = -2047484938;
               var3 = 75810384;
               var10000 = (var3 | var4) & ~(var3 & var4);
               var4 = -2123203161;
               var3 = var10000;
               f = GLFW.glfwCreateStandardCursor(var3 + var4 - 2 * (var3 & var4));
            }

            GLFW.glfwSetCursor(var1, f);
         } else {
            if (e == 0L) {
               int var24 = 383616172;
               int var11 = -1018213773;
               int var35 = var11 + var24 - 2 * (var11 & var24);
               var24 = 1214745404;
               var11 = var35;
               var35 = (var11 | var24) - (var11 & var24);
               int var40 = (int)-6693141467358980282L;
               var24 = 1144596999;
               var11 = var40;
               var40 = (var11 | var24) - (var11 & var24);
               var24 = -721152874;
               var11 = var40;
               var24 = var11 & ~var24 | ~var11 & var24;
               var11 = var35;
               var35 = var11 - ~var24 - 1;
               var35 = (int)530899986888200803L;
               var24 = -547929412;
               var11 = var35;
               var35 = (var11 | var24) & ~(var11 & var24);
               var24 = 1995387099;
               var11 = var35;
               e = GLFW.glfwCreateStandardCursor(var11 & ~var24 | ~var11 & var24);
            }

            GLFW.glfwSetCursor(var1, e);
         }
      }
   }

   public static void j() {
      int var2 = 1979230796;
      int var1 = -1537577539;
      int var10000 = (var1 | var2) - (var1 & var2);
      var2 = -777861135;
      var1 = var10000;
      g = pulse.Bool.from(var1 & ~var2 | ~var1 & var2);
      MinecraftClient var0 = MinecraftClient.getInstance();
      if (var0.getWindow() != null) {
         if (f == 0L) {
            var2 = 79326953;
            var1 = 139575248;
            int var10001 = (var1 | var2) & ~(var1 & var2);
            var2 = 216781109;
            var1 = var10001;
            var10001 = (var1 | var2) & (~var1 | ~var2);
            var2 = -128621592;
            var1 = 1297635693;
            var10001 = (var1 | var2) - (var1 & var2);
            var2 = -1257424251;
            var1 = var10001;
            var10001 = var1 & ~var2 | ~var1 & var2;
            var2 = -1282088282;
            var1 = -780070787;
            var10000 = var1 & ~var2 | ~var1 & var2;
            var2 = 1645646554;
            var1 = var10000;
            f = GLFW.glfwCreateStandardCursor(var1 + var2 - 2 * (var1 & var2));
         }

         GLFW.glfwSetCursor(var0.getWindow().getHandle(), f);
      }
   }

   @Generated
   public static boolean k() {
      return i;
   }

   static {
      int var10000 = (int)1784617671849867069L;
      int var1 = 617330868;
      int var0 = var10000;
      var10000 = (var0 | var1) & (~var0 | ~var1);
      var1 = 313872264;
      var0 = var10000;
      c = new double[(var0 | var1) & ~(var0 & var1)];
      var10000 = (int)7063694475995120752L;
      var1 = 874151320;
      var0 = var10000;
      var10000 = var0 & ~var1 | ~var0 & var1;
      var1 = 1603172841;
      var0 = var10000;
      d = new double[(var0 | var1) & (~var0 | ~var1)];
      var1 = -319566886;
      var0 = -1916012068;
      var10000 = (var0 | var1) - (var0 & var1);
      var1 = 1631072774;
      var0 = var10000;
      g = pulse.Bool.from((var0 | var1) - (var0 & var1));
      var1 = -345918110;
      var0 = 1424393079;
      var10000 = (var0 | var1) & ~(var0 & var1);
      var1 = -1081657835;
      var0 = var10000;
      h = pulse.Bool.from(var0 & ~var1 | ~var0 & var1);
      var1 = -452909844;
      var0 = 451405763;
      var10000 = (var0 | var1) & (~var0 | ~var1);
      var1 = -1653969;
      var0 = var10000;
      i = pulse.Bool.from((var0 | var1) & (~var0 | ~var1));
   }

   public static String a(String var0, String var1, int var2, int var3, int var4, int var5) {
      char[] var6 = var1.toCharArray();
      char[] var7 = new char[var6.length];
      int var18 = 91036766;
      int var17 = 513206622;
      int var10000 = (var17 | var18) & (~var17 | ~var18);
      var18 = 469497098;
      var17 = var10000;
      char[] var255 = new char[(var17 | var18) & ~(var17 & var18)];
      int var10002 = (int)-1751076962224366388L;
      var18 = 1612579711;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -1407115341;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      int var10003 = (int)-3083607293100542198L;
      var18 = -1942348933;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1479908285;
      var17 = var10003;
      var255[var10002] = (char)((var17 | var18) - (var17 & var18));
      var18 = -1036028337;
      var17 = 1107094703;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -2084332831;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -1950440731;
      var17 = -1981623987;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 39604269;
      var17 = var10003;
      var255[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var18 = 978604836;
      var17 = -326213179;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -690343197;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1363922426;
      var17 = 22688869;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1343347227;
      var17 = var10003;
      var255[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var10002 = (int)-7198519644986199731L;
      var18 = 1922338133;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -1048986597;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)889716339901704588L;
      var18 = -1616097193;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -1572118717;
      var17 = var10003;
      var10003 = ((var17 | var18) & ~(var17 & var18)) * ((var17 | var18) & ~(var17 & var18));
      var18 = 689194234;
      var17 = 3287553;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 690419432;
      var17 = var10003;
      var255[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var10002 = (int)-3203321215783135585L;
      var18 = -1075502803;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1071433802;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)1397819462062872159L;
      var18 = 544785980;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 264822805;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 503725241;
      var17 = -1743968249;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -2046065253;
      var17 = var10003;
      var255[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var18 = -782075797;
      var17 = -1500854733;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 2011741789;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -714716360;
      var17 = -1365235764;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 2076584310;
      var17 = var10003;
      var255[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var10002 = (int)-748826738700458147L;
      var18 = -1078747276;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -826116049;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -1182403722;
      var17 = -844094180;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 1949687673;
      var17 = var10003;
      var255[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var10002 = (int)-7230425408814510957L;
      var18 = 1058502343;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 330332755;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1013720762;
      var17 = -644548036;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -436672348;
      var17 = var10003;
      var255[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var10002 = (int)-6189714304572688075L;
      var18 = -190380565;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1704100650;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)3209425215650053304L;
      var18 = -43713012;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 1164200679;
      var17 = var10003;
      var255[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var10002 = (int)264808383286975555L;
      var18 = -1134342632;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -281095598;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)2093593358871389795L;
      var18 = -1489873507;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -325634854;
      var17 = var10003;
      var255[var10002] = (char)((var17 | var18) - (var17 & var18));
      char[] var8 = var255;
      var18 = -1128304619;
      var17 = 1734562796;
      var10000 = var17 & ~var18 | ~var17 & var18;
      var18 = -606329869;
      var17 = var10000;
      char[] var257 = new char[(var17 | var18) & (~var17 | ~var18)];
      var18 = -1268879531;
      var17 = -1263505460;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 15597721;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)-3682035700700481425L;
      var18 = -957873592;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 530100743;
      var17 = var10003;
      var257[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var10002 = (int)3175011521270999590L;
      var18 = -648752510;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -1032472411;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var10003 = (int)3072418183474299654L;
      var18 = 451648200;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -1119739480;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      int var10004 = (int)7997890628813333948L;
      var18 = 1050966930;
      var17 = var10004;
      var10004 = (var17 | var18) - (var17 & var18);
      var18 = -1977164582;
      var17 = var10004;
      var18 = var17 + var18 - 2 * (var17 & var18);
      var17 = var10003;
      var10003 = var17 - ~var18 - 1;
      var10003 = (int)1975535113652063554L;
      var18 = 1114329736;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 1356929993;
      var17 = var10003;
      var257[var10002] = (char)((var17 | var18) - (var17 & var18));
      var10002 = (int)2848269424825684816L;
      var18 = 1430411585;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 773130771;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1910049934;
      var17 = -803705010;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -409720776;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -2009388174;
      var17 = 346413909;
      var10004 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1306393901;
      var17 = var10004;
      var18 = (var17 | var18) & ~(var17 & var18);
      var17 = var10003;
      var10003 = (var17 ^ var18) + 2 * (var17 & var18);
      var10003 = (int)3142513720496455731L;
      var18 = 530281475;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 610300771;
      var17 = var10003;
      var257[var10002] = (char)((var17 | var18) - (var17 & var18));
      var18 = -1249067226;
      var17 = -1625059227;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 716123968;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)-4449033731858796777L;
      var18 = 273566652;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -2103632727;
      var17 = var10003;
      var257[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var18 = -2137070851;
      var17 = -590627352;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 1549098769;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -516931060;
      var17 = 1234652865;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -1465437043;
      var17 = var10003;
      var257[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var18 = 779701408;
      var17 = 104434005;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 675333616;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var10003 = (int)4095950752422263335L;
      var18 = 742486005;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 601763142;
      var17 = var10003;
      var257[var10002] = (char)((var17 | var18) - (var17 & var18));
      var10002 = (int)-6895420737015351697L;
      var18 = 1708654857;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -326207648;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var10003 = (int)4897987188428370859L;
      var18 = 836280727;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -1965523151;
      var17 = var10003;
      var10003 = (var17 & ~var18 | ~var17 & var18) * (var17 & ~var18 | ~var17 & var18);
      var10003 = (int)619513341448289176L;
      var18 = -348347341;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -509618030;
      var17 = var10003;
      var257[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var10002 = (int)839912487641108253L;
      var18 = -987443320;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -647528302;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)-7796073122228592064L;
      var18 = -59763002;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 115877054;
      var17 = var10003;
      var257[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var10002 = (int)2983533553243044470L;
      var18 = -290604017;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 2117011057;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)-1661418458244731667L;
      var18 = 1158715480;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -1625762444;
      var17 = var10003;
      var10003 = (var17 & ~var18 | ~var17 & var18) * (var17 & ~var18 | ~var17 & var18);
      var10003 = (int)-2413854793674910375L;
      var18 = 414910600;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -1424384299;
      var17 = var10003;
      var257[var10002] = (char)((var17 | var18) - (var17 & var18));
      var10002 = (int)-1122320870246575864L;
      var18 = 422011680;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 2111140385;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)8438505952785461188L;
      var18 = 664997009;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1365823590;
      var17 = var10003;
      var257[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      char[] var9 = var257;
      var18 = -1234445072;
      var17 = -1289128065;
      var10000 = (var17 | var18) & ~(var17 & var18);
      var18 = 88255375;
      var17 = var10000;

      for (int var10 = var17 + var18 - 2 * (var17 & var18); var10 < var6.length; var10++) {
         char var315 = var6[var10];
         char var241 = var8[var10 % var8.length];
         char var124 = var315;
         var7[var10] = (char)((var124 | var241) - (var124 & var241));
      }

      char[] var19 = new char[var7.length];
      var10000 = (int)-6762801961736672264L;
      var18 = 1508929828;
      var17 = var10000;
      var10000 = var17 + var18 - 2 * (var17 & var18);
      var18 = 28220124;
      var17 = var10000;

      for (int var11 = var17 & ~var18 | ~var17 & var18; var11 < var6.length; var11++) {
         char var316 = var7[var11];
         char var244 = var9[var11 % var9.length];
         char var127 = var316;
         var19[var11] = (char)((var127 | var244) & (~var127 | ~var244));
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
      var18 = 124911411;
      var17 = 182799219;
      var10000 = (var17 | var18) & (~var17 | ~var18);
      var18 = 227849280;
      var17 = var10000;

      for (int var16 = var17 + var18 - 2 * (var17 & var18); var16 < var15.length; var16++) {
         var18 = 1028386339;
         var17 = 895971548;
         int var10001 = var17 + var18 - 2 * (var17 & var18);
         var18 = 137142013;
         var17 = var10001;
         switch (var16 % ((var17 | var18) - (var17 & var18))) {
            case 0:
               var18 = var12;
               var17 = var13;
               var10002 = (var17 | var18) - (var17 & var18);
               char var254 = var14[var16];
               var17 = var10002;
               var15[var16] = (char)((var17 | var254) & ~(var17 & var254));
               break;
            case 1:
               var18 = var13;
               var17 = var5;
               var10002 = var17 + var18 - 2 * (var17 & var18);
               char var252 = var14[var16];
               var17 = var10002;
               var15[var16] = (char)((var17 | var252) & ~(var17 & var252));
         }
      }

      return new String(var15);
   }
}
