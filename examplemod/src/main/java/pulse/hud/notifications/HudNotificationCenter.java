package pulse;


import pulse.module.ModuleRegistry;
import java.awt.Color;
import java.util.LinkedList;
import java.util.Queue;
import lombok.Generated;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.hud.BossBarHud;
import net.minecraft.client.gui.hud.PlayerListHud;
import net.minecraft.client.util.math.MatrixStack;
import ru.pulse.mixin.accessor.BossBarHudAccessor;
import ru.pulse.mixin.accessor.PlayerListHudAccessor;

public class HudNotificationCenter {
   private static HudNotificationCenter a;
   private static final MinecraftClient b = MinecraftClient.getInstance();
   private static final Color c;
   private static final Color d;
   private static final Color e;
   private static final Color f;
   private static final float g = 12.0F;
   private static final float h = 7.0F;
   private static final float i = 19.0F;
   private final MediaPlaybackNotification j = new MediaPlaybackNotification();
   private final Queue<HudNotification> k = new LinkedList<>();
   private HudNotification l = null;
   private ActionNotification m = null;
   private final AnimationState n = new AnimationState();
   private final AnimationState o = new AnimationState();
   private final AnimationState p = new AnimationState();
   private final AnimationState q = new AnimationState();
   private final AnimationState r = new AnimationState();
   private float s;
   private float t;
   private float u;
   private float v;
   private final HudNotificationSettingsPanel w = new HudNotificationSettingsPanel();
   private long x = 0L;
   private boolean y;
   private static final long z = 3000L;
   private int A;
   private int B;
   private long C;
   private static final long D = 300L;
   private final AnimationState E;
   private boolean F;

   public HudNotificationCenter() {
      int var4 = -190089002;
      int var3 = 125543897;
      int var10001 = var3 + var4 - 2 * (var3 & var4);
      var4 = -204415729;
      var3 = var10001;
      this.y = pulse.Bool.from((var3 | var4) & (~var3 | ~var4));
      var10001 = (int)-7360807320850103529L;
      var4 = 1007202739;
      var3 = var10001;
      var10001 = var3 & ~var4 | ~var3 & var4;
      var4 = -1867894108;
      var3 = var10001;
      this.A = var3 + var4 - 2 * (var3 & var4);
      var10001 = (int)-1125953005394831729L;
      var4 = 979995399;
      var3 = var10001;
      var10001 = (var3 | var4) - (var3 & var4);
      var4 = 1036115336;
      var3 = var10001;
      this.B = (var3 | var4) & (~var3 | ~var4);
      this.C = 0L;
      this.E = new AnimationState();
      var10001 = (int)8370636946138664042L;
      var4 = 1522497580;
      var3 = var10001;
      var10001 = (var3 | var4) & (~var3 | ~var4);
      var4 = -1394314170;
      var3 = var10001;
      this.F = pulse.Bool.from(var3 + var4 - 2 * (var3 & var4));
      a = this;
      float var1 = this.j.c();
      float var2 = this.j.d();
      this.n.d(var1);
      this.o.d(var2);
      this.p.d(7.0);
      this.q.d(1.0);
      this.r.d(0.0);
      this.E.d(1.0);
      this.s = var1;
      this.t = var2;
      this.u = 7.0F;
   }

   public static HudNotificationCenter a() {
      return a != null ? a : (a = new HudNotificationCenter());
   }

   public static void a(String var0, boolean var1) {
   }

   public static void a(String var0, String var1, String var2) {
   }

   public static void a(ActionNotification var0) {
   }

   public static void a(String var0) {
   }

   public static void a(String var0, String var1) {
   }

   public static void b() {
   }

   public static void c() {
   }

   @Deprecated
   public static void b(String var0, String var1) {
      b();
   }

   private void b(HudNotification var1) {
   }

   public boolean a(double var1, double var3, int var5) {
      return false;
   }

   private boolean b(double var1, double var3) {
      int var14;
      if (var1 >= this.v && var1 <= this.v + this.s && var3 >= this.u && var3 <= this.u + this.t) {
         int var11 = 2003029034;
         int var8 = -1284703729;
         var14 = var8 + var11 - 2 * (var8 & var11);
         var11 = -1005636060;
         var8 = var14;
         var14 = var8 + var11 - 2 * (var8 & var11);
      } else {
         var14 = (int)8685530815709484210L;
         int var6 = -1874346631;
         int var5 = var14;
         var14 = (var5 | var6) & (~var5 | ~var6);
         var6 = -598398517;
         var5 = var14;
         var14 = (var5 | var6) & ~(var5 & var6);
      }

      return pulse.Bool.from(var14);
   }

