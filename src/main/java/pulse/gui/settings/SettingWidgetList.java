package pulse;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.util.math.MatrixStack;

public class SettingWidgetList {
   private static final float c = 3.0F;
   private static final float d = 5.0F;
   private static final float e = -2.0F;
   private static final float f = 3.0F;
   private static final float g = 1.0F;
   private static final float h = 10.0F;
   private final List<SettingWidget> i = new ArrayList<>();
   private final ScrollBar j;
   private float k = 0.0F;
   private float l;
   private float m;
   private float n;
   private float o;
   private float p;
   private float q;
   public static int a;
   public static boolean b;

   public SettingWidgetList() {
      int var2 = 2035814470;
      int var1 = -885073104;
      int var10005 = var1 & ~var2 | ~var1 & var2;
      var2 = -1301886106;
      var1 = var10005;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var10005 = (int)7364365473781960055L;
      var2 = -27314649;
      var1 = var10005;
      var10005 = (var1 | var2) - (var1 & var2);
      var2 = -1565263020;
      var1 = var10005;
      var10005 = (var1 | var2) - (var1 & var2);
      this.j = new ScrollBar(1.0F, 15.0F);
      String var10001 = "eic";
      this.j.b(10.0F);
   }

   public void a(float var1) {
      this.k = var1;
   }

   public void b(float var1) {
   }

   public void c(float var1) {
   }

   public void a(SettingWidget var1) {
      this.i.add(var1);
   }

   public void b(SettingWidget var1) {
      this.i.remove(var1);
   }

   public void a(int var1, SettingWidget var2) {
      if (var1 < 0) {
         int var10000 = (int)3841270136639281638L;
         int var4 = 214443870;
         int var3 = var10000;
         var10000 = (var3 | var4) & (~var3 | ~var4);
         var4 = 1350270648;
         var3 = var10000;
         var1 = (var3 | var4) & ~(var3 & var4);
      }

      if (var1 > this.i.size()) {
         var1 = this.i.size();
      }

      this.i.add(var1, var2);
   }

   public void a() {
      this.i.clear();
      this.j.e();
   }

   public List<SettingWidget> b() {
      return this.i;
   }

   public float c() {
      if (!this.i.isEmpty()) {
         int var8 = 1375576518;
         int var7 = -932101976;
         int var10001 = (var7 | var8) - (var7 & var8);
         var8 = -1718820498;
         var7 = var10001;
         var10001 = (var7 | var8) & ~(var7 & var8);
         var10001 = (int)-3633721869389241338L;
         var8 = -1810271063;
         var7 = var10001;
         var10001 = (var7 | var8) - (var7 & var8);
         var8 = -563801943;
         var7 = var10001;
         var10001 = (var7 | var8) & (~var7 | ~var8);
         var8 = 467578071;
         var7 = 931998230;
         var10001 = var7 + var8 - 2 * (var7 & var8);
         var8 = 743671505;
         var7 = var10001;
         var10001 = (var7 | var8) - (var7 & var8);
         int var10000 = (int)-7716755814823405600L;
         var8 = 1742038150;
         var7 = var10000;
         var10000 = var7 & ~var8 | ~var7 & var8;
         var8 = -720389189;
         var7 = var10000;
         int var6 = var7 & ~var8 | ~var7 & var8;
         a = var6;
         String var49 = "eid";
         var8 = -1940082596;
         var7 = -789057808;
         var10000 = var7 + var8 - 2 * (var7 & var8);
         var8 = 1415292634;
         var7 = var10000;
         if ((var7 & ~var8 | ~var7 & var8) < a) {
            String var51 = "eie";
            var10000 = (int)-742211485770192480L;
            var8 = -1925946915;
            var7 = var10000;
            var10000 = (var7 | var8) & (~var7 | ~var8);
            var8 = -874516889;
            var7 = var10000;
            var6 = (var7 | var8) - (var7 & var8);
         }

         float var1 = 0.0F;
         var8 = -260192713;
         var7 = 471661721;
         var10000 = (var7 | var8) & ~(var7 & var8);
         var8 = -329172306;
         var7 = var10000;
         int var2 = (var7 | var8) & (~var7 | ~var8);

         for (SettingWidget var4 : this.i) {
            if (var4.d()) {
               float var61 = var4.b();
               int var10002 = (int)-2749408691313962492L;
               var8 = 1152766696;
               var7 = var10002;
               var10002 = (var7 | var8) - (var7 & var8);
               var8 = 1021014202;
               var7 = var10002;
               var10002 = (var7 | var8) - (var7 & var8);
               var1 += var61 + -2.0F;
               var2++;
            }
         }

         if (var2 > 0) {
            var8 = 416090565;
            var7 = 638243982;
            int var64 = var7 & ~var8 | ~var7 & var8;
            var8 = 1053285701;
            var7 = var64;
            var64 = (var7 | var8) & (~var7 | ~var8);
            var64 = (int)-6771023012353010827L;
            var8 = 464832093;
            var7 = var64;
            var64 = (var7 | var8) & ~(var7 & var8);
            var8 = -855583429;
            var7 = var64;
            var64 = (var7 | var8) - (var7 & var8);
            var1 -= -2.0F;
         }

         return var1;
      } else {
         return 0.0F;
      }
   }

   private float f(float var1) {
      String var10001 = "eif";
      float var10000 = var1 - 5.0F;
      int var6 = (int)-2352653502525379302L;
      int var3 = 311980170;
      int var2 = var6;
      int var7 = (var2 | var3) & ~(var2 & var3);
      var3 = 562752937;
      var2 = var7;
      int var8 = ((var2 | var3) & ~(var2 & var3)) * ((var2 | var3) & ~(var2 & var3));
      return var10000 - 3.0F;
   }

   public boolean d(float var1) {
      float var2 = !(this.k > 0.0F) ? var1 : this.k;
      int var12;
      if (!(this.c() > this.f(var2))) {
         var12 = (int)-6229765830975449783L;
         int var4 = 333827895;
         int var3 = var12;
         var12 = (var3 | var4) - (var3 & var4);
         var4 = -785229186;
         var3 = var12;
         var12 = var3 & ~var4 | ~var3 & var4;
      } else {
         int var9 = -1232118854;
         int var6 = -851659136;
         var12 = (var6 | var9) & ~(var6 & var9);
         var9 = 2075389243;
         var6 = var12;
         var12 = var6 + var9 - 2 * (var6 & var9);
      }

      return pulse.Bool.from(var12);
   }

   public boolean d() {
      if (!pulse.ColorPickerPopup.a().c()) {
         for (SettingWidget var2 : this.i) {
            if (var2.d() && var2.l()) {
               int var15 = (int)-8189706993720914433L;
               int var11 = -2016243031;
               int var6 = var15;
               var15 = var6 & ~var11 | ~var6 & var11;
               var11 = -680976553;
               var6 = var15;
               return pulse.Bool.from(var6 + var11 - 2 * (var6 & var11));
            }
         }

         int var13 = 1116225296;
         int var8 = 1749488577;
         int var17 = var8 + var13 - 2 * (var8 & var13);
         var13 = 718220497;
         var8 = var17;
         return pulse.Bool.from((var8 | var13) - (var8 & var13));
      } else {
         int var4 = 222829814;
         int var3 = -762886637;
         int var10000 = (var3 | var4) - (var3 & var4);
         var4 = -540058908;
         var3 = var10000;
         return pulse.Bool.from(var3 + var4 - 2 * (var3 & var4));
      }
   }

