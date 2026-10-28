package pulse;


import pulse.module.ModuleRegistry;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.util.math.MatrixStack;
import org.lwjgl.glfw.GLFW;
import ru.pulse.Pulse;

public class HudElementManager {
   private static final HudElementManager a = new HudElementManager();
   private final MinecraftClient b = MinecraftClient.getInstance();
   private final List<HudElement> c = new ArrayList<>();
   private HudNotificationCenter d;
   private PotionsHudElement e;
   private HotkeysHudElement f;
   private CooldownsHudElement g;
   private TargetHudElement h;
   private boolean i;
   private HudElement j;
   private int k;
   private List<HudSnapGuide> l;
   private static final Color m;
   private static final Color n;
   private static final Color o;
   private final Deque<HudElementPositionSnapshot> p;
   private final Deque<HudElementPositionSnapshot> q;
   private static final int r = 50;
   private float s;
   private float t;
   private boolean u;

   private HudElementManager() {
      int var10001 = (int)6729814913759199330L;
      int var2 = 829140487;
      int var1 = var10001;
      var10001 = (var1 | var2) & ~(var1 & var2);
      var2 = 1003875941;
      var1 = var10001;
      this.i = pulse.Bool.from((var1 | var2) - (var1 & var2));
      this.j = null;
      var10001 = (int)-9107655183158514566L;
      var2 = -1669427152;
      var1 = var10001;
      var10001 = (var1 | var2) - (var1 & var2);
      var2 = 459930698;
      var1 = var10001;
      this.k = var1 & ~var2 | ~var1 & var2;
      this.l = new ArrayList<>();
      this.p = new LinkedList<>();
      this.q = new LinkedList<>();
      this.s = -1.0F;
      this.t = -1.0F;
      var2 = 1204425601;
      var1 = -1410396199;
      var10001 = var1 & ~var2 | ~var1 & var2;
      var2 = -333112232;
      var1 = var10001;
      this.u = pulse.Bool.from(var1 & ~var2 | ~var1 & var2);
      this.d = new HudNotificationCenter();
      Object var4 = null;
      this.e = new PotionsHudElement(10.0F, 10.0F);
      this.f = new HotkeysHudElement(10.0F, 60.0F);
      this.g = new CooldownsHudElement(10.0F, 110.0F);
      this.h = new TargetHudElement(10.0F, 160.0F);
      this.c(this.e);
      this.c(this.f);
      this.c(this.g);
      this.c(this.h);
   }

   public static HudElementManager a() {
      return a;
   }

   public void b() {
   }

   public void c() {
   }

   private void c(HudElement var1) {
      if (var1 != null && !this.c.contains(var1)) {
         this.c.add(var1);
         this.r();
      }
   }

   private void d(HudElement var1) {
      this.c.remove(var1);
   }

   private void r() {
      this.c.sort(Comparator.comparingInt(HudElement::p));
   }

   private List<HudElement> s() {
      ArrayList<HudElement> var1 = new ArrayList<>(this.c);
      var1.sort((var0, var1x) -> Integer.compare(var1x.p(), var0.p()));
      return var1;
   }

   private boolean e(HudElement var1) {
      if (var1 == this.e) {
         return ModuleRegistry.POTIONS_HUD.k();
      } else if (var1 == this.f) {
         return ModuleRegistry.HOTKEYS_HUD.k();
      } else if (var1 == this.g) {
         return ModuleRegistry.COOLDOWNS_HUD.k();
      } else {
         return var1 == this.h ? ModuleRegistry.TARGET_HUD.k() : var1.c();
      }
   }

   private List<HudElement> t() {
      return this.c.stream().filter(this::e).collect(Collectors.toList());
   }

   private double scaleMouseX(double mouseX) {
      return mouseX * this.b.getWindow().getScaleFactor() / 2.0;
   }

   private double scaleMouseY(double mouseY) {
      return mouseY * this.b.getWindow().getScaleFactor() / 2.0;
   }

