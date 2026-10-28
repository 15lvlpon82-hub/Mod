package pulse;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.util.math.MatrixStack;

public class NotificationListPanel {
   public static final float a = 115.5F;
   private static final float b = 115.5F;
   private static final float c = 134.5F;
   private static final float d = 7.5F;
   private static final float e = 5.0F;
   private static final float f = 10.0F;
   private static final float g = 4.0F;
   private static final float h = 19.5F;
   private static final float i = 5.0F;
   private static final float j = 19.5F;
   private static final float k = 6.5F;
   private static final float l = 5.0F;
   private static final float m = 2.0F;
   private static final Color n = pulse.Theme.I;
   private static final Color o = pulse.Theme.K;
   private static final Color p = pulse.Theme.O;
   private final List<Notification> q = new ArrayList<>();
   private final List<NotificationCard> r = new ArrayList<>();
   private Notification s = null;
   private final SearchBox t;
   private final ScrollBar u;
   private final PanelFadeOverlay v;
   private final AnimationState w = new AnimationState();
   private boolean x;
   private String y;
   private List<NotificationCard> z;
   private Consumer<Notification> A;
   private Consumer<Notification> B;
   private float C;
   private float D;
   private float E;
   private float F;
   private float G;

   public NotificationListPanel() {
      int var3 = 1878348847;
      int var2 = -1011984328;
      int var10001 = (var2 | var3) & ~(var2 & var3);
      var3 = -1403319273;
      var2 = var10001;
      this.x = pulse.Bool.from((var2 | var3) - (var2 & var3));
      var3 = 2130521529;
      var2 = 1214980535;
      int var10003 = var2 & ~var3 | ~var2 & var3;
      var3 = 2031283118;
      var2 = var10003;
      var10003 = (var2 | var3) & ~(var2 & var3);
      int var10004 = (int)5983342260721480442L;
      var3 = 1941452132;
      var2 = var10004;
      var10004 = (var2 | var3) & ~(var2 & var3);
      var3 = 196692806;
      var2 = var10004;
      var10004 = (var2 | var3) - (var2 & var3);
      var3 = -1982480598;
      var2 = -131918577;
      int var10005 = (var2 | var3) & (~var2 | ~var3);
      var3 = 1833364825;
      var2 = var10005;
      var10005 = (var2 | var3) & (~var2 | ~var3);
      var3 = -31287754;
      var2 = -1802147818;
      int var10006 = var2 + var3 - 2 * (var2 & var3);
      var3 = 1790401766;
      var2 = var10006;
      this.y = a("", "`РєСџС–РєвЂњС”РєРѓРЋРєВ¤С’Р·ВµС”Рёв„–в„ўРІвЂС—РёВ­С‘РівЂТ‘~\ua7efРєвЂ™В¶РєРѓС”РєВ¤вЂљР·ВµР€Рёв„–С“\u2435РёВ¬С”РівЂР†|РєСџС–РєвЂњС”РєРѓСРєВ¤вЂћР·ВµВ¤Рёв„–РѓРІвЂС—РёВ¬ТђРівЂВ¤=\ua7cbРєвЂ™Т‘РєРѓР€РєВ¤Р‹Р·ВµС–Рёв„–В\u2456РёВ¬С•РівЂВ¤fРєСџвЂ“РєвЂ™Т‘РєРѓС—РєВ¤Р‚Р·ВµС”", var10003, var10004, var10005, (var2 | var3) & ~(var2 & var3));
      this.z = new ArrayList<>();
      float var1 = 91.0F;
      this.t = new SearchBox(var1, 19.5F);
      this.t.a(this::a);
      this.u = new ScrollBar(2.0F, 20.0F);
      this.u.b(10.0F);
      this.u.a(pulse.Theme.b);
      this.u.b(pulse.Theme.d);
      var3 = 1882654469;
      var2 = 413106357;
      var10003 = var2 + var3 - 2 * (var2 & var3);
      var3 = 1755875241;
      var2 = var10003;
      this.v = new PanelFadeOverlay((var2 | var3) & (~var2 | ~var3), 5.0F, 7.0F);
   }

   public void a(Notification var1) {
      this.q.add(var1);
      this.r.add(new NotificationCard(var1));
      NotificationStore.a(var1);
      this.i();
   }

   public Notification b(Notification var1) {
      int var2 = this.q.indexOf(var1);
      if (var2 >= 0) {
         this.q.remove(var2);
         this.r.remove(var2);
         NotificationStore.b(var1);
         Notification var3 = null;
         if (this.s == var1) {
            this.s = null;
            if (!this.q.isEmpty()) {
               if (var2 > 0) {
                  int var10002 = (int)888325065675669509L;
                  int var7 = -969296630;
                  int var6 = var10002;
                  var10002 = var6 & ~var7 | ~var6 & var7;
                  var7 = 378877198;
                  var6 = var10002;
                  var7 = var6 & ~var7 | ~var6 & var7;
                  var6 = var2;
                  var3 = this.q.get(var6 + ~var7 + 1);
               } else {
                  int var14 = -1486214791;
                  int var10 = -652687600;
                  int var10001 = (var10 | var14) & ~(var10 & var14);
                  var14 = 2121461353;
                  var10 = var10001;
                  var3 = this.q.get((var10 | var14) & (~var10 | ~var14));
               }
            }
         }

         this.i();
         float var4 = this.G - 10.0F;
         float var5 = this.j();
         if (var5 <= var4) {
            this.u.e();
         } else {
            this.u.b(var5, var4);
         }

         return var3;
      } else {
         return null;
      }
   }

