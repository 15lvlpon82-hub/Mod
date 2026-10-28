package pulse;


import pulse.module.ClientModule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.minecraft.client.util.math.MatrixStack;

public class ModuleCardList {
   private final List<ModuleCard> c = new ArrayList<>();
   private float d;
   private float e;
   public static int a;
   public static boolean b;

   public List<ModuleCard> a() {
      return this.c;
   }

   public boolean hasOpenPanelAt(int mouseX, int mouseY) {
      for (ModuleCard panel : this.c) {
         if (!panel.f() && (panel.d(mouseX, mouseY) || panel.f(mouseX, mouseY))) {
            return true;
         }
      }

      return false;
   }

   public void a(float var1, float var2, float var3, int var4, float var5, float var6) {
      this.d = var1;
      this.e = var2;
      float var7 = var1 - var3;
      Iterator var8 = this.c.iterator();

      while (var8.hasNext()) {
         ModuleCard var9 = (ModuleCard)var8.next();
         if (!var9.e()) {
            int var10 = var9.m();
            if (var10 >= 0) {
               int var11 = var10 / var4;
               float var12 = var7 + var11 * (var5 + var6) + 1.0F;
               var9.a(var12);
               if (!var9.f() && var9.a(var1, var2)) {
                  var9.b();
               }
            }
         } else {
            var8.remove();
         }
      }
   }

   public void b() {
      int var12 = 1505867643;
      int var11 = -1593226929;
      int var10000 = var11 + var12 - 2 * (var11 & var12);
      var12 = -121045452;
      var11 = var10000;
      int var1 = var11 + var12 - 2 * (var11 & var12);
      var10000 = (int)-162890120638920299L;
      var12 = -732160370;
      var11 = var10000;
      var10000 = (var11 | var12) - (var11 & var12);
      var12 = -1984325861;
      var11 = var10000;
      int var2 = (var11 | var12) & (~var11 | ~var12);

      for (ModuleCard var4 : this.c) {
         if (!var4.f() && var4.g()) {
            var12 = 482775337;
            var11 = -868493430;
            var10000 = var11 + var12 - 2 * (var11 & var12);
            var12 = -788707678;
            var11 = var10000;
            var1 = var11 + var12 - 2 * (var11 & var12);
            float var5 = var4.j();
            float var6 = var4.i();
            var10000 = (int)-1071885993085783381L;
            var12 = -517414574;
            var11 = var10000;
            var10000 = (var11 | var12) & (~var11 | ~var12);
            var12 = -1755140585;
            var11 = var10000;
            var10000 = ((var11 | var12) & (~var11 | ~var12)) * ((var11 | var12) & (~var11 | ~var12));
            float var7 = 150.0F;
            float var8 = var4.k();
            GuiInput.a(var5, var6, var7, var8);
            break;
         }
      }

      if (var1 == 0) {
         for (ModuleCard var14 : this.c) {
            if (!var14.f() && !var14.g() && var14.u()) {
               var10000 = (int)-1759977019862683839L;
               var12 = -55955765;
               var11 = var10000;
               var10000 = (var11 | var12) & ~(var11 & var12);
               var12 = 1519501707;
               var11 = var10000;
               var2 = var11 + var12 - 2 * (var11 & var12);
               float[] var15 = var14.w();
               if (var15 != null) {
                  int var10001 = (int)-5179532075645487123L;
                  var12 = -1239872436;
                  var11 = var10001;
                  var10001 = var11 + var12 - 2 * (var11 & var12);
                  var12 = -1234060383;
                  var11 = var10001;
                  float var62 = var15[var11 + var12 - 2 * (var11 & var12)];
                  var12 = 1397145923;
                  var11 = -1456238748;
                  int var10002 = (var11 | var12) & (~var11 | ~var12);
                  var12 = -92975578;
                  var11 = var10002;
                  float var66 = var15[(var11 | var12) - (var11 & var12)];
                  var12 = -42572929;
                  var11 = -1604104092;
                  int var10003 = (var11 | var12) & ~(var11 & var12);
                  var12 = 1561670425;
                  var11 = var10003;
                  float var67 = var15[(var11 | var12) & ~(var11 & var12)];
                  int var10004 = (int)3971346774537223356L;
                  var12 = -1908879811;
                  var11 = var10004;
                  var10004 = var11 & ~var12 | ~var11 & var12;
                  var12 = 1041756802;
                  var11 = var10004;
                  GuiInput.a(var62, var66, var67, var15[(var11 | var12) & (~var11 | ~var12)]);
               }
               break;
            }
         }
      }

      if (var1 != 0) {
         if (a != a) {
            String var63 = "epe";
            var12 = -540674364;
            var11 = 1443277679;
            var10000 = (var11 | var12) & (~var11 | ~var12);
            var12 = -1823835304;
            var11 = var10000;
            int var10 = (var11 | var12) & ~(var11 & var12);
         }
      } else if (var2 == 0) {
         GuiInput.a();
      }

      GuiInteractionState.a().a(pulse.Bool.from(var1));
      GuiInteractionState.a().c(pulse.Bool.from(var2));
   }

   public void a(MatrixStack var1, Renderer2D var2, float var3, float var4, int var5, int var6, float var7, float var8) {
      ModuleCard var9 = this.a(var5, var6);
      int var32;
      if (var9 != null) {
         int var15 = 54094428;
         int var14 = 1145212765;
         var32 = var14 + var15 - 2 * (var14 & var15);
         var15 = 1199301888;
         var14 = var32;
         var32 = (var14 | var15) & ~(var14 & var15);
      } else {
         var32 = (int)4877413512049386272L;
         int var26 = 1775933075;
         int var19 = var32;
         var32 = var19 & ~var26 | ~var19 & var26;
         var26 = 163476915;
         var19 = var32;
         var32 = var19 + var26 - 2 * (var19 & var26);
      }

      int var10 = var32;

      for (ModuleCard var12 : this.c) {
         if (!var12.g()) {
            if (var10 != 0 && var9 != var12) {
               int var30 = -515626344;
               int var23 = -2012972249;
               var32 = var23 & ~var30 | ~var23 & var30;
               var30 = 1765822910;
               var23 = var32;
               var32 = (var23 | var30) & ~(var23 & var30);
            } else {
               int var28 = -1173006473;
               int var21 = 1220541509;
               var32 = var21 & ~var28 | ~var21 & var28;
               var28 = -223696078;
               var21 = var32;
               var32 = (var21 | var28) & ~(var21 & var28);
            }

            int var13 = var32;
            var12.a(var1, var2, var3, var4, var5, var6, var7, var8, pulse.Bool.from(var13));
         }
      }

      for (ModuleCard var17 : this.c) {
         if (!var17.g()) {
            var17.b(var1, var2, var5, var6);
         }
      }
   }

