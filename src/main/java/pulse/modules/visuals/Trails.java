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
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat.DrawMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import org.joml.Matrix4f;

@ModuleInfo(a = "Trails", b = "Отображает след игрока", c = ModuleCategory.VISUALS)
public class Trails extends ClientModule {
   private final ModeSetting e;
   private final BooleanSetting f;
   private final SettingGroup g;
   private final ModeSetting h;
   private final SliderSetting i;
   private final SliderSetting j;
   private final BooleanSetting k;
   private final ColorSetting l;
   private final SettingGroup m;
   private final ModeSetting n;
   private final ModeSetting o;
   private final ModeSetting p;
   private final SliderSetting q;
   private final SliderSetting r;
   private final SliderSetting s;
   private final SliderSetting t;
   private final BooleanSetting u;
   private final ColorSetting v;
   private final Deque<Trails.TrailPoint> w;
   private double x;
   private double y;
   private double z;
   private boolean A;
   public static int a;
   public static boolean b;

   public Trails() {
      int var10003 = (int)1569251869374038610L;
      int var2 = -1025350763;
      int var1 = var10003;
      var10003 = (var1 | var2) & ~(var1 & var2);
      var2 = -1557606773;
      var1 = var10003;
      var10003 = (var1 | var2) - (var1 & var2);
      int var10004 = (int)-8973595463037220761L;
      var2 = 1834009492;
      var1 = var10004;
      var10004 = var1 & ~var2 | ~var1 & var2;
      var2 = 1118461550;
      var1 = var10004;
      var2 = (var1 | var2) & (~var1 | ~var2);
      var1 = var10003;
      var10003 = (var1 & ~var2) + (var2 & ~var1) + 2 * (var1 & var2);
      var2 = 924537519;
      var1 = -1695490970;
      var10004 = (var1 | var2) - (var1 & var2);
      var2 = -1742897655;
      var1 = var10004;
      var10004 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1096285649;
      var1 = 1559852161;
      int var10006 = (var1 | var2) - (var1 & var2);
      var2 = -497977667;
      var1 = var10006;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var10006 = (int)-5992533584933798714L;
      var2 = 516811876;
      var1 = var10006;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var2 = 1403113648;
      var1 = var10006;
      var10006 = (var1 | var2) - (var1 & var2);
      var2 = -344863047;
      var1 = 1501718919;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var2 = -1292654790;
      var1 = var10006;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      int var10005 = (int)4341254511174596179L;
      var2 = -1392842267;
      var1 = var10005;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = -799603563;
      var1 = var10005;
      var10005 = (var1 | var2) - (var1 & var2);
      var10006 = (int)-1779509574146634622L;
      var2 = 1152347110;
      var1 = var10006;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var2 = 540698012;
      var1 = var10006;
      var10006 = ((var1 | var2) & ~(var1 & var2)) * ((var1 | var2) & ~(var1 & var2));
      var2 = -975846319;
      var1 = -445373172;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var2 = -206192317;
      var1 = var10006;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var2 = -550401451;
      var1 = 1989274429;
      int var10008 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1449107101;
      var1 = var10008;
      var10008 = (var1 | var2) & ~(var1 & var2);
      var2 = 1489653803;
      var1 = -1965465846;
      var10008 = var1 & ~var2 | ~var1 & var2;
      var2 = -770502862;
      var1 = var10008;
      var10008 = var1 & ~var2 | ~var1 & var2;
      int var10007 = (int)-4201569824771220358L;
      var2 = 1676251311;
      var1 = var10007;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var2 = 356797190;
      var1 = var10007;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      var2 = 33712538;
      var1 = 427711092;
      int var10009 = (var1 | var2) & (~var1 | ~var2);
      var2 = 461124578;
      var1 = var10009;
      var10009 = var1 + var2 - 2 * (var1 & var2);
      var10009 = (int)410270868458328029L;
      var2 = 1457389263;
      var1 = var10009;
      var10009 = var1 + var2 - 2 * (var1 & var2);
      var2 = 922464530;
      var1 = var10009;
      var10009 = (var1 | var2) - (var1 & var2);
      var2 = -592098187;
      var1 = -1203012123;
      var10008 = var1 & ~var2 | ~var1 & var2;
      var2 = 1694364441;
      var1 = var10008;
      String var1040 = c(
         "嵱쓎嵧쓃嵭샛崔쓅嵥쒷嵠쒰", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w", var10005, var10006, var10007, var1 + var2 - 2 * (var1 & var2)
      );
      var2 = 365253863;
      var1 = -234810678;
      var10004 = var1 + var2 - 2 * (var1 & var2);
      var2 = -406567378;
      var1 = var10004;
      String[] var1078 = new String[var1 + var2 - 2 * (var1 & var2)];
      var10006 = (int)8509222012490008801L;
      var2 = 2042976480;
      var1 = var10006;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var2 = 1352896513;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var2 = 1667425978;
      var1 = -988793109;
      var10008 = (var1 | var2) - (var1 & var2);
      var2 = -1502425000;
      var1 = var10008;
      var10008 = (var1 | var2) - (var1 & var2);
      var2 = 818576447;
      var1 = -1144228599;
      var10008 = (var1 | var2) & ~(var1 & var2);
      var2 = -1962538716;
      var1 = var10008;
      var10008 = (var1 | var2) & ~(var1 & var2);
      var10008 = (int)1723401206003993077L;
      var2 = -167424659;
      var1 = var10008;
      var10008 = (var1 | var2) & ~(var1 & var2);
      var2 = 1935812829;
      var1 = var10008;
      var10008 = (var1 | var2) - (var1 & var2);
      var10009 = (int)7654099975716184730L;
      var2 = -1537194906;
      var1 = var10009;
      var10009 = (var1 | var2) & (~var1 | ~var2);
      var2 = 282103184;
      var1 = var10009;
      var2 = var1 & ~var2 | ~var1 & var2;
      var1 = var10008;
      var10008 = var1 - ~var2 - 1;
      var10009 = (int)-1598141654430232877L;
      var2 = 1029339539;
      var1 = var10009;
      var10009 = (var1 | var2) - (var1 & var2);
      var2 = -1424314938;
      var1 = var10009;
      var10009 = (var1 | var2) & ~(var1 & var2);
      int var10010 = (int)-475720361048759739L;
      var2 = -229095041;
      var1 = var10010;
      var10010 = (var1 | var2) - (var1 & var2);
      var2 = -956877179;
      var1 = var10010;
      var2 = (var1 | var2) & (~var1 | ~var2);
      var1 = var10009;
      var10009 = (var1 ^ var2) + 2 * (var1 & var2);
      var2 = 325391707;
      var1 = -1938659334;
      var10009 = (var1 | var2) - (var1 & var2);
      var2 = -106616446;
      var1 = var10009;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var10010 = (int)376592309803830079L;
      var2 = 1872952413;
      var1 = var10010;
      var10010 = (var1 | var2) & (~var1 | ~var2);
      var2 = -492051774;
      var1 = var10010;
      var10010 = var1 + var2 - 2 * (var1 & var2);
      int var10011 = (int)7362863759961421042L;
      var2 = -281572173;
      var1 = var10011;
      var10011 = var1 & ~var2 | ~var1 & var2;
      var2 = 1580927342;
      var1 = var10011;
      var2 = (var1 | var2) & ~(var1 & var2);
      var1 = var10010;
      var10010 = var1 - ~var2 - 1;
      var2 = 647064371;
      var1 = 1150812811;
      var10010 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1319188155;
      var1 = var10010;
      var10010 = (var1 | var2) - (var1 & var2);
      String var1788 = "eaz";
      var2 = 505833877;
      var1 = 1582517733;
      var10011 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1088269138;
      var1 = var10011;
      var10011 = (var1 | var2) - (var1 & var2);
      int var10012 = (int)7850408219257577294L;
      var2 = 2125556767;
      var1 = var10012;
      var10012 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1694461891;
      var1 = var10012;
      var10012 = (var1 | var2) - (var1 & var2);
      var2 = -870655673;
      var1 = -2096902907;
      var10012 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1331582762;
      var1 = var10012;
      var1078[var10006] = c(
         "嵳䔤嵪䕖嵫䔤奱䕛嵪䔯嵥", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w", var10009, var10010, var10011, (var1 | var2) & (~var1 | ~var2)
      );
      var10006 = (int)-7804572357143479819L;
      var2 = 1626740496;
      var1 = var10006;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1000919324;
      var1 = var10006;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      String var1351 = "eba";
      var2 = -938367035;
      var1 = 1613867251;
      var10008 = var1 & ~var2 | ~var1 & var2;
      var2 = -352023364;
      var1 = var10008;
      var10008 = (var1 | var2) & ~(var1 & var2);
      var10009 = (int)2053475439384315194L;
      var2 = 615549983;
      var1 = var10009;
      var10009 = var1 + var2 - 2 * (var1 & var2);
      var2 = -888179300;
      var1 = var10009;
      var2 = (var1 | var2) & (~var1 | ~var2);
      var1 = var10008;
      var10008 = (var1 ^ var2) + 2 * (var1 & var2);
      var10009 = (int)6991638143470572656L;
      var2 = 846325331;
      var1 = var10009;
      var10009 = (var1 | var2) - (var1 & var2);
      var2 = 1583866121;
      var1 = var10009;
      var10009 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1982072914;
      var1 = -1059198802;
      var10010 = (var1 | var2) & ~(var1 & var2);
      var2 = -1385372752;
      var1 = var10010;
      var2 = (var1 | var2) & (~var1 | ~var2);
      var1 = var10009;
      var10009 = var1 - ~var2 - 1;
      var10009 = (int)343725866533390006L;
      var2 = 1960215373;
      var1 = var10009;
      var10009 = (var1 | var2) & ~(var1 & var2);
      var2 = -1397563688;
      var1 = var10009;
      var10009 = var1 + var2 - 2 * (var1 & var2);
      var2 = -861289084;
      var1 = 547309786;
      var10010 = (var1 | var2) - (var1 & var2);
      var2 = -534606588;
      var1 = var10010;
      var10010 = (var1 | var2) & ~(var1 & var2);
      var2 = 1987424529;
      var1 = 1363769441;
      var10010 = var1 & ~var2 | ~var1 & var2;
      var2 = -193569194;
      var1 = var10010;
      var10010 = var1 & ~var2 | ~var1 & var2;
      var10011 = (int)-4736578145573471079L;
      var2 = -1324978556;
      var1 = var10011;
      var10011 = (var1 | var2) - (var1 & var2);
      var2 = 1564938317;
      var1 = var10011;
      var10011 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1722094536;
      var1 = -137192962;
      var10012 = (var1 | var2) & ~(var1 & var2);
      var2 = -1883938296;
      var1 = var10012;
      var2 = (var1 | var2) - (var1 & var2);
      var1 = var10011;
      var10011 = var1 - ~var2 - 1;
      var10011 = (int)1530972147533726156L;
      var2 = 1639532031;
      var1 = var10011;
      var10011 = (var1 | var2) & (~var1 | ~var2);
      var2 = -109165406;
      var1 = var10011;
      var10011 = (var1 | var2) & ~(var1 & var2);
      var10012 = (int)1671424926981444780L;
      var2 = -2097086028;
      var1 = var10012;
      var10012 = var1 + var2 - 2 * (var1 & var2);
      var2 = 980053106;
      var1 = var10012;
      var10012 = (var1 | var2) & (~var1 | ~var2);
      var10012 = (int)6966416486098625734L;
      var2 = 1993896251;
      var1 = var10012;
      var10012 = (var1 | var2) & (~var1 | ~var2);
      var2 = 498543724;
      var1 = var10012;
      var1078[var10006] = c(
         "嵳㿝嵪㾯嵫㿝奱㾤嵡㾢崓㿛崗㾨", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w", var10009, var10010, var10011, (var1 | var2) & ~(var1 & var2)
      );
      var2 = -1139284063;
      var1 = -464117225;
      var10006 = (var1 | var2) - (var1 & var2);
      var2 = 1480705460;
      var1 = var10006;
      var10006 = (var1 | var2) - (var1 & var2);
      var10008 = (int)-553335485500807038L;
      var2 = -436117282;
      var1 = var10008;
      var10008 = var1 + var2 - 2 * (var1 & var2);
      var2 = 656033869;
      var1 = var10008;
      var10008 = var1 & ~var2 | ~var1 & var2;
      var10009 = (int)-8666561333367829154L;
      var2 = 395921503;
      var1 = var10009;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var2 = 1809892621;
      var1 = var10009;
      var10009 = (var1 | var2) - (var1 & var2);
      var2 = 1588322220;
      var1 = 635998974;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var2 = 2068008274;
      var1 = var10009;
      var10009 = var1 + var2 - 2 * (var1 & var2);
      var10009 = (int)-9165143267691737850L;
      var2 = -1797214856;
      var1 = var10009;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var2 = 1498112108;
      var1 = var10009;
      var10009 = (var1 | var2) & ~(var1 & var2);
      var2 = -1597579506;
      var1 = -84570797;
      var10009 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1513312848;
      var1 = var10009;
      var10009 = (var1 | var2) - (var1 & var2);
      var10009 = (int)-7282325331798421641L;
      var2 = -1185619268;
      var1 = var10009;
      var10009 = (var1 | var2) & (~var1 | ~var2);
      var2 = -521647617;
      var1 = var10009;
      var10009 = ((var1 | var2) & ~(var1 & var2)) * ((var1 | var2) & ~(var1 & var2));
      var2 = 154429029;
      var1 = -958826321;
      var10009 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1453373975;
      var1 = var10009;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var10010 = (int)-4805065749947111661L;
      var2 = -776318335;
      var1 = var10010;
      var10010 = var1 & ~var2 | ~var1 & var2;
      var2 = 141113179;
      var1 = var10010;
      var10010 = ((var1 | var2) & (~var1 | ~var2)) * ((var1 | var2) & (~var1 | ~var2));
      var2 = 1386005226;
      var1 = 1105235790;
      var10010 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1070816957;
      var1 = var10010;
      var10010 = (var1 | var2) & (~var1 | ~var2);
      var2 = 442824262;
      var1 = 819705661;
      var10011 = (var1 | var2) - (var1 & var2);
      var2 = -693522287;
      var1 = var10011;
      var10011 = var1 & ~var2 | ~var1 & var2;
      var2 = 1619240309;
      var1 = 1824555546;
      var10011 = (var1 | var2) - (var1 & var2);
      var2 = 269651363;
      var1 = var10011;
      var10011 = (var1 | var2) - (var1 & var2);
      int var10013 = (int)-4162274580020131519L;
      var2 = 1031561691;
      var1 = var10013;
      var10013 = (var1 | var2) & ~(var1 & var2);
      var2 = 1161783435;
      var1 = var10013;
      var10013 = (var1 | var2) & ~(var1 & var2);
      var10013 = (int)-5180259802093762000L;
      var2 = -1913103700;
      var1 = var10013;
      var10013 = var1 & ~var2 | ~var1 & var2;
      var2 = 1980698773;
      var1 = var10013;
      var10013 = (var1 | var2) - (var1 & var2);
      var2 = -691716236;
      var1 = 1060644117;
      var10013 = var1 + var2 - 2 * (var1 & var2);
      var2 = -369288590;
      var1 = var10013;
      var10013 = (var1 | var2) & ~(var1 & var2);
      var2 = 2081697374;
      var1 = -223853025;
      var10012 = (var1 | var2) & ~(var1 & var2);
      var2 = -1896028397;
      var1 = var10012;
      var1078[var10006] = c(
         "嵰褛嵤褔奱贋奱襧嵡襡崓褘崗襫", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w", var10009, var10010, var10011, (var1 | var2) & ~(var1 & var2)
      );
      String var1140 = "ebb";
      var10006 = (int)6996021018552158739L;
      var2 = 2010816221;
      var1 = var10006;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var2 = -516447356;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      String var1352 = "ebc";
      var2 = 296392413;
      var1 = 1518619460;
      var10007 = (var1 | var2) - (var1 & var2);
      var2 = 765232826;
      var1 = var10007;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var10008 = (int)-1339952992115840418L;
      var2 = -1711628646;
      var1 = var10008;
      var10008 = (var1 | var2) - (var1 & var2);
      var2 = -1121874773;
      var1 = var10008;
      var10008 = (var1 | var2) & ~(var1 & var2);
      var2 = 1988950515;
      var1 = -1442222425;
      var10008 = var1 & ~var2 | ~var1 & var2;
      var2 = 264128097;
      var1 = var10008;
      var10008 = var1 + var2 - 2 * (var1 & var2);
      var10009 = (int)4679699522027612266L;
      var2 = 224255401;
      var1 = var10009;
      var10009 = (var1 | var2) - (var1 & var2);
      var2 = 1157784531;
      var1 = var10009;
      var10009 = (var1 | var2) - (var1 & var2);
      var10009 = (int)8243190091169712072L;
      var2 = 447753167;
      var1 = var10009;
      var10009 = (var1 | var2) - (var1 & var2);
      var2 = -1489528746;
      var1 = var10009;
      var10009 = (var1 | var2) & (~var1 | ~var2);
      var2 = 200161021;
      var1 = 201175307;
      var10010 = var1 & ~var2 | ~var1 & var2;
      var2 = 1919461617;
      var1 = var10010;
      var10010 = var1 + var2 - 2 * (var1 & var2);
      var2 = -344453889;
      var1 = -1790277923;
      var10010 = (var1 | var2) & ~(var1 & var2);
      var2 = 2115631490;
      var1 = var10010;
      this.e = new ModeSetting(
         var1040,
         var1078,
         c("嵳痬嵪疞嵫痬奱疓嵪痧嵥", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w", var10007, var10008, var10009, var1 & ~var2 | ~var1 & var2)
      );
      var2 = -809928327;
      var1 = -76122645;
      var10003 = var1 & ~var2 | ~var1 & var2;
      var2 = 1413239091;
      var1 = var10003;
      var10003 = (var1 | var2) - (var1 & var2);
      var10004 = (int)-7664230624844680448L;
      var2 = 871082542;
      var1 = var10004;
      var10004 = var1 + var2 - 2 * (var1 & var2);
      var2 = -856661707;
      var1 = var10004;
      var2 = var1 & ~var2 | ~var1 & var2;
      var1 = var10003;
      var10003 = 2 * (var1 | var2) - (var1 ^ var2);
      String var1081 = "ebd";
      var2 = 1806193529;
      var1 = -692343231;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var2 = -529418334;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = -216238367;
      var1 = -143211984;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var2 = -957491234;
      var1 = var10006;
      var2 = (var1 | var2) & (~var1 | ~var2);
      var1 = var10005;
      var10005 = 2 * (var1 | var2) - (var1 ^ var2);
      var2 = -554227501;
      var1 = 92629641;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1111484039;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      String var1233 = "ebe";
      var10006 = (int)9093006791172262511L;
      var2 = 783505567;
      var1 = var10006;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var2 = 227299548;
      var1 = var10006;
      var10006 = (var1 | var2) - (var1 & var2);
      String var1355 = "ebf";
      var2 = -1806748667;
      var1 = -357523914;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var2 = 1683384149;
      var1 = var10007;
      var10007 = (var1 | var2) & ~(var1 & var2);
      String var1502 = "ebg";
      var2 = -776466300;
      var1 = -844303791;
      var10008 = var1 + var2 - 2 * (var1 & var2);
      var2 = 473089602;
      var1 = var10008;
      String var1044 = c(
         "嵎⋛嵫⋕嵦⊮嵣⋕崓⊩奱⋛崓⛅嵮⋐崑⋗嵯⋖嵯⛅嵪⋝崗⋕", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w", var10005, var10006, var10007, var1 & ~var2 | ~var1 & var2
      );
      var10004 = (int)-548654175639748486L;
      var2 = 1747685481;
      var1 = var10004;
      var10004 = (var1 | var2) & ~(var1 & var2);
      var2 = 1281282067;
      var1 = var10004;
      this.f = new BooleanSetting(var1044, pulse.Bool.from((var1 | var2) - (var1 & var2)));
      var10003 = (int)6218170289450466280L;
      var2 = -739415692;
      var1 = var10003;
      var10003 = (var1 | var2) - (var1 & var2);
      var2 = -682380407;
      var1 = var10003;
      var10003 = ((var1 | var2) & ~(var1 & var2)) * ((var1 | var2) & ~(var1 & var2));
      var10004 = (int)-4435907031783071952L;
      var2 = -51112131;
      var1 = var10004;
      var10004 = var1 & ~var2 | ~var1 & var2;
      var2 = 2092356175;
      var1 = var10004;
      var10004 = var1 & ~var2 | ~var1 & var2;
      var10005 = (int)1328964694362370422L;
      var2 = 1387873645;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1951759678;
      var1 = var10005;
      var2 = var1 & ~var2 | ~var1 & var2;
      var1 = var10004;
      var10004 = (var1 ^ var2) + 2 * (var1 & var2);
      var2 = 88388001;
      var1 = -365953440;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = -839302293;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var2 = 140165075;
      var1 = -372904762;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var2 = 440910574;
      var1 = var10006;
      var2 = var1 & ~var2 | ~var1 & var2;
      var1 = var10005;
      var10005 = (var1 & ~var2) + (var2 & ~var1) + 2 * (var1 & var2);
      var10005 = (int)-6193270657431978979L;
      var2 = 1506589221;
      var1 = var10005;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1097573093;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var2 = 1868925725;
      var1 = 70901963;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var2 = -253864191;
      var1 = var10006;
      var10006 = (var1 & ~var2 | ~var1 & var2) * (var1 & ~var2 | ~var1 & var2);
      var2 = 947682920;
      var1 = -1263659147;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1606503892;
      var1 = var10006;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1207634509;
      var1 = 968715558;
      var10007 = (var1 | var2) - (var1 & var2);
      var2 = 489817638;
      var1 = var10007;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var2 = -1936161678;
      var1 = -473632301;
      var10008 = (var1 | var2) & ~(var1 & var2);
      var2 = 883575312;
      var1 = var10008;
      var2 = (var1 | var2) - (var1 & var2);
      var1 = var10007;
      var10007 = (var1 & ~var2) + (var2 & ~var1) + 2 * (var1 & var2);
      var10007 = (int)-7986439105027452476L;
      var2 = -1403269192;
      var1 = var10007;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      var2 = 353630375;
      var1 = var10007;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1004334261;
      var1 = 190210778;
      var10008 = (var1 | var2) - (var1 & var2);
      var2 = -615030946;
      var1 = var10008;
      var10008 = ((var1 | var2) & ~(var1 & var2)) * ((var1 | var2) & ~(var1 & var2));
      var10008 = (int)726966682915408839L;
      var2 = -1527225020;
      var1 = var10008;
      var10008 = var1 & ~var2 | ~var1 & var2;
      var2 = 374155703;
      var1 = var10008;
      this.g = new SettingGroup(c("嵰셽嵤셲", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w", var10005, var10006, var10007, (var1 | var2) & ~(var1 & var2)))
         .a(
            () -> {
               int var10001 = (int)-4203202768093742563L;
               int var2x = 372248234;
               int var1x = var10001;
               var10001 = (var1x | var2x) & ~(var1x & var2x);
               var2x = -1356617291;
               var1x = var10001;
               var10001 = ((var1x | var2x) - (var1x & var2x)) * ((var1x | var2x) - (var1x & var2x));
               int var10002 = (int)3951601567255010708L;
               var2x = 1442028536;
               var1x = var10002;
               var10002 = (var1x | var2x) & ~(var1x & var2x);
               var2x = 1464129277;
               var1x = var10002;
               var10002 = var1x & ~var2x | ~var1x & var2x;
               var2x = 1879918087;
               var1x = 1510761825;
               int var10003x = var1x + var2x - 2 * (var1x & var2x);
               var2x = -2111589621;
               var1x = var10003x;
               var2x = (var1x | var2x) - (var1x & var2x);
               var1x = var10002;
               var10002 = 2 * (var1x | var2x) - (var1x ^ var2x);
               var10003x = (int)-5867024838402238023L;
               var2x = 521978080;
               var1x = var10003x;
               var10003x = (var1x | var2x) - (var1x & var2x);
               var2x = 1394421737;
               var1x = var10003x;
               var10003x = var1x & ~var2x | ~var1x & var2x;
               var2x = -1515209782;
               var1x = -454246763;
               int var10004x = var1x & ~var2x | ~var1x & var2x;
               var2x = -1551309051;
               var1x = var10004x;
               var2x = (var1x | var2x) - (var1x & var2x);
               var1x = var10003x;
               var10003x = var1x - ~var2x - 1;
               var2x = 1803353500;
               var1x = 58618398;
               var10003x = (var1x | var2x) & ~(var1x & var2x);
               var2x = 246469793;
               var1x = var10003x;
               var10003x = var1x & ~var2x | ~var1x & var2x;
               var2x = -319386691;
               var1x = 710809557;
               var10004x = var1x & ~var2x | ~var1x & var2x;
               var2x = -634524737;
               var1x = var10004x;
               var10004x = var1x + var2x - 2 * (var1x & var2x);
               var2x = -452536454;
               var1x = 75313284;
               int var10005x = (var1x | var2x) - (var1x & var2x);
               var2x = 1387492629;
               var1x = var10005x;
               var2x = (var1x | var2x) - (var1x & var2x);
               var1x = var10004x;
               var10004x = (var1x | var2x) + (var1x & var2x);
               var2x = -1293351944;
               var1x = 831740924;
               var10004x = (var1x | var2x) - (var1x & var2x);
               var2x = 999003592;
               var1x = var10004x;
               var10004x = var1x + var2x - 2 * (var1x & var2x);
               var2x = 1190462145;
               var1x = 1680121060;
               var10005x = (var1x | var2x) - (var1x & var2x);
               var2x = -426353846;
               var1x = var10005x;
               var10005x = (var1x & ~var2x | ~var1x & var2x) * (var1x & ~var2x | ~var1x & var2x);
               var2x = 123994999;
               var1x = 514693866;
               var10005x = (var1x | var2x) & ~(var1x & var2x);
               var2x = 246356896;
               var1x = var10005x;
               var10005x = (var1x | var2x) & (~var1x | ~var2x);
               int var10006x = (int)-7904332959102196334L;
               var2x = -54010107;
               var1x = var10006x;
               var10006x = var1x & ~var2x | ~var1x & var2x;
               var2x = -876747235;
               var1x = var10006x;
               var10006x = (var1x & ~var2x | ~var1x & var2x) * (var1x & ~var2x | ~var1x & var2x);
               var2x = 2055868783;
               var1x = 376676403;
               var10006x = var1x & ~var2x | ~var1x & var2x;
               var2x = 1823056582;
               var1x = var10006x;
               return this.e
                  .b(
                     c(
                        "\r䢮\u0019䢡Ќ䲾Ќ䣒\u001c䣔n䢭j䣞",
                        "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w",
                        var10003x,
                        var10004x,
                        var10005x,
                        var1x + var2x - 2 * (var1x & var2x)
                     )
                  );
            }
         );
      var10003 = (int)-1276119459019605650L;
      var2 = 243671318;
      var1 = var10003;
      var10003 = (var1 | var2) & (~var1 | ~var2);
      var2 = -297522614;
      var1 = var10003;
      var10003 = (var1 & ~var2 | ~var1 & var2) * (var1 & ~var2 | ~var1 & var2);
      var2 = -332249931;
      var1 = -737095586;
      var10004 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1874723478;
      var1 = var10004;
      var10004 = (var1 | var2) & (~var1 | ~var2);
      var2 = 211452078;
      var1 = -30091924;
      var10005 = (var1 | var2) - (var1 & var2);
      var2 = 360873235;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1477838929;
      var1 = 911679458;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = 150162576;
      var1 = var10005;
      var10005 = (var1 | var2) - (var1 & var2);
      var2 = -248778420;
      var1 = -1422083401;
      var10006 = (var1 | var2) - (var1 & var2);
      var2 = -145109301;
      var1 = var10006;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1584321838;
      var1 = -858015460;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1104457970;
      var1 = var10006;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var10007 = (int)7048244754165006307L;
      var2 = -1249655993;
      var1 = var10007;
      var10007 = (var1 | var2) - (var1 & var2);
      var2 = 1718350865;
      var1 = var10007;
      var10007 = (var1 | var2) & ~(var1 & var2);
      var2 = 894161570;
      var1 = -1330461975;
      var10008 = (var1 | var2) - (var1 & var2);
      var2 = -578747166;
      var1 = var10008;
      var2 = (var1 | var2) & ~(var1 & var2);
      var1 = var10007;
      var10007 = (var1 & ~var2) + (var2 & ~var1) + 2 * (var1 & var2);
      var2 = -1832178722;
      var1 = -1062175715;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var2 = 1557326121;
      var1 = var10007;
      var10007 = (var1 | var2) & (~var1 | ~var2);
      var10008 = (int)5660353802762771377L;
      var2 = 1441176931;
      var1 = var10008;
      var10008 = (var1 | var2) & ~(var1 & var2);
      var2 = -2101020283;
      var1 = var10008;
      var10008 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1908797180;
      var1 = 1384567220;
      var10008 = var1 + var2 - 2 * (var1 & var2);
      var2 = -588398693;
      var1 = var10008;
      String var1051 = c("嵳祡嵮絹崐祢嵤祭嵡", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w", var10005, var10006, var10007, (var1 | var2) - (var1 & var2));
      var10004 = (int)3898181593495971223L;
      var2 = 1510819037;
      var1 = var10004;
      var10004 = (var1 | var2) & (~var1 | ~var2);
      var2 = 608592201;
      var1 = var10004;
      String[] var1092 = new String[(var1 | var2) - (var1 & var2)];
      var2 = -937411798;
      var1 = 1578311878;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1775035412;
      var1 = var10006;
      var10006 = (var1 | var2) - (var1 & var2);
      var10007 = (int)-8460167390476867264L;
      var2 = -827163747;
      var1 = var10007;
      var10007 = (var1 | var2) & (~var1 | ~var2);
      var2 = -893495699;
      var1 = var10007;
      var10007 = (var1 | var2) - (var1 & var2);
      String var1514 = "ebh";
      var10009 = (int)5616980159513965919L;
      var2 = 19661071;
      var1 = var10009;
      var10009 = (var1 | var2) - (var1 & var2);
      var2 = 2121342844;
      var1 = var10009;
      var10009 = (var1 | var2) & ~(var1 & var2);
      var2 = 1144621024;
      var1 = -892475322;
      var10009 = (var1 | var2) - (var1 & var2);
      var2 = -398052219;
      var1 = var10009;
      var10009 = (var1 | var2) - (var1 & var2);
      var2 = 2058965985;
      var1 = 884475080;
      var10010 = var1 + var2 - 2 * (var1 & var2);
      var2 = -935436569;
      var1 = var10010;
      var10010 = (var1 | var2) & ~(var1 & var2);
      var2 = 1005522364;
      var1 = 973125920;
      var10010 = (var1 | var2) & ~(var1 & var2);
      var2 = -760313615;
      var1 = var10010;
      var10010 = (var1 | var2) - (var1 & var2);
      var10011 = (int)4165567953413576235L;
      var2 = 238027759;
      var1 = var10011;
      var10011 = var1 & ~var2 | ~var1 & var2;
      var2 = -26545440;
      var1 = var10011;
      var10011 = ((var1 | var2) - (var1 & var2)) * ((var1 | var2) - (var1 & var2));
      var2 = 860455478;
      var1 = -1183743874;
      var10011 = (var1 | var2) & ~(var1 & var2);
      var2 = -1893078120;
      var1 = var10011;
      var10011 = var1 & ~var2 | ~var1 & var2;
      var10013 = (int)-3624265032742147488L;
      var2 = -852190299;
      var1 = var10013;
      var10013 = (var1 | var2) - (var1 & var2);
      var2 = 1790734807;
      var1 = var10013;
      var10013 = (var1 | var2) - (var1 & var2);
      var10012 = (int)-6790578284016525986L;
      var2 = 1790342008;
      var1 = var10012;
      var10012 = var1 & ~var2 | ~var1 & var2;
      var2 = 858796286;
      var1 = var10012;
      var1092[var10006] = c(
         "嵰\ud895嵪\ud894崙\ud897嵯\ud893",
         "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w",
         var10009,
         var10010,
         var10011,
         var1 + var2 - 2 * (var1 & var2)
      );
      var2 = 1927195485;
      var1 = 1575390929;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var2 = 792208781;
      var1 = var10006;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1917205545;
      var1 = -631057283;
      var10008 = (var1 | var2) & ~(var1 & var2);
      var2 = -1473976252;
      var1 = var10008;
      var10008 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1362848484;
      var1 = -203799260;
      var10008 = (var1 | var2) - (var1 & var2);
      var2 = 467876172;
      var1 = var10008;
      var10008 = ((var1 | var2) & (~var1 | ~var2)) * ((var1 | var2) & (~var1 | ~var2));
      var2 = -1019274663;
      var1 = -2069640458;
      var10010 = (var1 | var2) - (var1 & var2);
      var2 = 1201459390;
      var1 = var10010;
      var10010 = var1 + var2 - 2 * (var1 & var2);
      var2 = 720056769;
      var1 = -1526906827;
      var10010 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1911131661;
      var1 = var10010;
      var10010 = (var1 | var2) & (~var1 | ~var2);
      var10010 = (int)5043214122079038512L;
      var2 = -94230317;
      var1 = var10010;
      var10010 = var1 + var2 - 2 * (var1 & var2);
      var2 = -626850574;
      var1 = var10010;
      var10010 = var1 & ~var2 | ~var1 & var2;
      var10009 = (int)-2968581825208902714L;
      var2 = -951019591;
      var1 = var10009;
      var10009 = (var1 | var2) & ~(var1 & var2);
      var2 = 1146935132;
      var1 = var10009;
      var10009 = var1 + var2 - 2 * (var1 & var2);
      var10010 = (int)3916220434757935202L;
      var2 = 40731986;
      var1 = var10010;
      var10010 = var1 & ~var2 | ~var1 & var2;
      var2 = -1744150593;
      var1 = var10010;
      var10010 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1840186631;
      var1 = -1290806944;
      var10010 = (var1 | var2) & ~(var1 & var2);
      var2 = -226807569;
      var1 = var10010;
      var10010 = var1 & ~var2 | ~var1 & var2;
      var2 = -391008333;
      var1 = -1639118464;
      var10011 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1856641878;
      var1 = var10011;
      var10011 = (var1 + var2 - 2 * (var1 & var2)) * (var1 + var2 - 2 * (var1 & var2));
      var2 = -2099239415;
      var1 = -734001834;
      var10011 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1238906618;
      var1 = var10011;
      var10011 = (var1 | var2) - (var1 & var2);
      var2 = -1008465641;
      var1 = 2017279959;
      var10012 = (var1 | var2) - (var1 & var2);
      var2 = 1462874260;
      var1 = var10012;
      var10012 = (var1 | var2) & ~(var1 & var2);
      var2 = -164610713;
      var1 = -154815455;
      var10013 = var1 & ~var2 | ~var1 & var2;
      var2 = -2070854693;
      var1 = var10013;
      var2 = (var1 | var2) - (var1 & var2);
      var1 = var10012;
      var10012 = 2 * (var1 | var2) - (var1 ^ var2);
      var10012 = (int)6108974198395088361L;
      var2 = 16127809;
      var1 = var10012;
      var10012 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1380446391;
      var1 = var10012;
      var1092[var10006] = c(
         "嵎돐嵬뎩崓뎫崑", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w", var10009, var10010, var10011, var1 + var2 - 2 * (var1 & var2)
      );
      var10006 = (int)-6434124731928997425L;
      var2 = 883721480;
      var1 = var10006;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var2 = 1685951685;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var2 = 1546643814;
      var1 = -1890405546;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var2 = -341308391;
      var1 = var10007;
      var10007 = (var1 & ~var2 | ~var1 & var2) * (var1 & ~var2 | ~var1 & var2);
      var2 = 152077693;
      var1 = -878750481;
      var10008 = var1 + var2 - 2 * (var1 & var2);
      var2 = -307258960;
      var1 = var10008;
      var10008 = var1 + var2 - 2 * (var1 & var2);
      var10009 = (int)-3787612636305622329L;
      var2 = 18565426;
      var1 = var10009;
      var10009 = var1 + var2 - 2 * (var1 & var2);
      var2 = 421991936;
      var1 = var10009;
      var2 = var1 + var2 - 2 * (var1 & var2);
      var1 = var10008;
      var10008 = var1 - ~var2 - 1;
      var10009 = (int)7687738922174857637L;
      var2 = -978615926;
      var1 = var10009;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var2 = -1848341324;
      var1 = var10009;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var10010 = (int)-3175786906566601452L;
      var2 = 1975282480;
      var1 = var10010;
      var10010 = var1 + var2 - 2 * (var1 & var2);
      var2 = -489878376;
      var1 = var10010;
      var2 = var1 + var2 - 2 * (var1 & var2);
      var1 = var10009;
      var10009 = (var1 ^ var2) + 2 * (var1 & var2);
      var2 = 1675677709;
      var1 = 433720070;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var2 = 478707752;
      var1 = var10009;
      var10009 = (var1 | var2) - (var1 & var2);
      String var1746 = "ebi";
      var2 = 1484214098;
      var1 = 1651258791;
      var10010 = (var1 | var2) & ~(var1 & var2);
      var2 = -380567439;
      var1 = var10010;
      var10010 = (var1 | var2) & ~(var1 & var2);
      var10011 = (int)-5490872085105960682L;
      var2 = -1086871245;
      var1 = var10011;
      var10011 = (var1 | var2) - (var1 & var2);
      var2 = -1362860626;
      var1 = var10011;
      var10011 = (var1 | var2) & ~(var1 & var2);
      var10011 = (int)-8724302471729169329L;
      var2 = 1760313331;
      var1 = var10011;
      var10011 = (var1 | var2) - (var1 & var2);
      var2 = 1743590922;
      var1 = var10011;
      var10011 = var1 + var2 - 2 * (var1 & var2);
      var10012 = (int)2455365205488606494L;
      var2 = 515072082;
      var1 = var10012;
      var10012 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1555714019;
      var1 = var10012;
      var10012 = (var1 | var2) - (var1 & var2);
      var10013 = (int)9150169535183573675L;
      var2 = -1149736058;
      var1 = var10013;
      var10013 = var1 + var2 - 2 * (var1 & var2);
      var2 = -780124572;
      var1 = var10013;
      var2 = (var1 | var2) & ~(var1 & var2);
      var1 = var10012;
      var10012 = 2 * (var1 | var2) - (var1 ^ var2);
      var2 = -759629406;
      var1 = -1529897962;
      var10012 = (var1 | var2) & ~(var1 & var2);
      var2 = 1984788827;
      var1 = var10012;
      var1092[var10006] = c(
         "嵆᪭崓\u1ade崔᪭崟\u1ad4嵩᪤", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w", var10009, var10010, var10011, (var1 | var2) - (var1 & var2)
      );
      var2 = -593773151;
      var1 = 1732095356;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var2 = -1146744613;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var2 = -754865811;
      var1 = 1320297393;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1649177902;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var10007 = (int)-8777819785987889569L;
      var2 = 1338380652;
      var1 = var10007;
      var10007 = (var1 | var2) - (var1 & var2);
      var2 = 370014003;
      var1 = var10007;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var10007 = (int)-7793228489637229474L;
      var2 = 104076819;
      var1 = var10007;
      var10007 = (var1 | var2) - (var1 & var2);
      var2 = -1685317054;
      var1 = var10007;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var10007 = (int)2883703042126932756L;
      var2 = -1540920239;
      var1 = var10007;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var2 = -1528608189;
      var1 = var10007;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var2 = 1794363243;
      var1 = -1161741652;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1233080604;
      var1 = var10007;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var2 = -526022690;
      var1 = 2106501840;
      var10009 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1658114816;
      var1 = var10009;
      var10009 = (var1 | var2) - (var1 & var2);
      var10008 = (int)-7831294679910002605L;
      var2 = -2075218379;
      var1 = var10008;
      var10008 = (var1 | var2) - (var1 & var2);
      var2 = 1602761813;
      var1 = var10008;
      var10008 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1665393807;
      var1 = -2110512990;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var2 = -1344608574;
      var1 = var10009;
      var10009 = ((var1 | var2) - (var1 & var2)) * ((var1 | var2) - (var1 & var2));
      var2 = 2054220540;
      var1 = 1046368353;
      var10009 = (var1 | var2) & ~(var1 & var2);
      var2 = 1557857918;
      var1 = var10009;
      var10009 = (var1 | var2) & (~var1 | ~var2);
      var10010 = (int)3475686845163124074L;
      var2 = 653220521;
      var1 = var10010;
      var10010 = (var1 | var2) & ~(var1 & var2);
      var2 = 1865176381;
      var1 = var10010;
      var10010 = (var1 | var2) & ~(var1 & var2);
      var10011 = (int)-7567423107445173769L;
      var2 = 1403264702;
      var1 = var10011;
      var10011 = var1 + var2 - 2 * (var1 & var2);
      var2 = 2054939340;
      var1 = var10011;
      var2 = (var1 | var2) - (var1 & var2);
      var1 = var10010;
      var10010 = (var1 | var2) + (var1 & var2);
      var10010 = (int)-4287715879103217871L;
      var2 = -1181791443;
      var1 = var10010;
      var10010 = (var1 | var2) - (var1 & var2);
      var2 = -1443325822;
      var1 = var10010;
      this.h = new ModeSetting(
            var1051,
            var1092,
            c(
               "嵰\uead3嵪\uead2崙\uead1嵯\uead5",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w",
               var10007,
               var10008,
               var10009,
               (var1 | var2) & (~var1 | ~var2)
            )
         )
         .a(
            () -> {
               ModeSetting var10000 = this.e;
               int var2x = -1333617542;
               int var1x = -2087302282;
               int var10001 = var1x & ~var2x | ~var1x & var2x;
               var2x = 477007674;
               var1x = var10001;
               var10001 = (var1x | var2x) & ~(var1x & var2x);
               int var10003x = (int)331133701345901064L;
               var2x = 1449970984;
               var1x = var10003x;
               var10003x = (var1x | var2x) - (var1x & var2x);
               var2x = -2020788442;
               var1x = var10003x;
               var10003x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = 751737034;
               var1x = 206031635;
               var10003x = var1x & ~var2x | ~var1x & var2x;
               var2x = 545870815;
               var1x = var10003x;
               var10003x = var1x + var2x - 2 * (var1x & var2x);
               var2x = 1118510403;
               var1x = -1340209926;
               var10003x = var1x + var2x - 2 * (var1x & var2x);
               var2x = -223012431;
               var1x = var10003x;
               var10003x = var1x + var2x - 2 * (var1x & var2x);
               var10003x = (int)3283196673204929015L;
               var2x = 544298381;
               var1x = var10003x;
               var10003x = (var1x | var2x) - (var1x & var2x);
               var2x = -1972464535;
               var1x = var10003x;
               var10003x = (var1x | var2x) & ~(var1x & var2x);
               var2x = -508625051;
               var1x = -1681727536;
               var10003x = (var1x | var2x) & ~(var1x & var2x);
               var2x = 2053906617;
               var1x = var10003x;
               var10003x = var1x + var2x - 2 * (var1x & var2x);
               String var143x = "efx";
               var2x = 223575158;
               var1x = -255074379;
               var10003x = var1x + var2x - 2 * (var1x & var2x);
               var2x = -1691682592;
               var1x = var10003x;
               var10003x = (var1x | var2x) & ~(var1x & var2x);
               int var10004x = (int)-2835882710253552554L;
               var2x = -669962744;
               var1x = var10004x;
               var10004x = (var1x | var2x) - (var1x & var2x);
               var2x = -232518703;
               var1x = var10004x;
               var10004x = (var1x | var2x) & ~(var1x & var2x);
               var2x = -1492444189;
               var1x = -790494258;
               int var10005x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = 1548199924;
               var1x = var10005x;
               var2x = (var1x | var2x) & (~var1x | ~var2x);
               var1x = var10004x;
               var10004x = (var1x & ~var2x) + (var2x & ~var1x) + 2 * (var1x & var2x);
               var2x = 1119060160;
               var1x = 894165422;
               var10004x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = -816727622;
               var1x = var10004x;
               var10004x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = -1512284506;
               var1x = -1289119983;
               var10005x = var1x + var2x - 2 * (var1x & var2x);
               var2x = 1971233629;
               var1x = var10005x;
               var10005x = var1x + var2x - 2 * (var1x & var2x);
               int var10006x = (int)5730861436750967816L;
               var2x = -1142234873;
               var1x = var10006x;
               var10006x = (var1x | var2x) - (var1x & var2x);
               var2x = -2019596208;
               var1x = var10006x;
               var2x = (var1x | var2x) & (~var1x | ~var2x);
               var1x = var10005x;
               var10005x = (var1x ^ var2x) + 2 * (var1x & var2x);
               var10005x = (int)5360077829750474267L;
               var2x = -365096337;
               var1x = var10005x;
               var10005x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = -680474929;
               var1x = var10005x;
               var10005x = (var1x | var2x) & ~(var1x & var2x);
               var2x = 1971957791;
               var1x = -2052571443;
               var10006x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = 1057052289;
               var1x = var10006x;
               var10006x = (var1x | var2x) & ~(var1x & var2x);
               int var10007x = (int)-5774120378715511960L;
               var2x = 1635873874;
               var1x = var10007x;
               var10007x = (var1x | var2x) & ~(var1x & var2x);
               var2x = -1026734416;
               var1x = var10007x;
               var2x = (var1x | var2x) & ~(var1x & var2x);
               var1x = var10006x;
               var10006x = (var1x ^ var2x) + 2 * (var1x & var2x);
               var10006x = (int)-8360595774812901957L;
               var2x = 2034011283;
               var1x = var10006x;
               var10006x = var1x & ~var2x | ~var1x & var2x;
               var2x = 311541641;
               var1x = var10006x;
               if (var10000.b(
                  c(
                     "\u0011䖏\b䗽\t䖏Г䗰\b䖄\u0007",
                     "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w",
                     var10003x,
                     var10004x,
                     var10005x,
                     (var1x | var2x) & ~(var1x & var2x)
                  )
               )) {
                  if (b) {
                     throw new RuntimeException();
                  }
               } else {
                  var2x = -1197114358;
                  var1x = -1557826617;
                  var10001 = (var1x | var2x) - (var1x & var2x);
                  var2x = -535692969;
                  var1x = var10001;
                  var10001 = ((var1x | var2x) - (var1x & var2x)) * ((var1x | var2x) - (var1x & var2x));
                  int var10002 = (int)6744878280310193338L;
                  var2x = -269744028;
                  var1x = var10002;
                  var10002 = var1x & ~var2x | ~var1x & var2x;
                  var2x = 742638090;
                  var1x = var10002;
                  var10002 = ((var1x | var2x) & ~(var1x & var2x)) * ((var1x | var2x) & ~(var1x & var2x));
                  String var146x = "efy";
                  var10003x = (int)7971180579189081765L;
                  var2x = 2121692804;
                  var1x = var10003x;
                  var10003x = (var1x | var2x) - (var1x & var2x);
                  var2x = -137696510;
                  var1x = var10003x;
                  var10003x = (var1x | var2x) & ~(var1x & var2x);
                  var10004x = (int)6041379386735957269L;
                  var2x = 1348521341;
                  var1x = var10004x;
                  var10004x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = -2011397428;
                  var1x = var10004x;
                  var10004x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = 84177809;
                  var1x = 436377272;
                  var10005x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = -667703167;
                  var1x = var10005x;
                  var2x = (var1x | var2x) & (~var1x | ~var2x);
                  var1x = var10004x;
                  var10004x = (var1x ^ var2x) + 2 * (var1x & var2x);
                  var10004x = (int)6466914238130427835L;
                  var2x = -1347752925;
                  var1x = var10004x;
                  var10004x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = -1813780714;
                  var1x = var10004x;
                  var10004x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = 1434186863;
                  var1x = -114073694;
                  var10005x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = -1515633851;
                  var1x = var10005x;
                  var10005x = var1x & ~var2x | ~var1x & var2x;
                  var2x = 2016513403;
                  var1x = 934535841;
                  var10006x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = 459234572;
                  var1x = var10006x;
                  var2x = (var1x | var2x) & (~var1x | ~var2x);
                  var1x = var10005x;
                  var10005x = (var1x & ~var2x) + (var2x & ~var1x) + 2 * (var1x & var2x);
                  var10005x = (int)-4182567426720194339L;
                  var2x = 1635259802;
                  var1x = var10005x;
                  var10005x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = -2044418757;
                  var1x = var10005x;
                  var10005x = (var1x | var2x) - (var1x & var2x);
                  String var182x = "efz";
                  var10006x = (int)-5809229075009405019L;
                  var2x = -643226543;
                  var1x = var10006x;
                  var10006x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = -1931658833;
                  var1x = var10006x;
                  if (!this.e
                     .b(
                        c(
                           "\u0012㥰\u0006㥿Г㵠Г㤌\u0003㤊q㥳u㤀",
                           "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w",
                           var10003x,
                           var10004x,
                           var10005x,
                           (var1x | var2x) & (~var1x | ~var2x)
                        )
                     )) {
                     int var125x = (int)3219824152089041091L;
                     var2x = 839219741;
                     var1x = var125x;
                     int var126x = var1x + var2x - 2 * (var1x & var2x);
                     var2x = -92740898;
                     var1x = var126x;
                     return Boolean.valueOf(pulse.Bool.from((var1x | var2x) & ~(var1x & var2x)));
                  }
               }

               var2x = -162914595;
               var1x = -2067715879;
               int var123x = (var1x | var2x) - (var1x & var2x);
               var2x = 1921725957;
               var1x = var123x;
               return Boolean.valueOf(pulse.Bool.from(var1x + var2x - 2 * (var1x & var2x)));
            }
         );
      var2 = -965221966;
      var1 = 980692290;
      var10004 = (var1 | var2) - (var1 & var2);
      var2 = -66859785;
      var1 = var10004;
      var10004 = (var1 | var2) & ~(var1 & var2);
      var2 = -1867700075;
      var1 = 1223891727;
      var10004 = (var1 | var2) & ~(var1 & var2);
      var2 = -664915041;
      var1 = var10004;
      var10004 = var1 + var2 - 2 * (var1 & var2);
      var10004 = (int)6090639364211090459L;
      var2 = 1708985899;
      var1 = var10004;
      var10004 = (var1 | var2) & ~(var1 & var2);
      var2 = 1621959759;
      var1 = var10004;
      var10004 = var1 & ~var2 | ~var1 & var2;
      var2 = -1383419089;
      var1 = 430248630;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var2 = 1076050685;
      var1 = var10005;
      var2 = var1 + var2 - 2 * (var1 & var2);
      var1 = var10004;
      var10004 = (var1 & ~var2) + (var2 & ~var1) + 2 * (var1 & var2);
      var10005 = (int)209143088618552045L;
      var2 = 2142950209;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1497613078;
      var1 = var10005;
      var10005 = ((var1 | var2) & ~(var1 & var2)) * ((var1 | var2) & ~(var1 & var2));
      var2 = -165025441;
      var1 = -1097424052;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = 772608304;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1882499531;
      var1 = -1482228524;
      var10007 = (var1 | var2) & ~(var1 & var2);
      var2 = 678275810;
      var1 = var10007;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      var10007 = (int)-7211991445656199465L;
      var2 = 185262309;
      var1 = var10007;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1517584841;
      var1 = var10007;
      var10007 = (var1 | var2) & ~(var1 & var2);
      var10006 = (int)-8255482817097914051L;
      var2 = -2105636353;
      var1 = var10006;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1420306589;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var2 = 2060794529;
      var1 = -1669583346;
      var10007 = (var1 | var2) - (var1 & var2);
      var2 = 1040330492;
      var1 = var10007;
      var10007 = (var1 | var2) - (var1 & var2);
      var10008 = (int)-1559100497361569528L;
      var2 = -1753136874;
      var1 = var10008;
      var10008 = var1 + var2 - 2 * (var1 & var2);
      var2 = 14858747;
      var1 = var10008;
      var2 = (var1 | var2) & (~var1 | ~var2);
      var1 = var10007;
      var10007 = (var1 ^ var2) + 2 * (var1 & var2);
      var10007 = (int)-1863176033372017445L;
      var2 = -1093969881;
      var1 = var10007;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var2 = 1524648064;
      var1 = var10007;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1905923640;
      var1 = 915138270;
      var10008 = (var1 | var2) & (~var1 | ~var2);
      var2 = 349809557;
      var1 = var10008;
      var10008 = var1 & ~var2 | ~var1 & var2;
      var2 = -141319223;
      var1 = -281051242;
      var10008 = (var1 | var2) & ~(var1 & var2);
      var2 = 417494677;
      var1 = var10008;
      String var1052 = c(
         "嵅것嵩겅嵡ꢘ崐것嵤게嵡", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w", var10005, var10006, var10007, var1 + var2 - 2 * (var1 & var2)
      );
      String var1101 = "ebj";
      var10007 = (int)3840615011757528884L;
      var2 = 1952109820;
      var1 = var10007;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var2 = 1116586951;
      var1 = var10007;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      this.i = new SliderSetting(var1052, 5.0F, 1.0F, 20.0F, 1.0F)
         .a(
            () -> {
               int var10001 = (int)7531720669354252577L;
               int var2x = 1633642290;
               int var1x = var10001;
               var10001 = (var1x | var2x) & ~(var1x & var2x);
               var2x = -1982970686;
               var1x = var10001;
               var10001 = (var1x | var2x) & (~var1x | ~var2x);
               int var10002 = (int)-7913258281289970785L;
               var2x = 1750253485;
               var1x = var10002;
               var10002 = (var1x | var2x) - (var1x & var2x);
               var2x = -733226442;
               var1x = var10002;
               var10002 = var1x + var2x - 2 * (var1x & var2x);
               int var10003x = (int)7106453299692133862L;
               var2x = -1717825120;
               var1x = var10003x;
               var10003x = var1x + var2x - 2 * (var1x & var2x);
               var2x = -1679984931;
               var1x = var10003x;
               var10003x = (var1x & ~var2x | ~var1x & var2x) * (var1x & ~var2x | ~var1x & var2x);
               var2x = -424732965;
               var1x = 1212068488;
               var10003x = (var1x | var2x) - (var1x & var2x);
               var2x = -937164944;
               var1x = var10003x;
               var10003x = (var1x | var2x) & ~(var1x & var2x);
               int var10004x = (int)-6278268767023429306L;
               var2x = 473939030;
               var1x = var10004x;
               var10004x = (var1x | var2x) - (var1x & var2x);
               var2x = 2013428433;
               var1x = var10004x;
               var10004x = var1x & ~var2x | ~var1x & var2x;
               var2x = 459888722;
               var1x = -1282157482;
               int var10005x = var1x + var2x - 2 * (var1x & var2x);
               var2x = -1904725356;
               var1x = var10005x;
               var2x = (var1x | var2x) & ~(var1x & var2x);
               var1x = var10004x;
               var10004x = 2 * (var1x | var2x) - (var1x ^ var2x);
               var2x = -153437362;
               var1x = -1852991210;
               var10004x = (var1x | var2x) & ~(var1x & var2x);
               var2x = -537977029;
               var1x = var10004x;
               var10004x = (var1x | var2x) & ~(var1x & var2x);
               var10005x = (int)3945606315913295733L;
               var2x = -1398538743;
               var1x = var10005x;
               var10005x = (var1x | var2x) & ~(var1x & var2x);
               var2x = -297637935;
               var1x = var10005x;
               var10005x = var1x & ~var2x | ~var1x & var2x;
               int var10006x = (int)3300277820750539018L;
               var2x = -568217103;
               var1x = var10006x;
               var10006x = (var1x | var2x) & ~(var1x & var2x);
               var2x = 860872103;
               var1x = var10006x;
               var2x = (var1x | var2x) & ~(var1x & var2x);
               var1x = var10005x;
               var10005x = 2 * (var1x | var2x) - (var1x ^ var2x);
               var10005x = (int)4680277709274781871L;
               var2x = -1415696950;
               var1x = var10005x;
               var10005x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = 993307927;
               var1x = var10005x;
               var10005x = (var1x | var2x) - (var1x & var2x);
               var2x = -716706140;
               var1x = -1880080691;
               var10006x = var1x + var2x - 2 * (var1x & var2x);
               var2x = -891814241;
               var1x = var10006x;
               var10006x = (var1x | var2x) - (var1x & var2x);
               int var10007x = (int)5506628355576024222L;
               var2x = -921176068;
               var1x = var10007x;
               var10007x = var1x + var2x - 2 * (var1x & var2x);
               var2x = 1429404495;
               var1x = var10007x;
               var2x = (var1x | var2x) - (var1x & var2x);
               var1x = var10006x;
               var10006x = (var1x | var2x) + (var1x & var2x);
               var2x = -1582386464;
               var1x = -650664407;
               var10006x = (var1x | var2x) & ~(var1x & var2x);
               var2x = 2022676454;
               var1x = var10006x;
               if (!this.e
                  .b(
                     c(
                        "\u0010\ud800\t\ud872\b\ud800В\ud87f\t\ud80b\u0006",
                        "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w",
                        var10003x,
                        var10004x,
                        var10005x,
                        (var1x | var2x) & ~(var1x & var2x)
                     )
                  )) {
                  ModeSetting var10000 = this.e;
                  String var106x = "efv";
                  var10002 = (int)2801380046841494055L;
                  var2x = -1997165627;
                  var1x = var10002;
                  var10002 = (var1x | var2x) - (var1x & var2x);
                  var2x = 456642113;
                  var1x = var10002;
                  var10002 = (var1x | var2x) - (var1x & var2x);
                  var2x = 532347889;
                  var1x = 1222320637;
                  var10003x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = -438533768;
                  var1x = var10003x;
                  var10003x = (var1x & ~var2x | ~var1x & var2x) * (var1x & ~var2x | ~var1x & var2x);
                  var10003x = (int)-8135791577039391853L;
                  var2x = 2133131077;
                  var1x = var10003x;
                  var10003x = var1x & ~var2x | ~var1x & var2x;
                  var2x = 1650792437;
                  var1x = var10003x;
                  var10003x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = 1713442701;
                  var1x = -914201054;
                  var10004x = var1x + var2x - 2 * (var1x & var2x);
                  var2x = -2126228519;
                  var1x = var10004x;
                  var10004x = ((var1x | var2x) & ~(var1x & var2x)) * ((var1x | var2x) & ~(var1x & var2x));
                  var10004x = (int)-1542450436748891062L;
                  var2x = 447293323;
                  var1x = var10004x;
                  var10004x = var1x + var2x - 2 * (var1x & var2x);
                  var2x = -1544827585;
                  var1x = var10004x;
                  var10004x = (var1x | var2x) - (var1x & var2x);
                  var10006x = (int)3250157645147676491L;
                  var2x = -1105707100;
                  var1x = var10006x;
                  var10006x = var1x & ~var2x | ~var1x & var2x;
                  var2x = -1055645464;
                  var1x = var10006x;
                  var10006x = (var1x | var2x) - (var1x & var2x);
                  var2x = -1880316790;
                  var1x = 2033490314;
                  var10005x = var1x & ~var2x | ~var1x & var2x;
                  var2x = -238443751;
                  var1x = var10005x;
                  var10005x = (var1x | var2x) & ~(var1x & var2x);
                  String var148x = "efw";
                  var2x = 2095836800;
                  var1x = -2030658456;
                  var10006x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = -99156446;
                  var1x = var10006x;
                  if (!var10000.b(
                     c(
                        "\u0013ퟠ\u0007ퟯВ폰В힜\u0002힚pퟣt힐",
                        "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w",
                        var10003x,
                        var10004x,
                        var10005x,
                        (var1x | var2x) & (~var1x | ~var2x)
                     )
                  )) {
                     int var102x = (int)-1308422927416007366L;
                     var2x = 635573595;
                     var1x = var102x;
                     int var103x = (var1x | var2x) - (var1x & var2x);
                     var2x = -2038009759;
                     var1x = var103x;
                     return Boolean.valueOf(pulse.Bool.from(var1x & ~var2x | ~var1x & var2x));
                  }
               }

               int var99x = (int)-979944794089067181L;
               var2x = 1397947589;
               var1x = var99x;
               var99x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = -1954475625;
               var1x = var99x;
               return Boolean.valueOf(pulse.Bool.from((var1x | var2x) & (~var1x | ~var2x)));
            }
         );
      var2 = -1356823099;
      var1 = 1102221491;
      var10004 = (var1 | var2) - (var1 & var2);
      var2 = -292416139;
      var1 = var10004;
      var10004 = var1 + var2 - 2 * (var1 & var2);
      var10004 = (int)-2024701788491780239L;
      var2 = -1748481596;
      var1 = var10004;
      var10004 = var1 & ~var2 | ~var1 & var2;
      var2 = -149870914;
      var1 = var10004;
      var10004 = var1 + var2 - 2 * (var1 & var2);
      var10004 = (int)8961090733852179376L;
      var2 = -176848435;
      var1 = var10004;
      var10004 = (var1 | var2) - (var1 & var2);
      var2 = -1841808788;
      var1 = var10004;
      var10004 = var1 + var2 - 2 * (var1 & var2);
      var2 = 14966812;
      var1 = 93703222;
      var10004 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1635529355;
      var1 = var10004;
      var10004 = (var1 | var2) & ~(var1 & var2);
      var2 = -491775835;
      var1 = -1562314030;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var2 = 1079042673;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var10006 = (int)-1193854948717322404L;
      var2 = -93643621;
      var1 = var10006;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var2 = 641172426;
      var1 = var10006;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1614065766;
      var1 = -1262220807;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var2 = -722421358;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var2 = -1223000983;
      var1 = -614388180;
      var10006 = (var1 | var2) - (var1 & var2);
      var2 = 1820021327;
      var1 = var10006;
      var10006 = (var1 | var2) - (var1 & var2);
      var10005 = (int)5488810010617387069L;
      var2 = -1482086714;
      var1 = var10005;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = 1802397144;
      var1 = var10005;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      String var1269 = "ebk";
      var2 = -439490022;
      var1 = 968583581;
      var10006 = (var1 | var2) - (var1 & var2);
      var2 = 258049713;
      var1 = var10006;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var2 = -304775049;
      var1 = -463176481;
      var10007 = (var1 | var2) - (var1 & var2);
      var2 = -1395716019;
      var1 = var10007;
      var10007 = ((var1 | var2) & ~(var1 & var2)) * ((var1 | var2) & ~(var1 & var2));
      var10007 = (int)-1336652664023791048L;
      var2 = 985961653;
      var1 = var10007;
      var10007 = (var1 | var2) & (~var1 | ~var2);
      var2 = -909627174;
      var1 = var10007;
      var10007 = (var1 | var2) & ~(var1 & var2);
      var10009 = (int)8775009049469986084L;
      var2 = -36071412;
      var1 = var10009;
      var10009 = (var1 | var2) & (~var1 | ~var2);
      var2 = -207176415;
      var1 = var10009;
      var10009 = (var1 | var2) - (var1 & var2);
      var2 = 2043019512;
      var1 = 1659136641;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var2 = 455240313;
      var1 = var10009;
      var10009 = (var1 | var2) & ~(var1 & var2);
      var10009 = (int)2050641830864517290L;
      var2 = -1894345422;
      var1 = var10009;
      var10009 = (var1 | var2) - (var1 & var2);
      var2 = -315953764;
      var1 = var10009;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var2 = 1423554731;
      var1 = -1523823922;
      var10008 = (var1 | var2) - (var1 & var2);
      var2 = -235711036;
      var1 = var10008;
      String var1053 = c(
         "嵹ꇫ崑ꇫ嵬ꇣ奱ꆒ嵪ꇦ嵥ꇣ", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w", var10005, var10006, var10007, (var1 | var2) & ~(var1 & var2)
      );
      var10004 = (int)630341174376675839L;
      var2 = 1831533216;
      var1 = var10004;
      var10004 = var1 + var2 - 2 * (var1 & var2);
      var2 = 2026229122;
      var1 = var10004;
      var10004 = (var1 | var2) & ~(var1 & var2);
      var10005 = (int)-2031505675862991471L;
      var2 = -356267371;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1573775369;
      var1 = var10005;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var10006 = (int)-251222991811584338L;
      var2 = -921847676;
      var1 = var10006;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1419285894;
      var1 = var10006;
      var10006 = (var1 & ~var2 | ~var1 & var2) * (var1 & ~var2 | ~var1 & var2);
      var10007 = (int)2935721171429676L;
      var2 = -397980687;
      var1 = var10007;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var2 = -1155674433;
      var1 = var10007;
      var10007 = (var1 & ~var2 | ~var1 & var2) * (var1 & ~var2 | ~var1 & var2);
      this.j = new SliderSetting(var1053, 0.1F, 0.05F, 0.5F, 0.01F)
         .a(
            () -> {
               int var2x = 921286084;
               int var1x = 1030029302;
               int var10001 = (var1x | var2x) - (var1x & var2x);
               var2x = -877751732;
               var1x = var10001;
               var10001 = ((var1x | var2x) - (var1x & var2x)) * ((var1x | var2x) - (var1x & var2x));
               int var10002 = (int)-6575238247004629290L;
               var2x = -178870316;
               var1x = var10002;
               var10002 = (var1x | var2x) & (~var1x | ~var2x);
               var2x = 1073744117;
               var1x = var10002;
               var10002 = (var1x | var2x) & ~(var1x & var2x);
               int var10003x = (int)825771427868996676L;
               var2x = 1060604201;
               var1x = var10003x;
               var10003x = (var1x | var2x) - (var1x & var2x);
               var2x = -1641522939;
               var1x = var10003x;
               var10003x = ((var1x | var2x) & ~(var1x & var2x)) * ((var1x | var2x) & ~(var1x & var2x));
               var10003x = (int)-6735252907235281736L;
               var2x = -4637213;
               var1x = var10003x;
               var10003x = (var1x | var2x) & ~(var1x & var2x);
               var2x = -153513352;
               var1x = var10003x;
               var10003x = (var1x | var2x) & (~var1x | ~var2x);
               String var10004x = "eft";
               var2x = -1279418788;
               var1x = -1752171605;
               int var156x = (var1x | var2x) - (var1x & var2x);
               var2x = -1663534931;
               var1x = var156x;
               int var157x = (var1x | var2x) & ~(var1x & var2x);
               var2x = -1097956350;
               var1x = 1414578973;
               int var10005x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = 1607232871;
               var1x = var10005x;
               var10005x = (var1x | var2x) & ~(var1x & var2x);
               var2x = -2138174259;
               var1x = 419533325;
               int var10006x = var1x & ~var2x | ~var1x & var2x;
               var2x = 448910015;
               var1x = var10006x;
               var2x = var1x + var2x - 2 * (var1x & var2x);
               var1x = var10005x;
               var10005x = (var1x & ~var2x) + (var2x & ~var1x) + 2 * (var1x & var2x);
               var2x = 1882909124;
               var1x = -2014981278;
               var10005x = (var1x | var2x) - (var1x & var2x);
               var2x = -534042131;
               var1x = var10005x;
               var10005x = (var1x | var2x) & (~var1x | ~var2x);
               String var175x = "efu";
               var10006x = (int)-7776149886855661097L;
               var2x = 37949073;
               var1x = var10006x;
               var10006x = var1x & ~var2x | ~var1x & var2x;
               var2x = -1278389149;
               var1x = var10006x;
               if (!this.e
                  .b(
                     c(
                        "\u0013㠉\n㡻\u000b㠉Б㡶\n㠂\u0005",
                        "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w",
                        var10003x,
                        var157x,
                        var10005x,
                        (var1x | var2x) & (~var1x | ~var2x)
                     )
                  )) {
                  ModeSetting var10000 = this.e;
                  var10001 = (int)-8289357288163552612L;
                  var2x = 962382866;
                  var1x = var10001;
                  var10001 = (var1x | var2x) - (var1x & var2x);
                  var2x = -1557147779;
                  var1x = var10001;
                  var10001 = (var1x | var2x) & ~(var1x & var2x);
                  var2x = 213851517;
                  var1x = 835571964;
                  var10002 = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = 287256019;
                  var1x = var10002;
                  var2x = (var1x | var2x) & ~(var1x & var2x);
                  var1x = var10001;
                  var10001 = (var1x ^ var2x) + 2 * (var1x & var2x);
                  var10002 = (int)6930531819944283079L;
                  var2x = -1060203928;
                  var1x = var10002;
                  var10002 = var1x + var2x - 2 * (var1x & var2x);
                  var2x = 194874225;
                  var1x = var10002;
                  var10002 = (var1x | var2x) & ~(var1x & var2x);
                  var10003x = (int)1762160469211523261L;
                  var2x = -1250751884;
                  var1x = var10003x;
                  var10003x = var1x + var2x - 2 * (var1x & var2x);
                  var2x = -322483072;
                  var1x = var10003x;
                  var2x = (var1x | var2x) - (var1x & var2x);
                  var1x = var10002;
                  var10002 = var1x - ~var2x - 1;
                  var10003x = (int)-6805961175166179043L;
                  var2x = 2130633837;
                  var1x = var10003x;
                  var10003x = var1x + var2x - 2 * (var1x & var2x);
                  var2x = -1282514756;
                  var1x = var10003x;
                  var10003x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = -13837193;
                  var1x = 1411505552;
                  int var158x = var1x + var2x - 2 * (var1x & var2x);
                  var2x = 1000003687;
                  var1x = var158x;
                  var2x = (var1x | var2x) & ~(var1x & var2x);
                  var1x = var10003x;
                  var10003x = (var1x ^ var2x) + 2 * (var1x & var2x);
                  var10003x = (int)7191399796985899512L;
                  var2x = 1783589333;
                  var1x = var10003x;
                  var10003x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = -1915479282;
                  var1x = var10003x;
                  var10003x = var1x & ~var2x | ~var1x & var2x;
                  int var159x = (int)-4258827176809647511L;
                  var2x = -1910273699;
                  var1x = var159x;
                  int var160x = var1x & ~var2x | ~var1x & var2x;
                  var2x = 728090074;
                  var1x = var160x;
                  int var161x = ((var1x | var2x) - (var1x & var2x)) * ((var1x | var2x) - (var1x & var2x));
                  var2x = 445622334;
                  var1x = 109151706;
                  int var162x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = -1527876426;
                  var1x = var162x;
                  int var163x = (var1x | var2x) - (var1x & var2x);
                  var10005x = (int)1958408848525211979L;
                  var2x = 701979736;
                  var1x = var10005x;
                  var10005x = var1x + var2x - 2 * (var1x & var2x);
                  var2x = -1244921885;
                  var1x = var10005x;
                  var10005x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = -2118367318;
                  var1x = -1566023608;
                  var10006x = var1x & ~var2x | ~var1x & var2x;
                  var2x = -1329732273;
                  var1x = var10006x;
                  var2x = (var1x | var2x) & (~var1x | ~var2x);
                  var1x = var10005x;
                  var10005x = 2 * (var1x | var2x) - (var1x ^ var2x);
                  var10005x = (int)-181811598131256580L;
                  var2x = 811390185;
                  var1x = var10005x;
                  var10005x = (var1x | var2x) - (var1x & var2x);
                  var2x = -2054698506;
                  var1x = var10005x;
                  var10005x = (var1x | var2x) & ~(var1x & var2x);
                  int var10007x = (int)8617357007921776487L;
                  var2x = 719385948;
                  var1x = var10007x;
                  var10007x = (var1x | var2x) - (var1x & var2x);
                  var2x = -1794739656;
                  var1x = var10007x;
                  var10007x = (var1x | var2x) & ~(var1x & var2x);
                  var10007x = (int)-2814873108663335368L;
                  var2x = 2009811982;
                  var1x = var10007x;
                  var10007x = var1x + var2x - 2 * (var1x & var2x);
                  var2x = 966380071;
                  var1x = var10007x;
                  var10007x = (var1x | var2x) - (var1x & var2x);
                  var10007x = (int)4313518105613961950L;
                  var2x = 1092790584;
                  var1x = var10007x;
                  var10007x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = -1334533147;
                  var1x = var10007x;
                  var10007x = (var1x | var2x) & ~(var1x & var2x);
                  var10007x = (int)2305071870823860264L;
                  var2x = 1903653503;
                  var1x = var10007x;
                  var10007x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = 725940823;
                  var1x = var10007x;
                  var10007x = var1x + var2x - 2 * (var1x & var2x);
                  var10007x = (int)-3696862002404347250L;
                  var2x = -454309279;
                  var1x = var10007x;
                  var10007x = var1x + var2x - 2 * (var1x & var2x);
                  var2x = -1612220183;
                  var1x = var10007x;
                  var10007x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = -978357489;
                  var1x = -2133353470;
                  var10006x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = 1162244112;
                  var1x = var10006x;
                  if (!var10000.b(
                     c(
                        "\u0010쐴\u0004쐻Б쀤Б쑈\u0001쑎s쐷w쑄",
                        "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w",
                        var10003x,
                        var163x,
                        var10005x,
                        (var1x | var2x) & (~var1x | ~var2x)
                     )
                  )) {
                     var2x = 744210442;
                     var1x = -1802813441;
                     int var129x = (var1x | var2x) & ~(var1x & var2x);
                     var2x = -1194262539;
                     var1x = var129x;
                     return Boolean.valueOf(pulse.Bool.from((var1x | var2x) - (var1x & var2x)));
                  }
               }

               var2x = -1483181979;
               var1x = -927788714;
               int var127x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = 1865113906;
               var1x = var127x;
               return Boolean.valueOf(pulse.Bool.from(var1x + var2x - 2 * (var1x & var2x)));
            }
         );
      var2 = -907643301;
      var1 = 626670665;
      var10003 = (var1 | var2) & ~(var1 & var2);
      var2 = 952872303;
      var1 = var10003;
      var10003 = ((var1 | var2) & ~(var1 & var2)) * ((var1 | var2) & ~(var1 & var2));
      String var1115 = "ebl";
      var10006 = (int)-8214941428004532260L;
      var2 = -1137008569;
      var1 = var10006;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var2 = 18673547;
      var1 = var10006;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var10006 = (int)-509094448941332944L;
      var2 = -70424036;
      var1 = var10006;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1048046635;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var2 = -1541494190;
      var1 = 590816240;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var2 = -509881727;
      var1 = var10005;
      var10005 = (var1 | var2) & ~(var1 & var2);
      String var1281 = "ebm";
      var2 = -151073277;
      var1 = -486793228;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var2 = -952054481;
      var1 = var10006;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1204989023;
      var1 = -347529395;
      var10007 = (var1 | var2) - (var1 & var2);
      var2 = 330204928;
      var1 = var10007;
      var10007 = ((var1 | var2) & (~var1 | ~var2)) * ((var1 | var2) & (~var1 | ~var2));
      var10007 = (int)603470499345811319L;
      var2 = -1871318121;
      var1 = var10007;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1230609826;
      var1 = var10007;
      var10007 = (var1 | var2) - (var1 & var2);
      var2 = 650320440;
      var1 = 1212574902;
      var10008 = (var1 | var2) & ~(var1 & var2);
      var2 = 978062550;
      var1 = var10008;
      var10008 = (var1 | var2) - (var1 & var2);
      var2 = 601736829;
      var1 = 1444510989;
      var10009 = (var1 | var2) & ~(var1 & var2);
      var2 = 460959582;
      var1 = var10009;
      var2 = var1 & ~var2 | ~var1 & var2;
      var1 = var10008;
      var10008 = (var1 & ~var2) + (var2 & ~var1) + 2 * (var1 & var2);
      var10008 = (int)-1858647872556492085L;
      var2 = 1550154924;
      var1 = var10008;
      var10008 = var1 + var2 - 2 * (var1 & var2);
      var2 = -571942620;
      var1 = var10008;
      String var1056 = c(
         "嵷뤃嵤륳奱뤋嵪뤉嵤뤌崓뤁", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w", var10005, var10006, var10007, var1 + var2 - 2 * (var1 & var2)
      );
      var2 = 1618789541;
      var1 = -363411314;
      var10004 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1976955862;
      var1 = var10004;
      this.k = new BooleanSetting(var1056, pulse.Bool.from((var1 | var2) & (var1 & var2 ^ -1)))
         .a(
            () -> {
               ModeSetting var10000 = this.e;
               int var2x = 1402441463;
               int var1x = -675808276;
               int var10001 = var1x & ~var2x | ~var1x & var2x;
               var2x = 99762152;
               var1x = var10001;
               var10001 = (var1x | var2x) & ~(var1x & var2x);
               int var10002 = (int)-6147141510778300766L;
               var2x = 1953353910;
               var1x = var10002;
               var10002 = (var1x | var2x) - (var1x & var2x);
               var2x = 1251031772;
               var1x = var10002;
               var2x = var1x & ~var2x | ~var1x & var2x;
               var1x = var10001;
               var10001 = (var1x | var2x) + (var1x & var2x);
               var10002 = (int)8534141471755938445L;
               var2x = 5070520;
               var1x = var10002;
               var10002 = (var1x | var2x) - (var1x & var2x);
               var2x = 552209358;
               var1x = var10002;
               var10002 = (var1x | var2x) & ~(var1x & var2x);
               var2x = -993169646;
               var1x = -1251684119;
               int var10003x = var1x & ~var2x | ~var1x & var2x;
               var2x = -2017764418;
               var1x = var10003x;
               var10003x = (var1x | var2x) - (var1x & var2x);
               int var10004x = (int)-7270166602717074961L;
               var2x = 460355440;
               var1x = var10004x;
               var10004x = (var1x | var2x) & ~(var1x & var2x);
               var2x = 1952380346;
               var1x = var10004x;
               var2x = (var1x | var2x) & ~(var1x & var2x);
               var1x = var10003x;
               var10003x = (var1x & ~var2x) + (var2x & ~var1x) + 2 * (var1x & var2x);
               var2x = -373758110;
               var1x = 1965332452;
               var10003x = (var1x | var2x) - (var1x & var2x);
               var2x = -97637467;
               var1x = var10003x;
               var10003x = (var1x | var2x) & ~(var1x & var2x);
               String var163x = "efq";
               var10004x = (int)5678397972495748219L;
               var2x = -1830139355;
               var1x = var10004x;
               var10004x = var1x + var2x - 2 * (var1x & var2x);
               var2x = -235824802;
               var1x = var10004x;
               var10004x = var1x & ~var2x | ~var1x & var2x;
               int var10005x = (int)9093406296432603847L;
               var2x = -914500359;
               var1x = var10005x;
               var10005x = var1x + var2x - 2 * (var1x & var2x);
               var2x = -1335285646;
               var1x = var10005x;
               var10005x = (var1x | var2x) & ~(var1x & var2x);
               var2x = 509485001;
               var1x = -1687084088;
               int var10006x = (var1x | var2x) & ~(var1x & var2x);
               var2x = 1181701741;
               var1x = var10006x;
               var2x = var1x & ~var2x | ~var1x & var2x;
               var1x = var10005x;
               var10005x = var1x - ~var2x - 1;
               var2x = -1385790780;
               var1x = 286098058;
               var10005x = var1x & ~var2x | ~var1x & var2x;
               var2x = -1089047145;
               var1x = var10005x;
               var10005x = (var1x | var2x) & ~(var1x & var2x);
               var2x = 6228055;
               var1x = 637704723;
               int var10007x = var1x & ~var2x | ~var1x & var2x;
               var2x = 643666496;
               var1x = var10007x;
               var10007x = var1x + var2x - 2 * (var1x & var2x);
               var10007x = (int)-6976590964655950777L;
               var2x = -1845112587;
               var1x = var10007x;
               var10007x = var1x + var2x - 2 * (var1x & var2x);
               var2x = -1568758622;
               var1x = var10007x;
               var10007x = (var1x | var2x) - (var1x & var2x);
               var10007x = (int)-7568270347124475118L;
               var2x = -1762276885;
               var1x = var10007x;
               var10007x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = 762327801;
               var1x = var10007x;
               var10007x = (var1x | var2x) - (var1x & var2x);
               var10007x = (int)-8756311328540172883L;
               var2x = -614248269;
               var1x = var10007x;
               var10007x = var1x + var2x - 2 * (var1x & var2x);
               var2x = -1933505254;
               var1x = var10007x;
               var10007x = var1x & ~var2x | ~var1x & var2x;
               var10006x = (int)-6113416999306772120L;
               var2x = 1594753166;
               var1x = var10006x;
               var10006x = (var1x | var2x) & ~(var1x & var2x);
               var2x = 2133042476;
               var1x = var10006x;
               if (!var10000.b(
                  c(
                     "\u0012뿧\u000b뾕\n뿧А뾘\u000b뿬\u0004",
                     "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w",
                     var10003x,
                     var10004x,
                     var10005x,
                     var1x + var2x - 2 * (var1x & var2x)
                  )
               )) {
                  var10000 = this.e;
                  var2x = 39287754;
                  var1x = 343463665;
                  var10002 = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = 372223290;
                  var1x = var10002;
                  var10002 = (var1x | var2x) - (var1x & var2x);
                  var2x = -55159557;
                  var1x = -288367957;
                  var10002 = (var1x | var2x) - (var1x & var2x);
                  var2x = 309956188;
                  var1x = var10002;
                  var10002 = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = -943430701;
                  var1x = 1071686076;
                  var10002 = (var1x | var2x) - (var1x & var2x);
                  var2x = -131808662;
                  var1x = var10002;
                  var10002 = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = -2022463312;
                  var1x = 1738210175;
                  var10002 = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = -521579553;
                  var1x = var10002;
                  var10002 = (var1x | var2x) - (var1x & var2x);
                  var10002 = (int)7673508041976417258L;
                  var2x = 1265960603;
                  var1x = var10002;
                  var10002 = (var1x | var2x) & ~(var1x & var2x);
                  var2x = -353369669;
                  var1x = var10002;
                  var10002 = (var1x | var2x) - (var1x & var2x);
                  String var159x = "efr";
                  var2x = 1302592896;
                  var1x = -1963493032;
                  var10003x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = -1578704901;
                  var1x = var10003x;
                  var10003x = (var1x | var2x) & ~(var1x & var2x);
                  var10005x = (int)5214426863420147310L;
                  var2x = 123544762;
                  var1x = var10005x;
                  var10005x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = -499866928;
                  var1x = var10005x;
                  var10005x = (var1x | var2x) & (~var1x | ~var2x);
                  var10005x = (int)-7470850569576514365L;
                  var2x = -1981664537;
                  var1x = var10005x;
                  var10005x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = -1212166618;
                  var1x = var10005x;
                  var10005x = var1x + var2x - 2 * (var1x & var2x);
                  var10005x = (int)-9153386771334790633L;
                  var2x = 694698888;
                  var1x = var10005x;
                  var10005x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = 1136443796;
                  var1x = var10005x;
                  var10005x = var1x + var2x - 2 * (var1x & var2x);
                  var2x = 2054869992;
                  var1x = -1275938538;
                  var10004x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = 1899901607;
                  var1x = var10004x;
                  var10004x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = 981486160;
                  var1x = 2129869402;
                  var10005x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = -1376550586;
                  var1x = var10005x;
                  var10005x = var1x + var2x - 2 * (var1x & var2x);
                  var2x = 289179124;
                  var1x = 1655450087;
                  var10006x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = -1377889959;
                  var1x = var10006x;
                  var2x = var1x + var2x - 2 * (var1x & var2x);
                  var1x = var10005x;
                  var10005x = (var1x | var2x) + (var1x & var2x);
                  var10005x = (int)-7699138260964121432L;
                  var2x = -1797979011;
                  var1x = var10005x;
                  var10005x = (var1x | var2x) - (var1x & var2x);
                  var2x = -1790621348;
                  var1x = var10005x;
                  var10005x = (var1x | var2x) & ~(var1x & var2x);
                  String var192x = "efs";
                  var2x = -106949187;
                  var1x = -823239147;
                  var10006x = var1x & ~var2x | ~var1x & var2x;
                  var2x = 928699787;
                  var1x = var10006x;
                  if (!var10000.b(
                     c(
                        "\u0011씋\u0005씄А섛А앷\u0000앱r씈v앻",
                        "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w",
                        var10003x,
                        var10004x,
                        var10005x,
                        (var1x | var2x) - (var1x & var2x)
                     )
                  )) {
                     var2x = 1493393279;
                     var1x = -743168885;
                     int var137x = (var1x | var2x) - (var1x & var2x);
                     var2x = -1967686668;
                     var1x = var137x;
                     return Boolean.valueOf(pulse.Bool.from(var1x & ~var2x | ~var1x & var2x));
                  }
               }

               int var134x = (int)-5801001558553221154L;
               var2x = 1792254760;
               var1x = var134x;
               int var135x = var1x & ~var2x | ~var1x & var2x;
               var2x = 572589303;
               var1x = var135x;
               return Boolean.valueOf(pulse.Bool.from((var1x | var2x) & (~var1x | ~var2x)));
            }
         );
      String var1057 = "ebn";
      var10004 = (int)8902353155710794745L;
      var2 = 876682408;
      var1 = var10004;
      var10004 = (var1 | var2) - (var1 & var2);
      var2 = -471935759;
      var1 = var10004;
      var10004 = (var1 | var2) & (~var1 | ~var2);
      var10005 = (int)-8914300383180622823L;
      var2 = 497515121;
      var1 = var10005;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1540600841;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var2 = -1419850262;
      var1 = 1112827869;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1631794626;
      var1 = var10006;
      var2 = var1 + var2 - 2 * (var1 & var2);
      var1 = var10005;
      var10005 = var1 - ~var2 - 1;
      var10005 = (int)6363988285933883826L;
      var2 = 1641878546;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var2 = -692494717;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var10006 = (int)7433151087280580063L;
      var2 = 917389043;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var2 = -597652633;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var10006 = (int)-3931535594095414037L;
      var2 = -1746173891;
      var1 = var10006;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1352564496;
      var1 = var10006;
      var10006 = (var1 | var2) - (var1 & var2);
      var10007 = (int)-6296831440723183210L;
      var2 = -43134946;
      var1 = var10007;
      var10007 = (var1 | var2) & (~var1 | ~var2);
      var2 = -2034198251;
      var1 = var10007;
      var10007 = (var1 + var2 - 2 * (var1 & var2)) * (var1 + var2 - 2 * (var1 & var2));
      var2 = 1749985924;
      var1 = 1533765384;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var2 = 565169711;
      var1 = var10007;
      var10007 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1007190879;
      var1 = -1022328513;
      var10009 = (var1 | var2) & (~var1 | ~var2);
      var2 = 15203741;
      var1 = var10009;
      var10009 = (var1 | var2) & (~var1 | ~var2);
      var10009 = (int)2300540076914800748L;
      var2 = -1895991724;
      var1 = var10009;
      var10009 = (var1 | var2) & ~(var1 & var2);
      var2 = 1391660587;
      var1 = var10009;
      var10009 = (var1 | var2) & ~(var1 & var2);
      var2 = -3319235;
      var1 = 773994091;
      var10009 = (var1 | var2) - (var1 & var2);
      var2 = -772838305;
      var1 = var10009;
      var10009 = var1 + var2 - 2 * (var1 & var2);
      var10008 = (int)-5594506650323643134L;
      var2 = 2114460299;
      var1 = var10008;
      var10008 = (var1 | var2) & ~(var1 & var2);
      var2 = -743956040;
      var1 = var10008;
      this.l = new ColorSetting(
            c("嵋⡳崐⠁嵯⡿嵬⠈嵨Ᵽ崗⡱嵤⠁", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w", var10005, var10006, var10007, (var1 | var2) & (~var1 | ~var2)),
            Color.WHITE
         )
         .a(
            () -> {
               label20: {
                  int var4x = -904903668;
                  int var3x = 107004227;
                  int var10001 = (var3x | var4x) & (~var3x | ~var4x);
                  var4x = 2044057773;
                  var3x = var10001;
                  var10001 = ((var3x | var4x) & ~(var3x & var4x)) * ((var3x | var4x) & ~(var3x & var4x));
                  var4x = -1903583926;
                  var3x = -1569122468;
                  int var10002 = (var3x | var4x) & ~(var3x & var4x);
                  var4x = -94714557;
                  var3x = var10002;
                  var10002 = (var3x | var4x) & (~var3x | ~var4x);
                  String var10003x = "efo";
                  var4x = 2037328084;
                  var3x = 1372969811;
                  int var157x = (var3x | var4x) & (~var3x | ~var4x);
                  var4x = 1309190308;
                  var3x = var157x;
                  int var158x = (var3x | var4x) - (var3x & var4x);
                  int var10004x = (int)5865446919323715162L;
                  var4x = -886196278;
                  var3x = var10004x;
                  var10004x = (var3x | var4x) & ~(var3x & var4x);
                  var4x = -2124606639;
                  var3x = var10004x;
                  var10004x = var3x & ~var4x | ~var3x & var4x;
                  var10004x = (int)7096817949189891441L;
                  var4x = 755584556;
                  var3x = var10004x;
                  var10004x = var3x & ~var4x | ~var3x & var4x;
                  var4x = -1799559387;
                  var3x = var10004x;
                  var10004x = (var3x | var4x) & ~(var3x & var4x);
                  var4x = 1336918879;
                  var3x = 885685564;
                  int var10005x = (var3x | var4x) & (~var3x | ~var4x);
                  var4x = -862968774;
                  var3x = var10005x;
                  var10005x = (var3x + var4x - 2 * (var3x & var4x)) * (var3x + var4x - 2 * (var3x & var4x));
                  var10005x = (int)-7185261276257423518L;
                  var4x = -686285095;
                  var3x = var10005x;
                  var10005x = (var3x | var4x) - (var3x & var4x);
                  var4x = -532891358;
                  var3x = var10005x;
                  var10005x = var3x + var4x - 2 * (var3x & var4x);
                  var4x = -839759123;
                  var3x = -1583173806;
                  int var10006x = var3x & ~var4x | ~var3x & var4x;
                  var4x = -942118789;
                  var3x = var10006x;
                  var10006x = (var3x + var4x - 2 * (var3x & var4x)) * (var3x + var4x - 2 * (var3x & var4x));
                  var4x = -1060800269;
                  var3x = -1588801079;
                  var10006x = var3x & ~var4x | ~var3x & var4x;
                  var4x = 1636416379;
                  var3x = var10006x;
                  if (!this.e
                     .b(
                        c(
                           "\u0015䥫\f䤙\r䥫З䤔\f䥠\u0003",
                           "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w",
                           var158x,
                           var10004x,
                           var10005x,
                           (var3x | var4x) & ~(var3x & var4x)
                        )
                     )) {
                     ModeSetting var10000 = this.e;
                     var10002 = (int)1074851006404005033L;
                     var4x = -1454994253;
                     var3x = var10002;
                     var10002 = (var3x | var4x) - (var3x & var4x);
                     var4x = 241696786;
                     var3x = var10002;
                     var10002 = var3x + var4x - 2 * (var3x & var4x);
                     var10002 = (int)8642681729466448888L;
                     var4x = -2126346023;
                     var3x = var10002;
                     var10002 = var3x & ~var4x | ~var3x & var4x;
                     var4x = 1993978670;
                     var3x = var10002;
                     var10002 = (var3x | var4x) - (var3x & var4x);
                     var10002 = (int)-3348714072787170149L;
                     var4x = -1196829283;
                     var3x = var10002;
                     var10002 = (var3x | var4x) & ~(var3x & var4x);
                     var4x = -1115514616;
                     var3x = var10002;
                     var10002 = (var3x | var4x) & ~(var3x & var4x);
                     var4x = -939309298;
                     var3x = 1505041840;
                     var10002 = var3x + var4x - 2 * (var3x & var4x);
                     var4x = -1850320209;
                     var3x = var10002;
                     var10002 = (var3x | var4x) - (var3x & var4x);
                     var4x = 544527049;
                     var3x = -127279863;
                     var10002 = var3x + var4x - 2 * (var3x & var4x);
                     var4x = -1494076591;
                     var3x = var10002;
                     var10002 = (var3x | var4x) & ~(var3x & var4x);
                     int var159x = (int)8878398136079907442L;
                     var4x = -442608443;
                     var3x = var159x;
                     int var160x = (var3x | var4x) & (~var3x | ~var4x);
                     var4x = 526340568;
                     var3x = var160x;
                     int var161x = (var3x & ~var4x | ~var3x & var4x) * (var3x & ~var4x | ~var3x & var4x);
                     int var162x = (int)-4033695326234561379L;
                     var4x = -1888222716;
                     var3x = var162x;
                     int var163x = (var3x | var4x) - (var3x & var4x);
                     var4x = 174386618;
                     var3x = var163x;
                     int var164x = (var3x | var4x) & (~var3x | ~var4x);
                     var10004x = (int)-2965093261645610619L;
                     var4x = -709979172;
                     var3x = var10004x;
                     var10004x = (var3x | var4x) - (var3x & var4x);
                     var4x = -1838810905;
                     var3x = var10004x;
                     var10004x = (var3x | var4x) & ~(var3x & var4x);
                     var10004x = (int)2093435328817944075L;
                     var4x = -1745531074;
                     var3x = var10004x;
                     var10004x = var3x & ~var4x | ~var3x & var4x;
                     var4x = 558306614;
                     var3x = var10004x;
                     var10004x = var3x + var4x - 2 * (var3x & var4x);
                     var4x = -1039677033;
                     var3x = -1540954858;
                     var10006x = (var3x | var4x) & (~var3x | ~var4x);
                     var4x = 1713450131;
                     var3x = var10006x;
                     var10006x = (var3x | var4x) & ~(var3x & var4x);
                     var10006x = (int)4603416974129784325L;
                     var4x = 925987542;
                     var3x = var10006x;
                     var10006x = (var3x | var4x) & (~var3x | ~var4x);
                     var4x = 791876823;
                     var3x = var10006x;
                     var10006x = (var3x | var4x) & ~(var3x & var4x);
                     var4x = 2131439049;
                     var3x = 1952119012;
                     var10006x = (var3x | var4x) & ~(var3x & var4x);
                     var4x = 189912357;
                     var3x = var10006x;
                     var10006x = var3x & ~var4x | ~var3x & var4x;
                     var10006x = (int)-1157388900108994246L;
                     var4x = 1680804551;
                     var3x = var10006x;
                     var10006x = (var3x | var4x) & (~var3x | ~var4x);
                     var4x = 170587116;
                     var3x = var10006x;
                     var10006x = var3x + var4x - 2 * (var3x & var4x);
                     var10006x = (int)-4974081832908399524L;
                     var4x = 344101039;
                     var3x = var10006x;
                     var10006x = var3x & ~var4x | ~var3x & var4x;
                     var4x = 1430768887;
                     var3x = var10006x;
                     var10006x = (var3x | var4x) & (~var3x | ~var4x);
                     var4x = 1301879406;
                     var3x = -600481167;
                     var10005x = (var3x | var4x) & (~var3x | ~var4x);
                     var4x = -1664916354;
                     var3x = var10005x;
                     var10005x = (var3x | var4x) & (~var3x | ~var4x);
                     var10006x = (int)-4983103775072169964L;
                     var4x = 1597991668;
                     var3x = var10006x;
                     var10006x = (var3x | var4x) & (~var3x | ~var4x);
                     var4x = -1957144698;
                     var3x = var10006x;
                     var10006x = var3x & ~var4x | ~var3x & var4x;
                     int var10007x = (int)-766126149383922438L;
                     var4x = 548902538;
                     var3x = var10007x;
                     var10007x = (var3x | var4x) & (~var3x | ~var4x);
                     var4x = 1669180988;
                     var3x = var10007x;
                     var4x = var3x + var4x - 2 * (var3x & var4x);
                     var3x = var10006x;
                     var10006x = (var3x & ~var4x) + (var4x & ~var3x) + 2 * (var3x & var4x);
                     var10006x = (int)-1699234125438431258L;
                     var4x = -569049491;
                     var3x = var10006x;
                     var10006x = (var3x | var4x) & ~(var3x & var4x);
                     var4x = 84926535;
                     var3x = var10006x;
                     if (!var10000.b(
                        c(
                           "\u0016ૣ\u0002૬З\u0ef3Зટ\u0007ઙuૠqઓ",
                           "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w",
                           var164x,
                           var10004x,
                           var10005x,
                           (var3x | var4x) - (var3x & var4x)
                        )
                     )) {
                        break label20;
                     }
                  }

                  if (!this.k.a()) {
                     var4x = 313970646;
                     var3x = 279404398;
                     int var133x = var3x & ~var4x | ~var3x & var4x;
                     var4x = 34705593;
                     var3x = var133x;
                     var133x = (var3x | var4x) & (~var3x | ~var4x);
                     String var137x = "efp";
                     var4x = -952632718;
                     var3x = -593906629;
                     var10001 = var3x + var4x - 2 * (var3x & var4x);
                     var4x = 1150127135;
                     var3x = var10001;
                     int var2x = (var3x | var4x) & (~var3x | ~var4x);
                     var4x = -794911919;
                     var3x = 719499321;
                     var10001 = (var3x | var4x) - (var3x & var4x);
                     var4x = 348662814;
                     var3x = var10001;
                     var10001 = ((var3x | var4x) & (~var3x | ~var4x)) * ((var3x | var4x) & (~var3x | ~var4x));
                     var10001 = (int)256275713943091795L;
                     var4x = 1229227512;
                     var3x = var10001;
                     var10001 = (var3x | var4x) - (var3x & var4x);
                     var4x = 202104583;
                     var3x = var10001;
                     if (var3x + var4x - 2 * (var3x & var4x) >= var2x) {
                        throw new ExceptionInInitializerError();
                     }

                     return Boolean.valueOf(pulse.Bool.from(var133x));
                  }
               }

               int var131x = 345797708;
               int var67x = 252007105;
               int var135x = var67x & ~var131x | ~var67x & var131x;
               var131x = 463021709;
               var67x = var135x;
               return Boolean.valueOf(pulse.Bool.from(var67x + var131x - 2 * (var67x & var131x)));
            }
         );
      String var1058 = "ebo";
      String var1120 = "ebp";
      var2 = -1194141259;
      var1 = -1498471304;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var2 = 511573471;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var10006 = (int)-1039801238789904067L;
      var2 = -1241225959;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var2 = -85013467;
      var1 = var10006;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var10006 = (int)973611944482853454L;
      var2 = -543659120;
      var1 = var10006;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1818376660;
      var1 = var10006;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var10006 = (int)-210403497912524573L;
      var2 = -1457752890;
      var1 = var10006;
      var10006 = (var1 | var2) - (var1 & var2);
      var2 = -1905208287;
      var1 = var10006;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var2 = 27030100;
      var1 = -1934791402;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var2 = -343718815;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      String var1302 = "ebq";
      var2 = 283921494;
      var1 = 1714992475;
      var10006 = (var1 | var2) - (var1 & var2);
      var2 = -1516974337;
      var1 = var10006;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var2 = 355160820;
      var1 = -1870264418;
      var10007 = (var1 | var2) & ~(var1 & var2);
      var2 = -954744696;
      var1 = var10007;
      var10007 = ((var1 | var2) & ~(var1 & var2)) * ((var1 | var2) & ~(var1 & var2));
      var2 = 376235316;
      var1 = 382809936;
      var10007 = (var1 | var2) & (~var1 | ~var2);
      var2 = 4899856;
      var1 = var10007;
      var10007 = (var1 | var2) & (~var1 | ~var2);
      String var1538 = "ebr";
      var2 = 2099774855;
      var1 = -1591403541;
      var10008 = (var1 | var2) & (~var1 | ~var2);
      var2 = -601701327;
      var1 = var10008;
      this.m = new SettingGroup(
            c("嵶\udc1f崐\udc6d嵩\udc69崚", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w", var10005, var10006, var10007, (var1 | var2) - (var1 & var2))
         )
         .a(
            () -> {
               ModeSetting var10000 = this.e;
               String var10001 = "efn";
               int var10002 = (int)-6194755853835788512L;
               int var2x = -363304460;
               int var1x = var10002;
               var10002 = (var1x | var2x) & (~var1x | ~var2x);
               var2x = -504242420;
               var1x = var10002;
               var10002 = ((var1x | var2x) & ~(var1x & var2x)) * ((var1x | var2x) & ~(var1x & var2x));
               int var10003x = (int)-8745324528797751046L;
               var2x = 2024482448;
               var1x = var10003x;
               var10003x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = 1596570443;
               var1x = var10003x;
               var10003x = var1x & ~var2x | ~var1x & var2x;
               int var10004x = (int)-4254679174267013777L;
               var2x = 273544271;
               var1x = var10004x;
               var10004x = var1x & ~var2x | ~var1x & var2x;
               var2x = -2045646054;
               var1x = var10004x;
               var2x = var1x + var2x - 2 * (var1x & var2x);
               var1x = var10003x;
               var10003x = 2 * (var1x | var2x) - (var1x ^ var2x);
               var2x = -1008818841;
               var1x = -545553722;
               var10003x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = 2048359554;
               var1x = var10003x;
               var10003x = var1x & ~var2x | ~var1x & var2x;
               var2x = 862807804;
               var1x = -218857616;
               var10004x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = 941112885;
               var1x = var10004x;
               var10004x = (var1x | var2x) & ~(var1x & var2x);
               var2x = -568267010;
               var1x = 1901006919;
               int var10005x = var1x + var2x - 2 * (var1x & var2x);
               var2x = 1739673518;
               var1x = var10005x;
               var2x = var1x & ~var2x | ~var1x & var2x;
               var1x = var10004x;
               var10004x = (var1x | var2x) + (var1x & var2x);
               var10004x = (int)2365686557558911459L;
               var2x = 51115350;
               var1x = var10004x;
               var10004x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = 1523985954;
               var1x = var10004x;
               var10004x = var1x & ~var2x | ~var1x & var2x;
               var2x = 1320012674;
               var1x = 563550420;
               int var10006x = var1x & ~var2x | ~var1x & var2x;
               var2x = 1866126166;
               var1x = var10006x;
               var10006x = var1x & ~var2x | ~var1x & var2x;
               var2x = 1047670133;
               var1x = 1520693203;
               var10006x = var1x & ~var2x | ~var1x & var2x;
               var2x = 1691468449;
               var1x = var10006x;
               var10006x = var1x & ~var2x | ~var1x & var2x;
               var2x = 1355354832;
               var1x = -966059028;
               var10006x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = -1767765703;
               var1x = var10006x;
               var10006x = (var1x | var2x) - (var1x & var2x);
               var10005x = (int)7545399261842341385L;
               var2x = -1965417093;
               var1x = var10005x;
               var10005x = var1x + var2x - 2 * (var1x & var2x);
               var2x = 1186500806;
               var1x = var10005x;
               var10005x = (var1x | var2x) - (var1x & var2x);
               var10006x = (int)-1633843113444593487L;
               var2x = 934322;
               var1x = var10006x;
               var10006x = var1x & ~var2x | ~var1x & var2x;
               var2x = -717242138;
               var1x = var10006x;
               var10006x = (var1x | var2x) - (var1x & var2x);
               var10006x = (int)-5574723847065596764L;
               var2x = -1344659923;
               var1x = var10006x;
               var10006x = (var1x | var2x) - (var1x & var2x);
               var2x = -783113514;
               var1x = var10006x;
               return var10000.b(
                  c(
                     "\u0017歱\u0003歾Ж潡Ж欍\u0006欋t歲p欁",
                     "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w",
                     var10003x,
                     var10004x,
                     var10005x,
                     (var1x | var2x) - (var1x & var2x)
                  )
               );
            }
         );
      String var1059 = "ebs";
      String var1121 = "ebt";
      var10005 = (int)-8192033836609818028L;
      var2 = -491700752;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1738333155;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var10005 = (int)5505064533845961734L;
      var2 = 1350150848;
      var1 = var10005;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var2 = -206135835;
      var1 = var10005;
      var10005 = (var1 | var2) - (var1 & var2);
      var2 = -1722534062;
      var1 = 1920320333;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var2 = -350096354;
      var1 = var10007;
      var10007 = (var1 | var2) & ~(var1 & var2);
      var2 = 1972144545;
      var1 = 979558364;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var2 = 1341019775;
      var1 = var10007;
      var10007 = (var1 | var2) - (var1 & var2);
      var2 = -954114276;
      var1 = 926248981;
      var10007 = (var1 | var2) & (~var1 | ~var2);
      var2 = -267112702;
      var1 = var10007;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var10006 = (int)-1854524868474079483L;
      var2 = 659813730;
      var1 = var10006;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var2 = -949282827;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var2 = -2020383307;
      var1 = -2076716480;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var2 = -1361316615;
      var1 = var10007;
      var10007 = (var1 | var2) & ~(var1 & var2);
      var2 = -1888112361;
      var1 = 1591251293;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      var2 = -921319878;
      var1 = var10007;
      var10007 = (var1 | var2) & ~(var1 & var2);
      String var1540 = "ebu";
      var2 = -159852029;
      var1 = -1468297175;
      var10008 = (var1 | var2) - (var1 & var2);
      var2 = 1580367319;
      var1 = var10008;
      String var1060 = c(
         "嵱ㆺ嵧ㆷ嵭㖯崖ㆿ崐㇍嵩㇉", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w", var10005, var10006, var10007, var1 + var2 - 2 * (var1 & var2)
      );
      var2 = -897627934;
      var1 = -160273945;
      var10004 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1007493383;
      var1 = var10004;
      String[] var1123 = new String[(var1 | var2) - (var1 & var2)];
      var10006 = (int)2486869770585675344L;
      var2 = 1643210660;
      var1 = var10006;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var2 = 1067184628;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var2 = 651731542;
      var1 = 1267145295;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      var2 = 722850950;
      var1 = var10007;
      var10007 = (var1 + var2 - 2 * (var1 & var2)) * (var1 + var2 - 2 * (var1 & var2));
      var2 = -37090717;
      var1 = -1758082002;
      var10008 = var1 + var2 - 2 * (var1 & var2);
      var2 = 252474445;
      var1 = var10008;
      var10008 = (var1 | var2) & ~(var1 & var2);
      var2 = -911505171;
      var1 = 1420385746;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var2 = 2070725982;
      var1 = var10009;
      var10009 = var1 + var2 - 2 * (var1 & var2);
      var2 = 644907233;
      var1 = 74821410;
      var10010 = (var1 | var2) - (var1 & var2);
      var2 = 558829213;
      var1 = var10010;
      var2 = var1 & ~var2 | ~var1 & var2;
      var1 = var10009;
      var10009 = (var1 | var2) + (var1 & var2);
      var2 = -1398693039;
      var1 = 872621499;
      var10009 = (var1 | var2) - (var1 & var2);
      var2 = -32449079;
      var1 = var10009;
      var10009 = (var1 | var2) - (var1 & var2);
      var10010 = (int)-901423628535083392L;
      var2 = 1186334437;
      var1 = var10010;
      var10010 = (var1 | var2) & ~(var1 & var2);
      var2 = -959372246;
      var1 = var10010;
      var10010 = var1 & ~var2 | ~var1 & var2;
      var10010 = (int)8806374203688984270L;
      var2 = -1749215327;
      var1 = var10010;
      var10010 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1592178040;
      var1 = var10010;
      var10010 = var1 + var2 - 2 * (var1 & var2);
      String var1819 = "ebv";
      var10011 = (int)-6246102568926264988L;
      var2 = 618686587;
      var1 = var10011;
      var10011 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1407789633;
      var1 = var10011;
      var10011 = var1 + var2 - 2 * (var1 & var2);
      var2 = -410336883;
      var1 = -26843030;
      var10012 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1737619712;
      var1 = var10012;
      var10012 = ((var1 | var2) - (var1 & var2)) * ((var1 | var2) - (var1 & var2));
      var2 = -1387917060;
      var1 = -1109370037;
      var10012 = (var1 | var2) - (var1 & var2);
      var2 = 278500661;
      var1 = var10012;
      var1123[var10006] = c(
         "嵎\ud8ce嵥\udcd0嵬\ud8ce嵢\ud8c0嵭\ud8c8",
         "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w",
         var10009,
         var10010,
         var10011,
         (var1 | var2) & (~var1 | ~var2)
      );
      var2 = 443609745;
      var1 = -2100787021;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var2 = -1732740573;
      var1 = var10006;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      String var1434 = "ebw";
      var10008 = (int)-1826551867188799318L;
      var2 = -939565899;
      var1 = var10008;
      var10008 = var1 & ~var2 | ~var1 & var2;
      var2 = -871696925;
      var1 = var10008;
      var10008 = var1 & ~var2 | ~var1 & var2;
      var2 = -1520288642;
      var1 = 424953055;
      var10009 = (var1 | var2) & (~var1 | ~var2);
      var2 = -533413992;
      var1 = var10009;
      var2 = (var1 | var2) & ~(var1 & var2);
      var1 = var10008;
      var10008 = var1 - ~var2 - 1;
      var2 = 885402612;
      var1 = -2146569167;
      var10009 = var1 + var2 - 2 * (var1 & var2);
      var2 = 757112900;
      var1 = var10009;
      var10009 = (var1 | var2) - (var1 & var2);
      var10009 = (int)5674710261482952437L;
      var2 = -1758463666;
      var1 = var10009;
      var10009 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1265185944;
      var1 = var10009;
      var10009 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1004012027;
      var1 = -495486938;
      var10011 = (var1 | var2) - (var1 & var2);
      var2 = -642811441;
      var1 = var10011;
      var10011 = (var1 | var2) - (var1 & var2);
      var10011 = (int)-6362601477744065179L;
      var2 = -2048793521;
      var1 = var10011;
      var10011 = var1 + var2 - 2 * (var1 & var2);
      var2 = 441540901;
      var1 = var10011;
      var10011 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1800540031;
      var1 = 2072935347;
      var10010 = (var1 | var2) & ~(var1 & var2);
      var2 = -1006636776;
      var1 = var10010;
      var10010 = var1 + var2 - 2 * (var1 & var2);
      var10011 = 691139727 ^ -1017775278 ^ 880313336;
      var10011 = 784375204 ^ 2052977049 ^ 1161697252;
      var10012 = (955557478 ^ -48208842 ^ -827135453) + ((int)1788576715585264857L ^ -763896711 ^ -672427443);
      var1123[var10006] = c(
         "嵎\u2e73奱⸏嵤\u2e76崒",
         "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w",
         var10009,
         var10010,
         var10011,
         (int)-1035111647904462574L ^ 2036475352 ^ -1162345227
      );
      String var1187 = "ebx";
      var10006 = ((int)1441959356716738365L ^ 378651713 ^ -819286619) * ((int)1441959356716738365L ^ 378651713 ^ -819286619);
      var10007 = (int)1685427353842102602L ^ -139107256 ^ 62654121;
      var10007 = 321787679 ^ -124413078 ^ -1928734890;
      var10008 = (int)2944280425831914885L ^ 1552942903 ^ -207178899;
      var10008 = -1853126855 ^ -1302611800 ^ -251838243;
      var10010 = -1647956797 ^ 648098230 ^ -1150870153;
      var10009 = -2080410720 ^ 1745939660 ^ -168912765;
      String var1765 = "eby";
      this.n = new ModeSetting(
            var1060,
            var1123,
            c("嵎⟻嵥⏥嵬⟻嵢⟵嵭⟽", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w", var10007, var10008, var10009, 693182450 ^ 258420142 ^ 640357355)
         )
         .a(
            () -> {
               ModeSetting var10000 = this.e;
               String var10001 = "efk";
               int var10002 = (int)3017541730131698799L;
               int var2x = 765888628;
               int var1x = var10002;
               var10002 = var1x + var2x - 2 * (var1x & var2x);
               var2x = 1869688843;
               var1x = var10002;
               var10002 = (var1x | var2x) & ~(var1x & var2x);
               int var10003x = (int)4852534889686541830L;
               var2x = 1550407670;
               var1x = var10003x;
               var10003x = (var1x | var2x) - (var1x & var2x);
               var2x = -785764672;
               var1x = var10003x;
               var2x = (var1x | var2x) - (var1x & var2x);
               var1x = var10002;
               var10002 = (var1x ^ var2x) + 2 * (var1x & var2x);
               String var125x = "efl";
               var2x = 1721782955;
               var1x = 2057573395;
               var10003x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = 2058755483;
               var1x = var10003x;
               var10003x = var1x & ~var2x | ~var1x & var2x;
               int var10004x = (int)2793927849698989L;
               var2x = 599711426;
               var1x = var10004x;
               var10004x = (var1x | var2x) & ~(var1x & var2x);
               var2x = 636791262;
               var1x = var10004x;
               var10004x = var1x + var2x - 2 * (var1x & var2x);
               var2x = 1483631273;
               var1x = -1143997611;
               int var10005x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = 1558758668;
               var1x = var10005x;
               var2x = var1x + var2x - 2 * (var1x & var2x);
               var1x = var10004x;
               var10004x = (var1x & ~var2x) + (var2x & ~var1x) + 2 * (var1x & var2x);
               var10004x = (int)2430596935649550587L;
               var2x = -487408605;
               var1x = var10004x;
               var10004x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = -1484110454;
               var1x = var10004x;
               var10004x = var1x + var2x - 2 * (var1x & var2x);
               var2x = 1233227487;
               var1x = 1653820948;
               var10005x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = -2005949308;
               var1x = var10005x;
               var10005x = var1x + var2x - 2 * (var1x & var2x);
               var2x = 810482850;
               var1x = 1170614495;
               var10005x = var1x + var2x - 2 * (var1x & var2x);
               var2x = 1930827115;
               var1x = var10005x;
               var10005x = (var1x | var2x) & (~var1x | ~var2x);
               int var10007x = (int)-39415089486680159L;
               var2x = 1259147024;
               var1x = var10007x;
               var10007x = (var1x | var2x) & ~(var1x & var2x);
               var2x = 324411583;
               var1x = var10007x;
               var10007x = (var1x | var2x) & (~var1x | ~var2x);
               int var10006x = (int)-780979174005249708L;
               var2x = -742642114;
               var1x = var10006x;
               var10006x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = -274884493;
               var1x = var10006x;
               if (!var10000.b(
                  c(
                     "\u0017萱\u000e葃\u000f萱Е葈\u0005葎w萷s葄",
                     "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w",
                     var10003x,
                     var10004x,
                     var10005x,
                     var1x & ~var2x | ~var1x & var2x
                  )
               )) {
                  var10000 = this.e;
                  var2x = 1946344224;
                  var1x = -1333260727;
                  int var115x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = 2038011891;
                  var1x = var115x;
                  int var116x = var1x + var2x - 2 * (var1x & var2x);
                  var10002 = (int)-2216036593621010390L;
                  var2x = 246646999;
                  var1x = var10002;
                  var10002 = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = -73097356;
                  var1x = var10002;
                  var10002 = (var1x | var2x) - (var1x & var2x);
                  var2x = -909038605;
                  var1x = 111133553;
                  var10003x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = 45635184;
                  var1x = var10003x;
                  var2x = (var1x | var2x) - (var1x & var2x);
                  var1x = var10002;
                  var10002 = (var1x | var2x) + (var1x & var2x);
                  String var129x = "efm";
                  var2x = -1258276805;
                  var1x = -1859270823;
                  var10003x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = 1117758529;
                  var1x = var10003x;
                  var10003x = (var1x | var2x) - (var1x & var2x);
                  var2x = 1943977804;
                  var1x = -620325718;
                  var10005x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = -1462227991;
                  var1x = var10005x;
                  var10005x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = 1946267657;
                  var1x = -1739450070;
                  var10005x = var1x & ~var2x | ~var1x & var2x;
                  var2x = -330061523;
                  var1x = var10005x;
                  var10005x = (var1x | var2x) - (var1x & var2x);
                  var2x = -1088587595;
                  var1x = -709207357;
                  var10005x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = 1789338237;
                  var1x = var10005x;
                  var10005x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = -1134024814;
                  var1x = 737087328;
                  var10004x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = 792767080;
                  var1x = var10004x;
                  var10004x = (var1x | var2x) - (var1x & var2x);
                  var2x = -1320517441;
                  var1x = 1784878315;
                  var10005x = (var1x | var2x) - (var1x & var2x);
                  var2x = -483936274;
                  var1x = var10005x;
                  var10005x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = -369315729;
                  var1x = 1320369238;
                  var10006x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = 127389118;
                  var1x = var10006x;
                  var2x = (var1x | var2x) - (var1x & var2x);
                  var1x = var10005x;
                  var10005x = (var1x ^ var2x) + 2 * (var1x & var2x);
                  var10005x = (int)939680772413845308L;
                  var2x = 1083768526;
                  var1x = var10005x;
                  var10005x = var1x & ~var2x | ~var1x & var2x;
                  var2x = 1494407010;
                  var1x = var10005x;
                  var10005x = var1x & ~var2x | ~var1x & var2x;
                  var10006x = (int)-8981745040975435510L;
                  var2x = 96339712;
                  var1x = var10006x;
                  var10006x = var1x & ~var2x | ~var1x & var2x;
                  var2x = -2023240893;
                  var1x = var10006x;
                  var10006x = (var1x + var2x - 2 * (var1x & var2x)) * (var1x + var2x - 2 * (var1x & var2x));
                  var2x = -334191158;
                  var1x = -2138445435;
                  var10006x = var1x & ~var2x | ~var1x & var2x;
                  var2x = 1824031790;
                  var1x = var10006x;
                  if (!var10000.b(
                     c(
                        "\u0014鍌\u0000鍃Е靜Е錰\u0005錶w鍏s錼",
                        "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w",
                        var10003x,
                        var10004x,
                        var10005x,
                        (var1x | var2x) & ~(var1x & var2x)
                     )
                  )) {
                     int var113x = (int)-7647482417570194788L;
                     var2x = -792897945;
                     var1x = var113x;
                     int var114x = (var1x | var2x) & (~var1x | ~var2x);
                     var2x = -1307341573;
                     var1x = var114x;
                     return Boolean.valueOf(pulse.Bool.from(var1x & ~var2x | ~var1x & var2x));
                  }
               }

               int var110x = (int)-3980931798436005774L;
               var2x = 17458888;
               var1x = var110x;
               int var111x = (var1x | var2x) & ~(var1x & var2x);
               var2x = 102784699;
               var1x = var111x;
               return Boolean.valueOf(pulse.Bool.from(var1x + var2x - 2 * (var1x & var2x)));
            }
         );
      var10003 = ((int)1160583881718307026L ^ -785117616 ^ 1496905880) + ((int)-7003672053444265878L ^ 1530043706 ^ 1455974484);
      var10004 = ((int)3724144859525418379L ^ 1858541691 ^ -12742775) + ((int)6930469768895766429L ^ 1736154254 ^ 1153799116);
      var10005 = (-1794091221 ^ -2117967971 ^ -1052266800) + ((int)1351931249766317293L ^ -1041851745 ^ 1773875616);
      var10005 = (int)-4656896165908594788L ^ 1081555233 ^ 1709628830;
      var10006 = ((int)8574252409512635001L ^ 2060353174 ^ 137320352) + ((int)2725612423317228978L ^ -1343402931 ^ 1926402695);
      var10006 = 1066886214 ^ 172426878 ^ -423421051;
      var10007 = 934308554 ^ -585355532 ^ -1823318898;
      var10007 = (int)-8688358203193436301L ^ -1177688255 ^ -532691804;
      String var1550 = "ebz";
      String var1062 = c(
         "嵳ᩢ嵮Ṻ崖ᩪ崐ᨘ嵩\u1a1c", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w", var10005, var10006, var10007, -1435289667 ^ -1482511552 ^ 231899349
      );
      String[] var1125 = new String[(int)3079471612872246294L ^ -981855888 ^ 2019317088];
      var10006 = (int)-3194332771870513353L ^ 240222479 ^ -1609210312;
      var10008 = (int)-1316956413826463523L ^ 754147852 ^ -1379865900;
      var10008 = (int)2388297547787586612L ^ 1273960397 ^ 37739514;
      var10008 = -1667560386 ^ 1707113268 ^ -111446268;
      var10008 = (1665763322 ^ -136133267 ^ 1809134073) + (-1575792521 ^ 162661285 ^ 493199972);
      var10009 = (-1936673531 ^ -160284539 ^ -411427313) + ((int)-8636746853539564427L ^ 1836353705 ^ -1248667486);
      var10009 = -317082660 ^ -1700563791 ^ 285776974;
      var10010 = (-1236974451 ^ 1597339730 ^ -825888835) * (-1236974451 ^ 1597339730 ^ -825888835);
      var10010 = -1625328292 ^ 267388722 ^ 1138034745;
      String var1830 = "eca";
      var10011 = (int)6653103545786166539L ^ -2025789858 ^ 1316223484;
      var10012 = ((int)821997480391665080L ^ -1470346365 ^ -308448291) * ((int)821997480391665080L ^ -1470346365 ^ -308448291);
      var1125[var10006] = c(
         "嵰᪅崑᪄崗᪅",
         "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w",
         var10009,
         var10010,
         var10011,
         (int)-4040800366035393803L ^ -1242658107 ^ 1408611570
      );
      var10006 = (int)7346538278454311806L ^ -1452112722 ^ -1452884015;
      var10007 = (1760027395 ^ -210735574 ^ 2011774778) * (1760027395 ^ -210735574 ^ 2011774778);
      var10008 = (int)-8325073579758249279L ^ 1672663336 ^ 20048293;
      var10009 = ((int)-2628414180298414475L ^ -1955208186 ^ -1004229885) + ((int)-6541096380408032375L ^ 157619698 ^ 1747818429);
      var10009 = (int)8470136707963657041L ^ -641011620 ^ 844312622;
      var10011 = -1328788564 ^ -1804311519 ^ 616050574;
      var10011 = (int)-4021935812653962757L ^ 483608988 ^ 495313002;
      var10011 = 148319869 ^ -1049145513 ^ -912236254;
      var10010 = (int)1555612592159324052L ^ -1333428272 ^ 2021489099;
      String var1835 = "ecb";
      var10011 = (int)1557461661886638650L ^ 980387895 ^ 364348130;
      var10012 = ((int)-7471242660851184334L ^ 1357825229 ^ 1980644573) + ((int)-694173599531388313L ^ -689339060 ^ -1923561441);
      var1125[var10006] = c(
         "嵉闉嵫闈嵡", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w", var10009, var10010, var10011, 1062766535 ^ 1637347199 ^ 1591802690
      );
      var10006 = 1864328790 ^ -1820736225 ^ -60382389;
      var10007 = 398823153 ^ -1974530391 ^ 580571390;
      var10008 = -685839607 ^ 1719358961 ^ -179396861;
      var10009 = ((int)1786292068554796193L ^ -679225659 ^ -1981262037) + (887745210 ^ 943084694 ^ -1525177118);
      var10009 = (int)-7299698575935300039L ^ 332388734 ^ 1619926116;
      var10010 = ((int)-4672200393352049272L ^ 1137788672 ^ -8508300) * ((int)-4672200393352049272L ^ 1137788672 ^ -8508300);
      var10010 = (int)3066725834383561298L ^ 429903516 ^ 659621304;
      var10011 = (365407603 ^ 1012795322 ^ 1085655324) * (365407603 ^ 1012795322 ^ 1085655324);
      var10011 = (int)-9148865990096170082L ^ -1863579829 ^ 1115433963;
      var10012 = (-403660532 ^ -1559036614 ^ -1907898197) + ((int)-6588525269516223779L ^ -467688454 ^ 1459692399);
      var1125[var10006] = c(
         "嵰綮嵤綥嵩綮嵫綣", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w", var10009, var10010, var10011, 585293388 ^ 1493821547 ^ 2076659142
      );
      var10006 = -788002466 ^ -1830427731 ^ 1139665648;
      var10007 = 1155350610 ^ -267174356 ^ -1660077667;
      var10008 = (int)1003774845199762320L ^ 1324225832 ^ -1523529709;
      var10010 = (int)-1052616654290672419L ^ -1756476753 ^ 1259761271;
      var10010 = (int)-1837140738909276937L ^ 253175225 ^ 1241436490;
      var10010 = (int)-6362562255878386649L ^ 284285124 ^ -1107405598;
      var10009 = (int)-3702191580832478328L ^ -2054041659 ^ -1389731986;
      var10010 = ((int)3185370543050004322L ^ -205890979 ^ 769515009) + (-1986910823 ^ 1359261399 ^ 1197810057);
      var10010 = -681440817 ^ 477607958 ^ 407592241;
      var10011 = ((int)-4897710252642399125L ^ -436927510 ^ -65919748) + ((int)345318728429930451L ^ -870820566 ^ -1555035351);
      var10011 = -1630143912 ^ -1997977450 ^ 906030115;
      var10012 = -845748428 ^ 960613236 ^ 969427696;
      var1125[var10006] = c(
         "嵰褙崞褜嵩褔",
         "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w",
         var10009,
         var10010,
         var10011,
         (int)-4962655968737362819L ^ 1762448393 ^ -106059993
      );
      var10006 = (int)-464077245582194992L ^ -322651654 ^ -662700242;
      String var1442 = "ecc";
      String var1558 = "ecd";
      String var1688 = "ece";
      var10009 = (int)4991850169037810204L ^ 2070520391 ^ -56421512;
      var10010 = ((int)-9023010314121362391L ^ 819257883 ^ 1873761508) * ((int)-9023010314121362391L ^ 819257883 ^ 1873761508);
      var10010 = (int)7712341475882755649L ^ -1810569440 ^ -1346001838;
      var10011 = ((int)3651260233371435378L ^ -1877519542 ^ 663375543) * ((int)3651260233371435378L ^ -1877519542 ^ 663375543);
      var10011 = -305875544 ^ -571235068 ^ 849422474;
      var10012 = ((int)-1890692845266426123L ^ 543554755 ^ -795952566) * ((int)-1890692845266426123L ^ 543554755 ^ -795952566);
      var1125[var10006] = c(
         "嵆䇞嵤䇛嵥䇜",
         "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w",
         var10009,
         var10010,
         var10011,
         (int)-8735202904150622975L ^ 386764720 ^ 1986589999
      );
      var10006 = (int)140217288534150762L ^ 735113559 ^ -1583169736;
      var10007 = (int)-7742311904908145190L ^ 2093381315 ^ 599800695;
      String var1559 = "ecf";
      String var1690 = "ecg";
      var10009 = (int)1622001108128624666L ^ -268885977 ^ -1979675874;
      var10011 = -972875653 ^ -654277482 ^ 520330492;
      var10011 = -1974450568 ^ 424395205 ^ -1826912331;
      var10010 = (int)-3440551611572576100L ^ 986381894 ^ 688222898;
      var10012 = (int)-1294371718344101894L ^ 691596373 ^ -1712241745;
      var10011 = (int)-8460470212366561778L ^ -1676199789 ^ 1243108326;
      var10012 = (819027567 ^ -184190412 ^ -1072231513) + (-1281463104 ^ -946130105 ^ -1491012729);
      var1125[var10006] = c(
         "嵅좟嵪좚嵡죡", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w", var10009, var10010, var10011, -732666398 ^ 281574057 ^ -997076584
      );
      var10005 = (int)-485533191493045233L ^ 2101573511 ^ 2057846478;
      var10006 = ((int)-3328577662918415107L ^ -1702443186 ^ -567537865) + ((int)6905118267349109147L ^ -1828466943 ^ -1741552825);
      String var1444 = "ech";
      var10007 = 1335263713 ^ 122419008 ^ 779038082;
      var10009 = -826390076 ^ 1202400776 ^ -1995085879;
      var10009 = 498113916 ^ 489360084 ^ 10196903;
      var10008 = (int)6940716822264970646L ^ 241357444 ^ -118419230;
      var10009 = (928566696 ^ 1343099286 ^ 1446463780) * (928566696 ^ 1343099286 ^ 1446463780);
      var10009 = -387697948 ^ 1601035113 ^ -1465859486;
      var10010 = (1034415647 ^ 648216104 ^ -1132635059) + ((int)5574387242191638456L ^ 1086848074 ^ -722735180);
      this.o = new ModeSetting(
            var1062,
            var1125,
            c(
               "嵰搜崑搝崗搜",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w",
               var10007,
               var10008,
               var10009,
               (int)1500641770280410107L ^ 1245673023 ^ 247418783
            )
         )
         .a(
            () -> {
               int var10001 = (int)-3653931497344024757L;
               int var2x = 31663589;
               int var1x = var10001;
               var10001 = (var1x | var2x) - (var1x & var2x);
               var2x = 485564755;
               var1x = var10001;
               var10001 = (var1x & ~var2x | ~var1x & var2x) * (var1x & ~var2x | ~var1x & var2x);
               var2x = -871715322;
               var1x = -1909286637;
               int var10002 = (var1x | var2x) - (var1x & var2x);
               var2x = -900143299;
               var1x = var10002;
               var10002 = (var1x | var2x) - (var1x & var2x);
               var2x = -271218318;
               var1x = -1321254846;
               int var10003x = (var1x | var2x) & ~(var1x & var2x);
               var2x = 1740578332;
               var1x = var10003x;
               var10003x = var1x & ~var2x | ~var1x & var2x;
               var10003x = (int)1267610791924645567L;
               var2x = -801134868;
               var1x = var10003x;
               var10003x = (var1x | var2x) - (var1x & var2x);
               var2x = 546521968;
               var1x = var10003x;
               var10003x = (var1x | var2x) & (~var1x | ~var2x);
               String var10004x = "efi";
               var2x = -1473050696;
               var1x = 45341210;
               int var136x = (var1x | var2x) - (var1x & var2x);
               var2x = 308843626;
               var1x = var136x;
               int var137x = var1x + var2x - 2 * (var1x & var2x);
               var2x = -1730585194;
               var1x = 1495898335;
               int var10005x = var1x + var2x - 2 * (var1x & var2x);
               var2x = -665240014;
               var1x = var10005x;
               var10005x = var1x & ~var2x | ~var1x & var2x;
               var2x = -419680604;
               var1x = -2000270279;
               int var10006x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = 225470443;
               var1x = var10006x;
               var2x = (var1x | var2x) & (~var1x | ~var2x);
               var1x = var10005x;
               var10005x = 2 * (var1x | var2x) - (var1x ^ var2x);
               var10005x = (int)-4622495301187501446L;
               var2x = -781946740;
               var1x = var10005x;
               var10005x = (var1x | var2x) - (var1x & var2x);
               var2x = 1871817792;
               var1x = var10005x;
               var10005x = var1x + var2x - 2 * (var1x & var2x);
               String var160x = "efj";
               var10006x = (int)-1185362411743370424L;
               var2x = 703610436;
               var1x = var10006x;
               var10006x = (var1x | var2x) - (var1x & var2x);
               var2x = -1671884158;
               var1x = var10006x;
               if (!this.e
                  .b(
                     c(
                        "\u0016풧\u000f퓕\u000e풧Д퓞\u0004퓘v풡r퓒",
                        "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w",
                        var10003x,
                        var137x,
                        var10005x,
                        (var1x | var2x) & (~var1x | ~var2x)
                     )
                  )) {
                  ModeSetting var10000 = this.e;
                  var10002 = (int)-3577619148248506456L;
                  var2x = -1125232446;
                  var1x = var10002;
                  var10002 = var1x + var2x - 2 * (var1x & var2x);
                  var2x = 1273843560;
                  var1x = var10002;
                  var10002 = (var1x | var2x) & ~(var1x & var2x);
                  var10002 = (int)6138656253006480755L;
                  var2x = 1463448700;
                  var1x = var10002;
                  var10002 = var1x & ~var2x | ~var1x & var2x;
                  var2x = -644550400;
                  var1x = var10002;
                  var10002 = (var1x | var2x) & (~var1x | ~var2x);
                  var10002 = (int)1973338457977197922L;
                  var2x = 850527072;
                  var1x = var10002;
                  var10002 = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = 1676350988;
                  var1x = var10002;
                  var10002 = (var1x | var2x) - (var1x & var2x);
                  var10002 = (int)1780504074231822027L;
                  var2x = -280900669;
                  var1x = var10002;
                  var10002 = var1x + var2x - 2 * (var1x & var2x);
                  var2x = 1324940558;
                  var1x = var10002;
                  var10002 = var1x + var2x - 2 * (var1x & var2x);
                  var2x = 1691974155;
                  var1x = -137231113;
                  var10002 = var1x & ~var2x | ~var1x & var2x;
                  var2x = -1768856802;
                  var1x = var10002;
                  var10002 = var1x + var2x - 2 * (var1x & var2x);
                  var2x = 1675253308;
                  var1x = -802481834;
                  int var138x = (var1x | var2x) - (var1x & var2x);
                  var2x = -1276031130;
                  var1x = var138x;
                  int var139x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = 1337798963;
                  var1x = 567836809;
                  int var140x = var1x + var2x - 2 * (var1x & var2x);
                  var2x = 1852158390;
                  var1x = var140x;
                  int var141x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = 774761449;
                  var1x = 1265212459;
                  var10003x = var1x & ~var2x | ~var1x & var2x;
                  var2x = 66464993;
                  var1x = var10003x;
                  var10003x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = -1171378990;
                  var1x = 426783960;
                  int var142x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = 471991752;
                  var1x = var142x;
                  int var143x = var1x & ~var2x | ~var1x & var2x;
                  var10005x = (int)214772302891307318L;
                  var2x = 582593168;
                  var1x = var10005x;
                  var10005x = var1x & ~var2x | ~var1x & var2x;
                  var2x = -1696948046;
                  var1x = var10005x;
                  var2x = (var1x | var2x) & (~var1x | ~var2x);
                  var1x = var143x;
                  int var144x = (var1x & ~var2x) + (var2x & ~var1x) + 2 * (var1x & var2x);
                  int var145x = (int)-510036672221457729L;
                  var2x = -823770888;
                  var1x = var145x;
                  int var146x = (var1x | var2x) - (var1x & var2x);
                  var2x = 667992443;
                  var1x = var146x;
                  int var147x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = 472766707;
                  var1x = 811180543;
                  var10005x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = 1142054707;
                  var1x = var10005x;
                  var10005x = (var1x | var2x) - (var1x & var2x);
                  var10005x = (int)7699388454017837775L;
                  var2x = 1740721336;
                  var1x = var10005x;
                  var10005x = var1x & ~var2x | ~var1x & var2x;
                  var2x = 5091054;
                  var1x = var10005x;
                  var10005x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = 1469694457;
                  var1x = 1578605781;
                  var10006x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = 1569490154;
                  var1x = var10006x;
                  var10006x = ((var1x | var2x) - (var1x & var2x)) * ((var1x | var2x) - (var1x & var2x));
                  var2x = 1718385876;
                  var1x = 2046854367;
                  var10006x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = 472572169;
                  var1x = var10006x;
                  if (!var10000.b(
                     c(
                        "\u0015䈮\u0001䈡Д䘾Д䉒\u0004䉔v䈭r䉞",
                        "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w",
                        var10003x,
                        var147x,
                        var10005x,
                        var1x + var2x - 2 * (var1x & var2x)
                     )
                  )) {
                     int var111x = (int)-1311922750680057351L;
                     var2x = -1628761378;
                     var1x = var111x;
                     int var112x = (var1x | var2x) - (var1x & var2x);
                     var2x = 371010343;
                     var1x = var112x;
                     return Boolean.valueOf(pulse.Bool.from((var1x | var2x) & ~(var1x & var2x)));
                  }
               }

               var2x = -394478135;
               var1x = -1955526732;
               int var109x = var1x + var2x - 2 * (var1x & var2x);
               var2x = 1661844092;
               var1x = var109x;
               return Boolean.valueOf(pulse.Bool.from((var1x | var2x) - (var1x & var2x)));
            }
         );
      String var1063 = "eci";
      var10004 = ((int)-2634132378879799522L ^ 1366701746 ^ 550422998) + ((int)628554302843734623L ^ -1595884896 ^ -1824730438);
      String var1191 = "ecj";
      var10005 = 73712798 ^ 1322311025 ^ 738607820;
      var10007 = (int)1302084051968968564L ^ -1642204240 ^ 2001876168;
      var10007 = 612264193 ^ 1065203089 ^ 453237911;
      var10007 = (int)6593969777326677998L ^ 422517587 ^ 1679344820;
      var10006 = -445496888 ^ 1833952030 ^ 1527149146;
      String var1449 = "eck";
      var10007 = 637125579 ^ -749844497 ^ -473726175;
      String var1561 = "ecl";
      String var1064 = c(
         "嵱環嵧璽嵭炥崕璽嵦璽嵫璽", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w", var10005, var10006, var10007, -1672827272 ^ -592968552 ^ 1086969879
      );
      String[] var1127 = new String[718272639 ^ 927093508 ^ 495823743];
      var10006 = 1075887210 ^ -550334170 ^ -1626198708;
      var10008 = (int)250157247985144362L ^ -576515775 ^ -846740627;
      var10008 = -1742313467 ^ 306909794 ^ -1972536729;
      var10008 = -62731792 ^ -828872139 ^ 853189581;
      var10008 = (int)8487273515367149708L ^ -409084374 ^ -1801982299;
      var10008 = (int)5876929253825804875L ^ -44590523 ^ 490004487;
      var10008 = ((int)6688702450421706401L ^ 621802736 ^ -1832246590) * ((int)6688702450421706401L ^ 621802736 ^ -1832246590);
      var10009 = ((int)3773536136388493284L ^ 465500915 ^ -1965670019) + ((int)-2312801821346838331L ^ 1987164726 ^ 1423249945);
      var10009 = (int)1056592940182328336L ^ 978785579 ^ 187013656;
      var10011 = (int)8649654323233966682L ^ -1077160921 ^ -914121100;
      var10011 = 388383990 ^ -236239008 ^ -422771823;
      var10011 = -1724027732 ^ -1142806975 ^ 585059048;
      var10010 = (int)7332552172420746859L ^ -1853624810 ^ -1394029224;
      var10011 = ((int)-8474906594367626570L ^ -1839737546 ^ -1227043614) * ((int)-8474906594367626570L ^ -1839737546 ^ -1227043614);
      var10011 = (int)2127817864873820797L ^ 272447996 ^ 243670514;
      var10013 = (int)-714812564943462730L ^ -1281763438 ^ -636040917;
      var10013 = -128679553 ^ 477078423 ^ -465886484;
      var1127[var10006] = c(
         "嵱ৗ嵡\u09d9嵩ণ崓\u09da崖য়嵡ভ",
         "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w",
         var10009,
         var10010,
         var10011,
         -410548345 ^ -1336469018 ^ 1474531825
      );
      var10006 = 1317423650 ^ 406137901 ^ 1454597646;
      var10007 = (int)6090039580251082946L ^ -798307115 ^ 511786001;
      String var1568 = "ecm";
      var10009 = (int)-765404358184378509L ^ -1793439227 ^ -1392498708;
      var10009 = 1577726217 ^ 199825679 ^ 860975909;
      var10011 = (int)-2164901983346882560L ^ 701905206 ^ -322686660;
      var10010 = 118997122 ^ -1435518035 ^ 2116589202;
      var10011 = (-1446281724 ^ -1947164087 ^ 1878595138) * (-1446281724 ^ -1947164087 ^ 1878595138);
      var10011 = 1091630918 ^ -1439982845 ^ -284428286;
      var10012 = ((int)5685322959126843982L ^ 156118136 ^ 1433238293) * ((int)5685322959126843982L ^ 156118136 ^ 1433238293);
      var1127[var10006] = c(
         "嵀陯嵦鉺嵫除嵪陡嵩陭嵩陣",
         "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w",
         var10009,
         var10010,
         var10011,
         (int)-3607336752947807569L ^ 984991139 ^ -710873308
      );
      var10006 = (int)3277810162658088715L ^ 852558225 ^ -1061710184;
      var10007 = (-1673900024 ^ -1678584750 ^ -713806534) + (312859147 ^ -1772513671 ^ 1535467340);
      var10008 = (2135063310 ^ 2043337680 ^ -1516300027) + ((int)-8019221368901324434L ^ -144795183 ^ -1695822314);
      var10009 = (712634812 ^ -303809917 ^ -772578077) + ((int)227901528314417999L ^ 1790225380 ^ 1974807849);
      var10009 = (int)3167594412406155587L ^ -532140795 ^ 1493262181;
      var10010 = 1435492259 ^ -910706045 ^ -735189922;
      var10010 = 1239281423 ^ -1538964492 ^ 1054624222;
      var10011 = (-2053835092 ^ -900709663 ^ -1317423210) + (-584299335 ^ -2100344652 ^ 160824988);
      var10011 = -1172478384 ^ -512354686 ^ 1229937978;
      var10013 = (int)-1608891548142015854L ^ -652651530 ^ -1614497428;
      var10013 = -54955054 ^ 1520089650 ^ -1507603986;
      var10013 = (int)-8885774406098764541L ^ -2114639861 ^ 734827782;
      var10013 = (int)-8813351027760002468L ^ 1117510816 ^ 923883259;
      var1127[var10006] = c(
         "嵀臗嵦藂崕臚嵦臚嵫臚",
         "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w",
         var10009,
         var10010,
         var10011,
         (int)8971043727781800014L ^ 1471930215 ^ 895578297
      );
      var10006 = 1291257863 ^ -588717407 ^ -1876956507;
      var10008 = -1285042615 ^ 405401281 ^ -1420943231;
      var10008 = 603009880 ^ -426412135 ^ -983284529;
      var10008 = ((int)7962708540986330502L ^ 36909127 ^ -343244358) * ((int)7962708540986330502L ^ 36909127 ^ -343244358);
      String var1702 = "ecn";
      var10009 = (int)2332572447626055319L ^ 1733077534 ^ 1482932138;
      var10010 = (1109058811 ^ -304791059 ^ -1135895454) + ((int)3221662260842874796L ^ -1038777796 ^ 1730888523);
      var10010 = (int)320199866996513461L ^ 302502721 ^ -530387011;
      var10011 = (int)1123539309094088949L ^ 109566198 ^ 1238216716;
      var10011 = -664298524 ^ -1304686239 ^ 1934160943;
      var10013 = 1271276124 ^ -606824582 ^ -1877822171;
      var10013 = (int)-7044411258184817804L ^ 87002554 ^ -1660014908;
      var10013 = 545661827 ^ -2040322261 ^ -1494940505;
      var1127[var10006] = c(
         "嵎ຆ嵩ຄ崞\u0ef0嵤\u0efb嵩\u0ef3",
         "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w",
         var10009,
         var10010,
         var10011,
         (int)2304693044916998709L ^ 1082961129 ^ 1377498728
      );
      var10005 = ((int)-6921765256140377922L ^ 484366026 ^ 873495534) * ((int)-6921765256140377922L ^ 484366026 ^ 873495534);
      var10006 = 1959094482 ^ 1101967973 ^ -230152038;
      var10008 = (int)-1121483798716833498L ^ 1849197260 ^ 572007403;
      var10008 = (int)-1095565926753065342L ^ -1362538525 ^ -1256855181;
      var10008 = -1092616766 ^ 1994649779 ^ -935588512;
      var10008 = 1156968339 ^ 330110462 ^ 1465449066;
      var10007 = -1405800185 ^ -1900082104 ^ 1144546924;
      var10008 = ((int)-323435379562553163L ^ 489858071 ^ 1688861449) * ((int)-323435379562553163L ^ 489858071 ^ 1688861449);
      var10008 = (int)6818192503975698932L ^ 1478014285 ^ -897088439;
      String var1704 = "eco";
      var10009 = (int)4504353005378630830L ^ -588312490 ^ -1606741693;
      var10010 = (1309469739 ^ 198631856 ^ 1412074153) * (1309469739 ^ 198631856 ^ 1412074153);
      this.p = new ModeSetting(
            var1064,
            var1127,
            c(
               "嵱甜嵡甒嵩畨崓甑崖甔嵡畦",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w",
               var10007,
               var10008,
               var10009,
               (int)6733992482355213304L ^ 786524645 ^ 672393542
            )
         )
         .a(
            () -> {
               ModeSetting var10000 = this.e;
               int var10001 = (int)7462523570347216584L;
               int var2x = -305135451;
               int var1x = var10001;
               var10001 = (var1x | var2x) & (~var1x | ~var2x);
               var2x = 1694860248;
               var1x = var10001;
               var10001 = var1x + var2x - 2 * (var1x & var2x);
               int var10002 = (int)-5521559154008127109L;
               var2x = 1932740314;
               var1x = var10002;
               var10002 = var1x + var2x - 2 * (var1x & var2x);
               var2x = -954276718;
               var1x = var10002;
               var10002 = var1x & ~var2x | ~var1x & var2x;
               var2x = 1321493562;
               var1x = -481684443;
               int var10003x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = 521526338;
               var1x = var10003x;
               var2x = (var1x | var2x) & (~var1x | ~var2x);
               var1x = var10002;
               var10002 = (var1x ^ var2x) + 2 * (var1x & var2x);
               String var119x = "eff";
               var2x = 1508099579;
               var1x = 1148308857;
               var10003x = var1x & ~var2x | ~var1x & var2x;
               var2x = 2065716129;
               var1x = var10003x;
               var10003x = var1x & ~var2x | ~var1x & var2x;
               int var10005x = (int)-5670827617772712031L;
               var2x = -1621918617;
               var1x = var10005x;
               var10005x = var1x + var2x - 2 * (var1x & var2x);
               var2x = 729658315;
               var1x = var10005x;
               var10005x = (var1x | var2x) & (~var1x | ~var2x);
               int var10004x = (int)5553519758053146020L;
               var2x = 1573222415;
               var1x = var10004x;
               var10004x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = 720297696;
               var1x = var10004x;
               var10004x = var1x & ~var2x | ~var1x & var2x;
               var10005x = (int)-5724881512360021077L;
               var2x = -1432176912;
               var1x = var10005x;
               var10005x = (var1x | var2x) & ~(var1x & var2x);
               var2x = -2004435298;
               var1x = var10005x;
               var10005x = var1x + var2x - 2 * (var1x & var2x);
               var10005x = (int)-5508741136423180943L;
               var2x = 1531605117;
               var1x = var10005x;
               var10005x = var1x + var2x - 2 * (var1x & var2x);
               var2x = 714832045;
               var1x = var10005x;
               var10005x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = 352495905;
               var1x = 1852984956;
               int var10007x = var1x & ~var2x | ~var1x & var2x;
               var2x = 2070996814;
               var1x = var10007x;
               var10007x = (var1x | var2x) - (var1x & var2x);
               var2x = 1310319496;
               var1x = -1054903700;
               var10007x = var1x + var2x - 2 * (var1x & var2x);
               var2x = -1895394833;
               var1x = var10007x;
               var10007x = (var1x | var2x) - (var1x & var2x);
               int var10006x = (int)-2845171816989732464L;
               var2x = 1313165415;
               var1x = var10006x;
               var10006x = var1x + var2x - 2 * (var1x & var2x);
               var2x = -985063193;
               var1x = var10006x;
               if (!var10000.b(
                  c(
                     "\u0019喝\u0000梅\u0001喝Л祐\u000b爫y侮}暑",
                     "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w",
                     var10003x,
                     var10004x,
                     var10005x,
                     (var1x | var2x) - (var1x & var2x)
                  )
               )) {
                  var10000 = this.e;
                  String var114x = "efg";
                  String var118x = "efh";
                  var2x = -2048602631;
                  var1x = 927054747;
                  var10003x = var1x + var2x - 2 * (var1x & var2x);
                  var2x = -1706903269;
                  var1x = var10003x;
                  var10003x = (var1x | var2x) & ~(var1x & var2x);
                  var10003x = (int)6051825105885674887L;
                  var2x = -2036749175;
                  var1x = var10003x;
                  var10003x = (var1x | var2x) - (var1x & var2x);
                  var2x = 1328597549;
                  var1x = var10003x;
                  var10003x = (var1x | var2x) - (var1x & var2x);
                  var10004x = (int)-4943527099944622153L;
                  var2x = 1384092736;
                  var1x = var10004x;
                  var10004x = var1x & ~var2x | ~var1x & var2x;
                  var2x = -1099274812;
                  var1x = var10004x;
                  var10004x = (var1x & ~var2x | ~var1x & var2x) * (var1x & ~var2x | ~var1x & var2x);
                  var10004x = (int)-696478577291654990L;
                  var2x = 305584717;
                  var1x = var10004x;
                  var10004x = var1x & ~var2x | ~var1x & var2x;
                  var2x = 607024221;
                  var1x = var10004x;
                  var10004x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = -950484554;
                  var1x = -707053038;
                  var10006x = (var1x | var2x) - (var1x & var2x);
                  var2x = 310639522;
                  var1x = var10006x;
                  var10006x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = -304776461;
                  var1x = -48009583;
                  var10006x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = 284562532;
                  var1x = var10006x;
                  var10006x = var1x & ~var2x | ~var1x & var2x;
                  var10006x = (int)-6806320049978778532L;
                  var2x = -302406757;
                  var1x = var10006x;
                  var10006x = var1x & ~var2x | ~var1x & var2x;
                  var2x = 882704333;
                  var1x = var10006x;
                  var10006x = var1x & ~var2x | ~var1x & var2x;
                  var2x = -1360758625;
                  var1x = -839128663;
                  var10006x = var1x & ~var2x | ~var1x & var2x;
                  var2x = 1663013170;
                  var1x = var10006x;
                  var10006x = (var1x | var2x) - (var1x & var2x);
                  var10005x = (int)-8931090165004143291L;
                  var2x = -1516965985;
                  var1x = var10005x;
                  var10005x = var1x & ~var2x | ~var1x & var2x;
                  var2x = -598060233;
                  var1x = var10005x;
                  var10005x = (var1x | var2x) & (~var1x | ~var2x);
                  var10007x = (int)7079812232393199021L;
                  var2x = -1365126884;
                  var1x = var10007x;
                  var10007x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = -1427972933;
                  var1x = var10007x;
                  var10007x = var1x & ~var2x | ~var1x & var2x;
                  var2x = 786135785;
                  var1x = -37325959;
                  var10007x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = -753071720;
                  var1x = var10007x;
                  var10007x = var1x + var2x - 2 * (var1x & var2x);
                  var2x = -832960691;
                  var1x = 742037024;
                  var10007x = var1x + var2x - 2 * (var1x & var2x);
                  var2x = -496987778;
                  var1x = var10007x;
                  var10007x = (var1x | var2x) & (~var1x | ~var2x);
                  var10006x = (int)-4629423520404168015L;
                  var2x = 904447322;
                  var1x = var10006x;
                  var10006x = var1x + var2x - 2 * (var1x & var2x);
                  var2x = -894301300;
                  var1x = var10006x;
                  if (!var10000.b(
                     c(
                        "\u001a㝄\u000e㝋Л㍔Л㜸\u000b㜾y㝇}㜴",
                        "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w",
                        var10003x,
                        var10004x,
                        var10005x,
                        var1x & ~var2x | ~var1x & var2x
                     )
                  )) {
                     var2x = -1811616246;
                     var1x = -754995233;
                     int var111x = (var1x | var2x) & ~(var1x & var2x);
                     var2x = 1190871509;
                     var1x = var111x;
                     return Boolean.valueOf(pulse.Bool.from((var1x | var2x) - (var1x & var2x)));
                  }
               }

               int var108x = (int)5998325360329899027L;
               var2x = -300096412;
               var1x = var108x;
               int var109x = (var1x | var2x) - (var1x & var2x);
               var2x = -1816995722;
               var1x = var109x;
               return Boolean.valueOf(pulse.Bool.from(var1x & ~var2x | ~var1x & var2x));
            }
         );
      var10003 = ((int)1333201374115428885L ^ -87732207 ^ 906424767) + (713678677 ^ 1348656420 ^ -758332490);
      var10004 = 2030144074 ^ -80623428 ^ 126904515;
      String var1194 = "ecp";
      var10005 = -523504135 ^ 1765625110 ^ -280697908;
      var10007 = (int)-7200890421385769931L ^ 2030677295 ^ 935354647;
      var10007 = -1894332092 ^ -652254368 ^ 1443473965;
      var10007 = 1198505772 ^ -1831242671 ^ -709440653;
      var10007 = 288125404 ^ 395241465 ^ 111318572;
      var10007 = 1858099019 ^ 1423957251 ^ 975145537;
      var10006 = (int)5202346917190113940L ^ -1134755533 ^ 1377120054;
      var10007 = (-1066886506 ^ -1103769559 ^ -965386440) * (-1066886506 ^ -1103769559 ^ -965386440);
      var10007 = (int)-5834147842644629791L ^ -1447585095 ^ 380544630;
      var10008 = ((int)6420502027852784732L ^ 899774813 ^ -1719279339) + ((int)-6079261215133059208L ^ -555062907 ^ 1665884253);
      String var1066 = c(
         "嵋킰嵪킶崖킻崐탌嵣킰奱탉嵡탏崓킶崗", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w", var10005, var10006, var10007, -12326401 ^ -21405178 ^ 30694661
      );
      var10004 = (-1748179624 ^ -1195366336 ^ -968777088) + (-493896834 ^ -1420739760 ^ -992805301);
      var10006 = ((int)-2985920483204900719L ^ -938011061 ^ -1875700133) * ((int)-2985920483204900719L ^ -938011061 ^ -1875700133);
      this.q = new SliderSetting(var1066, 4.0F, 1.0F, 20.0F, 1.0F)
         .a(
            () -> {
               ModeSetting var10000 = this.e;
               String var10001 = "efe";
               int var2x = -1045808165;
               int var1x = 451576525;
               int var10002 = (var1x | var2x) & ~(var1x & var2x);
               var2x = 348987765;
               var1x = var10002;
               var10002 = (var1x & ~var2x | ~var1x & var2x) * (var1x & ~var2x | ~var1x & var2x);
               var2x = -1461746278;
               var1x = -1092148808;
               int var10003x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = 1729445213;
               var1x = var10003x;
               var10003x = (var1x | var2x) - (var1x & var2x);
               var2x = 856358381;
               var1x = -319871614;
               int var10004x = (var1x | var2x) & ~(var1x & var2x);
               var2x = -1705125173;
               var1x = var10004x;
               var2x = var1x & ~var2x | ~var1x & var2x;
               var1x = var10003x;
               var10003x = 2 * (var1x | var2x) - (var1x ^ var2x);
               var10003x = (int)5059873068323703449L;
               var2x = -474440908;
               var1x = var10003x;
               var10003x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = -888485234;
               var1x = var10003x;
               var10003x = (var1x | var2x) & ~(var1x & var2x);
               int var10005x = (int)499298426756043639L;
               var2x = 566394890;
               var1x = var10005x;
               var10005x = (var1x | var2x) & ~(var1x & var2x);
               var2x = 846599029;
               var1x = var10005x;
               var10005x = (var1x | var2x) & (~var1x | ~var2x);
               var10004x = (int)5318992115362420350L;
               var2x = -1901928521;
               var1x = var10004x;
               var10004x = (var1x | var2x) & ~(var1x & var2x);
               var2x = 319529605;
               var1x = var10004x;
               var10004x = var1x + var2x - 2 * (var1x & var2x);
               var2x = 1764127823;
               var1x = -2142330636;
               var10005x = (var1x | var2x) & ~(var1x & var2x);
               var2x = 1365169077;
               var1x = var10005x;
               var10005x = (var1x | var2x) & (~var1x | ~var2x);
               var10005x = (int)-3196184066745894023L;
               var2x = -434617094;
               var1x = var10005x;
               var10005x = var1x & ~var2x | ~var1x & var2x;
               var2x = 2036200726;
               var1x = var10005x;
               var10005x = var1x + var2x - 2 * (var1x & var2x);
               var2x = 486643288;
               var1x = 1007211169;
               int var10006x = var1x & ~var2x | ~var1x & var2x;
               var2x = 979148625;
               var1x = var10006x;
               var10006x = (var1x | var2x) & (~var1x | ~var2x);
               var10006x = (int)-5531537444441941226L;
               var2x = 1478290113;
               var1x = var10006x;
               var10006x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = 845626590;
               var1x = var10006x;
               if (!var10000.b(
                  c(
                     "\udc21䨗\udc38䩥\udc39䨗\ud823䩮\udc33䩨\udc41䨑\udc45䩢",
                     "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w",
                     var10003x,
                     var10004x,
                     var10005x,
                     (var1x | var2x) & (~var1x | ~var2x)
                  )
               )) {
                  var10000 = this.e;
                  int var117x = (int)2047702842766506692L;
                  var2x = 1117999019;
                  var1x = var117x;
                  int var118x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = -2142370493;
                  var1x = var118x;
                  int var119x = var1x & ~var2x | ~var1x & var2x;
                  var10002 = (int)7668161023310285880L;
                  var2x = 1890388763;
                  var1x = var10002;
                  var10002 = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = 2005602925;
                  var1x = var10002;
                  var10002 = var1x + var2x - 2 * (var1x & var2x);
                  var10003x = (int)4607671849925859528L;
                  var2x = -1895593809;
                  var1x = var10003x;
                  var10003x = var1x & ~var2x | ~var1x & var2x;
                  var2x = -69555565;
                  var1x = var10003x;
                  var2x = var1x & ~var2x | ~var1x & var2x;
                  var1x = var10002;
                  var10002 = (var1x & ~var2x) + (var2x & ~var1x) + 2 * (var1x & var2x);
                  var2x = 1074040639;
                  var1x = 810627894;
                  var10003x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = -294640801;
                  var1x = var10003x;
                  var10003x = ((var1x | var2x) & ~(var1x & var2x)) * ((var1x | var2x) & ~(var1x & var2x));
                  var2x = -1818221017;
                  var1x = 431993570;
                  var10003x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = -324153370;
                  var1x = var10003x;
                  var10003x = (var1x | var2x) & (~var1x | ~var2x);
                  var10005x = (int)-7754482927320562388L;
                  var2x = 1137482184;
                  var1x = var10005x;
                  var10005x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = -1745445660;
                  var1x = var10005x;
                  var10005x = var1x + var2x - 2 * (var1x & var2x);
                  var10005x = (int)2046026096207159146L;
                  var2x = -389964187;
                  var1x = var10005x;
                  var10005x = (var1x | var2x) - (var1x & var2x);
                  var2x = 22724877;
                  var1x = var10005x;
                  var10005x = (var1x | var2x) - (var1x & var2x);
                  var2x = 1014475484;
                  var1x = -167738992;
                  var10004x = (var1x | var2x) - (var1x & var2x);
                  var2x = -1735316761;
                  var1x = var10004x;
                  var10004x = (var1x | var2x) - (var1x & var2x);
                  var2x = -1944088570;
                  var1x = -208492441;
                  var10005x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = -1086877179;
                  var1x = var10005x;
                  var10005x = (var1x | var2x) & ~(var1x & var2x);
                  var10006x = (int)-5130332086351512275L;
                  var2x = -1947548142;
                  var1x = var10006x;
                  var10006x = (var1x | var2x) - (var1x & var2x);
                  var2x = -1384118599;
                  var1x = var10006x;
                  var2x = (var1x | var2x) - (var1x & var2x);
                  var1x = var10005x;
                  var10005x = var1x - ~var2x - 1;
                  var2x = 1799091160;
                  var1x = -1324638275;
                  var10005x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = -81283730;
                  var1x = var10005x;
                  var10005x = var1x & ~var2x | ~var1x & var2x;
                  var10006x = (int)8410795792241113473L;
                  var2x = -2094151552;
                  var1x = var10006x;
                  var10006x = var1x & ~var2x | ~var1x & var2x;
                  var2x = 1536691230;
                  var1x = var10006x;
                  var10006x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = 1476204486;
                  var1x = -296302616;
                  int var10007x = var1x + var2x - 2 * (var1x & var2x);
                  var2x = 305289887;
                  var1x = var10007x;
                  var2x = (var1x | var2x) & ~(var1x & var2x);
                  var1x = var10006x;
                  var10006x = 2 * (var1x | var2x) - (var1x ^ var2x);
                  var2x = 954194568;
                  var1x = 2090054595;
                  var10006x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = 1148930595;
                  var1x = var10006x;
                  if (!var10000.b(
                     c(
                        "\udc22ꑳ\udc36ꑼ\ud823ꁣ\ud823ꐏ\udc33ꐉ\udc41ꑰ\udc45ꐃ",
                        "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w",
                        var10003x,
                        var10004x,
                        var10005x,
                        var1x & ~var2x | ~var1x & var2x
                     )
                  )) {
                     var2x = -591892101;
                     var1x = -1843559150;
                     int var116x = var1x & ~var2x | ~var1x & var2x;
                     var2x = 1319498857;
                     var1x = var116x;
                     return Boolean.valueOf(pulse.Bool.from((var1x | var2x) & ~(var1x & var2x)));
                  }
               }

               var2x = -2142435632;
               var1x = -71055695;
               int var114x = (var1x | var2x) & ~(var1x & var2x);
               var2x = 2072952928;
               var1x = var114x;
               return Boolean.valueOf(pulse.Bool.from(var1x & ~var2x | ~var1x & var2x));
            }
         );
      var10003 = ((int)3096879356685559347L ^ 195610346 ^ 857236600) + (-2055583599 ^ -253458035 ^ -67188820);
      var10004 = (-59206505 ^ 947091504 ^ 1844500990) + (1825295714 ^ -398992626 ^ 1495358734);
      var10005 = ((int)-8873509270708331460L ^ -526622121 ^ -543768950) + (-1379641265 ^ -1724370925 ^ -686098291);
      var10005 = (int)-2370768931435561446L ^ 1473224653 ^ -1942095116;
      var10006 = ((int)-4510211793225960903L ^ -1440442340 ^ -607153265) * ((int)-4510211793225960903L ^ -1440442340 ^ -607153265);
      var10006 = -1074037684 ^ 1562216713 ^ 834544958;
      String var1461 = "ecq";
      var10007 = 1596521539 ^ -765870540 ^ -2131447491;
      var10008 = (int)-7696879169185643444L ^ -1183552777 ^ -1439067028;
      String var1068 = c(
         "嵱璤嵦璨嵤瓔奱瓓嵡瓕崓璬崗", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w", var10005, var10006, var10007, 1718822293 ^ -34853127 ^ -1680377462
      );
      String var1131 = "ecr";
      var10006 = (int)-7040048623099385849L ^ -12879509 ^ 1167430015;
      var10007 = (int)6586180705033434909L ^ -517774444 ^ 657446022;
      var10007 = -1906675895 ^ -1000001855 ^ 1245659525;
      var10007 = -973189361 ^ -472972643 ^ 640765343;
      var10007 = -1490030056 ^ -1084634546 ^ 410400849;
      var10008 = (int)-8188201462478516191L ^ 954159045 ^ 662511585;
      var10008 = (int)-3589981711331237914L ^ 882662726 ^ 1164935841;
      this.r = new SliderSetting(var1068, 0.3F, 0.1F, 0.75F, 0.05F)
         .a(
            () -> {
               ModeSetting var10000 = this.e;
               String var10001 = "efc";
               int var10002 = (int)-659318716130795785L;
               int var2x = -1098405024;
               int var1x = var10002;
               var10002 = (var1x | var2x) & ~(var1x & var2x);
               var2x = 1522672965;
               var1x = var10002;
               var10002 = ((var1x | var2x) & ~(var1x & var2x)) * ((var1x | var2x) & ~(var1x & var2x));
               int var10004x = (int)-3575657001807197748L;
               var2x = 1869153069;
               var1x = var10004x;
               var10004x = (var1x | var2x) - (var1x & var2x);
               var2x = -1479685400;
               var1x = var10004x;
               var10004x = (var1x | var2x) - (var1x & var2x);
               var2x = 1645652630;
               var1x = 162601963;
               int var10003x = var1x & ~var2x | ~var1x & var2x;
               var2x = 219540062;
               var1x = var10003x;
               var10003x = (var1x | var2x) - (var1x & var2x);
               var10004x = (int)3967360001956752445L;
               var2x = -418602423;
               var1x = var10004x;
               var10004x = (var1x | var2x) & ~(var1x & var2x);
               var2x = -928432318;
               var1x = var10004x;
               var10004x = var1x & ~var2x | ~var1x & var2x;
               var10004x = (int)-7709479333735224300L;
               var2x = 1752203223;
               var1x = var10004x;
               var10004x = var1x & ~var2x | ~var1x & var2x;
               var2x = 1205243188;
               var1x = var10004x;
               var10004x = (var1x | var2x) & (~var1x | ~var2x);
               int var10006x = (int)-5838408877459974075L;
               var2x = -1238178799;
               var1x = var10006x;
               var10006x = var1x & ~var2x | ~var1x & var2x;
               var2x = -1817166761;
               var1x = var10006x;
               var10006x = (var1x | var2x) & (~var1x | ~var2x);
               int var10005x = (int)7742885768549288525L;
               var2x = -649095667;
               var1x = var10005x;
               var10005x = var1x + var2x - 2 * (var1x & var2x);
               var2x = -427004886;
               var1x = var10005x;
               var10005x = var1x & ~var2x | ~var1x & var2x;
               var10006x = (int)-7336633357991936646L;
               var2x = 1841172316;
               var1x = var10006x;
               var10006x = (var1x | var2x) & ~(var1x & var2x);
               var2x = 1039544784;
               var1x = var10006x;
               var10006x = (var1x | var2x) & ~(var1x & var2x);
               int var10007x = (int)-8048328976448182619L;
               var2x = -713901249;
               var1x = var10007x;
               var10007x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = -2008936818;
               var1x = var10007x;
               var2x = var1x & ~var2x | ~var1x & var2x;
               var1x = var10006x;
               var10006x = (var1x & ~var2x) + (var2x & ~var1x) + 2 * (var1x & var2x);
               var10006x = (int)2221716382869362334L;
               var2x = 399693789;
               var1x = var10006x;
               var10006x = var1x + var2x - 2 * (var1x & var2x);
               var2x = 1734459888;
               var1x = var10006x;
               if (!var10000.b(
                  c(
                     "\udc20螬\udc39蟞\udc38螬\ud822蟕\udc32蟓\udc40螪\udc44蟙",
                     "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w",
                     var10003x,
                     var10004x,
                     var10005x,
                     var1x & ~var2x | ~var1x & var2x
                  )
               )) {
                  int var97x = (int)-6286925287034046384L;
                  var2x = -1567268588;
                  var1x = var97x;
                  int var98x = var1x + var2x - 2 * (var1x & var2x);
                  var2x = 1565036428;
                  var1x = var98x;
                  int var99x = (var1x + var2x - 2 * (var1x & var2x)) * (var1x + var2x - 2 * (var1x & var2x));
                  var10002 = (int)-1039221927348679855L;
                  var2x = 1793206140;
                  var1x = var10002;
                  var10002 = (var1x | var2x) & ~(var1x & var2x);
                  var2x = -1127077952;
                  var1x = var10002;
                  var10002 = var1x & ~var2x | ~var1x & var2x;
                  var10003x = (int)-8085349457757316860L;
                  var2x = 188364352;
                  var1x = var10003x;
                  var10003x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = -974218505;
                  var1x = var10003x;
                  var10003x = var1x & ~var2x | ~var1x & var2x;
                  var2x = -170158166;
                  var1x = -602777762;
                  var10004x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = -475389484;
                  var1x = var10004x;
                  var2x = (var1x | var2x) & (~var1x | ~var2x);
                  var1x = var10003x;
                  var10003x = (var1x ^ var2x) + 2 * (var1x & var2x);
                  var2x = 1717117065;
                  var1x = -43875174;
                  var10003x = (var1x | var2x) - (var1x & var2x);
                  var2x = -41287888;
                  var1x = var10003x;
                  var10003x = (var1x | var2x) - (var1x & var2x);
                  String var121x = "efd";
                  var10004x = (int)640124165886334220L;
                  var2x = -1736345106;
                  var1x = var10004x;
                  var10004x = var1x & ~var2x | ~var1x & var2x;
                  var2x = 1166151697;
                  var1x = var10004x;
                  var10004x = (var1x | var2x) & (~var1x | ~var2x);
                  var10005x = (int)-562775760006062629L;
                  var2x = 681045227;
                  var1x = var10005x;
                  var10005x = var1x + var2x - 2 * (var1x & var2x);
                  var2x = -789648960;
                  var1x = var10005x;
                  var10005x = var1x & ~var2x | ~var1x & var2x;
                  var10005x = (int)8970721281539763817L;
                  var2x = 1773592345;
                  var1x = var10005x;
                  var10005x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = 1930209739;
                  var1x = var10005x;
                  var10005x = (var1x | var2x) & (~var1x | ~var2x);
                  var10006x = (int)7007563274700827896L;
                  var2x = 159034514;
                  var1x = var10006x;
                  var10006x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = -1206394476;
                  var1x = var10006x;
                  var10006x = ((var1x | var2x) & ~(var1x & var2x)) * ((var1x | var2x) & ~(var1x & var2x));
                  var2x = 1683926685;
                  var1x = -1081853967;
                  var10006x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = -604321853;
                  var1x = var10006x;
                  if (!this.e
                     .b(
                        c(
                           "\udc23\ud9b5\udc37\ud9ba\ud822\udda5\ud822\ud9c9\udc32\ud9cf\udc40\ud9b6\udc44\ud9c5",
                           "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w",
                           var10003x,
                           var10004x,
                           var10005x,
                           (var1x | var2x) & (~var1x | ~var2x)
                        )
                     )) {
                     var2x = -1545424649;
                     var1x = -896602492;
                     int var96x = (var1x | var2x) & (~var1x | ~var2x);
                     var2x = 1768709747;
                     var1x = var96x;
                     return Boolean.valueOf(pulse.Bool.from((var1x | var2x) - (var1x & var2x)));
                  }
               }

               int var93x = (int)4606289757753989382L;
               var2x = 1972511818;
               var1x = var93x;
               int var94x = (var1x | var2x) & ~(var1x & var2x);
               var2x = 1390443853;
               var1x = var94x;
               return Boolean.valueOf(pulse.Bool.from((var1x | var2x) & ~(var1x & var2x)));
            }
         );
      var10004 = -1651166417 ^ 809084030 ^ -1381197998;
      String var1133 = "ecs";
      var10006 = -1375227466 ^ 752653496 ^ -2099567353;
      var10006 = -995184054 ^ -976788258 ^ 23713436;
      var10006 = 142342285 ^ 1735790551 ^ 1863186264;
      var10006 = -1180226717 ^ -2007479085 ^ 838821822;
      var10005 = -1150861556 ^ -605239297 ^ 104440784;
      String var1338 = "ect";
      var10006 = -1765668252 ^ -2085862904 ^ -965010951;
      String var1467 = "ecu";
      var10007 = -443445280 ^ -762158999 ^ 838780788;
      var10008 = (int)-4369299802820500819L ^ 781983891 ^ -604239960;
      String var1069 = c(
         "嵃\uf232嵤\uf24e崞\uf652嵧\uf24a嵦\uf24f嵩",
         "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w",
         var10005,
         var10006,
         var10007,
         (int)4623782509861867411L ^ -993596202 ^ 641275717
      );
      var10004 = (904766229 ^ 2103862511 ^ -1414649367) + (840001053 ^ 1416568521 ^ -839113096);
      var10006 = (int)5533754836281334357L ^ 51446018 ^ 1505172318;
      var10006 = 1398596601 ^ -1429378156 ^ -107902873;
      var10006 = (int)-6738930329166436379L ^ -90039410 ^ 1812349417;
      var10007 = ((int)-3520213705180458147L ^ 1666932582 ^ 233468981) + (-611458469 ^ 85244792 ^ -1284359291);
      this.s = new SliderSetting(var1069, 20.0F, 10.0F, 50.0F, 5.0F)
         .a(
            () -> {
               String var10001 = "eey";
               String var10002 = "eez";
               int var10003x = (int)5766777789514070684L;
               int var2x = 1602172284;
               int var1x = var10003x;
               var10003x = (var1x | var2x) & ~(var1x & var2x);
               var2x = -362543695;
               var1x = var10003x;
               var10003x = (var1x | var2x) & ~(var1x & var2x);
               var2x = -207580708;
               var1x = 121534451;
               var10003x = (var1x | var2x) - (var1x & var2x);
               var2x = -1842561780;
               var1x = var10003x;
               var10003x = (var1x | var2x) & ~(var1x & var2x);
               int var10004x = (int)-1986440031560645067L;
               var2x = 41373300;
               var1x = var10004x;
               var10004x = var1x + var2x - 2 * (var1x & var2x);
               var2x = 2096073612;
               var1x = var10004x;
               var10004x = (var1x & ~var2x | ~var1x & var2x) * (var1x & ~var2x | ~var1x & var2x);
               var2x = 1035360354;
               var1x = -515790317;
               var10004x = var1x + var2x - 2 * (var1x & var2x);
               var2x = -1911158697;
               var1x = var10004x;
               var10004x = var1x & ~var2x | ~var1x & var2x;
               int var10005x = (int)3578123032362127105L;
               var2x = -2046979293;
               var1x = var10005x;
               var10005x = var1x + var2x - 2 * (var1x & var2x);
               var2x = -1043037486;
               var1x = var10005x;
               var10005x = ((var1x | var2x) & (~var1x | ~var2x)) * ((var1x | var2x) & (~var1x | ~var2x));
               var2x = 1076989102;
               var1x = 1720080078;
               var10005x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = 853272246;
               var1x = var10005x;
               var10005x = (var1x | var2x) - (var1x & var2x);
               var2x = 281574141;
               var1x = 2018729037;
               int var10006x = (var1x | var2x) & ~(var1x & var2x);
               var2x = -1391394892;
               var1x = var10006x;
               var10006x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = -1733896666;
               var1x = 1862288683;
               var10006x = var1x & ~var2x | ~var1x & var2x;
               var2x = -141195028;
               var1x = var10006x;
               if (!this.e
                  .b(
                     c(
                        "\udc23鳽\udc3a鲏\udc3b鳽\ud821鲄\udc31鲂\udc43鳻\udc47鲈",
                        "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w",
                        var10003x,
                        var10004x,
                        var10005x,
                        (var1x | var2x) - (var1x & var2x)
                     )
                  )) {
                  var10001 = "efa";
                  var2x = -1529264438;
                  var1x = 1589656208;
                  int var96x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = -1640908253;
                  var1x = var96x;
                  int var97x = var1x & ~var2x | ~var1x & var2x;
                  var2x = -1499706931;
                  var1x = 611927833;
                  var10003x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = 404328738;
                  var1x = var10003x;
                  var10003x = var1x & ~var2x | ~var1x & var2x;
                  var10004x = (int)-6166615007686542467L;
                  var2x = -1515100454;
                  var1x = var10004x;
                  var10004x = var1x & ~var2x | ~var1x & var2x;
                  var2x = -1715950381;
                  var1x = var10004x;
                  var2x = (var1x | var2x) - (var1x & var2x);
                  var1x = var10003x;
                  var10003x = 2 * (var1x | var2x) - (var1x ^ var2x);
                  var10003x = (int)6062443039447701849L;
                  var2x = -1869075918;
                  var1x = var10003x;
                  var10003x = var1x + var2x - 2 * (var1x & var2x);
                  var2x = 192653384;
                  var1x = var10003x;
                  var10003x = (var1x | var2x) - (var1x & var2x);
                  String var114x = "efb";
                  var2x = 609775949;
                  var1x = -1623355865;
                  var10004x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = -373479678;
                  var1x = var10004x;
                  var10004x = (var1x | var2x) - (var1x & var2x);
                  var2x = 1804656036;
                  var1x = 1408046970;
                  var10005x = var1x & ~var2x | ~var1x & var2x;
                  var2x = -1127378509;
                  var1x = var10005x;
                  var10005x = var1x & ~var2x | ~var1x & var2x;
                  var2x = 1082412351;
                  var1x = 1045287507;
                  var10006x = var1x & ~var2x | ~var1x & var2x;
                  var2x = -1225866600;
                  var1x = var10006x;
                  var2x = var1x + var2x - 2 * (var1x & var2x);
                  var1x = var10005x;
                  var10005x = (var1x ^ var2x) + 2 * (var1x & var2x);
                  var2x = -909864315;
                  var1x = 664432016;
                  var10005x = (var1x | var2x) - (var1x & var2x);
                  var2x = -818665474;
                  var1x = var10005x;
                  var10005x = var1x & ~var2x | ~var1x & var2x;
                  var10006x = (int)-5632095685293293833L;
                  var2x = 353452975;
                  var1x = var10006x;
                  var10006x = var1x & ~var2x | ~var1x & var2x;
                  var2x = 1241158112;
                  var1x = var10006x;
                  var10006x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = -1978938711;
                  var1x = -792793806;
                  int var10007x = var1x & ~var2x | ~var1x & var2x;
                  var2x = 501429091;
                  var1x = var10007x;
                  var2x = (var1x | var2x) & (~var1x | ~var2x);
                  var1x = var10006x;
                  var10006x = (var1x & ~var2x) + (var2x & ~var1x) + 2 * (var1x & var2x);
                  var2x = 294875407;
                  var1x = 903752446;
                  var10006x = var1x + var2x - 2 * (var1x & var2x);
                  var2x = 610574802;
                  var1x = var10006x;
                  if (!this.e
                     .b(
                        c(
                           "\udc20紺\udc34紵\ud821礪\ud821絆\udc31絀\udc43紹\udc47絊",
                           "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w",
                           var10003x,
                           var10004x,
                           var10005x,
                           var1x & ~var2x | ~var1x & var2x
                        )
                     )) {
                     int var93x = (int)7213842314012300621L;
                     var2x = -410089884;
                     var1x = var93x;
                     var93x = var1x + var2x - 2 * (var1x & var2x);
                     var2x = -672394455;
                     var1x = var93x;
                     return Boolean.valueOf(pulse.Bool.from(var1x & ~var2x | ~var1x & var2x));
                  }
               }

               int var10000 = (int)4427597038784478845L;
               var2x = 1299229570;
               var1x = var10000;
               var10000 = var1x + var2x - 2 * (var1x & var2x);
               var2x = 740382206;
               var1x = var10000;
               return Boolean.valueOf(pulse.Bool.from(var1x & ~var2x | ~var1x & var2x));
            }
         );
      String var1070 = "ecv";
      String var1135 = "ecw";
      var10005 = (1915396096 ^ 703584364 ^ -662782025) + ((int)9066446761767940515L ^ 1303671823 ^ 1109656862);
      var10005 = 437248008 ^ -413308725 ^ -1679764512;
      var10006 = (int)-6958055754083273817L ^ -1115593385 ^ -1111189647;
      var10006 = -1850681587 ^ 1758369862 ^ 709295784;
      var10007 = -279549242 ^ 1683392228 ^ 558235848;
      var10007 = -1930961038 ^ -172821744 ^ 1964298838;
      var10008 = (1242752142 ^ 1722125847 ^ 1813533015) + ((int)8679855381934795383L ^ 1762078581 ^ 1201382682);
      String var1071 = c(
         "嵰刄嵪刌奱剼嵡刋嵪剭崓刌", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w", var10005, var10006, var10007, 1801267261 ^ 675104678 ^ 1128807381
      );
      String var1136 = "ecx";
      var10005 = (int)-6463201406697910683L ^ 743151250 ^ -983043771;
      var10006 = (875798254 ^ -2015115425 ^ -364821551) + (1182874645 ^ -180770843 ^ 893056064);
      var10008 = (int)7749301120180672948L ^ -1627859759 ^ 857673065;
      var10008 = 838758160 ^ 90003562 ^ 883111786;
      var10008 = (int)6108960159375293804L ^ -777856818 ^ 657532339;
      this.t = new SliderSetting(var1071, 0.3F, 0.15F, 0.35F, 0.01F)
         .a(
            () -> {
               ModeSetting var10000 = this.e;
               int var10002 = (int)4624695440728738467L;
               int var2x = 44003304;
               int var1x = var10002;
               var10002 = var1x & ~var2x | ~var1x & var2x;
               var2x = 698230087;
               var1x = var10002;
               var10002 = (var1x | var2x) & ~(var1x & var2x);
               var2x = -1381436369;
               var1x = 1547414753;
               var10002 = var1x + var2x - 2 * (var1x & var2x);
               var2x = -760932711;
               var1x = var10002;
               var10002 = (var1x | var2x) & ~(var1x & var2x);
               int var10003x = (int)465382913851169956L;
               var2x = 1635561441;
               var1x = var10003x;
               var10003x = (var1x | var2x) - (var1x & var2x);
               var2x = 642973365;
               var1x = var10003x;
               var10003x = (var1x | var2x) - (var1x & var2x);
               var2x = 712999697;
               var1x = -2083112381;
               var10003x = (var1x | var2x) & ~(var1x & var2x);
               var2x = -820256143;
               var1x = var10003x;
               var10003x = var1x + var2x - 2 * (var1x & var2x);
               var2x = 2090477459;
               var1x = 1289939177;
               int var10004x = (var1x | var2x) & ~(var1x & var2x);
               var2x = 1038608123;
               var1x = var10004x;
               var10004x = ((var1x | var2x) & ~(var1x & var2x)) * ((var1x | var2x) & ~(var1x & var2x));
               var2x = 1381472496;
               var1x = 1052279134;
               var10004x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = 1046088231;
               var1x = var10004x;
               var10004x = (var1x | var2x) & ~(var1x & var2x);
               String var10005x = "eew";
               int var128x = (int)-8533876602110665267L;
               var2x = 2021553969;
               var1x = var128x;
               int var129x = (var1x | var2x) - (var1x & var2x);
               var2x = -1282128372;
               var1x = var129x;
               int var130x = var1x + var2x - 2 * (var1x & var2x);
               int var10006x = (int)-4068891922000733058L;
               var2x = 536085570;
               var1x = var10006x;
               var10006x = (var1x | var2x) & ~(var1x & var2x);
               var2x = -353890102;
               var1x = var10006x;
               var10006x = (var1x | var2x) & ~(var1x & var2x);
               var10006x = (int)-5642830424185531800L;
               var2x = 125013503;
               var1x = var10006x;
               var10006x = (var1x | var2x) & ~(var1x & var2x);
               var2x = 1238510292;
               var1x = var10006x;
               if (!var10000.b(
                  c(
                     "\udc22뉞\udc3b눬\udc3a뉞\ud820눧\udc30눡\udc42뉘\udc46눫",
                     "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w",
                     var10003x,
                     var10004x,
                     var130x,
                     (var1x | var2x) & (~var1x | ~var2x)
                  )
               )) {
                  var10000 = this.e;
                  String var10001 = "eex";
                  var10002 = (int)783653891615159438L;
                  var2x = 351217752;
                  var1x = var10002;
                  var10002 = var1x & ~var2x | ~var1x & var2x;
                  var2x = 2099505780;
                  var1x = var10002;
                  var10002 = ((var1x | var2x) & ~(var1x & var2x)) * ((var1x | var2x) & ~(var1x & var2x));
                  var2x = 1711361840;
                  var1x = 2133656763;
                  var10003x = (var1x | var2x) - (var1x & var2x);
                  var2x = 166181812;
                  var1x = var10003x;
                  var10003x = ((var1x | var2x) & ~(var1x & var2x)) * ((var1x | var2x) & ~(var1x & var2x));
                  var2x = -1516883294;
                  var1x = 2062362117;
                  var10003x = var1x & ~var2x | ~var1x & var2x;
                  var2x = -1177989244;
                  var1x = var10003x;
                  var10003x = (var1x | var2x) & (~var1x | ~var2x);
                  var10004x = (int)4079367706729054408L;
                  var2x = -1295941310;
                  var1x = var10004x;
                  var10004x = var1x & ~var2x | ~var1x & var2x;
                  var2x = 601814943;
                  var1x = var10004x;
                  var10004x = (var1x + var2x - 2 * (var1x & var2x)) * (var1x + var2x - 2 * (var1x & var2x));
                  var2x = 618835184;
                  var1x = -2023639342;
                  var10004x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = -259845456;
                  var1x = var10004x;
                  var10004x = var1x & ~var2x | ~var1x & var2x;
                  var10006x = (int)2570444548615532657L;
                  var2x = -404017186;
                  var1x = var10006x;
                  var10006x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = 1559912382;
                  var1x = var10006x;
                  var10006x = var1x & ~var2x | ~var1x & var2x;
                  var2x = 214610199;
                  var1x = -1412513189;
                  var10006x = var1x & ~var2x | ~var1x & var2x;
                  var2x = -1492880545;
                  var1x = var10006x;
                  var10006x = var1x & ~var2x | ~var1x & var2x;
                  var10006x = (int)231681151860340594L;
                  var2x = 1675481340;
                  var1x = var10006x;
                  var10006x = var1x & ~var2x | ~var1x & var2x;
                  var2x = -703322233;
                  var1x = var10006x;
                  var10006x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = 458991929;
                  var1x = 1888480101;
                  var10006x = var1x & ~var2x | ~var1x & var2x;
                  var2x = 1809072732;
                  var1x = var10006x;
                  var10006x = var1x & ~var2x | ~var1x & var2x;
                  var2x = -366111511;
                  var1x = 1401237758;
                  int var131x = (var1x | var2x) - (var1x & var2x);
                  var2x = -1412377036;
                  var1x = var131x;
                  int var132x = (var1x | var2x) & ~(var1x & var2x);
                  var10006x = (int)365529013039883364L;
                  var2x = 1623036003;
                  var1x = var10006x;
                  var10006x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = 776033469;
                  var1x = var10006x;
                  var10006x = (var1x | var2x) & (~var1x | ~var2x);
                  int var10007x = (int)6202194333086824555L;
                  var2x = -1972118933;
                  var1x = var10007x;
                  var10007x = (var1x | var2x) - (var1x & var2x);
                  var2x = -749183962;
                  var1x = var10007x;
                  var2x = var1x + var2x - 2 * (var1x & var2x);
                  var1x = var10006x;
                  var10006x = (var1x & ~var2x) + (var2x & ~var1x) + 2 * (var1x & var2x);
                  var2x = 1852489098;
                  var1x = 1481170297;
                  var10006x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = 913525439;
                  var1x = var10006x;
                  if (!var10000.b(
                     c(
                        "\udc21굔\udc35굛\ud820ꥄ\ud820괨\udc30괮\udc42굗\udc46괤",
                        "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w",
                        var10003x,
                        var10004x,
                        var132x,
                        var1x & ~var2x | ~var1x & var2x
                     )
                  )) {
                     int var103x = (int)-8895996501730469990L;
                     var2x = 805911223;
                     var1x = var103x;
                     int var104x = (var1x | var2x) & ~(var1x & var2x);
                     var2x = -1086984915;
                     var1x = var104x;
                     return Boolean.valueOf(pulse.Bool.from((var1x | var2x) - (var1x & var2x)));
                  }
               }

               int var100x = (int)5580312379510320275L;
               var2x = -788466292;
               var1x = var100x;
               int var101x = var1x + var2x - 2 * (var1x & var2x);
               var2x = -848455394;
               var1x = var101x;
               return Boolean.valueOf(pulse.Bool.from((var1x | var2x) - (var1x & var2x)));
            }
         );
      var10003 = (585201465 ^ 521335800 ^ -272135085) + (-1382277324 ^ -1288701705 ^ 517143282);
      var10005 = (int)752819443482067669L ^ -1515899746 ^ 828683852;
      var10005 = (int)2715569803446189462L ^ -909898989 ^ -252971386;
      var10005 = 1419421825 ^ 87433449 ^ 1370261604;
      var10005 = (int)-2842071837717067466L ^ -538264069 ^ 1766929607;
      var10005 = (484742102 ^ -839166925 ^ 1613566105) * (484742102 ^ -839166925 ^ 1613566105);
      var10005 = -544995477 ^ 780544227 ^ -1750043477;
      var10006 = ((int)6003956409522517534L ^ 1263501359 ^ 1400033363) * ((int)6003956409522517534L ^ 1263501359 ^ 1400033363);
      var10006 = 329242132 ^ -1415848487 ^ 1799918265;
      var10007 = (-458979651 ^ -1206370131 ^ 1825623137) * (-458979651 ^ -1206370131 ^ 1825623137);
      var10007 = 954250017 ^ -696746794 ^ -442877516;
      var10009 = (int)-7063903320452538273L ^ 865628156 ^ 52498344;
      var10009 = -819359551 ^ 800515372 ^ -526420499;
      this.u = new BooleanSetting(
            c(
               "嵷㶟嵤㷯奱㶗嵪㶕嵤㶐崓㶝",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w",
               var10005,
               var10006,
               var10007,
               (int)9045338392513019014L ^ 599725918 ^ -579612665
            ),
            pulse.Bool.from((int)-3943608310365785656L ^ -1 ^ -1)
         )
         .a(
            () -> {
               ModeSetting var10000 = this.e;
               int var2x = -1883689872;
               int var1x = 1971158693;
               int var10001 = var1x + var2x - 2 * (var1x & var2x);
               var2x = 1477996034;
               var1x = var10001;
               var10001 = (var1x | var2x) & (~var1x | ~var2x);
               var2x = -2057405485;
               var1x = -906651319;
               int var10003x = var1x & ~var2x | ~var1x & var2x;
               var2x = 1286333080;
               var1x = var10003x;
               var10003x = (var1x | var2x) & ~(var1x & var2x);
               int var10004x = (int)-1582128766494909113L;
               var2x = 2110012525;
               var1x = var10004x;
               var10004x = (var1x | var2x) & ~(var1x & var2x);
               var2x = -1981751001;
               var1x = var10004x;
               var10004x = var1x + var2x - 2 * (var1x & var2x);
               var2x = -955157817;
               var1x = 1652449077;
               var10004x = var1x & ~var2x | ~var1x & var2x;
               var2x = -1519440395;
               var1x = var10004x;
               var10004x = (var1x | var2x) & ~(var1x & var2x);
               var2x = 639408597;
               var1x = -573257721;
               var10003x = var1x & ~var2x | ~var1x & var2x;
               var2x = -1652946191;
               var1x = var10003x;
               var10003x = (var1x | var2x) - (var1x & var2x);
               String var115x = "eet";
               var2x = 1987355820;
               var1x = -2047250720;
               var10004x = (var1x | var2x) - (var1x & var2x);
               var2x = -1586831692;
               var1x = var10004x;
               var10004x = (var1x | var2x) & ~(var1x & var2x);
               int var10005x = (int)-5391968843799960463L;
               var2x = -1748896568;
               var1x = var10005x;
               var10005x = (var1x | var2x) & ~(var1x & var2x);
               var2x = 756857422;
               var1x = var10005x;
               var10005x = (var1x + var2x - 2 * (var1x & var2x)) * (var1x + var2x - 2 * (var1x & var2x));
               var10005x = (int)9052356551836521488L;
               var2x = -27763212;
               var1x = var10005x;
               var10005x = (var1x | var2x) & ~(var1x & var2x);
               var2x = 1982588843;
               var1x = var10005x;
               var10005x = var1x & ~var2x | ~var1x & var2x;
               int var10006x = (int)5303386181409485077L;
               var2x = 907886264;
               var1x = var10006x;
               var10006x = var1x & ~var2x | ~var1x & var2x;
               var2x = -684781594;
               var1x = var10006x;
               var10006x = (var1x | var2x) & ~(var1x & var2x);
               var2x = 192009889;
               var1x = 1217339386;
               int var10007x = var1x & ~var2x | ~var1x & var2x;
               var2x = 840897817;
               var1x = var10007x;
               var2x = (var1x | var2x) - (var1x & var2x);
               var1x = var10006x;
               var10006x = (var1x & ~var2x) + (var2x & ~var1x) + 2 * (var1x & var2x);
               var2x = -1120877708;
               var1x = 36018190;
               var10006x = var1x & ~var2x | ~var1x & var2x;
               var2x = -1087541813;
               var1x = var10006x;
               if (var10000.b(
                  c(
                     "\udc25놫\udc3c뇙\udc3d놫\ud827뇒\udc37뇔\udc45놭\udc41뇞",
                     "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w",
                     var10003x,
                     var10004x,
                     var10005x,
                     (var1x | var2x) - (var1x & var2x)
                  )
               )) {
                  if (b) {
                     throw new RuntimeException();
                  }
               } else {
                  var10001 = (int)-3188670354103919136L;
                  var2x = -1397174985;
                  var1x = var10001;
                  var10001 = var1x & ~var2x | ~var1x & var2x;
                  var2x = -1873039656;
                  var1x = var10001;
                  var10001 = (var1x & ~var2x | ~var1x & var2x) * (var1x & ~var2x | ~var1x & var2x);
                  String var10002 = "eeu";
                  var10003x = (int)8602113268120130145L;
                  var2x = -1579420885;
                  var1x = var10003x;
                  var10003x = var1x & ~var2x | ~var1x & var2x;
                  var2x = 1004571223;
                  var1x = var10003x;
                  var10003x = (var1x | var2x) - (var1x & var2x);
                  var10004x = (int)-291342425413018978L;
                  var2x = -1734958206;
                  var1x = var10004x;
                  var10004x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = -1811124488;
                  var1x = var10004x;
                  var2x = var1x & ~var2x | ~var1x & var2x;
                  var1x = var10003x;
                  var10003x = 2 * (var1x | var2x) - (var1x ^ var2x);
                  var10003x = (int)4232547542683637787L;
                  var2x = -4794252;
                  var1x = var10003x;
                  var10003x = (var1x | var2x) - (var1x & var2x);
                  var2x = 832101196;
                  var1x = var10003x;
                  var10003x = var1x & ~var2x | ~var1x & var2x;
                  var10004x = (int)2859827951882662889L;
                  var2x = 1815965829;
                  var1x = var10004x;
                  var10004x = (var1x | var2x) - (var1x & var2x);
                  var2x = -1464921095;
                  var1x = var10004x;
                  var10004x = (var1x | var2x) - (var1x & var2x);
                  var10004x = (int)2567555267341581501L;
                  var2x = 816439848;
                  var1x = var10004x;
                  var10004x = var1x + var2x - 2 * (var1x & var2x);
                  var2x = -519240163;
                  var1x = var10004x;
                  var10004x = var1x & ~var2x | ~var1x & var2x;
                  String var131x = "eev";
                  var10005x = (int)-3508288340297211967L;
                  var2x = -237098315;
                  var1x = var10005x;
                  var10005x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = 1811211896;
                  var1x = var10005x;
                  var10005x = (var1x | var2x) & (~var1x | ~var2x);
                  var10006x = (int)3078506317265388971L;
                  var2x = -125335307;
                  var1x = var10006x;
                  var10006x = var1x + var2x - 2 * (var1x & var2x);
                  var2x = -2025433604;
                  var1x = var10006x;
                  var10006x = (var1x | var2x) - (var1x & var2x);
                  var2x = -1367683905;
                  var1x = 594915225;
                  var10006x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = -1928898201;
                  var1x = var10006x;
                  if (!this.e
                     .b(
                        c(
                           "\udc26뵞\udc32뵑\ud827륎\ud827봢\udc37봤\udc45뵝\udc41봮",
                           "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w",
                           var10003x,
                           var10004x,
                           var10005x,
                           (var1x | var2x) - (var1x & var2x)
                        )
                     )) {
                     var2x = -1398664080;
                     var1x = 273501695;
                     int var96x = (var1x | var2x) & ~(var1x & var2x);
                     var2x = -1125164657;
                     var1x = var96x;
                     return Boolean.valueOf(pulse.Bool.from((var1x | var2x) & ~(var1x & var2x)));
                  }
               }

               int var93x = (int)-4224161553837442270L;
               var2x = 1209005934;
               var1x = var93x;
               int var94x = (var1x | var2x) - (var1x & var2x);
               var2x = -844641203;
               var1x = var94x;
               return Boolean.valueOf(pulse.Bool.from((var1x | var2x) & ~(var1x & var2x)));
            }
         );
      var10003 = (int)5406954437557163245L ^ -91498517 ^ -994698151;
      var10004 = -768502909 ^ -433032215 ^ 190247229;
      var10005 = (-746455844 ^ 1180860480 ^ -1763865970) + ((int)-2080418205275004751L ^ -70311771 ^ 1728814729);
      var10005 = -1229385457 ^ 1785660061 ^ -1167832911;
      var10007 = (int)-3727734214567453361L ^ 1510391447 ^ 698721224;
      var10007 = 765565695 ^ 775999065 ^ 65098932;
      var10007 = (int)-5799012222911353107L ^ 470154392 ^ -1992453507;
      var10006 = (int)4075613620326947272L ^ -1676580368 ^ -832389164;
      var10007 = -1804340029 ^ -1861380609 ^ -1938856271;
      var10007 = (int)8020575662085592681L ^ -1580471240 ^ 1551103449;
      var10008 = ((int)-5024300929914462733L ^ 1662806146 ^ -708802784) * ((int)-5024300929914462733L ^ 1662806146 ^ -708802784);
      this.v = new ColorSetting(
            c("嵋됕崐둧嵯됙嵬둮嵨뀅崗됗嵤둧", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w", var10005, var10006, var10007, 338730871 ^ -1774607404 ^ -2111861004),
            Color.WHITE
         )
         .a(
            () -> {
               label18: {
                  int var2x = -668325088;
                  int var1x = 1092827472;
                  int var10001 = var1x & ~var2x | ~var1x & var2x;
                  var2x = -1390275932;
                  var1x = var10001;
                  var10001 = (var1x | var2x) & ~(var1x & var2x);
                  String var10002 = "eeq";
                  var2x = -1383145829;
                  var1x = -1080011706;
                  int var10003x = var1x & ~var2x | ~var1x & var2x;
                  var2x = -1419397298;
                  var1x = var10003x;
                  var10003x = ((var1x | var2x) & ~(var1x & var2x)) * ((var1x | var2x) & ~(var1x & var2x));
                  var10003x = (int)5889186865465385702L;
                  var2x = -1451466724;
                  var1x = var10003x;
                  var10003x = (var1x | var2x) - (var1x & var2x);
                  var2x = -1271146023;
                  var1x = var10003x;
                  var10003x = (var1x | var2x) & ~(var1x & var2x);
                  String var10004x = "eer";
                  var2x = 1621410454;
                  var1x = 1269687309;
                  int var110x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = 2043778370;
                  var1x = var110x;
                  int var111x = (var1x | var2x) - (var1x & var2x);
                  int var10005x = (int)-6895030480149356032L;
                  var2x = 576003445;
                  var1x = var10005x;
                  var10005x = (var1x | var2x) - (var1x & var2x);
                  var2x = 287914628;
                  var1x = var10005x;
                  var10005x = (var1x + var2x - 2 * (var1x & var2x)) * (var1x + var2x - 2 * (var1x & var2x));
                  var2x = -1545779290;
                  var1x = -1121173341;
                  var10005x = var1x & ~var2x | ~var1x & var2x;
                  var2x = 168196783;
                  var1x = var10005x;
                  var10005x = var1x & ~var2x | ~var1x & var2x;
                  var2x = -187457152;
                  var1x = -1323718340;
                  int var10006x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = 471176034;
                  var1x = var10006x;
                  var10006x = (var1x | var2x) - (var1x & var2x);
                  var2x = -1826114001;
                  var1x = -1723496087;
                  int var10007x = var1x + var2x - 2 * (var1x & var2x);
                  var2x = 726146381;
                  var1x = var10007x;
                  var2x = var1x & ~var2x | ~var1x & var2x;
                  var1x = var10006x;
                  var10006x = var1x - ~var2x - 1;
                  var2x = 883623534;
                  var1x = 1549332507;
                  var10006x = (var1x | var2x) - (var1x & var2x);
                  var2x = 1759126500;
                  var1x = var10006x;
                  if (!this.e
                     .b(
                        c(
                           "\udc24劊\udc3d勸\udc3c劊\ud826勳\udc36勵\udc44劌\udc40勿",
                           "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w",
                           var10003x,
                           var111x,
                           var10005x,
                           (var1x | var2x) - (var1x & var2x)
                        )
                     )) {
                     ModeSetting var10000 = this.e;
                     var2x = 1964970957;
                     var1x = 1837293173;
                     int var98x = (var1x | var2x) & ~(var1x & var2x);
                     var2x = 412995005;
                     var1x = var98x;
                     int var99x = (var1x | var2x) - (var1x & var2x);
                     var2x = -1423174523;
                     var1x = -870626676;
                     int var100x = (var1x | var2x) & (~var1x | ~var2x);
                     var2x = 1731681798;
                     var1x = var100x;
                     int var101x = (var1x | var2x) - (var1x & var2x);
                     var10002 = "ees";
                     int var112x = (int)2798198221244447989L;
                     var2x = -748178292;
                     var1x = var112x;
                     int var113x = (var1x | var2x) & (~var1x | ~var2x);
                     var2x = 1056966770;
                     var1x = var113x;
                     int var114x = var1x + var2x - 2 * (var1x & var2x);
                     var10003x = (int)7606763269329386546L;
                     var2x = -937932905;
                     var1x = var10003x;
                     var10003x = var1x + var2x - 2 * (var1x & var2x);
                     var2x = -1334321018;
                     var1x = var10003x;
                     var10003x = (var1x | var2x) & (~var1x | ~var2x);
                     int var115x = (int)-5573891836977903442L;
                     var2x = 1115459784;
                     var1x = var115x;
                     int var116x = (var1x | var2x) - (var1x & var2x);
                     var2x = 1232326292;
                     var1x = var116x;
                     int var117x = (var1x | var2x) & (~var1x | ~var2x);
                     var2x = -1816331453;
                     var1x = -1075833821;
                     int var118x = var1x + var2x - 2 * (var1x & var2x);
                     var2x = 2136796701;
                     var1x = var118x;
                     int var119x = (var1x | var2x) - (var1x & var2x);
                     var2x = 726981990;
                     var1x = -2052426370;
                     var10005x = var1x & ~var2x | ~var1x & var2x;
                     var2x = -1434603503;
                     var1x = var10005x;
                     var10005x = ((var1x | var2x) & (~var1x | ~var2x)) * ((var1x | var2x) & (~var1x | ~var2x));
                     var2x = 1407988555;
                     var1x = 1540146999;
                     var10005x = var1x + var2x - 2 * (var1x & var2x);
                     var2x = 264569306;
                     var1x = var10005x;
                     var10005x = var1x & ~var2x | ~var1x & var2x;
                     var10006x = (int)7729835101167771015L;
                     var2x = 819145261;
                     var1x = var10006x;
                     var10006x = (var1x | var2x) & ~(var1x & var2x);
                     var2x = -1290405406;
                     var1x = var10006x;
                     var10006x = (var1x | var2x) & (~var1x | ~var2x);
                     var10007x = (int)6963146001758139891L;
                     var2x = -1526398615;
                     var1x = var10007x;
                     var10007x = var1x & ~var2x | ~var1x & var2x;
                     var2x = 1212820452;
                     var1x = var10007x;
                     var2x = var1x & ~var2x | ~var1x & var2x;
                     var1x = var10006x;
                     var10006x = (var1x ^ var2x) + 2 * (var1x & var2x);
                     var2x = -1086919916;
                     var1x = 1662944168;
                     var10006x = var1x + var2x - 2 * (var1x & var2x);
                     var2x = -596030583;
                     var1x = var10006x;
                     if (!var10000.b(
                        c(
                           "\udc27ꐫ\udc33ꐤ\ud826ꀻ\ud826ꑗ\udc36ꑑ\udc44ꐨ\udc40ꑛ",
                           "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w",
                           var10003x,
                           var119x,
                           var10005x,
                           (var1x | var2x) - (var1x & var2x)
                        )
                     )) {
                        break label18;
                     }
                  }

                  if (!this.u.a()) {
                     int var93x = (int)7323988138249636746L;
                     var2x = 17029090;
                     var1x = var93x;
                     var93x = (var1x | var2x) & ~(var1x & var2x);
                     var2x = 1451793513;
                     var1x = var93x;
                     return Boolean.valueOf(pulse.Bool.from((var1x | var2x) & (~var1x | ~var2x)));
                  }
               }

               int var91x = 93656828;
               int var46x = -248076039;
               int var96x = (var46x | var91x) & (~var46x | ~var91x);
               var91x = -190595579;
               var46x = var96x;
               return Boolean.valueOf(pulse.Bool.from(var46x & ~var91x | ~var46x & var91x));
            }
         );
      this.w = new ArrayDeque<>();
      this.A = pulse.Bool.from(-428307955 ^ 1909187629 ^ -1749848544);
   }

   @EventHandler
   public void a(WorldRenderStartEvent var1) {
      String var2 = this.e.d();
      int var10001 = (int)1393049668736021536L;
      int var13 = -1246670875;
      int var12 = var10001;
      var10001 = var12 + var13 - 2 * (var12 & var13);
      var13 = 2064492304;
      var12 = var10001;
      var10001 = var12 + var13 - 2 * (var12 & var13);
      int var10002 = (int)6627768154056145134L;
      var13 = -1503204262;
      var12 = var10002;
      var10002 = var12 + var13 - 2 * (var12 & var13);
      var13 = -553459117;
      var12 = var10002;
      var13 = var12 & ~var13 | ~var12 & var13;
      var12 = var10001;
      var10001 = (var12 ^ var13) + 2 * (var12 & var13);
      int var10003 = (int)-712796483545862216L;
      var13 = 1329820863;
      var12 = var10003;
      var10003 = var12 & ~var13 | ~var12 & var13;
      var13 = -1101358330;
      var12 = var10003;
      var10003 = var12 & ~var13 | ~var12 & var13;
      var13 = 414478880;
      var12 = 558002230;
      var10003 = (var12 | var13) & (~var12 | ~var13);
      var13 = -1366956403;
      var12 = var10003;
      var10003 = var12 & ~var13 | ~var12 & var13;
      int var10004 = (int)-4091021238285072155L;
      var13 = -1510792700;
      var12 = var10004;
      var10004 = var12 + var13 - 2 * (var12 & var13);
      var13 = 579019817;
      var12 = var10004;
      var13 = var12 & ~var13 | ~var12 & var13;
      var12 = var10003;
      var10003 = 2 * (var12 | var13) - (var12 ^ var13);
      var13 = 1434179561;
      var12 = 673845616;
      var10003 = var12 & ~var13 | ~var12 & var13;
      var13 = 467901882;
      var12 = var10003;
      var10003 = (var12 | var13) & (~var12 | ~var13);
      var13 = -827172704;
      var12 = -1915906750;
      var10004 = (var12 | var13) - (var12 & var13);
      var13 = -1983650422;
      var12 = var10004;
      var10004 = (var12 | var13) & ~(var12 & var13);
      var10004 = (int)-1880016334926571694L;
      var13 = -1725365512;
      var12 = var10004;
      var10004 = (var12 | var13) & ~(var12 & var13);
      var13 = 662543509;
      var12 = var10004;
      var10004 = (var12 | var13) - (var12 & var13);
      var13 = 1598991435;
      var12 = -289547390;
      int var10005 = (var12 | var13) & ~(var12 & var13);
      var13 = -380365388;
      var12 = var10005;
      var10005 = (var12 | var13) & ~(var12 & var13);
      int var10006 = (int)1004756580093510941L;
      var13 = -1574716425;
      var12 = var10006;
      var10006 = var12 + var13 - 2 * (var12 & var13);
      var13 = -1714511117;
      var12 = var10006;
      var13 = (var12 | var13) & (~var12 | ~var13);
      var12 = var10005;
      var10005 = (var12 | var13) + (var12 & var13);
      var13 = 206067961;
      var12 = 72467901;
      var10005 = (var12 | var13) & (~var12 | ~var13);
      var13 = 287347502;
      var12 = var10005;
      var10005 = var12 & ~var13 | ~var12 & var13;
      String var173 = "ecy";
      var13 = 493130746;
      var12 = 179129404;
      var10006 = var12 + var13 - 2 * (var12 & var13);
      var13 = 395276424;
      var12 = var10006;
      if (!var2.equals(
         c("⇏햾⇖헌⇗햾◍헁⇖햵⇙", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w", var10003, var10004, var10005, var12 + var13 - 2 * (var12 & var13))
      )) {
         var10001 = (int)-2380397526330739597L;
         var13 = 871386024;
         var12 = var10001;
         var10001 = (var12 | var13) & (~var12 | ~var13);
         var13 = 1530207232;
         var12 = var10001;
         var10001 = (var12 | var13) - (var12 & var13);
         var13 = -286543055;
         var12 = 1314862874;
         var10002 = var12 + var13 - 2 * (var12 & var13);
         var13 = -1419578136;
         var12 = var10002;
         var13 = (var12 | var13) & (~var12 | ~var13);
         var12 = var10001;
         var10001 = (var12 ^ var13) + 2 * (var12 & var13);
         var10002 = (int)-3766392081212622557L;
         var13 = 1709471333;
         var12 = var10002;
         var10002 = var12 & ~var13 | ~var12 & var13;
         var13 = 1975536947;
         var12 = var10002;
         var10002 = (var12 | var13) & ~(var12 & var13);
         var10004 = (int)-8909235881578294509L;
         var13 = 375181385;
         var12 = var10004;
         var10004 = var12 + var13 - 2 * (var12 & var13);
         var13 = 738214736;
         var12 = var10004;
         var10004 = var12 + var13 - 2 * (var12 & var13);
         var10003 = (int)-3849884334553271308L;
         var13 = 1494908572;
         var12 = var10003;
         var10003 = (var12 | var13) & (~var12 | ~var13);
         var13 = 1530156619;
         var12 = var10003;
         var10003 = var12 + var13 - 2 * (var12 & var13);
         String var160 = "ecz";
         var13 = -741454178;
         var12 = 1845731303;
         var10004 = (var12 | var13) & ~(var12 & var13);
         var13 = -1414478073;
         var12 = var10004;
         var10004 = var12 + var13 - 2 * (var12 & var13);
         var10005 = (int)263845143055913718L;
         var13 = -128051490;
         var12 = var10005;
         var10005 = (var12 | var13) & ~(var12 & var13);
         var13 = 1893145515;
         var12 = var10005;
         var10005 = (var12 | var13) - (var12 & var13);
         var13 = 1613848898;
         var12 = 1897760096;
         var10005 = var12 & ~var13 | ~var12 & var13;
         var13 = 119326795;
         var12 = var10005;
         var10005 = var12 & ~var13 | ~var12 & var13;
         var13 = 32163875;
         var12 = 1521383154;
         var10006 = (var12 | var13) & (~var12 | ~var13);
         var13 = 1324708257;
         var12 = var10006;
         var10006 = var12 & ~var13 | ~var12 & var13;
         int var10007 = (int)-4962870203515842948L;
         var13 = -1228693638;
         var12 = var10007;
         var10007 = (var12 | var13) & (~var12 | ~var13);
         var13 = 1667477231;
         var12 = var10007;
         var13 = (var12 | var13) - (var12 & var13);
         var12 = var10006;
         var10006 = (var12 & ~var13) + (var13 & ~var12) + 2 * (var12 & var13);
         var13 = 1199967314;
         var12 = 506869988;
         var10006 = var12 & ~var13 | ~var12 & var13;
         var13 = 1501694011;
         var12 = var10006;
         if (!var2.equals(
            c("⇌䙸⇘䙷◍䉨◍䘄⇝䘂↯䙻↫䘈", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w", var10003, var10004, var10005, var12 & ~var13 | ~var12 & var13)
         )) {
            return;
         }
      }

      ClientPlayerEntity var3 = c.player;
      if (var3 != null && c.world != null) {
         float var4 = var1.a();
         this.w.removeIf(var0 -> {
            int var10001x = (int)-2581046875346173968L;
            int var2x = 620813608;
            int var1x = var10001x;
            var10001x = var1x + var2x - 2 * (var1x & var2x);
            var2x = -1822743764;
            var1x = var10001x;
            return var0.a(var1x & ~var2x | ~var1x & var2x);
         });
         double var5 = MathHelper.lerp(var4, var3.prevX, var3.getX());
         double var7 = MathHelper.lerp(var4, var3.prevY, var3.getY());
         double var9 = MathHelper.lerp(var4, var3.prevZ, var3.getZ());
         Vec3d var11 = new Vec3d(var5, var7, var9);
         if (!this.w.isEmpty()) {
            double var10000 = this.w.getLast().a.squaredDistanceTo(var11);
            var10001 = (int)7101620621781279452L;
            var13 = -1268581146;
            var12 = var10001;
            var10001 = (var12 | var13) & ~(var12 & var13);
            var13 = -1701913701;
            var12 = var10001;
            var10001 = (var12 + var13 - 2 * (var12 & var13)) * (var12 + var13 - 2 * (var12 & var13));
            if (!(var10000 > 1.0E-4)) {
               return;
            }
         }

         this.w.addLast(new Trails.TrailPoint(var11));

         while (true) {
            float var122 = this.w.size();
            float var133 = this.i.a();
            var13 = -2131698168;
            var12 = 270487450;
            var10002 = (var12 | var13) & ~(var12 & var13);
            var13 = -1838511404;
            var12 = var10002;
            var10002 = ((var12 | var13) & ~(var12 & var13)) * ((var12 | var13) & ~(var12 & var13));
            if (!(var122 > var133 * 10.0F)) {
               return;
            }

            this.w.pollFirst();
         }
      }
   }

   @EventHandler
   public void a(ClientTickEvent var1) {
      String var2 = this.e.d();
      String var10001 = "eda";
      int var10002 = (int)5763112881950493344L;
      int var25 = 1924400891;
      int var24 = var10002;
      var10002 = var24 + var25 - 2 * (var24 & var25);
      var25 = -678264981;
      var24 = var10002;
      var10002 = ((var24 | var25) & (~var24 | ~var25)) * ((var24 | var25) & (~var24 | ~var25));
      var25 = 760095449;
      var24 = -1879192257;
      int var10003 = (var24 | var25) - (var24 & var25);
      var25 = -1992798957;
      var24 = var10003;
      var10003 = (var24 | var25) & ~(var24 & var25);
      var25 = -1998439603;
      var24 = 1376010333;
      var10003 = var24 & ~var25 | ~var24 & var25;
      var25 = -1135337421;
      var24 = var10003;
      var10003 = var24 + var25 - 2 * (var24 & var25);
      int var10005 = (int)5490114919840909203L;
      var25 = -329398715;
      var24 = var10005;
      var10005 = (var24 | var25) & (~var24 | ~var25);
      var25 = 1768767954;
      var24 = var10005;
      var10005 = var24 + var25 - 2 * (var24 & var25);
      var25 = 339328671;
      var24 = 830151242;
      var10005 = var24 & ~var25 | ~var24 & var25;
      var25 = 625124550;
      var24 = var10005;
      var10005 = var24 + var25 - 2 * (var24 & var25);
      var25 = 1726538492;
      var24 = 1129302603;
      int var10004 = (var24 | var25) - (var24 & var25);
      var25 = 266282249;
      var24 = var10004;
      var10004 = (var24 | var25) & (~var24 | ~var25);
      var10005 = (int)-8615216137365104200L;
      var25 = -1818282683;
      var24 = var10005;
      var10005 = (var24 | var25) & ~(var24 & var25);
      var25 = -1639770529;
      var24 = var10005;
      var10005 = var24 & ~var25 | ~var24 & var25;
      var10005 = (int)2122501415514770418L;
      var25 = -1092157545;
      var24 = var10005;
      var10005 = (var24 | var25) & ~(var24 & var25);
      var25 = 12458182;
      var24 = var10005;
      var10005 = (var24 | var25) - (var24 & var25);
      int var10006 = (int)-747446515221885108L;
      var25 = 1260918092;
      var24 = var10006;
      var10006 = (var24 | var25) & ~(var24 & var25);
      var25 = -2134758447;
      var24 = var10006;
      var10006 = (var24 | var25) & (~var24 | ~var25);
      int var10007 = (int)-5385691502747354204L;
      var25 = -1096484258;
      var24 = var10007;
      var10007 = var24 + var25 - 2 * (var24 & var25);
      var25 = 1451741424;
      var24 = var10007;
      var25 = (var24 | var25) & (~var24 | ~var25);
      var24 = var10006;
      var10006 = (var24 ^ var25) + 2 * (var24 & var25);
      var25 = -1342728429;
      var24 = -1988842765;
      var10006 = var24 + var25 - 2 * (var24 & var25);
      var25 = 648469407;
      var24 = var10006;
      if (!var2.equals(
         c("錝⹝錄ⸯ錅⹝霟⸤錏⸢鍽⹛鍹⸨", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w", var10003, var10004, var10005, var24 + var25 - 2 * (var24 & var25))
      )) {
         int var238 = (int)-1951120589581358327L;
         var25 = -1808681847;
         var24 = var238;
         int var239 = var24 & ~var25 | ~var24 & var25;
         var25 = -1164249508;
         var24 = var239;
         int var240 = (var24 | var25) & ~(var24 & var25);
         var10002 = (int)742647969981927593L;
         var25 = -1865404619;
         var24 = var10002;
         var10002 = var24 + var25 - 2 * (var24 & var25);
         var25 = 653376612;
         var24 = var10002;
         var25 = var24 + var25 - 2 * (var24 & var25);
         var24 = var240;
         int var241 = (var24 ^ var25) + 2 * (var24 & var25);
         var10002 = (int)8962347058901301924L;
         var25 = 317283708;
         var24 = var10002;
         var10002 = (var24 | var25) & ~(var24 & var25);
         var25 = 226892474;
         var24 = var10002;
         var10002 = var24 + var25 - 2 * (var24 & var25);
         var25 = -1984144946;
         var24 = -1422459153;
         var10003 = var24 + var25 - 2 * (var24 & var25);
         var25 = 1588268028;
         var24 = var10003;
         var10003 = ((var24 | var25) & ~(var24 & var25)) * ((var24 | var25) & ~(var24 & var25));
         var25 = 1606557002;
         var24 = 1182829455;
         var10003 = var24 & ~var25 | ~var24 & var25;
         var25 = 2146487782;
         var24 = var10003;
         var10003 = (var24 | var25) & ~(var24 & var25);
         var10005 = (int)-4661746167958168374L;
         var25 = 567962646;
         var24 = var10005;
         var10005 = var24 & ~var25 | ~var24 & var25;
         var25 = 134934733;
         var24 = var10005;
         var10005 = var24 + var25 - 2 * (var24 & var25);
         var25 = -541521791;
         var24 = -1831976375;
         var10004 = var24 + var25 - 2 * (var24 & var25);
         var25 = 1730705415;
         var24 = var10004;
         var10004 = var24 + var25 - 2 * (var24 & var25);
         String var313 = "edb";
         var25 = -22961893;
         var24 = -336429715;
         var10005 = (var24 | var25) & ~(var24 & var25);
         var25 = 486733932;
         var24 = var10005;
         var10005 = var24 + var25 - 2 * (var24 & var25);
         var10006 = (int)2203714573235911338L;
         var25 = 1667017408;
         var24 = var10006;
         var10006 = var24 + var25 - 2 * (var24 & var25);
         var25 = 1207186410;
         var24 = var10006;
         var10006 = (var24 + var25 - 2 * (var24 & var25)) * (var24 + var25 - 2 * (var24 & var25));
         var25 = -441201302;
         var24 = 1792350583;
         var10006 = var24 + var25 - 2 * (var24 & var25);
         var25 = -1888755827;
         var24 = var10006;
         if (!var2.equals(
            c("錞쎷錊쎸霟잧霟쏋錏쏍鍽쎴鍹쏇", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w", var10003, var10004, var10005, (var24 | var25) - (var24 & var25))
         )) {
            return;
         }
      }

      if (c.player != null) {
         if (!c.options.getPerspective().isFirstPerson() || this.f.k()) {
            double var3 = c.player.getX();
            double var5 = c.player.getY();
            double var7 = c.player.getZ();
            if (!this.A) {
               this.x = var3;
               this.y = var5;
               this.z = var7;
               var25 = 984517048;
               var24 = -551543155;
               int var251 = var24 & ~var25 | ~var24 & var25;
               var25 = -443640012;
               var24 = var251;
               this.A = pulse.Bool.from((var24 | var25) - (var24 & var25));
            } else {
               double var9 = var3 - this.x;
               double var11 = var5 - this.y;
               double var13 = var7 - this.z;
               double var15 = Math.sqrt(var9 * var9 + var11 * var11 + var13 * var13);
               this.x = var3;
               this.y = var5;
               this.z = var7;
               var10001 = "edc";
               if (var15 > 0.01) {
                  String var17 = this.n.d();
                  var10001 = "edd";
                  var10003 = (int)3499092001980582116L;
                  var25 = -1077380597;
                  var24 = var10003;
                  var10003 = var24 & ~var25 | ~var24 & var25;
                  var25 = -1178668309;
                  var24 = var10003;
                  var10003 = var24 & ~var25 | ~var24 & var25;
                  String var273 = "ede";
                  var25 = 1729464251;
                  var24 = -1718566869;
                  var10003 = (var24 | var25) - (var24 & var25);
                  var25 = -1741218637;
                  var24 = var10003;
                  var10003 = var24 & ~var25 | ~var24 & var25;
                  String var291 = "edf";
                  var25 = 1329525878;
                  var24 = 1820045942;
                  var10004 = (var24 | var25) & ~(var24 & var25);
                  var25 = 153379252;
                  var24 = var10004;
                  var10004 = (var24 | var25) & (~var24 | ~var25);
                  var25 = 1185602273;
                  var24 = 339128946;
                  var10005 = (var24 | var25) & ~(var24 & var25);
                  var25 = -1137424929;
                  var24 = var10005;
                  var10005 = ((var24 | var25) - (var24 & var25)) * ((var24 | var25) - (var24 & var25));
                  var25 = -1597526828;
                  var24 = -1442010056;
                  var10005 = var24 + var25 - 2 * (var24 & var25);
                  var25 = 191702424;
                  var24 = var10005;
                  var10005 = var24 & ~var25 | ~var24 & var25;
                  var10006 = (int)-190543274672143863L;
                  var25 = -1992981401;
                  var24 = var10006;
                  var10006 = (var24 | var25) & (~var24 | ~var25);
                  var25 = 1915635439;
                  var24 = var10006;
                  var10006 = (var24 | var25) - (var24 & var25);
                  var10007 = (int)6397218445987399859L;
                  var25 = -1113578056;
                  var24 = var10007;
                  var10007 = (var24 | var25) & (~var24 | ~var25);
                  var25 = -1248858514;
                  var24 = var10007;
                  var25 = (var24 | var25) & (~var24 | ~var25);
                  var24 = var10006;
                  var10006 = var24 - ~var25 - 1;
                  var10006 = (int)3284738418002983840L;
                  var25 = 1426758897;
                  var24 = var10006;
                  var10006 = var24 + var25 - 2 * (var24 & var25);
                  var25 = 1277224740;
                  var24 = var10006;
                  if (!var17.equals(
                     c(
                        "錠졗錋챉錂졗錌졙錃졑",
                        "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w",
                        var10003,
                        var10004,
                        var10005,
                        (var24 | var25) & (~var24 | ~var25)
                     )
                  )) {
                     var25 = 1164636941;
                     var24 = 699762148;
                     int var244 = var24 + var25 - 2 * (var24 & var25);
                     var25 = -1926495450;
                     var24 = var244;
                     int var245 = ((var24 | var25) & ~(var24 & var25)) * ((var24 | var25) & ~(var24 & var25));
                     String var259 = "edh";
                     String var276 = "edi";
                     var25 = 370504877;
                     var24 = -453456706;
                     var10003 = var24 & ~var25 | ~var24 & var25;
                     var25 = -1805655248;
                     var24 = var10003;
                     var10003 = (var24 | var25) & ~(var24 & var25);
                     var25 = -1983121856;
                     var24 = 127568795;
                     var10004 = (var24 | var25) & ~(var24 & var25);
                     var25 = -1928580483;
                     var24 = var10004;
                     var10004 = (var24 | var25) & ~(var24 & var25);
                     var10005 = (int)141435122235149355L;
                     var25 = -1000179561;
                     var24 = var10005;
                     var10005 = (var24 | var25) & ~(var24 & var25);
                     var25 = -150808301;
                     var24 = var10005;
                     var25 = (var24 | var25) & (~var24 | ~var25);
                     var24 = var10004;
                     var10004 = (var24 | var25) + (var24 & var25);
                     var10004 = (int)-5655601949545590900L;
                     var25 = -2061767624;
                     var24 = var10004;
                     var10004 = (var24 | var25) & (~var24 | ~var25);
                     var25 = 2043899894;
                     var24 = var10004;
                     var10004 = (var24 | var25) - (var24 & var25);
                     String var322 = "edj";
                     var25 = -1607736077;
                     var24 = -121823062;
                     var10005 = (var24 | var25) & ~(var24 & var25);
                     var25 = 1525008866;
                     var24 = var10005;
                     var10005 = var24 & ~var25 | ~var24 & var25;
                     var10007 = (int)7091239487049790278L;
                     var25 = 1395692457;
                     var24 = var10007;
                     var10007 = (var24 | var25) & ~(var24 & var25);
                     var25 = 1105453285;
                     var24 = var10007;
                     var10007 = (var24 | var25) & ~(var24 & var25);
                     var25 = 1623174080;
                     var24 = 1166005071;
                     var10007 = var24 + var25 - 2 * (var24 & var25);
                     var25 = 633370782;
                     var24 = var10007;
                     var10007 = var24 & ~var25 | ~var24 & var25;
                     var10007 = (int)8486687079862028781L;
                     var25 = -1958515613;
                     var24 = var10007;
                     var10007 = var24 + var25 - 2 * (var24 & var25);
                     var25 = -1068391012;
                     var24 = var10007;
                     var10007 = var24 + var25 - 2 * (var24 & var25);
                     var10006 = (int)4153388448109451530L;
                     var25 = 537961792;
                     var24 = var10006;
                     var10006 = (var24 | var25) - (var24 & var25);
                     var25 = -1751344823;
                     var24 = var10006;
                     if (var17.equals(
                        c(
                           "錠괡霟굝錊괤鍼",
                           "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w",
                           var10003,
                           var10004,
                           var10005,
                           (var24 | var25) & (~var24 | ~var25)
                        )
                     )) {
                        double var18 = c.player.getHeight();
                        var25 = -341686581;
                        var24 = 1176010171;
                        int var10000 = (var24 | var25) & ~(var24 & var25);
                        var25 = -1380304016;
                        var24 = var10000;
                        int var20 = (var24 | var25) & (~var24 | ~var25);

                        while (true) {
                           var25 = 422199957;
                           var24 = -416923353;
                           int var246 = (var24 | var25) & ~(var24 & var25);
                           var25 = -32767049;
                           var24 = var246;
                           if (var20 >= var24 + var25 - 2 * (var24 & var25)) {
                              if (a != a) {
                                 var25 = 819177096;
                                 var24 = 1695995446;
                                 var10000 = (var24 | var25) & ~(var24 & var25);
                                 var25 = 1439002814;
                                 var24 = var10000;
                                 var10000 = var24 + var25 - 2 * (var24 & var25);
                                 var25 = -1137015624;
                                 var24 = -1550811557;
                                 int var250 = (var24 | var25) - (var24 & var25);
                                 var25 = 531299043;
                                 var24 = var250;
                                 var10000 /= (var24 | var25) & ~(var24 & var25);
                              }
                              break;
                           }

                           var25 = 636172192;
                           var24 = -1960759596;
                           int var247 = (var24 | var25) - (var24 & var25);
                           var25 = -2105453482;
                           var24 = var247;
                           int var248 = (var24 | var25) & ~(var24 & var25);
                           var10002 = (int)-1411520835822350435L;
                           var25 = 648326977;
                           var24 = var10002;
                           var10002 = (var24 | var25) & (~var24 | ~var25);
                           var25 = -1881892980;
                           var24 = var10002;
                           var25 = var24 & ~var25 | ~var24 & var25;
                           var24 = var248;
                           int var249 = (var24 ^ var25) + 2 * (var24 & var25);
                           double var21 = var18 / 4.0 * var20;
                           Vec3d var23 = c.player.getPos().add(0.0, var21, 0.0);
                           var25 = -597709000;
                           var24 = -1497066487;
                           var10003 = var24 & ~var25 | ~var24 & var25;
                           var25 = 2056993592;
                           var24 = var10003;
                           var10003 = (var24 | var25) & (~var24 | ~var25);
                           var25 = 1011798835;
                           var24 = 856772852;
                           var10003 = (var24 | var25) - (var24 & var25);
                           var25 = 257917899;
                           var24 = var10003;
                           var10003 = (var24 | var25) - (var24 & var25);
                           var25 = 2095213853;
                           var24 = 339706848;
                           var10003 = (var24 | var25) & ~(var24 & var25);
                           var25 = 1759375086;
                           var24 = var10003;
                           var10003 = (var24 | var25) & (~var24 | ~var25);
                           var10003 = (int)-5104202344105581016L;
                           var25 = -1089182230;
                           var24 = var10003;
                           var10003 = var24 & ~var25 | ~var24 & var25;
                           var25 = 1590330320;
                           var24 = var10003;
                           var10003 = (var24 | var25) & (~var24 | ~var25);
                           this.a(var23, 0.08, this.o().getRGB());
                           var20++;
                        }
                     }
                  } else {
                     Vec3d var26 = c.player.getPos();
                     String var262 = "edg";
                     this.a(var26, 0.1, this.o().getRGB());
                  }
               }
            }
         }
      }
   }

   @EventHandler
   public void a(WorldRenderEvent var1) {
      String var2 = this.e.d();
      int var10001 = (int)-5186681539460546578L;
      int var11 = -1405206985;
      int var10 = var10001;
      var10001 = var10 + var11 - 2 * (var10 & var11);
      var11 = 1229797897;
      var10 = var10001;
      var10001 = (var10 | var11) & ~(var10 & var11);
      int var10002 = (int)8149448261313505219L;
      var11 = -1116242805;
      var10 = var10002;
      var10002 = (var10 | var11) & (~var10 | ~var11);
      var11 = -256806552;
      var10 = var10002;
      var10002 = (var10 | var11) & ~(var10 & var11);
      int var10003 = (int)6274678308915061582L;
      var11 = -433784017;
      var10 = var10003;
      var10003 = (var10 | var11) - (var10 & var11);
      var11 = -35625217;
      var10 = var10003;
      var11 = var10 + var11 - 2 * (var10 & var11);
      var10 = var10002;
      var10002 = 2 * (var10 | var11) - (var10 ^ var11);
      var11 = 192014549;
      var10 = -379717013;
      var10003 = (var10 | var11) - (var10 & var11);
      var11 = 1633481482;
      var10 = var10003;
      var10003 = ((var10 | var11) & (~var10 | ~var11)) * ((var10 | var11) & (~var10 | ~var11));
      var10003 = (int)-4976371689516522829L;
      var11 = -719618634;
      var10 = var10003;
      var10003 = (var10 | var11) & ~(var10 & var11);
      var11 = -878214106;
      var10 = var10003;
      var10003 = (var10 | var11) & (~var10 | ~var11);
      var11 = -1173771584;
      var10 = -177369261;
      int var10005 = var10 & ~var11 | ~var10 & var11;
      var11 = 1331963264;
      var10 = var10005;
      var10005 = var10 & ~var11 | ~var10 & var11;
      var11 = 698951983;
      var10 = 790592116;
      var10005 = (var10 | var11) & (~var10 | ~var11);
      var11 = 112612178;
      var10 = var10005;
      var10005 = var10 + var11 - 2 * (var10 & var11);
      var11 = 1944023009;
      var10 = -1345733441;
      var10005 = (var10 | var11) & ~(var10 & var11);
      var11 = -602483883;
      var10 = var10005;
      var10005 = (var10 | var11) - (var10 & var11);
      var10005 = (int)4904005906140946153L;
      var11 = 49363271;
      var10 = var10005;
      var10005 = (var10 | var11) & ~(var10 & var11);
      var11 = -1727797316;
      var10 = var10005;
      var10005 = (var10 | var11) - (var10 & var11);
      var10005 = (int)4710231022688364379L;
      var11 = 1924332880;
      var10 = var10005;
      var10005 = (var10 | var11) & ~(var10 & var11);
      var11 = -1209034233;
      var10 = var10005;
      var10005 = (var10 | var11) - (var10 & var11);
      var11 = -331912663;
      var10 = 1429288161;
      int var10004 = var10 & ~var11 | ~var10 & var11;
      var11 = 118994667;
      var10 = var10004;
      var10004 = var10 + var11 - 2 * (var10 & var11);
      String var442 = "edk";
      var11 = 1098615960;
      var10 = 679845605;
      var10005 = var10 & ~var11 | ~var10 & var11;
      var11 = 2089804979;
      var10 = var10005;
      var10005 = (var10 | var11) - (var10 & var11);
      var11 = 1223991276;
      var10 = 330047491;
      int var10006 = var10 + var11 - 2 * (var10 & var11);
      var11 = 164007011;
      var10 = var10006;
      var10006 = var10 + var11 - 2 * (var10 & var11);
      var10006 = (int)-3166307938239625405L;
      var11 = 602178820;
      var10 = var10006;
      var10006 = var10 + var11 - 2 * (var10 & var11);
      var11 = -1740523796;
      var10 = var10006;
      if (var2.equals(
         c("䝔检䝍梲䝌检䍖梿䝍棋䝂", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w", var10003, var10004, var10005, var10 & ~var11 | ~var10 & var11)
      )) {
         if (a != a) {
            String var10000 = "edl";
            var11 = 65925772;
            var10 = -1520298977;
            int var313 = (var10 | var11) & (~var10 | ~var11);
            var11 = -1145610917;
            var10 = var313;
            int var9 = (var10 | var11) - (var10 & var11);
         }
      } else {
         var11 = 266304405;
         var10 = -1424343675;
         var10001 = (var10 | var11) - (var10 & var11);
         var11 = 1627619739;
         var10 = var10001;
         var10001 = (var10 | var11) & ~(var10 & var11);
         var11 = 59828487;
         var10 = 56463001;
         var10002 = var10 + var11 - 2 * (var10 & var11);
         var11 = 129158984;
         var10 = var10002;
         var10002 = (var10 | var11) - (var10 & var11);
         var10003 = (int)-986862115395539994L;
         var11 = 2134202283;
         var10 = var10003;
         var10003 = (var10 | var11) - (var10 & var11);
         var11 = 1379911464;
         var10 = var10003;
         var10003 = var10 + var11 - 2 * (var10 & var11);
         var10003 = (int)3663872418430547701L;
         var11 = 893052137;
         var10 = var10003;
         var10003 = (var10 | var11) & (~var10 | ~var11);
         var11 = 560974143;
         var10 = var10003;
         var10003 = var10 + var11 - 2 * (var10 & var11);
         var11 = -1562777487;
         var10 = -1675604980;
         var10004 = (var10 | var11) & (~var10 | ~var11);
         var11 = 1375581064;
         var10 = var10004;
         var10004 = (var10 | var11) & (~var10 | ~var11);
         var10005 = (int)-8710258520299321575L;
         var11 = 4389857;
         var10 = var10005;
         var10005 = (var10 | var11) - (var10 & var11);
         var11 = 1915813219;
         var10 = var10005;
         var11 = var10 & ~var11 | ~var10 & var11;
         var10 = var10004;
         var10004 = 2 * (var10 | var11) - (var10 ^ var11);
         var10004 = (int)7403967551020146271L;
         var11 = -1122258270;
         var10 = var10004;
         var10004 = var10 & ~var11 | ~var10 & var11;
         var11 = 2081512102;
         var10 = var10004;
         var10004 = (var10 | var11) & ~(var10 & var11);
         var10006 = (int)-8252797007976934687L;
         var11 = -872571758;
         var10 = var10006;
         var10006 = (var10 | var11) & (~var10 | ~var11);
         var11 = 2078101113;
         var10 = var10006;
         var10006 = (var10 | var11) & (~var10 | ~var11);
         var10006 = (int)-8756256783051713266L;
         var11 = -1224826868;
         var10 = var10006;
         var10006 = var10 + var11 - 2 * (var10 & var11);
         var11 = -2098744045;
         var10 = var10006;
         var10006 = var10 & ~var11 | ~var10 & var11;
         var11 = 945382687;
         var10 = 1234992752;
         var10006 = (var10 | var11) - (var10 & var11);
         var11 = 1908743011;
         var10 = var10006;
         var10006 = (var10 | var11) & ~(var10 & var11);
         var11 = 1516999702;
         var10 = 1443990556;
         var10005 = (var10 | var11) - (var10 & var11);
         var11 = 750312876;
         var10 = var10005;
         var10005 = var10 + var11 - 2 * (var10 & var11);
         int var10007 = (int)-6939168681936345576L;
         var11 = 93392246;
         var10 = var10007;
         var10007 = (var10 | var11) & (~var10 | ~var11);
         var11 = 1496984426;
         var10 = var10007;
         var10007 = var10 & ~var11 | ~var10 & var11;
         var11 = -409044170;
         var10 = -1661694447;
         var10007 = (var10 | var11) - (var10 & var11);
         var11 = 2070607147;
         var10 = var10007;
         var10007 = (var10 | var11) - (var10 & var11);
         var10006 = (int)-6719497548348144106L;
         var11 = -1801899773;
         var10 = var10006;
         var10006 = (var10 | var11) - (var10 & var11);
         var11 = 1562867190;
         var10 = var10006;
         if (!var2.equals(
            c("䝗麍䝃麂䍖骝䍖黱䝆黷䜴麎䜰黽", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w", var10003, var10004, var10005, (var10 | var11) & ~(var10 & var11))
         )) {
            return;
         }
      }

      if (c.world != null && c.player != null) {
         int var314 = this.w.size();
         var10001 = (int)-7721989278440167907L;
         var11 = -1767496273;
         var10 = var10001;
         var10001 = (var10 | var11) - (var10 & var11);
         var11 = -1785412688;
         var10 = var10001;
         if (var314 >= (var10 | var11) - (var10 & var11)) {
            if (!c.options.getPerspective().isFirstPerson() || this.f.k()) {
               MatrixStack var3 = var1.a();
               var3.push();
               Vec3d var4 = c.gameRenderer.getCamera().getPos();
               RenderSystem.enableBlend();
               RenderSystem.defaultBlendFunc();
               RenderSystem.disableCull();
               var314 = (int)-7203158955134208947L;
               var11 = -389597012;
               var10 = var314;
               var314 = (var10 | var11) & (~var10 | ~var11);
               var11 = -901116703;
               var10 = var314;
               RenderSystem.depthMask(pulse.Bool.from(var10 + var11 - 2 * (var10 & var11)));
               float var317 = this.j.a();
               var10002 = (int)-8352003972735688373L;
               var11 = 1680815470;
               var10 = var10002;
               var10002 = (var10 | var11) & (~var10 | ~var11);
               var11 = 1583289390;
               var10 = var10002;
               var10002 = var10 & ~var11 | ~var10 & var11;
               RenderSystem.lineWidth(var317 * 3.0F);
               RenderSystem.setShader(ShaderProgramKeys.POSITION_COLOR);
               Matrix4f var5 = var3.peek().getPositionMatrix();
               ArrayList var6 = new ArrayList<>(this.w);
               String var7 = this.h.d();
               var11 = 1960842607;
               var10 = 24704429;
               var314 = (var10 | var11) - (var10 & var11);
               var11 = -222626623;
               var10 = var314;
               var314 = var10 & ~var11 | ~var10 & var11;
               var10001 = (int)-3056186864166414230L;
               var11 = -672052367;
               var10 = var10001;
               var10001 = var10 + var11 - 2 * (var10 & var11);
               var11 = -259358374;
               var10 = var10001;
               var10001 = (var10 | var11) & (~var10 | ~var11);
               var11 = -2143476302;
               var10 = -1090765075;
               var10002 = var10 & ~var11 | ~var10 & var11;
               var11 = 591916028;
               var10 = var10002;
               var10002 = var10 + var11 - 2 * (var10 & var11);
               var11 = -572077975;
               var10 = 1108489997;
               var10003 = var10 + var11 - 2 * (var10 & var11);
               var11 = -282647790;
               var10 = var10003;
               var11 = (var10 | var11) - (var10 & var11);
               var10 = var10002;
               var10002 = (var10 | var11) + (var10 & var11);
               var11 = -901155807;
               var10 = 181867463;
               var10002 = var10 + var11 - 2 * (var10 & var11);
               var11 = -1507050299;
               var10 = var10002;
               var10002 = var10 & ~var11 | ~var10 & var11;
               var11 = -729653497;
               var10 = 442654853;
               var10003 = (var10 | var11) - (var10 & var11);
               var11 = 1467141709;
               var10 = var10003;
               var10003 = ((var10 | var11) - (var10 & var11)) * ((var10 | var11) - (var10 & var11));
               var11 = 182021392;
               var10 = 528357717;
               var10003 = (var10 | var11) - (var10 & var11);
               var11 = -1411135835;
               var10 = var10003;
               var10003 = (var10 | var11) & ~(var10 & var11);
               var10004 = (int)8313062891646400035L;
               var11 = 2104523813;
               var10 = var10004;
               var10004 = (var10 | var11) & (~var10 | ~var11);
               var11 = 1088067089;
               var10 = var10004;
               var10004 = var10 & ~var11 | ~var10 & var11;
               var11 = -1712686752;
               var10 = 81249147;
               var10005 = var10 + var11 - 2 * (var10 & var11);
               var11 = 1934887093;
               var10 = var10005;
               var11 = var10 + var11 - 2 * (var10 & var11);
               var10 = var10004;
               var10004 = (var10 ^ var11) + 2 * (var10 & var11);
               var10004 = (int)1477829417917188579L;
               var11 = 146855144;
               var10 = var10004;
               var10004 = var10 & ~var11 | ~var10 & var11;
               var11 = -2105462684;
               var10 = var10004;
               var10004 = var10 + var11 - 2 * (var10 & var11);
               var10006 = (int)5338988022816889413L;
               var11 = 1462677878;
               var10 = var10006;
               var10006 = var10 & ~var11 | ~var10 & var11;
               var11 = -2025952479;
               var10 = var10006;
               var10006 = (var10 | var11) & (~var10 | ~var11);
               var10006 = (int)1614050341383583514L;
               var11 = -1476806930;
               var10 = var10006;
               var10006 = var10 & ~var11 | ~var10 & var11;
               var11 = 2017296881;
               var10 = var10006;
               var10006 = (var10 | var11) - (var10 & var11);
               var11 = 1800264153;
               var10 = 801627111;
               var10006 = var10 + var11 - 2 * (var10 & var11);
               var11 = 1149895231;
               var10 = var10006;
               var10006 = var10 & ~var11 | ~var10 & var11;
               var10006 = (int)8138561582617406724L;
               var11 = -1669799280;
               var10 = var10006;
               var10006 = var10 + var11 - 2 * (var10 & var11);
               var11 = 787861403;
               var10 = var10006;
               var10006 = (var10 | var11) - (var10 & var11);
               var10005 = (int)-8537969120882769538L;
               var11 = 233567577;
               var10 = var10005;
               var10005 = (var10 | var11) & ~(var10 & var11);
               var11 = 457083727;
               var10 = var10005;
               if (!c("䝩⍾䝋⌇䜴⌅䜶", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w", var10002, var10003, var10004, (var10 | var11) - (var10 & var11))
                  .equals(var7)) {
                  var11 = 34472117;
                  var10 = -1877764684;
                  var314 = (var10 | var11) - (var10 & var11);
                  var11 = 284766549;
                  var10 = var314;
                  var314 = (var10 | var11) & ~(var10 & var11);
                  var10001 = (int)6273938320554691256L;
                  var11 = -879623907;
                  var10 = var10001;
                  var10001 = (var10 | var11) - (var10 & var11);
                  var11 = 1580572554;
                  var10 = var10001;
                  var10001 = (var10 | var11) - (var10 & var11);
                  var11 = 1996712694;
                  var10 = -1210358440;
                  var10002 = (var10 | var11) - (var10 & var11);
                  var11 = -1633751825;
                  var10 = var10002;
                  var11 = var10 & ~var11 | ~var10 & var11;
                  var10 = var10001;
                  var10001 = var10 - ~var11 - 1;
                  var10003 = (int)-1115952622001934671L;
                  var11 = -1095818804;
                  var10 = var10003;
                  var10003 = (var10 | var11) - (var10 & var11);
                  var11 = 96964466;
                  var10 = var10003;
                  var10003 = var10 & ~var11 | ~var10 & var11;
                  var10003 = (int)-8975820485470740729L;
                  var11 = -359921730;
                  var10 = var10003;
                  var10003 = var10 + var11 - 2 * (var10 & var11);
                  var11 = -514090838;
                  var10 = var10003;
                  var10003 = var10 & ~var11 | ~var10 & var11;
                  var10002 = (int)-7551369655789311474L;
                  var11 = 241235515;
                  var10 = var10002;
                  var10002 = (var10 | var11) & ~(var10 & var11);
                  var11 = -70187242;
                  var10 = var10002;
                  var10002 = (var10 | var11) - (var10 & var11);
                  var10004 = (int)7799948905868121780L;
                  var11 = 745465144;
                  var10 = var10004;
                  var10004 = var10 + var11 - 2 * (var10 & var11);
                  var11 = 337228687;
                  var10 = var10004;
                  var10004 = (var10 | var11) & (~var10 | ~var11);
                  var11 = -906292055;
                  var10 = -1748496043;
                  var10004 = (var10 | var11) & ~(var10 & var11);
                  var11 = 1580402172;
                  var10 = var10004;
                  var10004 = var10 + var11 - 2 * (var10 & var11);
                  var10004 = (int)1386183323326655855L;
                  var11 = -1374666648;
                  var10 = var10004;
                  var10004 = (var10 | var11) - (var10 & var11);
                  var11 = -899355377;
                  var10 = var10004;
                  var10004 = (var10 | var11) & ~(var10 & var11);
                  var10004 = (int)4768198926345141634L;
                  var11 = -1528933596;
                  var10 = var10004;
                  var10004 = (var10 | var11) & ~(var10 & var11);
                  var11 = -1276301651;
                  var10 = var10004;
                  var10004 = (var10 | var11) & (~var10 | ~var11);
                  var11 = -450348073;
                  var10 = -468892517;
                  var10004 = (var10 | var11) & (~var10 | ~var11);
                  var11 = 19234629;
                  var10 = var10004;
                  var10004 = var10 + var11 - 2 * (var10 & var11);
                  var11 = 1371062235;
                  var10 = -61363418;
                  var10003 = var10 + var11 - 2 * (var10 & var11);
                  var11 = 333253630;
                  var10 = var10003;
                  var10003 = var10 + var11 - 2 * (var10 & var11);
                  var11 = -1088948864;
                  var10 = -1876380250;
                  var10004 = var10 + var11 - 2 * (var10 & var11);
                  var11 = 1994982522;
                  var10 = var10004;
                  var10004 = (var10 & ~var11 | ~var10 & var11) * (var10 & ~var11 | ~var10 & var11);
                  var10004 = (int)-5559443058406656991L;
                  var11 = -1523083570;
                  var10 = var10004;
                  var10004 = var10 & ~var11 | ~var10 & var11;
                  var11 = -363983603;
                  var10 = var10004;
                  var10004 = var10 + var11 - 2 * (var10 & var11);
                  var10005 = (int)6719017913135520317L;
                  var11 = -751338251;
                  var10 = var10005;
                  var10005 = (var10 | var11) & (~var10 | ~var11);
                  var11 = -220954591;
                  var10 = var10005;
                  var10005 = ((var10 | var11) & ~(var10 & var11)) * ((var10 | var11) & ~(var10 & var11));
                  var11 = 1485979893;
                  var10 = 1712490607;
                  var10005 = (var10 | var11) & (~var10 | ~var11);
                  var11 = 1052730129;
                  var10 = var10005;
                  if (!c(
                        "䝡럮䜴랝䜳럮䜸랗䝎럧",
                        "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w",
                        var10002,
                        var10003,
                        var10004,
                        (var10 | var11) & ~(var10 & var11)
                     )
                     .equals(var7)) {
                     this.a(var5, c.player.getHeight(), var6, var4);
                  } else {
                     this.c(var5, c.player.getHeight(), var6, var4);
                  }
               } else {
                  this.b(var5, c.player.getHeight(), var6, var4);
                  var314 = (int)-7171366553749186846L;
                  var11 = -115445130;
                  var10 = var314;
                  var314 = var10 & ~var11 | ~var10 & var11;
                  var11 = -1146455605;
                  var10 = var314;
                  var314 = ((var10 | var11) & (~var10 | ~var11)) * ((var10 | var11) & (~var10 | ~var11));
                  var314 = (int)-1165430067433426175L;
                  var11 = -140344577;
                  var10 = var314;
                  var314 = var10 + var11 - 2 * (var10 & var11);
                  var11 = -682710346;
                  var10 = var314;
                  int var12 = (var10 | var11) & ~(var10 & var11);
                  var10001 = (int)-2370690234814712997L;
                  var11 = 1293627871;
                  var10 = var10001;
                  var10001 = (var10 | var11) & (~var10 | ~var11);
                  var11 = -193297789;
                  var10 = var10001;
                  var10001 = (var10 | var11) & ~(var10 & var11);
                  var11 = 127132911;
                  var10 = 485876150;
                  var10001 = var10 + var11 - 2 * (var10 & var11);
                  var11 = 459670874;
                  var10 = var10001;
                  var10001 = (var10 | var11) & ~(var10 & var11);
                  var10001 = (int)4086463288849046654L;
                  var11 = -32124250;
                  var10 = var10001;
                  var10001 = (var10 | var11) & (~var10 | ~var11);
                  var11 = 831540938;
                  var10 = var10001;
                  var10001 = var10 + var11 - 2 * (var10 & var11);
                  var11 = 1797452329;
                  var10 = 2139565544;
                  var10001 = var10 + var11 - 2 * (var10 & var11);
                  var11 = 346415044;
                  var10 = var10001;
                  var10001 = (var10 | var11) - (var10 & var11);
                  var11 = -806513552;
                  var10 = -1182566223;
                  var314 = (var10 | var11) & ~(var10 & var11);
                  var11 = 1014997428;
                  var10 = var314;
                  if ((var10 & ~var11 | ~var10 & var11) >= var12) {
                     var11 = 2575977;
                     var10 = -430250382;
                     var314 = (var10 | var11) - (var10 & var11);
                     var11 = -427972581;
                     var10 = var314;
                     var314 = var10 + var11 - 2 * (var10 & var11);
                     var11 = -507531601;
                     var10 = 714147334;
                     var10001 = var10 & ~var11 | ~var10 & var11;
                     var11 = -886134615;
                     var10 = var10001;
                     var314 /= var10 + var11 - 2 * (var10 & var11);
                  }
               }

               RenderSystem.disableBlend();
               RenderSystem.enableCull();
               var314 = (int)2798050427620537985L;
               var11 = 1863535980;
               var10 = var314;
               var314 = var10 + var11 - 2 * (var10 & var11);
               var11 = 1726020588;
               var10 = var314;
               RenderSystem.depthMask(pulse.Bool.from((var10 | var11) & (var10 & var11 ^ -1)));
               RenderSystem.lineWidth(1.0F);
               var3.pop();
            }
         }
      }
   }

   private void a(Vec3d var1, double var2, int var4) {
      var4 = ColorUtils.a(var4);
      int var5 = this.q.b();
      int var6 = this.s.b();
      int var10001 = (int)-269018968626932926L;
      int var22 = 1475906574;
      int var21 = var10001;
      var10001 = var21 + var22 - 2 * (var21 & var22);
      var22 = 920575814;
      var21 = var10001;
      var22 = var21 & ~var22 | ~var21 & var22;
      var21 = var6;
      int var7 = 2 * (var21 & ~var22) - (var21 ^ var22);
      var10001 = (int)4820224575735925692L;
      var22 = 1810158285;
      var21 = var10001;
      var10001 = (var21 | var22) & (~var21 | ~var22);
      var22 = -306325125;
      var21 = var10001;
      var22 = (var21 | var22) - (var21 & var22);
      var21 = var6;
      int var8 = (var21 ^ var22) + 2 * (var21 & var22);
      float var9 = this.r.a();
      var22 = -1033562995;
      var21 = 108033096;
      var10001 = var21 + var22 - 2 * (var21 & var22);
      var22 = -91932867;
      var21 = var10001;
      var10001 = (var21 | var22) & ~(var21 & var22);
      float var10 = var9 - 0.05F;
      var22 = -95322379;
      var21 = 1047794774;
      var10001 = (var21 | var22) - (var21 & var22);
      var22 = 179495840;
      var21 = var10001;
      var10001 = (var21 | var22) & ~(var21 & var22);
      float var11 = var9 + 0.05F;
      double var12 = this.t.a();
      String var14 = this.p.d();
      int var10000 = (int)-5121933959570104450L;
      var22 = -189351975;
      var21 = var10000;
      var10000 = (var21 | var22) & (~var21 | ~var22);
      var22 = -2073630553;
      var21 = var10000;

      for (int var15 = var21 + var22 - 2 * (var21 & var22); var15 < var5; var15++) {
         int var16 = ThreadLocalRandom.current().nextInt(var7, var8);
         float var17 = var10 + ThreadLocalRandom.current().nextFloat() * (var11 - var10);
         Vec3d var18 = new Vec3d(
            ThreadLocalRandom.current().nextDouble(-var2, var2),
            ThreadLocalRandom.current().nextDouble(0.0, var2),
            ThreadLocalRandom.current().nextDouble(-var2, var2)
         );
         if (var18.lengthSquared() > 0.0) {
            Vec3d var55 = var18.normalize();
            ThreadLocalRandom var65 = ThreadLocalRandom.current();
            int var10002 = (int)423474547238384190L;
            var22 = 1111945280;
            var21 = var10002;
            var10002 = (var21 | var22) & (~var21 | ~var22);
            var22 = -166510065;
            var21 = var10002;
            var10002 = (var21 | var22) - (var21 & var22);
            var18 = var55.multiply(var65.nextDouble(0.005, var12));
         }

         HudServiceRegistry.PARTICLES.a(var1, var18, var16, var17, this.p(), var4, var14);
      }

      if (b) {
         String var56 = "edm";
         var22 = 404780306;
         var21 = 1378303533;
         var10000 = var21 & ~var22 | ~var21 & var22;
         var22 = -1415375857;
         var21 = var10000;
         int var20 = var21 & ~var22 | ~var21 & var22;
         a = var20;
      }
   }

   private void a(Matrix4f var1, float var2, List<Trails.TrailPoint> var3, Vec3d var4) {
      int var6 = 632071205;
      int var5 = -8819637;
      int var10005 = (var5 | var6) - (var5 & var6);
      var6 = -623523730;
      var5 = var10005;
      this.a(var1, var2, var3, var4, pulse.Bool.from((var5 | var6) & (var5 ^ -1 | var6 ^ -1)));
      int var10004 = (int)-7330238918915004406L;
      var6 = 1320325117;
      var5 = var10004;
      var10004 = (var5 | var6) - (var5 & var6);
      var6 = 299984887;
      var5 = var10004;
      this.a(var1, var3, var4, pulse.Bool.from((var5 | var6) - (var5 & var6)));
      List var10002 = this.a(var3, var2);
      var10004 = (int)-3148341822787541491L;
      var6 = -1491312532;
      var5 = var10004;
      var10004 = (var5 | var6) & (~var5 | ~var6);
      var6 = 1377977953;
      var5 = var10004;
      this.a(var1, var10002, var4, pulse.Bool.from((var5 | var6) - (var5 & var6)));
   }

   private void b(Matrix4f var1, float var2, List<Trails.TrailPoint> var3, Vec3d var4) {
      Tessellator var5 = Tessellator.getInstance();
      BufferBuilder var6 = var5.begin(DrawMode.LINES, VertexFormats.POSITION_COLOR);
      int var9 = 1867422602;
      int var8 = -1947694642;
      int var10000 = (var8 | var9) & ~(var8 & var9);
      var9 = -458878396;
      var8 = var10000;
      int var7 = var8 & ~var9 | ~var8 & var9;

      while (true) {
         int var10001 = (int)1309213220646413480L;
         var9 = 1493539999;
         var8 = var10001;
         var10001 = (var8 | var9) - (var8 & var9);
         var9 = -1898285002;
         var8 = var10001;
         var9 = var8 + var9 - 2 * (var8 & var9);
         var8 = var7;
         if (var8 - ~var9 - 1 >= var3.size()) {
            BufferRenderer.drawWithGlobalProgram(var6.end());
            return;
         }

         Trails.TrailPoint var10003 = (Trails.TrailPoint)var3.get(var7);
         var9 = 1825031120;
         var8 = -1817756568;
         int var10006 = (var8 | var9) & ~(var8 & var9);
         var9 = -10420295;
         var8 = var10006;
         var9 = var8 + var9 - 2 * (var8 & var9);
         var8 = var7;
         this.a(var6, var1, var10003, (Trails.TrailPoint)var3.get(var8 - ~var9 - 1), var4, var2, var7, var3.size());
         var7 += 2;
      }
   }

   private void c(Matrix4f var1, float var2, List<Trails.TrailPoint> var3, Vec3d var4) {
      int var6 = 795940035;
      int var5 = -136362302;
      int var10005 = (var5 | var6) & (~var5 | ~var6);
      var6 = -659664384;
      var5 = var10005;
      this.a(var1, var2, var3, var4, pulse.Bool.from((var5 | var6) & (var5 & var6 ^ -1)));
      var6 = 1856915927;
      var5 = 1213974641;
      int var10004 = (var5 | var6) & (~var5 | ~var6);
      var6 = 653623719;
      var5 = var10004;
      this.a(var1, var3, var4, pulse.Bool.from((var5 | var6) & (var5 ^ -1 | var6 ^ -1)));
      List var10002 = this.a(var3, var2);
      var6 = -2014093311;
      var5 = -1041733647;
      var10004 = (var5 | var6) - (var5 & var6);
      var6 = 1176176625;
      var5 = var10004;
      this.a(var1, var10002, var4, pulse.Bool.from((var5 | var6) & (var5 & var6 ^ -1)));
   }

   private void a(Matrix4f var1, float var2, List<Trails.TrailPoint> var3, Vec3d var4, boolean var5) {
      Tessellator var6 = Tessellator.getInstance();
      BufferBuilder var7 = var6.begin(DrawMode.TRIANGLE_STRIP, VertexFormats.POSITION_COLOR);
      int var12 = -542895067;
      int var11 = 2052822084;
      int var10000 = (var11 | var12) - (var11 & var12);
      var12 = -1509982111;
      var11 = var10000;

      for (int var8 = (var11 | var12) - (var11 & var12); var8 < var3.size(); var8++) {
         float var9 = this.a(var8, var3.size(), var5);
         Color var10 = this.b(var8);
         int var10008 = (int)-2440211247900761962L;
         var12 = 1578752539;
         var11 = var10008;
         var10008 = (var11 | var12) - (var11 & var12);
         var12 = 1226655434;
         var11 = var10008;
         var10008 = var11 + var12 - 2 * (var11 & var12);
         this.a(var7, var1, var2, ((Trails.TrailPoint)var3.get(var8)).a, var4, var10, var9 * 0.5F);
      }

      BufferRenderer.drawWithGlobalProgram(var7.end());
   }

   private void a(Matrix4f var1, List<Trails.TrailPoint> var2, Vec3d var3, boolean var4) {
      Tessellator var5 = Tessellator.getInstance();
      BufferBuilder var6 = var5.begin(DrawMode.LINE_STRIP, VertexFormats.POSITION_COLOR);
      int var11 = 729933248;
      int var10 = 597045548;
      int var10000 = (var10 | var11) & ~(var10 & var11);
      var11 = 135779564;
      var10 = var10000;

      for (int var7 = var10 & ~var11 | ~var10 & var11; var7 < var2.size(); var7++) {
         float var8 = this.a(var7, var2.size(), var4);
         Color var9 = this.b(var7);
         this.a(var6, var1, ((Trails.TrailPoint)var2.get(var7)).a, var3, var9, var8);
      }

      BufferRenderer.drawWithGlobalProgram(var6.end());
   }

   private void a(BufferBuilder var1, Matrix4f var2, Trails.TrailPoint var3, Trails.TrailPoint var4, Vec3d var5, float var6, int var7, int var8) {
      int var12 = 751984506;
      int var11 = 1599893398;
      int var10003 = (var11 | var12) & (~var11 | ~var12);
      var12 = 1938698476;
      var11 = var10003;
      float var9 = this.a(var7, var8, pulse.Bool.from(var11 + var12 - 2 * (var11 & var12)));
      Color var10 = this.b(var7);
      this.a(var1, var2, var3.a, var5, var10, var9);
      this.a(var1, var2, var4.a, var5, var10, var9);
      this.a(var1, var2, var3.a.add(0.0, var6, 0.0), var5, var10, var9);
      this.a(var1, var2, var4.a.add(0.0, var6, 0.0), var5, var10, var9);
   }

   private List<Trails.TrailPoint> a(List<Trails.TrailPoint> var1, float var2) {
      ArrayList var3 = new ArrayList(var1.size());
      var1.forEach(var2x -> var3.add(new Trails.TrailPoint(var2x.a.add(0.0, var2, 0.0), var2x.b)));
      return var3;
   }

   private float a(int var1, int var2, boolean var3) {
      float var4 = (float)var1 / var2;
      return !var3 ? var4 : var4 * var4;
   }

   private Color b(int var1) {
      Color var2 = this.n();
      Color var3 = this.n();
      float var10001 = var1;
      int var9 = 492049812;
      int var8 = 1730739838;
      int var10002 = var8 & ~var9 | ~var8 & var9;
      var9 = -708947623;
      var8 = var10002;
      var10002 = ((var8 | var9) - (var8 & var9)) * ((var8 | var9) - (var8 & var9));
      float var4 = Math.min(1.0F, var10001 / 20.0F);
      int var5 = (int)(var2.getRed() * (1.0F - var4) + var3.getRed() * var4);
      int var6 = (int)(var2.getGreen() * (1.0F - var4) + var3.getGreen() * var4);
      int var7 = (int)(var2.getBlue() * (1.0F - var4) + var3.getBlue() * var4);
      return new Color(var5, var6, var7);
   }

   private Color n() {
      if (!this.k.a()) {
         return this.l.a();
      }

      ClientColor var1 = ModuleRegistry.CLIENT_COLOR;
      return var1.n();
   }

   private Color o() {
      if (!this.u.a()) {
         return this.v.a();
      }

      ClientColor var1 = ModuleRegistry.CLIENT_COLOR;
      return var1.n();
   }

   private Identifier p() {
      String var1 = this.o.d();
      String var2 = var1;
      int var10000 = (int)-6955757603240024918L;
      int var7 = 703499012;
      int var6 = var10000;
      var10000 = (var6 | var7) & ~(var6 & var7);
      var7 = -180973487;
      var6 = var10000;
      int var3 = (var6 | var7) & ~(var6 & var7);
      switch (var2.hashCode()) {
         case -2018961832:
            var7 = -747332036;
            var6 = 2088580423;
            int var1075 = (var6 | var7) & ~(var6 & var7);
            var7 = 1144454256;
            var6 = var1075;
            var1075 = (var6 + var7 - 2 * (var6 & var7)) * (var6 + var7 - 2 * (var6 & var7));
            var7 = 1883125552;
            var6 = -1483985094;
            int var1132 = (var6 | var7) - (var6 & var7);
            var7 = -372912310;
            var6 = var1132;
            var1132 = ((var6 | var7) - (var6 & var7)) * ((var6 | var7) - (var6 & var7));
            var7 = 17239818;
            var6 = 743730904;
            int var1354 = var6 + var7 - 2 * (var6 & var7);
            var7 = 760439232;
            var6 = var1354;
            var1354 = var6 & ~var7 | ~var6 & var7;
            var7 = 1103715529;
            var6 = -215580127;
            int var1223 = var6 & ~var7 | ~var6 & var7;
            var7 = -732068405;
            var6 = var1223;
            var1223 = (var6 | var7) - (var6 & var7);
            var1354 = (int)-463094559696681748L;
            var7 = 790297398;
            var6 = var1354;
            var1354 = (var6 | var7) & ~(var6 & var7);
            var7 = -1221253251;
            var6 = var1354;
            var1354 = var6 + var7 - 2 * (var6 & var7);
            int var1462 = (int)-8580353135026736851L;
            var7 = 2091604653;
            var6 = var1462;
            var1462 = (var6 | var7) & ~(var6 & var7);
            var7 = 1403170356;
            var6 = var1462;
            var7 = var6 + var7 - 2 * (var6 & var7);
            var6 = var1354;
            var1354 = var6 - ~var7 - 1;
            var7 = 1871253057;
            var6 = 1524451765;
            var1354 = var6 & ~var7 | ~var6 & var7;
            var7 = 831239284;
            var6 = var1354;
            var1354 = (var6 | var7) & (~var6 | ~var7);
            String var1464 = "edo";
            var1462 = (int)9011718340716039338L;
            var7 = 439500933;
            var6 = var1462;
            var1462 = (var6 | var7) & (~var6 | ~var7);
            var7 = -1200368453;
            var6 = var1462;
            var1462 = var6 & ~var7 | ~var6 & var7;
            int var1572 = (int)890404271277671175L;
            var7 = -2114603600;
            var6 = var1572;
            var1572 = (var6 | var7) - (var6 & var7);
            var7 = -363897063;
            var6 = var1572;
            var1572 = var6 + var7 - 2 * (var6 & var7);
            int var1628 = (int)1169770967987231045L;
            var7 = -641345530;
            var6 = var1628;
            var1628 = (var6 | var7) & ~(var6 & var7);
            var7 = 2119681042;
            var6 = var1628;
            var7 = var6 & ~var7 | ~var6 & var7;
            var6 = var1572;
            var1572 = var6 - ~var7 - 1;
            var1572 = (int)-5263125620121132298L;
            var7 = -970100686;
            var6 = var1572;
            var1572 = (var6 | var7) & (~var6 | ~var7);
            var7 = -99788774;
            var6 = var1572;
            if (var2.equals(
               c("퉽莜퉩莗퉤莜퉦莑", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w", var1223, var1354, var1462, (var6 | var7) & ~(var6 & var7))
            )) {
               var7 = 1041472845;
               var6 = 1524666569;
               var10000 = (var6 | var7) - (var6 & var7);
               var7 = 1693650310;
               var6 = var10000;
               var3 = var6 + var7 - 2 * (var6 & var7);
            }
            break;
         case 860345114:
            var7 = -631278645;
            var6 = -168465406;
            int var1120 = var6 & ~var7 | ~var6 & var7;
            var7 = 799678425;
            var6 = var1120;
            var1120 = var6 + var7 - 2 * (var6 & var7);
            var1120 = (int)-29106151754455078L;
            var7 = -837025883;
            var6 = var1120;
            var1120 = (var6 | var7) - (var6 & var7);
            var7 = 1040078958;
            var6 = var1120;
            var1120 = (var6 | var7) & ~(var6 & var7);
            var7 = 1020642697;
            var6 = 1555459439;
            var1120 = var6 + var7 - 2 * (var6 & var7);
            var7 = 1617144033;
            var6 = var1120;
            var1120 = (var6 | var7) - (var6 & var7);
            var7 = 1727167015;
            var6 = -437440198;
            var1120 = var6 + var7 - 2 * (var6 & var7);
            var7 = -2095101168;
            var6 = var1120;
            var1120 = var6 & ~var7 | ~var6 & var7;
            var1120 = (int)-6601944611192243404L;
            var7 = -1371237722;
            var6 = var1120;
            var1120 = (var6 | var7) & ~(var6 & var7);
            var7 = -582866606;
            var6 = var1120;
            var1120 = (var6 + var7 - 2 * (var6 & var7)) * (var6 + var7 - 2 * (var6 & var7));
            String var1220 = "eds";
            var7 = -1277239095;
            var6 = -2021583187;
            int var1221 = var6 + var7 - 2 * (var6 & var7);
            var7 = 1391308103;
            var6 = var1221;
            int var1222 = (var6 | var7) & (~var6 | ~var7);
            var7 = 1618280587;
            var6 = -1603346508;
            int var1348 = (var6 | var7) - (var6 & var7);
            var7 = 1469069808;
            var6 = var1348;
            var1348 = var6 & ~var7 | ~var6 & var7;
            int var1458 = (int)-5443570225973406347L;
            var7 = -489619764;
            var6 = var1458;
            var1458 = (var6 | var7) & (~var6 | ~var7);
            var7 = 191870730;
            var6 = var1458;
            var7 = (var6 | var7) & ~(var6 & var7);
            var6 = var1348;
            var1348 = (var6 & ~var7) + (var7 & ~var6) + 2 * (var6 & var7);
            var1348 = (int)3485358791560083811L;
            var7 = -1803679413;
            var6 = var1348;
            var1348 = (var6 | var7) & ~(var6 & var7);
            var7 = 1561416124;
            var6 = var1348;
            var1348 = var6 & ~var7 | ~var6 & var7;
            int var1564 = (int)8621527489881997116L;
            var7 = -2007056654;
            var6 = var1564;
            var1564 = var6 + var7 - 2 * (var6 & var7);
            var7 = 938525124;
            var6 = var1564;
            var1564 = var6 & ~var7 | ~var6 & var7;
            var7 = 1259471318;
            var6 = 889667927;
            var1458 = var6 + var7 - 2 * (var6 & var7);
            var7 = 1844707527;
            var6 = var1458;
            var1458 = (var6 | var7) & ~(var6 & var7);
            var1564 = (int)2075180394473419961L;
            var7 = -2140574267;
            var6 = var1564;
            var1564 = (var6 | var7) - (var6 & var7);
            var7 = 1954524501;
            var6 = var1564;
            var1564 = ((var6 | var7) & (~var6 | ~var7)) * ((var6 | var7) & (~var6 | ~var7));
            var1564 = (int)-1245010671620895224L;
            var7 = -1986879869;
            var6 = var1564;
            var1564 = (var6 | var7) & ~(var6 & var7);
            var7 = 1906813049;
            var6 = var1564;
            if (var2.equals(
               c("퉈\uf1b3퉧\uf1b6퉬\uf1cd", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w", var1222, var1348, var1458, var6 & ~var7 | ~var6 & var7)
            )) {
               var10000 = (int)7506373266319587693L;
               var7 = -1437815178;
               var6 = var10000;
               var10000 = (var6 | var7) & (~var6 | ~var7);
               var7 = -1338304738;
               var6 = var10000;
               var3 = (var6 | var7) - (var6 & var7);
            }
            break;
         case 934967833:
            var7 = 1396594266;
            var6 = -82395145;
            int var1072 = var6 + var7 - 2 * (var6 & var7);
            var7 = -2045766372;
            var6 = var1072;
            var1072 = var6 & ~var7 | ~var6 & var7;
            var7 = 1590355957;
            var6 = 1269665212;
            int var1116 = (var6 | var7) & ~(var6 & var7);
            var7 = 955722129;
            var6 = var1116;
            var7 = (var6 | var7) - (var6 & var7);
            var6 = var1072;
            var1072 = 2 * (var6 | var7) - (var6 ^ var7);
            var1116 = (int)849890606284952235L;
            var7 = -115327305;
            var6 = var1116;
            var1116 = (var6 | var7) & (~var6 | ~var7);
            var7 = 183521158;
            var6 = var1116;
            var1116 = (var6 + var7 - 2 * (var6 & var7)) * (var6 + var7 - 2 * (var6 & var7));
            var7 = 725610691;
            var6 = -481852985;
            int var1342 = (var6 | var7) & ~(var6 & var7);
            var7 = -931630835;
            var6 = var1342;
            var1342 = (var6 | var7) & (~var6 | ~var7);
            var7 = -1260940902;
            var6 = 1499902815;
            int var1218 = (var6 | var7) & (~var6 | ~var7);
            var7 = -1962706458;
            var6 = var1218;
            var1218 = var6 & ~var7 | ~var6 & var7;
            String var1344 = "edr";
            var1342 = (int)7499484595765979446L;
            var7 = -1760037610;
            var6 = var1342;
            var1342 = (var6 | var7) - (var6 & var7);
            var7 = 311615902;
            var6 = var1342;
            var1342 = var6 & ~var7 | ~var6 & var7;
            int var1548 = (int)7574659201885585026L;
            var7 = -2127242473;
            var6 = var1548;
            var1548 = var6 + var7 - 2 * (var6 & var7);
            var7 = -298031714;
            var6 = var1548;
            var1548 = (var6 | var7) & (~var6 | ~var7);
            var1548 = (int)-1655505697425865544L;
            var7 = -714864238;
            var6 = var1548;
            var1548 = var6 + var7 - 2 * (var6 & var7);
            var7 = 808439099;
            var6 = var1548;
            var1548 = (var6 | var7) - (var6 & var7);
            var7 = 1350327735;
            var6 = -89091439;
            var1548 = var6 & ~var7 | ~var6 & var7;
            var7 = -1429418197;
            var6 = var1548;
            var1548 = (var6 | var7) & ~(var6 & var7);
            var1548 = (int)-2060860804120335216L;
            var7 = 762330700;
            var6 = var1548;
            var1548 = var6 + var7 - 2 * (var6 & var7);
            var7 = 1402049238;
            var6 = var1548;
            var1548 = (var6 | var7) - (var6 & var7);
            int var1455 = (int)9050716940420220250L;
            var7 = 888194209;
            var6 = var1455;
            var1455 = (var6 | var7) & (~var6 | ~var7);
            var7 = -403035103;
            var6 = var1455;
            var1455 = (var6 | var7) & ~(var6 & var7);
            var1548 = (int)-6409731367012248687L;
            var7 = 52703414;
            var6 = var1548;
            var1548 = var6 + var7 - 2 * (var6 & var7);
            var7 = -878158433;
            var6 = var1548;
            var1548 = var6 + var7 - 2 * (var6 & var7);
            int var1626 = (int)5662584169293950403L;
            var7 = -524900303;
            var6 = var1626;
            var1626 = (var6 | var7) & (~var6 | ~var7);
            var7 = -629536047;
            var6 = var1626;
            var7 = (var6 | var7) & ~(var6 & var7);
            var6 = var1548;
            var1548 = (var6 & ~var7) + (var7 & ~var6) + 2 * (var6 & var7);
            var7 = 1701213674;
            var6 = 1046020315;
            var1548 = (var6 | var7) & ~(var6 & var7);
            var7 = 1530077229;
            var6 = var1548;
            if (var2.equals(
               c(
                  "퉋\udc51퉩\udc54퉨\udc53",
                  "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w",
                  var1218,
                  var1342,
                  var1455,
                  var6 + var7 - 2 * (var6 & var7)
               )
            )) {
               var7 = -1580657610;
               var6 = -1568087670;
               var10000 = (var6 | var7) - (var6 & var7);
               var7 = 54654392;
               var6 = var10000;
               var3 = (var6 | var7) & ~(var6 & var7);
            }
            break;
         case 1001367009:
            int var1113 = (int)-5918939350210930616L;
            var7 = 226387927;
            var6 = var1113;
            var1113 = (var6 | var7) & ~(var6 & var7);
            var7 = 1525088142;
            var6 = var1113;
            var1113 = var6 + var7 - 2 * (var6 & var7);
            int var1209 = (int)385085035491229282L;
            var7 = 1670712120;
            var6 = var1209;
            var1209 = var6 & ~var7 | ~var6 & var7;
            var7 = -816777890;
            var6 = var1209;
            var1209 = (var6 | var7) & (~var6 | ~var7);
            var1209 = (int)4399668476616942562L;
            var7 = -1028696116;
            var6 = var1209;
            var1209 = (var6 | var7) - (var6 & var7);
            var7 = -2070678487;
            var6 = var1209;
            var1209 = var6 + var7 - 2 * (var6 & var7);
            var7 = 707589920;
            var6 = 1563803461;
            int var1331 = var6 & ~var7 | ~var6 & var7;
            var7 = 1998145653;
            var6 = var1331;
            var1331 = (var6 | var7) - (var6 & var7);
            var1331 = (int)-6020373917426697080L;
            var7 = 2082585457;
            var6 = var1331;
            var1331 = var6 + var7 - 2 * (var6 & var7);
            var7 = -1193244681;
            var6 = var1331;
            var1331 = var6 & ~var7 | ~var6 & var7;
            var1209 = (int)-920534642705199811L;
            var7 = -208107885;
            var6 = var1209;
            var1209 = (var6 | var7) - (var6 & var7);
            var7 = 926371981;
            var6 = var1209;
            var1209 = var6 & ~var7 | ~var6 & var7;
            var7 = -1538049832;
            var6 = -86272203;
            var1331 = (var6 | var7) & ~(var6 & var7);
            var7 = 1420296132;
            var6 = var1331;
            var1331 = (var6 | var7) & ~(var6 & var7);
            int var1448 = (int)7274003101034969721L;
            var7 = -1647668171;
            var6 = var1448;
            var1448 = var6 + var7 - 2 * (var6 & var7);
            var7 = 1858207971;
            var6 = var1448;
            var7 = var6 + var7 - 2 * (var6 & var7);
            var6 = var1331;
            var1331 = var6 - ~var7 - 1;
            var1331 = (int)2166265604459440225L;
            var7 = 1350198961;
            var6 = var1331;
            var1331 = (var6 | var7) & ~(var6 & var7);
            var7 = 1446925940;
            var6 = var1331;
            var1331 = var6 + var7 - 2 * (var6 & var7);
            var7 = 1229749015;
            var6 = 1358772891;
            var1448 = var6 + var7 - 2 * (var6 & var7);
            var7 = 1418829369;
            var6 = var1448;
            var1448 = (var6 | var7) & (~var6 | ~var7);
            var7 = 1755676865;
            var6 = -1150003757;
            int var1544 = (var6 | var7) & ~(var6 & var7);
            var7 = 103609294;
            var6 = var1544;
            var7 = (var6 | var7) - (var6 & var7);
            var6 = var1448;
            var1448 = (var6 & ~var7) + (var7 & ~var6) + 2 * (var6 & var7);
            var7 = 1283707005;
            var6 = 1218667372;
            var1448 = (var6 | var7) - (var6 & var7);
            var7 = 154759806;
            var6 = var1448;
            var1448 = var6 & ~var7 | ~var6 & var7;
            var7 = 493515191;
            var6 = 2027029031;
            var1544 = (var6 | var7) & (~var6 | ~var7);
            var7 = -2059202369;
            var6 = var1544;
            var1544 = ((var6 | var7) & (~var6 | ~var7)) * ((var6 | var7) & (~var6 | ~var7));
            var7 = -520923943;
            var6 = -1302599530;
            var1544 = (var6 | var7) & ~(var6 & var7);
            var7 = 1384844365;
            var6 = var1544;
            if (var2.equals(c("퉄㤼퉦㤽퉬", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w", var1209, var1331, var1448, var6 & ~var7 | ~var6 & var7))) {
               var7 = 895087330;
               var6 = -1350237352;
               var10000 = var6 & ~var7 | ~var6 & var7;
               var7 = -1696796229;
               var6 = var10000;
               var3 = (var6 | var7) & ~(var6 & var7);
               if (b) {
                  throw new IllegalAccessError();
               }
            }
            break;
         case 1224355287:
            var7 = 963532841;
            var6 = -1517427512;
            int var1070 = (var6 | var7) & (~var6 | ~var7);
            var7 = -2045907692;
            var6 = var1070;
            var1070 = ((var6 | var7) - (var6 & var7)) * ((var6 | var7) - (var6 & var7));
            String var1112 = "edn";
            int var1204 = (int)-7113939371972727831L;
            var7 = -1852940485;
            var6 = var1204;
            var1204 = var6 & ~var7 | ~var6 & var7;
            var7 = -1122189329;
            var6 = var1204;
            var1204 = (var6 + var7 - 2 * (var6 & var7)) * (var6 + var7 - 2 * (var6 & var7));
            var7 = -318311338;
            var6 = 1428710153;
            var1204 = (var6 | var7) & ~(var6 & var7);
            var7 = -560149380;
            var6 = var1204;
            var1204 = var6 & ~var7 | ~var6 & var7;
            var7 = -964809265;
            var6 = 808710050;
            int var1326 = (var6 | var7) & (~var6 | ~var7);
            var7 = -544405287;
            var6 = var1326;
            var1326 = (var6 & ~var7 | ~var6 & var7) * (var6 & ~var7 | ~var6 & var7);
            var1326 = (int)882693681862396054L;
            var7 = 1762074579;
            var6 = var1326;
            var1326 = (var6 | var7) & ~(var6 & var7);
            var7 = 1963215853;
            var6 = var1326;
            var1326 = var6 & ~var7 | ~var6 & var7;
            var7 = -1312101017;
            var6 = 1830273876;
            int var1444 = var6 & ~var7 | ~var6 & var7;
            var7 = -377474779;
            var6 = var1444;
            var1444 = (var6 + var7 - 2 * (var6 & var7)) * (var6 + var7 - 2 * (var6 & var7));
            var7 = -47503677;
            var6 = 1561597973;
            var1444 = (var6 | var7) - (var6 & var7);
            var7 = -1590598462;
            var6 = var1444;
            var1444 = var6 & ~var7 | ~var6 & var7;
            int var1539 = (int)-8353232645849811947L;
            var7 = 1057809522;
            var6 = var1539;
            var1539 = (var6 | var7) - (var6 & var7);
            var7 = -184565761;
            var6 = var1539;
            var1539 = (var6 | var7) & (~var6 | ~var7);
            var1539 = (int)8405657739515286540L;
            var7 = -1209478092;
            var6 = var1539;
            var1539 = (var6 | var7) & ~(var6 & var7);
            var7 = 1693856830;
            var6 = var1539;
            if (var2.equals(c("퉽㵌툜㵍툚㵌", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w", var1204, var1326, var1444, (var6 | var7) - (var6 & var7)))) {
               var10000 = (int)6757848930259218886L;
               var7 = -2052877792;
               var6 = var10000;
               var10000 = var6 & ~var7 | ~var6 & var7;
               var7 = -1602673690;
               var6 = var10000;
               var3 = (var6 | var7) & ~(var6 & var7);
            }
            break;
         case 1227580930:
            int var10002 = (int)-8603451828284869151L;
            var7 = -1442628514;
            var6 = var10002;
            var10002 = var6 & ~var7 | ~var6 & var7;
            var7 = -2031744582;
            var6 = var10002;
            var10002 = var6 + var7 - 2 * (var6 & var7);
            var7 = 441889413;
            var6 = 1257560637;
            var10002 = (var6 | var7) & ~(var6 & var7);
            var7 = 1352820912;
            var6 = var10002;
            var10002 = (var6 | var7) & ~(var6 & var7);
            var7 = 831435254;
            var6 = -163473432;
            var10002 = (var6 | var7) & ~(var6 & var7);
            var7 = -942725611;
            var6 = var10002;
            var10002 = var6 & ~var7 | ~var6 & var7;
            var10002 = (int)6901449729564701512L;
            var7 = 1281108049;
            var6 = var10002;
            var10002 = (var6 | var7) - (var6 & var7);
            var7 = -1648713359;
            var6 = var10002;
            var10002 = var6 + var7 - 2 * (var6 & var7);
            var7 = -747620820;
            var6 = 375016539;
            int var10003 = var6 + var7 - 2 * (var6 & var7);
            var7 = -1210200821;
            var6 = var10003;
            var7 = var6 + var7 - 2 * (var6 & var7);
            var6 = var10002;
            var10002 = (var6 | var7) + (var6 & var7);
            var7 = 197836297;
            var6 = 1564543467;
            int var10004 = var6 + var7 - 2 * (var6 & var7);
            var7 = 1451997156;
            var6 = var10004;
            var10004 = (var6 | var7) & ~(var6 & var7);
            var10004 = (int)-7131592539507068098L;
            var7 = 619868763;
            var6 = var10004;
            var10004 = (var6 | var7) & (~var6 | ~var7);
            var7 = -1691844247;
            var6 = var10004;
            var10004 = (var6 | var7) & ~(var6 & var7);
            var10004 = (int)1936887643742559771L;
            var7 = -871123479;
            var6 = var10004;
            var10004 = (var6 | var7) & ~(var6 & var7);
            var7 = 185461758;
            var6 = var10004;
            var10004 = var6 & ~var7 | ~var6 & var7;
            var7 = -1118297891;
            var6 = -825299174;
            var10003 = (var6 | var7) - (var6 & var7);
            var7 = 354718948;
            var6 = var10003;
            var10003 = var6 & ~var7 | ~var6 & var7;
            String var1323 = "edp";
            var7 = 427267775;
            var6 = -1603321256;
            var10004 = (var6 | var7) & (~var6 | ~var7);
            var7 = -1111045097;
            var6 = var10004;
            var10004 = var6 + var7 - 2 * (var6 & var7);
            String var10005 = "edq";
            int var1441 = (int)1239675740399823387L;
            var7 = -1522886177;
            var6 = var1441;
            int var1442 = var6 & ~var7 | ~var6 & var7;
            var7 = 806422382;
            var6 = var1442;
            int var1443 = (var6 | var7) & ~(var6 & var7);
            int var10007 = (int)3600707735296871294L;
            var7 = -1218980636;
            var6 = var10007;
            var10007 = (var6 | var7) & (~var6 | ~var7);
            var7 = 688447386;
            var6 = var10007;
            var10007 = (var6 | var7) & ~(var6 & var7);
            var10007 = (int)60006057265592800L;
            var7 = -832521012;
            var6 = var10007;
            var10007 = var6 & ~var7 | ~var6 & var7;
            var7 = 567231783;
            var6 = var10007;
            var10007 = var6 + var7 - 2 * (var6 & var7);
            var7 = 564294222;
            var6 = 1706170883;
            int var10006 = var6 + var7 - 2 * (var6 & var7);
            var7 = 1146771459;
            var6 = var10006;
            if (!var2.equals(
               c("퉽뤉툓뤌퉤뤄", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w", var10003, var10004, var1443, var6 + var7 - 2 * (var6 & var7))
            )) {
               var10000 = (int)-8265241968136145272L;
               var7 = 1930442440;
               var6 = var10000;
               var10000 = var6 + var7 - 2 * (var6 & var7);
               var7 = -1092904723;
               var6 = var10000;
               var10000 = (var6 | var7) & ~(var6 & var7);
               var7 = 1293982194;
               var6 = 1198332861;
               int var10001 = (var6 | var7) - (var6 & var7);
               var7 = 1919171315;
               var6 = var10001;
               var7 = var6 + var7 - 2 * (var6 & var7);
               var6 = var10000;
               var10000 = 2 * (var6 | var7) - (var6 ^ var7);
               var7 = 1343274712;
               var6 = -358872110;
               var10000 = (var6 | var7) - (var6 & var7);
               var7 = -284740711;
               var6 = var10000;
               int var5 = (var6 | var7) - (var6 & var7);
               var7 = 5801609;
               var6 = -1247398543;
               var10000 = var6 & ~var7 | ~var6 & var7;
               var7 = -287229133;
               var6 = var10000;
               var10000 = ((var6 | var7) & (~var6 | ~var7)) * ((var6 | var7) & (~var6 | ~var7));
               var7 = -2084541244;
               var6 = 1590940282;
               var10000 = var6 & ~var7 | ~var6 & var7;
               var7 = -1689646745;
               var6 = var10000;
               if ((var6 | var7) - (var6 & var7) >= var5) {
                  var7 = 825082615;
                  var6 = -489241197;
                  var10000 = (var6 | var7) & ~(var6 & var7);
                  var7 = -738523292;
                  var6 = var10000;
                  var10000 = var6 + var7 - 2 * (var6 & var7);
                  var10001 = (int)-2681220160939284267L;
                  var7 = -1065700120;
                  var6 = var10001;
                  var10001 = var6 & ~var7 | ~var6 & var7;
                  var7 = -421290947;
                  var6 = var10001;
                  var10000 /= (var6 | var7) - (var6 & var7);
               }
            } else {
               var10000 = (int)640681610908251958L;
               var7 = 678882421;
               var6 = var10000;
               var10000 = var6 + var7 - 2 * (var6 & var7);
               var7 = -264676544;
               var6 = var10000;
               var3 = (var6 | var7) & (~var6 | ~var7);
            }
      }

      switch (var3) {
         case 0:
            String var1066 = "edt";
            var7 = -1829091;
            var6 = 1969332498;
            int var1099 = (var6 | var7) - (var6 & var7);
            var7 = -822133696;
            var6 = var1099;
            var1099 = ((var6 | var7) & ~(var6 & var7)) * ((var6 | var7) & ~(var6 & var7));
            int var1195 = (int)6893778023913729236L;
            var7 = 1798935663;
            var6 = var1195;
            var1195 = (var6 | var7) & ~(var6 & var7);
            var7 = 266267265;
            var6 = var1195;
            var1195 = var6 + var7 - 2 * (var6 & var7);
            int var1302 = (int)-7065460552482512144L;
            var7 = -117671380;
            var6 = var1302;
            var1302 = (var6 | var7) - (var6 & var7);
            var7 = 531940204;
            var6 = var1302;
            var7 = var6 & ~var7 | ~var6 & var7;
            var6 = var1195;
            var1195 = (var6 & ~var7) + (var7 & ~var6) + 2 * (var6 & var7);
            var1195 = (int)3334892630425849768L;
            var7 = -1720001937;
            var6 = var1195;
            var1195 = (var6 | var7) - (var6 & var7);
            var7 = 1464946404;
            var6 = var1195;
            var1195 = (var6 | var7) & ~(var6 & var7);
            String var1304 = "edu";
            var7 = 292194113;
            var6 = 39790792;
            var1302 = (var6 | var7) & ~(var6 & var7);
            var7 = 401425466;
            var6 = var1302;
            var1302 = var6 + var7 - 2 * (var6 & var7);
            int var1429 = (int)7251612182776187465L;
            var7 = -630014629;
            var6 = var1429;
            var1429 = (var6 | var7) - (var6 & var7);
            var7 = -1503021361;
            var6 = var1429;
            var1429 = (var6 | var7) & ~(var6 & var7);
            int var1531 = (int)233346081072197795L;
            var7 = -491302743;
            var6 = var1531;
            var1531 = var6 + var7 - 2 * (var6 & var7);
            var7 = 1932990333;
            var6 = var1531;
            var7 = (var6 | var7) & ~(var6 & var7);
            var6 = var1429;
            var1429 = (var6 | var7) + (var6 & var7);
            var1429 = (int)-3316909683382944258L;
            var7 = -1917294235;
            var6 = var1429;
            var1429 = (var6 | var7) & (~var6 | ~var7);
            var7 = -10286011;
            var6 = var1429;
            var1429 = var6 + var7 - 2 * (var6 & var7);
            String var1533 = "edv";
            var1531 = (int)-6170587715824820450L;
            var7 = 179390022;
            var6 = var1531;
            var1531 = (var6 | var7) - (var6 & var7);
            var7 = 1814764105;
            var6 = var1531;
            String var1067 = c("혬踛혰踝혹", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w", var1195, var1302, var1429, (var6 | var7) - (var6 & var7));
            String var1101 = "edw";
            var1302 = (int)4920758362685963650L;
            var7 = -967942577;
            var6 = var1302;
            var1302 = var6 + var7 - 2 * (var6 & var7);
            var7 = 522429391;
            var6 = var1302;
            var1302 = (var6 | var7) & (~var6 | ~var7);
            var7 = -1710011248;
            var6 = -1288755246;
            var1302 = var6 + var7 - 2 * (var6 & var7);
            var7 = 691825480;
            var6 = var1302;
            var1302 = (var6 | var7) & (~var6 | ~var7);
            String var1312 = "edx";
            var1302 = (int)4906162002250632322L;
            var7 = -1888416833;
            var6 = var1302;
            var1302 = (var6 | var7) & (~var6 | ~var7);
            var7 = 862477342;
            var6 = var1302;
            var1302 = (var6 | var7) - (var6 & var7);
            var1429 = (int)-8733271187503816297L;
            var7 = 323254356;
            var6 = var1429;
            var1429 = var6 + var7 - 2 * (var6 & var7);
            var7 = -921650150;
            var6 = var1429;
            var1429 = (var6 + var7 - 2 * (var6 & var7)) * (var6 + var7 - 2 * (var6 & var7));
            var7 = -218083566;
            var6 = 1640558936;
            var1429 = (var6 | var7) - (var6 & var7);
            var7 = -1773117180;
            var6 = var1429;
            var1429 = (var6 | var7) & ~(var6 & var7);
            var7 = -1705043185;
            var6 = 1151368046;
            int var1613 = (var6 | var7) & ~(var6 & var7);
            var7 = -553688987;
            var6 = var1613;
            var1613 = var6 & ~var7 | ~var6 & var7;
            var7 = -715773045;
            var6 = -771116453;
            var1613 = (var6 | var7) & ~(var6 & var7);
            var7 = 123705795;
            var6 = var1613;
            var1613 = (var6 | var7) & ~(var6 & var7);
            var1531 = (int)107281150254380310L;
            var7 = 335727364;
            var6 = var1531;
            var1531 = var6 + var7 - 2 * (var6 & var7);
            var7 = 1155861751;
            var6 = var1531;
            var1531 = var6 + var7 - 2 * (var6 & var7);
            var1613 = (int)-4390987311777922820L;
            var7 = 1635919637;
            var6 = var1613;
            var1613 = var6 & ~var7 | ~var6 & var7;
            var7 = 555308491;
            var6 = var1613;
            var1613 = (var6 | var7) & (~var6 | ~var7);
            var7 = 1760369135;
            var6 = -1639992682;
            var1613 = (var6 | var7) & ~(var6 & var7);
            var7 = -153723435;
            var6 = var1613;
            return Identifier.of(
               var1067,
               c(
                  "혨箶혤箧혩管혹箠홳箣혽管혨箺혿箿혹篼혴箶혽管혨篽혬箽혻",
                  "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w",
                  var1302,
                  var1429,
                  var1531,
                  var6 + var7 - 2 * (var6 & var7)
               )
            );
         case 1:
            String var1064 = "edy";
            String var1096 = "edz";
            int var1187 = (int)6168065199433922676L;
            var7 = 1405041847;
            var6 = var1187;
            var1187 = (var6 | var7) & (~var6 | ~var7);
            var7 = -364368276;
            var6 = var1187;
            var1187 = var6 + var7 - 2 * (var6 & var7);
            var7 = 1897996857;
            var6 = 757080247;
            int var1290 = (var6 | var7) & ~(var6 & var7);
            var7 = -1169576772;
            var6 = var1290;
            var7 = var6 & ~var7 | ~var6 & var7;
            var6 = var1187;
            var1187 = (var6 | var7) + (var6 & var7);
            var1187 = (int)-3527974215638080172L;
            var7 = 256640923;
            var6 = var1187;
            var1187 = (var6 | var7) - (var6 & var7);
            var7 = -36046356;
            var6 = var1187;
            var1187 = (var6 | var7) & ~(var6 & var7);
            var1290 = (int)6044460462442696747L;
            var7 = 856181262;
            var6 = var1290;
            var1290 = (var6 | var7) - (var6 & var7);
            var7 = 1788926315;
            var6 = var1290;
            var1290 = ((var6 | var7) & (~var6 | ~var7)) * ((var6 | var7) & (~var6 | ~var7));
            var1290 = (int)8038719386872037488L;
            var7 = -1722705208;
            var6 = var1290;
            var1290 = (var6 | var7) & ~(var6 & var7);
            var7 = 1651143840;
            var6 = var1290;
            var1290 = (var6 | var7) - (var6 & var7);
            var7 = 1838991355;
            var6 = 2022135317;
            int var1418 = (var6 | var7) & ~(var6 & var7);
            var7 = 394123972;
            var6 = var1418;
            var1418 = (var6 | var7) & (~var6 | ~var7);
            var1418 = (int)6324523357061239147L;
            var7 = -1665285540;
            var6 = var1418;
            var1418 = var6 & ~var7 | ~var6 & var7;
            var7 = -2049913046;
            var6 = var1418;
            var1418 = var6 & ~var7 | ~var6 & var7;
            String var1523 = "eea";
            int var1524 = (int)-1779276558761519666L;
            var7 = 688679724;
            var6 = var1524;
            int var1525 = var6 + var7 - 2 * (var6 & var7);
            var7 = -1124516972;
            var6 = var1525;
            String var1065 = c("혬졼혰졺혹", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w", var1187, var1290, var1418, var6 & ~var7 | ~var6 & var7);
            var7 = -1123357483;
            var6 = -1155830301;
            int var1097 = (var6 | var7) & ~(var6 & var7);
            var7 = 854133028;
            var6 = var1097;
            int var1098 = var6 & ~var7 | ~var6 & var7;
            String var1194 = "eeb";
            var7 = -914043390;
            var6 = -1478793397;
            var1290 = (var6 | var7) & (~var6 | ~var7);
            var7 = -1599560687;
            var6 = var1290;
            var1290 = var6 & ~var7 | ~var6 & var7;
            var1290 = (int)-5936908358202856324L;
            var7 = 147648413;
            var6 = var1290;
            var1290 = var6 + var7 - 2 * (var6 & var7);
            var7 = -885270334;
            var6 = var1290;
            var1290 = (var6 | var7) - (var6 & var7);
            var1418 = (int)-8975203769686320249L;
            var7 = -1564521117;
            var6 = var1418;
            var1418 = (var6 | var7) & ~(var6 & var7);
            var7 = 862476303;
            var6 = var1418;
            var1418 = ((var6 | var7) & ~(var6 & var7)) * ((var6 | var7) & ~(var6 & var7));
            var1418 = (int)8979295149542525520L;
            var7 = -1663339465;
            var6 = var1418;
            var1418 = var6 & ~var7 | ~var6 & var7;
            var7 = -1580386871;
            var6 = var1418;
            var1418 = var6 & ~var7 | ~var6 & var7;
            int var1526 = (int)-7580548590073014475L;
            var7 = 606191461;
            var6 = var1526;
            int var1527 = (var6 | var7) - (var6 & var7);
            var7 = 1128902725;
            var6 = var1527;
            int var1528 = (var6 | var7) & ~(var6 & var7);
            var7 = -1029838151;
            var6 = 2079441086;
            int var1529 = (var6 | var7) & (~var6 | ~var7);
            var7 = -1421338695;
            var6 = var1529;
            int var1530 = (var6 | var7) & ~(var6 & var7);
            var7 = 294933024;
            var6 = -1712679994;
            int var1610 = (var6 | var7) - (var6 & var7);
            var7 = 1851796995;
            var6 = var1610;
            var1610 = (var6 | var7) & ~(var6 & var7);
            var7 = -1756184381;
            var6 = 992419799;
            var1610 = (var6 | var7) - (var6 & var7);
            var7 = -1404994536;
            var6 = var1610;
            return Identifier.of(
               var1065,
               c(
                  "혨⸖혤⸇혩⸁혹⸀홳⸃혽⸁혨⸚혿⸟혹⹜혯⸃혽⸁혷⸟혹⹝혬⸝혻",
                  "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w",
                  var1290,
                  var1418,
                  var1530,
                  (var6 | var7) & ~(var6 & var7)
               )
            );
         case 2:
            String var1062 = "eec";
            int var1178 = (int)1543174979341452447L;
            var7 = 24904927;
            var6 = var1178;
            var1178 = (var6 | var7) & (~var6 | ~var7);
            var7 = -1265172407;
            var6 = var1178;
            var1178 = (var6 | var7) & ~(var6 & var7);
            String var1181 = "eed";
            var1178 = (int)-6452412610738191935L;
            var7 = 816788142;
            var6 = var1178;
            var1178 = var6 & ~var7 | ~var6 & var7;
            var7 = -290559924;
            var6 = var1178;
            var1178 = (var6 | var7) & ~(var6 & var7);
            String var1282 = "eee";
            int var1283 = (int)2078179075578518871L;
            var7 = -1940724546;
            var6 = var1283;
            int var1284 = (var6 | var7) & ~(var6 & var7);
            var7 = 1124312441;
            var6 = var1284;
            int var1285 = var6 + var7 - 2 * (var6 & var7);
            int var1507 = (int)6545961397162975616L;
            var7 = 1853938950;
            var6 = var1507;
            var1507 = (var6 | var7) - (var6 & var7);
            var7 = 30506120;
            var6 = var1507;
            var1507 = var6 + var7 - 2 * (var6 & var7);
            var7 = 504010692;
            var6 = 1093354851;
            var1507 = (var6 | var7) - (var6 & var7);
            var7 = 1596052132;
            var6 = var1507;
            var1507 = var6 & ~var7 | ~var6 & var7;
            var7 = -144001275;
            var6 = 1344714407;
            int var1410 = var6 + var7 - 2 * (var6 & var7);
            var7 = -1415752635;
            var6 = var1410;
            var1410 = (var6 | var7) - (var6 & var7);
            var7 = 357022881;
            var6 = 441702166;
            var1507 = (var6 | var7) & (~var6 | ~var7);
            var7 = 1954174666;
            var6 = var1507;
            var1507 = var6 & ~var7 | ~var6 & var7;
            var7 = 2099891981;
            var6 = -163043458;
            int var1603 = (var6 | var7) & ~(var6 & var7);
            var7 = -161083372;
            var6 = var1603;
            var7 = (var6 | var7) & ~(var6 & var7);
            var6 = var1507;
            var1507 = var6 - ~var7 - 1;
            var7 = -1904325922;
            var6 = -2103513946;
            var1507 = var6 + var7 - 2 * (var6 & var7);
            var7 = 215750038;
            var6 = var1507;
            String var1063 = c("혬㻤혰㻢혹", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w", var1178, var1285, var1410, (var6 | var7) & ~(var6 & var7));
            String var1095 = "eef";
            var7 = -693781637;
            var6 = 264884434;
            var1178 = (var6 | var7) & (~var6 | ~var7);
            var7 = 41575532;
            var6 = var1178;
            var1178 = (var6 | var7) - (var6 & var7);
            var1282 = "eeg";
            int var1287 = (int)-4420074236869171092L;
            var7 = 462461840;
            var6 = var1287;
            int var1288 = var6 & ~var7 | ~var6 & var7;
            var7 = 330066143;
            var6 = var1288;
            int var1289 = (var6 | var7) - (var6 & var7);
            var1410 = (int)4720249495544844639L;
            var7 = 431565347;
            var6 = var1410;
            var1410 = (var6 | var7) & ~(var6 & var7);
            var7 = 1163102917;
            var6 = var1410;
            var1410 = (var6 | var7) & (~var6 | ~var7);
            var1507 = (int)1859552249298908256L;
            var7 = 932968211;
            var6 = var1507;
            var1507 = var6 & ~var7 | ~var6 & var7;
            var7 = -364441450;
            var6 = var1507;
            var7 = (var6 | var7) & ~(var6 & var7);
            var6 = var1410;
            var1410 = (var6 & ~var7) + (var7 & ~var6) + 2 * (var6 & var7);
            var7 = 137889309;
            var6 = -866319405;
            var1410 = (var6 | var7) & (~var6 | ~var7);
            var7 = -1059526873;
            var6 = var1410;
            var1410 = var6 & ~var7 | ~var6 & var7;
            var7 = -1201113882;
            var6 = 290368160;
            var1507 = (var6 | var7) - (var6 & var7);
            var7 = -221199768;
            var6 = var1507;
            var1507 = (var6 | var7) & ~(var6 & var7);
            var1507 = (int)5560633220498992038L;
            var7 = -1734520390;
            var6 = var1507;
            var1507 = (var6 | var7) - (var6 & var7);
            var7 = 1580749170;
            var6 = var1507;
            var1507 = var6 & ~var7 | ~var6 & var7;
            var1603 = (int)-4421178418422166941L;
            var7 = -930902850;
            var6 = var1603;
            var1603 = var6 + var7 - 2 * (var6 & var7);
            var7 = -1912238950;
            var6 = var1603;
            var1603 = var6 + var7 - 2 * (var6 & var7);
            var7 = -87224242;
            var6 = -242653090;
            int var1632 = var6 & ~var7 | ~var6 & var7;
            var7 = -1761081560;
            var6 = var1632;
            var7 = (var6 | var7) & ~(var6 & var7);
            var6 = var1603;
            var1603 = 2 * (var6 | var7) - (var6 ^ var7);
            var1603 = (int)-1055661438208651197L;
            var7 = 1561915665;
            var6 = var1603;
            var1603 = var6 & ~var7 | ~var6 & var7;
            var7 = -2125473003;
            var6 = var1603;
            return Identifier.of(
               var1063,
               c(
                  "혨睝혤睌혩睊혹睋홳睈혽睊혨睑혿睔혹眗혯睖혳睏혺睔혽睓혹眖혬睖혻",
                  "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w",
                  var1289,
                  var1410,
                  var1507,
                  var6 + var7 - 2 * (var6 & var7)
               )
            );
         case 3:
            var7 = -1347850306;
            var6 = -816962839;
            var10000 = (var6 | var7) & ~(var6 & var7);
            var7 = -2083963728;
            var6 = var10000;
            var10000 = (var6 | var7) & (~var6 | ~var7);
            int var1087 = (int)-3461692206628821900L;
            var7 = 1999058628;
            var6 = var1087;
            var1087 = var6 + var7 - 2 * (var6 & var7);
            var7 = 939853385;
            var6 = var1087;
            var7 = var6 & ~var7 | ~var6 & var7;
            var6 = var10000;
            var10000 = 2 * (var6 | var7) - (var6 ^ var7);
            var7 = 95818379;
            var6 = 891075947;
            var1087 = var6 & ~var7 | ~var6 & var7;
            var7 = -1555031762;
            var6 = var1087;
            var1087 = var6 + var7 - 2 * (var6 & var7);
            var7 = 1027284208;
            var6 = 1980434044;
            int var1171 = (var6 | var7) & (~var6 | ~var7);
            var7 = 583347772;
            var6 = var1171;
            var7 = var6 + var7 - 2 * (var6 & var7);
            var6 = var1087;
            var1087 = (var6 ^ var7) + 2 * (var6 & var7);
            var1171 = (int)635815305197472077L;
            var7 = -156064423;
            var6 = var1171;
            var1171 = (var6 | var7) & ~(var6 & var7);
            var7 = 1204104752;
            var6 = var1171;
            var1171 = ((var6 | var7) & ~(var6 & var7)) * ((var6 | var7) & ~(var6 & var7));
            var1171 = (int)591933562025465859L;
            var7 = 1760709898;
            var6 = var1171;
            var1171 = (var6 | var7) & (~var6 | ~var7);
            var7 = 828952106;
            var6 = var1171;
            var1171 = var6 + var7 - 2 * (var6 & var7);
            var7 = 2055888139;
            var6 = -662455276;
            int var1392 = (var6 | var7) & (~var6 | ~var7);
            var7 = -1576410863;
            var6 = var1392;
            var1392 = (var6 | var7) & ~(var6 & var7);
            var1392 = (int)2291510079003641015L;
            var7 = 678166706;
            var6 = var1392;
            var1392 = (var6 | var7) & ~(var6 & var7);
            var7 = -1974385657;
            var6 = var1392;
            var1392 = (var6 | var7) & ~(var6 & var7);
            var7 = 1586829767;
            var6 = 868724730;
            var1392 = var6 + var7 - 2 * (var6 & var7);
            var7 = 1834137149;
            var6 = var1392;
            var1392 = var6 + var7 - 2 * (var6 & var7);
            var1392 = (int)-3230889746165775563L;
            var7 = -684644164;
            var6 = var1392;
            var1392 = (var6 | var7) & ~(var6 & var7);
            var7 = 73886599;
            var6 = var1392;
            var1392 = (var6 | var7) - (var6 & var7);
            var7 = -1627656434;
            var6 = -637152376;
            int var1274 = var6 + var7 - 2 * (var6 & var7);
            var7 = 1076209397;
            var6 = var1274;
            var1274 = (var6 | var7) & ~(var6 & var7);
            String var1402 = "eeh";
            var7 = -2056776726;
            var6 = -412929231;
            var1392 = (var6 | var7) - (var6 & var7);
            var7 = 2119706875;
            var6 = var1392;
            var1392 = (var6 | var7) & ~(var6 & var7);
            int var1500 = (int)6671010367949811519L;
            var7 = -450426605;
            var6 = var1500;
            var1500 = var6 + var7 - 2 * (var6 & var7);
            var7 = -1597739907;
            var6 = var1500;
            var1500 = var6 + var7 - 2 * (var6 & var7);
            var1500 = (int)4091806834830569234L;
            var7 = -1029854053;
            var6 = var1500;
            var1500 = var6 & ~var7 | ~var6 & var7;
            var7 = -850562472;
            var6 = var1500;
            String var1061 = c("혬㳛혰㳝혹", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w", var1171, var1274, var1392, var6 & ~var7 | ~var6 & var7);
            var1087 = (int)-4829704228270297655L;
            var7 = 444152768;
            var6 = var1087;
            var1087 = (var6 | var7) & (~var6 | ~var7);
            var7 = 1950044600;
            var6 = var1087;
            var1087 = (var6 | var7) & (~var6 | ~var7);
            var7 = -1268367248;
            var6 = -472019295;
            var1274 = (var6 | var7) & ~(var6 & var7);
            var7 = 1471925971;
            var6 = var1274;
            var1274 = (var6 | var7) & ~(var6 & var7);
            var7 = 1597174926;
            var6 = -583572146;
            var1274 = (var6 | var7) & ~(var6 & var7);
            var7 = -524849724;
            var6 = var1274;
            var1274 = var6 + var7 - 2 * (var6 & var7);
            var7 = 1473755542;
            var6 = 541861993;
            var1274 = (var6 | var7) & (~var6 | ~var7);
            var7 = 287951580;
            var6 = var1274;
            var1274 = (var6 | var7) & (~var6 | ~var7);
            var1392 = (int)-5321456767319934278L;
            var7 = -1448262728;
            var6 = var1392;
            var1392 = (var6 | var7) & (~var6 | ~var7);
            var7 = 262501218;
            var6 = var1392;
            var1392 = (var6 | var7) & (~var6 | ~var7);
            var7 = -1706862833;
            var6 = 734121683;
            var1392 = var6 & ~var7 | ~var6 & var7;
            var7 = -1254450427;
            var6 = var1392;
            var1392 = var6 + var7 - 2 * (var6 & var7);
            var7 = 1833456278;
            var6 = 656584421;
            int var1594 = var6 + var7 - 2 * (var6 & var7);
            var7 = 1248525432;
            var6 = var1594;
            var1594 = (var6 | var7) & ~(var6 & var7);
            var7 = -1695120832;
            var6 = 532259840;
            var1594 = (var6 | var7) & ~(var6 & var7);
            var7 = -2058410425;
            var6 = var1594;
            var1594 = var6 & ~var7 | ~var6 & var7;
            var1594 = (int)-3844817645426968000L;
            var7 = 481807662;
            var6 = var1594;
            var1594 = (var6 | var7) & (~var6 | ~var7);
            var7 = -23316633;
            var6 = var1594;
            var1594 = (var6 | var7) & ~(var6 & var7);
            var7 = 536804362;
            var6 = 1984347516;
            var1500 = var6 & ~var7 | ~var6 & var7;
            var7 = 1829240237;
            var6 = var1500;
            var1500 = (var6 | var7) - (var6 & var7);
            String var1601 = "eei";
            var7 = -1125363299;
            var6 = -393419049;
            var1594 = (var6 | var7) & ~(var6 & var7);
            var7 = 1413787005;
            var6 = var1594;
            return Identifier.of(
               var1061,
               c(
                  "혨霭혤霼혩霺혹霻홳霸혽霺혨霡혿霤혹靧혻霤혳霿홲霸혲霯",
                  "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w",
                  var1274,
                  var1392,
                  var1500,
                  var6 & ~var7 | ~var6 & var7
               )
            );
         case 4:
            String var1056 = "eej";
            var7 = -1463031996;
            var6 = -1459488066;
            int var1085 = (var6 | var7) - (var6 & var7);
            var7 = 1888588854;
            var6 = var1085;
            var1085 = (var6 | var7) & (~var6 | ~var7);
            var7 = 644003755;
            var6 = -733358835;
            int var1246 = (var6 | var7) & ~(var6 & var7);
            var7 = -232037717;
            var6 = var1246;
            var1246 = var6 & ~var7 | ~var6 & var7;
            var1246 = (int)8821289039525463816L;
            var7 = -1814606313;
            var6 = var1246;
            var1246 = (var6 | var7) - (var6 & var7);
            var7 = 2116094223;
            var6 = var1246;
            var1246 = (var6 | var7) & ~(var6 & var7);
            var7 = 819272047;
            var6 = 1080917541;
            var1246 = (var6 | var7) - (var6 & var7);
            var7 = 1891133254;
            var6 = var1246;
            var1246 = var6 & ~var7 | ~var6 & var7;
            var7 = 174138314;
            var6 = -937301543;
            int var1158 = (var6 | var7) - (var6 & var7);
            var7 = -1527606992;
            var6 = var1158;
            var1158 = (var6 | var7) - (var6 & var7);
            var7 = -1539586224;
            var6 = 1070250367;
            var1246 = var6 & ~var7 | ~var6 & var7;
            var7 = 1543625218;
            var6 = var1246;
            var1246 = (var6 | var7) & (~var6 | ~var7);
            var7 = -421695579;
            var6 = -910633706;
            var1246 = var6 + var7 - 2 * (var6 & var7);
            var7 = 733321197;
            var6 = var1246;
            var1246 = (var6 | var7) - (var6 & var7);
            int var1379 = (int)6487356705795646633L;
            var7 = 1855873641;
            var6 = var1379;
            var1379 = (var6 | var7) & (~var6 | ~var7);
            var7 = 1036738861;
            var6 = var1379;
            var1379 = (var6 | var7) & ~(var6 & var7);
            int var1490 = (int)-7898290960408862226L;
            var7 = -1897900095;
            var6 = var1490;
            var1490 = var6 & ~var7 | ~var6 & var7;
            var7 = 948710771;
            var6 = var1490;
            var7 = (var6 | var7) & ~(var6 & var7);
            var6 = var1379;
            var1379 = (var6 | var7) + (var6 & var7);
            var1379 = (int)5633333900018902304L;
            var7 = -2040714513;
            var6 = var1379;
            var1379 = (var6 | var7) & (~var6 | ~var7);
            var7 = 1160517606;
            var6 = var1379;
            var1379 = (var6 | var7) & ~(var6 & var7);
            String var1492 = "eek";
            var7 = 1985803283;
            var6 = -1798731542;
            var1490 = (var6 | var7) - (var6 & var7);
            var7 = -492226491;
            var6 = var1490;
            String var1057 = c("혬즶혰즰혹", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w", var1158, var1246, var1379, (var6 | var7) - (var6 & var7));
            var7 = -1518329707;
            var6 = 1798023804;
            var1158 = (var6 | var7) & ~(var6 & var7);
            var7 = -827618565;
            var6 = var1158;
            var1158 = (var6 | var7) & (~var6 | ~var7);
            var1158 = (int)5177233889140283254L;
            var7 = 1088172593;
            var6 = var1158;
            var1158 = var6 & ~var7 | ~var6 & var7;
            var7 = -2121390764;
            var6 = var1158;
            var1158 = (var6 | var7) - (var6 & var7);
            var7 = 551599582;
            var6 = -165829318;
            var1158 = var6 & ~var7 | ~var6 & var7;
            var7 = -688056081;
            var6 = var1158;
            var1158 = var6 + var7 - 2 * (var6 & var7);
            var7 = 1766436578;
            var6 = 870184344;
            var1158 = (var6 | var7) & (~var6 | ~var7);
            var7 = 1519672184;
            var6 = var1158;
            var1158 = var6 & ~var7 | ~var6 & var7;
            var7 = -1260412648;
            var6 = 2114199053;
            var1158 = var6 & ~var7 | ~var6 & var7;
            var7 = -891568359;
            var6 = var1158;
            var1158 = var6 + var7 - 2 * (var6 & var7);
            var1246 = (int)-9040094006458117606L;
            var7 = 459878005;
            var6 = var1246;
            var1246 = (var6 | var7) & (~var6 | ~var7);
            var7 = -746308500;
            var6 = var1246;
            var1246 = (var6 | var7) & (~var6 | ~var7);
            var7 = -672730005;
            var6 = -1917197963;
            var1246 = var6 & ~var7 | ~var6 & var7;
            var7 = 1516180763;
            var6 = var1246;
            var1246 = (var6 | var7) - (var6 & var7);
            var1246 = (int)-5899154155669229800L;
            var7 = 634050854;
            var6 = var1246;
            var1246 = var6 & ~var7 | ~var6 & var7;
            var7 = -908446153;
            var6 = var1246;
            var1246 = (var6 | var7) - (var6 & var7);
            var1246 = (int)9048369918808671068L;
            var7 = 1234357822;
            var6 = var1246;
            var1246 = var6 & ~var7 | ~var6 & var7;
            var7 = 2138639731;
            var6 = var1246;
            var1246 = (var6 | var7) & (~var6 | ~var7);
            var7 = 944574454;
            var6 = 1213541682;
            var1246 = var6 + var7 - 2 * (var6 & var7);
            var7 = 749004905;
            var6 = var1246;
            var1246 = (var6 | var7) & ~(var6 & var7);
            var7 = -2022980734;
            var6 = -676982267;
            var1379 = var6 + var7 - 2 * (var6 & var7);
            var7 = 1891785138;
            var6 = var1379;
            var7 = (var6 | var7) & (~var6 | ~var7);
            var6 = var1246;
            var1246 = 2 * (var6 | var7) - (var6 ^ var7);
            var1246 = (int)1135435771749250700L;
            var7 = 2090212974;
            var6 = var1246;
            var1246 = (var6 | var7) & ~(var6 & var7);
            var7 = -1975061567;
            var6 = var1246;
            var1246 = var6 & ~var7 | ~var6 & var7;
            var1379 = (int)-60858972851926928L;
            var7 = 1244930203;
            var6 = var1379;
            var1379 = (var6 | var7) - (var6 & var7);
            var7 = 430535103;
            var6 = var1379;
            var1379 = var6 + var7 - 2 * (var6 & var7);
            var7 = 1935131917;
            var6 = -1299775299;
            var1379 = (var6 | var7) - (var6 & var7);
            var7 = -982674799;
            var6 = var1379;
            var1379 = (var6 | var7) - (var6 & var7);
            var1490 = (int)268479723660362036L;
            var7 = -1421964916;
            var6 = var1490;
            var1490 = var6 + var7 - 2 * (var6 & var7);
            var7 = -638697499;
            var6 = var1490;
            var1490 = (var6 + var7 - 2 * (var6 & var7)) * (var6 + var7 - 2 * (var6 & var7));
            var1490 = (int)544713734636172565L;
            var7 = -730058983;
            var6 = var1490;
            var1490 = (var6 | var7) - (var6 & var7);
            var7 = -1564207292;
            var6 = var1490;
            var1490 = var6 + var7 - 2 * (var6 & var7);
            int var1588 = (int)5774878800272146130L;
            var7 = 1649294014;
            var6 = var1588;
            var1588 = var6 & ~var7 | ~var6 & var7;
            var7 = -2125585652;
            var6 = var1588;
            var1588 = (var6 | var7) & (~var6 | ~var7);
            int var1630 = (int)-2117533160711457656L;
            var7 = -1490541924;
            var6 = var1630;
            var1630 = (var6 | var7) & ~(var6 & var7);
            var7 = -353970633;
            var6 = var1630;
            var7 = (var6 | var7) - (var6 & var7);
            var6 = var1588;
            var1588 = (var6 & ~var7) + (var7 & ~var6) + 2 * (var6 & var7);
            var1588 = (int)2002370332920186187L;
            var7 = -2089036583;
            var6 = var1588;
            var1588 = var6 & ~var7 | ~var6 & var7;
            var7 = -248528915;
            var6 = var1588;
            return Identifier.of(
               var1057,
               c(
                  "혨\ue365혤\ue374혩\ue372혹\ue373홳\ue370혽\ue372혨\ue369혿\ue36c혹\ue32f혯\ue374혽\ue372홲\ue370혲\ue367",
                  "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w",
                  var1246,
                  var1379,
                  var1490,
                  var6 + var7 - 2 * (var6 & var7)
               )
            );
         case 5:
            var10000 = (int)-9135383109124314636L;
            var7 = 1200050952;
            var6 = var10000;
            var10000 = (var6 | var7) & ~(var6 & var7);
            var7 = 1471191209;
            var6 = var10000;
            var10000 = var6 + var7 - 2 * (var6 & var7);
            var7 = -313704963;
            var6 = -166365225;
            int var1142 = (var6 | var7) - (var6 & var7);
            var7 = 458770987;
            var6 = var1142;
            var1142 = var6 + var7 - 2 * (var6 & var7);
            var1142 = (int)-3948926117317977592L;
            var7 = 1105699950;
            var6 = var1142;
            var1142 = (var6 | var7) & ~(var6 & var7);
            var7 = 488144503;
            var6 = var1142;
            var1142 = (var6 | var7) & ~(var6 & var7);
            var1142 = (int)4743828715803020673L;
            var7 = -1005097677;
            var6 = var1142;
            var1142 = var6 + var7 - 2 * (var6 & var7);
            var7 = 1257028497;
            var6 = var1142;
            var1142 = (var6 | var7) - (var6 & var7);
            int var1234 = (int)5984192347408011115L;
            var7 = -1775064312;
            var6 = var1234;
            var1234 = (var6 | var7) - (var6 & var7);
            var7 = 1100721305;
            var6 = var1234;
            var7 = var6 & ~var7 | ~var6 & var7;
            var6 = var1142;
            var1142 = (var6 | var7) + (var6 & var7);
            var1142 = (int)-8924168830936230860L;
            var7 = -1094830500;
            var6 = var1142;
            var1142 = (var6 | var7) & ~(var6 & var7);
            var7 = -597509813;
            var6 = var1142;
            var1142 = (var6 | var7) - (var6 & var7);
            var1234 = (int)-7070589314064211948L;
            var7 = 1755601570;
            var6 = var1234;
            var1234 = (var6 | var7) & (~var6 | ~var7);
            var7 = 2134213180;
            var6 = var1234;
            var1234 = (var6 | var7) - (var6 & var7);
            var1234 = (int)3082747216640452638L;
            var7 = -1251738185;
            var6 = var1234;
            var1234 = var6 & ~var7 | ~var6 & var7;
            var7 = 501396019;
            var6 = var1234;
            var1234 = var6 & ~var7 | ~var6 & var7;
            String var1372 = "eel";
            var7 = -68312819;
            var6 = 1256304062;
            int var1373 = var6 + var7 - 2 * (var6 & var7);
            var7 = -1139675723;
            var6 = var1373;
            int var1374 = (var6 | var7) - (var6 & var7);
            int var1479 = (int)-6815405628472731879L;
            var7 = -369426885;
            var6 = var1479;
            var1479 = (var6 | var7) - (var6 & var7);
            var7 = -161327243;
            var6 = var1479;
            var1479 = (var6 | var7) & ~(var6 & var7);
            var7 = 1117316642;
            var6 = -1875064799;
            int var1583 = (var6 | var7) & (~var6 | ~var7);
            var7 = 1560450088;
            var6 = var1583;
            var7 = var6 & ~var7 | ~var6 & var7;
            var6 = var1479;
            var1479 = (var6 | var7) + (var6 & var7);
            var7 = 113611236;
            var6 = 2075359474;
            var1479 = (var6 | var7) - (var6 & var7);
            var7 = 2104367086;
            var6 = var1479;
            String var1055 = c("혬珲혰珴혹", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w", var1142, var1234, var1374, (var6 | var7) - (var6 & var7));
            var7 = 2044631179;
            var6 = 156162073;
            int var1083 = var6 & ~var7 | ~var6 & var7;
            var7 = -2140862842;
            var6 = var1083;
            var1083 = var6 & ~var7 | ~var6 & var7;
            var1142 = (int)-1709573500546067258L;
            var7 = 1575852899;
            var6 = var1142;
            var1142 = var6 & ~var7 | ~var6 & var7;
            var7 = 159712240;
            var6 = var1142;
            var1142 = var6 + var7 - 2 * (var6 & var7);
            var7 = -1630816045;
            var6 = -172921522;
            var1234 = var6 + var7 - 2 * (var6 & var7);
            var7 = -903302913;
            var6 = var1234;
            var7 = var6 + var7 - 2 * (var6 & var7);
            var6 = var1142;
            var1142 = (var6 & ~var7) + (var7 & ~var6) + 2 * (var6 & var7);
            String var1243 = "eem";
            var7 = 870734771;
            var6 = 269553262;
            var1234 = (var6 | var7) & (~var6 | ~var7);
            var7 = 1162153726;
            var6 = var1234;
            var1234 = (var6 | var7) & ~(var6 & var7);
            var7 = -2094389926;
            var6 = 1065811815;
            int var1375 = var6 & ~var7 | ~var6 & var7;
            var7 = 1337684313;
            var6 = var1375;
            int var1376 = var6 & ~var7 | ~var6 & var7;
            var7 = -2112513191;
            var6 = -1677975497;
            int var1377 = var6 + var7 - 2 * (var6 & var7);
            var7 = 488685142;
            var6 = var1377;
            int var1378 = var6 + var7 - 2 * (var6 & var7);
            var7 = -2004900271;
            var6 = -551646416;
            var1479 = var6 + var7 - 2 * (var6 & var7);
            var7 = -127890339;
            var6 = var1479;
            var1479 = (var6 | var7) - (var6 & var7);
            var1583 = (int)-2803083628100687330L;
            var7 = -681501877;
            var6 = var1583;
            var1583 = (var6 | var7) - (var6 & var7);
            var7 = 279538204;
            var6 = var1583;
            var7 = (var6 | var7) - (var6 & var7);
            var6 = var1479;
            var1479 = (var6 & ~var7) + (var7 & ~var6) + 2 * (var6 & var7);
            var1479 = (int)6922045858068042584L;
            var7 = -251257812;
            var6 = var1479;
            var1479 = (var6 | var7) & (~var6 | ~var7);
            var7 = 1877230474;
            var6 = var1479;
            var1479 = var6 + var7 - 2 * (var6 & var7);
            String var1586 = "een";
            var7 = 485848114;
            var6 = -915445720;
            var1583 = (var6 | var7) & (~var6 | ~var7);
            var7 = -709951348;
            var6 = var1583;
            return Identifier.of(
               var1055,
               c(
                  "혨醌혤醝혩醛혹醚홳醙혽醛혨醀혿醅혹釆호醆혰醅혽醛홲醙혲醎",
                  "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w",
                  var1234,
                  var1378,
                  var1479,
                  (var6 | var7) - (var6 & var7)
               )
            );
         default:
            var7 = -1660163376;
            var6 = -1274000104;
            var10000 = (var6 | var7) & (~var6 | ~var7);
            var7 = 1222416967;
            var6 = var10000;
            var10000 = ((var6 | var7) & (~var6 | ~var7)) * ((var6 | var7) & (~var6 | ~var7));
            int var1077 = (int)-1152806672004050804L;
            var7 = -287196668;
            var6 = var1077;
            var1077 = (var6 | var7) - (var6 & var7);
            var7 = 1395119989;
            var6 = var1077;
            var1077 = ((var6 | var7) & (~var6 | ~var7)) * ((var6 | var7) & (~var6 | ~var7));
            int var1134 = (int)-77432015027775970L;
            var7 = 1759791760;
            var6 = var1134;
            var1134 = var6 & ~var7 | ~var6 & var7;
            var7 = -197034506;
            var6 = var1134;
            var1134 = ((var6 | var7) & ~(var6 & var7)) * ((var6 | var7) & ~(var6 & var7));
            var7 = -2016959397;
            var6 = -701269092;
            var1134 = var6 & ~var7 | ~var6 & var7;
            var7 = 927368420;
            var6 = var1134;
            var1134 = (var6 | var7) & (~var6 | ~var7);
            var7 = 1818178067;
            var6 = 1547399158;
            int var1225 = (var6 | var7) & (~var6 | ~var7);
            var7 = 86310585;
            var6 = var1225;
            var1225 = var6 & ~var7 | ~var6 & var7;
            var7 = 1186349279;
            var6 = 1361900397;
            var1225 = (var6 | var7) - (var6 & var7);
            var7 = 323769063;
            var6 = var1225;
            var1225 = (var6 | var7) - (var6 & var7);
            int var1362 = (int)253141927465430584L;
            var7 = -1480648973;
            var6 = var1362;
            var1362 = (var6 | var7) - (var6 & var7);
            var7 = -138160515;
            var6 = var1362;
            var1362 = (var6 | var7) - (var6 & var7);
            int var1468 = (int)-2640179982617442264L;
            var7 = 1071604639;
            var6 = var1468;
            var1468 = (var6 | var7) & ~(var6 & var7);
            var7 = -1049509043;
            var6 = var1468;
            var7 = (var6 | var7) - (var6 & var7);
            var6 = var1362;
            var1362 = (var6 ^ var7) + 2 * (var6 & var7);
            var7 = -1982755229;
            var6 = 571591655;
            var1362 = var6 + var7 - 2 * (var6 & var7);
            var7 = -1374184384;
            var6 = var1362;
            var1362 = (var6 | var7) & ~(var6 & var7);
            String var1470 = "eeo";
            var1468 = (int)7356294744040434336L;
            var7 = 1941582755;
            var6 = var1468;
            var1468 = var6 + var7 - 2 * (var6 & var7);
            var7 = 1516413360;
            var6 = var1468;
            String var1051 = c("혬疹혰疿혹", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w", var1134, var1225, var1362, (var6 | var7) & (~var6 | ~var7));
            var1077 = (int)-4309162407547258560L;
            var7 = -1000722870;
            var6 = var1077;
            var1077 = var6 + var7 - 2 * (var6 & var7);
            var7 = 1981885775;
            var6 = var1077;
            var1077 = ((var6 | var7) - (var6 & var7)) * ((var6 | var7) - (var6 & var7));
            var7 = -1290990754;
            var6 = -1030119367;
            var1134 = var6 & ~var7 | ~var6 & var7;
            var7 = 1801500768;
            var6 = var1134;
            var1134 = (var6 | var7) - (var6 & var7);
            var7 = 1854949242;
            var6 = -498902311;
            var1225 = (var6 | var7) & ~(var6 & var7);
            var7 = -1640992263;
            var6 = var1225;
            var7 = var6 & ~var7 | ~var6 & var7;
            var6 = var1134;
            var1134 = (var6 | var7) + (var6 & var7);
            String var1230 = "eep";
            var1225 = (int)3601737779628360049L;
            var7 = -503769858;
            var6 = var1225;
            var1225 = (var6 | var7) - (var6 & var7);
            var7 = 126946988;
            var6 = var1225;
            var1225 = var6 & ~var7 | ~var6 & var7;
            var7 = 1176261772;
            var6 = 1759406816;
            var1362 = var6 + var7 - 2 * (var6 & var7);
            var7 = -1851931561;
            var6 = var1362;
            var1362 = var6 & ~var7 | ~var6 & var7;
            var7 = 446643130;
            var6 = 1172506431;
            var1362 = var6 + var7 - 2 * (var6 & var7);
            var7 = 1538047581;
            var6 = var1362;
            var1362 = (var6 | var7) & (~var6 | ~var7);
            var1468 = (int)-3582181903302047462L;
            var7 = -189249704;
            var6 = var1468;
            var1468 = var6 & ~var7 | ~var6 & var7;
            var7 = -671931386;
            var6 = var1468;
            var1468 = (var6 | var7) & (~var6 | ~var7);
            var7 = 626281635;
            var6 = -571341310;
            int var1578 = (var6 | var7) - (var6 & var7);
            var7 = -1732067744;
            var6 = var1578;
            var7 = (var6 | var7) - (var6 & var7);
            var6 = var1468;
            var1468 = (var6 | var7) + (var6 & var7);
            var7 = -1867518435;
            var6 = -1863102111;
            var1468 = (var6 | var7) & (~var6 | ~var7);
            var7 = 339477930;
            var6 = var1468;
            var1468 = var6 & ~var7 | ~var6 & var7;
            var1578 = (int)370250596751443344L;
            var7 = 38149790;
            var6 = var1578;
            var1578 = var6 + var7 - 2 * (var6 & var7);
            var7 = 653553702;
            var6 = var1578;
            var1578 = ((var6 | var7) & (~var6 | ~var7)) * ((var6 | var7) & (~var6 | ~var7));
            var7 = 895074679;
            var6 = -632841305;
            var1578 = (var6 | var7) & ~(var6 & var7);
            var7 = -282935066;
            var6 = var1578;
            return Identifier.of(
               var1051,
               c(
                  "혨ᜬ혤\u173d혩\u173b혹\u173a홳\u1739혽\u173b혨ᜠ혿ᜥ혹ᝦ혴ᜬ혽\u173b혨ᝧ혬ᜧ혻",
                  "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑃`\ua7e7꒼ꁽꤖ絛蹅⑾謢㑻w",
                  var1225,
                  var1362,
                  var1468,
                  var6 + var7 - 2 * (var6 & var7)
               )
            );
      }
   }

   private void a(BufferBuilder var1, Matrix4f var2, float var3, Vec3d var4, Vec3d var5, Color var6, float var7) {
      this.a(var1, var2, var4, var5, var6, var7);
      this.a(var1, var2, var4.add(0.0, var3, 0.0), var5, var6, var7);
   }

   private void a(BufferBuilder var1, Matrix4f var2, Vec3d var3, Vec3d var4, Color var5, float var6) {
      VertexConsumer var10000 = var1.vertex(
         var2, (float)(var3.x - var4.x), (float)(var3.y - var4.y), (float)(var3.z - var4.z)
      );
      int var10001 = var5.getRed();
      int var10002 = var5.getGreen();
      int var10003 = var5.getBlue();
      int var8 = 302811590;
      int var7 = -1046638036;
      int var10005 = (var7 | var8) & (~var7 | ~var8);
      var8 = -907509462;
      var7 = var10005;
      var10005 = ((var7 | var8) & (~var7 | ~var8)) * ((var7 | var8) & (~var7 | ~var8));
      var10000.color(var10001, var10002, var10003, (int)(var6 * 255.0F));
   }

   @Override
   public void f() {
      super.f();
      this.w.clear();
      int var10001 = (int)4617865505233507807L;
      int var2 = -657614423;
      int var1 = var10001;
      var10001 = (var1 | var2) - (var1 & var2);
      var2 = 993299574;
      var1 = var10001;
      this.A = pulse.Bool.from((var1 | var2) & ~(var1 & var2));
   }

   public static String c(String var0, String var1, int var2, int var3, int var4, int var5) {
      char[] var6 = var1.toCharArray();
      char[] var7 = new char[var6.length];
      int var10000 = (int)-8209871620598469203L;
      int var20 = -460686145;
      int var19 = var10000;
      var10000 = (var19 | var20) - (var19 & var20);
      var20 = -1507815144;
      var19 = var10000;
      char[] var297 = new char[var19 & ~var20 | ~var19 & var20];
      int var10002 = (int)-1265886162832320630L;
      var20 = 773480858;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = -1000966640;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = 591547456;
      var19 = -26436753;
      int var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = -584147171;
      var19 = var10003;
      var297[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      var20 = -818452272;
      var19 = 961705876;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = -161145019;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var10003 = (int)-138489857471136079L;
      var20 = 1565933903;
      var19 = var10003;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = 86400123;
      var19 = var10003;
      var297[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      var10002 = (int)-4149229826117405011L;
      var20 = 2107248957;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = -1756698734;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var10003 = (int)-5549157284844024438L;
      var20 = -1773493676;
      var19 = var10003;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = 877874264;
      var19 = var10003;
      var297[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      var20 = 1192415482;
      var19 = 376513913;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = 1365505408;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = 1953982361;
      var19 = -1974801111;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = 622319045;
      var19 = var10003;
      var10003 = ((var19 | var20) & ~(var19 & var20)) * ((var19 | var20) & ~(var19 & var20));
      var20 = -1669033516;
      var19 = 1058223432;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = -1550369649;
      var19 = var10003;
      var297[var10002] = (char)((var19 | var20) - (var19 & var20));
      var10002 = (int)6899648773358698211L;
      var20 = -1549773702;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = 1084320413;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      int var10004 = (int)4801252156055916018L;
      var20 = 289139546;
      var19 = var10004;
      var10004 = (var19 | var20) & ~(var19 & var20);
      var20 = -940480863;
      var19 = var10004;
      var10004 = (var19 | var20) - (var19 & var20);
      var20 = -1396453646;
      var19 = 833140098;
      var10004 = (var19 | var20) - (var19 & var20);
      var20 = -1653900428;
      var19 = var10004;
      var10004 = (var19 | var20) & (~var19 | ~var20);
      var10004 = (int)-6293904493581826971L;
      var20 = -1972409455;
      var19 = var10004;
      var10004 = (var19 | var20) & (~var19 | ~var20);
      var20 = 599617521;
      var19 = var10004;
      var10004 = var19 + var20 - 2 * (var19 & var20);
      var10004 = (int)-3055848053524069095L;
      var20 = 518445467;
      var19 = var10004;
      var10004 = (var19 | var20) & (~var19 | ~var20);
      var20 = -725099383;
      var19 = var10004;
      var10004 = var19 & ~var20 | ~var19 & var20;
      var10003 = (int)-4466042719458181361L;
      var20 = -1283702853;
      var19 = var10003;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = -1182461551;
      var19 = var10003;
      var297[var10002] = (char)((var19 | var20) & ~(var19 & var20));
      var10002 = (int)-5212678585639826894L;
      var20 = -1809653476;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = 713419563;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var10003 = (int)-8441210927504146774L;
      var20 = 1360578616;
      var19 = var10003;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = -689917168;
      var19 = var10003;
      var297[var10002] = (char)((var19 | var20) & ~(var19 & var20));
      var10002 = (int)-1142142209427705429L;
      var20 = 2096925013;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = 1088977144;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = 83431831;
      var19 = 899700192;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = 827936100;
      var19 = var10003;
      var297[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      var20 = -2071663782;
      var19 = 1869730608;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = -336250771;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var10003 = (int)-8237680718275706245L;
      var20 = -1932663620;
      var19 = var10003;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = -1428532507;
      var19 = var10003;
      var297[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      var10002 = (int)-8451832393158487844L;
      var20 = -1934557666;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = 1410789066;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1226476806;
      var19 = 1328051404;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = 104001945;
      var19 = var10003;
      var297[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      var20 = 32870784;
      var19 = 969827999;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = 943453974;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var10003 = (int)9080121167615162424L;
      var20 = 950469230;
      var19 = var10003;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = -778830478;
      var19 = var10003;
      var297[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      char[] var8 = var297;
      var10000 = (int)-5338617034276031711L;
      var20 = -512920988;
      var19 = var10000;
      var10000 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1364050255;
      var19 = var10000;
      char[] var300 = new char[var19 + var20 - 2 * (var19 & var20)];
      var10002 = (int)4072672154149477475L;
      var20 = -1493449163;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = -1404069290;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = 1533863038;
      var19 = 1444234803;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = 226093677;
      var19 = var10003;
      var300[var10002] = (char)((var19 | var20) - (var19 & var20));
      var20 = 1682665545;
      var19 = -2115983295;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = -441722871;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = -150340639;
      var19 = -409354525;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = -1554039281;
      var19 = var10003;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var10003 = (int)452942177230376003L;
      var20 = -1647396073;
      var19 = var10003;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = 878048087;
      var19 = var10003;
      var300[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      var10002 = (int)4720015583407793501L;
      var20 = -584011653;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = -1973103324;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = -1839509838;
      var19 = 431829869;
      var10004 = (var19 | var20) - (var19 & var20);
      var20 = -1947828775;
      var19 = var10004;
      var10004 = var19 & ~var20 | ~var19 & var20;
      var10004 = (int)-6203065716477886066L;
      var20 = 1017395466;
      var19 = var10004;
      var10004 = var19 & ~var20 | ~var19 & var20;
      var20 = -1505052522;
      var19 = var10004;
      var10004 = var19 + var20 - 2 * (var19 & var20);
      var10004 = (int)41216569991223259L;
      var20 = -1953935401;
      var19 = var10004;
      var10004 = (var19 | var20) - (var19 & var20);
      var20 = 245798926;
      var19 = var10004;
      var10004 = (var19 | var20) & (~var19 | ~var20);
      var20 = -422568857;
      var19 = 1617237174;
      var10004 = var19 & ~var20 | ~var19 & var20;
      var20 = -2034956079;
      var19 = var10004;
      var10004 = (var19 | var20) - (var19 & var20);
      var10003 = (int)5250206606742702824L;
      var20 = 680577260;
      var19 = var10003;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = -1193376425;
      var19 = var10003;
      var300[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      var10002 = (int)2156286649012361905L;
      var20 = 2064519249;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = 524454627;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = -1629665854;
      var19 = 433440548;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = -2029471004;
      var19 = var10003;
      var300[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      var20 = 903704645;
      var19 = 122418190;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = 848725071;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = -929705758;
      var19 = -910252370;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = 19615244;
      var19 = var10003;
      var300[var10002] = (char)((var19 | var20) & ~(var19 & var20));
      var10002 = (int)-892821708049775327L;
      var20 = 121804683;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = 212669103;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var10003 = (int)4551514708976145926L;
      var20 = 463353474;
      var19 = var10003;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = 1373837328;
      var19 = var10003;
      var300[var10002] = (char)((var19 | var20) - (var19 & var20));
      var10002 = (int)-480770039099313870L;
      var20 = 1913381642;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = 719213118;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var10003 = (int)4256035642798437105L;
      var20 = -1510723862;
      var19 = var10003;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = 26499034;
      var19 = var10003;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = -1385523466;
      var19 = 1532138081;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = -164068434;
      var19 = var10003;
      var300[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      var20 = -1679664311;
      var19 = 133261450;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = -1676463164;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = 1940278629;
      var19 = -1748021461;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = -462876042;
      var19 = var10003;
      var300[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      var20 = -1096920334;
      var19 = -450259698;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = 1538770932;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var10003 = (int)2409947772424404410L;
      var20 = 985364155;
      var19 = var10003;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = -1629647774;
      var19 = var10003;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var10003 = (int)-9007914493725885162L;
      var20 = 1844467988;
      var19 = var10003;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = 529590022;
      var19 = var10003;
      var300[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      var10002 = (int)-3357570871604791689L;
      var20 = -242160304;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = 677174062;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = -370767725;
      var19 = -1545273469;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1241662499;
      var19 = var10003;
      var300[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      char[] var9 = var300;
      var20 = 271572564;
      var19 = -953982666;
      var10000 = var19 + var20 - 2 * (var19 & var20);
      var20 = -687030430;
      var19 = var10000;

      for (int var10 = var19 + var20 - 2 * (var19 & var20); var10 < var6.length; var10++) {
         char var372 = var6[var10];
         char var269 = var8[var10 % var8.length];
         char var133 = var372;
         var7[var10] = (char)((var133 | var269) & (~var133 | ~var269));
      }

      char[] var21 = new char[var7.length];
      var10000 = (int)-8367542691957460201L;
      var20 = 1958674288;
      var19 = var10000;
      var10000 = (var19 | var20) & (~var19 | ~var20);
      var20 = 1313557607;
      var19 = var10000;

      for (int var11 = (var19 | var20) - (var19 & var20); var11 < var6.length; var11++) {
         char var373 = var7[var11];
         char var272 = var9[var11 % var9.length];
         char var136 = var373;
         var21[var11] = (char)((var136 | var272) & (~var136 | ~var272));
      }

      String var22 = new String(var21);
      int var12 = var22.hashCode();
      var20 = var5;
      var19 = var3;
      var10000 = var19 - var20;
      var20 = var2;
      var19 = var10000;
      int var13 = (var19 ^ var20) - 2 * (~var19 & var20);
      char[] var14 = var0.toCharArray();
      char[] var15 = new char[var14.length];
      var20 = -1870581989;
      var19 = -1026547541;
      var10000 = var19 & ~var20 | ~var19 & var20;
      var20 = 1381044144;
      var19 = var10000;

      for (int var16 = (var19 | var20) - (var19 & var20); var16 < var15.length; var16++) {
         String var306 = "ega";
         var10000 = (int)6680924251295398635L;
         var20 = -264028389;
         var19 = var10000;
         var10000 = (var19 | var20) - (var19 & var20);
         var20 = 802517955;
         var19 = var10000;
         int var18 = (var19 | var20) - (var19 & var20);
         var20 = 1399882849;
         var19 = 608466081;
         var10000 = var19 & ~var20 | ~var19 & var20;
         var20 = 977690150;
         var19 = var10000;
         var10000 = var19 + var20 - 2 * (var19 & var20);
         int var10001 = (int)6021181602851488195L;
         var20 = 1062927027;
         var19 = var10001;
         var10001 = (var19 | var20) - (var19 & var20);
         var20 = 1234273086;
         var19 = var10001;
         var20 = var19 + var20 - 2 * (var19 & var20);
         var19 = var10000;
         var10000 = (var19 | var20) + (var19 & var20);
         var10000 = (int)-4256761268925119190L;
         var20 = 1872082710;
         var19 = var10000;
         var10000 = var19 + var20 - 2 * (var19 & var20);
         var20 = -1255010291;
         var19 = var10000;
         if ((var19 & ~var20 | ~var19 & var20) >= var18) {
            var10000 = (int)-342148917274663060L;
            var20 = -926408189;
            var19 = var10000;
            var10000 = (var19 | var20) & (~var19 | ~var20);
            var20 = 1697860281;
            var19 = var10000;
            var10000 = (var19 & ~var20 | ~var19 & var20) * (var19 & ~var20 | ~var19 & var20);
            var10000 = (int)6817048750270051586L;
            var20 = 2098600106;
            var19 = var10000;
            var10000 = var19 + var20 - 2 * (var19 & var20);
            var20 = 1097202915;
            var19 = var10000;
            var18 = var19 + var20 - 2 * (var19 & var20);
         }

         var20 = 267173527;
         var19 = 1008873508;
         var10001 = var19 + var20 - 2 * (var19 & var20);
         var20 = 869174961;
         var19 = var10001;
         switch (var16 % (var19 + var20 - 2 * (var19 & var20))) {
            case 0:
               var20 = var12;
               var19 = var13;
               var10002 = var19 + var20 - 2 * (var19 & var20);
               char var295 = var14[var16];
               var19 = var10002;
               var15[var16] = (char)((var19 | var295) & ~(var19 & var295));
               break;
            case 1:
               var20 = var13;
               var19 = var5;
               var10002 = (var19 | var20) & (~var19 | ~var20);
               char var293 = var14[var16];
               var19 = var10002;
               var15[var16] = (char)(var19 & ~var293 | ~var19 & var293);
         }
      }

      return new String(var15);
   }

   private static class TrailPoint {
      final Vec3d a;
      final long b;
      public static int c;
      public static boolean d;

      TrailPoint(Vec3d var1) {
         this(var1, System.currentTimeMillis());
      }

      TrailPoint(Vec3d var1, long var2) {
         this.a = var1;
         this.b = var2;
      }

      boolean a(int var1) {
         int var11;
         if (System.currentTimeMillis() - this.b <= var1) {
            var11 = (int)-5754858268509589987L;
            int var3 = 761393727;
            int var2 = var11;
            var11 = var2 & ~var3 | ~var2 & var3;
            var3 = 430300194;
            var2 = var11;
            var11 = var2 & ~var3 | ~var2 & var3;
         } else {
            int var8 = 946587890;
            int var5 = 2070564212;
            var11 = var5 + var8 - 2 * (var5 & var8);
            var8 = 1124173191;
            var5 = var11;
            var11 = (var5 | var8) & (~var5 | ~var8);
         }

         return pulse.Bool.from(var11);
      }

      public static String a(String var0, String var1, int var2, int var3, int var4, int var5) {
         char[] var6 = var1.toCharArray();
         char[] var7 = new char[var6.length];
         int var10000 = (int)6947039885946306738L;
         int var18 = -804596797;
         int var17 = var10000;
         var10000 = (var17 | var18) & ~(var17 & var18);
         var18 = -230288517;
         var17 = var10000;
         char[] var258 = new char[(var17 | var18) - (var17 & var18)];
         int var10002 = (int)-8775348167364806120L;
         var18 = -699124950;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = 831277362;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = 101244786;
         var17 = 315889555;
         int var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = 349995219;
         var17 = var10003;
         var258[var10002] = (char)((var17 | var18) - (var17 & var18));
         var10002 = (int)-1107853276048406867L;
         var18 = 1863221936;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = -957397988;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = -1570312666;
         var17 = 1981058807;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = -730709164;
         var17 = var10003;
         var258[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         var10002 = (int)-2364237345715825476L;
         var18 = 817804202;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = 995878676;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var10003 = (int)4646919775272986006L;
         var18 = -307814776;
         var17 = var10003;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = -1522181992;
         var17 = var10003;
         var258[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         var18 = 1024541840;
         var17 = 946753206;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = 92211749;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = 1106524487;
         var17 = -1934336784;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = 1309326662;
         var17 = var10003;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         int var10004 = (int)8576070795134856702L;
         var18 = -1697022657;
         var17 = var10004;
         var10004 = (var17 | var18) & ~(var17 & var18);
         var18 = 1381035278;
         var17 = var10004;
         var18 = (var17 | var18) - (var17 & var18);
         var17 = var10003;
         var10003 = var17 - ~var18 - 1;
         var10003 = (int)7459473136781494692L;
         var18 = -758647416;
         var17 = var10003;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = 329868351;
         var17 = var10003;
         var258[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var18 = -1291282820;
         var17 = -1597487392;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = 331403416;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = -731251363;
         var17 = -853428439;
         var10004 = var17 & ~var18 | ~var17 & var18;
         var18 = 424168054;
         var17 = var10004;
         var10004 = (var17 | var18) & (~var17 | ~var18);
         var10003 = (int)8287014224935172548L;
         var18 = -1537204294;
         var17 = var10003;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = 1371420507;
         var17 = var10003;
         var258[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         var10002 = (int)4316638787402824372L;
         var18 = -1184757064;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = -206344183;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var10003 = (int)2579441178140868576L;
         var18 = -237638775;
         var17 = var10003;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = 936137195;
         var17 = var10003;
         var258[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         var10002 = (int)2104274576660076862L;
         var18 = -775209758;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = -897669670;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = -1511603238;
         var17 = 1865785566;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = -892114409;
         var17 = var10003;
         var258[var10002] = (char)((var17 | var18) - (var17 & var18));
         var10002 = (int)-9058653335804507050L;
         var18 = 1650051906;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = 1303299859;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var10003 = (int)1486791268561383305L;
         var18 = 1490531292;
         var17 = var10003;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = 1360488567;
         var17 = var10003;
         var258[var10002] = (char)((var17 | var18) - (var17 & var18));
         var18 = -607889818;
         var17 = 1926537907;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = -1458506531;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = -717955842;
         var17 = 1725674725;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = -1276157880;
         var17 = var10003;
         var258[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var10002 = (int)-5747903671723895657L;
         var18 = 569761089;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = 1380846047;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = -1229591824;
         var17 = 480149054;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = -1439984662;
         var17 = var10003;
         var258[var10002] = (char)((var17 | var18) & ~(var17 & var18));
         char[] var8 = var258;
         var18 = -162047894;
         var17 = 947714290;
         var10000 = (var17 | var18) - (var17 & var18);
         var18 = -836001646;
         var17 = var10000;
         char[] var260 = new char[(var17 | var18) - (var17 & var18)];
         var10002 = (int)2691278749696106220L;
         var18 = -1882633869;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = 83416991;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = 2135094499;
         var17 = 1082365199;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = 1069623756;
         var17 = var10003;
         var260[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var18 = -1497986785;
         var17 = 1014948683;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = -1698141611;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = 1090350524;
         var17 = -1359942211;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = 352422788;
         var17 = var10003;
         var10003 = (var17 & ~var18 | ~var17 & var18) * (var17 & ~var18 | ~var17 & var18);
         var18 = 1584375207;
         var17 = -1076041811;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = -508312055;
         var17 = var10003;
         var260[var10002] = (char)((var17 | var18) & ~(var17 & var18));
         var10002 = (int)1218911994062095757L;
         var18 = -1055126846;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = -476786867;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = 1254590537;
         var17 = -24761333;
         var10004 = (var17 | var18) & ~(var17 & var18);
         var18 = -1270766527;
         var17 = var10004;
         var10004 = (var17 | var18) & (~var17 | ~var18);
         var18 = -853338655;
         var17 = -1407266727;
         var10004 = (var17 | var18) & (~var17 | ~var18);
         var18 = 1631438266;
         var17 = var10004;
         var10004 = var17 + var18 - 2 * (var17 & var18);
         var10003 = (int)5819010941095870608L;
         var18 = 987736334;
         var17 = var10003;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = -486625587;
         var17 = var10003;
         var260[var10002] = (char)((var17 | var18) - (var17 & var18));
         var10002 = (int)-4154347032717150582L;
         var18 = 846858168;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = 1531457841;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = 1331683652;
         var17 = -1877670224;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = -548741130;
         var17 = var10003;
         var260[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var10002 = (int)4389589469083788863L;
         var18 = -1604848166;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = -690023455;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var10003 = (int)8742114263195429191L;
         var18 = 1807800136;
         var17 = var10003;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = -1604106673;
         var17 = var10003;
         var260[var10002] = (char)((var17 | var18) & ~(var17 & var18));
         var10002 = (int)-6809152631273287275L;
         var18 = 1759399134;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = 2002017614;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = 1534491470;
         var17 = 901068695;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = 1858303053;
         var17 = var10003;
         var260[var10002] = (char)((var17 | var18) & ~(var17 & var18));
         var18 = 1973084640;
         var17 = -1823003761;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = -422720919;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var10004 = (int)6676959474943224417L;
         var18 = -181681204;
         var17 = var10004;
         var10004 = var17 & ~var18 | ~var17 & var18;
         var18 = -964646489;
         var17 = var10004;
         var10004 = (var17 | var18) & ~(var17 & var18);
         var18 = 751034868;
         var17 = -589795462;
         var10004 = var17 + var18 - 2 * (var17 & var18);
         var18 = -266629504;
         var17 = var10004;
         var10004 = (var17 | var18) - (var17 & var18);
         var10003 = (int)5837036439146172759L;
         var18 = -1003222588;
         var17 = var10003;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = -328917078;
         var17 = var10003;
         var260[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         var10002 = (int)-7356838540247045103L;
         var18 = 1920669718;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = 416347136;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = -181539709;
         var17 = 1612716796;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = -1794251193;
         var17 = var10003;
         var260[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         var10002 = (int)-7345615103048027725L;
         var18 = -1817047754;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = 362937485;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = 2050721099;
         var17 = -61236095;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = -1172205855;
         var17 = var10003;
         var10003 = (var17 & ~var18 | ~var17 & var18) * (var17 & ~var18 | ~var17 & var18);
         var10003 = (int)-4003177708634920270L;
         var18 = -2057999574;
         var17 = var10003;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = -178765156;
         var17 = var10003;
         var260[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var18 = 650720516;
         var17 = -1454233373;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = -1885659666;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = -1619313855;
         var17 = 1466852348;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = -938120306;
         var17 = var10003;
         var260[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         char[] var9 = var260;
         var18 = -1991207818;
         var17 = -1543889937;
         var10000 = (var17 | var18) & ~(var17 & var18);
         var18 = 715820953;
         var17 = var10000;

         for (int var10 = (var17 | var18) & ~(var17 & var18); var10 < var6.length; var10++) {
            char var320 = var6[var10];
            char var243 = var8[var10 % var8.length];
            char var125 = var320;
            var7[var10] = (char)(var125 & ~var243 | ~var125 & var243);
         }

         char[] var19 = new char[var7.length];
         var10000 = (int)1756938230843991147L;
         var18 = 879016339;
         var17 = var10000;
         var10000 = (var17 | var18) & (~var17 | ~var18);
         var18 = 296148472;
         var17 = var10000;

         for (int var11 = (var17 | var18) - (var17 & var18); var11 < var6.length; var11++) {
            char var321 = var7[var11];
            char var246 = var9[var11 % var9.length];
            char var128 = var321;
            var19[var11] = (char)((var128 | var246) - (var128 & var246));
         }

         String var20 = new String(var19);
         int var12 = var20.hashCode();
         var18 = var5;
         var17 = var3;
         var10000 = (var17 & ~var18) - (~var17 & var18);
         var18 = var2;
         var17 = var10000;
         int var13 = 2 * (var17 & ~var18) - (var17 ^ var18);
         char[] var14 = var0.toCharArray();
         char[] var15 = new char[var14.length];
         var10000 = (int)1444660779432364429L;
         var18 = -177685291;
         var17 = var10000;
         var10000 = var17 + var18 - 2 * (var17 & var18);
         var18 = -697698984;
         var17 = var10000;

         for (int var16 = (var17 | var18) & (~var17 | ~var18); var16 < var15.length; var16++) {
            var18 = 282945141;
            var17 = 537245183;
            int var10001 = var17 & ~var18 | ~var17 & var18;
            var18 = 819516296;
            var17 = var10001;
            switch (var16 % ((var17 | var18) & ~(var17 & var18))) {
               case 0:
                  var18 = var12;
                  var17 = var13;
                  var10002 = var17 + var18 - 2 * (var17 & var18);
                  char var256 = var14[var16];
                  var17 = var10002;
                  var15[var16] = (char)(var17 + var256 - 2 * (var17 & var256));
                  break;
               case 1:
                  var18 = var13;
                  var17 = var5;
                  var10002 = (var17 | var18) & ~(var17 & var18);
                  char var254 = var14[var16];
                  var17 = var10002;
                  var15[var16] = (char)((var17 | var254) & (~var17 | ~var254));
            }
         }

         return new String(var15);
      }
   }
}
