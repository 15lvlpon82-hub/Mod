package pulse;


import pulse.client.MinecraftContext;
import java.awt.Color;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import net.minecraft.client.util.math.MatrixStack;

public class ConfigCard {
   public static final float a = 36.5F;
   private static final float d = 9.5F;
   private static final float e = 11.0F;
   private static final float f = 9.0F;
   private static final float g = 19.5F;
   private static final float h = 6.5F;
   private static final float i = 6.0F;
   private static final float j = 3.0F;
   private static final float k = 5.0F;
   private static final Color l;
   private static final Color m;
   private static final Color n;
   private static final Color o;
   private static final Color p;
   private static final Color q;
   private static final Color r;
   private static final Color s;
   private static final Color t;
   private static final Color u;
   private static final Color v;
   private static final Color w;
   private static final Color x;
   private static final Color y;
   private static final Color z;
   private static final Color A;
   private static final Color B;
   private static final Color C;
   private static final Color D;
   private static final long E = 400L;
   private final ConfigEntry F;
   private final AnimationState G = new AnimationState();
   private final AnimationState H = new AnimationState();
   private final AnimationState I = new AnimationState();
   private final AnimationState J = new AnimationState();
   private boolean K;
   private boolean L;
   private boolean M;
   private boolean N;
   private Consumer<ConfigEntry> O;
   private Consumer<ConfigEntry> P;
   private Consumer<ConfigEntry> Q;
   private BiConsumer<ConfigEntry, Float[]> R;
   private BiConsumer<String, String> S;
   private long T;
   private float U;
   private float V;
   private float W;
   private boolean X;
   private String Y;
   private String Z;
   private int aa;
   private int FriendCard;
   private int CosmeticModelRenderer;
   private final AnimationState CosmeticModelLoader;
   private boolean ModelPart;
   private static final String ModelCube = "\\/:*?\"<>| ";
   public static int b;
   public static boolean c;

   public ConfigCard(ConfigEntry var1) {
      int var10001 = (int)-4505568485392420053L;
      int var3 = -901123727;
      int var2 = var10001;
      var10001 = var2 & ~var3 | ~var2 & var3;
      var3 = 1320452698;
      var2 = var10001;
      this.K = pulse.Bool.from((var2 | var3) - (var2 & var3));
      var3 = -246514988;
      var2 = 402228784;
      var10001 = (var2 | var3) & (~var2 | ~var3);
      var3 = -424149788;
      var2 = var10001;
      this.L = pulse.Bool.from((var2 | var3) - (var2 & var3));
      var10001 = (int)-6318052664487867127L;
      var3 = 845839781;
      var2 = var10001;
      var10001 = var2 & ~var3 | ~var2 & var3;
      var3 = 1318580396;
      var2 = var10001;
      this.M = pulse.Bool.from((var2 | var3) & ~(var2 & var3));
      var3 = -1559403037;
      var2 = 556969142;
      var10001 = var2 + var3 - 2 * (var2 & var3);
      var3 = -2109748907;
      var2 = var10001;
      this.N = pulse.Bool.from((var2 | var3) & (~var2 | ~var3));
      this.T = 0L;
      var10001 = (int)6078039267943708010L;
      var3 = -33094783;
      var2 = var10001;
      var10001 = var2 & ~var3 | ~var2 & var3;
      var3 = 380630763;
      var2 = var10001;
      this.X = pulse.Bool.from((var2 | var3) - (var2 & var3));
      var3 = -312555894;
      var2 = -1946468860;
      var10001 = var2 + var3 - 2 * (var2 & var3);
      var3 = 1421577954;
      var2 = var10001;
      var10001 = (var2 | var3) - (var2 & var3);
      var3 = 1128993125;
      var2 = -1665590739;
      int var10002 = var2 + var3 - 2 * (var2 & var3);
      var3 = 2029297096;
      var2 = var10002;
      var3 = var2 + var3 - 2 * (var2 & var3);
      var2 = var10001;
      var10001 = (var2 ^ var3) + 2 * (var2 & var3);
      String var136 = "bha";
      int var10003 = (int)6792318804335087591L;
      var3 = 915036208;
      var2 = var10003;
      var10003 = (var2 | var3) & ~(var2 & var3);
      var3 = -1369697081;
      var2 = var10003;
      var10003 = (var2 | var3) & (~var2 | ~var3);
      int var10004 = (int)1568639950220924890L;
      var3 = -518517165;
      var2 = var10004;
      var10004 = var2 + var3 - 2 * (var2 & var3);
      var3 = -911685981;
      var2 = var10004;
      var3 = (var2 | var3) & ~(var2 & var3);
      var2 = var10003;
      var10003 = (var2 & ~var3) + (var3 & ~var2) + 2 * (var2 & var3);
      var10003 = (int)5786897560185715829L;
      var3 = -1803519557;
      var2 = var10003;
      var10003 = (var2 | var3) - (var2 & var3);
      var3 = -707692355;
      var2 = var10003;
      var10003 = var2 + var3 - 2 * (var2 & var3);
      String var153 = "bhb";
      var10004 = (int)-1751951683308750275L;
      var3 = 683734333;
      var2 = var10004;
      var10004 = var2 & ~var3 | ~var2 & var3;
      var3 = -1680399489;
      var2 = var10004;
      var10004 = (var2 | var3) - (var2 & var3);
      String var10005 = "bhc";
      int var162 = (int)-2701568998293689135L;
      var3 = -597174448;
      var2 = var162;
      int var163 = var2 + var3 - 2 * (var2 & var3);
      var3 = -1860231874;
      var2 = var163;
      int var164 = var2 + var3 - 2 * (var2 & var3);
      var3 = 1538926799;
      var2 = -1304419860;
      int var10006 = var2 & ~var3 | ~var2 & var3;
      var3 = 746356594;
      var2 = var10006;
      var10006 = (var2 | var3) & (~var2 | ~var3);
      int var10007 = (int)5585133725817187535L;
      var3 = -2001250237;
      var2 = var10007;
      var10007 = (var2 | var3) & ~(var2 & var3);
      var3 = -1403051955;
      var2 = var10007;
      var3 = (var2 | var3) - (var2 & var3);
      var2 = var10006;
      var10006 = 2 * (var2 | var3) - (var2 ^ var3);
      var3 = -601239468;
      var2 = 851742380;
      var10006 = var2 & ~var3 | ~var2 & var3;
      var3 = -289394078;
      var2 = var10006;
      this.Y = a("", "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘ґ~\ua7efк’¶кЃєк¤‚зµЈи№ѓ\u2435и¬єг‘І|кџік“єкЃІк¤Љзµёи№Њв‘іи¬°г‘¤=кџ…к’єкЃїк¤ѓзµїи№Ќ\u2453и¬Јг‘І\u007fкџѓк’№кЃґк¤€зµіи№„в‘®", var10003, var10004, var164, var2 + var3 - 2 * (var2 & var3));
      String var130 = "bhd";
      var10003 = (int)-2652885836687619775L;
      var3 = 1110356861;
      var2 = var10003;
      var10003 = var2 + var3 - 2 * (var2 & var3);
      var3 = 1488943666;
      var2 = var10003;
      var10003 = var2 & ~var3 | ~var2 & var3;
      var3 = -1460187335;
      var2 = -2072647047;
      var10003 = (var2 | var3) - (var2 & var3);
      var3 = 746759495;
      var2 = var10003;
      var10003 = (var2 | var3) & (~var2 | ~var3);
      String var148 = "bhe";
      var10003 = (int)-5758208761597432778L;
      var3 = -753376044;
      var2 = var10003;
      var10003 = (var2 | var3) & (~var2 | ~var3);
      var3 = -1639336559;
      var2 = var10003;
      var10003 = (var2 | var3) - (var2 & var3);
      var3 = 2035446242;
      var2 = -1920164728;
      var10004 = var2 & ~var3 | ~var2 & var3;
      var3 = -930386424;
      var2 = var10004;
      var10004 = ((var2 | var3) & (~var2 | ~var3)) * ((var2 | var3) & (~var2 | ~var3));
      var10004 = (int)6221904175068281768L;
      var3 = -1053683791;
      var2 = var10004;
      var10004 = var2 & ~var3 | ~var2 & var3;
      var3 = 1267557987;
      var2 = var10004;
      var10004 = (var2 | var3) & ~(var2 & var3);
      var10006 = (int)-8403681481905273452L;
      var3 = -1781965706;
      var2 = var10006;
      var10006 = var2 & ~var3 | ~var2 & var3;
      var3 = 340482528;
      var2 = var10006;
      var10006 = (var2 | var3) & ~(var2 & var3);
      var3 = 1204450761;
      var2 = -1361750624;
      int var165 = (var2 | var3) - (var2 & var3);
      var3 = -351889619;
      var2 = var165;
      int var166 = (var2 | var3) & ~(var2 & var3);
      var3 = -1944175627;
      var2 = 1410846432;
      var10007 = (var2 | var3) & (~var2 | ~var3);
      var3 = -670436066;
      var2 = var10007;
      var10007 = var2 & ~var3 | ~var2 & var3;
      var3 = 52312042;
      var2 = 1452547032;
      var10006 = var2 & ~var3 | ~var2 & var3;
      var3 = 1438711463;
      var2 = var10006;
      this.Z = a("", "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘ґ~\ua7efк’¶кЃєк¤‚зµЈи№ѓ\u2435и¬єг‘І|кџік“єкЃІк¤Љзµёи№Њв‘іи¬°г‘¤=кџ…к’єкЃїк¤ѓзµїи№Ќ\u2453и¬Јг‘І\u007fкџѓк’№кЃґк¤€зµіи№„в‘®", var10003, var10004, var166, (var2 | var3) & ~(var2 & var3));
      var3 = -356262315;
      var2 = -1194879035;
      var10001 = (var2 | var3) & ~(var2 & var3);
      var3 = 1376012688;
      var2 = var10001;
      this.aa = var2 & ~var3 | ~var2 & var3;
      var3 = -822791938;
      var2 = 938189725;
      var10001 = (var2 | var3) - (var2 & var3);
      var3 = 115436700;
      var2 = var10001;
      this.FriendCard = var2 + var3 - 2 * (var2 & var3);
      var10001 = (int)6129412851808551642L;
      var3 = 1381680758;
      var2 = var10001;
      var10001 = var2 & ~var3 | ~var2 & var3;
      var3 = 744913747;
      var2 = var10001;
      this.CosmeticModelRenderer = var2 & ~var3 | ~var2 & var3;
      this.CosmeticModelLoader = new AnimationState();
      var3 = -191527651;
      var2 = 1157879837;
      var10001 = (var2 | var3) & (~var2 | ~var3);
      var3 = -1315545855;
      var2 = var10001;
      this.ModelPart = pulse.Bool.from((var2 | var3) & ~(var2 & var3));
      this.F = var1;
   }

   public ConfigEntry a() {
      return this.F;
   }

   public void a(Consumer<ConfigEntry> var1) {
      this.O = var1;
   }

   public void b(Consumer<ConfigEntry> var1) {
      this.P = var1;
   }

   public void c(Consumer<ConfigEntry> var1) {
      this.Q = var1;
   }

   public void a(BiConsumer<ConfigEntry, Float[]> var1) {
      this.R = var1;
   }

   public void b(BiConsumer<String, String> var1) {
      this.S = var1;
   }

   public void b() {
      int var10001 = (int)8618184745803179785L;
      int var2 = -1071313833;
      int var1 = var10001;
      var10001 = (var1 | var2) & ~(var1 & var2);
      var2 = -1100158113;
      var1 = var10001;
      this.X = pulse.Bool.from(var1 & ~var2 | ~var1 & var2);
      this.Z = this.F.a();
      this.Y = this.F.a();
      this.aa = this.Y.length();
      var10001 = (int)-590285884333670984L;
      var2 = 620382992;
      var1 = var10001;
      var10001 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1196984663;
      var1 = var10001;
      this.FriendCard = (var1 | var2) & ~(var1 & var2);
      var2 = 1709129849;
      var1 = 1207830237;
      var10001 = var1 & ~var2 | ~var1 & var2;
      var2 = -572606117;
      var1 = var10001;
      this.CosmeticModelRenderer = (var1 | var2) & ~(var1 & var2);
      this.CosmeticModelLoader.d(1.0);
      var10001 = (int)4519969899513940271L;
      var2 = -187633366;
      var1 = var10001;
      var10001 = (var1 | var2) & (~var1 | ~var2);
      var2 = 187463685;
      var1 = var10001;
      this.ModelPart = pulse.Bool.from((var1 | var2) & ~(var1 & var2));
      var2 = -248054969;
      var1 = 1740288585;
      var10001 = (var1 | var2) - (var1 & var2);
      var2 = -699253242;
      var1 = var10001;
      var10001 = ((var1 | var2) & ~(var1 & var2)) * ((var1 | var2) & ~(var1 & var2));
      int var10002 = (int)-8808362175566693432L;
      var2 = -1521029280;
      var1 = var10002;
      var10002 = (var1 | var2) & (~var1 | ~var2);
      var2 = -958430833;
      var1 = var10002;
      var10002 = (var1 | var2) - (var1 & var2);
      int var10003 = (int)7391362451532537799L;
      var2 = -249910882;
      var1 = var10003;
      var10003 = var1 & ~var2 | ~var1 & var2;
      var2 = 2085898895;
      var1 = var10003;
      var2 = (var1 | var2) & ~(var1 & var2);
      var1 = var10002;
      var10002 = (var1 ^ var2) + 2 * (var1 & var2);
      this.CosmeticModelLoader.a(0.3, 0.5, pulse.Easing.i);
   }

   public String c() {
      return this.Z;
   }

   public void a(boolean var1) {
      if (this.X) {
         int var10001 = (int)-6691086182865513953L;
         int var5 = -1481897369;
         int var4 = var10001;
         var10001 = (var4 | var5) - (var4 & var5);
         var5 = -345319304;
         var4 = var10001;
         this.X = pulse.Bool.from((var4 | var5) - (var4 & var5));
         if (var1) {
            String var2 = this.Y.trim();
            if (!var2.isEmpty() && !var2.equals(this.Z)) {
               String var3 = this.Z;
               this.F.a(var2);
               if (this.S != null) {
                  this.S.accept(var3, var2);
               }
            }
         }
      }
   }

   public boolean d() {
      return this.X;
   }

   private boolean a(char var1) {
      int var5 = -1508704352;
      int var4 = 1428409094;
      int var10001 = (var4 | var5) - (var4 & var5);
      var5 = -214879059;
      var4 = var10001;
      var10001 = (var4 | var5) & ~(var4 & var5);
      var5 = -1753398191;
      var4 = -1999473671;
      var10001 = (var4 | var5) - (var4 & var5);
      var5 = 656534182;
      var4 = var10001;
      var10001 = (var4 + var5 - 2 * (var4 & var5)) * (var4 + var5 - 2 * (var4 & var5));
      String var10002 = "bhf";
      var5 = -1980098336;
      var4 = -1367682655;
      int var109 = (var4 | var5) & ~(var4 & var5);
      var5 = -727681998;
      var4 = var109;
      int var110 = var4 + var5 - 2 * (var4 & var5);
      var5 = -1481076280;
      var4 = -457007616;
      int var10003 = var4 & ~var5 | ~var4 & var5;
      var5 = -1057175012;
      var4 = var10003;
      var10003 = ((var4 | var5) & ~(var4 & var5)) * ((var4 | var5) & ~(var4 & var5));
      var5 = 1806265666;
      var4 = 2128551353;
      var10003 = (var4 | var5) - (var4 & var5);
      var5 = 465564601;
      var4 = var10003;
      var10003 = (var4 | var5) & ~(var4 & var5);
      var5 = -1279212625;
      var4 = -740034118;
      int var10004 = (var4 | var5) & (~var4 | ~var5);
      var5 = 2014985636;
      var4 = var10004;
      var10004 = ((var4 | var5) - (var4 & var5)) * ((var4 | var5) - (var4 & var5));
      var5 = -1214877613;
      var4 = 1073976958;
      var10004 = (var4 | var5) & ~(var4 & var5);
      var5 = -160768955;
      var4 = var10004;
      var10004 = (var4 | var5) - (var4 & var5);
      var5 = -479469572;
      var4 = -1989360928;
      int var10006 = (var4 | var5) & ~(var4 & var5);
      var5 = 1778851101;
      var4 = var10006;
      var10006 = (var4 | var5) - (var4 & var5);
      var10006 = (int)4811857105828322067L;
      var5 = -1601047859;
      var4 = var10006;
      var10006 = var4 & ~var5 | ~var4 & var5;
      var5 = -1102583346;
      var4 = var10006;
      var10006 = (var4 | var5) & (~var4 | ~var5);
      var5 = 174624472;
      var4 = -92231267;
      var10006 = (var4 | var5) & ~(var4 & var5);
      var5 = -253221046;
      var4 = var10006;
      var10006 = (var4 | var5) & ~(var4 & var5);
      int var10005 = (int)4701149303102785535L;
      var5 = -347541671;
      var4 = var10005;
      var10005 = (var4 | var5) - (var4 & var5);
      var5 = -862009535;
      var4 = var10005;
      int var10000 = a(
            "\ue8c7гЁ \ue8a1гЁҐ\ue8a4гЁ­\ue8a7гЁ±\ue8e7гЁЇ",
            "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘ґ~\ua7efк’¶кЃєк¤‚зµЈи№ѓ\u2435и¬єг‘І|кџік“єкЃІк¤Љзµёи№Њв‘іи¬°г‘¤=кџ…к’єкЃїк¤ѓзµїи№Ќ\u2453и¬Јг‘І\u007fкџѓк’№кЃґк¤€зµіи№„в‘®",
            var110,
            var10003,
            var10004,
            var4 + var5 - 2 * (var4 & var5)
         )
         .indexOf(var1);
      var10001 = (int)-3833431079299687451L;
      var5 = -1270995391;
      var4 = var10001;
      var10001 = var4 & ~var5 | ~var4 & var5;
      var5 = 749175387;
      var4 = var10001;
      if (var10000 == (var4 | var5) - (var4 & var5) && !Character.isISOControl(var1)) {
         var10000 = (int)-3013950404735707999L;
         var5 = 1884967083;
         var4 = var10000;
         var10000 = (var4 | var5) - (var4 & var5);
         var5 = 592380939;
         var4 = var10000;
         var10000 = var4 & ~var5 | ~var4 & var5;
         var5 = -649430485;
         var4 = -548512439;
         int var111 = var4 + var5 - 2 * (var4 & var5);
         var5 = 100935533;
         var4 = var111;
         int var112 = var4 & ~var5 | ~var4 & var5;
         int var113 = (int)7872210932397164373L;
         var5 = -1649662500;
         var4 = var113;
         int var114 = var4 + var5 - 2 * (var4 & var5);
         var5 = -1009327488;
         var4 = var114;
         int var115 = var4 + var5 - 2 * (var4 & var5);
         var10001 = (int)7858728742377143032L;
         var5 = -397967953;
         var4 = var10001;
         var10001 = (var4 | var5) & ~(var4 & var5);
         var5 = -917650417;
         var4 = var10001;
         int var3 = var4 + var5 - 2 * (var4 & var5);
         var5 = 479091651;
         var4 = 539019326;
         int var116 = (var4 | var5) - (var4 & var5);
         var5 = 1018074100;
         var4 = var116;
         int var117 = (var4 | var5) & ~(var4 & var5);
         int var118 = (int)3447940302616996081L;
         var5 = -290258781;
         var4 = var118;
         int var119 = (var4 | var5) - (var4 & var5);
         var5 = 512632898;
         var4 = var119;
         int var120 = (var4 | var5) & (~var4 | ~var5);
         var10001 = (int)-4432435489613495486L;
         var5 = 310654558;
         var4 = var10001;
         var10001 = (var4 | var5) & (~var4 | ~var5);
         var5 = -572459043;
         var4 = var10001;
         if ((var4 | var5) - (var4 & var5) >= var3) {
            var10001 = (int)-1024493699007168633L;
            var5 = -1019773134;
            var4 = var10001;
            var10001 = (var4 | var5) - (var4 & var5);
            var5 = 1731870901;
            var4 = var10001;
            var10001 = (var4 | var5) - (var4 & var5);
            var5 = 490068660;
            var4 = -688578648;
            int var121 = (var4 | var5) - (var4 & var5);
            var5 = -876559076;
            var4 = var121;
            var10001 /= var4 + var5 - 2 * (var4 & var5);
         }
      } else {
         var5 = 723992206;
         var4 = 1623303797;
         var10000 = var4 + var5 - 2 * (var4 & var5);
         var5 = 1273403643;
         var4 = var10000;
         var10000 = (var4 | var5) - (var4 & var5);
      }

      return pulse.Bool.from(var10000);
   }