   public void b(MatrixStack var1, Renderer2D var2, float var3, float var4, int var5, int var6, float var7, float var8) {
      for (ModuleCard var10 : this.c) {
         if (var10.g()) {
            var10.a(var1, var2, var3, var4, var5, var6, var7, var8);
         }
      }
   }

   public boolean c() {
      for (ModuleCard var2 : this.c) {
         if (!var2.f() && var2.g()) {
            int var4 = 589993429;
            int var3 = 1522088313;
            int var10000 = var3 & ~var4 | ~var3 & var4;
            var4 = 2039721133;
            var3 = var10000;
            return pulse.Bool.from(var3 + var4 - 2 * (var3 & var4));
         }
      }

      int var9 = 1926568210;
      int var6 = 1654083102;
      int var11 = (var6 | var9) & (~var6 | ~var9);
      var9 = 272783116;
      var6 = var11;
      return pulse.Bool.from((var6 | var9) & (var6 & var9 ^ -1));
   }

   public boolean d() {
      for (ModuleCard var2 : this.c) {
         if (!var2.f() && !var2.g() && var2.u()) {
            int var4 = -1577995866;
            int var3 = 1100751390;
            int var10000 = (var3 | var4) & ~(var3 & var4);
            var4 = -529689671;
            var3 = var10000;
            return pulse.Bool.from(var3 & (var4 ^ -1) | (var3 ^ -1) & var4);
         }
      }

      int var11 = (int)5125155403752244708L;
      int var9 = -1570049421;
      int var6 = var11;
      var11 = var6 & ~var9 | ~var6 & var9;
      var9 = -650545257;
      var6 = var11;
      return pulse.Bool.from((var6 | var9) & (var6 & var9 ^ -1));
   }

   public GuiEntry e() {
      for (ModuleCard var2 : this.c) {
         if (!var2.f() && var2.g()) {
            return var2.l();
         }
      }

      if (b) {
         String var10000 = "epf";
         int var9 = (int)-1594999807061380423L;
         int var6 = -1601977794;
         int var5 = var9;
         int var10 = (var5 | var6) - (var5 & var6);
         var6 = 633201222;
         var5 = var10;
         int var4 = var5 + var6 - 2 * (var5 & var6);
         a = var4;
      }

      return null;
   }

   public void f() {
      for (ModuleCard var2 : this.c) {
         if (!var2.f() && var2.g()) {
            var2.b();
         }
      }
   }

   public void g() {
      Iterator var1 = this.c.iterator();

      while (var1.hasNext()) {
         ModuleCard var2 = (ModuleCard)var1.next();
         if (var2.g()) {
            var2.c();
            var1.remove();
         }
      }
   }

   public void h() {
      for (ModuleCard var2 : this.c) {
         if (!var2.f() && !var2.g()) {
            var2.v();
         }
      }
   }

   public void i() {
      for (ModuleCard var2 : this.c) {
         var2.b();
      }
   }

   public void j() {
      for (ModuleCard var2 : this.c) {
         var2.c();
      }

      this.c.clear();
   }

   public void k() {
      Iterator var1 = this.c.iterator();

      while (var1.hasNext()) {
         ModuleCard var2 = (ModuleCard)var1.next();
         if (!var2.g()) {
            var2.d();
         } else {
            var2.c();
            var1.remove();
            int var6 = 1952808689;
            int var5 = -873530231;
            int var10001 = var5 & ~var6 | ~var5 & var6;
            var6 = -1081376152;
            var5 = var10001;
            var10001 = (var5 | var6) - (var5 & var6);
            var6 = -1388911641;
            var5 = 723441604;
            var10001 = var5 + var6 - 2 * (var5 & var6);
            var6 = -2044185558;
            var5 = var10001;
            var10001 = var5 + var6 - 2 * (var5 & var6);
            var10001 = (int)-4027264693702733050L;
            var6 = -689181499;
            var5 = var10001;
            var10001 = (var5 | var6) & ~(var5 & var6);
            var6 = -443826222;
            var5 = var10001;
            var10001 = (var5 | var6) - (var5 & var6);
            var10001 = (int)-1854966962565131661L;
            var6 = 1081898095;
            var5 = var10001;
            var10001 = (var5 | var6) & (~var5 | ~var6);
            var6 = 1715742237;
            var5 = var10001;
            var10001 = var5 + var6 - 2 * (var5 & var6);
            var6 = 2001916518;
            var5 = 879190579;
            int var10000 = var5 + var6 - 2 * (var5 & var6);
            var6 = 1941521977;
            var5 = var10000;
            int var4 = var5 & ~var6 | ~var5 & var6;
            var6 = -1930097748;
            var5 = -83684575;
            var10000 = (var5 | var6) & ~(var5 & var6);
            var6 = -135494550;
            var5 = var10000;
            var10000 = var5 & ~var6 | ~var5 & var6;
            var6 = 1022969039;
            var5 = -1147236099;
            var10001 = (var5 | var6) & (~var5 | ~var6);
            var6 = 492622362;
            var5 = var10001;
            var6 = (var5 | var6) & (~var5 | ~var6);
            var5 = var10000;
            var10000 = 2 * (var5 | var6) - (var5 ^ var6);
            var6 = 1538858095;
            var5 = -1733532274;
            var10000 = (var5 | var6) - (var5 & var6);
            var6 = -771650799;
            var5 = var10000;
            if ((var5 | var6) - (var5 & var6) >= var4) {
               throw new RuntimeException();
            }
         }
      }
   }

   public ModuleCard a(int var1, int var2) {
      for (ModuleCard var4 : this.c) {
         if (!var4.f() && !var4.g() && var4.f(var1, var2)) {
            return var4;
         }
      }

      return null;
   }

   public boolean b(int var1, int var2) {
      int var12;
      if (this.a(var1, var2) != null) {
         var12 = (int)8378126471095681886L;
         int var4 = -1626360345;
         int var3 = var12;
         var12 = (var3 | var4) & (~var3 | ~var4);
         var4 = 2147169976;
         var3 = var12;
         var12 = var3 + var4 - 2 * (var3 & var4);
      } else {
         int var9 = -1409960266;
         int var6 = 701217561;
         var12 = var6 & ~var9 | ~var6 & var9;
         var9 = -2109862481;
         var6 = var12;
         var12 = var6 & ~var9 | ~var6 & var9;
      }

      return pulse.Bool.from(var12);
   }

