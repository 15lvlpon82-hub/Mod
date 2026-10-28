package pulse;


import pulse.settings.SliderSetting;
import java.awt.Color;
import java.util.Locale;
import net.minecraft.client.util.math.MatrixStack;

public class SliderSettingWidget implements SettingWidget {
   public static final float a = 28.0F;
   private static final float d = 8.0F;
   private static final float e = 6.0F;
   private static final float f = 20.0F;
   private static final float g = 3.0F;
   private static final float h = 7.0F;
   private static final float i = 8.0F;
   private static final Color j = pulse.Theme.P;
   private static final Color k = pulse.Theme.Q;
   private static final Color l = pulse.Theme.R;
   private final String m;
   private float n;
   private final float o;
   private final float p;
   private final float q;
   private final SliderSetting r;
   private final AnimationState s = new AnimationState();
   private final AnimationState t = new AnimationState();
   private final AnimationState u = new AnimationState();
   private final AnimationState v = new AnimationState();
   private final AnimationState w = new AnimationState();
   private final AnimationState x = new AnimationState();
   private final MarqueeText y = new MarqueeText();
   private boolean z;
   private boolean A;
   private float B;
   private float C;
   private float D;
   private boolean E;
   private float F;
   private final AnimationState G;
   private final AnimationState H;
   public static int b;
   public static boolean c;

   public SliderSettingWidget(String var1, float var2, float var3, float var4, float var5) {
      this(null, var1, var2, var3, var4, var5);
   }

   public SliderSettingWidget(SliderSetting var1) {
      this(var1, var1.f(), var1.a(), var1.c(), var1.d(), var1.e());
   }

   private SliderSettingWidget(SliderSetting var1, String var2, float var3, float var4, float var5, float var6) {
      int var8 = 648943517;
      int var7 = 964229976;
      int var10001 = (var7 | var8) & (~var7 | ~var8);
      var8 = 534179013;
      var7 = var10001;
      this.z = pulse.Bool.from((var7 | var8) & ~(var7 & var8));
      var8 = 1132954030;
      var7 = 341500219;
      var10001 = (var7 | var8) & (~var7 | ~var8);
      var8 = 1474125973;
      var7 = var10001;
      this.A = pulse.Bool.from((var7 | var8) & ~(var7 & var8));
      this.C = 0.0F;
      this.D = 0.0F;
      var8 = -1863391125;
      var7 = -27107502;
      var10001 = (var7 | var8) - (var7 & var8);
      var8 = 1854715705;
      var7 = var10001;
      this.E = pulse.Bool.from(var7 + var8 - 2 * (var7 & var8));
      this.G = new AnimationState();
      this.H = new AnimationState();
      this.r = var1;
      this.m = var2;
      this.n = var3;
      this.o = var4;
      this.p = var5;
      this.q = var6;
      this.B = var3;
      this.F = var3;
      this.w.d(this.i());
      this.G.d(this.i());
      this.H.d(var3);
      this.u.d(0.0);
      this.v.d(0.0);
      this.x.d(0.0);
   }

   public void a(boolean var1) {
      this.E = var1;
   }

   public boolean c() {
      return this.E;
   }

   @Override
   public String a() {
      return this.m;
   }

   @Override
   public float b() {
      int var2 = -1295478065;
      int var1 = 723021148;
      int var10000 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1086621464;
      var1 = var10000;
      var10000 = (var1 | var2) - (var1 & var2);
      var2 = -1706600590;
      var1 = -1810948818;
      int var10001 = (var1 | var2) & (~var1 | ~var2);
      var2 = -110250853;
      var1 = var10001;
      var2 = var1 & ~var2 | ~var1 & var2;
      var1 = var10000;
      var10000 = (var1 ^ var2) + 2 * (var1 & var2);
      return 28.0F;
   }

   public float e() {
      if (this.r != null && !this.A) {
         float var1 = this.r.a();
         float var10000 = Math.abs(this.n - var1);
         int var10001 = (int)6806905652665944791L;
         int var3 = -890279397;
         int var2 = var10001;
         var10001 = (var2 | var3) & ~(var2 & var3);
         var3 = -1995804429;
         var2 = var10001;
         var10001 = (var2 | var3) & (~var2 | ~var3);
         int var10002 = (int)3222362808042326427L;
         var3 = -1039271272;
         var2 = var10002;
         var10002 = (var2 | var3) & ~(var2 & var3);
         var3 = 910189646;
         var2 = var10002;
         var3 = (var2 | var3) - (var2 & var3);
         var2 = var10001;
         var10001 = (var2 ^ var3) + 2 * (var2 & var3);
         if (var10000 > 0.001F) {
            this.n = var1;
            this.F = this.n;
            if (this.E) {
               this.H.d(this.n);
            }

            this.w.d(this.i());
            this.G.d(this.i());
            this.B = this.n;
         }
      }

      return !this.E ? this.n : (float)this.H.j();
   }

   public void a(float var1) {
      this.n = Math.max(this.o, Math.min(this.p, var1));
      if (this.r != null) {
         this.r.a(this.n);
      }
   }

   public float f() {
      return this.o;
   }

   public float g() {
      return this.p;
   }

   public float h() {
      return this.q;
   }

   private float i() {
      if (this.p == this.o) {
         return 0.0F;
      }

      float var1 = this.E && this.A ? this.F : this.n;
      return (var1 - this.o) / (this.p - this.o);
   }

