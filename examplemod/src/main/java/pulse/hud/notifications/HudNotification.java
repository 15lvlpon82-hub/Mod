package pulse;

import java.awt.Color;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.util.math.MatrixStack;

public abstract class HudNotification {
   protected static final MinecraftClient c = MinecraftClient.getInstance();
   protected final AnimationState d = new AnimationState();
   protected final AnimationState e = new AnimationState();
   protected final AnimationState f = new AnimationState();
   protected float g;
   protected float h;
   protected float i;
   protected long j;
   protected long k;
   protected boolean l;

   public HudNotification() {
      int var2 = -1570536352;
      int var1 = 1367391578;
      int var10001 = var1 & ~var2 | ~var1 & var2;
      var2 = -218487070;
      var1 = var10001;
      var10001 = ((var1 | var2) & (~var1 | ~var2)) * ((var1 | var2) & (~var1 | ~var2));
      this.g = 8.0F;
      var2 = -1229479701;
      var1 = -159362026;
      var10001 = (var1 | var2) - (var1 & var2);
      var2 = 960464946;
      var1 = var10001;
      var10001 = (var1 | var2) & (~var1 | ~var2);
      this.h = 4.0F;
      var10001 = (int)2538579461312131023L;
      var2 = -2139228812;
      var1 = var10001;
      var10001 = var1 + var2 - 2 * (var1 & var2);
      var2 = -2032497647;
      var1 = var10001;
      var10001 = (var1 | var2) & (~var1 | ~var2);
      int var10002 = (int)2677305673012813481L;
      var2 = -1903159233;
      var1 = var10002;
      var10002 = (var1 | var2) & ~(var1 & var2);
      var2 = 727895255;
      var1 = var10002;
      var2 = (var1 | var2) & (~var1 | ~var2);
      var1 = var10001;
      var10001 = (var1 ^ var2) + 2 * (var1 & var2);
      this.i = 12.0F;
      var2 = 386854546;
      var1 = 1716793907;
      var10001 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1222354724;
      var1 = var10001;
      var10001 = (var1 & ~var2 | ~var1 & var2) * (var1 & ~var2 | ~var1 & var2);
      this.j = 1000L;
      var2 = -804203941;
      var1 = 536713445;
      var10001 = (var1 | var2) & ~(var1 & var2);
      var2 = -806532418;
      var1 = var10001;
      this.l = pulse.Bool.from(var1 + var2 - 2 * (var1 & var2));
      this.k = System.currentTimeMillis();
      this.f.d(0.0);
      var10002 = (int)-7545764972923643724L;
      var2 = -481527570;
      var1 = var10002;
      var10002 = (var1 | var2) - (var1 & var2);
      var2 = -284421112;
      var1 = var10002;
      var10002 = (var1 | var2) & ~(var1 & var2);
      var2 = 1984491274;
      var1 = 721176109;
      int var10003 = (var1 | var2) & (~var1 | ~var2);
      var2 = -455109024;
      var1 = var10003;
      var2 = var1 + var2 - 2 * (var1 & var2);
      var1 = var10002;
      var10002 = (var1 & ~var2) + (var2 & ~var1) + 2 * (var1 & var2);
      this.f.a(1.0, 0.2, pulse.Easing.k);
   }

   public abstract float a();

   public abstract float b();

   public abstract void a(MatrixStack var1, Renderer2D var2, float var3, float var4, float var5, float var6, float var7);

   public float c() {
      return this.g + this.a() + this.g;
   }

   public float d() {
      return this.h + this.b() + this.h;
   }

   public void e() {
      this.d.a();
      this.e.a();
      this.f.a();
      if (!this.l && System.currentTimeMillis() - this.k > this.j) {
         this.f();
      }
   }

   public void f() {
      if (!this.l) {
         int var10001 = (int)-1804720128329092331L;
         int var2 = -429058993;
         int var1 = var10001;
         var10001 = (var1 | var2) - (var1 & var2);
         var2 = 27223899;
         var1 = var10001;
         this.l = pulse.Bool.from(var1 + var2 - 2 * (var1 & var2));
         AnimationState var10000 = this.f;
         int var10003 = (int)1223569914352595775L;
         var2 = -1762505046;
         var1 = var10003;
         var10003 = (var1 | var2) - (var1 & var2);
         var2 = 539311517;
         var1 = var10003;
         var10003 = var1 & ~var2 | ~var1 & var2;
         var10000.a(0.0, 0.2, pulse.Easing.j);
      }
   }