   public ModeSettingWidget e() {
      for (SettingWidget var2 : this.i) {
         if (var2.d() && var2 instanceof ModeSettingWidget var3 && var3.m()) {
            return var3;
         }
      }

      return null;
   }

   public ColorSettingWidget f() {
      for (SettingWidget var2 : this.i) {
         if (var2.d()) {
            if (var2 instanceof ColorSettingWidget var3 && var3.h()) {
               return var3;
            }

            int var7 = -152772989;
            int var6 = -237622137;
            int var10000 = (var6 | var7) & ~(var6 & var7);
            var7 = 343535356;
            var6 = var10000;
            var10000 = (var6 | var7) & (~var6 | ~var7);
            var7 = 1777858665;
            var6 = 411999363;
            var10000 = (var6 | var7) & (~var6 | ~var7);
            var7 = 107772006;
            var6 = var10000;
            int var5 = (var6 | var7) - (var6 & var7);
            int var10001 = (int)-4644176001387543211L;
            var7 = 1916501367;
            var6 = var10001;
            var10001 = (var6 | var7) & (~var6 | ~var7);
            var7 = 685619241;
            var6 = var10001;
            var10001 = (var6 | var7) & ~(var6 & var7);
            var10001 = (int)3152409642946623811L;
            var7 = 839587902;
            var6 = var10001;
            var10001 = (var6 | var7) & ~(var6 & var7);
            var7 = 139616633;
            var6 = var10001;
            var10001 = (var6 | var7) & (~var6 | ~var7);
            var7 = 807881880;
            var6 = -1243250189;
            var10000 = (var6 | var7) & (~var6 | ~var7);
            var7 = -1586661649;
            var6 = var10000;
            if (((var6 | var7) & (~var6 | ~var7)) >= var5) {
               String var81 = "eih";
               var7 = 866610841;
               var6 = -836399846;
               var10000 = var6 & ~var7 | ~var6 & var7;
               var7 = 1571867112;
               var6 = var10000;
               var5 = var6 + var7 - 2 * (var6 & var7);
               a = var5;
            }
         } else {
            int var83 = (int)-5032791160215918837L;
            int var56 = -215380856;
            int var23 = var83;
            var83 = var23 & ~var56 | ~var23 & var56;
            var56 = 1702933859;
            var23 = var83;
            var83 = ((var23 | var56) & ~(var23 & var56)) * ((var23 | var56) & ~(var23 & var56));
            var56 = 1593381873;
            var23 = 2132767928;
            var83 = (var23 | var56) & (~var23 | ~var56);
            var56 = 1435853084;
            var23 = var83;
            int var9 = (var23 | var56) & (~var23 | ~var56);
            var83 = (int)-4155988357403552055L;
            var56 = 1899882629;
            var23 = var83;
            var83 = (var23 | var56) & (~var23 | ~var56);
            var56 = 377492413;
            var23 = var83;
            var83 = (var23 | var56) & ~(var23 & var56);
            var83 = (int)-7329811593115770915L;
            var56 = 209735853;
            var23 = var83;
            var83 = (var23 | var56) - (var23 & var56);
            var56 = -237441142;
            var23 = var83;
            if ((var23 | var56) - (var23 & var56) >= var9) {
               var83 = (int)4112395333915355270L;
               var56 = 1191474138;
               var23 = var83;
               var83 = (var23 | var56) & ~(var23 & var56);
               var56 = -889463972;
               var23 = var83;
               var83 = var23 + var56 - 2 * (var23 & var56);
               int var112 = (int)282129981695151222L;
               var56 = 1128810808;
               var23 = var112;
               var112 = (var23 | var56) & ~(var23 & var56);
               var56 = 2015692110;
               var23 = var112;
               var83 /= (var23 | var56) - (var23 & var56);
            }
         }
      }

      String var96 = "eig";
      int var68 = 1815359945;
      int var35 = -1934844065;
      int var97 = var35 & ~var68 | ~var35 & var68;
      var68 = -294642818;
      var35 = var97;
      int var10 = var35 + var68 - 2 * (var35 & var68);
      a = var10;
      var68 = -843708932;
      var35 = 1208644681;
      int var98 = var35 & ~var68 | ~var35 & var68;
      var68 = -2058070220;
      var35 = var98;
      int var99 = ((var35 | var68) - (var35 & var68)) * ((var35 | var68) - (var35 & var68));
      int var100 = (int)-9084255090180192552L;
      var68 = -313238057;
      var35 = var100;
      int var101 = var35 + var68 - 2 * (var35 & var68);
      var68 = -108146240;
      var35 = var101;
      if (((var35 | var68) & ~(var35 & var68)) <= a) {
         int var102 = (int)5304680904681578217L;
         var68 = -1494739901;
         var35 = var102;
         int var103 = (var35 | var68) & ~(var35 & var68);
         var68 = 67809623;
         var35 = var103;
         int var104 = ((var35 | var68) & (~var35 | ~var68)) * ((var35 | var68) & (~var35 | ~var68));
         int var105 = (int)8258058063506577961L;
         var68 = -1973023680;
         var35 = var105;
         int var106 = (var35 | var68) & (~var35 | ~var68);
         var68 = 148046245;
         var35 = var106;
         var10 = var35 & ~var68 | ~var35 & var68;
         a = var10;
      }

      return null;
   }

   public boolean e(float var1) {
      for (SettingWidget var3 : this.i) {
         if (var3.d() && var3 instanceof ModeSettingWidget var4 && var4.o()) {
            float var5 = var4.n();
            if (var5 > var1) {
               int var10000 = (int)5623807374599393729L;
               int var9 = -2068961381;
               int var8 = var10000;
               var10000 = var8 + var9 - 2 * (var8 & var9);
               var9 = 1419130459;
               var8 = var10000;
               return pulse.Bool.from(var8 + var9 - 2 * (var8 & var9));
            }
         }
      }

      if (b) {
         int var31 = (int)5117694313181532528L;
         int var21 = -1440507433;
         int var11 = var31;
         var31 = (var11 | var21) & (~var11 | ~var21);
         var21 = 1711717108;
         var11 = var31;
         var31 = (var11 | var21) - (var11 & var21);
         var21 = 1506941862;
         var11 = -101433753;
         int var10001 = var11 + var21 - 2 * (var11 & var21);
         var21 = -185749081;
         var11 = var10001;
         var21 = var11 + var21 - 2 * (var11 & var21);
         var11 = var31;
         var31 = 2 * (var11 | var21) - (var11 ^ var21);
         var21 = 1665647885;
         var11 = 1348774184;
         var31 = (var11 | var21) & (~var11 | ~var21);
         var21 = -722241300;
         var11 = var31;
         int var7 = (var11 | var21) & (~var11 | ~var21);
         a = var7;
      }

      int var36 = (int)5004505055520199574L;
      int var28 = 1704305751;
      int var18 = var36;
      var36 = var18 + var28 - 2 * (var18 & var28);
      var28 = 1534605249;
      var18 = var36;
      return pulse.Bool.from((var18 | var28) & (var18 ^ -1 | var28 ^ -1));
   }

