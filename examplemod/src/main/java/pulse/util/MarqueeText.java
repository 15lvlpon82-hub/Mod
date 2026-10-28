package pulse;

import java.awt.Color;
import lombok.Generated;
import net.minecraft.client.util.math.MatrixStack;

public class MarqueeText {
   public static final long a = 750L;
   public static final long b = 500L;
   public static final long c = 2500L;
   public static final float d = 0.2F;
   private long g = 0L;
   private boolean h;
   private boolean i;
   private float j;
   private final AnimationState k;
   public static int e;
   public static boolean f;

   public MarqueeText() {
      int var2 = -1578232415;
      int var1 = 1979201552;
      int var10001 = (var1 | var2) & ~(var1 & var2);
      var2 = -736744015;
      var1 = var10001;
      this.h = pulse.Bool.from((var1 | var2) & ~(var1 & var2));
      var10001 = (int)-3751004917821150289L;
      var2 = 2009301216;
      var1 = var10001;
      var10001 = var1 + var2 - 2 * (var1 & var2);
      var2 = -716870833;
      var1 = var10001;
      this.i = pulse.Bool.from((var1 | var2) - (var1 & var2));
      this.j = 0.0F;
      this.k = new AnimationState();
   }

   public float a(String var1, FontRenderer var2, float var3, float var4) {
      float var5 = var2.a(var1) * var4;
      if (this.h && !(var5 <= var3)) {
         float var6 = 0.0F;
         if (var5 > var3) {
            long var10000 = System.currentTimeMillis() - this.g;
            int var13 = -1859682639;
            int var12 = -1798846945;
            int var10001 = var12 + var13 - 2 * (var12 & var13);
            var13 = 1475153607;
            var12 = var10001;
            var10001 = (var12 | var13) & ~(var12 & var13);
            var13 = 1941128609;
            var12 = -427499104;
            int var10002 = (var12 | var13) - (var12 & var13);
            var13 = -1753082789;
            var12 = var10002;
            var13 = var12 + var13 - 2 * (var12 & var13);
            var12 = var10001;
            var10001 = (var12 & ~var13) + (var13 & ~var12) + 2 * (var12 & var13);
            long var7 = var10000 % 2500L;
            String var70 = "chs";
            float var9;
            if (var7 >= 750L) {
               String var71 = "cht";
               if (var7 >= 1250L) {
                  var10002 = (int)-3616695473350792689L;
                  var13 = -1931822605;
                  var12 = var10002;
                  var10002 = (var12 | var13) & (~var12 | ~var13);
                  var13 = -2030890004;
                  var12 = var10002;
                  var10002 = var12 & ~var13 | ~var12 & var13;
                  var13 = -515747855;
                  var12 = 2060263204;
                  var10002 = var12 & ~var13 | ~var12 & var13;
                  var13 = -1685106474;
                  var12 = var10002;
                  var10002 = (var12 | var13) & ~(var12 & var13);
                  var10002 = (int)3759878665343979201L;
                  var13 = -75109044;
                  var12 = var10002;
                  var10002 = var12 & ~var13 | ~var12 & var13;
                  var13 = 1306534814;
                  var12 = var10002;
                  var10002 = var12 + var13 - 2 * (var12 & var13);
                  if (var7 >= 2000L) {
                     var9 = 0.0F;
                  } else {
                     int var10003 = (int)5118937093352011027L;
                     var13 = 603800993;
                     var12 = var10003;
                     var10003 = (var12 | var13) - (var12 & var13);
                     var13 = 1730965666;
                     var12 = var10003;
                     var10003 = (var12 | var13) & (~var12 | ~var13);
                     var10003 = (int)5086170805137469214L;
                     var13 = 708173995;
                     var12 = var10003;
                     var10003 = var12 & ~var13 | ~var12 & var13;
                     var13 = 1629196212;
                     var12 = var10003;
                     var10003 = (var12 | var13) & ~(var12 & var13);
                     float var72 = (float)(var7 - 1250L);
                     String var86 = "chu";
                     var9 = 1.0F - var72 / 750.0F;
                  }
               } else {
                  var9 = 1.0F;
                  if (e != e) {
                     var13 = 1787064098;
                     var12 = -858424209;
                     int var63 = var12 + var13 - 2 * (var12 & var13);
                     var13 = -1197577165;
                     var12 = var63;
                     int var64 = var12 + var13 - 2 * (var12 & var13);
                     int var65 = (int)6117681356339225662L;
                     var13 = 828833977;
                     var12 = var65;
                     int var66 = (var12 | var13) - (var12 & var13);
                     var13 = 1628977208;
                     var12 = var66;
                     int var11 = var12 & ~var13 | ~var12 & var13;
                     e = var11;
                  }
               }
            } else {
               float var67 = (float)var7;
               var13 = -1061101959;
               var12 = -1077157987;
               var10001 = var12 + var13 - 2 * (var12 & var13);
               var13 = -672923763;
               var12 = var10001;
               var10001 = (var12 + var13 - 2 * (var12 & var13)) * (var12 + var13 - 2 * (var12 & var13));
               var9 = var67 / 750.0F;
            }

            var6 = -(var5 - var3) * var9;
         }

         float var14;
         if (this.i) {
            this.k.a();
            var14 = (float)this.k.j();
            if (this.k.d()) {
               int var75 = (int)2761255470376369194L;
               int var59 = -1356737331;
               int var35 = var75;
               var75 = var35 + var59 - 2 * (var35 & var59);
               var59 = -624760601;
               var35 = var75;
               this.h = pulse.Bool.from(var35 & ~var59 | ~var35 & var59);
               var59 = -203021089;
               var35 = 64585097;
               var75 = (var35 | var59) & ~(var35 & var59);
               var59 = -264283818;
               var35 = var75;
               this.i = pulse.Bool.from(var35 + var59 - 2 * (var35 & var59));
               var14 = 0.0F;
            }
         } else {
            this.j = var6;
            var14 = var6;
         }

         return var14;
      } else {
         return 0.0F;
      }
   }

