package pulse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import lombok.Generated;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.registry.entry.RegistryEntry;

@HudServiceInfo(enabledByDefault = true)
public class PotionEffectService extends HudService {
   private static final MinecraftClient a = MinecraftClient.getInstance();
   private final List<PotionEffectService.PotionGroup> b;
   private List<PotionEffectService.PotionEffectInfo> c;
   private PotionEffectService.PotionEffectInfo d;
   private long e;
   private int f;
   private static final long g = 1000L;
   private boolean h;
   private boolean i;
   private boolean j;

   public PotionEffectService() {
      int var10001 = (int)-1429680471161234872L;
      int var2 = 427609818;
      int var1 = var10001;
      var10001 = (var1 | var2) & ~(var1 & var2);
      var2 = -1218194283;
      var1 = var10001;
      PotionEffectService.PotionGroup[] var290 = new PotionEffectService.PotionGroup[var1 + var2 - 2 * (var1 & var2)];
      var2 = 1543775700;
      var1 = 65393419;
      int var10003 = (var1 | var2) & ~(var1 & var2);
      var2 = 1608644319;
      var1 = var10003;
      var10003 = (var1 | var2) - (var1 & var2);
      int var10008 = (int)2347303586151150966L;
      var2 = -317545001;
      var1 = var10008;
      var10008 = (var1 | var2) & ~(var1 & var2);
      var2 = -1128004928;
      var1 = var10008;
      var10008 = (var1 | var2) & ~(var1 & var2);
      var2 = 672409124;
      var1 = 938936160;
      int var10009 = (var1 | var2) - (var1 & var2);
      var2 = -232577276;
      var1 = var10009;
      var10009 = (var1 | var2) & ~(var1 & var2);
      var2 = -12851201;
      var1 = 1196601120;
      int var10010 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1090694186;
      var1 = var10010;
      var10010 = (var1 | var2) & ~(var1 & var2);
      var2 = -335824589;
      var1 = -1901216079;
      int var10011 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1699968751;
      var1 = var10011;
      String var10006 = b(
         "鐄眪鐨睓鐦猿鐳眯鐧眧鐣睙鐫眧", "`ꟳꓺꁡꤐ絺蹙⑿譸㑿s\ua7e8꒱ꁽ꤀絤踅⑳謺㑧~ꞩ꒑ꁴ꤇絣蹌⑼謃㑾\u007f\ua7e3꒝ꁰꤋ絲蹆⑿謥", var10008, var10009, var10010, (var1 | var2) & ~(var1 & var2)
      );
      int var10007 = (int)126746082122959679L;
      var2 = 155375632;
      var1 = var10007;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var2 = -388082899;
      var1 = var10007;
      PotionEffectService.EffectRequirement[] var320 = new PotionEffectService.EffectRequirement[(var1 | var2) & ~(var1 & var2)];
      var2 = 1395160309;
      var1 = 65612030;
      var10009 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1354849291;
      var1 = var10009;
      var10009 = (var1 | var2) & (~var1 | ~var2);
      var2 = -394551801;
      var1 = -646910985;
      int var10013 = (var1 | var2) & (~var1 | ~var2);
      var2 = 822834673;
      var1 = var10013;
      var320[var10009] = new PotionEffectService.EffectRequirement(StatusEffects.POISON, var1 + var2 - 2 * (var1 & var2));
      var2 = -1174663143;
      var1 = 1038099504;
      var10009 = (var1 | var2) & (~var1 | ~var2);
      var2 = -2078526424;
      var1 = var10009;
      var10009 = (var1 | var2) & ~(var1 & var2);
      var2 = 401908892;
      var1 = -1743502427;
      var10013 = (var1 | var2) & ~(var1 & var2);
      var2 = -1881086149;
      var1 = var10013;
      var320[var10009] = new PotionEffectService.EffectRequirement(StatusEffects.SLOWNESS, var1 & ~var2 | ~var1 & var2);
      List var321 = Arrays.asList(var320);
      var2 = -1316119967;
      var1 = 550125181;
      var10009 = (var1 | var2) & ~(var1 & var2);
      var2 = -1857575907;
      var1 = var10009;
      var290[var10003] = new PotionEffectService.PotionGroup(var10006, var321, StatusEffects.POISON, pulse.Bool.from(var1 & (var2 ^ -1) | (var1 ^ -1) & var2));
      var2 = -1764666603;
      var1 = 117059936;
      var10003 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1876204940;
      var1 = var10003;
      var10003 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1990624596;
      var1 = -211556840;
      var10008 = (var1 | var2) & (~var1 | ~var2);
      var2 = -77197611;
      var1 = var10008;
      var10008 = (var1 | var2) - (var1 & var2);
      var2 = -110809821;
      var1 = 495202539;
      var10009 = (var1 | var2) - (var1 & var2);
      var2 = 154301906;
      var1 = var10009;
      var10009 = (var1 | var2) - (var1 & var2);
      var2 = -1794779882;
      var1 = -113456410;
      var10010 = (var1 | var2) & ~(var1 & var2);
      var2 = 1690129273;
      var1 = var10010;
      var10010 = (var1 | var2) - (var1 & var2);
      var2 = 1945676503;
      var1 = -1815927928;
      var10011 = (var1 | var2) & (~var1 | ~var2);
      var2 = -534554088;
      var1 = var10011;
      var10006 = b("鐲픈鐭핷鐡픋鑓픈鐭픀", "`ꟳꓺꁡꤐ絺蹙⑿譸㑿s\ua7e8꒱ꁽ꤀絤踅⑳謺㑧~ꞩ꒑ꁴ꤇絣蹌⑼謃㑾\u007f\ua7e3꒝ꁰꤋ絲蹆⑿謥", var10008, var10009, var10010, var1 + var2 - 2 * (var1 & var2));
      var10007 = (int)-1012126269268430376L;
      var2 = 288841832;
      var1 = var10007;
      var10007 = (var1 | var2) - (var1 & var2);
      var2 = 1432261042;
      var1 = var10007;
      PotionEffectService.EffectRequirement[] var324 = new PotionEffectService.EffectRequirement[var1 + var2 - 2 * (var1 & var2)];
      var2 = 1814908399;
      var1 = 998683830;
      var10009 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1470888281;
      var1 = var10009;
      var10009 = (var1 | var2) & (~var1 | ~var2);
      var10013 = (int)8568952091625792158L;
      var2 = -390433181;
      var1 = var10013;
      var10013 = (var1 | var2) - (var1 & var2);
      var2 = 101209340;
      var1 = var10013;
      var324[var10009] = new PotionEffectService.EffectRequirement(StatusEffects.WEAKNESS, (var1 | var2) & ~(var1 & var2));
      var2 = -1900720513;
      var1 = 1016939865;
      var10009 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1305998553;
      var1 = var10009;
      var10009 = (var1 | var2) & (~var1 | ~var2);
      var2 = -288401156;
      var1 = -1159345210;
      var10013 = (var1 | var2) & ~(var1 & var2);
      var2 = 1412076344;
      var1 = var10013;
      var324[var10009] = new PotionEffectService.EffectRequirement(StatusEffects.WITHER, (var1 | var2) & (~var1 | ~var2));
      List var325 = Arrays.asList(var324);
      var2 = -1607358396;
      var1 = -22294121;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var2 = 1587182034;
      var1 = var10009;
      var290[var10003] = new PotionEffectService.PotionGroup(var10006, var325, StatusEffects.WITHER, pulse.Bool.from(var1 + var2 - 2 * (var1 & var2)));
      var2 = 2029251904;
      var1 = -1087175449;
      var10003 = (var1 | var2) - (var1 & var2);
      var2 = -943658587;
      var1 = var10003;
      var10003 = var1 + var2 - 2 * (var1 & var2);
      var10008 = (int)-8772232603640875008L;
      var2 = -1564263462;
      var1 = var10008;
      var10008 = var1 & ~var2 | ~var1 & var2;
      var2 = -1082322501;
      var1 = var10008;
      var10008 = (var1 | var2) - (var1 & var2);
      var2 = 1372546412;
      var1 = -64601642;
      var10009 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1076983423;
      var1 = var10009;
      var10009 = (var1 | var2) - (var1 & var2);
      var10010 = (int)1397575669030864341L;
      var2 = -1856008205;
      var1 = var10010;
      var10010 = (var1 | var2) & ~(var1 & var2);
      var2 = 331749578;
      var1 = var10010;
      var10010 = var1 & ~var2 | ~var1 & var2;
      var10011 = (int)-1265000399468367631L;
      var2 = 76802970;
      var1 = var10011;
      var10011 = (var1 | var2) & ~(var1 & var2);
      var2 = -1065638247;
      var1 = var10011;
      var10006 = b("鐶뮻鐭뮿鑐믈鐩뮰", "`ꟳꓺꁡꤐ絺蹙⑿譸㑿s\ua7e8꒱ꁽ꤀絤踅⑳謺㑧~ꞩ꒑ꁴ꤇絣蹌⑼謃㑾\u007f\ua7e3꒝ꁰꤋ絲蹆⑿謥", var10008, var10009, var10010, var1 & ~var2 | ~var1 & var2);
      var10007 = (int)4155683109746083456L;
      var2 = 118890702;
      var1 = var10007;
      var10007 = (var1 | var2) & ~(var1 & var2);
      var2 = 1150789199;
      var1 = var10007;
      PotionEffectService.EffectRequirement[] var328 = new PotionEffectService.EffectRequirement[var1 + var2 - 2 * (var1 & var2)];
      var2 = 831958396;
      var1 = 1457166536;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var2 = 1733047732;
      var1 = var10009;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var10013 = (int)-4425882928262994352L;
      var2 = -32046008;
      var1 = var10013;
      var10013 = var1 & ~var2 | ~var1 & var2;
      var2 = -310631908;
      var1 = var10013;
      var328[var10009] = new PotionEffectService.EffectRequirement(StatusEffects.SPEED, (var1 | var2) & ~(var1 & var2));
      List var329 = Arrays.asList(var328);
      var2 = 832955716;
      var1 = -747297323;
      var10009 = (var1 | var2) & (~var1 | ~var2);
      var2 = -489635695;
      var1 = var10009;
      var290[var10003] = new PotionEffectService.PotionGroup(var10006, var329, StatusEffects.SPEED, pulse.Bool.from((var1 | var2) & (var1 & var2 ^ -1)));
      var10003 = (int)-5537642310280396485L;
      var2 = 2016619654;
      var1 = var10003;
      var10003 = var1 & ~var2 | ~var1 & var2;
      var2 = -358388290;
      var1 = var10003;
      var10003 = (var1 | var2) - (var1 & var2);
      var10008 = (int)-3336069004348993398L;
      var2 = -201830081;
      var1 = var10008;
      var10008 = (var1 | var2) & (~var1 | ~var2);
      var2 = 53646292;
      var1 = var10008;
      var10008 = (var1 | var2) & (~var1 | ~var2);
      var10009 = (int)-5367911280271022864L;
      var2 = -906301060;
      var1 = var10009;
      var10009 = (var1 | var2) & ~(var1 & var2);
      var2 = -1383072890;
      var1 = var10009;
      var10009 = (var1 | var2) & (~var1 | ~var2);
      var10010 = (int)-3277635487921264875L;
      var2 = 29128123;
      var1 = var10010;
      var10010 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1133195292;
      var1 = var10010;
      var10010 = var1 & ~var2 | ~var1 & var2;
      var10011 = (int)2726274778062010733L;
      var2 = -1090472964;
      var1 = var10011;
      var10011 = (var1 | var2) - (var1 & var2);
      var2 = -446557274;
      var1 = var10011;
      var10006 = b("鐲齷鑜鼇鐣鼊逳齷鐭齱鐣", "`ꟳꓺꁡꤐ絺蹙⑿譸㑿s\ua7e8꒱ꁽ꤀絤踅⑳謺㑧~ꞩ꒑ꁴ꤇絣蹌⑼謃㑾\u007f\ua7e3꒝ꁰꤋ絲蹆⑿謥", var10008, var10009, var10010, (var1 | var2) - (var1 & var2));
      var2 = 1326156132;
      var1 = 1477239768;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var2 = 386362045;
      var1 = var10007;
      PotionEffectService.EffectRequirement[] var331 = new PotionEffectService.EffectRequirement[var1 + var2 - 2 * (var1 & var2)];
      var10009 = (int)-7023290231592679280L;
      var2 = 340502969;
      var1 = var10009;
      var10009 = var1 + var2 - 2 * (var1 & var2);
      var2 = -617012951;
      var1 = var10009;
      var10009 = var1 + var2 - 2 * (var1 & var2);
      var10013 = (int)6201151468382078505L;
      var2 = 932718645;
      var1 = var10013;
      var10013 = (var1 | var2) & (~var1 | ~var2);
      var2 = -254382562;
      var1 = var10013;
      var331[var10009] = new PotionEffectService.EffectRequirement(StatusEffects.REGENERATION, (var1 | var2) & ~(var1 & var2));
      List var332 = Arrays.asList(var331);
      var2 = -279058295;
      var1 = -597657729;
      var10009 = (var1 | var2) - (var1 & var2);
      var2 = 859676662;
      var1 = var10009;
      var290[var10003] = new PotionEffectService.PotionGroup(var10006, var332, StatusEffects.REGENERATION, pulse.Bool.from((var1 | var2) & (var1 ^ -1 | var2 ^ -1)));
      var10003 = (int)9134659178897044875L;
      var2 = -518625633;
      var1 = var10003;
      var10003 = var1 + var2 - 2 * (var1 & var2);
      var2 = -813886704;
      var1 = var10003;
      var10003 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1260069550;
      var1 = -1754915027;
      var10008 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1562488802;
      var1 = var10008;
      var10008 = var1 + var2 - 2 * (var1 & var2);
      var10009 = (int)2044575313804834176L;
      var2 = -1939196012;
      var1 = var10009;
      var10009 = (var1 | var2) - (var1 & var2);
      var2 = 775987392;
      var1 = var10009;
      var10009 = (var1 | var2) & ~(var1 & var2);
      var10010 = (int)-1596161660286401596L;
      var2 = -1412881616;
      var1 = var10010;
      var10010 = (var1 | var2) & (~var1 | ~var2);
      var2 = -69744212;
      var1 = var10010;
      var10010 = var1 & ~var2 | ~var1 & var2;
      var10011 = (int)-4904417954081055771L;
      var2 = -1689363254;
      var1 = var10011;
      var10011 = (var1 | var2) - (var1 & var2);
      var2 = -1685812946;
      var1 = var10011;
      var10006 = b("鐄衆鐨蠿鐦豓鐠衎鐦衁鐣", "`ꟳꓺꁡꤐ絺蹙⑿譸㑿s\ua7e8꒱ꁽ꤀絤踅⑳謺㑧~ꞩ꒑ꁴ꤇絣蹌⑼謃㑾\u007f\ua7e3꒝ꁰꤋ絲蹆⑿謥", var10008, var10009, var10010, (var1 | var2) & (~var1 | ~var2));
      var10007 = (int)2498705273407487506L;
      var2 = -93741257;
      var1 = var10007;
      var10007 = (var1 | var2) & (~var1 | ~var2);
      var2 = -508518108;
      var1 = var10007;
      PotionEffectService.EffectRequirement[] var335 = new PotionEffectService.EffectRequirement[var1 + var2 - 2 * (var1 & var2)];
      var2 = -1887739721;
      var1 = 1348645297;
      var10009 = (var1 | var2) & ~(var1 & var2);
      var2 = -551956218;
      var1 = var10009;
      var10009 = var1 + var2 - 2 * (var1 & var2);
      var10013 = (int)1319339310106174389L;
      var2 = -634420754;
      var1 = var10013;
      var10013 = var1 + var2 - 2 * (var1 & var2);
      var2 = 523887199;
      var1 = var10013;
      var335[var10009] = new PotionEffectService.EffectRequirement(StatusEffects.STRENGTH, (var1 | var2) - (var1 & var2));
      List var336 = Arrays.asList(var335);
      var2 = 745369690;
      var1 = -1583729916;
      var10009 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1913175202;
      var1 = var10009;
      var290[var10003] = new PotionEffectService.PotionGroup(var10006, var336, StatusEffects.STRENGTH, pulse.Bool.from(var1 + var2 - 2 * (var1 & var2)));
      var2 = 1485782072;
      var1 = 972041106;
      var10003 = (var1 | var2) & ~(var1 & var2);
      var2 = 1635719087;
      var1 = var10003;
      var10003 = var1 & ~var2 | ~var1 & var2;
      var10008 = (int)7339670819374995545L;
      var2 = 1937360223;
      var1 = var10008;
      var10008 = (var1 | var2) - (var1 & var2);
      var2 = -419377305;
      var1 = var10008;
      var10008 = var1 + var2 - 2 * (var1 & var2);
      var10009 = (int)2204252597574019654L;
      var2 = 1356476545;
      var1 = var10009;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var2 = -1397353001;
      var1 = var10009;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var2 = 1373952965;
      var1 = 186481231;
      var10010 = (var1 | var2) - (var1 & var2);
      var2 = 1275013899;
      var1 = var10010;
      var10010 = (var1 | var2) & (~var1 | ~var2);
      var10011 = (int)-8429157628809981733L;
      var2 = -1195168751;
      var1 = var10011;
      var10011 = (var1 | var2) & ~(var1 & var2);
      var2 = 1808795383;
      var1 = var10011;
      var10006 = b(
         "鐄ﱺ鐨ﰃ鐦\uf86f鐌ﱿ鐨ﱴ鐣ﱻ鐫ﱲ鐣", "`ꟳꓺꁡꤐ絺蹙⑿譸㑿s\ua7e8꒱ꁽ꤀絤踅⑳謺㑧~ꞩ꒑ꁴ꤇絣蹌⑼謃㑾\u007f\ua7e3꒝ꁰꤋ絲蹆⑿謥", var10008, var10009, var10010, (var1 | var2) & ~(var1 & var2)
      );
      var2 = 1733935724;
      var1 = -2124250651;
      var10007 = (var1 | var2) - (var1 & var2);
      var2 = -432323704;
      var1 = var10007;
      PotionEffectService.EffectRequirement[] var338 = new PotionEffectService.EffectRequirement[(var1 | var2) - (var1 & var2)];
      var2 = -739338881;
      var1 = -1610779291;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var2 = 1276370970;
      var1 = var10009;
      var10009 = (var1 | var2) & ~(var1 & var2);
      var2 = -714082270;
      var1 = -1776697593;
      var10013 = var1 & ~var2 | ~var1 & var2;
      var2 = 1131824935;
      var1 = var10013;
      var338[var10009] = new PotionEffectService.EffectRequirement(StatusEffects.HEALTH_BOOST, (var1 | var2) - (var1 & var2));
      List var339 = Arrays.asList(var338);
      var2 = 1489758337;
      var1 = -295993052;
      var10009 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1232049755;
      var1 = var10009;
      var290[var10003] = new PotionEffectService.PotionGroup(var10006, var339, StatusEffects.HEALTH_BOOST, pulse.Bool.from((var1 | var2) & (var1 ^ -1 | var2 ^ -1)));
      var10003 = (int)-3954899755485976011L;
      var2 = 1715020879;
      var1 = var10003;
      var10003 = var1 + var2 - 2 * (var1 & var2);
      var2 = 834899580;
      var1 = var10003;
      var10003 = (var1 | var2) - (var1 & var2);
      var2 = 384819834;
      var1 = 862896792;
      var10008 = var1 & ~var2 | ~var1 & var2;
      var2 = -1528974717;
      var1 = var10008;
      var10008 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1245475969;
      var1 = -1299153780;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var2 = 356791044;
      var1 = var10009;
      var10009 = (var1 | var2) & (~var1 | ~var2);
      var2 = -108292600;
      var1 = 1957483139;
      var10010 = var1 & ~var2 | ~var1 & var2;
      var2 = -1910706187;
      var1 = var10010;
      var10010 = (var1 | var2) & ~(var1 & var2);
      var10011 = (int)3052780064919067170L;
      var2 = 563466708;
      var1 = var10011;
      var10011 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1398631872;
      var1 = var10011;
      var10006 = b("鐄ꁱ鐨ꀈ鐦ꑤ鐃ꀅ鑒ꁴ鑒ꁼ鐮ꁴ", "`ꟳꓺꁡꤐ絺蹙⑿譸㑿s\ua7e8꒱ꁽ꤀絤踅⑳謺㑧~ꞩ꒑ꁴ꤇絣蹌⑼謃㑾\u007f\ua7e3꒝ꁰꤋ絲蹆⑿謥", var10008, var10009, var10010, (var1 | var2) & (~var1 | ~var2));
      var2 = 287387809;
      var1 = 868772549;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var2 = 585718373;
      var1 = var10007;
      PotionEffectService.EffectRequirement[] var341 = new PotionEffectService.EffectRequirement[var1 & ~var2 | ~var1 & var2];
      var2 = 895344110;
      var1 = 1129651040;
      var10009 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1980286606;
      var1 = var10009;
      var10009 = (var1 | var2) & (~var1 | ~var2);
      var10013 = (int)7114241890265761952L;
      var2 = 1286292615;
      var1 = var10013;
      var10013 = (var1 | var2) & ~(var1 & var2);
      var2 = 668322852;
      var1 = var10013;
      var341[var10009] = new PotionEffectService.EffectRequirement(StatusEffects.STRENGTH, var1 & ~var2 | ~var1 & var2);
      List var342 = Arrays.asList(var341);
      var2 = 1947066677;
      var1 = -13239415;
      var10009 = (var1 | var2) - (var1 & var2);
      var2 = -1959257412;
      var1 = var10009;
      var290[var10003] = new PotionEffectService.PotionGroup(var10006, var342, StatusEffects.STRENGTH, pulse.Bool.from((var1 | var2) & (var1 & var2 ^ -1)));
      this.b = Arrays.asList(var290);
      this.c = new ArrayList<>();
      this.d = null;
      this.e = 0L;
      var2 = -27058207;
      var1 = -1769410131;
      var10001 = (var1 | var2) - (var1 & var2);
      var2 = 1760292428;
      var1 = var10001;
      this.f = var1 + var2 - 2 * (var1 & var2);
      var10001 = (int)7223954630864052925L;
      var2 = 1404326911;
      var1 = var10001;
      var10001 = (var1 | var2) & ~(var1 & var2);
      var2 = 1032122690;
      var1 = var10001;
      this.h = pulse.Bool.from((var1 | var2) & (~var1 | ~var2));
      var10001 = (int)7317446102305385774L;
      var2 = 1777403328;
      var1 = var10001;
      var10001 = (var1 | var2) & ~(var1 & var2);
      var2 = -1895061266;
      var1 = var10001;
      this.i = pulse.Bool.from(var1 + var2 - 2 * (var1 & var2));
      var2 = 100281576;
      var1 = 1976290286;
      var10001 = (var1 | var2) & ~(var1 & var2);
      var2 = 1882318598;
      var1 = var10001;
      this.j = pulse.Bool.from((var1 | var2) - (var1 & var2));
   }

