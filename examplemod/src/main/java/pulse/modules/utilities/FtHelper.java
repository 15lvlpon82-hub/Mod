package pulse;




import pulse.module.ModuleRegistry;
import pulse.module.ClientModule;
import pulse.FriendLookup;
import pulse.module.ModuleInfo;
import pulse.module.ModuleCategory;
import pulse.settings.BooleanSetting;
import pulse.settings.ColorSetting;
import pulse.settings.SettingGroup;
import pulse.settings.SliderSetting;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Predicate;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.text.Text;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult.Type;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.RaycastContext.FluidHandling;
import net.minecraft.world.RaycastContext.ShapeType;

@ModuleInfo(a = "FT Helper", b = "Предпросмотр зоны действия донат-предметов", c = ModuleCategory.UTILITIES)
public class FtHelper extends ClientModule {
   private final BooleanSetting a;
   private final BooleanSetting b;
   private final BooleanSetting e;
   private final BooleanSetting f;
   private final BooleanSetting g;
   private final SettingGroup h;
   private final BooleanSetting i;
   private final BooleanSetting j;
   private final SettingGroup k;
   private final SliderSetting l;
   private final SettingGroup m;
   private final BooleanSetting n;
   private final ColorSetting o;
   private boolean p;
   private long q;
   private int r;
   private long s;
   private boolean t;
   private boolean u;
   private Vec3d v;
   private final List<Vec3d> w;