   public void b(double var1, double var3, int var5) {
      if (this.w.d()) {
         this.w.c((int)var1, (int)var3);
      }

      if (this.l instanceof MediaPlaybackCardNotification) {
         ((MediaPlaybackCardNotification)this.l).b(var1, var3, var5);
      }
   }

   public boolean a(double var1, double var3, double var5) {
      if (this.w.d()) {
         return this.w.a((float)var5, (int)var1, (int)var3);
      }

      int var10000 = (int)897915025602244396L;
      int var8 = 1508119159;
      int var7 = var10000;
      var10000 = var7 + var8 - 2 * (var7 & var8);
      var8 = 40238427;
      var7 = var10000;
      return pulse.Bool.from(var7 & (var8 ^ -1) | (var7 ^ -1) & var8);
   }

   public void a(double var1, double var3, double var5, double var7) {
      if (this.w.d()) {
         this.w.a((int)var1, (int)var3, var5, var7);
      }

      if (this.l instanceof MediaPlaybackCardNotification) {
         ((MediaPlaybackCardNotification)this.l).b(var1, var3);
      }
   }

   public void d() {
   }

   private void b(String var1, boolean var2) {
   }

   public void a(HudNotification var1) {
      this.b(var1);
   }

   private boolean j() {
      if (!this.w.i()) {
         int var17 = 2106197721;
         int var10 = -1283526333;
         int var23 = var10 + var17 - 2 * (var10 & var17);
         var17 = -822806630;
         var10 = var23;
         return pulse.Bool.from(var10 & (var17 ^ -1) | (var10 ^ -1) & var17);
      } else if (this.y) {
         int var15 = 1339287532;
         int var8 = 1834295062;
         int var22 = var8 + var15 - 2 * (var8 & var15);
         var15 = 579270906;
         var8 = var22;
         return pulse.Bool.from(var8 + var15 - 2 * (var8 & var15));
      } else {
         MediaSessionService var1 = HudServiceRegistry.MEDIA;
         if (var1 == null) {
            int var20 = (int)3732176081643581798L;
            int var13 = -295360448;
            int var6 = var20;
            var20 = (var6 | var13) & ~(var6 & var13);
            var13 = -1074390746;
            var6 = var20;
            return pulse.Bool.from((var6 | var13) & (var6 ^ -1 | var13 ^ -1));
         } else {
            MediaPlaybackState var2 = var1.i();
            if (var2 == null) {
               int var10000 = (int)8966773506686975154L;
               int var4 = 2059689671;
               int var3 = var10000;
               var10000 = var3 & ~var4 | ~var3 & var4;
               var4 = 1974575733;
               var3 = var10000;
               return pulse.Bool.from(var3 + var4 - 2 * (var3 & var4));
            } else {
               return var2.c();
            }
         }
      }
   }

   private void k() {
      if (this.w.i()) {
         MediaSessionService var1 = HudServiceRegistry.MEDIA;
         if (var1 != null) {
            MediaPlaybackState var2 = var1.i();
            if (var2 != null) {
               if (var2.k()) {
                  int var10001 = (int)3744576142840479741L;
                  int var6 = 1706820307;
                  int var5 = var10001;
                  var10001 = (var5 | var6) - (var5 & var6);
                  var6 = -371933906;
                  var5 = var10001;
                  this.y = pulse.Bool.from(var5 & ~var6 | ~var5 & var6);
                  b();
               }

               if (var2.l()) {
                  int var18 = (int)-837837122148409128L;
                  int var13 = -38546186;
                  int var8 = var18;
                  var18 = (var8 | var13) - (var8 & var13);
                  var13 = 1862710318;
                  var8 = var18;
                  this.y = pulse.Bool.from((var8 | var13) & (~var8 | ~var13));
                  c();
               }

               if (this.y && var2.c() && !this.w.d()) {
                  long var3 = System.currentTimeMillis() - this.x;
                  if (var3 >= 3000L) {
                     int var15 = 1756047723;
                     int var10 = -1132560629;
                     int var20 = (var10 | var15) & ~(var10 & var15);
                     var15 = -724216224;
                     var10 = var20;
                     this.y = pulse.Bool.from((var10 | var15) & (~var10 | ~var15));
                     b();
                  }
               }
            }
         }
      }
   }

