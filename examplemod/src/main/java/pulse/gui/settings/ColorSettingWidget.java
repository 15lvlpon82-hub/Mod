package pulse;


import pulse.settings.ColorSetting;
import java.awt.Color;
import net.minecraft.client.util.math.MatrixStack;

public class ColorSettingWidget implements SettingWidget {
   public static final float a = 20.0F;
   private static final float d = 8.0F;
   private static final float e = 14.0F;
   private static final float f = 6.0F;
   private static final float g = 11.0F;
   private static final float h = 4.0F;
   private static final Color i = pulse.Theme.V;
   private final String j;
   private float k;
   private float l;
   private float m;
   private final ColorSetting n;
   private final AnimationState o = new AnimationState();
   private final MarqueeText p = new MarqueeText();
   private boolean q;
   private float r;
   private float s;
   private float t;
   private boolean u;
   public static int b;
   public static boolean c;

   public ColorSettingWidget(ColorSetting var1) {
      int var10001 = (int)8134845542127639880L;
      int var3 = -1520063537;
      int var2 = var10001;
      var10001 = var2 & ~var3 | ~var2 & var3;
      var3 = 1012250247;
      var2 = var10001;
      this.q = pulse.Bool.from((var2 | var3) & ~(var2 & var3));
      this.t = 1.0F;
      var3 = 127762559;
      var2 = 44060809;
      var10001 = (var2 | var3) - (var2 & var3);
      var3 = 87937270;
      var2 = var10001;
      this.u = pulse.Bool.from((var2 | var3) & (~var2 | ~var3));
      this.n = var1;
      this.j = var1.f();
      this.k = var1.c();
      this.l = var1.d();
      this.m = var1.e();
   }

   public ColorSettingWidget(String var1, Color var2) {
      int var10001 = (int)7145427761740764554L;
      int var5 = 890396527;
      int var4 = var10001;
      var10001 = (var4 | var5) & (~var4 | ~var5);
      var5 = -942175515;
      var4 = var10001;
      this.q = pulse.Bool.from((var4 | var5) & ~(var4 & var5));
      this.t = 1.0F;
      var5 = 1901238272;
      var4 = 939978945;
      var10001 = (var4 | var5) - (var4 & var5);
      var5 = 1230268609;
      var4 = var10001;
      this.u = pulse.Bool.from(var4 & ~var5 | ~var4 & var5);
      this.n = null;
      this.j = var1;
      float[] var3 = Color.RGBtoHSB(var2.getRed(), var2.getGreen(), var2.getBlue(), null);
      var5 = -957885762;
      var4 = 1020962064;
      int var10002 = var4 & ~var5 | ~var4 & var5;
      var5 = -96634962;
      var4 = var10002;
      this.k = var3[(var4 | var5) & ~(var4 & var5)];
      var10002 = (int)6906833093774614294L;
      var5 = -2096274998;
      var4 = var10002;
      var10002 = (var4 | var5) & ~(var4 & var5);
      var5 = 1448378077;
      var4 = var10002;
      this.l = var3[(var4 | var5) - (var4 & var5)];
      var10002 = (int)1939832354568860926L;
      var5 = 1360082467;
      var4 = var10002;
      var10002 = (var4 | var5) & ~(var4 & var5);
      var5 = -520895777;
      var4 = var10002;
      this.m = var3[var4 + var5 - 2 * (var4 & var5)];
   }

   public ColorSettingWidget(String var1, float var2, float var3, float var4) {
      int var10001 = (int)-1840601091127881130L;
      int var6 = 359401080;
      int var5 = var10001;
      var10001 = var5 & ~var6 | ~var5 & var6;
      var6 = 726422574;
      var5 = var10001;
      this.q = pulse.Bool.from((var5 | var6) & (~var5 | ~var6));
      this.t = 1.0F;
      var6 = -1438819360;
      var5 = -1099010347;
      var10001 = (var5 | var6) & (~var5 | ~var6);
      var6 = 339948853;
      var5 = var10001;
      this.u = pulse.Bool.from((var5 | var6) - (var5 & var6));
      this.n = null;
      this.j = var1;
      this.k = var2;
      this.l = var3;
      this.m = var4;
   }

   @Override
   public String a() {
      return this.j;
   }

   @Override
   public float b() {
      int var2 = -1627228106;
      int var1 = 1905858469;
      int var10000 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1520811484;
      var1 = var10000;
      var10000 = var1 & ~var2 | ~var1 & var2;
      return 20.0F;
   }

