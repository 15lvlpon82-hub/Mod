package pulse;



import pulse.module.ClientModule;
import pulse.module.ModuleInfo;
import pulse.module.ModuleCategory;
import pulse.settings.BooleanSetting;
import pulse.settings.SettingGroup;
import pulse.settings.SliderSetting;
import java.util.HashMap;
import java.util.Map;
import meteordevelopment.orbit.EventHandler;

@ModuleInfo(a = "Sound Controller", b = "Контроль громкости определённых звуков", c = ModuleCategory.UTILITIES)
public class SoundController extends ClientModule {
   private final SettingGroup a;
   private final BooleanSetting b;
   private final SliderSetting e;
   private final SettingGroup f;
   private final BooleanSetting g;
   private final SliderSetting h;
   private final BooleanSetting i;
   private final SliderSetting j;
   private final BooleanSetting k;
   private final SliderSetting l;
   private final SettingGroup m;
   private final BooleanSetting n;
   private final SliderSetting o;
   private final BooleanSetting p;
   private final SliderSetting q;
   private final SettingGroup r;
   private final BooleanSetting s;
   private final SliderSetting t;
   private final BooleanSetting u;
   private final SliderSetting v;
   private final SettingGroup w;
   private final BooleanSetting x;
   private final SliderSetting y;
   private final BooleanSetting z;
   private final SliderSetting A;
   private final Map<String, SoundController.SoundVolumeBinding> B;

