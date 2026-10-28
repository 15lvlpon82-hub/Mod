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
import java.util.ArrayList;
import java.util.Optional;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadLocalRandom;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.block.BlockState;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat.DrawMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShape;
import org.joml.Matrix4f;
import org.lwjgl.opengl.GL11;

@ModuleInfo(a = "Jump Circles", b = "Отображает круги при прыжке игрока", c = ModuleCategory.VISUALS)
public class JumpCircles extends ClientModule {
   private static final Identifier JUMP_TEXTURE = Identifier.of("pulse", "textures/jump.png");
   private final ModeSetting a;
   private final BooleanSetting b;
   private final SettingGroup e;
   private final SliderSetting f;
   private final SliderSetting g;
   private final BooleanSetting h;
   private final ColorSetting i;
   private final SettingGroup j;
   private final ModeSetting k;
   private final ModeSetting l;
   private final SliderSetting m;
   private final SliderSetting n;
   private final SliderSetting o;
   private final SliderSetting p;
   private final BooleanSetting q;
   private final ColorSetting r;
   private final SettingGroup s;
   private final SliderSetting t;
   private final SliderSetting u;
   private final SliderSetting v;
   private final BooleanSetting w;
   private final SliderSetting x;
   private final BooleanSetting y;
   private final ModeSetting z;
   private final SliderSetting A;
   private final ModeSetting B;
   private final SliderSetting C;
   private final SliderSetting D;
   private final BooleanSetting E;
   private final ColorSetting F;
   private final Identifier G;
   private final Queue<JumpCircles.PendingCircle> H;
   private final Queue<JumpCircles.CircleInstance> I;
   private final Queue<JumpCircles.CircleInstance> J;

