package pulse;



import pulse.module.ClientModule;
import pulse.module.ModuleInfo;
import pulse.module.ModuleCategory;
import pulse.settings.BooleanSetting;
import lombok.Generated;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.entity.ItemEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.network.packet.s2c.play.ItemPickupAnimationS2CPacket;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;

@ModuleInfo(a = "Item Pickup Logger", b = "Логирует поднятые предметы в чат", c = ModuleCategory.UTILITIES)
public class ItemPickupLogger extends ClientModule {
   private final BooleanSetting e;
   public static int a;
   public static boolean b;

   public ItemPickupLogger() {
      String var10003 = "div";
      int var2 = -1217691134;
      int var1 = 1657441222;
      int var10004 = var1 & ~var2 | ~var1 & var2;
      var2 = 105754036;
      var1 = var10004;
      var10004 = (var1 | var2) - (var1 & var2);
      var2 = 65302683;
      var1 = 1900369222;
      int var10005 = (var1 | var2) - (var1 & var2);
      var2 = -1909779201;
      var1 = var10005;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = 724036316;
      var1 = -563446591;
      int var10006 = (var1 | var2) & ~(var1 & var2);
      var2 = -669457410;
      var1 = var10006;
      var2 = var1 & ~var2 | ~var1 & var2;
      var1 = var10005;
      var10005 = var1 - ~var2 - 1;
      var10005 = (int)4217713514011805341L;
      var2 = 1487624710;
      var1 = var10005;
      var10005 = (var1 | var2) - (var1 & var2);
      var2 = 2121329669;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      String var59 = "diw";
      var10006 = (int)7790900669189843009L;
      var2 = 1990751378;
      var1 = var10006;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var2 = 2072528103;
      var1 = var10006;
      var10006 = (var1 | var2) - (var1 & var2);
      var2 = -2067999030;
      var1 = 2092035817;
      int var10008 = (var1 | var2) & (~var1 | ~var2);
      var2 = -133351381;
      var1 = var10008;
      var10008 = var1 + var2 - 2 * (var1 & var2);
      var10008 = (int)2211520280670306127L;
      var2 = -1515480854;
      var1 = var10008;
      var10008 = (var1 | var2) - (var1 & var2);
      var2 = -1018730592;
      var1 = var10008;
      var10008 = (var1 | var2) & ~(var1 & var2);
      var2 = -466781530;
      var1 = 887298483;
      var10008 = var1 + var2 - 2 * (var1 & var2);
      var2 = -791780603;
      var1 = var10008;
      var10008 = var1 + var2 - 2 * (var1 & var2);
      int var10007 = (int)-7243113436195096074L;
      var2 = -296402799;
      var1 = var10007;
      var10007 = (var1 | var2) - (var1 & var2);
      var2 = 1990374324;
      var1 = var10007;
      var10007 = (var1 | var2) & ~(var1 & var2);
      var10008 = (int)-6983664749361858318L;
      var2 = -581905643;
      var1 = var10008;
      var10008 = var1 & ~var2 | ~var1 & var2;
      var2 = -89127800;
      var1 = var10008;
      var10008 = (var1 | var2) & ~(var1 & var2);
      var10008 = (int)-7935762408897369196L;
      var2 = 845358616;
      var1 = var10008;
      var10008 = (var1 | var2) & ~(var1 & var2);
      var2 = 1102866600;
      var1 = var10008;
      var10003 = c(
         "盎捨盗挚盖捨狌换盒捫盜挔狌捩皬捣盘捪盙挔皧",
         "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7cf꒡ꁴ꤈絆蹃⑹謼㑢bꟊ꒺ꁶ꤂絳蹘\u2457謸㑳g\ua7ea꒰",
         var10005,
         var10006,
         var10007,
         (var1 | var2) & (~var1 | ~var2)
      );
      var2 = 49389858;
      var1 = -1987490844;
      var10004 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1955009850;
      var1 = var10004;
      this.e = new BooleanSetting(var10003, pulse.Bool.from(var1 + var2 - 2 * (var1 & var2)));
   }