   public boolean c(int var1, int var2) {
      ModuleCard var3 = this.a(var1, var2);
      if (var3 != null) {
         var3.a(var1, var2);
         int var24 = -1771128096;
         int var15 = -435785800;
         int var32 = var15 & ~var24 | ~var15 & var24;
         var24 = 1885918553;
         var15 = var32;
         return pulse.Bool.from((var15 | var24) - (var15 & var24));
      }

      for (ModuleCard var5 : this.c) {
         if (!var5.f() && var5.d(var1, var2)) {
            var5.a(var1, var2);
            int var10000 = (int)6790478525753168196L;
            int var7 = 1924571868;
            int var6 = var10000;
            var10000 = var6 & ~var7 | ~var6 & var7;
            var7 = -1395051623;
            var6 = var10000;
            return pulse.Bool.from((var6 | var7) & (var6 & var7 ^ -1));
         }
      }

      if (b) {
         throw new IllegalStateException();
      } else if (this.c()) {
         this.f();
         int var27 = (int)-4584238472395670675L;
         int var18 = 136526861;
         int var9 = var27;
         var27 = (var9 | var18) - (var9 & var18);
         var18 = -955381919;
         var9 = var27;
         return pulse.Bool.from(var9 + var18 - 2 * (var9 & var18));
      } else if (!this.d()) {
         int var30 = (int)-8148088257861308978L;
         int var22 = 107208528;
         int var13 = var30;
         var30 = var13 & ~var22 | ~var13 & var22;
         var22 = 1506210462;
         var13 = var30;
         return pulse.Bool.from((var13 | var22) & (var13 ^ -1 | var22 ^ -1));
      } else {
         this.h();
         int var20 = -1610842208;
         int var11 = -1420803021;
         int var29 = var11 & ~var20 | ~var11 & var20;
         var20 = 883702674;
         var11 = var29;
         return pulse.Bool.from(var11 & (var20 ^ -1) | (var11 ^ -1) & var20);
      }
   }

   public boolean d(int var1, int var2) {
      return false;
   }

   public void e(int var1, int var2) {
      for (ModuleCard var4 : this.c) {
         var4.c(var1, var2);
      }
   }

   public void a(int var1, int var2, double var3, double var5) {
      for (ModuleCard var8 : this.c) {
         if (var8.f()) {
            if (b) {
               int var12 = -1632654750;
               int var11 = 301617433;
               int var10001 = var11 & ~var12 | ~var11 & var12;
               var12 = -1890190466;
               var11 = var10001;
               var10001 = var11 & ~var12 | ~var11 & var12;
               var10001 = (int)-8664042518313391259L;
               var12 = 304036765;
               var11 = var10001;
               var10001 = (var11 | var12) & ~(var11 & var12);
               var12 = -1022127878;
               var11 = var10001;
               var10001 = var11 + var12 - 2 * (var11 & var12);
               var12 = -1829720194;
               var11 = 2100973415;
               int var10000 = (var11 | var12) & ~(var11 & var12);
               var12 = -920668465;
               var11 = var10000;
               int var10 = var11 & ~var12 | ~var11 & var12;
               a = var10;
            }
         } else {
            var8.a(var1, var2, var3, var5);
         }
      }
   }

   public boolean a(float var1, int var2, int var3) {
      if (!this.c()) {
         if (!this.d()) {
            for (ModuleCard var5 : this.c) {
               if (!var5.f() && var5.e(var2, var3)) {
                  var5.a(var1, var2, var3);
                  int var25 = (int)-8356064318204464187L;
                  int var18 = 860614577;
                  int var11 = var25;
                  var25 = (var11 | var18) - (var11 & var18);
                  var18 = 1381031029;
                  var11 = var25;
                  return pulse.Bool.from(var11 + var18 - 2 * (var11 & var18));
               }
            }

            int var27 = (int)6457599585999210766L;
            int var20 = 1396120689;
            int var13 = var27;
            var27 = (var13 | var20) - (var13 & var20);
            var20 = 1107711359;
            var13 = var27;
            return pulse.Bool.from((var13 | var20) & (var13 & var20 ^ -1));
         } else {
            this.h();
            int var23 = (int)-6168718907546936770L;
            int var16 = 298419709;
            int var9 = var23;
            var23 = var9 + var16 - 2 * (var9 & var16);
            var16 = 765747138;
            var9 = var23;
            return pulse.Bool.from((var9 | var16) & (var9 & var16 ^ -1));
         }
      } else {
         this.f();
         int var10000 = (int)4984702113278559270L;
         int var7 = 1199249435;
         int var6 = var10000;
         var10000 = var6 & ~var7 | ~var6 & var7;
         var7 = 845192252;
         var6 = var10000;
         return pulse.Bool.from((var6 | var7) - (var6 & var7));
      }
   }

   public boolean a(int var1, int var2, int var3) {
      for (ModuleCard var5 : this.c) {
         if (!var5.f() && var5.a(var1, var2, var3)) {
            int var7 = 925294272;
            int var6 = -395945898;
            int var10000 = var6 + var7 - 2 * (var6 & var7);
            var7 = -549419369;
            var6 = var10000;
            return pulse.Bool.from(var6 + var7 - 2 * (var6 & var7));
         }
      }

      int var12 = 1474727457;
      int var9 = 888818709;
      int var14 = (var9 | var12) & (~var9 | ~var12);
      var12 = 1662829108;
      var9 = var14;
      return pulse.Bool.from((var9 | var12) & (var9 & var12 ^ -1));
   }

   public boolean a(char var1, int var2) {
      for (ModuleCard var4 : this.c) {
         if (!var4.f() && var4.a(var1, var2)) {
            int var10000 = (int)-5457986960109504298L;
            int var6 = 222932167;
            int var5 = var10000;
            var10000 = var5 & ~var6 | ~var5 & var6;
            var6 = 146592784;
            var5 = var10000;
            return pulse.Bool.from((var5 | var6) - (var5 & var6));
         }
      }

      int var14 = (int)-2553262692445394059L;
      int var11 = 1507113375;
      int var8 = var14;
      var14 = (var8 | var11) & ~(var8 & var11);
      var11 = -1084468502;
      var8 = var14;
      return pulse.Bool.from(var8 & (var11 ^ -1) | (var8 ^ -1) & var11);
   }

