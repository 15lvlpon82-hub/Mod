package pulse;

import java.util.Collections;
import java.util.List;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.feature.FeatureRenderer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.client.render.entity.model.PlayerEntityModel;
import net.minecraft.client.render.entity.state.PlayerEntityRenderState;
import net.minecraft.client.util.math.MatrixStack;

public class CosmeticFeatureRenderer extends FeatureRenderer<PlayerEntityRenderState, PlayerEntityModel> {
   private static final String[] a;
   private final CosmeticRenderController b = CosmeticRenderController.a();
   private static boolean c;

   public CosmeticFeatureRenderer(FeatureRendererContext<PlayerEntityRenderState, PlayerEntityModel> var1) {
      super(var1);
   }

   @Override
   public void render(MatrixStack var1, VertexConsumerProvider var2, int var3, PlayerEntityRenderState var4, float var5, float var6) {
   }

   private AbstractClientPlayerEntity a(MinecraftClient var1, int var2) {
      return null;
   }

   private List<CosmeticModel> a(AbstractClientPlayerEntity var1) {
      return Collections.emptyList();
   }

   private Integer a(AbstractClientPlayerEntity var1, String var2, MinecraftClient var3) {
      return null;
   }

   static {
      int var10000 = (int)-5086285351067320319L;
      int var1 = -198066766;
      int var0 = var10000;
      var10000 = var0 & ~var1 | ~var0 & var1;
      var1 = 325959089;
      var0 = var10000;
      String[] var49 = new String[(var0 | var1) & (~var0 | ~var1)];
      int var10002 = (int)6411631102749419063L;
      var1 = -1748436771;
      var0 = var10002;
      var10002 = var0 + var1 - 2 * (var0 & var1);
      var1 = 301031146;
      var0 = var10002;
      var10002 = var0 + var1 - 2 * (var0 & var1);
      var1 = -1450558045;
      var0 = -2115663191;
      int var10005 = var0 & ~var1 | ~var0 & var1;
      var1 = 544892517;
      var0 = var10005;
      var10005 = (var0 | var1) - (var0 & var1);
      int var10006 = (int)-2653746284279501458L;
      var1 = 1002360377;
      var0 = var10006;
      var10006 = (var0 | var1) & (~var0 | ~var1);
      var1 = 644774346;
      var0 = var10006;
      var10006 = var0 + var1 - 2 * (var0 & var1);
      int var10007 = (int)-8448898913729971900L;
      var1 = -653122877;
      var0 = var10007;
      var10007 = (var0 | var1) - (var0 & var1);
      var1 = 1958503310;
      var0 = var10007;
      var10007 = var0 + var1 - 2 * (var0 & var1);
      var1 = 439847323;
      var0 = -1862919162;
      int var10008 = (var0 | var1) & (~var0 | ~var1);
      var1 = -1964708072;
      var0 = var10008;
      var49[var10002] = a(
         "\udfaeз‘Ќ\udfb2", "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘ґ}кџµк’ёкЃґк¤‘зµїи№‰\u2435и¬Ґг‘І|\ua7e2к’°кЃЈкҐЉзµ•и№…в‘©и¬єг‘Іf\ua7efк’¶кЃ—к¤Ђзµ·и№ћв‘Їи¬Ґг‘І@\ua7e3к’»кЃµк¤Ђзµ¤и№Џв‘Ё", var10005, var10006, var10007, (var0 | var1) - (var0 & var1)
      );
      var10002 = (int)-4624624809670334284L;
      var1 = -256830076;
      var0 = var10002;
      var10002 = (var0 | var1) & ~(var0 & var1);
      var1 = 412433713;
      var0 = var10002;
      var10002 = (var0 | var1) - (var0 & var1);
      var1 = -1030162049;
      var0 = 581046;
      var10005 = (var0 | var1) & ~(var0 & var1);
      var1 = -897190490;
      var0 = var10005;
      var10005 = (var0 | var1) & (~var0 | ~var1);
      var10006 = (int)4223179346823238873L;
      var1 = 550480105;
      var0 = var10006;
      var10006 = (var0 | var1) & (~var0 | ~var1);
      var1 = 580889623;
      var0 = var10006;
      var10006 = var0 & ~var1 | ~var0 & var1;
      var1 = 1240324475;
      var0 = 77872493;
      var10007 = (var0 | var1) - (var0 & var1);
      var1 = 1405058974;
      var0 = var10007;
      var10007 = (var0 | var1) - (var0 & var1);
      var10008 = (int)-8544685719734997854L;
      var1 = -204840451;
      var0 = var10008;
      var10008 = var0 + var1 - 2 * (var0 & var1);
      var1 = -28066480;
      var0 = var10008;
      var49[var10002] = a(
         "\udfb1з»Џ\udfa8з»Ѓ\udfb5",
         "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘ґ}кџµк’ёкЃґк¤‘зµїи№‰\u2435и¬Ґг‘І|\ua7e2к’°кЃЈкҐЉзµ•и№…в‘©и¬єг‘Іf\ua7efк’¶кЃ—к¤Ђзµ·и№ћв‘Їи¬Ґг‘І@\ua7e3к’»кЃµк¤Ђзµ¤и№Џв‘Ё",
         var10005,
         var10006,
         var10007,
         (var0 | var1) & (~var0 | ~var1)
      );
      a = var49;
      var10000 = (int)5874234936797927637L;
      var1 = -1665710979;
      var0 = var10000;
      var10000 = (var0 | var1) & (~var0 | ~var1);
      var1 = -743383896;
      var0 = var10000;
      c = pulse.Bool.from((var0 | var1) & (~var0 | ~var1));
   }