   private float m() {
      if (this.E) {
         if (this.A) {
            return this.F;
         }

         int var10000 = (int)881278742673838553L;
         int var4 = 1641518522;
         int var3 = var10000;
         var10000 = (var3 | var4) & (~var3 | ~var4);
         var4 = -1805101487;
         var3 = var10000;
         var10000 = (var3 + var4 - 2 * (var3 & var4)) * (var3 + var4 - 2 * (var3 & var4));
         var4 = 51793507;
         var3 = 1780565547;
         var10000 = (var3 | var4) & ~(var3 & var4);
         var4 = 1393018915;
         var3 = var10000;
         int var2 = var3 & ~var4 | ~var3 & var4;
         b = var2;
         var4 = 1189538770;
         var3 = 24938948;
         var10000 = (var3 | var4) - (var3 & var4);
         var4 = -1958243187;
         var3 = var10000;
         var10000 = ((var3 | var4) - (var3 & var4)) * ((var3 | var4) - (var3 & var4));
         var4 = -859939538;
         var3 = 1409561168;
         var10000 = var3 + var4 - 2 * (var3 & var4);
         var4 = -98415243;
         var3 = var10000;
         if ((var3 | var4) - (var3 & var4) <= b) {
            var4 = -1396980825;
            var3 = -1501983100;
            int var10001 = var3 + var4 - 2 * (var3 & var4);
            var4 = 180505897;
            var3 = var10001;
            var10001 = var3 & ~var4 | ~var3 & var4;
            var10000 = (int)-6074389362195290231L;
            var4 = 1251211526;
            var3 = var10000;
            var10000 = var3 + var4 - 2 * (var3 & var4);
            var4 = -1947760060;
            var3 = var10000;
            var2 = var3 + var4 - 2 * (var3 & var4);
         }
      }

      return this.n;
   }

   private String b(float var1) {
      if (!(this.q >= 1.0F)) {
         int var3 = 1710680624;
         int var2 = 1399523992;
         int var10001 = (var2 | var3) - (var2 & var3);
         var3 = -627301800;
         var2 = var10001;
         var10001 = (var2 & ~var3 | ~var2 & var3) * (var2 & ~var3 | ~var2 & var3);
         if (!(this.q >= 0.1F)) {
            Locale var96 = Locale.US;
            int var106 = (int)9180716267503611988L;
            var3 = 1538017755;
            var2 = var106;
            var106 = (var2 | var3) & ~(var2 & var3);
            var3 = -1616922209;
            var2 = var106;
            var106 = (var2 | var3) & ~(var2 & var3);
            var106 = (int)11373130545990869L;
            var3 = 2096175447;
            var2 = var106;
            var106 = (var2 | var3) & ~(var2 & var3);
            var3 = 853317002;
            var2 = var106;
            var106 = var2 & ~var3 | ~var2 & var3;
            var3 = -824252717;
            var2 = 917529267;
            var106 = (var2 | var3) & ~(var2 & var3);
            var3 = -126974866;
            var2 = var106;
            var106 = var2 + var3 - 2 * (var2 & var3);
            int var119 = (int)-5257819003006763117L;
            var3 = 1445272205;
            var2 = var119;
            var119 = (var2 | var3) - (var2 & var3);
            var3 = 106865948;
            var2 = var119;
            var119 = (var2 | var3) - (var2 & var3);
            var3 = 1407859169;
            var2 = -274994846;
            var119 = (var2 | var3) & (~var2 | ~var3);
            var3 = -1133391737;
            var2 = var119;
            var119 = (var2 | var3) & (~var2 | ~var3);
            var3 = -1102123693;
            var2 = -1042785109;
            var119 = (var2 | var3) - (var2 & var3);
            var3 = 1148952;
            var2 = var119;
            var119 = (var2 | var3) - (var2 & var3);
            var3 = -1688085053;
            var2 = 728719370;
            var119 = (var2 | var3) & ~(var2 & var3);
            var3 = 1637066366;
            var2 = var119;
            var119 = (var2 | var3) - (var2 & var3);
            var3 = 1332712610;
            var2 = -1500802025;
            int var135 = (var2 | var3) & (~var2 | ~var3);
            var3 = -1846924339;
            var2 = var135;
            var135 = var2 + var3 - 2 * (var2 & var3);
            var135 = (int)-1916324994827567899L;
            var3 = -206024657;
            var2 = var135;
            var135 = (var2 | var3) & (~var2 | ~var3);
            var3 = -628930812;
            var2 = var135;
            var135 = (var2 | var3) & (~var2 | ~var3);
            String var146 = "os";
            var3 = -676322249;
            var2 = -1757661039;
            int var147 = (var2 | var3) - (var2 & var3);
            var3 = 1513937288;
            var2 = var147;
            int var148 = var2 + var3 - 2 * (var2 & var3);
            String var150 = "ot";
            var3 = -700065559;
            var2 = 872352668;
            int var151 = var2 + var3 - 2 * (var2 & var3);
            var3 = -442083544;
            var2 = var151;
            String var102 = a(
               "ဨ迉ဿ辁",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謴㑸\u007f\ua7eb꒺ꁿꥊ絥蹏⑮謣㑾|\ua7e1꒦ꀾ꤫絣蹇⑸謲㑥A\ua7e3꒡ꁥꤌ絸蹍\u245f謻㑲\u007f\ua7e3꒻ꁥ",
               var119,
               var135,
               var148,
               (var2 | var3) - (var2 & var3)
            );
            var106 = (int)-6151132620530595410L;
            var3 = 2104871152;
            var2 = var106;
            var106 = (var2 | var3) - (var2 & var3);
            var3 = -1082064545;
            var2 = var106;
            Object[] var116 = new Object[var2 & ~var3 | ~var2 & var3];
            var135 = (int)-5468218405953584513L;
            var3 = -1664561568;
            var2 = var135;
            var135 = (var2 | var3) - (var2 & var3);
            var3 = 2049608735;
            var2 = var135;
            var116[(var2 | var3) - (var2 & var3)] = var1;
            return String.format(var96, var102, var116);
         } else {
            Locale var10000 = Locale.US;
            var10001 = (int)8834343551786189927L;
            var3 = -392189131;
            var2 = var10001;
            var10001 = (var2 | var3) & (~var2 | ~var3);
            var3 = 2132885482;
            var2 = var10001;
            var10001 = (var2 | var3) & (~var2 | ~var3);
            String var10002 = "oo";
            String var10003 = "op";
            var3 = 818104032;
            var2 = -1876544504;
            int var117 = var2 & ~var3 | ~var2 & var3;
            var3 = 1903716703;
            var2 = var117;
            int var118 = (var2 | var3) & (~var2 | ~var3);
            var3 = 2113882335;
            var2 = -208681840;
            int var10004 = var2 & ~var3 | ~var2 & var3;
            var3 = -1562911449;
            var2 = var10004;
            var10004 = var2 & ~var3 | ~var2 & var3;
            int var10005 = (int)2619294822998542285L;
            var3 = -37681853;
            var2 = var10005;
            var10005 = (var2 | var3) - (var2 & var3);
            var3 = 1377326929;
            var2 = var10005;
            var3 = (var2 | var3) & ~(var2 & var3);
            var2 = var10004;
            var10004 = (var2 ^ var3) + 2 * (var2 & var3);
            var10004 = (int)-6691394727004747147L;
            var3 = 1579220483;
            var2 = var10004;
            var10004 = var2 & ~var3 | ~var2 & var3;
            var3 = -1295092673;
            var2 = var10004;
            var10004 = var2 & ~var3 | ~var2 & var3;
            String var143 = "oq";
            var3 = -1165190549;
            var2 = -409927030;
            var10005 = var2 + var3 - 2 * (var2 & var3);
            var3 = 1596631462;
            var2 = var10005;
            var10005 = (var2 | var3) & ~(var2 & var3);
            String var10006 = "or";
            var3 = -359192556;
            var2 = -959983487;
            int var149 = (var2 | var3) - (var2 & var3);
            var3 = 742776909;
            var2 = var149;
            String var101 = a(
               "ဨፌြጄ",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謴㑸\u007f\ua7eb꒺ꁿꥊ絥蹏⑮謣㑾|\ua7e1꒦ꀾ꤫絣蹇⑸謲㑥A\ua7e3꒡ꁥꤌ絸蹍\u245f謻㑲\u007f\ua7e3꒻ꁥ",
               var118,
               var10004,
               var10005,
               (var2 | var3) & (~var2 | ~var3)
            );
            int var103 = (int)-737422521661421244L;
            var3 = 653918063;
            var2 = var103;
            int var104 = var2 + var3 - 2 * (var2 & var3);
            var3 = -2079951318;
            var2 = var104;
            Object[] var105 = new Object[var2 & ~var3 | ~var2 & var3];
            var10004 = (int)-2640552432151117875L;
            var3 = 1657695232;
            var2 = var10004;
            var10004 = (var2 | var3) - (var2 & var3);
            var3 = -65481779;
            var2 = var10004;
            var105[var2 + var3 - 2 * (var2 & var3)] = var1;
            return String.format(var10000, var101, var105);
         }
      } else {
         return String.valueOf((int)var1);
      }
   }

