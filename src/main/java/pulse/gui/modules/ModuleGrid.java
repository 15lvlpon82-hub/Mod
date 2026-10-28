package pulse;


import pulse.module.ClientModule;
import java.util.List;
import net.minecraft.client.util.math.MatrixStack;

public class ModuleGrid implements ClickGuiOverlay {
   private final GuiEntrySource a;
   private static final float b = 19.0F;
   private static final float c = 48.0F;
   private static final float d = 26.0F;
   private static final float e = 6.5F;
   private static final float f = 8.0F;
   private static final float g = 2.0F;
   private final ScrollBar h;
   private final ModuleCardList i;
   private final ModuleRowRenderer j;
   private float k;
   private float l;
   private float m;
   private float n;
   private int o;
   private int p;
   private boolean q;

   public ModuleGrid(GuiEntrySource var1) {
      int var3 = -1517257817;
      int var2 = -1506558875;
      int var10001 = var2 + var3 - 2 * (var2 & var3);
      var3 = 61065154;
      var2 = var10001;
      this.q = pulse.Bool.from((var2 | var3) & ~(var2 & var3));
      this.a = var1;
      this.h = new ScrollBar(2.0F, 25.0F);
      this.i = new ModuleCardList();
      this.j = new ModuleRowRenderer();
   }

   public List<ModuleCard> a() {
      return this.i.a();
   }

   private float k() {
      int var1 = this.a.f();
      float var2 = pulse.PulseClickGuiScreen.d();
      float var3 = var2 - 38.0F;
      int var10001 = (int)686472067908877378L;
      int var5 = -524411458;
      int var4 = var10001;
      var10001 = (var4 | var5) - (var4 & var5);
      var5 = -1957584387;
      var4 = var10001;
      return var1 == (var4 & ~var5 | ~var4 & var5) ? var3 - 2.0F : (var3 - 6.5F) / 2.0F - 1.0F;
   }

   private float c(int var1, int var2) {
      int var3 = (int)Math.ceil((double)var1 / var2);
      return var3 * 34.0F - 8.0F;
   }

   @Override
   public void a(MatrixStack var1, Renderer2D var2, float var3, float var4, int var5, int var6) {
      this.k = var3;
      this.l = var4;
      this.o = var5;
      this.p = var6;
      this.h.a();
      List var7 = this.a.e();
      if (var7 != null && !var7.isEmpty()) {
         int var8 = this.a.f();
         if (var8 <= 0) {
            var8 = 2;
         }

         float var9 = this.k();
         float var10 = var4 + 48.0F;
         float var11 = pulse.PulseClickGuiScreen.e() - 48.0F - 19.0F;
         int var12 = (int)Math.ceil((double)var7.size() / var8);
         float var13 = var12 * 34.0F - 8.0F;
         if (var13 < 0.0F) {
            var13 = 0.0F;
         }

         float var14 = Math.max(0.0F, var13 - var11);
         float var15 = this.h.b();
         if (var15 > var14) {
            this.h.e(var14);
            var15 = var14;
         }

         float var16 = var10 - var15;
         float var17 = var3 + 19.0F;
         float var18 = var10 + var11;
         GuiLayerRegistry.a().a(GuiLayerRegistry.Layer.CONTENT, var3, var10, pulse.PulseClickGuiScreen.d(), var11);

         for (int var19 = 0; var19 < var7.size(); var19++) {
            GuiEntry var20 = (GuiEntry)var7.get(var19);
            int var21 = var19 % var8;
            int var22 = var19 / var8;
            float var23 = var17 + var21 * (var9 + 6.5F) + 1.0F;
            float var24 = var16 + var22 * 34.0F + 1.0F;
            if (!(var24 + 26.0F < var10) && !(var24 > var18)) {
               boolean var25 = var21 != 0;
               this.j.a(var1, var2, var20, var23, var24, var9, 26.0F, var5, var6, false, var25, false, false);
            }
         }

         if (var13 > var11 + 1.0F) {
            this.h.a(var1, var2, var3 + pulse.PulseClickGuiScreen.d() - 8.0F, var10, 4.0F, var13, var11, var5, var6, false);
         }

         this.i.b(var1, var2, this.k, this.l, var5, var6, this.m, this.n);
      }
   }

   private void a(MatrixStack var1, Renderer2D var2, List<? extends GuiEntry> var3, float var4, float var5, float var6, int var7, int var8) {
   }