   public boolean a(int var1, int var2) {
      for (SettingWidget var4 : this.i) {
         if (var4.d() && var4 instanceof ModeSettingWidget var5 && var5.c(var1, var2)) {
            int var10000 = (int)1624127134279401037L;
            int var7 = -1665779756;
            int var6 = var10000;
            var10000 = var6 & ~var7 | ~var6 & var7;
            var7 = -1870804584;
            var6 = var10000;
            return pulse.Bool.from(var6 + var7 - 2 * (var6 & var7));
         }
      }

      if (!pulse.ColorPickerPopup.a().c(var1, var2)) {
         int var16 = 2076194490;
         int var11 = -625736771;
         int var20 = var11 + var16 - 2 * (var11 & var16);
         var16 = -1586219769;
         var11 = var20;
         return pulse.Bool.from((var11 | var16) & (var11 ^ -1 | var16 ^ -1));
      } else {
         int var14 = 1408507050;
         int var9 = 1977860767;
         int var19 = (var9 | var14) & ~(var9 & var14);
         var14 = 639098420;
         var9 = var19;
         return pulse.Bool.from(var9 + var14 - 2 * (var9 & var14));
      }
   }

   public void g() {
      for (SettingWidget var2 : this.i) {
         if (var2 instanceof ModeSettingWidget) {
            ((ModeSettingWidget)var2).p();
         }

         if (var2 instanceof ColorSettingWidget) {
            ((ColorSettingWidget)var2).m();
         }
      }

      pulse.ColorPickerPopup.a().b();
   }

   public boolean b(int var1, int var2) {
      for (SettingWidget var4 : this.i) {
         if (var4.d() && var4 instanceof ModeSettingWidget var5) {
            if (var5.b(var1, var2)) {
               int var56 = (int)2840424515839609004L;
               int var43 = 1393248773;
               int var25 = var56;
               var56 = (var25 | var43) - (var25 & var43);
               var43 = 384107176;
               var25 = var56;
               return pulse.Bool.from(var25 & (var43 ^ -1) | (var25 ^ -1) & var43);
            }

            String var10000 = "eii";
            int var9 = 2087178828;
            int var8 = -1776806228;
            int var47 = var8 & ~var9 | ~var8 & var9;
            var9 = -998526321;
            var8 = var47;
            int var7 = var8 + var9 - 2 * (var8 & var9);
            a = var7;
            int var48 = (int)-8314155061083643372L;
            var9 = -863846457;
            var8 = var48;
            int var49 = var8 & ~var9 | ~var8 & var9;
            var9 = -1316726462;
            var8 = var49;
            int var50 = (var8 | var9) & (~var8 | ~var9);
            int var10001 = (int)-5428859851318854650L;
            var9 = 1793708787;
            var8 = var10001;
            var10001 = (var8 | var9) & (~var8 | ~var9);
            var9 = 391812335;
            var8 = var10001;
            var9 = var8 + var9 - 2 * (var8 & var9);
            var8 = var50;
            int var51 = (var8 | var9) + (var8 & var9);
            int var52 = (int)7566189215208577408L;
            var9 = -1111635550;
            var8 = var52;
            int var53 = var8 + var9 - 2 * (var8 & var9);
            var9 = 237973512;
            var8 = var53;
            if (var8 + var9 - 2 * (var8 & var9) < a) {
               var10001 = (int)-4629627773745208043L;
               var9 = -2015392916;
               var8 = var10001;
               var10001 = var8 & ~var9 | ~var8 & var9;
               var9 = 142470783;
               var8 = var10001;
               var10001 = (var8 | var9) & ~(var8 & var9);
               var9 = -350451724;
               var8 = 1755681599;
               var10001 = (var8 | var9) - (var8 & var9);
               var9 = -2085022520;
               var8 = var10001;
               var10001 = var8 & ~var9 | ~var8 & var9;
               int var54 = (int)4204384125730916664L;
               var9 = 265749300;
               var8 = var54;
               int var55 = (var8 | var9) & ~(var8 & var9);
               var9 = -522202105;
               var8 = var55;
               var7 = var8 + var9 - 2 * (var8 & var9);
               a = var7;
            }
         }
      }

      int var45 = -338435773;
      int var27 = 478220391;
      int var58 = (var27 | var45) & (~var27 | ~var45);
      var45 = -145559260;
      var27 = var58;
      return pulse.Bool.from((var27 | var45) - (var27 & var45));
   }

   public boolean h() {
      return pulse.ColorPickerPopup.a().c();
   }

   public void i() {
      for (SettingWidget var2 : this.i) {
         if (var2 instanceof ColorSettingWidget) {
            ((ColorSettingWidget)var2).m();
         }
      }

      pulse.ColorPickerPopup.a().b();
   }

   public float[] j() {
      return pulse.ColorPickerPopup.a().f();
   }

   public void a(MatrixStack var1, Renderer2D var2, float var3, float var4, float var5, float var6, int var7, int var8, float var9, float var10) {
      if (!this.i.isEmpty()) {
         this.l = var3;
         this.m = var4;
         this.n = var5;
         this.o = var6;
         this.p = var9;
         this.q = var10;
         this.j.a();
         this.j.b(this.c(), this.f(var6));
         int var28 = 878319147;
         int var27 = 821039998;
         int var10000 = (var27 | var28) - (var27 & var28);
         var28 = 1603422309;
         var27 = var10000;
         var10000 = (var27 & ~var28 | ~var27 & var28) * (var27 & ~var28 | ~var27 & var28);
         float var11 = 3.0F * var10;
         var10000 = (int)8569606971117429561L;
         var28 = 1161410810;
         var27 = var10000;
         var10000 = (var27 | var28) & ~(var27 & var28);
         var28 = 754288443;
         var27 = var10000;
         var10000 = ((var27 | var28) & (~var27 | ~var28)) * ((var27 | var28) & (~var27 | ~var28));
         float var12 = 5.0F * var10;
         var28 = 657155406;
         var27 = -826612046;
         var10000 = (var27 | var28) & (~var27 | ~var28);
         var28 = 2123963355;
         var27 = var10000;
         var10000 = (var27 | var28) - (var27 & var28);
         float var13 = -2.0F * var10;
         var28 = 1895383153;
         var27 = -559790793;
         int var10001 = (var27 | var28) & ~(var27 & var28);
         var28 = -1369766577;
         var27 = var10001;
         var10001 = var27 + var28 - 2 * (var27 & var28);
         float var14 = 3.0F * var10;
         float var15 = var6 - var12 - var14;
         float var16 = var4 + var12;
         float var17 = var16 + var15;
         float var18 = var16 - this.j.b() * var10;

         for (SettingWidget var20 : this.i) {
            if (var20.d()) {
               float var21 = var20.b() * var10;
               if (var18 + var21 >= var16 && var18 <= var17) {
                  boolean var22 = this.d();
                  if (var22 && !var20.l()) {
                     var10000 = (int)-5190499805766225380L;
                     var28 = -1790315766;
                     var27 = var10000;
                     var10000 = var27 + var28 - 2 * (var27 & var28);
                     var28 = 1009244647;
                     var27 = var10000;
                     var10000 = (var27 | var28) & (~var27 | ~var28);
                  } else {
                     var10000 = var7;
                  }

                  int var23;
                  label46: {
                     var23 = var10000;
                     if (!var22) {
                        if (a != a) {
                           var28 = -1846117469;
                           var27 = 666752445;
                           var10000 = (var27 | var28) & ~(var27 & var28);
                           var28 = 1533056796;
                           var27 = var10000;
                           var10000 = (var27 | var28) & ~(var27 & var28);
                           var28 = 1751522889;
                           var27 = 1320652209;
                           var10000 = var27 + var28 - 2 * (var27 & var28);
                           var28 = 1765227136;
                           var27 = var10000;
                           int var26 = (var27 | var28) - (var27 & var28);
                           a = var26;
                        }
                     } else if (!var20.l()) {
                        var10000 = (int)2087284270788173663L;
                        var28 = -1562654209;
                        var27 = var10000;
                        var10000 = (var27 | var28) & ~(var27 & var28);
                        var28 = 481480273;
                        var27 = var10000;
                        var10000 = (var27 | var28) - (var27 & var28);
                        break label46;
                     }

                     var10000 = var8;
                  }

                  int var24 = var10000;
                  var20.a(var1, var2, var3 + var11, var18, var5 - var11 * 2.0F, var23, var24, var9, var10);
               }

               var18 += var21 + var13;
            }
         }

         if (this.d(var6)) {
            float var29 = this.c() * var10;
            var10001 = (int)-3510942300922689631L;
            var28 = -736206627;
            var27 = var10001;
            var10001 = var27 & ~var28 | ~var27 & var28;
            var28 = -1052958862;
            var27 = var10001;
            var10001 = (var27 | var28) & (~var27 | ~var28);
            int var10002 = (int)-2655256640309218746L;
            var28 = -1469593322;
            var27 = var10002;
            var10002 = (var27 | var28) & (~var27 | ~var28);
            var28 = 2005661920;
            var27 = var10002;
            var28 = var27 & ~var28 | ~var27 & var28;
            var27 = var10001;
            var10001 = (var27 & ~var28) + (var28 & ~var27) + 2 * (var27 & var28);
            float var30 = var3 - 3.0F + var5 - 1.0F * var10 / 2.0F;
            float var31 = var4 + var12;
            var28 = 1744826476;
            var27 = 259268341;
            var10001 = (var27 | var28) & ~(var27 & var28);
            var28 = 1058375757;
            var27 = var10001;
            var10001 = ((var27 | var28) & (~var27 | ~var28)) * ((var27 | var28) & (~var27 | ~var28));
            float var32 = var15 - 8.0F * var10;
            boolean var33 = this.d();
            int var10005 = (int)-7625549737862643163L;
            var28 = -1609118115;
            var27 = var10005;
            var10005 = (var27 | var28) & (~var27 | ~var28);
            var28 = 1447947372;
            var27 = var10005;
            var10005 = (var27 | var28) & (~var27 | ~var28);
            int var10006 = (int)4258381542767184771L;
            var28 = -1515268165;
            var27 = var10006;
            var10006 = (var27 | var28) & (~var27 | ~var28);
            var28 = 1393022171;
            var27 = var10006;
            var28 = var27 & ~var28 | ~var27 & var28;
            var27 = var10005;
            var10005 = (var27 | var28) + (var27 & var28);
            this.j.a(var1, var2, var30, var31 + 4.0F * var10, var32, var29, var15, var7, var8, var33);
         }
      }
   }

