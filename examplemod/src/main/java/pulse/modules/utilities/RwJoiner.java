package pulse;



import pulse.module.ClientModule;
import pulse.module.ModuleInfo;
import pulse.module.ModuleCategory;
import pulse.settings.TokenSetting;
import java.util.List;
import java.util.Optional;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.packet.s2c.play.CloseScreenS2CPacket;
import net.minecraft.network.packet.s2c.play.GameMessageS2CPacket;
import net.minecraft.network.packet.s2c.play.InventoryS2CPacket;
import net.minecraft.network.packet.s2c.play.OpenScreenS2CPacket;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import ru.pulse.mixin.accessor.CloseScreenS2CPacketAccessor;
import ru.pulse.mixin.accessor.PlayerListHudAccessor;

@ModuleInfo(a = "RW Joiner", b = "Автоматически подключается к выбранному грифу ReallyWorld", c = ModuleCategory.UTILITIES)
public class RwJoiner extends ClientModule {
   private final TokenSetting e;
   private static final String f = "ГРИФЕРСКОЕ ВЫЖИВАНИЕ (1.16.5-1.20.4)";
   private static final int g = 5000;
   private final ElapsedTimer h;
   private int i;
   private String j;
   private boolean k;
   private boolean l;
   private boolean m;
   private List<ItemStack> n;
   private int o;
   private long p;
   private static final long q = 100L;
   private static final long r = 1000L;
   private boolean s;
   private long t;
   private long u;
   private static final long v = 3000L;
   public static int a;
   public static boolean b;