   public void a(boolean var1) {
      if (!var1) {
         if (e != e) {
            int var5 = 1989520206;
            int var4 = 1515942540;
            int var10000 = var4 + var5 - 2 * (var4 & var5);
            var5 = 1354099415;
            var4 = var10000;
            var10000 = var4 + var5 - 2 * (var4 & var5);
            var5 = 2094593725;
            var4 = 205550239;
            var10000 = (var4 | var5) - (var4 & var5);
            var5 = -1111692741;
            var4 = var10000;
            int var3 = (var4 | var5) & ~(var4 & var5);
            e = var3;
         }
      } else if (!this.h) {
         int var10001 = (int)4334120588636419638L;
         int var23 = 1986792997;
         int var9 = var10001;
         var10001 = (var9 | var23) & ~(var9 & var23);
         var23 = 621639698;
         var9 = var10001;
         this.h = pulse.Bool.from((var9 | var23) - (var9 & var23));
         this.g = System.currentTimeMillis();
         var23 = -1083419985;
         var9 = -880786850;
         var10001 = var9 & ~var23 | ~var9 & var23;
         var23 = 1961627889;
         var9 = var10001;
         this.i = pulse.Bool.from((var9 | var23) & ~(var9 & var23));
      }

      if (!var1 && this.h && !this.i) {
         int var38 = (int)-7654746119120546351L;
         int var27 = 1650438199;
         int var13 = var38;
         var38 = var13 & ~var27 | ~var13 & var27;
         var27 = 1985652199;
         var13 = var38;
         this.i = pulse.Bool.from((var13 | var27) & (~var13 | ~var27));
         this.k.d(this.j);
         var27 = -1387094286;
         var13 = 129709608;
         int var10002 = (var13 | var27) & (~var13 | ~var27);
         var27 = 486410292;
         var13 = var10002;
         var10002 = var13 + var27 - 2 * (var13 & var27);
         int var10003 = (int)-5767383392160759082L;
         var27 = 1447329927;
         var13 = var10003;
         var10003 = (var13 | var27) & ~(var13 & var27);
         var27 = 1774611647;
         var13 = var10003;
         var27 = (var13 | var27) - (var13 & var27);
         var13 = var10002;
         var10002 = (var13 | var27) + (var13 & var27);
         this.k.a(0.0, 0.2F, pulse.Easing.h);
      }
   }