   public boolean l() {
      for (ModuleCard var2 : this.c) {
         if (!var2.f() && var2.h()) {
            int var10000 = (int)5119928271855894270L;
            int var4 = 1625787429;
            int var3 = var10000;
            var10000 = var3 + var4 - 2 * (var3 & var4);
            var4 = -1617644838;
            var3 = var10000;
            return pulse.Bool.from((var3 | var4) & (var3 ^ -1 | var4 ^ -1));
         }
      }

      int var9 = -974943103;
      int var6 = -2131132688;
      int var12 = (var6 | var9) & (~var6 | ~var9);
      var9 = 1159393905;
      var6 = var12;
      return pulse.Bool.from((var6 | var9) - (var6 & var9));
   }

   public void a(GuiEntry var1, int var2, boolean var3, float var4, float var5, float var6, float var7, float var8, float var9) {
      for (ModuleCard var11 : this.c) {
         if (var11.l() == var1 && !var11.f() && var11.g()) {
            var11.b();
            return;
         }
      }

      if (b) {
         int var10000 = (int)-3040077020905169556L;
         int var20 = -221191737;
         int var19 = var10000;
         var10000 = var19 & ~var20 | ~var19 & var20;
         var20 = 731293893;
         var19 = var10000;
         var10000 = (var19 | var20) & (~var19 | ~var20);
         var20 = -211495361;
         var19 = -525551469;
         var10000 = var19 & ~var20 | ~var19 & var20;
         var20 = 1500302829;
         var19 = var10000;
         int var18 = (var19 | var20) & (~var19 | ~var20);
      }

      for (ModuleCard var23 : this.c) {
         if (!var23.f() && var23.g()) {
            var23.b();
         }

         String var73 = "epg";
         int var74 = (int)4162621921913328816L;
         int var51 = -1632598067;
         int var29 = var74;
         int var75 = (var29 | var51) - (var29 & var51);
         var51 = -1077520177;
         var29 = var75;
         int var25 = (var29 | var51) & (~var29 | ~var51);
         var51 = 87926739;
         var29 = -1465056633;
         int var76 = (var29 | var51) - (var29 & var51);
         var51 = 1962393525;
         var29 = var76;
         int var77 = var29 + var51 - 2 * (var29 & var51);
         var51 = -724480094;
         var29 = -352399485;
         int var10001 = (var29 | var51) & (~var29 | ~var51);
         var51 = -1022404543;
         var29 = var10001;
         var51 = (var29 | var51) & (~var29 | ~var51);
         var29 = var77;
         int var78 = (var29 ^ var51) + 2 * (var29 & var51);
         var51 = 1345677082;
         var29 = -743637521;
         int var79 = var29 + var51 - 2 * (var29 & var51);
         var51 = -309434277;
         var29 = var79;
         if ((var29 & ~var51 | ~var29 & var51) >= var25) {
            throw new IllegalStateException();
         }
      }

      this.h();
      int var60 = 1529274945;
      int var38 = -1629910741;
      int var80 = (var38 | var60) & ~(var38 & var60);
      var60 = 795050466;
      var38 = var80;
      var80 = (var38 | var60) & (~var38 | ~var60);
      float var22 = 12.0F;
      float var24 = var8 + var22 / 2.0F;
      var80 = (int)-7422703705328940011L;
      var60 = -151503143;
      var38 = var80;
      var80 = (var38 | var60) & ~(var38 & var60);
      var60 = -247273001;
      var38 = var80;
      var80 = ((var38 | var60) & ~(var38 & var60)) * ((var38 | var60) & ~(var38 & var60));
      float var12 = 30.0F;
      var60 = 1809589950;
      var38 = -24024046;
      var80 = (var38 | var60) & (~var38 | ~var60);
      var60 = 1886700713;
      var38 = var80;
      var80 = var38 & ~var60 | ~var38 & var60;
      float var13 = 150.0F;
      float var14 = var24 - var13 / 2.0F;
      float var87 = var9 - var12;
      var60 = 1002795731;
      var38 = 153567546;
      int var88 = (var38 | var60) & ~(var38 & var60);
      var60 = -1642965335;
      var38 = var88;
      var88 = (var38 | var60) & (~var38 | ~var60);
      float var15 = var87 - 4.0F;
      ModuleCard var16 = ModuleCard.a(var1, var1.e(), var2, var3, var5, var7);
      int var10003 = (int)-3996890192381263440L;
      var60 = -158125990;
      var38 = var10003;
      var10003 = var38 + var60 - 2 * (var38 & var60);
      var60 = 306999787;
      var38 = var10003;
      var16.a(var14, var15, pulse.Bool.from((var38 | var60) & (var38 & var60 ^ -1)));
      this.c.add(var16);
   }