   public Color c() {
      return Color.getHSBColor(this.k, this.l, this.m);
   }

   public void a(Color var1) {
      float[] var2 = Color.RGBtoHSB(var1.getRed(), var1.getGreen(), var1.getBlue(), null);
      int var4 = -1916947591;
      int var3 = -1666991092;
      int var10002 = (var3 | var4) - (var3 & var4);
      var4 = 287182709;
      var3 = var10002;
      this.k = var2[(var3 | var4) - (var3 & var4)];
      var10002 = (int)-4645144999894947915L;
      var4 = 910560923;
      var3 = var10002;
      var10002 = (var3 | var4) & (~var3 | ~var4);
      var4 = -112039633;
      var3 = var10002;
      this.l = var2[(var3 | var4) & ~(var3 & var4)];
      var10002 = (int)5883909561485235024L;
      var4 = 130361421;
      var3 = var10002;
      var10002 = var3 + var4 - 2 * (var3 & var4);
      var4 = 1629436703;
      var3 = var10002;
      this.m = var2[(var3 | var4) - (var3 & var4)];
      if (this.n != null) {
         this.n.a(var1);
      }
   }

   public float e() {
      return this.k;
   }

   public float f() {
      return this.l;
   }

   public float g() {
      return this.m;
   }

   public boolean h() {
      if (this.u) {
         if (pulse.ColorPickerPopup.a().c()) {
            int var23 = 928772436;
            int var13 = -1503465307;
            int var33 = (var13 | var23) - (var13 & var23);
            var23 = -1858534928;
            var13 = var33;
            return pulse.Bool.from((var13 | var23) & ~(var13 & var23));
         }

         if (c) {
            int var10000 = (int)4062429423171741495L;
            int var4 = 2114785945;
            int var3 = var10000;
            var10000 = (var3 | var4) & (~var3 | ~var4);
            var4 = -56423302;
            var3 = var10000;
            var10000 = (var3 | var4) - (var3 & var4);
            int var10001 = (int)953773988544796820L;
            var4 = -558243545;
            var3 = var10001;
            var10001 = (var3 | var4) - (var3 & var4);
            var4 = 743342717;
            var3 = var10001;
            var4 = (var3 | var4) & ~(var3 & var4);
            var3 = var10000;
            var10000 = var3 - ~var4 - 1;
            var10000 = (int)6879032369966108973L;
            var4 = -667386485;
            var3 = var10000;
            var10000 = (var3 | var4) & ~(var3 & var4);
            var4 = -446933415;
            var3 = var10000;
            int var2 = (var3 | var4) & ~(var3 & var4);
         }
      }

      int var30 = (int)1934485236774382003L;
      int var21 = 1018517286;
      int var11 = var30;
      var30 = var11 & ~var21 | ~var11 & var21;
      var21 = -308674923;
      var11 = var30;
      return pulse.Bool.from(var11 + var21 - 2 * (var11 & var21));
   }

   public boolean i() {
      int var10;
      if (this.u && pulse.ColorPickerPopup.a().c()) {
         int var7 = 1039792024;
         int var4 = -444448876;
         var10 = var4 & ~var7 | ~var4 & var7;
         var7 = -662976499;
         var4 = var10;
         var10 = (var4 | var7) & ~(var4 & var7);
      } else {
         var10 = (int)9153218334656953647L;
         int var2 = -628712451;
         int var1 = var10;
         var10 = (var1 | var2) & (~var1 | ~var2);
         var2 = -2041092398;
         var1 = var10;
         var10 = (var1 | var2) & ~(var1 & var2);
      }

      return pulse.Bool.from(var10);
   }