   public void a(MatrixStack var1, Renderer2D var2, float var3, float var4, float var5, int var6, int var7, float var8) {
      this.U = var3;
      this.V = var4;
      this.W = var5;
      this.G.a();
      this.H.a();
      this.I.a();
      this.J.a();
      int var25 = -184031691;
      int var24 = 1433533461;
      int var10000 = var24 & ~var25 | ~var24 & var25;
      var25 = 358020804;
      var24 = var10000;
      var10000 = ((var24 | var25) - (var24 & var25)) * ((var24 | var25) - (var24 & var25));
      int var9 = (int)(255.0F * var8);
      boolean var10 = pulse.GuiInteractionState.a().b();
      boolean var11 = this.F.e();
      boolean var12 = this.F.f();
      if (!var12) {
         if (var11 == this.L) {
            if (c) {
               var10000 = (int)6212932882504097175L;
               var25 = -1941023726;
               var24 = var10000;
               var10000 = var24 + var25 - 2 * (var24 & var25);
               var25 = -1508812821;
               var24 = var10000;
               var10000 = (var24 | var25) & (~var24 | ~var25);
               var25 = -679254313;
               var24 = 403606387;
               var10000 = (var24 | var25) & (~var24 | ~var25);
               var25 = -1166660040;
               var24 = var10000;
               int var23 = (var24 | var25) & ~(var24 & var25);
               b = var23;
            }
         } else {
            double var10001 = !var11 ? 0.0 : 1.0;
            int var10002 = (int)-3862729309297516862L;
            var25 = 876077360;
            var24 = var10002;
            var10002 = var24 + var25 - 2 * (var24 & var25);
            var25 = -23531989;
            var24 = var10002;
            var10002 = (var24 | var25) & (~var24 | ~var25);
            this.H.a(var10001, 0.2, pulse.Easing.h);
            this.L = var11;
         }
      }

      float var13 = (float)this.G.j();
      float var14 = !var12 ? (float)this.H.j() : 0.0F;
      if (!var12) {
         float var15;
         float var16;
         float var17;
         label191: {
            float var327 = var3 + var5;
            String var380 = "bhh";
            float var328 = var327 - 11.0F;
            var25 = -1104517364;
            var24 = -703194204;
            int var381 = var24 & ~var25 | ~var24 & var25;
            var25 = 47957544;
            var24 = var381;
            int var382 = ((var24 | var25) & (~var24 | ~var25)) * ((var24 | var25) & (~var24 | ~var25));
            var15 = var328 - 19.5F;
            int var383 = (int)3315741663143446302L;
            var25 = -1261585631;
            var24 = var383;
            int var384 = var24 & ~var25 | ~var24 & var25;
            var25 = -1194010756;
            var24 = var384;
            int var385 = (var24 | var25) & ~(var24 & var25);
            float var329 = var15 - 6.0F;
            var380 = "bhi";
            var16 = var329 - 19.5F;
            var25 = 2046234729;
            var24 = -1889369265;
            int var387 = (var24 | var25) & (~var24 | ~var25);
            var25 = -703182545;
            var24 = var387;
            int var388 = (var24 | var25) & ~(var24 & var25);
            var17 = var4 + 8.5F;
            if (!var10) {
               String var431 = "bhj";
               var25 = -1752321876;
               var24 = -246746077;
               int var10004 = var24 & ~var25 | ~var24 & var25;
               var25 = 1724335237;
               var24 = var10004;
               var10004 = (var24 | var25) & (~var24 | ~var25);
               var25 = 1491212209;
               var24 = 877818089;
               var10004 = (var24 | var25) & (~var24 | ~var25);
               var25 = 1823500104;
               var24 = var10004;
               var10004 = (var24 | var25) - (var24 & var25);
               var25 = -1501260388;
               var24 = 867410414;
               var10004 = (var24 | var25) & ~(var24 & var25);
               var25 = -1791544202;
               var24 = var10004;
               var10004 = (var24 | var25) & (~var24 | ~var25);
               var10004 = (int)4553735064107268529L;
               var25 = 1207587846;
               var24 = var10004;
               var10004 = (var24 | var25) & ~(var24 & var25);
               var25 = 1184951739;
               var24 = var10004;
               var10004 = var24 + var25 - 2 * (var24 & var25);
               if (GuiInput.a(var16, var17, 19.5F, 19.5F, var6, var7)) {
                  var10000 = (int)5212554028269653836L;
                  var25 = 1655865986;
                  var24 = var10000;
                  var10000 = (var24 | var25) & (~var24 | ~var25);
                  var25 = 423218639;
                  var24 = var10000;
                  var10000 = (var24 | var25) - (var24 & var25);
                  if (c) {
                     int var389 = (int)-3528053823046680039L;
                     var25 = 1870696458;
                     var24 = var389;
                     int var390 = (var24 | var25) - (var24 & var25);
                     var25 = 1689386080;
                     var24 = var390;
                     int var391 = ((var24 | var25) & (~var24 | ~var25)) * ((var24 | var25) & (~var24 | ~var25));
                     var25 = 134021901;
                     var24 = -1304481119;
                     int var392 = var24 & ~var25 | ~var24 & var25;
                     var25 = 271523803;
                     var24 = var392;
                     int var31 = (var24 | var25) & (~var24 | ~var25);
                     b = var31;
                  }
                  break label191;
               }
            }

            var10000 = (int)-6264385980363616163L;
            var25 = -519168224;
            var24 = var10000;
            var10000 = (var24 | var25) - (var24 & var25);
            var25 = -109883523;
            var24 = var10000;
            var10000 = (var24 | var25) & ~(var24 & var25);
         }

         int var18;
         label186: {
            var18 = var10000;
            if (!var10) {
               String var432 = "bhk";
               var25 = 291863846;
               var24 = 1425380134;
               int var10003 = (var24 | var25) & (~var24 | ~var25);
               var25 = -1404002710;
               var24 = var10003;
               var10003 = (var24 + var25 - 2 * (var24 & var25)) * (var24 + var25 - 2 * (var24 & var25));
               if (GuiInput.a(var15, var17, 19.5F, 19.5F, var6, var7)) {
                  var25 = 1734562708;
                  var24 = 1430760552;
                  var10000 = (var24 | var25) - (var24 & var25);
                  var25 = 841285629;
                  var24 = var10000;
                  var10000 = (var24 | var25) - (var24 & var25);
                  break label186;
               }
            }

            var10000 = (int)-5691896732881888079L;
            var25 = 1350061901;
            var24 = var10000;
            var10000 = (var24 | var25) - (var24 & var25);
            var25 = 1109791740;
            var24 = var10000;
            var10000 = var24 & ~var25 | ~var24 & var25;
         }

         int var19;
         label181: {
            var19 = var10000;
            if (!var10) {
               int var452 = (int)-1982084566961480826L;
               var25 = -502269947;
               var24 = var452;
               var452 = (var24 | var25) & ~(var24 & var25);
               var25 = -1281995204;
               var24 = var452;
               var452 = var24 + var25 - 2 * (var24 & var25);
               if (GuiInput.a(var3, var4, var5, 36.5F, var6, var7)) {
                  var25 = 103909258;
                  var24 = 1978726122;
                  var10000 = var24 & ~var25 | ~var24 & var25;
                  var25 = 1942057313;
                  var24 = var10000;
                  var10000 = (var24 | var25) & ~(var24 & var25);
                  break label181;
               }
            }

            var10000 = (int)-5891980068400601497L;
            var25 = 1514799497;
            var24 = var10000;
            var10000 = (var24 | var25) & ~(var24 & var25);
            var25 = 486991854;
            var24 = var10000;
            var10000 = (var24 | var25) & (~var24 | ~var25);
         }

         int var20 = var10000;
         if (var20 != 0 && var18 == 0 && var19 == 0) {
            var10000 = (int)-8952213179913510860L;
            var25 = -307742366;
            var24 = var10000;
            var10000 = var24 + var25 - 2 * (var24 & var25);
            var25 = -603498153;
            var24 = var10000;
            var10000 = (var24 | var25) - (var24 & var25);
         } else {
            var25 = -1321183479;
            var24 = 1082294209;
            var10000 = var24 + var25 - 2 * (var24 & var25);
            var25 = -238933816;
            var24 = var10000;
            var10000 = var24 & ~var25 | ~var24 & var25;
         }

         int var401;
         label170: {
            int var21 = var10000;
            this.a(this.G, pulse.Bool.from(var21), this.K, var10);
            if (!var10) {
               if (var21 != 0) {
                  var401 = (int)3892508822472969888L;
                  var25 = 2114213312;
                  var24 = var401;
                  var401 = (var24 | var25) & ~(var24 & var25);
                  var25 = -292086943;
                  var24 = var401;
                  var401 = (var24 | var25) - (var24 & var25);
                  int var439 = (int)5496290966169277506L;
                  var25 = 415793315;
                  var24 = var439;
                  var439 = (var24 | var25) & ~(var24 & var25);
                  var25 = 1396425759;
                  var24 = var439;
                  var439 = (var24 | var25) - (var24 & var25);
                  var25 = 494445017;
                  var24 = -1997939383;
                  var439 = (var24 | var25) - (var24 & var25);
                  var25 = -1253984597;
                  var24 = var439;
                  int var34 = var24 & ~var25 | ~var24 & var25;
                  int var455 = (int)442802164619258091L;
                  var25 = -709555544;
                  var24 = var455;
                  var455 = (var24 | var25) - (var24 & var25);
                  var25 = 710058578;
                  var24 = var455;
                  var455 = (var24 | var25) & (~var24 | ~var25);
                  var25 = 264932923;
                  var24 = 1455712127;
                  var455 = (var24 | var25) - (var24 & var25);
                  var25 = 1494149453;
                  var24 = var455;
                  var455 = var24 + var25 - 2 * (var24 & var25);
                  var25 = -2143056892;
                  var24 = 691770734;
                  var455 = (var24 | var25) & (~var24 | ~var25);
                  var25 = -1451746974;
                  var24 = var455;
                  var455 = var24 & ~var25 | ~var24 & var25;
                  var455 = (int)-8817618864514029729L;
                  var25 = -1632602947;
                  var24 = var455;
                  var455 = var24 + var25 - 2 * (var24 & var25);
                  var25 = -647244824;
                  var24 = var455;
                  var455 = var24 + var25 - 2 * (var24 & var25);
                  var439 = (int)7830628240733360698L;
                  var25 = -277871169;
                  var24 = var439;
                  var439 = (var24 | var25) - (var24 & var25);
                  var25 = 1743614207;
                  var24 = var439;
                  if (((var24 | var25) & ~(var24 & var25)) >= var34) {
                     throw new RuntimeException();
                  }
                  break label170;
               }

               String var393 = "bhl";
               var25 = 1680545079;
               var24 = 1344524644;
               var401 = (var24 | var25) & ~(var24 & var25);
               var25 = 625780653;
               var24 = var401;
               int var32 = (var24 | var25) - (var24 & var25);
               b = var32;
               var25 = 327917570;
               var24 = 1068221419;
               var401 = (var24 | var25) & (~var24 | ~var25);
               var25 = 1834545200;
               var24 = var401;
               var401 = var24 & ~var25 | ~var24 & var25;
               var25 = 1630715216;
               var24 = -1939227672;
               var401 = (var24 | var25) & (~var24 | ~var25);
               var25 = -107640444;
               var24 = var401;
               if ((var24 | var25) - (var24 & var25) <= b) {
                  var25 = -962124745;
                  var24 = -463025743;
                  int var433 = (var24 | var25) & (~var24 | ~var25);
                  var25 = 583134605;
                  var24 = var433;
                  var433 = (var24 | var25) - (var24 & var25);
                  var25 = 1054658036;
                  var24 = 1473054134;
                  var433 = var24 & ~var25 | ~var24 & var25;
                  var25 = 1762773067;
                  var24 = var433;
                  var433 = var24 + var25 - 2 * (var24 & var25);
                  var25 = -2073010419;
                  var24 = 1332090240;
                  var433 = var24 & ~var25 | ~var24 & var25;
                  var25 = -887731577;
                  var24 = var433;
                  var433 = var24 + var25 - 2 * (var24 & var25);
                  var25 = 1776766006;
                  var24 = -749280413;
                  var401 = (var24 | var25) - (var24 & var25);
                  var25 = 263770498;
                  var24 = var401;
                  var32 = (var24 | var25) - (var24 & var25);
                  b = var32;
               }
            }

            var401 = (int)-7901120189926180352L;
            var25 = -1897120529;
            var24 = var401;
            var401 = (var24 | var25) & (~var24 | ~var25);
            var25 = 421807855;
            var24 = var401;
            var401 = (var24 | var25) & (~var24 | ~var25);
         }

         this.K = pulse.Bool.from(var401);
         this.a(this.I, pulse.Bool.from(var18), this.M, var10);
         if (!var10 && var18 != 0) {
            var25 = -336423713;
            var24 = 1308689659;
            var401 = (var24 | var25) & (~var24 | ~var25);
            var25 = -1510764507;
            var24 = var401;
            var401 = var24 & ~var25 | ~var24 & var25;
         } else {
            var401 = (int)-8503006736075623466L;
            var25 = -2136334328;
            var24 = var401;
            var401 = var24 + var25 - 2 * (var24 & var25);
            var25 = 635392990;
            var24 = var401;
            var401 = var24 + var25 - 2 * (var24 & var25);
         }

         this.M = pulse.Bool.from(var401);
         this.a(this.J, pulse.Bool.from(var19), this.N, var10);
         if (!var10 && var19 != 0) {
            var401 = (int)1770722145820814563L;
            var25 = -1005709617;
            var24 = var401;
            var401 = (var24 | var25) & ~(var24 & var25);
            var25 = 899627565;
            var24 = var401;
            var401 = var24 & ~var25 | ~var24 & var25;
         } else {
            var401 = (int)-75616254780651675L;
            var25 = -722554145;
            var24 = var401;
            var401 = (var24 | var25) - (var24 & var25);
            var25 = 1852011962;
            var24 = var401;
            var401 = var24 + var25 - 2 * (var24 & var25);
         }

         this.N = pulse.Bool.from(var401);
         this.a(var1, var2, var3, var4, var5, var9, var13, var14);
         this.a(var1, var2, var3, var4, var6, var7, var9, var8);
         this.a(var1, var2, var16, var15, var17, var9, var14);
         if (var18 != 0) {
            if (b != b) {
               var10000 = (int)4849714927439890123L;
               var25 = -1494661300;
               var24 = var10000;
               var10000 = (var24 | var25) & ~(var24 & var25);
               var25 = -1948691442;
               var24 = var10000;
               var10000 = var24 + var25 - 2 * (var24 & var25);
               var401 = (int)-6334503751159705731L;
               var25 = -1318883545;
               var24 = var401;
               var401 = var24 + var25 - 2 * (var24 & var25);
               var25 = -843311576;
               var24 = var401;
               var25 = (var24 | var25) & ~(var24 & var25);
               var24 = var10000;
               var10000 = var24 - ~var25 - 1;
               var25 = 1086361824;
               var24 = 1470733593;
               var10000 = (var24 | var25) & (~var24 | ~var25);
               var25 = -1982713972;
               var24 = var10000;
               int var35 = var24 & ~var25 | ~var24 & var25;
            }
         } else if (var19 == 0) {
            return;
         }

         if (!var10) {
            GuiInput.g();
         }
      } else {
         float var26;
         float var27;
         label150: {
            float var352 = var3 + var5;
            var25 = 1376289602;
            var24 = 550439484;
            int var415 = var24 & ~var25 | ~var24 & var25;
            var25 = -900696992;
            var24 = var415;
            var415 = ((var24 | var25) - (var24 & var25)) * ((var24 | var25) - (var24 & var25));
            float var353 = var352 - 11.0F;
            var415 = (int)-5871173876176207889L;
            var25 = -1557776511;
            var24 = var415;
            var415 = (var24 | var25) - (var24 & var25);
            var25 = -377262309;
            var24 = var415;
            var415 = (var24 | var25) & (~var24 | ~var25);
            var25 = -575335936;
            var24 = 1362101313;
            int var445 = (var24 | var25) & ~(var24 & var25);
            var25 = -1933460249;
            var24 = var445;
            var25 = var24 + var25 - 2 * (var24 & var25);
            var24 = var415;
            var415 = (var24 | var25) + (var24 & var25);
            var26 = var353 - 19.5F;
            var25 = -1425126443;
            var24 = 1841637593;
            var445 = (var24 | var25) - (var24 & var25);
            var25 = -959749345;
            var24 = var445;
            var445 = (var24 | var25) & ~(var24 & var25);
            var445 = (int)6914041799247305763L;
            var25 = 529966691;
            var24 = var445;
            var445 = (var24 | var25) & ~(var24 & var25);
            var25 = 1103116876;
            var24 = var445;
            var445 = (var24 | var25) - (var24 & var25);
            var27 = var4 + 8.5F;
            if (!var10) {
               int var465 = (int)33800601992672629L;
               var25 = 4650656;
               var24 = var465;
               var465 = (var24 | var25) & (~var24 | ~var25);
               var25 = -357481514;
               var24 = var465;
               var465 = (var24 | var25) - (var24 & var25);
               var25 = -321322422;
               var24 = -193974092;
               var465 = var24 & ~var25 | ~var24 & var25;
               var25 = -2119245136;
               var24 = var465;
               var465 = var24 & ~var25 | ~var24 & var25;
               if (GuiInput.a(var26, var27, 19.5F, 19.5F, var6, var7)) {
                  var25 = 517909025;
                  var24 = -1762179428;
                  var10000 = var24 + var25 - 2 * (var24 & var25);
                  var25 = -2010518340;
                  var24 = var10000;
                  var10000 = var24 + var25 - 2 * (var24 & var25);
                  break label150;
               }

               var25 = -2062122773;
               var24 = 1558904486;
               var10000 = (var24 | var25) & ~(var24 & var25);
               var25 = -1827390611;
               var24 = var10000;
               var10000 = (var24 + var25 - 2 * (var24 & var25)) * (var24 + var25 - 2 * (var24 & var25));
               var10000 = (int)5989505285104229906L;
               var25 = -1291648350;
               var24 = var10000;
               var10000 = (var24 | var25) & ~(var24 & var25);
               var25 = 29765875;
               var24 = var10000;
               int var36 = (var24 | var25) - (var24 & var25);
               b = var36;
               String var358 = "bhg";
               var25 = -1893762418;
               var24 = 1276101322;
               var10000 = (var24 | var25) & ~(var24 & var25);
               var25 = -1389758585;
               var24 = var10000;
               if (((var24 | var25) & (~var24 | ~var25)) <= b) {
                  var10000 = (int)2510195372902867466L;
                  var25 = 532829555;
                  var24 = var10000;
                  var10000 = (var24 | var25) & (~var24 | ~var25);
                  var25 = -680288159;
                  var24 = var10000;
                  var10000 = (var24 | var25) & ~(var24 & var25);
                  var25 = -1163157564;
                  var24 = 781162527;
                  var415 = (var24 | var25) - (var24 & var25);
                  var25 = 441983949;
                  var24 = var415;
                  var25 = (var24 | var25) - (var24 & var25);
                  var24 = var10000;
                  var10000 = (var24 & ~var25) + (var25 & ~var24) + 2 * (var24 & var25);
                  var10000 = (int)-8359227700796878497L;
                  var25 = -1777933813;
                  var24 = var10000;
                  var10000 = (var24 | var25) & ~(var24 & var25);
                  var25 = -30321941;
                  var24 = var10000;
                  var36 = var24 + var25 - 2 * (var24 & var25);
                  b = var36;
               }
            }

            var10000 = (int)-2442306757378538321L;
            var25 = -444479573;
            var24 = var10000;
            var10000 = (var24 | var25) - (var24 & var25);
            var25 = 1214989060;
            var24 = var10000;
            var10000 = (var24 | var25) & ~(var24 & var25);
         }

         int var28;
         label144: {
            var28 = var10000;
            if (!var10) {
               var25 = -1912540783;
               var24 = -508240428;
               int var470 = var24 & ~var25 | ~var24 & var25;
               var25 = 859914872;
               var24 = var470;
               var470 = ((var24 | var25) & ~(var24 & var25)) * ((var24 | var25) & ~(var24 & var25));
               if (GuiInput.a(var3, var4, var5, 36.5F, var6, var7)) {
                  var10000 = (int)-704336782911999469L;
                  var25 = -1891668631;
                  var24 = var10000;
                  var10000 = var24 + var25 - 2 * (var24 & var25);
                  var25 = -210329733;
                  var24 = var10000;
                  var10000 = (var24 | var25) - (var24 & var25);
                  break label144;
               }
            }

            var10000 = (int)8507703215958872491L;
            var25 = 897963459;
            var24 = var10000;
            var10000 = var24 & ~var25 | ~var24 & var25;
            var25 = -64453528;
            var24 = var10000;
            var10000 = var24 & ~var25 | ~var24 & var25;
         }

         int var29 = var10000;
         if (var29 != 0 && var28 == 0) {
            var10000 = (int)-6983335392284117347L;
            var25 = 47409602;
            var24 = var10000;
            var10000 = var24 + var25 - 2 * (var24 & var25);
            var25 = -1045520546;
            var24 = var10000;
            var10000 = var24 + var25 - 2 * (var24 & var25);
         } else {
            var10000 = (int)7556622272840941932L;
            var25 = -525169977;
            var24 = var10000;
            var10000 = (var24 | var25) & (~var24 | ~var25);
            var25 = 1120914347;
            var24 = var10000;
            var10000 = var24 & ~var25 | ~var24 & var25;
         }

         int var30 = var10000;
         this.a(this.G, pulse.Bool.from(var30), this.K, var10);
         int var423;
         if (!var10 && var30 != 0) {
            var25 = -1992431825;
            var24 = 758035314;
            var423 = var24 + var25 - 2 * (var24 & var25);
            var25 = -1542237092;
            var24 = var423;
            var423 = (var24 | var25) & (~var24 | ~var25);
         } else {
            var25 = -1041726291;
            var24 = -56466639;
            var423 = var24 + var25 - 2 * (var24 & var25);
            var25 = 1028319132;
            var24 = var423;
            var423 = (var24 | var25) & ~(var24 & var25);
         }

         this.K = pulse.Bool.from(var423);
         this.a(this.J, pulse.Bool.from(var28), this.N, var10);
         if (!var10 && var28 != 0) {
            var423 = (int)-1997796339408065968L;
            var25 = 931728280;
            var24 = var423;
            var423 = var24 + var25 - 2 * (var24 & var25);
            var25 = 1602789833;
            var24 = var423;
            var423 = (var24 | var25) - (var24 & var25);
         } else {
            var25 = 1325652400;
            var24 = 1773064624;
            var423 = (var24 | var25) - (var24 & var25);
            var25 = 648873984;
            var24 = var423;
            var423 = var24 & ~var25 | ~var24 & var25;
         }

         this.N = pulse.Bool.from(var423);
         this.a(var1, var2, var3, var4, var5, var9, var13, var14);
         this.a(var1, var2, var3, var4, var6, var7, var9, var8);
         this.a(var1, var2, var26, var27, var9);
         if (var28 != 0 && !var10) {
            GuiInput.g();
         }
      }
   }

   private void a(AnimationState var1, boolean var2, boolean var3, boolean var4) {
      if (var4 && var3) {
         int var39 = (int)2396763714229829129L;
         int var25 = 1220754272;
         int var11 = var39;
         var39 = (var11 | var25) - (var11 & var25);
         var25 = 234210656;
         var11 = var39;
         var39 = var11 & ~var25 | ~var11 & var25;
         var39 = (int)2115932528567642687L;
         var25 = -208715147;
         var11 = var39;
         var39 = var11 + var25 - 2 * (var11 & var25);
         var25 = 2121836617;
         var11 = var39;
         var39 = (var11 | var25) & ~(var11 & var25);
         var39 = (int)4167603322358608978L;
         var25 = 1640054139;
         var11 = var39;
         var39 = (var11 | var25) & (~var11 | ~var25);
         var25 = 1747781927;
         var11 = var39;
         var39 = var11 + var25 - 2 * (var11 & var25);
         var25 = -531632954;
         var11 = 887194669;
         var39 = (var11 | var25) & ~(var11 & var25);
         var25 = -726767366;
         var11 = var39;
         var39 = (var11 | var25) & (~var11 | ~var25);
         var39 = (int)7736928665539482247L;
         var25 = -1421650518;
         var11 = var39;
         var39 = var11 & ~var25 | ~var11 & var25;
         var25 = -1320696031;
         var11 = var39;
         var39 = (var11 | var25) & (~var11 | ~var25);
         var1.a(0.0, 0.15, pulse.Easing.h);
      } else if (!var4 && var2 != var3) {
         double var10001 = !var2 ? 0.0 : 1.0;
         int var10002 = (int)-8767296971856243220L;
         int var6 = 1899736562;
         int var5 = var10002;
         var10002 = (var5 | var6) - (var5 & var6);
         var6 = 1021163732;
         var5 = var10002;
         var10002 = (var5 | var6) & ~(var5 & var6);
         int var10003 = (int)6768167638374810492L;
         var6 = 909131172;
         var5 = var10003;
         var10003 = var5 & ~var6 | ~var5 & var6;
         var6 = 1328028531;
         var5 = var10003;
         var6 = (var5 | var6) & ~(var5 & var6);
         var5 = var10002;
         var10002 = var5 - ~var6 - 1;
         var1.a(var10001, 0.15, pulse.Easing.h);
      }
   }