   public List<Notification> a() {
      return this.q;
   }

   public Notification b() {
      return this.s;
   }

   public void c(Notification var1) {
      this.s = var1;

      for (NotificationCard var3 : this.r) {
         int var13;
         if (var3.a() == var1) {
            var13 = (int)-2789076845661312250L;
            int var5 = 1154380121;
            int var4 = var13;
            var13 = (var4 | var5) & ~(var4 & var5);
            var5 = -1747363234;
            var4 = var13;
            var13 = var4 + var5 - 2 * (var4 & var5);
         } else {
            int var10 = -183687446;
            int var7 = -702067221;
            var13 = var7 & ~var10 | ~var7 & var10;
            var10 = 589982465;
            var7 = var13;
            var13 = (var7 | var10) & (~var7 | ~var10);
         }

         var3.a(pulse.Bool.from(var13));
      }
   }

   public Notification c() {
      if (this.q.isEmpty()) {
         return null;
      }

      int var10001 = (int)-8244171852234444150L;
      int var2 = -167910747;
      int var1 = var10001;
      var10001 = var1 & ~var2 | ~var1 & var2;
      var2 = -1246277585;
      var1 = var10001;
      return this.q.get((var1 | var2) - (var1 & var2));
   }

   public Notification d() {
      return this.s != null && this.q.contains(this.s) ? this.s : this.c();
   }

   public void a(Consumer<Notification> var1) {
      this.A = var1;
   }

   public void b(Consumer<Notification> var1) {
      this.B = var1;
   }

   private void a(String var1) {
      this.y = var1.toLowerCase().trim();
      this.i();
      this.u.e();
   }

   public void e() {
      List<Notification> var1 = NotificationStore.a();

      for (Notification var3 : var1) {
         int var8 = -1543189674;
         int var7 = -1278869147;
         int var10000 = (var7 | var8) & (~var7 | ~var8);
         var8 = 398641715;
         var7 = var10000;
         int var4 = (var7 | var8) - (var7 & var8);

         for (Notification var6 : this.q) {
            if (var6 == var3) {
               var10000 = (int)-8703055870153200615L;
               var8 = -1589200791;
               var7 = var10000;
               var10000 = var7 + var8 - 2 * (var7 & var8);
               var8 = 1583699057;
               var7 = var10000;
               var4 = var7 + var8 - 2 * (var7 & var8);
               break;
            }
         }

         if (var4 == 0) {
            this.q.add(var3);
            this.r.add(new NotificationCard(var3));
         }
      }

      this.q.removeIf(var2 -> {
         boolean var3x = var1.contains(var2);
         if (!var3x) {
            this.r.removeIf(var1xx -> {
               int var11xx;
               if (var1xx.a() == var2) {
                  var11xx = (int)-8806780227691038699L;
                  int var3xx = 2056530505;
                  int var2x = var11xx;
                  var11xx = var2x + var3xx - 2 * (var2x & var3xx);
                  var3xx = 1797165661;
                  var2x = var11xx;
                  var11xx = (var2x | var3xx) - (var2x & var3xx);
               } else {
                  int var8xx = 352404093;
                  int var5x = -1545721004;
                  var11xx = (var5x | var8xx) - (var5x & var8xx);
                  var8xx = -1226872535;
                  var5x = var11xx;
                  var11xx = (var5x | var8xx) & ~(var5x & var8xx);
               }

               return pulse.Bool.from(var11xx);
            });
            if (this.s == var2) {
               this.s = null;
            }
         }

         int var12x;
         if (!var3x) {
            int var5 = 228364804;
            int var4x = 236143657;
            var12x = var4x + var5 - 2 * (var4x & var5);
            var5 = 59758124;
            var4x = var12x;
            var12x = var4x & ~var5 | ~var4x & var5;
         } else {
            int var10 = -822857112;
            int var7x = 1579143010;
            var12x = (var7x | var10) & ~(var7x & var10);
            var10 = -1863582454;
            var7x = var12x;
            var12x = (var7x | var10) & (~var7x | ~var10);
         }

         return pulse.Bool.from(var12x);
      });
      this.i();
      if (this.s != null) {
         int var22 = -613430509;
         int var15 = -1578992853;
         int var28 = (var15 | var22) & ~(var15 & var22);
         var22 = 2056106040;
         var15 = var28;
         int var9 = (var15 | var22) & ~(var15 & var22);

         for (NotificationCard var11 : this.z) {
            if (var11.a() == this.s) {
               var28 = (int)2584582560152364932L;
               var22 = 454202352;
               var15 = var28;
               var28 = var15 + var22 - 2 * (var15 & var22);
               var22 = 362787957;
               var15 = var28;
               var9 = (var15 | var22) - (var15 & var22);
               break;
            }
         }

         if (var9 == 0) {
            this.s = null;
            if (this.A != null) {
               this.A.accept(null);
            }
         }
      }
   }