   public void a(MatrixStack var1, Renderer2D var2, int var3, int var4, float var5, float var6) {
      for (SettingWidget var8 : this.i) {
         if (var8.d() && var8.j()) {
            var8.a(var1, var2, this.l, this.m, this.n, this.o, var3, var4, var5, var6);
         }
      }

      pulse.ColorPickerPopup.a().a(var1, var2, var3, var4, var5);
   }

   public boolean a(float var1, float var2, float var3, float var4, int var5, int var6) {
      if (pulse.ColorPickerPopup.a().c() && pulse.ColorPickerPopup.a().a(var5, var6)) {
         int var128 = (int)1956585206339851799L;
         int var115 = 1484261218;
         int var68 = var128;
         var128 = (var68 | var115) & ~(var68 & var115);
         var115 = -1395404428;
         var68 = var128;
         return pulse.Bool.from((var68 | var115) - (var68 & var115));
      }

      boolean var7 = this.d();
      if (!var7) {
         if (b) {
            throw new ExceptionInInitializerError();
         }

         float var18 = this.f(var4);
         float var19 = this.c();
         if (this.d(var4)) {
            int var10002 = (int)-2195109588660785747L;
            int var81 = -12260438;
            int var34 = var10002;
            var10002 = (var34 | var81) & (~var34 | ~var81);
            var81 = 1804928514;
            var34 = var10002;
            var10002 = (var34 | var81) & (~var34 | ~var81);
            var81 = 1575634574;
            var34 = -791081254;
            var10002 = (var34 | var81) - (var34 & var81);
            var81 = -1926018992;
            var34 = var10002;
            var10002 = (var34 | var81) & (~var34 | ~var81);
            float var120 = var1 - 3.0F + var3;
            var81 = -546976552;
            var34 = 878766114;
            var10002 = var34 + var81 - 2 * (var34 & var81);
            var81 = -351984393;
            var34 = var10002;
            var10002 = var34 + var81 - 2 * (var34 & var81);
            var81 = -1043648938;
            var34 = 174916893;
            var10002 = (var34 | var81) & ~(var34 & var81);
            var81 = -878302390;
            var34 = var10002;
            var10002 = (var34 | var81) - (var34 & var81);
            var81 = -863658050;
            var34 = -1257194785;
            var10002 = (var34 | var81) - (var34 & var81);
            var81 = 2039817574;
            var34 = var10002;
            var10002 = var34 + var81 - 2 * (var34 & var81);
            float var10 = var120 - 0.5F;
            String var130 = "eij";
            float var11 = var2 + 5.0F;
            var130 = "eik";
            float var12 = var18 - 8.0F;
            ScrollBar var121 = this.j;
            int var10004 = (int)2916734745669978132L;
            var81 = -1805924369;
            var34 = var10004;
            var10004 = (var34 | var81) & ~(var34 & var81);
            var81 = -1477898254;
            var34 = var10004;
            var10004 = var34 & ~var81 | ~var34 & var81;
            var81 = -1066649286;
            var34 = -1336794459;
            var10004 = (var34 | var81) & ~(var34 & var81);
            var81 = 1883118477;
            var34 = var10004;
            var10004 = (var34 | var81) & (~var34 | ~var81);
            var81 = 1768546467;
            var34 = -2027837194;
            var10004 = (var34 | var81) & ~(var34 & var81);
            var81 = -297252795;
            var34 = var10004;
            var10004 = (var34 | var81) - (var34 & var81);
            if (var121.a(var10, var11 + 4.0F, var12, var19, var18, var5, var6)) {
               int var126 = (int)3405851831310622864L;
               var81 = -1401803824;
               var34 = var126;
               int var127 = var34 & ~var81 | ~var34 & var81;
               var81 = -1097856191;
               var34 = var127;
               return pulse.Bool.from(var34 + var81 - 2 * (var34 & var81));
            }
         }

         int var97 = -929791182;
         int var50 = -1113665853;
         int var144 = var50 + var97 - 2 * (var50 & var97);
         var97 = 1963609588;
         var50 = var144;
         var144 = (var50 | var97) & ~(var50 & var97);
         var97 = -1990974316;
         var50 = -1536298403;
         var144 = (var50 | var97) - (var50 & var97);
         var97 = 758765258;
         var50 = var144;
         var144 = var50 + var97 - 2 * (var50 & var97);
         float var20 = var2 + 5.0F;
         if (GuiInput.a(var1, var20, var3, var18, var5, var6)) {
            var97 = 1937651357;
            var50 = 1627736406;
            int var132 = (var50 | var97) - (var50 & var97);
            var97 = 1264465074;
            var50 = var132;
            var132 = (var50 | var97) - (var50 & var97);
            float var21 = var3 - 6.0F;
            float var22 = var20 - this.j.b();

            for (SettingWidget var14 : this.i) {
               if (var14.d()) {
                  float var15 = var14.b();
                  if (var22 + var15 >= var20 && var22 <= var20 + var18 && var6 >= var20 && var6 <= var20 + var18) {
                     var144 = (int)-263139615886969081L;
                     var97 = -786074496;
                     var50 = var144;
                     var144 = (var50 | var97) & ~(var50 & var97);
                     var97 = 839053166;
                     var50 = var144;
                     var144 = ((var50 | var97) & ~(var50 & var97)) * ((var50 | var97) & ~(var50 & var97));
                     if (var14.a(var1 + 3.0F, var22, var21, var5, var6)) {
                        int var123 = (int)6857701781082967960L;
                        var97 = 1294402355;
                        var50 = var123;
                        var123 = (var50 | var97) - (var50 & var97);
                        var97 = -534475606;
                        var50 = var123;
                        return pulse.Bool.from((var50 | var97) & (var50 ^ -1 | var97 ^ -1));
                     }
                  }

                  var97 = 1004874029;
                  var50 = -267298850;
                  var144 = var50 & ~var97 | ~var50 & var97;
                  var97 = 359193907;
                  var50 = var144;
                  var144 = ((var50 | var97) & (~var50 | ~var97)) * ((var50 | var97) & (~var50 | ~var97));
                  var22 += var15 + -2.0F;
               }
            }

            var97 = -409146831;
            var50 = -1958042374;
            int var125 = var50 & ~var97 | ~var50 & var97;
            var97 = 1825984203;
            var50 = var125;
            return pulse.Bool.from(var50 & (var97 ^ -1) | (var50 ^ -1) & var97);
         } else {
            var97 = -2034505187;
            var50 = -1300238016;
            int var122 = (var50 | var97) - (var50 & var97);
            var97 = 885267293;
            var50 = var122;
            return pulse.Bool.from((var50 | var97) & (var50 & var97 ^ -1));
         }
      } else {
         for (SettingWidget var9 : this.i) {
            if (var9.d() && var9.l()) {
               int var17 = 917270707;
               int var16 = -177509068;
               int var10003 = var16 & ~var17 | ~var16 & var17;
               var17 = -1010360939;
               var16 = var10003;
               var10003 = (var16 | var17) & (~var16 | ~var17);
               var10003 = (int)-8551803718199406772L;
               var17 = -1560421349;
               var16 = var10003;
               var10003 = (var16 | var17) & ~(var16 & var17);
               var17 = 1092735837;
               var16 = var10003;
               var10003 = (var16 | var17) - (var16 & var17);
               var10003 = (int)111595240080169375L;
               var17 = 1690763523;
               var16 = var10003;
               var10003 = (var16 | var17) & ~(var16 & var17);
               var17 = -144877419;
               var16 = var10003;
               var10003 = var16 + var17 - 2 * (var16 & var17);
               float var10001 = var1 + 3.0F;
               var17 = -574249231;
               var16 = 2113611844;
               int var10005 = var16 & ~var17 | ~var16 & var17;
               var17 = -1606512972;
               var16 = var10005;
               var10005 = (var16 | var17) & ~(var16 & var17);
               if (var9.a(var10001, 0.0F, var3 - 6.0F, var5, var6)) {
                  int var10000 = (int)1569279642131387141L;
                  var17 = 870619954;
                  var16 = var10000;
                  var10000 = (var16 | var17) & (~var16 | ~var17);
                  var17 = 362465334;
                  var16 = var10000;
                  return pulse.Bool.from(var16 & (var17 ^ -1) | (var16 ^ -1) & var17);
               }
            }
         }

         this.g();
         int var118 = (int)-7924154588728498068L;
         int var79 = 447522378;
         int var32 = var118;
         var118 = (var32 | var79) - (var32 & var79);
         var79 = -1423782361;
         var32 = var118;
         return pulse.Bool.from(var32 & (var79 ^ -1) | (var32 ^ -1) & var79);
      }
   }