   @Override
   public void a(MatrixStack var1, Renderer2D var2, float var3, float var4, float var5, int var6, int var7, float var8, float var9) {
      int var32 = -1961514440;
      int var31 = -1202600686;
      int var10001 = (var31 | var32) & (~var31 | ~var32);
      var32 = 860122916;
      var31 = var10001;
      FontRenderer var10 = FontManager.a[(var31 | var32) - (var31 & var32)];
      var32 = -1911098027;
      var31 = 240555746;
      var10001 = var31 & ~var32 | ~var31 & var32;
      var32 = -2143263810;
      var31 = var10001;
      var10001 = (var31 | var32) & ~(var31 & var32);
      var10001 = (int)-1835354170129815728L;
      var32 = 2139748849;
      var31 = var10001;
      var10001 = var31 + var32 - 2 * (var31 & var32);
      var32 = 1139318444;
      var31 = var10001;
      var10001 = (var31 | var32) & (~var31 | ~var32);
      float var11 = 20.0F * var9;
      var32 = 1364577285;
      var31 = 1678967363;
      int var10000 = var31 & ~var32 | ~var31 & var32;
      var32 = -697701460;
      var31 = var10000;
      var10000 = ((var31 | var32) & (~var31 | ~var32)) * ((var31 | var32) & (~var31 | ~var32));
      float var12 = 8.0F * var9;
      this.t = var9;
      boolean var13 = GuiInput.a(var3, var4, var5, var11, var6, var7);
      this.p.a(var13);
      this.o.a();
      var10000 = (int)3703107019864454774L;
      var32 = 1680236332;
      var31 = var10000;
      var10000 = (var31 | var32) & (~var31 | ~var32);
      var32 = -124604943;
      var31 = var10000;
      var10000 = (var31 | var32) & ~(var31 & var32);
      var10001 = (int)9220012731948985325L;
      var32 = 1021849551;
      var31 = var10001;
      var10001 = var31 + var32 - 2 * (var31 & var32);
      var32 = 1603168453;
      var31 = var10001;
      var32 = (var31 | var32) - (var31 & var32);
      var31 = var10000;
      var10000 = (var31 ^ var32) + 2 * (var31 & var32);
      int var14 = (int)(255.0F * var8);
      String var127 = "cvg";
      float var15 = 14.0F * var9;
      float var16 = var3 + var5 - var12 - var15;
      float var128 = var16 - (var3 + var12);
      String var141 = "cvh";
      float var17 = var128 - 4.0F * var9;
      float var129 = var4 + var11 / 2.0F;
      float var142 = var10.b(this.j) * var9;
      int var10003 = (int)-8781424074422073385L;
      var32 = -765296186;
      var31 = var10003;
      var10003 = (var31 | var32) - (var31 & var32);
      var32 = 1549846037;
      var31 = var10003;
      var10003 = (var31 | var32) & (~var31 | ~var32);
      var32 = -1319994929;
      var31 = -926992176;
      var10003 = var31 & ~var32 | ~var31 & var32;
      var32 = 2045591820;
      var31 = var10003;
      var10003 = var31 + var32 - 2 * (var31 & var32);
      float var18 = var129 - var142 / 4.0F;
      this.p.a(var1, var2, var10, this.j, var3 + var12, var18, var17, var9, pulse.Theme.a, var8);
      float var19 = var4 + var11 / 2.0F - var15 / 2.0F;
      this.r = var16;
      this.s = var19;
      boolean var20 = GuiInput.a(var16, var19, var15, var15, var6, var7);
      if (var20 != this.q) {
         AnimationState var130 = this.o;
         double var157;
         if (!var20) {
            var32 = 1323530460;
            var31 = 1123305400;
            var10001 = var31 & ~var32 | ~var31 & var32;
            var32 = 1395419764;
            var31 = var10001;
            var10001 = (var31 | var32) & (~var31 | ~var32);
            var32 = -615793049;
            var31 = 1986089043;
            int var10002 = var31 + var32 - 2 * (var31 & var32);
            var32 = -1546119493;
            var31 = var10002;
            var32 = (var31 | var32) & ~(var31 & var32);
            var31 = var10001;
            var10001 = var31 - ~var32 - 1;
            var10001 = (int)-1071837604900902058L;
            var32 = 1207606639;
            var31 = var10001;
            var10001 = (var31 | var32) - (var31 & var32);
            var32 = -1997913092;
            var31 = var10001;
            int var30 = var31 + var32 - 2 * (var31 & var32);
            var10001 = (int)4840809510556142757L;
            var32 = 656462906;
            var31 = var10001;
            var10001 = var31 & ~var32 | ~var31 & var32;
            var32 = 1989245729;
            var31 = var10001;
            var10001 = (var31 & ~var32 | ~var31 & var32) * (var31 & ~var32 | ~var31 & var32);
            var32 = 1700906119;
            var31 = -72448150;
            var10001 = var31 + var32 - 2 * (var31 & var32);
            var32 = -1133061625;
            var31 = var10001;
            if (((var31 | var32) & ~(var31 & var32)) >= var30) {
               var32 = 1329284042;
               var31 = -2136337181;
               var10001 = (var31 | var32) - (var31 & var32);
               var32 = 1903199618;
               var31 = var10001;
               var10001 = (var31 | var32) & ~(var31 & var32);
               var10002 = (int)8582688485507139L;
               var32 = 2103897434;
               var31 = var10002;
               var10002 = (var31 | var32) & (~var31 | ~var32);
               var32 = -294736501;
               var31 = var10002;
               var32 = (var31 | var32) & ~(var31 & var32);
               var31 = var10001;
               var10001 = var31 - ~var32 - 1;
               var10001 = (int)-8290108284910311650L;
               var32 = 150381280;
               var31 = var10001;
               var10001 = (var31 | var32) & ~(var31 & var32);
               var32 = 450300671;
               var31 = var10001;
               var30 = (var31 | var32) - (var31 & var32);
            }

            var157 = 0.0;
         } else {
            var157 = 1.0;
         }

         var32 = -1308976535;
         var31 = -1644139299;
         var10003 = var31 & ~var32 | ~var31 & var32;
         var32 = 804976315;
         var31 = var10003;
         var10003 = (var31 | var32) - (var31 & var32);
         var10003 = (int)-819317918614691213L;
         var32 = -450620099;
         var31 = var10003;
         var10003 = (var31 | var32) & (~var31 | ~var32);
         var32 = 1140848461;
         var31 = var10003;
         var10003 = (var31 | var32) - (var31 & var32);
         var130.a(var157, 0.15, pulse.Easing.h);
         this.q = var20;
      }

      Color var21 = this.c();
      var32 = 823802169;
      var31 = 656604393;
      var10000 = var31 & ~var32 | ~var31 & var32;
      var32 = -1169496746;
      var31 = var10000;
      var10000 = var31 & ~var32 | ~var31 & var32;
      float var22 = 6.0F * var9;
      Color var23 = pulse.Theme.a(i, var14);
      var2.a(var16, var19, var15, var15, var22, var23, var1);
      String var133 = "cvi";
      float var24 = 11.0F * var9;
      var32 = -359105200;
      var31 = 503170541;
      var10001 = (var31 | var32) - (var31 & var32);
      var32 = -144328513;
      var31 = var10001;
      var10001 = (var31 | var32) & (~var31 | ~var32);
      var32 = -1538670529;
      var31 = 1016353369;
      var10001 = var31 & ~var32 | ~var31 & var32;
      var32 = -1730309532;
      var31 = var10001;
      var10001 = (var31 | var32) - (var31 & var32);
      float var25 = 4.0F * var9;
      float var26 = var16 + (var15 - var24) / 2.0F;
      float var27 = var19 + (var15 - var24) / 2.0F;
      Color var28 = pulse.Theme.a(var21, var14);
      var2.a(var26, var27, var24, var24, var25, var28, var1);
      if (var20) {
         GuiInput.g();
      }
   }

