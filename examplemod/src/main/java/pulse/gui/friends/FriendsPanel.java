package pulse;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import net.minecraft.client.util.math.MatrixStack;

public class FriendsPanel {
   private static final float a = 19.5F;
   private static final float b = 98.5F;
   private static final float c = 5.0F;
   private static final float d = 19.5F;
   private static final float e = 6.5F;
   private static final float f = 5.0F;
   private static final float g = 9.5F;
   private static final float h = 6.5F;
   private static final float i = 6.5F;
   private static final float j = 6.5F;
   private static final float k = 1.0F;
   private static final float l = 9.5F;
   private static final float m = 2.0F;
   private static final int n = 2;
   private static final Color o = pulse.Theme.I;
   private static final Color p = pulse.Theme.K;
   private static final Color q = pulse.Theme.O;
   private final List<HistoryEntry> r = new ArrayList<>();
   private final List<FriendCard> s = new ArrayList<>();
   private final SearchBox t;
   private final TextInput u;
   private final ScrollBar v;
   private final PanelFadeOverlay w;
   private final AnimationState x = new AnimationState();
   private boolean y;
   private String z;
   private List<FriendCard> A;
   private Consumer<HistoryEntry> B;
   private float C;
   private float D;
   private float E;
   private float F;
   private float G;
   private float H;
   private float I;

