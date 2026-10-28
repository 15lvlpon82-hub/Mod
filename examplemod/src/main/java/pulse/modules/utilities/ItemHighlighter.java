package pulse;



import pulse.module.ClientModule;
import pulse.module.ModuleInfo;
import pulse.module.ModuleCategory;
import pulse.settings.BooleanSetting;
import pulse.settings.ColorSetting;
import pulse.settings.ItemToggleSetting;
import pulse.settings.SliderSetting;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Generated;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.PotionContentsComponent;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

@ModuleInfo(a = "Item Highliter", b = "Подсвечивает указанные предметы в инвентаре", c = ModuleCategory.UTILITIES)
public class ItemHighlighter extends ClientModule {
   private final BooleanSetting e;
   private final SliderSetting f;
   private final ItemToggleSetting g;
   private final ItemToggleSetting h;
   private final ItemToggleSetting i;
   private final ItemToggleSetting j;
   private final ItemToggleSetting k;
   private final ItemToggleSetting l;
   private final ItemToggleSetting m;
   private final ItemToggleSetting n;
   private final ItemToggleSetting o;
   private final ItemToggleSetting p;
   private final ItemToggleSetting q;
   private final ItemToggleSetting r;
   private final ItemToggleSetting s;
   private final ItemToggleSetting t;
   private final ItemToggleSetting u;
   private final ItemToggleSetting v;
   private final BooleanSetting w;
   private final ColorSetting x;
   private final BooleanSetting y;
   private final ColorSetting z;
   private final Map<Item, ItemToggleSetting> A;
   public static int a;
   public static boolean b;