   @Override
   public void a(MatrixStack var1, Renderer2D var2, float var3, float var4, float var5, float var6, int var7, int var8, float var9, float var10) {
   }

   @Override
   public boolean j() {
      int var10000 = (int)-2414869804759163084L;
      int var2 = -1075897748;
      int var1 = var10000;
      var10000 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1151580840;
      var1 = var10000;
      return pulse.Bool.from((var1 | var2) & (var1 & var2 ^ -1));
   }

   @Override
   public boolean a(float var1, float var2, float var3, int var4, int var5) {
      int var10000 = (int)3418700183275567122L;
      int var9 = 2091231525;
      int var8 = var10000;
      var10000 = var8 & ~var9 | ~var8 & var9;
      var9 = -133477178;
      var8 = var10000;
      var10000 = var8 + var9 - 2 * (var8 & var9);
      var9 = 1078396999;
      var8 = -129902447;
      int var10001 = (var8 | var9) & (~var8 | ~var9);
      var9 = -1064589215;
      var8 = var10001;
      var9 = (var8 | var9) & ~(var8 & var9);
      var8 = var10000;
      var10000 = (var8 ^ var9) + 2 * (var8 & var9);
      float var6 = 14.0F * this.t;
      boolean var7 = GuiInput.a(this.r, this.s, var6, var6, var4, var5);
      if (!var7) {
         var10000 = (int)-1649796681552038248L;
         var9 = 1333506690;
         var8 = var10000;
         var10000 = (var8 | var9) & (~var8 | ~var9);
         var9 = -217889766;
         var8 = var10000;
         return pulse.Bool.from((var8 | var9) - (var8 & var9));
      }

      if (!this.u) {
         this.o();
      } else {
         this.k();
      }

      var9 = -1616187189;
      var8 = 2056304710;
      var10000 = var8 & ~var9 | ~var8 & var9;
      var9 = -449165172;
      var8 = var10000;
      return pulse.Bool.from((var8 | var9) - (var8 & var9));
   }

