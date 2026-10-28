package pulse;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import lombok.Generated;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.util.math.MatrixStack;
import org.lwjgl.glfw.GLFW;

public class ActionNotification extends HudNotification {
   private static final float a = 16.0F;
   private static final float b = 5.0F;
   private static final float m = -9.0F;
   private static final float n = 3.0F;
   private static final float o = 8.0F;
   private static final float p = 15.0F;
   private static final float q = 13.0F;
   private static final float r = 5.0F;
   private final ActionNotification.NotificationType s;
   private final String t;
   private final String u;
   private final String v;
   private final Runnable w;
   private final Color x;
   private final Color y;
   private final Supplier<Boolean> z;
   private final boolean A;
   private List<String> B;
   private boolean C;
   private float D;
   private float E;
   private float F;
   private float G;
   private float H;
   private float I;

   private ActionNotification(ActionNotification.Builder var1) {
      int var3 = -1760287001;
      int var2 = -107150357;
      int var10001 = (var2 | var3) & ~(var2 & var3);
      var3 = 1854481676;
      var2 = var10001;
      this.C = pulse.Bool.from((var2 | var3) & ~(var2 & var3));
      this.s = var1.a;
      this.t = var1.b;
      this.u = var1.c;
      this.v = var1.d;
      this.w = var1.e;
      this.x = var1.f != null ? var1.f : this.s.b();
      this.y = var1.g != null ? var1.g : this.s.c();
      this.z = var1.i;
      this.A = var1.j;
      this.g = 9.5F;
      this.h = 7.0F;
      this.j = var1.h;
      this.r();
   }

   @Override
   public void e() {
      this.d.a();
      this.e.a();
      this.f.a();
      if (!this.A && !this.l && System.currentTimeMillis() - this.k > this.j) {
         this.f();
      }

      if (this.z != null && !this.l) {
         if (!this.z.get()) {
            this.f();
         } else {
            this.k = System.currentTimeMillis();
         }
      }
   }

   public boolean m() {
      int var10;
      if (this.z != null) {
         var10 = (int)-5669377372333834205L;
         int var2 = 753346829;
         int var1 = var10;
         var10 = (var1 | var2) - (var1 & var2);
         var2 = 1686153519;
         var1 = var10;
         var10 = (var1 | var2) - (var1 & var2);
      } else {
         var10 = (int)4212110552964044133L;
         int var7 = -1609254867;
         int var4 = var10;
         var10 = var4 + var7 - 2 * (var4 & var7);
         var7 = -1878250168;
         var4 = var10;
         var10 = (var4 | var7) & ~(var4 & var7);
      }

      return pulse.Bool.from(var10);
   }

