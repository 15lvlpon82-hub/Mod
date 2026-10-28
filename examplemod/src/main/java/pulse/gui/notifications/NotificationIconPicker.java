package pulse;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import net.minecraft.client.util.math.MatrixStack;

public class NotificationIconPicker {
   private static final float c = 43.25F;
   private static final float d = 22.0F;
   private static final float e = 12.0F;
   private static final float f = 5.0F;
   private static final float g = 9.5F;
   private static final int h = 5;
   private static final Color i = pulse.Theme.I;
   private static final Color j = pulse.Theme.J;
   private static final Color k = pulse.Theme.N;
   private final Notification.Icon[] l;
   private Notification.Icon m;
   private final Map<Notification.Icon, AnimationState> n = new HashMap<>();
   private final Map<Notification.Icon, AnimationState> o = new HashMap<>();
   private final Map<Notification.Icon, Boolean> p = new HashMap<>();
   private Consumer<Notification.Icon> q;
   private Color r = pulse.Theme.y;
   public static int a;
   public static boolean b;

   public NotificationIconPicker() {
      this.l = Notification.Icon.values();
      this.m = Notification.Icon.DEATH;
      Notification.Icon[] var1 = this.l;
      int var2 = var1.length;
      int var10000 = (int)-7602601644670891996L;
      int var6 = 1489548314;
      int var5 = var10000;
      var10000 = var5 & ~var6 | ~var5 & var6;
      var6 = -127927234;
      var5 = var10000;

      for (int var3 = (var5 | var6) - (var5 & var6); var3 < var2; var3++) {
         Notification.Icon var4 = var1[var3];
         this.n.put(var4, new AnimationState());
         this.o.put(var4, new AnimationState());
         int var10002 = (int)-1622289378301429659L;
         var6 = 1006429907;
         var5 = var10002;
         var10002 = var5 + var6 - 2 * (var5 & var6);
         var6 = -527901002;
         var5 = var10002;
         this.p.put(var4, Boolean.valueOf(pulse.Bool.from((var5 | var6) - (var5 & var6))));
         if (var4 == this.m) {
            this.o.get(var4).d(1.0);
         }
      }
   }

   public void a(Notification.Icon var1) {
      if (this.m != var1) {
         if (this.m != null) {
            AnimationState var10000 = this.o.get(this.m);
            int var10002 = (int)-8599219804470974455L;
            int var3 = -515476142;
            int var2 = var10002;
            var10002 = (var2 | var3) & (~var2 | ~var3);
            var3 = 1937128055;
            var2 = var10002;
            var10002 = ((var2 | var3) - (var2 & var3)) * ((var2 | var3) - (var2 & var3));
            var10000.a(0.0, 0.2, pulse.Easing.h);
         }

         this.m = var1;
         AnimationState var6 = this.o.get(var1);
         String var9 = "blj";
         var6.a(1.0, 0.2, pulse.Easing.h);
      }
   }

   public Notification.Icon a() {
      return this.m;
   }

   public void a(Color var1) {
      this.r = var1;
   }

   public void a(Consumer<Notification.Icon> var1) {
      this.q = var1;
   }