   public void a(MatrixStack var1) {
      if (this.b.world != null && this.b.player != null) {
         Renderer2D var2 = Pulse.getInstance().getRender();
         if (var2 != null) {
            ScreenScale.a(2.0);
            float var3 = (float)(this.b.getWindow().getFramebufferWidth() / 2.0);
            float var4 = (float)(this.b.getWindow().getFramebufferHeight() / 2.0);
            if (this.s > 0.0F && this.t > 0.0F && (Math.abs(var3 - this.s) > 1.0F || Math.abs(var4 - this.t) > 1.0F)) {
               this.a(var3, var4);
            }

            this.s = var3;
            this.t = var4;
            if (this.d != null && ModuleRegistry.WATERMARK.k()) {
               this.d.a(var1, var2);
            }

            for (HudElement var6 : this.c) {
               if (this.e(var6)) {
                  var6.e();
                  var6.a(var1, var2, var3, var4);
                  var6.a(var2, var1);
               }
            }

            if (this.j != null && !this.l.isEmpty()) {
               this.a(var1, var2);
            }

            if (this.j != null && !this.u) {
               this.a(var1, var2, var3, var4);
            }

            int var11 = (int)(this.b.mouse.getX() * this.b.getWindow().getScaleFactor() / 2.0 / this.b.getWindow().getScaleFactor());
            int var12 = (int)(this.b.mouse.getY() * this.b.getWindow().getScaleFactor() / 2.0 / this.b.getWindow().getScaleFactor());
            int var7 = (int)(var11 * this.b.getWindow().getScaleFactor() / 2.0);
            int var8 = (int)(var12 * this.b.getWindow().getScaleFactor() / 2.0);

            for (HudElement var10 : this.c) {
               if (this.e(var10)) {
                  var10.a(var1, var2, var7, var8);
               }
            }

            ScreenScale.a();
         }
      }
   }
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void a(MatrixStack var1, Renderer2D var2) {
      for (HudSnapGuide var4 : this.l) {
         Color var5 = switch (var4.b()) {
            case SCREEN_CENTER -> n;
            case ELEMENT_EDGE, ELEMENT_CENTER -> o;
            default -> m;
         };
         if (var4.a() == HudSnapGuide.Orientation.VERTICAL) {
            var2.a(var4.c() - 0.5F, var4.d(), 1.0F, var4.e() - var4.d(), 0.0F, var5, var1);
         } else {
            var2.a(var4.d(), var4.c() - 0.5F, var4.e() - var4.d(), 1.0F, 0.0F, var5, var1);
         }
      }
   }

   private void a(MatrixStack var1, Renderer2D var2, float var3, float var4) {
      int var12 = 1878098306;
      int var11 = -1454336740;
      int var10001 = var11 & ~var12 | ~var11 & var12;
      var12 = -962521978;
      var11 = var10001;
      FontRenderer var5 = FontManager.a[(var11 | var12) - (var11 & var12)];
      int var10002 = (int)2411560658058214786L;
      var12 = 486444321;
      var11 = var10002;
      var10002 = (var11 | var12) - (var11 & var12);
      var12 = -1363082439;
      var11 = var10002;
      var10002 = var11 & ~var12 | ~var11 & var12;
      int var10003 = (int)-5278388757720927203L;
      var12 = -1008358341;
      var11 = var10003;
      var10003 = var11 & ~var12 | ~var11 & var12;
      var12 = 1031155937;
      var11 = var10003;
      var10003 = var11 + var12 - 2 * (var11 & var12);
      int var10004 = (int)-5518244943738454958L;
      var12 = -476127578;
      var11 = var10004;
      var10004 = (var11 | var12) & ~(var11 & var12);
      var12 = 246331641;
      var11 = var10004;
      var10004 = (var11 | var12) - (var11 & var12);
      var12 = -1005788200;
      var11 = -212237930;
      int var10005 = (var11 | var12) & (~var11 | ~var12);
      var12 = 927342034;
      var11 = var10005;
      String var6 = a(
         "ȨูȾํȽีȹ\u0e3dȲ๏ȾਭيੁٟਭȿึɄਭɊ฿ȵ\u0e3cȵูȶำȸำثาȾํȾัȾไȾะȳโ",
         "`ꟳꓺꁡꤐ絺蹙⑿譸㑿g\ua7e2ꓺꁕꤗ絷蹍⑽謶㑵~\ua7e3꒘ꁰꤋ絷蹍⑿謥",
         var10002,
         var10003,
         var10004,
         (var11 | var12) & ~(var11 & var12)
      );
      float var7 = var5.a(var6);
      float var8 = var3 / 2.0F - var7 / 2.0F;
      float var9 = var4 - 65.0F;
      var12 = -1719850108;
      var11 = -995444659;
      var10002 = (var11 | var12) - (var11 & var12);
      var12 = 1574409014;
      var11 = var10002;
      var10002 = (var11 | var12) & ~(var11 & var12);
      var10003 = (int)-9076376261899521966L;
      var12 = -1874676408;
      var11 = var10003;
      var10003 = (var11 | var12) - (var11 & var12);
      var12 = 1978811877;
      var11 = var10003;
      var10003 = var11 & ~var12 | ~var11 & var12;
      var10004 = (int)8987148424659802074L;
      var12 = -1770952372;
      var11 = var10004;
      var10004 = (var11 | var12) & (~var11 | ~var12);
      var12 = -973177239;
      var11 = var10004;
      var10004 = (var11 | var12) & (~var11 | ~var12);
      var12 = -2123023833;
      var11 = 1660393874;
      var10005 = (var11 | var12) & (~var11 | ~var12);
      var12 = -477977731;
      var11 = var10005;
      Color var10 = new Color(var10002, var10003, var10004, (var11 | var12) & (~var11 | ~var12));
      var5.a(var6, var8, var9, var10, var1);
   }

