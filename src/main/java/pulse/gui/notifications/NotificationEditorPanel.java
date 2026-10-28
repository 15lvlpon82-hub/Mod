package pulse;

import java.awt.Color;
import java.util.function.Consumer;
import net.minecraft.client.util.math.MatrixStack;

public class NotificationEditorPanel {
   private static final float c = 11.5F;
   private static final float d = 0.5F;
   private static final float e = 8.0F;
   private static final float f = 8.0F;
   private static final float g = 8.5F;
   private static final float h = 5.0F;
   private static final float i = 10.0F;
   private static final float j = 13.5F;
   private static final float k = 4.0F;
   private static final float l = 22.0F;
   private static final float m = 9.5F;
   private static final float n = 19.5F;
   private static final float o = 6.5F;
   private static final Color p = pulse.Theme.L;
   private static final Color q = pulse.Theme.M;
   private Notification r;
   private final TextInput s;
   private final CoordinateInputPanel t;
   private final NotificationIconPicker u;
   private final AnimationState v = new AnimationState();
   private boolean w;
   private boolean x;
   private float y;
   private float z;
   private Consumer<Notification> A;
   private Consumer<Notification> B;
   public static int a;
   public static boolean b;

   public NotificationEditorPanel() {
      int var10001 = (int)-463676525468346221L;
      int var2 = -1092570011;
      int var1 = var10001;
      var10001 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1641730826;
      var1 = var10001;
      this.w = pulse.Bool.from((var1 | var2) - (var1 & var2));
      var10001 = (int)-7425330972237750530L;
      var2 = 1722769999;
      var1 = var10001;
      var10001 = var1 + var2 - 2 * (var1 & var2);
      var2 = 46103729;
      var1 = var10001;
      this.x = pulse.Bool.from(var1 & ~var2 | ~var1 & var2);
      TextInput.InputType var10003 = TextInput.InputType.TEXT;
      int var10004 = (int)-3098071307566955561L;
      var2 = 1729620257;
      var1 = var10004;
      var10004 = var1 & ~var2 | ~var1 & var2;
      var2 = 372346478;
      var1 = var10004;
      var10004 = var1 + var2 - 2 * (var1 & var2);
      int var10005 = (int)7007202231573962450L;
      var2 = -519890557;
      var1 = var10005;
      var10005 = (var1 | var2) - (var1 & var2);
      var2 = 1792764382;
      var1 = var10005;
      var2 = var1 + var2 - 2 * (var1 & var2);
      var1 = var10004;
      var10004 = var1 - ~var2 - 1;
      var2 = 1503317774;
      var1 = -1352872811;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1921611304;
      var1 = var10005;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = -328593324;
      var1 = 635749915;
      int var10006 = (var1 | var2) - (var1 & var2);
      var2 = -1982994501;
      var1 = var10006;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      int var10007 = (int)7077615503579011081L;
      var2 = 1178103867;
      var1 = var10007;
      var10007 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1185852623;
      var1 = var10007;
      var2 = var1 + var2 - 2 * (var1 & var2);
      var1 = var10006;
      var10006 = 2 * (var1 | var2) - (var1 ^ var2);
      var10006 = (int)-6136579063706483088L;
      var2 = 1483032814;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var2 = -117412049;
      var1 = var10006;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      String var125 = "dsp";
      var10007 = (int)-5413906547288190883L;
      var2 = -1601622942;
      var1 = var10007;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var2 = -2045814170;
      var1 = var10007;
      var10007 = (var1 | var2) & (~var1 | ~var2);
      String var10008 = "dsq";
      int var132 = (int)3472203931335578709L;
      var2 = 845281444;
      var1 = var132;
      int var133 = (var1 | var2) & (~var1 | ~var2);
      var2 = 500186411;
      var1 = var133;
      int var134 = var1 & ~var2 | ~var1 & var2;
      var2 = -1970081198;
      var1 = 1658628844;
      int var10010 = var1 & ~var2 | ~var1 & var2;
      var2 = -397518661;
      var1 = var10010;
      var10010 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1677251959;
      var1 = 61685223;
      var10010 = (var1 | var2) & ~(var1 & var2);
      var2 = 1616242833;
      var1 = var10010;
      var10010 = (var1 | var2) - (var1 & var2);
      int var10009 = (int)-3671194615082409898L;
      var2 = 439894694;
      var1 = var10009;
      var10009 = (var1 | var2) & (~var1 | ~var2);
      var2 = -795975482;
      var1 = var10009;
      String var113 = a(
         "", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁼ꤄絤蹁⑿謥㑤=\ua7cb꒴ꁣꤎ絳蹘\u245f謳㑾f\ua7e9꒧ꁁ꤄絸蹏⑶", var10006, var10007, var134, (var1 | var2) - (var1 & var2)
      );
      String var117 = "dsr";
      String var123 = "dss";
      String var129 = "dst";
      var2 = -1211728678;
      var1 = 1617835424;
      var10007 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1251972917;
      var1 = var10007;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      int var135 = (int)8898146752483681452L;
      var2 = 786897480;
      var1 = var135;
      int var136 = (var1 | var2) & ~(var1 & var2);
      var2 = -659806866;
      var1 = var136;
      int var137 = (var1 | var2) & (~var1 | ~var2);
      int var138 = (int)-7773413988028584583L;
      var2 = 1450497827;
      var1 = var138;
      int var139 = (var1 | var2) - (var1 & var2);
      var2 = 1587784403;
      var1 = var139;
      int var140 = var1 + var2 - 2 * (var1 & var2);
      String var142 = "dsu";
      var2 = 405025130;
      var1 = 187825971;
      var10009 = (var1 | var2) & (~var1 | ~var2);
      var2 = 112805921;
      var1 = var10009;
      var10009 = (var1 | var2) - (var1 & var2);
      var10010 = (int)-8095266300288283169L;
      var2 = -1679532084;
      var1 = var10010;
      var10010 = (var1 | var2) & ~(var1 & var2);
      var2 = 526302855;
      var1 = var10010;
      var10010 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1410915569;
      var1 = -742971296;
      int var10011 = var1 & ~var2 | ~var1 & var2;
      var2 = -2043611117;
      var1 = var10011;
      var2 = var1 + var2 - 2 * (var1 & var2);
      var1 = var10010;
      var10010 = 2 * (var1 | var2) - (var1 ^ var2);
      var2 = -1256948470;
      var1 = 1366176963;
      var10010 = var1 + var2 - 2 * (var1 & var2);
      var2 = -464837201;
      var1 = var10010;
      this.s = new TextInput(
         var10003,
         var113,
         a("⟞樤⟴樦⟳権⟻模", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁼ꤄絤蹁⑿謥㑤=\ua7cb꒴ꁣꤎ絳蹘\u245f謳㑾f\ua7e9꒧ꁁ꤄絸蹏⑶", var10007, var140, var10009, var1 & ~var2 | ~var1 & var2)
      );
      var2 = 1303940517;
      var1 = 1138603182;
      var10001 = (var1 | var2) - (var1 & var2);
      var2 = 241514771;
      var1 = var10001;
      this.s.a(var1 + var2 - 2 * (var1 & var2));
      this.s.a(this::a);
      var10001 = (int)3759813469784237873L;
      var2 = -595607908;
      var1 = var10001;
      var10001 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1141502242;
      var1 = var10001;
      var10001 = (var1 | var2) & (~var1 | ~var2);
      int var10002 = (int)-4906167353976317714L;
      var2 = 120119242;
      var1 = var10002;
      var10002 = (var1 | var2) - (var1 & var2);
      var2 = -1260985616;
      var1 = var10002;
      var2 = (var1 | var2) & ~(var1 & var2);
      var1 = var10001;
      var10001 = (var1 ^ var2) + 2 * (var1 & var2);
      this.s.a(7.5F);
      this.t = new CoordinateInputPanel();
      this.t.a(this::a);
      this.u = new NotificationIconPicker();
      this.u.a(this::a);
   }

   public void a(Notification var1) {
      this.r = var1;
      if (var1 != null) {
         this.s.b(var1.a());
         this.t.a(var1.b(), var1.c(), var1.d());
         this.u.a(var1.f());
         this.u.a(var1.e());
      }

      if (this.x) {
         pulse.ColorPickerPopup.a().b();
         int var3 = 1536343808;
         int var2 = -257117245;
         int var10001 = var2 + var3 - 2 * (var2 & var3);
         var3 = -1421996861;
         var2 = var10001;
         this.x = pulse.Bool.from(var2 + var3 - 2 * (var2 & var3));
      }
   }

   public Notification a() {
      return this.r;
   }

   public void a(Consumer<Notification> var1) {
      this.A = var1;
   }

   public void b(Consumer<Notification> var1) {
      this.B = var1;
   }

   private void a(String var1) {
      if (this.r != null && !var1.isEmpty() && !this.r.j()) {
         this.r.a(var1);
         this.f();
      }
   }

   private void a(int[] var1) {
      if (this.r != null && !this.r.j()) {
         int var10002 = (int)4308432935872728611L;
         int var3 = -1044280480;
         int var2 = var10002;
         var10002 = (var2 | var3) & ~(var2 & var3);
         var3 = 1485309251;
         var2 = var10002;
         this.r.a(var1[(var2 | var3) - (var2 & var3)]);
         var10002 = (int)-7563938608213608591L;
         var3 = -491634287;
         var2 = var10002;
         var10002 = var2 & ~var3 | ~var2 & var3;
         var3 = -1474103583;
         var2 = var10002;
         this.r.b(var1[(var2 | var3) & ~(var2 & var3)]);
         var3 = -1642647764;
         var2 = -1712900084;
         var10002 = (var2 | var3) & (~var2 | ~var3);
         var3 = 133175074;
         var2 = var10002;
         this.r.c(var1[(var2 | var3) - (var2 & var3)]);
         this.f();
      }
   }

   private void a(Notification.Icon var1) {
      if (this.r != null && !this.r.j()) {
         this.r.a(var1);
         this.f();
      }
   }

   private void a(Color var1) {
      if (this.r != null) {
         this.r.a(var1);
         this.u.a(var1);
         this.f();
      }
   }

   public boolean b() {
      if (this.r != null) {
         if (this.r.j()) {
            int var10 = (int)-6757918941184493215L;
            int var7 = -1321423561;
            int var4 = var10;
            var10 = (var4 | var7) & ~(var4 & var7);
            var7 = -1729309609;
            var4 = var10;
            return pulse.Bool.from((var4 | var7) - (var4 & var7));
         }

         if (a != a) {
            throw new RuntimeException();
         }
      }

      int var2 = -473339804;
      int var1 = 439666320;
      int var10000 = var1 + var2 - 2 * (var1 & var2);
      var2 = -100815116;
      var1 = var10000;
      return pulse.Bool.from(var1 & ~var2 | ~var1 & var2);
   }

   private void f() {
      if (this.B != null && this.r != null) {
         this.B.accept(this.r);
      }
   }

   public void a(MatrixStack var1, Renderer2D var2, float var3, float var4, float var5, float var6, int var7, int var8, float var9) {
      if (this.r != null) {
         this.v.a();
         int var10000 = (int)7403641112302071918L;
         int var26 = 96385254;
         int var25 = var10000;
         var10000 = var25 + var26 - 2 * (var25 & var26);
         var26 = 295500768;
         var25 = var10000;
         var10000 = var25 & ~var26 | ~var25 & var26;
         int var10001 = (int)-8989010643363008481L;
         var26 = 1655719397;
         var25 = var10001;
         var10001 = (var25 | var26) & (~var25 | ~var26);
         var26 = 1697661572;
         var25 = var10001;
         var26 = (var25 | var26) - (var25 & var26);
         var25 = var10000;
         var10000 = (var25 ^ var26) + 2 * (var25 & var26);
         int var10 = (int)(255.0F * var9);
         Color var11 = pulse.Theme.a(pulse.Theme.g, var10);
         Color var12 = pulse.Theme.a(pulse.Theme.n, var10);
         String var10002 = "dsv";
         float var338 = var3 - 0.5F;
         var26 = 1994014805;
         var25 = 155841117;
         int var10003 = (var25 | var26) - (var25 & var26);
         var26 = -359409815;
         var25 = var10003;
         var10003 = var25 + var26 - 2 * (var25 & var26);
         int var10004 = (int)-2035475675133670651L;
         var26 = 41721729;
         var25 = var10004;
         var10004 = (var25 | var26) & (~var25 | ~var26);
         var26 = 588410155;
         var25 = var10004;
         var26 = (var25 | var26) - (var25 & var26);
         var25 = var10003;
         var10003 = (var25 ^ var26) + 2 * (var25 & var26);
         float var357 = var4 - 0.5F;
         float var406 = var5 + 1.0F;
         float var432 = var6 + 1.0F;
         String var10005 = "dsw";
         var2.a(var338, var357, var406, var432, 11.5F, var11, var11, var12, var12, var1);
         Color var13 = pulse.Theme.a(pulse.Theme.e, var10);
         Color var14 = pulse.Theme.a(pulse.Theme.f, var10);
         int var454 = (int)5749897795056186130L;
         var26 = 1591932627;
         var25 = var454;
         int var455 = (var25 | var26) & (~var25 | ~var26);
         var26 = 1743491741;
         var25 = var455;
         int var456 = (var25 | var26) & ~(var25 & var26);
         var2.a(var3, var4, var5, var6, 11.5F, var13, var13, var14, var14, var1);
         var26 = 1781608718;
         var25 = -1921687104;
         var10001 = var25 & ~var26 | ~var25 & var26;
         var26 = -414953279;
         var25 = var10001;
         FontRenderer var15 = FontManager.a[(var25 | var26) - (var25 & var26)];
         var26 = -452309329;
         var25 = -1881321880;
         var10001 = var25 & ~var26 | ~var25 & var26;
         var26 = 1792475337;
         var25 = var10001;
         FontRenderer var16 = FontManager.a[var25 & ~var26 | ~var25 & var26];
         String var341 = "dsx";
         float var17 = var3 + 8.0F;
         int var358 = (int)5017690543365276425L;
         var26 = 767000072;
         var25 = var358;
         int var359 = var25 + var26 - 2 * (var25 & var26);
         var26 = -207045374;
         var25 = var359;
         int var360 = var25 + var26 - 2 * (var25 & var26);
         float var18 = var5 - 16.0F;
         String var342 = "dsy";
         float var19 = var4 + 8.0F;
         Color var20 = pulse.Theme.a(pulse.Theme.a, var10);
         var26 = 1853060010;
         var25 = -1346197389;
         var10001 = (var25 | var26) & (~var25 | ~var26);
         var26 = 1056423870;
         var25 = var10001;
         var10001 = (var25 | var26) - (var25 & var26);
         var26 = -2073452072;
         var25 = -1479389931;
         int var361 = (var25 | var26) & ~(var25 & var26);
         var26 = -412423938;
         var25 = var361;
         int var362 = var25 & ~var26 | ~var25 & var26;
         var26 = 1516762896;
         var25 = 1510454556;
         var10003 = var25 + var26 - 2 * (var25 & var26);
         var26 = 1605758832;
         var25 = var10003;
         var26 = var25 & ~var26 | ~var25 & var26;
         var25 = var362;
         int var363 = (var25 & ~var26) + (var26 & ~var25) + 2 * (var25 & var26);
         var26 = -1007529234;
         var25 = -1361989054;
         var10003 = (var25 | var26) - (var25 & var26);
         var26 = -357102589;
         var25 = var10003;
         var10003 = ((var25 | var26) & (~var25 | ~var26)) * ((var25 | var26) & (~var25 | ~var26));
         var10003 = (int)-173954838503755033L;
         var26 = -1335941712;
         var25 = var10003;
         var10003 = (var25 | var26) & (~var25 | ~var26);
         var26 = 781383398;
         var25 = var10003;
         var10003 = var25 + var26 - 2 * (var25 & var26);
         var26 = -1193935375;
         var25 = 1335908332;
         var10004 = var25 & ~var26 | ~var25 & var26;
         var26 = -336019321;
         var25 = var10004;
         var10004 = (var25 | var26) - (var25 & var26);
         int var457 = (int)6254154966707969447L;
         var26 = 741219284;
         var25 = var457;
         int var458 = (var25 | var26) - (var25 & var26);
         var26 = 1860000400;
         var25 = var458;
         var26 = (var25 | var26) - (var25 & var26);
         var25 = var10004;
         var10004 = (var25 ^ var26) + 2 * (var25 & var26);
         var10004 = (int)-5046668465612216043L;
         var26 = -791129586;
         var25 = var10004;
         var10004 = (var25 | var26) & (~var25 | ~var26);
         var26 = 596806548;
         var25 = var10004;
         var10004 = (var25 | var26) & (~var25 | ~var26);
         var26 = 1346602046;
         var25 = 1391033742;
         int var459 = var25 + var26 - 2 * (var25 & var26);
         var26 = 1330742380;
         var25 = var459;
         int var460 = (var25 & ~var26 | ~var25 & var26) * (var25 & ~var26 | ~var25 & var26);
         var26 = 863856578;
         var25 = -1657346012;
         int var461 = (var25 | var26) & (~var25 | ~var26);
         var26 = -1444132714;
         var25 = var461;
         int var462 = var25 & ~var26 | ~var25 & var26;
         int var10006 = (int)2282902118653554852L;
         var26 = -735721690;
         var25 = var10006;
         var10006 = (var25 | var26) & (~var25 | ~var26);
         var26 = 1707679139;
         var25 = var10006;
         var10006 = var25 + var26 - 2 * (var25 & var26);
         var26 = -260149187;
         var25 = 471982017;
         var10006 = var25 & ~var26 | ~var25 & var26;
         var26 = -328949068;
         var25 = var10006;
         var15.a(
            a(
               "携䣮摦䢜摧䣠搞䣤搟䳾搛䣫摥䣠搝",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁼ꤄絤蹁⑿謥㑤=\ua7cb꒴ꁣꤎ絳蹘\u245f謳㑾f\ua7e9꒧ꁁ꤄絸蹏⑶",
               var10003,
               var10004,
               var462,
               (var25 | var26) & (~var25 | ~var26)
            ),
            var17,
            var19,
            var20,
            var1
         );
         float var332 = var3 + var5;
         var26 = 940783211;
         var25 = -917766227;
         var10001 = (var25 | var26) - (var25 & var26);
         var26 = 60003621;
         var25 = var10001;
         var10001 = (var25 | var26) & (~var25 | ~var26);
         float var333 = var332 - 8.0F;
         var10001 = (int)-5969702815345248562L;
         var26 = 1441280697;
         var25 = var10001;
         var10001 = var25 + var26 - 2 * (var25 & var26);
         var26 = 1046783840;
         var25 = var10001;
         var10001 = (var25 & ~var26 | ~var25 & var26) * (var25 & ~var26 | ~var25 & var26);
         float var21 = var333 - 13.5F;
         this.a(var1, var2, var21, var19 - 2.0F, var7, var8, var9);
         var10001 = (int)-1225732501235994616L;
         var26 = -386155632;
         var25 = var10001;
         var10001 = var25 + var26 - 2 * (var25 & var26);
         var26 = 653944052;
         var25 = var10001;
         var10001 = (var25 | var26) & ~(var25 & var26);
         var26 = -2056783372;
         var25 = -991786849;
         int var364 = (var25 | var26) & (~var25 | ~var26);
         var26 = 524888489;
         var25 = var364;
         var26 = (var25 | var26) - (var25 & var26);
         var25 = var10001;
         var10001 = (var25 & ~var26) + (var26 & ~var25) + 2 * (var25 & var26);
         var19 += 20.0F;
         Color var22 = pulse.Theme.a(pulse.Theme.b, var10);
         var10000 = (int)-7970571272514896860L;
         var26 = 1319437248;
         var25 = var10000;
         var10000 = (var25 | var26) - (var25 & var26);
         var26 = 443940832;
         var25 = var10000;
         int var23 = (var25 | var26) & ~(var25 & var26);
         var26 = -1530286443;
         var25 = 1888109201;
         int var365 = (var25 | var26) & ~(var25 & var26);
         var26 = -733746171;
         var25 = var365;
         int var366 = (var25 | var26) & ~(var25 & var26);
         int var367 = (int)7809832094093342508L;
         var26 = -337175066;
         var25 = var367;
         int var368 = (var25 | var26) & (~var25 | ~var26);
         var26 = -1610093862;
         var25 = var368;
         int var369 = (var25 | var26) & (~var25 | ~var26);
         var26 = 585507709;
         var25 = -1085062183;
         int var370 = (var25 | var26) & (~var25 | ~var26);
         var26 = -1649057620;
         var25 = var370;
         int var371 = var25 & ~var26 | ~var25 & var26;
         int var372 = (int)-7981349256717621554L;
         var26 = -1218130571;
         var25 = var372;
         int var373 = (var25 | var26) & ~(var25 & var26);
         var26 = -496997455;
         var25 = var373;
         int var374 = var25 + var26 - 2 * (var25 & var26);
         var26 = -1648869442;
         var25 = -1438731841;
         int var375 = var25 + var26 - 2 * (var25 & var26);
         var26 = 931565056;
         var25 = var375;
         int var376 = var25 & ~var26 | ~var25 & var26;
         int var377 = (int)6725952135441934392L;
         var26 = -2051795496;
         var25 = var377;
         int var378 = (var25 | var26) - (var25 & var26);
         var26 = 825523732;
         var25 = var378;
         int var379 = (var25 | var26) & (~var25 | ~var26);
         var26 = 1274235490;
         var25 = 1049548873;
         var10003 = (var25 | var26) & (~var25 | ~var26);
         var26 = 1641284597;
         var25 = var10003;
         var10003 = ((var25 | var26) - (var25 & var26)) * ((var25 | var26) - (var25 & var26));
         var10003 = (int)-5499578548923713295L;
         var26 = 1834599175;
         var25 = var10003;
         var10003 = (var25 | var26) & (~var25 | ~var26);
         var26 = -1365583289;
         var25 = var10003;
         var10003 = var25 & ~var26 | ~var25 & var26;
         var10004 = (int)-4434433532293729086L;
         var26 = -749931582;
         var25 = var10004;
         var10004 = var25 + var26 - 2 * (var25 & var26);
         var26 = -925951380;
         var25 = var10004;
         var10004 = (var25 | var26) - (var25 & var26);
         var10004 = (int)-1718301841040902452L;
         var26 = -707530226;
         var25 = var10004;
         var10004 = (var25 | var26) - (var25 & var26);
         var26 = -1523758252;
         var25 = var10004;
         var10004 = var25 & ~var26 | ~var25 & var26;
         var10005 = "dsz";
         var26 = 1898605775;
         var25 = -1113216236;
         int var464 = (var25 | var26) - (var25 & var26);
         var26 = -606490443;
         var25 = var464;
         int var465 = (var25 | var26) - (var25 & var26);
         var10006 = (int)1589505484200759152L;
         var26 = 821562158;
         var25 = var10006;
         var10006 = (var25 | var26) & ~(var25 & var26);
         var26 = 2074875911;
         var25 = var10006;
         var10006 = (var25 | var26) & ~(var25 & var26);
         var26 = 1075739370;
         var25 = -1346535910;
         int var10007 = var25 + var26 - 2 * (var25 & var26);
         var26 = 395295168;
         var25 = var10007;
         var26 = (var25 | var26) & ~(var25 & var26);
         var25 = var10006;
         var10006 = (var25 & ~var26) + (var26 & ~var25) + 2 * (var25 & var26);
         var26 = -1354869835;
         var25 = 1152402686;
         var10006 = (var25 | var26) - (var25 & var26);
         var26 = -342066428;
         var25 = var10006;
         var16.a(
            a(
               "携⧩搐⧫搗⧤搟⧬怇⧥搒⦛搝⧡",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁼ꤄絤蹁⑿謥㑤=\ua7cb꒴ꁣꤎ絳蹘\u245f謳㑾f\ua7e9꒧ꁁ꤄絸蹏⑶",
               var10003,
               var10004,
               var465,
               var25 + var26 - 2 * (var25 & var26)
            ),
            var17,
            var19 - var23,
            var22,
            var1
         );
         var26 = -941723685;
         var25 = 708586554;
         var10000 = (var25 | var26) & (~var25 | ~var26);
         var26 = -303938581;
         var25 = var10000;
         int var24 = (var25 | var26) & ~(var25 & var26);
         var19 += var24;
         this.a(var1, var2, var17, var19, var18, var7, var8, var9);
         int var380 = (int)7934519746200962089L;
         var26 = -255988791;
         var25 = var380;
         int var381 = (var25 | var26) & (~var25 | ~var26);
         var26 = 1729916912;
         var25 = var381;
         int var382 = (var25 | var26) & (~var25 | ~var26);
         int var383 = (int)-8804845888060290150L;
         var26 = 1971282488;
         var25 = var383;
         int var384 = (var25 | var26) - (var25 & var26);
         var26 = -379262542;
         var25 = var384;
         int var385 = (var25 | var26) & ~(var25 & var26);
         var26 = -2051321106;
         var25 = 511474605;
         int var386 = var25 + var26 - 2 * (var25 & var26);
         var26 = -1681446588;
         var25 = var386;
         int var387 = (var25 | var26) & (~var25 | ~var26);
         var19 += 32.0F;
         String var354 = "dta";
         var26 = 1811071765;
         var25 = 1759635442;
         int var388 = var25 & ~var26 | ~var25 & var26;
         var26 = 427686563;
         var25 = var388;
         int var389 = (var25 | var26) & ~(var25 & var26);
         var26 = -143636242;
         var25 = -1618106936;
         var10003 = var25 & ~var26 | ~var25 & var26;
         var26 = 311111662;
         var25 = var10003;
         var10003 = (var25 | var26) - (var25 & var26);
         var10004 = (int)1221229101390674184L;
         var26 = 2095125278;
         var25 = var10004;
         var10004 = (var25 | var26) & ~(var25 & var26);
         var26 = -314068139;
         var25 = var10004;
         var26 = (var25 | var26) & (~var25 | ~var26);
         var25 = var10003;
         var10003 = (var25 | var26) + (var25 & var26);
         var10003 = (int)-2040866403015761292L;
         var26 = 1799826589;
         var25 = var10003;
         var10003 = var25 & ~var26 | ~var25 & var26;
         var26 = -809996456;
         var25 = var10003;
         var10003 = (var25 | var26) & ~(var25 & var26);
         var26 = -1942176918;
         var25 = -148185142;
         var10004 = (var25 | var26) - (var25 & var26);
         var26 = 1768818974;
         var25 = var10004;
         var10004 = ((var25 | var26) & ~(var25 & var26)) * ((var25 | var26) & ~(var25 & var26));
         var26 = -1057398400;
         var25 = 1629908953;
         var10004 = (var25 | var26) & ~(var25 & var26);
         var26 = -1966990597;
         var25 = var10004;
         var10004 = (var25 | var26) & (~var25 | ~var26);
         int var466 = (int)2306380280901097745L;
         var26 = 689491237;
         var25 = var466;
         int var467 = var25 + var26 - 2 * (var25 & var26);
         var26 = 1227315909;
         var25 = var467;
         int var468 = var25 & ~var26 | ~var25 & var26;
         var26 = -952205375;
         var25 = -1119044507;
         int var469 = (var25 | var26) & ~(var25 & var26);
         var26 = 1660622137;
         var25 = var469;
         int var470 = (var25 | var26) & ~(var25 & var26);
         var10006 = (int)5772412911546455872L;
         var26 = -1506919959;
         var25 = var10006;
         var10006 = (var25 | var26) - (var25 & var26);
         var26 = -936665344;
         var25 = var10006;
         var10006 = (var25 | var26) - (var25 & var26);
         var10007 = (int)6893627255263022294L;
         var26 = -228457283;
         var25 = var10007;
         var10007 = (var25 | var26) & (~var25 | ~var26);
         var26 = 1521380800;
         var25 = var10007;
         var26 = var25 + var26 - 2 * (var25 & var26);
         var25 = var10006;
         var10006 = 2 * (var25 | var26) - (var25 ^ var26);
         var26 = -1963595037;
         var25 = -595777457;
         var10006 = var25 + var26 - 2 * (var25 & var26);
         var26 = 1451324407;
         var25 = var10006;
         var16.a(
            a(
               "搽\uf4f3搙\uf48d搓\uf4f5搚\uf4fd摥\uf486",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁼ꤄絤蹁⑿謥㑤=\ua7cb꒴ꁣꤎ絳蹘\u245f謳㑾f\ua7e9꒧ꁁ꤄絸蹏⑶",
               var10003,
               var10004,
               var470,
               var25 & ~var26 | ~var25 & var26
            ),
            var17,
            var19 - var23,
            var22,
            var1
         );
         var19 += var24;
         this.t.a(var1, var2, var17, var19, var18, var7, var8, var9);
         float var355 = CoordinateInputPanel.e();
         int var390 = (int)3848220656006528428L;
         var26 = 814275906;
         var25 = var390;
         int var391 = (var25 | var26) & ~(var25 & var26);
         var26 = -1836221008;
         var25 = var391;
         int var392 = (var25 | var26) & ~(var25 & var26);
         var10003 = (int)4859451943409650248L;
         var26 = -1851114662;
         var25 = var10003;
         var10003 = (var25 | var26) & ~(var25 & var26);
         var26 = 1207114834;
         var25 = var10003;
         var26 = (var25 | var26) & (~var25 | ~var26);
         var25 = var392;
         int var393 = var25 - ~var26 - 1;
         float var356 = var355 + 5.0F;
         int var394 = (int)2013422861828677065L;
         var26 = 724408873;
         var25 = var394;
         int var395 = (var25 | var26) & (~var25 | ~var26);
         var26 = 625770834;
         var25 = var395;
         int var396 = (var25 & ~var26 | ~var25 & var26) * (var25 & ~var26 | ~var25 & var26);
         var19 += var356 + 5.0F;
         var26 = 1453107985;
         var25 = -809506260;
         int var397 = var25 & ~var26 | ~var25 & var26;
         var26 = -1725742798;
         var25 = var397;
         int var398 = var25 & ~var26 | ~var25 & var26;
         int var399 = (int)4135977344479422132L;
         var26 = -295669423;
         var25 = var399;
         int var400 = (var25 | var26) & ~(var25 & var26);
         var26 = -1365108761;
         var25 = var400;
         int var401 = var25 & ~var26 | ~var25 & var26;
         var26 = -1759548277;
         var25 = -667001615;
         int var402 = (var25 | var26) & (~var25 | ~var26);
         var26 = -1784372499;
         var25 = var402;
         int var403 = var25 + var26 - 2 * (var25 & var26);
         var10003 = (int)3933275433962264448L;
         var26 = -1194201772;
         var25 = var10003;
         var10003 = var25 & ~var26 | ~var25 & var26;
         var26 = -298616444;
         var25 = var10003;
         var10003 = ((var25 | var26) - (var25 & var26)) * ((var25 | var26) - (var25 & var26));
         var26 = 1627363272;
         var25 = 1492280687;
         var10003 = (var25 | var26) & (~var25 | ~var26);
         var26 = 1522914070;
         var25 = var10003;
         var10003 = (var25 | var26) & ~(var25 & var26);
         String var451 = "dtb";
         var26 = -1729517068;
         var25 = 232544594;
         var10004 = var25 & ~var26 | ~var25 & var26;
         var26 = -1104585385;
         var25 = var10004;
         var10004 = (var25 | var26) & (~var25 | ~var26);
         int var471 = (int)3495171504856250240L;
         var26 = -621010940;
         var25 = var471;
         int var472 = var25 + var26 - 2 * (var25 & var26);
         var26 = -1033226262;
         var25 = var472;
         int var473 = var25 + var26 - 2 * (var25 & var26);
         var26 = 981445685;
         var25 = -1246084001;
         int var474 = (var25 | var26) - (var25 & var26);
         var26 = -1773367724;
         var25 = var474;
         int var475 = (var25 | var26) & (~var25 | ~var26);
         var10007 = (int)-935004989282970166L;
         var26 = 368359998;
         var25 = var10007;
         var10007 = (var25 | var26) & (~var25 | ~var26);
         var26 = -1821986823;
         var25 = var10007;
         var10007 = var25 & ~var26 | ~var25 & var26;
         var26 = -1662835115;
         var25 = 1217803859;
         var10007 = var25 + var26 - 2 * (var25 & var26);
         var26 = -730525689;
         var25 = var10007;
         var10007 = (var25 | var26) & (~var25 | ~var26);
         var26 = 1661022578;
         var25 = -2109667887;
         var10007 = (var25 | var26) - (var25 & var26);
         var26 = -515885905;
         var25 = var10007;
         var10007 = (var25 | var26) - (var25 & var26);
         var10007 = (int)2488666773768040605L;
         var26 = -921460411;
         var25 = var10007;
         var10007 = (var25 | var26) - (var25 & var26);
         var26 = 265376220;
         var25 = var10007;
         var10007 = (var25 | var26) - (var25 & var26);
         var26 = 85837717;
         var25 = -137627225;
         var10006 = (var25 | var26) & (~var25 | ~var26);
         var26 = -220236648;
         var25 = var10006;
         var16.a(
            a(
               "搿༆搙༁搝༌",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁼ꤄絤蹁⑿謥㑤=\ua7cb꒴ꁣꤎ絳蹘\u245f謳㑾f\ua7e9꒧ꁁ꤄絸蹏⑶",
               var10003,
               var10004,
               var475,
               var25 & ~var26 | ~var25 & var26
            ),
            var17,
            var19 - var23,
            var22,
            var1
         );
         var19 += var24;
         this.u.a(var1, var2, var17, var19, var18, var7, var8, var9);
      }
   }

   private void a(MatrixStack var1, Renderer2D var2, float var3, float var4, int var5, int var6, float var7) {
      int var8;
      boolean var9;
      int var172;
      label48: {
         int var22 = -1967083463;
         int var21 = -19238261;
         var172 = (var21 | var22) - (var21 & var22);
         var22 = -419342363;
         var21 = var172;
         var172 = var21 & ~var22 | ~var21 & var22;
         var22 = -485898320;
         var21 = 286501508;
         int var10001 = (var21 | var22) & (~var21 | ~var22);
         var22 = -1509808407;
         var21 = var10001;
         var22 = var21 & ~var22 | ~var21 & var22;
         var21 = var172;
         var172 = var21 - ~var22 - 1;
         var8 = (int)(255.0F * var7);
         var9 = pulse.GuiInteractionState.a().b();
         if (!var9) {
            int var10002 = (int)4460823545046033202L;
            var22 = -1263857855;
            var21 = var10002;
            var10002 = (var21 | var22) - (var21 & var22);
            var22 = 845774387;
            var21 = var10002;
            var10002 = ((var21 | var22) & ~(var21 & var22)) * ((var21 | var22) & ~(var21 & var22));
            String var10003 = "dtc";
            if (GuiInput.a(var3, var4, 13.5F, 13.5F, var5, var6)) {
               var22 = -1390302533;
               var21 = -445809921;
               var172 = (var21 | var22) & ~(var21 & var22);
               var22 = 1212993605;
               var21 = var172;
               var172 = (var21 | var22) - (var21 & var22);
               break label48;
            }
         }

         var172 = (int)-8971174422570349583L;
         var22 = 784019106;
         var21 = var172;
         var172 = var21 & ~var22 | ~var21 & var22;
         var22 = -232463021;
         var21 = var172;
         var172 = (var21 | var22) & ~(var21 & var22);
      }

      int var10;
      label43: {
         var10 = var172;
         if (var9) {
            if (this.w) {
               int var107 = -276114171;
               int var36 = 359335751;
               int var194 = var36 + var107 - 2 * (var36 & var107);
               var107 = -1730584306;
               var36 = var194;
               var194 = (var36 | var107) & ~(var36 & var107);
               this.v.a(0.0, 0.15, pulse.Easing.h);
               int var177 = (int)5413751386641951544L;
               var107 = 1475628344;
               var36 = var177;
               var177 = var36 & ~var107 | ~var36 & var107;
               var107 = -1192876544;
               var36 = var177;
               this.w = pulse.Bool.from((var36 | var107) - (var36 & var107));
               break label43;
            }

            if (a != a) {
               throw new RuntimeException();
            }
         }

         if (!var9 && pulse.Bool.from(var10) != this.w) {
            double var176 = var10 == 0 ? 0.0 : 1.0;
            String var193 = "dtd";
            this.v.a(var176, 0.15, pulse.Easing.h);
            this.w = pulse.Bool.from(var10);
         }
      }

      float var11 = (float)this.v.j();
      Color var12 = pulse.Theme.b(pulse.Theme.q, var7);
      Color var13 = pulse.Theme.b(pulse.Theme.n, var7);
      int var111 = -1609541941;
      int var40 = 292098032;
      int var196 = (var40 | var111) & (~var40 | ~var111);
      var111 = -741296979;
      var40 = var196;
      var196 = (var40 | var111) - (var40 & var111);
      var111 = -1466585485;
      var40 = 2053002404;
      int var204 = (var40 | var111) & ~(var40 & var111);
      var111 = -1634904975;
      var40 = var204;
      var111 = var40 + var111 - 2 * (var40 & var111);
      var40 = var196;
      var196 = (var40 | var111) + (var40 & var111);
      float var179 = var3 - 0.5F;
      String var205 = "dte";
      float var199 = var4 - 0.5F;
      var204 = (int)-1226200610888068112L;
      var111 = 1186114228;
      var40 = var204;
      var204 = var40 + var111 - 2 * (var40 & var111);
      var111 = -1310415349;
      var40 = var204;
      var204 = (var40 | var111) & (~var40 | ~var111);
      int var10004 = (int)6897271967173264735L;
      var111 = -1890366401;
      var40 = var10004;
      var10004 = (var40 | var111) - (var40 & var111);
      var111 = 387317723;
      var40 = var10004;
      var111 = (var40 | var111) - (var40 & var111);
      var40 = var204;
      var204 = 2 * (var40 | var111) - (var40 ^ var111);
      String var213 = "dtf";
      var111 = -1079508022;
      var40 = 924489728;
      int var10006 = (var40 | var111) & (~var40 | ~var111);
      var111 = -2001560633;
      var40 = var10006;
      var10006 = (var40 | var111) - (var40 & var111);
      var2.a(var179, var199, 14.5F, 14.5F, 4.0F, var12, var12, var13, var13, var1);
      Color var14 = ColorUtils.a(pulse.Theme.f, p, var11);
      Color var15 = ColorUtils.a(pulse.Theme.e, q, var11);
      var14 = pulse.Theme.a(var14, var8);
      var15 = pulse.Theme.a(var15, var8);
      var111 = 1362074333;
      var40 = -1815788028;
      var10004 = (var40 | var111) & ~(var40 & var111);
      var111 = -1024795437;
      var40 = var10004;
      var10004 = (var40 | var111) - (var40 & var111);
      var111 = -2047912842;
      var40 = -1296119403;
      var10004 = (var40 | var111) & (~var40 | ~var111);
      var111 = 928095728;
      var40 = var10004;
      var10004 = (var40 | var111) & ~(var40 & var111);
      var10004 = (int)793487334740870017L;
      var111 = -545346981;
      var40 = var10004;
      var10004 = var40 + var111 - 2 * (var40 & var111);
      var111 = 191584789;
      var40 = var10004;
      var10004 = var40 + var111 - 2 * (var40 & var111);
      int var10005 = (int)-7637490240078836783L;
      var111 = 482383715;
      var40 = var10005;
      var10005 = var40 + var111 - 2 * (var40 & var111);
      var111 = 671586582;
      var40 = var10005;
      var111 = var40 & ~var111 | ~var40 & var111;
      var40 = var10004;
      var10004 = (var40 & ~var111) + (var111 & ~var40) + 2 * (var40 & var111);
      var111 = 1822328464;
      var40 = -436357858;
      var10005 = (var40 | var111) & (~var40 | ~var111);
      var111 = -2091482599;
      var40 = var10005;
      var10005 = (var40 + var111 - 2 * (var40 & var111)) * (var40 + var111 - 2 * (var40 & var111));
      var2.a(var3, var4, 13.5F, 13.5F, 4.0F, var14, var14, var15, var15, var1);
      Color var16 = ColorUtils.a(pulse.Theme.b, pulse.Theme.Z, var11);
      var16 = pulse.Theme.a(var16, var8);
      int var180 = (int)-5842996599824936915L;
      var111 = 1974854523;
      var40 = var180;
      int var181 = (var40 | var111) & (~var40 | ~var111);
      var111 = -1104448679;
      var40 = var181;
      FontRenderer var17 = FontManager.e[var40 + var111 - 2 * (var40 & var111)];
      String var174 = "dtg";
      float var18 = 8.0F;
      var111 = 571329163;
      var40 = -516228202;
      int var182 = (var40 | var111) - (var40 & var111);
      var111 = -580024143;
      var40 = var182;
      int var183 = var40 & ~var111 | ~var40 & var111;
      float var19 = var3 + (13.5F - var18) / 2.0F;
      var111 = 970378633;
      var40 = -85360842;
      int var184 = (var40 | var111) - (var40 & var111);
      var111 = -1876207491;
      var40 = var184;
      int var185 = var40 & ~var111 | ~var40 & var111;
      float var175 = var4 + (13.5F - var18) / 2.0F;
      var111 = -692147539;
      var40 = -927012870;
      int var186 = var40 & ~var111 | ~var40 & var111;
      var111 = 1723381789;
      var40 = var186;
      int var187 = (var40 | var111) - (var40 & var111);
      var111 = 1886783668;
      var40 = -1806149792;
      var196 = var40 & ~var111 | ~var40 & var111;
      var111 = -1698256129;
      var40 = var196;
      var111 = (var40 | var111) - (var40 & var111);
      var40 = var187;
      int var188 = (var40 ^ var111) + 2 * (var40 & var111);
      float var20 = var175 - 0.5F;
      var111 = -566265399;
      var40 = -1065752576;
      int var189 = (var40 | var111) - (var40 & var111);
      var111 = 1086602812;
      var40 = var189;
      int var190 = ((var40 | var111) & ~(var40 & var111)) * ((var40 | var111) & ~(var40 & var111));
      var196 = (int)6597956011945317268L;
      var111 = -1789147982;
      var40 = var196;
      var196 = (var40 | var111) - (var40 & var111);
      var111 = -54151778;
      var40 = var196;
      var196 = ((var40 | var111) & (~var40 | ~var111)) * ((var40 | var111) & (~var40 | ~var111));
      var10004 = (int)-3560047376233963820L;
      var111 = 75238935;
      var40 = var10004;
      var10004 = (var40 | var111) & (~var40 | ~var111);
      var111 = -260091696;
      var40 = var10004;
      var10004 = (var40 | var111) & (~var40 | ~var111);
      var10004 = (int)-8333202143185951410L;
      var111 = 135382838;
      var40 = var10004;
      var10004 = var40 + var111 - 2 * (var40 & var111);
      var111 = 1173447290;
      var40 = var10004;
      var10004 = (var40 | var111) - (var40 & var111);
      var111 = 1742247582;
      var40 = -1364677977;
      var10004 = (var40 | var111) - (var40 & var111);
      var111 = -915391427;
      var40 = var10004;
      var10004 = (var40 | var111) - (var40 & var111);
      var111 = 1959988210;
      var40 = 321829239;
      var204 = var40 & ~var111 | ~var40 & var111;
      var111 = 87397172;
      var40 = var204;
      var204 = (var40 | var111) & ~(var40 & var111);
      String var230 = "dth";
      var111 = -1180155620;
      var40 = 1979717433;
      var10004 = (var40 | var111) - (var40 & var111);
      var111 = 403516047;
      var40 = var10004;
      var10004 = (var40 | var111) - (var40 & var111);
      var10005 = (int)8616523624188663442L;
      var111 = 2047510503;
      var40 = var10005;
      var10005 = (var40 | var111) & (~var40 | ~var111);
      var111 = -1985409880;
      var40 = var10005;
      var10005 = (var40 | var111) & (~var40 | ~var111);
      var10006 = (int)-5617734464330272159L;
      var111 = -1520055568;
      var40 = var10006;
      var10006 = (var40 | var111) & ~(var40 & var111);
      var111 = 1392469755;
      var40 = var10006;
      var111 = var40 + var111 - 2 * (var40 & var111);
      var40 = var10005;
      var10005 = (var40 | var111) + (var40 & var111);
      var111 = 1858057799;
      var40 = 222548184;
      var10005 = (var40 | var111) & ~(var40 & var111);
      var111 = 1829653820;
      var40 = var10005;
      var10005 = (var40 | var111) & (~var40 | ~var111);
      String var245 = "dti";
      var10006 = (int)5082133193705407857L;
      var111 = -1422194301;
      var40 = var10006;
      var10006 = var40 + var111 - 2 * (var40 & var111);
      var111 = 187188596;
      var40 = var10006;
      var17.a(
         a("駦", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁼ꤄絤蹁⑿謥㑤=\ua7cb꒴ꁣꤎ絳蹘\u245f謳㑾f\ua7e9꒧ꁁ꤄絸蹏⑶", var204, var10004, var10005, var40 + var111 - 2 * (var40 & var111)),
         var19,
         var20,
         var16,
         var1
      );
      if (var10 != 0 && !var9) {
         GuiInput.g();
      }
   }

   private void a(MatrixStack var1, Renderer2D var2, float var3, float var4, float var5, int var6, int var7, float var8) {
      int var19 = 358123293;
      int var18 = -293799125;
      int var10000 = var18 & ~var19 | ~var18 & var19;
      var19 = 654450138;
      var18 = var10000;
      var10000 = (var18 | var19) & (~var18 | ~var19);
      var19 = 1963684663;
      var18 = -26386540;
      int var10001 = (var18 | var19) & (~var18 | ~var19);
      var19 = -1776687110;
      var18 = var10001;
      var19 = var18 + var19 - 2 * (var18 & var19);
      var18 = var10000;
      var10000 = (var18 & ~var19) + (var19 & ~var18) + 2 * (var18 & var19);
      int var9 = (int)(255.0F * var8);
      var19 = -867926058;
      var18 = 735781555;
      var10001 = var18 + var19 - 2 * (var18 & var19);
      var19 = -870048555;
      var18 = var10001;
      var10001 = (var18 | var19) - (var18 & var19);
      int var10002 = (int)-2345578703478578067L;
      var19 = -399395927;
      var18 = var10002;
      var10002 = (var18 | var19) & ~(var18 & var19);
      var19 = 1935070095;
      var18 = var10002;
      var19 = var18 & ~var19 | ~var18 & var19;
      var18 = var10001;
      var10001 = var18 - ~var19 - 1;
      float var118 = var5 - 19.5F;
      var19 = -1973310829;
      var18 = 958410361;
      var10002 = (var18 | var19) - (var18 & var19);
      var19 = -1287551775;
      var18 = var10002;
      var10002 = var18 & ~var19 | ~var18 & var19;
      var19 = 607823498;
      var18 = 708373349;
      var10002 = (var18 | var19) & (~var18 | ~var19);
      var19 = 235032044;
      var18 = var10002;
      var10002 = (var18 | var19) - (var18 & var19);
      float var10 = var118 - 8.0F;
      var19 = -1508509647;
      var18 = -925282244;
      int var10006 = (var18 | var19) & (~var18 | ~var19);
      var19 = -277533017;
      var18 = var10006;
      var10006 = (var18 | var19) & ~(var18 & var19);
      int var10007 = (int)-4195215478074263632L;
      var19 = 1838247039;
      var18 = var10007;
      var10007 = var18 & ~var19 | ~var18 & var19;
      var19 = 389291049;
      var18 = var10007;
      var19 = var18 + var19 - 2 * (var18 & var19);
      var18 = var10006;
      var10006 = var18 - ~var19 - 1;
      this.s.a(var1, var2, var3, var4, var10, 22.0F, var6, var7, var8);
      float var124 = var3 + var10;
      String var134 = "dtj";
      this.y = var124 + 8.0F;
      var10002 = (int)-8586390550923689216L;
      var19 = -1801434471;
      var18 = var10002;
      var10002 = var18 & ~var19 | ~var18 & var19;
      var19 = 1829343746;
      var18 = var10002;
      var10002 = (var18 | var19) - (var18 & var19);
      var19 = -420847109;
      var18 = 622663817;
      int var10003 = var18 + var19 - 2 * (var18 & var19);
      var19 = 532759733;
      var18 = var10003;
      var19 = (var18 | var19) & (~var18 | ~var19);
      var18 = var10002;
      var10002 = (var18 & ~var19) + (var19 & ~var18) + 2 * (var18 & var19);
      this.z = var4 + 1.25F;
      Color var11 = this.r.e();
      Color var12 = pulse.Theme.a(var11, var9);
      var10001 = (int)4661849312295831323L;
      var19 = 1993837524;
      var18 = var10001;
      var10001 = (var18 | var19) & (~var18 | ~var19);
      var19 = -1994568615;
      var18 = var10001;
      Color var13 = pulse.Theme.c(var12, (var18 | var19) - (var18 & var19));
      var19 = -1024165361;
      var18 = 262257073;
      var10001 = (var18 | var19) - (var18 & var19);
      var19 = -850017318;
      var18 = var10001;
      Color var14 = pulse.Theme.c(var12, var18 & ~var19 | ~var18 & var19);
      String var139 = "dtk";
      float var128 = this.y - 0.5F;
      var19 = 643048312;
      var18 = -1657160431;
      var10003 = var18 & ~var19 | ~var18 & var19;
      var19 = 934590624;
      var18 = var10003;
      var10003 = ((var18 | var19) & ~(var18 & var19)) * ((var18 | var19) & ~(var18 & var19));
      float var140 = this.z - 0.5F;
      var19 = 674234863;
      var18 = -1483811819;
      var10003 = (var18 | var19) & (~var18 | ~var19);
      var19 = -1936399607;
      var18 = var10003;
      var10003 = ((var18 | var19) - (var18 & var19)) * ((var18 | var19) - (var18 & var19));
      var19 = 481995811;
      var18 = -1525602069;
      int var10005 = var18 + var19 - 2 * (var18 & var19);
      var19 = -1179941688;
      var18 = var10005;
      var10005 = var18 & ~var19 | ~var18 & var19;
      var10005 = (int)-6209774441740177346L;
      var19 = -2134289488;
      var18 = var10005;
      var10005 = (var18 | var19) & (~var18 | ~var19);
      var19 = 1208984477;
      var18 = var10005;
      var10005 = var18 + var19 - 2 * (var18 & var19);
      var19 = 848006472;
      var18 = -2026243689;
      var10005 = var18 + var19 - 2 * (var18 & var19);
      var19 = -1246595889;
      var18 = var10005;
      var10005 = (var18 | var19) & (~var18 | ~var19);
      var19 = -1124682013;
      var18 = -252829012;
      var10005 = var18 & ~var19 | ~var18 & var19;
      var19 = 1159657941;
      var18 = var10005;
      var10005 = (var18 & ~var19 | ~var18 & var19) * (var18 & ~var19 | ~var18 & var19);
      var2.a(var128, var140, 20.5F, 20.5F, 7.0F, var12, var12, var14, var14, var1);
      var10003 = (int)3764136749335114806L;
      var19 = 583420721;
      var18 = var10003;
      var10003 = (var18 | var19) & (~var18 | ~var19);
      var19 = 303871913;
      var18 = var10003;
      var10003 = (var18 | var19) & (~var18 | ~var19);
      var19 = -1808780783;
      var18 = -1972010740;
      int var10004 = var18 + var19 - 2 * (var18 & var19);
      var19 = -1413796178;
      var18 = var10004;
      var19 = var18 + var19 - 2 * (var18 & var19);
      var18 = var10003;
      var10003 = (var18 ^ var19) + 2 * (var18 & var19);
      var10004 = (int)-2149153589492624598L;
      var19 = -873747909;
      var18 = var10004;
      var10004 = (var18 | var19) & (~var18 | ~var19);
      var19 = -1038454532;
      var18 = var10004;
      var10004 = ((var18 | var19) - (var18 & var19)) * ((var18 | var19) - (var18 & var19));
      String var162 = "dtl";
      var2.a(this.y, this.z, 19.5F, 19.5F, 6.5F, var12, var12, var13, var13, var1);
      boolean var15 = pulse.GuiInteractionState.a().b();
      if (var15) {
         if (b) {
            String var119 = "dtm";
            var19 = -2039980762;
            var18 = -1917155378;
            var10000 = var18 + var19 - 2 * (var18 & var19);
            var19 = -931000767;
            var18 = var10000;
            int var17 = (var18 | var19) - (var18 & var19);
            a = var17;
         }
      } else {
         String var141 = "dtn";
         String var150 = "dto";
         if (GuiInput.a(this.y, this.z, 19.5F, 19.5F, var6, var7)) {
            GuiInput.g();
         }
      }
   }

   public void a(MatrixStack var1, Renderer2D var2, int var3, int var4, float var5) {
      pulse.ColorPickerPopup.a().a(var1, var2, var3, var4, var5);
   }

   public boolean a(float var1, float var2, float var3, float var4, int var5, int var6) {
      if (this.r == null) {
         int var190 = (int)1402327155772769744L;
         int var155 = -828548433;
         int var84 = var190;
         var190 = (var84 | var155) - (var84 & var155);
         var155 = -2077941889;
         var84 = var190;
         return pulse.Bool.from((var84 | var155) & (var84 & var155 ^ -1));
      }

      float var10000 = var1 + var3;
      String var10001 = "dtp";
      var10000 -= 8.0F;
      int var192 = (int)-5694762901380162613L;
      int var14 = -1508911408;
      int var13 = var192;
      int var193 = (var13 | var14) & (~var13 | ~var14);
      var14 = -424617840;
      var13 = var193;
      int var194 = ((var13 | var14) & (~var13 | ~var14)) * ((var13 | var14) & (~var13 | ~var14));
      float var7 = var10000 - 13.5F;
      var10001 = "dtq";
      float var8 = var2 + 8.0F - 2.0F;
      String var10002 = "dtr";
      int var10003 = (int)-7173821899225753530L;
      var14 = 1635952611;
      var13 = var10003;
      var10003 = (var13 | var14) & (~var13 | ~var14);
      var14 = 92582360;
      var13 = var10003;
      var10003 = ((var13 | var14) & (~var13 | ~var14)) * ((var13 | var14) & (~var13 | ~var14));
      if (!GuiInput.a(var7, var8, 13.5F, 13.5F, var5, var6)) {
         var10002 = "dts";
         var14 = 1280832782;
         var13 = 1148496601;
         var10003 = (var13 | var14) & ~(var13 & var14);
         var14 = 104026121;
         var13 = var10003;
         var10003 = (var13 | var14) - (var13 & var14);
         var14 = 2103287788;
         var13 = 1304842073;
         int var10004 = (var13 | var14) & (~var13 | ~var14);
         var14 = -1827229288;
         var13 = var10004;
         var14 = (var13 | var14) - (var13 & var14);
         var13 = var10003;
         var10003 = var13 - ~var14 - 1;
         if (!GuiInput.a(this.y, this.z, 19.5F, 19.5F, var5, var6)) {
            String var161 = "dtt";
            int var162 = (int)6967295245197205790L;
            var14 = -1495065253;
            var13 = var162;
            int var163 = var13 + var14 - 2 * (var13 & var14);
            var14 = -367440822;
            var13 = var163;
            int var12 = var13 + var14 - 2 * (var13 & var14);
            a = var12;
            var14 = 373091438;
            var13 = -152840322;
            int var164 = var13 & ~var14 | ~var13 & var14;
            var14 = -1471023989;
            var13 = var164;
            int var165 = (var13 | var14) - (var13 & var14);
            int var196 = (int)-2780912226129339567L;
            var14 = 1229763096;
            var13 = var196;
            int var197 = (var13 | var14) & ~(var13 & var14);
            var14 = 2139467963;
            var13 = var197;
            var14 = (var13 | var14) - (var13 & var14);
            var13 = var165;
            int var166 = (var13 & ~var14) + (var14 & ~var13) + 2 * (var13 & var14);
            int var167 = (int)-6287898922740318240L;
            var14 = -196456108;
            var13 = var167;
            int var168 = (var13 | var14) & (~var13 | ~var14);
            var14 = 745687436;
            var13 = var168;
            if (((var13 | var14) & ~(var13 & var14)) <= a) {
               throw new ExceptionInInitializerError();
            }

            if (this.x && pulse.ColorPickerPopup.a().a(var5, var6)) {
               var14 = -465879751;
               var13 = 961439135;
               int var189 = (var13 | var14) & (~var13 | ~var14);
               var14 = -579512153;
               var13 = var189;
               return pulse.Bool.from((var13 | var14) & (var13 & var14 ^ -1));
            }

            if (!this.b()) {
               int var222 = (int)-1256971312389027515L;
               var14 = 1097222524;
               var13 = var222;
               int var223 = var13 + var14 - 2 * (var13 & var14);
               var14 = 156516412;
               var13 = var223;
               int var224 = var13 + var14 - 2 * (var13 & var14);
               int var225 = (int)2157296269276368610L;
               var14 = 934303303;
               var13 = var225;
               int var226 = var13 + var14 - 2 * (var13 & var14);
               var14 = -624027483;
               var13 = var226;
               int var227 = (var13 | var14) & (~var13 | ~var14);
               int var228 = (int)-1959534197954207038L;
               var14 = -640293463;
               var13 = var228;
               int var229 = var13 & ~var14 | ~var13 & var14;
               var14 = -1268758674;
               var13 = var229;
               int var230 = (var13 | var14) - (var13 & var14);
               float var9 = var1 + 8.0F;
               if (!this.s.a(var5, var6)) {
                  if (!this.t.a(var5, var6)) {
                     var14 = -114506344;
                     var13 = -2015001896;
                     int var198 = (var13 | var14) & (~var13 | ~var14);
                     var14 = 1671513972;
                     var13 = var198;
                     int var199 = var13 & ~var14 | ~var13 & var14;
                     int var231 = (int)-2156113304863534522L;
                     var14 = -1268461207;
                     var13 = var231;
                     int var232 = var13 & ~var14 | ~var13 & var14;
                     var14 = 2062915207;
                     var13 = var232;
                     var14 = (var13 | var14) & ~(var13 & var14);
                     var13 = var199;
                     int var200 = 2 * (var13 | var14) - (var13 ^ var14);
                     var10000 = var2 + 8.0F;
                     int var201 = (int)-8482691520487387337L;
                     var14 = 1315386288;
                     var13 = var201;
                     int var202 = var13 + var14 - 2 * (var13 & var14);
                     var14 = -837497718;
                     var13 = var202;
                     int var203 = ((var13 | var14) & ~(var13 & var14)) * ((var13 | var14) & ~(var13 & var14));
                     var10000 += 10.0F;
                     var14 = 440091857;
                     var13 = -1398441603;
                     int var204 = var13 + var14 - 2 * (var13 & var14);
                     var14 = 1687714130;
                     var13 = var204;
                     int var205 = ((var13 | var14) - (var13 & var14)) * ((var13 | var14) - (var13 & var14));
                     var10000 += 5.0F;
                     int var206 = (int)1397150440966368215L;
                     var14 = -1350610115;
                     var13 = var206;
                     int var207 = var13 + var14 - 2 * (var13 & var14);
                     var14 = 1916543910;
                     var13 = var207;
                     int var208 = var13 + var14 - 2 * (var13 & var14);
                     var10000 += 5.0F;
                     var10001 = "dtu";
                     var10000 += 10.0F;
                     var14 = 1455691054;
                     var13 = 249416472;
                     int var210 = (var13 | var14) - (var13 & var14);
                     var14 = 1812922206;
                     var13 = var210;
                     int var211 = var13 & ~var14 | ~var13 & var14;
                     var10000 += 22.0F;
                     var14 = -716564448;
                     var13 = 1436711061;
                     int var212 = (var13 | var14) & ~(var13 & var14);
                     var14 = 1696993740;
                     var13 = var212;
                     int var213 = (var13 | var14) - (var13 & var14);
                     int var233 = (int)7346309234560221545L;
                     var14 = -1610841195;
                     var13 = var233;
                     int var234 = (var13 | var14) - (var13 & var14);
                     var14 = 1731085685;
                     var13 = var234;
                     var14 = (var13 | var14) & ~(var13 & var14);
                     var13 = var213;
                     int var214 = (var13 ^ var14) + 2 * (var13 & var14);
                     var10000 += 5.0F;
                     var10001 = "dtv";
                     var10000 += 5.0F;
                     var10001 = "dtw";
                     var10000 = var10000 + 10.0F + CoordinateInputPanel.e();
                     var14 = -2042720234;
                     var13 = -1255070103;
                     int var217 = (var13 | var14) - (var13 & var14);
                     var14 = -57292593;
                     var13 = var217;
                     int var218 = (var13 + var14 - 2 * (var13 & var14)) * (var13 + var14 - 2 * (var13 & var14));
                     var10000 += 5.0F;
                     var14 = -2107935444;
                     var13 = -2040245158;
                     int var219 = (var13 | var14) & (~var13 | ~var14);
                     var14 = -1701714002;
                     var13 = var219;
                     int var220 = ((var13 | var14) & ~(var13 & var14)) * ((var13 | var14) & ~(var13 & var14));
                     var10000 += 5.0F;
                     int var235 = (int)5234515211209296928L;
                     var14 = -722815725;
                     var13 = var235;
                     int var236 = var13 & ~var14 | ~var13 & var14;
                     var14 = 57211197;
                     var13 = var236;
                     int var237 = var13 & ~var14 | ~var13 & var14;
                     int var238 = (int)-8343171618856433320L;
                     var14 = -1303200791;
                     var13 = var238;
                     int var239 = (var13 | var14) & (~var13 | ~var14);
                     var14 = 1872999098;
                     var13 = var239;
                     int var240 = (var13 | var14) & ~(var13 & var14);
                     var14 = 614246828;
                     var13 = 844982852;
                     int var241 = (var13 | var14) - (var13 & var14);
                     var14 = 381797370;
                     var13 = var241;
                     int var242 = (var13 | var14) & (~var13 | ~var14);
                     int var243 = (int)1192584125078666563L;
                     var14 = 2085278406;
                     var13 = var243;
                     int var244 = (var13 | var14) & ~(var13 & var14);
                     var14 = 140488598;
                     var13 = var244;
                     int var245 = (var13 | var14) & ~(var13 & var14);
                     float var10 = var10000 + 10.0F;
                     if (!this.u.a(var9, var10, var5, var6)) {
                        var14 = 261338254;
                        var13 = 1264026348;
                        int var188 = (var13 | var14) & (~var13 | ~var14);
                        var14 = 1153709666;
                        var13 = var188;
                        return pulse.Bool.from(var13 + var14 - 2 * (var13 & var14));
                     } else {
                        int var186 = (int)6489397610050825663L;
                        var14 = -1138935067;
                        var13 = var186;
                        int var187 = (var13 | var14) - (var13 & var14);
                        var14 = -985393317;
                        var13 = var187;
                        return pulse.Bool.from(var13 + var14 - 2 * (var13 & var14));
                     }
                  } else {
                     int var173 = (int)-2721941454886300405L;
                     var14 = 262051332;
                     var13 = var173;
                     int var174 = (var13 | var14) & (~var13 | ~var14);
                     var14 = 495518478;
                     var13 = var174;
                     return pulse.Bool.from((var13 | var14) - (var13 & var14));
                  }
               } else {
                  int var171 = (int)6062763107095355786L;
                  var14 = 538580664;
                  var13 = var171;
                  int var172 = var13 + var14 - 2 * (var13 & var14);
                  var14 = -1411827917;
                  var13 = var172;
                  return pulse.Bool.from((var13 | var14) & (var13 ^ -1 | var14 ^ -1));
               }
            } else {
               int var169 = (int)-6729776406672243999L;
               var14 = 756711467;
               var13 = var169;
               int var170 = var13 + var14 - 2 * (var13 & var14);
               var14 = -1150975286;
               var13 = var170;
               return pulse.Bool.from((var13 | var14) & (var13 & var14 ^ -1));
            }
         } else {
            if (!this.x) {
               this.g();
            } else {
               this.c();
            }

            var14 = 95859107;
            var13 = 1329806067;
            int var160 = var13 + var14 - 2 * (var13 & var14);
            var14 = 1257605969;
            var13 = var160;
            return pulse.Bool.from((var13 | var14) - (var13 & var14));
         }
      } else {
         if (this.A != null) {
            this.A.accept(this.r);
         }

         int var158 = (int)-4155113215902514057L;
         var14 = -232195005;
         var13 = var158;
         int var159 = (var13 | var14) & ~(var13 & var14);
         var14 = -1900971979;
         var13 = var159;
         return pulse.Bool.from(var13 & (var14 ^ -1) | (var13 ^ -1) & var14);
      }
   }

   public boolean a(int var1, int var2) {
      if (this.x && pulse.ColorPickerPopup.a().c(var1, var2)) {
         this.c();
         int var11 = (int)6577814500979910615L;
         int var9 = -2135944932;
         int var6 = var11;
         var11 = var6 + var9 - 2 * (var6 & var9);
         var9 = -1713228086;
         var6 = var11;
         return pulse.Bool.from((var6 | var9) & (var6 ^ -1 | var9 ^ -1));
      } else {
         int var4 = 2141680627;
         int var3 = 1995253244;
         int var10000 = (var3 | var4) & (~var3 | ~var4);
         var4 = 155866639;
         var3 = var10000;
         return pulse.Bool.from(var3 + var4 - 2 * (var3 & var4));
      }
   }

   private void g() {
      int var10001 = (int)-2529784864216875857L;
      int var4 = 913790193;
      int var3 = var10001;
      var10001 = (var3 | var4) - (var3 & var4);
      var4 = -196728737;
      var3 = var10001;
      this.x = pulse.Bool.from((var3 | var4) & ~(var3 & var4));
      var4 = 533672220;
      var3 = 1566784403;
      var10001 = var3 + var4 - 2 * (var3 & var4);
      var4 = -1944511809;
      var3 = var10001;
      var10001 = var3 + var4 - 2 * (var3 & var4);
      var4 = -1692273487;
      var3 = -1049480409;
      int var10002 = var3 + var4 - 2 * (var3 & var4);
      var4 = 353784964;
      var3 = var10002;
      var4 = (var3 | var4) - (var3 & var4);
      var3 = var10001;
      var10001 = var3 - ~var4 - 1;
      float var10000 = this.y + 9.75F;
      var10002 = (int)1126528616354361412L;
      var4 = -1198608310;
      var3 = var10002;
      var10002 = var3 + var4 - 2 * (var3 & var4);
      var4 = 1871937566;
      var3 = var10002;
      var10002 = (var3 | var4) - (var3 & var4);
      var4 = 494092086;
      var3 = 1873753636;
      var10002 = var3 & ~var4 | ~var3 & var4;
      var4 = 1927022850;
      var3 = var10002;
      var10002 = var3 & ~var4 | ~var3 & var4;
      int var1 = (int)(var10000 + 45.0F);
      var10000 = this.z;
      var10002 = (int)-7727909509761811988L;
      var4 = 2126881319;
      var3 = var10002;
      var10002 = var3 & ~var4 | ~var3 & var4;
      var4 = -1064494140;
      var3 = var10002;
      var10002 = var3 + var4 - 2 * (var3 & var4);
      var4 = 1188489923;
      var3 = -1294598041;
      var10002 = (var3 | var4) & ~(var3 & var4);
      var4 = -201266518;
      var3 = var10002;
      var10002 = var3 + var4 - 2 * (var3 & var4);
      var4 = -1858268404;
      var3 = 223444425;
      var10002 = var3 + var4 - 2 * (var3 & var4);
      var4 = -1670615345;
      var3 = var10002;
      var10002 = (var3 | var4) & (~var3 | ~var4);
      var10000 += 19.5F;
      var4 = -825548125;
      var3 = -835872459;
      var10001 = (var3 | var4) & (~var3 | ~var4);
      var4 = -897408455;
      var3 = var10001;
      var10001 = ((var3 | var4) - (var3 & var4)) * ((var3 | var4) - (var3 & var4));
      int var2 = (int)(var10000 - 12.0F);
      ColorPickerPopup var89 = pulse.ColorPickerPopup.a();
      float var96 = var1;
      float var109 = var2;
      pulse.ColorPickerPopup.Edge var10003 = pulse.ColorPickerPopup.Edge.RIGHT;
      var4 = 2087732107;
      var3 = -1900043879;
      int var10005 = (var3 | var4) & ~(var3 & var4);
      var4 = -221257188;
      var3 = var10005;
      var10005 = var3 + var4 - 2 * (var3 & var4);
      var4 = 1249879247;
      var3 = 1263116630;
      var10005 = var3 & ~var4 | ~var3 & var4;
      var4 = 20317579;
      var3 = var10005;
      var10005 = (var3 | var4) - (var3 & var4);
      var10005 = (int)467625092439307538L;
      var4 = -713029721;
      var3 = var10005;
      var10005 = (var3 | var4) & ~(var3 & var4);
      var4 = -1754828100;
      var3 = var10005;
      var10005 = (var3 | var4) & (~var3 | ~var4);
      var4 = -137212224;
      var3 = 949743646;
      var10005 = var3 & ~var4 | ~var3 & var4;
      var4 = -817250595;
      var3 = var10005;
      var10005 = (var3 | var4) - (var3 & var4);
      String var118 = "dtx";
      String var10006 = "dty";
      var4 = -827436118;
      var3 = 2058356296;
      int var119 = var3 + var4 - 2 * (var3 & var4);
      var4 = -690588589;
      var3 = var119;
      int var120 = var3 & ~var4 | ~var3 & var4;
      var4 = -312737941;
      var3 = 397788347;
      int var10007 = (var3 | var4) & ~(var3 & var4);
      var4 = -692546931;
      var3 = var10007;
      var10007 = (var3 | var4) - (var3 & var4);
      var4 = 623592503;
      var3 = 1842335317;
      var10007 = var3 + var4 - 2 * (var3 & var4);
      var4 = 1653498041;
      var3 = var10007;
      var10007 = var3 & ~var4 | ~var3 & var4;
      String var10008 = "dtz";
      var4 = 2040773633;
      var3 = -1323632031;
      int var124 = (var3 | var4) - (var3 & var4);
      var4 = -665448608;
      var3 = var124;
      int var125 = (var3 | var4) & (~var3 | ~var4);
      var4 = -718105437;
      var3 = 1973005023;
      int var10009 = var3 & ~var4 | ~var3 & var4;
      var4 = 2018054183;
      var3 = var10009;
      var10009 = var3 & ~var4 | ~var3 & var4;
      var4 = 1829792354;
      var3 = -1427372100;
      int var10010 = var3 + var4 - 2 * (var3 & var4);
      var4 = 818317312;
      var3 = var10010;
      var4 = var3 + var4 - 2 * (var3 & var4);
      var3 = var10009;
      var10009 = (var3 & ~var4) + (var4 & ~var3) + 2 * (var3 & var4);
      var10009 = (int)6402808829528973816L;
      var4 = -1095228517;
      var3 = var10009;
      var10009 = var3 & ~var4 | ~var3 & var4;
      var4 = 1179348576;
      var3 = var10009;
      var89.a(
         var96,
         var109,
         var10003,
         a(
            "碌㔔磗㕦碨㔘碫㕯碯\u3104磐㔖碣㕦",
            "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁼ꤄絤蹁⑿謥㑤=\ua7cb꒴ꁣꤎ絳蹘\u245f謳㑾f\ua7e9꒧ꁁ꤄絸蹏⑶",
            var120,
            var10007,
            var125,
            var3 & ~var4 | ~var3 & var4
         ),
         this.r.e(),
         1.0F,
         this::a
      );
   }

   public void c() {
      if (this.x) {
         pulse.ColorPickerPopup.a().b();
         int var2 = 1909320223;
         int var1 = 373335635;
         int var10001 = var1 & ~var2 | ~var1 & var2;
         var2 = 1737313356;
         var1 = var10001;
         this.x = pulse.Bool.from((var1 | var2) & ~(var1 & var2));
      }
   }

   public void b(int var1, int var2) {
      if (this.x) {
         pulse.ColorPickerPopup.a().b(var1, var2);
      }
   }

   public void a(int var1, int var2, double var3, double var5) {
      if (this.x) {
         pulse.ColorPickerPopup.a().a(var1, var2, var3, var5);
      }
   }

   public boolean a(int var1, int var2, int var3) {
      if (!this.s.d()) {
         if (!this.t.d()) {
            int var5 = -1559805454;
            int var4 = -1848339133;
            int var10000 = var4 & ~var5 | ~var4 & var5;
            var5 = 852743345;
            var4 = var10000;
            return pulse.Bool.from(var4 & (var5 ^ -1) | (var4 ^ -1) & var5);
         } else {
            return this.t.b(var1, var2, var3);
         }
      } else {
         return this.s.a(var1, var2, var3);
      }
   }

   public boolean a(char var1, int var2) {
      if (!this.s.d()) {
         if (!this.t.d()) {
            int var10000 = (int)2223694187261510478L;
            int var4 = 1928792068;
            int var3 = var10000;
            var10000 = var3 + var4 - 2 * (var3 & var4);
            var4 = -1708799158;
            var3 = var10000;
            return pulse.Bool.from(var3 + var4 - 2 * (var3 & var4));
         } else {
            return this.t.a(var1, var2);
         }
      } else {
         return this.s.a(var1, var2);
      }
   }

   public boolean d() {
      int var17;
      if (!this.s.d() && !this.t.d()) {
         if (a != a) {
            int var11 = 1577678064;
            int var4 = -1919302990;
            var17 = var4 + var11 - 2 * (var4 & var11);
            var11 = -745490878;
            var4 = var17;
            var17 = (var4 | var11) & ~(var4 & var11);
            var11 = -1457314761;
            var4 = -1658461121;
            int var10001 = (var4 | var11) - (var4 & var11);
            var11 = 872857608;
            var4 = var10001;
            var17 /= (var4 | var11) & (~var4 | ~var11);
         }

         var17 = (int)-4005976690334458183L;
         int var15 = -1822039882;
         int var8 = var17;
         var17 = (var8 | var15) & (~var8 | ~var15);
         var15 = 695959055;
         var8 = var17;
         var17 = (var8 | var15) - (var8 & var15);
      } else {
         int var2 = 1562916103;
         int var1 = 135604325;
         var17 = (var1 | var2) - (var1 & var2);
         var2 = 1430068579;
         var1 = var17;
         var17 = var1 & ~var2 | ~var1 & var2;
      }

      return pulse.Bool.from(var17);
   }

   public boolean e() {
      if (this.x) {
         if (pulse.ColorPickerPopup.a().c()) {
            int var21 = 570258140;
            int var10 = -209631633;
            int var32 = var10 & ~var21 | ~var10 & var21;
            var21 = -763611982;
            var10 = var32;
            var32 = (var10 | var21) - (var10 & var21);
            if (a != a) {
               int var33 = (int)-479674471084578624L;
               var21 = -1435121891;
               var10 = var33;
               var33 = var10 + var21 - 2 * (var10 & var21);
               var21 = -1824456586;
               var10 = var33;
               var33 = var10 & ~var21 | ~var10 & var21;
               var33 = (int)2440406820569028682L;
               var21 = 185738832;
               var10 = var33;
               var33 = (var10 | var21) & (~var10 | ~var21);
               var21 = 1385921777;
               var10 = var33;
               int var2 = (var10 | var21) - (var10 & var21);
               a = var2;
            }

            return pulse.Bool.from(var32);
         }

         if (a != a) {
            int var10000 = (int)-9128580240307422009L;
            int var4 = 623616539;
            int var3 = var10000;
            var10000 = var3 & ~var4 | ~var3 & var4;
            var4 = 637066972;
            var3 = var10000;
            var10000 = var3 + var4 - 2 * (var3 & var4);
            var4 = -371049008;
            var3 = 1172216852;
            int var10001 = var3 & ~var4 | ~var3 & var4;
            var4 = -1405312572;
            var3 = var10001;
            var10000 /= var3 + var4 - 2 * (var3 & var4);
         }
      }

      int var19 = 739875385;
      int var8 = -1900216019;
      int var30 = (var8 | var19) & ~(var8 & var19);
      var19 = -1566270700;
      var8 = var30;
      return pulse.Bool.from(var8 + var19 - 2 * (var8 & var19));
   }

   public static String a(String var0, String var1, int var2, int var3, int var4, int var5) {
      char[] var6 = var1.toCharArray();
      char[] var7 = new char[var6.length];
      int var18 = 1954379955;
      int var17 = 1089571506;
      int var10000 = var17 + var18 - 2 * (var17 & var18);
      var18 = 881652235;
      var17 = var10000;
      char[] var255 = new char[var17 & ~var18 | ~var17 & var18];
      var18 = -106337843;
      var17 = 1455582257;
      int var10002 = (var17 | var18) - (var17 & var18);
      var18 = -1351940612;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      int var10003 = (int)7422873626180311532L;
      var18 = 877609600;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 291033950;
      var17 = var10003;
      var255[var10002] = (char)((var17 | var18) - (var17 & var18));
      var18 = -782347812;
      var17 = -680776363;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 103971976;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -852681172;
      var17 = 232069149;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -1057479244;
      var17 = var10003;
      var255[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var10002 = (int)611079861682738919L;
      var18 = 659955483;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -1549235714;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -227978287;
      var17 = -670768358;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 711824205;
      var17 = var10003;
      var255[var10002] = (char)((var17 | var18) - (var17 & var18));
      var10002 = (int)3646345200177037164L;
      var18 = -94838893;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 190341372;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      int var10004 = (int)5863190347310541497L;
      var18 = -142874650;
      var17 = var10004;
      var10004 = (var17 | var18) - (var17 & var18);
      var18 = -1702212271;
      var17 = var10004;
      var10004 = (var17 | var18) - (var17 & var18);
      var18 = 483025702;
      var17 = -179893047;
      var10004 = (var17 | var18) - (var17 & var18);
      var18 = -376606751;
      var17 = var10004;
      var10004 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1530663977;
      var17 = 510880017;
      var10004 = (var17 | var18) - (var17 & var18);
      var18 = -1162837309;
      var17 = var10004;
      var10004 = (var17 | var18) - (var17 & var18);
      var10003 = (int)5320733419621763552L;
      var18 = -1716436745;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1420497156;
      var17 = var10003;
      var255[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var18 = 1971524579;
      var17 = -1764102538;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -480576111;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -140849888;
      var17 = 148554223;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -151599806;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1019999113;
      var17 = -447953673;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -645421477;
      var17 = var10003;
      var255[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var18 = -1224738848;
      var17 = 319794880;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1510975195;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 1362338580;
      var17 = 781256542;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 2141381064;
      var17 = var10003;
      var255[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var18 = 879140611;
      var17 = -327994239;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -669668476;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -213053701;
      var17 = -528297125;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 332387507;
      var17 = var10003;
      var255[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var10002 = (int)-1538406734508703325L;
      var18 = -1906387096;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 1138005708;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var10003 = (int)443657150610696668L;
      var18 = -1792970186;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 1696018376;
      var17 = var10003;
      var255[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var18 = -328406892;
      var17 = 978571635;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -700499473;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1355732529;
      var17 = 584362531;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 1914336321;
      var17 = var10003;
      var255[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var18 = -847588802;
      var17 = -1618989557;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 1392180284;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 1313195662;
      var17 = -539548993;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -1852644587;
      var17 = var10003;
      var255[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      char[] var8 = var255;
      var10000 = (int)8899611907295796239L;
      var18 = -1808766432;
      var17 = var10000;
      var10000 = (var17 | var18) - (var17 & var18);
      var18 = 822326821;
      var17 = var10000;
      char[] var258 = new char[(var17 | var18) - (var17 & var18)];
      var10002 = (int)-831929574042099546L;
      var18 = 792802481;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -497740777;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)-2398084216726592008L;
      var18 = 962310286;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 1909562710;
      var17 = var10003;
      var258[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var18 = 287604527;
      var17 = -1601662205;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -1314067411;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)-2730668403466720961L;
      var18 = 1782826329;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 252418766;
      var17 = var10003;
      var10003 = (var17 + var18 - 2 * (var17 & var18)) * (var17 + var18 - 2 * (var17 & var18));
      var10003 = (int)5615390141251962532L;
      var18 = 1391780048;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1501977993;
      var17 = var10003;
      var258[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var10002 = (int)2426671461932802433L;
      var18 = -1157408641;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -803833348;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)-1570441435528029872L;
      var18 = -975356479;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -842967173;
      var17 = var10003;
      var10003 = ((var17 | var18) - (var17 & var18)) * ((var17 | var18) - (var17 & var18));
      var18 = -124302110;
      var17 = 383469559;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -296973242;
      var17 = var10003;
      var258[var10002] = (char)((var17 | var18) - (var17 & var18));
      var18 = 2004989283;
      var17 = -613135140;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1393165892;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)-4980153484819047037L;
      var18 = 1933600070;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -785415993;
      var17 = var10003;
      var258[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var10002 = (int)-5681466623035169319L;
      var18 = -136168291;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -1256056512;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var10003 = (int)-8884480643857354185L;
      var18 = 284773084;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 972357803;
      var17 = var10003;
      var258[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var10002 = (int)-7081167926113073334L;
      var18 = -966999429;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 930661684;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var10003 = (int)-1558773655677043944L;
      var18 = 507870486;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1852096154;
      var17 = var10003;
      var258[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var18 = -575292335;
      var17 = -611559060;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 104457531;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)-7770864159678701953L;
      var18 = -239140942;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 202185357;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)-4371527645426895473L;
      var18 = 1743907784;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -143206018;
      var17 = var10003;
      var258[var10002] = (char)((var17 | var18) - (var17 & var18));
      var10002 = (int)-4371766959749481533L;
      var18 = 1704915325;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -1094104391;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 1072707665;
      var17 = -1806233759;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1415108856;
      var17 = var10003;
      var258[var10002] = (char)((var17 | var18) - (var17 & var18));
      var10002 = (int)1515059599512191752L;
      var18 = -1801095959;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 786249705;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      String var360 = "dua";
      var10003 = (int)4673958231682558316L;
      var18 = -555410419;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -1600768411;
      var17 = var10003;
      var258[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var10002 = (int)7866904133724929609L;
      var18 = -725083040;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -797842912;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 1489987243;
      var17 = 364576094;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1299556550;
      var17 = var10003;
      var258[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      char[] var9 = var258;
      var10000 = (int)-1349003691611986794L;
      var18 = 1386224492;
      var17 = var10000;
      var10000 = (var17 | var18) - (var17 & var18);
      var18 = 1650917370;
      var17 = var10000;

      for (int var10 = (var17 | var18) & (~var17 | ~var18); var10 < var6.length; var10++) {
         if (a != a) {
            var18 = 322714709;
            var17 = -1900359283;
            var10000 = (var17 | var18) - (var17 & var18);
            var18 = -1652101672;
            var17 = var10000;
            var10000 = (var17 | var18) - (var17 & var18);
            int var10001 = (int)2478008071750299525L;
            var18 = -1048485870;
            var17 = var10001;
            var10001 = var17 & ~var18 | ~var17 & var18;
            var18 = -1833218153;
            var17 = var10001;
            var10000 /= var17 + var18 - 2 * (var17 & var18);
         }

         char var319 = var6[var10];
         char var241 = var8[var10 % var8.length];
         char var124 = var319;
         var7[var10] = (char)(var124 + var241 - 2 * (var124 & var241));
      }

      char[] var19 = new char[var7.length];
      var18 = 557763000;
      var17 = -346712752;
      var10000 = (var17 | var18) & (~var17 | ~var18);
      var18 = -898933528;
      var17 = var10000;

      for (int var11 = (var17 | var18) & ~(var17 & var18); var11 < var6.length; var11++) {
         char var320 = var7[var11];
         char var244 = var9[var11 % var9.length];
         char var127 = var320;
         var19[var11] = (char)(var127 & ~var244 | ~var127 & var244);
      }

      String var20 = new String(var19);
      int var12 = var20.hashCode();
      var18 = var5;
      var17 = var3;
      var10000 = var17 + ~var18 + 1;
      var18 = var2;
      var17 = var10000;
      int var13 = (var17 & ~var18) - (~var17 & var18);
      char[] var14 = var0.toCharArray();
      char[] var15 = new char[var14.length];
      var18 = -1313882411;
      var17 = 1617364449;
      var10000 = (var17 | var18) & ~(var17 & var18);
      var18 = -775374028;
      var17 = var10000;

      for (int var16 = (var17 | var18) & (~var17 | ~var18); var16 < var15.length; var16++) {
         int var268 = (int)8174905220612563681L;
         var18 = -1109929849;
         var17 = var268;
         var268 = (var17 | var18) & ~(var17 & var18);
         var18 = -288427420;
         var17 = var268;
         switch (var16 % (var17 & ~var18 | ~var17 & var18)) {
            case 0:
               var18 = var12;
               var17 = var13;
               var10002 = (var17 | var18) & ~(var17 & var18);
               char var254 = var14[var16];
               var17 = var10002;
               var15[var16] = (char)(var17 + var254 - 2 * (var17 & var254));
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