   public boolean b(float var1, float var2, float var3, float var4, int var5, int var6) {
      if (!pulse.ColorPickerPopup.a().c()) {
         boolean var7 = this.d();
         if (!var7) {
            float var19 = this.f(var4);
            int var58 = -1614829377;
            int var30 = 504923370;
            int var90 = var30 + var58 - 2 * (var30 & var58);
            var58 = 1597200086;
            var30 = var90;
            var90 = ((var30 | var58) & ~(var30 & var58)) * ((var30 | var58) & ~(var30 & var58));
            float var20 = var2 + 5.0F;
            if (GuiInput.a(var1, var20, var3, var19, var5, var6)) {
               String var92 = "eim";
               float var10 = var3 - 6.0F;
               float var11 = var20 - this.j.b();

               for (SettingWidget var13 : this.i) {
                  if (var13.d()) {
                     float var14 = var13.b();
                     if (var11 + var14 >= var20 && var11 <= var20 + var19 && var6 >= var20 && var6 <= var20 + var19) {
                        int var94 = (int)3381744819018014514L;
                        var58 = 1761722038;
                        var30 = var94;
                        var94 = (var30 | var58) & ~(var30 & var58);
                        var58 = -1183522986;
                        var30 = var94;
                        var94 = var30 & ~var58 | ~var30 & var58;
                        if (var13.b(var1 + 3.0F, var11, var10, var5, var6)) {
                           var58 = -560039940;
                           var30 = -1391786824;
                           int var88 = (var30 | var58) & (~var30 | ~var58);
                           var58 = 1939174213;
                           var30 = var88;
                           return pulse.Bool.from(var30 + var58 - 2 * (var30 & var58));
                        }

                        if (b) {
                           var58 = 1325102806;
                           var30 = -1585895292;
                           int var84 = var30 & ~var58 | ~var30 & var58;
                           var58 = -1878532350;
                           var30 = var84;
                           var84 = var30 & ~var58 | ~var30 & var58;
                           var58 = -1225266970;
                           var30 = -1879616946;
                           var90 = var30 + var58 - 2 * (var30 & var58);
                           var58 = 331701108;
                           var30 = var90;
                           var58 = (var30 | var58) & (~var30 | ~var58);
                           var30 = var84;
                           var84 = var30 - ~var58 - 1;
                           var58 = 1377751284;
                           var30 = -1021661209;
                           var84 = (var30 | var58) - (var30 & var58);
                           var58 = -72437831;
                           var30 = var84;
                           int var16 = (var30 | var58) - (var30 & var58);
                           a = var16;
                        }
                     }

                     var58 = 1647808516;
                     var30 = 895635020;
                     int var97 = (var30 | var58) & ~(var30 & var58);
                     var58 = 1262704186;
                     var30 = var97;
                     var97 = ((var30 | var58) - (var30 & var58)) * ((var30 | var58) - (var30 & var58));
                     var11 += var14 + -2.0F;
                  }
               }

               var58 = -1937971492;
               var30 = -657167857;
               int var89 = (var30 | var58) - (var30 & var58);
               var58 = 1420332243;
               var30 = var89;
               return pulse.Bool.from(var30 + var58 - 2 * (var30 & var58));
            } else {
               int var82 = (int)-6077068170385881728L;
               var58 = -265330676;
               var30 = var82;
               var82 = (var30 | var58) & (~var30 | ~var58);
               var58 = -1401002612;
               var30 = var82;
               return pulse.Bool.from(var30 & (var58 ^ -1) | (var30 ^ -1) & var58);
            }
         } else {
            for (SettingWidget var9 : this.i) {
               if (var9.d() && var9.l()) {
                  String var10002 = "eil";
                  float var10001 = var1 + 3.0F;
                  int var10004 = (int)3113619853807833554L;
                  int var52 = 1020101707;
                  int var24 = var10004;
                  var10004 = (var24 | var52) & ~(var24 & var52);
                  var52 = 1156346896;
                  var24 = var10004;
                  var10004 = var24 & ~var52 | ~var24 & var52;
                  if (var9.b(var10001, 0.0F, var3 - 6.0F, var5, var6)) {
                     var52 = 1415084603;
                     var24 = 1623715544;
                     int var79 = (var24 | var52) & (~var24 | ~var52);
                     var52 = 882873570;
                     var24 = var79;
                     return pulse.Bool.from((var24 | var52) & (var24 ^ -1 | var52 ^ -1));
                  }
               }
            }

            this.g();
            int var80 = (int)-175209387287407654L;
            int var56 = 1441660979;
            int var28 = var80;
            var80 = var28 & ~var56 | ~var28 & var56;
            var56 = -1064987672;
            var28 = var80;
            return pulse.Bool.from(var28 & (var56 ^ -1) | (var28 ^ -1) & var56);
         }
      } else if (!pulse.ColorPickerPopup.a().c(var5, var6)) {
         pulse.ColorPickerPopup.a().b();
         int var50 = -1904763561;
         int var22 = -1564300237;
         int var78 = var22 & ~var50 | ~var22 & var50;
         var50 = 750072165;
         var22 = var78;
         return pulse.Bool.from(var22 & (var50 ^ -1) | (var22 ^ -1) & var50);
      } else {
         int var10000 = (int)348609887048183887L;
         int var18 = -1925095082;
         int var17 = var10000;
         var10000 = (var17 | var18) - (var17 & var18);
         var18 = -269266664;
         var17 = var10000;
         return pulse.Bool.from((var17 | var18) & (var17 ^ -1 | var18 ^ -1));
      }
   }