   private void a(float var1, float var2) {
      for (HudElement var4 : this.c) {
         var4.a(var1, var2);
      }
   }

   public void d() {
   }

   private void f(HudElement var1) {
      this.p.push(new HudElementPositionSnapshot(var1));
      int var10000 = this.p.size();
      int var10001 = (int)-785446781255838039L;
      int var3 = -1498293437;
      int var2 = var10001;
      var10001 = (var2 | var3) & (~var2 | ~var3);
      var3 = -67875368;
      var2 = var10001;
      if (var10000 > var2 + var3 - 2 * (var2 & var3)) {
         this.p.removeLast();
      }

      this.q.clear();
   }

   public void e() {
   }

   public void f() {
   }

   public boolean a(int var1, int var2) {
      return false;
   }

   public void g() {
      int var30;
      label12: {
         long var1 = this.b.getWindow().getHandle();
         int var10002 = (int)-6902557992222597341L;
         int var4 = 2067036395;
         int var3 = var10002;
         var10002 = (var3 | var4) & (~var3 | ~var4);
         var4 = -1422023010;
         var3 = var10002;
         var30 = GLFW.glfwGetKey(var1, (var3 | var4) & ~(var3 & var4));
         var4 = -403062197;
         var3 = 1587556739;
         var10002 = var3 + var4 - 2 * (var3 & var4);
         var4 = -1185287223;
         var3 = var10002;
         if (var30 != (var3 & ~var4 | ~var3 & var4)) {
            var10002 = (int)-7832858612184701681L;
            var4 = 51170800;
            var3 = var10002;
            var10002 = (var3 | var4) & ~(var3 & var4);
            var4 = -1345066587;
            var3 = var10002;
            var30 = GLFW.glfwGetKey(var1, (var3 | var4) & ~(var3 & var4));
            var4 = -67908937;
            var3 = -849280202;
            var10002 = (var3 | var4) & ~(var3 & var4);
            var4 = 915589504;
            var3 = var10002;
            if (var30 != (var3 & ~var4 | ~var3 & var4)) {
               var4 = -782933485;
               var3 = 2000197089;
               var30 = (var3 | var4) & (~var3 | ~var4);
               var4 = -1502742542;
               var3 = var30;
               var30 = (var3 | var4) - (var3 & var4);
               break label12;
            }
         }

         var30 = (int)218042528756391135L;
         var4 = 1502399340;
         var3 = var30;
         var30 = (var3 | var4) - (var3 & var4);
         var4 = 167712690;
         var3 = var30;
         var30 = var3 & ~var4 | ~var3 & var4;
      }

      this.u = pulse.Bool.from(var30);
   }

   public HudNotificationCenter h() {
      return this.d;
   }

   public PotionsHudElement i() {
      return this.e;
   }

   public HotkeysHudElement j() {
      return this.f;
   }

   public CooldownsHudElement k() {
      return this.g;
   }

   public TargetHudElement l() {
      return this.h;
   }

   public void b(MatrixStack var1) {
   }

