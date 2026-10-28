package pulse;

import java.awt.Color;
import java.util.function.Consumer;
import net.minecraft.client.util.math.MatrixStack;

public class ConfigActionMenu {
   private static final float c = 79.0F;
   private static final float d = 12.0F;
   private static final float e = 11.0F;
   private static final float f = 9.5F;
   private static final float g = 7.0F;
   private static final float h = 6.5F;
   private static final float i = 8.0F;
   private static final float j = 4.0F;
   private static final float k = 3.0F;
   private boolean l;
   private float m;
   private float n;
   private float o;
   private ConfigEntry p;
   private final pulse.AnimationState q;
   private final pulse.AnimationState[] r;
   private final boolean[] s;
   private Consumer<ConfigActionMenu.Action> t;
   private Runnable u;
   public static int a;
   public static boolean b;

   public ConfigActionMenu() {
      int var10001 = (int)6499872049673380330L;
      int var3 = -1960157277;
      int var2 = var10001;
      var10001 = (var2 | var3) - (var2 & var3);
      var3 = 1970273865;
      var2 = var10001;
      this.l = pulse.Bool.from(var2 + var3 - 2 * (var2 & var3));
      this.q = new pulse.AnimationState();
      var3 = -77598699;
      var2 = -461030675;
      var10001 = (var2 | var3) - (var2 & var3);
      var3 = 534432508;
      var2 = var10001;
      this.r = new pulse.AnimationState[(var2 | var3) & ~(var2 & var3)];
      var10001 = (int)-3020626119828106155L;
      var3 = 976781954;
      var2 = var10001;
      var10001 = (var2 | var3) - (var2 & var3);
      var3 = 1918473939;
      var2 = var10001;
      this.s = new boolean[var2 & ~var3 | ~var2 & var3];
      int var10000 = (int)-4806610977536499061L;
      var3 = 1624206648;
      var2 = var10000;
      var10000 = var2 + var3 - 2 * (var2 & var3);
      var3 = 784256947;
      var2 = var10000;
      int var1 = var2 + var3 - 2 * (var2 & var3);

      while (true) {
         var10001 = (int)3262906001765268104L;
         var3 = -323038325;
         var2 = var10001;
         var10001 = (var2 | var3) - (var2 & var3);
         var3 = 2114693383;
         var2 = var10001;
         if (var1 >= ((var2 | var3) & (~var2 | ~var3))) {
            return;
         }

         this.r[var1] = new pulse.AnimationState();
         var3 = 988208048;
         var2 = -1851614203;
         int var10002 = var2 + var3 - 2 * (var2 & var3);
         var3 = -1421588555;
         var2 = var10002;
         this.s[var1] = pulse.Bool.from(var2 + var3 - 2 * (var2 & var3));
         var1++;
      }
   }

   public void a(float var1, float var2, float var3, ConfigEntry var4) {
      String var10000 = "dni";
      float var5 = 69.5F;
      this.o = var1 + var3 / 2.0F;
      String var10002 = "dnj";
      this.m = this.o - 39.5F;
      int var48 = (int)-8660871640658762210L;
      int var8 = -404328373;
      int var7 = var48;
      int var49 = (var7 | var8) & ~(var7 & var8);
      var8 = 113339027;
      var7 = var49;
      int var50 = ((var7 | var8) - (var7 & var8)) * ((var7 | var8) - (var7 & var8));
      this.n = var2 + 3.0F;
      this.p = var4;
      int var10001 = (int)9139175272010896365L;
      var8 = -579437068;
      var7 = var10001;
      var10001 = var7 + var8 - 2 * (var7 & var8);
      var8 = -783798760;
      var7 = var10001;
      this.l = pulse.Bool.from(var7 & ~var8 | ~var7 & var8);
      this.q.d(0.0);
      int var51 = (int)-3678027840348156351L;
      var8 = 1202905614;
      var7 = var51;
      int var52 = (var7 | var8) & (~var7 | ~var8);
      var8 = 828090943;
      var7 = var52;
      int var53 = (var7 + var8 - 2 * (var7 & var8)) * (var7 + var8 - 2 * (var7 & var8));
      this.q.a(1.0, 0.25, pulse.Easing.F);
      int var39 = (int)8118025242278423031L;
      var8 = 959214744;
      var7 = var39;
      int var40 = var7 & ~var8 | ~var7 & var8;
      var8 = 1652858223;
      var7 = var40;
      int var6 = (var7 | var8) & ~(var7 & var8);

      while (true) {
         var10001 = (int)2675507515437686304L;
         var8 = 47015097;
         var7 = var10001;
         var10001 = (var7 | var8) - (var7 & var8);
         var8 = -381650275;
         var7 = var10001;
         if (var6 >= (var7 | var8) - (var7 & var8)) {
            GuiInteractionState var41 = pulse.GuiInteractionState.a();
            var8 = -1459875924;
            var7 = 1992996468;
            var10001 = var7 & ~var8 | ~var7 & var8;
            var8 = -566838823;
            var7 = var10001;
            var41.d(pulse.Bool.from((var7 | var8) - (var7 & var8)));
            float var42 = this.m;
            float var47 = this.n;
            int var10003 = (int)7087696274794718433L;
            var8 = -1635603597;
            var7 = var10003;
            var10003 = (var7 | var8) & (~var7 | ~var8);
            var8 = 813502361;
            var7 = var10003;
            var10003 = (var7 | var8) - (var7 & var8);
            GuiInput.a(var42, var47, 79.0F, var5);
            return;
         }

         this.r[var6].d(0.0);
         var8 = 773636946;
         var7 = -1705224685;
         int var54 = var7 + var8 - 2 * (var7 & var8);
         var8 = -1270835903;
         var7 = var54;
         this.s[var6] = pulse.Bool.from((var7 | var8) & (~var7 | ~var8));
         var6++;
      }
   }

   private boolean a(ConfigActionMenu.Action var1) {
      if (this.p == null) {
         int var43 = 2007973378;
         int var24 = 1582888664;
         int var63 = (var24 | var43) & ~(var24 & var43);
         var43 = 704104666;
         var24 = var63;
         return pulse.Bool.from(var24 & (var43 ^ -1) | (var24 ^ -1) & var43);
      }

      if (this.p.f()) {
         int var60;
         if (var1 == ConfigActionMenu.Action.SAVE_TO) {
            var60 = (int)3912058423409392996L;
            int var39 = -1648305421;
            int var20 = var60;
            var60 = (var20 | var39) - (var20 & var39);
            var39 = 639952791;
            var20 = var60;
            var60 = var20 & ~var39 | ~var20 & var39;
         } else {
            var60 = (int)-6100886521284548826L;
            int var41 = 1099672692;
            int var22 = var60;
            var60 = (var22 | var41) & (~var22 | ~var41);
            var41 = 576064339;
            var22 = var60;
            var60 = (var22 | var41) & ~(var22 & var41);
         }

         return pulse.Bool.from(var60);
      } else {
         boolean var2 = this.p.e();
         if (var2) {
            if (var1 == ConfigActionMenu.Action.DELETE || var1 == ConfigActionMenu.Action.RENAME) {
               int var37 = 1521893174;
               int var18 = 1981307473;
               int var57 = (var18 | var37) - (var18 & var37);
               var37 = 749626726;
               var18 = var57;
               return pulse.Bool.from(var18 & ~var37 | ~var18 & var37);
            }

            int var10000 = (int)532520836307749363L;
            int var6 = -1563009188;
            int var5 = var10000;
            var10000 = (var5 | var6) & ~(var5 & var6);
            var6 = 1988204937;
            var5 = var10000;
            var10000 = (var5 & ~var6 | ~var5 & var6) * (var5 & ~var6 | ~var5 & var6);
            var6 = 1779270453;
            var5 = 1388133174;
            var10000 = var5 + var6 - 2 * (var5 & var6);
            var6 = 2017364735;
            var5 = var10000;
            int var4 = (var5 | var6) & (~var5 | ~var6);
            String var48 = "dnk";
            var10000 = (int)-6031334455339054573L;
            var6 = 1888412499;
            var5 = var10000;
            var10000 = var5 + var6 - 2 * (var5 & var6);
            var6 = -202390317;
            var5 = var10000;
            if (((var5 | var6) & ~(var5 & var6)) >= var4) {
               var10000 = (int)2897089191481497429L;
               var6 = -816347660;
               var5 = var10000;
               var10000 = var5 + var6 - 2 * (var5 & var6);
               var6 = -474525023;
               var5 = var10000;
               var10000 = var5 + var6 - 2 * (var5 & var6);
               int var10001 = (int)-312922631646477803L;
               var6 = 437150936;
               var5 = var10001;
               var10001 = (var5 | var6) - (var5 & var6);
               var6 = 1485203149;
               var5 = var10001;
               var10000 /= var5 & ~var6 | ~var5 & var6;
            }
         }

         int var35 = -1942416274;
         int var16 = 938209811;
         int var55 = (var16 | var35) & ~(var16 & var35);
         var35 = -1143806339;
         var16 = var55;
         return pulse.Bool.from((var16 | var35) & (~var16 | ~var35));
      }
   }