   public void c(int var1, int var2) {
      this.j.d();
      pulse.ColorPickerPopup.a().b(var1, var2);

      for (SettingWidget var4 : this.i) {
         if (var4.d()) {
            var4.a(var1, var2);
         }
      }
   }

   public void a(float var1, int var2, int var3, double var4, double var6) {
      if (!this.j.c()) {
         pulse.ColorPickerPopup.a().a(var2, var3, var4, var6);

         for (SettingWidget var11 : this.i) {
            if (var11.d()) {
               var11.a(var2, var3, var4, var6);
            }
         }
      } else {
         float var8 = this.c();
         float var9 = this.f(var1);
         this.j.a(var3, var8, var9);
      }
   }

   public void a(float var1, float var2) {
      if (!this.j.c() && this.d(var2) && !this.d()) {
         float var3 = this.c();
         float var4 = this.f(var2);
         this.j.a(var1, var3, var4);
      }
   }

   public void k() {
      this.j.e();
   }

   public boolean c(float var1, float var2, float var3, float var4, int var5, int var6) {
      return GuiInput.a(var1, var2, var3, var4, var5, var6);
   }

   public boolean a(int var1, int var2, int var3) {
      for (SettingWidget var5 : this.i) {
         if (var5.d()) {
            if (var5.a(var1, var2, var3)) {
               int var47 = -1203072866;
               int var27 = -253932109;
               int var60 = (var27 | var47) - (var27 & var47);
               var47 = 1217912108;
               var27 = var60;
               return pulse.Bool.from(var27 & (var47 ^ -1) | (var27 ^ -1) & var47);
            }

            int var10000 = (int)8048529612865444491L;
            int var9 = -867907156;
            int var8 = var10000;
            var10000 = (var8 | var9) & (~var8 | ~var9);
            var9 = 1501218233;
            var8 = var10000;
            var10000 = (var8 | var9) & ~(var8 & var9);
            var9 = 1565431573;
            var8 = -1936243781;
            int var10001 = var8 & ~var9 | ~var8 & var9;
            var9 = 1235055568;
            var8 = var10001;
            var9 = var8 + var9 - 2 * (var8 & var9);
            var8 = var10000;
            var10000 = (var8 & ~var9) + (var9 & ~var8) + 2 * (var8 & var9);
            var9 = 620387035;
            var8 = 2139267815;
            var10000 = (var8 | var9) - (var8 & var9);
            var9 = 1145267308;
            var8 = var10000;
            int var7 = (var8 | var9) & (~var8 | ~var9);
            var10000 = (int)-7199050983985916354L;
            var9 = 300895163;
            var8 = var10000;
            var10000 = var8 & ~var9 | ~var8 & var9;
            var9 = 1357130690;
            var8 = var10000;
            var10000 = var8 & ~var9 | ~var8 & var9;
            var9 = 378829059;
            var8 = -1317988231;
            var10000 = (var8 | var9) - (var8 & var9);
            var9 = -1316417821;
            var8 = var10000;
            if ((var8 | var9) - (var8 & var9) >= var7) {
               var10001 = (int)-3505723548337634801L;
               var9 = 845349;
               var8 = var10001;
               var10001 = (var8 | var9) & ~(var8 & var9);
               var9 = -997071827;
               var8 = var10001;
               var10001 = var8 + var9 - 2 * (var8 & var9);
               var9 = -995901914;
               var8 = 116555089;
               var10001 = (var8 | var9) & ~(var8 & var9);
               var9 = -1034828955;
               var8 = var10001;
               var10001 = (var8 | var9) - (var8 & var9);
               var9 = -1817920608;
               var8 = 49320942;
               var10000 = (var8 | var9) & ~(var8 & var9);
               var9 = 1088318638;
               var8 = var10000;
               var7 = var8 + var9 - 2 * (var8 & var9);
            }
         }
      }

      int var49 = 720772790;
      int var29 = -149535501;
      int var61 = var29 + var49 - 2 * (var29 & var49);
      var49 = -572499387;
      var29 = var61;
      return pulse.Bool.from(var29 + var49 - 2 * (var29 & var49));
   }

   public boolean a(char var1, int var2) {
      for (SettingWidget var4 : this.i) {
         if (var4.d() && var4.a(var1, var2)) {
            int var6 = -55605522;
            int var5 = -1034776987;
            int var10000 = (var5 | var6) - (var5 & var6);
            var6 = 1056770186;
            var5 = var10000;
            return pulse.Bool.from(var5 + var6 - 2 * (var5 & var6));
         }
      }

      int var11 = -1343319760;
      int var8 = 2146839699;
      int var13 = (var8 | var11) - (var8 & var11);
      var11 = -803684957;
      var8 = var13;
      return pulse.Bool.from(var8 + var11 - 2 * (var8 & var11));
   }

   public boolean l() {
      for (SettingWidget var2 : this.i) {
         if (var2.d() && var2.a_()) {
            int var4 = -1922655844;
            int var3 = -602817501;
            int var10000 = (var3 | var4) - (var3 & var4);
            var4 = 1366762942;
            var3 = var10000;
            return pulse.Bool.from(var3 & (var4 ^ -1) | (var3 ^ -1) & var4);
         }
      }

      int var9 = 1711265560;
      int var6 = -1349778280;
      int var11 = var6 & ~var9 | ~var6 & var9;
      var9 = -898378880;
      var6 = var11;
      return pulse.Bool.from((var6 | var9) - (var6 & var9));
   }