   private void i() {
      List<NotificationCard> var1;
      if (this.y.isEmpty()) {
         var1 = new ArrayList<>(this.r);
      } else {
         var1 = this.r.stream().filter(var1x -> var1x.a().a().toLowerCase().contains(this.y)).collect(Collectors.toList());
      }

      var1 = var1.stream().filter(var1x -> this.d(var1x.a())).collect(Collectors.toList());
      var1.sort((var0, var1x) -> {
         boolean var2x = var0.a().j();
         boolean var3 = var1x.a().j();
         if (var2x != var3) {
            int var13;
            if (var2x) {
               var13 = (int)-8338754966119914249L;
               int var5 = 1374863885;
               int var4 = var13;
               var13 = (var4 | var5) & (~var4 | ~var5);
               var5 = 1500043525;
               var4 = var13;
               var13 = (var4 | var5) - (var4 & var5);
            } else {
               var13 = (int)3024726556973356997L;
               int var10 = -1514824928;
               int var7 = var13;
               var13 = (var7 | var10) - (var7 & var10);
               var10 = -2036085532;
               var7 = var13;
               var13 = (var7 | var10) & (~var7 | ~var10);
            }

            return var13;
         } else {
            return Long.compare(var0.a().k(), var1x.a().k());
         }
      });
      this.z = var1;
   }