   private void a(MatrixStack var1, Renderer2D var2, float var3, float var4, float var5, int var6, float var7, float var8) {
      Color var9;
      Color var10;
      Color var11;
      Color var12;
      if (!this.F.f()) {
         Color var13 = n;
         Color var14 = o;
         Color var15 = r;
         Color var16 = s;
         var9 = pulse.Theme.a(ColorUtils.a(var13, var15, var8), var6);
         var10 = pulse.Theme.a(ColorUtils.a(var14, var16, var8), var6);
         Color var17 = ColorUtils.a(l, t, var7);
         Color var18 = ColorUtils.a(m, u, var7);
         Color var19 = ColorUtils.a(p, v, var7);
         Color var20 = ColorUtils.a(q, w, var7);
         var11 = pulse.Theme.a(ColorUtils.a(var17, var19, var8), var6);
         var12 = pulse.Theme.a(ColorUtils.a(var18, var20, var8), var6);
      } else {
         var9 = pulse.Theme.a(z, var6);
         var10 = pulse.Theme.a(A, var6);
         var11 = pulse.Theme.a(ColorUtils.a(x, B, var7), var6);
         var12 = pulse.Theme.a(ColorUtils.a(y, C, var7), var6);
         int var10000 = (int)-6913327125791496315L;
         int var24 = -543346271;
         int var23 = var10000;
         var10000 = var23 + var24 - 2 * (var23 & var24);
         var24 = 640659226;
         var23 = var10000;
         var10000 = (var23 & ~var24 | ~var23 & var24) * (var23 & ~var24 | ~var23 & var24);
         var24 = 2082559228;
         var23 = -1654657920;
         var10000 = (var23 | var24) & ~(var23 & var24);
         var24 = -124252117;
         var23 = var10000;
         int var22 = (var23 | var24) & ~(var23 & var24);
         String var103 = "bhm";
         var10000 = (int)8473891493297328386L;
         var24 = 1842017381;
         var23 = var10000;
         var10000 = var23 & ~var24 | ~var23 & var24;
         var24 = -626138902;
         var23 = var10000;
         if (((var23 | var24) & ~(var23 & var24)) >= var22) {
            var24 = 250249411;
            var23 = 709713495;
            var10000 = (var23 | var24) & ~(var23 & var24);
            var24 = -1743096391;
            var23 = var10000;
            var10000 = var23 + var24 - 2 * (var23 & var24);
            int var10001 = (int)-8432296615712590728L;
            var24 = 803990761;
            var23 = var10001;
            var10001 = (var23 | var24) & (~var23 | ~var24);
            var24 = 587665709;
            var23 = var10001;
            var24 = (var23 | var24) & (~var23 | ~var24);
            var23 = var10000;
            var10000 = (var23 ^ var24) + 2 * (var23 & var24);
            var10000 = (int)4673717486854483341L;
            var24 = -880853393;
            var23 = var10000;
            var10000 = (var23 | var24) & ~(var23 & var24);
            var24 = -598126054;
            var23 = var10000;
            var22 = (var23 | var24) & ~(var23 & var24);
            b = var22;
         }
      }

      int var10003 = (int)-2039829602742709102L;
      int var75 = 272863336;
      int var38 = var10003;
      var10003 = var38 + var75 - 2 * (var38 & var75);
      var75 = -1234025224;
      var38 = var10003;
      var10003 = (var38 | var75) & (~var38 | ~var75);
      var10003 = (int)-9120941467693819915L;
      var75 = -600046354;
      var38 = var10003;
      var10003 = var38 & ~var75 | ~var38 & var75;
      var75 = -2067344615;
      var38 = var10003;
      var10003 = (var38 | var75) - (var38 & var75);
      var75 = -888186345;
      var38 = -894514643;
      var10003 = var38 & ~var75 | ~var38 & var75;
      var75 = 27365438;
      var38 = var10003;
      var10003 = (var38 | var75) & ~(var38 & var75);
      var75 = 363040138;
      var38 = 20411300;
      var10003 = (var38 | var75) & ~(var38 & var75);
      var75 = 345308732;
      var38 = var10003;
      var10003 = (var38 | var75) & (~var38 | ~var75);
      float var112 = var3 - 0.5F;
      var10003 = (int)-4758414736750691515L;
      var75 = -973636577;
      var38 = var10003;
      var10003 = var38 & ~var75 | ~var38 & var75;
      var75 = -1548694815;
      var38 = var10003;
      var10003 = var38 + var75 - 2 * (var38 & var75);
      var75 = 1106798462;
      var38 = 858724610;
      int var10004 = (var38 | var75) & (~var38 | ~var75);
      var75 = 220977200;
      var38 = var10004;
      var75 = (var38 | var75) & (~var38 | ~var75);
      var38 = var10003;
      var10003 = var38 - ~var75 - 1;
      float var10002 = var4 - 0.5F;
      float var126 = var5 + 1.0F;
      String var127 = "bhn";
      var75 = -1459101468;
      var38 = -1000494135;
      int var10006 = (var38 | var75) & (~var38 | ~var75);
      var75 = 1834634047;
      var38 = var10006;
      var10006 = (var38 | var75) & (~var38 | ~var75);
      var75 = -1177419717;
      var38 = -544469209;
      var10006 = (var38 | var75) & (~var38 | ~var75);
      var75 = 1717440275;
      var38 = var10006;
      var10006 = (var38 | var75) - (var38 & var75);
      var10006 = (int)5814251361108377551L;
      var75 = -364305604;
      var38 = var10006;
      var10006 = (var38 | var75) & ~(var38 & var75);
      var75 = 804986096;
      var38 = var10006;
      var10006 = (var38 | var75) & ~(var38 & var75);
      var10006 = (int)6167646130267677219L;
      var75 = -229763610;
      var38 = var10006;
      var10006 = var38 & ~var75 | ~var38 & var75;
      var75 = -1532692523;
      var38 = var10006;
      var10006 = (var38 | var75) & (~var38 | ~var75);
      var2.a(var112, var10002, var126, 37.5F, 9.5F, var9, var9, var10, var10, var1);
      var10004 = (int)-6144673956132923893L;
      var75 = 986908875;
      var38 = var10004;
      var10004 = (var38 | var75) & (~var38 | ~var75);
      var75 = -1961646503;
      var38 = var10004;
      var10004 = (var38 | var75) & (~var38 | ~var75);
      var75 = -1366032900;
      var38 = -394783236;
      int var10005 = (var38 | var75) & (~var38 | ~var75);
      var75 = -1480107496;
      var38 = var10005;
      var10005 = var38 + var75 - 2 * (var38 & var75);
      var2.a(var3, var4, var5, 36.5F, 9.5F, var11, var11, var12, var12, var1);
   }