   @Override
   public void a(MatrixStack var1, Renderer2D var2, float var3, float var4, float var5, int var6, int var7, float var8, float var9) {
      if (this.r != null && !this.A) {
         float var10000 = Math.abs(this.n - this.r.a());
         int var10001 = (int)-4765459254865755986L;
         int var63 = -1891559771;
         int var62 = var10001;
         var10001 = var62 + var63 - 2 * (var62 & var63);
         var63 = 1409833128;
         var62 = var10001;
         var10001 = (var62 | var63) - (var62 & var63);
         if (var10000 > 0.001F) {
            this.n = this.r.a();
            this.F = this.n;
            this.w.d(this.i());
            this.G.d(this.i());
            this.H.d(this.n);
            this.B = this.n;
         }
      }

      int var248 = (int)4692124229096971326L;
      int var143 = -1554818560;
      int var72 = var248;
      var248 = var72 + var143 - 2 * (var72 & var143);
      var143 = -33077712;
      var72 = var248;
      FontRenderer var10 = FontManager.a[var72 & ~var143 | ~var72 & var143];
      var143 = -1756122653;
      var72 = -546757219;
      int var213 = (var72 | var143) - (var72 & var143);
      var143 = 1417218598;
      var72 = var213;
      var213 = (var72 + var143 - 2 * (var72 & var143)) * (var72 + var143 - 2 * (var72 & var143));
      float var11 = 28.0F * var9;
      String var215 = "ou";
      float var12 = 8.0F * var9;
      boolean var13 = GuiInput.a(var3, var4, var5, var11, var6, var7);
      this.y.a(var13);
      if (var13 != this.z) {
         double var250 = !var13 ? 0.0 : 1.0;
         int var10002 = (int)6826405364585338973L;
         var143 = 770840308;
         var72 = var10002;
         var10002 = var72 & ~var143 | ~var72 & var143;
         var143 = 1484476994;
         var72 = var10002;
         var10002 = (var72 | var143) & (~var72 | ~var143);
         this.s.a(var250, 0.15, pulse.Easing.h);
         this.z = var13;
      }

      if (this.n != this.B) {
         AnimationState var216 = this.w;
         double var251 = this.i();
         int var283 = (int)6697148687174139923L;
         var143 = 996174597;
         var72 = var283;
         var283 = var72 + var143 - 2 * (var72 & var143);
         var143 = -1369643784;
         var72 = var283;
         var283 = var72 & ~var143 | ~var72 & var143;
         var216.a(var251, 0.15, pulse.Easing.C);
         this.x.d(1.0);
         String var286 = "ov";
         this.x.a(0.0, 0.4, pulse.Easing.h);
         this.B = this.n;
      }

      this.s.a();
      this.t.a();
      this.u.a();
      this.v.a();
      this.w.a();
      this.x.a();
      this.H.a();
      this.G.a();
      float var14 = (float)this.s.j();
      float var15 = (float)this.t.j();
      float var16 = (float)this.u.j();
      float var17 = (float)this.v.j();
      float var18 = (float)this.x.j();
      float var19;
      if (this.E && this.A) {
         float var20 = this.i();
         double var252 = var20;
         int var287 = (int)7387282705791705543L;
         var143 = -1939795237;
         var72 = var287;
         var287 = (var72 | var143) - (var72 & var143);
         var143 = -1719436834;
         var72 = var287;
         var287 = (var72 & ~var143 | ~var72 & var143) * (var72 & ~var143 | ~var72 & var143);
         this.G.a(var252, 0.1, pulse.Easing.h);
         var19 = (float)this.G.j();
         var143 = -1263454194;
         var72 = -410703546;
         var213 = (var72 | var143) & (~var72 | ~var143);
         var143 = 930787709;
         var72 = var213;
         var213 = ((var72 | var143) & ~(var72 & var143)) * ((var72 | var143) & ~(var72 & var143));
         var143 = -678342602;
         var72 = -1325388805;
         var213 = var72 + var143 - 2 * (var72 & var143);
         var143 = 380929985;
         var72 = var213;
         int var61 = var72 + var143 - 2 * (var72 & var143);
         var143 = -668914267;
         var72 = 15365118;
         var213 = var72 + var143 - 2 * (var72 & var143);
         var143 = 1667539948;
         var72 = var213;
         var213 = var72 + var143 - 2 * (var72 & var143);
         var248 = (int)-5461858610205746267L;
         var143 = 927025889;
         var72 = var248;
         var248 = (var72 | var143) & (~var72 | ~var143);
         var143 = -772886991;
         var72 = var248;
         var143 = (var72 | var143) & ~(var72 & var143);
         var72 = var213;
         var213 = (var72 & ~var143) + (var143 & ~var72) + 2 * (var72 & var143);
         var213 = (int)3888229602435863928L;
         var143 = 965964329;
         var72 = var213;
         var213 = var72 & ~var143 | ~var72 & var143;
         var143 = 1773874504;
         var72 = var213;
         if (((var72 | var143) & ~(var72 & var143)) >= var61) {
            var213 = (int)-1848871812511705217L;
            var143 = 576804295;
            var72 = var213;
            var213 = (var72 | var143) - (var72 & var143);
            var143 = 862118761;
            var72 = var213;
            var213 = (var72 | var143) & (~var72 | ~var143);
            var143 = -1781891883;
            var72 = -1558649440;
            var213 = (var72 | var143) & (~var72 | ~var143);
            var143 = -657215072;
            var72 = var213;
            var61 = var72 & ~var143 | ~var72 & var143;
         }
      } else {
         var19 = (float)this.w.j();
         this.G.d(var19);
      }

      var143 = -1481536550;
      var72 = 2111235816;
      var213 = (var72 | var143) & ~(var72 & var143);
      var143 = 453946097;
      var72 = var213;
      var213 = var72 + var143 - 2 * (var72 & var143);
      var248 = (int)5053981721565453759L;
      var143 = -801251474;
      var72 = var248;
      var248 = var72 & ~var143 | ~var72 & var143;
      var143 = -671129250;
      var72 = var248;
      var143 = (var72 | var143) & ~(var72 & var143);
      var72 = var213;
      var213 = (var72 ^ var143) + 2 * (var72 & var143);
      int var64 = (int)(255.0F * var8);
      String var21 = this.b(this.m());
      float var22 = var10.a(var21) * var9;
      var213 = (int)2059618816290661849L;
      var143 = -738678236;
      var72 = var213;
      var213 = var72 + var143 - 2 * (var72 & var143);
      var143 = -229202719;
      var72 = var213;
      var213 = (var72 | var143) & (~var72 | ~var143);
      float var23 = 5.0F * var9;
      float var24 = var22 + var23 * 2.0F;
      float var25 = var3 + var5 - var12;
      float var26 = var25 - var24;
      float var235 = var26 - (var3 + var12);
      var143 = 864669675;
      var72 = -380604159;
      var248 = var72 + var143 - 2 * (var72 & var143);
      var143 = -192529176;
      var72 = var248;
      var248 = (var72 + var143 - 2 * (var72 & var143)) * (var72 + var143 - 2 * (var72 & var143));
      float var27 = var235 - 4.0F * var9;
      int var290 = (int)-2989298951820002579L;
      var143 = -32012451;
      var72 = var290;
      var290 = var72 + var143 - 2 * (var72 & var143);
      var143 = 122011058;
      var72 = var290;
      var290 = (var72 | var143) & (~var72 | ~var143);
      float var28 = var4 + 6.0F * var9;
      int var29 = (int)(var3 + var12);
      var213 = (int)var28;
      var248 = (int)3165614507028131448L;
      var143 = 1113155007;
      var72 = var248;
      var248 = (var72 | var143) - (var72 & var143);
      var143 = 2036681670;
      var72 = var248;
      var143 = var72 & ~var143 | ~var72 & var143;
      var72 = var213;
      int var30 = var72 - var143;
      this.y.a(var1, var2, var10, this.m, var29, var30, var27, var9, pulse.Theme.a, var8);
      float var31 = var10.b(var21) * var9;
      var143 = 765914577;
      var72 = -1212491424;
      var213 = var72 & ~var143 | ~var72 & var143;
      var143 = -1410618113;
      var72 = var213;
      var213 = (var72 | var143) & (~var72 | ~var143);
      float var32 = 14.0F * var9;
      float var33 = var10.b(this.m) * var9;
      float var239 = var28 + var33 / 2.0F - var32 / 2.0F;
      var248 = (int)7775630803551322621L;
      var143 = 297639262;
      var72 = var248;
      var248 = var72 & ~var143 | ~var72 & var143;
      var143 = -1114199055;
      var72 = var248;
      var248 = (var72 | var143) - (var72 & var143);
      float var34 = var239 - 5.0F * var9;
      var213 = (int)7328540895627650572L;
      var143 = 471862712;
      var72 = var213;
      var213 = (var72 | var143) & (~var72 | ~var143);
      var143 = -83035504;
      var72 = var213;
      var213 = (var72 | var143) & (~var72 | ~var143);
      var248 = (int)5615975630641617060L;
      var143 = -1517406975;
      var72 = var248;
      var248 = (var72 | var143) & ~(var72 & var143);
      var143 = -232224250;
      var72 = var248;
      var143 = var72 & ~var143 | ~var72 & var143;
      var72 = var213;
      var213 = 2 * (var72 | var143) - (var72 ^ var143);
      float var35 = 4.0F * var9;
      Color var36 = pulse.Theme.a(pulse.Theme.m, var64);
      Color var37 = pulse.Theme.a(pulse.Theme.r, var64);
      var290 = (int)-3658265890573562839L;
      var143 = 331808776;
      var72 = var290;
      var290 = (var72 | var143) - (var72 & var143);
      var143 = 133090942;
      var72 = var290;
      var290 = (var72 | var143) - (var72 & var143);
      int var10003 = (int)3440286861686539997L;
      var143 = -2046932488;
      var72 = var10003;
      var10003 = (var72 | var143) & ~(var72 & var143);
      var143 = -737707991;
      var72 = var10003;
      var143 = (var72 | var143) & (~var72 | ~var143);
      var72 = var290;
      var290 = (var72 & ~var143) + (var143 & ~var72) + 2 * (var72 & var143);
      float var266 = var26 - 0.5F * var9;
      String var300 = "ow";
      var2.a(var266, var34 - 0.5F * var9, var24 + var9, var32 + var9, var35, var36, var36, var37, var37, var1);
      Color var38 = pulse.Theme.a(pulse.Theme.e, var64);
      Color var39 = pulse.Theme.a(pulse.Theme.f, var64);
      var2.a(var26, var34, var24, var32, var35, var38, var38, var39, var39, var1);
      float var40 = var26 + var24 / 2.0F;
      float var41 = var34 + var32 / 2.0F;
      float var42 = Math.round(var40 - var22 / 2.0F);
      float var43 = Math.round(var41 - var31 / 2.0F);
      Color var44 = pulse.Theme.a(pulse.Theme.a, var64);
      var1.push();
      var1.translate(var42, var43, 0.0F);
      var1.scale(var9, var9, 1.0F);
      var1.translate(-var42, -var43, 0.0F);
      double var297 = var42;
      String var10004 = "ox";
      var10.a(var21, var297, var43 + 3.5F, var44, var1);
      var1.pop();
      var143 = -498808415;
      var72 = -1544179037;
      var248 = var72 & ~var143 | ~var72 & var143;
      var143 = 271567011;
      var72 = var248;
      var248 = (var72 | var143) - (var72 & var143);
      var143 = 1978462646;
      var72 = 2037472955;
      var290 = (var72 | var143) - (var72 & var143);
      var143 = -341978235;
      var72 = var290;
      var143 = (var72 | var143) & ~(var72 & var143);
      var72 = var248;
      var248 = var72 - ~var143 - 1;
      float var45 = var4 + 20.0F * var9;
      float var46 = var5 - var12 * 2.0F;
      var143 = 496780536;
      var72 = 843199169;
      var248 = (var72 | var143) & ~(var72 & var143);
      var143 = 803108407;
      var72 = var248;
      var248 = (var72 | var143) & (~var72 | ~var143);
      var143 = -599452240;
      var72 = 1482376591;
      var248 = (var72 | var143) & (~var72 | ~var143);
      var143 = -2078388172;
      var72 = var248;
      var248 = var72 & ~var143 | ~var72 & var143;
      var143 = -226384068;
      var72 = -390192078;
      var248 = (var72 | var143) & (~var72 | ~var143);
      var143 = 440369926;
      var72 = var248;
      var248 = (var72 | var143) & ~(var72 & var143);
      float var47 = 3.0F * var9;
      float var48 = var47 / 2.0F;
      float var49 = var3 + var12;
      this.C = var49;
      this.D = var46;
      Color var50 = ColorUtils.a(pulse.Theme.b, j, var14);
      Color var51 = pulse.Theme.a(var50, var64);
      var2.a(var49, var45, var46, var47, var48, var51, var1);
      float var52 = var46 * var19;
      if (var52 > 0.0F) {
         Color var53 = ColorUtils.a(pulse.Theme.y, k, var15);
         Color var54 = ColorUtils.a(pulse.Theme.z, l, var15);
         Color var55 = pulse.Theme.a(var53, var64);
         Color var56 = pulse.Theme.a(var54, var64);
         if (!(var52 < var48 * 2.0F)) {
            if (c) {
               throw new IllegalStateException();
            }

            var2.a(var49, var45, var52, var47, var48, var55, var55, var56, var56, var1);
         } else {
            var2.a(var49, var45, var52, var47, var52 / 2.0F, var55, var55, var56, var56, var1);
         }
      }

      var143 = 857297397;
      var72 = -986258010;
      var213 = var72 + var143 - 2 * (var72 & var143);
      var143 = 1420616;
      var72 = var213;
      var213 = (var72 + var143 - 2 * (var72 & var143)) * (var72 + var143 - 2 * (var72 & var143));
      float var65 = (7.0F + 1.0F * var16) * var9;
      float var66 = var49 + var52 - var65 / 2.0F;
      float var68 = var45 + var47 / 2.0F - var65 / 2.0F;
      var66 = Math.max(var49 - var65 / 2.0F, Math.min(var66, var49 + var46 - var65 / 2.0F));
      Color var69 = pulse.Theme.a(pulse.Theme.a, var64);
      var2.a(var66, var68, var65, var65, var65, var69, var1);
      var143 = 942885301;
      var72 = 789474972;
      var248 = (var72 | var143) & ~(var72 & var143);
      var143 = 563898790;
      var72 = var248;
      var248 = var72 & ~var143 | ~var72 & var143;
      float var57 = var45 - 5.0F * var9;
      var248 = (int)-690715084693744611L;
      var143 = 244119406;
      var72 = var248;
      var248 = (var72 | var143) & (~var72 | ~var143);
      var143 = -657859573;
      var72 = var248;
      var248 = var72 + var143 - 2 * (var72 & var143);
      float var58 = var47 + 10.0F * var9;
      boolean var59 = GuiInput.a(var49 - var65 / 2.0F, var57, var46 + var65, var58, var6, var7);
      if (var59 || this.A) {
         GuiInput.g();
      }
   }