   public void a(GuiEntry var1, int var2, boolean var3, float var4, float var5, float var6, float var7, int var8, int var9) {
      for (ModuleCard var11 : this.c) {
         if (var11.l() == var1 && !var11.f() && var11.g()) {
            var11.b();
            return;
         }

         int var10001 = (int)-5103253537573148735L;
         int var18 = 1991261298;
         int var17 = var10001;
         var10001 = (var17 | var18) & ~(var17 & var18);
         var18 = 1753373600;
         var17 = var10001;
         var10001 = (var17 | var18) & (~var17 | ~var18);
         var18 = -578684179;
         var17 = 333819803;
         var10001 = (var17 | var18) - (var17 & var18);
         var18 = -832285313;
         var17 = var10001;
         var10001 = (var17 | var18) & ~(var17 & var18);
         var18 = -1267100472;
         var17 = 293498350;
         int var10000 = (var17 | var18) - (var17 & var18);
         var18 = -1761896129;
         var17 = var10000;
         int var16 = (var17 | var18) & ~(var17 & var18);
         a = var16;
         var18 = -108471232;
         var17 = -633994952;
         var10000 = (var17 | var18) & (~var17 | ~var18);
         var18 = 100062326;
         var17 = var10000;
         var10000 = var17 & ~var18 | ~var17 & var18;
         var18 = 1329983009;
         var17 = 571360385;
         var10001 = (var17 | var18) & (~var17 | ~var18);
         var18 = 1203353024;
         var17 = var10001;
         var18 = (var17 | var18) & ~(var17 & var18);
         var17 = var10000;
         var10000 = (var17 | var18) + (var17 & var18);
         var18 = -1229035337;
         var17 = 992177515;
         var10000 = (var17 | var18) - (var17 & var18);
         var18 = -42597863;
         var17 = var10000;
         if (var17 + var18 - 2 * (var17 & var18) <= a) {
            var18 = 964770189;
            var17 = 1600587623;
            var10000 = (var17 | var18) & (~var17 | ~var18);
            var18 = 1726365418;
            var17 = var10000;
            var10000 = (var17 | var18) & ~(var17 & var18);
            var10001 = (int)6500177607225524490L;
            var18 = -2129857754;
            var17 = var10001;
            var10001 = var17 + var18 - 2 * (var17 & var18);
            var18 = -1498631636;
            var17 = var10001;
            var10000 /= (var17 | var18) & ~(var17 & var18);
         }
      }

      for (ModuleCard var21 : this.c) {
         if (var21.f()) {
            if (b) {
               throw new RuntimeException();
            }
         } else if (var21.g()) {
            var21.b();
         }
      }

      this.h();
      String var74 = "eph";
      float var20 = 30.0F;
      int var75 = (int)6694813610646530506L;
      int var61 = -1554737567;
      int var39 = var75;
      int var76 = (var39 | var61) & (~var39 | ~var61);
      var61 = 1454839795;
      var39 = var76;
      int var77 = (var39 | var61) & ~(var39 & var61);
      float var22 = 150.0F;
      float var12 = var8 - var22 / 2.0F;
      float var78 = var9 - var20;
      int var86 = (int)-8560312506342458599L;
      var61 = -1415456894;
      var39 = var86;
      var86 = (var39 | var61) - (var39 & var61);
      var61 = -629694715;
      var39 = var86;
      var86 = (var39 | var61) & (~var39 | ~var61);
      float var13 = var78 - 8.0F;
      ModuleCard var14 = ModuleCard.a(var1, var1.e(), var2, var3, var5, var7);
      var61 = 1294763710;
      var39 = 1575989682;
      int var10003 = var39 + var61 - 2 * (var39 & var61);
      var61 = 281229069;
      var39 = var10003;
      var14.a(var12, var13, pulse.Bool.from((var39 | var61) - (var39 & var61)));
      this.c.add(var14);
   }