   private void a(MatrixStack var1, Renderer2D var2, float var3, float var4, int var5, int var6, int var7, float var8) {
      int var10001 = (int)8449152304408753297L;
      int var30 = -1886181665;
      int var29 = var10001;
      var10001 = var29 + var30 - 2 * (var29 & var30);
      var30 = -756559294;
      var29 = var10001;
      FontRenderer var9 = FontManager.a[var29 + var30 - 2 * (var29 & var30)];
      var30 = -457369279;
      var29 = 152410397;
      var10001 = (var29 | var30) & ~(var29 & var30);
      var30 = -307724205;
      var29 = var10001;
      FontRenderer var10 = FontManager.b[var29 + var30 - 2 * (var29 & var30)];
      var10001 = (int)3835029856894252402L;
      var30 = -92338790;
      var29 = var10001;
      var10001 = (var29 | var30) - (var29 & var30);
      var30 = -112332569;
      var29 = var10001;
      FontRenderer var11 = FontManager.b[var29 & ~var30 | ~var29 & var30];
      String var546 = "bho";
      float var12 = var3 + 11.0F;
      String var547 = "bhp";
      float var13 = var4 + 9.0F;
      int var10002 = (int)7779264001138337390L;
      var30 = 484419848;
      var29 = var10002;
      var10002 = (var29 | var30) & (~var29 | ~var30);
      var30 = 753937333;
      var29 = var10002;
      var10002 = var29 & ~var30 | ~var29 & var30;
      var30 = -2028580409;
      var29 = 1504725851;
      int var10003 = (var29 | var30) & (~var29 | ~var30);
      var30 = 1797184969;
      var29 = var10003;
      var10003 = var29 + var30 - 2 * (var29 & var30);
      var30 = 715393423;
      var29 = -797481782;
      int var10004 = (var29 | var30) & ~(var29 & var30);
      var30 = -64320996;
      var29 = var10004;
      var30 = var29 & ~var30 | ~var29 & var30;
      var29 = var10003;
      var10003 = var29 - ~var30 - 1;
      var30 = -982817673;
      var29 = -897906297;
      var10004 = (var29 | var30) - (var29 & var30);
      var30 = -440711899;
      var29 = var10004;
      var10004 = ((var29 | var30) - (var29 & var30)) * ((var29 | var30) - (var29 & var30));
      var10004 = (int)8205931817902687828L;
      var30 = 1677210106;
      var29 = var10004;
      var10004 = var29 + var30 - 2 * (var29 & var30);
      var30 = 1643301597;
      var29 = var10004;
      var10004 = (var29 | var30) & (~var29 | ~var30);
      var30 = 2020278858;
      var29 = -496469389;
      int var10005 = (var29 | var30) & (~var29 | ~var30);
      var30 = 2077348581;
      var29 = var10005;
      var10005 = var29 + var30 - 2 * (var29 & var30);
      var10005 = (int)-8836041236985167300L;
      var30 = -570142496;
      var29 = var10005;
      var10005 = (var29 | var30) - (var29 & var30);
      var30 = -1079835012;
      var29 = var10005;
      var10005 = var29 & ~var30 | ~var29 & var30;
      int var10006 = (int)2160819832133320385L;
      var30 = -165577267;
      var29 = var10006;
      var10006 = var29 + var30 - 2 * (var29 & var30);
      var30 = -551923141;
      var29 = var10006;
      var10006 = var29 & ~var30 | ~var29 & var30;
      var30 = -84891478;
      var29 = -107383170;
      var10006 = (var29 | var30) - (var29 & var30);
      var30 = 302710642;
      var29 = var10006;
      var10006 = (var29 | var30) & ~(var29 & var30);
      int var10008 = (int)-7469392484077096874L;
      var30 = -848633761;
      var29 = var10008;
      var10008 = var29 + var30 - 2 * (var29 & var30);
      var30 = -134852597;
      var29 = var10008;
      var10008 = (var29 | var30) - (var29 & var30);
      var10008 = (int)-1329801871406838022L;
      var30 = 97536065;
      var29 = var10008;
      var10008 = (var29 | var30) & (~var29 | ~var30);
      var30 = 1559561899;
      var29 = var10008;
      var10008 = var29 & ~var30 | ~var29 & var30;
      int var10007 = (int)279453135667363587L;
      var30 = -411079667;
      var29 = var10007;
      var10007 = var29 + var30 - 2 * (var29 & var30);
      var30 = -1783807255;
      var29 = var10007;
      float var10000 = var13
         + var9.b(
            a("гЎґ", "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘ґ~\ua7efк’¶кЃєк¤‚зµЈи№ѓ\u2435и¬єг‘І|кџік“єкЃІк¤Љзµёи№Њв‘іи¬°г‘¤=кџ…к’єкЃїк¤ѓзµїи№Ќ\u2453и¬Јг‘І\u007fкџѓк’№кЃґк¤€зµіи№„в‘®", var10004, var10005, var10006, (var29 | var30) & (~var29 | ~var30))
         );
      String var548 = "bhq";
      float var14 = var10000 - 6.0F;
      Color var15 = pulse.Theme.a(pulse.Theme.b, var7);
      Color var16 = pulse.Theme.a(pulse.Theme.a, var7);
      Color var17 = pulse.Theme.a(pulse.Theme.b, var7);
      var9.a(this.F.d(), var12, var13, var15, var1);
      if (!this.X) {
         float var18 = var10.a(this.F.a());
         var10.a(this.F.a(), var12, var14, var16, var1);
         var10000 = var12 + var18;
         var10001 = (int)2614306140320978711L;
         var30 = -1950363332;
         var29 = var10001;
         var10001 = (var29 | var30) & (~var29 | ~var30);
         var30 = 1469560844;
         var29 = var10001;
         var10001 = var29 + var30 - 2 * (var29 & var30);
         float var19 = var10000 + 5.0F;
         var10002 = (int)615679109500031646L;
         var30 = -1008515087;
         var29 = var10002;
         var10002 = (var29 | var30) & (~var29 | ~var30);
         var30 = -986742089;
         var29 = var10002;
         var10002 = (var29 | var30) - (var29 & var30);
         String var656 = "bhw";
         String var692 = "bhx";
         var10004 = (int)7849223128567339693L;
         var30 = -1047356288;
         var29 = var10004;
         var10004 = (var29 | var30) & ~(var29 & var30);
         var30 = 129727326;
         var29 = var10004;
         var10004 = (var29 | var30) - (var29 & var30);
         var10006 = (int)364696858067191777L;
         var30 = -1558283466;
         var29 = var10006;
         var10006 = var29 & ~var30 | ~var29 & var30;
         var30 = -1865040675;
         var29 = var10006;
         var10006 = var29 & ~var30 | ~var29 & var30;
         var10006 = (int)8239395010222363345L;
         var30 = 1381113777;
         var29 = var10006;
         var10006 = var29 + var30 - 2 * (var29 & var30);
         var30 = -566489751;
         var29 = var10006;
         var10006 = (var29 | var30) & (~var29 | ~var30);
         var30 = -60907;
         var29 = 1032120227;
         var10006 = var29 & ~var30 | ~var29 & var30;
         var30 = -1032063556;
         var29 = var10006;
         var10006 = var29 & ~var30 | ~var29 & var30;
         var10005 = (int)7410601160282940803L;
         var30 = -1860319077;
         var29 = var10005;
         var10005 = var29 + var30 - 2 * (var29 & var30);
         var30 = -2102260840;
         var29 = var10005;
         var10005 = var29 & ~var30 | ~var29 & var30;
         String var779 = "bhy";
         var30 = -1002277222;
         var29 = -196726964;
         var10006 = var29 + var30 - 2 * (var29 & var30);
         var30 = 829266026;
         var29 = var10006;
         var10006 = (var29 | var30) - (var29 & var30);
         String var803 = "bhz";
         var10007 = (int)-1094351384400264295L;
         var30 = -1393140126;
         var29 = var10007;
         var10007 = (var29 | var30) - (var29 & var30);
         var30 = 1705737788;
         var29 = var10007;
         var10000 = var14
            + var10.b(
                  a(
                     "гЎґ",
                     "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘ґ~\ua7efк’¶кЃєк¤‚зµЈи№ѓ\u2435и¬єг‘І|кџік“єкЃІк¤Љзµёи№Њв‘іи¬°г‘¤=кџ…к’єкЃїк¤ѓзµїи№Ќ\u2453и¬Јг‘І\u007fкџѓк’№кЃґк¤€зµіи№„в‘®",
                     var10004,
                     var10005,
                     var10006,
                     (var29 | var30) & ~(var29 & var30)
                  )
               )
               / 2.0F;
         var10001 = (int)-273783553996637406L;
         var30 = -610456187;
         var29 = var10001;
         var10001 = (var29 | var30) - (var29 & var30);
         var30 = -2018108768;
         var29 = var10001;
         var10001 = var29 & ~var30 | ~var29 & var30;
         float var20 = var10000 - 5.0F;
         var10004 = (int)7462836784415106268L;
         var30 = -1668539555;
         var29 = var10004;
         var10004 = var29 + var30 - 2 * (var29 & var30);
         var30 = 1665925010;
         var29 = var10004;
         var10004 = var29 + var30 - 2 * (var29 & var30);
         var30 = 1107780903;
         var29 = -96045667;
         var10004 = (var29 | var30) - (var29 & var30);
         var30 = -1203695445;
         var29 = var10004;
         var10004 = var29 + var30 - 2 * (var29 & var30);
         var10004 = (int)-1808873497748408967L;
         var30 = 1595244882;
         var29 = var10004;
         var10004 = (var29 | var30) - (var29 & var30);
         var30 = 1677980706;
         var29 = var10004;
         var10004 = var29 + var30 - 2 * (var29 & var30);
         String var704 = "bia";
         var30 = 96926867;
         var29 = 158334564;
         var10005 = var29 + var30 - 2 * (var29 & var30);
         var30 = 871601560;
         var29 = var10005;
         var10005 = (var29 | var30) & (~var29 | ~var30);
         var10006 = (int)3683865809915841652L;
         var30 = 600053763;
         var29 = var10006;
         var10006 = var29 + var30 - 2 * (var29 & var30);
         var30 = -1438919558;
         var29 = var10006;
         var30 = (var29 | var30) - (var29 & var30);
         var29 = var10005;
         var10005 = var29 - ~var30 - 1;
         var2.a(var19, var20, 3.0F, 3.0F, 1.5F, var17, var1);
         var30 = -81995393;
         var29 = 841964481;
         var10001 = (var29 | var30) & (~var29 | ~var30);
         var30 = -89099382;
         var29 = var10001;
         var10001 = (var29 | var30) & ~(var29 & var30);
         var10000 = var19 + 3.0F;
         String var557 = "bib";
         float var21 = var10000 + 5.0F;
         String var533;
         if (this.F.b() != null) {
            var533 = this.F.b();
         } else {
            int var534 = (int)8931913244519062884L;
            var30 = -1655049016;
            var29 = var534;
            int var535 = var29 + var30 - 2 * (var29 & var30);
            var30 = -1440418192;
            var29 = var535;
            int var536 = (var29 | var30) - (var29 & var30);
            String var558 = "bic";
            var30 = -210870089;
            var29 = -350057211;
            var10003 = (var29 | var30) & ~(var29 & var30);
            var30 = 407694771;
            var29 = var10003;
            var10003 = (var29 | var30) & (~var29 | ~var30);
            var30 = 702797293;
            var29 = -1508544939;
            var10002 = (var29 | var30) & ~(var29 & var30);
            var30 = 2094401227;
            var29 = var10002;
            var10002 = var29 + var30 - 2 * (var29 & var30);
            var10003 = (int)-1646860593977861506L;
            var30 = -1350164505;
            var29 = var10003;
            var10003 = var29 + var30 - 2 * (var29 & var30);
            var30 = -2137408816;
            var29 = var10003;
            var10003 = ((var29 | var30) & ~(var29 & var30)) * ((var29 | var30) & ~(var29 & var30));
            var30 = 571489452;
            var29 = 1001548729;
            var10003 = (var29 | var30) - (var29 & var30);
            var30 = 136671215;
            var29 = var10003;
            var10003 = var29 + var30 - 2 * (var29 & var30);
            var10004 = (int)7004092750452980322L;
            var30 = 1119173422;
            var29 = var10004;
            var10004 = (var29 | var30) & ~(var29 & var30);
            var30 = -923828773;
            var29 = var10004;
            var10004 = (var29 | var30) - (var29 & var30);
            var30 = -1200514628;
            var29 = 1742002929;
            var10004 = (var29 | var30) & (~var29 | ~var30);
            var30 = -634255118;
            var29 = var10004;
            var10004 = (var29 | var30) & ~(var29 & var30);
            var10005 = (int)3666867978348874185L;
            var30 = -193961173;
            var29 = var10005;
            var10005 = (var29 | var30) - (var29 & var30);
            var30 = -2014822403;
            var29 = var10005;
            var10005 = (var29 & ~var30 | ~var29 & var30) * (var29 & ~var30 | ~var29 & var30);
            var30 = -1049297630;
            var29 = -1057762037;
            var10005 = (var29 | var30) & ~(var29 & var30);
            var30 = 27123304;
            var29 = var10005;
            var533 = a(
               "гЎ зЌ©гЎћзЌ©гЎљзЌ°гЎ›",
               "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘ґ~\ua7efк’¶кЃєк¤‚зµЈи№ѓ\u2435и¬єг‘І|кџік“єкЃІк¤Љзµёи№Њв‘іи¬°г‘¤=кџ…к’єкЃїк¤ѓзµїи№Ќ\u2453и¬Јг‘І\u007fкџѓк’№кЃґк¤€зµіи№„в‘®",
               var10002,
               var10003,
               var10004,
               (var29 | var30) & (~var29 | ~var30)
            );
         }

         String var22 = var533;
         var11.a(var22, var21, var14, var16, var1);
      } else {
         this.CosmeticModelLoader.a();
         if (this.CosmeticModelLoader.d()) {
            if (this.ModelPart) {
               var30 = -1284277731;
               var29 = -256129196;
               var10001 = (var29 | var30) & (~var29 | ~var30);
               var30 = 1137229129;
               var29 = var10001;
               var10001 = (var29 | var30) - (var29 & var30);
            } else {
               var10001 = (int)-1327588905569755766L;
               var30 = 226132646;
               var29 = var10001;
               var10001 = var29 & ~var30 | ~var29 & var30;
               var30 = -1766236371;
               var29 = var10001;
               var10001 = (var29 | var30) - (var29 & var30);
            }

            this.ModelPart = pulse.Bool.from(var10001);
            AnimationState var537 = this.CosmeticModelLoader;
            double var576;
            if (!this.ModelPart) {
               var10001 = (int)-16334387231830474L;
               var30 = 966056800;
               var29 = var10001;
               var10001 = (var29 | var30) & ~(var29 & var30);
               var30 = -982420066;
               var29 = var10001;
               var10001 = var29 & ~var30 | ~var29 & var30;
               var10002 = (int)-2171173786997634473L;
               var30 = -1651401181;
               var29 = var10002;
               var10002 = (var29 | var30) - (var29 & var30);
               var30 = 433712682;
               var29 = var10002;
               var30 = (var29 | var30) & ~(var29 & var30);
               var29 = var10001;
               var10001 = (var29 | var30) + (var29 & var30);
               var10001 = (int)6979601069983522907L;
               var30 = -1647633094;
               var29 = var10001;
               var10001 = (var29 | var30) & (~var29 | ~var30);
               var30 = 88110461;
               var29 = var10001;
               int var28 = (var29 | var30) - (var29 & var30);
               b = var28;
               String var569 = "bhr";
               var10001 = (int)-5887163547835767566L;
               var30 = 293006672;
               var29 = var10001;
               var10001 = (var29 | var30) & (~var29 | ~var30);
               var30 = -115835222;
               var29 = var10001;
               if ((var29 & ~var30 | ~var29 & var30) < b) {
                  var10001 = (int)-3733337284517346400L;
                  var30 = 1973566323;
                  var29 = var10001;
                  var10001 = var29 + var30 - 2 * (var29 & var30);
                  var30 = -1231334692;
                  var29 = var10001;
                  var10001 = ((var29 | var30) - (var29 & var30)) * ((var29 | var30) - (var29 & var30));
                  var30 = -1804224511;
                  var29 = 1901423500;
                  var10001 = (var29 | var30) - (var29 & var30);
                  var30 = 252347458;
                  var29 = var10001;
                  var28 = (var29 | var30) - (var29 & var30);
               }

               var10002 = (int)-6614656987357972375L;
               var30 = -507557413;
               var29 = var10002;
               var10002 = var29 + var30 - 2 * (var29 & var30);
               var30 = -188239428;
               var29 = var10002;
               var10002 = (var29 | var30) & (~var29 | ~var30);
               var30 = -950627187;
               var29 = -2064345253;
               var10002 = (var29 | var30) & (~var29 | ~var30);
               var30 = 1134691288;
               var29 = var10002;
               var10002 = (var29 | var30) & ~(var29 & var30);
               var30 = 1220229621;
               var29 = 1092295939;
               var10002 = var29 & ~var30 | ~var29 & var30;
               var30 = 161490172;
               var29 = var10002;
               var10002 = (var29 | var30) & ~(var29 & var30);
               var10002 = (int)-7872114426971637993L;
               var30 = 1581794656;
               var29 = var10002;
               var10002 = (var29 | var30) - (var29 & var30);
               var30 = 1399386745;
               var29 = var10002;
               var10002 = (var29 | var30) & ~(var29 & var30);
               var30 = 558837392;
               var29 = -536925183;
               var10002 = (var29 | var30) & ~(var29 & var30);
               var30 = -22019456;
               var29 = var10002;
               var10002 = (var29 | var30) - (var29 & var30);
               var576 = 0.3;
            } else {
               var576 = 1.0;
            }

            var30 = 1277492176;
            var29 = -1815950399;
            var10003 = (var29 | var30) - (var29 & var30);
            var30 = -538562560;
            var29 = var10003;
            var10003 = var29 + var30 - 2 * (var29 & var30);
            var30 = -437116986;
            var29 = -652001513;
            var10003 = (var29 | var30) & ~(var29 & var30);
            var30 = 1020338386;
            var29 = var10003;
            var10003 = (var29 | var30) & ~(var29 & var30);
            var30 = -1298556091;
            var29 = -1463374530;
            var10003 = var29 + var30 - 2 * (var29 & var30);
            var30 = 442447476;
            var29 = var10003;
            var10003 = var29 + var30 - 2 * (var29 & var30);
            var10003 = (int)2065426339800961888L;
            var30 = 1919799879;
            var29 = var10003;
            var10003 = (var29 | var30) & ~(var29 & var30);
            var30 = 1879015714;
            var29 = var10003;
            var10003 = var29 + var30 - 2 * (var29 & var30);
            var537.a(var576, 0.5, pulse.Easing.i);
         }

         float var31 = var10.a(this.Y);
         var30 = -2047394086;
         var29 = 194622367;
         var10001 = (var29 | var30) - (var29 & var30);
         var30 = -232274611;
         var29 = var10001;
         var10001 = (var29 | var30) - (var29 & var30);
         var10002 = (int)-231151347134625599L;
         var30 = -1536759629;
         var29 = var10002;
         var10002 = (var29 | var30) - (var29 & var30);
         var30 = 1561274174;
         var29 = var10002;
         var10002 = (var29 | var30) & (~var29 | ~var30);
         var10003 = (int)9062407275938308586L;
         var30 = 2139462907;
         var29 = var10003;
         var10003 = var29 & ~var30 | ~var29 & var30;
         var30 = -527345424;
         var29 = var10003;
         var30 = (var29 | var30) & (~var29 | ~var30);
         var29 = var10002;
         var10002 = var29 - ~var30 - 1;
         var10004 = (int)-6710449029694939987L;
         var30 = 1635293218;
         var29 = var10004;
         var10004 = (var29 | var30) - (var29 & var30);
         var30 = 1423148160;
         var29 = var10004;
         var10004 = (var29 | var30) - (var29 & var30);
         var10004 = (int)8969891651826511827L;
         var30 = -1791719707;
         var29 = var10004;
         var10004 = var29 & ~var30 | ~var29 & var30;
         var30 = 1508436281;
         var29 = var10004;
         var10004 = var29 + var30 - 2 * (var29 & var30);
         var10003 = (int)-2363654058521968755L;
         var30 = 353391585;
         var29 = var10003;
         var10003 = var29 + var30 - 2 * (var29 & var30);
         var30 = -875310817;
         var29 = var10003;
         var10003 = var29 + var30 - 2 * (var29 & var30);
         var10004 = (int)4402692550800386193L;
         var30 = -738707136;
         var29 = var10004;
         var10004 = (var29 | var30) & (~var29 | ~var30);
         var30 = -1954543422;
         var29 = var10004;
         var10004 = var29 & ~var30 | ~var29 & var30;
         var30 = 1723409082;
         var29 = -1360500031;
         var10004 = var29 & ~var30 | ~var29 & var30;
         var30 = -640607648;
         var29 = var10004;
         var10004 = (var29 | var30) & ~(var29 & var30);
         var10005 = (int)-75810614103945789L;
         var30 = -2145613701;
         var29 = var10005;
         var10005 = var29 & ~var30 | ~var29 & var30;
         var30 = -1533357343;
         var29 = var10005;
         var10005 = ((var29 | var30) & (~var29 | ~var30)) * ((var29 | var30) & (~var29 | ~var30));
         var30 = -2131717295;
         var29 = 489785688;
         var10005 = (var29 | var30) - (var29 & var30);
         var30 = -1645969071;
         var29 = var10005;
         var10005 = (var29 | var30) & (~var29 | ~var30);
         var30 = 515745541;
         var29 = -1130695334;
         var10007 = (var29 | var30) & ~(var29 & var30);
         var30 = -1574481317;
         var29 = var10007;
         var10007 = var29 + var30 - 2 * (var29 & var30);
         var10007 = (int)4930248424026880655L;
         var30 = -438410373;
         var29 = var10007;
         var10007 = (var29 | var30) & (~var29 | ~var30);
         var30 = 357784048;
         var29 = var10007;
         var10007 = var29 & ~var30 | ~var29 & var30;
         var10007 = (int)-8276360530127442803L;
         var30 = -705352685;
         var29 = var10007;
         var10007 = var29 & ~var30 | ~var29 & var30;
         var30 = 2101706893;
         var29 = var10007;
         var10007 = var29 + var30 - 2 * (var29 & var30);
         var10007 = (int)870552146982495023L;
         var30 = -1569569424;
         var29 = var10007;
         var10007 = (var29 | var30) & ~(var29 & var30);
         var30 = 355083859;
         var29 = var10007;
         var10007 = (var29 | var30) & ~(var29 & var30);
         var10006 = (int)137851758790367208L;
         var30 = 2009555867;
         var29 = var10006;
         var10006 = (var29 | var30) - (var29 & var30);
         var30 = -846218479;
         var29 = var10006;
         float var32 = var10.b(
            a("гЎґ", "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘ґ~\ua7efк’¶кЃєк¤‚зµЈи№ѓ\u2435и¬єг‘І|кџік“єкЃІк¤Љзµёи№Њв‘іи¬°г‘¤=кџ…к’єкЃїк¤ѓзµїи№Ќ\u2453и¬Јг‘І\u007fкџѓк’№кЃґк¤€зµіи№„в‘®", var10003, var10004, var10005, (var29 | var30) & ~(var29 & var30))
         );
         if (this.i()) {
            int var33 = Math.min(this.FriendCard, this.CosmeticModelRenderer);
            int var36 = Math.max(this.FriendCard, this.CosmeticModelRenderer);
            var30 = 1951484722;
            var29 = -425513705;
            var10001 = (var29 | var30) & (~var29 | ~var30);
            var30 = -1829607899;
            var29 = var10001;
            String var39 = this.Y.substring(var29 + var30 - 2 * (var29 & var30), var33);
            String var23 = this.Y.substring(var33, var36);
            float var24 = var12 + var10.a(var39);
            float var25 = var10.a(var23);
            var10002 = pulse.Theme.y.getRed();
            var10003 = pulse.Theme.y.getGreen();
            var10004 = pulse.Theme.y.getBlue();
            var30 = 356419895;
            var29 = 1515741814;
            var10005 = (var29 | var30) - (var29 & var30);
            var30 = 1332144913;
            var29 = var10005;
            Color var26 = pulse.Theme.a(new Color(var10002, var10003, var10004, (var29 | var30) & ~(var29 & var30)), var7);
            var10005 = (int)31240372166083498L;
            var30 = -642464634;
            var29 = var10005;
            var10005 = (var29 | var30) - (var29 & var30);
            var30 = 2066496551;
            var29 = var10005;
            var10005 = (var29 | var30) & ~(var29 & var30);
            var2.a(var24, var14, var25, var32 - 8.0F, 2.0F, var26, var1);
         }

         var10.a(this.Y, var12, var14, var16, var1);
         if (!this.i()) {
            float var34 = (float)this.CosmeticModelLoader.j();
            var30 = 518591553;
            var29 = -765233140;
            var10001 = (var29 | var30) - (var29 & var30);
            var30 = 619356752;
            var29 = var10001;
            var10001 = ((var29 | var30) & (~var29 | ~var30)) * ((var29 | var30) & (~var29 | ~var30));
            if (var34 > 0.1F) {
               var30 = -1289832079;
               var29 = 1438942082;
               var10001 = (var29 | var30) & (~var29 | ~var30);
               var30 = -421905677;
               var29 = var10001;
               String var37 = this.Y.substring((var29 | var30) & (~var29 | ~var30), this.aa);
               float var40 = var12 + var10.a(var37);
               var10001 = (int)-2173692988213070024L;
               var30 = -1535299177;
               var29 = var10001;
               var10001 = (var29 | var30) & ~(var29 & var30);
               var30 = 1724349361;
               var29 = var10001;
               var10001 = (var29 | var30) - (var29 & var30);
               float var42 = var32 - 9.0F;
               float var44 = var14 + 1.0F;
               Color var45 = pulse.Theme.a(pulse.Theme.y, (int)(var7 * var34));
               var10004 = (int)-1482557324901031691L;
               var30 = -1382786836;
               var29 = var10004;
               var10004 = var29 & ~var30 | ~var29 & var30;
               var30 = 1737144337;
               var29 = var10004;
               var10004 = (var29 | var30) & (~var29 | ~var30);
               var10005 = (int)647024766455569197L;
               var30 = -364953855;
               var29 = var10005;
               var10005 = (var29 | var30) & (~var29 | ~var30);
               var30 = 972324787;
               var29 = var10005;
               var10005 = (var29 + var30 - 2 * (var29 & var30)) * (var29 + var30 - 2 * (var29 & var30));
               var2.a(var40, var44, 1.5F, var42, 0.5F, var45, var1);
            }
         }

         var10000 = var12 + var31;
         var30 = -277626663;
         var29 = -882191146;
         var10001 = (var29 | var30) & (~var29 | ~var30);
         var30 = -1821567101;
         var29 = var10001;
         var10001 = (var29 & ~var30 | ~var29 & var30) * (var29 & ~var30 | ~var29 & var30);
         float var35 = var10000 + 5.0F;
         var30 = -1510225457;
         var29 = -1157425213;
         var10002 = (var29 | var30) - (var29 & var30);
         var30 = -914688360;
         var29 = var10002;
         var10002 = var29 + var30 - 2 * (var29 & var30);
         String var679 = "bhs";
         String var725 = "bht";
         var10004 = (int)-9192005544999048292L;
         var30 = 1416965295;
         var29 = var10004;
         var10004 = (var29 | var30) - (var29 & var30);
         var30 = -608388544;
         var29 = var10004;
         var10004 = (var29 | var30) - (var29 & var30);
         String var761 = "bhu";
         var10005 = (int)-9123671211522825325L;
         var30 = 608575121;
         var29 = var10005;
         var10005 = (var29 | var30) & (~var29 | ~var30);
         var30 = 1615514920;
         var29 = var10005;
         var10005 = (var29 | var30) & (~var29 | ~var30);
         var30 = 942555695;
         var29 = 1392704163;
         var10006 = (var29 | var30) & (~var29 | ~var30);
         var30 = -1112809178;
         var29 = var10006;
         var10006 = ((var29 | var30) - (var29 & var30)) * ((var29 | var30) - (var29 & var30));
         var30 = -2063333858;
         var29 = 1389047430;
         var10006 = (var29 | var30) & ~(var29 & var30);
         var30 = -829807986;
         var29 = var10006;
         var10006 = (var29 | var30) & ~(var29 & var30);
         var10008 = (int)1907951328606797616L;
         var30 = 691059590;
         var29 = var10008;
         var10008 = (var29 | var30) - (var29 & var30);
         var30 = -815332187;
         var29 = var10008;
         var10008 = (var29 | var30) & ~(var29 & var30);
         var30 = 836968751;
         var29 = 1803353974;
         var10008 = (var29 | var30) - (var29 & var30);
         var30 = 1520426568;
         var29 = var10008;
         var10008 = (var29 | var30) & ~(var29 & var30);
         var30 = 1175347120;
         var29 = -460992170;
         var10008 = (var29 | var30) - (var29 & var30);
         var30 = -1567912209;
         var29 = var10008;
         var10008 = (var29 | var30) & (~var29 | ~var30);
         var30 = -127565776;
         var29 = -426072227;
         var10008 = (var29 | var30) & (~var29 | ~var30);
         var30 = 520038271;
         var29 = var10008;
         var10008 = (var29 | var30) - (var29 & var30);
         var30 = 662371712;
         var29 = 1137813603;
         var10007 = (var29 | var30) & (~var29 | ~var30);
         var30 = 1692547218;
         var29 = var10007;
         var10000 = var14
            + var10.b(
                  a(
                     "гЎґ",
                     "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘ґ~\ua7efк’¶кЃєк¤‚зµЈи№ѓ\u2435и¬єг‘І|кџік“єкЃІк¤Љзµёи№Њв‘іи¬°г‘¤=кџ…к’єкЃїк¤ѓзµїи№Ќ\u2453и¬Јг‘І\u007fкџѓк’№кЃґк¤€зµіи№„в‘®",
                     var10004,
                     var10005,
                     var10006,
                     (var29 | var30) & ~(var29 & var30)
                  )
               )
               / 2.0F;
         var30 = 1323988522;
         var29 = -1110073944;
         var10001 = (var29 | var30) & (~var29 | ~var30);
         var30 = -1626659962;
         var29 = var10001;
         var10001 = ((var29 | var30) & ~(var29 & var30)) * ((var29 | var30) & ~(var29 & var30));
         float var38 = var10000 - 5.0F;
         var30 = -1589360595;
         var29 = 334838366;
         var10003 = var29 & ~var30 | ~var29 & var30;
         var30 = -1489181405;
         var29 = var10003;
         var10003 = var29 + var30 - 2 * (var29 & var30);
         String var729 = "bhv";
         var30 = -1204221671;
         var29 = 979896290;
         var10006 = var29 + var30 - 2 * (var29 & var30);
         var30 = -2108616982;
         var29 = var10006;
         var10006 = (var29 | var30) & (~var29 | ~var30);
         var30 = 411081215;
         var29 = 1475793236;
         var10006 = (var29 | var30) & (~var29 | ~var30);
         var30 = 1333151911;
         var29 = var10006;
         var10006 = var29 & ~var30 | ~var29 & var30;
         var2.a(var35, var38, 3.0F, 3.0F, 1.5F, var17, var1);
         var30 = -1240204614;
         var29 = -405214971;
         var10002 = (var29 | var30) - (var29 & var30);
         var30 = 1372263358;
         var29 = var10002;
         var10002 = (var29 | var30) & (~var29 | ~var30);
         var30 = 891734355;
         var29 = 343518150;
         var10002 = var29 & ~var30 | ~var29 & var30;
         var30 = 559899281;
         var29 = var10002;
         var10002 = (var29 | var30) & (~var29 | ~var30);
         var10000 = var35 + 3.0F;
         var30 = -2053466316;
         var29 = -199945971;
         var10001 = (var29 | var30) & (~var29 | ~var30);
         var30 = 246990018;
         var29 = var10001;
         var10001 = (var29 + var30 - 2 * (var29 & var30)) * (var29 + var30 - 2 * (var29 & var30));
         float var41 = var10000 + 5.0F;
         String var541;
         if (this.F.b() != null) {
            var541 = this.F.b();
            var30 = 317953035;
            var29 = -1757480580;
            var10002 = var29 & ~var30 | ~var29 & var30;
            var30 = -2050134663;
            var29 = var10002;
            var10002 = (var29 | var30) & (~var29 | ~var30);
            var10002 = (int)-6010155777043014527L;
            var30 = -1920526045;
            var29 = var10002;
            var10002 = (var29 | var30) - (var29 & var30);
            var30 = 1964098988;
            var29 = var10002;
            var10002 = (var29 | var30) & (~var29 | ~var30);
            var10001 = (int)-766611726386119500L;
            var30 = -353370891;
            var29 = var10001;
            var10001 = (var29 | var30) & ~(var29 & var30);
            var30 = -1647176140;
            var29 = var10001;
            int var47 = var29 + var30 - 2 * (var29 & var30);
            b = var47;
            var30 = 1081374837;
            var29 = 1197117317;
            var10002 = var29 & ~var30 | ~var29 & var30;
            var30 = 120518643;
            var29 = var10002;
            var10002 = var29 + var30 - 2 * (var29 & var30);
            var10002 = (int)-2874712430807751975L;
            var30 = 1589805675;
            var29 = var10002;
            var10002 = (var29 | var30) - (var29 & var30);
            var30 = 881811644;
            var29 = var10002;
            var10002 = var29 + var30 - 2 * (var29 & var30);
            var30 = 1140104488;
            var29 = 561161370;
            var10001 = (var29 | var30) & ~(var29 & var30);
            var30 = 822472877;
            var29 = var10001;
            if (var29 + var30 - 2 * (var29 & var30) < b) {
               var30 = 171592269;
               var29 = 1041087104;
               var10001 = (var29 | var30) & (~var29 | ~var30);
               var30 = 876081357;
               var29 = var10001;
               var10001 = var29 & ~var30 | ~var29 & var30;
               var10002 = (int)499599858133016518L;
               var30 = -1837166647;
               var29 = var10002;
               var10002 = (var29 | var30) & (~var29 | ~var30);
               var30 = 463835151;
               var29 = var10002;
               var10001 /= (var29 | var30) & (~var29 | ~var30);
            }
         } else {
            var30 = 95587201;
            var29 = 1817272920;
            var10001 = var29 & ~var30 | ~var29 & var30;
            var30 = 1776544208;
            var29 = var10001;
            var10001 = (var29 | var30) - (var29 & var30);
            var10001 = (int)8746301695272994411L;
            var30 = 624855997;
            var29 = var10001;
            var10001 = (var29 | var30) - (var29 & var30);
            var30 = 1746554327;
            var29 = var10001;
            var10001 = (var29 | var30) & (~var29 | ~var30);
            var30 = 707048092;
            var29 = -1215264874;
            var10001 = (var29 | var30) & (~var29 | ~var30);
            var30 = 1976886821;
            var29 = var10001;
            var10001 = (var29 & ~var30 | ~var29 & var30) * (var29 & ~var30 | ~var29 & var30);
            var10002 = (int)-6589776864143260858L;
            var30 = -1136164122;
            var29 = var10002;
            var10002 = (var29 | var30) & ~(var29 & var30);
            var30 = 1989254060;
            var29 = var10002;
            var10002 = ((var29 | var30) & ~(var29 & var30)) * ((var29 | var30) & ~(var29 & var30));
            var30 = 1248594043;
            var29 = -164439855;
            var10002 = (var29 | var30) & ~(var29 & var30);
            var30 = 1333685721;
            var29 = var10002;
            var10002 = (var29 | var30) - (var29 & var30);
            var30 = -659752461;
            var29 = 764221266;
            var10003 = var29 & ~var30 | ~var29 & var30;
            var30 = 217201826;
            var29 = var10003;
            var10003 = (var29 | var30) & ~(var29 & var30);
            var10003 = (int)8694080701657877719L;
            var30 = -366090626;
            var29 = var10003;
            var10003 = var29 + var30 - 2 * (var29 & var30);
            var30 = 1169517169;
            var29 = var10003;
            var10003 = var29 & ~var30 | ~var29 & var30;
            var30 = -1167653160;
            var29 = -720554195;
            var10004 = (var29 | var30) & ~(var29 & var30);
            var30 = 412785927;
            var29 = var10004;
            var10004 = ((var29 | var30) & ~(var29 & var30)) * ((var29 | var30) & ~(var29 & var30));
            var10004 = (int)8578410805004957081L;
            var30 = -2021145049;
            var29 = var10004;
            var10004 = (var29 | var30) - (var29 & var30);
            var30 = -1048506661;
            var29 = var10004;
            var10004 = (var29 | var30) & ~(var29 & var30);
            var10006 = (int)-6222671126711316462L;
            var30 = 497986849;
            var29 = var10006;
            var10006 = var29 & ~var30 | ~var29 & var30;
            var30 = 1340374333;
            var29 = var10006;
            var10006 = var29 + var30 - 2 * (var29 & var30);
            var10006 = (int)8995554538239438410L;
            var30 = -1912080757;
            var29 = var10006;
            var10006 = var29 + var30 - 2 * (var29 & var30);
            var30 = -1485973308;
            var29 = var10006;
            var10006 = var29 + var30 - 2 * (var29 & var30);
            var30 = 1618866416;
            var29 = 1435531268;
            var10006 = (var29 | var30) & (~var29 | ~var30);
            var30 = 904759550;
            var29 = var10006;
            var10006 = var29 + var30 - 2 * (var29 & var30);
            var10005 = (int)1784161981435795123L;
            var30 = -1868842501;
            var29 = var10005;
            var10005 = var29 + var30 - 2 * (var29 & var30);
            var30 = 364368215;
            var29 = var10005;
            var541 = a(
               "гЎ г¬·гЎћг¬·гЎљг¬®гЎ›", "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘ґ~\ua7efк’¶кЃєк¤‚зµЈи№ѓ\u2435и¬єг‘І|кџік“єкЃІк¤Љзµёи№Њв‘іи¬°г‘¤=кџ…к’єкЃїк¤ѓзµїи№Ќ\u2453и¬Јг‘І\u007fкџѓк’№кЃґк¤€зµіи№„в‘®", var10002, var10003, var10004, var29 & ~var30 | ~var29 & var30
            );
         }

         String var43 = var541;
         var11.a(var43, var41, var14, var16, var1);
      }
   }

   private void a(MatrixStack var1, Renderer2D var2, float var3, float var4, float var5, int var6, float var7) {
      float var8 = (float)this.I.j();
      float var9 = (float)this.J.j();
      float var10003 = (int)var3;
      float var10004 = (int)var5;
      int var10008 = (int)54244451313758230L;
      int var11 = 1754458356;
      int var10 = var10008;
      var10008 = (var10 | var11) & (~var10 | ~var11);
      var11 = -351971101;
      var10 = var10008;
      this.a(var1, var2, var10003, var10004, var6, var8, var7, pulse.Bool.from((var10 | var11) & (var10 & var11 ^ -1)));
      var10003 = (int)var4;
      var10004 = (int)var5;
      var10008 = (int)-3074419908594863613L;
      var11 = -1399049132;
      var10 = var10008;
      var10008 = (var10 | var11) & ~(var10 & var11);
      var11 = 2102150743;
      var10 = var10008;
      this.a(var1, var2, var10003, var10004, var6, var9, var7, pulse.Bool.from((var10 | var11) & (var10 & var11 ^ -1)));
   }