   private void l() {
      this.k();
      if (this.m != null) {
         this.m.e();
         if (this.m.g() || this.m.h()) {
            this.m = null;
         }
      }

      if (this.l != null) {
         this.l.e();
         if (this.l instanceof MediaPlaybackCardNotification) {
            float var1 = this.l.c();
            float var2 = this.l.d();
            if (this.r.j() >= 0.99) {
               this.n.d(var1);
               this.o.d(var2);
            }
         } else {
            float var5 = this.l.c();
            float var11 = this.l.d();
            if (Math.abs(this.n.i() - var5) > 0.1F) {
               this.n.a(var5, 0.25, pulse.Easing.k);
            }

            if (Math.abs(this.o.i() - var11) > 0.1F) {
               this.o.a(var11, 0.25, pulse.Easing.k);
            }
         }

         if (this.l.g()) {
            this.l = null;
            if (this.m != null && !this.m.h()) {
               this.l = this.m;
               this.m = null;
               float var8 = this.l.c();
               float var14 = this.l.d();
               this.n.a(var8, 0.3, pulse.Easing.k);
               this.o.a(var14, 0.3, pulse.Easing.k);
               this.r.a(1.0, 0.2, pulse.Easing.k);
               this.q.a(0.0, 0.15, pulse.Easing.k);
            } else if (this.j()) {
               this.l = new MediaPlaybackCardNotification();
               float var6 = this.l.c();
               float var12 = this.l.d();
               this.n.a(var6, 0.3, pulse.Easing.k);
               this.o.a(var12, 0.3, pulse.Easing.k);
               this.r.d(0.0);
               this.r.a(1.0, 0.2, pulse.Easing.k);
               this.q.a(0.0, 0.15, pulse.Easing.k);
            } else {
               this.r.a(0.0, 0.2, pulse.Easing.k);
               this.q.a(1.0, 0.2, pulse.Easing.k);
               float var7 = this.j.c();
               float var13 = this.j.d();
               this.n.a(var7, 0.3, pulse.Easing.k);
               this.o.a(var13, 0.3, pulse.Easing.k);
            }
         }
      }

      if (this.l == null && !this.k.isEmpty()) {
         this.l = this.k.poll();
         float var9 = this.l.c();
         float var15 = this.l.d();
         this.n.a(var9, 0.3, pulse.Easing.k);
         this.o.a(var15, 0.3, pulse.Easing.k);
         this.r.a(1.0, 0.2, pulse.Easing.k);
         this.q.a(0.0, 0.15, pulse.Easing.k);
      }

      this.n.a();
      this.o.a();
      this.q.a();
      this.r.a();
      float var10 = this.n();
      if (Math.abs(this.u - var10) > 0.5F) {
         double var10001 = var10;
         int var10004 = (int)-5134867517395233592L;
         int var4 = -1654775958;
         int var3 = var10004;
         var10004 = (var3 | var4) & ~(var3 & var4);
         var4 = 1168706467;
         var3 = var10004;
         this.p.a(var10001, 0.3, pulse.Easing.k, pulse.Bool.from(var3 + var4 - 2 * (var3 & var4)));
      }

      this.p.a();
      this.s = (float)this.n.j();
      this.t = (float)this.o.j();
      this.u = (float)this.p.j();
      if (this.l == null) {
         float var16 = this.j.c();
         if (Math.abs(this.s - var16) > 0.5F) {
            double var23 = var16;
            int var21 = -1223073890;
            int var18 = 965050432;
            int var25 = var18 & ~var21 | ~var18 & var21;
            var21 = -1902321697;
            var18 = var25;
            this.n.a(var23, 0.3, pulse.Easing.k, pulse.Bool.from(var18 + var21 - 2 * (var18 & var21)));
         }
      }
   }