   public void a(GuiEntry var1, int var2, boolean var3, float var4, float var5) {
      if (var1.e() != null && !var1.e().m().isEmpty()) {
         ModuleCard var6 = null;

         for (ModuleCard var8 : this.c) {
            if (var8.l() == var1 && !var8.f() && !var8.g()) {
               var6 = var8;
               break;
            }
         }

         if (var6 != null) {
            var6.b();
         } else {
            for (ModuleCard var32 : this.c) {
               if (!var32.f() && var32.g()) {
                  var32.b();
               }
            }

            this.h();
            String var10000 = "epi";
            int var10001 = (int)2475847961049029795L;
            int var29 = -469903948;
            int var28 = var10001;
            var10001 = (var28 | var29) & ~(var28 & var29);
            var29 = -141192954;
            var28 = var10001;
            var10001 = (var28 | var29) - (var28 & var29);
            int var10002 = (int)2748165893580318610L;
            var29 = -453918243;
            var28 = var10002;
            var10002 = var28 & ~var29 | ~var28 & var29;
            var29 = -1886468076;
            var28 = var10002;
            var29 = (var28 | var29) - (var28 & var29);
            var28 = var10001;
            var10001 = (var28 & ~var29) + (var29 & ~var28) + 2 * (var28 & var29);
            String var165 = "epj";
            var29 = 195872899;
            var28 = -176289933;
            var10002 = var28 + var29 - 2 * (var28 & var29);
            var29 = 361405201;
            var28 = var10002;
            var10002 = var28 + var29 - 2 * (var28 & var29);
            var29 = 82160119;
            var28 = 2057737970;
            int var10003 = var28 & ~var29 | ~var28 & var29;
            var29 = -393027126;
            var28 = var10003;
            var10003 = (var28 | var29) & (~var28 | ~var29);
            var29 = -1657522390;
            var28 = -2044966356;
            int var10004 = (var28 | var29) & ~(var28 & var29);
            var29 = 1529808677;
            var28 = var10004;
            var29 = (var28 | var29) - (var28 & var29);
            var28 = var10003;
            var10003 = (var28 ^ var29) + 2 * (var28 & var29);
            var10003 = (int)-7415090500910370064L;
            var29 = -419604770;
            var28 = var10003;
            var10003 = var28 & ~var29 | ~var28 & var29;
            var29 = 766098779;
            var28 = var10003;
            var10003 = var28 & ~var29 | ~var28 & var29;
            var29 = -1220367399;
            var28 = -1835241749;
            var10004 = var28 & ~var29 | ~var28 & var29;
            var29 = 2095288451;
            var28 = var10004;
            var10004 = ((var28 | var29) - (var28 & var29)) * ((var28 | var29) - (var28 & var29));
            var10004 = (int)-9189425781660957146L;
            var29 = 1789037932;
            var28 = var10004;
            var10004 = var28 + var29 - 2 * (var28 & var29);
            var29 = 509009916;
            var28 = var10004;
            var10004 = (var28 | var29) - (var28 & var29);
            var29 = 749613819;
            var28 = -2060392580;
            int var10005 = var28 & ~var29 | ~var28 & var29;
            var29 = 782166282;
            var28 = var10005;
            var10005 = (var28 | var29) & (~var28 | ~var29);
            int var10006 = (int)-8916102230770585950L;
            var29 = -139871421;
            var28 = var10006;
            var10006 = (var28 | var29) & (~var28 | ~var29);
            var29 = 333515003;
            var28 = var10006;
            var29 = (var28 | var29) - (var28 & var29);
            var28 = var10005;
            var10005 = (var28 & ~var29) + (var29 & ~var28) + 2 * (var28 & var29);
            var10005 = (int)-6544434870200407843L;
            var29 = -1458206089;
            var28 = var10005;
            var10005 = (var28 | var29) & ~(var28 & var29);
            var29 = 2064192951;
            var28 = var10005;
            IconTextureRegistry.TextureInfo var31 = IconTextureRegistry.getInfo(
               a(
                  "\ud9f7稘\ud9e4稅\ud9e1稵\ud9e0",
                  "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謴㑸\u007f\ua7eb꒺ꁿꥊ給蹋⑴謲㑻=ꟕ꒰ꁥꤑ絿蹄⑽謤㑇s\ua7e8꒰ꁽꤨ絷蹄⑻謰㑲`",
                  var10002,
                  var10003,
                  var10004,
                  (var28 | var29) - (var28 & var29)
               )
            );
            float var33 = var31 != null ? var31.c() / 2.0F : 0.0F;
            ArrayList<ModuleCard> var9 = new ArrayList<>();

            for (ModuleCard var11 : this.c) {
               if (!var11.f() && var11.n() == var3) {
                  var9.add(var11);
               }
            }

            ModuleCard.VerticalAlign var34 = ModuleCard.VerticalAlign.CENTER;
            ModuleCard var35 = new ModuleCard(var1, var1.e(), var2, var3, var4, var5, var34);
            float var12 = var35.k();
            if (!var9.isEmpty()) {
               float var13 = ModuleCard.a(var4, var5, ModuleCard.VerticalAlign.CENTER, var33, var12);
               ArrayList<ModuleCard> var14 = new ArrayList<>();

               for (ModuleCard var16 : var9) {
                  if (!ModuleCard.a(var13, var12, var16.i(), var16.k())) {
                     int var138 = (int)-6779796441936102975L;
                     var29 = -593690301;
                     var28 = var138;
                     int var139 = (var28 | var29) & ~(var28 & var29);
                     var29 = 431443660;
                     var28 = var139;
                     int var140 = (var28 | var29) - (var28 & var29);
                     var29 = 911042385;
                     var28 = 2097455523;
                     var10001 = var28 & ~var29 | ~var28 & var29;
                     var29 = -1591056204;
                     var28 = var10001;
                     var29 = (var28 | var29) & (~var28 | ~var29);
                     var28 = var140;
                     int var141 = (var28 & ~var29) + (var29 & ~var28) + 2 * (var28 & var29);
                     int var142 = (int)5492680250949338091L;
                     var29 = 697506417;
                     var28 = var142;
                     int var143 = (var28 | var29) - (var28 & var29);
                     var29 = 1669966689;
                     var28 = var143;
                     int var27 = var28 + var29 - 2 * (var28 & var29);
                     a = var27;
                     var29 = 1156349281;
                     var28 = -1985209784;
                     int var144 = (var28 | var29) & ~(var28 & var29);
                     var29 = 569033065;
                     var28 = var144;
                     int var145 = var28 & ~var29 | ~var28 & var29;
                     var29 = 37677356;
                     var28 = -621914881;
                     int var146 = (var28 | var29) & (~var28 | ~var29);
                     var29 = -1478676165;
                     var28 = var146;
                     if ((var28 | var29) - (var28 & var29) <= a) {
                        var10001 = (int)-527942195870445247L;
                        var29 = -1069805182;
                        var28 = var10001;
                        var10001 = (var28 | var29) & (~var28 | ~var29);
                        var29 = 2031075521;
                        var28 = var10001;
                        var10001 = (var28 | var29) & (~var28 | ~var29);
                        var29 = -991243755;
                        var28 = 312532494;
                        var10001 = var28 & ~var29 | ~var28 & var29;
                        var29 = -699790310;
                        var28 = var10001;
                        var10001 = (var28 | var29) - (var28 & var29);
                        int var147 = (int)6533994029877714461L;
                        var29 = -1776564693;
                        var28 = var147;
                        int var148 = (var28 | var29) & (~var28 | ~var29);
                        var29 = 401746624;
                        var28 = var148;
                        var27 = (var28 | var29) - (var28 & var29);
                     }
                  } else {
                     var14.add(var16);
                  }
               }

               if (!var14.isEmpty()) {
                  var29 = -348227146;
                  var28 = 1541966000;
                  var10001 = var28 + var29 - 2 * (var28 & var29);
                  var29 = -1328090874;
                  var28 = var10001;
                  ModuleCard var37 = (ModuleCard)var14.get((var28 | var29) & (~var28 | ~var29));
                  float var38 = var37.i() + var37.k() / 2.0F;
                  float var17 = var4 + var5 / 2.0F;
                  ModuleCard.VerticalAlign var18;
                  if (!(var17 < var38)) {
                     var18 = ModuleCard.VerticalAlign.TOP;
                  } else {
                     var18 = ModuleCard.VerticalAlign.BOTTOM;
                  }

                  float var19 = ModuleCard.a(var4, var5, var18, var33, var12);
                  ArrayList<ModuleCard> var20 = new ArrayList<>();

                  for (ModuleCard var22 : var9) {
                     if (ModuleCard.a(var19, var12, var22.i(), var22.k())) {
                        var20.add(var22);
                     }

                     if (a != a) {
                        int var149 = (int)8420410914495090498L;
                        var29 = -143986278;
                        var28 = var149;
                        int var150 = (var28 | var29) & ~(var28 & var29);
                        var29 = -98058536;
                        var28 = var150;
                        int var151 = var28 & ~var29 | ~var28 & var29;
                        var29 = -432565744;
                        var28 = 1390119229;
                        var10001 = var28 & ~var29 | ~var28 & var29;
                        var29 = -1259594963;
                        var28 = var10001;
                        int var152 = var151 / (var28 & ~var29 | ~var28 & var29);
                     }
                  }

                  if (!var20.isEmpty()) {
                     ModuleCard.VerticalAlign var39 = var18 != ModuleCard.VerticalAlign.TOP ? ModuleCard.VerticalAlign.TOP : ModuleCard.VerticalAlign.BOTTOM;
                     float var40 = ModuleCard.a(var4, var5, var39, var33, var12);
                     ArrayList<ModuleCard> var23 = new ArrayList<>();

                     for (ModuleCard var25 : var9) {
                        if (ModuleCard.a(var40, var12, var25.i(), var25.k())) {
                           var23.add(var25);
                        }
                     }

                     if (!var23.isEmpty()) {
                        var34 = ModuleCard.VerticalAlign.CENTER;

                        for (ModuleCard var42 : var14) {
                           var42.b();
                        }
                     } else {
                        var34 = var39;
                     }
                  } else {
                     var34 = var18;
                  }
               }
            }

            var35 = new ModuleCard(var1, var1.e(), var2, var3, var4, var5, var34);
            this.c.add(var35);
         }
      }
   }