   public void a(double var1, double var3) {
      if (this.i) {
         this.g();
         if (!this.b.isWindowFocused()) {
            for (HudElement var6 : this.c) {
               if (this.e(var6)) {
                  int var54 = 1569094312;
                  int var39 = -98674608;
                  int var66 = (var39 | var54) & ~(var39 & var54);
                  var54 = -1483201800;
                  var39 = var66;
                  var6.a(0.0, 0.0, pulse.Bool.from((var39 | var54) - (var39 & var54)));
               }
            }
         } else {
            double var5 = var1 * this.b.getWindow().getScaleFactor() / 2.0;
            double var7 = var3 * this.b.getWindow().getScaleFactor() / 2.0;
            if (this.j != null) {
               for (HudElement var20 : this.c) {
                  if (this.e(var20)) {
                     int var63;
                     if (var20 == this.j) {
                        int var50 = -498236804;
                        int var35 = -1908645167;
                        var63 = (var35 | var50) - (var35 & var50);
                        var50 = 1819402412;
                        var35 = var63;
                        var63 = (var35 | var50) - (var35 & var50);
                     } else {
                        var63 = (int)4669241553382633874L;
                        int var52 = 176576452;
                        int var37 = var63;
                        var63 = (var37 | var52) & ~(var37 & var52);
                        var52 = 895166038;
                        var37 = var63;
                        var63 = (var37 | var52) - (var37 & var52);
                     }

                     int var24 = var63;
                     var20.a(var5, var7, pulse.Bool.from(var24));
                  }
               }

               GuiInput.g();
            } else {
               int var15 = -1112136752;
               int var14 = 975453677;
               int var10000 = (var14 | var15) & (~var14 | ~var15);
               var15 = -2020467139;
               var14 = var10000;
               int var9 = (var14 | var15) & ~(var14 & var15);

               for (HudElement var11 : this.c) {
                  if (this.e(var11) && var11.f().c() && var11.f().c((int)var5, (int)var7)) {
                     var10000 = (int)485580324827015940L;
                     var15 = 3009373;
                     var14 = var10000;
                     var10000 = (var14 | var15) - (var14 & var15);
                     var15 = -1827258280;
                     var14 = var10000;
                     var9 = var14 & ~var15 | ~var14 & var15;
                     break;
                  }
               }

               if (var9 != 0) {
                  for (HudElement var23 : this.c) {
                     if (this.e(var23)) {
                        var15 = -12443721;
                        var14 = 1621739943;
                        int var10003 = (var14 | var15) - (var14 & var15);
                        var15 = -1611934192;
                        var14 = var10003;
                        var23.a(var5, var7, pulse.Bool.from((var14 | var15) & (var14 & var15 ^ -1)));
                     }
                  }
               } else {
                  HudElement var18 = null;

                  for (HudElement var12 : this.s()) {
                     if (this.e(var12) && var12.a(var5, var7)) {
                        var18 = var12;
                        break;
                     }
                  }

                  for (HudElement var25 : this.c) {
                     if (this.e(var25)) {
                        if (var25 == var18) {
                           var15 = 1662555325;
                           var14 = 76999151;
                           var10000 = (var14 | var15) & ~(var14 & var15);
                           var15 = 1737391443;
                           var14 = var10000;
                           var10000 = (var14 | var15) & ~(var14 & var15);
                        } else {
                           var10000 = (int)5226120565973535965L;
                           var15 = 1927199192;
                           var14 = var10000;
                           var10000 = (var14 | var15) & (~var14 | ~var15);
                           var15 = 1122628869;
                           var14 = var10000;
                           var10000 = (var14 | var15) & (~var14 | ~var15);
                        }

                        int var13 = var10000;
                        var25.a(var5, var7, pulse.Bool.from(var13));
                     }
                  }

                  if (var18 != null) {
                     GuiInput.g();
                  }
               }
            }
         }
      }
   }

   public boolean a(double var1, double var3, int var5) {
      if (!this.i || !this.b.isWindowFocused()) {
         return false;
      }

      double var6 = this.scaleMouseX(var1);
      double var8 = this.scaleMouseY(var3);
      if (this.d != null && ModuleRegistry.WATERMARK.k() && this.d.a(var6, var8, var5)) {
         return true;
      }

      for (HudElement var11 : this.s()) {
         if (this.e(var11) && var11.a(var6, var8, var5)) {
            if (var5 == 0 && var11.i()) {
               this.j = var11;
               this.f(var11);
               this.l.clear();
            }

            return true;
         }
      }

      return false;
   }

