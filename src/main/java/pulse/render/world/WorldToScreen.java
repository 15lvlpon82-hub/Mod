package pulse;


import pulse.client.MinecraftContext;
import lombok.Generated;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.Camera;
import net.minecraft.util.math.Vec3d;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.joml.Vector4f;
import org.lwjgl.opengl.GL11;

public final class WorldToScreen implements MinecraftContext {
   public static final Matrix4f a = new Matrix4f();
   public static final Matrix4f b = new Matrix4f();
   public static final Matrix4f e = new Matrix4f();
   public static int f;
   public static boolean g;

   private static double[] a(double var0, double var2, double var4) {
      MinecraftClient var6 = MinecraftClient.getInstance();
      Camera var7 = var6.getEntityRenderDispatcher().camera;
      int var8 = var6.getWindow().getHeight();
      int var10000 = (int)-3584829540287582518L;
      int var21 = 1393945411;
      int var20 = var10000;
      var10000 = (var20 | var21) - (var20 & var21);
      var21 = -306117235;
      var20 = var10000;
      int[] var9 = new int[(var20 | var21) & (~var20 | ~var21)];
      var10000 = (int)-162768330284756463L;
      var21 = 767664356;
      var20 = var10000;
      var10000 = (var20 | var21) & (~var20 | ~var21);
      var21 = -915392169;
      var20 = var10000;
      GL11.glGetIntegerv((var20 | var21) & (~var20 | ~var21), var9);
      Vector3f var10 = new Vector3f();
      double var11 = var0 - var7.getPos().x;
      double var13 = var2 - var7.getPos().y;
      double var15 = var4 - var7.getPos().z;
      Vector4f var17 = new Vector4f((float)var11, (float)var13, (float)var15, 1.0F).mul(e);
      Matrix4f var18 = new Matrix4f(a);
      Matrix4f var19 = new Matrix4f(b);
      var10 = var18.mul(var19).project(var17.x(), var17.y(), var17.z(), var9, var10);
      var10000 = (int)-6103017360450913157L;
      var21 = -642138660;
      var20 = var10000;
      var10000 = (var20 | var21) - (var20 & var21);
      var21 = 1711161764;
      var20 = var10000;
      double[] var50 = new double[(var20 | var21) & ~(var20 & var21)];
      var21 = -787622181;
      var20 = 155784813;
      int var10002 = (var20 | var21) & (~var20 | ~var21);
      var21 = -666582858;
      var20 = var10002;
      var50[(var20 | var21) & (~var20 | ~var21)] = var10.x / ScreenScale.d();
      var21 = -1499343423;
      var20 = -1263452131;
      var10002 = var20 + var21 - 2 * (var20 & var21);
      var21 = 303076829;
      var20 = var10002;
      var50[(var20 | var21) & (~var20 | ~var21)] = (var8 - var10.y) / ScreenScale.d();
      var21 = 715370388;
      var20 = 2120090761;
      var10002 = var20 & ~var21 | ~var20 & var21;
      var21 = 1425910559;
      var20 = var10002;
      var50[var20 + var21 - 2 * (var20 & var21)] = var10.z;
      return var50;
   }

   public static Vec3d a(Vec3d var0) {
      if (c.gameRenderer == null || c.getWindow() == null || c.player == null) {
         return null;
      } else if (c(var0)) {
         double[] var1 = a(var0.x, var0.y, var0.z);
         int var10003 = (int)-1126933555651253327L;
         int var3 = 2018342768;
         int var2 = var10003;
         var10003 = (var2 | var3) - (var2 & var3);
         var3 = -1715659583;
         var2 = var10003;
         double var10002 = var1[var2 + var3 - 2 * (var2 & var3)];
         var3 = 655960127;
         var2 = 37162752;
         int var10004 = (var2 | var3) - (var2 & var3);
         var3 = 623781694;
         var2 = var10004;
         double var15 = var1[(var2 | var3) & ~(var2 & var3)];
         int var10005 = (int)1632169663147651524L;
         var3 = -1035312922;
         var2 = var10005;
         var10005 = (var2 | var3) & (~var2 | ~var3);
         var3 = -77606624;
         var2 = var10005;
         return new Vec3d(var10002, var15, var1[(var2 | var3) & ~(var2 & var3)]);
      } else {
         return null;
      }
   }