   @EventHandler
   public void a(ClientTickEvent var1) {
      if (a.player != null && a.world != null) {
         List var2 = this.k();
         int var53;
         if (!var2.isEmpty()) {
            var53 = (int)6082155628931395329L;
            int var33 = 2094262027;
            int var11 = var53;
            var53 = var11 + var33 - 2 * (var11 & var33);
            var33 = -1614100469;
            var11 = var53;
            var53 = (var11 | var33) - (var11 & var33);
         } else {
            var53 = (int)-6651956991154387528L;
            int var35 = -596178464;
            int var13 = var53;
            var53 = var13 + var35 - 2 * (var13 & var35);
            var35 = -312079272;
            var13 = var53;
            var53 = (var13 | var35) - (var13 & var35);
         }

         int var3 = var53;
         if (var3 != 0 && !this.j) {
            int var60 = (int)-4309897486837132600L;
            int var39 = -833303575;
            int var17 = var60;
            var60 = var17 + var39 - 2 * (var17 & var39);
            var39 = -1058170592;
            var17 = var60;
            this.h = pulse.Bool.from(var17 & ~var39 | ~var17 & var39);
         } else if (var3 == 0 && this.j) {
            int var58 = (int)-8881092784468503369L;
            int var37 = 22132098;
            int var15 = var58;
            var58 = var15 & ~var37 | ~var15 & var37;
            var37 = -1523982028;
            var15 = var58;
            this.i = pulse.Bool.from(var15 & ~var37 | ~var15 & var37);
         }

         this.j = pulse.Bool.from(var3);
         this.c = var2;
         if (!this.c.isEmpty()) {
            var53 = this.c.size();
            int var62 = (int)1231321276417373542L;
            int var41 = 1138686057;
            int var19 = var62;
            var62 = (var19 | var41) - (var19 & var41);
            var41 = 383913230;
            var19 = var62;
            if (var53 == ((var19 | var41) & (~var19 | ~var41))) {
               var41 = -871342288;
               var19 = 1711618837;
               var62 = (var19 | var41) & ~(var19 & var41);
               var41 = -1441438683;
               var19 = var62;
               this.f = (var19 | var41) - (var19 & var41);
               var41 = -1557097592;
               var19 = 315567380;
               int var10002 = var19 & ~var41 | ~var19 & var41;
               var41 = -1308639588;
               var19 = var10002;
               this.d = this.c.get((var19 | var41) & ~(var19 & var41));
            } else {
               if (this.f >= this.c.size()) {
                  var62 = (int)-4967444158024155766L;
                  var41 = -1891054675;
                  var19 = var62;
                  var62 = (var19 | var41) & (~var19 | ~var41);
                  var41 = -802572761;
                  var19 = var62;
                  this.f = (var19 | var41) - (var19 & var41);
               }

               long var4 = System.currentTimeMillis();
               if (var4 - this.e >= 1000L) {
                  int var67 = (int)-2841660177958137237L;
                  var41 = -429528028;
                  var19 = var67;
                  var67 = var19 + var41 - 2 * (var19 & var41);
                  var41 = 1577811534;
                  var19 = var67;
                  var41 = (var19 | var41) - (var19 & var41);
                  var19 = this.f;
                  this.f = ((var19 | var41) + (var19 & var41)) % this.c.size();
                  this.e = var4;
               }

               this.d = this.c.get(this.f);
            }
         } else {
            this.d = null;
         }
      } else {
         if (this.j) {
            int var7 = -1802869352;
            int var6 = -475993456;
            int var10001 = var6 & ~var7 | ~var6 & var7;
            var7 = 1999277833;
            var6 = var10001;
            this.i = pulse.Bool.from(var6 + var7 - 2 * (var6 & var7));
            var7 = -436120521;
            var6 = -521300599;
            var10001 = var6 & ~var7 | ~var6 & var7;
            var7 = 116179390;
            var6 = var10001;
            this.j = pulse.Bool.from((var6 | var7) & (~var6 | ~var7));
         }

         this.c.clear();
         this.d = null;
      }
   }

