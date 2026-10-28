package pulse;


import pulse.settings.BooleanSetting;
import java.awt.Color;
import net.minecraft.client.util.math.MatrixStack;

public class BooleanSettingWidget implements SettingWidget {
   public static final float a = 20.0F;
   private static final float d = 8.0F;
   private static final float e = 18.0F;
   private static final float f = 10.0F;
   private static final float g = 5.0F;
   private static final Color h = pulse.Theme.C;
   private static final Color i = pulse.Theme.D;
   private final String j;
   private boolean k;
   private final BooleanSetting l;
   private final AnimationState m = new AnimationState();
   private final AnimationState n = new AnimationState();
   private final MarqueeText o = new MarqueeText();
   private boolean p;
   private boolean q;
   public static int b;
   public static boolean c;

   public BooleanSettingWidget(String var1, boolean var2) {
      this(null, var1, var2);
   }

   public BooleanSettingWidget(BooleanSetting var1) {
      this(var1, var1.f(), var1.a());
   }

   private BooleanSettingWidget(BooleanSetting var1, String var2, boolean var3) {
      int var5 = 808557110;
      int var4 = 1985024588;
      int var10001 = var4 + var5 - 2 * (var4 & var5);
      var5 = 1180731514;
      var4 = var10001;
      this.p = pulse.Bool.from((var4 | var5) - (var4 & var5));
      var5 = 2001725401;
      var4 = 2105663492;
      var10001 = var4 & ~var5 | ~var4 & var5;
      var5 = 181274589;
      var4 = var10001;
      this.q = pulse.Bool.from((var4 | var5) - (var4 & var5));
      this.l = var1;
      this.j = var2;
      this.k = var3;
      this.q = var3;
      this.m.d(!var3 ? 0.0 : 1.0);
   }

   @Override
   public String a() {
      return this.j;
   }

   @Override
   public float b() {
      int var2 = -1825622711;
      int var1 = -467049470;
      int var10000 = var1 + var2 - 2 * (var1 & var2);
      var2 = -960540189;
      var1 = var10000;
      var10000 = ((var1 | var2) & (~var1 | ~var2)) * ((var1 | var2) & (~var1 | ~var2));
      return 20.0F;
   }

   public boolean c() {
      if (this.l != null && this.k != this.l.a()) {
         this.k = this.l.a();
      }

      return this.k;
   }

   public void a(boolean var1) {
      this.k = var1;
      if (this.l != null) {
         this.l.a(var1);
      }
   }