   private boolean a(List<? extends GuiEntry> var1, float var2, float var3, float var4, int var5, int var6) {
      if (!(var6 < var3) && !(var6 > var3 + var4)) {
         int var7 = this.a.f();
         float var8 = this.k();
         float var9 = var3 - this.h.b();
         int var25 = -1424799359;
         int var18 = -1860253986;
         int var32 = (var18 | var25) & ~(var18 & var25);
         var25 = 973967199;
         var18 = var32;

         for (int var10 = (var18 | var25) & (~var18 | ~var25); var10 < var1.size(); var10++) {
            int var11 = var10 % var7;
            int var12 = var10 / var7;
            float var13 = var2 + var11 * (var8 + 6.5F) + 1.0F;
            float var14 = var9 + var12 * 34.0F + 1.0F;
            if (GuiInput.a(var13, var14, var8, 26.0F, var5, var6)) {
               var25 = 1553378488;
               var18 = -1755055997;
               var32 = (var18 | var25) - (var18 & var25);
               var25 = -873114566;
               var18 = var32;
               return pulse.Bool.from(var18 & (var25 ^ -1) | (var18 ^ -1) & var25);
            }
         }

         var32 = (int)1557773784318172669L;
         var25 = 2071295218;
         var18 = var32;
         var32 = (var18 | var25) & ~(var18 & var25);
         var25 = -1513740017;
         var18 = var32;
         return pulse.Bool.from((var18 | var25) & (var18 & var25 ^ -1));
      } else {
         int var10000 = (int)-6442538009201948144L;
         int var16 = 1955261429;
         int var15 = var10000;
         var10000 = (var15 | var16) & (~var15 | ~var16);
         var16 = -115727899;
         var15 = var10000;
         return pulse.Bool.from(var15 + var16 - 2 * (var15 & var16));
      }
   }

   public void a(MatrixStack var1, Renderer2D var2, int var3, int var4) {
      this.i.b(var1, var2, this.k, this.l, var3, var4, this.m, this.n);
   }

   public void b() {
      this.i.b();
   }

   public void a(MatrixStack var1, Renderer2D var2) {
   }

   @Override
   public void a(float var1, float var2, int var3, int var4) {
      this.b(var1, var2, var3, var4);
   }

   @Override
   public void b(float var1, float var2, int var3, int var4) {
      int var5 = 0;

      try {
         Object var6 = Class.forName("net.minecraft.client.MinecraftClient").getMethod("getInstance").invoke(null);
         Object var7 = var6.getClass().getField("currentScreen").get(var6);
         if (var7 instanceof PulseClickGuiScreen) {
            var5 = ((PulseClickGuiScreen)var7).clickBtn;
         }
      } catch (Throwable var28) {
      }

      boolean var16 = var5 == 1;
      boolean var17 = this.i.hasOpenPanelAt(var3, var4);
      if (var17) {
         if (var16) {
            this.i.f();
         } else {
            this.i.c(var3, var4);
         }

         return;
      }

      float var9 = var2 + 48.0F;
      float var10 = pulse.PulseClickGuiScreen.e() - 48.0F - 5.0F;
      if (!(var4 < var9) && !(var4 > var9 + var10)) {
         List var11 = this.a.e();
         if (var11 != null && !var11.isEmpty()) {
            int var12 = this.a.f();
            if (var12 <= 0) {
               var12 = 2;
            }

            float var13 = this.k();
            float var14 = var1 + 19.0F;
            float var15 = var9 - this.h.b();

            for (int var18 = 0; var18 < var11.size(); var18++) {
               GuiEntry var19 = (GuiEntry)var11.get(var18);
               int var20 = var18 % var12;
               int var21 = var18 / var12;
               float var22 = var14 + var20 * (var13 + 6.5F) + 1.0F;
               float var23 = var15 + var21 * 34.0F + 1.0F;
               if (GuiInput.a(var22, var23, var13, 26.0F, var3, var4)) {
                  float var24 = var22 + var13 - ModuleRowRenderer.b() - ModuleRowRenderer.a();
                  float var25 = var23 + 13.0F - ModuleRowRenderer.b() / 2.0F;
                  float var26 = var24 - ModuleRowRenderer.d() - ModuleRowRenderer.c();
                  float var27 = var23 + 13.0F - ModuleRowRenderer.c() / 2.0F;
                  if (var19.d() && var19.g() && GuiInput.a(var26, var27, ModuleRowRenderer.c(), ModuleRowRenderer.c(), var3, var4)) {
                     if (!var16) {
                        this.i.a(var19, var18, var20 != 0, var22, var23, var13, 26.0F, var26, var27);
                     }

                     return;
                  }

                  if (!var16) {
                     var19.a(!var19.b());
                     return;
                  }

                  if (var19.d() && !var19.g()) {
                     this.i.a(var19, var18, var20 != 0, var22, var23, var13, 26.0F, var3, var4);
                  } else if (var19.e() != null && !var19.e().m().isEmpty()) {
                     this.i.a(var19, var18, var20 != 0, var23, 26.0F);
                  }

                  return;
               }
            }

         }
      }
   }

   public void c(float var1, float var2, int var3, int var4) {
      this.h.d();
      this.i.e(var3, var4);
   }