   public void a(MatrixStack var1, Renderer2D var2, float var3, float var4, float var5, int var6, int var7, float var8) {
      int var10000 = (int)-1806524822065209498L;
      int var37 = 1779415771;
      int var36 = var10000;
      var10000 = (var36 | var37) - (var36 & var37);
      var37 = -1291398599;
      var36 = var10000;
      var10000 = (var36 | var37) & ~(var36 & var37);
      int var9 = (int)(255.0F * var8);
      boolean var10 = GuiInteractionState.a().b();
      var37 = -1648820781;
      var36 = 522415105;
      var10000 = (var36 | var37) & ~(var36 & var37);
      var37 = -2103733806;
      var36 = var10000;

      for (int var11 = (var36 | var37) & (~var36 | ~var37); var11 < this.l.length; var11++) {
         Notification.Icon var12 = this.l[var11];
         var37 = -1268414778;
         var36 = 1926322784;
         int var10001 = (var36 | var37) & ~(var36 & var37);
         var37 = -961225565;
         var36 = var10001;
         int var13 = var11 % (var36 + var37 - 2 * (var36 & var37));
         var37 = -1190118502;
         var36 = -1318811498;
         var10001 = (var36 | var37) & ~(var36 & var37);
         var37 = 141865737;
         var36 = var10001;
         int var14 = var11 / ((var36 | var37) & (~var36 | ~var37));
         float var269 = var13;
         String var10002 = "blk";
         float var15 = var3 + var269 * 48.25F;
         float var270 = var14;
         int var10003 = (int)4097667540046169722L;
         var37 = 2060410183;
         var36 = var10003;
         var10003 = var36 & ~var37 | ~var36 & var37;
         var37 = -1361667281;
         var36 = var10003;
         var10003 = (var36 | var37) & (~var36 | ~var37);
         var37 = -1239786722;
         var36 = 1281858838;
         var10003 = (var36 | var37) & (~var36 | ~var37);
         var37 = -92420584;
         var36 = var10003;
         var10003 = (var36 | var37) - (var36 & var37);
         float var16 = var4 + var270 * 27.0F;
         if (var12 != this.m) {
            var37 = 576604785;
            var36 = 715503777;
            var10000 = (var36 | var37) & (~var36 | ~var37);
            var37 = 150729424;
            var36 = var10000;
            var10000 = var36 + var37 - 2 * (var36 & var37);
         } else {
            var37 = -223982752;
            var36 = -156363210;
            var10000 = var36 + var37 - 2 * (var36 & var37);
            var37 = 67657047;
            var36 = var10000;
            var10000 = (var36 | var37) - (var36 & var37);
         }

         label77: {
            if (var10) {
               if (a != a) {
                  var37 = 1710053197;
                  var36 = 1192683010;
                  var10001 = var36 & ~var37 | ~var36 & var37;
                  var37 = 586920286;
                  var36 = var10001;
                  var10001 = var36 + var37 - 2 * (var36 & var37);
                  var37 = -718084873;
                  var36 = -1454213196;
                  var10001 = var36 & ~var37 | ~var36 & var37;
                  var37 = 2086703939;
                  var36 = var10001;
                  var10001 = var36 & ~var37 | ~var36 & var37;
                  var10001 = (int)7757501768046000088L;
                  var37 = -1537393200;
                  var36 = var10001;
                  var10001 = (var36 | var37) & (~var36 | ~var37);
                  var37 = 1753582089;
                  var36 = var10001;
                  var10001 = (var36 | var37) & (~var36 | ~var37);
                  var10001 = (int)672152546042071349L;
                  var37 = 1148957653;
                  var36 = var10001;
                  var10001 = var36 & ~var37 | ~var36 & var37;
                  var37 = -1446118672;
                  var36 = var10001;
                  var10001 = (var36 | var37) - (var36 & var37);
                  var37 = 739705985;
                  var36 = 40992615;
                  var10000 = (var36 | var37) - (var36 & var37);
                  var37 = 855640773;
                  var36 = var10000;
                  int var35 = (var36 | var37) - (var36 & var37);
                  a = var35;
               }
            } else {
               var37 = -685492223;
               var36 = -362769554;
               int var305 = (var36 | var37) & ~(var36 & var37);
               var37 = -171367573;
               var36 = var305;
               int var306 = (var36 | var37) & ~(var36 & var37);
               int var10004 = (int)-7123330626154763861L;
               var37 = -1369327327;
               var36 = var10004;
               var10004 = var36 + var37 - 2 * (var36 & var37);
               var37 = -201076605;
               var36 = var10004;
               var10004 = var36 & ~var37 | ~var36 & var37;
               var37 = -337596093;
               var36 = 1516861359;
               var10004 = (var36 | var37) & (~var36 | ~var37);
               var37 = -1316370709;
               var36 = var10004;
               var10004 = var36 + var37 - 2 * (var36 & var37);
               if (GuiInput.a(var15, var16, 43.25F, 22.0F, var6, var7)) {
                  var10000 = (int)-1325430984412709051L;
                  var37 = 1639791569;
                  var36 = var10000;
                  var10000 = var36 & ~var37 | ~var36 & var37;
                  var37 = -1502247787;
                  var36 = var10000;
                  var10000 = var36 + var37 - 2 * (var36 & var37);
                  break label77;
               }

               var10000 = (int)-8615462775806267228L;
               var37 = 2147124475;
               var36 = var10000;
               var10000 = (var36 | var37) & (~var36 | ~var37);
               var37 = 1181957480;
               var36 = var10000;
               var10000 = var36 + var37 - 2 * (var36 & var37);
               var10000 = (int)6649911849057774818L;
               var37 = 1312578246;
               var36 = var10000;
               var10000 = var36 & ~var37 | ~var36 & var37;
               var37 = 1705739828;
               var36 = var10000;
               int var45 = var36 & ~var37 | ~var36 & var37;
               a = var45;
               var10000 = (int)-717966890285365341L;
               var37 = 27506064;
               var36 = var10000;
               var10000 = var36 & ~var37 | ~var36 & var37;
               var37 = -1468092472;
               var36 = var10000;
               var10000 = (var36 + var37 - 2 * (var36 & var37)) * (var36 + var37 - 2 * (var36 & var37));
               var10000 = (int)857057314842168511L;
               var37 = 551675961;
               var36 = var10000;
               var10000 = (var36 | var37) & ~(var36 & var37);
               var37 = 1208055541;
               var36 = var10000;
               if (((var36 | var37) & ~(var36 & var37)) < a) {
                  throw new ExceptionInInitializerError();
               }
            }

            var37 = -1460086530;
            var36 = -1926676144;
            var10000 = (var36 | var37) & ~(var36 & var37);
            var37 = 634493358;
            var36 = var10000;
            var10000 = (var36 | var37) & ~(var36 & var37);
         }

         int var18;
         label71: {
            var18 = var10000;
            if (var10) {
               if (this.p.get(var12)) {
                  AnimationState var267 = this.n.get(var12);
                  int var307 = (int)-3383555410775998677L;
                  var37 = -192241993;
                  var36 = var307;
                  int var308 = (var36 | var37) & (~var36 | ~var37);
                  var37 = -1389455841;
                  var36 = var308;
                  int var309 = (var36 | var37) & ~(var36 & var37);
                  var267.a(0.0, 0.15, pulse.Easing.h);
                  var37 = -1027082370;
                  var36 = 85561544;
                  int var310 = (var36 | var37) & ~(var36 & var37);
                  var37 = -941725770;
                  var36 = var310;
                  this.p.put(var12, Boolean.valueOf(pulse.Bool.from((var36 | var37) & (var36 & var37 ^ -1))));
                  break label71;
               }

               var37 = 684337167;
               var36 = 1191611126;
               var10001 = (var36 | var37) & (~var36 | ~var37);
               var37 = 1875682045;
               var36 = var10001;
               var10001 = (var36 | var37) - (var36 & var37);
               var37 = 1132877593;
               var36 = 1096347731;
               var10001 = (var36 | var37) & (~var36 | ~var37);
               var37 = 48146267;
               var36 = var10001;
               var10001 = (var36 | var37) & ~(var36 & var37);
               var10001 = (int)2816873883219941190L;
               var37 = 1536954920;
               var36 = var10001;
               var10001 = var36 & ~var37 | ~var36 & var37;
               var37 = 167396735;
               var36 = var10001;
               var10001 = (var36 | var37) & ~(var36 & var37);
               var37 = 1959628076;
               var36 = 1956281779;
               var10000 = (var36 | var37) - (var36 & var37);
               var37 = 1000332548;
               var36 = var10000;
               int var46 = var36 & ~var37 | ~var36 & var37;
               String var263 = "bll";
               var37 = -991658419;
               var36 = -394382262;
               var10000 = (var36 | var37) & (~var36 | ~var37);
               var37 = 1070570099;
               var36 = var10000;
               if ((var36 & ~var37 | ~var36 & var37) >= var46) {
                  var37 = 667950779;
                  var36 = 599022647;
                  var10001 = (var36 | var37) & (~var36 | ~var37);
                  var37 = 73679501;
                  var36 = var10001;
                  var10001 = (var36 | var37) & ~(var36 & var37);
                  var37 = -1126944826;
                  var36 = -1505437591;
                  var10000 = var36 + var37 - 2 * (var36 & var37);
                  var37 = -2016794402;
                  var36 = var10000;
                  var46 = var36 + var37 - 2 * (var36 & var37);
                  a = var46;
               }
            }

            if (!var10 && pulse.Bool.from(var18) != this.p.get(var12)) {
               AnimationState var266 = this.n.get(var12);
               double var290 = var18 == 0 ? 0.0 : 1.0;
               var10003 = (int)7353697763705663541L;
               var37 = -1144977620;
               var36 = var10003;
               var10003 = var36 + var37 - 2 * (var36 & var37);
               var37 = 881047317;
               var36 = var10003;
               var10003 = (var36 | var37) & (~var36 | ~var37);
               var37 = 1023750742;
               var36 = -1369171640;
               var10003 = (var36 | var37) - (var36 & var37);
               var37 = -1822348528;
               var36 = var10003;
               var10003 = var36 & ~var37 | ~var36 & var37;
               var266.a(var290, 0.15, pulse.Easing.h);
               this.p.put(var12, Boolean.valueOf(pulse.Bool.from(var18)));
            }
         }

         this.n.get(var12).a();
         this.o.get(var12).a();
         float var19 = (float)this.n.get(var12).j();
         float var20 = (float)this.o.get(var12).j();
         Color var25 = pulse.Theme.q;
         Color var26 = pulse.Theme.n;
         Color var27 = pulse.Theme.f;
         Color var28 = pulse.Theme.e;
         var37 = -49464170;
         var36 = -1764001164;
         var10001 = (var36 | var37) - (var36 & var37);
         var37 = 1286101295;
         var36 = var10001;
         var10001 = (var36 | var37) & (~var36 | ~var37);
         int var311 = (int)-8605874149151895420L;
         var37 = 725826644;
         var36 = var311;
         int var312 = (var36 | var37) - (var36 & var37);
         var37 = -1207155510;
         var36 = var312;
         var37 = (var36 | var37) - (var36 & var37);
         var36 = var10001;
         var10001 = var36 - ~var37 - 1;
         Color var21;
         Color var22;
         Color var23;
         Color var24;
         if (!(var20 > 0.01F)) {
            var23 = ColorUtils.a(var27, i, var19);
            var24 = ColorUtils.a(var28, j, var19);
            var21 = var25;
            var22 = var26;
         } else {
            Color var29 = this.r;
            var37 = -771547745;
            var36 = -1517269056;
            var10001 = var36 + var37 - 2 * (var36 & var37);
            var37 = 2006143689;
            var36 = var10001;
            Color var30 = pulse.Theme.c(var29, (var36 | var37) - (var36 & var37));
            var23 = ColorUtils.a(ColorUtils.a(var27, i, var19), var29, var20);
            var24 = ColorUtils.a(ColorUtils.a(var28, j, var19), var30, var20);
            var21 = ColorUtils.a(var25, var29, var20);
            var22 = ColorUtils.a(var26, var30, var20);
         }

         var21 = pulse.Theme.b(var21, var8);
         var22 = pulse.Theme.b(var22, var8);
         var23 = pulse.Theme.a(var23, var9);
         var24 = pulse.Theme.a(var24, var9);
         int var313 = (int)4119079676603707114L;
         var37 = 170700416;
         var36 = var313;
         int var314 = (var36 | var37) - (var36 & var37);
         var37 = -1850564214;
         var36 = var314;
         int var315 = (var36 | var37) & (~var36 | ~var37);
         float var295 = var15 - 0.5F;
         String var326 = "blm";
         float var316 = var16 - 0.5F;
         var10003 = (int)-6241690373859740359L;
         var37 = 177901914;
         var36 = var10003;
         var10003 = var36 & ~var37 | ~var36 & var37;
         var37 = 653444425;
         var36 = var10003;
         var10003 = (var36 | var37) & ~(var36 & var37);
         String var338 = "bln";
         int var10005 = (int)-2757117844007639736L;
         var37 = 1573786714;
         var36 = var10005;
         var10005 = (var36 | var37) - (var36 & var37);
         var37 = 1999065775;
         var36 = var10005;
         var10005 = (var36 | var37) - (var36 & var37);
         int var10006 = (int)5868117776631195091L;
         var37 = 1334935853;
         var36 = var10006;
         var10006 = (var36 | var37) & ~(var36 & var37);
         var37 = -965157156;
         var36 = var10006;
         var37 = (var36 | var37) & ~(var36 & var37);
         var36 = var10005;
         var10005 = 2 * (var36 | var37) - (var36 ^ var37);
         var2.a(var295, var316, 44.25F, 23.0F, 9.5F, var21, var21, var22, var22, var1);
         var10003 = (int)362924934311870689L;
         var37 = 1472028246;
         var36 = var10003;
         var10003 = (var36 | var37) & ~(var36 & var37);
         var37 = -78917444;
         var36 = var10003;
         var10003 = (var36 | var37) - (var36 & var37);
         int var339 = (int)-2473042909504108045L;
         var37 = -1878367106;
         var36 = var339;
         int var340 = (var36 | var37) - (var36 & var37);
         var37 = 1092755904;
         var36 = var340;
         var37 = var36 + var37 - 2 * (var36 & var37);
         var36 = var10003;
         var10003 = var36 - ~var37 - 1;
         int var341 = (int)3939487131331488302L;
         var37 = -309015406;
         var36 = var341;
         int var342 = var36 & ~var37 | ~var36 & var37;
         var37 = 1018392221;
         var36 = var342;
         int var343 = (var36 | var37) & ~(var36 & var37);
         var10005 = (int)-8052971235158355082L;
         var37 = -122878063;
         var36 = var10005;
         var10005 = var36 & ~var37 | ~var36 & var37;
         var37 = 1469034964;
         var36 = var10005;
         var10005 = (var36 | var37) & ~(var36 & var37);
         var2.a(var15, var16, 43.25F, 22.0F, 9.5F, var23, var23, var24, var24, var1);
         var10001 = (int)-7127030243428312083L;
         var37 = 1135729418;
         var36 = var10001;
         var10001 = (var36 | var37) - (var36 & var37);
         var37 = 1464631537;
         var36 = var10001;
         FontRenderer var42 = FontManager.e[var36 + var37 - 2 * (var36 & var37)];
         String var43 = var12.b();
         String var298 = "blo";
         float var31 = var15 + 15.625F;
         var10001 = (int)7877853753968227062L;
         var37 = -1924105866;
         var36 = var10001;
         var10001 = (var36 | var37) & (~var36 | ~var37);
         var37 = -858060872;
         var36 = var10001;
         var10001 = (var36 | var37) & ~(var36 & var37);
         float var32 = var16 + 5.0F;
         var10001 = (int)2860433901614569778L;
         var37 = 947956548;
         var36 = var10001;
         var10001 = (var36 | var37) & ~(var36 & var37);
         var37 = 1052813304;
         var36 = var10001;
         var10001 = (var36 + var37 - 2 * (var36 & var37)) * (var36 + var37 - 2 * (var36 & var37));
         Color var33;
         if (!(var20 > 0.01F)) {
            var33 = ColorUtils.a(pulse.Theme.b, k, var19);
         } else {
            var33 = ColorUtils.a(ColorUtils.a(pulse.Theme.b, k, var19), pulse.Theme.aa, var20);
         }

         var33 = pulse.Theme.a(var33, var9);
         var42.a(var43, var31, var32, var33, var1);
         if (var18 != 0 && !var10) {
            GuiInput.g();
         }
      }
   }