   public ItemHighlighter() {
      int var3 = -2051417821;
      int var2 = -231480886;
      int var10004 = var2 + var3 - 2 * (var2 & var3);
      var3 = 2005547236;
      var2 = var10004;
      var10004 = (var2 | var3) & ~(var2 & var3);
      var10004 = (int)435828891116113099L;
      var3 = 380565678;
      var2 = var10004;
      var10004 = (var2 | var3) & (~var2 | ~var3);
      var3 = 729478253;
      var2 = var10004;
      var10004 = (var2 | var3) - (var2 & var3);
      var3 = 365602407;
      var2 = 698637229;
      var10004 = (var2 | var3) & (~var2 | ~var3);
      var3 = 1013906880;
      var2 = var10004;
      var10004 = var2 + var3 - 2 * (var2 & var3);
      int var10005 = (int)-8867339272937825452L;
      var3 = -732516897;
      var2 = var10005;
      var10005 = var2 + var3 - 2 * (var2 & var3);
      var3 = 1107113612;
      var2 = var10005;
      var10005 = (var2 | var3) & ~(var2 & var3);
      var3 = -289207281;
      var2 = 1290651309;
      var10005 = (var2 | var3) & ~(var2 & var3);
      var3 = -1573991768;
      var2 = var10005;
      var10005 = (var2 | var3) & ~(var2 & var3);
      var3 = -878753041;
      var2 = -774532687;
      var10005 = var2 & ~var3 | ~var2 & var3;
      var3 = 441113428;
      var2 = var10005;
      var10005 = (var2 | var3) - (var2 & var3);
      var3 = 2022048238;
      var2 = 368732532;
      int var10006 = (var2 | var3) & (~var2 | ~var3);
      var3 = 1836869789;
      var2 = var10006;
      var10006 = (var2 | var3) - (var2 & var3);
      var3 = 1320266683;
      var2 = -22564579;
      var10006 = var2 + var3 - 2 * (var2 & var3);
      var3 = -1340728668;
      var2 = var10006;
      var10006 = var2 & ~var3 | ~var2 & var3;
      var10005 = (int)38616542903036939L;
      var3 = 145172962;
      var2 = var10005;
      var10005 = (var2 | var3) & (~var2 | ~var3);
      var3 = 1639210465;
      var2 = var10005;
      var10005 = (var2 | var3) - (var2 & var3);
      int var10007 = (int)3033232263015081095L;
      var3 = 60019319;
      var2 = var10007;
      var10007 = var2 & ~var3 | ~var2 & var3;
      var3 = 634877688;
      var2 = var10007;
      var10007 = (var2 | var3) & (~var2 | ~var3);
      var3 = 951898569;
      var2 = 497499059;
      var10007 = var2 + var3 - 2 * (var2 & var3);
      var3 = 622586472;
      var2 = var10007;
      var10007 = var2 & ~var3 | ~var2 & var3;
      var3 = -192502940;
      var2 = -754387751;
      var10006 = (var2 | var3) & ~(var2 & var3);
      var3 = 1745163858;
      var2 = var10006;
      var10006 = (var2 | var3) - (var2 & var3);
      var3 = 489336791;
      var2 = -823611826;
      int var10008 = (var2 | var3) & ~(var2 & var3);
      var3 = -742260344;
      var2 = var10008;
      var10008 = var2 + var3 - 2 * (var2 & var3);
      var10007 = (int)368020617076524859L;
      var3 = -1730774487;
      var2 = var10007;
      var10007 = (var2 | var3) & ~(var2 & var3);
      var3 = -1192276556;
      var2 = var10007;
      var10007 = var2 & ~var3 | ~var2 & var3;
      var10008 = (int)2885200327128009789L;
      var3 = 720677288;
      var2 = var10008;
      var10008 = (var2 | var3) & (~var2 | ~var3);
      var3 = -1695638659;
      var2 = var10008;
      var10008 = (var2 | var3) - (var2 & var3);
      var3 = -1418582619;
      var2 = -970541688;
      int var10009 = (var2 | var3) & ~(var2 & var3);
      var3 = 1637018460;
      var2 = var10009;
      var3 = (var2 | var3) & ~(var2 & var3);
      var2 = var10008;
      var10008 = (var2 | var3) + (var2 & var3);
      var3 = -1925183714;
      var2 = 950752771;
      var10008 = (var2 | var3) & ~(var2 & var3);
      var3 = -1243515288;
      var2 = var10008;
      String var10003 = c(
         "ṥ⅄ṁ⅋ḻℷḼℿḵ", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7cf꒡ꁴ꤈絞蹃⑽謿㑻{ꟲ꒰ꁣꤨ絹蹎⑯謻㑲", var10005, var10006, var10007, (var2 | var3) - (var2 & var3)
      );
      var10004 = (int)341008274857736637L;
      var3 = -1511714864;
      var2 = var10004;
      var10004 = (var2 | var3) - (var2 & var3);
      var3 = -2051525011;
      var2 = var10004;
      this.e = new BooleanSetting(var10003, pulse.Bool.from(var2 + var3 - 2 * (var2 & var3)));
      int var1096 = (int)-3138587241405182668L;
      var3 = 1460852054;
      var2 = var1096;
      int var1097 = (var2 | var3) - (var2 & var3);
      var3 = 869650968;
      var2 = var1097;
      int var1098 = (var2 | var3) - (var2 & var3);
      var10004 = (int)-3806246016238800237L;
      var3 = -1663581963;
      var2 = var10004;
      var10004 = var2 + var3 - 2 * (var2 & var3);
      var3 = -55918387;
      var2 = var10004;
      var10004 = (var2 + var3 - 2 * (var2 & var3)) * (var2 + var3 - 2 * (var2 & var3));
      var10005 = (int)-1554924885625781670L;
      var3 = 341955273;
      var2 = var10005;
      var10005 = (var2 | var3) & (~var2 | ~var3);
      var3 = 207714085;
      var2 = var10005;
      var10005 = (var2 + var3 - 2 * (var2 & var3)) * (var2 + var3 - 2 * (var2 & var3));
      var3 = 1377823931;
      var2 = 680553962;
      var10005 = var2 + var3 - 2 * (var2 & var3);
      var3 = -1716741799;
      var2 = var10005;
      var10005 = var2 & ~var3 | ~var2 & var3;
      String var1354 = "cxq";
      var10006 = (int)-1430351912778222478L;
      var3 = 172602930;
      var2 = var10006;
      var10006 = (var2 | var3) & (~var2 | ~var3);
      var3 = 987669323;
      var2 = var10006;
      var10006 = var2 + var3 - 2 * (var2 & var3);
      var3 = 179935539;
      var2 = 757849791;
      var10007 = var2 + var3 - 2 * (var2 & var3);
      var3 = -895356723;
      var2 = var10007;
      var10007 = (var2 | var3) & (~var2 | ~var3);
      var3 = 196315814;
      var2 = -499112210;
      var10008 = var2 + var3 - 2 * (var2 & var3);
      var3 = 1807470576;
      var2 = var10008;
      var3 = (var2 | var3) & (~var2 | ~var3);
      var2 = var10007;
      var10007 = (var2 | var3) + (var2 & var3);
      var3 = 599522814;
      var2 = -1387662839;
      var10007 = var2 & ~var3 | ~var2 & var3;
      var3 = -2114499245;
      var2 = var10007;
      var10007 = var2 + var3 - 2 * (var2 & var3);
      var3 = 772935020;
      var2 = 1901241923;
      var10009 = var2 + var3 - 2 * (var2 & var3);
      var3 = 1598073642;
      var2 = var10009;
      var10009 = (var2 | var3) - (var2 & var3);
      var3 = -1087910244;
      var2 = 2082630968;
      var10009 = (var2 | var3) & (~var2 | ~var3);
      var3 = -1023040603;
      var2 = var10009;
      var10009 = var2 & ~var3 | ~var2 & var3;
      var10009 = (int)-6475125919130269793L;
      var3 = -67345011;
      var2 = var10009;
      var10009 = var2 & ~var3 | ~var2 & var3;
      var3 = 2041356816;
      var2 = var10009;
      var10009 = (var2 | var3) & (~var2 | ~var3);
      var10008 = (int)-7033332588803930513L;
      var3 = -1840843419;
      var2 = var10008;
      var10008 = (var2 | var3) & ~(var2 & var3);
      var3 = -1015630437;
      var2 = var10008;
      var10003 = c("Ṫ胘Ḷ肧Ṋ", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7cf꒡ꁴ꤈絞蹃⑽謿㑻{ꟲ꒰ꁣꤨ絹蹎⑯謻㑲", var10005, var10006, var10007, var2 & ~var3 | ~var2 & var3);
      var10005 = (int)-1823205615938154943L;
      var3 = 1815631680;
      var2 = var10005;
      var10005 = (var2 | var3) & ~(var2 & var3);
      var3 = -2118510332;
      var2 = var10005;
      var10005 = (var2 | var3) & (~var2 | ~var3);
      var10005 = (int)-5255626278251324552L;
      var3 = -1741869076;
      var2 = var10005;
      var10005 = (var2 | var3) & ~(var2 & var3);
      var3 = 1286747293;
      var2 = var10005;
      var10005 = (var2 | var3) & (~var2 | ~var3);
      String var1358 = "cxr";
      this.f = new SliderSetting(var10003, 170.0F, 0.0F, 255.0F, 1.0F);
      int var1100 = (int)3426007119147238400L;
      var3 = -1803282048;
      var2 = var1100;
      int var1101 = var2 + var3 - 2 * (var2 & var3);
      var3 = -435202510;
      var2 = var1101;
      int var1102 = ((var2 | var3) & (~var2 | ~var3)) * ((var2 | var3) & (~var2 | ~var3));
      String var1156 = "cxs";
      var10006 = (int)6897004126890711376L;
      var3 = 903852676;
      var2 = var10006;
      var10006 = var2 + var3 - 2 * (var2 & var3);
      var3 = 275180484;
      var2 = var10006;
      var10006 = (var2 | var3) - (var2 & var3);
      var10006 = (int)-7018016904712565668L;
      var3 = -581214681;
      var2 = var10006;
      var10006 = (var2 | var3) - (var2 & var3);
      var3 = 1001427581;
      var2 = var10006;
      var10006 = var2 + var3 - 2 * (var2 & var3);
      var10006 = (int)3724218517871508685L;
      var3 = 1189567440;
      var2 = var10006;
      var10006 = (var2 | var3) & (~var2 | ~var3);
      var3 = -649140454;
      var2 = var10006;
      var10006 = var2 & ~var3 | ~var2 & var3;
      var3 = -510816565;
      var2 = 2106108705;
      var10005 = (var2 | var3) & ~(var2 & var3);
      var3 = 2133212642;
      var2 = var10005;
      var10005 = (var2 | var3) - (var2 & var3);
      var10006 = (int)5956295751078030986L;
      var3 = 113781976;
      var2 = var10006;
      var10006 = (var2 | var3) & ~(var2 & var3);
      var3 = 145340828;
      var2 = var10006;
      var10006 = (var2 | var3) - (var2 & var3);
      var3 = 984252095;
      var2 = 168799974;
      var10007 = var2 & ~var3 | ~var2 & var3;
      var3 = 644963109;
      var2 = var10007;
      var3 = (var2 | var3) & ~(var2 & var3);
      var2 = var10006;
      var10006 = 2 * (var2 | var3) - (var2 ^ var3);
      var10006 = (int)8222365181656876562L;
      var3 = 765943551;
      var2 = var10006;
      var10006 = (var2 | var3) & ~(var2 & var3);
      var3 = -128564438;
      var2 = var10006;
      var10006 = var2 & ~var3 | ~var2 & var3;
      var10007 = (int)-4323580076759256202L;
      var3 = 209897335;
      var2 = var10007;
      var10007 = (var2 | var3) & ~(var2 & var3);
      var3 = -413583650;
      var2 = var10007;
      var10007 = (var2 + var3 - 2 * (var2 & var3)) * (var2 + var3 - 2 * (var2 & var3));
      var3 = 542624446;
      var2 = 1592445616;
      var10007 = var2 & ~var3 | ~var2 & var3;
      var3 = 1844749746;
      var2 = var10007;
      var10007 = (var2 | var3) - (var2 & var3);
      var3 = 2124046761;
      var2 = 1329501299;
      var10008 = var2 & ~var3 | ~var2 & var3;
      var3 = 1582135434;
      var2 = var10008;
      var10008 = (var2 | var3) & (~var2 | ~var3);
      var10008 = (int)1705654995380216172L;
      var3 = 473022538;
      var2 = var10008;
      var10008 = var2 + var3 - 2 * (var2 & var3);
      var3 = 1903239275;
      var2 = var10008;
      var10003 = c(
         "Ṯ윊ṍ윁Ḻ윇ṏ윂Ḹ윏Ḽ윇ḵ", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7cf꒡ꁴ꤈絞蹃⑽謿㑻{ꟲ꒰ꁣꤨ絹蹎⑯謻㑲", var10005, var10006, var10007, (var2 | var3) & (~var2 | ~var3)
      );
      var10005 = (int)7678720269900276420L;
      var3 = 1781179280;
      var2 = var10005;
      var10005 = var2 + var3 - 2 * (var2 & var3);
      var3 = -1965702828;
      var2 = var10005;
      var10005 = (var2 | var3) - (var2 & var3);
      var3 = 174609174;
      var2 = -902592183;
      var10008 = (var2 | var3) - (var2 & var3);
      var3 = -1067722181;
      var2 = var10008;
      var10008 = (var2 | var3) & ~(var2 & var3);
      var3 = -602776814;
      var2 = -1641386589;
      var10009 = (var2 | var3) - (var2 & var3);
      var3 = 1110980174;
      var2 = var10009;
      var10009 = (var2 | var3) - (var2 & var3);
      var3 = 742352642;
      var2 = -2140448783;
      int var10010 = (var2 | var3) - (var2 & var3);
      var3 = -1403768681;
      var2 = var10010;
      this.g = new ItemToggleSetting(var10003, Items.ENDER_EYE, pulse.Bool.from(var10005), new Color(var10008, var10009, var2 & ~var3 | ~var2 & var3));
      int var1104 = (int)8668790607462517163L;
      var3 = -978176389;
      var2 = var1104;
      int var1105 = var2 & ~var3 | ~var2 & var3;
      var3 = -144410694;
      var2 = var1105;
      int var1106 = (var2 | var3) & ~(var2 & var3);
      var10005 = (int)-5828411738347625120L;
      var3 = -485418519;
      var2 = var10005;
      var10005 = (var2 | var3) & ~(var2 & var3);
      var3 = -1744585600;
      var2 = var10005;
      var10005 = var2 & ~var3 | ~var2 & var3;
      var10005 = (int)-2437680299083461817L;
      var3 = -234288401;
      var2 = var10005;
      var10005 = (var2 | var3) & ~(var2 & var3);
      var3 = 52461984;
      var2 = var10005;
      var10005 = var2 & ~var3 | ~var2 & var3;
      String var1234 = "cxt";
      var10005 = (int)1397874941276649046L;
      var3 = 904997866;
      var2 = var10005;
      var10005 = (var2 | var3) - (var2 & var3);
      var3 = -2048604748;
      var2 = var10005;
      var10005 = var2 + var3 - 2 * (var2 & var3);
      var10006 = (int)5910803436413790267L;
      var3 = -1088789333;
      var2 = var10006;
      var10006 = (var2 | var3) & ~(var2 & var3);
      var3 = -1061431473;
      var2 = var10006;
      var10006 = var2 & ~var3 | ~var2 & var3;
      var3 = 300138917;
      var2 = 2061380166;
      var10007 = var2 & ~var3 | ~var2 & var3;
      var3 = -1452237502;
      var2 = var10007;
      var3 = var2 + var3 - 2 * (var2 & var3);
      var2 = var10006;
      var10006 = (var2 ^ var3) + 2 * (var2 & var3);
      var3 = -1429267228;
      var2 = -1491644694;
      var10006 = var2 + var3 - 2 * (var2 & var3);
      var3 = 1115053983;
      var2 = var10006;
      var10006 = var2 & ~var3 | ~var2 & var3;
      var3 = 66967808;
      var2 = 63492444;
      var10007 = (var2 | var3) - (var2 & var3);
      var3 = 475517190;
      var2 = var10007;
      var10007 = var2 + var3 - 2 * (var2 & var3);
      var10007 = (int)-2659278010845113388L;
      var3 = -350537507;
      var2 = var10007;
      var10007 = (var2 | var3) - (var2 & var3);
      var3 = -272290696;
      var2 = var10007;
      var10007 = var2 + var3 - 2 * (var2 & var3);
      var3 = -1811079711;
      var2 = 1407776199;
      var10009 = (var2 | var3) & (~var2 | ~var3);
      var3 = -941234123;
      var2 = var10009;
      var10009 = (var2 | var3) & ~(var2 & var3);
      var3 = 849828655;
      var2 = -607658745;
      var10009 = (var2 | var3) & (~var2 | ~var3);
      var3 = -379550173;
      var2 = var10009;
      var10009 = (var2 | var3) - (var2 & var3);
      var10009 = (int)-432895694588149290L;
      var3 = 885212770;
      var2 = var10009;
      var10009 = (var2 | var3) & ~(var2 & var3);
      var3 = -8108111;
      var2 = var10009;
      var10009 = (var2 | var3) - (var2 & var3);
      var10009 = (int)6551110693688964962L;
      var3 = -511758991;
      var2 = var10009;
      var10009 = (var2 | var3) & ~(var2 & var3);
      var3 = -1796679141;
      var2 = var10009;
      var10009 = var2 & ~var3 | ~var2 & var3;
      var3 = -1953103688;
      var2 = 1125998225;
      var10009 = (var2 | var3) & (~var2 | ~var3);
      var3 = -930390496;
      var2 = var10009;
      var10009 = (var2 | var3) & ~(var2 & var3);
      var3 = -1429975495;
      var2 = 955616478;
      var10008 = var2 & ~var3 | ~var2 & var3;
      var3 = -1843580432;
      var2 = var10008;
      var10003 = c(
         "Ṥ\uf556ṇ\uf550ṇ\uf558ḱ\uf55cᩚ\uf524Ṇ\uf550Ḻ\uf522",
         "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7cf꒡ꁴ꤈絞蹃⑽謿㑻{ꟲ꒰ꁣꤨ絹蹎⑯謻㑲",
         var10005,
         var10006,
         var10007,
         (var2 | var3) & ~(var2 & var3)
      );
      var10005 = (int)-7618617730128035504L;
      var3 = -150424552;
      var2 = var10005;
      var10005 = (var2 | var3) - (var2 & var3);
      var3 = -751733432;
      var2 = var10005;
      var10005 = (var2 | var3) & (~var2 | ~var3);
      var3 = 1987266836;
      var2 = 1024198650;
      var10008 = var2 + var3 - 2 * (var2 & var3);
      var3 = 1266634257;
      var2 = var10008;
      var10008 = var2 + var3 - 2 * (var2 & var3);
      var10009 = (int)4153738595377639304L;
      var3 = 1787912440;
      var2 = var10009;
      var10009 = var2 & ~var3 | ~var2 & var3;
      var3 = -775876844;
      var2 = var10009;
      var10009 = (var2 | var3) & ~(var2 & var3);
      var10010 = (int)5881619579926316226L;
      var3 = -852294941;
      var2 = var10010;
      var10010 = var2 + var3 - 2 * (var2 & var3);
      var3 = 1213105697;
      var2 = var10010;
      this.h = new ItemToggleSetting(var10003, Items.FIRE_CHARGE, pulse.Bool.from(var10005), new Color(var10008, var10009, (var2 | var3) & ~(var2 & var3)));
      var10003 = "cxu";
      var3 = -138679147;
      var2 = 356238896;
      var10005 = (var2 | var3) & ~(var2 & var3);
      var3 = -494916959;
      var2 = var10005;
      var10005 = var2 + var3 - 2 * (var2 & var3);
      String var1243 = "cxv";
      var10005 = (int)-5024076055218190817L;
      var3 = 34353128;
      var2 = var10005;
      var10005 = (var2 | var3) - (var2 & var3);
      var3 = -1392266753;
      var2 = var10005;
      var10005 = (var2 | var3) & ~(var2 & var3);
      var10007 = (int)-7172122634877708434L;
      var3 = -1301947484;
      var2 = var10007;
      var10007 = (var2 | var3) & ~(var2 & var3);
      var3 = 1022790872;
      var2 = var10007;
      var10007 = (var2 | var3) & ~(var2 & var3);
      var10007 = (int)8663917643104681331L;
      var3 = 1475191422;
      var2 = var10007;
      var10007 = (var2 | var3) - (var2 & var3);
      var3 = 1066655519;
      var2 = var10007;
      var10007 = (var2 | var3) & (~var2 | ~var3);
      var3 = 1806611160;
      var2 = -1587955189;
      var10006 = var2 & ~var3 | ~var2 & var3;
      var3 = -2058542855;
      var2 = var10006;
      var10006 = (var2 | var3) - (var2 & var3);
      var3 = -91435189;
      var2 = -1010177209;
      var10008 = (var2 | var3) & (~var2 | ~var3);
      var3 = 960832526;
      var2 = var10008;
      var10008 = (var2 | var3) - (var2 & var3);
      var10008 = (int)5097223026076953118L;
      var3 = 1376263136;
      var2 = var10008;
      var10008 = (var2 | var3) & (~var2 | ~var3);
      var3 = 1347039731;
      var2 = var10008;
      var10008 = (var2 | var3) & ~(var2 & var3);
      var10008 = (int)-7854343756832079988L;
      var3 = 304023140;
      var2 = var10008;
      var10008 = (var2 | var3) & ~(var2 & var3);
      var3 = -1943504409;
      var2 = var10008;
      var10008 = var2 & ~var3 | ~var2 & var3;
      var10007 = (int)5281366061234540466L;
      var3 = 608579173;
      var2 = var10007;
      var10007 = (var2 | var3) & ~(var2 & var3);
      var3 = 1287412637;
      var2 = var10007;
      var10007 = var2 + var3 - 2 * (var2 & var3);
      var10008 = (int)8616649828759230045L;
      var3 = -2035511049;
      var2 = var10008;
      var10008 = var2 & ~var3 | ~var2 & var3;
      var3 = -1534472053;
      var2 = var10008;
      var10008 = (var2 | var3) & ~(var2 & var3);
      var3 = 222362860;
      var2 = -146914788;
      var10009 = var2 & ~var3 | ~var2 & var3;
      var3 = 1737381519;
      var2 = var10009;
      var3 = (var2 | var3) - (var2 & var3);
      var2 = var10008;
      var10008 = var2 - ~var3 - 1;
      var3 = 803175151;
      var2 = -1842933822;
      var10008 = var2 + var3 - 2 * (var2 & var3);
      var3 = -1111394147;
      var2 = var10008;
      var10003 = c(
         "ṕ௰ṇ௲ḵ\u0fe2ṅஉṁஎ", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7cf꒡ꁴ꤈絞蹃⑽謿㑻{ꟲ꒰ꁣꤨ絹蹎⑯謻㑲", var10005, var10006, var10007, var2 + var3 - 2 * (var2 & var3)
      );
      var3 = -410390956;
      var2 = -1021896975;
      var10005 = (var2 | var3) - (var2 & var3);
      var3 = 614398117;
      var2 = var10005;
      var10005 = var2 + var3 - 2 * (var2 & var3);
      var10008 = (int)5191609834673920418L;
      var3 = -497623204;
      var2 = var10008;
      var10008 = (var2 | var3) & ~(var2 & var3);
      var3 = -1971386879;
      var2 = var10008;
      var10008 = var2 + var3 - 2 * (var2 & var3);
      var10009 = (int)559724676149074082L;
      var3 = 1782486674;
      var2 = var10009;
      var10009 = (var2 | var3) & (~var2 | ~var3);
      var3 = -136556849;
      var2 = var10009;
      var10009 = var2 + var3 - 2 * (var2 & var3);
      var3 = -361559558;
      var2 = -143880555;
      var10010 = var2 + var3 - 2 * (var2 & var3);
      var3 = 488605584;
      var2 = var10010;
      this.i = new ItemToggleSetting(var10003, Items.SUGAR, pulse.Bool.from(var10005), new Color(var10008, var10009, var2 & ~var3 | ~var2 & var3));
      var3 = -770517495;
      var2 = 1189315826;
      int var1110 = var2 & ~var3 | ~var2 & var3;
      var3 = 1627071685;
      var2 = var1110;
      int var1111 = (var2 & ~var3 | ~var2 & var3) * (var2 & ~var3 | ~var2 & var3);
      var10004 = (int)-8976987455384540955L;
      var3 = 516701365;
      var2 = var10004;
      var10004 = (var2 | var3) & (~var2 | ~var3);
      var3 = 279796741;
      var2 = var10004;
      var10004 = (var2 | var3) & (~var2 | ~var3);
      var3 = 1351597783;
      var2 = 1646306370;
      var10005 = var2 & ~var3 | ~var2 & var3;
      var3 = -1279422295;
      var2 = var10005;
      var10005 = var2 & ~var3 | ~var2 & var3;
      var3 = 156076067;
      var2 = -1396273423;
      var10005 = (var2 | var3) & ~(var2 & var3);
      var3 = 1185423066;
      var2 = var10005;
      var10005 = (var2 | var3) & (~var2 | ~var3);
      var10006 = (int)1389754012067757884L;
      var3 = -1412615597;
      var2 = var10006;
      var10006 = (var2 | var3) & (~var2 | ~var3);
      var3 = -543988137;
      var2 = var10006;
      var10006 = ((var2 | var3) & ~(var2 & var3)) * ((var2 | var3) & ~(var2 & var3));
      var10006 = (int)715994708851347035L;
      var3 = 1590856306;
      var2 = var10006;
      var10006 = (var2 | var3) - (var2 & var3);
      var3 = -80048487;
      var2 = var10006;
      var10006 = var2 & ~var3 | ~var2 & var3;
      var10007 = (int)3530824845242836571L;
      var3 = 653829159;
      var2 = var10007;
      var10007 = (var2 | var3) & ~(var2 & var3);
      var3 = -686126731;
      var2 = var10007;
      var10007 = (var2 | var3) & (~var2 | ~var3);
      var10007 = (int)9162473144177529866L;
      var3 = -1373779156;
      var2 = var10007;
      var10007 = var2 + var3 - 2 * (var2 & var3);
      var3 = 607025112;
      var2 = var10007;
      var10007 = var2 + var3 - 2 * (var2 & var3);
      var10008 = (int)-5791165175216333070L;
      var3 = -1336267358;
      var2 = var10008;
      var10008 = (var2 | var3) & (~var2 | ~var3);
      var3 = 1949962133;
      var2 = var10008;
      var10008 = (var2 | var3) & ~(var2 & var3);
      var3 = 1788564950;
      var2 = -1820959555;
      var10008 = var2 + var3 - 2 * (var2 & var3);
      var3 = -106514083;
      var2 = var10008;
      var10003 = c(
         "Ṙ뙺Ḹ뙱Ṇ뉤ṋ뙱ḻ똅Ṇ뙱Ḻ똆Ṃ똋", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7cf꒡ꁴ꤈絞蹃⑽謿㑻{ꟲ꒰ꁣꤨ絹蹎⑯謻㑲", var10005, var10006, var10007, var2 + var3 - 2 * (var2 & var3)
      );
      var10005 = (int)-612886681763407770L;
      var3 = 1692701002;
      var2 = var10005;
      var10005 = (var2 | var3) - (var2 & var3);
      var3 = 17303852;
      var2 = var10005;
      var10005 = (var2 | var3) & (~var2 | ~var3);
      var10008 = (int)7607650523096331210L;
      var3 = 196726887;
      var2 = var10008;
      var10008 = (var2 | var3) & ~(var2 & var3);
      var3 = -138321070;
      var2 = var10008;
      var10008 = (var2 | var3) - (var2 & var3);
      var10009 = (int)-3232878034480060975L;
      var3 = 362475069;
      var2 = var10009;
      var10009 = (var2 | var3) & ~(var2 & var3);
      var3 = 1966983995;
      var2 = var10009;
      var10009 = var2 + var3 - 2 * (var2 & var3);
      var3 = -1321174987;
      var2 = 1854220026;
      var10010 = var2 & ~var3 | ~var2 & var3;
      var3 = -540713265;
      var2 = var10010;
      this.j = new ItemToggleSetting(var10003, Items.TOTEM_OF_UNDYING, pulse.Bool.from(var10005), new Color(var10008, var10009, (var2 | var3) - (var2 & var3)));
      var3 = -799079425;
      var2 = 1606470926;
      var10004 = (var2 | var3) - (var2 & var3);
      var3 = -1885352201;
      var2 = var10004;
      var10004 = var2 + var3 - 2 * (var2 & var3);
      var3 = 1251480908;
      var2 = -568058803;
      var10004 = (var2 | var3) & (~var2 | ~var3);
      var3 = -1799616244;
      var2 = var10004;
      var10004 = (var2 | var3) - (var2 & var3);
      var3 = 1219073842;
      var2 = 1178766188;
      var10004 = (var2 | var3) - (var2 & var3);
      var3 = 250289233;
      var2 = var10004;
      var10004 = (var2 | var3) - (var2 & var3);
      var10004 = (int)-2500832115146329866L;
      var3 = -1701558135;
      var2 = var10004;
      var10004 = var2 & ~var3 | ~var2 & var3;
      var3 = -79919662;
      var2 = var10004;
      var10004 = (var2 & ~var3 | ~var2 & var3) * (var2 & ~var3 | ~var2 & var3);
      var10005 = (int)6804103097125027300L;
      var3 = -2083416935;
      var2 = var10005;
      var10005 = (var2 | var3) - (var2 & var3);
      var3 = 1936440805;
      var2 = var10005;
      var10005 = ((var2 | var3) - (var2 & var3)) * ((var2 | var3) - (var2 & var3));
      var10005 = (int)4717455621833553121L;
      var3 = -1479222050;
      var2 = var10005;
      var10005 = var2 & ~var3 | ~var2 & var3;
      var3 = -1812385737;
      var2 = var10005;
      var10005 = var2 + var3 - 2 * (var2 & var3);
      var3 = 356030303;
      var2 = 93234621;
      var10007 = (var2 | var3) & (~var2 | ~var3);
      var3 = 280376035;
      var2 = var10007;
      var10007 = (var2 | var3) - (var2 & var3);
      var3 = 502628672;
      var2 = -1242267215;
      var10007 = var2 + var3 - 2 * (var2 & var3);
      var3 = -1476329219;
      var2 = var10007;
      var10007 = (var2 | var3) - (var2 & var3);
      var10006 = (int)-7336125597206185670L;
      var3 = 749692321;
      var2 = var10006;
      var10006 = (var2 | var3) - (var2 & var3);
      var3 = 636648281;
      var2 = var10006;
      var10006 = (var2 | var3) & (~var2 | ~var3);
      var10007 = (int)8876413426100847284L;
      var3 = -1759103189;
      var2 = var10007;
      var10007 = (var2 | var3) & ~(var2 & var3);
      var3 = -1519253887;
      var2 = var10007;
      var10007 = ((var2 | var3) & ~(var2 & var3)) * ((var2 | var3) & ~(var2 & var3));
      var10007 = (int)3449217178767986351L;
      var3 = -107701023;
      var2 = var10007;
      var10007 = (var2 | var3) - (var2 & var3);
      var3 = 847575596;
      var2 = var10007;
      var10007 = var2 & ~var3 | ~var2 & var3;
      var10008 = (int)334254092242188217L;
      var3 = 323759179;
      var2 = var10008;
      var10008 = var2 & ~var3 | ~var2 & var3;
      var3 = -1408671621;
      var2 = var10008;
      var10008 = var2 + var3 - 2 * (var2 & var3);
      var3 = 1065988125;
      var2 = -1838740120;
      var10009 = var2 & ~var3 | ~var2 & var3;
      var3 = -972161120;
      var2 = var10009;
      var3 = (var2 | var3) - (var2 & var3);
      var2 = var10008;
      var10008 = 2 * (var2 | var3) - (var2 ^ var3);
      var3 = -575704365;
      var2 = 689835941;
      var10008 = var2 & ~var3 | ~var2 & var3;
      var3 = -189747138;
      var2 = var10008;
      var10003 = c("ṫ쭹Ḹ쭱ṁ쬀Ṋ켚Ṅ쬅ḱ쭸Ṋ", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7cf꒡ꁴ꤈絞蹃⑽謿㑻{ꟲ꒰ꁣꤨ絹蹎⑯謻㑲", var10005, var10006, var10007, var2 & ~var3 | ~var2 & var3);
      var10005 = (int)8189186304048210790L;
      var3 = 1079517373;
      var2 = var10005;
      var10005 = var2 + var3 - 2 * (var2 & var3);
      var3 = 1813087195;
      var2 = var10005;
      var10005 = var2 & ~var3 | ~var2 & var3;
      var10008 = (int)-4052808309327016220L;
      var3 = 1704439355;
      var2 = var10008;
      var10008 = var2 & ~var3 | ~var2 & var3;
      var3 = -564633413;
      var2 = var10008;
      var10008 = var2 & ~var3 | ~var2 & var3;
      var3 = -656133489;
      var2 = -47469598;
      var10009 = var2 + var3 - 2 * (var2 & var3);
      var3 = 634362258;
      var2 = var10009;
      var10009 = (var2 | var3) & (~var2 | ~var3);
      var10010 = (int)-3819533591155240858L;
      var3 = -1212926934;
      var2 = var10010;
      var10010 = (var2 | var3) & (~var2 | ~var3);
      var3 = 875635844;
      var2 = var10010;
      this.k = new ItemToggleSetting(var10003, Items.EXPERIENCE_BOTTLE, pulse.Bool.from(var10005), new Color(var10008, var10009, (var2 | var3) - (var2 & var3)));
      var10004 = (int)5218049028662918624L;
      var3 = 375756824;
      var2 = var10004;
      var10004 = (var2 | var3) - (var2 & var3);
      var3 = -530323980;
      var2 = var10004;
      var10004 = (var2 | var3) & ~(var2 & var3);
      var10004 = (int)299637000073342394L;
      var3 = 357828413;
      var2 = var10004;
      var10004 = var2 + var3 - 2 * (var2 & var3);
      var3 = -2084869495;
      var2 = var10004;
      var10004 = var2 & ~var3 | ~var2 & var3;
      var10004 = (int)6019766003644977242L;
      var3 = -65416334;
      var2 = var10004;
      var10004 = (var2 | var3) - (var2 & var3);
      var3 = -1172143326;
      var2 = var10004;
      var10004 = var2 + var3 - 2 * (var2 & var3);
      var3 = 285813230;
      var2 = -532472320;
      var10004 = var2 + var3 - 2 * (var2 & var3);
      var3 = -246794272;
      var2 = var10004;
      var10004 = var2 + var3 - 2 * (var2 & var3);
      String var1180 = "cxw";
      var3 = -704520914;
      var2 = -839795094;
      var10005 = var2 & ~var3 | ~var2 & var3;
      var3 = -1239587261;
      var2 = var10005;
      var10005 = (var2 + var3 - 2 * (var2 & var3)) * (var2 + var3 - 2 * (var2 & var3));
      var3 = -603570198;
      var2 = -443698286;
      var10005 = (var2 | var3) - (var2 & var3);
      var3 = -626486160;
      var2 = var10005;
      var10005 = (var2 | var3) - (var2 & var3);
      var3 = -1481291383;
      var2 = -1601273662;
      var10007 = var2 & ~var3 | ~var2 & var3;
      var3 = 121358656;
      var2 = var10007;
      var10007 = var2 & ~var3 | ~var2 & var3;
      var3 = -1952593745;
      var2 = 98125276;
      var10007 = (var2 | var3) & (~var2 | ~var3);
      var3 = -1908109967;
      var2 = var10007;
      var10007 = (var2 | var3) & ~(var2 & var3);
      var3 = 1244177327;
      var2 = 1634106838;
      var10006 = (var2 | var3) & ~(var2 & var3);
      var3 = 1686748260;
      var2 = var10006;
      var10006 = (var2 | var3) - (var2 & var3);
      var3 = -1516814160;
      var2 = -1790392147;
      var10007 = (var2 | var3) - (var2 & var3);
      var3 = -483808313;
      var2 = var10007;
      var10007 = (var2 | var3) & (~var2 | ~var3);
      var3 = 1761644627;
      var2 = -661956476;
      var10008 = var2 & ~var3 | ~var2 & var3;
      var3 = -1812420049;
      var2 = var10008;
      var3 = var2 & ~var3 | ~var2 & var3;
      var2 = var10007;
      var10007 = (var2 & ~var3) + (var3 & ~var2) + 2 * (var2 & var3);
      var10007 = (int)4554096587171916373L;
      var3 = -1814660021;
      var2 = var10007;
      var10007 = (var2 | var3) & (~var2 | ~var3);
      var3 = 1036406374;
      var2 = var10007;
      var10007 = (var2 | var3) & (~var2 | ~var3);
      var3 = 63171404;
      var2 = 1879231645;
      var10008 = var2 & ~var3 | ~var2 & var3;
      var3 = 1380439795;
      var2 = var10008;
      var10008 = var2 & ~var3 | ~var2 & var3;
      var3 = -381856597;
      var2 = -2075705263;
      var10008 = (var2 | var3) & (~var2 | ~var3);
      var3 = 1832670041;
      var2 = var10008;
      var10003 = c("Ṙ䆑Ṋ䇮Ṁ䇡", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7cf꒡ꁴ꤈絞蹃⑽謿㑻{ꟲ꒰ꁣꤨ絹蹎⑯謻㑲", var10005, var10006, var10007, (var2 | var3) & ~(var2 & var3));
      var10005 = (int)1237180782663174451L;
      var3 = -476536127;
      var2 = var10005;
      var10005 = (var2 | var3) & (~var2 | ~var3);
      var3 = 302820338;
      var2 = var10005;
      var10005 = var2 & ~var3 | ~var2 & var3;
      var3 = 117727243;
      var2 = -1945581219;
      var10008 = (var2 | var3) & ~(var2 & var3);
      var3 = -1962104384;
      var2 = var10008;
      var10008 = var2 & ~var3 | ~var2 & var3;
      var3 = -1173448433;
      var2 = 825076630;
      var10009 = (var2 | var3) & ~(var2 & var3);
      var3 = -1960627697;
      var2 = var10009;
      var10009 = var2 + var3 - 2 * (var2 & var3);
      var3 = -12710524;
      var2 = 981611676;
      var10010 = (var2 | var3) - (var2 & var3);
      var3 = -977520153;
      var2 = var10010;
      this.l = new ItemToggleSetting(var10003, Items.NETHERITE_SCRAP, pulse.Bool.from(var10005), new Color(var10008, var10009, (var2 | var3) & ~(var2 & var3)));
      var3 = 1889087454;
      var2 = 461522330;
      int var1115 = (var2 | var3) & (~var2 | ~var3);
      var3 = -873366585;
      var2 = var1115;
      int var1116 = (var2 | var3) & (~var2 | ~var3);
      var10004 = (int)-3218550098117797750L;
      var3 = -1667119072;
      var2 = var10004;
      var10004 = (var2 | var3) & ~(var2 & var3);
      var3 = -1372315518;
      var2 = var10004;
      var10004 = ((var2 | var3) & ~(var2 & var3)) * ((var2 | var3) & ~(var2 & var3));
      var10006 = (int)1140481195685810376L;
      var3 = 274196793;
      var2 = var10006;
      var10006 = var2 & ~var3 | ~var2 & var3;
      var3 = -846562847;
      var2 = var10006;
      var10006 = (var2 | var3) & ~(var2 & var3);
      var3 = 329389319;
      var2 = -2029913277;
      var10006 = (var2 | var3) - (var2 & var3);
      var3 = -1801195956;
      var2 = var10006;
      var10006 = (var2 | var3) & ~(var2 & var3);
      var3 = -92588386;
      var2 = 1556393540;
      var10006 = (var2 | var3) & ~(var2 & var3);
      var3 = -1497392933;
      var2 = var10006;
      var10006 = (var2 | var3) & (~var2 | ~var3);
      var3 = 1464900081;
      var2 = 199908778;
      var10005 = var2 + var3 - 2 * (var2 & var3);
      var3 = -1080435629;
      var2 = var10005;
      var10005 = (var2 | var3) & ~(var2 & var3);
      var10006 = (int)-6445196803455278734L;
      var3 = -389602626;
      var2 = var10006;
      var10006 = (var2 | var3) & (~var2 | ~var3);
      var3 = -271219687;
      var2 = var10006;
      var10006 = (var2 | var3) - (var2 & var3);
      var10007 = (int)-7192795764449778506L;
      var3 = 1180614033;
      var2 = var10007;
      var10007 = var2 + var3 - 2 * (var2 & var3);
      var3 = -723431073;
      var2 = var10007;
      var3 = (var2 | var3) & ~(var2 & var3);
      var2 = var10006;
      var10006 = 2 * (var2 | var3) - (var2 ^ var3);
      var10006 = (int)8678398037641130484L;
      var3 = 468377514;
      var2 = var10006;
      var10006 = (var2 | var3) & ~(var2 & var3);
      var3 = -1451515747;
      var2 = var10006;
      var10006 = var2 & ~var3 | ~var2 & var3;
      var3 = -263956265;
      var2 = -1896479162;
      var10007 = var2 + var3 - 2 * (var2 & var3);
      var3 = 834254655;
      var2 = var10007;
      var10007 = var2 & ~var3 | ~var2 & var3;
      var3 = 1387085928;
      var2 = -1508890426;
      var10007 = (var2 | var3) & (~var2 | ~var3);
      var3 = -445943242;
      var2 = var10007;
      var10007 = (var2 | var3) - (var2 & var3);
      var3 = -71704020;
      var2 = -541342581;
      var10008 = (var2 | var3) & ~(var2 & var3);
      var3 = 1772013820;
      var2 = var10008;
      var10008 = ((var2 | var3) - (var2 & var3)) * ((var2 | var3) - (var2 & var3));
      var10008 = (int)7872414753345971715L;
      var3 = 434359265;
      var2 = var10008;
      var10008 = var2 + var3 - 2 * (var2 & var3);
      var3 = 943823275;
      var2 = var10008;
      var10003 = c("ṥ爀Ṋ牺Ḹ", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7cf꒡ꁴ꤈絞蹃⑽謿㑻{ꟲ꒰ꁣꤨ絹蹎⑯謻㑲", var10005, var10006, var10007, var2 & ~var3 | ~var2 & var3);
      var3 = -2090932485;
      var2 = -1386739505;
      var10005 = var2 + var3 - 2 * (var2 & var3);
      var3 = 772206132;
      var2 = var10005;
      var10005 = (var2 | var3) - (var2 & var3);
      var10008 = (int)-5195772602175142086L;
      var3 = 866486886;
      var2 = var10008;
      var10008 = var2 & ~var3 | ~var2 & var3;
      var3 = -234795544;
      var2 = var10008;
      var10008 = (var2 | var3) & ~(var2 & var3);
      var3 = 807346631;
      var2 = 944504199;
      var10009 = (var2 | var3) & (~var2 | ~var3);
      var3 = 139779316;
      var2 = var10009;
      var10009 = var2 & ~var3 | ~var2 & var3;
      var3 = -53124799;
      var2 = -1549427968;
      var10010 = var2 + var3 - 2 * (var2 & var3);
      var3 = 1601239797;
      var2 = var10010;
      this.m = new ItemToggleSetting(var10003, Items.DRIED_KELP, pulse.Bool.from(var10005), new Color(var10008, var10009, (var2 | var3) & ~(var2 & var3)));
      var10003 = "cxx";
      var3 = -282934269;
      var2 = 1268153531;
      var10004 = (var2 | var3) - (var2 & var3);
      var3 = 975532786;
      var2 = var10004;
      var10004 = var2 + var3 - 2 * (var2 & var3);
      var10005 = (int)8218025787152203798L;
      var3 = 951392396;
      var2 = var10005;
      var10005 = (var2 | var3) & ~(var2 & var3);
      var3 = -105974691;
      var2 = var10005;
      var3 = var2 + var3 - 2 * (var2 & var3);
      var2 = var10004;
      var10004 = var2 - ~var3 - 1;
      String var1278 = "cxy";
      var10005 = (int)-7727929413566956374L;
      var3 = -2108536739;
      var2 = var10005;
      var10005 = (var2 | var3) - (var2 & var3);
      var3 = -428004097;
      var2 = var10005;
      var10005 = (var2 | var3) - (var2 & var3);
      var10006 = (int)7789459359775098054L;
      var3 = 1137337233;
      var2 = var10006;
      var10006 = var2 + var3 - 2 * (var2 & var3);
      var3 = -473679;
      var2 = var10006;
      var10006 = ((var2 | var3) & (~var2 | ~var3)) * ((var2 | var3) & (~var2 | ~var3));
      var10006 = (int)-3013228865841600674L;
      var3 = 1365855521;
      var2 = var10006;
      var10006 = var2 + var3 - 2 * (var2 & var3);
      var3 = -1370011623;
      var2 = var10006;
      var10006 = (var2 | var3) & ~(var2 & var3);
      var10007 = (int)7127238738623554603L;
      var3 = -1689494630;
      var2 = var10007;
      var10007 = var2 + var3 - 2 * (var2 & var3);
      var3 = -1113774051;
      var2 = var10007;
      var10007 = var2 & ~var3 | ~var2 & var3;
      var3 = -907080690;
      var2 = -876651540;
      var10008 = var2 + var3 - 2 * (var2 & var3);
      var3 = -663737512;
      var2 = var10008;
      var3 = var2 + var3 - 2 * (var2 & var3);
      var2 = var10007;
      var10007 = var2 - ~var3 - 1;
      var10007 = (int)-7958913949165360345L;
      var3 = 198712211;
      var2 = var10007;
      var10007 = var2 + var3 - 2 * (var2 & var3);
      var3 = 1900372539;
      var2 = var10007;
      var10007 = (var2 | var3) - (var2 & var3);
      var3 = 881097390;
      var2 = 1087867508;
      var10008 = (var2 | var3) - (var2 & var3);
      var3 = 339902716;
      var2 = var10008;
      var10008 = (var2 | var3) & ~(var2 & var3);
      var3 = -943045576;
      var2 = -1596079410;
      var10009 = (var2 | var3) - (var2 & var3);
      var3 = -520307153;
      var2 = var10009;
      var3 = (var2 | var3) & (~var2 | ~var3);
      var2 = var10008;
      var10008 = (var2 | var3) + (var2 & var3);
      var3 = -205288339;
      var2 = 1185555498;
      var10008 = var2 + var3 - 2 * (var2 & var3);
      var3 = -1253675093;
      var2 = var10008;
      var10003 = c(
         "ṭ솠ṁ솠Ḹ솠ṏ얾ḵ솯ṁ솠Ṁ솠", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7cf꒡ꁴ꤈絞蹃⑽謿㑻{ꟲ꒰ꁣꤨ絹蹎⑯謻㑲", var10005, var10006, var10007, (var2 | var3) - (var2 & var3)
      );
      var3 = 282255304;
      var2 = -442181781;
      var10005 = var2 & ~var3 | ~var2 & var3;
      var3 = -176813917;
      var2 = var10005;
      var10005 = (var2 | var3) - (var2 & var3);
      var10008 = (int)-8005461394504019237L;
      var3 = 1770335557;
      var2 = var10008;
      var10008 = (var2 | var3) - (var2 & var3);
      var3 = -1392951455;
      var2 = var10008;
      var10008 = (var2 | var3) & ~(var2 & var3);
      var3 = -394900723;
      var2 = -1986779280;
      var10009 = var2 & ~var3 | ~var2 & var3;
      var3 = 1642228906;
      var2 = var10009;
      var10009 = (var2 | var3) & ~(var2 & var3);
      var3 = -402225869;
      var2 = 282489594;
      var10010 = (var2 | var3) & (~var2 | ~var3);
      var3 = -120522807;
      var2 = var10010;
      this.n = new ItemToggleSetting(var10003, Items.GOLDEN_APPLE, pulse.Bool.from(var10005), new Color(var10008, var10009, var2 + var3 - 2 * (var2 & var3)));
      int var1120 = (int)-3235358515795652045L;
      var3 = -1128733777;
      var2 = var1120;
      int var1121 = var2 + var3 - 2 * (var2 & var3);
      var3 = 801896321;
      var2 = var1121;
      int var1122 = ((var2 | var3) & ~(var2 & var3)) * ((var2 | var3) & ~(var2 & var3));
      var10005 = (int)-8038097868176147155L;
      var3 = -988277546;
      var2 = var10005;
      var10005 = (var2 | var3) & ~(var2 & var3);
      var3 = 1553017332;
      var2 = var10005;
      var10005 = (var2 | var3) & ~(var2 & var3);
      var3 = 2099497422;
      var2 = 983549066;
      var10005 = (var2 | var3) & ~(var2 & var3);
      var3 = 1203506505;
      var2 = var10005;
      var10005 = (var2 | var3) & ~(var2 & var3);
      var10005 = (int)8297562560812448716L;
      var3 = -1530982062;
      var2 = var10005;
      var10005 = (var2 | var3) & ~(var2 & var3);
      var3 = 1491762809;
      var2 = var10005;
      var10005 = (var2 & ~var3 | ~var2 & var3) * (var2 & ~var3 | ~var2 & var3);
      var10005 = (int)-4276237407362722800L;
      var3 = 470895892;
      var2 = var10005;
      var10005 = (var2 | var3) - (var2 & var3);
      var3 = -103153396;
      var2 = var10005;
      var10005 = var2 + var3 - 2 * (var2 & var3);
      var3 = 1928232561;
      var2 = -848560561;
      var10006 = var2 + var3 - 2 * (var2 & var3);
      var3 = -2043798148;
      var2 = var10006;
      var10006 = ((var2 | var3) - (var2 & var3)) * ((var2 | var3) - (var2 & var3));
      var10006 = (int)2965859751432713259L;
      var3 = -864215780;
      var2 = var10006;
      var10006 = var2 + var3 - 2 * (var2 & var3);
      var3 = 1781249233;
      var2 = var10006;
      var10006 = var2 & ~var3 | ~var2 & var3;
      String var1541 = "cxz";
      var3 = 1053577224;
      var2 = -2034130492;
      var10007 = var2 + var3 - 2 * (var2 & var3);
      var3 = -1120286250;
      var2 = var10007;
      var10007 = (var2 | var3) & ~(var2 & var3);
      var3 = -1668444914;
      var2 = 241669605;
      var10009 = (var2 | var3) - (var2 & var3);
      var3 = -1830151941;
      var2 = var10009;
      var10009 = var2 & ~var3 | ~var2 & var3;
      var10009 = (int)8299274485705879191L;
      var3 = 344620242;
      var2 = var10009;
      var10009 = (var2 | var3) & (~var2 | ~var3);
      var3 = 1232884289;
      var2 = var10009;
      var10009 = (var2 | var3) & (~var2 | ~var3);
      var10009 = (int)-7957733019105749513L;
      var3 = -103806203;
      var2 = var10009;
      var10009 = (var2 | var3) & (~var2 | ~var3);
      var3 = -618782982;
      var2 = var10009;
      var10009 = (var2 | var3) & ~(var2 & var3);
      var10008 = (int)-7304709341028493883L;
      var3 = -2055997162;
      var2 = var10008;
      var10008 = (var2 | var3) & ~(var2 & var3);
      var3 = -369561665;
      var2 = var10008;
      var10003 = c("ṝ씮Ḻ씤Ṋ", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7cf꒡ꁴ꤈絞蹃⑽謿㑻{ꟲ꒰ꁣꤨ絹蹎⑯謻㑲", var10005, var10006, var10007, var2 + var3 - 2 * (var2 & var3));
      var3 = 2085100515;
      var2 = 1830245777;
      var10005 = var2 + var3 - 2 * (var2 & var3);
      var3 = 291458674;
      var2 = var10005;
      var10005 = (var2 | var3) & (~var2 | ~var3);
      var10008 = (int)-8672901935300435666L;
      var3 = -1805956533;
      var2 = var10008;
      var10008 = (var2 | var3) - (var2 & var3);
      var3 = -1698305126;
      var2 = var10008;
      var10008 = (var2 | var3) & (~var2 | ~var3);
      var3 = -993148144;
      var2 = 2019906400;
      var10009 = (var2 | var3) & (~var2 | ~var3);
      var3 = -1129803756;
      var2 = var10009;
      var10009 = var2 + var3 - 2 * (var2 & var3);
      var3 = 837049870;
      var2 = -441788890;
      var10010 = var2 & ~var3 | ~var2 & var3;
      var3 = -733050665;
      var2 = var10010;
      this.o = new ItemToggleSetting(var10003, Items.ENCHANTED_GOLDEN_APPLE, pulse.Bool.from(var10005), new Color(var10008, var10009, (var2 | var3) & ~(var2 & var3)));
      var10003 = "cya";
      String var1187 = "cyb";
      var3 = 1999921476;
      var2 = -1033474557;
      var10005 = var2 + var3 - 2 * (var2 & var3);
      var3 = 1619909392;
      var2 = var10005;
      var10005 = (var2 | var3) & ~(var2 & var3);
      var3 = -893869705;
      var2 = 354720845;
      var10005 = (var2 | var3) & (~var2 | ~var3);
      var3 = 1019159858;
      var2 = var10005;
      var10005 = var2 + var3 - 2 * (var2 & var3);
      String var1419 = "cyc";
      var10006 = (int)-1235744333569827296L;
      var3 = 960779905;
      var2 = var10006;
      var10006 = (var2 | var3) & (~var2 | ~var3);
      var3 = 448141991;
      var2 = var10006;
      var10006 = (var2 | var3) & (~var2 | ~var3);
      var3 = -2039472272;
      var2 = -624875860;
      var10007 = (var2 | var3) - (var2 & var3);
      var3 = 229983661;
      var2 = var10007;
      var10007 = (var2 | var3) & (~var2 | ~var3);
      var3 = 236455816;
      var2 = -920476844;
      var10008 = (var2 | var3) - (var2 & var3);
      var3 = 823715520;
      var2 = var10008;
      var3 = (var2 | var3) - (var2 & var3);
      var2 = var10007;
      var10007 = (var2 ^ var3) + 2 * (var2 & var3);
      var3 = -1230467813;
      var2 = -471875899;
      var10007 = (var2 | var3) & ~(var2 & var3);
      var3 = 1267258917;
      var2 = var10007;
      var10007 = (var2 | var3) & ~(var2 & var3);
      var10008 = (int)6158994390113854407L;
      var3 = -460388963;
      var2 = var10008;
      var10008 = (var2 | var3) & ~(var2 & var3);
      var3 = -1691406836;
      var2 = var10008;
      var10008 = var2 + var3 - 2 * (var2 & var3);
      var3 = -1532398227;
      var2 = -441131344;
      var10009 = (var2 | var3) & ~(var2 & var3);
      var3 = -1119167555;
      var2 = var10009;
      var3 = var2 & ~var3 | ~var2 & var3;
      var2 = var10008;
      var10008 = (var2 & ~var3) + (var3 & ~var2) + 2 * (var2 & var3);
      var3 = 1552127747;
      var2 = 1699599872;
      var10008 = (var2 | var3) - (var2 & var3);
      var3 = 971290255;
      var2 = var10008;
      var10003 = c(
         "ṟ\uf1c0Ḻ\uf1bdḻ", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7cf꒡ꁴ꤈絞蹃⑽謿㑻{ꟲ꒰ꁣꤨ絹蹎⑯謻㑲", var10005, var10006, var10007, (var2 | var3) - (var2 & var3)
      );
      var3 = -1849309069;
      var2 = 1341715348;
      var10005 = (var2 | var3) & (~var2 | ~var3);
      var3 = -566412313;
      var2 = var10005;
      var10005 = var2 & ~var3 | ~var2 & var3;
      var10008 = (int)-4673175589135291047L;
      var3 = -1121133264;
      var2 = var10008;
      var10008 = (var2 | var3) & (~var2 | ~var3);
      var3 = 297578657;
      var2 = var10008;
      var10008 = (var2 | var3) & ~(var2 & var3);
      var3 = -337138195;
      var2 = -1781951830;
      var10009 = (var2 | var3) & (~var2 | ~var3);
      var3 = 2116960035;
      var2 = var10009;
      var10009 = (var2 | var3) & (~var2 | ~var3);
      var10010 = (int)-8273549678549885218L;
      var3 = 341804666;
      var2 = var10010;
      var10010 = var2 + var3 - 2 * (var2 & var3);
      var3 = 505616475;
      var2 = var10010;
      this.p = new ItemToggleSetting(var10003, Items.CHORUS_FRUIT, pulse.Bool.from(var10005), new Color(var10008, var10009, var2 & ~var3 | ~var2 & var3));
      var10003 = "cyd";
      var10004 = (int)8557364320922539447L;
      var3 = 1538326838;
      var2 = var10004;
      var10004 = (var2 | var3) & (~var2 | ~var3);
      var3 = 857201853;
      var2 = var10004;
      var10004 = ((var2 | var3) & ~(var2 & var3)) * ((var2 | var3) & ~(var2 & var3));
      var3 = -1564953312;
      var2 = 396324780;
      var10005 = var2 + var3 - 2 * (var2 & var3);
      var3 = -1097272848;
      var2 = var10005;
      var10005 = (var2 | var3) - (var2 & var3);
      var10005 = (int)-416504824210663540L;
      var3 = 2094251598;
      var2 = var10005;
      var10005 = var2 & ~var3 | ~var2 & var3;
      var3 = 778006986;
      var2 = var10005;
      var10005 = (var2 | var3) & (~var2 | ~var3);
      var3 = -1880718167;
      var2 = -1521203648;
      var10006 = (var2 | var3) & ~(var2 & var3);
      var3 = -948046486;
      var2 = var10006;
      var10006 = var2 + var3 - 2 * (var2 & var3);
      var10007 = (int)-105309234899750673L;
      var3 = 386558736;
      var2 = var10007;
      var10007 = var2 + var3 - 2 * (var2 & var3);
      var3 = 837378970;
      var2 = var10007;
      var3 = (var2 | var3) & (~var2 | ~var3);
      var2 = var10006;
      var10006 = (var2 ^ var3) + 2 * (var2 & var3);
      var10006 = (int)5111533198010256933L;
      var3 = -1905009733;
      var2 = var10006;
      var10006 = (var2 | var3) & (~var2 | ~var3);
      var3 = 1285858646;
      var2 = var10006;
      var10006 = var2 + var3 - 2 * (var2 & var3);
      var3 = 209351251;
      var2 = 924890011;
      var10007 = var2 + var3 - 2 * (var2 & var3);
      var3 = -306241368;
      var2 = var10007;
      var10007 = (var2 | var3) & ~(var2 & var3);
      var3 = 225552281;
      var2 = 1447082579;
      var10007 = (var2 | var3) & ~(var2 & var3);
      var3 = 1188854638;
      var2 = var10007;
      var10007 = (var2 | var3) & (~var2 | ~var3);
      var10008 = (int)-7084693778257139618L;
      var3 = 636880087;
      var2 = var10008;
      var10008 = var2 & ~var3 | ~var2 & var3;
      var3 = 1194869581;
      var2 = var10008;
      var10008 = ((var2 | var3) & (~var2 | ~var3)) * ((var2 | var3) & (~var2 | ~var3));
      var3 = -178734995;
      var2 = -168449535;
      var10008 = var2 + var3 - 2 * (var2 & var3);
      var3 = 16761890;
      var2 = var10008;
      var10003 = c("ṗ퀁Ṏ퀉Ḻ퐜ṅ큭Ḻ퀇", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7cf꒡ꁴ꤈絞蹃⑽謿㑻{ꟲ꒰ꁣꤨ絹蹎⑯謻㑲", var10005, var10006, var10007, var2 + var3 - 2 * (var2 & var3));
      var10005 = (int)-4478914577897331172L;
      var3 = -528714442;
      var2 = var10005;
      var10005 = (var2 | var3) & ~(var2 & var3);
      var3 = 358617898;
      var2 = var10005;
      var10005 = var2 & ~var3 | ~var2 & var3;
      var3 = 695377905;
      var2 = -566349031;
      var10008 = (var2 | var3) - (var2 & var3);
      var3 = -145969944;
      var2 = var10008;
      var10008 = var2 & ~var3 | ~var2 & var3;
      var3 = 230740944;
      var2 = 863025259;
      var10009 = var2 + var3 - 2 * (var2 & var3);
      var3 = 1051749188;
      var2 = var10009;
      var10009 = var2 & ~var3 | ~var2 & var3;
      var3 = -1033575761;
      var2 = -1758406826;
      var10010 = var2 + var3 - 2 * (var2 & var3);
      var3 = 1431582063;
      var2 = var10010;
      this.q = new ItemToggleSetting(var10003, Items.ENDER_PEARL, pulse.Bool.from(var10005), new Color(var10008, var10009, (var2 | var3) - (var2 & var3)));
      int var1128 = (int)-2566492938441646300L;
      var3 = 1048518278;
      var2 = var1128;
      int var1129 = (var2 | var3) & ~(var2 & var3);
      var3 = 566752365;
      var2 = var1129;
      int var1130 = ((var2 | var3) & (~var2 | ~var3)) * ((var2 | var3) & (~var2 | ~var3));
      var10005 = (int)3505025851073087740L;
      var3 = 2064958198;
      var2 = var10005;
      var10005 = (var2 | var3) - (var2 & var3);
      var3 = -1764685309;
      var2 = var10005;
      var10005 = var2 + var3 - 2 * (var2 & var3);
      var3 = -1692451446;
      var2 = 159284638;
      var10005 = var2 + var3 - 2 * (var2 & var3);
      var3 = -1839120365;
      var2 = var10005;
      var10005 = (var2 | var3) & ~(var2 & var3);
      var3 = -1083556650;
      var2 = -458553129;
      var10005 = var2 + var3 - 2 * (var2 & var3);
      var3 = 1539388419;
      var2 = var10005;
      var10005 = var2 & ~var3 | ~var2 & var3;
      var3 = 1420996130;
      var2 = -364243448;
      var10006 = (var2 | var3) - (var2 & var3);
      var3 = -1090996167;
      var2 = var10006;
      var10006 = var2 + var3 - 2 * (var2 & var3);
      var10006 = (int)-5239628081826757398L;
      var3 = 366904263;
      var2 = var10006;
      var10006 = (var2 | var3) - (var2 & var3);
      var3 = 642811682;
      var2 = var10006;
      var10006 = (var2 | var3) - (var2 & var3);
      var3 = -411825874;
      var2 = 220709735;
      var10006 = (var2 | var3) & (~var2 | ~var3);
      var3 = -363607484;
      var2 = var10006;
      var10006 = (var2 | var3) - (var2 & var3);
      var3 = 534567767;
      var2 = -1576498841;
      var10005 = var2 + var3 - 2 * (var2 & var3);
      var3 = 1593264696;
      var2 = var10005;
      var10005 = var2 & ~var3 | ~var2 & var3;
      var10006 = (int)-7478364024811334349L;
      var3 = 154494362;
      var2 = var10006;
      var10006 = (var2 | var3) & (~var2 | ~var3);
      var3 = 1329048183;
      var2 = var10006;
      var10006 = (var2 | var3) - (var2 & var3);
      var3 = 781981236;
      var2 = -1980804965;
      var10007 = (var2 | var3) & ~(var2 & var3);
      var3 = -992665981;
      var2 = var10007;
      var3 = (var2 | var3) - (var2 & var3);
      var2 = var10006;
      var10006 = (var2 | var3) + (var2 & var3);
      var3 = 1462896972;
      var2 = -1588524599;
      var10006 = (var2 | var3) & ~(var2 & var3);
      var3 = -1175292081;
      var2 = var10006;
      var10006 = var2 + var3 - 2 * (var2 & var3);
      var10007 = (int)-9109877216611175983L;
      var3 = -1157119601;
      var2 = var10007;
      var10007 = var2 + var3 - 2 * (var2 & var3);
      var3 = 1837300921;
      var2 = var10007;
      var10007 = (var2 | var3) & (~var2 | ~var3);
      var3 = -1476531541;
      var2 = 1495604333;
      var10007 = (var2 | var3) & ~(var2 & var3);
      var3 = -172777811;
      var2 = var10007;
      var10007 = (var2 | var3) - (var2 & var3);
      var10008 = (int)-8310267855767782013L;
      var3 = 1405093762;
      var2 = var10008;
      var10008 = (var2 | var3) & ~(var2 & var3);
      var3 = 1422429375;
      var2 = var10008;
      var10008 = (var2 | var3) & ~(var2 & var3);
      var10009 = (int)-1442722187188016578L;
      var3 = 209978892;
      var2 = var10009;
      var10009 = (var2 | var3) & (~var2 | ~var3);
      var3 = -13649406;
      var2 = var10009;
      var3 = var2 & ~var3 | ~var2 & var3;
      var2 = var10008;
      var10008 = var2 - ~var3 - 1;
      var3 = -1275984457;
      var2 = -1415283947;
      var10008 = (var2 | var3) & ~(var2 & var3);
      var3 = 407249906;
      var2 = var10008;
      var10003 = c(
         "ṛ嬟ṏ嬔Ṅ嬘ᩚ嬕Ṋ嬞Ṅ孢Ṅ嬕Ṁ嬒", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7cf꒡ꁴ꤈絞蹃⑽謿㑻{ꟲ꒰ꁣꤨ絹蹎⑯謻㑲", var10005, var10006, var10007, var2 & ~var3 | ~var2 & var3
      );
      var3 = -1969600237;
      var2 = -424222401;
      var10005 = (var2 | var3) - (var2 & var3);
      var3 = 1814865964;
      var2 = var10005;
      var10005 = var2 + var3 - 2 * (var2 & var3);
      var3 = -756086604;
      var2 = -1320131853;
      var10008 = var2 & ~var3 | ~var2 & var3;
      var3 = 1673489039;
      var2 = var10008;
      var10008 = var2 & ~var3 | ~var2 & var3;
      var10009 = (int)-3260188056919626804L;
      var3 = 1597864369;
      var2 = var10009;
      var10009 = (var2 | var3) & ~(var2 & var3);
      var3 = 426300059;
      var2 = var10009;
      var10009 = (var2 | var3) & ~(var2 & var3);
      var3 = 406877333;
      var2 = 691816749;
      var10010 = (var2 | var3) - (var2 & var3);
      var3 = 830225735;
      var2 = var10010;
      this.r = new ItemToggleSetting(var10003, Items.SNOWBALL, pulse.Bool.from(var10005), new Color(var10008, var10009, (var2 | var3) & ~(var2 & var3)));
      var10003 = "cye";
      var3 = -710480322;
      var2 = -206489623;
      var10004 = var2 + var3 - 2 * (var2 & var3);
      var3 = -1177666439;
      var2 = var10004;
      var10004 = (var2 | var3) & ~(var2 & var3);
      var3 = 741131656;
      var2 = -577133161;
      var10005 = (var2 | var3) & (~var2 | ~var3);
      var3 = -851592947;
      var2 = var10005;
      var3 = (var2 | var3) & (~var2 | ~var3);
      var2 = var10004;
      var10004 = (var2 | var3) + (var2 & var3);
      var10005 = (int)-8432616810544080253L;
      var3 = -2084329540;
      var2 = var10005;
      var10005 = (var2 | var3) - (var2 & var3);
      var3 = 106715112;
      var2 = var10005;
      var10005 = ((var2 | var3) & (~var2 | ~var3)) * ((var2 | var3) & (~var2 | ~var3));
      var10005 = (int)-1452866911473483909L;
      var3 = 1022543141;
      var2 = var10005;
      var10005 = var2 + var3 - 2 * (var2 & var3);
      var3 = 73785942;
      var2 = var10005;
      var10005 = var2 + var3 - 2 * (var2 & var3);
      String var1442 = "cyf";
      var3 = -523837431;
      var2 = -627700414;
      var10006 = var2 + var3 - 2 * (var2 & var3);
      var3 = 1973069851;
      var2 = var10006;
      var10006 = var2 + var3 - 2 * (var2 & var3);
      var3 = 379117352;
      var2 = -1001447814;
      var10008 = var2 & ~var3 | ~var2 & var3;
      var3 = -757612193;
      var2 = var10008;
      var10008 = (var2 | var3) & (~var2 | ~var3);
      var3 = -769292669;
      var2 = 1283886646;
      var10008 = (var2 | var3) & (~var2 | ~var3);
      var3 = -1633482566;
      var2 = var10008;
      var10008 = var2 & ~var3 | ~var2 & var3;
      var10008 = (int)-8952434858417777714L;
      var3 = 2017589995;
      var2 = var10008;
      var10008 = var2 & ~var3 | ~var2 & var3;
      var3 = -579933912;
      var2 = var10008;
      var10008 = var2 & ~var3 | ~var2 & var3;
      var3 = -1630062705;
      var2 = -1395162167;
      var10007 = var2 & ~var3 | ~var2 & var3;
      var3 = 658172358;
      var2 = var10007;
      var10007 = var2 & ~var3 | ~var2 & var3;
      var3 = 495176512;
      var2 = 989722578;
      var10009 = var2 & ~var3 | ~var2 & var3;
      var3 = 662584470;
      var2 = var10009;
      var10009 = (var2 | var3) & ~(var2 & var3);
      var3 = 975495601;
      var2 = 792588010;
      var10009 = (var2 | var3) - (var2 & var3);
      var3 = 353963867;
      var2 = var10009;
      var10009 = var2 + var3 - 2 * (var2 & var3);
      var10009 = (int)2805792444698765441L;
      var3 = -654599114;
      var2 = var10009;
      var10009 = var2 & ~var3 | ~var2 & var3;
      var3 = 54867124;
      var2 = var10009;
      var10009 = (var2 | var3) & (~var2 | ~var3);
      var10009 = (int)5452420746026710976L;
      var3 = 1884006785;
      var2 = var10009;
      var10009 = (var2 | var3) & (~var2 | ~var3);
      var3 = -1263542714;
      var2 = var10009;
      var10009 = (var2 | var3) & (~var2 | ~var3);
      var3 = -526709908;
      var2 = -1216504043;
      var10008 = (var2 | var3) & (~var2 | ~var3);
      var3 = 1471135407;
      var2 = var10008;
      var10003 = c("ṘⳤṊⲛṀⲔᩚ⢖", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7cf꒡ꁴ꤈絞蹃⑽謿㑻{ꟲ꒰ꁣꤨ絹蹎⑯謻㑲", var10005, var10006, var10007, (var2 | var3) & (~var2 | ~var3));
      var3 = -967836533;
      var2 = 1302674024;
      var10005 = var2 + var3 - 2 * (var2 & var3);
      var3 = -1947547933;
      var2 = var10005;
      var10005 = (var2 | var3) & ~(var2 & var3);
      var3 = 1476285829;
      var2 = -1219528809;
      var10008 = (var2 | var3) & ~(var2 & var3);
      var3 = -525262118;
      var2 = var10008;
      var10008 = (var2 | var3) & ~(var2 & var3);
      var3 = -387480115;
      var2 = -988784249;
      var10009 = var2 + var3 - 2 * (var2 & var3);
      var3 = 771218656;
      var2 = var10009;
      var10009 = var2 + var3 - 2 * (var2 & var3);
      var3 = 1605635342;
      var2 = -1210278964;
      var10010 = var2 + var3 - 2 * (var2 & var3);
      var3 = -395798962;
      var2 = var10010;
      this.s = new ItemToggleSetting(var10003, Items.POPPED_CHORUS_FRUIT, pulse.Bool.from(var10005), new Color(var10008, var10009, var2 + var3 - 2 * (var2 & var3)));
      var3 = -1622974365;
      var2 = -542204499;
      int var1134 = (var2 | var3) & (~var2 | ~var3);
      var3 = 95196691;
      var2 = var1134;
      int var1135 = var2 & ~var3 | ~var2 & var3;
      var3 = 421639470;
      var2 = -2099295695;
      var10004 = (var2 | var3) & (~var2 | ~var3);
      var3 = -723082746;
      var2 = var10004;
      var3 = (var2 | var3) & (~var2 | ~var3);
      var2 = var1135;
      int var1136 = 2 * (var2 | var3) - (var2 ^ var3);
      String var1195 = "cyg";
      String var1331 = "cyh";
      var3 = 1646144547;
      var2 = -2026877572;
      var10005 = (var2 | var3) - (var2 & var3);
      var3 = 101546327;
      var2 = var10005;
      var10005 = (var2 | var3) - (var2 & var3);
      var10006 = (int)-5654550343969546812L;
      var3 = -431291580;
      var2 = var10006;
      var10006 = var2 + var3 - 2 * (var2 & var3);
      var3 = -741076385;
      var2 = var10006;
      var10006 = (var2 | var3) & (~var2 | ~var3);
      var10007 = (int)-7725314774913857347L;
      var3 = -2136943632;
      var2 = var10007;
      var10007 = (var2 | var3) & ~(var2 & var3);
      var3 = -1864903411;
      var2 = var10007;
      var3 = var2 + var3 - 2 * (var2 & var3);
      var2 = var10006;
      var10006 = var2 - ~var3 - 1;
      var3 = -1925508979;
      var2 = 1837233225;
      var10006 = (var2 | var3) - (var2 & var3);
      var3 = -1356502649;
      var2 = var10006;
      var10006 = var2 + var3 - 2 * (var2 & var3);
      var10008 = (int)7292394308810199357L;
      var3 = 483554166;
      var2 = var10008;
      var10008 = var2 & ~var3 | ~var2 & var3;
      var3 = -1369169332;
      var2 = var10008;
      var10008 = var2 + var3 - 2 * (var2 & var3);
      var10008 = (int)7871483815949133981L;
      var3 = -1795382837;
      var2 = var10008;
      var10008 = (var2 | var3) - (var2 & var3);
      var3 = -199308962;
      var2 = var10008;
      var10008 = (var2 | var3) - (var2 & var3);
      var3 = 639535164;
      var2 = -1402555737;
      var10007 = (var2 | var3) & (~var2 | ~var3);
      var3 = -1635204099;
      var2 = var10007;
      var10007 = var2 + var3 - 2 * (var2 & var3);
      var3 = 958238899;
      var2 = -401018741;
      var10009 = var2 + var3 - 2 * (var2 & var3);
      var3 = -788176856;
      var2 = var10009;
      var10009 = (var2 | var3) & (~var2 | ~var3);
      var10008 = (int)-3282957839973670272L;
      var3 = -1297165391;
      var2 = var10008;
      var10008 = (var2 | var3) & ~(var2 & var3);
      var3 = -1250327560;
      var2 = var10008;
      var10003 = c("ṛ瓹Ṋ璆", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7cf꒡ꁴ꤈絞蹃⑽謿㑻{ꟲ꒰ꁣꤨ絹蹎⑯謻㑲", var10005, var10006, var10007, (var2 | var3) & (~var2 | ~var3));
      var10005 = (int)719037144869519572L;
      var3 = 536289279;
      var2 = var10005;
      var10005 = var2 + var3 - 2 * (var2 & var3);
      var3 = 1605721899;
      var2 = var10005;
      var10005 = (var2 | var3) & (~var2 | ~var3);
      var10008 = (int)-3531131572132974175L;
      var3 = 1281021799;
      var2 = var10008;
      var10008 = var2 + var3 - 2 * (var2 & var3);
      var3 = 2005018226;
      var2 = var10008;
      var10008 = (var2 | var3) - (var2 & var3);
      var3 = -518652187;
      var2 = -1208290089;
      var10009 = (var2 | var3) - (var2 & var3);
      var3 = 1458506430;
      var2 = var10009;
      var10009 = var2 + var3 - 2 * (var2 & var3);
      var10010 = (int)2554735440260618071L;
      var3 = -1974882113;
      var2 = var10010;
      var10010 = (var2 | var3) & ~(var2 & var3);
      var3 = 1637640076;
      var2 = var10010;
      this.t = new ItemToggleSetting(var10003, Items.NETHER_STAR, pulse.Bool.from(var10005), new Color(var10008, var10009, (var2 | var3) & ~(var2 & var3)));
      var3 = 1175580168;
      var2 = 1226719493;
      int var1138 = var2 + var3 - 2 * (var2 & var3);
      var3 = 1558322734;
      var2 = var1138;
      int var1139 = var2 & ~var3 | ~var2 & var3;
      var10004 = (int)-4149054970213572840L;
      var3 = -579072424;
      var2 = var10004;
      var10004 = var2 + var3 - 2 * (var2 & var3);
      var3 = 534863139;
      var2 = var10004;
      var10004 = (var2 & ~var3 | ~var2 & var3) * (var2 & ~var3 | ~var2 & var3);
      String var1337 = "cyi";
      var3 = 874982499;
      var2 = 1628382293;
      var10005 = (var2 | var3) & ~(var2 & var3);
      var3 = -1240788930;
      var2 = var10005;
      var10005 = (var2 | var3) & (~var2 | ~var3);
      var10006 = (int)8552691476917505510L ^ -980284897 ^ 1432080386;
      var10006 = 857101380 ^ -977092141 ^ -1183325278;
      String var1567 = "cyj";
      var10007 = -1426843685 ^ -1013194214 ^ 1901219890;
      var10008 = ((int)2237285820870790438L ^ -2015481713 ^ 113965853) + (826812534 ^ 2023694159 ^ -1316190789);
      this.u = new ItemToggleSetting(
         c(
            "ṛ巻ṏ嶋Ṃ已Ḷ巴Ṃ巳ᩚ巽Ṍ巼Ṁ巹",
            "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7cf꒡ꁴ꤈絞蹃⑽謿㑻{ꟲ꒰ꁣꤨ絹蹎⑯謻㑲",
            var10005,
            var10006,
            var10007,
            -1980076343 ^ 1200074211 ^ -832595823
         ),
         Items.JACK_O_LANTERN,
         pulse.Bool.from((int)-3092010194710917092L ^ -1 ^ -1),
         new Color(-1253965328 ^ -1899787584 ^ 998345679, (int)-2280566555450365118L ^ 1574765683 ^ -1570525273, -250514773 ^ 1299043269 ^ -1132682898)
      );
      int var1140 = (int)-5486398773379186879L ^ 664582135 ^ -1449699460;
      var10004 = (-1988951377 ^ -368806256 ^ 94327397) * (-1988951377 ^ -368806256 ^ 94327397);
      var10005 = ((int)829104022242092363L ^ -2085997755 ^ -99095917) * ((int)829104022242092363L ^ -2085997755 ^ -99095917);
      var10005 = (int)6840578494074202586L ^ -512222803 ^ -1088214913;
      var10006 = (-1870488448 ^ -2040968706 ^ -1009399616) + (-579067097 ^ 1266914865 ^ -1155742936);
      var10006 = (int)8957684581277664752L ^ 311683415 ^ -401870280;
      var10008 = (int)6136434974239705070L ^ 1531683074 ^ -1851988241;
      var10008 = -1016118106 ^ -1565850288 ^ 1640251889;
      var10008 = (int)4562618280724726752L ^ 1912773718 ^ 2119147448;
      var10008 = (int)1856565889120876623L ^ 1546557338 ^ -1358516267;
      var10008 = (int)-2362235553261986826L ^ 2101809559 ^ -784184725;
      var10007 = (int)-4994918810925455203L ^ -898589188 ^ -1672870280;
      var10008 = ((int)-709774026055940731L ^ 141945414 ^ 296481494) * ((int)-709774026055940731L ^ 141945414 ^ 296481494);
      this.v = new ItemToggleSetting(
         c(
            "Ṩ艠Ḻ舜Ṉ艪Ṋ舘ᩚ舕Ḻ艧ṅ艭Ṋ",
            "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7cf꒡ꁴ꤈絞蹃⑽謿㑻{ꟲ꒰ꁣꤨ絹蹎⑯謻㑲",
            var10005,
            var10006,
            var10007,
            (int)4309566863334985139L ^ 670699153 ^ -1895184633
         ),
         Items.PRISMARINE_SHARD,
         pulse.Bool.from((int)-2239391100892096504L ^ -1 ^ -1),
         new Color(-240602543 ^ -425318038 ^ 386833348, 968471294 ^ 1381870826 ^ 1810112038, 1143679217 ^ 1731400827 ^ 588790968)
      );
      int var1141 = ((int)-7327415912027442558L ^ -1054708353 ^ 2086830428) * ((int)-7327415912027442558L ^ -1054708353 ^ 2086830428);
      var10004 = (-562704072 ^ 934790837 ^ 932883012) + (820439797 ^ -104987148 ^ -1285252005);
      var10006 = 2001199403 ^ -1863071074 ^ -407622726;
      var10006 = (int)6629095192283412736L ^ -305614311 ^ -1685730542;
      var10006 = -2067616107 ^ 1223890006 ^ -869156157;
      var10006 = (int)9060987349414217392L ^ -1589172294 ^ 358850829;
      var10005 = (int)7061457357465541227L ^ 1835542423 ^ 570844660;
      String var1459 = "cyk";
      var10006 = 1525905089 ^ -1047694020 ^ -724713861;
      var10007 = (291143473 ^ 1731047036 ^ 1206159806) + ((int)-8731769086051914471L ^ -1112513544 ^ -470827468);
      var10007 = -1459221881 ^ -1441363528 ^ 329150556;
      var10008 = (int)2658914022496486409L ^ -90404686 ^ 1158214347;
      this.w = new BooleanSetting(
         c(
            "ṥꕀṁꕀṌꕆḸꕋṁꔲṇꔵṏꅞṍꕋṁꔲḵ",
            "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7cf꒡ꁴ꤈絞蹃⑽謿㑻{ꟲ꒰ꁣꤨ絹蹎⑯謻㑲",
            var10005,
            var10006,
            var10007,
            922453463 ^ 846597291 ^ 79637104
         ),
         pulse.Bool.from((int)-3363108861081960006L ^ -1 ^ -1)
      );
      int var1142 = -1397210476 ^ -169131704 ^ 607983802;
      var10005 = (int)-6974850347165095120L ^ -1120092369 ^ -91597794;
      var10005 = (int)-697321640244114617L ^ -379325088 ^ -971538623;
      var10005 = (int)-2614054113880519064L ^ -190231097 ^ 151690151;
      var10006 = ((int)-8465978111628111814L ^ -573022848 ^ -1412798319) + ((int)5138049211028317152L ^ 1133086621 ^ -29816518);
      var10006 = (int)-758520466843135623L ^ 2025137826 ^ 1307092042;
      var10007 = -2125936075 ^ 1226586470 ^ -18883533;
      var10007 = (int)2442738487610265640L ^ -1136461776 ^ -504167354;
      var10008 = ((int)-5929896509992404962L ^ 1191183094 ^ 682723898) * ((int)-5929896509992404962L ^ 1191183094 ^ 682723898);
      this.x = new ColorSetting(
            c(
               "ṜｗṏＧᩚｚṄ～ṄｓṂＧṏ～Ḷｘḱ＠",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7cf꒡ꁴ꤈絞蹃⑽謿㑻{ꟲ꒰ꁣꤨ絹蹎⑯謻㑲",
               var10005,
               var10006,
               var10007,
               (int)2449994429763870174L ^ 812406375 ^ 931295918
            ),
            new Color(
               (int)-6325584238335000526L ^ -1018460060 ^ -1905260494,
               (int)-126898168074309181L ^ 1600355004 ^ -2043999360,
               -801047802 ^ 1248233729 ^ -1708756381
            )
         )
         .a(this.w::k);
      int var1143 = (int)1030244974041023058L ^ -376459126 ^ -488693412;
      var10004 = ((int)-4344939056106962121L ^ 1841250634 ^ 1429034011) * ((int)-4344939056106962121L ^ 1841250634 ^ 1429034011);
      String var1346 = "cyl";
      var10005 = (int)-3644304140193963730L ^ 643346126 ^ -1690609688;
      var10006 = ((int)-5249510369134485528L ^ -1882356130 ^ 1338833873) * ((int)-5249510369134485528L ^ -1882356130 ^ 1338833873);
      var10006 = 736082712 ^ -341214318 ^ -1882960832;
      var10007 = (1254467889 ^ 2100264228 ^ -1275750055) + (-451245485 ^ -86145991 ^ -1193183703);
      var10007 = -296239031 ^ -1254216916 ^ 1427437304;
      var10008 = ((int)-8285753990679578910L ^ 1278718749 ^ 2035672792) + ((int)-5424674321272143469L ^ 1428023798 ^ -839048008);
      this.y = new BooleanSetting(
         c(
            "ṧ琗ṉ琒Ḹ琚Ṉ琟ḱ琗ᩚ琕ṏ琙Ḷ瑭",
            "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7cf꒡ꁴ꤈絞蹃⑽謿㑻{ꟲ꒰ꁣꤨ絹蹎⑯謻㑲",
            var10005,
            var10006,
            var10007,
            (int)1003156946006211991L ^ -401115600 ^ -2071168521
         ),
         true
      );
      int var1144 = (-80912437 ^ -1953963681 ^ -385580849) * (-80912437 ^ -1953963681 ^ -385580849);
      String var1202 = "cym";
      var10006 = 288132892 ^ -1998837326 ^ -1712281947;
      var10006 = 1463304892 ^ 851491610 ^ 1710815656;
      var10005 = -285934204 ^ 1775510733 ^ 1677967681;
      String var1467 = "cyn";
      var10006 = -638205063 ^ 672316896 ^ -1100859378;
      String var1576 = "cyo";
      var10007 = 1040191214 ^ -2097785541 ^ -1562515773;
      var10008 = (-1663241133 ^ 296413134 ^ -1935905174) * (-1663241133 ^ 296413134 ^ -1935905174);
      this.z = new ColorSetting(
            c(
               "Ṝ⩝ṏ⨭ᩚ⩒ṏ⩜Ṋ⨭Ṃ⩝ṇ⨤ḿ",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7cf꒡ꁴ꤈絞蹃⑽謿㑻{ꟲ꒰ꁣꤨ絹蹎⑯謻㑲",
               var10005,
               var10006,
               var10007,
               -548907039 ^ -745389956 ^ 215890816
            ),
            new Color(
               (int)-8172822596045983650L ^ -1774927449 ^ -397381370, (int)1682947077607216346L ^ -1700079257 ^ -903508519, 303442908 ^ 1717975360 ^ 1953501944
            )
         )
         .a(this.y::k);
      HashMap var1 = new HashMap();
      var1.put(Items.ENDER_EYE, this.g);
      var1.put(Items.FIRE_CHARGE, this.h);
      var1.put(Items.SUGAR, this.i);
      var1.put(Items.TOTEM_OF_UNDYING, this.j);
      var1.put(Items.EXPERIENCE_BOTTLE, this.k);
      var1.put(Items.NETHERITE_SCRAP, this.l);
      var1.put(Items.DRIED_KELP, this.m);
      var1.put(Items.GOLDEN_APPLE, this.n);
      var1.put(Items.ENCHANTED_GOLDEN_APPLE, this.o);
      var1.put(Items.CHORUS_FRUIT, this.p);
      var1.put(Items.ENDER_PEARL, this.q);
      var1.put(Items.SNOWBALL, this.r);
      var1.put(Items.POPPED_CHORUS_FRUIT, this.s);
      var1.put(Items.NETHER_STAR, this.t);
      var1.put(Items.JACK_O_LANTERN, this.u);
      var1.put(Items.PRISMARINE_SHARD, this.v);
      this.A = Collections.unmodifiableMap(var1);
   }

   public boolean a(ItemStack var1) {
      if (this.k() && !var1.isEmpty()) {
         Item var2 = var1.getItem();
         ItemToggleSetting var3 = this.A.get(var2);
         if (var3 != null && var3.k()) {
            int var23 = -1908508641;
            int var14 = -171122606;
            int var32 = var14 + var23 - 2 * (var14 & var23);
            var23 = 2079496268;
            var14 = var32;
            return pulse.Bool.from((var14 | var23) & (var14 ^ -1 | var23 ^ -1));
         }

         if (this.b(var2)) {
            ItemHighlighter.ChangeType var4 = this.c(var1);
            if (var4 == ItemHighlighter.ChangeType.POSITIVE && this.w.k()) {
               int var30 = (int)-7450471597222625919L;
               int var21 = 1231603055;
               int var12 = var30;
               var30 = var12 & ~var21 | ~var12 & var21;
               var21 = 922794223;
               var12 = var30;
               return pulse.Bool.from((var12 | var21) - (var12 & var21));
            }

            if (var4 == ItemHighlighter.ChangeType.NEGATIVE && this.y.k()) {
               int var28 = (int)4659731987164642083L;
               int var19 = -1836368409;
               int var10 = var28;
               var28 = var10 & ~var19 | ~var10 & var19;
               var19 = 1106380485;
               var10 = var28;
               return pulse.Bool.from((var10 | var19) & (var10 ^ -1 | var19 ^ -1));
            }
         }

         int var26 = (int)5307550676038151527L;
         int var17 = 847353133;
         int var8 = var26;
         var26 = (var8 | var17) - (var8 & var17);
         var17 = 304281674;
         var8 = var26;
         return pulse.Bool.from((var8 | var17) & (var8 ^ -1 | var17 ^ -1));
      } else {
         int var10000 = (int)4641362166917251638L;
         int var6 = 569905173;
         int var5 = var10000;
         var10000 = (var5 | var6) & ~(var5 & var6);
         var6 = -520990173;
         var5 = var10000;
         return pulse.Bool.from(var5 + var6 - 2 * (var5 & var6));
      }
   }

   private boolean b(Item var1) {
      int var11;
      if (var1 != Items.POTION && var1 != Items.SPLASH_POTION && var1 != Items.LINGERING_POTION) {
         var11 = (int)-7990514494531132156L;
         int var8 = 1112077846;
         int var5 = var11;
         var11 = var5 & ~var8 | ~var5 & var8;
         var8 = 1586778898;
         var5 = var11;
         var11 = var5 & ~var8 | ~var5 & var8;
      } else {
         var11 = (int)-5198005362837983917L;
         int var3 = -1341953640;
         int var2 = var11;
         var11 = (var2 | var3) & ~(var2 & var3);
         var3 = 393479370;
         var2 = var11;
         var11 = (var2 | var3) & (~var2 | ~var3);
      }

      return pulse.Bool.from(var11);
   }

   private ItemHighlighter.ChangeType c(ItemStack var1) {
      PotionContentsComponent var2 = (PotionContentsComponent)var1.get(DataComponentTypes.POTION_CONTENTS);
      if (var2 == null) {
         return ItemHighlighter.ChangeType.NONE;
      }

      Iterable<StatusEffectInstance> var3 = var2.getEffects();
      int var10000 = (int)-5006467052798178226L;
      int var13 = -1255267669;
      int var12 = var10000;
      var10000 = var12 + var13 - 2 * (var12 & var13);
      var13 = 527085285;
      var12 = var10000;
      int var4 = var12 + var13 - 2 * (var12 & var13);
      var10000 = (int)-4512218130382629354L;
      var13 = -1531481903;
      var12 = var10000;
      var10000 = var12 + var13 - 2 * (var12 & var13);
      var13 = -1044371769;
      var12 = var10000;
      int var5 = var12 & ~var13 | ~var12 & var13;
      var10000 = (int)1974643461473585276L;
      var13 = -2066118328;
      var12 = var10000;
      var10000 = (var12 | var13) & (~var12 | ~var13);
      var13 = -1678261964;
      var12 = var10000;
      int var6 = var12 & ~var13 | ~var12 & var13;

      for (StatusEffectInstance var8 : var3) {
         var13 = 1842383150;
         var12 = 333206892;
         var10000 = (var12 | var13) & ~(var12 & var13);
         var13 = 2114772035;
         var12 = var10000;
         var6 = (var12 | var13) - (var12 & var13);
         StatusEffectCategory var9 = ((StatusEffect)var8.getEffectType().value()).getCategory();
         if (var9 != StatusEffectCategory.BENEFICIAL) {
            if (var9 == StatusEffectCategory.HARMFUL) {
               var5++;
            }
         } else {
            var4++;
         }
      }

      if (var6 == 0) {
         return ItemHighlighter.ChangeType.NONE;
      }

      if (var4 <= var5) {
         if (b) {
            var13 = 511882227;
            var12 = -1458654809;
            var10000 = var12 & ~var13 | ~var12 & var13;
            var13 = -1215561132;
            var12 = var10000;
            var10000 = var12 & ~var13 | ~var12 & var13;
            var13 = 1670530275;
            var12 = -1794112996;
            int var10001 = (var12 | var13) & ~(var12 & var13);
            var13 = -159234305;
            var12 = var10001;
            var10000 /= var12 & ~var13 | ~var12 & var13;
         }

         if (var5 <= var4) {
            if (a != a) {
               String var49 = "cyp";
               var13 = -231000644;
               var12 = -707067557;
               var10000 = var12 & ~var13 | ~var12 & var13;
               var13 = 1971514439;
               var12 = var10000;
               int var11 = var12 & ~var13 | ~var12 & var13;
               a = var11;
            }

            return var4 <= 0 ? ItemHighlighter.ChangeType.NONE : ItemHighlighter.ChangeType.POSITIVE;
         } else {
            return ItemHighlighter.ChangeType.NEGATIVE;
         }
      } else {
         return ItemHighlighter.ChangeType.POSITIVE;
      }
   }

   public Color a(Item var1) {
      ItemToggleSetting var2 = this.A.get(var1);
      return var2 != null ? var2.d() : Color.WHITE;
   }

   public Color b(ItemStack var1) {
      Item var2 = var1.getItem();
      ItemToggleSetting var3 = this.A.get(var2);
      if (var3 != null && var3.k()) {
         return var3.d();
      }

      if (this.b(var2)) {
         ItemHighlighter.ChangeType var4 = this.c(var1);
         if (var4 == ItemHighlighter.ChangeType.POSITIVE && this.w.k()) {
            return this.x.a();
         }

         if (var4 == ItemHighlighter.ChangeType.NEGATIVE && this.y.k()) {
            return this.z.a();
         }
      }

      return Color.WHITE;
   }

   public int n() {
      if (!this.e.k()) {
         return this.f.b();
      }

      int var1 = this.f.b();
      double var10000 = System.currentTimeMillis();
      int var10001 = (int)-6471370410183208337L;
      int var7 = -1893311600;
      int var6 = var10001;
      var10001 = (var6 | var7) & ~(var6 & var7);
      var7 = 937243918;
      var6 = var10001;
      var10001 = (var6 & ~var7 | ~var6 & var7) * (var6 & ~var7 | ~var6 & var7);
      var10000 = Math.sin(var10000 / 100.0);
      var7 = 1979999026;
      var6 = -71910895;
      int var10002 = var6 & ~var7 | ~var6 & var7;
      var7 = -1917658829;
      var6 = var10002;
      var10002 = var6 & ~var7 | ~var6 & var7;
      var7 = -740645342;
      var6 = 1651529991;
      var10002 = (var6 | var7) & (~var6 | ~var7);
      var7 = -1314193622;
      var6 = var10002;
      var10002 = (var6 | var7) - (var6 & var7);
      var10000 *= 0.5;
      var10001 = (int)7431906964662971815L;
      var7 = -675527893;
      var6 = var10001;
      var10001 = (var6 | var7) & ~(var6 & var7);
      var7 = 1562242491;
      var6 = var10001;
      var10001 = (var6 | var7) & (~var6 | ~var7);
      double var2 = var10000 + 0.5;
      int var46 = (int)8986739510056764717L;
      var7 = -1524395146;
      var6 = var46;
      int var47 = (var6 | var7) - (var6 & var7);
      var7 = -591047077;
      var6 = var47;
      int var48 = (var6 | var7) & ~(var6 & var7);
      var10002 = (int)6290649815037228034L;
      var7 = 170379916;
      var6 = var10002;
      var10002 = (var6 | var7) & (~var6 | ~var7);
      var7 = 1703706252;
      var6 = var10002;
      int var4 = Math.max(var48, var1 / ((var6 | var7) - (var6 & var7)));
      var7 = 814548518;
      var6 = 1637453306;
      int var49 = var6 + var7 - 2 * (var6 & var7);
      var7 = 1360300835;
      var6 = var49;
      int var50 = (var6 | var7) - (var6 & var7);
      int var10003 = (int)6101551686521375694L;
      var7 = -852349380;
      var6 = var10003;
      var10003 = var6 & ~var7 | ~var6 & var7;
      var7 = -1191647760;
      var6 = var10003;
      var7 = var1 / ((var6 | var7) & ~(var6 & var7));
      var6 = var1;
      int var5 = Math.min(var50, (var6 & ~var7) + (var7 & ~var6) + 2 * (var6 & var7));
      var7 = var4;
      var6 = var5;
      var7 = (int)(((var6 ^ var7) - 2 * (~var6 & var7)) * var2);
      var6 = var4;
      return (var6 ^ var7) + 2 * (var6 & var7);
   }

   public List<Item> o() {
      if (c.player == null) {
         return Collections.emptyList();
      }

      ArrayList var1 = new ArrayList();

      for (ItemStack var3 : c.player.getInventory().main) {
         if (this.a(var3)) {
            Item var4 = var3.getItem();
            if (!var1.contains(var4)) {
               var1.add(var4);
            }
         }
      }

      int var10000 = (int)-4781393066882132671L;
      int var8 = -715098404;
      int var7 = var10000;
      var10000 = var7 + var8 - 2 * (var7 & var8);
      var8 = 1635705005;
      var7 = var10000;
      var10000 = (var7 | var8) - (var7 & var8);
      var10000 = (int)-856387390183477267L;
      var8 = -137447709;
      var7 = var10000;
      var10000 = var7 & ~var8 | ~var7 & var8;
      var8 = 1349741412;
      var7 = var10000;
      int var6 = (var7 | var8) & ~(var7 & var8);
      a = var6;
      var10000 = (int)-2579500942739218854L;
      var8 = -1743171295;
      var7 = var10000;
      var10000 = (var7 | var8) & (~var7 | ~var8);
      var8 = 72475179;
      var7 = var10000;
      var10000 = var7 & ~var8 | ~var7 & var8;
      int var10001 = (int)1712023825749773296L;
      var8 = 742235;
      var7 = var10001;
      var10001 = (var7 | var8) & (~var7 | ~var8);
      var8 = 1047818502;
      var7 = var10001;
      var8 = var7 + var8 - 2 * (var7 & var8);
      var7 = var10000;
      var10000 = (var7 | var8) + (var7 & var8);
      var8 = 1195541084;
      var7 = -96389928;
      var10000 = (var7 | var8) - (var7 & var8);
      var8 = -2086464783;
      var7 = var10000;
      if ((var7 & ~var8 | ~var7 & var8) < a) {
         var8 = 1440133634;
         var7 = -1117215772;
         var10000 = (var7 | var8) & (~var7 | ~var8);
         var8 = -1785795946;
         var7 = var10000;
         var10000 = ((var7 | var8) & ~(var7 & var8)) * ((var7 | var8) & ~(var7 & var8));
         var8 = 384445676;
         var7 = 1692169336;
         var10000 = var7 & ~var8 | ~var7 & var8;
         var8 = 1041198864;
         var7 = var10000;
         var6 = (var7 | var8) - (var7 & var8);
      }

      return var1;
   }

   @Generated
   public BooleanSetting p() {
      return this.e;
   }

   @Generated
   public ItemToggleSetting q() {
      return this.g;
   }

   @Generated
   public ItemToggleSetting r() {
      return this.h;
   }

   @Generated
   public ItemToggleSetting s() {
      return this.i;
   }

   @Generated
   public ItemToggleSetting t() {
      return this.j;
   }

   @Generated
   public ItemToggleSetting u() {
      return this.k;
   }

   @Generated
   public ItemToggleSetting v() {
      return this.l;
   }

   @Generated
   public ItemToggleSetting w() {
      return this.m;
   }

   @Generated
   public ItemToggleSetting x() {
      return this.n;
   }

   @Generated
   public ItemToggleSetting y() {
      return this.o;
   }

   @Generated
   public ItemToggleSetting z() {
      return this.p;
   }

   @Generated
   public ItemToggleSetting A() {
      return this.q;
   }

   @Generated
   public ItemToggleSetting B() {
      return this.r;
   }

   @Generated
   public ItemToggleSetting C() {
      return this.s;
   }

   @Generated
   public ItemToggleSetting D() {
      return this.t;
   }

   @Generated
   public ItemToggleSetting E() {
      return this.u;
   }

   @Generated
   public ItemToggleSetting F() {
      return this.v;
   }

   @Generated
   public BooleanSetting G() {
      return this.w;
   }

   @Generated
   public ColorSetting H() {
      return this.x;
   }

   @Generated
   public BooleanSetting I() {
      return this.y;
   }

   @Generated
   public ColorSetting J() {
      return this.z;
   }

   @Generated
   public Map<Item, ItemToggleSetting> K() {
      return this.A;
   }

   public static String c(String var0, String var1, int var2, int var3, int var4, int var5) {
      char[] var6 = var1.toCharArray();
      char[] var7 = new char[var6.length];
      int var18 = 1362271626;
      int var17 = -661001876;
      int var10000 = (var17 | var18) & ~(var17 & var18);
      var18 = -1985252116;
      var17 = var10000;
      char[] var257 = new char[(var17 | var18) & ~(var17 & var18)];
      var18 = -256018679;
      var17 = -1652930153;
      int var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1841774238;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      int var10003 = (int)4754552242854543585L;
      var18 = 2052274920;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -2026720709;
      var17 = var10003;
      var257[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var10002 = (int)-8969603065522206084L;
      var18 = -375180333;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 115898798;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 943698325;
      var17 = -1379041330;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -1779241506;
      var17 = var10003;
      var257[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var10002 = (int)9054164184011515520L;
      var18 = -805182172;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 1712571302;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 1982031018;
      var17 = -1405854941;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -636019697;
      var17 = var10003;
      var257[var10002] = (char)((var17 | var18) - (var17 & var18));
      var10002 = (int)-8483223432423106390L;
      var18 = -1025742739;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 989524164;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1298031315;
      var17 = -1095389495;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1196042271;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1773029528;
      var17 = -583469609;
      int var10004 = var17 + var18 - 2 * (var17 & var18);
      var18 = -430545805;
      var17 = var10004;
      var18 = (var17 | var18) & (~var17 | ~var18);
      var17 = var10003;
      var10003 = (var17 & ~var18) + (var18 & ~var17) + 2 * (var17 & var18);
      var18 = -980718231;
      var17 = 1978058344;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -1335020782;
      var17 = var10003;
      var257[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var18 = 896777193;
      var17 = -1908044770;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -1154074637;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -558587391;
      var17 = 199909245;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1943415512;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -1807357191;
      var17 = -1146992257;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 803680931;
      var17 = var10003;
      var257[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var18 = -1958296503;
      var17 = 509031005;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -1793985007;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var10003 = (int)7927416719249869948L;
      var18 = 600922472;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1655738518;
      var17 = var10003;
      var257[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var10002 = (int)-3495398804117813895L;
      var18 = 961499793;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -1519069202;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)8927644726376577404L;
      var18 = -1210947097;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 1128454536;
      var17 = var10003;
      var257[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var10002 = (int)-6799535803613071016L;
      var18 = 1117869412;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 246869051;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)-8197895313427446552L;
      var18 = 1418524463;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -975337499;
      var17 = var10003;
      var257[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var18 = -754589100;
      var17 = -1862093718;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1107777078;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var10003 = (int)-3563292197745761795L;
      var18 = 752750908;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 1051687058;
      var17 = var10003;
      var257[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var10002 = (int)1917989482327130378L;
      var18 = -1324203949;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1638736;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 1044746340;
      var17 = 1999606131;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1231685171;
      var17 = var10003;
      var257[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      char[] var8 = var257;
      var18 = 1199772148;
      var17 = 525833810;
      var10000 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1490323372;
      var17 = var10000;
      char[] var259 = new char[var17 & ~var18 | ~var17 & var18];
      var10002 = (int)603975483025896803L;
      var18 = -268687587;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1724804482;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 1991425976;
      var17 = -691685088;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -1602793800;
      var17 = var10003;
      var259[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var10002 = (int)-7527203015818590611L;
      var18 = 1877066701;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -2046589535;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var10003 = (int)4540036916583510840L;
      var18 = -86843219;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 144076985;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var10004 = (int)208814562536013669L;
      var18 = -2116708223;
      var17 = var10004;
      var10004 = (var17 | var18) - (var17 & var18);
      var18 = 1834048513;
      var17 = var10004;
      var18 = (var17 | var18) & ~(var17 & var18);
      var17 = var10003;
      var10003 = (var17 ^ var18) + 2 * (var17 & var18);
      var10003 = (int)-4251322023717417049L;
      var18 = -2140522530;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 1458437242;
      var17 = var10003;
      var259[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var18 = -123238961;
      var17 = 884145582;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -871008157;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var10003 = (int)-3272853385582516585L;
      var18 = -1866319754;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -2112745258;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 2053836304;
      var17 = 1035259167;
      var10004 = (var17 | var18) & ~(var17 & var18);
      var18 = -1011530468;
      var17 = var10004;
      var18 = (var17 | var18) & ~(var17 & var18);
      var17 = var10003;
      var10003 = var17 - ~var18 - 1;
      var10003 = (int)-794678752704351652L;
      var18 = -1631629794;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 473856785;
      var17 = var10003;
      var259[var10002] = (char)((var17 | var18) - (var17 & var18));
      var10002 = (int)-2917163310388723554L;
      var18 = 502662426;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -779336313;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 1011436908;
      var17 = -891424200;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -158038186;
      var17 = var10003;
      var259[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var18 = 2091142427;
      var17 = -1927706714;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -239220039;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)6807281756761283462L;
      var18 = 1672594319;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -1770971063;
      var17 = var10003;
      var259[var10002] = (char)((var17 | var18) - (var17 & var18));
      var10002 = (int)582626058954964819L;
      var18 = -1429608891;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -97740525;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)-9051081892047202784L;
      var18 = -1186430138;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -154735118;
      var17 = var10003;
      var259[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var18 = -903676659;
      var17 = 54436759;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -920887652;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      String var357 = "cyq";
      var10003 = (int)2697548863379752228L;
      var18 = 642623054;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 5203027;
      var17 = var10003;
      var259[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var10002 = (int)-6222434894983641714L;
      var18 = 576850691;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 1826836106;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var10003 = (int)2208765361740152458L;
      var18 = 1496854660;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -2087887306;
      var17 = var10003;
      var259[var10002] = (char)((var17 | var18) - (var17 & var18));
      var18 = 1283184396;
      var17 = -1928026789;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1049660833;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -588070369;
      var17 = 1764878327;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -907652401;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)-7514340524783116502L;
      var18 = -96151093;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 12486117;
      var17 = var10003;
      var259[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var18 = -1810466501;
      var17 = 820749356;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1526866658;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)1756680669476509841L;
      var18 = -64421919;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 198808643;
      var17 = var10003;
      var259[var10002] = (char)((var17 | var18) - (var17 & var18));
      char[] var9 = var259;
      var10000 = (int)-3108627363882740183L;
      var18 = 1228869524;
      var17 = var10000;
      var10000 = var17 & ~var18 | ~var17 & var18;
      var18 = -1249191491;
      var17 = var10000;

      for (int var10 = (var17 | var18) - (var17 & var18); var10 < var6.length; var10++) {
         char var316 = var6[var10];
         char var243 = var8[var10 % var8.length];
         char var125 = var316;
         var7[var10] = (char)((var125 | var243) - (var125 & var243));
      }

      char[] var19 = new char[var7.length];
      var18 = -1220779475;
      var17 = 1371726309;
      var10000 = (var17 | var18) - (var17 & var18);
      var18 = -419527736;
      var17 = var10000;

      for (int var11 = (var17 | var18) & (~var17 | ~var18); var11 < var6.length; var11++) {
         char var317 = var7[var11];
         char var246 = var9[var11 % var9.length];
         char var128 = var317;
         var19[var11] = (char)(var128 & ~var246 | ~var128 & var246);
      }

      String var20 = new String(var19);
      int var12 = var20.hashCode();
      var18 = var5;
      var17 = var3;
      var10000 = var17 - var18;
      var18 = var2;
      var17 = var10000;
      int var13 = (var17 & ~var18) - (~var17 & var18);
      char[] var14 = var0.toCharArray();
      char[] var15 = new char[var14.length];
      var18 = 95759192;
      var17 = -951922581;
      var10000 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1023935693;
      var17 = var10000;

      for (int var16 = (var17 | var18) - (var17 & var18); var16 < var15.length; var16++) {
         int var10001 = (int)-8063319769771711630L;
         var18 = -514929809;
         var17 = var10001;
         var10001 = (var17 | var18) & (~var17 | ~var18);
         var18 = -451827681;
         var17 = var10001;
         switch (var16 % (var17 + var18 - 2 * (var17 & var18))) {
            case 0:
               var18 = var12;
               var17 = var13;
               var10002 = (var17 | var18) - (var17 & var18);
               char var256 = var14[var16];
               var17 = var10002;
               var15[var16] = (char)((var17 | var256) & ~(var17 & var256));
               break;
            case 1:
               var18 = var13;
               var17 = var5;
               var10002 = (var17 | var18) - (var17 & var18);
               char var254 = var14[var16];
               var17 = var10002;
               var15[var16] = (char)((var17 | var254) - (var17 & var254));
         }
      }

      return new String(var15);
   }

   private enum ChangeType {
      POSITIVE,
      NEGATIVE,
      MIXED,
      NONE;

      public static int e;
      public static boolean f;

      public static String a(String value, String key, int seed1, int seed2, int seed3, int seed4) {
         return value;
      }
   }
}