   private void o() {
      int var5 = 1354221825;
      int var4 = -13892731;
      int var10000 = (var4 | var5) - (var4 & var5);
      var5 = 1927604868;
      var4 = var10000;
      var10000 = (var4 | var5) & ~(var4 & var5);
      float var1 = 14.0F * this.t;
      int var2 = (int)(this.r + var1 / 2.0F);
      float var23 = this.s + var1;
      var5 = 232326883;
      var4 = -417943926;
      int var10001 = (var4 | var5) - (var4 & var5);
      var5 = 261680873;
      var4 = var10001;
      var10001 = var4 + var5 - 2 * (var4 & var5);
      int var10002 = (int)4304199396623314621L;
      var5 = 707722244;
      var4 = var10002;
      var10002 = (var4 | var5) & (~var4 | ~var5);
      var5 = -1368927175;
      var4 = var10002;
      var5 = (var4 | var5) - (var4 & var5);
      var4 = var10001;
      var10001 = 2 * (var4 | var5) - (var4 ^ var5);
      int var3 = (int)(var23 + 5.0F * this.t);
      var10001 = (int)-3325737699348701800L;
      var5 = 1790741748;
      var4 = var10001;
      var10001 = (var4 | var5) & ~(var4 & var5);
      var5 = -1131507347;
      var4 = var10001;
      this.u = pulse.Bool.from(var4 & ~var5 | ~var4 & var5);
      pulse.ColorPickerPopup.a().a(var2, var3, pulse.ColorPickerPopup.Edge.BOTTOM, this.j, this.c(), this.t, this::b);
   }

   public void k() {
      int var2 = -617785822;
      int var1 = -2034032357;
      int var10001 = (var1 | var2) & ~(var1 & var2);
      var2 = 1575909177;
      var1 = var10001;
      this.u = pulse.Bool.from(var1 & ~var2 | ~var1 & var2);
      pulse.ColorPickerPopup.a().b();
   }

   private void b(Color var1) {
      this.a(var1);
   }

   @Override
   public void a(int var1, int var2) {
   }

   @Override
   public void a(int var1, int var2, double var3, double var5) {
   }

   @Override
   public boolean l() {
      int var16;
      if (this.u && pulse.ColorPickerPopup.a().c()) {
         var16 = (int)4482824559525526890L;
         int var11 = 370686848;
         int var6 = var16;
         var16 = (var6 | var11) - (var6 & var11);
         var11 = -2098051349;
         var6 = var16;
         var16 = (var6 | var11) & ~(var6 & var11);
         if (b != b) {
            String var10001 = "cvj";
            int var19 = (int)6965394567861151480L;
            var11 = 1460744395;
            var6 = var19;
            int var20 = (var6 | var11) & (~var6 | ~var11);
            var11 = -1372360208;
            var6 = var20;
            int var2 = (var6 | var11) & (~var6 | ~var11);
            b = var2;
         }
      } else {
         var16 = (int)169878110845111509L;
         int var4 = 1069316224;
         int var3 = var16;
         var16 = (var3 | var4) & (~var3 | ~var4);
         var4 = -608832427;
         var3 = var16;
         var16 = var3 & ~var4 | ~var3 & var4;
      }

      return pulse.Bool.from(var16);
   }

   public void m() {
      if (!this.u) {
         String var10000 = "cvk";
         int var4 = -3945166;
         int var3 = 914433308;
         int var23 = (var3 | var4) & ~(var3 & var4);
         var4 = -67370848;
         var3 = var23;
         int var2 = (var3 | var4) & (~var3 | ~var4);
         int var10001 = (int)4700732887942265886L;
         var4 = 2057233723;
         var3 = var10001;
         var10001 = var3 + var4 - 2 * (var3 & var4);
         var4 = -1957324491;
         var3 = var10001;
         var10001 = (var3 | var4) & (~var3 | ~var4);
         int var24 = (int)239463637902029876L;
         var4 = -1949273776;
         var3 = var24;
         int var25 = var3 + var4 - 2 * (var3 & var4);
         var4 = 1961024333;
         var3 = var25;
         if ((var3 | var4) - (var3 & var4) >= var2) {
            var4 = 1352401152;
            var3 = 748137852;
            int var26 = (var3 | var4) - (var3 & var4);
            var4 = 2081139836;
            var3 = var26;
            int var27 = (var3 | var4) & ~(var3 & var4);
            var10001 = (int)3537054623854480870L;
            var4 = 117059383;
            var3 = var10001;
            var10001 = (var3 | var4) & ~(var3 & var4);
            var4 = -1291459887;
            var3 = var10001;
            int var28 = var27 / (var3 + var4 - 2 * (var3 & var4));
         }
      } else {
         this.k();
      }
   }