   private String b(ConfigActionMenu.Action var1) {
      if (this.p != null) {
         if (!this.p.f()) {
            if (a != a) {
               int var3 = 2022073220;
               int var2 = 1599106588;
               int var10000 = var2 & ~var3 | ~var2 & var3;
               var3 = 668339608;
               var2 = var10000;
               var10000 = (var2 | var3) & (~var2 | ~var3);
               var3 = 590008740;
               var2 = 1749388579;
               int var10001 = (var2 | var3) & ~(var2 & var3);
               var3 = 1265589383;
               var2 = var10001;
               var10000 /= (var2 | var3) - (var2 & var3);
            }
         } else if (var1 == ConfigActionMenu.Action.SAVE_TO) {
            int var29 = 832314314;
            int var7 = -1637588719;
            int var50 = (var7 | var29) & ~(var7 & var29);
            var29 = 667929843;
            var7 = var50;
            var50 = (var7 | var29) - (var7 & var29);
            int var53 = (int)5156282936832603457L;
            var29 = 1896012045;
            var7 = var53;
            var53 = var7 & ~var29 | ~var7 & var29;
            var29 = 17453761;
            var7 = var53;
            var29 = var7 & ~var29 | ~var7 & var29;
            var7 = var50;
            var50 = var7 - ~var29 - 1;
            String var55 = "dnl";
            var29 = -572844780;
            var7 = 1310503937;
            int var10003 = (var7 | var29) & ~(var7 & var29);
            var29 = -1815633634;
            var7 = var10003;
            var10003 = (var7 | var29) - (var7 & var29);
            var29 = -234956088;
            var7 = -676944477;
            int var10002 = var7 & ~var29 | ~var7 & var29;
            var29 = 1236509651;
            var7 = var10002;
            var10002 = var7 & ~var29 | ~var7 & var29;
            String var58 = "dnm";
            var29 = 1673042496;
            var7 = 2101635214;
            var10003 = var7 & ~var29 | ~var7 & var29;
            var29 = -1180697239;
            var7 = var10003;
            var10003 = var7 + var29 - 2 * (var7 & var29);
            int var10004 = (int)-914116138563565821L;
            var29 = 464745027;
            var7 = var10004;
            var10004 = (var7 | var29) & ~(var7 & var29);
            var29 = 1100926935;
            var7 = var10004;
            var10004 = (var7 | var29) - (var7 & var29);
            var10004 = (int)-7567987269240472098L;
            var29 = 1798952130;
            var7 = var10004;
            var10004 = var7 + var29 - 2 * (var7 & var29);
            var29 = -1920519997;
            var7 = var10004;
            var10004 = (var7 | var29) - (var7 & var29);
            int var10005 = (int)-4308801438582935611L;
            var29 = 2064205521;
            var7 = var10005;
            var10005 = (var7 | var29) & ~(var7 & var29);
            var29 = 1316140136;
            var7 = var10005;
            var10005 = (var7 | var29) - (var7 & var29);
            var29 = -1228716537;
            var7 = 2035253341;
            var10005 = (var7 | var29) - (var7 & var29);
            var29 = -809259107;
            var7 = var10005;
            return a(
               "ᆏ꒯ᆨꓓᆥꓒᆨ꒭ᇜ", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍\u2459謸㑹f\ua7e3꒭ꁥꤨ絳蹄⑯", var10002, var10003, var10004, var7 & ~var29 | ~var7 & var29
            );
         }
      }

      return var1.a();
   }

   public void a(float var1, float var2, ConfigEntry var3) {
      this.a(var1, var2, 0.0F, var3);
   }

   public void a() {
      if (this.l) {
         int var10002 = (int)-9132969008933695559L;
         int var2 = 1298911184;
         int var1 = var10002;
         var10002 = (var1 | var2) - (var1 & var2);
         var2 = 365720750;
         var1 = var10002;
         var10002 = (var1 | var2) - (var1 & var2);
         int var10003 = (int)-395070427887506572L;
         var2 = 994222128;
         var1 = var10003;
         var10003 = (var1 | var2) & ~(var1 & var2);
         var2 = -1425989567;
         var1 = var10003;
         var2 = (var1 | var2) & (~var1 | ~var2);
         var1 = var10002;
         var10002 = 2 * (var1 | var2) - (var1 ^ var2);
         this.q.a(0.0, 0.15, pulse.Easing.g);
         GuiInteractionState var10000 = pulse.GuiInteractionState.a();
         var2 = 1941154818;
         var1 = 803016135;
         int var10001 = (var1 | var2) & (~var1 | ~var2);
         var2 = 1550754245;
         var1 = var10001;
         var10000.d(pulse.Bool.from(var1 + var2 - 2 * (var1 & var2)));
         GuiInput.a();
      }
   }

   public boolean b() {
      return this.l;
   }

   public boolean c() {
      if (this.l) {
         double var10000 = this.q.j();
         int var2 = -1506294632;
         int var1 = 627008642;
         int var10001 = var1 & ~var2 | ~var1 & var2;
         var2 = -933262769;
         var1 = var10001;
         var10001 = (var1 | var2) & ~(var1 & var2);
         if (!(var10000 < 0.01)) {
            int var15 = (int)1002049774664708995L;
            var2 = 1963674336;
            var1 = var15;
            int var16 = (var1 | var2) - (var1 & var2);
            var2 = 1999452515;
            var1 = var16;
            return pulse.Bool.from((var1 | var2) - (var1 & var2));
         }
      }

      int var9 = -1387518523;
      int var4 = -1942601968;
      int var13 = (var4 | var9) & ~(var4 & var9);
      var9 = 561650388;
      var4 = var13;
      return pulse.Bool.from((var4 | var9) - (var4 & var9));
   }

   public ConfigEntry d() {
      return this.p;
   }

   public void a(Consumer<ConfigActionMenu.Action> var1) {
      this.t = var1;
   }

   public void a(Runnable var1) {
      this.u = var1;
   }