   public RwJoiner() {
      int var2 = 1364270201;
      int var1 = 398365155;
      int var10003 = (var1 | var2) - (var1 & var2);
      var2 = 1330877211;
      var1 = var10003;
      var10003 = var1 + var2 - 2 * (var1 & var2);
      int var10004 = (int)-8753471329866492151L;
      var2 = 1421066151;
      var1 = var10004;
      var10004 = var1 & ~var2 | ~var1 & var2;
      var2 = -1759637527;
      var1 = var10004;
      var2 = (var1 | var2) & (~var1 | ~var2);
      var1 = var10003;
      var10003 = 2 * (var1 | var2) - (var1 ^ var2);
      int var10005 = (int)-9220055353475412989L;
      var2 = 844329929;
      var1 = var10005;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1258569785;
      var1 = var10005;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var2 = 21509374;
      var1 = 666857968;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = 1921880514;
      var1 = var10005;
      var10005 = ((var1 | var2) & ~(var1 & var2)) * ((var1 | var2) & ~(var1 & var2));
      var10005 = (int)-5875110716028657421L;
      var2 = 747684760;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var2 = 826075824;
      var1 = var10005;
      var10005 = (var1 | var2) - (var1 & var2);
      var2 = -1964426015;
      var1 = -60984112;
      int var10006 = var1 & ~var2 | ~var1 & var2;
      var2 = 804978560;
      var1 = var10006;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var10006 = (int)-8741526100397892581L;
      var2 = -407562710;
      var1 = var10006;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1170029699;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var2 = -798906275;
      var1 = 946437357;
      int var10007 = (var1 | var2) & ~(var1 & var2);
      var2 = 186183212;
      var1 = var10007;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var10007 = (int)6906082581470253513L;
      var2 = 699838154;
      var1 = var10007;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var2 = -1472928258;
      var1 = var10007;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var2 = -279228989;
      var1 = 2143327804;
      int var10008 = (var1 | var2) & (~var1 | ~var2);
      var2 = 755619604;
      var1 = var10008;
      var10008 = ((var1 | var2) - (var1 & var2)) * ((var1 | var2) - (var1 & var2));
      var2 = 521117520;
      var1 = 1662501851;
      var10008 = var1 + var2 - 2 * (var1 & var2);
      var2 = 2082365556;
      var1 = var10008;
      String var258 = c(
         "侴㪳侕㪸俩㺭侚㫍侑㫉侙", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7d4ꒂꁛꤊ絿蹄⑿謥㑚}\ua7e2꒠ꁽ꤀", var10005, var10006, var10007, var1 & ~var2 | ~var1 & var2
      );
      TokenSetting.TokenType var265 = TokenSetting.TokenType.NUMBER;
      var10005 = (int)5912696298417933528L;
      var2 = -868706539;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var2 = 676868008;
      var1 = var10005;
      var10005 = (var1 + var2 - 2 * (var1 & var2)) * (var1 + var2 - 2 * (var1 & var2));
      var10006 = (int)5578925137172078435L;
      var2 = -753616923;
      var1 = var10006;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var2 = -7854477;
      var1 = var10006;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var10007 = (int)-9154762545297709509L;
      var2 = 1787602712;
      var1 = var10007;
      var10007 = (var1 | var2) & (~var1 | ~var2);
      var2 = -742360135;
      var1 = var10007;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var2 = -837324834;
      var1 = 29941261;
      var10008 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1882560798;
      var1 = var10008;
      var2 = var1 & ~var2 | ~var1 & var2;
      var1 = var10007;
      var10007 = var1 - ~var2 - 1;
      var10007 = (int)-3684164804886362097L;
      var2 = -1165141294;
      var1 = var10007;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var2 = -219899130;
      var1 = var10007;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var10008 = (int)-3256279862401428787L;
      var2 = 1201602234;
      var1 = var10008;
      var10008 = var1 & ~var2 | ~var1 & var2;
      var2 = -1385955965;
      var1 = var10008;
      var10008 = ((var1 | var2) & ~(var1 & var2)) * ((var1 | var2) & ~(var1 & var2));
      var10008 = (int)521368025204156909L;
      var2 = -308083236;
      var1 = var10008;
      var10008 = (var1 | var2) - (var1 & var2);
      var2 = -717618104;
      var1 = var10008;
      var10008 = var1 + var2 - 2 * (var1 & var2);
      var2 = 989708374;
      var1 = 288242729;
      int var10010 = var1 + var2 - 2 * (var1 & var2);
      var2 = 735313004;
      var1 = var10010;
      var10010 = (var1 | var2) & ~(var1 & var2);
      var2 = 339203707;
      var1 = 1360405792;
      var10010 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1159852884;
      var1 = var10010;
      var10010 = var1 & ~var2 | ~var1 & var2;
      var2 = 867883647;
      var1 = 262124760;
      var10010 = (var1 | var2) - (var1 & var2);
      var2 = 1009086120;
      var1 = var10010;
      var10010 = var1 + var2 - 2 * (var1 & var2);
      int var10009 = (int)4301495156517889223L;
      var2 = 1292626501;
      var1 = var10009;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var2 = -1410266082;
      var1 = var10009;
      var10009 = (var1 | var2) & (~var1 | ~var2);
      int var10011 = (int)5655513383474148753L;
      var2 = -1898809037;
      var1 = var10011;
      var10011 = (var1 | var2) & (~var1 | ~var2);
      var2 = -895234905;
      var1 = var10011;
      var10011 = (var1 | var2) - (var1 & var2);
      var2 = 1219361002;
      var1 = 762255011;
      var10011 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1707273793;
      var1 = var10011;
      var10011 = (var1 | var2) & (~var1 | ~var2);
      var10011 = (int)-637899141215986502L;
      var2 = 1588692563;
      var1 = var10011;
      var10011 = var1 + var2 - 2 * (var1 & var2);
      var2 = 66771680;
      var1 = var10011;
      var10011 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1835441538;
      var1 = -117718786;
      var10010 = (var1 | var2) - (var1 & var2);
      var2 = -1785642672;
      var1 = var10010;
      String var280 = c("䮘", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7d4ꒂꁛꤊ絿蹄⑿謥㑚}\ua7e2꒠ꁽ꤀", var10007, var10008, var10009, (var1 | var2) - (var1 & var2));
      var10006 = (int)8337571416629719854L;
      var2 = 1663092115;
      var1 = var10006;
      var10006 = (var1 | var2) - (var1 & var2);
      var2 = 660134865;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var2 = 737654425;
      var1 = -1134839321;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var2 = -1408366566;
      var1 = var10007;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      var10008 = (int)7310530844821209630L;
      var2 = 730629475;
      var1 = var10008;
      var10008 = var1 + var2 - 2 * (var1 & var2);
      var2 = -702529677;
      var1 = var10008;
      var2 = (var1 | var2) & ~(var1 & var2);
      var1 = var10007;
      var10007 = (var1 | var2) + (var1 & var2);
      var2 = 934748702;
      var1 = 1110004732;
      var10008 = (var1 | var2) & ~(var1 & var2);
      var2 = 665350603;
      var1 = var10008;
      var10008 = (var1 | var2) - (var1 & var2);
      var2 = 922290263;
      var1 = 1762195384;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var2 = -1988193070;
      var1 = var10009;
      var2 = var1 & ~var2 | ~var1 & var2;
      var1 = var10008;
      var10008 = (var1 | var2) + (var1 & var2);
      var2 = 1322613893;
      var1 = 1608642192;
      var10008 = (var1 | var2) & ~(var1 & var2);
      var2 = 2141051854;
      var1 = var10008;
      var10008 = (var1 | var2) - (var1 & var2);
      var10009 = (int)-5456759270704106294L;
      var2 = -1914948245;
      var1 = var10009;
      var10009 = (var1 | var2) - (var1 & var2);
      var2 = -430698339;
      var1 = var10009;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var10009 = (int)-3781063059134534875L;
      var2 = -945040092;
      var1 = var10009;
      var10009 = (var1 | var2) & ~(var1 & var2);
      var2 = 570651912;
      var1 = var10009;
      var10009 = var1 + var2 - 2 * (var1 & var2);
      var10010 = (int)8437720742732278138L;
      var2 = -1935187009;
      var1 = var10010;
      var10010 = (var1 | var2) - (var1 & var2);
      var2 = -1878156775;
      var1 = var10010;
      var10010 = ((var1 | var2) & (~var1 | ~var2)) * ((var1 | var2) & (~var1 | ~var2));
      var2 = 1893284234;
      var1 = -226621606;
      var10010 = (var1 | var2) & ~(var1 & var2);
      var2 = -2134853633;
      var1 = var10010;
      var10010 = (var1 | var2) & (~var1 | ~var2);
      var2 = 21289499;
      var1 = -1794729741;
      var10011 = (var1 | var2) & ~(var1 & var2);
      var2 = -820617341;
      var1 = var10011;
      var10011 = (var1 & ~var2 | ~var1 & var2) * (var1 & ~var2 | ~var1 & var2);
      var10011 = (int)8981345864720785236L;
      var2 = 260396830;
      var1 = var10011;
      var10011 = (var1 | var2) - (var1 & var2);
      var2 = -2141292810;
      var1 = var10011;
      this.e = new TokenSetting(
         var258,
         var265,
         var280,
         c("侻㣼侜㣺侑㢌侜㳮侔㣰侕㣻俩", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7d4ꒂꁛꤊ絿蹄⑿謥㑚}\ua7e2꒠ꁽ꤀", var10008, var10009, var10010, var1 + var2 - 2 * (var1 & var2))
      );
      this.h = new ElapsedTimer();
      var2 = 710553960;
      var1 = -2146697811;
      int var10001 = var1 & ~var2 | ~var1 & var2;
      var2 = 1437479738;
      var1 = var10001;
      this.i = var1 & ~var2 | ~var1 & var2;
      int var10002 = (int)8856661599438477364L;
      var2 = -1122248335;
      var1 = var10002;
      var10002 = var1 & ~var2 | ~var1 & var2;
      var2 = 1866744132;
      var1 = var10002;
      var10002 = var1 + var2 - 2 * (var1 & var2);
      var10002 = (int)8917635975922930562L;
      var2 = -1724613607;
      var1 = var10002;
      var10002 = var1 & ~var2 | ~var1 & var2;
      var2 = -1139462254;
      var1 = var10002;
      var10002 = (var1 | var2) & ~(var1 & var2);
      String var255 = "drr";
      var2 = 1002252259;
      var1 = -984115039;
      var10003 = (var1 | var2) - (var1 & var2);
      var2 = 76763746;
      var1 = var10003;
      var10003 = (var1 | var2) & (~var1 | ~var2);
      var10004 = (int)-6727822882391815336L;
      var2 = -1184352285;
      var1 = var10004;
      var10004 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1333047104;
      var1 = var10004;
      var2 = var1 + var2 - 2 * (var1 & var2);
      var1 = var10003;
      var10003 = (var1 | var2) + (var1 & var2);
      var2 = 1485857338;
      var1 = 293962551;
      var10003 = (var1 | var2) & (~var1 | ~var2);
      var2 = 666675414;
      var1 = var10003;
      var10003 = (var1 | var2) & (~var1 | ~var2);
      var10005 = (int)-5065066944161049801L;
      var2 = -453836833;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = -649597725;
      var1 = var10005;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = -1061536686;
      var1 = 188775589;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = -872791835;
      var1 = var10005;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = 1272334737;
      var1 = -1927633305;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = -959647753;
      var1 = var10005;
      var10005 = (var1 | var2) - (var1 & var2);
      var2 = -455171160;
      var1 = 2009748142;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1827344122;
      var1 = var10005;
      var10005 = (var1 | var2) - (var1 & var2);
      var10005 = (int)-4364571686222718510L;
      var2 = -518937584;
      var1 = var10005;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = -454672946;
      var1 = var10005;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1098950144;
      var1 = 1369703972;
      var10004 = var1 + var2 - 2 * (var1 & var2);
      var2 = 885041373;
      var1 = var10004;
      var10004 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1419748546;
      var1 = 1076979015;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1717280255;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var10005 = (int)-6824507555586420790L;
      var2 = -442762445;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1065886062;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      String var308 = "drs";
      var10006 = (int)-1877328357927638857L;
      var2 = -353350735;
      var1 = var10006;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var2 = -133149782;
      var1 = var10006;
      this.j = c("", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7d4ꒂꁛꤊ絿蹄⑿謥㑚}\ua7e2꒠ꁽ꤀", var10003, var10004, var10005, var1 & ~var2 | ~var1 & var2);
      var2 = 664661764;
      var1 = -1816547824;
      var10001 = (var1 | var2) - (var1 & var2);
      var2 = -1272692460;
      var1 = var10001;
      this.k = pulse.Bool.from((var1 | var2) & (~var1 | ~var2));
      var10001 = (int)-2720112802902917666L;
      var2 = -365564785;
      var1 = var10001;
      var10001 = (var1 | var2) & ~(var1 & var2);
      var2 = -1546694319;
      var1 = var10001;
      this.l = pulse.Bool.from((var1 | var2) & (~var1 | ~var2));
      var10001 = (int)-2950303299985541870L;
      var2 = -1594351562;
      var1 = var10001;
      var10001 = var1 + var2 - 2 * (var1 & var2);
      var2 = 273339684;
      var1 = var10001;
      this.m = pulse.Bool.from(var1 & ~var2 | ~var1 & var2);
      var2 = 1002266267;
      var1 = 442598001;
      var10001 = var1 + var2 - 2 * (var1 & var2);
      var2 = 568122602;
      var1 = var10001;
      this.o = var1 + var2 - 2 * (var1 & var2);
      this.p = 0L;
      var2 = -1439425864;
      var1 = 45114977;
      var10001 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1467712295;
      var1 = var10001;
      this.s = pulse.Bool.from(var1 + var2 - 2 * (var1 & var2));
      this.t = 0L;
      this.u = 0L;
   }

   @EventHandler
   public void a(ClientTickEvent var1) {
      if (c.player != null && c.world != null) {
         if (this.q()) {
            if (!this.l) {
               if (!this.k && !this.s) {
                  if (this.t > 0L) {
                     long var10000 = System.currentTimeMillis() - this.t;
                     String var10001 = "drt";
                     if (var10000 > 1000L) {
                        this.t = 0L;
                     }
                  }

                  this.n();
               }
            } else {
               long var2 = this.h.a();
               int var12 = (int)5908181586801270610L;
               int var5 = -951156202;
               int var4 = var12;
               var12 = (var4 | var5) & ~(var4 & var5);
               var5 = -2089170720;
               var4 = var12;
               var12 = ((var4 | var5) & (~var4 | ~var5)) * ((var4 | var5) & (~var4 | ~var5));
               if (var2 >= 5000L) {
                  var5 = -251805978;
                  var4 = 1894550198;
                  var12 = var4 + var5 - 2 * (var4 & var5);
                  var5 = -2146356144;
                  var4 = var12;
                  this.l = pulse.Bool.from(var4 & ~var5 | ~var4 & var5);
                  this.p();
                  this.t = 0L;
                  this.n();
               }
            }
         }
      }
   }

   private void n() {
      long var10000 = System.currentTimeMillis() - this.p;
      int var6 = -1339720875;
      int var5 = -469755807;
      int var10001 = (var5 | var6) & ~(var5 & var6);
      var6 = 1514783516;
      var5 = var10001;
      var10001 = ((var5 | var6) & (~var5 | ~var6)) * ((var5 | var6) & (~var5 | ~var6));
      if (var10000 >= 100L) {
         if (this.t > 0L) {
            var10000 = System.currentTimeMillis() - this.t;
            var10001 = (int)-7794291889790762264L;
            var6 = -1389470592;
            var5 = var10001;
            var10001 = (var5 | var6) - (var5 & var6);
            var6 = -769046527;
            var5 = var10001;
            var10001 = ((var5 | var6) & (~var5 | ~var6)) * ((var5 | var6) & (~var5 | ~var6));
            if (var10000 < 1000L) {
               return;
            }
         }

         if (this.u <= 0L) {
            if (b) {
               String var32 = "dru";
               int var33 = (int)1784228574739358932L;
               var6 = -1726635313;
               var5 = var33;
               int var34 = var5 + var6 - 2 * (var5 & var6);
               var6 = -1505671752;
               var5 = var34;
               int var4 = (var5 | var6) & ~(var5 & var6);
               a = var4;
            }
         } else {
            var10000 = System.currentTimeMillis() - this.u;
            var6 = 1288603687;
            var5 = 871647609;
            var10001 = var5 & ~var6 | ~var5 & var6;
            var6 = 356030671;
            var5 = var10001;
            var10001 = (var5 | var6) & (~var5 | ~var6);
            int var10002 = (int)-8577557444255279640L;
            var6 = 246088859;
            var5 = var10002;
            var10002 = var5 & ~var6 | ~var5 & var6;
            var6 = -1697023997;
            var5 = var10002;
            var6 = (var5 | var6) & (~var5 | ~var6);
            var5 = var10001;
            var10001 = (var5 | var6) + (var5 & var6);
            if (var10000 < 3000L) {
               return;
            }
         }

         Optional var1 = this.a(Items.COMPASS);
         if (var1.isPresent()) {
            int var2 = (Integer)var1.get();
            if (c.player.getInventory().selectedSlot == var2) {
               c.interactionManager.interactItem(c.player, Hand.MAIN_HAND);
               this.p = System.currentTimeMillis();
               this.t = System.currentTimeMillis();
               var6 = 318138785;
               var5 = 2003708653;
               var10001 = (var5 | var6) & ~(var5 & var6);
               var6 = 1704477517;
               var5 = var10001;
               this.s = pulse.Bool.from((var5 | var6) - (var5 & var6));
            } else {
               c.player.getInventory().selectedSlot = var2;
            }
         }
      }
   }

   private Optional<Integer> a(Item var1) {
      int var5 = 11114981;
      int var4 = 1497385906;
      int var10000 = var4 & ~var5 | ~var4 & var5;
      var5 = 1508495959;
      var4 = var10000;
      int var2 = var4 & ~var5 | ~var4 & var5;

      while (true) {
         int var10001 = (int)-1836261486512873416L;
         var5 = 177405968;
         var4 = var10001;
         var10001 = (var4 | var5) - (var4 & var5);
         var5 = 658006049;
         var4 = var10001;
         if (var2 >= ((var4 | var5) & (~var4 | ~var5))) {
            return Optional.empty();
         }

         ItemStack var3 = c.player.getInventory().getStack(var2);
         if (!var3.isEmpty() && var3.getItem() == var1) {
            return Optional.of(var2);
         }

         var2++;
      }
   }

   private void o() {
      if (this.n != null && !this.n.isEmpty()) {
         long var10000 = System.currentTimeMillis() - this.p;
         int var10001 = (int)-1283000929274469873L;
         int var7 = -1155788760;
         int var6 = var10001;
         var10001 = var6 + var7 - 2 * (var6 & var7);
         var7 = 503062672;
         var6 = var10001;
         var10001 = var6 & ~var7 | ~var6 & var7;
         if (var10000 >= 100L) {
            var10001 = (int)-3099544229481091302L;
            var7 = 1885142924;
            var6 = var10001;
            var10001 = (var6 | var7) & (~var6 | ~var7);
            var7 = 555841055;
            var6 = var10001;
            var10001 = (var6 + var7 - 2 * (var6 & var7)) * (var6 + var7 - 2 * (var6 & var7));
            int var10002 = (int)-5656824758913326488L;
            var7 = 1993643768;
            var6 = var10002;
            var10002 = (var6 | var7) & ~(var6 & var7);
            var7 = 595178729;
            var6 = var10002;
            var10002 = (var6 | var7) - (var6 & var7);
            var7 = 1227263941;
            var6 = -27817440;
            int var10003 = (var6 | var7) - (var6 & var7);
            var7 = 1026375758;
            var6 = var10003;
            var10003 = (var6 | var7) & ~(var6 & var7);
            var7 = 165404533;
            var6 = -613899320;
            int var10004 = (var6 | var7) & (~var6 | ~var7);
            var7 = -1581885084;
            var6 = var10004;
            var7 = (var6 | var7) - (var6 & var7);
            var6 = var10003;
            var10003 = var6 - ~var7 - 1;
            var7 = 1204874183;
            var6 = -254820428;
            var10003 = (var6 | var7) & ~(var6 & var7);
            var7 = -642376280;
            var6 = var10003;
            var10003 = var6 + var7 - 2 * (var6 & var7);
            String var318 = "drv";
            var10004 = (int)352346529133860182L;
            var7 = -24405401;
            var6 = var10004;
            var10004 = (var6 | var7) & ~(var6 & var7);
            var7 = -697336362;
            var6 = var10004;
            var10004 = (var6 | var7) & (~var6 | ~var7);
            int var10005 = (int)-5894870902790349210L;
            var7 = -1466954592;
            var6 = var10005;
            var10005 = (var6 | var7) - (var6 & var7);
            var7 = 1816204538;
            var6 = var10005;
            var10005 = (var6 + var7 - 2 * (var6 & var7)) * (var6 + var7 - 2 * (var6 & var7));
            var7 = 486607596;
            var6 = 1178830227;
            var10005 = (var6 | var7) & (~var6 | ~var7);
            var7 = 1448521204;
            var6 = var10005;
            var10005 = (var6 | var7) - (var6 & var7);
            var7 = -652783339;
            var6 = 1191290566;
            int var10006 = var6 + var7 - 2 * (var6 & var7);
            var7 = -1649372008;
            var6 = var10006;
            var10006 = (var6 | var7) - (var6 & var7);
            var10006 = (int)-7675074566676750371L;
            var7 = 548823288;
            var6 = var10006;
            var10006 = var6 & ~var7 | ~var6 & var7;
            var7 = -1407042016;
            var6 = var10006;
            if (this.j
               .contains(
                  c(
                     "\ue5ceⵉ\ue5edⴼ\ue59c⤢\ue59dⴷ\ue59cⴰ\ue5e9ⵂ\ue5ec",
                     "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7d4ꒂꁛꤊ絿蹄⑿謥㑚}\ua7e2꒠ꁽ꤀",
                     var10003,
                     var10004,
                     var10005,
                     (var6 | var7) & ~(var6 & var7)
                  )
               )) {
               if (!this.m) {
                  String var280 = "drw";
                  String var296 = "drx";
                  var10004 = (int)-2309674518548043661L;
                  var7 = -217223784;
                  var6 = var10004;
                  var10004 = var6 + var7 - 2 * (var6 & var7);
                  var7 = -1004452369;
                  var6 = var10004;
                  var10004 = (var6 | var7) & ~(var6 & var7);
                  var10004 = (int)2310494190037546971L;
                  var7 = -2129362073;
                  var6 = var10004;
                  var10004 = var6 & ~var7 | ~var6 & var7;
                  var7 = -304204620;
                  var6 = var10004;
                  var10004 = (var6 | var7) - (var6 & var7);
                  var10004 = (int)-1413354842441262039L;
                  var7 = -686565461;
                  var6 = var10004;
                  var10004 = (var6 | var7) & (~var6 | ~var7);
                  var7 = -2052715630;
                  var6 = var10004;
                  var10004 = (var6 | var7) & (~var6 | ~var7);
                  var10003 = (int)4040264739723890956L;
                  var7 = 76425459;
                  var6 = var10003;
                  var10003 = (var6 | var7) - (var6 & var7);
                  var7 = -1948241884;
                  var6 = var10003;
                  var10003 = (var6 | var7) & ~(var6 & var7);
                  var7 = -482109104;
                  var6 = -1291955867;
                  var10004 = var6 + var7 - 2 * (var6 & var7);
                  var7 = -502631987;
                  var6 = var10004;
                  var10004 = (var6 + var7 - 2 * (var6 & var7)) * (var6 + var7 - 2 * (var6 & var7));
                  var7 = 1023391362;
                  var6 = -1159662655;
                  var10004 = var6 & ~var7 | ~var6 & var7;
                  var7 = -2074461991;
                  var6 = var10004;
                  var10004 = (var6 | var7) - (var6 & var7);
                  var7 = -301709584;
                  var6 = -1955891738;
                  var10005 = (var6 | var7) - (var6 & var7);
                  var7 = -1436059026;
                  var6 = var10005;
                  var10005 = ((var6 | var7) & (~var6 | ~var7)) * ((var6 | var7) & (~var6 | ~var7));
                  var7 = 1940329546;
                  var6 = 1504095659;
                  var10005 = var6 & ~var7 | ~var6 & var7;
                  var7 = 1042459155;
                  var6 = var10005;
                  var10005 = var6 + var7 - 2 * (var6 & var7);
                  var7 = -742384684;
                  var6 = -97052346;
                  var10006 = (var6 | var7) & ~(var6 & var7);
                  var7 = 41373469;
                  var6 = var10006;
                  var10006 = (var6 | var7) & (~var6 | ~var7);
                  var10006 = (int)-6186459037231104528L;
                  var7 = 1524098116;
                  var6 = var10006;
                  var10006 = var6 + var7 - 2 * (var6 & var7);
                  var7 = 916115980;
                  var6 = var10006;
                  int var8 = this.b(
                     c(
                        "\ue5cf➟\ue5c4➛\ue5c9➟\ue5fd➥\ue5c2➪\ue1fc➭\ue5f7➩\ue5c4➭\ue5cc➢\ue5c4➪\ue1fc⎗\ue1ed⎑\ue1ed⎉\ue1f2⎊\ue1f1⎎\ue1f2⎍\ue1ec⎑\ue1e8⎖",
                        "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7d4ꒂꁛꤊ絿蹄⑿謥㑚}\ua7e2꒠ꁽ꤀",
                        var10003,
                        var10004,
                        var10005,
                        var6 + var7 - 2 * (var6 & var7)
                     )
                  );
                  var7 = -901079691;
                  var6 = -1127007561;
                  var10001 = (var6 | var7) - (var6 & var7);
                  var7 = -1989781443;
                  var6 = var10001;
                  if (var8 == (var6 & ~var7 | ~var6 & var7)) {
                     int var257 = (int)-1601389870570852922L;
                     var7 = 1442875502;
                     var6 = var257;
                     int var258 = (var6 | var7) & (~var6 | ~var7);
                     var7 = -32691551;
                     var6 = var258;
                     int var259 = var6 & ~var7 | ~var6 & var7;
                     var10001 = (int)-699033232905909171L;
                     var7 = 1154029486;
                     var6 = var10001;
                     var10001 = var6 + var7 - 2 * (var6 & var7);
                     var7 = 1184525986;
                     var6 = var10001;
                     var7 = (var6 | var7) & (~var6 | ~var7);
                     var6 = var259;
                     int var260 = 2 * (var6 | var7) - (var6 ^ var7);
                     var7 = 1039401829;
                     var6 = 2003276780;
                     int var261 = (var6 | var7) & (~var6 | ~var7);
                     var7 = 1592959136;
                     var6 = var261;
                     int var9 = var6 + var7 - 2 * (var6 & var7);
                     a = var9;
                     int var262 = (int)-2170057133074741776L;
                     var7 = -2064625164;
                     var6 = var262;
                     int var263 = (var6 | var7) - (var6 & var7);
                     var7 = 1307743767;
                     var6 = var263;
                     int var264 = (var6 & ~var7 | ~var6 & var7) * (var6 & ~var7 | ~var6 & var7);
                     int var265 = (int)-8158049423099946200L;
                     var7 = 135351054;
                     var6 = var265;
                     int var266 = (var6 | var7) & ~(var6 & var7);
                     var7 = -21125631;
                     var6 = var266;
                     if (var6 + var7 - 2 * (var6 & var7) < a) {
                        throw new RuntimeException();
                     }

                     this.p();
                     this.d();
                  } else {
                     var10003 = (int)-2893447666309689823L;
                     var7 = 354557086;
                     var6 = var10003;
                     var10003 = (var6 | var7) - (var6 & var7);
                     var7 = 1817154239;
                     var6 = var10003;
                     c.interactionManager.clickSlot(this.i, var8, (var6 | var7) - (var6 & var7), SlotActionType.PICKUP, c.player);
                     var10001 = (int)-6273266577452054126L;
                     var7 = 1865506617;
                     var6 = var10001;
                     var10001 = (var6 | var7) & (~var6 | ~var7);
                     var7 = -1701669206;
                     var6 = var10001;
                     this.m = pulse.Bool.from((var6 | var7) & ~(var6 & var7));
                     this.p = System.currentTimeMillis();
                  }

                  return;
               }

               if (b) {
                  int var250 = (int)-4839096403616337005L;
                  var7 = -1774267228;
                  var6 = var250;
                  int var251 = var6 + var7 - 2 * (var6 & var7);
                  var7 = 836005777;
                  var6 = var251;
                  int var252 = ((var6 | var7) - (var6 & var7)) * ((var6 | var7) - (var6 & var7));
                  int var253 = (int)8258892915238418864L;
                  var7 = 867546660;
                  var6 = var253;
                  int var254 = (var6 | var7) & ~(var6 & var7);
                  var7 = 416258329;
                  var6 = var254;
                  int var5 = (var6 | var7) & ~(var6 & var7);
               }
            }

            String var255 = this.j;
            var10001 = (int)-33916511618908018L;
            var7 = -749763239;
            var6 = var10001;
            var10001 = var6 & ~var7 | ~var6 & var7;
            var7 = -1819162606;
            var6 = var10001;
            var10001 = (var6 | var7) - (var6 & var7);
            var10002 = (int)2856490550957535114L;
            var7 = -731563649;
            var6 = var10002;
            var10002 = (var6 | var7) - (var6 & var7);
            var7 = 1157767656;
            var6 = var10002;
            var7 = var6 + var7 - 2 * (var6 & var7);
            var6 = var10001;
            var10001 = 2 * (var6 | var7) - (var6 ^ var7);
            String var290 = "dry";
            var10003 = (int)-2582057278337647180L;
            var7 = 359763591;
            var6 = var10003;
            var10003 = (var6 | var7) & (~var6 | ~var7);
            var7 = 1362142685;
            var6 = var10003;
            var10003 = var6 & ~var7 | ~var6 & var7;
            var7 = -426195137;
            var6 = 1869352906;
            var10003 = (var6 | var7) & (~var6 | ~var7);
            var7 = -413302482;
            var6 = var10003;
            var10003 = (var6 | var7) - (var6 & var7);
            var10005 = (int)-5974767332359593736L;
            var7 = -1194848015;
            var6 = var10005;
            var10005 = (var6 | var7) & ~(var6 & var7);
            var7 = -338612214;
            var6 = var10005;
            var10005 = (var6 | var7) & (~var6 | ~var7);
            var7 = -144783168;
            var6 = -1992534606;
            var10005 = var6 & ~var7 | ~var6 & var7;
            var7 = 2120392051;
            var6 = var10005;
            var10005 = var6 + var7 - 2 * (var6 & var7);
            var7 = 963065505;
            var6 = -1453683247;
            var10004 = (var6 | var7) - (var6 & var7);
            var7 = -1840674153;
            var6 = var10004;
            var10004 = (var6 | var7) - (var6 & var7);
            var7 = 1890337596;
            var6 = -1367547436;
            var10005 = (var6 | var7) & ~(var6 & var7);
            var7 = 1633398673;
            var6 = var10005;
            var10005 = (var6 + var7 - 2 * (var6 & var7)) * (var6 + var7 - 2 * (var6 & var7));
            var10005 = (int)3849797362652745835L;
            var7 = -451097902;
            var6 = var10005;
            var10005 = (var6 | var7) & (~var6 | ~var7);
            var7 = 373625624;
            var6 = var10005;
            var10005 = var6 + var7 - 2 * (var6 & var7);
            int var10007 = (int)-7437663301524408745L;
            var7 = -1274295975;
            var6 = var10007;
            var10007 = var6 + var7 - 2 * (var6 & var7);
            var7 = -1918468323;
            var6 = var10007;
            var10007 = (var6 | var7) & (~var6 | ~var7);
            var7 = -375791958;
            var6 = 318581289;
            var10007 = (var6 | var7) & (~var6 | ~var7);
            var7 = -77269881;
            var6 = var10007;
            var10007 = (var6 | var7) & (~var6 | ~var7);
            var7 = -1203560707;
            var6 = 1100971945;
            var10007 = var6 + var7 - 2 * (var6 & var7);
            var7 = -102997680;
            var6 = var10007;
            var10007 = var6 & ~var7 | ~var6 & var7;
            var7 = 965683136;
            var6 = 378299674;
            var10006 = var6 & ~var7 | ~var6 & var7;
            var7 = 792986335;
            var6 = var10006;
            if (var255.contains(
                  c(
                     "\ue5ce\uec49\ue5ed\uec3c\ue59c\ue822\ue5e0\uec3a\ue59c\uec32\ue1fc\uec31\ue59c\uec3a\ue598\uec32",
                     "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7d4ꒂꁛꤊ絿蹄⑿謥㑚}\ua7e2꒠ꁽ꤀",
                     var10003,
                     var10004,
                     var10005,
                     var6 & ~var7 | ~var6 & var7
                  )
               )
               && this.m) {
               if (!this.e.d()) {
                  return;
               }

               int var3;
               try {
                  var3 = Integer.parseInt(this.e.k());
               } catch (NumberFormatException var278) {
                  return;
               }
               StringBuilder var256 = new StringBuilder();
               var10001 = (int)4786137225098887035L;
               var7 = 1743318114;
               var6 = var10001;
               var10001 = (var6 | var7) - (var6 & var7);
               var7 = 86324463;
               var6 = var10001;
               var10001 = var6 & ~var7 | ~var6 & var7;
               var10002 = (int)-8541853994674688917L;
               var7 = 354849968;
               var6 = var10002;
               var10002 = (var6 | var7) & (~var6 | ~var7);
               var7 = 378049576;
               var6 = var10002;
               var10002 = (var6 | var7) - (var6 & var7);
               var10003 = (int)-2404252758713721012L;
               var7 = -1469069155;
               var6 = var10003;
               var10003 = (var6 | var7) & (~var6 | ~var7);
               var7 = 1706861469;
               var6 = var10003;
               var10003 = (var6 | var7) & ~(var6 & var7);
               var7 = 203041943;
               var6 = -1934442361;
               var10004 = (var6 | var7) - (var6 & var7);
               var7 = 1987980152;
               var6 = var10004;
               var7 = var6 + var7 - 2 * (var6 & var7);
               var6 = var10003;
               var10003 = (var6 | var7) + (var6 & var7);
               var7 = -1859165815;
               var6 = -952573212;
               var10003 = (var6 | var7) - (var6 & var7);
               var7 = 952027830;
               var6 = var10003;
               var10003 = (var6 | var7) & ~(var6 & var7);
               var10004 = (int)-3641181120230544476L;
               var7 = 988098848;
               var6 = var10004;
               var10004 = var6 + var7 - 2 * (var6 & var7);
               var7 = -502697854;
               var6 = var10004;
               var10004 = var6 & ~var7 | ~var6 & var7;
               var10004 = (int)-405053004823189930L;
               var7 = 1206375520;
               var6 = var10004;
               var10004 = (var6 | var7) & (~var6 | ~var7);
               var7 = 1775455855;
               var6 = var10004;
               var10004 = (var6 | var7) - (var6 & var7);
               var10005 = (int)6751980735841266159L;
               var7 = 388867824;
               var6 = var10005;
               var10005 = var6 & ~var7 | ~var6 & var7;
               var7 = -1181821504;
               var6 = var10005;
               var10005 = var6 & ~var7 | ~var6 & var7;
               var7 = -688901005;
               var6 = -1784578104;
               var10005 = var6 & ~var7 | ~var6 & var7;
               var7 = 1584642911;
               var6 = var10005;
               var10005 = (var6 | var7) - (var6 & var7);
               var10006 = (int)8975692949888969178L;
               var7 = -1389465574;
               var6 = var10006;
               var10006 = var6 + var7 - 2 * (var6 & var7);
               var7 = -1073865822;
               var6 = var10006;
               var10006 = (var6 | var7) & ~(var6 & var7);
               var7 = 1864155918;
               var6 = -1494529551;
               var10006 = (var6 | var7) & (~var6 | ~var7);
               var7 = -910606200;
               var6 = var10006;
               String var1 = var256.append(
                     c(
                        "\ue5cf晐\ue5c4晔\ue1fc打",
                        "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7d4ꒂꁛꤊ絿蹄⑿謥㑚}\ua7e2꒠ꁽ꤀",
                        var10003,
                        var10004,
                        var10005,
                        (var6 | var7) - (var6 & var7)
                     )
                  )
                  .append(var3)
                  .toString();
               int var2 = this.b(var1);
               var7 = -228768127;
               var6 = 1767021829;
               var10001 = var6 & ~var7 | ~var6 & var7;
               var7 = 1693459579;
               var6 = var10001;
               if (var2 == (var6 | var7) - (var6 & var7)) {
                  this.p();
               } else {
                  var7 = 1649156289;
                  var6 = 1715366480;
                  var10003 = (var6 | var7) - (var6 & var7);
                  var7 = 74599057;
                  var6 = var10003;
                  c.interactionManager.clickSlot(this.i, var2, var6 & ~var7 | ~var6 & var7, SlotActionType.PICKUP, c.player);
                  var10002 = (int)1038163918504120154L;
                  var7 = 984302244;
                  var6 = var10002;
                  var10002 = (var6 | var7) - (var6 & var7);
                  var7 = 1740344831;
                  var6 = var10002;
                  var7 = (var6 | var7) - (var6 & var7);
                  var6 = this.o;
                  this.o = (var6 | var7) + (var6 & var7);
                  this.p = System.currentTimeMillis();
                  this.u = System.currentTimeMillis();
                  this.p();
               }
            }
         }
      }
   }

   private void a(String var1) {
      String var10000 = this.g();
      String var3 = var1;
      String var2 = var10000;
      StringBuilder var56 = new StringBuilder().append(var2);
      int var10001 = (int)5506361435006907600L;
      int var5 = -865852692;
      int var4 = var10001;
      var10001 = var4 + var5 - 2 * (var4 & var5);
      var5 = 1672282567;
      var4 = var10001;
      var10001 = (var4 | var5) & ~(var4 & var5);
      var5 = -1386508430;
      var4 = 42729998;
      int var10003 = var4 & ~var5 | ~var4 & var5;
      var5 = -1344828033;
      var4 = var10003;
      var10003 = var4 & ~var5 | ~var4 & var5;
      var5 = 475684572;
      var4 = -1919371070;
      var10003 = var4 + var5 - 2 * (var4 & var5);
      var5 = -1849498086;
      var4 = var10003;
      var10003 = var4 & ~var5 | ~var4 & var5;
      int var10004 = (int)1048369044297756921L;
      var5 = -1257422389;
      var4 = var10004;
      var10004 = (var4 | var5) & (~var4 | ~var5);
      var5 = -336629451;
      var4 = var10004;
      var10004 = var4 + var5 - 2 * (var4 & var5);
      var10004 = (int)-2372489138193201156L;
      var5 = 2129906051;
      var4 = var10004;
      var10004 = (var4 | var5) - (var4 & var5);
      var5 = -1703522697;
      var4 = var10004;
      var10004 = (var4 | var5) - (var4 & var5);
      var5 = -202552678;
      var4 = 1402963339;
      var10004 = (var4 | var5) - (var4 & var5);
      var5 = -1603088624;
      var4 = var10004;
      var10004 = var4 + var5 - 2 * (var4 & var5);
      var10003 = (int)-4658808327262365773L;
      var5 = -1063212330;
      var4 = var10003;
      var10003 = (var4 | var5) & (~var4 | ~var5);
      var5 = 787281086;
      var4 = var10003;
      var10003 = (var4 | var5) & (~var4 | ~var5);
      var5 = 1395013524;
      var4 = -2011367577;
      var10004 = var4 & ~var5 | ~var4 & var5;
      var5 = -571343411;
      var4 = var10004;
      var10004 = (var4 & ~var5 | ~var4 & var5) * (var4 & ~var5 | ~var4 & var5);
      var10004 = (int)3044267962468826702L;
      var5 = 1019088536;
      var4 = var10004;
      var10004 = (var4 | var5) - (var4 & var5);
      var5 = 2069119539;
      var4 = var10004;
      var10004 = var4 & ~var5 | ~var4 & var5;
      var5 = -1418545096;
      var4 = 679758020;
      int var10006 = (var4 | var5) & ~(var4 & var5);
      var5 = -2080968459;
      var4 = var10006;
      var10006 = var4 & ~var5 | ~var4 & var5;
      var5 = 990850718;
      var4 = 1311713361;
      int var10005 = (var4 | var5) & ~(var4 & var5);
      var5 = 2005786048;
      var4 = var10005;
      var10005 = (var4 | var5) & ~(var4 & var5);
      var5 = 243854902;
      var4 = 814220528;
      var10006 = (var4 | var5) - (var4 & var5);
      var5 = 1927928989;
      var4 = var10006;
      var10006 = (var4 | var5) & ~(var4 & var5);
      var5 = -1538458308;
      var4 = -1839912641;
      var10006 = var4 & ~var5 | ~var4 & var5;
      var5 = 911727613;
      var4 = var10006;
      ChatMessages.a(
         (Object)var56.append(
               c("郭훒", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7d4ꒂꁛꤊ絿蹄⑿謥㑚}\ua7e2꒠ꁽ꤀", var10003, var10004, var10005, (var4 | var5) & (~var4 | ~var5))
            )
            .append(var3)
            .toString()
      );
   }

   private void p() {
      int var2 = 657363513;
      int var1 = -1347073062;
      int var10001 = (var1 | var2) & (~var1 | ~var2);
      var2 = 2003052060;
      var1 = var10001;
      this.i = var1 + var2 - 2 * (var1 & var2);
      var10001 = (int)2947691422291841634L;
      var2 = -415783005;
      var1 = var10001;
      var10001 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1887179241;
      var1 = var10001;
      var10001 = (var1 | var2) & ~(var1 & var2);
      var2 = -1989218353;
      var1 = -21045608;
      int var10002 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1420953545;
      var1 = var10002;
      var10002 = (var1 | var2) & ~(var1 & var2);
      int var10004 = (int)-1431831436533579586L;
      var2 = 341073789;
      var1 = var10004;
      var10004 = (var1 | var2) - (var1 & var2);
      var2 = 326737857;
      var1 = var10004;
      var10004 = (var1 | var2) & ~(var1 & var2);
      var2 = -783667705;
      var1 = -967354775;
      var10004 = (var1 | var2) & (~var1 | ~var2);
      var2 = 387807330;
      var1 = var10004;
      var10004 = (var1 | var2) & ~(var1 & var2);
      var10004 = (int)6963228400312665863L;
      var2 = -1136613560;
      var1 = var10004;
      var10004 = (var1 | var2) - (var1 & var2);
      var2 = -422780850;
      var1 = var10004;
      var10004 = (var1 | var2) - (var1 & var2);
      var2 = 1462026130;
      var1 = 1754331699;
      var10004 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1068778918;
      var1 = var10004;
      var10004 = (var1 | var2) & (~var1 | ~var2);
      var2 = -581926534;
      var1 = -629041516;
      int var10003 = (var1 | var2) & ~(var1 & var2);
      var2 = 1769496117;
      var1 = var10003;
      var10003 = var1 + var2 - 2 * (var1 & var2);
      var10004 = (int)-3955898284610528268L;
      var2 = -2091018546;
      var1 = var10004;
      var10004 = var1 + var2 - 2 * (var1 & var2);
      var2 = -2128191699;
      var1 = var10004;
      var10004 = (var1 & ~var2 | ~var1 & var2) * (var1 & ~var2 | ~var1 & var2);
      var10004 = (int)6152601027085949472L;
      var2 = 319190156;
      var1 = var10004;
      var10004 = var1 & ~var2 | ~var1 & var2;
      var2 = 544017545;
      var1 = var10004;
      var10004 = var1 + var2 - 2 * (var1 & var2);
      String var10005 = "drz";
      var2 = -501727298;
      var1 = -691790640;
      int var89 = (var1 | var2) & ~(var1 & var2);
      var2 = 993952380;
      var1 = var89;
      int var90 = (var1 | var2) & ~(var1 & var2);
      var2 = 1086744160;
      var1 = 2109687688;
      int var10006 = (var1 | var2) - (var1 & var2);
      var2 = 937904195;
      var1 = var10006;
      var10006 = ((var1 | var2) & ~(var1 & var2)) * ((var1 | var2) & ~(var1 & var2));
      var10006 = (int)1146019181740208951L;
      var2 = 645062691;
      var1 = var10006;
      var10006 = (var1 | var2) - (var1 & var2);
      var2 = -1621104737;
      var1 = var10006;
      this.j = c("", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7d4ꒂꁛꤊ絿蹄⑿謥㑚}\ua7e2꒠ꁽ꤀", var10003, var10004, var90, (var1 | var2) - (var1 & var2));
      var2 = -1473809786;
      var1 = 1114684630;
      var10001 = (var1 | var2) & ~(var1 & var2);
      var2 = -363344304;
      var1 = var10001;
      this.k = pulse.Bool.from(var1 & ~var2 | ~var1 & var2);
      this.n = null;
      var10001 = (int)-3159136917540253596L;
      var2 = 892709136;
      var1 = var10001;
      var10001 = (var1 | var2) & (~var1 | ~var2);
      var2 = 738556276;
      var1 = var10001;
      this.m = pulse.Bool.from((var1 | var2) & ~(var1 & var2));
      var2 = 1544396469;
      var1 = 543655123;
      var10001 = (var1 | var2) - (var1 & var2);
      var2 = 2087328358;
      var1 = var10001;
      this.s = pulse.Bool.from((var1 | var2) & ~(var1 & var2));
      this.t = 0L;
   }

   @EventHandler
   public void a(PacketEvent var1) {
      if (!(var1.d() instanceof OpenScreenS2CPacket)) {
         InventoryS2CPacket var6;
         label77: {
            if (var1.d() instanceof InventoryS2CPacket) {
               var6 = (InventoryS2CPacket)var1.d();
               if (var6.getSyncId() == this.i) {
                  break label77;
               }

               int var273 = 1566250785;
               int var76 = -700712149;
               int var412 = (var76 | var273) & (~var76 | ~var273);
               var273 = 1956582389;
               var76 = var412;
               if (this.i != var76 + var273 - 2 * (var76 & var273) && this.k) {
                  break label77;
               }
            }

            if (var1.d() instanceof CloseScreenS2CPacket) {
               CloseScreenS2CPacket var7 = (CloseScreenS2CPacket)var1.d();
               CloseScreenS2CPacketAccessor var9 = (CloseScreenS2CPacketAccessor)var7;
               if (var9.getSyncId() == this.i) {
                  this.p();
                  var1.b();
                  return;
               }
            }

            if (var1.d() instanceof GameMessageS2CPacket) {
               GameMessageS2CPacket var8 = (GameMessageS2CPacket)var1.d();
               String var10 = Formatting.strip(var8.content().getString());
               if (var10 != null) {
                  int var433 = (int)5538046740721506061L;
                  int var275 = 233882598;
                  int var78 = var433;
                  var433 = (var78 | var275) - (var78 & var275);
                  var275 = 935843054;
                  var78 = var433;
                  var433 = var78 + var275 - 2 * (var78 & var275);
                  var433 = (int)-2525597587970603963L;
                  var275 = -1523460009;
                  var78 = var433;
                  var433 = (var78 | var275) - (var78 & var275);
                  var275 = 1583094803;
                  var78 = var433;
                  var433 = var78 & ~var275 | ~var78 & var275;
                  var275 = 340531619;
                  var78 = -1997477048;
                  int var466 = (var78 | var275) & (~var78 | ~var275);
                  var275 = -1665338630;
                  var78 = var466;
                  var466 = (var78 | var275) - (var78 & var275);
                  var466 = (int)-7340384772304450476L;
                  var275 = 2098330328;
                  var78 = var466;
                  var466 = var78 & ~var275 | ~var78 & var275;
                  var275 = 749184790;
                  var78 = var466;
                  var466 = (var78 & ~var275 | ~var78 & var275) * (var78 & ~var275 | ~var78 & var275);
                  var275 = 1733284507;
                  var78 = -1642006925;
                  var466 = (var78 | var275) & ~(var78 & var275);
                  var275 = -1748603597;
                  var78 = var466;
                  var466 = (var78 | var275) - (var78 & var275);
                  String var503 = "dsc";
                  var275 = 1110742062;
                  var78 = -18574909;
                  int var504 = var78 & ~var275 | ~var78 & var275;
                  var275 = 1975212103;
                  var78 = var504;
                  int var505 = var78 & ~var275 | ~var78 & var275;
                  var275 = 407528362;
                  var78 = -911876195;
                  int var541 = (var78 | var275) - (var78 & var275);
                  var275 = 178609748;
                  var78 = var541;
                  var541 = var78 & ~var275 | ~var78 & var275;
                  var275 = 976029375;
                  var78 = -1782857689;
                  int var595 = (var78 | var275) & (~var78 | ~var275);
                  var275 = -19001625;
                  var78 = var595;
                  var275 = (var78 | var275) - (var78 & var275);
                  var78 = var541;
                  var541 = var78 - ~var275 - 1;
                  var541 = (int)8440694201622675283L;
                  var275 = -1262713939;
                  var78 = var541;
                  var541 = (var78 | var275) - (var78 & var275);
                  var275 = 1798000723;
                  var78 = var541;
                  var541 = var78 & ~var275 | ~var78 & var275;
                  var275 = -147723205;
                  var78 = 735794932;
                  int var619 = (var78 | var275) - (var78 & var275);
                  var275 = -588596513;
                  var78 = var619;
                  var619 = (var78 | var275) & (~var78 | ~var275);
                  var619 = (int)-6532343597268493351L;
                  var275 = 955769483;
                  var78 = var619;
                  var619 = (var78 | var275) & ~(var78 & var275);
                  var275 = -1762363049;
                  var78 = var619;
                  var619 = var78 + var275 - 2 * (var78 & var275);
                  var275 = 1124215574;
                  var78 = -1506752885;
                  var595 = var78 & ~var275 | ~var78 & var275;
                  var275 = -451348562;
                  var78 = var595;
                  if (!var10.contains(
                     c(
                        "둚\ue79a끧\ue7ec둳\ue79f둼\ue791됆\ue7e3끧\ue790둹\ue79b둽\ue794됉\ue7e8둿\ue7ed됋\ue7ee됈\ue38f둽\ue38f됆\ue79a됇\ue79d둲\ue7ef됄",
                        "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7d4ꒂꁛꤊ絿蹄⑿謥㑚}\ua7e2꒠ꁽ꤀",
                        var466,
                        var505,
                        var541,
                        (var78 | var275) - (var78 & var275)
                     )
                  )) {
                     var275 = -2123975637;
                     var78 = 919026498;
                     var433 = var78 + var275 - 2 * (var78 & var275);
                     var275 = -1214148768;
                     var78 = var433;
                     var433 = (var78 | var275) - (var78 & var275);
                     var433 = (int)4221352771035309204L;
                     var275 = 1715146168;
                     var78 = var433;
                     var433 = (var78 | var275) & (~var78 | ~var275);
                     var275 = -1559189205;
                     var78 = var433;
                     var433 = (var78 | var275) & ~(var78 & var275);
                     var433 = (int)-2070728055838363964L;
                     var275 = 327473470;
                     var78 = var433;
                     var433 = (var78 | var275) - (var78 & var275);
                     var275 = -19564547;
                     var78 = var433;
                     var433 = var78 & ~var275 | ~var78 & var275;
                     var275 = 1926936905;
                     var78 = 9782254;
                     var433 = var78 + var275 - 2 * (var78 & var275);
                     var275 = -1434900244;
                     var78 = var433;
                     var433 = (var78 + var275 - 2 * (var78 & var275)) * (var78 + var275 - 2 * (var78 & var275));
                     var275 = -1310451620;
                     var78 = 674314284;
                     var466 = (var78 | var275) - (var78 & var275);
                     var275 = 222513878;
                     var78 = var466;
                     var466 = (var78 | var275) - (var78 & var275);
                     var466 = (int)1398641041834052430L;
                     var275 = 247722326;
                     var78 = var466;
                     var466 = (var78 | var275) & ~(var78 & var275);
                     var275 = 1655157699;
                     var78 = var466;
                     var466 = (var78 | var275) & (~var78 | ~var275);
                     int var506 = (int)8916020538852972307L;
                     var275 = -1506704749;
                     var78 = var506;
                     int var507 = var78 + var275 - 2 * (var78 & var275);
                     var275 = 1703035036;
                     var78 = var507;
                     int var508 = var78 + var275 - 2 * (var78 & var275);
                     var275 = 1236770167;
                     var78 = 1550785031;
                     var541 = var78 & ~var275 | ~var78 & var275;
                     var275 = 1260637939;
                     var78 = var541;
                     var275 = (var78 | var275) & (~var78 | ~var275);
                     var78 = var508;
                     int var509 = 2 * (var78 | var275) - (var78 ^ var275);
                     var275 = 1125447189;
                     var78 = -1929148061;
                     int var510 = var78 + var275 - 2 * (var78 & var275);
                     var275 = 125629351;
                     var78 = var510;
                     int var511 = (var78 | var275) & (~var78 | ~var275);
                     var541 = (int)3754917083032517224L;
                     var275 = -1130079252;
                     var78 = var541;
                     var541 = var78 + var275 - 2 * (var78 & var275);
                     var275 = -1825207431;
                     var78 = var541;
                     var541 = var78 & ~var275 | ~var78 & var275;
                     var275 = 733581337;
                     var78 = -1142752736;
                     var541 = (var78 | var275) & (~var78 | ~var275);
                     var275 = -2120303095;
                     var78 = var541;
                     var541 = var78 + var275 - 2 * (var78 & var275);
                     var275 = -146741968;
                     var78 = -737369985;
                     var619 = (var78 | var275) & (~var78 | ~var275);
                     var275 = 592201036;
                     var78 = var619;
                     var619 = var78 & ~var275 | ~var78 & var275;
                     var619 = (int)6618347645226488145L;
                     var275 = 534912513;
                     var78 = var619;
                     var619 = (var78 | var275) - (var78 & var275);
                     var275 = 908496735;
                     var78 = var619;
                     var619 = (var78 | var275) - (var78 & var275);
                     var595 = (int)-3064753966558379403L;
                     var275 = -16958829;
                     var78 = var595;
                     var595 = (var78 | var275) & ~(var78 & var275);
                     var275 = -1383665220;
                     var78 = var595;
                     if (!var10.contains(
                        c(
                           "둘듸둳듸둱듲둿뒄둲냦둺듳됆듼둹듽됋듼둹냦됆듳둽뒅둺듲끧듹둲뒆둲듲끧듹둹듴됅듸됇뒍둻냦둸듸둳듼둼뒈됀듳둺듾둲듺",
                           "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7d4ꒂꁛꤊ絿蹄⑿謥㑚}\ua7e2꒠ꁽ꤀",
                           var466,
                           var511,
                           var541,
                           (var78 | var275) - (var78 & var275)
                        )
                     )) {
                        String var413 = "dsd";
                        var275 = -1111180655;
                        var78 = 320586952;
                        var433 = (var78 | var275) - (var78 & var275);
                        var275 = -290110326;
                        var78 = var433;
                        var433 = (var78 & ~var275 | ~var78 & var275) * (var78 & ~var275 | ~var78 & var275);
                        var466 = (int)7731002814945161086L;
                        var275 = 1324117663;
                        var78 = var466;
                        var466 = (var78 | var275) & (~var78 | ~var275);
                        var275 = -1734934686;
                        var78 = var466;
                        var466 = var78 + var275 - 2 * (var78 & var275);
                        int var512 = (int)9087954584869976267L;
                        var275 = 1070415703;
                        var78 = var512;
                        int var513 = var78 + var275 - 2 * (var78 & var275);
                        var275 = -1290551974;
                        var78 = var513;
                        var275 = var78 & ~var275 | ~var78 & var275;
                        var78 = var466;
                        var466 = (var78 & ~var275) + (var275 & ~var78) + 2 * (var78 & var275);
                        var275 = 816801496;
                        var78 = -1248513230;
                        var466 = var78 + var275 - 2 * (var78 & var275);
                        var275 = -342680527;
                        var78 = var466;
                        var466 = (var78 | var275) - (var78 & var275);
                        var541 = (int)-416222773803111116L;
                        var275 = -1265236649;
                        var78 = var541;
                        var541 = (var78 | var275) & (~var78 | ~var275);
                        var275 = 413116531;
                        var78 = var541;
                        var541 = (var78 | var275) & (~var78 | ~var275);
                        var541 = (int)-4585243097848343097L;
                        var275 = -939518265;
                        var78 = var541;
                        var541 = (var78 | var275) - (var78 & var275);
                        var275 = -1047796;
                        var78 = var541;
                        var541 = var78 + var275 - 2 * (var78 & var275);
                        int var514 = (int)-4545393879013466293L;
                        var275 = 204659152;
                        var78 = var514;
                        int var515 = (var78 | var275) & (~var78 | ~var275);
                        var275 = -1202842120;
                        var78 = var515;
                        int var516 = var78 & ~var275 | ~var78 & var275;
                        var541 = (int)-8712708338129779234L;
                        var275 = 280526196;
                        var78 = var541;
                        var541 = var78 & ~var275 | ~var78 & var275;
                        var275 = 94631403;
                        var78 = var541;
                        var541 = (var78 | var275) & (~var78 | ~var275);
                        var541 = (int)-7840520080592705598L;
                        var275 = -473470901;
                        var78 = var541;
                        var541 = (var78 | var275) & ~(var78 & var275);
                        var275 = -399815690;
                        var78 = var541;
                        var541 = var78 + var275 - 2 * (var78 & var275);
                        var275 = -1793554256;
                        var78 = -1664333310;
                        var595 = (var78 | var275) - (var78 & var275);
                        var275 = -1151399925;
                        var78 = var595;
                        var595 = (var78 & ~var275 | ~var78 & var275) * (var78 & ~var275 | ~var78 & var275);
                        var595 = (int)-5819600226351923504L;
                        var275 = -560389187;
                        var78 = var595;
                        var595 = var78 & ~var275 | ~var78 & var275;
                        var275 = -1559276927;
                        var78 = var595;
                        if (!var10.contains(
                           c(
                              "됆㉅됇㉂둲㈰끧㉏둲㈰둲㉏둹㉋둺㉅둺",
                              "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7d4ꒂꁛꤊ絿蹄⑿謥㑚}\ua7e2꒠ꁽ꤀",
                              var466,
                              var516,
                              var541,
                              (var78 | var275) & ~(var78 & var275)
                           )
                        )) {
                           int var414 = (int)-8649790834745893934L;
                           var275 = 703611781;
                           var78 = var414;
                           int var415 = var78 + var275 - 2 * (var78 & var275);
                           var275 = 868213829;
                           var78 = var415;
                           int var416 = ((var78 | var275) - (var78 & var275)) * ((var78 | var275) - (var78 & var275));
                           var433 = (int)-6776920405414933053L;
                           var275 = -1985357257;
                           var78 = var433;
                           var433 = (var78 | var275) & (~var78 | ~var275);
                           var275 = 468060654;
                           var78 = var433;
                           var433 = var78 + var275 - 2 * (var78 & var275);
                           var275 = -1854778393;
                           var78 = -320566504;
                           var466 = var78 & ~var275 | ~var78 & var275;
                           var275 = 799731140;
                           var78 = var466;
                           var275 = var78 + var275 - 2 * (var78 & var275);
                           var78 = var433;
                           var433 = (var78 | var275) + (var78 & var275);
                           var275 = -57580432;
                           var78 = 1513583182;
                           int var517 = (var78 | var275) - (var78 & var275);
                           var275 = -1499064784;
                           var78 = var517;
                           int var518 = (var78 | var275) - (var78 & var275);
                           int var519 = (int)829357809849783551L;
                           var275 = 391320598;
                           var78 = var519;
                           int var520 = var78 + var275 - 2 * (var78 & var275);
                           var275 = -1197883157;
                           var78 = var520;
                           int var521 = var78 + var275 - 2 * (var78 & var275);
                           var275 = -1436903584;
                           var78 = 1052848786;
                           int var522 = var78 & ~var275 | ~var78 & var275;
                           var275 = -1801738753;
                           var78 = var522;
                           int var523 = (var78 | var275) - (var78 & var275);
                           var466 = (int)-1131943413878779701L;
                           var275 = -977510216;
                           var78 = var466;
                           var466 = (var78 | var275) & ~(var78 & var275);
                           var275 = -151209560;
                           var78 = var466;
                           var466 = (var78 | var275) - (var78 & var275);
                           var275 = -2067684910;
                           var78 = -1798759575;
                           int var524 = (var78 | var275) & ~(var78 & var275);
                           var275 = -1165878794;
                           var78 = var524;
                           int var525 = ((var78 | var275) & ~(var78 & var275)) * ((var78 | var275) & ~(var78 & var275));
                           int var526 = (int)-2412261877692107377L;
                           var275 = -129597989;
                           var78 = var526;
                           int var527 = var78 + var275 - 2 * (var78 & var275);
                           var275 = 1799090176;
                           var78 = var527;
                           int var528 = var78 + var275 - 2 * (var78 & var275);
                           var275 = -1987459342;
                           var78 = -1986413638;
                           var541 = (var78 | var275) & ~(var78 & var275);
                           var275 = -490457350;
                           var78 = var541;
                           var541 = (var78 & ~var275 | ~var78 & var275) * (var78 & ~var275 | ~var78 & var275);
                           var275 = 1215420693;
                           var78 = 1547221560;
                           var541 = (var78 | var275) - (var78 & var275);
                           var275 = 319357190;
                           var78 = var541;
                           var541 = (var78 | var275) & ~(var78 & var275);
                           var275 = 823930;
                           var78 = 1698750329;
                           var595 = var78 + var275 - 2 * (var78 & var275);
                           var275 = -680337382;
                           var78 = var595;
                           var595 = (var78 + var275 - 2 * (var78 & var275)) * (var78 + var275 - 2 * (var78 & var275));
                           var275 = 679195680;
                           var78 = 1190271043;
                           var595 = (var78 | var275) & ~(var78 & var275);
                           var275 = 1858246846;
                           var78 = var595;
                           if (!var10.contains(
                              c(
                                 "뀒촯뀦촣뀫촤끧촵뀨쵡뀤촮뀩촯뀢촢뀳",
                                 "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7d4ꒂꁛꤊ絿蹄⑿謥㑚}\ua7e2꒠ꁽ꤀",
                                 var466,
                                 var528,
                                 var541,
                                 var78 & ~var275 | ~var78 & var275
                              )
                           )) {
                              if (a != a) {
                                 throw new RuntimeException();
                              }

                              return;
                           }
                        }
                     }
                  }

                  var275 = -783226070;
                  var78 = 557698030;
                  int var417 = var78 + var275 - 2 * (var78 & var275);
                  var275 = -1877920416;
                  var78 = var417;
                  var417 = ((var78 | var275) - (var78 & var275)) * ((var78 | var275) - (var78 & var275));
                  String var455 = "dse";
                  var466 = (int)-1320981023216627491L;
                  var275 = -1836546153;
                  var78 = var466;
                  var466 = (var78 | var275) & (~var78 | ~var275);
                  var275 = -893912502;
                  var78 = var466;
                  var466 = (var78 + var275 - 2 * (var78 & var275)) * (var78 + var275 - 2 * (var78 & var275));
                  var275 = 607708768;
                  var78 = 652630745;
                  var466 = (var78 | var275) & (~var78 | ~var275);
                  var275 = 1819800930;
                  var78 = var466;
                  var466 = (var78 | var275) & (~var78 | ~var275);
                  int var529 = (int)1792943362411642853L;
                  var275 = 214191262;
                  var78 = var529;
                  int var530 = (var78 | var275) - (var78 & var275);
                  var275 = -1533421129;
                  var78 = var530;
                  int var531 = ((var78 | var275) & (~var78 | ~var275)) * ((var78 | var275) & (~var78 | ~var275));
                  int var532 = (int)4233842988026322097L;
                  var275 = 2145288546;
                  var78 = var532;
                  int var533 = (var78 | var275) & ~(var78 & var275);
                  var275 = -1096060572;
                  var78 = var533;
                  int var534 = (var78 | var275) & (~var78 | ~var275);
                  var595 = (int)-1683046451898859465L;
                  var275 = 354949951;
                  var78 = var595;
                  var595 = var78 + var275 - 2 * (var78 & var275);
                  var275 = 1530813187;
                  var78 = var595;
                  var595 = (var78 | var275) & (~var78 | ~var275);
                  var595 = (int)8169531727006883261L;
                  var275 = -2005651592;
                  var78 = var595;
                  var595 = var78 & ~var275 | ~var78 & var275;
                  var275 = -772574521;
                  var78 = var595;
                  var595 = (var78 | var275) & (~var78 | ~var275);
                  var275 = -1380516297;
                  var78 = -454612204;
                  var541 = (var78 | var275) & (~var78 | ~var275);
                  var275 = 1140441398;
                  var78 = var541;
                  var541 = (var78 | var275) & (~var78 | ~var275);
                  var275 = 1665096204;
                  var78 = -1119582529;
                  var595 = (var78 | var275) & ~(var78 & var275);
                  var275 = -1061054998;
                  var78 = var595;
                  var595 = var78 + var275 - 2 * (var78 & var275);
                  var275 = -1909848234;
                  var78 = 811114177;
                  var595 = (var78 | var275) & ~(var78 & var275);
                  var275 = -1101991721;
                  var78 = var595;
                  if (var10.contains(
                     c(
                        "뀒邲뀦邾뀫邹끧邨뀨郼뀤邳뀩邲뀢邿뀳",
                        "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7d4ꒂꁛꤊ絿蹄⑿謥㑚}\ua7e2꒠ꁽ꤀",
                        var466,
                        var534,
                        var541,
                        (var78 | var275) & ~(var78 & var275)
                     )
                  )) {
                     if (b) {
                        var275 = 744351383;
                        var78 = 1743091993;
                        int var10000 = (var78 | var275) & (~var78 | ~var275);
                        var275 = 1270390670;
                        var78 = var10000;
                        var10000 = var78 + var275 - 2 * (var78 & var275);
                        var275 = 2139674057;
                        var78 = 582449718;
                        var417 = (var78 | var275) - (var78 & var275);
                        var275 = 1564454911;
                        var78 = var417;
                        var10000 /= (var78 | var275) - (var78 & var275);
                     }
                  } else {
                     var1.b();
                  }

                  var417 = (int)470163879463535463L;
                  var275 = 1842654909;
                  var78 = var417;
                  var417 = (var78 | var275) & (~var78 | ~var275);
                  var275 = -1066373669;
                  var78 = var417;
                  this.l = pulse.Bool.from(var78 + var275 - 2 * (var78 & var275));
                  this.h.b();
                  this.p();
               }
            }

            return;
         }

         this.n = var6.getContents();
         this.o();
         var1.b();
      } else {
         OpenScreenS2CPacket var2 = (OpenScreenS2CPacket)var1.d();
         String var3 = Formatting.strip(var2.getName().getString());
         int var10001 = (int)-956034991330690129L;
         int var5 = -638587943;
         int var4 = var10001;
         var10001 = (var4 | var5) & (~var4 | ~var5);
         var5 = 922176747;
         var4 = var10001;
         var10001 = ((var4 | var5) & (~var4 | ~var5)) * ((var4 | var5) & (~var4 | ~var5));
         var5 = 1566009223;
         var4 = 634206147;
         int var10002 = (var4 | var5) - (var4 & var5);
         var5 = -1719351530;
         var4 = var10002;
         var10002 = (var4 | var5) & (~var4 | ~var5);
         var5 = 2106389138;
         var4 = -245664684;
         int var10003 = (var4 | var5) & (~var4 | ~var5);
         var5 = -222525372;
         var4 = var10003;
         var10003 = (var4 | var5) & ~(var4 & var5);
         int var10004 = (int)376638819127395959L;
         var5 = 629176935;
         var4 = var10004;
         var10004 = var4 & ~var5 | ~var4 & var5;
         var5 = -471230643;
         var4 = var10004;
         var5 = (var4 | var5) & (~var4 | ~var5);
         var4 = var10003;
         var10003 = var4 - ~var5 - 1;
         var10003 = (int)7853990968776813350L;
         var5 = -186214748;
         var4 = var10003;
         var10003 = (var4 | var5) & ~(var4 & var5);
         var5 = 425636953;
         var4 = var10003;
         var10003 = (var4 | var5) - (var4 & var5);
         var5 = -1671272293;
         var4 = 231536247;
         var10004 = var4 + var5 - 2 * (var4 & var5);
         var5 = 3632133;
         var4 = var10004;
         var10004 = (var4 | var5) & (~var4 | ~var5);
         var5 = 1370897542;
         var4 = 330111699;
         int var10005 = (var4 | var5) & ~(var4 & var5);
         var5 = -910465197;
         var4 = var10005;
         var5 = (var4 | var5) - (var4 & var5);
         var4 = var10004;
         var10004 = (var4 & ~var5) + (var5 & ~var4) + 2 * (var4 & var5);
         var5 = -1241494585;
         var4 = -459841465;
         var10004 = var4 & ~var5 | ~var4 & var5;
         var5 = -1680496661;
         var4 = var10004;
         var10004 = (var4 | var5) & ~(var4 & var5);
         int var10006 = (int)6848131296498308752L;
         var5 = -1866794849;
         var4 = var10006;
         var10006 = (var4 | var5) & (~var4 | ~var5);
         var5 = 129936904;
         var4 = var10006;
         var10006 = var4 + var5 - 2 * (var4 & var5);
         var5 = 645935142;
         var4 = 421426236;
         var10006 = (var4 | var5) & ~(var4 & var5);
         var5 = 1067336713;
         var4 = var10006;
         var10006 = var4 & ~var5 | ~var4 & var5;
         var10006 = (int)6621912714232894934L;
         var5 = -102674839;
         var4 = var10006;
         var10006 = var4 + var5 - 2 * (var4 & var5);
         var5 = -2137007172;
         var4 = var10006;
         var10006 = var4 + var5 - 2 * (var4 & var5);
         var5 = -668738438;
         var4 = 119024007;
         var10006 = (var4 | var5) - (var4 & var5);
         var5 = -549718547;
         var4 = var10006;
         var10006 = var4 & ~var5 | ~var4 & var5;
         var10005 = (int)-2800561296299273283L;
         var5 = 2138559670;
         var4 = var10005;
         var10005 = (var4 | var5) - (var4 & var5);
         var5 = -1099410991;
         var4 = var10005;
         var10005 = var4 + var5 - 2 * (var4 & var5);
         var10006 = (int)3579083079673756229L;
         var5 = -1029118872;
         var4 = var10006;
         var10006 = (var4 | var5) - (var4 & var5);
         var5 = -1899101440;
         var4 = var10006;
         var10006 = (var4 & ~var5 | ~var4 & var5) * (var4 & ~var5 | ~var4 & var5);
         var5 = -740269400;
         var4 = 1805441095;
         var10006 = (var4 | var5) & (~var4 | ~var5);
         var5 = -1199705573;
         var4 = var10006;
         if (!var3.contains(
            c("둕딣둶땖됇녈됆땝됇땚둲딨둷", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7d4ꒂꁛꤊ絿蹄⑿謥㑚}\ua7e2꒠ꁽ꤀", var10003, var10004, var10005, (var4 | var5) - (var4 & var5))
         )) {
            var5 = -1027537150;
            var4 = 844960320;
            var10002 = var4 + var5 - 2 * (var4 & var5);
            var5 = -258206392;
            var4 = var10002;
            var10002 = (var4 | var5) & ~(var4 & var5);
            var10002 = (int)-3578729842930530748L;
            var5 = 991880947;
            var4 = var10002;
            var10002 = (var4 | var5) - (var4 & var5);
            var5 = 236429502;
            var4 = var10002;
            var10002 = var4 & ~var5 | ~var4 & var5;
            var5 = -332737359;
            var4 = 755103270;
            var10002 = (var4 | var5) & ~(var4 & var5);
            var5 = -1054137698;
            var4 = var10002;
            var10002 = (var4 | var5) & (~var4 | ~var5);
            var5 = -208595171;
            var4 = -1957971113;
            var10002 = var4 & ~var5 | ~var4 & var5;
            var5 = 2027596891;
            var4 = var10002;
            var10002 = (var4 | var5) & (~var4 | ~var5);
            String var432 = "dsa";
            var5 = 919271540;
            var4 = 2116761809;
            var10003 = (var4 | var5) - (var4 & var5);
            var5 = 1039018955;
            var4 = var10003;
            var10003 = (var4 | var5) & ~(var4 & var5);
            var10003 = (int)-8244834716991558580L;
            var5 = -293727262;
            var4 = var10003;
            var10003 = (var4 | var5) - (var4 & var5);
            var5 = -2059422091;
            var4 = var10003;
            var10003 = (var4 | var5) & (~var4 | ~var5);
            String var499 = "dsb";
            var10004 = (int)-7602172402498817534L;
            var5 = -1314960937;
            var4 = var10004;
            var10004 = (var4 | var5) & (~var4 | ~var5);
            var5 = 587602670;
            var4 = var10004;
            var10004 = var4 + var5 - 2 * (var4 & var5);
            var10006 = (int)-2701683551406642376L;
            var5 = -915677135;
            var4 = var10006;
            var10006 = var4 & ~var5 | ~var4 & var5;
            var5 = 261081861;
            var4 = var10006;
            var10006 = var4 + var5 - 2 * (var4 & var5);
            var5 = 2004827740;
            var4 = -2146895606;
            var10006 = (var4 | var5) & (~var4 | ~var5);
            var5 = -143145125;
            var4 = var10006;
            var10006 = var4 & ~var5 | ~var4 & var5;
            var5 = 998143038;
            var4 = 122561013;
            var10006 = var4 & ~var5 | ~var4 & var5;
            var5 = 1009800641;
            var4 = var10006;
            var10006 = var4 & ~var5 | ~var4 & var5;
            var10006 = (int)2693692733554225103L;
            var5 = -8764569;
            var4 = var10006;
            var10006 = (var4 | var5) - (var4 & var5);
            var5 = 183938220;
            var4 = var10006;
            var10006 = var4 + var5 - 2 * (var4 & var5);
            var10005 = (int)4394093880444737057L;
            var5 = -1857332261;
            var4 = var10005;
            var10005 = (var4 | var5) - (var4 & var5);
            var5 = -91294967;
            var4 = var10005;
            var10005 = var4 + var5 - 2 * (var4 & var5);
            var5 = -985831681;
            var4 = 1362997006;
            int var10007 = (var4 | var5) & ~(var4 & var5);
            var5 = -1811887645;
            var4 = var10007;
            var10007 = (var4 | var5) & (~var4 | ~var5);
            var10007 = (int)3914272928903847457L;
            var5 = 2041591355;
            var4 = var10007;
            var10007 = (var4 | var5) - (var4 & var5);
            var5 = 9299996;
            var4 = var10007;
            var10007 = var4 + var5 - 2 * (var4 & var5);
            var5 = 1857345874;
            var4 = 688265727;
            var10006 = (var4 | var5) - (var4 & var5);
            var5 = 1202675049;
            var4 = var10006;
            if (!var3.contains(
               c("둕怓둶恦됇摸둻恠됇恨끧恫됇恠됃恨", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7d4ꒂꁛꤊ絿蹄⑿謥㑚}\ua7e2꒠ꁽ꤀", var10003, var10004, var10005, var4 & ~var5 | ~var4 & var5)
            )) {
               return;
            }
         }

         this.i = var2.getSyncId();
         this.j = var3;
         var5 = -1593078560;
         var4 = 745602818;
         var10001 = var4 + var5 - 2 * (var4 & var5);
         var5 = -1921289245;
         var4 = var10001;
         this.k = pulse.Bool.from(var4 + var5 - 2 * (var4 & var5));
         var10001 = (int)-323414715249647173L;
         var5 = 2062265442;
         var4 = var10001;
         var10001 = (var4 | var5) & (~var4 | ~var5);
         var5 = -729641511;
         var4 = var10001;
         this.s = pulse.Bool.from((var4 | var5) & ~(var4 & var5));
         var1.b();
      }
   }

   @EventHandler
   public void a(WorldChangeEvent var1) {
      if (!this.l()) {
         return;
      }

      if (!this.l) {
         if (!this.e.d()) {
            return;
         }

         int var2;
         try {
            var2 = Integer.parseInt(this.e.k());
         } catch (NumberFormatException var0) {
            return;
         }
         StringBuilder var10001 = new StringBuilder();
         String var10002 = "dsf";
         int var10004 = (int)-8900407161811819341L;
         int var4 = -355209833;
         int var3 = var10004;
         var10004 = (var3 | var4) & (~var3 | ~var4);
         var4 = 1359923509;
         var3 = var10004;
         var10004 = (var3 | var4) & (~var3 | ~var4);
         var4 = 488203158;
         var3 = 1518767666;
         var10004 = (var3 | var4) & ~(var3 & var4);
         var4 = 1201663396;
         var3 = var10004;
         var10004 = (var3 | var4) & ~(var3 & var4);
         var10004 = (int)-2652100611256741323L;
         var4 = -1122607023;
         var3 = var10004;
         var10004 = (var3 | var4) - (var3 & var4);
         var4 = 409236086;
         var3 = var10004;
         var10004 = (var3 | var4) - (var3 & var4);
         var10004 = (int)-3133880074431797433L;
         var4 = -2132052447;
         var3 = var10004;
         var10004 = var3 & ~var4 | ~var3 & var4;
         var4 = -1573252763;
         var3 = var10004;
         var10004 = (var3 | var4) & (~var3 | ~var4);
         var10004 = (int)-3378181613482765818L;
         var4 = -981837447;
         var3 = var10004;
         var10004 = var3 + var4 - 2 * (var3 & var4);
         var4 = 1222691699;
         var3 = var10004;
         var10004 = var3 & ~var4 | ~var3 & var4;
         var4 = -1357434720;
         var3 = -394763315;
         var10004 = var3 & ~var4 | ~var3 & var4;
         var4 = 709009493;
         var3 = var10004;
         var10004 = (var3 | var4) & (~var3 | ~var4);
         var4 = 868248416;
         var3 = 693413580;
         int var10005 = (var3 | var4) & ~(var3 & var4);
         var4 = -973050114;
         var3 = var10005;
         var4 = (var3 | var4) & ~(var3 & var4);
         var3 = var10004;
         var10004 = (var3 | var4) + (var3 & var4);
         var4 = 1797666396;
         var3 = -898476849;
         var10004 = var3 + var4 - 2 * (var3 & var4);
         var4 = -805491896;
         var3 = var10004;
         var10004 = (var3 | var4) - (var3 & var4);
         var10005 = (int)-71622662577104623L;
         var4 = 98282633;
         var3 = var10005;
         var10005 = (var3 | var4) & (~var3 | ~var4);
         var4 = 198042715;
         var3 = var10005;
         var10005 = (var3 | var4) & ~(var3 & var4);
         int var10006 = (int)-8086785795477406758L;
         var4 = 428286749;
         var3 = var10006;
         var10006 = (var3 | var4) - (var3 & var4);
         var4 = 2028478357;
         var3 = var10006;
         var4 = (var3 | var4) & (~var3 | ~var4);
         var3 = var10005;
         var10005 = (var3 & ~var4) + (var4 & ~var3) + 2 * (var3 & var4);
         var10005 = (int)-5934505938231217849L;
         var4 = -1152641829;
         var3 = var10005;
         var10005 = var3 & ~var4 | ~var3 & var4;
         var4 = -1340486589;
         var3 = var10005;
         var10005 = var3 & ~var4 | ~var3 & var4;
         String var89 = "dsg";
         var10006 = (int)-7713475291002298259L;
         var4 = -200704024;
         var3 = var10006;
         var10006 = (var3 | var4) - (var3 & var4);
         var4 = -635609792;
         var3 = var10006;
         var10006 = (var3 | var4) & ~(var3 & var4);
         var4 = -1288805838;
         var3 = -1036712582;
         int var10007 = (var3 | var4) & (~var3 | ~var4);
         var4 = 1673195281;
         var3 = var10007;
         var10007 = (var3 | var4) & (~var3 | ~var4);
         var4 = 1360669436;
         var3 = 42488782;
         var10007 = (var3 | var4) & (~var3 | ~var4);
         var4 = 1401489587;
         var3 = var10007;
         this.a(
            var10001.append(
                  c(
                     "捻孃捧嬷挐嬿捦弢捧嬼捬嬸捣孌挟嬷捥嬼杸嬸杸嬑挘嬺挜弢杻",
                     "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7d4ꒂꁛꤊ絿蹄⑿謥㑚}\ua7e2꒠ꁽ꤀",
                     var10004,
                     var10005,
                     var10006,
                     (var3 | var4) & ~(var3 & var4)
                  )
               )
               .append(var2)
               .toString()
         );
         this.d();
      }
   }

   @EventHandler
   public void a(MouseButtonEvent var1) {
   }

   private boolean q() {
      if (c.inGameHud != null && c.inGameHud.getPlayerListHud() != null) {
         try {
            PlayerListHudAccessor var1 = (PlayerListHudAccessor)c.inGameHud.getPlayerListHud();
            Text var2 = var1.getHeader();
            if (var2 == null) {
               int var71 = (int)3299088680870453295L;
               int var63 = 1831839592;
               int var34 = var71;
               var71 = (var34 | var63) & ~(var34 & var63);
               var63 = 1692665671;
               var34 = var71;
               return pulse.Bool.from((var34 | var63) & (var34 & var63 ^ -1));
            }

            String var3 = Formatting.strip(var2.getString());
            if (var3 != null) {
               int var39 = 1293138895;
               int var10 = -1738494894;
               int var10001 = (var10 | var39) - (var10 & var39);
               var39 = 1718032856;
               var10 = var10001;
               var10001 = (var10 | var39) - (var10 & var39);
               int var10002 = (int)-1484226266064192930L;
               var39 = -1615878853;
               var10 = var10002;
               var10002 = var10 & ~var39 | ~var10 & var39;
               var39 = 1177848686;
               var10 = var10002;
               var10002 = var10 & ~var39 | ~var10 & var39;
               var39 = -376971914;
               var10 = 1597847933;
               int var10003 = var10 + var39 - 2 * (var10 & var39);
               var39 = -392054103;
               var10 = var10003;
               var10003 = (var10 | var39) & (~var10 | ~var39);
               var10003 = (int)-7133430792834110796L;
               var39 = 2093678340;
               var10 = var10003;
               var10003 = var10 + var39 - 2 * (var10 & var39);
               var39 = 422157419;
               var10 = var10003;
               var10003 = var10 & ~var39 | ~var10 & var39;
               int var10004 = (int)2948229574215077730L;
               var39 = 941114584;
               var10 = var10004;
               var10004 = (var10 | var39) & (~var10 | ~var39);
               var39 = -1883980373;
               var10 = var10004;
               var10004 = (var10 | var39) & (~var10 | ~var39);
               var10004 = (int)-349582893466377758L;
               var39 = -1676179954;
               var10 = var10004;
               var10004 = var10 + var39 - 2 * (var10 & var39);
               var39 = -978679293;
               var10 = var10004;
               var10004 = (var10 | var39) & ~(var10 & var39);
               var39 = 629996999;
               var10 = -1417471170;
               int var10005 = (var10 | var39) & ~(var10 & var39);
               var39 = 247268899;
               var10 = var10005;
               var10005 = var10 & ~var39 | ~var10 & var39;
               var10005 = (int)995302876358700466L;
               var39 = 858764204;
               var10 = var10005;
               var10005 = (var10 | var39) & ~(var10 & var39);
               var39 = 1995914087;
               var10 = var10005;
               var10005 = (var10 | var39) & ~(var10 & var39);
               int var10006 = (int)2788321341476241666L;
               var39 = -738262884;
               var10 = var10006;
               var10006 = var10 + var39 - 2 * (var10 & var39);
               var39 = 64997589;
               var10 = var10006;
               var10006 = ((var10 | var39) - (var10 & var39)) * ((var10 | var39) - (var10 & var39));
               var39 = 2086172072;
               var10 = -530904375;
               var10006 = (var10 | var39) - (var10 & var39);
               var39 = -1673711220;
               var10 = var10006;
               if (var3.contains(
                  c(
                     "\ud8ee\udf81\udcdc\udff7\ud8cc\udf8f\ud8c2\udffe\ud8c4\udf88\ud8c9\udf8b\ud8b0\udbea\ud8ce\udbf0\udcdc\udb86\udc93\udba8\udc9e\udbb3",
                     "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7d4ꒂꁛꤊ絿蹄⑿謥㑚}\ua7e2꒠ꁽ꤀",
                     var10003,
                     var10004,
                     var10005,
                     (var10 | var39) - (var10 & var39)
                  )
               )) {
                  int var69 = (int)-2121756656870888421L;
                  var39 = 1667019243;
                  var10 = var69;
                  var69 = var10 & ~var39 | ~var10 & var39;
                  var39 = -2076221967;
                  var10 = var69;
                  return pulse.Bool.from((var10 | var39) & ~(var10 & var39));
               }
            }

            int var59 = 1513452084;
            int var30 = -1017550638;
            int var67 = (var30 | var59) & (~var30 | ~var59);
            var59 = -1720968474;
            var30 = var67;
            return pulse.Bool.from(var30 & ~var59 | ~var30 & var59);
         } catch (Exception var6) {
            int var37 = -307184744;
            int var8 = 270378587;
            int var66 = var8 + var37 - 2 * (var8 & var37);
            var37 = -38986301;
            var8 = var66;
            return pulse.Bool.from(var8 + var37 - 2 * (var8 & var37));
         }
      } else {
         int var10000 = (int)-6195631015857819776L;
         int var5 = 1015813580;
         int var4 = var10000;
         var10000 = (var4 | var5) & ~(var4 & var5);
         var5 = -2132084148;
         var4 = var10000;
         return pulse.Bool.from((var4 | var5) & (var4 & var5 ^ -1));
      }
   }

   private int b(String var1) {
      if (this.n == null) {
         int var15 = 120248895;
         int var10 = -1772521115;
         int var20 = var10 + var15 - 2 * (var10 & var15);
         var15 = 1854692517;
         var10 = var20;
         return var10 & ~var15 | ~var10 & var15;
      }

      int var10000 = (int)-4496203589764137525L;
      int var6 = 1237435127;
      int var5 = var10000;
      var10000 = var5 + var6 - 2 * (var5 & var6);
      var6 = 2072280892;
      var5 = var10000;

      for (int var2 = (var5 | var6) - (var5 & var6); var2 < this.n.size(); var2++) {
         ItemStack var3 = this.n.get(var2);
         if (!var3.isEmpty()) {
            String var4 = Formatting.strip(var3.getName().getString());
            if (var4 != null && var4.contains(var1)) {
               return var2;
            }
         }
      }

      var10000 = (int)-319264414879310950L;
      var6 = -1520870603;
      var5 = var10000;
      var10000 = (var5 | var6) & (~var5 | ~var6);
      var6 = -1827356848;
      var5 = var10000;
      return (var5 | var6) - (var5 & var6);
   }

   @Override
   public void e() {
      super.e();
      if (c.player == null || c.world == null) {
         this.d();
      } else if (this.q()) {
         if (a != a) {
            int var10000 = (int)-6420396261755353132L;
            int var4 = 484910425;
            int var3 = var10000;
            var10000 = (var3 | var4) & ~(var3 & var4);
            var4 = -1472369277;
            var3 = var10000;
            var10000 = (var3 & ~var4 | ~var3 & var4) * (var3 & ~var4 | ~var3 & var4);
            var4 = 1413294149;
            var3 = 1858173906;
            var10000 = var3 + var4 - 2 * (var3 & var4);
            var4 = -1481326342;
            var3 = var10000;
            int var2 = (var3 | var4) & (~var3 | ~var4);
            a = var2;
         }

         int var19 = 667204584;
         int var8 = 1052715933;
         int var10001 = var8 + var19 - 2 * (var8 & var19);
         var19 = 427528309;
         var8 = var10001;
         this.l = pulse.Bool.from((var8 | var19) - (var8 & var19));
         var10001 = (int)687049205368571677L;
         var19 = -439763296;
         var8 = var10001;
         var10001 = var8 & ~var19 | ~var8 & var19;
         var19 = 1358756285;
         var8 = var10001;
         this.k = pulse.Bool.from(var8 + var19 - 2 * (var8 & var19));
         var19 = -2070479334;
         var8 = 391477801;
         var10001 = (var8 | var19) & ~(var8 & var19);
         var19 = -1815903181;
         var8 = var10001;
         this.o = (var8 | var19) - (var8 & var19);
         var19 = -279925011;
         var8 = 1342507049;
         var10001 = var8 & ~var19 | ~var8 & var19;
         var19 = -1084905788;
         var8 = var10001;
         this.s = pulse.Bool.from(var8 + var19 - 2 * (var8 & var19));
         this.p = 0L;
         this.t = 0L;
         this.u = 0L;
         this.h.b();
      } else {
         this.d();
      }
   }

   @Override
   public void f() {
      super.f();
      this.p();
      int var10001 = (int)-6630719817980119280L;
      int var2 = 1101764286;
      int var1 = var10001;
      var10001 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1517461074;
      var1 = var10001;
      this.l = pulse.Bool.from((var1 | var2) & (~var1 | ~var2));
      var2 = 1473381535;
      var1 = -1494022498;
      var10001 = var1 + var2 - 2 * (var1 & var2);
      var2 = -249495039;
      var1 = var10001;
      this.o = var1 + var2 - 2 * (var1 & var2);
      var10001 = (int)-2311294904588484821L;
      var2 = 1825943880;
      var1 = var10001;
      var10001 = var1 + var2 - 2 * (var1 & var2);
      var2 = -603943325;
      var1 = var10001;
      this.s = pulse.Bool.from((var1 | var2) - (var1 & var2));
      this.u = 0L;
   }

   public static String c(String var0, String var1, int var2, int var3, int var4, int var5) {
      char[] var6 = var1.toCharArray();
      char[] var7 = new char[var6.length];
      int var20 = -533941619;
      int var19 = 1463352075;
      int var10000 = (var19 | var20) - (var19 & var20);
      var20 = -1223407220;
      var19 = var10000;
      char[] var267 = new char[var19 & ~var20 | ~var19 & var20];
      int var10002 = (int)5418976227646506374L;
      var20 = -1310335238;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = -1228022916;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      int var10003 = (int)-2122682940747263006L;
      var20 = 2129531502;
      var19 = var10003;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = -552334914;
      var19 = var10003;
      var267[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      var20 = -953604792;
      var19 = -1933379035;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = 1273749356;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var10003 = (int)-2195857974908846137L;
      var20 = -1769432314;
      var19 = var10003;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = -1026439356;
      var19 = var10003;
      var267[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      var20 = 144479202;
      var19 = -1253604858;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = -1109716506;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var10003 = (int)-2149917060791175622L;
      var20 = -1122875963;
      var19 = var10003;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = 1408176249;
      var19 = var10003;
      var267[var10002] = (char)((var19 | var20) & ~(var19 & var20));
      var20 = -1690618579;
      var19 = 1035659476;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = -1501438470;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      String var338 = "dsh";
      var20 = -49539075;
      var19 = -311289030;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = 276731092;
      var19 = var10003;
      var267[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      var10002 = (int)8517691488039953289L;
      var20 = 1427713464;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = -807121355;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = -2118142187;
      var19 = 718254728;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = 1508904712;
      var19 = var10003;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = -927585493;
      var19 = -2007977075;
      int var10004 = var19 + var20 - 2 * (var19 & var20);
      var20 = 387821148;
      var19 = var10004;
      var20 = var19 + var20 - 2 * (var19 & var20);
      var19 = var10003;
      var10003 = (var19 & ~var20) + (var20 & ~var19) + 2 * (var19 & var20);
      var10003 = (int)8355072333201143766L;
      var20 = -1972996940;
      var19 = var10003;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = -1757212089;
      var19 = var10003;
      var267[var10002] = (char)((var19 | var20) & ~(var19 & var20));
      var20 = 796644308;
      var19 = -830553233;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = -519761730;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = 1722930587;
      var19 = -377310388;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = -1892474027;
      var19 = var10003;
      var267[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      var20 = 278176304;
      var19 = 2106035279;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1829973625;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var10003 = (int)-8098290617083032180L;
      var20 = -2042222103;
      var19 = var10003;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = -1499124362;
      var19 = var10003;
      var267[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      var20 = -1186737283;
      var19 = 1001551410;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = -2098092728;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var10003 = (int)-2487770820978200418L;
      var20 = 1148716051;
      var19 = var10003;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = 964362415;
      var19 = var10003;
      var267[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      var10002 = (int)-2625631559942570120L;
      var20 = 784389218;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = -934171886;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var10003 = (int)-1762122415347664875L;
      var20 = 203701412;
      var19 = var10003;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = -631845662;
      var19 = var10003;
      var267[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      var20 = 2116837186;
      var19 = 2045688164;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = 130213423;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = 1449186218;
      var19 = 389090558;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = 1095882864;
      var19 = var10003;
      var267[var10002] = (char)((var19 | var20) - (var19 & var20));
      char[] var8 = var267;
      var20 = -672654230;
      var19 = -1941826379;
      var10000 = (var19 | var20) - (var19 & var20);
      var20 = 1537870037;
      var19 = var10000;
      char[] var269 = new char[(var19 | var20) & (~var19 | ~var20)];
      var20 = -1450595030;
      var19 = 1999746752;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = -558359574;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = 458815775;
      var19 = 1667519725;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = 2017256914;
      var19 = var10003;
      var269[var10002] = (char)((var19 | var20) & ~(var19 & var20));
      var10002 = (int)662739767301780553L;
      var20 = -2139057508;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = 403482324;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var10003 = (int)-162036851174301760L;
      var20 = 560155927;
      var19 = var10003;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = -311151764;
      var19 = var10003;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = 2069581052;
      var19 = -902331531;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = -1318302838;
      var19 = var10003;
      var269[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      var20 = -2056053635;
      var19 = 47742467;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = -2018811268;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = 340003746;
      var19 = 1679668176;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = 1468886912;
      var19 = var10003;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = 689543326;
      var19 = -1981136493;
      var10004 = (var19 | var20) - (var19 & var20);
      var20 = 2059147792;
      var19 = var10004;
      var20 = (var19 | var20) & ~(var19 & var20);
      var19 = var10003;
      var10003 = 2 * (var19 | var20) - (var19 ^ var20);
      var10003 = (int)-8071162696590656116L;
      var20 = -710162418;
      var19 = var10003;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = -2063650095;
      var19 = var10003;
      var269[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      var10002 = (int)-6785961145797690420L;
      var20 = -339276071;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1994863894;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var10003 = (int)2234687944021578787L;
      var20 = 922704959;
      var19 = var10003;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = 1774088222;
      var19 = var10003;
      var269[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      var20 = 257890352;
      var19 = 611655591;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = 724174739;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var10003 = (int)3645396725095231703L;
      var20 = -1161075942;
      var19 = var10003;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = 1516710797;
      var19 = var10003;
      var269[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      var10002 = (int)8369816123577473695L;
      var20 = 477280019;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = 1298050441;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = 1519501674;
      var19 = 1482675837;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = 47067011;
      var19 = var10003;
      var269[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      var20 = -902398426;
      var19 = -1996438703;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = 1127660913;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var10003 = (int)-3647853055719509453L;
      var20 = -1975941401;
      var19 = var10003;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = -359812844;
      var19 = var10003;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var10004 = (int)-107342236141829266L;
      var20 = 1898287799;
      var19 = var10004;
      var10004 = (var19 | var20) - (var19 & var20);
      var20 = 1125547785;
      var19 = var10004;
      var20 = (var19 | var20) - (var19 & var20);
      var19 = var10003;
      var10003 = (var19 | var20) + (var19 & var20);
      var20 = -299015319;
      var19 = -203231614;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = 500107986;
      var19 = var10003;
      var269[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      var10002 = (int)8724988451688070372L;
      var20 = 1986028696;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = 1646319739;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var10003 = (int)-6269483546237269588L;
      var20 = 1242779346;
      var19 = var10003;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = -951298234;
      var19 = var10003;
      var269[var10002] = (char)((var19 | var20) & ~(var19 & var20));
      var20 = 97360839;
      var19 = 1881982085;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1977704266;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      String var375 = "dsi";
      var20 = 1971587719;
      var19 = -109189142;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = -1929810327;
      var19 = var10003;
      var269[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      var10002 = (int)-430779370594653919L;
      var20 = 1709937237;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = -1161282691;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var10003 = (int)3370320200558794586L;
      var20 = -1774564361;
      var19 = var10003;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = 194719646;
      var19 = var10003;
      var269[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      char[] var9 = var269;
      var20 = 1322228589;
      var19 = 358676023;
      var10000 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1538223450;
      var19 = var10000;

      for (int var10 = var19 + var20 - 2 * (var19 & var20); var10 < var6.length; var10++) {
         if (a != a) {
            int var10001 = (int)7033929962127976L;
            var20 = -1717110013;
            var19 = var10001;
            var10001 = var19 + var20 - 2 * (var19 & var20);
            var20 = -379422353;
            var19 = var10001;
            var10001 = var19 & ~var20 | ~var19 & var20;
            var10001 = (int)5885967750119313519L;
            var20 = -664024999;
            var19 = var10001;
            var10001 = (var19 | var20) & (~var19 | ~var20);
            var20 = 288331835;
            var19 = var10001;
            var10001 = var19 & ~var20 | ~var19 & var20;
            var20 = -1855583839;
            var19 = 2081276355;
            var10000 = var19 & ~var20 | ~var19 & var20;
            var20 = -594613857;
            var19 = var10000;
            int var18 = var19 & ~var20 | ~var19 & var20;
         }

         char var329 = var6[var10];
         char var253 = var8[var10 % var8.length];
         char var131 = var329;
         var7[var10] = (char)((var131 | var253) - (var131 & var253));
      }

      char[] var21 = new char[var7.length];
      var10000 = (int)1022166842605733311L;
      var20 = -1828078534;
      var19 = var10000;
      var10000 = (var19 | var20) & ~(var19 & var20);
      var20 = 1908095365;
      var19 = var10000;

      for (int var11 = (var19 | var20) - (var19 & var20); var11 < var6.length; var11++) {
         char var330 = var7[var11];
         char var256 = var9[var11 % var9.length];
         char var134 = var330;
         var21[var11] = (char)((var134 | var256) & (~var134 | ~var256));
      }

      String var22 = new String(var21);
      int var12 = var22.hashCode();
      var20 = var5;
      var19 = var3;
      var10000 = 2 * (var19 & ~var20) - (var19 ^ var20);
      var20 = var2;
      var19 = var10000;
      int var13 = (var19 & ~var20) - (~var19 & var20);
      char[] var14 = var0.toCharArray();
      char[] var15 = new char[var14.length];
      var20 = -510336460;
      var19 = -1986448153;
      var10000 = (var19 | var20) & (~var19 | ~var20);
      var20 = 1745737427;
      var19 = var10000;

      for (int var16 = var19 + var20 - 2 * (var19 & var20); var16 < var15.length; var16++) {
         var20 = 807518782;
         var19 = -2067382753;
         int var281 = var19 + var20 - 2 * (var19 & var20);
         var20 = -1259865053;
         var19 = var281;
         switch (var16 % (var19 + var20 - 2 * (var19 & var20))) {
            case 0:
               var20 = var12;
               var19 = var13;
               var10002 = (var19 | var20) & ~(var19 & var20);
               char var266 = var14[var16];
               var19 = var10002;
               var15[var16] = (char)((var19 | var266) & ~(var19 & var266));
               break;
            case 1:
               var20 = var13;
               var19 = var5;
               var10002 = (var19 | var20) & ~(var19 & var20);
               char var264 = var14[var16];
               var19 = var10002;
               var15[var16] = (char)((var19 | var264) - (var19 & var264));
         }
      }

      return new String(var15);
   }
}