   public void a(ClientModule var1) {
      if (var1 != null && !var1.m().isEmpty()) {
         if (b) {
            throw new RuntimeException();
         }

         for (ModuleCard var3 : this.c) {
            if (var3.l().e() != var1) {
               if (a != a) {
                  String var10000 = "epk";
                  int var36 = (int)8303695939354124247L;
                  int var9 = -1246415189;
                  int var8 = var36;
                  int var37 = (var8 | var9) - (var8 & var9);
                  var9 = -1081425375;
                  var8 = var37;
                  int var7 = (var8 | var9) - (var8 & var9);
               }
            } else if (!var3.f()) {
               var3.b();
               return;
            }
         }

         this.i();
         this.h();
         ModulesTab.ModuleEntry var10 = new ModulesTab.ModuleEntry(var1);
         int var25 = 5095702;
         int var13 = -1122137172;
         int var10001 = (var13 | var25) & (~var13 | ~var25);
         var25 = -559445533;
         var13 = var10001;
         var10001 = var13 + var25 - 2 * (var13 & var25);
         var25 = 1967484009;
         var13 = -1202477162;
         int var10002 = (var13 | var25) - (var13 & var25);
         var25 = 1856944983;
         var13 = var10002;
         var25 = (var13 | var25) & (~var13 | ~var25);
         var13 = var10001;
         var10001 = 2 * (var13 | var25) - (var13 ^ var25);
         float var11 = this.d - 32.0F;
         var25 = 2119776426;
         var13 = -2127903771;
         int var38 = (var13 | var25) & ~(var13 & var25);
         var25 = 81695226;
         var13 = var38;
         var38 = ((var13 | var25) & ~(var13 & var25)) * ((var13 | var25) & ~(var13 & var25));
         float var4 = 15.0F;
         int var10004 = (int)-6240358348573173785L;
         var25 = -7850868;
         var13 = var10004;
         var10004 = (var13 | var25) - (var13 & var25);
         var25 = 307289236;
         var13 = var10004;
         var10004 = var13 + var25 - 2 * (var13 & var25);
         var25 = 1844355424;
         var13 = 1983281880;
         int var10005 = (var13 | var25) & (~var13 | ~var25);
         var25 = 467196856;
         var13 = var10005;
         ModuleCard var5 = new ModuleCard(var10, var1, var10004, pulse.Bool.from(var13 & (var25 ^ -1) | (var13 ^ -1) & var25), var11, var4, ModuleCard.VerticalAlign.CENTER);
         this.c.add(var5);
      }
   }