   public void a(MatrixStack var1, Renderer2D var2) {
      if (b.world != null && b.player != null) {
         this.l();
         boolean var3 = this.o();
         if (var3 != this.F) {
            if (var3) {
               this.E.a(0.0, 0.15, pulse.Easing.k);
               if (this.w.d()) {
                  this.w.b();
               }
            } else {
               this.E.a(1.0, 0.2, pulse.Easing.k);
            }

            this.F = var3;
         }

         this.E.a();
         float var4 = (float)this.E.j();
         if (!(var4 < 0.01F)) {
            float var5 = b.getWindow().getFramebufferWidth() / 2.0F;
            float var6 = var5 / 2.0F;
            float var7 = (float)(Math.round((var6 - this.s / 2.0F) * 2.0) / 2.0);
            float var8 = this.u;
            this.v = var7;
            Color var9 = this.a(c, var4);
            Color var10 = this.a(d, var4);
            Color var11 = this.a(e, var4);
            Color var12 = this.a(f, var4);
            int var10000 = (int)3819119340720304173L;
            int var21 = 586179025;
            int var20 = var10000;
            var10000 = var20 & ~var21 | ~var20 & var21;
            var21 = 1753567742;
            var20 = var10000;
            int var13 = var20 + var21 - 2 * (var20 & var21);
            var2.a(var7 - var13 / 2.0F, var8 - var13 / 2.0F, this.s + var13, this.t + var13, 12.0F, var9, var9, var10, var10, var1);
            var2.a(var7, var8, this.s, this.t, 12.0F, var11, var11, var12, var12, var1);
            float var14 = (float)this.q.j() * var4;
            float var15 = (float)this.r.j() * var4;
            var2.b().a(var7, var8, this.s, this.t, 12.0F, var1);
            if (var14 > 0.01F) {
               float var16 = var7 + this.j.j();
               float var17 = var8 + this.j.k();
               float var18 = this.s - this.j.j() * 2.0F;
               float var19 = this.t - this.j.k() * 2.0F;
               this.j.a(var1, var2, var16, var17, var18, var19, var14);
            }

            if (this.l != null && var15 > 0.01F) {
               float var22 = var7 + this.l.j();
               float var24 = var8 + this.l.k();
               float var25 = this.s - this.l.j() * 2.0F;
               float var27 = this.t - this.l.k() * 2.0F;
               this.l.a(var1, var2, var22, var24, var25, var27, var15);
            }

            var2.b().a(var1);
            if (this.w.d()) {
               this.w.b(var7, var8, this.s, this.t);
               double var23 = b.getWindow().getScaleFactor();
               int var26 = (int)(b.mouse.getX() * var23 / 2.0);
               int var28 = (int)(b.mouse.getY() * var23 / 2.0);
               this.w.a(var1, var2, var26, var28);
            }
         }
      }
   }

   public float e() {
      return this.s;
   }

   public float f() {
      return this.t;
   }

   private int m() {
      if (b.inGameHud == null) {
         int var12 = -1600076610;
         int var7 = -188398986;
         int var16 = (var7 | var12) & (~var7 | ~var12);
         var12 = 1415939784;
         var7 = var16;
         return (var7 | var12) & ~(var7 & var12);
      } else if (ModuleRegistry.RENDER_TWEAKS != null && ModuleRegistry.RENDER_TWEAKS.s()) {
         int var10 = 1528463265;
         int var5 = 1798053496;
         int var15 = var5 + var10 - 2 * (var5 & var10);
         var10 = 808870361;
         var5 = var15;
         return (var5 | var10) & (~var5 | ~var10);
      } else {
         BossBarHud var1 = b.inGameHud.getBossBarHud();
         if (var1 == null) {
            int var10000 = (int)-9017100609813358651L;
            int var3 = -2125321208;
            int var2 = var10000;
            var10000 = var2 + var3 - 2 * (var2 & var3);
            var3 = -1588593715;
            var2 = var10000;
            return var2 & ~var3 | ~var2 & var3;
         } else {
            return ((BossBarHudAccessor)var1).getBossBars().size();
         }
      }
   }