   @Override
   public boolean a(float var1, float var2, float var3, int var4, int var5) {
      int var13 = 1641576432;
      int var12 = 1240318911;
      int var10000 = var12 + var13 - 2 * (var12 & var13);
      var13 = 244215924;
      var12 = var10000;
      var10000 = (var12 | var13) - (var12 & var13);
      var13 = -979181897;
      var12 = -534987295;
      int var10001 = var12 & ~var13 | ~var12 & var13;
      var13 = 1345788902;
      var12 = var10001;
      var13 = (var12 | var13) & ~(var12 & var13);
      var12 = var10000;
      var10000 = var12 - ~var13 - 1;
      float var6 = 8.0F;
      String var80 = "oy";
      float var7 = var2 + 20.0F;
      float var8 = var3 - var6 * 2.0F;
      float var9 = var1 + var6;
      this.C = var9;
      this.D = var8;
      var10001 = (int)-8184036248526298584L;
      var13 = -1542405160;
      var12 = var10001;
      var10001 = (var12 | var13) - (var12 & var13);
      var13 = 388079636;
      var12 = var10001;
      var10001 = var12 + var13 - 2 * (var12 & var13);
      float var10 = var7 - 5.0F;
      String var74 = "oz";
      float var11 = 13.0F;
      var10001 = (int)-4199681031624395547L;
      var13 = -1681924735;
      var12 = var10001;
      var10001 = (var12 | var13) - (var12 & var13);
      var13 = 835672349;
      var12 = var10001;
      var10001 = (var12 | var13) - (var12 & var13);
      var13 = -275315430;
      var12 = 1246874396;
      int var10002 = var12 + var13 - 2 * (var12 & var13);
      var13 = -1166829983;
      var12 = var10002;
      var13 = (var12 | var13) & (~var12 | ~var13);
      var12 = var10001;
      var10001 = var12 - ~var13 - 1;
      float var75 = var9 - 3.5F;
      int var10004 = (int)1654915938546123382L;
      var13 = 2050731687;
      var12 = var10004;
      var10004 = (var12 | var13) & ~(var12 & var13);
      var13 = 1343696095;
      var12 = var10004;
      var10004 = var12 & ~var13 | ~var12 & var13;
      var13 = -61880247;
      var12 = 1275434724;
      var10004 = (var12 | var13) & (~var12 | ~var13);
      var13 = -1337303380;
      var12 = var10004;
      var10004 = var12 & ~var13 | ~var12 & var13;
      if (!GuiInput.a(var75, var10, var8 + 7.0F, var11, var4, var5)) {
         var13 = -86648610;
         var12 = -290875219;
         var10000 = var12 + var13 - 2 * (var12 & var13);
         var13 = 343687283;
         var12 = var10000;
         return pulse.Bool.from((var12 | var13) & (var12 ^ -1 | var13 ^ -1));
      }

      var13 = -1949008192;
      var12 = -258825275;
      var10001 = var12 & ~var13 | ~var12 & var13;
      var13 = 2068241668;
      var12 = var10001;
      this.A = pulse.Bool.from(var12 & ~var13 | ~var12 & var13);
      if (this.E) {
         this.F = this.n;
      }

      var13 = -1004195159;
      var12 = 1722939361;
      var10002 = var12 + var13 - 2 * (var12 & var13);
      var13 = -1594783649;
      var12 = var10002;
      var10002 = ((var12 | var13) & (~var12 | ~var13)) * ((var12 | var13) & (~var12 | ~var13));
      this.t.a(1.0, 0.1, pulse.Easing.h);
      AnimationState var76 = this.u;
      var13 = -894541881;
      var12 = -235692632;
      int var10003 = var12 + var13 - 2 * (var12 & var13);
      var13 = 996000366;
      var12 = var10003;
      var10003 = (var12 | var13) & ~(var12 & var13);
      var13 = 1929252983;
      var12 = 1951092790;
      var10003 = var12 & ~var13 | ~var12 & var13;
      var13 = 112541765;
      var12 = var10003;
      var10003 = (var12 | var13) & ~(var12 & var13);
      var13 = 1813012179;
      var12 = 2130633669;
      var10003 = (var12 | var13) & (~var12 | ~var13);
      var13 = 317635861;
      var12 = var10003;
      var10003 = (var12 | var13) & ~(var12 & var13);
      var76.a(1.0, 0.15, pulse.Easing.F);
      String var91 = "pa";
      this.v.a(1.0, 0.2, pulse.Easing.h);
      this.a(var9, var8, var4);
      var10000 = (int)-609992818360964384L;
      var13 = 1078062566;
      var12 = var10000;
      var10000 = var12 & ~var13 | ~var12 & var13;
      var13 = 978306823;
      var12 = var10000;
      return pulse.Bool.from(var12 & (var13 ^ -1) | (var12 ^ -1) & var13);
   }