   public boolean a(float var1, float var2, int var3, int var4) {
      int var12 = 336014483;
      int var11 = 510625723;
      int var10000 = (var11 | var12) & (~var11 | ~var12);
      var12 = 174631720;
      var11 = var10000;

      for (int var5 = (var11 | var12) & ~(var11 & var12); var5 < this.l.length; var5++) {
         Notification.Icon var6 = this.l[var5];
         var12 = 1315310626;
         var11 = -1075138006;
         int var10001 = (var11 | var12) & (~var11 | ~var12);
         var12 = -242434547;
         var11 = var10001;
         int var7 = var5 % ((var11 | var12) - (var11 & var12));
         var10001 = (int)-8852129852948350890L;
         var12 = -1115844516;
         var11 = var10001;
         var10001 = (var11 | var12) & (~var11 | ~var12);
         var12 = 471623695;
         var11 = var10001;
         int var8 = var5 / (var11 + var12 - 2 * (var11 & var12));
         float var52 = var7;
         int var10003 = (int)8645377185903478941L;
         var12 = 588745911;
         var11 = var10003;
         var10003 = var11 & ~var12 | ~var11 & var12;
         var12 = -266566612;
         var11 = var10003;
         var10003 = (var11 | var12) & ~(var11 & var12);
         var12 = 1208093853;
         var11 = 367735827;
         var10003 = (var11 | var12) & ~(var11 & var12);
         var12 = 1575565453;
         var11 = var10003;
         var10003 = var11 + var12 - 2 * (var11 & var12);
         float var9 = var1 + var52 * 48.25F;
         float var53 = var8;
         int var10002 = (int)-3024177740196309808L;
         var12 = -1517246739;
         var11 = var10002;
         var10002 = (var11 | var12) & ~(var11 & var12);
         var12 = 1894691630;
         var11 = var10002;
         var10002 = (var11 + var12 - 2 * (var11 & var12)) * (var11 + var12 - 2 * (var11 & var12));
         float var10 = var2 + var53 * 27.0F;
         String var56 = "blp";
         int var10004 = (int)8071751276305206564L;
         var12 = 702137366;
         var11 = var10004;
         var10004 = (var11 | var12) & ~(var11 & var12);
         var12 = 983796022;
         var11 = var10004;
         var10004 = var11 + var12 - 2 * (var11 & var12);
         if (GuiInput.a(var9, var10, 43.25F, 22.0F, var3, var4)) {
            this.a(var6);
            if (this.q != null) {
               this.q.accept(var6);
            }

            var12 = 1580382533;
            var11 = 1519484526;
            var10000 = (var11 | var12) & ~(var11 & var12);
            var12 = 77842218;
            var11 = var10000;
            return pulse.Bool.from(var11 + var12 - 2 * (var11 & var12));
         }
      }

      var10000 = (int)-377986943792638780L;
      var12 = -495677752;
      var11 = var10000;
      var10000 = var11 + var12 - 2 * (var11 & var12);
      var12 = 2012584460;
      var11 = var10000;
      return pulse.Bool.from((var11 | var12) - (var11 & var12));
   }