   public void a(MatrixStack var1, Renderer2D var2, FontRenderer var3, String var4, float var5, float var6, float var7, float var8, Color var9, float var10) {
      float var11 = var3.a(var4) * var8;
      float var12 = this.a(var4, var3, var7, var8);
      int var18 = -1234853704;
      int var17 = 2002047670;
      int var10000 = (var17 | var18) & (~var17 | ~var18);
      var18 = -997023103;
      var17 = var10000;
      var10000 = (var17 | var18) - (var17 & var18);
      int var13 = (int)(255.0F * var10);
      Color var14 = new Color(var9.getRed(), var9.getGreen(), var9.getBlue(), var13);
      if (!(var11 > var7)) {
         var10000 = (int)-3234594898424954452L;
         var18 = 1586178090;
         var17 = var10000;
         var10000 = (var17 | var18) & ~(var17 & var18);
         var18 = -1582115442;
         var17 = var10000;
         var10000 = var17 & ~var18 | ~var17 & var18;
         var18 = 1695364975;
         var17 = 1870027827;
         int var10001 = var17 + var18 - 2 * (var17 & var18);
         var18 = -741013735;
         var17 = var10001;
         var18 = var17 + var18 - 2 * (var17 & var18);
         var17 = var10000;
         var10000 = 2 * (var17 | var18) - (var17 ^ var18);
         var10000 = (int)8492715652516576915L;
         var18 = -774419948;
         var17 = var10000;
         var10000 = (var17 | var18) & (~var17 | ~var18);
         var18 = 2014893431;
         var17 = var10000;
         int var16 = (var17 | var18) - (var17 & var18);
         var18 = -1779068050;
         var17 = 1504013010;
         var10001 = (var17 | var18) - (var17 & var18);
         var18 = -867108419;
         var17 = var10001;
         var10001 = var17 & ~var18 | ~var17 & var18;
         var10001 = (int)-8613059151125960713L;
         var18 = 87856342;
         var17 = var10001;
         var10001 = (var17 | var18) & ~(var17 & var18);
         var18 = 109654835;
         var17 = var10001;
         var10001 = (var17 | var18) - (var17 & var18);
         var18 = 63652138;
         var17 = 1461252219;
         var10001 = (var17 | var18) & ~(var17 & var18);
         var18 = 1423159632;
         var17 = var10001;
         var10001 = (var17 | var18) & (~var17 | ~var18);
         var10000 = (int)-3261600640136414993L;
         var18 = -1057280888;
         var17 = var10000;
         var10000 = var17 & ~var18 | ~var17 & var18;
         var18 = 1323546799;
         var17 = var10000;
         if ((var17 | var18) - (var17 & var18) >= var16) {
            throw new RuntimeException();
         }
      } else {
         ScissorStack var70 = var2.b();
         String var10003 = "chv";
         float var10002 = var6 - 5.0F;
         var18 = -1650164197;
         var17 = -592949218;
         int var10004 = var17 & ~var18 | ~var17 & var18;
         var18 = -638451723;
         var17 = var10004;
         var10004 = (var17 | var18) & ~(var17 & var18);
         var18 = -1439241730;
         var17 = -511730126;
         int var10005 = (var17 | var18) & ~(var17 & var18);
         var18 = -352658297;
         var17 = var10005;
         var18 = (var17 | var18) & (~var17 | ~var18);
         var17 = var10004;
         var10004 = var17 - ~var18 - 1;
         var70.a(var5, var10002, var7, 20.0F, var1);
      }

      var1.push();
      var1.translate(var5 + var12, var6, 0.0F);
      var1.scale(var8, var8, 1.0F);
      var1.translate(-(var5 + var12), -var6, 0.0F);
      var3.a(var4, var5 + var12, var6, var14, var1);
      var1.pop();
      if (var11 > var7) {
         var2.b().a(var1);
      }
   }

   @Generated
   public long a() {
      return this.g;
   }

   @Generated
   public boolean b() {
      return this.h;
   }

   @Generated
   public boolean c() {
      return this.i;
   }

   @Generated
   public float d() {
      return this.j;
   }

   @Generated
   public AnimationState e() {
      return this.k;
   }

   @Generated
   public void b(boolean var1) {
      this.h = var1;
   }

   @Generated
   public void c(boolean var1) {
      this.i = var1;
   }

   @Generated
   public void a(float var1) {
      this.j = var1;
   }