   public void a(float var1, float var2, int var3, int var4, double var5, double var7) {
      this.i.a(var3, var4, var5, var7);
      if (this.h.c()) {
         List var9 = this.a.e();
         int var10 = this.a.f();
         float var11 = this.c(var9.size(), var10);
         float var12 = pulse.PulseClickGuiScreen.e();
         float var13 = var12 - 48.0F - 18.0F;
         this.h.a(var4, var11, var13);
      }
   }

   public void a(float var1) {
      try {
         if (this.i.hasOpenPanelAt(this.o, this.p) && this.i.a(var1, this.o, this.p)) {
            return;
         }
      } catch (Throwable var9) {
      }

      try {
         if (this.h.c()) {
            return;
         }
      } catch (Throwable var8) {
      }

      List var4 = this.a.e();
      if (var4 != null && !var4.isEmpty()) {
         int var5 = this.a.f();
         if (var5 <= 0) {
            var5 = 2;
         }

         float var6 = this.c(var4.size(), var5);
         float var7 = pulse.PulseClickGuiScreen.e() - 48.0F - 19.0F;
         this.h.a(var1, var6, var7);
      }
   }

   public void a(float var1, int var2, int var3) {
      this.o = var2;
      this.p = var3;
      this.a(var1);
   }

   public boolean a(int var1, int var2, int var3) {
      return this.i.a(var1, var2, var3);
   }

   public boolean a(char var1, int var2) {
      return this.i.a(var1, var2);
   }

   public boolean c() {
      return this.i.l();
   }

   public void d() {
      this.h.e();
      this.i.i();
   }

   public void e() {
      this.i.i();
   }

   public void f() {
      this.i.j();
   }

   public void g() {
      this.i.g();
   }

   public void h() {
      this.i.h();
   }

   public void i() {
      this.i.k();
   }

   public boolean j() {
      return this.i.c();
   }

   public boolean a(int var1, int var2) {
      return this.i.b(var1, var2);
   }

   public ModuleCard b(int var1, int var2) {
      return this.i.a(var1, var2);
   }

   public boolean hasOpenSettingsAt(int var1, int var2) {
      return this.i.hasOpenPanelAt(var1, var2);
   }

   public void a(ClientModule var1) {
      this.i.a(var1);
   }