   public void a(MatrixStack var1, Renderer2D var2, int var3, int var4) {
      this.q.a();
      float var5 = (float)this.q.j();
      int var10001 = (int)8473458477922544751L;
      int var34 = 812028378;
      int var33 = var10001;
      var10001 = var33 & ~var34 | ~var33 & var34;
      var34 = -360957056;
      var33 = var10001;
      var10001 = var33 & ~var34 | ~var33 & var34;
      if (var5 < 0.01F) {
         if (this.l && this.q.d()) {
            var34 = -2136431665;
            var33 = -1127631807;
            var10001 = (var33 | var34) & ~(var33 & var34);
            var34 = 1012995982;
            var33 = var10001;
            this.l = pulse.Bool.from((var33 | var34) & (~var33 | ~var34));
            if (this.u != null) {
               this.u.run();
            }
         }
      } else {
         int var10000 = (int)-5440372546240885012L;
         var34 = 999352423;
         var33 = var10000;
         var10000 = (var33 | var34) & (~var33 | ~var34);
         var34 = 1813423755;
         var33 = var10000;
         int var6 = var33 + var34 - 2 * (var33 & var34);

         while (true) {
            var10001 = (int)-3483547219877955135L;
            var34 = 1867190303;
            var33 = var10001;
            var10001 = var33 + var34 - 2 * (var33 & var34);
            var34 = -141235750;
            var33 = var10001;
            if (var6 >= (var33 | var34) - (var33 & var34)) {
               var10000 = (int)3088696363802580004L;
               var34 = -399427223;
               var33 = var10000;
               var10000 = (var33 | var34) & ~(var33 & var34);
               var34 = 1190347976;
               var33 = var10000;
               var10000 = (var33 + var34 - 2 * (var33 & var34)) * (var33 + var34 - 2 * (var33 & var34));
               float var35 = 69.5F;
               float var7 = Math.max(0.0F, Math.min(1.0F, var5));
               var10000 = (int)5028084240883509818L;
               var34 = 1115682435;
               var33 = var10000;
               var10000 = var33 & ~var34 | ~var33 & var34;
               var34 = -1430017616;
               var33 = var10000;
               var10000 = var33 & ~var34 | ~var33 & var34;
               int var8 = (int)(255.0F * var7);
               var34 = -430229945;
               var33 = 5498492;
               var10000 = (var33 | var34) & ~(var33 & var34);
               var34 = 91175958;
               var33 = var10000;
               var10000 = (var33 | var34) & (~var33 | ~var34);
               float var9 = 79.0F * var7;
               float var10 = var35 * var7;
               var34 = 1402942084;
               var33 = 645608741;
               var10001 = (var33 | var34) - (var33 & var34);
               var34 = -1205054515;
               var33 = var10001;
               var10001 = (var33 | var34) & ~(var33 & var34);
               int var10002 = (int)-5368355307146043305L;
               var34 = 1074705602;
               var33 = var10002;
               var10002 = (var33 | var34) - (var33 & var34);
               var34 = -1160415605;
               var33 = var10002;
               var34 = (var33 | var34) & (~var33 | ~var34);
               var33 = var10001;
               var10001 = (var33 ^ var34) + 2 * (var33 & var34);
               float var11 = this.m + 39.5F;
               float var12 = this.n + var35 / 2.0F;
               float var13 = var11 - var9 / 2.0F;
               float var14 = var12 - var10 / 2.0F;
               Color var15 = pulse.Theme.a(pulse.Theme.q, var8);
               Color var16 = pulse.Theme.a(pulse.Theme.r, var8);
               var34 = 1312398344;
               var33 = -73187041;
               var10002 = var33 & ~var34 | ~var33 & var34;
               var34 = 655606797;
               var33 = var10002;
               var10002 = var33 + var34 - 2 * (var33 & var34);
               int var10003 = (int)-2121211591000806984L;
               var34 = -23474276;
               var33 = var10003;
               var10003 = (var33 | var34) - (var33 & var34);
               var34 = 2011691499;
               var33 = var10003;
               var34 = var33 + var34 - 2 * (var33 & var34);
               var33 = var10002;
               var10002 = (var33 | var34) + (var33 & var34);
               float var206 = var13 - 0.5F * var7;
               var34 = 1946327379;
               var33 = 1659439293;
               var10003 = var33 + var34 - 2 * (var33 & var34);
               var34 = 1564089318;
               var33 = var10003;
               var10003 = (var33 | var34) - (var33 & var34);
               float var224 = var14 - 0.5F * var7;
               float var240 = var9 + var7;
               float var10004 = var10 + var7;
               int var10005 = (int)-641376728448692555L;
               var34 = 1373550251;
               var33 = var10005;
               var10005 = (var33 | var34) & ~(var33 & var34);
               var34 = 429034314;
               var33 = var10005;
               var10005 = ((var33 | var34) - (var33 & var34)) * ((var33 | var34) - (var33 & var34));
               var2.a(var206, var224, var240, var10004, 9.5F * var7, var15, var15, var16, var16, var1);
               Color var17 = pulse.Theme.a(pulse.Theme.e, var8);
               Color var18 = pulse.Theme.a(pulse.Theme.f, var8);
               var34 = 1555711699;
               var33 = 1997921969;
               int var10006 = (var33 | var34) - (var33 & var34);
               var34 = 732928109;
               var33 = var10006;
               var10006 = var33 + var34 - 2 * (var33 & var34);
               var34 = 971922006;
               var33 = 1708487565;
               var10006 = (var33 | var34) - (var33 & var34);
               var34 = 1547381193;
               var33 = var10006;
               var10006 = (var33 | var34) - (var33 & var34);
               var10006 = (int)-5158072029006431152L;
               var34 = 1846226063;
               var33 = var10006;
               var10006 = var33 + var34 - 2 * (var33 & var34);
               var34 = 389697747;
               var33 = var10006;
               var10006 = (var33 | var34) - (var33 & var34);
               var34 = 1242487999;
               var33 = 1209789527;
               var10006 = var33 & ~var34 | ~var33 & var34;
               var34 = 34943203;
               var33 = var10006;
               var10006 = (var33 | var34) - (var33 & var34);
               var2.a(var13, var14, var9, var10, 9.5F * var7, var17, var17, var18, var18, var1);
               String var207 = "dnn";
               if (var7 > 0.1F) {
                  var1.push();
                  var1.translate(var11, var12, 0.0F);
                  var1.scale(var7, var7, 1.0F);
                  var1.translate(-var11, -var12, 0.0F);
                  String var208 = "dno";
                  int var19 = (int)(this.m + 12.0F);
                  var10001 = (int)-5438534540924234506L;
                  var34 = -851158042;
                  var33 = var10001;
                  var10001 = (var33 | var34) - (var33 & var34);
                  var34 = -1400177240;
                  var33 = var10001;
                  var10001 = (var33 | var34) - (var33 & var34);
                  int var20 = (int)(this.n + 11.0F);
                  var10000 = (int)1652873686603536333L;
                  var34 = 1753606795;
                  var33 = var10000;
                  var10000 = (var33 | var34) & ~(var33 & var34);
                  var34 = -168458910;
                  var33 = var10000;
                  var10000 = (var33 | var34) & ~(var33 & var34);
                  float var21 = 13.5F;
                  var10001 = (int)-9047063123653795195L;
                  var34 = -646886559;
                  var33 = var10001;
                  var10001 = (var33 | var34) & (~var33 | ~var34);
                  var34 = 1734683112;
                  var33 = var10001;
                  FontRenderer var22 = FontManager.a[(var33 | var34) - (var33 & var34)];
                  ConfigActionMenu.Action[] var23 = ConfigActionMenu.Action.values();
                  var34 = -1364528566;
                  var33 = 1231801637;
                  var10000 = var33 & ~var34 | ~var33 & var34;
                  var34 = -406765713;
                  var33 = var10000;

                  for (int var24 = var33 & ~var34 | ~var33 & var34; var24 < var23.length; var24++) {
                     float var25;
                     boolean var28;
                     label70: {
                        var25 = var20 + var24 * var21;
                        var10000 = (int)-508596080733362136L;
                        var34 = 398441254;
                        var33 = var10000;
                        var10000 = (var33 | var34) & ~(var33 & var34);
                        var34 = -1868935743;
                        var33 = var10000;
                        var10000 = (var33 | var34) & ~(var33 & var34);
                        float var26 = 55.0F;
                        var10000 = (int)-5180553984531100023L;
                        var34 = 1302102803;
                        var33 = var10000;
                        var10000 = (var33 | var34) & ~(var33 & var34);
                        var34 = 420281292;
                        var33 = var10000;
                        var10000 = (var33 + var34 - 2 * (var33 & var34)) * (var33 + var34 - 2 * (var33 & var34));
                        float var27 = 7.0F;
                        var28 = this.a(var23[var24]);
                        if (!var28) {
                           var34 = 846709601;
                           var33 = 420179858;
                           var10001 = var33 + var34 - 2 * (var33 & var34);
                           var34 = 1759514414;
                           var33 = var10001;
                           var10001 = ((var33 | var34) & ~(var33 & var34)) * ((var33 | var34) & ~(var33 & var34));
                           if (var7 > 0.5F) {
                              var10002 = (int)7733289058021918130L;
                              var34 = 1430304152;
                              var33 = var10002;
                              var10002 = (var33 | var34) & (~var33 | ~var34);
                              var34 = -1517326298;
                              var33 = var10002;
                              var10002 = (var33 | var34) - (var33 & var34);
                              var10002 = (int)4180403889061433593L;
                              var34 = 1294372577;
                              var33 = var10002;
                              var10002 = (var33 | var34) - (var33 & var34);
                              var34 = 1947049503;
                              var33 = var10002;
                              var10002 = (var33 | var34) - (var33 & var34);
                              float var192 = var13 + 12.0F * var7;
                              String var216 = "dnp";
                              float var193 = var192 - 5.0F;
                              var34 = 899028688;
                              var33 = -1863857406;
                              var10002 = (var33 | var34) & ~(var33 & var34);
                              var34 = -2019936258;
                              var33 = var10002;
                              var10002 = var33 & ~var34 | ~var33 & var34;
                              float var217 = var14 + 11.0F * var7 + var24 * var21 * var7 - 2.0F;
                              float var233 = var26 * var7;
                              var10003 = (int)-5655827846582924932L;
                              var34 = 1257162183;
                              var33 = var10003;
                              var10003 = (var33 | var34) & ~(var33 & var34);
                              var34 = -300976678;
                              var33 = var10003;
                              var10003 = (var33 | var34) & ~(var33 & var34);
                              float var234 = var233 + 10.0F;
                              float var244 = var27 * var7;
                              int var245 = (int)-5678021185377416775L;
                              var34 = 718706853;
                              var33 = var245;
                              int var246 = var33 & ~var34 | ~var33 & var34;
                              var34 = -505373454;
                              var33 = var246;
                              int var247 = (var33 | var34) & ~(var33 & var34);
                              var34 = 1243974364;
                              var33 = 2137912274;
                              var10005 = var33 + var34 - 2 * (var33 & var34);
                              var34 = -1029998636;
                              var33 = var10005;
                              var34 = var33 + var34 - 2 * (var33 & var34);
                              var33 = var247;
                              int var248 = var33 - ~var34 - 1;
                              if (GuiInput.a(var193, var217, var234, var244 + 4.0F, var3, var4)) {
                                 var10000 = (int)4145019625145636578L;
                                 var34 = -1661242545;
                                 var33 = var10000;
                                 var10000 = (var33 | var34) & ~(var33 & var34);
                                 var34 = -617650772;
                                 var33 = var10000;
                                 var10000 = var33 & ~var34 | ~var33 & var34;
                                 break label70;
                              }
                           }
                        }

                        var34 = 1804210374;
                        var33 = -76672244;
                        var10000 = var33 + var34 - 2 * (var33 & var34);
                        var34 = -1864105014;
                        var33 = var10000;
                        var10000 = (var33 | var34) - (var33 & var34);
                     }

                     int var29 = var10000;
                     if (pulse.Bool.from(var29) != this.s[var24]) {
                        pulse.AnimationState var198 = this.r[var24];
                        double var218 = var29 == 0 ? 0.0 : 1.0;
                        String var235 = "dnq";
                        var198.a(var218, 0.15, pulse.Easing.h);
                        this.s[var24] = pulse.Bool.from(var29);
                     }

                     float var30 = (float)this.r[var24].j();
                     Color var31;
                     if (!var28) {
                        if (var23[var24] != ConfigActionMenu.Action.DELETE) {
                           var31 = ColorUtils.a(pulse.Theme.a, pulse.Theme.aa, var30);
                        } else {
                           var34 = 1942795621;
                           var33 = 94753568;
                           var10002 = (var33 | var34) - (var33 & var34);
                           var34 = 1986618971;
                           var33 = var10002;
                           var31 = ColorUtils.a(pulse.Theme.Z, pulse.Theme.b(pulse.Theme.Z, var33 + var34 - 2 * (var33 & var34)), var30);
                        }
                     } else {
                        var31 = pulse.Theme.b;
                     }

                     var31 = pulse.Theme.a(var31, var8);
                     String var32 = this.b(var23[var24]);
                     this.a(var1, var2, var22, var19, var25, 1.0F, var23[var24], var32, var31, var8);
                     if (var29 != 0) {
                        GuiInput.g();
                     }
                  }

                  var1.pop();
               }

               return;
            }

            this.r[var6].a();
            var6++;
         }
      }
   }