   public static boolean b(Vec3d var0) {
      if (var0 == null) {
         int var37 = 658313143;
         int var21 = 2124246308;
         int var44 = (var21 | var37) & ~(var21 & var37);
         var37 = 1503683219;
         var21 = var44;
         return pulse.Bool.from(var21 & (var37 ^ -1) | (var21 ^ -1) & var37);
      }

      float var1 = c.getWindow().getFramebufferWidth() / ScreenScale.d();
      float var2 = c.getWindow().getFramebufferHeight() / ScreenScale.d();
      int var10001 = (int)-3014341972617120712L;
      int var6 = -1391316619;
      int var5 = var10001;
      var10001 = (var5 | var6) - (var5 & var6);
      var6 = 118863203;
      var5 = var10001;
      var10001 = (var5 | var6) - (var5 & var6);
      int var10002 = (int)3409548950183599035L;
      var6 = -773529096;
      var5 = var10002;
      var10002 = (var5 | var6) & (~var5 | ~var6);
      var6 = -1765232409;
      var5 = var10002;
      var6 = (var5 | var6) & (~var5 | ~var6);
      var5 = var10001;
      var10001 = var5 - ~var6 - 1;
      if (var0.x >= -100.0) {
         String var52 = "lg";
         if (!(var0.x <= var1 + 100.0F)) {
            if (f != f) {
               String var10000 = "lh";
               var6 = 159375231;
               var5 = 624994256;
               int var39 = (var5 | var6) - (var5 & var6);
               var6 = 667643168;
               var5 = var39;
               int var4 = var5 + var6 - 2 * (var5 & var6);
               f = var4;
            }
         } else {
            var10001 = (int)-6802231682797904134L;
            var6 = 1416437054;
            var5 = var10001;
            var10001 = var5 & ~var6 | ~var5 & var6;
            var6 = -1507634291;
            var5 = var10001;
            var10001 = ((var5 | var6) & ~(var5 & var6)) * ((var5 | var6) & ~(var5 & var6));
            if (var0.y >= -100.0) {
               var10002 = (int)-2915349121646596945L;
               var6 = -891002562;
               var5 = var10002;
               var10002 = (var5 | var6) - (var5 & var6);
               var6 = 230272757;
               var5 = var10002;
               var10002 = (var5 | var6) - (var5 & var6);
               if (var0.y <= var2 + 100.0F) {
                  int var42 = (int)-946534528051755556L;
                  var6 = -1059112674;
                  var5 = var42;
                  var42 = var5 + var6 - 2 * (var5 & var6);
                  var6 = 1460305091;
                  var5 = var42;
                  return pulse.Bool.from((var5 | var6) & ~(var5 & var6));
               }

               if (g) {
                  throw new IllegalStateException();
               }
            }
         }
      }

      var6 = 1942324608;
      var5 = 983420743;
      int var40 = var5 & ~var6 | ~var5 & var6;
      var6 = 1230523079;
      var5 = var40;
      return pulse.Bool.from(var5 + var6 - 2 * (var5 & var6));
   }