   public static String a(String var0, String var1, int var2, int var3, int var4, int var5) {
      char[] var6 = var1.toCharArray();
      char[] var7 = new char[var6.length];
      int var10000 = (int)9205296851950350229L;
      int var20 = 1857827095;
      int var19 = var10000;
      var10000 = (var19 | var20) & (~var19 | ~var20);
      var20 = 2117705352;
      var19 = var10000;
      char[] var268 = new char[var19 + var20 - 2 * (var19 & var20)];
      var20 = 890812465;
      var19 = -1362570575;
      int var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = -1680840064;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = 1271451833;
      var19 = 226532949;
      int var10003 = (var19 | var20) - (var19 & var20);
      var20 = 1179125470;
      var19 = var10003;
      var268[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      var20 = 508497040;
      var19 = 150559268;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = 381048501;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var10003 = (int)8677267542469266957L;
      var20 = -2032287857;
      var19 = var10003;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = -1758080505;
      var19 = var10003;
      var268[var10002] = (char)((var19 | var20) - (var19 & var20));
      var10002 = (int)5713203237268039296L;
      var20 = -1631189724;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = -1874910298;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var10003 = (int)-7912980183270910251L;
      var20 = -131305957;
      var19 = var10003;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = 1296227144;
      var19 = var10003;
      var268[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      var20 = 1248280477;
      var19 = 697336994;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1677179708;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = 514468311;
      var19 = 1419307361;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = -1466377646;
      var19 = var10003;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = 1924472532;
      var19 = 1161214334;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = 931348409;
      var19 = var10003;
      var268[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      var20 = 2036198541;
      var19 = 2036420226;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = 3973643;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      String var341 = "epl";
      var20 = 66831937;
      var19 = -725119699;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = -683877815;
      var19 = var10003;
      var268[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      var20 = -657346574;
      var19 = -357368317;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = 845369844;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = 2044315762;
      var19 = 120584283;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = 2130081195;
      var19 = var10003;
      var268[var10002] = (char)((var19 | var20) - (var19 & var20));
      var10002 = (int)1039874519681382699L;
      var20 = -2092030729;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = 1071160794;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = 1472921126;
      var19 = -372775734;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = -1106439169;
      var19 = var10003;
      var268[var10002] = (char)((var19 | var20) - (var19 & var20));
      var20 = -1762303141;
      var19 = 1415268330;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = -1028774730;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = -80817362;
      var19 = -860290011;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = 932700969;
      var19 = var10003;
      var268[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      var20 = -113010208;
      var19 = -595487497;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = 633474335;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var10003 = (int)670136787210764111L;
      var20 = -1674660110;
      var19 = var10003;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = 481346030;
      var19 = var10003;
      var268[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      var20 = 385921059;
      var19 = 1910946721;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = 1726352267;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = 1861734435;
      var19 = 1477722996;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = 920884339;
      var19 = var10003;
      var268[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      char[] var8 = var268;
      var10000 = (int)-7075729344372607744L;
      var20 = -1635560721;
      var19 = var10000;
      var10000 = (var19 | var20) - (var19 & var20);
      var20 = -211834907;
      var19 = var10000;
      char[] var271 = new char[(var19 | var20) - (var19 & var20)];
      var20 = -1787280794;
      var19 = -22725667;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = 1809676731;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = -256309158;
      var19 = 1814212169;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = -1667502541;
      var19 = var10003;
      var271[var10002] = (char)((var19 | var20) & ~(var19 & var20));
      var10002 = (int)7311715938514654151L;
      var20 = 1385185071;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = 2133486825;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      int var10004 = (int)8041196020402023738L;
      var20 = 163550854;
      var19 = var10004;
      var10004 = var19 + var20 - 2 * (var19 & var20);
      var20 = 619150255;
      var19 = var10004;
      var10004 = var19 & ~var20 | ~var19 & var20;
      var20 = 1764782676;
      var19 = 1897299576;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = 405178415;
      var19 = var10003;
      var271[var10002] = (char)((var19 | var20) - (var19 & var20));
      var20 = -1976725269;
      var19 = -834878136;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = 1141986721;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = 1874077310;
      var19 = -103493554;
      var10004 = (var19 | var20) - (var19 & var20);
      var20 = -1772030407;
      var19 = var10004;
      var10004 = (var19 | var20) & (~var19 | ~var20);
      var10004 = (int)7350813861541001286L;
      var20 = -1010284576;
      var19 = var10004;
      var10004 = var19 & ~var20 | ~var19 & var20;
      var20 = 14909345;
      var19 = var10004;
      var10004 = var19 & ~var20 | ~var19 & var20;
      var20 = 675559753;
      var19 = 536291631;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = 934516533;
      var19 = var10003;
      var271[var10002] = (char)((var19 | var20) - (var19 & var20));
      var20 = 1158876989;
      var19 = -1866484275;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = -710100237;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = -174717894;
      var19 = 1139426086;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = -1233354978;
      var19 = var10003;
      var271[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      var20 = 744243834;
      var19 = 1688261752;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = 1224513030;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var10003 = (int)6224754644202816220L;
      var20 = -1270959301;
      var19 = var10003;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = -778925657;
      var19 = var10003;
      var271[var10002] = (char)((var19 | var20) - (var19 & var20));
      var20 = -1011243723;
      var19 = -111047152;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = 987245344;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var10003 = (int)-6463626319895138007L;
      var20 = -950545289;
      var19 = var10003;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = 1587486154;
      var19 = var10003;
      var271[var10002] = (char)((var19 | var20) & ~(var19 & var20));
      var20 = 1492903419;
      var19 = -287157692;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = -1239828551;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var10003 = (int)-6874598620830463700L;
      var20 = 2064626592;
      var19 = var10003;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = 239998459;
      var19 = var10003;
      var10003 = ((var19 | var20) - (var19 & var20)) * ((var19 | var20) - (var19 & var20));
      var20 = 1032310539;
      var19 = 878670933;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = 165166183;
      var19 = var10003;
      var271[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      var20 = 484932820;
      var19 = 1360528609;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = 1308588082;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = 1055650032;
      var19 = 1599266283;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1639529763;
      var19 = var10003;
      var271[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      var10002 = (int)-5218282954745847023L;
      var20 = 1460788732;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = -1208729883;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var10004 = (int)-1054320890546579827L;
      var20 = -1638697233;
      var19 = var10004;
      var10004 = var19 & ~var20 | ~var19 & var20;
      var20 = -236855191;
      var19 = var10004;
      var10004 = (var19 | var20) & ~(var19 & var20);
      var10004 = (int)3482510841369741065L;
      var20 = 1075917473;
      var19 = var10004;
      var10004 = (var19 | var20) - (var19 & var20);
      var20 = -93620818;
      var19 = var10004;
      var10004 = (var19 | var20) - (var19 & var20);
      var20 = 10093302;
      var19 = -444732646;
      var10004 = var19 & ~var20 | ~var19 & var20;
      var20 = -437786132;
      var19 = var10004;
      var10004 = var19 & ~var20 | ~var19 & var20;
      var20 = -224935712;
      var19 = -1949425133;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = 2035900919;
      var19 = var10003;
      var271[var10002] = (char)((var19 | var20) - (var19 & var20));
      var10002 = (int)7125306364865362651L;
      var20 = 950670835;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = 285945633;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var10003 = (int)698177348280053744L;
      var20 = -1059721998;
      var19 = var10003;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = -1566494671;
      var19 = var10003;
      var271[var10002] = (char)((var19 | var20) & ~(var19 & var20));
      char[] var9 = var271;
      var20 = 685884219;
      var19 = 1723976936;
      var10000 = (var19 | var20) & ~(var19 & var20);
      var20 = 1310724051;
      var19 = var10000;

      for (int var10 = (var19 | var20) - (var19 & var20); var10 < var6.length; var10++) {
         char var330 = var6[var10];
         char var246 = var8[var10 % var8.length];
         char var124 = var330;
         var7[var10] = (char)((var124 | var246) - (var124 & var246));
      }

      char[] var21 = new char[var7.length];
      var10000 = (int)7216919846798342611L;
      var20 = 849368869;
      var19 = var10000;
      var10000 = (var19 | var20) & (~var19 | ~var20);
      var20 = 306310902;
      var19 = var10000;

      for (int var11 = (var19 | var20) - (var19 & var20); var11 < var6.length; var11++) {
         char var331 = var7[var11];
         char var249 = var9[var11 % var9.length];
         char var127 = var331;
         var21[var11] = (char)((var127 | var249) & (~var127 | ~var249));
      }

      String var22 = new String(var21);
      int var12 = var22.hashCode();
      var20 = var5;
      var19 = var3;
      var10000 = (var19 & ~var20) - (~var19 & var20);
      var20 = var2;
      var19 = var10000;
      int var13 = (var19 & ~var20) - (~var19 & var20);
      char[] var14 = var0.toCharArray();
      char[] var15 = new char[var14.length];
      var20 = 1100647175;
      var19 = -1150415962;
      var10000 = var19 & ~var20 | ~var19 & var20;
      var20 = -84639583;
      var19 = var10000;
      int var16 = var19 + var20 - 2 * (var19 & var20);
      if (b) {
         var10000 = (int)-3372143992052391704L;
         var20 = -356741885;
         var19 = var10000;
         var10000 = (var19 | var20) & (~var19 | ~var20);
         var20 = 1921642469;
         var19 = var10000;
         var10000 = (var19 | var20) & (~var19 | ~var20);
         int var10001 = (int)-3045989413542198060L;
         var20 = -2088502950;
         var19 = var10001;
         var10001 = (var19 | var20) & ~(var19 & var20);
         var20 = 1154716795;
         var19 = var10001;
         var20 = var19 + var20 - 2 * (var19 & var20);
         var19 = var10000;
         var10000 = (var19 ^ var20) + 2 * (var19 & var20);
         var10000 = (int)5602035889281532147L;
         var20 = 354182975;
         var19 = var10000;
         var10000 = (var19 | var20) & (~var19 | ~var20);
         var20 = 39103682;
         var19 = var10000;
         int var18 = var19 + var20 - 2 * (var19 & var20);
         a = var18;
      }

      for (; var16 < var15.length; var16++) {
         int var284 = (int)-9130825294729615725L;
         var20 = 1104335261;
         var19 = var284;
         var284 = (var19 | var20) & (~var19 | ~var20);
         var20 = -928008436;
         var19 = var284;
         switch (var16 % (var19 + var20 - 2 * (var19 & var20))) {
            case 0:
               var20 = var12;
               var19 = var13;
               var10002 = (var19 | var20) & ~(var19 & var20);
               char var266 = var14[var16];
               var19 = var10002;
               var15[var16] = (char)((var19 | var266) - (var19 & var266));
               break;
            case 1:
               var20 = var13;
               var19 = var5;
               var10002 = (var19 | var20) - (var19 & var20);
               char var264 = var14[var16];
               var19 = var10002;
               var15[var16] = (char)((var19 | var264) & ~(var19 & var264));
         }
      }

      return new String(var15);
   }
}