   @Override
   public void a(int var1, int var2) {
      if (this.A) {
         if (this.E) {
            this.n = this.F;
            if (this.r != null) {
               this.r.a(this.n);
            }

            this.w.d(this.G.j());
            this.B = this.n;
            double var10001 = this.n;
            int var4 = 1771752708;
            int var3 = 583721874;
            int var10002 = (var3 | var4) & ~(var3 & var4);
            var4 = 919812140;
            var3 = var10002;
            var10002 = (var3 | var4) & (~var3 | ~var4);
            this.H.a(var10001, 0.2, pulse.Easing.C);
         }

         int var35 = (int)-2886434799538969686L;
         int var21 = 1795525162;
         int var6 = var35;
         var35 = (var6 | var21) - (var6 & var21);
         var21 = -1457329792;
         var6 = var35;
         this.A = pulse.Bool.from(var6 + var21 - 2 * (var6 & var21));
         var21 = 1967022062;
         var6 = 558944965;
         int var38 = (var6 | var21) & (~var6 | ~var21);
         var21 = 986702018;
         var6 = var38;
         var38 = var6 + var21 - 2 * (var6 & var21);
         this.t.a(0.0, 0.2, pulse.Easing.h);
         var21 = -1784791082;
         var6 = 1554803715;
         var38 = var6 & ~var21 | ~var6 & var21;
         var21 = -1208135402;
         var6 = var38;
         var38 = var6 & ~var21 | ~var6 & var21;
         int var10003 = (int)-174816587991295190L;
         var21 = 186333739;
         var6 = var10003;
         var10003 = var6 + var21 - 2 * (var6 & var21);
         var21 = -1543646740;
         var6 = var10003;
         var21 = var6 & ~var21 | ~var6 & var21;
         var6 = var38;
         var38 = (var6 ^ var21) + 2 * (var6 & var21);
         this.u.a(0.0, 0.25, pulse.Easing.F);
         var21 = -1991156426;
         var6 = -492355306;
         var38 = (var6 | var21) & ~(var6 & var21);
         var21 = 1367784555;
         var6 = var38;
         var38 = (var6 | var21) - (var6 & var21);
         var21 = 1498394974;
         var6 = -1134551292;
         var10003 = (var6 | var21) - (var6 & var21);
         var21 = 1430742158;
         var6 = var10003;
         var21 = var6 + var21 - 2 * (var6 & var21);
         var6 = var38;
         var38 = (var6 & ~var21) + (var21 & ~var6) + 2 * (var6 & var21);
         this.v.a(0.0, 0.3, pulse.Easing.h);
      }
   }