   private boolean d(Notification var1) {
      if (!var1.j()) {
         int var77 = -1808908275;
         int var42 = 1140330803;
         int var85 = var42 + var77 - 2 * (var42 & var77);
         var77 = -673820353;
         var42 = var85;
         return pulse.Bool.from((var42 | var77) - (var42 & var77));
      }

      MapMarkerModule var2 = HudServiceRegistry.MAP_MARKER_MODULE;
      if (var2 == null) {
         int var75 = -39782598;
         int var40 = -420678600;
         int var84 = (var40 | var75) & ~(var40 & var75);
         var75 = 457966339;
         var40 = var84;
         return pulse.Bool.from(var40 & (var75 ^ -1) | (var40 ^ -1) & var75);
      }

      int var3 = var2.h();
      String var4 = var2.i();
      MinecraftClient var5 = MinecraftClient.getInstance();
      String var10000;
      if (var5.getCurrentServerEntry() != null) {
         var10000 = var5.getCurrentServerEntry().address.toLowerCase();
      } else {
         int var10002 = (int)2736653734084875974L;
         int var8 = -774272984;
         int var7 = var10002;
         var10002 = (var7 | var8) & (~var7 | ~var8);
         var8 = -1019381426;
         var7 = var10002;
         var10002 = (var7 | var8) - (var7 & var8);
         int var10003 = (int)1275237574388899043L;
         var8 = -1609091381;
         var7 = var10003;
         var10003 = var7 & ~var8 | ~var7 & var8;
         var8 = 1426150025;
         var7 = var10003;
         var10003 = var7 + var8 - 2 * (var7 & var8);
         var8 = 1368476579;
         var7 = -218163500;
         int var10004 = (var7 | var8) & (~var7 | ~var8);
         var8 = -1266374087;
         var7 = var10004;
         var10004 = var7 & ~var8 | ~var7 & var8;
         var8 = 180208078;
         var7 = 1612563329;
         int var10005 = (var7 | var8) & (~var7 | ~var8);
         var8 = 1789206299;
         var7 = var10005;
         var10000 = a("", "`РєСџС–РєвЂњС”РєРѓРЋРєВ¤С’Р·ВµС”Рёв„–в„ўРІвЂС—РёВ­С‘РівЂТ‘~\ua7efРєвЂ™В¶РєРѓС”РєВ¤вЂљР·ВµР€Рёв„–С“\u2435РёВ¬С”РівЂР†|РєСџС–РєвЂњС”РєРѓСРєВ¤вЂћР·ВµВ¤Рёв„–РѓРІвЂС—РёВ¬ТђРівЂВ¤=\ua7cbРєвЂ™Т‘РєРѓР€РєВ¤Р‹Р·ВµС–Рёв„–В\u2456РёВ¬С•РівЂВ¤fРєСџвЂ“РєвЂ™Т‘РєРѓС—РєВ¤Р‚Р·ВµС”", var10002, var10003, var10004, (var7 | var8) & ~(var7 & var8));
      }

      String var6 = var10000;
      int var90 = (int)6442171422114454304L;
      int var51 = 1158833107;
      int var16 = var90;
      var90 = var16 + var51 - 2 * (var16 & var51);
      var51 = -1210540205;
      var16 = var90;
      var90 = (var16 | var51) - (var16 & var51);
      var51 = -566571654;
      var16 = -1269715784;
      int var97 = (var16 | var51) & (~var16 | ~var51);
      var51 = -559096616;
      var16 = var97;
      var97 = (var16 | var51) & (~var16 | ~var51);
      var51 = 963335327;
      var16 = -1616758194;
      int var101 = var16 + var51 - 2 * (var16 & var51);
      var51 = -1109059233;
      var16 = var101;
      var101 = var16 + var51 - 2 * (var16 & var51);
      int var10006 = (int)6242993154608815782L;
      var51 = -387421735;
      var16 = var10006;
      var10006 = var16 + var51 - 2 * (var16 & var51);
      var51 = 1801164466;
      var16 = var10006;
      if (var6.contains(
         a("РЅвЂТђР№в‚¬РЏРЅвЂРЋР№в‚¬в„ўРЅвЂС”Р№в‚¬РЏРЅвЂС—Р№в‚¬РЉРЅвЂВ©", "`РєСџС–РєвЂњС”РєРѓРЋРєВ¤С’Р·ВµС”Рёв„–в„ўРІвЂС—РёВ­С‘РівЂТ‘~\ua7efРєвЂ™В¶РєРѓС”РєВ¤вЂљР·ВµР€Рёв„–С“\u2435РёВ¬С”РівЂР†|РєСџС–РєвЂњС”РєРѓСРєВ¤вЂћР·ВµВ¤Рёв„–РѓРІвЂС—РёВ¬ТђРівЂВ¤=\ua7cbРєвЂ™Т‘РєРѓР€РєВ¤Р‹Р·ВµС–Рёв„–В\u2456РёВ¬С•РівЂВ¤fРєСџвЂ“РєвЂ™Т‘РєРѓС—РєВ¤Р‚Р·ВµС”", var90, var97, var101, var16 + var51 - 2 * (var16 & var51))
      )) {
         if (var1.l() != var3) {
            int var80 = (int)-1101574493223066812L;
            var51 = 1623112031;
            var16 = var80;
            int var81 = (var16 | var51) & ~(var16 & var51);
            var51 = -714057189;
            var16 = var81;
            return pulse.Bool.from((var16 | var51) & (var16 & var51 ^ -1));
         }

         if (var1.m() != null && var4 != null && !var1.m().equals(var4)) {
            var51 = -1301578433;
            var16 = -1634595201;
            int var79 = var16 & ~var51 | ~var16 & var51;
            var51 = 754545472;
            var16 = var79;
            return pulse.Bool.from(var16 & (var51 ^ -1) | (var16 ^ -1) & var51);
         }
      } else {
         var90 = (int)-8789249918664072764L;
         var51 = 53655725;
         var16 = var90;
         var90 = var16 + var51 - 2 * (var16 & var51);
         var51 = 2136211145;
         var16 = var90;
         var90 = (var16 | var51) - (var16 & var51);
         var51 = -1369859634;
         var16 = -103939232;
         var97 = (var16 | var51) - (var16 & var51);
         var51 = -483557701;
         var16 = var97;
         var97 = var16 + var51 - 2 * (var16 & var51);
         var51 = -1450425290;
         var16 = -1404056306;
         var101 = (var16 | var51) - (var16 & var51);
         var51 = 393876319;
         var16 = var101;
         var101 = (var16 | var51) - (var16 & var51);
         var51 = -1976334727;
         var16 = -979363988;
         var10006 = (var16 | var51) - (var16 & var51);
         var51 = 1335122397;
         var16 = var10006;
         if (!var6.contains(
               a(
                  "РЅвЂВ«\ufb0cРЅвЂРЋ\ufb09РЅвЂВ®\ufb10РЅвЂР‡РїВ¬Р‚",
                  "`РєСџС–РєвЂњС”РєРѓРЋРєВ¤С’Р·ВµС”Рёв„–в„ўРІвЂС—РёВ­С‘РівЂТ‘~\ua7efРєвЂ™В¶РєРѓС”РєВ¤вЂљР·ВµР€Рёв„–С“\u2435РёВ¬С”РівЂР†|РєСџС–РєвЂњС”РєРѓСРєВ¤вЂћР·ВµВ¤Рёв„–РѓРІвЂС—РёВ¬ТђРівЂВ¤=\ua7cbРєвЂ™Т‘РєРѓР€РєВ¤Р‹Р·ВµС–Рёв„–В\u2456РёВ¬С•РівЂВ¤fРєСџвЂ“РєвЂ™Т‘РєРѓС—РєВ¤Р‚Р·ВµС”",
                  var90,
                  var97,
                  var101,
                  (var16 | var51) & ~(var16 & var51)
               )
            )
            && var1.l() != var3) {
            var51 = 2010736030;
            var16 = 1864708991;
            int var83 = (var16 | var51) - (var16 & var51);
            var51 = 419190497;
            var16 = var83;
            return pulse.Bool.from((var16 | var51) & (var16 & var51 ^ -1));
         }
      }

      var51 = 855233979;
      var16 = -621728040;
      int var82 = (var16 | var51) & (~var16 | ~var51);
      var51 = -402064542;
      var16 = var82;
      return pulse.Bool.from((var16 | var51) & (var16 ^ -1 | var51 ^ -1));
   }