   private void a(MatrixStack var1, Renderer2D var2, float var3, float var4, int var5, float var6, float var7, boolean var8) {
      Color var9 = ColorUtils.a(l, t, var6);
      Color var10 = ColorUtils.a(m, u, var6);
      Color var11 = ColorUtils.a(n, var9, var6);
      Color var12 = ColorUtils.a(o, var10, var6);
      Color var13 = ColorUtils.a(p, v, var6);
      Color var14 = ColorUtils.a(q, w, var6);
      Color var15 = ColorUtils.a(r, var13, var6);
      Color var16 = ColorUtils.a(s, var14, var6);
      Color var17 = ColorUtils.a(var9, var13, var7);
      Color var18 = ColorUtils.a(var10, var14, var7);
      Color var19 = ColorUtils.a(var11, var15, var7);
      Color var20 = ColorUtils.a(var12, var16, var7);
      var19 = pulse.Theme.a(var19, var5);
      var20 = pulse.Theme.a(var20, var5);
      int var23 = 1998674315;
      int var22 = -151873454;
      int var10002 = (var22 | var23) & ~(var22 & var23);
      var23 = -1640473134;
      var22 = var10002;
      var10002 = (var22 | var23) - (var22 & var23);
      float var10001 = var3 - 0.5F;
      var23 = 1737787706;
      var22 = 1174511219;
      int var10003 = var22 + var23 - 2 * (var22 & var23);
      var23 = 1584937420;
      var22 = var10003;
      var10003 = (var22 & ~var23 | ~var22 & var23) * (var22 & ~var23 | ~var22 & var23);
      float var66 = var4 - 0.5F;
      var10003 = (int)1731797565780005978L;
      var23 = 1078240827;
      var22 = var10003;
      var10003 = var22 + var23 - 2 * (var22 & var23);
      var23 = 1306644933;
      var22 = var10003;
      var10003 = (var22 | var23) & (~var22 | ~var23);
      int var10004 = (int)-300765337902946165L;
      var23 = -1940758337;
      var22 = var10004;
      var10004 = var22 + var23 - 2 * (var22 & var23);
      var23 = -1919770741;
      var22 = var10004;
      var10004 = (var22 + var23 - 2 * (var22 & var23)) * (var22 + var23 - 2 * (var22 & var23));
      var23 = 10565365;
      var22 = 87607279;
      int var10005 = (var22 | var23) - (var22 & var23);
      var23 = -1828448017;
      var22 = var10005;
      var10005 = ((var22 | var23) & (~var22 | ~var23)) * ((var22 | var23) & (~var22 | ~var23));
      var2.a(var10001, var66, 20.5F, 20.5F, 6.5F, var19, var19, var20, var20, var1);
      var17 = pulse.Theme.a(var17, var5);
      var18 = pulse.Theme.a(var18, var5);
      var23 = 742188985;
      var22 = 1919680074;
      var10003 = (var22 | var23) & ~(var22 & var23);
      var23 = -1860872380;
      var22 = var10003;
      var10003 = (var22 + var23 - 2 * (var22 & var23)) * (var22 + var23 - 2 * (var22 & var23));
      var10004 = (int)8328300996568789007L;
      var23 = -1085087955;
      var22 = var10004;
      var10004 = (var22 | var23) & ~(var22 & var23);
      var23 = -387339735;
      var22 = var10004;
      var10004 = var22 + var23 - 2 * (var22 & var23);
      var10005 = (int)3265912512988322977L;
      var23 = -798862758;
      var22 = var10005;
      var10005 = (var22 | var23) - (var22 & var23);
      var23 = -287572113;
      var22 = var10005;
      var23 = (var22 | var23) & ~(var22 & var23);
      var22 = var10004;
      var10004 = 2 * (var22 | var23) - (var22 ^ var23);
      var23 = 1127698125;
      var22 = -786345689;
      var10005 = (var22 | var23) - (var22 & var23);
      var23 = 859259781;
      var22 = var10005;
      var10005 = var22 & ~var23 | ~var22 & var23;
      var2.a(var3, var4, 19.5F, 19.5F, 6.5F, var17, var17, var18, var18, var1);
      Color var21 = ColorUtils.a(pulse.Theme.a, pulse.Theme.aa, var6);
      var21 = pulse.Theme.a(var21, var5);
      if (!var8) {
         this.b(var1, var2, var3, var4, var21);
      } else {
         this.a(var1, var2, var3, var4, var21);
      }
   }

   private void a(MatrixStack var1, Renderer2D var2, float var3, float var4, Color var5) {
      int var10000 = (int)-7411879111311382426L;
      int var15 = 584260280;
      int var14 = var10000;
      var10000 = (var14 | var15) - (var14 & var15);
      var15 = -1858882558;
      var14 = var10000;
      var10000 = (var14 & ~var15 | ~var14 & var15) * (var14 & ~var15 | ~var14 & var15);
      float var6 = 1.5F;
      var15 = -1510901971;
      var14 = 478599737;
      var10000 = (var14 | var15) & ~(var14 & var15);
      var15 = 2000407876;
      var14 = var10000;
      var10000 = var14 & ~var15 | ~var14 & var15;
      float var7 = 1.5F;
      float var8 = 1.0F;
      String var10001 = "bid";
      float var9 = var7 * 3.0F + var8 * 2.0F;
      var15 = 1502225159;
      var14 = 1290110924;
      int var44 = var14 + var15 - 2 * (var14 & var15);
      var15 = -951878088;
      var14 = var44;
      int var45 = var14 + var15 - 2 * (var14 & var15);
      float var10 = var3 + (19.5F - var6) / 2.0F;
      var15 = 898363035;
      var14 = -2130606751;
      int var10002 = (var14 | var15) - (var14 & var15);
      var15 = -1265996814;
      var14 = var10002;
      var10002 = var14 + var15 - 2 * (var14 & var15);
      float var11 = var4 + (19.5F - var9) / 2.0F;
      var10000 = (int)-7468963072788189878L;
      var15 = 2112812709;
      var14 = var10000;
      var10000 = var14 & ~var15 | ~var14 & var15;
      var15 = 673045487;
      var14 = var10000;
      int var12 = var14 & ~var15 | ~var14 & var15;

      while (true) {
         var15 = -1447710470;
         var14 = -431823597;
         int var46 = var14 + var15 - 2 * (var14 & var15);
         var15 = 1341609450;
         var14 = var46;
         if (var12 >= ((var14 | var15) & ~(var14 & var15))) {
            return;
         }

         float var13 = var11 + var12 * (var7 + var8);
         var2.a(var10, var13, var6, var7, var6 / 2.0F, var5, var1);
         var12++;
      }
   }

   private void b(MatrixStack var1, Renderer2D var2, float var3, float var4, Color var5) {
      int var10001 = (int)8450022445632023149L;
      int var13 = 1863929098;
      int var12 = var10001;
      var10001 = var12 + var13 - 2 * (var12 & var13);
      var13 = -1998575764;
      var12 = var10001;
      FontRenderer var6 = FontManager.e[(var12 | var13) & ~(var12 & var13)];
      var13 = 614227484;
      var12 = 1513126420;
      int var10000 = var12 + var13 - 2 * (var12 & var13);
      var13 = -618007409;
      var12 = var10000;
      var10000 = (var12 | var13) & (~var12 | ~var13);
      var13 = -1256641881;
      var12 = -1128319258;
      var10001 = (var12 | var13) & ~(var12 & var13);
      var13 = 1582635078;
      var12 = var10001;
      var13 = (var12 | var13) & ~(var12 & var13);
      var12 = var10000;
      var10000 = (var12 & ~var13) + (var13 & ~var12) + 2 * (var12 & var13);
      var13 = -1637467089;
      var12 = -2127163737;
      int var10002 = (var12 | var13) & ~(var12 & var13);
      var13 = 525349512;
      var12 = var10002;
      var10002 = var12 + var13 - 2 * (var12 & var13);
      var10002 = (int)2399233971134961386L;
      var13 = 376582102;
      var12 = var10002;
      var10002 = var12 + var13 - 2 * (var12 & var13);
      var13 = -788612817;
      var12 = var10002;
      var10002 = var12 + var13 - 2 * (var12 & var13);
      var13 = -2028019388;
      var12 = -1875085540;
      var10002 = (var12 | var13) & (~var12 | ~var13);
      var13 = 388142685;
      var12 = var10002;
      var10002 = (var12 | var13) - (var12 & var13);
      var10002 = (int)-6632312381786166861L;
      var13 = 1750049416;
      var12 = var10002;
      var10002 = (var12 | var13) & (~var12 | ~var13);
      var13 = 1417300777;
      var12 = var10002;
      var10002 = (var12 | var13) & ~(var12 & var13);
      var13 = 898905103;
      var12 = -151938602;
      var10002 = (var12 | var13) - (var12 & var13);
      var13 = -1016746537;
      var12 = var10002;
      var10002 = var12 & ~var13 | ~var12 & var13;
      var10002 = (int)-9101359911488712415L;
      var13 = 1425120075;
      var12 = var10002;
      var10002 = var12 + var13 - 2 * (var12 & var13);
      var13 = -211784230;
      var12 = var10002;
      var10002 = (var12 | var13) & (~var12 | ~var13);
      int var10003 = (int)-7304610178476066557L;
      var13 = -1008143310;
      var12 = var10003;
      var10003 = (var12 | var13) & ~(var12 & var13);
      var13 = -749903859;
      var12 = var10003;
      var13 = (var12 | var13) & (~var12 | ~var13);
      var12 = var10002;
      var10002 = (var12 ^ var13) + 2 * (var12 & var13);
      var13 = -1921184059;
      var12 = 1046238154;
      var10002 = var12 + var13 - 2 * (var12 & var13);
      var13 = 1073864828;
      var12 = var10002;
      var10002 = var12 & ~var13 | ~var12 & var13;
      var13 = -1423911591;
      var12 = -1249883971;
      var10003 = var12 + var13 - 2 * (var12 & var13);
      var13 = 119243024;
      var12 = var10003;
      var10003 = (var12 | var13) - (var12 & var13);
      var10003 = (int)-8445567372950552792L;
      var13 = -303774514;
      var12 = var10003;
      var10003 = (var12 | var13) & ~(var12 & var13);
      var13 = -1746104339;
      var12 = var10003;
      var10003 = (var12 | var13) & ~(var12 & var13);
      int var10004 = (int)3867014323016161840L;
      var13 = 1728304012;
      var12 = var10004;
      var10004 = var12 + var13 - 2 * (var12 & var13);
      var13 = 977723697;
      var12 = var10004;
      var10004 = var12 + var13 - 2 * (var12 & var13);
      var10004 = (int)6200436237171011847L;
      var13 = 1315888658;
      var12 = var10004;
      var10004 = var12 & ~var13 | ~var12 & var13;
      var13 = 1275451865;
      var12 = var10004;
      var10004 = (var12 | var13) & ~(var12 & var13);
      String var10005 = "bie";
      int var153 = (int)-7378060558143928820L;
      var13 = 63002520;
      var12 = var153;
      int var154 = (var12 | var13) - (var12 & var13);
      var13 = 1466426871;
      var12 = var154;
      String var7 = a(
         "б™•", "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘ґ~\ua7efк’¶кЃєк¤‚зµЈи№ѓ\u2435и¬єг‘І|кџік“єкЃІк¤Љзµёи№Њв‘іи¬°г‘¤=кџ…к’єкЃїк¤ѓзµїи№Ќ\u2453и¬Јг‘І\u007fкџѓк’№кЃґк¤€зµіи№„в‘®", var10002, var10003, var10004, (var12 | var13) & ~(var12 & var13)
      );
      float var8 = var6.a(var7);
      float var9 = var6.b(var7);
      var13 = 1049593592;
      var12 = -63682538;
      var10002 = var12 & ~var13 | ~var12 & var13;
      var13 = -1027879192;
      var12 = var10002;
      var10002 = (var12 | var13) & ~(var12 & var13);
      var13 = -1757194434;
      var12 = -832286814;
      var10002 = (var12 | var13) & (~var12 | ~var13);
      var13 = 1495734416;
      var12 = var10002;
      var10002 = (var12 | var13) - (var12 & var13);
      var10002 = (int)-2687536763011068091L;
      var13 = -419683703;
      var12 = var10002;
      var10002 = var12 + var13 - 2 * (var12 & var13);
      var13 = 2031103431;
      var12 = var10002;
      var10002 = var12 + var13 - 2 * (var12 & var13);
      float var10 = var3 + (19.5F - var8) / 2.0F;
      var13 = 778211407;
      var12 = -1562080991;
      var10001 = (var12 | var13) - (var12 & var13);
      var13 = 1758487662;
      var12 = var10001;
      var10001 = var12 + var13 - 2 * (var12 & var13);
      float var108 = var4 + (19.5F - var9 / 2.0F) / 2.0F;
      var13 = 1498162018;
      var12 = 533053943;
      var10001 = (var12 | var13) & ~(var12 & var13);
      var13 = 745463774;
      var12 = var10001;
      var10001 = (var12 | var13) & ~(var12 & var13);
      var10002 = (int)-2227568323627387218L;
      var13 = 719561144;
      var12 = var10002;
      var10002 = (var12 | var13) & ~(var12 & var13);
      var13 = 1721911821;
      var12 = var10002;
      var13 = (var12 | var13) & (~var12 | ~var13);
      var12 = var10001;
      var10001 = (var12 ^ var13) + 2 * (var12 & var13);
      float var11 = var108 - 0.5F;
      var6.a(var7, var10, var11, var5, var1);
   }

   private void a(MatrixStack var1, Renderer2D var2, float var3, float var4, int var5) {
      float var6 = (float)this.J.j();
      Color var7 = x;
      Color var8 = B;
      Color var9 = z;
      int var15 = -1464534323;
      int var14 = -1162276067;
      int var10002 = var14 & ~var15 | ~var14 & var15;
      var15 = 302901684;
      var14 = var10002;
      var10002 = (var14 | var15) & ~(var14 & var15);
      var15 = 377963611;
      var14 = -860821383;
      int var10003 = (var14 | var15) - (var14 & var15);
      var15 = -633885582;
      var14 = var10003;
      var10003 = (var14 | var15) & ~(var14 & var15);
      var15 = 1533813676;
      var14 = -598269850;
      int var10004 = (var14 | var15) - (var14 & var15);
      var15 = -2026175511;
      var14 = var10004;
      Color var10 = new Color(var10002, var10003, var14 + var15 - 2 * (var14 & var15));
      Color var11 = pulse.Theme.a(ColorUtils.a(var7, var8, var6), var5);
      Color var12 = pulse.Theme.a(ColorUtils.a(var9, var10, var6), var5);
      var15 = 1044902108;
      var14 = -946366789;
      var10003 = (var14 | var15) - (var14 & var15);
      var15 = -103782803;
      var14 = var10003;
      var10003 = var14 + var15 - 2 * (var14 & var15);
      float var10001 = var3 - 0.5F;
      var10003 = (int)-2537628129936133609L;
      var15 = 1929143189;
      var14 = var10003;
      var10003 = (var14 | var15) - (var14 & var15);
      var15 = 1868319375;
      var14 = var10003;
      var10003 = ((var14 | var15) & (~var14 | ~var15)) * ((var14 | var15) & (~var14 | ~var15));
      float var71 = var4 - 0.5F;
      var10004 = (int)4678827475098739732L;
      var15 = 153970407;
      var14 = var10004;
      var10004 = (var14 | var15) - (var14 & var15);
      var15 = -1682685193;
      var14 = var10004;
      var10004 = var14 + var15 - 2 * (var14 & var15);
      var10004 = (int)-6144123003751645511L;
      var15 = -643211320;
      var14 = var10004;
      var10004 = var14 + var15 - 2 * (var14 & var15);
      var15 = -2135236231;
      var14 = var10004;
      var10004 = var14 & ~var15 | ~var14 & var15;
      var15 = 893334070;
      var14 = 1324001868;
      var10004 = (var14 | var15) - (var14 & var15);
      var15 = -1158273643;
      var14 = var10004;
      var10004 = ((var14 | var15) & (~var14 | ~var15)) * ((var14 | var15) & (~var14 | ~var15));
      String var10005 = "bif";
      var2.a(var10001, var71, 20.5F, 20.5F, 6.5F, var12, var12, var12, var12, var1);
      var15 = -432992754;
      var14 = -390509319;
      var10003 = (var14 | var15) - (var14 & var15);
      var15 = -552624349;
      var14 = var10003;
      var10003 = ((var14 | var15) & (~var14 | ~var15)) * ((var14 | var15) & (~var14 | ~var15));
      var15 = 701817404;
      var14 = 1408933762;
      var10004 = (var14 | var15) & ~(var14 & var15);
      var15 = 709146379;
      var14 = var10004;
      var10004 = (var14 | var15) - (var14 & var15);
      int var91 = (int)9086031461702180760L;
      var15 = -1710220259;
      var14 = var91;
      int var92 = (var14 | var15) & ~(var14 & var15);
      var15 = 792401214;
      var14 = var92;
      var15 = var14 & ~var15 | ~var14 & var15;
      var14 = var10004;
      var10004 = var14 - ~var15 - 1;
      int var93 = (int)7175807406471171065L;
      var15 = -1248207638;
      var14 = var93;
      int var94 = var14 + var15 - 2 * (var14 & var15);
      var15 = -104903327;
      var14 = var94;
      int var95 = (var14 | var15) & (~var14 | ~var15);
      int var10006 = (int)4569992125425234095L;
      var15 = 1227987100;
      var14 = var10006;
      var10006 = var14 & ~var15 | ~var14 & var15;
      var15 = 1014348803;
      var14 = var10006;
      var15 = (var14 | var15) & (~var14 | ~var15);
      var14 = var95;
      int var96 = (var14 & ~var15) + (var15 & ~var14) + 2 * (var14 & var15);
      var2.a(var3, var4, 19.5F, 19.5F, 6.5F, var11, var11, var11, var11, var1);
      Color var13 = pulse.Theme.a(ColorUtils.a(pulse.Theme.a, pulse.Theme.aa, var6), var5);
      this.b(var1, var2, var3, var4, var13);
   }