   private void a(MatrixStack var1, Renderer2D var2, FontRenderer var3, float var4, float var5, float var6, ConfigActionMenu.Action var7, String var8, Color var9, int var10) {
      int var14 = -1801265332;
      int var13 = -644599658;
      int var10000 = (var13 | var14) & (~var13 | ~var14);
      var14 = -2117783607;
      var13 = var10000;
      var10000 = ((var13 | var14) - (var13 & var14)) * ((var13 | var14) - (var13 & var14));
      float var11 = 8.0F * var6;
      float var22 = var4 + var11;
      var14 = -1179149269;
      var13 = -847170488;
      int var10001 = (var13 | var14) - (var13 & var14);
      var14 = 2095911055;
      var13 = var10001;
      var10001 = ((var13 | var14) - (var13 & var14)) * ((var13 | var14) - (var13 & var14));
      float var12 = var22 + 4.0F * var6;
      this.a(var1, var2, var4, var5, var11, var7, var9);
      var3.a(var8, var12, var5, var9, var1);
   }

   private void a(MatrixStack var1, Renderer2D var2, float var3, float var4, float var5, ConfigActionMenu.Action var6, Color var7) {
      String var8;
      switch (var6) {
         case SAVE_TO:
            int var268 = (int)5323764864678699407L;
            int var222 = -1336564708;
            int var105 = var268;
            var268 = (var105 | var222) - (var105 & var222);
            var222 = 1648316767;
            var105 = var268;
            var268 = ((var105 | var222) - (var105 & var222)) * ((var105 | var222) - (var105 & var222));
            int var311 = (int)-3497499942205150520L;
            var222 = 744832451;
            var105 = var311;
            var311 = var105 & ~var222 | ~var105 & var222;
            var222 = 1787598592;
            var105 = var311;
            var311 = (var105 | var222) & (~var105 | ~var222);
            var222 = -1706165425;
            var105 = -2125398517;
            var311 = (var105 | var222) & (~var105 | ~var222);
            var222 = 454886742;
            var105 = var311;
            var311 = (var105 | var222) & ~(var105 & var222);
            var311 = (int)-6499741633618508939L;
            var222 = 467648882;
            var105 = var311;
            var311 = (var105 | var222) & (~var105 | ~var222);
            var222 = -947535347;
            var105 = var311;
            var311 = var105 + var222 - 2 * (var105 & var222);
            String var319 = "dnr";
            var311 = (int)1205306839154969297L;
            var222 = 1530330243;
            var105 = var311;
            var311 = var105 & ~var222 | ~var105 & var222;
            var222 = 502491882;
            var105 = var311;
            var311 = (var105 | var222) - (var105 & var222);
            String var337 = "dns";
            int var338 = (int)-5480641291343785818L;
            var222 = 586654387;
            var105 = var338;
            int var339 = var105 + var222 - 2 * (var105 & var222);
            var222 = 2137320766;
            var105 = var339;
            int var340 = var105 + var222 - 2 * (var105 & var222);
            int var374 = (int)5184965329084889736L;
            var222 = 2075436433;
            var105 = var374;
            var374 = (var105 | var222) & (~var105 | ~var222);
            var222 = -1620664565;
            var105 = var374;
            var374 = (var105 | var222) - (var105 & var222);
            var222 = -1524340586;
            var105 = -2029645913;
            var374 = var105 + var222 - 2 * (var105 & var222);
            var222 = 572679985;
            var105 = var374;
            var374 = (var105 | var222) & ~(var105 & var222);
            var222 = 488788740;
            var105 = -379076648;
            var374 = (var105 | var222) & ~(var105 & var222);
            var222 = -196743980;
            var105 = var374;
            var374 = (var105 | var222) - (var105 & var222);
            var222 = -1615328906;
            var105 = -703969208;
            var374 = var105 + var222 - 2 * (var105 & var222);
            var222 = 1236418867;
            var105 = var374;
            var374 = (var105 | var222) - (var105 & var222);
            var222 = 1837565737;
            var105 = 1304519046;
            int var361 = var105 & ~var222 | ~var105 & var222;
            var222 = 724674445;
            var105 = var361;
            var361 = (var105 | var222) - (var105 & var222);
            var374 = (int)-6535413334146056902L;
            var222 = 849519040;
            var105 = var374;
            var374 = (var105 | var222) & ~(var105 & var222);
            var222 = 625315414;
            var105 = var374;
            var374 = var105 + var222 - 2 * (var105 & var222);
            var374 = (int)-541939046277982677L;
            var222 = 2117860705;
            var105 = var374;
            var374 = var105 + var222 - 2 * (var105 & var222);
            var222 = 1990426383;
            var105 = var374;
            var8 = a(
               "鮶", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍\u2459謸㑹f\ua7e3꒭ꁥꤨ絳蹄⑯", var311, var340, var361, (var105 | var222) & (~var105 | ~var222)
            );
            break;
         case SHARE:
            String var258 = "dnt";
            int var183 = 77883405;
            int var66 = -292513095;
            int var275 = (var66 | var183) & (~var66 | ~var183);
            var183 = 272084235;
            var66 = var275;
            var275 = ((var66 | var183) - (var66 & var183)) * ((var66 | var183) - (var66 & var183));
            String var307 = "dnu";
            int var308 = (int)-3987546401726342062L;
            var183 = 959875118;
            var66 = var308;
            int var309 = (var66 | var183) - (var66 & var183);
            var183 = -110393148;
            var66 = var309;
            int var310 = (var66 | var183) & (~var66 | ~var183);
            var183 = 1264057504;
            var66 = -1176843874;
            int var332 = var66 & ~var183 | ~var66 & var183;
            var183 = 59652717;
            var66 = var332;
            var332 = (var66 | var183) & (~var66 | ~var183);
            int var353 = (int)207423605252552119L;
            var183 = -975609972;
            var66 = var353;
            var353 = (var66 | var183) & (~var66 | ~var183);
            var183 = -1829255314;
            var66 = var353;
            var183 = (var66 | var183) & (~var66 | ~var183);
            var66 = var332;
            var332 = (var66 | var183) + (var66 & var183);
            var183 = 1779179698;
            var66 = -1243736830;
            var332 = (var66 | var183) & (~var66 | ~var183);
            var183 = 40955253;
            var66 = var332;
            var332 = (var66 | var183) & ~(var66 & var183);
            var183 = -2134956068;
            var66 = -1308710018;
            var353 = var66 & ~var183 | ~var66 & var183;
            var183 = -7432373;
            var66 = var353;
            var353 = var66 & ~var183 | ~var66 & var183;
            var183 = -268114352;
            var66 = -1229051442;
            int var370 = var66 & ~var183 | ~var66 & var183;
            var183 = 1093920060;
            var66 = var370;
            var183 = (var66 | var183) & (~var66 | ~var183);
            var66 = var353;
            var353 = (var66 & ~var183) + (var183 & ~var66) + 2 * (var66 & var183);
            var353 = (int)5176516551730100652L;
            var183 = 750676344;
            var66 = var353;
            var353 = (var66 | var183) & ~(var66 & var183);
            var183 = -1250140056;
            var66 = var353;
            var353 = var66 & ~var183 | ~var66 & var183;
            String var371 = "dnv";
            var370 = (int)2716999153864855946L;
            var183 = -1828758525;
            var66 = var370;
            var370 = (var66 | var183) & ~(var66 & var183);
            var183 = 1603453014;
            var66 = var370;
            var8 = a("鮴", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍\u2459謸㑹f\ua7e3꒭ꁥꤨ絳蹄⑯", var310, var332, var353, (var66 | var183) - (var66 & var183));
            var258 = "dnw";
            var183 = 1701456737;
            var66 = -993823173;
            int var260 = (var66 | var183) - (var66 & var183);
            var183 = -307743783;
            var66 = var260;
            int var14 = (var66 | var183) & ~(var66 & var183);
            a = var14;
            var275 = (int)-4669058799599038038L;
            var183 = -1810741990;
            var66 = var275;
            var275 = var66 + var183 - 2 * (var66 & var183);
            var183 = -93416272;
            var66 = var275;
            var275 = var66 & ~var183 | ~var66 & var183;
            var275 = (int)5694690824692744293L;
            var183 = 1382287958;
            var66 = var275;
            var275 = (var66 | var183) & ~(var66 & var183);
            var183 = 1293470259;
            var66 = var275;
            var275 = (var66 | var183) & (~var66 | ~var183);
            var275 = (int)-4892040788765320930L;
            var183 = 1069368172;
            var66 = var275;
            var275 = (var66 | var183) & ~(var66 & var183);
            var183 = 1633065593;
            var66 = var275;
            var275 = (var66 | var183) & (~var66 | ~var183);
            var183 = 1027406483;
            var66 = 1958455158;
            var275 = (var66 | var183) & (~var66 | ~var183);
            var183 = 1233608164;
            var66 = var275;
            var275 = var66 & ~var183 | ~var66 & var183;
            var183 = 214956479;
            var66 = -1235799071;
            int var261 = (var66 | var183) - (var66 & var183);
            var183 = -419571380;
            var66 = var261;
            if (((var66 | var183) & ~(var66 & var183)) <= a) {
               int var262 = (int)-7472724403042767424L;
               var183 = -1232801703;
               var66 = var262;
               int var263 = (var66 | var183) & (~var66 | ~var183);
               var183 = 1272986388;
               var66 = var263;
               int var264 = (var66 | var183) & ~(var66 & var183);
               var275 = (int)-4556872065679774849L;
               var183 = 435873850;
               var66 = var275;
               var275 = var66 & ~var183 | ~var66 & var183;
               var183 = 314985442;
               var66 = var275;
               var183 = (var66 | var183) & ~(var66 & var183);
               var66 = var264;
               int var265 = var66 - ~var183 - 1;
               int var266 = (int)-1870922556848893034L;
               var183 = 841647485;
               var66 = var266;
               int var267 = (var66 | var183) & (~var66 | ~var183);
               var183 = 53811448;
               var66 = var267;
               var14 = var66 & ~var183 | ~var66 & var183;
               a = var14;
            }
            break;
         case RENAME:
            String var257 = "dnx";
            int var272 = (int)-2697367964634418766L;
            int var164 = 986119885;
            int var47 = var272;
            var272 = var47 + var164 - 2 * (var47 & var164);
            var164 = 1854781449;
            var47 = var272;
            var272 = (var47 | var164) - (var47 & var164);
            int var302 = (int)8814935507214800246L;
            var164 = -1500415292;
            var47 = var302;
            var302 = (var47 | var164) - (var47 & var164);
            var164 = 1877001659;
            var47 = var302;
            var302 = (var47 | var164) & ~(var47 & var164);
            var164 = -28084411;
            var47 = 1153402558;
            var302 = (var47 | var164) & (~var47 | ~var164);
            var164 = -720949949;
            var47 = var302;
            var302 = var47 & ~var164 | ~var47 & var164;
            int var325 = (int)-1868847174265187744L;
            var164 = -679796162;
            var47 = var325;
            var325 = (var47 | var164) - (var47 & var164);
            var164 = -856723639;
            var47 = var325;
            var325 = (var47 | var164) & ~(var47 & var164);
            var164 = -1139066520;
            var47 = -508512942;
            int var348 = (var47 | var164) & (~var47 | ~var164);
            var164 = -1656628849;
            var47 = var348;
            var164 = (var47 | var164) - (var47 & var164);
            var47 = var325;
            var325 = 2 * (var47 | var164) - (var47 ^ var164);
            var325 = (int)2407177876924004684L;
            var164 = 61469523;
            var47 = var325;
            var325 = (var47 | var164) - (var47 & var164);
            var164 = -1492920800;
            var47 = var325;
            var325 = (var47 | var164) & (~var47 | ~var164);
            String var349 = "dny";
            var348 = (int)1680979250934605382L;
            var164 = -1919628759;
            var47 = var348;
            var348 = (var47 | var164) - (var47 & var164);
            var164 = 1817406015;
            var47 = var348;
            var348 = (var47 | var164) & ~(var47 & var164);
            int var366 = (int)2940590143628084065L;
            var164 = -595683128;
            var47 = var366;
            var366 = (var47 | var164) & (~var47 | ~var164);
            var164 = 381403242;
            var47 = var366;
            var366 = ((var47 | var164) - (var47 & var164)) * ((var47 | var164) - (var47 & var164));
            var164 = 1448180361;
            var47 = 1416409735;
            var366 = var47 & ~var164 | ~var47 & var164;
            var164 = 34052439;
            var47 = var366;
            var8 = a("鮟", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍\u2459謸㑹f\ua7e3꒭ꁥꤨ絳蹄⑯", var302, var325, var348, var47 + var164 - 2 * (var47 & var164));
            break;
         case DELETE:
            int var10000 = (int)-2297878933795927474L;
            int var13 = -1561915606;
            int var12 = var10000;
            var10000 = (var12 | var13) & ~(var12 & var13);
            var13 = -1482680837;
            var12 = var10000;
            var10000 = var12 & ~var13 | ~var12 & var13;
            var13 = -2107907017;
            var12 = 195489527;
            int var10002 = var12 & ~var13 | ~var12 & var13;
            var13 = -1979905328;
            var12 = var10002;
            var10002 = var12 + var13 - 2 * (var12 & var13);
            var13 = -408033426;
            var12 = -648582093;
            var10002 = (var12 | var13) - (var12 & var13);
            var13 = 1056607062;
            var12 = var10002;
            var10002 = var12 + var13 - 2 * (var12 & var13);
            var13 = -485465752;
            var12 = 963279956;
            var10002 = (var12 | var13) & (~var12 | ~var13);
            var13 = -629531331;
            var12 = var10002;
            var10002 = (var12 | var13) & ~(var12 & var13);
            var13 = 915882969;
            var12 = -395186945;
            var10002 = (var12 | var13) - (var12 & var13);
            var13 = 654980058;
            var12 = var10002;
            var10002 = (var12 | var13) - (var12 & var13);
            var10002 = (int)-7624160057043402858L;
            var13 = 84465781;
            var12 = var10002;
            var10002 = (var12 | var13) - (var12 & var13);
            var13 = -203965605;
            var12 = var10002;
            var10002 = var12 + var13 - 2 * (var12 & var13);
            var13 = 456981612;
            var12 = 332924353;
            int var10004 = var12 & ~var13 | ~var12 & var13;
            var13 = 149223852;
            var12 = var10004;
            var10004 = (var12 | var13) & ~(var12 & var13);
            int var10003 = (int)-7907627405672569891L;
            var13 = -816658306;
            var12 = var10003;
            var10003 = var12 + var13 - 2 * (var12 & var13);
            var13 = 1318639554;
            var12 = var10003;
            var10003 = (var12 | var13) & (~var12 | ~var13);
            var10004 = (int)831378845854295814L;
            var13 = 484249097;
            var12 = var10004;
            var10004 = (var12 | var13) & ~(var12 & var13);
            var13 = -961832927;
            var12 = var10004;
            var10004 = var12 + var13 - 2 * (var12 & var13);
            int var10005 = (int)8208619384758704025L;
            var13 = -265987942;
            var12 = var10005;
            var10005 = var12 + var13 - 2 * (var12 & var13);
            var13 = 1019929982;
            var12 = var10005;
            var13 = (var12 | var13) & (~var12 | ~var13);
            var12 = var10004;
            var10004 = 2 * (var12 | var13) - (var12 ^ var13);
            var13 = -1510297164;
            var12 = -2069136824;
            var10004 = var12 & ~var13 | ~var12 & var13;
            var13 = 706942037;
            var12 = var10004;
            var10004 = (var12 | var13) & (~var12 | ~var13);
            String var364 = "dnz";
            var13 = -1050553133;
            var12 = -146997785;
            var10005 = var12 + var13 - 2 * (var12 & var13);
            var13 = 910268495;
            var12 = var10005;
            var8 = a(
               "鮲", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍\u2459謸㑹f\ua7e3꒭ꁥꤨ絳蹄⑯", var10002, var10003, var10004, (var12 | var13) & (~var12 | ~var13)
            );
            if (a != a) {
               var10000 = (int)5306392340848590334L;
               var13 = 600519998;
               var12 = var10000;
               var10000 = var12 + var13 - 2 * (var12 & var13);
               var13 = 1432919199;
               var12 = var10000;
               var10000 = (var12 | var13) & (~var12 | ~var13);
               int var10001 = (int)3466292284608296873L;
               var13 = 1032147814;
               var12 = var10001;
               var10001 = (var12 | var13) & ~(var12 & var13);
               var13 = 956694957;
               var12 = var10001;
               var13 = (var12 | var13) & (~var12 | ~var13);
               var12 = var10000;
               var10000 = var12 - ~var13 - 1;
               var13 = -190499450;
               var12 = 591010546;
               var10000 = (var12 | var13) & ~(var12 & var13);
               var13 = -1915656798;
               var12 = var10000;
               int var11 = var12 + var13 - 2 * (var12 & var13);
            }
            break;
         default:
            return;
      }

      int var290 = (int)7093062466710800832L;
      int var248 = 1421483930;
      int var131 = var290;
      var290 = (var131 | var248) & ~(var131 & var248);
      var248 = -850520492;
      var131 = var290;
      FontRenderer var9 = FontManager.e[(var131 | var248) - (var131 & var248)];
      var9.a(var8, var3, var4, var7, var1);
   }

   public boolean a(int var1, int var2) {
      if (this.l) {
         double var10000 = this.q.j();
         String var10001 = "doa";
         if (!(var10000 < 0.5)) {
            int var85 = (int)8678208092492021167L;
            int var50 = 1825027722;
            int var15 = var85;
            int var86 = (var15 | var50) - (var15 & var50);
            var50 = -434022606;
            var15 = var86;
            int var87 = (var15 | var50) - (var15 & var50);
            int var101 = (int)-4081900272923376078L;
            var50 = 753199971;
            var15 = var101;
            int var102 = var15 + var50 - 2 * (var15 & var50);
            var50 = -1337656254;
            var15 = var102;
            var50 = (var15 | var50) & (~var15 | ~var50);
            var15 = var87;
            int var88 = (var15 & ~var50) + (var50 & ~var15) + 2 * (var15 & var50);
            float var3 = 69.5F;
            var50 = -1506430161;
            var15 = 1383065927;
            int var10002 = var15 & ~var50 | ~var15 & var50;
            var50 = 418302022;
            var15 = var10002;
            var10002 = (var15 | var50) - (var15 & var50);
            if (!GuiInput.a(this.m, this.n, 79.0F, var3, var1, var2)) {
               this.a();
               var50 = 2135482091;
               var15 = -257180093;
               int var100 = (var15 | var50) - (var15 & var50);
               var50 = -1880923991;
               var15 = var100;
               return pulse.Bool.from((var15 | var50) & (var15 ^ -1 | var50 ^ -1));
            }

            float var89 = this.m;
            var50 = -993946308;
            var15 = -1323622828;
            var10002 = (var15 | var50) - (var15 & var50);
            var50 = 1977256827;
            var15 = var10002;
            var10002 = var15 + var50 - 2 * (var15 & var50);
            var50 = -250948482;
            var15 = 1732450872;
            var10002 = var15 + var50 - 2 * (var15 & var50);
            var50 = -1773547968;
            var15 = var10002;
            var10002 = (var15 | var50) - (var15 & var50);
            float var4 = var89 + 12.0F;
            var50 = 516853136;
            var15 = -1468732386;
            int var103 = (var15 | var50) & ~(var15 & var50);
            var50 = 27223638;
            var15 = var103;
            int var104 = (var15 & ~var50 | ~var15 & var50) * (var15 & ~var50 | ~var15 & var50);
            float var5 = this.n + 11.0F;
            var50 = 1520145647;
            var15 = -1145795619;
            int var90 = (var15 | var50) & ~(var15 & var50);
            var50 = 1859703905;
            var15 = var90;
            int var91 = (var15 | var50) & (~var15 | ~var50);
            int var105 = (int)-7921769112151861578L;
            var50 = 729787285;
            var15 = var105;
            int var106 = (var15 | var50) & ~(var15 & var50);
            var50 = -396948451;
            var15 = var106;
            var50 = (var15 | var50) & ~(var15 & var50);
            var15 = var91;
            int var92 = 2 * (var15 | var50) - (var15 ^ var50);
            float var6 = 13.5F;
            ConfigActionMenu.Action[] var7 = ConfigActionMenu.Action.values();
            var50 = -1292213507;
            var15 = -984966689;
            int var93 = var15 & ~var50 | ~var15 & var50;
            var50 = 2008087330;
            var15 = var93;

            for (int var8 = (var15 | var50) & (~var15 | ~var50); var8 < var7.length; var8++) {
               float var9 = var5 + var8 * var6;
               String var94 = "dob";
               float var10 = 55.0F;
               String var95 = "doc";
               float var11 = 7.0F;
               var10001 = "dod";
               float var96 = var4 - 5.0F;
               float var108 = var9 - 2.0F;
               var50 = 863837626;
               var15 = 1484621201;
               int var10003 = (var15 | var50) - (var15 & var50);
               var50 = -69816151;
               var15 = var10003;
               var10003 = ((var15 | var50) - (var15 & var50)) * ((var15 | var50) - (var15 & var50));
               float var114 = var10 + 10.0F;
               var50 = -1967381328;
               var15 = 1044416822;
               int var10005 = var15 & ~var50 | ~var15 & var50;
               var50 = -1258508905;
               var15 = var10005;
               var10005 = var15 & ~var50 | ~var15 & var50;
               var10005 = (int)-732618196571742355L;
               var50 = -1575403378;
               var15 = var10005;
               var10005 = (var15 | var50) & ~(var15 & var50);
               var50 = 524541930;
               var15 = var10005;
               var10005 = (var15 | var50) & (~var15 | ~var50);
               if (GuiInput.a(var96, var108, var114, var11 + 4.0F, var1, var2)) {
                  if (!this.a(var7[var8])) {
                     if (this.t != null) {
                        this.t.accept(var7[var8]);
                     }

                     this.a();
                     var50 = 289256530;
                     var15 = 1461005953;
                     int var98 = (var15 | var50) & ~(var15 & var50);
                     var50 = 1177066194;
                     var15 = var98;
                     return pulse.Bool.from(var15 + var50 - 2 * (var15 & var50));
                  }

                  var50 = 273177246;
                  var15 = 921030084;
                  int var97 = (var15 | var50) - (var15 & var50);
                  var50 = 648910683;
                  var15 = var97;
                  return pulse.Bool.from((var15 | var50) - (var15 & var50));
               }
            }

            var50 = 1511349606;
            var15 = 1888163065;
            int var99 = (var15 | var50) & ~(var15 & var50);
            var50 = 715016606;
            var15 = var99;
            return pulse.Bool.from(var15 & (var50 ^ -1) | (var15 ^ -1) & var50);
         }
      }

      int var13 = 1896240548;
      int var12 = 192798509;
      int var84 = var12 + var13 - 2 * (var12 & var13);
      var13 = 2054916745;
      var12 = var84;
      return pulse.Bool.from((var12 | var13) & (var12 ^ -1 | var13 ^ -1));
   }

   public boolean b(int var1, int var2) {
      if (this.l) {
         int var12 = 1214524674;
         int var7 = -591263316;
         int var17 = var7 + var12 - 2 * (var7 & var12);
         var12 = -1615351927;
         var7 = var17;
         var17 = (var7 | var12) - (var7 & var12);
         float var3 = 69.5F;
         var12 = -47908267;
         var7 = -1335984769;
         int var10002 = (var7 | var12) & (~var7 | ~var12);
         var12 = -1231527657;
         var7 = var10002;
         var10002 = var7 + var12 - 2 * (var7 & var12);
         return GuiInput.a(this.m, this.n, 79.0F, var3, var1, var2);
      } else {
         int var10000 = (int)-8138794934451926790L;
         int var5 = -171773011;
         int var4 = var10000;
         var10000 = var4 + var5 - 2 * (var4 & var5);
         var5 = 771521367;
         var4 = var10000;
         return pulse.Bool.from((var4 | var5) - (var4 & var5));
      }
   }

   public static String a(String var0, String var1, int var2, int var3, int var4, int var5) {
      char[] var6 = var1.toCharArray();
      char[] var7 = new char[var6.length];
      int var18 = 559153093;
      int var17 = -669379805;
      int var10000 = var17 & ~var18 | ~var17 & var18;
      var18 = -112595732;
      var17 = var10000;
      char[] var261 = new char[var17 & ~var18 | ~var17 & var18];
      int var10002 = (int)2478248933697692845L;
      var18 = -444114879;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -1148322580;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -251960052;
      var17 = 2053204365;
      int var10003 = (var17 | var18) - (var17 & var18);
      var18 = -1969601357;
      var17 = var10003;
      var261[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var10002 = (int)2115037701615479381L;
      var18 = 1143418658;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 796804470;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -1657065233;
      var17 = 513340540;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -2086410474;
      var17 = var10003;
      var261[var10002] = (char)((var17 | var18) - (var17 & var18));
      var10002 = (int)-8663995482941338908L;
      var18 = -1010464571;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -730545629;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 2131599813;
      var17 = 1713441691;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 422349272;
      var17 = var10003;
      var261[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var10002 = (int)-4467030639718935290L;
      var18 = 999915179;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -715314258;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 336730194;
      var17 = -55889206;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 928943120;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      int var10004 = (int)-543530849989252376L;
      var18 = -143585528;
      var17 = var10004;
      var10004 = (var17 | var18) & ~(var17 & var18);
      var18 = 1665446687;
      var17 = var10004;
      var18 = var17 + var18 - 2 * (var17 & var18);
      var17 = var10003;
      var10003 = var17 - ~var18 - 1;
      var10003 = (int)-1670847485797619766L;
      var18 = 4458999;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 1869166126;
      var17 = var10003;
      var261[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var18 = -188870127;
      var17 = 310745244;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -432305527;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var10003 = (int)-8909912668731789277L;
      var18 = -2039471173;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -2091604809;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 1501786533;
      var17 = 597878883;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 2048985315;
      var17 = var10003;
      var261[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var18 = 2132125046;
      var17 = -1319646511;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -834506846;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)-8734043596146170382L;
      var18 = 1123538943;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -1944504433;
      var17 = var10003;
      var261[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var10002 = (int)3032677023656150265L;
      var18 = -1561175280;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -881729553;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)8581763602719254202L;
      var18 = -876381464;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -2051648191;
      var17 = var10003;
      var261[var10002] = (char)((var17 | var18) - (var17 & var18));
      var18 = -1154736456;
      var17 = 309282832;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -1455204689;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)-3944760519513008042L;
      var18 = -1100207989;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1877146369;
      var17 = var10003;
      var261[var10002] = (char)((var17 | var18) - (var17 & var18));
      var18 = -1302689045;
      var17 = 48383664;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1330066349;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 416607344;
      var17 = -1822452510;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -1953795903;
      var17 = var10003;
      var261[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var10002 = (int)25110177022234480L;
      var18 = -379428101;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 1154100610;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 866224794;
      var17 = 2056524441;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 1228250919;
      var17 = var10003;
      var261[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      char[] var8 = var261;
      var10000 = (int)6989596043656732919L;
      var18 = -1682923856;
      var17 = var10000;
      var10000 = (var17 | var18) - (var17 & var18);
      var18 = 571620941;
      var17 = var10000;
      char[] var264 = new char[var17 & ~var18 | ~var17 & var18];
      var10002 = (int)3493712624359154244L;
      var18 = -609287916;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -912874672;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)-8427119164294576929L;
      var18 = 1341583176;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1683790921;
      var17 = var10003;
      var264[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var10002 = (int)3683685841370446957L;
      var18 = -1685092662;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -326436186;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var10003 = (int)-893969900012155734L;
      var18 = 322641222;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -281782197;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var10004 = (int)5951290204630052025L;
      var18 = -1313187260;
      var17 = var10004;
      var10004 = var17 + var18 - 2 * (var17 & var18);
      var18 = 943677525;
      var17 = var10004;
      var18 = (var17 | var18) - (var17 & var18);
      var17 = var10003;
      var10003 = (var17 | var18) + (var17 & var18);
      var10003 = (int)6884699644113628080L;
      var18 = 385706984;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1772403621;
      var17 = var10003;
      var264[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var10002 = (int)-7406132112779978004L;
      var18 = -120136903;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -889978409;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -622450937;
      var17 = -1874140877;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1029464511;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var10003 = (int)-8827409845467393798L;
      var18 = -152439804;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 348660653;
      var17 = var10003;
      var264[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var10002 = (int)1662074567577335155L;
      var18 = 551208667;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 2121446315;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)4716438799364083197L;
      var18 = 838733762;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 1493793341;
      var17 = var10003;
      var264[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var18 = 1250184164;
      var17 = 1902028448;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1004203328;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 525677990;
      var17 = -1946671376;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -1800590570;
      var17 = var10003;
      var264[var10002] = (char)((var17 | var18) - (var17 & var18));
      var10002 = (int)380970392814335296L;
      var18 = -1068894310;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 99238623;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)6612265277628990107L;
      var18 = 209211622;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1782469911;
      var17 = var10003;
      var264[var10002] = (char)((var17 | var18) - (var17 & var18));
      var18 = 1394657694;
      var17 = 1573404479;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 250148519;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -2034944565;
      var17 = 1984034962;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -2128241248;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var10004 = (int)2093107067352165946L;
      var18 = -187266014;
      var17 = var10004;
      var10004 = (var17 | var18) & (~var17 | ~var18);
      var18 = 582842771;
      var17 = var10004;
      var18 = var17 & ~var18 | ~var17 & var18;
      var17 = var10003;
      var10003 = (var17 | var18) + (var17 & var18);
      var18 = -1436821072;
      var17 = -571477448;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 2008329393;
      var17 = var10003;
      var264[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var18 = -1369297375;
      var17 = 247619547;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -1600097795;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var10003 = (int)8002353410112808606L;
      var18 = -1559025702;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1677995652;
      var17 = var10003;
      var264[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var18 = 1315117045;
      var17 = -1415650900;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -436341167;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -274360367;
      var17 = 1393129764;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -288824982;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 1533167685;
      var17 = -806812516;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -1802776611;
      var17 = var10003;
      var264[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var10002 = (int)-3564131567203128404L;
      var18 = -749184209;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -146689910;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)-3774439203844164975L;
      var18 = -735313935;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1755627091;
      var17 = var10003;
      var264[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      char[] var9 = var264;
      var10000 = (int)2133153247286777303L;
      var18 = 1015442961;
      var17 = var10000;
      var10000 = (var17 | var18) & ~(var17 & var18);
      var18 = -1350976570;
      var17 = var10000;

      for (int var10 = var17 & ~var18 | ~var17 & var18; var10 < var6.length; var10++) {
         char var322 = var6[var10];
         char var247 = var8[var10 % var8.length];
         char var127 = var322;
         var7[var10] = (char)((var127 | var247) & (~var127 | ~var247));
      }

      char[] var19 = new char[var7.length];
      var10000 = (int)-4190305249462031669L;
      var18 = 2141224120;
      var17 = var10000;
      var10000 = var17 + var18 - 2 * (var17 & var18);
      var18 = -688122253;
      var17 = var10000;

      for (int var11 = (var17 | var18) & ~(var17 & var18); var11 < var6.length; var11++) {
         char var323 = var7[var11];
         char var250 = var9[var11 % var9.length];
         char var130 = var323;
         var19[var11] = (char)((var130 | var250) - (var130 & var250));
      }

      String var20 = new String(var19);
      int var12 = var20.hashCode();
      var18 = var5;
      var17 = var3;
      var10000 = var17 - var18;
      var18 = var2;
      var17 = var10000;
      int var13 = 2 * (var17 & ~var18) - (var17 ^ var18);
      char[] var14 = var0.toCharArray();
      char[] var15 = new char[var14.length];
      var18 = -643852029;
      var17 = -1142768435;
      var10000 = (var17 | var18) - (var17 & var18);
      var18 = 1652368846;
      var17 = var10000;

      for (int var16 = var17 + var18 - 2 * (var17 & var18); var16 < var15.length; var16++) {
         var18 = 1151559221;
         var17 = -501399279;
         int var10001 = (var17 | var18) & (~var17 | ~var18);
         var18 = -1497487578;
         var17 = var10001;
         switch (var16 % ((var17 | var18) & ~(var17 & var18))) {
            case 0:
               var18 = var12;
               var17 = var13;
               var10002 = (var17 | var18) & (~var17 | ~var18);
               char var260 = var14[var16];
               var17 = var10002;
               var15[var16] = (char)(var17 & ~var260 | ~var17 & var260);
               break;
            case 1:
               var18 = var13;
               var17 = var5;
               var10002 = var17 + var18 - 2 * (var17 & var18);
               char var258 = var14[var16];
               var17 = var10002;
               var15[var16] = (char)((var17 | var258) & ~(var17 & var258));
         }
      }

      return new String(var15);
   }

   public enum Action {
      SAVE_TO("\u0421\u043e\u0445\u0440\u0430\u043d\u0438\u0442\u044c \u0432"),
      SHARE("\u041f\u043e\u0434\u0435\u043b\u0438\u0442\u044c\u0441\u044f"),
      RENAME("\u041f\u0435\u0440\u0435\u0438\u043c\u0435\u043d\u043e\u0432\u0430\u0442\u044c"),
      DELETE("\u0423\u0434\u0430\u043b\u0438\u0442\u044c");

      private final String label;
      public static int e;
      public static boolean f;

      Action(String label) {
         this.label = label;
      }

      public String a() {
         return this.label;
      }

      public static String a(String value, String key, int seed1, int seed2, int seed3, int seed4) {
         return value;
      }
   }
}