   public void a(MatrixStack var1, Renderer2D var2, float var3, float var4, float var5, int var6, int var7, float var8) {
   }

   private void a(MatrixStack var1, Renderer2D var2, float var3, float var4, float var5, float var6, float var7) {
      Color var8 = pulse.Theme.b(pulse.Theme.m, var7);
      Color var9 = pulse.Theme.b(pulse.Theme.n, var7);
      var2.a(var3 - 0.5F, var4 - 0.5F, var5 + 1.0F, var6 + 1.0F, 7.5F, var8, var8, var9, var9, var1);
      int var10 = (int)(255.0F * var7);
      Color var11 = pulse.Theme.a(pulse.Theme.e, var10);
      Color var12 = pulse.Theme.a(pulse.Theme.f, var10);
      var2.a(var3, var4, var5, var6, 7.5F, var11, var11, var12, var12, var1);
   }

   private void a(MatrixStack var1, Renderer2D var2, float var3, float var4, float var5, float var6, int var7, int var8, float var9) {
      float var10 = var3 + 5.0F;
      float var11 = var4 + 5.0F;
      float var12 = var5 - 10.0F;
      float var13 = var6 - 10.0F;
      float var14 = this.j();
      int var38;
      if (var14 > var13) {
         var38 = (int)-4831884970614764676L;
         int var21 = 581631034;
         int var20 = var38;
         var38 = (var20 | var21) & (~var20 | ~var21);
         var21 = 408926023;
         var20 = var38;
         var38 = (var20 | var21) & (~var20 | ~var21);
      } else {
         int var31 = 1589650950;
         int var24 = 1413802664;
         var38 = (var24 | var31) - (var24 & var31);
         var31 = 176475310;
         var24 = var38;
         var38 = var24 & ~var31 | ~var24 & var31;
      }

      int var15 = var38;
      if (var15 == 0) {
         this.u.e();
      }

      int var33 = 1652739527;
      int var26 = -1571868243;
      var38 = var26 & ~var33 | ~var26 & var33;
      var33 = -1060242334;
      var26 = var38;
      int var16 = (var26 | var33) & ~(var26 & var33);
      var2.b().a(var3, var4 + var16 / 2.0F, var5, var6 - var16, var1);
      float var17 = var11 - this.u.b();

      for (NotificationCard var19 : this.z) {
         if (var17 + 27.5F >= var11 && var17 <= var11 + var13) {
            var19.a(var1, var2, var10, var17, var12, var7, var8, var9);
         }

         var17 += 32.5F;
      }

      var2.b().a(var1);
      if (var15 != 0) {
         float var22 = var3 + var5 - 2.0F + 1.0F;
         var33 = -1662907326;
         var26 = 314460237;
         int var10010 = (var26 | var33) & ~(var26 & var33);
         var33 = -1906555889;
         var26 = var10010;
         this.u.a(var1, var2, var22, var11, var13, var14, var13, var7, var8, pulse.Bool.from(var26 & (var33 ^ -1) | (var26 ^ -1) & var33));
      }

      this.v.a(var1, var2, var3, var4 + 1.5F, var5, var6, var9);
   }