   public boolean b(int var1, int var2) {
      if (this.u) {
         return pulse.ColorPickerPopup.a().c(var1, var2);
      }

      int var10000 = (int)-2113837826084841110L;
      int var4 = -654308841;
      int var3 = var10000;
      var10000 = (var3 | var4) & (~var3 | ~var4);
      var4 = -2039622787;
      var3 = var10000;
      return pulse.Bool.from((var3 | var4) & (var3 & var4 ^ -1));
   }

   public float[] n() {
      return this.u ? pulse.ColorPickerPopup.a().f() : null;
   }

   @Override
   public boolean d() {
      int var9;
      if (this.n != null && !this.n.m()) {
         var9 = (int)1556747971330669970L;
         int var7 = -1775371960;
         int var4 = var9;
         var9 = (var4 | var7) - (var4 & var7);
         var7 = -1110145830;
         var4 = var9;
         var9 = (var4 | var7) - (var4 & var7);
      } else {
         int var2 = -179794215;
         int var1 = 653723064;
         var9 = var1 + var2 - 2 * (var1 & var2);
         var2 = -742421664;
         var1 = var9;
         var9 = var1 & ~var2 | ~var1 & var2;
      }

      return pulse.Bool.from(var9);
   }

   public static String a(String var0, String var1, int var2, int var3, int var4, int var5) {
      char[] var6 = var1.toCharArray();
      char[] var7 = new char[var6.length];
      int var10000 = (int)-8666565086356108010L;
      int var20 = 797314566;
      int var19 = var10000;
      var10000 = var19 & ~var20 | ~var19 & var20;
      var20 = -2089352422;
      var19 = var10000;
      char[] var283 = new char[var19 + var20 - 2 * (var19 & var20)];
      int var10002 = (int)9034720462809826803L;
      var20 = -651542427;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = 1334953366;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      int var10003 = (int)-7763154704921783766L;
      var20 = 2073334086;
      var19 = var10003;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1059638110;
      var19 = var10003;
      var283[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      var20 = 1626895663;
      var19 = 378727150;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = 1986699200;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = 739106611;
      var19 = -496918249;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = -831758943;
      var19 = var10003;
      var283[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      var10002 = (int)1453837057579502980L;
      var20 = -1513424796;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = 1201255906;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = -1212930381;
      var19 = 291393418;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = -1494594881;
      var19 = var10003;
      var283[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      var10002 = (int)-454821764585479875L;
      var20 = -204336782;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1041641548;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var10003 = (int)8291277236139135251L;
      var20 = 212718498;
      var19 = var10003;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = 2012820203;
      var19 = var10003;
      var10003 = ((var19 | var20) & ~(var19 & var20)) * ((var19 | var20) & ~(var19 & var20));
      var20 = 312742232;
      var19 = -1464050697;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = -1172778308;
      var19 = var10003;
      var283[var10002] = (char)((var19 | var20) & ~(var19 & var20));
      var20 = 1988412157;
      var19 = 1772091360;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = 521876761;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var10003 = (int)-3479082143858118367L;
      var20 = 1060608101;
      var19 = var10003;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = -1041928279;
      var19 = var10003;
      var10003 = ((var19 | var20) - (var19 & var20)) * ((var19 | var20) - (var19 & var20));
      var20 = -331202160;
      var19 = -1783691122;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = 2045630523;
      var19 = var10003;
      var283[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      var20 = -1969686461;
      var19 = -2047630953;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = 258693585;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = -1161069629;
      var19 = -266435881;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1255521430;
      var19 = var10003;
      var283[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      var20 = 1342173996;
      var19 = 1129002778;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = 213173296;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = -1910082881;
      var19 = 79411164;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = -1969370000;
      var19 = var10003;
      var283[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      var10002 = (int)7922957068900057155L;
      var20 = -1352309004;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = 1360012976;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var10003 = (int)-8320183304334283335L;
      var20 = -573479027;
      var19 = var10003;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = 852868630;
      var19 = var10003;
      var283[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      var20 = -1829049786;
      var19 = -1248888616;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = 662016662;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var10003 = (int)-5283770196330315402L;
      var20 = 1132514724;
      var19 = var10003;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = 124732545;
      var19 = var10003;
      var283[var10002] = (char)((var19 | var20) & ~(var19 & var20));
      var10002 = (int)9030332907193350263L;
      var20 = 1280293473;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = 2089288223;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = 813040620;
      var19 = -1005729147;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = -193212851;
      var19 = var10003;
      var283[var10002] = (char)((var19 | var20) - (var19 & var20));
      char[] var8 = var283;
      var20 = -1425908188;
      var19 = -1971687422;
      var10000 = var19 & ~var20 | ~var19 & var20;
      var20 = 561524268;
      var19 = var10000;
      char[] var285 = new char[var19 & ~var20 | ~var19 & var20];
      var10002 = (int)9080265444961541704L;
      var20 = 1646158763;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = 2066857443;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var10003 = (int)-4464354344750015716L;
      var20 = 311609640;
      var19 = var10003;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = 2066127380;
      var19 = var10003;
      var285[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      var20 = 2106348379;
      var19 = 611460100;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = 1509848926;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = 434464889;
      var19 = -524326491;
      int var10004 = (var19 | var20) - (var19 & var20);
      var20 = -111541794;
      var19 = var10004;
      var10004 = var19 + var20 - 2 * (var19 & var20);
      var10004 = (int)5746285895373102235L;
      var20 = -2034318431;
      var19 = var10004;
      var10004 = var19 & ~var20 | ~var19 & var20;
      var20 = 624156478;
      var19 = var10004;
      var10004 = (var19 | var20) - (var19 & var20);
      var20 = 821432156;
      var19 = -1069011110;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = -255941627;
      var19 = var10003;
      var285[var10002] = (char)((var19 | var20) - (var19 & var20));
      var20 = -375345101;
      var19 = 2019570882;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = -1849654029;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var10004 = (int)-7584819258226468395L;
      var20 = -1912554236;
      var19 = var10004;
      var10004 = var19 & ~var20 | ~var19 & var20;
      var20 = -1780603712;
      var19 = var10004;
      var10004 = var19 & ~var20 | ~var19 & var20;
      var20 = 1591202361;
      var19 = 610147309;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = 2055818887;
      var19 = var10003;
      var285[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      var10002 = (int)2238128921584233228L;
      var20 = -580787240;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = -1175484201;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var10003 = (int)-122196909496797623L;
      var20 = 967964804;
      var19 = var10003;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = -780454193;
      var19 = var10003;
      var285[var10002] = (char)((var19 | var20) - (var19 & var20));
      var10002 = (int)-4196380884164133668L;
      var20 = -1675760653;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = 624285483;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var10003 = (int)-3127166711162487147L;
      var20 = -845768946;
      var19 = var10003;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = 506270171;
      var19 = var10003;
      var285[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      var20 = -240869712;
      var19 = 1007724757;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = -843827616;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = -579564728;
      var19 = -1968731187;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1473460241;
      var19 = var10003;
      var285[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      var20 = 1020544808;
      var19 = -2058117278;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = -1182279604;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = -1709108062;
      var19 = -516128627;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = 1069009019;
      var19 = var10003;
      var10003 = (var19 + var20 - 2 * (var19 & var20)) * (var19 + var20 - 2 * (var19 & var20));
      var20 = 942111734;
      var19 = -224633258;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = -893672807;
      var19 = var10003;
      var285[var10002] = (char)((var19 | var20) - (var19 & var20));
      var20 = -1254319855;
      var19 = -2042330455;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = 863509439;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var10003 = (int)-8102793273290191600L;
      var20 = 1952682758;
      var19 = var10003;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = -1115779538;
      var19 = var10003;
      var285[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      var10002 = (int)2798035513481683530L;
      var20 = 2041447468;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = -340859282;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = 90544912;
      var19 = -1429850522;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = -1226537298;
      var19 = var10003;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var10003 = (int)2837213285993324966L;
      var20 = -1693488203;
      var19 = var10003;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = 346638615;
      var19 = var10003;
      var285[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      var10002 = (int)3600539946100205551L;
      var20 = 242051217;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = 679825271;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var10003 = (int)2885502195789200190L;
      var20 = -1880533231;
      var19 = var10003;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = 225877788;
      var19 = var10003;
      var285[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      char[] var9 = var285;
      var20 = -572825286;
      var19 = -363708576;
      var10000 = var19 + var20 - 2 * (var19 & var20);
      var20 = 931749466;
      var19 = var10000;

      for (int var10 = var19 & ~var20 | ~var19 & var20; var10 < var6.length; var10++) {
         char var359 = var6[var10];
         char var252 = var8[var10 % var8.length];
         char var123 = var359;
         var7[var10] = (char)(var123 & ~var252 | ~var123 & var252);
      }

      char[] var21 = new char[var7.length];
      var20 = -1002000874;
      var19 = 193249909;
      var10000 = (var19 | var20) - (var19 & var20);
      var20 = -809341853;
      var19 = var10000;
      int var11 = (var19 | var20) & (~var19 | ~var20);
      var10000 = (int)2934679583244731610L;
      var20 = 718702933;
      var19 = var10000;
      var10000 = var19 & ~var20 | ~var19 & var20;
      var20 = 987480999;
      var19 = var10000;
      var10000 = ((var19 | var20) - (var19 & var20)) * ((var19 | var20) - (var19 & var20));
      var10000 = (int)-209207733043398754L;
      var20 = -852749817;
      var19 = var10000;
      var10000 = (var19 | var20) - (var19 & var20);
      var20 = 37277577;
      var19 = var10000;
      int var18 = (var19 | var20) & (~var19 | ~var20);
      b = var18;
      var10000 = (int)-1182410347126475111L;
      var20 = 1420285534;
      var19 = var10000;
      var10000 = (var19 | var20) & ~(var19 & var20);
      var20 = -1266814121;
      var19 = var10000;
      var10000 = ((var19 | var20) - (var19 & var20)) * ((var19 | var20) - (var19 & var20));
      var10000 = (int)-919413333747747953L;
      var20 = 310649619;
      var19 = var10000;
      var10000 = var19 + var20 - 2 * (var19 & var20);
      var20 = -385070833;
      var19 = var10000;
      if (((var19 | var20) & ~(var19 & var20)) < b) {
         int var10001 = (int)7824212285307463793L;
         var20 = -1766309955;
         var19 = var10001;
         var10001 = (var19 | var20) & (~var19 | ~var20);
         var20 = -297297977;
         var19 = var10001;
         var10001 = var19 + var20 - 2 * (var19 & var20);
         var20 = -392944744;
         var19 = -729072594;
         var10001 = (var19 | var20) & ~(var19 & var20);
         var20 = 1008672693;
         var19 = var10001;
         var10001 = (var19 | var20) & ~(var19 & var20);
         var20 = -197604058;
         var19 = -1348306345;
         var10001 = var19 + var20 - 2 * (var19 & var20);
         var20 = 1536866166;
         var19 = var10001;
         var10001 = (var19 | var20) & (~var19 | ~var20);
         var10000 = (int)4330967449118103836L;
         var20 = 326086335;
         var19 = var10000;
         var10000 = var19 & ~var20 | ~var19 & var20;
         var20 = -1387580201;
         var19 = var10000;
         var18 = (var19 | var20) - (var19 & var20);
      }

      while (var11 < var6.length) {
         char var360 = var7[var11];
         char var271 = var9[var11 % var9.length];
         char var142 = var360;
         var21[var11] = (char)(var142 + var271 - 2 * (var142 & var271));
         var11++;
      }

      String var22 = new String(var21);
      int var12 = var22.hashCode();
      var20 = var5;
      var19 = var3;
      var10000 = var19 + ~var20 + 1;
      var20 = var2;
      var19 = var10000;
      int var13 = (var19 ^ var20) - 2 * (~var19 & var20);
      char[] var14 = var0.toCharArray();
      char[] var15 = new char[var14.length];
      var10000 = (int)365542869915176408L;
      var20 = -362657495;
      var19 = var10000;
      var10000 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1159382257;
      var19 = var10000;

      for (int var16 = (var19 | var20) & ~(var19 & var20); var16 < var15.length; var16++) {
         var20 = -1058867633;
         var19 = 765540533;
         int var309 = (var19 | var20) - (var19 & var20);
         var20 = -314323208;
         var19 = var309;
         switch (var16 % (var19 + var20 - 2 * (var19 & var20))) {
            case 0:
               var20 = var12;
               var19 = var13;
               var10002 = (var19 | var20) & ~(var19 & var20);
               char var281 = var14[var16];
               var19 = var10002;
               var15[var16] = (char)(var19 + var281 - 2 * (var19 & var281));
               break;
            case 1:
               var20 = var13;
               var19 = var5;
               var10002 = (var19 | var20) - (var19 & var20);
               char var279 = var14[var16];
               var19 = var10002;
               var15[var16] = (char)(var19 + var279 - 2 * (var19 & var279));
         }
      }

      return new String(var15);
   }
}