   private void r() {
      this.B = new ArrayList<>();
      if (this.u != null && !this.u.isEmpty()) {
         int var18 = -1817168411;
         int var17 = -169839572;
         int var10001 = (var17 | var18) - (var17 & var18);
         var18 = 1716535748;
         var17 = var10001;
         FontRenderer var1 = FontManager.a[(var17 | var18) & ~(var17 & var18)];
         float var2 = this.a() - -9.0F - 16.0F - 5.0F;
         var18 = 1149006773;
         var17 = -1697982981;
         int var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = -964621778;
         var17 = var10003;
         var10003 = (var17 | var18) & ~(var17 & var18);
         int var10004 = (int)-5144796686695343889L;
         var18 = 807646118;
         var17 = var10004;
         var10004 = (var17 | var18) & (~var17 | ~var18);
         var18 = -338952682;
         var17 = var10004;
         var10004 = var17 + var18 - 2 * (var17 & var18);
         int var10005 = (int)-4643532573001174132L;
         var18 = -522073783;
         var17 = var10005;
         var10005 = (var17 | var18) - (var17 & var18);
         var18 = -885475710;
         var17 = var10005;
         var10005 = (var17 | var18) & ~(var17 & var18);
         var18 = 529530709;
         var17 = 1793931048;
         int var10006 = (var17 | var18) & (~var17 | ~var18);
         var18 = 1969846224;
         var17 = var10006;
         String[] var3 = this.u
            .split(a("РёвЂќС‘", "`РєСџС–РєвЂњС”РєРѓРЋРєВ¤С’Р·ВµС”Рёв„–в„ўРІвЂС—РёВ­С‘РівЂС—g\ua7e2РєвЂњС”РєРѓС‘РєВ¤вЂ“Р·ВµС”Рёв„–вЂ№РІвЂТ‘РёВ¬С–РіС’С‘\\\ua7e9РєвЂ™РЋРєРѓС‘РєВ¤С“Р·ВµС—Рёв„–вЂ°РІвЂВ»РёВ¬Р€РівЂС•}\ua7e8РєвЂ™СљРєРѓСћРєВ¤вЂ°Р·ВµВ·Рёв„–вЂћРІвЂС•", var10003, var10004, var10005, var17 & ~var18 | ~var17 & var18));
         String[] var4 = var3;
         int var5 = var4.length;
         var18 = 1702357393;
         var17 = 1494830065;
         int var10000 = (var17 | var18) & ~(var17 & var18);
         var18 = 1013883488;
         var17 = var10000;

         for (int var6 = (var17 | var18) & ~(var17 & var18); var6 < var5; var6++) {
            String var7 = var4[var6];
            if (var7.isEmpty()) {
               var10003 = (int)-6927381605109456530L;
               var18 = 853447069;
               var17 = var10003;
               var10003 = var17 & ~var18 | ~var17 & var18;
               var18 = 554245267;
               var17 = var10003;
               var10003 = var17 + var18 - 2 * (var17 & var18);
               var10004 = (int)1753146346728486405L;
               var18 = -918773059;
               var17 = var10004;
               var10004 = (var17 | var18) & ~(var17 & var18);
               var18 = -1321817347;
               var17 = var10004;
               var10004 = var17 & ~var18 | ~var17 & var18;
               var10005 = (int)3975827081321364547L;
               var18 = -709579141;
               var17 = var10005;
               var10005 = (var17 | var18) & (~var17 | ~var18);
               var18 = -1445895891;
               var17 = var10005;
               var10005 = (var17 | var18) & (~var17 | ~var18);
               var10006 = (int)-2747870333659929050L;
               var18 = -384395342;
               var17 = var10006;
               var10006 = (var17 | var18) & (~var17 | ~var18);
               var18 = 1616812295;
               var17 = var10006;
               this.B.add(a("", "`РєСџС–РєвЂњС”РєРѓРЋРєВ¤С’Р·ВµС”Рёв„–в„ўРІвЂС—РёВ­С‘РівЂС—g\ua7e2РєвЂњС”РєРѓС‘РєВ¤вЂ“Р·ВµС”Рёв„–вЂ№РІвЂТ‘РёВ¬С–РіС’С‘\\\ua7e9РєвЂ™РЋРєРѓС‘РєВ¤С“Р·ВµС—Рёв„–вЂ°РІвЂВ»РёВ¬Р€РівЂС•}\ua7e8РєвЂ™СљРєРѓСћРєВ¤вЂ°Р·ВµВ·Рёв„–вЂћРІвЂС•", var10003, var10004, var10005, (var17 | var18) - (var17 & var18)));
            } else {
               var10003 = (int)-2542564028765403220L;
               var18 = -943035140;
               var17 = var10003;
               var10003 = (var17 | var18) & ~(var17 & var18);
               var18 = 2034059056;
               var17 = var10003;
               var10003 = var17 + var18 - 2 * (var17 & var18);
               var18 = -195242435;
               var17 = 824126539;
               var10004 = (var17 | var18) & ~(var17 & var18);
               var18 = -379271811;
               var17 = var10004;
               var10004 = (var17 | var18) & (~var17 | ~var18);
               var18 = -2050315959;
               var17 = 630837388;
               var10005 = (var17 | var18) & ~(var17 & var18);
               var18 = -1294244515;
               var17 = var10005;
               var10005 = (var17 | var18) & ~(var17 & var18);
               var10006 = (int)-6104588758824100674L;
               var18 = -1614898479;
               var17 = var10006;
               var10006 = (var17 | var18) & ~(var17 & var18);
               var18 = -1778602186;
               var17 = var10006;
               String[] var8 = var7.split(
                  a("РёвЂќвЂ™", "`РєСџС–РєвЂњС”РєРѓРЋРєВ¤С’Р·ВµС”Рёв„–в„ўРІвЂС—РёВ­С‘РівЂС—g\ua7e2РєвЂњС”РєРѓС‘РєВ¤вЂ“Р·ВµС”Рёв„–вЂ№РІвЂТ‘РёВ¬С–РіС’С‘\\\ua7e9РєвЂ™РЋРєРѓС‘РєВ¤С“Р·ВµС—Рёв„–вЂ°РІвЂВ»РёВ¬Р€РівЂС•}\ua7e8РєвЂ™СљРєРѓСћРєВ¤вЂ°Р·ВµВ·Рёв„–вЂћРІвЂС•", var10003, var10004, var10005, var17 & ~var18 | ~var17 & var18)
               );
               StringBuilder var9 = new StringBuilder();
               String[] var10 = var8;
               int var11 = var10.length;
               var18 = 1014863992;
               var17 = 1936481389;
               var10000 = (var17 | var18) - (var17 & var18);
               var18 = 1326564373;
               var17 = var10000;

               for (int var12 = (var17 | var18) - (var17 & var18); var12 < var11; var12++) {
                  String var13 = var10[var12];
                  String var110;
                  if (var9.length() == 0) {
                     var110 = var13;
                  } else {
                     String var111 = String.valueOf(var9);
                     String var16 = var13;
                     String var15 = var111;
                     StringBuilder var112 = new StringBuilder().append(var15);
                     var10003 = (int)-4797734306247188101L;
                     var18 = -1878424436;
                     var17 = var10003;
                     var10003 = (var17 | var18) & ~(var17 & var18);
                     var18 = -313505385;
                     var17 = var10003;
                     var10003 = var17 & ~var18 | ~var17 & var18;
                     var18 = 193715366;
                     var17 = 504382323;
                     var10004 = var17 + var18 - 2 * (var17 & var18);
                     var18 = 966743383;
                     var17 = var10004;
                     var10004 = (var17 | var18) & ~(var17 & var18);
                     var18 = 364179278;
                     var17 = -1877370223;
                     var10005 = var17 & ~var18 | ~var17 & var18;
                     var18 = -1800704566;
                     var17 = var10005;
                     var10005 = (var17 | var18) & ~(var17 & var18);
                     var10006 = (int)-4125563274294763853L;
                     var18 = -138966846;
                     var17 = var10006;
                     var10006 = (var17 | var18) - (var17 & var18);
                     var18 = -1627839839;
                     var17 = var10006;
                     var110 = var112.append(
                           a("РёвЂќвЂ™", "`РєСџС–РєвЂњС”РєРѓРЋРєВ¤С’Р·ВµС”Рёв„–в„ўРІвЂС—РёВ­С‘РівЂС—g\ua7e2РєвЂњС”РєРѓС‘РєВ¤вЂ“Р·ВµС”Рёв„–вЂ№РІвЂТ‘РёВ¬С–РіС’С‘\\\ua7e9РєвЂ™РЋРєРѓС‘РєВ¤С“Р·ВµС—Рёв„–вЂ°РІвЂВ»РёВ¬Р€РівЂС•}\ua7e8РєвЂ™СљРєРѓСћРєВ¤вЂ°Р·ВµВ·Рёв„–вЂћРІвЂС•", var10003, var10004, var10005, var17 + var18 - 2 * (var17 & var18))
                        )
                        .append(var16)
                        .toString();
                  }

                  String var14 = var110;
                  if (var1.a(var14) > var2 && var9.length() > 0) {
                     this.B.add(var9.toString());
                     var9 = new StringBuilder(var13);
                  } else {
                     if (var9.length() > 0) {
                        var18 = 590179467;
                        var17 = 1842709753;
                        var10003 = var17 + var18 - 2 * (var17 & var18);
                        var18 = 1456423954;
                        var17 = var10003;
                        var10003 = (var17 | var18) & (~var17 | ~var18);
                        var18 = 575549861;
                        var17 = 213007057;
                        var10004 = (var17 | var18) - (var17 & var18);
                        var18 = 46779539;
                        var17 = var10004;
                        var10004 = (var17 | var18) & ~(var17 & var18);
                        var10005 = (int)-4852285320963559017L;
                        var18 = 1135538850;
                        var17 = var10005;
                        var10005 = (var17 | var18) - (var17 & var18);
                        var18 = -439442473;
                        var17 = var10005;
                        var10005 = (var17 | var18) - (var17 & var18);
                        var10006 = (int)-1527406362387021884L;
                        var18 = -525086961;
                        var17 = var10006;
                        var10006 = (var17 | var18) - (var17 & var18);
                        var18 = 1722991358;
                        var17 = var10006;
                        var9.append(
                           a("РёвЂќвЂ™", "`РєСџС–РєвЂњС”РєРѓРЋРєВ¤С’Р·ВµС”Рёв„–в„ўРІвЂС—РёВ­С‘РівЂС—g\ua7e2РєвЂњС”РєРѓС‘РєВ¤вЂ“Р·ВµС”Рёв„–вЂ№РІвЂТ‘РёВ¬С–РіС’С‘\\\ua7e9РєвЂ™РЋРєРѓС‘РєВ¤С“Р·ВµС—Рёв„–вЂ°РІвЂВ»РёВ¬Р€РівЂС•}\ua7e8РєвЂ™СљРєРѓСћРєВ¤вЂ°Р·ВµВ·Рёв„–вЂћРІвЂС•", var10003, var10004, var10005, (var17 | var18) & ~(var17 & var18))
                        );
                     }

                     var9.append(var13);
                  }
               }

               if (var9.length() > 0) {
                  this.B.add(var9.toString());
               }
            }
         }
      }
   }