   private void a(MatrixStack var1, Renderer2D var2, float var3, float var4, int var5, int var6, float var7) {
      int var8 = (int)(255.0F * var7);
      boolean var9 = GuiInput.a(var3, var4, 19.5F, 19.5F, var5, var6);
      if (var9 != this.x) {
         this.w.a(var9 ? 1.0 : 0.0, 0.15, pulse.Easing.h);
         this.x = var9;
      }

      float var10 = (float)this.w.j();
      Color var11 = pulse.Theme.b(pulse.Theme.q, var7);
      Color var12 = pulse.Theme.b(pulse.Theme.n, var7);
      var2.a(var3 - 0.5F, var4 - 0.5F, 20.5F, 20.5F, 6.5F, var11, var11, var12, var12, var1);
      Color var13 = ColorUtils.a(pulse.Theme.f, n, var10);
      Color var14 = ColorUtils.a(pulse.Theme.e, o, var10);
      var13 = pulse.Theme.a(var13, var8);
      var14 = pulse.Theme.a(var14, var8);
      var2.a(var3, var4, 19.5F, 19.5F, 6.5F, var13, var13, var14, var14, var1);
      Color var15 = ColorUtils.a(pulse.Theme.b, p, var10);
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

   private float j() {
      return this.z.isEmpty() ? 0.0F : this.z.size() * 32.5F - 5.0F;
   }

   public boolean a(float var1, float var2, float var3, int var4, int var5) {
      if (this.t.a(var4, var5)) {
         int var48 = (int)-8499257127611285566L;
         int var40 = -652889238;
         int var31 = var48;
         var48 = (var31 | var40) - (var31 & var40);
         var40 = -1089467223;
         var31 = var48;
         return pulse.Bool.from(var31 & (var40 ^ -1) | (var31 ^ -1) & var40);
      }

      float var6 = var2 + 10.0F + 4.0F;
      float var7 = 91.0F;
      float var8 = var1 + var7 + 5.0F;
      if (GuiInput.a(var8, var6 - 3.0F, 19.5F, 19.5F, var4, var5)) {
         this.k();
         int var46 = (int)-1367776396015419881L;
         int var38 = 1474314767;
         int var29 = var46;
         var46 = var29 + var38 - 2 * (var29 & var38);
         var38 = 11959321;
         var29 = var46;
         return pulse.Bool.from((var29 | var38) & (var29 ^ -1 | var38 ^ -1));
      }

      float var9 = var6 + 19.5F + 5.0F;
      float var10 = var3 - (var9 - var2);
      float var11 = var9 + 5.0F;
      float var12 = var10 - 10.0F;
      float var13 = this.j();
      if (var13 > var12) {
         float var14 = var1 + 115.5F - 2.0F + 1.0F;
         float var15 = var11;
         float var16 = var12;
         if (this.u.a(var14, var15, var16, var13, var12, var4, var5)) {
            int var36 = 1362253710;
            int var27 = -1820459351;
            int var45 = var27 + var36 - 2 * (var27 & var36);
            var36 = -1034966746;
            var27 = var45;
            return pulse.Bool.from((var27 | var36) - (var27 & var36));
         }
      }

      float var21 = var1 + 5.0F;
      float var22 = 101.5F;
      if (GuiInput.a(var21, var11, var22, var12, var4, var5)) {
         float var23 = var11 - this.u.b();

         for (NotificationCard var18 : this.z) {
            if (var18.a(var21, var23, var22, var4, var5)) {
               if (var18.c()) {
                  this.c(var18.a());
                  if (this.A != null) {
                     this.A.accept(var18.a());
                  }
               }

               int var10000 = (int)322678035269841230L;
               int var20 = 1007034811;
               int var19 = var10000;
               var10000 = var19 + var20 - 2 * (var19 & var20);
               var20 = -1726852876;
               var19 = var10000;
               return pulse.Bool.from(var19 + var20 - 2 * (var19 & var20));
            }

            var23 += 32.5F;
         }
      }

      int var43 = (int)4478822497167291841L;
      int var34 = -792776091;
      int var25 = var43;
      var43 = (var25 | var34) & (~var25 | ~var34);
      var34 = 51382180;
      var25 = var43;
      return pulse.Bool.from((var25 | var34) - (var25 & var34));
   }

   private void k() {
      MinecraftClient var1 = MinecraftClient.getInstance();
      int var7 = 108920395;
      int var6 = 1802718189;
      int var10000 = (var6 | var7) - (var6 & var7);
      var7 = 1829680550;
      var6 = var10000;
      int var2 = (var6 | var7) & ~(var6 & var7);
      var10000 = (int)4373543056744501062L;
      var7 = 1301131705;
      var6 = var10000;
      var10000 = var6 & ~var7 | ~var6 & var7;
      var7 = -1095991617;
      var6 = var10000;
      int var3 = var6 & ~var7 | ~var6 & var7;
      var7 = 1892176453;
      var6 = -1208383553;
      var10000 = (var6 | var7) - (var6 & var7);
      var7 = -953035270;
      var6 = var10000;
      int var4 = (var6 | var7) & ~(var6 & var7);
      if (var1.player != null) {
         var2 = (int)var1.player.getX();
         var3 = (int)var1.player.getY();
         var4 = (int)var1.player.getZ();
      }

      var7 = -293175541;
      var6 = -687216923;
      int var10004 = var6 + var7 - 2 * (var6 & var7);
      var7 = 1980464718;
      var6 = var10004;
      var10004 = var6 & ~var7 | ~var6 & var7;
      var7 = 171276385;
      var6 = -520576136;
      int var10005 = var6 + var7 - 2 * (var6 & var7);
      var7 = 599144476;
      var6 = var10005;
      var10005 = (var6 | var7) - (var6 & var7);
      int var10006 = (int)-8130387664911656305L;
      var7 = -1380565802;
      var6 = var10006;
      var10006 = var6 & ~var7 | ~var6 & var7;
      var7 = 2009572502;
      var6 = var10006;
      var10006 = (var6 | var7) & ~(var6 & var7);
      int var10007 = (int)3642904548688953332L;
      var7 = -16885814;
      var6 = var10007;
      var10007 = (var6 | var7) & (~var6 | ~var7);
      var7 = 698976057;
      var6 = var10007;
      Notification var5 = new Notification(
         a(
            "РєС—Р€\ue767РєС—РЉ\ue769РєС•В±\ue379РєС—вЂљ\ue76cРєС•С\ue763РєС—Р‹",
            "`РєСџС–РєвЂњС”РєРѓРЋРєВ¤С’Р·ВµС”Рёв„–в„ўРІвЂС—РёВ­С‘РівЂТ‘~\ua7efРєвЂ™В¶РєРѓС”РєВ¤вЂљР·ВµР€Рёв„–С“\u2435РёВ¬С”РівЂР†|РєСџС–РєвЂњС”РєРѓСРєВ¤вЂћР·ВµВ¤Рёв„–РѓРІвЂС—РёВ¬ТђРівЂВ¤=\ua7cbРєвЂ™Т‘РєРѓР€РєВ¤Р‹Р·ВµС–Рёв„–В\u2456РёВ¬С•РівЂВ¤fРєСџвЂ“РєвЂ™Т‘РєРѓС—РєВ¤Р‚Р·ВµС”",
            var10004,
            var10005,
            var10006,
            var6 & ~var7 | ~var6 & var7
         ),
         var2,
         var3,
         var4,
         pulse.Theme.y,
         Notification.Icon.HOME
      );
      this.a(var5);
      this.c(var5);
      if (this.B != null) {
         this.B.accept(var5);
      }

      if (this.A != null) {
         this.A.accept(var5);
      }
   }

   public void a(int var1, int var2) {
      this.u.d();
   }

   public void a(int var1, int var2, double var3, double var5) {
      if (this.u.c()) {
         float var7 = this.G - 10.0F;
         float var8 = this.j();
         this.u.a(var2, var8, var7);
      }
   }

   public void a(float var1, int var2, int var3) {
      float var4 = this.D + 10.0F + 4.0F + 19.5F + 5.0F;
      float var5 = this.E - 38.5F;
      if (GuiInput.a(this.C, var4, 115.5F, var5, var2, var3)) {
         float var6 = var5 - 10.0F;
         float var7 = this.j();
         this.u.a(var1, var7, var6);
      }
   }

   public boolean a(int var1, int var2, int var3) {
      if (this.t.c()) {
         return this.t.a(var1, var2, var3);
      }

      int var10000 = (int)-6835614023379338733L;
      int var5 = -1706215578;
      int var4 = var10000;
      var10000 = (var4 | var5) & ~(var4 & var5);
      var5 = -1333359243;
      var4 = var10000;
      return pulse.Bool.from((var4 | var5) & (var4 & var5 ^ -1));
   }

   public boolean a(char var1, int var2) {
      if (this.t.c()) {
         return this.t.a(var1, var2);
      }

      int var4 = -1456395156;
      int var3 = -1859965857;
      int var10000 = (var3 | var4) & (~var3 | ~var4);
      var4 = 940703795;
      var3 = var10000;
      return pulse.Bool.from((var3 | var4) & (var3 ^ -1 | var4 ^ -1));
   }

   public boolean f() {
      return this.t.c();
   }

   public boolean g() {
      return this.q.isEmpty();
   }

   public static float h() {
      return 38.5F;
   }

   public static String a(String var0, String var1, int var2, int var3, int var4, int var5) {
      char[] var6 = var1.toCharArray();
      char[] var7 = new char[var6.length];
      int var10000 = (int)1734481435943408857L;
      int var18 = 617408975;
      int var17 = var10000;
      var10000 = var17 & ~var18 | ~var17 & var18;
      var18 = 103185692;
      var17 = var10000;
      char[] var220 = new char[var17 & ~var18 | ~var17 & var18];
      var18 = -1725346649;
      var17 = -1552954689;
      int var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 977700376;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -450230723;
      var17 = 842646130;
      int var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -686584707;
      var17 = var10003;
      var220[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var10002 = (int)5664030640724388414L;
      var18 = 137524318;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -914596255;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var10003 = (int)661624711245552958L;
      var18 = -836141946;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1371536835;
      var17 = var10003;
      var220[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var18 = -1893908281;
      var17 = -651863011;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1446517976;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)-3494557100708860981L;
      var18 = -51834201;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 134535914;
      var17 = var10003;
      var220[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var18 = -1532033356;
      var17 = 1841383106;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -915521419;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1973427309;
      var17 = 663549362;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 1378644428;
      var17 = var10003;
      var220[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var10002 = (int)-7736572134036570196L;
      var18 = 77453953;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 1594729769;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var10003 = (int)-7508837095857431325L;
      var18 = -489709156;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 65760346;
      var17 = var10003;
      var220[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var18 = 1525659398;
      var17 = -927642718;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -1839530847;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)7379616444903491381L;
      var18 = -568636618;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 385976705;
      var17 = var10003;
      var220[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var18 = 1262929882;
      var17 = -1662733489;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -677219181;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var10003 = (int)6878041595784424095L;
      var18 = -179063080;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 642045268;
      var17 = var10003;
      var220[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var18 = -712723191;
      var17 = 1039585966;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -395155552;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var10003 = (int)-6974197510804578565L;
      var18 = -820426858;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 1477258575;
      var17 = var10003;
      var220[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var10002 = (int)8547258806293046905L;
      var18 = 624187614;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 2103017135;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)-6682513966261250265L;
      var18 = 1913682044;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 1886988040;
      var17 = var10003;
      var220[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var18 = -585578441;
      var17 = -258739829;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 764098997;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -2117113618;
      var17 = 337865464;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -1779694286;
      var17 = var10003;
      var220[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      char[] var8 = var220;
      var10000 = (int)8666487398024901646L;
      var18 = 928381965;
      var17 = var10000;
      var10000 = var17 + var18 - 2 * (var17 & var18);
      var18 = 788105225;
      var17 = var10000;
      char[] var223 = new char[(var17 | var18) - (var17 & var18)];
      var10002 = (int)2086622515584931767L;
      var18 = -82631227;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -1495879054;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)-4560115022574348790L;
      var18 = -1930374255;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -1535636037;
      var17 = var10003;
      var223[var10002] = (char)((var17 | var18) - (var17 & var18));
      var10002 = (int)-5095784459003573469L;
      var18 = -1197397887;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -981212253;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1470805250;
      var17 = 1999988432;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 547313617;
      var17 = var10003;
      var223[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var18 = 1595399691;
      var17 = -54155494;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -1546487533;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -1169041220;
      var17 = 854905325;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -2002416126;
      var17 = var10003;
      var223[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var18 = -720816321;
      var17 = -1177788572;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 1824876632;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)-3372811664607712470L;
      var18 = 161542343;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 1029940207;
      var17 = var10003;
      var223[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var10002 = (int)-4049245492640728847L;
      var18 = -1482840595;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 89234712;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 1258000187;
      var17 = -619480392;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1847013949;
      var17 = var10003;
      var223[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var18 = -2846404;
      var17 = 2107478312;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -2109145071;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1719167274;
      var17 = 1604865015;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -969939531;
      var17 = var10003;
      var223[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var18 = 461315252;
      var17 = 1425444221;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1334415823;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1397051443;
      var17 = -576666695;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -1897589581;
      var17 = var10003;
      var223[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var18 = -1739158358;
      var17 = 225175003;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -1791137418;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var10003 = (int)-5835770246260326410L;
      var18 = -1103138387;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -421224861;
      var17 = var10003;
      var223[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var18 = 136869615;
      var17 = -710963932;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -575145021;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)3965955764834517887L;
      var18 = -907947271;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -1539403134;
      var17 = var10003;
      var223[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var18 = -1114547348;
      var17 = 620022305;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -1721396924;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)-2801581662010078718L;
      var18 = 106010182;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 1693822839;
      var17 = var10003;
      var223[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      char[] var9 = var223;
      var10000 = (int)-5053347385585509445L;
      var18 = -1114288018;
      var17 = var10000;
      var10000 = (var17 | var18) & (~var17 | ~var18);
      var18 = 638815189;
      var17 = var10000;

      for (int var10 = var17 + var18 - 2 * (var17 & var18); var10 < var6.length; var10++) {
         char var277 = var6[var10];
         char var205 = var8[var10 % var8.length];
         char var106 = var277;
         var7[var10] = (char)(var106 & ~var205 | ~var106 & var205);
      }

      char[] var19 = new char[var7.length];
      var10000 = (int)-9106247778600922707L;
      var18 = -1804360579;
      var17 = var10000;
      var10000 = (var17 | var18) & ~(var17 & var18);
      var18 = -71371312;
      var17 = var10000;

      for (int var11 = var17 & ~var18 | ~var17 & var18; var11 < var6.length; var11++) {
         char var278 = var7[var11];
         char var208 = var9[var11 % var9.length];
         char var109 = var278;
         var19[var11] = (char)(var109 + var208 - 2 * (var109 & var208));
      }

      String var20 = new String(var19);
      int var12 = var20.hashCode();
      var18 = var5;
      var17 = var3;
      var10000 = var17 + ~var18 + 1;
      var18 = var2;
      var17 = var10000;
      int var13 = var17 + ~var18 + 1;
      char[] var14 = var0.toCharArray();
      char[] var15 = new char[var14.length];
      var10000 = (int)-3101867453713526135L;
      var18 = 199208726;
      var17 = var10000;
      var10000 = (var17 | var18) - (var17 & var18);
      var18 = 852557215;
      var17 = var10000;

      for (int var16 = var17 + var18 - 2 * (var17 & var18); var16 < var15.length; var16++) {
         int var10001 = (int)8315218591057222643L;
         var18 = -96255949;
         var17 = var10001;
         var10001 = (var17 | var18) & (~var17 | ~var18);
         var18 = 1475599298;
         var17 = var10001;
         switch (var16 % ((var17 | var18) & ~(var17 & var18))) {
            case 0:
               var18 = var12;
               var17 = var13;
               var10002 = var17 & ~var18 | ~var17 & var18;
               char var218 = var14[var16];
               var17 = var10002;
               var15[var16] = (char)((var17 | var218) - (var17 & var218));
               break;
            case 1:
               var18 = var13;
               var17 = var5;
               var10002 = (var17 | var18) & ~(var17 & var18);
               char var216 = var14[var16];
               var17 = var10002;
               var15[var16] = (char)(var17 + var216 - 2 * (var17 & var216));
         }
      }

      return new String(var15);
   }
}
