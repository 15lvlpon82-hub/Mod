package pulse;


import pulse.client.MinecraftContext;
import com.mojang.blaze3d.systems.ProjectionType;
import com.mojang.blaze3d.systems.RenderSystem;
import lombok.Generated;
import net.minecraft.client.util.Window;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;

public final class ScreenScale implements MinecraftContext {
   private static float e = 1.0F;
   private static Matrix4f f;
   private static Matrix4f g;
   public static int a;
   public static boolean b;

   public static void a(double var0) {
      e = (float)var0;
      Window var2 = c.getWindow();
      f = new Matrix4f(RenderSystem.getProjectionMatrix());
      g = new Matrix4f(RenderSystem.getModelViewMatrix());
      double var3 = var2.getFramebufferWidth() / var0;
      double var5 = var2.getFramebufferHeight() / var0;
      Matrix4f var10000 = new Matrix4f();
      float var10002 = (float)var3;
      float var10003 = (float)var5;
      String var10005 = "bwv";
      String var10006 = "bww";
      Matrix4f var7 = var10000.setOrtho(0.0F, var10002, var10003, 0.0F, 1000.0F, 21000.0F);
      RenderSystem.setProjectionMatrix(var7, ProjectionType.ORTHOGRAPHIC);
      RenderSystem.getModelViewStack().pushMatrix();
      RenderSystem.getModelViewStack().identity();
      Matrix4fStack var18 = RenderSystem.getModelViewStack();
      int var19 = (int)7154278882758111267L;
      int var9 = -898332521;
      int var8 = var19;
      int var20 = var8 & ~var9 | ~var8 & var9;
      var9 = 955744254;
      var8 = var20;
      int var21 = (var8 | var9) & (~var8 | ~var9);
      int var10004 = (int)8427382870475674769L;
      var9 = -1009724992;
      var8 = var10004;
      var10004 = (var8 | var9) & ~(var8 & var9);
      var9 = 1512153533;
      var8 = var10004;
      var9 = (var8 | var9) - (var8 & var9);
      var8 = var21;
      int var22 = var8 - ~var9 - 1;
      var18.translate(0.0F, 0.0F, -11000.0F);
   }

   public static void a() {
      RenderSystem.getModelViewStack().popMatrix();
      if (f != null) {
         RenderSystem.setProjectionMatrix(f, ProjectionType.ORTHOGRAPHIC);
      }

      Window var0 = c.getWindow();
      e = (float)var0.getScaleFactor();
   }

   public static ScreenPoint a(int var0, int var1) {
      double var2 = c.getWindow().getScaleFactor();
      double var10002 = var0 * var2;
      int var5 = 1654990468;
      int var4 = -679896335;
      int var10003 = var4 + var5 - 2 * (var4 & var5);
      var5 = -17451680;
      var4 = var10003;
      var10003 = var4 & ~var5 | ~var4 & var5;
      int var20 = (int)(var10002 / 2.0);
      double var22 = var1 * var2;
      var5 = 1843249913;
      var4 = 1856385475;
      int var10005 = (var4 | var5) & ~(var4 & var5);
      var5 = 58454836;
      var4 = var10005;
      var10005 = var4 & ~var5 | ~var4 & var5;
      var10005 = (int)5695694650592076564L;
      var5 = -2036398088;
      var4 = var10005;
      var10005 = (var4 | var5) & ~(var4 & var5);
      var5 = 188556520;
      var4 = var10005;
      var10005 = (var4 | var5) & ~(var4 & var5);
      var5 = 556232191;
      var4 = 890926752;
      var10005 = (var4 | var5) & ~(var4 & var5);
      var5 = 339549005;
      var4 = var10005;
      var10005 = var4 & ~var5 | ~var4 & var5;
      return new ScreenPoint(var20, (int)(var22 / 2.0));
   }

   public static ScreenPoint a(double var0, double var2) {
      double var4 = c.getWindow().getScaleFactor();
      double var10002 = var0 * var4;
      int var10003 = (int)-7489074661961622151L;
      int var7 = -867014517;
      int var6 = var10003;
      var10003 = (var6 | var7) & (~var6 | ~var7);
      var7 = 88296806;
      var6 = var10003;
      var10003 = ((var6 | var7) - (var6 & var7)) * ((var6 | var7) - (var6 & var7));
      int var14 = (int)(var10002 / 2.0);
      double var17 = var2 * var4;
      var7 = 237298754;
      var6 = -440280126;
      int var10004 = (var6 | var7) & (~var6 | ~var7);
      var7 = 381660010;
      var6 = var10004;
      var10004 = (var6 + var7 - 2 * (var6 & var7)) * (var6 + var7 - 2 * (var6 & var7));
      return new ScreenPoint(var14, (int)(var17 / 2.0));
   }

   public static void b() {
      RenderSystem.getModelViewStack().pushMatrix();
   }

   public static void c() {
      RenderSystem.getModelViewStack().popMatrix();
   }