   public boolean a(float var1, float var2, float var3, int var4, int var5) {
      if (this.X) {
         int var15 = -1640269474;
         int var14 = -1270326576;
         int var10003 = (var14 | var15) & ~(var14 & var15);
         var15 = -1092889766;
         var14 = var10003;
         var10003 = var14 & ~var15 | ~var14 & var15;
         var15 = -1458379205;
         var14 = 1801932474;
         int var10004 = var14 & ~var15 | ~var14 & var15;
         var15 = 238697626;
         var14 = var10004;
         var15 = (var14 | var15) & (~var14 | ~var15);
         var14 = var10003;
         var10003 = (var14 | var15) + (var14 & var15);
         if (!GuiInput.a(var1, var2, var3, 36.5F, var4, var5)) {
            var15 = 1255323162;
            var14 = 2104625304;
            int var281 = (var14 | var15) - (var14 & var15);
            var15 = 933281411;
            var14 = var281;
            this.a(pulse.Bool.from((var14 | var15) & (var14 ^ -1 | var15 ^ -1)));
            int var254 = (int)5042719821297864996L;
            var15 = -270670145;
            var14 = var254;
            var254 = var14 + var15 - 2 * (var14 & var15);
            var15 = 765081498;
            var14 = var254;
            return pulse.Bool.from(var14 & (var15 ^ -1) | (var14 ^ -1) & var15);
         }
      }

      boolean var6 = this.F.f();
      if (!var6) {
         float var228 = var1 + var3;
         int var143 = 660200484;
         int var41 = -1200094740;
         int var290 = (var41 | var143) & ~(var41 & var143);
         var143 = -1625170481;
         var41 = var290;
         var290 = var41 & ~var143 | ~var41 & var143;
         var143 = 550469460;
         var41 = -1687562310;
         var290 = var41 + var143 - 2 * (var41 & var143);
         var143 = -1146705667;
         var41 = var290;
         var290 = var41 & ~var143 | ~var41 & var143;
         var290 = (int)-8561100926642163414L;
         var143 = -1358363529;
         var41 = var290;
         var290 = var41 & ~var143 | ~var41 & var143;
         var143 = 1915811157;
         var41 = var290;
         var290 = var41 & ~var143 | ~var41 & var143;
         var228 -= 11.0F;
         var143 = -271766660;
         var41 = -1811866626;
         var290 = var41 & ~var143 | ~var41 & var143;
         var143 = 2076979345;
         var41 = var290;
         var290 = var41 & ~var143 | ~var41 & var143;
         var143 = 906422541;
         var41 = 229488716;
         var290 = var41 & ~var143 | ~var41 & var143;
         var143 = 1001083219;
         var41 = var290;
         var290 = var41 + var143 - 2 * (var41 & var143);
         float var16 = var228 - 19.5F;
         int var261 = (int)3069701154485863199L;
         var143 = 706737098;
         var41 = var261;
         var261 = (var41 | var143) & ~(var41 & var143);
         var143 = 1636408467;
         var41 = var261;
         var261 = var41 + var143 - 2 * (var41 & var143);
         var228 = var16 - 6.0F;
         var143 = 616842343;
         var41 = 1274787943;
         var261 = (var41 | var143) & ~(var41 & var143);
         var143 = 288577109;
         var41 = var261;
         var261 = ((var41 | var143) & (~var41 | ~var143)) * ((var41 | var143) & (~var41 | ~var143));
         float var17 = var228 - 19.5F;
         var261 = (int)-4647565693417865021L;
         var143 = 990384878;
         var41 = var261;
         var261 = var41 + var143 - 2 * (var41 & var143);
         var143 = 320588449;
         var41 = var261;
         var261 = (var41 | var143) - (var41 & var143);
         float var9 = var2 + 8.5F;
         var290 = (int)-1692892838920074594L;
         var143 = 604407285;
         var41 = var290;
         var290 = (var41 | var143) & (~var41 | ~var143);
         var143 = 1964931638;
         var41 = var290;
         var290 = (var41 | var143) & (~var41 | ~var143);
         var143 = 1942120362;
         var41 = -1380923584;
         int var316 = var41 + var143 - 2 * (var41 & var143);
         var143 = -562913030;
         var41 = var316;
         var316 = var41 + var143 - 2 * (var41 & var143);
         var143 = 1307651781;
         var41 = -1432404276;
         var316 = (var41 | var143) & ~(var41 & var143);
         var143 = -412217317;
         var41 = var316;
         var316 = var41 + var143 - 2 * (var41 & var143);
         if (!GuiInput.a(var17, var9, 19.5F, 19.5F, var4, var5)) {
            var143 = -1869502975;
            var41 = 2022695651;
            var290 = (var41 | var143) & ~(var41 & var143);
            var143 = 1628940629;
            var41 = var290;
            var290 = ((var41 | var143) - (var41 & var143)) * ((var41 | var143) - (var41 & var143));
            String var311 = "bih";
            if (!GuiInput.a(var16, var9, 19.5F, 19.5F, var4, var5)) {
               int var312 = (int)4156866844335920273L;
               var143 = -327697735;
               var41 = var312;
               int var313 = var41 + var143 - 2 * (var41 & var143);
               var143 = 1132050946;
               var41 = var313;
               int var314 = var41 & ~var143 | ~var41 & var143;
               var143 = -1994670169;
               var41 = -17801796;
               var316 = (var41 | var143) & (~var41 | ~var143);
               var143 = 937267405;
               var41 = var316;
               var143 = (var41 | var143) & (~var41 | ~var143);
               var41 = var314;
               int var315 = (var41 ^ var143) + 2 * (var41 & var143);
               if (!GuiInput.a(var1, var2, var3, 36.5F, var4, var5)) {
                  int var235 = (int)3498075333113929985L;
                  var143 = -2028686713;
                  var41 = var235;
                  int var236 = (var41 | var143) & (~var41 | ~var143);
                  var143 = -1906397755;
                  var41 = var236;
                  int var237 = ((var41 | var143) & ~(var41 & var143)) * ((var41 | var143) & ~(var41 & var143));
                  var143 = 672063632;
                  var41 = 499950518;
                  int var238 = (var41 | var143) - (var41 & var143);
                  var143 = 421989903;
                  var41 = var238;
                  int var13 = var41 + var143 - 2 * (var41 & var143);
                  var143 = -59944468;
                  var41 = 240910241;
                  int var239 = (var41 | var143) & ~(var41 & var143);
                  var143 = 324299080;
                  var41 = var239;
                  int var240 = (var41 & ~var143 | ~var41 & var143) * (var41 & ~var143 | ~var41 & var143);
                  int var241 = (int)6940679074990534106L;
                  var143 = -1007475399;
                  var41 = var241;
                  int var242 = (var41 | var143) & ~(var41 & var143);
                  var143 = -1514704859;
                  var41 = var242;
                  if (var41 + var143 - 2 * (var41 & var143) >= var13) {
                     var143 = 1821643303;
                     var41 = 1968261529;
                     var261 = (var41 | var143) & ~(var41 & var143);
                     var143 = 432364479;
                     var41 = var261;
                     var261 = (var41 | var143) & ~(var41 & var143);
                     var261 = (int)-2695702905915759859L;
                     var143 = 285923129;
                     var41 = var261;
                     var261 = (var41 | var143) & (~var41 | ~var143);
                     var143 = 1106113574;
                     var41 = var261;
                     var261 = var41 + var143 - 2 * (var41 & var143);
                     int var243 = (int)127116771731370762L;
                     var143 = -1892758319;
                     var41 = var243;
                     int var244 = (var41 | var143) & ~(var41 & var143);
                     var143 = -2064961420;
                     var41 = var244;
                     var13 = (var41 | var143) & ~(var41 & var143);
                  }
               } else {
                  long var10 = System.currentTimeMillis();
                  long var245 = var10 - this.T;
                  var143 = 101490736;
                  var41 = 708901960;
                  var261 = (var41 | var143) & (~var41 | ~var143);
                  var143 = -1261471087;
                  var41 = var261;
                  var261 = ((var41 | var143) & ~(var41 & var143)) * ((var41 | var143) & ~(var41 & var143));
                  if (var245 < 400L) {
                     if (!this.X && this.P != null) {
                        this.P.accept(this.F);
                     }

                     this.T = 0L;
                     int var252 = (int)-8379843173121040259L;
                     var143 = -1604192082;
                     var41 = var252;
                     int var253 = var41 & ~var143 | ~var41 & var143;
                     var143 = -389900078;
                     var41 = var253;
                     return pulse.Bool.from(var41 + var143 - 2 * (var41 & var143));
                  }

                  if (b != b) {
                     int var246 = (int)3202164356909700968L;
                     var143 = -1339702708;
                     var41 = var246;
                     int var247 = (var41 | var143) & ~(var41 & var143);
                     var143 = -2135304171;
                     var41 = var247;
                     int var248 = (var41 | var143) & ~(var41 & var143);
                     int var249 = (int)-5583892342963487878L;
                     var143 = -919237706;
                     var41 = var249;
                     int var250 = (var41 | var143) - (var41 & var143);
                     var143 = 1769721910;
                     var41 = var250;
                     int var19 = var41 & ~var143 | ~var41 & var143;
                  }

                  this.T = var10;
               }

               var143 = -40516046;
               var41 = 830451049;
               int var251 = (var41 | var143) & ~(var41 & var143);
               var143 = -857052325;
               var41 = var251;
               return pulse.Bool.from((var41 | var143) & (var41 & var143 ^ -1));
            } else {
               if (this.X) {
                  var261 = (int)-8612618113240500960L;
                  var143 = 1627228151;
                  var41 = var261;
                  var261 = (var41 | var143) - (var41 & var143);
                  var143 = 1187640022;
                  var41 = var261;
                  this.a(pulse.Bool.from((var41 | var143) - (var41 & var143)));
               }

               if (this.P != null) {
                  this.P.accept(this.F);
               }

               int var233 = (int)-2958993670945658589L;
               var143 = 186986074;
               var41 = var233;
               int var234 = (var41 | var143) & (~var41 | ~var143);
               var143 = 226658168;
               var41 = var234;
               return pulse.Bool.from((var41 | var143) - (var41 & var143));
            }
         } else {
            if (this.X) {
               var261 = (int)5459432048546660523L;
               var143 = -1573890489;
               var41 = var261;
               var261 = (var41 | var143) - (var41 & var143);
               var143 = 2066847469;
               var41 = var261;
               this.a(pulse.Bool.from(var41 & (var143 ^ -1) | (var41 ^ -1) & var143));
            }

            if (this.O != null) {
               this.O.accept(this.F);
            }

            if (this.R != null) {
               BiConsumer var231 = this.R;
               ConfigEntry var271 = this.F;
               var143 = -657952262;
               var41 = 959406236;
               var290 = (var41 | var143) - (var41 & var143);
               var143 = -504950427;
               var41 = var290;
               Float[] var305 = new Float[var41 & ~var143 | ~var41 & var143];
               var316 = (int)-3282903548825084675L;
               var143 = 273257557;
               var41 = var316;
               var316 = var41 + var143 - 2 * (var41 & var143);
               var143 = -1138702168;
               var41 = var316;
               var305[(var41 | var143) & (~var41 | ~var143)] = var17;
               var316 = (int)-530630672049302699L;
               var143 = 780189959;
               var41 = var316;
               var316 = (var41 | var143) & ~(var41 & var143);
               var143 = 991154771;
               var41 = var316;
               var316 = (var41 | var143) & (~var41 | ~var143);
               var143 = -1628336430;
               var41 = -1189048819;
               int var10006 = var41 + var143 - 2 * (var41 & var143);
               var143 = 2108778235;
               var41 = var10006;
               var10006 = var41 & ~var143 | ~var41 & var143;
               var305[var316] = var9 + 19.5F;
               var143 = 181320379;
               var41 = 222842138;
               var316 = (var41 | var143) & (~var41 | ~var143);
               var143 = 126285731;
               var41 = var316;
               var316 = var41 + var143 - 2 * (var41 & var143);
               var143 = -2129513695;
               var41 = 106971689;
               var10006 = (var41 | var143) & ~(var41 & var143);
               var143 = -2022543093;
               var41 = var10006;
               var10006 = var41 & ~var143 | ~var41 & var143;
               var10006 = (int)476156645226281530L;
               var143 = -1122090663;
               var41 = var10006;
               var10006 = var41 & ~var143 | ~var41 & var143;
               var143 = -1925629087;
               var41 = var10006;
               var10006 = var41 & ~var143 | ~var41 & var143;
               var10006 = (int)1430004491867184120L;
               var143 = -608477288;
               var41 = var10006;
               var10006 = (var41 | var143) - (var41 & var143);
               var143 = -1622178701;
               var41 = var10006;
               var10006 = (var41 | var143) - (var41 & var143);
               var305[var316] = 19.5F;
               var231.accept(var271, var305);
            }

            var143 = -1274804394;
            var41 = 1452617080;
            int var232 = (var41 | var143) - (var41 & var143);
            var143 = -493802961;
            var41 = var232;
            return pulse.Bool.from((var41 | var143) & (var41 ^ -1 | var143 ^ -1));
         }
      } else {
         float var10000 = var1 + var3;
         int var126 = -2031184957;
         int var24 = 1807156854;
         int var10002 = var24 + var126 - 2 * (var24 & var126);
         var126 = -312896066;
         var24 = var10002;
         var10002 = (var24 | var126) & (~var24 | ~var126);
         var10002 = (int)6489455061554678982L;
         var126 = -527047546;
         var24 = var10002;
         var10002 = var24 + var126 - 2 * (var24 & var126);
         var126 = 289810497;
         var24 = var10002;
         var10002 = (var24 | var126) & ~(var24 & var126);
         var10000 -= 11.0F;
         int var10001 = (int)6579012144806592369L;
         var126 = -872841315;
         var24 = var10001;
         var10001 = var24 + var126 - 2 * (var24 & var126);
         var126 = -1660776344;
         var24 = var10001;
         var10001 = ((var24 | var126) - (var24 & var126)) * ((var24 | var126) - (var24 & var126));
         float var7 = var10000 - 19.5F;
         var126 = -2115100569;
         var24 = 557897468;
         var10001 = (var24 | var126) - (var24 & var126);
         var126 = 689963465;
         var24 = var10001;
         var10001 = (var24 | var126) - (var24 & var126);
         var126 = 644381658;
         var24 = -1327115659;
         var10002 = var24 + var126 - 2 * (var24 & var126);
         var126 = 1967913596;
         var24 = var10002;
         var126 = (var24 | var126) & (~var24 | ~var126);
         var24 = var10001;
         var10001 = var24 - ~var126 - 1;
         float var8 = var2 + 8.5F;
         var10002 = (int)16297666208985233L;
         var126 = -798219338;
         var24 = var10002;
         var10002 = var24 & ~var126 | ~var24 & var126;
         var126 = 2113674620;
         var24 = var10002;
         var10002 = ((var24 | var126) & (~var24 | ~var126)) * ((var24 | var126) & (~var24 | ~var126));
         String var310 = "big";
         if (!GuiInput.a(var7, var8, 19.5F, 19.5F, var4, var5)) {
            var126 = -1048108092;
            var24 = 1762202361;
            int var227 = (var24 | var126) - (var24 & var126);
            var126 = -1467076291;
            var24 = var227;
            return pulse.Bool.from((var24 | var126) & (var24 ^ -1 | var126 ^ -1));
         }

         if (this.Q != null) {
            this.Q.accept(this.F);
         }

         int var225 = (int)-1841501852059763397L;
         var126 = 1629696947;
         var24 = var225;
         int var226 = var24 & ~var126 | ~var24 & var126;
         var126 = 535023241;
         var24 = var226;
         return pulse.Bool.from((var24 | var126) - (var24 & var126));
      }
   }

   public float e() {
      float var10000 = this.U + this.W;
      int var3 = -1942385811;
      int var2 = 529101007;
      int var10002 = (var2 | var3) & ~(var2 & var3);
      var3 = -1817117784;
      var2 = var10002;
      var10002 = (var2 | var3) - (var2 & var3);
      var3 = -199394175;
      var2 = 590785163;
      var10002 = var2 & ~var3 | ~var2 & var3;
      var3 = -684993018;
      var2 = var10002;
      var10002 = (var2 | var3) - (var2 & var3);
      var10000 -= 11.0F;
      var10002 = (int)-8983761693575606622L;
      var3 = -1517587643;
      var2 = var10002;
      var10002 = var2 & ~var3 | ~var2 & var3;
      var3 = -702448155;
      var2 = var10002;
      var10002 = (var2 | var3) - (var2 & var3);
      var10002 = (int)-2405223233699001141L;
      var3 = -340523176;
      var2 = var10002;
      var10002 = var2 & ~var3 | ~var2 & var3;
      var3 = -1234252904;
      var2 = var10002;
      var10002 = var2 & ~var3 | ~var2 & var3;
      float var1 = var10000 - 19.5F;
      int var10001 = (int)-650698435248150936L;
      var3 = 761454257;
      var2 = var10001;
      var10001 = var2 + var3 - 2 * (var2 & var3);
      var3 = -478761091;
      var2 = var10001;
      var10001 = (var2 & ~var3 | ~var2 & var3) * (var2 & ~var3 | ~var2 & var3);
      var10000 = var1 - 6.0F;
      var3 = -1897830067;
      var2 = 786785907;
      var10001 = (var2 | var3) - (var2 & var3);
      var3 = -930131577;
      var2 = var10001;
      var10001 = (var2 | var3) & (~var2 | ~var3);
      return var10000 - 19.5F;
   }

   public float f() {
      int var2 = -1548806183;
      int var1 = -1293868116;
      int var10001 = (var1 | var2) & ~(var1 & var2);
      var2 = 1718801969;
      var1 = var10001;
      var10001 = (var1 | var2) & (~var1 | ~var2);
      float var10000 = this.V + 8.5F;
      var2 = 540669686;
      var1 = -317460133;
      var10001 = var1 + var2 - 2 * (var1 & var2);
      var2 = -653305233;
      var1 = var10001;
      var10001 = var1 & ~var2 | ~var1 & var2;
      var2 = -1758996626;
      var1 = 1817203225;
      int var10002 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1933253291;
      var1 = var10002;
      var2 = (var1 | var2) & (~var1 | ~var2);
      var1 = var10001;
      var10001 = 2 * (var1 | var2) - (var1 ^ var2);
      return var10000 + 19.5F;
   }

   public boolean a(int var1, int var2, int var3) {
      if (this.X) {
         int var10001 = (int)4471354098366228851L;
         int var167 = -296910459;
         int var30 = var10001;
         var10001 = var30 + var167 - 2 * (var30 & var167);
         var167 = 1414965492;
         var30 = var10001;
         var167 = (var30 | var167) & (~var30 | ~var167);
         var30 = var3;
         int var305;
         if ((~var30 | var167) - ~var30 == 0) {
            var305 = (int)-8548416994539281358L;
            var167 = 116568696;
            var30 = var305;
            var305 = var30 & ~var167 | ~var30 & var167;
            var167 = -161458614;
            var30 = var305;
            var305 = var30 & ~var167 | ~var30 & var167;
         } else {
            var167 = 219268764;
            var30 = -267013533;
            var305 = var30 + var167 - 2 * (var30 & var167);
            var167 = -50039554;
            var30 = var305;
            var305 = var30 + var167 - 2 * (var30 & var167);
         }

         int var4 = var305;
         var10001 = (int)3772845427319129307L;
         var167 = -2111598746;
         var30 = var10001;
         var10001 = var30 + var167 - 2 * (var30 & var167);
         var167 = -1108096068;
         var30 = var10001;
         var167 = (var30 | var167) - (var30 & var167);
         var30 = var3;
         if ((~var30 | var167) - ~var30 == 0) {
            var167 = 453131112;
            var30 = 13680499;
            var305 = var30 & ~var167 | ~var30 & var167;
            var167 = 466781211;
            var30 = var305;
            var305 = var30 & ~var167 | ~var30 & var167;
         } else {
            var305 = (int)-5241603695797937020L;
            var167 = 298157104;
            var30 = var305;
            var305 = var30 & ~var167 | ~var30 & var167;
            var167 = -1420601163;
            var30 = var305;
            var305 = (var30 | var167) & (~var30 | ~var167);
         }

         int var5 = var305;
         var167 = -371843863;
         var30 = 984413768;
         var10001 = (var30 | var167) & ~(var30 & var167);
         var167 = -746919008;
         var30 = var10001;
         if (var1 != ((var30 | var167) & (~var30 | ~var167))) {
            var10001 = (int)5851309132664374751L;
            var167 = 1151615265;
            var30 = var10001;
            var10001 = (var30 | var167) - (var30 & var167);
            var167 = -674118223;
            var30 = var10001;
            if (var1 != var30 + var167 - 2 * (var30 & var167)) {
               var10001 = (int)6678997224449145487L;
               var167 = 1477790616;
               var30 = var10001;
               var10001 = var30 & ~var167 | ~var30 & var167;
               var167 = -485937129;
               var30 = var10001;
               if (var1 != (var30 | var167) - (var30 & var167)) {
                  if (var4 != 0) {
                     var167 = -1161517204;
                     var30 = -129949948;
                     var10001 = (var30 | var167) & (~var30 | ~var167);
                     var167 = 1116059689;
                     var30 = var10001;
                     if (var1 == (var30 | var167) - (var30 & var167)) {
                        var10001 = (int)8626158822302409512L;
                        var167 = 1659749175;
                        var30 = var10001;
                        var10001 = (var30 | var167) & (~var30 | ~var167);
                        var167 = -1182654433;
                        var30 = var10001;
                        this.FriendCard = (var30 | var167) - (var30 & var167);
                        this.CosmeticModelRenderer = this.Y.length();
                        this.aa = this.Y.length();
                        var167 = 1125742415;
                        var30 = -675817739;
                        var305 = (var30 | var167) & ~(var30 & var167);
                        var167 = -1800494661;
                        var30 = var305;
                        return pulse.Bool.from((var30 | var167) - (var30 & var167));
                     }
                  }

                  if (var4 != 0) {
                     var10001 = (int)-4748071633404845537L;
                     var167 = -1904601546;
                     var30 = var10001;
                     var10001 = var30 & ~var167 | ~var30 & var167;
                     var167 = -189680534;
                     var30 = var10001;
                     if (var1 == var30 + var167 - 2 * (var30 & var167)) {
                        if (this.i()) {
                           String var24 = this.k();
                           MinecraftContext.c.keyboard.setClipboard(var24);
                        }

                        var305 = (int)124085110631159818L;
                        var167 = -420916194;
                        var30 = var305;
                        var305 = (var30 | var167) - (var30 & var167);
                        var167 = -872641515;
                        var30 = var305;
                        return pulse.Bool.from(var30 & (var167 ^ -1) | (var30 ^ -1) & var167);
                     }
                  }

                  if (var4 != 0) {
                     var167 = 1401516510;
                     var30 = -1003997317;
                     var10001 = var30 + var167 - 2 * (var30 & var167);
                     var167 = -1751038211;
                     var30 = var10001;
                     if (var1 == ((var30 | var167) & (~var30 | ~var167))) {
                        if (this.i()) {
                           String var23 = this.k();
                           MinecraftContext.c.keyboard.setClipboard(var23);
                           this.l();
                           this.h();
                        }

                        var167 = -1443668152;
                        var30 = 570017199;
                        var305 = (var30 | var167) & (~var30 | ~var167);
                        var167 = -2012570906;
                        var30 = var305;
                        return pulse.Bool.from((var30 | var167) & (var30 ^ -1 | var167 ^ -1));
                     }
                  }

                  if (var4 == 0) {
                     if (b != b) {
                        var305 = (int)-3549295639309384103L;
                        var167 = 701664503;
                        var30 = var305;
                        var305 = var30 + var167 - 2 * (var30 & var167);
                        var167 = -1647631842;
                        var30 = var305;
                        var305 = var30 & ~var167 | ~var30 & var167;
                        var167 = 1473778144;
                        var30 = 1413441312;
                        var10001 = var30 + var167 - 2 * (var30 & var167);
                        var167 = -265684188;
                        var30 = var10001;
                        var167 = (var30 | var167) - (var30 & var167);
                        var30 = var305;
                        var305 = var30 - ~var167 - 1;
                        var167 = 381462428;
                        var30 = -2095403458;
                        var305 = var30 + var167 - 2 * (var30 & var167);
                        var167 = -1855507414;
                        var30 = var305;
                        int var20 = (var30 | var167) & ~(var30 & var167);
                     }
                  } else {
                     var167 = 169976571;
                     var30 = 1502433073;
                     var10001 = var30 + var167 - 2 * (var30 & var167);
                     var167 = 1403841948;
                     var30 = var10001;
                     if (var1 == ((var30 | var167) & ~(var30 & var167))) {
                        String var6 = MinecraftContext.c.keyboard.getClipboard();
                        if (var6 != null && !var6.isEmpty()) {
                           StringBuilder var7 = new StringBuilder();
                           char[] var8 = var6.toCharArray();
                           int var9 = var8.length;
                           var305 = (int)7396788379838945650L;
                           var167 = 2145032229;
                           var30 = var305;
                           var305 = var30 + var167 - 2 * (var30 & var167);
                           var167 = 215155031;
                           var30 = var305;

                           for (int var10 = (var30 | var167) - (var30 & var167); var10 < var9; var10++) {
                              char var11 = var8[var10];
                              if (this.a(var11)) {
                                 var7.append(var11);
                              }
                           }

                           String var25 = var7.toString();
                           if (!var25.isEmpty()) {
                              if (this.i()) {
                                 this.l();
                              }

                              var167 = -926698625;
                              var30 = 1174285931;
                              var305 = (var30 | var167) - (var30 & var167);
                              var167 = -1925341900;
                              var30 = var305;
                              var305 = (var30 | var167) - (var30 & var167);
                              var167 = this.Y.length();
                              var30 = var305;
                              var9 = var30 - var167;
                              if (var9 > 0) {
                                 var167 = -195987043;
                                 var30 = -411759675;
                                 var10001 = var30 & ~var167 | ~var30 & var167;
                                 var167 = 321155672;
                                 var30 = var10001;
                                 String var26 = var25.substring(var30 & ~var167 | ~var30 & var167, Math.min(var25.length(), var9));
                                 var167 = 785914754;
                                 var30 = -1457355410;
                                 int var403 = (var30 | var167) & ~(var30 & var167);
                                 var167 = -2013618452;
                                 var30 = var403;
                                 String var390 = this.Y.substring((var30 | var167) - (var30 & var167), this.aa);
                                 String var14 = this.Y.substring(this.aa);
                                 String var13 = var26;
                                 String var12 = var390;
                                 this.Y = var12 + var13 + var14;
                                 var10001 = this.aa;
                                 var167 = var26.length();
                                 var30 = var10001;
                                 this.aa = (var30 & ~var167) + (var167 & ~var30) + 2 * (var30 & var167);
                                 this.h();
                              }
                           }
                        }

                        var167 = 1473597593;
                        var30 = 1153012884;
                        var305 = (var30 | var167) - (var30 & var167);
                        var167 = 325895180;
                        var30 = var305;
                        return pulse.Bool.from(var30 + var167 - 2 * (var30 & var167));
                     }
                  }

                  var10001 = (int)-5454457562227970606L;
                  var167 = 806044583;
                  var30 = var10001;
                  var10001 = var30 + var167 - 2 * (var30 & var167);
                  var167 = 821964662;
                  var30 = var10001;
                  if (var1 != ((var30 | var167) & (~var30 | ~var167))) {
                     var10001 = (int)-5069564082529294516L;
                     var167 = 478627035;
                     var30 = var10001;
                     var10001 = var30 + var167 - 2 * (var30 & var167);
                     var167 = -2109447534;
                     var30 = var10001;
                     if (var1 != ((var30 | var167) & (~var30 | ~var167))) {
                        if (b != b) {
                           var305 = (int)-1048948955974753286L;
                           var167 = 1280897532;
                           var30 = var305;
                           var305 = (var30 | var167) - (var30 & var167);
                           var167 = 667111942;
                           var30 = var305;
                           var305 = (var30 | var167) & ~(var30 & var167);
                           var10001 = (int)-7579268298558815125L;
                           var167 = 1480958652;
                           var30 = var10001;
                           var10001 = var30 + var167 - 2 * (var30 & var167);
                           var167 = -952080681;
                           var30 = var10001;
                           var305 /= var30 & ~var167 | ~var30 & var167;
                        }

                        var167 = -897206909;
                        var30 = -2146582840;
                        var10001 = (var30 | var167) & ~(var30 & var167);
                        var167 = 1250429516;
                        var30 = var10001;
                        if (var1 != ((var30 | var167) & ~(var30 & var167))) {
                           if (b != b) {
                              var167 = -173952603;
                              var30 = 188690287;
                              var305 = (var30 | var167) & ~(var30 & var167);
                              var167 = 821508776;
                              var30 = var305;
                              var305 = (var30 | var167) - (var30 & var167);
                              var305 = (int)2715131846853423339L;
                              var167 = 884759691;
                              var30 = var305;
                              var305 = (var30 | var167) & (~var30 | ~var167);
                              var167 = -718456535;
                              var30 = var305;
                              int var28 = (var30 | var167) - (var30 & var167);
                           }

                           var167 = 1683688077;
                           var30 = -1443600314;
                           var10001 = (var30 | var167) & (~var30 | ~var167);
                           var167 = -844143667;
                           var30 = var10001;
                           if (var1 != var30 + var167 - 2 * (var30 & var167)) {
                              var167 = 1664598346;
                              var30 = 877482238;
                              var10001 = (var30 | var167) & ~(var30 & var167);
                              var167 = 1467650232;
                              var30 = var10001;
                              if (var1 != ((var30 | var167) & (~var30 | ~var167))) {
                                 var10001 = (int)2695776009012862175L;
                                 var167 = 399978620;
                                 var30 = var10001;
                                 var10001 = (var30 | var167) & (~var30 | ~var167);
                                 var167 = 1156345262;
                                 var30 = var10001;
                                 if (var1 != ((var30 | var167) & (~var30 | ~var167))) {
                                    var305 = (int)-1955359117856944751L;
                                    var167 = -68893957;
                                    var30 = var305;
                                    var305 = (var30 | var167) - (var30 & var167);
                                    var167 = -130805909;
                                    var30 = var305;
                                    return pulse.Bool.from(var30 & (var167 ^ -1) | (var30 ^ -1) & var167);
                                 }

                                 if (var5 == 0) {
                                    this.aa = this.Y.length();
                                    this.j();
                                 } else {
                                    if (!this.i()) {
                                       this.FriendCard = this.aa;
                                    }

                                    this.aa = this.Y.length();
                                    this.CosmeticModelRenderer = this.Y.length();
                                 }

                                 this.h();
                                 var305 = (int)-6463703160687364776L;
                                 var167 = 337203023;
                                 var30 = var305;
                                 var305 = (var30 | var167) & ~(var30 & var167);
                                 var167 = -1582188010;
                                 var30 = var305;
                                 return pulse.Bool.from((var30 | var167) & (var30 & var167 ^ -1));
                              }

                              if (var5 == 0) {
                                 var167 = -1185688926;
                                 var30 = -1791096951;
                                 var10001 = var30 & ~var167 | ~var30 & var167;
                                 var167 = 745395499;
                                 var30 = var10001;
                                 this.aa = (var30 | var167) & (~var30 | ~var167);
                                 this.j();
                              } else {
                                 if (!this.i()) {
                                    this.FriendCard = this.aa;
                                 }

                                 var10001 = (int)-4807095108400805511L;
                                 var167 = 1386528939;
                                 var30 = var10001;
                                 var10001 = (var30 | var167) & ~(var30 & var167);
                                 var167 = -1662760494;
                                 var30 = var10001;
                                 this.aa = var30 & ~var167 | ~var30 & var167;
                                 var10001 = (int)6489974674497279486L;
                                 var167 = 1443341935;
                                 var30 = var10001;
                                 var10001 = var30 + var167 - 2 * (var30 & var167);
                                 var167 = -1799965807;
                                 var30 = var10001;
                                 this.CosmeticModelRenderer = var30 + var167 - 2 * (var30 & var167);
                              }

                              this.h();
                              var167 = -1438171802;
                              var30 = 289342977;
                              var305 = (var30 | var167) - (var30 & var167);
                              var167 = -1149748378;
                              var30 = var305;
                              return pulse.Bool.from(var30 & (var167 ^ -1) | (var30 ^ -1) & var167);
                           }

                           if (var5 == 0) {
                              if (!this.i()) {
                                 if (this.aa < this.Y.length()) {
                                    int var400 = (int)287357524695897956L;
                                    var167 = 1460990569;
                                    var30 = var400;
                                    var400 = var30 & ~var167 | ~var30 & var167;
                                    var167 = 941368588;
                                    var30 = var400;
                                    var167 = (var30 | var167) & (~var30 | ~var167);
                                    var30 = this.aa;
                                    this.aa = (var30 | var167) + (var30 & var167);
                                 }
                              } else {
                                 this.aa = Math.max(this.FriendCard, this.CosmeticModelRenderer);
                                 this.j();
                              }
                           } else {
                              if (!this.i()) {
                                 this.FriendCard = this.aa;
                              }

                              if (this.aa >= this.Y.length()) {
                                 if (c) {
                                    var167 = -583845456;
                                    var30 = 653292579;
                                    var305 = (var30 | var167) - (var30 & var167);
                                    var167 = -71086701;
                                    var30 = var305;
                                    var305 = (var30 | var167) - (var30 & var167);
                                    var167 = 1520657482;
                                    var30 = 308505459;
                                    var10001 = var30 & ~var167 | ~var30 & var167;
                                    var167 = 1220546361;
                                    var30 = var10001;
                                    var305 /= (var30 | var167) & (~var30 | ~var167);
                                 }
                              } else {
                                 var167 = -1507453665;
                                 var30 = 1340782880;
                                 int var402 = (var30 | var167) - (var30 & var167);
                                 var167 = -372462530;
                                 var30 = var402;
                                 var167 = (var30 | var167) - (var30 & var167);
                                 var30 = this.aa;
                                 this.aa = (var30 | var167) + (var30 & var167);
                                 this.CosmeticModelRenderer = this.aa;
                              }
                           }

                           this.h();
                           var167 = -1894652373;
                           var30 = -1379665590;
                           var305 = (var30 | var167) - (var30 & var167);
                           var167 = 584195936;
                           var30 = var305;
                           return pulse.Bool.from(var30 + var167 - 2 * (var30 & var167));
                        }

                        if (var5 == 0) {
                           if (!this.i()) {
                              if (this.aa > 0) {
                                 var167 = 739465268;
                                 var30 = 1906407475;
                                 int var397 = (var30 | var167) - (var30 & var167);
                                 var167 = 1571954694;
                                 var30 = var397;
                                 var167 = (var30 | var167) & ~(var30 & var167);
                                 var30 = this.aa;
                                 this.aa = (var30 & ~var167) - (~var30 & var167);
                              }
                           } else {
                              this.aa = Math.min(this.FriendCard, this.CosmeticModelRenderer);
                              this.j();
                           }
                        } else {
                           if (!this.i()) {
                              this.FriendCard = this.aa;
                           }

                           if (this.aa > 0) {
                              int var398 = (int)2430616975182893655L;
                              var167 = 21101156;
                              var30 = var398;
                              var398 = var30 & ~var167 | ~var30 & var167;
                              var167 = -812750798;
                              var30 = var398;
                              var167 = (var30 | var167) & ~(var30 & var167);
                              var30 = this.aa;
                              this.aa = var30 - var167;
                              this.CosmeticModelRenderer = this.aa;
                           }
                        }

                        this.h();
                        var167 = -636979823;
                        var30 = 958753045;
                        var305 = (var30 | var167) & (~var30 | ~var167);
                        var167 = -483582843;
                        var30 = var305;
                        return pulse.Bool.from((var30 | var167) & (var30 & var167 ^ -1));
                     }

                     if (!this.i()) {
                        if (this.aa >= this.Y.length()) {
                           if (c) {
                              var167 = 221253231;
                              var30 = -1553619891;
                              var305 = (var30 | var167) & ~(var30 & var167);
                              var167 = -1370117598;
                              var30 = var305;
                              var305 = (var30 | var167) & (~var30 | ~var167);
                              var167 = -1324247207;
                              var30 = 1219830002;
                              var10001 = var30 & ~var167 | ~var30 & var167;
                              var167 = -106645589;
                              var30 = var10001;
                              var305 /= (var30 | var167) & ~(var30 & var167);
                           }
                        } else {
                           var167 = 123295556;
                           var30 = 1523243826;
                           int var396 = (var30 | var167) & (~var30 | ~var167);
                           var167 = 1569950838;
                           var30 = var396;
                           String var375 = this.Y.substring((var30 | var167) & (~var30 | ~var167), this.aa);
                           var167 = -718421645;
                           var30 = -1441917913;
                           int var405 = (var30 | var167) - (var30 & var167);
                           var167 = 2133054805;
                           var30 = var405;
                           var167 = var30 + var167 - 2 * (var30 & var167);
                           var30 = this.aa;
                           String var18 = this.Y.substring((var30 | var167) + (var30 & var167));
                           String var17 = var375;
                           this.Y = var17 + var18;
                        }
                     } else {
                        this.l();
                     }

                     this.h();
                     var167 = 1465822251;
                     var30 = -827708700;
                     var305 = (var30 | var167) & ~(var30 & var167);
                     var167 = -1712027954;
                     var30 = var305;
                     return pulse.Bool.from(var30 & (var167 ^ -1) | (var30 ^ -1) & var167);
                  }

                  if (!this.i()) {
                     if (this.aa > 0) {
                        var167 = -888074977;
                        var30 = -466668960;
                        int var10002 = (var30 | var167) & (~var30 | ~var167);
                        var167 = 792608639;
                        var30 = var10002;
                        var10002 = (var30 | var167) & ~(var30 & var167);
                        int var10004 = (int)-7159082082433849049L;
                        var167 = -1697680469;
                        var30 = var10004;
                        var10004 = (var30 | var167) - (var30 & var167);
                        var167 = 1550178957;
                        var30 = var10004;
                        var167 = (var30 | var167) & ~(var30 & var167);
                        var30 = this.aa;
                        String var371 = this.Y.substring(var10002, var30 + ~var167 + 1);
                        String var16 = this.Y.substring(this.aa);
                        String var15 = var371;
                        this.Y = var15 + var16;
                        var167 = -615628221;
                        var30 = 147811534;
                        var10002 = (var30 | var167) & ~(var30 & var167);
                        var167 = -746508660;
                        var30 = var10002;
                        var167 = (var30 | var167) & ~(var30 & var167);
                        var30 = this.aa;
                        this.aa = (var30 ^ var167) - 2 * (~var30 & var167);
                     }
                  } else {
                     this.l();
                  }

                  this.h();
                  var305 = (int)300113365649747583L;
                  var167 = 349102263;
                  var30 = var305;
                  var305 = (var30 | var167) - (var30 & var167);
                  var167 = 52989641;
                  var30 = var305;
                  return pulse.Bool.from((var30 | var167) - (var30 & var167));
               }

               var10001 = (int)-6051975014240864208L;
               var167 = 352768865;
               var30 = var10001;
               var10001 = (var30 | var167) - (var30 & var167);
               var167 = 463792977;
               var30 = var10001;
               this.a(pulse.Bool.from((var30 | var167) - (var30 & var167)));
               var167 = -977623464;
               var30 = -504470274;
               var305 = (var30 | var167) & ~(var30 & var167);
               var167 = 609534631;
               var30 = var305;
               return pulse.Bool.from((var30 | var167) & (var30 ^ -1 | var167 ^ -1));
            }
         }

         var10001 = (int)-3490484704839141889L;
         var167 = 1183405920;
         var30 = var10001;
         var10001 = var30 & ~var167 | ~var30 & var167;
         var167 = -995515746;
         var30 = var10001;
         this.a(pulse.Bool.from(var30 + var167 - 2 * (var30 & var167)));
         var167 = -1798598982;
         var30 = -892510858;
         var305 = (var30 | var167) - (var30 & var167);
         var167 = 1577505741;
         var30 = var305;
         return pulse.Bool.from(var30 & (var167 ^ -1) | (var30 ^ -1) & var167);
      } else {
         int var22 = 1087427823;
         int var21 = 445205753;
         int var10000 = var21 + var22 - 2 * (var21 & var22);
         var22 = 1515821078;
         var21 = var10000;
         return pulse.Bool.from(var21 + var22 - 2 * (var21 & var22));
      }
   }

