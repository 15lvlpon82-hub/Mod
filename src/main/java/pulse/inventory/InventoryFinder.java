package pulse;


import pulse.client.MinecraftContext;
import java.util.Optional;
import java.util.function.Predicate;
import lombok.Generated;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;

public final class InventoryFinder implements MinecraftContext {
   public static int a;
   public static boolean b;

   public static Optional<Integer> a(Predicate<ItemStack> var0, boolean var1, boolean var2) {
      PlayerInventory var3 = c.player.getInventory();
      int var30;
      if (!var1) {
         var30 = (int)-3895066205012815378L;
         int var8 = -586120890;
         int var7 = var30;
         var30 = (var7 | var8) & (~var7 | ~var8);
         var8 = -1266315103;
         var7 = var30;
         var30 = (var7 | var8) & ~(var7 & var8);
      } else {
         int var20 = -893580863;
         int var10 = -656971848;
         var30 = (var10 | var20) & (~var10 | ~var20);
         var20 = 308964957;
         var10 = var30;
         var30 = var10 & ~var20 | ~var10 & var20;
      }

      int var4 = var30;
      var30 = (int)2965402896222656533L;
      int var22 = 1612758854;
      int var12 = var30;
      var30 = (var12 | var22) & ~(var12 & var22);
      var22 = 1701095251;
      var12 = var30;

      for (int var5 = (var12 | var22) & ~(var12 & var22); var5 < var4; var5++) {
         ItemStack var6 = var3.getStack(var5);
         if (var0.test(var6)) {
            if (var1 && !var2) {
               var22 = -274806893;
               var12 = -1338555406;
               int var10001 = (var12 | var22) & (~var12 | ~var22);
               var22 = 1604945000;
               var12 = var10001;
               if (var5 >= (var12 | var22) - (var12 & var22)) {
                  var30 = var5;
               } else {
                  var22 = -1811441181;
                  var12 = -210523246;
                  var10001 = (var12 | var22) & ~(var12 & var22);
                  var22 = 1735668309;
                  var12 = var10001;
                  var22 = var12 & ~var22 | ~var12 & var22;
                  var12 = var5;
                  var30 = (var12 ^ var22) + 2 * (var12 & var22);
               }

               return Optional.of(var30);
            }

            return Optional.of(var5);
         }
      }

      return Optional.empty();
   }

   @Generated
   private InventoryFinder() {
      int var10003 = (int)7450974017758944579L;
      int var2 = -913141626;
      int var1 = var10003;
      var10003 = var1 & ~var2 | ~var1 & var2;
      var2 = -1363325496;
      var1 = var10003;
      var10003 = (var1 | var2) & ~(var1 & var2);
      var2 = -1820193952;
      var1 = 1579853686;
      var10003 = (var1 | var2) & (~var1 | ~var2);
      var2 = -2044298655;
      var1 = var10003;
      var10003 = var1 & ~var2 | ~var1 & var2;
      var2 = -1320723285;
      var1 = 1468778942;
      int var10004 = (var1 | var2) & ~(var1 & var2);
      var2 = 1180364960;
      var1 = var10004;
      var10004 = var1 + var2 - 2 * (var1 & var2);
      int var10005 = (int)2679263039012311472L;
      var2 = -833058953;
      var1 = var10005;
      var10005 = (var1 | var2) - (var1 & var2);
      var2 = 862857214;
      var1 = var10005;
      var2 = var1 + var2 - 2 * (var1 & var2);
      var1 = var10004;
      var10004 = (var1 & ~var2) + (var2 & ~var1) + 2 * (var1 & var2);
      var10004 = (int)-1536043675338602531L;
      var2 = -449507039;
      var1 = var10004;
      var10004 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1335159172;
      var1 = var10004;
      var10004 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1194706470;
      var1 = 1505264524;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = 2044259167;
      var1 = var10005;
      var10005 = (var1 | var2) - (var1 & var2);
      int var10006 = (int)-5358181070691594845L;
      var2 = -186770175;
      var1 = var10006;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1333266400;
      var1 = var10006;
      var2 = var1 & ~var2 | ~var1 & var2;
      var1 = var10005;
      var10005 = (var1 ^ var2) + 2 * (var1 & var2);
      var10005 = (int)-8248175245387931244L;
      var2 = -1509466600;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1603045750;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = 187492910;
      var1 = 1160602736;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var2 = -2033642008;
      var1 = var10006;
      var10006 = (var1 | var2) - (var1 & var2);
      var2 = -897111963;
      var1 = 748546925;
      int var10007 = var1 & ~var2 | ~var1 & var2;
      var2 = 1250967243;
      var1 = var10007;
      var2 = (var1 | var2) & (~var1 | ~var2);
      var1 = var10006;
      var10006 = (var1 ^ var2) + 2 * (var1 & var2);
      var10006 = (int)-4506778330687011811L;
      var2 = -1951923367;
      var1 = var10006;
      var10006 = (var1 | var2) - (var1 & var2);
      var2 = -260629771;
      var1 = var10006;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var10007 = (int)8958868897214477156L;
      var2 = 416022123;
      var1 = var10007;
      var10007 = (var1 | var2) - (var1 & var2);
      var2 = -1748526393;
      var1 = var10007;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var2 = -2081009405;
      var1 = -1967791642;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var2 = 155580145;
      var1 = var10007;
      throw new UnsupportedOperationException(
         b(
            "ʦ䐎ʛ䐕˒䐏ʁ䑆ʓ䑆ʇ䐒ʛ䐊ʛ䐒ʋ䑆ʑ䐊ʓ䐕ʁ䑆ʓ䐈ʖ䑆ʑ䐇ʜ䐈ʝ䐒˒䐄ʗ䑆ʛ䐈ʁ䐒ʓ䐈ʆ䐏ʓ䐒ʗ䐂",
            "`ꟳꓺꁡꤐ絺蹙⑿譸㑢f\ua7ef꒹ꁢꥊ絟蹄⑬謂㑣{\ua7ea꒦",
            var10004,
            var10005,
            var10006,
            (var1 | var2) & (~var1 | ~var2)
         )
      );
   }