   public FriendsPanel() {
      int var10001 = (int)7056995273662684928L;
      int var2 = -1464106019;
      int var1 = var10001;
      var10001 = (var1 | var2) - (var1 & var2);
      var2 = 2097011933;
      var1 = var10001;
      this.y = pulse.Bool.from(var1 & ~var2 | ~var1 & var2);
      var2 = -1411859066;
      var1 = -860051233;
      int var10003 = (var1 | var2) & ~(var1 & var2);
      var2 = 880595576;
      var1 = var10003;
      var10003 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1288414001;
      var1 = -183806719;
      int var10004 = var1 & ~var2 | ~var1 & var2;
      var2 = -106583992;
      var1 = var10004;
      var10004 = var1 & ~var2 | ~var1 & var2;
      var2 = -1309859449;
      var1 = 933857385;
      int var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = -2119559974;
      var1 = var10005;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = -1001610123;
      var1 = -817608601;
      int var10006 = var1 & ~var2 | ~var1 & var2;
      var2 = 187382753;
      var1 = var10006;
      this.z = a("", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁷꤗ絿蹏⑴謳㑤=Ꟁ꒧ꁸ꤀絸蹎⑩講㑾aꟲꒅꁰꤋ絳蹆", var10003, var10004, var10005, (var1 | var2) - (var1 & var2));
      this.A = new ArrayList<>();
      this.t = new SearchBox();
      this.t.a(this::a);
      var10006 = (int)-9217263812552521551L;
      var2 = -762544419;
      var1 = var10006;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1244279117;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var2 = -1666830395;
      var1 = -124983042;
      int var10007 = var1 & ~var2 | ~var1 & var2;
      var2 = -615343611;
      var1 = var10007;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      int var10008 = (int)-5610812375852818900L;
      var2 = 1048835327;
      var1 = var10008;
      var10008 = var1 & ~var2 | ~var1 & var2;
      var2 = 537112046;
      var1 = var10008;
      var10008 = (var1 | var2) & ~(var1 & var2);
      var2 = 1206024156;
      var1 = -1609833032;
      int var10009 = var1 & ~var2 | ~var1 & var2;
      var2 = -404225585;
      var1 = var10009;
      this.u = new TextInput(
         TextInput.InputType.PLAYER, a("셇闧셢闩셡闡섑閕약釷약", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁷꤗ絿蹏⑴謳㑤=Ꟁ꒧ꁸ꤀絸蹎⑩講㑾aꟲꒅꁰꤋ絳蹆", var10006, var10007, var10008, (var1 | var2) & (~var1 | ~var2))
      );
      var10001 = (int)-337499288709063L;
      var2 = -1532885967;
      var1 = var10001;
      var10001 = (var1 | var2) & ~(var1 & var2);
      var2 = 1986714648;
      var1 = var10001;
      this.u.a(var1 & ~var2 | ~var1 & var2);
      this.u.a(9.5F);
      this.u.a(pulse.Theme.S, pulse.Theme.T);
      this.v = new ScrollBar(2.0F, 20.0F);
      this.v.b(10.0F);
      this.v.a(pulse.Theme.b);
      this.v.b(pulse.Theme.d);
      var10003 = (int)6051130874804987286L;
      var2 = 1881664119;
      var1 = var10003;
      var10003 = var1 & ~var2 | ~var1 & var2;
      var2 = 436310008;
      var1 = var10003;
      this.w = new PanelFadeOverlay(var1 + var2 - 2 * (var1 & var2), 5.0F, 9.0F);
   }

   public void a(HistoryEntry var1) {
   }

   public void b(HistoryEntry var1) {
   }

   public List<HistoryEntry> a() {
      return this.r;
   }

   public void b() {
   }

   public void a(Consumer<HistoryEntry> var1) {
      this.B = var1;
   }

   private void a(String var1) {
      this.z = var1.toLowerCase().trim();
      this.e();
      this.v.e();
   }

   private void e() {
      if (this.z.isEmpty()) {
         this.A = new ArrayList<>(this.s);
      } else {
         this.A = this.s.stream().filter(var1 -> var1.a().a().toLowerCase().contains(this.z)).collect(Collectors.toList());
      }
   }

   public void a(MatrixStack var1, Renderer2D var2, float var3, float var4, float var5, float var6, int var7, int var8, float var9) {
      this.C = var3;
      this.D = var4;
      this.E = var5;
      this.F = var6;
      this.v.a();
      this.x.a();
      float var10 = var4;
      float var11 = var5 - 98.5F - 5.0F - 19.5F - 5.0F;
      this.t.a(var1, var2, var3, var10, 98.5F, 19.5F, var7, var8);
      float var12 = var3 + 98.5F + 5.0F;
      this.u.a(var1, var2, var12, var10, var11, 19.5F, var7, var8, var9);
      float var13 = var12 + var11 + 5.0F;
      this.a(var1, var2, var13, var10, var7, var8, var9);
      var10 += 24.5F;
      float var14 = var10;
      float var15 = var6 - (var10 - var4);
      float var16 = var5;
      this.G = var14;
      this.H = var15;
      this.I = var16;
      this.b(var1, var2, var3, var14, var16, var15, var7, var8, var9);
   }

   private void a(MatrixStack var1, Renderer2D var2, float var3, float var4, float var5, float var6, float var7) {
      Color var8 = pulse.Theme.b(pulse.Theme.m, var7);
      Color var9 = pulse.Theme.b(pulse.Theme.n, var7);
      var2.a(var3 - 0.5F, var4 - 0.5F, var5 + 1.0F, var6 + 1.0F, 9.5F, var8, var8, var9, var9, var1);
      int var10 = (int)(255.0F * var7);
      Color var11 = pulse.Theme.a(pulse.Theme.e, var10);
      Color var12 = pulse.Theme.a(pulse.Theme.f, var10);
      var2.a(var3, var4, var5, var6, 9.5F, var11, var11, var12, var12, var1);
   }

   private void a(MatrixStack var1, Renderer2D var2, float var3, float var4, float var5, float var6) {
      int var18 = 1554419325;
      int var17 = -454042409;
      int var10001 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1203154254;
      var17 = var10001;
      FontRenderer var7 = FontManager.b[var17 + var18 - 2 * (var17 & var18)];
      var18 = -949390860;
      var17 = -358517558;
      var10001 = (var17 | var18) & ~(var17 & var18);
      var18 = 768083249;
      var17 = var10001;
      FontRenderer var8 = FontManager.a[var17 + var18 - 2 * (var17 & var18)];
      String var10000;
      if (this.r.isEmpty()) {
         var18 = 991959432;
         var17 = 1102798110;
         int var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = 696484791;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         int var10003 = (int)-3605820459169242157L;
         var18 = -1265440767;
         var17 = var10003;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = 602442776;
         var17 = var10003;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = -1564272960;
         var17 = 449324378;
         int var10004 = var17 + var18 - 2 * (var17 & var18);
         var18 = -1524809454;
         var17 = var10004;
         var10004 = (var17 | var18) & ~(var17 & var18);
         int var10005 = (int)-4469765574549640895L;
         var18 = 857866211;
         var17 = var10005;
         var10005 = (var17 | var18) & (~var17 | ~var18);
         var18 = 2023741837;
         var17 = var10005;
         var10000 = a(
            "\uf278\ufe75\uf219褐\uf26a祥\uf67b頻\uf265\ufa6f\uf26bﹸ\uf21c益\uf265\ufe75\uf266褐\uf219猪\uf67b視\uf21b猪\uf26c褐\uf262\ufe75\uf661ﹽ",
            "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁷꤗ絿蹏⑴謳㑤=Ꟁ꒧ꁸ꤀絸蹎⑩講㑾aꟲꒅꁰꤋ絳蹆",
            var10002,
            var10003,
            var10004,
            (var17 | var18) & (~var17 | ~var18)
         );
      } else {
         var18 = -893300630;
         var17 = 1512373422;
         int var92 = (var17 | var18) & ~(var17 & var18);
         var18 = -1006801947;
         var17 = var92;
         var92 = (var17 | var18) - (var17 & var18);
         int var101 = (int)-3235761842028785165L;
         var18 = -1581549394;
         var17 = var101;
         var101 = (var17 | var18) & (~var17 | ~var18);
         var18 = 1039125513;
         var17 = var101;
         var101 = (var17 | var18) & ~(var17 & var18);
         var18 = -640132499;
         var17 = -1197051733;
         int var110 = var17 & ~var18 | ~var17 & var18;
         var18 = 1665510359;
         var17 = var110;
         var110 = (var17 | var18) - (var17 & var18);
         var18 = 738266530;
         var17 = 1012350822;
         int var118 = (var17 | var18) & (~var17 | ~var18);
         var18 = 275766909;
         var17 = var118;
         var10000 = a(
            "\uf246\ud9fb\uf21c\ud9f6\uf268\ud9fd\uf67b\ud9fe\uf26e\udde3\uf266\ud9f3\uf262\ud9f7\uf26e\ud9fe\uf265",
            "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁷꤗ絿蹏⑴謳㑤=Ꟁ꒧ꁸ꤀絸蹎⑩講㑾aꟲꒅꁰꤋ絳蹆",
            var92,
            var101,
            var110,
            (var17 | var18) - (var17 & var18)
         );
      }

      String var9 = var10000;
      if (this.r.isEmpty()) {
         var18 = -1816415292;
         var17 = 1026850616;
         int var94 = var17 + var18 - 2 * (var17 & var18);
         var18 = -40432675;
         var17 = var94;
         var94 = var17 & ~var18 | ~var17 & var18;
         var18 = -301448118;
         var17 = 1317306568;
         int var104 = (var17 | var18) & (~var17 | ~var18);
         var18 = -1600574744;
         var17 = var104;
         var104 = var17 + var18 - 2 * (var17 & var18);
         int var112 = (int)8989454753324136875L;
         var18 = -1702038521;
         var17 = var112;
         var112 = var17 + var18 - 2 * (var17 & var18);
         var18 = -966818335;
         var17 = var112;
         var112 = var17 & ~var18 | ~var17 & var18;
         var18 = -1974769552;
         var17 = -498558807;
         int var119 = (var17 | var18) - (var17 & var18);
         var18 = 1745159446;
         var17 = var119;
         var10000 = a(
            "\uf249삇\uf26e삁\uf263쒕\uf266삍\uf261삈\uf26e삌\uf267쒕\uf26f샵\uf218삆\uf26b쒕\uf269쒕\uf264삋\uf260삀\uf67b\ue4a9\uf24f삋\uf26a삅\uf269삍\uf219샹홆쒕\uf263쒕\uf266삅\uf26d삉\uf263쒕\uf266삅\uf67b삊\uf260샻\uf21a삍\uf261",
            "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁷꤗ絿蹏⑴謳㑤=Ꟁ꒧ꁸ꤀絸蹎⑩講㑾aꟲꒅꁰꤋ絳蹆",
            var94,
            var104,
            var112,
            (var17 | var18) - (var17 & var18)
         );
      } else {
         int var96 = (int)-7727523159603634123L;
         var18 = -697677021;
         var17 = var96;
         var96 = (var17 | var18) & ~(var17 & var18);
         var18 = 1665805367;
         var17 = var96;
         var96 = var17 & ~var18 | ~var17 & var18;
         int var106 = (int)4462472830969338873L;
         var18 = 1480779704;
         var17 = var106;
         var106 = (var17 | var18) & (~var17 | ~var18);
         var18 = -573078956;
         var17 = var106;
         var106 = var17 + var18 - 2 * (var17 & var18);
         var18 = 1416876323;
         var17 = -306860705;
         int var115 = (var17 | var18) & ~(var17 & var18);
         var18 = -1603423405;
         var17 = var115;
         var115 = var17 + var18 - 2 * (var17 & var18);
         int var120 = (int)2283803191665330963L;
         var18 = -590688490;
         var17 = var120;
         var120 = var17 & ~var18 | ~var17 & var18;
         var18 = -996212353;
         var17 = var120;
         var10000 = a(
            "\uf244瀾\uf264灀\uf265瀱\uf218瀹\uf67b瀸\uf26c瀼\uf26e瀽\uf263灂\uf217琠\uf26c瀰\uf264灀\uf265灁",
            "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁷꤗ絿蹏⑴謳㑤=Ꟁ꒧ꁸ꤀絸蹎⑩講㑾aꟲꒅꁰꤋ絳蹆",
            var96,
            var106,
            var115,
            (var17 | var18) & ~(var17 & var18)
         );
      }

      String var10 = var10000;
      float var11 = var7.a(var9);
      float var12 = var8.a(var10);
      float var13 = var3 + (var5 - var11) / 2.0F;
      float var14 = var4 + var6 / 2.0F - 20.0F;
      float var15 = var3 + (var5 - var12) / 2.0F;
      float var16 = var14 + 15.0F;
      var7.a(var9, var13, var14, pulse.Theme.a, var1);
      var8.a(var10, var15, var16, pulse.Theme.b, var1);
   }

   private void b(MatrixStack var1, Renderer2D var2, float var3, float var4, float var5, float var6, int var7, int var8, float var9) {
      if (this.A.isEmpty()) {
         this.a(var1, var2, var3, var4, var5, var6);
      } else {
         float var10 = var3 + 1.0F;
         float var11 = var4 + 6.5F;
         float var12 = var5 - 2.0F;
         float var13 = var6 - 6.5F - 6.5F;
         float var14 = this.f();
         int var56;
         if (var14 > var13) {
            var56 = (int)-7707362284954180446L;
            int var27 = -2138066730;
            int var26 = var56;
            var56 = (var26 | var27) & ~(var26 & var27);
            var27 = -761293707;
            var26 = var56;
            var56 = var26 + var27 - 2 * (var26 & var27);
         } else {
            int var43 = -697077589;
            int var30 = -1473497263;
            var56 = (var30 | var43) & (~var30 | ~var43);
            var43 = 2120173562;
            var30 = var56;
            var56 = var30 & ~var43 | ~var30 & var43;
         }

         int var15 = var56;
         if (var15 == 0) {
            this.v.e();
         }

         var56 = (int)7969688796393632115L;
         int var45 = 1883848893;
         int var32 = var56;
         var56 = (var32 | var45) & ~(var32 & var45);
         var45 = 1597682118;
         var32 = var56;
         int var16 = (var32 | var45) - (var32 & var45);
         var2.b().a(var3, var4 + var16 / 2.0F, var5, var6 - var16, var1);
         float var17 = (var12 - 9.5F) / 2.0F;
         float var18 = var11 - this.v.b();
         var45 = 598376141;
         var32 = -2072705759;
         var56 = var32 & ~var45 | ~var32 & var45;
         var45 = -1478525972;
         var32 = var56;
         int var19 = (var32 | var45) & (~var32 | ~var45);

         for (FriendCard var21 : this.A) {
            var45 = 1301506765;
            var32 = -945457720;
            int var10001 = (var32 | var45) - (var32 & var45);
            var45 = -1976164601;
            var32 = var10001;
            int var22 = var19 % (var32 + var45 - 2 * (var32 & var45));
            var10001 = (int)-7542951213722521417L;
            var45 = -340587487;
            var32 = var10001;
            var10001 = (var32 | var45) - (var32 & var45);
            var45 = 809811092;
            var32 = var10001;
            int var23 = var19 / ((var32 | var45) - (var32 & var45));
            float var24 = var10 + var22 * (var17 + 9.5F);
            float var25 = var18 + var23 * 43.5F;
            if (var25 + 37.0F >= var11 && var25 <= var11 + var13) {
               var21.a(var1, var2, var24, var25, var17, var7, var8, var9);
            }

            var19++;
         }

         var2.b().a(var1);
         if (var15 != 0) {
            float var28 = var3 + var5 + 18.0F;
            int var10010 = (int)2740431281118900704L;
            var45 = -1416123914;
            var32 = var10010;
            var10010 = (var32 | var45) & ~(var32 & var45);
            var45 = -1176348650;
            var32 = var10010;
            this.v.a(var1, var2, var28, var11, var13, var14, var13, var7, var8, pulse.Bool.from((var32 | var45) & (var32 & var45 ^ -1)));
         }

         this.w.a(var1, var2, var3, var4 + 1.5F, var5, var6, var9);
      }
   }

   private void a(MatrixStack var1, Renderer2D var2, float var3, float var4, int var5, int var6, float var7) {
      int var8 = (int)(255.0F * var7);
      boolean var9 = GuiInput.a(var3, var4, 19.5F, 19.5F, var5, var6);
      if (var9 != this.y) {
         this.x.a(var9 ? 1.0 : 0.0, 0.15, pulse.Easing.h);
         this.y = var9;
      }

      float var10 = (float)this.x.j();
      Color var11 = pulse.Theme.b(pulse.Theme.q, var7);
      Color var12 = pulse.Theme.b(pulse.Theme.n, var7);
      var2.a(var3 - 0.5F, var4 - 0.5F, 20.5F, 20.5F, 6.5F, var11, var11, var12, var12, var1);
      Color var13 = ColorUtils.a(pulse.Theme.f, o, var10);
      Color var14 = ColorUtils.a(pulse.Theme.e, p, var10);
      var13 = pulse.Theme.a(var13, var8);
      var14 = pulse.Theme.a(var14, var8);
      var2.a(var3, var4, 19.5F, 19.5F, 6.5F, var13, var13, var14, var14, var1);
      Color var15 = ColorUtils.a(pulse.Theme.b, q, var10);
      var15 = pulse.Theme.a(var15, var8);
      float var16 = 5.0F;
      float var17 = 1.5F;
      float var18 = var3 + (19.5F - var16) / 2.0F;
      float var19 = var4 + (19.5F - var16) / 2.0F;
      var2.a(var18, var19 + var16 / 2.0F - var17 / 2.0F, var16, var17, var15, var1);
      var2.a(var18 + var16 / 2.0F - var17 / 2.0F, var19, var17, var16, var15, var1);
      if (var9) {
         GuiInput.g();
      }
   }

   private float f() {
      if (this.A.isEmpty()) {
         return 0.0F;
      }

      int var1 = (int)Math.ceil(this.A.size() / 2.0);
      return var1 * 43.5F - 6.5F;
   }

   public boolean a(float var1, float var2, float var3, float var4, int var5, int var6) {
      if (this.t.a(var5, var6)) {
         int var87 = (int)-8416466108083410266L;
         int var69 = -1197408287;
         int var48 = var87;
         var87 = var48 + var69 - 2 * (var48 & var69);
         var69 = 2066879815;
         var48 = var87;
         this.u.c(pulse.Bool.from(var48 & (var69 ^ -1) | (var48 ^ -1) & var69));
         int var81 = (int)-4177386106922232126L;
         var69 = -1325095502;
         var48 = var81;
         var81 = var48 & ~var69 | ~var48 & var69;
         var69 = 1580938097;
         var48 = var81;
         return pulse.Bool.from((var48 | var69) - (var48 & var69));
      }

      float var7 = var3 - 98.5F - 5.0F - 19.5F - 5.0F;
      float var8 = var1 + 98.5F + 5.0F;
      if (this.u.a(var5, var6)) {
         int var85 = (int)719602331563406207L;
         int var65 = -1470417141;
         int var44 = var85;
         var85 = var44 & ~var65 | ~var44 & var65;
         var65 = -1606810508;
         var44 = var85;
         this.t.b(pulse.Bool.from((var44 | var65) - (var44 & var65)));
         int var79 = (int)5005610364704235214L;
         var65 = 301481539;
         var44 = var79;
         var79 = var44 & ~var65 | ~var44 & var65;
         var65 = 164470924;
         var44 = var79;
         return pulse.Bool.from(var44 + var65 - 2 * (var44 & var65));
      }

      float var9 = var8 + var7 + 5.0F;
      if (GuiInput.a(var9, var2, 19.5F, 19.5F, var5, var6)) {
         this.g();
         int var63 = -2020216649;
         int var42 = 1943896286;
         int var78 = var42 + var63 - 2 * (var42 & var63);
         var63 = -196579224;
         var42 = var78;
         return pulse.Bool.from((var42 | var63) & (var42 ^ -1 | var63 ^ -1));
      }

      float var10 = var2 + 19.5F + 5.0F;
      float var11 = var4 - 19.5F - 5.0F;
      float var12 = var10 + 6.5F;
      float var13 = var11 - 6.5F - 6.5F;
      float var14 = var3 - 2.0F;
      float var15 = this.f();
      if (var15 > var13) {
         float var16 = var1 + var3 + 18.0F;
         float var17 = var12;
         float var18 = var13;
         if (this.v.a(var16, var17, var18, var15, var13, var5, var6)) {
            int var76 = (int)-6633381955509867746L;
            int var61 = -998009563;
            int var40 = var76;
            var76 = var40 & ~var61 | ~var40 & var61;
            var61 = 1994047034;
            var40 = var76;
            return pulse.Bool.from(var40 + var61 - 2 * (var40 & var61));
         }
      }

      float var28 = var1 + 1.0F;
      float var29 = (var14 - 9.5F) / 2.0F;
      if (GuiInput.a(var28, var12, var14, var13, var5, var6)) {
         float var30 = var12 - this.v.b();
         int var27 = 1772800111;
         int var26 = -630649547;
         int var10000 = (var26 | var27) - (var26 & var27);
         var27 = -1279015590;
         var26 = var10000;
         int var19 = (var26 | var27) & (~var26 | ~var27);

         for (FriendCard var21 : this.A) {
            var27 = -1695971005;
            var26 = 1184565494;
            int var10001 = (var26 | var27) - (var26 & var27);
            var27 = -596475465;
            var26 = var10001;
            int var22 = var19 % ((var26 | var27) & (~var26 | ~var27));
            var10001 = (int)-7971672901609665096L;
            var27 = -402809971;
            var26 = var10001;
            var10001 = (var26 | var27) - (var26 & var27);
            var27 = -1240508873;
            var26 = var10001;
            int var23 = var19 / ((var26 | var27) & (~var26 | ~var27));
            float var24 = var28 + var22 * (var29 + 9.5F);
            float var25 = var30 + var23 * 43.5F;
            if (var21.a(var24, var25, var29, var5, var6)) {
               var27 = 1461812272;
               var26 = 289812165;
               var10000 = (var26 | var27) - (var26 & var27);
               var27 = 1181176564;
               var26 = var10000;
               return pulse.Bool.from(var26 + var27 - 2 * (var26 & var27));
            }

            var19++;
         }
      }

      int var74 = (int)1826776455073271322L;
      int var59 = -124850206;
      int var38 = var74;
      var74 = (var38 | var59) & (~var38 | ~var59);
      var59 = 540959224;
      var38 = var74;
      return pulse.Bool.from((var38 | var59) - (var38 & var59));
   }

   private void g() {
   }

   public void a(int var1, int var2) {
      this.v.d();
   }

   public void a(int var1, int var2, double var3, double var5) {
      if (this.v.c()) {
         float var7 = this.H - 6.5F - 6.5F;
         float var8 = this.f();
         this.v.a(var2, var8, var7);
      }
   }

   public void a(float var1, int var2, int var3) {
      float var4 = this.D + 19.5F + 5.0F;
      float var5 = this.F - 19.5F - 5.0F;
      if (GuiInput.a(this.C, var4, this.E, var5, var2, var3)) {
         float var6 = var5 - 6.5F - 6.5F;
         float var7 = this.f();
         this.v.a(var1, var7, var6);
      }
   }

   public boolean a(int var1, int var2, int var3) {
      if (this.t.c()) {
         return this.t.a(var1, var2, var3);
      }

      if (this.u.d()) {
         return this.u.a(var1, var2, var3);
      }

      int var10000 = (int)-6718992717801985096L;
      int var5 = 1252304671;
      int var4 = var10000;
      var10000 = var4 & ~var5 | ~var4 & var5;
      var5 = -2074260313;
      var4 = var10000;
      return pulse.Bool.from((var4 | var5) & (var4 ^ -1 | var5 ^ -1));
   }

   public boolean a(char var1, int var2) {
      if (this.t.c()) {
         return this.t.a(var1, var2);
      }

      if (this.u.d()) {
         return this.u.a(var1, var2);
      }

      int var4 = -900848577;
      int var3 = -1205714387;
      int var10000 = (var3 | var4) & (~var3 | ~var4);
      var4 = 1919706642;
      var3 = var10000;
      return pulse.Bool.from(var3 & (var4 ^ -1) | (var3 ^ -1) & var4);
   }

   public boolean c() {
      int var10;
      if (!this.t.c() && !this.u.d()) {
         var10 = (int)5448982459975277436L;
         int var7 = 17932672;
         int var4 = var10;
         var10 = var4 & ~var7 | ~var4 & var7;
         var7 = 1798879996;
         var4 = var10;
         var10 = (var4 | var7) - (var4 & var7);
      } else {
         var10 = (int)8803804946149585000L;
         int var2 = -1249746854;
         int var1 = var10;
         var10 = var1 & ~var2 | ~var1 & var2;
         var2 = -2104438733;
         var1 = var10;
         var10 = (var1 | var2) & ~(var1 & var2);
      }

      return pulse.Bool.from(var10);
   }

   public boolean d() {
      return this.r.isEmpty();
   }

   public static String a(String var0, String var1, int var2, int var3, int var4, int var5) {
      char[] var6 = var1.toCharArray();
      char[] var7 = new char[var6.length];
      int var18 = -1520191915;
      int var17 = 1239301510;
      int var10000 = (var17 | var18) & ~(var17 & var18);
      var18 = -323122215;
      var17 = var10000;
      char[] var219 = new char[var17 + var18 - 2 * (var17 & var18)];
      int var10002 = (int)-4061518192259950402L;
      var18 = -1494354892;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -1285362550;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -1735556556;
      var17 = -1367075776;
      int var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 906616390;
      var17 = var10003;
      var219[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var10002 = (int)-8623850361542999211L;
      var18 = -477322099;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 1872209881;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var10003 = (int)9042816760640101905L;
      var18 = 262036960;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -579297164;
      var17 = var10003;
      var219[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var10002 = (int)6600119980155917687L;
      var18 = 946368714;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 340698559;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 863800996;
      var17 = 1407092614;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1621240484;
      var17 = var10003;
      var219[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var18 = -1811404097;
      var17 = -2132583365;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 350975623;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 1184357351;
      var17 = -1648193705;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -615134045;
      var17 = var10003;
      var219[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var18 = 1180588811;
      var17 = -2017932992;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -1041853873;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var10003 = (int)224965419732042821L;
      var18 = -918778132;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -1327752308;
      var17 = var10003;
      var219[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var18 = 423700841;
      var17 = -1187825385;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -1603137413;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -161107700;
      var17 = -374881366;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 532821796;
      var17 = var10003;
      var219[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var10002 = (int)1611974181691147339L;
      var18 = 1132532659;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 88889342;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)6453528291812910176L;
      var18 = -1661938981;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -1719533656;
      var17 = var10003;
      var219[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var18 = -2123257219;
      var17 = 1535678490;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -621202848;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -1789456428;
      var17 = 453242780;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -1907043222;
      var17 = var10003;
      var219[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var10002 = (int)1585646984405867029L;
      var18 = -584851511;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 562922964;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)-1242424213471632435L;
      var18 = -847523337;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1658206825;
      var17 = var10003;
      var219[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var18 = -229962178;
      var17 = 741412297;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -562428930;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var10003 = (int)-5446777993073588566L;
      var18 = -18142688;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -159110226;
      var17 = var10003;
      var219[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      char[] var8 = var219;
      var10000 = (int)3122416974046507027L;
      var18 = 1271472526;
      var17 = var10000;
      var10000 = (var17 | var18) - (var17 & var18);
      var18 = -1720184425;
      var17 = var10000;
      char[] var222 = new char[var17 & ~var18 | ~var17 & var18];
      var10002 = (int)-7984686766326974372L;
      var18 = 58222765;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -785837839;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 882295270;
      var17 = 1392618315;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 1737958029;
      var17 = var10003;
      var222[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var18 = -1169545300;
      var17 = 2110038748;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -946961039;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -510758298;
      var17 = -1316350685;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1342497606;
      var17 = var10003;
      var222[var10002] = (char)((var17 | var18) - (var17 & var18));
      var10002 = (int)-6103067498415731646L;
      var18 = 164080304;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 494233328;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var10003 = (int)-8453462250406652474L;
      var18 = 1585923170;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 2094110455;
      var17 = var10003;
      var222[var10002] = (char)((var17 | var18) - (var17 & var18));
      var10002 = (int)6669480828179734448L;
      var18 = -1294344256;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -1120436109;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 2007097602;
      var17 = -1621829194;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -386596682;
      var17 = var10003;
      var222[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var18 = -397042931;
      var17 = -645245253;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 836750770;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -1188790458;
      var17 = 1941754211;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -895969691;
      var17 = var10003;
      var222[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var18 = 557346311;
      var17 = 1580319239;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 2131340293;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -974965271;
      var17 = -1145337497;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 2119730202;
      var17 = var10003;
      var222[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var18 = -706715558;
      var17 = -634663939;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 265005985;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 831775969;
      var17 = -210755346;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1025293514;
      var17 = var10003;
      var222[var10002] = (char)((var17 | var18) - (var17 & var18));
      var10002 = (int)7047374767142425786L;
      var18 = -1264803397;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -1374685946;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)4163419430825846482L;
      var18 = -492976078;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 63487704;
      var17 = var10003;
      var222[var10002] = (char)((var17 | var18) - (var17 & var18));
      var10002 = (int)6606406926186788117L;
      var18 = -2098896079;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1609455148;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1402953035;
      var17 = 1371733478;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 39658409;
      var17 = var10003;
      var222[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var10002 = (int)-7619211800112775297L;
      var18 = 787954252;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1596392762;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var10003 = (int)-8898797430257214084L;
      var18 = -1732891749;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 166331860;
      var17 = var10003;
      var222[var10002] = (char)((var17 | var18) - (var17 & var18));
      char[] var9 = var222;
      var18 = -1953374947;
      var17 = -319898313;
      var10000 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1736400938;
      var17 = var10000;

      for (int var10 = var17 & ~var18 | ~var17 & var18; var10 < var6.length; var10++) {
         char var279 = var6[var10];
         char var205 = var8[var10 % var8.length];
         char var106 = var279;
         var7[var10] = (char)((var106 | var205) - (var106 & var205));
      }

      char[] var19 = new char[var7.length];
      var18 = 514783713;
      var17 = -1186258933;
      var10000 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1478108694;
      var17 = var10000;

      for (int var11 = (var17 | var18) & (~var17 | ~var18); var11 < var6.length; var11++) {
         char var280 = var7[var11];
         char var208 = var9[var11 % var9.length];
         char var109 = var280;
         var19[var11] = (char)((var109 | var208) & (~var109 | ~var208));
      }

      String var20 = new String(var19);
      int var12 = var20.hashCode();
      var18 = var5;
      var17 = var3;
      var10000 = var17 + ~var18 + 1;
      var18 = var2;
      var17 = var10000;
      int var13 = var17 - var18;
      char[] var14 = var0.toCharArray();
      char[] var15 = new char[var14.length];
      var10000 = (int)7667254123887854909L;
      var18 = -347898647;
      var17 = var10000;
      var10000 = var17 & ~var18 | ~var17 & var18;
      var18 = 1405057492;
      var17 = var10000;

      for (int var16 = (var17 | var18) & (~var17 | ~var18); var16 < var15.length; var16++) {
         int var10001 = (int)-3463703237244446414L;
         var18 = -1021673138;
         var17 = var10001;
         var10001 = (var17 | var18) - (var17 & var18);
         var18 = 464918654;
         var17 = var10001;
         switch (var16 % (var17 + var18 - 2 * (var17 & var18))) {
            case 0:
               var18 = var12;
               var17 = var13;
               var10002 = (var17 | var18) & ~(var17 & var18);
               char var218 = var14[var16];
               var17 = var10002;
               var15[var16] = (char)((var17 | var218) & ~(var17 & var218));
               break;
            case 1:
               var18 = var13;
               var17 = var5;
               var10002 = (var17 | var18) & (~var17 | ~var18);
               char var216 = var14[var16];
               var17 = var10002;
               var15[var16] = (char)((var17 | var216) - (var17 & var216));
         }
      }

      return new String(var15);
   }
}
