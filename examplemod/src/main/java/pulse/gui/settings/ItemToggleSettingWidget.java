package pulse;


import pulse.settings.ItemToggleSetting;
import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemToggleSettingWidget implements SettingWidget {
   public static final float a = 20.0F;
   private static final float d = 8.0F;
   private static final float e = 18.0F;
   private static final float f = 10.0F;
   private static final float g = 5.0F;
   private static final float h = 14.0F;
   private static final float i = 6.0F;
   private static final float j = 11.0F;
   private static final float k = 4.0F;
   private final String l;
   private final Item m;
   private boolean n;
   private Color o;
   private final Color p;
   private final ItemToggleSetting q;
   private final AnimationState r = new AnimationState();
   private final AnimationState s = new AnimationState();
   private final MarqueeText t = new MarqueeText();
   private boolean u;
   private boolean v;
   private float w;
   private float x;
   private float y;
   private boolean z;
   public static int b;
   public static boolean c;

   public ItemToggleSettingWidget(ItemToggleSetting var1) {
      int var10001 = (int)-8375851840909956918L;
      int var3 = -1056898478;
      int var2 = var10001;
      var10001 = var2 + var3 - 2 * (var2 & var3);
      var3 = 2051254936;
      var2 = var10001;
      this.u = pulse.Bool.from(var2 + var3 - 2 * (var2 & var3));
      var3 = -1606681964;
      var2 = -218631118;
      var10001 = (var2 | var3) & ~(var2 & var3);
      var3 = 1389104806;
      var2 = var10001;
      this.v = pulse.Bool.from((var2 | var3) - (var2 & var3));
      this.y = 1.0F;
      var10001 = (int)-9117622728352018233L;
      var3 = 874724036;
      var2 = var10001;
      var10001 = var2 & ~var3 | ~var2 & var3;
      var3 = -1531975165;
      var2 = var10001;
      this.z = pulse.Bool.from((var2 | var3) & ~(var2 & var3));
      this.q = var1;
      this.l = var1.f();
      this.m = var1.c();
      this.n = var1.a();
      this.o = var1.d();
      this.p = var1.d();
      this.v = this.n;
      this.r.d(!this.n ? 0.0 : 1.0);
   }

   public ItemToggleSettingWidget(String var1, Item var2, boolean var3, Color var4) {
      int var6 = 27235478;
      int var5 = -608740176;
      int var10001 = (var5 | var6) & ~(var5 & var6);
      var6 = -634861530;
      var5 = var10001;
      this.u = pulse.Bool.from((var5 | var6) - (var5 & var6));
      var6 = 1326103885;
      var5 = -2021892393;
      var10001 = var5 + var6 - 2 * (var5 & var6);
      var6 = -931732582;
      var5 = var10001;
      this.v = pulse.Bool.from(var5 & ~var6 | ~var5 & var6);
      this.y = 1.0F;
      var6 = -559327772;
      var5 = -1495355131;
      var10001 = var5 + var6 - 2 * (var5 & var6);
      var6 = 2021123297;
      var5 = var10001;
      this.z = pulse.Bool.from(var5 & ~var6 | ~var5 & var6);
      this.q = null;
      this.l = var1;
      this.m = var2;
      this.n = var3;
      this.o = var4;
      this.p = var4;
      this.v = var3;
      this.r.d(!var3 ? 0.0 : 1.0);
   }

   @Override
   public String a() {
      return this.l;
   }

   @Override
   public float b() {
      int var10000 = (int)-2764622985467334451L;
      int var2 = 617138922;
      int var1 = var10000;
      var10000 = var1 & ~var2 | ~var1 & var2;
      var2 = 1353529041;
      var1 = var10000;
      var10000 = (var1 & ~var2 | ~var1 & var2) * (var1 & ~var2 | ~var1 & var2);
      return 20.0F;
   }

   public Item c() {
      return this.m;
   }

   public boolean e() {
      return this.n;
   }

   public void a(boolean var1) {
      this.n = var1;
      if (this.q != null) {
         this.q.a(var1);
      }
   }

   public void f() {
      int var9;
      if (this.n) {
         int var2 = -1372052919;
         int var1 = -586807120;
         var9 = (var1 | var2) & ~(var1 & var2);
         var2 = 1933454073;
         var1 = var9;
         var9 = (var1 | var2) & ~(var1 & var2);
      } else {
         int var7 = 2081076830;
         int var4 = -303368301;
         var9 = (var4 | var7) & (~var4 | ~var7);
         var7 = -1847574068;
         var4 = var9;
         var9 = (var4 | var7) & ~(var4 & var7);
      }

      this.n = pulse.Bool.from(var9);
      if (this.q != null) {
         this.q.a(this.n);
      }
   }

   public Color g() {
      return this.o;
   }

   public void a(Color var1) {
      this.o = var1;
      if (this.q != null) {
         this.q.a(var1);
      }
   }

   public Color h() {
      return this.p;
   }

   public float i() {
      float[] var1 = Color.RGBtoHSB(this.o.getRed(), this.o.getGreen(), this.o.getBlue(), null);
      int var10001 = (int)6872049044083996694L;
      int var3 = -965681678;
      int var2 = var10001;
      var10001 = (var2 | var3) - (var2 & var3);
      var3 = -507468316;
      var2 = var10001;
      return var1[(var2 | var3) & ~(var2 & var3)];
   }

   public float m() {
      float[] var1 = Color.RGBtoHSB(this.o.getRed(), this.o.getGreen(), this.o.getBlue(), null);
      int var3 = 1926719294;
      int var2 = 1062680842;
      int var10001 = (var2 | var3) - (var2 & var3);
      var3 = 1300258357;
      var2 = var10001;
      return var1[(var2 | var3) & ~(var2 & var3)];
   }

   public float n() {
      float[] var1 = Color.RGBtoHSB(this.o.getRed(), this.o.getGreen(), this.o.getBlue(), null);
      int var10001 = (int)5716550018897400431L;
      int var3 = -1696318376;
      int var2 = var10001;
      var10001 = (var2 | var3) & (~var2 | ~var3);
      var3 = -70914507;
      var2 = var10001;
      return var1[(var2 | var3) & ~(var2 & var3)];
   }

   public void a(float var1, float var2, float var3) {
      this.o = Color.getHSBColor(var1, var2, var3);
   }

   public void o() {
      this.o = this.p;
   }

   public boolean p() {
      if (this.z) {
         if (pulse.ColorPickerPopup.a().c()) {
            int var46 = -1491170880;
            int var25 = -2132940472;
            int var64 = (var25 | var46) & ~(var25 & var46);
            var46 = 667115657;
            var25 = var64;
            return pulse.Bool.from((var25 | var46) & (~var25 | ~var46));
         }

         int var4 = 1390668637;
         int var3 = -1793413070;
         int var10000 = var3 + var4 - 2 * (var3 & var4);
         var4 = -2006052844;
         var3 = var10000;
         var10000 = var3 + var4 - 2 * (var3 & var4);
         var4 = 1096087501;
         var3 = 1347804000;
         int var10001 = var3 & ~var4 | ~var3 & var4;
         var4 = -1764973399;
         var3 = var10001;
         var4 = var3 + var4 - 2 * (var3 & var4);
         var3 = var10000;
         var10000 = (var3 | var4) + (var3 & var4);
         var10000 = (int)-8269237163883549573L;
         var4 = -2037329964;
         var3 = var10000;
         var10000 = (var3 | var4) & (~var3 | ~var4);
         var4 = 264532560;
         var3 = var10000;
         int var2 = var3 & ~var4 | ~var3 & var4;
         b = var2;
         var10000 = (int)-6748010340312927037L;
         var4 = 1478364161;
         var3 = var10000;
         var10000 = var3 + var4 - 2 * (var3 & var4);
         var4 = -1227763093;
         var3 = var10000;
         var10000 = (var3 | var4) - (var3 & var4);
         var4 = 2079030482;
         var3 = -1918504066;
         var10000 = (var3 | var4) & (~var3 | ~var4);
         var4 = -997369096;
         var3 = var10000;
         if ((var3 | var4) - (var3 & var4) <= b) {
            var4 = -1377974690;
            var3 = -518703164;
            var10000 = var3 + var4 - 2 * (var3 & var4);
            var4 = -1769421748;
            var3 = var10000;
            var10000 = (var3 | var4) - (var3 & var4);
            var10001 = (int)-3551161283177569068L;
            var4 = -1874098622;
            var3 = var10001;
            var10001 = (var3 | var4) - (var3 & var4);
            var4 = 590686720;
            var3 = var10001;
            var4 = (var3 | var4) & ~(var3 & var4);
            var3 = var10000;
            var10000 = 2 * (var3 | var4) - (var3 ^ var4);
            var10000 = (int)-2848648635791459264L;
            var4 = 1027366062;
            var3 = var10000;
            var10000 = (var3 | var4) & ~(var3 & var4);
            var4 = 886771790;
            var3 = var10000;
            var2 = (var3 | var4) - (var3 & var4);
            b = var2;
         }
      }

      int var61 = (int)-96575461675912473L;
      int var44 = 383708293;
      int var23 = var61;
      var61 = var23 + var44 - 2 * (var23 & var44);
      var44 = 236412514;
      var23 = var61;
      return pulse.Bool.from((var23 | var44) - (var23 & var44));
   }

   public boolean q() {
      if (this.z) {
         if (pulse.ColorPickerPopup.a().c()) {
            int var40 = 126749336;
            int var22 = 1986533087;
            int var57 = (var22 | var40) & (~var22 | ~var40);
            var40 = 1910905926;
            var22 = var57;
            return pulse.Bool.from(var22 + var40 - 2 * (var22 & var40));
         }

         int var10000 = (int)8224045635910490349L;
         int var4 = -44665908;
         int var3 = var10000;
         var10000 = (var3 | var4) - (var3 & var4);
         var4 = -936493027;
         var3 = var10000;
         var10000 = (var3 | var4) & (~var3 | ~var4);
         var4 = 2129483525;
         var3 = 2145026623;
         var10000 = var3 + var4 - 2 * (var3 & var4);
         var4 = 731326300;
         var3 = var10000;
         int var2 = var3 & ~var4 | ~var3 & var4;
         b = var2;
         var10000 = (int)1046795340422746359L;
         var4 = 1170602586;
         var3 = var10000;
         var10000 = var3 + var4 - 2 * (var3 & var4);
         var4 = 95415169;
         var3 = var10000;
         var10000 = var3 + var4 - 2 * (var3 & var4);
         int var10001 = (int)2772875488700208678L;
         var4 = -1617584805;
         var3 = var10001;
         var10001 = var3 + var4 - 2 * (var3 & var4);
         var4 = 1592094140;
         var3 = var10001;
         var4 = (var3 | var4) & ~(var3 & var4);
         var3 = var10000;
         var10000 = 2 * (var3 | var4) - (var3 ^ var4);
         var4 = 1696442845;
         var3 = 1373394525;
         var10000 = (var3 | var4) - (var3 & var4);
         var4 = 1925322661;
         var3 = var10000;
         if (((var3 | var4) & ~(var3 & var4)) < b) {
            var10000 = (int)-6413665181791616029L;
            var4 = -915797831;
            var3 = var10000;
            var10000 = (var3 | var4) & ~(var3 & var4);
            var4 = -1285615700;
            var3 = var10000;
            var10000 = ((var3 | var4) - (var3 & var4)) * ((var3 | var4) - (var3 & var4));
            var4 = -1979523443;
            var3 = -528721671;
            var10000 = var3 & ~var4 | ~var3 & var4;
            var4 = 663543852;
            var3 = var10000;
            var2 = (var3 | var4) & (~var3 | ~var4);
         }
      }

      int var54 = (int)-7874091037854952936L;
      int var38 = 17466902;
      int var20 = var54;
      var54 = (var20 | var38) & ~(var20 & var38);
      var38 = 1989874702;
      var20 = var54;
      return pulse.Bool.from((var20 | var38) & (~var20 | ~var38));
   }

   @Override
   public void a(MatrixStack var1, Renderer2D var2, float var3, float var4, float var5, int var6, int var7, float var8, float var9) {
      int var10001 = (int)-4771078234840363997L;
      int var40 = 649362562;
      int var39 = var10001;
      var10001 = (var39 | var40) & (~var39 | ~var40);
      var40 = -1911918417;
      var39 = var10001;
      FontRenderer var10 = FontManager.a[var39 & ~var40 | ~var39 & var40];
      MinecraftClient var11 = MinecraftClient.getInstance();
      var40 = 755707630;
      var39 = -1683921007;
      var10001 = var39 + var40 - 2 * (var39 & var40);
      var40 = -1230354065;
      var39 = var10001;
      var10001 = (var39 | var40) & (~var39 | ~var40);
      var10001 = (int)-6334456852310292430L;
      var40 = 925372737;
      var39 = var10001;
      var10001 = (var39 | var40) & ~(var39 & var40);
      var40 = -701916813;
      var39 = var10001;
      var10001 = (var39 | var40) & ~(var39 & var40);
      float var12 = 20.0F * var9;
      var40 = -1697984004;
      var39 = 1766012624;
      int var10000 = var39 + var40 - 2 * (var39 & var40);
      var40 = -1787493982;
      var39 = var10000;
      var10000 = (var39 | var40) & ~(var39 & var40);
      var10001 = (int)103559116512025721L;
      var40 = 538916630;
      var39 = var10001;
      var10001 = (var39 | var40) & (~var39 | ~var40);
      var40 = -1214121968;
      var39 = var10001;
      var40 = (var39 | var40) - (var39 & var40);
      var39 = var10000;
      var10000 = (var39 | var40) + (var39 & var40);
      float var13 = 8.0F * var9;
      this.y = var9;
      boolean var14 = GuiInput.a(var3, var4, var5, var12, var6, var7);
      this.t.a(var14);
      if (var14 != this.u) {
         double var194 = !var14 ? 0.0 : 1.0;
         var40 = 767634810;
         var39 = 1209406259;
         int var10002 = var39 + var40 - 2 * (var39 & var40);
         var40 = -2009460050;
         var39 = var10002;
         var10002 = (var39 | var40) - (var39 & var40);
         var40 = 1087183080;
         var39 = 1239495843;
         int var10003 = (var39 | var40) & ~(var39 & var40);
         var40 = 1885834740;
         var39 = var10003;
         var40 = var39 + var40 - 2 * (var39 & var40);
         var39 = var10002;
         var10002 = var39 - ~var40 - 1;
         this.s.a(var194, 0.15, pulse.Easing.h);
         this.u = var14;
      }

      if (this.n != this.v) {
         double var195 = !this.n ? 0.0 : 1.0;
         int var213 = (int)5611746622537509588L;
         var40 = -1945528169;
         var39 = var213;
         var213 = (var39 | var40) & (~var39 | ~var40);
         var40 = -531486823;
         var39 = var213;
         var213 = (var39 | var40) & ~(var39 & var40);
         this.r.a(var195, 0.2, pulse.Easing.h);
         this.v = this.n;
      }

      this.s.a();
      this.r.a();
      float var15 = (float)this.r.j();
      var40 = -391107258;
      var39 = 990691182;
      var10000 = (var39 | var40) & (~var39 | ~var40);
      var40 = -906519923;
      var39 = var10000;
      var10000 = var39 + var40 - 2 * (var39 & var40);
      var10001 = (int)-1694761782073257243L;
      var40 = -844199796;
      var39 = var10001;
      var10001 = var39 + var40 - 2 * (var39 & var40);
      var40 = 1250470502;
      var39 = var10001;
      var40 = (var39 | var40) - (var39 & var40);
      var39 = var10000;
      var10000 = (var39 ^ var40) + 2 * (var39 & var40);
      int var16 = (int)(255.0F * var8);
      var40 = 1516562149;
      var39 = 305886063;
      var10000 = (var39 | var40) & ~(var39 & var40);
      var40 = 1008821089;
      var39 = var10000;
      var10000 = (var39 | var40) & (~var39 | ~var40);
      float var17 = 16.0F * var9;
      float var164 = var3 + var13;
      var40 = -1903950088;
      var39 = 507869469;
      var10001 = (var39 | var40) & ~(var39 & var40);
      var40 = -674392064;
      var39 = var10001;
      var10001 = var39 + var40 - 2 * (var39 & var40);
      var40 = -927850491;
      var39 = -1758129590;
      int var216 = var39 + var40 - 2 * (var39 & var40);
      var40 = -1053917528;
      var39 = var216;
      var40 = var39 & ~var40 | ~var39 & var40;
      var39 = var10001;
      var10001 = (var39 & ~var40) + (var40 & ~var39) + 2 * (var39 & var40);
      float var18 = var164 - 3.0F;
      float var19 = var4 + var12 / 2.0F - var17 / 2.0F;
      var10001 = (int)4633204371821497573L;
      var40 = -1088117184;
      var39 = var10001;
      var10001 = (var39 | var40) & (~var39 | ~var40);
      var40 = 1101302750;
      var39 = var10001;
      var10001 = (var39 | var40) & ~(var39 & var40);
      if (var8 > 0.01F) {
         this.a(var1, new ItemStack(this.m), var18, var19, var17, var8, var11);
      }

      var10000 = (int)-3067949336167577117L;
      var40 = -884089057;
      var39 = var10000;
      var10000 = var39 + var40 - 2 * (var39 & var40);
      var40 = -523299403;
      var39 = var10000;
      var10000 = var39 + var40 - 2 * (var39 & var40);
      var40 = 706877809;
      var39 = 1180825571;
      var10001 = var39 & ~var40 | ~var39 & var40;
      var40 = 1148137139;
      var39 = var10001;
      var40 = var39 + var40 - 2 * (var39 & var40);
      var39 = var10000;
      var10000 = 2 * (var39 | var40) - (var39 ^ var40);
      float var20 = 14.0F * var9;
      float var21 = var3 + var5 - var13 - var20;
      float var22 = var4 + var12 / 2.0F - var20 / 2.0F;
      var10000 = (int)-364837390434665663L;
      var40 = -788759040;
      var39 = var10000;
      var10000 = var39 + var40 - 2 * (var39 & var40);
      var40 = -1505589964;
      var39 = var10000;
      var10000 = var39 & ~var40 | ~var39 & var40;
      var10001 = (int)-8486715983080541882L;
      var40 = -516950648;
      var39 = var10001;
      var10001 = var39 & ~var40 | ~var39 & var40;
      var40 = -1696532598;
      var39 = var10001;
      var40 = var39 & ~var40 | ~var39 & var40;
      var39 = var10000;
      var10000 = 2 * (var39 | var40) - (var39 ^ var40);
      float var23 = 18.0F * var9;
      var10000 = (int)-495737413092843568L;
      var40 = 1516209654;
      var39 = var10000;
      var10000 = (var39 | var40) - (var39 & var40);
      var40 = -1100872576;
      var39 = var10000;
      var10000 = (var39 | var40) & (~var39 | ~var40);
      var40 = -335914286;
      var39 = 515073662;
      var10001 = (var39 | var40) & ~(var39 & var40);
      var40 = 1943401377;
      var39 = var10001;
      var40 = (var39 | var40) & ~(var39 & var40);
      var39 = var10000;
      var10000 = (var39 & ~var40) + (var40 & ~var39) + 2 * (var39 & var40);
      float var24 = 10.0F * var9;
      float var177 = var21 - var23;
      var40 = -756501388;
      var39 = -1088365021;
      var10001 = var39 + var40 - 2 * (var39 & var40);
      var40 = -974764076;
      var39 = var10001;
      var10001 = (var39 + var40 - 2 * (var39 & var40)) * (var39 + var40 - 2 * (var39 & var40));
      float var25 = var177 - 6.0F * var9;
      float var26 = var4 + var12 / 2.0F - var24 / 2.0F;
      float var27 = var3 + var13 + var17 - 1.0F * var9;
      float var178 = var25 - var27;
      var216 = (int)7842315650600124705L;
      var40 = 1965075316;
      var39 = var216;
      var216 = (var39 | var40) & ~(var39 & var40);
      var40 = -543069608;
      var39 = var216;
      var216 = (var39 | var40) & (~var39 | ~var40);
      var216 = (int)2530270588004591951L;
      var40 = 1958869254;
      var39 = var216;
      var216 = (var39 | var40) & ~(var39 & var40);
      var40 = -346025909;
      var39 = var216;
      var216 = var39 & ~var40 | ~var39 & var40;
      float var28 = var178 - 4.0F * var9;
      float var179 = var4 + var12 / 2.0F;
      float var210 = var10.b(this.l) * var9;
      var216 = (int)5590306132066952997L;
      var40 = 573957834;
      var39 = var216;
      var216 = var39 & ~var40 | ~var39 & var40;
      var40 = 1338983271;
      var39 = var216;
      var216 = (var39 | var40) & ~(var39 & var40);
      float var29 = var179 - var210 / 4.0F;
      this.t.a(var1, var2, var10, this.l, var27, var29, var28, var9, pulse.Theme.a, var8);
      this.w = var21;
      this.x = var22;
      this.a(var1, var2, var25, var26, var15, var8, var9);
      String var180 = "eye";
      float var30 = 6.0F * var9;
      Color var31 = pulse.Theme.a(pulse.Theme.V, var16);
      var2.a(var21, var22, var20, var20, var30, var31, var1);
      var40 = -1709925923;
      var39 = -1537481857;
      var10000 = var39 & ~var40 | ~var39 & var40;
      var40 = -44691229;
      var39 = var10000;
      var10000 = ((var39 | var40) - (var39 & var40)) * ((var39 | var40) - (var39 & var40));
      float var32 = 11.0F * var9;
      var10000 = (int)-2674127790483877593L;
      var40 = 1755523384;
      var39 = var10000;
      var10000 = var39 & ~var40 | ~var39 & var40;
      var40 = -551565915;
      var39 = var10000;
      var10000 = (var39 & ~var40 | ~var39 & var40) * (var39 & ~var40 | ~var39 & var40);
      float var33 = 4.0F * var9;
      float var34 = var21 + (var20 - var32) / 2.0F;
      float var35 = var22 + (var20 - var32) / 2.0F;
      Color var36 = pulse.Theme.a(this.o, var16);
      var2.a(var34, var35, var32, var32, var33, var36, var1);
      boolean var37 = GuiInput.a(var25, var26, var23, var24, var6, var7);
      boolean var38 = GuiInput.a(var21, var22, var20, var20, var6, var7);
      if (var37 || var38) {
         GuiInput.g();
      }
   }

   private void a(MatrixStack var1, Renderer2D var2, float var3, float var4, float var5, float var6, float var7) {
      int var10001 = (int)-715042270989316690L;
      int var27 = -236022739;
      int var26 = var10001;
      var10001 = (var26 | var27) & (~var26 | ~var27);
      var27 = 1067817362;
      var26 = var10001;
      var10001 = (var26 | var27) & ~(var26 & var27);
      int var8 = (int)(255.0F * var6);
      var27 = -1485153017;
      var26 = -486386794;
      int var10000 = (var26 | var27) - (var26 & var27);
      var27 = -858617625;
      var26 = var10000;
      var10000 = (var26 | var27) - (var26 & var27);
      var27 = -629513509;
      var26 = -1312706659;
      var10001 = (var26 | var27) - (var26 & var27);
      var27 = -1499776440;
      var26 = var10001;
      var27 = var26 + var27 - 2 * (var26 & var27);
      var26 = var10000;
      var10000 = (var26 | var27) + (var26 & var27);
      float var9 = 18.0F * var7;
      String var118 = "eyf";
      float var10 = 10.0F * var7;
      var27 = 902588029;
      var26 = -666545642;
      var10000 = var26 & ~var27 | ~var26 & var27;
      var27 = 1074076863;
      var26 = var10000;
      var10000 = (var26 | var27) & (~var26 | ~var27);
      float var11 = 5.0F * var7;
      var10000 = (int)2266429972840878164L;
      var27 = -711656489;
      var26 = var10000;
      var10000 = var26 & ~var27 | ~var26 & var27;
      var27 = 931182903;
      var26 = var10000;
      var10000 = (var26 | var27) - (var26 & var27);
      var27 = -940890830;
      var26 = -2052671036;
      var10001 = (var26 | var27) - (var26 & var27);
      var27 = -1832662047;
      var26 = var10001;
      var27 = (var26 | var27) - (var26 & var27);
      var26 = var10000;
      var10000 = (var26 & ~var27) + (var27 & ~var26) + 2 * (var26 & var27);
      float var12 = 9.0F * var7;
      float var13 = var9 - var12 - var7;
      int var10002 = (int)-774961265391647964L;
      var27 = 2031410675;
      var26 = var10002;
      var10002 = (var26 | var27) & (~var26 | ~var27);
      var27 = -1129308452;
      var26 = var10002;
      var10002 = (var26 | var27) - (var26 & var27);
      var27 = -339969796;
      var26 = 7908467;
      var10002 = (var26 | var27) & (~var26 | ~var27);
      var27 = -339422078;
      var26 = var10002;
      var10002 = var26 & ~var27 | ~var26 & var27;
      float var14 = var3 + 0.5F * var7 + var13 * var5;
      var10002 = (int)-4919604321222055075L;
      var27 = 1755204406;
      var26 = var10002;
      var10002 = (var26 | var27) & ~(var26 & var27);
      var27 = 915103865;
      var26 = var10002;
      var10002 = var26 + var27 - 2 * (var26 & var27);
      var10002 = (int)5870766381611345922L;
      var27 = 82407627;
      var26 = var10002;
      var10002 = (var26 | var27) & ~(var26 & var27);
      var27 = 1540790470;
      var26 = var10002;
      var10002 = (var26 | var27) & ~(var26 & var27);
      var10002 = (int)4227972697843552964L;
      var27 = -1864511204;
      var26 = var10002;
      var10002 = (var26 | var27) & ~(var26 & var27);
      var27 = 131990472;
      var26 = var10002;
      var10002 = (var26 | var27) & (~var26 | ~var27);
      float var15 = var4 + 0.5F * var7;
      var27 = 295088999;
      var26 = -1532788793;
      var10001 = (var26 | var27) - (var26 & var27);
      var27 = -201814031;
      var26 = var10001;
      var10001 = var26 & ~var27 | ~var26 & var27;
      if (var5 > 0.01F) {
         float var131 = var3 + var7;
         String var10003 = "eyg";
         float var146 = var4 - 3.0F * var7;
         int var149 = (int)-1378598131097005698L;
         var27 = -136001553;
         var26 = var149;
         int var150 = (var26 | var27) & ~(var26 & var27);
         var27 = -744252414;
         var26 = var150;
         int var151 = var26 + var27 - 2 * (var26 & var27);
         var27 = -425770090;
         var26 = 2002470121;
         int var10004 = (var26 | var27) & ~(var26 & var27);
         var27 = 398409255;
         var26 = var10004;
         var27 = var26 + var27 - 2 * (var26 & var27);
         var26 = var151;
         int var152 = (var26 & ~var27) + (var27 & ~var26) + 2 * (var26 & var27);
         float var153 = 8.0F * var7;
         Color var156 = pulse.Theme.E;
         var27 = 1898970317;
         var26 = -1208497479;
         int var10006 = var26 & ~var27 | ~var26 & var27;
         var27 = -958908803;
         var26 = var10006;
         var10006 = var26 + var27 - 2 * (var26 & var27);
         var27 = 1679881437;
         var26 = -321765218;
         var10006 = (var26 | var27) & ~(var26 & var27);
         var27 = -1997360060;
         var26 = var10006;
         var10006 = (var26 | var27) - (var26 & var27);
         float var10005 = 255.0F * var5;
         var10006 = (int)-1152865541645184714L;
         var27 = 815520186;
         var26 = var10006;
         var10006 = var26 & ~var27 | ~var26 & var27;
         var27 = 1500722830;
         var26 = var10006;
         var10006 = (var26 | var27) & ~(var26 & var27);
         var27 = -1932578337;
         var26 = 455597878;
         int var10007 = var26 + var27 - 2 * (var26 & var27);
         var27 = 963794459;
         var26 = var10007;
         var27 = (var26 | var27) - (var26 & var27);
         var26 = var10006;
         var10006 = (var26 ^ var27) + 2 * (var26 & var27);
         var2.a(var131, var146, var153, pulse.Theme.a(var156, (int)(var10005 * 0.5F * var6)), var1);
      }

      Color var16 = ColorUtils.a(pulse.Theme.F, pulse.Theme.C, var5);
      Color var17 = ColorUtils.a(pulse.Theme.G, pulse.Theme.D, var5);
      Color var18 = pulse.Theme.a(var16, var8);
      Color var19 = pulse.Theme.a(var17, var8);
      String var147 = "eyh";
      float var132 = var3 - 0.5F * var7;
      String var154 = "eyi";
      var2.a(var132, var4 - 0.5F * var7, var9 + var7, var10 + var7, var11, var18, var18, var19, var19, var1);
      Color var20 = ColorUtils.a(pulse.Theme.f, pulse.Theme.y, var5);
      Color var21 = ColorUtils.a(pulse.Theme.H, pulse.Theme.z, var5);
      Color var22 = pulse.Theme.a(var20, var8);
      var10002 = var21.getRed();
      int var155 = var21.getGreen();
      int var157 = var21.getBlue();
      var27 = -1929808156;
      var26 = -559000304;
      int var158 = (var26 | var27) - (var26 & var27);
      var27 = 1381442315;
      var26 = var158;
      var158 = (var26 | var27) & (~var26 | ~var27);
      float var167 = var21.getAlpha();
      var27 = -1704584094;
      var26 = 1571806140;
      int var168 = var26 + var27 - 2 * (var26 & var27);
      var27 = -943077599;
      var26 = var168;
      var168 = (var26 | var27) & (~var26 | ~var27);
      var27 = var21.getAlpha();
      var26 = var168;
      Color var23 = new Color(var10002, var155, var157, Math.min(var158, (int)(var167 + (var26 - var27) * var5 * var6)));
      var2.a(var3, var4, var9, var10, var11, var22, var22, var23, var23, var1);
      Color var24 = ColorUtils.a(pulse.Theme.b, pulse.Theme.a, var5);
      Color var25 = pulse.Theme.a(var24, var8);
      var2.a(var14, var15, var12, var12, var12, var25, var1);
   }

   @Override
   public boolean a(float var1, float var2, float var3, int var4, int var5) {
      int var10000 = (int)-4728015726896831061L;
      int var15 = 716787971;
      int var14 = var10000;
      var10000 = var14 & ~var15 | ~var14 & var15;
      var15 = 6608623;
      var14 = var10000;
      var10000 = ((var14 | var15) & (~var14 | ~var15)) * ((var14 | var15) & (~var14 | ~var15));
      float var6 = 8.0F;
      var10000 = (int)-1725299234879192283L;
      var15 = 498030883;
      var14 = var10000;
      var10000 = (var14 | var15) - (var14 & var15);
      var15 = -756642954;
      var14 = var10000;
      var10000 = (var14 | var15) & (~var14 | ~var15);
      var15 = -1536622442;
      var14 = 520543553;
      int var10001 = (var14 | var15) & (~var14 | ~var15);
      var15 = 1669970804;
      var14 = var10001;
      var15 = var14 + var15 - 2 * (var14 & var15);
      var14 = var10000;
      var10000 = (var14 | var15) + (var14 & var15);
      float var7 = 14.0F;
      float var8 = var1 + var3 - var6 - var7;
      var10001 = (int)2688752966049541818L;
      var15 = -565458397;
      var14 = var10001;
      var10001 = var14 & ~var15 | ~var14 & var15;
      var15 = -67948953;
      var14 = var10001;
      var10001 = (var14 + var15 - 2 * (var14 & var15)) * (var14 + var15 - 2 * (var14 & var15));
      float var9 = var2 + 10.0F - var7 / 2.0F;
      String var68 = "eyj";
      float var10 = 18.0F;
      var10000 = (int)8684876662775930146L;
      var15 = -910763117;
      var14 = var10000;
      var10000 = (var14 | var15) & ~(var14 & var15);
      var15 = -1446310463;
      var14 = var10000;
      var10000 = (var14 | var15) & (~var14 | ~var15);
      float var11 = 10.0F;
      float var72 = var8 - var10;
      var10001 = (int)2772341805173453030L;
      var15 = -664298861;
      var14 = var10001;
      var10001 = (var14 | var15) & ~(var14 & var15);
      var15 = 1992182295;
      var14 = var10001;
      var10001 = var14 & ~var15 | ~var14 & var15;
      var15 = 760644781;
      var14 = 305986357;
      int var10002 = (var14 | var15) & (~var14 | ~var15);
      var15 = -169462176;
      var14 = var10002;
      var15 = (var14 | var15) & (~var14 | ~var15);
      var14 = var10001;
      var10001 = (var14 ^ var15) + 2 * (var14 & var15);
      float var12 = var72 - 6.0F;
      var10001 = (int)-1742951962960511846L;
      var15 = 549228565;
      var14 = var10001;
      var10001 = var14 + var15 - 2 * (var14 & var15);
      var15 = -1434389999;
      var14 = var10001;
      var10001 = (var14 | var15) & ~(var14 & var15);
      float var13 = var2 + 10.0F - var11 / 2.0F;
      if (!GuiInput.a(var12, var13, var10, var11, var4, var5)) {
         if (!GuiInput.a(var8, var9, var7, var7, var4, var5)) {
            var10000 = (int)3481654176433852492L;
            var15 = 1273298260;
            var14 = var10000;
            var10000 = var14 & ~var15 | ~var14 & var15;
            var15 = -1426281192;
            var14 = var10000;
            return pulse.Bool.from(var14 + var15 - 2 * (var14 & var15));
         }

         if (!this.p()) {
            this.u();
         } else {
            this.r();
         }

         var15 = -552875469;
         var14 = -1155414982;
         var10000 = (var14 | var15) & (~var14 | ~var15);
         var15 = 1680477704;
         var14 = var10000;
         return pulse.Bool.from((var14 | var15) & (var14 ^ -1 | var15 ^ -1));
      } else {
         this.f();
         var15 = 1524420907;
         var14 = -1476782459;
         var10000 = (var14 | var15) & (~var14 | ~var15);
         var15 = -47790161;
         var14 = var10000;
         return pulse.Bool.from(var14 & (var15 ^ -1) | (var14 ^ -1) & var15);
      }
   }

   private void u() {
      int var10000 = (int)-247986057062660206L;
      int var5 = -765417019;
      int var4 = var10000;
      var10000 = (var4 | var5) - (var4 & var5);
      var5 = 629871565;
      var4 = var10000;
      var10000 = var4 & ~var5 | ~var4 & var5;
      var5 = -595397100;
      var4 = -448712427;
      int var10001 = (var4 | var5) - (var4 & var5);
      var5 = -1749115212;
      var4 = var10001;
      var5 = var4 & ~var5 | ~var4 & var5;
      var4 = var10000;
      var10000 = 2 * (var4 | var5) - (var4 ^ var5);
      float var1 = 14.0F * this.y;
      int var2 = (int)(this.w + var1 / 2.0F);
      float var25 = this.x + var1;
      var5 = -745798000;
      var4 = -44687298;
      var10001 = var4 & ~var5 | ~var4 & var5;
      var5 = -238581302;
      var4 = var10001;
      var10001 = (var4 | var5) - (var4 & var5);
      int var3 = (int)(var25 + 5.0F * this.y);
      var5 = -1522579121;
      var4 = -1987951853;
      var10001 = var4 & ~var5 | ~var4 & var5;
      var5 = 750586461;
      var4 = var10001;
      this.z = pulse.Bool.from(var4 + var5 - 2 * (var4 & var5));
      pulse.ColorPickerPopup.a().a(var2, var3, pulse.ColorPickerPopup.Edge.BOTTOM, this.l, this.o, this.y, this::b);
   }

   public void r() {
      int var2 = -185102909;
      int var1 = -953165460;
      int var10001 = (var1 | var2) - (var1 & var2);
      var2 = 869815471;
      var1 = var10001;
      this.z = pulse.Bool.from(var1 + var2 - 2 * (var1 & var2));
      pulse.ColorPickerPopup.a().b();
   }

   private void b(Color var1) {
      this.a(var1);
   }

   @Override
   public void a(int var1, int var2) {
   }

   @Override
   public void a(int var1, int var2, double var3, double var5) {
   }

   @Override
   public boolean l() {
      int var10;
      if (this.z && pulse.ColorPickerPopup.a().c()) {
         int var7 = 1315377775;
         int var4 = -1072617539;
         var10 = var4 & ~var7 | ~var4 & var7;
         var7 = -1904855597;
         var4 = var10;
         var10 = (var4 | var7) - (var4 & var7);
      } else {
         var10 = (int)3617484910080396948L;
         int var2 = 2043234367;
         int var1 = var10;
         var10 = (var1 | var2) - (var1 & var2);
         var2 = 2086979243;
         var1 = var10;
         var10 = var1 & ~var2 | ~var1 & var2;
      }

      return pulse.Bool.from(var10);
   }

   public void s() {
      if (this.z) {
         this.r();
      }
   }

   public boolean b(int var1, int var2) {
      if (this.z) {
         return pulse.ColorPickerPopup.a().c(var1, var2);
      }

      int var4 = -341006764;
      int var3 = 1859098013;
      int var10000 = (var3 | var4) - (var3 & var4);
      var4 = -2057096247;
      var3 = var10000;
      return pulse.Bool.from((var3 | var4) & (var3 ^ -1 | var4 ^ -1));
   }

   public float[] t() {
      return this.z ? pulse.ColorPickerPopup.a().f() : null;
   }

   private void a(MatrixStack var1, ItemStack var2, float var3, float var4, float var5, float var6, MinecraftClient var7) {
      if (var7.player != null && !var2.isEmpty()) {
         String var10001 = "eyk";
         if (!(var6 < 0.01F)) {
            DrawContext var8 = new DrawContext(var7, var7.getBufferBuilders().getEntityVertexConsumers());
            MatrixStack var9 = var8.getMatrices();
            var10001 = "eyl";
            float var10 = var5 / 16.0F;
            var9.push();
            var9.translate(var3, var4, 0.0F);
            var9.scale(var10, var10, 1.0F);
            RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, var6);
            int var10002 = (int)-7341733357722698296L;
            int var12 = 931487605;
            int var11 = var10002;
            var10002 = var11 + var12 - 2 * (var11 & var12);
            var12 = -20438339;
            var11 = var10002;
            var10002 = (var11 | var12) & (~var11 | ~var12);
            var12 = 367311128;
            var11 = 1569403303;
            int var10003 = var11 & ~var12 | ~var11 & var12;
            var12 = 1215269055;
            var11 = var10003;
            var8.drawItem(var2, var10002, var11 + var12 - 2 * (var11 & var12));
            RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
            var9.pop();
            return;
         }
      }
   }

   @Override
   public boolean d() {
      int var10;
      if (this.q != null && !this.q.m()) {
         int var7 = 309632184;
         int var4 = -72279207;
         var10 = (var4 | var7) - (var4 & var7);
         var7 = -372930591;
         var4 = var10;
         var10 = (var4 | var7) - (var4 & var7);
      } else {
         var10 = (int)-8314231714837242783L;
         int var2 = 1674021812;
         int var1 = var10;
         var10 = var1 + var2 - 2 * (var1 & var2);
         var2 = 990992340;
         var1 = var10;
         var10 = (var1 | var2) & (~var1 | ~var2);
      }

      return pulse.Bool.from(var10);
   }

   public static String a(String var0, String var1, int var2, int var3, int var4, int var5) {
      char[] var6 = var1.toCharArray();
      char[] var7 = new char[var6.length];
      int var10000 = (int)6308200581095539556L;
      int var18 = 439945567;
      int var17 = var10000;
      var10000 = (var17 | var18) & ~(var17 & var18);
      var18 = -2111452623;
      var17 = var10000;
      char[] var232 = new char[(var17 | var18) & ~(var17 & var18)];
      var18 = -356455697;
      var17 = 901275403;
      int var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -545737244;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 1129448780;
      var17 = 1593718117;
      int var10003 = (var17 | var18) - (var17 & var18);
      var18 = 497842203;
      var17 = var10003;
      var232[var10002] = (char)((var17 | var18) - (var17 & var18));
      var10002 = (int)1241261863486289436L;
      var18 = 1194971516;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -647026847;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 1535962360;
      var17 = -199775694;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -1348770481;
      var17 = var10003;
      var232[var10002] = (char)((var17 | var18) - (var17 & var18));
      var18 = -1218686528;
      var17 = -2056020433;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 841994221;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 821492723;
      var17 = 856409687;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 66919970;
      var17 = var10003;
      var232[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var10002 = (int)-1357019734604542866L;
      var18 = 607044767;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -1717745422;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var10003 = (int)4800757800220578626L;
      var18 = -1822591961;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1483755533;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -1604396492;
      var17 = -1762874626;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 917694681;
      var17 = var10003;
      var232[var10002] = (char)((var17 | var18) - (var17 & var18));
      var18 = -1185750740;
      var17 = -1452305561;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 272462415;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      String var300 = "eym";
      var18 = -1023608435;
      var17 = 1231829386;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -1953476318;
      var17 = var10003;
      var232[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var10002 = (int)-2228000785035337293L;
      var18 = 241354042;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 651142284;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var10003 = (int)-8233044279080837950L;
      var18 = -1502985015;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -482796151;
      var17 = var10003;
      var232[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var10002 = (int)2018478429701387247L;
      var18 = -661073971;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 633044004;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -1549749054;
      var17 = 1035491657;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -1642535784;
      var17 = var10003;
      var232[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var18 = 399335579;
      var17 = -612034992;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -867666228;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -1137466127;
      var17 = 1034362112;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -2120970797;
      var17 = var10003;
      var232[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var18 = -839335966;
      var17 = 1812304881;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1577243621;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -722109605;
      var17 = 1921234872;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -1502165840;
      var17 = var10003;
      var232[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var18 = 128505477;
      var17 = -904550727;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -843222987;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 1066273427;
      var17 = -1471211076;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1748954101;
      var17 = var10003;
      var232[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      char[] var8 = var232;
      var10000 = (int)8469688421430874798L;
      var18 = 85260;
      var17 = var10000;
      var10000 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1247731800;
      var17 = var10000;
      char[] var235 = new char[(var17 | var18) - (var17 & var18)];
      var18 = -1207493737;
      var17 = -1576937514;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 436653121;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)-1120048530837154191L;
      var18 = 733130866;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -1879953885;
      var17 = var10003;
      var235[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var18 = -575291113;
      var17 = 1667404388;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -1093184654;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -377812238;
      var17 = -153325683;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -1889198061;
      var17 = var10003;
      var10003 = ((var17 | var18) - (var17 & var18)) * ((var17 | var18) - (var17 & var18));
      var18 = 584731465;
      var17 = 324768232;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 830561954;
      var17 = var10003;
      var235[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var10002 = (int)8391699608372916276L;
      var18 = 1289920480;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 1714991062;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      String var313 = "eyn";
      var10003 = (int)-3935968048210331706L;
      var18 = 88359350;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -362385117;
      var17 = var10003;
      var235[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var10002 = (int)-6459812926687863643L;
      var18 = 1194259440;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 577105750;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -1008645197;
      var17 = -1396042703;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1865115520;
      var17 = var10003;
      var235[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var10002 = (int)7013372829267938667L;
      var18 = -696597778;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -744583295;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -1432399788;
      var17 = 1392938088;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -107355012;
      var17 = var10003;
      var235[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var18 = -1331098879;
      var17 = 1521838018;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -367235898;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -787049198;
      var17 = -1038990279;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 319089087;
      var17 = var10003;
      var235[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var18 = -182239459;
      var17 = -126227759;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 224056778;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var10003 = (int)-2666388688222963023L;
      var18 = 1275407384;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1199025462;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)8480618066952863822L;
      var18 = 1981759666;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 1784907717;
      var17 = var10003;
      var235[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var10002 = (int)3073784026910450072L;
      var18 = -298966116;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -1637203453;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)886525283770181374L;
      var18 = -1815049917;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -61423739;
      var17 = var10003;
      var235[var10002] = (char)((var17 | var18) - (var17 & var18));
      var10002 = (int)2722553826488972429L;
      var18 = 388013085;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -622729064;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      String var326 = "eyo";
      var10003 = (int)7549946152093525980L;
      var18 = 1704167674;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 1095740450;
      var17 = var10003;
      var235[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var18 = 1816851002;
      var17 = 28135863;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 1843897220;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)-7677753648075360161L;
      var18 = 136445315;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 1168373487;
      var17 = var10003;
      var235[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      char[] var9 = var235;
      var10000 = (int)234424788887120950L;
      var18 = 1442880413;
      var17 = var10000;
      var10000 = (var17 | var18) & ~(var17 & var18);
      var18 = 707344299;
      var17 = var10000;

      for (int var10 = var17 + var18 - 2 * (var17 & var18); var10 < var6.length; var10++) {
         char var290 = var6[var10];
         char var217 = var8[var10 % var8.length];
         char var112 = var290;
         var7[var10] = (char)((var112 | var217) - (var112 & var217));
      }

      char[] var19 = new char[var7.length];
      var18 = 1600569077;
      var17 = -446565410;
      var10000 = var17 & ~var18 | ~var17 & var18;
      var18 = -1173926613;
      var17 = var10000;

      for (int var11 = (var17 | var18) & ~(var17 & var18); var11 < var6.length; var11++) {
         char var291 = var7[var11];
         char var220 = var9[var11 % var9.length];
         char var115 = var291;
         var19[var11] = (char)(var115 + var220 - 2 * (var115 & var220));
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
      var10000 = (int)3017053974906350169L;
      var18 = -2089612662;
      var17 = var10000;
      var10000 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1762271443;
      var17 = var10000;

      for (int var16 = (var17 | var18) - (var17 & var18); var16 < var15.length; var16++) {
         var18 = -1873560044;
         var17 = 1847463154;
         int var10001 = (var17 | var18) & (~var17 | ~var18);
         var18 = -28462364;
         var17 = var10001;
         switch (var16 % ((var17 | var18) - (var17 & var18))) {
            case 0:
               var18 = var12;
               var17 = var13;
               var10002 = var17 & ~var18 | ~var17 & var18;
               char var230 = var14[var16];
               var17 = var10002;
               var15[var16] = (char)((var17 | var230) - (var17 & var230));
               break;
            case 1:
               var18 = var13;
               var17 = var5;
               var10002 = (var17 | var18) & (~var17 | ~var18);
               char var228 = var14[var16];
               var17 = var10002;
               var15[var16] = (char)(var17 & ~var228 | ~var17 & var228);
         }
      }

      return new String(var15);
   }
}
