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
import java.util.concurrent.CopyOnWriteArrayList;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.RenderTickCounter;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat.DrawMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult.Type;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.RaycastContext.FluidHandling;
import net.minecraft.world.RaycastContext.ShapeType;
import org.joml.Matrix4f;
import org.joml.Quaternionf;

@ModuleInfo(a = "Hit Bubble", b = "Показывает анимированные пузыри при атаке", c = ModuleCategory.VISUALS)
public class HitBubble extends ClientModule {
   private final SliderSetting a;
   private final ModeSetting b;
   private final SettingGroup e;
   private final BooleanSetting f;
   private final ColorSetting g;
   private final CopyOnWriteArrayList<HitBubble.BubbleParticle> h;

   public HitBubble() {
      int var10005 = (int)-2113304178781140339L;
      int var2 = -1767972790;
      int var1 = var10005;
      var10005 = (var1 | var2) - (var1 & var2);
      var2 = 1945834278;
      var1 = var10005;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = 157678628;
      var1 = -175075083;
      int var10006 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1551603823;
      var1 = var10006;
      var10006 = (var1 | var2) - (var1 & var2);
      int var10007 = (int)421478028288497401L;
      var2 = 1387416375;
      var1 = var10007;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var2 = -688389676;
      var1 = var10007;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      int var10008 = (int)-1358577308344603992L;
      var2 = 2041125622;
      var1 = var10008;
      var10008 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1582168011;
      var1 = var10008;
      this.a = new SliderSetting(
         c("㾁빙㾦븥㿜먹㾥븡㾤븤㾫", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑟{ꟲ꒗ꁤ꤇絴蹆⑿謚㑸vꟳ꒹ꁴ", var10005, var10006, var10007, var1 & ~var2 | ~var1 & var2),
         40.0F,
         10.0F,
         150.0F,
         5.0F
      );
      var10005 = (int)-3675148368667832442L;
      var2 = -90137487;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = 34679318;
      var1 = var10005;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var10006 = (int)5758872627642134393L;
      var2 = -1866644999;
      var1 = var10006;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1387854676;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var10007 = (int)8851398285190879685L;
      var2 = 456267451;
      var1 = var10007;
      var10007 = (var1 | var2) - (var1 & var2);
      var2 = -7103315;
      var1 = var10007;
      var10007 = (var1 | var2) - (var1 & var2);
      var10008 = (int)8556077474095483489L;
      var2 = -1935856285;
      var1 = var10008;
      var10008 = (var1 | var2) & (~var1 | ~var2);
      var2 = -16839973;
      var1 = var10008;
      String var10003 = c(
         "㾱\ueb9e㾩\uebea㿑\uebe8㿓\ueb9b",
         "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑟{ꟲ꒗ꁤ꤇絴蹆⑿謚㑸vꟳ꒹ꁴ",
         var10005,
         var10006,
         var10007,
         (var1 | var2) & (~var1 | ~var2)
      );
      var2 = 1686273071;
      var1 = 1622144797;
      int var10004 = (var1 | var2) & ~(var1 & var2);
      var2 = 70093616;
      var1 = var10004;
      String[] var146 = new String[(var1 | var2) - (var1 & var2)];
      var2 = 931986600;
      var1 = -1316239019;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var2 = -2046347779;
      var1 = var10006;
      var10006 = (var1 | var2) - (var1 & var2);
      var2 = -571426576;
      var1 = 103477264;
      int var10009 = var1 & ~var2 | ~var1 & var2;
      var2 = -270962431;
      var1 = var10009;
      var10009 = (var1 | var2) & (~var1 | ~var2);
      var2 = 2076748830;
      var1 = -503101005;
      int var10010 = (var1 | var2) - (var1 & var2);
      var2 = 964191977;
      var1 = var10010;
      var10010 = (var1 | var2) & (~var1 | ~var2);
      int var10011 = (int)2269544788417886924L;
      var2 = -2087593545;
      var1 = var10011;
      var10011 = (var1 | var2) - (var1 & var2);
      var2 = 1787716271;
      var1 = var10011;
      var10011 = (var1 | var2) - (var1 & var2);
      var2 = -1387854963;
      var1 = -1973433792;
      int var10012 = (var1 | var2) - (var1 & var2);
      var2 = 659197756;
      var1 = var10012;
      var146[var10006] = c("㾌䃀㾤䃈㿓䃏㮳䒲", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑟{ꟲ꒗ꁤ꤇絴蹆⑿謚㑸vꟳ꒹ꁴ", var10009, var10010, var10011, (var1 | var2) & (~var1 | ~var2));
      var10006 = (int)-2861691035387987165L;
      var2 = -1058718320;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var2 = -1977465166;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var10009 = (int)3342589148230473632L;
      var2 = 1188807826;
      var1 = var10009;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var2 = -1467831597;
      var1 = var10009;
      var10009 = (var1 | var2) & (~var1 | ~var2);
      var2 = -2142402179;
      var1 = 2142645845;
      var10010 = (var1 | var2) & ~(var1 & var2);
      var2 = 1600595662;
      var1 = var10010;
      var10010 = (var1 | var2) & (~var1 | ~var2);
      var10011 = (int)6293542737788861336L;
      var2 = 53342389;
      var1 = var10011;
      var10011 = var1 & ~var2 | ~var1 & var2;
      var2 = -1708581054;
      var1 = var10011;
      var10011 = (var1 | var2) & (~var1 | ~var2);
      var2 = 322893351;
      var1 = 804003564;
      var10012 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1021947224;
      var1 = var10012;
      var146[var10006] = c("㾌䎢㾤䎪㿓䎭㮳䟓", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑟{ꟲ꒗ꁤ꤇絴蹆⑿謚㑸vꟳ꒹ꁴ", var10009, var10010, var10011, var1 + var2 - 2 * (var1 & var2));
      var2 = -425771358;
      var1 = -79027077;
      var10007 = (var1 | var2) & (~var1 | ~var2);
      var2 = 701899576;
      var1 = var10007;
      var10007 = (var1 | var2) & (~var1 | ~var2);
      var10008 = (int)1240420461359503077L;
      var2 = 1260844855;
      var1 = var10008;
      var10008 = (var1 | var2) & ~(var1 & var2);
      var2 = -2130977591;
      var1 = var10008;
      var10008 = (var1 | var2) & ~(var1 & var2);
      var2 = 2025615058;
      var1 = -1012048856;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var2 = -1075227058;
      var1 = var10009;
      var10009 = (var1 | var2) & ~(var1 & var2);
      var2 = 263210269;
      var1 = 124142108;
      var10010 = (var1 | var2) - (var1 & var2);
      var2 = 143755209;
      var1 = var10010;
      this.b = new ModeSetting(
         var10003,
         var146,
         c("㾌蛹㾤蛱㿓蛶㮳芋", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑟{ꟲ꒗ꁤ꤇絴蹆⑿謚㑸vꟳ꒹ꁴ", var10007, var10008, var10009, var1 + var2 - 2 * (var1 & var2))
      );
      var10005 = (int)-4111556159434711423L;
      var2 = 1624490499;
      var1 = var10005;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1375476381;
      var1 = var10005;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = -1684424955;
      var1 = 1333833461;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1955327793;
      var1 = var10006;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var10007 = (int)-3049066385920974582L;
      var2 = -41265824;
      var1 = var10007;
      var10007 = (var1 | var2) & (~var1 | ~var2);
      var2 = 751577552;
      var1 = var10007;
      var10007 = (var1 | var2) - (var1 & var2);
      var2 = -1104502630;
      var1 = 2074893464;
      var10008 = (var1 | var2) - (var1 & var2);
      var2 = -977844628;
      var1 = var10008;
      this.e = new SettingGroup(c("㾵밮㾦뱞", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑟{ꟲ꒗ꁤ꤇絴蹆⑿謚㑸vꟳ꒹ꁴ", var10005, var10006, var10007, var1 & ~var2 | ~var1 & var2));
      var2 = 1908154411;
      var1 = -398849107;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var2 = -1383787929;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var10006 = (int)8754083489746915119L;
      var2 = 244016866;
      var1 = var10006;
      var10006 = (var1 | var2) - (var1 & var2);
      var2 = 711824632;
      var1 = var10006;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1059948121;
      var1 = 166861990;
      var10007 = (var1 | var2) - (var1 & var2);
      var2 = -901206254;
      var1 = var10007;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1527157633;
      var1 = 157310888;
      var10008 = var1 & ~var2 | ~var1 & var2;
      var2 = -1381829835;
      var1 = var10008;
      var10003 = c("㾵욢㾦웒㮳욪㾨욨㾦욭㿑욠", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑟{ꟲ꒗ꁤ꤇絴蹆⑿謚㑸vꟳ꒹ꁴ", var10005, var10006, var10007, (var1 | var2) & (~var1 | ~var2));
      var10004 = (int)3718105619027166621L;
      var2 = -272335845;
      var1 = var10004;
      var10004 = (var1 | var2) - (var1 & var2);
      var2 = -1665402489;
      var1 = var10004;
      this.f = new BooleanSetting(var10003, pulse.Bool.from(var1 & (var2 ^ -1) | (var1 ^ -1) & var2));
      var10005 = (int)8859721449372685010L;
      var2 = 1961857649;
      var1 = var10005;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = -433571518;
      var1 = var10005;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var10006 = (int)6375233494647803120L;
      var2 = 1764581297;
      var1 = var10006;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var2 = -907270038;
      var1 = var10006;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var2 = 2001045995;
      var1 = 1624453374;
      var10007 = (var1 | var2) & ~(var1 & var2);
      var2 = 178795926;
      var1 = var10007;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var10008 = (int)-713781372567927522L;
      var2 = 1692768020;
      var1 = var10008;
      var10008 = var1 & ~var2 | ~var1 & var2;
      var2 = -64197422;
      var1 = var10008;
      this.g = new ColorSetting(
            c("㾉뢚㿒루㾭뢖㾮룡㾪벊㿕뢘㾦루", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑟{ꟲ꒗ꁤ꤇絴蹆⑿謚㑸vꟳ꒹ꁴ", var10005, var10006, var10007, (var1 | var2) & ~(var1 & var2)),
            Color.WHITE
         )
         .a(() -> {
            int var10x;
            if (!this.f.a()) {
               var10x = (int)-4580264048225224862L;
               int var2x = -834043940;
               int var1x = var10x;
               var10x = (var1x | var2x) & (~var1x | ~var2x);
               var2x = 1111722175;
               var1x = var10x;
               var10x = (var1x | var2x) & (~var1x | ~var2x);
            } else {
               var10x = (int)6275882824350443596L;
               int var7x = 745050062;
               int var4x = var10x;
               var10x = var4x & ~var7x | ~var4x & var7x;
               var7x = 1359652738;
               var4x = var10x;
               var10x = (var4x | var7x) & ~(var4x & var7x);
            }

            return Boolean.valueOf(pulse.Bool.from(var10x));
         });
      this.h = new CopyOnWriteArrayList<>();
   }

   @EventHandler
   public void a(AttackEntityEvent var1) {
   }

   private Vec3d n() {
      if (c.player != null && c.world != null) {
         RenderTickCounter var10000 = c.getRenderTickCounter();
         int var10001 = (int)-6299233035792949216L;
         int var9 = -2115265228;
         int var8 = var10001;
         var10001 = var8 & ~var9 | ~var8 & var9;
         var9 = 1103920404;
         var8 = var10001;
         float var1 = var10000.getTickDelta(pulse.Bool.from((var8 | var9) & (var8 & var9 ^ -1)));
         Vec3d var2 = c.player.getCameraPosVec(var1);
         Vec3d var3 = c.player.getRotationVec(var1);
         double var4 = 1.0;
         Vec3d var6 = var2.add(var3.multiply(var4));
         BlockHitResult var7 = c.world.raycast(new RaycastContext(var2, var6, ShapeType.OUTLINE, FluidHandling.NONE, c.player));
         return var7 != null && var7.getType() != Type.MISS ? var7.getPos() : var6;
      } else {
         return null;
      }
   }

   @EventHandler
   public void a(WorldRenderEvent var1) {
   }

   private void a(MatrixStack var1, float var2, float var3) {
      RenderSystem.enableBlend();
      int var17 = 785751682;
      int var16 = -642207368;
      int var10000 = (var16 | var17) & ~(var16 & var17);
      var17 = -143840008;
      var16 = var10000;
      var10000 = (var16 | var17) - (var16 & var17);
      int var10001 = (int)8676008200057509206L;
      var17 = -2117973554;
      var16 = var10001;
      var10001 = (var16 | var17) & (~var16 | ~var17);
      var17 = 286235801;
      var16 = var10001;
      RenderSystem.blendFunc(var10000, var16 + var17 - 2 * (var16 & var17));
      RenderSystem.disableCull();
      var10000 = (int)-7074911043958491006L;
      var17 = 573640724;
      var16 = var10000;
      var10000 = (var16 | var17) & ~(var16 & var17);
      var17 = -177428330;
      var16 = var10000;
      RenderSystem.depthMask(pulse.Bool.from(var16 & (var17 ^ -1) | (var16 ^ -1) & var17));
      var17 = 858491556;
      var16 = -875359715;
      int var10003 = (var16 | var17) - (var16 & var17);
      var17 = -855924392;
      var16 = var10003;
      var10003 = var16 + var17 - 2 * (var16 & var17);
      var17 = 763256838;
      var16 = -742467466;
      int var10004 = var16 + var17 - 2 * (var16 & var17);
      var17 = -322606029;
      var16 = var10004;
      var10004 = (var16 | var17) - (var16 & var17);
      int var10005 = (int)7665363583539465601L;
      var17 = 2032298180;
      var16 = var10005;
      var10005 = (var16 | var17) & ~(var16 & var17);
      var17 = -1890710805;
      var16 = var10005;
      var10005 = (var16 | var17) & (~var16 | ~var17);
      var17 = -653578004;
      var16 = 308079653;
      int var10006 = (var16 | var17) & ~(var16 & var17);
      var17 = -887811141;
      var16 = var10006;
      String var103;
      if (this.b
         .b(
            c(
               "\uf70eǁ\uf726ǉ\uf751ǎ\uf331ֳ",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑟{ꟲ꒗ꁤ꤇絴蹆⑿謚㑸vꟳ꒹ꁴ",
               var10003,
               var10004,
               var10005,
               (var16 | var17) & ~(var16 & var17)
            )
         )) {
         int var10002 = (int)-508797016302945996L;
         var17 = 1586560133;
         var16 = var10002;
         var10002 = var16 & ~var17 | ~var16 & var17;
         var17 = 1592278096;
         var16 = var10002;
         var10002 = (var16 | var17) & ~(var16 & var17);
         var17 = -1888406980;
         var16 = -1672964964;
         var10003 = (var16 | var17) - (var16 & var17);
         var17 = 46584586;
         var16 = var10003;
         var10003 = (var16 | var17) & (~var16 | ~var17);
         var17 = 1625795726;
         var16 = 567282122;
         var10004 = (var16 | var17) & ~(var16 & var17);
         var17 = 1446373134;
         var16 = var10004;
         var10004 = (var16 | var17) & (~var16 | ~var17);
         var17 = -1639587274;
         var16 = -1580277332;
         var10005 = (var16 | var17) & (~var16 | ~var17);
         var17 = 1068987203;
         var16 = var10005;
         var103 = c(
            "\uf365멌\uf369멝\uf364멛\uf374멚\uf33e멋\uf364멋\uf373멅\uf374멶\uf320먇\uf361멇\uf376",
            "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑟{ꟲ꒗ꁤ꤇絴蹆⑿謚㑸vꟳ꒹ꁴ",
            var10002,
            var10003,
            var10004,
            var16 & ~var17 | ~var16 & var17
         );
      } else {
         var17 = -542484028;
         var16 = -1797807115;
         int var110 = (var16 | var17) & ~(var16 & var17);
         var17 = 2139014096;
         var16 = var110;
         var110 = var16 + var17 - 2 * (var16 & var17);
         var10003 = (int)-6160004228216871960L;
         var17 = -773631265;
         var16 = var10003;
         var10003 = var16 & ~var17 | ~var16 & var17;
         var17 = 1648065493;
         var16 = var10003;
         var10003 = (var16 | var17) & (~var16 | ~var17);
         var17 = -1458496546;
         var16 = 1447198587;
         var10004 = (var16 | var17) - (var16 & var17);
         var17 = -498328813;
         var16 = var10004;
         var10004 = (var16 | var17) - (var16 & var17);
         var10005 = (int)-7451426851918802059L;
         var17 = 730837346;
         var16 = var10005;
         var10005 = (var16 | var17) & (~var16 | ~var17);
         var17 = -972905466;
         var16 = var10005;
         var103 = c(
            "\uf365䲄\uf369䲕\uf364䲓\uf374䲒\uf33e䲃\uf364䲃\uf373䲍\uf374䲾\uf323䳏\uf361䲏\uf376",
            "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑟{ꟲ꒗ꁤ꤇絴蹆⑿謚㑸vꟳ꒹ꁴ",
            var110,
            var10003,
            var10004,
            var16 + var17 - 2 * (var16 & var17)
         );
      }

      String var4 = var103;
      var17 = 459395066;
      var16 = 1815531664;
      int var112 = (var16 | var17) - (var16 & var17);
      var17 = 1129588363;
      var16 = var112;
      var112 = var16 & ~var17 | ~var16 & var17;
      var10003 = (int)-2342383849270035304L;
      var17 = -160828682;
      var16 = var10003;
      var10003 = (var16 | var17) & (~var16 | ~var17);
      var17 = 1462272685;
      var16 = var10003;
      var10003 = var16 + var17 - 2 * (var16 & var17);
      var10004 = (int)-4912885922627140791L;
      var17 = -1556337425;
      var16 = var10004;
      var10004 = var16 & ~var17 | ~var16 & var17;
      var17 = -624099021;
      var16 = var10004;
      var10004 = var16 & ~var17 | ~var16 & var17;
      var10005 = (int)9157003567275617904L;
      var17 = 420205063;
      var16 = var10005;
      var10005 = var16 & ~var17 | ~var16 & var17;
      var17 = -1688683643;
      var16 = var10005;
      Identifier var5 = Identifier.of(
         c("\uf361൷\uf37d൱\uf374", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=\ua7f0꒼ꁢꤐ絷蹆⑩譸㑟{ꟲ꒗ꁤ꤇絴蹆⑿謚㑸vꟳ꒹ꁴ", var112, var10003, var10004, (var16 | var17) & (~var16 | ~var17)),
         var4
      );
      var10000 = (int)-8646365760218503149L;
      var17 = -1487827833;
      var16 = var10000;
      var10000 = (var16 | var17) & (~var16 | ~var17);
      var17 = 1866654868;
      var16 = var10000;
      RenderSystem.setShaderTexture(var16 & ~var17 | ~var16 & var17, var5);
      RenderSystem.setShader(ShaderProgramKeys.POSITION_TEX);
      var1.push();
      var1.multiply(new Quaternionf().rotationZ((float)Math.toRadians(var2)));
      float var6 = var3 * 2.0F;
      Color var7 = this.o();
      float var8 = var7.getRed() / 255.0F;
      float var9 = var7.getGreen() / 255.0F;
      float var10 = var7.getBlue() / 255.0F;
      float var11 = (1.0F - var3) * 0.8F;
      RenderSystem.setShaderColor(var8, var9, var10, var11);
      Tessellator var12 = Tessellator.getInstance();
      BufferBuilder var13 = var12.begin(DrawMode.QUADS, VertexFormats.POSITION_TEXTURE);
      Matrix4f var14 = var1.peek().getPositionMatrix();
      float var15 = var6 / 2.0F;
      var13.vertex(var14, -var15, -var15, 0.0F).texture(0.0F, 0.0F);
      var13.vertex(var14, var15, -var15, 0.0F).texture(1.0F, 0.0F);
      var13.vertex(var14, var15, var15, 0.0F).texture(1.0F, 1.0F);
      var13.vertex(var14, -var15, var15, 0.0F).texture(0.0F, 1.0F);
      BufferRenderer.drawWithGlobalProgram(var13.end());
      var1.pop();
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
      var17 = 1610248852;
      var16 = 371919280;
      var10000 = (var16 | var17) - (var16 & var17);
      var17 = 1238465317;
      var16 = var10000;
      RenderSystem.depthMask(pulse.Bool.from((var16 | var17) & (var16 & var17 ^ -1)));
      RenderSystem.enableCull();
      RenderSystem.defaultBlendFunc();
      RenderSystem.disableBlend();
   }

   private Color o() {
      return this.f.a() ? ModuleRegistry.CLIENT_COLOR.n() : this.g.a();
   }

   public static String c(String var0, String var1, int var2, int var3, int var4, int var5) {
      char[] var6 = var1.toCharArray();
      char[] var7 = new char[var6.length];
      int var10000 = (int)1548375429528106499L;
      int var18 = 1249388551;
      int var17 = var10000;
      var10000 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1785782770;
      var17 = var10000;
      char[] var220 = new char[var17 & ~var18 | ~var17 & var18];
      int var10002 = (int)4135316140411307793L;
      var18 = -1155001426;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 336581823;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      int var10003 = (int)2434476810902399545L;
      var18 = -570280953;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 163649036;
      var17 = var10003;
      var220[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var18 = -707862407;
      var17 = -1214206633;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 1651395887;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)-3583972087888162192L;
      var18 = 1266831113;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -1157579012;
      var17 = var10003;
      var220[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var10002 = (int)2005497422352014054L;
      var18 = 1410519862;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -447608366;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -2053609707;
      var17 = 1711700043;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -476169000;
      var17 = var10003;
      var220[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var18 = -286303173;
      var17 = 1389475652;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1136727172;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1755270172;
      var17 = 1298693053;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 636989362;
      var17 = var10003;
      var220[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var18 = -742261146;
      var17 = -1751591247;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 1146693843;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -1759958106;
      var17 = -512061597;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 1986213344;
      var17 = var10003;
      var220[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var10002 = (int)4151204040672749843L;
      var18 = 95635284;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -1077645758;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1478103730;
      var17 = 176724840;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1385352284;
      var17 = var10003;
      var220[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var10002 = (int)991309251078924801L;
      var18 = -1700765868;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 1740535123;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 1431983834;
      var17 = -401449792;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1119354103;
      var17 = var10003;
      var220[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var10002 = (int)2114807552534393744L;
      var18 = 1156787616;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -304931273;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var10003 = (int)2231548314669616862L;
      var18 = 204928112;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 2134363788;
      var17 = var10003;
      var220[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var10002 = (int)4079812983635088198L;
      var18 = -1265630424;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 1124634726;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 359524961;
      var17 = -2047379000;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -1868915718;
      var17 = var10003;
      var220[var10002] = (char)((var17 | var18) - (var17 & var18));
      var10002 = (int)-1284921953606335596L;
      var18 = 1447305378;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 695575359;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)-537046811662013013L;
      var18 = -1575932440;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1993341081;
      var17 = var10003;
      var220[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      char[] var8 = var220;
      var18 = -89813730;
      var17 = 1714750925;
      var10000 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1668249383;
      var17 = var10000;
      char[] var222 = new char[var17 + var18 - 2 * (var17 & var18)];
      var18 = -1561561007;
      var17 = -376204209;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 1266674718;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 1706012450;
      var17 = 807991732;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1434918582;
      var17 = var10003;
      var222[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var10002 = (int)-3453943251537537298L;
      var18 = 2054717672;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -473442809;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 2056793100;
      var17 = -1697701549;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -531134116;
      var17 = var10003;
      var222[var10002] = (char)((var17 | var18) - (var17 & var18));
      var18 = -1805076551;
      var17 = -1502485644;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 840520911;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -707423916;
      var17 = -1551554482;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1984970313;
      var17 = var10003;
      var222[var10002] = (char)((var17 | var18) - (var17 & var18));
      var18 = -860323507;
      var17 = -1636558069;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1389140549;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 1734174205;
      var17 = 1305448513;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 714263998;
      var17 = var10003;
      var222[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var18 = 1157841159;
      var17 = -246713362;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -1270336787;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var10003 = (int)5489323231518647967L;
      var18 = 1595899807;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1760076096;
      var17 = var10003;
      var222[var10002] = (char)((var17 | var18) - (var17 & var18));
      var18 = -1817004134;
      var17 = -2086068910;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 270248653;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1984182029;
      var17 = -1584811964;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -674381859;
      var17 = var10003;
      var222[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var10002 = (int)174383870522926097L;
      var18 = 1914371804;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1559668021;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1038045026;
      var17 = 606346049;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 435933978;
      var17 = var10003;
      var222[var10002] = (char)((var17 | var18) - (var17 & var18));
      var10002 = (int)-7628773082188219183L;
      var18 = 2042520634;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -2052744980;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -455535384;
      var17 = 1475583105;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1289054127;
      var17 = var10003;
      var222[var10002] = (char)((var17 | var18) - (var17 & var18));
      var10002 = (int)-3289466091323015873L;
      var18 = 1024030084;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -1862874957;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var10003 = (int)-1572911774469677102L;
      var18 = -1542407468;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -2019252734;
      var17 = var10003;
      var222[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var18 = 874605352;
      var17 = -1282595962;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -2018752345;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 1375007587;
      var17 = -449189541;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1261623029;
      var17 = var10003;
      var222[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      char[] var9 = var222;
      var10000 = (int)7954833553274923349L;
      var18 = 316730110;
      var17 = var10000;
      var10000 = var17 & ~var18 | ~var17 & var18;
      var18 = 1286570923;
      var17 = var10000;

      for (int var10 = var17 & ~var18 | ~var17 & var18; var10 < var6.length; var10++) {
         char var280 = var6[var10];
         char var205 = var8[var10 % var8.length];
         char var106 = var280;
         var7[var10] = (char)(var106 & ~var205 | ~var106 & var205);
      }

      char[] var19 = new char[var7.length];
      var18 = -1175568560;
      var17 = 1914229352;
      var10000 = (var17 | var18) & ~(var17 & var18);
      var18 = -873009864;
      var17 = var10000;

      for (int var11 = (var17 | var18) & ~(var17 & var18); var11 < var6.length; var11++) {
         char var281 = var7[var11];
         char var208 = var9[var11 % var9.length];
         char var109 = var281;
         var19[var11] = (char)((var109 | var208) & ~(var109 & var208));
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
      var10000 = (int)3134915257863470396L;
      var18 = 1827199220;
      var17 = var10000;
      var10000 = var17 + var18 - 2 * (var17 & var18);
      var18 = 621782472;
      var17 = var10000;

      for (int var16 = (var17 | var18) & ~(var17 & var18); var16 < var15.length; var16++) {
         int var10001 = (int)-3962478036738302634L;
         var18 = -911838888;
         var17 = var10001;
         var10001 = var17 + var18 - 2 * (var17 & var18);
         var18 = -196383732;
         var17 = var10001;
         switch (var16 % ((var17 | var18) - (var17 & var18))) {
            case 0:
               var18 = var12;
               var17 = var13;
               var10002 = var17 + var18 - 2 * (var17 & var18);
               char var218 = var14[var16];
               var17 = var10002;
               var15[var16] = (char)((var17 | var218) & ~(var17 & var218));
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

   public static class BubbleParticle {
      public final float a;
      public final float b;
      public final float c;
      public final float d;
      public final float e;
      public final long f;

      public BubbleParticle(float var1, float var2, float var3, float var4, float var5, long var6) {
         this.a = var1;
         this.b = var2;
         this.c = var3;
         this.d = var4;
         this.e = var5;
         this.f = var6;
      }

      public static String a(String var0, String var1, int var2, int var3, int var4, int var5) {
         char[] var6 = var1.toCharArray();
         char[] var7 = new char[var6.length];
         int var10000 = (int)4766135349095113170L;
         int var18 = 579367260;
         int var17 = var10000;
         var10000 = (var17 | var18) - (var17 & var18);
         var18 = 817320068;
         var17 = var10000;
         char[] var220 = new char[(var17 | var18) - (var17 & var18)];
         var18 = 1286419398;
         var17 = -2054011927;
         int var10002 = (var17 | var18) - (var17 & var18);
         var18 = -918589393;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         int var10003 = (int)-6406448428492906485L;
         var18 = -571342924;
         var17 = var10003;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = 102995853;
         var17 = var10003;
         var220[var10002] = (char)((var17 | var18) & ~(var17 & var18));
         var18 = -1111766308;
         var17 = 1194126300;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = -90758911;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = 1614245420;
         var17 = -1271672130;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = -737894633;
         var17 = var10003;
         var220[var10002] = (char)((var17 | var18) - (var17 & var18));
         var18 = -687020466;
         var17 = -1787221882;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = 1115016906;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var10003 = (int)-2494833772938581288L;
         var18 = -1250179700;
         var17 = var10003;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = 1663225042;
         var17 = var10003;
         var220[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         var18 = 1386960774;
         var17 = 953282288;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = 1786427765;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var10003 = (int)-8725501207764224410L;
         var18 = -231577219;
         var17 = var10003;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = 1707755272;
         var17 = var10003;
         var220[var10002] = (char)((var17 | var18) & ~(var17 & var18));
         var18 = -1653033301;
         var17 = -1242782870;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = 680793541;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var10003 = (int)-4271405885277744477L;
         var18 = 471420058;
         var17 = var10003;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = 1889013532;
         var17 = var10003;
         var220[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var10002 = (int)-4203745379332364013L;
         var18 = 2033379740;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = -343506806;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var10003 = (int)-4539352394631258698L;
         var18 = 2077145823;
         var17 = var10003;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = 1415684843;
         var17 = var10003;
         var220[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var18 = -1550643180;
         var17 = -2134789804;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = 592617798;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var10003 = (int)7750167190155430144L;
         var18 = -331321810;
         var17 = var10003;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = -1554354627;
         var17 = var10003;
         var220[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var10002 = (int)-3091580148273254261L;
         var18 = -1306728785;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = -1718020573;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var10003 = (int)-2400347149656943873L;
         var18 = 925917918;
         var17 = var10003;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = 270779395;
         var17 = var10003;
         var220[var10002] = (char)((var17 | var18) - (var17 & var18));
         var18 = -1884560888;
         var17 = 1802281432;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = -456703016;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = 1987394781;
         var17 = -1448540231;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = -539217097;
         var17 = var10003;
         var220[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         var18 = 1039644326;
         var17 = -491289264;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = -549440513;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = 1768559380;
         var17 = -1069733824;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = -1453900688;
         var17 = var10003;
         var220[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         char[] var8 = var220;
         var10000 = (int)3664334564065647892L;
         var18 = -706892980;
         var17 = var10000;
         var10000 = (var17 | var18) - (var17 & var18);
         var18 = -930335150;
         var17 = var10000;
         char[] var223 = new char[(var17 | var18) & (~var17 | ~var18)];
         var10002 = (int)4871125853782012993L;
         var18 = -239273569;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = 727256542;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = -542230647;
         var17 = -1973792796;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = 1442066509;
         var17 = var10003;
         var223[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var18 = -1600814605;
         var17 = -1492674236;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = 127015094;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var10003 = (int)-3347845129336535932L;
         var18 = 1474492012;
         var17 = var10003;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = -113395989;
         var17 = var10003;
         var223[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var10002 = (int)934009060482264176L;
         var18 = 1334418262;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = -192727260;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = -710311307;
         var17 = 710633253;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = -892413;
         var17 = var10003;
         var223[var10002] = (char)((var17 | var18) & ~(var17 & var18));
         var10002 = (int)9178430619135408973L;
         var18 = 1093181810;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = -2012554692;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var10003 = (int)-1446252996809996458L;
         var18 = -103507906;
         var17 = var10003;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = 606037866;
         var17 = var10003;
         var223[var10002] = (char)((var17 | var18) & ~(var17 & var18));
         var10002 = (int)4965538342151341871L;
         var18 = -511803214;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = -1409431655;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = 603508879;
         var17 = 2032619629;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = 1524611234;
         var17 = var10003;
         var223[var10002] = (char)((var17 | var18) & ~(var17 & var18));
         var18 = 497250787;
         var17 = 555494364;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = 1019173434;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = 1775371517;
         var17 = -1430075776;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = -1022297367;
         var17 = var10003;
         var223[var10002] = (char)((var17 | var18) & ~(var17 & var18));
         var10002 = (int)956693677423517871L;
         var18 = 849962844;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = -2095478795;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var10003 = (int)269132549683046149L;
         var18 = -431628171;
         var17 = var10003;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = 589234249;
         var17 = var10003;
         var223[var10002] = (char)((var17 | var18) - (var17 & var18));
         var10002 = (int)-6698362033039985447L;
         var18 = -1708673698;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = -241729152;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = 1720421031;
         var17 = -1495920818;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = -1067608623;
         var17 = var10003;
         var223[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         var18 = 1211631588;
         var17 = -839207993;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = -2050837461;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var10003 = (int)8657917130832610346L;
         var18 = 2117564163;
         var17 = var10003;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = 943452205;
         var17 = var10003;
         var223[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var18 = -182584643;
         var17 = -1764596171;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = 1674550401;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = 838395581;
         var17 = -1016738152;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = -224584938;
         var17 = var10003;
         var223[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         char[] var9 = var223;
         var10000 = (int)-6453924283957717737L;
         var18 = 2089872781;
         var17 = var10000;
         var10000 = var17 + var18 - 2 * (var17 & var18);
         var18 = -1543620454;
         var17 = var10000;

         for (int var10 = var17 & ~var18 | ~var17 & var18; var10 < var6.length; var10++) {
            char var278 = var6[var10];
            char var205 = var8[var10 % var8.length];
            char var106 = var278;
            var7[var10] = (char)((var106 | var205) & (~var106 | ~var205));
         }

         char[] var19 = new char[var7.length];
         var10000 = (int)4775889127391632839L;
         var18 = 334492640;
         var17 = var10000;
         var10000 = (var17 | var18) - (var17 & var18);
         var18 = -1623462361;
         var17 = var10000;

         for (int var11 = (var17 | var18) & ~(var17 & var18); var11 < var6.length; var11++) {
            char var279 = var7[var11];
            char var208 = var9[var11 % var9.length];
            char var109 = var279;
            var19[var11] = (char)((var109 | var208) & (~var109 | ~var208));
         }

         String var20 = new String(var19);
         int var12 = var20.hashCode();
         var18 = var5;
         var17 = var3;
         var10000 = (var17 & ~var18) - (~var17 & var18);
         var18 = var2;
         var17 = var10000;
         int var13 = (var17 & ~var18) - (~var17 & var18);
         char[] var14 = var0.toCharArray();
         char[] var15 = new char[var14.length];
         var18 = 41288446;
         var17 = 649005071;
         var10000 = var17 & ~var18 | ~var17 & var18;
         var18 = 618203889;
         var17 = var10000;

         for (int var16 = var17 + var18 - 2 * (var17 & var18); var16 < var15.length; var16++) {
            int var10001 = (int)-142113224196953983L;
            var18 = 1725592135;
            var17 = var10001;
            var10001 = (var17 | var18) & ~(var17 & var18);
            var18 = -285173052;
            var17 = var10001;
            switch (var16 % ((var17 | var18) - (var17 & var18))) {
               case 0:
                  var18 = var12;
                  var17 = var13;
                  var10002 = (var17 | var18) & (~var17 | ~var18);
                  char var218 = var14[var16];
                  var17 = var10002;
                  var15[var16] = (char)(var17 + var218 - 2 * (var17 & var218));
                  break;
               case 1:
                  var18 = var13;
                  var17 = var5;
                  var10002 = (var17 | var18) & (~var17 | ~var18);
                  char var216 = var14[var16];
                  var17 = var10002;
                  var15[var16] = (char)((var17 | var216) & ~(var17 & var216));
            }
         }

         return new String(var15);
      }
   }
}