   public static void a(float var0, float var1, float var2) {
      RenderSystem.getModelViewStack().scale(var0, var1, var2);
   }

   public static void b(float var0, float var1, float var2) {
      RenderSystem.getModelViewStack().translate(var0, var1, var2);
   }

   @Generated
   public static float d() {
      return e;
   }

   public static String b(String var0, String var1, int var2, int var3, int var4, int var5) {
      char[] var6 = var1.toCharArray();
      char[] var7 = new char[var6.length];
      int var10000 = (int)-1884360442033532729L;
      int var18 = 1977042521;
      int var17 = var10000;
      var10000 = (var17 | var18) & (~var17 | ~var18);
      var18 = 303847060;
      var17 = var10000;
      char[] var264 = new char[(var17 | var18) & ~(var17 & var18)];
      var18 = -415263341;
      var17 = -1243017383;
      int var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1389796042;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      int var10003 = (int)3692747700054568596L;
      var18 = 935316424;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -312791698;
      var17 = var10003;
      var264[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var18 = -1766967998;
      var17 = 957965607;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -1346940828;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -2066112329;
      var17 = -561319532;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1515418278;
      var17 = var10003;
      var264[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var18 = -1467702467;
      var17 = 1775069279;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1052128416;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)1771547314646204377L;
      var18 = -1741268844;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 276743371;
      var17 = var10003;
      var264[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var18 = -1367842126;
      var17 = 1156305072;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -359419391;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      int var10004 = (int)139934712249827506L;
      var18 = -1969387168;
      var17 = var10004;
      var10004 = (var17 | var18) - (var17 & var18);
      var18 = -1778890280;
      var17 = var10004;
      var10004 = (var17 | var18) - (var17 & var18);
      var18 = -174996375;
      var17 = 432596183;
      var10004 = (var17 | var18) & (~var17 | ~var18);
      var18 = -329703250;
      var17 = var10004;
      var10004 = (var17 | var18) - (var17 & var18);
      var18 = -475107146;
      var17 = 256886029;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -320787032;
      var17 = var10003;
      var264[var10002] = (char)((var17 | var18) - (var17 & var18));
      var10002 = (int)-5086888374273739573L;
      var18 = 502533374;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -2102560719;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var10003 = (int)-7354257493503524846L;
      var18 = -1755769537;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1344063406;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -1568105201;
      var17 = -1195179520;
      var10004 = (var17 | var18) & ~(var17 & var18);
      var18 = -1791508272;
      var17 = var10004;
      var18 = (var17 | var18) - (var17 & var18);
      var17 = var10003;
      var10003 = (var17 | var18) + (var17 & var18);
      var10003 = (int)-1304481272664922692L;
      var18 = 958079006;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1615604601;
      var17 = var10003;
      var264[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var18 = 1770075867;
      var17 = -1378891152;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1001456466;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 2071733776;
      var17 = 175546116;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1896545430;
      var17 = var10003;
      var264[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var10002 = (int)-1594202658244395289L;
      var18 = -336598148;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 481564061;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1385682604;
      var17 = 1934893704;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 566492471;
      var17 = var10003;
      var264[var10002] = (char)((var17 | var18) - (var17 & var18));
      var18 = -1308612030;
      var17 = -1057794543;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1928559700;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)8714853608539356367L;
      var18 = -1029091024;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -1003644451;
      var17 = var10003;
      var264[var10002] = (char)((var17 | var18) - (var17 & var18));
      var10002 = (int)-3708588250070884110L;
      var18 = 1724470332;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -694209338;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)9145346934807990219L;
      var18 = 558728679;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1706918527;
      var17 = var10003;
      var264[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var10002 = (int)4471711733899174359L;
      var18 = -1785344363;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1466667189;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1076434241;
      var17 = 456768287;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -1527818620;
      var17 = var10003;
      var264[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      char[] var8 = var264;
      var18 = -1863702891;
      var17 = -308422000;
      var10000 = (var17 | var18) & (~var17 | ~var18);
      var18 = 2105015311;
      var17 = var10000;
      char[] var266 = new char[(var17 | var18) - (var17 & var18)];
      var18 = -609128267;
      var17 = 211199306;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -685255169;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -310519646;
      var17 = -903335516;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 659923238;
      var17 = var10003;
      var266[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var10002 = (int)-1205902718022534654L;
      var18 = 49144831;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -126133764;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 286800589;
      var17 = -1037693467;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -2092270629;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1836468966;
      var17 = -1758241925;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 96103010;
      var17 = var10003;
      var266[var10002] = (char)((var17 | var18) - (var17 & var18));
      var18 = -193953073;
      var17 = -204569857;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 129892402;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var10003 = (int)3441053744747369839L;
      var18 = -1051483225;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 178847080;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var10004 = (int)-6899591064283466923L;
      var18 = -1981919798;
      var17 = var10004;
      var10004 = var17 + var18 - 2 * (var17 & var18);
      var18 = -133100969;
      var17 = var10004;
      var18 = (var17 | var18) - (var17 & var18);
      var17 = var10003;
      var10003 = (var17 & ~var18) + (var18 & ~var17) + 2 * (var17 & var18);
      var18 = 2003971555;
      var17 = -1723734147;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -298627635;
      var17 = var10003;
      var266[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var10002 = (int)767904868483665033L;
      var18 = -1548537106;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1760575076;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -871784041;
      var17 = -231724856;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 1043968349;
      var17 = var10003;
      var266[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var10002 = (int)4331194735690962945L;
      var18 = -1062367096;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -649377651;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)-5636264624489797808L;
      var18 = -1518741160;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 139888200;
      var17 = var10003;
      var266[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var18 = 456081813;
      var17 = -438130385;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -20059969;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1954138856;
      var17 = -1564021389;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -692117745;
      var17 = var10003;
      var266[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var10002 = (int)-1214133172269862694L;
      var18 = 1786760601;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1856634181;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 161605481;
      var17 = -1970585747;
      var10004 = (var17 | var18) - (var17 & var18);
      var18 = -2094344177;
      var17 = var10004;
      var10004 = (var17 | var18) & ~(var17 & var18);
      var10004 = (int)4067948958887876297L;
      var18 = 1765479216;
      var17 = var10004;
      var10004 = (var17 | var18) & ~(var17 & var18);
      var18 = 466978297;
      var17 = var10004;
      var10004 = (var17 | var18) - (var17 & var18);
      var10003 = (int)2664457722587108943L;
      var18 = -660986791;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1363375407;
      var17 = var10003;
      var266[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var18 = 1875436345;
      var17 = -180078292;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1702045166;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -1709098713;
      var17 = 86948970;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1626368651;
      var17 = var10003;
      var266[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var18 = -1960689215;
      var17 = 1711669282;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -316390933;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1990761777;
      var17 = -1182819515;
      var10004 = (var17 | var18) & (~var17 | ~var18);
      var18 = -807991706;
      var17 = var10004;
      var10004 = (var17 | var18) & ~(var17 & var18);
      var18 = 416244288;
      var17 = -1049783995;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -643665919;
      var17 = var10003;
      var266[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var10002 = (int)-8471005266311601875L;
      var18 = -933483668;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -1152087480;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 1290097721;
      var17 = 200217398;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 1191867452;
      var17 = var10003;
      var266[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      char[] var9 = var266;
      var18 = -1427262938;
      var17 = 1231279120;
      var10000 = var17 + var18 - 2 * (var17 & var18);
      var18 = -477206986;
      var17 = var10000;

      for (int var10 = (var17 | var18) & ~(var17 & var18); var10 < var6.length; var10++) {
         if (a != a) {
            throw new RuntimeException();
         }

         char var321 = var6[var10];
         char var249 = var8[var10 % var8.length];
         char var128 = var321;
         var7[var10] = (char)((var128 | var249) - (var128 & var249));
      }

      char[] var19 = new char[var7.length];
      var10000 = (int)-8553926244977676353L;
      var18 = 1580762879;
      var17 = var10000;
      var10000 = var17 & ~var18 | ~var17 & var18;
      var18 = -1022465728;
      var17 = var10000;

      for (int var11 = (var17 | var18) & ~(var17 & var18); var11 < var6.length; var11++) {
         char var322 = var7[var11];
         char var252 = var9[var11 % var9.length];
         char var131 = var322;
         var19[var11] = (char)(var131 & ~var252 | ~var131 & var252);
      }

      String var20 = new String(var19);
      int var12 = var20.hashCode();
      var18 = var5;
      var17 = var3;
      var10000 = (var17 ^ var18) - 2 * (~var17 & var18);
      var18 = var2;
      var17 = var10000;
      int var13 = (var17 ^ var18) - 2 * (~var17 & var18);
      char[] var14 = var0.toCharArray();
      char[] var15 = new char[var14.length];
      var10000 = (int)7871969113773355659L;
      var18 = -2120478082;
      var17 = var10000;
      var10000 = (var17 | var18) & (~var17 | ~var18);
      var18 = 349348085;
      var17 = var10000;

      for (int var16 = (var17 | var18) & (~var17 | ~var18); var16 < var15.length; var16++) {
         var18 = 579220806;
         var17 = 152260344;
         int var10001 = (var17 | var18) - (var17 & var18);
         var18 = 731216828;
         var17 = var10001;
         switch (var16 % ((var17 | var18) & ~(var17 & var18))) {
            case 0:
               var18 = var12;
               var17 = var13;
               var10002 = (var17 | var18) & (~var17 | ~var18);
               char var262 = var14[var16];
               var17 = var10002;
               var15[var16] = (char)((var17 | var262) & ~(var17 & var262));
               break;
            case 1:
               var18 = var13;
               var17 = var5;
               var10002 = var17 & ~var18 | ~var17 & var18;
               char var260 = var14[var16];
               var17 = var10002;
               var15[var16] = (char)(var17 + var260 - 2 * (var17 & var260));
         }
      }

      return new String(var15);
   }
}