   @Override
   public void a(int var1, int var2, double var3, double var5) {
      if (this.A) {
         if (!(this.D > 0.0F)) {
            if (c) {
               int var10000 = (int)-3277887052789020454L;
               int var8 = 625554049;
               int var7 = var10000;
               var10000 = (var7 | var8) & (~var7 | ~var8);
               var8 = -1981695397;
               var7 = var10000;
               var10000 = var7 & ~var8 | ~var7 & var8;
               int var10001 = (int)-497321592014850491L;
               var8 = -1280430642;
               var7 = var10001;
               var10001 = (var7 | var8) - (var7 & var8);
               var8 = 326933387;
               var7 = var10001;
               var10000 /= (var7 | var8) & (~var7 | ~var8);
            }
         } else {
            this.a(this.C, this.D, var1);
         }
      }
   }

   private void a(float var1, float var2, int var3) {
      float var4 = var3 - var1;
      float var5 = Math.max(0.0F, Math.min(1.0F, var4 / var2));
      float var6 = this.o + (this.p - this.o) * var5;
      float var7 = Math.round(var6 / this.q) * this.q;
      float var8 = Math.max(this.o, Math.min(this.p, var7));
      if (!this.E) {
         this.n = var8;
         if (this.r != null) {
            this.r.a(var8);
         }
      } else {
         this.F = var8;
      }
   }