   public static boolean c(Vec3d var0) {
      if (c.player == null) {
         int var19 = (int)-3701360108440017143L;
         int var14 = 1474545858;
         int var9 = var19;
         var19 = var9 & ~var14 | ~var9 & var14;
         var14 = -649957429;
         var9 = var19;
         return pulse.Bool.from(var9 + var14 - 2 * (var9 & var14));
      }

      Vec3d var1 = c.player.getPos();
      Vec3d var2 = c.player.getRotationVector();
      Vec3d var3 = var0.subtract(var1).normalize();
      int var17;
      if (!(var2.dotProduct(var3) > 0.0)) {
         var17 = (int)8777897616486645089L;
         int var5 = -1699715708;
         int var4 = var17;
         var17 = var4 & ~var5 | ~var4 & var5;
         var5 = 1675581669;
         var4 = var17;
         var17 = (var4 | var5) & (~var4 | ~var5);
      } else {
         int var12 = 732450641;
         int var7 = -1410615887;
         var17 = (var7 | var12) & (~var7 | ~var12);
         var12 = -2143028511;
         var7 = var17;
         var17 = (var7 | var12) & ~(var7 & var12);
      }

      return pulse.Bool.from(var17);
   }

   @Generated
   private WorldToScreen() {
      int var10003 = (int)7175193900578862547L;
      int var2 = -1816095474;
      int var1 = var10003;
      var10003 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1521622836;
      var1 = var10003;
      var10003 = (var1 | var2) - (var1 & var2);
      String var51 = "li";
      int var10004 = (int)-740170445827673688L;
      var2 = -1852097446;
      var1 = var10004;
      var10004 = (var1 | var2) & (~var1 | ~var2);
      var2 = 538791308;
      var1 = var10004;
      var10004 = (var1 | var2) & (~var1 | ~var2);
      var2 = -347653682;
      var1 = -666371136;
      var10004 = var1 & ~var2 | ~var1 & var2;
      var2 = 21024875;
      var1 = var10004;
      var10004 = (var1 | var2) & ~(var1 & var2);
      var2 = -172191140;
      var1 = -1186054219;
      int var10005 = var1 & ~var2 | ~var1 & var2;
      var2 = 2018680488;
      var1 = var10005;
      var10005 = (var1 | var2) & ~(var1 & var2);
      int var10006 = (int)-7941948511465507837L;
      var2 = -2077749263;
      var1 = var10006;
      var10006 = (var1 | var2) - (var1 & var2);
      var2 = 1646119282;
      var1 = var10006;
      var2 = var1 + var2 - 2 * (var1 & var2);
      var1 = var10005;
      var10005 = (var1 ^ var2) + 2 * (var1 & var2);
      var2 = -1693928202;
      var1 = -1642158136;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1680300950;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var10006 = (int)3647652178709896730L;
      var2 = 776919800;
      var1 = var10006;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var2 = -149842888;
      var1 = var10006;
      var10006 = (var1 + var2 - 2 * (var1 & var2)) * (var1 + var2 - 2 * (var1 & var2));
      var2 = -799160085;
      var1 = -824483060;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var2 = 115494191;
      var1 = var10006;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      int var10007 = (int)-7515195553873087473L;
      var2 = -1281881183;
      var1 = var10007;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var2 = 1241131672;
      var1 = var10007;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      int var10008 = (int)-6301780472168275564L;
      var2 = 641810603;
      var1 = var10008;
      var10008 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1937669348;
      var1 = var10008;
      var2 = (var1 | var2) & (~var1 | ~var2);
      var1 = var10007;
      var10007 = 2 * (var1 | var2) - (var1 ^ var2);
      var10007 = (int)-445233287486459035L;
      var2 = 123171496;
      var1 = var10007;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      var2 = 509043632;
      var1 = var10007;
      throw new UnsupportedOperationException(
         b(
            "၃ꁧၾꁼ့ꁦၤꀯၶꀯၢꁻၾꁣၾꁻၮꀯၴꁣၶꁼၤꀯၶꁡၳꀯၴꁮၹꁡၸꁻ့ꁭၲꀯၾꁡၤꁻၶꁡၣꁦၶꁻၲꁫ",
            "`ꟳꓺꁡꤐ絺蹙⑿譸㑢f\ua7ef꒹ꁢꥊ絅蹉⑨謲㑲|ꟓ꒡ꁸ꤉絥",
            var10004,
            var10005,
            var10006,
            (var1 | var2) & ~(var1 & var2)
         )
      );
   }