   public boolean a(char var1, int var2) {
      if (this.X) {
         if (this.a(var1)) {
            if (this.i()) {
               this.l();
            }

            int var29 = this.Y.length();
            int var10001 = (int)-7067301868893728515L;
            int var19 = 1077613991;
            int var9 = var10001;
            var10001 = var9 & ~var19 | ~var9 & var19;
            var19 = -1206286982;
            var9 = var10001;
            if (var29 < (var9 & ~var19 | ~var9 & var19)) {
               int var10002 = (int)1643772007153908860L;
               var19 = -89085524;
               var9 = var10002;
               var10002 = (var9 | var19) & ~(var9 & var19);
               var19 = -2003626544;
               var9 = var10002;
               String var33 = this.Y.substring((var9 | var19) & (~var9 | ~var19), this.aa);
               String var5 = this.Y.substring(this.aa);
               char var4 = var1;
               String var3 = var33;
               this.Y = var3 + var4 + var5;
               var19 = -796003810;
               var9 = -670616494;
               var10002 = (var9 | var19) - (var9 & var19);
               var19 = 143312461;
               var9 = var10002;
               var19 = var9 + var19 - 2 * (var9 & var19);
               var9 = this.aa;
               this.aa = (var9 & ~var19) + (var19 & ~var9) + 2 * (var9 & var19);
               this.h();
            }
         }

         int var30 = (int)-3402821099536558385L;
         int var26 = -1128770672;
         int var16 = var30;
         var30 = var16 + var26 - 2 * (var16 & var26);
         var26 = -1689057954;
         var16 = var30;
         return pulse.Bool.from(var16 & (var26 ^ -1) | (var16 ^ -1) & var26);
      } else {
         int var10000 = (int)-3757361082816187523L;
         int var7 = 882008058;
         int var6 = var10000;
         var10000 = (var6 | var7) - (var6 & var7);
         var7 = -1857065849;
         var6 = var10000;
         return pulse.Bool.from((var6 | var7) & (var6 ^ -1 | var7 ^ -1));
      }
   }

   private void h() {
      this.CosmeticModelLoader.d(1.0);
      int var2 = 1260872096;
      int var1 = -329802143;
      int var10001 = var1 & ~var2 | ~var1 & var2;
      var2 = -1485766719;
      var1 = var10001;
      this.ModelPart = pulse.Bool.from((var1 | var2) & ~(var1 & var2));
      var2 = 1538746802;
      var1 = 1969146926;
      var10001 = var1 & ~var2 | ~var1 & var2;
      var2 = -952360285;
      var1 = var10001;
      var10001 = (var1 | var2) & ~(var1 & var2);
      var2 = -98256043;
      var1 = -697852161;
      int var10002 = (var1 | var2) & ~(var1 & var2);
      var2 = -505488659;
      var1 = var10002;
      var10002 = (var1 & ~var2 | ~var1 & var2) * (var1 & ~var2 | ~var1 & var2);
      this.CosmeticModelLoader.a(0.3, 0.5, pulse.Easing.i);
   }

   private boolean i() {
      int var4 = -892777331;
      int var3 = -1685407130;
      int var10001 = (var3 | var4) & (~var3 | ~var4);
      var4 = -1363408620;
      var3 = var10001;
      if (this.FriendCard != (var3 | var4) - (var3 & var4)) {
         var10001 = (int)838516087800270607L;
         var4 = 1465957300;
         var3 = var10001;
         var10001 = var3 + var4 - 2 * (var3 & var4);
         var4 = -950645948;
         var3 = var10001;
         if (this.CosmeticModelRenderer == ((var3 | var4) & (~var3 | ~var4))) {
            var4 = -1952689972;
            var3 = -1480000867;
            var10001 = var3 & ~var4 | ~var3 & var4;
            var4 = 743746113;
            var3 = var10001;
            var10001 = (var3 | var4) & ~(var3 & var4);
            var4 = 1343000019;
            var3 = 892007064;
            var10001 = (var3 | var4) & ~(var3 & var4);
            var4 = 1697021763;
            var3 = var10001;
            var10001 = var3 + var4 - 2 * (var3 & var4);
            int var10000 = (int)6899913824827523625L;
            var4 = 343511544;
            var3 = var10000;
            var10000 = var3 & ~var4 | ~var3 & var4;
            var4 = -10737614;
            var3 = var10000;
            int var2 = var3 & ~var4 | ~var3 & var4;
            b = var2;
            String var70 = "bii";
            var10000 = (int)-3970173171375915441L;
            var4 = 1628700611;
            var3 = var10000;
            var10000 = (var3 | var4) - (var3 & var4);
            var4 = 1625020913;
            var3 = var10000;
            if ((var3 & ~var4 | ~var3 & var4) < b) {
               var10000 = (int)-2272838222977088865L;
               var4 = -1984191674;
               var3 = var10000;
               var10000 = (var3 | var4) & ~(var3 & var4);
               var4 = 373219801;
               var3 = var10000;
               var10000 = (var3 | var4) - (var3 & var4);
               var10001 = (int)-4236190447384051062L;
               var4 = 535414279;
               var3 = var10001;
               var10001 = var3 & ~var4 | ~var3 & var4;
               var4 = 1630307469;
               var3 = var10001;
               var10000 /= (var3 | var4) - (var3 & var4);
            }
         } else {
            if (this.FriendCard != this.CosmeticModelRenderer) {
               int var88 = (int)-1292026416617563564L;
               var4 = -1755641408;
               var3 = var88;
               var88 = (var3 | var4) & ~(var3 & var4);
               var4 = 1515049877;
               var3 = var88;
               return pulse.Bool.from(var3 & ~var4 | ~var3 & var4);
            }

            int var77 = (int)7212911857062133835L;
            var4 = 1855699662;
            var3 = var77;
            var77 = (var3 | var4) - (var3 & var4);
            var4 = -777110822;
            var3 = var77;
            var77 = ((var3 | var4) - (var3 & var4)) * ((var3 | var4) - (var3 & var4));
            var77 = (int)-1703981725324415686L;
            var4 = 1931622851;
            var3 = var77;
            var77 = var3 + var4 - 2 * (var3 & var4);
            var4 = 1812918463;
            var3 = var77;
            int var5 = (var3 | var4) & ~(var3 & var4);
            b = var5;
            String var82 = "bij";
            var4 = -1225871870;
            var3 = -1254038493;
            var77 = (var3 | var4) - (var3 & var4);
            var4 = 37458569;
            var3 = var77;
            if ((var3 & ~var4 | ~var3 & var4) <= b) {
               var10001 = (int)7072561933671635808L;
               var4 = 2011317516;
               var3 = var10001;
               var10001 = (var3 | var4) - (var3 & var4);
               var4 = 999349859;
               var3 = var10001;
               var10001 = (var3 | var4) - (var3 & var4);
               var4 = -1107122934;
               var3 = 74729850;
               var10001 = var3 & ~var4 | ~var3 & var4;
               var4 = -1166611339;
               var3 = var10001;
               var10001 = (var3 | var4) & ~(var3 & var4);
               var77 = (int)7167797737349800738L;
               var4 = -1246345221;
               var3 = var77;
               var77 = var3 + var4 - 2 * (var3 & var4);
               var4 = 926005317;
               var3 = var77;
               var5 = (var3 | var4) & (~var3 | ~var4);
               b = var5;
            }
         }
      }

      var4 = -591715973;
      var3 = 1529578292;
      int var86 = var3 & ~var4 | ~var3 & var4;
      var4 = -2020564401;
      var3 = var86;
      return pulse.Bool.from((var3 | var4) & ~(var3 & var4));
   }

   private void j() {
      int var10001 = (int)3953293759911663187L;
      int var2 = 751674021;
      int var1 = var10001;
      var10001 = (var1 | var2) & (~var1 | ~var2);
      var2 = 2139081481;
      var1 = var10001;
      this.FriendCard = (var1 | var2) & (~var1 | ~var2);
      var2 = -894019400;
      var1 = 1011031630;
      var10001 = var1 & ~var2 | ~var1 & var2;
      var2 = 151697673;
      var1 = var10001;
      this.CosmeticModelRenderer = var1 & ~var2 | ~var1 & var2;
   }

   private String k() {
      if (this.i()) {
         int var1 = Math.min(this.FriendCard, this.CosmeticModelRenderer);
         int var2 = Math.max(this.FriendCard, this.CosmeticModelRenderer);
         return this.Y.substring(var1, var2);
      } else {
         int var4 = 2052486093;
         int var3 = -686067294;
         int var10001 = (var3 | var4) & ~(var3 & var4);
         var4 = -1387462018;
         var3 = var10001;
         var10001 = (var3 | var4) - (var3 & var4);
         var4 = 1990906440;
         var3 = -1270025863;
         var10001 = var3 & ~var4 | ~var3 & var4;
         var4 = -1025105092;
         var3 = var10001;
         var10001 = (var3 | var4) - (var3 & var4);
         var4 = -593692401;
         var3 = -237937300;
         var10001 = var3 + var4 - 2 * (var3 & var4);
         var4 = 760063086;
         var3 = var10001;
         var10001 = (var3 | var4) - (var3 & var4);
         String var58 = "bik";
         var4 = 1008719851;
         var3 = 1686678285;
         int var10003 = (var3 | var4) & (~var3 | ~var4);
         var4 = 1486322925;
         var3 = var10003;
         var10003 = (var3 | var4) - (var3 & var4);
         int var10002 = (int)7975569876906282687L;
         var4 = 2122447441;
         var3 = var10002;
         var10002 = var3 + var4 - 2 * (var3 & var4);
         var4 = 2146388381;
         var3 = var10002;
         var10002 = var3 & ~var4 | ~var3 & var4;
         var10003 = (int)-4791544573824712189L;
         var4 = -1816791905;
         var3 = var10003;
         var10003 = (var3 | var4) & (~var3 | ~var4);
         var4 = -788676746;
         var3 = var10003;
         var10003 = var3 + var4 - 2 * (var3 & var4);
         int var10004 = (int)1776386833088447581L;
         var4 = 317970641;
         var3 = var10004;
         var10004 = var3 + var4 - 2 * (var3 & var4);
         var4 = 65346693;
         var3 = var10004;
         var4 = var3 & ~var4 | ~var3 & var4;
         var3 = var10003;
         var10003 = (var3 ^ var4) + 2 * (var3 & var4);
         var10003 = (int)4099238069457317084L;
         var4 = 863627049;
         var3 = var10003;
         var10003 = (var3 | var4) & (~var3 | ~var4);
         var4 = -350033027;
         var3 = var10003;
         var10003 = (var3 | var4) - (var3 & var4);
         var4 = -1986248445;
         var3 = 507214726;
         var10004 = var3 & ~var4 | ~var3 & var4;
         var4 = 280095418;
         var3 = var10004;
         var10004 = (var3 & ~var4 | ~var3 & var4) * (var3 & ~var4 | ~var3 & var4);
         var10004 = (int)-5602460806848577322L;
         var4 = -263479472;
         var3 = var10004;
         var10004 = (var3 | var4) - (var3 & var4);
         var4 = -1202801394;
         var3 = var10004;
         var10004 = (var3 | var4) & ~(var3 & var4);
         int var10005 = (int)-8888053273144044707L;
         var4 = 1377591459;
         var3 = var10005;
         var10005 = var3 & ~var4 | ~var3 & var4;
         var4 = -2012318091;
         var3 = var10005;
         var10005 = var3 & ~var4 | ~var3 & var4;
         var4 = -382887418;
         var3 = 1767939015;
         var10005 = var3 + var4 - 2 * (var3 & var4);
         var4 = -2141934602;
         var3 = var10005;
         return a("", "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘ґ~\ua7efк’¶кЃєк¤‚зµЈи№ѓ\u2435и¬єг‘І|кџік“єкЃІк¤Љзµёи№Њв‘іи¬°г‘¤=кџ…к’єкЃїк¤ѓзµїи№Ќ\u2453и¬Јг‘І\u007fкџѓк’№кЃґк¤€зµіи№„в‘®", var10002, var10003, var10004, (var3 | var4) & ~(var3 & var4));
      }
   }

   private void l() {
      if (this.i()) {
         int var1 = Math.min(this.FriendCard, this.CosmeticModelRenderer);
         int var2 = Math.max(this.FriendCard, this.CosmeticModelRenderer);
         int var10002 = (int)-8555600951759354720L;
         int var6 = -384408761;
         int var5 = var10002;
         var10002 = var5 + var6 - 2 * (var5 & var6);
         var6 = 1735763943;
         var5 = var10002;
         String var10001 = this.Y.substring(var5 + var6 - 2 * (var5 & var6), var1);
         String var4 = this.Y.substring(var2);
         String var3 = var10001;
         this.Y = var3 + var4;
         this.aa = var1;
         this.j();
      }
   }

   public boolean g() {
      return this.X;
   }