   @Override
   public float a() {
      if ((this.u == null || this.u.isEmpty()) && this.v == null) {
         int var3 = 298449163;
         int var2 = 2093400496;
         int var10001 = var2 & ~var3 | ~var2 & var3;
         var3 = 1829714100;
         var2 = var10001;
         FontRenderer var1 = FontManager.b[var2 & ~var3 | ~var2 & var3];
         return 13.0F + var1.a(this.t);
      } else {
         return 147.5F;
      }
   }

   @Override
   public float b() {
      float var1 = 9.0F;
      if (!this.B.isEmpty()) {
         var1 += 3.0F;
         var1 += this.B.size() * 8.0F;
      }

      if (this.v != null) {
         var1 += 20.0F;
      }

      return var1;
   }

   @Override
   public void a(MatrixStack var1, Renderer2D var2, float var3, float var4, float var5, float var6, float var7) {
      this.H = var3 - this.g;
      this.I = var4 - this.h;
      int var27 = 702779595;
      int var26 = 70672801;
      int var10001 = (var26 | var27) & (~var26 | ~var27);
      var27 = 768995685;
      var26 = var10001;
      FontRenderer var8 = FontManager.b[var26 + var27 - 2 * (var26 & var27)];
      var10001 = (int)-7134328583923537306L;
      var27 = -2059269367;
      var26 = var10001;
      var10001 = var26 & ~var27 | ~var26 & var27;
      var27 = 1091592546;
      var26 = var10001;
      FontRenderer var9 = FontManager.a[(var26 | var27) & ~(var26 & var27)];
      var10001 = (int)-7510387646546320700L;
      var27 = 66999364;
      var26 = var10001;
      var10001 = var26 & ~var27 | ~var26 & var27;
      var27 = 702658188;
      var26 = var10001;
      FontRenderer var10 = FontManager.b[(var26 | var27) & (~var26 | ~var27)];
      int var11 = (int)(var7 * 255.0F);
      float var12 = var4;
      float var13 = var3 + -9.0F;
      float var14 = 9.0F;
      float var15 = var12 + var14 / 2.0F - 8.0F;
      Color var16 = new Color(this.x.getRed(), this.x.getGreen(), this.x.getBlue(), var11);
      var27 = -1543774257;
      var26 = -101196501;
      var10001 = (var26 | var27) - (var26 & var27);
      var27 = 1510736619;
      var26 = var10001;
      FontRenderer var17 = FontManager.e[(var26 | var27) - (var26 & var27)];
      var17.a(this.s.a(), var13 + 8.0F, var15 + 4.0F, var16, var1);
      int var10002 = (int)31341232442685613L;
      var27 = 875431654;
      var26 = var10002;
      var10002 = (var26 | var27) - (var26 & var27);
      var27 = 1723842228;
      var26 = var10002;
      var10002 = (var26 | var27) & (~var26 | ~var27);
      var27 = 1941765226;
      var26 = -100863704;
      int var10003 = (var26 | var27) & ~(var26 & var27);
      var27 = -1975513667;
      var26 = var10003;
      var10003 = (var26 | var27) & ~(var26 & var27);
      var27 = 38983632;
      var26 = 199750895;
      int var10004 = var26 & ~var27 | ~var26 & var27;
      var27 = 162866112;
      var26 = var10004;
      Color var18 = new Color(var10002, var10003, var26 & ~var27 | ~var26 & var27, var11);
      float var19 = var13 + 16.0F + 5.0F;
      float var20 = var15 + 8.0F - var14 / 2.0F;
      var8.a(this.t, var19, var20, var18, var1);
      var12 += var14;
      if (!this.B.isEmpty()) {
         var12 += 3.0F;
         var27 = -34222811;
         var26 = 1787872842;
         var10002 = (var26 | var27) & (~var26 | ~var27);
         var27 = -1754985552;
         var26 = var10002;
         var10002 = (var26 | var27) & ~(var26 & var27);
         var10003 = (int)-5425196080726715945L;
         var27 = 1642141634;
         var26 = var10003;
         var10003 = var26 & ~var27 | ~var26 & var27;
         var27 = -225425718;
         var26 = var10003;
         var10003 = (var26 | var27) & (~var26 | ~var27);
         var10004 = (int)5247252687593984482L;
         var27 = -1021338198;
         var26 = var10004;
         var10004 = (var26 | var27) & ~(var26 & var27);
         var27 = 1776241851;
         var26 = var10004;
         Color var21 = new Color(var10002, var10003, var26 & ~var27 | ~var26 & var27, var11);

         for (String var23 : this.B) {
            var9.a(var23, var19, var12, var21, var1);
            var12 += 8.0F;
         }
      }

      if (this.v != null) {
         var12 += 5.0F;
         this.D = var3;
         this.E = var12;
         this.F = var5;
         this.G = 15.0F;
         this.s();
         Color var30;
         if (this.C) {
            var27 = 1146020695;
            var26 = -1322444795;
            var10002 = (var26 | var27) & ~(var26 & var27);
            var27 = -177996883;
            var26 = var10002;
            var10002 = (var26 | var27) - (var26 & var27);
            var10003 = this.y.getRed();
            var10004 = (int)8563848986392879930L;
            var27 = -2074256556;
            var26 = var10004;
            var10004 = (var26 | var27) & (~var26 | ~var27);
            var27 = 743716976;
            var26 = var10004;
            var27 = var26 & ~var27 | ~var26 & var27;
            var26 = var10003;
            var10002 = Math.min(var10002, (var26 | var27) + (var26 & var27));
            var10003 = (int)332460067997397679L;
            var27 = 1597190542;
            var26 = var10003;
            var10003 = (var26 | var27) & ~(var26 & var27);
            var27 = -1043364898;
            var26 = var10003;
            var10003 = var26 & ~var27 | ~var26 & var27;
            var10004 = this.y.getGreen();
            var27 = 1778868063;
            var26 = -1566198615;
            int var10005 = var26 & ~var27 | ~var26 & var27;
            var27 = -928846872;
            var26 = var10005;
            var27 = (var26 | var27) - (var26 & var27);
            var26 = var10004;
            var10003 = Math.min(var10003, (var26 | var27) + (var26 & var27));
            var10004 = (int)-6465301897313806099L;
            var27 = -984175679;
            var26 = var10004;
            var10004 = (var26 | var27) & (~var26 | ~var27);
            var27 = 296039379;
            var26 = var10004;
            var10004 = (var26 | var27) & (~var26 | ~var27);
            var10005 = this.y.getBlue();
            var27 = 1861766006;
            var26 = 1303102539;
            int var10006 = var26 + var27 - 2 * (var26 & var27);
            var27 = 592678691;
            var26 = var10006;
            var27 = var26 + var27 - 2 * (var26 & var27);
            var26 = var10005;
            var30 = new Color(var10002, var10003, Math.min(var10004, var26 - ~var27 - 1), var11);
         } else {
            var30 = new Color(this.y.getRed(), this.y.getGreen(), this.y.getBlue(), var11);
         }

         var2.a(this.D, this.E, this.F, this.G, 13.0F, var30, var1);
         var27 = -1679481631;
         var26 = -809202504;
         var10002 = var26 & ~var27 | ~var26 & var27;
         var27 = 1411492006;
         var26 = var10002;
         var10002 = (var26 | var27) & (~var26 | ~var27);
         var27 = -2045932120;
         var26 = 471006057;
         var10003 = (var26 | var27) & ~(var26 & var27);
         var27 = -1709214146;
         var26 = var10003;
         var10003 = (var26 | var27) & (~var26 | ~var27);
         var10004 = (int)-8313693409571032994L;
         var27 = 1616781337;
         var26 = var10004;
         var10004 = (var26 | var27) & ~(var26 & var27);
         var27 = 794628280;
         var26 = var10004;
         Color var31 = new Color(var10002, var10003, var26 + var27 - 2 * (var26 & var27), var11);
         float var32 = var10.a(this.v);
         float var24 = this.D + (this.F - var32) / 2.0F;
         float var25 = this.E + this.G / 2.0F - 3.5F;
         var10.a(this.v, var24, var25, var31, var1);
      }
   }