   @Override
   public void a(MatrixStack var1, Renderer2D var2, float var3, float var4, float var5, int var6, int var7, float var8, float var9) {
      if (this.l != null && this.k != this.l.a()) {
         this.k = this.l.a();
      }

      int var27 = 2023688377;
      int var26 = -892765221;
      int var10001 = var26 + var27 - 2 * (var26 & var27);
      var27 = -1302957204;
      var26 = var10001;
      FontRenderer var10 = FontManager.a[(var26 | var27) & (~var26 | ~var27)];
      var27 = 506100763;
      var26 = 1480658115;
      int var10000 = (var26 | var27) - (var26 & var27);
      var27 = 1683775662;
      var26 = var10000;
      var10000 = (var26 | var27) & ~(var26 & var27);
      float var11 = 20.0F * var9;
      var27 = -1617202734;
      var26 = -846663338;
      var10000 = var26 + var27 - 2 * (var26 & var27);
      var27 = 266637056;
      var26 = var10000;
      var10000 = (var26 & ~var27 | ~var26 & var27) * (var26 & ~var27 | ~var26 & var27);
      float var12 = 8.0F * var9;
      boolean var13 = GuiInput.a(var3, var4, var5, var11, var6, var7);
      this.o.a(var13);
      if (var13 != this.p) {
         AnimationState var121 = this.n;
         double var131 = !var13 ? 0.0 : 1.0;
         int var10003 = (int)5215786527298131103L;
         var27 = 1591099197;
         var26 = var10003;
         var10003 = (var26 | var27) & ~(var26 & var27);
         var27 = 285846436;
         var26 = var10003;
         var10003 = (var26 | var27) - (var26 & var27);
         var27 = -1603961282;
         var26 = 1761794828;
         var10003 = var26 & ~var27 | ~var26 & var27;
         var27 = -915954398;
         var26 = var10003;
         var10003 = (var26 | var27) & (~var26 | ~var27);
         var10003 = (int)3440182596224055384L;
         var27 = -159433485;
         var26 = var10003;
         var10003 = (var26 | var27) & (~var26 | ~var27);
         var27 = -602585940;
         var26 = var10003;
         var10003 = (var26 | var27) & (~var26 | ~var27);
         var10003 = (int)-3543472105659672282L;
         var27 = 161753030;
         var26 = var10003;
         var10003 = (var26 | var27) & ~(var26 & var27);
         var27 = -687702301;
         var26 = var10003;
         var10003 = var26 & ~var27 | ~var26 & var27;
         var27 = -460486781;
         var26 = -698384871;
         var10003 = (var26 | var27) & (~var26 | ~var27);
         var27 = 852687250;
         var26 = var10003;
         var10003 = (var26 | var27) & ~(var26 & var27);
         var121.a(var131, 0.15, pulse.Easing.h);
         this.p = var13;
      }

      if (this.k == this.q) {
         if (b != b) {
            String var122 = "dri";
            var10000 = (int)-2346884400613210718L;
            var27 = -707206133;
            var26 = var10000;
            var10000 = var26 & ~var27 | ~var26 & var27;
            var27 = 1559874940;
            var26 = var10000;
            int var25 = var26 + var27 - 2 * (var26 & var27);
            b = var25;
         }
      } else {
         double var132;
         if (!this.k) {
            var132 = 0.0;
         } else {
            var132 = 1.0;
            var27 = 1675295405;
            var26 = -1429771029;
            int var10002 = (var26 | var27) & ~(var26 & var27);
            var27 = -1034093959;
            var26 = var10002;
            var10002 = ((var26 | var27) - (var26 & var27)) * ((var26 | var27) - (var26 & var27));
            var10002 = (int)2363987401242093301L;
            var27 = -34311662;
            var26 = var10002;
            var10002 = var26 + var27 - 2 * (var26 & var27);
            var27 = -304465519;
            var26 = var10002;
            int var28 = (var26 | var27) - (var26 & var27);
            var27 = -1083573038;
            var26 = 1965310054;
            int var164 = (var26 | var27) & ~(var26 & var27);
            var27 = -900875079;
            var26 = var164;
            var164 = var26 + var27 - 2 * (var26 & var27);
            var27 = -1376648035;
            var26 = 1694006235;
            var164 = (var26 | var27) & (~var26 | ~var27);
            var27 = -922058923;
            var26 = var164;
            var164 = var26 & ~var27 | ~var26 & var27;
            var27 = 1004000972;
            var26 = -598139710;
            var164 = (var26 | var27) - (var26 & var27);
            var27 = -410072562;
            var26 = var164;
            var164 = (var26 | var27) - (var26 & var27);
            var10002 = (int)55725794818627975L;
            var27 = 1952621902;
            var26 = var10002;
            var10002 = var26 & ~var27 | ~var26 & var27;
            var27 = -27102835;
            var26 = var10002;
            if (((var26 | var27) & ~(var26 & var27)) >= var28) {
               var27 = 1347911486;
               var26 = 576815760;
               var10002 = var26 + var27 - 2 * (var26 & var27);
               var27 = 649369722;
               var26 = var10002;
               var10002 = (var26 | var27) & (~var26 | ~var27);
               var27 = 1606722223;
               var26 = -1251772875;
               var164 = var26 + var27 - 2 * (var26 & var27);
               var27 = 697506948;
               var26 = var164;
               var27 = (var26 | var27) - (var26 & var27);
               var26 = var10002;
               var10002 = (var26 & ~var27) + (var27 & ~var26) + 2 * (var26 & var27);
               var10002 = (int)-3241743985971057253L;
               var27 = 1964561437;
               var26 = var10002;
               var10002 = var26 + var27 - 2 * (var26 & var27);
               var27 = 470356046;
               var26 = var10002;
               var28 = (var26 | var27) & (~var26 | ~var27);
               b = var28;
            }
         }

         int var147 = (int)7595004623375205593L;
         var27 = 423972043;
         var26 = var147;
         var147 = (var26 | var27) - (var26 & var27);
         var27 = -1404105991;
         var26 = var147;
         var147 = var26 & ~var27 | ~var26 & var27;
         this.m.a(var132, 0.2, pulse.Easing.h);
         this.q = this.k;
      }

      this.n.a();
      this.m.a();
      float var14 = (float)this.n.j();
      float var15 = (float)this.m.j();
      var27 = 891670488;
      var26 = 1670415506;
      var10001 = var26 & ~var27 | ~var26 & var27;
      var27 = 1454721856;
      var26 = var10001;
      var10001 = var26 + var27 - 2 * (var26 & var27);
      int var16 = (int)(255.0F * var8);
      String var125 = "drj";
      float var17 = 18.0F * var9;
      float var18 = var3 + var5 - var12 - var17;
      float var126 = var18 - (var3 + var12);
      String var135 = "drk";
      float var19 = var126 - 4.0F * var9;
      float var127 = var4 + var11 / 2.0F;
      float var136 = var10.b(this.j) * var9;
      var27 = -992422774;
      var26 = 1137007913;
      int var150 = var26 + var27 - 2 * (var26 & var27);
      var27 = -1837963214;
      var26 = var150;
      var150 = ((var26 | var27) - (var26 & var27)) * ((var26 | var27) - (var26 & var27));
      float var20 = var127 - var136 / 4.0F;
      this.o.a(var1, var2, var10, this.j, var3 + var12, var20, var19, var9, pulse.Theme.a, var8);
      var10000 = (int)8006574943562486280L;
      var27 = -1196240005;
      var26 = var10000;
      var10000 = (var26 | var27) & (~var26 | ~var27);
      var27 = 985172499;
      var26 = var10000;
      var10000 = ((var26 | var27) & ~(var26 & var27)) * ((var26 | var27) & ~(var26 & var27));
      float var21 = 10.0F * var9;
      float var22 = var4 + var11 / 2.0F - var21 / 2.0F;
      this.a(var1, var2, var18, var22, var15, var8, var9);
      boolean var23 = GuiInput.a(var18, var22, var17, var21, var6, var7);
      if (var23) {
         GuiInput.g();
      }
   }