   public boolean b(double var1, double var3, int var5) {
      if (!this.i) {
         return false;
      }

      double var6 = this.scaleMouseX(var1);
      double var8 = this.scaleMouseY(var3);
      boolean var10 = false;
      if (this.j != null) {
         this.j.b(var6, var8, var5);
         this.j = null;
         this.l.clear();
         var10 = true;
      }

      if (this.d != null && ModuleRegistry.WATERMARK.k()) {
         this.d.b(var6, var8, var5);
      }

      return var10;
   }

   public boolean a(double var1, double var3, double var5) {
      double var7 = var1 * this.b.getWindow().getScaleFactor() / 2.0;
      double var9 = var3 * this.b.getWindow().getScaleFactor() / 2.0;
      if (this.j == null) {
         for (HudElement var12 : this.c) {
            if (this.e(var12) && var12.f().e() && var12.a(var7, var9, var5)) {
               int var10000 = (int)8056327977018037018L;
               int var14 = -837299519;
               int var13 = var10000;
               var10000 = var13 + var14 - 2 * (var13 & var14);
               var14 = -1373355558;
               var13 = var10000;
               return pulse.Bool.from((var13 | var14) & (var13 & var14 ^ -1));
            }
         }
      }

      if (this.d != null && ModuleRegistry.WATERMARK.k() && this.d.a(var7, var9, var5)) {
         int var27 = (int)-7210272035354331523L;
         int var23 = -1623363797;
         int var18 = var27;
         var27 = var18 + var23 - 2 * (var18 & var23);
         var23 = -1980180137;
         var18 = var27;
         return pulse.Bool.from(var18 + var23 - 2 * (var18 & var23));
      } else {
         int var21 = 1663273795;
         int var16 = -1189467592;
         int var26 = var16 & ~var21 | ~var16 & var21;
         var21 = -633757317;
         var16 = var26;
         return pulse.Bool.from((var16 | var21) - (var16 & var21));
      }
   }

   public void a(double var1, double var3, double var5, double var7) {
      double var9 = var1 * this.b.getWindow().getScaleFactor() / 2.0;
      double var11 = var3 * this.b.getWindow().getScaleFactor() / 2.0;
      if (this.j == null) {
         for (HudElement var14 : this.c) {
            if (this.e(var14) && var14.f().e()) {
               var14.a(var9, var11, var5, var7);
            }
         }
      }

      if (this.d != null && ModuleRegistry.WATERMARK.k()) {
         this.d.a(var9, var11, var5, var7);
      }

      if (this.j != null) {
         this.g();
         float var18 = (float)(this.b.getWindow().getFramebufferWidth() / 2.0);
         float var19 = (float)(this.b.getWindow().getFramebufferHeight() / 2.0);
         float var15 = (float)var9 - this.j.r();
         float var16 = (float)var11 - this.j.s();
         HudSnapResult var17 = HudSnapCalculator.a(this.j, var15, var16, var18, var19, this.t(), this.u);
         this.j.a(var17, var18, var19);
         this.l = var17.c();
      }
   }

   public boolean b(double var1, double var3) {
      if (this.j == null) {
         int var20 = 939168617;
         int var17 = -1588577457;
         int var23 = (var17 | var20) - (var17 & var20);
         var20 = -1767200730;
         var17 = var23;
         return pulse.Bool.from(var17 + var20 - 2 * (var17 & var20));
      } else {
         double var5 = var1 * this.b.getWindow().getScaleFactor() / 2.0;
         double var7 = var3 * this.b.getWindow().getScaleFactor() / 2.0;
         float var9 = (float)(this.b.getWindow().getFramebufferWidth() / 2.0);
         float var10 = (float)(this.b.getWindow().getFramebufferHeight() / 2.0);
         this.g();
         float var11 = (float)var5 - this.j.r();
         float var12 = (float)var7 - this.j.s();
         HudSnapResult var13 = HudSnapCalculator.a(this.j, var11, var12, var9, var10, this.t(), this.u);
         this.j.a(var13, var9, var10);
         this.l = var13.c();
         int var10000 = (int)-3599128750125463392L;
         int var15 = -1922752917;
         int var14 = var10000;
         var10000 = var14 & ~var15 | ~var14 & var15;
         var15 = 243619530;
         var14 = var10000;
         return pulse.Bool.from((var14 | var15) & (var14 ^ -1 | var15 ^ -1));
      }
   }

