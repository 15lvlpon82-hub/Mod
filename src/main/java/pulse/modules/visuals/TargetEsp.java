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
import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat.DrawMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Vec3d;
import org.joml.Matrix4f;
import org.joml.Vector4f;
import org.lwjgl.opengl.GL11;

@ModuleInfo(a = "Target ESP", b = "Отображает ESP вокруг цели", c = ModuleCategory.VISUALS)
public class TargetEsp extends ClientModule {
   private final ModeSetting e;
   private final SettingGroup f;
   private final SliderSetting g;
   private final SliderSetting h;
   private final SliderSetting i;
   private final SettingGroup j;
   private final SliderSetting k;
   private final SettingGroup l;
   private final SliderSetting m;
   private final SliderSetting n;
   private final SettingGroup o;
   private final ModeSetting p;
   private final SliderSetting q;
   private final SliderSetting r;
   private final SliderSetting s;
   private final SliderSetting t;
   private final SliderSetting u;
   private final SliderSetting v;
   private final BooleanSetting w;
   private final BooleanSetting x;
   private final ModeSetting y;
   private final BooleanSetting z;
   private final SliderSetting A;
   private final SliderSetting B;
   private final SettingGroup C;
   private final BooleanSetting D;
   private final ColorSetting E;
   private final SettingGroup F;
   private final BooleanSetting G;
   private final BooleanSetting H;
   private final ColorSetting I;
   private final BooleanSetting J;
   private final SliderSetting K;
   private final SliderSetting L;
   private final BooleanSetting targetPlayers;
   private final BooleanSetting targetMobs;
   private final Map<LivingEntity, AnimationState> M;
   private final Identifier N;
   private final Map<LivingEntity, Integer> O;
   private final Map<LivingEntity, Long> P;
   private final Map<LivingEntity, Double> Q;
   private final Map<LivingEntity, Double> R;
   private long S;
   public static int a;
   public static boolean b;

   public TargetEsp() {
      int var2 = -2108900953;
      int var1 = 1095593955;
      int var10004 = (var1 | var2) - (var1 & var2);
      var2 = -1023289780;
      var1 = var10004;
      var10004 = var1 + var2 - 2 * (var1 & var2);
      var10004 = (int)1652503027454382358L;
      var2 = -1773423318;
      var1 = var10004;
      var10004 = (var1 | var2) & ~(var1 & var2);
      var2 = -1394897210;
      var1 = var10004;
      var10004 = (var1 | var2) - (var1 & var2);
      int var10005 = (int)1063533923184146479L;
      var2 = 1810772706;
      var1 = var10005;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = -9863556;
      var1 = var10005;
      var2 = (var1 | var2) & ~(var1 & var2);
      var1 = var10004;
      var10004 = (var1 ^ var2) + 2 * (var1 & var2);
      int var10006 = (int)5079882962425272984L;
      var2 = 413015285;
      var1 = var10006;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var2 = -881539457;
      var1 = var10006;
      var10006 = (var1 | var2) - (var1 & var2);
      var2 = -2078995549;
      var1 = 1181188035;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1032686479;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var2 = -1595626023;
      var1 = 261058281;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1658225757;
      var1 = var10005;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var10006 = (int)8602877208440369621L;
      var2 = 386360883;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var2 = 499373990;
      var1 = var10006;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var2 = 1211250213;
      var1 = -506508273;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var2 = 927013964;
      var1 = var10006;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var2 = -1310879023;
      var1 = 412317388;
      int var10007 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1148164016;
      var1 = var10007;
      var10007 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1068414012;
      var1 = -1144268662;
      var10007 = (var1 | var2) - (var1 & var2);
      var2 = 2123570994;
      var1 = var10007;
      var10007 = var1 & ~var2 | ~var1 & var2;
      String var10008 = "cci";
      var2 = -1341391155;
      var1 = 2008733427;
      int var1655 = var1 & ~var2 | ~var1 & var2;
      var2 = -945126561;
      var1 = var1655;
      String var10003 = c("뻁괦뻗괫뻝", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ", var10005, var10006, var10007, (var1 | var2) & (~var1 | ~var2));
      var2 = -43385930;
      var1 = -767962396;
      var10004 = (var1 | var2) - (var1 & var2);
      var2 = 793782614;
      var1 = var10004;
      String[] var1047 = new String[(var1 | var2) & (~var1 | ~var2)];
      var2 = 1317460431;
      var1 = -479474762;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1376972167;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      String var1483 = "ccj";
      var2 = -1499692813;
      var1 = 1334724808;
      int var1656 = var1 & ~var2 | ~var1 & var2;
      var2 = -321103862;
      var1 = var1656;
      int var1657 = (var1 | var2) & (~var1 | ~var2);
      int var10009 = (int)-6927307606845397781L;
      var2 = 827389559;
      var1 = var10009;
      var10009 = (var1 | var2) & ~(var1 & var2);
      var2 = 11677731;
      var1 = var10009;
      var10009 = (var1 | var2) & ~(var1 & var2);
      var2 = 454978755;
      var1 = -418940869;
      var10009 = (var1 | var2) & ~(var1 & var2);
      var2 = -832852885;
      var1 = var10009;
      var10009 = (var1 | var2) - (var1 & var2);
      String var10010 = "cck";
      int var1859 = (int)-652119658086172660L;
      var2 = 410317004;
      var1 = var1859;
      int var1860 = (var1 | var2) & ~(var1 & var2);
      var2 = -1039235059;
      var1 = var1860;
      int var1861 = var1 & ~var2 | ~var1 & var2;
      var2 = -1723008283;
      var1 = 1763965082;
      int var10011 = (var1 | var2) - (var1 & var2);
      var2 = -694483812;
      var1 = var10011;
      var10011 = (var1 | var2) - (var1 & var2);
      int var10012 = (int)9123261664433118L;
      var2 = -894247788;
      var1 = var10012;
      var10012 = var1 + var2 - 2 * (var1 & var2);
      var2 = 314818550;
      var1 = var10012;
      var2 = (var1 | var2) - (var1 & var2);
      var1 = var10011;
      var10011 = (var1 & ~var2) + (var2 & ~var1) + 2 * (var1 & var2);
      var10011 = (int)-7589123658138612793L;
      var2 = 647173796;
      var1 = var10011;
      var10011 = var1 + var2 - 2 * (var1 & var2);
      var2 = -816902034;
      var1 = var10011;
      var10011 = (var1 | var2) & ~(var1 & var2);
      var2 = -1013884078;
      var1 = 1337958345;
      var10012 = var1 + var2 - 2 * (var1 & var2);
      var2 = -2112647553;
      var1 = var10012;
      var10012 = (var1 | var2) & ~(var1 & var2);
      var2 = -310956137;
      var1 = 1314472878;
      int var10013 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1074280440;
      var1 = var10013;
      var2 = var1 & ~var2 | ~var1 & var2;
      var1 = var10012;
      var10012 = 2 * (var1 | var2) - (var1 ^ var2);
      var2 = -2115571048;
      var1 = -1243593894;
      var10012 = (var1 | var2) & ~(var1 & var2);
      var2 = 874837002;
      var1 = var10012;
      var1047[var10006] = c("뻾䏺뻙䎍뺡䎊뻛䎂", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ", var10009, var1861, var10011, (var1 | var2) & ~(var1 & var2));
      var10006 = (int)-3762230909824035310L;
      var2 = 1340096292;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var2 = -15619785;
      var1 = var10006;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var10007 = (int)3673061927243931509L;
      var2 = -2025815235;
      var1 = var10007;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var2 = -1779404573;
      var1 = var10007;
      var10007 = (var1 & ~var2 | ~var1 & var2) * (var1 & ~var2 | ~var1 & var2);
      var2 = -1903338160;
      var1 = -515971444;
      int var1658 = (var1 | var2) & ~(var1 & var2);
      var2 = -984990057;
      var1 = var1658;
      int var1659 = (var1 | var2) - (var1 & var2);
      var10009 = (int)8494824447539240915L;
      var2 = -101207021;
      var1 = var10009;
      var10009 = var1 + var2 - 2 * (var1 & var2);
      var2 = -500721498;
      var1 = var10009;
      var10009 = (var1 | var2) & ~(var1 & var2);
      var2 = 1574475866;
      var1 = 1098627314;
      int var1862 = var1 & ~var2 | ~var1 & var2;
      var2 = 1425147141;
      var1 = var1862;
      var2 = (var1 | var2) - (var1 & var2);
      var1 = var10009;
      var10009 = (var1 & ~var2) + (var2 & ~var1) + 2 * (var1 & var2);
      var2 = 2030284519;
      var1 = 999703907;
      var10009 = (var1 | var2) & ~(var1 & var2);
      var2 = 1893159703;
      var1 = var10009;
      var10009 = var1 & ~var2 | ~var1 & var2;
      int var1863 = (int)8983998060766112239L;
      var2 = 165587943;
      var1 = var1863;
      int var1864 = var1 + var2 - 2 * (var1 & var2);
      var2 = 894941412;
      var1 = var1864;
      int var1865 = var1 + var2 - 2 * (var1 & var2);
      var10011 = (int)6894016393517228402L;
      var2 = -1553810694;
      var1 = var10011;
      var10011 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1489764168;
      var1 = var10011;
      var2 = var1 & ~var2 | ~var1 & var2;
      var1 = var1865;
      int var1866 = 2 * (var1 | var2) - (var1 ^ var2);
      int var1867 = (int)-5259664876977859775L;
      var2 = 1516268429;
      var1 = var1867;
      int var1868 = (var1 | var2) - (var1 & var2);
      var2 = -1900959670;
      var1 = var1868;
      int var1869 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1544366380;
      var1 = -810247547;
      var10011 = (var1 | var2) - (var1 & var2);
      var2 = -1715188957;
      var1 = var10011;
      var10011 = (var1 + var2 - 2 * (var1 & var2)) * (var1 + var2 - 2 * (var1 & var2));
      var10011 = (int)-4366381498283715591L;
      var2 = 1411978966;
      var1 = var10011;
      var10011 = var1 + var2 - 2 * (var1 & var2);
      var2 = 199527153;
      var1 = var10011;
      var10011 = var1 & ~var2 | ~var1 & var2;
      var2 = -1376584517;
      var1 = 1671772450;
      var10012 = var1 + var2 - 2 * (var1 & var2);
      var2 = -853560271;
      var1 = var10012;
      var10012 = (var1 | var2) - (var1 & var2);
      var2 = 83542253;
      var1 = 184646905;
      var10013 = (var1 | var2) - (var1 & var2);
      var2 = -989799049;
      var1 = var10013;
      var2 = (var1 | var2) & (~var1 | ~var2);
      var1 = var10012;
      var10012 = (var1 | var2) + (var1 & var2);
      var10012 = (int)823205599002305205L;
      var2 = -1390203113;
      var1 = var10012;
      var10012 = (var1 | var2) & ~(var1 & var2);
      var2 = -724281309;
      var1 = var10012;
      var1047[var10006] = c("뻻厳뺢叀", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ", var10009, var1869, var10011, var1 + var2 - 2 * (var1 & var2));
      var10006 = (int)-4687704943217499244L;
      var2 = 1569269357;
      var1 = var10006;
      var10006 = (var1 | var2) - (var1 & var2);
      var2 = -1843100165;
      var1 = var10006;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var2 = -187925197;
      var1 = -1642743321;
      int var1660 = (var1 | var2) & ~(var1 & var2);
      var2 = 1792656596;
      var1 = var1660;
      int var1661 = (var1 | var2) & (~var1 | ~var2);
      var2 = 383788677;
      var1 = 1190090900;
      int var1662 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1343192602;
      var1 = var1662;
      int var1663 = (var1 | var2) & ~(var1 & var2);
      int var1664 = (int)-2772658961911379990L;
      var2 = -1985922795;
      var1 = var1664;
      int var1665 = var1 & ~var2 | ~var1 & var2;
      var2 = -900120845;
      var1 = var1665;
      int var1666 = (var1 | var2) & (~var1 | ~var2);
      var10008 = "ccl";
      int var1870 = (int)-4160692836068245391L;
      var2 = 176839617;
      var1 = var1870;
      int var1871 = (var1 | var2) & ~(var1 & var2);
      var2 = -467035216;
      var1 = var1871;
      int var1872 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1909280132;
      var1 = 103560659;
      int var1873 = (var1 | var2) - (var1 & var2);
      var2 = 2011265093;
      var1 = var1873;
      int var1874 = (var1 | var2) & (~var1 | ~var2);
      int var1875 = (int)3095207917390969212L;
      var2 = -1897459901;
      var1 = var1875;
      int var1876 = (var1 | var2) & (~var1 | ~var2);
      var2 = 687322679;
      var1 = var1876;
      int var1877 = var1 + var2 - 2 * (var1 & var2);
      var2 = -122683684;
      var1 = -642614798;
      int var1878 = (var1 | var2) & (~var1 | ~var2);
      var2 = 555583264;
      var1 = var1878;
      int var1879 = (var1 | var2) & (~var1 | ~var2);
      int var1880 = (int)5572855522345617842L;
      var2 = -95719906;
      var1 = var1880;
      int var1881 = (var1 | var2) & ~(var1 & var2);
      var2 = -1145608257;
      var1 = var1881;
      int var1882 = var1 + var2 - 2 * (var1 & var2);
      var10009 = (int)-4537156218102989940L;
      var2 = -1881625844;
      var1 = var10009;
      var10009 = (var1 | var2) & ~(var1 & var2);
      var2 = -602003437;
      var1 = var10009;
      var10009 = var1 + var2 - 2 * (var1 & var2);
      int var1883 = (int)-623712227729202533L;
      var2 = -699098828;
      var1 = var1883;
      int var1884 = var1 + var2 - 2 * (var1 & var2);
      var2 = -612940551;
      var1 = var1884;
      int var1885 = (var1 | var2) & (~var1 | ~var2);
      int var1886 = (int)4953691872361821309L;
      var2 = -1006391317;
      var1 = var1886;
      int var1887 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1080721253;
      var1 = var1887;
      int var1888 = var1 & ~var2 | ~var1 & var2;
      var2 = -957361565;
      var1 = -1549010593;
      var10011 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1822089940;
      var1 = var10011;
      var10011 = (var1 + var2 - 2 * (var1 & var2)) * (var1 + var2 - 2 * (var1 & var2));
      var10011 = (int)-474619417735252140L;
      var2 = -773168776;
      var1 = var10011;
      var10011 = (var1 | var2) & ~(var1 & var2);
      var2 = -1320082834;
      var1 = var10011;
      var10011 = (var1 | var2) & (~var1 | ~var2);
      var10012 = (int)-7450886392503362631L;
      var2 = 717969387;
      var1 = var10012;
      var10012 = (var1 | var2) & ~(var1 & var2);
      var2 = -762226454;
      var1 = var10012;
      var10012 = (var1 + var2 - 2 * (var1 & var2)) * (var1 + var2 - 2 * (var1 & var2));
      var2 = 1849434896;
      var1 = 1222331880;
      var10012 = (var1 | var2) - (var1 & var2);
      var2 = 653575958;
      var1 = var10012;
      var1047[var10006] = c("뻻꾮뻑꾨뺡꾬뺣꾤뻛", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ", var10009, var1888, var10011, var1 + var2 - 2 * (var1 & var2));
      var10006 = (int)-2606860075035573316L;
      var2 = 2005001400;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var2 = -1478842617;
      var1 = var10006;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      String var1487 = "ccm";
      var2 = -241884453;
      var1 = -788683095;
      int var1668 = (var1 | var2) - (var1 & var2);
      var2 = 1726647893;
      var1 = var1668;
      int var1669 = (var1 | var2) - (var1 & var2);
      var10009 = (int)-8840517334073548579L;
      var2 = 1524914576;
      var1 = var10009;
      var10009 = (var1 | var2) - (var1 & var2);
      var2 = 1526475387;
      var1 = var10009;
      var10009 = (var1 | var2) - (var1 & var2);
      var2 = 95091757;
      var1 = -1677304846;
      var10009 = (var1 | var2) - (var1 & var2);
      var2 = -1410457780;
      var1 = var10009;
      var10009 = (var1 | var2) - (var1 & var2);
      var10010 = "ccn";
      int var1890 = (int)8169882783661341452L;
      var2 = -701245537;
      var1 = var1890;
      int var1891 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1348924447;
      var1 = var1891;
      int var1892 = var1 + var2 - 2 * (var1 & var2);
      var2 = -2061943833;
      var1 = -1427851628;
      var10011 = var1 & ~var2 | ~var1 & var2;
      var2 = 497113882;
      var1 = var10011;
      var10011 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1339599636;
      var1 = 2109853442;
      var10012 = var1 & ~var2 | ~var1 & var2;
      var2 = 378821434;
      var1 = var10012;
      var2 = var1 & ~var2 | ~var1 & var2;
      var1 = var10011;
      var10011 = (var1 ^ var2) + 2 * (var1 & var2);
      var2 = -145748972;
      var1 = 981837322;
      var10011 = (var1 | var2) & (~var1 | ~var2);
      var2 = -744281458;
      var1 = var10011;
      var10011 = (var1 | var2) & (~var1 | ~var2);
      var2 = -595874165;
      var1 = -1308245737;
      var10013 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1853779854;
      var1 = var10013;
      var10013 = var1 & ~var2 | ~var1 & var2;
      var10013 = (int)-8385446852649715886L;
      var2 = 1470285190;
      var1 = var10013;
      var10013 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1354255659;
      var1 = var10013;
      var10013 = (var1 | var2) - (var1 & var2);
      var2 = 1079612554;
      var1 = 1424122323;
      var10012 = var1 & ~var2 | ~var1 & var2;
      var2 = 351873246;
      var1 = var10012;
      var1047[var10006] = c(
         "뻿\udbb5뻐\udbcd뺣\udbc5", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ", var10009, var1892, var10011, (var1 | var2) - (var1 & var2)
      );
      String var1163 = "cco";
      var2 = -1991681619;
      var1 = 1031700894;
      var10007 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1271408579;
      var1 = var10007;
      var10007 = (var1 | var2) - (var1 & var2);
      var10007 = (int)3479241340956911601L;
      var2 = 146430283;
      var1 = var10007;
      var10007 = (var1 | var2) & ~(var1 & var2);
      var2 = -550666576;
      var1 = var10007;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var10007 = (int)5286544862838423178L;
      var2 = 443233436;
      var1 = var10007;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      var2 = 80562718;
      var1 = var10007;
      var10007 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1154404418;
      var1 = 1524655614;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var2 = 1319078152;
      var1 = var10007;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      int var1670 = (int)7660497984859887315L;
      var2 = 1892887635;
      var1 = var1670;
      int var1671 = var1 + var2 - 2 * (var1 & var2);
      var2 = -505319833;
      var1 = var1671;
      var2 = (var1 | var2) & ~(var1 & var2);
      var1 = var10007;
      var10007 = (var1 | var2) + (var1 & var2);
      var10007 = (int)-3642136048977094594L;
      var2 = -794077917;
      var1 = var10007;
      var10007 = (var1 | var2) & ~(var1 & var2);
      var2 = -1812286066;
      var1 = var10007;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var2 = -1599260809;
      var1 = -115173929;
      int var1672 = var1 & ~var2 | ~var1 & var2;
      var2 = 1147089563;
      var1 = var1672;
      int var1673 = ((var1 | var2) - (var1 & var2)) * ((var1 | var2) - (var1 & var2));
      int var1674 = (int)-1507013636379602722L;
      var2 = 1404034114;
      var1 = var1674;
      int var1675 = var1 & ~var2 | ~var1 & var2;
      var2 = -957268704;
      var1 = var1675;
      int var1676 = (var1 | var2) & ~(var1 & var2);
      var2 = 1969417197;
      var1 = -1537786267;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var2 = -1839374820;
      var1 = var10009;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var2 = 1714862010;
      var1 = -1736473840;
      var10009 = (var1 | var2) & (~var1 | ~var2);
      var2 = -351639090;
      var1 = var10009;
      var10009 = (var1 | var2) & (~var1 | ~var2);
      int var1893 = (int)-8583889729981467287L;
      var2 = -1017812354;
      var1 = var1893;
      int var1894 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1413711509;
      var1 = var1894;
      int var1895 = ((var1 | var2) & (~var1 | ~var2)) * ((var1 | var2) & (~var1 | ~var2));
      var2 = -1275799237;
      var1 = -829830881;
      int var1896 = (var1 | var2) & (~var1 | ~var2);
      var2 = 2104272531;
      var1 = var1896;
      this.e = new ModeSetting(
         var10003, var1047, c("뻿낅뻐냽뺣냵", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ", var10007, var1676, var10009, var1 & ~var2 | ~var1 & var2)
      );
      var2 = -1150909535;
      var1 = -273538770;
      int var980 = (var1 | var2) & (~var1 | ~var2);
      var2 = 846914316;
      var1 = var980;
      int var981 = (var1 | var2) - (var1 & var2);
      var10004 = (int)-5490855656841778633L;
      var2 = -140381981;
      var1 = var10004;
      var10004 = var1 + var2 - 2 * (var1 & var2);
      var2 = 716712918;
      var1 = var10004;
      var10004 = var1 & ~var2 | ~var1 & var2;
      var10005 = (int)1746141455817511477L;
      var2 = -2131009349;
      var1 = var10005;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var2 = -393549454;
      var1 = var10005;
      var2 = var1 + var2 - 2 * (var1 & var2);
      var1 = var10004;
      var10004 = (var1 ^ var2) + 2 * (var1 & var2);
      var2 = -77964367;
      var1 = 1829474982;
      var10006 = (var1 | var2) - (var1 & var2);
      var2 = -1773025006;
      var1 = var10006;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1542411866;
      var1 = 1093131806;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var2 = -449349710;
      var1 = var10006;
      var10006 = (var1 | var2) - (var1 & var2);
      var2 = 149812881;
      var1 = 511763412;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = 607104470;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var10006 = (int)8205814233666478522L;
      var2 = 40197989;
      var1 = var10006;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var2 = -833796859;
      var1 = var10006;
      var10006 = (var1 | var2) - (var1 & var2);
      var2 = -208888899;
      var1 = 671590810;
      var10006 = (var1 | var2) - (var1 & var2);
      var2 = 1161055814;
      var1 = var10006;
      var10006 = (var1 | var2) - (var1 & var2);
      var10007 = (int)-7521833639722261808L;
      var2 = 1124246257;
      var1 = var10007;
      var10007 = (var1 | var2) - (var1 & var2);
      var2 = 1420150015;
      var1 = var10007;
      var10007 = ((var1 | var2) & (~var1 | ~var2)) * ((var1 | var2) & (~var1 | ~var2));
      var2 = -1297306997;
      var1 = -1776818977;
      var10007 = (var1 | var2) & ~(var1 & var2);
      var2 = 1019362607;
      var1 = var10007;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var10009 = (int)-6336456596573546852L;
      var2 = -315689657;
      var1 = var10009;
      var10009 = var1 + var2 - 2 * (var1 & var2);
      var2 = -811375657;
      var1 = var10009;
      var10009 = (var1 | var2) & (~var1 | ~var2);
      var2 = 177168336;
      var1 = 2022871073;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var2 = 1914556400;
      var1 = var10009;
      var10009 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1590437294;
      var1 = 929001321;
      int var1677 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1770883995;
      var1 = var1677;
      this.f = new SettingGroup(c("뻾읮뻙윙뺡윞뻛윖", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ", var10005, var10006, var10007, var1 & ~var2 | ~var1 & var2))
         .a(
            () -> {
               ModeSetting var10000 = this.e;
               int var10002x = (int)5385026695977183637L;
               int var2x = 2125598620;
               int var1x = var10002x;
               var10002x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = -922409466;
               var1x = var10002x;
               var10002x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = 1161792832;
               var1x = 595408008;
               var10002x = (var1x | var2x) - (var1x & var2x);
               var2x = 1715648974;
               var1x = var10002x;
               var10002x = var1x + var2x - 2 * (var1x & var2x);
               var2x = -1075447979;
               var1x = 617680800;
               var10002x = var1x + var2x - 2 * (var1x & var2x);
               var2x = -1691027225;
               var1x = var10002x;
               var10002x = (var1x | var2x) & (~var1x | ~var2x);
               var10002x = (int)-6998254239543871107L;
               var2x = -895384582;
               var1x = var10002x;
               var10002x = (var1x | var2x) & ~(var1x & var2x);
               var2x = 1052523151;
               var1x = var10002x;
               var10002x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = 1441436213;
               var1x = -324354729;
               var10002x = (var1x | var2x) & ~(var1x & var2x);
               var2x = 236865321;
               var1x = var10002x;
               var10002x = var1x & ~var2x | ~var1x & var2x;
               var2x = -24337476;
               var1x = -1751904900;
               int var10003x = var1x & ~var2x | ~var1x & var2x;
               var2x = 2069408330;
               var1x = var10003x;
               var10003x = (var1x | var2x) - (var1x & var2x);
               int var10004x = (int)168122121856238527L;
               var2x = 759858111;
               var1x = var10004x;
               var10004x = var1x + var2x - 2 * (var1x & var2x);
               var2x = 1206493578;
               var1x = var10004x;
               var2x = (var1x | var2x) & (~var1x | ~var2x);
               var1x = var10003x;
               var10003x = (var1x ^ var2x) + 2 * (var1x & var2x);
               var10003x = (int)1913071947925700511L;
               var2x = -2100291071;
               var1x = var10003x;
               var10003x = (var1x | var2x) & ~(var1x & var2x);
               var2x = 1299356941;
               var1x = var10003x;
               var10003x = (var1x | var2x) & ~(var1x & var2x);
               int var10005x = (int)4007398166650608552L;
               var2x = -1785413474;
               var1x = var10005x;
               var10005x = var1x & ~var2x | ~var1x & var2x;
               var2x = 290855736;
               var1x = var10005x;
               var10005x = (var1x | var2x) & ~(var1x & var2x);
               var10005x = (int)-6164535876463447678L;
               var2x = -1118713789;
               var1x = var10005x;
               var10005x = (var1x | var2x) - (var1x & var2x);
               var2x = -1284539954;
               var1x = var10005x;
               var10005x = (var1x | var2x) & ~(var1x & var2x);
               var2x = -36403342;
               var1x = 1918252530;
               var10004x = var1x & ~var2x | ~var1x & var2x;
               var2x = 200370241;
               var1x = var10004x;
               var10004x = (var1x | var2x) & ~(var1x & var2x);
               var10005x = (int)-3924992554605642198L;
               var2x = -1207627239;
               var1x = var10005x;
               var10005x = var1x & ~var2x | ~var1x & var2x;
               var2x = -974697333;
               var1x = var10005x;
               var10005x = var1x & ~var2x | ~var1x & var2x;
               var2x = 983282423;
               var1x = -464212521;
               int var10006x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = -1241040107;
               var1x = var10006x;
               var2x = var1x + var2x - 2 * (var1x & var2x);
               var1x = var10005x;
               var10005x = (var1x & ~var2x) + (var2x & ~var1x) + 2 * (var1x & var2x);
               var2x = -1875519152;
               var1x = 1311473997;
               var10005x = var1x + var2x - 2 * (var1x & var2x);
               var2x = -1047779747;
               var1x = var10005x;
               var10005x = (var1x | var2x) - (var1x & var2x);
               int var10007x = (int)-1605394927145140320L;
               var2x = 939225109;
               var1x = var10007x;
               var10007x = (var1x | var2x) & ~(var1x & var2x);
               var2x = -55062598;
               var1x = var10007x;
               var10007x = var1x & ~var2x | ~var1x & var2x;
               var10007x = (int)-8184995112726926811L;
               var2x = 1742761;
               var1x = var10007x;
               var10007x = var1x + var2x - 2 * (var1x & var2x);
               var2x = -1719599740;
               var1x = var10007x;
               var10007x = (var1x | var2x) - (var1x & var2x);
               var2x = -1875499646;
               var1x = -1172597836;
               var10007x = var1x & ~var2x | ~var1x & var2x;
               var2x = 707638823;
               var1x = var10007x;
               var10007x = (var1x | var2x) - (var1x & var2x);
               var2x = -1489609284;
               var1x = -331305246;
               var10006x = var1x + var2x - 2 * (var1x & var2x);
               var2x = 1261908033;
               var1x = var10006x;
               return var10000.b(
                  c(
                     "\ue383顐\ue3a4頧\ue3dc頠\ue3a6頨",
                     "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ",
                     var10003x,
                     var10004x,
                     var10005x,
                     (var1x | var2x) & (~var1x | ~var2x)
                  )
               );
            }
         );
      var2 = -602141945;
      var1 = 373648279;
      var10004 = (var1 | var2) - (var1 & var2);
      var2 = -900112225;
      var1 = var10004;
      var10004 = (var1 | var2) - (var1 & var2);
      var10004 = (int)6312627505924696949L;
      var2 = 1602911314;
      var1 = var10004;
      var10004 = (var1 | var2) & (~var1 | ~var2);
      var2 = 92935990;
      var1 = var10004;
      var10004 = (var1 | var2) & (~var1 | ~var2);
      var2 = -443153016;
      var1 = 1065749292;
      var10004 = var1 & ~var2 | ~var1 & var2;
      var2 = -636481881;
      var1 = var10004;
      var10004 = (var1 | var2) & (~var1 | ~var2);
      var2 = 141265789;
      var1 = -505929096;
      var10004 = (var1 | var2) & (~var1 | ~var2);
      var2 = -374101748;
      var1 = var10004;
      var10004 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1618187808;
      var1 = 746254064;
      var10004 = var1 & ~var2 | ~var1 & var2;
      var2 = -1275689190;
      var1 = var10004;
      var10004 = var1 & ~var2 | ~var1 & var2;
      var10004 = (int)-8525821508412659772L;
      var2 = 2105412572;
      var1 = var10004;
      var10004 = var1 & ~var2 | ~var1 & var2;
      var2 = -153401529;
      var1 = var10004;
      var10004 = (var1 + var2 - 2 * (var1 & var2)) * (var1 + var2 - 2 * (var1 & var2));
      var10005 = (int)-9177746862001662416L;
      var2 = -994567370;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = -2079037060;
      var1 = var10005;
      var10005 = (var1 & ~var2 | ~var1 & var2) * (var1 & ~var2 | ~var1 & var2);
      var10005 = (int)3514207559485566872L;
      var2 = 807882353;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = 4512122;
      var1 = var10005;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = -281375497;
      var1 = -1153321260;
      var10006 = (var1 | var2) - (var1 & var2);
      var2 = -1547482278;
      var1 = var10006;
      var10006 = (var1 + var2 - 2 * (var1 & var2)) * (var1 + var2 - 2 * (var1 & var2));
      var2 = 462846655;
      var1 = -1836544214;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var2 = 402549705;
      var1 = var10006;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var10007 = (int)-4245994467070551814L;
      var2 = 1308566212;
      var1 = var10007;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var2 = 164643138;
      var1 = var10007;
      var10007 = (var1 | var2) & (~var1 | ~var2);
      int var1678 = (int)6703262347281632560L;
      var2 = 1372561642;
      var1 = var1678;
      int var1679 = (var1 | var2) & ~(var1 & var2);
      var2 = -1444199704;
      var1 = var1679;
      var2 = (var1 | var2) & ~(var1 & var2);
      var1 = var10007;
      var10007 = (var1 ^ var2) + 2 * (var1 & var2);
      var10007 = (int)-6601363281060967676L;
      var2 = 2113226107;
      var1 = var10007;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1012615575;
      var1 = var10007;
      var10007 = (var1 | var2) & (~var1 | ~var2);
      int var1680 = (int)-6527335069960757382L;
      var2 = -1817438121;
      var1 = var1680;
      int var1681 = var1 & ~var2 | ~var1 & var2;
      var2 = 1443016183;
      var1 = var1681;
      int var1682 = (var1 + var2 - 2 * (var1 & var2)) * (var1 + var2 - 2 * (var1 & var2));
      int var1683 = (int)-1030066861146606052L;
      var2 = -1135459848;
      var1 = var1683;
      int var1684 = (var1 | var2) & (~var1 | ~var2);
      var2 = 169465011;
      var1 = var1684;
      var10003 = c(
         "뻀\ue51f뻟\ue565뻟\ue564뺣\ue569뫁\ue515뻜\ue51d뻝\ue515뺧\ue51d뻙",
         "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ",
         var10005,
         var10006,
         var10007,
         (var1 | var2) & ~(var1 & var2)
      );
      var2 = -1966711772;
      var1 = 1923552092;
      var10004 = (var1 | var2) - (var1 & var2);
      var2 = 1865612723;
      var1 = var10004;
      var10004 = (var1 | var2) - (var1 & var2);
      var2 = 589883257;
      var1 = 987485341;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var2 = 435368943;
      var1 = var10006;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var10006 = (int)-4008750572635029320L;
      var2 = -1227910410;
      var1 = var10006;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var2 = 1513984588;
      var1 = var10006;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var10007 = (int)-949973307074686667L;
      var2 = 476105110;
      var1 = var10007;
      var10007 = (var1 | var2) - (var1 & var2);
      var2 = 1775573161;
      var1 = var10007;
      var10007 = (var1 | var2) - (var1 & var2);
      var2 = -196094400;
      var1 = 1805000138;
      var10007 = (var1 | var2) - (var1 & var2);
      var2 = -1613116543;
      var1 = var10007;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      var10007 = (int)1394340668024061407L;
      var2 = 1926076223;
      var1 = var10007;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var2 = 1694105979;
      var1 = var10007;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var2 = 788883073;
      var1 = 118883714;
      int var1685 = var1 + var2 - 2 * (var1 & var2);
      var2 = -39313602;
      var1 = var1685;
      var2 = (var1 | var2) & ~(var1 & var2);
      var1 = var10007;
      var10007 = (var1 & ~var2) + (var2 & ~var1) + 2 * (var1 & var2);
      this.g = new SliderSetting(var10003, 1.5F, 0.5F, 5.0F, 0.1F)
         .a(
            () -> {
               ModeSetting var10000 = this.e;
               int var10002x = (int)1552852244717395584L;
               int var2x = 1199863306;
               int var1x = var10002x;
               var10002x = (var1x | var2x) & ~(var1x & var2x);
               var2x = -460838781;
               var1x = var10002x;
               var10002x = var1x & ~var2x | ~var1x & var2x;
               var10002x = (int)6827664385032296259L;
               var2x = 304006236;
               var1x = var10002x;
               var10002x = var1x & ~var2x | ~var1x & var2x;
               var2x = 2037469971;
               var1x = var10002x;
               var10002x = var1x & ~var2x | ~var1x & var2x;
               var2x = 1090523738;
               var1x = -1902061456;
               var10002x = (var1x | var2x) & ~(var1x & var2x);
               var2x = 890727583;
               var1x = var10002x;
               var10002x = var1x & ~var2x | ~var1x & var2x;
               var2x = -141194392;
               var1x = -1928549942;
               int var10003x = var1x + var2x - 2 * (var1x & var2x);
               var2x = -508426207;
               var1x = var10003x;
               var10003x = var1x + var2x - 2 * (var1x & var2x);
               int var10004x = (int)-5842235659391447672L;
               var2x = 866199592;
               var1x = var10004x;
               var10004x = var1x + var2x - 2 * (var1x & var2x);
               var2x = 716964454;
               var1x = var10004x;
               var2x = var1x & ~var2x | ~var1x & var2x;
               var1x = var10003x;
               var10003x = (var1x & ~var2x) + (var2x & ~var1x) + 2 * (var1x & var2x);
               var10003x = (int)3697322972216100356L;
               var2x = 1412010;
               var1x = var10003x;
               var10003x = var1x & ~var2x | ~var1x & var2x;
               var2x = 1484928317;
               var1x = var10003x;
               var10003x = (var1x | var2x) - (var1x & var2x);
               var2x = 1541778936;
               var1x = -1974082542;
               int var10005x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = -776975894;
               var1x = var10005x;
               var10005x = (var1x | var2x) - (var1x & var2x);
               var10005x = (int)6765315660166048324L;
               var2x = -524219789;
               var1x = var10005x;
               var10005x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = 1297391652;
               var1x = var10005x;
               var10005x = (var1x | var2x) & ~(var1x & var2x);
               var10005x = (int)3222277353960897655L;
               var2x = -425704843;
               var1x = var10005x;
               var10005x = var1x + var2x - 2 * (var1x & var2x);
               var2x = -1136673275;
               var1x = var10005x;
               var10005x = var1x & ~var2x | ~var1x & var2x;
               var2x = 313058605;
               var1x = -1751642780;
               var10004x = var1x & ~var2x | ~var1x & var2x;
               var2x = 22505244;
               var1x = var10004x;
               var10004x = (var1x | var2x) & ~(var1x & var2x);
               int var10006x = (int)779069814980033417L;
               var2x = 1179099932;
               var1x = var10006x;
               var10006x = (var1x | var2x) - (var1x & var2x);
               var2x = 1062901916;
               var1x = var10006x;
               var10006x = (var1x | var2x) & ~(var1x & var2x);
               var2x = -169432640;
               var1x = 1440599957;
               var10006x = var1x & ~var2x | ~var1x & var2x;
               var2x = -1606719931;
               var1x = var10006x;
               var10006x = var1x + var2x - 2 * (var1x & var2x);
               var10006x = (int)2666905484408497812L;
               var2x = -219469139;
               var1x = var10006x;
               var10006x = (var1x | var2x) & ~(var1x & var2x);
               var2x = -1923183564;
               var1x = var10006x;
               var10006x = var1x + var2x - 2 * (var1x & var2x);
               var2x = -1753086864;
               var1x = -821864050;
               var10006x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = 1484873206;
               var1x = var10006x;
               var10006x = var1x & ~var2x | ~var1x & var2x;
               var10005x = (int)-640719860370915594L;
               var2x = -1696829355;
               var1x = var10005x;
               var10005x = var1x & ~var2x | ~var1x & var2x;
               var2x = 250787638;
               var1x = var10005x;
               var10005x = (var1x | var2x) - (var1x & var2x);
               var2x = -2107104769;
               var1x = -1668493922;
               var10006x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = -192498378;
               var1x = var10006x;
               var10006x = ((var1x | var2x) & (~var1x | ~var2x)) * ((var1x | var2x) & (~var1x | ~var2x));
               var2x = -1477217876;
               var1x = -1769604759;
               var10006x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = 826539895;
               var1x = var10006x;
               return var10000.b(
                  c(
                     "\ue39cⳢ\ue3bbⲕ\ue3c3Ⲓ\ue3b9Ⲛ",
                     "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ",
                     var10003x,
                     var10004x,
                     var10005x,
                     var1x & ~var2x | ~var1x & var2x
                  )
               );
            }
         );
      var2 = 2066828024;
      var1 = 1535323150;
      int var983 = var1 & ~var2 | ~var1 & var2;
      var2 = -1841934329;
      var1 = var983;
      int var984 = (var1 | var2) & (~var1 | ~var2);
      var10004 = (int)-3965654717655868000L;
      var2 = -1397012748;
      var1 = var10004;
      var10004 = var1 & ~var2 | ~var1 & var2;
      var2 = 1576566199;
      var1 = var10004;
      var10004 = (var1 | var2) - (var1 & var2);
      var2 = 1582500306;
      var1 = -1485632922;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = 229835210;
      var1 = var10005;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var10005 = (int)-4507763058124805955L;
      var2 = 822771865;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1080061769;
      var1 = var10005;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var10007 = (int)-5872473093293142485L;
      var2 = -400803629;
      var1 = var10007;
      var10007 = (var1 | var2) - (var1 & var2);
      var2 = 824522483;
      var1 = var10007;
      var10007 = (var1 | var2) & (~var1 | ~var2);
      var10006 = (int)4601677830380717156L;
      var2 = 1385416458;
      var1 = var10006;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var2 = -292492467;
      var1 = var10006;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      String var1526 = "ccp";
      var10007 = (int)-3434520907722288888L;
      var2 = 502192430;
      var1 = var10007;
      var10007 = (var1 | var2) - (var1 & var2);
      var2 = 1974208601;
      var1 = var10007;
      var10007 = var1 & ~var2 | ~var1 & var2;
      int var1686 = (int)-3074166047295933683L;
      var2 = -1457607202;
      var1 = var1686;
      int var1687 = var1 + var2 - 2 * (var1 & var2);
      var2 = 496303391;
      var1 = var1687;
      int var1688 = ((var1 | var2) - (var1 & var2)) * ((var1 | var2) - (var1 & var2));
      var2 = -1100790400;
      var1 = 1074415182;
      int var1689 = (var1 | var2) & (~var1 | ~var2);
      var2 = -26644784;
      var1 = var1689;
      var10003 = c("뻁歜뻖歐뻔欬뫁欫뻑欭뺣歔뺧", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ", var10005, var10006, var10007, (var1 | var2) & (~var1 | ~var2));
      var10004 = (int)-3511014624989254238L;
      var2 = -850584754;
      var1 = var10004;
      var10004 = (var1 | var2) - (var1 & var2);
      var2 = -1369462902;
      var1 = var10004;
      var10004 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1246871498;
      var1 = 1251440043;
      var10005 = (var1 | var2) - (var1 & var2);
      var2 = -1051764477;
      var1 = var10005;
      var10005 = ((var1 | var2) & ~(var1 & var2)) * ((var1 | var2) & ~(var1 & var2));
      var10007 = (int)7031325562910584438L;
      var2 = 898111219;
      var1 = var10007;
      var10007 = (var1 | var2) - (var1 & var2);
      var2 = -1193232249;
      var1 = var10007;
      var10007 = (var1 | var2) & ~(var1 & var2);
      var10007 = (int)-5674200978581061778L;
      var2 = 1686018056;
      var1 = var10007;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1946228876;
      var1 = var10007;
      var10007 = (var1 | var2) & (~var1 | ~var2);
      var10007 = (int)-4053785481099474190L;
      var2 = -2040696516;
      var1 = var10007;
      var10007 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1254917171;
      var1 = var10007;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      var10007 = (int)2216429605382988443L;
      var2 = 295418276;
      var1 = var10007;
      var10007 = (var1 | var2) & ~(var1 & var2);
      var2 = -215938288;
      var1 = var10007;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      this.h = new SliderSetting(var10003, 0.25F, 0.05F, 0.5F, 0.01F)
         .a(
            () -> {
               ModeSetting var10000 = this.e;
               int var2x = 255940520;
               int var1x = 43790039;
               int var10001x = var1x & ~var2x | ~var1x & var2x;
               var2x = -242674400;
               var1x = var10001x;
               var10001x = var1x & ~var2x | ~var1x & var2x;
               String var10002x = "cho";
               var2x = -475724226;
               var1x = -1332457664;
               int var10003x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = -767053846;
               var1x = var10003x;
               var10003x = ((var1x | var2x) - (var1x & var2x)) * ((var1x | var2x) - (var1x & var2x));
               var10003x = (int)1182766967645452775L;
               var2x = 986035519;
               var1x = var10003x;
               var10003x = var1x + var2x - 2 * (var1x & var2x);
               var2x = 1444262987;
               var1x = var10003x;
               var10003x = (var1x | var2x) - (var1x & var2x);
               var2x = 317414149;
               var1x = 613995161;
               int var10005x = var1x + var2x - 2 * (var1x & var2x);
               var2x = 913541532;
               var1x = var10005x;
               var10005x = var1x & ~var2x | ~var1x & var2x;
               var2x = -1108038164;
               var1x = -384366329;
               var10005x = (var1x | var2x) & ~(var1x & var2x);
               var2x = 1424205034;
               var1x = var10005x;
               var10005x = var1x + var2x - 2 * (var1x & var2x);
               int var10004x = (int)3155971900831894865L;
               var2x = 457667623;
               var1x = var10004x;
               var10004x = (var1x | var2x) - (var1x & var2x);
               var2x = -1723739666;
               var1x = var10004x;
               var10004x = (var1x | var2x) & ~(var1x & var2x);
               String var47x = "chp";
               var2x = -715107599;
               var1x = -1689262150;
               var10005x = var1x + var2x - 2 * (var1x & var2x);
               var2x = 1873258883;
               var1x = var10005x;
               var10005x = var1x + var2x - 2 * (var1x & var2x);
               int var10007x = (int)-6455572324098564017L;
               var2x = 1500968661;
               var1x = var10007x;
               var10007x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = -113912182;
               var1x = var10007x;
               var10007x = (var1x | var2x) & (~var1x | ~var2x);
               int var10006x = (int)6833174107088143857L;
               var2x = -1388515737;
               var1x = var10006x;
               var10006x = var1x + var2x - 2 * (var1x & var2x);
               var2x = 543013730;
               var1x = var10006x;
               return var10000.b(
                  c(
                     "\ue39d쮥\ue3ba쯒\ue3c2쯕\ue3b8쯝",
                     "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ",
                     var10003x,
                     var10004x,
                     var10005x,
                     var1x + var2x - 2 * (var1x & var2x)
                  )
               );
            }
         );
      var2 = 1016019317;
      var1 = 1141350174;
      int var986 = (var1 | var2) & (~var1 | ~var2);
      var2 = 30417155;
      var1 = var986;
      int var987 = var1 + var2 - 2 * (var1 & var2);
      var10004 = (int)-5546733583885230963L;
      var2 = 82790997;
      var1 = var10004;
      var10004 = var1 + var2 - 2 * (var1 & var2);
      var2 = -734524473;
      var1 = var10004;
      var2 = (var1 | var2) & ~(var1 & var2);
      var1 = var987;
      int var988 = (var1 & ~var2) + (var2 & ~var1) + 2 * (var1 & var2);
      var2 = -2124832663;
      var1 = 1806305106;
      var10004 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1257246979;
      var1 = var10004;
      var10004 = ((var1 | var2) - (var1 & var2)) * ((var1 | var2) - (var1 & var2));
      var10005 = (int)1141255631440066093L;
      var2 = 245031346;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = 433471586;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var2 = 1306790304;
      var1 = -1837550963;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var2 = 60134054;
      var1 = var10006;
      var2 = (var1 | var2) & (~var1 | ~var2);
      var1 = var10005;
      var10005 = var1 - ~var2 - 1;
      var2 = 1941478563;
      var1 = -268621356;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1375269404;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      String var1339 = "ccq";
      var2 = -65884347;
      var1 = 2019998408;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var2 = 446613579;
      var1 = var10006;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      String var1542 = "ccr";
      var10007 = (int)-5354088924121546054L;
      var2 = 884401882;
      var1 = var10007;
      var10007 = (var1 | var2) & ~(var1 & var2);
      var2 = -1154778160;
      var1 = var10007;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      var2 = -2106696814;
      var1 = 309765872;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var2 = -1877410464;
      var1 = var10009;
      var10009 = (var1 | var2) - (var1 & var2);
      int var1690 = (int)-7689480901687884829L;
      var2 = 1178607759;
      var1 = var1690;
      int var1691 = var1 & ~var2 | ~var1 & var2;
      var2 = 229917101;
      var1 = var1691;
      var10003 = c(
         "뻻⒍뻚⒋뺦⒆뺠⓱뻓⒍뫁⒌뺡⒋뻖⓳뻑⒉뻟⒁", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ", var10005, var10006, var10007, (var1 | var2) - (var1 & var2)
      );
      var10004 = (int)-3054422043881154125L;
      var2 = 1383723955;
      var1 = var10004;
      var10004 = (var1 | var2) - (var1 & var2);
      var2 = -2118965770;
      var1 = var10004;
      var10004 = var1 & ~var2 | ~var1 & var2;
      String var1342 = "ccs";
      this.i = new SliderSetting(var10003, 4.0F, 2.0F, 6.0F, 1.0F)
         .a(
            () -> {
               ModeSetting var10000 = this.e;
               int var2x = 1935799220;
               int var1x = -53765001;
               int var10002x = (var1x | var2x) & ~(var1x & var2x);
               var2x = -1884655666;
               var1x = var10002x;
               var10002x = var1x + var2x - 2 * (var1x & var2x);
               var10002x = (int)893863274015071827L;
               var2x = 1786327835;
               var1x = var10002x;
               var10002x = (var1x | var2x) - (var1x & var2x);
               var2x = 118926656;
               var1x = var10002x;
               var10002x = var1x & ~var2x | ~var1x & var2x;
               var10002x = (int)1936290283678311131L;
               var2x = -82769081;
               var1x = var10002x;
               var10002x = var1x + var2x - 2 * (var1x & var2x);
               var2x = -1965484842;
               var1x = var10002x;
               var10002x = (var1x | var2x) & ~(var1x & var2x);
               String var10003x = "chn";
               int var54x = (int)-322956658757619867L;
               var2x = 1148848941;
               var1x = var54x;
               int var55x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = 853482715;
               var1x = var55x;
               int var56x = (var1x | var2x) - (var1x & var2x);
               var2x = -653047778;
               var1x = 2078088155;
               int var10004x = (var1x | var2x) & ~(var1x & var2x);
               var2x = -2033760594;
               var1x = var10004x;
               var10004x = ((var1x | var2x) - (var1x & var2x)) * ((var1x | var2x) - (var1x & var2x));
               var2x = 817234570;
               var1x = -334567466;
               var10004x = (var1x | var2x) & ~(var1x & var2x);
               var2x = 1485020221;
               var1x = var10004x;
               var10004x = (var1x | var2x) & ~(var1x & var2x);
               int var10005x = (int)2197724588698159848L;
               var2x = -593198163;
               var1x = var10005x;
               var10005x = var1x & ~var2x | ~var1x & var2x;
               var2x = 1159718344;
               var1x = var10005x;
               var10005x = (var1x | var2x) & ~(var1x & var2x);
               var2x = 18278428;
               var1x = 444621034;
               int var10006x = (var1x | var2x) - (var1x & var2x);
               var2x = 1682532395;
               var1x = var10006x;
               var2x = (var1x | var2x) - (var1x & var2x);
               var1x = var10005x;
               var10005x = 2 * (var1x | var2x) - (var1x ^ var2x);
               var10005x = (int)-7728316274385143343L;
               var2x = -784942067;
               var1x = var10005x;
               var10005x = (var1x | var2x) & ~(var1x & var2x);
               var2x = -1204226269;
               var1x = var10005x;
               var10005x = var1x + var2x - 2 * (var1x & var2x);
               var10006x = (int)1603065396009271990L;
               var2x = -1486240519;
               var1x = var10006x;
               var10006x = var1x + var2x - 2 * (var1x & var2x);
               var2x = -2117098082;
               var1x = var10006x;
               var10006x = ((var1x | var2x) - (var1x & var2x)) * ((var1x | var2x) - (var1x & var2x));
               var10006x = (int)4537074146877700759L;
               var2x = -2074147432;
               var1x = var10006x;
               var10006x = var1x + var2x - 2 * (var1x & var2x);
               var2x = 1746312883;
               var1x = var10006x;
               return var10000.b(
                  c(
                     "\ue39e㫮\ue3b9㪙\ue3c1㪞\ue3bb㪖",
                     "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ",
                     var56x,
                     var10004x,
                     var10005x,
                     var1x + var2x - 2 * (var1x & var2x)
                  )
               );
            }
         );
      int var990 = (int)4600442583557371345L;
      var2 = 1250886992;
      var1 = var990;
      int var991 = var1 + var2 - 2 * (var1 & var2);
      var2 = 118506898;
      var1 = var991;
      int var992 = (var1 | var2) & (~var1 | ~var2);
      String var1081 = "cct";
      var2 = 215647903;
      var1 = 1419731541;
      var10005 = (var1 | var2) - (var1 & var2);
      var2 = -902183068;
      var1 = var10005;
      var10005 = (var1 + var2 - 2 * (var1 & var2)) * (var1 + var2 - 2 * (var1 & var2));
      var2 = 2082929124;
      var1 = -874432376;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = -2054850049;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      String var1343 = "ccu";
      var2 = 1956661313;
      var1 = 361101232;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var2 = -3806741;
      var1 = var10006;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      String var1546 = "ccv";
      var2 = -240697986;
      var1 = 1477800405;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1225277416;
      var1 = var10007;
      var10007 = (var1 | var2) & (~var1 | ~var2);
      var2 = -132576201;
      var1 = -571542358;
      int var1692 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1625744805;
      var1 = var1692;
      int var1693 = ((var1 | var2) & (~var1 | ~var2)) * ((var1 | var2) & (~var1 | ~var2));
      int var1694 = (int)-2182303120243265828L;
      var2 = 335466929;
      var1 = var1694;
      int var1695 = (var1 | var2) - (var1 & var2);
      var2 = -831708040;
      var1 = var1695;
      this.j = new SettingGroup(c("뻻鴧뺢鵔", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ", var10005, var10006, var10007, var1 + var2 - 2 * (var1 & var2)))
         .a(
            () -> {
               ModeSetting var10000 = this.e;
               int var2x = -925240261;
               int var1x = 1804207754;
               int var10002x = var1x + var2x - 2 * (var1x & var2x);
               var2x = -1554779458;
               var1x = var10002x;
               var10002x = var1x + var2x - 2 * (var1x & var2x);
               var10002x = (int)-3869360982918133897L;
               var2x = -1891913956;
               var1x = var10002x;
               var10002x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = 1582508128;
               var1x = var10002x;
               var10002x = var1x + var2x - 2 * (var1x & var2x);
               var2x = -2014477369;
               var1x = -1987343202;
               var10002x = (var1x | var2x) & ~(var1x & var2x);
               var2x = 1447324795;
               var1x = var10002x;
               var10002x = (var1x | var2x) & ~(var1x & var2x);
               var2x = 1868409373;
               var1x = 1552835374;
               int var10003x = (var1x | var2x) & ~(var1x & var2x);
               var2x = -1623775370;
               var1x = var10003x;
               var2x = (var1x | var2x) & ~(var1x & var2x);
               var1x = var10002x;
               var10002x = 2 * (var1x | var2x) - (var1x ^ var2x);
               int var10004x = (int)-8750767778818517843L;
               var2x = 604052565;
               var1x = var10004x;
               var10004x = var1x + var2x - 2 * (var1x & var2x);
               var2x = -1281914626;
               var1x = var10004x;
               var10004x = var1x & ~var2x | ~var1x & var2x;
               var2x = -1602655129;
               var1x = -997530379;
               var10004x = var1x & ~var2x | ~var1x & var2x;
               var2x = 1693681794;
               var1x = var10004x;
               var10004x = (var1x | var2x) & ~(var1x & var2x);
               var2x = 818181506;
               var1x = 1744061274;
               var10003x = (var1x | var2x) & ~(var1x & var2x);
               var2x = 1702006347;
               var1x = var10003x;
               var10003x = var1x + var2x - 2 * (var1x & var2x);
               var2x = -665897576;
               var1x = -1378231899;
               int var10005x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = 1972825148;
               var1x = var10005x;
               var10005x = (var1x | var2x) & (~var1x | ~var2x);
               var10004x = (int)4968416045884243899L;
               var2x = -689048699;
               var1x = var10004x;
               var10004x = var1x + var2x - 2 * (var1x & var2x);
               var2x = -1247836609;
               var1x = var10004x;
               var10004x = var1x & ~var2x | ~var1x & var2x;
               String var68x = "chm";
               var2x = 194921963;
               var1x = -1385132549;
               var10005x = var1x + var2x - 2 * (var1x & var2x);
               var2x = -1311530068;
               var1x = var10005x;
               var10005x = var1x & ~var2x | ~var1x & var2x;
               int var10006x = (int)-7285216529410740643L;
               var2x = 544139001;
               var1x = var10006x;
               var10006x = (var1x | var2x) - (var1x & var2x);
               var2x = -1682248750;
               var1x = var10006x;
               var10006x = (var1x & ~var2x | ~var1x & var2x) * (var1x & ~var2x | ~var1x & var2x);
               var10006x = (int)2443337266794668658L;
               var2x = 878236741;
               var1x = var10006x;
               var10006x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = 1235125356;
               var1x = var10006x;
               return var10000.b(
                  c(
                     "\ue39a⤈\ue3c3⥻",
                     "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ",
                     var10003x,
                     var10004x,
                     var10005x,
                     var1x & ~var2x | ~var1x & var2x
                  )
               );
            }
         );
      var10003 = "ccw";
      var10005 = (int)-7019395584252764134L;
      var2 = 576437827;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var2 = 753966676;
      var1 = var10005;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = -816404246;
      var1 = 1093004132;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var2 = -1905048689;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var10005 = (int)-5517418317902708089L;
      var2 = 1199706928;
      var1 = var10005;
      var10005 = (var1 | var2) - (var1 & var2);
      var2 = -1741184003;
      var1 = var10005;
      var10005 = ((var1 | var2) - (var1 & var2)) * ((var1 | var2) - (var1 & var2));
      var2 = 1215277732;
      var1 = 2031428557;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var2 = 54014458;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var10006 = (int)7623383201911874661L;
      var2 = 1632991800;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var2 = 1944159029;
      var1 = var10006;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var10007 = (int)3265984674714201176L;
      var2 = -894867726;
      var1 = var10007;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var2 = 986873531;
      var1 = var10007;
      var2 = (var1 | var2) & (~var1 | ~var2);
      var1 = var10006;
      var10006 = (var1 & ~var2) + (var2 & ~var1) + 2 * (var1 & var2);
      var10006 = (int)-2887463464267734404L;
      var2 = 1071832533;
      var1 = var10006;
      var10006 = (var1 | var2) - (var1 & var2);
      var2 = -1217530330;
      var1 = var10006;
      var10006 = (var1 | var2) - (var1 & var2);
      String var1551 = "ccx";
      var2 = -112817411;
      var1 = -1731259286;
      var10007 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1696047189;
      var1 = var10007;
      var10007 = (var1 | var2) & (~var1 | ~var2);
      var10009 = (int)-6884952591867840052L;
      var2 = 962941046;
      var1 = var10009;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var2 = -1154831949;
      var1 = var10009;
      var10009 = (var1 | var2) & ~(var1 & var2);
      var10009 = (int)-3519404539151428691L;
      var2 = 1064552448;
      var1 = var10009;
      var10009 = (var1 | var2) & (~var1 | ~var2);
      var2 = -511140950;
      var1 = var10009;
      var10009 = var1 + var2 - 2 * (var1 & var2);
      int var1696 = (int)7327613818665664020L;
      var2 = -1699123384;
      var1 = var1696;
      int var1697 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1110532054;
      var1 = var1697;
      var10003 = c("뻀䣂뻟䢸뻟䢹뺣䢴뫁䣈뻜䣀뻝䣈뺧䣀뻙", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ", var10005, var10006, var10007, (var1 | var2) & ~(var1 & var2));
      var2 = 546125445;
      var1 = 1822499859;
      var10004 = var1 + var2 - 2 * (var1 & var2);
      var2 = 750590714;
      var1 = var10004;
      var10004 = ((var1 | var2) & (~var1 | ~var2)) * ((var1 | var2) & (~var1 | ~var2));
      String var1201 = "ccy";
      var2 = 311450321;
      var1 = -222914892;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var2 = -1981622479;
      var1 = var10006;
      var10006 = ((var1 | var2) & (~var1 | ~var2)) * ((var1 | var2) & (~var1 | ~var2));
      var2 = -1163560497;
      var1 = 915528484;
      var10007 = (var1 | var2) & (~var1 | ~var2);
      var2 = -2023178547;
      var1 = var10007;
      var10007 = (var1 | var2) & ~(var1 & var2);
      var2 = 364602345;
      var1 = 738604945;
      int var1698 = var1 + var2 - 2 * (var1 & var2);
      var2 = -542363778;
      var1 = var1698;
      var2 = var1 + var2 - 2 * (var1 & var2);
      var1 = var10007;
      var10007 = 2 * (var1 | var2) - (var1 ^ var2);
      this.k = new SliderSetting(var10003, 1.5F, 0.5F, 5.0F, 0.1F)
         .a(
            () -> {
               int var2x = -859768544;
               int var1x = 1362417441;
               int var10001x = (var1x | var2x) - (var1x & var2x);
               var2x = -1818948540;
               var1x = var10001x;
               var10001x = var1x + var2x - 2 * (var1x & var2x);
               int var10002x = (int)-7209682440446612248L;
               var2x = 1909050667;
               var1x = var10002x;
               var10002x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = 1107305004;
               var1x = var10002x;
               var10002x = ((var1x | var2x) & ~(var1x & var2x)) * ((var1x | var2x) & ~(var1x & var2x));
               String var10003x = "chl";
               var2x = -1017751392;
               var1x = 1016285192;
               int var46x = var1x + var2x - 2 * (var1x & var2x);
               var2x = -846747589;
               var1x = var46x;
               int var47x = (var1x | var2x) - (var1x & var2x);
               var2x = -60820023;
               var1x = -1564633262;
               int var10004x = var1x & ~var2x | ~var1x & var2x;
               var2x = -1686515683;
               var1x = var10004x;
               var10004x = (var1x | var2x) & (~var1x | ~var2x);
               var10004x = (int)9020597488611882911L;
               var2x = -23431503;
               var1x = var10004x;
               var10004x = var1x + var2x - 2 * (var1x & var2x);
               var2x = 276949105;
               var1x = var10004x;
               var10004x = (var1x | var2x) & ~(var1x & var2x);
               var2x = -707811152;
               var1x = -280422655;
               int var10005x = var1x + var2x - 2 * (var1x & var2x);
               var2x = 822203690;
               var1x = var10005x;
               var10005x = ((var1x | var2x) & ~(var1x & var2x)) * ((var1x | var2x) & ~(var1x & var2x));
               var2x = -1294998882;
               var1x = -314380956;
               var10005x = var1x & ~var2x | ~var1x & var2x;
               var2x = 1211818501;
               var1x = var10005x;
               var10005x = var1x & ~var2x | ~var1x & var2x;
               int var10006x = (int)-1853682479172668800L;
               var2x = 1750763865;
               var1x = var10006x;
               var10006x = var1x + var2x - 2 * (var1x & var2x);
               var2x = -591810074;
               var1x = var10006x;
               var10006x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = -1614841922;
               var1x = 2138643876;
               int var10007x = var1x & ~var2x | ~var1x & var2x;
               var2x = -1523114589;
               var1x = var10007x;
               var2x = var1x + var2x - 2 * (var1x & var2x);
               var1x = var10006x;
               var10006x = (var1x | var2x) + (var1x & var2x);
               var2x = -846286725;
               var1x = -1809279891;
               var10006x = var1x + var2x - 2 * (var1x & var2x);
               var2x = 1502770606;
               var1x = var10006x;
               return this.e
                  .b(
                     c(
                        "\ue39d૬\ue3c4ટ",
                        "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ",
                        var47x,
                        var10004x,
                        var10005x,
                        (var1x | var2x) - (var1x & var2x)
                     )
                  );
            }
         );
      var2 = -788061155;
      var1 = 1778868303;
      int var995 = var1 & ~var2 | ~var1 & var2;
      var2 = 531571295;
      var1 = var995;
      int var996 = (var1 | var2) - (var1 & var2);
      var10004 = (int)1515799678885967476L;
      var2 = 897005689;
      var1 = var10004;
      var10004 = var1 & ~var2 | ~var1 & var2;
      var2 = -1739617157;
      var1 = var10004;
      var2 = (var1 | var2) & ~(var1 & var2);
      var1 = var996;
      int var997 = (var1 ^ var2) + 2 * (var1 & var2);
      var10004 = (int)649513374579771005L;
      var2 = 118879866;
      var1 = var10004;
      var10004 = var1 + var2 - 2 * (var1 & var2);
      var2 = 777378204;
      var1 = var10004;
      var10004 = (var1 | var2) - (var1 & var2);
      var10005 = (int)8598833116833191311L;
      var2 = 1672942165;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1248837240;
      var1 = var10005;
      var10005 = ((var1 | var2) & (~var1 | ~var2)) * ((var1 | var2) & (~var1 | ~var2));
      var2 = -241828915;
      var1 = -729941573;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var2 = 397064933;
      var1 = var10005;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = 1401125911;
      var1 = 1293245429;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1074786310;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var2 = -76047649;
      var1 = -1187418536;
      var10007 = (var1 | var2) & (~var1 | ~var2);
      var2 = 90557613;
      var1 = var10007;
      var2 = var1 & ~var2 | ~var1 & var2;
      var1 = var10006;
      var10006 = (var1 ^ var2) + 2 * (var1 & var2);
      var2 = -1054626031;
      var1 = -178302217;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var2 = -1430320241;
      var1 = var10006;
      var10006 = (var1 | var2) - (var1 & var2);
      String var1558 = "ccz";
      var2 = -565634272;
      var1 = -1723716459;
      var10007 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1729695003;
      var1 = var10007;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      var2 = 192477619;
      var1 = 1897281947;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var2 = 2054078499;
      var1 = var10009;
      var10009 = var1 + var2 - 2 * (var1 & var2);
      var10009 = (int)-3817013293693905821L;
      var2 = 378447257;
      var1 = var10009;
      var10009 = var1 + var2 - 2 * (var1 & var2);
      var2 = -387911177;
      var1 = var10009;
      var10009 = (var1 | var2) & (~var1 | ~var2);
      var2 = 908071474;
      var1 = 1576291942;
      int var1699 = var1 & ~var2 | ~var1 & var2;
      var2 = 1811375920;
      var1 = var1699;
      this.l = new SettingGroup(c("뻻㴤뻑㴢뺡㴦뺣㴮뻛", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ", var10005, var10006, var10007, var1 & ~var2 | ~var1 & var2))
         .a(
            () -> {
               ModeSetting var10000 = this.e;
               int var10001x = (int)-7692150922877006551L;
               int var2x = -2106989609;
               int var1x = var10001x;
               var10001x = (var1x | var2x) & ~(var1x & var2x);
               var2x = 920471526;
               var1x = var10001x;
               var10001x = ((var1x | var2x) - (var1x & var2x)) * ((var1x | var2x) - (var1x & var2x));
               int var10002x = (int)5925544886075659385L;
               var2x = -1535046091;
               var1x = var10002x;
               var10002x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = -457691538;
               var1x = var10002x;
               var10002x = (var1x | var2x) & ~(var1x & var2x);
               String var10003x = "chk";
               int var51x = (int)6258676828419558385L;
               var2x = -832334225;
               var1x = var51x;
               int var52x = var1x + var2x - 2 * (var1x & var2x);
               var2x = -1647598323;
               var1x = var52x;
               int var53x = (var1x | var2x) & ~(var1x & var2x);
               var2x = -217508984;
               var1x = -1838079788;
               int var10004x = (var1x | var2x) & ~(var1x & var2x);
               var2x = 306126375;
               var1x = var10004x;
               var10004x = ((var1x | var2x) & ~(var1x & var2x)) * ((var1x | var2x) & ~(var1x & var2x));
               var2x = 1340371448;
               var1x = -262934088;
               var10004x = var1x & ~var2x | ~var1x & var2x;
               var2x = 1006063476;
               var1x = var10004x;
               var10004x = (var1x | var2x) - (var1x & var2x);
               var2x = -1142069301;
               var1x = 175504302;
               int var10005x = var1x & ~var2x | ~var1x & var2x;
               var2x = 2071259141;
               var1x = var10005x;
               var10005x = (var1x | var2x) & (~var1x | ~var2x);
               int var10006x = (int)5592807587481642121L;
               var2x = 1567992288;
               var1x = var10006x;
               var10006x = var1x & ~var2x | ~var1x & var2x;
               var2x = 1153995007;
               var1x = var10006x;
               var2x = (var1x | var2x) & ~(var1x & var2x);
               var1x = var10005x;
               var10005x = (var1x & ~var2x) + (var2x & ~var1x) + 2 * (var1x & var2x);
               var10005x = (int)-6062516317689292709L;
               var2x = -291739314;
               var1x = var10005x;
               var10005x = (var1x | var2x) & ~(var1x & var2x);
               var2x = 2117791890;
               var1x = var10005x;
               var10005x = (var1x | var2x) - (var1x & var2x);
               int var10007x = (int)7844796371008220596L;
               var2x = -1423367316;
               var1x = var10007x;
               var10007x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = -836841776;
               var1x = var10007x;
               var10007x = (var1x | var2x) & ~(var1x & var2x);
               var2x = -283813629;
               var1x = -2019566278;
               var10007x = var1x & ~var2x | ~var1x & var2x;
               var2x = 1753908274;
               var1x = var10007x;
               var10007x = var1x + var2x - 2 * (var1x & var2x);
               var10006x = (int)-658384980182595238L;
               var2x = -842598484;
               var1x = var10006x;
               var10006x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = -2029270662;
               var1x = var10006x;
               return var10000.b(
                  c(
                     "\ue39c\uecab\ue3b6\uecad\ue3c6\ueca9\ue3c4\ueca1\ue3bc",
                     "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ",
                     var53x,
                     var10004x,
                     var10005x,
                     (var1x | var2x) & (~var1x | ~var2x)
                  )
               );
            }
         );
      var10003 = "cda";
      var2 = 378101954;
      var1 = 1367134987;
      var10004 = (var1 | var2) & ~(var1 & var2);
      var2 = 2116114646;
      var1 = var10004;
      var10004 = (var1 | var2) - (var1 & var2);
      var10005 = (int)-5364605682861849510L;
      var2 = 650115996;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var2 = 1534316080;
      var1 = var10005;
      var2 = (var1 | var2) & ~(var1 & var2);
      var1 = var10004;
      var10004 = (var1 & ~var2) + (var2 & ~var1) + 2 * (var1 & var2);
      var2 = 1385709870;
      var1 = 316945570;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = -1695149323;
      var1 = var10005;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var10005 = (int)3229614080109269728L;
      var2 = -154567132;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var2 = -1039625129;
      var1 = var10005;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      String var1360 = "cdb";
      var10006 = (int)-7026991114649563414L;
      var2 = 1697584129;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var2 = 679730036;
      var1 = var10006;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var2 = -1410428155;
      var1 = 1587944009;
      var10007 = (var1 | var2) - (var1 & var2);
      var2 = -348111193;
      var1 = var10007;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      var10007 = (int)2168869451140181126L;
      var2 = -73175585;
      var1 = var10007;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1248170931;
      var1 = var10007;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      var10009 = (int)3365321203525741992L;
      var2 = -1814923893;
      var1 = var10009;
      var10009 = (var1 | var2) & (~var1 | ~var2);
      var2 = 2028967972;
      var1 = var10009;
      var10009 = (var1 | var2) & ~(var1 & var2);
      int var1700 = (int)-7296786168304404685L;
      var2 = 1435999200;
      var1 = var1700;
      int var1701 = var1 & ~var2 | ~var1 & var2;
      var2 = -2122094007;
      var1 = var1701;
      var10003 = c("뻀胒뻟肨뻟肩뺣肤뫁胘뻜胐뻝胘뺧胐뻙", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ", var10005, var10006, var10007, (var1 | var2) & ~(var1 & var2));
      var2 = 933282311;
      var1 = 1726381821;
      var10005 = (var1 | var2) - (var1 & var2);
      var2 = 1363590376;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var10005 = (int)-4652944504778106381L;
      var2 = -1881147034;
      var1 = var10005;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1631084385;
      var1 = var10005;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var2 = -944176096;
      var1 = 1410965707;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var2 = 969789772;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      String var1364 = "cdc";
      var10007 = (int)-7352079240277829222L;
      var2 = -1954887274;
      var1 = var10007;
      var10007 = (var1 | var2) - (var1 & var2);
      var2 = 1316346030;
      var1 = var10007;
      var10007 = (var1 | var2) - (var1 & var2);
      this.m = new SliderSetting(var10003, 2.5F, 0.5F, 5.0F, 0.1F)
         .a(
            () -> {
               ModeSetting var10000 = this.e;
               String var10001x = "chi";
               int var2x = 1160476377;
               int var1x = -1948877960;
               int var10002x = var1x & ~var2x | ~var1x & var2x;
               var2x = -1099977265;
               var1x = var10002x;
               var10002x = var1x & ~var2x | ~var1x & var2x;
               int var10003x = (int)5980969136373424720L;
               var2x = 1105192377;
               var1x = var10003x;
               var10003x = (var1x | var2x) & ~(var1x & var2x);
               var2x = 1383437712;
               var1x = var10003x;
               var10003x = ((var1x | var2x) & ~(var1x & var2x)) * ((var1x | var2x) & ~(var1x & var2x));
               var10003x = (int)-3539048720549601629L;
               var2x = -706139656;
               var1x = var10003x;
               var10003x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = -1619226680;
               var1x = var10003x;
               var10003x = (var1x | var2x) - (var1x & var2x);
               String var10004x = "chj";
               int var53x = (int)-8136695757348591482L;
               var2x = -1148608866;
               var1x = var53x;
               int var54x = (var1x | var2x) - (var1x & var2x);
               var2x = -1502459954;
               var1x = var54x;
               int var55x = (var1x | var2x) - (var1x & var2x);
               var2x = -1521389543;
               var1x = 652556745;
               int var10005x = var1x & ~var2x | ~var1x & var2x;
               var2x = 1407638685;
               var1x = var10005x;
               var10005x = (var1x | var2x) - (var1x & var2x);
               int var10006x = (int)-8240437630259281162L;
               var2x = 270443654;
               var1x = var10006x;
               var10006x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = -1378653577;
               var1x = var10006x;
               var2x = (var1x | var2x) - (var1x & var2x);
               var1x = var10005x;
               var10005x = 2 * (var1x | var2x) - (var1x ^ var2x);
               var2x = 2070061046;
               var1x = 31908115;
               var10005x = (var1x | var2x) - (var1x & var2x);
               var2x = 1709841552;
               var1x = var10005x;
               var10005x = var1x & ~var2x | ~var1x & var2x;
               var2x = -220711815;
               var1x = 745579229;
               int var10007x = var1x + var2x - 2 * (var1x & var2x);
               var2x = -559376735;
               var1x = var10007x;
               var10007x = (var1x | var2x) & ~(var1x & var2x);
               var2x = -1483079159;
               var1x = -1674963836;
               var10007x = var1x & ~var2x | ~var1x & var2x;
               var2x = 1001395841;
               var1x = var10007x;
               var10007x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = -92982998;
               var1x = -161567607;
               var10007x = var1x + var2x - 2 * (var1x & var2x);
               var2x = 204185004;
               var1x = var10007x;
               var10007x = (var1x | var2x) - (var1x & var2x);
               var10006x = (int)-2170421694060041599L;
               var2x = -1343707997;
               var1x = var10006x;
               var10006x = (var1x | var2x) - (var1x & var2x);
               var2x = 1465226255;
               var1x = var10006x;
               return var10000.b(
                  c(
                     "\ue39f脉\ue3b5脏\ue3c5脋\ue3c7脃\ue3bf",
                     "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ",
                     var10003x,
                     var55x,
                     var10005x,
                     (var1x | var2x) & ~(var1x & var2x)
                  )
               );
            }
         );
      int var1000 = (int)6531685384892910557L;
      var2 = 25334929;
      var1 = var1000;
      int var1001 = var1 & ~var2 | ~var1 & var2;
      var2 = 487521730;
      var1 = var1001;
      int var1002 = var1 + var2 - 2 * (var1 & var2);
      var2 = 970306918;
      var1 = -1178447844;
      var10004 = (var1 | var2) - (var1 & var2);
      var2 = 305325410;
      var1 = var10004;
      var10004 = (var1 | var2) & (~var1 | ~var2);
      var10006 = (int)3445122929424047571L;
      var2 = -2108278886;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var2 = -1651922368;
      var1 = var10006;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var2 = 1539107813;
      var1 = -2121365517;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var2 = -634229737;
      var1 = var10006;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1164727450;
      var1 = 458224807;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var2 = -1818302638;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      String var1370 = "cdd";
      var10006 = (int)-5139204353371586432L;
      var2 = 23340019;
      var1 = var10006;
      var10006 = (var1 | var2) - (var1 & var2);
      var2 = 379046628;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var10007 = (int)1068100387022059496L;
      var2 = 1877788608;
      var1 = var10007;
      var10007 = (var1 | var2) - (var1 & var2);
      var2 = 1858442727;
      var1 = var10007;
      var10007 = var1 & ~var2 | ~var1 & var2;
      int var1702 = (int)-7500785857947021187L;
      var2 = -473242313;
      var1 = var1702;
      int var1703 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1358010560;
      var1 = var1703;
      var2 = (var1 | var2) & ~(var1 & var2);
      var1 = var10007;
      var10007 = 2 * (var1 | var2) - (var1 ^ var2);
      var10007 = (int)3693342000488446203L;
      var2 = 1749846831;
      var1 = var10007;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1185638360;
      var1 = var10007;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      int var1704 = (int)-6379756665457181792L;
      var2 = 199443270;
      var1 = var1704;
      int var1705 = var1 + var2 - 2 * (var1 & var2);
      var2 = 2110186542;
      var1 = var1705;
      int var1706 = (var1 | var2) & ~(var1 & var2);
      int var1707 = (int)-1814490902953102407L;
      var2 = 1634482161;
      var1 = var1707;
      int var1708 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1209314010;
      var1 = var1708;
      var10003 = c(
         "뻁\ue8d0뻖\ue8dc뻔\ue8a0뫁\ue8da뻓\ue8d0뻕\ue8a0뻑\ue8a2뻙\ue8da뻑",
         "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ",
         var10005,
         var10006,
         var10007,
         var1 & ~var2 | ~var1 & var2
      );
      var10004 = (int)7079844282646997266L;
      var2 = 1854904883;
      var1 = var10004;
      var10004 = (var1 | var2) - (var1 & var2);
      var2 = 1183001952;
      var1 = var10004;
      var10004 = (var1 | var2) - (var1 & var2);
      String var1223 = "cde";
      var2 = 856495944;
      var1 = 747582599;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      var2 = 576252631;
      var1 = var10007;
      var10007 = ((var1 | var2) & ~(var1 & var2)) * ((var1 | var2) & ~(var1 & var2));
      this.n = new SliderSetting(var10003, 1.4F, 0.5F, 2.0F, 0.1F)
         .a(
            () -> {
               String var10001x = "chg";
               String var10002x = "chh";
               int var2x = 1934177727;
               int var1x = 1455269460;
               int var10003x = var1x & ~var2x | ~var1x & var2x;
               var2x = 1965700858;
               var1x = var10003x;
               var10003x = (var1x | var2x) & (~var1x | ~var2x);
               int var10004x = (int)-3521560591615695091L;
               var2x = -700735711;
               var1x = var10004x;
               var10004x = var1x + var2x - 2 * (var1x & var2x);
               var2x = -2110632949;
               var1x = var10004x;
               var2x = var1x & ~var2x | ~var1x & var2x;
               var1x = var10003x;
               var10003x = var1x - ~var2x - 1;
               var2x = 126177690;
               var1x = 640872487;
               var10003x = (var1x | var2x) & ~(var1x & var2x);
               var2x = 334829870;
               var1x = var10003x;
               var10003x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = -1704366619;
               var1x = -1820069943;
               var10004x = var1x & ~var2x | ~var1x & var2x;
               var2x = -267684164;
               var1x = var10004x;
               var10004x = (var1x + var2x - 2 * (var1x & var2x)) * (var1x + var2x - 2 * (var1x & var2x));
               var2x = 1501824379;
               var1x = 1711983901;
               var10004x = (var1x | var2x) - (var1x & var2x);
               var2x = -1144779979;
               var1x = var10004x;
               var10004x = var1x + var2x - 2 * (var1x & var2x);
               var2x = -860516407;
               var1x = -703316160;
               int var10005x = (var1x | var2x) - (var1x & var2x);
               var2x = 2133400515;
               var1x = var10005x;
               var10005x = (var1x + var2x - 2 * (var1x & var2x)) * (var1x + var2x - 2 * (var1x & var2x));
               var2x = -912326140;
               var1x = -1402797179;
               var10005x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = 2079373789;
               var1x = var10005x;
               var10005x = (var1x | var2x) - (var1x & var2x);
               var2x = -1805670077;
               var1x = 236883954;
               int var10006x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = -232068196;
               var1x = var10006x;
               var10006x = ((var1x | var2x) & (~var1x | ~var2x)) * ((var1x | var2x) & (~var1x | ~var2x));
               var10006x = (int)1532074310949853873L;
               var2x = -195938427;
               var1x = var10006x;
               var10006x = var1x & ~var2x | ~var1x & var2x;
               var2x = 98584221;
               var1x = var10006x;
               return this.e
                  .b(
                     c(
                        "\ue39e\uf08c\ue3b4\uf08a\ue3c4\uf08e\ue3c6\uf086\ue3be",
                        "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ",
                        var10003x,
                        var10004x,
                        var10005x,
                        (var1x | var2x) - (var1x & var2x)
                     )
                  );
            }
         );
      var2 = -1288203721;
      var1 = 1844589854;
      var10004 = (var1 | var2) & (~var1 | ~var2);
      var2 = -557471955;
      var1 = var10004;
      var10004 = (var1 | var2) & ~(var1 & var2);
      var10004 = (int)2550689577821128135L;
      var2 = -303734928;
      var1 = var10004;
      var10004 = (var1 | var2) & (~var1 | ~var2);
      var2 = -944465218;
      var1 = var10004;
      var10004 = (var1 | var2) & ~(var1 & var2);
      var10004 = (int)-8346053681294121299L;
      var2 = -444911175;
      var1 = var10004;
      var10004 = (var1 | var2) - (var1 & var2);
      var2 = -1889249514;
      var1 = var10004;
      var10004 = (var1 | var2) & ~(var1 & var2);
      var2 = -1675379111;
      var1 = 1310818190;
      var10004 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1593733413;
      var1 = var10004;
      var10004 = (var1 | var2) & ~(var1 & var2);
      var10005 = (int)-2615673362273726562L;
      var2 = -573564315;
      var1 = var10005;
      var10005 = (var1 | var2) - (var1 & var2);
      var2 = -999147768;
      var1 = var10005;
      var2 = (var1 | var2) & (~var1 | ~var2);
      var1 = var10004;
      var10004 = (var1 & ~var2) + (var2 & ~var1) + 2 * (var1 & var2);
      String var1226 = "cdf";
      var2 = 345213862;
      var1 = -1446189109;
      var10005 = (var1 | var2) - (var1 & var2);
      var2 = -1893870338;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var10006 = (int)-2473917893597580908L;
      var2 = -488672646;
      var1 = var10006;
      var10006 = (var1 | var2) - (var1 & var2);
      var2 = 151482451;
      var1 = var10006;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var10007 = (int)-9117645311396227169L;
      var2 = -792116699;
      var1 = var10007;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      var2 = -450669263;
      var1 = var10007;
      var2 = var1 & ~var2 | ~var1 & var2;
      var1 = var10006;
      var10006 = var1 - ~var2 - 1;
      var10006 = (int)2328299121312463640L;
      var2 = -1277364518;
      var1 = var10006;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var2 = 632650904;
      var1 = var10006;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var2 = 646610542;
      var1 = 2001853865;
      var10007 = (var1 | var2) & ~(var1 & var2);
      var2 = -1065119488;
      var1 = var10007;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      var2 = -354448820;
      var1 = -1976085435;
      int var1709 = (var1 | var2) - (var1 & var2);
      var2 = 2106860995;
      var1 = var1709;
      var2 = (var1 | var2) - (var1 & var2);
      var1 = var10007;
      var10007 = (var1 | var2) + (var1 & var2);
      var10007 = (int)-4895314440607252382L;
      var2 = -702196442;
      var1 = var10007;
      var10007 = (var1 | var2) & ~(var1 & var2);
      var2 = 837733137;
      var1 = var10007;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var2 = 428725490;
      var1 = -1150245120;
      int var1710 = (var1 | var2) - (var1 & var2);
      var2 = -480622535;
      var1 = var1710;
      int var1711 = (var1 | var2) & (~var1 | ~var2);
      int var1712 = (int)3186398483738005062L;
      var2 = -433666665;
      var1 = var1712;
      int var1713 = var1 & ~var2 | ~var1 & var2;
      var2 = 235699588;
      var1 = var1713;
      this.o = new SettingGroup(c("뻿끧뻐뀟뺣뀗", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ", var10005, var10006, var10007, var1 & ~var2 | ~var1 & var2))
         .a(
            () -> {
               ModeSetting var10000 = this.e;
               String var10001x = "chf";
               int var10002x = (int)-1502070337680492560L;
               int var2x = -486329347;
               int var1x = var10002x;
               var10002x = (var1x | var2x) - (var1x & var2x);
               var2x = -185058513;
               var1x = var10002x;
               var10002x = (var1x | var2x) & (~var1x | ~var2x);
               int var10003x = (int)-726401084861996480L;
               var2x = 1540053421;
               var1x = var10003x;
               var10003x = var1x + var2x - 2 * (var1x & var2x);
               var2x = -2066864822;
               var1x = var10003x;
               var2x = (var1x | var2x) - (var1x & var2x);
               var1x = var10002x;
               var10002x = (var1x ^ var2x) + 2 * (var1x & var2x);
               var2x = -215584525;
               var1x = 1831232562;
               var10003x = var1x & ~var2x | ~var1x & var2x;
               var2x = 2119045095;
               var1x = var10003x;
               var10003x = (var1x | var2x) & (~var1x | ~var2x);
               var10003x = (int)7633761138660232956L;
               var2x = 885132650;
               var1x = var10003x;
               var10003x = var1x & ~var2x | ~var1x & var2x;
               var2x = 1820785413;
               var1x = var10003x;
               var10003x = var1x & ~var2x | ~var1x & var2x;
               var2x = 443052282;
               var1x = 1965755029;
               int var10004x = var1x & ~var2x | ~var1x & var2x;
               var2x = -129239538;
               var1x = var10004x;
               var10004x = var1x + var2x - 2 * (var1x & var2x);
               int var10005x = (int)4311553946866435230L;
               var2x = -705087937;
               var1x = var10005x;
               var10005x = var1x & ~var2x | ~var1x & var2x;
               var2x = -394117691;
               var1x = var10005x;
               var2x = var1x & ~var2x | ~var1x & var2x;
               var1x = var10004x;
               var10004x = (var1x | var2x) + (var1x & var2x);
               var2x = -931782025;
               var1x = -382117990;
               var10004x = var1x & ~var2x | ~var1x & var2x;
               var2x = -1524667855;
               var1x = var10004x;
               var10004x = (var1x | var2x) - (var1x & var2x);
               var2x = 2134884763;
               var1x = 1035069923;
               var10005x = (var1x | var2x) - (var1x & var2x);
               var2x = -1713870741;
               var1x = var10005x;
               var10005x = (var1x + var2x - 2 * (var1x & var2x)) * (var1x + var2x - 2 * (var1x & var2x));
               var10005x = (int)-3441989192455060460L;
               var2x = -116343914;
               var1x = var10005x;
               var10005x = (var1x | var2x) - (var1x & var2x);
               var2x = 747231738;
               var1x = var10005x;
               var10005x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = -385919377;
               var1x = -84970779;
               int var10007x = var1x & ~var2x | ~var1x & var2x;
               var2x = 303047823;
               var1x = var10007x;
               var10007x = var1x + var2x - 2 * (var1x & var2x);
               int var10006x = (int)-6713223145403662318L;
               var2x = -1809622923;
               var1x = var10006x;
               var10006x = (var1x | var2x) & ~(var1x & var2x);
               var2x = -2072670122;
               var1x = var10006x;
               return var10000.b(
                  c(
                     "\ue395卩\ue3ba匑\ue3c9匙",
                     "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ",
                     var10003x,
                     var10004x,
                     var10005x,
                     (var1x | var2x) - (var1x & var2x)
                  )
               );
            }
         );
      int var1004 = (int)-4735817440431713266L;
      var2 = 779423770;
      var1 = var1004;
      int var1005 = var1 & ~var2 | ~var1 & var2;
      var2 = 537711410;
      var1 = var1005;
      int var1006 = ((var1 | var2) - (var1 & var2)) * ((var1 | var2) - (var1 & var2));
      var2 = -1250964970;
      var1 = -1380340694;
      var10004 = (var1 | var2) & ~(var1 & var2);
      var2 = 298462587;
      var1 = var10004;
      var10004 = ((var1 | var2) - (var1 & var2)) * ((var1 | var2) - (var1 & var2));
      var10006 = (int)6919167537893173100L;
      var2 = -348092042;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var2 = -1899368941;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var2 = -1021613598;
      var1 = 642728382;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var2 = -447469488;
      var1 = var10006;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var2 = -702413716;
      var1 = 1435894824;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var2 = -2085355442;
      var1 = var10006;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var10005 = (int)4445475696156540561L;
      var2 = -793154042;
      var1 = var10005;
      var10005 = (var1 | var2) - (var1 & var2);
      var2 = 1307650052;
      var1 = var10005;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var10006 = (int)-1917283205665486205L;
      var2 = 1388058747;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var2 = -1946466074;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var10007 = (int)-2812691983291598548L;
      var2 = 1522870596;
      var1 = var10007;
      var10007 = (var1 | var2) & ~(var1 & var2);
      var2 = 2002619008;
      var1 = var10007;
      var2 = var1 & ~var2 | ~var1 & var2;
      var1 = var10006;
      var10006 = (var1 ^ var2) + 2 * (var1 & var2);
      var10006 = (int)-7848826798245097044L;
      var2 = -1067212813;
      var1 = var10006;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var2 = -41813713;
      var1 = var10006;
      var10006 = (var1 | var2) - (var1 & var2);
      var2 = -1807703117;
      var1 = 1322665608;
      var10007 = (var1 | var2) - (var1 & var2);
      var2 = -1735981608;
      var1 = var10007;
      var10007 = (var1 | var2) & ~(var1 & var2);
      var10007 = (int)-6525721076458420157L;
      var2 = -1361625371;
      var1 = var10007;
      var10007 = (var1 | var2) & ~(var1 & var2);
      var2 = -626150080;
      var1 = var10007;
      var10007 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1709937564;
      var1 = -280306648;
      int var1714 = (var1 | var2) - (var1 & var2);
      var2 = -875672563;
      var1 = var1714;
      int var1715 = (var1 + var2 - 2 * (var1 & var2)) * (var1 + var2 - 2 * (var1 & var2));
      var2 = -587856174;
      var1 = 1185328742;
      int var1716 = (var1 | var2) - (var1 & var2);
      var2 = -1709615905;
      var1 = var1716;
      var10003 = c("뻅﨧뺡逸뻑", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ", var10005, var10006, var10007, (var1 | var2) & (~var1 | ~var2));
      var2 = -513512181;
      var1 = 312070851;
      var10004 = (var1 | var2) - (var1 & var2);
      var2 = -201474101;
      var1 = var10004;
      String[] var1111 = new String[(var1 | var2) & (~var1 | ~var2)];
      var2 = 1243952866;
      var1 = 54426794;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var2 = 1226525256;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var2 = -497569568;
      var1 = 2083921577;
      var10007 = (var1 | var2) & ~(var1 & var2);
      var2 = -1163173552;
      var1 = var10007;
      var10007 = (var1 | var2) - (var1 & var2);
      int var1717 = (int)3751702054981532532L;
      var2 = 519683925;
      var1 = var1717;
      int var1718 = var1 & ~var2 | ~var1 & var2;
      var2 = 1528536674;
      var1 = var1718;
      var2 = var1 + var2 - 2 * (var1 & var2);
      var1 = var10007;
      var10007 = (var1 | var2) + (var1 & var2);
      var10009 = (int)8709335849408606199L;
      var2 = 57215756;
      var1 = var10009;
      var10009 = (var1 | var2) - (var1 & var2);
      var2 = -1627773703;
      var1 = var10009;
      var10009 = (var1 | var2) - (var1 & var2);
      var2 = 935525789;
      var1 = -1141251452;
      var10009 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1942282475;
      var1 = var10009;
      var10009 = (var1 | var2) & ~(var1 & var2);
      var2 = -1205189985;
      var1 = 1315966771;
      var10009 = (var1 | var2) - (var1 & var2);
      var2 = -81786503;
      var1 = var10009;
      var10009 = (var1 | var2) - (var1 & var2);
      var2 = 1630605019;
      var1 = -436867966;
      int var1897 = (var1 | var2) & ~(var1 & var2);
      var2 = -577794595;
      var1 = var1897;
      var2 = (var1 | var2) & ~(var1 & var2);
      var1 = var10009;
      var10009 = var1 - ~var2 - 1;
      var10009 = 743035936 ^ 1762875339 ^ 1998076792;
      int var1898 = (-1460317001 ^ 129937149 ^ -556438824) + (1263735872 ^ -1286024672 ^ -2028051607);
      int var1899 = (int)3558072983430289790L ^ -690664323 ^ -1371865637;
      var10011 = ((int)960268413744600444L ^ 2055869184 ^ -22280759) + ((int)5348184977229707384L ^ 1382696981 ^ 1397862246);
      var10011 = (int)8553705795150066754L ^ 434200308 ^ -166965567;
      String var1972 = "cdg";
      var1111[var10006] = c(
         "뻀ꯣ뺡ꮔ뻚ꮛ뻙", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ", var10009, var1899, var10011, -464031336 ^ -2056926820 ^ 1631196631
      );
      var10006 = (int)-2622570263780169738L ^ -1920040759 ^ -110106818;
      String var1596 = "cdh";
      var10008 = "cdi";
      var10009 = ((int)-8908708229099722354L ^ 1024784570 ^ 120590317) * ((int)-8908708229099722354L ^ 1024784570 ^ 120590317);
      var10009 = -1650311570 ^ -496990590 ^ 1300234367;
      var10011 = -1878751756 ^ 1830196857 ^ -49146997;
      var10011 = (int)-3678010551808597395L ^ -1777727365 ^ 1296394773;
      var10011 = -660358707 ^ -1640236982 ^ 1184383382;
      var10011 = (int)4777096629515925444L ^ -1559643746 ^ -1358262699;
      var10011 = -642082424 ^ -812487673 ^ 371783048;
      int var1900 = (int)-6561825594171804919L ^ 1307116303 ^ -1911659615;
      var10011 = ((int)6775936048995166391L ^ 270444258 ^ 1556774210) + (771657449 ^ 1826108005 ^ 394153902);
      var10011 = (int)-4461643961347243598L ^ -216977519 ^ 1597561065;
      var10012 = (int)6095220043570206342L ^ 1821952589 ^ 2010256544;
      var1111[var10006] = c(
         "뻁Ữ뻝ỡ뺪", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ", var10009, var1900, var10011, -1145785595 ^ -1272897902 ^ 260093237
      );
      var10006 = (int)-752597498107971776L ^ -934407954 ^ -769448020;
      String var1597 = "cdj";
      int var1720 = (-1214856888 ^ 1727488944 ^ 1493878910) + (-781479802 ^ -1545671618 ^ -1808416520);
      int var1901 = -1573460124 ^ 75574985 ^ -1497904722;
      var10009 = (int)3387315764103045924L ^ -1123698203 ^ 305554002;
      int var1902 = ((int)5331795323173189406L ^ 461595285 ^ -338701961) * ((int)5331795323173189406L ^ 461595285 ^ -338701961);
      int var1903 = -259524970 ^ -1445507653 ^ -944381487;
      String var1946 = "cdk";
      var10011 = 1052077844 ^ 1022430707 ^ 487670795;
      var10012 = ((int)-2429677795980370676L ^ 1700143488 ^ -61169714) + ((int)-2597003762329803093L ^ -949124111 ^ 503983873);
      var1111[var10006] = c(
         "뻻駆뻐駎", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ", var10009, var1903, var10011, -1336204115 ^ 1127687795 ^ -215442135
      );
      var10005 = ((int)6822502082289747955L ^ -523073036 ^ -1731021838) * ((int)6822502082289747955L ^ -523073036 ^ -1731021838);
      var10007 = 1306062117 ^ -2049969862 ^ -938009576;
      var10007 = (int)2339877383372497362L ^ -1472032253 ^ -1784548416;
      var10007 = -1510649616 ^ 2137766969 ^ -627118885;
      var10007 = (int)8719950801031742231L ^ -351560434 ^ 1231740443;
      var10007 = -510287427 ^ -561445428 ^ 1058841696;
      var10007 = (-1179362 ^ -1691709922 ^ -2050495334) * (-1179362 ^ -1691709922 ^ -2050495334);
      var10007 = 798505582 ^ 178697857 ^ 394015868;
      int var1721 = (-156354536 ^ -1630837525 ^ 612441528) + (-866052323 ^ 1373066208 ^ 1553945940);
      int var1722 = (int)-2382284264083844935L ^ -243536254 ^ 49562009;
      String var1830 = "cdl";
      var10009 = (int)5303677267152824539L ^ -1713353617 ^ 1317229668;
      int var1904 = (29153903 ^ -1904857473 ^ 1936594379) + (101006771 ^ 797108721 ^ 91418415);
      this.p = new ModeSetting(
            var10003,
            var1111,
            c(
               "뻀芭뺡苚뻚苕뻙",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ",
               var10007,
               var1722,
               var10009,
               (int)4342652272874847983L ^ -1440956381 ^ 1904491089
            )
         )
         .a(
            () -> {
               ModeSetting var10000 = this.e;
               int var2x = -340753582;
               int var1x = -1960270930;
               int var10001x = var1x & ~var2x | ~var1x & var2x;
               var2x = -2041265831;
               var1x = var10001x;
               var10001x = ((var1x | var2x) & ~(var1x & var2x)) * ((var1x | var2x) & ~(var1x & var2x));
               var2x = 2048453414;
               var1x = 1436231637;
               int var10002x = (var1x | var2x) & ~(var1x & var2x);
               var2x = -1871092875;
               var1x = var10002x;
               var10002x = var1x + var2x - 2 * (var1x & var2x);
               int var10003x = (int)5734129730608011187L;
               var2x = -90363980;
               var1x = var10003x;
               var10003x = var1x & ~var2x | ~var1x & var2x;
               var2x = 1272750098;
               var1x = var10003x;
               var2x = var1x + var2x - 2 * (var1x & var2x);
               var1x = var10002x;
               var10002x = (var1x | var2x) + (var1x & var2x);
               var2x = -662258272;
               var1x = -1683981379;
               var10003x = var1x + var2x - 2 * (var1x & var2x);
               var2x = 2043963922;
               var1x = var10003x;
               var10003x = ((var1x | var2x) - (var1x & var2x)) * ((var1x | var2x) - (var1x & var2x));
               var2x = 273822623;
               var1x = 2047941532;
               var10003x = (var1x | var2x) & ~(var1x & var2x);
               var2x = 1476497552;
               var1x = var10003x;
               var10003x = (var1x | var2x) & ~(var1x & var2x);
               int var10004x = (int)1485271616987328016L;
               var2x = 388377672;
               var1x = var10004x;
               var10004x = (var1x | var2x) - (var1x & var2x);
               var2x = 57990649;
               var1x = var10004x;
               var10004x = (var1x | var2x) & ~(var1x & var2x);
               var2x = 457408180;
               var1x = 971329658;
               var10004x = var1x & ~var2x | ~var1x & var2x;
               var2x = 1021052210;
               var1x = var10004x;
               var10004x = var1x + var2x - 2 * (var1x & var2x);
               var2x = -385277505;
               var1x = 2139918770;
               int var10005x = (var1x | var2x) & ~(var1x & var2x);
               var2x = 823544202;
               var1x = var10005x;
               var10005x = ((var1x | var2x) & ~(var1x & var2x)) * ((var1x | var2x) & ~(var1x & var2x));
               var2x = -1609838040;
               var1x = -179037838;
               var10005x = var1x + var2x - 2 * (var1x & var2x);
               var2x = 1153529193;
               var1x = var10005x;
               var10005x = var1x + var2x - 2 * (var1x & var2x);
               int var10007x = (int)6079908598385570118L;
               var2x = 211691006;
               var1x = var10007x;
               var10007x = (var1x | var2x) & ~(var1x & var2x);
               var2x = 1560499387;
               var1x = var10007x;
               var10007x = (var1x | var2x) - (var1x & var2x);
               var10007x = (int)7893777245252955841L;
               var2x = 1503619638;
               var1x = var10007x;
               var10007x = (var1x | var2x) & ~(var1x & var2x);
               var2x = -2034088715;
               var1x = var10007x;
               var10007x = (var1x | var2x) & ~(var1x & var2x);
               var2x = 1776262744;
               var1x = 434050252;
               int var10006x = (var1x | var2x) - (var1x & var2x);
               var2x = 1882880733;
               var1x = var10006x;
               return var10000.b(
                  c("㾭眩㾂睑㿱睙", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ", var10003x, var10004x, var10005x, (var1x | var2x) & ~(var1x & var2x))
               );
            }
         );
      var10004 = -354973043 ^ -691217897 ^ 1008423065;
      var10004 = (1823090625 ^ 1673913872 ^ 1518245141) * (1823090625 ^ 1673913872 ^ 1518245141);
      var10006 = 666190360 ^ -123119153 ^ -551805989;
      var10006 = 20377106 ^ 993190211 ^ 973344592;
      var10005 = (int)592888756855668401L ^ 1874284825 ^ -2109630661;
      var10006 = ((int)-1575474902470907850L ^ -2058530663 ^ 1407721598) + (916106785 ^ -1949036461 ^ -1508701881);
      var10006 = (int)3653395186614984070L ^ -278397871 ^ -1551765984;
      var10007 = ((int)2531734742485068632L ^ 1714724374 ^ -2067637497) * ((int)2531734742485068632L ^ 1714724374 ^ -2067637497);
      var10007 = 1301502345 ^ 1687731799 ^ 575271616;
      var10008 = "cdm";
      var10003 = c(
         "뻀ኺ뻟ዀ뻟\u12c1뺣ዌ뫁ኰ뻜ኸ뻝ኰ뺧ኸ뻙",
         "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ",
         var10005,
         var10006,
         var10007,
         (int)-4332072751650746619L ^ 543262179 ^ -1059267052
      );
      String var1114 = "cdn";
      var10005 = (90244803 ^ -234290424 ^ 1206830972) * (90244803 ^ -234290424 ^ 1206830972);
      String var1403 = "cdo";
      int var1724 = (int)-5567539257481070382L ^ 1004349466 ^ 655446208;
      int var1725 = -1102809450 ^ -562696791 ^ 1613863740;
      int var1726 = -31228480 ^ -647402857 ^ 659167071;
      this.q = new SliderSetting(var10003, 1.5F, 0.5F, 5.0F, 0.1F)
         .a(
            () -> {
               ModeSetting var10000 = this.e;
               String var10001x = "che";
               int var2x = -851223004;
               int var1x = -1973366973;
               int var10002x = (var1x | var2x) - (var1x & var2x);
               var2x = 770722737;
               var1x = var10002x;
               var10002x = var1x + var2x - 2 * (var1x & var2x);
               int var10003x = (int)-7746398649919959602L;
               var2x = 1794124328;
               var1x = var10003x;
               var10003x = var1x + var2x - 2 * (var1x & var2x);
               var2x = -1627807182;
               var1x = var10003x;
               var2x = (var1x | var2x) - (var1x & var2x);
               var1x = var10002x;
               var10002x = (var1x ^ var2x) + 2 * (var1x & var2x);
               var10003x = (int)7450589302978893573L;
               var2x = -1269330029;
               var1x = var10003x;
               var10003x = (var1x | var2x) - (var1x & var2x);
               var2x = 1370871376;
               var1x = var10003x;
               var10003x = var1x + var2x - 2 * (var1x & var2x);
               var10003x = (int)-5489371204468758581L;
               var2x = -1193290929;
               var1x = var10003x;
               var10003x = var1x & ~var2x | ~var1x & var2x;
               var2x = -1073951721;
               var1x = var10003x;
               var10003x = (var1x | var2x) - (var1x & var2x);
               var2x = -1387863936;
               var1x = 1075423516;
               int var10004x = var1x + var2x - 2 * (var1x & var2x);
               var2x = -1192009313;
               var1x = var10004x;
               var10004x = var1x + var2x - 2 * (var1x & var2x);
               var2x = 691928175;
               var1x = 676002496;
               var10004x = (var1x | var2x) & ~(var1x & var2x);
               var2x = 523594921;
               var1x = var10004x;
               var10004x = (var1x | var2x) & ~(var1x & var2x);
               int var10006x = (int)6743010007734425921L;
               var2x = 2061583905;
               var1x = var10006x;
               var10006x = (var1x | var2x) & ~(var1x & var2x);
               var2x = 957046624;
               var1x = var10006x;
               var10006x = (var1x | var2x) & ~(var1x & var2x);
               var2x = 1562863215;
               var1x = 1769655068;
               int var10005x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = 339807221;
               var1x = var10005x;
               var10005x = (var1x | var2x) & ~(var1x & var2x);
               var10006x = (int)4449398518000028307L;
               var2x = -811852521;
               var1x = var10006x;
               var10006x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = -1478815231;
               var1x = var10006x;
               var10006x = (var1x | var2x) - (var1x & var2x);
               var10006x = (int)-6813875908783992276L;
               var2x = -1731562093;
               var1x = var10006x;
               var10006x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = -106968595;
               var1x = var10006x;
               return var10000.b(
                  c("㾬ꤳ㾃ꥋ㿰ꥃ", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ", var10003x, var10004x, var10005x, (var1x | var2x) - (var1x & var2x))
               );
            }
         );
      int var1009 = (int)-8162865204628852339L ^ -209175599 ^ -681354322;
      var10005 = 1596221824 ^ -1610833407 ^ -1059533934;
      var10005 = (1214876876 ^ -1932692587 ^ 1252586253) + ((int)-63906750311382732L ^ 947741461 ^ -1337724062);
      var10005 = 422084195 ^ 1377307548 ^ 2037566828;
      var10007 = (int)1425543892521465872L ^ -1019228757 ^ -834144854;
      var10007 = 814749561 ^ 1367499725 ^ 1628599478;
      var10007 = 1116648457 ^ -1074748769 ^ -42068345;
      var10006 = -1467996332 ^ 1011137825 ^ 168218898;
      var10007 = (1613170734 ^ -1850953360 ^ -1492600287) * (1613170734 ^ -1850953360 ^ -1492600287);
      var10007 = (int)771165922536162084L ^ 1293328696 ^ 1419474146;
      int var1727 = (-26256640 ^ -524709763 ^ 637875052) + (418122023 ^ -1350900545 ^ -489674097);
      var10003 = c(
         "뻅阨뻒陓뺡鈰뻞阮뫁阪뺡陓뻒陓",
         "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ",
         var10005,
         var10006,
         var10007,
         (int)6665454404966317519L ^ -203146122 ^ -1454255653
      );
      var10005 = (int)424248454691790212L ^ -908002620 ^ 260663123;
      var10006 = ((int)-3115769092107391929L ^ -452597393 ^ 514793903) * ((int)-3115769092107391929L ^ -452597393 ^ 514793903);
      this.r = new SliderSetting(var10003, 3.0F, 2.0F, 8.0F, 1.0F)
         .a(
            () -> {
               ModeSetting var10000 = this.e;
               int var2x = 1931416699;
               int var1x = -2004721283;
               int var10001x = var1x + var2x - 2 * (var1x & var2x);
               var2x = 2088846992;
               var1x = var10001x;
               var10001x = (var1x | var2x) - (var1x & var2x);
               int var10002x = (int)1461549140435996482L;
               var2x = -2127234729;
               var1x = var10002x;
               var10002x = var1x & ~var2x | ~var1x & var2x;
               var2x = 157687934;
               var1x = var10002x;
               var2x = (var1x | var2x) & ~(var1x & var2x);
               var1x = var10001x;
               var10001x = var1x - ~var2x - 1;
               var2x = 2039601453;
               var1x = 770295151;
               int var10003x = (var1x | var2x) & ~(var1x & var2x);
               var2x = 1417157705;
               var1x = var10003x;
               var10003x = (var1x | var2x) & (~var1x | ~var2x);
               var10003x = (int)-7092280738582407648L;
               var2x = 2100653764;
               var1x = var10003x;
               var10003x = var1x & ~var2x | ~var1x & var2x;
               var2x = -733595410;
               var1x = var10003x;
               var10003x = var1x & ~var2x | ~var1x & var2x;
               var10003x = (int)-4451900756376958485L;
               var2x = 347908710;
               var1x = var10003x;
               var10003x = var1x + var2x - 2 * (var1x & var2x);
               var2x = 2087150466;
               var1x = var10003x;
               var10003x = (var1x | var2x) - (var1x & var2x);
               int var10004x = (int)-1664744255803896050L;
               var2x = -738255478;
               var1x = var10004x;
               var10004x = var1x + var2x - 2 * (var1x & var2x);
               var2x = -1257188721;
               var1x = var10004x;
               var10004x = (var1x | var2x) - (var1x & var2x);
               var10004x = (int)6028367400986355556L;
               var2x = 1749669213;
               var1x = var10004x;
               var10004x = var1x & ~var2x | ~var1x & var2x;
               var2x = 1327493691;
               var1x = var10004x;
               var10004x = (var1x | var2x) & ~(var1x & var2x);
               var10004x = (int)-6393971004547561918L;
               var2x = -1333498922;
               var1x = var10004x;
               var10004x = var1x & ~var2x | ~var1x & var2x;
               var2x = 827321734;
               var1x = var10004x;
               var10004x = var1x & ~var2x | ~var1x & var2x;
               var10003x = (int)-3476957269756673677L;
               var2x = -1877792018;
               var1x = var10003x;
               var10003x = var1x & ~var2x | ~var1x & var2x;
               var2x = 1319146254;
               var1x = var10003x;
               var10003x = (var1x | var2x) & ~(var1x & var2x);
               var10004x = (int)-9150312278915794582L;
               var2x = -1395529075;
               var1x = var10004x;
               var10004x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = 1165113361;
               var1x = var10004x;
               var10004x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = -648437111;
               var1x = -405643895;
               var10004x = (var1x | var2x) - (var1x & var2x);
               var2x = 553065553;
               var1x = var10004x;
               var10004x = var1x + var2x - 2 * (var1x & var2x);
               int var10006x = (int)2777697475676726827L;
               var2x = -1654324713;
               var1x = var10006x;
               var10006x = var1x + var2x - 2 * (var1x & var2x);
               var2x = -1101994963;
               var1x = var10006x;
               var10006x = (var1x | var2x) & (~var1x | ~var2x);
               int var10005x = (int)8418002299263553409L;
               var2x = 1639377109;
               var1x = var10005x;
               var10005x = (var1x | var2x) - (var1x & var2x);
               var2x = -283164475;
               var1x = var10005x;
               var10005x = (var1x | var2x) & (~var1x | ~var2x);
               var10006x = (int)8838227888243921520L;
               var2x = -1500554625;
               var1x = var10006x;
               var10006x = var1x + var2x - 2 * (var1x & var2x);
               var2x = 465470463;
               var1x = var10006x;
               var10006x = var1x + var2x - 2 * (var1x & var2x);
               int var10007x = (int)2036295392938410672L;
               var2x = -400633773;
               var1x = var10007x;
               var10007x = var1x + var2x - 2 * (var1x & var2x);
               var2x = 706147492;
               var1x = var10007x;
               var2x = (var1x | var2x) & (~var1x | ~var2x);
               var1x = var10006x;
               var10006x = var1x - ~var2x - 1;
               var2x = -1808740869;
               var1x = -1689964893;
               var10006x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = 256394436;
               var1x = var10006x;
               return var10000.b(
                  c("㾯\u20fe㾀₆㿳₎", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ", var10003x, var10004x, var10005x, var1x & ~var2x | ~var1x & var2x)
               );
            }
         );
      var10004 = -1663303153 ^ 1216007939 ^ -727266020;
      var10004 = (int)-3856763767507426928L ^ -1855558252 ^ 108596239;
      String var1117 = "cdp";
      var10006 = 690196707 ^ 2107182777 ^ 1421516379;
      var10006 = -1546974387 ^ 1936621736 ^ -794457114;
      var10005 = (int)2092023861037706448L ^ -252272045 ^ -662751728;
      var10006 = ((int)-5768599734337214158L ^ -1868836922 ^ -1725517952) + (1648110018 ^ 1213423251 ^ 1684063786);
      var10006 = -1094478871 ^ -948151086 ^ -418372468;
      var10007 = ((int)-6154687936434531171L ^ 1435412646 ^ 2072959739) + (1315978604 ^ 1974725939 ^ -705421362);
      var10007 = 155712026 ^ -350805185 ^ -145883566;
      var10009 = (int)3914671395048471149L ^ -930678505 ^ 1387905918;
      var10009 = -17284267 ^ 895797232 ^ -878934880;
      var10003 = c(
         "뻀㛻뻟㚑뻓㋠뻞㛾뫁㛲뺪㚁뻟㚂뻔",
         "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ",
         var10005,
         var10006,
         var10007,
         (int)-7704054117912612710L ^ 380778953 ^ -304875039
      );
      var10004 = (-2094497780 ^ -1856603737 ^ -1580192393) * (-2094497780 ^ -1856603737 ^ -1580192393);
      var10006 = (int)-3714359634788191187L ^ 1598387490 ^ -1566190635;
      this.s = new SliderSetting(var10003, 3.0F, 2.0F, 5.0F, 1.0F)
         .a(
            () -> {
               ModeSetting var10000 = this.e;
               int var2x = -79403060;
               int var1x = -1062752108;
               int var10001x = var1x & ~var2x | ~var1x & var2x;
               var2x = 541087267;
               var1x = var10001x;
               var10001x = var1x + var2x - 2 * (var1x & var2x);
               int var10002x = (int)-7100258926733767248L;
               var2x = 819875314;
               var1x = var10002x;
               var10002x = var1x & ~var2x | ~var1x & var2x;
               var2x = 51798441;
               var1x = var10002x;
               var2x = var1x + var2x - 2 * (var1x & var2x);
               var1x = var10001x;
               var10001x = (var1x & ~var2x) + (var2x & ~var1x) + 2 * (var1x & var2x);
               var10002x = (int)1739951733363447217L;
               var2x = 2135899336;
               var1x = var10002x;
               var10002x = (var1x | var2x) & ~(var1x & var2x);
               var2x = -2131515135;
               var1x = var10002x;
               var10002x = (var1x | var2x) - (var1x & var2x);
               int var10003x = (int)5504884587657202191L;
               var2x = 1315964126;
               var1x = var10003x;
               var10003x = (var1x | var2x) & ~(var1x & var2x);
               var2x = -1424106708;
               var1x = var10003x;
               var10003x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = -1999026548;
               var1x = 1096375475;
               int var10004x = var1x + var2x - 2 * (var1x & var2x);
               var2x = -1393624721;
               var1x = var10004x;
               var2x = (var1x | var2x) & (~var1x | ~var2x);
               var1x = var10003x;
               var10003x = (var1x & ~var2x) + (var2x & ~var1x) + 2 * (var1x & var2x);
               var10003x = (int)-3401152065770125851L;
               var2x = 695139937;
               var1x = var10003x;
               var10003x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = 1199817495;
               var1x = var10003x;
               var10003x = (var1x | var2x) & ~(var1x & var2x);
               var10004x = (int)-599238985242939545L;
               var2x = -1597038946;
               var1x = var10004x;
               var10004x = var1x & ~var2x | ~var1x & var2x;
               var2x = -654989150;
               var1x = var10004x;
               var10004x = (var1x | var2x) & (~var1x | ~var2x);
               var10004x = (int)662473674147344089L;
               var2x = 979245426;
               var1x = var10004x;
               var10004x = var1x + var2x - 2 * (var1x & var2x);
               var2x = -795077579;
               var1x = var10004x;
               var10004x = (var1x | var2x) - (var1x & var2x);
               int var10006x = (int)6298433322127199754L;
               var2x = 1098755163;
               var1x = var10006x;
               var10006x = (var1x | var2x) - (var1x & var2x);
               var2x = 664642137;
               var1x = var10006x;
               var10006x = (var1x | var2x) & ~(var1x & var2x);
               var10006x = (int)5019475587763145731L;
               var2x = 2070466818;
               var1x = var10006x;
               var10006x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = -1674126078;
               var1x = var10006x;
               var10006x = (var1x | var2x) - (var1x & var2x);
               var10006x = (int)-1826160727642141109L;
               var2x = -723688335;
               var1x = var10006x;
               var10006x = (var1x | var2x) - (var1x & var2x);
               var2x = -1966970328;
               var1x = var10006x;
               var10006x = (var1x | var2x) - (var1x & var2x);
               var2x = 649037498;
               var1x = -1300126152;
               int var10005x = (var1x | var2x) - (var1x & var2x);
               var2x = -1873548759;
               var1x = var10005x;
               var10005x = (var1x | var2x) & (~var1x | ~var2x);
               String var84x = "chd";
               var10006x = (int)5786751890912438456L;
               var2x = 1288577655;
               var1x = var10006x;
               var10006x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = 569748775;
               var1x = var10006x;
               return var10000.b(
                  c(
                     "㾮\ue08b㾁\ue0f3㿲\ue0fb",
                     "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ",
                     var10003x,
                     var10004x,
                     var10005x,
                     var1x + var2x - 2 * (var1x & var2x)
                  )
               );
            }
         );
      int var1012 = -1386425361 ^ 1151503865 ^ -1549483106;
      String var1119 = "cdq";
      var10005 = (-1284227680 ^ -729626865 ^ 32957763) * (-1284227680 ^ -729626865 ^ 32957763);
      var10005 = 412166795 ^ -178807416 ^ -544993392;
      var10006 = (-1081186684 ^ -779889000 ^ -730328007) + (-1446632741 ^ -798557184 ^ 1586603500);
      var10006 = 1439099943 ^ -1937032916 ^ 1206557643;
      var10007 = ((int)-3468427095327332293L ^ 185115301 ^ 1499764124) + ((int)-2707355864897022241L ^ -795364420 ^ -145499775);
      var10007 = (int)-377231833352499830L ^ 1768795479 ^ 488898565;
      int var1728 = (596324996 ^ 295013352 ^ 1139869303) + (1989178114 ^ 666668076 ^ 2091634455);
      var10003 = c(
         "뻿開뺠開뺢闶뫁闵뻔闿뻕閊뫁閈뻚闷뺮闵뻙",
         "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ",
         var10005,
         var10006,
         var10007,
         (int)38304394111394224L ^ 1314050451 ^ -234036328
      );
      var10006 = -249901714 ^ 1222065470 ^ -1177685928;
      var10006 = (int)8614951545710433321L ^ -1703847091 ^ -181104798;
      var10007 = ((int)4823370499124155267L ^ -365965293 ^ 1411982755) * ((int)4823370499124155267L ^ -365965293 ^ 1411982755);
      this.t = new SliderSetting(var10003, 1.0F, 0.3F, 2.0F, 0.05F)
         .a(
            () -> {
               int var10001x = (int)2332846965310894499L;
               int var2x = -552842602;
               int var1x = var10001x;
               var10001x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = 23755894;
               var1x = var10001x;
               var10001x = (var1x | var2x) & (~var1x | ~var2x);
               String var10002x = "chb";
               int var10003x = (int)3061288776729414034L;
               var2x = -1317509116;
               var1x = var10003x;
               var10003x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = 513482847;
               var1x = var10003x;
               var10003x = (var1x | var2x) & (~var1x | ~var2x);
               var10003x = (int)7178075361288072827L;
               var2x = -283878126;
               var1x = var10003x;
               var10003x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = 1306119162;
               var1x = var10003x;
               var10003x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = -1579039136;
               var1x = 356439361;
               int var10004x = (var1x | var2x) - (var1x & var2x);
               var2x = -1203607689;
               var1x = var10004x;
               var10004x = ((var1x | var2x) & (~var1x | ~var2x)) * ((var1x | var2x) & (~var1x | ~var2x));
               var10004x = (int)-2813862540373973201L;
               var2x = -1529088394;
               var1x = var10004x;
               var10004x = (var1x | var2x) & ~(var1x & var2x);
               var2x = 680353259;
               var1x = var10004x;
               var10004x = var1x + var2x - 2 * (var1x & var2x);
               String var10005x = "chc";
               var2x = 492875353;
               var1x = 625143966;
               int var50x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = 625611278;
               var1x = var50x;
               int var51x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = 298823037;
               var1x = -1539393145;
               int var10006x = (var1x | var2x) & ~(var1x & var2x);
               var2x = 1597799804;
               var1x = var10006x;
               var10006x = var1x & ~var2x | ~var1x & var2x;
               int var10007x = (int)1424171541276800666L;
               var2x = -2102798162;
               var1x = var10007x;
               var10007x = (var1x | var2x) - (var1x & var2x);
               var2x = -1751665774;
               var1x = var10007x;
               var2x = (var1x | var2x) - (var1x & var2x);
               var1x = var10006x;
               var10006x = (var1x | var2x) + (var1x & var2x);
               var2x = 650998609;
               var1x = 1006089631;
               var10006x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = 487888437;
               var1x = var10006x;
               return this.e
                  .b(c("㾩힟㾆ퟧ㿵ퟯ", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ", var10003x, var10004x, var51x, (var1x | var2x) - (var1x & var2x)));
            }
         );
      var10004 = (int)-745429582420508487L ^ 1453678153 ^ -798531846;
      String var1121 = "cdr";
      var10006 = (int)-5834398846190073388L ^ 106916001 ^ 1220223344;
      var10006 = (int)-8228463313946287440L ^ 1620941406 ^ 880310526;
      var10005 = -1893861880 ^ 585676854 ^ -1615333715;
      String var1417 = "cds";
      var10006 = -1785743773 ^ -1442500373 ^ -1591582540;
      int var1729 = (int)7330649501873524709L ^ 1918009100 ^ -1639796497;
      int var1730 = -1832344818 ^ -1947618345 ^ 421597387;
      var10007 = 259132835 ^ -2007716470 ^ -2143316348;
      int var1731 = (298529047 ^ -1299501112 ^ 25293688) * (298529047 ^ -1299501112 ^ 25293688);
      var10003 = c(
         "뻵\u2d7d뺠ⴇ뻑\u2d78뺧\u2d7d뺮",
         "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ",
         var10005,
         var10006,
         var10007,
         1706285962 ^ 780264667 ^ 1262097510
      );
      var10004 = (526767857 ^ -1542284 ^ 858991245) * (526767857 ^ -1542284 ^ 858991245);
      var10005 = (1369904942 ^ -1273880901 ^ -502825500) * (1369904942 ^ -1273880901 ^ -502825500);
      String var1618 = "cdt";
      this.u = new SliderSetting(var10003, 0.9F, 0.5F, 2.0F, 0.05F)
         .a(
            () -> {
               int var2x = 807954765;
               int var1x = 744898417;
               int var10001x = var1x & ~var2x | ~var1x & var2x;
               var2x = -400044088;
               var1x = var10001x;
               var10001x = var1x & ~var2x | ~var1x & var2x;
               var2x = -193192508;
               var1x = -1061721844;
               int var10002x = (var1x | var2x) & ~(var1x & var2x);
               var2x = 494495312;
               var1x = var10002x;
               var2x = var1x + var2x - 2 * (var1x & var2x);
               var1x = var10001x;
               var10001x = (var1x | var2x) + (var1x & var2x);
               var2x = 504718462;
               var1x = -1589938566;
               var10002x = (var1x | var2x) & ~(var1x & var2x);
               var2x = -1972688363;
               var1x = var10002x;
               var10002x = ((var1x | var2x) & ~(var1x & var2x)) * ((var1x | var2x) & ~(var1x & var2x));
               int var10003x = (int)-5823100453284758538L;
               var2x = 798018311;
               var1x = var10003x;
               var10003x = var1x + var2x - 2 * (var1x & var2x);
               var2x = 870049023;
               var1x = var10003x;
               var10003x = (var1x & ~var2x | ~var1x & var2x) * (var1x & ~var2x | ~var1x & var2x);
               var2x = -843575815;
               var1x = -618831413;
               var10003x = var1x + var2x - 2 * (var1x & var2x);
               var2x = 619173025;
               var1x = var10003x;
               var10003x = (var1x | var2x) & ~(var1x & var2x);
               String var10004x = "cha";
               var2x = -66829086;
               var1x = -1544990569;
               int var51x = (var1x | var2x) - (var1x & var2x);
               var2x = 1097678107;
               var1x = var51x;
               int var52x = var1x & ~var2x | ~var1x & var2x;
               int var10005x = (int)1836919792627032726L;
               var2x = 242227187;
               var1x = var10005x;
               var10005x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = -1594923893;
               var1x = var10005x;
               var10005x = ((var1x | var2x) & ~(var1x & var2x)) * ((var1x | var2x) & ~(var1x & var2x));
               var10005x = (int)-4855528362221590847L;
               var2x = 506163938;
               var1x = var10005x;
               var10005x = (var1x | var2x) & ~(var1x & var2x);
               var2x = 653268064;
               var1x = var10005x;
               var10005x = var1x + var2x - 2 * (var1x & var2x);
               var2x = 2053923407;
               var1x = 1355895013;
               int var10006x = (var1x | var2x) & ~(var1x & var2x);
               var2x = -1509860980;
               var1x = var10006x;
               var10006x = (var1x + var2x - 2 * (var1x & var2x)) * (var1x + var2x - 2 * (var1x & var2x));
               var2x = -1874039785;
               var1x = 331161670;
               var10006x = var1x + var2x - 2 * (var1x & var2x);
               var2x = -2085510681;
               var1x = var10006x;
               return this.e
                  .b(c("㾨櫓㾇檫㿴檣", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ", var10003x, var52x, var10005x, (var1x | var2x) - (var1x & var2x)));
            }
         );
      var10004 = (int)-3310281847746334365L ^ 1722965154 ^ -803885619;
      var10004 = -1139567854 ^ 1506905318 ^ -440262657;
      var10004 = (int)-7917573931682909372L ^ -1613789534 ^ -789957151;
      var10004 = 2041064515 ^ 431091072 ^ 1612300751;
      var10004 = ((int)6286720059839864931L ^ 114391480 ^ 1074439515) + ((int)2862277899437496797L ^ -405698076 ^ 1702874940);
      String var1244 = "cdu";
      var10005 = (int)3346339927815663250L ^ 1627843525 ^ 342687172;
      var10006 = (int)-5904837924385727197L ^ -1464527644 ^ 1848548824;
      var10006 = -659230473 ^ -410302995 ^ -1580026550;
      String var1619 = "cdv";
      var10007 = 1581109826 ^ -421166730 ^ -1394624288;
      int var1732 = (-106237602 ^ -693608587 ^ 1946277891) * (-106237602 ^ -693608587 ^ 1946277891);
      var10003 = c(
         "뻁䌉뻖䌅뻔䍹뫁䍽뻙䌊뺢䍹", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ", var10005, var10006, var10007, -198637059 ^ 1079877399 ^ -1271344223
      );
      var10005 = 1920612173 ^ 1338790636 ^ 1035363756;
      var10005 = (int)6372451312975923949L ^ 1446474281 ^ -1940801344;
      var10005 = (int)-4757573235007612380L ^ 851754810 ^ 1152623891;
      var10005 = (int)7883340570007711720L ^ -499823770 ^ -326540159;
      var10005 = (1466620752 ^ -661555928 ^ -1690396909) * (1466620752 ^ -661555928 ^ -1690396909);
      var10006 = ((int)-9217843843786708570L ^ -891762281 ^ 2091877848) + (-1267803796 ^ 1774883537 ^ -1142858327);
      var10007 = ((int)-7477126068035281601L ^ 1831008151 ^ 1462878273) + ((int)8430228490256083622L ^ -604965713 ^ -1819805001);
      this.v = new SliderSetting(var10003, 0.2F, 0.08F, 0.4F, 0.01F)
         .a(
            () -> {
               int var10001x = (int)7484658931495499197L;
               int var2x = 1149726721;
               int var1x = var10001x;
               var10001x = var1x + var2x - 2 * (var1x & var2x);
               var2x = 1448790756;
               var1x = var10001x;
               var10001x = (var1x + var2x - 2 * (var1x & var2x)) * (var1x + var2x - 2 * (var1x & var2x));
               int var10002x = (int)-8762109838540836677L;
               var2x = -44809703;
               var1x = var10002x;
               var10002x = var1x & ~var2x | ~var1x & var2x;
               var2x = -1500530768;
               var1x = var10002x;
               var10002x = var1x & ~var2x | ~var1x & var2x;
               var2x = -1822369305;
               var1x = -1061842883;
               int var10003x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = -751704777;
               var1x = var10003x;
               var10003x = (var1x | var2x) & ~(var1x & var2x);
               int var10004x = (int)7201050854486741763L;
               var2x = -1294857134;
               var1x = var10004x;
               var10004x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = 1679744351;
               var1x = var10004x;
               var2x = var1x & ~var2x | ~var1x & var2x;
               var1x = var10003x;
               var10003x = 2 * (var1x | var2x) - (var1x ^ var2x);
               var2x = -641444690;
               var1x = 1715977015;
               var10003x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = -1916709110;
               var1x = var10003x;
               var10003x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = -1555718904;
               var1x = -1752009565;
               var10004x = var1x & ~var2x | ~var1x & var2x;
               var2x = -2082651736;
               var1x = var10004x;
               var10004x = (var1x & ~var2x | ~var1x & var2x) * (var1x & ~var2x | ~var1x & var2x);
               var10004x = (int)-5054950214550928653L;
               var2x = 713115866;
               var1x = var10004x;
               var10004x = (var1x | var2x) - (var1x & var2x);
               var2x = -595371674;
               var1x = var10004x;
               var10004x = (var1x | var2x) & (~var1x | ~var2x);
               int var10005x = (int)-3590088766837381109L;
               var2x = -1196767289;
               var1x = var10005x;
               var10005x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = -1700913844;
               var1x = var10005x;
               var10005x = (var1x | var2x) - (var1x & var2x);
               var2x = -677682558;
               var1x = 755464845;
               int var10006x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = 1143902055;
               var1x = var10006x;
               var2x = (var1x | var2x) - (var1x & var2x);
               var1x = var10005x;
               var10005x = (var1x & ~var2x) + (var2x & ~var1x) + 2 * (var1x & var2x);
               var2x = 646708061;
               var1x = 1061444847;
               var10005x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = 448570746;
               var1x = var10005x;
               var10005x = (var1x | var2x) & (~var1x | ~var2x);
               var10006x = (int)-1248110971267435017L;
               var2x = -875274943;
               var1x = var10006x;
               var10006x = var1x + var2x - 2 * (var1x & var2x);
               var2x = 653986846;
               var1x = var10006x;
               var10006x = (var1x | var2x) & ~(var1x & var2x);
               int var10007x = (int)7292517214871235183L;
               var2x = 1285512961;
               var1x = var10007x;
               var10007x = (var1x | var2x) - (var1x & var2x);
               var2x = 694517380;
               var1x = var10007x;
               var2x = var1x + var2x - 2 * (var1x & var2x);
               var1x = var10006x;
               var10006x = (var1x | var2x) + (var1x & var2x);
               var10006x = (int)7148436147127921297L;
               var2x = -979904722;
               var1x = var10006x;
               var10006x = var1x + var2x - 2 * (var1x & var2x);
               var2x = -2069632471;
               var1x = var10006x;
               return this.e
                  .b(
                     c("㾫郰㾄邈㿷邀", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ", var10003x, var10004x, var10005x, var1x + var2x - 2 * (var1x & var2x))
                  );
            }
         );
      int var1016 = (134296198 ^ 678301107 ^ -210058856) + ((int)-1727101303557556881L ^ 9718481 ^ 1911220519);
      var10004 = (int)-3047106823515732271L ^ 607148314 ^ 771221752;
      var10005 = (-231151592 ^ 1398725781 ^ 663424484) + ((int)-3225108936422228822L ^ -1985531068 ^ -635717756);
      var10005 = 100608246 ^ 33821412 ^ 901350017;
      String var1422 = "cdw";
      var10006 = 1760381690 ^ 49372480 ^ -184718368;
      String var1622 = "cdx";
      var10007 = 1559786656 ^ -1301800428 ^ -128162984;
      var10008 = "cdy";
      this.w = new BooleanSetting(
            c("뻳읧뻑읮뻔윚뻙윒", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ", var10005, var10006, var10007, -595869291 ^ 122417215 ^ -613355265),
            true
         )
         .a(
            () -> {
               int var2x = -85784907;
               int var1x = 901703654;
               int var10001x = (var1x | var2x) & ~(var1x & var2x);
               var2x = 1199512227;
               var1x = var10001x;
               var10001x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = 1868487567;
               var1x = 1110960204;
               int var10002x = var1x + var2x - 2 * (var1x & var2x);
               var2x = -1280648837;
               var1x = var10002x;
               var10002x = var1x & ~var2x | ~var1x & var2x;
               var2x = 758111794;
               var1x = 125698689;
               int var10003x = (var1x | var2x) - (var1x & var2x);
               var2x = -871992396;
               var1x = var10003x;
               var2x = (var1x | var2x) & (~var1x | ~var2x);
               var1x = var10002x;
               var10002x = (var1x ^ var2x) + 2 * (var1x & var2x);
               var2x = -1771286398;
               var1x = 2093342828;
               var10003x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = -441658518;
               var1x = var10003x;
               var10003x = ((var1x | var2x) & ~(var1x & var2x)) * ((var1x | var2x) & ~(var1x & var2x));
               var10003x = (int)1387191644956105566L;
               var2x = -1609648639;
               var1x = var10003x;
               var10003x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = 45323724;
               var1x = var10003x;
               var10003x = var1x + var2x - 2 * (var1x & var2x);
               int var10004x = (int)1501371329082682128L;
               var2x = -1240428372;
               var1x = var10004x;
               var10004x = (var1x | var2x) & ~(var1x & var2x);
               var2x = 2054701933;
               var1x = var10004x;
               var10004x = ((var1x | var2x) & ~(var1x & var2x)) * ((var1x | var2x) & ~(var1x & var2x));
               var2x = -757295586;
               var1x = 2077800450;
               var10004x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = -1217489484;
               var1x = var10004x;
               var10004x = (var1x | var2x) - (var1x & var2x);
               var2x = -35044691;
               var1x = -332780010;
               int var10005x = var1x + var2x - 2 * (var1x & var2x);
               var2x = 1923796906;
               var1x = var10005x;
               var10005x = ((var1x | var2x) & ~(var1x & var2x)) * ((var1x | var2x) & ~(var1x & var2x));
               var10005x = (int)-1807416646081442785L;
               var2x = -2115855286;
               var1x = var10005x;
               var10005x = var1x & ~var2x | ~var1x & var2x;
               var2x = 1740287676;
               var1x = var10005x;
               var10005x = (var1x | var2x) - (var1x & var2x);
               String var10006x = "cgz";
               var2x = 19327747;
               var1x = -244360053;
               int var59x = (var1x | var2x) - (var1x & var2x);
               var2x = -261961626;
               var1x = var59x;
               return this.e
                  .b(
                     c(
                        "㾪\uf889㾅\uf8f1㿶\uf8f9",
                        "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ",
                        var10003x,
                        var10004x,
                        var10005x,
                        (var1x | var2x) - (var1x & var2x)
                     )
                  );
            }
         );
      int var1017 = ((int)4295707644614388292L ^ -943309886 ^ 108820166) + ((int)767508701148082117L ^ -1074743022 ^ 919302843);
      String var1129 = "cdz";
      var10006 = 1046524092 ^ 1352926897 ^ 1858385412;
      var10006 = (int)1499402139725236351L ^ 1517361783 ^ 330928666;
      var10006 = (int)4745294291299537629L ^ -2101248131 ^ -1453822558;
      var10006 = -473857230 ^ -502270891 ^ 30308195;
      var10006 = 938677634 ^ 572386582 ^ 367982748;
      var10005 = (int)-1165482193977343735L ^ 218780375 ^ -1531385011;
      var10006 = ((int)8418533163939255708L ^ -1162241138 ^ -335888397) + ((int)-7540962369137962477L ^ 352176200 ^ 1604284231);
      var10006 = 1628305286 ^ -1634867145 ^ 1633093754;
      int var1734 = (int)-4248279579666916193L ^ 2036183009 ^ 1916138357;
      int var1735 = (int)8873775679795186430L ^ -29724679 ^ -729078515;
      int var1736 = (int)-7151162733221944923L ^ -1036903161 ^ 830045359;
      var10007 = -2019096795 ^ -2139790843 ^ 237901745;
      int var1737 = ((int)-341270570996509740L ^ -87821347 ^ 721488431) * ((int)-341270570996509740L ^ -87821347 ^ 721488431);
      this.x = new BooleanSetting(
            c("뻉媁뻘媀뻔嫴", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ", var10005, var10006, var10007, -983532446 ^ 725598150 ^ -295067806),
            true
         )
         .a(
            () -> {
               ModeSetting var10000 = this.e;
               int var10001x = (int)-4963639972315043512L;
               int var2x = 1371544455;
               int var1x = var10001x;
               var10001x = var1x + var2x - 2 * (var1x & var2x);
               var2x = 1977922399;
               var1x = var10001x;
               var10001x = var1x & ~var2x | ~var1x & var2x;
               String var10002x = "cgw";
               var2x = 515584185;
               var1x = 2103293148;
               int var10004x = (var1x | var2x) - (var1x & var2x);
               var2x = 1676051567;
               var1x = var10004x;
               var10004x = (var1x | var2x) & ~(var1x & var2x);
               int var10003x = (int)-5874631420064667230L;
               var2x = -817690234;
               var1x = var10003x;
               var10003x = (var1x | var2x) & ~(var1x & var2x);
               var2x = -1045178185;
               var1x = var10003x;
               var10003x = (var1x | var2x) - (var1x & var2x);
               var2x = -2089651668;
               var1x = 1616732893;
               var10004x = var1x + var2x - 2 * (var1x & var2x);
               var2x = -1026583530;
               var1x = var10004x;
               var10004x = (var1x | var2x) & ~(var1x & var2x);
               var10004x = (int)5056859999746780719L;
               var2x = 131855229;
               var1x = var10004x;
               var10004x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = -2104406692;
               var1x = var10004x;
               var10004x = (var1x | var2x) & ~(var1x & var2x);
               String var10005x = "cgx";
               var2x = 779121635;
               var1x = -1848954808;
               int var39x = (var1x | var2x) - (var1x & var2x);
               var2x = -1202114471;
               var1x = var39x;
               int var40x = var1x & ~var2x | ~var1x & var2x;
               String var10006x = "cgy";
               var2x = 424954618;
               var1x = -1579264232;
               int var41x = (var1x | var2x) - (var1x & var2x);
               var2x = -1194456655;
               var1x = var41x;
               return var10000.b(
                  c("㾥錻㾊鍃㿹鍋", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ", var10003x, var10004x, var40x, (var1x | var2x) & ~(var1x & var2x))
               );
            }
         );
      var10003 = "cea";
      String var1130 = "ceb";
      var10005 = (int)1855243771758713203L ^ 63953265 ^ 263050204;
      var10005 = (int)-8722060510399591325L ^ 1768260879 ^ 990687743;
      var10007 = (int)4992792625519272014L ^ 1706827397 ^ -990363944;
      var10007 = 191908234 ^ -885451078 ^ -1068933320;
      var10006 = (int)8482524454533665006L ^ 1669417076 ^ 1918441487;
      var10007 = (-1675724604 ^ -888879216 ^ -1394421864) + (1287322143 ^ -372896200 ^ 1683098152);
      var10007 = 1713333268 ^ -1272911693 ^ -1044236694;
      var10009 = (int)8821550636557818993L ^ -1083014337 ^ 55893834;
      var10009 = -1136003838 ^ -148932559 ^ 1263963452;
      var10009 = 1405410979 ^ 1565312863 ^ 243800575;
      var10009 = (int)4231785198447065100L ^ -1927985501 ^ 35929774;
      var10003 = c(
         "뻃菚뻞蟂뺩菗뻘菖뻔莢뻑",
         "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ",
         var10005,
         var10006,
         var10007,
         (int)1154276854093063451L ^ -1694979674 ^ 2120616237
      );
      String[] var1131 = new String[(int)-4950564810536664671L ^ -1871124898 ^ 638658555];
      var10006 = -635557056 ^ -1190522459 ^ 1662270181;
      var10007 = -1619934785 ^ -1082730682 ^ 1067117830;
      int var1738 = (377810915 ^ -2129249854 ^ -2025278677) * (377810915 ^ -2129249854 ^ -2025278677);
      int var1905 = -915820937 ^ -1138387463 ^ 1967930245;
      int var1906 = -7572337 ^ 575984495 ^ -573003799;
      var10009 = (int)-2918496866613209123L ^ 1979868104 ^ 1328352390;
      var10011 = (int)7076825598960447989L ^ 1774394982 ^ 1387179905;
      int var1907 = (int)6972320963308833342L ^ 1245085328 ^ 1922907011;
      var10011 = -756560496 ^ 1671530648 ^ -1818212150;
      var10011 = -1166969657 ^ 1971601513 ^ -748925362;
      var10012 = (int)6929151672194156734L ^ 2059273876 ^ -1424149374;
      var1131[var10006] = c(
         "뻼副뻐则뻚剪", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ", var10009, var1907, var10011, (int)-4030040114956256210L ^ -7045370 ^ -354216192
      );
      var10006 = (int)1698635630661356104L ^ 1493012891 ^ 1620696018;
      String var1630 = "cec";
      var10008 = "ced";
      var10009 = -1981361241 ^ -1545478353 ^ -1635265930;
      var10009 = -239411288 ^ 743055004 ^ -273516121;
      int var1908 = 986964867 ^ -1503693177 ^ -1844866581;
      int var1909 = 872371128 ^ -921399902 ^ 1681530036;
      var10011 = ((int)2125805324313626935L ^ -664547120 ^ 1422831797) + (-1401444696 ^ 1180662294 ^ -1448802014);
      var10011 = -239379305 ^ -1813534207 ^ 1624936346;
      String var1976 = "cee";
      var1131[var10006] = c(
         "뻶ǩ뺰Ǭ뻕Ɛ", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ", var10009, var1909, var10011, -300034035 ^ 561772613 ^ -816371743
      );
      var10006 = (int)5754010618849982705L ^ 264268686 ^ -174025859;
      int var1740 = -1605555982 ^ -1262117038 ^ 344504239;
      int var1741 = -301685098 ^ 1580644248 ^ -1338896099;
      int var1742 = (int)-8458282333588893152L ^ 1536329807 ^ 1273649760;
      int var1743 = ((int)-3448500809871492229L ^ 1935957412 ^ 501728221) + ((int)868327968520513892L ^ -1154809097 ^ 742927373);
      var10009 = ((int)-6459622884822014174L ^ -57609889 ^ 104820064) + ((int)113525903817334262L ^ -1081561823 ^ -1698567950);
      var10009 = (int)310563032594136788L ^ 1607056436 ^ -1414579597;
      int var1910 = (504835174 ^ -994666298 ^ -529391344) * (504835174 ^ -994666298 ^ -529391344);
      int var1911 = (int)-7857309811165976043L ^ -294268445 ^ 931576699;
      var10012 = -1214849831 ^ 1007751364 ^ -1954034672;
      var10012 = -1650130542 ^ 1764101461 ^ -192738102;
      var10012 = 1100306873 ^ 1770260542 ^ 672223623;
      var10011 = 17254421 ^ 1403982225 ^ 1453592316;
      var10012 = (int)8858626291877053804L ^ 233863385 ^ -888173265;
      var1131[var10006] = c(
         "뻾ϊ뺢θ뻙χ뻑", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ", var10009, var1911, var10011, (int)-2420214588428749593L ^ 1758461270 ^ -257782727
      );
      var10006 = -1534595166 ^ 1975882074 ^ -784171269;
      int var1744 = (int)-2089295099680890992L ^ 744928096 ^ 82373874;
      int var1745 = (-180457750 ^ 681716332 ^ -1409205020) * (-180457750 ^ 681716332 ^ -1409205020);
      var10009 = (-1119186328 ^ -1988935988 ^ 110291111) + ((int)-8390721928592927734L ^ 1541992009 ^ 1207375371);
      var10009 = (int)-5356451979774883129L ^ 1513881482 ^ -1318203938;
      var10010 = "cef";
      int var1913 = -831595289 ^ 1616449221 ^ 814664846;
      var10011 = (1104117974 ^ 1605094824 ^ -1213990308) + ((int)4595790820084215970L ^ 281253341 ^ -1394873331);
      var10011 = (int)3790862590534776303L ^ -88790635 ^ 793865823;
      var10012 = (648236641 ^ 1347804382 ^ -1047771562) + (217128451 ^ 646753011 ^ -1623037730);
      var1131[var10006] = c(
         "뻾旮뻑既뻝日", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ", var10009, var1913, var10011, (int)8535127425718729146L ^ -691657198 ^ -461964273
      );
      var10005 = ((int)-7762111744119668134L ^ 1980572545 ^ 965553562) + ((int)7825872382083919534L ^ 605179742 ^ -1321641649);
      var10006 = (int)-1866528131924622193L ^ 1855190133 ^ 321309397;
      var10007 = ((int)-8114284827033923248L ^ -1663772029 ^ -1234751238) + ((int)-8226204169808247998L ^ 1366864454 ^ 478483300);
      var10007 = -1341547221 ^ -1670787619 ^ 505604197;
      var10008 = "ceg";
      int var1747 = (int)-3695917111806829330L ^ 722893165 ^ 1119241956;
      var10009 = 1598870968 ^ -1872933610 ^ -409189883;
      var10009 = 1478202612 ^ -538582748 ^ -1813789050;
      int var1914 = ((int)-7836735652383897577L ^ 1470696651 ^ -973898067) * ((int)-7836735652383897577L ^ 1470696651 ^ -973898067);
      this.y = new ModeSetting(
            var10003,
            var1131,
            c("뻼긥뻐깓뻚긠", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ", var10007, var1747, var10009, 376397519 ^ 513301156 ^ 146910217)
         )
         .a(
            () -> {
               int var10001x = (int)-8476513787197796836L;
               int var4x = -77247829;
               int var3x = var10001x;
               var10001x = var3x + var4x - 2 * (var3x & var4x);
               var4x = 2138483519;
               var3x = var10001x;
               var10001x = ((var3x | var4x) & (~var3x | ~var4x)) * ((var3x | var4x) & (~var3x | ~var4x));
               int var10002x = (int)6015033877938760368L;
               var4x = -1381875596;
               var3x = var10002x;
               var10002x = (var3x | var4x) & (~var3x | ~var4x);
               var4x = 332175512;
               var3x = var10002x;
               var10002x = (var3x | var4x) - (var3x & var4x);
               var4x = -1524543872;
               var3x = -1209114518;
               int var10003x = var3x + var4x - 2 * (var3x & var4x);
               var4x = -714296110;
               var3x = var10003x;
               var4x = var3x & ~var4x | ~var3x & var4x;
               var3x = var10002x;
               var10002x = (var3x | var4x) + (var3x & var4x);
               String var99x = "cgu";
               var4x = -333675000;
               var3x = -688956033;
               var10003x = (var3x | var4x) & ~(var3x & var4x);
               var4x = 145843172;
               var3x = var10003x;
               var10003x = (var3x | var4x) & (~var3x | ~var4x);
               int var10004x = (int)998344593275361750L;
               var4x = 1055986105;
               var3x = var10004x;
               var10004x = var3x + var4x - 2 * (var3x & var4x);
               var4x = -1442261001;
               var3x = var10004x;
               var10004x = (var3x | var4x) & ~(var3x & var4x);
               var10004x = (int)3509726858439824412L;
               var4x = -39330524;
               var3x = var10004x;
               var10004x = (var3x | var4x) & (~var3x | ~var4x);
               var4x = -1674835919;
               var3x = var10004x;
               var10004x = (var3x | var4x) - (var3x & var4x);
               String var10005x = "cgv";
               var4x = 465436122;
               var3x = 2111407340;
               int var107x = (var3x | var4x) - (var3x & var4x);
               var4x = 2043191155;
               var3x = var107x;
               int var108x = var3x & ~var4x | ~var3x & var4x;
               int var10006x = (int)8361289324105979944L;
               var4x = 484558164;
               var3x = var10006x;
               var10006x = (var3x | var4x) & ~(var3x & var4x);
               var4x = 712915400;
               var3x = var10006x;
               var10006x = var3x & ~var4x | ~var3x & var4x;
               var4x = -2075855744;
               var3x = -801350944;
               var10006x = (var3x | var4x) - (var3x & var4x);
               var4x = 1412967213;
               var3x = var10006x;
               if (!this.e
                  .b(c("㾤Ȥ㾋ɜ㿸ɔ", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ", var10003x, var10004x, var108x, var3x & ~var4x | ~var3x & var4x))) {
                  var4x = 2107296921;
                  var3x = 1215730217;
                  int var10000 = var3x + var4x - 2 * (var3x & var4x);
                  var4x = 1565386035;
                  var3x = var10000;
                  var10000 = (var3x | var4x) & ~(var3x & var4x);
                  var4x = 1242282672;
                  var3x = 1895348059;
                  var10001x = var3x & ~var4x | ~var3x & var4x;
                  var4x = 2061093391;
                  var3x = var10001x;
                  var4x = (var3x | var4x) & ~(var3x & var4x);
                  var3x = var10000;
                  var10000 = 2 * (var3x | var4x) - (var3x ^ var4x);
                  var4x = 1719318609;
                  var3x = -108666389;
                  var10000 = (var3x | var4x) & ~(var3x & var4x);
                  var4x = -1379535331;
                  var3x = var10000;
                  int var2x = (var3x | var4x) - (var3x & var4x);
                  var4x = -1444780180;
                  var3x = 378710379;
                  var10001x = (var3x | var4x) & ~(var3x & var4x);
                  var4x = -1083126272;
                  var3x = var10001x;
                  var10001x = (var3x | var4x) - (var3x & var4x);
                  var4x = 2045070219;
                  var3x = -1551117173;
                  var10000 = (var3x | var4x) - (var3x & var4x);
                  var4x = -568549453;
                  var3x = var10000;
                  if (((var3x | var4x) & (~var3x | ~var4x)) >= var2x) {
                     var4x = 1971141134;
                     var3x = 1694399721;
                     var10000 = (var3x | var4x) - (var3x & var4x);
                     var4x = 293816039;
                     var3x = var10000;
                     var10000 = (var3x | var4x) & (~var3x | ~var4x);
                     var4x = 475815514;
                     var3x = -890695491;
                     var10001x = (var3x | var4x) - (var3x & var4x);
                     var4x = -692760857;
                     var3x = var10001x;
                     var10000 /= (var3x | var4x) - (var3x & var4x);
                  }
               } else if (this.x.a()) {
                  var4x = -996236866;
                  var3x = -1983260106;
                  int var89x = (var3x | var4x) & ~(var3x & var4x);
                  var4x = 1297578889;
                  var3x = var89x;
                  return Boolean.valueOf(pulse.Bool.from((var3x | var4x) - (var3x & var4x)));
               }

               int var86x = (int)-6713263692054686597L;
               var4x = -1295582053;
               var3x = var86x;
               var86x = var3x + var4x - 2 * (var3x & var4x);
               var4x = 1028352224;
               var3x = var86x;
               return Boolean.valueOf(pulse.Bool.from(var3x & ~var4x | ~var3x & var4x));
            }
         );
      int var1020 = (-1882326804 ^ 1540672118 ^ 1339561309) * (-1882326804 ^ 1540672118 ^ 1339561309);
      var10004 = ((int)7259775807988554420L ^ -1279864108 ^ 763675241) + ((int)3769068672786406662L ^ 539047643 ^ 586645044);
      var10006 = 1413244694 ^ -268403711 ^ -1539564770;
      var10006 = 70170333 ^ 522178384 ^ 456227230;
      var10005 = 1000117314 ^ 484086321 ^ 352632544;
      var10006 = ((int)8454304452375058392L ^ 1361323649 ^ -1376022104) + (-607972658 ^ 1347231258 ^ -844989489);
      var10006 = (int)-3527214892913646676L ^ -1295191456 ^ 24853512;
      var10007 = (int)4677599887116720372L ^ -1649067651 ^ -509146865;
      var10007 = -854298591 ^ -1766767297 ^ 1580771160;
      var10008 = "ceh";
      this.z = new BooleanSetting(
            c("뻀㓿뻔㒊뻔㓰뻙㓸", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ", var10005, var10006, var10007, 2117249876 ^ -1892520857 ^ -247597684),
            true
         )
         .a(
            () -> {
               ModeSetting var10000 = this.e;
               int var10002x = (int)6909193072827024046L;
               int var2x = 1863723743;
               int var1x = var10002x;
               var10002x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = 694675568;
               var1x = var10002x;
               var10002x = var1x & ~var2x | ~var1x & var2x;
               var10002x = (int)-743611330947597913L;
               var2x = 1865060606;
               var1x = var10002x;
               var10002x = var1x + var2x - 2 * (var1x & var2x);
               var2x = 1086531928;
               var1x = var10002x;
               var10002x = (var1x | var2x) & (~var1x | ~var2x);
               var10002x = (int)6068720759615445472L;
               var2x = 42749367;
               var1x = var10002x;
               var10002x = (var1x | var2x) - (var1x & var2x);
               var2x = -1620667307;
               var1x = var10002x;
               var10002x = (var1x | var2x) & (~var1x | ~var2x);
               var10002x = (int)-6645526343774664070L;
               var2x = -1368209813;
               var1x = var10002x;
               var10002x = (var1x | var2x) & ~(var1x & var2x);
               var2x = 1539132433;
               var1x = var10002x;
               var10002x = (var1x | var2x) & ~(var1x & var2x);
               var2x = -365459646;
               var1x = -495174313;
               var10002x = (var1x | var2x) & ~(var1x & var2x);
               var2x = 1676627567;
               var1x = var10002x;
               var10002x = (var1x | var2x) & (~var1x | ~var2x);
               int var10003x = (int)8547982440061961939L;
               var2x = 1617202858;
               var1x = var10003x;
               var10003x = var1x + var2x - 2 * (var1x & var2x);
               var2x = 1490675060;
               var1x = var10003x;
               var2x = (var1x | var2x) - (var1x & var2x);
               var1x = var10002x;
               var10002x = 2 * (var1x | var2x) - (var1x ^ var2x);
               var10003x = (int)8555170270747288150L;
               var2x = -154760736;
               var1x = var10003x;
               var10003x = (var1x | var2x) - (var1x & var2x);
               var2x = 2130278269;
               var1x = var10003x;
               var10003x = ((var1x | var2x) & (~var1x | ~var2x)) * ((var1x | var2x) & (~var1x | ~var2x));
               var10003x = (int)-1772325204237986775L;
               var2x = -909872189;
               var1x = var10003x;
               var10003x = var1x & ~var2x | ~var1x & var2x;
               var2x = 359309177;
               var1x = var10003x;
               var10003x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = 1445688140;
               var1x = 7750386;
               int var10004x = var1x & ~var2x | ~var1x & var2x;
               var2x = 1279268281;
               var1x = var10004x;
               var10004x = var1x & ~var2x | ~var1x & var2x;
               var2x = 730599087;
               var1x = -1849110761;
               var10004x = (var1x | var2x) - (var1x & var2x);
               var2x = -1541015042;
               var1x = var10004x;
               var10004x = (var1x | var2x) & ~(var1x & var2x);
               var2x = -1271104484;
               var1x = -1495525235;
               int var10005x = var1x & ~var2x | ~var1x & var2x;
               var2x = 207516628;
               var1x = var10005x;
               var10005x = var1x & ~var2x | ~var1x & var2x;
               int var10006x = (int)-5773480903282282764L;
               var2x = -1862424364;
               var1x = var10006x;
               var10006x = var1x + var2x - 2 * (var1x & var2x);
               var2x = 777054948;
               var1x = var10006x;
               var2x = var1x & ~var2x | ~var1x & var2x;
               var1x = var10005x;
               var10005x = var1x - ~var2x - 1;
               var10005x = (int)-3121884702629616087L;
               var2x = -1492618708;
               var1x = var10005x;
               var10005x = (var1x | var2x) - (var1x & var2x);
               var2x = -335850308;
               var1x = var10005x;
               var10005x = var1x + var2x - 2 * (var1x & var2x);
               var2x = -1364406429;
               var1x = -364601441;
               int var10007x = var1x & ~var2x | ~var1x & var2x;
               var2x = 1156075763;
               var1x = var10007x;
               var10007x = (var1x | var2x) - (var1x & var2x);
               var10007x = (int)-3521614498467308158L;
               var2x = 1248227345;
               var1x = var10007x;
               var10007x = var1x + var2x - 2 * (var1x & var2x);
               var2x = -727978602;
               var1x = var10007x;
               var10007x = var1x & ~var2x | ~var1x & var2x;
               var10007x = (int)-4502642270449187401L;
               var2x = 1462714524;
               var1x = var10007x;
               var10007x = (var1x | var2x) - (var1x & var2x);
               var2x = 1343784230;
               var1x = var10007x;
               var10007x = (var1x | var2x) - (var1x & var2x);
               var10007x = (int)1035263399616361871L;
               var2x = 1538500479;
               var1x = var10007x;
               var10007x = var1x & ~var2x | ~var1x & var2x;
               var2x = -190115103;
               var1x = var10007x;
               var10007x = var1x + var2x - 2 * (var1x & var2x);
               var2x = 362104326;
               var1x = -1228755060;
               var10006x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = -1552542210;
               var1x = var10006x;
               return var10000.b(
                  c("㾲笋㾝筳㿮筻", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ", var10003x, var10004x, var10005x, (var1x | var2x) & (~var1x | ~var2x))
               );
            }
         );
      var10003 = "cei";
      var10004 = (int)-728722098578006077L ^ -513233708 ^ 58092870;
      var10005 = 1861534969 ^ -285459476 ^ 1574828280;
      var10005 = (int)-2534109718813825054L ^ 1670648295 ^ 1172967062;
      var10006 = (-1183924010 ^ 501417644 ^ -1646652092) + (-598399870 ^ 1409667079 ^ -1554447106);
      var10006 = (int)612836451926141151L ^ 441019620 ^ 177908778;
      var10007 = 414368419 ^ -1424573298 ^ 1612516328;
      var10007 = 969310017 ^ -1432255103 ^ -1727877906;
      int var1749 = (1077438696 ^ -1040308772 ^ -114377078) * (1077438696 ^ -1040308772 ^ -114377078);
      var10003 = c(
         "뻁歎뻖歂뻔款뫁欿뻓歋뺦歋뻜歆뺮",
         "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ",
         var10005,
         var10006,
         var10007,
         (int)-8308713312770751897L ^ 1244813521 ^ 965523386
      );
      var10005 = (int)-5933948265987538691L ^ -1558318466 ^ 1901687441;
      String var1261 = "cej";
      int var1750 = (int)2890237268436622569L ^ -433043091 ^ 1676858753;
      int var1751 = -183953755 ^ 1234793103 ^ -1131387865;
      this.A = new SliderSetting(var10003, 0.85F, 0.1F, 1.0F, 0.05F)
         .a(
            () -> {
               int var2x = -278753661;
               int var1x = 1495328418;
               int var10001x = var1x + var2x - 2 * (var1x & var2x);
               var2x = -2016634352;
               var1x = var10001x;
               var10001x = (var1x | var2x) & (~var1x | ~var2x);
               int var10002x = (int)3113606962535179679L;
               var2x = 426383335;
               var1x = var10002x;
               var10002x = (var1x | var2x) - (var1x & var2x);
               var2x = -1396545326;
               var1x = var10002x;
               var2x = (var1x | var2x) - (var1x & var2x);
               var1x = var10001x;
               var10001x = var1x - ~var2x - 1;
               String var49x = "cgr";
               String var10003x = "cgs";
               var2x = 1215832351;
               var1x = 456354898;
               int var50x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = 1628042718;
               var1x = var50x;
               int var51x = (var1x | var2x) & ~(var1x & var2x);
               var2x = -1344212895;
               var1x = 650493030;
               int var10004x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = -1100388413;
               var1x = var10004x;
               var10004x = (var1x + var2x - 2 * (var1x & var2x)) * (var1x + var2x - 2 * (var1x & var2x));
               var2x = 1663859320;
               var1x = 1253807693;
               var10004x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = 936466413;
               var1x = var10004x;
               var10004x = (var1x | var2x) & ~(var1x & var2x);
               String var10005x = "cgt";
               int var55x = (int)6267134285308175863L;
               var2x = -939800524;
               var1x = var55x;
               int var56x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = 1431408094;
               var1x = var56x;
               int var57x = var1x + var2x - 2 * (var1x & var2x);
               int var10006x = (int)1303274168138664575L;
               var2x = 1469643116;
               var1x = var10006x;
               var10006x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = -1247107078;
               var1x = var10006x;
               var10006x = (var1x | var2x) & ~(var1x & var2x);
               var2x = -813323627;
               var1x = -2120286189;
               var10006x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = 1310534275;
               var1x = var10006x;
               int var43x;
               if (this.e
                     .b(c("㿍܅㿢ݽ㾑ݵ", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ", var51x, var10004x, var57x, var1x + var2x - 2 * (var1x & var2x)))
                  && this.z.a()) {
                  var43x = (int)-8418941704625699151L;
                  var2x = 754274899;
                  var1x = var43x;
                  var43x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = 736433379;
                  var1x = var43x;
                  var43x = var1x + var2x - 2 * (var1x & var2x);
               } else {
                  var2x = 527027183;
                  var1x = -1314765973;
                  var43x = var1x & ~var2x | ~var1x & var2x;
                  var2x = -1362392956;
                  var1x = var43x;
                  var43x = var1x + var2x - 2 * (var1x & var2x);
               }

               return Boolean.valueOf(pulse.Bool.from(var43x));
            }
         );
      int var1023 = (-1030920322 ^ -1555636060 ^ 481028664) * (-1030920322 ^ -1555636060 ^ 481028664);
      var10004 = -800298940 ^ 1778817849 ^ -760182392;
      var10005 = ((int)-1354903959099489760L ^ -1657643991 ^ 43717017) * ((int)-1354903959099489760L ^ -1657643991 ^ 43717017);
      var10005 = 1870604247 ^ -1222504162 ^ -367030694;
      var10006 = ((int)-3784875479177116112L ^ 866326661 ^ -1519836962) * ((int)-3784875479177116112L ^ 866326661 ^ -1519836962);
      var10006 = (int)-5831113586382090623L ^ 1108824586 ^ -1434780517;
      var10007 = -1765897631 ^ 475032849 ^ 5297464;
      var10007 = 1807553329 ^ -1630283940 ^ -271436813;
      var10008 = "cek";
      var10003 = c(
         "뻾ꌹ뻟ꍎ뺡ꍉ뺦ꍄ뻟ꌸ뺣ꌵ뫁ꌸ뻓ꍌ뺦ꍌ뻜ꍁ뺮", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ", var10005, var10006, var10007, -240515773 ^ 1336325409 ^ -1104997015
      );
      var10005 = -1459912494 ^ -1957259596 ^ 598546016;
      var10005 = (int)-7417998138385809659L ^ 1069704395 ^ -289186878;
      var10005 = (int)6359580075900539869L ^ 2111268690 ^ 224621726;
      var10005 = 1996083676 ^ 236464315 ^ 2028075365;
      var10006 = (int)-7001092842922030807L ^ -1014981318 ^ -644164591;
      var10006 = -127175503 ^ 438289313 ^ -495667438;
      var10006 = (int)-7407968146625010904L ^ 1702700903 ^ 612156492;
      var10006 = (int)-7586240338748096871L ^ 123008647 ^ 58378267;
      var10007 = ((int)-1886177588205849644L ^ 1179553638 ^ -634351917) + (1624984884 ^ -508727719 ^ -1237237068);
      this.B = new SliderSetting(var10003, 0.25F, 0.1F, 1.0F, 0.05F)
         .a(
            () -> {
               int var10001x = (int)4568627730460553022L;
               int var2x = -2136232070;
               int var1x = var10001x;
               var10001x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = 1004480589;
               var1x = var10001x;
               var10001x = (var1x | var2x) - (var1x & var2x);
               int var10002x = (int)3290400481984292099L;
               var2x = -1548349895;
               var1x = var10002x;
               var10002x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = 1791315452;
               var1x = var10002x;
               var10002x = (var1x | var2x) & ~(var1x & var2x);
               int var10003x = (int)5646252827643275459L;
               var2x = 1243260292;
               var1x = var10003x;
               var10003x = (var1x | var2x) & ~(var1x & var2x);
               var2x = -2126392095;
               var1x = var10003x;
               var10003x = (var1x | var2x) - (var1x & var2x);
               var10003x = (int)856683345620386993L;
               var2x = -1539562574;
               var1x = var10003x;
               var10003x = var1x & ~var2x | ~var1x & var2x;
               var2x = 1389158288;
               var1x = var10003x;
               var10003x = (var1x | var2x) & (~var1x | ~var2x);
               int var10004x = (int)5750358331697445501L;
               var2x = 761769713;
               var1x = var10004x;
               var10004x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = 1977493093;
               var1x = var10004x;
               var10004x = (var1x | var2x) & ~(var1x & var2x);
               var10004x = (int)-3754976456893209099L;
               var2x = 1697573515;
               var1x = var10004x;
               var10004x = (var1x | var2x) & ~(var1x & var2x);
               var2x = -645610422;
               var1x = var10004x;
               var10004x = var1x & ~var2x | ~var1x & var2x;
               int var10005x = (int)-3241521925906684542L;
               var2x = 1255130001;
               var1x = var10005x;
               var10005x = (var1x | var2x) - (var1x & var2x);
               var2x = 1044629376;
               var1x = var10005x;
               var10005x = (var1x | var2x) - (var1x & var2x);
               var10005x = (int)-3228982397493995668L;
               var2x = -1928567320;
               var1x = var10005x;
               var10005x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = -1768996355;
               var1x = var10005x;
               var10005x = var1x + var2x - 2 * (var1x & var2x);
               String var10006x = "cgq";
               int var68x = (int)915354650894919592L;
               var2x = 75927848;
               var1x = var68x;
               int var69x = (var1x | var2x) - (var1x & var2x);
               var2x = -1902708256;
               var1x = var69x;
               int var46x;
               if (this.e
                     .b(c("㿌ࡡ㿣࠙㾐ࠑ", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ", var10003x, var10004x, var10005x, var1x & ~var2x | ~var1x & var2x))
                  && this.z.a()) {
                  var46x = (int)-3923728152863295096L;
                  var2x = -2002142265;
                  var1x = var46x;
                  var46x = var1x + var2x - 2 * (var1x & var2x);
                  var2x = 768311886;
                  var1x = var46x;
                  var46x = (var1x | var2x) - (var1x & var2x);
               } else {
                  var46x = (int)-3900346365450367410L;
                  var2x = 768924309;
                  var1x = var46x;
                  var46x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = 1871484123;
                  var1x = var46x;
                  var46x = (var1x | var2x) & ~(var1x & var2x);
               }

               return Boolean.valueOf(pulse.Bool.from(var46x));
            }
         );
      var10003 = "cel";
      var10004 = (2026038331 ^ -1993878943 ^ -1085414183) * (2026038331 ^ -1993878943 ^ -1085414183);
      String var1268 = "cem";
      var10005 = (int)663438767792489706L ^ -1757595041 ^ -251591130;
      var10006 = (1413474681 ^ -1431812144 ^ 929603615) * (1413474681 ^ -1431812144 ^ 929603615);
      var10006 = 1740619149 ^ -2098454749 ^ 2072231326;
      String var1640 = "cen";
      var10007 = (int)4162536062186420067L ^ -1023937474 ^ 1515274619;
      int var1753 = 685575206 ^ 1508589158 ^ 1991252785;
      this.C = new SettingGroup(
         c(
            "뻇扫뻔戛",
            "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ",
            var10005,
            var10006,
            var10007,
            (int)6935417390685307049L ^ -1710977345 ^ -1896437187
         )
      );
      int var1026 = ((int)-5828995319854800764L ^ 898579572 ^ -1269632582) * ((int)-5828995319854800764L ^ 898579572 ^ -1269632582);
      var10004 = (-1552065299 ^ 38960868 ^ -1420918450) + (1235995900 ^ 664846545 ^ 1798918117);
      var10005 = (int)1893407308823754019L ^ 1032685749 ^ 1376356511;
      var10005 = (int)-358618089294909414L ^ -1198256253 ^ -77953270;
      String var1451 = "ceo";
      var10006 = 647991753 ^ 1491703352 ^ -524015310;
      int var1754 = (int)-6316085067741347687L ^ 1157954359 ^ 186923936;
      int var1755 = -908527799 ^ 1558388489 ^ -1791236030;
      int var1756 = -680955777 ^ 1908975470 ^ -1499343075;
      var10007 = (int)5142283595654453740L ^ 849113720 ^ 1074086560;
      var10008 = "cep";
      this.D = new BooleanSetting(
         c(
            "뻇痾뻔疎뫁痶뻚痴뻔痱뺣痼",
            "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ",
            var10005,
            var10006,
            var10007,
            (int)-2076213262147073432L ^ -1706605818 ^ 1435695824
         ),
         true
      );
      int var1027 = ((int)8967837998287956422L ^ -1595783384 ^ 1325054566) + (-1735069652 ^ 310577124 ^ 891273318);
      var10004 = ((int)1165249553675116401L ^ 1469873013 ^ 326143524) * ((int)1165249553675116401L ^ 1469873013 ^ 326143524);
      var10005 = -790079955 ^ -1311438052 ^ 2036780702;
      var10005 = (int)-4751066753475644867L ^ -1876871847 ^ 478806007;
      String var1453 = "ceq";
      var10006 = -648492426 ^ 1496168732 ^ 517449134;
      int var1758 = (int)-8486079549882603786L ^ -1862202621 ^ -594842140;
      int var1759 = (int)-1205316681657582750L ^ -751982347 ^ -522202224;
      var10007 = 591023305 ^ -1704390377 ^ -1247486900;
      var10009 = 1294232692 ^ -905120552 ^ -2027382593;
      this.E = new ColorSetting(
            c("뻻᷽뺠ᶏ뻟ᷱ뻜ᶆ뻘᧭뺧᷿뻔ᶏ", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ", var10005, var10006, var10007, -188947020 ^ 307571683 ^ -420751896),
            Color.WHITE
         )
         .a(() -> {
            int var10x;
            if (this.D.a()) {
               var10x = (int)-5928573693551663982L;
               int var2x = 169026625;
               int var1x = var10x;
               var10x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = -248282925;
               var1x = var10x;
               var10x = var1x & ~var2x | ~var1x & var2x;
            } else {
               var10x = (int)-8012531442495719427L;
               int var7x = -1465280517;
               int var4x = var10x;
               var10x = var4x & ~var7x | ~var4x & var7x;
               var7x = 1523408903;
               var4x = var10x;
               var10x = (var4x | var7x) - (var4x & var7x);
            }

            return Boolean.valueOf(pulse.Bool.from(var10x));
         });
      var10004 = 165717782 ^ 1899595861 ^ 2027499336;
      var10004 = (int)-8892751551631710627L ^ 1665084446 ^ 34540096;
      var10004 = (int)7743187952151824037L ^ 1533196908 ^ -1904558886;
      var10004 = -1747505898 ^ -320799825 ^ 2067257017;
      var10004 = 1202708642 ^ 375461578 ^ -1544955879;
      var10005 = (687001635 ^ -1326709372 ^ 490720131) * (687001635 ^ -1326709372 ^ 490720131);
      var10005 = (int)5279710275005579100L ^ 951827266 ^ -1470694259;
      var10006 = -1945213099 ^ -943129613 ^ -31417254;
      var10006 = -1774359739 ^ -1176305681 ^ -1321946225;
      int var1760 = 388437552 ^ 341344993 ^ 58692828;
      int var1761 = (int)8037163981254833695L ^ -1242874746 ^ 1571359368;
      int var1762 = 1011094611 ^ -2078772373 ^ -1201903811;
      var10007 = -429908439 ^ 1501295599 ^ -1642051920;
      var10009 = (int)-6535956277809526182L ^ 764552747 ^ -599790467;
      var10009 = -1738112182 ^ 1681918836 ^ -64583632;
      var10009 = -1697311898 ^ -615842646 ^ 1101000671;
      var10009 = 579188916 ^ 531620560 ^ 1026185830;
      this.F = new SettingGroup(
         c("뻾樒뻙湲뺢橦뻑樒뻔", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ", var10005, var10006, var10007, 311722765 ^ -724249590 ^ -972408025)
      );
      var10003 = "cer";
      var10004 = (206978035 ^ 1639850529 ^ -874644019) * (206978035 ^ 1639850529 ^ -874644019);
      var10006 = 864023594 ^ -704208429 ^ -445032967;
      var10006 = (int)-5275392104523410237L ^ -921015129 ^ 266418275;
      var10006 = (int)-3211844169513474754L ^ -1601905124 ^ 314161953;
      var10006 = -1928626895 ^ 776161360 ^ -1555548813;
      var10005 = -579767621 ^ 349291792 ^ -69071048;
      String var1461 = "ces";
      var10006 = (int)-7070888632527178523L ^ 409826865 ^ -42907535;
      int var1763 = (int)-5001174853470807281L ^ 2042427832 ^ -1359125849;
      int var1764 = 1961591951 ^ 1867787765 ^ 465545590;
      int var1765 = 1582927441 ^ 2001575963 ^ 689188418;
      var10007 = -1315264520 ^ -1783210620 ^ 630023281;
      int var1766 = (1752313943 ^ 2090753787 ^ -583032369) * (1752313943 ^ 2090753787 ^ -583032369);
      this.G = new BooleanSetting(
         c(
            "뻳짨뻚즜뺦짪뺣즞",
            "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ",
            var10005,
            var10006,
            var10007,
            (int)4913475810934584982L ^ 1728750639 ^ -1005478631
         ),
         pulse.Bool.from((int)-7581925367238407373L ^ -1 ^ -1)
      );
      int var1029 = ((int)5295434426227575094L ^ -1180005137 ^ 1975077452) + (483216629 ^ 388026319 ^ 2009480745);
      var10004 = (2106538503 ^ 1403041348 ^ -1081127248) + ((int)3649030463386191722L ^ -2103243361 ^ 1266652582);
      var10005 = 1571014575 ^ -1568373952 ^ 1478241782;
      var10005 = -1909902865 ^ -1377578550 ^ 294148278;
      String var1463 = "cet";
      var10006 = -1462316194 ^ -1174323897 ^ -1943611115;
      int var1767 = 671059774 ^ -329102805 ^ -878852847;
      var10007 = 1020861058 ^ 1848453194 ^ 1338931023;
      var10008 = "ceu";
      this.H = new BooleanSetting(
            c("뻹穂뻝穀뻜稺뺣稹뫁稳뻓穀뺣", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ", var10005, var10006, var10007, 1955404855 ^ -1662267405 ^ -399069245),
            true
         )
         .a(() -> this.G.a());
      var10003 = "cev";
      var10004 = (461982444 ^ -348892204 ^ 357667363) + (1890113117 ^ 1358794170 ^ -1440906754);
      var10006 = (int)8293252532267156232L ^ -1554828136 ^ -1321748606;
      var10006 = -208842007 ^ -231417559 ^ 28937164;
      var10005 = (int)-8862412704484333914L ^ -328541240 ^ 1852114429;
      var10006 = (-1139046134 ^ -1075330240 ^ -2024176589) + (1259793293 ^ -1161078419 ^ 563304479);
      var10006 = (int)-5003020699203055415L ^ -200238198 ^ 245442225;
      int var1769 = (int)-599266362327116446L ^ -1337415554 ^ -1813086953;
      var10007 = (int)8099361231437269799L ^ 357755110 ^ -2045505473;
      var10009 = (int)-6923592194766943287L ^ 2083454808 ^ -1726925680;
      var10009 = 1393972817 ^ 97960269 ^ 1455462160;
      var10009 = (int)6537274437557711147L ^ -344946783 ^ -491850086;
      var10009 = (int)-3100982408271108624L ^ -1836123113 ^ 2127370721;
      this.I = new ColorSetting(
            c(
               "뻇㒭뻔㓝뫁㓜뺡㒡뻜㒯",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ",
               var10005,
               var10006,
               var10007,
               (int)3620314815703288259L ^ -1888397394 ^ 1248291968
            ),
            new Color(
               (int)6987387040397079387L ^ -809852538 ^ -592211422,
               (int)-6254927229003467930L ^ -1991919468 ^ -904803392,
               (int)-5285853044694996496L ^ 2114641570 ^ 637761376
            )
         )
         .a(() -> {
            int var10x;
            if (this.G.a() && this.H.a()) {
               int var7x = -2012055312;
               int var4x = 433855702;
               var10x = (var4x | var7x) - (var4x & var7x);
               var7x = -1848744921;
               var4x = var10x;
               var10x = (var4x | var7x) - (var4x & var7x);
            } else {
               var10x = (int)-8070712513349769148L;
               int var2x = -1487421045;
               int var1x = var10x;
               var10x = var1x + var2x - 2 * (var1x & var2x);
               var2x = 1647012303;
               var1x = var10x;
               var10x = var1x + var2x - 2 * (var1x & var2x);
            }

            return Boolean.valueOf(pulse.Bool.from(var10x));
         });
      int var1031 = (int)7374603516172924245L ^ -917385789 ^ -543594289;
      var10005 = -875113670 ^ 1862694219 ^ -1529829789;
      var10005 = (int)-2825906016985844723L ^ -120744734 ^ -802758419;
      var10005 = (int)-5834719053068589915L ^ 7938259 ^ 1440580734;
      var10005 = -994728733 ^ -1277412131 ^ 2003408947;
      var10005 = 1736861951 ^ -1815821578 ^ -1317863660;
      var10005 = 1782483449 ^ 1784216038 ^ 841271436;
      var10006 = (int)-2661942770728453585L ^ -1150063956 ^ -1469712120;
      var10006 = 523217217 ^ -1314620980 ^ 810076218;
      var10007 = ((int)-8365502682377573118L ^ -1503653451 ^ -556647663) * ((int)-8365502682377573118L ^ -1503653451 ^ -556647663);
      var10007 = (int)-427185561786576745L ^ -1890853987 ^ 932142813;
      var10008 = "cew";
      this.J = new BooleanSetting(
            c(
               "뻂宁뻛対뺡宏뺣完뫁寰뻜寸뻝寰뺧寸뺯",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ",
               var10005,
               var10006,
               var10007,
               (int)-4466737228175272238L ^ -512169901 ^ -1060953293
            ),
            true
         )
         .a(() -> this.G.a());
      int var1032 = ((int)-4734962915702630940L ^ -1937646327 ^ -482575169) + ((int)338214397034887540L ^ 443756767 ^ 1716950916);
      var10005 = (int)6804794476817205924L ^ 1401881297 ^ -1414150022;
      var10005 = (int)3252104414614183565L ^ 1064625477 ^ 721042372;
      var10005 = (279159492 ^ -608437354 ^ 167183544) + ((int)6832233536946153295L ^ -938468032 ^ 1437969914);
      var10005 = -744760502 ^ -1878914169 ^ 1910204510;
      var10006 = -1880014734 ^ 1980691228 ^ -1938054808;
      var10006 = (int)23248001124440354L ^ 2040235740 ^ -141924499;
      var10007 = -1217673617 ^ 92663484 ^ -1184626577;
      var10007 = (int)-689190365217555586L ^ -1678207131 ^ 794406841;
      var10009 = (int)-378898133891256284L ^ 542482647 ^ -1156591372;
      var10009 = 963030544 ^ 723743001 ^ 306568966;
      var10009 = 321930213 ^ 1154904852 ^ 1474703606;
      var10003 = c(
         "뻽믁뻟믊뻙뮾뻔믇뺭뿜뺢뮽뻛믂뺡믉뻜믄뺮", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ", var10005, var10006, var10007, 262741916 ^ -489407397 ^ -313549239
      );
      String var1146 = "cex";
      var10006 = (int)-410283749199186266L ^ -2027128802 ^ 284266160;
      var10006 = (-1453985055 ^ 1630676539 ^ 509929941) * (-1453985055 ^ 1630676539 ^ 509929941);
      String var1652 = "cey";
      this.K = new SliderSetting(var10003, 3.0F, 1.2F, 5.0F, 0.1F).a(() -> {
         int var9x;
         if (this.G.a() && this.J.a()) {
            int var7x = -2018627697;
            int var4x = 1482117284;
            var9x = var4x + var7x - 2 * (var4x & var7x);
            var7x = -537297110;
            var4x = var9x;
            var9x = var4x & ~var7x | ~var4x & var7x;
         } else {
            int var2x = 252828474;
            int var1x = -814784669;
            var9x = var1x + var2x - 2 * (var1x & var2x);
            var2x = -1065450407;
            var1x = var9x;
            var9x = (var1x | var2x) & (~var1x | ~var2x);
         }

         return Boolean.valueOf(pulse.Bool.from(var9x));
      });
      var10004 = (int)-6209138933477939350L ^ -1799876534 ^ 4716325;
      var10004 = -431226766 ^ 82314273 ^ -492567460;
      var10004 = 90448622 ^ 150030056 ^ 227894285;
      var10004 = 1846559268 ^ 637030582 ^ 1273500290;
      String var1151 = "cez";
      var10005 = ((int)-23859467848988868L ^ 1461663350 ^ -616144415) + ((int)1929960900804264563L ^ 890491129 ^ -339370147);
      var10005 = 1370461103 ^ 536914180 ^ 1139638840;
      var10006 = (-1867157852 ^ -1127160278 ^ -843760119) * (-1867157852 ^ -1127160278 ^ -843760119);
      var10006 = -570815376 ^ -545527316 ^ -1672567666;
      var10007 = ((int)2435930176098244175L ^ -2035696270 ^ 58058397) * ((int)2435930176098244175L ^ -2035696270 ^ 58058397);
      var10007 = (int)-151063998403727115L ^ -1496395500 ^ -1090118231;
      int var1771 = -1795286293 ^ 1198537922 ^ -1939755968;
      var10003 = c(
         "뻵聄뻙耽뻔聄뺭聂뻟耾뺣耳뫁耲뺥耻뻔聅뺣聏",
         "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ",
         var10005,
         var10006,
         var10007,
         (int)-6173435785375640099L ^ 1438400487 ^ -594367433
      );
      var10004 = ((int)2197259616982007700L ^ 1567244756 ^ -1560227426) * ((int)2197259616982007700L ^ 1567244756 ^ -1560227426);
      var10005 = ((int)-4854693751853923246L ^ -162308185 ^ -1466479120) + ((int)-5941945196888554642L ^ 1964506950 ^ 2008118042);
      int var1772 = -1078531553 ^ -917238163 ^ 1994581118;
      this.L = new SliderSetting(var10003, 0.8F, 0.3F, 2.0F, 0.1F).a(() -> {
         int var10x;
         if (this.G.a() && this.J.a()) {
            var10x = (int)-2439049768419675057L;
            int var7x = 1218853852;
            int var4x = var10x;
            var10x = var4x + var7x - 2 * (var4x & var7x);
            var7x = -880898158;
            var4x = var10x;
            var10x = (var4x | var7x) & ~(var4x & var7x);
         } else {
            var10x = (int)-4601718678112975871L;
            int var2x = -2040768568;
            int var1x = var10x;
            var10x = var1x + var2x - 2 * (var1x & var2x);
            var2x = -996699191;
            var1x = var10x;
            var10x = var1x & ~var2x | ~var1x & var2x;
         }

         return Boolean.valueOf(pulse.Bool.from(var10x));
      });
      this.M = new HashMap<>();
      String var10001 = "cfa";
      int var1035 = (int)1585304448328638074L ^ -2139184408 ^ -1761133423;
      int var1036 = (int)8574373694032747071L ^ 949820457 ^ 618366470;
      int var1037 = (int)-1951426709200260986L ^ -1481186191 ^ -413248259;
      int var1038 = 1166011189 ^ 1309150848 ^ 192406968;
      int var1039 = ((int)565179145208858650L ^ -1659367893 ^ -660848581) + ((int)-1519268080898983871L ^ -1466855182 ^ 1749225249);
      int var1040 = 1078831502 ^ 1060227936 ^ 1295964797;
      var10004 = ((int)-3462669063456456854L ^ 547639532 ^ -1218588113) + (-484459064 ^ -1422345721 ^ -1710533539);
      var10004 = 1518623052 ^ -982981801 ^ 22043461;
      var10005 = (577736467 ^ 1967010034 ^ 158601200) + (-1872281150 ^ -556080681 ^ -181967065);
      var10005 = 95444827 ^ 1463728512 ^ 1478242629;
      var10006 = (1334260901 ^ 386201562 ^ -1583704699) + (219608268 ^ -1995331504 ^ -1929985748);
      var10001 = c(
         "몑\u245e몍\u2458몄", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ", var1040, var10004, var10005, -641608273 ^ 987477756 ^ -486128374
      );
      int var10002 = (int)316593383327733258L ^ 514489498 ^ -1361744083;
      var10004 = -1045247245 ^ -792882404 ^ 286218724;
      var10004 = (int)-7343780517964632486L ^ -805054120 ^ -162826485;
      var10004 = -1999806158 ^ 1510821390 ^ -759156936;
      var10004 = (1021852340 ^ -1863077852 ^ 399475190) * (1021852340 ^ -1863077852 ^ 399475190);
      var10004 = (int)5752005210610645649L ^ -552430813 ^ -1846243039;
      var10005 = (-1516267422 ^ 1601694275 ^ -140617993) + (-38299298 ^ 1922667555 ^ 931807504);
      var10005 = -567344229 ^ 450257944 ^ 1515463458;
      var10006 = ((int)8340809752987887014L ^ 1402254225 ^ 590190562) + (355447387 ^ -740255221 ^ -1347160390);
      var10006 = 1901912706 ^ 2123274816 ^ 163884522;
      int var1773 = (int)-896107666375170003L ^ 686543352 ^ 1776286148;
      int var1774 = -234292810 ^ -412093188 ^ 359075138;
      this.N = Identifier.of(
         var10001,
         c(
            "몕讋몙讚몔讜몄讝뫎讚몀讜몆讋몕诀몑讀몆",
            "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ",
            var10004,
            var10005,
            var10006,
            (int)9028040454760422068L ^ -946831884 ^ -1002098980
         )
      );
      this.targetPlayers = new BooleanSetting("Players", true);
      this.targetMobs = new BooleanSetting("Mobs", true);
      this.O = new HashMap<>();
      this.P = new HashMap<>();
      this.Q = new HashMap<>();
      this.R = new HashMap<>();
      this.S = System.currentTimeMillis();
   }

   @EventHandler
   public void a(WorldRenderEvent var1) {
      long var2 = System.currentTimeMillis();
      float var10000 = (float)(var2 - this.S);
      int var16 = 165840178;
      int var15 = 1354132973;
      int var10002 = (var15 | var16) - (var15 & var16);
      var16 = 1498736861;
      var15 = var10002;
      var10002 = (var15 | var16) & (~var15 | ~var16);
      var10002 = (int)-7074017714418355057L;
      var16 = -340989108;
      var15 = var10002;
      var10002 = (var15 | var16) - (var15 & var16);
      var16 = -1092018224;
      var15 = var10002;
      var10002 = (var15 | var16) - (var15 & var16);
      var16 = -1772409840;
      var15 = -951405834;
      var10002 = var15 & ~var16 | ~var15 & var16;
      var16 = 1360109302;
      var15 = var10002;
      var10002 = (var15 | var16) & ~(var15 & var16);
      var16 = -884355776;
      var15 = 2110952683;
      var10002 = var15 & ~var16 | ~var15 & var16;
      var16 = -1231332959;
      var15 = var10002;
      var10002 = var15 + var16 - 2 * (var15 & var16);
      var16 = 510008493;
      var15 = -623278031;
      var10002 = var15 + var16 - 2 * (var15 & var16);
      var16 = -994077554;
      var15 = var10002;
      var10002 = var15 + var16 - 2 * (var15 & var16);
      float var4 = var10000 / 1000.0F;
      this.S = var2;
      String var10001 = "cfb";
      var4 = Math.min(var4, 0.1F);
      LivingEntity var5 = this.p();
      if (var5 != null && this.a(var5)) {
         AnimationState var6 = this.M.computeIfAbsent(var5, var0 -> new AnimationState());
         var16 = 1227612690;
         var15 = 375103107;
         var10002 = var15 + var16 - 2 * (var15 & var16);
         var16 = -1100368570;
         var15 = var10002;
         var10002 = ((var15 | var16) - (var15 & var16)) * ((var15 | var16) - (var15 & var16));
         var16 = 5454557;
         var15 = 344984073;
         int var10004 = (var15 | var16) & (~var15 | ~var16);
         var16 = 348336341;
         var15 = var10004;
         var6.a(1.0, 0.5, pulse.Easing.f, pulse.Bool.from((var15 | var16) - (var15 & var16)));
      }

      HashSet<LivingEntity> var18 = new HashSet<>();

      for (Entry<LivingEntity, AnimationState> var8 : this.M.entrySet()) {
         LivingEntity var9 = var8.getKey();
         if (this.a(var9)) {
            AnimationState var10 = var8.getValue();
            if (var9 != var5) {
               var10002 = (int)-7411127122698378821L;
               var16 = -164646131;
               var15 = var10002;
               var10002 = var15 + var16 - 2 * (var15 & var16);
               var16 = 1685036373;
               var15 = var10002;
               var10002 = var15 & ~var16 | ~var15 & var16;
               var16 = -1337352578;
               var15 = -191508950;
               int var403 = (var15 | var16) - (var15 & var16);
               var16 = 1155289173;
               var15 = var403;
               var10.a(0.0, 0.5, pulse.Easing.f, pulse.Bool.from(var15 & (var16 ^ -1) | (var15 ^ -1) & var16));
            }

            var10.a();
            if (var10.d() && var10.i() == 0.0) {
               var18.add(var9);
               int var329 = (int)-7070516940051740594L;
               var16 = 654176011;
               var15 = var329;
               int var330 = var15 + var16 - 2 * (var15 & var16);
               var16 = -1916099888;
               var15 = var330;
               int var331 = (var15 + var16 - 2 * (var15 & var16)) * (var15 + var16 - 2 * (var15 & var16));
               var16 = 1944031604;
               var15 = 2125905400;
               int var332 = var15 + var16 - 2 * (var15 & var16);
               var16 = 1942080976;
               var15 = var332;
               int var14 = var15 + var16 - 2 * (var15 & var16);
               var16 = 1900858435;
               var15 = 845287062;
               int var345 = (var15 | var16) & ~(var15 & var16);
               var16 = 1127138004;
               var15 = var345;
               int var346 = var15 + var16 - 2 * (var15 & var16);
               int var347 = (int)6397625015417602498L;
               var16 = -1468329200;
               var15 = var347;
               int var348 = var15 & ~var16 | ~var15 & var16;
               var16 = -1704619303;
               var15 = var348;
               int var349 = var15 + var16 - 2 * (var15 & var16);
               var16 = 502209177;
               var15 = -572752131;
               int var350 = (var15 | var16) - (var15 & var16);
               var16 = -1070373790;
               var15 = var350;
               int var351 = var15 + var16 - 2 * (var15 & var16);
               var16 = 20418865;
               var15 = -752597171;
               int var333 = (var15 | var16) - (var15 & var16);
               var16 = -1959944139;
               var15 = var333;
               if (((var15 | var16) & (~var15 | ~var16)) >= var14) {
                  var16 = -1356676076;
                  var15 = 208827861;
                  int var352 = var15 & ~var16 | ~var15 & var16;
                  var16 = -1554992686;
                  var15 = var352;
                  int var353 = (var15 | var16) & ~(var15 & var16);
                  var16 = -1945234869;
                  var15 = 1921702728;
                  int var354 = (var15 | var16) & (~var15 | ~var16);
                  var16 = -24852223;
                  var15 = var354;
                  int var355 = (var15 | var16) & ~(var15 & var16);
                  int var334 = (int)1380551378981318623L;
                  var16 = -903159994;
                  var15 = var334;
                  int var335 = (var15 | var16) - (var15 & var16);
                  var16 = 1193947377;
                  var15 = var335;
                  var14 = (var15 | var16) - (var15 & var16);
                  a = var14;
               }
            } else {
               this.a(var9, var4);
               String var11 = this.e.d();
               var16 = 1869543445;
               var15 = -544028095;
               int var322 = var15 & ~var16 | ~var15 & var16;
               var16 = 1325649323;
               var15 = var322;
               int var12 = (var15 | var16) & ~(var15 & var16);
               switch (var11.hashCode()) {
                  case -579872008:
                     var16 = -892850368;
                     var15 = 99562299;
                     int var343 = var15 + var16 - 2 * (var15 & var16);
                     var16 = 1853300320;
                     var15 = var343;
                     int var344 = ((var15 | var16) & (~var15 | ~var16)) * ((var15 | var16) & (~var15 | ~var16));
                     var16 = -1919860638;
                     var15 = -207299981;
                     var10002 = (var15 | var16) & ~(var15 & var16);
                     var16 = -1002985451;
                     var15 = var10002;
                     var10002 = (var15 | var16) & (~var15 | ~var16);
                     String var400 = "cfd";
                     var16 = -1256293323;
                     var15 = -1507696319;
                     int var401 = var15 + var16 - 2 * (var15 & var16);
                     var16 = 561948135;
                     var15 = var401;
                     int var402 = var15 & ~var16 | ~var15 & var16;
                     String var430 = "cfe";
                     var16 = 889406665;
                     var15 = -464921755;
                     int var431 = var15 & ~var16 | ~var15 & var16;
                     var16 = 1484882646;
                     var15 = var431;
                     int var432 = var15 + var16 - 2 * (var15 & var16);
                     int var451 = (int)3766807908194137631L;
                     var16 = 614328760;
                     var15 = var451;
                     var451 = (var15 | var16) & (~var15 | ~var16);
                     var16 = 1304199600;
                     var15 = var451;
                     var451 = var15 + var16 - 2 * (var15 & var16);
                     int var476 = (int)5766140198842291438L;
                     var16 = 1396967365;
                     var15 = var476;
                     var476 = (var15 | var16) & (~var15 | ~var16);
                     var16 = -1159194605;
                     var15 = var476;
                     var16 = var15 + var16 - 2 * (var15 & var16);
                     var15 = var451;
                     var451 = (var15 & ~var16) + (var16 & ~var15) + 2 * (var15 & var16);
                     var16 = 1900399283;
                     var15 = -610408110;
                     var451 = (var15 | var16) & ~(var15 & var16);
                     var16 = -1319319635;
                     var15 = var451;
                     var451 = (var15 | var16) & (~var15 | ~var16);
                     var16 = 314926697;
                     var15 = 600872828;
                     int var484 = (var15 | var16) & (~var15 | ~var16);
                     var16 = 823521553;
                     var15 = var484;
                     var484 = (var15 | var16) & (~var15 | ~var16);
                     var16 = 287661815;
                     var15 = -1727838512;
                     var476 = (var15 | var16) & (~var15 | ~var16);
                     var16 = -2006035275;
                     var15 = var476;
                     if (var11.equals(
                        c("ꓜ僵ꓶ僳ꒆ僷ꒄ僿ꓼ", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ", var402, var432, var451, (var15 | var16) - (var15 & var16))
                     )) {
                        int var327 = (int)-9141606669476480482L;
                        var16 = -407882343;
                        var15 = var327;
                        int var328 = (var15 | var16) & ~(var15 & var16);
                        var16 = -97316987;
                        var15 = var328;
                        var12 = (var15 | var16) - (var15 & var16);
                     }
                     break;
                  case 32361014:
                     var16 = 1912027989;
                     var15 = -490272961;
                     int var341 = var15 & ~var16 | ~var15 & var16;
                     var16 = -660260272;
                     var15 = var341;
                     int var342 = ((var15 | var16) & (~var15 | ~var16)) * ((var15 | var16) & (~var15 | ~var16));
                     var16 = 757466114;
                     var15 = 1298309047;
                     var10002 = var15 + var16 - 2 * (var15 & var16);
                     var16 = -1289377646;
                     var15 = var10002;
                     var10002 = var15 & ~var16 | ~var15 & var16;
                     int var414 = (int)8975578486312458349L;
                     var16 = 66649891;
                     var15 = var414;
                     var414 = var15 + var16 - 2 * (var15 & var16);
                     var16 = 565323586;
                     var15 = var414;
                     var414 = (var15 | var16) & (~var15 | ~var16);
                     var414 = (int)6007415744963109288L;
                     var16 = 516552630;
                     var15 = var414;
                     var414 = (var15 | var16) - (var15 & var16);
                     var16 = -2041276914;
                     var15 = var414;
                     var414 = var15 + var16 - 2 * (var15 & var16);
                     var16 = -566436584;
                     var15 = 1805435031;
                     var414 = (var15 | var16) & (~var15 | ~var16);
                     var16 = -1247797884;
                     var15 = var414;
                     var414 = var15 & ~var16 | ~var15 & var16;
                     var414 = (int)-5763363591345769559L;
                     var16 = 717522135;
                     var15 = var414;
                     var414 = var15 & ~var16 | ~var15 & var16;
                     var16 = 1085208435;
                     var15 = var414;
                     var414 = (var15 | var16) & (~var15 | ~var16);
                     var16 = 871014198;
                     var15 = 1485997337;
                     int var398 = (var15 | var16) & (~var15 | ~var16);
                     var16 = 1497014972;
                     var15 = var398;
                     var398 = var15 + var16 - 2 * (var15 & var16);
                     var414 = (int)-754997924220600297L;
                     var16 = 2020408596;
                     var15 = var414;
                     var414 = (var15 | var16) & ~(var15 & var16);
                     var16 = -844295392;
                     var15 = var414;
                     var414 = var15 + var16 - 2 * (var15 & var16);
                     var16 = 659329158;
                     var15 = 1716587110;
                     var414 = (var15 | var16) - (var15 & var16);
                     var16 = -928531513;
                     var15 = var414;
                     var414 = var15 + var16 - 2 * (var15 & var16);
                     var16 = 1341184758;
                     var15 = 1482758749;
                     int var468 = (var15 | var16) & ~(var15 & var16);
                     var16 = 395428014;
                     var15 = var468;
                     var468 = (var15 | var16) & (~var15 | ~var16);
                     var16 = -915217857;
                     var15 = -458491259;
                     var468 = var15 + var16 - 2 * (var15 & var16);
                     var16 = 769202367;
                     var15 = var468;
                     var468 = var15 & ~var16 | ~var15 & var16;
                     var468 = (int)3232849855786864630L;
                     var16 = -1027784434;
                     var15 = var468;
                     var468 = (var15 | var16) & (~var15 | ~var16);
                     var16 = 14946041;
                     var15 = var468;
                     var468 = (var15 | var16) & (~var15 | ~var16);
                     var16 = -179452512;
                     var15 = 798473937;
                     int var449 = (var15 | var16) & (~var15 | ~var16);
                     var16 = -853300481;
                     var15 = var449;
                     var449 = var15 & ~var16 | ~var15 & var16;
                     int var10007 = (int)-5415730641718773316L;
                     var16 = -239587797;
                     var15 = var10007;
                     var10007 = (var15 | var16) & (~var15 | ~var16);
                     var16 = 614422424;
                     var15 = var10007;
                     var10007 = (var15 | var16) & (~var15 | ~var16);
                     var10007 = (int)-1920122232323709308L;
                     var16 = 711501424;
                     var15 = var10007;
                     var10007 = var15 & ~var16 | ~var15 & var16;
                     var16 = -345292554;
                     var15 = var10007;
                     var10007 = (var15 | var16) - (var15 & var16);
                     var16 = 1818188140;
                     var15 = -1026278228;
                     var468 = var15 & ~var16 | ~var15 & var16;
                     var16 = -1363397121;
                     var15 = var468;
                     if (var11.equals(
                        c("ꓜ䰪ꒅ䱙", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ", var398, var414, var449, var15 + var16 - 2 * (var15 & var16))
                     )) {
                        int var325 = (int)2619681978804827312L;
                        var16 = 1954163726;
                        var15 = var325;
                        int var326 = (var15 | var16) - (var15 & var16);
                        var16 = 1063082175;
                        var15 = var326;
                        var12 = (var15 | var16) & ~(var15 & var16);
                     }
                     break;
                  case 1148183415:
                     int var338 = (int)-1086666371563146312L;
                     var16 = 1264885145;
                     var15 = var338;
                     int var339 = (var15 | var16) & (~var15 | ~var16);
                     var16 = -1924733507;
                     var15 = var339;
                     int var340 = ((var15 | var16) & ~(var15 & var16)) * ((var15 | var16) & ~(var15 & var16));
                     var16 = -1201374938;
                     var15 = 573750751;
                     int var383 = var15 + var16 - 2 * (var15 & var16);
                     var16 = -1705589525;
                     var15 = var383;
                     var383 = (var15 | var16) & (~var15 | ~var16);
                     var383 = (int)-4914035988210589109L;
                     var16 = -36180219;
                     var15 = var383;
                     var383 = var15 + var16 - 2 * (var15 & var16);
                     var16 = 284101956;
                     var15 = var383;
                     var383 = (var15 | var16) & (~var15 | ~var16);
                     var383 = (int)6697691174549807958L;
                     var16 = 1790297106;
                     var15 = var383;
                     var383 = var15 & ~var16 | ~var15 & var16;
                     var16 = 1090168650;
                     var15 = var383;
                     var383 = (var15 | var16) - (var15 & var16);
                     var383 = (int)3510298461200466245L;
                     var16 = 934310937;
                     var15 = var383;
                     var383 = (var15 | var16) - (var15 & var16);
                     var16 = 348403024;
                     var15 = var383;
                     var383 = var15 & ~var16 | ~var15 & var16;
                     String var394 = "cff";
                     var383 = (int)-752847682065837663L;
                     var16 = 947698687;
                     var15 = var383;
                     var383 = var15 + var16 - 2 * (var15 & var16);
                     var16 = -1773972787;
                     var15 = var383;
                     var383 = (var15 | var16) & ~(var15 & var16);
                     var16 = 1619469943;
                     var15 = 2121725237;
                     int var437 = var15 & ~var16 | ~var15 & var16;
                     var16 = 519164755;
                     var15 = var437;
                     var437 = (var15 | var16) - (var15 & var16);
                     var16 = 249909674;
                     var15 = 1340948745;
                     var437 = (var15 | var16) - (var15 & var16);
                     var16 = 1091047592;
                     var15 = var437;
                     var437 = (var15 | var16) & (~var15 | ~var16);
                     var16 = 952754330;
                     var15 = 290861097;
                     var437 = var15 & ~var16 | ~var15 & var16;
                     var16 = 698339511;
                     var15 = var437;
                     var437 = (var15 | var16) - (var15 & var16);
                     int var411 = (int)7284692657473602333L;
                     var16 = 1208519607;
                     var15 = var411;
                     var411 = var15 & ~var16 | ~var15 & var16;
                     var16 = -2093792712;
                     var15 = var411;
                     var411 = (var15 | var16) & ~(var15 & var16);
                     var437 = (int)-6569818630052951084L;
                     var16 = 1088957796;
                     var15 = var437;
                     var437 = var15 & ~var16 | ~var15 & var16;
                     var16 = -151827554;
                     var15 = var437;
                     var437 = (var15 | var16) & (~var15 | ~var16);
                     var437 = (int)7400985169103905437L;
                     var16 = 160080183;
                     var15 = var437;
                     var437 = var15 + var16 - 2 * (var15 & var16);
                     var16 = -1741634020;
                     var15 = var437;
                     var437 = (var15 | var16) & ~(var15 & var16);
                     var16 = 223228231;
                     var15 = 1012493450;
                     int var465 = var15 & ~var16 | ~var15 & var16;
                     var16 = -360277258;
                     var15 = var465;
                     var465 = (var15 & ~var16 | ~var15 & var16) * (var15 & ~var16 | ~var15 & var16);
                     var16 = -738797713;
                     var15 = 1655059082;
                     var465 = (var15 | var16) & (~var15 | ~var16);
                     var16 = -1317774257;
                     var15 = var465;
                     if (var11.equals(
                        c("ꓘꖿꓷꗇꒄꗏ", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ", var383, var411, var437, var15 & ~var16 | ~var15 & var16)
                     )) {
                        var16 = 1681978022;
                        var15 = 112935714;
                        int var324 = (var15 | var16) & (~var15 | ~var16);
                        var16 = 1660662151;
                        var15 = var324;
                        var12 = var15 & ~var16 | ~var15 & var16;
                     }
                     break;
                  case 1539932654:
                     var16 = 1048411146;
                     var15 = -1079161667;
                     int var336 = var15 + var16 - 2 * (var15 & var16);
                     var16 = 458736630;
                     var15 = var336;
                     int var337 = (var15 + var16 - 2 * (var15 & var16)) * (var15 + var16 - 2 * (var15 & var16));
                     var10002 = (int)-4794003236356496825L;
                     var16 = 1825282221;
                     var15 = var10002;
                     var10002 = (var15 | var16) & ~(var15 & var16);
                     var16 = -884609244;
                     var15 = var10002;
                     var10002 = (var15 | var16) - (var15 & var16);
                     var16 = -338905108;
                     var15 = -415442683;
                     int var10003 = (var15 | var16) - (var15 & var16);
                     var16 = -1403995573;
                     var15 = var10003;
                     var16 = var15 & ~var16 | ~var15 & var16;
                     var15 = var10002;
                     var10002 = (var15 | var16) + (var15 & var16);
                     var16 = 341983914;
                     var15 = -452705822;
                     var10003 = (var15 | var16) - (var15 & var16);
                     var16 = -2024944454;
                     var15 = var10003;
                     var10003 = (var15 | var16) & ~(var15 & var16);
                     var16 = 1738474746;
                     var15 = -141417895;
                     var10003 = (var15 | var16) & ~(var15 & var16);
                     var16 = -1571840464;
                     var15 = var10003;
                     var10003 = var15 + var16 - 2 * (var15 & var16);
                     int var404 = (int)-1050808531951901938L;
                     var16 = 1206952772;
                     var15 = var404;
                     var404 = (var15 | var16) & (~var15 | ~var16);
                     var16 = 303950107;
                     var15 = var404;
                     var404 = (var15 | var16) - (var15 & var16);
                     int var10005 = (int)-773053363210458190L;
                     var16 = 1941464540;
                     var15 = var10005;
                     var10005 = (var15 | var16) - (var15 & var16);
                     var16 = 454683366;
                     var15 = var10005;
                     var16 = (var15 | var16) - (var15 & var16);
                     var15 = var404;
                     var404 = (var15 | var16) + (var15 & var16);
                     var404 = (int)-7326318642738182911L;
                     var16 = 1742570834;
                     var15 = var404;
                     var404 = (var15 | var16) & ~(var15 & var16);
                     var16 = 572992188;
                     var15 = var404;
                     var404 = var15 + var16 - 2 * (var15 & var16);
                     int var10006 = (int)-227819038069116383L;
                     var16 = 1148379028;
                     var15 = var10006;
                     var10006 = var15 & ~var16 | ~var15 & var16;
                     var16 = -22843982;
                     var15 = var10006;
                     var10006 = (var15 | var16) - (var15 & var16);
                     var10006 = (int)496458929931801415L;
                     var16 = -323984626;
                     var15 = var10006;
                     var10006 = var15 + var16 - 2 * (var15 & var16);
                     var16 = -661147579;
                     var15 = var10006;
                     var10006 = (var15 | var16) & (~var15 | ~var16);
                     var10005 = (int)6261852655990031603L;
                     var16 = 1598893945;
                     var15 = var10005;
                     var10005 = var15 + var16 - 2 * (var15 & var16);
                     var16 = 65770308;
                     var15 = var10005;
                     var10005 = var15 & ~var16 | ~var15 & var16;
                     String var462 = "cfc";
                     var10006 = (int)4123898401441494575L;
                     var16 = -1878509934;
                     var15 = var10006;
                     var10006 = var15 + var16 - 2 * (var15 & var16);
                     var16 = -1148511558;
                     var15 = var10006;
                     if (var11.equals(
                        c("ꓙ蘒꓾虥ꒆ虢ꓼ虪", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ", var10003, var404, var10005, var15 & ~var16 | ~var15 & var16)
                     )) {
                        var16 = 1549912530;
                        var15 = -1448209895;
                        int var323 = (var15 | var16) & (~var15 | ~var16);
                        var16 = -170927157;
                        var15 = var323;
                        var12 = var15 + var16 - 2 * (var15 & var16);
                     }
               }

               switch (var12) {
                  case 0:
                     this.b(var1, var9, (float)var10.j());
                     break;
                  case 1:
                     this.c(var1, var9, (float)var10.j());
                     break;
                  case 2:
                     this.a(var1, var9, (float)var10.j());
                     break;
                  case 3:
                     this.d(var1, var9, (float)var10.j());
               }
            }
         } else {
            var18.add(var9);
         }
      }

      for (LivingEntity var20 : var18) {
         this.M.remove(var20);
         this.Q.remove(var20);
         this.R.remove(var20);
      }
   }

   private void a(LivingEntity var1, float var2) {
      float var3 = this.c(var1);
      double var4 = this.Q.getOrDefault(var1, 0.0);
      double var10001 = var2 * var3;
      String var10002 = "cfg";
      var4 += var10001 * 50.0;
      int var9 = -992125087;
      int var8 = 1772139844;
      int var10003 = var8 & ~var9 | ~var8 & var9;
      var9 = 1507784645;
      var8 = var10003;
      var10003 = ((var8 | var9) - (var8 & var9)) * ((var8 | var9) - (var8 & var9));
      this.Q.put(var1, var4 % 360.0);
      double var6 = this.R.getOrDefault(var1, 0.0);
      var10001 = var2 * var3;
      var9 = 2033379502;
      var8 = -967593969;
      int var19 = (var8 | var9) & ~(var8 & var9);
      var9 = -722844170;
      var8 = var19;
      int var20 = var8 + var9 - 2 * (var8 & var9);
      var6 += var10001 * 2.5;
      this.R.put(var1, var6);
   }

   private boolean a(LivingEntity var1) {
      if (var1 == null) {
         int var35 = (int)-580611687385448838L;
         int var24 = -716090788;
         int var13 = var35;
         var35 = var13 & ~var24 | ~var13 & var24;
         var24 = -912102362;
         var13 = var35;
         return pulse.Bool.from(var13 & (var24 ^ -1) | (var13 ^ -1) & var24);
      }

      if (!this.matchesTargetType(var1)) {
         return false;
      }

      if (var1.isAlive()) {
         if (var1.getWorld() == c.world) {
            if (!(var1.getWidth() <= 0.0F) && !(var1.getHeight() <= 0.0F)) {
               double var30 = var1.squaredDistanceTo(c.player);
               String var10001 = "cfh";
               if (!(var30 > 10000.0)) {
                  int var33 = (int)4301760356917883198L;
                  int var22 = -443727160;
                  int var11 = var33;
                  int var34 = (var11 | var22) & ~(var11 & var22);
                  var22 = 1535112183;
                  var11 = var34;
                  return pulse.Bool.from((var11 | var22) - (var11 & var22));
               } else {
                  int var31 = (int)-1047475452551024125L;
                  int var20 = -1035228295;
                  int var9 = var31;
                  int var32 = (var9 | var20) - (var9 & var20);
                  var20 = -376792710;
                  var9 = var32;
                  return pulse.Bool.from((var9 | var20) & (var9 ^ -1 | var20 ^ -1));
               }
            } else {
               int var18 = 16868112;
               int var7 = 940007561;
               int var29 = var7 + var18 - 2 * (var7 & var18);
               var18 = 956695449;
               var7 = var29;
               return pulse.Bool.from((var7 | var18) - (var7 & var18));
            }
         } else {
            int var27 = (int)-8556791200444976780L;
            int var16 = -1948524627;
            int var5 = var27;
            var27 = var5 + var16 - 2 * (var5 & var16);
            var16 = -1148047655;
            var5 = var27;
            return pulse.Bool.from(var5 & (var16 ^ -1) | (var5 ^ -1) & var16);
         }
      } else {
         int var10000 = (int)-5644608670159962722L;
         int var3 = 1209778252;
         int var2 = var10000;
         var10000 = var2 & ~var3 | ~var2 & var3;
         var3 = 1864220114;
         var2 = var10000;
         return pulse.Bool.from((var2 | var3) - (var2 & var3));
      }
   }

   private LivingEntity p() {
      if (c.player == null || c.world == null) {
         return null;
      }

      LivingEntity var1 = HudServiceRegistry.TARGETS.h();
      if (this.a(var1)) {
         return var1;
      }

      if (c.targetedEntity instanceof LivingEntity var2 && this.a(var2)) {
         return var2;
      }

      LivingEntity var3 = null;
      double var4 = 4096.0;
      for (LivingEntity var7 : c.world.getEntitiesByClass(LivingEntity.class, c.player.getBoundingBox().expand(64.0), var0 -> this.a(var0))) {
         double var8 = var7.squaredDistanceTo(c.player);
         if (var8 < var4) {
            var4 = var8;
            var3 = var7;
         }
      }

      return var3;
   }

   private boolean matchesTargetType(LivingEntity entity) {
      if (entity == null || entity == c.player) {
         return false;
      }

      return entity instanceof PlayerEntity ? this.targetPlayers.a() : this.targetMobs.a();
   }

   private void a(WorldRenderEvent var1, LivingEntity var2, float var3) {
      if (!(var3 <= 0.0F) && var2 != null && this.a(var2)) {
         Vec3d var4 = EntityUtils.b(var2, var1.b());
         if (var4 == null) {
            var4 = var2.getPos();
         }

         if (var4 != null) {
            double var5 = this.Q.getOrDefault(var2, 0.0);
            double var7 = this.R.getOrDefault(var2, 0.0);
            float var9 = this.n.a();
            int var10000 = (int)-1030815229471821869L;
            int var19 = -2017478865;
            int var18 = var10000;
            var10000 = (var18 | var19) & (~var18 | ~var19);
            var19 = -1268663464;
            var18 = var10000;
            var10000 = (var18 | var19) & ~(var18 & var19);
            int var10001 = (int)8358810420796511867L;
            var19 = 509736404;
            var18 = var10001;
            var10001 = (var18 | var19) & ~(var18 & var19);
            var19 = -708244792;
            var18 = var10001;
            var19 = var18 & ~var19 | ~var18 & var19;
            var18 = var10000;
            var10000 = (var18 | var19) + (var18 & var19);
            double var10 = 0.05 * Math.sin(var7);
            float var12 = (float)(var9 * (1.0 + var10)) * var3;
            Vec3d var13 = new Vec3d(var4.x, var4.y + var2.getHeight() / 2.0F, var4.z);
            Color var14 = this.b(var2);
            int var15 = ColorUtils.a(var14.getRGB());
            var10000 = (int)7039346081076530127L;
            var19 = -1484090811;
            var18 = var10000;
            var10000 = var18 & ~var19 | ~var18 & var19;
            var19 = 1376803211;
            var18 = var10000;
            var10000 = (var18 | var19) & (~var18 | ~var19);
            var19 = 883303695;
            var18 = 2009763603;
            int var10002 = var18 & ~var19 | ~var18 & var19;
            var19 = -675211247;
            var18 = var10002;
            var10002 = var18 & ~var19 | ~var18 & var19;
            int var10003 = (int)4256427751199963631L;
            var19 = -249053911;
            var18 = var10003;
            var10003 = var18 + var19 - 2 * (var18 & var19);
            var19 = -1091377860;
            var18 = var10003;
            var19 = (var18 | var19) & ~(var18 & var19);
            var18 = var10002;
            var10002 = (var18 ^ var19) + 2 * (var18 & var19);
            int var16 = Math.max(var10000, (int)(var3 * 255.0F));
            int var17 = ColorUtils.a(var15, var16);
            MatrixStack var52 = var1.a();
            float var10005 = (float)var5;
            int var10006 = (int)-2053829186468981163L;
            var19 = -983431518;
            var18 = var10006;
            var10006 = var18 + var19 - 2 * (var18 & var19);
            var19 = 1246613750;
            var18 = var10006;
            WorldRenderUtils.a(var52, var13, var12, var17, this.N, var10005, pulse.Bool.from((var18 | var19) - (var18 & var19)));
         }
      }
   }

   private void b(WorldRenderEvent var1, LivingEntity var2, float var3) {
      if (this.a(var2) && !(var3 <= 0.0F)) {
         int var10000 = (int)-2529551579988897606L;
         int var61 = 245796481;
         int var60 = var10000;
         var10000 = var60 + var61 - 2 * (var60 & var61);
         var61 = -1941325482;
         var60 = var10000;
         var10000 = ((var60 | var61) & ~(var60 & var61)) * ((var60 | var61) & ~(var60 & var61));
         var61 = -2117151552;
         var60 = -1312719264;
         var10000 = (var60 | var61) - (var60 & var61);
         var61 = 797962575;
         var60 = var10000;
         int var59 = (var60 | var61) & (~var60 | ~var61);
         var10000 = (int)-7703633301080033937L;
         var61 = -622480406;
         var60 = var10000;
         var10000 = (var60 | var61) & (~var60 | ~var61);
         var61 = 1128068845;
         var60 = var10000;
         var10000 = var60 & ~var61 | ~var60 & var61;
         var10000 = (int)-2416294203809160609L;
         var61 = 999554154;
         var60 = var10000;
         var10000 = (var60 | var61) & ~(var60 & var61);
         var61 = 1882636981;
         var60 = var10000;
         if (((var60 | var61) & (~var60 | ~var61)) >= var59) {
            var61 = 331914874;
            var60 = -1075004634;
            int var10001 = (var60 | var61) & (~var60 | ~var61);
            var61 = -1406917287;
            var60 = var10001;
            var10001 = (var60 | var61) & (~var60 | ~var61);
            var61 = -1189310613;
            var60 = -1683282122;
            var10001 = var60 + var61 - 2 * (var60 & var61);
            var61 = 582461535;
            var60 = var10001;
            var10001 = (var60 | var61) - (var60 & var61);
            var61 = 405194600;
            var60 = 470300995;
            var10000 = var60 & ~var61 | ~var60 & var61;
            var61 = 2111373754;
            var60 = var10000;
            var59 = var60 + var61 - 2 * (var60 & var61);
            a = var59;
         }

         Vec3d var4 = EntityUtils.b(var2, var1.b());
         if (var4 == null) {
            var4 = var2.getPos();
         }

         if (var4 != null) {
            var61 = -240821319;
            var60 = -2003935763;
            var10000 = var60 + var61 - 2 * (var60 & var61);
            var61 = 2032862811;
            var60 = var10000;
            int var5 = (var60 | var61) & ~(var60 & var61);
            var10000 = (int)3033347145623464405L;
            var61 = -629165336;
            var60 = var10000;
            var10000 = (var60 | var61) & (~var60 | ~var61);
            var61 = -112816763;
            var60 = var10000;
            var10000 = (var60 | var61) & ~(var60 & var61);
            int var297 = (int)-8273251372249621988L;
            var61 = -586198875;
            var60 = var297;
            var297 = var60 + var61 - 2 * (var60 & var61);
            var61 = -247999797;
            var60 = var297;
            var61 = (var60 | var61) - (var60 & var61);
            var60 = var10000;
            var10000 = 2 * (var60 | var61) - (var60 ^ var61);
            double var6 = 50.0;
            var61 = -385834625;
            var60 = -1990609536;
            var10000 = (var60 | var61) - (var60 & var61);
            var61 = 538938608;
            var60 = var10000;
            var10000 = ((var60 | var61) & (~var60 | ~var61)) * ((var60 | var61) & (~var60 | ~var61));
            double var8 = Math.toRadians(50.0);
            var61 = 1659164082;
            var60 = -203788611;
            var297 = (var60 | var61) & ~(var60 & var61);
            var61 = -335535538;
            var60 = var297;
            var297 = (var60 | var61) & ~(var60 & var61);
            double var10 = var8 / 15.0;
            int var12 = this.i.b();
            double var13 = this.R.getOrDefault(var2, 0.0);
            float var281 = var2.getWidth();
            var61 = 1369558916;
            var60 = -1969475001;
            var297 = var60 + var61 - 2 * (var60 & var61);
            var61 = 1807223087;
            var60 = var297;
            var297 = var60 + var61 - 2 * (var60 & var61);
            float var15 = Math.max(var281, 0.5F);
            float var282 = var2.getHeight();
            String var303 = "cfi";
            float var16 = Math.max(var282, 0.5F);
            double var283 = var15;
            int var10002 = (int)1105337353906685958L;
            var61 = 1556883230;
            var60 = var10002;
            var10002 = var60 & ~var61 | ~var60 & var61;
            var61 = -866636010;
            var60 = var10002;
            var10002 = (var60 | var61) - (var60 & var61);
            var10002 = (int)8997066907468271669L;
            var61 = 1288181899;
            var60 = var10002;
            var10002 = (var60 | var61) - (var60 & var61);
            var61 = 1557760172;
            var60 = var10002;
            var10002 = (var60 | var61) - (var60 & var61);
            var61 = -1473849624;
            var60 = -484061431;
            var10002 = (var60 | var61) & (~var60 | ~var61);
            var61 = 1258494448;
            var60 = var10002;
            var10002 = (var60 | var61) - (var60 & var61);
            var10002 = (int)-4282520890160685442L;
            var61 = 1320156193;
            var60 = var10002;
            var10002 = (var60 | var61) - (var60 & var61);
            var61 = -530079147;
            var60 = var10002;
            var10002 = (var60 | var61) - (var60 & var61);
            double var17 = var283 + 0.3;
            double var19 = var4.y + var16 / 2.0F;
            double var21 = var3;
            var10000 = (int)-1310522694017500408L;
            var61 = 741968440;
            var60 = var10000;
            var10000 = var60 & ~var61 | ~var60 & var61;
            var61 = -1933168330;
            var60 = var10000;
            Vec3d[] var286 = new Vec3d[(var60 | var61) & (~var60 | ~var61)];
            var61 = -333904771;
            var60 = -1891151843;
            var10002 = var60 & ~var61 | ~var60 & var61;
            var61 = 1667126368;
            var60 = var10002;
            var286[var60 & ~var61 | ~var60 & var61] = new Vec3d(1.0, 1.0, 1.0);
            var10002 = (int)6806697352692633614L;
            var61 = -1313739179;
            var60 = var10002;
            var10002 = (var60 | var61) - (var60 & var61);
            var61 = 2036858458;
            var60 = var10002;
            var10002 = (var60 | var61) - (var60 & var61);
            var61 = 1529713194;
            var60 = -546616547;
            int var10005 = (var60 | var61) - (var60 & var61);
            var61 = -1843473215;
            var60 = var10005;
            var10005 = (var60 | var61) & (~var60 | ~var61);
            var61 = 1079700780;
            var60 = 1467025410;
            int var10006 = (var60 | var61) & (~var60 | ~var61);
            var61 = -200433840;
            var60 = var10006;
            var61 = (var60 | var61) & (~var60 | ~var61);
            var60 = var10005;
            var10005 = var60 - ~var61 - 1;
            String var10007 = "cfj";
            var286[var10002] = new Vec3d(-1.0, 1.0, -1.0);
            var10002 = (int)1026742839515610467L;
            var61 = -1719285949;
            var60 = var10002;
            var10002 = (var60 | var61) & (~var60 | ~var61);
            var61 = -1467663838;
            var60 = var10002;
            var10002 = (var60 | var61) - (var60 & var61);
            var10006 = (int)5044423387744450409L;
            var61 = 704194141;
            var60 = var10006;
            var10006 = (var60 | var61) & ~(var60 & var61);
            var61 = -1437386082;
            var60 = var10006;
            var10006 = var60 & ~var61 | ~var60 & var61;
            var286[var10002] = new Vec3d(1.0, -1.0, 1.0);
            var61 = -1339118980;
            var60 = -310323694;
            var10002 = (var60 | var61) & (~var60 | ~var61);
            var61 = 1571716205;
            var60 = var10002;
            var10002 = var60 & ~var61 | ~var60 & var61;
            var61 = 780985105;
            var60 = 1428178923;
            var10005 = (var60 | var61) - (var60 & var61);
            var61 = -1567643402;
            var60 = var10005;
            var10005 = (var60 | var61) & ~(var60 & var61);
            var61 = 1396653419;
            var60 = 1937824580;
            var10006 = (var60 | var61) & ~(var60 & var61);
            var61 = 1640352417;
            var60 = var10006;
            var61 = var60 & ~var61 | ~var60 & var61;
            var60 = var10005;
            var10005 = (var60 & ~var61) + (var61 & ~var60) + 2 * (var60 & var61);
            var10006 = (int)-2363360710397376088L;
            var61 = 343083627;
            var60 = var10006;
            var10006 = (var60 | var61) - (var60 & var61);
            var61 = -97311543;
            var60 = var10006;
            var10006 = (var60 | var61) & ~(var60 & var61);
            int var359 = (int)9117669030942922439L;
            var61 = 1851572566;
            var60 = var359;
            int var360 = (var60 | var61) & (~var60 | ~var61);
            var61 = 1747019346;
            var60 = var360;
            var61 = var60 & ~var61 | ~var60 & var61;
            var60 = var10006;
            var10006 = (var60 & ~var61) + (var61 & ~var60) + 2 * (var60 & var61);
            var286[var10002] = new Vec3d(-1.0, -1.0, 1.0);
            var10002 = (int)6379525192291411054L;
            var61 = 862370957;
            var60 = var10002;
            var10002 = var60 & ~var61 | ~var60 & var61;
            var61 = -1991649049;
            var60 = var10002;
            var10002 = (var60 | var61) - (var60 & var61);
            int var361 = (int)-7823990064101049226L;
            var61 = 1606374160;
            var60 = var361;
            int var362 = var60 + var61 - 2 * (var60 & var61);
            var61 = 1132224063;
            var60 = var362;
            int var363 = (var60 | var61) & ~(var60 & var61);
            var286[var10002] = new Vec3d(1.0, 1.0, -1.0);
            var10002 = (int)5956028356447484398L;
            var61 = -2011208030;
            var60 = var10002;
            var10002 = var60 & ~var61 | ~var60 & var61;
            var61 = 1378606921;
            var60 = var10002;
            var10002 = var60 + var61 - 2 * (var60 & var61);
            var10005 = (int)4439034983248164633L;
            var61 = 1818840107;
            var60 = var10005;
            var10005 = (var60 | var61) - (var60 & var61);
            var61 = 268484787;
            var60 = var10005;
            var10005 = var60 & ~var61 | ~var60 & var61;
            int var364 = (int)-3545925783699449698L;
            var61 = -500040803;
            var60 = var364;
            int var365 = (var60 | var61) - (var60 & var61);
            var61 = -1937513721;
            var60 = var365;
            int var366 = (var60 | var61) & (~var60 | ~var61);
            var61 = -1983156724;
            var60 = 2114105861;
            int var367 = (var60 | var61) - (var60 & var61);
            var61 = -137765880;
            var60 = var367;
            int var368 = (var60 | var61) & (~var60 | ~var61);
            int var369 = (int)-1962691507268822832L;
            var61 = 1859694411;
            var60 = var369;
            int var370 = (var60 | var61) & ~(var60 & var61);
            var61 = 2135455625;
            var60 = var370;
            int var371 = (var60 | var61) & ~(var60 & var61);
            int var372 = (int)-7476446097092258909L;
            var61 = -684374619;
            var60 = var372;
            int var373 = (var60 | var61) & (~var60 | ~var61);
            var61 = 792761866;
            var60 = var373;
            int var374 = var60 + var61 - 2 * (var60 & var61);
            int var10008 = (int)6509216082319367680L;
            var61 = -318152960;
            var60 = var10008;
            var10008 = var60 & ~var61 | ~var60 & var61;
            var61 = -840007421;
            var60 = var10008;
            var10008 = (var60 | var61) - (var60 & var61);
            var10008 = (int)8238570472606505356L;
            var61 = -1253690114;
            var60 = var10008;
            var10008 = var60 + var61 - 2 * (var60 & var61);
            var61 = 1509797234;
            var60 = var10008;
            var10008 = var60 + var61 - 2 * (var60 & var61);
            var61 = -1442624314;
            var60 = 1371764940;
            var10008 = (var60 | var61) & ~(var60 & var61);
            var61 = -71289852;
            var60 = var10008;
            var10008 = var60 + var61 - 2 * (var60 & var61);
            var61 = -1057555329;
            var60 = 2075728239;
            var10008 = var60 + var61 - 2 * (var60 & var61);
            var61 = -1152391907;
            var60 = var10008;
            var10008 = var60 & ~var61 | ~var60 & var61;
            var286[var10002] = new Vec3d(-1.0, -1.0, -1.0);
            Vec3d[] var23 = var286;
            var61 = 726668791;
            var60 = -1154412971;
            var10000 = (var60 | var61) & ~(var60 & var61);
            var61 = -1872684126;
            var60 = var10000;

            for (int var24 = (var60 | var61) - (var60 & var61); var24 < var12; var24++) {
               double var304 = var24;
               var10002 = (int)1096976480963383892L;
               var61 = -252915012;
               var60 = var10002;
               var10002 = var60 & ~var61 | ~var60 & var61;
               var61 = 2033668024;
               var60 = var10002;
               var10002 = (var60 | var61) & (~var60 | ~var61);
               double var305 = var304 * Math.PI;
               var10002 = (int)-8881359501560131973L;
               var61 = -982090257;
               var60 = var10002;
               var10002 = (var60 | var61) - (var60 & var61);
               var61 = 618131973;
               var60 = var10002;
               var10002 = ((var60 | var61) - (var60 & var61)) * ((var60 | var61) - (var60 & var61));
               double var25 = var13 + var305 / 2.0;
               Vec3d var27 = var23[var24];
               double var28 = Math.sqrt(var27.x * var27.x + var27.y * var27.y + var27.z * var27.z);
               var27 = new Vec3d(var27.x / var28, var27.y / var28, var27.z / var28);
               Vec3d var30 = new Vec3d(0.0, 1.0, 0.0);
               double var31 = var27.x * var30.x + var27.y * var30.y + var27.z * var30.z;
               double var288 = Math.abs(var31);
               String var306 = "cfk";
               if (var288 > 0.99) {
                  var30 = new Vec3d(1.0, 0.0, 0.0);
               }

               Vec3d var33 = new Vec3d(
                  var27.y * var30.z - var27.z * var30.y,
                  var27.z * var30.x - var27.x * var30.z,
                  var27.x * var30.y - var27.y * var30.x
               );
               double var34 = Math.sqrt(var33.x * var33.x + var33.y * var33.y + var33.z * var33.z);
               var33 = new Vec3d(var33.x / var34, var33.y / var34, var33.z / var34);
               Vec3d var36 = new Vec3d(
                  var27.y * var33.z - var27.z * var33.y,
                  var27.z * var33.x - var27.x * var33.z,
                  var27.x * var33.y - var27.y * var33.x
               );
               double var37 = Math.sqrt(var36.x * var36.x + var36.y * var36.y + var36.z * var36.z);
               var36 = new Vec3d(var36.x / var37, var36.y / var37, var36.z / var37);
               var61 = 1651843774;
               var60 = -440403697;
               var10000 = var60 + var61 - 2 * (var60 & var61);
               var61 = -2016748623;
               var60 = var10000;
               int var39 = (var60 | var61) - (var60 & var61);

               while (true) {
                  var61 = 173466600;
                  var60 = -258041571;
                  var297 = var60 & ~var61 | ~var60 & var61;
                  var61 = -87524614;
                  var60 = var297;
                  if (var39 >= ((var60 | var61) & ~(var60 & var61))) {
                     break;
                  }

                  double var40 = var39 * var10 + var25;
                  double var42 = Math.cos(var40);
                  double var44 = Math.sin(var40);
                  Vec3d var46 = new Vec3d(
                     (var33.x * var42 + var36.x * var44) * var17,
                     (var33.y * var42 + var36.y * var44) * var17,
                     (var33.z * var42 + var36.z * var44) * var17
                  );
                  double var47 = var4.x + var46.x;
                  double var49 = var19 + var46.y;
                  double var51 = var4.z + var46.z;
                  int var53 = ColorUtils.a(this.b(var2).getRGB());
                  var10000 = (int)1374190747257770419L;
                  var61 = 1236532376;
                  var60 = var10000;
                  var10000 = (var60 | var61) - (var60 & var61);
                  var61 = 1717464362;
                  var60 = var10000;
                  var10000 = (var60 | var61) & (~var60 | ~var61);
                  var10002 = (int)-4548886795071872213L;
                  var61 = -50407942;
                  var60 = var10002;
                  var10002 = var60 & ~var61 | ~var60 & var61;
                  var61 = 1319957768;
                  var60 = var10002;
                  var10002 = (var60 + var61 - 2 * (var60 & var61)) * (var60 + var61 - 2 * (var60 & var61));
                  int var54 = Math.max(var10000, (int)(var21 * 150.0));
                  int var55 = ColorUtils.a(var53, var54);
                  float var293 = this.h.a();
                  float var342 = var39;
                  String var10003 = "cfl";
                  float var56 = var293 * (1.0F + var342 / 15.0F);

                  try {
                     WorldRenderUtils.a(var1.a(), new Vec3d(var47, var49, var51), var56, var55);
                  } catch (Exception var62) {
                  }

                  var39++;
               }
            }
         }
      }
   }

   private void c(WorldRenderEvent var1, LivingEntity var2, float var3) {
      if (!(var3 <= 0.0F) && var2 != null && this.a(var2)) {
         float var10000 = var2.getWidth();
         int var37 = -875097744;
         int var36 = -536186619;
         int var10002 = var36 + var37 - 2 * (var36 & var37);
         var37 = 735928442;
         var36 = var10002;
         var10002 = var36 + var37 - 2 * (var36 & var37);
         var10002 = (int)3569539058689284716L;
         var37 = -1653687885;
         var36 = var10002;
         var10002 = (var36 | var37) & (~var36 | ~var37);
         var37 = 140518365;
         var36 = var10002;
         var10002 = var36 & ~var37 | ~var36 & var37;
         var10002 = (int)-2609684609482579528L;
         var37 = 2041194962;
         var36 = var10002;
         var10002 = (var36 | var37) & (~var36 | ~var37);
         var37 = -631863189;
         var36 = var10002;
         var10002 = (var36 | var37) & (~var36 | ~var37);
         var37 = 483111750;
         var36 = 1515653426;
         var10002 = (var36 | var37) & ~(var36 & var37);
         var37 = 1184676479;
         var36 = var10002;
         var10002 = (var36 | var37) & (~var36 | ~var37);
         var37 = -416696839;
         var36 = -1427125435;
         var10002 = var36 + var37 - 2 * (var36 & var37);
         var37 = 1304854206;
         var36 = var10002;
         var10002 = var36 & ~var37 | ~var36 & var37;
         float var4 = var10000 * 0.7F;
         Vec3d var5 = EntityUtils.b(var2, var1.b());
         if (var5 == null) {
            var5 = var2.getPos();
         }

         double var6 = this.R.getOrDefault(var2, 0.0);
         int var10001 = (int)-5844866865836422273L;
         var37 = 779799158;
         var36 = var10001;
         var10001 = (var36 | var37) - (var36 & var37);
         var37 = -1608236795;
         var36 = var10001;
         var10001 = var36 + var37 - 2 * (var36 & var37);
         var10001 = (int)-5149772655558103952L;
         var37 = -876964510;
         var36 = var10001;
         var10001 = var36 & ~var37 | ~var36 & var37;
         var37 = 617281820;
         var36 = var10001;
         var10001 = (var36 | var37) & ~(var36 & var37);
         var10001 = (int)-2509056024434911239L;
         var37 = 1622371827;
         var36 = var10001;
         var10001 = var36 + var37 - 2 * (var36 & var37);
         var37 = -1095517694;
         var36 = var10001;
         var10001 = (var36 | var37) & (~var36 | ~var37);
         var37 = -362395388;
         var36 = -1902053282;
         var10001 = var36 & ~var37 | ~var36 & var37;
         var37 = 1690743112;
         var36 = var10001;
         var10001 = (var36 | var37) & ~(var36 & var37);
         double var8 = Math.PI * 2;
         double var10 = var6 % var8;
         var10001 = (int)8973448538424271811L;
         var37 = -1433066857;
         var36 = var10001;
         var10001 = (var36 | var37) & (~var36 | ~var37);
         var37 = -880990562;
         var36 = var10001;
         var10001 = var36 & ~var37 | ~var36 & var37;
         double var12 = var8 / 2.0;
         int var244;
         if (!(var10 > var12)) {
            int var242 = (int)7215223355006472325L;
            var37 = -110193673;
            var36 = var242;
            int var243 = var36 + var37 - 2 * (var36 & var37);
            var37 = 590201714;
            var36 = var243;
            var244 = var36 & ~var37 | ~var36 & var37;
         } else {
            int var245 = (int)6054754456425899785L;
            var37 = -516130756;
            var36 = var245;
            int var246 = (var36 | var37) & (~var36 | ~var37);
            var37 = -1605968076;
            var36 = var246;
            var244 = var36 + var37 - 2 * (var36 & var37);
         }

         int var14 = var244;
         double var15 = var10 / var12;
         var15 = var14 == 0 ? 1.0 - var15 : var15 - 1.0;
         var10001 = (int)-5400932049257699899L;
         var37 = 1834249529;
         var36 = var10001;
         var10001 = var36 & ~var37 | ~var36 & var37;
         var37 = -1803802162;
         var36 = var10001;
         var10001 = (var36 + var37 - 2 * (var36 & var37)) * (var36 + var37 - 2 * (var36 & var37));
         double var247;
         if (!(var15 < 0.5)) {
            var10001 = (int)-7901343570511288337L;
            var37 = 1119250979;
            var36 = var10001;
            var10001 = (var36 | var37) - (var36 & var37);
            var37 = 873551187;
            var36 = var10001;
            var10001 = var36 + var37 - 2 * (var36 & var37);
            var37 = -1916419838;
            var36 = -778141108;
            var10002 = (var36 | var37) - (var36 & var37);
            var37 = 1528837093;
            var36 = var10002;
            var37 = var36 + var37 - 2 * (var36 & var37);
            var36 = var10001;
            var10001 = var36 - ~var37 - 1;
            double var293 = -2.0 * var15;
            var10002 = (int)6008097746304657168L;
            var37 = -809170794;
            var36 = var10002;
            var10002 = (var36 | var37) & ~(var36 & var37);
            var37 = 1564575477;
            var36 = var10002;
            var10002 = (var36 | var37) - (var36 & var37);
            double var294 = var293 + 2.0;
            var37 = -1722370057;
            var36 = 701946014;
            int var10003 = (var36 | var37) & (~var36 | ~var37);
            var37 = -1333760150;
            var36 = var10003;
            var10003 = (var36 | var37) & (~var36 | ~var37);
            var10003 = (int)-6846406594914777276L;
            var37 = 1167593629;
            var36 = var10003;
            var10003 = (var36 | var37) - (var36 & var37);
            var37 = -1884383280;
            var36 = var10003;
            var10003 = var36 + var37 - 2 * (var36 & var37);
            var37 = -1768803653;
            var36 = -138864200;
            var10003 = var36 + var37 - 2 * (var36 & var37);
            var37 = 1630219012;
            var36 = var10003;
            var10003 = (var36 | var37) & ~(var36 & var37);
            double var295 = Math.pow(var294, 2.0);
            var10002 = (int)4540374292112842407L;
            var37 = 759488883;
            var36 = var10002;
            var10002 = (var36 | var37) & ~(var36 & var37);
            var37 = 286040229;
            var36 = var10002;
            var10002 = (var36 | var37) - (var36 & var37);
            var247 = 1.0 - var295 / 2.0;
         } else {
            var10001 = (int)7338094482940628012L;
            var37 = -632605572;
            var36 = var10001;
            var10001 = var36 + var37 - 2 * (var36 & var37);
            var37 = 2107979862;
            var36 = var10001;
            var10001 = (var36 | var37) & ~(var36 & var37);
            var10001 = (int)2389283571848675827L;
            var37 = -900084203;
            var36 = var10001;
            var10001 = (var36 | var37) & (~var36 | ~var37);
            var37 = 770592756;
            var36 = var10001;
            var10001 = var36 & ~var37 | ~var36 & var37;
            var10001 = (int)-1973211719153334246L;
            var37 = -1566698903;
            var36 = var10001;
            var10001 = var36 & ~var37 | ~var36 & var37;
            var37 = -6006147;
            var36 = var10001;
            var10001 = (var36 | var37) - (var36 & var37);
            var247 = 2.0 * var15 * var15;
         }

         var15 = var247;
         double var248 = var2.getHeight() / 2.0F;
         var10002 = (int)319632773075246121L;
         var37 = 936096794;
         var36 = var10002;
         var10002 = var36 + var37 - 2 * (var36 & var37);
         var37 = 725577552;
         var36 = var10002;
         var10002 = (var36 | var37) - (var36 & var37);
         var37 = 711563628;
         var36 = 296588077;
         int var356 = var36 & ~var37 | ~var36 & var37;
         var37 = 1723689243;
         var36 = var356;
         var37 = var36 + var37 - 2 * (var36 & var37);
         var36 = var10002;
         var10002 = var36 - ~var37 - 1;
         double var249 = var248 * (!(var15 > 0.5) ? var15 : 1.0 - var15);
         if (var14 == 0) {
            var10001 = (int)4297074017740047166L;
            var37 = 1308102831;
            var36 = var10001;
            var10001 = var36 + var37 - 2 * (var36 & var37);
            var37 = 755815312;
            var36 = var10001;
            var10001 = (var36 | var37) & (~var36 | ~var37);
         } else {
            var10001 = (int)3725672525878752903L;
            var37 = -1929890097;
            var36 = var10001;
            var10001 = (var36 | var37) & ~(var36 & var37);
            var37 = 1298710455;
            var36 = var10001;
            var10001 = var36 + var37 - 2 * (var36 & var37);
         }

         double var17 = var249 * var10001;
         Tessellator var19 = Tessellator.getInstance();
         MatrixStack var20 = var1.a();
         Vec3d var21 = c.gameRenderer.getCamera().getPos();
         Color var22 = this.b(var2);
         Matrix4f var23 = var20.peek().getPositionMatrix();
         var20.push();
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.disableCull();
         int var250 = (int)630855680641333266L;
         var37 = 1445469486;
         var36 = var250;
         int var251 = var36 & ~var37 | ~var36 & var37;
         var37 = 2063721788;
         var36 = var251;
         RenderSystem.depthMask(pulse.Bool.from(var36 + var37 - 2 * (var36 & var37)));
         RenderSystem.setShader(ShaderProgramKeys.POSITION_COLOR);
         int var252 = (int)341221216869858779L;
         var37 = -1500787201;
         var36 = var252;
         int var253 = (var36 | var37) & (~var36 | ~var37);
         var37 = 735148804;
         var36 = var253;
         GL11.glEnable(var36 + var37 - 2 * (var36 & var37));
         var37 = -1014106280;
         var36 = 2068711696;
         int var254 = (var36 | var37) & ~(var36 & var37);
         var37 = -1195118054;
         var36 = var254;
         int var255 = var36 & ~var37 | ~var36 & var37;
         var37 = 1698476141;
         var36 = 695698983;
         var10001 = var36 & ~var37 | ~var36 & var37;
         var37 = 1279993672;
         var36 = var10001;
         GL11.glHint(var255, var36 + var37 - 2 * (var36 & var37));
         var10001 = (int)-599036318838977942L;
         var37 = -466160215;
         var36 = var10001;
         var10001 = (var36 | var37) - (var36 & var37);
         var37 = -1271038002;
         var36 = var10001;
         var10001 = (var36 | var37) - (var36 & var37);
         var10001 = (int)-4652237169214331188L;
         var37 = -1687939800;
         var36 = var10001;
         var10001 = var36 & ~var37 | ~var36 & var37;
         var37 = -310873109;
         var36 = var10001;
         var10001 = (var36 | var37) & ~(var36 & var37);
         var10001 = (int)-2407303233265982412L;
         var37 = 848585509;
         var36 = var10001;
         var10001 = (var36 | var37) - (var36 & var37);
         var37 = -2011412710;
         var36 = var10001;
         var10001 = var36 & ~var37 | ~var36 & var37;
         var37 = -252828175;
         var36 = -107970435;
         var10001 = (var36 | var37) - (var36 & var37);
         var37 = 159294863;
         var36 = var10001;
         var10001 = var36 + var37 - 2 * (var36 & var37);
         RenderSystem.lineWidth(3.0F);
         BufferBuilder var24 = var19.begin(DrawMode.TRIANGLE_STRIP, VertexFormats.POSITION_COLOR);
         int var256 = (int)-4266335446950433496L;
         var37 = -429608579;
         var36 = var256;
         int var257 = var36 & ~var37 | ~var36 & var37;
         var37 = 834149461;
         var36 = var257;
         int var25 = (var36 | var37) - (var36 & var37);

         while (true) {
            var10001 = (int)-6355532838460974197L;
            var37 = 1747746681;
            var36 = var10001;
            var10001 = (var36 | var37) & ~(var36 & var37);
            var37 = 488138138;
            var36 = var10001;
            if (var25 > (var36 & ~var37 | ~var36 & var37)) {
               BufferRenderer.drawWithGlobalProgram(var24.end());
               var24 = var19.begin(DrawMode.DEBUG_LINE_STRIP, VertexFormats.POSITION_COLOR);
               var37 = -1695306925;
               var36 = 1631496976;
               int var260 = (var36 | var37) & ~(var36 & var37);
               var37 = -70451133;
               var36 = var260;
               var25 = (var36 | var37) - (var36 & var37);

               while (true) {
                  var10001 = (int)8359081540597527560L;
                  var37 = -1481155429;
                  var36 = var10001;
                  var10001 = var36 + var37 - 2 * (var36 & var37);
                  var37 = -731878917;
                  var36 = var10001;
                  if (var25 > ((var36 | var37) & (~var36 | ~var37))) {
                     if (a != a) {
                        int var265 = (int)-8178118032398272908L;
                        var37 = 780224536;
                        var36 = var265;
                        int var266 = var36 & ~var37 | ~var36 & var37;
                        var37 = 1972253495;
                        var36 = var266;
                        int var267 = (var36 | var37) - (var36 & var37);
                        var37 = -1420006668;
                        var36 = 274710357;
                        var10001 = var36 & ~var37 | ~var36 & var37;
                        var37 = 138631526;
                        var36 = var10001;
                        var37 = var36 + var37 - 2 * (var36 & var37);
                        var36 = var267;
                        int var268 = (var36 & ~var37) + (var37 & ~var36) + 2 * (var36 & var37);
                        var37 = -1095075990;
                        var36 = 1991485213;
                        int var269 = var36 + var37 - 2 * (var36 & var37);
                        var37 = -1730786674;
                        var36 = var269;
                        int var35 = var36 + var37 - 2 * (var36 & var37);
                     }

                     BufferRenderer.drawWithGlobalProgram(var24.end());
                     RenderSystem.enableCull();
                     RenderSystem.disableBlend();
                     var37 = -183922358;
                     var36 = -524433984;
                     int var270 = var36 & ~var37 | ~var36 & var37;
                     var37 = 364139659;
                     var36 = var270;
                     RenderSystem.depthMask(pulse.Bool.from((var36 | var37) - (var36 & var37)));
                     int var271 = (int)-8617839931824638729L;
                     var37 = -731294996;
                     var36 = var271;
                     int var272 = (var36 | var37) - (var36 & var37);
                     var37 = 268643643;
                     var36 = var272;
                     GL11.glDisable((var36 | var37) - (var36 & var37));
                     var20.pop();
                     return;
                  }

                  double var42 = Math.cos(Math.toRadians(var25));
                  double var43 = Math.sin(Math.toRadians(var25));
                  int var44 = var22.getRed();
                  int var45 = var22.getGreen();
                  int var46 = var22.getBlue();
                  int var261 = (int)-3934873371873708977L;
                  var37 = 1773391953;
                  var36 = var261;
                  int var262 = (var36 | var37) - (var36 & var37);
                  var37 = -1783814385;
                  var36 = var262;
                  int var263 = (var36 | var37) & ~(var36 & var37);
                  var37 = 488095135;
                  var36 = -864805429;
                  var10001 = var36 & ~var37 | ~var36 & var37;
                  var37 = -2123515101;
                  var36 = var10001;
                  var37 = var36 & ~var37 | ~var36 & var37;
                  var36 = var263;
                  int var264 = 2 * (var36 | var37) - (var36 ^ var37);
                  int var47 = (int)(255.0F * var3);
                  var24.vertex(
                        var23,
                        (float)(var5.x + var42 * var4 - var21.x),
                        (float)(var5.y + var2.getHeight() * var15 - var21.y),
                        (float)(var5.z + var43 * var4 - var21.z)
                     )
                     .color(var44, var45, var46, var47);
                  var25++;
               }
            }

            double var26 = Math.cos(Math.toRadians(var25));
            double var28 = Math.sin(Math.toRadians(var25));
            int var30 = var22.getRed();
            int var31 = var22.getGreen();
            int var32 = var22.getBlue();
            String var258 = "cfm";
            int var33 = (int)(100.0F * var3);
            var24.vertex(
                  var23,
                  (float)(var5.x + var26 * var4 - var21.x),
                  (float)(var5.y + var2.getHeight() * var15 - var21.y),
                  (float)(var5.z + var28 * var4 - var21.z)
               )
               .color(var30, var31, var32, var33);
            VertexConsumer var259 = var24.vertex(
               var23,
               (float)(var5.x + var26 * var4 - var21.x),
               (float)(var5.y + var2.getHeight() * var15 + var17 - var21.y),
               (float)(var5.z + var28 * var4 - var21.z)
            );
            int var10004 = (int)2855045659030617937L;
            var37 = 1478103323;
            var36 = var10004;
            var10004 = (var36 | var37) & (~var36 | ~var37);
            var37 = 739274314;
            var36 = var10004;
            var259.color(var30, var31, var32, (var36 | var37) & (~var36 | ~var37));
            var25++;
         }
      }
   }

   private String a(ModeSetting var1) {
      String var2 = var1.d();
      int var10000 = (int)-6454479121839981547L;
      int var5 = 1773044661;
      int var4 = var10000;
      var10000 = var4 & ~var5 | ~var4 & var5;
      var5 = 182190175;
      var4 = var10000;
      int var3 = var4 + var5 - 2 * (var4 & var5);
      switch (var2.hashCode()) {
         case 935802008:
            var5 = -250060657;
            var4 = 1239424436;
            int var435 = (var4 | var5) - (var4 & var5);
            var5 = -1191674574;
            var4 = var435;
            var435 = (var4 | var5) & ~(var4 & var5);
            var5 = 1137284458;
            var4 = -822783457;
            int var474 = (var4 | var5) & (~var4 | ~var5);
            var5 = -1925396619;
            var4 = var474;
            var474 = var4 & ~var5 | ~var4 & var5;
            var5 = -1321958920;
            var4 = 1149960963;
            var474 = var4 + var5 - 2 * (var4 & var5);
            var5 = -171998466;
            var4 = var474;
            var474 = (var4 | var5) & ~(var4 & var5);
            var474 = (int)3469144877508954349L;
            var5 = 897928760;
            var4 = var474;
            var474 = (var4 | var5) & (~var4 | ~var5);
            var5 = 1186285899;
            var4 = var474;
            var474 = var4 & ~var5 | ~var4 & var5;
            var474 = (int)-5919460161551196831L;
            var5 = 1709877092;
            var4 = var474;
            var474 = (var4 | var5) & ~(var4 & var5);
            var5 = -687734122;
            var4 = var474;
            var474 = (var4 | var5) - (var4 & var5);
            var5 = -2069668334;
            var4 = 1588413059;
            int var517 = (var4 | var5) & ~(var4 & var5);
            var5 = -1063539508;
            var4 = var517;
            var517 = (var4 | var5) - (var4 & var5);
            var5 = 594312256;
            var4 = -1165814779;
            int var566 = (var4 | var5) & ~(var4 & var5);
            var5 = 1775507983;
            var4 = var566;
            var5 = (var4 | var5) & ~(var4 & var5);
            var4 = var517;
            var517 = var4 - ~var5 - 1;
            var517 = (int)5320124235283116813L;
            var5 = -39171324;
            var4 = var517;
            var517 = var4 & ~var5 | ~var4 & var5;
            var5 = 721527003;
            var4 = var517;
            var517 = var4 & ~var5 | ~var4 & var5;
            int var590 = (int)3888464152399829425L;
            var5 = -2064094571;
            var4 = var590;
            var590 = var4 & ~var5 | ~var4 & var5;
            var5 = -379997404;
            var4 = var590;
            var590 = var4 + var5 - 2 * (var4 & var5);
            var5 = 1132217141;
            var4 = 1698698843;
            var566 = var4 & ~var5 | ~var4 & var5;
            var5 = 934998865;
            var4 = var566;
            var566 = (var4 | var5) & (~var4 | ~var5);
            String var593 = "cfn";
            var590 = (int)-8166545675182175844L;
            var5 = -170568955;
            var4 = var590;
            var590 = (var4 | var5) & (~var4 | ~var5);
            var5 = -250173792;
            var4 = var590;
            if (var2.equals(
               c("ᢂ\udc0dᣄ\udc08ᢡ\udc74", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ", var474, var517, var566, var4 & ~var5 | ~var4 & var5)
            )) {
               var10000 = (int)-3643933649771267736L;
               var5 = -1989678269;
               var4 = var10000;
               var10000 = var4 + var5 - 2 * (var4 & var5);
               var5 = 1831703083;
               var4 = var10000;
               var3 = var4 & ~var5 | ~var4 & var5;
            }
            break;
         case 1172164023:
            var5 = 934101953;
            var4 = 2031997276;
            int var415 = (var4 | var5) & ~(var4 & var5);
            var5 = -1399087333;
            var4 = var415;
            var415 = ((var4 | var5) & ~(var4 & var5)) * ((var4 | var5) & ~(var4 & var5));
            var5 = 1163506129;
            var4 = -206288572;
            int var433 = var4 & ~var5 | ~var4 & var5;
            var5 = 1203567511;
            var4 = var433;
            var433 = ((var4 | var5) - (var4 & var5)) * ((var4 | var5) - (var4 & var5));
            String var470 = "cfo";
            int var471 = (int)-7306284245023597166L;
            var5 = -1735427794;
            var4 = var471;
            int var472 = var4 & ~var5 | ~var4 & var5;
            var5 = 697834543;
            var4 = var472;
            int var473 = var4 + var5 - 2 * (var4 & var5);
            int var554 = (int)5754257562788458204L;
            var5 = 179471619;
            var4 = var554;
            var554 = (var4 | var5) - (var4 & var5);
            var5 = 313453523;
            var4 = var554;
            var554 = (var4 | var5) - (var4 & var5);
            var5 = -1336342114;
            var4 = 550200188;
            var554 = (var4 | var5) - (var4 & var5);
            var5 = -1869452563;
            var4 = var554;
            var554 = (var4 | var5) - (var4 & var5);
            var554 = (int)-2743264672894666102L;
            var5 = -1814093204;
            var4 = var554;
            var554 = var4 & ~var5 | ~var4 & var5;
            var5 = -320661272;
            var4 = var554;
            var554 = var4 & ~var5 | ~var4 & var5;
            int var514 = (int)-976908076715314758L;
            var5 = 15606151;
            var4 = var514;
            var514 = var4 & ~var5 | ~var4 & var5;
            var5 = 1737754487;
            var4 = var514;
            var514 = var4 + var5 - 2 * (var4 & var5);
            String var562 = "cfp";
            var554 = (int)1049158147106577058L;
            var5 = -244545864;
            var4 = var554;
            var554 = (var4 | var5) & ~(var4 & var5);
            var5 = 1590511800;
            var4 = var554;
            var554 = var4 & ~var5 | ~var4 & var5;
            int var607 = (int)8854958681283335786L;
            var5 = 2106582804;
            var4 = var607;
            var607 = var4 + var5 - 2 * (var4 & var5);
            var5 = 925397365;
            var4 = var607;
            var607 = (var4 | var5) - (var4 & var5);
            var5 = 625903080;
            var4 = -278817720;
            var607 = var4 + var5 - 2 * (var4 & var5);
            var5 = -902884948;
            var4 = var607;
            var607 = (var4 | var5) & (~var4 | ~var5);
            var607 = (int)7673270532154484202L;
            var5 = -870211856;
            var4 = var607;
            var607 = var4 & ~var5 | ~var4 & var5;
            var5 = 581696264;
            var4 = var607;
            var607 = (var4 | var5) & (~var4 | ~var5);
            var5 = -1464757427;
            var4 = -161287238;
            var607 = (var4 | var5) & ~(var4 & var5);
            var5 = 1590911216;
            var4 = var607;
            var607 = var4 + var5 - 2 * (var4 & var5);
            var607 = (int)6378005001363144792L;
            var5 = -636725044;
            var4 = var607;
            var607 = (var4 | var5) & (~var4 | ~var5);
            var5 = 1810241689;
            var4 = var607;
            var607 = var4 & ~var5 | ~var4 & var5;
            var5 = 1429670844;
            var4 = 1633283527;
            int var589 = (var4 | var5) & ~(var4 & var5);
            var5 = 879697098;
            var4 = var589;
            if (var2.equals(c("ᢊ媌ᢥ媀ᢩ媇", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ", var473, var514, var554, (var4 | var5) & ~(var4 & var5)))) {
               var10000 = (int)-5696547896313800824L;
               var5 = 1773818516;
               var4 = var10000;
               var10000 = (var4 | var5) & (~var4 | ~var5);
               var5 = -611465954;
               var4 = var10000;
               var3 = var4 & ~var5 | ~var4 & var5;
            }
            break;
         case 1680297915:
            var5 = 2129018816;
            var4 = -341646922;
            int var10001 = (var4 | var5) & (~var4 | ~var5);
            var5 = 632843503;
            var4 = var10001;
            var10001 = (var4 + var5 - 2 * (var4 & var5)) * (var4 + var5 - 2 * (var4 & var5));
            int var10002 = (int)-5531922658396849390L;
            var5 = -1549270890;
            var4 = var10002;
            var10002 = (var4 | var5) & ~(var4 & var5);
            var5 = 1003735014;
            var4 = var10002;
            var10002 = (var4 | var5) & ~(var4 & var5);
            int var10003 = (int)981292708206122924L;
            var5 = -598187341;
            var4 = var10003;
            var10003 = (var4 | var5) & (~var4 | ~var5);
            var5 = -1446486395;
            var4 = var10003;
            var5 = (var4 | var5) & (~var4 | ~var5);
            var4 = var10002;
            var10002 = (var4 ^ var5) + 2 * (var4 & var5);
            var10003 = (int)-248715763084160808L;
            var5 = 2013961786;
            var4 = var10003;
            var10003 = var4 + var5 - 2 * (var4 & var5);
            var5 = -1574667917;
            var4 = var10003;
            var10003 = (var4 | var5) & (~var4 | ~var5);
            var5 = -204791831;
            var4 = -1282646480;
            int var10004 = var4 + var5 - 2 * (var4 & var5);
            var5 = 1145336052;
            var4 = var10004;
            var5 = var4 & ~var5 | ~var4 & var5;
            var4 = var10003;
            var10003 = (var4 | var5) + (var4 & var5);
            var10003 = (int)-205757520700647601L;
            var5 = 1815782823;
            var4 = var10003;
            var10003 = (var4 | var5) & ~(var4 & var5);
            var5 = 1522387579;
            var4 = var10003;
            var10003 = (var4 | var5) & (~var4 | ~var5);
            int var10005 = (int)-1738496532170064813L;
            var5 = -105973877;
            var4 = var10005;
            var10005 = (var4 | var5) - (var4 & var5);
            var5 = -1787835429;
            var4 = var10005;
            var10005 = var4 + var5 - 2 * (var4 & var5);
            var10005 = (int)8411157158280065025L;
            var5 = 308494713;
            var4 = var10005;
            var10005 = var4 & ~var5 | ~var4 & var5;
            var5 = 455553406;
            var4 = var10005;
            var10005 = var4 & ~var5 | ~var4 & var5;
            var5 = -1599759442;
            var4 = 912317380;
            var10004 = (var4 | var5) & (~var4 | ~var5);
            var5 = 1152025237;
            var4 = var10004;
            var10004 = var4 + var5 - 2 * (var4 & var5);
            var5 = -393030687;
            var4 = 1039967094;
            var10005 = (var4 | var5) - (var4 & var5);
            var5 = -1182309481;
            var4 = var10005;
            var10005 = (var4 & ~var5 | ~var4 & var5) * (var4 & ~var5 | ~var4 & var5);
            var10005 = (int)8967109359593031228L;
            var5 = -1639513265;
            var4 = var10005;
            var10005 = (var4 | var5) - (var4 & var5);
            var5 = 1818998562;
            var4 = var10005;
            var10005 = (var4 | var5) & ~(var4 & var5);
            var5 = -1196835175;
            var4 = -1157500793;
            int var10007 = var4 & ~var5 | ~var4 & var5;
            var5 = 61361676;
            var4 = var10007;
            var10007 = var4 & ~var5 | ~var4 & var5;
            var10007 = (int)9068564191143020911L;
            var5 = 113841916;
            var4 = var10007;
            var10007 = var4 + var5 - 2 * (var4 & var5);
            var5 = -1524539492;
            var4 = var10007;
            var10007 = var4 + var5 - 2 * (var4 & var5);
            var5 = -2002225100;
            var4 = 790168421;
            int var10006 = (var4 | var5) & (~var4 | ~var5);
            var5 = -1482023625;
            var4 = var10006;
            if (var2.equals(
               c("ᢊ왐ᣖ옢\u18ad왝ᢥ", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ", var10003, var10004, var10005, (var4 | var5) - (var4 & var5))
            )) {
               var5 = 382697697;
               var4 = 1231964457;
               var10000 = (var4 | var5) - (var4 & var5);
               var5 = 1604438473;
               var4 = var10000;
               var3 = var4 + var5 - 2 * (var4 & var5);
            }
      }

      switch (var3) {
         case 0:
            var10000 = (int)-2185948067404818099L;
            var5 = 932351164;
            var4 = var10000;
            var10000 = (var4 | var5) & ~(var4 & var5);
            var5 = -493661071;
            var4 = var10000;
            var10000 = var4 & ~var5 | ~var4 & var5;
            int var424 = (int)-1908475388634906188L;
            var5 = -1982656679;
            var4 = var424;
            var424 = var4 & ~var5 | ~var4 & var5;
            var5 = 624560146;
            var4 = var424;
            var5 = (var4 | var5) & (~var4 | ~var5);
            var4 = var10000;
            var10000 = (var4 & ~var5) + (var5 & ~var4) + 2 * (var4 & var5);
            var424 = (int)-3049621288140768814L;
            var5 = -1295374016;
            var4 = var424;
            var424 = var4 + var5 - 2 * (var4 & var5);
            var5 = 1915343020;
            var4 = var424;
            var424 = (var4 | var5) & ~(var4 & var5);
            var5 = 1140649831;
            var4 = 1454693591;
            int var459 = (var4 | var5) - (var4 & var5);
            var5 = -201138788;
            var4 = var459;
            var5 = (var4 | var5) & ~(var4 & var5);
            var4 = var424;
            var424 = (var4 ^ var5) + 2 * (var4 & var5);
            var5 = 1452711285;
            var4 = -116303092;
            int var502 = var4 & ~var5 | ~var4 & var5;
            var5 = -1350056324;
            var4 = var502;
            var502 = (var4 | var5) & ~(var4 & var5);
            var5 = -1740631163;
            var4 = -904281874;
            var502 = var4 + var5 - 2 * (var4 & var5);
            var5 = 1381618530;
            var4 = var502;
            var502 = var4 & ~var5 | ~var4 & var5;
            var5 = -547636211;
            var4 = -1966275332;
            var459 = var4 & ~var5 | ~var4 & var5;
            var5 = 1741946978;
            var4 = var459;
            var459 = (var4 | var5) & ~(var4 & var5);
            var5 = 99439357;
            var4 = -978591536;
            var502 = (var4 | var5) & (~var4 | ~var5);
            var5 = -1441843039;
            var4 = var502;
            var502 = (var4 | var5) & (~var4 | ~var5);
            var5 = -1519218398;
            var4 = 1421180543;
            int var539 = var4 & ~var5 | ~var4 & var5;
            var5 = -171874945;
            var4 = var539;
            var5 = (var4 | var5) & ~(var4 & var5);
            var4 = var502;
            var502 = (var4 & ~var5) + (var5 & ~var4) + 2 * (var4 & var5);
            var502 = (int)-2578850605885083356L;
            var5 = -1220931187;
            var4 = var502;
            var502 = (var4 | var5) & ~(var4 & var5);
            var5 = -288362720;
            var4 = var502;
            var502 = (var4 | var5) - (var4 & var5);
            var5 = -180742125;
            var4 = 937626601;
            var539 = var4 & ~var5 | ~var4 & var5;
            var5 = -1231492820;
            var4 = var539;
            var539 = ((var4 | var5) & (~var4 | ~var5)) * ((var4 | var5) & (~var4 | ~var5));
            var5 = 848788198;
            var4 = -91621640;
            var539 = var4 + var5 - 2 * (var4 & var5);
            var5 = -1012255005;
            var4 = var539;
            var539 = var4 + var5 - 2 * (var4 & var5);
            var5 = -956273143;
            var4 = 2000332298;
            int var584 = var4 & ~var5 | ~var4 & var5;
            var5 = 1159919939;
            var4 = var584;
            var584 = var4 + var5 - 2 * (var4 & var5);
            int var601 = (int)-6369936727579858629L;
            var5 = -764744857;
            var4 = var601;
            var601 = var4 + var5 - 2 * (var4 & var5);
            var5 = 1156332464;
            var4 = var601;
            var5 = var4 + var5 - 2 * (var4 & var5);
            var4 = var584;
            var584 = 2 * (var4 | var5) - (var4 ^ var5);
            var584 = (int)913529053813761093L;
            var5 = 510101052;
            var4 = var584;
            var584 = var4 + var5 - 2 * (var4 & var5);
            var5 = -2034462583;
            var4 = var584;
            return c("᳷횚ᳺ횕\u1cfe횩᳦횂᳴횄ᳳ횟ᳰ횚ᳱ", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ", var459, var502, var539, var4 & ~var5 | ~var4 & var5);
         case 1:
            var10000 = (int)-7771213564222261177L;
            var5 = -177849378;
            var4 = var10000;
            var10000 = (var4 | var5) - (var4 & var5);
            var5 = -1880901906;
            var4 = var10000;
            var10000 = ((var4 | var5) & (~var4 | ~var5)) * ((var4 | var5) & (~var4 | ~var5));
            int var446 = (int)5600284173132432074L;
            var5 = 559650767;
            var4 = var446;
            var446 = (var4 | var5) - (var4 & var5);
            var5 = -1919511293;
            var4 = var446;
            var446 = (var4 | var5) & ~(var4 & var5);
            var5 = 465016579;
            var4 = 1744671177;
            var446 = var4 + var5 - 2 * (var4 & var5);
            var5 = 2085226177;
            var4 = var446;
            var446 = (var4 | var5) & (~var4 | ~var5);
            var446 = (int)-669692997859084694L;
            var5 = 857238699;
            var4 = var446;
            var446 = (var4 | var5) & ~(var4 & var5);
            var5 = 1897044682;
            var4 = var446;
            var446 = (var4 | var5) - (var4 & var5);
            var5 = 1015129465;
            var4 = 985879315;
            var446 = (var4 | var5) & (~var4 | ~var5);
            var5 = -1907152495;
            var4 = var446;
            var446 = (var4 | var5) - (var4 & var5);
            var5 = 2045758657;
            var4 = 1064770177;
            int var494 = var4 & ~var5 | ~var4 & var5;
            var5 = -71088866;
            var4 = var494;
            var5 = (var4 | var5) - (var4 & var5);
            var4 = var446;
            var446 = 2 * (var4 | var5) - (var4 ^ var5);
            var5 = -172837762;
            var4 = 1787394750;
            var446 = var4 & ~var5 | ~var4 & var5;
            var5 = -1384548781;
            var4 = var446;
            var446 = var4 & ~var5 | ~var4 & var5;
            var494 = (int)6435706007644710062L;
            var5 = -546365418;
            var4 = var494;
            var494 = (var4 | var5) - (var4 & var5);
            var5 = -99590620;
            var4 = var494;
            var494 = var4 & ~var5 | ~var4 & var5;
            int var532 = (int)1639563554280165953L;
            var5 = 1730760845;
            var4 = var532;
            var532 = var4 & ~var5 | ~var4 & var5;
            var5 = -2135103212;
            var4 = var532;
            var5 = var4 + var5 - 2 * (var4 & var5);
            var4 = var494;
            var494 = 2 * (var4 | var5) - (var4 ^ var5);
            var494 = (int)-4742992117995189132L;
            var5 = -876953265;
            var4 = var494;
            var494 = (var4 | var5) - (var4 & var5);
            var5 = 1269170403;
            var4 = var494;
            var494 = var4 & ~var5 | ~var4 & var5;
            var5 = 20586091;
            var4 = -2124442441;
            var532 = (var4 | var5) & (~var4 | ~var5);
            var5 = -123664840;
            var4 = var532;
            var532 = (var4 | var5) & (~var4 | ~var5);
            int var576 = (int)-8941461868662685692L;
            var5 = -451855444;
            var4 = var576;
            var576 = var4 + var5 - 2 * (var4 & var5);
            var5 = 1952322249;
            var4 = var576;
            var5 = (var4 | var5) & ~(var4 & var5);
            var4 = var532;
            var532 = (var4 & ~var5) + (var5 & ~var4) + 2 * (var4 & var5);
            var5 = -1881354761;
            var4 = 1253210778;
            var532 = var4 & ~var5 | ~var4 & var5;
            var5 = -867220819;
            var4 = var532;
            var532 = (var4 | var5) & ~(var4 & var5);
            var576 = (int)4178026702009608537L;
            var5 = 1641071638;
            var4 = var576;
            var576 = var4 & ~var5 | ~var4 & var5;
            var5 = 176716917;
            var4 = var576;
            var576 = var4 + var5 - 2 * (var4 & var5);
            var5 = 581275093;
            var4 = 626329747;
            int var600 = var4 + var5 - 2 * (var4 & var5);
            var5 = -1636225635;
            var4 = var600;
            var5 = var4 + var5 - 2 * (var4 & var5);
            var4 = var576;
            var576 = (var4 ^ var5) + 2 * (var4 & var5);
            var576 = (int)8209717402185421408L;
            var5 = 1552877868;
            var4 = var576;
            var576 = (var4 | var5) & (~var4 | ~var5);
            var5 = -1422464397;
            var4 = var576;
            return c("᳷镕ᳺ镚\u1cfe镦ᳶ镖᳷镎ᳰ镛", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ", var446, var494, var532, (var4 | var5) - (var4 & var5));
         case 2:
            String var406 = "cfq";
            var5 = -1172428850;
            var4 = -1817243897;
            int var422 = (var4 | var5) - (var4 & var5);
            var5 = 1654706243;
            var4 = var422;
            var422 = (var4 & ~var5 | ~var4 & var5) * (var4 & ~var5 | ~var4 & var5);
            int var441 = (int)7882231588275021864L;
            var5 = 1439928733;
            var4 = var441;
            var441 = (var4 | var5) & (~var4 | ~var5);
            var5 = -1103966670;
            var4 = var441;
            var441 = (var4 | var5) & (~var4 | ~var5);
            var5 = -177676167;
            var4 = -905747328;
            var441 = (var4 | var5) & (~var4 | ~var5);
            var5 = 220806250;
            var4 = var441;
            var441 = (var4 | var5) - (var4 & var5);
            var5 = 451633078;
            var4 = 564652637;
            int var489 = (var4 | var5) & (~var4 | ~var5);
            var5 = -305438616;
            var4 = var489;
            var489 = ((var4 | var5) - (var4 & var5)) * ((var4 | var5) - (var4 & var5));
            var489 = (int)-7539362691993291066L;
            var5 = -1428336106;
            var4 = var489;
            var489 = (var4 | var5) & (~var4 | ~var5);
            var5 = -693892589;
            var4 = var489;
            var489 = var4 & ~var5 | ~var4 & var5;
            int var527 = (int)-2249226074618338017L;
            var5 = 1469644615;
            var4 = var527;
            var527 = var4 & ~var5 | ~var4 & var5;
            var5 = 2035703926;
            var4 = var527;
            var527 = (var4 | var5) & ~(var4 & var5);
            var5 = -1447104280;
            var4 = -1580736039;
            var527 = var4 & ~var5 | ~var4 & var5;
            var5 = 40127383;
            var4 = var527;
            var527 = var4 & ~var5 | ~var4 & var5;
            int var571 = (int)3763527219485523395L;
            var5 = 1922189800;
            var4 = var571;
            var571 = (var4 | var5) & ~(var4 & var5);
            var5 = 1905252543;
            var4 = var571;
            var571 = (var4 | var5) & ~(var4 & var5);
            int var598 = (int)2168848582584678340L;
            var5 = -987070823;
            var4 = var598;
            var598 = (var4 | var5) - (var4 & var5);
            var5 = -540773341;
            var4 = var598;
            var5 = var4 & ~var5 | ~var4 & var5;
            var4 = var571;
            var571 = 2 * (var4 | var5) - (var4 ^ var5);
            var5 = -304699805;
            var4 = 2016396635;
            var571 = var4 + var5 - 2 * (var4 & var5);
            var5 = -1782288110;
            var4 = var571;
            return c("᳷뙀ᳺ뙏\u1cfe뙳᳥뙀᳴뙟᳸뙍", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ", var441, var489, var527, var4 + var5 - 2 * (var4 & var5));
         default:
            var5 = 1151593402;
            var4 = -1502869172;
            int var417 = var4 + var5 - 2 * (var4 & var5);
            var5 = -489692424;
            var4 = var417;
            var417 = var4 + var5 - 2 * (var4 & var5);
            var417 = (int)-838207201946444883L;
            var5 = -1153745861;
            var4 = var417;
            var417 = (var4 | var5) & (~var4 | ~var5);
            var5 = -2113432788;
            var4 = var417;
            var417 = var4 + var5 - 2 * (var4 & var5);
            var5 = -349894092;
            var4 = 1526448974;
            int var437 = (var4 | var5) & ~(var4 & var5);
            var5 = -558996816;
            var4 = var437;
            var437 = (var4 | var5) - (var4 & var5);
            var5 = 1174785351;
            var4 = 1027321654;
            var437 = var4 & ~var5 | ~var4 & var5;
            var5 = 1232919266;
            var4 = var437;
            var437 = (var4 | var5) - (var4 & var5);
            int var484 = (int)7516500904314937300L;
            var5 = 813189410;
            var4 = var484;
            var484 = var4 + var5 - 2 * (var4 & var5);
            var5 = 1480998177;
            var4 = var484;
            var484 = (var4 | var5) & (~var4 | ~var5);
            var5 = -1287669790;
            var4 = 777832211;
            var484 = var4 & ~var5 | ~var4 & var5;
            var5 = 1341313044;
            var4 = var484;
            var484 = (var4 | var5) & (~var4 | ~var5);
            String var523 = "cfr";
            int var524 = (int)542262670037820787L;
            var5 = -1897570286;
            var4 = var524;
            int var525 = (var4 | var5) & (~var4 | ~var5);
            var5 = -386625524;
            var4 = var525;
            int var526 = (var4 | var5) & (~var4 | ~var5);
            var5 = 1518245568;
            var4 = 1602035447;
            int var596 = (var4 | var5) - (var4 & var5);
            var5 = 84117554;
            var4 = var596;
            var596 = (var4 | var5) & ~(var4 & var5);
            int var569 = (int)5128415245272305301L;
            var5 = -1461757980;
            var4 = var569;
            var569 = (var4 | var5) - (var4 & var5);
            var5 = -742040259;
            var4 = var569;
            return c(
               "᳷\ue026ᳺ\ue029\u1cfe\ue015\u1cfb\ue02f᳷\ue03f᳹\ue02b",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ",
               var437,
               var484,
               var526,
               var4 + var5 - 2 * (var4 & var5)
            );
      }
   }

   private void d(WorldRenderEvent var1, LivingEntity var2, float var3) {
      if (var3 <= 0.0F) {
         int var69 = 354961266;
         int var68 = -339719087;
         int var10000 = (var68 | var69) & ~(var68 & var69);
         var69 = -1314257208;
         var68 = var10000;
         var10000 = ((var68 | var69) & (~var68 | ~var69)) * ((var68 | var69) & (~var68 | ~var69));
         var69 = -386022485;
         var68 = -1164652384;
         var10000 = (var68 | var69) & (~var68 | ~var69);
         var69 = 1744657325;
         var68 = var10000;
         int var67 = (var68 | var69) & (~var68 | ~var69);
         var69 = 1336161147;
         var68 = 953064179;
         var10000 = (var68 | var69) & ~(var68 & var69);
         var69 = -487054046;
         var68 = var10000;
         var10000 = ((var68 | var69) - (var68 & var69)) * ((var68 | var69) - (var68 & var69));
         var69 = 2068631729;
         var68 = 1921666943;
         var10000 = (var68 | var69) & ~(var68 & var69);
         var69 = 223901407;
         var68 = var10000;
         if ((var68 & ~var69 | ~var68 & var69) >= var67) {
            throw new IllegalStateException();
         }
      } else if (this.a(var2)) {
         Vec3d var4 = EntityUtils.b(var2, var1.b());
         if (var4 == null) {
            var4 = var2.getPos();
         }

         if (var4 == null) {
            return;
         }

         MatrixStack var5 = var1.a();
         Vec3d var6 = c.gameRenderer.getCamera().getPos();
         Color var7 = this.b(var2);
         int var8 = this.r.b();
         int var9 = this.s.b();
         float var10 = this.u.a() + var2.getWidth() / 2.0F;
         float var11 = this.v.a() * var3;
         float var12 = var2.getHeight();
         Vec3d var13 = new Vec3d(var4.x, var4.y + var12 / 2.0F, var4.z);
         double var14 = 0.0;
         if (this.w.a()) {
            var14 = this.Q.getOrDefault(var2, 0.0);
         }

         double var16 = this.R.getOrDefault(var2, 0.0);
         double var743 = Math.sin(var16);
         String var10001 = "cfs";
         double var18 = var743 * 0.08;
         float var20 = (float)(var10 + var18);
         Optional var21 = Optional.empty();
         if (this.x.a()) {
            String var22 = this.a(this.y);
            var21 = ShaderLibrary.getRegistry().find(var22);
         }

         String var70 = this.p.d();
         int var424 = -1885399201;
         int var103 = -846525400;
         int var786 = (var103 | var424) - (var103 & var424);
         var424 = 1108614006;
         var103 = var786;
         var424 = var103 & ~var424 | ~var103 & var424;
         var103 = var9;
         float var23 = (var103 + ~var424 + 1) / 2.0F;
         float var24 = this.t.a();
         float var25 = var12 * var24;
         float var26 = (var12 - var25) / 2.0F;
         if (this.z.a()) {
            float var27 = this.A.a();
            int var787 = (int)4255989197739716622L;
            var424 = 1899524474;
            var103 = var787;
            int var788 = (var103 | var424) - (var103 & var424);
            var424 = 1393651359;
            var103 = var788;
            int var789 = var103 + var424 - 2 * (var103 & var424);
            int var28 = (int)(var3 * 255.0F * this.B.a());
            int var29 = ColorUtils.a(ColorUtils.a(var7.getRGB()), var28);
            var424 = -1622511623;
            var103 = 624239120;
            int var744 = (var103 | var424) & ~(var103 & var424);
            var424 = -1166062103;
            var103 = var744;
            int var30 = (var103 | var424) & ~(var103 & var424);

            while (var30 < var9) {
               float var790 = var25 * var30;
               var424 = -1877838412;
               var103 = -1230699938;
               int var10003 = (var103 | var424) - (var103 & var424);
               var424 = 649557995;
               var103 = var10003;
               var424 = var103 & ~var424 | ~var103 & var424;
               var103 = var9;
               float var31 = var26 + var790 / ((var103 & ~var424) - (~var103 & var424));
               float var32 = (float)(var4.y + var31);
               float var745 = Math.abs(var30 - var23);
               int var10002 = (int)8768190764360483344L;
               var424 = 260566706;
               var103 = var10002;
               var10002 = (var103 | var424) - (var103 & var424);
               var424 = -1061985345;
               var103 = var10002;
               var10002 = var103 + var424 - 2 * (var103 & var424);
               float var33 = var745 / Math.max(var23, 0.001F);
               var10002 = (int)898205273846854560L;
               var424 = 388938617;
               var103 = var10002;
               var10002 = (var103 | var424) & (~var103 | ~var424);
               var424 = -780280039;
               var103 = var10002;
               var10002 = (var103 | var424) - (var103 & var424);
               float var34 = 1.0F - var33 * 0.3F;
               float var35 = var20 * var34;
               var424 = 809915658;
               var103 = -522318974;
               int var746 = var103 + var424 - 2 * (var103 & var424);
               var424 = -1964347133;
               var103 = var746;
               int var747 = ((var103 | var424) & ~(var103 & var424)) * ((var103 | var424) & ~(var103 & var424));
               var743 = 360.0 / var8;
               int var791 = (int)-4282947215256927374L;
               var424 = 1113659402;
               var103 = var791;
               int var792 = var103 & ~var424 | ~var103 & var424;
               var424 = 1869388045;
               var103 = var792;
               int var793 = var103 & ~var424 | ~var103 & var424;
               var743 /= 2.0;
               var424 = -621901560;
               var103 = 516131550;
               var10002 = var103 + var424 - 2 * (var103 & var424);
               var424 = -1003682860;
               var103 = var10002;
               double var36 = var743 * (var30 % ((var103 | var424) & ~(var103 & var424)));
               int var750 = (int)-2100207774452934321L;
               var424 = 1976114816;
               var103 = var750;
               int var751 = var103 + var424 - 2 * (var103 & var424);
               var424 = 1693517775;
               var103 = var751;
               int var38 = (var103 | var424) & (~var103 | ~var424);

               while (var38 < var8) {
                  var743 = var14 + var36;
                  int var794 = (int)-788365963321326906L;
                  var424 = 2103126699;
                  var103 = var794;
                  int var795 = (var103 | var424) & ~(var103 & var424);
                  var424 = 1441237596;
                  var103 = var795;
                  int var796 = var103 & ~var424 | ~var103 & var424;
                  var424 = 1847537846;
                  var103 = 312580098;
                  var10002 = var103 & ~var424 | ~var103 & var424;
                  var424 = 1362191518;
                  var103 = var10002;
                  var424 = var103 & ~var424 | ~var103 & var424;
                  var103 = var796;
                  int var797 = (var103 & ~var424) + (var424 & ~var103) + 2 * (var103 & var424);
                  double var39 = Math.toRadians(var743 + 360.0 * var38 / var8);
                  float var41 = (float)(var13.x + var35 * Math.cos(var39));
                  float var42 = (float)(var13.z + var35 * Math.sin(var39));
                  float var43 = var41;
                  float var44 = var32;
                  float var45 = var42;
                  var424 = 541583657;
                  var103 = -1420217091;
                  int var798 = (var103 | var424) - (var103 & var424);
                  var424 = -860759722;
                  var103 = var798;
                  int var799 = ((var103 | var424) & (~var103 | ~var424)) * ((var103 | var424) & (~var103 | ~var424));
                  var10002 = (int)2320792428430997498L;
                  var424 = 930944894;
                  var103 = var10002;
                  var10002 = var103 + var424 - 2 * (var103 & var424);
                  var424 = 1479873237;
                  var103 = var10002;
                  var10002 = (var103 | var424) & (~var103 | ~var424);
                  var10003 = (int)3694751669322473078L;
                  var424 = 1177025428;
                  var103 = var10003;
                  var10003 = var103 & ~var424 | ~var103 & var424;
                  var424 = 1375764052;
                  var103 = var10003;
                  var10003 = ((var103 | var424) - (var103 & var424)) * ((var103 | var424) - (var103 & var424));
                  var424 = 747682115;
                  var103 = -1083417715;
                  var10003 = (var103 | var424) & ~(var103 & var424);
                  var424 = -1581360547;
                  var103 = var10003;
                  var10003 = (var103 | var424) & (~var103 | ~var424);
                  var424 = -1968906469;
                  var103 = -1243350516;
                  int var10005 = var103 & ~var424 | ~var103 & var424;
                  var424 = 1061627143;
                  var103 = var10005;
                  var10005 = (var103 | var424) & ~(var103 & var424);
                  var424 = 406462362;
                  var103 = 221792245;
                  var10005 = (var103 | var424) & ~(var103 & var424);
                  var424 = 352475235;
                  var103 = var10005;
                  var10005 = (var103 | var424) - (var103 & var424);
                  int var10004 = (int)-8668696513145547949L;
                  var424 = -1893189596;
                  var103 = var10004;
                  var10004 = var103 & ~var424 | ~var103 & var424;
                  var424 = -551389672;
                  var103 = var10004;
                  var10004 = (var103 | var424) & (~var103 | ~var424);
                  String var986 = "cft";
                  var424 = -662077801;
                  var103 = 327168469;
                  var10005 = var103 + var424 - 2 * (var103 & var424);
                  var424 = -567280066;
                  var103 = var10005;
                  var10005 = (var103 | var424) & ~(var103 & var424);
                  var424 = 1611091385;
                  var103 = 1897066694;
                  int var10006 = (var103 | var424) & (~var103 | ~var424);
                  var424 = 2064372750;
                  var103 = var10006;
                  var10006 = (var103 | var424) & ~(var103 & var424);
                  var424 = -1673911090;
                  var103 = 653658568;
                  int var10007 = (var103 | var424) - (var103 & var424);
                  var424 = 959835612;
                  var103 = var10007;
                  var424 = (var103 | var424) - (var103 & var424);
                  var103 = var10006;
                  var10006 = var103 - ~var424 - 1;
                  var10006 = (int)-6431039530636537443L;
                  var424 = 1770204145;
                  var103 = var10006;
                  var10006 = (var103 | var424) - (var103 & var424);
                  var424 = -565840508;
                  var103 = var10006;
                  if (var70.equals(
                     c(
                        "ꡆ\udf5eꠧ\udf29ꡜ\udf26ꡟ",
                        "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ",
                        var10003,
                        var10004,
                        var10005,
                        (var103 | var424) - (var103 & var424)
                     )
                  )) {
                     double var46 = var13.x - var41;
                     double var48 = var13.y - var32;
                     double var50 = var13.z - var42;
                     double var52 = Math.sqrt(var46 * var46 + var48 * var48 + var50 * var50);
                     var10002 = (int)5060360326632301213L;
                     var424 = 1208791717;
                     var103 = var10002;
                     var10002 = (var103 | var424) & ~(var103 & var424);
                     var424 = -1335275470;
                     var103 = var10002;
                     var10002 = var103 & ~var424 | ~var103 & var424;
                     var424 = 388162189;
                     var103 = -50628457;
                     var10002 = (var103 | var424) - (var103 & var424);
                     var424 = -338060780;
                     var103 = var10002;
                     var10002 = (var103 | var424) & ~(var103 & var424);
                     var424 = 759450909;
                     var103 = -1150025125;
                     var10002 = (var103 | var424) - (var103 & var424);
                     var424 = -1775218879;
                     var103 = var10002;
                     var10002 = var103 & ~var424 | ~var103 & var424;
                     var10002 = (int)-1725407294782359158L;
                     var424 = 185787973;
                     var103 = var10002;
                     var10002 = (var103 | var424) & (~var103 | ~var424);
                     var424 = -155983933;
                     var103 = var10002;
                     var10002 = var103 & ~var424 | ~var103 & var424;
                     if (var52 > 0.001) {
                        var46 /= var52;
                        var48 /= var52;
                        var50 /= var52;
                     }

                     var10001 = "cfu";
                     float var54 = var11 * 0.75F;
                     var43 = (float)(var43 + var46 * var54);
                     var44 = (float)(var44 + var48 * var54);
                     var45 = (float)(var45 + var50 * var54);
                  }

                  Vec3d var89 = new Vec3d(var43, var44, var45);
                  WorldRenderUtils.a(var5, var89, var27, var29);
                  var38++;
                  if (a != a) {
                     var424 = -1481606613;
                     var103 = -787497372;
                     int var801 = var103 & ~var424 | ~var103 & var424;
                     var424 = 1992279134;
                     var103 = var801;
                     int var802 = (var103 | var424) & (~var103 | ~var424);
                     int var803 = (int)-6362156185294284131L;
                     var424 = -103173693;
                     var103 = var803;
                     int var804 = (var103 | var424) - (var103 & var424);
                     var424 = -1608291507;
                     var103 = var804;
                     int var805 = (var103 | var424) & (~var103 | ~var424);
                     var424 = 1154387268;
                     var103 = -1445450755;
                     int var753 = (var103 | var424) - (var103 & var424);
                     var424 = 713780743;
                     var103 = var753;
                     int var93 = var103 & ~var424 | ~var103 & var424;
                  }
               }

               var30++;
               if (a != a) {
                  var424 = 790291413;
                  var103 = 2125634465;
                  int var754 = (var103 | var424) & ~(var103 & var424);
                  var424 = 648242175;
                  var103 = var754;
                  int var755 = (var103 | var424) & ~(var103 & var424);
                  var424 = -327164995;
                  var103 = -1587362468;
                  int var806 = (var103 | var424) - (var103 & var424);
                  var424 = 946743749;
                  var103 = var806;
                  var424 = var103 & ~var424 | ~var103 & var424;
                  var103 = var755;
                  int var756 = (var103 ^ var424) + 2 * (var103 & var424);
                  var424 = 732876210;
                  var103 = -1041024788;
                  int var757 = var103 + var424 - 2 * (var103 & var424);
                  var424 = 1633323146;
                  var103 = var757;
                  int var94 = (var103 | var424) - (var103 & var424);
                  a = var94;
               }
            }
         }

         var5.push();
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.disableCull();
         int var758 = (int)1276774652177875513L;
         var424 = -1385598687;
         var103 = var758;
         int var759 = var103 + var424 - 2 * (var103 & var424);
         var424 = -1138724072;
         var103 = var759;
         RenderSystem.depthMask(pulse.Bool.from((var103 | var424) - (var103 & var424)));
         if (!var21.isPresent()) {
            RenderSystem.setShader(ShaderProgramKeys.POSITION_COLOR);
         } else {
            PulseShaderProgram var71 = (PulseShaderProgram)var21.get();
            var424 = -1564320887;
            var103 = 905771162;
            int var807 = (var103 | var424) - (var103 & var424);
            var424 = -1578820069;
            var103 = var807;
            int var808 = (var103 | var424) - (var103 & var424);
            var424 = 324549571;
            var103 = -212395435;
            int var856 = (var103 | var424) - (var103 & var424);
            var424 = 1295502256;
            var103 = var856;
            var424 = (var103 | var424) & (~var103 | ~var424);
            var103 = var808;
            int var809 = var103 - ~var424 - 1;
            float var73 = (float)(var16 * 0.4);
            var71.d();
            var424 = 215312056;
            var103 = 669581065;
            int var810 = var103 + var424 - 2 * (var103 & var424);
            var424 = 1616068633;
            var103 = var810;
            int var811 = var103 & ~var424 | ~var103 & var424;
            var424 = 1555802963;
            var103 = -169938837;
            var856 = var103 + var424 - 2 * (var103 & var424);
            var424 = -135663900;
            var103 = var856;
            var856 = (var103 | var424) & (~var103 | ~var424);
            int var895 = (int)3304555868837963623L;
            var424 = -1160565210;
            var103 = var895;
            var895 = (var103 | var424) & ~(var103 & var424);
            var424 = -802526390;
            var103 = var895;
            var895 = (var103 | var424) & (~var103 | ~var424);
            var895 = (int)-5836055043130599085L;
            var424 = 1033518523;
            var103 = var895;
            var895 = var103 & ~var424 | ~var103 & var424;
            var424 = -414557061;
            var103 = var895;
            var895 = var103 + var424 - 2 * (var103 & var424);
            var424 = 659088806;
            var103 = -1920500206;
            int var989 = var103 + var424 - 2 * (var103 & var424);
            var424 = -1429234765;
            var103 = var989;
            var989 = (var103 | var424) & ~(var103 & var424);
            var424 = 1478845787;
            var103 = 327772998;
            int var958 = (var103 | var424) - (var103 & var424);
            var424 = 798737125;
            var103 = var958;
            var958 = (var103 | var424) & ~(var103 & var424);
            var424 = 1677311936;
            var103 = -1591792397;
            int var1040 = var103 + var424 - 2 * (var103 & var424);
            var424 = -1025076417;
            var103 = var1040;
            var1040 = (var103 | var424) - (var103 & var424);
            var1040 = (int)2174429312867024393L;
            var424 = -1579845069;
            var103 = var1040;
            var1040 = (var103 | var424) - (var103 & var424);
            var424 = -545799118;
            var103 = var1040;
            var1040 = var103 + var424 - 2 * (var103 & var424);
            var1040 = (int)-1094202122185314148L;
            var424 = -1659041853;
            var103 = var1040;
            var1040 = (var103 | var424) & ~(var103 & var424);
            var424 = 129464148;
            var103 = var1040;
            var1040 = var103 + var424 - 2 * (var103 & var424);
            var1040 = (int)9000363036979908287L;
            var424 = -80812466;
            var103 = var1040;
            var1040 = (var103 | var424) - (var103 & var424);
            var424 = -7296780;
            var103 = var1040;
            var1040 = (var103 | var424) & ~(var103 & var424);
            var1040 = (int)982888118912534187L;
            var424 = 75068760;
            var103 = var1040;
            var1040 = (var103 | var424) & ~(var103 & var424);
            var424 = 1505932287;
            var103 = var1040;
            var1040 = var103 + var424 - 2 * (var103 & var424);
            var424 = -1632291911;
            var103 = -106408569;
            var989 = var103 & ~var424 | ~var103 & var424;
            var424 = 1660919854;
            var103 = var989;
            var989 = var103 & ~var424 | ~var103 & var424;
            var424 = -1371284773;
            var103 = -1778744571;
            var1040 = var103 + var424 - 2 * (var103 & var424);
            var424 = 604910427;
            var103 = var1040;
            var1040 = var103 + var424 - 2 * (var103 & var424);
            var424 = 608906635;
            var103 = -159793887;
            var1040 = (var103 | var424) & ~(var103 & var424);
            var424 = -770609189;
            var103 = var1040;
            var71.a(
               c("갓\uebec갊\uebe0", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ", var895, var958, var989, (var103 | var424) - (var103 & var424)),
               var73
            );
            var424 = 1920161017;
            var103 = 623662981;
            int var812 = var103 + var424 - 2 * (var103 & var424);
            var424 = 1252130452;
            var103 = var812;
            int var813 = (var103 | var424) - (var103 & var424);
            var856 = (int)8456075460474721183L;
            var424 = -772312715;
            var103 = var856;
            var856 = var103 + var424 - 2 * (var103 & var424);
            var424 = -292189377;
            var103 = var856;
            var424 = (var103 | var424) & (~var103 | ~var424);
            var103 = var813;
            int var814 = (var103 ^ var424) + 2 * (var103 & var424);
            var856 = (int)-2334070715707508233L;
            var424 = 523019987;
            var103 = var856;
            var856 = (var103 | var424) - (var103 & var424);
            var424 = 202864255;
            var103 = var856;
            var856 = (var103 | var424) - (var103 & var424);
            var895 = (int)3278683073757170067L;
            var424 = -1413354395;
            var103 = var895;
            var895 = (var103 | var424) & (~var103 | ~var424);
            var424 = 329161262;
            var103 = var895;
            var895 = var103 & ~var424 | ~var103 & var424;
            var895 = (int)-5806108505530886768L;
            var424 = 954138595;
            var103 = var895;
            var895 = (var103 | var424) & (~var103 | ~var424);
            var424 = -2098638112;
            var103 = var895;
            var895 = var103 & ~var424 | ~var103 & var424;
            var424 = 206587778;
            var103 = 344735475;
            var989 = var103 & ~var424 | ~var103 & var424;
            var424 = 417102199;
            var103 = var989;
            var989 = var103 & ~var424 | ~var103 & var424;
            var424 = -1607130412;
            var103 = -905338991;
            var989 = var103 & ~var424 | ~var103 & var424;
            var424 = 1782365512;
            var103 = var989;
            var989 = (var103 | var424) & ~(var103 & var424);
            var989 = (int)2426122079037018297L;
            var424 = -1187191816;
            var103 = var989;
            var989 = var103 + var424 - 2 * (var103 & var424);
            var424 = -2021182641;
            var103 = var989;
            var989 = (var103 | var424) & ~(var103 & var424);
            var424 = -1112599612;
            var103 = 2035751758;
            var958 = (var103 | var424) & (~var103 | ~var424);
            var424 = -1599587214;
            var103 = var958;
            var958 = var103 + var424 - 2 * (var103 & var424);
            var424 = 1489477759;
            var103 = 380569671;
            var1040 = var103 + var424 - 2 * (var103 & var424);
            var424 = 1315481654;
            var103 = var1040;
            var1040 = (var103 | var424) - (var103 & var424);
            var424 = -1668051861;
            var103 = 1862664364;
            var1040 = (var103 | var424) & ~(var103 & var424);
            var424 = -208302897;
            var103 = var1040;
            var1040 = var103 + var424 - 2 * (var103 & var424);
            var424 = -1514141366;
            var103 = 750362695;
            var1040 = (var103 | var424) & (~var103 | ~var424);
            var424 = -1988515572;
            var103 = var1040;
            var1040 = var103 & ~var424 | ~var103 & var424;
            var424 = 658199213;
            var103 = 1023243271;
            var989 = var103 + var424 - 2 * (var103 & var424);
            var424 = 17090895;
            var103 = var989;
            var989 = (var103 | var424) & (~var103 | ~var424);
            var424 = 616948693;
            var103 = 1074814908;
            var1040 = (var103 | var424) & ~(var103 & var424);
            var424 = 316599674;
            var103 = var1040;
            var1040 = var103 & ~var424 | ~var103 & var424;
            var424 = 468612980;
            var103 = 1330613853;
            int var1099 = var103 & ~var424 | ~var103 & var424;
            var424 = 1425627107;
            var103 = var1099;
            var424 = var103 + var424 - 2 * (var103 & var424);
            var103 = var1040;
            var1040 = (var103 & ~var424) + (var424 & ~var103) + 2 * (var103 & var424);
            var424 = 898127385;
            var103 = 286617826;
            var1040 = var103 + var424 - 2 * (var103 & var424);
            var424 = 614547850;
            var103 = var1040;
            var71.a(
               c("갔珦강珠갂珫갴珬객珠", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ", var895, var958, var989, (var103 | var424) & (~var103 | ~var424)),
               (float)c.getWindow().getFramebufferWidth(),
               (float)c.getWindow().getFramebufferHeight()
            );
            int var815 = (int)-7017770446856076473L;
            var424 = -1951445586;
            var103 = var815;
            int var816 = (var103 | var424) & (~var103 | ~var424);
            var424 = 1800223766;
            var103 = var816;
            int var817 = ((var103 | var424) & ~(var103 & var424)) * ((var103 | var424) & ~(var103 & var424));
            String var864 = "cfv";
            String var907 = "cfw";
            var424 = -1575299609;
            var103 = -431890430;
            var895 = (var103 | var424) & ~(var103 & var424);
            var424 = 1981386102;
            var103 = var895;
            var895 = (var103 | var424) - (var103 & var424);
            String var962 = "cfx";
            var958 = (int)8640299930274344572L;
            var424 = -695641192;
            var103 = var958;
            var958 = (var103 | var424) - (var103 & var424);
            var424 = -1843512163;
            var103 = var958;
            var958 = var103 + var424 - 2 * (var103 & var424);
            var989 = (int)3351964046889438035L;
            var424 = 1921590777;
            var103 = var989;
            var989 = var103 + var424 - 2 * (var103 & var424);
            var424 = 331567337;
            var103 = var989;
            var989 = (var103 + var424 - 2 * (var103 & var424)) * (var103 + var424 - 2 * (var103 & var424));
            var424 = -553822083;
            var103 = -1750418063;
            var989 = var103 + var424 - 2 * (var103 & var424);
            var424 = 1406017261;
            var103 = var989;
            var989 = var103 + var424 - 2 * (var103 & var424);
            var424 = -1024710199;
            var103 = 1529588991;
            var1040 = (var103 | var424) & ~(var103 & var424);
            var424 = 45541460;
            var103 = var1040;
            var1040 = (var103 | var424) & (~var103 | ~var424);
            var1040 = (int)7924930764615386620L;
            var424 = -1319833689;
            var103 = var1040;
            var1040 = (var103 | var424) - (var103 & var424);
            var424 = 1728909737;
            var103 = var1040;
            var10001 = c(
               "갅\uef67갔\uef63갤\uef69갋\uef69강",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ",
               var895,
               var958,
               var989,
               (var103 | var424) & (~var103 | ~var424)
            );
            float var865 = var7.getRed();
            var895 = (int)590704882250982427L;
            var424 = 1922031458;
            var103 = var895;
            var895 = (var103 | var424) & ~(var103 & var424);
            var424 = 1010312327;
            var103 = var895;
            var895 = (var103 | var424) & (~var103 | ~var424);
            float var866 = var865 / 255.0F;
            float var913 = var7.getGreen();
            var424 = 633849820;
            var103 = -1608201048;
            var989 = var103 + var424 - 2 * (var103 & var424);
            var424 = -2048717977;
            var103 = var989;
            var989 = (var103 | var424) & ~(var103 & var424);
            float var914 = var913 / 255.0F;
            float var966 = var7.getBlue();
            String var1009 = "cfy";
            var71.a(var10001, var866, var914, var966 / 255.0F, 1.0F);
            var424 = 1799183791;
            var103 = 769669926;
            var856 = (var103 | var424) & ~(var103 & var424);
            var424 = 1188914843;
            var103 = var856;
            var856 = var103 & ~var424 | ~var103 & var424;
            var856 = (int)5509452515100347962L;
            var424 = 96223231;
            var103 = var856;
            var856 = (var103 | var424) & (~var103 | ~var424);
            var424 = 1087140299;
            var103 = var856;
            var856 = (var103 | var424) - (var103 & var424);
            var424 = 2015303169;
            var103 = -414253664;
            var856 = var103 + var424 - 2 * (var103 & var424);
            var424 = -1622021210;
            var103 = var856;
            var856 = (var103 | var424) & ~(var103 & var424);
            var856 = (int)-8033834462168090300L;
            var424 = -277714796;
            var103 = var856;
            var856 = var103 + var424 - 2 * (var103 & var424);
            var424 = -983592511;
            var103 = var856;
            var856 = (var103 | var424) - (var103 & var424);
            var424 = -2131957487;
            var103 = -1536766096;
            var856 = (var103 | var424) & (~var103 | ~var424);
            var424 = 568464889;
            var103 = var856;
            var856 = var103 + var424 - 2 * (var103 & var424);
            var895 = (int)-6440946990619745165L;
            var424 = -1497791548;
            var103 = var895;
            var895 = var103 & ~var424 | ~var103 & var424;
            var424 = 405279428;
            var103 = var895;
            var424 = var103 + var424 - 2 * (var103 & var424);
            var103 = var856;
            var856 = (var103 | var424) + (var103 & var424);
            var424 = -905083661;
            var103 = 1200294054;
            var895 = (var103 | var424) & (~var103 | ~var424);
            var424 = 751734651;
            var103 = var895;
            var895 = var103 & ~var424 | ~var103 & var424;
            var895 = (int)-4989367052619059320L;
            var424 = 2091309416;
            var103 = var895;
            var895 = var103 + var424 - 2 * (var103 & var424);
            var424 = -125956493;
            var103 = var895;
            var895 = var103 + var424 - 2 * (var103 & var424);
            var989 = (int)4027343739535064277L;
            var424 = 566094610;
            var103 = var989;
            var989 = var103 & ~var424 | ~var103 & var424;
            var424 = 920426445;
            var103 = var989;
            var989 = (var103 | var424) - (var103 & var424);
            var424 = 477377521;
            var103 = 58536866;
            var958 = var103 + var424 - 2 * (var103 & var424);
            var424 = 2070635739;
            var103 = var958;
            var958 = var103 & ~var424 | ~var103 & var424;
            var424 = -1538252316;
            var103 = -1720190155;
            var989 = (var103 | var424) & ~(var103 & var424);
            var424 = -735068542;
            var103 = var989;
            var989 = ((var103 | var424) - (var103 & var424)) * ((var103 | var424) - (var103 & var424));
            var424 = 1317628819;
            var103 = 779634194;
            var989 = var103 + var424 - 2 * (var103 & var424);
            var424 = 2092218340;
            var103 = var989;
            var989 = (var103 | var424) & ~(var103 & var424);
            var424 = -216959530;
            var103 = 1495985178;
            var1040 = (var103 | var424) & (~var103 | ~var424);
            var424 = -2091443359;
            var103 = var1040;
            var1040 = ((var103 | var424) - (var103 & var424)) * ((var103 | var424) - (var103 & var424));
            var424 = -1555823243;
            var103 = -343162740;
            var1040 = var103 & ~var424 | ~var103 & var424;
            var424 = 1216434936;
            var103 = var1040;
            var10001 = c("갆莙갗莝갆", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ", var895, var958, var989, var103 + var424 - 2 * (var103 & var424));
            var424 = -1625611749;
            var103 = -820829706;
            var895 = (var103 | var424) & ~(var103 & var424);
            var424 = -664921665;
            var103 = var895;
            var895 = var103 & ~var424 | ~var103 & var424;
            var424 = 1758590168;
            var103 = -1999515524;
            var958 = var103 & ~var424 | ~var103 & var424;
            var424 = 2144499350;
            var103 = var958;
            var424 = (var103 | var424) & ~(var103 & var424);
            var103 = var895;
            var895 = (var103 | var424) + (var103 & var424);
            var71.a(var10001, var3 * 0.85F);
         }

         Matrix4f var72 = var5.peek().getPositionMatrix();
         var424 = -1194945856;
         var103 = -1186138850;
         int var760 = var103 + var424 - 2 * (var103 & var424);
         var424 = 25847774;
         var103 = var760;

         for (int var74 = (var103 | var424) & (~var103 | ~var424); var74 < var9; var74++) {
            float var820 = var25 * var74;
            var424 = 248730561;
            var103 = -243643214;
            int var925 = var103 + var424 - 2 * (var103 & var424);
            var424 = -5693582;
            var103 = var925;
            var424 = (var103 | var424) & (~var103 | ~var424);
            var103 = var9;
            float var75 = var26 + var820 / (2 * (var103 & ~var424) - (var103 ^ var424));
            float var76 = (float)(var4.y + var75);
            float var761 = Math.abs(var74 - var23);
            String var880 = "cfz";
            float var77 = var761 / Math.max(var23, 0.001F);
            var925 = (int)2500464884256935232L;
            var424 = -485895823;
            var103 = var925;
            var925 = (var103 | var424) - (var103 & var424);
            var424 = -1938760672;
            var103 = var925;
            var925 = var103 & ~var424 | ~var103 & var424;
            var424 = -1755046143;
            var103 = 809411326;
            var925 = (var103 | var424) - (var103 & var424);
            var424 = -1487225356;
            var103 = var925;
            var925 = (var103 | var424) & (~var103 | ~var424);
            var424 = -908696857;
            var103 = -2023678578;
            var925 = (var103 | var424) & ~(var103 & var424);
            var424 = 1320648553;
            var103 = var925;
            var925 = var103 + var424 - 2 * (var103 & var424);
            float var78 = 1.0F - var77 * 0.3F;
            float var79 = var20 * var78;
            var424 = 1051210477;
            var103 = -2082428084;
            int var821 = (var103 | var424) - (var103 & var424);
            var424 = -1119315551;
            var103 = var821;
            int var822 = (var103 | var424) & ~(var103 & var424);
            var424 = 1170069281;
            var103 = 378954653;
            int var823 = var103 & ~var424 | ~var103 & var424;
            var424 = 1395373245;
            var103 = var823;
            int var824 = (var103 | var424) - (var103 & var424);
            var743 = 360.0 / var8;
            var10001 = "cga";
            var743 /= 2.0;
            var424 = 471799870;
            var103 = -700089029;
            int var881 = var103 + var424 - 2 * (var103 & var424);
            var424 = -900045561;
            var103 = var881;
            double var80 = var743 * (var74 % (var103 & ~var424 | ~var103 & var424));
            var424 = 856413461;
            var103 = -389391159;
            int var764 = (var103 | var424) & (~var103 | ~var424);
            var424 = -608073252;
            var103 = var764;

            for (int var81 = (var103 | var424) & ~(var103 & var424); var81 < var8; var81++) {
               var743 = var14 + var80;
               var424 = -407910924;
               var103 = -615412689;
               int var882 = var103 + var424 - 2 * (var103 & var424);
               var424 = 1023298001;
               var103 = var882;
               int var883 = var103 & ~var424 | ~var103 & var424;
               double var37 = Math.toRadians(var743 + 360.0 * var81 / var8);
               float var82 = (float)(var13.x + var79 * Math.cos(var37));
               float var40 = (float)(var13.z + var79 * Math.sin(var37));
               double var83 = var13.x - var82;
               double var85 = var13.y - var76;
               double var87 = var13.z - var40;
               double var47 = Math.sqrt(var83 * var83 + var85 * var85 + var87 * var87);
               var83 /= var47;
               var85 /= var47;
               var87 /= var47;
               double var49 = 0.0;
               double var51 = 1.0;
               double var53 = 0.0;
               double var55 = var85 * var53 - var87 * var51;
               double var57 = var87 * var49 - var83 * var53;
               double var59 = var83 * var51 - var85 * var49;
               double var61 = Math.sqrt(var55 * var55 + var57 * var57 + var59 * var59);
               var10001 = "cgb";
               if (var61 > 0.001) {
                  var55 /= var61;
                  var57 /= var61;
                  var59 /= var61;
               }

               var49 = var57 * var87 - var59 * var85;
               var51 = var59 * var83 - var55 * var87;
               var53 = var55 * var85 - var57 * var83;
               var424 = -2044038204;
               var103 = 1897966767;
               int var827 = var103 + var424 - 2 * (var103 & var424);
               var424 = -1949285371;
               var103 = var827;
               int var828 = (var103 | var424) & ~(var103 & var424);
               int var63 = (int)(var3 * 220.0F);
               String var64 = var70;
               int var766 = (int)-9168457137366935401L;
               var424 = -1950456191;
               var103 = var766;
               int var767 = var103 & ~var424 | ~var103 & var424;
               var424 = 278446569;
               var103 = var767;
               int var65 = var103 + var424 - 2 * (var103 & var424);
               switch (var64.hashCode()) {
                  case -327492349:
                     var424 = 306800984;
                     var103 = -1676523785;
                     int var832 = var103 & ~var424 | ~var103 & var424;
                     var424 = -976354821;
                     var103 = var832;
                     int var833 = (var103 & ~var424 | ~var103 & var424) * (var103 & ~var424 | ~var103 & var424);
                     int var887 = (int)1840689574561675418L;
                     var424 = 628568043;
                     var103 = var887;
                     int var888 = (var103 | var424) & (~var103 | ~var424);
                     var424 = 1659207876;
                     var103 = var888;
                     int var889 = ((var103 | var424) & (~var103 | ~var424)) * ((var103 | var424) & (~var103 | ~var424));
                     var424 = -1172072027;
                     var103 = 287465562;
                     var925 = var103 & ~var424 | ~var103 & var424;
                     var424 = -201654434;
                     var103 = var925;
                     var925 = (var103 | var424) & (~var103 | ~var424);
                     var424 = -1266690627;
                     var103 = -22552962;
                     int var979 = (var103 | var424) & ~(var103 & var424);
                     var424 = 1971743158;
                     var103 = var979;
                     var424 = (var103 | var424) & (~var103 | ~var424);
                     var103 = var925;
                     var925 = 2 * (var103 | var424) - (var103 ^ var424);
                     var424 = -162037234;
                     var103 = -1414320633;
                     var925 = (var103 | var424) & ~(var103 & var424);
                     var424 = 1873155226;
                     var103 = var925;
                     var925 = (var103 | var424) - (var103 & var424);
                     var424 = 1120347241;
                     var103 = 1486843796;
                     int var1026 = (var103 | var424) - (var103 & var424);
                     var424 = 441994229;
                     var103 = var1026;
                     var1026 = (var103 | var424) & (~var103 | ~var424);
                     var1026 = (int)-5969762343274939972L;
                     var424 = -614535475;
                     var103 = var1026;
                     var1026 = (var103 | var424) & ~(var103 & var424);
                     var424 = -53930122;
                     var103 = var1026;
                     var1026 = (var103 | var424) & ~(var103 & var424);
                     var1026 = (int)-7216583603360948423L;
                     var424 = -1017011466;
                     var103 = var1026;
                     var1026 = var103 + var424 - 2 * (var103 & var424);
                     var424 = 1721941441;
                     var103 = var1026;
                     var1026 = var103 + var424 - 2 * (var103 & var424);
                     var979 = (int)1085449089717548535L;
                     var424 = 1215697531;
                     var103 = var979;
                     var979 = (var103 | var424) - (var103 & var424);
                     var424 = 441118326;
                     var103 = var979;
                     var979 = var103 & ~var424 | ~var103 & var424;
                     int var1091 = (int)8269116512770826213L;
                     var424 = 1861970080;
                     var103 = var1091;
                     var1091 = (var103 | var424) & (~var103 | ~var424);
                     var424 = 1895757645;
                     var103 = var1091;
                     var1091 = (var103 | var424) & ~(var103 & var424);
                     var424 = 1763077877;
                     var103 = -2133635204;
                     var1026 = (var103 | var424) - (var103 & var424);
                     var424 = -443250894;
                     var103 = var1026;
                     var1026 = var103 & ~var424 | ~var103 & var424;
                     var1091 = (int)5554318437961340521L;
                     var424 = 1134565129;
                     var103 = var1091;
                     var1091 = (var103 | var424) & ~(var103 & var424);
                     var424 = 1445647290;
                     var103 = var1091;
                     var1091 = var103 + var424 - 2 * (var103 & var424);
                     var1091 = (int)832371552391705441L;
                     var424 = 1584319481;
                     var103 = var1091;
                     var1091 = var103 & ~var424 | ~var103 & var424;
                     var424 = 324404459;
                     var103 = var1091;
                     if (var64.equals(
                        c("ꡆ泅ꠧ沲ꡜ沽ꡟ", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ", var925, var979, var1026, (var103 | var424) & (~var103 | ~var424))
                     )) {
                        var424 = 1069334489;
                        var103 = 977882298;
                        int var772 = (var103 | var424) & ~(var103 & var424);
                        var424 = 100004707;
                        var103 = var772;
                        var65 = (var103 | var424) & ~(var103 & var424);
                        int var773 = (int)2541926204283136622L;
                        var424 = 1169457790;
                        var103 = var773;
                        int var774 = (var103 | var424) & (~var103 | ~var424);
                        var424 = -247611072;
                        var103 = var774;
                        int var775 = var103 + var424 - 2 * (var103 & var424);
                        var424 = 1962517062;
                        var103 = -1616676137;
                        int var834 = (var103 | var424) & ~(var103 & var424);
                        var424 = -987552930;
                        var103 = var834;
                        var424 = var103 + var424 - 2 * (var103 & var424);
                        var103 = var775;
                        int var776 = (var103 ^ var424) + 2 * (var103 & var424);
                        var424 = -1376855488;
                        var103 = -1830469319;
                        int var777 = (var103 | var424) & (~var103 | ~var424);
                        var424 = 966311284;
                        var103 = var777;
                        int var95 = (var103 | var424) & ~(var103 & var424);
                        a = var95;
                        var424 = -1579773853;
                        var103 = -1847914684;
                        int var778 = var103 + var424 - 2 * (var103 & var424);
                        var424 = -1893257738;
                        var103 = var778;
                        int var779 = (var103 | var424) - (var103 & var424);
                        int var780 = (int)-9151013411416224807L;
                        var424 = 1974143627;
                        var103 = var780;
                        int var781 = (var103 | var424) & ~(var103 & var424);
                        var424 = 1914549258;
                        var103 = var781;
                        if (((var103 | var424) & ~(var103 & var424)) < a) {
                           var424 = -776679539;
                           var103 = -2055273303;
                           int var782 = (var103 | var424) & (~var103 | ~var424);
                           var424 = 1422641956;
                           var103 = var782;
                           int var783 = var103 + var424 - 2 * (var103 & var424);
                           var424 = -2087682400;
                           var103 = -2143695976;
                           int var835 = (var103 | var424) & (~var103 | ~var424);
                           var424 = 61453624;
                           var103 = var835;
                           int var784 = var783 / (var103 & ~var424 | ~var103 & var424);
                        }
                     }
                     break;
                  case 32363363:
                     var424 = -1949574664;
                     var103 = 1507908827;
                     int var830 = (var103 | var424) - (var103 & var424);
                     var424 = -986656374;
                     var103 = var830;
                     int var831 = (var103 & ~var424 | ~var103 & var424) * (var103 & ~var424 | ~var103 & var424);
                     var925 = (int)6533437919704128328L;
                     var424 = 1430023901;
                     var103 = var925;
                     var925 = (var103 | var424) & ~(var103 & var424);
                     var424 = 1261729174;
                     var103 = var925;
                     var925 = (var103 | var424) & ~(var103 & var424);
                     var925 = (int)-527946923387373531L;
                     var424 = -1503150434;
                     var103 = var925;
                     var925 = (var103 | var424) & ~(var103 & var424);
                     var424 = -1520728386;
                     var103 = var925;
                     var925 = var103 + var424 - 2 * (var103 & var424);
                     var424 = -1261615593;
                     var103 = -733170588;
                     var925 = var103 + var424 - 2 * (var103 & var424);
                     var424 = 1619128954;
                     var103 = var925;
                     var925 = var103 + var424 - 2 * (var103 & var424);
                     var424 = 1158110;
                     var103 = -553348512;
                     var925 = (var103 | var424) & ~(var103 & var424);
                     var424 = -1010695027;
                     var103 = var925;
                     var925 = ((var103 | var424) & (~var103 | ~var424)) * ((var103 | var424) & (~var103 | ~var424));
                     var925 = (int)-5614649619288706032L;
                     var424 = -1187229398;
                     var103 = var925;
                     var925 = var103 & ~var424 | ~var103 & var424;
                     var424 = -880976471;
                     var103 = var925;
                     var925 = var103 + var424 - 2 * (var103 & var424);
                     String var975 = "cge";
                     int var976 = (int)111975378346040465L;
                     var424 = -1355140924;
                     var103 = var976;
                     int var977 = (var103 | var424) & ~(var103 & var424);
                     var424 = -1560555708;
                     var103 = var977;
                     int var978 = var103 + var424 - 2 * (var103 & var424);
                     var424 = 1164094858;
                     var103 = -2114614680;
                     int var1078 = (var103 | var424) & ~(var103 & var424);
                     var424 = -996726815;
                     var103 = var1078;
                     var1078 = (var103 | var424) - (var103 & var424);
                     var424 = -1483195795;
                     var103 = 1244667551;
                     var1078 = var103 & ~var424 | ~var103 & var424;
                     var424 = -307747598;
                     var103 = var1078;
                     var1078 = (var103 | var424) & (~var103 | ~var424);
                     var424 = 1460342536;
                     var103 = 2083350557;
                     var1078 = (var103 | var424) - (var103 & var424);
                     var424 = 723937046;
                     var103 = var1078;
                     var1078 = var103 & ~var424 | ~var103 & var424;
                     var1078 = (int)6139664625294029931L;
                     var424 = 1080836425;
                     var103 = var1078;
                     var1078 = var103 & ~var424 | ~var103 & var424;
                     var424 = -960301780;
                     var103 = var1078;
                     var1078 = var103 & ~var424 | ~var103 & var424;
                     int var1023 = (int)7234469495065373507L;
                     var424 = 304755234;
                     var103 = var1023;
                     var1023 = (var103 | var424) - (var103 & var424);
                     var424 = 458522644;
                     var103 = var1023;
                     var1023 = var103 + var424 - 2 * (var103 & var424);
                     var1078 = (int)-2184486916191318718L;
                     var424 = 788799732;
                     var103 = var1078;
                     var1078 = (var103 | var424) - (var103 & var424);
                     var424 = 4240573;
                     var103 = var1078;
                     var1078 = (var103 + var424 - 2 * (var103 & var424)) * (var103 + var424 - 2 * (var103 & var424));
                     var424 = 1001263225;
                     var103 = -640587168;
                     var1078 = var103 + var424 - 2 * (var103 & var424);
                     var424 = -496160877;
                     var103 = var1078;
                     if (var64.equals(
                        c("\ua87d䔽ꡖ䔵", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ", var925, var978, var1023, var103 & ~var424 | ~var103 & var424)
                     )) {
                        int var770 = (int)8118051221521623922L;
                        var424 = 1204913287;
                        var103 = var770;
                        int var771 = (var103 | var424) & (~var103 | ~var424);
                        var424 = 1491693559;
                        var103 = var771;
                        var65 = var103 + var424 - 2 * (var103 & var424);
                     }
                     break;
                  case 1008667288:
                     var10001 = "cgc";
                     var424 = -1823783005;
                     var103 = -1258817671;
                     int var884 = (var103 | var424) & ~(var103 & var424);
                     var424 = 610610074;
                     var103 = var884;
                     int var885 = var103 & ~var424 | ~var103 & var424;
                     var424 = -1845131384;
                     var103 = -1745995486;
                     var925 = (var103 | var424) - (var103 & var424);
                     var424 = -435282529;
                     var103 = var925;
                     var424 = (var103 | var424) & (~var103 | ~var424);
                     var103 = var885;
                     int var886 = 2 * (var103 | var424) - (var103 ^ var424);
                     String var934 = "cgd";
                     var925 = (int)-3986814198059426070L;
                     var424 = 595953047;
                     var103 = var925;
                     var925 = var103 + var424 - 2 * (var103 & var424);
                     var424 = 854074350;
                     var103 = var925;
                     var925 = (var103 | var424) & (~var103 | ~var424);
                     int var970 = (int)3071063930962796520L;
                     var424 = -1550725389;
                     var103 = var970;
                     var970 = (var103 | var424) & (~var103 | ~var424);
                     var424 = 1704622950;
                     var103 = var970;
                     var970 = ((var103 | var424) & (~var103 | ~var424)) * ((var103 | var424) & (~var103 | ~var424));
                     var424 = 1192181031;
                     var103 = -1203954789;
                     var970 = (var103 | var424) - (var103 & var424);
                     var424 = -1691487370;
                     var103 = var970;
                     var970 = var103 + var424 - 2 * (var103 & var424);
                     int var1017 = (int)4108783804216585703L;
                     var424 = 1124081241;
                     var103 = var1017;
                     var1017 = var103 + var424 - 2 * (var103 & var424);
                     var424 = 539589312;
                     var103 = var1017;
                     var1017 = (var103 + var424 - 2 * (var103 & var424)) * (var103 + var424 - 2 * (var103 & var424));
                     var1017 = (int)-4373986071716064858L;
                     var424 = 397363005;
                     var103 = var1017;
                     var1017 = var103 + var424 - 2 * (var103 & var424);
                     var424 = -1718020354;
                     var103 = var1017;
                     var1017 = (var103 | var424) - (var103 & var424);
                     int var1074 = (int)-5987353019825232484L;
                     var424 = 939664304;
                     var103 = var1074;
                     var1074 = var103 + var424 - 2 * (var103 & var424);
                     var424 = 1929863000;
                     var103 = var1074;
                     var1074 = (var103 | var424) & (~var103 | ~var424);
                     var424 = -453803180;
                     var103 = 1870496604;
                     var1074 = var103 + var424 - 2 * (var103 & var424);
                     var424 = -1954412469;
                     var103 = var1074;
                     if (var64.equals(
                        c("ꡇᢉꡛᢆ꠬", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ", var925, var970, var1017, (var103 | var424) & ~(var103 & var424))
                     )) {
                        int var768 = (int)-7410425763309024083L;
                        var424 = -687852586;
                        var103 = var768;
                        int var769 = (var103 | var424) - (var103 & var424);
                        var424 = 277888890;
                        var103 = var769;
                        var65 = (var103 | var424) & (~var103 | ~var424);
                     }
               }

               switch (var65) {
                  case 0:
                     this.a(
                        var72, var6, var7, var21.isPresent(), var82, var76, var40, var83, var85, var87, var49, var51, var53, var55, var57, var59, var11, var63
                     );
                     break;
                  case 1:
                     this.b(
                        var72, var6, var7, var21.isPresent(), var82, var76, var40, var83, var85, var87, var49, var51, var53, var55, var57, var59, var11, var63
                     );
                     break;
                  case 2:
                     this.a(var72, var6, var7, var21.isPresent(), var82, var76, var40, var49, var51, var53, var55, var57, var59, var11, var63);
               }
            }
         }

         if (var21.isPresent()) {
            ((PulseShaderProgram)var21.get()).e();
         }

         var424 = -1333450693;
         var103 = -399486230;
         int var785 = (var103 | var424) - (var103 & var424);
         var424 = 1488288464;
         var103 = var785;
         RenderSystem.depthMask(pulse.Bool.from((var103 | var424) & (var103 & var424 ^ -1)));
         RenderSystem.enableCull();
         RenderSystem.disableBlend();
         var5.pop();
         return;
      }
   }

   private void a(
      Matrix4f var1,
      Vec3d var2,
      Color var3,
      boolean var4,
      float var5,
      float var6,
      float var7,
      double var8,
      double var10,
      double var12,
      double var14,
      double var16,
      double var18,
      double var20,
      double var22,
      double var24,
      float var26,
      int var27
   ) {
      double var10000 = var5;
      double var10001 = var8 * var26;
      String var10002 = "cgf";
      float var28 = (float)(var10000 + var10001 * 1.5 - var2.x);
      var10000 = var6;
      var10001 = var10 * var26;
      var10002 = "cgg";
      float var29 = (float)(var10000 + var10001 * 1.5 - var2.y);
      var10000 = var7;
      var10001 = var12 * var26;
      int var45 = -1080859039;
      int var44 = 688612906;
      int var54 = var44 & ~var45 | ~var44 & var45;
      var45 = -1324480192;
      var44 = var54;
      int var55 = ((var44 | var45) & ~(var44 & var45)) * ((var44 | var45) & ~(var44 & var45));
      float var30 = (float)(var10000 + var10001 * 1.5 - var2.z);
      String var52 = "cgh";
      float var31 = var26 * 0.5F;
      float var32 = (float)(var5 + var14 * var31 - var2.x);
      float var33 = (float)(var6 + var16 * var31 - var2.y);
      float var34 = (float)(var7 + var18 * var31 - var2.z);
      float var35 = (float)(var5 - var14 * var31 - var2.x);
      float var36 = (float)(var6 - var16 * var31 - var2.y);
      float var37 = (float)(var7 - var18 * var31 - var2.z);
      float var38 = (float)(var5 + var20 * var31 - var2.x);
      float var39 = (float)(var6 + var22 * var31 - var2.y);
      float var40 = (float)(var7 + var24 * var31 - var2.z);
      float var41 = (float)(var5 - var20 * var31 - var2.x);
      float var42 = (float)(var6 - var22 * var31 - var2.y);
      float var43 = (float)(var7 - var24 * var31 - var2.z);
      this.a(var1, var3, var4, var28, var29, var30, var32, var33, var34, var35, var36, var37, var38, var39, var40, var41, var42, var43, var27);
   }

   private void b(
      Matrix4f var1,
      Vec3d var2,
      Color var3,
      boolean var4,
      float var5,
      float var6,
      float var7,
      double var8,
      double var10,
      double var12,
      double var14,
      double var16,
      double var18,
      double var20,
      double var22,
      double var24,
      float var26,
      int var27
   ) {
      double var28 = var16 * var24 - var18 * var22;
      double var30 = var18 * var20 - var14 * var24;
      double var32 = var14 * var22 - var16 * var20;
      double var10000 = var5;
      double var10001 = var14 * var26;
      int var10002 = (int)5292120944132462063L;
      int var54 = -1893640929;
      int var53 = var10002;
      var10002 = var53 & ~var54 | ~var53 & var54;
      var54 = -1848251428;
      var53 = var10002;
      var10002 = (var53 & ~var54 | ~var53 & var54) * (var53 & ~var54 | ~var53 & var54);
      float var34 = (float)(var10000 + var10001 * 1.2 - var2.x);
      var10000 = var6;
      var10001 = var16 * var26;
      var10002 = (int)2738179143844192334L;
      var54 = -476734073;
      var53 = var10002;
      var10002 = (var53 | var54) & (~var53 | ~var54);
      var54 = -267133982;
      var53 = var10002;
      var10002 = ((var53 | var54) & ~(var53 & var54)) * ((var53 | var54) & ~(var53 & var54));
      float var35 = (float)(var10000 + var10001 * 1.2 - var2.y);
      var10000 = var7;
      var10001 = var18 * var26;
      var54 = -558608337;
      var53 = -1639286823;
      var10002 = var53 + var54 - 2 * (var53 & var54);
      var54 = -950718791;
      var53 = var10002;
      var10002 = var53 + var54 - 2 * (var53 & var54);
      float var36 = (float)(var10000 + var10001 * 1.2 - var2.z);
      var10000 = var5;
      var10001 = var14 * var26;
      int var10003 = (int)-4478906696232476545L;
      var54 = -37439888;
      var53 = var10003;
      var10003 = var53 + var54 - 2 * (var53 & var54);
      var54 = -248162810;
      var53 = var10003;
      var10003 = (var53 | var54) & (~var53 | ~var54);
      float var37 = (float)(var10000 - var10001 * 1.2 - var2.x);
      var10000 = var6;
      var10001 = var16 * var26;
      var54 = 1334527142;
      var53 = 1255003359;
      var10002 = (var53 | var54) & ~(var53 & var54);
      var54 = 413707269;
      var53 = var10002;
      var10002 = var53 + var54 - 2 * (var53 & var54);
      var54 = 1583560761;
      var53 = 465841160;
      var10003 = (var53 | var54) & ~(var53 & var54);
      var54 = 1628369709;
      var53 = var10003;
      var54 = (var53 | var54) - (var53 & var54);
      var53 = var10002;
      var10002 = (var53 ^ var54) + 2 * (var53 & var54);
      float var38 = (float)(var10000 - var10001 * 1.2 - var2.y);
      var10000 = var7;
      var10001 = var18 * var26;
      var10003 = (int)-8607093217697221685L;
      var54 = -1203191604;
      var53 = var10003;
      var10003 = (var53 | var54) & (~var53 | ~var54);
      var54 = -1707904252;
      var53 = var10003;
      var10003 = (var53 | var54) & (~var53 | ~var54);
      var54 = 1166462989;
      var53 = -1966390348;
      var10003 = (var53 | var54) & ~(var53 & var54);
      var54 = -816999496;
      var53 = var10003;
      var10003 = (var53 | var54) & (~var53 | ~var54);
      var10003 = (int)-1445541634568265658L;
      var54 = 338788401;
      var53 = var10003;
      var10003 = (var53 | var54) & (~var53 | ~var54);
      var54 = -541794181;
      var53 = var10003;
      var10003 = (var53 | var54) - (var53 & var54);
      var10003 = (int)2582080247466808493L;
      var54 = -1233978110;
      var53 = var10003;
      var10003 = var53 + var54 - 2 * (var53 & var54);
      var54 = 1304242596;
      var53 = var10003;
      var10003 = (var53 | var54) & (~var53 | ~var54);
      float var39 = (float)(var10000 - var10001 * 1.2 - var2.z);
      int var115 = (int)6786783968527255764L;
      var54 = -1064813576;
      var53 = var115;
      int var116 = (var53 | var54) & (~var53 | ~var54);
      var54 = 165113211;
      var53 = var116;
      int var117 = var53 & ~var54 | ~var53 & var54;
      var54 = -2070668473;
      var53 = -582886919;
      var10002 = var53 & ~var54 | ~var53 & var54;
      var54 = -653618538;
      var53 = var10002;
      var54 = (var53 | var54) & ~(var53 & var54);
      var53 = var117;
      int var118 = (var53 | var54) + (var53 & var54);
      float var40 = var26 * 0.6F;
      float var41 = (float)(var5 + var20 * var40 + var28 * var40 - var2.x);
      float var42 = (float)(var6 + var22 * var40 + var30 * var40 - var2.y);
      float var43 = (float)(var7 + var24 * var40 + var32 * var40 - var2.z);
      float var44 = (float)(var5 + var20 * var40 - var28 * var40 - var2.x);
      float var45 = (float)(var6 + var22 * var40 - var30 * var40 - var2.y);
      float var46 = (float)(var7 + var24 * var40 - var32 * var40 - var2.z);
      float var47 = (float)(var5 - var20 * var40 - var28 * var40 - var2.x);
      float var48 = (float)(var6 - var22 * var40 - var30 * var40 - var2.y);
      float var49 = (float)(var7 - var24 * var40 - var32 * var40 - var2.z);
      float var50 = (float)(var5 - var20 * var40 + var28 * var40 - var2.x);
      float var51 = (float)(var6 - var22 * var40 + var30 * var40 - var2.y);
      float var52 = (float)(var7 - var24 * var40 + var32 * var40 - var2.z);
      this.a(var1, var3, var4, var34, var35, var36, var41, var42, var43, var44, var45, var46, var27);
      this.a(var1, var3, var4, var34, var35, var36, var44, var45, var46, var47, var48, var49, var27);
      this.a(var1, var3, var4, var34, var35, var36, var47, var48, var49, var50, var51, var52, var27);
      this.a(var1, var3, var4, var34, var35, var36, var50, var51, var52, var41, var42, var43, var27);
      this.a(var1, var3, var4, var37, var38, var39, var44, var45, var46, var41, var42, var43, var27);
      this.a(var1, var3, var4, var37, var38, var39, var47, var48, var49, var44, var45, var46, var27);
      this.a(var1, var3, var4, var37, var38, var39, var50, var51, var52, var47, var48, var49, var27);
      this.a(var1, var3, var4, var37, var38, var39, var41, var42, var43, var50, var51, var52, var27);
   }

   private void a(
      Matrix4f var1,
      Vec3d var2,
      Color var3,
      boolean var4,
      float var5,
      float var6,
      float var7,
      double var8,
      double var10,
      double var12,
      double var14,
      double var16,
      double var18,
      float var20,
      int var21
   ) {
      int var10001 = (int)-7546465747573481323L;
      int var39 = 890475688;
      int var38 = var10001;
      var10001 = (var38 | var39) & (~var38 | ~var39);
      var39 = -112657607;
      var38 = var10001;
      var10001 = (var38 | var39) & ~(var38 & var39);
      var39 = 1933383366;
      var38 = 1545834179;
      int var10002 = (var38 | var39) - (var38 & var39);
      var39 = -1358497013;
      var38 = var10002;
      var39 = var38 + var39 - 2 * (var38 & var39);
      var38 = var10001;
      var10001 = var38 - ~var39 - 1;
      float var22 = var20 * 0.5F;
      double var23 = var10 * var18 - var12 * var16;
      double var25 = var12 * var14 - var8 * var18;
      double var27 = var8 * var16 - var10 * var14;
      int var10000 = (int)161975817528151560L;
      var39 = 1537843708;
      var38 = var10000;
      var10000 = (var38 | var39) & ~(var38 & var39);
      var39 = -2108575748;
      var38 = var10000;
      var10000 = (var38 | var39) & ~(var38 & var39);
      var10001 = (int)6495684746729449907L;
      var39 = -511737297;
      var38 = var10001;
      var10001 = var38 & ~var39 | ~var38 & var39;
      var39 = 1824844703;
      var38 = var10001;
      float[][] var29 = new float[var10000][(var38 | var39) & ~(var38 & var39)];
      var10000 = (int)-4347364434099712923L;
      var39 = 817899825;
      var38 = var10000;
      var10000 = var38 + var39 - 2 * (var38 & var39);
      var39 = -1399724716;
      var38 = var10000;
      int var30 = var38 + var39 - 2 * (var38 & var39);
      var39 = -1159369039;
      var38 = 1383816413;
      var10000 = (var38 | var39) & (~var38 | ~var39);
      var39 = 392285587;
      var38 = var10000;
      int var31 = (var38 | var39) & ~(var38 & var39);

      while (true) {
         var39 = 387242942;
         var38 = -1336931877;
         var10001 = (var38 | var39) & (~var38 | ~var39);
         var39 = -1488661916;
         var38 = var10001;
         if (var31 > var38 + var39 - 2 * (var38 & var39)) {
            var10000 = (int)-4660569921542858851L;
            var39 = -745220595;
            var38 = var10000;
            var10000 = (var38 | var39) & (~var38 | ~var39);
            var39 = -1945796202;
            var38 = var10000;
            int[][] var522 = new int[var38 & ~var39 | ~var38 & var39][];
            var10002 = (int)2848256798672308786L;
            var39 = 144107604;
            var38 = var10002;
            var10002 = (var38 | var39) - (var38 & var39);
            var39 = -1318935962;
            var38 = var10002;
            var10002 = var38 & ~var39 | ~var38 & var39;
            var39 = 1301962342;
            var38 = -230762612;
            int var10003 = var38 & ~var39 | ~var38 & var39;
            var39 = -1079735826;
            var38 = var10003;
            int[] var559 = new int[var38 + var39 - 2 * (var38 & var39)];
            int var10005 = (int)-2496691509651949289L;
            var39 = 1286797436;
            var38 = var10005;
            var10005 = (var38 | var39) - (var38 & var39);
            var39 = -2117811861;
            var38 = var10005;
            var10005 = (var38 | var39) & ~(var38 & var39);
            int var10006 = (int)4556748372692514021L;
            var39 = 744190898;
            var38 = var10006;
            var10006 = var38 + var39 - 2 * (var38 & var39);
            var39 = -1183430825;
            var38 = var10006;
            var559[var10005] = (var38 | var39) & ~(var38 & var39);
            var10005 = (int)3447199727665198051L;
            var39 = -461101312;
            var38 = var10005;
            var10005 = (var38 | var39) & (~var38 | ~var39);
            var39 = -2117430046;
            var38 = var10005;
            var10005 = (var38 | var39) - (var38 & var39);
            var39 = -419151918;
            var38 = 466186700;
            var10006 = var38 & ~var39 | ~var38 & var39;
            var39 = -53653985;
            var38 = var10006;
            var559[var10005] = var38 & ~var39 | ~var38 & var39;
            var39 = -1060044777;
            var38 = 464422478;
            var10005 = (var38 | var39) - (var38 & var39);
            var39 = -612399525;
            var38 = var10005;
            var10005 = (var38 | var39) - (var38 & var39);
            var39 = -1801409165;
            var38 = -1947480048;
            var10006 = var38 & ~var39 | ~var38 & var39;
            var39 = 525040992;
            var38 = var10006;
            var559[var10005] = (var38 | var39) & (~var38 | ~var39);
            var10005 = (int)-4145952147331848095L;
            var39 = 1791851708;
            var38 = var10005;
            var10005 = (var38 | var39) - (var38 & var39);
            var39 = -1874258722;
            var38 = var10005;
            var10005 = (var38 | var39) & (~var38 | ~var39);
            var10006 = (int)-7844811605867649728L;
            var39 = -1242025253;
            var38 = var10006;
            var10006 = var38 & ~var39 | ~var38 & var39;
            var39 = -1013082215;
            var38 = var10006;
            var559[var10005] = (var38 | var39) - (var38 & var39);
            var522[var10002] = var559;
            var10002 = (int)8572555580772430861L;
            var39 = 1598042626;
            var38 = var10002;
            var10002 = (var38 | var39) - (var38 & var39);
            var39 = -25459186;
            var38 = var10002;
            var10002 = (var38 | var39) - (var38 & var39);
            var10003 = (int)2307408959111716138L;
            var39 = -1187107914;
            var38 = var10003;
            var10003 = var38 & ~var39 | ~var38 & var39;
            var39 = -1504282984;
            var38 = var10003;
            int[] var562 = new int[var38 + var39 - 2 * (var38 & var39)];
            var10005 = (int)6202906229858384624L;
            var39 = 1511028478;
            var38 = var10005;
            var10005 = (var38 | var39) - (var38 & var39);
            var39 = 1607748622;
            var38 = var10005;
            var10005 = (var38 | var39) - (var38 & var39);
            var10006 = (int)2832581737616874295L;
            var39 = 1733958700;
            var38 = var10006;
            var10006 = (var38 | var39) & (~var38 | ~var39);
            var39 = 1286833951;
            var38 = var10006;
            var562[var10005] = (var38 | var39) & ~(var38 & var39);
            var10005 = (int)3714274918852987978L;
            var39 = 1707990973;
            var38 = var10005;
            var10005 = var38 + var39 - 2 * (var38 & var39);
            var39 = 1974326262;
            var38 = var10005;
            var10005 = (var38 | var39) - (var38 & var39);
            var39 = -577530657;
            var38 = -1463927877;
            var10006 = (var38 | var39) & ~(var38 & var39);
            var39 = 1965928290;
            var38 = var10006;
            var562[var10005] = (var38 | var39) & ~(var38 & var39);
            var10005 = (int)-956322651164310196L;
            var39 = 1019207699;
            var38 = var10005;
            var10005 = var38 + var39 - 2 * (var38 & var39);
            var39 = -1441864355;
            var38 = var10005;
            var10005 = (var38 | var39) - (var38 & var39);
            var10006 = (int)4413690918093941692L;
            var39 = -1441071664;
            var38 = var10006;
            var10006 = (var38 | var39) & ~(var38 & var39);
            var39 = -213805461;
            var38 = var10006;
            var562[var10005] = var38 & ~var39 | ~var38 & var39;
            var10005 = (int)3510770540399977818L;
            var39 = 811960100;
            var38 = var10005;
            var10005 = (var38 | var39) - (var38 & var39);
            var39 = -1810374019;
            var38 = var10005;
            var10005 = (var38 | var39) - (var38 & var39);
            var39 = -763898226;
            var38 = 1757092259;
            var10006 = (var38 | var39) & (~var38 | ~var39);
            var39 = -1160982744;
            var38 = var10006;
            var562[var10005] = (var38 | var39) - (var38 & var39);
            var522[var10002] = var562;
            var39 = -1012430173;
            var38 = -1742656623;
            var10002 = (var38 | var39) & ~(var38 & var39);
            var39 = 1535549744;
            var38 = var10002;
            var10002 = (var38 | var39) & (~var38 | ~var39);
            var10003 = (int)-5344527967767786427L;
            var39 = -1229263033;
            var38 = var10003;
            var10003 = (var38 | var39) - (var38 & var39);
            var39 = -1951046906;
            var38 = var10003;
            int[] var565 = new int[(var38 | var39) & (~var38 | ~var39)];
            var39 = -545560458;
            var38 = -814589259;
            var10005 = (var38 | var39) & (~var38 | ~var39);
            var39 = 269038275;
            var38 = var10005;
            var10005 = (var38 | var39) - (var38 & var39);
            var10006 = (int)6571802930737536083L;
            var39 = -657223375;
            var38 = var10006;
            var10006 = var38 & ~var39 | ~var38 & var39;
            var39 = -1935094430;
            var38 = var10006;
            var565[var10005] = (var38 | var39) & (~var38 | ~var39);
            var39 = -1193066979;
            var38 = 2141180896;
            var10005 = var38 + var39 - 2 * (var38 & var39);
            var39 = -948113924;
            var38 = var10005;
            var10005 = (var38 | var39) - (var38 & var39);
            var39 = 2116737321;
            var38 = -1619080744;
            var10006 = (var38 | var39) - (var38 & var39);
            var39 = -514584331;
            var38 = var10006;
            var565[var10005] = (var38 | var39) & (~var38 | ~var39);
            var39 = -1860586327;
            var38 = -293273750;
            var10005 = (var38 | var39) & ~(var38 & var39);
            var39 = 2141014977;
            var38 = var10005;
            var10005 = (var38 | var39) & ~(var38 & var39);
            var39 = 865139910;
            var38 = -830067071;
            var10006 = var38 + var39 - 2 * (var38 & var39);
            var39 = -48836030;
            var38 = var10006;
            var565[var10005] = var38 + var39 - 2 * (var38 & var39);
            var39 = -123730409;
            var38 = -686017074;
            var10005 = var38 + var39 - 2 * (var38 & var39);
            var39 = 800863194;
            var38 = var10005;
            var10005 = var38 & ~var39 | ~var38 & var39;
            var10006 = (int)4187696804384782702L;
            var39 = -348206700;
            var38 = var10006;
            var10006 = var38 + var39 - 2 * (var38 & var39);
            var39 = -1889898245;
            var38 = var10006;
            var565[var10005] = var38 & ~var39 | ~var38 & var39;
            var522[var10002] = var565;
            var39 = -1651543697;
            var38 = -1659724282;
            var10002 = var38 + var39 - 2 * (var38 & var39);
            var39 = 10350442;
            var38 = var10002;
            var10002 = (var38 | var39) & (~var38 | ~var39);
            var10003 = (int)7389716535386647861L;
            var39 = -987458879;
            var38 = var10003;
            var10003 = var38 + var39 - 2 * (var38 & var39);
            var39 = -1616265232;
            var38 = var10003;
            int[] var568 = new int[(var38 | var39) - (var38 & var39)];
            var39 = -1130950438;
            var38 = 1368185456;
            var10005 = (var38 | var39) & (~var38 | ~var39);
            var39 = -316945750;
            var38 = var10005;
            var10005 = var38 & ~var39 | ~var38 & var39;
            var10006 = (int)-1361457104248390478L;
            var39 = -833456401;
            var38 = var10006;
            var10006 = var38 + var39 - 2 * (var38 & var39);
            var39 = -771372449;
            var38 = var10006;
            var568[var10005] = (var38 | var39) & ~(var38 & var39);
            var10005 = (int)1272881048635342267L;
            var39 = 672465343;
            var38 = var10005;
            var10005 = (var38 | var39) - (var38 & var39);
            var39 = -248939515;
            var38 = var10005;
            var10005 = (var38 | var39) & ~(var38 & var39);
            var10006 = (int)7240467740868760203L;
            var39 = -1269566934;
            var38 = var10006;
            var10006 = var38 & ~var39 | ~var38 & var39;
            var39 = -1032085342;
            var38 = var10006;
            var568[var10005] = var38 + var39 - 2 * (var38 & var39);
            var39 = -251651648;
            var38 = -91481217;
            var10005 = (var38 | var39) & ~(var38 & var39);
            var39 = 193725117;
            var38 = var10005;
            var10005 = (var38 | var39) & (~var38 | ~var39);
            var10006 = (int)6311654406057641354L;
            var39 = 765356507;
            var38 = var10006;
            var10006 = (var38 | var39) & ~(var38 & var39);
            var39 = -813290410;
            var38 = var10006;
            var568[var10005] = (var38 | var39) & (~var38 | ~var39);
            var10005 = (int)391159537240472658L;
            var39 = 1945901460;
            var38 = var10005;
            var10005 = var38 & ~var39 | ~var38 & var39;
            var39 = -1606064699;
            var38 = var10005;
            var10005 = (var38 | var39) & (~var38 | ~var39);
            var10006 = (int)4564599510288045859L;
            var39 = -792275587;
            var38 = var10006;
            var10006 = (var38 | var39) & (~var38 | ~var39);
            var39 = -798834088;
            var38 = var10006;
            var568[var10005] = var38 + var39 - 2 * (var38 & var39);
            var522[var10002] = var568;
            var10002 = (int)7931105676462741489L;
            var39 = 196638475;
            var38 = var10002;
            var10002 = var38 & ~var39 | ~var38 & var39;
            var39 = -2112020226;
            var38 = var10002;
            var10002 = var38 + var39 - 2 * (var38 & var39);
            var39 = -1559216261;
            var38 = -558982783;
            var10003 = (var38 | var39) & (~var38 | ~var39);
            var39 = 2109646590;
            var38 = var10003;
            int[] var570 = new int[(var38 | var39) & (~var38 | ~var39)];
            var10005 = (int)-1004006206832803240L;
            var39 = -340025096;
            var38 = var10005;
            var10005 = (var38 | var39) & ~(var38 & var39);
            var39 = 1254761120;
            var38 = var10005;
            var10005 = (var38 | var39) - (var38 & var39);
            var10006 = (int)4634322805963126432L;
            var39 = -321741210;
            var38 = var10006;
            var10006 = var38 + var39 - 2 * (var38 & var39);
            var39 = 591325382;
            var38 = var10006;
            var570[var10005] = var38 + var39 - 2 * (var38 & var39);
            var10005 = (int)-4140495057660024715L;
            var39 = -1518132428;
            var38 = var10005;
            var10005 = (var38 | var39) - (var38 & var39);
            var39 = 141216576;
            var38 = var10005;
            var10005 = (var38 | var39) - (var38 & var39);
            var10006 = (int)487221034562527343L;
            var39 = 1800159616;
            var38 = var10006;
            var10006 = var38 & ~var39 | ~var38 & var39;
            var39 = 2139021805;
            var38 = var10006;
            var570[var10005] = var38 + var39 - 2 * (var38 & var39);
            var10005 = (int)-5385893575429012620L;
            var39 = -105182756;
            var38 = var10005;
            var10005 = (var38 | var39) - (var38 & var39);
            var39 = -674903382;
            var38 = var10005;
            var10005 = (var38 | var39) & ~(var38 & var39);
            var39 = -1359051814;
            var38 = -1902176439;
            var10006 = (var38 | var39) & ~(var38 & var39);
            var39 = 543265941;
            var38 = var10006;
            var570[var10005] = (var38 | var39) & (~var38 | ~var39);
            var39 = 141876199;
            var38 = -835306102;
            var10005 = (var38 | var39) & (~var38 | ~var39);
            var39 = -968694162;
            var38 = var10005;
            var10005 = var38 & ~var39 | ~var38 & var39;
            var39 = 454655610;
            var38 = -1342870635;
            var10006 = (var38 | var39) & (~var38 | ~var39);
            var39 = -1259596309;
            var38 = var10006;
            var570[var10005] = (var38 | var39) & (~var38 | ~var39);
            var522[var10002] = var570;
            var39 = 1160366081;
            var38 = 1278007185;
            var10002 = var38 + var39 - 2 * (var38 & var39);
            var39 = 151330709;
            var38 = var10002;
            var10002 = (var38 | var39) & ~(var38 & var39);
            var39 = 2014427982;
            var38 = -114398489;
            var10003 = (var38 | var39) & (~var38 | ~var39);
            var39 = -2126523987;
            var38 = var10003;
            int[] var572 = new int[var38 + var39 - 2 * (var38 & var39)];
            var39 = -1858935927;
            var38 = 1682787075;
            var10005 = (var38 | var39) & ~(var38 & var39);
            var39 = -176183158;
            var38 = var10005;
            var10005 = (var38 | var39) & (~var38 | ~var39);
            var10006 = (int)7270626537949641931L;
            var39 = -652024099;
            var38 = var10006;
            var10006 = (var38 | var39) & ~(var38 & var39);
            var39 = 1076288023;
            var38 = var10006;
            var572[var10005] = var38 & ~var39 | ~var38 & var39;
            var10005 = (int)4503170934621517914L;
            var39 = 1498590139;
            var38 = var10005;
            var10005 = var38 & ~var39 | ~var38 & var39;
            var39 = 1772622816;
            var38 = var10005;
            var10005 = var38 & ~var39 | ~var38 & var39;
            var10006 = (int)1568284755352120863L;
            var39 = 452798124;
            var38 = var10006;
            var10006 = (var38 | var39) - (var38 & var39);
            var39 = 529615030;
            var38 = var10006;
            var572[var10005] = var38 + var39 - 2 * (var38 & var39);
            var10005 = (int)3328644218361674098L;
            var39 = -1792490227;
            var38 = var10005;
            var10005 = (var38 | var39) & ~(var38 & var39);
            var39 = 1311915133;
            var38 = var10005;
            var10005 = (var38 | var39) & ~(var38 & var39);
            var39 = 1117480669;
            var38 = -1689974649;
            var10006 = (var38 | var39) & ~(var38 & var39);
            var39 = -639734179;
            var38 = var10006;
            var572[var10005] = var38 & ~var39 | ~var38 & var39;
            var10005 = (int)906274713930344727L;
            var39 = -66147880;
            var38 = var10005;
            var10005 = var38 & ~var39 | ~var38 & var39;
            var39 = 78774476;
            var38 = var10005;
            var10005 = (var38 | var39) & ~(var38 & var39);
            var10006 = (int)-8615665642356527622L;
            var39 = -300108541;
            var38 = var10006;
            var10006 = (var38 | var39) - (var38 & var39);
            var39 = 366057722;
            var38 = var10006;
            var572[var10005] = var38 + var39 - 2 * (var38 & var39);
            var522[var10002] = var572;
            int[][] var40 = var522;
            int[][] var41 = var40;
            int var42 = var41.length;
            var10000 = (int)5059743675454138420L;
            var39 = 35876296;
            var38 = var10000;
            var10000 = (var38 | var39) - (var38 & var39);
            var39 = -1344649732;
            var38 = var10000;
            int var34 = (var38 | var39) - (var38 & var39);

            while (var34 < var42) {
               int[] var35 = var41[var34];
               var10006 = (int)9111107585909860935L;
               var39 = 1197440617;
               var38 = var10006;
               var10006 = var38 + var39 - 2 * (var38 & var39);
               var39 = -405187538;
               var38 = var10006;
               float[] var10004 = var29[var35[(var38 | var39) - (var38 & var39)]];
               var10005 = (int)-4062364597334485053L;
               var39 = 1103101809;
               var38 = var10005;
               var10005 = (var38 | var39) - (var38 & var39);
               var39 = 1249814706;
               var38 = var10005;
               float var573 = var10004[(var38 | var39) & ~(var38 & var39)];
               int var10007 = (int)-4302726392371547248L;
               var39 = -529776702;
               var38 = var10007;
               var10007 = (var38 | var39) & ~(var38 & var39);
               var39 = 2022886482;
               var38 = var10007;
               float[] var640 = var29[var35[(var38 | var39) - (var38 & var39)]];
               var39 = 473855136;
               var38 = -1379473780;
               var10006 = var38 + var39 - 2 * (var38 & var39);
               var39 = -1309109715;
               var38 = var10006;
               float var641 = var640[(var38 | var39) & ~(var38 & var39)];
               var39 = -260910612;
               var38 = -1114378419;
               int var10008 = (var38 | var39) & ~(var38 & var39);
               var39 = 1306607265;
               var38 = var10008;
               float[] var686 = var29[var35[(var38 | var39) & ~(var38 & var39)]];
               var39 = -1183848259;
               var38 = 1535783467;
               var10007 = var38 & ~var39 | ~var38 & var39;
               var39 = -488252780;
               var38 = var10007;
               float var687 = var686[(var38 | var39) & ~(var38 & var39)];
               var39 = -399271224;
               var38 = -87146347;
               int var10009 = var38 + var39 - 2 * (var38 & var39);
               var39 = 318626396;
               var38 = var10009;
               float[] var694 = var29[var35[var38 + var39 - 2 * (var38 & var39)]];
               var39 = -1326256290;
               var38 = 754197946;
               var10008 = (var38 | var39) & (~var38 | ~var39);
               var39 = -1677276444;
               var38 = var10008;
               float var695 = var694[var38 + var39 - 2 * (var38 & var39)];
               var39 = 675069244;
               var38 = -401940706;
               int var10010 = (var38 | var39) & (~var38 | ~var39);
               var39 = -1070177757;
               var38 = var10010;
               float[] var703 = var29[var35[var38 + var39 - 2 * (var38 & var39)]];
               var39 = 1199190530;
               var38 = -1907518517;
               var10009 = (var38 | var39) & ~(var38 & var39);
               var39 = -919100984;
               var38 = var10009;
               float var704 = var703[(var38 | var39) - (var38 & var39)];
               var39 = -1590193396;
               var38 = 1454050970;
               int var10011 = var38 & ~var39 | ~var38 & var39;
               var39 = -140730985;
               var38 = var10011;
               float[] var712 = var29[var35[var38 + var39 - 2 * (var38 & var39)]];
               var10010 = (int)2140003757587717002L;
               var39 = 1373437695;
               var38 = var10010;
               var10010 = var38 & ~var39 | ~var38 & var39;
               var39 = 483960183;
               var38 = var10010;
               float var713 = var712[var38 + var39 - 2 * (var38 & var39)];
               int var10012 = (int)5440477492389567911L;
               var39 = -119632115;
               var38 = var10012;
               var10012 = var38 & ~var39 | ~var38 & var39;
               var39 = -1363291480;
               var38 = var10012;
               float[] var720 = var29[var35[(var38 | var39) & ~(var38 & var39)]];
               var39 = -2064169415;
               var38 = -891719871;
               var10011 = (var38 | var39) & (~var38 | ~var39);
               var39 = 1311648120;
               var38 = var10011;
               float var721 = var720[(var38 | var39) & ~(var38 & var39)];
               int var10013 = (int)-264018563058344735L;
               var39 = 120751785;
               var38 = var10013;
               var10013 = (var38 | var39) & ~(var38 & var39);
               var39 = 33479242;
               var38 = var10013;
               float[] var729 = var29[var35[(var38 | var39) & ~(var38 & var39)]];
               var10012 = (int)-8721530057331376112L;
               var39 = 1069255366;
               var38 = var10012;
               var10012 = (var38 | var39) & ~(var38 & var39);
               var39 = 627346135;
               var38 = var10012;
               float var730 = var729[(var38 | var39) - (var38 & var39)];
               var39 = -1937023988;
               var38 = -1553859842;
               int var10014 = (var38 | var39) & ~(var38 & var39);
               var39 = 803907312;
               var38 = var10014;
               float[] var739 = var29[var35[(var38 | var39) & (~var38 | ~var39)]];
               var10013 = (int)-1545573706856026477L;
               var39 = -335796192;
               var38 = var10013;
               var10013 = (var38 | var39) & ~(var38 & var39);
               var39 = -279607631;
               var38 = var10013;
               this.a(var1, var3, var4, var573, var641, var687, var695, var704, var713, var721, var730, var739[(var38 | var39) & ~(var38 & var39)], var21);
               var39 = 452473997;
               var38 = 2133830800;
               var10006 = (var38 | var39) & ~(var38 & var39);
               var39 = 1708627997;
               var38 = var10006;
               var10004 = var29[var35[(var38 | var39) - (var38 & var39)]];
               var39 = 1196162766;
               var38 = 501790648;
               var10005 = var38 & ~var39 | ~var38 & var39;
               var39 = 1520650614;
               var38 = var10005;
               float var575 = var10004[(var38 | var39) & ~(var38 & var39)];
               var10007 = (int)4935385313480469329L;
               var39 = 1505006404;
               var38 = var10007;
               var10007 = (var38 | var39) & (~var38 | ~var39);
               var39 = 1847228437;
               var38 = var10007;
               float[] var643 = var29[var35[(var38 | var39) & (~var38 | ~var39)]];
               var39 = 2000626710;
               var38 = 2059973974;
               var10006 = (var38 | var39) & (~var38 | ~var39);
               var39 = 234328385;
               var38 = var10006;
               float var644 = var643[(var38 | var39) & (~var38 | ~var39)];
               var10008 = (int)-3260426447639241087L;
               var39 = 224166749;
               var38 = var10008;
               var10008 = var38 & ~var39 | ~var38 & var39;
               var39 = -1854923300;
               var38 = var10008;
               float[] var690 = var29[var35[(var38 | var39) & (~var38 | ~var39)]];
               var10007 = (int)2820008852415640649L;
               var39 = -1925401586;
               var38 = var10007;
               var10007 = (var38 | var39) & (~var38 | ~var39);
               var39 = -1165213627;
               var38 = var10007;
               float var691 = var690[var38 + var39 - 2 * (var38 & var39)];
               var39 = -239557029;
               var38 = -1797483718;
               var10009 = var38 + var39 - 2 * (var38 & var39);
               var39 = 1701066083;
               var38 = var10009;
               float[] var700 = var29[var35[(var38 | var39) & ~(var38 & var39)]];
               var10008 = (int)-2722248146572403393L;
               var39 = -1169923912;
               var38 = var10008;
               var10008 = (var38 | var39) - (var38 & var39);
               var39 = 1666350471;
               var38 = var10008;
               float var701 = var700[var38 & ~var39 | ~var38 & var39];
               var10010 = (int)8286077483444497961L;
               var39 = -779820235;
               var38 = var10010;
               var10010 = var38 + var39 - 2 * (var38 & var39);
               var39 = 127307038;
               var38 = var10010;
               float[] var709 = var29[var35[(var38 | var39) & (~var38 | ~var39)]];
               var39 = 59627547;
               var38 = -1084660088;
               var10009 = var38 & ~var39 | ~var38 & var39;
               var39 = -1126908270;
               var38 = var10009;
               float var710 = var709[var38 + var39 - 2 * (var38 & var39)];
               var10011 = (int)-7536307711890132076L;
               var39 = -1274569158;
               var38 = var10011;
               var10011 = (var38 | var39) & ~(var38 & var39);
               var39 = 516418988;
               var38 = var10011;
               float[] var716 = var29[var35[var38 & ~var39 | ~var38 & var39]];
               var10010 = (int)8191004073748396300L;
               var39 = -1620893913;
               var38 = var10010;
               var10010 = var38 + var39 - 2 * (var38 & var39);
               var39 = 921691689;
               var38 = var10010;
               float var717 = var716[(var38 | var39) & ~(var38 & var39)];
               var39 = -289098581;
               var38 = -415564966;
               var10012 = var38 & ~var39 | ~var38 & var39;
               var39 = 167661554;
               var38 = var10012;
               float[] var726 = var29[var35[(var38 | var39) & ~(var38 & var39)]];
               var39 = 2039133297;
               var38 = -4187382;
               var10011 = (var38 | var39) - (var38 & var39);
               var39 = -2041925765;
               var38 = var10011;
               float var727 = var726[var38 & ~var39 | ~var38 & var39];
               var10013 = (int)2390434332276432665L;
               var39 = 746122597;
               var38 = var10013;
               var10013 = (var38 | var39) & (~var38 | ~var39);
               var39 = 507835007;
               var38 = var10013;
               float[] var734 = var29[var35[var38 + var39 - 2 * (var38 & var39)]];
               var10012 = (int)5099288219132838552L;
               var39 = -1400432509;
               var38 = var10012;
               var10012 = var38 & ~var39 | ~var38 & var39;
               var39 = -1875355110;
               var38 = var10012;
               float var735 = var734[(var38 | var39) & ~(var38 & var39)];
               var10014 = (int)5867660592833474120L;
               var39 = 2111701382;
               var38 = var10014;
               var10014 = var38 + var39 - 2 * (var38 & var39);
               var39 = -272912435;
               var38 = var10014;
               float[] var743 = var29[var35[(var38 | var39) - (var38 & var39)]];
               var39 = 885753289;
               var38 = -253566853;
               var10013 = (var38 | var39) & ~(var38 & var39);
               var39 = -1003919952;
               var38 = var10013;
               this.a(var1, var3, var4, var575, var644, var691, var701, var710, var717, var727, var735, var743[var38 + var39 - 2 * (var38 & var39)], var21);
               var34++;
               if (a != a) {
                  var39 = 479738556;
                  var38 = 518161154;
                  var10000 = var38 + var39 - 2 * (var38 & var39);
                  var39 = 296709674;
                  var38 = var10000;
                  var10000 = (var38 | var39) & ~(var38 & var39);
                  var39 = -1242938117;
                  var38 = -386051509;
                  var10000 = var38 & ~var39 | ~var38 & var39;
                  var39 = 374125190;
                  var38 = var10000;
                  int var37 = (var38 | var39) & (~var38 | ~var39);
                  a = var37;
               }
            }

            return;
         }

         var39 = 1794402671;
         var38 = 1675347932;
         var10000 = var38 + var39 - 2 * (var38 & var39);
         var39 = -154119860;
         var38 = var10000;
         int var32 = (var38 | var39) & ~(var38 & var39);

         while (true) {
            var10001 = (int)4967238232598868312L;
            var39 = -1468216107;
            var38 = var10001;
            var10001 = var38 + var39 - 2 * (var38 & var39);
            var39 = 1220001164;
            var38 = var10001;
            if (var32 > var38 + var39 - 2 * (var38 & var39)) {
               var31 += 2;
               break;
            }

            var39 = -1581030921;
            var38 = -1237668698;
            var10000 = var38 + var39 - 2 * (var38 & var39);
            var39 = -402246994;
            var38 = var10000;
            int var33 = (var38 | var39) - (var38 & var39);

            while (true) {
               var39 = 2115936913;
               var38 = 634600654;
               var10001 = (var38 | var39) & ~(var38 & var39);
               var39 = 1540202078;
               var38 = var10001;
               if (var33 > var38 + var39 - 2 * (var38 & var39)) {
                  if (a != a) {
                     var39 = 1391070290;
                     var38 = 159725007;
                     var10000 = (var38 | var39) & ~(var38 & var39);
                     var39 = 1534015901;
                     var38 = var10000;
                     var10000 = (var38 | var39) - (var38 & var39);
                     var39 = -699941752;
                     var38 = 2081118841;
                     var10001 = (var38 | var39) & ~(var38 & var39);
                     var39 = -1437800719;
                     var38 = var10001;
                     var10000 /= (var38 | var39) & ~(var38 & var39);
                  }

                  var32 += 2;
                  break;
               }

               float[] var514 = var29[var30];
               var10001 = (int)7081816060144938829L;
               var39 = -1982348228;
               var38 = var10001;
               var10001 = (var38 | var39) - (var38 & var39);
               var39 = 206547825;
               var38 = var10001;
               var514[(var38 | var39) & (~var38 | ~var39)] = (float)(
                  var5 + var8 * var22 * var31 + var14 * var22 * var32 + var23 * var22 * var33 - var2.x
               );
               float[] var515 = var29[var30];
               var10001 = (int)-4366994885542588578L;
               var39 = 21252750;
               var38 = var10001;
               var10001 = (var38 | var39) - (var38 & var39);
               var39 = -166918703;
               var38 = var10001;
               var515[var38 + var39 - 2 * (var38 & var39)] = (float)(
                  var6 + var10 * var22 * var31 + var16 * var22 * var32 + var25 * var22 * var33 - var2.y
               );
               float[] var516 = var29[var30];
               var10001 = (int)-8182534199854998453L;
               var39 = 650012599;
               var38 = var10001;
               var10001 = (var38 | var39) & (~var38 | ~var39);
               var39 = -1583989762;
               var38 = var10001;
               var516[(var38 | var39) & ~(var38 & var39)] = (float)(
                  var7 + var12 * var22 * var31 + var18 * var22 * var32 + var27 * var22 * var33 - var2.z
               );
               var30++;
               var33 += 2;
            }
         }
      }
   }

   private void a(
      Matrix4f var1,
      Color var2,
      boolean var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12,
      int var13
   ) {
      if (!var3) {
         Tessellator var14 = Tessellator.getInstance();
         BufferBuilder var15 = var14.begin(DrawMode.TRIANGLES, VertexFormats.POSITION_COLOR);
         var15.vertex(var1, var4, var5, var6).color(var2.getRed(), var2.getGreen(), var2.getBlue(), var13);
         VertexConsumer var10000 = var15.vertex(var1, var7, var8, var9);
         int var10001 = var2.getRed();
         int var10002 = var2.getGreen();
         int var10003 = var2.getBlue();
         int var19 = -368851530;
         int var18 = 39020238;
         int var10005 = var18 & ~var19 | ~var18 & var19;
         var19 = -397368453;
         var18 = var10005;
         int var10004 = var13 * ((var18 | var19) & (~var18 | ~var19));
         var10005 = (int)-3739942577995548333L;
         var19 = -1343241277;
         var18 = var10005;
         var10005 = (var18 | var19) & ~(var18 & var19);
         var19 = -103236972;
         var18 = var10005;
         var10000.color(var10001, var10002, var10003, var10004 / ((var18 | var19) & (~var18 | ~var19)));
         var10000 = var15.vertex(var1, var10, var11, var12);
         var10001 = var2.getRed();
         var10002 = var2.getGreen();
         var10003 = var2.getBlue();
         var19 = -2114371208;
         var18 = 868384533;
         var10005 = var18 + var19 - 2 * (var18 & var19);
         var19 = -1304740242;
         var18 = var10005;
         var10004 = var13 * (var18 + var19 - 2 * (var18 & var19));
         var19 = -1427382132;
         var18 = -1579019790;
         var10005 = (var18 | var19) & (~var18 | ~var19);
         var19 = 185201018;
         var18 = var10005;
         var10000.color(var10001, var10002, var10003, var10004 / ((var18 | var19) - (var18 & var19)));
         BufferRenderer.drawWithGlobalProgram(var15.end());
      } else {
         Vector4f var20 = var1.transform(new Vector4f(var4, var5, var6, 1.0F));
         Vector4f var21 = var1.transform(new Vector4f(var7, var8, var9, 1.0F));
         Vector4f var16 = var1.transform(new Vector4f(var10, var11, var12, 1.0F));
         int var70 = -1391387781;
         int var29 = 1331588906;
         int var105 = (var29 | var70) & (~var29 | ~var70);
         var70 = -498109346;
         var29 = var105;
         float[] var106 = new float[(var29 | var70) - (var29 & var70)];
         var70 = -815469511;
         var29 = 732358714;
         int var110 = var29 & ~var70 | ~var29 & var70;
         var70 = -457047037;
         var29 = var110;
         var106[(var29 | var70) & (~var29 | ~var70)] = var20.x;
         var70 = -632051753;
         var29 = -2068097151;
         var110 = (var29 | var70) & (~var29 | ~var70);
         var70 = 1592324183;
         var29 = var110;
         var106[var29 & ~var70 | ~var29 & var70] = var20.y;
         var70 = -398204270;
         var29 = -1225974986;
         var110 = (var29 | var70) & (~var29 | ~var70);
         var70 = 1588525478;
         var29 = var110;
         var106[(var29 | var70) & ~(var29 & var70)] = var20.z;
         var110 = (int)-2939009805506219925L;
         var70 = -1422455123;
         var29 = var110;
         var110 = (var29 | var70) & ~(var29 & var70);
         var70 = -329351483;
         var29 = var110;
         var110 = var29 & ~var70 | ~var29 & var70;
         String var134 = "cgi";
         var106[var110] = 0.5F;
         var110 = (int)-277417418528362191L;
         var70 = 1472514507;
         var29 = var110;
         var110 = var29 & ~var70 | ~var29 & var70;
         var70 = -1244088066;
         var29 = var110;
         var106[var29 + var70 - 2 * (var29 & var70)] = 0.0F;
         var110 = (int)-1217738880094737384L;
         var70 = 1619129005;
         var29 = var110;
         var110 = var29 & ~var70 | ~var29 & var70;
         var70 = -565928272;
         var29 = var110;
         var106[(var29 | var70) & (~var29 | ~var70)] = var21.x;
         var70 = 1197101785;
         var29 = -49693267;
         var110 = (var29 | var70) & ~(var29 & var70);
         var70 = -1168904334;
         var29 = var110;
         var106[(var29 | var70) - (var29 & var70)] = var21.y;
         var110 = (int)-3655800571428313463L;
         var70 = 369407064;
         var29 = var110;
         var110 = (var29 | var70) & (~var29 | ~var70);
         var70 = -195243306;
         var29 = var110;
         var106[(var29 | var70) & (~var29 | ~var70)] = var21.z;
         var110 = (int)-5846697225741276858L;
         var70 = 1022786028;
         var29 = var110;
         var110 = (var29 | var70) - (var29 & var70);
         var70 = -1835298654;
         var29 = var110;
         var106[var29 + var70 - 2 * (var29 & var70)] = 0.0F;
         var110 = (int)-696351807811589737L;
         var70 = -890768261;
         var29 = var110;
         var110 = (var29 | var70) & (~var29 | ~var70);
         var70 = -1437098523;
         var29 = var110;
         var106[var29 & ~var70 | ~var29 & var70] = 1.0F;
         var70 = -1245093367;
         var29 = 1795634236;
         var110 = var29 & ~var70 | ~var29 & var70;
         var70 = -556902849;
         var29 = var110;
         var106[(var29 | var70) - (var29 & var70)] = var16.x;
         var70 = 16881113;
         var29 = -1420149785;
         var110 = var29 & ~var70 | ~var29 & var70;
         var70 = -1436832203;
         var29 = var110;
         var106[var29 + var70 - 2 * (var29 & var70)] = var16.y;
         var70 = 2096276992;
         var29 = 1852476559;
         var110 = var29 & ~var70 | ~var29 & var70;
         var70 = 311962243;
         var29 = var110;
         var106[var29 & ~var70 | ~var29 & var70] = var16.z;
         var110 = (int)479013204479618175L;
         var70 = 1998517942;
         var29 = var110;
         var110 = var29 & ~var70 | ~var29 & var70;
         var70 = -1062970684;
         var29 = var110;
         var106[(var29 | var70) - (var29 & var70)] = 1.0F;
         var70 = -196507938;
         var29 = -2095435122;
         var110 = (var29 | var70) & (~var29 | ~var70);
         var70 = 2001974366;
         var29 = var110;
         var106[(var29 | var70) & (~var29 | ~var70)] = 1.0F;
         float[] var17 = var106;
         var70 = -1057289792;
         var29 = -924381747;
         int var108 = (var29 | var70) - (var29 & var70);
         var70 = 136053774;
         var29 = var108;
         PulseShaderProgram.a(var17, var29 + var70 - 2 * (var29 & var70));
      }
   }

   private void a(
      Matrix4f var1,
      Color var2,
      boolean var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12,
      float var13,
      float var14,
      float var15,
      float var16,
      float var17,
      float var18,
      int var19
   ) {
      this.a(var1, var2, var3, var4, var5, var6, var7, var8, var9, var13, var14, var15, var19);
      this.a(var1, var2, var3, var4, var5, var6, var13, var14, var15, var10, var11, var12, var19);
      this.a(var1, var2, var3, var4, var5, var6, var10, var11, var12, var16, var17, var18, var19);
      this.a(var1, var2, var3, var4, var5, var6, var16, var17, var18, var7, var8, var9, var19);
   }

   private Color b(LivingEntity var1) {
      if (this.G.a()) {
         if (!this.H.a()) {
            int var10000 = (int)2234113587007494155L;
            int var11 = -1015485902;
            int var10 = var10000;
            var10000 = var10 & ~var11 | ~var10 & var11;
            var11 = 852381417;
            var10 = var10000;
            var10000 = var10 & ~var11 | ~var10 & var11;
            var11 = 1581981458;
            var10 = -2077627282;
            int var10001 = var10 + var11 - 2 * (var10 & var11);
            var11 = 1633873989;
            var10 = var10001;
            var11 = (var10 | var11) - (var10 & var11);
            var10 = var10000;
            var10000 = (var10 | var11) + (var10 & var11);
            var10000 = (int)765505603755958287L;
            var11 = -1705657054;
            var10 = var10000;
            var10000 = (var10 | var11) & ~(var10 & var11);
            var11 = -251508112;
            var10 = var10000;
            int var9 = var10 + var11 - 2 * (var10 & var11);
            a = var9;
            var11 = 987908874;
            var10 = -1258855474;
            var10000 = (var10 | var11) & ~(var10 & var11);
            var11 = 119487320;
            var10 = var10000;
            var10000 = (var10 | var11) & ~(var10 & var11);
            var11 = 1708734753;
            var10 = 389118712;
            var10001 = (var10 | var11) & (~var10 | ~var11);
            var11 = -435732327;
            var10 = var10001;
            var11 = var10 & ~var11 | ~var10 & var11;
            var10 = var10000;
            var10000 = (var10 | var11) + (var10 & var11);
            var11 = -523111202;
            var10 = -1188236227;
            var10000 = (var10 | var11) - (var10 & var11);
            var11 = 718799039;
            var10 = var10000;
            if ((var10 & ~var11 | ~var10 & var11) <= a) {
               var10000 = (int)-3166816323644484104L;
               var11 = 1684471253;
               var10 = var10000;
               var10000 = (var10 | var11) & (~var10 | ~var11);
               var11 = -478249399;
               var10 = var10000;
               var10000 = var10 & ~var11 | ~var10 & var11;
               var10000 = (int)-8157005461273234318L;
               var11 = 390635708;
               var10 = var10000;
               var10000 = var10 & ~var11 | ~var10 & var11;
               var11 = 485193389;
               var10 = var10000;
               var9 = var10 & ~var11 | ~var10 & var11;
            }
         } else if (var1 != null && var1.hurtTime > 0) {
            float var101 = var1.hurtTime;
            int var67 = -62541943;
            int var30 = -19107511;
            int var106 = var30 + var67 - 2 * (var30 & var67);
            var67 = -985949607;
            var30 = var106;
            var106 = var30 + var67 - 2 * (var30 & var67);
            int var10002 = (int)8399383593714272353L;
            var67 = -1520351667;
            var30 = var10002;
            var10002 = var30 & ~var67 | ~var30 & var67;
            var67 = -1447727695;
            var30 = var10002;
            var67 = (var30 | var67) - (var30 & var67);
            var30 = var106;
            var106 = 2 * (var30 | var67) - (var30 ^ var67);
            float var2 = var101 / 10.0F;
            Color var3 = this.n();
            Color var4 = this.I.a();
            var101 = var3.getRed();
            var106 = var4.getRed();
            var67 = var3.getRed();
            var30 = var106;
            int var5 = (int)(var101 + (var30 - var67) * var2);
            var101 = var3.getGreen();
            var106 = var4.getGreen();
            var67 = var3.getGreen();
            var30 = var106;
            int var6 = (int)(var101 + (2 * (var30 & ~var67) - (var30 ^ var67)) * var2);
            var101 = var3.getBlue();
            var106 = var4.getBlue();
            var67 = var3.getBlue();
            var30 = var106;
            int var7 = (int)(var101 + (var30 - var67) * var2);
            var67 = -142801026;
            var30 = -1516952126;
            var10002 = var30 & ~var67 | ~var30 & var67;
            var67 = 1390944956;
            var30 = var10002;
            var10002 = var30 & ~var67 | ~var30 & var67;
            var67 = -935853780;
            var30 = 717631465;
            int var10003 = (var30 | var67) - (var30 & var67);
            var67 = -486658502;
            var30 = var10003;
            var10002 = Math.max(var10002, Math.min((var30 | var67) & (~var30 | ~var67), var5));
            var10003 = (int)-6568286339024950948L;
            var67 = 1983048226;
            var30 = var10003;
            var10003 = var30 + var67 - 2 * (var30 & var67);
            var67 = -1922104450;
            var30 = var10003;
            var10003 = (var30 | var67) & (~var30 | ~var67);
            var67 = 250028872;
            var30 = 1025341873;
            int var10004 = (var30 | var67) & (~var30 | ~var67);
            var67 = 872045062;
            var30 = var10004;
            var10003 = Math.max(var10003, Math.min((var30 | var67) & ~(var30 & var67), var6));
            var67 = -940795191;
            var30 = -370788037;
            var10004 = (var30 | var67) & ~(var30 & var67);
            var67 = 772449266;
            var30 = var10004;
            var10004 = (var30 | var67) & (~var30 | ~var67);
            int var10005 = (int)-3432380656107372739L;
            var67 = 1107627724;
            var30 = var10005;
            var10005 = (var30 | var67) - (var30 & var67);
            var67 = -792121074;
            var30 = var10005;
            return new Color(var10002, var10003, Math.max(var10004, Math.min(var30 + var67 - 2 * (var30 & var67), var7)));
         }
      }

      return this.n();
   }

   private Color n() {
      if (!this.D.a()) {
         int var5 = -1568630147;
         int var4 = 1487959877;
         int var10000 = (var4 | var5) & ~(var4 & var5);
         var5 = 242710338;
         var4 = var10000;
         var10000 = (var4 & ~var5 | ~var4 & var5) * (var4 & ~var5 | ~var4 & var5);
         var10000 = (int)-7616656321141543499L;
         var5 = 1136811217;
         var4 = var10000;
         var10000 = var4 & ~var5 | ~var4 & var5;
         var5 = 243907136;
         var4 = var10000;
         int var3 = (var4 | var5) - (var4 & var5);
         a = var3;
         String var19 = "cgj";
         var10000 = (int)-7507550402159372546L;
         var5 = 1372295264;
         var4 = var10000;
         var10000 = var4 & ~var5 | ~var4 & var5;
         var5 = -2088730500;
         var4 = var10000;
         if ((var4 | var5) - (var4 & var5) < a) {
            throw new ExceptionInInitializerError();
         }
      } else {
         ClientColor var1 = ModuleRegistry.CLIENT_COLOR;
         if (var1 != null) {
            return var1.n();
         }
      }

      return this.E.a();
   }

   private float o() {
      String var1 = this.e.d();
      int var10000 = (int)4124444842036839927L;
      int var4 = 1730124674;
      int var3 = var10000;
      var10000 = (var3 | var4) & ~(var3 & var4);
      var4 = -777248374;
      var3 = var10000;
      int var2 = (var3 | var4) - (var3 & var4);
      switch (var1.hashCode()) {
         case -579872008:
            var4 = -718979902;
            var3 = -33272694;
            int var228 = (var3 | var4) & ~(var3 & var4);
            var4 = 723611719;
            var3 = var228;
            var228 = (var3 | var4) & ~(var3 & var4);
            var228 = (int)-99678004651136840L;
            var4 = 858675887;
            var3 = var228;
            var228 = var3 + var4 - 2 * (var3 & var4);
            var4 = 938947092;
            var3 = var228;
            var228 = var3 + var4 - 2 * (var3 & var4);
            var4 = -380806494;
            var3 = -171533525;
            var228 = var3 + var4 - 2 * (var3 & var4);
            var4 = -339554076;
            var3 = var228;
            var228 = (var3 & ~var4 | ~var3 & var4) * (var3 & ~var4 | ~var3 & var4);
            int var250 = (int)4581123953993190115L;
            var4 = 1116936118;
            var3 = var250;
            var250 = (var3 | var4) & (~var3 | ~var4);
            var4 = -1694105295;
            var3 = var250;
            var250 = (var3 | var4) - (var3 & var4);
            var4 = 178699710;
            var3 = -1772145172;
            var250 = (var3 | var4) - (var3 & var4);
            var4 = -1363463999;
            var3 = var250;
            var250 = (var3 | var4) & (~var3 | ~var4);
            int var267 = (int)-8269014685421371076L;
            var4 = -933692653;
            var3 = var267;
            var267 = var3 + var4 - 2 * (var3 & var4);
            var4 = -935817371;
            var3 = var267;
            var267 = (var3 | var4) & ~(var3 & var4);
            var267 = (int)1366001590004810458L;
            var4 = 1122570322;
            var3 = var267;
            var267 = (var3 | var4) & (~var3 | ~var4);
            var4 = -387547931;
            var3 = var267;
            var267 = var3 & ~var4 | ~var3 & var4;
            int var292 = (int)-1556181728632577209L;
            var4 = 840564981;
            var3 = var292;
            var292 = (var3 | var4) - (var3 & var4);
            var4 = -1237619967;
            var3 = var292;
            var292 = ((var3 | var4) - (var3 & var4)) * ((var3 | var4) - (var3 & var4));
            var292 = (int)7700330364968286375L;
            var4 = 1792961654;
            var3 = var292;
            var292 = var3 + var4 - 2 * (var3 & var4);
            var4 = 1472059240;
            var3 = var292;
            var292 = var3 + var4 - 2 * (var3 & var4);
            int var308 = (int)-3247849505966878377L;
            var4 = -1831933448;
            var3 = var308;
            var308 = var3 & ~var4 | ~var3 & var4;
            var4 = 865396902;
            var3 = var308;
            var308 = var3 + var4 - 2 * (var3 & var4);
            var4 = 67483172;
            var3 = -1909403964;
            var308 = (var3 | var4) & (~var3 | ~var4);
            var4 = -1977165702;
            var3 = var308;
            if (var1.equals(c("꧉뇨ꧣ뇮ꦓ뇪ꦑ뇢ꧩ", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ", var250, var267, var292, var3 & ~var4 | ~var3 & var4))) {
               var4 = 169786410;
               var3 = 325117677;
               var10000 = (var3 | var4) & (~var3 | ~var4);
               var4 = 427711173;
               var3 = var10000;
               var2 = (var3 | var4) & (~var3 | ~var4);
            }
            break;
         case 32361014:
            int var213 = (int)3677216549473578185L;
            var4 = 119986213;
            var3 = var213;
            var213 = var3 + var4 - 2 * (var3 & var4);
            var4 = -1757458843;
            var3 = var213;
            var213 = ((var3 | var4) & (~var3 | ~var4)) * ((var3 | var4) & (~var3 | ~var4));
            int var225 = (int)9155081086070685735L;
            var4 = 255477003;
            var3 = var225;
            var225 = (var3 | var4) & ~(var3 & var4);
            var4 = -1625618911;
            var3 = var225;
            var225 = var3 + var4 - 2 * (var3 & var4);
            var4 = 176033511;
            var3 = 796768918;
            int var246 = (var3 | var4) & (~var3 | ~var4);
            var4 = 1564887697;
            var3 = var246;
            var246 = ((var3 | var4) & ~(var3 & var4)) * ((var3 | var4) & ~(var3 & var4));
            var4 = 439153611;
            var3 = -2065033790;
            var246 = var3 & ~var4 | ~var3 & var4;
            var4 = -1400611174;
            var3 = var246;
            var246 = (var3 | var4) & ~(var3 & var4);
            var4 = 2142381852;
            var3 = -1248402601;
            int var262 = (var3 | var4) & (~var3 | ~var4);
            var4 = -2107360767;
            var3 = var262;
            var262 = ((var3 | var4) - (var3 & var4)) * ((var3 | var4) - (var3 & var4));
            var262 = (int)-1911786967830082044L;
            var4 = -1327615541;
            var3 = var262;
            var262 = (var3 | var4) - (var3 & var4);
            var4 = -1266980116;
            var3 = var262;
            var262 = (var3 | var4) - (var3 & var4);
            String var288 = "cgl";
            int var289 = (int)580883663589190997L;
            var4 = -1610373437;
            var3 = var289;
            int var290 = (var3 | var4) & ~(var3 & var4);
            var4 = -469091955;
            var3 = var290;
            int var291 = (var3 | var4) & ~(var3 & var4);
            String var306 = "cgm";
            var4 = 246765219;
            var3 = 1702419583;
            int var307 = (var3 | var4) & ~(var3 & var4);
            var4 = 1810746764;
            var3 = var307;
            if (var1.equals(c("꧉噐ꦐ嘣", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ", var246, var262, var291, var3 & ~var4 | ~var3 & var4))) {
               var4 = -1384024448;
               var3 = -245612414;
               var10000 = var3 + var4 - 2 * (var3 & var4);
               var4 = 1558001155;
               var3 = var10000;
               var2 = (var3 | var4) & (~var3 | ~var4);
            }
            break;
         case 1148183415:
            int var10001 = (int)-1408401236447692724L;
            var4 = 1336448882;
            var3 = var10001;
            var10001 = (var3 | var4) & ~(var3 & var4);
            var4 = -1660899896;
            var3 = var10001;
            var10001 = ((var3 | var4) & (~var3 | ~var4)) * ((var3 | var4) & (~var3 | ~var4));
            String var224 = "cgn";
            var4 = -45171338;
            var3 = 1094566433;
            int var240 = var3 & ~var4 | ~var3 & var4;
            var4 = -42470468;
            var3 = var240;
            var240 = (var3 | var4) - (var3 & var4);
            var4 = -390177242;
            var3 = -1937493798;
            int var258 = var3 & ~var4 | ~var3 & var4;
            var4 = 1530734062;
            var3 = var258;
            var4 = (var3 | var4) & ~(var3 & var4);
            var3 = var240;
            var240 = (var3 | var4) + (var3 & var4);
            var240 = (int)-6466469102891846854L;
            var4 = 1753409992;
            var3 = var240;
            var240 = (var3 | var4) & (~var3 | ~var4);
            var4 = -1042816415;
            var3 = var240;
            var240 = (var3 | var4) & ~(var3 & var4);
            String var259 = "cgo";
            var4 = 26715064;
            var3 = 2044043422;
            var258 = var3 + var4 - 2 * (var3 & var4);
            var4 = -1128421878;
            var3 = var258;
            var258 = var3 & ~var4 | ~var3 & var4;
            int var283 = (int)869529025104017456L;
            var4 = -2046311404;
            var3 = var283;
            var283 = (var3 | var4) - (var3 & var4);
            var4 = 1768315630;
            var3 = var283;
            var283 = ((var3 | var4) & (~var3 | ~var4)) * ((var3 | var4) & (~var3 | ~var4));
            var4 = -2096613795;
            var3 = -907328106;
            var283 = (var3 | var4) & ~(var3 & var4);
            var4 = 1188579954;
            var3 = var283;
            var283 = (var3 | var4) & (~var3 | ~var4);
            int var300 = (int)-6308042904584519559L;
            var4 = 181658258;
            var3 = var300;
            var300 = var3 + var4 - 2 * (var3 & var4);
            var4 = 1171115417;
            var3 = var300;
            var300 = var3 & ~var4 | ~var3 & var4;
            var4 = -391551677;
            var3 = 2021507254;
            int var10007 = var3 & ~var4 | ~var3 & var4;
            var4 = -949909832;
            var3 = var10007;
            var4 = (var3 | var4) & (~var3 | ~var4);
            var3 = var300;
            var300 = (var3 | var4) + (var3 & var4);
            var300 = (int)4282006898744774006L;
            var4 = 1729242815;
            var3 = var300;
            var300 = var3 & ~var4 | ~var3 & var4;
            var4 = 978893968;
            var3 = var300;
            if (var1.equals(c("꧍왙ꧢ옡ꦑ옩", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ", var240, var258, var283, (var3 | var4) & (~var3 | ~var4)))) {
               var10000 = (int)-1572163266223781846L;
               var4 = 1692404219;
               var3 = var10000;
               var10000 = (var3 | var4) & ~(var3 & var4);
               var4 = -1355791918;
               var3 = var10000;
               var2 = var3 & ~var4 | ~var3 & var4;
            }
            break;
         case 1539932654:
            int var10002 = (int)4942606639758253770L;
            var4 = 423396721;
            var3 = var10002;
            var10002 = (var3 | var4) & ~(var3 & var4);
            var4 = 1518050238;
            var3 = var10002;
            var10002 = var3 + var4 - 2 * (var3 & var4);
            var10002 = (int)-2938429842540821471L;
            var4 = 1313866745;
            var3 = var10002;
            var10002 = (var3 | var4) & (~var3 | ~var4);
            var4 = 597854161;
            var3 = var10002;
            var10002 = (var3 | var4) & (~var3 | ~var4);
            var10002 = (int)3429661605290008238L;
            var4 = -414679777;
            var3 = var10002;
            var10002 = var3 & ~var4 | ~var3 & var4;
            var4 = 506241350;
            var3 = var10002;
            var10002 = (var3 + var4 - 2 * (var3 & var4)) * (var3 + var4 - 2 * (var3 & var4));
            int var10003 = (int)-9026166204805175187L;
            var4 = 1230243073;
            var3 = var10003;
            var10003 = (var3 | var4) & ~(var3 & var4);
            var4 = 2078464864;
            var3 = var10003;
            var10003 = (var3 | var4) & (~var3 | ~var4);
            var4 = -425807704;
            var3 = -1276649205;
            int var10004 = var3 + var4 - 2 * (var3 & var4);
            var4 = -234527443;
            var3 = var10004;
            var4 = var3 + var4 - 2 * (var3 & var4);
            var3 = var10003;
            var10003 = (var3 ^ var4) + 2 * (var3 & var4);
            var4 = 636974223;
            var3 = 2028062767;
            var10003 = (var3 | var4) - (var3 & var4);
            var4 = 1867777075;
            var3 = var10003;
            var10003 = var3 & ~var4 | ~var3 & var4;
            int var10005 = (int)2765013384771769036L;
            var4 = -1471514921;
            var3 = var10005;
            var10005 = var3 + var4 - 2 * (var3 & var4);
            var4 = -1093671908;
            var3 = var10005;
            var10005 = var3 & ~var4 | ~var3 & var4;
            var4 = 1150675279;
            var3 = 815193637;
            var10005 = (var3 | var4) - (var3 & var4);
            var4 = 1946367846;
            var3 = var10005;
            var10005 = var3 & ~var4 | ~var3 & var4;
            var10005 = (int)-3417547714655688454L;
            var4 = -179772353;
            var3 = var10005;
            var10005 = (var3 | var4) & (~var3 | ~var4);
            var4 = 364317909;
            var3 = var10005;
            var10005 = var3 & ~var4 | ~var3 & var4;
            var10004 = (int)4452800071718726594L;
            var4 = 1826197453;
            var3 = var10004;
            var10004 = (var3 | var4) & ~(var3 & var4);
            var4 = 1788049414;
            var3 = var10004;
            var10004 = var3 & ~var4 | ~var3 & var4;
            String var280 = "cgk";
            var4 = 1259752374;
            var3 = -1201970808;
            var10005 = var3 + var4 - 2 * (var3 & var4);
            var4 = -427243260;
            var3 = var10005;
            var10005 = (var3 | var4) & (~var3 | ~var4);
            var4 = 383700449;
            var3 = 28726576;
            int var10006 = var3 & ~var4 | ~var3 & var4;
            var4 = 1404588752;
            var3 = var10006;
            var10006 = var3 + var4 - 2 * (var3 & var4);
            var4 = -1457334996;
            var3 = -517247378;
            var10006 = var3 & ~var4 | ~var3 & var4;
            var4 = 1210119540;
            var3 = var10006;
            if (var1.equals(
               c("꧌弶ꧫ彁ꦓ彆ꧩ彎", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃sꟴ꒲ꁴꤑ絓蹹⑊謚㑸vꟳ꒹ꁴ", var10003, var10004, var10005, (var3 | var4) & ~(var3 & var4))
            )) {
               var10000 = (int)-4036285233320446020L;
               var4 = 966555755;
               var3 = var10000;
               var10000 = var3 + var4 - 2 * (var3 & var4);
               var4 = 509333463;
               var3 = var10000;
               var2 = var3 + var4 - 2 * (var3 & var4);
            }
      }

      switch (var2) {
         case 0:
            return this.g.a();
         case 1:
            return this.k.a();
         case 2:
            return this.m.a();
         case 3:
            return this.q.a();
         default:
            var10000 = (int)2685003988115724418L;
            var4 = -1171862739;
            var3 = var10000;
            var10000 = (var3 | var4) & ~(var3 & var4);
            var4 = 62195956;
            var3 = var10000;
            var10000 = (var3 | var4) & (~var3 | ~var4);
            return 1.5F;
      }
   }

   private float c(LivingEntity var1) {
      float var2 = this.o();
      if (this.G.a() && this.J.a() && var1 != null) {
         int var3 = var1.hurtTime;
         int var13 = 1331924574;
         int var12 = -102666891;
         int var10002 = (var12 | var13) - (var12 & var13);
         var13 = -1232936149;
         var12 = var10002;
         int var4 = this.O.getOrDefault(var1, var12 & ~var13 | ~var12 & var13);
         this.O.put(var1, var3);
         int var10001 = (int)8800244901204524820L;
         var13 = 466698137;
         var12 = var10001;
         var10001 = (var12 | var13) & ~(var12 & var13);
         var13 = -1284652924;
         var12 = var10001;
         if (var3 >= (var12 & ~var13 | ~var12 & var13)) {
            var10001 = (int)7895657509183598468L;
            var13 = -445570798;
            var12 = var10001;
            var10001 = (var12 | var13) & (~var12 | ~var13);
            var13 = 175738527;
            var12 = var10001;
            if (var4 < (var12 | var13) - (var12 & var13)) {
               this.P.put(var1, System.currentTimeMillis());
            }
         }

         Long var5 = this.P.get(var1);
         if (var5 == null) {
            return var2;
         }

         float var10000 = (float)(System.currentTimeMillis() - var5);
         var13 = -1917373992;
         var12 = 1917055807;
         var10002 = (var12 | var13) & (~var12 | ~var13);
         var13 = -736530;
         var12 = var10002;
         var10002 = (var12 | var13) - (var12 & var13);
         var13 = -1052309957;
         var12 = 1634322590;
         var10002 = (var12 | var13) & (~var12 | ~var13);
         var13 = -1607545181;
         var12 = var10002;
         var10002 = (var12 | var13) & ~(var12 & var13);
         var10002 = (int)4019995079743384901L;
         var13 = 737142608;
         var12 = var10002;
         var10002 = var12 & ~var13 | ~var12 & var13;
         var13 = -855389665;
         var12 = var10002;
         var10002 = (var12 | var13) & ~(var12 & var13);
         float var6 = var10000 / 1000.0F;
         float var7 = this.L.a();
         if (!(var6 > var7)) {
            float var8 = var6 / var7;
            var13 = 1731154096;
            var12 = 1263452603;
            var10001 = (var12 | var13) & ~(var12 & var13);
            var13 = -179376439;
            var12 = var10001;
            var10001 = (var12 | var13) - (var12 & var13);
            float var9;
            if (!(var8 < 0.15F)) {
               var13 = 3234626;
               var12 = 438618389;
               var10002 = (var12 | var13) - (var12 & var13);
               var13 = 437621330;
               var12 = var10002;
               var10002 = var12 & ~var13 | ~var12 & var13;
               var13 = -1797208138;
               var12 = -1379063645;
               var10002 = (var12 | var13) & (~var12 | ~var13);
               var13 = 959311621;
               var12 = var10002;
               var10002 = (var12 | var13) & ~(var12 & var13);
               var10000 = var8 - 0.15F;
               String var69 = "cgp";
               float var10 = var10000 / 0.85F;
               float var70 = var10 * var10;
               var13 = 1365321047;
               var12 = 1768944507;
               var10002 = (var12 | var13) & (~var12 | ~var13);
               var13 = -47697957;
               var12 = var10002;
               var10002 = ((var12 | var13) - (var12 & var13)) * ((var12 | var13) - (var12 & var13));
               float var11 = 1.0F - var70 * (3.0F - 2.0F * var10);
               var9 = var11;
            } else {
               var10001 = (int)-6761651134630198743L;
               var13 = -1321013558;
               var12 = var10001;
               var10001 = (var12 | var13) & ~(var12 & var13);
               var13 = -1544153414;
               var12 = var10001;
               var10001 = (var12 | var13) & (~var12 | ~var13);
               float var14 = var8 / 0.15F;
               var10000 = var14 * var14;
               var10001 = (int)-5404050485041173921L;
               var13 = 2076111197;
               var12 = var10001;
               var10001 = (var12 | var13) - (var12 & var13);
               var13 = 832953703;
               var12 = var10001;
               var10001 = var12 + var13 - 2 * (var12 & var13);
               var9 = var10000 * (3.0F - 2.0F * var14);
            }

            float var15 = this.K.a();
            return var2 * (1.0F + (var15 - 1.0F) * var9);
         } else {
            return var2;
         }
      } else {
         return var2;
      }
   }

   @Override
   public void f() {
      super.f();
      this.M.clear();
      this.O.clear();
      this.P.clear();
   }

   public static String c(String var0, String var1, int var2, int var3, int var4, int var5) {
      char[] var6 = var1.toCharArray();
      char[] var7 = new char[var6.length];
      int var18 = -2079699177;
      int var17 = 943783509;
      int var10000 = (var17 | var18) - (var17 & var18);
      var18 = -1135955640;
      var17 = var10000;
      char[] var235 = new char[(var17 | var18) & (~var17 | ~var18)];
      int var10002 = (int)5279589304419413095L;
      var18 = 358692060;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -322971461;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -216108830;
      var17 = -1122991636;
      int var10003 = (var17 | var18) - (var17 & var18);
      var18 = 1309587772;
      var17 = var10003;
      var235[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var18 = 1270195798;
      var17 = 1797332016;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 546617959;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -510416565;
      var17 = 1114998029;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -1545203773;
      var17 = var10003;
      var235[var10002] = (char)((var17 | var18) - (var17 & var18));
      var10002 = (int)5625322287698028977L;
      var18 = 2111736398;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 2089460733;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -1833938862;
      var17 = 1426860277;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -943957215;
      var17 = var10003;
      var235[var10002] = (char)((var17 | var18) - (var17 & var18));
      var18 = -1107378227;
      var17 = 400767653;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -1440905877;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1102995028;
      var17 = -1462950030;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -360473215;
      var17 = var10003;
      var10003 = ((var17 | var18) & ~(var17 & var18)) * ((var17 | var18) & ~(var17 & var18));
      var10003 = (int)554275438909591283L;
      var18 = 579996665;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 293379353;
      var17 = var10003;
      var235[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var18 = 84289850;
      var17 = -191386088;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -242120922;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      String var304 = "chq";
      var10003 = (int)-4035876786470264799L;
      var18 = 953221849;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 568357853;
      var17 = var10003;
      var235[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var10002 = (int)6918494922143847519L;
      var18 = 1561262967;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -1951092947;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)-9204717953601847944L;
      var18 = -2009934836;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1110168330;
      var17 = var10003;
      var235[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var10002 = (int)-2385140227133918251L;
      var18 = 557677871;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1760735492;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 2053103959;
      var17 = 1335583455;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 902072987;
      var17 = var10003;
      var235[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var18 = 1458876415;
      var17 = 1713016630;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 820912334;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -530346272;
      var17 = 1891142055;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -1864682651;
      var17 = var10003;
      var235[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var10002 = (int)-3006244537725989074L;
      var18 = -1080755853;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -210323883;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)7877931546746277647L;
      var18 = 1499777369;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -373092859;
      var17 = var10003;
      var235[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var10002 = (int)8782116207383205267L;
      var18 = -1692856352;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -1369449862;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 2119215773;
      var17 = -1700885887;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -456251592;
      var17 = var10003;
      var235[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      char[] var8 = var235;
      var10000 = (int)5810875861117673142L;
      var18 = 200601438;
      var17 = var10000;
      var10000 = (var17 | var18) & ~(var17 & var18);
      var18 = -465866270;
      var17 = var10000;
      char[] var238 = new char[var17 & ~var18 | ~var17 & var18];
      var10002 = (int)1370991363258788559L;
      var18 = -291922475;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1672656666;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var10003 = (int)-4873224193268905084L;
      var18 = -1438309672;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -1021615748;
      var17 = var10003;
      var238[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var10002 = (int)5886948500698252949L;
      var18 = -189013056;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1738057044;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1768665159;
      var17 = 597700064;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 1749061014;
      var17 = var10003;
      var10003 = (var17 & ~var18 | ~var17 & var18) * (var17 & ~var18 | ~var17 & var18);
      var18 = 343403141;
      var17 = 1982365545;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1650397679;
      var17 = var10003;
      var238[var10002] = (char)((var17 | var18) - (var17 & var18));
      var10002 = (int)-8545202103145802279L;
      var18 = 2135040333;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1397814422;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      String var319 = "chr";
      var10003 = (int)2069250085050815675L;
      var18 = 1953293405;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1519056821;
      var17 = var10003;
      var238[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var10002 = (int)230391118453059942L;
      var18 = 2110571264;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 453014117;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -1848323287;
      var17 = -166382219;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 1740758622;
      var17 = var10003;
      var238[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var18 = -1646946609;
      var17 = 1732891097;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -90421486;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)7760315169730955425L;
      var18 = 1535975223;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -1217482794;
      var17 = var10003;
      var238[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var18 = 2077236467;
      var17 = -332472081;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -1744896999;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var10003 = (int)7118000708583144684L;
      var18 = -1422249799;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 690599105;
      var17 = var10003;
      var238[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var10002 = (int)1127216688534351711L;
      var18 = -1892643401;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1345592594;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var10003 = (int)6741590896311817130L;
      var18 = 1105301772;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 1008001480;
      var17 = var10003;
      var10003 = ((var17 | var18) & (~var17 | ~var18)) * ((var17 | var18) & (~var17 | ~var18));
      var18 = -1452816229;
      var17 = 701183556;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -2136180250;
      var17 = var10003;
      var238[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var18 = -2105099315;
      var17 = -509402469;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 1663408465;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -258331699;
      var17 = 1434163849;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -1511939716;
      var17 = var10003;
      var238[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var18 = 203196438;
      var17 = 1537248438;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 1471939752;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 135144508;
      var17 = 267202538;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 852886327;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)6618088477822407058L;
      var18 = -292936280;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -499157186;
      var17 = var10003;
      var238[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var18 = 1306344395;
      var17 = 763510609;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 1616839827;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1634679024;
      var17 = -212741768;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -1841374533;
      var17 = var10003;
      var238[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      char[] var9 = var238;
      var18 = 1701896543;
      var17 = -215707693;
      var10000 = var17 & ~var18 | ~var17 & var18;
      var18 = -1772851572;
      var17 = var10000;

      for (int var10 = (var17 | var18) & ~(var17 & var18); var10 < var6.length; var10++) {
         char var294 = var6[var10];
         char var221 = var8[var10 % var8.length];
         char var114 = var294;
         var7[var10] = (char)((var114 | var221) - (var114 & var221));
      }

      char[] var19 = new char[var7.length];
      var10000 = (int)-3266057020413264825L;
      var18 = 122847155;
      var17 = var10000;
      var10000 = (var17 | var18) & ~(var17 & var18);
      var18 = -1119173644;
      var17 = var10000;

      for (int var11 = (var17 | var18) & (~var17 | ~var18); var11 < var6.length; var11++) {
         char var295 = var7[var11];
         char var224 = var9[var11 % var9.length];
         char var117 = var295;
         var19[var11] = (char)(var117 + var224 - 2 * (var117 & var224));
      }

      String var20 = new String(var19);
      int var12 = var20.hashCode();
      var18 = var5;
      var17 = var3;
      var10000 = (var17 ^ var18) - 2 * (~var17 & var18);
      var18 = var2;
      var17 = var10000;
      int var13 = var17 - var18;
      char[] var14 = var0.toCharArray();
      char[] var15 = new char[var14.length];
      var18 = -1137742304;
      var17 = -519243995;
      var10000 = var17 & ~var18 | ~var17 & var18;
      var18 = 1562614021;
      var17 = var10000;

      for (int var16 = var17 + var18 - 2 * (var17 & var18); var16 < var15.length; var16++) {
         var18 = 1534275840;
         var17 = -741300518;
         int var10001 = (var17 | var18) & (~var17 | ~var18);
         var18 = -2002544680;
         var17 = var10001;
         switch (var16 % (var17 + var18 - 2 * (var17 & var18))) {
            case 0:
               var18 = var12;
               var17 = var13;
               var10002 = (var17 | var18) & ~(var17 & var18);
               char var234 = var14[var16];
               var17 = var10002;
               var15[var16] = (char)((var17 | var234) & (~var17 | ~var234));
               break;
            case 1:
               var18 = var13;
               var17 = var5;
               var10002 = var17 & ~var18 | ~var17 & var18;
               char var232 = var14[var16];
               var17 = var10002;
               var15[var16] = (char)((var17 | var232) - (var17 & var232));
         }
      }

      return new String(var15);
   }
}