   public float m() {
      float var10000 = this.c();
      int var2 = 45005056;
      int var1 = 617353160;
      int var10002 = (var1 | var2) - (var1 & var2);
      var2 = 644003525;
      var1 = var10002;
      var10002 = var1 + var2 - 2 * (var1 & var2);
      var10002 = (int)4796033073409659758L;
      var2 = -805352207;
      var1 = var10002;
      var10002 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1201348705;
      var1 = var10002;
      var10002 = var1 + var2 - 2 * (var1 & var2);
      var10002 = (int)7073469604645789795L;
      var2 = -347443102;
      var1 = var10002;
      var10002 = (var1 | var2) & ~(var1 & var2);
      var2 = 19206150;
      var1 = var10002;
      var10002 = (var1 | var2) & (~var1 | ~var2);
      var10000 += 5.0F;
      var10002 = (int)7972388606271492272L;
      var2 = 1982663841;
      var1 = var10002;
      var10002 = var1 & ~var2 | ~var1 & var2;
      var2 = -570287086;
      var1 = var10002;
      var10002 = (var1 | var2) & ~(var1 & var2);
      var10002 = (int)1099916243982290816L;
      var2 = 64427915;
      var1 = var10002;
      var10002 = (var1 | var2) & ~(var1 & var2);
      var2 = 250091525;
      var1 = var10002;
      var10002 = (var1 | var2) & ~(var1 & var2);
      var2 = 1902414198;
      var1 = 1729623275;
      var10002 = (var1 | var2) & ~(var1 & var2);
      var2 = 376667536;
      var1 = var10002;
      var10002 = var1 + var2 - 2 * (var1 & var2);
      return var10000 + 3.0F;
   }