   private void a(MatrixStack var1, Renderer2D var2, float var3, float var4, float var5, float var6, float var7) {
      String var10000 = "drl";
      int var8 = (int)(255.0F * var6);
      int var27 = -1687310420;
      int var26 = 593775409;
      int var116 = var26 + var27 - 2 * (var26 & var27);
      var27 = 904093446;
      var26 = var116;
      int var117 = ((var26 | var27) - (var26 & var27)) * ((var26 | var27) - (var26 & var27));
      float var9 = 18.0F * var7;
      var27 = 1877482632;
      var26 = 750183770;
      int var118 = var26 + var27 - 2 * (var26 & var27);
      var27 = -1769379276;
      var26 = var118;
      int var119 = ((var26 | var27) - (var26 & var27)) * ((var26 | var27) - (var26 & var27));
      float var10 = 10.0F * var7;
      var27 = -1393686128;
      var26 = -2142399427;
      int var120 = var26 + var27 - 2 * (var26 & var27);
      var27 = 1096003209;
      var26 = var120;
      int var121 = (var26 | var27) - (var26 & var27);
      float var11 = 5.0F * var7;
      int var10001 = (int)-6289110365418619180L;
      var27 = -1407968677;
      var26 = var10001;
      var10001 = (var26 | var27) - (var26 & var27);
      var27 = 938140814;
      var26 = var10001;
      var10001 = var26 & ~var27 | ~var26 & var27;
      var27 = 107678883;
      var26 = 579200800;
      var10001 = var26 & ~var27 | ~var26 & var27;
      var27 = 619637649;
      var26 = var10001;
      var10001 = var26 & ~var27 | ~var26 & var27;
      var10001 = (int)-6031411661638891958L;
      var27 = -1872406303;
      var26 = var10001;
      var10001 = (var26 | var27) - (var26 & var27);
      var27 = 1035525807;
      var26 = var10001;
      var10001 = (var26 | var27) & (~var26 | ~var27);
      var10001 = (int)645021738831464985L;
      var27 = 254411539;
      var26 = var10001;
      var10001 = (var26 | var27) - (var26 & var27);
      var27 = -1872869117;
      var26 = var10001;
      var10001 = (var26 | var27) & ~(var26 & var27);
      float var12 = 9.0F * var7;
      float var13 = var9 - var12 - var7;
      var27 = -632615331;
      var26 = -416325655;
      int var10002 = (var26 | var27) & (~var26 | ~var27);
      var27 = 1029984695;
      var26 = var10002;
      var10002 = (var26 | var27) & (~var26 | ~var27);
      var27 = 1809020387;
      var26 = -75154119;
      var10002 = (var26 | var27) & (~var26 | ~var27);
      var27 = -1873393447;
      var26 = var10002;
      var10002 = (var26 | var27) & ~(var26 & var27);
      var27 = -1235680887;
      var26 = -309899677;
      var10002 = var26 + var27 - 2 * (var26 & var27);
      var27 = 1541296096;
      var26 = var10002;
      var10002 = var26 & ~var27 | ~var26 & var27;
      float var14 = var3 + 0.5F * var7 + var13 * var5;
      var27 = 1183447460;
      var26 = -1414102844;
      var10001 = (var26 | var27) & ~(var26 & var27);
      var27 = 1614883619;
      var26 = var10001;
      var10001 = ((var26 | var27) & (~var26 | ~var27)) * ((var26 | var27) & (~var26 | ~var27));
      float var15 = var4 + 0.5F * var7;
      var10001 = (int)-834954732243113052L;
      var27 = -1640847011;
      var26 = var10001;
      var10001 = var26 & ~var27 | ~var26 & var27;
      var27 = 1041343528;
      var26 = var10001;
      var10001 = (var26 | var27) - (var26 & var27);
      if (var5 > 0.01F) {
         float var137 = var3 + var7;
         int var10003 = (int)-699937568893856524L;
         var27 = -1582170824;
         var26 = var10003;
         var10003 = var26 + var27 - 2 * (var26 & var27);
         var27 = -1292415542;
         var26 = var10003;
         var10003 = var26 & ~var27 | ~var26 & var27;
         float var144 = var4 - 3.0F * var7;
         var27 = 1756368708;
         var26 = -2130440602;
         var10003 = var26 & ~var27 | ~var26 & var27;
         var27 = 1874603469;
         var26 = var10003;
         var10003 = var26 & ~var27 | ~var26 & var27;
         var27 = 369913726;
         var26 = 1503645800;
         int var10004 = (var26 | var27) - (var26 & var27);
         var27 = 1231762231;
         var26 = var10004;
         var27 = (var26 | var27) & (~var26 | ~var27);
         var26 = var10003;
         var10003 = (var26 ^ var27) + 2 * (var26 & var27);
         float var155 = 8.0F * var7;
         String var10005 = "drm";
         float var162 = 255.0F * var5;
         var27 = 845521356;
         var26 = -1034108929;
         int var10006 = (var26 | var27) & ~(var26 & var27);
         var27 = 1585503764;
         var26 = var10006;
         var10006 = ((var26 | var27) & (~var26 | ~var27)) * ((var26 | var27) & (~var26 | ~var27));
         var2.a(var137, var144, var155, pulse.Theme.a(pulse.Theme.E, (int)(var162 * 0.5F * var6)), var1);
      }

      Color var16 = ColorUtils.a(pulse.Theme.F, h, var5);
      Color var17 = ColorUtils.a(pulse.Theme.G, i, var5);
      Color var18 = pulse.Theme.a(var16, var8);
      Color var19 = pulse.Theme.a(var17, var8);
      var10002 = (int)6092652927613429097L;
      var27 = -1735933001;
      var26 = var10002;
      var10002 = (var26 | var27) - (var26 & var27);
      var27 = 1396109053;
      var26 = var10002;
      var10002 = (var26 | var27) - (var26 & var27);
      int var156 = (int)-7119272963251685198L;
      var27 = -620581576;
      var26 = var156;
      var156 = (var26 | var27) & (~var26 | ~var27);
      var27 = -750473761;
      var26 = var156;
      var27 = (var26 | var27) & ~(var26 & var27);
      var26 = var10002;
      var10002 = (var26 | var27) + (var26 & var27);
      float var138 = var3 - 0.5F * var7;
      var27 = 1695474714;
      var26 = -1379178287;
      var156 = var26 & ~var27 | ~var26 & var27;
      var27 = 892055341;
      var26 = var156;
      var156 = var26 & ~var27 | ~var26 & var27;
      var2.a(var138, var4 - 0.5F * var7, var9 + var7, var10 + var7, var11, var18, var18, var19, var19, var1);
      Color var20 = ColorUtils.a(pulse.Theme.f, pulse.Theme.y, var5);
      Color var21 = ColorUtils.a(pulse.Theme.H, pulse.Theme.z, var5);
      Color var22 = pulse.Theme.a(var20, var8);
      var10002 = var21.getRed();
      var156 = var21.getGreen();
      int var161 = var21.getBlue();
      var27 = 279602796;
      var26 = 659780627;
      int var163 = (var26 | var27) & (~var26 | ~var27);
      var27 = 939070080;
      var26 = var163;
      var163 = var26 & ~var27 | ~var26 & var27;
      float var166 = var21.getAlpha();
      int var10007 = (int)2887582250160742481L;
      var27 = 761723286;
      var26 = var10007;
      var10007 = var26 & ~var27 | ~var26 & var27;
      var27 = -974448328;
      var26 = var10007;
      var10007 = (var26 | var27) & ~(var26 & var27);
      var27 = var21.getAlpha();
      var26 = var10007;
      Color var23 = new Color(var10002, var156, var161, Math.min(var163, (int)(var166 + (var26 - var27) * var5 * var6)));
      var2.a(var3, var4, var9, var10, var11, var22, var22, var23, var23, var1);
      Color var24 = ColorUtils.a(pulse.Theme.b, pulse.Theme.a, var5);
      Color var25 = pulse.Theme.a(var24, var8);
      var2.a(var14, var15, var12, var12, var12, var25, var1);
   }