   @Override
   public boolean d() {
      int var32;
      if (this.r != null && !this.r.m()) {
         var32 = (int)-1710641294631799815L;
         int var30 = -2032334323;
         int var17 = var32;
         var32 = (var17 | var30) & (~var17 | ~var30);
         var30 = -913933836;
         var17 = var32;
         var32 = (var17 | var30) - (var17 & var30);
      } else {
         int var4 = -1105976046;
         int var3 = 159934149;
         var32 = var3 + var4 - 2 * (var3 & var4);
         var4 = -1214495786;
         var3 = var32;
         var32 = (var3 | var4) - (var3 & var4);
         int var10002 = (int)4738387943096235429L;
         var4 = -441001193;
         var3 = var10002;
         var10002 = var3 & ~var4 | ~var3 & var4;
         var4 = 1233678001;
         var3 = var10002;
         var10002 = (var3 | var4) - (var3 & var4);
         var4 = -1785674281;
         var3 = -353328575;
         var10002 = var3 + var4 - 2 * (var3 & var4);
         var4 = 2137024415;
         var3 = var10002;
         var10002 = (var3 | var4) - (var3 & var4);
         int var10001 = (int)-2496961405045594373L;
         var4 = -602811495;
         var3 = var10001;
         var10001 = var3 & ~var4 | ~var3 & var4;
         var4 = 875029624;
         var3 = var10001;
         int var2 = (var3 | var4) & ~(var3 & var4);
         b = var2;
         String var36 = "pb";
         var4 = 715434696;
         var3 = 1555190743;
         var10001 = (var3 | var4) - (var3 & var4);
         var4 = 2112972538;
         var3 = var10001;
         if ((var3 | var4) - (var3 & var4) < b) {
            String var38 = "pc";
            var10001 = (int)-8026006153371066398L;
            var4 = 1132241067;
            var3 = var10001;
            var10001 = var3 & ~var4 | ~var3 & var4;
            var4 = -773282321;
            var3 = var10001;
            var2 = var3 + var4 - 2 * (var3 & var4);
            b = var2;
         }
      }

      return pulse.Bool.from(var32);
   }

