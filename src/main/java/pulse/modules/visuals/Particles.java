package pulse;




import pulse.module.ModuleRegistry;
import pulse.module.ClientModule;
import pulse.module.ModuleInfo;
import pulse.module.ModuleCategory;
import pulse.settings.BooleanSetting;
import pulse.settings.ColorSetting;
import pulse.settings.ModeSetting;
import pulse.settings.SettingGroup;
import pulse.settings.SliderSetting;
import java.awt.Color;
import java.util.concurrent.ThreadLocalRandom;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Vec3d;

@ModuleInfo(a = "Particles", b = "РЎРѕР·РґР°С‘С‚ С‡Р°СЃС‚РёС†С‹ РїСЂРё РІС‹РїРѕР»РЅРµРЅРёРё СѓСЃР»РѕРІРёР№", c = ModuleCategory.VISUALS)
public class Particles extends ClientModule {
   private final ModeSetting e;
   private final BooleanSetting f;
   private final SettingGroup g;
   private final ModeSetting h;
   private final ModeSetting i;
   private final SliderSetting j;
   private final SliderSetting k;
   private final SliderSetting l;
   private final SliderSetting m;
   private final BooleanSetting n;
   private final ColorSetting o;
   private final SettingGroup p;
   private final ModeSetting q;
   private final ModeSetting r;
   private final SliderSetting s;
   private final SliderSetting t;
   private final SliderSetting u;
   private final SliderSetting v;
   private final BooleanSetting w;
   private final ColorSetting x;
   private final SettingGroup y;
   private final ModeSetting z;
   private final ModeSetting A;
   private final SliderSetting B;
   private final SliderSetting C;
   private final SliderSetting D;
   private final SliderSetting E;
   private final BooleanSetting F;
   private final ColorSetting G;
   private long H;
   private Vec3d I;
   private boolean J;
   private LivingEntity K;
   public static int a;
   public static boolean b;

   public Particles() {
      int var2 = 659244629;
      int var1 = 622950976;
      int var10003 = (var1 | var2) - (var1 & var2);
      var2 = 1204743982;
      var1 = var10003;
      var10003 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1483295822;
      var1 = -1815972302;
      int var10004 = (var1 | var2) & ~(var1 & var2);
      var2 = 1691456822;
      var1 = var10004;
      var2 = var1 & ~var2 | ~var1 & var2;
      var1 = var10003;
      var10003 = (var1 ^ var2) + 2 * (var1 & var2);
      int var10005 = (int)8472027284825857044L;
      var2 = -2108029815;
      var1 = var10005;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = 1160534158;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var10005 = (int)-3161082548639881163L;
      var2 = 2086195323;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var2 = -218433467;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      String var1042 = "dby";
      var10005 = (int)-5260111821168624843L;
      var2 = -1930941207;
      var1 = var10005;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var2 = 432668627;
      var1 = var10005;
      var10005 = (var1 | var2) & ~(var1 & var2);
      int var10007 = (int)1886908197551751155L;
      var2 = -455156370;
      var1 = var10007;
      var10007 = (var1 | var2) - (var1 & var2);
      var2 = -1039736169;
      var1 = var10007;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1619179017;
      var1 = 1157177008;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var2 = -612083896;
      var1 = var10007;
      var10007 = (var1 | var2) - (var1 & var2);
      var2 = -639021475;
      var1 = 1101730388;
      var10007 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1740481532;
      var1 = var10007;
      var10007 = (var1 | var2) & (~var1 | ~var2);
      var2 = -2048197707;
      var1 = 539640460;
      int var10006 = (var1 | var2) & ~(var1 & var2);
      var2 = 1880687190;
      var1 = var10006;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var10007 = (int)1271485636866579961L;
      var2 = -1931671118;
      var1 = var10007;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var2 = -829230782;
      var1 = var10007;
      var10007 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1952168159;
      var1 = -1445595501;
      int var10008 = (var1 | var2) - (var1 & var2);
      var2 = 2115906100;
      var1 = var10008;
      var2 = (var1 | var2) - (var1 & var2);
      var1 = var10007;
      var10007 = (var1 ^ var2) + 2 * (var1 & var2);
      var2 = -1484744802;
      var1 = -276610473;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1100645056;
      var1 = var10007;
      var10007 = (var1 | var2) & ~(var1 & var2);
      int var10009 = (int)-6616124328957237429L;
      var2 = -876498420;
      var1 = var10009;
      var10009 = (var1 | var2) & ~(var1 & var2);
      var2 = 896439617;
      var1 = var10009;
      var10009 = var1 + var2 - 2 * (var1 & var2);
      var2 = 317131037;
      var1 = -496754510;
      var10009 = (var1 | var2) - (var1 & var2);
      var2 = -259839576;
      var1 = var10009;
      var10009 = (var1 | var2) & ~(var1 & var2);
      var2 = -776548068;
      var1 = 1646299633;
      var10009 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1281992477;
      var1 = var10009;
      var10009 = (var1 | var2) - (var1 & var2);
      var10008 = (int)-1011959874128032700L;
      var2 = 829622968;
      var1 = var10008;
      var10008 = (var1 | var2) & ~(var1 & var2);
      var2 = 384275986;
      var1 = var10008;
      String var925 = c(
         "\uee5eн›ќ\uee46нљў\uee4fнљ¤\uee32", "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ", var10005, var10006, var10007, var1 & ~var2 | ~var1 & var2
      );
      var2 = -332519338;
      var1 = -150945058;
      var10004 = var1 & ~var2 | ~var1 & var2;
      var2 = 456059530;
      var1 = var10004;
      String[] var974 = new String[(var1 | var2) & ~(var1 & var2)];
      var2 = -2029241237;
      var1 = 967863500;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1094954841;
      var1 = var10006;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var10007 = (int)-9004107396250455709L;
      var2 = 648564534;
      var1 = var10007;
      var10007 = (var1 | var2) & ~(var1 & var2);
      var2 = -1632423777;
      var1 = var10007;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      var2 = 706376799;
      var1 = -1536739366;
      var10008 = (var1 | var2) & ~(var1 & var2);
      var2 = -1376023070;
      var1 = var10008;
      var2 = (var1 | var2) - (var1 & var2);
      var1 = var10007;
      var10007 = 2 * (var1 | var2) - (var1 ^ var2);
      String var1458 = "dbz";
      var2 = -1988634022;
      var1 = 1545990393;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var2 = -1400030864;
      var1 = var10009;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var2 = 1624904380;
      var1 = -1233154449;
      int var10010 = var1 & ~var2 | ~var1 & var2;
      var2 = 1731363847;
      var1 = var10010;
      var2 = (var1 | var2) & ~(var1 & var2);
      var1 = var10009;
      var10009 = 2 * (var1 | var2) - (var1 ^ var2);
      var2 = -234642766;
      var1 = -644437387;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var2 = 1121837256;
      var1 = var10009;
      var10009 = (var1 | var2) - (var1 & var2);
      var2 = -1081962973;
      var1 = 891864964;
      var10010 = var1 & ~var2 | ~var1 & var2;
      var2 = 1097851027;
      var1 = var10010;
      var10010 = var1 + var2 - 2 * (var1 & var2);
      var2 = 2085393184;
      var1 = -89639049;
      var10010 = (var1 | var2) - (var1 & var2);
      var2 = 1394443617;
      var1 = var10010;
      var10010 = var1 + var2 - 2 * (var1 & var2);
      var2 = -680240276;
      var1 = 183059432;
      int var10011 = var1 + var2 - 2 * (var1 & var2);
      var2 = 913911515;
      var1 = var10011;
      var10011 = (var1 + var2 - 2 * (var1 & var2)) * (var1 + var2 - 2 * (var1 & var2));
      var10011 = (int)1397403884904799406L;
      var2 = -610770605;
      var1 = var10011;
      var10011 = var1 & ~var2 | ~var1 & var2;
      var2 = 970228250;
      var1 = var10011;
      var10011 = (var1 | var2) & (~var1 | ~var2);
      var2 = 2022720866;
      var1 = 711063846;
      int var10013 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1391574087;
      var1 = var10013;
      var10013 = (var1 | var2) - (var1 & var2);
      var2 = -897214340;
      var1 = 1832635730;
      var10013 = (var1 | var2) & ~(var1 & var2);
      var2 = -1480698581;
      var1 = var10013;
      var10013 = (var1 | var2) & ~(var1 & var2);
      var10013 = (int)-4321479150931153677L;
      var2 = 215441417;
      var1 = var10013;
      var10013 = (var1 | var2) & (~var1 | ~var2);
      var2 = -861238030;
      var1 = var10013;
      var10013 = var1 + var2 - 2 * (var1 & var2);
      var10013 = (int)-7847335073319505249L;
      var2 = -823934166;
      var1 = var10013;
      var10013 = var1 & ~var2 | ~var1 & var2;
      var2 = 665874867;
      var1 = var10013;
      var10013 = var1 & ~var2 | ~var1 & var2;
      int var10012 = (int)272690722213004061L;
      var2 = 538817625;
      var1 = var10012;
      var10012 = (var1 | var2) - (var1 & var2);
      var2 = 2135065073;
      var1 = var10012;
      var974[var10006] = c(
         "\uee62г‚‡\uee45г“§\uee3eгѓі\uee4dг‚‡\uee48",
         "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ",
         var10009,
         var10010,
         var10011,
         (var1 | var2) - (var1 & var2)
      );
      var10006 = (int)-5994845532256522913L;
      var2 = -1282105442;
      var1 = var10006;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var2 = -1390955840;
      var1 = var10006;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var10007 = (int)-7107345235070578609L;
      var2 = -1559024350;
      var1 = var10007;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      var2 = -2026660291;
      var1 = var10007;
      var10007 = ((var1 | var2) & (~var1 | ~var2)) * ((var1 | var2) & (~var1 | ~var2));
      var10008 = (int)7545604202141483340L;
      var2 = 672884006;
      var1 = var10008;
      var10008 = (var1 | var2) - (var1 & var2);
      var2 = 769263826;
      var1 = var10008;
      var10008 = (var1 + var2 - 2 * (var1 & var2)) * (var1 + var2 - 2 * (var1 & var2));
      String var1608 = "dca";
      var2 = -9313835;
      var1 = -1292636678;
      var10009 = (var1 | var2) & (~var1 | ~var2);
      var2 = 617276448;
      var1 = var10009;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var2 = -1018424467;
      var1 = 456106056;
      var10010 = var1 & ~var2 | ~var1 & var2;
      var2 = 1981584578;
      var1 = var10010;
      var10010 = (var1 | var2) - (var1 & var2);
      var10011 = (int)592724114720034231L;
      var2 = 873529656;
      var1 = var10011;
      var10011 = (var1 | var2) - (var1 & var2);
      var2 = 1727870705;
      var1 = var10011;
      var2 = (var1 | var2) - (var1 & var2);
      var1 = var10010;
      var10010 = (var1 | var2) + (var1 & var2);
      var2 = 1738660901;
      var1 = -1040248201;
      var10010 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1944886079;
      var1 = var10010;
      var10010 = (var1 | var2) - (var1 & var2);
      var10011 = (int)3709035444904770660L;
      var2 = 1180425191;
      var1 = var10011;
      var10011 = (var1 | var2) & ~(var1 & var2);
      var2 = -462833662;
      var1 = var10011;
      var10011 = (var1 + var2 - 2 * (var1 & var2)) * (var1 + var2 - 2 * (var1 & var2));
      var10011 = (int)-4449897542080740939L;
      var2 = 801728679;
      var1 = var10011;
      var10011 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1065476519;
      var1 = var10011;
      var10011 = var1 & ~var2 | ~var1 & var2;
      var2 = -2066365023;
      var1 = -378175551;
      var10012 = (var1 | var2) & ~(var1 & var2);
      var2 = 1975544293;
      var1 = var10012;
      var10012 = (var1 | var2) & ~(var1 & var2);
      var2 = -667859553;
      var1 = -309789544;
      var10013 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1326442823;
      var1 = var10013;
      var2 = var1 + var2 - 2 * (var1 & var2);
      var1 = var10012;
      var10012 = var1 - ~var2 - 1;
      var10012 = (int)6788575958220085120L;
      var2 = -308024355;
      var1 = var10012;
      var10012 = var1 & ~var2 | ~var1 & var2;
      var2 = 903845553;
      var1 = var10012;
      var974[var10006] = c(
         "\uee62жіћ\uee45жўѕ\uee3cжІЈ\uee43жіџ\uee48жўѕ\uee3fжІ \uee3fжІ«\uee41жІ®",
         "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ",
         var10009,
         var10010,
         var10011,
         var1 & ~var2 | ~var1 & var2
      );
      var2 = -434923738;
      var1 = -717228511;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var2 = 858546438;
      var1 = var10005;
      int[] var1047 = new int[var1 + var2 - 2 * (var1 & var2)];
      var2 = -1826588775;
      var1 = 918928585;
      var10007 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1511666864;
      var1 = var10007;
      var10007 = (var1 | var2) - (var1 & var2);
      var2 = 1867035968;
      var1 = -1212699977;
      var10008 = var1 & ~var2 | ~var1 & var2;
      var2 = -654368777;
      var1 = var10008;
      var1047[var10007] = (var1 | var2) & ~(var1 & var2);
      this.e = new ModeSetting(var925, var974, var1047);
      var2 = -2095637573;
      var1 = 575741754;
      var10003 = var1 + var2 - 2 * (var1 & var2);
      var2 = 471545212;
      var1 = var10003;
      var10003 = (var1 & ~var2 | ~var1 & var2) * (var1 & ~var2 | ~var1 & var2);
      var2 = 231447605;
      var1 = -2099187512;
      var10004 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1866260184;
      var1 = var10004;
      var10004 = var1 + var2 - 2 * (var1 & var2);
      var2 = 326312796;
      var1 = -1097641335;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var2 = 2005711670;
      var1 = var10005;
      var2 = var1 + var2 - 2 * (var1 & var2);
      var1 = var10004;
      var10004 = (var1 | var2) + (var1 & var2);
      var2 = -410037852;
      var1 = 1451557997;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var2 = 94187416;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var10006 = (int)3532997992830416109L;
      var2 = 241300523;
      var1 = var10006;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var2 = -232254567;
      var1 = var10006;
      var2 = var1 & ~var2 | ~var1 & var2;
      var1 = var10005;
      var10005 = (var1 | var2) + (var1 & var2);
      var2 = -1897338861;
      var1 = 1411651238;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var2 = -1283189062;
      var1 = var10005;
      var10005 = (var1 | var2) - (var1 & var2);
      var10006 = (int)8724475709913994373L;
      var2 = -130348458;
      var1 = var10006;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var2 = -416661921;
      var1 = var10006;
      var10006 = (var1 & ~var2 | ~var1 & var2) * (var1 & ~var2 | ~var1 & var2);
      var2 = 1808488710;
      var1 = -1409057406;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var2 = 308497513;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var10007 = (int)-2358580701594972711L;
      var2 = 1046993824;
      var1 = var10007;
      var10007 = (var1 | var2) - (var1 & var2);
      var2 = 1385997631;
      var1 = var10007;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1684610842;
      var1 = 1257302366;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var2 = -626737333;
      var1 = var10007;
      var10007 = (var1 | var2) & (~var1 | ~var2);
      String var1463 = "dcb";
      var10008 = (int)2378293386911846244L;
      var2 = 136153948;
      var1 = var10008;
      var10008 = var1 & ~var2 | ~var1 & var2;
      var2 = 445872724;
      var1 = var10008;
      String var928 = c(
         "\uee65з Ј\uee49з ¦\uee4fз ¦\uee49зЎќ\uee4dз Ґ\uee31з Ј\uee36з «\uea5dз Ј\uee4dзЎџ\uee3fзЎћ\uee43з §\uee47з ¦",
         "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ",
         var10005,
         var10006,
         var10007,
         var1 + var2 - 2 * (var1 & var2)
      );
      var10004 = (int)1402155378352712598L;
      var2 = 637290973;
      var1 = var10004;
      var10004 = var1 + var2 - 2 * (var1 & var2);
      var2 = 459383371;
      var1 = var10004;
      this.f = new BooleanSetting(var928, pulse.Bool.from(var1 + var2 - 2 * (var1 & var2)));
      var2 = 889643553;
      var1 = 148796442;
      var10003 = (var1 | var2) & ~(var1 & var2);
      var2 = -174210712;
      var1 = var10003;
      var10003 = var1 + var2 - 2 * (var1 & var2);
      var10004 = (int)449330482566157140L;
      var2 = -1594324141;
      var1 = var10004;
      var10004 = var1 & ~var2 | ~var1 & var2;
      var2 = 1430126846;
      var1 = var10004;
      var2 = var1 & ~var2 | ~var1 & var2;
      var1 = var10003;
      var10003 = 2 * (var1 | var2) - (var1 ^ var2);
      String var982 = "dcc";
      var2 = 1318026857;
      var1 = 541225136;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1924221236;
      var1 = var10005;
      var10005 = (var1 | var2) - (var1 & var2);
      var2 = -140928757;
      var1 = 1897988579;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var2 = -269455129;
      var1 = var10005;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var2 = 466814801;
      var1 = 1748811959;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var2 = 1945094114;
      var1 = var10007;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      var10006 = (int)-7569047026024164246L;
      var2 = -2022486163;
      var1 = var10006;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var2 = 1195194954;
      var1 = var10006;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var2 = 1701217954;
      var1 = 1168514346;
      var10008 = var1 + var2 - 2 * (var1 & var2);
      var2 = 549493658;
      var1 = var10008;
      var10008 = (var1 | var2) - (var1 & var2);
      var10008 = (int)-6922637587476563828L;
      var2 = 1024781233;
      var1 = var10008;
      var10008 = (var1 | var2) & ~(var1 & var2);
      var2 = -2069507277;
      var1 = var10008;
      var10008 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1360907079;
      var1 = -704766762;
      var10007 = (var1 | var2) - (var1 & var2);
      var2 = 1916845594;
      var1 = var10007;
      var10007 = (var1 | var2) - (var1 & var2);
      var10009 = (int)-2848016937890522842L;
      var2 = -697428464;
      var1 = var10009;
      var10009 = (var1 | var2) - (var1 & var2);
      var2 = -523022536;
      var1 = var10009;
      var10009 = (var1 | var2) - (var1 & var2);
      var2 = 1181679980;
      var1 = -270192767;
      var10009 = (var1 | var2) & ~(var1 & var2);
      var2 = -1450561817;
      var1 = var10009;
      var10009 = (var1 | var2) & ~(var1 & var2);
      var10009 = (int)4656897607298309140L;
      var2 = -1064509087;
      var1 = var10009;
      var10009 = (var1 | var2) - (var1 & var2);
      var2 = -1762837129;
      var1 = var10009;
      var10009 = (var1 | var2) & ~(var1 & var2);
      var10008 = (int)-8813036771011505520L;
      var2 = -254949500;
      var1 = var10008;
      var10008 = var1 & ~var2 | ~var1 & var2;
      var2 = -7887912;
      var1 = var10008;
      this.g = new SettingGroup(
            c(
               "\uee63г‚Џ\uee34г‚†\uee48г’ћ\uee40г‚Ћ\uee3cгѓј\uee3dг‚Ђ\uee44г‚„\uee45",
               "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ",
               var10005,
               var10006,
               var10007,
               (var1 | var2) & (~var1 | ~var2)
            )
         )
         .a(() -> {
            int var9x;
            if (this.f.a()) {
               int var2x = 1829565919;
               int var1x = 1769821779;
               var9x = (var1x | var2x) & ~(var1x & var2x);
               var2x = 74556300;
               var1x = var9x;
               var9x = var1x & ~var2x | ~var1x & var2x;
            } else {
               int var7x = -349189568;
               int var4x = -881598034;
               var9x = (var4x | var7x) & ~(var4x & var7x);
               var7x = 542911471;
               var4x = var9x;
               var9x = var4x & ~var7x | ~var4x & var7x;
            }

            return Boolean.valueOf(pulse.Bool.from(var9x));
         });
      String var932 = "dcd";
      var2 = -911558593;
      var1 = -1899060453;
      var10004 = (var1 | var2) & ~(var1 & var2);
      var2 = 694515084;
      var1 = var10004;
      var10004 = ((var1 | var2) & (~var1 | ~var2)) * ((var1 | var2) & (~var1 | ~var2));
      var2 = -1295354697;
      var1 = 790766057;
      var10005 = (var1 | var2) - (var1 & var2);
      var2 = -1757891786;
      var1 = var10005;
      var10005 = (var1 + var2 - 2 * (var1 & var2)) * (var1 + var2 - 2 * (var1 & var2));
      var10005 = (int)2349744780664450733L;
      var2 = 482174058;
      var1 = var10005;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1046437176;
      var1 = var10005;
      var10005 = (var1 | var2) - (var1 & var2);
      var2 = 179489838;
      var1 = -1610030158;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1430638706;
      var1 = var10007;
      var10007 = (var1 | var2) & (~var1 | ~var2);
      var10007 = (int)-7341943289744319829L;
      var2 = -728857904;
      var1 = var10007;
      var10007 = (var1 | var2) - (var1 & var2);
      var2 = -113993616;
      var1 = var10007;
      var10007 = (var1 | var2) & ~(var1 & var2);
      var10006 = (int)-3296699090640067264L;
      var2 = -1411973532;
      var1 = var10006;
      var10006 = (var1 | var2) - (var1 & var2);
      var2 = -1256301906;
      var1 = var10006;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      String var1337 = "dce";
      var2 = 2035746541;
      var1 = 2067541666;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var2 = 187417525;
      var1 = var10007;
      var10007 = (var1 | var2) & (~var1 | ~var2);
      var2 = -70719046;
      var1 = -351498;
      var10008 = (var1 | var2) & ~(var1 & var2);
      var2 = 40211679;
      var1 = var10008;
      var10008 = (var1 | var2) - (var1 & var2);
      var2 = 953325654;
      var1 = -1773076736;
      var10008 = (var1 | var2) & ~(var1 & var2);
      var2 = -1365348257;
      var1 = var10008;
      String var933 = c(
         "\uee5fб…ѓ\uee42б•›\uee3aб…‹\uee3cб„№\uee45б„Ѕ",
         "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ",
         var10005,
         var10006,
         var10007,
         (var1 | var2) & ~(var1 & var2)
      );
      var10004 = (int)-5270791549571065329L;
      var2 = 1518187421;
      var1 = var10004;
      var10004 = var1 & ~var2 | ~var1 & var2;
      var2 = -1462621804;
      var1 = var10004;
      String[] var987 = new String[var1 & ~var2 | ~var1 & var2];
      var2 = -949641794;
      var1 = -1656393355;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1512107211;
      var1 = var10006;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var2 = 1694316900;
      var1 = -1268461400;
      var10007 = (var1 | var2) & (~var1 | ~var2);
      var2 = -2109600569;
      var1 = var10007;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var10008 = (int)-1018482671102755452L;
      var2 = 528134484;
      var1 = var10008;
      var10008 = var1 & ~var2 | ~var1 & var2;
      var2 = 1651250204;
      var1 = var10008;
      var10008 = (var1 & ~var2 | ~var1 & var2) * (var1 & ~var2 | ~var1 & var2);
      var2 = -2109905135;
      var1 = 837261381;
      var10010 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1277493422;
      var1 = var10010;
      var10010 = (var1 | var2) - (var1 & var2);
      var2 = -1259698018;
      var1 = 489060473;
      var10010 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1446186784;
      var1 = var10010;
      var10010 = (var1 | var2) - (var1 & var2);
      var2 = -1410914040;
      var1 = -2092727780;
      var10010 = (var1 | var2) & ~(var1 & var2);
      var2 = 681880337;
      var1 = var10010;
      var10010 = (var1 | var2) & ~(var1 & var2);
      var2 = -666167925;
      var1 = 885819984;
      var10009 = var1 + var2 - 2 * (var1 & var2);
      var2 = -2050000940;
      var1 = var10009;
      var10009 = (var1 | var2) & ~(var1 & var2);
      var2 = -1483752279;
      var1 = -23970205;
      var10010 = var1 & ~var2 | ~var1 & var2;
      var2 = 2134349788;
      var1 = var10010;
      var10010 = ((var1 | var2) & ~(var1 & var2)) * ((var1 | var2) & ~(var1 & var2));
      var2 = -405156330;
      var1 = -1664689682;
      var10010 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1362993319;
      var1 = var10010;
      var10010 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1269452246;
      var1 = -1273167863;
      var10011 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1997884933;
      var1 = var10011;
      var10011 = (var1 | var2) - (var1 & var2);
      var2 = -421515227;
      var1 = -1466549175;
      var10012 = var1 + var2 - 2 * (var1 & var2);
      var2 = 578954844;
      var1 = var10012;
      var2 = (var1 | var2) & ~(var1 & var2);
      var1 = var10011;
      var10011 = (var1 | var2) + (var1 & var2);
      var2 = 1815789199;
      var1 = 1799796428;
      var10011 = var1 & ~var2 | ~var1 & var2;
      var2 = 435997562;
      var1 = var10011;
      var10011 = var1 & ~var2 | ~var1 & var2;
      var2 = -1868270528;
      var1 = -352679448;
      var10012 = (var1 | var2) & ~(var1 & var2);
      var2 = -1242130531;
      var1 = var10012;
      var10012 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1889533710;
      var1 = -976343660;
      var10012 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1251504966;
      var1 = var10012;
      var987[var10006] = c(
         "\uee5cеЎ§\uee3dеЎ¦\uee3bеЎ§", "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ", var10009, var10010, var10011, var1 + var2 - 2 * (var1 & var2)
      );
      var2 = -1319544432;
      var1 = -1029776357;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var2 = 1942455690;
      var1 = var10006;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      String var1342 = "dcf";
      var10008 = (int)-8123940262214444751L;
      var2 = 108025998;
      var1 = var10008;
      var10008 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1005054686;
      var1 = var10008;
      var10008 = (var1 | var2) & ~(var1 & var2);
      var2 = -475815125;
      var1 = -121725567;
      var10009 = (var1 | var2) - (var1 & var2);
      var2 = -334960066;
      var1 = var10009;
      var2 = (var1 | var2) & (~var1 | ~var2);
      var1 = var10008;
      var10008 = (var1 & ~var2) + (var2 & ~var1) + 2 * (var1 & var2);
      var2 = -1400938018;
      var1 = -1408473149;
      var10009 = var1 + var2 - 2 * (var1 & var2);
      var2 = 431812871;
      var1 = var10009;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var10009 = (int)-1132119174470465587L;
      var2 = -1859711993;
      var1 = var10009;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var2 = 304636869;
      var1 = var10009;
      var10009 = (var1 | var2) & (~var1 | ~var2);
      var10010 = (int)-7914702246785060809L;
      var2 = 116644470;
      var1 = var10010;
      var10010 = var1 & ~var2 | ~var1 & var2;
      var2 = 564773737;
      var1 = var10010;
      var10010 = (var1 | var2) & (~var1 | ~var2);
      var10010 = (int)-1618809035159021231L;
      var2 = 748597337;
      var1 = var10010;
      var10010 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1660208468;
      var1 = var10010;
      var10010 = var1 & ~var2 | ~var1 & var2;
      var10011 = (int)3805428481993830816L;
      var2 = -89448571;
      var1 = var10011;
      var10011 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1886902930;
      var1 = var10011;
      var10011 = (var1 | var2) & (~var1 | ~var2);
      var10011 = (int)-9078479084666738652L;
      var2 = 1907694086;
      var1 = var10011;
      var10011 = (var1 | var2) - (var1 & var2);
      var2 = 885520381;
      var1 = var10011;
      var10011 = (var1 | var2) & ~(var1 & var2);
      var10012 = (int)-9074485901090819805L;
      var2 = 2026176346;
      var1 = var10012;
      var10012 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1107112029;
      var1 = var10012;
      var10012 = var1 & ~var2 | ~var1 & var2;
      var2 = 1730548244;
      var1 = 984504155;
      var10013 = var1 + var2 - 2 * (var1 & var2);
      var2 = -413357829;
      var1 = var10013;
      var2 = (var1 | var2) - (var1 & var2);
      var1 = var10012;
      var10012 = (var1 & ~var2) + (var2 & ~var1) + 2 * (var1 & var2);
      var2 = 197567013;
      var1 = -762808901;
      var10012 = var1 & ~var2 | ~var1 & var2;
      var2 = -649773379;
      var1 = var10012;
      var987[var10006] = c(
         "\uee65\uef10\uee47\uef11\uee4d",
         "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ",
         var10009,
         var10010,
         var10011,
         (var1 | var2) & (~var1 | ~var2)
      );
      var2 = 142449361;
      var1 = -1186540177;
      var10006 = (var1 | var2) - (var1 & var2);
      var2 = -1321513028;
      var1 = var10006;
      var10006 = (var1 | var2) - (var1 & var2);
      String var1343 = "dcg";
      String var1483 = "dch";
      var10009 = (int)1854932990983282568L;
      var2 = -1883498429;
      var1 = var10009;
      var10009 = (var1 | var2) & ~(var1 & var2);
      var2 = 719367658;
      var1 = var10009;
      var10009 = (var1 | var2) - (var1 & var2);
      var2 = -1898833863;
      var1 = 712758435;
      var10009 = (var1 | var2) & ~(var1 & var2);
      var2 = -840883051;
      var1 = var10009;
      var10009 = (var1 | var2) & (~var1 | ~var2);
      var2 = -514797667;
      var1 = -1359093148;
      var10011 = (var1 | var2) & ~(var1 & var2);
      var2 = 1336749561;
      var1 = var10011;
      var10011 = (var1 | var2) & ~(var1 & var2);
      var10010 = (int)8958069102647284654L;
      var2 = 2093668616;
      var1 = var10010;
      var10010 = (var1 | var2) & ~(var1 & var2);
      var2 = -1179212563;
      var1 = var10010;
      var10010 = var1 & ~var2 | ~var1 & var2;
      var2 = 546896747;
      var1 = -72676489;
      var10011 = (var1 | var2) & ~(var1 & var2);
      var2 = -1673316089;
      var1 = var10011;
      var10011 = var1 & ~var2 | ~var1 & var2;
      var2 = -390397153;
      var1 = 1205489195;
      var10012 = (var1 | var2) & (~var1 | ~var2);
      var2 = 952434366;
      var1 = var10012;
      var2 = (var1 | var2) - (var1 & var2);
      var1 = var10011;
      var10011 = (var1 | var2) + (var1 & var2);
      var2 = 1333456763;
      var1 = 2103117100;
      var10011 = (var1 | var2) - (var1 & var2);
      var2 = 957290505;
      var1 = var10011;
      var10011 = var1 & ~var2 | ~var1 & var2;
      String var2003 = "dci";
      var2 = 1006717406;
      var1 = 42004524;
      var10012 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1051114040;
      var1 = var10012;
      var987[var10006] = c(
         "\uee5cЦ…\uee48ЦЋ\uee45Ц…\uee47Ц€",
         "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ",
         var10009,
         var10010,
         var10011,
         (var1 | var2) & (~var1 | ~var2)
      );
      var2 = 1832976877;
      var1 = -1232990573;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var2 = -607973507;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var10008 = (int)-5164800669709726093L;
      var2 = 605860466;
      var1 = var10008;
      var10008 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1638122488;
      var1 = var10008;
      var10008 = (var1 | var2) - (var1 & var2);
      var2 = -1630769896;
      var1 = -1035502487;
      var10008 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1552617855;
      var1 = var10008;
      var10008 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1786966400;
      var1 = -1570723188;
      var10009 = var1 + var2 - 2 * (var1 & var2);
      var2 = -924689656;
      var1 = var10009;
      var10009 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1514724818;
      var1 = -745306379;
      var10009 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1982112981;
      var1 = var10009;
      var10009 = (var1 | var2) - (var1 & var2);
      var10009 = (int)-5890885938947591614L;
      var2 = 619547884;
      var1 = var10009;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var2 = 4390561;
      var1 = var10009;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var2 = 1535421940;
      var1 = 1677877585;
      var10009 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1065798823;
      var1 = var10009;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var10009 = (int)-4633928904106447322L;
      var2 = -1797190950;
      var1 = var10009;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var2 = -697695426;
      var1 = var10009;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var10010 = (int)5580179819798130390L;
      var2 = 1747137541;
      var1 = var10010;
      var10010 = (var1 | var2) & ~(var1 & var2);
      var2 = 1251123397;
      var1 = var10010;
      var2 = (var1 | var2) & ~(var1 & var2);
      var1 = var10009;
      var10009 = (var1 & ~var2) + (var2 & ~var1) + 2 * (var1 & var2);
      var10009 = (int)1539983917377094974L;
      var2 = 1998939112;
      var1 = var10009;
      var10009 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1384247591;
      var1 = var10009;
      var10009 = (var1 | var2) & ~(var1 & var2);
      var10010 = (int)-1319663008825153863L;
      var2 = 1585019587;
      var1 = var10010;
      var10010 = (var1 | var2) - (var1 & var2);
      var2 = -2037407204;
      var1 = var10010;
      var10010 = var1 & ~var2 | ~var1 & var2;
      var2 = -1016672272;
      var1 = 344332089;
      var10010 = (var1 | var2) & ~(var1 & var2);
      var2 = 34748504;
      var1 = var10010;
      var10010 = var1 & ~var2 | ~var1 & var2;
      var2 = -1494780533;
      var1 = 1755522398;
      var10011 = (var1 | var2) & (~var1 | ~var2);
      var2 = 2059393673;
      var1 = var10011;
      var10011 = (var1 | var2) & (~var1 | ~var2);
      var2 = 735735000;
      var1 = -1833248853;
      var10012 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1431611050;
      var1 = var10012;
      var2 = var1 & ~var2 | ~var1 & var2;
      var1 = var10011;
      var10011 = (var1 & ~var2) + (var2 & ~var1) + 2 * (var1 & var2);
      var2 = -25528623;
      var1 = -489534350;
      var10011 = (var1 | var2) & (~var1 | ~var2);
      var2 = 111957927;
      var1 = var10011;
      var10011 = var1 & ~var2 | ~var1 & var2;
      var10013 = (int)5160252647268614325L;
      var2 = 1599561678;
      var1 = var10013;
      var10013 = (var1 | var2) - (var1 & var2);
      var2 = 417357675;
      var1 = var10013;
      var10013 = var1 & ~var2 | ~var1 & var2;
      var2 = -562155832;
      var1 = 56481712;
      var10013 = (var1 | var2) & ~(var1 & var2);
      var2 = -584844949;
      var1 = var10013;
      var10013 = var1 + var2 - 2 * (var1 & var2);
      var10012 = (int)1941166985217281813L;
      var2 = 968132699;
      var1 = var10012;
      var10012 = var1 & ~var2 | ~var1 & var2;
      var2 = -1570180770;
      var1 = var10012;
      var987[var10006] = c(
         "\uee5c\uf05a\uee32\uf05f\uee45\uf057",
         "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ",
         var10009,
         var10010,
         var10011,
         (var1 | var2) & ~(var1 & var2)
      );
      var10006 = (int)2439015615248762612L;
      var2 = 883269014;
      var1 = var10006;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var2 = -1607656602;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var10007 = (int)5779537578698138826L;
      var2 = -1814829861;
      var1 = var10007;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      var2 = 905396617;
      var1 = var10007;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      String var1489 = "dcj";
      var10009 = (int)-1897064483969428096L;
      var2 = 1611970794;
      var1 = var10009;
      var10009 = (var1 | var2) - (var1 & var2);
      var2 = 969115517;
      var1 = var10009;
      var10009 = (var1 | var2) - (var1 & var2);
      var2 = -1963383348;
      var1 = 1398238359;
      var10010 = (var1 | var2) - (var1 & var2);
      var2 = -1783191483;
      var1 = var10010;
      var2 = (var1 | var2) - (var1 & var2);
      var1 = var10009;
      var10009 = 2 * (var1 | var2) - (var1 ^ var2);
      var2 = -101449633;
      var1 = 457347479;
      var10009 = (var1 | var2) - (var1 & var2);
      var2 = -1946256953;
      var1 = var10009;
      var10009 = (var1 | var2) & ~(var1 & var2);
      String var1776 = "dck";
      var10010 = (int)2521391833174846625L;
      var2 = 117491423;
      var1 = var10010;
      var10010 = (var1 | var2) & ~(var1 & var2);
      var2 = -1188760920;
      var1 = var10010;
      var10010 = (var1 | var2) & ~(var1 & var2);
      var2 = -1176420522;
      var1 = -1362865286;
      var10011 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1133372486;
      var1 = var10011;
      var10011 = (var1 + var2 - 2 * (var1 & var2)) * (var1 + var2 - 2 * (var1 & var2));
      var2 = -708633484;
      var1 = 1916731859;
      var10011 = (var1 | var2) - (var1 & var2);
      var2 = -1209079325;
      var1 = var10011;
      var10011 = (var1 | var2) & ~(var1 & var2);
      var10012 = (int)-3147548568848717209L;
      var2 = -67849907;
      var1 = var10012;
      var10012 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1722710377;
      var1 = var10012;
      var10012 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1946994926;
      var1 = 1954985980;
      var10012 = (var1 | var2) & ~(var1 & var2);
      var2 = 10506567;
      var1 = var10012;
      var987[var10006] = c(
         "\uee6aв •\uee48в ђ\uee49в —", "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ", var10009, var10010, var10011, (var1 | var2) & (~var1 | ~var2)
      );
      var10006 = (int)-9001260767365565781L;
      var2 = 763480195;
      var1 = var10006;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var2 = -83740115;
      var1 = var10006;
      var10006 = (var1 | var2) - (var1 & var2);
      var10007 = (int)-6933508536286328423L;
      var2 = 1097453895;
      var1 = var10007;
      var10007 = (var1 | var2) & (~var1 | ~var2);
      var2 = -924922369;
      var1 = var10007;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var10008 = (int)8491664023470111058L;
      var2 = -247848131;
      var1 = var10008;
      var10008 = var1 & ~var2 | ~var1 & var2;
      var2 = 57857222;
      var1 = var10008;
      var2 = (var1 | var2) - (var1 & var2);
      var1 = var10007;
      var10007 = (var1 ^ var2) + 2 * (var1 & var2);
      String var1492 = "dcl";
      var10009 = (int)-6702871575893972707L;
      var2 = -685652356;
      var1 = var10009;
      var10009 = (var1 | var2) & ~(var1 & var2);
      var2 = 1568778640;
      var1 = var10009;
      var10009 = (var1 | var2) & ~(var1 & var2);
      var2 = 1517723321;
      var1 = -91380418;
      var10010 = var1 & ~var2 | ~var1 & var2;
      var2 = -258096083;
      var1 = var10010;
      var2 = (var1 | var2) & ~(var1 & var2);
      var1 = var10009;
      var10009 = var1 - ~var2 - 1;
      var2 = -2122896631;
      var1 = 1604743929;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var2 = -1214664193;
      var1 = var10009;
      var10009 = (var1 | var2) - (var1 & var2);
      var2 = -2121560666;
      var1 = 1638501698;
      var10010 = (var1 | var2) - (var1 & var2);
      var2 = 656417849;
      var1 = var10010;
      var10010 = (var1 & ~var2 | ~var1 & var2) * (var1 & ~var2 | ~var1 & var2);
      var2 = 2092747688;
      var1 = 1877228894;
      var10010 = var1 & ~var2 | ~var1 & var2;
      var2 = -962428179;
      var1 = var10010;
      var10010 = (var1 | var2) - (var1 & var2);
      var10012 = (int)6369122166870135169L;
      var2 = -647279020;
      var1 = var10012;
      var10012 = (var1 | var2) - (var1 & var2);
      var2 = 1178017733;
      var1 = var10012;
      var10012 = (var1 | var2) & (~var1 | ~var2);
      var10011 = (int)1540544076245664030L;
      var2 = -1163055399;
      var1 = var10011;
      var10011 = (var1 | var2) & ~(var1 & var2);
      var2 = 1865988509;
      var1 = var10011;
      var10011 = var1 & ~var2 | ~var1 & var2;
      var10012 = (int)-1606215265489047708L;
      var2 = -971016037;
      var1 = var10012;
      var10012 = (var1 | var2) & (~var1 | ~var2);
      var2 = 464010393;
      var1 = var10012;
      var10012 = (var1 | var2) & ~(var1 & var2);
      var2 = -1920131869;
      var1 = 739444759;
      var10012 = (var1 | var2) - (var1 & var2);
      var2 = -1580360338;
      var1 = var10012;
      var987[var10006] = c(
         "\uee69иї–\uee46иї“\uee4dиѕЁ", "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ", var10009, var10010, var10011, (var1 | var2) & (~var1 | ~var2)
      );
      var2 = 1411693458;
      var1 = -15229296;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = 681352768;
      var1 = var10005;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var2 = -2021069907;
      var1 = 1715859355;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1394616629;
      var1 = var10006;
      var2 = var1 & ~var2 | ~var1 & var2;
      var1 = var10005;
      var10005 = (var1 ^ var2) + 2 * (var1 & var2);
      var2 = 22087923;
      var1 = -100563607;
      var10006 = (var1 | var2) - (var1 & var2);
      var2 = 77542298;
      var1 = var10006;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1889304906;
      var1 = -328114565;
      var10007 = (var1 | var2) & ~(var1 & var2);
      var2 = 2070131549;
      var1 = var10007;
      var10007 = (var1 + var2 - 2 * (var1 & var2)) * (var1 + var2 - 2 * (var1 & var2));
      var2 = -337387824;
      var1 = -1238630512;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      var2 = 880855375;
      var1 = var10007;
      var10007 = (var1 | var2) - (var1 & var2);
      var2 = -2055587532;
      var1 = -1377064628;
      var10008 = (var1 | var2) & ~(var1 & var2);
      var2 = 1893032610;
      var1 = var10008;
      var10008 = (var1 + var2 - 2 * (var1 & var2)) * (var1 + var2 - 2 * (var1 & var2));
      var10008 = (int)6970465641348613466L;
      var2 = -1796398904;
      var1 = var10008;
      var10008 = (var1 | var2) & ~(var1 & var2);
      var2 = -1767040233;
      var1 = var10008;
      var10008 = (var1 | var2) - (var1 & var2);
      String var1660 = "dcm";
      var2 = 1943428358;
      var1 = -1379110593;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var2 = -599962516;
      var1 = var10009;
      var10009 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1024384420;
      var1 = -1054065017;
      var10010 = (var1 | var2) - (var1 & var2);
      var2 = -1468082519;
      var1 = var10010;
      var10010 = ((var1 | var2) - (var1 & var2)) * ((var1 | var2) - (var1 & var2));
      var2 = -788790081;
      var1 = 995772330;
      var10010 = (var1 | var2) - (var1 & var2);
      var2 = -342239471;
      var1 = var10010;
      this.h = new ModeSetting(
            var933,
            var987,
            c("\uee5cй‰ѓ\uee3dй‰‚\uee3bй‰ѓ", "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ", var10007, var10008, var10009, (var1 | var2) - (var1 & var2))
         )
         .a(() -> {
            int var9x;
            if (this.f.a()) {
               int var2x = -1334710992;
               int var1x = -1140026726;
               var9x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = 209551274;
               var1x = var9x;
               var9x = var1x + var2x - 2 * (var1x & var2x);
            } else {
               int var7x = 880459103;
               int var4x = -1146963686;
               var9x = (var4x | var7x) & ~(var4x & var7x);
               var7x = -1881668540;
               var4x = var9x;
               var9x = var4x + var7x - 2 * (var4x & var7x);
            }

            return Boolean.valueOf(pulse.Bool.from(var9x));
         });
      var2 = 123628031;
      var1 = 411485070;
      var10003 = (var1 | var2) & (~var1 | ~var2);
      var2 = 297938387;
      var1 = var10003;
      var10003 = var1 + var2 - 2 * (var1 & var2);
      var10004 = (int)997532329762000848L;
      var2 = 1004016886;
      var1 = var10004;
      var10004 = var1 + var2 - 2 * (var1 & var2);
      var2 = 139331847;
      var1 = var10004;
      var2 = (var1 | var2) & (~var1 | ~var2);
      var1 = var10003;
      var10003 = 2 * (var1 | var2) - (var1 ^ var2);
      String var990 = "dcn";
      var10005 = (int)-1401754257025381308L;
      var2 = 1100411886;
      var1 = var10005;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = -1344582188;
      var1 = var10005;
      var10005 = ((var1 | var2) & ~(var1 & var2)) * ((var1 | var2) & ~(var1 & var2));
      var10005 = (int)2994992190207009541L;
      var2 = -303153527;
      var1 = var10005;
      var10005 = (var1 | var2) - (var1 & var2);
      var2 = -419596925;
      var1 = var10005;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var10006 = (int)-7907236817476668649L;
      var2 = -1759644459;
      var1 = var10006;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1078241490;
      var1 = var10006;
      var10006 = ((var1 | var2) & ~(var1 & var2)) * ((var1 | var2) & ~(var1 & var2));
      var10006 = (int)-355827231607980095L;
      var2 = 231852753;
      var1 = var10006;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var2 = 2056898742;
      var1 = var10006;
      var10006 = var1 & ~var2 | ~var1 & var2;
      String var1355 = "dco";
      var10007 = (int)-4306321219752636157L;
      var2 = 324425424;
      var1 = var10007;
      var10007 = (var1 | var2) & ~(var1 & var2);
      var2 = -2097386251;
      var1 = var10007;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var10008 = (int)-6416159089747911762L;
      var2 = -1669522640;
      var1 = var10008;
      var10008 = var1 & ~var2 | ~var1 & var2;
      var2 = -690300228;
      var1 = var10008;
      var10008 = ((var1 | var2) & (~var1 | ~var2)) * ((var1 | var2) & (~var1 | ~var2));
      var2 = -61884915;
      var1 = 808049973;
      var10008 = (var1 | var2) & ~(var1 & var2);
      var2 = -867174371;
      var1 = var10008;
      String var937 = c(
         "\uee5dй•ў\uee4bй•Ї\uee41й…·\uee39й•Ї\uee4aй•Ї\uee47й•Ї",
         "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ",
         var10005,
         var10006,
         var10007,
         (var1 | var2) - (var1 & var2)
      );
      var10004 = (int)-186037105246896179L;
      var2 = -1463102180;
      var1 = var10004;
      var10004 = (var1 | var2) & ~(var1 & var2);
      var2 = -1568822571;
      var1 = var10004;
      String[] var993 = new String[(var1 | var2) - (var1 & var2)];
      var2 = 37930354;
      var1 = -1504175943;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var2 = -1541743157;
      var1 = var10006;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var10007 = (int)1334711835699799305L;
      var2 = -1066566640;
      var1 = var10007;
      var10007 = (var1 | var2) - (var1 & var2);
      var2 = 918191185;
      var1 = var10007;
      var10007 = ((var1 | var2) - (var1 & var2)) * ((var1 | var2) - (var1 & var2));
      var2 = 255218968;
      var1 = -1836717245;
      var10008 = (var1 | var2) - (var1 & var2);
      var2 = 1292903424;
      var1 = var10008;
      var10008 = (var1 | var2) & ~(var1 & var2);
      var10009 = (int)2566471327898067181L;
      var2 = -1276841692;
      var1 = var10009;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var2 = 1622693639;
      var1 = var10009;
      var10009 = (var1 + var2 - 2 * (var1 & var2)) * (var1 + var2 - 2 * (var1 & var2));
      var10009 = (int)7860707586578789927L;
      var2 = -1858557451;
      var1 = var10009;
      var10009 = (var1 | var2) & ~(var1 & var2);
      var2 = 223311837;
      var1 = var10009;
      var10009 = (var1 | var2) & ~(var1 & var2);
      var10010 = (int)6544408728095739300L;
      var2 = -1896150464;
      var1 = var10010;
      var10010 = var1 + var2 - 2 * (var1 & var2);
      var2 = 273996904;
      var1 = var10010;
      var10010 = (var1 | var2) & ~(var1 & var2);
      var10011 = (int)-3036712003119298155L;
      var2 = 2107304242;
      var1 = var10011;
      var10011 = (var1 | var2) & ~(var1 & var2);
      var2 = -1859416672;
      var1 = var10011;
      var2 = (var1 | var2) - (var1 & var2);
      var1 = var10010;
      var10010 = (var1 | var2) + (var1 & var2);
      var10010 = (int)6678457166641278890L;
      var2 = -957801744;
      var1 = var10010;
      var10010 = (var1 | var2) - (var1 & var2);
      var2 = -1441665130;
      var1 = var10010;
      var10010 = (var1 | var2) & ~(var1 & var2);
      var2 = -579903984;
      var1 = 1645628388;
      var10011 = (var1 | var2) & (~var1 | ~var2);
      var2 = 475443375;
      var1 = var10011;
      var10011 = ((var1 | var2) - (var1 & var2)) * ((var1 | var2) - (var1 & var2));
      var10011 = (int)4831403824016994559L;
      var2 = 1561730438;
      var1 = var10011;
      var10011 = (var1 | var2) - (var1 & var2);
      var2 = 1694324597;
      var1 = var10011;
      var10011 = (var1 | var2) & ~(var1 & var2);
      var10012 = (int)5744721803298599550L;
      var2 = -853481925;
      var1 = var10012;
      var10012 = (var1 | var2) & (~var1 | ~var2);
      var2 = 72183688;
      var1 = var10012;
      var10012 = (var1 | var2) & ~(var1 & var2);
      var10013 = (int)-4331165392332525338L;
      var2 = -433792726;
      var1 = var10013;
      var10013 = var1 & ~var2 | ~var1 & var2;
      var2 = -514018814;
      var1 = var10013;
      var2 = (var1 | var2) - (var1 & var2);
      var1 = var10012;
      var10012 = (var1 | var2) + (var1 & var2);
      var10012 = (int)-6151908590873770457L;
      var2 = 1708544505;
      var1 = var10012;
      var10012 = var1 & ~var2 | ~var1 & var2;
      var2 = 1939646357;
      var1 = var10012;
      var993[var10006] = c(
         "\uee5dзЊ\uee4dз‚\uee45з™ё\uee3fзЃ\uee3aз„\uee4dз™¶",
         "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ",
         var10009,
         var10010,
         var10011,
         var1 & ~var2 | ~var1 & var2
      );
      var10006 = (int)-5840535370720833832L;
      var2 = -827464388;
      var1 = var10006;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var2 = -1799787547;
      var1 = var10006;
      var10006 = (var1 | var2) - (var1 & var2);
      var2 = 1772037755;
      var1 = -1951385215;
      var10007 = (var1 | var2) - (var1 & var2);
      var2 = 745258495;
      var1 = var10007;
      var10007 = (var1 & ~var2 | ~var1 & var2) * (var1 & ~var2 | ~var1 & var2);
      var2 = -1210003325;
      var1 = 336160852;
      var10008 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1960286511;
      var1 = var10008;
      var10008 = (var1 | var2) & ~(var1 & var2);
      var10009 = (int)-7618782704975112427L;
      var2 = -822061704;
      var1 = var10009;
      var10009 = (var1 | var2) - (var1 & var2);
      var2 = -1987325106;
      var1 = var10009;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var10010 = (int)-3259085312487070510L;
      var2 = -818810216;
      var1 = var10010;
      var10010 = (var1 | var2) & ~(var1 & var2);
      var2 = -974124511;
      var1 = var10010;
      var2 = (var1 | var2) - (var1 & var2);
      var1 = var10009;
      var10009 = (var1 & ~var2) + (var2 & ~var1) + 2 * (var1 & var2);
      var2 = 1332735247;
      var1 = -1568549586;
      var10009 = (var1 | var2) & ~(var1 & var2);
      var2 = -2069442514;
      var1 = var10009;
      var10009 = (var1 | var2) & (~var1 | ~var2);
      var2 = 861819742;
      var1 = -643179643;
      var10010 = (var1 | var2) - (var1 & var2);
      var2 = 347307468;
      var1 = var10010;
      var10010 = (var1 | var2) & ~(var1 & var2);
      var2 = 731808359;
      var1 = 1557321715;
      var10011 = (var1 | var2) & (~var1 | ~var2);
      var2 = 136579397;
      var1 = var10011;
      var2 = var1 + var2 - 2 * (var1 & var2);
      var1 = var10010;
      var10010 = var1 - ~var2 - 1;
      var2 = -1966342907;
      var1 = -418569283;
      var10010 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1206436717;
      var1 = var10010;
      var10010 = (var1 | var2) & ~(var1 & var2);
      var2 = 1950313020;
      var1 = 1833805156;
      var10011 = var1 + var2 - 2 * (var1 & var2);
      var2 = -203660800;
      var1 = var10011;
      var10011 = (var1 & ~var2 | ~var1 & var2) * (var1 & ~var2 | ~var1 & var2);
      var10011 = (int)-1445192711224110424L;
      var2 = -1040617636;
      var1 = var10011;
      var10011 = (var1 | var2) - (var1 & var2);
      var2 = 266894213;
      var1 = var10011;
      var10011 = (var1 | var2) & ~(var1 & var2);
      var10012 = (int)-1624462514927418276L;
      var2 = 1153510812;
      var1 = var10012;
      var10012 = (var1 | var2) - (var1 & var2);
      var2 = 548830000;
      var1 = var10012;
      var10012 = var1 & ~var2 | ~var1 & var2;
      var10012 = (int)-2413504027941508938L;
      var2 = 1779066027;
      var1 = var10012;
      var10012 = (var1 | var2) - (var1 & var2);
      var2 = -592249929;
      var1 = var10012;
      var993[var10006] = c(
         "\uee6c\uf1ed\uee4a\uf5f8\uee47\uf1e6\uee46\uf1e3\uee45\uf1ef\uee45\uf1e1",
         "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ",
         var10009,
         var10010,
         var10011,
         (var1 | var2) & (~var1 | ~var2)
      );
      var10006 = (int)-423046900790793551L;
      var2 = 17082232;
      var1 = var10006;
      var10006 = (var1 | var2) - (var1 & var2);
      var2 = -905163317;
      var1 = var10006;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var10007 = (int)2815683292585601231L;
      var2 = 2048330736;
      var1 = var10007;
      var10007 = (var1 | var2) - (var1 & var2);
      var2 = -769492848;
      var1 = var10007;
      var10007 = (var1 | var2) & ~(var1 & var2);
      var2 = 984715617;
      var1 = -1348872518;
      var10008 = var1 & ~var2 | ~var1 & var2;
      var2 = -1503106025;
      var1 = var10008;
      var2 = (var1 | var2) & (~var1 | ~var2);
      var1 = var10007;
      var10007 = 2 * (var1 | var2) - (var1 ^ var2);
      var2 = -1280148115;
      var1 = -14746308;
      var10008 = var1 + var2 - 2 * (var1 & var2);
      var2 = -66581762;
      var1 = var10008;
      var10008 = var1 + var2 - 2 * (var1 & var2);
      var2 = 2075531711;
      var1 = 598358645;
      var10009 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1665422758;
      var1 = var10009;
      var10009 = (var1 | var2) & ~(var1 & var2);
      var10009 = (int)287429101726433101L;
      var2 = 246235749;
      var1 = var10009;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var2 = -1519987417;
      var1 = var10009;
      var10009 = (var1 | var2) & ~(var1 & var2);
      var10010 = (int)-3044830184156522934L;
      var2 = -1002947074;
      var1 = var10010;
      var10010 = var1 & ~var2 | ~var1 & var2;
      var2 = -1019345837;
      var1 = var10010;
      var10010 = (var1 | var2) - (var1 & var2);
      var10011 = (int)-7683696964516487042L;
      var2 = -1531662341;
      var1 = var10011;
      var10011 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1692026103;
      var1 = var10011;
      var2 = (var1 | var2) & ~(var1 & var2);
      var1 = var10010;
      var10010 = (var1 & ~var2) + (var2 & ~var1) + 2 * (var1 & var2);
      var2 = 1128772044;
      var1 = 1687178267;
      var10010 = (var1 | var2) & (~var1 | ~var2);
      var2 = -234258298;
      var1 = var10010;
      var10010 = (var1 | var2) & (~var1 | ~var2);
      String var1935 = "dcp";
      var2 = 2019721543;
      var1 = 1345605974;
      var10011 = (var1 | var2) & ~(var1 & var2);
      var2 = 838564482;
      var1 = var10011;
      var10011 = (var1 | var2) & (~var1 | ~var2);
      var2 = -883546896;
      var1 = 1574378912;
      var10013 = var1 & ~var2 | ~var1 & var2;
      var2 = -1769916072;
      var1 = var10013;
      var10013 = var1 & ~var2 | ~var1 & var2;
      var2 = -426719155;
      var1 = -1415318941;
      var10013 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1295202850;
      var1 = var10013;
      var10013 = var1 & ~var2 | ~var1 & var2;
      var10012 = (int)6148703362945856387L;
      var2 = -1958014108;
      var1 = var10012;
      var10012 = (var1 | var2) & (~var1 | ~var2);
      var2 = 719303223;
      var1 = var10012;
      var993[var10006] = c(
         "\uee6cй’—\uee4aй‚‚\uee39й’љ\uee4aй’љ\uee47й’љ",
         "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ",
         var10009,
         var10010,
         var10011,
         (var1 | var2) & ~(var1 & var2)
      );
      var10006 = (int)-4473221561422813374L;
      var2 = -1765550150;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var2 = 856011003;
      var1 = var10006;
      var10006 = var1 & ~var2 | ~var1 & var2;
      String var1368 = "dcq";
      String var1509 = "dcr";
      var10009 = (int)4454208420535408244L;
      var2 = 1930376624;
      var1 = var10009;
      var10009 = (var1 & ~var2 | ~var1 & var2) ^ -681523127;
      var10009 = 1815335660 ^ -1992617046 ^ -1941952183;
      var10010 = ((int)-342237683378907243L ^ 1370869197 ^ -408321935) * ((int)-342237683378907243L ^ 1370869197 ^ -408321935);
      var10010 = (int)-5479295841479490003L ^ 1933481757 ^ -741292933;
      var10011 = (-1407847219 ^ 1224919702 ^ -1360025132) * (-1407847219 ^ 1224919702 ^ -1360025132);
      var10011 = 998110430 ^ 1453828813 ^ 2121473523;
      var10012 = (-185876146 ^ 1486274589 ^ 1928466993) * (-185876146 ^ 1486274589 ^ 1928466993);
      var993[var10006] = c(
         "\uee62жіё\uee45жіє\uee32жІЋ\uee48жІ…\uee45жІЌ",
         "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ",
         var10009,
         var10010,
         var10011,
         1958725741 ^ 1155506791 ^ 812777664
      );
      var10005 = 1296787161 ^ -1683145391 ^ 86222848;
      String var1203 = "dcs";
      var10007 = ((int)-6951904931813611164L ^ -79449980 ^ 1170869266) * ((int)-6951904931813611164L ^ -79449980 ^ 1170869266);
      var10007 = 407148664 ^ 283411180 ^ 1642656411;
      var10008 = (-95194338 ^ -1736458500 ^ 249370495) + ((int)3310359907940668742L ^ -1280776373 ^ 923177456);
      var10008 = 1744665848 ^ -1673661025 ^ 779154141;
      var10010 = (int)-5514234718808416902L ^ 1808756504 ^ 1115894379;
      var10010 = (int)8621896991566962228L ^ 422673484 ^ 157999735;
      var10010 = 1390744587 ^ -1663839962 ^ -835271362;
      var10010 = (int)-2098917852874248001L ^ 1299526683 ^ 465650856;
      var10009 = (int)-7089521927800764212L ^ 610003140 ^ 1910015736;
      String var1814 = "dct";
      this.i = new ModeSetting(
            var937,
            var993,
            c(
               "\uee5dйќѕ\uee4dйќ°\uee45йњЉ\uee3fйќі\uee3aйќ¶\uee4dйњ„",
               "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ",
               var10007,
               var10008,
               var10009,
               -1224439687 ^ -662811602 ^ 1869829486
            )
         )
         .a(() -> {
            int var10x;
            if (this.f.a()) {
               var10x = (int)-29443874346089718L;
               int var2x = -498198831;
               int var1x = var10x;
               var10x = var1x & ~var2x | ~var1x & var2x;
               var2x = 713315803;
               var1x = var10x;
               var10x = (var1x | var2x) & (~var1x | ~var2x);
            } else {
               int var7x = -331199592;
               int var4x = 2134061552;
               var10x = (var4x | var7x) - (var4x & var7x);
               var7x = -1821279639;
               var4x = var10x;
               var10x = (var4x | var7x) & (~var4x | ~var7x);
            }

            return Boolean.valueOf(pulse.Bool.from(var10x));
         });
      String var938 = "dcu";
      var10005 = (int)2821182027454367923L ^ -1033232192 ^ -1823971206;
      var10005 = (int)-2457402746208232389L ^ 1839565962 ^ -1886007112;
      var10005 = ((int)2680651311458479398L ^ 653586518 ^ -1279658005) + ((int)-4541565116678771097L ^ 2039017613 ^ 585117043);
      var10005 = -792623236 ^ 279910074 ^ -1457096247;
      var10006 = (-1902250405 ^ -1971308786 ^ 534615774) + (213231414 ^ 1801876222 ^ 170190725);
      var10006 = -63819640 ^ -323371933 ^ -985644080;
      var10008 = 1959143511 ^ -175054104 ^ -2125018445;
      var10008 = (int)-3474825743188035737L ^ -1304914205 ^ 316432768;
      var10008 = (int)-4967318323235221554L ^ 36986127 ^ -1821191475;
      var10007 = -283628998 ^ 1530185222 ^ -1202479464;
      var10009 = 512588638 ^ -795262129 ^ -837535721;
      String var939 = c(
         "\uee67\ue2f6\uee46\ue2f0\uee3a\ue2fd\uee3c\ue28a\uee4f\ue2f6",
         "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ",
         var10005,
         var10006,
         var10007,
         -1625765611 ^ 913681505 ^ -1454800434
      );
      var10004 = ((int)-1943127784841967969L ^ 34611746 ^ 1073203988) + (255176524 ^ -450489750 ^ 522095323);
      var10007 = (int)2175495066961798578L ^ -1772284338 ^ 578974716;
      this.j = new SliderSetting(var939, 4.0F, 1.0F, 20.0F, 1.0F).a(() -> {
         int var9x;
         if (this.f.a()) {
            int var2x = -1922475256;
            int var1x = 678481553;
            var9x = (var1x | var2x) & ~(var1x & var2x);
            var2x = -1525049959;
            var1x = var9x;
            var9x = var1x + var2x - 2 * (var1x & var2x);
         } else {
            int var7x = 90893248;
            int var4x = -359638363;
            var9x = var4x & ~var7x | ~var4x & var7x;
            var7x = -268783260;
            var4x = var9x;
            var9x = (var4x | var7x) & (~var4x | ~var7x);
         }

         return Boolean.valueOf(pulse.Bool.from(var9x));
      });
      var10003 = (int)-1480602765335240701L ^ -2081606843 ^ 427272414;
      var10004 = ((int)-7577151298272948217L ^ -39158505 ^ -289902625) + ((int)3511888044462739401L ^ 261160055 ^ 2050944171);
      var10005 = ((int)-3013967516454916738L ^ 2056495527 ^ -752477639) * ((int)-3013967516454916738L ^ 2056495527 ^ -752477639);
      var10005 = -761154119 ^ 1543260137 ^ -535487905;
      String var1206 = "dcv";
      var10006 = 2076373443 ^ 708683392 ^ -2075336401;
      var10007 = ((int)7085412361323330590L ^ 858943759 ^ 916738089) * ((int)7085412361323330590L ^ 858943759 ^ 916738089);
      var10007 = (int)-5533595385091013842L ^ -2016421366 ^ 1116908177;
      var10008 = (172834611 ^ 687376077 ^ -136728218) * (172834611 ^ 687376077 ^ -136728218);
      String var941 = c(
         "\uee5dм¶©\uee4aм¶Ґ\uee48м·™",
         "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ",
         var10005,
         var10006,
         var10007,
         (int)-7852207073323536939L ^ -1290504751 ^ -1331358737
      );
      var10004 = ((int)7633552079619292103L ^ 1234827243 ^ 1242037212) * ((int)7633552079619292103L ^ 1234827243 ^ 1242037212);
      var10005 = ((int)3771797760497509414L ^ 1205260641 ^ 616314869) * ((int)3771797760497509414L ^ 1205260641 ^ 616314869);
      var10006 = (1525181393 ^ 1871366336 ^ 1199454942) + (-581896716 ^ -1272060138 ^ -1436547784);
      var10007 = (int)1410961590967390763L ^ -776631693 ^ -303058688;
      this.k = new SliderSetting(var941, 0.3F, 0.1F, 0.75F, 0.05F).a(() -> {
         int var9x;
         if (this.f.a()) {
            int var2x = -1367465462;
            int var1x = -1366866121;
            var9x = (var1x | var2x) & ~(var1x & var2x);
            var2x = 16344381;
            var1x = var9x;
            var9x = var1x & ~var2x | ~var1x & var2x;
         } else {
            int var7x = -1770635200;
            int var4x = 1465048685;
            var9x = (var4x | var7x) & ~(var4x & var7x);
            var7x = -1054564820;
            var4x = var9x;
            var9x = (var4x | var7x) & (~var4x | ~var7x);
         }

         return Boolean.valueOf(pulse.Bool.from(var9x));
      });
      var10004 = 892250394 ^ -1752067579 ^ -1564525810;
      var10004 = -562329761 ^ -221113459 ^ 749311197;
      var10004 = 314663683 ^ -119732073 ^ -367236194;
      var10004 = -1054137923 ^ -684352015 ^ 371113053;
      var10005 = -1691487736 ^ 1907188827 ^ -360671678;
      var10005 = 519376514 ^ 1553826824 ^ 1114147461;
      var10005 = -2113145797 ^ -796007674 ^ 1384519469;
      var10005 = (int)-1577253853044091566L ^ 1178597936 ^ 1989095273;
      String var1084 = "dcw";
      var10005 = (int)5004350392189329982L ^ 754382801 ^ -1481228832;
      String var1209 = "dcx";
      var10006 = -407111510 ^ 674840326 ^ 442580151;
      String var1376 = "dcy";
      var10007 = (int)1577565860668178689L ^ 1868937351 ^ -1040584486;
      var10008 = ((int)2232393758229614193L ^ -483157400 ^ 442813028) * ((int)2232393758229614193L ^ -483157400 ^ 442813028);
      String var942 = c(
         "\uee6fбљЁ\uee48б›”\uee32б‹€\uee4bб›ђ\uee4aб›•\uee45",
         "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ",
         var10005,
         var10006,
         var10007,
         -1514901975 ^ 941435269 ^ -1651222730
      );
      var10004 = ((int)5262669301196360803L ^ 838972951 ^ 1625900333) * ((int)5262669301196360803L ^ 838972951 ^ 1625900333);
      var10005 = (-976113310 ^ -934702583 ^ -1139666119) + (-920884069 ^ 2054717171 ^ -889220283);
      var10006 = (-1548220635 ^ -1350487654 ^ 1671245865) + (531914171 ^ 1397723056 ^ 38647120);
      var10007 = (int)44538458207202L ^ 936709441 ^ 1084234155;
      this.l = new SliderSetting(var942, 20.0F, 10.0F, 50.0F, 5.0F).a(() -> {
         int var9x;
         if (this.f.a()) {
            int var2x = 265117829;
            int var1x = 938735085;
            var9x = var1x + var2x - 2 * (var1x & var2x);
            var2x = 943625576;
            var1x = var9x;
            var9x = (var1x | var2x) & (~var1x | ~var2x);
         } else {
            var9x = (int)-3035442698602353261L;
            int var7x = -298397794;
            int var4x = var9x;
            var9x = (var4x | var7x) & (~var4x | ~var7x);
            var7x = 1542857228;
            var4x = var9x;
            var9x = (var4x | var7x) - (var4x & var7x);
         }

         return Boolean.valueOf(pulse.Bool.from(var9x));
      });
      var10004 = -1841446983 ^ 1989529749 ^ -458723524;
      var10004 = (int)6503873993681538956L ^ 433187079 ^ 681305740;
      var10004 = (int)-5851875192267483254L ^ 17016312 ^ 1744466555;
      var10004 = (int)-8645607799996053037L ^ -688167210 ^ 1123888814;
      var10005 = ((int)-1431148251060635405L ^ 2109988385 ^ 1050805463) + ((int)176080726130982180L ^ -1678961682 ^ -1966969207);
      var10005 = 2142074835 ^ -896970429 ^ -596848993;
      var10007 = (int)-4207622185455773101L ^ 808288353 ^ 2130090531;
      var10007 = -21180755 ^ 1478444473 ^ -1499231462;
      var10006 = (int)-3355246719019445340L ^ -143447130 ^ -374961497;
      var10008 = (int)-1400001652044714167L ^ 1874233181 ^ 1398581268;
      var10008 = 1047458424 ^ 299939051 ^ 797853332;
      var10008 = -1772075487 ^ -729215108 ^ 1122584913;
      var10007 = 470959720 ^ 1204158736 ^ 1244550704;
      var10008 = (int)-8788459170688542927L ^ -1943853809 ^ -568630023;
      String var943 = c(
         "\uee5cм№®\uee46м№¦\uea5dмё–\uee4dм№Ў\uee46мё‡\uee3fм№¦",
         "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ",
         var10005,
         var10006,
         var10007,
         1844833757 ^ -1835907428 ^ -11115675
      );
      var10005 = (int)-8139513938608883142L ^ 1520175602 ^ -25398325;
      var10005 = (int)1328622708167147052L ^ 158808284 ^ 1504102137;
      var10006 = 1851793409 ^ 648612669 ^ 1221143344;
      var10006 = (936099513 ^ 1139029790 ^ -490976840) * (936099513 ^ 1139029790 ^ -490976840);
      var10008 = 1612316145 ^ -573205565 ^ -1110675933;
      var10008 = -1269866988 ^ -213181947 ^ 1191461914;
      this.m = new SliderSetting(var943, 0.3F, 0.15F, 0.35F, 0.01F).a(() -> {
         int var18x;
         if (this.f.a()) {
            if (b) {
               String var10000 = "din";
               int var4x = 276248573;
               int var3x = 276462471;
               var18x = (var3x | var4x) & ~(var3x & var4x);
               var4x = -1516090057;
               var3x = var18x;
               int var2x = var3x & ~var4x | ~var3x & var4x;
               a = var2x;
            }

            var18x = (int)-8851869402859502472L;
            int var11x = 1620348730;
            int var6x = var18x;
            var18x = (var6x | var11x) & (~var6x | ~var11x);
            var11x = 83725122;
            var6x = var18x;
            var18x = var6x + var11x - 2 * (var6x & var11x);
         } else {
            int var13x = -1037704991;
            int var8x = 2005697054;
            var18x = (var8x | var13x) & (~var8x | ~var13x);
            var13x = -1247190274;
            var8x = var18x;
            var18x = var8x + var13x - 2 * (var8x & var13x);
         }

         return Boolean.valueOf(pulse.Bool.from(var18x));
      });
      var10003 = (int)-4770785078592228550L ^ -1432636463 ^ 18073996;
      String var1006 = "dcz";
      var10006 = (int)3823588654744654915L ^ -453445154 ^ 1773940120;
      var10006 = 1397321805 ^ 1827881174 ^ 1069166738;
      var10005 = (int)-6354943465643460683L ^ 1490931571 ^ -1288400695;
      var10007 = (int)-7527865645495316681L ^ -1655976836 ^ -165067962;
      var10007 = 1689658339 ^ 1316360230 ^ 717239235;
      var10006 = (int)6760618994094039737L ^ -471956978 ^ -760319063;
      var10008 = (int)3439577460599534540L ^ -377476726 ^ -436626870;
      var10008 = (int)-289374737170013752L ^ 2134860753 ^ -818085358;
      var10007 = -185051857 ^ 476635661 ^ -457107898;
      String var1525 = "dda";
      this.n = new BooleanSetting(
            c(
               "\uee5bв»ќ\uee48вє­\uea5dв»•\uee46в»—\uee48в»’\uee3fв»џ",
               "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ",
               var10005,
               var10006,
               var10007,
               (int)3318384525436300748L ^ 72681844 ^ -155612123
            ),
            pulse.Bool.from((int)-7024453252042255851L ^ -1 ^ -1)
         )
         .a(() -> {
            int var10x;
            if (this.f.a()) {
               var10x = (int)-152563270612839970L;
               int var2x = -610282739;
               int var1x = var10x;
               var10x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = 1522942675;
               var1x = var10x;
               var10x = (var1x | var2x) & (~var1x | ~var2x);
            } else {
               var10x = (int)-4361669291645645251L;
               int var7x = 200176342;
               int var4x = var10x;
               var10x = (var4x | var7x) & (~var4x | ~var7x);
               var7x = 1616198890;
               var4x = var10x;
               var10x = (var4x | var7x) - (var4x & var7x);
            }

            return Boolean.valueOf(pulse.Bool.from(var10x));
         });
      var10004 = 723737713 ^ 1947207505 ^ 1597201203;
      var10004 = (-130423873 ^ -307362131 ^ -2113469139) + (1576831162 ^ -725148903 ^ -1023039508);
      var10005 = (286520382 ^ -771565627 ^ -288253870) * (286520382 ^ -771565627 ^ -288253870);
      var10005 = (int)3892090920537058736L ^ -1527552198 ^ -40246651;
      var10006 = (870079634 ^ -894792557 ^ 2021974178) + ((int)8636705080752590826L ^ 1434378639 ^ -1506810355);
      var10006 = 824662031 ^ -755135219 ^ 909673061;
      var10007 = ((int)7346710612005891875L ^ 1637720252 ^ 1777833988) + ((int)-754213575739622577L ^ -881248636 ^ 771622516);
      var10007 = 1334967575 ^ -1749616204 ^ -124484339;
      var10008 = ((int)-6855090697465728223L ^ -1005101474 ^ 2022349762) + ((int)-3269004226391474007L ^ -1634153400 ^ -1687511258);
      this.o = new ColorSetting(
            c(
               "\uee67жЄ¤\uee3cж«–\uee43жЄЁ\uee40ж«џ\uee44жєґ\uee3bжЄ¦\uee48ж«–",
               "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ",
               var10005,
               var10006,
               var10007,
               537252716 ^ 1501015044 ^ 2034832270
            ),
            Color.WHITE
         )
         .a(() -> {
            int var9x;
            if (!this.n.a() && !this.f.a()) {
               var9x = (int)3651841324433163301L;
               int var7x = -1367019792;
               int var4x = var9x;
               var9x = (var4x | var7x) & ~(var4x & var7x);
               var7x = -1200969004;
               var4x = var9x;
               var9x = var4x + var7x - 2 * (var4x & var7x);
            } else {
               int var2x = -594217483;
               int var1x = -1660667601;
               var9x = var1x & ~var2x | ~var1x & var2x;
               var2x = 1100008666;
               var1x = var9x;
               var9x = (var1x | var2x) & ~(var1x & var2x);
            }

            return Boolean.valueOf(pulse.Bool.from(var9x));
         });
      var10003 = 602924509 ^ -1180005698 ^ -995802715;
      var10004 = ((int)-7238898818441806330L ^ -86850947 ^ 319946093) * ((int)-7238898818441806330L ^ -86850947 ^ 319946093);
      var10005 = ((int)-8750650006409153385L ^ -1880969820 ^ 2143865173) * ((int)-8750650006409153385L ^ -1880969820 ^ 2143865173);
      var10005 = (int)2422027566103395095L ^ 1585543133 ^ 503473349;
      var10006 = ((int)4350829130450247275L ^ -307382553 ^ -1053320745) + (324072429 ^ -1414918534 ^ 653174131);
      var10006 = -613668736 ^ 1837547376 ^ 1666441240;
      String var1387 = "ddb";
      var10007 = -1464426963 ^ 1958243958 ^ -1006019638;
      var10009 = -1624713999 ^ -422899035 ^ 2044970588;
      this.p = new SettingGroup(
            c("\uee5eи¬Ў\uee4dи­•", "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ", var10005, var10006, var10007, -431102398 ^ -1923397711 ^ 1795435668)
         )
         .a(
            () -> {
               if (this.f.a()) {
                  ModeSetting var10000 = this.e;
                  int var2x = -117813903;
                  int var1x = 2024950613;
                  int var10001 = var1x & ~var2x | ~var1x & var2x;
                  var2x = 74223323;
                  var1x = var10001;
                  var10001 = (var1x | var2x) & (~var1x | ~var2x);
                  String var10002 = "dim";
                  int var10003x = (int)-2450289039016896073L;
                  var2x = -1757845560;
                  var1x = var10003x;
                  var10003x = (var1x | var2x) - (var1x & var2x);
                  var2x = 249236053;
                  var1x = var10003x;
                  var10003x = (var1x | var2x) & ~(var1x & var2x);
                  var10003x = (int)-7169771852908547723L;
                  var2x = -496408128;
                  var1x = var10003x;
                  var10003x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = 703279290;
                  var1x = var10003x;
                  var10003x = (var1x | var2x) & ~(var1x & var2x);
                  int var10005x = (int)-5798061709691939684L;
                  var2x = -1992227740;
                  var1x = var10005x;
                  var10005x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = -1186623253;
                  var1x = var10005x;
                  var10005x = (var1x | var2x) - (var1x & var2x);
                  var2x = -692557585;
                  var1x = 1109181427;
                  var10005x = var1x & ~var2x | ~var1x & var2x;
                  var2x = -1801147629;
                  var1x = var10005x;
                  var10005x = var1x & ~var2x | ~var1x & var2x;
                  int var10004x = (int)8708376750011547688L;
                  var2x = -582579197;
                  var1x = var10004x;
                  var10004x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = -2069285240;
                  var1x = var10004x;
                  var10004x = var1x + var2x - 2 * (var1x & var2x);
                  var2x = 1207742673;
                  var1x = -389697201;
                  var10005x = (var1x | var2x) - (var1x & var2x);
                  var2x = -134317807;
                  var1x = var10005x;
                  var10005x = (var1x | var2x) - (var1x & var2x);
                  var10005x = (int)-5258517066936586257L;
                  var2x = 2134846304;
                  var1x = var10005x;
                  var10005x = var1x & ~var2x | ~var1x & var2x;
                  var2x = -1065168521;
                  var1x = var10005x;
                  var10005x = (var1x | var2x) - (var1x & var2x);
                  int var10006x = (int)4156928505340076370L;
                  var2x = -21031490;
                  var1x = var10006x;
                  var10006x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = 1971465383;
                  var1x = var10006x;
                  var10006x = (var1x & ~var2x | ~var1x & var2x) * (var1x & ~var2x | ~var1x & var2x);
                  var2x = 364010227;
                  var1x = 863466989;
                  var10006x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = 652532834;
                  var1x = var10006x;
                  if (var10000.b(
                     c(
                        "лЊ€к ¤лЊЇк±„лЌ”кЎђлЊ§к ¤лЊў",
                        "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ",
                        var10003x,
                        var10004x,
                        var10005x,
                        (var1x | var2x) & ~(var1x & var2x)
                     )
                  )) {
                     var2x = -422632330;
                     var1x = 30614031;
                     int var52x = var1x + var2x - 2 * (var1x & var2x);
                     var2x = -417593736;
                     var1x = var52x;
                     return Boolean.valueOf(pulse.Bool.from((var1x | var2x) & ~(var1x & var2x)));
                  }
               }

               int var49x = (int)-3099884441101106086L;
               int var45x = 1982829745;
               int var22x = var49x;
               var49x = (var22x | var45x) - (var22x & var45x);
               var45x = 625414379;
               var22x = var49x;
               return Boolean.valueOf(pulse.Bool.from((var22x | var45x) - (var22x & var45x)));
            }
         );
      var10003 = (-368786285 ^ -1338163228 ^ -584763095) + ((int)-4171964202183596468L ^ -1560137203 ^ -716279892);
      var10004 = ((int)7496561262288126946L ^ -456591430 ^ -1589856028) * ((int)7496561262288126946L ^ -456591430 ^ -1589856028);
      var10006 = (int)5642847250586674548L ^ -784727910 ^ -1271388693;
      var10006 = (int)-3267192035248573618L ^ 2835659 ^ 2116990870;
      var10006 = -1696888603 ^ 2058501162 ^ -529943350;
      var10006 = (int)4551356275836239738L ^ -1326530046 ^ -2087158416;
      var10005 = 1391235296 ^ 343729158 ^ 802725097;
      var10006 = (-666881872 ^ 610847661 ^ 1696355633) + ((int)-1066086952278601305L ^ 1241074436 ^ -1573958339);
      var10006 = (int)1862375740076156139L ^ -640738768 ^ 1167180870;
      var10007 = ((int)-7376256919342799603L ^ -27733428 ^ -418317945) + (817102310 ^ 328662806 ^ 2103487654);
      var10007 = (int)4358442490249282328L ^ 785956986 ^ 1873317880;
      var10008 = (-1102296989 ^ -242551522 ^ 1477727713) + ((int)-2249903059210330474L ^ -1702318106 ^ -1757304611);
      String var947 = c(
         "\uee5fн™–\uee42н‰Ћ\uee3aн™ћ\uee3cн¬\uee45нЁ",
         "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ",
         var10005,
         var10006,
         var10007,
         (int)-5370212697442582243L ^ -284502510 ^ -142571757
      );
      String[] var1011 = new String[(int)196667252321159688L ^ 946120106 ^ -907366492];
      var10006 = (int)6195419491331625269L ^ -1648068983 ^ 1117661116;
      String var1391 = "ddc";
      var10008 = ((int)-5279456336587489693L ^ -2073028531 ^ 2128436421) * ((int)-5279456336587489693L ^ -2073028531 ^ 2128436421);
      var10010 = (int)-4890753812995937908L ^ 1244146844 ^ -1907014376;
      var10010 = (int)-1208151595928874796L ^ -34761783 ^ -1271200993;
      var10009 = (int)-5898306587629011082L ^ 929703932 ^ -500928379;
      var10011 = (int)2110388463363630093L ^ -1984745042 ^ -1049881182;
      var10010 = (int)-32427573388898305L ^ 277110938 ^ -228871612;
      var10012 = -1681513978 ^ 488604689 ^ -2032556521;
      var10012 = -1877047043 ^ -622610078 ^ 1258107291;
      var10012 = -222568661 ^ 857993004 ^ -1046990846;
      var10011 = (int)4614841932883481556L ^ 1994855242 ^ -499908439;
      var10012 = ((int)8304588491473597147L ^ -1566621852 ^ -946616715) + (-900077286 ^ 1676177739 ^ 1553327621);
      var1011[var10006] = c(
         "\uee5c\uf4e7\uee3d\uf4e6\uee3b\uf4e7",
         "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ",
         var10009,
         var10010,
         var10011,
         -301409282 ^ -64630153 ^ 303299369
      );
      var10006 = 1172147374 ^ 800571104 ^ 1785344591;
      var10007 = (int)-3700511914987871701L ^ 110151992 ^ -1242559021;
      var10008 = ((int)-7041403018125554363L ^ -1222661122 ^ -955463237) + (-913847619 ^ 471781090 ^ 1503946547);
      var10009 = -260419241 ^ 520175007 ^ -1235506067;
      var10009 = (int)-2498352856095039516L ^ -493802142 ^ -83453303;
      var10011 = (int)-383200653376420856L ^ -831347190 ^ -138436078;
      var10011 = (int)7179796311714542570L ^ -174308113 ^ 2063333128;
      var10011 = (int)-7348544074863500730L ^ -1591035284 ^ -2141251552;
      var10010 = 1419324169 ^ -144349288 ^ 1983049213;
      var10011 = (-1223611986 ^ -1951068056 ^ -1323501602) + ((int)-180163841241419868L ^ -1789370410 ^ -2037109977);
      var10011 = 56329144 ^ -1148623011 ^ -1295769705;
      var10013 = (int)-7883059638317526392L ^ -1983197053 ^ -82345469;
      var10013 = (int)-7198197864931674850L ^ -863643780 ^ 960520812;
      var1011[var10006] = c(
         "\uee65лѓ\uee47лѓ™\uee4d", "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ", var10009, var10010, var10011, 185768078 ^ -1927508141 ^ -2044092106
      );
      var10006 = -1219374524 ^ -1379744392 ^ 445847358;
      var10008 = (int)-5805521480346956205L ^ 741026424 ^ -802282451;
      var10008 = -691523008 ^ 1513591892 ^ 1733786779;
      var10010 = (int)4518295452118314376L ^ 856438254 ^ 1724536943;
      var10010 = -292903973 ^ -167466475 ^ 411961823;
      var10010 = -1011418579 ^ 241134653 ^ -840329702;
      var10009 = (int)-692213259825607942L ^ 1697442979 ^ 656641622;
      String var1822 = "ddd";
      var10010 = (int)5712883856338911686L ^ 1937336251 ^ -1031520055;
      var10011 = ((int)7426773819958168351L ^ -96224522 ^ 291407699) * ((int)7426773819958168351L ^ -96224522 ^ 291407699);
      var10011 = 907399213 ^ 1539121310 ^ 1944471287;
      var10012 = ((int)-7045985808007871333L ^ -1285879628 ^ -1391938650) * ((int)-7045985808007871333L ^ -1285879628 ^ -1391938650);
      var1011[var10006] = c(
         "\uee5cг©ј\uee48г©·\uee45г©ј\uee47г©±",
         "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ",
         var10009,
         var10010,
         var10011,
         -333743923 ^ -2075376810 ^ 1751517096
      );
      var10006 = -1197511805 ^ -1233893184 ^ 250291008;
      var10007 = ((int)7041505593340736817L ^ 1686085072 ^ 1812468435) + ((int)3465190615313129364L ^ 167846879 ^ 1881012432);
      String var1532 = "dde";
      var10010 = -1090226186 ^ 1088621013 ^ -1606095;
      var10010 = (int)2307852717050019152L ^ -874653146 ^ 1517447030;
      var10009 = (int)1763883468458810388L ^ 1194935764 ^ 1692037583;
      var10010 = (int)3756299134631723896L ^ 1166953662 ^ 288193279;
      var10010 = 881711394 ^ -1744313987 ^ 2034223670;
      var10011 = 1494909967 ^ 686424048 ^ -829497468;
      var10011 = (int)-8723155366405092246L ^ -1228038949 ^ -123194822;
      var10012 = ((int)6004673664939710469L ^ 1070998448 ^ 479363818) + (-759740607 ^ -23097211 ^ -942470278);
      var1011[var10006] = c(
         "\uee5cЖў\uee32Ж§\uee45ЖЇ", "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ", var10009, var10010, var10011, -1017315470 ^ -568691638 ^ 491359440
      );
      var10006 = (int)4233165006876936709L ^ -2055571929 ^ -1141244890;
      var10008 = -518444768 ^ 367500364 ^ -184634001;
      var10008 = 1276580447 ^ 1857912803 ^ 581594559;
      String var1535 = "ddf";
      var10010 = 1031068621 ^ 1215344966 ^ 1963223680;
      var10010 = -693304205 ^ 1912892362 ^ -1532399683;
      var10010 = (int)-3875494365023075411L ^ 1922751680 ^ -245407896;
      var10010 = (int)-7173228123344047569L ^ 203618722 ^ -81884286;
      var10009 = (int)-6418000776923778405L ^ -991211364 ^ -1897575928;
      var10010 = (int)4481215967795602211L ^ -2043522561 ^ -1468655156;
      var10010 = 890267562 ^ -1773359043 ^ 1991340554;
      var10011 = ((int)-558459348447732721L ^ -1118152418 ^ -1144816486) + (1023265099 ^ -660922620 ^ 61351237);
      var10011 = (int)7356236342304520622L ^ -1496826290 ^ -922904874;
      String var2039 = "ddg";
      var1011[var10006] = c(
         "\uee6aлµњ\uee48лµ™\uee49лµћ", "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ", var10009, var10010, var10011, 367358861 ^ -1286939111 ^ -1494673784
      );
      var10006 = (int)-1655976268368334746L ^ 1803253532 ^ -468269185;
      String var1394 = "ddh";
      var10009 = (int)8801883905967843197L ^ 1903809534 ^ 1074345098;
      var10009 = (int)-1527668179327585576L ^ -344821920 ^ 1878039979;
      var10009 = (int)-3675585253223769526L ^ -1264168930 ^ 457738836;
      var10009 = (int)8522383788931104396L ^ 598643110 ^ 694660904;
      var10010 = 2116475680 ^ 1527045320 ^ 622987245;
      var10010 = 754844042 ^ 1294510242 ^ 1641457967;
      var10009 = (int)-3336785611923826555L ^ 65615618 ^ 1459914632;
      var10010 = (int)-2734378672634322073L ^ -722693645 ^ -2006261187;
      var10010 = 728460435 ^ 95106864 ^ -83750112;
      var10011 = -1875087688 ^ 1384429878 ^ -222780667;
      var10011 = (int)-3443893867836422795L ^ 1533163461 ^ 1498997736;
      var10012 = ((int)6393954081151036573L ^ 406115983 ^ -1149589326) * ((int)6393954081151036573L ^ 406115983 ^ -1149589326);
      var1011[var10006] = c(
         "\uee69еЎЋ\uee46еЎ‹\uee4dе °",
         "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ",
         var10009,
         var10010,
         var10011,
         (int)-3561648147063930362L ^ 365998286 ^ 1721265354
      );
      var10005 = (int)-8235614445374871429L ^ 379143971 ^ -303566471;
      var10006 = 940781043 ^ 124580983 ^ -376002308;
      var10007 = (-1696128615 ^ 507216450 ^ -257364397) * (-1696128615 ^ 507216450 ^ -257364397);
      var10007 = (int)-5716977328108639045L ^ 838241968 ^ -1449063932;
      var10008 = ((int)-8570024151299224342L ^ 219844881 ^ 1620076863) + (-180979294 ^ 1671265505 ^ 1924488604);
      var10008 = (int)-6417585021353486741L ^ -221807958 ^ -511780153;
      var10009 = (2079183981 ^ 965580088 ^ 879783333) * (2079183981 ^ 965580088 ^ 879783333);
      var10009 = (int)-4377960038568916785L ^ -1609984042 ^ -413807349;
      var10011 = (int)4410723351635910948L ^ -433322823 ^ 384525713;
      var10011 = (int)7566038229456364335L ^ 621306741 ^ -87179170;
      this.q = new ModeSetting(
            var947,
            var1011,
            c(
               "\uee5cд·‚\uee3dд·ѓ\uee3bд·‚",
               "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ",
               var10007,
               var10008,
               var10009,
               (int)7260684783442790305L ^ 864412991 ^ 1284483355
            )
         )
         .a(
            () -> {
               if (this.f.a()) {
                  ModeSetting var10000 = this.e;
                  String var10001 = "dij";
                  int var2x = -1710734749;
                  int var1x = 1875467317;
                  int var10003x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = -171893158;
                  var1x = var10003x;
                  var10003x = var1x & ~var2x | ~var1x & var2x;
                  var10003x = (int)8913926544833764723L;
                  var2x = -422948385;
                  var1x = var10003x;
                  var10003x = (var1x | var2x) - (var1x & var2x);
                  var2x = 209161382;
                  var1x = var10003x;
                  var10003x = (var1x | var2x) - (var1x & var2x);
                  var10003x = (int)-3918761470090494979L;
                  var2x = 2077276298;
                  var1x = var10003x;
                  var10003x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = -334232705;
                  var1x = var10003x;
                  var10003x = var1x & ~var2x | ~var1x & var2x;
                  var2x = 626124478;
                  var1x = -1655944819;
                  var10003x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = -1206014173;
                  var1x = var10003x;
                  var10003x = (var1x | var2x) - (var1x & var2x);
                  String var76x = "dik";
                  var2x = 1110610224;
                  var1x = 1149214031;
                  var10003x = var1x & ~var2x | ~var1x & var2x;
                  var2x = 1862657136;
                  var1x = var10003x;
                  var10003x = (var1x | var2x) - (var1x & var2x);
                  String var10004x = "dil";
                  var2x = 652469479;
                  var1x = -677461648;
                  int var79x = var1x + var2x - 2 * (var1x & var2x);
                  var2x = -1528101396;
                  var1x = var79x;
                  int var80x = var1x + var2x - 2 * (var1x & var2x);
                  int var10006x = (int)6990580730260553382L;
                  var2x = -1414409522;
                  var1x = var10006x;
                  var10006x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = 1534012513;
                  var1x = var10006x;
                  var10006x = (var1x | var2x) - (var1x & var2x);
                  var10006x = (int)2982769332604579545L;
                  var2x = 1269618793;
                  var1x = var10006x;
                  var10006x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = -545261897;
                  var1x = var10006x;
                  var10006x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = 664593670;
                  var1x = 1045454623;
                  var10006x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = 432847378;
                  var1x = var10006x;
                  var10006x = var1x & ~var2x | ~var1x & var2x;
                  int var10005x = (int)-8867320894199990862L;
                  var2x = -1558033748;
                  var1x = var10005x;
                  var10005x = (var1x | var2x) - (var1x & var2x);
                  var2x = 97514508;
                  var1x = var10005x;
                  var10005x = (var1x | var2x) - (var1x & var2x);
                  var10006x = (int)-8303107842900355485L;
                  var2x = -2058522297;
                  var1x = var10006x;
                  var10006x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = -727894360;
                  var1x = var10006x;
                  var10006x = var1x + var2x - 2 * (var1x & var2x);
                  var2x = 516441188;
                  var1x = 1088245623;
                  int var10007x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = -1032420179;
                  var1x = var10007x;
                  var2x = (var1x | var2x) - (var1x & var2x);
                  var1x = var10006x;
                  var10006x = 2 * (var1x | var2x) - (var1x ^ var2x);
                  var2x = 1227462320;
                  var1x = 979130910;
                  var10006x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = 1931835874;
                  var1x = var10006x;
                  if (var10000.b(
                     c("жј°г€¬жј—г™ЊжЅ¬г‰жјџг€¬жјљ", "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ", var10003x, var80x, var10005x, (var1x | var2x) & ~(var1x & var2x))
                  )) {
                     int var65x = (int)-1907033665600233661L;
                     var2x = -1287479039;
                     var1x = var65x;
                     int var66x = (var1x | var2x) & (~var1x | ~var2x);
                     var2x = -1737654717;
                     var1x = var66x;
                     return Boolean.valueOf(pulse.Bool.from(var1x + var2x - 2 * (var1x & var2x)));
                  }
               }

               int var59x = -851185998;
               int var29x = 989696724;
               int var63x = (var29x | var59x) & (~var29x | ~var59x);
               var59x = -138511258;
               var29x = var63x;
               return Boolean.valueOf(pulse.Bool.from(var29x & ~var59x | ~var29x & var59x));
            }
         );
      var10003 = ((int)6179068982707291078L ^ -1116990220 ^ -2034170156) * ((int)6179068982707291078L ^ -1116990220 ^ -2034170156);
      var10004 = (1523086861 ^ -62570690 ^ -1881911474) + ((int)-7674110990841492171L ^ 1341066301 ^ -473521850);
      var10005 = ((int)7027573825007767754L ^ -706956290 ^ 1985162427) * ((int)7027573825007767754L ^ -706956290 ^ 1985162427);
      var10005 = (int)-6952713945851369348L ^ -869950158 ^ 2113051969;
      String var1235 = "ddi";
      var10006 = (int)1698478191259066279L ^ -68177092 ^ -1360328198;
      String var1397 = "ddj";
      var10007 = (int)-4601307317430296465L ^ 1528118884 ^ -521820956;
      var10008 = (-963119006 ^ -2042476699 ^ 660595339) + ((int)-1212494790446746478L ^ -1734836924 ^ 1326748116);
      String var949 = c(
         "\uee5dгІ§\uee4bгІЄ\uee41гўІ\uee39гІЄ\uee4aгІЄ\uee47гІЄ",
         "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ",
         var10005,
         var10006,
         var10007,
         -159709585 ^ -1182021721 ^ 1340341032
      );
      String[] var1013 = new String[(int)3122070559814929164L ^ -2018089697 ^ 2127506967];
      var10006 = -873458724 ^ 184237044 ^ -1056233432;
      var10007 = 137985577 ^ -1207400221 ^ 250936971;
      var10008 = (-2078126054 ^ -492145733 ^ 1620542805) + (1824570203 ^ 1642935124 ^ 220480255);
      var10009 = -854270001 ^ 356716898 ^ -1860906819;
      var10009 = 725421500 ^ 1139784161 ^ 26893394;
      var10010 = (-538870847 ^ -672774510 ^ -2071096554) * (-538870847 ^ -672774510 ^ -2071096554);
      var10010 = (int)8304643133375619624L ^ -919308668 ^ 331398487;
      var10011 = -305950510 ^ 1460099803 ^ 2021947175;
      var10011 = -827310376 ^ -2024818358 ^ 1329736138;
      String var2041 = "ddk";
      var1013[var10006] = c(
         "\uee5dз¤Ѕ\uee4dз¤і\uee45зҐ‰\uee3fз¤°\uee3aз¤µ\uee4dзҐ‡",
         "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ",
         var10009,
         var10010,
         var10011,
         (int)-3016381866103502274L ^ -476302773 ^ 2017904399
      );
      var10006 = 1351936046 ^ 272150058 ^ 1085031941;
      var10007 = (int)5554030144864396231L ^ -1730161057 ^ -1405732777;
      var10008 = ((int)6510189567202335957L ^ -640748450 ^ -1443465114) + (-119987590 ^ -1643663909 ^ -144910319);
      String var1701 = "ddl";
      var10009 = (int)-7332642247512390207L ^ 1791940231 ^ -679036087;
      var10010 = ((int)4359860468724833064L ^ -1844275172 ^ 1996963242) * ((int)4359860468724833064L ^ -1844275172 ^ 1996963242);
      var10010 = -1622225830 ^ -24844799 ^ -1267502746;
      var10011 = ((int)7094901487950247322L ^ 1347135482 ^ -1658026377) + (-1112615881 ^ -1970295999 ^ -1826962148);
      var10011 = (int)3146084576869636120L ^ -1792089254 ^ -1798266757;
      String var2042 = "ddm";
      var1013[var10006] = c(
         "\uee6cз›»\uee4aз‹®\uee47з›°\uee46з›µ\uee45з›№\uee45з›·",
         "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ",
         var10009,
         var10010,
         var10011,
         (int)19044297239114060L ^ -395323326 ^ 328374706
      );
      var10006 = (int)5228695385777331164L ^ -519789686 ^ -1023412140;
      var10007 = (-1689859197 ^ 606520916 ^ 270884637) * (-1689859197 ^ 606520916 ^ 270884637);
      var10008 = (-1062614781 ^ -1270520773 ^ -2102978668) * (-1062614781 ^ -1270520773 ^ -2102978668);
      var10009 = (-1386555606 ^ 1904021657 ^ 1350261510) * (-1386555606 ^ 1904021657 ^ 1350261510);
      var10009 = -1113544142 ^ -951754072 ^ 330113173;
      var10010 = -1111943548 ^ 1199921220 ^ 1896343321;
      var10010 = 67510381 ^ -168968197 ^ 609630876;
      String var1961 = "ddn";
      var10011 = (int)2882822633454375994L ^ -696146310 ^ -1749012788;
      var10012 = ((int)613721614928226393L ^ -1962693631 ^ 1973266475) * ((int)613721614928226393L ^ -1962693631 ^ 1973266475);
      var1013[var10006] = c(
         "\uee6cліЋ\uee4aлЈ›\uee39ліѓ\uee4aліѓ\uee47ліѓ",
         "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ",
         var10009,
         var10010,
         var10011,
         (int)-1493998377161279397L ^ -271871454 ^ -711487248
      );
      var10006 = 310970450 ^ -499512276 ^ -256703363;
      var10008 = (int)-8482685024389211006L ^ 1828717426 ^ -1228840976;
      var10008 = (int)-7669162321822416632L ^ 424486039 ^ 1270490522;
      var10008 = (int)3887887926700327395L ^ 2089207366 ^ 1663338447;
      var10010 = 1759597130 ^ 1219964457 ^ 542538865;
      var10010 = (int)-8875491303897912577L ^ -220253876 ^ 180853664;
      var10010 = 225420643 ^ -1722489451 ^ -1808056071;
      var10010 = (int)-7173600273576343222L ^ 757163424 ^ -772330272;
      var10009 = -142947297 ^ 1166444726 ^ -608916314;
      var10011 = (int)4271220982045633498L ^ 382983158 ^ 1725280291;
      var10010 = -321255691 ^ 1390163783 ^ 1810822256;
      var10011 = 637887420 ^ -850373274 ^ 1414990801;
      var10011 = 751482140 ^ 1371051042 ^ 1796915523;
      var10012 = (493752777 ^ -2028797027 ^ 226750354) + ((int)5715976477080516697L ^ 907157629 ^ 213661513);
      var1013[var10006] = c(
         "\uee62\udd73\uee45\udd71\uee32\udd05\uee48\udd0e\uee45\udd06",
         "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ",
         var10009,
         var10010,
         var10011,
         -167445303 ^ -1506143977 ^ 1350514335
      );
      var10006 = -2047837462 ^ -2130891146 ^ 84759706;
      var10006 = -277486675 ^ -38329080 ^ 314754735;
      var10006 = (int)-7058950680301432325L ^ 2142219541 ^ -368165662;
      var10006 = (int)3838943153147951118L ^ 907876758 ^ -1057198889;
      String var1402 = "ddo";
      var10007 = (int)-4418748110559974612L ^ 617210816 ^ 195420387;
      String var1545 = "ddp";
      var10008 = (int)-118495204308248092L ^ -618852713 ^ 1096741630;
      var10010 = (int)7842532123104224693L ^ 336735084 ^ 220565193;
      var10010 = (int)6546084774733320619L ^ -1908650738 ^ 229563554;
      var10009 = 442836863 ^ 1298439303 ^ 1145255552;
      var10011 = -1144526454 ^ -1567336690 ^ 424918660;
      this.r = new ModeSetting(
            var949,
            var1013,
            c(
               "\uee5dзµ‹\uee4dзµ…\uee45зґї\uee3fзµ†\uee3aзµѓ\uee4dзґ±",
               "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ",
               var10007,
               var10008,
               var10009,
               -578741625 ^ -739288036 ^ 240663959
            )
         )
         .a(
            () -> {
               if (this.f.a()) {
                  ModeSetting var10000 = this.e;
                  int var10002 = (int)606368392206331640L;
                  int var2x = -1267848394;
                  int var1x = var10002;
                  var10002 = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = -1206549047;
                  var1x = var10002;
                  var10002 = (var1x | var2x) - (var1x & var2x);
                  String var58x = "dih";
                  String var10003x = "dii";
                  var2x = 2103084080;
                  var1x = -603254565;
                  int var59x = (var1x | var2x) - (var1x & var2x);
                  var2x = -937853724;
                  var1x = var59x;
                  int var60x = var1x + var2x - 2 * (var1x & var2x);
                  int var10004x = (int)-5633082532536899019L;
                  var2x = 141990313;
                  var1x = var10004x;
                  var10004x = (var1x | var2x) - (var1x & var2x);
                  var2x = -1517714886;
                  var1x = var10004x;
                  var10004x = var1x + var2x - 2 * (var1x & var2x);
                  var2x = 1851765241;
                  var1x = -339472545;
                  var10004x = var1x + var2x - 2 * (var1x & var2x);
                  var2x = -789553966;
                  var1x = var10004x;
                  var10004x = var1x + var2x - 2 * (var1x & var2x);
                  var2x = -1944259632;
                  var1x = 1673383444;
                  int var10005x = (var1x | var2x) - (var1x & var2x);
                  var2x = -1088061710;
                  var1x = var10005x;
                  var10005x = (var1x | var2x) & ~(var1x & var2x);
                  int var10006x = (int)-2347965638542011164L;
                  var2x = 1244007939;
                  var1x = var10006x;
                  var10006x = var1x + var2x - 2 * (var1x & var2x);
                  var2x = 1793941751;
                  var1x = var10006x;
                  var2x = (var1x | var2x) & (~var1x | ~var2x);
                  var1x = var10005x;
                  var10005x = var1x - ~var2x - 1;
                  var10005x = (int)-4007388875126882800L;
                  var2x = 568114476;
                  var1x = var10005x;
                  var10005x = (var1x | var2x) - (var1x & var2x);
                  var2x = -297556456;
                  var1x = var10005x;
                  var10005x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = 311004511;
                  var1x = -173857972;
                  var10006x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = 490765342;
                  var1x = var10006x;
                  var10006x = (var1x | var2x) & ~(var1x & var2x);
                  int var10007x = (int)-2206935117087873759L;
                  var2x = 1036381248;
                  var1x = var10007x;
                  var10007x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = 1433972656;
                  var1x = var10007x;
                  var2x = (var1x | var2x) & ~(var1x & var2x);
                  var1x = var10006x;
                  var10006x = 2 * (var1x | var2x) - (var1x ^ var2x);
                  var10006x = (int)8465974652909185976L;
                  var2x = 297201339;
                  var1x = var10006x;
                  var10006x = var1x + var2x - 2 * (var1x & var2x);
                  var2x = -1987284409;
                  var1x = var10006x;
                  if (var10000.b(
                     c(
                        "жј±\uf025жј–\uf445жЅ­\uf051жјћ\uf025жј›",
                        "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ",
                        var60x,
                        var10004x,
                        var10005x,
                        (var1x | var2x) - (var1x & var2x)
                     )
                  )) {
                     var2x = 887850254;
                     var1x = -1365484186;
                     int var55x = (var1x | var2x) - (var1x & var2x);
                     var2x = -1703421847;
                     var1x = var55x;
                     return Boolean.valueOf(pulse.Bool.from((var1x | var2x) - (var1x & var2x)));
                  }
               }

               int var49x = -967866054;
               int var24x = 183743552;
               int var53x = var24x + var49x - 2 * (var24x & var49x);
               var49x = -860078726;
               var24x = var53x;
               return Boolean.valueOf(pulse.Bool.from(var24x & ~var49x | ~var24x & var49x));
            }
         );
      String var950 = "ddq";
      var10004 = 831146780 ^ -1074894679 ^ 892361032;
      var10006 = (int)7815696243460523057L ^ 123289728 ^ -259488592;
      var10006 = (int)-9167466889458740437L ^ -1013612300 ^ -1338141738;
      var10005 = (int)-2570283353398890363L ^ 1744218983 ^ 2050061293;
      var10006 = ((int)-8123604783821212299L ^ -343631019 ^ 258957414) * ((int)-8123604783821212299L ^ -343631019 ^ 258957414);
      var10006 = (int)-5951894450789589450L ^ -226276712 ^ 926984484;
      var10007 = (760998725 ^ -1834902585 ^ -1820092704) + (577155639 ^ -1298489931 ^ -1166366393);
      var10007 = -813881383 ^ 611504314 ^ -371780145;
      String var1547 = "ddr";
      String var951 = c(
         "\uee67н•…\uee46н•ѓ\uee3aн•Ћ\uee3cн”№\uee4fн•…",
         "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ",
         var10005,
         var10006,
         var10007,
         -1722146173 ^ -848938929 ^ 1410845125
      );
      var10004 = (-108898453 ^ 1725318167 ^ -1434394904) + (-1855726585 ^ -715254153 ^ -73825756);
      String var1249 = "dds";
      this.s = new SliderSetting(var951, 4.0F, 1.0F, 20.0F, 1.0F)
         .a(
            () -> {
               if (this.f.a()) {
                  int var10001 = (int)3747913248810532014L;
                  int var2x = 1058423510;
                  int var1x = var10001;
                  var10001 = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = -1184213463;
                  var1x = var10001;
                  var10001 = var1x & ~var2x | ~var1x & var2x;
                  var2x = 31358721;
                  var1x = -1322888893;
                  int var10002 = (var1x | var2x) & ~(var1x & var2x);
                  var2x = 2125696493;
                  var1x = var10002;
                  var10002 = ((var1x | var2x) & ~(var1x & var2x)) * ((var1x | var2x) & ~(var1x & var2x));
                  String var10003x = "dig";
                  var2x = 1104900684;
                  var1x = 16289463;
                  int var51x = var1x & ~var2x | ~var1x & var2x;
                  var2x = 678106356;
                  var1x = var51x;
                  int var52x = var1x + var2x - 2 * (var1x & var2x);
                  int var10004x = (int)1438998963685186644L;
                  var2x = 1964020489;
                  var1x = var10004x;
                  var10004x = var1x & ~var2x | ~var1x & var2x;
                  var2x = 1165671185;
                  var1x = var10004x;
                  var10004x = var1x & ~var2x | ~var1x & var2x;
                  var2x = -308424291;
                  var1x = -271570698;
                  var10004x = (var1x | var2x) - (var1x & var2x);
                  var2x = 1460138650;
                  var1x = var10004x;
                  var10004x = var1x & ~var2x | ~var1x & var2x;
                  int var10005x = (int)782116296761374453L;
                  var2x = -1519535833;
                  var1x = var10005x;
                  var10005x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = -540182020;
                  var1x = var10005x;
                  var10005x = ((var1x | var2x) & (~var1x | ~var2x)) * ((var1x | var2x) & (~var1x | ~var2x));
                  var10005x = (int)-7497875535562004671L;
                  var2x = 715058757;
                  var1x = var10005x;
                  var10005x = var1x + var2x - 2 * (var1x & var2x);
                  var2x = 994836415;
                  var1x = var10005x;
                  var10005x = (var1x | var2x) & (~var1x | ~var2x);
                  int var10006x = (int)2548585582620746890L;
                  var2x = 1262315257;
                  var1x = var10006x;
                  var10006x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = -1727692170;
                  var1x = var10006x;
                  var10006x = ((var1x | var2x) & (~var1x | ~var2x)) * ((var1x | var2x) & (~var1x | ~var2x));
                  var10006x = (int)8534879871575465708L;
                  var2x = 943767806;
                  var1x = var10006x;
                  var10006x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = 967278290;
                  var1x = var10006x;
                  if (this.e
                     .b(c("жјІвћўжј•вЏ‚жЅ®вџ–жјќвћўжј", "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ", var52x, var10004x, var10005x, var1x & ~var2x | ~var1x & var2x))
                     )
                   {
                     var2x = -433774588;
                     var1x = -1415558633;
                     int var47x = var1x + var2x - 2 * (var1x & var2x);
                     var2x = 1300589074;
                     var1x = var47x;
                     return Boolean.valueOf(pulse.Bool.from(var1x + var2x - 2 * (var1x & var2x)));
                  }
               }

               int var10000 = (int)-6067400600103077159L;
               int var41x = 1640687090;
               int var20x = var10000;
               var10000 = (var20x | var41x) & (~var20x | ~var41x);
               var41x = -1726488789;
               var20x = var10000;
               return Boolean.valueOf(pulse.Bool.from((var20x | var41x) & (~var20x | ~var41x)));
            }
         );
      String var952 = "ddt";
      var10004 = (-269230670 ^ 134211364 ^ 61028253) + (-1512323605 ^ 1267580153 ^ 1992458667);
      var10005 = ((int)5847767869751415235L ^ -1499984997 ^ 1708903689) * ((int)5847767869751415235L ^ -1499984997 ^ 1708903689);
      var10005 = 1632405975 ^ -608114214 ^ -742094846;
      String var1250 = "ddu";
      var10006 = (int)-9044115587346472485L ^ 1934277615 ^ 575550427;
      var10008 = -1810600919 ^ 17638395 ^ -1793503279;
      var10007 = (int)-8767645806744035686L ^ -1630164283 ^ -116447854;
      String var1549 = "ddv";
      String var953 = c(
         "\uee5dз¤¬\uee4aз¤ \uee48зҐњ", "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ", var10005, var10006, var10007, 1211448483 ^ -1507970586 ^ -299142613
      );
      var10004 = ((int)-581365827169175432L ^ 2069086925 ^ 1594598767) * ((int)-581365827169175432L ^ 2069086925 ^ 1594598767);
      var10006 = -148202054 ^ -815135887 ^ 943759053;
      var10006 = (int)6494491247214730702L ^ -919644552 ^ -2110698571;
      var10006 = (int)-6656627449978420863L ^ -724729720 ^ -1792966385;
      var10006 = (433459310 ^ 183288486 ^ 994932822) + (-1821713381 ^ -1730400412 ^ -1906461616);
      var10007 = (-393924342 ^ -877869186 ^ -1679144144) * (-393924342 ^ -877869186 ^ -1679144144);
      this.t = new SliderSetting(var953, 0.3F, 0.1F, 0.75F, 0.05F)
         .a(
            () -> {
               if (this.f.a()) {
                  int var10001 = (int)-5622649094667767123L;
                  int var2x = -101172411;
                  int var1x = var10001;
                  var10001 = (var1x | var2x) & ~(var1x & var2x);
                  var2x = -22880518;
                  var1x = var10001;
                  var10001 = (var1x | var2x) & ~(var1x & var2x);
                  String var10002 = "die";
                  var2x = -614040756;
                  var1x = -785872492;
                  int var10003x = (var1x | var2x) - (var1x & var2x);
                  var2x = 1632622121;
                  var1x = var10003x;
                  var10003x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = -1043840931;
                  var1x = -25484871;
                  var10003x = var1x & ~var2x | ~var1x & var2x;
                  var2x = 1459325419;
                  var1x = var10003x;
                  var10003x = (var1x | var2x) - (var1x & var2x);
                  int var10004x = (int)8098698993088985320L;
                  var2x = 655818987;
                  var1x = var10004x;
                  var10004x = var1x + var2x - 2 * (var1x & var2x);
                  var2x = 644445720;
                  var1x = var10004x;
                  var10004x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = -1954284093;
                  var1x = 497789973;
                  int var10005x = (var1x | var2x) - (var1x & var2x);
                  var2x = -99461177;
                  var1x = var10005x;
                  var2x = var1x + var2x - 2 * (var1x & var2x);
                  var1x = var10004x;
                  var10004x = var1x - ~var2x - 1;
                  var2x = 460053654;
                  var1x = -2013932666;
                  var10004x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = -908720563;
                  var1x = var10004x;
                  var10004x = (var1x | var2x) & (~var1x | ~var2x);
                  var10005x = (int)937275203274275369L;
                  var2x = -2087356416;
                  var1x = var10005x;
                  var10005x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = -407506926;
                  var1x = var10005x;
                  var10005x = var1x & ~var2x | ~var1x & var2x;
                  var10005x = (int)3874276994366647674L;
                  var2x = -1927256862;
                  var1x = var10005x;
                  var10005x = (var1x | var2x) - (var1x & var2x);
                  var2x = -931224979;
                  var1x = var10005x;
                  var10005x = (var1x | var2x) & (~var1x | ~var2x);
                  String var10006x = "dif";
                  int var66x = (int)-3789754784814973878L;
                  var2x = -844400120;
                  var1x = var66x;
                  int var67x = var1x + var2x - 2 * (var1x & var2x);
                  var2x = -454174615;
                  var1x = var67x;
                  if (this.e
                     .b(
                        c(
                           "жјібҐ€жј”бґЁжЅЇ\u193cжјњбҐ€жј™",
                           "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ",
                           var10003x,
                           var10004x,
                           var10005x,
                           var1x + var2x - 2 * (var1x & var2x)
                        )
                     )) {
                     var2x = -594168107;
                     var1x = 1244255502;
                     int var49x = var1x + var2x - 2 * (var1x & var2x);
                     var2x = -1766038566;
                     var1x = var49x;
                     return Boolean.valueOf(pulse.Bool.from((var1x | var2x) - (var1x & var2x)));
                  }
               }

               int var10000 = (int)-6185162751470570369L;
               int var43x = 1883332009;
               int var21x = var10000;
               var10000 = var21x + var43x - 2 * (var21x & var43x);
               var43x = 148842966;
               var21x = var10000;
               return Boolean.valueOf(pulse.Bool.from((var21x | var43x) & ~(var21x & var43x)));
            }
         );
      var10003 = (40744366 ^ -813443470 ^ 1563124800) * (40744366 ^ -813443470 ^ 1563124800);
      var10005 = 1640731759 ^ -643232298 ^ -1201497686;
      var10005 = 2062423694 ^ 754993242 ^ 1475239632;
      var10005 = (-888350424 ^ -689425347 ^ -479779670) * (-888350424 ^ -689425347 ^ -479779670);
      var10005 = (int)1788314091180061956L ^ -1237438823 ^ 954872722;
      var10006 = (-1162772679 ^ -1598769206 ^ 1037427961) * (-1162772679 ^ -1598769206 ^ 1037427961);
      var10006 = -1204545816 ^ 86840095 ^ 1756511285;
      var10007 = ((int)-2671850708059669156L ^ 152427931 ^ 2110050484) * ((int)-2671850708059669156L ^ 152427931 ^ 2110050484);
      var10007 = 1405618770 ^ -32984797 ^ -1323346629;
      var10008 = 484003430 ^ 1551104316 ^ 113325319;
      String var955 = c(
         "\uee6fдҐі\uee48д¤Џ\uee32дґ“\uee4bд¤‹\uee4aд¤Ћ\uee45",
         "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ",
         var10005,
         var10006,
         var10007,
         -534641341 ^ -1997805329 ^ 1758307053
      );
      var10005 = (int)-1205528789072865012L ^ 532828422 ^ 118245377;
      var10005 = -677039335 ^ -30565487 ^ 696821891;
      var10005 = -1356720427 ^ 2019644095 ^ -683457428;
      var10006 = (int)-58331965641860568L ^ -1277618482 ^ 1459932391;
      var10006 = 1593811284 ^ -15787476 ^ -1578058902;
      var10006 = (int)-219933544903581301L ^ -706210252 ^ -130254929;
      String var1261 = "ddw";
      var10008 = 599239713 ^ 1229331305 ^ 1794226008;
      var10008 = -211431482 ^ 947861034 ^ -887424543;
      var10008 = -775926784 ^ -562017588 ^ 255854275;
      this.u = new SliderSetting(var955, 20.0F, 10.0F, 50.0F, 5.0F)
         .a(
            () -> {
               if (this.f.a()) {
                  ModeSetting var10000 = this.e;
                  String var10001 = "dib";
                  int var10002 = (int)5664188153515866723L;
                  int var2x = 3499369;
                  int var1x = var10002;
                  var10002 = (var1x | var2x) - (var1x & var2x);
                  var2x = 50675713;
                  var1x = var10002;
                  var10002 = var1x & ~var2x | ~var1x & var2x;
                  var2x = -525889259;
                  var1x = 86406370;
                  int var10003x = (var1x | var2x) - (var1x & var2x);
                  var2x = -1833553780;
                  var1x = var10003x;
                  var2x = var1x & ~var2x | ~var1x & var2x;
                  var1x = var10002;
                  var10002 = 2 * (var1x | var2x) - (var1x ^ var2x);
                  String var63x = "dic";
                  var10003x = (int)5581815469722425971L;
                  var2x = -2125417604;
                  var1x = var10003x;
                  var10003x = var1x + var2x - 2 * (var1x & var2x);
                  var2x = 2056093952;
                  var1x = var10003x;
                  var10003x = (var1x | var2x) - (var1x & var2x);
                  var2x = 2108597378;
                  var1x = -463745760;
                  int var10004x = var1x & ~var2x | ~var1x & var2x;
                  var2x = 815228914;
                  var1x = var10004x;
                  var10004x = (var1x | var2x) & (~var1x | ~var2x);
                  var10004x = (int)7820931019443448875L;
                  var2x = 1678204853;
                  var1x = var10004x;
                  var10004x = (var1x | var2x) - (var1x & var2x);
                  var2x = 196340577;
                  var1x = var10004x;
                  var10004x = var1x & ~var2x | ~var1x & var2x;
                  String var10005x = "did";
                  var2x = -1078569679;
                  var1x = 1005271103;
                  int var71x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = -1828057396;
                  var1x = var71x;
                  int var72x = (var1x | var2x) & ~(var1x & var2x);
                  int var10007x = (int)6778936058950370681L;
                  var2x = -1763456363;
                  var1x = var10007x;
                  var10007x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = 1915817980;
                  var1x = var10007x;
                  var10007x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = -1985791012;
                  var1x = -1826378416;
                  var10007x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = 444634781;
                  var1x = var10007x;
                  var10007x = var1x & ~var2x | ~var1x & var2x;
                  var10007x = (int)7703306118372863499L;
                  var2x = -650617066;
                  var1x = var10007x;
                  var10007x = var1x & ~var2x | ~var1x & var2x;
                  var2x = 344813841;
                  var1x = var10007x;
                  var10007x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = -917987759;
                  var1x = 2132040567;
                  var10007x = (var1x | var2x) - (var1x & var2x);
                  var2x = -1235434195;
                  var1x = var10007x;
                  var10007x = var1x & ~var2x | ~var1x & var2x;
                  int var10006x = (int)1839308451969882692L;
                  var2x = -1769255484;
                  var1x = var10006x;
                  var10006x = (var1x | var2x) - (var1x & var2x);
                  var2x = 1454520908;
                  var1x = var10006x;
                  if (var10000.b(
                     c("жјґвЄЁжј“в»€жЅЁв«њжј›вЄЁжјћ", "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ", var10003x, var10004x, var72x, (var1x | var2x) & ~(var1x & var2x))
                  )) {
                     int var58x = (int)-4588743566680634824L;
                     var2x = -1635092901;
                     var1x = var58x;
                     int var59x = (var1x | var2x) - (var1x & var2x);
                     var2x = 1345207394;
                     var1x = var59x;
                     return Boolean.valueOf(pulse.Bool.from((var1x | var2x) & (~var1x | ~var2x)));
                  }
               }

               int var55x = (int)-4240676358080156905L;
               int var51x = -448613196;
               int var25x = var55x;
               var55x = (var25x | var51x) - (var25x & var51x);
               var51x = -528572509;
               var25x = var55x;
               return Boolean.valueOf(pulse.Bool.from((var25x | var51x) - (var25x & var51x)));
            }
         );
      String var956 = "ddx";
      var10005 = (int)-1259739270211761165L ^ 1678911307 ^ -2055656269;
      var10005 = (int)3260512241504992799L ^ -548005519 ^ 199337838;
      var10005 = (-924191960 ^ -1212696909 ^ 1938176580) + ((int)4873047198244126480L ^ -1207036569 ^ 798679369);
      var10005 = (int)2599257878811733485L ^ -1649843976 ^ 114615578;
      var10006 = (int)6203528816728074729L ^ -841891631 ^ 1922270134;
      var10006 = (int)-2223445090513742451L ^ -738998547 ^ 1948109488;
      var10007 = (717881108 ^ 817638785 ^ 509203391) + ((int)3713071656206559127L ^ 478084872 ^ -1934334735);
      var10007 = 592546489 ^ 1713260727 ^ 1366005365;
      var10009 = 1635139324 ^ 1018294209 ^ 1573376301;
      var10009 = -1073240329 ^ 1842419702 ^ -1378438903;
      String var957 = c(
         "\uee5cк¤…\uee46к¤Ќ\uea5d\ua97d\uee4dк¤Љ\uee46кҐ¬\uee3fк¤Ќ",
         "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ",
         var10005,
         var10006,
         var10007,
         -1498807317 ^ 2088469225 ^ -624742835
      );
      var10004 = ((int)860304828022670281L ^ 2147369541 ^ 1305211846) * ((int)860304828022670281L ^ 2147369541 ^ 1305211846);
      var10005 = 1763433410 ^ 1942241052 ^ 767253404;
      var10006 = ((int)8314350060600550440L ^ 1581372728 ^ 1849939990) * ((int)8314350060600550440L ^ 1581372728 ^ 1849939990);
      var10007 = -1924127234 ^ 268836738 ^ -417427659;
      this.v = new SliderSetting(var957, 0.3F, 0.15F, 0.35F, 0.01F)
         .a(
            () -> {
               if (this.f.a()) {
                  ModeSetting var10000 = this.e;
                  int var2x = -1437737107;
                  int var1x = -419152661;
                  int var10001 = var1x & ~var2x | ~var1x & var2x;
                  var2x = -548133243;
                  var1x = var10001;
                  var10001 = (var1x | var2x) - (var1x & var2x);
                  int var10002 = (int)-8642238279737316358L;
                  var2x = 1924496272;
                  var1x = var10002;
                  var10002 = var1x & ~var2x | ~var1x & var2x;
                  var2x = -1514694031;
                  var1x = var10002;
                  var2x = var1x & ~var2x | ~var1x & var2x;
                  var1x = var10001;
                  var10001 = (var1x | var2x) + (var1x & var2x);
                  var2x = 669772154;
                  var1x = -1428092547;
                  var10002 = var1x + var2x - 2 * (var1x & var2x);
                  var2x = 357374711;
                  var1x = var10002;
                  var10002 = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = 877269735;
                  var1x = 561668044;
                  int var10004x = var1x & ~var2x | ~var1x & var2x;
                  var2x = 355487016;
                  var1x = var10004x;
                  var10004x = (var1x | var2x) - (var1x & var2x);
                  int var10003x = (int)-2880718887348353482L;
                  var2x = -882319928;
                  var1x = var10003x;
                  var10003x = (var1x | var2x) - (var1x & var2x);
                  var2x = -403180559;
                  var1x = var10003x;
                  var10003x = (var1x | var2x) - (var1x & var2x);
                  var2x = -669484689;
                  var1x = -213989342;
                  var10004x = var1x & ~var2x | ~var1x & var2x;
                  var2x = -927855124;
                  var1x = var10004x;
                  var10004x = ((var1x | var2x) & (~var1x | ~var2x)) * ((var1x | var2x) & (~var1x | ~var2x));
                  var10004x = (int)-7465634479861900153L;
                  var2x = 2006799354;
                  var1x = var10004x;
                  var10004x = var1x & ~var2x | ~var1x & var2x;
                  var2x = -435892614;
                  var1x = var10004x;
                  var10004x = (var1x | var2x) & (~var1x | ~var2x);
                  int var10005x = (int)-3394224091959858430L;
                  var2x = 91007612;
                  var1x = var10005x;
                  var10005x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = 2111798227;
                  var1x = var10005x;
                  var10005x = (var1x + var2x - 2 * (var1x & var2x)) * (var1x + var2x - 2 * (var1x & var2x));
                  var2x = -1421735582;
                  var1x = -2085002774;
                  var10005x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = 665817055;
                  var1x = var10005x;
                  var10005x = (var1x | var2x) - (var1x & var2x);
                  var2x = -793490620;
                  var1x = 1430166904;
                  int var10006x = var1x & ~var2x | ~var1x & var2x;
                  var2x = -4822142;
                  var1x = var10006x;
                  var10006x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = -2027551507;
                  var1x = 1482862892;
                  var10006x = var1x & ~var2x | ~var1x & var2x;
                  var2x = -545988590;
                  var1x = var10006x;
                  if (var10000.b(
                     c(
                        "жјµнЉ¶жј’н›–жЅ©н‹‚жјљнЉ¶жјџ",
                        "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ",
                        var10003x,
                        var10004x,
                        var10005x,
                        var1x + var2x - 2 * (var1x & var2x)
                     )
                  )) {
                     var2x = 1517081092;
                     var1x = -901846993;
                     int var57x = var1x + var2x - 2 * (var1x & var2x);
                     var2x = -1873659350;
                     var1x = var57x;
                     return Boolean.valueOf(pulse.Bool.from((var1x | var2x) & (~var1x | ~var2x)));
                  }
               }

               int var51x = 1061113294;
               int var25x = -1685119424;
               int var55x = var25x + var51x - 2 * (var25x & var51x);
               var51x = -1531948146;
               var25x = var55x;
               return Boolean.valueOf(pulse.Bool.from((var25x | var51x) & (~var25x | ~var51x)));
            }
         );
      String var958 = "ddy";
      String var1019 = "ddz";
      var10005 = -2131699467 ^ -601268083 ^ -230864572;
      var10005 = 707040699 ^ 1226195282 ^ 175783142;
      var10006 = ((int)-4286663405159438910L ^ -653743185 ^ 431451231) + (-1184983175 ^ -785674567 ^ 440645785);
      var10006 = (int)5843770622811634920L ^ -122356101 ^ 1425577553;
      var10008 = (int)-3004573439614559454L ^ -1795226085 ^ -1295229634;
      var10008 = (int)-3462709099248965931L ^ -609909552 ^ 2036670985;
      var10008 = -357168388 ^ -1279329234 ^ 1493759711;
      var10007 = -910957525 ^ -699948504 ^ 585011;
      String var1557 = "dea";
      this.w = new BooleanSetting(
            c(
               "\uee5bк°Ѓ\uee48к±±\uea5dк°‰\uee46к°‹\uee48к°Ћ\uee3fк°ѓ",
               "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ",
               var10005,
               var10006,
               var10007,
               1815450360 ^ 1560374012 ^ 825053765
            ),
            true
         )
         .a(
            () -> {
               if (!this.f.a()) {
                  if (b) {
                     throw new IllegalStateException();
                  }
               } else {
                  int var2x = 1079359666;
                  int var1x = -100240609;
                  int var10001 = (var1x | var2x) & ~(var1x & var2x);
                  var2x = -1811523627;
                  var1x = var10001;
                  var10001 = var1x & ~var2x | ~var1x & var2x;
                  String var10002 = "dhz";
                  int var10003x = (int)-3121694895167239697L;
                  var2x = -753831107;
                  var1x = var10003x;
                  var10003x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = 1869002848;
                  var1x = var10003x;
                  var10003x = (var1x | var2x) - (var1x & var2x);
                  var2x = -21119529;
                  var1x = 534347985;
                  int var10004x = var1x + var2x - 2 * (var1x & var2x);
                  var2x = -6100788;
                  var1x = var10004x;
                  var2x = (var1x | var2x) - (var1x & var2x);
                  var1x = var10003x;
                  var10003x = (var1x ^ var2x) + 2 * (var1x & var2x);
                  var2x = 381901250;
                  var1x = -147191945;
                  var10003x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = -2001619270;
                  var1x = var10003x;
                  var10003x = (var1x | var2x) & (~var1x | ~var2x);
                  String var68x = "dia";
                  var10004x = (int)-7184593913410116489L;
                  var2x = 1321083495;
                  var1x = var10004x;
                  var10004x = var1x + var2x - 2 * (var1x & var2x);
                  var2x = -1527876487;
                  var1x = var10004x;
                  var10004x = (var1x | var2x) & (~var1x | ~var2x);
                  int var10005x = (int)7302964527595538340L;
                  var2x = -387374184;
                  var1x = var10005x;
                  var10005x = var1x + var2x - 2 * (var1x & var2x);
                  var2x = 162026405;
                  var1x = var10005x;
                  var10005x = (var1x | var2x) & ~(var1x & var2x);
                  int var10006x = (int)-3418764736417901434L;
                  var2x = 1936964094;
                  var1x = var10006x;
                  var10006x = var1x & ~var2x | ~var1x & var2x;
                  var2x = -1998103974;
                  var1x = var10006x;
                  var2x = (var1x | var2x) & (~var1x | ~var2x);
                  var1x = var10005x;
                  var10005x = (var1x & ~var2x) + (var2x & ~var1x) + 2 * (var1x & var2x);
                  var2x = -2137776957;
                  var1x = -2068860282;
                  var10005x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = 75979444;
                  var1x = var10005x;
                  var10005x = (var1x | var2x) & ~(var1x & var2x);
                  var10006x = (int)-3737356016634112692L;
                  var2x = 240650351;
                  var1x = var10006x;
                  var10006x = var1x & ~var2x | ~var1x & var2x;
                  var2x = 343753880;
                  var1x = var10006x;
                  var10006x = (var1x | var2x) & ~(var1x & var2x);
                  int var10007x = (int)-7370129242877537257L;
                  var2x = -321789349;
                  var1x = var10007x;
                  var10007x = var1x & ~var2x | ~var1x & var2x;
                  var2x = 71637682;
                  var1x = var10007x;
                  var2x = var1x & ~var2x | ~var1x & var2x;
                  var1x = var10006x;
                  var10006x = (var1x | var2x) + (var1x & var2x);
                  var2x = -15428777;
                  var1x = -1983736803;
                  var10006x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = 1989836926;
                  var1x = var10006x;
                  if (this.e
                     .b(
                        c(
                           "жј¶Rжј‘РІжЅЄ&жј™Rжјњ",
                           "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ",
                           var10003x,
                           var10004x,
                           var10005x,
                           (var1x | var2x) & ~(var1x & var2x)
                        )
                     )) {
                     int var60x = (int)444505549768860024L;
                     var2x = 2146973807;
                     var1x = var60x;
                     var60x = (var1x | var2x) & ~(var1x & var2x);
                     var2x = 1028757782;
                     var1x = var60x;
                     return Boolean.valueOf(pulse.Bool.from(var1x + var2x - 2 * (var1x & var2x)));
                  }
               }

               int var55x = 1357068;
               int var27x = -1313353134;
               int var10000 = (var27x | var55x) & (~var27x | ~var55x);
               var55x = -1314691234;
               var27x = var10000;
               return Boolean.valueOf(pulse.Bool.from(var27x + var55x - 2 * (var27x & var55x)));
            }
         );
      var10003 = ((int)9125185556794530499L ^ -746109489 ^ -336945639) + (271875897 ^ -1381262060 ^ 200839055);
      var10005 = (int)-6138569402629952236L ^ 1991826992 ^ -1450167514;
      var10005 = -794597778 ^ -514396429 ^ 838174877;
      var10005 = (int)5124277670516373557L ^ -166829628 ^ -1080665630;
      var10005 = (int)3897763600560173421L ^ 340918249 ^ -108540281;
      var10005 = (-1821484096 ^ 1316518335 ^ 1905547165) * (-1821484096 ^ 1316518335 ^ 1905547165);
      var10005 = 1311951365 ^ 400689265 ^ 815278715;
      var10006 = (-2006365447 ^ 1531967613 ^ 1513895078) * (-2006365447 ^ 1531967613 ^ 1513895078);
      var10006 = 14371932 ^ -480879592 ^ 909982256;
      var10007 = ((int)7688133143617338518L ^ -449230881 ^ 378324434) * ((int)7688133143617338518L ^ -449230881 ^ 378324434);
      var10007 = -957035093 ^ 761637632 ^ -521261874;
      var10008 = (95344754 ^ -1892571099 ^ 219843995) + ((int)8594847213381957966L ^ -157729603 ^ -2022026632);
      this.x = new ColorSetting(
            c(
               "\uee67г¦±\uee3cг§ѓ\uee43г¦Ѕ\uee40г§Љ\uee44г¶Ў\uee3bг¦і\uee48г§ѓ",
               "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ",
               var10005,
               var10006,
               var10007,
               1049674311 ^ 24094367 ^ 1073109803
            ),
            Color.WHITE
         )
         .a(
            () -> {
               if (!this.f.a()) {
                  if (a != a) {
                     String var10000 = "dhy";
                     int var67x = (int)2247234197937421299L;
                     int var4x = 1205458563;
                     int var3x = var67x;
                     int var68x = (var3x | var4x) & (~var3x | ~var4x);
                     var4x = -1912941943;
                     var3x = var68x;
                     int var2x = var3x & ~var4x | ~var3x & var4x;
                     a = var2x;
                  }
               } else {
                  int var37x = 1761877416;
                  int var6x = -1731371134;
                  int var10001 = var6x + var37x - 2 * (var6x & var37x);
                  var37x = -1300688290;
                  var6x = var10001;
                  var10001 = (var6x | var37x) & (~var6x | ~var37x);
                  int var10002 = (int)-5119924288405320921L;
                  var37x = -430541176;
                  var6x = var10002;
                  var10002 = (var6x | var37x) & ~(var6x & var37x);
                  var37x = 1966472105;
                  var6x = var10002;
                  var10002 = (var6x | var37x) - (var6x & var37x);
                  var37x = 141204271;
                  var6x = -1582182299;
                  int var10003x = (var6x | var37x) - (var6x & var37x);
                  var37x = -860955871;
                  var6x = var10003x;
                  var37x = (var6x | var37x) - (var6x & var37x);
                  var6x = var10002;
                  var10002 = var6x - ~var37x - 1;
                  var10003x = (int)158542233485575871L;
                  var37x = -2020614897;
                  var6x = var10003x;
                  var10003x = var6x & ~var37x | ~var6x & var37x;
                  var37x = 1083250331;
                  var6x = var10003x;
                  var10003x = (var6x | var37x) & ~(var6x & var37x);
                  var37x = -2074219161;
                  var6x = 280906628;
                  var10003x = var6x & ~var37x | ~var6x & var37x;
                  var37x = -39104788;
                  var6x = var10003x;
                  var10003x = (var6x | var37x) - (var6x & var37x);
                  var37x = -824181023;
                  var6x = -866127995;
                  int var10004x = (var6x | var37x) & ~(var6x & var37x);
                  var37x = -995582689;
                  var6x = var10004x;
                  var10004x = ((var6x | var37x) - (var6x & var37x)) * ((var6x | var37x) - (var6x & var37x));
                  var37x = 1461714946;
                  var6x = -143776204;
                  var10004x = (var6x | var37x) - (var6x & var37x);
                  var37x = -171382243;
                  var6x = var10004x;
                  var10004x = (var6x | var37x) & ~(var6x & var37x);
                  var37x = -351074457;
                  var6x = 1288186463;
                  int var10005x = var6x & ~var37x | ~var6x & var37x;
                  var37x = -10944912;
                  var6x = var10005x;
                  var10005x = var6x & ~var37x | ~var6x & var37x;
                  int var10006x = (int)-4285175066258828540L;
                  var37x = -669040122;
                  var6x = var10006x;
                  var10006x = (var6x | var37x) & ~(var6x & var37x);
                  var37x = 1190879849;
                  var6x = var10006x;
                  var37x = var6x + var37x - 2 * (var6x & var37x);
                  var6x = var10005x;
                  var10005x = 2 * (var6x | var37x) - (var6x ^ var37x);
                  var10005x = (int)-6943498452739558353L;
                  var37x = 600671216;
                  var6x = var10005x;
                  var10005x = (var6x | var37x) & ~(var6x & var37x);
                  var37x = 775082039;
                  var6x = var10005x;
                  var10005x = var6x + var37x - 2 * (var6x & var37x);
                  var37x = 1133672488;
                  var6x = -888665215;
                  var10006x = (var6x | var37x) & (~var6x | ~var37x);
                  var37x = -542305967;
                  var6x = var10006x;
                  var10006x = var6x + var37x - 2 * (var6x & var37x);
                  var10006x = (int)-1413522513231311594L;
                  var37x = 1010004640;
                  var6x = var10006x;
                  var10006x = var6x & ~var37x | ~var6x & var37x;
                  var37x = 1353097027;
                  var6x = var10006x;
                  if (this.e
                        .b(
                           c(
                              "жј·\ue792жјђ\ue3f2жЅ«\ue7e6жј\ue792жјќ",
                              "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ",
                              var10003x,
                              var10004x,
                              var10005x,
                              var6x + var37x - 2 * (var6x & var37x)
                           )
                        )
                     && !this.w.a()) {
                     int var72x = (int)3215218635107521861L;
                     var37x = -235026352;
                     var6x = var72x;
                     var72x = var6x & ~var37x | ~var6x & var37x;
                     var37x = -1120854764;
                     var6x = var72x;
                     return Boolean.valueOf(pulse.Bool.from(var6x + var37x - 2 * (var6x & var37x)));
                  }
               }

               int var69x = (int)-1876275534202058110L;
               int var63x = 362255333;
               int var32x = var69x;
               var69x = (var32x | var63x) - (var32x & var63x);
               var63x = -1497966233;
               var32x = var69x;
               return Boolean.valueOf(pulse.Bool.from((var32x | var63x) & ~(var32x & var63x)));
            }
         );
      var10003 = (int)-820443315178591552L ^ -1688931428 ^ -511448499;
      String var1020 = "deb";
      var10005 = (1947193039 ^ 311984488 ^ -144198909) * (1947193039 ^ 311984488 ^ -144198909);
      var10005 = -1181539247 ^ 606178194 ^ -184924212;
      var10007 = 477924816 ^ -958102498 ^ -627570212;
      var10006 = 1950069556 ^ 313994253 ^ -1283562945;
      var10008 = (int)3505298411808790550L ^ -690961229 ^ -1119200087;
      var10008 = -1550818239 ^ 647888553 ^ -2062705947;
      var10007 = -315945744 ^ 836105691 ^ -849805521;
      String var1561 = "dec";
      this.y = new SettingGroup(
            c(
               "\uee5fб“‰\uee3fб“‚\uee41",
               "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ",
               var10005,
               var10006,
               var10007,
               -1358113118 ^ -49845904 ^ 1380429143
            )
         )
         .a(
            () -> {
               if (this.f.a()) {
                  ModeSetting var10000 = this.e;
                  int var10001 = (int)-1249752163432166249L;
                  int var2x = 512632267;
                  int var1x = var10001;
                  var10001 = var1x + var2x - 2 * (var1x & var2x);
                  var2x = 1143860518;
                  var1x = var10001;
                  var10001 = var1x & ~var2x | ~var1x & var2x;
                  int var10002 = (int)3862547832897043272L;
                  var2x = 902048092;
                  var1x = var10002;
                  var10002 = (var1x | var2x) & ~(var1x & var2x);
                  var2x = 1561125907;
                  var1x = var10002;
                  var2x = (var1x | var2x) - (var1x & var2x);
                  var1x = var10001;
                  var10001 = var1x - ~var2x - 1;
                  var10002 = (int)-5829862129931784150L;
                  var2x = -185989966;
                  var1x = var10002;
                  var10002 = (var1x | var2x) - (var1x & var2x);
                  var2x = -1355395104;
                  var1x = var10002;
                  var10002 = (var1x | var2x) - (var1x & var2x);
                  var2x = -521806387;
                  var1x = -201768910;
                  int var10003x = var1x + var2x - 2 * (var1x & var2x);
                  var2x = 1030984713;
                  var1x = var10003x;
                  var2x = (var1x | var2x) & ~(var1x & var2x);
                  var1x = var10002;
                  var10002 = (var1x & ~var2x) + (var2x & ~var1x) + 2 * (var1x & var2x);
                  var10003x = (int)-7555164756950419514L;
                  var2x = -1585671295;
                  var1x = var10003x;
                  var10003x = (var1x | var2x) - (var1x & var2x);
                  var2x = 1906702911;
                  var1x = var10003x;
                  var10003x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = 460019454;
                  var1x = 150216988;
                  int var10004x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = 2097884126;
                  var1x = var10004x;
                  var2x = var1x + var2x - 2 * (var1x & var2x);
                  var1x = var10003x;
                  var10003x = (var1x & ~var2x) + (var2x & ~var1x) + 2 * (var1x & var2x);
                  var2x = -272280063;
                  var1x = -1342576621;
                  var10003x = (var1x | var2x) - (var1x & var2x);
                  var2x = 695490077;
                  var1x = var10003x;
                  var10003x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = -1760391432;
                  var1x = 1088294745;
                  var10004x = var1x & ~var2x | ~var1x & var2x;
                  var2x = -138778698;
                  var1x = var10004x;
                  var10004x = var1x + var2x - 2 * (var1x & var2x);
                  var2x = 1397174902;
                  var1x = -1357365747;
                  var10004x = var1x & ~var2x | ~var1x & var2x;
                  var2x = -1458455289;
                  var1x = var10004x;
                  var10004x = var1x + var2x - 2 * (var1x & var2x);
                  int var10006x = (int)-7273287766838318507L;
                  var2x = -844151860;
                  var1x = var10006x;
                  var10006x = (var1x | var2x) - (var1x & var2x);
                  var2x = 164047252;
                  var1x = var10006x;
                  var10006x = var1x & ~var2x | ~var1x & var2x;
                  var2x = 1256976441;
                  var1x = -1937407384;
                  var10006x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = -965840298;
                  var1x = var10006x;
                  var10006x = var1x + var2x - 2 * (var1x & var2x);
                  var2x = 807891344;
                  var1x = -1480875296;
                  var10006x = (var1x | var2x) - (var1x & var2x);
                  var2x = -1751329932;
                  var1x = var10006x;
                  var10006x = (var1x | var2x) - (var1x & var2x);
                  int var10005x = (int)7716056606189831760L;
                  var2x = 44725490;
                  var1x = var10005x;
                  var10005x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = 43207350;
                  var1x = var10005x;
                  var10005x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = 461692488;
                  var1x = -1509924216;
                  var10006x = var1x + var2x - 2 * (var1x & var2x);
                  var2x = -1133170133;
                  var1x = var10006x;
                  var10006x = var1x & ~var2x | ~var1x & var2x;
                  int var10007x = (int)-1505989006330310613L;
                  var2x = -393102465;
                  var1x = var10007x;
                  var10007x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = -163526125;
                  var1x = var10007x;
                  var2x = (var1x | var2x) & ~(var1x & var2x);
                  var1x = var10006x;
                  var10006x = (var1x ^ var2x) + 2 * (var1x & var2x);
                  var10006x = (int)-2415301700355748759L;
                  var2x = 103232698;
                  var1x = var10006x;
                  var10006x = (var1x | var2x) - (var1x & var2x);
                  var2x = 2059959958;
                  var1x = var10006x;
                  if (var10000.b(
                     c(
                        "жјём„­жјџм•ЌжЅ¦м…ђжј™м„¬жј’м•ЌжЅҐм…“жЅҐм…жј›м…ќ",
                        "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ",
                        var10003x,
                        var10004x,
                        var10005x,
                        var1x + var2x - 2 * (var1x & var2x)
                     )
                  )) {
                     int var83x = (int)3931515503816387053L;
                     var2x = 1572058188;
                     var1x = var83x;
                     int var84x = var1x + var2x - 2 * (var1x & var2x);
                     var2x = 341384608;
                     var1x = var84x;
                     return Boolean.valueOf(pulse.Bool.from((var1x | var2x) & (~var1x | ~var2x)));
                  }
               }

               int var77x = 968202109;
               int var38x = -1351706936;
               int var81x = (var38x | var77x) - (var38x & var77x);
               var77x = -1764032075;
               var38x = var81x;
               return Boolean.valueOf(pulse.Bool.from(var38x + var77x - 2 * (var38x & var77x)));
            }
         );
      var10004 = (int)8026129582558197479L ^ 724177702 ^ -360143409;
      var10004 = (int)-53232941630207416L ^ 1282662833 ^ -1547981847;
      var10004 = ((int)-8621278061459054041L ^ -1107937774 ^ -2138356072) + (-1883941532 ^ -1797633363 ^ 1679011407);
      var10005 = ((int)-163852951478227532L ^ -571886308 ^ -1744927648) * ((int)-163852951478227532L ^ -571886308 ^ -1744927648);
      var10005 = (int)2532723894728059585L ^ -1235925159 ^ 1148536215;
      var10006 = ((int)5870120457213754508L ^ 952598323 ^ 2080901629) + ((int)-591352903204031888L ^ -2009330631 ^ -856253486);
      var10006 = -133170084 ^ 1747080888 ^ 1171065579;
      var10007 = (-1790688674 ^ 1071690160 ^ -786162642) + (-237491269 ^ 144144990 ^ 1892312702);
      var10007 = (int)5617701377592495012L ^ 1800019667 ^ -335101375;
      var10008 = -1176537007 ^ 1595679539 ^ -328515415;
      String var961 = c(
         "\uee5fлЏ„\uee42лџњ\uee3aлЏЊ\uee3cлЋѕ\uee45лЋє",
         "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ",
         var10005,
         var10006,
         var10007,
         (int)-3830702870377160649L ^ -807715252 ^ -990172171
      );
      String[] var1024 = new String[-1514379249 ^ -331940877 ^ 1233818618];
      var10006 = (int)-1317258488091605700L ^ 1122374440 ^ 419993108;
      String var1420 = "ded";
      var10008 = (int)-5557642955700627086L ^ 433378091 ^ 1805020127;
      var10009 = ((int)3722627234520767184L ^ -1412282592 ^ -253853980) + ((int)3420527446100211900L ^ 1946843096 ^ 1714233601);
      var10009 = (int)1697815967272538447L ^ -1575539260 ^ -1139026812;
      var10010 = (-107481067 ^ 1066774968 ^ 1197107791) + (1563838590 ^ 468628607 ^ -1380553887);
      var10010 = 1118522551 ^ -1162934391 ^ 770345219;
      var10011 = ((int)-8447315065567108009L ^ -412307938 ^ 2041864839) + (932111849 ^ 717374082 ^ 1373599081);
      var10011 = (int)-3395670277840147425L ^ 302802371 ^ -1752838956;
      var10013 = (int)-134860068506085472L ^ -1951908915 ^ -102273921;
      var10013 = (int)379110773774299092L ^ -871556307 ^ -1252379413;
      var10013 = -1640319721 ^ 858765881 ^ -1391128800;
      var1024[var10006] = c(
         "\uee5cн‡»\uee3dн‡є\uee3bн‡»",
         "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ",
         var10009,
         var10010,
         var10011,
         (int)-5210297758613271254L ^ 1280678296 ^ 2009449230
      );
      var10006 = -1443638588 ^ -1346625100 ^ 105902961;
      var10008 = (int)2912408857398928898L ^ 1451198598 ^ -1886818675;
      var10008 = 1707352402 ^ 1205117906 ^ 571507340;
      var10008 = (int)2121055448879812298L ^ -275922059 ^ -1634340635;
      var10009 = -2029392197 ^ -575400847 ^ 477150883;
      var10009 = (int)-402822863334117684L ^ 1063877841 ^ 632420882;
      var10010 = ((int)6001485190022733787L ^ -98320226 ^ 285786849) + ((int)3230907723202947351L ^ -396286648 ^ -2123360061);
      var10010 = -137094857 ^ -519120763 ^ -1016511812;
      var10011 = ((int)-8916358976386775970L ^ -1916091353 ^ 360084543) * ((int)-8916358976386775970L ^ -1916091353 ^ 360084543);
      var10011 = (int)-343477474547974453L ^ 1247746073 ^ -1037311132;
      String var2045 = "dee";
      var1024[var10006] = c(
         "\uee65йєѕ\uee47йєї\uee4d", "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ", var10009, var10010, var10011, 1966373242 ^ 663836206 ^ 1386854361
      );
      var10006 = -332705496 ^ -1326370804 ^ 1557815590;
      var10008 = -230288661 ^ 771766779 ^ -599381226;
      var10008 = (907616061 ^ -2029268013 ^ -883148067) * (907616061 ^ -2029268013 ^ -883148067);
      var10009 = ((int)-6801637968348632727L ^ 128145921 ^ -289663490) * ((int)-6801637968348632727L ^ 128145921 ^ -289663490);
      var10009 = -225741225 ^ -2101049788 ^ 419895324;
      var10010 = (1006893024 ^ -490942376 ^ 696614722) * (1006893024 ^ -490942376 ^ 696614722);
      var10010 = (int)-1094337618953694608L ^ 919296388 ^ 787006654;
      var10011 = ((int)-5757067172500384178L ^ 1156631648 ^ -1602651446) + (1185980062 ^ 567555254 ^ 577626261);
      var10011 = (int)-4913100770892867978L ^ -589867126 ^ -166337295;
      var10012 = (int)7992397861209663517L ^ -492911654 ^ 746340913;
      var1024[var10006] = c(
         "\uee5cкЉ†\uee48кЉЌ\uee45кЉ†\uee47кЉ‹",
         "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ",
         var10009,
         var10010,
         var10011,
         (int)-2404694243012066446L ^ 1001691420 ^ -1606156633
      );
      var10006 = 1981685410 ^ -371928544 ^ -1614099327;
      var10008 = -1508853418 ^ 1076474299 ^ -432469761;
      var10008 = (int)-7671889291083608454L ^ 684721676 ^ 2013694071;
      var10008 = -725244159 ^ -934309143 ^ 478819816;
      var10008 = (int)5342985417238320143L ^ -1864233838 ^ -510500369;
      var10009 = ((int)-5394755504373292738L ^ -128607117 ^ 222150832) * ((int)-5394755504373292738L ^ -128607117 ^ 222150832);
      var10009 = (int)8923616022642334774L ^ 2091833180 ^ 1349690213;
      var10011 = (int)-7104443349457333835L ^ -1424022085 ^ -1884638202;
      var10010 = 2021222333 ^ 889722889 ^ -1730468445;
      var10011 = (int)369927714659382320L ^ -280338862 ^ 60519875;
      var10011 = (int)-6042091238629142081L ^ 377572628 ^ -116782542;
      var10012 = (977015696 ^ 1297982273 ^ -809910668) * (977015696 ^ 1297982273 ^ -809910668);
      var1024[var10006] = c(
         "\uee5cж§њ\uee32ж§™\uee45ж§‘", "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ", var10009, var10010, var10011, -1979279227 ^ -2092937869 ^ 155564640
      );
      var10006 = (int)-3173072539360408111L ^ -1874778005 ^ -593402434;
      var10007 = (1271950085 ^ -1788954530 ^ 269872237) + ((int)793174281569429792L ^ 346853665 ^ -1764063313);
      String var1573 = "def";
      var10010 = 1796905761 ^ -918081379 ^ -1570919490;
      var10009 = 1209386253 ^ -1302563554 ^ -1828628452;
      var10010 = (-1843536045 ^ 1755292032 ^ 1014262347) + (1328573027 ^ -35210275 ^ -1368822392);
      var10010 = (int)7219965952030908512L ^ -842193074 ^ -584560161;
      String var1976 = "deg";
      var10011 = (int)3119880917330450292L ^ -872368878 ^ -945215875;
      String var2048 = "deh";
      var1024[var10006] = c(
         "\uee6a\uea30\uee48\uea35\uee49\uea32",
         "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ",
         var10009,
         var10010,
         var10011,
         796588163 ^ 1991486184 ^ 1508032027
      );
      var10006 = (int)3451256382147997646L ^ 702295335 ^ -144243988;
      var10007 = ((int)-4648522847887453754L ^ -1202807192 ^ -1200238097) + (-1512574204 ^ -587862930 ^ 1327235807);
      var10008 = 209731854 ^ 1517221606 ^ 983010649;
      var10010 = 1002169117 ^ 766802848 ^ 370120888;
      var10009 = -717697436 ^ 1372676157 ^ -308197802;
      var10010 = (1157520382 ^ 187291799 ^ 517228253) + ((int)-8402841555034332954L ^ 1310161743 ^ -1884840476);
      var10010 = (int)4599822120990811639L ^ 2106982124 ^ -1210062136;
      var10011 = ((int)1888154282941859113L ^ 86793370 ^ 2070854976) * ((int)1888154282941859113L ^ 86793370 ^ 2070854976);
      var10011 = -812317773 ^ -1369353345 ^ 1767971808;
      var10013 = 1121173726 ^ -646050545 ^ -1683108415;
      var10013 = (int)-6256638489960145820L ^ -633035810 ^ -1616429141;
      var1024[var10006] = c(
         "\uee69д„ћ\uee46д„›\uee4dд… ",
         "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ",
         var10009,
         var10010,
         var10011,
         (int)693023920244674301L ^ 690939326 ^ 1113713681
      );
      var10005 = ((int)3017312522212846396L ^ -1144119238 ^ 1792527190) * ((int)3017312522212846396L ^ -1144119238 ^ 1792527190);
      var10006 = ((int)-6719699213930085597L ^ -809739510 ^ -1147636760) * ((int)-6719699213930085597L ^ -809739510 ^ -1147636760);
      String var1423 = "dei";
      var10007 = (int)35442883481634339L ^ -2036229014 ^ -1336643002;
      var10008 = ((int)-1200009274374743570L ^ 1668896560 ^ 372087885) + (-1438150081 ^ 1957128811 ^ 1681523365);
      var10008 = (int)507133389543318736L ^ 1131494177 ^ 400519587;
      String var1719 = "dej";
      var10009 = (int)5216625206155317409L ^ -954906379 ^ -1095911230;
      var10010 = ((int)3176696936120675634L ^ -1948672497 ^ -731497228) + ((int)-1869927505721264343L ^ -1252429789 ^ -668198767);
      this.z = new ModeSetting(
            var961,
            var1024,
            c(
               "\uee5cи––\uee3dи–—\uee3bи––",
               "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ",
               var10007,
               var10008,
               var10009,
               198938829 ^ 222635749 ^ 112276985
            )
         )
         .a(
            () -> {
               if (this.f.a()) {
                  ModeSetting var10000 = this.e;
                  int var10001 = (int)7488085123006084246L;
                  int var2x = 1898129427;
                  int var1x = var10001;
                  var10001 = var1x + var2x - 2 * (var1x & var2x);
                  var2x = -2005145155;
                  var1x = var10001;
                  var10001 = (var1x & ~var2x | ~var1x & var2x) * (var1x & ~var2x | ~var1x & var2x);
                  String var10002 = "dhv";
                  String var10003x = "dhw";
                  var2x = 1505489735;
                  var1x = -1683920074;
                  int var46x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = -1420660610;
                  var1x = var46x;
                  int var47x = (var1x | var2x) - (var1x & var2x);
                  String var10004x = "dhx";
                  var2x = -1953451214;
                  var1x = -265099138;
                  int var48x = (var1x | var2x) - (var1x & var2x);
                  var2x = 788022105;
                  var1x = var48x;
                  int var49x = var1x + var2x - 2 * (var1x & var2x);
                  var2x = -967548604;
                  var1x = 1336228494;
                  int var10005x = var1x + var2x - 2 * (var1x & var2x);
                  var2x = -1496029661;
                  var1x = var10005x;
                  var10005x = (var1x | var2x) & ~(var1x & var2x);
                  var10005x = (int)-8705878881101695273L;
                  var2x = -2036585180;
                  var1x = var10005x;
                  var10005x = var1x & ~var2x | ~var1x & var2x;
                  var2x = 25557220;
                  var1x = var10005x;
                  var10005x = var1x + var2x - 2 * (var1x & var2x);
                  int var10007x = (int)-4576253061607866011L;
                  var2x = 252070613;
                  var1x = var10007x;
                  var10007x = var1x & ~var2x | ~var1x & var2x;
                  var2x = 731351989;
                  var1x = var10007x;
                  var10007x = var1x & ~var2x | ~var1x & var2x;
                  var2x = 375277436;
                  var1x = 2049460798;
                  var10007x = (var1x | var2x) - (var1x & var2x);
                  var2x = 1819675978;
                  var1x = var10007x;
                  var10007x = (var1x | var2x) - (var1x & var2x);
                  var2x = 689568653;
                  var1x = 506990407;
                  int var10006x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = 926242839;
                  var1x = var10006x;
                  if (var10000.b(
                     c(
                        "жј№в®ґжјћвї”жЅ§вЇ‰жјв®µжј“вї”жЅ¤вЇЉжЅ¤вЇЃжјљвЇ„",
                        "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ",
                        var47x,
                        var49x,
                        var10005x,
                        var1x + var2x - 2 * (var1x & var2x)
                     )
                  )) {
                     var2x = 807422112;
                     var1x = 1793664577;
                     int var43x = (var1x | var2x) & (~var1x | ~var2x);
                     var2x = 1523150560;
                     var1x = var43x;
                     return Boolean.valueOf(pulse.Bool.from(var1x & ~var2x | ~var1x & var2x));
                  }
               }

               int var37x = 1866958170;
               int var18x = 1647543279;
               int var41x = (var18x | var37x) - (var18x & var37x);
               var37x = 225707701;
               var18x = var41x;
               return Boolean.valueOf(pulse.Bool.from(var18x & ~var37x | ~var18x & var37x));
            }
         );
      var10003 = ((int)-4506388907916213290L ^ -1333610533 ^ -706337898) * ((int)-4506388907916213290L ^ -1333610533 ^ -706337898);
      var10004 = (int)8232639125604271203L ^ 1949626427 ^ -156059801;
      var10005 = (int)-6434720320290123289L ^ 613987237 ^ -1126316131;
      var10005 = -600636596 ^ 873994492 ^ -2124155969;
      String var1279 = "dek";
      var10006 = (int)-4850778818089570722L ^ 570018242 ^ 2077836832;
      var10008 = 923104588 ^ -1325213227 ^ -2046317419;
      var10008 = -2089121270 ^ 1511245610 ^ -647410398;
      var10008 = 427937714 ^ -861221776 ^ -718601266;
      var10008 = 2030739012 ^ -674613152 ^ -1363106260;
      var10007 = 1308643758 ^ -901086276 ^ -1896990706;
      var10009 = (int)-5474126970532135716L ^ 440797474 ^ 407762427;
      var10009 = (int)4391046494408046090L ^ -333948467 ^ 2003972055;
      String var963 = c(
         "\uee5dл…ј\uee4bл…±\uee41л•©\uee39л…±\uee4aл…±\uee47л…±",
         "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ",
         var10005,
         var10006,
         var10007,
         -1587046021 ^ -1421162955 ^ 174909557
      );
      String[] var1026 = new String[-1709224233 ^ -1805608185 ^ 243258836];
      var10006 = -2121541890 ^ 2078781787 ^ -93558875;
      var10007 = (int)5507391707897037712L ^ -1600823228 ^ -528061211;
      var10008 = (int)7342289397156275586L ^ 1518946635 ^ 269943512;
      String var1723 = "del";
      var10009 = (int)8881871212558203767L ^ -1819009243 ^ -1081062307;
      var10010 = (1952006042 ^ 296194155 ^ -128107705) * (1952006042 ^ 296194155 ^ -128107705);
      var10010 = (int)6184316788837404970L ^ -204694272 ^ -1487747244;
      String var1980 = "dem";
      var10011 = -1322541207 ^ -1364248531 ^ 235766111;
      var10012 = (int)2604674380841109885L ^ -2053641813 ^ 909681788;
      var1026[var10006] = c(
         "\uee5dвљє\uee4dвљґ\uee45в›Ћ\uee3fвљ·\uee3aвљІ\uee4dв›Ђ",
         "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ",
         var10009,
         var10010,
         var10011,
         1457848964 ^ 1532335563 ^ 229029810
      );
      var10006 = (int)4026856655898890569L ^ -1910523274 ^ -1772426434;
      var10008 = -1271080795 ^ 1294955612 ^ -116151053;
      var10008 = (int)2154231826422886781L ^ -1942461923 ^ 905876336;
      var10008 = (int)-7522040256509321832L ^ 1163117505 ^ 968957524;
      var10008 = (int)-3837365027410013709L ^ -1014430634 ^ 2016482726;
      var10008 = ((int)5379398023181335543L ^ -2140211017 ^ -691127453) * ((int)5379398023181335543L ^ -2140211017 ^ -691127453);
      var10009 = (int)-8972337118884559422L ^ -246613265 ^ 1303357969;
      var10009 = (int)-4584390363447865433L ^ 1198145283 ^ -992634709;
      var10010 = ((int)-9004779206735470483L ^ 1178460554 ^ 250386389) * ((int)-9004779206735470483L ^ 1178460554 ^ 250386389);
      var10010 = -1775941780 ^ -2032007692 ^ -981887100;
      var10011 = ((int)-242155509972270077L ^ 1262066366 ^ -2081357618) * ((int)-242155509972270077L ^ 1262066366 ^ -2081357618);
      var10011 = (int)2457487697272169603L ^ 1275586441 ^ 17073130;
      String var2050 = "den";
      var1026[var10006] = c(
         "\uee6c\uecdc\uee4a\ue8c9\uee47\uecd7\uee46\uecd2\uee45\uecde\uee45\uecd0",
         "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ",
         var10009,
         var10010,
         var10011,
         (int)-3399114650672489942L ^ -597830790 ^ -610458677
      );
      var10006 = -2042931455 ^ 193224443 ^ -1916859912;
      var10007 = (int)-2085720297241350184L ^ 235999188 ^ 203482834;
      var10009 = 1714496858 ^ 508880765 ^ 2019934767;
      var10010 = 875776661 ^ -1611564627 ^ -1413336258;
      var10010 = (int)-895000204585976189L ^ -434266451 ^ -1377984480;
      var10010 = (int)7274083521704820992L ^ 1888452970 ^ 691175526;
      var10010 = (int)5790363764298609422L ^ 1685792516 ^ 1597297664;
      var10009 = -130271561 ^ 1110670671 ^ -750279689;
      var10010 = (1669809465 ^ 200007009 ^ 106401542) * (1669809465 ^ 200007009 ^ 106401542);
      var10010 = (int)-1943036091917533714L ^ -1252393434 ^ 1939292243;
      var10012 = 718367572 ^ 1928594266 ^ 1478846492;
      var10012 = (int)-4884292420334537316L ^ 370241010 ^ -322774942;
      var10012 = -902543579 ^ 188307794 ^ -1056104839;
      var10011 = -1732975397 ^ -895201096 ^ 1135452037;
      var10012 = (-1727597558 ^ -814985380 ^ -1842166040) * (-1727597558 ^ -814985380 ^ -1842166040);
      var1026[var10006] = c(
         "\uee6cеЅќ\uee4aе­€\uee39еЅђ\uee4aеЅђ\uee47еЅђ",
         "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ",
         var10009,
         var10010,
         var10011,
         (int)3623003343071288227L ^ -201787231 ^ -1608140264
      );
      var10006 = (int)4784155892257740154L ^ -553823843 ^ 1658848484;
      var10008 = (int)9177573050518764824L ^ -1534372763 ^ 752167278;
      var10008 = (-32342659 ^ 1687996420 ^ -532017133) * (-32342659 ^ 1687996420 ^ -532017133);
      String var1729 = "deo";
      var10009 = (int)-611922690108649265L ^ 1109574105 ^ 427342105;
      var10010 = (int)318596111350213892L ^ -534062335 ^ 807188786;
      var10010 = -1510048533 ^ 433553649 ^ 1776286485;
      var10011 = (1199265211 ^ 1118512832 ^ 1492266320) + ((int)5968434014946915352L ^ 150693999 ^ -329991521);
      var10011 = (int)1705569804751768801L ^ -1523862278 ^ -859970804;
      var10012 = (int)-2934142805384689789L ^ -1532201220 ^ -1185359802;
      var1026[var10006] = c(
         "\uee62бЄј\uee45бЄѕ\uee32б«Љ\uee48б«Ѓ\uee45б«‰",
         "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ",
         var10009,
         var10010,
         var10011,
         (int)4936405250737291552L ^ 2038580697 ^ -1537435529
      );
      var10005 = ((int)1852223585641377274L ^ -718139921 ^ -416129157) * ((int)1852223585641377274L ^ -718139921 ^ -416129157);
      var10006 = (-1835819599 ^ 224371413 ^ -21625370) + (-1040296006 ^ 615358818 ^ 390720269);
      var10008 = 2017006908 ^ -622504256 ^ -1562622988;
      var10008 = (int)-1733643149491813098L ^ -1984305766 ^ 721002628;
      var10007 = (int)895299851109893778L ^ 1769185762 ^ -1729704065;
      var10008 = ((int)5911947093313133325L ^ -221215987 ^ -1716228562) * ((int)5911947093313133325L ^ -221215987 ^ -1716228562);
      var10008 = (int)-7377431628552530437L ^ 353165139 ^ -1445379035;
      var10009 = ((int)1577045734758886083L ^ -478450828 ^ 1722427840) * ((int)1577045734758886083L ^ -478450828 ^ 1722427840);
      var10009 = (int)-1543090747516709176L ^ 186267203 ^ 244153598;
      String var1877 = "dep";
      this.A = new ModeSetting(
            var963,
            var1026,
            c(
               "\uee5dк‰‹\uee4dк‰…\uee45к€ї\uee3fк‰†\uee3aк‰ѓ\uee4dк€±",
               "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ",
               var10007,
               var10008,
               var10009,
               -768942501 ^ 1506760861 ^ -1947458870
            )
         )
         .a(
            () -> {
               if (this.f.a()) {
                  ModeSetting var10000 = this.e;
                  int var10001 = (int)4297910673296887320L;
                  int var2x = 280435721;
                  int var1x = var10001;
                  var10001 = (var1x | var2x) - (var1x & var2x);
                  var2x = -1759048762;
                  var1x = var10001;
                  var10001 = ((var1x | var2x) & ~(var1x & var2x)) * ((var1x | var2x) & ~(var1x & var2x));
                  int var10002 = (int)2092320142410216483L;
                  var2x = 2078855107;
                  var1x = var10002;
                  var10002 = var1x & ~var2x | ~var1x & var2x;
                  var2x = 1274702914;
                  var1x = var10002;
                  var10002 = var1x & ~var2x | ~var1x & var2x;
                  int var10003x = (int)4775265400560280602L;
                  var2x = 834471315;
                  var1x = var10003x;
                  var10003x = var1x & ~var2x | ~var1x & var2x;
                  var2x = -1505059030;
                  var1x = var10003x;
                  var2x = var1x & ~var2x | ~var1x & var2x;
                  var1x = var10002;
                  var10002 = (var1x & ~var2x) + (var2x & ~var1x) + 2 * (var1x & var2x);
                  var2x = -78977541;
                  var1x = 2003050980;
                  int var10004x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = -1943092197;
                  var1x = var10004x;
                  var10004x = var1x & ~var2x | ~var1x & var2x;
                  var2x = 794702846;
                  var1x = 143995081;
                  var10004x = var1x & ~var2x | ~var1x & var2x;
                  var2x = 667616058;
                  var1x = var10004x;
                  var10004x = (var1x | var2x) - (var1x & var2x);
                  var2x = -1304905302;
                  var1x = -1412605233;
                  var10004x = var1x + var2x - 2 * (var1x & var2x);
                  var2x = 435544941;
                  var1x = var10004x;
                  var10004x = var1x + var2x - 2 * (var1x & var2x);
                  var2x = -1283323136;
                  var1x = -2078517581;
                  var10003x = var1x + var2x - 2 * (var1x & var2x);
                  var2x = 1591129532;
                  var1x = var10003x;
                  var10003x = var1x & ~var2x | ~var1x & var2x;
                  var2x = -1693410178;
                  var1x = -494621211;
                  int var10005x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = 2039755153;
                  var1x = var10005x;
                  var10005x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = -1962661999;
                  var1x = 1328909614;
                  var10005x = (var1x | var2x) - (var1x & var2x);
                  var2x = -1003377990;
                  var1x = var10005x;
                  var10005x = (var1x | var2x) & ~(var1x & var2x);
                  var10004x = (int)-2943358845080138284L;
                  var2x = -2143747510;
                  var1x = var10004x;
                  var10004x = (var1x | var2x) - (var1x & var2x);
                  var2x = 1294742786;
                  var1x = var10004x;
                  var10004x = var1x & ~var2x | ~var1x & var2x;
                  String var93x = "dhu";
                  var10005x = (int)-6847378587649528975L;
                  var2x = -1478870156;
                  var1x = var10005x;
                  var10005x = var1x & ~var2x | ~var1x & var2x;
                  var2x = -1180591212;
                  var1x = var10005x;
                  var10005x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = -1633112696;
                  var1x = -764039353;
                  int var10006x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = 626487012;
                  var1x = var10006x;
                  var10006x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = -857057777;
                  var1x = 1401241765;
                  int var10007x = var1x & ~var2x | ~var1x & var2x;
                  var2x = 22805564;
                  var1x = var10007x;
                  var2x = var1x & ~var2x | ~var1x & var2x;
                  var1x = var10006x;
                  var10006x = var1x - ~var2x - 1;
                  var2x = 763080311;
                  var1x = -1057823983;
                  var10006x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = -307297752;
                  var1x = var10006x;
                  if (var10000.b(
                     c(
                        "жјЇм ±жј€м±‘жЅ±мЎЊжјЋм °жј…м±‘жЅІмЎЏжЅІмЎ„жјЊмЎЃ",
                        "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ",
                        var10003x,
                        var10004x,
                        var10005x,
                        (var1x | var2x) - (var1x & var2x)
                     )
                  )) {
                     int var72x = (int)-7350478229616046121L;
                     var2x = -1689639873;
                     var1x = var72x;
                     int var73x = var1x + var2x - 2 * (var1x & var2x);
                     var2x = 959736809;
                     var1x = var73x;
                     return Boolean.valueOf(pulse.Bool.from((var1x | var2x) & ~(var1x & var2x)));
                  }
               }

               int var69x = (int)-8261348461617584801L;
               int var65x = -533724932;
               int var32x = var69x;
               var69x = var32x & ~var65x | ~var32x & var65x;
               var65x = -610245213;
               var32x = var69x;
               return Boolean.valueOf(pulse.Bool.from((var32x | var65x) & ~(var32x & var65x)));
            }
         );
      var10003 = -1203180551 ^ -1580176456 ^ -1868502030;
      var10004 = (-991849858 ^ 585147372 ^ 1031737794) + ((int)1656458573998857474L ^ -782935078 ^ -1150471742);
      var10005 = ((int)-2349472216011018552L ^ -927471245 ^ -241680112) * ((int)-2349472216011018552L ^ -927471245 ^ -241680112);
      var10005 = (int)7010780613175884823L ^ 460518551 ^ -592371569;
      var10007 = -919229290 ^ -1384052400 ^ 1689560514;
      var10007 = 1766888087 ^ -772253006 ^ -1196898252;
      var10007 = (int)-3678913095677574779L ^ 65945592 ^ -9093518;
      var10007 = (int)-5019728125814967175L ^ 791869232 ^ 1357906752;
      var10007 = (int)-7792480905788297512L ^ -1495693230 ^ -1381964133;
      var10006 = 59556246 ^ 1663073397 ^ -1250878285;
      String var1434 = "deq";
      var10007 = 857564826 ^ -802246233 ^ -513958664;
      var10009 = (int)3891477092289309132L ^ 1481531478 ^ 1899432331;
      var10009 = (int)8835655910971458870L ^ -188175904 ^ 801139925;
      var10009 = (int)-1620710682014773452L ^ 415266225 ^ -1575716204;
      var10009 = 11300264 ^ -861330103 ^ -872068895;
      var10009 = -1725200870 ^ -1506854190 ^ 1057275079;
      String var965 = c(
         "\uee67л‚ѓ\uee46л‚…\uee3aл‚€\uee3cлѓї\uee4fл‚ѓ",
         "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ",
         var10005,
         var10006,
         var10007,
         (int)-2646048435686710641L ^ 965797135 ^ -1379126961
      );
      String var1028 = "der";
      var10006 = (-1651003419 ^ 1104127854 ^ 803515767) * (-1651003419 ^ 1104127854 ^ 803515767);
      this.B = new SliderSetting(var965, 4.0F, 1.0F, 20.0F, 1.0F)
         .a(
            () -> {
               if (this.f.a()) {
                  ModeSetting var10000 = this.e;
                  int var10001 = (int)893031037644039936L;
                  int var2x = -731353669;
                  int var1x = var10001;
                  var10001 = var1x + var2x - 2 * (var1x & var2x);
                  var2x = 580055823;
                  var1x = var10001;
                  var10001 = var1x & ~var2x | ~var1x & var2x;
                  String var10002 = "dhs";
                  int var10004x = (int)-1293465283188295639L;
                  var2x = 1812027994;
                  var1x = var10004x;
                  var10004x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = -29121927;
                  var1x = var10004x;
                  var10004x = var1x & ~var2x | ~var1x & var2x;
                  int var10003x = (int)4201713211629074701L;
                  var2x = -456707227;
                  var1x = var10003x;
                  var10003x = (var1x | var2x) - (var1x & var2x);
                  var2x = 246981223;
                  var1x = var10003x;
                  var10003x = (var1x | var2x) - (var1x & var2x);
                  var10004x = (int)-1778466662745533266L;
                  var2x = 703033896;
                  var1x = var10004x;
                  var10004x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = 919869170;
                  var1x = var10004x;
                  var10004x = var1x & ~var2x | ~var1x & var2x;
                  int var10005x = (int)6982206072982944694L;
                  var2x = 1517180947;
                  var1x = var10005x;
                  var10005x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = -1404153014;
                  var1x = var10005x;
                  var2x = (var1x | var2x) - (var1x & var2x);
                  var1x = var10004x;
                  var10004x = (var1x ^ var2x) + 2 * (var1x & var2x);
                  var2x = 1565043467;
                  var1x = -1294991827;
                  var10004x = (var1x | var2x) - (var1x & var2x);
                  var2x = -1160299369;
                  var1x = var10004x;
                  var10004x = var1x & ~var2x | ~var1x & var2x;
                  var10005x = (int)1812635710420593979L;
                  var2x = -1247628313;
                  var1x = var10005x;
                  var10005x = (var1x | var2x) - (var1x & var2x);
                  var2x = 1598750259;
                  var1x = var10005x;
                  var10005x = var1x & ~var2x | ~var1x & var2x;
                  var2x = 1894880579;
                  var1x = -230265173;
                  int var10006x = var1x + var2x - 2 * (var1x & var2x);
                  var2x = -118330179;
                  var1x = var10006x;
                  var2x = (var1x | var2x) & ~(var1x & var2x);
                  var1x = var10005x;
                  var10005x = (var1x & ~var2x) + (var2x & ~var1x) + 2 * (var1x & var2x);
                  var2x = -1769024182;
                  var1x = -2032970825;
                  var10005x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = 505853033;
                  var1x = var10005x;
                  var10005x = (var1x | var2x) & (~var1x | ~var2x);
                  String var77x = "dht";
                  var2x = -1246872459;
                  var1x = 1775994324;
                  var10006x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = -595638333;
                  var1x = var10006x;
                  if (var10000.b(
                     c(
                        "жЅђзҐўжЅ·зґ‚жјЋз¤џжЅ±зҐЈжЅєзґ‚жјЌз¤њжјЌз¤—жЅіз¤’",
                        "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ",
                        var10003x,
                        var10004x,
                        var10005x,
                        var1x & ~var2x | ~var1x & var2x
                     )
                  )) {
                     int var56x = (int)3416900944740570473L;
                     var2x = 340724336;
                     var1x = var56x;
                     int var57x = var1x & ~var2x | ~var1x & var2x;
                     var2x = 1471831832;
                     var1x = var57x;
                     return Boolean.valueOf(pulse.Bool.from((var1x | var2x) & ~(var1x & var2x)));
                  }

                  if (b) {
                     throw new RuntimeException();
                  }
               }

               int var53x = (int)7705311763780431775L;
               int var49x = -77187594;
               int var24x = var53x;
               var53x = (var24x | var49x) - (var24x & var49x);
               var49x = 2023971433;
               var24x = var53x;
               return Boolean.valueOf(pulse.Bool.from(var24x + var49x - 2 * (var24x & var49x)));
            }
         );
      String var966 = "des";
      var10005 = (int)2739051386968987575L ^ -1149517445 ^ -693627195;
      var10005 = 1998194246 ^ 1780815386 ^ 490672218;
      var10005 = (int)7567782581762048532L ^ 936599976 ^ -1132223553;
      var10005 = ((int)-471759528473863037L ^ 1586019848 ^ 1389864899) * ((int)-471759528473863037L ^ 1586019848 ^ 1389864899);
      var10005 = (int)4394725218512401303L ^ -1705553412 ^ -1107408284;
      String var1288 = "det";
      var10006 = -1430568833 ^ -1742935744 ^ -418796473;
      var10007 = (int)-2814310200021435672L ^ 645518081 ^ -813434675;
      var10007 = 1340344320 ^ 1267993100 ^ 511147103;
      String var1593 = "deu";
      String var967 = c(
         "\uee5dбІµ\uee4aбІ№\uee48бі…",
         "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ",
         var10005,
         var10006,
         var10007,
         (int)-3975593771193172736L ^ 1663275424 ^ 1004729943
      );
      var10004 = 816511473 ^ 1972424409 ^ -514094040;
      String var1138 = "dev";
      String var1290 = "dew";
      String var1438 = "dex";
      this.C = new SliderSetting(var967, 0.3F, 0.1F, 0.75F, 0.05F)
         .a(
            () -> {
               if (this.f.a()) {
                  ModeSetting var10000 = this.e;
                  int var10002 = (int)7209157556035801827L;
                  int var2x = 1877854060;
                  int var1x = var10002;
                  var10002 = (var1x | var2x) & ~(var1x & var2x);
                  var2x = -1766091378;
                  var1x = var10002;
                  var10002 = var1x & ~var2x | ~var1x & var2x;
                  var2x = -536598467;
                  var1x = 743400436;
                  var10002 = (var1x | var2x) & ~(var1x & var2x);
                  var2x = -867480632;
                  var1x = var10002;
                  var10002 = var1x & ~var2x | ~var1x & var2x;
                  var10002 = (int)6761110733075730827L;
                  var2x = 500751393;
                  var1x = var10002;
                  var10002 = var1x + var2x - 2 * (var1x & var2x);
                  var2x = -774402642;
                  var1x = var10002;
                  var10002 = (var1x | var2x) & ~(var1x & var2x);
                  var2x = 2003373246;
                  var1x = 1116397868;
                  var10002 = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = 904129920;
                  var1x = var10002;
                  var10002 = (var1x | var2x) & ~(var1x & var2x);
                  int var10003x = (int)842177222662817536L;
                  var2x = 756269540;
                  var1x = var10003x;
                  var10003x = var1x + var2x - 2 * (var1x & var2x);
                  var2x = -5388576;
                  var1x = var10003x;
                  var10003x = (var1x | var2x) & (~var1x | ~var2x);
                  var10003x = (int)-6488639444384720291L;
                  var2x = 1972109094;
                  var1x = var10003x;
                  var10003x = var1x & ~var2x | ~var1x & var2x;
                  var2x = -866671233;
                  var1x = var10003x;
                  var10003x = var1x & ~var2x | ~var1x & var2x;
                  var2x = 1751604526;
                  var1x = -1930452820;
                  var10003x = var1x + var2x - 2 * (var1x & var2x);
                  var2x = -460784241;
                  var1x = var10003x;
                  var10003x = (var1x | var2x) & ~(var1x & var2x);
                  int var10004x = (int)624716842382336418L;
                  var2x = 1718758380;
                  var1x = var10004x;
                  var10004x = var1x & ~var2x | ~var1x & var2x;
                  var2x = -451605937;
                  var1x = var10004x;
                  var10004x = (var1x | var2x) - (var1x & var2x);
                  var10004x = (int)8030188625204854200L;
                  var2x = -671560898;
                  var1x = var10004x;
                  var10004x = var1x & ~var2x | ~var1x & var2x;
                  var2x = -1823508853;
                  var1x = var10004x;
                  var10004x = var1x & ~var2x | ~var1x & var2x;
                  var2x = 2094306255;
                  var1x = -954755062;
                  var10004x = (var1x | var2x) - (var1x & var2x);
                  var2x = -1144845356;
                  var1x = var10004x;
                  var10004x = (var1x | var2x) & (~var1x | ~var2x);
                  var10003x = (int)8294859657941146804L;
                  var2x = 723613629;
                  var1x = var10003x;
                  var10003x = var1x + var2x - 2 * (var1x & var2x);
                  var2x = 1864712966;
                  var1x = var10003x;
                  var10003x = (var1x | var2x) & (~var1x | ~var2x);
                  String var103x = "dhr";
                  var10004x = (int)-6126641689186938246L;
                  var2x = 1300191735;
                  var1x = var10004x;
                  var10004x = (var1x | var2x) - (var1x & var2x);
                  var2x = 166441094;
                  var1x = var10004x;
                  var10004x = var1x & ~var2x | ~var1x & var2x;
                  var2x = -1598119560;
                  var1x = 50422501;
                  int var10005x = var1x + var2x - 2 * (var1x & var2x);
                  var2x = 1152013006;
                  var1x = var10005x;
                  var10005x = var1x & ~var2x | ~var1x & var2x;
                  var2x = 656365166;
                  var1x = 1168071325;
                  var10005x = var1x + var2x - 2 * (var1x & var2x);
                  var2x = 1793056190;
                  var1x = var10005x;
                  var10005x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = -1008117211;
                  var1x = -625942381;
                  int var10007x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = 425310898;
                  var1x = var10007x;
                  var10007x = var1x + var2x - 2 * (var1x & var2x);
                  int var10006x = (int)8524466997824341979L;
                  var2x = 837851399;
                  var1x = var10006x;
                  var10006x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = -652537497;
                  var1x = var10006x;
                  if (var10000.b(
                     c(
                        "жЅ‘дўєжЅ¶діљжјЏдЈ‡жЅ°дў»жЅ»діљжјЊдЈ„жјЊдЈЏжЅІдЈЉ",
                        "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ",
                        var10003x,
                        var10004x,
                        var10005x,
                        (var1x | var2x) - (var1x & var2x)
                     )
                  )) {
                     int var75x = (int)5859710838391591609L;
                     var2x = -91700519;
                     var1x = var75x;
                     int var76x = (var1x | var2x) - (var1x & var2x);
                     var2x = -631336863;
                     var1x = var76x;
                     return Boolean.valueOf(pulse.Bool.from(var1x & ~var2x | ~var1x & var2x));
                  }
               }

               int var69x = 2084119401;
               int var34x = 1643064421;
               int var73x = var34x + var69x - 2 * (var34x & var69x);
               var69x = 500567820;
               var34x = var73x;
               return Boolean.valueOf(pulse.Bool.from((var34x | var69x) & ~(var34x & var69x)));
            }
         );
      var10004 = (int)-5068632197489072883L ^ 1082882647 ^ 1124409163;
      var10004 = -1141974247 ^ -362309539 ^ 1367950153;
      var10004 = ((int)-7726690206279456445L ^ -355407707 ^ -367894423) + (1294553811 ^ -1487421869 ^ -965291067);
      String var1139 = "dey";
      var10005 = -2130324597 ^ -283196989 ^ 122944071;
      String var1291 = "dez";
      var10006 = (int)5478471183609200762L ^ -321654390 ^ -767108443;
      var10007 = (-2127675992 ^ 1666545269 ^ 155548417) + (1087281029 ^ -333372256 ^ 1641561197);
      var10007 = (int)9073614426037729923L ^ 86175135 ^ 417984789;
      var10008 = (425712707 ^ -355551973 ^ 1616936938) + ((int)2261804517507751193L ^ -1212933822 ^ -473067963);
      String var968 = c(
         "\uee6fм›¦\uee48мљљ\uee32мЉ†\uee4bмљћ\uee4aмљ›\uee45",
         "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ",
         var10005,
         var10006,
         var10007,
         -1730784006 ^ 1843133552 ^ -183736226
      );
      String var1033 = "dfa";
      var10005 = (170267338 ^ 1870273568 ^ 2119828054) * (170267338 ^ 1870273568 ^ 2119828054);
      var10007 = (int)347513394101629207L ^ 973702103 ^ 1553103;
      var10007 = 251381651 ^ 567302692 ^ 791387571;
      var10007 = (int)3579586019241146311L ^ -1057619758 ^ 522499864;
      String var1444 = "dfb";
      this.D = new SliderSetting(var968, 20.0F, 10.0F, 50.0F, 5.0F)
         .a(
            () -> {
               if (this.f.a()) {
                  int var10001 = (int)-7404574986825750659L;
                  int var4x = 1284188554;
                  int var3x = var10001;
                  var10001 = var3x + var4x - 2 * (var3x & var4x);
                  var4x = -365056835;
                  var3x = var10001;
                  var10001 = var3x + var4x - 2 * (var3x & var4x);
                  var4x = -961618726;
                  var3x = -435744628;
                  int var10002 = (var3x | var4x) - (var3x & var4x);
                  var4x = 429355078;
                  var3x = var10002;
                  var4x = var3x + var4x - 2 * (var3x & var4x);
                  var3x = var10001;
                  var10001 = (var3x ^ var4x) + 2 * (var3x & var4x);
                  var4x = 406286596;
                  var3x = -1417694807;
                  var10002 = (var3x | var4x) - (var3x & var4x);
                  var4x = -1040523299;
                  var3x = var10002;
                  var10002 = var3x & ~var4x | ~var3x & var4x;
                  var4x = 1930971217;
                  var3x = 1249418112;
                  int var10003x = var3x & ~var4x | ~var3x & var4x;
                  var4x = -1625443164;
                  var3x = var10003x;
                  var10003x = (var3x | var4x) & (~var3x | ~var4x);
                  var4x = 1228625003;
                  var3x = 1597952055;
                  var10003x = var3x + var4x - 2 * (var3x & var4x);
                  var4x = 2135780435;
                  var3x = var10003x;
                  var10003x = (var3x | var4x) & ~(var3x & var4x);
                  int var10004x = (int)3809496364024706117L;
                  var4x = 1564131843;
                  var3x = var10004x;
                  var10004x = var3x + var4x - 2 * (var3x & var4x);
                  var4x = 1116327347;
                  var3x = var10004x;
                  var10004x = var3x + var4x - 2 * (var3x & var4x);
                  var4x = 1999262263;
                  var3x = 1986451368;
                  var10004x = var3x + var4x - 2 * (var3x & var4x);
                  var4x = 1411746992;
                  var3x = var10004x;
                  var10004x = var3x + var4x - 2 * (var3x & var4x);
                  var4x = 1026615354;
                  var3x = 771338860;
                  int var10005x = (var3x | var4x) & ~(var3x & var4x);
                  var4x = -2064871677;
                  var3x = var10005x;
                  var10005x = (var3x + var4x - 2 * (var3x & var4x)) * (var3x + var4x - 2 * (var3x & var4x));
                  var10005x = (int)3066352271570692062L;
                  var4x = -1376146799;
                  var3x = var10005x;
                  var10005x = (var3x | var4x) & ~(var3x & var4x);
                  var4x = -1352606044;
                  var3x = var10005x;
                  var10005x = (var3x | var4x) & ~(var3x & var4x);
                  int var10006x = (int)-7674908385356436694L;
                  var4x = 2020220172;
                  var3x = var10006x;
                  var10006x = (var3x | var4x) - (var3x & var4x);
                  var4x = -453199069;
                  var3x = var10006x;
                  var10006x = (var3x | var4x) - (var3x & var4x);
                  var4x = -483514451;
                  var3x = 803562086;
                  int var10007x = (var3x | var4x) & ~(var3x & var4x);
                  var4x = 871241239;
                  var3x = var10007x;
                  var4x = var3x + var4x - 2 * (var3x & var4x);
                  var3x = var10006x;
                  var10006x = (var3x ^ var4x) + 2 * (var3x & var4x);
                  var10006x = (int)1535235039461550052L;
                  var4x = -1562121463;
                  var3x = var10006x;
                  var10006x = (var3x | var4x) & ~(var3x & var4x);
                  var4x = -954805965;
                  var3x = var10006x;
                  if (this.e
                     .b(
                        c(
                           "жЅ’\u1adcжЅµбєјжјЊбЄЎжЅі\u1addжЅёбєјжјЏбЄўжјЏбЄ©жЅ±бЄ¬",
                           "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ",
                           var10003x,
                           var10004x,
                           var10005x,
                           (var3x | var4x) - (var3x & var4x)
                        )
                     )) {
                     var4x = 419447460;
                     var3x = 554563497;
                     int var102x = var3x + var4x - 2 * (var3x & var4x);
                     var4x = 940422412;
                     var3x = var102x;
                     return Boolean.valueOf(pulse.Bool.from(var3x & ~var4x | ~var3x & var4x));
                  }

                  String var10000 = "dhq";
                  int var89x = (int)-6492673927038122680L;
                  var4x = -2071098387;
                  var3x = var89x;
                  int var90x = var3x & ~var4x | ~var3x & var4x;
                  var4x = 1296407570;
                  var3x = var90x;
                  int var2x = var3x + var4x - 2 * (var3x & var4x);
                  int var91x = (int)8576428619142568789L;
                  var4x = 5592281;
                  var3x = var91x;
                  int var92x = var3x + var4x - 2 * (var3x & var4x);
                  var4x = -914385309;
                  var3x = var92x;
                  int var93x = (var3x | var4x) & ~(var3x & var4x);
                  var4x = -315641288;
                  var3x = 1511146776;
                  var10001 = (var3x | var4x) - (var3x & var4x);
                  var4x = 409718376;
                  var3x = var10001;
                  var4x = (var3x | var4x) & ~(var3x & var4x);
                  var3x = var93x;
                  int var94x = (var3x | var4x) + (var3x & var4x);
                  var4x = -318317056;
                  var3x = -514136047;
                  int var95x = var3x & ~var4x | ~var3x & var4x;
                  var4x = 899659222;
                  var3x = var95x;
                  if (((var3x | var4x) & ~(var3x & var4x)) >= var2x) {
                     int var96x = (int)-2510620307232057125L;
                     var4x = 1022542951;
                     var3x = var96x;
                     int var97x = (var3x | var4x) & (~var3x | ~var4x);
                     var4x = -645931844;
                     var3x = var97x;
                     int var98x = (var3x | var4x) - (var3x & var4x);
                     var4x = -1953256495;
                     var3x = -1302316651;
                     var10001 = var3x & ~var4x | ~var3x & var4x;
                     var4x = 972264004;
                     var3x = var10001;
                     int var99x = var98x / (var3x & ~var4x | ~var3x & var4x);
                  }
               }

               int var85x = 1913707812;
               int var43x = -1248400980;
               int var100x = var43x + var85x - 2 * (var43x & var85x);
               var85x = -947506040;
               var43x = var100x;
               return Boolean.valueOf(pulse.Bool.from(var43x + var85x - 2 * (var43x & var85x)));
            }
         );
      String var969 = "dfc";
      var10004 = ((int)6297286857720297414L ^ -1135150235 ^ 532067057) + ((int)-7825701692991678562L ^ -602954054 ^ -1902329694);
      var10006 = -496007601 ^ 1941407171 ^ -1848114297;
      var10006 = -1831334218 ^ -1519764345 ^ 934425123;
      var10006 = -2134798172 ^ -230583788 ^ 1920991929;
      var10005 = (int)1948931506021929478L ^ 1048048697 ^ -1421996496;
      var10006 = (int)-3209265204425235303L ^ 260390727 ^ -58317110;
      var10006 = 195163407 ^ 1874761751 ^ -1309445518;
      var10007 = (-86911624 ^ -815938963 ^ -2143247033) + (1752897158 ^ 1955736551 ^ 1870032621);
      var10007 = (int)8150188922094248423L ^ -853913044 ^ 2039010084;
      var10009 = (int)6623569611136264556L ^ 1329078214 ^ -1746831699;
      var10009 = (int)-5939820141668069870L ^ 334849906 ^ 702507370;
      String var970 = c(
         "\uee5cгЉЈ\uee46гЉ«\uea5dг‹›\uee4dгЉ¬\uee46г‹Љ\uee3fгЉ«",
         "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ",
         var10005,
         var10006,
         var10007,
         -1490946402 ^ -1385686235 ^ 168614226
      );
      var10004 = (182268850 ^ 966868851 ^ 748410499) + ((int)-7310130379043576029L ^ 118793832 ^ -325975807);
      String var1143 = "dfd";
      var10007 = (int)4092390193184456715L ^ -1568815898 ^ 1634764029;
      var10007 = (int)-5742833739645063269L ^ 934570825 ^ 937919702;
      var10007 = -1891053534 ^ 1559591975 ^ -742544383;
      var10007 = (-177312969 ^ 241644596 ^ -1762241019) * (-177312969 ^ 241644596 ^ -1762241019);
      this.E = new SliderSetting(var970, 0.3F, 0.15F, 0.35F, 0.01F)
         .a(
            () -> {
               if (this.f.a()) {
                  ModeSetting var10000 = this.e;
                  int var2x = -323810124;
                  int var1x = 557310841;
                  int var10002 = (var1x | var2x) & ~(var1x & var2x);
                  var2x = -846925884;
                  var1x = var10002;
                  var10002 = (var1x | var2x) - (var1x & var2x);
                  var2x = 893531809;
                  var1x = 1163604358;
                  var10002 = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = 1880688431;
                  var1x = var10002;
                  var10002 = (var1x | var2x) - (var1x & var2x);
                  var2x = -1422970065;
                  var1x = 1443211816;
                  var10002 = var1x & ~var2x | ~var1x & var2x;
                  var2x = -47539959;
                  var1x = var10002;
                  var10002 = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = 1812907792;
                  var1x = -1196613439;
                  var10002 = (var1x | var2x) & ~(var1x & var2x);
                  var2x = -983380623;
                  var1x = var10002;
                  var10002 = ((var1x | var2x) - (var1x & var2x)) * ((var1x | var2x) - (var1x & var2x));
                  int var10003x = (int)6222594285105732710L;
                  var2x = 658020718;
                  var1x = var10003x;
                  var10003x = (var1x | var2x) - (var1x & var2x);
                  var2x = -1384239639;
                  var1x = var10003x;
                  var10003x = (var1x | var2x) & ~(var1x & var2x);
                  var10003x = (int)4739410147857835635L;
                  var2x = 48282533;
                  var1x = var10003x;
                  var10003x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = 677049817;
                  var1x = var10003x;
                  var10003x = (var1x | var2x) & ~(var1x & var2x);
                  String var10004x = "dhp";
                  var2x = -2007480584;
                  var1x = 1456739502;
                  int var80x = var1x + var2x - 2 * (var1x & var2x);
                  var2x = -1947418609;
                  var1x = var80x;
                  int var81x = (var1x | var2x) - (var1x & var2x);
                  int var10006x = (int)-3309758672198585299L;
                  var2x = 579242693;
                  var1x = var10006x;
                  var10006x = var1x + var2x - 2 * (var1x & var2x);
                  var2x = 567492324;
                  var1x = var10006x;
                  var10006x = (var1x | var2x) - (var1x & var2x);
                  var2x = 2040298422;
                  var1x = 1235802408;
                  var10006x = (var1x | var2x) - (var1x & var2x);
                  var2x = 808755870;
                  var1x = var10006x;
                  var10006x = (var1x | var2x) & ~(var1x & var2x);
                  var10006x = (int)7774036714883148810L;
                  var2x = -74509920;
                  var1x = var10006x;
                  var10006x = var1x + var2x - 2 * (var1x & var2x);
                  var2x = -419725917;
                  var1x = var10006x;
                  var10006x = var1x + var2x - 2 * (var1x & var2x);
                  var10006x = (int)3595154308425920127L;
                  var2x = -14621002;
                  var1x = var10006x;
                  var10006x = var1x + var2x - 2 * (var1x & var2x);
                  var2x = 1431423168;
                  var1x = var10006x;
                  var10006x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = 1657882587;
                  var1x = -1117654543;
                  int var10005x = var1x & ~var2x | ~var1x & var2x;
                  var2x = -1036025233;
                  var1x = var10005x;
                  var10005x = var1x + var2x - 2 * (var1x & var2x);
                  var2x = -1178912329;
                  var1x = 278114290;
                  var10006x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = -423510788;
                  var1x = var10006x;
                  var10006x = (var1x | var2x) - (var1x & var2x);
                  var10006x = (int)-3613574790798689797L;
                  var2x = -1301288144;
                  var1x = var10006x;
                  var10006x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = 592967116;
                  var1x = var10006x;
                  if (var10000.b(
                     c(
                        "жЅ“кЂ„жЅґк‘¤жјЌкЃ№жЅІкЂ…жЅ№к‘¤жјЋкЃєжјЋкЃ±жЅ°кЃґ",
                        "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ",
                        var10003x,
                        var81x,
                        var10005x,
                        (var1x | var2x) & ~(var1x & var2x)
                     )
                  )) {
                     var2x = 1574407313;
                     var1x = 1555196897;
                     int var67x = var1x + var2x - 2 * (var1x & var2x);
                     var2x = 23455601;
                     var1x = var67x;
                     return Boolean.valueOf(pulse.Bool.from((var1x | var2x) & (~var1x | ~var2x)));
                  }
               }

               int var61x = -1538854374;
               int var30x = -209646220;
               int var65x = (var30x | var61x) - (var30x & var61x);
               var61x = 1472724846;
               var30x = var65x;
               return Boolean.valueOf(pulse.Bool.from((var30x | var61x) & (~var30x | ~var61x)));
            }
         );
      var10003 = (int)6378077968620186671L ^ -2142158615 ^ -361493104;
      var10004 = ((int)5083606636199258773L ^ 805785643 ^ 1118436795) + (1423798689 ^ 1128521524 ^ -894410420);
      var10005 = -1485237706 ^ 1871952204 ^ -796505495;
      var10005 = (int)-8678877286251862086L ^ -804591455 ^ -2038274284;
      var10006 = (1042591039 ^ 1614869072 ^ -2125711164) * (1042591039 ^ 1614869072 ^ -2125711164);
      var10006 = -1147899420 ^ -620170427 ^ -1255697680;
      var10007 = (int)-8915653391497732410L ^ -1606489797 ^ -472595221;
      var10007 = (int)-3165833989710032058L ^ -1376514109 ^ -1073223172;
      String var1595 = "dfe";
      this.F = new BooleanSetting(
            c(
               "\uee5bвЋђ\uee48вЏ \uea5dвЋ\uee46вЋљ\uee48вЋџ\uee3fвЋ’",
               "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ",
               var10005,
               var10006,
               var10007,
               (int)4045095684377837217L ^ -1259728536 ^ 1630554649
            ),
            pulse.Bool.from((int)7054989031923494243L ^ -1 ^ -1)
         )
         .a(
            () -> {
               if (this.f.a()) {
                  ModeSetting var10000 = this.e;
                  int var10002 = (int)-6526634523672183681L;
                  int var2x = -888662640;
                  int var1x = var10002;
                  var10002 = (var1x | var2x) - (var1x & var2x);
                  var2x = 1052764651;
                  var1x = var10002;
                  var10002 = (var1x | var2x) - (var1x & var2x);
                  var2x = -352708495;
                  var1x = 1377969915;
                  var10002 = var1x & ~var2x | ~var1x & var2x;
                  var2x = -1193787770;
                  var1x = var10002;
                  var10002 = var1x + var2x - 2 * (var1x & var2x);
                  var10002 = (int)-3709364762591647839L;
                  var2x = 1585393467;
                  var1x = var10002;
                  var10002 = var1x & ~var2x | ~var1x & var2x;
                  var2x = -1725921142;
                  var1x = var10002;
                  var10002 = (var1x | var2x) - (var1x & var2x);
                  var2x = -1748456962;
                  var1x = 2120268207;
                  var10002 = (var1x | var2x) - (var1x & var2x);
                  var2x = -374861736;
                  var1x = var10002;
                  var10002 = (var1x | var2x) & ~(var1x & var2x);
                  var10002 = (int)-2244634766036454683L;
                  var2x = 889290893;
                  var1x = var10002;
                  var10002 = var1x & ~var2x | ~var1x & var2x;
                  var2x = -1830407583;
                  var1x = var10002;
                  var10002 = var1x & ~var2x | ~var1x & var2x;
                  String var86x = "dhn";
                  int var10003x = (int)8313525122676664142L;
                  var2x = 288601009;
                  var1x = var10003x;
                  var10003x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = -658713029;
                  var1x = var10003x;
                  var10003x = var1x + var2x - 2 * (var1x & var2x);
                  var2x = 1641819915;
                  var1x = -1232202619;
                  int var10004x = var1x + var2x - 2 * (var1x & var2x);
                  var2x = -397730223;
                  var1x = var10004x;
                  var2x = var1x + var2x - 2 * (var1x & var2x);
                  var1x = var10003x;
                  var10003x = (var1x | var2x) + (var1x & var2x);
                  var10003x = (int)-5207602891998106910L;
                  var2x = -1187044724;
                  var1x = var10003x;
                  var10003x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = 324018273;
                  var1x = var10003x;
                  var10003x = var1x & ~var2x | ~var1x & var2x;
                  String var93x = "dho";
                  var10004x = (int)1959338469238088394L;
                  var2x = -195529136;
                  var1x = var10004x;
                  var10004x = (var1x | var2x) - (var1x & var2x);
                  var2x = 1284472345;
                  var1x = var10004x;
                  var10004x = var1x & ~var2x | ~var1x & var2x;
                  var2x = 1777575220;
                  var1x = -230012515;
                  int var10005x = (var1x | var2x) - (var1x & var2x);
                  var2x = 1993775908;
                  var1x = var10005x;
                  var10005x = (var1x | var2x) - (var1x & var2x);
                  var2x = 1841505416;
                  var1x = 1989919766;
                  var10005x = var1x & ~var2x | ~var1x & var2x;
                  var2x = 82885653;
                  var1x = var10005x;
                  var10005x = (var1x | var2x) & (~var1x | ~var2x);
                  int var10006x = (int)4182387890917511033L;
                  var2x = -1252709632;
                  var1x = var10006x;
                  var10006x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = -1726147914;
                  var1x = var10006x;
                  var10006x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = -1873218366;
                  var1x = -1965246665;
                  int var10007x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = -515813368;
                  var1x = var10007x;
                  var2x = (var1x | var2x) & (~var1x | ~var2x);
                  var1x = var10006x;
                  var10006x = (var1x & ~var2x) + (var2x & ~var1x) + 2 * (var1x & var2x);
                  var2x = -1078563063;
                  var1x = -204106522;
                  var10006x = var1x + var2x - 2 * (var1x & var2x);
                  var2x = 1279444191;
                  var1x = var10006x;
                  if (var10000.b(
                     c(
                        "жЅ”л ґжЅіл±”жјЉлЎ‰жЅµл µжЅѕл±”жј‰лЎЉжј‰лЎЃжЅ·лЎ„",
                        "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ",
                        var10003x,
                        var10004x,
                        var10005x,
                        var1x + var2x - 2 * (var1x & var2x)
                     )
                  )) {
                     int var72x = (int)7677340857088171443L;
                     var2x = -947744368;
                     var1x = var72x;
                     int var73x = var1x + var2x - 2 * (var1x & var2x);
                     var2x = -1982346206;
                     var1x = var73x;
                     return Boolean.valueOf(pulse.Bool.from(var1x & ~var2x | ~var1x & var2x));
                  }
               }

               int var69x = (int)-6970787902532006936L;
               int var65x = -336491923;
               int var32x = var69x;
               var69x = (var32x | var65x) & ~(var32x & var65x);
               var65x = 185385349;
               var32x = var69x;
               return Boolean.valueOf(pulse.Bool.from(var32x & ~var65x | ~var32x & var65x));
            }
         );
      var10003 = ((int)-2870661720242607373L ^ -1167793645 ^ -819933001) * ((int)-2870661720242607373L ^ -1167793645 ^ -819933001);
      var10005 = (int)-1125400110226792038L ^ -1862979279 ^ 1732907177;
      var10005 = (int)-1735249978234607177L ^ 1659588381 ^ -935778652;
      var10005 = (960535178 ^ -171962767 ^ 1122936348) * (960535178 ^ -171962767 ^ 1122936348);
      var10005 = -624973312 ^ -2020199198 ^ 878802669;
      String var1300 = "dff";
      var10006 = 1717314542 ^ 560798786 ^ -1831522693;
      var10007 = -1253855050 ^ -1536998557 ^ 1946708383;
      var10007 = (int)1674062578159361829L ^ -1381813076 ^ 855945293;
      var10008 = (524485109 ^ -532438598 ^ 1895865756) * (524485109 ^ -532438598 ^ 1895865756);
      this.G = new ColorSetting(
            c(
               "\uee67в„”\uee3cв…¦\uee43в„\uee40в…Ї\uee44в”„\uee3bв„–\uee48в…¦",
               "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ",
               var10005,
               var10006,
               var10007,
               -1267058267 ^ -129665797 ^ 1275226632
            ),
            Color.WHITE
         )
         .a(
            () -> {
               if (this.f.a()) {
                  int var10001 = (int)8720407004583091475L;
                  int var2x = 1416568080;
                  int var1x = var10001;
                  var10001 = (var1x | var2x) - (var1x & var2x);
                  var2x = -197503069;
                  var1x = var10001;
                  var10001 = (var1x | var2x) & ~(var1x & var2x);
                  int var10002 = (int)8175437140047445514L;
                  var2x = 194801898;
                  var1x = var10002;
                  var10002 = (var1x | var2x) & ~(var1x & var2x);
                  var2x = 593897076;
                  var1x = var10002;
                  var2x = (var1x | var2x) & ~(var1x & var2x);
                  var1x = var10001;
                  var10001 = var1x - ~var2x - 1;
                  String var53x = "dhl";
                  String var10003x = "dhm";
                  var2x = 884553497;
                  var1x = 512193213;
                  int var54x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = 1131851179;
                  var1x = var54x;
                  int var55x = (var1x | var2x) & (~var1x | ~var2x);
                  int var10004x = (int)-3515343941371879044L;
                  var2x = 1724705566;
                  var1x = var10004x;
                  var10004x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = -184065839;
                  var1x = var10004x;
                  var10004x = (var1x | var2x) - (var1x & var2x);
                  var10004x = (int)8044696518074346319L;
                  var2x = -863553134;
                  var1x = var10004x;
                  var10004x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = -730072212;
                  var1x = var10004x;
                  var10004x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = 1670025165;
                  var1x = -877697770;
                  int var10005x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = 781023102;
                  var1x = var10005x;
                  var10005x = ((var1x | var2x) & (~var1x | ~var2x)) * ((var1x | var2x) & (~var1x | ~var2x));
                  var2x = 1334678394;
                  var1x = -380708160;
                  var10005x = var1x & ~var2x | ~var1x & var2x;
                  var2x = -1122239710;
                  var1x = var10005x;
                  var10005x = var1x + var2x - 2 * (var1x & var2x);
                  int var10006x = (int)7611404061321631265L;
                  var2x = -1792044671;
                  var1x = var10006x;
                  var10006x = var1x + var2x - 2 * (var1x & var2x);
                  var2x = 873122327;
                  var1x = var10006x;
                  var10006x = (var1x & ~var2x | ~var1x & var2x) * (var1x & ~var2x | ~var1x & var2x);
                  var10006x = (int)7402196106748636982L;
                  var2x = 1022965899;
                  var1x = var10006x;
                  var10006x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = -1067193888;
                  var1x = var10006x;
                  if (this.e
                        .b(
                           c(
                              "жЅ•зҐжЅІзґёжј‹з¤ҐжЅґзҐ™жЅїзґёжј€з¤¦жј€з¤­жЅ¶з¤Ё",
                              "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ",
                              var55x,
                              var10004x,
                              var10005x,
                              (var1x | var2x) & ~(var1x & var2x)
                           )
                        )
                     && !this.F.a()) {
                     var2x = 1374107138;
                     var1x = 559106745;
                     int var48x = (var1x | var2x) & ~(var1x & var2x);
                     var2x = 1890876602;
                     var1x = var48x;
                     return Boolean.valueOf(pulse.Bool.from((var1x | var2x) & (~var1x | ~var2x)));
                  }
               }

               int var43x = 398655048;
               int var21x = 346300888;
               int var10000 = var21x + var43x - 2 * (var21x & var43x);
               var43x = 57073552;
               var21x = var10000;
               return Boolean.valueOf(pulse.Bool.from(var21x & ~var43x | ~var21x & var43x));
            }
         );
      this.J = pulse.Bool.from(-937416984 ^ -232420129 ^ 973449783);
   }

   @EventHandler
   public void a(AttackEntityEvent var1) {
      String var10001 = "dfg";
      int var9 = 808597908;
      int var8 = 995838086;
      int var10002 = (var8 | var9) & (~var8 | ~var9);
      var9 = 954205276;
      var8 = var10002;
      var10002 = (var8 | var9) - (var8 & var9);
      int var10003 = (int)5465280317263891546L;
      var9 = 153026616;
      var8 = var10003;
      var10003 = (var8 | var9) & ~(var8 & var9);
      var9 = 650543843;
      var8 = var10003;
      var10003 = var8 & ~var9 | ~var8 & var9;
      var10003 = (int)797921438720433857L;
      var9 = 1828231566;
      var8 = var10003;
      var10003 = (var8 | var9) & (~var8 | ~var9);
      var9 = 740945728;
      var8 = var10003;
      var10003 = var8 & ~var9 | ~var8 & var9;
      String var10004 = "dfh";
      int var251 = (int)-1174888770821931494L;
      var9 = 538719436;
      var8 = var251;
      int var252 = (var8 | var9) - (var8 & var9);
      var9 = -1057830682;
      var8 = var252;
      int var253 = (var8 | var9) & ~(var8 & var9);
      var9 = 901684972;
      var8 = -557708583;
      int var10005 = var8 & ~var9 | ~var8 & var9;
      var9 = -1813166242;
      var8 = var10005;
      var10005 = (var8 | var9) & (~var8 | ~var9);
      var9 = -1924822077;
      var8 = 577031355;
      int var10006 = var8 & ~var9 | ~var8 & var9;
      var9 = -1656064990;
      var8 = var10006;
      var9 = (var8 | var9) - (var8 & var9);
      var8 = var10005;
      var10005 = 2 * (var8 | var9) - (var8 ^ var9);
      var9 = 786381429;
      var8 = 538191013;
      var10005 = (var8 | var9) & (~var8 | ~var9);
      var9 = 413986714;
      var8 = var10005;
      var10005 = (var8 | var9) & ~(var8 & var9);
      var10006 = (int)-1900728691854360088L;
      var9 = -1244459679;
      var8 = var10006;
      var10006 = (var8 | var9) - (var8 & var9);
      var9 = -2099114047;
      var8 = var10006;
      var10006 = ((var8 | var9) & (~var8 | ~var9)) * ((var8 | var9) & (~var8 | ~var9));
      var10006 = (int)-3050425782139582558L;
      var9 = -1931747486;
      var8 = var10006;
      var10006 = var8 + var9 - 2 * (var8 & var9);
      var9 = 890850778;
      var8 = var10006;
      if (this.e.b(c("в¤—н‘ќв¤°нЂЅвҐ‹нђ©в¤ён‘ќв¤Ѕ", "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ", var10003, var253, var10005, var8 & ~var9 | ~var8 & var9))) {
         if (var1.a() != c.player) {
            if (var1.a() instanceof LivingEntity) {
               LivingEntity var2 = (LivingEntity)var1.a();
               Vec3d var3 = new Vec3d(var2.getX(), var2.getY() + var2.getEyeHeight(var2.getPose()) / 2.0F, var2.getZ());
               int var223;
               if (!this.f.a()) {
                  var9 = 1491812503;
                  var8 = -1299871166;
                  int var227 = var8 & ~var9 | ~var8 & var9;
                  var9 = -361837884;
                  var8 = var227;
                  int var228 = (var8 | var9) & (~var8 | ~var9);
                  var223 = (int)-2371741287074735171L;
                  var9 = 811771435;
                  var8 = var223;
                  var223 = (var8 | var9) - (var8 & var9);
                  var9 = -1649038976;
                  var8 = var223;
                  int var7 = (var8 | var9) - (var8 & var9);
                  a = var7;
                  var9 = 1737405482;
                  var8 = 207829605;
                  var223 = var8 + var9 - 2 * (var8 & var9);
                  var9 = 546468806;
                  var8 = var223;
                  var223 = (var8 | var9) & ~(var8 & var9);
                  var9 = -1675553939;
                  var8 = 994771602;
                  var223 = (var8 | var9) - (var8 & var9);
                  var9 = -169890804;
                  var8 = var223;
                  if (((var8 | var9) & (~var8 | ~var9)) <= a) {
                     int var229 = (int)-8389717781879552193L;
                     var9 = 464232544;
                     var8 = var229;
                     int var230 = var8 + var9 - 2 * (var8 & var9);
                     var9 = -555669666;
                     var8 = var230;
                     int var231 = var8 + var9 - 2 * (var8 & var9);
                     int var232 = (int)5916087106909626688L;
                     var9 = -947708053;
                     var8 = var232;
                     int var233 = (var8 | var9) - (var8 & var9);
                     var9 = -1004601823;
                     var8 = var233;
                     int var234 = (var8 | var9) & ~(var8 & var9);
                     var9 = -1713269144;
                     var8 = -2072770000;
                     var223 = (var8 | var9) - (var8 & var9);
                     var9 = 1228017250;
                     var8 = var223;
                     var7 = var8 + var9 - 2 * (var8 & var9);
                  }

                  var223 = this.j.b();
                  int var235 = (int)-3034185366205240259L;
                  var9 = 183405458;
                  var8 = var235;
                  int var236 = var8 + var9 - 2 * (var8 & var9);
                  var9 = 843802540;
                  var8 = var236;
                  var223 *= (var8 | var9) - (var8 & var9);
               } else {
                  var223 = this.s.b();
                  var9 = 990875626;
                  var8 = 499927025;
                  int var237 = (var8 | var9) & ~(var8 & var9);
                  var9 = 650364952;
                  var8 = var237;
                  var223 *= var8 + var9 - 2 * (var8 & var9);
               }

               int var4 = var223;
               var223 = (int)3910227802855868170L;
               var9 = 622183967;
               var8 = var223;
               var223 = (var8 | var9) - (var8 & var9);
               var9 = 151077141;
               var8 = var223;

               for (int var5 = var8 + var9 - 2 * (var8 & var9); var5 < var4; var5++) {
                  var10002 = (int)-245910459452194978L;
                  var9 = 1032916605;
                  var8 = var10002;
                  var10002 = (var8 | var9) & (~var8 | ~var9);
                  var9 = 1344794410;
                  var8 = var10002;
                  var10002 = var8 + var9 - 2 * (var8 & var9);
                  var10003 = (int)3579015473324425937L;
                  var9 = -17607757;
                  var8 = var10003;
                  var10003 = var8 + var9 - 2 * (var8 & var9);
                  var9 = -2046381185;
                  var8 = var10003;
                  var9 = var8 & ~var9 | ~var8 & var9;
                  var8 = var10002;
                  var10002 = (var8 | var9) + (var8 & var9);
                  var10004 = "dfi";
                  var9 = 1460434733;
                  var8 = -2028304370;
                  var10005 = (var8 | var9) - (var8 & var9);
                  var9 = -567836414;
                  var8 = var10005;
                  var10005 = (var8 + var9 - 2 * (var8 & var9)) * (var8 + var9 - 2 * (var8 & var9));
                  int var10007 = (int)546689347224661399L;
                  var9 = 1647507832;
                  var8 = var10007;
                  var10007 = var8 + var9 - 2 * (var8 & var9);
                  var9 = -169732883;
                  var8 = var10007;
                  var10007 = var8 & ~var9 | ~var8 & var9;
                  var9 = 1315610415;
                  var8 = -1595086085;
                  var10007 = var8 & ~var9 | ~var8 & var9;
                  var9 = -293177913;
                  var8 = var10007;
                  var10007 = (var8 | var9) - (var8 & var9);
                  var9 = -1549111483;
                  var8 = 193914292;
                  var10007 = (var8 | var9) & ~(var8 & var9);
                  var9 = -1474000137;
                  var8 = var10007;
                  var10007 = var8 & ~var9 | ~var8 & var9;
                  var10007 = (int)7853021660799251458L;
                  var9 = -2041276071;
                  var8 = var10007;
                  var10007 = (var8 | var9) & (~var8 | ~var9);
                  var9 = 1865919835;
                  var8 = var10007;
                  var10007 = (var8 | var9) & ~(var8 & var9);
                  var9 = 1371462731;
                  var8 = -29788851;
                  var10006 = (var8 | var9) & ~(var8 & var9);
                  var9 = -959495927;
                  var8 = var10006;
                  var10006 = var8 + var9 - 2 * (var8 & var9);
                  var10007 = (int)1660741692561402451L;
                  var9 = 146691486;
                  var8 = var10007;
                  var10007 = var8 + var9 - 2 * (var8 & var9);
                  var9 = 278128447;
                  var8 = var10007;
                  var10007 = (var8 | var9) - (var8 & var9);
                  int var10008 = (int)2987471045145758125L;
                  var9 = -324396767;
                  var8 = var10008;
                  var10008 = (var8 | var9) & ~(var8 & var9);
                  var9 = -1885581050;
                  var8 = var10008;
                  var9 = var8 + var9 - 2 * (var8 & var9);
                  var8 = var10007;
                  var10007 = (var8 ^ var9) + 2 * (var8 & var9);
                  var9 = 41794434;
                  var8 = 1344362657;
                  var10007 = (var8 | var9) - (var8 & var9);
                  var9 = -165427254;
                  var8 = var10007;
                  var10007 = var8 + var9 - 2 * (var8 & var9);
                  String var302 = "dfj";
                  var10008 = (int)-8886950436542838131L;
                  var9 = -1252891934;
                  var8 = var10008;
                  var10008 = var8 + var9 - 2 * (var8 & var9);
                  var9 = 524236386;
                  var8 = var10008;
                  var10008 = (var8 | var9) - (var8 & var9);
                  int var10010 = (int)-5308571629323731177L;
                  var9 = 412738337;
                  var8 = var10010;
                  var10010 = var8 + var9 - 2 * (var8 & var9);
                  var9 = -1310139333;
                  var8 = var10010;
                  var10010 = var8 & ~var9 | ~var8 & var9;
                  var10010 = (int)1952438979750925064L;
                  var9 = -1693486328;
                  var8 = var10010;
                  var10010 = var8 + var9 - 2 * (var8 & var9);
                  var9 = -1029611520;
                  var8 = var10010;
                  var10010 = var8 & ~var9 | ~var8 & var9;
                  var10010 = (int)4221385893090196849L;
                  var9 = 1456789518;
                  var8 = var10010;
                  var10010 = var8 & ~var9 | ~var8 & var9;
                  var9 = -811031179;
                  var8 = var10010;
                  var10010 = (var8 | var9) - (var8 & var9);
                  var9 = 714352233;
                  var8 = -1505172534;
                  var10010 = var8 + var9 - 2 * (var8 & var9);
                  var9 = -1931688536;
                  var8 = var10010;
                  var10010 = var8 & ~var9 | ~var8 & var9;
                  var9 = -1596773666;
                  var8 = 296804890;
                  var10010 = (var8 | var9) - (var8 & var9);
                  var9 = -1318860585;
                  var8 = var10010;
                  var10010 = (var8 | var9) & (~var8 | ~var9);
                  var9 = -1721429679;
                  var8 = 1089975984;
                  int var10009 = var8 & ~var9 | ~var8 & var9;
                  var9 = -642723790;
                  var8 = var10009;
                  var10003 = this.f(
                        c(
                           "\u2d69лЉ \u2d7cлЉµ\u2d6bлЉї",
                           "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ",
                           var10006,
                           var10007,
                           var10008,
                           var8 & ~var9 | ~var8 & var9
                        )
                     )
                     .getRGB();
                  int var255 = (int)-5459388388414711361L;
                  var9 = 271945937;
                  var8 = var255;
                  int var256 = (var8 | var9) & ~(var8 & var9);
                  var9 = 2127088530;
                  var8 = var256;
                  int var257 = (var8 | var9) & ~(var8 & var9);
                  var9 = 1286869464;
                  var8 = 606903991;
                  var10005 = (var8 | var9) & ~(var8 & var9);
                  var9 = -932390967;
                  var8 = var10005;
                  var9 = (var8 | var9) - (var8 & var9);
                  var8 = var257;
                  int var258 = (var8 ^ var9) + 2 * (var8 & var9);
                  String var266 = "dfk";
                  var9 = 890105699;
                  var8 = -1921542907;
                  var10007 = (var8 | var9) & ~(var8 & var9);
                  var9 = -1199932810;
                  var8 = var10007;
                  var10007 = (var8 | var9) & (~var8 | ~var9);
                  var9 = -188793894;
                  var8 = 1505954876;
                  var10007 = (var8 | var9) - (var8 & var9);
                  var9 = -1384368137;
                  var8 = var10007;
                  var10007 = var8 + var9 - 2 * (var8 & var9);
                  var10006 = (int)-788721576193657083L;
                  var9 = 820189511;
                  var8 = var10006;
                  var10006 = var8 & ~var9 | ~var8 & var9;
                  var9 = -1713273267;
                  var8 = var10006;
                  var10006 = (var8 | var9) & ~(var8 & var9);
                  var10007 = (int)-1449728806963969261L;
                  var9 = -461253289;
                  var8 = var10007;
                  var10007 = (var8 | var9) - (var8 & var9);
                  var9 = 137512592;
                  var8 = var10007;
                  var10007 = (var8 | var9) - (var8 & var9);
                  var9 = 1865307495;
                  var8 = 1511978549;
                  var10007 = var8 & ~var9 | ~var8 & var9;
                  var9 = -1857074867;
                  var8 = var10007;
                  var10007 = var8 & ~var9 | ~var8 & var9;
                  var10009 = (int)-1683971082202398340L;
                  var9 = 1888943879;
                  var8 = var10009;
                  var10009 = var8 + var9 - 2 * (var8 & var9);
                  var9 = 2044542581;
                  var8 = var10009;
                  var10009 = (var8 | var9) - (var8 & var9);
                  var9 = 1601583095;
                  var8 = 796755153;
                  var10009 = (var8 | var9) & ~(var8 & var9);
                  var9 = 1879814965;
                  var8 = var10009;
                  var10009 = (var8 | var9) & (~var8 | ~var9);
                  var10009 = (int)5074204795761088735L;
                  var9 = 1395932186;
                  var8 = var10009;
                  var10009 = (var8 | var9) & ~(var8 & var9);
                  var9 = -203922217;
                  var8 = var10009;
                  var10009 = (var8 | var9) & ~(var8 & var9);
                  var9 = -1625336136;
                  var8 = -1753538814;
                  var10008 = (var8 | var9) - (var8 & var9);
                  var9 = 483334929;
                  var8 = var10008;
                  var10008 = (var8 | var9) - (var8 & var9);
                  var10009 = (int)894771199556661259L;
                  var9 = -1678474349;
                  var8 = var10009;
                  var10009 = (var8 | var9) & (~var8 | ~var9);
                  var9 = -328716816;
                  var8 = var10009;
                  var10009 = ((var8 | var9) & (~var8 | ~var9)) * ((var8 | var9) & (~var8 | ~var9));
                  var9 = -1286741900;
                  var8 = -35055552;
                  var10009 = (var8 | var9) & ~(var8 & var9);
                  var9 = 1317520701;
                  var8 = var10009;
                  this.a(
                     var3,
                     0.02,
                     var10003,
                     c(
                        "\u2d69\uf87a\u2d7c\uf86f\u2d6b\uf865",
                        "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ",
                        var10006,
                        var10007,
                        var10008,
                        (var8 | var9) & (~var8 | ~var9)
                     )
                  );
               }
            }
         }
      }
   }

   @EventHandler
   public void a(TotemPopEvent var1) {
      ModeSetting var10000 = this.e;
      int var10002 = (int)-126567373704806101L;
      int var3 = 11337227;
      int var2 = var10002;
      var10002 = (var2 | var3) - (var2 & var3);
      var3 = -360235231;
      var2 = var10002;
      var10002 = (var2 | var3) & ~(var2 & var3);
      var10002 = (int)-2474106760428297756L;
      var3 = -741708784;
      var2 = var10002;
      var10002 = (var2 | var3) & (~var2 | ~var3);
      var3 = 130583012;
      var2 = var10002;
      var10002 = ((var2 | var3) & (~var2 | ~var3)) * ((var2 | var3) & (~var2 | ~var3));
      int var10003 = (int)51591088464630867L;
      var3 = 1461489786;
      var2 = var10003;
      var10003 = (var2 | var3) - (var2 & var3);
      var3 = 824753695;
      var2 = var10003;
      var10003 = ((var2 | var3) - (var2 & var3)) * ((var2 | var3) - (var2 & var3));
      var10003 = (int)278834609233289717L;
      var3 = 1049648752;
      var2 = var10003;
      var10003 = var2 & ~var3 | ~var2 & var3;
      var3 = -575154294;
      var2 = var10003;
      var10003 = (var2 | var3) - (var2 & var3);
      var3 = -1242069317;
      var2 = 192021465;
      int var10004 = (var2 | var3) & (~var2 | ~var3);
      var3 = 1558926343;
      var2 = var10004;
      var10004 = (var2 | var3) & ~(var2 & var3);
      int var10005 = (int)8229115843550754034L;
      var3 = 147946485;
      var2 = var10005;
      var10005 = (var2 | var3) - (var2 & var3);
      var3 = 1436118997;
      var2 = var10005;
      var3 = (var2 | var3) - (var2 & var3);
      var2 = var10004;
      var10004 = 2 * (var2 | var3) - (var2 ^ var3);
      var10004 = (int)-3889729389062838937L;
      var3 = 583458042;
      var2 = var10004;
      var10004 = var2 + var3 - 2 * (var2 & var3);
      var3 = 1249039586;
      var2 = var10004;
      var10004 = var2 + var3 - 2 * (var2 & var3);
      var3 = -521850878;
      var2 = 1856652492;
      var10005 = (var2 | var3) & (~var2 | ~var3);
      var3 = -1686850268;
      var2 = var10005;
      var10005 = (var2 | var3) & (~var2 | ~var3);
      int var10006 = (int)-776258128688715421L;
      var3 = 466679799;
      var2 = var10006;
      var10006 = (var2 | var3) & ~(var2 & var3);
      var3 = -2068016462;
      var2 = var10006;
      var3 = var2 & ~var3 | ~var2 & var3;
      var2 = var10005;
      var10005 = var2 - ~var3 - 1;
      var10005 = (int)-3341413622073349311L;
      var3 = -671323457;
      var2 = var10005;
      var10005 = var2 & ~var3 | ~var2 & var3;
      var3 = 1673400260;
      var2 = var10005;
      var10005 = (var2 | var3) - (var2 & var3);
      var3 = -567149336;
      var2 = 2122129067;
      var10006 = (var2 | var3) & (~var2 | ~var3);
      var3 = 28771573;
      var2 = var10006;
      var10006 = (var2 | var3) & ~(var2 & var3);
      var3 = -1006970232;
      var2 = 2008560239;
      var10006 = (var2 | var3) & (~var2 | ~var3);
      var3 = -1274998970;
      var2 = var10006;
      if (var10000.b(
         c("л‡џлё®л‡ёл©Ћл†Ѓл№“л‡ѕлёЇл‡µл©Ћл†‚л№ђл†‚л№›л‡јл№ћ", "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ", var10003, var10004, var10005, var2 + var3 - 2 * (var2 & var3))
      )) {
         this.K = var1.a();
         this.I = new Vec3d(this.K.getX(), this.K.getY() + this.K.getEyeHeight(this.K.getPose()), this.K.getZ());
         this.H = System.currentTimeMillis();
         int var10001 = (int)-8280116196463460578L;
         var3 = 1160394112;
         var2 = var10001;
         var10001 = var2 + var3 - 2 * (var2 & var3);
         var3 = 939264671;
         var2 = var10001;
         this.J = pulse.Bool.from((var2 | var3) & ~(var2 & var3));
      }
   }

   @EventHandler
   public void a(WorldRenderStartEvent var1) {
      ModeSetting var10000 = this.e;
      int var10002 = (int)1895463689936431699L;
      int var13 = -1279085009;
      int var12 = var10002;
      var10002 = (var12 | var13) & ~(var12 & var13);
      var13 = 1083006079;
      var12 = var10002;
      var10002 = (var12 | var13) - (var12 & var13);
      var13 = 1439473749;
      var12 = -283787041;
      var10002 = (var12 | var13) & (~var12 | ~var13);
      var13 = -1160159079;
      var12 = var10002;
      var10002 = var12 + var13 - 2 * (var12 & var13);
      var13 = 1320059603;
      var12 = -1328289658;
      var10002 = (var12 | var13) & (~var12 | ~var13);
      var13 = -25335226;
      var12 = var10002;
      var10002 = var12 + var13 - 2 * (var12 & var13);
      var13 = -708368426;
      var12 = 317503378;
      var10002 = (var12 | var13) & (~var12 | ~var13);
      var13 = 1770297536;
      var12 = var10002;
      var10002 = (var12 | var13) & (~var12 | ~var13);
      int var10004 = (int)-7455376069325432171L;
      var13 = -1925535844;
      var12 = var10004;
      var10004 = (var12 | var13) & ~(var12 & var13);
      var13 = -1781367540;
      var12 = var10004;
      var10004 = var12 + var13 - 2 * (var12 & var13);
      var10004 = (int)1297820659367158210L;
      var13 = -228601047;
      var12 = var10004;
      var10004 = var12 & ~var13 | ~var12 & var13;
      var13 = -2048789784;
      var12 = var10004;
      var10004 = (var12 | var13) & ~(var12 & var13);
      int var10003 = (int)1960391661514804647L;
      var13 = -1920357339;
      var12 = var10003;
      var10003 = (var12 | var13) - (var12 & var13);
      var13 = -1174730355;
      var12 = var10003;
      var10003 = (var12 | var13) & ~(var12 & var13);
      var13 = -2080816890;
      var12 = -505985313;
      var10004 = (var12 | var13) - (var12 & var13);
      var13 = -120359046;
      var12 = var10004;
      var10004 = ((var12 | var13) & (~var12 | ~var13)) * ((var12 | var13) & (~var12 | ~var13));
      var13 = -616034011;
      var12 = 982396001;
      var10004 = (var12 | var13) - (var12 & var13);
      var13 = -120785306;
      var12 = var10004;
      var10004 = (var12 | var13) & (~var12 | ~var13);
      String var10005 = "dfl";
      var13 = -1990684501;
      var12 = -1905531992;
      int var242 = (var12 | var13) & (~var12 | ~var13);
      var13 = 57806339;
      var12 = var242;
      int var243 = var12 & ~var13 | ~var12 & var13;
      var13 = -1907868454;
      var12 = 537943366;
      int var10006 = var12 + var13 - 2 * (var12 & var13);
      var13 = -791555687;
      var12 = var10006;
      var10006 = (var12 | var13) & ~(var12 & var13);
      var13 = 1967771827;
      var12 = 1368895466;
      var10006 = (var12 | var13) - (var12 & var13);
      var13 = 620174108;
      var12 = var10006;
      if (!var10000.b(
         c("й‹ћб»‹й‹№бЄ«йЉЂбє¶й‹їб»Љй‹ґбЄ«йЉѓбєµйЉѓбєѕй‹Ѕбє»", "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ", var10003, var10004, var243, (var12 | var13) & (~var12 | ~var13))
      )) {
         if (a != a) {
            throw new RuntimeException();
         }
      } else if (this.J) {
         long var184 = System.currentTimeMillis() - this.H;
         String var10001 = "dfm";
         if (var184 > 1500L) {
            int var213 = (int)-9116457441962259800L;
            var13 = -703489273;
            var12 = var213;
            int var214 = (var12 | var13) & ~(var12 & var13);
            var13 = 667816367;
            var12 = var214;
            this.J = pulse.Bool.from(var12 & ~var13 | ~var12 & var13);
            this.K = null;
            return;
         }

         if (this.K != null && this.K.isAlive()) {
            double var227 = this.K.getX();
            double var240 = this.K.getY();
            double var244 = this.K.getHeight();
            var10006 = (int)7090902515507450807L;
            var13 = -739076940;
            var12 = var10006;
            var10006 = (var12 | var13) & ~(var12 & var13);
            var13 = 483926396;
            var12 = var10006;
            var10006 = ((var12 | var13) - (var12 & var13)) * ((var12 | var13) - (var12 & var13));
            this.I = new Vec3d(var227, var240 + var244 / 2.0, this.K.getZ());
         }

         var13 = 1800403820;
         var12 = -270650223;
         int var185 = (var12 | var13) & ~(var12 & var13);
         var13 = -2070818819;
         var12 = var185;
         int var2 = var12 & ~var13 | ~var12 & var13;

         while (true) {
            int var209 = (int)-7629888426354595237L;
            var13 = 1872878370;
            var12 = var209;
            int var210 = var12 + var13 - 2 * (var12 & var13);
            var13 = -1058737797;
            var12 = var210;
            if (var2 >= ((var12 | var13) & ~(var12 & var13))) {
               return;
            }

            String var186 = "dfn";
            double var3 = 0.4;

            Vec3d var5;
            do {
               ThreadLocalRandom var223 = ThreadLocalRandom.current();
               String var228 = "dfo";
               double var224 = var223.nextDouble(-1.0, 1.0);
               ThreadLocalRandom var229 = ThreadLocalRandom.current();
               int var245 = (int)-8199575439325002014L;
               var13 = 1551000077;
               var12 = var245;
               int var246 = (var12 | var13) & (~var12 | ~var13);
               var13 = -1703516946;
               var12 = var246;
               int var247 = var12 + var13 - 2 * (var12 & var13);
               int var248 = (int)6221256099685700182L;
               var13 = 540737988;
               var12 = var248;
               int var249 = var12 & ~var13 | ~var12 & var13;
               var13 = 642028435;
               var12 = var249;
               int var250 = (var12 | var13) - (var12 & var13);
               var13 = -1942180773;
               var12 = -2036397393;
               int var251 = var12 + var13 - 2 * (var12 & var13);
               var13 = 178497271;
               var12 = var251;
               int var252 = var12 & ~var13 | ~var12 & var13;
               double var230 = var229.nextDouble(0.1, 1.0);
               ThreadLocalRandom var241 = ThreadLocalRandom.current();
               var13 = -3831695;
               var12 = -955708708;
               int var253 = (var12 | var13) & (~var12 | ~var13);
               var13 = -1239300243;
               var12 = var253;
               int var254 = (var12 | var13) - (var12 & var13);
               var5 = new Vec3d(var224, var230, var241.nextDouble(-1.0, 1.0));
            } while (var5.lengthSquared() > 1.0);

            var5 = var5.normalize().multiply(var3);
            int var190;
            if (!ThreadLocalRandom.current().nextBoolean()) {
               var13 = -175611557;
               var12 = -146855449;
               int var187 = (var12 | var13) & (~var12 | ~var13);
               var13 = -2019171739;
               var12 = var187;
               int var188 = var12 & ~var13 | ~var12 & var13;
               var13 = -2017428864;
               var12 = -1843895167;
               int var189 = (var12 | var13) & ~(var12 & var13);
               var13 = 366797057;
               var12 = var189;
               var190 = (var12 | var13) & ~(var12 & var13);
            } else {
               var13 = -2008063872;
               var12 = -471203640;
               int var191 = (var12 | var13) - (var12 & var13);
               var13 = 488082367;
               var12 = var191;
               int var192 = ((var12 | var13) - (var12 & var13)) * ((var12 | var13) - (var12 & var13));
               int var193 = (int)-5612280483572385509L;
               var13 = -1958726113;
               var12 = var193;
               int var194 = var12 & ~var13 | ~var12 & var13;
               var13 = 795914259;
               var12 = var194;
               var190 = (var12 | var13) & ~(var12 & var13);
            }

            int var6 = var190;
            String var7 = !this.f.a() ? this.i.d() : this.A.d();
            float var8 = !this.f.a() ? this.k.a() : this.C.a();
            int var207;
            if (!this.f.a()) {
               int var195 = (int)6533592308321380807L;
               var13 = 1857089524;
               var12 = var195;
               int var196 = (var12 | var13) - (var12 & var13);
               var13 = 1263760233;
               var12 = var196;
               int var197 = (var12 | var13) & ~(var12 & var13);
               int var198 = (int)1853433891630537156L;
               var13 = 884207568;
               var12 = var198;
               int var199 = (var12 | var13) & (~var12 | ~var13);
               var13 = -453306146;
               var12 = var199;
               int var11 = (var12 | var13) & (~var12 | ~var13);
               String var200 = "dfp";
               var13 = 88314044;
               var12 = 1984996290;
               int var201 = var12 & ~var13 | ~var12 & var13;
               var13 = 1792427316;
               var12 = var201;
               if (((var12 | var13) & ~(var12 & var13)) >= var11) {
                  var13 = -711961833;
                  var12 = 1281227703;
                  int var202 = var12 + var13 - 2 * (var12 & var13);
                  var13 = -1686203372;
                  var12 = var202;
                  int var203 = (var12 | var13) & ~(var12 & var13);
                  var13 = 615935787;
                  var12 = 807351196;
                  int var211 = (var12 | var13) & ~(var12 & var13);
                  var13 = -591107075;
                  var12 = var211;
                  var13 = (var12 | var13) & ~(var12 & var13);
                  var12 = var203;
                  int var204 = var12 - ~var13 - 1;
                  int var205 = (int)-6453296792567793536L;
                  var13 = 1878131655;
                  var12 = var205;
                  int var206 = (var12 | var13) & ~(var12 & var13);
                  var13 = 933858949;
                  var12 = var206;
                  var11 = var12 & ~var13 | ~var12 & var13;
                  a = var11;
               }

               var207 = this.l.b();
            } else {
               var207 = this.D.b();
            }

            int var9 = var207;
            ParticleRenderService var208 = HudServiceRegistry.PARTICLES;
            Vec3d var212 = this.I;
            String var260 = "dfq";
            var13 = 1689044618;
            var12 = -1001984182;
            int var10008 = var12 + var13 - 2 * (var12 & var13);
            var13 = -1595266614;
            var12 = var10008;
            var10008 = (var12 | var13) & (~var12 | ~var13);
            var10008 = (int)-4456189438831656663L;
            var13 = 1659799639;
            var12 = var10008;
            var10008 = var12 & ~var13 | ~var12 & var13;
            var13 = -730265236;
            var12 = var10008;
            var10008 = (var12 | var13) & ~(var12 & var13);
            String var265 = "dfr";
            var13 = -634889780;
            var12 = 1380507078;
            var10008 = var12 + var13 - 2 * (var12 & var13);
            var13 = -517444603;
            var12 = var10008;
            var10008 = (var12 | var13) - (var12 & var13);
            var13 = 361743196;
            var12 = -1093382252;
            int var10009 = var12 & ~var13 | ~var12 & var13;
            var13 = 812244808;
            var12 = var10009;
            var10009 = (var12 | var13) - (var12 & var13);
            int var10010 = (int)-8992228125627162075L;
            var13 = 1144600051;
            var12 = var10010;
            var10010 = var12 + var13 - 2 * (var12 & var13);
            var13 = 113686430;
            var12 = var10010;
            var13 = (var12 | var13) - (var12 & var13);
            var12 = var10009;
            var10009 = (var12 ^ var13) + 2 * (var12 & var13);
            var13 = -835781062;
            var12 = -365347471;
            var10009 = (var12 | var13) - (var12 & var13);
            var13 = 1026653706;
            var12 = var10009;
            var10009 = var12 + var13 - 2 * (var12 & var13);
            var13 = 1107401779;
            var12 = -476161544;
            var10010 = (var12 | var13) - (var12 & var13);
            var13 = 576457791;
            var12 = var10010;
            var10010 = (var12 | var13) - (var12 & var13);
            int var10011 = (int)-6766864718944540774L;
            var13 = 826543236;
            var12 = var10011;
            var10011 = (var12 | var13) & (~var12 | ~var13);
            var13 = -1826517814;
            var12 = var10011;
            var13 = var12 + var13 - 2 * (var12 & var13);
            var12 = var10010;
            var10010 = (var12 | var13) + (var12 & var13);
            var13 = -2048624987;
            var12 = 1312179841;
            var10010 = var12 & ~var13 | ~var12 & var13;
            var13 = -921158604;
            var12 = var10010;
            var10010 = (var12 | var13) & (~var12 | ~var13);
            var13 = 1726519397;
            var12 = 1542922502;
            var10011 = (var12 | var13) & (~var12 | ~var13);
            var13 = 743553729;
            var12 = var10011;
            var10011 = ((var12 | var13) & (~var12 | ~var13)) * ((var12 | var13) & (~var12 | ~var13));
            var10011 = (int)8466186151498125656L;
            var13 = -779140726;
            var12 = var10011;
            var10011 = var12 & ~var13 | ~var12 & var13;
            var13 = 598378166;
            var12 = var10011;
            var208.a(
               var212,
               var5,
               var9,
               var8,
               this.g(c("йљµвЈ…йљµвЈЏйљ¬", "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ", var10008, var10009, var10010, (var12 | var13) & ~(var12 & var13))),
               var6,
               var7
            );
            var2++;
         }
      }
   }

   private void a(Vec3d var1, double var2, int var4, String var5) {
      var4 = ColorUtils.a(var4);
      int var6 = !this.f.a() ? this.j.b() : this.a(var5);
      int var7 = !this.f.a() ? this.l.b() : this.c(var5);
      int var23 = -2089933957;
      int var22 = -369824933;
      int var10001 = var22 & ~var23 | ~var22 & var23;
      var23 = 1788528682;
      var22 = var10001;
      var23 = var22 & ~var23 | ~var22 & var23;
      var22 = var7;
      int var8 = (var22 & ~var23) - (~var22 & var23);
      var10001 = (int)-1244077182519287196L;
      var23 = 1942231896;
      var22 = var10001;
      var10001 = (var22 | var23) - (var22 & var23);
      var23 = -1526662858;
      var22 = var10001;
      var23 = (var22 | var23) & (~var22 | ~var23);
      var22 = var7;
      int var9 = (var22 | var23) + (var22 & var23);
      float var10 = !this.f.a() ? this.k.a() : this.b(var5);
      var10001 = (int)-7338041672963009833L;
      var23 = 1620202495;
      var22 = var10001;
      var10001 = (var22 | var23) & ~(var22 & var23);
      var23 = -176235518;
      var22 = var10001;
      var10001 = (var22 | var23) & (~var22 | ~var23);
      float var11 = var10 - 0.05F;
      String var68 = "dfs";
      float var12 = var10 + 0.05F;
      double var13 = !this.f.a() ? this.m.a() : this.d(var5);
      String var10000;
      if (!this.f.a()) {
         var10000 = this.i.d();
      } else {
         var10000 = this.e(var5);
         if (a != a) {
            var10001 = (int)-3823401269435166568L;
            var23 = -1913047400;
            var22 = var10001;
            var10001 = var22 & ~var23 | ~var22 & var23;
            var23 = 1990350068;
            var22 = var10001;
            var10001 = (var22 | var23) & ~(var22 & var23);
            int var10002 = (int)-1687234585187499615L;
            var23 = 1665888135;
            var22 = var10002;
            var10002 = (var22 | var23) & ~(var22 & var23);
            var23 = 269945293;
            var22 = var10002;
            var23 = var22 & ~var23 | ~var22 & var23;
            var22 = var10001;
            var10001 = 2 * (var22 | var23) - (var22 ^ var23);
            var23 = 465226357;
            var22 = 1607748523;
            var10001 = var22 & ~var23 | ~var22 & var23;
            var23 = 1048602988;
            var22 = var10001;
            int var21 = (var22 | var23) - (var22 & var23);
         }
      }

      String var15 = var10000;
      var23 = -2084700839;
      var22 = 680795718;
      int var61 = (var22 | var23) & ~(var22 & var23);
      var23 = -1423318241;
      var22 = var61;

      for (int var16 = var22 & ~var23 | ~var22 & var23; var16 < var6; var16++) {
         int var17 = ThreadLocalRandom.current().nextInt(var8, var9);
         float var18 = var11 + ThreadLocalRandom.current().nextFloat() * (var12 - var11);
         Vec3d var19 = new Vec3d(
            ThreadLocalRandom.current().nextDouble(-var2, var2),
            ThreadLocalRandom.current().nextDouble(0.0, var2),
            ThreadLocalRandom.current().nextDouble(-var2, var2)
         );
         if (var19.lengthSquared() > 0.0) {
            Vec3d var62 = var19.normalize();
            ThreadLocalRandom var74 = ThreadLocalRandom.current();
            int var76 = (int)-8039574094533954448L;
            var23 = -2097742611;
            var22 = var76;
            var76 = var22 & ~var23 | ~var22 & var23;
            var23 = -1503632305;
            var22 = var76;
            var76 = ((var22 | var23) & ~(var22 & var23)) * ((var22 | var23) & ~(var22 & var23));
            var19 = var62.multiply(var74.nextDouble(0.005, var13));
         }

         HudServiceRegistry.PARTICLES.a(var1, var19, var17, var18, this.g(var5), var4, var15);
      }
   }

   private int a(String var1) {
      String var2 = var1;
      int var10000 = (int)-810618765566839130L;
      int var7 = -1016615601;
      int var6 = var10000;
      var10000 = (var6 | var7) - (var6 & var7);
      var7 = 847717398;
      var6 = var10000;
      int var3 = (var6 | var7) & ~(var6 & var7);
      switch (var2.hashCode()) {
         case -1407259064:
            var7 = -283238643;
            var6 = -225317435;
            int var182 = (var6 | var7) - (var6 & var7);
            var7 = 26297530;
            var6 = var182;
            var182 = (var6 | var7) - (var6 & var7);
            var7 = 1792691396;
            var6 = -879306218;
            int var208 = (var6 | var7) - (var6 & var7);
            var7 = -1588816169;
            var6 = var208;
            var208 = var6 & ~var7 | ~var6 & var7;
            var7 = -1281227545;
            var6 = -1624911209;
            var208 = (var6 | var7) & ~(var6 & var7);
            var7 = 747099762;
            var6 = var208;
            var208 = (var6 | var7) & ~(var6 & var7);
            String var212 = "dft";
            var208 = (int)-8999087443291449615L;
            var7 = -1512940814;
            var6 = var208;
            var208 = var6 & ~var7 | ~var6 & var7;
            var7 = -1955208180;
            var6 = var208;
            var208 = (var6 | var7) - (var6 & var7);
            var7 = -696366882;
            var6 = -152059279;
            int var218 = var6 & ~var7 | ~var6 & var7;
            var7 = 1682993158;
            var6 = var218;
            var218 = (var6 | var7) & ~(var6 & var7);
            var7 = -1512062885;
            var6 = 715993628;
            int var233 = (var6 | var7) & ~(var6 & var7);
            var7 = 2087315317;
            var6 = var233;
            var7 = var6 & ~var7 | ~var6 & var7;
            var6 = var218;
            var218 = 2 * (var6 | var7) - (var6 ^ var7);
            var218 = (int)-8105856925206331616L;
            var7 = -715490656;
            var6 = var218;
            var218 = (var6 | var7) - (var6 & var7);
            var7 = 1499259306;
            var6 = var218;
            var218 = var6 + var7 - 2 * (var6 & var7);
            String var234 = "dfu";
            var7 = -267610312;
            var6 = -1580435433;
            var233 = var6 + var7 - 2 * (var6 & var7);
            var7 = 1314017536;
            var6 = var233;
            var233 = (var6 | var7) - (var6 & var7);
            int var247 = (int)-5179080419282788720L;
            var7 = -99262570;
            var6 = var247;
            var247 = (var6 | var7) & ~(var6 & var7);
            var7 = 115029125;
            var6 = var247;
            var247 = (var6 | var7) & ~(var6 & var7);
            var247 = (int)2813639863158090033L;
            var7 = -1748086871;
            var6 = var247;
            var247 = (var6 | var7) - (var6 & var7);
            var7 = -826807604;
            var6 = var247;
            if (!var2.equals(c("мћ©вЏ§мћјвЏІмћ«вЏё", "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ", var208, var218, var233, var6 + var7 - 2 * (var6 & var7)))) {
               var7 = 2062338331;
               var6 = -1193272574;
               var182 = (var6 | var7) & ~(var6 & var7);
               var7 = -1039347190;
               var6 = var182;
               var182 = (var6 | var7) - (var6 & var7);
               var182 = (int)3974929568309511238L;
               var7 = 1320388761;
               var6 = var182;
               var182 = var6 & ~var7 | ~var6 & var7;
               var7 = -1862628144;
               var6 = var182;
               var182 = (var6 | var7) & (~var6 | ~var7);
               var182 = (int)8665782788570019082L;
               var7 = 2031856702;
               var6 = var182;
               var182 = var6 + var7 - 2 * (var6 & var7);
               var7 = 343103800;
               var6 = var182;
               var182 = var6 & ~var7 | ~var6 & var7;
               var182 = (int)4108024542499086932L;
               var7 = -1319187072;
               var6 = var182;
               var182 = (var6 | var7) & ~(var6 & var7);
               var7 = -782209083;
               var6 = var182;
               var182 = var6 & ~var7 | ~var6 & var7;
               var7 = 1049971148;
               var6 = 1420395519;
               var10000 = (var6 | var7) & (~var6 | ~var7);
               var7 = 1779402326;
               var6 = var10000;
               int var5 = (var6 | var7) & (~var6 | ~var7);
               a = var5;
               var10000 = (int)2410179245123249041L;
               var7 = 754609660;
               var6 = var10000;
               var10000 = var6 + var7 - 2 * (var6 & var7);
               var7 = -777265513;
               var6 = var10000;
               var10000 = (var6 & ~var7 | ~var6 & var7) * (var6 & ~var7 | ~var6 & var7);
               var7 = 2095175079;
               var6 = -96910407;
               var10000 = (var6 | var7) & (~var6 | ~var7);
               var7 = -1945867585;
               var6 = var10000;
               if ((var6 | var7) - (var6 & var7) < a) {
                  var182 = (int)6005803224316927768L;
                  var7 = -106705512;
                  var6 = var182;
                  var182 = (var6 | var7) - (var6 & var7);
                  var7 = -1712483712;
                  var6 = var182;
                  var182 = var6 & ~var7 | ~var6 & var7;
                  var7 = 527397067;
                  var6 = 1382632690;
                  var182 = (var6 | var7) - (var6 & var7);
                  var7 = 1292254269;
                  var6 = var182;
                  var182 = var6 & ~var7 | ~var6 & var7;
                  var7 = -1609818640;
                  var6 = -450842265;
                  var10000 = (var6 | var7) & ~(var6 & var7);
                  var7 = 141999455;
                  var6 = var10000;
                  var5 = (var6 | var7) & ~(var6 & var7);
                  a = var5;
               }
            } else {
               var7 = 76440157;
               var6 = -2104992234;
               var10000 = (var6 | var7) - (var6 & var7);
               var7 = -2046411701;
               var6 = var10000;
               var3 = var6 + var7 - 2 * (var6 & var7);
            }
            break;
         case 110549953:
            var7 = 1938783604;
            var6 = 1379776873;
            int var10001 = (var6 | var7) - (var6 & var7);
            var7 = -1657573535;
            var6 = var10001;
            var10001 = var6 + var7 - 2 * (var6 & var7);
            var7 = -186667375;
            var6 = 830771543;
            int var10002 = (var6 | var7) & (~var6 | ~var7);
            var7 = 221449530;
            var6 = var10002;
            var10002 = (var6 | var7) - (var6 & var7);
            var7 = 1473768134;
            var6 = -1766442210;
            int var10003 = var6 + var7 - 2 * (var6 & var7);
            var7 = 1833074315;
            var6 = var10003;
            var7 = (var6 | var7) - (var6 & var7);
            var6 = var10002;
            var10002 = (var6 | var7) + (var6 & var7);
            var10003 = (int)-3010947898106942852L;
            var7 = 992826192;
            var6 = var10003;
            var10003 = var6 & ~var7 | ~var6 & var7;
            var7 = -382045921;
            var6 = var10003;
            var10003 = ((var6 | var7) & ~(var6 & var7)) * ((var6 | var7) & ~(var6 & var7));
            var10003 = (int)430774556499838409L;
            var7 = -435350488;
            var6 = var10003;
            var10003 = (var6 | var7) & ~(var6 & var7);
            var7 = -852035090;
            var6 = var10003;
            var10003 = var6 + var7 - 2 * (var6 & var7);
            var7 = 1703351633;
            var6 = 1492949891;
            int var10005 = (var6 | var7) & ~(var6 & var7);
            var7 = 1031507666;
            var6 = var10005;
            var10005 = (var6 | var7) & ~(var6 & var7);
            var10005 = (int)-5716731578670107199L;
            var7 = -583945601;
            var6 = var10005;
            var10005 = var6 + var7 - 2 * (var6 & var7);
            var7 = 741181370;
            var6 = var10005;
            var10005 = (var6 | var7) & (~var6 | ~var7);
            var7 = 1548555937;
            var6 = 92894899;
            var10005 = (var6 | var7) & (~var6 | ~var7);
            var7 = 1506041881;
            var6 = var10005;
            var10005 = (var6 | var7) & (~var6 | ~var7);
            int var10004 = (int)-2406209269189730193L;
            var7 = -837823687;
            var6 = var10004;
            var10004 = (var6 | var7) & (~var6 | ~var7);
            var7 = -374764067;
            var6 = var10004;
            var10004 = var6 + var7 - 2 * (var6 & var7);
            var7 = 2115623545;
            var6 = -1245417627;
            int var10006 = (var6 | var7) & ~(var6 & var7);
            var7 = -874662631;
            var6 = var10006;
            var10006 = (var6 | var7) & ~(var6 & var7);
            var10006 = (int)1388259088869414257L;
            var7 = 1162418720;
            var6 = var10006;
            var10006 = (var6 | var7) & (~var6 | ~var7);
            var7 = 2098057051;
            var6 = var10006;
            var10006 = (var6 | var7) & (~var6 | ~var7);
            var7 = -185069373;
            var6 = -298168111;
            var10006 = (var6 | var7) - (var6 & var7);
            var7 = 448938008;
            var6 = var10006;
            var10006 = var6 & ~var7 | ~var6 & var7;
            var10006 = (int)-9001240543675741595L;
            var7 = -80331384;
            var6 = var10006;
            var10006 = (var6 | var7) & ~(var6 & var7);
            var7 = 1936406526;
            var6 = var10006;
            var10006 = var6 + var7 - 2 * (var6 & var7);
            var10005 = (int)3268584852684718930L;
            var7 = 2083218966;
            var6 = var10005;
            var10005 = var6 + var7 - 2 * (var6 & var7);
            var7 = 1866445509;
            var6 = var10005;
            var10005 = var6 + var7 - 2 * (var6 & var7);
            int var10007 = (int)-7938888449172801223L;
            var7 = -1532195776;
            var6 = var10007;
            var10007 = (var6 | var7) - (var6 & var7);
            var7 = -550046358;
            var6 = var10007;
            var10007 = var6 & ~var7 | ~var6 & var7;
            var10007 = (int)-1291760639327460914L;
            var7 = 1559645881;
            var6 = var10007;
            var10007 = var6 + var7 - 2 * (var6 & var7);
            var7 = -1158123673;
            var6 = var10007;
            var10007 = (var6 | var7) & ~(var6 & var7);
            var7 = 1628607762;
            var6 = 430368446;
            var10006 = var6 + var7 - 2 * (var6 & var7);
            var7 = 2029360409;
            var6 = var10006;
            if (var2.equals(c("мћјм¤ќмћјм¤—мћҐ", "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ", var10003, var10004, var10005, var6 + var7 - 2 * (var6 & var7)))
               )
             {
               var10000 = (int)-2858946745191067898L;
               var7 = -1144603163;
               var6 = var10000;
               var10000 = (var6 | var7) & (~var6 | ~var7);
               var7 = -1629080862;
               var6 = var10000;
               var3 = (var6 | var7) - (var6 & var7);
            }
      }

      switch (var3) {
         case 0:
            return this.s.b();
         case 1:
            return this.B.b();
         default:
            return this.j.b();
      }
   }

   private float b(String var1) {
      String var2 = var1;
      int var5 = -1747701706;
      int var4 = 1831026847;
      int var10000 = (var4 | var5) - (var4 & var5);
      var5 = 84447062;
      var4 = var10000;
      int var3 = (var4 | var5) & ~(var4 & var5);
      switch (var2.hashCode()) {
         case -1407259064:
            int var131 = (int)584770673394899272L;
            var5 = 1878282986;
            var4 = var131;
            var131 = var4 + var5 - 2 * (var4 & var5);
            var5 = -644084414;
            var4 = var131;
            var131 = (var4 | var5) - (var4 & var5);
            var5 = -1200323734;
            var4 = -522201956;
            int var138 = (var4 | var5) & ~(var4 & var5);
            var5 = -1800711434;
            var4 = var138;
            var138 = var4 + var5 - 2 * (var4 & var5);
            int var151 = (int)-6426596546917728825L;
            var5 = -1236256432;
            var4 = var151;
            var151 = (var4 | var5) & (~var4 | ~var5);
            var5 = -865647468;
            var4 = var151;
            var151 = var4 + var5 - 2 * (var4 & var5);
            var5 = 1539314706;
            var4 = 1310226662;
            var151 = (var4 | var5) & ~(var4 & var5);
            var5 = 366505190;
            var4 = var151;
            var151 = (var4 | var5) - (var4 & var5);
            var5 = 1419251084;
            var4 = 1257304977;
            int var145 = (var4 | var5) & ~(var4 & var5);
            var5 = 1998591506;
            var4 = var145;
            var145 = (var4 | var5) - (var4 & var5);
            var151 = (int)1699713043498121479L;
            var5 = 1795831843;
            var4 = var151;
            var151 = (var4 | var5) & ~(var4 & var5);
            var5 = 655780558;
            var4 = var151;
            var151 = (var4 | var5) - (var4 & var5);
            var5 = -748095598;
            var4 = -1560599665;
            int var168 = var4 & ~var5 | ~var4 & var5;
            var5 = 1826213514;
            var4 = var168;
            var5 = (var4 | var5) & ~(var4 & var5);
            var4 = var151;
            var151 = (var4 ^ var5) + 2 * (var4 & var5);
            var151 = (int)5356208379536580633L;
            var5 = -1787801900;
            var4 = var151;
            var151 = var4 + var5 - 2 * (var4 & var5);
            var5 = 2052590995;
            var4 = var151;
            var151 = (var4 | var5) - (var4 & var5);
            var5 = 1191180890;
            var4 = 954234649;
            var168 = (var4 | var5) - (var4 & var5);
            var5 = 2019816000;
            var4 = var168;
            var168 = ((var4 | var5) & ~(var4 & var5)) * ((var4 | var5) & ~(var4 & var5));
            var5 = -857789603;
            var4 = 20063405;
            var168 = (var4 | var5) - (var4 & var5);
            var5 = -881170682;
            var4 = var168;
            var168 = (var4 | var5) - (var4 & var5);
            int var177 = (int)-7441599912137117444L;
            var5 = -1533324243;
            var4 = var177;
            var177 = var4 & ~var5 | ~var4 & var5;
            var5 = -890789501;
            var4 = var177;
            var177 = (var4 | var5) & (~var4 | ~var5);
            var5 = -1324805188;
            var4 = -659537392;
            int var10007 = var4 + var5 - 2 * (var4 & var5);
            var5 = -1213220089;
            var4 = var10007;
            var5 = (var4 | var5) - (var4 & var5);
            var4 = var177;
            var177 = (var4 ^ var5) + 2 * (var4 & var5);
            var5 = 164531537;
            var4 = -717120931;
            var177 = var4 & ~var5 | ~var4 & var5;
            var5 = -595051757;
            var4 = var177;
            if (var2.equals(
               c("вќћ\ue35bвќ‹\ue34eвќњ\ue344", "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ", var145, var151, var168, var4 & ~var5 | ~var4 & var5)
            )) {
               var5 = -2099163627;
               var4 = 209814643;
               var10000 = var4 & ~var5 | ~var4 & var5;
               var5 = -1906259354;
               var4 = var10000;
               var3 = var4 + var5 - 2 * (var4 & var5);
            }
            break;
         case 110549953:
            int var10001 = (int)-4698390875733593031L;
            var5 = -1741070732;
            var4 = var10001;
            var10001 = (var4 | var5) & ~(var4 & var5);
            var5 = -1369745196;
            var4 = var10001;
            var10001 = var4 & ~var5 | ~var4 & var5;
            int var10002 = (int)-1098875472483544796L;
            var5 = -1526831666;
            var4 = var10002;
            var10002 = var4 & ~var5 | ~var4 & var5;
            var5 = -397234148;
            var4 = var10002;
            var5 = (var4 | var5) & ~(var4 & var5);
            var4 = var10001;
            var10001 = (var4 | var5) + (var4 & var5);
            var5 = -1301600109;
            var4 = 1274080768;
            var10002 = var4 + var5 - 2 * (var4 & var5);
            var5 = 1529460239;
            var4 = var10002;
            var10002 = (var4 | var5) - (var4 & var5);
            int var10003 = (int)6247664312438615622L;
            var5 = -1569574427;
            var4 = var10003;
            var10003 = (var4 | var5) & (~var4 | ~var5);
            var5 = -863609464;
            var4 = var10003;
            var5 = (var4 | var5) & (~var4 | ~var5);
            var4 = var10002;
            var10002 = (var4 | var5) + (var4 & var5);
            String var141 = "dfv";
            var10003 = (int)1766112577314197356L;
            var5 = 1449626241;
            var4 = var10003;
            var10003 = var4 & ~var5 | ~var4 & var5;
            var5 = 453438946;
            var4 = var10003;
            var10003 = (var4 | var5) & (~var4 | ~var5);
            var5 = -511094215;
            var4 = 1594342703;
            int var10004 = (var4 | var5) - (var4 & var5);
            var5 = 848092204;
            var4 = var10004;
            var10004 = var4 + var5 - 2 * (var4 & var5);
            int var10005 = (int)-6793232415617141102L;
            var5 = 36027742;
            var4 = var10005;
            var10005 = (var4 | var5) - (var4 & var5);
            var5 = -1255630070;
            var4 = var10005;
            var5 = (var4 | var5) - (var4 & var5);
            var4 = var10004;
            var10004 = (var4 | var5) + (var4 & var5);
            var5 = 358905272;
            var4 = -1441618887;
            var10004 = (var4 | var5) & (~var4 | ~var5);
            var5 = -581620414;
            var4 = var10004;
            var10004 = (var4 | var5) - (var4 & var5);
            var5 = -209785609;
            var4 = 1104528665;
            var10005 = var4 + var5 - 2 * (var4 & var5);
            var5 = -187768916;
            var4 = var10005;
            var10005 = var4 + var5 - 2 * (var4 & var5);
            var5 = 1817069712;
            var4 = 491607808;
            var10005 = (var4 | var5) - (var4 & var5);
            var5 = 1913929507;
            var4 = var10005;
            var10005 = (var4 | var5) & (~var4 | ~var5);
            int var10006 = (int)107868742923606122L;
            var5 = 1296970483;
            var4 = var10006;
            var10006 = (var4 | var5) & ~(var4 & var5);
            var5 = -946016463;
            var4 = var10006;
            var10006 = (var4 | var5) - (var4 & var5);
            var10006 = (int)-1364639431685898968L;
            var5 = 1088609652;
            var4 = var10006;
            var10006 = (var4 | var5) & ~(var4 & var5);
            var5 = -2094045736;
            var4 = var10006;
            if (var2.equals(c("вќ‹и«›вќ‹и«‘вќ’", "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ", var10003, var10004, var10005, var4 + var5 - 2 * (var4 & var5)))
               )
             {
               var5 = -1578187445;
               var4 = 2057301439;
               var10000 = (var4 | var5) & (~var4 | ~var5);
               var5 = -613340939;
               var4 = var10000;
               var3 = (var4 | var5) - (var4 & var5);
            }
      }

      switch (var3) {
         case 0:
            return this.t.a();
         case 1:
            return this.C.a();
         default:
            return this.k.a();
      }
   }

   private int c(String var1) {
      String var2 = var1;
      int var7 = -884659438;
      int var6 = -1212016105;
      int var10000 = (var6 | var7) & (~var6 | ~var7);
      var7 = -2089234694;
      var6 = var10000;
      int var3 = var6 + var7 - 2 * (var6 & var7);
      switch (var2.hashCode()) {
         case -1407259064:
            int var149 = (int)2472432440265904920L;
            var7 = 1758361176;
            var6 = var149;
            var149 = var6 & ~var7 | ~var6 & var7;
            var7 = 15265473;
            var6 = var149;
            var149 = (var6 | var7) & (~var6 | ~var7);
            int var157 = (int)-944945034180011957L;
            var7 = -1828028186;
            var6 = var157;
            var157 = (var6 | var7) - (var6 & var7);
            var7 = -834264150;
            var6 = var157;
            var7 = var6 & ~var7 | ~var6 & var7;
            var6 = var149;
            var149 = (var6 & ~var7) + (var7 & ~var6) + 2 * (var6 & var7);
            var157 = (int)8918289713461227457L;
            var7 = 1355700951;
            var6 = var157;
            var157 = (var6 | var7) & ~(var6 & var7);
            var7 = 1791268396;
            var6 = var157;
            var157 = (var6 + var7 - 2 * (var6 & var7)) * (var6 + var7 - 2 * (var6 & var7));
            var7 = 1314355424;
            var6 = 1411893890;
            int var171 = (var6 | var7) - (var6 & var7);
            var7 = 443593312;
            var6 = var171;
            var171 = var6 + var7 - 2 * (var6 & var7);
            var7 = -394650754;
            var6 = 863992040;
            var171 = (var6 | var7) & ~(var6 & var7);
            var7 = -620403824;
            var6 = var171;
            var171 = var6 & ~var7 | ~var6 & var7;
            var171 = (int)-2867347962319179688L;
            var7 = 888630878;
            var6 = var171;
            var171 = (var6 | var7) & ~(var6 & var7);
            var7 = 1852907012;
            var6 = var171;
            var171 = (var6 | var7) & ~(var6 & var7);
            int var164 = (int)-1216287322448735697L;
            var7 = 1244244158;
            var6 = var164;
            var164 = (var6 | var7) & ~(var6 & var7);
            var7 = -71265634;
            var6 = var164;
            var164 = var6 & ~var7 | ~var6 & var7;
            var171 = (int)-1220185079928357465L;
            var7 = 1914300062;
            var6 = var171;
            var171 = var6 + var7 - 2 * (var6 & var7);
            var7 = -1286750494;
            var6 = var171;
            var171 = ((var6 | var7) & (~var6 | ~var7)) * ((var6 | var7) & (~var6 | ~var7));
            var171 = (int)-4544855063906274969L;
            var7 = -1341518501;
            var6 = var171;
            var171 = var6 + var7 - 2 * (var6 & var7);
            var7 = -1923635086;
            var6 = var171;
            var171 = (var6 | var7) & ~(var6 & var7);
            int var193 = (int)704009451698647794L;
            var7 = -604868049;
            var6 = var193;
            var193 = var6 & ~var7 | ~var6 & var7;
            var7 = 485589214;
            var6 = var193;
            var193 = (var6 | var7) - (var6 & var7);
            int var187 = (int)-3666513076056418205L;
            var7 = -1525327154;
            var6 = var187;
            var187 = (var6 | var7) - (var6 & var7);
            var7 = 542180896;
            var6 = var187;
            var187 = (var6 | var7) & (~var6 | ~var7);
            var193 = (int)1672842181233813899L;
            var7 = -1078236612;
            var6 = var193;
            var193 = (var6 | var7) & ~(var6 & var7);
            var7 = -51106612;
            var6 = var193;
            var193 = var6 & ~var7 | ~var6 & var7;
            int var10007 = (int)7338969658515766791L;
            var7 = -889416902;
            var6 = var10007;
            var10007 = (var6 | var7) - (var6 & var7);
            var7 = -1439028396;
            var6 = var10007;
            var7 = (var6 | var7) - (var6 & var7);
            var6 = var193;
            var193 = var6 - ~var7 - 1;
            var193 = (int)-4887969730878539772L;
            var7 = -2142344267;
            var6 = var193;
            var193 = var6 + var7 - 2 * (var6 & var7);
            var7 = -434817029;
            var6 = var193;
            if (var2.equals(c("жѕ›кЏ‹жѕЋкЏћжѕ™кЏ”", "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ", var164, var171, var187, var6 & ~var7 | ~var6 & var7))) {
               var10000 = (int)-7506651641210622486L;
               var7 = -405870012;
               var6 = var10000;
               var10000 = (var6 | var7) & (~var6 | ~var7);
               var7 = 1455900590;
               var6 = var10000;
               var3 = var6 & ~var7 | ~var6 & var7;
               var10000 = (int)-5507303497553086451L;
               var7 = 1067685919;
               var6 = var10000;
               var10000 = var6 + var7 - 2 * (var6 & var7);
               var7 = -623041180;
               var6 = var10000;
               var10000 = var6 & ~var7 | ~var6 & var7;
               var149 = (int)-642407291207012306L;
               var7 = -1361770682;
               var6 = var149;
               var149 = (var6 | var7) & ~(var6 & var7);
               var7 = -1338921254;
               var6 = var149;
               var7 = var6 + var7 - 2 * (var6 & var7);
               var6 = var10000;
               var10000 = (var6 | var7) + (var6 & var7);
               var7 = 596493909;
               var6 = 1178396787;
               var10000 = (var6 | var7) & ~(var6 & var7);
               var7 = 1399658794;
               var6 = var10000;
               int var5 = var6 + var7 - 2 * (var6 & var7);
               a = var5;
               var7 = -554985434;
               var6 = -1294095987;
               var10000 = (var6 | var7) & (~var6 | ~var7);
               var7 = -844355;
               var6 = var10000;
               var10000 = var6 + var7 - 2 * (var6 & var7);
               var149 = (int)2792662313965696622L;
               var7 = -320592727;
               var6 = var149;
               var149 = (var6 | var7) & (~var6 | ~var7);
               var7 = 1223807254;
               var6 = var149;
               var7 = (var6 | var7) & ~(var6 & var7);
               var6 = var10000;
               var10000 = 2 * (var6 | var7) - (var6 ^ var7);
               var7 = 176273123;
               var6 = 636676628;
               var10000 = (var6 | var7) & ~(var6 & var7);
               var7 = 1254338778;
               var6 = var10000;
               if (((var6 | var7) & ~(var6 & var7)) <= a) {
                  String var147 = "dfw";
                  var7 = 1538733402;
                  var6 = 1253290142;
                  var10000 = (var6 | var7) - (var6 & var7);
                  var7 = 25503211;
                  var6 = var10000;
                  var5 = var6 + var7 - 2 * (var6 & var7);
                  a = var5;
               }
            }
            break;
         case 110549953:
            String var10001 = "dfx";
            String var10002 = "dfy";
            String var10003 = "dfz";
            var7 = -1544248577;
            var6 = 201457505;
            int var162 = (var6 | var7) & (~var6 | ~var7);
            var7 = -960645743;
            var6 = var162;
            int var163 = (var6 | var7) - (var6 & var7);
            int var10004 = (int)-5774829584728923182L;
            var7 = -365322224;
            var6 = var10004;
            var10004 = var6 & ~var7 | ~var6 & var7;
            var7 = 1779306788;
            var6 = var10004;
            var10004 = (var6 + var7 - 2 * (var6 & var7)) * (var6 + var7 - 2 * (var6 & var7));
            var7 = 979196782;
            var6 = 1442719053;
            var10004 = var6 + var7 - 2 * (var6 & var7);
            var7 = 2063406108;
            var6 = var10004;
            var10004 = (var6 | var7) & ~(var6 & var7);
            String var10005 = "dga";
            int var184 = (int)-2670021552657006763L;
            var7 = 774402800;
            var6 = var184;
            int var185 = var6 & ~var7 | ~var6 & var7;
            var7 = 2098067015;
            var6 = var185;
            int var186 = (var6 | var7) - (var6 & var7);
            var7 = 1781427417;
            var6 = 1511893181;
            int var10006 = (var6 | var7) - (var6 & var7);
            var7 = -1467339841;
            var6 = var10006;
            var10006 = ((var6 | var7) & ~(var6 & var7)) * ((var6 | var7) & ~(var6 & var7));
            var10006 = (int)-6352885251443411473L;
            var7 = 1845056753;
            var6 = var10006;
            var10006 = (var6 | var7) & (~var6 | ~var7);
            var7 = -1255728347;
            var6 = var10006;
            if (var2.equals(c("жѕЋз¶ЎжѕЋз¶«жѕ—", "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ", var163, var10004, var186, (var6 | var7) & (~var6 | ~var7)))) {
               var7 = 1846258862;
               var6 = 1576864288;
               var10000 = (var6 | var7) & (~var6 | ~var7);
               var7 = 871802511;
               var6 = var10000;
               var3 = (var6 | var7) & (~var6 | ~var7);
            }
      }

      switch (var3) {
         case 0:
            return this.u.b();
         case 1:
            return this.D.b();
         default:
            return this.l.b();
      }
   }

   private double d(String var1) {
      String var2 = var1;
      int var10000 = (int)5144811166015697778L;
      int var5 = -276333063;
      int var4 = var10000;
      var10000 = (var4 | var5) - (var4 & var5);
      var5 = 1387049332;
      var4 = var10000;
      int var3 = (var4 | var5) & ~(var4 & var5);
      switch (var2.hashCode()) {
         case -1407259064:
            int var159 = (int)-9072840068680610968L;
            var5 = 915709543;
            var4 = var159;
            var159 = (var4 | var5) & ~(var4 & var5);
            var5 = -1108276367;
            var4 = var159;
            var159 = (var4 | var5) & (~var4 | ~var5);
            int var10002 = (int)-4621032142181886076L;
            var5 = -1941779392;
            var4 = var10002;
            var10002 = var4 + var5 - 2 * (var4 & var5);
            var5 = 470371531;
            var4 = var10002;
            var5 = (var4 | var5) & (~var4 | ~var5);
            var4 = var159;
            var159 = (var4 & ~var5) + (var5 & ~var4) + 2 * (var4 & var5);
            var10002 = (int)-5139777885277782943L;
            var5 = 1656292835;
            var4 = var10002;
            var10002 = (var4 | var5) & (~var4 | ~var5);
            var5 = -1765753739;
            var4 = var10002;
            var10002 = var4 & ~var5 | ~var4 & var5;
            int var181 = (int)2670457657559379827L;
            var5 = -501814607;
            var4 = var181;
            var181 = (var4 | var5) & ~(var4 & var5);
            var5 = -1600485942;
            var4 = var181;
            var181 = (var4 | var5) - (var4 & var5);
            var5 = 1132455566;
            var4 = -993364727;
            var181 = (var4 | var5) & ~(var4 & var5);
            var5 = -2018143356;
            var4 = var181;
            var181 = (var4 | var5) - (var4 & var5);
            var5 = 1549482685;
            var4 = 1789016326;
            var181 = var4 & ~var5 | ~var4 & var5;
            var5 = 922289081;
            var4 = var181;
            var181 = var4 + var5 - 2 * (var4 & var5);
            var5 = 882776710;
            var4 = -203662080;
            var181 = (var4 | var5) & (~var4 | ~var5);
            var5 = -951957612;
            var4 = var181;
            var181 = (var4 | var5) & (~var4 | ~var5);
            var5 = 2010659480;
            var4 = 7700736;
            int var177 = var4 + var5 - 2 * (var4 & var5);
            var5 = 518345623;
            var4 = var177;
            var177 = (var4 | var5) & ~(var4 & var5);
            var181 = (int)-1545174269447694348L;
            var5 = -577148535;
            var4 = var181;
            var181 = (var4 | var5) & ~(var4 & var5);
            var5 = 1680820623;
            var4 = var181;
            var181 = var4 + var5 - 2 * (var4 & var5);
            int var211 = (int)-7710293377576594222L;
            var5 = -172852961;
            var4 = var211;
            var211 = var4 & ~var5 | ~var4 & var5;
            var5 = -2069115246;
            var4 = var211;
            var5 = var4 & ~var5 | ~var4 & var5;
            var4 = var181;
            var181 = (var4 & ~var5) + (var5 & ~var4) + 2 * (var4 & var5);
            var181 = (int)-3007819331958348893L;
            var5 = -1382823662;
            var4 = var181;
            var181 = (var4 | var5) & ~(var4 & var5);
            var5 = 275083108;
            var4 = var181;
            var181 = (var4 | var5) - (var4 & var5);
            int var219 = (int)5002483830108278703L;
            var5 = 1144260701;
            var4 = var219;
            var219 = (var4 | var5) & (~var4 | ~var5);
            var5 = 1275676659;
            var4 = var219;
            var219 = (var4 | var5) - (var4 & var5);
            var219 = (int)4435551303883744647L;
            var5 = 1061494337;
            var4 = var219;
            var219 = var4 & ~var5 | ~var4 & var5;
            var5 = 877132758;
            var4 = var219;
            var219 = var4 + var5 - 2 * (var4 & var5);
            var5 = -831951079;
            var4 = -1690928977;
            var219 = (var4 | var5) & ~(var4 & var5);
            var5 = 1432295334;
            var4 = var219;
            var219 = (var4 | var5) - (var4 & var5);
            var5 = 843992122;
            var4 = 2128051779;
            var219 = (var4 | var5) & ~(var4 & var5);
            var5 = 1285108344;
            var4 = var219;
            var219 = (var4 | var5) - (var4 & var5);
            var211 = (int)7683327975391183204L;
            var5 = -66704854;
            var4 = var211;
            var211 = (var4 | var5) & (~var4 | ~var5);
            var5 = 88959839;
            var4 = var211;
            var211 = var4 & ~var5 | ~var4 & var5;
            var219 = (int)-1708719297427730425L;
            var5 = -1690284296;
            var4 = var219;
            var219 = var4 + var5 - 2 * (var4 & var5);
            var5 = -2091057260;
            var4 = var219;
            var219 = (var4 | var5) & (~var4 | ~var5);
            var5 = 81148123;
            var4 = 92435318;
            var219 = var4 + var5 - 2 * (var4 & var5);
            var5 = 24823625;
            var4 = var219;
            if (var2.equals(c("гўЊе±Ігў™е±§гўЋе±­", "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ", var177, var181, var211, (var4 | var5) & (~var4 | ~var5)))) {
               var10000 = (int)-2161210364804019439L;
               var5 = -629531264;
               var4 = var10000;
               var10000 = (var4 | var5) & (~var4 | ~var5);
               var5 = 1787614865;
               var4 = var10000;
               var3 = var4 + var5 - 2 * (var4 & var5);
            }
            break;
         case 110549953:
            int var10001 = (int)-7968306641707249630L;
            var5 = 310217050;
            var4 = var10001;
            var10001 = (var4 | var5) - (var4 & var5);
            var5 = 1427702757;
            var4 = var10001;
            var10001 = var4 & ~var5 | ~var4 & var5;
            var5 = -1950659750;
            var4 = 832091409;
            int var10003 = (var4 | var5) & (~var4 | ~var5);
            var5 = -1172046270;
            var4 = var10003;
            var10003 = (var4 | var5) & (~var4 | ~var5);
            var10003 = (int)7200763839208827692L;
            var5 = 536709421;
            var4 = var10003;
            var10003 = var4 & ~var5 | ~var4 & var5;
            var5 = 1685627394;
            var4 = var10003;
            var10003 = (var4 | var5) & (~var4 | ~var5);
            var5 = 564712740;
            var4 = -115754897;
            var10003 = (var4 | var5) & ~(var4 & var5);
            var5 = -659460775;
            var4 = var10003;
            var10003 = (var4 | var5) & ~(var4 & var5);
            var5 = -791672396;
            var4 = 1696453368;
            var10003 = var4 & ~var5 | ~var4 & var5;
            var5 = 737784466;
            var4 = var10003;
            var10003 = (var4 | var5) - (var4 & var5);
            var5 = 99318410;
            var4 = 1123266717;
            var10003 = (var4 | var5) & ~(var4 & var5);
            var5 = 777003544;
            var4 = var10003;
            var10003 = var4 + var5 - 2 * (var4 & var5);
            var5 = 1570399448;
            var4 = 883994047;
            int var10005 = var4 & ~var5 | ~var4 & var5;
            var5 = 1764411749;
            var4 = var10005;
            var10005 = var4 & ~var5 | ~var4 & var5;
            var10005 = (int)6099398341596405894L;
            var5 = -208270787;
            var4 = var10005;
            var10005 = (var4 | var5) & ~(var4 & var5);
            var5 = 904129210;
            var4 = var10005;
            var10005 = var4 & ~var5 | ~var4 & var5;
            var10005 = (int)-1670407372056544143L;
            var5 = -1276550135;
            var4 = var10005;
            var10005 = var4 + var5 - 2 * (var4 & var5);
            var5 = -712419216;
            var4 = var10005;
            var10005 = var4 & ~var5 | ~var4 & var5;
            var5 = 1900074272;
            var4 = -126149109;
            var10005 = (var4 | var5) - (var4 & var5);
            var5 = -1992570079;
            var4 = var10005;
            var10005 = (var4 | var5) - (var4 & var5);
            int var10004 = (int)-7399612572668648845L;
            var5 = -1150564690;
            var4 = var10004;
            var10004 = (var4 | var5) - (var4 & var5);
            var5 = 504073583;
            var4 = var10004;
            var10004 = var4 & ~var5 | ~var4 & var5;
            var5 = 893039629;
            var4 = -1495524449;
            var10005 = var4 + var5 - 2 * (var4 & var5);
            var5 = 805090188;
            var4 = var10005;
            var10005 = var4 & ~var5 | ~var4 & var5;
            var10005 = (int)552559572227766213L;
            var5 = 1341715187;
            var4 = var10005;
            var10005 = (var4 | var5) - (var4 & var5);
            var5 = -1942209330;
            var4 = var10005;
            var10005 = (var4 | var5) & ~(var4 & var5);
            int var10006 = (int)-6316568724806009781L;
            var5 = -1851317791;
            var4 = var10006;
            var10006 = (var4 | var5) & (~var4 | ~var5);
            var5 = -1463434006;
            var4 = var10006;
            var10006 = (var4 + var5 - 2 * (var4 & var5)) * (var4 + var5 - 2 * (var4 & var5));
            var5 = -1400608533;
            var4 = 1558483520;
            var10006 = var4 & ~var5 | ~var4 & var5;
            var5 = -262583702;
            var4 = var10006;
            if (var2.equals(c("гў™жЃЊгў™жЃ†гўЂ", "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ", var10003, var10004, var10005, var4 & ~var5 | ~var4 & var5))) {
               var10000 = (int)3958624478508569315L;
               var5 = -1811047383;
               var4 = var10000;
               var10000 = (var4 | var5) - (var4 & var5);
               var5 = -995701045;
               var4 = var10000;
               var3 = var4 + var5 - 2 * (var4 & var5);
            }
      }

      switch (var3) {
         case 0:
            return this.v.a();
         case 1:
            return this.E.a();
         default:
            return this.m.a();
      }
   }

   private String e(String var1) {
      String var2 = var1;
      int var5 = -2081040316;
      int var4 = -1728471494;
      int var10000 = (var4 | var5) & ~(var4 & var5);
      var5 = -453789311;
      var4 = var10000;
      int var3 = (var4 | var5) - (var4 & var5);
      switch (var2.hashCode()) {
         case -1407259064:
            String var140 = "dgb";
            int var144 = (int)-4505628408545623873L;
            var5 = -760359321;
            var4 = var144;
            var144 = (var4 | var5) - (var4 & var5);
            var5 = -1958080154;
            var4 = var144;
            var144 = ((var4 | var5) & (~var4 | ~var5)) * ((var4 | var5) & (~var4 | ~var5));
            var5 = 1858709949;
            var4 = -1665245398;
            int var155 = var4 + var5 - 2 * (var4 & var5);
            var5 = -227019115;
            var4 = var155;
            var155 = (var4 | var5) & ~(var4 & var5);
            var5 = 707687729;
            var4 = -1458229562;
            var155 = var4 & ~var5 | ~var4 & var5;
            var5 = -2093261849;
            var4 = var155;
            var155 = (var4 | var5) & ~(var4 & var5);
            var5 = -470376589;
            var4 = -895244263;
            var155 = (var4 | var5) & ~(var4 & var5);
            var5 = 693450596;
            var4 = var155;
            var155 = (var4 | var5) & ~(var4 & var5);
            var5 = -1940525650;
            var4 = 839125377;
            var155 = (var4 | var5) & ~(var4 & var5);
            var5 = -1101929429;
            var4 = var155;
            var155 = var4 & ~var5 | ~var4 & var5;
            int var150 = (int)-2422754187076386950L;
            var5 = 665139913;
            var4 = var150;
            var150 = var4 & ~var5 | ~var4 & var5;
            var5 = 2077584828;
            var4 = var150;
            var150 = (var4 | var5) - (var4 & var5);
            var155 = (int)-4143360880985631579L;
            var5 = -694719736;
            var4 = var155;
            var155 = (var4 | var5) & ~(var4 & var5);
            var5 = 1056539487;
            var4 = var155;
            var155 = var4 & ~var5 | ~var4 & var5;
            var155 = (int)-6245804346434164682L;
            var5 = -1290144838;
            var4 = var155;
            var155 = var4 + var5 - 2 * (var4 & var5);
            var5 = -171523235;
            var4 = var155;
            var155 = var4 + var5 - 2 * (var4 & var5);
            var5 = 1186549151;
            var4 = -1814672268;
            int var175 = var4 & ~var5 | ~var4 & var5;
            var5 = -714145288;
            var4 = var175;
            var175 = var4 + var5 - 2 * (var4 & var5);
            var175 = (int)2787807139314557760L;
            var5 = -1176475713;
            var4 = var175;
            var175 = (var4 | var5) - (var4 & var5);
            var5 = 415499504;
            var4 = var175;
            var175 = (var4 | var5) - (var4 & var5);
            var175 = (int)1563896172279794389L;
            var5 = -1216938770;
            var4 = var175;
            var175 = var4 & ~var5 | ~var4 & var5;
            var5 = -786270678;
            var4 = var175;
            var175 = (var4 | var5) - (var4 & var5);
            var5 = 374807840;
            var4 = 2134049375;
            int var173 = (var4 | var5) & (~var4 | ~var5);
            var5 = 1958125303;
            var4 = var173;
            var173 = var4 + var5 - 2 * (var4 & var5);
            int var191 = (int)4354720493335974598L;
            var5 = -1153365421;
            var4 = var191;
            var191 = (var4 | var5) & (~var4 | ~var5);
            var5 = -567895917;
            var4 = var191;
            var191 = (var4 | var5) - (var4 & var5);
            var5 = -849435515;
            var4 = -1672389042;
            var191 = (var4 | var5) & (~var4 | ~var5);
            var5 = 1360001754;
            var4 = var191;
            var191 = (var4 | var5) - (var4 & var5);
            var5 = -1231912001;
            var4 = -1063138183;
            var191 = (var4 | var5) & ~(var4 & var5);
            var5 = 1983074254;
            var4 = var191;
            var191 = (var4 | var5) & ~(var4 & var5);
            var5 = 1942120268;
            var4 = -668434302;
            var191 = (var4 | var5) - (var4 & var5);
            var5 = -1410668608;
            var4 = var191;
            var191 = var4 + var5 - 2 * (var4 & var5);
            var175 = (int)-8383364754459038955L;
            var5 = 1871424235;
            var4 = var175;
            var175 = var4 + var5 - 2 * (var4 & var5);
            var5 = 1416805876;
            var4 = var175;
            if (var2.equals(c("бі–иЈ†біѓиЈ“бі”иЈ™", "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ", var150, var155, var173, var4 + var5 - 2 * (var4 & var5)))) {
               var10000 = (int)-2421583358639913182L;
               var5 = -1492102148;
               var4 = var10000;
               var10000 = (var4 | var5) & ~(var4 & var5);
               var5 = 1431639262;
               var4 = var10000;
               var3 = (var4 | var5) & ~(var4 & var5);
            }
            break;
         case 110549953:
            var5 = 516792521;
            var4 = -1090255832;
            int var10001 = (var4 | var5) & ~(var4 & var5);
            var5 = -105291184;
            var4 = var10001;
            var10001 = (var4 | var5) & ~(var4 & var5);
            int var10002 = (int)6745119395788564309L;
            var5 = 278850079;
            var4 = var10002;
            var10002 = (var4 | var5) & (~var4 | ~var5);
            var5 = -2044488383;
            var4 = var10002;
            var5 = var4 + var5 - 2 * (var4 & var5);
            var4 = var10001;
            var10001 = (var4 & ~var5) + (var5 & ~var4) + 2 * (var4 & var5);
            var5 = -790145817;
            var4 = -507718905;
            var10002 = (var4 | var5) & (~var4 | ~var5);
            var5 = -573045405;
            var4 = var10002;
            var10002 = (var4 | var5) & (~var4 | ~var5);
            var5 = 1329265715;
            var4 = -550012518;
            int var10003 = var4 + var5 - 2 * (var4 & var5);
            var5 = 1201404410;
            var4 = var10003;
            var10003 = (var4 | var5) & ~(var4 & var5);
            var5 = 344748319;
            var4 = 676118899;
            var10003 = (var4 | var5) & ~(var4 & var5);
            var5 = 1434998883;
            var4 = var10003;
            var10003 = var4 + var5 - 2 * (var4 & var5);
            String var10004 = "dgc";
            var5 = 44462990;
            var4 = -1622701132;
            int var153 = (var4 | var5) - (var4 & var5);
            var5 = 956016471;
            var4 = var153;
            int var154 = (var4 | var5) & ~(var4 & var5);
            var5 = 627223364;
            var4 = -2146911280;
            int var10005 = (var4 | var5) & (~var4 | ~var5);
            var5 = -1310950423;
            var4 = var10005;
            var10005 = ((var4 | var5) & ~(var4 & var5)) * ((var4 | var5) & ~(var4 & var5));
            var10005 = (int)4196559349125801398L;
            var5 = 225226647;
            var4 = var10005;
            var10005 = (var4 | var5) - (var4 & var5);
            var5 = 2043041343;
            var4 = var10005;
            var10005 = (var4 | var5) & ~(var4 & var5);
            var5 = 999994822;
            var4 = -436028929;
            int var10007 = (var4 | var5) & (~var4 | ~var5);
            var5 = -577237957;
            var4 = var10007;
            var10007 = var4 + var5 - 2 * (var4 & var5);
            var5 = 914786579;
            var4 = 1128257699;
            var10007 = (var4 | var5) & ~(var4 & var5);
            var5 = 1975079357;
            var4 = var10007;
            var10007 = (var4 | var5) - (var4 & var5);
            var10007 = (int)-5199773108887390467L;
            var5 = -890989006;
            var4 = var10007;
            var10007 = (var4 | var5) & (~var4 | ~var5);
            var5 = -20455202;
            var4 = var10007;
            var10007 = var4 + var5 - 2 * (var4 & var5);
            var5 = 880489009;
            var4 = 1963454032;
            int var10006 = (var4 | var5) & (~var4 | ~var5);
            var5 = 1095458503;
            var4 = var10006;
            if (var2.equals(c("біѓз™±біѓз™»біљ", "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ", var10003, var154, var10005, (var4 | var5) & (~var4 | ~var5)))) {
               var10000 = (int)-4356222363747024686L;
               var5 = 1208461817;
               var4 = var10000;
               var10000 = var4 & ~var5 | ~var4 & var5;
               var5 = 1849207082;
               var4 = var10000;
               var3 = var4 + var5 - 2 * (var4 & var5);
            }
      }

      switch (var3) {
         case 0:
            return this.r.d();
         case 1:
            return this.A.d();
         default:
            return this.i.d();
      }
   }

   private Color f(String var1) {
      if (this.f.a()) {
         String var2 = var1;
         int var7 = 261384245;
         int var6 = 405168140;
         int var10000 = (var6 | var7) & (~var6 | ~var7);
         var7 = -397543482;
         var6 = var10000;
         int var3 = (var6 | var7) & ~(var6 & var7);
         switch (var2.hashCode()) {
            case -1407259064:
               int var149 = (int)6499341711768915737L;
               var7 = -1433820020;
               var6 = var149;
               var149 = (var6 | var7) & (~var6 | ~var7);
               var7 = 967751902;
               var6 = var149;
               var149 = ((var6 | var7) & (~var6 | ~var7)) * ((var6 | var7) & (~var6 | ~var7));
               int var157 = (int)-4985760868872799241L;
               var7 = 1389396060;
               var6 = var157;
               var157 = (var6 | var7) - (var6 & var7);
               var7 = -1726235732;
               var6 = var157;
               var157 = (var6 | var7) & ~(var6 & var7);
               var157 = (int)-5367392431917327498L;
               var7 = -358000652;
               var6 = var157;
               var157 = (var6 | var7) & (~var6 | ~var7);
               var7 = -1076114299;
               var6 = var157;
               var157 = var6 & ~var7 | ~var6 & var7;
               var157 = (int)-5365819556993154527L;
               var7 = 285067691;
               var6 = var157;
               var157 = (var6 | var7) - (var6 & var7);
               var7 = 686143205;
               var6 = var157;
               var157 = ((var6 | var7) - (var6 & var7)) * ((var6 | var7) - (var6 & var7));
               var157 = (int)2079144047995076347L;
               var7 = -686914166;
               var6 = var157;
               var157 = (var6 | var7) & (~var6 | ~var7);
               var7 = 1339773822;
               var6 = var157;
               var157 = var6 & ~var7 | ~var6 & var7;
               String var175 = "dgd";
               var7 = -1721847924;
               var6 = -439174465;
               int var176 = (var6 | var7) - (var6 & var7);
               var7 = -1588646682;
               var6 = var176;
               int var177 = var6 + var7 - 2 * (var6 & var7);
               var7 = 1995048109;
               var6 = -2053063870;
               int var189 = (var6 | var7) - (var6 & var7);
               var7 = -213205010;
               var6 = var189;
               var189 = (var6 | var7) & ~(var6 & var7);
               var7 = -268239329;
               var6 = -40037365;
               var189 = var6 + var7 - 2 * (var6 & var7);
               var7 = 228583964;
               var6 = var189;
               var189 = (var6 | var7) - (var6 & var7);
               var7 = 1431608573;
               var6 = -1549765978;
               var189 = (var6 | var7) & (~var6 | ~var7);
               var7 = -151720365;
               var6 = var189;
               var189 = (var6 | var7) & (~var6 | ~var7);
               var7 = 250209319;
               var6 = -1172767985;
               var189 = var6 + var7 - 2 * (var6 & var7);
               var7 = -1259266266;
               var6 = var189;
               var189 = var6 + var7 - 2 * (var6 & var7);
               int var181 = (int)-5276147919116244193L;
               var7 = -1532617775;
               var6 = var181;
               var181 = var6 + var7 - 2 * (var6 & var7);
               var7 = 1296498966;
               var6 = var181;
               var181 = var6 & ~var7 | ~var6 & var7;
               var7 = -1066766059;
               var6 = -1056419501;
               var189 = (var6 | var7) & ~(var6 & var7);
               var7 = 1449443352;
               var6 = var189;
               var189 = ((var6 | var7) - (var6 & var7)) * ((var6 | var7) - (var6 & var7));
               var7 = 846333795;
               var6 = -317438540;
               var189 = (var6 | var7) & (~var6 | ~var7);
               var7 = -548192562;
               var6 = var189;
               if (var2.equals(c("г·ѓк§Ђг·–к§•г·Ѓк§џ", "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ", var157, var177, var181, var6 + var7 - 2 * (var6 & var7)))) {
                  var7 = 1977499001;
                  var6 = 1203894601;
                  var10000 = (var6 | var7) & ~(var6 & var7);
                  var7 = 840942640;
                  var6 = var10000;
                  var3 = var6 + var7 - 2 * (var6 & var7);
               }
               break;
            case 110549953:
               String var10001 = "dge";
               int var10002 = (int)5391189011053447653L;
               var7 = 144806123;
               var6 = var10002;
               var10002 = (var6 | var7) & ~(var6 & var7);
               var7 = -672481836;
               var6 = var10002;
               var10002 = (var6 | var7) & ~(var6 & var7);
               var7 = 743508756;
               var6 = 1177471325;
               int var10003 = var6 + var7 - 2 * (var6 & var7);
               var7 = -1816000374;
               var6 = var10003;
               var10003 = (var6 + var7 - 2 * (var6 & var7)) * (var6 + var7 - 2 * (var6 & var7));
               var7 = 25975258;
               var6 = 429808537;
               var10003 = var6 & ~var7 | ~var6 & var7;
               var7 = 1901783628;
               var6 = var10003;
               var10003 = (var6 | var7) & (~var6 | ~var7);
               int var10004 = (int)8805782439308498974L;
               var7 = -1285247045;
               var6 = var10004;
               var10004 = (var6 | var7) - (var6 & var7);
               var7 = 900419061;
               var6 = var10004;
               var10004 = (var6 | var7) - (var6 & var7);
               var7 = -359275443;
               var6 = -1740936774;
               int var10005 = var6 & ~var7 | ~var6 & var7;
               var7 = -1479472647;
               var6 = var10005;
               var7 = var6 & ~var7 | ~var6 & var7;
               var6 = var10004;
               var10004 = (var6 ^ var7) + 2 * (var6 & var7);
               var10004 = (int)-1435556624266012514L;
               var7 = -1828380043;
               var6 = var10004;
               var10004 = var6 & ~var7 | ~var6 & var7;
               var7 = 1696353124;
               var6 = var10004;
               var10004 = (var6 | var7) - (var6 & var7);
               var7 = -1932898107;
               var6 = 913017188;
               int var10006 = (var6 | var7) & ~(var6 & var7);
               var7 = -1163798104;
               var6 = var10006;
               var10006 = var6 + var7 - 2 * (var6 & var7);
               var7 = -1635683201;
               var6 = 483305195;
               var10006 = (var6 | var7) & ~(var6 & var7);
               var7 = -2108697968;
               var6 = var10006;
               var10006 = var6 & ~var7 | ~var6 & var7;
               var10005 = (int)-7630398381037857114L;
               var7 = 1161889496;
               var6 = var10005;
               var10005 = (var6 | var7) - (var6 & var7);
               var7 = -658085848;
               var6 = var10005;
               var10005 = (var6 | var7) & ~(var6 & var7);
               String var187 = "dgf";
               var7 = -1649667805;
               var6 = -1275971558;
               var10006 = (var6 | var7) & (~var6 | ~var7);
               var7 = 779836138;
               var6 = var10006;
               if (var2.equals(
                  c("г·–к‘г·–к›г·Џ", "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ", var10003, var10004, var10005, (var6 | var7) & (~var6 | ~var7))
               )) {
                  var10000 = (int)6487638639282463541L;
                  var7 = 352141101;
                  var6 = var10000;
                  var10000 = var6 & ~var7 | ~var6 & var7;
                  var7 = 964336665;
                  var6 = var10000;
                  var3 = (var6 | var7) & (~var6 | ~var7);
               }
         }

         switch (var3) {
            case 0:
               return !this.w.a() ? this.x.a() : ModuleRegistry.CLIENT_COLOR.n();
            case 1:
               Color var148;
               if (!this.F.a()) {
                  String var137 = "dgg";
                  var7 = -869603117;
                  var6 = -1182489358;
                  var10000 = var6 & ~var7 | ~var6 & var7;
                  var7 = 1575879980;
                  var6 = var10000;
                  int var5 = (var6 | var7) - (var6 & var7);
                  a = var5;
                  var10000 = (int)-2833316453161390070L;
                  var7 = 481264729;
                  var6 = var10000;
                  var10000 = (var6 | var7) - (var6 & var7);
                  var7 = -365591604;
                  var6 = var10000;
                  var10000 = var6 + var7 - 2 * (var6 & var7);
                  var7 = 1843863752;
                  var6 = 562474116;
                  var10000 = var6 & ~var7 | ~var6 & var7;
                  var7 = 140138988;
                  var6 = var10000;
                  if ((var6 | var7) - (var6 & var7) < a) {
                     var10000 = (int)-2449718290072819951L;
                     var7 = 1138016675;
                     var6 = var10000;
                     var10000 = var6 & ~var7 | ~var6 & var7;
                     var7 = 1104948154;
                     var6 = var10000;
                     var10000 = (var6 + var7 - 2 * (var6 & var7)) * (var6 + var7 - 2 * (var6 & var7));
                     var10000 = (int)-4404711806336156258L;
                     var7 = 734361965;
                     var6 = var10000;
                     var10000 = (var6 | var7) & (~var6 | ~var7);
                     var7 = -489578703;
                     var6 = var10000;
                     var5 = var6 + var7 - 2 * (var6 & var7);
                     a = var5;
                  }

                  var148 = this.G.a();
               } else {
                  var148 = ModuleRegistry.CLIENT_COLOR.n();
               }

               return var148;
         }
      }

      if (!this.n.a()) {
         return this.o.a();
      }

      ClientColor var8 = ModuleRegistry.CLIENT_COLOR;
      return var8.n();
   }

   private Identifier g(String var1) {
      String var2;
      if (!this.f.a()) {
         var2 = this.h.d();
      } else {
         String var3 = var1;
         int var8 = -1772360512;
         int var7 = 315444949;
         int var10000 = var7 & ~var8 | ~var7 & var8;
         var8 = 2070502890;
         var7 = var10000;
         int var4 = (var7 | var8) - (var7 & var8);
         switch (var3.hashCode()) {
            case -1407259064:
               var8 = 1589526370;
               var7 = -1558689578;
               int var1234 = (var7 | var8) - (var7 & var8);
               var8 = -39422044;
               var7 = var1234;
               var1234 = var7 & ~var8 | ~var7 & var8;
               var1234 = (int)6028832724634991792L;
               var8 = 664749199;
               var7 = var1234;
               var1234 = var7 + var8 - 2 * (var7 & var8);
               var8 = -444516289;
               var7 = var1234;
               var1234 = var7 & ~var8 | ~var7 & var8;
               var1234 = (int)5455434919408583272L;
               var8 = 1679214012;
               var7 = var1234;
               var1234 = var7 + var8 - 2 * (var7 & var8);
               var8 = -695564345;
               var7 = var1234;
               var1234 = (var7 | var8) & ~(var7 & var8);
               String var1242 = "dgh";
               int var1451 = (int)-8729500623925835900L;
               var8 = -1865096147;
               var7 = var1451;
               var1451 = (var7 | var8) & (~var7 | ~var8);
               var8 = 1686987688;
               var7 = var1451;
               var1451 = (var7 | var8) - (var7 & var8);
               var1451 = (int)-2185246278575748215L;
               var8 = -1875943439;
               var7 = var1451;
               var1451 = var7 + var8 - 2 * (var7 & var8);
               var8 = -91171720;
               var7 = var1451;
               var1451 = (var7 | var8) & ~(var7 & var8);
               var8 = -140878475;
               var7 = 659215230;
               int var1324 = (var7 | var8) & (~var7 | ~var8);
               var8 = -1181194748;
               var7 = var1324;
               var1324 = (var7 | var8) & ~(var7 & var8);
               String var1457 = "dgi";
               var1451 = (int)8958011267102508057L;
               var8 = 1274970264;
               var7 = var1451;
               var1451 = (var7 | var8) & ~(var7 & var8);
               var8 = 1627457953;
               var7 = var1451;
               var1451 = (var7 | var8) - (var7 & var8);
               String var1569 = "dgj";
               int var1570 = (int)-7163821026971303549L;
               var8 = -430139642;
               var7 = var1570;
               int var1571 = (var7 | var8) & ~(var7 & var8);
               var8 = -1254698607;
               var7 = var1571;
               int var1572 = var7 & ~var8 | ~var7 & var8;
               String var1679 = "dgk";
               var8 = -207262380;
               var7 = 282038267;
               int var1680 = var7 & ~var8 | ~var7 & var8;
               var8 = -480807619;
               var7 = var1680;
               if (var3.equals(
                  c("ж”‘бЄ™ж”„\u1a8cж”“бЄ†", "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ", var1324, var1451, var1572, (var7 | var8) & ~(var7 & var8))
               )) {
                  var10000 = (int)-2748792965665051175L;
                  var8 = 1057306932;
                  var7 = var10000;
                  var10000 = var7 & ~var8 | ~var7 & var8;
                  var8 = -1217129235;
                  var7 = var10000;
                  var4 = var7 & ~var8 | ~var7 & var8;
               }
               break;
            case 110549953:
               int var10001 = (int)4191624697959593315L;
               var8 = -811015578;
               var7 = var10001;
               var10001 = (var7 | var8) - (var7 & var8);
               var8 = 962063991;
               var7 = var10001;
               var10001 = (var7 + var8 - 2 * (var7 & var8)) * (var7 + var8 - 2 * (var7 & var8));
               int var10002 = (int)-2291735970114972649L;
               var8 = 1314492090;
               var7 = var10002;
               var10002 = (var7 | var8) - (var7 & var8);
               var8 = 230202579;
               var7 = var10002;
               var10002 = (var7 | var8) - (var7 & var8);
               int var10003 = (int)-4506071897375032048L;
               var8 = -1397961656;
               var7 = var10003;
               var10003 = (var7 | var8) - (var7 & var8);
               var8 = 556135727;
               var7 = var10003;
               var10003 = var7 & ~var8 | ~var7 & var8;
               var8 = 325091201;
               var7 = -1859048435;
               var10003 = (var7 | var8) - (var7 & var8);
               var8 = -350635133;
               var7 = var10003;
               var10003 = (var7 | var8) & ~(var7 & var8);
               var8 = -2093273918;
               var7 = -2010962531;
               int var10005 = var7 & ~var8 | ~var7 & var8;
               var8 = 186124623;
               var7 = var10005;
               var10005 = (var7 | var8) & ~(var7 & var8);
               var8 = 1519606995;
               var7 = -658837524;
               var10005 = (var7 | var8) & ~(var7 & var8);
               var8 = -2111196356;
               var7 = var10005;
               var10005 = (var7 | var8) & (~var7 | ~var8);
               var10005 = (int)-1257959173827560812L;
               var8 = -98917185;
               var7 = var10005;
               var10005 = (var7 | var8) - (var7 & var8);
               var8 = 604692010;
               var7 = var10005;
               var10005 = (var7 | var8) & (~var7 | ~var8);
               int var10004 = (int)-2542320782378043994L;
               var8 = -688258485;
               var7 = var10004;
               var10004 = var7 & ~var8 | ~var7 & var8;
               var8 = 216998776;
               var7 = var10004;
               var10004 = var7 + var8 - 2 * (var7 & var8);
               var10005 = (int)6425637349914141054L;
               var8 = 737296150;
               var7 = var10005;
               var10005 = (var7 | var8) - (var7 & var8);
               var8 = 785667869;
               var7 = var10005;
               var10005 = var7 & ~var8 | ~var7 & var8;
               int var10006 = (int)-9111978581545953952L;
               var8 = -2047993347;
               var7 = var10006;
               var10006 = (var7 | var8) - (var7 & var8);
               var8 = 181819290;
               var7 = var10006;
               var8 = (var7 | var8) - (var7 & var8);
               var7 = var10005;
               var10005 = 2 * (var7 | var8) - (var7 ^ var8);
               var10005 = (int)5096725585837304641L;
               var8 = -903626723;
               var7 = var10005;
               var10005 = (var7 | var8) & (~var7 | ~var8);
               var8 = 2076895048;
               var7 = var10005;
               var10005 = (var7 | var8) - (var7 & var8);
               int var10007 = (int)-1507250151643967329L;
               var8 = -2016949216;
               var7 = var10007;
               var10007 = var7 + var8 - 2 * (var7 & var8);
               var8 = -1940104019;
               var7 = var10007;
               var10007 = (var7 | var8) & ~(var7 & var8);
               var10006 = (int)6611533360624898944L;
               var8 = -512979199;
               var7 = var10006;
               var10006 = (var7 | var8) & (~var7 | ~var8);
               var8 = 100025222;
               var7 = var10006;
               if (var3.equals(
                  c("ж”„е€—ж”„е€ќж”ќ", "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ", var10003, var10004, var10005, (var7 | var8) & ~(var7 & var8))
               )) {
                  var10000 = (int)5829536986299260958L;
                  var8 = -1124822280;
                  var7 = var10000;
                  var10000 = var7 & ~var8 | ~var7 & var8;
                  var8 = 95089383;
                  var7 = var10000;
                  var4 = (var7 | var8) - (var7 & var8);
               }
         }

         switch (var4) {
            case 0:
               var2 = this.q.d();
               break;
            case 1:
               var2 = this.z.d();
               break;
            default:
               var2 = this.h.d();
         }
      }

      String var9 = var2;
      int var613 = -188107095;
      int var61 = -120991452;
      int var1119 = var61 & ~var613 | ~var61 & var613;
      var613 = -201353102;
      var61 = var1119;
      int var10 = (var61 | var613) - (var61 & var613);
      switch (var9.hashCode()) {
         case -2018961832:
            int var1176 = (int)-4436462508909926913L;
            var613 = 532914403;
            var61 = var1176;
            var1176 = var61 & ~var613 | ~var61 & var613;
            var613 = 1073913856;
            var61 = var1176;
            var1176 = var61 + var613 - 2 * (var61 & var613);
            int var1248 = (int)-9199074840140497298L;
            var613 = 1371183297;
            var61 = var1248;
            var1248 = (var61 | var613) & ~(var61 & var613);
            var613 = 1009700997;
            var61 = var1248;
            var1248 = var61 + var613 - 2 * (var61 & var613);
            var613 = 1628935044;
            var61 = 1636396830;
            int var1362 = var61 + var613 - 2 * (var61 & var613);
            var613 = 260247494;
            var61 = var1362;
            var613 = (var61 | var613) & ~(var61 & var613);
            var61 = var1248;
            var1248 = (var61 & ~var613) + (var613 & ~var61) + 2 * (var61 & var613);
            int var1484 = (int)4975678471878725227L;
            var613 = 673949067;
            var61 = var1484;
            var1484 = var61 + var613 - 2 * (var61 & var613);
            var613 = 281570287;
            var61 = var1484;
            var1484 = var61 + var613 - 2 * (var61 & var613);
            var613 = 699371863;
            var61 = -1555045869;
            var1484 = (var61 | var613) & (~var61 | ~var613);
            var613 = -1965001899;
            var61 = var1484;
            var1484 = var61 & ~var613 | ~var61 & var613;
            var613 = -1930318195;
            var61 = 574025003;
            var1484 = (var61 | var613) & ~(var61 & var613);
            var613 = -1362672714;
            var61 = var1484;
            var1484 = (var61 | var613) & ~(var61 & var613);
            var1362 = (int)-2891595407957462357L;
            var613 = 2135969905;
            var61 = var1362;
            var1362 = (var61 | var613) - (var61 & var613);
            var613 = -325858603;
            var61 = var1362;
            var1362 = var61 + var613 - 2 * (var61 & var613);
            String var1491 = "dgq";
            var613 = 470433309;
            var61 = -1029539672;
            var1484 = var61 + var613 - 2 * (var61 & var613);
            var613 = -644772914;
            var61 = var1484;
            var1484 = (var61 | var613) - (var61 & var613);
            int var1597 = (int)-8150101557617214782L;
            var613 = 1824554591;
            var61 = var1597;
            var1597 = var61 + var613 - 2 * (var61 & var613);
            var613 = -707507271;
            var61 = var1597;
            var1597 = ((var61 | var613) & ~(var61 & var613)) * ((var61 | var613) & ~(var61 & var613));
            var1597 = (int)-6792073532841089639L;
            var613 = 606116705;
            var61 = var1597;
            var1597 = var61 + var613 - 2 * (var61 & var613);
            var613 = -1498917427;
            var61 = var1597;
            var1597 = var61 + var613 - 2 * (var61 & var613);
            String var1713 = "dgr";
            var613 = 604733642;
            var61 = 2133718429;
            int var1714 = (var61 | var613) - (var61 & var613);
            var613 = 1529422522;
            var61 = var1714;
            if (var9.equals(
               c(
                  "ж…‘\udeafж……\udea4ж…€\udeafж…Љ\udea2",
                  "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ",
                  var1362,
                  var1484,
                  var1597,
                  (var61 | var613) & ~(var61 & var613)
               )
            )) {
               var1119 = (int)-5415512407354572485L;
               var613 = 170970419;
               var61 = var1119;
               var1119 = (var61 | var613) - (var61 & var613);
               var613 = 1893321738;
               var61 = var1119;
               var10 = (var61 | var613) & (~var61 | ~var613);
            }
            break;
         case 860345114:
            int var1173 = (int)-339168481362105369L;
            var613 = -465787327;
            var61 = var1173;
            var1173 = (var61 | var613) - (var61 & var613);
            var613 = -541838784;
            var61 = var1173;
            var1173 = ((var61 | var613) & (~var61 | ~var613)) * ((var61 | var613) & (~var61 | ~var613));
            var613 = -106928261;
            var61 = -1805002727;
            int var1245 = (var61 | var613) & (~var61 | ~var613);
            var613 = -292371066;
            var61 = var1245;
            var1245 = var61 + var613 - 2 * (var61 & var613);
            var613 = -1987871874;
            var61 = 198389525;
            int var1356 = (var61 | var613) & ~(var61 & var613);
            var613 = -116107313;
            var61 = var1356;
            var613 = var61 + var613 - 2 * (var61 & var613);
            var61 = var1245;
            var1245 = (var61 & ~var613) + (var613 & ~var61) + 2 * (var61 & var613);
            var1356 = (int)-8346897777770458707L;
            var613 = 2075063065;
            var61 = var1356;
            var1356 = var61 + var613 - 2 * (var61 & var613);
            var613 = 2034224430;
            var61 = var1356;
            var1356 = var61 & ~var613 | ~var61 & var613;
            var613 = 66223442;
            var61 = -994387733;
            var1356 = (var61 | var613) - (var61 & var613);
            var613 = -1375711818;
            var61 = var1356;
            var1356 = (var61 | var613) - (var61 & var613);
            String var1481 = "dgu";
            var613 = 439954281;
            var61 = -1634356694;
            int var1482 = var61 & ~var613 | ~var61 & var613;
            var613 = -2082011295;
            var61 = var1482;
            int var1483 = (var61 | var613) - (var61 & var613);
            int var1591 = (int)-4729296937063643924L;
            var613 = 318529792;
            var61 = var1591;
            var1591 = var61 + var613 - 2 * (var61 & var613);
            var613 = -1450277618;
            var61 = var1591;
            var1591 = (var61 | var613) - (var61 & var613);
            var1591 = (int)3628105823542606010L;
            var613 = 1550294662;
            var61 = var1591;
            var1591 = var61 & ~var613 | ~var61 & var613;
            var613 = 2003262610;
            var61 = var1591;
            var1591 = (var61 | var613) - (var61 & var613);
            int var1771 = (int)-459513007459191348L;
            var613 = 1231235280;
            var61 = var1771;
            var1771 = (var61 | var613) & ~(var61 & var613);
            var613 = -36037359;
            var61 = var1771;
            var1771 = (var61 | var613) & (~var61 | ~var613);
            var613 = 1399368178;
            var61 = 1878661082;
            var1771 = var61 + var613 - 2 * (var61 & var613);
            var613 = 1016249896;
            var61 = var1771;
            var1771 = (var61 | var613) & (~var61 | ~var613);
            var613 = -1825472063;
            var61 = 912097446;
            int var1712 = (var61 | var613) - (var61 & var613);
            var613 = -1521669645;
            var61 = var1712;
            if (var9.equals(
               c("ж…¤к‡•ж…‹к‡ђж…Ђк†«", "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ", var1356, var1483, var1591, (var61 | var613) & (~var61 | ~var613))
            )) {
               var613 = 1164061034;
               var61 = -2123097610;
               var1119 = var61 + var613 - 2 * (var61 & var613);
               var613 = -1005178727;
               var61 = var1119;
               var10 = (var61 | var613) - (var61 & var613);
            }
            break;
         case 934967833:
            int var1170 = (int)-8156523901673831120L;
            var613 = -2080169722;
            var61 = var1170;
            var1170 = var61 + var613 - 2 * (var61 & var613);
            var613 = -2087652253;
            var61 = var1170;
            var1170 = (var61 & ~var613 | ~var61 & var613) * (var61 & ~var613 | ~var61 & var613);
            var613 = -1223828953;
            var61 = -1837107972;
            int var1346 = (var61 | var613) - (var61 & var613);
            var613 = 628240087;
            var61 = var1346;
            var1346 = (var61 | var613) - (var61 & var613);
            var1346 = (int)5710936497437870152L;
            var613 = 1658236550;
            var61 = var1346;
            var1346 = (var61 | var613) - (var61 & var613);
            var613 = -229660961;
            var61 = var1346;
            var1346 = var61 + var613 - 2 * (var61 & var613);
            var613 = -463617729;
            var61 = 1335531806;
            var1346 = (var61 | var613) - (var61 & var613);
            var613 = 2085903444;
            var61 = var1346;
            var1346 = (var61 | var613) & (~var61 | ~var613);
            var1346 = (int)8241788897295369694L;
            var613 = -1927099622;
            var61 = var1346;
            var1346 = (var61 | var613) & ~(var61 & var613);
            var613 = 895919819;
            var61 = var1346;
            var1346 = (var61 | var613) - (var61 & var613);
            String var1478 = "dgt";
            var613 = -882872223;
            var61 = 1668278582;
            int var1479 = (var61 | var613) & ~(var61 & var613);
            var613 = -1355142823;
            var61 = var1479;
            int var1480 = (var61 | var613) - (var61 & var613);
            int var1700 = (int)-62241900600729451L;
            var613 = -1375080159;
            var61 = var1700;
            var1700 = (var61 | var613) & ~(var61 & var613);
            var613 = -1769631303;
            var61 = var1700;
            var1700 = var61 + var613 - 2 * (var61 & var613);
            var1700 = (int)-2381169172704077606L;
            var613 = 77101747;
            var61 = var1700;
            var1700 = (var61 | var613) - (var61 & var613);
            var613 = -633036177;
            var61 = var1700;
            var1700 = (var61 | var613) - (var61 & var613);
            var613 = -827505190;
            var61 = 1244573597;
            var1700 = var61 + var613 - 2 * (var61 & var613);
            var613 = -2071729587;
            var61 = var1700;
            var1700 = (var61 | var613) & (~var61 | ~var613);
            var613 = -22911622;
            var61 = 2061815779;
            var1700 = var61 + var613 - 2 * (var61 & var613);
            var613 = -2075743590;
            var61 = var1700;
            var1700 = (var61 | var613) & (~var61 | ~var613);
            int var1588 = (int)-3317481642747665261L;
            var613 = 736814251;
            var61 = var1588;
            var1588 = var61 + var613 - 2 * (var61 & var613);
            var613 = -478691237;
            var61 = var1588;
            var1588 = (var61 | var613) - (var61 & var613);
            int var1765 = (int)5630376073720855744L;
            var613 = -1769995313;
            var61 = var1765;
            var1765 = (var61 | var613) & ~(var61 & var613);
            var613 = -679641333;
            var61 = var1765;
            var1765 = (var61 | var613) & ~(var61 & var613);
            var1765 = (int)-4701691135964267150L;
            var613 = 1007092155;
            var61 = var1765;
            var1765 = (var61 | var613) & (~var61 | ~var613);
            var613 = -1321714493;
            var61 = var1765;
            var1765 = (var61 | var613) & (~var61 | ~var613);
            var1700 = (int)8572475652611826104L;
            var613 = 1381113535;
            var61 = var1700;
            var1700 = var61 & ~var613 | ~var61 & var613;
            var613 = -1245330041;
            var61 = var1700;
            if (var9.equals(
               c("ж…§лЏЌж……лЏ€ж…„лЏЏ", "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ", var1346, var1480, var1588, (var61 | var613) - (var61 & var613))
            )) {
               var613 = -918389257;
               var61 = 121673188;
               var1119 = (var61 | var613) & ~(var61 & var613);
               var613 = -838670313;
               var61 = var1119;
               var10 = (var61 | var613) & ~(var61 & var613);
            }
            break;
         case 1001367009:
            int var1165 = (int)8357449025641562204L;
            var613 = -1439158232;
            var61 = var1165;
            var1165 = (var61 | var613) & (~var61 | ~var613);
            var613 = 328610721;
            var61 = var1165;
            var1165 = (var61 & ~var613 | ~var61 & var613) * (var61 & ~var613 | ~var61 & var613);
            var613 = -302309661;
            var61 = 2113473522;
            int var1334 = var61 + var613 - 2 * (var61 & var613);
            var613 = -1878911722;
            var61 = var1334;
            var1334 = (var61 | var613) & (~var61 | ~var613);
            var613 = 86403634;
            var61 = 1997443746;
            var1334 = (var61 | var613) & (~var61 | ~var613);
            var613 = 1915287711;
            var61 = var1334;
            var1334 = (var61 | var613) & (~var61 | ~var613);
            var613 = -857725810;
            var61 = -760657146;
            var1334 = var61 + var613 - 2 * (var61 & var613);
            var613 = 508129152;
            var61 = var1334;
            var1334 = var61 + var613 - 2 * (var61 & var613);
            var1334 = (int)-3082282951198418448L;
            var613 = -384140779;
            var61 = var1334;
            var1334 = var61 & ~var613 | ~var61 & var613;
            var613 = 1703486438;
            var61 = var1334;
            var1334 = (var61 | var613) - (var61 & var613);
            var613 = 1333753227;
            var61 = 462150944;
            int var1468 = var61 & ~var613 | ~var61 & var613;
            var613 = 1425320097;
            var61 = var1468;
            var1468 = (var61 | var613) - (var61 & var613);
            var613 = 61526018;
            var61 = -386573607;
            var1468 = var61 + var613 - 2 * (var61 & var613);
            var613 = -346060066;
            var61 = var1468;
            var1468 = (var61 | var613) - (var61 & var613);
            var613 = 1988801728;
            var61 = 1527148600;
            var1468 = var61 + var613 - 2 * (var61 & var613);
            var613 = 764200171;
            var61 = var1468;
            var1468 = var61 + var613 - 2 * (var61 & var613);
            var1334 = (int)6279569500937849108L;
            var613 = 1338462760;
            var61 = var1334;
            var1334 = (var61 | var613) - (var61 & var613);
            var613 = -481774797;
            var61 = var1334;
            var1334 = (var61 | var613) & (~var61 | ~var613);
            String var1474 = "dgp";
            var1468 = (int)-7335550195218649214L;
            var613 = 655778596;
            var61 = var1468;
            var1468 = (var61 | var613) & (~var61 | ~var613);
            var613 = 1570167038;
            var61 = var1468;
            var1468 = (var61 | var613) - (var61 & var613);
            var613 = -950939651;
            var61 = 266775972;
            int var1691 = (var61 | var613) & (~var61 | ~var613);
            var613 = -927505832;
            var61 = var1691;
            var1691 = var61 & ~var613 | ~var61 & var613;
            var1691 = (int)5017175343233389223L;
            var613 = 1736200673;
            var61 = var1691;
            var1691 = (var61 | var613) - (var61 & var613);
            var613 = 440009546;
            var61 = var1691;
            var1691 = var61 & ~var613 | ~var61 & var613;
            var613 = 1534539247;
            var61 = 628592201;
            int var1586 = (var61 | var613) - (var61 & var613);
            var613 = 2027621018;
            var61 = var1586;
            var1586 = var61 & ~var613 | ~var61 & var613;
            var613 = -1635210539;
            var61 = 1654724491;
            var1691 = var61 + var613 - 2 * (var61 & var613);
            var613 = -783033694;
            var61 = var1691;
            var1691 = (var61 | var613) - (var61 & var613);
            var613 = -1644492260;
            var61 = -1690277443;
            int var1764 = (var61 | var613) & ~(var61 & var613);
            var613 = -1418827561;
            var61 = var1764;
            var613 = (var61 | var613) - (var61 & var613);
            var61 = var1691;
            var1691 = (var61 | var613) + (var61 & var613);
            var613 = -4163487;
            var61 = -1274918521;
            var1691 = (var61 | var613) - (var61 & var613);
            var613 = 1267003180;
            var61 = var1691;
            if (!var9.equals(
               c("ж…Ёеџґж…Љеџµж…Ђ", "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ", var1334, var1468, var1586, var61 + var613 - 2 * (var61 & var613))
            )) {
               var1119 = (int)-5152623177385104407L;
               var613 = 609354902;
               var61 = var1119;
               var1119 = (var61 | var613) & ~(var61 & var613);
               var613 = 1599705578;
               var61 = var1119;
               var1119 = (var61 | var613) & (~var61 | ~var613);
               var1119 = (int)-3060550715810801260L;
               var613 = -1978727585;
               var61 = var1119;
               var1119 = (var61 | var613) & (~var61 | ~var613);
               var613 = 600652065;
               var61 = var1119;
               int var6 = var61 & ~var613 | ~var61 & var613;
               var1119 = (int)1858193670972193741L;
               var613 = 1210509304;
               var61 = var1119;
               var1119 = (var61 | var613) - (var61 & var613);
               var613 = 2110846316;
               var61 = var1119;
               var1119 = var61 + var613 - 2 * (var61 & var613);
               var613 = -1936446639;
               var61 = 1403977092;
               var1165 = (var61 | var613) & (~var61 | ~var613);
               var613 = -419881669;
               var61 = var1165;
               var613 = (var61 | var613) & ~(var61 & var613);
               var61 = var1119;
               var1119 = (var61 ^ var613) + 2 * (var61 & var613);
               var1119 = (int)-8741346342247153571L;
               var613 = -1518285925;
               var61 = var1119;
               var1119 = (var61 | var613) - (var61 & var613);
               var613 = 823247083;
               var61 = var1119;
               if ((var61 & ~var613 | ~var61 & var613) >= var6) {
                  var613 = -262219586;
                  var61 = -686499938;
                  var1119 = (var61 | var613) & (~var61 | ~var613);
                  var613 = 659164960;
                  var61 = var1119;
                  var1119 = var61 + var613 - 2 * (var61 & var613);
                  var613 = 1165735410;
                  var61 = -431908670;
                  var1165 = (var61 | var613) & (~var61 | ~var613);
                  var613 = -1556468432;
                  var61 = var1165;
                  var1119 /= var61 & ~var613 | ~var61 & var613;
               }
            } else {
               var613 = 919347228;
               var61 = 2049382764;
               var1119 = var61 + var613 - 2 * (var61 & var613);
               var613 = 1290484081;
               var61 = var1119;
               var10 = var61 & ~var613 | ~var61 & var613;
            }
            break;
         case 1224355287:
            String var1164 = "dgl";
            String var1244 = "dgm";
            String var1330 = "dgn";
            int var1331 = (int)-5635977644288221165L;
            var613 = 1599110078;
            var61 = var1331;
            int var1332 = var61 & ~var613 | ~var61 & var613;
            var613 = 1076949922;
            var61 = var1332;
            int var1333 = (var61 | var613) & ~(var61 & var613);
            int var1575 = (int)4775651906913965451L;
            var613 = -231095804;
            var61 = var1575;
            var1575 = (var61 | var613) & (~var61 | ~var613);
            var613 = -1463822436;
            var61 = var1575;
            var1575 = (var61 | var613) & ~(var61 & var613);
            var613 = -1410892189;
            var61 = -1167764866;
            var1575 = (var61 | var613) & (~var61 | ~var613);
            var613 = 293743641;
            var61 = var1575;
            var1575 = var61 + var613 - 2 * (var61 & var613);
            var613 = -2007144338;
            var61 = 617704453;
            int var1466 = (var61 | var613) - (var61 & var613);
            var613 = -1410359563;
            var61 = var1466;
            var1466 = var61 + var613 - 2 * (var61 & var613);
            var613 = -1832079008;
            var61 = -1993274565;
            var1575 = (var61 | var613) & (~var61 | ~var613);
            var613 = 651882877;
            var61 = var1575;
            var1575 = var61 & ~var613 | ~var61 & var613;
            var613 = -1755977781;
            var61 = -781101716;
            int var1688 = var61 & ~var613 | ~var61 & var613;
            var613 = 1403833850;
            var61 = var1688;
            var613 = (var61 | var613) - (var61 & var613);
            var61 = var1575;
            var1575 = (var61 | var613) + (var61 & var613);
            var1575 = (int)1440535955436860294L;
            var613 = -1268769519;
            var61 = var1575;
            var1575 = (var61 | var613) & ~(var61 & var613);
            var613 = 61421645;
            var61 = var1575;
            var1575 = var61 + var613 - 2 * (var61 & var613);
            String var1689 = "dgo";
            var613 = 1670105591;
            var61 = 2140903922;
            var1688 = (var61 | var613) & ~(var61 & var613);
            var613 = 472478997;
            var61 = var1688;
            if (var9.equals(
               c("ж…‘к±љж„°к±›ж„¶к±љ", "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ", var1333, var1466, var1575, (var61 | var613) & ~(var61 & var613))
            )) {
               var1119 = (int)-1606128234834446534L;
               var613 = -291058104;
               var61 = var1119;
               var1119 = (var61 | var613) & (~var61 | ~var613);
               var613 = -1538164366;
               var61 = var1119;
               var10 = (var61 | var613) & ~(var61 & var613);
            }
            break;
         case 1227580930:
            int var1161 = (int)6043094606625915325L;
            var613 = 1041233088;
            var61 = var1161;
            var1161 = var61 & ~var613 | ~var61 & var613;
            var613 = 770590518;
            var61 = var1161;
            var1161 = ((var61 | var613) & ~(var61 & var613)) * ((var61 | var613) & ~(var61 & var613));
            String var1243 = "dgs";
            var613 = 944305434;
            var61 = 1806471495;
            int var1326 = (var61 | var613) & (~var61 | ~var613);
            var613 = -1496883809;
            var61 = var1326;
            var1326 = var61 & ~var613 | ~var61 & var613;
            var613 = -1043739748;
            var61 = -598291233;
            var1326 = (var61 | var613) & ~(var61 & var613);
            var613 = 1960308556;
            var61 = var1326;
            var1326 = var61 & ~var613 | ~var61 & var613;
            int var1461 = (int)-665940401832112977L;
            var613 = -408812979;
            var61 = var1461;
            var1461 = (var61 | var613) - (var61 & var613);
            var613 = -1705545998;
            var61 = var1461;
            var1461 = ((var61 | var613) - (var61 & var613)) * ((var61 | var613) - (var61 & var613));
            var613 = 187664330;
            var61 = -1522232064;
            var1461 = (var61 | var613) & (~var61 | ~var613);
            var613 = -1454931079;
            var61 = var1461;
            var1461 = var61 + var613 - 2 * (var61 & var613);
            int var1681 = (int)8840307739927845884L;
            var613 = -1427889402;
            var61 = var1681;
            var1681 = (var61 | var613) - (var61 & var613);
            var613 = -2056439563;
            var61 = var1681;
            var1681 = var61 + var613 - 2 * (var61 & var613);
            var613 = -766011297;
            var61 = -1174515475;
            int var1573 = (var61 | var613) - (var61 & var613);
            var613 = 1689447516;
            var61 = var1573;
            var1573 = (var61 | var613) & ~(var61 & var613);
            var613 = 1985719138;
            var61 = 2011112263;
            var1681 = var61 + var613 - 2 * (var61 & var613);
            var613 = -121585603;
            var61 = var1681;
            var1681 = (var61 | var613) - (var61 & var613);
            var1681 = (int)-360523133815185444L;
            var613 = 1341706941;
            var61 = var1681;
            var1681 = var61 & ~var613 | ~var61 & var613;
            var613 = -61320892;
            var61 = var1681;
            if (var9.equals(
               c("ж…‘й•ўж„їй•§ж…€й•Ї", "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ", var1326, var1461, var1573, var61 + var613 - 2 * (var61 & var613))
            )) {
               var613 = -300431426;
               var61 = -237831533;
               var1119 = var61 & ~var613 | ~var61 & var613;
               var613 = 533019950;
               var61 = var1119;
               var10 = var61 + var613 - 2 * (var61 & var613);
            }
      }

      switch (var10) {
         case 0:
            var613 = 13367302;
            var61 = -560465581;
            var1119 = (var61 | var613) & ~(var61 & var613);
            var613 = -1111707193;
            var61 = var1119;
            var1119 = (var61 | var613) - (var61 & var613);
            var613 = -1474138005;
            var61 = -130888662;
            int var1228 = var61 + var613 - 2 * (var61 & var613);
            var613 = -739178857;
            var61 = var1228;
            var613 = (var61 | var613) & (~var61 | ~var613);
            var61 = var1119;
            var1119 = (var61 ^ var613) + 2 * (var61 & var613);
            var613 = -160317701;
            var61 = -846228319;
            var1228 = (var61 | var613) & ~(var61 & var613);
            var613 = 1031229763;
            var61 = var1228;
            var1228 = (var61 | var613) & ~(var61 & var613);
            var613 = -58151905;
            var61 = 1969447809;
            int var1306 = var61 + var613 - 2 * (var61 & var613);
            var613 = 1411620644;
            var61 = var1306;
            var613 = var61 + var613 - 2 * (var61 & var613);
            var61 = var1228;
            var1228 = (var61 ^ var613) + 2 * (var61 & var613);
            var1306 = (int)-4364383355752153417L;
            var613 = -2047598235;
            var61 = var1306;
            var1306 = var61 + var613 - 2 * (var61 & var613);
            var613 = -113887818;
            var61 = var1306;
            var1306 = (var61 | var613) & ~(var61 & var613);
            var1306 = (int)-2586785355522169655L;
            var613 = -1021095499;
            var61 = var1306;
            var1306 = (var61 | var613) - (var61 & var613);
            var613 = 125869427;
            var61 = var1306;
            var1306 = (var61 | var613) & ~(var61 & var613);
            var613 = -1741594947;
            var61 = -677874232;
            int var1430 = (var61 | var613) & ~(var61 & var613);
            var613 = -92907797;
            var61 = var1430;
            var1430 = (var61 | var613) - (var61 & var613);
            var1430 = (int)223372721308454053L;
            var613 = -1232561128;
            var61 = var1430;
            var1430 = var61 & ~var613 | ~var61 & var613;
            var613 = -875360545;
            var61 = var1430;
            var1430 = (var61 | var613) & (~var61 | ~var613);
            int var1660 = (int)-7685895132211724906L;
            var613 = -1965525462;
            var61 = var1660;
            var1660 = var61 & ~var613 | ~var61 & var613;
            var613 = -985281614;
            var61 = var1660;
            var1660 = (var61 | var613) & (~var61 | ~var613);
            var1660 = (int)-1656569213754149141L;
            var613 = 1860271017;
            var61 = var1660;
            var1660 = var61 & ~var613 | ~var61 & var613;
            var613 = -625701550;
            var61 = var1660;
            var1660 = (var61 | var613) - (var61 & var613);
            var613 = 412686782;
            var61 = -604080661;
            int var1548 = var61 + var613 - 2 * (var61 & var613);
            var613 = -664253909;
            var61 = var1548;
            var1548 = (var61 | var613) - (var61 & var613);
            var1660 = (int)2004788676028689325L;
            var613 = -2016054221;
            var61 = var1660;
            var1660 = (var61 | var613) & ~(var61 & var613);
            var613 = -818536242;
            var61 = var1660;
            var1660 = ((var61 | var613) - (var61 & var613)) * ((var61 | var613) - (var61 & var613));
            var613 = 133870644;
            var61 = -1293845092;
            var1660 = (var61 | var613) & (~var61 | ~var613);
            var613 = -1257463428;
            var61 = var1660;
            String var1158 = c(
               "ж”Ђ\ue5deж”њ\ue5d8ж”•", "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ", var1306, var1430, var1548, var61 + var613 - 2 * (var61 & var613)
            );
            var1306 = (int)6290864052578704195L;
            var613 = 1383301743;
            var61 = var1306;
            var1306 = var61 + var613 - 2 * (var61 & var613);
            var613 = -766912215;
            var61 = var1306;
            var1306 = var61 + var613 - 2 * (var61 & var613);
            var613 = 1869233014;
            var61 = 674553191;
            var1306 = (var61 | var613) & ~(var61 & var613);
            var613 = 1197401631;
            var61 = var1306;
            var1306 = (var61 | var613) & ~(var61 & var613);
            var613 = -718887134;
            var61 = 1132216810;
            var1306 = var61 + var613 - 2 * (var61 & var613);
            var613 = -1772427575;
            var61 = var1306;
            var1306 = (var61 | var613) - (var61 & var613);
            var1430 = (int)8427626404149800789L;
            var613 = 456910774;
            var61 = var1430;
            var1430 = var61 & ~var613 | ~var61 & var613;
            var613 = 1010223338;
            var61 = var1430;
            var1430 = var61 & ~var613 | ~var61 & var613;
            var1430 = (int)7867482638313665413L;
            var613 = -1263331818;
            var61 = var1430;
            var1430 = (var61 | var613) & ~(var61 & var613);
            var613 = 697181568;
            var61 = var1430;
            var1430 = (var61 | var613) & ~(var61 & var613);
            var1430 = (int)-5083154059088101670L;
            var613 = -99684272;
            var61 = var1430;
            var1430 = var61 & ~var613 | ~var61 & var613;
            var613 = 1534660239;
            var61 = var1430;
            var1430 = (var61 | var613) & ~(var61 & var613);
            var613 = -1026708227;
            var61 = 1366057277;
            var1430 = var61 + var613 - 2 * (var61 & var613);
            var613 = -1818112572;
            var61 = var1430;
            var1430 = (var61 | var613) & (~var61 | ~var613);
            String var1446 = "dgv";
            var613 = -569761334;
            var61 = 389766764;
            var1430 = var61 & ~var613 | ~var61 & var613;
            var613 = -1602644055;
            var61 = var1430;
            var1430 = var61 + var613 - 2 * (var61 & var613);
            var1548 = (int)3741561884997318778L;
            var613 = -451158260;
            var61 = var1548;
            var1548 = (var61 | var613) & ~(var61 & var613);
            var613 = -1897097342;
            var61 = var1548;
            var1548 = var61 + var613 - 2 * (var61 & var613);
            var1548 = (int)9105842154024484413L;
            var613 = -38712203;
            var61 = var1548;
            var1548 = (var61 | var613) - (var61 & var613);
            var613 = 1105534607;
            var61 = var1548;
            var1548 = (var61 | var613) - (var61 & var613);
            var1660 = (int)6440797871398197625L;
            var613 = 486952896;
            var61 = var1660;
            var1660 = (var61 | var613) - (var61 & var613);
            var613 = -1985122190;
            var61 = var1660;
            var1660 = var61 & ~var613 | ~var61 & var613;
            var1660 = (int)-2457510349632528872L;
            var613 = 614874738;
            var61 = var1660;
            var1660 = (var61 | var613) & ~(var61 & var613);
            var613 = -1288073105;
            var61 = var1660;
            var1660 = var61 & ~var613 | ~var61 & var613;
            int var1756 = (int)2045028650046123760L;
            var613 = 708895053;
            var61 = var1756;
            var1756 = (var61 | var613) - (var61 & var613);
            var613 = 246202631;
            var61 = var1756;
            var1756 = var61 + var613 - 2 * (var61 & var613);
            int var1784 = (int)-6188246493000523277L;
            var613 = 1360076900;
            var61 = var1784;
            var1784 = var61 & ~var613 | ~var61 & var613;
            var613 = -1164730716;
            var61 = var1784;
            var613 = (var61 | var613) - (var61 & var613);
            var61 = var1756;
            var1756 = var61 - ~var613 - 1;
            var1756 = (int)-8302185713200081238L;
            var613 = 1156667549;
            var61 = var1756;
            var1756 = var61 & ~var613 | ~var61 & var613;
            var613 = -310216434;
            var61 = var1756;
            return Identifier.of(
               var1158,
               c(
                  "ж”„зЁЈж”€зЁІж”…зЁґж”•зЁµж•џзЁ¶ж”‘зЁґж”„зЁЇж”“зЁЄж”•з©©ж”зЁЈж”‘зЁґж”„з©Ёж”ЂзЁЁж”—",
                  "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ",
                  var1430,
                  var1548,
                  var1660,
                  (var61 | var613) & (~var61 | ~var613)
               )
            );
         case 1:
            int var1210 = (int)3169085295137705727L;
            var613 = 1906058928;
            var61 = var1210;
            var1210 = var61 & ~var613 | ~var61 & var613;
            var613 = 2114250829;
            var61 = var1210;
            var1210 = (var61 | var613) & ~(var61 & var613);
            var613 = 1289123752;
            var61 = 1682058271;
            var1210 = var61 & ~var613 | ~var61 & var613;
            var613 = 680811429;
            var61 = var1210;
            var1210 = (var61 | var613) & ~(var61 & var613);
            var1210 = (int)-1777611224407329620L;
            var613 = 399770659;
            var61 = var1210;
            var1210 = (var61 | var613) & ~(var61 & var613);
            var613 = 1671442570;
            var61 = var1210;
            var1210 = (var61 | var613) - (var61 & var613);
            var613 = -1204579610;
            var61 = -187287777;
            var1210 = (var61 | var613) - (var61 & var613);
            var613 = 1290118653;
            var61 = var1210;
            var1210 = var61 & ~var613 | ~var61 & var613;
            var1210 = (int)6010532199412399168L;
            var613 = 1574481932;
            var61 = var1210;
            var1210 = (var61 | var613) - (var61 & var613);
            var613 = -321041333;
            var61 = var1210;
            var1210 = (var61 | var613) - (var61 & var613);
            var613 = 169152645;
            var61 = 1929767162;
            var1210 = var61 + var613 - 2 * (var61 & var613);
            var613 = -218587177;
            var61 = var1210;
            var1210 = var61 + var613 - 2 * (var61 & var613);
            int var1299 = (int)-8451106012496511747L;
            var613 = -1855032194;
            var61 = var1299;
            var1299 = (var61 | var613) & ~(var61 & var613);
            var613 = 137716640;
            var61 = var1299;
            var1299 = ((var61 | var613) & (~var61 | ~var613)) * ((var61 | var613) & (~var61 | ~var613));
            var1299 = (int)-5635866179391452295L;
            var613 = -916051558;
            var61 = var1299;
            var1299 = (var61 | var613) - (var61 & var613);
            var613 = 1200802540;
            var61 = var1299;
            var1299 = var61 + var613 - 2 * (var61 & var613);
            var613 = -2087852329;
            var61 = 1730147463;
            int var1420 = var61 + var613 - 2 * (var61 & var613);
            var613 = -1721458937;
            var61 = var1420;
            var1420 = (var61 | var613) - (var61 & var613);
            var613 = -641965586;
            var61 = -1788100161;
            var1420 = var61 + var613 - 2 * (var61 & var613);
            var613 = 1268810523;
            var61 = var1420;
            var1420 = (var61 | var613) - (var61 & var613);
            String var1542 = "dgw";
            var613 = -141868311;
            var61 = 545371580;
            int var1543 = var61 & ~var613 | ~var61 & var613;
            var613 = -879885808;
            var61 = var1543;
            int var1544 = (var61 | var613) & (~var61 | ~var613);
            String var1654 = "dgx";
            int var1655 = (int)3126955167110960826L;
            var613 = 1653206704;
            var61 = var1655;
            int var1656 = var61 & ~var613 | ~var61 & var613;
            var613 = 1593693622;
            var61 = var1656;
            String var1154 = c(
               "ж”Ђв‚¶ж”њв‚°ж”•", "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ", var1299, var1420, var1544, var61 + var613 - 2 * (var61 & var613)
            );
            var1210 = (int)5444243276075579604L;
            var613 = -566423826;
            var61 = var1210;
            var1210 = (var61 | var613) & ~(var61 & var613);
            var613 = 1665541513;
            var61 = var1210;
            var1210 = ((var61 | var613) & (~var61 | ~var613)) * ((var61 | var613) & (~var61 | ~var613));
            String var1305 = "dgy";
            var1420 = (int)5587466134864696624L;
            var613 = 1436017587;
            var61 = var1420;
            var1420 = (var61 | var613) & ~(var61 & var613);
            var613 = 1950924207;
            var61 = var1420;
            var1420 = (var61 & ~var613 | ~var61 & var613) * (var61 & ~var613 | ~var61 & var613);
            var1420 = (int)4693052311488095186L;
            var613 = -1442942686;
            var61 = var1420;
            var1420 = var61 + var613 - 2 * (var61 & var613);
            var613 = -1574667521;
            var61 = var1420;
            var1420 = (var61 | var613) & ~(var61 & var613);
            var1542 = "dgz";
            var613 = -1727896645;
            var61 = -1129183111;
            int var1546 = (var61 | var613) - (var61 & var613);
            var613 = 580654139;
            var61 = var1546;
            int var1547 = (var61 | var613) - (var61 & var613);
            int var1745 = (int)-3262260384296281960L;
            var613 = -76051446;
            var61 = var1745;
            var1745 = (var61 | var613) & ~(var61 & var613);
            var613 = 239555735;
            var61 = var1745;
            var1745 = (var61 | var613) & (~var61 | ~var613);
            var613 = -1408782244;
            var61 = -1208743008;
            var1745 = (var61 | var613) & (~var61 | ~var613);
            var613 = 468958196;
            var61 = var1745;
            var1745 = (var61 | var613) - (var61 & var613);
            var1745 = (int)8401076665846575188L;
            var613 = -1944498898;
            var61 = var1745;
            var1745 = var61 + var613 - 2 * (var61 & var613);
            var613 = -226296456;
            var61 = var1745;
            var1745 = var61 & ~var613 | ~var61 & var613;
            int var1657 = (int)6069982425627409726L;
            var613 = -8356982;
            var61 = var1657;
            int var1658 = var61 + var613 - 2 * (var61 & var613);
            var613 = -779574796;
            var61 = var1658;
            int var1659 = (var61 | var613) & (~var61 | ~var613);
            String var1753 = "dha";
            var1745 = (int)9100568029681817666L;
            var613 = 1549182040;
            var61 = var1745;
            var1745 = var61 + var613 - 2 * (var61 & var613);
            var613 = -1423788431;
            var61 = var1745;
            return Identifier.of(
               var1154,
               c(
                  "ж”„иќ±ж”€иќ ж”…иќ¦ж”•иќ§ж•џиќ¤ж”‘иќ¦ж”„иќЅж”“иќёж”•ињ»ж”ѓиќ¤ж”‘иќ¦ж”›иќёж”•ињєж”Ђиќєж”—",
                  "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ",
                  var1420,
                  var1547,
                  var1659,
                  var61 & ~var613 | ~var61 & var613
               )
            );
         case 2:
            int var1198 = (int)1625708887576480747L;
            var613 = 696051923;
            var61 = var1198;
            var1198 = var61 + var613 - 2 * (var61 & var613);
            var613 = -1722948824;
            var61 = var1198;
            var1198 = (var61 | var613) & ~(var61 & var613);
            var1198 = (int)1626721732347144758L;
            var613 = 1214072835;
            var61 = var1198;
            var1198 = var61 & ~var613 | ~var61 & var613;
            var613 = -1264000455;
            var61 = var1198;
            var1198 = (var61 | var613) & (~var61 | ~var613);
            var1198 = (int)4116233919506376164L;
            var613 = 1105729102;
            var61 = var1198;
            var1198 = var61 + var613 - 2 * (var61 & var613);
            var613 = -1451265109;
            var61 = var1198;
            var1198 = (var61 | var613) - (var61 & var613);
            var613 = -1389308794;
            var61 = 1292729540;
            var1198 = var61 + var613 - 2 * (var61 & var613);
            var613 = 1560402607;
            var61 = var1198;
            var1198 = (var61 | var613) - (var61 & var613);
            var613 = 1007413586;
            var61 = 751941031;
            int var1287 = var61 + var613 - 2 * (var61 & var613);
            var613 = 305584548;
            var61 = var1287;
            var613 = var61 & ~var613 | ~var61 & var613;
            var61 = var1198;
            var1198 = (var61 ^ var613) + 2 * (var61 & var613);
            var613 = -1257295728;
            var61 = -754441606;
            var1287 = (var61 | var613) & (~var61 | ~var613);
            var613 = -1444476857;
            var61 = var1287;
            var1287 = ((var61 | var613) & (~var61 | ~var613)) * ((var61 | var613) & (~var61 | ~var613));
            var613 = -1062550494;
            var61 = -1505138356;
            var1287 = (var61 | var613) - (var61 & var613);
            var613 = 262882657;
            var61 = var1287;
            var1287 = (var61 | var613) - (var61 & var613);
            int var1409 = (int)9147104594157192808L;
            var613 = 2071209249;
            var61 = var1409;
            var1409 = (var61 | var613) & (~var61 | ~var613);
            var613 = 1100132312;
            var61 = var1409;
            var1409 = var61 & ~var613 | ~var61 & var613;
            var613 = -1109723262;
            var61 = 984985358;
            var1409 = (var61 | var613) & (~var61 | ~var613);
            var613 = -2145115538;
            var61 = var1409;
            var1409 = (var61 | var613) & (~var61 | ~var613);
            int var1532 = (int)5183598224139624991L;
            var613 = 1876898530;
            var61 = var1532;
            var1532 = (var61 | var613) & ~(var61 & var613);
            var613 = 834412426;
            var61 = var1532;
            var1532 = (var61 | var613) & (~var61 | ~var613);
            var613 = -2049191701;
            var61 = 822736970;
            var1532 = (var61 | var613) - (var61 & var613);
            var613 = -1115413372;
            var61 = var1532;
            var1532 = (var61 | var613) & (~var61 | ~var613);
            int var1644 = (int)-6540639741842243222L;
            var613 = -1758080068;
            var61 = var1644;
            var1644 = var61 & ~var613 | ~var61 & var613;
            var613 = 1863906979;
            var61 = var1644;
            var1644 = (var61 | var613) - (var61 & var613);
            var1644 = (int)63122733712784146L;
            var613 = 19081009;
            var61 = var1644;
            var1644 = (var61 | var613) - (var61 & var613);
            var613 = -1187931785;
            var61 = var1644;
            String var1153 = c(
               "ж”ЂиЎћж”њиЎж”•", "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ", var1287, var1409, var1532, (var61 | var613) & (~var61 | ~var613)
            );
            var613 = 35682582;
            var61 = -964695155;
            var1287 = (var61 | var613) - (var61 & var613);
            var613 = -1000369509;
            var61 = var1287;
            var1287 = (var61 | var613) - (var61 & var613);
            var1287 = (int)908170487194718178L;
            var613 = -226646488;
            var61 = var1287;
            var1287 = (var61 | var613) & ~(var61 & var613);
            var613 = -423515712;
            var61 = var1287;
            var1287 = var61 & ~var613 | ~var61 & var613;
            var613 = -1433984697;
            var61 = -320012627;
            var1287 = (var61 | var613) & ~(var61 & var613);
            var613 = 1181474789;
            var61 = var1287;
            var1287 = (var61 | var613) - (var61 & var613);
            var613 = -1131995205;
            var61 = 1639510664;
            var1409 = (var61 | var613) - (var61 & var613);
            var613 = -583013072;
            var61 = var1409;
            var1409 = (var61 | var613) - (var61 & var613);
            String var1416 = "dhb";
            var1409 = (int)1794177630106595408L;
            var613 = -470496576;
            var61 = var1409;
            var1409 = var61 + var613 - 2 * (var61 & var613);
            var613 = -121072993;
            var61 = var1409;
            var1409 = var61 & ~var613 | ~var61 & var613;
            var1532 = (int)-8658583983126437650L;
            var613 = -732319291;
            var61 = var1532;
            var1532 = var61 & ~var613 | ~var61 & var613;
            var613 = -493253950;
            var61 = var1532;
            var1532 = (var61 + var613 - 2 * (var61 & var613)) * (var61 + var613 - 2 * (var61 & var613));
            var613 = -1568976753;
            var61 = 1399851688;
            var1532 = (var61 | var613) & (~var61 | ~var613);
            var613 = -163098472;
            var61 = var1532;
            var1532 = var61 & ~var613 | ~var61 & var613;
            var1644 = (int)-7600738712975645562L;
            var613 = -1188459502;
            var61 = var1644;
            var1644 = (var61 | var613) & (~var61 | ~var613);
            var613 = 1783237350;
            var61 = var1644;
            var1644 = (var61 | var613) & (~var61 | ~var613);
            var613 = 693767667;
            var61 = 1558840199;
            var1644 = (var61 | var613) & ~(var61 & var613);
            var613 = 1876271875;
            var61 = var1644;
            var1644 = var61 & ~var613 | ~var61 & var613;
            int var1740 = (int)-6166856762653351449L;
            var613 = -498468930;
            var61 = var1740;
            var1740 = (var61 | var613) & ~(var61 & var613);
            var613 = -1234841856;
            var61 = var1740;
            var1740 = ((var61 | var613) - (var61 & var613)) * ((var61 | var613) - (var61 & var613));
            var1740 = (int)-2499938425850126120L;
            var613 = -1344478098;
            var61 = var1740;
            var1740 = (var61 | var613) & (~var61 | ~var613);
            var613 = -1725443705;
            var61 = var1740;
            return Identifier.of(
               var1153,
               c(
                  "ж”„б «ж”€б єж”…б јж”•б Ѕж•џб ѕж”‘б јж”„б §ж”“б ўж”•бЎЎж”ѓб  ж”џб №ж”–б ўж”‘б Ґж”•бЎ ж”Ђб  ж”—",
                  "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ",
                  var1409,
                  var1532,
                  var1644,
                  (var61 | var613) - (var61 & var613)
               )
            );
         case 3:
            String var1151 = "dhc";
            var613 = -55672940;
            var61 = 1228482640;
            int var1275 = (var61 | var613) & ~(var61 & var613);
            var613 = -1248372779;
            var61 = var1275;
            var1275 = (var61 | var613) - (var61 & var613);
            var1275 = (int)-6170513973878985998L;
            var613 = 1755234428;
            var61 = var1275;
            var1275 = (var61 | var613) - (var61 & var613);
            var613 = -1580914041;
            var61 = var1275;
            var1275 = var61 + var613 - 2 * (var61 & var613);
            var1275 = (int)-6056634007226942897L;
            var613 = 962748918;
            var61 = var1275;
            var1275 = (var61 | var613) - (var61 & var613);
            var613 = -2001320534;
            var61 = var1275;
            var1275 = var61 & ~var613 | ~var61 & var613;
            var613 = 798842744;
            var61 = 2146280467;
            int var1397 = (var61 | var613) & ~(var61 & var613);
            var613 = 2137605742;
            var61 = var1397;
            var613 = (var61 | var613) & (~var61 | ~var613);
            var61 = var1275;
            var1275 = 2 * (var61 | var613) - (var61 ^ var613);
            var613 = 1270032982;
            var61 = 533660623;
            var1275 = (var61 | var613) & ~(var61 & var613);
            var613 = 1026867606;
            var61 = var1275;
            var1275 = (var61 | var613) - (var61 & var613);
            var613 = 1540889228;
            var61 = 979506126;
            var1397 = (var61 | var613) & ~(var61 & var613);
            var613 = -620047749;
            var61 = var1397;
            var1397 = (var61 | var613) - (var61 & var613);
            var1397 = (int)2434677570901427824L;
            var613 = -936577858;
            var61 = var1397;
            var1397 = var61 + var613 - 2 * (var61 & var613);
            var613 = 595516401;
            var61 = var1397;
            var1397 = (var61 | var613) & (~var61 | ~var613);
            String var1523 = "dhd";
            var613 = -1123205660;
            var61 = 480965731;
            int var1524 = (var61 | var613) & ~(var61 & var613);
            var613 = -1334398051;
            var61 = var1524;
            int var1525 = (var61 | var613) & ~(var61 & var613);
            int var1637 = (int)2956648456694638937L;
            var613 = 1481471945;
            var61 = var1637;
            var1637 = (var61 | var613) & (~var61 | ~var613);
            var613 = -1999045532;
            var61 = var1637;
            var1637 = (var61 | var613) & ~(var61 & var613);
            var613 = -1054971528;
            var61 = 1108730227;
            int var1731 = (var61 | var613) - (var61 & var613);
            var613 = -780536901;
            var61 = var1731;
            var613 = (var61 | var613) & (~var61 | ~var613);
            var61 = var1637;
            var1637 = (var61 & ~var613) + (var613 & ~var61) + 2 * (var61 & var613);
            var613 = -1103966683;
            var61 = -351323096;
            var1637 = (var61 | var613) - (var61 & var613);
            var613 = 1426424252;
            var61 = var1637;
            String var1152 = c(
               "ж”Ђпє»ж”њпєЅж”•", "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ", var1275, var1397, var1525, var61 + var613 - 2 * (var61 & var613)
            );
            var613 = -1002423186;
            var61 = 823489530;
            int var1196 = var61 & ~var613 | ~var61 & var613;
            var613 = 1490301667;
            var61 = var1196;
            var1196 = (var61 & ~var613 | ~var61 & var613) * (var61 & ~var613 | ~var61 & var613);
            String var1286 = "dhe";
            var1397 = (int)-7903358484940281545L;
            var613 = -1517295500;
            var61 = var1397;
            var1397 = (var61 | var613) & ~(var61 & var613);
            var613 = -1697782224;
            var61 = var1397;
            var1397 = (var61 | var613) - (var61 & var613);
            var1397 = (int)6055912776273258817L;
            var613 = -2114937962;
            var61 = var1397;
            var1397 = var61 & ~var613 | ~var61 & var613;
            var613 = 1950096088;
            var61 = var1397;
            var1397 = (var61 | var613) & (~var61 | ~var613);
            int var1526 = (int)-3788199223044447137L;
            var613 = -935826493;
            var61 = var1526;
            int var1527 = (var61 | var613) & ~(var61 & var613);
            var613 = -1931000748;
            var61 = var1527;
            int var1528 = ((var61 | var613) - (var61 & var613)) * ((var61 | var613) - (var61 & var613));
            int var1529 = (int)5964589937711791157L;
            var613 = -1210479666;
            var61 = var1529;
            int var1530 = var61 + var613 - 2 * (var61 & var613);
            var613 = -461145390;
            var61 = var1530;
            int var1531 = var61 & ~var613 | ~var61 & var613;
            var613 = -2049704614;
            var61 = 489611377;
            var1731 = (var61 | var613) - (var61 & var613);
            var613 = -1728242376;
            var61 = var1731;
            var1731 = var61 & ~var613 | ~var61 & var613;
            var1731 = (int)5600248105469301791L;
            var613 = -1385635950;
            var61 = var1731;
            var1731 = var61 + var613 - 2 * (var61 & var613);
            var613 = -1444574323;
            var61 = var1731;
            var1731 = (var61 | var613) & (~var61 | ~var613);
            var613 = -1596405270;
            var61 = -1769945153;
            var1731 = (var61 | var613) - (var61 & var613);
            var613 = 911740511;
            var61 = var1731;
            var1731 = var61 & ~var613 | ~var61 & var613;
            var613 = -1853519258;
            var61 = 1208098691;
            var1637 = (var61 | var613) & (~var61 | ~var613);
            var613 = -828752663;
            var61 = var1637;
            var1637 = (var61 | var613) - (var61 & var613);
            int var1778 = (int)5532845368414404216L;
            var613 = 2007973702;
            var61 = var1778;
            var1778 = var61 & ~var613 | ~var61 & var613;
            var613 = 707674423;
            var61 = var1778;
            var1778 = (var61 | var613) - (var61 & var613);
            var1778 = (int)3864679303177173755L;
            var613 = -981524989;
            var61 = var1778;
            var1778 = (var61 | var613) - (var61 & var613);
            var613 = 1775428852;
            var61 = var1778;
            var1778 = var61 & ~var613 | ~var61 & var613;
            var613 = 1297224453;
            var61 = 65171874;
            var1731 = (var61 | var613) & ~(var61 & var613);
            var613 = 1325020476;
            var61 = var1731;
            return Identifier.of(
               var1152,
               c(
                  "ж”„\uda81ж”€\uda90ж”…\uda96ж”•\uda97ж•џ\uda94ж”‘\uda96ж”„\uda8dж”“\uda88ж”•\udacbж”—\uda88ж”џ\uda93ж•ћ\uda94ж”ћ\uda83",
                  "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ",
                  var1397,
                  var1531,
                  var1637,
                  (var61 | var613) & ~(var61 & var613)
               )
            );
         case 4:
            var613 = -960502079;
            var61 = -335756473;
            var1119 = (var61 | var613) - (var61 & var613);
            var613 = 453781609;
            var61 = var1119;
            var1119 = (var61 | var613) & ~(var61 & var613);
            int var1191 = (int)7498687875544998105L;
            var613 = -2106790471;
            var61 = var1191;
            var1191 = var61 + var613 - 2 * (var61 & var613);
            var613 = 1580719859;
            var61 = var1191;
            var613 = (var61 | var613) & (~var61 | ~var613);
            var61 = var1119;
            var1119 = (var61 ^ var613) + 2 * (var61 & var613);
            var1191 = (int)-1096685056734118342L;
            var613 = 485055399;
            var61 = var1191;
            var1191 = (var61 | var613) & ~(var61 & var613);
            var613 = -380732699;
            var61 = var1191;
            var1191 = (var61 | var613) - (var61 & var613);
            int var1264 = (int)3347605764064133659L;
            var613 = -46579080;
            var61 = var1264;
            var1264 = var61 + var613 - 2 * (var61 & var613);
            var613 = 1376132553;
            var61 = var1264;
            var1264 = (var61 | var613) & ~(var61 & var613);
            var1264 = (int)7098682679472071971L;
            var613 = 600984720;
            var61 = var1264;
            var1264 = (var61 | var613) & (~var61 | ~var613);
            var613 = 297533884;
            var61 = var1264;
            var1264 = var61 + var613 - 2 * (var61 & var613);
            var613 = -1980317898;
            var61 = 672702270;
            int var1386 = var61 + var613 - 2 * (var61 & var613);
            var613 = -1301161705;
            var61 = var1386;
            var1386 = (var61 & ~var613 | ~var61 & var613) * (var61 & ~var613 | ~var61 & var613);
            var613 = 172172212;
            var61 = 2066046740;
            var1386 = var61 & ~var613 | ~var61 & var613;
            var613 = 1982335586;
            var61 = var1386;
            var1386 = (var61 | var613) & ~(var61 & var613);
            String var1514 = "dhf";
            int var1515 = (int)-5015317695028035906L;
            var613 = -639491235;
            var61 = var1515;
            int var1516 = (var61 | var613) - (var61 & var613);
            var613 = 681495605;
            var61 = var1516;
            int var1517 = var61 + var613 - 2 * (var61 & var613);
            var613 = -768905303;
            var61 = 1863736217;
            int var1727 = var61 + var613 - 2 * (var61 & var613);
            var613 = -1120062402;
            var61 = var1727;
            var1727 = var61 + var613 - 2 * (var61 & var613);
            var613 = -2049507902;
            var61 = -2068694064;
            int var1632 = var61 + var613 - 2 * (var61 & var613);
            var613 = 21022502;
            var61 = var1632;
            String var1150 = c(
               "ж”Ђи°ѕж”њи°ёж”•", "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ", var1264, var1386, var1517, (var61 | var613) & ~(var61 & var613)
            );
            var613 = -1576151797;
            var61 = 1869993339;
            var1264 = (var61 | var613) - (var61 & var613);
            var613 = -847773599;
            var61 = var1264;
            var1264 = var61 & ~var613 | ~var61 & var613;
            var613 = 2146506508;
            var61 = 2059564562;
            var1264 = var61 + var613 - 2 * (var61 & var613);
            var613 = 217109625;
            var61 = var1264;
            var1264 = (var61 | var613) & ~(var61 & var613);
            var613 = 297431403;
            var61 = -1333028242;
            var1386 = var61 + var613 - 2 * (var61 & var613);
            var613 = -1255956572;
            var61 = var1386;
            var613 = var61 & ~var613 | ~var61 & var613;
            var61 = var1264;
            var1264 = (var61 ^ var613) + 2 * (var61 & var613);
            var1386 = (int)1261777944604952858L;
            var613 = -841897812;
            var61 = var1386;
            var1386 = (var61 | var613) & (~var61 | ~var613);
            var613 = -346282157;
            var61 = var1386;
            var1386 = ((var61 | var613) & (~var61 | ~var613)) * ((var61 | var613) & (~var61 | ~var613));
            var1386 = (int)4742384457108496469L;
            var613 = -1100053635;
            var61 = var1386;
            var1386 = var61 & ~var613 | ~var61 & var613;
            var613 = 1299139367;
            var61 = var1386;
            var1386 = (var61 | var613) - (var61 & var613);
            var613 = -368573114;
            var61 = -35704963;
            int var1518 = var61 + var613 - 2 * (var61 & var613);
            var613 = -1325469782;
            var61 = var1518;
            int var1519 = ((var61 | var613) - (var61 & var613)) * ((var61 | var613) - (var61 & var613));
            int var1520 = (int)242279139195563346L;
            var613 = 1418634156;
            var61 = var1520;
            int var1521 = var61 + var613 - 2 * (var61 & var613);
            var613 = -1075918147;
            var61 = var1521;
            int var1522 = (var61 | var613) & (~var61 | ~var613);
            var613 = -1763614772;
            var61 = -980279726;
            var1632 = var61 & ~var613 | ~var61 & var613;
            var613 = 1444642076;
            var61 = var1632;
            var1632 = (var61 + var613 - 2 * (var61 & var613)) * (var61 + var613 - 2 * (var61 & var613));
            var613 = -706573606;
            var61 = -2093710848;
            var1632 = var61 + var613 - 2 * (var61 & var613);
            var613 = 1151102178;
            var61 = var1632;
            var1632 = (var61 | var613) - (var61 & var613);
            var613 = 454437590;
            var61 = 754813617;
            int var1776 = (var61 | var613) & (~var61 | ~var613);
            var613 = 938188906;
            var61 = var1776;
            var1776 = (var61 | var613) & (~var61 | ~var613);
            var1727 = (int)-158477755235987534L;
            var613 = 271784992;
            var61 = var1727;
            var1727 = var61 + var613 - 2 * (var61 & var613);
            var613 = 774528295;
            var61 = var1727;
            return Identifier.of(
               var1150,
               c(
                  "ж”„дЋЇж”€дЋѕж”…дЋёж”•дЋ№ж•џдЋєж”‘дЋёж”„дЋЈж”“дЋ¦ж”•дЏҐж”ѓдЋѕж”‘дЋёж•ћдЋєж”ћдЋ­",
                  "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ",
                  var1386,
                  var1522,
                  var1632,
                  (var61 | var613) - (var61 & var613)
               )
            );
         case 5:
            var1119 = (int)2045636343329112140L;
            var613 = -388965449;
            var61 = var1119;
            var1119 = (var61 | var613) & ~(var61 & var613);
            var613 = 335170038;
            var61 = var1119;
            var1119 = (var61 | var613) - (var61 & var613);
            String var1186 = "dhg";
            var613 = 232888853;
            var61 = 1127859707;
            int var1376 = (var61 | var613) & (~var61 | ~var613);
            var613 = 1322803169;
            var61 = var1376;
            var1376 = (var61 | var613) & (~var61 | ~var613);
            int var1258 = (int)6082882102662412987L;
            var613 = -1107172679;
            var61 = var1258;
            var1258 = var61 + var613 - 2 * (var61 & var613);
            var613 = -326160371;
            var61 = var1258;
            var1258 = var61 + var613 - 2 * (var61 & var613);
            var613 = -970870095;
            var61 = -1740639428;
            var1376 = var61 + var613 - 2 * (var61 & var613);
            var613 = -415844559;
            var61 = var1376;
            var1376 = (var61 | var613) & (~var61 | ~var613);
            var1376 = (int)7695164405597560988L;
            var613 = -500939557;
            var61 = var1376;
            var1376 = var61 & ~var613 | ~var61 & var613;
            var613 = 1988732476;
            var61 = var1376;
            var1376 = (var61 | var613) & (~var61 | ~var613);
            var613 = 1037543569;
            var61 = 1331047114;
            int var1615 = (var61 | var613) & ~(var61 & var613);
            var613 = 1921090137;
            var61 = var1615;
            var1615 = var61 & ~var613 | ~var61 & var613;
            var1615 = (int)900110509243769814L;
            var613 = 285372606;
            var61 = var1615;
            var1615 = (var61 | var613) - (var61 & var613);
            var613 = 722490210;
            var61 = var1615;
            var1615 = var61 + var613 - 2 * (var61 & var613);
            var613 = -570522074;
            var61 = 901122982;
            var1615 = (var61 | var613) & ~(var61 & var613);
            var613 = -397898366;
            var61 = var1615;
            var1615 = (var61 | var613) & ~(var61 & var613);
            int var1507 = (int)-821932130592494737L;
            var613 = 700179919;
            var61 = var1507;
            var1507 = (var61 | var613) - (var61 & var613);
            var613 = -947664582;
            var61 = var1507;
            var1507 = var61 + var613 - 2 * (var61 & var613);
            var613 = -1564060403;
            var61 = 1345089889;
            var1615 = var61 + var613 - 2 * (var61 & var613);
            var613 = -78047145;
            var61 = var1615;
            var1615 = ((var61 | var613) & ~(var61 & var613)) * ((var61 | var613) & ~(var61 & var613));
            var1615 = (int)-2777118873553838670L;
            var613 = -709027618;
            var61 = var1615;
            var1615 = var61 & ~var613 | ~var61 & var613;
            var613 = -12629631;
            var61 = var1615;
            String var1146 = c("ж”Ђи‡§ж”њи‡Ўж”•", "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ", var1258, var1376, var1507, var61 & ~var613 | ~var61 & var613);
            int var1187 = (int)1730418066437111358L;
            var613 = -827515803;
            var61 = var1187;
            int var1188 = var61 & ~var613 | ~var61 & var613;
            var613 = 21785621;
            var61 = var1188;
            int var1189 = var61 + var613 - 2 * (var61 & var613);
            var1258 = (int)-3806523589856215084L;
            var613 = 1126534875;
            var61 = var1258;
            var1258 = var61 + var613 - 2 * (var61 & var613);
            var613 = -1157955721;
            var61 = var1258;
            var613 = var61 + var613 - 2 * (var61 & var613);
            var61 = var1189;
            int var1190 = var61 - ~var613 - 1;
            String var1263 = "dhh";
            String var1383 = "dhi";
            var613 = -864688763;
            var61 = -1090761115;
            var1376 = (var61 | var613) & (~var61 | ~var613);
            var613 = 465650671;
            var61 = var1376;
            var1376 = (var61 | var613) & ~(var61 & var613);
            String var1510 = "dhj";
            var1507 = (int)7706277569336470475L;
            var613 = -1550989104;
            var61 = var1507;
            var1507 = (var61 | var613) - (var61 & var613);
            var613 = 2629209;
            var61 = var1507;
            var1507 = (var61 | var613) & ~(var61 & var613);
            var1615 = (int)-3239419840328628332L;
            var613 = 1574278826;
            var61 = var1615;
            var1615 = var61 & ~var613 | ~var61 & var613;
            var613 = 1555177906;
            var61 = var1615;
            var1615 = (var61 & ~var613 | ~var61 & var613) * (var61 & ~var613 | ~var61 & var613);
            var1615 = (int)8754522587000015079L;
            var613 = 1172376487;
            var61 = var1615;
            var1615 = var61 + var613 - 2 * (var61 & var613);
            var613 = -1805299120;
            var61 = var1615;
            var1615 = (var61 | var613) & ~(var61 & var613);
            int var1722 = (int)-1027028959506260725L;
            var613 = 561074493;
            var61 = var1722;
            var1722 = var61 & ~var613 | ~var61 & var613;
            var613 = -754434188;
            var61 = var1722;
            var1722 = ((var61 | var613) & ~(var61 & var613)) * ((var61 | var613) & ~(var61 & var613));
            var1722 = (int)983149012851088879L;
            var613 = 1807375899;
            var61 = var1722;
            var1722 = (var61 | var613) & (~var61 | ~var613);
            var613 = 330744896;
            var61 = var1722;
            return Identifier.of(
               var1146,
               c(
                  "ж”„мЄ®ж”€мЄїж”…мЄ№ж”•мЄёж•џмЄ»ж”‘мЄ№ж”„мЄўж”“мЄ§ж”•м«¤ж””мЄ¤ж”њмЄ§ж”‘мЄ№ж•ћмЄ»ж”ћмЄ¬",
                  "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ",
                  var1376,
                  var1507,
                  var1615,
                  (var61 | var613) - (var61 & var613)
               )
            );
         default:
            var613 = -1043746707;
            var61 = -570196351;
            int var1179 = (var61 | var613) & ~(var61 & var613);
            var613 = 533384935;
            var61 = var1179;
            var1179 = var61 & ~var613 | ~var61 & var613;
            var1179 = (int)1076874319860908054L;
            var613 = -1588834033;
            var61 = var1179;
            var1179 = (var61 | var613) & (~var61 | ~var613);
            var613 = -926485463;
            var61 = var1179;
            var1179 = (var61 & ~var613 | ~var61 & var613) * (var61 & ~var613 | ~var61 & var613);
            var613 = 611927687;
            var61 = 1772382828;
            int var1252 = var61 + var613 - 2 * (var61 & var613);
            var613 = -79978237;
            var61 = var1252;
            var1252 = ((var61 | var613) & ~(var61 & var613)) * ((var61 | var613) & ~(var61 & var613));
            var613 = 913520091;
            var61 = 733733736;
            var1252 = var61 + var613 - 2 * (var61 & var613);
            var613 = 1954561724;
            var61 = var1252;
            var1252 = (var61 | var613) - (var61 & var613);
            String var1366 = "dhk";
            int var1367 = (int)7332777898985411804L;
            var613 = 539572095;
            var61 = var1367;
            int var1368 = (var61 | var613) & (~var61 | ~var613);
            var613 = -624238110;
            var61 = var1368;
            int var1369 = (var61 | var613) & (~var61 | ~var613);
            var613 = -1525305498;
            var61 = -572713544;
            int var1494 = var61 & ~var613 | ~var61 & var613;
            var613 = -946205029;
            var61 = var1494;
            var1494 = (var61 | var613) & ~(var61 & var613);
            var1494 = (int)5936700804077345908L;
            var613 = -1913426008;
            var61 = var1494;
            var1494 = var61 & ~var613 | ~var61 & var613;
            var613 = -190093472;
            var61 = var1494;
            var1494 = (var61 | var613) - (var61 & var613);
            var613 = 606828620;
            var61 = -267665405;
            int var1603 = (var61 | var613) - (var61 & var613);
            var613 = -786934361;
            var61 = var1603;
            var1603 = (var61 | var613) & (~var61 | ~var613);
            int var1715 = (int)1406078974447975378L;
            var613 = 1262049951;
            var61 = var1715;
            var1715 = (var61 | var613) - (var61 & var613);
            var613 = 1124563066;
            var61 = var1715;
            var613 = (var61 | var613) - (var61 & var613);
            var61 = var1603;
            var1603 = (var61 ^ var613) + 2 * (var61 & var613);
            var613 = 170397262;
            var61 = -1542491440;
            var1603 = var61 + var613 - 2 * (var61 & var613);
            var613 = -1372426195;
            var61 = var1603;
            String var1142 = c(
               "ж”Ђи†№ж”њи†їж”•", "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ", var1252, var1369, var1494, (var61 | var613) & (~var61 | ~var613)
            );
            var613 = -397184759;
            var61 = -1264558823;
            var1179 = var61 & ~var613 | ~var61 & var613;
            var613 = 466064543;
            var61 = var1179;
            var1179 = ((var61 | var613) - (var61 & var613)) * ((var61 | var613) - (var61 & var613));
            var613 = 259809294;
            var61 = 1219720530;
            var1252 = (var61 | var613) & (~var61 | ~var613);
            var613 = 389763934;
            var61 = var1252;
            var1252 = (var61 + var613 - 2 * (var61 & var613)) * (var61 + var613 - 2 * (var61 & var613));
            var613 = -2004630069;
            var61 = -1970576427;
            int var1370 = (var61 | var613) & (~var61 | ~var613);
            var613 = -1382168535;
            var61 = var1370;
            int var1371 = (var61 | var613) - (var61 & var613);
            var1494 = (int)2578453523805507159L;
            var613 = 787846455;
            var61 = var1494;
            var1494 = var61 + var613 - 2 * (var61 & var613);
            var613 = -886574065;
            var61 = var1494;
            var613 = var61 + var613 - 2 * (var61 & var613);
            var61 = var1371;
            int var1372 = (var61 ^ var613) + 2 * (var61 & var613);
            int var1373 = (int)-4826487151427815394L;
            var613 = -663822951;
            var61 = var1373;
            int var1374 = (var61 | var613) & ~(var61 & var613);
            var613 = 1125010824;
            var61 = var1374;
            int var1375 = (var61 | var613) - (var61 & var613);
            var1494 = (int)-6520037934346727018L;
            var613 = 1333697081;
            var61 = var1494;
            var1494 = var61 + var613 - 2 * (var61 & var613);
            var613 = 2018860887;
            var61 = var1494;
            var1494 = var61 & ~var613 | ~var61 & var613;
            var1603 = (int)-2846197758418025328L;
            var613 = 926399142;
            var61 = var1603;
            var1603 = (var61 | var613) - (var61 & var613);
            var613 = 1190394822;
            var61 = var1603;
            var613 = (var61 | var613) - (var61 & var613);
            var61 = var1494;
            var1494 = var61 - ~var613 - 1;
            var613 = 1132438865;
            var61 = -1444172170;
            var1494 = (var61 | var613) & (~var61 | ~var613);
            var613 = -306273441;
            var61 = var1494;
            var1494 = (var61 | var613) - (var61 & var613);
            var613 = 983503710;
            var61 = -1452369751;
            var1603 = (var61 | var613) & ~(var61 & var613);
            var613 = -1183117494;
            var61 = var1603;
            var1603 = (var61 | var613) & ~(var61 & var613);
            var613 = -1711455532;
            var61 = 1433550179;
            var1715 = (var61 | var613) - (var61 & var613);
            var613 = 1878175351;
            var61 = var1715;
            var613 = var61 & ~var613 | ~var61 & var613;
            var61 = var1603;
            var1603 = (var61 ^ var613) + 2 * (var61 & var613);
            var1603 = (int)1353581598531158642L;
            var613 = 1198460477;
            var61 = var1603;
            var1603 = (var61 | var613) & (~var61 | ~var613);
            var613 = -1709458984;
            var61 = var1603;
            var1603 = (var61 | var613) & (~var61 | ~var613);
            var1715 = (int)3012999205869766928L;
            var613 = -153256800;
            var61 = var1715;
            var1715 = var61 + var613 - 2 * (var61 & var613);
            var613 = 1456044842;
            var61 = var1715;
            var1715 = ((var61 | var613) & (~var61 | ~var613)) * ((var61 | var613) & (~var61 | ~var613));
            var613 = 366513689;
            var61 = 580617201;
            var1715 = var61 & ~var613 | ~var61 & var613;
            var613 = 927153922;
            var61 = var1715;
            return Identifier.of(
               var1142,
               c(
                  "ж”„лї°ж”€лїЎж”…лї§ж”•лї¦ж•џлїҐж”‘лї§ж”„лїјж”“лї№ж”•лѕєж”лї°ж”‘лї§ж”„лѕ»ж”Ђлї»ж”—",
                  "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘є}\ua7e2к’ кЃЅк¤Ђзґ№и№ѓв‘·и¬§г‘»=\ua7f0к’јкЃўк¤ђзµ·и№†в‘©и­ёг‘‡sкџґк’ЎкЃёк¤†зµєи№Џв‘©и¬љг‘ёvкџік’№кЃґ",
                  var1375,
                  var1494,
                  var1603,
                  (var61 | var613) & (~var61 | ~var613)
               )
            );
      }
   }

   @Override
   public void f() {
      super.f();
      int var10001 = (int)7855400145910233800L;
      int var2 = 1292486071;
      int var1 = var10001;
      var10001 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1821261695;
      var1 = var10001;
      this.J = pulse.Bool.from((var1 | var2) - (var1 & var2));
      this.K = null;
   }

   public static String c(String var0, String var1, int var2, int var3, int var4, int var5) {
      char[] var6 = var1.toCharArray();
      char[] var7 = new char[var6.length];
      int var18 = 359704983;
      int var17 = -1161415384;
      int var10000 = (var17 | var18) - (var17 & var18);
      var18 = -1346986827;
      var17 = var10000;
      char[] var249 = new char[var17 & ~var18 | ~var17 & var18];
      int var10002 = (int)4502769968813051120L;
      var18 = 199395718;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 461669750;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      int var10003 = (int)305405165803267416L;
      var18 = -146811487;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -1552254773;
      var17 = var10003;
      var249[var10002] = (char)((var17 | var18) - (var17 & var18));
      var10002 = (int)-4258247160358511876L;
      var18 = 843844566;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -481308373;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)-5091799246425883274L;
      var18 = 282294217;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 167618874;
      var17 = var10003;
      var249[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var10002 = (int)-1318968274989615793L;
      var18 = 543561258;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1285692569;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var10003 = (int)7657398070066534022L;
      var18 = 1805817842;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 900817650;
      var17 = var10003;
      var249[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var18 = 46845957;
      var17 = -570796046;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -550467596;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 984666346;
      var17 = -1499782437;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -894860818;
      var17 = var10003;
      var10003 = ((var17 | var18) & ~(var17 & var18)) * ((var17 | var18) & ~(var17 & var18));
      var10003 = (int)2393120518425254771L;
      var18 = 1627011105;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -980075711;
      var17 = var10003;
      var249[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var10002 = (int)-774808880450467965L;
      var18 = 1946160889;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -739341954;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 2069061671;
      var17 = -695900870;
      int var10004 = (var17 | var18) & ~(var17 & var18);
      var18 = -1378482928;
      var17 = var10004;
      var10004 = var17 + var18 - 2 * (var17 & var18);
      var10004 = (int)-613316831236087484L;
      var18 = -714117063;
      var17 = var10004;
      var10004 = var17 & ~var18 | ~var17 & var18;
      var18 = -1106718355;
      var17 = var10004;
      var10004 = (var17 | var18) - (var17 & var18);
      var10003 = (int)-2707526041710519535L;
      var18 = 2126209543;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -2130548685;
      var17 = var10003;
      var249[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var18 = 314810348;
      var17 = -1252003282;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -1482920505;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -1153014563;
      var17 = 569427759;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1699289488;
      var17 = var10003;
      var249[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var18 = 2009243206;
      var17 = 446555421;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 1834974045;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1401912508;
      var17 = 1477113768;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -193298945;
      var17 = var10003;
      var249[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var18 = 2120962465;
      var17 = -371409839;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1749553673;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -52458382;
      var17 = -1362250467;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 1376914765;
      var17 = var10003;
      var249[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var18 = -1732888696;
      var17 = -1145850281;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 587563479;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)2635839760721903748L;
      var18 = -1738191763;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -1765063494;
      var17 = var10003;
      var249[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var10002 = (int)4690841671982080804L;
      var18 = -524900202;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 614583227;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var10003 = (int)4521571240660355850L;
      var18 = 147152356;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 1122734538;
      var17 = var10003;
      var249[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      char[] var8 = var249;
      var18 = -728619669;
      var17 = -705345113;
      var10000 = (var17 | var18) & (~var17 | ~var18);
      var18 = 23555270;
      var17 = var10000;
      char[] var251 = new char[var17 & ~var18 | ~var17 & var18];
      var18 = 1209319791;
      var17 = 2056647866;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 847328725;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 577441972;
      var17 = 1243996429;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1749989785;
      var17 = var10003;
      var251[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var10002 = (int)-5293894442901672976L;
      var18 = 1948147524;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 410006709;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      String var331 = "dio";
      var10003 = (int)1495936319991766244L;
      var18 = -671745257;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -398220304;
      var17 = var10003;
      var251[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var10002 = (int)-2452271632369466311L;
      var18 = -1548801252;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -931729625;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 159039298;
      var17 = -1879753532;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 330901850;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -504026662;
      var17 = -1517656603;
      var10004 = (var17 | var18) & ~(var17 & var18);
      var18 = 1227420721;
      var17 = var10004;
      var18 = var17 & ~var18 | ~var17 & var18;
      var17 = var10003;
      var10003 = (var17 & ~var18) + (var18 & ~var17) + 2 * (var17 & var18);
      var18 = -1059449562;
      var17 = 2044043020;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1190195847;
      var17 = var10003;
      var251[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var10002 = (int)-5062293341275350378L;
      var18 = 2011748615;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1952595054;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)-9140374191703910914L;
      var18 = -1039219785;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 2002382411;
      var17 = var10003;
      var251[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var18 = -360198568;
      var17 = 1861677057;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -2072953251;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)-5590935588777249013L;
      var18 = -1716852106;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -1518508739;
      var17 = var10003;
      var251[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var10002 = (int)-38799180816509101L;
      var18 = -2110534846;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1139334164;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)-4897533306729134078L;
      var18 = -1491803455;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 1204867671;
      var17 = var10003;
      var251[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var10002 = (int)-1190566993235302140L;
      var18 = 1369119241;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -142822645;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1706952015;
      var17 = 601188282;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 798213529;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var10003 = (int)1562628992935068870L;
      var18 = 441818348;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 768220947;
      var17 = var10003;
      var251[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var18 = -1991815701;
      var17 = 1596925151;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -697800397;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 2024177378;
      var17 = -1864923980;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -395187602;
      var17 = var10003;
      var251[var10002] = (char)((var17 | var18) - (var17 & var18));
      var10002 = (int)8255841070888808916L;
      var18 = -1697077162;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -357508726;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var10004 = (int)-2284633223870732351L;
      var18 = 970485880;
      var17 = var10004;
      var10004 = var17 & ~var18 | ~var17 & var18;
      var18 = -1057400919;
      var17 = var10004;
      var10004 = var17 & ~var18 | ~var17 & var18;
      var18 = -684059660;
      var17 = -488946836;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 903992220;
      var17 = var10003;
      var251[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var18 = 1226157216;
      var17 = -1450598775;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -526634464;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 846249207;
      var17 = 252216843;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1031277007;
      var17 = var10003;
      var251[var10002] = (char)((var17 | var18) - (var17 & var18));
      char[] var9 = var251;
      var10000 = (int)2620181534775491080L;
      var18 = 2080576103;
      var17 = var10000;
      var10000 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1196927087;
      var17 = var10000;

      for (int var10 = var17 + var18 - 2 * (var17 & var18); var10 < var6.length; var10++) {
         char var308 = var6[var10];
         char var235 = var8[var10 % var8.length];
         char var121 = var308;
         var7[var10] = (char)((var121 | var235) - (var121 & var235));
      }

      char[] var19 = new char[var7.length];
      var18 = -794428724;
      var17 = -223999130;
      var10000 = var17 + var18 - 2 * (var17 & var18);
      var18 = 570683818;
      var17 = var10000;

      for (int var11 = (var17 | var18) & (~var17 | ~var18); var11 < var6.length; var11++) {
         char var309 = var7[var11];
         char var238 = var9[var11 % var9.length];
         char var124 = var309;
         var19[var11] = (char)((var124 | var238) & ~(var124 & var238));
      }

      String var20 = new String(var19);
      int var12 = var20.hashCode();
      var18 = var5;
      var17 = var3;
      var10000 = (var17 & ~var18) - (~var17 & var18);
      var18 = var2;
      var17 = var10000;
      int var13 = var17 - var18;
      char[] var14 = var0.toCharArray();
      char[] var15 = new char[var14.length];
      var18 = -144028535;
      var17 = -114881696;
      var10000 = (var17 | var18) & ~(var17 & var18);
      var18 = 239945705;
      var17 = var10000;

      for (int var16 = var17 + var18 - 2 * (var17 & var18); var16 < var15.length; var16++) {
         int var10001 = (int)-6719310816150413715L;
         var18 = -15585797;
         var17 = var10001;
         var10001 = (var17 | var18) & ~(var17 & var18);
         var18 = 1022899092;
         var17 = var10001;
         switch (var16 % ((var17 | var18) - (var17 & var18))) {
            case 0:
               var18 = var12;
               var17 = var13;
               var10002 = (var17 | var18) & ~(var17 & var18);
               char var248 = var14[var16];
               var17 = var10002;
               var15[var16] = (char)(var17 & ~var248 | ~var17 & var248);
               break;
            case 1:
               var18 = var13;
               var17 = var5;
               var10002 = var17 & ~var18 | ~var17 & var18;
               char var246 = var14[var16];
               var17 = var10002;
               var15[var16] = (char)(var17 + var246 - 2 * (var17 & var246));
         }
      }

      return new String(var15);
   }
}