   private void s() {
      if (this.v != null && c.currentScreen != null && c.currentScreen instanceof ChatScreen) {
         double var1 = this.t();
         double var3 = this.u();
         int var19;
         if (var1 >= this.D && var1 <= this.D + this.F && var3 >= this.E && var3 <= this.E + this.G) {
            var19 = (int)-3683016805849249216L;
            int var15 = -1687518602;
            int var10 = var19;
            var19 = var10 + var15 - 2 * (var10 & var15);
            var15 = 451233847;
            var10 = var19;
            var19 = (var10 | var15) - (var10 & var15);
         } else {
            int var13 = 1564031449;
            int var8 = 2104963331;
            var19 = var8 + var13 - 2 * (var8 & var13);
            var13 = 541984986;
            var8 = var19;
            var19 = (var8 | var13) - (var8 & var13);
         }

         this.C = pulse.Bool.from(var19);
      } else {
         int var10001 = (int)-7545143323505239684L;
         int var6 = -104663657;
         int var5 = var10001;
         var10001 = var5 + var6 - 2 * (var5 & var6);
         var6 = 2127408363;
         var5 = var10001;
         this.C = pulse.Bool.from((var5 | var6) - (var5 & var6));
      }
   }

   public void n() {
      if (this.v != null && c.currentScreen != null && c.currentScreen instanceof ChatScreen) {
         double var1 = this.t();
         double var3 = this.u();
         int var14;
         if (var1 >= this.D && var1 <= this.D + this.F && var3 >= this.E && var3 <= this.E + this.G) {
            var14 = (int)-8540238225755276733L;
            int var12 = 21827835;
            int var9 = var14;
            var14 = (var9 | var12) & ~(var9 & var12);
            var12 = -236328263;
            var9 = var14;
            var14 = var9 + var12 - 2 * (var9 & var12);
         } else {
            int var7 = -11303609;
            int var6 = -1627359464;
            var14 = var6 & ~var7 | ~var6 & var7;
            var7 = 1616114271;
            var6 = var14;
            var14 = (var6 | var7) - (var6 & var7);
         }

         int var5 = var14;
         if (var5 != 0) {
            GuiInput.g();
         }
      }
   }