   public boolean d() {
      if (this.h) {
         int var10001 = (int)-2331653854879831240L;
         int var9 = 842003443;
         int var4 = var10001;
         var10001 = (var4 | var9) & (~var4 | ~var9);
         var9 = 43538635;
         var4 = var10001;
         this.h = pulse.Bool.from(var4 + var9 - 2 * (var4 & var9));
         int var13 = (int)-5293495027869702489L;
         var9 = 482433109;
         var4 = var13;
         var13 = var4 + var9 - 2 * (var4 & var9);
         var9 = 1732706035;
         var4 = var13;
         return pulse.Bool.from((var4 | var9) - (var4 & var9));
      } else {
         int var2 = 1710659362;
         int var1 = -218940709;
         int var10000 = (var1 | var2) & (~var1 | ~var2);
         var2 = -1761235463;
         var1 = var10000;
         return pulse.Bool.from((var1 | var2) & (var1 & var2 ^ -1));
      }
   }

   public boolean e() {
      if (this.i) {
         int var10001 = (int)6556162987630030555L;
         int var9 = -634257423;
         int var4 = var10001;
         var10001 = var4 & ~var9 | ~var4 & var9;
         var9 = -1787719382;
         var4 = var10001;
         this.i = pulse.Bool.from((var4 | var9) - (var4 & var9));
         int var13 = (int)6872564253562641418L;
         var9 = 415141128;
         var4 = var13;
         var13 = (var4 | var9) - (var4 & var9);
         var9 = -1390898941;
         var4 = var13;
         return pulse.Bool.from(var4 & (var9 ^ -1) | (var4 ^ -1) & var9);
      } else {
         int var2 = 160828035;
         int var1 = -1898517416;
         int var10000 = var1 + var2 - 2 * (var1 & var2);
         var2 = -2025789733;
         var1 = var10000;
         return pulse.Bool.from((var1 | var2) & (var1 & var2 ^ -1));
      }
   }