   public static String b(String var0, String var1, int var2, int var3, int var4, int var5) {
      char[] var6 = var1.toCharArray();
      char[] var7 = new char[var6.length];
      int var18 = 645254666;
      int var17 = 1999935404;
      int var10000 = (var17 | var18) & ~(var17 & var18);
      var18 = 1363237292;
      var17 = var10000;
      char[] var247 = new char[var17 & ~var18 | ~var17 & var18];
      var18 = -516278179;
      var17 = -1569735157;
      int var10002 = (var17 | var18) - (var17 & var18);
      var18 = 1129678422;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 272839937;
      var17 = 666966570;
      int var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 931292953;
      var17 = var10003;
      var247[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var10002 = (int)-7179528233367291156L;
      var18 = -1235897753;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -48985974;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 311413254;
      var17 = -1157323096;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -1450488021;
      var17 = var10003;
      var247[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var18 = 1366916709;
      var17 = 1809488312;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 983820255;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var10003 = (int)-4995984362533397622L;
      var18 = -1201074283;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -1750894695;
      var17 = var10003;
      var247[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var18 = 1212185992;
      var17 = -1686088994;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -742379691;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -1422689729;
      var17 = -1398273732;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1312887583;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1002515830;
      var17 = -207846057;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -933416910;
      var17 = var10003;
      var247[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var18 = 1452741850;
      var17 = 430014129;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 1328966255;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)-6339645864442525162L;
      var18 = 2143769762;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -2042292098;
      var17 = var10003;
      var10003 = (var17 + var18 - 2 * (var17 & var18)) * (var17 + var18 - 2 * (var17 & var18));
      var18 = -204816071;
      var17 = 95974751;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -160291517;
      var17 = var10003;
      var247[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var18 = -1441623224;
      var17 = -1274761313;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 504773842;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 14025529;
      var17 = 149761736;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 138111091;
      var17 = var10003;
      var247[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var18 = 1672851433;
      var17 = -1487351686;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -991068267;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)7557798541812854358L;
      var18 = 1045108735;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 653488314;
      var17 = var10003;
      var247[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var10002 = (int)5142410964641400397L;
      var18 = -1974205871;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 1590838299;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var10003 = (int)-4073090149098544411L;
      var18 = -998220265;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 676776144;
      var17 = var10003;
      var247[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var18 = 1608703414;
      var17 = -1623101002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1063015416;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var10003 = (int)4581630309146387427L;
      var18 = 385935638;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -875199834;
      var17 = var10003;
      var247[var10002] = (char)((var17 | var18) - (var17 & var18));
      var18 = 1571937257;
      var17 = 1924356558;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 788693550;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)2754299080728216539L;
      var18 = 2080800686;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -1141114031;
      var17 = var10003;
      var247[var10002] = (char)((var17 | var18) - (var17 & var18));
      char[] var8 = var247;
      var18 = -472784842;
      var17 = 1899549163;
      var10000 = var17 & ~var18 | ~var17 & var18;
      var18 = -1830211113;
      var17 = var10000;
      char[] var249 = new char[(var17 | var18) & ~(var17 & var18)];
      var18 = 1055011855;
      var17 = -1280546690;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -1924244367;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var10003 = (int)-6758885381595047956L;
      var18 = -1045617610;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -102810630;
      var17 = var10003;
      var249[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var18 = 1963314410;
      var17 = -67280955;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1896312018;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      int var10004 = (int)-1211153976698034426L;
      var18 = 707599445;
      var17 = var10004;
      var10004 = (var17 | var18) & (~var17 | ~var18);
      var18 = 548518736;
      var17 = var10004;
      var10004 = var17 + var18 - 2 * (var17 & var18);
      var18 = -96351903;
      var17 = 1621770270;
      var10004 = (var17 | var18) - (var17 & var18);
      var18 = -1695839878;
      var17 = var10004;
      var10004 = (var17 | var18) - (var17 & var18);
      var10003 = (int)-8260768014406503630L;
      var18 = 335761772;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 896001629;
      var17 = var10003;
      var249[var10002] = (char)((var17 | var18) - (var17 & var18));
      var10002 = (int)4380404208605579381L;
      var18 = -1002359607;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1630602050;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -309852577;
      var17 = -1460663918;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -1743994665;
      var17 = var10003;
      var10003 = ((var17 | var18) & (~var17 | ~var18)) * ((var17 | var18) & (~var17 | ~var18));
      var18 = 591721586;
      var17 = 497449651;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1055000978;
      var17 = var10003;
      var249[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var10002 = (int)-4129657210591806959L;
      var18 = 715202471;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -1138072139;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -54687202;
      var17 = 696667281;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -717488499;
      var17 = var10003;
      var249[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var18 = -567233835;
      var17 = -1194010794;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 1726244231;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -1111742712;
      var17 = 1232320161;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -187717143;
      var17 = var10003;
      var249[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var10002 = (int)-6478619765037271722L;
      var18 = 1152223057;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1519219202;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var10003 = (int)-5218044043192223627L;
      var18 = 1491808351;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1748750146;
      var17 = var10003;
      var249[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var18 = -769014519;
      var17 = 1053563467;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -320479420;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var10003 = (int)-1998498615403519302L;
      var18 = -1663263422;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 2009065860;
      var17 = var10003;
      var10003 = (var17 + var18 - 2 * (var17 & var18)) * (var17 + var18 - 2 * (var17 & var18));
      var18 = 122508392;
      var17 = -2096819182;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -2075605181;
      var17 = var10003;
      var249[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var10002 = (int)-5236978103797081126L;
      var18 = -480291190;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -1443738281;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -859514083;
      var17 = -500459600;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 787438741;
      var17 = var10003;
      var249[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var18 = 495005944;
      var17 = 1071876855;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 576895495;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -167768610;
      var17 = 552823043;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 685674153;
      var17 = var10003;
      var10003 = (var17 & ~var18 | ~var17 & var18) * (var17 & ~var18 | ~var17 & var18);
      var10003 = (int)-7294012049874786829L;
      var18 = 1123420541;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -650252406;
      var17 = var10003;
      var249[var10002] = (char)((var17 | var18) - (var17 & var18));
      var18 = 338603337;
      var17 = 998043213;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 793920269;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var10003 = (int)450003999898410168L;
      var18 = 1649535541;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -1826437698;
      var17 = var10003;
      var249[var10002] = (char)((var17 | var18) - (var17 & var18));
      char[] var9 = var249;
      var18 = -1256421206;
      var17 = -1932919307;
      var10000 = var17 & ~var18 | ~var17 & var18;
      var18 = 970290527;
      var17 = var10000;

      for (int var10 = var17 + var18 - 2 * (var17 & var18); var10 < var6.length; var10++) {
         if (a != a) {
            throw new IllegalAccessError();
         }

         char var299 = var6[var10];
         char var233 = var8[var10 % var8.length];
         char var120 = var299;
         var7[var10] = (char)(var120 + var233 - 2 * (var120 & var233));
      }

      char[] var19 = new char[var7.length];
      var18 = -961597696;
      var17 = 1458311010;
      var10000 = var17 & ~var18 | ~var17 & var18;
      var18 = -1874648990;
      var17 = var10000;

      for (int var11 = (var17 | var18) & ~(var17 & var18); var11 < var6.length; var11++) {
         char var300 = var7[var11];
         char var236 = var9[var11 % var9.length];
         char var123 = var300;
         var19[var11] = (char)(var123 & ~var236 | ~var123 & var236);
      }

      String var20 = new String(var19);
      int var12 = var20.hashCode();
      var18 = var5;
      var17 = var3;
      var10000 = var17 + ~var18 + 1;
      var18 = var2;
      var17 = var10000;
      int var13 = 2 * (var17 & ~var18) - (var17 ^ var18);
      char[] var14 = var0.toCharArray();
      char[] var15 = new char[var14.length];
      var18 = 1161917108;
      var17 = -621672452;
      var10000 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1615628984;
      var17 = var10000;

      for (int var16 = var17 + var18 - 2 * (var17 & var18); var16 < var15.length; var16++) {
         var18 = 1516072923;
         var17 = -367036091;
         int var10001 = (var17 | var18) - (var17 & var18);
         var18 = -1337846116;
         var17 = var10001;
         switch (var16 % ((var17 | var18) & ~(var17 & var18))) {
            case 0:
               var18 = var12;
               var17 = var13;
               var10002 = var17 + var18 - 2 * (var17 & var18);
               char var246 = var14[var16];
               var17 = var10002;
               var15[var16] = (char)((var17 | var246) - (var17 & var246));
               break;
            case 1:
               var18 = var13;
               var17 = var5;
               var10002 = var17 & ~var18 | ~var17 & var18;
               char var244 = var14[var16];
               var17 = var10002;
               var15[var16] = (char)(var17 + var244 - 2 * (var17 & var244));
         }
      }

      return new String(var15);
   }
}