   static {
      int var1 = -1781170033;
      int var0 = -1366197418;
      int var10002 = var0 + var1 - 2 * (var0 & var1);
      var1 = 994376660;
      var0 = var10002;
      var10002 = (var0 | var1) - (var0 & var1);
      int var10003 = (int)6662355435619434578L;
      var1 = -56180427;
      var0 = var10003;
      var10003 = var0 + var1 - 2 * (var0 & var1);
      var1 = -1344568982;
      var0 = var10003;
      var10003 = (var0 | var1) & (~var0 | ~var1);
      var1 = 666780216;
      var0 = 382712726;
      int var10004 = var0 & ~var1 | ~var0 & var1;
      var1 = 829553087;
      var0 = var10004;
      l = new Color(var10002, var10003, (var0 | var1) & (~var0 | ~var1));
      var10002 = (int)3046167874372398048L;
      var1 = 244840075;
      var0 = var10002;
      var10002 = (var0 | var1) - (var0 & var1);
      var1 = -793010822;
      var0 = var10002;
      var10002 = (var0 | var1) & (~var0 | ~var1);
      var10003 = (int)5186293141715950420L;
      var1 = 601512872;
      var0 = var10003;
      var10003 = var0 & ~var1 | ~var0 & var1;
      var1 = 2128363757;
      var0 = var10003;
      var10003 = var0 & ~var1 | ~var0 & var1;
      var10004 = (int)3950702369841226489L;
      var1 = -1474606215;
      var0 = var10004;
      var10004 = (var0 | var1) - (var0 & var1);
      var1 = 263547287;
      var0 = var10004;
      m = new Color(var10002, var10003, var0 + var1 - 2 * (var0 & var1));
      var10002 = (int)1812745061875740996L;
      var1 = 2047536321;
      var0 = var10002;
      var10002 = (var0 | var1) & ~(var0 & var1);
      var1 = -210199145;
      var0 = var10002;
      var10002 = (var0 | var1) & ~(var0 & var1);
      var1 = -399541738;
      var0 = -467172647;
      var10003 = var0 + var1 - 2 * (var0 & var1);
      var1 = 201914589;
      var0 = var10003;
      var10003 = (var0 | var1) & ~(var0 & var1);
      var10004 = (int)9105738686050959675L;
      var1 = 2037892095;
      var0 = var10004;
      var10004 = (var0 | var1) & ~(var0 & var1);
      var1 = 1324237523;
      var0 = var10004;
      n = new Color(var10002, var10003, var0 + var1 - 2 * (var0 & var1));
      var10002 = (int)-133804860363456827L;
      var1 = -1363520896;
      var0 = var10002;
      var10002 = (var0 | var1) & (~var0 | ~var1);
      var1 = -1838486442;
      var0 = var10002;
      var10002 = var0 + var1 - 2 * (var0 & var1);
      var1 = 845365557;
      var0 = 258331500;
      var10003 = var0 + var1 - 2 * (var0 & var1);
      var1 = 1023840842;
      var0 = var10003;
      var10003 = (var0 | var1) & (~var0 | ~var1);
      var10004 = (int)128606580716862489L;
      var1 = 1330901285;
      var0 = var10004;
      var10004 = (var0 | var1) & (~var0 | ~var1);
      var1 = -1204548315;
      var0 = var10004;
      o = new Color(var10002, var10003, (var0 | var1) & ~(var0 & var1));
      var10002 = (int)8268188443950211963L;
      var1 = 1712981068;
      var0 = var10002;
      var10002 = var0 + var1 - 2 * (var0 & var1);
      var1 = 666789677;
      var0 = var10002;
      var10002 = (var0 | var1) - (var0 & var1);
      var10003 = (int)4023733268072561907L;
      var1 = -49139;
      var0 = var10003;
      var10003 = (var0 | var1) & ~(var0 & var1);
      var1 = 1302183140;
      var0 = var10003;
      var10003 = var0 & ~var1 | ~var0 & var1;
      var10004 = (int)-3267363985843312852L;
      var1 = 1946290964;
      var0 = var10004;
      var10004 = (var0 | var1) - (var0 & var1);
      var1 = 1810213910;
      var0 = var10004;
      p = new Color(var10002, var10003, var0 + var1 - 2 * (var0 & var1));
      var1 = -59312228;
      var0 = 988835168;
      var10002 = var0 & ~var1 | ~var0 & var1;
      var1 = -964257042;
      var0 = var10002;
      var10002 = (var0 | var1) & (~var0 | ~var1);
      var10003 = (int)-8560224127098983123L;
      var1 = 230924645;
      var0 = var10003;
      var10003 = var0 & ~var1 | ~var0 & var1;
      var1 = -1488270246;
      var0 = var10003;
      var10003 = (var0 | var1) & ~(var0 & var1);
      var1 = 1107093552;
      var0 = -503405778;
      var10004 = (var0 | var1) - (var0 & var1);
      var1 = -1610462401;
      var0 = var10004;
      q = new Color(var10002, var10003, (var0 | var1) - (var0 & var1));
      var10002 = (int)-865196330750738840L;
      var1 = 2104698521;
      var0 = var10002;
      var10002 = (var0 | var1) & ~(var0 & var1);
      var1 = 298997973;
      var0 = var10002;
      var10002 = (var0 | var1) & ~(var0 & var1);
      var1 = 944440742;
      var0 = 437513444;
      var10003 = var0 & ~var1 | ~var0 & var1;
      var1 = 576252262;
      var0 = var10003;
      var10003 = (var0 | var1) - (var0 & var1);
      var1 = -1893125866;
      var0 = -1316372726;
      var10004 = var0 + var1 - 2 * (var0 & var1);
      var1 = 1050709598;
      var0 = var10004;
      r = new Color(var10002, var10003, var0 & ~var1 | ~var0 & var1);
      var10002 = (int)-5734878280158973420L;
      var1 = 431795361;
      var0 = var10002;
      var10002 = var0 & ~var1 | ~var0 & var1;
      var1 = -658907481;
      var0 = var10002;
      var10002 = var0 + var1 - 2 * (var0 & var1);
      var1 = -393072836;
      var0 = 139332200;
      var10003 = (var0 | var1) & (~var0 | ~var1);
      var1 = -522443450;
      var0 = var10003;
      var10003 = var0 & ~var1 | ~var0 & var1;
      var1 = 654850832;
      var0 = -211594477;
      var10004 = (var0 | var1) & (~var0 | ~var1);
      var1 = -731158494;
      var0 = var10004;
      s = new Color(var10002, var10003, (var0 | var1) & (~var0 | ~var1));
      var10002 = (int)-703255920952685197L;
      var1 = 718128113;
      var0 = var10002;
      var10002 = (var0 | var1) & (~var0 | ~var1);
      var1 = 1872826006;
      var0 = var10002;
      var10002 = var0 & ~var1 | ~var0 & var1;
      var10003 = (int)5649022621996142207L;
      var1 = -226605448;
      var0 = var10003;
      var10003 = (var0 | var1) & ~(var0 & var1);
      var1 = -364410861;
      var0 = var10003;
      var10003 = var0 & ~var1 | ~var0 & var1;
      var1 = 1326269699;
      var0 = -1322822612;
      var10004 = (var0 | var1) - (var0 & var1);
      var1 = -30797516;
      var0 = var10004;
      t = new Color(var10002, var10003, (var0 | var1) & (~var0 | ~var1));
      var10002 = (int)-7674779645032856630L;
      var1 = -204933023;
      var0 = var10002;
      var10002 = (var0 | var1) - (var0 & var1);
      var1 = -1415316557;
      var0 = var10002;
      var10002 = (var0 | var1) & ~(var0 & var1);
      var10003 = (int)8919369185244917579L;
      var1 = -931254693;
      var0 = var10003;
      var10003 = (var0 | var1) - (var0 & var1);
      var1 = -1419214584;
      var0 = var10003;
      var10003 = var0 + var1 - 2 * (var0 & var1);
      var10004 = (int)-13821681433207346L;
      var1 = 836763582;
      var0 = var10004;
      var10004 = (var0 | var1) & (~var0 | ~var1);
      var1 = 841376336;
      var0 = var10004;
      u = new Color(var10002, var10003, var0 & ~var1 | ~var0 & var1);
      var10002 = (int)-5682416518124671368L;
      var1 = 1840622007;
      var0 = var10002;
      var10002 = (var0 | var1) & (~var0 | ~var1);
      var1 = -18331669;
      var0 = var10002;
      var10002 = (var0 | var1) - (var0 & var1);
      var10003 = (int)-5551341506044869405L;
      var1 = -1165063225;
      var0 = var10003;
      var10003 = (var0 | var1) & ~(var0 & var1);
      var1 = -1143025920;
      var0 = var10003;
      var10003 = (var0 | var1) - (var0 & var1);
      var1 = -418687238;
      var0 = 1616020825;
      var10004 = var0 + var1 - 2 * (var0 & var1);
      var1 = -2024156257;
      var0 = var10004;
      v = new Color(var10002, var10003, (var0 | var1) & ~(var0 & var1));
      var10002 = (int)8741362175357131569L;
      var1 = -485268620;
      var0 = var10002;
      var10002 = (var0 | var1) - (var0 & var1);
      var1 = 1344403551;
      var0 = var10002;
      var10002 = (var0 | var1) & (~var0 | ~var1);
      var10003 = (int)-2582336282501650133L;
      var1 = -457064693;
      var0 = var10003;
      var10003 = (var0 | var1) - (var0 & var1);
      var1 = -769436102;
      var0 = var10003;
      var10003 = (var0 | var1) & (~var0 | ~var1);
      var10004 = (int)7060645305842280551L;
      var1 = 1866052609;
      var0 = var10004;
      var10004 = (var0 | var1) & ~(var0 & var1);
      var1 = 1157340235;
      var0 = var10004;
      w = new Color(var10002, var10003, var0 + var1 - 2 * (var0 & var1));
      var10002 = (int)9210707190089535761L;
      var1 = 589600155;
      var0 = var10002;
      var10002 = var0 & ~var1 | ~var0 & var1;
      var1 = -1337408364;
      var0 = var10002;
      var10002 = var0 & ~var1 | ~var0 & var1;
      var10003 = (int)1465171249215700676L;
      var1 = -568789895;
      var0 = var10003;
      var10003 = (var0 | var1) & (~var0 | ~var1);
      var1 = -628815196;
      var0 = var10003;
      var10003 = (var0 | var1) & ~(var0 & var1);
      var10004 = (int)821800476163935227L;
      var1 = -564899417;
      var0 = var10004;
      var10004 = (var0 | var1) & (~var0 | ~var1);
      var1 = 262920787;
      var0 = var10004;
      x = new Color(var10002, var10003, (var0 | var1) & ~(var0 & var1));
      var10002 = (int)-3940907031817316273L;
      var1 = -7893075;
      var0 = var10002;
      var10002 = (var0 | var1) - (var0 & var1);
      var1 = -868804613;
      var0 = var10002;
      var10002 = var0 + var1 - 2 * (var0 & var1);
      var1 = 265536657;
      var0 = -1613848035;
      var10003 = (var0 | var1) - (var0 & var1);
      var1 = -1877121384;
      var0 = var10003;
      var10003 = (var0 | var1) - (var0 & var1);
      var10004 = (int)2824199570536550069L;
      var1 = 2136156120;
      var0 = var10004;
      var10004 = (var0 | var1) & ~(var0 & var1);
      var1 = -1342740127;
      var0 = var10004;
      y = new Color(var10002, var10003, var0 & ~var1 | ~var0 & var1);
      var10002 = (int)3123594323268380384L;
      var1 = -1072399106;
      var0 = var10002;
      var10002 = (var0 | var1) - (var0 & var1);
      var1 = 214096462;
      var0 = var10002;
      var10002 = (var0 | var1) & (~var0 | ~var1);
      var1 = 56183157;
      var0 = -507488137;
      var10003 = var0 + var1 - 2 * (var0 & var1);
      var1 = -493285053;
      var0 = var10003;
      var10003 = (var0 | var1) & (~var0 | ~var1);
      var10004 = (int)4259609906667580998L;
      var1 = -423637225;
      var0 = var10004;
      var10004 = var0 + var1 - 2 * (var0 & var1);
      var1 = -1374150321;
      var0 = var10004;
      z = new Color(var10002, var10003, (var0 | var1) & (~var0 | ~var1));
      var1 = -515900785;
      var0 = -974345865;
      var10002 = (var0 | var1) & (~var0 | ~var1);
      var1 = 617829327;
      var0 = var10002;
      var10002 = (var0 | var1) & (~var0 | ~var1);
      var10003 = (int)-1663319166610234123L;
      var1 = 239035270;
      var0 = var10003;
      var10003 = var0 & ~var1 | ~var0 & var1;
      var1 = -668580002;
      var0 = var10003;
      var10003 = var0 & ~var1 | ~var0 & var1;
      var10004 = (int)6661470986781043063L;
      var1 = -424431002;
      var0 = var10004;
      var10004 = (var0 | var1) - (var0 & var1);
      var1 = 1846811397;
      var0 = var10004;
      A = new Color(var10002, var10003, (var0 | var1) & ~(var0 & var1));
      var10002 = (int)-500345435402202852L;
      var1 = 1650039512;
      var0 = var10002;
      var10002 = (var0 | var1) & ~(var0 & var1);
      var1 = 1535413228;
      var0 = var10002;
      var10002 = (var0 | var1) - (var0 & var1);
      var10003 = (int)1545886511259687095L;
      var1 = -1865558060;
      var0 = var10003;
      var10003 = var0 & ~var1 | ~var0 & var1;
      var1 = -25276606;
      var0 = var10003;
      var10003 = (var0 | var1) & (~var0 | ~var1);
      var1 = 924105538;
      var0 = 1556891162;
      var10004 = (var0 | var1) & (~var0 | ~var1);
      var1 = 1809382730;
      var0 = var10004;
      B = new Color(var10002, var10003, (var0 | var1) & ~(var0 & var1));
      var10002 = (int)-3144451166665208611L;
      var1 = 913846010;
      var0 = var10002;
      var10002 = var0 & ~var1 | ~var0 & var1;
      var1 = -618421756;
      var0 = var10002;
      var10002 = (var0 | var1) - (var0 & var1);
      var10003 = (int)-4928263437401697395L;
      var1 = -1676733767;
      var0 = var10003;
      var10003 = var0 + var1 - 2 * (var0 & var1);
      var1 = 1513046312;
      var0 = var10003;
      var10003 = var0 & ~var1 | ~var0 & var1;
      var10004 = (int)6655104158068014775L;
      var1 = 2045964777;
      var0 = var10004;
      var10004 = (var0 | var1) - (var0 & var1);
      var1 = -852717743;
      var0 = var10004;
      C = new Color(var10002, var10003, var0 & ~var1 | ~var0 & var1);
      var1 = 316958269;
      var0 = -638784754;
      var10002 = (var0 | var1) & ~(var0 & var1);
      var1 = -888631860;
      var0 = var10002;
      var10002 = (var0 | var1) - (var0 & var1);
      var10003 = (int)-5412049108832779486L;
      var1 = 110001516;
      var0 = var10003;
      var10003 = (var0 | var1) & (~var0 | ~var1);
      var1 = -2021392762;
      var0 = var10003;
      var10003 = (var0 | var1) & ~(var0 & var1);
      var1 = 552368498;
      var0 = -1506152148;
      var10004 = var0 + var1 - 2 * (var0 & var1);
      var1 = -2032826354;
      var0 = var10004;
      D = new Color(var10002, var10003, (var0 | var1) - (var0 & var1));
   }

   public static String a(String var0, String var1, int var2, int var3, int var4, int var5) {
      char[] var6 = var1.toCharArray();
      char[] var7 = new char[var6.length];
      int var10000 = (int)-5290845795476004577L;
      int var18 = 1589621098;
      int var17 = var10000;
      var10000 = (var17 | var18) & ~(var17 & var18);
      var18 = -1443426177;
      var17 = var10000;
      char[] var264 = new char[(var17 | var18) & (~var17 | ~var18)];
      int var10002 = (int)-8966977975605648836L;
      var18 = 1869508621;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 539513393;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      int var10003 = (int)3264373703801006836L;
      var18 = -232911323;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1731276003;
      var17 = var10003;
      var264[var10002] = (char)((var17 | var18) - (var17 & var18));
      var10002 = (int)6812323799562537015L;
      var18 = -1970795530;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -1923791936;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)3662910331834619398L;
      var18 = -1054294814;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -197867167;
      var17 = var10003;
      var264[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var10002 = (int)2066006996200218498L;
      var18 = 1070527041;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -2009944639;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)8499415451044964096L;
      var18 = -1919844668;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -1416545726;
      var17 = var10003;
      var264[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var10002 = (int)5795606685489959813L;
      var18 = 440039788;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -390567190;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var10003 = (int)2956873726099240024L;
      var18 = 698530058;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1039150123;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)6568875940150378410L;
      var18 = -268108923;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -901669828;
      var17 = var10003;
      var264[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var18 = 1935472259;
      var17 = -37002712;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -1902668625;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 1083940550;
      var17 = 1370134172;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 745287005;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 1448618976;
      var17 = 1889832087;
      int var10004 = var17 & ~var18 | ~var17 & var18;
      var18 = -230152809;
      var17 = var10004;
      var18 = (var17 | var18) & (~var17 | ~var18);
      var17 = var10003;
      var10003 = (var17 ^ var18) + 2 * (var17 & var18);
      var18 = 70781651;
      var17 = 1042549065;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 974951103;
      var17 = var10003;
      var264[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var18 = 1498740923;
      var17 = -1029990854;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -1680904572;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -2025218798;
      var17 = -2003468825;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 266118519;
      var17 = var10003;
      var264[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var10002 = (int)-3129761814140727454L;
      var18 = 1960424661;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 542571441;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var10003 = (int)4001363593096259659L;
      var18 = -1831456603;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 1299763709;
      var17 = var10003;
      var264[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var10002 = (int)5634935283833851003L;
      var18 = -543169659;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -895176711;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 1503927727;
      var17 = 330625220;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 1242618185;
      var17 = var10003;
      var264[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var10002 = (int)-330083127215365332L;
      var18 = 2081574556;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 2078813624;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1304128651;
      var17 = 1761119803;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 625208035;
      var17 = var10003;
      var264[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var10002 = (int)3333701297879547909L;
      var18 = -1420693629;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1141862287;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)-8045560187762439734L;
      var18 = 508618444;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -214570974;
      var17 = var10003;
      var264[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      char[] var8 = var264;
      var18 = -430197886;
      var17 = -1234589153;
      var10000 = (var17 | var18) - (var17 & var18);
      var18 = 1345460631;
      var17 = var10000;
      char[] var266 = new char[(var17 | var18) - (var17 & var18)];
      var18 = 1275959812;
      var17 = 1915621594;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1042516702;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 1637838344;
      var17 = 52623080;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 1656606912;
      var17 = var10003;
      var266[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var18 = 513145653;
      var17 = -859761360;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -766185980;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)8773608829392531968L;
      var18 = 949410873;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -358927823;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var10004 = (int)-3005079955142361519L;
      var18 = -1442929182;
      var17 = var10004;
      var10004 = (var17 | var18) - (var17 & var18);
      var18 = -576733254;
      var17 = var10004;
      var18 = (var17 | var18) - (var17 & var18);
      var17 = var10003;
      var10003 = (var17 ^ var18) + 2 * (var17 & var18);
      var10003 = (int)-2161821810936880796L;
      var18 = -31813869;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1250923916;
      var17 = var10003;
      var266[var10002] = (char)((var17 | var18) - (var17 & var18));
      var18 = -1416726743;
      var17 = 1422018122;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -11783839;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      String var356 = "bil";
      var18 = -1123001269;
      var17 = -1563862842;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 534348766;
      var17 = var10003;
      var266[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var18 = -232812394;
      var17 = -1672943569;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 1851226298;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)1271143668971122590L;
      var18 = 960484560;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -1497545908;
      var17 = var10003;
      var266[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var10002 = (int)1124297985702578051L;
      var18 = -1494338108;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 227766851;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -1272566015;
      var17 = -742641686;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 1738160299;
      var17 = var10003;
      var266[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var18 = -1557687358;
      var17 = 861376565;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -1871707150;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1145865114;
      var17 = -1870491036;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -724686486;
      var17 = var10003;
      var266[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var10002 = (int)-7325774383196263226L;
      var18 = 1556927803;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1143142907;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var10003 = (int)2470932848822358953L;
      var18 = 1272254642;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -1115710904;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -660703837;
      var17 = -2036779180;
      var10004 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1891501986;
      var17 = var10004;
      var18 = var17 & ~var18 | ~var17 & var18;
      var17 = var10003;
      var10003 = var17 - ~var18 - 1;
      var10003 = (int)2664171057880614597L;
      var18 = 595371316;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 379970760;
      var17 = var10003;
      var266[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var10002 = (int)-4842444133877422987L;
      var18 = 238890097;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 2108868611;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -1184629890;
      var17 = -1063145671;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 2042774655;
      var17 = var10003;
      var266[var10002] = (char)((var17 | var18) - (var17 & var18));
      var18 = 1662201675;
      var17 = -772078058;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -1293407915;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)-9025679797014516328L;
      var18 = -1612772771;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -250361491;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var10004 = (int)-5101209123669661112L;
      var18 = 390005843;
      var17 = var10004;
      var10004 = var17 & ~var18 | ~var17 & var18;
      var18 = 255098658;
      var17 = var10004;
      var18 = var17 & ~var18 | ~var17 & var18;
      var17 = var10003;
      var10003 = var17 - ~var18 - 1;
      var18 = 1884088818;
      var17 = -1956784597;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -82723619;
      var17 = var10003;
      var266[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var18 = 671211960;
      var17 = -1782040474;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -1110844969;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1371751864;
      var17 = 1623252622;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -822323211;
      var17 = var10003;
      var266[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      char[] var9 = var266;
      var10000 = (int)8705077995596354712L;
      var18 = 1718204435;
      var17 = var10000;
      var10000 = var17 & ~var18 | ~var17 & var18;
      var18 = -1543590773;
      var17 = var10000;

      for (int var10 = var17 + var18 - 2 * (var17 & var18); var10 < var6.length; var10++) {
         char var324 = var6[var10];
         char var249 = var8[var10 % var8.length];
         char var128 = var324;
         var7[var10] = (char)((var128 | var249) - (var128 & var249));
      }

      char[] var19 = new char[var7.length];
      var10000 = (int)8027509546732447008L;
      var18 = -993507656;
      var17 = var10000;
      var10000 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1891836824;
      var17 = var10000;

      for (int var11 = (var17 | var18) - (var17 & var18); var11 < var6.length; var11++) {
         char var325 = var7[var11];
         char var252 = var9[var11 % var9.length];
         char var131 = var325;
         var19[var11] = (char)((var131 | var252) - (var131 & var252));
      }

      String var20 = new String(var19);
      int var12 = var20.hashCode();
      var18 = var5;
      var17 = var3;
      var10000 = 2 * (var17 & ~var18) - (var17 ^ var18);
      var18 = var2;
      var17 = var10000;
      int var13 = var17 + ~var18 + 1;
      char[] var14 = var0.toCharArray();
      char[] var15 = new char[var14.length];
      var10000 = (int)1139090957422131889L;
      var18 = -972890278;
      var17 = var10000;
      var10000 = var17 & ~var18 | ~var17 & var18;
      var18 = 168011243;
      var17 = var10000;

      for (int var16 = (var17 | var18) & (~var17 | ~var18); var16 < var15.length; var16++) {
         var18 = 89081448;
         var17 = 169437718;
         int var10001 = var17 + var18 - 2 * (var17 & var18);
         var18 = 257305724;
         var17 = var10001;
         switch (var16 % ((var17 | var18) & ~(var17 & var18))) {
            case 0:
               var18 = var12;
               var17 = var13;
               var10002 = var17 + var18 - 2 * (var17 & var18);
               char var262 = var14[var16];
               var17 = var10002;
               var15[var16] = (char)((var17 | var262) - (var17 & var262));
               break;
            case 1:
               var18 = var13;
               var17 = var5;
               var10002 = var17 + var18 - 2 * (var17 & var18);
               char var260 = var14[var16];
               var17 = var10002;
               var15[var16] = (char)(var17 & ~var260 | ~var17 & var260);
         }
      }

      return new String(var15);
   }
}