   public SoundController() {
      int var2 = 1267198399;
      int var1 = -661424983;
      int var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = 2066420626;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      int var10006 = (int)-2691161831268026433L;
      var2 = -1166140146;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var2 = 1223812645;
      var1 = var10006;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      int var10007 = (int)7220665176404459292L;
      var2 = -312430045;
      var1 = var10007;
      var10007 = (var1 | var2) & ~(var1 & var2);
      var2 = 1214431068;
      var1 = var10007;
      var10007 = (var1 | var2) & (~var1 | ~var2);
      int var10008 = (int)-2043424634845158650L;
      var2 = -1019486309;
      var1 = var10008;
      var10008 = var1 & ~var2 | ~var1 & var2;
      var2 = -1040578813;
      var1 = var10008;
      this.a = new SettingGroup(
         c("裒緙裏緙袶緞裃綬裌", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=ꟕ꒺ꁤꤋ絲蹩⑵謹㑣`\ua7e9꒹ꁽ꤀絤蹧⑵謳㑢~\ua7e3", var10005, var10006, var10007, (var1 | var2) & ~(var1 & var2))
      );
      var10005 = (int)-2888429602737154440L;
      var2 = 920124330;
      var1 = var10005;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1396087978;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var10006 = (int)1017149022629962139L;
      var2 = -1985450046;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var2 = 2087453478;
      var1 = var10006;
      var10006 = (var1 | var2) - (var1 & var2);
      var10007 = (int)-4467585968280411484L;
      var2 = -2027689213;
      var1 = var10007;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var2 = -383479124;
      var1 = var10007;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      var2 = 706795080;
      var1 = 1597948087;
      var10008 = var1 & ~var2 | ~var1 & var2;
      var2 = 1963141750;
      var1 = var10008;
      String var10003 = c(
         "裤㫁裍㪵袱㫃袴㪷", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=ꟕ꒺ꁤꤋ絲蹩⑵謹㑣`\ua7e9꒹ꁽ꤀絤蹧⑵謳㑢~\ua7e3", var10005, var10006, var10007, var1 + var2 - 2 * (var1 & var2)
      );
      int var10004 = (int)-6449067933131722669L;
      var2 = -1599982637;
      var1 = var10004;
      var10004 = var1 & ~var2 | ~var1 & var2;
      var2 = -1980759168;
      var1 = var10004;
      this.b = new BooleanSetting(var10003, pulse.Bool.from((var1 | var2) - (var1 & var2)));
      var2 = 689700085;
      var1 = 1736968876;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = -1498646307;
      var1 = var10005;
      var10005 = (var1 | var2) - (var1 & var2);
      var10006 = (int)7902868018558333392L;
      var2 = 562244575;
      var1 = var10006;
      var10006 = (var1 | var2) - (var1 & var2);
      var2 = 230662746;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var10007 = (int)2239049255816337897L;
      var2 = -357776720;
      var1 = var10007;
      var10007 = (var1 | var2) - (var1 & var2);
      var2 = -1932133014;
      var1 = var10007;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var2 = -1799646746;
      var1 = 1891623706;
      var10008 = (var1 | var2) - (var1 & var2);
      var2 = -467102301;
      var1 = var10008;
      this.e = new SliderSetting(
            c(
               "裥\ue16d裈\ue111裌\ue113袷\ue16f袺",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=ꟕ꒺ꁤꤋ絲蹩⑵謹㑣`\ua7e9꒹ꁽ꤀絤蹧⑵謳㑢~\ua7e3",
               var10005,
               var10006,
               var10007,
               var1 & ~var2 | ~var1 & var2
            ),
            50.0F,
            0.0F,
            100.0F,
            1.0F
         )
         .a(() -> this.b.a());
      var2 = 1551847907;
      var1 = -423532767;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1384233030;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var10006 = (int)7792997274720822013L;
      var2 = 928071355;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var2 = 350738583;
      var1 = var10006;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var2 = 1494875215;
      var1 = -827656824;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1832274670;
      var1 = var10007;
      var10007 = (var1 | var2) - (var1 & var2);
      var2 = -1914775085;
      var1 = -1142471823;
      var10008 = (var1 | var2) - (var1 & var2);
      var2 = 914319737;
      var1 = var10008;
      this.f = new SettingGroup(
         c(
            "裩\uf5ea裁\uf5e2袶\uf5f8裌\uf189裈\uf596袽\uf5eb裆",
            "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=ꟕ꒺ꁤꤋ絲蹩⑵謹㑣`\ua7e9꒹ꁽ꤀絤蹧⑵謳㑢~\ua7e3",
            var10005,
            var10006,
            var10007,
            (var1 | var2) & ~(var1 & var2)
         )
      );
      var2 = -1102806811;
      var1 = -808662246;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1716009605;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var10006 = (int)1429814194908609784L;
      var2 = -793840756;
      var1 = var10006;
      var10006 = (var1 | var2) - (var1 & var2);
      var2 = -901632303;
      var1 = var10006;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var2 = -427976728;
      var1 = 1609465597;
      var10007 = (var1 | var2) - (var1 & var2);
      var2 = -1380489434;
      var1 = var10007;
      var10007 = (var1 | var2) & ~(var1 & var2);
      var2 = -790673996;
      var1 = -632202759;
      var10008 = (var1 | var2) & ~(var1 & var2);
      var2 = 177392866;
      var1 = var10008;
      var10003 = c(
         "裧횝裈횜裈훧", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=ꟕ꒺ꁤꤋ絲蹩⑵謹㑣`\ua7e9꒹ꁽ꤀絤蹧⑵謳㑢~\ua7e3", var10005, var10006, var10007, (var1 | var2) & ~(var1 & var2)
      );
      var2 = 163430263;
      var1 = -813661196;
      var10004 = (var1 | var2) & ~(var1 & var2);
      var2 = -969065341;
      var1 = var10004;
      this.g = new BooleanSetting(var10003, pulse.Bool.from((var1 | var2) & (var1 & var2 ^ -1)));
      var10005 = (int)3770094200130586796L;
      var2 = 1595562999;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = -139551265;
      var1 = var10005;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var10006 = (int)972639120848857097L;
      var2 = -2113359183;
      var1 = var10006;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var2 = 1517991018;
      var1 = var10006;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var2 = -1300962817;
      var1 = -1923290391;
      var10007 = (var1 | var2) - (var1 & var2);
      var2 = 1055142623;
      var1 = var10007;
      var10007 = (var1 | var2) - (var1 & var2);
      var10008 = (int)3077945807186488827L;
      var2 = -1192888053;
      var1 = var10008;
      var10008 = (var1 | var2) - (var1 & var2);
      var2 = -743864020;
      var1 = var10008;
      this.h = new SliderSetting(
            c(
               "裥鯮裈鮒裌鮐袷鯬袺龎裇鯮裈鯯裌鮞",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=ꟕ꒺ꁤꤋ絲蹩⑵謹㑣`\ua7e9꒹ꁽ꤀絤蹧⑵謳㑢~\ua7e3",
               var10005,
               var10006,
               var10007,
               (var1 | var2) & ~(var1 & var2)
            ),
            50.0F,
            0.0F,
            100.0F,
            1.0F
         )
         .a(() -> this.g.a());
      var10005 = (int)-5567264077107936096L;
      var2 = -899029284;
      var1 = var10005;
      var10005 = (var1 | var2) - (var1 & var2);
      var2 = -1419367176;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var10006 = (int)-3065305448155913852L;
      var2 = 106798434;
      var1 = var10006;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var2 = -802232338;
      var1 = var10006;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var10007 = (int)8294095848618429297L;
      var2 = 114211840;
      var1 = var10007;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      var2 = -381587007;
      var1 = var10007;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      var10008 = (int)-7042713512673229946L;
      var2 = -1594993018;
      var1 = var10008;
      var10008 = var1 & ~var2 | ~var1 & var2;
      var2 = 1726258962;
      var1 = var10008;
      var10003 = c(
         "裖\u0c50裁\u0c51裎\u0c52裆ౝ裎ౕ",
         "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=ꟕ꒺ꁤꤋ絲蹩⑵謹㑣`\ua7e9꒹ꁽ꤀絤蹧⑵謳㑢~\ua7e3",
         var10005,
         var10006,
         var10007,
         (var1 | var2) & (~var1 | ~var2)
      );
      var2 = 2049396617;
      var1 = -1868940697;
      var10004 = var1 & ~var2 | ~var1 & var2;
      var2 = -356682258;
      var1 = var10004;
      this.i = new BooleanSetting(var10003, pulse.Bool.from(var1 + var2 - 2 * (var1 & var2)));
      var10005 = (int)-4029169735365709312L;
      var2 = 502306680;
      var1 = var10005;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var2 = -368399364;
      var1 = var10005;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1955330601;
      var1 = -733294051;
      var10006 = (var1 | var2) - (var1 & var2);
      var2 = 195264472;
      var1 = var10006;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var2 = 707393646;
      var1 = 747974305;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var2 = 211422798;
      var1 = var10007;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      var2 = -644797496;
      var1 = -685533190;
      var10008 = var1 + var2 - 2 * (var1 & var2);
      var2 = 246590254;
      var1 = var10008;
      this.j = new SliderSetting(
            c(
               "裥ᄮ裈ᅒ裌ᅐ袷ᄬ袺ᕎ袶ᅞ裁ᅟ裎ᅜ裆ᅓ裎ᄡ",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=ꟕ꒺ꁤꤋ絲蹩⑵謹㑣`\ua7e9꒹ꁽ꤀絤蹧⑵謳㑢~\ua7e3",
               var10005,
               var10006,
               var10007,
               (var1 | var2) - (var1 & var2)
            ),
            50.0F,
            0.0F,
            100.0F,
            1.0F
         )
         .a(() -> this.i.a());
      var2 = 1580168985;
      var1 = 395544438;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1585217813;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var10006 = (int)-7331801668539014755L;
      var2 = 1249246544;
      var1 = var10006;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1104014914;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var10007 = (int)-3838567501092860199L;
      var2 = -1420992355;
      var1 = var10007;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1167993288;
      var1 = var10007;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var2 = -296617774;
      var1 = -1844586682;
      var10008 = (var1 | var2) & (~var1 | ~var2);
      var2 = 2085883405;
      var1 = var10008;
      var10003 = c(
         "裩⟕裂⟚裈➫賖⟕裉➠袴⟛", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=ꟕ꒺ꁤꤋ絲蹩⑵謹㑣`\ua7e9꒹ꁽ꤀絤蹧⑵謳㑢~\ua7e3", var10005, var10006, var10007, (var1 | var2) & ~(var1 & var2)
      );
      var10004 = (int)3435510256820166193L;
      var2 = 2014846478;
      var1 = var10004;
      var10004 = (var1 | var2) - (var1 & var2);
      var2 = 669122623;
      var1 = var10004;
      this.k = new BooleanSetting(var10003, pulse.Bool.from((var1 | var2) & (var1 ^ -1 | var2 ^ -1)));
      var10005 = (int)-7789403383054746106L;
      var2 = -1568878210;
      var1 = var10005;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var2 = -293019140;
      var1 = var10005;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var10006 = (int)1090650365896174379L;
      var2 = -517232037;
      var1 = var10006;
      var10006 = (var1 | var2) - (var1 & var2);
      var2 = 80813790;
      var1 = var10006;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1140047386;
      var1 = 488534640;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var2 = 1586095003;
      var1 = var10007;
      var10007 = (var1 | var2) - (var1 & var2);
      var10008 = (int)104895037265439242L;
      var2 = -768693036;
      var1 = var10008;
      var10008 = var1 + var2 - 2 * (var1 & var2);
      var2 = -657995674;
      var1 = var10008;
      this.l = new SliderSetting(
            c(
               "裥ࢊ裈ࣶ裌ࣴ袷࢈袺೪裉ࣴ裂ࣻ裈ࢊ裆",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=ꟕ꒺ꁤꤋ絲蹩⑵謹㑣`\ua7e9꒹ꁽ꤀絤蹧⑵謳㑢~\ua7e3",
               var10005,
               var10006,
               var10007,
               (var1 | var2) - (var1 & var2)
            ),
            50.0F,
            0.0F,
            100.0F,
            1.0F
         )
         .a(() -> this.k.a());
      var2 = -721846416;
      var1 = -2008036647;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = -1266074835;
      var1 = var10005;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var10006 = (int)-1380936093139527213L;
      var2 = -1851224481;
      var1 = var10006;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1408578867;
      var1 = var10006;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var10007 = (int)4047884169923541061L;
      var2 = -1092025573;
      var1 = var10007;
      var10007 = (var1 | var2) & ~(var1 & var2);
      var2 = 390343345;
      var1 = var10007;
      var10007 = (var1 | var2) - (var1 & var2);
      var2 = 1754627050;
      var1 = 54679470;
      var10008 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1808416141;
      var1 = var10008;
      this.m = new SettingGroup(
         c("裨\u17fb袵ឍ裎ណ", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=ꟕ꒺ꁤꤋ絲蹩⑵謹㑣`\ua7e9꒹ꁽ꤀絤蹧⑵謳㑢~\ua7e3", var10005, var10006, var10007, (var1 | var2) - (var1 & var2))
      );
      var2 = 864736879;
      var1 = -1063527813;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = 456032912;
      var1 = var10005;
      var10005 = (var1 | var2) - (var1 & var2);
      var2 = 513486115;
      var1 = 1237036709;
      var10006 = (var1 | var2) - (var1 & var2);
      var2 = 59436133;
      var1 = var10006;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var10007 = (int)-2270735809089973476L;
      var2 = 495377719;
      var1 = var10007;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var2 = 233276803;
      var1 = var10007;
      var10007 = (var1 | var2) & (~var1 | ~var2);
      var10008 = (int)-1340905150670546879L;
      var2 = 1679629518;
      var1 = var10008;
      var10008 = (var1 | var2) & ~(var1 & var2);
      var2 = -723805598;
      var1 = var10008;
      var10003 = c(
         "裔\ud8df裃\ud8a8袵\ud8ae裃\ud8d9",
         "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=ꟕ꒺ꁤꤋ絲蹩⑵謹㑣`\ua7e9꒹ꁽ꤀絤蹧⑵謳㑢~\ua7e3",
         var10005,
         var10006,
         var10007,
         var1 + var2 - 2 * (var1 & var2)
      );
      var2 = -1125653573;
      var1 = -835463012;
      var10004 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1926511399;
      var1 = var10004;
      this.n = new BooleanSetting(var10003, pulse.Bool.from((var1 | var2) & (var1 & var2 ^ -1)));
      var10005 = (int)-8170949125985972205L;
      var2 = 632177627;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var2 = 1983946060;
      var1 = var10005;
      var10005 = (var1 | var2) - (var1 & var2);
      var2 = -1999955766;
      var1 = 1563091788;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var2 = -2126062895;
      var1 = var10006;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var10007 = (int)-117862638842073209L;
      var2 = 1492673780;
      var1 = var10007;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var2 = -1504479078;
      var1 = var10007;
      var10007 = (var1 | var2) & ~(var1 & var2);
      var2 = 1713135047;
      var1 = -1888033250;
      var10008 = var1 + var2 - 2 * (var1 & var2);
      var2 = -379376712;
      var1 = var10008;
      this.o = new SliderSetting(
            c(
               "裥陓裈阯裌阭袷陑袺鈳袴陓裃阤袵阢袰阣",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=ꟕ꒺ꁤꤋ絲蹩⑵謹㑣`\ua7e9꒹ꁽ꤀絤蹧⑵謳㑢~\ua7e3",
               var10005,
               var10006,
               var10007,
               var1 & ~var2 | ~var1 & var2
            ),
            50.0F,
            0.0F,
            100.0F,
            1.0F
         )
         .a(() -> this.n.a());
      var2 = 1513974031;
      var1 = -306252660;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = 1606161159;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var10006 = (int)9083204402102380444L;
      var2 = 735121244;
      var1 = var10006;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var2 = 514775005;
      var1 = var10006;
      var10006 = (var1 | var2) - (var1 & var2);
      var10007 = (int)8858616641934273737L;
      var2 = 1818496585;
      var1 = var10007;
      var10007 = (var1 | var2) & (~var1 | ~var2);
      var2 = -433587616;
      var1 = var10007;
      var10007 = (var1 | var2) & ~(var1 & var2);
      var2 = 958801331;
      var1 = -593974730;
      var10008 = (var1 | var2) & (~var1 | ~var2);
      var2 = -437231198;
      var1 = var10008;
      var10003 = c(
         "裕\ue861裈\ue812裌\ue865",
         "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=ꟕ꒺ꁤꤋ絲蹩⑵謹㑣`\ua7e9꒹ꁽ꤀絤蹧⑵謳㑢~\ua7e3",
         var10005,
         var10006,
         var10007,
         (var1 | var2) & (~var1 | ~var2)
      );
      var10004 = (int)394964724369171717L;
      var2 = 2125363451;
      var1 = var10004;
      var10004 = (var1 | var2) & ~(var1 & var2);
      var2 = -2139365890;
      var1 = var10004;
      this.p = new BooleanSetting(var10003, pulse.Bool.from(var1 & (var2 ^ -1) | (var1 ^ -1) & var2));
      var2 = 576059149;
      var1 = 1639644256;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1412397591;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var2 = -900100645;
      var1 = -1386580665;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var2 = 867163693;
      var1 = var10006;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var10007 = (int)2541024440109246606L;
      var2 = 1810966419;
      var1 = var10007;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1856321752;
      var1 = var10007;
      var10007 = (var1 | var2) & ~(var1 & var2);
      var10008 = (int)-5825863372547083384L;
      var2 = -277970373;
      var1 = var10008;
      var10008 = var1 + var2 - 2 * (var1 & var2);
      var2 = -834722808;
      var1 = var10008;
      this.q = new SliderSetting(
            c(
               "裥鎉裈鏵裌鏷袷鎋袺韩袵鏽裈鎎裌鏱",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=ꟕ꒺ꁤꤋ絲蹩⑵謹㑣`\ua7e9꒹ꁽ꤀絤蹧⑵謳㑢~\ua7e3",
               var10005,
               var10006,
               var10007,
               (var1 | var2) & (~var1 | ~var2)
            ),
            50.0F,
            0.0F,
            100.0F,
            1.0F
         )
         .a(() -> this.p.a());
      var2 = -84499702;
      var1 = 552623878;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = 842625672;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var10006 = (int)2145186478553913464L;
      var2 = 1838967943;
      var1 = var10006;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1236030970;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var2 = 313300705;
      var1 = -1535047667;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var2 = -1310321197;
      var1 = var10007;
      var10007 = (var1 | var2) & ~(var1 & var2);
      var2 = 1748291232;
      var1 = 223632577;
      var10008 = (var1 | var2) & ~(var1 & var2);
      var2 = 1696963682;
      var1 = var10008;
      this.r = new SettingGroup(
         c("裦࠳裆ࡋ裆", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=ꟕ꒺ꁤꤋ絲蹩⑵謹㑣`\ua7e9꒹ꁽ꤀絤蹧⑵謳㑢~\ua7e3", var10005, var10006, var10007, (var1 | var2) & (~var1 | ~var2))
      );
      var10005 = (int)8404400581249497244L;
      var2 = 1997725266;
      var1 = var10005;
      var10005 = (var1 | var2) - (var1 & var2);
      var2 = 1146824778;
      var1 = var10005;
      var10005 = (var1 | var2) - (var1 & var2);
      var10006 = (int)-980507095861657717L;
      var2 = -1742340163;
      var1 = var10006;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var2 = 260770481;
      var1 = var10006;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1777654448;
      var1 = 703515894;
      var10007 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1632161937;
      var1 = var10007;
      var10007 = (var1 | var2) & (~var1 | ~var2);
      var2 = -496557167;
      var1 = 1068084572;
      var10008 = var1 + var2 - 2 * (var1 & var2);
      var2 = -571967652;
      var1 = var10008;
      var10003 = c(
         "裡\uffd1袵\uffd9賖ﾠ裂ￓ袶ￓ",
         "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=ꟕ꒺ꁤꤋ絲蹩⑵謹㑣`\ua7e9꒹ꁽ꤀絤蹧⑵謳㑢~\ua7e3",
         var10005,
         var10006,
         var10007,
         (var1 | var2) & (~var1 | ~var2)
      );
      var10004 = (int)-1023339260507858340L;
      var2 = -436484102;
      var1 = var10004;
      var10004 = (var1 | var2) - (var1 & var2);
      var2 = -1454629466;
      var1 = var10004;
      this.s = new BooleanSetting(var10003, pulse.Bool.from(var1 & (var2 ^ -1) | (var1 ^ -1) & var2));
      var2 = -125551709;
      var1 = -1633574314;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = -1910892687;
      var1 = var10005;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var10006 = (int)-5500535294406391695L;
      var2 = 1254438320;
      var1 = var10006;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var2 = -394655109;
      var1 = var10006;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var2 = 418973357;
      var1 = 1414630681;
      var10007 = (var1 | var2) & ~(var1 & var2);
      var2 = 1364946637;
      var1 = var10007;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var10008 = (int)1881580505241027332L;
      var2 = 1733157456;
      var1 = var10008;
      var10008 = (var1 | var2) & (~var1 | ~var2);
      var2 = 2017904528;
      var1 = var10008;
      this.t = new SliderSetting(
            c(
               "裥\u20f6裈₊裌₈袷\u20f4袺⒖袵₂裆\u20f6裆",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=ꟕ꒺ꁤꤋ絲蹩⑵謹㑣`\ua7e9꒹ꁽ꤀絤蹧⑵謳㑢~\ua7e3",
               var10005,
               var10006,
               var10007,
               (var1 | var2) & (~var1 | ~var2)
            ),
            50.0F,
            0.0F,
            100.0F,
            1.0F
         )
         .a(() -> this.s.a());
      var10005 = (int)6262192018412541797L;
      var2 = -89138036;
      var1 = var10005;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1179927917;
      var1 = var10005;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var10006 = (int)-1661155047152573218L;
      var2 = -1431642675;
      var1 = var10006;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var2 = -671793514;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var2 = -70206204;
      var1 = -609913640;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var2 = 1036160284;
      var1 = var10007;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var10008 = (int)-9189533358752476777L;
      var2 = 923926152;
      var1 = var10008;
      var10008 = var1 & ~var2 | ~var1 & var2;
      var2 = 80189840;
      var1 = var10008;
      var10003 = c(
         "裡냏袵냇賖냇袶냅袴냍", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=ꟕ꒺ꁤꤋ絲蹩⑵謹㑣`\ua7e9꒹ꁽ꤀絤蹧⑵謳㑢~\ua7e3", var10005, var10006, var10007, (var1 | var2) & ~(var1 & var2)
      );
      var10004 = (int)-8789535935354845889L;
      var2 = -1535885470;
      var1 = var10004;
      var10004 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1691417181;
      var1 = var10004;
      this.u = new BooleanSetting(var10003, pulse.Bool.from(var1 + var2 - 2 * (var1 & var2)));
      var2 = -1198541618;
      var1 = 269107197;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1085932983;
      var1 = var10005;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var10006 = (int)1787934936459476408L;
      var2 = 53171472;
      var1 = var10006;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1185431135;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var10007 = (int)6946137261295621108L;
      var2 = -1645046573;
      var1 = var10007;
      var10007 = (var1 | var2) & (~var1 | ~var2);
      var2 = -4121333;
      var1 = var10007;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      var10008 = (int)5231234569733933594L;
      var2 = -1106553450;
      var1 = var10008;
      var10008 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1202182541;
      var1 = var10008;
      this.v = new SliderSetting(
            c(
               "裥耳裈聏裌聍袷耱袺葓裌耳裎耱裆",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=ꟕ꒺ꁤꤋ絲蹩⑵謹㑣`\ua7e9꒹ꁽ꤀絤蹧⑵謳㑢~\ua7e3",
               var10005,
               var10006,
               var10007,
               (var1 | var2) & (~var1 | ~var2)
            ),
            50.0F,
            0.0F,
            100.0F,
            1.0F
         )
         .a(() -> this.u.a());
      var2 = 1961709863;
      var1 = -533727660;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var2 = 2096966135;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var2 = 1088001428;
      var1 = 782956119;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var2 = 985696949;
      var1 = var10006;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var10007 = (int)-8887483207084890980L;
      var2 = -1746168120;
      var1 = var10007;
      var10007 = (var1 | var2) & (~var1 | ~var2);
      var2 = -455125525;
      var1 = var10007;
      var10007 = (var1 | var2) & ~(var1 & var2);
      var10008 = (int)-8613511004904078076L;
      var2 = -1784538426;
      var1 = var10008;
      var10008 = var1 & ~var2 | ~var1 & var2;
      var2 = 242353986;
      var1 = var10008;
      this.w = new SettingGroup(
         c("裩庲裈庵裃廇", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=ꟕ꒺ꁤꤋ絲蹩⑵謹㑣`\ua7e9꒹ꁽ꤀絤蹧⑵謳㑢~\ua7e3", var10005, var10006, var10007, (var1 | var2) - (var1 & var2))
      );
      var2 = -1530081377;
      var1 = 1162246649;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = 162871522;
      var1 = var10005;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1795995555;
      var1 = 626983706;
      var10006 = (var1 | var2) - (var1 & var2);
      var2 = -446524772;
      var1 = var10006;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var2 = 122097578;
      var1 = -2077134412;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var2 = -1757693123;
      var1 = var10007;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1599500880;
      var1 = -699787889;
      var10008 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1993527494;
      var1 = var10008;
      var10003 = c(
         "裗亨裍亢袾", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=ꟕ꒺ꁤꤋ絲蹩⑵謹㑣`\ua7e9꒹ꁽ꤀絤蹧⑵謳㑢~\ua7e3", var10005, var10006, var10007, var1 + var2 - 2 * (var1 & var2)
      );
      var2 = 2137776178;
      var1 = 780866764;
      var10004 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1373697278;
      var1 = var10004;
      this.x = new BooleanSetting(var10003, pulse.Bool.from(var1 + var2 - 2 * (var1 & var2)));
      var2 = -1769777491;
      var1 = -1367743771;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = -792380724;
      var1 = var10005;
      var10005 = (var1 | var2) - (var1 & var2);
      var2 = -1931242078;
      var1 = 685135943;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var2 = -259069290;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var2 = 1861323854;
      var1 = -1278121950;
      var10007 = (var1 | var2) & ~(var1 & var2);
      var2 = -633646751;
      var1 = var10007;
      var10007 = (var1 | var2) - (var1 & var2);
      var2 = -1772497821;
      var1 = -1640619346;
      var10008 = (var1 | var2) - (var1 & var2);
      var2 = 141713584;
      var1 = var10008;
      this.y = new SliderSetting(
            c(
               "裥遏裈逳裌週袷遍袺鐯袷逰裍逺袾逿",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=ꟕ꒺ꁤꤋ絲蹩⑵謹㑣`\ua7e9꒹ꁽ꤀絤蹧⑵謳㑢~\ua7e3",
               var10005,
               var10006,
               var10007,
               var1 + var2 - 2 * (var1 & var2)
            ),
            50.0F,
            0.0F,
            100.0F,
            1.0F
         )
         .a(() -> this.x.a());
      var2 = -1624623686;
      var1 = 374051412;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = 1633560938;
      var1 = var10005;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var2 = -209744375;
      var1 = 2124485373;
      var10006 = (var1 | var2) - (var1 & var2);
      var2 = -651081986;
      var1 = var10006;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1926012630;
      var1 = -1693591450;
      var10007 = (var1 | var2) - (var1 & var2);
      var2 = 182900633;
      var1 = var10007;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1275623477;
      var1 = -1054990489;
      var10008 = (var1 | var2) - (var1 & var2);
      var2 = 1924911544;
      var1 = var10008;
      var10003 = c(
         "裬伦裎伤賖䬠貃䬈貢䬏貛䬃", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=ꟕ꒺ꁤꤋ絲蹩⑵謹㑣`\ua7e9꒹ꁽ꤀絤蹧⑵謳㑢~\ua7e3", var10005, var10006, var10007, var1 & ~var2 | ~var1 & var2
      );
      var10004 = (int)-6541541639964708114L;
      var2 = 863183439;
      var1 = var10004;
      var10004 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1225330849;
      var1 = var10004;
      this.z = new BooleanSetting(var10003, pulse.Bool.from(var1 & (var2 ^ -1) | (var1 ^ -1) & var2));
      var10005 = (int)4809317395251556925L;
      var2 = 690384716;
      var1 = var10005;
      var10005 = (var1 | var2) - (var1 & var2);
      var2 = 1829409781;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var2 = 598592252;
      var1 = 1928801369;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var2 = 99709564;
      var1 = var10006;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var10007 = (int)1503112646657267166L;
      var2 = -1747800202;
      var1 = var10007;
      var10007 = (var1 | var2) & ~(var1 & var2);
      var2 = -1722615335;
      var1 = var10007;
      var10007 = (var1 | var2) & (~var1 | ~var2);
      var2 = 562428029;
      var1 = 293364759;
      var10008 = (var1 | var2) & (~var1 | ~var2);
      var2 = 821534601;
      var1 = var10008;
      this.A = new SliderSetting(
            c(
               "裥ב裈֭裌֯袷ד袺Ʊ貰Ǥ貘ǅ貟Ǽ貓",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=ꟕ꒺ꁤꤋ絲蹩⑵謹㑣`\ua7e9꒹ꁽ꤀絤蹧⑵謳㑢~\ua7e3",
               var10005,
               var10006,
               var10007,
               (var1 | var2) & (~var1 | ~var2)
            ),
            50.0F,
            0.0F,
            100.0F,
            1.0F
         )
         .a(() -> this.z.a());
      this.B = new HashMap<>();
      int var690 = (int)4651024219044093270L;
      var2 = 1527240666;
      var1 = var690;
      int var691 = (var1 | var2) & ~(var1 & var2);
      var2 = 585417736;
      var1 = var691;
      int var692 = (var1 | var2) & (~var1 | ~var2);
      var2 = 441137351;
      var1 = 140726515;
      var10004 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1190469031;
      var1 = var10004;
      var10004 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1643904631;
      var1 = -1288372581;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var2 = 626426876;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var10006 = (int)-1740778252989585141L;
      var2 = -1482749581;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var2 = 1114916069;
      var1 = var10006;
      this.B
         .put(
            c(
               "貛\ue686貘\ue68a貕\ue69d貗\ue689貂\ue6d5貓\ue681貂\ue686貂\ue696賘\ue689貟\ue69d貓\ue698貙\ue69d貝\ue6b0貄\ue680貕\ue684貓\ue69b賘\ue683貗\ue69a貘\ue68c貞",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=ꟕ꒺ꁤꤋ絲蹩⑵謹㑣`\ua7e9꒹ꁽ꤀絤蹧⑵謳㑢~\ua7e3",
               var692,
               var10004,
               var10005,
               (var1 | var2) & (~var1 | ~var2)
            ),
            new SoundController.SoundVolumeBinding(this.b, this.e)
         );
      var2 = -1564270232;
      var1 = 1422861030;
      int var693 = (var1 | var2) - (var1 & var2);
      var2 = 506694922;
      var1 = var693;
      int var694 = (var1 | var2) - (var1 & var2);
      var2 = 5459303;
      var1 = -2054796659;
      var10004 = (var1 | var2) & ~(var1 & var2);
      var2 = -784572217;
      var1 = var10004;
      var10004 = var1 + var2 - 2 * (var1 & var2);
      var2 = 299571509;
      var1 = 971253566;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = 903743547;
      var1 = var10005;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var10006 = (int)-3474377651045990370L;
      var2 = 1870734454;
      var1 = var10006;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1511256671;
      var1 = var10006;
      this.B
         .put(
            c(
               "貛퐬貘퐠貕퐷貗퐣貂푿貓퐫貂퐬貂퐼賘퐠貎퐵貓퐷貟퐠貘퐦貓퐚貔퐪貂퐱貚퐠賘퐱貞퐷貙퐲",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=ꟕ꒺ꁤꤋ絲蹩⑵謹㑣`\ua7e9꒹ꁽ꤀絤蹧⑵謳㑢~\ua7e3",
               var694,
               var10004,
               var10005,
               (var1 | var2) - (var1 & var2)
            ),
            new SoundController.SoundVolumeBinding(this.g, this.h)
         );
      var2 = 1371959825;
      var1 = 1261385298;
      int var695 = (var1 | var2) & ~(var1 & var2);
      var2 = -220804409;
      var1 = var695;
      int var696 = var1 + var2 - 2 * (var1 & var2);
      var2 = -2140079457;
      var1 = -1717643007;
      var10004 = (var1 | var2) & ~(var1 & var2);
      var2 = 1293996835;
      var1 = var10004;
      var10004 = (var1 | var2) - (var1 & var2);
      var10005 = (int)1297716718222272862L;
      var2 = 491961771;
      var1 = var10005;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = -614041701;
      var1 = var10005;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var10006 = (int)3563099840421983018L;
      var2 = 2035410354;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var2 = 1190840671;
      var1 = var10006;
      this.B
         .put(
            c(
               "貛巜貘巐貕巇貗巓貂嶏貓巛貂巜貂巌賘巆貆巙貗巆貞巪貆巚貂巜貙巛賘巗貄巐貗州",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=ꟕ꒺ꁤꤋ絲蹩⑵謹㑣`\ua7e9꒹ꁽ꤀絤蹧⑵謳㑢~\ua7e3",
               var696,
               var10004,
               var10005,
               (var1 | var2) - (var1 & var2)
            ),
            new SoundController.SoundVolumeBinding(this.i, this.j)
         );
      int var697 = (int)8080695283181301192L;
      var2 = -1615339398;
      var1 = var697;
      int var698 = (var1 | var2) & (~var1 | ~var2);
      var2 = -2084945098;
      var1 = var698;
      int var699 = var1 & ~var2 | ~var1 & var2;
      var10004 = (int)-3017497095270753201L;
      var2 = 1596694280;
      var1 = var10004;
      var10004 = (var1 | var2) & ~(var1 & var2);
      var2 = 511066250;
      var1 = var10004;
      var10004 = (var1 | var2) & ~(var1 & var2);
      var2 = -6046044;
      var1 = 1286143786;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var2 = -1157197348;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var10006 = (int)937727121716582124L;
      var2 = 530458605;
      var1 = var10006;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var2 = 1301775318;
      var1 = var10006;
      this.B
         .put(
            c(
               "貛ヌ貘ダ貕プ貗ッ貂ゟ貓ニ貂ヌ貂ボ賘ダ貎フ貓プ貟ダ貘テ貓ヺ貙プ貔る貆ヌ貕ノ貃フ",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=ꟕ꒺ꁤꤋ絲蹩⑵謹㑣`\ua7e9꒹ꁽ꤀絤蹧⑵謳㑢~\ua7e3",
               var699,
               var10004,
               var10005,
               var1 + var2 - 2 * (var1 & var2)
            ),
            new SoundController.SoundVolumeBinding(this.k, this.l)
         );
      var2 = -1939528391;
      var1 = -1766165920;
      int var700 = (var1 | var2) & ~(var1 & var2);
      var2 = -220145187;
      var1 = var700;
      int var701 = var1 & ~var2 | ~var1 & var2;
      var10004 = (int)953135150939563918L;
      var2 = -196209956;
      var1 = var10004;
      var10004 = (var1 | var2) - (var1 & var2);
      var2 = 237027510;
      var1 = var10004;
      var10004 = (var1 | var2) & ~(var1 & var2);
      var10005 = (int)6144844512482631961L;
      var2 = -1783379562;
      var1 = var10005;
      var10005 = (var1 | var2) - (var1 & var2);
      var2 = 1892225149;
      var1 = var10005;
      var10005 = (var1 | var2) - (var1 & var2);
      var10006 = (int)-2465617371619697125L;
      var2 = 818650574;
      var1 = var10006;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1813538619;
      var1 = var10006;
      this.B
         .put(
            c(
               "貛꛵貘\ua6f9貕ꛮ貗\ua6fa貂ꚦ貟ꛨ貓꛱賘ꛨ貄꛵貒\ua6f9貘ꛨ賘ꛮ貓ꛨ貃ꛮ貘",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=ꟕ꒺ꁤꤋ絲蹩⑵謹㑣`\ua7e9꒹ꁽ꤀絤蹧⑵謳㑢~\ua7e3",
               var701,
               var10004,
               var10005,
               (var1 | var2) & ~(var1 & var2)
            ),
            new SoundController.SoundVolumeBinding(this.n, this.o)
         );
      var2 = 274768966;
      var1 = 290544537;
      int var702 = (var1 | var2) & ~(var1 & var2);
      var2 = -384929445;
      var1 = var702;
      int var703 = (var1 | var2) & (~var1 | ~var2);
      var2 = 2106670975;
      var1 = -1192498374;
      var10004 = var1 & ~var2 | ~var1 & var2;
      var2 = -1852021670;
      var1 = var10004;
      var10004 = var1 + var2 - 2 * (var1 & var2);
      var2 = 93694211;
      var1 = -1751141594;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = -2005182334;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1107425029;
      var1 = -517037793;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var2 = -1553577677;
      var1 = var10006;
      this.B
         .put(
            c(
               "貛ᴲ貘ᴾ貕ᴩ貗ᴽ貂ᵡ貟ᴯ貓ᴶ賘ᴯ貄ᴲ貒ᴾ貘ᴯ賘ᴳ貟ᴯ販ᴼ貄ᴴ貃ᴵ貒",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=ꟕ꒺ꁤꤋ絲蹩⑵謹㑣`\ua7e9꒹ꁽ꤀絤蹧⑵謳㑢~\ua7e3",
               var703,
               var10004,
               var10005,
               (var1 | var2) & (~var1 | ~var2)
            ),
            new SoundController.SoundVolumeBinding(this.n, this.o)
         );
      var2 = 404661013;
      var1 = 800409112;
      int var704 = (var1 | var2) - (var1 & var2);
      var2 = -543921271;
      var1 = var704;
      int var705 = (var1 | var2) - (var1 & var2);
      var2 = -179421967;
      var1 = -774585232;
      var10004 = (var1 | var2) & ~(var1 & var2);
      var2 = 1881221428;
      var1 = var10004;
      var10004 = (var1 | var2) & ~(var1 & var2);
      var10005 = (int)4631705007012782606L;
      var2 = 534564736;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = -420946807;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var10006 = (int)-5898807300985285268L;
      var2 = 576564146;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var2 = 1879670369;
      var1 = var10006;
      this.B
         .put(
            c(
               "貛䊤貘䊨貕䊿貗䊫貂䋷貔䊡貙䊮貝䋣貔䊨貗䊮貙䊣賘䊩貓䊬貕䊹貟䊻貗䊹貓",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=ꟕ꒺ꁤꤋ絲蹩⑵謹㑣`\ua7e9꒹ꁽ꤀絤蹧⑵謳㑢~\ua7e3",
               var705,
               var10004,
               var10005,
               var1 + var2 - 2 * (var1 & var2)
            ),
            new SoundController.SoundVolumeBinding(this.n, this.o)
         );
      var2 = -1560344217;
      var1 = 517366616;
      int var706 = var1 & ~var2 | ~var1 & var2;
      var2 = 1410786491;
      var1 = var706;
      int var707 = (var1 | var2) & (~var1 | ~var2);
      var10004 = (int)5404496424512179971L;
      var2 = 1542283701;
      var1 = var10004;
      var10004 = (var1 | var2) & ~(var1 & var2);
      var2 = 733378885;
      var1 = var10004;
      var10004 = (var1 | var2) & (~var1 | ~var2);
      var10005 = (int)-9047579975106848541L;
      var2 = -1258454198;
      var1 = var10005;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1255052380;
      var1 = var10005;
      var10005 = (var1 | var2) - (var1 & var2);
      var10006 = (int)-6306153776743777698L;
      var2 = 1680707658;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var2 = 1242246377;
      var1 = var10006;
      this.B
         .put(
            c(
               "貛䓦貘䓪貕䓽貗䓩貂䒵貓䓡貂䓦貂䓶賘䓩貟䓼貞䓦貘䓨販䓭貙䓭貔䓪貄䒡貄䓪貂䓽貟䓪貀䓪",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=ꟕ꒺ꁤꤋ絲蹩⑵謹㑣`\ua7e9꒹ꁽ꤀絤蹧⑵謳㑢~\ua7e3",
               var707,
               var10004,
               var10005,
               var1 + var2 - 2 * (var1 & var2)
            ),
            new SoundController.SoundVolumeBinding(this.p, this.q)
         );
      int var708 = (int)1405758199316842207L;
      var2 = -1576637480;
      var1 = var708;
      int var709 = (var1 | var2) & ~(var1 & var2);
      var2 = 342254467;
      var1 = var709;
      int var710 = (var1 | var2) & (~var1 | ~var2);
      var10004 = (int)-3361801411534714658L;
      var2 = 65183237;
      var1 = var10004;
      var10004 = (var1 | var2) & (~var1 | ~var2);
      var2 = -751491205;
      var1 = var10004;
      var10004 = var1 & ~var2 | ~var1 & var2;
      var2 = 1433618104;
      var1 = -1990127817;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = -935849122;
      var1 = var10005;
      var10005 = (var1 | var2) - (var1 & var2);
      var2 = -1448639940;
      var1 = 14002005;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var2 = -1453652541;
      var1 = var10006;
      this.B
         .put(
            c(
               "貛⊱貘⊽貕⊪貗⊾貂⋢貓⊶貂⊱貂⊡賘⊨貚⊹貏⊽貄⋶貗⊬貂⊹貕⊳賘⊫貁⊽貓⊨",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=ꟕ꒺ꁤꤋ絲蹩⑵謹㑣`\ua7e9꒹ꁽ꤀絤蹧⑵謳㑢~\ua7e3",
               var710,
               var10004,
               var10005,
               var1 + var2 - 2 * (var1 & var2)
            ),
            new SoundController.SoundVolumeBinding(this.s, this.t)
         );
      var2 = -1606784;
      var1 = 90949129;
      int var711 = var1 & ~var2 | ~var1 & var2;
      var2 = 313733901;
      var1 = var711;
      int var712 = var1 & ~var2 | ~var1 & var2;
      var2 = 441527621;
      var1 = 1349213843;
      var10004 = (var1 | var2) & ~(var1 & var2);
      var2 = 519077701;
      var1 = var10004;
      var10004 = (var1 | var2) - (var1 & var2);
      var2 = -1523263612;
      var1 = 910233680;
      var10005 = (var1 | var2) - (var1 & var2);
      var2 = -1912244317;
      var1 = var10005;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var10006 = (int)1819990384466388705L;
      var2 = 1176389829;
      var1 = var10006;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var2 = -292760135;
      var1 = var10006;
      this.B
         .put(
            c(
               "貛禆貘禊貕禝貗禉貂秕貓禁貂禆貂禖賘禟貚禎貏禊貄私貗禛貂禎貕禄賘禜貂禝貙禁貑",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=ꟕ꒺ꁤꤋ絲蹩⑵謹㑣`\ua7e9꒹ꁽ꤀絤蹧⑵謳㑢~\ua7e3",
               var712,
               var10004,
               var10005,
               (var1 | var2) & (~var1 | ~var2)
            ),
            new SoundController.SoundVolumeBinding(this.s, this.t)
         );
      int var713 = (int)3908611282879476433L;
      var2 = -1470748403;
      var1 = var713;
      int var714 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1988831912;
      var1 = var714;
      int var715 = (var1 | var2) - (var1 & var2);
      var10004 = (int)6310565872470360095L;
      var2 = 755179656;
      var1 = var10004;
      var10004 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1847060454;
      var1 = var10004;
      var10004 = var1 & ~var2 | ~var1 & var2;
      var10005 = (int)-3258108681458378847L;
      var2 = 395131119;
      var1 = var10005;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1704926671;
      var1 = var10005;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = -1719453248;
      var1 = -1024568794;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var2 = 1533496433;
      var1 = var10006;
      this.B
         .put(
            c(
               "貛▌貘▀貕▗貗▃貂◟貓▋貂▌貂▜賘▕貚▄貏▀貄○貗░貂▄貕▎賘▒貓▄貝",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=ꟕ꒺ꁤꤋ絲蹩⑵謹㑣`\ua7e9꒹ꁽ꤀絤蹧⑵謳㑢~\ua7e3",
               var715,
               var10004,
               var10005,
               (var1 | var2) - (var1 & var2)
            ),
            new SoundController.SoundVolumeBinding(this.s, this.t)
         );
      int var716 = (int)-1033002784390805632L;
      var2 = 633405542;
      var1 = var716;
      int var717 = (var1 | var2) - (var1 & var2);
      var2 = 496699746;
      var1 = var717;
      int var718 = (var1 | var2) - (var1 & var2);
      var10004 = (int)-5745229412276295355L;
      var2 = -912461624;
      var1 = var10004;
      var10004 = var1 & ~var2 | ~var1 & var2;
      var2 = -1655641685;
      var1 = var10004;
      var10004 = (var1 | var2) & ~(var1 & var2);
      var2 = -1640149353;
      var1 = 1689149175;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var2 = -531725669;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var10006 = (int)5946401242369381113L;
      var2 = 699881688;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var2 = -2036165359;
      var1 = var10006;
      this.B
         .put(
            c(
               "貛鴫貘鴧貕鴰貗鴤貂鵸貓鴬貂鴫貂鴻賘鴥貓鴬貓鴰貟鴡賘鴱貆鴮貗鴱貞",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=ꟕ꒺ꁤꤋ絲蹩⑵謹㑣`\ua7e9꒹ꁽ꤀絤蹧⑵謳㑢~\ua7e3",
               var718,
               var10004,
               var10005,
               (var1 | var2) & (~var1 | ~var2)
            ),
            new SoundController.SoundVolumeBinding(this.x, this.y)
         );
      var2 = 581853918;
      var1 = 351075930;
      int var719 = (var1 | var2) - (var1 & var2);
      var2 = -562228736;
      var1 = var719;
      int var720 = (var1 | var2) & ~(var1 & var2);
      var10004 = (int)7435906788382997418L;
      var2 = 1572566120;
      var1 = var10004;
      var10004 = (var1 | var2) & ~(var1 & var2);
      var2 = -1191088329;
      var1 = var10004;
      var10004 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1726349622;
      var1 = 719631022;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1129158799;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var10006 = (int)6082161649172295567L;
      var2 = 2131526017;
      var1 = var10006;
      var10006 = (var1 | var2) - (var1 & var2);
      var2 = -364649999;
      var1 = var10006;
      this.B
         .put(
            c(
               "貛䷤貘䷨貕䷿貗䷫貂䶷貓䷣貂䷤貂䷴賘䷽貚䷬貏䷨貄䶣貅䷽貚䷬貅䷥",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=ꟕ꒺ꁤꤋ絲蹩⑵謹㑣`\ua7e9꒹ꁽ꤀絤蹧⑵謳㑢~\ua7e3",
               var720,
               var10004,
               var10005,
               var1 + var2 - 2 * (var1 & var2)
            ),
            new SoundController.SoundVolumeBinding(this.x, this.y)
         );
      var2 = -1205959823;
      var1 = -1590348523;
      int var721 = (var1 | var2) - (var1 & var2);
      var2 = -250332960;
      var1 = var721;
      int var722 = var1 & ~var2 | ~var1 & var2;
      var2 = -1465031653;
      var1 = 1909499618;
      var10004 = (var1 | var2) & ~(var1 & var2);
      var2 = -1916395639;
      var1 = var10004;
      var10004 = var1 & ~var2 | ~var1 & var2;
      var2 = -1921499805;
      var1 = -407972014;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1701787565;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = -992705159;
      var1 = 1861036180;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var2 = -1440226921;
      var1 = var10006;
      this.B
         .put(
            c(
               "貛乡貘乭貕乺貗乮貂串貓书貂乡貂乱賘乸貚乩貏乭貄並貗乼貂乩貕乣賘乫貄乡貂",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=ꟕ꒺ꁤꤋ絲蹩⑵謹㑣`\ua7e9꒹ꁽ꤀絤蹧⑵謳㑢~\ua7e3",
               var722,
               var10004,
               var10005,
               var1 + var2 - 2 * (var1 & var2)
            ),
            new SoundController.SoundVolumeBinding(this.u, this.v)
         );
      int var723 = (int)7103139891299720122L;
      var2 = -1331341370;
      var1 = var723;
      int var724 = (var1 | var2) & ~(var1 & var2);
      var2 = -2109127944;
      var1 = var724;
      int var725 = (var1 | var2) - (var1 & var2);
      var10004 = (int)-5901819939838158305L;
      var2 = 263951801;
      var1 = var10004;
      var10004 = (var1 | var2) & (~var1 | ~var2);
      var2 = -156834927;
      var1 = var10004;
      var10004 = var1 & ~var2 | ~var1 & var2;
      var10005 = (int)3122740095498904598L;
      var2 = 747027150;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1193785904;
      var1 = var10005;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var10006 = (int)-2736404020481933842L;
      var2 = 1364634257;
      var1 = var10006;
      var10006 = (var1 | var2) - (var1 & var2);
      var2 = -864990146;
      var1 = var10006;
      this.B
         .put(
            c(
               "貛\ud95a貘\ud956貕\ud941貗\ud955貂\ud909貓\ud95d貂\ud95a貂\ud94a賘\ud943貚\ud952貏\ud956貄\ud91d貚\ud956貀\ud956貚\ud946貆",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=ꟕ꒺ꁤꤋ絲蹩⑵謹㑣`\ua7e9꒹ꁽ꤀絤蹧⑵謳㑢~\ua7e3",
               var725,
               var10004,
               var10005,
               var1 & ~var2 | ~var1 & var2
            ),
            new SoundController.SoundVolumeBinding(this.z, this.A)
         );
   }

   @EventHandler
   public void a(SoundPlayEvent var1) {
   }

   public static String c(String var0, String var1, int var2, int var3, int var4, int var5) {
      char[] var6 = var1.toCharArray();
      char[] var7 = new char[var6.length];
      int var18 = -333820825;
      int var17 = 754391085;
      int var10000 = (var17 | var18) & ~(var17 & var18);
      var18 = -1058188224;
      var17 = var10000;
      char[] var219 = new char[var17 + var18 - 2 * (var17 & var18)];
      var18 = 560957357;
      var17 = -844262783;
      int var10002 = (var17 | var18) - (var17 & var18);
      var18 = -322824916;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      int var10003 = (int)4782776244012369942L;
      var18 = 1658945341;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 980025113;
      var17 = var10003;
      var219[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var18 = 1287210076;
      var17 = 36079910;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 1319095675;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)-3702460241767991996L;
      var18 = -1358047721;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 1633976534;
      var17 = var10003;
      var219[var10002] = (char)((var17 | var18) - (var17 & var18));
      var18 = 253293125;
      var17 = 872056543;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1021473944;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)7023066021833538409L;
      var18 = -2091198865;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -891679104;
      var17 = var10003;
      var219[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var10002 = (int)5420628304646233463L;
      var18 = 99837913;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 674151085;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -1416310320;
      var17 = -388547150;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 1128494193;
      var17 = var10003;
      var219[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var18 = -234742824;
      var17 = 1935801482;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -2124159146;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -1524611239;
      var17 = -724558330;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 1911605370;
      var17 = var10003;
      var219[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var10002 = (int)-6424863617052416245L;
      var18 = -275702840;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 1221819590;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1086076270;
      var17 = -83609733;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -1145550953;
      var17 = var10003;
      var219[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var18 = -595611849;
      var17 = -1316216131;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1844678028;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)2092402320525044788L;
      var18 = 217161255;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 518568704;
      var17 = var10003;
      var219[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var18 = -433696739;
      var17 = 58492780;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -447031434;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var10003 = (int)-1176078638649133738L;
      var18 = -1911326097;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 494402331;
      var17 = var10003;
      var219[var10002] = (char)((var17 | var18) - (var17 & var18));
      var18 = 1026609006;
      var17 = -1414339281;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1769854391;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var10003 = (int)-4286553801835389566L;
      var18 = -1677061596;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -552974347;
      var17 = var10003;
      var219[var10002] = (char)((var17 | var18) - (var17 & var18));
      var10002 = (int)-193632137096935229L;
      var18 = -639045908;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 986981926;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)2836960031147905108L;
      var18 = 1533317704;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 1240057144;
      var17 = var10003;
      var219[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      char[] var8 = var219;
      var10000 = (int)-6390392553614476551L;
      var18 = 1293412928;
      var17 = var10000;
      var10000 = var17 & ~var18 | ~var17 & var18;
      var18 = -946466637;
      var17 = var10000;
      char[] var222 = new char[(var17 | var18) - (var17 & var18)];
      var10002 = (int)7149782527013159515L;
      var18 = 920218038;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1993118739;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 284660478;
      var17 = -1375035353;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -1090684167;
      var17 = var10003;
      var222[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var18 = 1458944915;
      var17 = 1485637947;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 242791081;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -718000773;
      var17 = 1767326517;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1134302643;
      var17 = var10003;
      var222[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var18 = 1383522590;
      var17 = 512345389;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1291789361;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var10003 = (int)-2465829209319602508L;
      var18 = -721389981;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -658901116;
      var17 = var10003;
      var222[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var18 = -843892919;
      var17 = -1674002075;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 1368127023;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1648617379;
      var17 = 783794631;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1291066982;
      var17 = var10003;
      var222[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var10002 = (int)4721610479483704782L;
      var18 = 880310583;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 823864573;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var10003 = (int)4108364252441992630L;
      var18 = -1202634500;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -85547766;
      var17 = var10003;
      var222[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var10002 = (int)-8107515816369386367L;
      var18 = 191130278;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 18179618;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 379539419;
      var17 = -7459519;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -384738802;
      var17 = var10003;
      var222[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var18 = 91191150;
      var17 = -732066543;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -785188231;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -1774633743;
      var17 = 122086767;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1853923673;
      var17 = var10003;
      var222[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var10002 = (int)8842732969441397286L;
      var18 = 403179019;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -147289046;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1277404588;
      var17 = 88429505;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 1231480405;
      var17 = var10003;
      var222[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var18 = -1033966704;
      var17 = 1823768670;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1360368698;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 746136396;
      var17 = 1127267534;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 1867062406;
      var17 = var10003;
      var222[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var10002 = (int)-1274503047354143991L;
      var18 = 1315384042;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 1797947882;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)953496815986352798L;
      var18 = 887937281;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 1471793324;
      var17 = var10003;
      var222[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      char[] var9 = var222;
      var10000 = (int)8311492557626913709L;
      var18 = -1325912312;
      var17 = var10000;
      var10000 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1516215461;
      var17 = var10000;

      for (int var10 = var17 & ~var18 | ~var17 & var18; var10 < var6.length; var10++) {
         char var275 = var6[var10];
         char var205 = var8[var10 % var8.length];
         char var106 = var275;
         var7[var10] = (char)(var106 + var205 - 2 * (var106 & var205));
      }

      char[] var19 = new char[var7.length];
      var18 = -1645577323;
      var17 = -326055422;
      var10000 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1903866263;
      var17 = var10000;

      for (int var11 = var17 + var18 - 2 * (var17 & var18); var11 < var6.length; var11++) {
         char var276 = var7[var11];
         char var208 = var9[var11 % var9.length];
         char var109 = var276;
         var19[var11] = (char)(var109 & ~var208 | ~var109 & var208);
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
      var18 = -1876655536;
      var17 = -970087550;
      var10000 = var17 & ~var18 | ~var17 & var18;
      var18 = 1443439058;
      var17 = var10000;

      for (int var16 = var17 & ~var18 | ~var17 & var18; var16 < var15.length; var16++) {
         var18 = -1673323145;
         var17 = -1776546646;
         int var10001 = var17 + var18 - 2 * (var17 & var18);
         var18 = 174002655;
         var17 = var10001;
         switch (var16 % ((var17 | var18) & (~var17 | ~var18))) {
            case 0:
               var18 = var12;
               var17 = var13;
               var10002 = var17 + var18 - 2 * (var17 & var18);
               char var218 = var14[var16];
               var17 = var10002;
               var15[var16] = (char)(var17 + var218 - 2 * (var17 & var218));
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

   private static class SoundVolumeBinding {
      private final BooleanSetting a;
      private final SliderSetting b;

      public SoundVolumeBinding(BooleanSetting var1, SliderSetting var2) {
         this.a = var1;
         this.b = var2;
      }

      public static String a(String var0, String var1, int var2, int var3, int var4, int var5) {
         char[] var6 = var1.toCharArray();
         char[] var7 = new char[var6.length];
         int var18 = 1726154893;
         int var17 = -543378616;
         int var10000 = (var17 | var18) & (~var17 | ~var18);
         var18 = -1182811185;
         var17 = var10000;
         char[] var219 = new char[(var17 | var18) - (var17 & var18)];
         var18 = -1559329397;
         var17 = 1988668022;
         int var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = -712626179;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         int var10003 = (int)7677690116353847253L;
         var18 = -432776088;
         var17 = var10003;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = 1995996047;
         var17 = var10003;
         var219[var10002] = (char)((var17 | var18) & ~(var17 & var18));
         var18 = -1977758500;
         var17 = -308600309;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = 1736896214;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = 1154017739;
         var17 = 145977139;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = 1283171709;
         var17 = var10003;
         var219[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var10002 = (int)-4125507149852605738L;
         var18 = -1769578261;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = 1882579519;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var10003 = (int)8063731034656473764L;
         var18 = 884584762;
         var17 = var10003;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = 944214040;
         var17 = var10003;
         var219[var10002] = (char)((var17 | var18) & ~(var17 & var18));
         var18 = 726480404;
         var17 = -1760056782;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = -1134912475;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var10003 = (int)1932693419480109706L;
         var18 = 1599305566;
         var17 = var10003;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = -2004140601;
         var17 = var10003;
         var219[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var18 = 933024709;
         var17 = -1220884792;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = -2136599287;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var10003 = (int)2695161815581837645L;
         var18 = -1276614280;
         var17 = var10003;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = -165990128;
         var17 = var10003;
         var219[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var18 = -289884033;
         var17 = 617367205;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = -898302241;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var10003 = (int)6688965418159573411L;
         var18 = 1183013783;
         var17 = var10003;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = -154855498;
         var17 = var10003;
         var219[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var18 = -1278367807;
         var17 = 486965960;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = -1362418417;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = -1438887959;
         var17 = -1843115709;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = 941100985;
         var17 = var10003;
         var219[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var10002 = (int)7346219088689687689L;
         var18 = -228881983;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = 634479951;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var10003 = (int)-8654196218251423479L;
         var18 = 1481892855;
         var17 = var10003;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = 1791723228;
         var17 = var10003;
         var219[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var18 = 1977716224;
         var17 = -2102396097;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = -145853129;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = 1301970158;
         var17 = 1682156;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = 1300487761;
         var17 = var10003;
         var219[var10002] = (char)((var17 | var18) - (var17 & var18));
         var10002 = (int)-6990080459098151675L;
         var18 = 1872486971;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = -342505673;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var10003 = (int)-4339629357642441573L;
         var18 = -1288896513;
         var17 = var10003;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = -1007590336;
         var17 = var10003;
         var219[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         char[] var8 = var219;
         var10000 = (int)7055046145719300688L;
         var18 = -1531764439;
         var17 = var10000;
         var10000 = var17 & ~var18 | ~var17 & var18;
         var18 = -1188736141;
         var17 = var10000;
         char[] var222 = new char[(var17 | var18) & ~(var17 & var18)];
         var18 = -1343058426;
         var17 = 1018823857;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = -1823962441;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var10003 = (int)-4925885195814458170L;
         var18 = -268894741;
         var17 = var10003;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = -1528358643;
         var17 = var10003;
         var222[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var10002 = (int)4957268749087746561L;
         var18 = 952514550;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = -1522328074;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = -1374213426;
         var17 = 1335722778;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = -511037993;
         var17 = var10003;
         var222[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         var10002 = (int)1648716431806392698L;
         var18 = 410735548;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = 491797188;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = 519009183;
         var17 = 89159481;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = 465535989;
         var17 = var10003;
         var222[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var10002 = (int)-6258431266493810943L;
         var18 = -1209392710;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = 1117394616;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = 715400534;
         var17 = 1829408822;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = 1202621794;
         var17 = var10003;
         var222[var10002] = (char)((var17 | var18) - (var17 & var18));
         var10002 = (int)2434355660293785226L;
         var18 = -790431195;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = -1809367893;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = -1873061394;
         var17 = -993200550;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = 1419220980;
         var17 = var10003;
         var222[var10002] = (char)((var17 | var18) & ~(var17 & var18));
         var10002 = (int)7164806541077680747L;
         var18 = -986925888;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = 1484269230;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = 738713817;
         var17 = -1957607966;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = -1487495761;
         var17 = var10003;
         var222[var10002] = (char)((var17 | var18) - (var17 & var18));
         var18 = 905247833;
         var17 = -441179071;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = -801056738;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var10003 = (int)-3588846671348668550L;
         var18 = 1094620285;
         var17 = var10003;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = -908757954;
         var17 = var10003;
         var222[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var18 = -429522810;
         var17 = -1552886814;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = 1159123811;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = -716009433;
         var17 = 665184038;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = -218667207;
         var17 = var10003;
         var222[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var18 = -2035437950;
         var17 = 1952519391;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = -221463979;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var10003 = (int)5091407162213378117L;
         var18 = 458766949;
         var17 = var10003;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = -1245507292;
         var17 = var10003;
         var222[var10002] = (char)((var17 | var18) & ~(var17 & var18));
         var10002 = (int)1209971795651608707L;
         var18 = 1062922517;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = -1017861729;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var10003 = (int)-5238440705257517342L;
         var18 = -179298988;
         var17 = var10003;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = 796778629;
         var17 = var10003;
         var222[var10002] = (char)((var17 | var18) - (var17 & var18));
         char[] var9 = var222;
         var10000 = (int)-1761013786232047865L;
         var18 = 981359336;
         var17 = var10000;
         var10000 = (var17 | var18) - (var17 & var18);
         var18 = -1855132177;
         var17 = var10000;

         for (int var10 = (var17 | var18) & ~(var17 & var18); var10 < var6.length; var10++) {
            char var277 = var6[var10];
            char var205 = var8[var10 % var8.length];
            char var106 = var277;
            var7[var10] = (char)(var106 + var205 - 2 * (var106 & var205));
         }

         char[] var19 = new char[var7.length];
         var10000 = (int)8099057859299325666L;
         var18 = -315596478;
         var17 = var10000;
         var10000 = (var17 | var18) & (~var17 | ~var18);
         var18 = -1276160096;
         var17 = var10000;

         for (int var11 = (var17 | var18) - (var17 & var18); var11 < var6.length; var11++) {
            char var278 = var7[var11];
            char var208 = var9[var11 % var9.length];
            char var109 = var278;
            var19[var11] = (char)((var109 | var208) - (var109 & var208));
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
         var18 = -1986616145;
         var17 = 897730020;
         var10000 = (var17 | var18) & ~(var17 & var18);
         var18 = -1139482293;
         var17 = var10000;

         for (int var16 = var17 & ~var18 | ~var17 & var18; var16 < var15.length; var16++) {
            var18 = 1518074309;
            var17 = 220799417;
            int var10001 = (var17 | var18) & (~var17 | ~var18);
            var18 = 1465047166;
            var17 = var10001;
            switch (var16 % (var17 & ~var18 | ~var17 & var18)) {
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
                  var10002 = (var17 | var18) & (~var17 | ~var18);
                  char var216 = var14[var16];
                  var17 = var10002;
                  var15[var16] = (char)((var17 | var216) - (var17 & var216));
            }
         }

         return new String(var15);
      }
   }
}