   public float b() {
      double var10000 = this.l.length;
      int var3 = 1827034829;
      int var2 = 753913671;
      int var10001 = (var2 | var3) - (var2 & var3);
      var3 = -1885995235;
      var2 = var10001;
      var10001 = var2 + var3 - 2 * (var2 & var3);
      var3 = 683228149;
      var2 = 223316441;
      int var10002 = (var2 | var3) & (~var2 | ~var3);
      var3 = -1268643638;
      var2 = var10002;
      var3 = var2 & ~var3 | ~var2 & var3;
      var2 = var10001;
      var10001 = (var2 & ~var3) + (var3 & ~var2) + 2 * (var2 & var3);
      int var1 = (int)Math.ceil(var10000 / 5.0);
      float var22 = var1;
      var10001 = (int)1445791750867627999L;
      var3 = -761774262;
      var2 = var10001;
      var10001 = (var2 | var3) - (var2 & var3);
      var3 = 490230926;
      var2 = var10001;
      var10001 = (var2 | var3) & (~var2 | ~var3);
      float var23 = var22 * 22.0F;
      var3 = 1191909717;
      var2 = 1310313164;
      var10002 = var2 + var3 - 2 * (var2 & var3);
      var3 = 152228760;
      var2 = var10002;
      var3 = (var2 | var3) & ~(var2 & var3);
      var2 = var1;
      float var29 = (var2 & ~var3) - (~var2 & var3);
      String var31 = "blq";
      return var23 + var29 * 5.0F;
   }