   public boolean g() {
      if (this.l) {
         double var10000 = this.f.j();
         int var10001 = (int)-8120514458512305447L;
         int var2 = 1271857576;
         int var1 = var10001;
         var10001 = var1 & ~var2 | ~var1 & var2;
         var2 = -1608045266;
         var1 = var10001;
         var10001 = (var1 | var2) - (var1 & var2);
         var2 = 1429467149;
         var1 = 311342665;
         int var10002 = (var1 | var2) & ~(var1 & var2);
         var2 = 269808141;
         var1 = var10002;
         var2 = var1 & ~var2 | ~var1 & var2;
         var1 = var10001;
         var10001 = (var1 | var2) + (var1 & var2);
         if (var10000 <= 0.01) {
            int var21 = (int)3572812411071815735L;
            var2 = 798544321;
            var1 = var21;
            int var22 = var1 & ~var2 | ~var1 & var2;
            var2 = 2089955831;
            var1 = var22;
            return pulse.Bool.from((var1 | var2) & ~(var1 & var2));
         }
      }

      int var15 = -327390689;
      int var7 = -1398400446;
      int var19 = var7 + var15 - 2 * (var7 & var15);
      var15 = 1088057437;
      var7 = var19;
      return pulse.Bool.from((var7 | var15) - (var7 & var15));
   }

   public boolean h() {
      return this.l;
   }

   public float i() {
      return (float)this.f.j();
   }

   public float j() {
      return this.g;
   }

   public float k() {
      return this.h;
   }

   public float l() {
      return this.i;
   }

   protected Color a(Color var1, float var2) {
      return new Color(var1.getRed(), var1.getGreen(), var1.getBlue(), (int)(var1.getAlpha() * var2));
   }