   @EventHandler
   public void a(PacketEvent var1) {
      if (var1.e() == PacketEvent.MessageDirection.RECIEVE) {
         if (c.player != null && c.world != null) {
            if (var1.d() instanceof ItemPickupAnimationS2CPacket) {
               ItemPickupAnimationS2CPacket var2 = (ItemPickupAnimationS2CPacket)var1.d();
               if (var2.getCollectorEntityId() != c.player.getId()) {
                  return;
               }

               if (!(c.world.getEntityById(var2.getEntityId()) instanceof ItemEntity var4)) {
                  return;
               }

               ItemStack var5 = var4.getStack();
               if (var5.isEmpty()) {
                  return;
               }

               boolean var6 = this.a(var5);
               if (this.e.k() && !var6) {
                  return;
               }

               Text var7 = var5.getName();
               int var8 = var5.getCount();
               MutableText var9;
               if (!var6) {
                  String var10000 = "diz";
                  int var12 = -327363414;
                  int var11 = -510265521;
                  int var10002 = (var11 | var12) & (~var11 | ~var12);
                  var12 = 233382900;
                  var11 = var10002;
                  var10002 = (var11 | var12) & ~(var11 & var12);
                  var10002 = (int)1362654132448078964L;
                  var12 = 431866860;
                  var11 = var10002;
                  var10002 = var11 & ~var12 | ~var11 & var12;
                  var12 = -1510674539;
                  var11 = var10002;
                  var10002 = (var11 | var12) & ~(var11 & var12);
                  var10002 = (int)-8042766173702609091L;
                  var12 = 710963251;
                  var11 = var10002;
                  var10002 = var11 + var12 - 2 * (var11 & var12);
                  var12 = 781047553;
                  var11 = var10002;
                  var10002 = var11 & ~var12 | ~var11 & var12;
                  var12 = 1165534730;
                  var11 = 102095488;
                  var10002 = (var11 | var12) & (~var11 | ~var12);
                  var12 = 164558758;
                  var11 = var10002;
                  var10002 = (var11 | var12) - (var11 & var12);
                  var12 = -1517180;
                  var11 = -1746327048;
                  var10002 = var11 + var12 - 2 * (var11 & var12);
                  var12 = 2043904226;
                  var11 = var10002;
                  var10002 = (var11 | var12) & ~(var11 & var12);
                  int var10003 = (int)5924849644897282590L;
                  var12 = -813771810;
                  var11 = var10003;
                  var10003 = (var11 | var12) & (~var11 | ~var12);
                  var12 = 1316552550;
                  var11 = var10003;
                  var10003 = var11 + var12 - 2 * (var11 & var12);
                  var10003 = (int)-8248936899128446747L;
                  var12 = -487154853;
                  var11 = var10003;
                  var10003 = (var11 | var12) - (var11 & var12);
                  var12 = -678673993;
                  var11 = var10003;
                  var10003 = (var11 | var12) - (var11 & var12);
                  int var10004 = (int)729864610654770587L;
                  var12 = -519433701;
                  var11 = var10004;
                  var10004 = (var11 | var12) & ~(var11 & var12);
                  var12 = -296943768;
                  var11 = var10004;
                  var10004 = (var11 | var12) & ~(var11 & var12);
                  var12 = 1624820003;
                  var11 = 1301938067;
                  int var10005 = (var11 | var12) & ~(var11 & var12);
                  var12 = 6179104;
                  var11 = var10005;
                  var12 = (var11 | var12) & ~(var11 & var12);
                  var11 = var10004;
                  var10004 = (var11 ^ var12) + 2 * (var11 & var12);
                  var12 = 1107525679;
                  var11 = 106074873;
                  var10004 = var11 + var12 - 2 * (var11 & var12);
                  var12 = 1537420297;
                  var11 = var10004;
                  var10004 = (var11 | var12) - (var11 & var12);
                  var10005 = (int)2656989707074381186L;
                  var12 = -626906127;
                  var11 = var10005;
                  var10005 = (var11 | var12) - (var11 & var12);
                  var12 = -1388354877;
                  var11 = var10005;
                  var10005 = (var11 & ~var12 | ~var11 & var12) * (var11 & ~var12 | ~var11 & var12);
                  var12 = 1678623491;
                  var11 = 1404284078;
                  var10005 = (var11 | var12) & (~var11 | ~var12);
                  var12 = 939473289;
                  var11 = var10005;
                  var9 = Text.literal(
                        c(
                           "卾畔埆煝埭煞垖無口畃",
                           "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7cf꒡ꁴ꤈絆蹃⑹謼㑢bꟊ꒺ꁶ꤂絳蹘\u2457謸㑳g\ua7ea꒰",
                           var10002,
                           var10003,
                           var10004,
                           (var11 | var12) - (var11 & var12)
                        )
                     )
                     .append(var7);
               } else {
                  String var149 = "dix";
                  int var10001 = (int)6543316702809900507L;
                  int var105 = -1199673173;
                  int var37 = var10001;
                  var10001 = (var37 | var105) - (var37 & var105);
                  var105 = 1072406523;
                  var37 = var10001;
                  var10001 = (var37 | var105) - (var37 & var105);
                  int var167 = (int)3737389019061637892L;
                  var105 = -690991941;
                  var37 = var167;
                  var167 = (var37 | var105) & (~var37 | ~var105);
                  var105 = 2055602904;
                  var37 = var167;
                  var105 = var37 + var105 - 2 * (var37 & var105);
                  var37 = var10001;
                  var10001 = var37 - ~var105 - 1;
                  String var169 = "diy";
                  var105 = 1227866565;
                  var37 = 1737276746;
                  var167 = var37 & ~var105 | ~var37 & var105;
                  var105 = 1064373265;
                  var37 = var167;
                  var167 = var37 & ~var105 | ~var37 & var105;
                  int var180 = (int)-3325999136455219663L;
                  var105 = 1103729439;
                  var37 = var180;
                  var180 = (var37 | var105) - (var37 & var105);
                  var105 = 1637158219;
                  var37 = var180;
                  var180 = ((var37 | var105) & ~(var37 & var105)) * ((var37 | var105) & ~(var37 & var105));
                  var105 = -265439138;
                  var37 = -1370022863;
                  var180 = var37 + var105 - 2 * (var37 & var105);
                  var105 = 1003236431;
                  var37 = var180;
                  var180 = var37 & ~var105 | ~var37 & var105;
                  var105 = 867580562;
                  var37 = -359101817;
                  int var193 = var37 + var105 - 2 * (var37 & var105);
                  var105 = 293073087;
                  var37 = var193;
                  var193 = (var37 | var105) & ~(var37 & var105);
                  var193 = (int)1290067091105567342L;
                  var105 = 1017632780;
                  var37 = var193;
                  var193 = var37 & ~var105 | ~var37 & var105;
                  var105 = 300488436;
                  var37 = var193;
                  var193 = (var37 | var105) - (var37 & var105);
                  var105 = -253033224;
                  var37 = 1012063950;
                  int var206 = var37 & ~var105 | ~var37 & var105;
                  var105 = -2055638965;
                  var37 = var206;
                  var206 = ((var37 | var105) - (var37 & var105)) * ((var37 | var105) - (var37 & var105));
                  var105 = -948161497;
                  var37 = 508061264;
                  var206 = (var37 | var105) & (~var37 | ~var105);
                  var105 = -646011316;
                  var37 = var206;
                  var9 = Text.literal(
                        c(
                           "卾흋埆퍂埭퍁垖팾叹퍈埧퍁埩팾叹퍃垙퍉埭퍀埬팾口흜",
                           "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7cf꒡ꁴ꤈絆蹃⑹謼㑢bꟊ꒺ꁶ꤂絳蹘\u2457謸㑳g\ua7ea꒰",
                           var167,
                           var180,
                           var193,
                           var37 & ~var105 | ~var37 & var105
                        )
                     )
                     .append(var7);
               }

               int var153 = (int)-4165064803115964788L;
               int var124 = 1656268178;
               int var56 = var153;
               var153 = (var56 | var124) & ~(var56 & var124);
               var124 = 1702019871;
               var56 = var153;
               if (var8 > ((var56 | var124) & (~var56 | ~var124))) {
                  int var10 = var8;
                  StringBuilder var155 = new StringBuilder();
                  int var172 = (int)-2565807655142737909L;
                  var124 = 179147913;
                  var56 = var172;
                  var172 = var56 + var124 - 2 * (var56 & var124);
                  var124 = 1819784015;
                  var56 = var172;
                  var172 = var56 + var124 - 2 * (var56 & var124);
                  int var185 = (int)-4092333382278312442L;
                  var124 = 155039701;
                  var56 = var185;
                  var185 = var56 + var124 - 2 * (var56 & var124);
                  var124 = -1212245832;
                  var56 = var185;
                  var185 = (var56 | var124) & (~var56 | ~var124);
                  var124 = 35532102;
                  var56 = -425930417;
                  int var198 = var56 & ~var124 | ~var56 & var124;
                  var124 = -420581422;
                  var56 = var198;
                  var198 = (var56 & ~var124 | ~var56 & var124) * (var56 & ~var124 | ~var56 & var124);
                  var124 = -1270753538;
                  var56 = -814655854;
                  var198 = (var56 | var124) - (var56 & var124);
                  var124 = 1793257714;
                  var56 = var198;
                  var198 = var56 + var124 - 2 * (var56 & var124);
                  int var10006 = (int)5265333191093534533L;
                  var124 = -1174000443;
                  var56 = var10006;
                  var10006 = (var56 | var124) & ~(var56 & var124);
                  var124 = 1429345153;
                  var56 = var10006;
                  var10006 = var56 & ~var124 | ~var56 & var124;
                  var124 = -1986752102;
                  var56 = 2060385331;
                  int var209 = (var56 | var124) & ~(var56 & var124);
                  var124 = -1764323391;
                  var56 = var209;
                  var209 = var56 & ~var124 | ~var56 & var124;
                  var10006 = (int)-783067030844094296L;
                  var124 = 390313462;
                  var56 = var10006;
                  var10006 = var56 & ~var124 | ~var56 & var124;
                  var124 = -322673552;
                  var56 = var10006;
                  var10006 = var56 + var124 - 2 * (var56 & var124);
                  var124 = 2123664584;
                  var56 = -458345583;
                  var10006 = (var56 | var124) - (var56 & var124);
                  var124 = -1841090100;
                  var56 = var10006;
                  var10006 = (var56 | var124) & ~(var56 & var124);
                  var124 = -909120725;
                  var56 = -1208990880;
                  int var10007 = (var56 | var124) & ~(var56 & var124);
                  var124 = -1988606766;
                  var56 = var10007;
                  var10007 = var56 + var124 - 2 * (var56 & var124);
                  int var10008 = (int)-1572979734551770166L;
                  var124 = -1190948262;
                  var56 = var10008;
                  var10008 = (var56 | var124) & (~var56 | ~var124);
                  var124 = 783674551;
                  var56 = var10008;
                  var124 = (var56 | var124) & ~(var56 & var124);
                  var56 = var10007;
                  var10007 = (var56 & ~var124) + (var124 & ~var56) + 2 * (var56 & var124);
                  var10007 = (int)-195696208594766093L;
                  var124 = 1424972125;
                  var56 = var10007;
                  var10007 = (var56 | var124) - (var56 & var124);
                  var124 = -1642110675;
                  var56 = var10007;
                  var9.append(
                     Text.literal(
                        var155.append(
                              c(
                                 "叹浣叮涼",
                                 "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7cf꒡ꁴ꤈絆蹃⑹謼㑢bꟊ꒺ꁶ꤂絳蹘\u2457謸㑳g\ua7ea꒰",
                                 var198,
                                 var209,
                                 var10006,
                                 (var56 | var124) - (var56 & var124)
                              )
                           )
                           .append(var10)
                           .toString()
                     )
                  );
               }

               ChatMessages.b(var9);
            }
         }
      }
   }