   public boolean m() {
      return this.i;
   }

   public void a(boolean var1) {
      if (this.i == var1) {
         return;
      }

      this.i = var1;
      if (!var1) {
         double var2 = this.scaleMouseX(this.b.mouse.getX());
         double var4 = this.scaleMouseY(this.b.mouse.getY());
         if (this.j != null) {
            this.j.b(var2, var4, 0);
            this.j = null;
         }

         this.l.clear();
         for (HudElement var7 : this.c) {
            var7.a(0.0, 0.0, false);
         }

         if (this.d != null) {
            this.d.g();
         }
      }
   }

   public void n() {
      int var10;
      if (!this.i) {
         var10 = (int)6185599058394717268L;
         int var2 = 654757226;
         int var1 = var10;
         var10 = (var1 | var2) - (var1 & var2);
         var2 = 27087167;
         var1 = var10;
         var10 = (var1 | var2) - (var1 & var2);
      } else {
         int var7 = 1573138910;
         int var4 = -227929060;
         var10 = (var4 | var7) & (~var4 | ~var7);
         var7 = -1347541566;
         var4 = var10;
         var10 = var4 + var7 - 2 * (var4 & var7);
      }

      this.a(pulse.Bool.from(var10));
   }

   public List<HudElement> o() {
      return this.c;
   }

   public void a(HudElement var1) {
      this.c(var1);
   }

   public void b(HudElement var1) {
      this.c.remove(var1);
   }

   public boolean p() {
      int var9;
      if (this.j != null) {
         int var2 = 484863727;
         int var1 = 1028242283;
         var9 = var1 + var2 - 2 * (var1 & var2);
         var2 = 565171589;
         var1 = var9;
         var9 = var1 + var2 - 2 * (var1 & var2);
      } else {
         int var7 = -541542031;
         int var4 = 1657700620;
         var9 = var4 & ~var7 | ~var4 & var7;
         var7 = -1116325763;
         var4 = var9;
         var9 = (var4 | var7) - (var4 & var7);
      }

      return pulse.Bool.from(var9);
   }

   public boolean q() {
      return this.u;
   }

   static {
      int var10002 = (int)-1315399460584333994L;
      int var1 = -1777452373;
      int var0 = var10002;
      var10002 = var0 & ~var1 | ~var0 & var1;
      var1 = 2016372633;
      var0 = var10002;
      var10002 = (var0 | var1) - (var0 & var1);
      int var10003 = (int)-3706591958459621602L;
      var1 = 509478567;
      var0 = var10003;
      var10003 = (var0 | var1) & ~(var0 & var1);
      var1 = -1829775091;
      var0 = var10003;
      var10003 = var0 & ~var1 | ~var0 & var1;
      var1 = -545098536;
      var0 = 526935910;
      int var10004 = (var0 | var1) & ~(var0 & var1);
      var1 = -1058401471;
      var0 = var10004;
      var10004 = var0 & ~var1 | ~var0 & var1;
      int var10005 = (int)5132588863651048396L;
      var1 = -213559461;
      var0 = var10005;
      var10005 = (var0 | var1) - (var0 & var1);
      var1 = 1330560035;
      var0 = var10005;
      m = new Color(var10002, var10003, var10004, (var0 | var1) & (~var0 | ~var1));
      var1 = -1350673152;
      var0 = 1164748135;
      var10002 = var0 + var1 - 2 * (var0 & var1);
      var1 = -367855441;
      var0 = var10002;
      var10002 = (var0 | var1) & (~var0 | ~var1);
      var1 = 880971276;
      var0 = 1717735618;
      var10003 = (var0 | var1) & (~var0 | ~var1);
      var1 = 1390419626;
      var0 = var10003;
      var10003 = (var0 | var1) - (var0 & var1);
      var10004 = (int)6697303256961808024L;
      var1 = -1266337980;
      var0 = var10004;
      var10004 = (var0 | var1) & (~var0 | ~var1);
      var1 = -1530707677;
      var0 = var10004;
      var10004 = var0 + var1 - 2 * (var0 & var1);
      var1 = -1185176114;
      var0 = -1668014455;
      var10005 = (var0 | var1) & (~var0 | ~var1);
      var1 = 634371059;
      var0 = var10005;
      n = new Color(var10002, var10003, var10004, var0 + var1 - 2 * (var0 & var1));
      var10002 = (int)-1340787269423591019L;
      var1 = 558042175;
      var0 = var10002;
      var10002 = (var0 | var1) & (~var0 | ~var1);
      var1 = 803675477;
      var0 = var10002;
      var10002 = (var0 | var1) & ~(var0 & var1);
      var1 = 1881792656;
      var0 = 1389169259;
      var10003 = (var0 | var1) & ~(var0 & var1);
      var1 = 585427565;
      var0 = var10003;
      var10003 = (var0 | var1) - (var0 & var1);
      var1 = 1544596881;
      var0 = -12204677;
      var10004 = var0 & ~var1 | ~var0 & var1;
      var1 = -1554683718;
      var0 = var10004;
      var10004 = (var0 | var1) - (var0 & var1);
      var1 = -507910107;
      var0 = 672395602;
      var10005 = var0 + var1 - 2 * (var0 & var1);
      var1 = -911599165;
      var0 = var10005;
      o = new Color(var10002, var10003, var10004, (var0 | var1) & ~(var0 & var1));
   }