   public static String b(String var0, String var1, int var2, int var3, int var4, int var5) {
      char[] var6 = var1.toCharArray();
      char[] var7 = new char[var6.length];
      int var18 = 2081839028;
      int var17 = 727659796;
      int var10000 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1464427178;
      var17 = var10000;
      char[] var249 = new char[(var17 | var18) & ~(var17 & var18)];
      int var10002 = (int)-8606509403562634905L;
      var18 = -796551798;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 605193453;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1453927165;
      var17 = -1180198677;
      int var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -284231132;
      var17 = var10003;
      var249[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var10002 = (int)8041597721024878482L;
      var18 = -1205307293;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -596693008;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 1123312337;
      var17 = 961667443;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 2074452007;
      var17 = var10003;
      var249[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var18 = -514890942;
      var17 = 220794081;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -328831071;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1337476248;
      var17 = -788132844;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 1631687930;
      var17 = var10003;
      var249[var10002] = (char)((var17 | var18) - (var17 & var18));
      var10002 = (int)3273464604273252557L;
      var18 = 714194427;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -535550667;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -1891775366;
      var17 = 94752577;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 31784905;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      int var10004 = (int)-164547557365688845L;
      var18 = 377896464;
      var17 = var10004;
      var10004 = (var17 | var18) - (var17 & var18);
      var18 = 1141571978;
      var17 = var10004;
      var18 = (var17 | var18) - (var17 & var18);
      var17 = var10003;
      var10003 = 2 * (var17 | var18) - (var17 ^ var18);
      var18 = -571881096;
      var17 = 463597981;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -968318730;
      var17 = var10003;
      var249[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var18 = 215505298;
      var17 = -1694111208;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1747078258;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)-7087201835914450477L;
      var18 = 217051811;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -1422936943;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -241299395;
      var17 = 1517418230;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1410369554;
      var17 = var10003;
      var249[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var10002 = (int)-3137733367673881381L;
      var18 = 1888494170;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 326655620;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 115200674;
      var17 = 1054005268;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 940527412;
      var17 = var10003;
      var249[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var18 = -1200707032;
      var17 = 1757110130;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -791284388;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)-3080677747392298501L;
      var18 = -442515625;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -895158337;
      var17 = var10003;
      var249[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var10002 = (int)2540879528563889396L;
      var18 = 757644044;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 942960639;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)7041011664061919287L;
      var18 = -517589069;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1458369446;
      var17 = var10003;
      var249[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var18 = 1751035571;
      var17 = 386982601;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 2135837810;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1658421948;
      var17 = -1278345909;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 787187804;
      var17 = var10003;
      var249[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var18 = 1480666898;
      var17 = -883498872;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1827156077;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 124149467;
      var17 = -681293326;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -805171187;
      var17 = var10003;
      var249[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      char[] var8 = var249;
      var10000 = (int)8807498333309726945L;
      var18 = -2122728964;
      var17 = var10000;
      var10000 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1841088791;
      var17 = var10000;
      char[] var252 = new char[(var17 | var18) & (~var17 | ~var18)];
      var10002 = (int)1322589788096792053L;
      var18 = -1898097769;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 701290082;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var10003 = (int)-5999674971661308907L;
      var18 = 1696696946;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -948785593;
      var17 = var10003;
      var252[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var18 = -364567095;
      var17 = -1214892463;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 1574114201;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -1659412703;
      var17 = -377409907;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 1188526101;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)6909745390447990133L;
      var18 = -1771485567;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 677533687;
      var17 = var10003;
      var252[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var18 = 2008208117;
      var17 = -1493548674;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -783772791;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var10004 = (int)-9147563046137211907L;
      var18 = 125912925;
      var17 = var10004;
      var10004 = var17 & ~var18 | ~var17 & var18;
      var18 = 486610081;
      var17 = var10004;
      var10004 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)4229232123941243890L;
      var18 = 491178333;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -1988753924;
      var17 = var10003;
      var252[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var10002 = (int)-3130826884806408899L;
      var18 = -958053572;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -80067070;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)5902023899462728417L;
      var18 = 1811299182;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 882997645;
      var17 = var10003;
      var252[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var10002 = (int)2693868851093837346L;
      var18 = -1791790157;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 298018197;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)3824882322205759010L;
      var18 = -640714442;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 594646868;
      var17 = var10003;
      var252[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var10002 = (int)-1999435935934433727L;
      var18 = -1294357944;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1516004340;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)5215876618436082667L;
      var18 = -1508741980;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -331894821;
      var17 = var10003;
      var252[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var18 = -1137801928;
      var17 = 414927457;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1533685921;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var10004 = (int)-294859255359766542L;
      var18 = -1765770449;
      var17 = var10004;
      var10004 = (var17 | var18) & ~(var17 & var18);
      var18 = 1598751948;
      var17 = var10004;
      var10004 = (var17 | var18) - (var17 & var18);
      var10003 = (int)-8422138400455322367L;
      var18 = 9349695;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 1193359367;
      var17 = var10003;
      var252[var10002] = (char)((var17 | var18) - (var17 & var18));
      var10002 = (int)3696178963999786772L;
      var18 = 1912091211;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 1317188952;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)-3561837794221224216L;
      var18 = -1882332813;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1211105187;
      var17 = var10003;
      var252[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var10002 = (int)-1063951786319378357L;
      var18 = -2005709817;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1312408644;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)8962484665159492528L;
      var18 = -1020314824;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 1920540448;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -659304422;
      var17 = -274114823;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 924452327;
      var17 = var10003;
      var252[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var10002 = (int)7039893919304371102L;
      var18 = -422463999;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1707049578;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)-3423875135824425264L;
      var18 = 1619530195;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 896314416;
      var17 = var10003;
      var252[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      char[] var9 = var252;
      var18 = 254072910;
      var17 = 971077736;
      var10000 = (var17 | var18) & (~var17 | ~var18);
      var18 = 918921254;
      var17 = var10000;

      for (int var10 = var17 + var18 - 2 * (var17 & var18); var10 < var6.length; var10++) {
         char var311 = var6[var10];
         char var235 = var8[var10 % var8.length];
         char var121 = var311;
         var7[var10] = (char)(var121 & ~var235 | ~var121 & var235);
      }

      char[] var19 = new char[var7.length];
      var10000 = (int)-8819180087086878723L;
      var18 = -607661500;
      var17 = var10000;
      var10000 = (var17 | var18) - (var17 & var18);
      var18 = 154877369;
      var17 = var10000;

      for (int var11 = (var17 | var18) & (~var17 | ~var18); var11 < var6.length; var11++) {
         char var312 = var7[var11];
         char var238 = var9[var11 % var9.length];
         char var124 = var312;
         var19[var11] = (char)((var124 | var238) & ~(var124 & var238));
      }

      String var20 = new String(var19);
      int var12 = var20.hashCode();
      var18 = var5;
      var17 = var3;
      var10000 = var17 - var18;
      var18 = var2;
      var17 = var10000;
      int var13 = var17 + ~var18 + 1;
      char[] var14 = var0.toCharArray();
      char[] var15 = new char[var14.length];
      var10000 = (int)1830108470496789285L;
      var18 = 1820675368;
      var17 = var10000;
      var10000 = var17 & ~var18 | ~var17 & var18;
      var18 = 1222659597;
      var17 = var10000;

      for (int var16 = (var17 | var18) & (~var17 | ~var18); var16 < var15.length; var16++) {
         int var10001 = (int)9194479041063114389L;
         var18 = -2107067261;
         var17 = var10001;
         var10001 = (var17 | var18) & ~(var17 & var18);
         var18 = -1287658988;
         var17 = var10001;
         switch (var16 % ((var17 | var18) & ~(var17 & var18))) {
            case 0:
               var18 = var12;
               var17 = var13;
               var10002 = var17 + var18 - 2 * (var17 & var18);
               char var248 = var14[var16];
               var17 = var10002;
               var15[var16] = (char)(var17 + var248 - 2 * (var17 & var248));
               break;
            case 1:
               var18 = var13;
               var17 = var5;
               var10002 = (var17 | var18) & ~(var17 & var18);
               char var246 = var14[var16];
               var17 = var10002;
               var15[var16] = (char)(var17 & ~var246 | ~var17 & var246);
         }
      }

      return new String(var15);
   }
}