   private boolean a(ItemStack var1) {
      Text var2 = var1.getName();
      String var3 = var2.getString();
      int var10001 = (int)2201900685391130295L;
      int var10 = 773176702;
      int var9 = var10001;
      var10001 = (var9 | var10) & (~var9 | ~var10);
      var10 = -79746541;
      var9 = var10001;
      var10001 = (var9 | var10) & ~(var9 & var10);
      var10 = -483663503;
      var9 = 474772118;
      int var10002 = (var9 | var10) - (var9 & var10);
      var10 = 1546888457;
      var9 = var10002;
      var10002 = (var9 & ~var10 | ~var9 & var10) * (var9 & ~var10 | ~var9 & var10);
      int var10003 = (int)-5856005699325103248L;
      var10 = 1929237384;
      var9 = var10003;
      var10003 = (var9 | var10) - (var9 & var10);
      var10 = 304009079;
      var9 = var10003;
      var10003 = (var9 + var10 - 2 * (var9 & var10)) * (var9 + var10 - 2 * (var9 & var10));
      var10 = -891810106;
      var9 = 2050615918;
      var10003 = (var9 | var10) & (~var9 | ~var10);
      var10 = -1590455242;
      var9 = var10003;
      var10003 = var9 + var10 - 2 * (var9 & var10);
      String var10004 = "dja";
      int var92 = (int)7500633993403507357L;
      var10 = -242685570;
      var9 = var92;
      int var93 = (var9 | var10) - (var9 & var10);
      var10 = 1304825561;
      var9 = var93;
      int var94 = (var9 | var10) - (var9 & var10);
      var10 = 1714892471;
      var9 = 1597964349;
      int var10005 = var9 + var10 - 2 * (var9 & var10);
      var10 = -729226126;
      var9 = var10005;
      var10005 = (var9 | var10) & (~var9 | ~var10);
      int var10006 = (int)-6965617929633152206L;
      var10 = 341034818;
      var9 = var10006;
      var10006 = (var9 | var10) - (var9 & var10);
      var10 = -240828373;
      var9 = var10006;
      var10 = (var9 | var10) - (var9 & var10);
      var9 = var10005;
      var10005 = var9 - ~var10 - 1;
      var10005 = (int)-2856235230549115530L;
      var10 = -335684200;
      var9 = var10005;
      var10005 = var9 & ~var10 | ~var9 & var10;
      var10 = 656112301;
      var9 = var10005;
      var10005 = var9 + var10 - 2 * (var9 & var10);
      var10006 = (int)4184865277041225118L;
      var10 = 995234604;
      var9 = var10006;
      var10006 = (var9 | var10) & (~var9 | ~var10);
      var10 = 267552532;
      var9 = var10006;
      var10006 = (var9 | var10) & ~(var9 & var10);
      var10006 = (int)7918488167245149090L;
      var10 = 1821475036;
      var9 = var10006;
      var10006 = (var9 | var10) & (~var9 | ~var10);
      var10 = -765616434;
      var9 = var10006;
      if (var3.contains(
         c("ぷ", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7cf꒡ꁴ꤈絆蹃⑹謼㑢bꟊ꒺ꁶ꤂絳蹘\u2457謸㑳g\ua7ea꒰", var10003, var94, var10005, var9 + var10 - 2 * (var9 & var10))
      )) {
         var10 = -1749778534;
         var9 = 1098161497;
         int var84 = var9 & ~var10 | ~var9 & var10;
         var10 = -692002110;
         var9 = var84;
         return pulse.Bool.from((var9 | var10) & (var9 ^ -1 | var10 ^ -1));
      }

      if (var2 instanceof MutableText var4) {
         if (var4.getStyle().isObfuscated()) {
            int var82 = (int)-899133859739723823L;
            var10 = 313363197;
            var9 = var82;
            var82 = (var9 | var10) - (var9 & var10);
            var10 = -1508008659;
            var9 = var82;
            return pulse.Bool.from(var9 + var10 - 2 * (var9 & var10));
         }

         if (b) {
            var10 = 691210116;
            var9 = 1808905415;
            int var10000 = (var9 | var10) - (var9 & var10);
            var10 = 996981364;
            var9 = var10000;
            var10000 = var9 + var10 - 2 * (var9 & var10);
            var10000 = (int)-6298272546090724502L;
            var10 = -1853845382;
            var9 = var10000;
            var10000 = (var9 | var10) & (~var9 | ~var10);
            var10 = 1751816698;
            var9 = var10000;
            int var8 = (var9 | var10) - (var9 & var10);
            a = var8;
         }

         for (Text var6 : var4.getSiblings()) {
            if (var6.getStyle().isObfuscated()) {
               int var78 = (int)-7326180739482816277L;
               var10 = 134406567;
               var9 = var78;
               var78 = (var9 | var10) - (var9 & var10);
               var10 = -288124595;
               var9 = var78;
               return pulse.Bool.from((var9 | var10) & (var9 ^ -1 | var10 ^ -1));
            }
         }
      }

      int var80 = (int)6097719462654335985L;
      var10 = -941925119;
      var9 = var80;
      var80 = (var9 | var10) & ~(var9 & var10);
      var10 = -2002516240;
      var9 = var80;
      return pulse.Bool.from((var9 | var10) - (var9 & var10));
   }

   @Generated
   public BooleanSetting n() {
      return this.e;
   }

   public static String c(String var0, String var1, int var2, int var3, int var4, int var5) {
      char[] var6 = var1.toCharArray();
      char[] var7 = new char[var6.length];
      int var10000 = (int)2087440340260500015L;
      int var20 = 30728355;
      int var19 = var10000;
      var10000 = var19 + var20 - 2 * (var19 & var20);
      var20 = 47764102;
      var19 = var10000;
      char[] var330 = new char[var19 & ~var20 | ~var19 & var20];
      int var10002 = (int)8472682269920175819L;
      var20 = 717556125;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = 1267904342;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = -416079563;
      var19 = 700201508;
      int var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = -829467869;
      var19 = var10003;
      var330[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      var20 = 2086245569;
      var19 = -1402509366;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = -801180918;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var10003 = (int)-3433654488677811748L;
      var20 = -1220024145;
      var19 = var10003;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = -408341770;
      var19 = var10003;
      var330[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      var10002 = (int)142050458234746796L;
      var20 = 2004855571;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = -398664515;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1136756597;
      var19 = 1550279798;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = 531021957;
      var19 = var10003;
      var330[var10002] = (char)((var19 | var20) - (var19 & var20));
      var10002 = (int)8710611495299541611L;
      var20 = -1793099083;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = -2065952547;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      int var10004 = (int)-1824600338683898934L;
      var20 = 12728141;
      var19 = var10004;
      var10004 = (var19 | var20) - (var19 & var20);
      var20 = -1150131049;
      var19 = var10004;
      var10004 = (var19 | var20) - (var19 & var20);
      var20 = -674370495;
      var19 = -2038068814;
      var10004 = (var19 | var20) & (~var19 | ~var20);
      var20 = 1363699185;
      var19 = var10004;
      var10004 = (var19 | var20) - (var19 & var20);
      var10004 = (int)2363802569078109675L;
      var20 = 801882859;
      var19 = var10004;
      var10004 = (var19 | var20) & ~(var19 & var20);
      var20 = -1899645177;
      var19 = var10004;
      var10004 = (var19 | var20) & ~(var19 & var20);
      var20 = -1603016510;
      var19 = -753096680;
      var10004 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1936670942;
      var19 = var10004;
      var10004 = var19 & ~var20 | ~var19 & var20;
      var20 = -276627049;
      var19 = -1305885813;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = 1571445263;
      var19 = var10003;
      var330[var10002] = (char)((var19 | var20) & ~(var19 & var20));
      var20 = 1640413932;
      var19 = 1395914678;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = 854936926;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      String var422 = "djb";
      var20 = 2094933429;
      var19 = 261885883;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = 1933753131;
      var19 = var10003;
      var330[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      var10002 = (int)-2591195458919453200L;
      var20 = 298184357;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = 1715848016;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var10003 = (int)7644949797851866593L;
      var20 = 249622763;
      var19 = var10003;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = 742854792;
      var19 = var10003;
      var330[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      var20 = 378904834;
      var19 = 444610258;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = 202741718;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var10003 = (int)-4537723113377720460L;
      var20 = 1426952677;
      var19 = var10003;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = -1626927230;
      var19 = var10003;
      var330[var10002] = (char)((var19 | var20) - (var19 & var20));
      var10002 = (int)-5332152099398849009L;
      var20 = 1814073406;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = -824508874;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = -1462234033;
      var19 = -1751987564;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = 1061874425;
      var19 = var10003;
      var330[var10002] = (char)((var19 | var20) - (var19 & var20));
      var20 = 1788828667;
      var19 = -1197306925;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = -767700960;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var10003 = (int)207786270247999343L;
      var20 = 1184444475;
      var19 = var10003;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = 1305276167;
      var19 = var10003;
      var330[var10002] = (char)((var19 | var20) & ~(var19 & var20));
      var10002 = (int)2300361126244692134L;
      var20 = 1557515508;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = -197428133;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = 349151751;
      var19 = 771224667;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = 959992184;
      var19 = var10003;
      var330[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      char[] var8 = var330;
      var20 = -709421350;
      var19 = -1892881855;
      var10000 = (var19 | var20) & (~var19 | ~var20);
      var20 = 1520172177;
      var19 = var10000;
      char[] var332 = new char[(var19 | var20) & (~var19 | ~var20)];
      var10002 = (int)-5986730282226812463L;
      var20 = 1121518020;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = 1125316629;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var10003 = (int)5953271179040687103L;
      var20 = 909309161;
      var19 = var10003;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = 1081622326;
      var19 = var10003;
      var332[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      var20 = 1122569327;
      var19 = 1361083918;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = 331969120;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var10004 = (int)-6267582052774501671L;
      var20 = 1506474939;
      var19 = var10004;
      var10004 = (var19 | var20) - (var19 & var20);
      var20 = 638179692;
      var19 = var10004;
      var10004 = (var19 | var20) & (~var19 | ~var20);
      var20 = 696759804;
      var19 = -979920053;
      var10004 = (var19 | var20) & ~(var19 & var20);
      var20 = -334483785;
      var19 = var10004;
      var10004 = (var19 | var20) & ~(var19 & var20);
      var10004 = (int)7356125884874888009L;
      var20 = -905651259;
      var19 = var10004;
      var10004 = (var19 | var20) - (var19 & var20);
      var20 = 1493354638;
      var19 = var10004;
      var10004 = (var19 | var20) & (~var19 | ~var20);
      var20 = 277776113;
      var19 = -1125637575;
      var10004 = (var19 | var20) & (~var19 | ~var20);
      var20 = -1402559272;
      var19 = var10004;
      var10004 = (var19 | var20) & ~(var19 & var20);
      var20 = 1613108980;
      var19 = 1530020807;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = 991220016;
      var19 = var10003;
      var332[var10002] = (char)((var19 | var20) - (var19 & var20));
      var10002 = (int)-3071616367702667485L;
      var20 = 1121337271;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = 1310240918;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = 685716314;
      var19 = -1666454744;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = 2124477593;
      var19 = var10003;
      var10003 = ((var19 | var20) & ~(var19 & var20)) * ((var19 | var20) & ~(var19 & var20));
      var20 = -1271198592;
      var19 = -1648678653;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = 696296144;
      var19 = var10003;
      var332[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      var10002 = (int)8081258047977821790L;
      var20 = 2056037977;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = -1385123836;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var10003 = (int)4889059255149033292L;
      var20 = 1119825748;
      var19 = var10003;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = 2118213658;
      var19 = var10003;
      var332[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      var10002 = (int)1030266065630656913L;
      var20 = -1338438357;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = -2110458690;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var10003 = (int)-4899910249597161307L;
      var20 = -385829532;
      var19 = var10003;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = 1417133441;
      var19 = var10003;
      var332[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      var20 = 1621934723;
      var19 = -353877629;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = -1975221499;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = -328105945;
      var19 = -391671851;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = 81147750;
      var19 = var10003;
      var332[var10002] = (char)((var19 | var20) - (var19 & var20));
      var20 = 349906327;
      var19 = -1930998370;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = -1740871665;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = -765364798;
      var19 = 1521343339;
      var10004 = (var19 | var20) - (var19 & var20);
      var20 = -1999851863;
      var19 = var10004;
      var10004 = (var19 | var20) & (~var19 | ~var20);
      var20 = -1799540302;
      var19 = -894102823;
      var10004 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1577591659;
      var19 = var10004;
      var10004 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1941894014;
      var19 = 548456470;
      var10004 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1393441659;
      var19 = var10004;
      var10004 = var19 + var20 - 2 * (var19 & var20);
      var20 = -1000660838;
      var19 = 1132353900;
      var10004 = (var19 | var20) & ~(var19 & var20);
      var20 = -2027587074;
      var19 = var10004;
      var10004 = (var19 | var20) & ~(var19 & var20);
      var10003 = (int)7676187966088955844L;
      var20 = 156263010;
      var19 = var10003;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = -91446625;
      var19 = var10003;
      var332[var10002] = (char)((var19 | var20) & ~(var19 & var20));
      var20 = -1798560782;
      var19 = -1376956031;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = 958493300;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = 1541456532;
      var19 = -1838100761;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = -913302453;
      var19 = var10003;
      var332[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      var20 = 1027174697;
      var19 = -1546387198;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = -1628606429;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = -509546877;
      var19 = -2015788707;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = -1854592101;
      var19 = var10003;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1722834181;
      var19 = -2002773807;
      var10004 = (var19 | var20) - (var19 & var20);
      var20 = 306490033;
      var19 = var10004;
      var20 = (var19 | var20) & (~var19 | ~var20);
      var19 = var10003;
      var10003 = 2 * (var19 | var20) - (var19 ^ var20);
      var10003 = (int)-3998049604293733790L;
      var20 = 1212653921;
      var19 = var10003;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = 233402375;
      var19 = var10003;
      var332[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      var20 = -346798050;
      var19 = 727436518;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = -1072724751;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = -1731789881;
      var19 = 1554185660;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = -1000065720;
      var19 = var10003;
      var332[var10002] = (char)((var19 | var20) - (var19 & var20));
      char[] var9 = var332;
      var10000 = (int)-4520105691407634801L;
      var20 = -2038834954;
      var19 = var10000;
      var10000 = var19 & ~var20 | ~var19 & var20;
      var20 = -99289479;
      var19 = var10000;

      for (int var10 = (var19 | var20) & ~(var19 & var20); var10 < var6.length; var10++) {
         char var414 = var6[var10];
         char var293 = var8[var10 % var8.length];
         char var141 = var414;
         var7[var10] = (char)((var141 | var293) & (~var141 | ~var293));
      }

      char[] var21 = new char[var7.length];
      var20 = -2055495696;
      var19 = 1602356704;
      var10000 = (var19 | var20) & (~var19 | ~var20);
      var20 = -621176304;
      var19 = var10000;

      for (int var11 = (var19 | var20) & ~(var19 & var20); var11 < var6.length; var11++) {
         if (a != a) {
            var20 = -372944842;
            var19 = -1758422155;
            var10000 = (var19 | var20) & (~var19 | ~var20);
            var20 = 2130037571;
            var19 = var10000;
            var10000 = (var19 | var20) & (~var19 | ~var20);
            int var10001 = (int)6617709420848496160L;
            var20 = -43104826;
            var19 = var10001;
            var10001 = (var19 | var20) & ~(var19 & var20);
            var20 = 83917798;
            var19 = var10001;
            var10000 /= var19 + var20 - 2 * (var19 & var20);
         }

         char var415 = var7[var11];
         char var300 = var9[var11 % var9.length];
         char var148 = var415;
         var21[var11] = (char)(var148 + var300 - 2 * (var148 & var300));
      }

      String var22 = new String(var21);
      int var12 = var22.hashCode();
      var20 = var5;
      var19 = var3;
      var10000 = var19 + ~var20 + 1;
      var20 = var2;
      var19 = var10000;
      int var13 = 2 * (var19 & ~var20) - (var19 ^ var20);
      char[] var14 = var0.toCharArray();
      char[] var15 = new char[var14.length];
      var20 = -1561890955;
      var19 = -1509385642;
      var10000 = (var19 | var20) & ~(var19 & var20);
      var20 = 82834723;
      var19 = var10000;
      int var16 = var19 + var20 - 2 * (var19 & var20);
      int var359 = (int)-6220268693309331296L;
      var20 = 791434891;
      var19 = var359;
      var359 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1090272801;
      var19 = var359;
      var359 = (var19 | var20) & (~var19 | ~var20);
      var20 = 1919762844;
      var19 = -2026320047;
      var359 = (var19 | var20) & (~var19 | ~var20);
      var20 = -178942268;
      var19 = var359;
      var359 = var19 & ~var20 | ~var19 & var20;
      var20 = 1027057523;
      var19 = -1729606586;
      var10000 = var19 + var20 - 2 * (var19 & var20);
      var20 = -1565114857;
      var19 = var10000;
      int var18 = (var19 | var20) - (var19 & var20);
      a = var18;
      var10000 = (int)7240144222862881425L;
      var20 = 774583082;
      var19 = var10000;
      var10000 = var19 + var20 - 2 * (var19 & var20);
      var20 = 862168980;
      var19 = var10000;
      var10000 = ((var19 | var20) & ~(var19 & var20)) * ((var19 | var20) & ~(var19 & var20));
      var10000 = (int)7238002873285377274L;
      var20 = 1481306817;
      var19 = var10000;
      var10000 = (var19 | var20) & ~(var19 & var20);
      var20 = -1248114632;
      var19 = var10000;
      if (((var19 | var20) & ~(var19 & var20)) <= a) {
         var10000 = (int)6428917246807678057L;
         var20 = -1448662038;
         var19 = var10000;
         var10000 = var19 & ~var20 | ~var19 & var20;
         var20 = -218897260;
         var19 = var10000;
         var10000 = (var19 | var20) & (~var19 | ~var20);
         var10000 = (int)8348826726975201968L;
         var20 = 512524429;
         var19 = var10000;
         var10000 = (var19 | var20) & (~var19 | ~var20);
         var20 = 1334447455;
         var19 = var10000;
         var18 = var19 & ~var20 | ~var19 & var20;
      }

      for (; var16 < var15.length; var16++) {
         var20 = -538869224;
         var19 = 1249535026;
         var359 = (var19 | var20) - (var19 & var20);
         var20 = -1784945112;
         var19 = var359;
         switch (var16 % ((var19 | var20) - (var19 & var20))) {
            case 0:
               var20 = var12;
               var19 = var13;
               var10002 = var19 & ~var20 | ~var19 & var20;
               int var324 = var14[var16];
               var19 = var10002;
               var15[var16] = (char)(var19 & ~var324 | ~var19 & var324);
               String var352 = "djc";
               var10000 = (int)-2161560232498839808L;
               var324 = -198786382;
               var19 = var10000;
               var10000 = var19 + var324 - 2 * (var19 & var324);
               var324 = 1258828702;
               var19 = var10000;
               var18 = var19 & ~var324 | ~var19 & var324;
               a = var18;
               String var355 = "djd";
               var10000 = (int)-6685690153326510514L;
               var324 = 981294386;
               var19 = var10000;
               var10000 = var19 & ~var324 | ~var19 & var324;
               var324 = 311021036;
               var19 = var10000;
               if (var19 + var324 - 2 * (var19 & var324) < a) {
                  throw new RuntimeException();
               }
               break;
            case 1:
               var20 = var13;
               var19 = var5;
               var10002 = var19 + var20 - 2 * (var19 & var20);
               char var322 = var14[var16];
               var19 = var10002;
               var15[var16] = (char)(var19 + var322 - 2 * (var19 & var322));
         }
      }

      return new String(var15);
   }
}