   public static String a(String var0, String var1, int var2, int var3, int var4, int var5) {
      char[] var6 = var1.toCharArray();
      char[] var7 = new char[var6.length];
      int var10000 = (int)-6699134689196938632L;
      int var18 = -855167222;
      int var17 = var10000;
      var10000 = (var17 | var18) - (var17 & var18);
      var18 = -1360247432;
      var17 = var10000;
      char[] var220 = new char[(var17 | var18) - (var17 & var18)];
      var18 = 2037751373;
      var17 = 964923996;
      int var10002 = (var17 | var18) - (var17 & var18);
      var18 = 1089866769;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      int var10003 = (int)-6827831793689198577L;
      var18 = 1693511413;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -738646328;
      var17 = var10003;
      var220[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var18 = 775548015;
      var17 = 947089338;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 373982164;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 827674444;
      var17 = -1705421718;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1425262429;
      var17 = var10003;
      var220[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var10002 = (int)-7869040242572813599L;
      var18 = -1911535149;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -333327568;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1526598504;
      var17 = -2003161263;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 765196367;
      var17 = var10003;
      var220[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var18 = 493830691;
      var17 = -872102934;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -781483574;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)4720889485052943175L;
      var18 = -869688397;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -1604577049;
      var17 = var10003;
      var220[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var18 = -1492339476;
      var17 = -431050134;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 1094846082;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 292178937;
      var17 = 1017363635;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 768173679;
      var17 = var10003;
      var220[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var10002 = (int)8356647063590811722L;
      var18 = 603827474;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1185311395;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 1769492383;
      var17 = -1585301355;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -923127160;
      var17 = var10003;
      var220[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var18 = -622522082;
      var17 = -2049920189;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1597350491;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)-7399338943659983370L;
      var18 = 2092659467;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 1591068654;
      var17 = var10003;
      var220[var10002] = (char)((var17 | var18) - (var17 & var18));
      var10002 = (int)1138283298059695629L;
      var18 = -1376852643;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1601524567;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)3525060737668416464L;
      var18 = -143122155;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -1893787929;
      var17 = var10003;
      var220[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var10002 = (int)5292199722872111435L;
      var18 = -361795863;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 945418154;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 245218250;
      var17 = -726852882;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -634345097;
      var17 = var10003;
      var220[var10002] = (char)((var17 | var18) - (var17 & var18));
      var18 = 70329772;
      var17 = -1499609411;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1565727976;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)-6689721650131844139L;
      var18 = -904868980;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -1615458435;
      var17 = var10003;
      var220[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      char[] var8 = var220;
      var10000 = (int)5233415586233992364L;
      var18 = 404504240;
      var17 = var10000;
      var10000 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1801746966;
      var17 = var10000;
      char[] var223 = new char[(var17 | var18) & ~(var17 & var18)];
      var10002 = (int)653315308897972197L;
      var18 = -701769135;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 924579252;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var10003 = (int)-3786488915855752495L;
      var18 = -2052125158;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 232359147;
      var17 = var10003;
      var223[var10002] = (char)((var17 | var18) - (var17 & var18));
      var18 = -1437050134;
      var17 = -1575883510;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 139048929;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 534209377;
      var17 = -1441397292;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -1245584714;
      var17 = var10003;
      var223[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var18 = -823499255;
      var17 = 1218104761;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -2039436366;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -794918919;
      var17 = 185227541;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -611016257;
      var17 = var10003;
      var223[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var18 = -900826385;
      var17 = 604460974;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -297194174;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -963191578;
      var17 = 948141164;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -32139128;
      var17 = var10003;
      var223[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var10002 = (int)3125403519825104711L;
      var18 = -1948822652;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1187439417;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)-7396708113683132304L;
      var18 = 8332449;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -120206191;
      var17 = var10003;
      var223[var10002] = (char)((var17 | var18) - (var17 & var18));
      var10002 = (int)-5944074141693108202L;
      var18 = -1499812156;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 257330903;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)-6116080620736722395L;
      var18 = 1896275238;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 508604311;
      var17 = var10003;
      var223[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var10002 = (int)-5968153365451628378L;
      var18 = 1037864224;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1122545024;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1269839062;
      var17 = -1410875817;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -531165768;
      var17 = var10003;
      var223[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var10002 = (int)5622488177923815930L;
      var18 = -303020571;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -1962197992;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 412778166;
      var17 = 1697281199;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 2108693025;
      var17 = var10003;
      var223[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var10002 = (int)-9012925515602553095L;
      var18 = -1602522820;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 1594877901;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)8693708705394348537L;
      var18 = -1257625249;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 684391330;
      var17 = var10003;
      var223[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var18 = -109059213;
      var17 = -2119309836;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 2027030158;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 855749609;
      var17 = 680500394;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 462298224;
      var17 = var10003;
      var223[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      char[] var9 = var223;
      var10000 = (int)2322008402303198778L;
      var18 = 122348341;
      var17 = var10000;
      var10000 = var17 & ~var18 | ~var17 & var18;
      var18 = -410270449;
      var17 = var10000;

      for (int var10 = (var17 | var18) & ~(var17 & var18); var10 < var6.length; var10++) {
         char var279 = var6[var10];
         char var205 = var8[var10 % var8.length];
         char var106 = var279;
         var7[var10] = (char)(var106 & ~var205 | ~var106 & var205);
      }

      char[] var19 = new char[var7.length];
      var18 = -1272024319;
      var17 = 384908131;
      var10000 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1562425246;
      var17 = var10000;

      for (int var11 = (var17 | var18) - (var17 & var18); var11 < var6.length; var11++) {
         char var280 = var7[var11];
         char var208 = var9[var11 % var9.length];
         char var109 = var280;
         var19[var11] = (char)(var109 & ~var208 | ~var109 & var208);
      }

      String var20 = new String(var19);
      int var12 = var20.hashCode();
      var18 = var5;
      var17 = var3;
      var10000 = 2 * (var17 & ~var18) - (var17 ^ var18);
      var18 = var2;
      var17 = var10000;
      int var13 = (var17 & ~var18) - (~var17 & var18);
      char[] var14 = var0.toCharArray();
      char[] var15 = new char[var14.length];
      var10000 = (int)-5718464579118649933L;
      var18 = 1607944455;
      var17 = var10000;
      var10000 = var17 + var18 - 2 * (var17 & var18);
      var18 = 187557044;
      var17 = var10000;

      for (int var16 = (var17 | var18) & ~(var17 & var18); var16 < var15.length; var16++) {
         var18 = -501210995;
         var17 = 1314947365;
         int var10001 = (var17 | var18) - (var17 & var18);
         var18 = -1405050454;
         var17 = var10001;
         switch (var16 % ((var17 | var18) - (var17 & var18))) {
            case 0:
               var18 = var12;
               var17 = var13;
               var10002 = (var17 | var18) - (var17 & var18);
               char var218 = var14[var16];
               var17 = var10002;
               var15[var16] = (char)((var17 | var218) & ~(var17 & var218));
               break;
            case 1:
               var18 = var13;
               var17 = var5;
               var10002 = (var17 | var18) & ~(var17 & var18);
               char var216 = var14[var16];
               var17 = var10002;
               var15[var16] = (char)((var17 | var216) & (~var17 | ~var216));
         }
      }

      return new String(var15);
   }
}