   public static String b(String var0, String var1, int var2, int var3, int var4, int var5) {
      char[] var6 = var1.toCharArray();
      char[] var7 = new char[var6.length];
      int var18 = -974378644;
      int var17 = -946646734;
      int var10000 = (var17 | var18) - (var17 & var18);
      var18 = 41908308;
      var17 = var10000;
      char[] var219 = new char[(var17 | var18) & ~(var17 & var18)];
      var18 = -810444662;
      var17 = 867851557;
      int var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -66337361;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      int var10003 = (int)2998392714380501669L;
      var18 = -2128556383;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 484729910;
      var17 = var10003;
      var219[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var10002 = (int)-3257492399381164282L;
      var18 = -225397811;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 113867978;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)-8127788022418250952L;
      var18 = -108061024;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -1147478499;
      var17 = var10003;
      var219[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var10002 = (int)-4057933170514856743L;
      var18 = 1730630301;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 1711842886;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 959921080;
      var17 = 1859408963;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1474514045;
      var17 = var10003;
      var219[var10002] = (char)((var17 | var18) - (var17 & var18));
      var10002 = (int)7893723551981329261L;
      var18 = 360239691;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 2072217893;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)8773075071294108893L;
      var18 = 543735111;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1942367863;
      var17 = var10003;
      var219[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var18 = 2059541099;
      var17 = -1034529586;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1198240095;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1440946491;
      var17 = 1627796544;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -887471200;
      var17 = var10003;
      var219[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var10002 = (int)6303682443715185581L;
      var18 = 159789027;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -888888245;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)-4945871879861787671L;
      var18 = -193735958;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 1011692673;
      var17 = var10003;
      var219[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var10002 = (int)-6039933490883172632L;
      var18 = -1629149649;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 772358337;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 168182942;
      var17 = -1647941959;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1749013708;
      var17 = var10003;
      var219[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var18 = 799076940;
      var17 = 404985805;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 931358086;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)1117462186594936415L;
      var18 = -426543802;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -813734085;
      var17 = var10003;
      var219[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var18 = -722643942;
      var17 = 94685939;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -783704351;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var10003 = (int)9049661876938725679L;
      var18 = -1315901329;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 432218387;
      var17 = var10003;
      var219[var10002] = (char)((var17 | var18) - (var17 & var18));
      var10002 = (int)8247084484589089922L;
      var18 = 144139946;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -670690783;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var10003 = (int)2492395026791310243L;
      var18 = 1652237766;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 832799041;
      var17 = var10003;
      var219[var10002] = (char)((var17 | var18) - (var17 & var18));
      char[] var8 = var219;
      var10000 = (int)6385854827388101536L;
      var18 = 991363291;
      var17 = var10000;
      var10000 = (var17 | var18) - (var17 & var18);
      var18 = -2034670735;
      var17 = var10000;
      char[] var222 = new char[(var17 | var18) - (var17 & var18)];
      var10002 = (int)-4556662186109075248L;
      var18 = 32832900;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 1249344852;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)-1540774496797305064L;
      var18 = 1628198596;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 1315326460;
      var17 = var10003;
      var222[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var18 = 870949484;
      var17 = 2006264828;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 1149012369;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -553030533;
      var17 = -1605779984;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 2134922632;
      var17 = var10003;
      var222[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var10002 = (int)234990771432455920L;
      var18 = 852135183;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -1569491971;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1441798561;
      var17 = -1615285951;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 901238861;
      var17 = var10003;
      var222[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var18 = 539444489;
      var17 = -625736137;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -91012291;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)3286002234588867784L;
      var18 = -32400008;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1377924686;
      var17 = var10003;
      var222[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var18 = 1452593559;
      var17 = -1201634384;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -285978077;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)6415300526469646914L;
      var18 = 1649666147;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -1379247519;
      var17 = var10003;
      var222[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var10002 = (int)-3297066557676000687L;
      var18 = 1539500735;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 1864630507;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)-1312654483441805407L;
      var18 = -1524624937;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 478199522;
      var17 = var10003;
      var222[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var18 = 2044047811;
      var17 = -1932739365;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -182907618;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 2002310505;
      var17 = -1903027962;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -104182954;
      var17 = var10003;
      var222[var10002] = (char)((var17 | var18) - (var17 & var18));
      var18 = 690826366;
      var17 = 360863846;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1018131487;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)-9066561948951243040L;
      var18 = 1191388655;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -172809417;
      var17 = var10003;
      var222[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var10002 = (int)9064195423796660525L;
      var18 = -1211351547;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 231946016;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 427973435;
      var17 = 1873931811;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 1983067676;
      var17 = var10003;
      var222[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var18 = 1710062475;
      var17 = -645897353;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -1133700875;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)2326385423619992511L;
      var18 = 228465393;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -1676017027;
      var17 = var10003;
      var222[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      char[] var9 = var222;
      var18 = -1869371843;
      var17 = -1755584551;
      var10000 = (var17 | var18) & ~(var17 & var18);
      var18 = 130564580;
      var17 = var10000;

      for (int var10 = var17 & ~var18 | ~var17 & var18; var10 < var6.length; var10++) {
         char var277 = var6[var10];
         char var205 = var8[var10 % var8.length];
         char var106 = var277;
         var7[var10] = (char)((var106 | var205) & (~var106 | ~var205));
      }

      char[] var19 = new char[var7.length];
      var10000 = (int)4241650178222114402L;
      var18 = 1364619516;
      var17 = var10000;
      var10000 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1999681182;
      var17 = var10000;

      for (int var11 = (var17 | var18) - (var17 & var18); var11 < var6.length; var11++) {
         char var278 = var7[var11];
         char var208 = var9[var11 % var9.length];
         char var109 = var278;
         var19[var11] = (char)((var109 | var208) & (~var109 | ~var208));
      }

      String var20 = new String(var19);
      int var12 = var20.hashCode();
      var18 = var5;
      var17 = var3;
      var10000 = (var17 ^ var18) - 2 * (~var17 & var18);
      var18 = var2;
      var17 = var10000;
      int var13 = (var17 & ~var18) - (~var17 & var18);
      char[] var14 = var0.toCharArray();
      char[] var15 = new char[var14.length];
      var18 = 886605769;
      var17 = 218275623;
      var10000 = var17 + var18 - 2 * (var17 & var18);
      var18 = 970594542;
      var17 = var10000;

      for (int var16 = var17 + var18 - 2 * (var17 & var18); var16 < var15.length; var16++) {
         var18 = 180100889;
         var17 = -2069490079;
         int var10001 = var17 & ~var18 | ~var17 & var18;
         var18 = -1910896262;
         var17 = var10001;
         switch (var16 % ((var17 | var18) - (var17 & var18))) {
            case 0:
               var18 = var12;
               var17 = var13;
               var10002 = var17 + var18 - 2 * (var17 & var18);
               char var218 = var14[var16];
               var17 = var10002;
               var15[var16] = (char)((var17 | var218) - (var17 & var218));
               break;
            case 1:
               var18 = var13;
               var17 = var5;
               var10002 = (var17 | var18) & (~var17 | ~var18);
               char var216 = var14[var16];
               var17 = var10002;
               var15[var16] = (char)((var17 | var216) & ~(var17 & var216));
         }
      }

      return new String(var15);
   }

   public boolean p() {
      return this.i.l();
   }
}