   private float n() {
      int var1 = this.m();
      long var2 = System.currentTimeMillis();
      if (var1 > this.B) {
         this.B = var1;
         this.C = 0L;
      } else if (var1 < this.B) {
         if (this.C == 0L) {
            this.C = var2;
         } else if (var2 - this.C >= 300L) {
            this.B = var1;
            this.C = 0L;
         }
      } else {
         this.C = 0L;
      }

      this.A = var1;
      if (this.B == 0) {
         return 7.0F;
      }

      double var4 = b.getWindow().getScaleFactor();
      float var6 = this.B * 19.0F;
      float var7 = (float)(var6 * var4 / 2.0);
      return 7.0F + var7;
   }

   public void a(double var1, double var3) {
      if (this.l instanceof MediaPlaybackCardNotification var5) {
         if (HudElementManager.a().p()) {
            var5.n();
         } else {
            var5.a(var1, var3);
            var5.m();
         }
      }

      if (this.l instanceof ActionNotification var6) {
         var6.n();
      }
   }

   public void g() {
      if (this.l instanceof MediaPlaybackCardNotification) {
         ((MediaPlaybackCardNotification)this.l).n();
      }
   }

   private Color a(Color var1, float var2) {
      return new Color(var1.getRed(), var1.getGreen(), var1.getBlue(), (int)(var1.getAlpha() * var2));
   }

   private boolean o() {
      if (b.inGameHud == null) {
         int var11 = (int)-6915921142280719236L;
         int var8 = 978350597;
         int var5 = var11;
         var11 = var5 + var8 - 2 * (var5 & var8);
         var8 = -1041365383;
         var5 = var11;
         return pulse.Bool.from((var5 | var8) - (var5 & var8));
      } else {
         PlayerListHud var1 = b.inGameHud.getPlayerListHud();
         if (var1 == null) {
            int var10000 = (int)8317908010695980096L;
            int var3 = -393028400;
            int var2 = var10000;
            var10000 = (var2 | var3) - (var2 & var3);
            var3 = 326772880;
            var2 = var10000;
            return pulse.Bool.from((var2 | var3) & (var2 & var3 ^ -1));
         } else {
            return ((PlayerListHudAccessor)var1).isVisible();
         }
      }
   }

   @Generated
   public HudNotification h() {
      return this.l;
   }

   @Generated
   public HudNotificationSettingsPanel i() {
      return this.w;
   }

   static {
      int var1 = -1211938104;
      int var0 = -1327932050;
      int var10002 = (var0 | var1) & (~var0 | ~var1);
      var1 = 119150517;
      var0 = var10002;
      var10002 = var0 + var1 - 2 * (var0 & var1);
      var1 = -1560312795;
      var0 = 1790504122;
      int var10003 = var0 & ~var1 | ~var0 & var1;
      var1 = -934844276;
      var0 = var10003;
      var10003 = (var0 | var1) & ~(var0 & var1);
      int var10004 = (int)-4527895249597841287L;
      var1 = -1029629281;
      var0 = var10004;
      var10004 = var0 + var1 - 2 * (var0 & var1);
      var1 = 1630264063;
      var0 = var10004;
      c = new Color(var10002, var10003, var0 & ~var1 | ~var0 & var1);
      var1 = -883251684;
      var0 = 376174622;
      var10002 = var0 + var1 - 2 * (var0 & var1);
      var1 = -583967215;
      var0 = var10002;
      var10002 = (var0 | var1) & ~(var0 & var1);
      var1 = 1309635844;
      var0 = -1665557986;
      var10003 = var0 + var1 - 2 * (var0 & var1);
      var1 = -759763191;
      var0 = var10003;
      var10003 = (var0 | var1) & ~(var0 & var1);
      var1 = -1793182251;
      var0 = 1752162721;
      var10004 = var0 & ~var1 | ~var0 & var1;
      var1 = -42871698;
      var0 = var10004;
      d = new Color(var10002, var10003, (var0 | var1) & (~var0 | ~var1));
      var10002 = (int)5599185413752331332L;
      var1 = -1214695102;
      var0 = var10002;
      var10002 = var0 & ~var1 | ~var0 & var1;
      var1 = 1708696843;
      var0 = var10002;
      var10002 = var0 + var1 - 2 * (var0 & var1);
      var1 = -578790793;
      var0 = 1969585887;
      var10003 = (var0 | var1) & ~(var0 & var1);
      var1 = -1461377883;
      var0 = var10003;
      var10003 = var0 & ~var1 | ~var0 & var1;
      var10004 = (int)-1088784900402875163L;
      var1 = -608556358;
      var0 = var10004;
      var10004 = var0 & ~var1 | ~var0 & var1;
      var1 = 219635278;
      var0 = var10004;
      e = new Color(var10002, var10003, var0 & ~var1 | ~var0 & var1);
      var10002 = (int)-1942405950494372241L;
      var1 = -1938012449;
      var0 = var10002;
      var10002 = var0 & ~var1 | ~var0 & var1;
      var1 = -1018050399;
      var0 = var10002;
      var10002 = (var0 | var1) - (var0 & var1);
      var10003 = (int)1367879423901222294L;
      var1 = 909634857;
      var0 = var10003;
      var10003 = var0 & ~var1 | ~var0 & var1;
      var1 = -2096813906;
      var0 = var10003;
      var10003 = var0 & ~var1 | ~var0 & var1;
      var10004 = (int)4314647726258056193L;
      var1 = -1514445295;
      var0 = var10004;
      var10004 = (var0 | var1) - (var0 & var1);
      var1 = -1690990073;
      var0 = var10004;
      f = new Color(var10002, var10003, (var0 | var1) - (var0 & var1));
   }