   private double t() {
      int var4 = 1833311202;
      int var3 = 181761923;
      int var10000 = (var3 | var4) - (var3 & var4);
      var4 = 1737714784;
      var3 = var10000;
      double[] var1 = new double[(var3 | var4) - (var3 & var4)];
      var4 = 1260514572;
      var3 = -1065287858;
      var10000 = (var3 | var4) & ~(var3 & var4);
      var4 = -1952378301;
      var3 = var10000;
      double[] var2 = new double[(var3 | var4) & ~(var3 & var4)];
      GLFW.glfwGetCursorPos(c.getWindow().getHandle(), var1, var2);
      var4 = -2055519518;
      var3 = -999313760;
      int var10001 = (var3 | var4) & (~var3 | ~var4);
      var4 = 1091890242;
      var3 = var10001;
      return var1[(var3 | var4) & ~(var3 & var4)] / 2.0;
   }

   private double u() {
      int var4 = 1098380046;
      int var3 = 2103247309;
      int var10000 = var3 & ~var4 | ~var3 & var4;
      var4 = 1009447618;
      var3 = var10000;
      double[] var1 = new double[var3 + var4 - 2 * (var3 & var4)];
      var10000 = (int)-1136540110147241422L;
      var4 = 986570913;
      var3 = var10000;
      var10000 = (var3 | var4) & (~var3 | ~var4);
      var4 = -1484957038;
      var3 = var10000;
      double[] var2 = new double[(var3 | var4) - (var3 & var4)];
      GLFW.glfwGetCursorPos(c.getWindow().getHandle(), var1, var2);
      int var10001 = (int)-3163180797500109827L;
      var4 = 174991752;
      var3 = var10001;
      var10001 = (var3 | var4) & (~var3 | ~var4);
      var4 = -423271819;
      var3 = var10001;
      return var2[var3 & ~var4 | ~var3 & var4] / 2.0;
   }

   public boolean a(double var1, double var3, int var5) {
      return false;
   }

   public boolean o() {
      int var9;
      if (this.v != null) {
         int var2 = -815601540;
         int var1 = 793367867;
         var9 = (var1 | var2) & (~var1 | ~var2);
         var2 = -534037178;
         var1 = var9;
         var9 = (var1 | var2) & (~var1 | ~var2);
      } else {
         var9 = (int)718422968470287863L;
         int var7 = -1727670868;
         int var4 = var9;
         var9 = var4 + var7 - 2 * (var4 & var7);
         var7 = -1289559973;
         var4 = var9;
         var9 = (var4 | var7) - (var4 & var7);
      }

      return pulse.Bool.from(var9);
   }

   public static ActionNotification.Builder a(String var0) {
      return null;
   }

   @Generated
   public String p() {
      return this.t;
   }

   @Generated
   public boolean q() {
      return this.A;
   }