   @Override
   public boolean a(float var1, float var2, float var3, int var4, int var5) {
      int var10001 = (int)-8117170070885160893L;
      int var14 = -264252407;
      int var13 = var10001;
      var10001 = (var13 | var14) - (var13 & var14);
      var14 = 1330314316;
      var13 = var10001;
      var10001 = var13 + var14 - 2 * (var13 & var14);
      float var6 = 8.0F;
      String var10000 = "drn";
      float var7 = 18.0F;
      var14 = -1505791485;
      var13 = -1604649195;
      int var80 = (var13 | var14) - (var13 & var14);
      var14 = -1811648262;
      var13 = var80;
      int var81 = ((var13 | var14) & ~(var13 & var14)) * ((var13 | var14) & ~(var13 & var14));
      float var8 = 10.0F;
      float var9 = var1 + var3 - var6 - var7;
      var14 = 1771670514;
      var13 = 1816984601;
      var10001 = (var13 | var14) - (var13 & var14);
      var14 = 1259631761;
      var13 = var10001;
      var10001 = var13 & ~var14 | ~var13 & var14;
      float var10 = var2 + 10.0F - var8 / 2.0F;
      if (!GuiInput.a(var9, var10, var7, var8, var4, var5)) {
         var10001 = (int)-4165409363308279095L;
         var14 = 1762410546;
         var13 = var10001;
         var10001 = var13 + var14 - 2 * (var13 & var14);
         var14 = -1293890819;
         var13 = var10001;
         var10001 = (var13 | var14) & (~var13 | ~var14);
         var10001 = (int)-3149681641349040128L;
         var14 = -1207535780;
         var13 = var10001;
         var10001 = var13 & ~var14 | ~var13 & var14;
         var14 = -1680584873;
         var13 = var10001;
         var10001 = var13 & ~var14 | ~var13 & var14;
         var14 = 2033223908;
         var13 = -1320926541;
         var10001 = var13 & ~var14 | ~var13 & var14;
         var14 = -931870137;
         var13 = var10001;
         var10001 = (var13 | var14) & (~var13 | ~var14);
         var14 = -67881469;
         var13 = -974722836;
         int var83 = (var13 | var14) - (var13 & var14);
         var14 = 1928303233;
         var13 = var83;
         int var15 = (var13 | var14) & (~var13 | ~var14);
         var14 = -1456354171;
         var13 = 1174986873;
         int var84 = (var13 | var14) & (~var13 | ~var14);
         var14 = -1442671014;
         var13 = var84;
         int var85 = (var13 & ~var14 | ~var13 & var14) * (var13 & ~var14 | ~var13 & var14);
         var14 = 949394693;
         var13 = -2013103882;
         int var86 = var13 + var14 - 2 * (var13 & var14);
         var14 = -1957085648;
         var13 = var86;
         if (((var13 | var14) & (~var13 | ~var14)) >= var15) {
            throw new IllegalStateException();
         }

         var14 = 715204644;
         var13 = 310227425;
         int var87 = (var13 | var14) - (var13 & var14);
         var14 = 953981381;
         var13 = var87;
         return pulse.Bool.from(var13 + var14 - 2 * (var13 & var14));
      } else {
         if (this.k) {
            if (c) {
               var14 = 1151964299;
               var13 = 489574813;
               var10001 = var13 + var14 - 2 * (var13 & var14);
               var14 = -625035212;
               var13 = var10001;
               var10001 = (var13 | var14) & ~(var13 & var14);
               int var10002 = (int)7714178707241924132L;
               var14 = -1479314154;
               var13 = var10002;
               var10002 = (var13 | var14) & ~(var13 & var14);
               var14 = 872873194;
               var13 = var10002;
               var14 = var13 & ~var14 | ~var13 & var14;
               var13 = var10001;
               var10001 = (var13 & ~var14) + (var14 & ~var13) + 2 * (var13 & var14);
               var10001 = (int)686846018226903317L;
               var14 = 814352242;
               var13 = var10001;
               var10001 = (var13 | var14) & (~var13 | ~var14);
               var14 = -1903816684;
               var13 = var10001;
               int var12 = (var13 | var14) & (~var13 | ~var14);
               b = var12;
            }

            var14 = -1823568931;
            var13 = 1306942353;
            var10001 = (var13 | var14) - (var13 & var14);
            var14 = -559361972;
            var13 = var10001;
            var10001 = (var13 | var14) - (var13 & var14);
         } else {
            var10001 = (int)-8375036649313915680L;
            var14 = 1625829472;
            var13 = var10001;
            var10001 = var13 & ~var14 | ~var13 & var14;
            var14 = 808197249;
            var13 = var10001;
            var10001 = (var13 | var14) & ~(var13 & var14);
         }

         this.k = pulse.Bool.from(var10001);
         if (this.l != null) {
            this.l.a(this.k);
         }

         var14 = 457295488;
         var13 = -957027435;
         int var82 = (var13 | var14) & (~var13 | ~var14);
         var14 = -575329004;
         var13 = var82;
         return pulse.Bool.from(var13 & (var14 ^ -1) | (var13 ^ -1) & var14);
      }
   }