   public boolean f() {
      int var10;
      if (!this.c.isEmpty()) {
         var10 = (int)8106065519798582579L;
         int var2 = -1640567544;
         int var1 = var10;
         var10 = (var1 | var2) & (~var1 | ~var2);
         var2 = -409726918;
         var1 = var10;
         var10 = (var1 | var2) & (~var1 | ~var2);
      } else {
         var10 = (int)-742404110998146888L;
         int var7 = -1870314010;
         int var4 = var10;
         var10 = (var4 | var7) - (var4 & var7);
         var7 = 1823421790;
         var4 = var10;
         var10 = (var4 | var7) - (var4 & var7);
      }

      return pulse.Bool.from(var10);
   }

   private List<PotionEffectService.PotionEffectInfo> k() {
      return Collections.emptyList();
   }

   private boolean a(PotionEffectService.PotionGroup var1) {
      return false;
   }

   @Generated
   public List<PotionEffectService.PotionEffectInfo> g() {
      return this.c;
   }

   @Generated
   public PotionEffectService.PotionEffectInfo h() {
      return this.d;
   }

   @Generated
   public boolean i() {
      return this.h;
   }

   @Generated
   public boolean j() {
      return this.i;
   }

   public static String b(String var0, String var1, int var2, int var3, int var4, int var5) {
      char[] var6 = var1.toCharArray();
      char[] var7 = new char[var6.length];
      int var18 = -1346542740;
      int var17 = -1014664984;
      int var10000 = (var17 | var18) & ~(var17 & var18);
      var18 = 1815614350;
      var17 = var10000;
      char[] var219 = new char[(var17 | var18) & ~(var17 & var18)];
      var18 = -173599605;
      var17 = -2114267051;
      int var10002 = (var17 | var18) - (var17 & var18);
      var18 = 1952304350;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      int var10003 = (int)6725245146709699159L;
      var18 = 1719374713;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1534521628;
      var17 = var10003;
      var219[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var10002 = (int)-3391728067633788428L;
      var18 = -534162385;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 165551578;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var10003 = (int)-2899619544029539629L;
      var18 = -1207689028;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -1907174934;
      var17 = var10003;
      var219[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var10002 = (int)-4658311605867750863L;
      var18 = -1792492914;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -502996803;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var10003 = (int)-4153244999629829506L;
      var18 = 1083782156;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 998022644;
      var17 = var10003;
      var219[var10002] = (char)((var17 | var18) - (var17 & var18));
      var10002 = (int)-8105354632857689470L;
      var18 = -865558894;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 94108691;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -2069904577;
      var17 = -1452443151;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 770843357;
      var17 = var10003;
      var219[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var10002 = (int)-4195568456074285222L;
      var18 = -518749421;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 30354509;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -466066099;
      var17 = -1974820953;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 1852992463;
      var17 = var10003;
      var219[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var10002 = (int)5128036349016184743L;
      var18 = -669252395;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 175805303;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -1136289705;
      var17 = -1365830277;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 315803822;
      var17 = var10003;
      var219[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var18 = -644093264;
      var17 = 518713428;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -948888862;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var10003 = (int)5131643364720345095L;
      var18 = -230129676;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 1852700384;
      var17 = var10003;
      var219[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var18 = 564091232;
      var17 = -1932248599;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1387569010;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)-3464862746916945414L;
      var18 = 1094490739;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 934588331;
      var17 = var10003;
      var219[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var18 = 1985193585;
      var17 = 51265300;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 1969068397;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 1058435683;
      var17 = -1829046469;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1377006325;
      var17 = var10003;
      var219[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var10002 = (int)1213959622507596896L;
      var18 = -601586735;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1692463176;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 291878116;
      var17 = 1017118345;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 771378505;
      var17 = var10003;
      var219[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      char[] var8 = var219;
      var18 = 1496391577;
      var17 = 1099694679;
      var10000 = var17 + var18 - 2 * (var17 & var18);
      var18 = 415047108;
      var17 = var10000;
      char[] var221 = new char[(var17 | var18) - (var17 & var18)];
      var10002 = (int)6040063103543826130L;
      var18 = 1972325460;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1847794310;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)-5711683870147342389L;
      var18 = -1193236172;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -1838485793;
      var17 = var10003;
      var221[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var10002 = (int)-7277984383479706386L;
      var18 = -773808943;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -1405448130;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -1895056153;
      var17 = -280459721;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 1615052499;
      var17 = var10003;
      var221[var10002] = (char)((var17 | var18) - (var17 & var18));
      var18 = 75274327;
      var17 = 264466239;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 197130090;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var10003 = (int)651330029764270475L;
      var18 = -465526445;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -337313909;
      var17 = var10003;
      var221[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var10002 = (int)-5273373048393255640L;
      var18 = -656893334;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 851324737;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)-3982069540442834695L;
      var18 = -1507984154;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1964882973;
      var17 = var10003;
      var221[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var10002 = (int)-4236969679647770652L;
      var18 = -565291790;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -2043665646;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)2723037995043612937L;
      var18 = -608221207;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -808970592;
      var17 = var10003;
      var221[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var10002 = (int)-6371288346358472236L;
      var18 = 1709428295;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 206860182;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1867124532;
      var17 = -1404492689;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1023208503;
      var17 = var10003;
      var221[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var10002 = (int)-4816104007226388391L;
      var18 = 44607972;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 356989371;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)-8245972121259186038L;
      var18 = 927299906;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 1138202353;
      var17 = var10003;
      var221[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var18 = 1888865145;
      var17 = -1402001540;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -587535358;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var10003 = (int)3495299254703024397L;
      var18 = 801741754;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 327901839;
      var17 = var10003;
      var221[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var18 = 53568334;
      var17 = -1937409841;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1884021879;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 1164991567;
      var17 = -1606191197;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -449599256;
      var17 = var10003;
      var221[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var10002 = (int)8892360139437901455L;
      var18 = 2138041104;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1587155562;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -1536094987;
      var17 = -1219028498;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 321267240;
      var17 = var10003;
      var221[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      char[] var9 = var221;
      var18 = -1660083565;
      var17 = -89887286;
      var10000 = (var17 | var18) - (var17 & var18);
      var18 = 1739149145;
      var17 = var10000;

      for (int var10 = (var17 | var18) & (~var17 | ~var18); var10 < var6.length; var10++) {
         char var280 = var6[var10];
         char var205 = var8[var10 % var8.length];
         char var106 = var280;
         var7[var10] = (char)((var106 | var205) & ~(var106 & var205));
      }

      char[] var19 = new char[var7.length];
      var10000 = (int)6875543409930565710L;
      var18 = -1905364974;
      var17 = var10000;
      var10000 = (var17 | var18) & ~(var17 & var18);
      var18 = 350095452;
      var17 = var10000;

      for (int var11 = (var17 | var18) - (var17 & var18); var11 < var6.length; var11++) {
         char var281 = var7[var11];
         char var208 = var9[var11 % var9.length];
         char var109 = var281;
         var19[var11] = (char)((var109 | var208) & ~(var109 & var208));
      }

      String var20 = new String(var19);
      int var12 = var20.hashCode();
      var18 = var5;
      var17 = var3;
      var10000 = (var17 ^ var18) - 2 * (~var17 & var18);
      var18 = var2;
      var17 = var10000;
      int var13 = (var17 & ~var18) - (~var17 & var18);
      char[] var14 = var0.toCharArray();
      char[] var15 = new char[var14.length];
      var18 = -760850363;
      var17 = 1225434753;
      var10000 = (var17 | var18) - (var17 & var18);
      var18 = -1683161404;
      var17 = var10000;

      for (int var16 = (var17 | var18) - (var17 & var18); var16 < var15.length; var16++) {
         int var10001 = (int)-822852286288210551L;
         var18 = -882192571;
         var17 = var10001;
         var10001 = (var17 | var18) - (var17 & var18);
         var18 = 1179032270;
         var17 = var10001;
         switch (var16 % (var17 & ~var18 | ~var17 & var18)) {
            case 0:
               var18 = var12;
               var17 = var13;
               var10002 = (var17 | var18) & (~var17 | ~var18);
               char var218 = var14[var16];
               var17 = var10002;
               var15[var16] = (char)((var17 | var218) & (~var17 | ~var218));
               break;
            case 1:
               var18 = var13;
               var17 = var5;
               var10002 = (var17 | var18) & ~(var17 & var18);
               char var216 = var14[var16];
               var17 = var10002;
               var15[var16] = (char)((var17 | var216) & ~(var17 & var216));
         }
      }

      return new String(var15);
   }

   public static class PotionEffectInfo {
      private final String a;
      private final Item b;
      private final RegistryEntry<StatusEffect> c;
      private final boolean d;
      private final int e;
      private final String f;
      private final String g;
      private final boolean h;

      public PotionEffectInfo(String var1, Item var2, int var3, boolean var4) {
         this.a = var1;
         this.b = var2;
         this.c = null;
         int var8 = 2145715302;
         int var7 = 650955023;
         int var10001 = (var7 | var8) & ~(var7 & var8);
         var8 = 1495911785;
         var7 = var10001;
         this.d = pulse.Bool.from(var7 + var8 - 2 * (var7 & var8));
         this.e = var3;
         this.h = var4;
         var8 = 166807273;
         var7 = 361170368;
         int var10002 = var7 + var8 - 2 * (var7 & var8);
         var8 = 477512509;
         var7 = var10002;
         this.f = a(var3 / ((var7 | var8) - (var7 & var8)));
         String var6 = this.f;
         String var5 = var1;
         StringBuilder var31 = new StringBuilder().append(var5);
         var8 = 610463367;
         var7 = -1930794222;
         int var10004 = var7 + var8 - 2 * (var7 & var8);
         var8 = -596930072;
         var7 = var10004;
         var10004 = var7 & ~var8 | ~var7 & var8;
         var8 = -1795444225;
         var7 = 725760186;
         int var10005 = var7 & ~var8 | ~var7 & var8;
         var8 = 1592831777;
         var7 = var10005;
         var10005 = var7 & ~var8 | ~var7 & var8;
         int var10006 = (int)-6513055052135152545L;
         var8 = -905233629;
         var7 = var10006;
         var10006 = (var7 | var8) - (var7 & var8);
         var8 = -760557794;
         var7 = var10006;
         var10006 = var7 + var8 - 2 * (var7 & var8);
         int var10007 = (int)-4810718455442983848L;
         var8 = 1069285624;
         var7 = var10007;
         var10007 = var7 & ~var8 | ~var7 & var8;
         var8 = -1420575787;
         var7 = var10007;
         this.g = var31.append(
               a(
                  "ᘯरሿऽሱऺቈिቍॆቀധቈल\u124fलሸഽᘯ",
                  "`ꟳꓺꁡꤐ絺蹙⑿譸㑿s\ua7e8꒱ꁽ꤀絤踅⑳謺㑧~ꞩ꒑ꁴ꤇絣蹌⑼謃㑾\u007f\ua7e3꒝ꁰꤋ絲蹆⑿謥㐳S\ua7e5꒡ꁸꤓ絳蹮⑿謵㑢t\ua7e0",
                  var10004,
                  var10005,
                  var10006,
                  (var7 | var8) & (~var7 | ~var8)
               )
            )
            .append(var6)
            .toString();
      }

      public PotionEffectInfo(String var1, RegistryEntry<StatusEffect> var2, int var3, boolean var4) {
         this.a = var1;
         this.b = null;
         this.c = var2;
         int var10001 = (int)5973971787129230053L;
         int var8 = -1736110002;
         int var7 = var10001;
         var10001 = (var7 | var8) & (~var7 | ~var8);
         var8 = -963771734;
         var7 = var10001;
         this.d = pulse.Bool.from((var7 | var8) & ~(var7 & var8));
         this.e = var3;
         this.h = var4;
         var8 = -454524979;
         var7 = 748147752;
         int var10002 = (var7 | var8) & (~var7 | ~var8);
         var8 = -931157007;
         var7 = var10002;
         this.f = a(var3 / ((var7 | var8) & (~var7 | ~var8)));
         String var6 = this.f;
         String var5 = var1;
         StringBuilder var32 = new StringBuilder().append(var5);
         var8 = 2046703766;
         var7 = 1527257494;
         int var10004 = var7 & ~var8 | ~var7 & var8;
         var8 = 1444230525;
         var7 = var10004;
         var10004 = (var7 | var8) & (~var7 | ~var8);
         var8 = -182495407;
         var7 = 937237221;
         int var10005 = (var7 | var8) & (~var7 | ~var8);
         var8 = 597084794;
         var7 = var10005;
         var10005 = (var7 | var8) - (var7 & var8);
         var8 = 389523087;
         var7 = -1939309126;
         int var10006 = (var7 | var8) - (var7 & var8);
         var8 = -1152972751;
         var7 = var10006;
         var10006 = var7 + var8 - 2 * (var7 & var8);
         int var10007 = (int)-8270984586286465332L;
         var8 = -950665714;
         var7 = var10007;
         var10007 = (var7 | var8) - (var7 & var8);
         var8 = -655396835;
         var7 = var10007;
         this.g = var32.append(
               a(
                  "ᘯ皚ሿ皗ሱ皐ቈ皕ቍ盬ቀ犍ቈ皘\u124f皘ሸ犗ᘯ",
                  "`ꟳꓺꁡꤐ絺蹙⑿譸㑿s\ua7e8꒱ꁽ꤀絤踅⑳謺㑧~ꞩ꒑ꁴ꤇絣蹌⑼謃㑾\u007f\ua7e3꒝ꁰꤋ絲蹆⑿謥㐳S\ua7e5꒡ꁸꤓ絳蹮⑿謵㑢t\ua7e0",
                  var10004,
                  var10005,
                  var10006,
                  (var7 | var8) & (~var7 | ~var8)
               )
            )
            .append(var6)
            .toString();
      }

      private static String a(int var0) {
         int var10001 = (int)-5152486244953058827L;
         int var8 = 276495048;
         int var7 = var10001;
         var10001 = (var7 | var8) & ~(var7 & var8);
         var8 = 990276353;
         var7 = var10001;
         if (var0 < var7 + var8 - 2 * (var7 & var8)) {
            int var3 = var0;
            StringBuilder var85 = new StringBuilder().append(var3);
            var8 = 13441725;
            var7 = -909872836;
            int var98 = var7 + var8 - 2 * (var7 & var8);
            var8 = -1108705284;
            var7 = var98;
            var98 = (var7 | var8) & ~(var7 & var8);
            int var107 = (int)4354370232884792067L;
            var8 = 2016071026;
            var7 = var107;
            var107 = (var7 | var8) & ~(var7 & var8);
            var8 = -137070573;
            var7 = var107;
            var107 = (var7 | var8) & ~(var7 & var8);
            int var117 = (int)-7402970215081260971L;
            var8 = -45590561;
            var7 = var117;
            var117 = var7 & ~var8 | ~var7 & var8;
            var8 = 1051145925;
            var7 = var117;
            var117 = (var7 | var8) - (var7 & var8);
            var8 = -52788279;
            var7 = -1298615008;
            int var125 = (var7 | var8) - (var7 & var8);
            var8 = 1315866728;
            var7 = var125;
            return var85.append(
                  a(
                     "ﭘ",
                     "`ꟳꓺꁡꤐ絺蹙⑿譸㑿s\ua7e8꒱ꁽ꤀絤踅⑳謺㑧~ꞩ꒑ꁴ꤇絣蹌⑼謃㑾\u007f\ua7e3꒝ꁰꤋ絲蹆⑿謥㐳S\ua7e5꒡ꁸꤓ絳蹮⑿謵㑢t\ua7e0",
                     var98,
                     var107,
                     var117,
                     (var7 | var8) & (~var7 | ~var8)
                  )
               )
               .toString();
         } else {
            var10001 = (int)-5474122773615828736L;
            var8 = -1526727457;
            var7 = var10001;
            var10001 = var7 + var8 - 2 * (var7 & var8);
            var8 = -1992335901;
            var7 = var10001;
            int var1 = var0 / ((var7 | var8) & (~var7 | ~var8));
            var10001 = (int)2063867993119867130L;
            var8 = -1817786407;
            var7 = var10001;
            var10001 = (var7 | var8) & (~var7 | ~var8);
            var8 = -762083553;
            var7 = var10001;
            int var2 = var0 % (var7 & ~var8 | ~var7 & var8);
            if (var2 == 0) {
               int var4 = var1;
               StringBuilder var84 = new StringBuilder().append(var4);
               int var95 = (int)-2037674977265052327L;
               var8 = 1162829890;
               var7 = var95;
               var95 = (var7 | var8) & ~(var7 & var8);
               var8 = 1304846694;
               var7 = var95;
               var95 = (var7 | var8) & ~(var7 & var8);
               int var104 = (int)-2144822737552215666L;
               var8 = 1257753250;
               var7 = var104;
               var104 = (var7 | var8) - (var7 & var8);
               var8 = -1131394932;
               var7 = var104;
               var104 = var7 & ~var8 | ~var7 & var8;
               int var114 = (int)1834994802361765739L;
               var8 = -168810461;
               var7 = var114;
               var114 = (var7 | var8) & ~(var7 & var8);
               var8 = 232804771;
               var7 = var114;
               var114 = (var7 | var8) & (~var7 | ~var8);
               int var123 = (int)5724301717414604316L;
               var8 = -327557460;
               var7 = var123;
               var123 = var7 + var8 - 2 * (var7 & var8);
               var8 = -1175633137;
               var7 = var123;
               return var84.append(
                     a(
                        "ﬥ",
                        "`ꟳꓺꁡꤐ絺蹙⑿譸㑿s\ua7e8꒱ꁽ꤀絤踅⑳謺㑧~ꞩ꒑ꁴ꤇絣蹌⑼謃㑾\u007f\ua7e3꒝ꁰꤋ絲蹆⑿謥㐳S\ua7e5꒡ꁸꤓ絳蹮⑿謵㑢t\ua7e0",
                        var95,
                        var104,
                        var114,
                        (var7 | var8) - (var7 & var8)
                     )
                  )
                  .toString();
            } else {
               int var6 = var2;
               int var5 = var1;
               StringBuilder var10000 = new StringBuilder().append(var5);
               var8 = 1594225210;
               var7 = -1816461110;
               int var10003 = (var7 | var8) & (~var7 | ~var8);
               var8 = -1201805683;
               var7 = var10003;
               var10003 = (var7 | var8) - (var7 & var8);
               int var10004 = (int)-1987629735551424193L;
               var8 = 252621224;
               var7 = var10004;
               var10004 = (var7 | var8) & ~(var7 & var8);
               var8 = -733952790;
               var7 = var10004;
               var10004 = var7 & ~var8 | ~var7 & var8;
               var8 = 233014308;
               var7 = -565156522;
               int var10005 = var7 + var8 - 2 * (var7 & var8);
               var8 = -880640225;
               var7 = var10005;
               var10005 = (var7 | var8) - (var7 & var8);
               int var10006 = (int)4683612520234930847L;
               var8 = 270980484;
               var7 = var10006;
               var10006 = var7 & ~var8 | ~var7 & var8;
               var8 = -1509926009;
               var7 = var10006;
               var10000 = var10000.append(
                     a(
                        "ﬥ럘",
                        "`ꟳꓺꁡꤐ絺蹙⑿譸㑿s\ua7e8꒱ꁽ꤀絤踅⑳謺㑧~ꞩ꒑ꁴ꤇絣蹌⑼謃㑾\u007f\ua7e3꒝ꁰꤋ絲蹆⑿謥㐳S\ua7e5꒡ꁸꤓ絳蹮⑿謵㑢t\ua7e0",
                        var10003,
                        var10004,
                        var10005,
                        var7 & ~var8 | ~var7 & var8
                     )
                  )
                  .append(var6);
               var10003 = (int)2454677198216786275L;
               var8 = 1229407358;
               var7 = var10003;
               var10003 = (var7 | var8) & ~(var7 & var8);
               var8 = 944906592;
               var7 = var10003;
               var10003 = (var7 | var8) & ~(var7 & var8);
               var8 = 192589224;
               var7 = -346860872;
               var10004 = (var7 | var8) & (~var7 | ~var8);
               var8 = 1749146589;
               var7 = var10004;
               var10004 = var7 + var8 - 2 * (var7 & var8);
               var10005 = (int)-61586840468036500L;
               var8 = -1772630738;
               var7 = var10005;
               var10005 = var7 + var8 - 2 * (var7 & var8);
               var8 = -37401147;
               var7 = var10005;
               var10005 = (var7 | var8) & (~var7 | ~var8);
               var10006 = (int)-9063628077490125627L;
               var8 = 1781564271;
               var7 = var10006;
               var10006 = (var7 | var8) - (var7 & var8);
               var8 = -1963367610;
               var7 = var10006;
               return var10000.append(
                     a(
                        "ﭘ",
                        "`ꟳꓺꁡꤐ絺蹙⑿譸㑿s\ua7e8꒱ꁽ꤀絤踅⑳謺㑧~ꞩ꒑ꁴ꤇絣蹌⑼謃㑾\u007f\ua7e3꒝ꁰꤋ絲蹆⑿謥㐳S\ua7e5꒡ꁸꤓ絳蹮⑿謵㑢t\ua7e0",
                        var10003,
                        var10004,
                        var10005,
                        var7 & ~var8 | ~var7 & var8
                     )
                  )
                  .toString();
            }
         }
      }

      @Generated
      public String a() {
         return this.a;
      }

      @Generated
      public Item b() {
         return this.b;
      }

      @Generated
      public RegistryEntry<StatusEffect> c() {
         return this.c;
      }

      @Generated
      public boolean d() {
         return this.d;
      }

      @Generated
      public int e() {
         return this.e;
      }

      @Generated
      public String f() {
         return this.f;
      }

      @Generated
      public String g() {
         return this.g;
      }

      @Generated
      public boolean h() {
         return this.h;
      }

      public static String a(String var0, String var1, int var2, int var3, int var4, int var5) {
         char[] var6 = var1.toCharArray();
         char[] var7 = new char[var6.length];
         int var10000 = (int)911908168645388804L;
         int var18 = -236200925;
         int var17 = var10000;
         var10000 = var17 + var18 - 2 * (var17 & var18);
         var18 = 705263149;
         var17 = var10000;
         char[] var220 = new char[(var17 | var18) - (var17 & var18)];
         var18 = -193504566;
         var17 = 363704363;
         int var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = -505746719;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         int var10003 = (int)-2144174628476488334L;
         var18 = 2140393402;
         var17 = var10003;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = 1523806970;
         var17 = var10003;
         var220[var10002] = (char)((var17 | var18) - (var17 & var18));
         var18 = 1583544941;
         var17 = -526626841;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = -1090603637;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = -48829387;
         var17 = 1486092377;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = -1517996055;
         var17 = var10003;
         var220[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var10002 = (int)-6377872862451373077L;
         var18 = 1851681705;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = 614793280;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = -992102072;
         var17 = 1567578991;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = -1716338271;
         var17 = var10003;
         var220[var10002] = (char)((var17 | var18) - (var17 & var18));
         var18 = 785371901;
         var17 = -1464670248;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = -2038614746;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = 464848716;
         var17 = -1411586998;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = -1335264491;
         var17 = var10003;
         var220[var10002] = (char)((var17 | var18) & ~(var17 & var18));
         var18 = 1027827883;
         var17 = -1674597651;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = -1586707902;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var10003 = (int)-747422550129213381L;
         var18 = 1983316366;
         var17 = var10003;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = -463925104;
         var17 = var10003;
         var220[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var10002 = (int)4258041885738378520L;
         var18 = -1741308701;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = 1847466494;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = -1993759869;
         var17 = 1168876668;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = -863878531;
         var17 = var10003;
         var220[var10002] = (char)((var17 | var18) & ~(var17 & var18));
         var10002 = (int)-4565014168977809183L;
         var18 = -1949050110;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = 882916325;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var10003 = (int)1163167877256341609L;
         var18 = -342457947;
         var17 = var10003;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = 1637146847;
         var17 = var10003;
         var220[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var10002 = (int)6342038925006743532L;
         var18 = -1833801280;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = 1846038059;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var10003 = (int)4275067355951691601L;
         var18 = -1557131100;
         var17 = var10003;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = -2056367145;
         var17 = var10003;
         var220[var10002] = (char)((var17 | var18) - (var17 & var18));
         var10002 = (int)-4211830023802176309L;
         var18 = -651656642;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = 1104854781;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = 627115312;
         var17 = -132625421;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = -579254640;
         var17 = var10003;
         var220[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var18 = 704438668;
         var17 = -1300970925;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = -1685576746;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = -1666282190;
         var17 = 1876963237;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = -212949581;
         var17 = var10003;
         var220[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         char[] var8 = var220;
         var10000 = (int)8475948501605681766L;
         var18 = 1714859179;
         var17 = var10000;
         var10000 = var17 + var18 - 2 * (var17 & var18);
         var18 = 1384163015;
         var17 = var10000;
         char[] var223 = new char[var17 + var18 - 2 * (var17 & var18)];
         var18 = -852537420;
         var17 = 631389251;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = -393382921;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var10003 = (int)-6239103331801285357L;
         var18 = -2055359529;
         var17 = var10003;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = -361052444;
         var17 = var10003;
         var223[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var10002 = (int)-8022848106648025985L;
         var18 = 1840341397;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = 166012395;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var10003 = (int)-8450801290980470476L;
         var18 = 748875132;
         var17 = var10003;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = 722483275;
         var17 = var10003;
         var223[var10002] = (char)((var17 | var18) & ~(var17 & var18));
         var18 = 659946629;
         var17 = -15967407;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = -665212970;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var10003 = (int)-606276028882233930L;
         var18 = 957392977;
         var17 = var10003;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = -810288460;
         var17 = var10003;
         var223[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var10002 = (int)-8202240758872593471L;
         var18 = -1493024408;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = 304704170;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var10003 = (int)-1861608652097759408L;
         var18 = 1885560917;
         var17 = var10003;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = 1015549703;
         var17 = var10003;
         var223[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var18 = -1204854763;
         var17 = -238666774;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = 1240030203;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = 1151749729;
         var17 = -231115605;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = -1231093110;
         var17 = var10003;
         var223[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         var10002 = (int)-1232545308864846889L;
         var18 = 1148364777;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = 603702331;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = -2023199558;
         var17 = -81581127;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = 2085322647;
         var17 = var10003;
         var223[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var18 = 612030813;
         var17 = 1222684472;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = 1822062179;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var10003 = (int)8674657262252813868L;
         var18 = -134760843;
         var17 = var10003;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = 790650720;
         var17 = var10003;
         var223[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var10002 = (int)-7153594763191185139L;
         var18 = 2133671607;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = -1480052803;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var10003 = (int)1692362717343638101L;
         var18 = 1047923320;
         var17 = var10003;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = -132646891;
         var17 = var10003;
         var223[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         var18 = -626018340;
         var17 = -347354232;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = 837057628;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = -754923353;
         var17 = -1495094660;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = 1977803231;
         var17 = var10003;
         var223[var10002] = (char)((var17 | var18) & ~(var17 & var18));
         var10002 = (int)4017188024801482113L;
         var18 = -1909578840;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = -267323872;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var10003 = (int)-2830289239272638446L;
         var18 = -1825388151;
         var17 = var10003;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = 582599336;
         var17 = var10003;
         var223[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         char[] var9 = var223;
         var10000 = (int)3979509590879970204L;
         var18 = 18926203;
         var17 = var10000;
         var10000 = var17 + var18 - 2 * (var17 & var18);
         var18 = 2039081447;
         var17 = var10000;

         for (int var10 = var17 + var18 - 2 * (var17 & var18); var10 < var6.length; var10++) {
            char var280 = var6[var10];
            char var205 = var8[var10 % var8.length];
            char var106 = var280;
            var7[var10] = (char)((var106 | var205) - (var106 & var205));
         }

         char[] var19 = new char[var7.length];
         var18 = 469042988;
         var17 = -580635443;
         var10000 = (var17 | var18) & (~var17 | ~var18);
         var18 = -963562527;
         var17 = var10000;

         for (int var11 = (var17 | var18) - (var17 & var18); var11 < var6.length; var11++) {
            char var281 = var7[var11];
            char var208 = var9[var11 % var9.length];
            char var109 = var281;
            var19[var11] = (char)((var109 | var208) & (~var109 | ~var208));
         }

         String var20 = new String(var19);
         int var12 = var20.hashCode();
         var18 = var5;
         var17 = var3;
         var10000 = (var17 ^ var18) - 2 * (~var17 & var18);
         var18 = var2;
         var17 = var10000;
         int var13 = 2 * (var17 & ~var18) - (var17 ^ var18);
         char[] var14 = var0.toCharArray();
         char[] var15 = new char[var14.length];
         var10000 = (int)-232187983319190333L;
         var18 = 2096912305;
         var17 = var10000;
         var10000 = var17 + var18 - 2 * (var17 & var18);
         var18 = 433677170;
         var17 = var10000;

         for (int var16 = (var17 | var18) & ~(var17 & var18); var16 < var15.length; var16++) {
            int var10001 = (int)-3529617107016537874L;
            var18 = -330494449;
            var17 = var10001;
            var10001 = (var17 | var18) & (~var17 | ~var18);
            var18 = -210884893;
            var17 = var10001;
            switch (var16 % ((var17 | var18) & (~var17 | ~var18))) {
               case 0:
                  var18 = var12;
                  var17 = var13;
                  var10002 = (var17 | var18) & ~(var17 & var18);
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
                  var15[var16] = (char)((var17 | var216) & ~(var17 & var216));
            }
         }

         return new String(var15);
      }
   }

   private static class PotionGroup {
      final String a;
      final List<PotionEffectService.EffectRequirement> b;
      final RegistryEntry<StatusEffect> c;
      final boolean d;
      boolean e;

      PotionGroup(String var1, List<PotionEffectService.EffectRequirement> var2, RegistryEntry<StatusEffect> var3, boolean var4) {
         int var10001 = (int)-7552521836351443870L;
         int var6 = 1185398941;
         int var5 = var10001;
         var10001 = (var5 | var6) - (var5 & var6);
         var6 = -414978817;
         var5 = var10001;
         this.e = pulse.Bool.from(var5 + var6 - 2 * (var5 & var6));
         this.a = var1;
         this.b = var2;
         this.c = var3;
         this.d = var4;
      }

      public static String a(String var0, String var1, int var2, int var3, int var4, int var5) {
         char[] var6 = var1.toCharArray();
         char[] var7 = new char[var6.length];
         int var10000 = (int)-6313374854522112358L;
         int var18 = -597788595;
         int var17 = var10000;
         var10000 = (var17 | var18) - (var17 & var18);
         var18 = 571281117;
         var17 = var10000;
         char[] var220 = new char[var17 & ~var18 | ~var17 & var18];
         int var10002 = (int)4949294271620367392L;
         var18 = 2095772895;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = -1742458625;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         int var10003 = (int)-3691733556033867339L;
         var18 = 231823009;
         var17 = var10003;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = -18403546;
         var17 = var10003;
         var220[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var18 = -875752309;
         var17 = 1199686667;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = -1941122943;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var10003 = (int)3299582607206567620L;
         var18 = 809618437;
         var17 = var10003;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = 165355844;
         var17 = var10003;
         var220[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var18 = -29086358;
         var17 = 872843119;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = -901600761;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var10003 = (int)6980380873369794851L;
         var18 = 1553965724;
         var17 = var10003;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = -289621959;
         var17 = var10003;
         var220[var10002] = (char)((var17 | var18) & ~(var17 & var18));
         var18 = 534143320;
         var17 = -1095449784;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = -1587371501;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var10003 = (int)-4296526105774286838L;
         var18 = 2083246790;
         var17 = var10003;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = 755684063;
         var17 = var10003;
         var220[var10002] = (char)((var17 | var18) & ~(var17 & var18));
         var10002 = (int)-2745684349776486481L;
         var18 = -445480416;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = 2001444235;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = -1070448236;
         var17 = 247739117;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = -822680996;
         var17 = var10003;
         var220[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         var10002 = (int)-6851905784127075669L;
         var18 = 712663668;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = 752036058;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = 2035776899;
         var17 = -1059995700;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = -1182365747;
         var17 = var10003;
         var220[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var10002 = (int)7846446609303421658L;
         var18 = -613649431;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = -1409994443;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = 520389906;
         var17 = -1444602088;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = -1226730727;
         var17 = var10003;
         var220[var10002] = (char)((var17 | var18) - (var17 & var18));
         var10002 = (int)-1685220258616401886L;
         var18 = -1647158182;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = -516752257;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var10003 = (int)-4225604450328531894L;
         var18 = -1230017950;
         var17 = var10003;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = -1233849846;
         var17 = var10003;
         var220[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         var18 = -1278439418;
         var17 = 928513146;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = -2070188940;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var10003 = (int)7591432908649221874L;
         var18 = 987047906;
         var17 = var10003;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = 1525309763;
         var17 = var10003;
         var220[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         var10002 = (int)2997867600251784338L;
         var18 = 370192588;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = -491144105;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var10003 = (int)358948752789407543L;
         var18 = -1610152187;
         var17 = var10003;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = -2037250282;
         var17 = var10003;
         var220[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         char[] var8 = var220;
         var18 = -456461699;
         var17 = 2057258498;
         var10000 = (var17 | var18) - (var17 & var18);
         var18 = -1638550411;
         var17 = var10000;
         char[] var222 = new char[(var17 | var18) & (~var17 | ~var18)];
         var18 = -715343168;
         var17 = -1218277834;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = 1648243958;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = 793798598;
         var17 = 1254322951;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = 1704156385;
         var17 = var10003;
         var222[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         var10002 = (int)-4569228820271808772L;
         var18 = 934348851;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = -242633010;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = -1736419177;
         var17 = -1602916425;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = 955626275;
         var17 = var10003;
         var222[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var18 = -1437626486;
         var17 = -948079703;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = 1832057889;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = -359341398;
         var17 = 1404789807;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = -1188101674;
         var17 = var10003;
         var222[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         var18 = 53599920;
         var17 = -714911482;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = -699232331;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = 1518181240;
         var17 = -1656167122;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = -952809900;
         var17 = var10003;
         var222[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         var18 = -369443669;
         var17 = 737876858;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = -1040078891;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = 366129123;
         var17 = 269811060;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = 96889559;
         var17 = var10003;
         var222[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var10002 = (int)-132061906397710537L;
         var18 = 1309182501;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = 449133847;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = -737747556;
         var17 = 1984801182;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = -1572123498;
         var17 = var10003;
         var222[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var18 = 392640719;
         var17 = -1200359309;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = -1357594438;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = -534594431;
         var17 = -1922967536;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = 1833165736;
         var17 = var10003;
         var222[var10002] = (char)((var17 | var18) - (var17 & var18));
         var10002 = (int)-7146587881624651632L;
         var18 = -29991977;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = 1771103040;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = 1412035842;
         var17 = -1957338926;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = -545487384;
         var17 = var10003;
         var222[var10002] = (char)((var17 | var18) & ~(var17 & var18));
         var10002 = (int)-4949282476093375264L;
         var18 = -1262646735;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = -1008797991;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var10003 = (int)-134895925992039510L;
         var18 = 580046522;
         var17 = var10003;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = -1693805036;
         var17 = var10003;
         var222[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         var18 = -265499065;
         var17 = 715636624;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = -628395554;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var10003 = (int)2008474963158483208L;
         var18 = -160507697;
         var17 = var10003;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = -1724044556;
         var17 = var10003;
         var222[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         char[] var9 = var222;
         var18 = 1471676095;
         var17 = -394766541;
         var10000 = var17 & ~var18 | ~var17 & var18;
         var18 = -1076909684;
         var17 = var10000;

         for (int var10 = (var17 | var18) & ~(var17 & var18); var10 < var6.length; var10++) {
            char var278 = var6[var10];
            char var205 = var8[var10 % var8.length];
            char var106 = var278;
            var7[var10] = (char)(var106 + var205 - 2 * (var106 & var205));
         }

         char[] var19 = new char[var7.length];
         var10000 = (int)1660362845928031320L;
         var18 = 363528243;
         var17 = var10000;
         var10000 = (var17 | var18) - (var17 & var18);
         var18 = 140969067;
         var17 = var10000;

         for (int var11 = (var17 | var18) & ~(var17 & var18); var11 < var6.length; var11++) {
            char var279 = var7[var11];
            char var208 = var9[var11 % var9.length];
            char var109 = var279;
            var19[var11] = (char)((var109 | var208) & ~(var109 & var208));
         }

         String var20 = new String(var19);
         int var12 = var20.hashCode();
         var18 = var5;
         var17 = var3;
         var10000 = 2 * (var17 & ~var18) - (var17 ^ var18);
         var18 = var2;
         var17 = var10000;
         int var13 = var17 - var18;
         char[] var14 = var0.toCharArray();
         char[] var15 = new char[var14.length];
         var10000 = (int)-1690233152723380411L;
         var18 = -533899345;
         var17 = var10000;
         var10000 = var17 & ~var18 | ~var17 & var18;
         var18 = -1065828118;
         var17 = var10000;

         for (int var16 = var17 & ~var18 | ~var17 & var18; var16 < var15.length; var16++) {
            var18 = 175745855;
            var17 = 2056029154;
            int var10001 = (var17 | var18) - (var17 & var18);
            var18 = 1895114975;
            var17 = var10001;
            switch (var16 % ((var17 | var18) - (var17 & var18))) {
               case 0:
                  var18 = var12;
                  var17 = var13;
                  var10002 = (var17 | var18) & ~(var17 & var18);
                  char var218 = var14[var16];
                  var17 = var10002;
                  var15[var16] = (char)(var17 + var218 - 2 * (var17 & var218));
                  break;
               case 1:
                  var18 = var13;
                  var17 = var5;
                  var10002 = var17 + var18 - 2 * (var17 & var18);
                  char var216 = var14[var16];
                  var17 = var10002;
                  var15[var16] = (char)((var17 | var216) & (~var17 | ~var216));
            }
         }

         return new String(var15);
      }
   }

   private static class EffectRequirement {
      final RegistryEntry<StatusEffect> a;
      final int b;

      EffectRequirement(RegistryEntry<StatusEffect> var1, int var2) {
         this.a = var1;
         this.b = var2;
      }

      public static String a(String var0, String var1, int var2, int var3, int var4, int var5) {
         char[] var6 = var1.toCharArray();
         char[] var7 = new char[var6.length];
         int var10000 = (int)-5121104844542420842L;
         int var18 = 690249309;
         int var17 = var10000;
         var10000 = var17 & ~var18 | ~var17 & var18;
         var18 = -90175807;
         var17 = var10000;
         char[] var220 = new char[(var17 | var18) - (var17 & var18)];
         int var10002 = (int)3279679017148295787L;
         var18 = 744868413;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = -1509367722;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = 1037013792;
         var17 = -1104762817;
         int var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = -2081852627;
         var17 = var10003;
         var220[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var18 = -1557128261;
         var17 = 586762054;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = -2117509892;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var10003 = (int)1898144034186254200L;
         var18 = -1630256709;
         var17 = var10003;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = -1528384186;
         var17 = var10003;
         var220[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var10002 = (int)1191974438942715463L;
         var18 = -1285502584;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = 1709598669;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = 1053951845;
         var17 = -1633240408;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = -1602970037;
         var17 = var10003;
         var220[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         var18 = -1091856549;
         var17 = 1945683478;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = -854372018;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var10003 = (int)7488365258115828779L;
         var18 = -1963454431;
         var17 = var10003;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = 2091271193;
         var17 = var10003;
         var220[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var18 = 93693522;
         var17 = -2115872352;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = -2072510474;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = 1115285275;
         var17 = -205082682;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = -1312826888;
         var17 = var10003;
         var220[var10002] = (char)((var17 | var18) & ~(var17 & var18));
         var10002 = (int)-3423053292187107244L;
         var18 = 370227815;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = -1578763722;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = 1292079020;
         var17 = 230205959;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = 1086021673;
         var17 = var10003;
         var220[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         var18 = -1886751537;
         var17 = 1905454318;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = -31942617;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = 2076833804;
         var17 = -1167687992;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = -1045458985;
         var17 = var10003;
         var220[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         var10002 = (int)-622409880747703154L;
         var18 = -1929154084;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = 1414821205;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var10003 = (int)-332787616581313209L;
         var18 = 804654893;
         var17 = var10003;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = 670279240;
         var17 = var10003;
         var220[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         var10002 = (int)8558331874840244622L;
         var18 = 843495547;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = 931645949;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var10003 = (int)-5060841291433865349L;
         var18 = 1097579217;
         var17 = var10003;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = -299942407;
         var17 = var10003;
         var220[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         var10002 = (int)8605557645177975592L;
         var18 = -712484023;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = 1400023144;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var10003 = (int)-1921790176454243701L;
         var18 = 1027523133;
         var17 = var10003;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = 44224402;
         var17 = var10003;
         var220[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         char[] var8 = var220;
         var10000 = (int)-7858708115737978925L;
         var18 = 1920174617;
         var17 = var10000;
         var10000 = var17 & ~var18 | ~var17 & var18;
         var18 = 1837555136;
         var17 = var10000;
         char[] var223 = new char[var17 & ~var18 | ~var17 & var18];
         var10002 = (int)-6056701944995107789L;
         var18 = -1714875567;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = 602881890;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = 2010483825;
         var17 = -1461322941;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = -550486254;
         var17 = var10003;
         var223[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         var18 = -225251490;
         var17 = 1698987688;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = -1747545609;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = 177903421;
         var17 = -381108270;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = -472732436;
         var17 = var10003;
         var223[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         var18 = 1809671347;
         var17 = -1793170025;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = -20774618;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var10003 = (int)-6746899828786596242L;
         var18 = 234286469;
         var17 = var10003;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = 1072798904;
         var17 = var10003;
         var223[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var18 = 1147764014;
         var17 = 1989266589;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = 855159216;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var10003 = (int)2416070768225174143L;
         var18 = 2133663874;
         var17 = var10003;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = 1802066687;
         var17 = var10003;
         var223[var10002] = (char)((var17 | var18) & ~(var17 & var18));
         var18 = 1645754515;
         var17 = -1214774427;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = -713016334;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var10003 = (int)-3576271461052219751L;
         var18 = -619019540;
         var17 = var10003;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = 210224181;
         var17 = var10003;
         var223[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         var10002 = (int)872349897125869231L;
         var18 = 1869829346;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = 1702519368;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var10003 = (int)-3590509562017567289L;
         var18 = -1234893514;
         var17 = var10003;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = 388599909;
         var17 = var10003;
         var223[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var18 = -2137989754;
         var17 = 1482248215;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = -657879657;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = 819601938;
         var17 = -1934380735;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = -1133964182;
         var17 = var10003;
         var223[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         var18 = 943440473;
         var17 = 1966082876;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = 1292618082;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var10003 = (int)-4839544912925148865L;
         var18 = -28671280;
         var17 = var10003;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = 281455575;
         var17 = var10003;
         var223[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         var18 = -1574011142;
         var17 = -739942393;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = 1909137141;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = 1088675451;
         var17 = 1311250510;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = 248202545;
         var17 = var10003;
         var223[var10002] = (char)((var17 | var18) - (var17 & var18));
         var18 = 706105873;
         var17 = 143200535;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = 580862735;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var10003 = (int)-8692662557876353539L;
         var18 = -404923800;
         var17 = var10003;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = 1923902630;
         var17 = var10003;
         var223[var10002] = (char)((var17 | var18) & ~(var17 & var18));
         char[] var9 = var223;
         var10000 = (int)-31338293976451392L;
         var18 = 1898337400;
         var17 = var10000;
         var10000 = var17 & ~var18 | ~var17 & var18;
         var18 = -1500716360;
         var17 = var10000;

         for (int var10 = (var17 | var18) & (~var17 | ~var18); var10 < var6.length; var10++) {
            char var278 = var6[var10];
            char var205 = var8[var10 % var8.length];
            char var106 = var278;
            var7[var10] = (char)((var106 | var205) & ~(var106 & var205));
         }

         char[] var19 = new char[var7.length];
         var18 = -1806432452;
         var17 = 1431767605;
         var10000 = var17 & ~var18 | ~var17 & var18;
         var18 = -1056764663;
         var17 = var10000;

         for (int var11 = (var17 | var18) - (var17 & var18); var11 < var6.length; var11++) {
            char var279 = var7[var11];
            char var208 = var9[var11 % var9.length];
            char var109 = var279;
            var19[var11] = (char)(var109 & ~var208 | ~var109 & var208);
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
         var10000 = (int)-3253174431846172448L;
         var18 = 180065421;
         var17 = var10000;
         var10000 = var17 + var18 - 2 * (var17 & var18);
         var18 = 399993965;
         var17 = var10000;

         for (int var16 = (var17 | var18) - (var17 & var18); var16 < var15.length; var16++) {
            int var10001 = (int)4229688456194448457L;
            var18 = 416727093;
            var17 = var10001;
            var10001 = var17 + var18 - 2 * (var17 & var18);
            var18 = -1361273730;
            var17 = var10001;
            switch (var16 % ((var17 | var18) & ~(var17 & var18))) {
               case 0:
                  var18 = var12;
                  var17 = var13;
                  var10002 = (var17 | var18) - (var17 & var18);
                  char var218 = var14[var16];
                  var17 = var10002;
                  var15[var16] = (char)((var17 | var218) - (var17 & var218));
                  break;
               case 1:
                  var18 = var13;
                  var17 = var5;
                  var10002 = var17 + var18 - 2 * (var17 & var18);
                  char var216 = var14[var16];
                  var17 = var10002;
                  var15[var16] = (char)(var17 & ~var216 | ~var17 & var216);
            }
         }

         return new String(var15);
      }
   }
}