   public JumpCircles() {
      int var2 = -2045249209;
      int var1 = 498053826;
      int var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = -5263118;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      int var10006 = (int)-1138879771969299760L;
      var2 = 1571401070;
      var1 = var10006;
      var10006 = (var1 | var2) - (var1 & var2);
      var2 = 686437240;
      var1 = var10006;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1715736360;
      var1 = -1044798553;
      int var10007 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1340904326;
      var1 = var10007;
      var10007 = (var1 | var2) & ~(var1 & var2);
      var2 = 1883907229;
      var1 = 1853636601;
      int var10008 = var1 + var2 - 2 * (var1 & var2);
      var2 = 503831993;
      var1 = var10008;
      String var10003 = c(
         "ﴥ삚ﴳ삗ﴹ쒏ﴺ샯﵎삙﴿삟", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳", var10005, var10006, var10007, (var1 | var2) & (~var1 | ~var2)
      );
      int var10004 = (int)8603199738325412681L;
      var2 = -656781045;
      var1 = var10004;
      var10004 = (var1 | var2) - (var1 & var2);
      var2 = 1447361094;
      var1 = var10004;
      String[] var1050 = new String[(var1 | var2) & ~(var1 & var2)];
      var10006 = (int)3797144891397396937L;
      var2 = 1425717451;
      var1 = var10006;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1217716482;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      int var10009 = (int)-2567531580090287212L;
      var2 = 765164960;
      var1 = var10009;
      var10009 = (var1 | var2) - (var1 & var2);
      var2 = -762151613;
      var1 = var10009;
      var10009 = var1 + var2 - 2 * (var1 & var2);
      int var10010 = (int)809520174764993907L;
      var2 = -1705126464;
      var1 = var10010;
      var10010 = (var1 | var2) & (~var1 | ~var2);
      var2 = 496326799;
      var1 = var10010;
      var10010 = var1 & ~var2 | ~var1 & var2;
      int var10011 = (int)-5769936387193357654L;
      var2 = -2128067993;
      var1 = var10011;
      var10011 = (var1 | var2) & ~(var1 & var2);
      var2 = -1206537853;
      var1 = var10011;
      var10011 = var1 & ~var2 | ~var1 & var2;
      int var10012 = (int)-7441471154886719104L;
      var2 = -1659848009;
      var1 = var10012;
      var10012 = (var1 | var2) & (~var1 | ~var2);
      var2 = -611692188;
      var1 = var10012;
      var1050[var10006] = c(
         "ﴧꐟ﴾ꑭ﴿ꐟ拉ꐛ﵅ꑢﴶ", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳", var10009, var10010, var10011, var1 + var2 - 2 * (var1 & var2)
      );
      var10006 = (int)2747323616875536453L;
      var2 = 840334029;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var2 = 956177033;
      var1 = var10006;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var2 = -480207140;
      var1 = -1886285919;
      var10009 = (var1 | var2) & ~(var1 & var2);
      var2 = 149350922;
      var1 = var10009;
      var10009 = (var1 | var2) - (var1 & var2);
      var10010 = (int)-8825616325508135363L;
      var2 = -228292240;
      var1 = var10010;
      var10010 = (var1 | var2) - (var1 & var2);
      var2 = 1760323724;
      var1 = var10010;
      var10010 = var1 + var2 - 2 * (var1 & var2);
      var10011 = (int)-1972487621709034355L;
      var2 = 743129282;
      var1 = var10011;
      var10011 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1128819907;
      var1 = var10011;
      var10011 = (var1 | var2) & (~var1 | ~var2);
      var2 = 339287021;
      var1 = 1225131293;
      var10012 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1568339752;
      var1 = var10012;
      var1050[var10006] = c(
         "ﴧ\uef94﴾\uefe6﴿\uef94拉\uefedﴵ\uefeb﵇\uef92﵃\uefe1",
         "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳",
         var10009,
         var10010,
         var10011,
         var1 + var2 - 2 * (var1 & var2)
      );
      var10006 = (int)-7728128089635757842L;
      var2 = 1029112931;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var2 = -1679956849;
      var1 = var10006;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var2 = -95502504;
      var1 = 303151792;
      var10009 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1941373281;
      var1 = var10009;
      var10009 = var1 + var2 - 2 * (var1 & var2);
      var10010 = (int)6824880723720923839L;
      var2 = 506162774;
      var1 = var10010;
      var10010 = var1 + var2 - 2 * (var1 & var2);
      var2 = 225987460;
      var1 = var10010;
      var10010 = (var1 | var2) & ~(var1 & var2);
      var10011 = (int)-2939437264236129045L;
      var2 = 1953835533;
      var1 = var10011;
      var10011 = (var1 | var2) & ~(var1 & var2);
      var2 = -1578986506;
      var1 = var10011;
      var10011 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1693344360;
      var1 = -1554596535;
      var10012 = (var1 | var2) & ~(var1 & var2);
      var2 = -946205019;
      var1 = var10012;
      var1050[var10006] = c(
         "ﴟힶ﵆ퟅ拉폝拉ힱﴵힷ﵇ퟎ﵃ힽ", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳", var10009, var10010, var10011, (var1 | var2) - (var1 & var2)
      );
      var10006 = (int)4906097771823524786L;
      var2 = -1563101278;
      var1 = var10006;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var2 = -1472947181;
      var1 = var10006;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var10009 = (int)5354907774745943669L;
      var2 = 1461301248;
      var1 = var10009;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var2 = -709110526;
      var1 = var10009;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var10010 = (int)8781472048773432871L;
      var2 = 1425685330;
      var1 = var10010;
      var10010 = var1 & ~var2 | ~var1 & var2;
      var2 = -592561946;
      var1 = var10010;
      var10010 = (var1 | var2) - (var1 & var2);
      var2 = 1440931484;
      var1 = 2028992752;
      var10011 = (var1 | var2) & (~var1 | ~var2);
      var2 = 769005715;
      var1 = var10011;
      var10011 = (var1 | var2) - (var1 & var2);
      var2 = 1651879708;
      var1 = 1755497325;
      var10012 = var1 + var2 - 2 * (var1 & var2);
      var2 = 181464027;
      var1 = var10012;
      var1050[var10006] = c(
         "ﴔ臣ﴻ臢ﴻ自ﴵ膗拉自ﴻ臣ﴸ臨", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳", var10009, var10010, var10011, var1 & ~var2 | ~var1 & var2
      );
      var2 = 1336384051;
      var1 = -420048322;
      var10007 = (var1 | var2) & (~var1 | ~var2);
      var2 = -850988166;
      var1 = var10007;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      var10008 = (int)3116125374841381261L;
      var2 = -1281972576;
      var1 = var10008;
      var10008 = (var1 | var2) & (~var1 | ~var2);
      var2 = -665734300;
      var1 = var10008;
      var10008 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1704794484;
      var1 = 835898296;
      var10009 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1299111057;
      var1 = var10009;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var2 = -292352643;
      var1 = -205092281;
      var10010 = var1 + var2 - 2 * (var1 & var2);
      var2 = 486863194;
      var1 = var10010;
      this.a = new ModeSetting(
         var10003,
         var1050,
         c("ﴧ瀬﴾灞﴿瀬拉瀨﵅灑ﴶ", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳", var10007, var10008, var10009, (var1 | var2) & ~(var1 & var2))
      );
      var2 = -843584564;
      var1 = 1084951212;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = -385148393;
      var1 = var10005;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var10006 = (int)2896122987618577505L;
      var2 = -730388874;
      var1 = var10006;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1242469008;
      var1 = var10006;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var2 = -894068366;
      var1 = 979527671;
      var10007 = (var1 | var2) - (var1 & var2);
      var2 = -110193321;
      var1 = var10007;
      var10007 = (var1 | var2) & (~var1 | ~var2);
      var2 = -2001001616;
      var1 = 346840909;
      var10008 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1673664861;
      var1 = var10008;
      var10003 = c(
         "ﴚ鳒﴿鳜ﴲ鲧ﴷ鳜﵇鲠拉鳒﵇飌ﴺ鳙﵅鳞ﴻ鳟ﴻ飌﴾鳔﵃鳜",
         "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳",
         var10005,
         var10006,
         var10007,
         (var1 | var2) - (var1 & var2)
      );
      var10004 = (int)5860167523072864191L;
      var2 = -168099035;
      var1 = var10004;
      var10004 = var1 & ~var2 | ~var1 & var2;
      var2 = -1527583589;
      var1 = var10004;
      this.b = new BooleanSetting(var10003, pulse.Bool.from((var1 | var2) & (var1 ^ -1 | var2 ^ -1)));
      var2 = 1882478543;
      var1 = -950315510;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var2 = -747046222;
      var1 = var10005;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var10006 = (int)-255812480227501583L;
      var2 = 180406503;
      var1 = var10006;
      var10006 = (var1 | var2) - (var1 & var2);
      var2 = 1220095814;
      var1 = var10006;
      var10006 = (var1 | var2) - (var1 & var2);
      var2 = -301429756;
      var1 = 1529091045;
      var10007 = (var1 | var2) - (var1 & var2);
      var2 = -1272843976;
      var1 = var10007;
      var10007 = (var1 | var2) & ~(var1 & var2);
      var10008 = (int)-48565228767720557L;
      var2 = 584714468;
      var1 = var10008;
      var10008 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1541815536;
      var1 = var10008;
      this.e = new SettingGroup(
            c("ﴟ處﵆蘦ﴽ", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳", var10005, var10006, var10007, (var1 | var2) & (~var1 | ~var2))
         )
         .a(
            () -> {
               int var2x = -1342670660;
               int var1x = 1319816542;
               int var10003x = (var1x | var2x) - (var1x & var2x);
               var2x = -2059055467;
               var1x = var10003x;
               var10003x = (var1x | var2x) - (var1x & var2x);
               int var10004x = (int)-8002490753285759275L;
               var2x = -717036870;
               var1x = var10004x;
               var10004x = (var1x | var2x) & ~(var1x & var2x);
               var2x = 2004139582;
               var1x = var10004x;
               var10004x = var1x + var2x - 2 * (var1x & var2x);
               var2x = -810799506;
               var1x = 251615125;
               int var10005x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = -771386016;
               var1x = var10005x;
               var10005x = (var1x | var2x) & (~var1x | ~var2x);
               int var10006x = (int)1967633452882895848L;
               var2x = -966719371;
               var1x = var10006x;
               var10006x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = -1994945450;
               var1x = var10006x;
               return this.a
                  .b(
                     c(
                        "ꁢ粄ꀻ糷ꑘ磯ꑘ粃ꁈ粅ꀺ糼ꀾ粏",
                        "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳",
                        var10003x,
                        var10004x,
                        var10005x,
                        (var1x | var2x) & (~var1x | ~var2x)
                     )
                  );
            }
         );
      var10005 = (int)6518646967021373587L;
      var2 = 982432849;
      var1 = var10005;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = 1273352117;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var10006 = (int)-2337734486830898764L;
      var2 = 1656075268;
      var1 = var10006;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var2 = 258119116;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var2 = -526395816;
      var1 = 637261600;
      var10007 = (var1 | var2) & ~(var1 & var2);
      var2 = -629015461;
      var1 = var10007;
      var10007 = (var1 | var2) - (var1 & var2);
      var10008 = (int)-7266858775151041192L;
      var2 = 85476917;
      var1 = var10008;
      var10008 = var1 & ~var2 | ~var1 & var2;
      var2 = 255320574;
      var1 = var10008;
      this.f = new SliderSetting(
            c("ﴥ蓑ﴱ蓙﵆蒠", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳", var10005, var10006, var10007, var1 + var2 - 2 * (var1 & var2)),
            1.0F,
            0.5F,
            2.0F,
            0.1F
         )
         .a(
            () -> {
               int var10003x = (int)-4521759426965201574L;
               int var2x = -1748708580;
               int var1x = var10003x;
               var10003x = (var1x | var2x) - (var1x & var2x);
               var2x = -668715727;
               var1x = var10003x;
               var10003x = (var1x | var2x) & (~var1x | ~var2x);
               int var10004x = (int)5124796711067535508L;
               var2x = -975653044;
               var1x = var10004x;
               var10004x = (var1x | var2x) & ~(var1x & var2x);
               var2x = -1495935993;
               var1x = var10004x;
               var10004x = (var1x | var2x) - (var1x & var2x);
               var2x = -616780660;
               var1x = 1930585757;
               int var10005x = (var1x | var2x) & ~(var1x & var2x);
               var2x = -1280044444;
               var1x = var10005x;
               var10005x = (var1x | var2x) - (var1x & var2x);
               var2x = -3753033;
               var1x = -511310128;
               int var10006x = var1x + var2x - 2 * (var1x & var2x);
               var2x = 503344191;
               var1x = var10006x;
               if (!this.a
                  .b(
                     c(
                        "ꁅ詶ꁜ訄ꁝ詶ꑇ該ꀧ訋ꁔ",
                        "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳",
                        var10003x,
                        var10004x,
                        var10005x,
                        (var1x | var2x) & (~var1x | ~var2x)
                     )
                  )) {
                  var10003x = (int)-685698663826493019L;
                  var2x = -1025426475;
                  var1x = var10003x;
                  var10003x = var1x & ~var2x | ~var1x & var2x;
                  var2x = 425701639;
                  var1x = var10003x;
                  var10003x = var1x & ~var2x | ~var1x & var2x;
                  var10004x = (int)7484217278225165741L;
                  var2x = -610675295;
                  var1x = var10004x;
                  var10004x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = 1339371884;
                  var1x = var10004x;
                  var10004x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = 698611401;
                  var1x = -1956149834;
                  var10005x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = -1257736272;
                  var1x = var10005x;
                  var10005x = var1x & ~var2x | ~var1x & var2x;
                  var10006x = (int)2770591666493366606L;
                  var2x = 1181970911;
                  var1x = var10006x;
                  var10006x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = 1153056328;
                  var1x = var10006x;
                  if (!this.a
                     .b(
                        c(
                           "ꁽ떉ꀤ뗺ꑇ뇢ꑇ떎ꁗ떈ꀥ뗱ꀡ떂",
                           "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳",
                           var10003x,
                           var10004x,
                           var10005x,
                           (var1x | var2x) & (~var1x | ~var2x)
                        )
                     )) {
                     var2x = -2058922910;
                     var1x = 1404501689;
                     int var42x = var1x & ~var2x | ~var1x & var2x;
                     var2x = -688805157;
                     var1x = var42x;
                     return Boolean.valueOf(pulse.Bool.from((var1x | var2x) & ~(var1x & var2x)));
                  }
               }

               var2x = -1162388464;
               var1x = -1717067027;
               int var10000 = var1x & ~var2x | ~var1x & var2x;
               var2x = 588316412;
               var1x = var10000;
               return Boolean.valueOf(pulse.Bool.from((var1x | var2x) & ~(var1x & var2x)));
            }
         );
      var10005 = (int)9062952443758004093L;
      var2 = -1711020466;
      var1 = var10005;
      var10005 = (var1 | var2) - (var1 & var2);
      var2 = 476076612;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var10006 = (int)-976775484858064341L;
      var2 = -483902884;
      var1 = var10006;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var2 = 341250054;
      var1 = var10006;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var2 = -510351272;
      var1 = 701440456;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var2 = -736065896;
      var1 = var10007;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      var10008 = (int)6603121973942842937L;
      var2 = -554692884;
      var1 = var10008;
      var10008 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1882131875;
      var1 = var10008;
      this.g = new SliderSetting(
            c("ﴤ賀ﴻ貺ﴻ費﵇貶", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳", var10005, var10006, var10007, (var1 | var2) & ~(var1 & var2)),
            2.0F,
            0.5F,
            5.0F,
            0.1F
         )
         .a(
            () -> {
               int var2x = 185128926;
               int var1x = -551502957;
               int var10003x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = -1338009798;
               var1x = var10003x;
               var10003x = var1x & ~var2x | ~var1x & var2x;
               int var10004x = (int)2705464652696558896L;
               var2x = 1899281991;
               var1x = var10004x;
               var10004x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = -1087935594;
               var1x = var10004x;
               var10004x = (var1x | var2x) & (~var1x | ~var2x);
               int var10005x = (int)-8927290959007927954L;
               var2x = -236074699;
               var1x = var10005x;
               var10005x = var1x & ~var2x | ~var1x & var2x;
               var2x = 224895975;
               var1x = var10005x;
               var10005x = (var1x | var2x) - (var1x & var2x);
               int var10006x = (int)-623956870058911158L;
               var2x = 1388954198;
               var1x = var10006x;
               var10006x = var1x & ~var2x | ~var1x & var2x;
               var2x = 108099141;
               var1x = var10006x;
               if (!this.a
                  .b(
                     c(
                        "ꁄ땶ꁝ딄ꁜ땶ꑆ땲ꀦ딋ꁕ",
                        "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳",
                        var10003x,
                        var10004x,
                        var10005x,
                        (var1x | var2x) & (~var1x | ~var2x)
                     )
                  )) {
                  var10003x = (int)6399428560209299871L;
                  var2x = -184076607;
                  var1x = var10003x;
                  var10003x = var1x & ~var2x | ~var1x & var2x;
                  var2x = 567477289;
                  var1x = var10003x;
                  var10003x = var1x + var2x - 2 * (var1x & var2x);
                  var10004x = (int)4452538412264185163L;
                  var2x = 1391166002;
                  var1x = var10004x;
                  var10004x = (var1x | var2x) - (var1x & var2x);
                  var2x = -1888423094;
                  var1x = var10004x;
                  var10004x = (var1x | var2x) & (~var1x | ~var2x);
                  var10005x = (int)-3512964539989920596L;
                  var2x = 1309113229;
                  var1x = var10005x;
                  var10005x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = 1207294526;
                  var1x = var10005x;
                  var10005x = var1x & ~var2x | ~var1x & var2x;
                  var10006x = (int)-4270145148642363556L;
                  var2x = 214220369;
                  var1x = var10006x;
                  var10006x = var1x & ~var2x | ~var1x & var2x;
                  var2x = -2023778138;
                  var1x = var10006x;
                  if (!this.a
                     .b(
                        c(
                           "ꁼૺꀥઉꑆຑꑆ૽ꁖૻꀤંꀠ૱",
                           "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳",
                           var10003x,
                           var10004x,
                           var10005x,
                           var1x & ~var2x | ~var1x & var2x
                        )
                     )) {
                     int var42x = (int)3798597819853918609L;
                     var2x = 1140802707;
                     var1x = var42x;
                     var42x = (var1x | var2x) & (~var1x | ~var2x);
                     var2x = 587732226;
                     var1x = var42x;
                     return Boolean.valueOf(pulse.Bool.from((var1x | var2x) & (~var1x | ~var2x)));
                  }
               }

               var2x = -842528505;
               var1x = 1636422412;
               int var10000 = (var1x | var2x) & (~var1x | ~var2x);
               var2x = -1404970486;
               var1x = var10000;
               return Boolean.valueOf(pulse.Bool.from(var1x & ~var2x | ~var1x & var2x));
            }
         );
      var2 = 582972599;
      var1 = -1213141216;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = -250060576;
      var1 = var10005;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = 1763131449;
      var1 = 1354190922;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var2 = -379132723;
      var1 = var10006;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1091943025;
      var1 = 1967295989;
      var10007 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1039016833;
      var1 = var10007;
      var10007 = (var1 | var2) - (var1 & var2);
      var2 = -1979838569;
      var1 = -36951845;
      var10008 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1952633241;
      var1 = var10008;
      var10003 = c(
         "ﴣ\uf095ﴰ\uf0e5拉\uf09d﴾\uf09fﴰ\uf09a﵇\uf097",
         "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳",
         var10005,
         var10006,
         var10007,
         (var1 | var2) & ~(var1 & var2)
      );
      var2 = -2112951385;
      var1 = -29190672;
      var10004 = var1 + var2 - 2 * (var1 & var2);
      var2 = 2085387862;
      var1 = var10004;
      this.h = new BooleanSetting(var10003, pulse.Bool.from(var1 & (var2 ^ -1) | (var1 ^ -1) & var2))
         .a(
            () -> {
               int var10003x = (int)-1666227225116746559L;
               int var2x = 251503678;
               int var1x = var10003x;
               var10003x = var1x + var2x - 2 * (var1x & var2x);
               var2x = -650214520;
               var1x = var10003x;
               var10003x = var1x & ~var2x | ~var1x & var2x;
               int var10004x = (int)9124364000556806884L;
               var2x = -11185532;
               var1x = var10004x;
               var10004x = var1x + var2x - 2 * (var1x & var2x);
               var2x = 1741923408;
               var1x = var10004x;
               var10004x = (var1x | var2x) - (var1x & var2x);
               var2x = 352385293;
               var1x = -376776812;
               int var10005x = (var1x | var2x) - (var1x & var2x);
               var2x = -180741580;
               var1x = var10005x;
               var10005x = (var1x | var2x) - (var1x & var2x);
               int var10006x = (int)-4152634053397119276L;
               var2x = 174679344;
               var1x = var10006x;
               var10006x = (var1x | var2x) - (var1x & var2x);
               var2x = 2004431427;
               var1x = var10006x;
               if (!this.a
                  .b(
                     c(
                        "ꁇ\uf28bꁞ\uf2f9ꁟ\uf28bꑅ\uf28fꀥ\uf2f6ꁖ",
                        "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳",
                        var10003x,
                        var10004x,
                        var10005x,
                        var1x + var2x - 2 * (var1x & var2x)
                     )
                  )) {
                  var2x = 1574818189;
                  var1x = -1438199079;
                  var10003x = var1x & ~var2x | ~var1x & var2x;
                  var2x = -1819477981;
                  var1x = var10003x;
                  var10003x = (var1x | var2x) & (~var1x | ~var2x);
                  var10004x = (int)4967374882549188316L;
                  var2x = 635347045;
                  var1x = var10004x;
                  var10004x = (var1x | var2x) - (var1x & var2x);
                  var2x = -1082383720;
                  var1x = var10004x;
                  var10004x = (var1x | var2x) - (var1x & var2x);
                  var10005x = (int)-4028628689524535331L;
                  var2x = -1365169187;
                  var1x = var10005x;
                  var10005x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = -2061320370;
                  var1x = var10005x;
                  var10005x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = 1108696487;
                  var1x = -1799546510;
                  var10006x = var1x & ~var2x | ~var1x & var2x;
                  var2x = -695685811;
                  var1x = var10006x;
                  if (!this.a
                     .b(
                        c(
                           "ꁿ닊ꀦ늹ꑅ뚡ꑅ닍ꁕ닋ꀧ늲ꀣ닁",
                           "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳",
                           var10003x,
                           var10004x,
                           var10005x,
                           (var1x | var2x) & ~(var1x & var2x)
                        )
                     )) {
                     int var43x = (int)-4091056365390207714L;
                     var2x = 420696918;
                     var1x = var43x;
                     var43x = (var1x | var2x) - (var1x & var2x);
                     var2x = 566474312;
                     var1x = var43x;
                     return Boolean.valueOf(pulse.Bool.from(var1x + var2x - 2 * (var1x & var2x)));
                  }
               }

               int var10000 = (int)-8032055396535126589L;
               var2x = 703832766;
               var1x = var10000;
               var10000 = var1x + var2x - 2 * (var1x & var2x);
               var2x = 11540348;
               var1x = var10000;
               return Boolean.valueOf(pulse.Bool.from((var1x | var2x) - (var1x & var2x)));
            }
         );
      var2 = 124683610;
      var1 = 2126452633;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = 499542452;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var10006 = (int)-2465842508695372372L;
      var2 = 16005809;
      var1 = var10006;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var2 = 1561386994;
      var1 = var10006;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var2 = -1797137592;
      var1 = 1776027493;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      var2 = -343526552;
      var1 = var10007;
      var10007 = (var1 | var2) & ~(var1 & var2);
      var10008 = (int)4303537871912469299L;
      var2 = -1241877150;
      var1 = var10008;
      var10008 = (var1 | var2) & ~(var1 & var2);
      var2 = 25128279;
      var1 = var10008;
      this.i = new ColorSetting(
            c(
               "ﴟ鵄﵄鴶ﴻ鵈ﴸ鴿ﴼ饔﵃鵆ﴰ鴶",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳",
               var10005,
               var10006,
               var10007,
               var1 + var2 - 2 * (var1 & var2)
            ),
            Color.WHITE
         )
         .a(
            () -> {
               label15: {
                  int var10003x = (int)-2942976898681320656L;
                  int var2x = 594337318;
                  int var1x = var10003x;
                  var10003x = (var1x | var2x) - (var1x & var2x);
                  var2x = 747662945;
                  var1x = var10003x;
                  var10003x = var1x & ~var2x | ~var1x & var2x;
                  var2x = -600177038;
                  var1x = -1849166035;
                  int var10004x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = -70006505;
                  var1x = var10004x;
                  var10004x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = 166136121;
                  var1x = 1013368260;
                  int var10005x = var1x & ~var2x | ~var1x & var2x;
                  var2x = 1001742764;
                  var1x = var10005x;
                  var10005x = (var1x | var2x) - (var1x & var2x);
                  var2x = -1704209793;
                  var1x = 266531525;
                  int var10006x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = -1783628540;
                  var1x = var10006x;
                  if (!this.a
                     .b(
                        c(
                           "ꁆ蚓ꁟ蛡ꁞ蚓ꑄ蚗ꀤ蛮ꁗ",
                           "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳",
                           var10003x,
                           var10004x,
                           var10005x,
                           (var1x | var2x) & ~(var1x & var2x)
                        )
                     )) {
                     var2x = -1414797318;
                     var1x = 1867071495;
                     var10003x = var1x & ~var2x | ~var1x & var2x;
                     var2x = -1594532726;
                     var1x = var10003x;
                     var10003x = (var1x | var2x) - (var1x & var2x);
                     var2x = 1193756339;
                     var1x = 1479897838;
                     var10004x = var1x & ~var2x | ~var1x & var2x;
                     var2x = -1454038766;
                     var1x = var10004x;
                     var10004x = (var1x | var2x) & ~(var1x & var2x);
                     var2x = -1346904056;
                     var1x = 1309732914;
                     var10005x = (var1x | var2x) & ~(var1x & var2x);
                     var2x = -1056660577;
                     var1x = var10005x;
                     var10005x = (var1x | var2x) & ~(var1x & var2x);
                     var2x = 488481942;
                     var1x = 773070334;
                     var10006x = (var1x | var2x) - (var1x & var2x);
                     var2x = 859177901;
                     var1x = var10006x;
                     if (!this.a
                        .b(
                           c(
                              "ꁾ\ue196ꀧ\ue1e5ꑄ\ue5fdꑄ\ue191ꁔ\ue197ꀦ\ue1eeꀢ\ue19d",
                              "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳",
                              var10003x,
                              var10004x,
                              var10005x,
                              var1x + var2x - 2 * (var1x & var2x)
                           )
                        )) {
                        break label15;
                     }
                  }

                  if (!this.h.a()) {
                     int var10000 = (int)-6594810926609026072L;
                     var2x = 1224019870;
                     var1x = var10000;
                     var10000 = (var1x | var2x) - (var1x & var2x);
                     var2x = 1718598775;
                     var1x = var10000;
                     return Boolean.valueOf(pulse.Bool.from(var1x + var2x - 2 * (var1x & var2x)));
                  }
               }

               int var43x = (int)1877601061452078199L;
               int var39x = 209191009;
               int var20x = var43x;
               var43x = (var20x | var39x) & ~(var20x & var39x);
               var39x = -1513661418;
               var20x = var43x;
               return Boolean.valueOf(pulse.Bool.from(var20x & ~var39x | ~var20x & var39x));
            }
         );
      var2 = 1264146462;
      var1 = -476973622;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = -857778525;
      var1 = var10005;
      var10005 = (var1 | var2) - (var1 & var2);
      var10006 = (int)5091354347343451306L;
      var2 = 682230856;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var2 = 992317689;
      var1 = var10006;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var2 = 702846053;
      var1 = 1582354814;
      var10007 = (var1 | var2) & ~(var1 & var2);
      var2 = 2093686112;
      var1 = var10007;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var2 = 770270402;
      var1 = 1944044361;
      var10008 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1580934585;
      var1 = var10008;
      this.j = new SettingGroup(
            c("ﴢ葰﵄萂ﴽ萆﵎", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳", var10005, var10006, var10007, (var1 | var2) - (var1 & var2))
         )
         .a(
            () -> {
               int var2x = -275361781;
               int var1x = -1287183579;
               int var10003x = (var1x | var2x) & ~(var1x & var2x);
               var2x = 952535129;
               var1x = var10003x;
               var10003x = var1x & ~var2x | ~var1x & var2x;
               int var10004x = (int)-3481660334292149722L;
               var2x = -1830551524;
               var1x = var10004x;
               var10004x = var1x & ~var2x | ~var1x & var2x;
               var2x = 1162298515;
               var1x = var10004x;
               var10004x = var1x & ~var2x | ~var1x & var2x;
               var2x = -1026451144;
               var1x = 1511371326;
               int var10005x = var1x & ~var2x | ~var1x & var2x;
               var2x = -1641843509;
               var1x = var10005x;
               var10005x = (var1x | var2x) & ~(var1x & var2x);
               var2x = 1944251881;
               var1x = -1225788451;
               int var10006x = (var1x | var2x) - (var1x & var2x);
               var2x = -985179606;
               var1x = var10006x;
               return this.a
                  .b(
                     c(
                        "ꁹὊꀠἹꑃᬡꑃὍꁓὋꀡἲꀥὁ",
                        "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳",
                        var10003x,
                        var10004x,
                        var10005x,
                        var1x & ~var2x | ~var1x & var2x
                     )
                  );
            }
         );
      var2 = -60240509;
      var1 = 1640388620;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = -105287944;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = -216790692;
      var1 = 2061238828;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var2 = 1498083553;
      var1 = var10006;
      var10006 = (var1 | var2) - (var1 & var2);
      var10007 = (int)-3612167698605010520L;
      var2 = 872579475;
      var1 = var10007;
      var10007 = (var1 | var2) - (var1 & var2);
      var2 = -1813577337;
      var1 = var10007;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var10008 = (int)-2310596618008021227L;
      var2 = -1142475122;
      var1 = var10008;
      var10008 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1887273933;
      var1 = var10008;
      var10003 = c(
         "ﴧﯢﴺ\ufffa﵂ﯪ﵄ﮘﴽﮜ", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳", var10005, var10006, var10007, (var1 | var2) & ~(var1 & var2)
      );
      var2 = 1853092757;
      var1 = -1802462636;
      var10004 = var1 & ~var2 | ~var1 & var2;
      var2 = -85759545;
      var1 = var10004;
      String[] var1055 = new String[(var1 | var2) - (var1 & var2)];
      var2 = -264359298;
      var1 = -746097866;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var2 = 599343432;
      var1 = var10006;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var10009 = (int)-5506213464239721401L;
      var2 = -1417254002;
      var1 = var10009;
      var10009 = (var1 | var2) & (~var1 | ~var2);
      var2 = -921361218;
      var1 = var10009;
      var10009 = var1 + var2 - 2 * (var1 & var2);
      var10010 = (int)-4361211732051762702L;
      var2 = 1337802640;
      var1 = var10010;
      var10010 = var1 & ~var2 | ~var1 & var2;
      var2 = -805572426;
      var1 = var10010;
      var10010 = var1 + var2 - 2 * (var1 & var2);
      var10011 = (int)2213148549865945073L;
      var2 = 2052140827;
      var1 = var10011;
      var10011 = var1 & ~var2 | ~var1 & var2;
      var2 = 547864091;
      var1 = var10011;
      var10011 = (var1 | var2) & ~(var1 & var2);
      var2 = 248017465;
      var1 = 1673456298;
      var10012 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1836034168;
      var1 = var10012;
      var1055[var10006] = c(
         "ﴤ㚬﵅㚭﵃㚬", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳", var10009, var10010, var10011, var1 + var2 - 2 * (var1 & var2)
      );
      var10006 = (int)5913696288346981910L;
      var2 = -1721396770;
      var1 = var10006;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var2 = -1458415671;
      var1 = var10006;
      var10006 = (var1 | var2) - (var1 & var2);
      var2 = 574319372;
      var1 = 1051666382;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var2 = 2021898165;
      var1 = var10009;
      var10009 = (var1 | var2) - (var1 & var2);
      var10010 = (int)-653986109598081351L;
      var2 = -940262101;
      var1 = var10010;
      var10010 = var1 & ~var2 | ~var1 & var2;
      var2 = 1042546027;
      var1 = var10010;
      var10010 = (var1 | var2) - (var1 & var2);
      var10011 = (int)5265663311390351003L;
      var2 = 615449549;
      var1 = var10011;
      var10011 = (var1 | var2) - (var1 & var2);
      var2 = 752392030;
      var1 = var10011;
      var10011 = var1 + var2 - 2 * (var1 & var2);
      var2 = 427762465;
      var1 = -960122803;
      var10012 = var1 + var2 - 2 * (var1 & var2);
      var2 = -542231940;
      var1 = var10012;
      var1055[var10006] = c(
         "ﴝꜣ﴿Ꜣﴵ", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳", var10009, var10010, var10011, var1 + var2 - 2 * (var1 & var2)
      );
      var10006 = (int)4377226055815191641L;
      var2 = 591308836;
      var1 = var10006;
      var10006 = (var1 | var2) - (var1 & var2);
      var2 = -582192001;
      var1 = var10006;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1155691976;
      var1 = 1615778382;
      var10009 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1086020863;
      var1 = var10009;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var10010 = (int)7954254908178333492L;
      var2 = 1571625749;
      var1 = var10010;
      var10010 = var1 & ~var2 | ~var1 & var2;
      var2 = -2081922609;
      var1 = var10010;
      var10010 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1460686131;
      var1 = 1881469116;
      var10011 = var1 + var2 - 2 * (var1 & var2);
      var2 = 933138589;
      var1 = var10011;
      var10011 = (var1 | var2) & (~var1 | ~var2);
      var2 = 282692895;
      var1 = 1762150890;
      var10012 = (var1 | var2) & (~var1 | ~var2);
      var2 = 2046741744;
      var1 = var10012;
      var1055[var10006] = c(
         "ﴤ๊ﴰแﴽ๊﴿็", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳", var10009, var10010, var10011, var1 & ~var2 | ~var1 & var2
      );
      var10006 = (int)-6259170735948946946L;
      var2 = -2044989194;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var2 = 1227215115;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var10009 = (int)4475566093040141384L;
      var2 = 1648350708;
      var1 = var10009;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var2 = 777579211;
      var1 = var10009;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var2 = 581364645;
      var1 = 90378144;
      var10010 = (var1 | var2) & (~var1 | ~var2);
      var2 = -144642608;
      var1 = var10010;
      var10010 = (var1 | var2) - (var1 & var2);
      var2 = -1862802775;
      var1 = -2123596024;
      var10011 = var1 & ~var2 | ~var1 & var2;
      var2 = 450358488;
      var1 = var10011;
      var10011 = (var1 | var2) & (~var1 | ~var2);
      var10012 = (int)-1467505742388352211L;
      var2 = 1823331366;
      var1 = var10012;
      var10012 = (var1 | var2) - (var1 & var2);
      var2 = 60454119;
      var1 = var10012;
      var1055[var10006] = c(
         "ﴤඦ﵊ඣﴽණ", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳", var10009, var10010, var10011, var1 + var2 - 2 * (var1 & var2)
      );
      var2 = -2123597523;
      var1 = 241497698;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var2 = -1895264437;
      var1 = var10006;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var10009 = (int)4169918360428402221L;
      var2 = 451673969;
      var1 = var10009;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var2 = -1454714325;
      var1 = var10009;
      var10009 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1972333194;
      var1 = 809398263;
      var10010 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1791296651;
      var1 = var10010;
      var10010 = (var1 | var2) & (~var1 | ~var2);
      var10011 = (int)3320447217973338414L;
      var2 = -1055195930;
      var1 = var10011;
      var10011 = (var1 | var2) & ~(var1 & var2);
      var2 = 612145145;
      var1 = var10011;
      var10011 = (var1 | var2) & ~(var1 & var2);
      var10012 = (int)7765657450499074983L;
      var2 = -1068641401;
      var1 = var10012;
      var10012 = var1 & ~var2 | ~var1 & var2;
      var2 = 1476868159;
      var1 = var10012;
      var1055[var10006] = c(
         "ﴒٟﴰٚﴱٝ", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳", var10009, var10010, var10011, (var1 | var2) & (~var1 | ~var2)
      );
      var2 = 323213556;
      var1 = -2012691512;
      var10006 = (var1 | var2) - (var1 & var2);
      var2 = -1689576647;
      var1 = var10006;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var2 = -456784948;
      var1 = -1915850512;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var2 = 220170315;
      var1 = var10009;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var2 = 2052712997;
      var1 = 669757961;
      var10010 = var1 & ~var2 | ~var1 & var2;
      var2 = -1925592162;
      var1 = var10010;
      var10010 = (var1 | var2) - (var1 & var2);
      var2 = 1478826130;
      var1 = 680643193;
      var10011 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1638973772;
      var1 = var10011;
      var10011 = var1 & ~var2 | ~var1 & var2;
      var10012 = (int)-321869119449411322L;
      var2 = 1715700828;
      var1 = var10012;
      var10012 = (var1 | var2) & (~var1 | ~var2);
      var2 = -648363885;
      var1 = var10012;
      var1055[var10006] = c(
         "ﴑ鎅﴾鎀ﴵ鏻", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳", var10009, var10010, var10011, var1 + var2 - 2 * (var1 & var2)
      );
      var2 = 322942530;
      var1 = 708209368;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1562257389;
      var1 = var10007;
      var10007 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1480246830;
      var1 = 457357809;
      var10008 = (var1 | var2) - (var1 & var2);
      var2 = -1813362328;
      var1 = var10008;
      var10008 = (var1 | var2) & (~var1 | ~var2);
      var2 = -2102591718;
      var1 = 490498065;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var2 = -1875264166;
      var1 = var10009;
      var10009 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1808745193;
      var1 = 150650954;
      var10010 = (var1 | var2) - (var1 & var2);
      var2 = -1663679085;
      var1 = var10010;
      this.k = new ModeSetting(
            var10003,
            var1055,
            c("ﴤ㺉﵅㺈﵃㺉", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳", var10007, var10008, var10009, (var1 | var2) & ~(var1 & var2))
         )
         .a(
            () -> {
               int var2x = 310892831;
               int var1x = -459870239;
               int var10003x = var1x + var2x - 2 * (var1x & var2x);
               var2x = -1845047927;
               var1x = var10003x;
               var10003x = (var1x | var2x) - (var1x & var2x);
               var2x = -1753335183;
               var1x = 664027792;
               int var10004x = (var1x | var2x) & ~(var1x & var2x);
               var2x = 111742263;
               var1x = var10004x;
               var10004x = (var1x | var2x) & ~(var1x & var2x);
               int var10005x = (int)6932637572851514094L;
               var2x = -1826496916;
               var1x = var10005x;
               var10005x = var1x & ~var2x | ~var1x & var2x;
               var2x = -1065204367;
               var1x = var10005x;
               var10005x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = -611663418;
               var1x = 729099718;
               int var10006x = var1x + var2x - 2 * (var1x & var2x);
               var2x = -255592630;
               var1x = var10006x;
               if (!this.a
                  .b(
                     c(
                        "ꁀ䁡ꁙ䀓ꁘ䁡ꑂ䀘ꁒ䀞ꀠ䁧ꀤ䀔",
                        "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳",
                        var10003x,
                        var10004x,
                        var10005x,
                        (var1x | var2x) & ~(var1x & var2x)
                     )
                  )) {
                  var2x = -479758742;
                  var1x = 1869715075;
                  var10003x = var1x + var2x - 2 * (var1x & var2x);
                  var2x = -402580578;
                  var1x = var10003x;
                  var10003x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = -227291140;
                  var1x = -1866060948;
                  var10004x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = -729675533;
                  var1x = var10004x;
                  var10004x = (var1x | var2x) - (var1x & var2x);
                  var10005x = (int)1148863084992210804L;
                  var2x = 99960115;
                  var1x = var10005x;
                  var10005x = (var1x | var2x) - (var1x & var2x);
                  var2x = -2053482244;
                  var1x = var10005x;
                  var10005x = var1x & ~var2x | ~var1x & var2x;
                  var10006x = (int)-2885945032682916719L;
                  var2x = -1873050123;
                  var1x = var10006x;
                  var10006x = var1x + var2x - 2 * (var1x & var2x);
                  var2x = -305487693;
                  var1x = var10006x;
                  if (!this.a
                     .b(
                        c(
                           "ꁸ쪂ꀡ쫱ꑂ컩ꑂ쪅ꁒ쪃ꀠ쫺ꀤ쪉",
                           "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳",
                           var10003x,
                           var10004x,
                           var10005x,
                           (var1x | var2x) & ~(var1x & var2x)
                        )
                     )) {
                     int var43x = (int)-2871165498295635127L;
                     var2x = -1687671347;
                     var1x = var43x;
                     var43x = (var1x | var2x) & (~var1x | ~var2x);
                     var2x = 1708334724;
                     var1x = var43x;
                     return Boolean.valueOf(pulse.Bool.from((var1x | var2x) - (var1x & var2x)));
                  }
               }

               int var10000 = (int)9173283561155969079L;
               var2x = -1742732865;
               var1x = var10000;
               var10000 = (var1x | var2x) & ~(var1x & var2x);
               var2x = 1853997449;
               var1x = var10000;
               return Boolean.valueOf(pulse.Bool.from(var1x & ~var2x | ~var1x & var2x));
            }
         );
      var10005 = (int)7330710812759312048L;
      var2 = 926708120;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1433809825;
      var1 = var10005;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = 1640341334;
      var1 = -931944233;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var2 = 2031694238;
      var1 = var10006;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1744624482;
      var1 = -246317409;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1768508033;
      var1 = var10007;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      var10008 = (int)-2983706770125290759L;
      var2 = 1743464984;
      var1 = var10008;
      var10008 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1527980247;
      var1 = var10008;
      var10003 = c(
         "ﴥ\u0e71ﴳ\u0e7cﴹ\u0a64﵁\u0e7cﴲ\u0e7c﴿\u0e7c",
         "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳",
         var10005,
         var10006,
         var10007,
         (var1 | var2) & (~var1 | ~var2)
      );
      var10004 = (int)3685801658949244521L;
      var2 = 728928968;
      var1 = var10004;
      var10004 = var1 & ~var2 | ~var1 & var2;
      var2 = -1991932763;
      var1 = var10004;
      String[] var1058 = new String[var1 & ~var2 | ~var1 & var2];
      var2 = 626563845;
      var1 = -106560959;
      var10006 = (var1 | var2) - (var1 & var2);
      var2 = -587294396;
      var1 = var10006;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1465718928;
      var1 = 1268537954;
      var10009 = (var1 | var2) - (var1 & var2);
      var2 = -2027338139;
      var1 = var10009;
      var10009 = (var1 | var2) & ~(var1 & var2);
      var2 = -25239540;
      var1 = -1222171141;
      var10010 = var1 & ~var2 | ~var1 & var2;
      var2 = -1711965897;
      var1 = var10010;
      var10010 = (var1 | var2) & (~var1 | ~var2);
      var10011 = (int)4334989380903814369L;
      var2 = 1960122464;
      var1 = var10011;
      var10011 = (var1 | var2) - (var1 & var2);
      var2 = -1467466908;
      var1 = var10011;
      var10011 = var1 & ~var2 | ~var1 & var2;
      var10012 = (int)-7605756505446975853L;
      var2 = 873995390;
      var1 = var10012;
      var10012 = (var1 | var2) - (var1 & var2);
      var2 = 1754911802;
      var1 = var10012;
      var1058[var10006] = c(
         "ﴥ뢐ﴵ뢞ﴽ룤﵇뢝﵂뢘ﴵ룪", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳", var10009, var10010, var10011, (var1 | var2) & (~var1 | ~var2)
      );
      var10006 = (int)-1207094903288640893L;
      var2 = -723861268;
      var1 = var10006;
      var10006 = (var1 | var2) - (var1 & var2);
      var2 = 1670449774;
      var1 = var10006;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var10009 = (int)7363958608473468150L;
      var2 = 1439324019;
      var1 = var10009;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var2 = -1755315982;
      var1 = var10009;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var10010 = (int)-5996661649349466108L;
      var2 = 1907024850;
      var1 = var10010;
      var10010 = var1 & ~var2 | ~var1 & var2;
      var2 = -917092531;
      var1 = var10010;
      var10010 = (var1 | var2) - (var1 & var2);
      var10011 = (int)7959072612112280105L;
      var2 = 859939496;
      var1 = var10011;
      var10011 = (var1 | var2) & ~(var1 & var2);
      var2 = 138438060;
      var1 = var10011;
      var10011 = (var1 | var2) & ~(var1 & var2);
      var10012 = (int)7556842282247993937L;
      var2 = -1879510972;
      var1 = var10012;
      var10012 = (var1 | var2) & (~var1 | ~var2);
      var2 = 516179111;
      var1 = var10012;
      var1058[var10006] = c(
         "ﴔ裵ﴲ賠﴿裾﴾裻ﴽ裷ﴽ裹", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳", var10009, var10010, var10011, (var1 | var2) - (var1 & var2)
      );
      var10006 = (int)-1506720146174060480L;
      var2 = 510642345;
      var1 = var10006;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var2 = -1859055381;
      var1 = var10006;
      var10006 = (var1 | var2) - (var1 & var2);
      var2 = -1832148595;
      var1 = -1563471516;
      var10009 = (var1 | var2) - (var1 & var2);
      var2 = 1410534302;
      var1 = var10009;
      var10009 = var1 + var2 - 2 * (var1 & var2);
      var10010 = (int)-6596316606803335324L;
      var2 = -248608750;
      var1 = var10010;
      var10010 = (var1 | var2) - (var1 & var2);
      var2 = -1863092752;
      var1 = var10010;
      var10010 = var1 & ~var2 | ~var1 & var2;
      var2 = 957609977;
      var1 = 1724470960;
      var10011 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1570141382;
      var1 = var10011;
      var10011 = (var1 | var2) & (~var1 | ~var2);
      var10012 = (int)7530445870581500151L;
      var2 = 1244641870;
      var1 = var10012;
      var10012 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1179594276;
      var1 = var10012;
      var1058[var10006] = c(
         "ﴔ\udadaﴲ\udecf﵁\udad7ﴲ\udad7﴿\udad7",
         "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳",
         var10009,
         var10010,
         var10011,
         (var1 | var2) & (~var1 | ~var2)
      );
      var2 = -1479313118;
      var1 = 1152549685;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var2 = -480118252;
      var1 = var10006;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var10009 = (int)1938566940210107531L;
      var2 = 335218826;
      var1 = var10009;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var2 = 57075574;
      var1 = var10009;
      var10009 = (var1 | var2) - (var1 & var2);
      var2 = -1654884270;
      var1 = 585767403;
      var10010 = (var1 | var2) - (var1 & var2);
      var2 = 1863585297;
      var1 = var10010;
      var10010 = var1 + var2 - 2 * (var1 & var2);
      var10011 = (int)-7047031415809924632L;
      var2 = -339053247;
      var1 = var10011;
      var10011 = (var1 | var2) - (var1 & var2);
      var2 = 1856938213;
      var1 = var10011;
      var10011 = (var1 | var2) - (var1 & var2);
      var10012 = (int)-6386039507242400688L;
      var2 = 1587904688;
      var1 = var10012;
      var10012 = (var1 | var2) & ~(var1 & var2);
      var2 = 2143106399;
      var1 = var10012;
      var1058[var10006] = c(
         "ﴚ瞍ﴽ瞏﵊矻ﴰ矰ﴽ矸", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳", var10009, var10010, var10011, var1 & ~var2 | ~var1 & var2
      );
      var2 = 1836377176;
      var1 = 748607217;
      var10007 = (var1 | var2) - (var1 & var2);
      var2 = 637389278;
      var1 = var10007;
      var10007 = (var1 | var2) - (var1 & var2);
      var10008 = (int)7045565809872923528L;
      var2 = 45255739;
      var1 = var10008;
      var10008 = (var1 | var2) & ~(var1 & var2);
      var2 = -1190181897;
      var1 = var10008;
      var10008 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1660688472;
      var1 = 786996713;
      var10009 = (var1 | var2) & ~(var1 & var2);
      var2 = -1191009662;
      var1 = var10009;
      var10009 = (var1 | var2) & ~(var1 & var2);
      var10010 = (int)-8505526122862903319L;
      var2 = -1035331900;
      var1 = var10010;
      var10010 = var1 & ~var2 | ~var1 & var2;
      var2 = -258846858;
      var1 = var10010;
      this.l = new ModeSetting(
            var10003,
            var1058,
            c(
               "ﴥ“ﴵ‒ﴽ\u2068﵇‑﵂—ﴵ\u2066",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳",
               var10007,
               var10008,
               var10009,
               var1 + var2 - 2 * (var1 & var2)
            )
         )
         .a(
            () -> {
               int var2x = 748651295;
               int var1x = -27580707;
               int var10003x = var1x & ~var2x | ~var1x & var2x;
               var2x = -1227661643;
               var1x = var10003x;
               var10003x = (var1x | var2x) - (var1x & var2x);
               var2x = -414064305;
               var1x = 109715018;
               int var10004x = var1x & ~var2x | ~var1x & var2x;
               var2x = 1468198512;
               var1x = var10004x;
               var10004x = (var1x | var2x) & ~(var1x & var2x);
               var2x = -1615405909;
               var1x = 1851866433;
               int var10005x = (var1x | var2x) & ~(var1x & var2x);
               var2x = -799759607;
               var1x = var10005x;
               var10005x = (var1x | var2x) & ~(var1x & var2x);
               int var10006x = (int)-6245915468031471942L;
               var2x = -1463044876;
               var1x = var10006x;
               var10006x = (var1x | var2x) & ~(var1x & var2x);
               var2x = -163066714;
               var1x = var10006x;
               if (!this.a
                  .b(
                     c(
                        "ꁃ\uedc0ꁚ\uedb2ꁛ\uedc0ꑁ\uedb9ꁑ\uedbfꀣ\uedc6ꀧ\uedb5",
                        "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳",
                        var10003x,
                        var10004x,
                        var10005x,
                        (var1x | var2x) & ~(var1x & var2x)
                     )
                  )) {
                  var2x = 1875160488;
                  var1x = -1948792795;
                  var10003x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = -2147180806;
                  var1x = var10003x;
                  var10003x = var1x + var2x - 2 * (var1x & var2x);
                  var2x = 588012239;
                  var1x = 1600554364;
                  var10004x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = -903871983;
                  var1x = var10004x;
                  var10004x = var1x & ~var2x | ~var1x & var2x;
                  var10005x = (int)-2521521010284080540L;
                  var2x = 1574045825;
                  var1x = var10005x;
                  var10005x = (var1x | var2x) - (var1x & var2x);
                  var2x = 1890999482;
                  var1x = var10005x;
                  var10005x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = 2031111933;
                  var1x = 369941548;
                  var10006x = var1x + var2x - 2 * (var1x & var2x);
                  var2x = 1868501444;
                  var1x = var10006x;
                  if (!this.a
                     .b(
                        c(
                           "ꁻ\ud843ꀢ\ud830ꑁ\udc28ꑁ\ud844ꁑ\ud842ꀣ\ud83bꀧ\ud848",
                           "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳",
                           var10003x,
                           var10004x,
                           var10005x,
                           var1x & ~var2x | ~var1x & var2x
                        )
                     )) {
                     int var43x = (int)7941121949007055119L;
                     var2x = 1067800546;
                     var1x = var43x;
                     var43x = (var1x | var2x) & ~(var1x & var2x);
                     var2x = -2026184979;
                     var1x = var43x;
                     return Boolean.valueOf(pulse.Bool.from((var1x | var2x) & ~(var1x & var2x)));
                  }
               }

               int var10000 = (int)-6453202845528081535L;
               var2x = -1977064885;
               var1x = var10000;
               var10000 = (var1x | var2x) - (var1x & var2x);
               var2x = 1391090123;
               var1x = var10000;
               return Boolean.valueOf(pulse.Bool.from((var1x | var2x) - (var1x & var2x)));
            }
         );
      var2 = -393379494;
      var1 = 953090094;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1269466621;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var10006 = (int)3282785830570460132L;
      var2 = 278138560;
      var1 = var10006;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var2 = 685392044;
      var1 = var10006;
      var10006 = (var1 | var2) - (var1 & var2);
      var10007 = (int)-2856421699711565246L;
      var2 = -275784986;
      var1 = var10007;
      var10007 = (var1 | var2) & (~var1 | ~var2);
      var2 = -194687819;
      var1 = var10007;
      var10007 = (var1 | var2) - (var1 & var2);
      var2 = -1033941898;
      var1 = 1780081087;
      var10008 = (var1 | var2) - (var1 & var2);
      var2 = -1469816234;
      var1 = var10008;
      this.m = new SliderSetting(
            c(
               "ﴟ짓﴾징﵂짘﵄즯ﴷ짓拉즪ﴵ즬﵇징﵃",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳",
               var10005,
               var10006,
               var10007,
               (var1 | var2) & ~(var1 & var2)
            ),
            4.0F,
            1.0F,
            10.0F,
            1.0F
         )
         .a(
            () -> {
               int var10003x = (int)-6105514602453941486L;
               int var2x = 1251417459;
               int var1x = var10003x;
               var10003x = var1x + var2x - 2 * (var1x & var2x);
               var2x = 1799693590;
               var1x = var10003x;
               var10003x = var1x + var2x - 2 * (var1x & var2x);
               var2x = 1952978236;
               var1x = -1252710842;
               int var10004x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = 1996504331;
               var1x = var10004x;
               var10004x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = 505547961;
               var1x = -1055693303;
               int var10005x = (var1x | var2x) - (var1x & var2x);
               var2x = -783534251;
               var1x = var10005x;
               var10005x = var1x + var2x - 2 * (var1x & var2x);
               var2x = 391672028;
               var1x = -454730640;
               int var10006x = var1x + var2x - 2 * (var1x & var2x);
               var2x = -209150129;
               var1x = var10006x;
               if (!this.a
                  .b(
                     c(
                        "ꁂ\ue8caꁛ\ue8b8ꁚ\ue8caꑀ\ue8b3ꁐ\ue8b5ꀢ\ue8ccꀦ\ue8bf",
                        "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳",
                        var10003x,
                        var10004x,
                        var10005x,
                        (var1x | var2x) & (~var1x | ~var2x)
                     )
                  )) {
                  var2x = -1511772871;
                  var1x = -2103837455;
                  var10003x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = 1131031231;
                  var1x = var10003x;
                  var10003x = (var1x | var2x) & (~var1x | ~var2x);
                  var10004x = (int)5709199605890587478L;
                  var2x = 881607316;
                  var1x = var10004x;
                  var10004x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = 2116662646;
                  var1x = var10004x;
                  var10004x = (var1x | var2x) & (~var1x | ~var2x);
                  var10005x = (int)-7878219027920544951L;
                  var2x = 180255799;
                  var1x = var10005x;
                  var10005x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = -373706548;
                  var1x = var10005x;
                  var10005x = var1x + var2x - 2 * (var1x & var2x);
                  var2x = -1868592967;
                  var1x = 1479400666;
                  var10006x = var1x + var2x - 2 * (var1x & var2x);
                  var2x = -923515323;
                  var1x = var10006x;
                  if (!this.a
                     .b(
                        c(
                           "ꁺ䥱ꀣ䤂ꑀ䴚ꑀ䥶ꁐ䥰ꀢ䤉ꀦ䥺",
                           "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳",
                           var10003x,
                           var10004x,
                           var10005x,
                           (var1x | var2x) & (~var1x | ~var2x)
                        )
                     )) {
                     int var42x = (int)-8984792152851839673L;
                     var2x = -1752046924;
                     var1x = var42x;
                     var42x = (var1x | var2x) & ~(var1x & var2x);
                     var2x = 1662871539;
                     var1x = var42x;
                     return Boolean.valueOf(pulse.Bool.from((var1x | var2x) & ~(var1x & var2x)));
                  }
               }

               var2x = -478147856;
               var1x = -974337394;
               int var10000 = (var1x | var2x) - (var1x & var2x);
               var2x = 644661375;
               var1x = var10000;
               return Boolean.valueOf(pulse.Bool.from(var1x & ~var2x | ~var1x & var2x));
            }
         );
      var10005 = (int)-1128234706620748168L;
      var2 = 2042672145;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = 223158558;
      var1 = var10005;
      var10005 = (var1 | var2) - (var1 & var2);
      var2 = 59868520;
      var1 = 13958763;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var2 = -751028690;
      var1 = var10006;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var10007 = (int)8464703330542369699L;
      var2 = -1767676529;
      var1 = var10007;
      var10007 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1283128382;
      var1 = var10007;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var10008 = (int)-3495368261891551847L;
      var2 = -529111044;
      var1 = var10008;
      var10008 = var1 + var2 - 2 * (var1 & var2);
      var2 = 649241889;
      var1 = var10008;
      this.n = new SliderSetting(
            c(
               "ﴥ䤆ﴲ䤊ﴰ䥶拉䥱ﴵ䥷﵇䤎﵃",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳",
               var10005,
               var10006,
               var10007,
               (var1 | var2) - (var1 & var2)
            ),
            0.3F,
            0.1F,
            0.75F,
            0.05F
         )
         .a(
            () -> {
               int var10003x = (int)-2376433954076483728L;
               int var2x = 409485097;
               int var1x = var10003x;
               var10003x = var1x + var2x - 2 * (var1x & var2x);
               var2x = -1553474770;
               var1x = var10003x;
               var10003x = (var1x | var2x) & (~var1x | ~var2x);
               int var10004x = (int)8842822849986615832L;
               var2x = 176715744;
               var1x = var10004x;
               var10004x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = 1569570056;
               var1x = var10004x;
               var10004x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = -493158789;
               var1x = 1068400579;
               int var10005x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = -1062082397;
               var1x = var10005x;
               var10005x = (var1x | var2x) - (var1x & var2x);
               int var10006x = (int)-5046815860028564368L;
               var2x = 1083041743;
               var1x = var10006x;
               var10006x = var1x + var2x - 2 * (var1x & var2x);
               var2x = -1466380834;
               var1x = var10006x;
               if (!this.a
                  .b(
                     c(
                        "ꁍ\ued47ꁔ\ued35ꁕ\ued47ꑏ\ued3eꁟ\ued38ꀭ\ued41ꀩ\ued32",
                        "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳",
                        var10003x,
                        var10004x,
                        var10005x,
                        var1x + var2x - 2 * (var1x & var2x)
                     )
                  )) {
                  var2x = 1227384713;
                  var1x = -258072992;
                  var10003x = (var1x | var2x) - (var1x & var2x);
                  var2x = -576617826;
                  var1x = var10003x;
                  var10003x = var1x & ~var2x | ~var1x & var2x;
                  var10004x = (int)-5522929112015074681L;
                  var2x = -2057067123;
                  var1x = var10004x;
                  var10004x = (var1x | var2x) - (var1x & var2x);
                  var2x = -842971142;
                  var1x = var10004x;
                  var10004x = (var1x | var2x) - (var1x & var2x);
                  var2x = 1271054826;
                  var1x = 342408921;
                  var10005x = var1x & ~var2x | ~var1x & var2x;
                  var2x = 1165084685;
                  var1x = var10005x;
                  var10005x = (var1x | var2x) - (var1x & var2x);
                  var2x = 1388414559;
                  var1x = 1201414015;
                  var10006x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = 357930817;
                  var1x = var10006x;
                  if (!this.a
                     .b(
                        c(
                           "ꁵ唹ꀬ啊ꑏ兒ꑏ唾ꁟ唸ꀭ啁ꀩ唲",
                           "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳",
                           var10003x,
                           var10004x,
                           var10005x,
                           (var1x | var2x) & (~var1x | ~var2x)
                        )
                     )) {
                     int var42x = (int)6283733309655365733L;
                     var2x = 2020509671;
                     var1x = var42x;
                     var42x = var1x + var2x - 2 * (var1x & var2x);
                     var2x = 1898102658;
                     var1x = var42x;
                     return Boolean.valueOf(pulse.Bool.from(var1x + var2x - 2 * (var1x & var2x)));
                  }
               }

               var2x = -1532529960;
               var1x = -278167450;
               int var10000 = var1x + var2x - 2 * (var1x & var2x);
               var2x = 1271722687;
               var1x = var10000;
               return Boolean.valueOf(pulse.Bool.from(var1x + var2x - 2 * (var1x & var2x)));
            }
         );
      var10005 = (int)-6563866390476652172L;
      var2 = -1873258820;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var2 = -2033439553;
      var1 = var10005;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var2 = -877985602;
      var1 = 769400358;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var2 = 906652615;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var10007 = (int)-5553778681877278567L;
      var2 = 412101569;
      var1 = var10007;
      var10007 = (var1 | var2) & (~var1 | ~var2);
      var2 = -848749115;
      var1 = var10007;
      var10007 = (var1 | var2) & ~(var1 & var2);
      var2 = -1957516041;
      var1 = 1345191779;
      var10008 = (var1 | var2) & (~var1 | ~var2);
      var2 = -612883230;
      var1 = var10008;
      this.o = new SliderSetting(
            c("ﴗ煄ﴰ焸﵊甤ﴳ焼ﴲ焹ﴽ", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳", var10005, var10006, var10007, (var1 | var2) - (var1 & var2)),
            20.0F,
            10.0F,
            50.0F,
            5.0F
         )
         .a(
            () -> {
               int var10003x = (int)-2129567163957950436L;
               int var2x = -667422902;
               int var1x = var10003x;
               var10003x = (var1x | var2x) & ~(var1x & var2x);
               var2x = 1054039073;
               var1x = var10003x;
               var10003x = (var1x | var2x) & (~var1x | ~var2x);
               int var10004x = (int)4627970186304756283L;
               var2x = -1458383953;
               var1x = var10004x;
               var10004x = var1x & ~var2x | ~var1x & var2x;
               var2x = -1329807591;
               var1x = var10004x;
               var10004x = (var1x | var2x) - (var1x & var2x);
               var2x = 1999600734;
               var1x = -974174908;
               int var10005x = (var1x | var2x) - (var1x & var2x);
               var2x = -1529197115;
               var1x = var10005x;
               var10005x = var1x + var2x - 2 * (var1x & var2x);
               var2x = 1438608043;
               var1x = -1332967881;
               int var10006x = var1x + var2x - 2 * (var1x & var2x);
               var2x = -446489750;
               var1x = var10006x;
               if (!this.a
                  .b(
                     c(
                        "籵烨籬炚籭烨硷炑籧炗簕烮簑炝",
                        "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳",
                        var10003x,
                        var10004x,
                        var10005x,
                        (var1x | var2x) & ~(var1x & var2x)
                     )
                  )) {
                  var10003x = (int)-5526290469698908445L;
                  var2x = -130212431;
                  var1x = var10003x;
                  var10003x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = 2010294309;
                  var1x = var10003x;
                  var10003x = (var1x | var2x) & ~(var1x & var2x);
                  var10004x = (int)1430546119981346268L;
                  var2x = 1006418194;
                  var1x = var10004x;
                  var10004x = var1x & ~var2x | ~var1x & var2x;
                  var2x = -1880889611;
                  var1x = var10004x;
                  var10004x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = -769066754;
                  var1x = -794594551;
                  var10005x = var1x & ~var2x | ~var1x & var2x;
                  var2x = 225858438;
                  var1x = var10005x;
                  var10005x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = -344576156;
                  var1x = 118372168;
                  var10006x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = -330962040;
                  var1x = var10006x;
                  if (!this.a
                     .b(
                        c(
                           "籍瓄簔璷硷炯硷瓃籧瓅簕璼簑瓏",
                           "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳",
                           var10003x,
                           var10004x,
                           var10005x,
                           (var1x | var2x) & ~(var1x & var2x)
                        )
                     )) {
                     int var42x = (int)-3634484715139823038L;
                     var2x = 757268007;
                     var1x = var42x;
                     var42x = var1x + var2x - 2 * (var1x & var2x);
                     var2x = 1101263973;
                     var1x = var42x;
                     return Boolean.valueOf(pulse.Bool.from((var1x | var2x) & (~var1x | ~var2x)));
                  }
               }

               var2x = 1203788569;
               var1x = -1757935944;
               int var10000 = (var1x | var2x) & ~(var1x & var2x);
               var2x = -789029472;
               var1x = var10000;
               return Boolean.valueOf(pulse.Bool.from((var1x | var2x) & (~var1x | ~var2x)));
            }
         );
      var10005 = (int)3659352451712501057L;
      var2 = 303949377;
      var1 = var10005;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var2 = -968009609;
      var1 = var10005;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1893916833;
      var1 = 1341959880;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var2 = -276724114;
      var1 = var10006;
      var10006 = (var1 | var2) - (var1 & var2);
      var2 = 621480777;
      var1 = -1178551983;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var2 = -1983437009;
      var1 = var10007;
      var10007 = (var1 | var2) & ~(var1 & var2);
      var10008 = (int)-2760885060434707183L;
      var2 = -1112041956;
      var1 = var10008;
      var10008 = (var1 | var2) & ~(var1 & var2);
      var2 = -293248749;
      var1 = var10008;
      this.p = new SliderSetting(
            c(
               "ﴤ챔﴾챜拉찬ﴵ챛﴾창﵇챜",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳",
               var10005,
               var10006,
               var10007,
               (var1 | var2) & ~(var1 & var2)
            ),
            0.3F,
            0.15F,
            0.35F,
            0.01F
         )
         .a(
            () -> {
               int var2x = -1663371957;
               int var1x = -1673235981;
               int var10003x = var1x + var2x - 2 * (var1x & var2x);
               var2x = 1686732751;
               var1x = var10003x;
               var10003x = (var1x | var2x) & ~(var1x & var2x);
               int var10004x = (int)7257942568580941097L;
               var2x = -2132715320;
               var1x = var10004x;
               var10004x = (var1x | var2x) - (var1x & var2x);
               var2x = 146746977;
               var1x = var10004x;
               var10004x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = 1347485644;
               var1x = -45672552;
               int var10005x = var1x + var2x - 2 * (var1x & var2x);
               var2x = -1367083912;
               var1x = var10005x;
               var10005x = var1x & ~var2x | ~var1x & var2x;
               var2x = -1102019623;
               var1x = -1402996496;
               int var10006x = var1x & ~var2x | ~var1x & var2x;
               var2x = 303730625;
               var1x = var10006x;
               if (!this.a
                  .b(
                     c(
                        "籴珷籭玅籬珷硶玎籦玈簔珱簐玂",
                        "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳",
                        var10003x,
                        var10004x,
                        var10005x,
                        (var1x | var2x) - (var1x & var2x)
                     )
                  )) {
                  var10003x = (int)-3425392346174722977L;
                  var2x = 2131014554;
                  var1x = var10003x;
                  var10003x = var1x & ~var2x | ~var1x & var2x;
                  var2x = 1593484466;
                  var1x = var10003x;
                  var10003x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = -434024460;
                  var1x = -74121925;
                  var10004x = (var1x | var2x) - (var1x & var2x);
                  var2x = 1300902013;
                  var1x = var10004x;
                  var10004x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = -1726081047;
                  var1x = 1818634739;
                  var10005x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = -181333467;
                  var1x = var10005x;
                  var10005x = (var1x | var2x) & ~(var1x & var2x);
                  var10006x = (int)4282158765756475832L;
                  var2x = -832890533;
                  var1x = var10006x;
                  var10006x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = 1724740857;
                  var1x = var10006x;
                  if (!this.a
                     .b(
                        c(
                           "籌荻簕茈硶蜐硶荼籦荺簔范簐荰",
                           "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳",
                           var10003x,
                           var10004x,
                           var10005x,
                           var1x & ~var2x | ~var1x & var2x
                        )
                     )) {
                     int var43x = (int)-4275159140718679585L;
                     var2x = -654193793;
                     var1x = var43x;
                     var43x = (var1x | var2x) & (~var1x | ~var2x);
                     var2x = 1379082912;
                     var1x = var43x;
                     return Boolean.valueOf(pulse.Bool.from(var1x + var2x - 2 * (var1x & var2x)));
                  }
               }

               int var10000 = (int)5821896548336633763L;
               var2x = 1325985483;
               var1x = var10000;
               var10000 = (var1x | var2x) & ~(var1x & var2x);
               var2x = -307926679;
               var1x = var10000;
               return Boolean.valueOf(pulse.Bool.from(var1x + var2x - 2 * (var1x & var2x)));
            }
         );
      var2 = -2129964011;
      var1 = -1387615563;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1213597143;
      var1 = var10005;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1608858831;
      var1 = 1348799628;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var2 = -548963430;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var2 = 1558941691;
      var1 = -1010705369;
      var10007 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1681300815;
      var1 = var10007;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var10008 = (int)-4699116078362007712L;
      var2 = -820601454;
      var1 = var10008;
      var10008 = (var1 | var2) & ~(var1 & var2);
      var2 = 295712514;
      var1 = var10008;
      var10003 = c(
         "ﴣ䮰ﴰ䯀拉䮸﴾䮺ﴰ䮿﵇䮲", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳", var10005, var10006, var10007, (var1 | var2) & (~var1 | ~var2)
      );
      var10004 = (int)-4865434687833109000L;
      var2 = -817371260;
      var1 = var10004;
      var10004 = (var1 | var2) - (var1 & var2);
      var2 = 916449917;
      var1 = var10004;
      this.q = new BooleanSetting(var10003, pulse.Bool.from((var1 | var2) - (var1 & var2)))
         .a(
            () -> {
               int var2x = 688400524;
               int var1x = -276305040;
               int var10003x = (var1x | var2x) - (var1x & var2x);
               var2x = -1567082357;
               var1x = var10003x;
               var10003x = (var1x | var2x) & ~(var1x & var2x);
               var2x = -772400474;
               var1x = 334283578;
               int var10004x = var1x & ~var2x | ~var1x & var2x;
               var2x = -1843185068;
               var1x = var10004x;
               var10004x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = 2096430109;
               var1x = 1550379580;
               int var10005x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = 1041730212;
               var1x = var10005x;
               var10005x = var1x + var2x - 2 * (var1x & var2x);
               var2x = -191358828;
               var1x = -120932570;
               int var10006x = (var1x | var2x) & ~(var1x & var2x);
               var2x = 209177245;
               var1x = var10006x;
               if (!this.a
                  .b(
                     c(
                        "籷\ue233籮\ue241籯\ue233硵\ue24a籥\ue24c簗\ue235簓\ue246",
                        "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳",
                        var10003x,
                        var10004x,
                        var10005x,
                        var1x + var2x - 2 * (var1x & var2x)
                     )
                  )) {
                  var2x = -1137104349;
                  var1x = -867283721;
                  var10003x = var1x + var2x - 2 * (var1x & var2x);
                  var2x = 341876131;
                  var1x = var10003x;
                  var10003x = var1x + var2x - 2 * (var1x & var2x);
                  var2x = -1976037527;
                  var1x = 1924861906;
                  var10004x = var1x + var2x - 2 * (var1x & var2x);
                  var2x = -1464720908;
                  var1x = var10004x;
                  var10004x = (var1x | var2x) - (var1x & var2x);
                  var2x = 1591133101;
                  var1x = -1988951540;
                  var10005x = (var1x | var2x) - (var1x & var2x);
                  var2x = -1025703020;
                  var1x = var10005x;
                  var10005x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = -1366201373;
                  var1x = -1432947296;
                  var10006x = var1x & ~var2x | ~var1x & var2x;
                  var2x = 68893941;
                  var1x = var10006x;
                  if (!this.a
                     .b(
                        c(
                           "籏◔簖▧硵↿硵◓籥◕簗▬簓◟",
                           "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳",
                           var10003x,
                           var10004x,
                           var10005x,
                           (var1x | var2x) & ~(var1x & var2x)
                        )
                     )) {
                     int var42x = (int)-2479003286383002416L;
                     var2x = 960805377;
                     var1x = var42x;
                     var42x = var1x & ~var2x | ~var1x & var2x;
                     var2x = 257541841;
                     var1x = var42x;
                     return Boolean.valueOf(pulse.Bool.from((var1x | var2x) & ~(var1x & var2x)));
                  }
               }

               var2x = 1041532364;
               var1x = 2100173005;
               int var10000 = var1x & ~var2x | ~var1x & var2x;
               var2x = 1127914752;
               var1x = var10000;
               return Boolean.valueOf(pulse.Bool.from(var1x & ~var2x | ~var1x & var2x));
            }
         );
      var10005 = (int)-5480486956589315485L;
      var2 = -177687439;
      var1 = var10005;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = -852867739;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var10006 = (int)-7741832059098651839L;
      var2 = 433814266;
      var1 = var10006;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var2 = 1460682681;
      var1 = var10006;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1060531527;
      var1 = -39893544;
      var10007 = (var1 | var2) & (~var1 | ~var2);
      var2 = -880180493;
      var1 = var10007;
      var10007 = (var1 | var2) & ~(var1 & var2);
      var10008 = (int)4401748273655314436L;
      var2 = -815028805;
      var1 = var10008;
      var10008 = (var1 | var2) - (var1 & var2);
      var2 = 243709350;
      var1 = var10008;
      this.r = new ColorSetting(
            c(
               "ﴟ\uee5b﵄\uee29ﴻ\uee57ﴸ\uee20ﴼ\uea4b﵃\uee59ﴰ\uee29",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳",
               var10005,
               var10006,
               var10007,
               var1 + var2 - 2 * (var1 & var2)
            ),
            Color.WHITE
         )
         .a(
            () -> {
               label15: {
                  int var10003x = (int)5843660168701798131L;
                  int var2x = -45184484;
                  int var1x = var10003x;
                  var10003x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = -959932520;
                  var1x = var10003x;
                  var10003x = (var1x | var2x) & (~var1x | ~var2x);
                  int var10004x = (int)8373127968426007287L;
                  var2x = 1538754679;
                  var1x = var10004x;
                  var10004x = var1x + var2x - 2 * (var1x & var2x);
                  var2x = 1131031325;
                  var1x = var10004x;
                  var10004x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = -1731383820;
                  var1x = 515691601;
                  int var10005x = (var1x | var2x) - (var1x & var2x);
                  var2x = -2039520062;
                  var1x = var10005x;
                  var10005x = var1x & ~var2x | ~var1x & var2x;
                  var2x = -332359507;
                  var1x = 2000009626;
                  int var10006x = var1x + var2x - 2 * (var1x & var2x);
                  var2x = -1692100044;
                  var1x = var10006x;
                  if (!this.a
                     .b(
                        c(
                           "籶㰞籯㱬籮㰞硴㱧籤㱡簖㰘簒㱫",
                           "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳",
                           var10003x,
                           var10004x,
                           var10005x,
                           var1x + var2x - 2 * (var1x & var2x)
                        )
                     )) {
                     var10003x = (int)5691819244519692344L;
                     var2x = -2119610807;
                     var1x = var10003x;
                     var10003x = (var1x | var2x) - (var1x & var2x);
                     var2x = -1494569722;
                     var1x = var10003x;
                     var10003x = var1x & ~var2x | ~var1x & var2x;
                     var10004x = (int)4293809667416343293L;
                     var2x = -1221126310;
                     var1x = var10004x;
                     var10004x = (var1x | var2x) & (~var1x | ~var2x);
                     var2x = 1886120218;
                     var1x = var10004x;
                     var10004x = var1x & ~var2x | ~var1x & var2x;
                     var2x = 1832386082;
                     var1x = 138119294;
                     var10005x = (var1x | var2x) & (~var1x | ~var2x);
                     var2x = 2083522279;
                     var1x = var10005x;
                     var10005x = var1x & ~var2x | ~var1x & var2x;
                     var2x = 1876901758;
                     var1x = -584390341;
                     var10006x = (var1x | var2x) & ~(var1x & var2x);
                     var2x = -1292310426;
                     var1x = var10006x;
                     if (!this.a
                        .b(
                           c(
                              "籎륀簗뤳硴봫硴륇籤륁簖뤸簒륋",
                              "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳",
                              var10003x,
                              var10004x,
                              var10005x,
                              var1x + var2x - 2 * (var1x & var2x)
                           )
                        )) {
                        break label15;
                     }
                  }

                  if (!this.q.a()) {
                     int var10000 = (int)2533589383515020509L;
                     var2x = 802834243;
                     var1x = var10000;
                     var10000 = (var1x | var2x) - (var1x & var2x);
                     var2x = -993567841;
                     var1x = var10000;
                     return Boolean.valueOf(pulse.Bool.from(var1x & ~var2x | ~var1x & var2x));
                  }
               }

               int var43x = (int)6463252078365186840L;
               int var39x = 424728543;
               int var20x = var43x;
               var43x = (var20x | var39x) & ~(var20x & var39x);
               var39x = -1718367033;
               var20x = var43x;
               return Boolean.valueOf(pulse.Bool.from(var20x + var39x - 2 * (var20x & var39x)));
            }
         );
      var10005 = (int)-5815535323812650229L;
      var2 = 863363694;
      var1 = var10005;
      var10005 = (var1 | var2) - (var1 & var2);
      var2 = 168507922;
      var1 = var10005;
      var10005 = (var1 | var2) - (var1 & var2);
      var10006 = (int)-8499626708309045420L;
      var2 = -1308758892;
      var1 = var10006;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var2 = -828255977;
      var1 = var10006;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var2 = 1243195694;
      var1 = -1334456198;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      var2 = -71246953;
      var1 = var10007;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var10008 = (int)-3710423396044320517L;
      var2 = 1257724768;
      var1 = var10008;
      var10008 = (var1 | var2) - (var1 & var2);
      var2 = 849002357;
      var1 = var10008;
      this.s = new SettingGroup(
            c(
               "ﴔ㊧ﴻ㊦ﴻ㊮ﴵ㋓拉㊮ﴻ㊧ﴸ㊬",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳",
               var10005,
               var10006,
               var10007,
               var1 + var2 - 2 * (var1 & var2)
            )
         )
         .a(
            () -> {
               int var10003x = (int)-806958038567977940L;
               int var2x = -1387175090;
               int var1x = var10003x;
               var10003x = var1x + var2x - 2 * (var1x & var2x);
               var2x = -1278942187;
               var1x = var10003x;
               var10003x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = 512943417;
               var1x = -1746259036;
               int var10004x = var1x & ~var2x | ~var1x & var2x;
               var2x = -647083158;
               var1x = var10004x;
               var10004x = var1x + var2x - 2 * (var1x & var2x);
               var2x = -1374067123;
               var1x = 1327286998;
               int var10005x = var1x + var2x - 2 * (var1x & var2x);
               var2x = -89982646;
               var1x = var10005x;
               var10005x = var1x & ~var2x | ~var1x & var2x;
               int var10006x = (int)5040542001962899534L;
               var2x = 1165454991;
               var1x = var10006x;
               var10006x = var1x & ~var2x | ~var1x & var2x;
               var2x = -350606947;
               var1x = var10006x;
               return this.a
                  .b(
                     c(
                        "籂顃籭顂籭顊籣頷硳顊籭顃籮顈",
                        "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳",
                        var10003x,
                        var10004x,
                        var10005x,
                        (var1x | var2x) - (var1x & var2x)
                     )
                  );
            }
         );
      var2 = 998479592;
      var1 = 277931843;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1325697756;
      var1 = var10005;
      var10005 = (var1 | var2) - (var1 & var2);
      var2 = -1818427756;
      var1 = -866999166;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1884018694;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var10007 = (int)2201711056599224499L;
      var2 = 1807640785;
      var1 = var10007;
      var10007 = (var1 | var2) & ~(var1 & var2);
      var2 = 417404741;
      var1 = var10007;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      var2 = -804630978;
      var1 = 1605378302;
      var10008 = (var1 | var2) & ~(var1 & var2);
      var2 = -1883312445;
      var1 = var10008;
      this.t = new SliderSetting(
            c("ﴥ虁ﴱ虉﵆蘰拉虃ﴻ虊ﴸ蘺", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳", var10005, var10006, var10007, (var1 | var2) - (var1 & var2)),
            10.0F,
            6.0F,
            35.0F,
            1.0F
         )
         .a(
            () -> {
               int var10003x = (int)2921262396077495939L;
               int var2x = -690781531;
               int var1x = var10003x;
               var10003x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = 1193520977;
               var1x = var10003x;
               var10003x = (var1x | var2x) & ~(var1x & var2x);
               var2x = 1475028001;
               var1x = 1030380136;
               int var10004x = (var1x | var2x) & ~(var1x & var2x);
               var2x = 985393118;
               var1x = var10004x;
               var10004x = var1x & ~var2x | ~var1x & var2x;
               var2x = -1448137110;
               var1x = -745399419;
               int var10005x = (var1x | var2x) - (var1x & var2x);
               var2x = 1719162419;
               var1x = var10005x;
               var10005x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = 1619140882;
               var1x = 476695008;
               int var10006x = (var1x | var2x) - (var1x & var2x);
               var2x = 2093871625;
               var1x = var10006x;
               return this.a
                  .b(
                     c(
                        "籃鷥籬鷤籬鷬籢鶑硲鷬籬鷥籯鷮",
                        "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳",
                        var10003x,
                        var10004x,
                        var10005x,
                        var1x + var2x - 2 * (var1x & var2x)
                     )
                  );
            }
         );
      var10005 = (int)-8739988975525177637L;
      var2 = -1071915117;
      var1 = var10005;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = -386796993;
      var1 = var10005;
      var10005 = (var1 | var2) - (var1 & var2);
      var2 = -1287055676;
      var1 = -1211178655;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var2 = -735542675;
      var1 = var10006;
      var10006 = (var1 | var2) - (var1 & var2);
      var10007 = (int)-1682723703425355854L;
      var2 = -1430254158;
      var1 = var10007;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var2 = -1232520736;
      var1 = var10007;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var10008 = (int)8476950542265780827L;
      var2 = 83303195;
      var1 = var10008;
      var10008 = var1 + var2 - 2 * (var1 & var2);
      var2 = -25106785;
      var1 = var10008;
      this.u = new SliderSetting(
            c(
               "ﴤ熗ﴻ燭ﴻ燬﵇燡拉熟ﴻ熖ﴸ燦",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳",
               var10005,
               var10006,
               var10007,
               (var1 | var2) & (~var1 | ~var2)
            ),
            8.0F,
            1.0F,
            25.0F,
            0.5F
         )
         .a(
            () -> {
               int var10003x = (int)3390397287506781021L;
               int var2x = -531694050;
               int var1x = var10003x;
               var10003x = (var1x | var2x) & ~(var1x & var2x);
               var2x = 890447412;
               var1x = var10003x;
               var10003x = (var1x | var2x) - (var1x & var2x);
               int var10004x = (int)8139303116061761247L;
               var2x = 2133179974;
               var1x = var10004x;
               var10004x = (var1x | var2x) & ~(var1x & var2x);
               var2x = 1194064118;
               var1x = var10004x;
               var10004x = var1x & ~var2x | ~var1x & var2x;
               int var10005x = (int)-4290104224440102828L;
               var2x = -1152576400;
               var1x = var10005x;
               var10005x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = -1407884438;
               var1x = var10005x;
               var10005x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = 1943546179;
               var1x = -349427506;
               int var10006x = var1x + var2x - 2 * (var1x & var2x);
               var2x = -1729062817;
               var1x = var10006x;
               return this.a
                  .b(
                     c(
                        "籀ỏ籯Ỏ籯Ệ籡ẻ硱Ệ籯ỏ籬Ễ",
                        "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳",
                        var10003x,
                        var10004x,
                        var10005x,
                        (var1x | var2x) - (var1x & var2x)
                     )
                  );
            }
         );
      var10005 = (int)-4263093769541705732L;
      var2 = -85010632;
      var1 = var10005;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var2 = 816853939;
      var1 = var10005;
      var10005 = (var1 | var2) - (var1 & var2);
      var2 = 612856650;
      var1 = 1561321104;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1457451851;
      var1 = var10006;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var10007 = (int)5001989962316031046L;
      var2 = -2109777021;
      var1 = var10007;
      var10007 = (var1 | var2) & (~var1 | ~var2);
      var2 = -483853197;
      var1 = var10007;
      var10007 = (var1 | var2) - (var1 & var2);
      var2 = 382775459;
      var1 = 1628750153;
      var10008 = (var1 | var2) & ~(var1 & var2);
      var2 = 2012729964;
      var1 = var10008;
      this.v = new SliderSetting(
            c("ﴧꗊ﴾ꖽﴽꗉﴵꇔ﴿ꗊ﴾ꖸ﵃ꗄ", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳", var10005, var10006, var10007, var1 & ~var2 | ~var1 & var2),
            1.5F,
            0.5F,
            3.0F,
            0.1F
         )
         .a(
            () -> {
               int var10003x = (int)-6124007876144454136L;
               int var2x = 22981775;
               int var1x = var10003x;
               var10003x = (var1x | var2x) - (var1x & var2x);
               var2x = 301887984;
               var1x = var10003x;
               var10003x = var1x + var2x - 2 * (var1x & var2x);
               var2x = 1130107674;
               var1x = -712999345;
               int var10004x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = -957888454;
               var1x = var10004x;
               var10004x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = 1692852267;
               var1x = -86289592;
               int var10005x = var1x & ~var2x | ~var1x & var2x;
               var2x = -2022458355;
               var1x = var10005x;
               var10005x = var1x + var2x - 2 * (var1x & var2x);
               var2x = 1956361218;
               var1x = 1666037511;
               int var10006x = var1x & ~var2x | ~var1x & var2x;
               var2x = 401679828;
               var1x = var10006x;
               return this.a
                  .b(
                     c(
                        "籁ꇍ籮ꇌ籮ꇄ籠ꆹ硰ꇄ籮ꇍ籭ꇆ",
                        "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳",
                        var10003x,
                        var10004x,
                        var10005x,
                        var1x & ~var2x | ~var1x & var2x
                     )
                  );
            }
         );
      var2 = -1204110955;
      var1 = 787262310;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var2 = -222172796;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var10006 = (int)2572156144347172415L;
      var2 = 1665993982;
      var1 = var10006;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var2 = 427284183;
      var1 = var10006;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1970220439;
      var1 = 1499862292;
      var10007 = (var1 | var2) - (var1 & var2);
      var2 = 952265252;
      var1 = var10007;
      var10007 = (var1 | var2) - (var1 & var2);
      var2 = 1732696604;
      var1 = 371767174;
      var10008 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1900575671;
      var1 = var10008;
      var10003 = c("ﴛၮﴷၡﴱၥﴵ", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳", var10005, var10006, var10007, (var1 | var2) - (var1 & var2));
      var10004 = (int)506031214517938903L;
      var2 = 1614637598;
      var1 = var10004;
      var10004 = (var1 | var2) & ~(var1 & var2);
      var2 = 44335304;
      var1 = var10004;
      this.w = new BooleanSetting(var10003, pulse.Bool.from((var1 | var2) - (var1 & var2)))
         .a(
            () -> {
               int var2x = 1459205929;
               int var1x = -111607682;
               int var10003x = var1x + var2x - 2 * (var1x & var2x);
               var2x = -877179872;
               var1x = var10003x;
               var10003x = (var1x | var2x) - (var1x & var2x);
               int var10004x = (int)-4037969444415304310L;
               var2x = -673998761;
               var1x = var10004x;
               var10004x = var1x + var2x - 2 * (var1x & var2x);
               var2x = -1272228193;
               var1x = var10004x;
               var10004x = (var1x | var2x) & ~(var1x & var2x);
               int var10005x = (int)-6269964514985685575L;
               var2x = -681894971;
               var1x = var10005x;
               var10005x = var1x + var2x - 2 * (var1x & var2x);
               var2x = -1766731386;
               var1x = var10005x;
               var10005x = (var1x | var2x) - (var1x & var2x);
               int var10006x = (int)-7741235340207018404L;
               var2x = 1633858509;
               var1x = var10006x;
               var10006x = var1x + var2x - 2 * (var1x & var2x);
               var2x = 1896995122;
               var1x = var10006x;
               return this.a
                  .b(
                     c(
                        "籎䎰籡䎱籡䎹籯䏄硿䎹籡䎰籢䎻",
                        "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳",
                        var10003x,
                        var10004x,
                        var10005x,
                        var1x + var2x - 2 * (var1x & var2x)
                     )
                  );
            }
         );
      var10005 = (int)-1884560502825710500L;
      var2 = -2111833741;
      var1 = var10005;
      var10005 = (var1 | var2) - (var1 & var2);
      var2 = -111178152;
      var1 = var10005;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = -1602662648;
      var1 = 1722710383;
      var10006 = (var1 | var2) - (var1 & var2);
      var2 = 374661021;
      var1 = var10006;
      var10006 = (var1 | var2) - (var1 & var2);
      var10007 = (int)-7210772954430890495L;
      var2 = 1802866242;
      var1 = var10007;
      var10007 = (var1 | var2) - (var1 & var2);
      var2 = -1375933465;
      var1 = var10007;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var2 = 1268236355;
      var1 = 327536176;
      var10008 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1478484578;
      var1 = var10008;
      this.x = new SliderSetting(
            c(
               "ﴧ\uea5d﴾\uea2aﴽ\uea5eﴵ\uee43﴾\uea5bﴸ\uea5bﴼ",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳",
               var10005,
               var10006,
               var10007,
               (var1 | var2) - (var1 & var2)
            ),
            2.0F,
            1.0F,
            5.0F,
            0.5F
         )
         .a(
            () -> {
               int var10003x = (int)-8613963567877507008L;
               int var2x = -763999703;
               int var1x = var10003x;
               var10003x = (var1x | var2x) - (var1x & var2x);
               var2x = -1562343138;
               var1x = var10003x;
               var10003x = var1x + var2x - 2 * (var1x & var2x);
               int var10004x = (int)-7791330445600840685L;
               var2x = -55688558;
               var1x = var10004x;
               var10004x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = -1026099804;
               var1x = var10004x;
               var10004x = var1x + var2x - 2 * (var1x & var2x);
               var2x = 1847209603;
               var1x = 299100563;
               int var10005x = (var1x | var2x) - (var1x & var2x);
               var2x = 1846270584;
               var1x = var10005x;
               var10005x = (var1x | var2x) - (var1x & var2x);
               int var10006x = (int)1910425847975385292L;
               var2x = -507576314;
               var1x = var10006x;
               var10006x = var1x + var2x - 2 * (var1x & var2x);
               var2x = 937069647;
               var1x = var10006x;
               int var26x;
               if (this.a
                     .b(
                        c(
                           "籏᎗籠᎖籠\u139e籮Ꮳ硾\u139e籠᎗籣\u139c",
                           "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳",
                           var10003x,
                           var10004x,
                           var10005x,
                           (var1x | var2x) & (~var1x | ~var2x)
                        )
                     )
                  && this.w.a()) {
                  var2x = -1731303077;
                  var1x = -564561960;
                  var26x = var1x & ~var2x | ~var1x & var2x;
                  var2x = 1184308866;
                  var1x = var26x;
                  var26x = (var1x | var2x) & ~(var1x & var2x);
               } else {
                  var26x = (int)5231169157486507421L;
                  var2x = -537892817;
                  var1x = var26x;
                  var26x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = 537271730;
                  var1x = var26x;
                  var26x = (var1x | var2x) - (var1x & var2x);
               }

               return Boolean.valueOf(pulse.Bool.from(var26x));
            }
         );
      var2 = 286839322;
      var1 = 107256852;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = 1936438649;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var2 = 579657539;
      var1 = 1119151453;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1329888663;
      var1 = var10006;
      var10006 = (var1 | var2) - (var1 & var2);
      var10007 = (int)4577752905630503212L;
      var2 = 451410715;
      var1 = var10007;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var2 = -1770235003;
      var1 = var10007;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var2 = -2086865839;
      var1 = -1649059078;
      var10008 = (var1 | var2) & ~(var1 & var2);
      var2 = 505680933;
      var1 = var10008;
      var10003 = c(
         "ﴒ볌﴾별ﴷ볆ﴵ", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳", var10005, var10006, var10007, (var1 | var2) & (~var1 | ~var2)
      );
      var2 = -1006765592;
      var1 = 668179559;
      var10004 = var1 + var2 - 2 * (var1 & var2);
      var2 = -466721394;
      var1 = var10004;
      this.y = new BooleanSetting(var10003, pulse.Bool.from((var1 | var2) - (var1 & var2)))
         .a(
            () -> {
               int var2x = 1152279421;
               int var1x = 2076147152;
               int var10003x = (var1x | var2x) - (var1x & var2x);
               var2x = 1527178714;
               var1x = var10003x;
               var10003x = var1x & ~var2x | ~var1x & var2x;
               var2x = -1018455617;
               var1x = -177244350;
               int var10004x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = 1712470551;
               var1x = var10004x;
               var10004x = (var1x | var2x) & ~(var1x & var2x);
               int var10005x = (int)3064457675051607712L;
               var2x = 631600350;
               var1x = var10005x;
               var10005x = var1x & ~var2x | ~var1x & var2x;
               var2x = -734586751;
               var1x = var10005x;
               var10005x = (var1x | var2x) & (~var1x | ~var2x);
               int var10006x = (int)-5380864672363912469L;
               var2x = 1768050118;
               var1x = var10006x;
               var10006x = var1x + var2x - 2 * (var1x & var2x);
               var2x = -2113079015;
               var1x = var10006x;
               return this.a
                  .b(
                     c(
                        "籙터籶턱籶턹籸텄硨턹籶터籵턻",
                        "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳",
                        var10003x,
                        var10004x,
                        var10005x,
                        var1x + var2x - 2 * (var1x & var2x)
                     )
                  );
            }
         );
      var2 = -615332745;
      var1 = 74537463;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var2 = -1154193673;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var10006 = (int)-8688396707319747905L;
      var2 = 556043631;
      var1 = var10006;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1590660635;
      var1 = var10006;
      var10006 = (var1 | var2) - (var1 & var2);
      var10007 = (int)8343643049258231029L;
      var2 = 125722369;
      var1 = var10007;
      var10007 = (var1 | var2) & ~(var1 & var2);
      var2 = -1747418581;
      var1 = var10007;
      var10007 = (var1 | var2) - (var1 & var2);
      var2 = -757871558;
      var1 = 1134879835;
      var10008 = (var1 | var2) & ~(var1 & var2);
      var2 = -1856917459;
      var1 = var10008;
      var10003 = c(
         "ﴧ鸆ﴺ騞ﴲ鸎﴾鸆ﴷ鸄ﴽ", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳", var10005, var10006, var10007, var1 & ~var2 | ~var1 & var2
      );
      var10004 = (int)6190117503722151886L;
      var2 = 914876423;
      var1 = var10004;
      var10004 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1714505781;
      var1 = var10004;
      String[] var1066 = new String[(var1 | var2) - (var1 & var2)];
      var10006 = (int)3437725485561121546L;
      var2 = -404370893;
      var1 = var10006;
      var10006 = (var1 | var2) - (var1 & var2);
      var2 = 1707622713;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var2 = -1258539024;
      var1 = -65025503;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var2 = 754189990;
      var1 = var10009;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var10010 = (int)-631807561993847025L;
      var2 = -141979913;
      var1 = var10010;
      var10010 = (var1 | var2) - (var1 & var2);
      var2 = -1947057151;
      var1 = var10010;
      var10010 = (var1 | var2) & (~var1 | ~var2);
      var10011 = (int)5031567996028638092L;
      var2 = 780935113;
      var1 = var10011;
      var10011 = var1 & ~var2 | ~var1 & var2;
      var2 = 766333739;
      var1 = var10011;
      var10011 = var1 & ~var2 | ~var1 & var2;
      var2 = 200232039;
      var1 = -1110660414;
      var10012 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1238278475;
      var1 = var10012;
      var1066[var10006] = c(
         "ﴛ빓﵎븥ﴸ빒﵊", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳", var10009, var10010, var10011, (var1 | var2) - (var1 & var2)
      );
      var10006 = (int)4464019758844064277L;
      var2 = 165118891;
      var1 = var10006;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var2 = -1242680897;
      var1 = var10006;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var10009 = (int)1561088094813846796L;
      var2 = -176455281;
      var1 = var10009;
      var10009 = (var1 | var2) - (var1 & var2);
      var2 = 2064910324;
      var1 = var10009;
      var10009 = (var1 | var2) & (~var1 | ~var2);
      var10010 = (int)2678284583352358166L;
      var2 = -2039763843;
      var1 = var10010;
      var10010 = (var1 | var2) & ~(var1 & var2);
      var2 = 953088013;
      var1 = var10010;
      var10010 = (var1 | var2) & ~(var1 & var2);
      var10011 = (int)-2108314103479057261L;
      var2 = -364542379;
      var1 = var10011;
      var10011 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1340820058;
      var1 = var10011;
      var10011 = var1 + var2 - 2 * (var1 & var2);
      var2 = 280537445;
      var1 = -1993921266;
      var10012 = (var1 | var2) & ~(var1 & var2);
      var2 = -1713666282;
      var1 = var10012;
      var1066[var10006] = c(
         "ﴭԺﴼԻﴰՏ", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳", var10009, var10010, var10011, var1 + var2 - 2 * (var1 & var2)
      );
      var10007 = (int)6350265891073837628L;
      var2 = 1643629492;
      var1 = var10007;
      var10007 = (var1 | var2) - (var1 & var2);
      var2 = -816022785;
      var1 = var10007;
      var10007 = (var1 | var2) & (~var1 | ~var2);
      var10008 = (int)-9125691889730762429L;
      var2 = 164098178;
      var1 = var10008;
      var10008 = (var1 | var2) - (var1 & var2);
      var2 = 1605846760;
      var1 = var10008;
      var10008 = (var1 | var2) & (~var1 | ~var2);
      var10009 = (int)3550992162000123351L;
      var2 = -1000086058;
      var1 = var10009;
      var10009 = (var1 | var2) & ~(var1 & var2);
      var2 = 1881281530;
      var1 = var10009;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var10010 = (int)-7012792784613343694L;
      var2 = 514359546;
      var1 = var10010;
      var10010 = (var1 | var2) & (~var1 | ~var2);
      var2 = 993034120;
      var1 = var10010;
      this.z = new ModeSetting(
            var10003,
            var1066,
            c("ﴛ܃﵎ݵﴸ܂﵊", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳", var10007, var10008, var10009, var1 + var2 - 2 * (var1 & var2))
         )
         .a(
            () -> {
               int var2x = 1218487707;
               int var1x = -1332119815;
               int var10003x = (var1x | var2x) - (var1x & var2x);
               var2x = -1674696683;
               var1x = var10003x;
               var10003x = var1x + var2x - 2 * (var1x & var2x);
               int var10004x = (int)-8433855994339655524L;
               var2x = -458553647;
               var1x = var10004x;
               var10004x = var1x & ~var2x | ~var1x & var2x;
               var2x = -300379789;
               var1x = var10004x;
               var10004x = (var1x | var2x) - (var1x & var2x);
               var2x = 170239473;
               var1x = 1456942616;
               int var10005x = var1x & ~var2x | ~var1x & var2x;
               var2x = 1329740682;
               var1x = var10005x;
               var10005x = var1x + var2x - 2 * (var1x & var2x);
               var2x = -753736755;
               var1x = 314639260;
               int var10006x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = -1044186922;
               var1x = var10006x;
               int var26x;
               if (this.a
                     .b(
                        c(
                           "簦鿼簉鿽簉鿵簇龈砗鿵簉鿼簊鿷",
                           "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳",
                           var10003x,
                           var10004x,
                           var10005x,
                           (var1x | var2x) - (var1x & var2x)
                        )
                     )
                  && this.y.a()) {
                  var2x = 763373579;
                  var1x = 1344716468;
                  var26x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = 2108069566;
                  var1x = var26x;
                  var26x = var1x & ~var2x | ~var1x & var2x;
               } else {
                  var26x = (int)2647716816700605065L;
                  var2x = -1751608622;
                  var1x = var26x;
                  var26x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = 853282907;
                  var1x = var26x;
                  var26x = var1x + var2x - 2 * (var1x & var2x);
               }

               return Boolean.valueOf(pulse.Bool.from(var26x));
            }
         );
      var10005 = (int)-6462666052189609740L;
      var2 = 1555047777;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var2 = 1642397410;
      var1 = var10005;
      var10005 = (var1 | var2) - (var1 & var2);
      var10006 = (int)8213460426318492692L;
      var2 = -82511099;
      var1 = var10006;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var2 = -2065560973;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var10007 = (int)-3666733420231485955L;
      var2 = -27201167;
      var1 = var10007;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1142786217;
      var1 = var10007;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      var2 = 2144955726;
      var1 = -1904539010;
      var10008 = (var1 | var2) & ~(var1 & var2);
      var2 = -239886263;
      var1 = var10008;
      this.A = new SliderSetting(
            c(
               "ﴚ셋ﴻ센﵅섻﵂섶ﴻ셊﵇셇拉센ﴵ섰ﴽ섹﴿섳",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳",
               var10005,
               var10006,
               var10007,
               (var1 | var2) & (~var1 | ~var2)
            ),
            0.3F,
            0.05F,
            0.8F,
            0.05F
         )
         .a(
            () -> {
               int var2x = 1217574089;
               int var1x = 2047114365;
               int var10003x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = 1451307971;
               var1x = var10003x;
               var10003x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = -1695027736;
               var1x = 393347026;
               int var10004x = (var1x | var2x) - (var1x & var2x);
               var2x = -575274823;
               var1x = var10004x;
               var10004x = (var1x | var2x) & (~var1x | ~var2x);
               int var10005x = (int)6385822551903257463L;
               var2x = -1926500301;
               var1x = var10005x;
               var10005x = var1x & ~var2x | ~var1x & var2x;
               var2x = -1659491033;
               var1x = var10005x;
               var10005x = (var1x | var2x) & (~var1x | ~var2x);
               int var10006x = (int)1232207088145572960L;
               var2x = -1600228352;
               var1x = var10006x;
               var10006x = var1x & ~var2x | ~var1x & var2x;
               var2x = -769178709;
               var1x = var10006x;
               if (this.a
                     .b(
                        c(
                           "簧ᒱ簈ᒰ簈ᒸ簆ᓅ砖ᒸ簈ᒱ簋ᒺ",
                           "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳",
                           var10003x,
                           var10004x,
                           var10005x,
                           var1x + var2x - 2 * (var1x & var2x)
                        )
                     )
                  && this.y.a()) {
                  var2x = -382463254;
                  var1x = 1572453206;
                  var10003x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = -795192629;
                  var1x = var10003x;
                  var10003x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = -754866840;
                  var1x = 1160126992;
                  var10004x = var1x & ~var2x | ~var1x & var2x;
                  var2x = -966485636;
                  var1x = var10004x;
                  var10004x = (var1x | var2x) & ~(var1x & var2x);
                  var10005x = (int)603235984616317637L;
                  var2x = 1229723940;
                  var1x = var10005x;
                  var10005x = var1x & ~var2x | ~var1x & var2x;
                  var2x = -1002250967;
                  var1x = var10005x;
                  var10005x = (var1x | var2x) & ~(var1x & var2x);
                  var10006x = (int)-1020201747729736722L;
                  var2x = -297171199;
                  var1x = var10006x;
                  var10006x = var1x + var2x - 2 * (var1x & var2x);
                  var2x = -2060385373;
                  var1x = var10006x;
                  if (this.z
                     .b(
                        c(
                           "簨ᠼ籽ᡊ簋ᠽ籹",
                           "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳",
                           var10003x,
                           var10004x,
                           var10005x,
                           (var1x | var2x) & (~var1x | ~var2x)
                        )
                     )) {
                     int var42x = (int)6488624916600777289L;
                     var2x = 1094845377;
                     var1x = var42x;
                     var42x = var1x & ~var2x | ~var1x & var2x;
                     var2x = -2080446071;
                     var1x = var42x;
                     return Boolean.valueOf(pulse.Bool.from((var1x | var2x) & (~var1x | ~var2x)));
                  }
               }

               var2x = -997563239;
               var1x = -1934684136;
               int var10000 = (var1x | var2x) - (var1x & var2x);
               var2x = 1210414209;
               var1x = var10000;
               return Boolean.valueOf(pulse.Bool.from((var1x | var2x) & ~(var1x & var2x)));
            }
         );
      var10005 = (int)-5594671106030869169L;
      var2 = -954602152;
      var1 = var10005;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = -85101728;
      var1 = var10005;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = -1608634234;
      var1 = 382522922;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1722119634;
      var1 = var10006;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1776881412;
      var1 = -1836401195;
      var10007 = (var1 | var2) & (~var1 | ~var2);
      var2 = 287875591;
      var1 = var10007;
      var10007 = (var1 | var2) & ~(var1 & var2);
      var2 = 2066058902;
      var1 = 526114635;
      var10008 = (var1 | var2) - (var1 & var2);
      var2 = 1686094920;
      var1 = var10008;
      var10003 = c("ﴭ鏒ﴼ鏓ﴰ鎧", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳", var10005, var10006, var10007, (var1 | var2) & ~(var1 & var2));
      var10004 = (int)-2693392537632032778L;
      var2 = -1539425810;
      var1 = var10004;
      var10004 = (var1 | var2) & ~(var1 & var2);
      var2 = 2113867292;
      var1 = var10004;
      String[] var1069 = new String[var1 & ~var2 | ~var1 & var2];
      var10006 = (int)-8997689261158999883L;
      var2 = -106982369;
      var1 = var10006;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var2 = 349883562;
      var1 = var10006;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1888133356;
      var1 = -1687517581;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var2 = 1879581200;
      var1 = var10009;
      var10009 = (var1 | var2) & (~var1 | ~var2);
      var10010 = (int)6765453617627195549L;
      var2 = -503425991;
      var1 = var10010;
      var10010 = (var1 | var2) & ~(var1 & var2);
      var2 = 1449476122;
      var1 = var10010;
      var10010 = var1 & ~var2 | ~var1 & var2;
      var10011 = (int)-6052453168345300823L;
      var2 = 1878114151;
      var1 = var10011;
      var10011 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1454623777;
      var1 = var10011;
      var10011 = (var1 | var2) & ~(var1 & var2);
      var10012 = (int)-1195973295977815681L;
      var2 = -1337122189;
      var1 = var10012;
      var10012 = var1 & ~var2 | ~var1 & var2;
      var2 = 68124121;
      var1 = var10012;
      var1069[var10006] = c(
         "ﴘ\uf892ﴴ\uf8e4﴾\uf897",
         "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳",
         var10009,
         var10010,
         var10011,
         (var1 | var2) - (var1 & var2)
      );
      var2 = -170955644;
      var1 = -298641316;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var2 = 469529817;
      var1 = var10006;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var10009 = (int)8762466076031756011L;
      var2 = 961932908;
      var1 = var10009;
      var10009 = (var1 | var2) & ~(var1 & var2);
      var2 = 655012848;
      var1 = var10009;
      var10009 = (var1 | var2) & ~(var1 & var2);
      var2 = 1481622625;
      var1 = -117972148;
      var10010 = (var1 | var2) & ~(var1 & var2);
      var2 = 1880193675;
      var1 = var10010;
      var10010 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1673385345;
      var1 = 1907065884;
      var10011 = (var1 | var2) & ~(var1 & var2);
      var2 = 174207524;
      var1 = var10011;
      var10011 = var1 + var2 - 2 * (var1 & var2);
      var10012 = (int)7605539274867104157L;
      var2 = -486356391;
      var1 = var10012;
      var10012 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1351470201;
      var1 = var10012;
      var1069[var10006] = c(
         "ﴒ姽ﵔ姸ﴱ妄", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳", var10009, var10010, var10011, (var1 | var2) & ~(var1 & var2)
      );
      var10006 = (int)-4393185797155572265L;
      var2 = 1873471939;
      var1 = var10006;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1206574102;
      var1 = var10006;
      var10006 = (var1 | var2) - (var1 & var2);
      var10009 = (int)4308694180497784693L;
      var2 = -1906223633;
      var1 = var10009;
      var10009 = (var1 | var2) & ~(var1 & var2);
      var2 = -1339403795;
      var1 = var10009;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var2 = 1277583984;
      var1 = 1521315360;
      var10010 = var1 & ~var2 | ~var1 & var2;
      var2 = -968944589;
      var1 = var10010;
      var10010 = (var1 | var2) & ~(var1 & var2);
      var2 = -863283910;
      var1 = 910860663;
      var10011 = var1 + var2 - 2 * (var1 & var2);
      var2 = -221284038;
      var1 = var10011;
      var10011 = (var1 | var2) & (~var1 | ~var2);
      var10012 = (int)-4108403361644471210L;
      var2 = -999212678;
      var1 = var10012;
      var10012 = var1 & ~var2 | ~var1 & var2;
      var2 = 795230038;
      var1 = var10012;
      var1069[var10006] = c(
         "ﴚ\u1c38﵆\u1c4aﴽᰵﴵ", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳", var10009, var10010, var10011, (var1 | var2) - (var1 & var2)
      );
      var2 = 1121210907;
      var1 = -140421510;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1250622366;
      var1 = var10006;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1101906702;
      var1 = 921924600;
      var10009 = (var1 | var2) & ~(var1 & var2);
      var2 = -323570563;
      var1 = var10009;
      var10009 = (var1 | var2) - (var1 & var2);
      var10010 = (int)-3318571396747981763L;
      var2 = -1608158807;
      var1 = var10010;
      var10010 = (var1 | var2) & ~(var1 & var2);
      var2 = -537469252;
      var1 = var10010;
      var10010 = (var1 | var2) & ~(var1 & var2);
      var2 = -1169888183;
      var1 = -928585823;
      var10011 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1880187075;
      var1 = var10011;
      var10011 = var1 & ~var2 | ~var1 & var2;
      var10012 = (int)-608619672112795581L;
      var2 = 1460571521;
      var1 = var10012;
      var10012 = (var1 | var2) - (var1 & var2);
      var2 = 1462065405;
      var1 = var10012;
      var1069[var10006] = c(
         "ﴚ⍶ﴵ⍺ﴹ⍽", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳", var10009, var10010, var10011, (var1 | var2) - (var1 & var2)
      );
      var10007 = (int)-3711048096322242028L;
      var2 = -43791286;
      var1 = var10007;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var2 = -2094625495;
      var1 = var10007;
      var10007 = (var1 | var2) & ~(var1 & var2);
      var2 = 1904295942;
      var1 = 1267314440;
      var10008 = var1 & ~var2 | ~var1 & var2;
      var2 = -359406766;
      var1 = var10008;
      var10008 = (var1 | var2) & ~(var1 & var2);
      var2 = -34728689;
      var1 = -938069314;
      var10009 = (var1 | var2) & ~(var1 & var2);
      var2 = 706831739;
      var1 = var10009;
      var10009 = (var1 | var2) - (var1 & var2);
      var2 = -922619364;
      var1 = -1344980853;
      var10010 = (var1 | var2) - (var1 & var2);
      var2 = 1727120612;
      var1 = var10010;
      this.B = new ModeSetting(
            var10003,
            var1069,
            c("ﴘ࠴ﴴࡂ﴾࠱", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳", var10007, var10008, var10009, var1 & ~var2 | ~var1 & var2)
         )
         .a(
            () -> {
               int var2x = 823170576;
               int var1x = 2132623754;
               int var10003x = (var1x | var2x) - (var1x & var2x);
               var2x = 706358509;
               var1x = var10003x;
               var10003x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = 709649026;
               var1x = -753844951;
               int var10004x = var1x + var2x - 2 * (var1x & var2x);
               var2x = -1457912687;
               var1x = var10004x;
               var10004x = var1x + var2x - 2 * (var1x & var2x);
               int var10005x = (int)-4685531186278886162L;
               var2x = -399410896;
               var1x = var10005x;
               var10005x = var1x & ~var2x | ~var1x & var2x;
               var2x = -480444172;
               var1x = var10005x;
               var10005x = (var1x | var2x) - (var1x & var2x);
               int var10006x = (int)6569425991075475395L;
               var2x = 272597211;
               var1x = var10006x;
               var10006x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = -532089959;
               var1x = var10006x;
               if (this.a
                     .b(
                        c(
                           "簤寸簋对簋寱簅完砕寱簋寸簈寳",
                           "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳",
                           var10003x,
                           var10004x,
                           var10005x,
                           var1x & ~var2x | ~var1x & var2x
                        )
                     )
                  && this.y.a()) {
                  var2x = -2120594186;
                  var1x = -1696667650;
                  var10003x = (var1x | var2x) - (var1x & var2x);
                  var2x = 2136166527;
                  var1x = var10003x;
                  var10003x = (var1x | var2x) & (~var1x | ~var2x);
                  var10004x = (int)-6520222626881696486L;
                  var2x = 1719724671;
                  var1x = var10004x;
                  var10004x = var1x + var2x - 2 * (var1x & var2x);
                  var2x = 849526820;
                  var1x = var10004x;
                  var10004x = (var1x | var2x) - (var1x & var2x);
                  var10005x = (int)1036166598089709821L;
                  var2x = -1236340741;
                  var1x = var10005x;
                  var10005x = (var1x | var2x) - (var1x & var2x);
                  var2x = 1514316157;
                  var1x = var10005x;
                  var10005x = (var1x | var2x) & (~var1x | ~var2x);
                  var10006x = (int)2587163119722947184L;
                  var2x = 1209237995;
                  var1x = var10006x;
                  var10006x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = 793660179;
                  var1x = var10006x;
                  if (this.z
                     .b(
                        c(
                           "簝꿿簌꿾簀꾊",
                           "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳",
                           var10003x,
                           var10004x,
                           var10005x,
                           var1x & ~var2x | ~var1x & var2x
                        )
                     )) {
                     int var42x = (int)7867110412251915210L;
                     var2x = -191021886;
                     var1x = var42x;
                     var42x = (var1x | var2x) & ~(var1x & var2x);
                     var2x = 261119753;
                     var1x = var42x;
                     return Boolean.valueOf(pulse.Bool.from((var1x | var2x) - (var1x & var2x)));
                  }
               }

               var2x = 1786075286;
               var1x = -407622306;
               int var10000 = var1x & ~var2x | ~var1x & var2x;
               var2x = -1916701240;
               var1x = var10000;
               return Boolean.valueOf(pulse.Bool.from(var1x + var2x - 2 * (var1x & var2x)));
            }
         );
      var2 = 803539864;
      var1 = -1453136693;
      var10005 = (var1 | var2) - (var1 & var2);
      var2 = -493874140;
      var1 = var10005;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var10006 = (int)-7865092262154809341L;
      var2 = 846744892;
      var1 = var10006;
      var10006 = (var1 | var2) - (var1 & var2);
      var2 = -701808299;
      var1 = var10006;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var10007 = (int)1807499210076272801L;
      var2 = -2050496537;
      var1 = var10007;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var2 = -434990485;
      var1 = var10007;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var2 = 681959765;
      var1 = 716117424;
      var10008 = (var1 | var2) & ~(var1 & var2);
      var2 = 38087268;
      var1 = var10008;
      this.C = new SliderSetting(
            c(
               "ﴤ\ud8c9ﴻ\ud8b3ﴻ\ud8b2﵇\ud8bf拉\ud8bbﴰ\ud8caﴱ\ud8c6﵅\ud8c3",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳",
               var10005,
               var10006,
               var10007,
               (var1 | var2) & ~(var1 & var2)
            ),
            1.0F,
            0.1F,
            3.0F,
            0.1F
         )
         .a(
            () -> {
               int var10003x = (int)-2017231587602343670L;
               int var2x = 1124962351;
               int var1x = var10003x;
               var10003x = (var1x | var2x) - (var1x & var2x);
               var2x = 676966994;
               var1x = var10003x;
               var10003x = (var1x | var2x) - (var1x & var2x);
               int var10004x = (int)-2478402397498659699L;
               var2x = -899749734;
               var1x = var10004x;
               var10004x = (var1x | var2x) & ~(var1x & var2x);
               var2x = 346347617;
               var1x = var10004x;
               var10004x = (var1x | var2x) & ~(var1x & var2x);
               int var10005x = (int)-9044359054519361009L;
               var2x = -1417250705;
               var1x = var10005x;
               var10005x = (var1x | var2x) - (var1x & var2x);
               var2x = 1420261848;
               var1x = var10005x;
               var10005x = var1x + var2x - 2 * (var1x & var2x);
               int var10006x = (int)5762334670033473482L;
               var2x = -913811553;
               var1x = var10006x;
               var10006x = var1x + var2x - 2 * (var1x & var2x);
               var2x = -443021847;
               var1x = var10006x;
               if (this.a
                     .b(
                        c(
                           "簥髄簊髅簊髍簄骰研髍簊髄簉髏",
                           "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳",
                           var10003x,
                           var10004x,
                           var10005x,
                           (var1x | var2x) & ~(var1x & var2x)
                        )
                     )
                  && this.y.a()) {
                  var10003x = (int)-9172321873267597859L;
                  var2x = 1174793656;
                  var1x = var10003x;
                  var10003x = var1x & ~var2x | ~var1x & var2x;
                  var2x = 1346685714;
                  var1x = var10003x;
                  var10003x = var1x + var2x - 2 * (var1x & var2x);
                  var2x = -930570696;
                  var1x = 619431671;
                  var10004x = (var1x | var2x) - (var1x & var2x);
                  var2x = -1136409956;
                  var1x = var10004x;
                  var10004x = (var1x | var2x) & (~var1x | ~var2x);
                  var10005x = (int)1524828478429006954L;
                  var2x = -932421376;
                  var1x = var10005x;
                  var10005x = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = -933768984;
                  var1x = var10005x;
                  var10005x = (var1x | var2x) - (var1x & var2x);
                  var2x = 1463327534;
                  var1x = -726503907;
                  var10006x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = -2088309078;
                  var1x = var10006x;
                  if (this.z
                     .b(
                        c(
                           "簜鳯簍鳮簁鲚",
                           "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳",
                           var10003x,
                           var10004x,
                           var10005x,
                           var1x + var2x - 2 * (var1x & var2x)
                        )
                     )) {
                     var2x = 1306683561;
                     var1x = 1946004596;
                     int var43x = var1x & ~var2x | ~var1x & var2x;
                     var2x = 1042269404;
                     var1x = var43x;
                     return Boolean.valueOf(pulse.Bool.from((var1x | var2x) & ~(var1x & var2x)));
                  }
               }

               int var10000 = (int)5371665771746827542L;
               var2x = -206151485;
               var1x = var10000;
               var10000 = (var1x | var2x) & ~(var1x & var2x);
               var2x = -760316459;
               var1x = var10000;
               return Boolean.valueOf(pulse.Bool.from(var1x + var2x - 2 * (var1x & var2x)));
            }
         );
      var2 = 1670601163;
      var1 = -570367951;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = -645643635;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var2 = 1766150693;
      var1 = 1570414652;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var2 = -464553864;
      var1 = var10006;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var10007 = (int)-2961968653956686708L;
      var2 = -1238907007;
      var1 = var10007;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var2 = 1702484866;
      var1 = var10007;
      var10007 = (var1 | var2) - (var1 & var2);
      var2 = 1627444337;
      var1 = 857275707;
      var10008 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1375905074;
      var1 = var10008;
      this.D = new SliderSetting(
            c(
               "ﴚ詊ﴻ訽﵅診﵂訷ﴻ詋﵇詆拉詂ﴰ訳ﴱ訿﵅診",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳",
               var10005,
               var10006,
               var10007,
               var1 + var2 - 2 * (var1 & var2)
            ),
            1.0F,
            0.1F,
            1.0F,
            0.05F
         )
         .a(
            () -> {
               int var10003x = (int)7384375344528717174L;
               int var2x = -752439341;
               int var1x = var10003x;
               var10003x = (var1x | var2x) & ~(var1x & var2x);
               var2x = -973594158;
               var1x = var10003x;
               var10003x = (var1x | var2x) & (~var1x | ~var2x);
               int var10004x = (int)113407160066368672L;
               var2x = -130231354;
               var1x = var10004x;
               var10004x = var1x & ~var2x | ~var1x & var2x;
               var2x = -1161506470;
               var1x = var10004x;
               var10004x = (var1x | var2x) - (var1x & var2x);
               int var10005x = (int)8209403805413640434L;
               var2x = 1988336096;
               var1x = var10005x;
               var10005x = var1x & ~var2x | ~var1x & var2x;
               var2x = 1772481134;
               var1x = var10005x;
               var10005x = (var1x | var2x) & ~(var1x & var2x);
               var2x = -815920450;
               var1x = -1818060754;
               int var10006x = (var1x | var2x) & ~(var1x & var2x);
               var2x = 1557001489;
               var1x = var10006x;
               if (this.a
                     .b(
                        c(
                           "簢\ue0fe簍\ue0ff簍\ue0f7簃\ue08a砓\ue0f7簍\ue0fe簎\ue0f5",
                           "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳",
                           var10003x,
                           var10004x,
                           var10005x,
                           (var1x | var2x) & ~(var1x & var2x)
                        )
                     )
                  && this.y.a()) {
                  var2x = -1814978291;
                  var1x = -1523765040;
                  var10003x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = 1391159978;
                  var1x = var10003x;
                  var10003x = (var1x | var2x) - (var1x & var2x);
                  var10004x = (int)4600798930082207660L;
                  var2x = -1212993228;
                  var1x = var10004x;
                  var10004x = var1x + var2x - 2 * (var1x & var2x);
                  var2x = -782623988;
                  var1x = var10004x;
                  var10004x = (var1x | var2x) & ~(var1x & var2x);
                  var10005x = (int)3202529737051970180L;
                  var2x = -1607951933;
                  var1x = var10005x;
                  var10005x = var1x + var2x - 2 * (var1x & var2x);
                  var2x = 1182179372;
                  var1x = var10005x;
                  var10005x = (var1x | var2x) & ~(var1x & var2x);
                  var2x = 504771665;
                  var1x = 1719928988;
                  var10006x = var1x + var2x - 2 * (var1x & var2x);
                  var2x = 2026013204;
                  var1x = var10006x;
                  if (this.z
                     .b(
                        c(
                           "簛㦨簊㦩簆㧝",
                           "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳",
                           var10003x,
                           var10004x,
                           var10005x,
                           (var1x | var2x) - (var1x & var2x)
                        )
                     )) {
                     int var43x = (int)253270855242718333L;
                     var2x = -690235687;
                     var1x = var43x;
                     var43x = var1x & ~var2x | ~var1x & var2x;
                     var2x = -395818331;
                     var1x = var43x;
                     return Boolean.valueOf(pulse.Bool.from((var1x | var2x) - (var1x & var2x)));
                  }
               }

               int var10000 = (int)-878872215140062372L;
               var2x = 99309746;
               var1x = var10000;
               var10000 = var1x & ~var2x | ~var1x & var2x;
               var2x = 1886843886;
               var1x = var10000;
               return Boolean.valueOf(pulse.Bool.from(var1x + var2x - 2 * (var1x & var2x)));
            }
         );
      var2 = 1161658609;
      var1 = -602751708;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var2 = -46610782;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var2 = 779465997;
      var1 = -951944484;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var2 = 966814509;
      var1 = var10006;
      var10006 = (var1 | var2) - (var1 & var2);
      var2 = -185746132;
      var1 = 1039209369;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      var2 = -846163041;
      var1 = var10007;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      var10008 = (int)-4425482101031663457L;
      var2 = 453501529;
      var1 = var10008;
      var10008 = (var1 | var2) & (~var1 | ~var2);
      var2 = -351351339;
      var1 = var10008;
      var10003 = c(
         "ﴣꅓﴰꄣ拉ꅛ﴾ꅙﴰꅜ﵇ꅑ", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳", var10005, var10006, var10007, var1 & ~var2 | ~var1 & var2
      );
      var2 = -712024858;
      var1 = -1619645883;
      var10004 = (var1 | var2) & ~(var1 & var2);
      var2 = 1257862818;
      var1 = var10004;
      this.E = new BooleanSetting(var10003, pulse.Bool.from((var1 | var2) - (var1 & var2)))
         .a(
            () -> {
               int var2x = 1552928437;
               int var1x = 1021217477;
               int var10003x = (var1x | var2x) - (var1x & var2x);
               var2x = 71745287;
               var1x = var10003x;
               var10003x = (var1x | var2x) - (var1x & var2x);
               var2x = 1082950824;
               var1x = -1898469550;
               int var10004x = (var1x | var2x) & ~(var1x & var2x);
               var2x = -1642117595;
               var1x = var10004x;
               var10004x = (var1x | var2x) & ~(var1x & var2x);
               int var10005x = (int)1979332862170844703L;
               var2x = -838835218;
               var1x = var10005x;
               var10005x = (var1x | var2x) & ~(var1x & var2x);
               var2x = -1929404137;
               var1x = var10005x;
               var10005x = var1x & ~var2x | ~var1x & var2x;
               var2x = 227858580;
               var1x = 517508570;
               int var10006x = var1x + var2x - 2 * (var1x & var2x);
               var2x = 325300845;
               var1x = var10006x;
               return this.a
                  .b(
                     c(
                        "簣恝簌恜簌恔簂怩砒恔簌恝簏恖",
                        "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳",
                        var10003x,
                        var10004x,
                        var10005x,
                        (var1x | var2x) - (var1x & var2x)
                     )
                  );
            }
         );
      var10005 = (int)8193005840437140976L;
      var2 = -602172287;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = -235359738;
      var1 = var10005;
      var10005 = (var1 | var2) - (var1 & var2);
      var2 = 622657095;
      var1 = 611286159;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var2 = -772641375;
      var1 = var10006;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var10007 = (int)6583578317810001291L;
      var2 = 290793287;
      var1 = var10007;
      var10007 = (var1 | var2) - (var1 & var2);
      var2 = 1384832235;
      var1 = var10007;
      var10007 = (var1 | var2) - (var1 & var2);
      var10008 = (int)6955764053814076482L;
      var2 = -2141125696;
      var1 = var10008;
      var10008 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1097733634;
      var1 = var10008;
      this.F = new ColorSetting(
            c(
               "ﴟ\uf7c2﵄\uf7b0ﴻ\uf7ceﴸ\uf7b9ﴼ\uf3d2﵃\uf7c0ﴰ\uf7b0",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳",
               var10005,
               var10006,
               var10007,
               var1 & ~var2 | ~var1 & var2
            ),
            Color.CYAN
         )
         .a(
            () -> {
               int var10003x = (int)-3281043992119430256L;
               int var2x = -834944411;
               int var1x = var10003x;
               var10003x = var1x + var2x - 2 * (var1x & var2x);
               var2x = -546927998;
               var1x = var10003x;
               var10003x = (var1x | var2x) & ~(var1x & var2x);
               var2x = -2012992542;
               var1x = -1418498405;
               int var10004x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = 1931759139;
               var1x = var10004x;
               var10004x = (var1x | var2x) - (var1x & var2x);
               int var10005x = (int)-7831509197233734899L;
               var2x = 541879317;
               var1x = var10005x;
               var10005x = (var1x | var2x) & ~(var1x & var2x);
               var2x = -280936480;
               var1x = var10005x;
               var10005x = (var1x | var2x) - (var1x & var2x);
               int var10006x = (int)8437087954903403878L;
               var2x = -219659620;
               var1x = var10006x;
               var10006x = (var1x | var2x) - (var1x & var2x);
               var2x = -395820185;
               var1x = var10006x;
               int var26x;
               if (this.a
                     .b(
                        c(
                           "簠\u0be0簏\u0be1簏௩簁ஔ砑௩簏\u0be0簌௫",
                           "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳",
                           var10003x,
                           var10004x,
                           var10005x,
                           (var1x | var2x) & ~(var1x & var2x)
                        )
                     )
                  && !this.E.a()) {
                  var2x = 2087336922;
                  var1x = -864155267;
                  var26x = var1x & ~var2x | ~var1x & var2x;
                  var2x = -1340853594;
                  var1x = var26x;
                  var26x = (var1x | var2x) - (var1x & var2x);
               } else {
                  var26x = (int)-633474251952151887L;
                  var2x = -1525701230;
                  var1x = var26x;
                  var26x = var1x & ~var2x | ~var1x & var2x;
                  var2x = -1962506461;
                  var1x = var26x;
                  var26x = (var1x | var2x) & ~(var1x & var2x);
               }

               return Boolean.valueOf(pulse.Bool.from(var26x));
            }
         );
      var2 = 652854131;
      var1 = 1634677688;
      int var1047 = (var1 | var2) & ~(var1 & var2);
      var2 = 596708284;
      var1 = var1047;
      int var1048 = var1 & ~var2 | ~var1 & var2;
      var10004 = (int)7049817643365954664L;
      var2 = -651045830;
      var1 = var10004;
      var10004 = var1 & ~var2 | ~var1 & var2;
      var2 = -2051039947;
      var1 = var10004;
      var10004 = var1 & ~var2 | ~var1 & var2;
      var10005 = (int)2321125872215623651L;
      var2 = 1276928693;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var2 = -1817992543;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1051312307;
      var1 = 1748703725;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var2 = 1452107296;
      var1 = var10006;
      String var10001 = c(
         "掠뵹數뵿怒", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳", var1048, var10004, var10005, var1 & ~var2 | ~var1 & var2
      );
      var2 = -739492366;
      var1 = 2127438245;
      var10004 = var1 + var2 - 2 * (var1 & var2);
      var2 = -919214304;
      var1 = var10004;
      var10004 = var1 & ~var2 | ~var1 & var2;
      var10005 = (int)-4497819946249614790L;
      var2 = -1516860364;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1791557244;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = 2003395656;
      var1 = -685102791;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var2 = -1226583196;
      var1 = var10006;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var10007 = (int)-2021593180719041256L;
      var2 = -926987927;
      var1 = var10007;
      var10007 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1314354640;
      var1 = var10007;
      this.G = Identifier.of(
         var10001,
         c(
            "辰讶諒讧殺计怒讠浪讹殺设掠诽掠讽異",
            "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳",
            var10004,
            var10005,
            var10006,
            (var1 | var2) & (~var1 | ~var2)
         )
      );
      this.H = new LinkedBlockingQueue<>();
      this.I = new LinkedBlockingQueue<>();
      this.J = new LinkedBlockingQueue<>();
   }

   @EventHandler
   public void a(EntityJumpEvent var1) {
      if (this.handleJumpEvent(var1)) {
         return;
      }

      if (var1.a() == c.player) {
         if (!c.options.getPerspective().isFirstPerson() || this.b.k()) {
            String var2;
            label37: {
               var2 = this.a.d();
               int var10003 = (int)-2606257664971291917L;
               int var7 = -1412008451;
               int var6 = var10003;
               var10003 = (var6 | var7) & ~(var6 & var7);
               var7 = -1711354759;
               var6 = var10003;
               var10003 = var6 + var7 - 2 * (var6 & var7);
               int var10004 = (int)5631849165662546489L;
               var7 = -734721963;
               var6 = var10004;
               var10004 = (var6 | var7) - (var6 & var7);
               var7 = -1069813870;
               var6 = var10004;
               var10004 = (var6 | var7) & (~var6 | ~var7);
               var7 = 1700813907;
               var6 = 471396615;
               int var10005 = var6 & ~var7 | ~var6 & var7;
               var7 = 2051320640;
               var6 = var10005;
               var10005 = (var6 | var7) & (~var6 | ~var7);
               int var10006 = (int)-6657329253137234886L;
               var7 = -2059508228;
               var6 = var10006;
               var10006 = var6 & ~var7 | ~var6 & var7;
               var7 = 2096497180;
               var6 = var10006;
               if (!var2.equals(
                  c(
                     "釸䥉釡䤻釠䥉闺䥍醚䤴釩",
                     "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳",
                     var10003,
                     var10004,
                     var10005,
                     var6 & ~var7 | ~var6 & var7
                  )
               )) {
                  var7 = 981440837;
                  var6 = 1808842911;
                  var10003 = var6 & ~var7 | ~var6 & var7;
                  var7 = 901292717;
                  var6 = var10003;
                  var10003 = (var6 | var7) & (~var6 | ~var7);
                  var7 = 625490817;
                  var6 = -1170828355;
                  var10004 = var6 & ~var7 | ~var6 & var7;
                  var7 = -1195946995;
                  var6 = var10004;
                  var10004 = var6 + var7 - 2 * (var6 & var7);
                  var7 = 713498508;
                  var6 = 101978534;
                  var10005 = (var6 | var7) - (var6 & var7);
                  var7 = 691137739;
                  var6 = var10005;
                  var10005 = (var6 | var7) & (~var6 | ~var7);
                  var7 = 337497499;
                  var6 = -419455462;
                  var10006 = var6 & ~var7 | ~var6 & var7;
                  var7 = -218879604;
                  var6 = var10006;
                  if (!var2.equals(
                     c(
                        "釀რ醙႓闺ᒋ闺ყ釪ს醘႘醜ძ",
                        "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳",
                        var10003,
                        var10004,
                        var10005,
                        (var6 | var7) & ~(var6 & var7)
                     )
                  )) {
                     break label37;
                  }
               }

               this.addCircle(c.player.getPos().add(0.0, 0.01F, 0.0));
            }

            label43: {
               int var103 = (int)-250683255656527477L;
               int var68 = -1493856584;
               int var25 = var103;
               var103 = (var25 | var68) & (~var25 | ~var68);
               var68 = -107594684;
               var25 = var103;
               var103 = var25 + var68 - 2 * (var25 & var68);
               var68 = -350823403;
               var25 = 610296523;
               int var115 = (var25 | var68) - (var25 & var68);
               var68 = -411954136;
               var25 = var115;
               var115 = (var25 | var68) & ~(var25 & var68);
               var68 = 1507593875;
               var25 = 1737958128;
               int var126 = (var25 | var68) & (~var25 | ~var68);
               var68 = 636300566;
               var25 = var126;
               var126 = var25 & ~var68 | ~var25 & var68;
               int var135 = (int)7733354373746093067L;
               var68 = -1882196304;
               var25 = var135;
               var135 = var25 + var68 - 2 * (var25 & var68);
               var68 = -20456855;
               var25 = var135;
               if (!var2.equals(
                  c(
                     "釸⩁釡⨳釠⩁闺⨸釪⨾醘⩇醜⨴",
                     "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳",
                     var103,
                     var115,
                     var126,
                     var25 + var68 - 2 * (var25 & var68)
                  )
               )) {
                  var68 = -1211860153;
                  var25 = 1347075541;
                  var103 = var25 & ~var68 | ~var25 & var68;
                  var68 = -2087109147;
                  var25 = var103;
                  var103 = (var25 | var68) & (~var25 | ~var68);
                  var115 = (int)1286588441619934915L;
                  var68 = 2051276369;
                  var25 = var115;
                  var115 = var25 & ~var68 | ~var25 & var68;
                  var68 = -1485927747;
                  var25 = var115;
                  var115 = (var25 | var68) & (~var25 | ~var68);
                  var68 = 1830185201;
                  var25 = 1699064067;
                  var126 = (var25 | var68) & ~(var25 & var68);
                  var68 = 315932601;
                  var25 = var126;
                  var126 = (var25 | var68) - (var25 & var68);
                  var68 = -514791273;
                  var25 = -834400419;
                  var135 = (var25 | var68) & ~(var25 & var68);
                  var68 = 789321665;
                  var25 = var135;
                  if (!var2.equals(
                     c(
                        "釀髦醙骕闺麍闺髡釪髧醘骞醜髭",
                        "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳",
                        var103,
                        var115,
                        var126,
                        (var25 | var68) - (var25 & var68)
                     )
                  )) {
                     break label43;
                  }
               }

               Vec3d var3 = new Vec3d(c.player.getX(), c.player.getY() + 0.1, c.player.getZ());
               int var10000 = this.m.b();
               int var10001 = (int)-7601880663065802518L;
               var68 = 1843788328;
               var25 = var10001;
               var10001 = var25 & ~var68 | ~var25 & var68;
               var68 = 1357427392;
               var25 = var10001;
               int var4 = var10000 * (var25 + var68 - 2 * (var25 & var68));
               var10000 = (int)-8218896012407619370L;
               var68 = 292333047;
               var25 = var10000;
               var10000 = var25 & ~var68 | ~var25 & var68;
               var68 = 1610442017;
               var25 = var10000;

               for (int var5 = (var25 | var68) - (var25 & var68); var5 < var4; var5++) {
                  this.a(var3, 0.15, this.o().getRGB());
               }
            }

            int var108 = (int)-2546971255553759957L;
            int var88 = 1969993692;
            int var45 = var108;
            var108 = (var45 | var88) & (~var45 | ~var88);
            var88 = 585771392;
            var45 = var108;
            var108 = (var45 | var88) & (~var45 | ~var88);
            int var120 = (int)5630485253188862508L;
            var88 = -710358038;
            var45 = var120;
            var120 = var45 & ~var88 | ~var45 & var88;
            var88 = 1736141439;
            var45 = var120;
            var120 = var45 + var88 - 2 * (var45 & var88);
            int var130 = (int)-5711302189209265410L;
            var88 = -872349067;
            var45 = var130;
            var130 = var45 + var88 - 2 * (var45 & var88);
            var88 = -522703630;
            var45 = var130;
            var130 = var45 + var88 - 2 * (var45 & var88);
            var88 = 47839945;
            var45 = -2106596381;
            int var138 = var45 + var88 - 2 * (var45 & var88);
            var88 = -2135629633;
            var45 = var138;
            if (var2.equals(
               c(
                  "釋錃釤錂釤錊釪鍷闺錊釤錃釧錈",
                  "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳",
                  var108,
                  var120,
                  var130,
                  var45 & ~var88 | ~var45 & var88
               )
            )) {
               float var8 = this.t.a();
               float var9 = var8 / this.u.a();
               this.I.add(new JumpCircles.CircleInstance(c.player.getPos(), var8, var9));
            }
         }
      }
   }

   @EventHandler
   public void a(WorldRenderEvent var1) {
      this.b(var1);
      this.renderJumpTexture(var1);
   }

   private boolean handleJumpEvent(EntityJumpEvent event) {
      if (c == null || c.player == null || c.options == null || event == null || event.a() != c.player) {
         return true;
      }

      if (c.options.getPerspective().isFirstPerson() && !this.b.a()) {
         return true;
      }

      Vec3d position = c.player.getPos();
      if (this.a.a(0) || this.a.a(2)) {
         this.addCircle(position.add(0.0, 0.01F, 0.0));
      }

      if (this.a.a(1) || this.a.a(2)) {
         this.spawnJumpParticles(position.add(0.0, 0.1, 0.0));
      }

      if (this.a.a(3)) {
         this.addBlockWave(position);
      }

      return true;
   }

   private void addCircle(Vec3d position) {
      float radius = this.f.a();
      float duration = radius / Math.max(0.05F, this.g.a());
      this.J.add(new JumpCircles.CircleInstance(position, radius, duration));
   }

   private void spawnJumpParticles(Vec3d position) {
      int color = ColorUtils.a(this.o().getRGB());
      int count = Math.max(1, this.m.b());
      int lifetime = Math.max(1, this.o.b());
      int spread = Math.max(1, lifetime / 5);
      float size = Math.max(0.01F, this.n.a());
      double force = Math.max(0.005, this.p.a());
      Identifier texture = this.particleTexture();
      String physicsMode = this.l.d();

      for (int i = 0; i < count; i++) {
         Vec3d velocity = new Vec3d(
            ThreadLocalRandom.current().nextDouble(-1.0, 1.0),
            ThreadLocalRandom.current().nextDouble(0.15, 1.0),
            ThreadLocalRandom.current().nextDouble(-1.0, 1.0)
         );
         if (velocity.lengthSquared() > 0.0) {
            velocity = velocity.normalize().multiply(ThreadLocalRandom.current().nextDouble(0.005, force));
         }

         int particleLifetime = Math.max(1, lifetime + ThreadLocalRandom.current().nextInt(-spread, spread + 1));
         float particleSize = Math.max(0.01F, size + (ThreadLocalRandom.current().nextFloat() - 0.5F) * 0.08F);
         HudServiceRegistry.PARTICLES.a(position, velocity, particleLifetime, particleSize, texture, color, physicsMode);
      }
   }

   private Identifier particleTexture() {
      return switch (this.k.k()) {
         case 1 -> Identifier.of("pulse", "textures/particle/sparkle.png");
         case 2 -> Identifier.of("pulse", "textures/particle/snowflake.png");
         case 3 -> Identifier.of("pulse", "textures/particle/glow.png");
         case 4 -> Identifier.of("pulse", "textures/particle/star.png");
         case 5 -> Identifier.of("pulse", "textures/particle/dollar.png");
         default -> Identifier.of("pulse", "textures/particle/heart.png");
      };
   }

   private void addBlockWave(Vec3d position) {
      float radius = this.t.a();
      float duration = radius / Math.max(0.05F, this.u.a());
      this.I.add(new JumpCircles.CircleInstance(position, radius, duration));
   }

   private void renderJumpTexture(WorldRenderEvent event) {
      if (c.world == null || this.J.isEmpty()) {
         return;
      }

      MatrixStack matrices = event.a();
      Matrix4f matrix = matrices.peek().getPositionMatrix();
      Vec3d camera = c.getEntityRenderDispatcher().camera.getPos();
      Color color = this.n();
      float red = color.getRed() / 255.0F;
      float green = color.getGreen() / 255.0F;
      float blue = color.getBlue() / 255.0F;
      ArrayList<JumpCircles.CircleInstance> expired = new ArrayList<>();
      boolean drew = false;
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.disableCull();
      RenderSystem.depthMask(false);
      RenderSystem.setShader(ShaderProgramKeys.POSITION_TEX_COLOR);
      RenderSystem.setShaderTexture(0, JUMP_TEXTURE);
      Tessellator tessellator = Tessellator.getInstance();
      BufferBuilder buffer = null;

      for (JumpCircles.CircleInstance circle : this.J) {
         circle.a();
         if (circle.b()) {
            expired.add(circle);
         } else {
            float radius = circle.c();
            float alpha = circle.d();
            if (radius > 0.01F && alpha > 0.01F) {
               if (buffer == null) {
                  buffer = tessellator.begin(DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
               }

               Vec3d pos = circle.a;
               float minX = (float)(pos.x - radius - camera.x);
               float maxX = (float)(pos.x + radius - camera.x);
               float y = (float)(pos.y + 0.025 - camera.y);
               float minZ = (float)(pos.z - radius - camera.z);
               float maxZ = (float)(pos.z + radius - camera.z);
               buffer.vertex(matrix, minX, y, minZ).texture(0.0F, 0.0F).color(red, green, blue, alpha);
               buffer.vertex(matrix, minX, y, maxZ).texture(0.0F, 1.0F).color(red, green, blue, alpha);
               buffer.vertex(matrix, maxX, y, maxZ).texture(1.0F, 1.0F).color(red, green, blue, alpha);
               buffer.vertex(matrix, maxX, y, minZ).texture(1.0F, 0.0F).color(red, green, blue, alpha);
               drew = true;
            }
         }
      }

      if (drew && buffer != null) {
         BufferRenderer.drawWithGlobalProgram(buffer.end());
      }

      RenderSystem.depthMask(true);
      RenderSystem.enableCull();
      RenderSystem.disableBlend();
      this.J.removeAll(expired);
   }

   private void a(Vec3d var1, double var2, int var4) {
      var4 = ColorUtils.a(var4);
      int var5 = this.m.b();
      int var6 = this.o.b();
      int var20 = -899177559;
      int var19 = -1752678993;
      int var10001 = var19 & ~var20 | ~var19 & var20;
      var20 = 1575984652;
      var19 = var10001;
      var20 = (var19 | var20) - (var19 & var20);
      var19 = var6;
      int var7 = (var19 & ~var20) - (~var19 & var20);
      var20 = -2017045227;
      var19 = -549845472;
      var10001 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1492931391;
      var19 = var10001;
      var20 = var19 + var20 - 2 * (var19 & var20);
      var19 = var6;
      int var8 = (var19 ^ var20) + 2 * (var19 & var20);
      float var9 = this.n.a();
      float var10 = var9 - 0.05F;
      float var11 = var9 + 0.05F;
      double var12 = this.p.a();
      String var14 = this.l.d();
      int var10000 = (int)2621587325811985090L;
      var20 = -1534020038;
      var19 = var10000;
      var10000 = var19 + var20 - 2 * (var19 & var20);
      var20 = -769639176;
      var19 = var10000;

      for (int var15 = (var19 | var20) - (var19 & var20); var15 < var5; var15++) {
         int var16 = ThreadLocalRandom.current().nextInt(var7, var8);
         float var17 = var10 + ThreadLocalRandom.current().nextFloat() * (var11 - var10);
         Vec3d var18 = new Vec3d(
            ThreadLocalRandom.current().nextDouble(-var2, var2),
            ThreadLocalRandom.current().nextDouble(0.0, var2),
            ThreadLocalRandom.current().nextDouble(-var2, var2)
         );
         if (var18.lengthSquared() > 0.0) {
            var18 = var18.normalize().multiply(ThreadLocalRandom.current().nextDouble(0.005, var12));
         }

         HudServiceRegistry.PARTICLES.a(var1, var18, var16, var17, this.p(), var4, var14);
      }
   }

   private Color n() {
      if (this.h.a()) {
         ClientColor var1 = ModuleRegistry.CLIENT_COLOR;
         return var1.n();
      } else {
         return this.i.a();
      }
   }

   private Color o() {
      if (this.q.a()) {
         ClientColor var1 = ModuleRegistry.CLIENT_COLOR;
         return var1.n();
      } else {
         return this.r.a();
      }
   }

   private Identifier p() {
      String var1 = this.k.d();
      String var2 = var1;
      int var10000 = (int)-3241810849562392742L;
      int var5 = -945390943;
      int var4 = var10000;
      var10000 = (var4 | var5) - (var4 & var5);
      var5 = 1921647108;
      var4 = var10000;
      int var3 = (var4 | var5) & ~(var4 & var5);
      switch (var2.hashCode()) {
         case -2018961832:
            var5 = -998050577;
            var4 = 1373442442;
            int var396 = (var4 | var5) & ~(var4 & var5);
            var5 = -246931950;
            var4 = var396;
            var396 = var4 & ~var5 | ~var4 & var5;
            var5 = -481969695;
            var4 = 672446241;
            int var445 = (var4 | var5) & ~(var4 & var5);
            var5 = -917030341;
            var4 = var445;
            var445 = (var4 | var5) & (~var4 | ~var5);
            var5 = -823074531;
            var4 = -1610273637;
            int var496 = var4 & ~var5 | ~var4 & var5;
            var5 = 2127268710;
            var4 = var496;
            var496 = (var4 | var5) & (~var4 | ~var5);
            var5 = 1410237580;
            var4 = -563611571;
            int var530 = (var4 | var5) & (~var4 | ~var5);
            var5 = -1973038908;
            var4 = var530;
            if (var2.equals(
               c("爩╇爽╌爰╇爲╊", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳", var396, var445, var496, var4 + var5 - 2 * (var4 & var5))
            )) {
               var10000 = (int)7110490869465523244L;
               var5 = 746499292;
               var4 = var10000;
               var10000 = (var4 | var5) - (var4 & var5);
               var5 = -111671054;
               var4 = var10000;
               var3 = var4 + var5 - 2 * (var4 & var5);
            }
            break;
         case 860345114:
            int var393 = (int)632185745074517065L;
            var5 = -775193431;
            var4 = var393;
            var393 = var4 + var5 - 2 * (var4 & var5);
            var5 = 1525150615;
            var4 = var393;
            var393 = (var4 | var5) & ~(var4 & var5);
            int var442 = (int)3338474590168859827L;
            var5 = -178284192;
            var4 = var442;
            var442 = (var4 | var5) & ~(var4 & var5);
            var5 = 1371990351;
            var4 = var442;
            var442 = (var4 | var5) - (var4 & var5);
            var5 = -1370710168;
            var4 = -800711160;
            int var494 = var4 + var5 - 2 * (var4 & var5);
            var5 = 1952543086;
            var4 = var494;
            var494 = var4 + var5 - 2 * (var4 & var5);
            int var528 = (int)2561747192111088834L;
            var5 = -859611160;
            var4 = var528;
            var528 = (var4 | var5) & (~var4 | ~var5);
            var5 = 1390391436;
            var4 = var528;
            if (var2.equals(
               c("爜ꋧ爳ꋢ爸ꊙ", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳", var393, var442, var494, (var4 | var5) & ~(var4 & var5))
            )) {
               var5 = -2050156675;
               var4 = 244815651;
               var10000 = var4 + var5 - 2 * (var4 & var5);
               var5 = -1957003173;
               var4 = var10000;
               var3 = (var4 | var5) & (~var4 | ~var5);
            }
            break;
         case 934967833:
            int var390 = (int)6896569766233739125L;
            var5 = 567151118;
            var4 = var390;
            var390 = var4 & ~var5 | ~var4 & var5;
            var5 = -388596212;
            var4 = var390;
            var390 = (var4 | var5) & (~var4 | ~var5);
            int var439 = (int)-5087608394304332563L;
            var5 = 524882730;
            var4 = var439;
            var439 = (var4 | var5) & ~(var4 & var5);
            var5 = -126221798;
            var4 = var439;
            var439 = var4 + var5 - 2 * (var4 & var5);
            int var491 = (int)-6206168634767930885L;
            var5 = 1062265350;
            var4 = var491;
            var491 = var4 & ~var5 | ~var4 & var5;
            var5 = 241357426;
            var4 = var491;
            var491 = var4 + var5 - 2 * (var4 & var5);
            var5 = -978422943;
            var4 = 760912619;
            int var527 = (var4 | var5) - (var4 & var5);
            var5 = -386028179;
            var4 = var527;
            if (var2.equals(
               c("爟춪爽춯爼춨", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳", var390, var439, var491, (var4 | var5) & ~(var4 & var5))
            )) {
               var5 = -600877812;
               var4 = 1346649507;
               var10000 = (var4 | var5) - (var4 & var5);
               var5 = -1939117909;
               var4 = var10000;
               var3 = var4 + var5 - 2 * (var4 & var5);
            }
            break;
         case 1001367009:
            var5 = -1433397334;
            var4 = -1438877168;
            int var388 = var4 & ~var5 | ~var4 & var5;
            var5 = 1690015437;
            var4 = var388;
            var388 = (var4 | var5) & (~var4 | ~var5);
            var5 = 353262646;
            var4 = -1048950969;
            int var437 = (var4 | var5) - (var4 & var5);
            var5 = -700139886;
            var4 = var437;
            var437 = var4 & ~var5 | ~var4 & var5;
            int var488 = (int)-738967396088360372L;
            var5 = -82840658;
            var4 = var488;
            var488 = (var4 | var5) & (~var4 | ~var5);
            var5 = 2145841378;
            var4 = var488;
            var488 = (var4 | var5) & (~var4 | ~var5);
            var5 = -1421609756;
            var4 = 309455401;
            int var526 = (var4 | var5) & ~(var4 & var5);
            var5 = -1190839776;
            var4 = var526;
            if (var2.equals(
               c("爐귓爲귒爸", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳", var388, var437, var488, (var4 | var5) - (var4 & var5))
            )) {
               var10000 = (int)-2855443145224038470L;
               var5 = -1784385136;
               var4 = var10000;
               var10000 = var4 & ~var5 | ~var4 & var5;
               var5 = 20751915;
               var4 = var10000;
               var3 = (var4 | var5) & (~var4 | ~var5);
            }
            break;
         case 1224355287:
            int var385 = (int)-8929814507954924956L;
            var5 = 1871649373;
            var4 = var385;
            var385 = (var4 | var5) & (~var4 | ~var5);
            var5 = 1823437646;
            var4 = var385;
            var385 = (var4 | var5) & ~(var4 & var5);
            int var434 = (int)4953593501855795056L;
            var5 = -972255758;
            var4 = var434;
            var434 = (var4 | var5) - (var4 & var5);
            var5 = -1409398476;
            var4 = var434;
            var434 = var4 + var5 - 2 * (var4 & var5);
            int var485 = (int)3013202992110574398L;
            var5 = 1345864186;
            var4 = var485;
            var485 = var4 & ~var5 | ~var4 & var5;
            var5 = 1313318243;
            var4 = var485;
            var485 = var4 & ~var5 | ~var4 & var5;
            var5 = -1190826185;
            var4 = 2030735301;
            int var525 = (var4 | var5) - (var4 & var5);
            var5 = -1068819918;
            var4 = var525;
            if (var2.equals(
               c("爩玊版王牎玊", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳", var385, var434, var485, (var4 | var5) & (~var4 | ~var5))
            )) {
               var5 = -1941021688;
               var4 = 2081581585;
               var10000 = (var4 | var5) - (var4 & var5);
               var5 = -262392295;
               var4 = var10000;
               var3 = (var4 | var5) & ~(var4 & var5);
            }
            break;
         case 1227580930:
            var5 = -601504336;
            var4 = 1165468736;
            int var10003 = (var4 | var5) & ~(var4 & var5);
            var5 = -45770105;
            var4 = var10003;
            var10003 = (var4 | var5) & ~(var4 & var5);
            int var10004 = (int)7669913305617827953L;
            var5 = 1873673178;
            var4 = var10004;
            var10004 = (var4 | var5) - (var4 & var5);
            var5 = -621800345;
            var4 = var10004;
            var10004 = var4 & ~var5 | ~var4 & var5;
            int var10005 = (int)4668326996133749954L;
            var5 = 1337349765;
            var4 = var10005;
            var10005 = (var4 | var5) & (~var4 | ~var5);
            var5 = 635081407;
            var4 = var10005;
            var10005 = var4 & ~var5 | ~var4 & var5;
            var5 = -1615135820;
            var4 = -1705519466;
            int var10006 = var4 & ~var5 | ~var4 & var5;
            var5 = 97711092;
            var4 = var10006;
            if (var2.equals(
               c("爩垑片垔爰垜", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳", var10003, var10004, var10005, var4 + var5 - 2 * (var4 & var5))
            )) {
               var10000 = (int)898869454226317246L;
               var5 = -2005625659;
               var4 = var10000;
               var10000 = (var4 | var5) & (~var4 | ~var5);
               var5 = 518998904;
               var4 = var10000;
               var3 = var4 & ~var5 | ~var4 & var5;
            }
      }

      switch (var3) {
         case 0:
            var5 = -73894533;
            var4 = -771085269;
            int var382 = (var4 | var5) - (var4 & var5);
            var5 = 1300603431;
            var4 = var382;
            var382 = var4 & ~var5 | ~var4 & var5;
            int var426 = (int)-5604207025876755409L;
            var5 = 1898883175;
            var4 = var426;
            var426 = (var4 | var5) & (~var4 | ~var5);
            var5 = -1917061237;
            var4 = var426;
            var426 = (var4 | var5) & ~(var4 & var5);
            int var478 = (int)-5781385552716570462L;
            var5 = -762899750;
            var4 = var478;
            var478 = (var4 | var5) & (~var4 | ~var5);
            var5 = 1284318106;
            var4 = var478;
            var478 = (var4 | var5) & ~(var4 & var5);
            int var521 = (int)-2044950377991856001L;
            var5 = 457880542;
            var4 = var521;
            var521 = (var4 | var5) & (~var4 | ~var5);
            var5 = 1533389164;
            var4 = var521;
            String var368 = c(
               "癸㟇癤㟁癭", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳", var382, var426, var478, var4 + var5 - 2 * (var4 & var5)
            );
            var426 = (int)2833974272278867381L;
            var5 = -1719307434;
            var4 = var426;
            var426 = (var4 | var5) & (~var4 | ~var5);
            var5 = 341157268;
            var4 = var426;
            var426 = (var4 | var5) & (~var4 | ~var5);
            var5 = -1574343888;
            var4 = -1734612420;
            var478 = (var4 | var5) & (~var4 | ~var5);
            var5 = 955970711;
            var4 = var478;
            var478 = (var4 | var5) & ~(var4 & var5);
            var5 = 1962858362;
            var4 = 874733337;
            var521 = var4 + var5 - 2 * (var4 & var5);
            var5 = 1082774908;
            var4 = var521;
            var521 = var4 + var5 - 2 * (var4 & var5);
            int var539 = (int)6524394477530329895L;
            var5 = 1253196689;
            var4 = var539;
            var539 = (var4 | var5) & (~var4 | ~var5);
            var5 = -313811949;
            var4 = var539;
            return Identifier.of(
               var368,
               c(
                  "發憿癰憮白憨癭憩瘧憪癩憨發憳癫憶癭懵癠憿癩憨發懴癸憴癯",
                  "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳",
                  var426,
                  var478,
                  var521,
                  (var4 | var5) - (var4 & var5)
               )
            );
         case 1:
            var5 = -1578531153;
            var4 = 731206076;
            int var380 = var4 + var5 - 2 * (var4 & var5);
            var5 = -294966172;
            var4 = var380;
            var380 = var4 + var5 - 2 * (var4 & var5);
            var5 = -772986976;
            var4 = -106222643;
            int var422 = var4 + var5 - 2 * (var4 & var5);
            var5 = 705691151;
            var4 = var422;
            var422 = (var4 | var5) & (~var4 | ~var5);
            int var473 = (int)-6013812271301635400L;
            var5 = 1347031922;
            var4 = var473;
            var473 = var4 & ~var5 | ~var4 & var5;
            var5 = 1602922735;
            var4 = var473;
            var473 = (var4 | var5) & (~var4 | ~var5);
            var5 = 876581512;
            var4 = -86583098;
            int var517 = (var4 | var5) & ~(var4 & var5);
            var5 = -826727646;
            var4 = var517;
            String var367 = c(
               "癸\ue466癤\ue460癭", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳", var380, var422, var473, var4 + var5 - 2 * (var4 & var5)
            );
            var5 = -332308586;
            var4 = -2105731082;
            var422 = (var4 | var5) & ~(var4 & var5);
            var5 = 173781783;
            var4 = var422;
            var422 = var4 + var5 - 2 * (var4 & var5);
            var5 = -528129684;
            var4 = 5487002;
            var473 = (var4 | var5) & ~(var4 & var5);
            var5 = -490581205;
            var4 = var473;
            var473 = (var4 | var5) - (var4 & var5);
            var517 = (int)3355107314097990036L;
            var5 = -456480466;
            var4 = var517;
            var517 = (var4 | var5) - (var4 & var5);
            var5 = -2119987032;
            var4 = var517;
            var517 = (var4 | var5) & ~(var4 & var5);
            var5 = 250069498;
            var4 = 1569116098;
            int var538 = (var4 | var5) & ~(var4 & var5);
            var5 = 1400507615;
            var4 = var538;
            return Identifier.of(
               var367,
               c(
                  "發追癰迬白迪癭迫瘧迨癩迪發迱癫迴癭辷登迨癩迪癣迴癭辶癸迶癯",
                  "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳",
                  var422,
                  var473,
                  var517,
                  var4 + var5 - 2 * (var4 & var5)
               )
            );
         case 2:
            var5 = 2061205471;
            var4 = -816282952;
            int var378 = var4 + var5 - 2 * (var4 & var5);
            var5 = -778828272;
            var4 = var378;
            var378 = var4 + var5 - 2 * (var4 & var5);
            var5 = 1172254800;
            var4 = -749356263;
            int var418 = (var4 | var5) & ~(var4 & var5);
            var5 = -1798577654;
            var4 = var418;
            var418 = var4 & ~var5 | ~var4 & var5;
            int var467 = (int)-4575257987499447443L;
            var5 = 1998914158;
            var4 = var467;
            var467 = var4 + var5 - 2 * (var4 & var5);
            var5 = -2115370799;
            var4 = var467;
            var467 = var4 & ~var5 | ~var4 & var5;
            var5 = 183781140;
            var4 = -248177707;
            int var514 = (var4 | var5) & (~var4 | ~var5);
            var5 = -75055988;
            var4 = var514;
            String var366 = c(
               "癸浇癤流癭", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳", var378, var418, var467, var4 & ~var5 | ~var4 & var5
            );
            var5 = 493252393;
            var4 = 1557688464;
            var418 = (var4 | var5) & ~(var4 & var5);
            var5 = 631891150;
            var4 = var418;
            var418 = var4 + var5 - 2 * (var4 & var5);
            var467 = (int)3042977580413727640L;
            var5 = 1755033352;
            var4 = var467;
            var467 = var4 & ~var5 | ~var4 & var5;
            var5 = -964389441;
            var4 = var467;
            var467 = var4 & ~var5 | ~var4 & var5;
            var5 = -1431989230;
            var4 = -2132582413;
            var514 = (var4 | var5) & (~var4 | ~var5);
            var5 = 1030737951;
            var4 = var514;
            var514 = (var4 | var5) & ~(var4 & var5);
            var5 = -873937514;
            var4 = 686765956;
            int var537 = var4 & ~var5 | ~var4 & var5;
            var5 = -484773333;
            var4 = var537;
            return Identifier.of(
               var366,
               c(
                  "發责癰贲白贴癭贵瘧贶癩贴發贯癫贪癭赩登质癧贱癮贪癩购癭赨癸质癯",
                  "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳",
                  var418,
                  var467,
                  var514,
                  var4 + var5 - 2 * (var4 & var5)
               )
            );
         case 3:
            int var375 = (int)4107642337636035213L;
            var5 = 184713554;
            var4 = var375;
            var375 = (var4 | var5) - (var4 & var5);
            var5 = 808702120;
            var4 = var375;
            var375 = (var4 | var5) & ~(var4 & var5);
            var5 = -1746455744;
            var4 = 1823089891;
            int var413 = (var4 | var5) - (var4 & var5);
            var5 = -116831090;
            var4 = var413;
            var413 = var4 & ~var5 | ~var4 & var5;
            int var462 = (int)3106382484435714638L;
            var5 = -967949017;
            var4 = var462;
            var462 = var4 & ~var5 | ~var4 & var5;
            var5 = -1375152174;
            var4 = var462;
            var462 = var4 + var5 - 2 * (var4 & var5);
            var5 = 1812580270;
            var4 = 341321860;
            int var511 = (var4 | var5) - (var4 & var5);
            var5 = 2015051037;
            var4 = var511;
            String var365 = c(
               "癸弽癤弻癭", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳", var375, var413, var462, (var4 | var5) & ~(var4 & var5)
            );
            var413 = (int)5287760202755737136L;
            var5 = -954876959;
            var4 = var413;
            var413 = (var4 | var5) - (var4 & var5);
            var5 = -575256922;
            var4 = var413;
            var413 = (var4 | var5) & (~var4 | ~var5);
            var5 = -2129316986;
            var4 = -454055507;
            var462 = var4 & ~var5 | ~var4 & var5;
            var5 = 1742796706;
            var4 = var462;
            var462 = (var4 | var5) & (~var4 | ~var5);
            var5 = -1319657875;
            var4 = -2052125064;
            var511 = var4 & ~var5 | ~var4 & var5;
            var5 = 860658619;
            var4 = var511;
            var511 = var4 & ~var5 | ~var4 & var5;
            var5 = -427319913;
            var4 = -1310462835;
            int var536 = (var4 | var5) & (~var4 | ~var5);
            var5 = 1464112521;
            var4 = var536;
            return Identifier.of(
               var365,
               c(
                  "發榉癰榘白榞癭榟瘧榜癩榞發榅癫榀癭槃癯榀癧榛瘦榜癦榋",
                  "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳",
                  var413,
                  var462,
                  var511,
                  (var4 | var5) & ~(var4 & var5)
               )
            );
         case 4:
            var5 = -1771985542;
            var4 = 1761699336;
            int var373 = (var4 | var5) - (var4 & var5);
            var5 = -1686685691;
            var4 = var373;
            var373 = (var4 | var5) & (~var4 | ~var5);
            var5 = -1268989379;
            var4 = 774769685;
            int var409 = (var4 | var5) - (var4 & var5);
            var5 = -1685224655;
            var4 = var409;
            var409 = (var4 | var5) & (~var4 | ~var5);
            int var457 = (int)7269140322715786226L;
            var5 = -1458308174;
            var4 = var457;
            var457 = (var4 | var5) & (~var4 | ~var5);
            var5 = -1836778555;
            var4 = var457;
            var457 = var4 & ~var5 | ~var4 & var5;
            int var507 = (int)4796240826463450442L;
            var5 = 1134279043;
            var4 = var507;
            var507 = var4 & ~var5 | ~var4 & var5;
            var5 = -49674006;
            var4 = var507;
            String var364 = c(
               "癸䤩癤䤯癭", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳", var373, var409, var457, var4 + var5 - 2 * (var4 & var5)
            );
            var5 = 1282186407;
            var4 = -1062109654;
            var409 = (var4 | var5) - (var4 & var5);
            var5 = -389408262;
            var4 = var409;
            var409 = var4 & ~var5 | ~var4 & var5;
            var5 = 2086401810;
            var4 = -2046565773;
            var457 = (var4 | var5) & ~(var4 & var5);
            var5 = -73244679;
            var4 = var457;
            var457 = var4 & ~var5 | ~var4 & var5;
            var5 = -194049921;
            var4 = 1301335030;
            var507 = var4 + var5 - 2 * (var4 & var5);
            var5 = -1348665724;
            var4 = var507;
            var507 = (var4 | var5) - (var4 & var5);
            int var534 = (int)3770378666991078950L;
            var5 = -827714964;
            var4 = var534;
            var534 = var4 + var5 - 2 * (var4 & var5);
            var5 = 337386984;
            var4 = var534;
            return Identifier.of(
               var364,
               c(
                  "發䲸癰䲩白䲯癭䲮瘧䲭癩䲯發䲴癫䲱癭䳲登䲩癩䲯瘦䲭癦䲺",
                  "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳",
                  var409,
                  var457,
                  var507,
                  var4 + var5 - 2 * (var4 & var5)
               )
            );
         case 5:
            int var370 = (int)5912935085275309896L;
            var5 = -84629009;
            var4 = var370;
            var370 = (var4 | var5) - (var4 & var5);
            var5 = 1461990864;
            var4 = var370;
            var370 = var4 & ~var5 | ~var4 & var5;
            int var403 = (int)-7655971299290178087L;
            var5 = -815684771;
            var4 = var403;
            var403 = (var4 | var5) - (var4 & var5);
            var5 = 1514958022;
            var4 = var403;
            var403 = (var4 | var5) & (~var4 | ~var5);
            var5 = -39461405;
            var4 = -1977916716;
            int var453 = (var4 | var5) & ~(var4 & var5);
            var5 = 1648919352;
            var4 = var453;
            var453 = (var4 | var5) - (var4 & var5);
            int var503 = (int)6857076755598721536L;
            var5 = 1121363329;
            var4 = var503;
            var503 = var4 & ~var5 | ~var4 & var5;
            var5 = -708759859;
            var4 = var503;
            String var363 = c(
               "癸쑆癤쑀癭", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳", var370, var403, var453, (var4 | var5) - (var4 & var5)
            );
            var403 = (int)-3718207073886031818L;
            var5 = 45509725;
            var4 = var403;
            var403 = var4 & ~var5 | ~var4 & var5;
            var5 = -653514980;
            var4 = var403;
            var403 = var4 + var5 - 2 * (var4 & var5);
            var5 = 355178614;
            var4 = 849894794;
            var453 = (var4 | var5) & (~var4 | ~var5);
            var5 = 632887822;
            var4 = var453;
            var453 = (var4 | var5) - (var4 & var5);
            var5 = -1654993833;
            var4 = 1915425759;
            var503 = (var4 | var5) & ~(var4 & var5);
            var5 = -82008132;
            var4 = var503;
            var503 = var4 + var5 - 2 * (var4 & var5);
            int var532 = (int)-216853999046516136L;
            var5 = -341206143;
            var4 = var532;
            var532 = var4 + var5 - 2 * (var4 & var5);
            var5 = 962424613;
            var4 = var532;
            return Identifier.of(
               var363,
               c(
                  "發\udbe6癰\udbf7白\udbf1癭\udbf0瘧\udbf3癩\udbf1發\udbea癫\udbef癭\udbac癬\udbec癤\udbef癩\udbf1瘦\udbf3癦\udbe4",
                  "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳",
                  var403,
                  var453,
                  var503,
                  var4 & ~var5 | ~var4 & var5
               )
            );
         default:
            var5 = 1422814423;
            var4 = -1205078916;
            int var10002 = (var4 | var5) - (var4 & var5);
            var5 = -1997380644;
            var4 = var10002;
            var10002 = (var4 | var5) - (var4 & var5);
            int var398 = (int)-6620851810758680154L;
            var5 = 599323484;
            var4 = var398;
            var398 = var4 & ~var5 | ~var4 & var5;
            var5 = 2090353736;
            var4 = var398;
            var398 = (var4 | var5) - (var4 & var5);
            int var447 = (int)5610551648020486189L;
            var5 = 1771576647;
            var4 = var447;
            var447 = (var4 | var5) & ~(var4 & var5);
            var5 = 64379887;
            var4 = var447;
            var447 = (var4 | var5) & ~(var4 & var5);
            int var498 = (int)4021691795522444760L;
            var5 = -561921192;
            var4 = var498;
            var498 = (var4 | var5) & (~var4 | ~var5);
            var5 = -1969810628;
            var4 = var498;
            String var362 = c(
               "癸肶癤肰癭", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳", var10002, var398, var447, (var4 | var5) & (~var4 | ~var5)
            );
            var5 = 1533990322;
            var4 = 1412814438;
            var398 = var4 & ~var5 | ~var4 & var5;
            var5 = 1800206499;
            var4 = var398;
            var398 = (var4 | var5) & ~(var4 & var5);
            var447 = (int)7059928017540853653L;
            var5 = 1462079706;
            var4 = var447;
            var447 = var4 + var5 - 2 * (var4 & var5);
            var5 = 797149362;
            var4 = var447;
            var447 = var4 + var5 - 2 * (var4 & var5);
            var498 = (int)1176786328332477279L;
            var5 = -1945052574;
            var4 = var498;
            var498 = (var4 | var5) & (~var4 | ~var5);
            var5 = -571539049;
            var4 = var498;
            var498 = var4 & ~var5 | ~var4 & var5;
            var5 = 1854583384;
            var4 = -1025610424;
            int var531 = (var4 | var5) & ~(var4 & var5);
            var5 = -1403850729;
            var4 = var531;
            return Identifier.of(
               var362,
               c(
                  "發ꈝ癰ꈌ白ꈊ癭ꈋ瘧ꈈ癩ꈊ發ꈑ癫ꈔ癭ꉗ癠ꈝ癩ꈊ發ꉖ癸ꈖ癯",
                  "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳",
                  var398,
                  var447,
                  var498,
                  (var4 | var5) & ~(var4 & var5)
               )
            );
      }
   }

   private float a(float var1) {
      return var1 == 1.0F ? 1.0F : 1.0F - (float)Math.pow(2.0, -10.0F * var1);
   }

   private void b(WorldRenderEvent var1) {
      if (c.world != null) {
         Vec3d var3;
         Matrix4f var4;
         Color var5;
         float var6;
         float var7;
         float var8;
         float var9;
         float var10;
         int var89;
         label24: {
            Camera var2 = c.getEntityRenderDispatcher().camera;
            var3 = var2.getPos();
            var1.a().push();
            RenderSystem.enableBlend();
            var89 = (int)-3981598387633298236L;
            int var17 = -299061897;
            int var16 = var89;
            var89 = (var16 | var17) & ~(var16 & var17);
            var17 = 1291176625;
            var16 = var89;
            var89 = (var16 | var17) & (~var16 | ~var17);
            int var10001 = (int)8694192727067964331L;
            var17 = -1335492128;
            var16 = var10001;
            var10001 = var16 & ~var17 | ~var16 & var17;
            var17 = 30257480;
            var16 = var10001;
            var10001 = (var16 | var17) & (~var16 | ~var17);
            var17 = -1938983658;
            var16 = 1896010396;
            int var10002 = var16 & ~var17 | ~var16 & var17;
            var17 = -43014261;
            var16 = var10002;
            var10002 = (var16 | var17) & (~var16 | ~var17);
            var17 = -2041884221;
            var16 = -169726562;
            int var10003 = var16 & ~var17 | ~var16 & var17;
            var17 = 1940487261;
            var16 = var10003;
            RenderSystem.blendFuncSeparate(var89, var10001, var10002, var16 & ~var17 | ~var16 & var17);
            RenderSystem.enableDepthTest();
            var89 = (int)1574873312453781117L;
            var17 = -890373345;
            var16 = var89;
            var89 = (var16 | var17) & ~(var16 & var17);
            var17 = -907993247;
            var16 = var89;
            RenderSystem.depthFunc((var16 | var17) - (var16 & var17));
            RenderSystem.setShader(ShaderProgramKeys.POSITION_COLOR);
            var4 = var1.a().peek().getPositionMatrix();
            var5 = this.r();
            var6 = var5.getRed() / 255.0F;
            var7 = var5.getGreen() / 255.0F;
            var8 = var5.getBlue() / 255.0F;
            var9 = this.v.a();
            var10 = this.A.a();
            if (this.y.a()) {
               var17 = 1586435498;
               var16 = -588777968;
               var10003 = (var16 | var17) & ~(var16 & var17);
               var17 = -427878195;
               var16 = var10003;
               var10003 = (var16 | var17) - (var16 & var17);
               var17 = 2020931188;
               var16 = 309294479;
               int var10004 = (var16 | var17) - (var16 & var17);
               var17 = -147773507;
               var16 = var10004;
               var10004 = (var16 | var17) & (~var16 | ~var17);
               var17 = -1203138192;
               var16 = -1215437954;
               int var10005 = var16 + var17 - 2 * (var16 & var17);
               var17 = 164966557;
               var16 = var10005;
               var10005 = (var16 | var17) & ~(var16 & var17);
               int var10006 = (int)5566824648839461619L;
               var17 = -1269746006;
               var16 = var10006;
               var10006 = (var16 | var17) & (~var16 | ~var17);
               var17 = -1396970795;
               var16 = var10006;
               if (!this.z
                  .b(
                     c(
                        "紜ꃺ納ꃻ紁ꂏ",
                        "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳",
                        var10003,
                        var10004,
                        var10005,
                        (var16 | var17) & (~var16 | ~var17)
                     )
                  )) {
                  var17 = -1104034155;
                  var16 = -364176812;
                  var89 = (var16 | var17) & ~(var16 & var17);
                  var17 = 1417338048;
                  var16 = var89;
                  var89 = (var16 | var17) - (var16 & var17);
                  break label24;
               }
            }

            var17 = -756842717;
            var16 = -267591374;
            var89 = (var16 | var17) & (~var16 | ~var17);
            var17 = 586128913;
            var16 = var89;
            var89 = (var16 | var17) - (var16 & var17);
         }

         int var11;
         boolean var12;
         label19: {
            var11 = var89;
            var12 = this.w.a();
            if (this.y.a()) {
               int var100 = (int)8528104978980186058L;
               int var72 = -519908298;
               int var39 = var100;
               var100 = (var39 | var72) & ~(var39 & var72);
               var72 = -498104181;
               var39 = var100;
               var100 = var39 + var72 - 2 * (var39 & var72);
               int var104 = (int)-882786422908445881L;
               var72 = 1874439373;
               var39 = var104;
               var104 = (var39 | var72) - (var39 & var72);
               var72 = 10895335;
               var39 = var104;
               var104 = (var39 | var72) & (~var39 | ~var72);
               int var108 = (int)3633781189779503429L;
               var72 = 1533928532;
               var39 = var108;
               var108 = (var39 | var72) & (~var39 | ~var72);
               var72 = 321617988;
               var39 = var108;
               var108 = var39 & ~var72 | ~var39 & var72;
               var72 = 1467404159;
               var39 = -1140217100;
               int var112 = var39 + var72 - 2 * (var39 & var72);
               var72 = -345018568;
               var39 = var112;
               if (this.z
                  .b(
                     c(
                        "紜賅納賄紁貰",
                        "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳",
                        var100,
                        var104,
                        var108,
                        (var39 | var72) - (var39 & var72)
                     )
                  )) {
                  var72 = -181198311;
                  var39 = -1156075039;
                  var89 = (var39 | var72) & (~var39 | ~var72);
                  var72 = 1311020025;
                  var39 = var89;
                  var89 = (var39 | var72) - (var39 & var72);
                  break label19;
               }
            }

            var89 = (int)-76713515226285269L;
            int var80 = -1773258128;
            int var47 = var89;
            var89 = (var47 | var80) & ~(var47 & var80);
            var80 = 1228472667;
            var47 = var89;
            var89 = (var47 | var80) - (var47 & var80);
         }

         int var13 = var89;
         double var14 = 0.005;
         this.I
            .removeIf(
               var15 -> {
                  var15.a();
                  if (var15.b()) {
                     int var267 = (int)-3900404531296741251L;
                     int var251 = -550897354;
                     int var158 = var267;
                     var267 = (var158 | var251) - (var158 & var251);
                     var251 = -1466818230;
                     var158 = var267;
                     return pulse.Bool.from((var158 | var251) & (var158 & var251 ^ -1));
                  }

                  float var16x = var15.c();
                  if (var16x < 0.1F) {
                     int var249 = -1742146889;
                     int var156 = -2067191121;
                     int var266 = var156 & ~var249 | ~var156 & var249;
                     var249 = 484562968;
                     var156 = var266;
                     return pulse.Bool.from((var156 | var249) & (var156 ^ -1 | var249 ^ -1));
                  }

                  float var17x = Math.max(0.0F, var16x - var9);
                  float var18x = var16x;
                  float var19x = var17x * var17x;
                  float var20x = var18x * var18x;
                  float var21x = var15.d();
                  BlockPos var22x = BlockPos.ofFloored(var15.a);
                  int var10000x = (int)Math.ceil(var18x);
                  int var10001x = (int)-367446072238471539L;
                  int var53x = -784348125;
                  int var52x = var10001x;
                  var10001x = var52x + var53x - 2 * (var52x & var53x);
                  var53x = -1356674385;
                  var52x = var10001x;
                  var53x = var52x & ~var53x | ~var52x & var53x;
                  var52x = var10000x;
                  int var23x = (var52x & ~var53x) + (var53x & ~var52x) + 2 * (var52x & var53x);
                  ArrayList<float[]> var24x = pulse.Bool.from(var11) ? new ArrayList<>() : null;
                  ArrayList<float[]> var25x = var12 ? new ArrayList<>() : null;
                  ArrayList<Object[]> var26x = pulse.Bool.from(var13) ? new ArrayList<>() : null;
                  var52x = var23x;

                  for (int var27x = ~(var52x - 1); var27x <= var23x; var27x++) {
                     var52x = var23x;

                     for (int var28x = ~var52x + 1; var28x <= var23x; var28x++) {
                        var10000x = var22x.getX();
                        var53x = var27x;
                        var52x = var10000x;
                        double var29x = (var52x ^ var53x) + 2 * (var52x & var53x) + 0.5 - var15.a.x;
                        var10000x = var22x.getZ();
                        var53x = var28x;
                        var52x = var10000x;
                        double var31x = var52x - ~var53x - 1 + 0.5 - var15.a.z;
                        double var33x = var29x * var29x + var31x * var31x;
                        if (!(var33x > var20x)) {
                           double var35x = Math.sqrt(Math.max(0.0, var20x - var33x));
                           int var37x = (int)Math.floor(-var35x);
                           int var38x = (int)Math.ceil(var35x);

                           for (int var39x = var37x; var39x <= var38x; var39x++) {
                              var10000x = var22x.getY();
                              var53x = var39x;
                              var52x = var10000x;
                              double var40x = (var52x & ~var53x) + (var53x & ~var52x) + 2 * (var52x & var53x) + 0.5 - var15.a.y;
                              double var42x = var33x + var40x * var40x;
                              if (!(var42x < var19x) && !(var42x > var20x)) {
                                 BlockPos var44x = var22x.add(var27x, var39x, var28x);
                                 BlockState var45x = c.world.getBlockState(var44x);
                                 if (!var45x.isAir() && var45x.isOpaqueFullCube() && this.a(var44x)) {
                                    try {
                                       VoxelShape var46x = var45x.getOutlineShape(c.world, var44x);
                                       if (!var46x.isEmpty()) {
                                          Box var47x = var46x.getBoundingBox()
                                             .expand(var14)
                                             .offset(
                                                var44x.getX() - var3.x,
                                                var44x.getY() - var3.y,
                                                var44x.getZ() - var3.z
                                             );
                                          double var48x = Math.sqrt(var42x);
                                          float var50x = var9 > 0.0F ? (float)((var48x - var17x) / var9) : 0.5F;
                                          float var51x = var21x * (1.0F - Math.abs(var50x - 0.5F) * 2.0F);
                                          var51x = Math.max(0.1F, var51x);
                                          if (pulse.Bool.from(var11)) {
                                             var10001x = (int)-5650658595087853034L;
                                             var53x = -329149964;
                                             var52x = var10001x;
                                             var10001x = (var52x | var53x) & (~var52x | ~var53x);
                                             var53x = -794407963;
                                             var52x = var10001x;
                                             float[] var272 = new float[var52x & ~var53x | ~var52x & var53x];
                                             var53x = 343740047;
                                             var52x = -799677867;
                                             int var10003x = (var52x | var53x) & (~var52x | ~var53x);
                                             var53x = -1003950886;
                                             var52x = var10003x;
                                             var272[(var52x | var53x) - (var52x & var53x)] = (float)var47x.minX;
                                             var53x = 435843119;
                                             var52x = 306628891;
                                             var10003x = (var52x | var53x) - (var52x & var53x);
                                             var53x = 196917557;
                                             var52x = var10003x;
                                             var272[var52x + var53x - 2 * (var52x & var53x)] = (float)var47x.minY;
                                             var53x = 45881360;
                                             var52x = 934406371;
                                             var10003x = (var52x | var53x) & (~var52x | ~var53x);
                                             var53x = 890106097;
                                             var52x = var10003x;
                                             var272[(var52x | var53x) - (var52x & var53x)] = (float)var47x.minZ;
                                             var53x = -272029973;
                                             var52x = 1629366329;
                                             var10003x = (var52x | var53x) & ~(var52x & var53x);
                                             var53x = -1898508591;
                                             var52x = var10003x;
                                             var272[(var52x | var53x) & (~var52x | ~var53x)] = (float)var47x.maxX;
                                             var10003x = (int)1584428026952930754L;
                                             var53x = 2038772327;
                                             var52x = var10003x;
                                             var10003x = (var52x | var53x) - (var52x & var53x);
                                             var53x = 792127393;
                                             var52x = var10003x;
                                             var272[var52x + var53x - 2 * (var52x & var53x)] = (float)var47x.maxY;
                                             var53x = 1072431996;
                                             var52x = 1045065068;
                                             var10003x = var52x & ~var53x | ~var52x & var53x;
                                             var53x = 27684373;
                                             var52x = var10003x;
                                             var272[var52x & ~var53x | ~var52x & var53x] = (float)var47x.maxZ;
                                             var53x = 1080960135;
                                             var52x = 1520858049;
                                             var10003x = (var52x | var53x) - (var52x & var53x);
                                             var53x = 449337152;
                                             var52x = var10003x;
                                             var272[(var52x | var53x) - (var52x & var53x)] = var10 * var51x;
                                             var24x.add(var272);
                                          }

                                          if (var12) {
                                             var10001x = (int)-8248984218568554185L;
                                             var53x = -594235457;
                                             var52x = var10001x;
                                             var10001x = (var52x | var53x) & ~(var52x & var53x);
                                             var53x = 989832847;
                                             var52x = var10001x;
                                             float[] var275 = new float[(var52x | var53x) & (~var52x | ~var53x)];
                                             int var289 = (int)4511349973365159099L;
                                             var53x = 352704134;
                                             var52x = var289;
                                             var289 = var52x & ~var53x | ~var52x & var53x;
                                             var53x = 518005309;
                                             var52x = var289;
                                             var275[(var52x | var53x) - (var52x & var53x)] = (float)var47x.minX;
                                             var53x = 2085547511;
                                             var52x = 1138927552;
                                             var289 = (var52x | var53x) & ~(var52x & var53x);
                                             var53x = 1068255798;
                                             var52x = var289;
                                             var275[(var52x | var53x) & (~var52x | ~var53x)] = (float)var47x.minY;
                                             var289 = (int)-2743562376046601344L;
                                             var53x = -389754817;
                                             var52x = var289;
                                             var289 = (var52x | var53x) & (~var52x | ~var53x);
                                             var53x = -61256771;
                                             var52x = var289;
                                             var275[var52x + var53x - 2 * (var52x & var53x)] = (float)var47x.minZ;
                                             var53x = -419929831;
                                             var52x = 2116971731;
                                             var289 = var52x & ~var53x | ~var52x & var53x;
                                             var53x = -1730802231;
                                             var52x = var289;
                                             var275[var52x & ~var53x | ~var52x & var53x] = (float)var47x.maxX;
                                             var289 = (int)-5558577083413600896L;
                                             var53x = 1667380097;
                                             var52x = var289;
                                             var289 = (var52x | var53x) & (~var52x | ~var53x);
                                             var53x = -1109174779;
                                             var52x = var289;
                                             var275[(var52x | var53x) & (~var52x | ~var53x)] = (float)var47x.maxY;
                                             var289 = (int)-9024912153323010995L;
                                             var53x = -924461901;
                                             var52x = var289;
                                             var289 = var52x + var53x - 2 * (var52x & var53x);
                                             var53x = -1527361285;
                                             var52x = var289;
                                             var275[(var52x | var53x) - (var52x & var53x)] = (float)var47x.maxZ;
                                             var289 = (int)8529706682549391637L;
                                             var53x = -1840582446;
                                             var52x = var289;
                                             var289 = (var52x | var53x) & (~var52x | ~var53x);
                                             var53x = -2115296831;
                                             var52x = var289;
                                             var275[var52x & ~var53x | ~var52x & var53x] = var51x;
                                             var25x.add(var275);
                                          }

                                          if (pulse.Bool.from(var13)) {
                                             var10001x = (int)6249280406750761197L;
                                             var53x = 660244044;
                                             var52x = var10001x;
                                             var10001x = var52x + var53x - 2 * (var52x & var53x);
                                             var53x = 1567266467;
                                             var52x = var10001x;
                                             Object[] var278 = new Object[(var52x | var53x) & ~(var52x & var53x)];
                                             int var301 = (int)-1321067222154646188L;
                                             var53x = -1898525114;
                                             var52x = var301;
                                             var301 = (var52x | var53x) - (var52x & var53x);
                                             var53x = -707157230;
                                             var52x = var301;
                                             var278[(var52x | var53x) - (var52x & var53x)] = var47x;
                                             var53x = -1449840660;
                                             var52x = -307804036;
                                             var301 = (var52x | var53x) & (~var52x | ~var53x);
                                             var53x = 1144154001;
                                             var52x = var301;
                                             var278[var52x & ~var53x | ~var52x & var53x] = var51x;
                                             var26x.add(var278);
                                          }
                                       }
                                    } catch (Exception var54x) {
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }

                  if (pulse.Bool.from(var11) && !var24x.isEmpty()) {
                     RenderSystem.disableCull();
                     var10000x = (int)2479057456119234098L;
                     var53x = 427022266;
                     var52x = var10000x;
                     var10000x = (var52x | var53x) & (~var52x | ~var53x);
                     var53x = 817293704;
                     var52x = var10000x;
                     RenderSystem.depthMask(pulse.Bool.from((var52x | var53x) & (var52x ^ -1 | var53x ^ -1)));
                     RenderSystem.setShader(ShaderProgramKeys.POSITION_COLOR);
                     Tessellator var55x = Tessellator.getInstance();
                     BufferBuilder var58x = var55x.begin(DrawMode.QUADS, VertexFormats.POSITION_COLOR);

                     for (float[] var30x : var24x) {
                        int var10004x = (int)295082229516293366L;
                        var53x = 1392128071;
                        var52x = var10004x;
                        var10004x = (var52x | var53x) & ~(var52x & var53x);
                        var53x = 1059284145;
                        var52x = var10004x;
                        float var304 = var30x[(var52x | var53x) & (~var52x | ~var53x)];
                        int var10005x = (int)-8972396734003116218L;
                        var53x = 1971558545;
                        var52x = var10005x;
                        var10005x = (var52x | var53x) & ~(var52x & var53x);
                        var53x = 945627094;
                        var52x = var10005x;
                        float var308 = var30x[(var52x | var53x) & (~var52x | ~var53x)];
                        int var10006x = (int)-2419010067469066139L;
                        var53x = -358620706;
                        var52x = var10006x;
                        var10006x = (var52x | var53x) & (~var52x | ~var53x);
                        var53x = 385237433;
                        var52x = var10006x;
                        float var312 = var30x[(var52x | var53x) & (~var52x | ~var53x)];
                        var53x = -1734561071;
                        var52x = 93135532;
                        int var10007 = (var52x | var53x) - (var52x & var53x);
                        var53x = -1659793282;
                        var52x = var10007;
                        float var319 = var30x[var52x + var53x - 2 * (var52x & var53x)];
                        int var10008 = (int)1805864625900677399L;
                        var53x = 2001845303;
                        var52x = var10008;
                        var10008 = var52x + var53x - 2 * (var52x & var53x);
                        var53x = 1141986596;
                        var52x = var10008;
                        float var323 = var30x[var52x + var53x - 2 * (var52x & var53x)];
                        var53x = 1672511268;
                        var52x = 1150223024;
                        int var10009 = var52x + var53x - 2 * (var52x & var53x);
                        var53x = 658472337;
                        var52x = var10009;
                        float var328 = var30x[var52x + var53x - 2 * (var52x & var53x)];
                        int var10013 = (int)1674363752252729663L;
                        var53x = 1853338665;
                        var52x = var10013;
                        var10013 = var52x + var53x - 2 * (var52x & var53x);
                        var53x = 1269292304;
                        var52x = var10013;
                        this.a(var58x, var4, var304, var308, var312, var319, var323, var328, var6, var7, var8, var30x[(var52x | var53x) & ~(var52x & var53x)]);
                     }

                     BufferRenderer.drawWithGlobalProgram(var58x.end());
                     var53x = -1857617330;
                     var52x = 1983265841;
                     var10000x = (var52x | var53x) & ~(var52x & var53x);
                     var53x = -412008834;
                     var52x = var10000x;
                     RenderSystem.depthMask(pulse.Bool.from((var52x | var53x) & (var52x & var53x ^ -1)));
                     RenderSystem.enableCull();
                  }

                  if (pulse.Bool.from(var13) && !var26x.isEmpty()) {
                     for (Object[] var59x : var26x) {
                        MatrixStack var279 = var1.a();
                        var53x = 596197515;
                        var52x = -1953841680;
                        int var305 = var52x + var53x - 2 * (var52x & var53x);
                        var53x = -1476133509;
                        var52x = var305;
                        Box var10002x = (Box)var59x[(var52x | var53x) & (~var52x | ~var53x)];
                        int var313 = (int)-7775052136810264308L;
                        var53x = 1360014149;
                        var52x = var313;
                        var313 = (var52x | var53x) & (~var52x | ~var53x);
                        var53x = -631741880;
                        var52x = var313;
                        this.a(var279, var10002x, var5, (Float)var59x[(var52x | var53x) & ~(var52x & var53x)]);
                     }
                  }

                  if (var12 && !var25x.isEmpty()) {
                     RenderSystem.lineWidth(this.x.a());
                     RenderSystem.setShader(ShaderProgramKeys.POSITION_COLOR);
                     var10000x = (int)5512926218489025133L;
                     var53x = -1349880780;
                     var52x = var10000x;
                     var10000x = (var52x | var53x) - (var52x & var53x);
                     var53x = 1920183673;
                     var52x = var10000x;
                     GL11.glEnable((var52x | var53x) - (var52x & var53x));
                     var53x = 613093647;
                     var52x = 901341474;
                     var10000x = var52x & ~var53x | ~var52x & var53x;
                     var53x = 288521343;
                     var52x = var10000x;
                     var10000x = var52x & ~var53x | ~var52x & var53x;
                     var10001x = (int)3726816448178633810L;
                     var53x = -1996750326;
                     var52x = var10001x;
                     var10001x = var52x & ~var53x | ~var52x & var53x;
                     var53x = -533123238;
                     var52x = var10001x;
                     GL11.glHint(var10000x, (var52x | var53x) - (var52x & var53x));
                     Tessellator var57x = Tessellator.getInstance();
                     BufferBuilder var60x = var57x.begin(DrawMode.LINES, VertexFormats.POSITION_COLOR);

                     for (float[] var63x : var25x) {
                        var53x = -694838212;
                        var52x = 1985574389;
                        int var309 = var52x & ~var53x | ~var52x & var53x;
                        var53x = -1597183543;
                        var52x = var309;
                        float var306 = var63x[(var52x | var53x) - (var52x & var53x)];
                        int var315 = (int)3526735191563310138L;
                        var53x = 352394598;
                        var52x = var315;
                        var315 = var52x + var53x - 2 * (var52x & var53x);
                        var53x = -1291777699;
                        var52x = var315;
                        float var310 = var63x[(var52x | var53x) - (var52x & var53x)];
                        int var320 = (int)2913347015407450692L;
                        var53x = 800791486;
                        var52x = var320;
                        var320 = var52x + var53x - 2 * (var52x & var53x);
                        var53x = -411753992;
                        var52x = var320;
                        float var317 = var63x[var52x + var53x - 2 * (var52x & var53x)];
                        int var324 = (int)-4847745565876269288L;
                        var53x = 1215857866;
                        var52x = var324;
                        var324 = var52x + var53x - 2 * (var52x & var53x);
                        var53x = -402601007;
                        var52x = var324;
                        float var322 = var63x[var52x + var53x - 2 * (var52x & var53x)];
                        int var329 = (int)-3041942833918040643L;
                        var53x = 2122235499;
                        var52x = var329;
                        var329 = var52x & ~var53x | ~var52x & var53x;
                        var53x = 2067504082;
                        var52x = var329;
                        float var326 = var63x[var52x & ~var53x | ~var52x & var53x];
                        var53x = -218041864;
                        var52x = 623934719;
                        int var332 = var52x + var53x - 2 * (var52x & var53x);
                        var53x = -701461246;
                        var52x = var332;
                        float var331 = var63x[(var52x | var53x) & ~(var52x & var53x)];
                        int var334 = (int)-1340400877281641128L;
                        var53x = 1802875385;
                        var52x = var334;
                        var334 = var52x + var53x - 2 * (var52x & var53x);
                        var53x = -1770730329;
                        var52x = var334;
                        this.b(var60x, var4, var306, var310, var317, var322, var326, var331, var6, var7, var8, var63x[var52x & ~var53x | ~var52x & var53x]);
                     }

                     BufferRenderer.drawWithGlobalProgram(var60x.end());
                     var10000x = (int)454532629416008218L;
                     var53x = -155950299;
                     var52x = var10000x;
                     var10000x = (var52x | var53x) & (~var52x | ~var53x);
                     var53x = 1570648607;
                     var52x = var10000x;
                     GL11.glDisable((var52x | var53x) & ~(var52x & var53x));
                  }

                  var53x = -745588369;
                  var52x = 993318189;
                  var10000x = var52x & ~var53x | ~var52x & var53x;
                  var53x = -390337470;
                  var52x = var10000x;
                  return pulse.Bool.from(var52x & (var53x ^ -1) | (var52x ^ -1) & var53x);
               }
            );
         RenderSystem.disableBlend();
         var1.a().pop();
      }
   }

   private void a(
      BufferBuilder var1,
      Matrix4f var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12
   ) {
      var1.vertex(var2, var3, var7, var5).color(var9, var10, var11, var12);
      var1.vertex(var2, var3, var7, var8).color(var9, var10, var11, var12);
      var1.vertex(var2, var6, var7, var8).color(var9, var10, var11, var12);
      var1.vertex(var2, var6, var7, var5).color(var9, var10, var11, var12);
   }

   private void b(
      BufferBuilder var1,
      Matrix4f var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12
   ) {
      var1.vertex(var2, var3, var7, var5).color(var9, var10, var11, var12);
      var1.vertex(var2, var6, var7, var5).color(var9, var10, var11, var12);
      var1.vertex(var2, var6, var7, var5).color(var9, var10, var11, var12);
      var1.vertex(var2, var6, var7, var8).color(var9, var10, var11, var12);
      var1.vertex(var2, var6, var7, var8).color(var9, var10, var11, var12);
      var1.vertex(var2, var3, var7, var8).color(var9, var10, var11, var12);
      var1.vertex(var2, var3, var7, var8).color(var9, var10, var11, var12);
      var1.vertex(var2, var3, var7, var5).color(var9, var10, var11, var12);
   }

   private void a(MatrixStack var1, Box var2, Color var3, float var4) {
      String var5 = this.q();
      Optional var6 = ShaderLibrary.getRegistry().find(var5);
      Matrix4f var7 = var1.peek().getPositionMatrix();
      if (!var6.isPresent()) {
         RenderSystem.disableCull();
         int var102 = (int)2869486411784460586L;
         int var96 = 822678442;
         int var57 = var102;
         var102 = var57 + var96 - 2 * (var57 & var96);
         var96 = 120588928;
         var57 = var102;
         RenderSystem.depthMask(pulse.Bool.from(var57 + var96 - 2 * (var57 & var96)));
         RenderSystem.setShader(ShaderProgramKeys.POSITION_COLOR);
         Tessellator var20 = Tessellator.getInstance();
         BufferBuilder var21 = var20.begin(DrawMode.QUADS, VertexFormats.POSITION_COLOR);
         this.b(var21, var7, var2, var3.getRed() / 255.0F, var3.getGreen() / 255.0F, var3.getBlue() / 255.0F, this.A.a() * var4);
         BufferRenderer.drawWithGlobalProgram(var21.end());
         var96 = 1376805056;
         var57 = -1996678630;
         var102 = (var57 | var96) & ~(var57 & var96);
         var96 = -621970725;
         var57 = var102;
         RenderSystem.depthMask(pulse.Bool.from((var57 | var96) & (var57 ^ -1 | var96 ^ -1)));
         RenderSystem.enableCull();
      } else {
         PulseShaderProgram var8 = (PulseShaderProgram)var6.get();
         float var9 = (float)(System.currentTimeMillis() % 100000L) / 1000.0F * this.C.a();
         RenderSystem.disableCull();
         int var19 = 1983382546;
         int var18 = -730973916;
         int var10000 = var18 & ~var19 | ~var18 & var19;
         var19 = -1571406538;
         var18 = var10000;
         RenderSystem.depthMask(pulse.Bool.from((var18 | var19) & (var18 ^ -1 | var19 ^ -1)));
         var8.d();
         var19 = 1029544062;
         var18 = 547524865;
         int var10003 = (var18 | var19) & ~(var18 & var19);
         var19 = 2045309448;
         var18 = var10003;
         var10003 = var18 & ~var19 | ~var18 & var19;
         int var10004 = (int)-110768803053583576L;
         var19 = 1741613809;
         var18 = var10004;
         var10004 = var18 & ~var19 | ~var18 & var19;
         var19 = 752892087;
         var18 = var10004;
         var10004 = (var18 | var19) & ~(var18 & var19);
         var19 = 1585106387;
         var18 = -1949242225;
         int var10005 = (var18 | var19) & (~var18 | ~var19);
         var19 = -852047773;
         var18 = var10005;
         var10005 = (var18 | var19) - (var18 & var19);
         int var10006 = (int)7333136433393947555L;
         var19 = 918916589;
         var18 = var10006;
         var10006 = (var18 | var19) & (~var18 | ~var19);
         var19 = -15643913;
         var18 = var10006;
         var8.a(
            c("悔ᗮ﨤ᗢ", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳", var10003, var10004, var10005, (var18 | var19) & (~var18 | ~var19)),
            var9
         );
         var10003 = (int)3877462366768931554L;
         var19 = 457806452;
         var18 = var10003;
         var10003 = (var18 | var19) - (var18 & var19);
         var19 = -429175839;
         var18 = var10003;
         var10003 = (var18 | var19) & (~var18 | ~var19);
         var10004 = (int)1725168306157919422L;
         var19 = 1776591396;
         var18 = var10004;
         var10004 = var18 & ~var19 | ~var18 & var19;
         var19 = 1231827677;
         var18 = var10004;
         var10004 = (var18 | var19) - (var18 & var19);
         var19 = -1967149783;
         var18 = 1329555106;
         var10005 = var18 & ~var19 | ~var18 & var19;
         var19 = -844749113;
         var18 = var10005;
         var10005 = (var18 | var19) & (~var18 | ~var19);
         var19 = 1760247303;
         var18 = -1441331479;
         var10006 = var18 + var19 - 2 * (var18 & var19);
         var19 = -1025722500;
         var18 = var10006;
         var8.a(
            c(
               "墨軏層軉館軂祥軅勉軉",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳",
               var10003,
               var10004,
               var10005,
               (var18 | var19) & (~var18 | ~var19)
            ),
            (float)c.getWindow().getFramebufferWidth(),
            (float)c.getWindow().getFramebufferHeight()
         );
         var19 = -81031844;
         var18 = -1286778994;
         var10003 = var18 & ~var19 | ~var18 & var19;
         var19 = 745617829;
         var18 = var10003;
         var10003 = var18 + var19 - 2 * (var18 & var19);
         var19 = 525678216;
         var18 = 1154041900;
         var10004 = (var18 | var19) & (~var18 | ~var19);
         var19 = 1497495746;
         var18 = var10004;
         var10004 = (var18 | var19) - (var18 & var19);
         var10005 = (int)1414070788917291626L;
         var19 = 12827474;
         var18 = var10005;
         var10005 = (var18 | var19) & ~(var18 & var19);
         var19 = -344058164;
         var18 = var10005;
         var10005 = var18 & ~var19 | ~var18 & var19;
         var19 = -1365243672;
         var18 = 633495557;
         var10006 = (var18 | var19) & ~(var18 & var19);
         var19 = -1957306020;
         var18 = var10006;
         var8.a(
            c(
               "飼裮墨裪見裠逸裠層",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳",
               var10003,
               var10004,
               var10005,
               (var18 | var19) - (var18 & var19)
            ),
            var3.getRed() / 255.0F,
            var3.getGreen() / 255.0F,
            var3.getBlue() / 255.0F,
            1.0F
         );
         var19 = -1996916020;
         var18 = 47753357;
         var10003 = var18 + var19 - 2 * (var18 & var19);
         var19 = -298440394;
         var18 = var10003;
         var10003 = (var18 | var19) & (~var18 | ~var19);
         var10004 = (int)-4371453396081612741L;
         var19 = 1017227285;
         var18 = var10004;
         var10004 = var18 + var19 - 2 * (var18 & var19);
         var19 = 671172362;
         var18 = var10004;
         var10004 = (var18 | var19) & (~var18 | ~var19);
         var10005 = (int)-551042896929897959L;
         var19 = 703462655;
         var18 = var10005;
         var10005 = (var18 | var19) & ~(var18 & var19);
         var19 = -2131427431;
         var18 = var10005;
         var10005 = var18 & ~var19 | ~var18 & var19;
         var19 = 1766746408;
         var18 = -737064660;
         var10006 = var18 + var19 - 2 * (var18 & var19);
         var19 = -1119573397;
         var18 = var10006;
         var8.a(
            c("﨨謽塀謹﨨", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳", var10003, var10004, var10005, (var18 | var19) - (var18 & var19)),
            this.D.a() * var4
         );
         float var10 = (float)var2.minX;
         float var11 = (float)var2.minY;
         float var12 = (float)var2.minZ;
         float var13 = (float)var2.maxX;
         float var14 = (float)var2.maxY;
         float var15 = (float)var2.maxZ;
         Tessellator var16 = Tessellator.getInstance();
         BufferBuilder var17 = var16.begin(DrawMode.QUADS, VertexFormats.POSITION_TEXTURE);
         var17.vertex(var7, var10, var14, var12).texture(0.0F, 0.0F);
         var17.vertex(var7, var10, var14, var15).texture(0.0F, 1.0F);
         var17.vertex(var7, var13, var14, var15).texture(1.0F, 1.0F);
         var17.vertex(var7, var13, var14, var12).texture(1.0F, 0.0F);
         BufferRenderer.drawWithGlobalProgram(var17.end());
         var8.e();
         var10000 = (int)-5654705696530008813L;
         var19 = 1343315782;
         var18 = var10000;
         var10000 = (var18 | var19) - (var18 & var19);
         var19 = 1356999252;
         var18 = var10000;
         RenderSystem.depthMask(pulse.Bool.from((var18 | var19) & (var18 ^ -1 | var19 ^ -1)));
         RenderSystem.enableCull();
      }
   }

   private String q() {
      String var1 = this.B.d();
      int var10000 = (int)-2523538546487072867L;
      int var4 = -1291950806;
      int var3 = var10000;
      var10000 = (var3 | var4) & (~var3 | ~var4);
      var4 = -1566540472;
      var3 = var10000;
      int var2 = var3 + var4 - 2 * (var3 & var4);
      switch (var1.hashCode()) {
         case 935802008:
            var4 = -173867166;
            var3 = 1829623744;
            int var150 = var3 + var4 - 2 * (var3 & var4);
            var4 = -54996011;
            var3 = var150;
            var150 = var3 & ~var4 | ~var3 & var4;
            var4 = -1248724384;
            var3 = 182575002;
            int var166 = var3 & ~var4 | ~var3 & var4;
            var4 = -1677510764;
            var3 = var166;
            var166 = (var3 | var4) & (~var3 | ~var4);
            var4 = -1891632233;
            var3 = -2046234225;
            int var182 = (var3 | var4) & (~var3 | ~var4);
            var4 = 502676183;
            var3 = var182;
            var182 = (var3 | var4) & (~var3 | ~var4);
            var4 = 368067855;
            var3 = -1364576814;
            int var190 = (var3 | var4) - (var3 & var4);
            var4 = -1155538235;
            var3 = var190;
            if (var1.equals(
               c("箿ድ篹ደ箜ኌ", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳", var150, var166, var182, var3 + var4 - 2 * (var3 & var4))
            )) {
               var10000 = (int)5586057933483068839L;
               var4 = 1239021619;
               var3 = var10000;
               var10000 = var3 + var4 - 2 * (var3 & var4);
               var4 = 1843082644;
               var3 = var10000;
               var2 = (var3 | var4) & ~(var3 & var4);
            }
            break;
         case 1172164023:
            var4 = -1811478590;
            var3 = 142266524;
            int var148 = (var3 | var4) & (~var3 | ~var4);
            var4 = -127259607;
            var3 = var148;
            var148 = var3 & ~var4 | ~var3 & var4;
            int var163 = (int)2576945683838952516L;
            var4 = -110745642;
            var3 = var163;
            var163 = (var3 | var4) - (var3 & var4);
            var4 = -525584693;
            var3 = var163;
            var163 = (var3 | var4) & (~var3 | ~var4);
            int var179 = (int)1686830959837564307L;
            var4 = 950471217;
            var3 = var179;
            var179 = (var3 | var4) - (var3 & var4);
            var4 = 643600893;
            var3 = var179;
            var179 = (var3 | var4) & (~var3 | ~var4);
            int var188 = (int)7184119488030406855L;
            var4 = 1826682713;
            var3 = var188;
            var188 = (var3 | var4) & ~(var3 & var4);
            var4 = 279542429;
            var3 = var188;
            if (var1.equals(
               c("箷痧箘痫箔痬", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳", var148, var163, var179, (var3 | var4) & ~(var3 & var4))
            )) {
               var4 = 1976004911;
               var3 = 577589969;
               var10000 = var3 & ~var4 | ~var3 & var4;
               var4 = 1470768124;
               var3 = var10000;
               var2 = (var3 | var4) - (var3 & var4);
            }
            break;
         case 1680297915:
            int var10003 = (int)4476747644098649847L;
            var4 = -1560999308;
            var3 = var10003;
            var10003 = var3 + var4 - 2 * (var3 & var4);
            var4 = -1250693132;
            var3 = var10003;
            var10003 = (var3 | var4) & (~var3 | ~var4);
            var4 = 1118216090;
            var3 = 42658478;
            int var10004 = (var3 | var4) & (~var3 | ~var4);
            var4 = 1667680066;
            var3 = var10004;
            var10004 = (var3 | var4) - (var3 & var4);
            int var10005 = (int)-8686825898012104576L;
            var4 = -718814620;
            var3 = var10005;
            var10005 = (var3 | var4) - (var3 & var4);
            var4 = 385941010;
            var3 = var10005;
            var10005 = (var3 | var4) - (var3 & var4);
            var4 = -1923067193;
            var3 = -1502627130;
            int var10006 = (var3 | var4) & (~var3 | ~var4);
            var4 = 722655777;
            var3 = var10006;
            if (var1.equals(
               c("箷닏篫늽箐닂箘", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳", var10003, var10004, var10005, (var3 | var4) & ~(var3 & var4))
            )) {
               var10000 = (int)-5004386604713189430L;
               var4 = -6928680;
               var3 = var10000;
               var10000 = var3 & ~var4 | ~var3 & var4;
               var4 = 1154390291;
               var3 = var10000;
               var2 = (var3 | var4) - (var3 & var4);
            }
      }

      switch (var2) {
         case 0:
            var4 = 756975993;
            var3 = 587663410;
            int var144 = var3 & ~var4 | ~var3 & var4;
            var4 = 1779333692;
            var3 = var144;
            var144 = (var3 | var4) - (var3 & var4);
            var4 = -1650584724;
            var3 = 62986708;
            int var160 = (var3 | var4) & (~var3 | ~var4);
            var4 = -1120518199;
            var3 = var160;
            var160 = (var3 | var4) - (var3 & var4);
            int var174 = (int)8383008308106137497L;
            var4 = 482322619;
            var3 = var174;
            var174 = (var3 | var4) & (~var3 | ~var4);
            var4 = 798818216;
            var3 = var174;
            var174 = var3 + var4 - 2 * (var3 & var4);
            var4 = 1521050143;
            var3 = -2093104405;
            int var187 = (var3 | var4) & ~(var3 & var4);
            var4 = -642837009;
            var3 = var187;
            return c(
               "翊ㆨ翇ㆧ翃㆛翛ㆰ翉ㆶ翎ㆭ翍ㆨ翌", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳", var144, var160, var174, var3 + var4 - 2 * (var3 & var4)
            );
         case 1:
            int var141 = (int)8404967305903682499L;
            var4 = -84014436;
            var3 = var141;
            var141 = var3 & ~var4 | ~var3 & var4;
            var4 = 666944040;
            var3 = var141;
            var141 = (var3 | var4) & (~var3 | ~var4);
            var4 = -72902162;
            var3 = 1228781451;
            int var158 = (var3 | var4) - (var3 & var4);
            var4 = -1845969423;
            var3 = var158;
            var158 = var3 + var4 - 2 * (var3 & var4);
            var4 = 412766735;
            var3 = 2044305512;
            int var172 = var3 + var4 - 2 * (var3 & var4);
            var4 = 1965589154;
            var3 = var172;
            var172 = var3 & ~var4 | ~var3 & var4;
            var4 = 1716156496;
            var3 = 1525180377;
            int var186 = var3 & ~var4 | ~var3 & var4;
            var4 = 1016532151;
            var3 = var186;
            return c(
               "翊鞍翇鞂翃鞾翋鞎翊鞖翍鞃", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳", var141, var158, var172, (var3 | var4) & (~var3 | ~var4)
            );
         case 2:
            var4 = 1601867246;
            var3 = -611031848;
            int var139 = (var3 | var4) - (var3 & var4);
            var4 = -520547775;
            var3 = var139;
            var139 = (var3 | var4) & ~(var3 & var4);
            int var155 = (int)-11632748018875504L;
            var4 = -1760737374;
            var3 = var155;
            var155 = (var3 | var4) & (~var3 | ~var4);
            var4 = 2127819586;
            var3 = var155;
            var155 = (var3 | var4) & (~var3 | ~var4);
            var4 = 42896995;
            var3 = -35172455;
            int var170 = (var3 | var4) & ~(var3 & var4);
            var4 = -247827636;
            var3 = var170;
            var170 = (var3 | var4) - (var3 & var4);
            var4 = 1304874093;
            var3 = -2030086876;
            int var185 = var3 & ~var4 | ~var3 & var4;
            var4 = -886608301;
            var3 = var185;
            return c(
               "翊玩翇玦翃玚翘玩翉玶翅玤", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳", var139, var155, var170, (var3 | var4) - (var3 & var4)
            );
         default:
            int var10002 = (int)-2815781839353468943L;
            var4 = 1086940181;
            var3 = var10002;
            var10002 = (var3 | var4) & ~(var3 & var4);
            var4 = -796280685;
            var3 = var10002;
            var10002 = (var3 | var4) & ~(var3 & var4);
            int var152 = (int)-7736924482642646490L;
            var4 = -1397093983;
            var3 = var152;
            var152 = var3 + var4 - 2 * (var3 & var4);
            var4 = 1105857523;
            var3 = var152;
            var152 = (var3 | var4) - (var3 & var4);
            var4 = -1817226809;
            var3 = 727212582;
            int var168 = (var3 | var4) - (var3 & var4);
            var4 = -1604322950;
            var3 = var168;
            var168 = (var3 | var4) - (var3 & var4);
            var4 = -1236443241;
            var3 = -380962218;
            int var184 = (var3 | var4) & (~var3 | ~var4);
            var4 = 1597361631;
            var3 = var184;
            return c(
               "翊\uecad翇\ueca2翃\uec9e翆\ueca4翊\uecb4翄\ueca0",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑝g\ua7eb꒥ꁒꤌ絤蹉⑶謲㑤_\ua7e9꒱ꁤ꤉絳",
               var10002,
               var152,
               var168,
               (var3 | var4) - (var3 & var4)
            );
      }
   }

   private void a(BufferBuilder var1, Matrix4f var2, Box var3, float var4, float var5, float var6, float var7) {
      float var8 = (float)var3.minX;
      float var9 = (float)var3.minZ;
      float var10 = (float)var3.maxX;
      float var11 = (float)var3.maxY;
      float var12 = (float)var3.maxZ;
      var1.vertex(var2, var8, var11, var9).color(var4, var5, var6, var7);
      var1.vertex(var2, var10, var11, var9).color(var4, var5, var6, var7);
      var1.vertex(var2, var10, var11, var9).color(var4, var5, var6, var7);
      var1.vertex(var2, var10, var11, var12).color(var4, var5, var6, var7);
      var1.vertex(var2, var10, var11, var12).color(var4, var5, var6, var7);
      var1.vertex(var2, var8, var11, var12).color(var4, var5, var6, var7);
      var1.vertex(var2, var8, var11, var12).color(var4, var5, var6, var7);
      var1.vertex(var2, var8, var11, var9).color(var4, var5, var6, var7);
   }

   private void b(BufferBuilder var1, Matrix4f var2, Box var3, float var4, float var5, float var6, float var7) {
      float var8 = (float)var3.minX;
      float var9 = (float)var3.minZ;
      float var10 = (float)var3.maxX;
      float var11 = (float)var3.maxY;
      float var12 = (float)var3.maxZ;
      var1.vertex(var2, var8, var11, var9).color(var4, var5, var6, var7);
      var1.vertex(var2, var8, var11, var12).color(var4, var5, var6, var7);
      var1.vertex(var2, var10, var11, var12).color(var4, var5, var6, var7);
      var1.vertex(var2, var10, var11, var9).color(var4, var5, var6, var7);
   }

   private Color r() {
      if (this.E.a()) {
         ClientColor var1 = ModuleRegistry.CLIENT_COLOR;
         return var1.n();
      } else {
         return this.F.a();
      }
   }

   private boolean a(BlockPos var1) {
      BlockState var2 = c.world.getBlockState(var1.up());
      int var12;
      if (!var2.isAir() && var2.isOpaqueFullCube()) {
         int var9 = 1632734793;
         int var6 = -244476837;
         var12 = (var6 | var9) & ~(var6 & var9);
         var9 = -1875109358;
         var6 = var12;
         var12 = (var6 | var9) & (~var6 | ~var9);
      } else {
         var12 = (int)-1088498347582388402L;
         int var4 = 1814397847;
         int var3 = var12;
         var12 = (var3 | var4) & ~(var3 & var4);
         var4 = 1910834392;
         var3 = var12;
         var12 = var3 & ~var4 | ~var3 & var4;
      }

      return pulse.Bool.from(var12);
   }

   @Override
   public void f() {
      super.f();
      this.H.clear();
      this.I.clear();
      this.J.clear();
   }

   public static String c(String var0, String var1, int var2, int var3, int var4, int var5) {
      char[] var6 = var1.toCharArray();
      char[] var7 = new char[var6.length];
      int var18 = 1679606698;
      int var17 = 850037036;
      int var10000 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1454787212;
      var17 = var10000;
      char[] var219 = new char[var17 & ~var18 | ~var17 & var18];
      int var10002 = (int)-5809620155268350111L;
      var18 = -1257333435;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 1749623332;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      int var10003 = (int)-7160989474850848777L;
      var18 = 247564395;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 1375076270;
      var17 = var10003;
      var219[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var10002 = (int)-8732556971167159934L;
      var18 = 1089751218;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -397663951;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var10003 = (int)5900234103405777796L;
      var18 = 821824988;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 836353501;
      var17 = var10003;
      var219[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var10002 = (int)1971094446409727781L;
      var18 = 2048202394;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -756405827;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)2431635592124423095L;
      var18 = 1089419471;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 1261093118;
      var17 = var10003;
      var219[var10002] = (char)((var17 | var18) - (var17 & var18));
      var18 = 546717236;
      var17 = 564851631;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 20762008;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1766114169;
      var17 = -1302899755;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 619509569;
      var17 = var10003;
      var219[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var18 = -437350911;
      var17 = -50692676;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 420803513;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var10003 = (int)801084511978444300L;
      var18 = 1524744232;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -781482239;
      var17 = var10003;
      var219[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var10002 = (int)-8500580951682130259L;
      var18 = -1748918605;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 21577755;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var10003 = (int)-938182090618135206L;
      var18 = -1800290777;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 1856202495;
      var17 = var10003;
      var219[var10002] = (char)((var17 | var18) - (var17 & var18));
      var10002 = (int)5699339030060164520L;
      var18 = 971001101;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -56547165;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var10003 = (int)3341408062018013296L;
      var18 = -1229092541;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 2089306144;
      var17 = var10003;
      var219[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var10002 = (int)8807626822473793743L;
      var18 = -1532291532;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -2022975748;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var10003 = (int)4591354563258122243L;
      var18 = -1691599109;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1343059238;
      var17 = var10003;
      var219[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var18 = 257956626;
      var17 = 1054464618;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 834257264;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)8880020912081841907L;
      var18 = 2144301585;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -513616719;
      var17 = var10003;
      var219[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var18 = 360638590;
      var17 = -515313310;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -197781227;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var10003 = (int)-8931359070665109536L;
      var18 = 723914597;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -189986911;
      var17 = var10003;
      var219[var10002] = (char)((var17 | var18) - (var17 & var18));
      char[] var8 = var219;
      var10000 = (int)-8412060353655238263L;
      var18 = -1706554040;
      var17 = var10000;
      var10000 = var17 & ~var18 | ~var17 & var18;
      var18 = -42754869;
      var17 = var10000;
      char[] var222 = new char[(var17 | var18) - (var17 & var18)];
      var10002 = (int)336969112429196881L;
      var18 = 969561930;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 1867817243;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 1175954782;
      var17 = -2134783363;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -959043837;
      var17 = var10003;
      var222[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var10002 = (int)3814207117442751243L;
      var18 = -1331345521;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -1638638459;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -974694843;
      var17 = -1570642558;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 1736849348;
      var17 = var10003;
      var222[var10002] = (char)((var17 | var18) - (var17 & var18));
      var18 = 1879251266;
      var17 = -208584702;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -2087560894;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -2078880179;
      var17 = -1474341973;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 738794165;
      var17 = var10003;
      var222[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var18 = 1117499306;
      var17 = -453351483;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -1503541140;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1453575161;
      var17 = -1127777256;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -362508317;
      var17 = var10003;
      var222[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var18 = -1955795395;
      var17 = -658612197;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1406307874;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 1723530631;
      var17 = -1555321122;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -974034151;
      var17 = var10003;
      var222[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var10002 = (int)-650370791585906527L;
      var18 = 1188669302;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1109252142;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1711818857;
      var17 = 155318351;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1867090100;
      var17 = var10003;
      var222[var10002] = (char)((var17 | var18) - (var17 & var18));
      var18 = -436938322;
      var17 = 1464311271;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1296874417;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)2858536620688233268L;
      var18 = 1047961993;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 1944548740;
      var17 = var10003;
      var222[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var18 = -1729589388;
      var17 = -1946130366;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 350807857;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)-6833191835977448963L;
      var18 = -835383309;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 1346510390;
      var17 = var10003;
      var222[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var10002 = (int)-69940427642265314L;
      var18 = -1195254971;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1909425581;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var10003 = (int)8400071236172747196L;
      var18 = 1106551612;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -369512060;
      var17 = var10003;
      var222[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var10002 = (int)-1628700047592051207L;
      var18 = -569392777;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 1200811143;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)4729599369783468725L;
      var18 = -1287281600;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -828410426;
      var17 = var10003;
      var222[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      char[] var9 = var222;
      var18 = -1492650049;
      var17 = 687823896;
      var10000 = (var17 | var18) & ~(var17 & var18);
      var18 = -1879528537;
      var17 = var10000;

      for (int var10 = var17 + var18 - 2 * (var17 & var18); var10 < var6.length; var10++) {
         char var279 = var6[var10];
         char var205 = var8[var10 % var8.length];
         char var106 = var279;
         var7[var10] = (char)(var106 & ~var205 | ~var106 & var205);
      }

      char[] var19 = new char[var7.length];
      var10000 = (int)-5477925342856388682L;
      var18 = -1805797323;
      var17 = var10000;
      var10000 = var17 & ~var18 | ~var17 & var18;
      var18 = 481486723;
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
      var10000 = var17 + ~var18 + 1;
      var18 = var2;
      var17 = var10000;
      int var13 = (var17 ^ var18) - 2 * (~var17 & var18);
      char[] var14 = var0.toCharArray();
      char[] var15 = new char[var14.length];
      var10000 = (int)3753767065289696740L;
      var18 = 1440526029;
      var17 = var10000;
      var10000 = (var17 | var18) & ~(var17 & var18);
      var18 = -1510241495;
      var17 = var10000;

      for (int var16 = var17 + var18 - 2 * (var17 & var18); var16 < var15.length; var16++) {
         var18 = 1553157512;
         var17 = -587827349;
         int var10001 = (var17 | var18) & (~var17 | ~var18);
         var18 = -2140849439;
         var17 = var10001;
         switch (var16 % (var17 + var18 - 2 * (var17 & var18))) {
            case 0:
               var18 = var12;
               var17 = var13;
               var10002 = (var17 | var18) & ~(var17 & var18);
               char var218 = var14[var16];
               var17 = var10002;
               var15[var16] = (char)((var17 | var218) - (var17 & var218));
               break;
            case 1:
               var18 = var13;
               var17 = var5;
               var10002 = var17 & ~var18 | ~var17 & var18;
               char var216 = var14[var16];
               var17 = var10002;
               var15[var16] = (char)(var17 + var216 - 2 * (var17 & var216));
         }
      }

      return new String(var15);
   }

   private class CircleInstance {
      final Vec3d a;
      final pulse.AnimationState b;
      final pulse.AnimationState c;

      CircleInstance(Vec3d var2, float var3, float var4) {
         this.a = var2;
         this.b = new pulse.AnimationState();
         this.c = new pulse.AnimationState();
         this.b.d(0.0);
         this.b.a(var3, var4, pulse.Easing.f);
         this.c.d(1.0);
         this.c.a(0.0, var4, pulse.Easing.s);
      }

      boolean a() {
         this.b.a();
         this.c.a();
         int var10;
         if (!this.b.b() && !this.c.b()) {
            int var7 = 236342015;
            int var4 = -304550283;
            var10 = (var4 | var7) & (~var4 | ~var7);
            var7 = -472996726;
            var4 = var10;
            var10 = (var4 | var7) & (~var4 | ~var7);
         } else {
            var10 = (int)-8770296144979999694L;
            int var2 = 2140339177;
            int var1 = var10;
            var10 = var1 & ~var2 | ~var1 & var2;
            var2 = -118505510;
            var1 = var10;
            var10 = var1 + var2 - 2 * (var1 & var2);
         }

         return pulse.Bool.from(var10);
      }

      boolean b() {
         int var10;
         if (this.b.d() && this.c.d()) {
            var10 = (int)-3418531973293701407L;
            int var7 = -916324334;
            int var4 = var10;
            var10 = var4 + var7 - 2 * (var4 & var7);
            var7 = -2015262990;
            var4 = var10;
            var10 = var4 & ~var7 | ~var4 & var7;
         } else {
            var10 = (int)-6397027029953084728L;
            int var2 = -1100105322;
            int var1 = var10;
            var10 = var1 + var2 - 2 * (var1 & var2);
            var2 = -1686193314;
            var1 = var10;
            var10 = (var1 | var2) & ~(var1 & var2);
         }

         return pulse.Bool.from(var10);
      }

      float c() {
         return (float)this.b.j();
      }

      float d() {
         return (float)this.c.j();
      }

      public static String a(String var0, String var1, int var2, int var3, int var4, int var5) {
         char[] var6 = var1.toCharArray();
         char[] var7 = new char[var6.length];
         int var18 = -321966815;
         int var17 = -99386213;
         int var10000 = var17 & ~var18 | ~var17 & var18;
         var18 = 383537584;
         var17 = var10000;
         char[] var219 = new char[(var17 | var18) & ~(var17 & var18)];
         int var10002 = (int)3512628224837525925L;
         var18 = -619307310;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = 1516617591;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = -673886783;
         var17 = 1072271226;
         int var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = -398685559;
         var17 = var10003;
         var219[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var10002 = (int)5279808463889834913L;
         var18 = -1304739216;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = -1233493552;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = 196655643;
         var17 = 1044769961;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = 905803063;
         var17 = var10003;
         var219[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var10002 = (int)-2930378748022780155L;
         var18 = 842140560;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = -1064467305;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = -1271475091;
         var17 = 528898357;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = -1414484258;
         var17 = var10003;
         var219[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var10002 = (int)9077802929252270638L;
         var18 = -853977606;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = 906778583;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = -146738875;
         var17 = 252441782;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = -129262112;
         var17 = var10003;
         var219[var10002] = (char)((var17 | var18) - (var17 & var18));
         var10002 = (int)4796922411127458364L;
         var18 = -1477241825;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = 766500391;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = -1493341957;
         var17 = 78538818;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = -1571581540;
         var17 = var10003;
         var219[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var18 = 755547049;
         var17 = 778638795;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = 56733287;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = 1778287723;
         var17 = 497408549;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = 1952127948;
         var17 = var10003;
         var219[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         var18 = -1622744715;
         var17 = 1715022335;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = -109066100;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = 2002854641;
         var17 = 71574261;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = 1931806999;
         var17 = var10003;
         var219[var10002] = (char)((var17 | var18) - (var17 & var18));
         var10002 = (int)124559623961057904L;
         var18 = 965681749;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = 1375811618;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = 691357058;
         var17 = -259679719;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = -642716743;
         var17 = var10003;
         var219[var10002] = (char)((var17 | var18) - (var17 & var18));
         var18 = -95699401;
         var17 = 93554031;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = -2606256;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var10003 = (int)7013572736191035838L;
         var18 = 294002181;
         var17 = var10003;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = 1786900456;
         var17 = var10003;
         var219[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var10002 = (int)2653432711404878062L;
         var18 = -202301869;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = -448698700;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var10003 = (int)5585017123489298273L;
         var18 = -599456474;
         var17 = var10003;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = 1917367651;
         var17 = var10003;
         var219[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         char[] var8 = var219;
         var10000 = (int)-8009780101067437006L;
         var18 = -176642345;
         var17 = var10000;
         var10000 = (var17 | var18) & (~var17 | ~var18);
         var18 = 2140842735;
         var17 = var10000;
         char[] var222 = new char[(var17 | var18) & (~var17 | ~var18)];
         var18 = 1153299996;
         var17 = -817101033;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = -1947078389;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var10003 = (int)-850010061733737060L;
         var18 = -1749057473;
         var17 = var10003;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = -1587182205;
         var17 = var10003;
         var222[var10002] = (char)((var17 | var18) - (var17 & var18));
         var10002 = (int)-3770157078285823970L;
         var18 = -419989005;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = 799943148;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = 1645390659;
         var17 = -1712831612;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = -67474236;
         var17 = var10003;
         var222[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         var10002 = (int)5102382794035992613L;
         var18 = -1326860293;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = -1434636324;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var10003 = (int)8071629077188371847L;
         var18 = -2110766555;
         var17 = var10003;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = -491380495;
         var17 = var10003;
         var222[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var18 = -1084240584;
         var17 = -1143156620;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = 75701583;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var10003 = (int)-7953614299494349228L;
         var18 = -324349034;
         var17 = var10003;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = -1433997888;
         var17 = var10003;
         var222[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         var18 = -1614494536;
         var17 = 209245267;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = -1816391441;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var10003 = (int)857046461869261630L;
         var18 = 269509273;
         var17 = var10003;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = 1269389799;
         var17 = var10003;
         var222[var10002] = (char)((var17 | var18) & ~(var17 & var18));
         var10002 = (int)-4145497234365284197L;
         var18 = -699497430;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = 2114290868;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = -30345999;
         var17 = -2004447495;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = 1991656092;
         var17 = var10003;
         var222[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var18 = -348804460;
         var17 = 91655122;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = -297590464;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var10003 = (int)-404221946310394902L;
         var18 = -451602483;
         var17 = var10003;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = -355079394;
         var17 = var10003;
         var222[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         var18 = -387976984;
         var17 = 2030714830;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = -1848258783;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = -1290939296;
         var17 = -2020641554;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = 880980150;
         var17 = var10003;
         var222[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var10002 = (int)1574129190360125957L;
         var18 = -2012857505;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = 502999378;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var10003 = (int)1940260934455165899L;
         var18 = -1654775816;
         var17 = var10003;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = -1533403337;
         var17 = var10003;
         var222[var10002] = (char)((var17 | var18) & ~(var17 & var18));
         var18 = -692741518;
         var17 = 1873463121;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = -1189126870;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = 489600022;
         var17 = 770369813;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = 818179632;
         var17 = var10003;
         var222[var10002] = (char)((var17 | var18) & ~(var17 & var18));
         char[] var9 = var222;
         var10000 = (int)374002544278301244L;
         var18 = 973425775;
         var17 = var10000;
         var10000 = (var17 | var18) - (var17 & var18);
         var18 = 650749523;
         var17 = var10000;

         for (int var10 = var17 & ~var18 | ~var17 & var18; var10 < var6.length; var10++) {
            char var278 = var6[var10];
            char var205 = var8[var10 % var8.length];
            char var106 = var278;
            var7[var10] = (char)(var106 & ~var205 | ~var106 & var205);
         }

         char[] var19 = new char[var7.length];
         var18 = -1893573748;
         var17 = -410871401;
         var10000 = var17 + var18 - 2 * (var17 & var18);
         var18 = 1755365915;
         var17 = var10000;

         for (int var11 = var17 & ~var18 | ~var17 & var18; var11 < var6.length; var11++) {
            char var279 = var7[var11];
            char var208 = var9[var11 % var9.length];
            char var109 = var279;
            var19[var11] = (char)(var109 & ~var208 | ~var109 & var208);
         }

         String var20 = new String(var19);
         int var12 = var20.hashCode();
         var18 = var5;
         var17 = var3;
         var10000 = var17 + ~var18 + 1;
         var18 = var2;
         var17 = var10000;
         int var13 = var17 + ~var18 + 1;
         char[] var14 = var0.toCharArray();
         char[] var15 = new char[var14.length];
         var18 = -685931752;
         var17 = 320842191;
         var10000 = var17 & ~var18 | ~var17 & var18;
         var18 = -1006490921;
         var17 = var10000;

         for (int var16 = var17 & ~var18 | ~var17 & var18; var16 < var15.length; var16++) {
            var18 = -1464230060;
            var17 = 862725441;
            int var10001 = var17 + var18 - 2 * (var17 & var18);
            var18 = -1680492009;
            var17 = var10001;
            switch (var16 % (var17 + var18 - 2 * (var17 & var18))) {
               case 0:
                  var18 = var12;
                  var17 = var13;
                  var10002 = (var17 | var18) & ~(var17 & var18);
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
                  var15[var16] = (char)(var17 + var216 - 2 * (var17 & var216));
            }
         }

         return new String(var15);
      }
   }

   private static class PendingCircle {
      final Vec3d a;
      final long b;

      PendingCircle(Vec3d var1, long var2) {
         this.a = var1;
         this.b = var2;
      }

      public static String a(String var0, String var1, int var2, int var3, int var4, int var5) {
         char[] var6 = var1.toCharArray();
         char[] var7 = new char[var6.length];
         int var18 = -40757501;
         int var17 = 970451965;
         int var10000 = var17 & ~var18 | ~var17 & var18;
         var18 = -1002046220;
         var17 = var10000;
         char[] var219 = new char[(var17 | var18) - (var17 & var18)];
         int var10002 = (int)7656354513673766453L;
         var18 = 285322594;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = 1694133079;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = 1965201754;
         var17 = -2051789698;
         int var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = -258540266;
         var17 = var10003;
         var219[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var18 = -2097633899;
         var17 = 1193446405;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = -975558255;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var10003 = (int)6303297038673006670L;
         var18 = -421313472;
         var17 = var10003;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = 1090729867;
         var17 = var10003;
         var219[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var18 = -1893194599;
         var17 = -950350808;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = 1215490227;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = -441366324;
         var17 = -2060622591;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = 1620840011;
         var17 = var10003;
         var219[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var10002 = (int)2893337734794168982L;
         var18 = 1689491499;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = 2098221758;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var10003 = (int)1367790731001497637L;
         var18 = 1435522627;
         var17 = var10003;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = 502941301;
         var17 = var10003;
         var219[var10002] = (char)((var17 | var18) & ~(var17 & var18));
         var10002 = (int)-2606007235350821340L;
         var18 = 941119172;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = 1053380836;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var10003 = (int)7834243208710360878L;
         var18 = 552196160;
         var17 = var10003;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = -203700661;
         var17 = var10003;
         var219[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         var10002 = (int)-6586375623906843382L;
         var18 = 341432080;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = 937718303;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var10003 = (int)5947516318335694106L;
         var18 = -1490375416;
         var17 = var10003;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = 756424080;
         var17 = var10003;
         var219[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var10002 = (int)-4489115109787430320L;
         var18 = -39088719;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = 1893965799;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var10003 = (int)819457461612604697L;
         var18 = -1981101781;
         var17 = var10003;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = -1306743519;
         var17 = var10003;
         var219[var10002] = (char)((var17 | var18) - (var17 & var18));
         var18 = -186181539;
         var17 = 634231068;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = -785743546;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var10003 = (int)785930669132314237L;
         var18 = 1442186121;
         var17 = var10003;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = -633257514;
         var17 = var10003;
         var219[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var10002 = (int)-6679193956626918547L;
         var18 = -562498501;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = 589948766;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = -626656346;
         var17 = -265079052;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = 714523905;
         var17 = var10003;
         var219[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var18 = -1388823942;
         var17 = -740803830;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = 2128609657;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var10003 = (int)5570228823171909831L;
         var18 = -1173664713;
         var17 = var10003;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = -2000256044;
         var17 = var10003;
         var219[var10002] = (char)((var17 | var18) & ~(var17 & var18));
         char[] var8 = var219;
         var10000 = (int)1133787506786470431L;
         var18 = -1876332658;
         var17 = var10000;
         var10000 = (var17 | var18) & ~(var17 & var18);
         var18 = 1759634843;
         var17 = var10000;
         char[] var222 = new char[var17 & ~var18 | ~var17 & var18];
         var10002 = (int)-8741459946902763422L;
         var18 = 1061007711;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = 699660605;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var10003 = (int)-4486437873146451452L;
         var18 = 1898835550;
         var17 = var10003;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = 957516922;
         var17 = var10003;
         var222[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var18 = 1491614154;
         var17 = -1873960767;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = -928671478;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var10003 = (int)2903808169415295194L;
         var18 = -1542919289;
         var17 = var10003;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = -2048381090;
         var17 = var10003;
         var222[var10002] = (char)((var17 | var18) - (var17 & var18));
         var10002 = (int)7563395272142180405L;
         var18 = -1031418907;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = -1453155374;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var10003 = (int)-5161160397889092360L;
         var18 = 818533093;
         var17 = var10003;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = -1077374642;
         var17 = var10003;
         var222[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var18 = -65240614;
         var17 = 2057876165;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = -2035010788;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var10003 = (int)-7843178842252972140L;
         var18 = 105063654;
         var17 = var10003;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = -605686928;
         var17 = var10003;
         var222[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var18 = 1047977557;
         var17 = 1246487443;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = 1950170562;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var10003 = (int)5496818421041229240L;
         var18 = 453142094;
         var17 = var10003;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = 536753078;
         var17 = var10003;
         var222[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var18 = 587186485;
         var17 = -1018095322;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = -508635114;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var10003 = (int)6195062918352030603L;
         var18 = -1469647607;
         var17 = var10003;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = 1777829398;
         var17 = var10003;
         var222[var10002] = (char)((var17 | var18) & ~(var17 & var18));
         var18 = 1523848866;
         var17 = -1892733347;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = -704956167;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = -971689770;
         var17 = -1481994061;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = 1639917404;
         var17 = var10003;
         var222[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var18 = -608323869;
         var17 = 880352901;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = -272324511;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = 171666230;
         var17 = 290631432;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = 459920390;
         var17 = var10003;
         var222[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         var18 = 551114712;
         var17 = -178466185;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = -712669785;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = -1841236619;
         var17 = -42663072;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = 1865774353;
         var17 = var10003;
         var222[var10002] = (char)((var17 | var18) - (var17 & var18));
         var18 = 373222229;
         var17 = 1582517670;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = 1215145722;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var10003 = (int)-1290816543414830622L;
         var18 = 1511926219;
         var17 = var10003;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = 26321690;
         var17 = var10003;
         var222[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         char[] var9 = var222;
         var18 = -1608280638;
         var17 = 385689385;
         var10000 = (var17 | var18) & ~(var17 & var18);
         var18 = -1226919189;
         var17 = var10000;

         for (int var10 = (var17 | var18) & ~(var17 & var18); var10 < var6.length; var10++) {
            char var274 = var6[var10];
            char var205 = var8[var10 % var8.length];
            char var106 = var274;
            var7[var10] = (char)((var106 | var205) & ~(var106 & var205));
         }

         char[] var19 = new char[var7.length];
         var18 = -1929930045;
         var17 = -48881026;
         var10000 = var17 + var18 - 2 * (var17 & var18);
         var18 = 1910618301;
         var17 = var10000;

         for (int var11 = (var17 | var18) & ~(var17 & var18); var11 < var6.length; var11++) {
            char var275 = var7[var11];
            char var208 = var9[var11 % var9.length];
            char var109 = var275;
            var19[var11] = (char)((var109 | var208) & ~(var109 & var208));
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
         var18 = -83401477;
         var17 = 1097818954;
         var10000 = (var17 | var18) & (~var17 | ~var18);
         var18 = -1167587407;
         var17 = var10000;

         for (int var16 = (var17 | var18) - (var17 & var18); var16 < var15.length; var16++) {
            var18 = 305912183;
            var17 = 978824170;
            int var10001 = (var17 | var18) - (var17 & var18);
            var18 = 678195871;
            var17 = var10001;
            switch (var16 % ((var17 | var18) & ~(var17 & var18))) {
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
                  var10002 = (var17 | var18) - (var17 & var18);
                  char var216 = var14[var16];
                  var17 = var10002;
                  var15[var16] = (char)((var17 | var216) & ~(var17 & var216));
            }
         }

         return new String(var15);
      }
   }
}