   public static String a(String var0, String var1, int var2, int var3, int var4, int var5) {
      char[] var6 = var1.toCharArray();
      char[] var7 = new char[var6.length];
      int var10000 = (int)768514316993430592L;
      int var18 = 314360435;
      int var17 = var10000;
      var10000 = var17 + var18 - 2 * (var17 & var18);
      var18 = 126797369;
      var17 = var10000;
      char[] var252 = new char[(var17 | var18) & ~(var17 & var18)];
      var18 = 1462513674;
      var17 = 1385761174;
      int var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 95762844;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 406249764;
      var17 = -1572766;
      int var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -404838028;
      var17 = var10003;
      var252[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var18 = 831823822;
      var17 = -928688874;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -114177319;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 476632241;
      var17 = -429108400;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -100359068;
      var17 = var10003;
      var252[var10002] = (char)((var17 | var18) - (var17 & var18));
      var10002 = (int)-3308192840876114540L;
      var18 = 43126241;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -2054901641;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)8055984558952367931L;
      var18 = -2113185131;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -1570226648;
      var17 = var10003;
      var252[var10002] = (char)((var17 | var18) - (var17 & var18));
      var10002 = (int)-232338240274720926L;
      var18 = -1247126574;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 1292225715;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -622793605;
      var17 = -1732972011;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1094355799;
      var17 = var10003;
      var10003 = ((var17 | var18) & ~(var17 & var18)) * ((var17 | var18) & ~(var17 & var18));
      var18 = 1124656660;
      var17 = -518398172;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1575902941;
      var17 = var10003;
      var252[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var10002 = (int)-2396380864557143515L;
      var18 = -562432602;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 67035015;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)-2883876038744775180L;
      var18 = -367755456;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -527157560;
      var17 = var10003;
      var10003 = ((var17 | var18) & (~var17 | ~var18)) * ((var17 | var18) & (~var17 | ~var18));
      var10003 = (int)1059383145575320513L;
      var18 = -670831141;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 1896806207;
      var17 = var10003;
      var252[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var10002 = (int)-8755784957827325829L;
      var18 = -2006422407;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 446041095;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)5788132499890648741L;
      var18 = 2018741981;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -122421766;
      var17 = var10003;
      var252[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var10002 = (int)-8763426009360205516L;
      var18 = 1264773683;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -339176703;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -779949105;
      var17 = -1131203486;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 1829885630;
      var17 = var10003;
      var252[var10002] = (char)((var17 | var18) - (var17 & var18));
      var18 = -453716621;
      var17 = 377178191;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -225469125;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 1579728182;
      var17 = -338903875;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1243335255;
      var17 = var10003;
      var252[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var10002 = (int)-7459277866019134751L;
      var18 = 1240898681;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 185106064;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -2147321196;
      var17 = -94277917;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 2053315620;
      var17 = var10003;
      var252[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var18 = -1387822746;
      var17 = -1752525396;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 986518723;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 1983333435;
      var17 = -1446059309;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -537288244;
      var17 = var10003;
      var252[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      char[] var8 = var252;
      var10000 = (int)-1575572810803447479L;
      var18 = -1325965533;
      var17 = var10000;
      var10000 = var17 + var18 - 2 * (var17 & var18);
      var18 = -423844256;
      var17 = var10000;
      char[] var255 = new char[(var17 | var18) & (~var17 | ~var18)];
      var10002 = (int)6726738004947963371L;
      var18 = -635897195;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -1206651010;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)-8370312703738766897L;
      var18 = -1192452094;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 576385517;
      var17 = var10003;
      var255[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var18 = -756530020;
      var17 = 1636666200;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -1285173307;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -285846030;
      var17 = -1852422241;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -470921874;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -979043385;
      var17 = 1428208517;
      int var10004 = (var17 | var18) - (var17 & var18);
      var18 = -1300925196;
      var17 = var10004;
      var18 = var17 + var18 - 2 * (var17 & var18);
      var17 = var10003;
      var10003 = (var17 ^ var18) + 2 * (var17 & var18);
      var18 = 1556159928;
      var17 = 1963598357;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 701217710;
      var17 = var10003;
      var255[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var18 = -1139710617;
      var17 = -1166151800;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 107776749;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var10003 = (int)-8898758476544582157L;
      var18 = -1538661380;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1787939832;
      var17 = var10003;
      var10003 = ((var17 | var18) - (var17 & var18)) * ((var17 | var18) - (var17 & var18));
      var18 = -1606417822;
      var17 = -1365237733;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 249603370;
      var17 = var10003;
      var255[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var18 = -1439956889;
      var17 = 243347455;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -1532153957;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 333154774;
      var17 = -580557029;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -826353969;
      var17 = var10003;
      var255[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var18 = 1692250935;
      var17 = -2006957792;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -323096045;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)-1844608517132881815L;
      var18 = 1028568650;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -1746076061;
      var17 = var10003;
      var255[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var10002 = (int)-7177628691904770642L;
      var18 = -923102956;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 161995967;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -923141578;
      var17 = -1646612036;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1428386590;
      var17 = var10003;
      var255[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var10002 = (int)-7172191424087606074L;
      var18 = 439280807;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 1208572007;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      String var347 = "chw";
      var18 = 1034667916;
      var17 = 583942354;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 526712935;
      var17 = var10003;
      var255[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var10002 = (int)-6745650356730834076L;
      var18 = 723941437;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1087100066;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)-8829311673762372165L;
      var18 = -888572622;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 824590513;
      var17 = var10003;
      var255[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var18 = 352516824;
      var17 = 1129076534;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 1447996902;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var10003 = (int)-5551056742957339803L;
      var18 = -1290244198;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 778407708;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var10004 = (int)8044894036677103911L;
      var18 = -357981634;
      var17 = var10004;
      var10004 = (var17 | var18) - (var17 & var18);
      var18 = -1446453468;
      var17 = var10004;
      var18 = (var17 | var18) - (var17 & var18);
      var17 = var10003;
      var10003 = var17 - ~var18 - 1;
      var18 = -425571114;
      var17 = -508138783;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 118793523;
      var17 = var10003;
      var255[var10002] = (char)((var17 | var18) - (var17 & var18));
      var18 = 924526023;
      var17 = -1391173484;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -1710275238;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)-1880521565271578633L;
      var18 = -796373222;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 1561254878;
      var17 = var10003;
      var255[var10002] = (char)((var17 | var18) - (var17 & var18));
      char[] var9 = var255;
      var10000 = (int)8102319446089061438L;
      var18 = 1648547670;
      var17 = var10000;
      var10000 = (var17 | var18) - (var17 & var18);
      var18 = -626916504;
      var17 = var10000;

      for (int var10 = (var17 | var18) - (var17 & var18); var10 < var6.length; var10++) {
         char var312 = var6[var10];
         char var237 = var8[var10 % var8.length];
         char var122 = var312;
         var7[var10] = (char)((var122 | var237) - (var122 & var237));
      }

      char[] var19 = new char[var7.length];
      var18 = 445916776;
      var17 = 210251211;
      var10000 = (var17 | var18) & (~var17 | ~var18);
      var18 = 370936739;
      var17 = var10000;

      for (int var11 = var17 & ~var18 | ~var17 & var18; var11 < var6.length; var11++) {
         char var313 = var7[var11];
         char var240 = var9[var11 % var9.length];
         char var125 = var313;
         var19[var11] = (char)((var125 | var240) & ~(var125 & var240));
      }

      String var20 = new String(var19);
      int var12 = var20.hashCode();
      var18 = var5;
      var17 = var3;
      var10000 = (var17 ^ var18) - 2 * (~var17 & var18);
      var18 = var2;
      var17 = var10000;
      int var13 = var17 + ~var18 + 1;
      char[] var14 = var0.toCharArray();
      char[] var15 = new char[var14.length];
      var10000 = (int)8848093850523683499L;
      var18 = -48082902;
      var17 = var10000;
      var10000 = (var17 | var18) - (var17 & var18);
      var18 = -1360389503;
      var17 = var10000;

      for (int var16 = (var17 | var18) & (~var17 | ~var18); var16 < var15.length; var16++) {
         int var10001 = (int)7586747513602397444L;
         var18 = -623936279;
         var17 = var10001;
         var10001 = var17 & ~var18 | ~var17 & var18;
         var18 = 236333551;
         var17 = var10001;
         switch (var16 % ((var17 | var18) - (var17 & var18))) {
            case 0:
               var18 = var12;
               var17 = var13;
               var10002 = (var17 | var18) & ~(var17 & var18);
               char var250 = var14[var16];
               var17 = var10002;
               var15[var16] = (char)(var17 + var250 - 2 * (var17 & var250));
               break;
            case 1:
               var18 = var13;
               var17 = var5;
               var10002 = (var17 | var18) - (var17 & var18);
               char var248 = var14[var16];
               var17 = var10002;
               var15[var16] = (char)((var17 | var248) & ~(var17 & var248));
         }
      }

      return new String(var15);
   }
}