   public FtHelper() {
      int var2 = 1908970401;
      int var1 = 1831679968;
      int var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = 757598650;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      int var10006 = (int)3015230618593085273L;
      var2 = -1812058403;
      var1 = var10006;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1128722317;
      var1 = var10006;
      var10006 = var1 & ~var2 | ~var1 & var2;
      int var10007 = (int)5883185810576356939L;
      var2 = 1449173197;
      var1 = var10007;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1302160956;
      var1 = var10007;
      var10007 = (var1 | var2) & ~(var1 & var2);
      var2 = -842561794;
      var1 = 120802448;
      int var10008 = var1 & ~var2 | ~var1 & var2;
      var2 = -891812892;
      var1 = var10008;
      String var10003 = c("ꮫ쾸ꮹ쿇ꮳ쿈", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=Ꟁꒁꁙ꤀絺蹚⑿謥㑚}\ua7e2꒠ꁽ꤀", var10005, var10006, var10007, (var1 | var2) & (~var1 | ~var2));
      var2 = -1119575385;
      var1 = 1964603647;
      int var10004 = (var1 | var2) & ~(var1 & var2);
      var2 = -933373351;
      var1 = var10004;
      this.a = new BooleanSetting(var10003, pulse.Bool.from((var1 | var2) - (var1 & var2)));
      var2 = 737783382;
      var1 = -1365677324;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = -1263703719;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var10006 = (int)1267886796200027011L;
      var2 = -752283237;
      var1 = var10006;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1682686867;
      var1 = var10006;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var10007 = (int)-4127727003003462283L;
      var2 = 1834042446;
      var1 = var10007;
      var10007 = (var1 | var2) & ~(var1 & var2);
      var2 = 1798854635;
      var1 = var10007;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      var2 = -319568587;
      var1 = 307873881;
      var10008 = (var1 | var2) & (~var1 | ~var2);
      var2 = -18721948;
      var1 = var10008;
      var10003 = c("ꮖ塁ꮹ堻ꯋ", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=Ꟁꒁꁙ꤀絺蹚⑿謥㑚}\ua7e2꒠ꁽ꤀", var10005, var10006, var10007, (var1 | var2) & (~var1 | ~var2));
      var10004 = (int)1443191348056044711L;
      var2 = 420251374;
      var1 = var10004;
      var10004 = (var1 | var2) - (var1 & var2);
      var2 = 1656795720;
      var1 = var10004;
      this.b = new BooleanSetting(var10003, pulse.Bool.from((var1 | var2) - (var1 & var2)));
      var10005 = (int)8226699838629121695L;
      var2 = 989596474;
      var1 = var10005;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = -1737414562;
      var1 = var10005;
      var10005 = (var1 | var2) - (var1 & var2);
      var10006 = (int)8398504165051062718L;
      var2 = -116725552;
      var1 = var10006;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var2 = 497376831;
      var1 = var10006;
      var10006 = (var1 | var2) - (var1 & var2);
      var2 = -377204661;
      var1 = 1552305894;
      var10007 = (var1 | var2) - (var1 & var2);
      var2 = -1460732632;
      var1 = var10007;
      var10007 = (var1 | var2) & ~(var1 & var2);
      var2 = 1323389418;
      var1 = -398060982;
      var10008 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1499071164;
      var1 = var10008;
      var10003 = c("ꮝ뢣ꮾ뢨ꯉ뢮ꮼ뢫ꯋ뢦ꯏ뢮ꯆ", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=Ꟁꒁꁙ꤀絺蹚⑿謥㑚}\ua7e2꒠ꁽ꤀", var10005, var10006, var10007, var1 + var2 - 2 * (var1 & var2));
      var10004 = (int)-6069944647068465393L;
      var2 = -1902587477;
      var1 = var10004;
      var10004 = (var1 | var2) & ~(var1 & var2);
      var2 = 1873516197;
      var1 = var10004;
      this.e = new BooleanSetting(var10003, pulse.Bool.from((var1 | var2) - (var1 & var2)));
      var10005 = (int)-4627835391254403562L;
      var2 = -179038563;
      var1 = var10005;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var2 = -439001744;
      var1 = var10005;
      var10005 = (var1 | var2) - (var1 & var2);
      var10006 = (int)-2375707887436866837L;
      var2 = 1827239490;
      var1 = var10006;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1651516249;
      var1 = var10006;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1921859702;
      var1 = 940035106;
      var10007 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1332925428;
      var1 = var10007;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var10008 = (int)5995138936626770380L;
      var2 = -706407650;
      var1 = var10008;
      var10008 = var1 & ~var2 | ~var1 & var2;
      var2 = -1122542221;
      var1 = var10008;
      var10003 = c("ꮦ㧡ꮴ㧣ꯆ㷳ꮶ㦘ꮲ㦟", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=Ꟁꒁꁙ꤀絺蹚⑿謥㑚}\ua7e2꒠ꁽ꤀", var10005, var10006, var10007, (var1 | var2) & (~var1 | ~var2));
      var10004 = (int)2666500318263113155L;
      var2 = -873200502;
      var1 = var10004;
      var10004 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1401032376;
      var1 = var10004;
      this.f = new BooleanSetting(var10003, pulse.Bool.from(var1 & (var2 ^ -1) | (var1 ^ -1) & var2));
      var2 = 1284554002;
      var1 = -656819379;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = -1518031964;
      var1 = var10005;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var10006 = (int)8806907538056241494L;
      var2 = -983108343;
      var1 = var10006;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var2 = -191405440;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var10007 = (int)-7306984630973708568L;
      var2 = 96695037;
      var1 = var10007;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var2 = 379425758;
      var1 = var10007;
      var10007 = (var1 | var2) & ~(var1 & var2);
      var2 = -1411354000;
      var1 = 339899043;
      var10008 = (var1 | var2) & ~(var1 & var2);
      var2 = -1074575711;
      var1 = var10008;
      var10003 = c("ꮨ䀽ꮼ䀶ꮷ䀺꾩䀷ꮹ䀼ꮷ䁀ꮷ䀷ꮳ䀸", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=Ꟁꒁꁙ꤀絺蹚⑿謥㑚}\ua7e2꒠ꁽ꤀", var10005, var10006, var10007, (var1 | var2) & (~var1 | ~var2));
      var2 = 1687627414;
      var1 = -9219566;
      var10004 = (var1 | var2) - (var1 & var2);
      var2 = -1679526779;
      var1 = var10004;
      this.g = new BooleanSetting(var10003, pulse.Bool.from((var1 | var2) - (var1 & var2)));
      var10005 = (int)-2014503836296956866L;
      var2 = -1284883377;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1535367798;
      var1 = var10005;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = 1549082479;
      var1 = 1807148527;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1445279003;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var2 = -717599013;
      var1 = 848926054;
      var10007 = (var1 | var2) & (~var1 | ~var2);
      var2 = -339805344;
      var1 = var10007;
      var10007 = (var1 | var2) & ~(var1 & var2);
      var10008 = (int)-3247463962260263353L;
      var2 = -1614384819;
      var1 = var10008;
      var10008 = (var1 | var2) & ~(var1 & var2);
      var2 = -212655886;
      var1 = var10008;
      this.h = new SettingGroup(
         c("ꮔ禺ꯈ秈ꯉ禴ꮰ禰ꮱ綪ꯋ秊ꮹ禵ꮳ禲", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=Ꟁꒁꁙ꤀絺蹚⑿謥㑚}\ua7e2꒠ꁽ꤀", var10005, var10006, var10007, var1 & ~var2 | ~var1 & var2)
      );
      var2 = -1458599764;
      var1 = 520877958;
      var10005 = (var1 | var2) - (var1 & var2);
      var2 = -2016816431;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = -546185695;
      var1 = 384249597;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var2 = 1474338980;
      var1 = var10006;
      var10006 = (var1 | var2) - (var1 & var2);
      var2 = 560755431;
      var1 = -1324994317;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1676825397;
      var1 = var10007;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var10008 = (int)-8657597198816763700L;
      var2 = -500685604;
      var1 = var10008;
      var10008 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1451140123;
      var1 = var10008;
      var10003 = c(
         "ꮫꙉꮰꙅꮼ\ua639꾩ꙍꮼꙀꯈ\ua63bꮻꙁꯆ", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=Ꟁꒁꁙ꤀絺蹚⑿謥㑚}\ua7e2꒠ꁽ꤀", var10005, var10006, var10007, (var1 | var2) & ~(var1 & var2)
      );
      var10004 = (int)5211313264244749198L;
      var2 = -1679336716;
      var1 = var10004;
      var10004 = (var1 | var2) & (~var1 | ~var2);
      var2 = 57780603;
      var1 = var10004;
      this.i = new BooleanSetting(var10003, pulse.Bool.from(var1 & (var2 ^ -1) | (var1 ^ -1) & var2));
      var10005 = (int)5456140582415856733L;
      var2 = -2025116923;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = 503050915;
      var1 = var10005;
      var10005 = (var1 | var2) - (var1 & var2);
      var2 = 795509932;
      var1 = -1144110605;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var2 = 183023324;
      var1 = var10006;
      var10006 = (var1 | var2) - (var1 & var2);
      var2 = 749897038;
      var1 = -2053523456;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1132914810;
      var1 = var10007;
      var10007 = (var1 | var2) & ~(var1 & var2);
      var10008 = (int)3780020098442433881L;
      var2 = 852612608;
      var1 = var10008;
      var10008 = (var1 | var2) & ~(var1 & var2);
      var2 = -1181843377;
      var1 = var10008;
      var10003 = c(
         "ꮞ앚ꮴ암꾩앐ꯉ암ꮳ앚ꮴ씨ꮼ앝꾩씦ꯉ암ꮶ앞ꮱ", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=Ꟁꒁꁙ꤀絺蹚⑿謥㑚}\ua7e2꒠ꁽ꤀", var10005, var10006, var10007, (var1 | var2) & (~var1 | ~var2)
      );
      var2 = 995970366;
      var1 = -2145395163;
      var10004 = (var1 | var2) - (var1 & var2);
      var2 = -1153264869;
      var1 = var10004;
      this.j = new BooleanSetting(var10003, pulse.Bool.from(var1 + var2 - 2 * (var1 & var2)));
      var2 = -975749696;
      var1 = -94972630;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = 239879441;
      var1 = var10005;
      var10005 = (var1 | var2) - (var1 & var2);
      var10006 = (int)6268387480325704657L;
      var2 = 140283644;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var2 = 558674848;
      var1 = var10006;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1812289270;
      var1 = 1881854169;
      var10007 = (var1 | var2) - (var1 & var2);
      var2 = 409797539;
      var1 = var10007;
      var10007 = (var1 | var2) - (var1 & var2);
      var10008 = (int)1242273637362837767L;
      var2 = 426875538;
      var1 = var10008;
      var10008 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1916799563;
      var1 = var10008;
      this.k = new SettingGroup(
         c("ꮔ䁢ꯈ䀐ꯉ䁬ꮰ䁨ꮱ䑲ꯈ䁯ꮼ䁤ꮳ䁢", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=Ꟁꒁꁙ꤀絺蹚⑿謥㑚}\ua7e2꒠ꁽ꤀", var10005, var10006, var10007, (var1 | var2) & (~var1 | ~var2))
      );
      var10005 = (int)-3918336804157341039L;
      var2 = -1884449534;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var2 = 1807546984;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = 159062377;
      var1 = -2116620961;
      var10006 = (var1 | var2) - (var1 & var2);
      var2 = 378636339;
      var1 = var10006;
      var10006 = (var1 | var2) - (var1 & var2);
      var2 = 1064236439;
      var1 = -332934761;
      var10007 = (var1 | var2) - (var1 & var2);
      var2 = -771891364;
      var1 = var10007;
      var10007 = (var1 | var2) - (var1 & var2);
      var2 = 1677015908;
      var1 = -1114074603;
      var10008 = (var1 | var2) & (~var1 | ~var2);
      var2 = -562208023;
      var1 = var10008;
      this.l = new SliderSetting(
         c("ꮟ췒ꯉ췗ꮷ춫ꯋ춦꾩췑ꮱ췗ꮱ췒", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=Ꟁꒁꁙ꤀絺蹚⑿謥㑚}\ua7e2꒠ꁽ꤀", var10005, var10006, var10007, var1 & ~var2 | ~var1 & var2),
         2.5F,
         0.5F,
         10.0F
      );
      var2 = 506406358;
      var1 = -1718447052;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var2 = -1234166759;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var10006 = (int)4462559719062062157L;
      var2 = -791602426;
      var1 = var10006;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var2 = -180029857;
      var1 = var10006;
      var10006 = (var1 | var2) - (var1 & var2);
      var10007 = (int)-1713795891447995604L;
      var2 = -2118729096;
      var1 = var10007;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      var2 = 162665685;
      var1 = var10007;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      var10008 = (int)-975474111436929094L;
      var2 = -765478793;
      var1 = var10008;
      var10008 = (var1 | var2) & (~var1 | ~var2);
      var2 = 377030506;
      var1 = var10008;
      this.m = new SettingGroup(c("ꮯﻧꮼﺗ", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=Ꟁꒁꁙ꤀絺蹚⑿謥㑚}\ua7e2꒠ꁽ꤀", var10005, var10006, var10007, (var1 | var2) - (var1 & var2)));
      var10005 = (int)1860291001743854937L;
      var2 = 1195741654;
      var1 = var10005;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var2 = 658796916;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var10006 = (int)6754482986474258955L;
      var2 = 876186526;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var2 = -531166142;
      var1 = var10006;
      var10006 = (var1 | var2) - (var1 & var2);
      var10007 = (int)-1287947404473169900L;
      var2 = -168453429;
      var1 = var10007;
      var10007 = (var1 | var2) & (~var1 | ~var2);
      var2 = 847830808;
      var1 = var10007;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var10008 = (int)-1778644827976787211L;
      var2 = -2073203102;
      var1 = var10008;
      var10008 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1520132605;
      var1 = var10008;
      var10003 = c("ꮯ錪ꮼ鍚꾩錢ꮲ錠ꮼ錥ꯋ錨", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=Ꟁꒁꁙ꤀絺蹚⑿謥㑚}\ua7e2꒠ꁽ꤀", var10005, var10006, var10007, (var1 | var2) & (~var1 | ~var2));
      var2 = -2135236730;
      var1 = 312430187;
      var10004 = var1 & ~var2 | ~var1 & var2;
      var2 = -1843031572;
      var1 = var10004;
      this.n = new BooleanSetting(var10003, pulse.Bool.from(var1 + var2 - 2 * (var1 & var2)));
      var10005 = (int)-8235043976640260144L;
      var2 = 1615775680;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var2 = 924876267;
      var1 = var10005;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1809565093;
      var1 = -878641421;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var2 = -1043076487;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var10007 = (int)-5860547241344643545L;
      var2 = 1068836218;
      var1 = var10007;
      var10007 = (var1 | var2) - (var1 & var2);
      var2 = -1862632913;
      var1 = var10007;
      var10007 = (var1 | var2) & (~var1 | ~var2);
      var10008 = (int)-6565254098537811988L;
      var2 = 2019385523;
      var1 = var10008;
      var10008 = var1 & ~var2 | ~var1 & var2;
      var2 = 68153659;
      var1 = var10008;
      this.o = new ColorSetting(
            c("ꮓ砦ꯈ硔ꮷ砪ꮴ硝ꮰ簶ꯏ砤ꮼ硔", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=Ꟁꒁꁙ꤀絺蹚⑿謥㑚}\ua7e2꒠ꁽ꤀", var10005, var10006, var10007, (var1 | var2) - (var1 & var2)),
            Color.WHITE
         )
         .a(() -> {
            int var10x;
            if (!this.n.k()) {
               var10x = (int)-315433256007684004L;
               int var2x = 1712814277;
               int var1x = var10x;
               var10x = var1x + var2x - 2 * (var1x & var2x);
               var2x = -1622783848;
               var1x = var10x;
               var10x = (var1x | var2x) & (~var1x | ~var2x);
            } else {
               int var7x = 491198444;
               int var4x = -1576287135;
               var10x = var4x + var7x - 2 * (var4x & var7x);
               var7x = -1085484147;
               var4x = var10x;
               var10x = (var4x | var7x) & ~(var4x & var7x);
            }

            return Boolean.valueOf(pulse.Bool.from(var10x));
         });
      int var10001 = (int)-2241390672903311502L;
      var2 = 374060979;
      var1 = var10001;
      var10001 = (var1 | var2) - (var1 & var2);
      var2 = -453846847;
      var1 = var10001;
      this.p = pulse.Bool.from(var1 & ~var2 | ~var1 & var2);
      this.q = 0L;
      var2 = 1596052379;
      var1 = -1095614310;
      var10001 = (var1 | var2) - (var1 & var2);
      var2 = -510422271;
      var1 = var10001;
      this.r = (var1 | var2) & ~(var1 & var2);
      this.s = 0L;
      var2 = 1394890297;
      var1 = 975536694;
      var10001 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1761727503;
      var1 = var10001;
      this.t = pulse.Bool.from((var1 | var2) & (~var1 | ~var2));
      var10001 = (int)6166357531758394433L;
      var2 = -1347411127;
      var1 = var10001;
      var10001 = var1 & ~var2 | ~var1 & var2;
      var2 = -1322033400;
      var1 = var10001;
      this.u = pulse.Bool.from((var1 | var2) & ~(var1 & var2));
      this.v = null;
      this.w = new CopyOnWriteArrayList<>();
   }

   @EventHandler
   public void a(WorldRenderEvent var1) {
      if (c.world != null && c.player != null) {
         MatrixStack var2 = var1.a();
         float var3 = var1.b();
         Item var4 = c.player.getMainHandStack().getItem();
         Item var5 = c.player.getOffHandStack().getItem();
         if (this.a.k() && (var4 == Items.NETHERITE_SCRAP || var5 == Items.NETHERITE_SCRAP)) {
            this.a(var2);
         }

         if (this.b.k() && (var4 == Items.DRIED_KELP || var5 == Items.DRIED_KELP)) {
            this.b(var2);
         }

         if (this.e.k() && (var4 == Items.ENDER_EYE || var5 == Items.ENDER_EYE)) {
            this.b(var2, var3);
         }

         if (this.f.k() && (var4 == Items.SUGAR || var5 == Items.SUGAR)) {
            this.c(var2, var3);
         }

         if (this.g.k() && (var4 == Items.SNOWBALL || var5 == Items.SNOWBALL)) {
            this.a(var2, var3);
         }
      }
   }

   @EventHandler
   public void a(ClientTickEvent var1) {
      if (c.world != null && c.player != null) {
         if (this.i.k()) {
            int var2 = this.n();
            boolean var3 = c.player.getItemCooldownManager().isCoolingDown(Items.NETHERITE_SCRAP.getDefaultStack());
            if (var3 && !this.u) {
               long var4 = System.currentTimeMillis();
               int var20;
               if (var4 - this.s < 500L) {
                  var20 = (int)-6595420566512490212L;
                  int var8 = 343808340;
                  int var7 = var20;
                  var20 = (var7 | var8) - (var7 & var8);
                  var8 = 1086959689;
                  var7 = var20;
                  var20 = (var7 | var8) & (~var7 | ~var8);
               } else {
                  var20 = (int)-830012625047602645L;
                  int var15 = -2098356643;
                  int var10 = var20;
                  var20 = (var10 | var15) & (~var10 | ~var15);
                  var15 = -971037578;
                  var10 = var20;
                  var20 = (var10 | var15) & ~(var10 & var15);
               }

               int var6 = var20;
               int var17 = 1189262901;
               int var12 = 1346848532;
               int var10001 = (var12 | var17) & (~var12 | ~var17);
               var17 = 379973920;
               var12 = var10001;
               this.p = pulse.Bool.from((var12 | var17) & ~(var12 & var17));
               this.q = var4;
               this.t = pulse.Bool.from(var6);
            }

            this.u = var3;
            this.r = var2;
         }

         if (this.p && this.i.k()) {
            this.o();
         }
      }
   }

   @EventHandler
   public void a(SoundPlayEvent var1) {
      String var2 = var1.d().getId().toString();
      int var4 = -1195618989;
      int var3 = -148432490;
      int var10003 = (var3 | var4) - (var3 & var4);
      var4 = 2119629118;
      var3 = var10003;
      var10003 = (var3 | var4) & (~var3 | ~var4);
      var4 = 1788023018;
      var3 = -804953479;
      int var10004 = var3 & ~var4 | ~var3 & var4;
      var4 = 87486791;
      var3 = var10004;
      var10004 = var3 & ~var4 | ~var3 & var4;
      int var10005 = (int)-1478934517654071835L;
      var4 = 215297983;
      var3 = var10005;
      var10005 = (var3 | var4) & ~(var3 & var4);
      var4 = 1256353247;
      var3 = var10005;
      var10005 = (var3 | var4) & (~var3 | ~var4);
      int var10006 = (int)1830920365876810996L;
      var4 = -249046474;
      var3 = var10006;
      var10006 = var3 & ~var4 | ~var3 & var4;
      var4 = -1257888641;
      var3 = var10006;
      if (var2.equals(
         c(
            "욊ǈ욉Ǆ욄Ǔ욆Ǉ욓ƛ욂Ǐ욓ǈ욓ǘ웉Ǆ욉ǅ욂Ǔ울ǅ욕ǀ욀ǎ욉Ə욀Ǔ욈ǖ욋",
            "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=Ꟁꒁꁙ꤀絺蹚⑿謥㑚}\ua7e2꒠ꁽ꤀",
            var10003,
            var10004,
            var10005,
            (var3 | var4) & ~(var3 & var4)
         )
      )) {
         this.s = System.currentTimeMillis();
      }
   }

   private void a(MatrixStack var1, float var2) {
   }

   private void a(MatrixStack var1, boolean var2) {
   }

   private Vec3d a(float var1) {
      Vec3d var2 = c.player.getCameraPosVec(var1);
      Vec3d var3 = this.b(var1);
      Vec3d var4 = var2;
      int var10000 = (int)-6319981664114586894L;
      int var15 = 1177988673;
      int var14 = var10000;
      var10000 = (var14 | var15) & (~var14 | ~var15);
      var15 = 88171643;
      var14 = var10000;
      int var5 = (var14 | var15) - (var14 & var15);
      double var6 = 0.99;
      double var8 = 0.03;
      this.w.add(var4);
      var10000 = (int)3787080724082928350L;
      var15 = 454432594;
      var14 = var10000;
      var10000 = (var14 | var15) & (~var14 | ~var15);
      var15 = -1784201844;
      var14 = var10000;

      for (int var10 = var14 & ~var15 | ~var14 & var15; var10 < var5; var10++) {
         Vec3d var11 = var4;
         var4 = var4.add(var3);
         RaycastContext var12 = new RaycastContext(var11, var4, ShapeType.COLLIDER, FluidHandling.NONE, c.player);
         BlockHitResult var13 = c.world.raycast(var12);
         if (var13.getType() != Type.MISS) {
            this.w.add(var13.getPos());
            return var13.getPos();
         }

         if (var4.y < c.world.getBottomY()) {
            this.w.add(var4);
            return var4;
         }

         this.w.add(var4);
         var3 = var3.multiply(var6).subtract(0.0, var8, 0.0);
      }

      return null;
   }

   private Vec3d b(float var1) {
      double var2 = c.player.getVelocity().y * 0.5;
      Vec3d var4 = new Vec3d(0.0, var2, 0.0);
      Vec3d var5 = this.a(c.player.getYaw(), c.player.getPitch());
      double var6 = 1.5;
      Vec3d var8 = var5.multiply(var6);
      return var8.add(var4);
   }

   private Vec3d a(float var1, float var2) {
      float var3 = MathHelper.cos(var2 * (float) (Math.PI / 180.0));
      float var4 = MathHelper.sin(var2 * (float) (Math.PI / 180.0));
      float var5 = MathHelper.cos(var1 * (float) (Math.PI / 180.0));
      float var6 = MathHelper.sin(var1 * (float) (Math.PI / 180.0));
      float var7 = -var6 * var3;
      float var8 = -var4;
      float var9 = var5 * var3;
      return new Vec3d(var7, var8, var9).normalize();
   }

   private int n() {
      int var5 = 1527951816;
      int var4 = 1482137737;
      int var10000 = (var4 | var5) & (~var4 | ~var5);
      var5 = 54858049;
      var4 = var10000;
      int var1 = (var4 | var5) & ~(var4 & var5);
      var10000 = (int)-3202692983783771179L;
      var5 = 167156453;
      var4 = var10000;
      var10000 = var4 + var5 - 2 * (var4 & var5);
      var5 = 555231536;
      var4 = var10000;

      for (int var2 = var4 + var5 - 2 * (var4 & var5); var2 < c.player.getInventory().size(); var2++) {
         ItemStack var3 = c.player.getInventory().getStack(var2);
         if (var3.getItem() == Items.NETHERITE_SCRAP) {
            var5 = var3.getCount();
            var4 = var1;
            var1 = 2 * (var4 | var5) - (var4 ^ var5);
         }
      }

      return var1;
   }

   private void o() {
      int var90;
      if (this.t) {
         int var11 = -252033828;
         int var10 = 953681705;
         var90 = (var10 | var11) & ~(var10 & var11);
         var11 = -937281851;
         var10 = var90;
         var90 = var10 + var11 - 2 * (var10 & var11);
      } else {
         var90 = (int)-5681538975418278168L;
         int var52 = 1974142630;
         int var13 = var90;
         var90 = (var13 | var52) & ~(var13 & var52);
         var52 = 486744790;
         var13 = var90;
         var90 = var13 & ~var52 | ~var13 & var52;
      }

      int var1 = var90;
      long var2 = System.currentTimeMillis();
      long var4 = var2 - this.q;
      if (var4 >= var1) {
         int var86 = 1564821360;
         int var47 = -1447707188;
         int var98 = (var47 | var86) & (~var47 | ~var86);
         var86 = -185533764;
         var47 = var98;
         this.p = pulse.Bool.from(var47 & ~var86 | ~var47 & var86);
         var86 = 627840090;
         var47 = 1527527797;
         var98 = (var47 | var86) & ~(var47 & var86);
         var86 = 2120232239;
         var47 = var98;
         this.t = pulse.Bool.from(var47 & ~var86 | ~var47 & var86);
      } else {
         double var6 = (var1 - var4) / 1000.0;
         String var93;
         if (this.t) {
            int var54 = 569160741;
            int var15 = 1353569148;
            int var10002 = (var15 | var54) - (var15 & var54);
            var54 = 1082968738;
            var15 = var10002;
            var10002 = var15 & ~var54 | ~var15 & var54;
            var54 = -1895687530;
            var15 = -1607299452;
            int var10003 = (var15 | var54) - (var15 & var54);
            var54 = -1788380780;
            var15 = var10003;
            var10003 = var15 + var54 - 2 * (var15 & var54);
            var54 = -159679442;
            var15 = 1519106596;
            int var10004 = (var15 | var54) & (~var15 | ~var54);
            var54 = -1120779927;
            var15 = var10004;
            var10004 = (var15 | var54) & (~var15 | ~var54);
            var54 = 58359392;
            var15 = 1497834810;
            int var10005 = var15 + var54 - 2 * (var15 & var54);
            var54 = 1510454630;
            var15 = var10005;
            var93 = c(
               "\uf8a0묳\uf884뭉\uf88a뭎\uf8f8물ﲔ묱\uf8f4뭃\uf88b뭉\uf884",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=Ꟁꒁꁙ꤀絺蹚⑿謥㑚}\ua7e2꒠ꁽ꤀",
               var10002,
               var10003,
               var10004,
               (var15 | var54) & ~(var15 & var54)
            );
         } else {
            int var101 = (int)-2470368979247288451L;
            int var62 = -135418705;
            int var23 = var101;
            var101 = (var23 | var62) - (var23 & var62);
            var62 = -1175310807;
            var23 = var101;
            var101 = var23 + var62 - 2 * (var23 & var62);
            int var109 = (int)122713062219500151L;
            var62 = 1089160748;
            var23 = var109;
            var109 = (var23 | var62) & ~(var23 & var62);
            var62 = -1204506384;
            var23 = var109;
            var109 = (var23 | var62) - (var23 & var62);
            var62 = -382782687;
            var23 = 58753749;
            int var118 = (var23 | var62) & (~var23 | ~var62);
            var62 = -173109834;
            var23 = var118;
            var118 = (var23 | var62) & ~(var23 & var62);
            int var123 = (int)7454211830240640092L;
            var62 = -1870673150;
            var23 = var123;
            var123 = (var23 | var62) & ~(var23 & var62);
            var62 = -832566721;
            var23 = var123;
            var93 = c(
               "\uf896桮\uf884树\uf88e栞", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=Ꟁꒁꁙ꤀絺蹚⑿謥㑚}\ua7e2꒠ꁽ꤀", var101, var109, var118, (var23 | var62) & (~var23 | ~var62)
            );
         }

         String var8 = var93;
         int var70 = 1298323721;
         int var31 = 320606420;
         int var104 = (var31 | var70) - (var31 & var70);
         var70 = 1874027558;
         var31 = var104;
         var104 = (var31 | var70) & ~(var31 & var70);
         var70 = -298636587;
         var31 = 139824828;
         int var112 = (var31 | var70) & ~(var31 & var70);
         var70 = 1543619398;
         var31 = var112;
         var112 = (var31 | var70) - (var31 & var70);
         int var120 = (int)-8144728974882050202L;
         var70 = -1660006537;
         var31 = var120;
         var120 = var31 + var70 - 2 * (var31 & var70);
         var70 = -346493919;
         var31 = var120;
         var120 = var31 + var70 - 2 * (var31 & var70);
         int var125 = (int)4873990065462826319L;
         var70 = -275355708;
         var31 = var125;
         var125 = (var31 | var70) - (var31 & var70);
         var70 = -177351314;
         var31 = var125;
         String var94 = c(
            "ﲑ㛙ﲔ㊝\uf884㊐\uf88a㊗\uf8f3㊒\uf8f6㋫\uf8fb㚊\uf8f3㊟\uf8f4㊟\uf883㚊ﰓ㛈ﲑ㚄ﲅ㛌ﰓ㛌ﲔ㋫\uf881㊐ﲚ",
            "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=Ꟁꒁꁙ꤀絺蹚⑿謥㑚}\ua7e2꒠ꁽ꤀",
            var104,
            var112,
            var120,
            var31 & ~var70 | ~var31 & var70
         );
         var70 = 434009890;
         var31 = 1841018956;
         int var10001 = var31 & ~var70 | ~var31 & var70;
         var70 = 1952829292;
         var31 = var10001;
         Object[] var96 = new Object[(var31 | var70) - (var31 & var70)];
         var112 = (int)9044097961215041422L;
         var70 = 999282260;
         var31 = var112;
         var112 = (var31 | var70) & ~(var31 & var70);
         var70 = -1350481446;
         var31 = var112;
         var96[var31 & ~var70 | ~var31 & var70] = var8;
         var70 = 174194775;
         var31 = 1801655567;
         var112 = (var31 | var70) & (~var31 | ~var70);
         var70 = 1627460953;
         var31 = var112;
         var96[(var31 | var70) - (var31 & var70)] = var6;
         String var9 = String.format(var94, var96);
         InGameHud var95 = c.inGameHud;
         Text var97 = Text.of(var9);
         var104 = (int)-9116035990797932803L;
         var70 = -1312243748;
         var31 = var104;
         var104 = (var31 | var70) - (var31 & var70);
         var70 = 18389281;
         var31 = var104;
         var95.setOverlayMessage(var97, pulse.Bool.from((var31 | var70) - (var31 & var70)));
      }
   }

   private void a(MatrixStack var1) {
      BlockPos var2 = c.player.getBlockPos();
      boolean var3 = this.j.k();
      Box var4;
      Box var5;
      if (var3) {
         int var10002 = var2.getX();
         int var8 = -167717190;
         int var7 = -2001095156;
         int var10003 = var7 & ~var8 | ~var7 & var8;
         var8 = 2126078133;
         var7 = var10003;
         var8 = (var7 | var8) & ~(var7 & var8);
         var7 = var10002;
         double var132 = var7 + ~var8 + 1;
         double var139 = var2.getY();
         int var10004 = var2.getZ();
         int var10005 = (int)1040732419754021195L;
         var8 = 1546305857;
         var7 = var10005;
         var10005 = (var7 | var8) & ~(var7 & var8);
         var8 = 1971392521;
         var7 = var10005;
         var8 = (var7 | var8) - (var7 & var8);
         var7 = var10004;
         double var147 = var7 + ~var8 + 1;
         var10005 = var2.getX();
         var8 = -909359561;
         var7 = -1849835619;
         int var10006 = (var7 | var8) & ~(var7 & var8);
         var8 = 1483864494;
         var7 = var10006;
         var8 = var7 & ~var8 | ~var7 & var8;
         var7 = var10005;
         double var156 = var7 - ~var8 - 1;
         var10006 = var2.getY();
         var8 = -2022055017;
         var7 = -342235891;
         int var10007 = (var7 | var8) - (var7 & var8);
         var8 = 1826621084;
         var7 = var10007;
         var8 = var7 & ~var8 | ~var7 & var8;
         var7 = var10006;
         double var168 = (var7 & ~var8) + (var8 & ~var7) + 2 * (var7 & var8);
         var10007 = var2.getZ();
         int var10008 = (int)7051651182618542139L;
         var8 = -1043632015;
         var7 = var10008;
         var10008 = var7 & ~var8 | ~var7 & var8;
         var8 = 1782214734;
         var7 = var10008;
         var8 = (var7 | var8) & (~var7 | ~var8);
         var7 = var10007;
         var4 = new Box(var132, var139, var147, var156, var168, (var7 & ~var8) + (var8 & ~var7) + 2 * (var7 & var8));
         var10002 = var2.getX();
         var8 = -1661852066;
         var7 = -1746943284;
         var10003 = (var7 | var8) & (~var7 | ~var8);
         var8 = 187557009;
         var7 = var10003;
         var8 = (var7 | var8) & ~(var7 & var8);
         var7 = var10002;
         double var134 = (var7 ^ var8) - 2 * (~var7 & var8) + 0.01;
         double var141 = var2.getY() + 0.01;
         var10004 = var2.getZ();
         var10005 = (int)1686928971596141721L;
         var8 = 946462855;
         var7 = var10005;
         var10005 = (var7 | var8) & (~var7 | ~var8);
         var8 = 2032432157;
         var7 = var10005;
         var8 = (var7 | var8) & ~(var7 & var8);
         var7 = var10004;
         double var149 = 2 * (var7 & ~var8) - (var7 ^ var8) + 0.01;
         var10005 = var2.getX();
         var8 = 338485255;
         var7 = 922765010;
         var10006 = var7 & ~var8 | ~var7 & var8;
         var8 = 590128849;
         var7 = var10006;
         var8 = (var7 | var8) & ~(var7 & var8);
         var7 = var10005;
         double var160 = (var7 ^ var8) + 2 * (var7 & var8) - 0.01;
         var10006 = var2.getY();
         var10007 = (int)520589092354363250L;
         var8 = -1878275407;
         var7 = var10007;
         var10007 = var7 & ~var8 | ~var7 & var8;
         var8 = -474855995;
         var7 = var10007;
         var8 = var7 & ~var8 | ~var7 & var8;
         var7 = var10006;
         double var171 = 2 * (var7 | var8) - (var7 ^ var8) - 0.01;
         var10007 = var2.getZ();
         var8 = -28527414;
         var7 = 1743707742;
         var10008 = var7 & ~var8 | ~var7 & var8;
         var8 = -1717409136;
         var7 = var10008;
         var8 = var7 & ~var8 | ~var7 & var8;
         var7 = var10007;
         var5 = new Box(var134, var141, var149, var160, var171, 2 * (var7 | var8) - (var7 ^ var8) - 0.01);
      } else {
         int var135 = var2.getX();
         int var142 = (int)8567705163115256174L;
         int var99 = -435852029;
         int var38 = var142;
         var142 = var38 + var99 - 2 * (var38 & var99);
         var99 = 633779311;
         var38 = var142;
         var99 = (var38 | var99) & ~(var38 & var99);
         var38 = var135;
         double var136 = (var38 ^ var99) - 2 * (~var38 & var99);
         double var144 = var2.getY();
         int var150 = var2.getZ();
         var99 = -1072426290;
         var38 = 610933476;
         int var161 = var38 + var99 - 2 * (var38 & var99);
         var99 = -461502424;
         var38 = var161;
         var99 = (var38 | var99) & (~var38 | ~var99);
         var38 = var150;
         double var151 = var38 - var99;
         var161 = var2.getX();
         var99 = -1333745924;
         var38 = 1819225230;
         int var172 = (var38 | var99) & ~(var38 & var99);
         var99 = -588281231;
         var38 = var172;
         var99 = (var38 | var99) - (var38 & var99);
         var38 = var161;
         double var163 = 2 * (var38 | var99) - (var38 ^ var99);
         var172 = var2.getY();
         int var183 = (int)-7626946685218371903L;
         var99 = -747764489;
         var38 = var183;
         var183 = (var38 | var99) & ~(var38 & var99);
         var99 = -103202254;
         var38 = var183;
         var99 = var38 + var99 - 2 * (var38 & var99);
         var38 = var172;
         double var174 = 2 * (var38 | var99) - (var38 ^ var99);
         var183 = var2.getZ();
         var99 = 1488953339;
         var38 = -1492446197;
         int var191 = (var38 | var99) & (~var38 | ~var99);
         var99 = -4944909;
         var38 = var191;
         var99 = (var38 | var99) - (var38 & var99);
         var38 = var183;
         var4 = new Box(var136, var144, var151, var163, var174, (var38 | var99) + (var38 & var99));
         var135 = var2.getX();
         var99 = 566252661;
         var38 = -582908957;
         var142 = (var38 | var99) & (~var38 | ~var99);
         var99 = -58599532;
         var38 = var142;
         var99 = var38 + var99 - 2 * (var38 & var99);
         var38 = var135;
         double var138 = (var38 & ~var99) - (~var38 & var99) + 0.01;
         double var146 = var2.getY() + 0.01;
         var150 = var2.getZ();
         var99 = -2038474449;
         var38 = -670150229;
         var161 = (var38 | var99) & (~var38 | ~var99);
         var99 = 1584466054;
         var38 = var161;
         var99 = var38 & ~var99 | ~var38 & var99;
         var38 = var150;
         double var153 = (var38 & ~var99) - (~var38 & var99) + 0.01;
         var161 = var2.getX();
         var172 = (int)-1545966369011035025L;
         var99 = -1574503000;
         var38 = var172;
         var172 = (var38 | var99) - (var38 & var99);
         var99 = -1639749180;
         var38 = var172;
         var99 = (var38 | var99) & ~(var38 & var99);
         var38 = var161;
         double var166 = (var38 & ~var99) + (var99 & ~var38) + 2 * (var38 & var99) - 0.01;
         var172 = var2.getY();
         var183 = (int)-3156200441085891836L;
         var99 = 1797609169;
         var38 = var183;
         var183 = (var38 | var99) & ~(var38 & var99);
         var99 = -1509835311;
         var38 = var183;
         var99 = (var38 | var99) & ~(var38 & var99);
         var38 = var172;
         double var178 = (var38 ^ var99) + 2 * (var38 & var99) - 0.01;
         var183 = var2.getZ();
         var191 = (int)4893584513354485379L;
         var99 = 826571372;
         var38 = var191;
         var191 = (var38 | var99) & (~var38 | ~var99);
         var99 = 899462380;
         var38 = var191;
         var99 = var38 + var99 - 2 * (var38 & var99);
         var38 = var183;
         var5 = new Box(var138, var146, var153, var166, var178, var38 - ~var99 - 1 - 0.01);
      }

      int var6 = this.p().getRGB();
      if (this.a(var4)) {
         int var10000 = (int)-1726645696805893832L;
         int var129 = -958513811;
         int var68 = var10000;
         var10000 = var68 + var129 - 2 * (var68 & var129);
         var129 = 892554069;
         var68 = var10000;
         var6 = (var68 | var129) & ~(var68 & var129);
      }

      WorldRenderUtils.b(var1, var5, var6);
   }

   private void b(MatrixStack var1) {
      BlockPos var2 = c.player.getBlockPos();
      float var3 = c.player.getYaw();
      float var4 = c.player.getPitch();
      int var5 = this.p().getRGB();
      boolean var6 = this.j.k();
      if (Math.abs(var4) > 45.0F) {
         BlockPos var30 = var2;
         Box var31;
         Box var32;
         if (var4 < -45.0F) {
            if (var6) {
               int var852 = var30.getX();
               int var619 = 219426257;
               int var258 = -1090761474;
               int var892 = var258 & ~var619 | ~var258 & var619;
               var619 = -1276616404;
               var258 = var892;
               var619 = var258 & ~var619 | ~var258 & var619;
               var258 = var852;
               double var853 = (var258 & ~var619) - (~var258 & var619);
               var892 = var30.getY();
               int var936 = (int)-2087734415338262875L;
               var619 = -1265021160;
               var258 = var936;
               var936 = var258 + var619 - 2 * (var258 & var619);
               var619 = -117513794;
               var258 = var936;
               var619 = (var258 | var619) - (var258 & var619);
               var258 = var892;
               double var894 = (var258 | var619) + (var258 & var619);
               var936 = var30.getZ();
               var619 = 108175734;
               var258 = -1811616882;
               int var991 = var258 & ~var619 | ~var258 & var619;
               var619 = -1837741317;
               var258 = var991;
               var619 = (var258 | var619) - (var258 & var619);
               var258 = var936;
               double var939 = (var258 ^ var619) - 2 * (~var258 & var619);
               var991 = var30.getX();
               int var1044 = (int)8685492086317719210L;
               var619 = 1401521106;
               var258 = var1044;
               var1044 = (var258 | var619) & ~(var258 & var619);
               var619 = -1142514308;
               var258 = var1044;
               var619 = (var258 | var619) - (var258 & var619);
               var258 = var991;
               double var993 = (var258 ^ var619) + 2 * (var258 & var619);
               var1044 = var30.getY();
               var619 = 2109206285;
               var258 = 518672378;
               int var1094 = (var258 | var619) & (~var258 | ~var619);
               var619 = 1667080432;
               var258 = var1094;
               var619 = (var258 | var619) & (~var258 | ~var619);
               var258 = var1044;
               double var1047 = (var258 & ~var619) + (var619 & ~var258) + 2 * (var258 & var619);
               var1094 = var30.getZ();
               var619 = -1280996014;
               var258 = 1324094204;
               int var1124 = (var258 | var619) & ~(var258 & var619);
               var619 = -45506646;
               var258 = var1124;
               var619 = (var258 | var619) & (~var258 | ~var619);
               var258 = var1094;
               var31 = new Box(var853, var894, var939, var993, var1047, var258 - ~var619 - 1);
               var852 = var30.getX();
               var892 = (int)-4403973566002382936L;
               var619 = 1559707630;
               var258 = var892;
               var892 = var258 + var619 - 2 * (var258 & var619);
               var619 = -1564440507;
               var258 = var892;
               var619 = var258 & ~var619 | ~var258 & var619;
               var258 = var852;
               double var855 = 2 * (var258 & ~var619) - (var258 ^ var619) + 0.01;
               var892 = var30.getY();
               var936 = (int)-168132674985413319L;
               var619 = 603393129;
               var258 = var936;
               var936 = var258 & ~var619 | ~var258 & var619;
               var619 = 866957651;
               var258 = var936;
               var619 = (var258 | var619) - (var258 & var619);
               var258 = var892;
               double var898 = (var258 & ~var619) + (var619 & ~var258) + 2 * (var258 & var619) + 0.01;
               var936 = var30.getZ();
               var991 = (int)7407180046143855476L;
               var619 = -1028224791;
               var258 = var991;
               var991 = (var258 | var619) & (~var258 | ~var619);
               var619 = 259167134;
               var258 = var991;
               var619 = var258 + var619 - 2 * (var258 & var619);
               var258 = var936;
               double var943 = 2 * (var258 & ~var619) - (var258 ^ var619) + 0.01;
               var991 = var30.getX();
               var1044 = (int)4326084273107213235L;
               var619 = 744660816;
               var258 = var1044;
               var1044 = var258 & ~var619 | ~var258 & var619;
               var619 = -493419289;
               var258 = var1044;
               var619 = var258 & ~var619 | ~var258 & var619;
               var258 = var991;
               double var997 = (var258 ^ var619) + 2 * (var258 & var619) - 0.01;
               var1044 = var30.getY();
               var1094 = (int)-6469800813434013801L;
               var619 = -417720819;
               var258 = var1094;
               var1094 = var258 & ~var619 | ~var258 & var619;
               var619 = -1398709859;
               var258 = var1094;
               var619 = (var258 | var619) - (var258 & var619);
               var258 = var1044;
               double var1051 = var258 - ~var619 - 1 - 0.01;
               var1094 = var30.getZ();
               var619 = -1792010086;
               var258 = 1970890815;
               var1124 = (var258 | var619) & ~(var258 & var619);
               var619 = -532057951;
               var258 = var1124;
               var619 = var258 + var619 - 2 * (var258 & var619);
               var258 = var1094;
               var32 = new Box(var855, var898, var943, var997, var1051, var258 - ~var619 - 1 - 0.01);
            } else {
               int var856 = var30.getX();
               int var899 = (int)-36127619477210639L;
               int var655 = -584278311;
               int var294 = var899;
               var899 = (var294 | var655) & ~(var294 & var655);
               var655 = -950638806;
               var294 = var899;
               var655 = (var294 | var655) & ~(var294 & var655);
               var294 = var856;
               double var857 = var294 + ~var655 + 1;
               var899 = var30.getY();
               int var944 = (int)-3337032073512102347L;
               var655 = -2011580304;
               var294 = var944;
               var944 = var294 & ~var655 | ~var294 & var655;
               var655 = -434082234;
               var294 = var944;
               var655 = var294 & ~var655 | ~var294 & var655;
               var294 = var899;
               double var902 = 2 * (var294 | var655) - (var294 ^ var655);
               var944 = var30.getZ();
               int var998 = (int)5767909225608845636L;
               var655 = -287046523;
               var294 = var998;
               var998 = var294 & ~var655 | ~var294 & var655;
               var655 = 1744379331;
               var294 = var998;
               var655 = (var294 | var655) & ~(var294 & var655);
               var294 = var944;
               double var947 = 2 * (var294 & ~var655) - (var294 ^ var655);
               var998 = var30.getX();
               int var1052 = (int)7427811402862051006L;
               var655 = -653388626;
               var294 = var1052;
               var1052 = var294 + var655 - 2 * (var294 & var655);
               var655 = 121514515;
               var294 = var1052;
               var655 = (var294 | var655) & (~var294 | ~var655);
               var294 = var998;
               double var1001 = (var294 | var655) + (var294 & var655);
               var1052 = var30.getY();
               var655 = 610181005;
               var294 = 1275970489;
               int var1099 = (var294 | var655) & (~var294 | ~var655);
               var655 = 1750293553;
               var294 = var1099;
               var655 = var294 & ~var655 | ~var294 & var655;
               var294 = var1052;
               double var1055 = 2 * (var294 | var655) - (var294 ^ var655);
               var1099 = var30.getZ();
               int var1126 = (int)-7472288939252586161L;
               var655 = 875672075;
               var294 = var1126;
               var1126 = var294 & ~var655 | ~var294 & var655;
               var655 = -2131403961;
               var294 = var1126;
               var655 = (var294 | var655) & (~var294 | ~var655);
               var294 = var1099;
               var31 = new Box(var857, var902, var947, var1001, var1055, var294 - ~var655 - 1);
               var856 = var30.getX();
               var899 = (int)-6048414237062814785L;
               var655 = -189959762;
               var294 = var899;
               var899 = (var294 | var655) & (~var294 | ~var655);
               var655 = -304492013;
               var294 = var899;
               var655 = (var294 | var655) & (~var294 | ~var655);
               var294 = var856;
               double var859 = var294 + ~var655 + 1 + 0.01;
               var899 = var30.getY();
               var655 = -172743032;
               var294 = -984072477;
               var944 = (var294 | var655) & ~(var294 & var655);
               var655 = 820779112;
               var294 = var944;
               var655 = (var294 | var655) & ~(var294 & var655);
               var294 = var899;
               double var906 = var294 - ~var655 - 1 + 0.01;
               var944 = var30.getZ();
               var655 = 534215839;
               var294 = 1992264083;
               var998 = (var294 | var655) & ~(var294 & var655);
               var655 = 1768486158;
               var294 = var998;
               var655 = var294 & ~var655 | ~var294 & var655;
               var294 = var944;
               double var950 = 2 * (var294 & ~var655) - (var294 ^ var655) + 0.01;
               var998 = var30.getX();
               var1052 = (int)-4736366234128251727L;
               var655 = -293541594;
               var294 = var1052;
               var1052 = (var294 | var655) - (var294 & var655);
               var655 = -836670060;
               var294 = var1052;
               var655 = (var294 | var655) - (var294 & var655);
               var294 = var998;
               double var1004 = 2 * (var294 | var655) - (var294 ^ var655) - 0.01;
               var1052 = var30.getY();
               var1099 = (int)-1993391651812670907L;
               var655 = -86028425;
               var294 = var1099;
               var1099 = var294 + var655 - 2 * (var294 & var655);
               var655 = 1571114295;
               var294 = var1099;
               var655 = (var294 | var655) & ~(var294 & var655);
               var294 = var1052;
               double var1059 = (var294 | var655) + (var294 & var655) - 0.01;
               var1099 = var30.getZ();
               var655 = 888933099;
               var294 = 1103508217;
               var1126 = (var294 | var655) - (var294 & var655);
               var655 = 1966749713;
               var294 = var1126;
               var655 = var294 + var655 - 2 * (var294 & var655);
               var294 = var1099;
               var32 = new Box(var859, var906, var950, var1004, var1059, 2 * (var294 | var655) - (var294 ^ var655) - 0.01);
            }
         } else if (var6) {
            int var860 = var30.getX();
            int var907 = (int)2569896138574774172L;
            int var691 = 1237613279;
            int var330 = var907;
            var907 = var330 + var691 - 2 * (var330 & var691);
            var691 = 1486996800;
            var330 = var907;
            var691 = (var330 | var691) & ~(var330 & var691);
            var330 = var860;
            double var861 = 2 * (var330 & ~var691) - (var330 ^ var691);
            var907 = var30.getY();
            int var951 = (int)7614956655744392210L;
            var691 = -589483317;
            var330 = var951;
            var951 = var330 & ~var691 | ~var330 & var691;
            var691 = 1366896346;
            var330 = var951;
            var691 = var330 & ~var691 | ~var330 & var691;
            var330 = var907;
            double var910 = 2 * (var330 & ~var691) - (var330 ^ var691);
            var951 = var30.getZ();
            var691 = -2087889767;
            var330 = 1682105808;
            int var1005 = (var330 | var691) - (var330 & var691);
            var691 = -405819062;
            var330 = var1005;
            var691 = var330 + var691 - 2 * (var330 & var691);
            var330 = var951;
            double var954 = (var330 & ~var691) - (~var330 & var691);
            var1005 = var30.getX();
            var691 = 231769004;
            var330 = -1555190293;
            int var1060 = (var330 | var691) - (var330 & var691);
            var691 = -1365430717;
            var330 = var1060;
            var691 = (var330 | var691) & ~(var330 & var691);
            var330 = var1005;
            double var1007 = 2 * (var330 | var691) - (var330 ^ var691);
            var1060 = var30.getY();
            var691 = -269310814;
            var330 = -176200388;
            int var1104 = var330 & ~var691 | ~var330 & var691;
            var691 = 445497759;
            var330 = var1104;
            var691 = var330 + var691 - 2 * (var330 & var691);
            var330 = var1060;
            double var1062 = (var330 ^ var691) - 2 * (~var330 & var691);
            var1104 = var30.getZ();
            var691 = -1585206541;
            var330 = 807075657;
            int var1129 = (var330 | var691) & ~(var330 & var691);
            var691 = -1852222018;
            var330 = var1129;
            var691 = var330 & ~var691 | ~var330 & var691;
            var330 = var1104;
            var31 = new Box(var861, var910, var954, var1007, var1062, 2 * (var330 | var691) - (var330 ^ var691));
            var860 = var30.getX();
            var691 = -870897198;
            var330 = 347395136;
            var907 = (var330 | var691) & (~var330 | ~var691);
            var691 = -660341359;
            var330 = var907;
            var691 = var330 + var691 - 2 * (var330 & var691);
            var330 = var860;
            double var863 = (var330 ^ var691) - 2 * (~var330 & var691) + 0.01;
            var907 = var30.getY();
            var691 = -1538621539;
            var330 = 1737939751;
            var951 = var330 & ~var691 | ~var330 & var691;
            var691 = -1008950087;
            var330 = var951;
            var691 = (var330 | var691) & (~var330 | ~var691);
            var330 = var907;
            double var913 = var330 - var691 + 0.01;
            var951 = var30.getZ();
            var691 = -269004182;
            var330 = -129714127;
            var1005 = var330 + var691 - 2 * (var330 & var691);
            var691 = 397666904;
            var330 = var1005;
            var691 = (var330 | var691) & (~var330 | ~var691);
            var330 = var951;
            double var957 = (var330 & ~var691) - (~var330 & var691) + 0.01;
            var1005 = var30.getX();
            var1060 = (int)-1047146543557741248L;
            var691 = 1333906702;
            var330 = var1060;
            var1060 = var330 + var691 - 2 * (var330 & var691);
            var691 = 217561162;
            var330 = var1060;
            var691 = (var330 | var691) - (var330 & var691);
            var330 = var1005;
            double var1010 = (var330 ^ var691) + 2 * (var330 & var691) - 0.01;
            var1060 = var30.getY();
            var691 = 489023400;
            var330 = -1139564589;
            var1104 = (var330 | var691) & ~(var330 & var691);
            var691 = -1590265734;
            var330 = var1104;
            var691 = (var330 | var691) - (var330 & var691);
            var330 = var1060;
            double var1066 = var330 + ~var691 + 1 - 0.01;
            var1104 = var30.getZ();
            var1129 = (int)5594164873075622435L;
            var691 = 662824971;
            var330 = var1129;
            var1129 = var330 + var691 - 2 * (var330 & var691);
            var691 = 1025894956;
            var330 = var1129;
            var691 = (var330 | var691) - (var330 & var691);
            var330 = var1104;
            var32 = new Box(var863, var913, var957, var1010, var1066, (var330 ^ var691) + 2 * (var330 & var691) - 0.01);
         } else {
            int var864 = var30.getX();
            int var727 = -1064768688;
            int var366 = -2046371476;
            int var914 = (var366 | var727) & (~var366 | ~var727);
            var727 = 1183724094;
            var366 = var914;
            var727 = (var366 | var727) & (~var366 | ~var727);
            var366 = var864;
            double var865 = var366 - var727;
            var914 = var30.getY();
            var727 = 1387048812;
            var366 = 654107170;
            int var958 = var366 + var727 - 2 * (var366 & var727);
            var727 = 1951419725;
            var366 = var958;
            var727 = var366 & ~var727 | ~var366 & var727;
            var366 = var914;
            double var916 = (var366 ^ var727) - 2 * (~var366 & var727);
            var958 = var30.getZ();
            int var1011 = (int)1701767436849193541L;
            var727 = 377636284;
            var366 = var1011;
            var1011 = var366 + var727 - 2 * (var366 & var727);
            var727 = -1120180229;
            var366 = var1011;
            var727 = (var366 | var727) & (~var366 | ~var727);
            var366 = var958;
            double var960 = var366 + ~var727 + 1;
            var1011 = var30.getX();
            int var1067 = (int)-1454209017104086228L;
            var727 = 1381491771;
            var366 = var1067;
            var1067 = (var366 | var727) - (var366 & var727);
            var727 = -671043820;
            var366 = var1067;
            var727 = var366 & ~var727 | ~var366 & var727;
            var366 = var1011;
            double var1014 = 2 * (var366 | var727) - (var366 ^ var727);
            var1067 = var30.getY();
            var727 = 935724900;
            var366 = -673923862;
            int var1108 = var366 & ~var727 | ~var366 & var727;
            var727 = -535643249;
            var366 = var1108;
            var727 = (var366 | var727) & ~(var366 & var727);
            var366 = var1067;
            double var1070 = (var366 ^ var727) - 2 * (~var366 & var727);
            var1108 = var30.getZ();
            int var1132 = (int)581377653193946853L;
            var727 = -976565130;
            var366 = var1132;
            var1132 = (var366 | var727) & (~var366 | ~var727);
            var727 = -147621232;
            var366 = var1132;
            var727 = (var366 | var727) & ~(var366 & var727);
            var366 = var1108;
            var31 = new Box(var865, var916, var960, var1014, var1070, (var366 & ~var727) + (var727 & ~var366) + 2 * (var366 & var727));
            var864 = var30.getX();
            var914 = (int)-1841263904873431106L;
            var727 = 648987044;
            var366 = var914;
            var914 = (var366 | var727) & (~var366 | ~var727);
            var727 = -1024721384;
            var366 = var914;
            var727 = var366 & ~var727 | ~var366 & var727;
            var366 = var864;
            double var867 = 2 * (var366 & ~var727) - (var366 ^ var727) + 0.01;
            var914 = var30.getY();
            var727 = 1715371259;
            var366 = -1499436561;
            var958 = (var366 | var727) & (~var366 | ~var727);
            var727 = -1063381737;
            var366 = var958;
            var727 = var366 & ~var727 | ~var366 & var727;
            var366 = var914;
            double var920 = var366 + ~var727 + 1 + 0.01;
            var958 = var30.getZ();
            var1011 = (int)-8991884052181977717L;
            var727 = 253843803;
            var366 = var1011;
            var1011 = var366 + var727 - 2 * (var366 & var727);
            var727 = 1997548754;
            var366 = var1011;
            var727 = (var366 | var727) & ~(var366 & var727);
            var366 = var958;
            double var963 = var366 + ~var727 + 1 + 0.01;
            var1011 = var30.getX();
            var727 = 9625891;
            var366 = 946075522;
            var1067 = var366 & ~var727 | ~var366 & var727;
            var727 = 955324066;
            var366 = var1067;
            var727 = (var366 | var727) - (var366 & var727);
            var366 = var1011;
            double var1018 = (var366 | var727) + (var366 & var727) - 0.01;
            var1067 = var30.getY();
            var1108 = (int)-8544755208051039139L;
            var727 = 175288635;
            var366 = var1108;
            var1108 = var366 & ~var727 | ~var366 & var727;
            var727 = 16799079;
            var366 = var1108;
            var727 = var366 & ~var727 | ~var366 & var727;
            var366 = var1067;
            double var1073 = 2 * (var366 & ~var727) - (var366 ^ var727) - 0.01;
            var1108 = var30.getZ();
            var1132 = (int)4993937895384266213L;
            var727 = -958448443;
            var366 = var1132;
            var1132 = (var366 | var727) & (~var366 | ~var727);
            var727 = 1247971619;
            var366 = var1132;
            var727 = var366 + var727 - 2 * (var366 & var727);
            var366 = var1108;
            var32 = new Box(var867, var920, var963, var1018, var1073, 2 * (var366 | var727) - (var366 ^ var727) - 0.01);
         }

         if (this.a(var31)) {
            int var812 = (int)4955098132896496721L;
            int var763 = -453736428;
            int var402 = var812;
            var812 = (var402 | var763) & ~(var402 & var763);
            var763 = -1114944699;
            var402 = var812;
            var5 = (var402 | var763) & ~(var402 & var763);
         }

         WorldRenderUtils.b(var1, var32, var5);
      } else {
         float var7 = (var3 % 360.0F + 360.0F) % 360.0F;
         int var10000 = (int)-1655325980684785700L;
         int var29 = 560905517;
         int var28 = var10000;
         var10000 = var28 + var29 - 2 * (var28 & var29);
         var29 = 1419795175;
         var28 = var10000;
         int var8 = (var28 | var29) - (var28 & var29);
         if (!(Math.abs(var7 - 45.0F) < var8) && !(Math.abs(var7 - 135.0F) < var8) && !(Math.abs(var7 - 225.0F) < var8) && !(Math.abs(var7 - 315.0F) < var8)) {
            var29 = 1470081247;
            var28 = -37894128;
            var10000 = (var28 | var29) & ~(var28 & var29);
            var29 = -1440587569;
            var28 = var10000;
            var10000 = (var28 | var29) - (var28 & var29);
         } else {
            var10000 = (int)-7333423782702916093L;
            var29 = 1910445815;
            var28 = var10000;
            var10000 = (var28 | var29) - (var28 & var29);
            var29 = 222841077;
            var28 = var10000;
            var10000 = var28 + var29 - 2 * (var28 & var29);
         }

         int var9 = var10000;
         var29 = -446690398;
         var28 = -545733001;
         var10000 = (var28 | var29) & (~var28 | ~var29);
         var29 = 974704086;
         var28 = var10000;
         int var10 = (var28 | var29) & ~(var28 & var29);
         if (var9 != 0) {
            float var13 = Math.abs(var7 - 45.0F);
            float var14 = Math.abs(var7 - 135.0F);
            float var15 = Math.abs(var7 - 225.0F);
            float var16 = Math.abs(var7 - 315.0F);
            float var17 = Math.min(Math.min(var13, var14), Math.min(var15, var16));
            int var12;
            if (var17 == var13) {
               var29 = -1359789632;
               var28 = -1342135397;
               var10000 = (var28 | var29) & (~var28 | ~var29);
               var29 = 519299702;
               var28 = var10000;
               var12 = var28 + var29 - 2 * (var28 & var29);
            } else if (var17 == var14) {
               var29 = -1942732539;
               var28 = 990611058;
               var10000 = (var28 | var29) - (var28 & var29);
               var29 = -1220556816;
               var28 = var10000;
               var12 = (var28 | var29) - (var28 & var29);
            } else if (var17 == var15) {
               var29 = 404634392;
               var28 = 1939242161;
               var10000 = (var28 | var29) & ~(var28 & var29);
               var29 = 1804093256;
               var28 = var10000;
               var12 = (var28 | var29) - (var28 & var29);
            } else {
               var10000 = (int)-6169408809211727227L;
               var29 = -818654789;
               var28 = var10000;
               var10000 = (var28 | var29) - (var28 & var29);
               var29 = 871408133;
               var28 = var10000;
               var12 = (var28 | var29) - (var28 & var29);
            }

            double var18 = Math.toRadians(var12);
            var29 = 1643886437;
            var28 = 522098907;
            int var10001 = (var28 | var29) - (var28 & var29);
            var29 = 2128949139;
            var28 = var10001;
            int var20;
            int var21;
            if (var12 == (var28 | var29) - (var28 & var29)) {
               var29 = -131142401;
               var28 = -1957290004;
               var10000 = var28 & ~var29 | ~var28 & var29;
               var29 = -1937306386;
               var28 = var10000;
               var20 = var28 + var29 - 2 * (var28 & var29);
               var10000 = (int)-5577992438629270520L;
               var29 = 11721871;
               var28 = var10000;
               var10000 = (var28 | var29) - (var28 & var29);
               var29 = 924655749;
               var28 = var10000;
               var21 = var28 & ~var29 | ~var28 & var29;
            } else {
               var10001 = (int)-3075458009031294443L;
               var29 = -1533752366;
               var28 = var10001;
               var10001 = var28 + var29 - 2 * (var28 & var29);
               var29 = -1633973952;
               var28 = var10001;
               if (var12 == var28 + var29 - 2 * (var28 & var29)) {
                  var10000 = (int)5252852706055932292L;
                  var29 = 897955772;
                  var28 = var10000;
                  var10000 = (var28 | var29) - (var28 & var29);
                  var29 = 1536393669;
                  var28 = var10000;
                  var20 = var28 & ~var29 | ~var28 & var29;
                  var10000 = (int)642755832830478205L;
                  var29 = -617007209;
                  var28 = var10000;
                  var10000 = (var28 | var29) - (var28 & var29);
                  var29 = 1642925844;
                  var28 = var10000;
                  var21 = var28 + var29 - 2 * (var28 & var29);
               } else {
                  var29 = 1620649284;
                  var28 = 1636779659;
                  var10001 = (var28 | var29) & (~var28 | ~var29);
                  var29 = 18244398;
                  var28 = var10001;
                  if (var12 == (var28 & ~var29 | ~var28 & var29)) {
                     var29 = 1126666173;
                     var28 = -723129763;
                     var10000 = (var28 | var29) & ~(var28 & var29);
                     var29 = -1748867614;
                     var28 = var10000;
                     var20 = var28 & ~var29 | ~var28 & var29;
                     var29 = -2071441848;
                     var28 = -1079964588;
                     var10000 = var28 + var29 - 2 * (var28 & var29);
                     var29 = -992559646;
                     var28 = var10000;
                     var21 = (var28 | var29) & (~var28 | ~var29);
                  } else {
                     var29 = 429858625;
                     var28 = -1922727824;
                     var10000 = var28 & ~var29 | ~var28 & var29;
                     var29 = -1795514573;
                     var28 = var10000;
                     var20 = (var28 | var29) & ~(var28 & var29);
                     var10000 = (int)-5487508571364197161L;
                     var29 = -424731880;
                     var28 = var10000;
                     var10000 = (var28 | var29) & (~var28 | ~var29);
                     var29 = -1555830835;
                     var28 = var10000;
                     var21 = var28 + var29 - 2 * (var28 & var29);
                  }
               }
            }

            var29 = -740484159;
            var28 = -610966204;
            int var10002 = var28 + var29 - 2 * (var28 & var29);
            var29 = -138968710;
            var28 = var10002;
            BlockPos var11 = var2.add(var20, (var28 | var29) & (~var28 | ~var29), var21);
            ArrayList var22 = new ArrayList();
            if (var6) {
               var29 = 2107088994;
               var28 = 1795423225;
               var10000 = (var28 | var29) & ~(var28 & var29);
               var29 = -378821530;
               var28 = var10000;
               var10000 = var28 + var29 - 2 * (var28 & var29);
            } else {
               var10000 = (int)7027108399780618156L;
               var29 = 855015639;
               var28 = var10000;
               var10000 = (var28 | var29) - (var28 & var29);
               var29 = 1914642565;
               var28 = var10000;
               var10000 = var28 + var29 - 2 * (var28 & var29);
            }

            int var23 = var10000;
            if (var6) {
               var29 = -1262504203;
               var28 = 1050021451;
               var10000 = (var28 | var29) & ~(var28 & var29);
               var29 = -1976977219;
               var28 = var10000;
               var10000 = var28 + var29 - 2 * (var28 & var29);
            } else {
               var29 = -1510340499;
               var28 = -585673132;
               var10000 = var28 & ~var29 | ~var28 & var29;
               var29 = 2028822075;
               var28 = var10000;
               var10000 = (var28 | var29) - (var28 & var29);
            }

            int var24 = var10000;
            if (var6) {
               var10000 = (int)-5508786280147801217L;
               var29 = -1599166579;
               var28 = var10000;
               var10000 = (var28 | var29) - (var28 & var29);
               var29 = 76549365;
               var28 = var10000;
               var10000 = (var28 | var29) - (var28 & var29);
            } else {
               var10000 = (int)-4080916325197868326L;
               var29 = -1157972737;
               var28 = var10000;
               var10000 = (var28 | var29) & (~var28 | ~var29);
               var29 = -192434656;
               var28 = var10000;
               var10000 = (var28 | var29) & (~var28 | ~var29);
            }

            label166: {
               int var25 = var10000;
               var29 = 1749850688;
               var28 = -1254829615;
               var10001 = (var28 | var29) & ~(var28 & var29);
               var29 = -579318852;
               var28 = var10001;
               if (var12 != var28 + var29 - 2 * (var28 & var29)) {
                  var29 = -1712147809;
                  var28 = 1634505433;
                  var10001 = (var28 | var29) - (var28 & var29);
                  var29 = -123854681;
                  var28 = var10001;
                  if (var12 != ((var28 | var29) & (~var28 | ~var29))) {
                     int var37 = var23;

                     while (true) {
                        if (var37 > var24) {
                           break label166;
                        }

                        var29 = 950913491;
                        var28 = -2089649942;
                        var10000 = (var28 | var29) & (~var28 | ~var29);
                        var29 = -1142968007;
                        var28 = var10000;

                        for (int var38 = var28 & ~var29 | ~var28 & var29; var38 < var25; var38++) {
                           var28 = var37;
                           var22.add(var11.add(var37, var38, ~var28 + 1));
                           var29 = -1363353124;
                           var28 = -100244175;
                           int var869 = (var28 | var29) - (var28 & var29);
                           var29 = 1421509868;
                           var28 = var869;
                           var29 = (var28 | var29) - (var28 & var29);
                           var28 = var37;
                           var10002 = (var28 ^ var29) + 2 * (var28 & var29);
                           var28 = var37;
                           var22.add(var11.add(var10002, var38, ~var28 + 1));
                        }

                        var37++;
                     }
                  }
               }

               for (int var26 = var23; var26 <= var24; var26++) {
                  var29 = 759428571;
                  var28 = -974805773;
                  var10000 = var28 + var29 - 2 * (var28 & var29);
                  var29 = -391753432;
                  var28 = var10000;

                  for (int var27 = (var28 | var29) - (var28 & var29); var27 < var25; var27++) {
                     var22.add(var11.add(var26, var27, var26));
                     int var10003 = (int)-6210654779176959610L;
                     var29 = -440795663;
                     var28 = var10003;
                     var10003 = (var28 | var29) & ~(var28 & var29);
                     var29 = -1523925898;
                     var28 = var10003;
                     var29 = var28 + var29 - 2 * (var28 & var29);
                     var28 = var26;
                     var22.add(var11.add(var28 - ~var29 - 1, var27, var26));
                  }
               }
            }

            if (this.a(var22)) {
               var29 = 1157982879;
               var28 = -888594235;
               var10000 = (var28 | var29) & ~(var28 & var29);
               var29 = 1896658266;
               var28 = var10000;
               var5 = (var28 | var29) - (var28 & var29);
            }

            WorldRenderUtils.b(var1, var22, var5);
         } else {
            BlockPos var33;
            int var34;
            if (var7 >= 315.0F || var7 < 45.0F) {
               var10000 = (int)-6923305578346782904L;
               var29 = -895543704;
               var28 = var10000;
               var10000 = var28 & ~var29 | ~var28 & var29;
               var29 = 834128160;
               var28 = var10000;
               var34 = var28 & ~var29 | ~var28 & var29;
               var29 = -223619441;
               var28 = -744688152;
               int var822 = var28 + var29 - 2 * (var28 & var29);
               var29 = 557261671;
               var28 = var822;
               var822 = (var28 | var29) & (~var28 | ~var29);
               int var834 = (int)7487861059803739034L;
               var29 = 1434201464;
               var28 = var834;
               var834 = (var28 | var29) - (var28 & var29);
               var29 = -1885920995;
               var28 = var834;
               var33 = var2.add(var822, var28 & ~var29 | ~var28 & var29, var10);
            } else if (var7 >= 45.0F && var7 < 135.0F) {
               var10000 = (int)6884311716569541432L;
               var29 = 1303246017;
               var28 = var10000;
               var10000 = var28 & ~var29 | ~var28 & var29;
               var29 = 1484922787;
               var28 = var10000;
               var34 = (var28 | var29) - (var28 & var29);
               var28 = var10;
               int var821 = ~(var28 - 1);
               int var831 = (int)-6514028708060958288L;
               var29 = 402343333;
               var28 = var831;
               var831 = var28 & ~var29 | ~var28 & var29;
               var29 = -145699862;
               var28 = var831;
               var831 = var28 + var29 - 2 * (var28 & var29);
               var29 = -843579988;
               var28 = 758746303;
               int var872 = (var28 | var29) & (~var28 | ~var29);
               var29 = -527535853;
               var28 = var872;
               var33 = var2.add(var821, var831, (var28 | var29) - (var28 & var29));
            } else if (var7 >= 135.0F && var7 < 225.0F) {
               var10000 = (int)-3726664093757048801L;
               var29 = -1681045753;
               var28 = var10000;
               var10000 = (var28 | var29) & ~(var28 & var29);
               var29 = -979026004;
               var28 = var10000;
               var34 = (var28 | var29) - (var28 & var29);
               var29 = -366648916;
               var28 = 1169519557;
               int var819 = (var28 | var29) - (var28 & var29);
               var29 = -1349512599;
               var28 = var819;
               var819 = var28 & ~var29 | ~var28 & var29;
               var29 = -1761019343;
               var28 = 1135162672;
               int var829 = var28 & ~var29 | ~var28 & var29;
               var29 = 727593214;
               var28 = var829;
               var829 = (var28 | var29) & (~var28 | ~var29);
               var28 = var10;
               var33 = var2.add(var819, var829, ~(var28 - 1));
            } else {
               var10000 = (int)998580597217472542L;
               var29 = -1634761407;
               var28 = var10000;
               var10000 = (var28 | var29) & (~var28 | ~var29);
               var29 = -1372507055;
               var28 = var10000;
               var34 = (var28 | var29) & ~(var28 & var29);
               int var826 = (int)4389179670017534852L;
               var29 = -118312036;
               var28 = var826;
               var826 = var28 & ~var29 | ~var28 & var29;
               var29 = -1446008857;
               var28 = var826;
               var826 = var28 & ~var29 | ~var28 & var29;
               int var870 = (int)-2185058748452373234L;
               var29 = -1316527340;
               var28 = var870;
               var870 = (var28 | var29) & ~(var28 & var29);
               var29 = -1666867686;
               var28 = var870;
               var33 = var2.add(var10, var826, (var28 | var29) & (~var28 | ~var29));
            }

            Box var35;
            Box var36;
            label140: {
               if (var34 != 0) {
                  var29 = -418288166;
                  var28 = 2066039606;
                  int var824 = (var28 | var29) & ~(var28 & var29);
                  var29 = -1674301864;
                  var28 = var824;
                  if (var34 != var28 + var29 - 2 * (var28 & var29)) {
                     if (var6) {
                        int var844 = var33.getX();
                        int var882 = (int)-4316804257717745618L;
                        var29 = 1994996580;
                        var28 = var882;
                        var882 = (var28 | var29) - (var28 & var29);
                        var29 = 1396585291;
                        var28 = var882;
                        var29 = var28 + var29 - 2 * (var28 & var29);
                        var28 = var844;
                        double var845 = var28 - var29;
                        double var884 = var33.getY();
                        int var928 = var33.getZ();
                        var29 = 383641579;
                        var28 = -1715934208;
                        int var977 = var28 & ~var29 | ~var28 & var29;
                        var29 = -1889203224;
                        var28 = var977;
                        var29 = var28 + var29 - 2 * (var28 & var29);
                        var28 = var928;
                        double var929 = 2 * (var28 & ~var29) - (var28 ^ var29);
                        var977 = var33.getX();
                        var29 = -611798516;
                        var28 = 662037575;
                        int var1031 = (var28 | var29) - (var28 & var29);
                        var29 = -50506166;
                        var28 = var1031;
                        var29 = var28 & ~var29 | ~var28 & var29;
                        var28 = var977;
                        double var979 = 2 * (var28 | var29) - (var28 ^ var29);
                        var1031 = var33.getY();
                        int var1082 = (int)-6243820116217839711L;
                        var29 = -788057583;
                        var28 = var1082;
                        var1082 = var28 + var29 - 2 * (var28 & var29);
                        var29 = -1436381769;
                        var28 = var1082;
                        var29 = var28 & ~var29 | ~var28 & var29;
                        var28 = var1031;
                        double var1033 = var28 - ~var29 - 1;
                        var1082 = var33.getZ();
                        int var1117 = (int)-145927458476442846L;
                        var29 = 1037839173;
                        var28 = var1117;
                        var1117 = var28 + var29 - 2 * (var28 & var29);
                        var29 = -682291101;
                        var28 = var1117;
                        var29 = (var28 | var29) & (~var28 | ~var29);
                        var28 = var1082;
                        var35 = new Box(var845, var884, var929, var979, var1033, 2 * (var28 | var29) - (var28 ^ var29));
                        var844 = var33.getX();
                        var29 = -1190901863;
                        var28 = 1214612249;
                        var882 = var28 + var29 - 2 * (var28 & var29);
                        var29 = -245250943;
                        var28 = var882;
                        var29 = var28 & ~var29 | ~var28 & var29;
                        var28 = var844;
                        double var847 = 2 * (var28 & ~var29) - (var28 ^ var29) + 0.01;
                        double var886 = var33.getY() + 0.01;
                        var928 = var33.getZ();
                        var29 = -367192689;
                        var28 = -871389318;
                        var977 = var28 & ~var29 | ~var28 & var29;
                        var29 = 638759670;
                        var28 = var977;
                        var29 = (var28 | var29) & ~(var28 & var29);
                        var28 = var928;
                        double var931 = (var28 ^ var29) - 2 * (~var28 & var29) + 0.01;
                        var977 = var33.getX();
                        var29 = 750379082;
                        var28 = -1049803905;
                        var1031 = var28 & ~var29 | ~var28 & var29;
                        var29 = -304831692;
                        var28 = var1031;
                        var29 = (var28 | var29) - (var28 & var29);
                        var28 = var977;
                        double var982 = (var28 & ~var29) + (var29 & ~var28) + 2 * (var28 & var29) - 0.01;
                        var1031 = var33.getY();
                        var1082 = (int)-4679113923678506563L;
                        var29 = 1701522079;
                        var28 = var1082;
                        var1082 = (var28 | var29) - (var28 & var29);
                        var29 = 249944869;
                        var28 = var1082;
                        var29 = (var28 | var29) & (~var28 | ~var29);
                        var28 = var1031;
                        double var1036 = (var28 ^ var29) + 2 * (var28 & var29) - 0.01;
                        var1082 = var33.getZ();
                        var1117 = (int)9115292097010216947L;
                        var29 = 1549915749;
                        var28 = var1117;
                        var1117 = var28 + var29 - 2 * (var28 & var29);
                        var29 = 1448737170;
                        var28 = var1117;
                        var29 = (var28 | var29) & (~var28 | ~var29);
                        var28 = var1082;
                        var36 = new Box(var847, var886, var931, var982, var1036, 2 * (var28 | var29) - (var28 ^ var29) - 0.01);
                     } else {
                        int var848 = var33.getX();
                        var29 = 725604028;
                        var28 = -126209989;
                        int var887 = (var28 | var29) & (~var28 | ~var29);
                        var29 = -750393722;
                        var28 = var887;
                        var29 = (var28 | var29) & (~var28 | ~var29);
                        var28 = var848;
                        double var849 = 2 * (var28 & ~var29) - (var28 ^ var29);
                        double var888 = var33.getY();
                        int var932 = var33.getZ();
                        int var983 = (int)8015261215505610174L;
                        var29 = 1522787408;
                        var28 = var983;
                        var983 = (var28 | var29) & ~(var28 & var29);
                        var29 = -2031185428;
                        var28 = var983;
                        var29 = var28 + var29 - 2 * (var28 & var29);
                        var28 = var932;
                        double var933 = 2 * (var28 & ~var29) - (var28 ^ var29);
                        var983 = var33.getX();
                        var29 = -2054411364;
                        var28 = 2100139568;
                        int var1037 = (var28 | var29) & (~var28 | ~var29);
                        var29 = -123617875;
                        var28 = var1037;
                        var29 = (var28 | var29) & (~var28 | ~var29);
                        var28 = var983;
                        double var986 = var28 - ~var29 - 1;
                        var1037 = var33.getY();
                        int var1088 = (int)2704649425209928537L;
                        var29 = 879031841;
                        var28 = var1088;
                        var1088 = (var28 | var29) & ~(var28 & var29);
                        var29 = -1275142787;
                        var28 = var1088;
                        var29 = var28 & ~var29 | ~var28 & var29;
                        var28 = var1037;
                        double var1039 = (var28 & ~var29) + (var29 & ~var28) + 2 * (var28 & var29);
                        var1088 = var33.getZ();
                        var29 = 941346997;
                        var28 = 873431376;
                        int var1121 = var28 + var29 - 2 * (var28 & var29);
                        var29 = 202658278;
                        var28 = var1121;
                        var29 = var28 + var29 - 2 * (var28 & var29);
                        var28 = var1088;
                        var35 = new Box(var849, var888, var933, var986, var1039, 2 * (var28 | var29) - (var28 ^ var29));
                        var848 = var33.getX();
                        var887 = (int)-2225844970243451766L;
                        var29 = -1146181712;
                        var28 = var887;
                        var887 = (var28 | var29) - (var28 & var29);
                        var29 = 1545745211;
                        var28 = var887;
                        var29 = var28 + var29 - 2 * (var28 & var29);
                        var28 = var848;
                        double var851 = var28 + ~var29 + 1 + 0.01;
                        double var891 = var33.getY() + 0.01;
                        var932 = var33.getZ();
                        var983 = (int)-5293540596939122137L;
                        var29 = -1892264119;
                        var28 = var983;
                        var983 = var28 & ~var29 | ~var28 & var29;
                        var29 = 342084972;
                        var28 = var983;
                        var29 = (var28 | var29) - (var28 & var29);
                        var28 = var932;
                        double var935 = (var28 & ~var29) - (~var28 & var29) + 0.01;
                        var983 = var33.getX();
                        var1037 = (int)3495224106564389782L;
                        var29 = 1019761266;
                        var28 = var1037;
                        var1037 = (var28 | var29) - (var28 & var29);
                        var29 = 1324308965;
                        var28 = var1037;
                        var29 = var28 + var29 - 2 * (var28 & var29);
                        var28 = var983;
                        double var990 = (var28 & ~var29) + (var29 & ~var28) + 2 * (var28 & var29) - 0.01;
                        var1037 = var33.getY();
                        var1088 = (int)-2882845148639835085L;
                        var29 = -936179413;
                        var28 = var1088;
                        var1088 = (var28 | var29) - (var28 & var29);
                        var29 = -1259453155;
                        var28 = var1088;
                        var29 = (var28 | var29) & ~(var28 & var29);
                        var28 = var1037;
                        double var1043 = (var28 & ~var29) + (var29 & ~var28) + 2 * (var28 & var29) - 0.01;
                        var1088 = var33.getZ();
                        var1121 = (int)-5535141750052046868L;
                        var29 = 1823079398;
                        var28 = var1121;
                        var1121 = (var28 | var29) & (~var28 | ~var29);
                        var29 = -232829943;
                        var28 = var1121;
                        var29 = (var28 | var29) & (~var28 | ~var29);
                        var28 = var1088;
                        var36 = new Box(var851, var891, var935, var990, var1043, 2 * (var28 | var29) - (var28 ^ var29) - 0.01);
                     }
                     break label140;
                  }
               }

               if (var6) {
                  int var836 = var33.getX();
                  var29 = 1257969889;
                  var28 = 1853097210;
                  int var873 = var28 + var29 - 2 * (var28 & var29);
                  var29 = 613358616;
                  var28 = var873;
                  var29 = (var28 | var29) & ~(var28 & var29);
                  var28 = var836;
                  double var837 = var28 + ~var29 + 1;
                  double var874 = var33.getY();
                  int var10004 = var33.getZ();
                  int var10005 = (int)-833149657579955350L;
                  var29 = -135127324;
                  var28 = var10005;
                  var10005 = (var28 | var29) - (var28 & var29);
                  var29 = 13059471;
                  var28 = var10005;
                  var29 = var28 + var29 - 2 * (var28 & var29);
                  var28 = var10004;
                  double var921 = (var28 ^ var29) - 2 * (~var28 & var29);
                  var10005 = var33.getX();
                  int var10006 = (int)-3478084380512782570L;
                  var29 = -241889771;
                  var28 = var10006;
                  var10006 = (var28 | var29) & ~(var28 & var29);
                  var29 = -249136889;
                  var28 = var10006;
                  var29 = var28 + var29 - 2 * (var28 & var29);
                  var28 = var10005;
                  double var966 = 2 * (var28 | var29) - (var28 ^ var29);
                  var10006 = var33.getY();
                  var29 = 766535434;
                  var28 = 2051248431;
                  int var10007 = (var28 | var29) - (var28 & var29);
                  var29 = 1475606050;
                  var28 = var10007;
                  var29 = (var28 | var29) - (var28 & var29);
                  var28 = var10006;
                  double var1021 = (var28 & ~var29) + (var29 & ~var28) + 2 * (var28 & var29);
                  var10007 = var33.getZ();
                  var29 = -729160889;
                  var28 = -1467178814;
                  int var10008 = (var28 | var29) & (~var28 | ~var29);
                  var29 = 2080719748;
                  var28 = var10008;
                  var29 = (var28 | var29) & (~var28 | ~var29);
                  var28 = var10007;
                  var35 = new Box(var837, var874, var921, var966, var1021, (var28 & ~var29) + (var29 & ~var28) + 2 * (var28 & var29));
                  var836 = var33.getX();
                  var29 = -1455425636;
                  var28 = -531579455;
                  var873 = (var28 | var29) & (~var28 | ~var29);
                  var29 = 1232030302;
                  var28 = var873;
                  var29 = (var28 | var29) & ~(var28 & var29);
                  var28 = var836;
                  double var839 = (var28 & ~var29) - (~var28 & var29) + 0.01;
                  double var876 = var33.getY() + 0.01;
                  var10004 = var33.getZ();
                  var10005 = (int)5260263466142780180L;
                  var29 = 1297830784;
                  var28 = var10005;
                  var10005 = var28 + var29 - 2 * (var28 & var29);
                  var29 = -784557931;
                  var28 = var10005;
                  var29 = (var28 | var29) & (~var28 | ~var29);
                  var28 = var10004;
                  double var923 = var28 - var29 + 0.01;
                  var10005 = var33.getX();
                  var29 = -41784570;
                  var28 = 441472945;
                  var10006 = (var28 | var29) & (~var28 | ~var29);
                  var29 = -405652301;
                  var28 = var10006;
                  var29 = (var28 | var29) - (var28 & var29);
                  var28 = var10005;
                  double var970 = (var28 ^ var29) + 2 * (var28 & var29) - 0.01;
                  var10006 = var33.getY();
                  var10007 = (int)-6369747711255434105L;
                  var29 = 62590937;
                  var28 = var10007;
                  var10007 = (var28 | var29) & (~var28 | ~var29);
                  var29 = 2054693721;
                  var28 = var10007;
                  var29 = (var28 | var29) & ~(var28 & var29);
                  var28 = var10006;
                  double var1024 = (var28 & ~var29) + (var29 & ~var28) + 2 * (var28 & var29) - 0.01;
                  var10007 = var33.getZ();
                  var29 = -1002115497;
                  var28 = 1864162543;
                  var10008 = (var28 | var29) - (var28 & var29);
                  var29 = -1420283207;
                  var28 = var10008;
                  var29 = var28 & ~var29 | ~var28 & var29;
                  var28 = var10007;
                  var36 = new Box(var839, var876, var923, var970, var1024, 2 * (var28 | var29) - (var28 ^ var29) - 0.01);
               } else {
                  int var840 = var33.getX();
                  var29 = 1308157210;
                  var28 = 817541830;
                  int var877 = var28 & ~var29 | ~var28 & var29;
                  var29 = 2101499870;
                  var28 = var877;
                  var29 = var28 & ~var29 | ~var28 & var29;
                  var28 = var840;
                  double var841 = var28 - var29;
                  double var878 = var33.getY();
                  int var924 = var33.getZ();
                  var29 = 593879958;
                  var28 = -1582188963;
                  int var971 = var28 & ~var29 | ~var28 & var29;
                  var29 = -2100013622;
                  var28 = var971;
                  var29 = var28 & ~var29 | ~var28 & var29;
                  var28 = var924;
                  double var925 = (var28 & ~var29) - (~var28 & var29);
                  var971 = var33.getX();
                  var29 = -2099546781;
                  var28 = -1446559753;
                  int var1025 = (var28 | var29) & (~var28 | ~var29);
                  var29 = 723274391;
                  var28 = var1025;
                  var29 = (var28 | var29) - (var28 & var29);
                  var28 = var971;
                  double var973 = (var28 | var29) + (var28 & var29);
                  var1025 = var33.getY();
                  var29 = -922362098;
                  var28 = -1063483255;
                  int var1078 = (var28 | var29) - (var28 & var29);
                  var29 = 161044354;
                  var28 = var1078;
                  var29 = var28 & ~var29 | ~var28 & var29;
                  var28 = var1025;
                  double var1027 = (var28 ^ var29) + 2 * (var28 & var29);
                  var1078 = var33.getZ();
                  int var1114 = (int)4016107129304483372L;
                  var29 = -1745078842;
                  var28 = var1114;
                  var1114 = var28 & ~var29 | ~var28 & var29;
                  var29 = 1911010283;
                  var28 = var1114;
                  var29 = (var28 | var29) & ~(var28 & var29);
                  var28 = var1078;
                  var35 = new Box(var841, var878, var925, var973, var1027, (var28 | var29) + (var28 & var29));
                  var840 = var33.getX();
                  var877 = (int)8927561625190514181L;
                  var29 = 909898006;
                  var28 = var877;
                  var877 = (var28 | var29) - (var28 & var29);
                  var29 = 1171803921;
                  var28 = var877;
                  var29 = (var28 | var29) - (var28 & var29);
                  var28 = var840;
                  double var843 = (var28 & ~var29) - (~var28 & var29) + 0.01;
                  double var881 = var33.getY() + 0.01;
                  var924 = var33.getZ();
                  var29 = -439382032;
                  var28 = 181279546;
                  var971 = (var28 | var29) - (var28 & var29);
                  var29 = -285109045;
                  var28 = var971;
                  var29 = var28 + var29 - 2 * (var28 & var29);
                  var28 = var924;
                  double var927 = var28 - var29 + 0.01;
                  var971 = var33.getX();
                  var29 = -245569281;
                  var28 = -1801553885;
                  var1025 = var28 + var29 - 2 * (var28 & var29);
                  var29 = 1707249887;
                  var28 = var1025;
                  var29 = (var28 | var29) & ~(var28 & var29);
                  var28 = var971;
                  double var976 = (var28 | var29) + (var28 & var29) - 0.01;
                  var1025 = var33.getY();
                  var29 = -1057534952;
                  var28 = 1933190989;
                  var1078 = var28 & ~var29 | ~var28 & var29;
                  var29 = -1278383280;
                  var28 = var1078;
                  var29 = (var28 | var29) & ~(var28 & var29);
                  var28 = var1025;
                  double var1030 = (var28 | var29) + (var28 & var29) - 0.01;
                  var1078 = var33.getZ();
                  var29 = -482693706;
                  var28 = 1120620191;
                  var1114 = (var28 | var29) - (var28 & var29);
                  var29 = -1577983192;
                  var28 = var1114;
                  var29 = var28 + var29 - 2 * (var28 & var29);
                  var28 = var1078;
                  var36 = new Box(var843, var881, var927, var976, var1030, 2 * (var28 | var29) - (var28 ^ var29) - 0.01);
               }
            }

            if (this.a(var35)) {
               var29 = 1148493544;
               var28 = 1570737832;
               var10000 = var28 + var29 - 2 * (var28 & var29);
               var29 = -420745408;
               var28 = var10000;
               var5 = var28 + var29 - 2 * (var28 & var29);
            }

            WorldRenderUtils.b(var1, var36, var5);
         }
      }
   }

   private void b(MatrixStack var1, float var2) {
      Vec3d var3 = this.c(var2);
      int var17;
      if (this.a(var3, 10.0)) {
         int var6 = 1050289293;
         int var5 = 358027991;
         var17 = (var5 | var6) & ~(var5 & var6);
         var6 = -724711078;
         var5 = var17;
         var17 = var5 + var6 - 2 * (var5 & var6);
      } else {
         int var13 = -1451978277;
         int var8 = 192409604;
         var17 = (var8 | var13) - (var8 & var13);
         var13 = 1576836640;
         var8 = var17;
         var17 = (var8 | var13) & ~(var8 & var13);
      }

      int var4 = var17;
      int var10003 = (int)2074583398994494068L;
      int var15 = -615824519;
      int var10 = var10003;
      var10003 = var10 & ~var15 | ~var10 & var15;
      var15 = -1028259507;
      var10 = var10003;
      WorldRenderUtils.a(var1, var3, 10.0F, (var10 | var15) & (~var10 | ~var15), var4, 0.1F);
   }

   private void c(MatrixStack var1, float var2) {
      Vec3d var3 = this.c(var2);
      int var18;
      if (this.a(var3, 10.0)) {
         var18 = (int)-1558486382703870815L;
         int var6 = -730629492;
         int var5 = var18;
         var18 = (var5 | var6) - (var5 & var6);
         var6 = 1221949741;
         var5 = var18;
         var18 = var5 & ~var6 | ~var5 & var6;
      } else {
         var18 = (int)5837853925379012215L;
         int var13 = 717292476;
         int var8 = var18;
         var18 = var8 + var13 - 2 * (var8 & var13);
         var13 = -706016716;
         var8 = var18;
         var18 = (var8 | var13) & ~(var8 & var13);
      }

      int var4 = var18;
      int var10003 = (int)8278999183580442299L;
      int var15 = -1736311544;
      int var10 = var10003;
      var10003 = (var10 | var15) & (~var10 | ~var15);
      var15 = 562975731;
      var10 = var10003;
      WorldRenderUtils.a(var1, var3, 10.0F, (var10 | var15) & ~(var10 & var15), var4, 0.1F);
   }

   private Vec3d c(float var1) {
      return new Vec3d(
         c.player.prevX + (c.player.getX() - c.player.prevX) * var1,
         c.player.prevY + (c.player.getY() - c.player.prevY) * var1,
         c.player.prevZ + (c.player.getZ() - c.player.prevZ) * var1
      );
   }

   private boolean a(Box var1) {
      Predicate<Entity> var10000 = var1x -> {
         int var10x;
         if (var1x instanceof PlayerEntity && var1.contains(var1x.getPos())) {
            var10x = (int)-3201521620176282667L;
            int var8x = 1773180914;
            int var5x = var10x;
            var10x = (var5x | var8x) & ~(var5x & var8x);
            var8x = -384283610;
            var5x = var10x;
            var10x = (var5x | var8x) - (var5x & var8x);
         } else {
            int var3x = -1341958489;
            int var2 = 1419816635;
            var10x = (var2 | var3x) & ~(var2 & var3x);
            var3x = -459016164;
            var2 = var10x;
            var10x = (var2 | var3x) & ~(var2 & var3x);
         }

         return pulse.Bool.from(var10x);
      };
      int var10001 = (int)-5754111473291098736L;
      int var6 = 671286674;
      int var5 = var10001;
      var10001 = (var5 | var6) & (~var5 | ~var6);
      var6 = 746520579;
      var5 = var10001;
      EntityTargetType[] var25 = new EntityTargetType[(var5 | var6) & (~var5 | ~var6)];
      var6 = 2046305979;
      var5 = 1492376004;
      int var10003 = var5 + var6 - 2 * (var5 & var6);
      var6 = 554434431;
      var5 = var10003;
      var25[var5 + var6 - 2 * (var5 & var6)] = EntityTargetType.PLAYER;

      for (Entity var3 : EntityFinder.a(var10000, var25)) {
         if (var3 != c.player) {
            PlayerEntity var4 = (PlayerEntity)var3;
            if (!EntityUtils.a(var4) && !FriendLookup.a(var4.getName().getString())) {
               var6 = -1692924341;
               var5 = 1195835232;
               int var21 = var5 & ~var6 | ~var5 & var6;
               var6 = -597755606;
               var5 = var21;
               return pulse.Bool.from(var5 & (var6 ^ -1) | (var5 ^ -1) & var6);
            }
         }
      }

      int var22 = (int)-3369003391621053849L;
      var6 = 1197288831;
      var5 = var22;
      int var23 = var5 + var6 - 2 * (var5 & var6);
      var6 = -1677037800;
      var5 = var23;
      return pulse.Bool.from(var5 + var6 - 2 * (var5 & var6));
   }

   private boolean a(Vec3d var1, double var2) {
      double var4 = var2 * var2;
      Predicate<Entity> var10000 = var3 -> {
         int var13x;
         if (var3 instanceof PlayerEntity && var3.squaredDistanceTo(var1) <= var4) {
            var13x = (int)-6468142297211451754L;
            int var10x = 444083914;
            int var7x = var13x;
            var13x = (var7x | var10x) & (~var7x | ~var10x);
            var10x = -1469028259;
            var7x = var13x;
            var13x = var7x & ~var10x | ~var7x & var10x;
         } else {
            var13x = (int)4472308191062061140L;
            int var5 = 1528157582;
            int var4x = var13x;
            var13x = var4x + var5 - 2 * (var4x & var5);
            var5 = -448322086;
            var4x = var13x;
            var13x = var4x + var5 - 2 * (var4x & var5);
         }

         return pulse.Bool.from(var13x);
      };
      int var10 = -1994265623;
      int var9 = -2142329642;
      int var10001 = (var9 | var10) & (~var9 | ~var10);
      var10 = 158289726;
      var9 = var10001;
      EntityTargetType[] var28 = new EntityTargetType[var9 + var10 - 2 * (var9 & var10)];
      var10 = 1830236603;
      var9 = -1866696565;
      int var10003 = (var9 | var10) & ~(var9 & var10);
      var10 = -39106256;
      var9 = var10003;
      var28[(var9 | var10) & ~(var9 & var10)] = EntityTargetType.PLAYER;

      for (Entity var7 : EntityFinder.a(var10000, var28)) {
         if (var7 != c.player) {
            PlayerEntity var8 = (PlayerEntity)var7;
            if (!EntityUtils.a(var8) && !FriendLookup.a(var8.getName().getString())) {
               int var25 = (int)-5814013118977500017L;
               var10 = 299841408;
               var9 = var25;
               int var26 = var9 + var10 - 2 * (var9 & var10);
               var10 = 1513990926;
               var9 = var26;
               return pulse.Bool.from((var9 | var10) & (var9 ^ -1 | var10 ^ -1));
            }
         }
      }

      var10 = -1567866760;
      var9 = 1554142516;
      int var27 = (var9 | var10) & (~var9 | ~var10);
      var10 = -30534324;
      var9 = var27;
      return pulse.Bool.from((var9 | var10) - (var9 & var10));
   }

   private boolean a(List<BlockPos> var1) {
      Predicate<Entity> var10000 = var0 -> var0 instanceof PlayerEntity;
      int var9 = -1296135459;
      int var8 = -362401923;
      int var10001 = (var8 | var9) & (~var8 | ~var9);
      var9 = 1490593185;
      var8 = var10001;
      EntityTargetType[] var27 = new EntityTargetType[(var8 | var9) - (var8 & var9)];
      int var10003 = (int)4861265329025280409L;
      var9 = 1941328091;
      var8 = var10003;
      var10003 = (var8 | var9) & ~(var8 & var9);
      var9 = -187745982;
      var8 = var10003;
      var27[var8 & ~var9 | ~var8 & var9] = EntityTargetType.PLAYER;

      for (Entity var3 : EntityFinder.a(var10000, var27)) {
         if (var3 != c.player) {
            PlayerEntity var4 = (PlayerEntity)var3;
            if (!FriendLookup.a(var4.getName().getString())) {
               BlockPos var5 = var3.getBlockPos();

               for (BlockPos var7 : var1) {
                  if (var5.equals(var7)) {
                     var9 = 376811140;
                     var8 = 1299610327;
                     int var24 = var8 + var9 - 2 * (var8 & var9);
                     var9 = 1526977618;
                     var8 = var24;
                     return pulse.Bool.from((var8 | var9) & (var8 ^ -1 | var9 ^ -1));
                  }
               }
            }
         }
      }

      int var25 = (int)3842839954908558143L;
      var9 = 47864006;
      var8 = var25;
      int var26 = var8 & ~var9 | ~var8 & var9;
      var9 = 735767545;
      var8 = var26;
      return pulse.Bool.from(var8 & (var9 ^ -1) | (var8 ^ -1) & var9);
   }

   private Color p() {
      if (this.n.k()) {
         ClientColor var1 = ModuleRegistry.CLIENT_COLOR;
         if (var1 != null) {
            return var1.n();
         }
      }

      return this.o.k();
   }

   public static String c(String var0, String var1, int var2, int var3, int var4, int var5) {
      char[] var6 = var1.toCharArray();
      char[] var7 = new char[var6.length];
      int var18 = 544456679;
      int var17 = -725242700;
      int var10000 = (var17 | var18) & (~var17 | ~var18);
      var18 = -189394087;
      var17 = var10000;
      char[] var219 = new char[var17 + var18 - 2 * (var17 & var18)];
      int var10002 = (int)-2597362873328574781L;
      var18 = 1477983856;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 1047421107;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      int var10003 = (int)-3258010299138302238L;
      var18 = 1709535261;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 1621698253;
      var17 = var10003;
      var219[var10002] = (char)((var17 | var18) - (var17 & var18));
      var18 = -704489841;
      var17 = 1633241675;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -1218765627;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -656291537;
      var17 = -919845739;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 298692159;
      var17 = var10003;
      var219[var10002] = (char)((var17 | var18) - (var17 & var18));
      var18 = 1167272674;
      var17 = 235763421;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1268669501;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)7086991541137969047L;
      var18 = -1096272462;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -1458431581;
      var17 = var10003;
      var219[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var18 = 652733782;
      var17 = 1354443961;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 1985790444;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 1430658430;
      var17 = 1256567531;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 530790278;
      var17 = var10003;
      var219[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var10002 = (int)-447958301078867015L;
      var18 = -2035124974;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -390871377;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1930280067;
      var17 = -2019569897;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -191700303;
      var17 = var10003;
      var219[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var18 = -2076607420;
      var17 = 2045875264;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -37165055;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -362619642;
      var17 = -492914243;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 150741305;
      var17 = var10003;
      var219[var10002] = (char)((var17 | var18) - (var17 & var18));
      var10002 = (int)-8245597900748102719L;
      var18 = -273742016;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -1700993913;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -909071347;
      var17 = 2115304538;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -1211868860;
      var17 = var10003;
      var219[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var10002 = (int)-8616128483608066266L;
      var18 = 1783099647;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 825063390;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 1972125927;
      var17 = -1087820551;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -895133636;
      var17 = var10003;
      var219[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var10002 = (int)-2408922646593629633L;
      var18 = 232210911;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -1548495896;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)-4957015055553534631L;
      var18 = -1516266473;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -1494716131;
      var17 = var10003;
      var219[var10002] = (char)((var17 | var18) - (var17 & var18));
      var18 = 501774794;
      var17 = -1209788113;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -1442029332;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1428280809;
      var17 = -53356871;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 1443888010;
      var17 = var10003;
      var219[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      char[] var8 = var219;
      var18 = -781891598;
      var17 = -1760173899;
      var10000 = var17 & ~var18 | ~var17 & var18;
      var18 = 1181787981;
      var17 = var10000;
      char[] var221 = new char[(var17 | var18) & (~var17 | ~var18)];
      var18 = 177422042;
      var17 = 1635543987;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 1810847081;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var10003 = (int)7258413679939199064L;
      var18 = 1303278449;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 1278384905;
      var17 = var10003;
      var221[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var10002 = (int)-49441744158647238L;
      var18 = -961969893;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 619748640;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -715410998;
      var17 = -1082811529;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 1781444286;
      var17 = var10003;
      var221[var10002] = (char)((var17 | var18) - (var17 & var18));
      var18 = 1289420303;
      var17 = -128267236;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1266666991;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)6551725172243502562L;
      var18 = -821298536;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 713320489;
      var17 = var10003;
      var221[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var18 = -2128456719;
      var17 = -1047896573;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1084755441;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var10003 = (int)-1830606517105444165L;
      var18 = -1307392773;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -361183678;
      var17 = var10003;
      var221[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var10002 = (int)-7744330799888246928L;
      var18 = 1335090053;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 2115538161;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var10003 = (int)-1502329895856769193L;
      var18 = 2033720047;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 658101752;
      var17 = var10003;
      var221[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var18 = 129045217;
      var17 = 183059443;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 223891735;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)5927319116734648352L;
      var18 = 185271323;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 475196591;
      var17 = var10003;
      var221[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var18 = 1937561756;
      var17 = -575978657;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1361601595;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)8510374788781662135L;
      var18 = 394632932;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -650099094;
      var17 = var10003;
      var221[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var10002 = (int)1165540560322032958L;
      var18 = -1599874852;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 2112761317;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)-6514845375695851344L;
      var18 = 457742426;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -1002047278;
      var17 = var10003;
      var221[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var10002 = (int)-8860883570805319286L;
      var18 = 1510230280;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -2079747958;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)-5137722095134212511L;
      var18 = -620613139;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 2010893448;
      var17 = var10003;
      var221[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var10002 = (int)1354432244962661919L;
      var18 = -217025593;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -1840912943;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -429884386;
      var17 = 59540606;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -437466285;
      var17 = var10003;
      var221[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      char[] var9 = var221;
      var10000 = (int)-8005565138567145511L;
      var18 = 1698078375;
      var17 = var10000;
      var10000 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1673344642;
      var17 = var10000;

      for (int var10 = (var17 | var18) - (var17 & var18); var10 < var6.length; var10++) {
         char var277 = var6[var10];
         char var205 = var8[var10 % var8.length];
         char var106 = var277;
         var7[var10] = (char)((var106 | var205) & (~var106 | ~var205));
      }

      char[] var19 = new char[var7.length];
      var10000 = (int)-372094202541461492L;
      var18 = 1875680616;
      var17 = var10000;
      var10000 = (var17 | var18) - (var17 & var18);
      var18 = 1027878244;
      var17 = var10000;

      for (int var11 = (var17 | var18) & ~(var17 & var18); var11 < var6.length; var11++) {
         char var278 = var7[var11];
         char var208 = var9[var11 % var9.length];
         char var109 = var278;
         var19[var11] = (char)(var109 + var208 - 2 * (var109 & var208));
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
      var18 = 950047397;
      var17 = -627954610;
      var10000 = var17 + var18 - 2 * (var17 & var18);
      var18 = -499990805;
      var17 = var10000;

      for (int var16 = (var17 | var18) & ~(var17 & var18); var16 < var15.length; var16++) {
         var18 = 848805362;
         var17 = -479139366;
         int var10001 = var17 & ~var18 | ~var17 & var18;
         var18 = -773368790;
         var17 = var10001;
         switch (var16 % ((var17 | var18) - (var17 & var18))) {
            case 0:
               var18 = var12;
               var17 = var13;
               var10002 = (var17 | var18) - (var17 & var18);
               char var218 = var14[var16];
               var17 = var10002;
               var15[var16] = (char)(var17 & ~var218 | ~var17 & var218);
               break;
            case 1:
               var18 = var13;
               var17 = var5;
               var10002 = (var17 | var18) - (var17 & var18);
               char var216 = var14[var16];
               var17 = var10002;
               var15[var16] = (char)((var17 | var216) - (var17 & var216));
         }
      }

      return new String(var15);
   }
}