   public static String b(String var0, String var1, int var2, int var3, int var4, int var5) {
      char[] var6 = var1.toCharArray();
      char[] var7 = new char[var6.length];
      int var10000 = (int)-2904444429806305993L;
      int var20 = -957163089;
      int var19 = var10000;
      var10000 = var19 & ~var20 | ~var19 & var20;
      var20 = 897229970;
      var19 = var10000;
      char[] var292 = new char[(var19 | var20) & (~var19 | ~var20)];
      int var10002 = (int)-3859634001161271691L;
      var20 = 2043302534;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = 1141445875;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      int var10003 = (int)-3763833138877873646L;
      var20 = 1615829086;
      var19 = var10003;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = -887582082;
      var19 = var10003;
      var292[var10002] = (char)((var19 | var20) & ~(var19 & var20));
      var20 = 639050095;
      var19 = 1484420150;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = 2121094488;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var10003 = (int)4070247764987684964L;
      var20 = -1415145588;
      var19 = var10003;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = 1481481325;
      var19 = var10003;
      var292[var10002] = (char)((var19 | var20) - (var19 & var20));
      var10002 = (int)-3680938545323680695L;
      var20 = -1130835812;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = -2123854633;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var10003 = (int)5989158957194006945L;
      var20 = -534182583;
      var19 = var10003;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = 315422574;
      var19 = var10003;
      var292[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      var20 = -1287833720;
      var19 = 1879029594;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = -591232815;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var10003 = (int)934184695159805628L;
      var20 = -939823739;
      var19 = var10003;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = -592600752;
      var19 = var10003;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var10003 = (int)7440533816611647818L;
      var20 = 1425371772;
      var19 = var10003;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = -224470235;
      var19 = var10003;
      var292[var10002] = (char)((var19 | var20) - (var19 & var20));
      var20 = -767731821;
      var19 = -355159931;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = 954853138;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = -694969573;
      var19 = 302447664;
      int var10004 = (var19 | var20) - (var19 & var20);
      var20 = -996841688;
      var19 = var10004;
      var10004 = var19 & ~var20 | ~var19 & var20;
      var10004 = (int)-1677377013496099327L;
      var20 = 1632628435;
      var19 = var10004;
      var10004 = var19 & ~var20 | ~var19 & var20;
      var20 = 761733315;
      var19 = var10004;
      var10004 = (var19 | var20) - (var19 & var20);
      var10004 = (int)-4537151485231336350L;
      var20 = 419412164;
      var19 = var10004;
      var10004 = var19 & ~var20 | ~var19 & var20;
      var20 = 1314507949;
      var19 = var10004;
      var10004 = var19 & ~var20 | ~var19 & var20;
      var20 = 1596574858;
      var19 = -638829139;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = -2033885182;
      var19 = var10003;
      var292[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      var20 = -1418804605;
      var19 = 1408726299;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = -124143715;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = -1262923117;
      var19 = 1652050811;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = -691970966;
      var19 = var10003;
      var292[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      var20 = -318562007;
      var19 = 2043750275;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = -1798175060;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var10003 = (int)4719189890616105782L;
      var20 = 1981296596;
      var19 = var10003;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = -1210991119;
      var19 = var10003;
      var292[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      var10002 = (int)-946626106746951157L;
      var20 = 37675510;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = 1174555642;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = -953774315;
      var19 = -149028566;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = 809024029;
      var19 = var10003;
      var292[var10002] = (char)((var19 | var20) - (var19 & var20));
      var10002 = (int)1045161740835585988L;
      var20 = 582813538;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = -169314130;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = 1986465888;
      var19 = -942756180;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = -1314277729;
      var19 = var10003;
      var292[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      var20 = -55480751;
      var19 = 2144390423;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = -2090753201;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = -1184882964;
      var19 = 1309378787;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = -143945429;
      var19 = var10003;
      var292[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      char[] var8 = var292;
      var10000 = (int)-2632465619948419613L;
      var20 = -923156138;
      var19 = var10000;
      var10000 = (var19 | var20) & ~(var19 & var20);
      var20 = -2022570817;
      var19 = var10000;
      char[] var295 = new char[(var19 | var20) & ~(var19 & var20)];
      var20 = -1792651270;
      var19 = 1670544904;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = -155962894;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = -1817737934;
      var19 = -961266336;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1427370098;
      var19 = var10003;
      var295[var10002] = (char)((var19 | var20) - (var19 & var20));
      var10002 = (int)-8094931585869994419L;
      var20 = 820033687;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = -1212047653;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var10004 = (int)-6689533842885873559L;
      var20 = 1074263945;
      var19 = var10004;
      var10004 = (var19 | var20) - (var19 & var20);
      var20 = -573405198;
      var19 = var10004;
      var10004 = (var19 | var20) & ~(var19 & var20);
      var20 = 1376129540;
      var19 = 822299750;
      var10004 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1661296233;
      var19 = var10004;
      var10004 = (var19 | var20) & ~(var19 & var20);
      var10004 = (int)2778687226696015465L;
      var20 = 489142415;
      var19 = var10004;
      var10004 = (var19 | var20) - (var19 & var20);
      var20 = -1677318431;
      var19 = var10004;
      var10004 = (var19 | var20) - (var19 & var20);
      var10004 = (int)-4280627556407141286L;
      var20 = -1307198826;
      var19 = var10004;
      var10004 = (var19 | var20) & ~(var19 & var20);
      var20 = 2123310813;
      var19 = var10004;
      var10004 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1178291588;
      var19 = -1136011499;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = -93184366;
      var19 = var10003;
      var295[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      var20 = 971768522;
      var19 = -1625060856;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = -1496348480;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      String var387 = "lj";
      var10003 = (int)-7289251247313643061L;
      var20 = 1646266543;
      var19 = var10003;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = 929863223;
      var19 = var10003;
      var295[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      var10002 = (int)-3551783345942218883L;
      var20 = -2067303610;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = -181386184;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = 1930697417;
      var19 = -1722768753;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = -364609468;
      var19 = var10003;
      var295[var10002] = (char)((var19 | var20) & ~(var19 & var20));
      var10002 = (int)5289722221995226639L;
      var20 = 1016952898;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = -1910600119;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = 1150825365;
      var19 = -1737115167;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = -588402124;
      var19 = var10003;
      var295[var10002] = (char)((var19 | var20) & ~(var19 & var20));
      var10002 = (int)-3629290858081539579L;
      var20 = 623956831;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = -1538590369;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var10003 = (int)-5229978069893162408L;
      var20 = -1369286128;
      var19 = var10003;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = 512571612;
      var19 = var10003;
      var295[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      var10002 = (int)1649810379951551281L;
      var20 = -177942161;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = 1588027992;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = 1195798348;
      var19 = -926428421;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = 1233490750;
      var19 = var10003;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = 1575698759;
      var19 = -593509245;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = -2123103491;
      var19 = var10003;
      var295[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      var10002 = (int)-2668836991024080897L;
      var20 = -221721335;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1616812785;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var10003 = (int)-392193303472933121L;
      var20 = 1023372771;
      var19 = var10003;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = -1949693148;
      var19 = var10003;
      var295[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      var20 = -1508342816;
      var19 = 1892114146;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = -689971958;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = -770936512;
      var19 = 1216268502;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = -669087548;
      var19 = var10003;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = -856007373;
      var19 = -1689744338;
      var10004 = (var19 | var20) - (var19 & var20);
      var20 = 896412999;
      var19 = var10004;
      var20 = (var19 | var20) & (~var19 | ~var20);
      var19 = var10003;
      var10003 = (var19 ^ var20) + 2 * (var19 & var20);
      var20 = 1254312135;
      var19 = 1674600172;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = 689149231;
      var19 = var10003;
      var295[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      var10002 = (int)2439137287956619842L;
      var20 = -502308901;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = 1428110736;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1861477960;
      var19 = 1949060674;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = 450861881;
      var19 = var10003;
      var295[var10002] = (char)((var19 | var20) & ~(var19 & var20));
      char[] var9 = var295;
      var20 = -1935206866;
      var19 = 627663422;
      var10000 = var19 + var20 - 2 * (var19 & var20);
      var20 = -1446087664;
      var19 = var10000;

      for (int var10 = (var19 | var20) - (var19 & var20); var10 < var6.length; var10++) {
         char var364 = var6[var10];
         char var265 = var8[var10 % var8.length];
         char var131 = var364;
         var7[var10] = (char)(var131 + var265 - 2 * (var131 & var265));
      }

      char[] var21 = new char[var7.length];
      var20 = -135785240;
      var19 = -890025806;
      var10000 = (var19 | var20) - (var19 & var20);
      var20 = 1025203290;
      var19 = var10000;

      for (int var11 = (var19 | var20) - (var19 & var20); var11 < var6.length; var11++) {
         char var365 = var7[var11];
         char var268 = var9[var11 % var9.length];
         char var134 = var365;
         var21[var11] = (char)((var134 | var268) - (var134 & var268));
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
      var20 = 1989750390;
      var19 = 1806534021;
      var10000 = (var19 | var20) & (~var19 | ~var20);
      var20 = 489991155;
      var19 = var10000;

      for (int var16 = var19 + var20 - 2 * (var19 & var20); var16 < var15.length; var16++) {
         var20 = -1638801447;
         var19 = -1807458628;
         int var10001 = (var19 | var20) & ~(var19 & var20);
         var20 = 169181536;
         var19 = var10001;
         var10001 = (var19 | var20) & ~(var19 & var20);
         var20 = -726545348;
         var19 = -869146702;
         var10001 = var19 & ~var20 | ~var19 & var20;
         var20 = 411046795;
         var19 = var10001;
         var10001 = (var19 | var20) & ~(var19 & var20);
         var10000 = (int)7362524411239896372L;
         var20 = -353151775;
         var19 = var10000;
         var10000 = var19 & ~var20 | ~var19 & var20;
         var20 = 29222540;
         var19 = var10000;
         int var18 = (var19 | var20) & ~(var19 & var20);
         String var302 = "lk";
         var10000 = (int)7441843139189278332L;
         var20 = 866186815;
         var19 = var10000;
         var10000 = (var19 | var20) - (var19 & var20);
         var20 = 1312056158;
         var19 = var10000;
         if (var19 + var20 - 2 * (var19 & var20) >= var18) {
            var20 = -1281941613;
            var19 = 588742236;
            var10000 = (var19 | var20) & ~(var19 & var20);
            var20 = -1870634545;
            var19 = var10000;
            var10000 = (var19 | var20) & (~var19 | ~var20);
            var10001 = (int)-5339805396836982289L;
            var20 = -466966511;
            var19 = var10001;
            var10001 = var19 + var20 - 2 * (var19 & var20);
            var20 = -1812215298;
            var19 = var10001;
            var10000 /= (var19 | var20) - (var19 & var20);
         }

         var20 = 724619823;
         var19 = 92297067;
         var10001 = (var19 | var20) & (~var19 | ~var20);
         var20 = 783320390;
         var19 = var10001;
         switch (var16 % ((var19 | var20) - (var19 & var20))) {
            case 0:
               var20 = var12;
               var19 = var13;
               var10002 = var19 & ~var20 | ~var19 & var20;
               char var290 = var14[var16];
               var19 = var10002;
               var15[var16] = (char)((var19 | var290) & ~(var19 & var290));
               break;
            case 1:
               var20 = var13;
               var19 = var5;
               var10002 = (var19 | var20) & ~(var19 & var20);
               char var288 = var14[var16];
               var19 = var10002;
               var15[var16] = (char)(var19 + var288 - 2 * (var19 & var288));
         }
      }

      return new String(var15);
   }
}