   public static String a(String var0, String var1, int var2, int var3, int var4, int var5) {
      char[] var6 = var1.toCharArray();
      char[] var7 = new char[var6.length];
      int var10000 = (int)7245139550293857758L;
      int var18 = 2050241241;
      int var17 = var10000;
      var10000 = (var17 | var18) & ~(var17 & var18);
      var18 = -1588451571;
      var17 = var10000;
      char[] var220 = new char[(var17 | var18) - (var17 & var18)];
      int var10002 = (int)-6675842861464971737L;
      var18 = 1267098022;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -376703103;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 39514697;
      var17 = -1468456298;
      int var10003 = (var17 | var18) - (var17 & var18);
      var18 = -1440507667;
      var17 = var10003;
      var220[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var18 = -1624524384;
      var17 = -571577211;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1120261412;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 221384152;
      var17 = 1152136641;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 1235098524;
      var17 = var10003;
      var220[var10002] = (char)((var17 | var18) - (var17 & var18));
      var18 = 1305262995;
      var17 = -1727573775;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -724833440;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)-8013841190033059526L;
      var18 = 128021498;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -1844526778;
      var17 = var10003;
      var220[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var10002 = (int)-7478936700373351636L;
      var18 = 1513154609;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 1856875294;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var10003 = (int)3771302792215968940L;
      var18 = 1693881850;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -493964987;
      var17 = var10003;
      var220[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var18 = -788096575;
      var17 = -1220206558;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 1715714535;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 568302930;
      var17 = 748660648;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 222342111;
      var17 = var10003;
      var220[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var18 = 1434077326;
      var17 = -1608809699;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -178140266;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 33776144;
      var17 = -1462519294;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -1429168752;
      var17 = var10003;
      var220[var10002] = (char)((var17 | var18) - (var17 & var18));
      var18 = 1720636727;
      var17 = -1228112345;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -800937194;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)8807603711453650125L;
      var18 = 939292840;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 409415030;
      var17 = var10003;
      var220[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var10002 = (int)3301041178041479003L;
      var18 = 1379834057;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1680340885;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1637739244;
      var17 = -24588903;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -1626008745;
      var17 = var10003;
      var220[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var10002 = (int)3481477680414712328L;
      var18 = 411697469;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 706470717;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)2402887847854425861L;
      var18 = -1502283552;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -1744586826;
      var17 = var10003;
      var220[var10002] = (char)((var17 | var18) - (var17 & var18));
      var10002 = (int)-2183220785021806072L;
      var18 = 434704242;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 2070910323;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 2001044674;
      var17 = -1954292089;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -54108831;
      var17 = var10003;
      var220[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      char[] var8 = var220;
      var10000 = (int)-6090689780781136268L;
      var18 = 236580264;
      var17 = var10000;
      var10000 = (var17 | var18) & (~var17 | ~var18);
      var18 = 90811350;
      var17 = var10000;
      char[] var223 = new char[(var17 | var18) & ~(var17 & var18)];
      var10002 = (int)-2719283425145836846L;
      var18 = 604070600;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -57522150;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)-6978522299725715123L;
      var18 = -1939425145;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -1076749846;
      var17 = var10003;
      var223[var10002] = (char)((var17 | var18) - (var17 & var18));
      var18 = 226585637;
      var17 = 128778787;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 170683911;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var10003 = (int)4399148041047759084L;
      var18 = 1898261963;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -1675333340;
      var17 = var10003;
      var223[var10002] = (char)((var17 | var18) - (var17 & var18));
      var18 = -1616988009;
      var17 = -2044639290;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 432013139;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)8350160306910849719L;
      var18 = -12664959;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 566415973;
      var17 = var10003;
      var223[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var18 = -66240726;
      var17 = -360091763;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 377770148;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)9069737809936140817L;
      var18 = -1259120103;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -1143003126;
      var17 = var10003;
      var223[var10002] = (char)((var17 | var18) - (var17 & var18));
      var10002 = (int)4745476145728987624L;
      var18 = -1137867166;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -932599922;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)1805975069547556833L;
      var18 = -550454539;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 44526932;
      var17 = var10003;
      var223[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var10002 = (int)-1040619182502519888L;
      var18 = 1667401055;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -1827119382;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 333605283;
      var17 = 1486838708;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 1266485891;
      var17 = var10003;
      var223[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var18 = 561920654;
      var17 = 1102705333;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 1623705661;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)2781550033385097435L;
      var18 = -980969409;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1700927453;
      var17 = var10003;
      var223[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var10002 = (int)5516870594191495604L;
      var18 = 2103697193;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 469159578;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)4342658229005948979L;
      var18 = 774310363;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -1896578608;
      var17 = var10003;
      var223[var10002] = (char)((var17 | var18) - (var17 & var18));
      var18 = 2019250946;
      var17 = 1022196024;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 1152789042;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 119601540;
      var17 = 1126571938;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 1141269794;
      var17 = var10003;
      var223[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var10002 = (int)5158874081058257403L;
      var18 = -2127605676;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1398614438;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var10003 = (int)-2110326842738777306L;
      var18 = 1209457301;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1434219904;
      var17 = var10003;
      var223[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      char[] var9 = var223;
      var18 = 2043572545;
      var17 = -910586317;
      var10000 = (var17 | var18) & ~(var17 & var18);
      var18 = -1334313102;
      var17 = var10000;

      for (int var10 = var17 & ~var18 | ~var17 & var18; var10 < var6.length; var10++) {
         char var278 = var6[var10];
         char var205 = var8[var10 % var8.length];
         char var106 = var278;
         var7[var10] = (char)(var106 & ~var205 | ~var106 & var205);
      }

      char[] var19 = new char[var7.length];
      var10000 = (int)-1625079003230132187L;
      var18 = 1697471188;
      var17 = var10000;
      var10000 = (var17 | var18) & (~var17 | ~var18);
      var18 = -710348047;
      var17 = var10000;

      for (int var11 = (var17 | var18) & (~var17 | ~var18); var11 < var6.length; var11++) {
         char var279 = var7[var11];
         char var208 = var9[var11 % var9.length];
         char var109 = var279;
         var19[var11] = (char)(var109 & ~var208 | ~var109 & var208);
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
      var18 = 2016154728;
      var17 = 425062553;
      var10000 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1635378417;
      var17 = var10000;

      for (int var16 = (var17 | var18) - (var17 & var18); var16 < var15.length; var16++) {
         var18 = 1968355016;
         var17 = -782879262;
         int var10001 = var17 + var18 - 2 * (var17 & var18);
         var18 = -1543208152;
         var17 = var10001;
         switch (var16 % ((var17 | var18) & ~(var17 & var18))) {
            case 0:
               var18 = var12;
               var17 = var13;
               var10002 = var17 & ~var18 | ~var17 & var18;
               char var218 = var14[var16];
               var17 = var10002;
               var15[var16] = (char)(var17 & ~var218 | ~var17 & var218);
               break;
            case 1:
               var18 = var13;
               var17 = var5;
               var10002 = (var17 | var18) & ~(var17 & var18);
               char var216 = var14[var16];
               var17 = var10002;
               var15[var16] = (char)(var17 & ~var216 | ~var17 & var216);
         }
      }

      return new String(var15);
   }
}