   public static String a(String var0, String var1, int var2, int var3, int var4, int var5) {
      char[] var6 = var1.toCharArray();
      char[] var7 = new char[var6.length];
      int var10000 = (int)7016268509992748455L;
      int var20 = -1262985385;
      int var19 = var10000;
      var10000 = var19 + var20 - 2 * (var19 & var20);
      var20 = -1906779398;
      var19 = var10000;
      char[] var297 = new char[(var19 | var20) & ~(var19 & var20)];
      int var10002 = (int)-3692191775402930075L;
      var20 = -1393706762;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = -594483053;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      int var10003 = (int)-3407692349237338475L;
      var20 = 1065765341;
      var19 = var10003;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = -865968262;
      var19 = var10003;
      var297[var10002] = (char)((var19 | var20) - (var19 & var20));
      var10002 = (int)7746519881072118921L;
      var20 = 1192879255;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = -1143478241;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var10003 = (int)-7746951747940402547L;
      var20 = -714053546;
      var19 = var10003;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = -23334562;
      var19 = var10003;
      var297[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      var20 = -1009352268;
      var19 = 101471292;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = -975514230;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = -494219338;
      var19 = 1098453015;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = -1544291289;
      var19 = var10003;
      var297[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      var10002 = (int)5518085425437041818L;
      var20 = -1413200693;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = -55893934;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var10003 = (int)-4012025813905575853L;
      var20 = -1020620849;
      var19 = var10003;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = -1706473480;
      var19 = var10003;
      var10003 = ((var19 | var20) & ~(var19 & var20)) * ((var19 | var20) & ~(var19 & var20));
      var10003 = (int)4365145868765252448L;
      var20 = -233212597;
      var19 = var10003;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = -1231182280;
      var19 = var10003;
      var297[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      var10002 = (int)9143233096131717801L;
      var20 = -1593232421;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = 2022676854;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1499479415;
      var19 = 237946743;
      int var10004 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1464793604;
      var19 = var10004;
      var10004 = var19 + var20 - 2 * (var19 & var20);
      var10004 = (int)3351738603917742945L;
      var20 = -1645794757;
      var19 = var10004;
      var10004 = (var19 | var20) & ~(var19 & var20);
      var20 = 530331999;
      var19 = var10004;
      var10004 = var19 & ~var20 | ~var19 & var20;
      var20 = 1795550931;
      var19 = 90995942;
      var10004 = (var19 | var20) & (~var19 | ~var20);
      var20 = 1852412455;
      var19 = var10004;
      var10004 = (var19 | var20) & ~(var19 & var20);
      var10003 = (int)1589234318461246604L;
      var20 = 1578458829;
      var19 = var10003;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = 380359524;
      var19 = var10003;
      var297[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      var20 = -1610384323;
      var19 = 752809789;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = -1931638011;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var10003 = (int)-4853948675494568438L;
      var20 = -1895055007;
      var19 = var10003;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = 270572265;
      var19 = var10003;
      var297[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      var20 = 942549061;
      var19 = -1902721274;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = -1229394107;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var10003 = (int)1029377306352142877L;
      var20 = 411599517;
      var19 = var10003;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = -729857645;
      var19 = var10003;
      var297[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      var20 = 1680109242;
      var19 = -928165696;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = -1400291715;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var10003 = (int)-8570632554235586649L;
      var20 = 1313170309;
      var19 = var10003;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = -1373192192;
      var19 = var10003;
      var297[var10002] = (char)((var19 | var20) & ~(var19 & var20));
      var10002 = (int)8994400331396167170L;
      var20 = 1724757736;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = 374046946;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = 188255943;
      var19 = 1604942932;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = 1418853056;
      var19 = var10003;
      var297[var10002] = (char)((var19 | var20) & ~(var19 & var20));
      var10002 = (int)-8940739685102296536L;
      var20 = -587218123;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = -1128095468;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var10003 = (int)4936705621425596981L;
      var20 = 294447071;
      var19 = var10003;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = 1278462670;
      var19 = var10003;
      var297[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      char[] var8 = var297;
      var20 = -1574610067;
      var19 = 401819231;
      var10000 = (var19 | var20) - (var19 & var20);
      var20 = -1244259016;
      var19 = var10000;
      char[] var299 = new char[var19 + var20 - 2 * (var19 & var20)];
      var10002 = (int)2000640702717887687L;
      var20 = 1643244981;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = -381556366;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var10003 = (int)4586532289847975456L;
      var20 = 1356997545;
      var19 = var10003;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = 2145203625;
      var19 = var10003;
      var299[var10002] = (char)((var19 | var20) - (var19 & var20));
      var20 = 2044575735;
      var19 = -503303612;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = -1679979086;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var10004 = (int)-7943006269905759347L;
      var20 = -1802389159;
      var19 = var10004;
      var10004 = (var19 | var20) & ~(var19 & var20);
      var20 = 889236167;
      var19 = var10004;
      var10004 = (var19 | var20) - (var19 & var20);
      var10004 = (int)8429681458860114470L;
      var20 = 1972070351;
      var19 = var10004;
      var10004 = var19 + var20 - 2 * (var19 & var20);
      var20 = -1467570715;
      var19 = var10004;
      var10004 = (var19 | var20) - (var19 & var20);
      var10003 = (int)7980588685713430649L;
      var20 = 2144518528;
      var19 = var10003;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = 295771642;
      var19 = var10003;
      var299[var10002] = (char)((var19 | var20) & ~(var19 & var20));
      var10002 = (int)-6150518335953803739L;
      var20 = 1783737728;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = 1654901671;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var10004 = (int)5858340913898067581L;
      var20 = -1510984837;
      var19 = var10004;
      var10004 = var19 + var20 - 2 * (var19 & var20);
      var20 = 536356104;
      var19 = var10004;
      var10004 = var19 + var20 - 2 * (var19 & var20);
      var10004 = (int)-7963956745300152815L;
      var20 = -191053759;
      var19 = var10004;
      var10004 = var19 + var20 - 2 * (var19 & var20);
      var20 = 22163008;
      var19 = var10004;
      var10004 = (var19 | var20) & ~(var19 & var20);
      var10004 = (int)7209074715499404893L;
      var20 = -865314224;
      var19 = var10004;
      var10004 = var19 & ~var20 | ~var19 & var20;
      var20 = -453262325;
      var19 = var10004;
      var10004 = (var19 | var20) - (var19 & var20);
      var10004 = (int)-2833667292818400295L;
      var20 = 1214115532;
      var19 = var10004;
      var10004 = (var19 | var20) & ~(var19 & var20);
      var20 = 129463581;
      var19 = var10004;
      var10004 = var19 & ~var20 | ~var19 & var20;
      var20 = -169034906;
      var19 = -1778348035;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = 1676456904;
      var19 = var10003;
      var299[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      var20 = 383537062;
      var19 = -1712831513;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = -1892414398;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = -284104451;
      var19 = -188651470;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = 466729165;
      var19 = var10003;
      var299[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      var10002 = (int)1810001848974326330L;
      var20 = 114659092;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = -2076199638;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = -1081137207;
      var19 = -1865064620;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = 794443997;
      var19 = var10003;
      var299[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      var10002 = (int)7514933856139902116L;
      var20 = 1547493475;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = -503669566;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var10003 = (int)-1001971915606608976L;
      var20 = -139337183;
      var19 = var10003;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = 15231237;
      var19 = var10003;
      var299[var10002] = (char)((var19 | var20) & ~(var19 & var20));
      var10002 = (int)6758223071865116823L;
      var20 = 184415085;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = -844928004;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var10003 = (int)2745541690080339118L;
      var20 = 1805253428;
      var19 = var10003;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = -872327855;
      var19 = var10003;
      var10003 = (var19 + var20 - 2 * (var19 & var20)) * (var19 + var20 - 2 * (var19 & var20));
      var20 = -348218906;
      var19 = -1729233396;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = 1943265491;
      var19 = var10003;
      var299[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      var20 = -1936432811;
      var19 = 895974798;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = -1175249700;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var10003 = (int)934607742250173727L;
      var20 = 1586475597;
      var19 = var10003;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1873373034;
      var19 = var10003;
      var299[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      var20 = -154398782;
      var19 = -2074834840;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = 1922598818;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1686797620;
      var19 = -66176407;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = -123629468;
      var19 = var10003;
      var10003 = (var19 + var20 - 2 * (var19 & var20)) * (var19 + var20 - 2 * (var19 & var20));
      var10003 = (int)-7903573089881578958L;
      var20 = -404644076;
      var19 = var10003;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = -1230717406;
      var19 = var10003;
      var299[var10002] = (char)((var19 | var20) & ~(var19 & var20));
      var10002 = (int)-8547146370639949034L;
      var20 = 1496035202;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = 1201093789;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = -229151250;
      var19 = -501597055;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = 273506908;
      var19 = var10003;
      var299[var10002] = (char)((var19 | var20) - (var19 & var20));
      char[] var9 = var299;
      var10000 = (int)6265267246533259500L;
      var20 = 620756529;
      var19 = var10000;
      var10000 = var19 & ~var20 | ~var19 & var20;
      var20 = -2004955427;
      var19 = var10000;

      for (int var10 = (var19 | var20) & (~var19 | ~var20); var10 < var6.length; var10++) {
         char var368 = var6[var10];
         char var269 = var8[var10 % var8.length];
         char var133 = var368;
         var7[var10] = (char)(var133 & ~var269 | ~var133 & var269);
      }

      char[] var21 = new char[var7.length];
      var10000 = (int)-7473512063406272898L;
      var20 = -1544002020;
      var19 = var10000;
      var10000 = (var19 | var20) & (~var19 | ~var20);
      var20 = 1340794978;
      var19 = var10000;

      for (int var11 = (var19 | var20) & ~(var19 & var20); var11 < var6.length; var11++) {
         char var369 = var7[var11];
         char var272 = var9[var11 % var9.length];
         char var136 = var369;
         var21[var11] = (char)((var136 | var272) - (var136 & var272));
      }

      String var22 = new String(var21);
      int var12 = var22.hashCode();
      var20 = var5;
      var19 = var3;
      var10000 = (var19 ^ var20) - 2 * (~var19 & var20);
      var20 = var2;
      var19 = var10000;
      int var13 = 2 * (var19 & ~var20) - (var19 ^ var20);
      char[] var14 = var0.toCharArray();
      char[] var15 = new char[var14.length];
      var20 = -1702036168;
      var19 = -1814555117;
      var10000 = (var19 | var20) & ~(var19 & var20);
      var20 = 156560171;
      var19 = var10000;
      int var16 = (var19 | var20) & (~var19 | ~var20);
      var20 = -1582459299;
      var19 = -1658815944;
      var10000 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1959393490;
      var19 = var10000;
      var10000 = (var19 | var20) & ~(var19 & var20);
      var20 = 1949721941;
      var19 = 1820590481;
      int var10001 = var19 & ~var20 | ~var19 & var20;
      var20 = -1781836624;
      var19 = var10001;
      var20 = (var19 | var20) & (~var19 | ~var20);
      var19 = var10000;
      var10000 = (var19 | var20) + (var19 & var20);
      var20 = 1037063129;
      var19 = -1665703417;
      var10000 = (var19 | var20) - (var19 & var20);
      var20 = -1334337617;
      var19 = var10000;
      int var18 = var19 + var20 - 2 * (var19 & var20);
      a = var18;
      String var310 = "ein";
      var20 = 1529066644;
      var19 = -1646932826;
      var10000 = var19 & ~var20 | ~var19 & var20;
      var20 = -394450738;
      var19 = var10000;
      if (((var19 | var20) & (~var19 | ~var20)) < a) {
         var20 = -1053504482;
         var19 = -1267126480;
         var10000 = var19 + var20 - 2 * (var19 & var20);
         var20 = -791518253;
         var19 = var10000;
         var10000 = (var19 | var20) - (var19 & var20);
         var20 = 1092415985;
         var19 = 333399293;
         var10000 = var19 + var20 - 2 * (var19 & var20);
         var20 = -928760608;
         var19 = var10000;
         var18 = var19 & ~var20 | ~var19 & var20;
      }

      for (; var16 < var15.length; var16++) {
         var10001 = (int)1871124697167604972L;
         var20 = -1766185772;
         var19 = var10001;
         var10001 = var19 + var20 - 2 * (var19 & var20);
         var20 = 261654586;
         var19 = var10001;
         switch (var16 % ((var19 | var20) - (var19 & var20))) {
            case 0:
               var20 = var12;
               var19 = var13;
               var10002 = var19 + var20 - 2 * (var19 & var20);
               char var295 = var14[var16];
               var19 = var10002;
               var15[var16] = (char)(var19 & ~var295 | ~var19 & var295);
               break;
            case 1:
               var20 = var13;
               var19 = var5;
               var10002 = var19 + var20 - 2 * (var19 & var20);
               char var293 = var14[var16];
               var19 = var10002;
               var15[var16] = (char)((var19 | var293) & (~var19 | ~var293));
         }
      }

      return new String(var15);
   }
}