   public static String a(String var0, String var1, int var2, int var3, int var4, int var5) {
      char[] var6 = var1.toCharArray();
      char[] var7 = new char[var6.length];
      int var18 = 2106830871;
      int var17 = -603082864;
      int var10000 = (var17 | var18) - (var17 & var18);
      var18 = -1583472755;
      var17 = var10000;
      char[] var219 = new char[(var17 | var18) & (~var17 | ~var18)];
      var18 = -5140396;
      var17 = 1229741489;
      int var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1224880667;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      int var10003 = (int)4313423498919271409L;
      var18 = 18567374;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -1677933811;
      var17 = var10003;
      var219[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var10002 = (int)-1313636422639617594L;
      var18 = 1579813018;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 1856434525;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 993686498;
      var17 = -95328012;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -1049937773;
      var17 = var10003;
      var219[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var18 = -1551223394;
      var17 = -1650915354;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1041445498;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)949431486010869032L;
      var18 = 182161785;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -186353705;
      var17 = var10003;
      var219[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var10002 = (int)5535189178980706692L;
      var18 = 376377114;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 1607739037;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -1942402619;
      var17 = 569286913;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -1378389801;
      var17 = var10003;
      var219[var10002] = (char)((var17 | var18) - (var17 & var18));
      var18 = -2089047182;
      var17 = -2076625367;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 121806175;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var10003 = (int)-2832601074553669290L;
      var18 = 1870542969;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -139980790;
      var17 = var10003;
      var219[var10002] = (char)((var17 | var18) - (var17 & var18));
      var18 = -1006685413;
      var17 = -108006921;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 980468457;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)-4669268894402268221L;
      var18 = 1257651134;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -1498853889;
      var17 = var10003;
      var219[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var18 = -866504452;
      var17 = -1187131439;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1969749803;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -1573776;
      var17 = -91193046;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 91714633;
      var17 = var10003;
      var219[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var10002 = (int)5236851270703600973L;
      var18 = -966829190;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -712503760;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)-8365828489797572570L;
      var18 = 971563362;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 1009597798;
      var17 = var10003;
      var219[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var10002 = (int)5777021091881390396L;
      var18 = -1866834404;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -1455567064;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)-6625143713960226946L;
      var18 = -851722565;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 172407190;
      var17 = var10003;
      var219[var10002] = (char)((var17 | var18) - (var17 & var18));
      var18 = -1047816500;
      var17 = 183286791;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -882431294;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -895868080;
      var17 = -654772457;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 308466531;
      var17 = var10003;
      var219[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      char[] var8 = var219;
      var18 = -1402240932;
      var17 = -2103336262;
      var10000 = (var17 | var18) & (~var17 | ~var18);
      var18 = 784999148;
      var17 = var10000;
      char[] var221 = new char[(var17 | var18) & ~(var17 & var18)];
      var18 = -1043991133;
      var17 = 22271644;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1063902401;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 150491154;
      var17 = -840670283;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -987989113;
      var17 = var10003;
      var221[var10002] = (char)((var17 | var18) - (var17 & var18));
      var10002 = (int)217618491204117990L;
      var18 = 645248306;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 1186107605;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)8473845981276966285L;
      var18 = -368514379;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -513088709;
      var17 = var10003;
      var221[var10002] = (char)((var17 | var18) - (var17 & var18));
      var10002 = (int)-8434138778151530681L;
      var18 = -1713042213;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 67847070;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)2485017129183352631L;
      var18 = -1374765988;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 62008376;
      var17 = var10003;
      var221[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var18 = 2124218934;
      var17 = -288604035;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1873722808;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)5486914019356287269L;
      var18 = -1164198492;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 1984701571;
      var17 = var10003;
      var221[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var18 = -41923328;
      var17 = -1610857650;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1652297290;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1727457849;
      var17 = -1936376858;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -362550881;
      var17 = var10003;
      var221[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var18 = 1283794793;
      var17 = -1036462275;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1900154799;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var10003 = (int)-7493322882153983180L;
      var18 = -1057965825;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -48802977;
      var17 = var10003;
      var221[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var18 = 962360392;
      var17 = 516721899;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 663812261;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -1295135712;
      var17 = 1085093122;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -228557285;
      var17 = var10003;
      var221[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var10002 = (int)-6378343955260697105L;
      var18 = -1419841611;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -667682211;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)1615811783605803125L;
      var18 = -2012897216;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 296970253;
      var17 = var10003;
      var221[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var18 = 1530317392;
      var17 = -1801557490;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -811032490;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)-8274523326970460116L;
      var18 = -1557632378;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 2031542702;
      var17 = var10003;
      var221[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var18 = -1550491871;
      var17 = 1905696994;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -771489846;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -410860353;
      var17 = -1839906133;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 1977070887;
      var17 = var10003;
      var221[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      char[] var9 = var221;
      var10000 = (int)6682324753072616712L;
      var18 = 300519530;
      var17 = var10000;
      var10000 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1297671522;
      var17 = var10000;

      for (int var10 = var17 + var18 - 2 * (var17 & var18); var10 < var6.length; var10++) {
         char var273 = var6[var10];
         char var205 = var8[var10 % var8.length];
         char var106 = var273;
         var7[var10] = (char)(var106 & ~var205 | ~var106 & var205);
      }

      char[] var19 = new char[var7.length];
      var18 = 1070957765;
      var17 = 168298590;
      var10000 = var17 & ~var18 | ~var17 & var18;
      var18 = 903711899;
      var17 = var10000;

      for (int var11 = var17 + var18 - 2 * (var17 & var18); var11 < var6.length; var11++) {
         char var274 = var7[var11];
         char var208 = var9[var11 % var9.length];
         char var109 = var274;
         var19[var11] = (char)((var109 | var208) & (~var109 | ~var208));
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
      var18 = 1770367628;
      var17 = -540932806;
      var10000 = (var17 | var18) & ~(var17 & var18);
      var18 = -1236815946;
      var17 = var10000;

      for (int var16 = (var17 | var18) - (var17 & var18); var16 < var15.length; var16++) {
         var18 = 708528794;
         var17 = 1867203563;
         int var10001 = (var17 | var18) - (var17 & var18);
         var18 = 1164970355;
         var17 = var10001;
         switch (var16 % ((var17 | var18) - (var17 & var18))) {
            case 0:
               var18 = var12;
               var17 = var13;
               var10002 = var17 & ~var18 | ~var17 & var18;
               char var218 = var14[var16];
               var17 = var10002;
               var15[var16] = (char)(var17 + var218 - 2 * (var17 & var218));
               break;
            case 1:
               var18 = var13;
               var17 = var5;
               var10002 = (var17 | var18) - (var17 & var18);
               char var216 = var14[var16];
               var17 = var10002;
               var15[var16] = (char)((var17 | var216) & ~(var17 & var216));
         }
      }

      return new String(var15);
   }

   public static class Builder {
      private ActionNotification.NotificationType a;
      private final String b;
      private String c;
      private String d;
      private Runnable e;
      private Color f;
      private Color g;
      private long h;
      private Supplier<Boolean> i;
      private boolean j;

      public Builder(String var1) {
         this.a = ActionNotification.NotificationType.BELL;
         this.h = 5000L;
         int var10001 = (int)-6199052591254703018L;
         int var3 = 451274813;
         int var2 = var10001;
         var10001 = (var2 | var3) - (var2 & var3);
         var3 = 950639723;
         var2 = var10001;
         this.j = pulse.Bool.from((var2 | var3) & (~var2 | ~var3));
         this.b = var1;
      }

      public ActionNotification.Builder a(ActionNotification.NotificationType var1) {
         this.a = var1;
         return this;
      }

      public ActionNotification.Builder a(String var1) {
         this.c = var1;
         return this;
      }

      public ActionNotification.Builder a(String var1, Runnable var2) {
         this.d = var1;
         this.e = var2;
         return this;
      }

      public ActionNotification.Builder a(Color var1) {
         this.f = var1;
         return this;
      }

      public ActionNotification.Builder b(Color var1) {
         this.g = var1;
         return this;
      }

      public ActionNotification.Builder a(long var1) {
         this.h = var1;
         return this;
      }

      public ActionNotification.Builder a(Supplier<Boolean> var1) {
         this.i = var1;
         return this;
      }

      public ActionNotification.Builder a() {
         int var10001 = (int)-3506638654822268650L;
         int var2 = 1987852705;
         int var1 = var10001;
         var10001 = (var1 | var2) & ~(var1 & var2);
         var2 = -1713997642;
         var1 = var10001;
         this.j = pulse.Bool.from(var1 + var2 - 2 * (var1 & var2));
         return this;
      }

      public ActionNotification b() {
         return null;
      }

      public static String a(String var0, String var1, int var2, int var3, int var4, int var5) {
         char[] var6 = var1.toCharArray();
         char[] var7 = new char[var6.length];
         int var10000 = (int)-4058684588861877684L;
         int var18 = -1023478496;
         int var17 = var10000;
         var10000 = var17 & ~var18 | ~var17 & var18;
         var18 = 192407398;
         var17 = var10000;
         char[] var220 = new char[(var17 | var18) & (~var17 | ~var18)];
         var18 = -1676995450;
         var17 = 1656673982;
         int var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = -21642696;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         int var10003 = (int)-7502745689819694532L;
         var18 = 542596384;
         var17 = var10003;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = -27054290;
         var17 = var10003;
         var220[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var10002 = (int)8008666024234558967L;
         var18 = 1100081775;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = 2058112921;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var10003 = (int)-8474910410419590280L;
         var18 = -1784657110;
         var17 = var10003;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = -1374796841;
         var17 = var10003;
         var220[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         var18 = 217395102;
         var17 = -1168210185;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = -1230263957;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = -255094484;
         var17 = -1592417753;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = 1373507725;
         var17 = var10003;
         var220[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var18 = -909407457;
         var17 = 1811298077;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = -1573012479;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = -183570026;
         var17 = 742060239;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = -650864310;
         var17 = var10003;
         var220[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var10002 = (int)6348227439761707017L;
         var18 = -2046342244;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = 1516575633;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = 1646667545;
         var17 = 1739896989;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = 93458081;
         var17 = var10003;
         var220[var10002] = (char)((var17 | var18) - (var17 & var18));
         var18 = -1621667717;
         var17 = 232206345;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = -1837080457;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = -114009748;
         var17 = -300525868;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = 388123194;
         var17 = var10003;
         var220[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         var10002 = (int)5520332038512142075L;
         var18 = 556949280;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = -1802815011;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = 1391367143;
         var17 = -1215340675;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = -446577271;
         var17 = var10003;
         var220[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var18 = 1160967964;
         var17 = -955766500;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = -2110071289;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var10003 = (int)5337104594980636913L;
         var18 = -1909049013;
         var17 = var10003;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = -1764031080;
         var17 = var10003;
         var220[var10002] = (char)((var17 | var18) - (var17 & var18));
         var10002 = (int)4998706080168742196L;
         var18 = 533020095;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = 181284995;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var10003 = (int)1723186479852140396L;
         var18 = 804510755;
         var17 = var10003;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = 312763164;
         var17 = var10003;
         var220[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         var10002 = (int)7402392318133681567L;
         var18 = -2131086114;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = -2104882872;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var10003 = (int)-4436912283788616270L;
         var18 = 1779916712;
         var17 = var10003;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = 1260455230;
         var17 = var10003;
         var220[var10002] = (char)((var17 | var18) & ~(var17 & var18));
         char[] var8 = var220;
         var18 = 1150518122;
         var17 = 166804767;
         var10000 = var17 + var18 - 2 * (var17 & var18);
         var18 = 1298316927;
         var17 = var10000;
         char[] var222 = new char[(var17 | var18) - (var17 & var18)];
         var18 = 563887936;
         var17 = -1380508426;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = -1943329866;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var10003 = (int)710952407352410835L;
         var18 = 691306003;
         var17 = var10003;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = -1253624608;
         var17 = var10003;
         var222[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var18 = -1861278965;
         var17 = 868487150;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = -1563743004;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var10003 = (int)7951151564235063502L;
         var18 = 565705885;
         var17 = var10003;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = 1546827856;
         var17 = var10003;
         var222[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var18 = -1604729332;
         var17 = -1244780750;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = 362275132;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = -983027181;
         var17 = 1827999857;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = -1449286351;
         var17 = var10003;
         var222[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var18 = -1289342210;
         var17 = -1067140102;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = 1933740295;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var10003 = (int)8153357167907673828L;
         var18 = -1993177912;
         var17 = var10003;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = -784913874;
         var17 = var10003;
         var222[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var18 = 1424816928;
         var17 = 1798443865;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = 1071573117;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = -1077107703;
         var17 = -314946044;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = 1391907405;
         var17 = var10003;
         var222[var10002] = (char)((var17 | var18) & ~(var17 & var18));
         var10002 = (int)-649832113711317158L;
         var18 = 1337779675;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = -47932796;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var10003 = (int)6156484816450423845L;
         var18 = 2058954050;
         var17 = var10003;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = 254022131;
         var17 = var10003;
         var222[var10002] = (char)((var17 | var18) - (var17 & var18));
         var10002 = (int)883932191298872556L;
         var18 = 848981708;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = 964463142;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = -698585233;
         var17 = -1088435159;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = 1766007935;
         var17 = var10003;
         var222[var10002] = (char)((var17 | var18) & ~(var17 & var18));
         var18 = 1584048201;
         var17 = -1832803293;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = -861205395;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = -176111574;
         var17 = -834180263;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = 1002945355;
         var17 = var10003;
         var222[var10002] = (char)((var17 | var18) & ~(var17 & var18));
         var18 = 1755615209;
         var17 = -1793001745;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = -41649906;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var10003 = (int)3922246695228750073L;
         var18 = 668820623;
         var17 = var10003;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = -1185751182;
         var17 = var10003;
         var222[var10002] = (char)((var17 | var18) - (var17 & var18));
         var18 = -121483027;
         var17 = -1319984244;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = 1234236264;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = 131987317;
         var17 = 257565743;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = 143122537;
         var17 = var10003;
         var222[var10002] = (char)((var17 | var18) & ~(var17 & var18));
         char[] var9 = var222;
         var18 = -119909178;
         var17 = 945211553;
         var10000 = (var17 | var18) & ~(var17 & var18);
         var18 = -1064526745;
         var17 = var10000;

         for (int var10 = var17 + var18 - 2 * (var17 & var18); var10 < var6.length; var10++) {
            char var276 = var6[var10];
            char var205 = var8[var10 % var8.length];
            char var106 = var276;
            var7[var10] = (char)((var106 | var205) - (var106 & var205));
         }

         char[] var19 = new char[var7.length];
         var10000 = (int)-4156405837316163028L;
         var18 = 742556165;
         var17 = var10000;
         var10000 = var17 & ~var18 | ~var17 & var18;
         var18 = -1339394007;
         var17 = var10000;

         for (int var11 = var17 + var18 - 2 * (var17 & var18); var11 < var6.length; var11++) {
            char var277 = var7[var11];
            char var208 = var9[var11 % var9.length];
            char var109 = var277;
            var19[var11] = (char)((var109 | var208) & (~var109 | ~var208));
         }

         String var20 = new String(var19);
         int var12 = var20.hashCode();
         var18 = var5;
         var17 = var3;
         var10000 = 2 * (var17 & ~var18) - (var17 ^ var18);
         var18 = var2;
         var17 = var10000;
         int var13 = (var17 ^ var18) - 2 * (~var17 & var18);
         char[] var14 = var0.toCharArray();
         char[] var15 = new char[var14.length];
         var10000 = (int)5618690425118588738L;
         var18 = -703727153;
         var17 = var10000;
         var10000 = (var17 | var18) & (~var17 | ~var18);
         var18 = -99023219;
         var17 = var10000;

         for (int var16 = (var17 | var18) - (var17 & var18); var16 < var15.length; var16++) {
            int var10001 = (int)-7189154228163694L;
            var18 = 1959363271;
            var17 = var10001;
            var10001 = var17 + var18 - 2 * (var17 & var18);
            var18 = -482924201;
            var17 = var10001;
            switch (var16 % (var17 & ~var18 | ~var17 & var18)) {
               case 0:
                  var18 = var12;
                  var17 = var13;
                  var10002 = (var17 | var18) & (~var17 | ~var18);
                  char var218 = var14[var16];
                  var17 = var10002;
                  var15[var16] = (char)((var17 | var218) - (var17 & var218));
                  break;
               case 1:
                  var18 = var13;
                  var17 = var5;
                  var10002 = var17 & ~var18 | ~var17 & var18;
                  char var216 = var14[var16];
                  var17 = var10002;
                  var15[var16] = (char)((var17 | var216) - (var17 & var216));
            }
         }

         return new String(var15);
      }
   }

   public enum NotificationType {
      BELL("\ue903", new Color(49, 49, 69), new Color(87, 215, 106)),
      WARNING("\ue925", new Color(243, 82, 66), new Color(243, 82, 66)),
      FIRE("\ue90c", new Color(248, 135, 64), new Color(248, 135, 64)),
      CLOUD("\ue904", new Color(100, 72, 227), new Color(100, 72, 227));

      private final String icon;
      private final Color background;
      private final Color accent;

      NotificationType(String icon, Color background, Color accent) {
         this.icon = icon;
         this.background = background;
         this.accent = accent;
      }

      public String a() {
         return this.icon;
      }

      public Color b() {
         return this.background;
      }

      public Color c() {
         return this.accent;
      }

      public static String a(String value, String key, int seed1, int seed2, int seed3, int seed4) {
         return value;
      }
   }
}