   public static String a(String var0, String var1, int var2, int var3, int var4, int var5) {
      char[] var6 = var1.toCharArray();
      char[] var7 = new char[var6.length];
      int var18 = -1415987039;
      int var17 = -271105405;
      int var10000 = (var17 | var18) & ~(var17 & var18);
      var18 = 1145995816;
      var17 = var10000;
      char[] var239 = new char[var17 & ~var18 | ~var17 & var18];
      int var10002 = (int)3019778993800774943L;
      var18 = -756357907;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 54813170;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 1964675605;
      var17 = -80799380;
      int var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -1909079221;
      var17 = var10003;
      var239[var10002] = (char)((var17 | var18) - (var17 & var18));
      var18 = -1939027255;
      var17 = 11280844;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -1933513980;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 1968698672;
      var17 = 1112549244;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 923267529;
      var17 = var10003;
      var239[var10002] = (char)((var17 | var18) - (var17 & var18));
      var18 = -866284528;
      var17 = -1809293212;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1484123254;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -1077034281;
      var17 = -1086048595;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 9033724;
      var17 = var10003;
      var239[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var18 = 1685902051;
      var17 = 43400927;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1726671935;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var10003 = (int)-137321179652362037L;
      var18 = 663433676;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 657821696;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 184037167;
      var17 = -951164229;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -843655801;
      var17 = var10003;
      var239[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var10002 = (int)-4949801818718083455L;
      var18 = -1748112157;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 24382054;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -1615015518;
      var17 = -772041689;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -1408013179;
      var17 = var10003;
      var10003 = (var17 + var18 - 2 * (var17 & var18)) * (var17 + var18 - 2 * (var17 & var18));
      var18 = 1168218986;
      var17 = 641420891;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1671054356;
      var17 = var10003;
      var239[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var18 = -2093209700;
      var17 = -846329024;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1320299737;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -6337281;
      var17 = 1208518613;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -1214804312;
      var17 = var10003;
      var239[var10002] = (char)((var17 | var18) - (var17 & var18));
      var18 = 1361002193;
      var17 = 297367422;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 1084639657;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1289327640;
      var17 = 1602461743;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -324681004;
      var17 = var10003;
      var239[var10002] = (char)((var17 | var18) - (var17 & var18));
      var18 = 309090269;
      var17 = 1544586625;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1316803163;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var10003 = (int)5821956764200400862L;
      var18 = -170526542;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 1309489998;
      var17 = var10003;
      var239[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var18 = 229528534;
      var17 = 1197272007;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1257420825;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -500931379;
      var17 = -1305245766;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 1343744804;
      var17 = var10003;
      var239[var10002] = (char)((var17 | var18) - (var17 & var18));
      var18 = -1399523121;
      var17 = -874346132;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 1735815594;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 361186590;
      var17 = 1114621710;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 1474856244;
      var17 = var10003;
      var239[var10002] = (char)((var17 | var18) - (var17 & var18));
      char[] var8 = var239;
      var18 = 2086382014;
      var17 = 17218072;
      var10000 = (var17 | var18) - (var17 & var18);
      var18 = 2103251884;
      var17 = var10000;
      char[] var241 = new char[var17 + var18 - 2 * (var17 & var18)];
      var10002 = (int)8607263562175083356L;
      var18 = 1271544147;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 206686735;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)-8237112925849022550L;
      var18 = 885638405;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1422654833;
      var17 = var10003;
      var241[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var10002 = (int)2057000836396888982L;
      var18 = -815671813;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1937761900;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      int var10004 = (int)-3354184624267461818L;
      var18 = 1143323456;
      var17 = var10004;
      var10004 = (var17 | var18) & ~(var17 & var18);
      var18 = -1152368638;
      var17 = var10004;
      var10004 = var17 + var18 - 2 * (var17 & var18);
      var18 = -503889082;
      var17 = -2137668422;
      var10004 = (var17 | var18) & ~(var17 & var18);
      var18 = 1633847286;
      var17 = var10004;
      var10004 = var17 & ~var18 | ~var17 & var18;
      var18 = -1658640143;
      var17 = 646590967;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -1146512123;
      var17 = var10003;
      var241[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var10002 = (int)-108321152562274566L;
      var18 = -2127908565;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -755503149;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      String var317 = "pd";
      var18 = -2082710762;
      var17 = 2126598252;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -48395223;
      var17 = var10003;
      var241[var10002] = (char)((var17 | var18) - (var17 & var18));
      var18 = 1123182960;
      var17 = -634158500;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -1732121809;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)907704838034486336L;
      var18 = 1543712322;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -202251776;
      var17 = var10003;
      var241[var10002] = (char)((var17 | var18) - (var17 & var18));
      var10002 = (int)-7184610539336747634L;
      var18 = 402448701;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1364011849;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 1549667168;
      var17 = 1942450924;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 798573004;
      var17 = var10003;
      var241[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var18 = -1155508846;
      var17 = -103853387;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 1122961186;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)-4136379358624759507L;
      var18 = -1484784498;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 798360887;
      var17 = var10003;
      var241[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var18 = -634814348;
      var17 = -1294459381;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1760665209;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      String var324 = "pe";
      var18 = 1194596803;
      var17 = -2145497744;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -953494646;
      var17 = var10003;
      var241[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var18 = -1832626278;
      var17 = -1376217948;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1060946745;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -1714869472;
      var17 = -989908725;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 1563822611;
      var17 = var10003;
      var241[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var18 = -1686659284;
      var17 = -451593579;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 2120394161;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 1751139268;
      var17 = -323412487;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 387789473;
      var17 = var10003;
      var10003 = (var17 + var18 - 2 * (var17 & var18)) * (var17 + var18 - 2 * (var17 & var18));
      var10003 = (int)-2034297651862843351L;
      var18 = 2137484623;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 707411554;
      var17 = var10003;
      var241[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var10002 = (int)52515706816077935L;
      var18 = 661024719;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -159330391;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 2106966818;
      var17 = -587352244;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1587001507;
      var17 = var10003;
      var241[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      char[] var9 = var241;
      var10000 = (int)2159424386104132451L;
      var18 = 343488693;
      var17 = var10000;
      var10000 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1451967530;
      var17 = var10000;

      for (int var10 = var17 & ~var18 | ~var17 & var18; var10 < var6.length; var10++) {
         char var295 = var6[var10];
         char var225 = var8[var10 % var8.length];
         char var116 = var295;
         var7[var10] = (char)((var116 | var225) & (~var116 | ~var225));
      }

      char[] var19 = new char[var7.length];
      var18 = 862960651;
      var17 = 1304062068;
      var10000 = var17 + var18 - 2 * (var17 & var18);
      var18 = 2127942783;
      var17 = var10000;

      for (int var11 = var17 & ~var18 | ~var17 & var18; var11 < var6.length; var11++) {
         char var296 = var7[var11];
         char var228 = var9[var11 % var9.length];
         char var119 = var296;
         var19[var11] = (char)((var119 | var228) & ~(var119 & var228));
      }

      String var20 = new String(var19);
      int var12 = var20.hashCode();
      var18 = var5;
      var17 = var3;
      var10000 = (var17 & ~var18) - (~var17 & var18);
      var18 = var2;
      var17 = var10000;
      int var13 = var17 + ~var18 + 1;
      char[] var14 = var0.toCharArray();
      char[] var15 = new char[var14.length];
      var10000 = (int)-2196798861645387784L;
      var18 = 1772298728;
      var17 = var10000;
      var10000 = var17 & ~var18 | ~var17 & var18;
      var18 = 2030552592;
      var17 = var10000;

      for (int var16 = (var17 | var18) & ~(var17 & var18); var16 < var15.length; var16++) {
         int var10001 = (int)-8203792074685352666L;
         var18 = 569157164;
         var17 = var10001;
         var10001 = (var17 | var18) & (~var17 | ~var18);
         var18 = -119909624;
         var17 = var10001;
         switch (var16 % (var17 + var18 - 2 * (var17 & var18))) {
            case 0:
               var18 = var12;
               var17 = var13;
               var10002 = var17 + var18 - 2 * (var17 & var18);
               char var238 = var14[var16];
               var17 = var10002;
               var15[var16] = (char)(var17 + var238 - 2 * (var17 & var238));
               break;
            case 1:
               var18 = var13;
               var17 = var5;
               var10002 = var17 & ~var18 | ~var17 & var18;
               char var236 = var14[var16];
               var17 = var10002;
               var15[var16] = (char)((var17 | var236) - (var17 & var236));
         }
      }

      return new String(var15);
   }
}