   @Override
   public boolean d() {
      int var37;
      if (this.l != null && !this.l.m()) {
         String var38 = "dro";
         var37 = (int)-2299995238118283666L;
         int var22 = 1884641267;
         int var6 = var37;
         var37 = var6 + var22 - 2 * (var6 & var22);
         var22 = 926940224;
         var6 = var37;
         int var2 = var6 + var22 - 2 * (var6 & var22);
         b = var2;
         var22 = 894557387;
         var6 = -1840704869;
         var37 = (var6 | var22) & ~(var6 & var22);
         var22 = 654093372;
         var6 = var37;
         var37 = (var6 | var22) & (~var6 | ~var22);
         var22 = -784761441;
         var6 = -751441486;
         int var10001 = (var6 | var22) & ~(var6 & var22);
         var22 = -1141319809;
         var6 = var10001;
         var22 = (var6 | var22) & ~(var6 & var22);
         var6 = var37;
         var37 = (var6 | var22) + (var6 & var22);
         var37 = (int)5024974397856966796L;
         var22 = 1822586030;
         var6 = var37;
         var37 = (var6 | var22) & ~(var6 & var22);
         var22 = 892628265;
         var6 = var37;
         if ((var6 & ~var22 | ~var6 & var22) < b) {
            var37 = (int)4741049520428447697L;
            var22 = -1225377834;
            var6 = var37;
            var37 = var6 & ~var22 | ~var6 & var22;
            var22 = -648396793;
            var6 = var37;
            var37 = var6 & ~var22 | ~var6 & var22;
            var10001 = (int)-8470707558112429718L;
            var22 = -612348506;
            var6 = var10001;
            var10001 = var6 & ~var22 | ~var6 & var22;
            var22 = -771902260;
            var6 = var10001;
            var37 /= (var6 | var22) - (var6 & var22);
         }

         var22 = 1711648997;
         var6 = 753608708;
         var37 = (var6 | var22) & (~var6 | ~var22);
         var22 = 1257150689;
         var6 = var37;
         var37 = (var6 | var22) & ~(var6 & var22);
      } else {
         int var4 = 1954992231;
         int var3 = -16096728;
         var37 = var3 + var4 - 2 * (var3 & var4);
         var4 = -1953713586;
         var3 = var37;
         var37 = (var3 | var4) & ~(var3 & var4);
      }

      return pulse.Bool.from(var37);
   }