   public static float c() {
      String var10000 = "blr";
      return 43.25F;
   }

   public static float d() {
      String var10000 = "bls";
      return 22.0F;
   }

   public static float e() {
      int var10001 = (int)3144455787704765707L;
      int var1 = 969111712;
      int var0 = var10001;
      var10001 = var0 + var1 - 2 * (var0 & var1);
      var1 = -942459482;
      var0 = var10001;
      var10001 = var0 & ~var1 | ~var0 & var1;
      var10001 = (int)3653734368854860470L;
      var1 = -563730065;
      var0 = var10001;
      var10001 = var0 & ~var1 | ~var0 & var1;
      var1 = 157076440;
      var0 = var10001;
      var10001 = (var0 | var1) & ~(var0 & var1);
      return 5.0F;
   }

   public static String a(String var0, String var1, int var2, int var3, int var4, int var5) {
      char[] var6 = var1.toCharArray();
      char[] var7 = new char[var6.length];
      int var10000 = (int)-5440165624407892715L;
      int var18 = 1980385317;
      int var17 = var10000;
      var10000 = var17 & ~var18 | ~var17 & var18;
      var18 = 1676285242;
      var17 = var10000;
      char[] var228 = new char[(var17 | var18) & (~var17 | ~var18)];
      int var10002 = (int)6584034737739397385L;
      var18 = -686013708;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 81116157;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -22387972;
      var17 = -228388166;
      int var10003 = (var17 | var18) - (var17 & var18);
      var18 = 214513780;
      var17 = var10003;
      var228[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var10002 = (int)-9031869776593904175L;
      var18 = -37944509;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 2033557139;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)-1882616453658476531L;
      var18 = -539074743;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -2000683839;
      var17 = var10003;
      var228[var10002] = (char)((var17 | var18) - (var17 & var18));
      var18 = 1238087413;
      var17 = 156386703;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 1083831160;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var10003 = (int)-8918730225265089181L;
      var18 = 834320062;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 573730907;
      var17 = var10003;
      var228[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var10002 = (int)3495387310171483853L;
      var18 = 785711271;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 301526633;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      String var294 = "blt";
      var18 = 498028361;
      var17 = -924207002;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -716804292;
      var17 = var10003;
      var228[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var18 = 1995573428;
      var17 = -573041365;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -1423303269;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      String var296 = "blu";
      var18 = -1376842827;
      var17 = 1229754461;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -459076915;
      var17 = var10003;
      var228[var10002] = (char)((var17 | var18) - (var17 & var18));
      var10002 = (int)-6018149919121796106L;
      var18 = 277281774;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1456084963;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)-7681339427546902436L;
      var18 = -313437144;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 411845110;
      var17 = var10003;
      var228[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var18 = 58406116;
      var17 = -1410366683;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -1466648633;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var10003 = (int)-7278409587877650806L;
      var18 = -817556093;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 797196826;
      var17 = var10003;
      var228[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var18 = -291385812;
      var17 = -334017879;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 45515906;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1897285778;
      var17 = 1175727410;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -922898818;
      var17 = var10003;
      var228[var10002] = (char)((var17 | var18) - (var17 & var18));
      var10002 = (int)4172477839452231536L;
      var18 = -1618771643;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1648285245;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -1542017307;
      var17 = -998421882;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 1617685552;
      var17 = var10003;
      var228[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var10002 = (int)-5385556344335976845L;
      var18 = 1312637005;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -1539443145;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 26909290;
      var17 = 1786178463;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1810659025;
      var17 = var10003;
      var228[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      char[] var8 = var228;
      var18 = 489063527;
      var17 = -1367261995;
      var10000 = (var17 | var18) & ~(var17 & var18);
      var18 = -1280853832;
      var17 = var10000;
      char[] var230 = new char[(var17 | var18) & (~var17 | ~var18)];
      var10002 = (int)-2598546931968880811L;
      var18 = -1483814041;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -463567822;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -2021767374;
      var17 = 234584590;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1970965220;
      var17 = var10003;
      var230[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var10002 = (int)-5010242189771414693L;
      var18 = -155564087;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -515529581;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      int var10004 = (int)4749886793100593122L;
      var18 = 1835108283;
      var17 = var10004;
      var10004 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1064632407;
      var17 = var10004;
      var10004 = var17 + var18 - 2 * (var17 & var18);
      var10004 = (int)5640335824882963493L;
      var18 = 1850142445;
      var17 = var10004;
      var10004 = var17 & ~var18 | ~var17 & var18;
      var18 = -431359296;
      var17 = var10004;
      var10004 = (var17 | var18) & ~(var17 & var18);
      var10003 = (int)7082020631089846689L;
      var18 = 1802738040;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -2090203942;
      var17 = var10003;
      var230[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var18 = 1721333024;
      var17 = -537918499;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -1184270593;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      String var308 = "blv";
      var10003 = (int)192292461869880027L;
      var18 = 1673955849;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -914661503;
      var17 = var10003;
      var230[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var18 = -1874153047;
      var17 = 431768636;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -1980303978;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)-6757705528847162586L;
      var18 = 721607315;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 861782455;
      var17 = var10003;
      var230[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var18 = -173741911;
      var17 = -69092468;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 239424289;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)5924584420620498532L;
      var18 = 1189170564;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1308918688;
      var17 = var10003;
      var230[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var10002 = (int)9091484346614720077L;
      var18 = 1127099684;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 1943047020;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)-6570571793584454388L;
      var18 = 2063363430;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 1523503358;
      var17 = var10003;
      var230[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var18 = 2496694;
      var17 = 910048030;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 907551662;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      String var317 = "blw";
      var18 = 796171839;
      var17 = 1109020651;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 1835947757;
      var17 = var10003;
      var230[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var18 = -66768256;
      var17 = 1499955539;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -1520258092;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)-7527198519029828832L;
      var18 = -1506435214;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 1096088682;
      var17 = var10003;
      var230[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var10002 = (int)746148667586176479L;
      var18 = -778563722;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 1484974753;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      String var321 = "blx";
      var18 = -969604527;
      var17 = 1342789066;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1774398305;
      var17 = var10003;
      var230[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var10002 = (int)-5580662200366445513L;
      var18 = 1312777500;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -1853216478;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)508773145093074485L;
      var18 = -2125941442;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 1506764856;
      var17 = var10003;
      var230[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      char[] var9 = var230;
      var18 = -210240262;
      var17 = -130656837;
      var10000 = (var17 | var18) - (var17 & var18);
      var18 = 188852545;
      var17 = var10000;

      for (int var10 = var17 & ~var18 | ~var17 & var18; var10 < var6.length; var10++) {
         char var286 = var6[var10];
         char var213 = var8[var10 % var8.length];
         char var110 = var286;
         var7[var10] = (char)(var110 + var213 - 2 * (var110 & var213));
      }

      char[] var19 = new char[var7.length];
      var18 = 178535914;
      var17 = -1584048375;
      var10000 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1422824733;
      var17 = var10000;

      for (int var11 = (var17 | var18) & (~var17 | ~var18); var11 < var6.length; var11++) {
         char var287 = var7[var11];
         char var216 = var9[var11 % var9.length];
         char var113 = var287;
         var19[var11] = (char)((var113 | var216) - (var113 & var216));
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
      var18 = 276487419;
      var17 = -1065930180;
      var10000 = (var17 | var18) & ~(var17 & var18);
      var18 = -804393273;
      var17 = var10000;

      for (int var16 = var17 + var18 - 2 * (var17 & var18); var16 < var15.length; var16++) {
         int var10001 = (int)3817820133258922768L;
         var18 = -1104639178;
         var17 = var10001;
         var10001 = var17 & ~var18 | ~var17 & var18;
         var18 = 1158873124;
         var17 = var10001;
         switch (var16 % (var17 & ~var18 | ~var17 & var18)) {
            case 0:
               var18 = var12;
               var17 = var13;
               var10002 = (var17 | var18) & ~(var17 & var18);
               char var226 = var14[var16];
               var17 = var10002;
               var15[var16] = (char)((var17 | var226) & (~var17 | ~var226));
               break;
            case 1:
               var18 = var13;
               var17 = var5;
               var10002 = (var17 | var18) - (var17 & var18);
               char var224 = var14[var16];
               var17 = var10002;
               var15[var16] = (char)((var17 | var224) & (~var17 | ~var224));
         }
      }

      return new String(var15);
   }
}