   public static String a(String var0, String var1, int var2, int var3, int var4, int var5) {
      char[] var6 = var1.toCharArray();
      char[] var7 = new char[var6.length];
      int var10000 = (int)-8600806510816238125L;
      int var18 = -482994097;
      int var17 = var10000;
      var10000 = var17 + var18 - 2 * (var17 & var18);
      var18 = -942113386;
      var17 = var10000;
      char[] var220 = new char[var17 & ~var18 | ~var17 & var18];
      var18 = -1726985130;
      var17 = 1036769396;
      int var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1529113566;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      int var10003 = (int)-8172760100115119660L;
      var18 = 598897053;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 1435842683;
      var17 = var10003;
      var220[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var10002 = (int)3371070007548582576L;
      var18 = 641610323;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -1898567454;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 146446282;
      var17 = -2048651075;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1923177230;
      var17 = var10003;
      var220[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var18 = -804656696;
      var17 = -609847868;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 196058126;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)-7502668829408547544L;
      var18 = 55438419;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 1358488317;
      var17 = var10003;
      var220[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var18 = 1882542589;
      var17 = 31989037;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 1910328531;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var10003 = (int)-8880562445781016919L;
      var18 = 1189984135;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -77500099;
      var17 = var10003;
      var220[var10002] = (char)((var17 | var18) - (var17 & var18));
      var10002 = (int)-6054216533975067900L;
      var18 = -649715206;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1247326970;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)7430017146726455463L;
      var18 = 1074007911;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -508197147;
      var17 = var10003;
      var220[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var18 = 1471657150;
      var17 = 639538155;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 1906911056;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var10003 = (int)-5029796712887134436L;
      var18 = -438336219;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 103847867;
      var17 = var10003;
      var220[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var18 = 811078698;
      var17 = -1620792520;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1354973420;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)-9047141533692300317L;
      var18 = 1903104801;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 184117713;
      var17 = var10003;
      var220[var10002] = (char)((var17 | var18) - (var17 & var18));
      var18 = -132795507;
      var17 = -2134947820;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 2024471454;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -1596693176;
      var17 = -1654248524;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 1035107038;
      var17 = var10003;
      var220[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var10002 = (int)1582624699702717109L;
      var18 = 1696976662;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 464512427;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -1263897307;
      var17 = -466914579;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 1350635419;
      var17 = var10003;
      var220[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var18 = -1707797480;
      var17 = -458602429;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 2124373074;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)7902663071086477189L;
      var18 = -89839770;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1861099577;
      var17 = var10003;
      var220[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      char[] var8 = var220;
      var10000 = (int)-5960791467393460954L;
      var18 = -289813098;
      var17 = var10000;
      var10000 = (var17 | var18) & ~(var17 & var18);
      var18 = 460101818;
      var17 = var10000;
      char[] var223 = new char[(var17 | var18) & ~(var17 & var18)];
      var10002 = (int)7823722377165465656L;
      var18 = 618134098;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -51441046;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)-4510287896620690415L;
      var18 = -34959509;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 180671322;
      var17 = var10003;
      var223[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var10002 = (int)-5546434774484531603L;
      var18 = -1308319165;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -889363409;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1533639056;
      var17 = -10635971;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -1540077394;
      var17 = var10003;
      var223[var10002] = (char)((var17 | var18) - (var17 & var18));
      var10002 = (int)4956205489958919541L;
      var18 = -449846031;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1409779322;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)4402194107383617544L;
      var18 = -1571813345;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 549164868;
      var17 = var10003;
      var223[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var10002 = (int)-7781756359060698957L;
      var18 = -1537813053;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -1915085453;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var10003 = (int)3174990982180571020L;
      var18 = -856218191;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 889592383;
      var17 = var10003;
      var223[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var10002 = (int)5779371109316987383L;
      var18 = -1378317493;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -433716552;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 1923432791;
      var17 = -833604990;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1124775019;
      var17 = var10003;
      var223[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var18 = 1826953823;
      var17 = 1432617668;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 964761758;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)-2293363915789209825L;
      var18 = 1457393802;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 208750337;
      var17 = var10003;
      var223[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var10002 = (int)1077832885476223372L;
      var18 = -595724323;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -1502175657;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)-5485369999714867040L;
      var18 = 1325152996;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 127243645;
      var17 = var10003;
      var223[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var10002 = (int)-8035499974846703136L;
      var18 = 1213719754;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1899102931;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -47030674;
      var17 = 166611021;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -186907109;
      var17 = var10003;
      var223[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var10002 = (int)-6336161008306659921L;
      var18 = 1640040348;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1173510715;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var10003 = (int)4804130556401728678L;
      var18 = -609211586;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 2136741020;
      var17 = var10003;
      var223[var10002] = (char)((var17 | var18) - (var17 & var18));
      var10002 = (int)6157462798426925323L;
      var18 = 2028657250;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -654199968;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 851010219;
      var17 = -1509426128;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1799443032;
      var17 = var10003;
      var223[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      char[] var9 = var223;
      var18 = -440727157;
      var17 = -1756257654;
      var10000 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1927981825;
      var17 = var10000;

      for (int var10 = var17 + var18 - 2 * (var17 & var18); var10 < var6.length; var10++) {
         char var281 = var6[var10];
         char var205 = var8[var10 % var8.length];
         char var106 = var281;
         var7[var10] = (char)((var106 | var205) & ~(var106 & var205));
      }

      char[] var19 = new char[var7.length];
      var10000 = (int)1800955831615900156L;
      var18 = 1820921937;
      var17 = var10000;
      var10000 = var17 & ~var18 | ~var17 & var18;
      var18 = 455825837;
      var17 = var10000;

      for (int var11 = (var17 | var18) & (~var17 | ~var18); var11 < var6.length; var11++) {
         char var282 = var7[var11];
         char var208 = var9[var11 % var9.length];
         char var109 = var282;
         var19[var11] = (char)(var109 + var208 - 2 * (var109 & var208));
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
      var10000 = (int)-6390491055339110822L;
      var18 = -1917283142;
      var17 = var10000;
      var10000 = (var17 | var18) & (~var17 | ~var18);
      var18 = -544478496;
      var17 = var10000;

      for (int var16 = var17 + var18 - 2 * (var17 & var18); var16 < var15.length; var16++) {
         var18 = -1692090180;
         var17 = 1920955492;
         int var10001 = (var17 | var18) & ~(var17 & var18);
         var18 = -379865894;
         var17 = var10001;
         switch (var16 % ((var17 | var18) - (var17 & var18))) {
            case 0:
               var18 = var12;
               var17 = var13;
               var10002 = (var17 | var18) & ~(var17 & var18);
               char var218 = var14[var16];
               var17 = var10002;
               var15[var16] = (char)((var17 | var218) - (var17 & var218));
               break;
            case 1:
               var18 = var13;
               var17 = var5;
               var10002 = (var17 | var18) - (var17 & var18);
               char var216 = var14[var16];
               var17 = var10002;
               var15[var16] = (char)(var17 + var216 - 2 * (var17 & var216));
         }
      }

      return new String(var15);
   }
}