   public static String a(String var0, String var1, int var2, int var3, int var4, int var5) {
      char[] var6 = var1.toCharArray();
      char[] var7 = new char[var6.length];
      int var10000 = (int)4638213082518101142L;
      int var18 = -1667534855;
      int var17 = var10000;
      var10000 = (var17 | var18) - (var17 & var18);
      var18 = -191564955;
      var17 = var10000;
      char[] var248 = new char[(var17 | var18) & (~var17 | ~var18)];
      var18 = -1594932281;
      var17 = 13148393;
      int var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -1607998674;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      int var10003 = (int)8704491789624429073L;
      var18 = -329225666;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -490837987;
      var17 = var10003;
      var248[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var10002 = (int)363187486848285145L;
      var18 = 1382806329;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 102664929;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1967364523;
      var17 = 145852459;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 2113024517;
      var17 = var10003;
      var248[var10002] = (char)((var17 | var18) - (var17 & var18));
      var18 = 660476782;
      var17 = -1642562531;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1186566287;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)-6381973875559715185L;
      var18 = -1334159689;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 1963645886;
      var17 = var10003;
      var248[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var10002 = (int)-725053190171064590L;
      var18 = 736812452;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 662559573;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      String var312 = "drp";
      var10003 = (int)-1355928456473592548L;
      var18 = 228037865;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -1231343130;
      var17 = var10003;
      var248[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var10002 = (int)3584720968261529710L;
      var18 = 1042256551;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1644225229;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      int var10004 = (int)5136007064463494302L;
      var18 = -596253929;
      var17 = var10004;
      var10004 = var17 & ~var18 | ~var17 & var18;
      var18 = 2102112140;
      var17 = var10004;
      var10004 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)-8109381822370863251L;
      var18 = 1630663532;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -928889564;
      var17 = var10003;
      var248[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var18 = -1789070780;
      var17 = -1952847166;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 516233347;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)-2030238369694354793L;
      var18 = -2099006143;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 505152084;
      var17 = var10003;
      var248[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var18 = -1522924157;
      var17 = -229780113;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 1467470058;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 1440908865;
      var17 = -331961019;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -1177279977;
      var17 = var10003;
      var248[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var18 = 646978268;
      var17 = -2084115166;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -1521027079;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)-916048717719341284L;
      var18 = 267580096;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1620062718;
      var17 = var10003;
      var248[var10002] = (char)((var17 | var18) - (var17 & var18));
      var10002 = (int)3413705441369431782L;
      var18 = 1917999108;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 1526122218;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1434775039;
      var17 = 1306159651;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -408850319;
      var17 = var10003;
      var248[var10002] = (char)((var17 | var18) - (var17 & var18));
      var10002 = (int)1907017741080352300L;
      var18 = 1590506783;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 1136354106;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 515803748;
      var17 = 811512071;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 786447431;
      var17 = var10003;
      var248[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      char[] var8 = var248;
      var18 = -785499553;
      var17 = -637333449;
      var10000 = var17 & ~var18 | ~var17 & var18;
      var18 = 187509346;
      var17 = var10000;
      char[] var250 = new char[var17 & ~var18 | ~var17 & var18];
      var10002 = (int)-7093376265302882555L;
      var18 = 609977972;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 1546961265;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var10003 = (int)2180796057790603981L;
      var18 = 1110036456;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1844976379;
      var17 = var10003;
      var250[var10002] = (char)((var17 | var18) - (var17 & var18));
      var18 = -636201666;
      var17 = -595021993;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 110951016;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -1207571391;
      var17 = -1108288647;
      var10004 = (var17 | var18) & ~(var17 & var18);
      var18 = 99956540;
      var17 = var10004;
      var10004 = var17 + var18 - 2 * (var17 & var18);
      var18 = -17059283;
      var17 = 1028448290;
      var10004 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1011396092;
      var17 = var10004;
      var10004 = var17 + var18 - 2 * (var17 & var18);
      var10004 = (int)4701984074047158150L;
      var18 = -1708802975;
      var17 = var10004;
      var10004 = (var17 | var18) & (~var17 | ~var18);
      var18 = -214283284;
      var17 = var10004;
      var10004 = (var17 | var18) & ~(var17 & var18);
      var10003 = (int)-3057465942454650446L;
      var18 = 919823209;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1645125928;
      var17 = var10003;
      var250[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var10002 = (int)-5602535252616187063L;
      var18 = -1157906361;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1328631028;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var10004 = (int)8741767316772721943L;
      var18 = 964086648;
      var17 = var10004;
      var10004 = var17 & ~var18 | ~var17 & var18;
      var18 = 808279661;
      var17 = var10004;
      var10004 = (var17 | var18) & (~var17 | ~var18);
      var18 = 637148689;
      var17 = -1412767732;
      var10004 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1909391859;
      var17 = var10004;
      var10004 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)4445392923149973167L;
      var18 = -1061676600;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 1473980468;
      var17 = var10003;
      var250[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var10002 = (int)4504007202034242446L;
      var18 = 308288436;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -848476103;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 92806766;
      var17 = 971664202;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1013075238;
      var17 = var10003;
      var250[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var18 = -698255530;
      var17 = -187755520;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 581854034;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 944919153;
      var17 = 618183218;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 478859267;
      var17 = var10003;
      var250[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var18 = -694023048;
      var17 = 1104439458;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -1753848609;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)8635690040889171655L;
      var18 = -1566843294;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1057503281;
      var17 = var10003;
      var250[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var18 = 1749238417;
      var17 = -28030538;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -1776874719;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var10004 = (int)2940258601197170463L;
      var18 = 1405418618;
      var17 = var10004;
      var10004 = (var17 | var18) & (~var17 | ~var18);
      var18 = -203418762;
      var17 = var10004;
      var10004 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)-4828107214030212126L;
      var18 = -852221303;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 1997461074;
      var17 = var10003;
      var250[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var18 = -2039567543;
      var17 = 577621702;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -1543281272;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var10003 = (int)8139112481510214816L;
      var18 = -1215934789;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1624969763;
      var17 = var10003;
      var250[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var18 = 1604693195;
      var17 = 1446886265;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 160962490;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      String var338 = "drq";
      var18 = -654252692;
      var17 = 2110900607;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1529762025;
      var17 = var10003;
      var250[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var10002 = (int)-7988717880517815490L;
      var18 = 1041248421;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -688086126;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var10003 = (int)2462610348368609201L;
      var18 = 1953160275;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 249352401;
      var17 = var10003;
      var250[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      char[] var9 = var250;
      var18 = -669446623;
      var17 = -590149450;
      var10000 = (var17 | var18) & ~(var17 & var18);
      var18 = 80348823;
      var17 = var10000;

      for (int var10 = (var17 | var18) - (var17 & var18); var10 < var6.length; var10++) {
         char var304 = var6[var10];
         char var233 = var8[var10 % var8.length];
         char var120 = var304;
         var7[var10] = (char)(var120 + var233 - 2 * (var120 & var233));
      }

      char[] var19 = new char[var7.length];
      var10000 = (int)-2373063772237754795L;
      var18 = 1611185736;
      var17 = var10000;
      var10000 = var17 & ~var18 | ~var17 & var18;
      var18 = 442707997;
      var17 = var10000;

      for (int var11 = var17 & ~var18 | ~var17 & var18; var11 < var6.length; var11++) {
         char var305 = var7[var11];
         char var236 = var9[var11 % var9.length];
         char var123 = var305;
         var19[var11] = (char)((var123 | var236) - (var123 & var236));
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
      var18 = -279566124;
      var17 = -834278058;
      var10000 = var17 & ~var18 | ~var17 & var18;
      var18 = 554943874;
      var17 = var10000;

      for (int var16 = (var17 | var18) & ~(var17 & var18); var16 < var15.length; var16++) {
         var18 = 1571099378;
         var17 = 990573887;
         int var10001 = (var17 | var18) & ~(var17 & var18);
         var18 = 1722804175;
         var17 = var10001;
         switch (var16 % ((var17 | var18) - (var17 & var18))) {
            case 0:
               var18 = var12;
               var17 = var13;
               var10002 = var17 + var18 - 2 * (var17 & var18);
               char var246 = var14[var16];
               var17 = var10002;
               var15[var16] = (char)((var17 | var246) & ~(var17 & var246));
               break;
            case 1:
               var18 = var13;
               var17 = var5;
               var10002 = (var17 | var18) & ~(var17 & var18);
               char var244 = var14[var16];
               var17 = var10002;
               var15[var16] = (char)((var17 | var244) & ~(var17 & var244));
         }
      }

      return new String(var15);
   }
}
