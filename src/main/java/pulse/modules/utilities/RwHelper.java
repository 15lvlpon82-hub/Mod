package pulse;



import pulse.module.ClientModule;
import pulse.module.ModuleInfo;
import pulse.module.ModuleCategory;
import pulse.settings.BooleanSetting;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import meteordevelopment.orbit.EventHandler;

@ModuleInfo(a = "RW Helper", b = "Автоматически закрывает меню сервера или фильтрует запрещенные сообщения в чате", c = ModuleCategory.UTILITIES)
public class RwHelper extends ClientModule {
   private final BooleanSetting a;
   private final BooleanSetting b;
   private Set<String> e;

   public RwHelper() {
      int var10005 = (int)4265152300203234921L;
      int var2 = 511192780;
      int var1 = var10005;
      var10005 = (var1 | var2) - (var1 & var2);
      var2 = -615920553;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      int var10006 = (int)-1196082017800891252L;
      var2 = -1579334902;
      var1 = var10006;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1331380305;
      var1 = var10006;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1706402616;
      var1 = 464677212;
      int var10007 = var1 & ~var2 | ~var1 & var2;
      var2 = -1799755491;
      var1 = var10007;
      var10007 = var1 & ~var2 | ~var1 & var2;
      int var10008 = (int)-4355434413300394617L;
      var2 = -868839998;
      var1 = var10008;
      var10008 = var1 + var2 - 2 * (var1 & var2);
      var2 = -459278282;
      var1 = var10008;
      String var10003 = c(
         "㊗\ua631㊺ꙁ㋋\ua633㊰ꙃ㋌ꈡ㊼\ua634㊽ꙏ",
         "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7d4ꒂꁙ꤀絺蹚⑿謥㑚}\ua7e2꒠ꁽ꤀",
         var10005,
         var10006,
         var10007,
         (var1 | var2) - (var1 & var2)
      );
      var2 = 298559135;
      var1 = 611532193;
      int var10004 = (var1 | var2) & ~(var1 & var2);
      var2 = 901290815;
      var1 = var10004;
      this.a = new BooleanSetting(var10003, pulse.Bool.from((var1 | var2) & (var1 & var2 ^ -1)));
      var2 = -1622233723;
      var1 = -1292553785;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1106794320;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var10006 = (int)-9154162516771743552L;
      var2 = 110265335;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var2 = 491660932;
      var1 = var10006;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var10007 = (int)-2604404289257954044L;
      var2 = -1652486609;
      var1 = var10007;
      var10007 = (var1 | var2) & ~(var1 & var2);
      var2 = 1859819804;
      var1 = var10007;
      var10007 = (var1 | var2) & ~(var1 & var2);
      var2 = 1501910783;
      var1 = 1608044870;
      var10008 = (var1 | var2) - (var1 & var2);
      var2 = 108315126;
      var1 = var10008;
      var10003 = c(
         "㊤䀅㊻䁱㋂䁽㚠䀊㊰䀂㋀䀈㋉䀈㊽䀀㋋䁸㚠䁼㊻䀃㊲", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7d4ꒂꁙ꤀絺蹚⑿謥㑚}\ua7e2꒠ꁽ꤀", var10005, var10006, var10007, (var1 | var2) - (var1 & var2)
      );
      var2 = 2052258122;
      var1 = 980102307;
      var10004 = var1 & ~var2 | ~var1 & var2;
      var2 = 1077532136;
      var1 = var10004;
      this.b = new BooleanSetting(var10003, pulse.Bool.from(var1 & (var2 ^ -1) | (var1 ^ -1) & var2));
      var2 = -852873353;
      var1 = -1774475476;
      int var1124 = (var1 | var2) - (var1 & var2);
      var2 = 1527875684;
      var1 = var1124;
      String[] var1125 = new String[var1 & ~var2 | ~var1 & var2];
      var2 = 759296244;
      var1 = 748818783;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var2 = 31711659;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var10008 = (int)-1069256514530844284L;
      var2 = 369034123;
      var1 = var10008;
      var10008 = (var1 | var2) - (var1 & var2);
      var2 = -69282051;
      var1 = var10008;
      var10008 = (var1 | var2) - (var1 & var2);
      var2 = 2009932788;
      var1 = 1098074852;
      int var10009 = var1 + var2 - 2 * (var1 & var2);
      var2 = 921530751;
      var1 = var10009;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var2 = 161205814;
      var1 = 308988777;
      int var10010 = (var1 | var2) - (var1 & var2);
      var2 = 394318282;
      var1 = var10010;
      var10010 = var1 + var2 - 2 * (var1 & var2);
      int var10011 = (int)-323117591682600696L;
      var2 = 1897509098;
      var1 = var10011;
      var10011 = (var1 | var2) & ~(var1 & var2);
      var2 = 1446338793;
      var1 = var10011;
      var1125[var10005] = c(
         "㊰\ue743㋀\ue741㊵\ue744㚨\ue749㛼\ue73a㛼\ue747㊼\ue305㊵\ue305㋇\ue741㊺\ue350㚿",
         "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7d4ꒂꁙ꤀絺蹚⑿謥㑚}\ua7e2꒠ꁽ꤀",
         var10008,
         var10009,
         var10010,
         var1 & ~var2 | ~var1 & var2
      );
      var2 = -1664969179;
      var1 = 189779945;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1752344115;
      var1 = var10005;
      var10005 = (var1 | var2) - (var1 & var2);
      var10008 = (int)-5860941648536878454L;
      var2 = -8718990;
      var1 = var10008;
      var10008 = (var1 | var2) & (~var1 | ~var2);
      var2 = -513015030;
      var1 = var10008;
      var10008 = (var1 | var2) - (var1 & var2);
      var2 = -1617650956;
      var1 = -1276202670;
      var10009 = (var1 | var2) & ~(var1 & var2);
      var2 = 743666599;
      var1 = var10009;
      var10009 = var1 + var2 - 2 * (var1 & var2);
      var10010 = (int)-2741884627122473051L;
      var2 = 332372140;
      var1 = var10010;
      var10010 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1121650485;
      var1 = var10010;
      var10010 = (var1 | var2) & ~(var1 & var2);
      var10011 = (int)-4108121800303285067L;
      var2 = 1681007177;
      var1 = var10011;
      var10011 = (var1 | var2) & ~(var1 & var2);
      var2 = 1658809953;
      var1 = var10011;
      var1125[var10005] = c(
         "㋀⛗㋇⋇㊰⊓㋃⊓㊾⛓㛼⛚㊹⊓㊵⋆㚿", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7d4ꒂꁙ꤀絺蹚⑿謥㑚}\ua7e2꒠ꁽ꤀", var10008, var10009, var10010, (var1 | var2) & ~(var1 & var2)
      );
      var2 = 727290624;
      var1 = 1734888453;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = 1278336775;
      var1 = var10005;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = -1994291458;
      var1 = 1488578319;
      var10008 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1109677315;
      var1 = var10008;
      var10008 = var1 & ~var2 | ~var1 & var2;
      var10009 = (int)-1625851721223411198L;
      var2 = 477712795;
      var1 = var10009;
      var10009 = (var1 | var2) & ~(var1 & var2);
      var2 = 1596422895;
      var1 = var10009;
      var10009 = (var1 | var2) - (var1 & var2);
      var2 = -521463994;
      var1 = 2055699631;
      var10010 = var1 & ~var2 | ~var1 & var2;
      var2 = -1892683883;
      var1 = var10010;
      var10010 = (var1 | var2) - (var1 & var2);
      var10011 = (int)-4047517700812755283L;
      var2 = 119024859;
      var1 = var10011;
      var10011 = (var1 | var2) & ~(var1 & var2);
      var2 = -2086008732;
      var1 = var10011;
      var1125[var10005] = c(
         "㊽బ㋎ౚ㊾\u0c54㚨\u0c5e㊼ࠜ㊰ࠜ㋃ࠜ㊰\u0c5c㊸ࠜ㊸ౚ㛼ౕ㚩\u085f",
         "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7d4ꒂꁙ꤀絺蹚⑿謥㑚}\ua7e2꒠ꁽ꤀",
         var10008,
         var10009,
         var10010,
         var1 + var2 - 2 * (var1 & var2)
      );
      var10005 = (int)793255828033428048L;
      var2 = 260282487;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = 175325732;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var10008 = (int)-3485615720532907498L;
      var2 = -792983383;
      var1 = var10008;
      var10008 = (var1 | var2) - (var1 & var2);
      var2 = 18765389;
      var1 = var10008;
      var10008 = (var1 | var2) - (var1 & var2);
      var2 = -633261068;
      var1 = -862736198;
      var10009 = (var1 | var2) & (~var1 | ~var2);
      var2 = 378441832;
      var1 = var10009;
      var10009 = var1 + var2 - 2 * (var1 & var2);
      var10010 = (int)6836451768420479720L;
      var2 = 910491401;
      var1 = var10010;
      var10010 = (var1 | var2) & ~(var1 & var2);
      var2 = -1119355030;
      var1 = var10010;
      var10010 = (var1 | var2) - (var1 & var2);
      var10011 = (int)-5003466841680084496L;
      var2 = 524060411;
      var1 = var10011;
      var10011 = (var1 | var2) & ~(var1 & var2);
      var2 = -548676407;
      var1 = var10011;
      var1125[var10005] = c(
         "㋍\udd8a㋁\udd8f㊵\udd8d㋁\udd88㊲\ud998㊾\udd8c㛼\udd80㛼\uddf3㛼\udd80㊼\udd88㛼\udd85㚩\ud98f",
         "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7d4ꒂꁙ꤀絺蹚⑿謥㑚}\ua7e2꒠ꁽ꤀",
         var10008,
         var10009,
         var10010,
         (var1 | var2) & (~var1 | ~var2)
      );
      var2 = 1525502306;
      var1 = 454488431;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = 1107009545;
      var1 = var10005;
      var10005 = (var1 | var2) - (var1 & var2);
      var2 = -2104316550;
      var1 = -1964870985;
      var10008 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1681069249;
      var1 = var10008;
      var10008 = (var1 | var2) & (~var1 | ~var2);
      var10009 = (int)4194178599584562718L;
      var2 = -1567816879;
      var1 = var10009;
      var10009 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1375982370;
      var1 = var10009;
      var10009 = (var1 | var2) - (var1 & var2);
      var10010 = (int)1262956949562237391L;
      var2 = 1425874473;
      var1 = var10010;
      var10010 = var1 & ~var2 | ~var1 & var2;
      var2 = 583165737;
      var1 = var10010;
      var10010 = (var1 | var2) & ~(var1 & var2);
      var10011 = (int)-3473747299859998519L;
      var2 = -568168078;
      var1 = var10011;
      var10011 = var1 & ~var2 | ~var1 & var2;
      var2 = -1773052238;
      var1 = var10011;
      var1125[var10005] = c(
         "㊸煇㊿煋㊺焹㚨煅㊼甇㊰甇㋃甇㊰煇㊸甇㊸煁㛼煎㚩畄",
         "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7d4ꒂꁙ꤀絺蹚⑿謥㑚}\ua7e2꒠ꁽ꤀",
         var10008,
         var10009,
         var10010,
         (var1 | var2) - (var1 & var2)
      );
      var10005 = (int)-627828967847552097L;
      var2 = -1263200555;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = -83227313;
      var1 = var10005;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = -782872686;
      var1 = 779884353;
      var10008 = (var1 | var2) & ~(var1 & var2);
      var2 = 1821797409;
      var1 = var10008;
      var10008 = (var1 | var2) & (~var1 | ~var2);
      var10009 = (int)-5597139484400858826L;
      var2 = -2136293462;
      var1 = var10009;
      var10009 = (var1 | var2) & ~(var1 & var2);
      var2 = -1182944765;
      var1 = var10009;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var10010 = (int)-2642952234420953740L;
      var2 = -537676814;
      var1 = var10010;
      var10010 = (var1 | var2) & (~var1 | ~var2);
      var2 = -729730567;
      var1 = var10010;
      var10010 = var1 & ~var2 | ~var1 & var2;
      var10011 = (int)-8085564921484174501L;
      var2 = 953574786;
      var1 = var10011;
      var10011 = (var1 | var2) & ~(var1 & var2);
      var2 = 1045558242;
      var1 = var10011;
      var1125[var10005] = c(
         "㋍୳㋁\u0b7c㊻୲㊵୴㋂ཡ㊾୵㛼\u0b79㛼ଊ㛼\u0b79㊼ୱ㛼ୱ㊺༵㊵འ㚿",
         "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7d4ꒂꁙ꤀絺蹚⑿謥㑚}\ua7e2꒠ꁽ꤀",
         var10008,
         var10009,
         var10010,
         var1 + var2 - 2 * (var1 & var2)
      );
      var2 = 1711599457;
      var1 = 199585696;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1843495111;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var2 = -1848428115;
      var1 = 157712466;
      var10008 = (var1 | var2) & ~(var1 & var2);
      var2 = 185175309;
      var1 = var10008;
      var10008 = (var1 | var2) & ~(var1 & var2);
      var2 = -144062772;
      var1 = -1253724310;
      var10009 = (var1 | var2) - (var1 & var2);
      var2 = 1108307585;
      var1 = var10009;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var10010 = (int)-7946054800821023477L;
      var2 = -900033145;
      var1 = var10010;
      var10010 = var1 + var2 - 2 * (var1 & var2);
      var2 = -442570213;
      var1 = var10010;
      var10010 = (var1 | var2) & ~(var1 & var2);
      var2 = 39981606;
      var1 = -941974982;
      var10011 = var1 & ~var2 | ~var1 & var2;
      var2 = -978303009;
      var1 = var10011;
      var1125[var10005] = c(
         "㋍즋㋁즄㊻즄㊽짳㚨즏㊼췍㊰췍㋃췍㊰즍㊸췍㊸즋㚩춎",
         "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7d4ꒂꁙ꤀絺蹚⑿謥㑚}\ua7e2꒠ꁽ꤀",
         var10008,
         var10009,
         var10010,
         (var1 | var2) & (~var1 | ~var2)
      );
      var2 = 1209302461;
      var1 = -1975251802;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1034915556;
      var1 = var10005;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var2 = -155033931;
      var1 = 191708257;
      var10008 = (var1 | var2) - (var1 & var2);
      var2 = 1846760998;
      var1 = var10008;
      var10008 = var1 + var2 - 2 * (var1 & var2);
      var10009 = (int)8256011045136496840L;
      var2 = 1509978985;
      var1 = var10009;
      var10009 = var1 + var2 - 2 * (var1 & var2);
      var2 = -45723566;
      var1 = var10009;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var2 = 633398674;
      var1 = -1368053626;
      var10010 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1420238949;
      var1 = var10010;
      var10010 = (var1 | var2) - (var1 & var2);
      var10011 = (int)-6626522199245437256L;
      var2 = -1233889792;
      var1 = var10011;
      var10011 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1612205001;
      var1 = var10011;
      var1125[var10005] = c(
         "㊺ꋍ㋂ꋆ㊰ꋏ㊰ꋀ㚨ꋃ㊼ꚁ㊰ꚁ㋃ꚁ㊰ꋁ㊸ꚁ㋇ꋅ㊺ꛔ㚿",
         "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7d4ꒂꁙ꤀絺蹚⑿謥㑚}\ua7e2꒠ꁽ꤀",
         var10008,
         var10009,
         var10010,
         var1 + var2 - 2 * (var1 & var2)
      );
      var10005 = (int)2487305707956297376L;
      var2 = 228131781;
      var1 = var10005;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var2 = -15704723;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var10008 = (int)6046008579941892458L;
      var2 = -2081467263;
      var1 = var10008;
      var10008 = var1 & ~var2 | ~var1 & var2;
      var2 = 607510809;
      var1 = var10008;
      var10008 = (var1 | var2) & (~var1 | ~var2);
      var2 = 2013939455;
      var1 = -1652921404;
      var10009 = (var1 | var2) & ~(var1 & var2);
      var2 = -448989257;
      var1 = var10009;
      var10009 = (var1 | var2) & ~(var1 & var2);
      var2 = 1201442082;
      var1 = -69080891;
      var10010 = (var1 | var2) & ~(var1 & var2);
      var2 = -1262405419;
      var1 = var10010;
      var10010 = var1 + var2 - 2 * (var1 & var2);
      var10011 = (int)-3225483854220556651L;
      var2 = -1751845496;
      var1 = var10011;
      var10011 = (var1 | var2) - (var1 & var2);
      var2 = -1211412427;
      var1 = var10011;
      var1125[var10005] = c(
         "㊺ꕪ㋂ꕡ㊾ꕨ㊰ꕧ㚨ꕤ㊼ꄦ㊰ꄦ㋃ꄦ㊰ꕦ㊸ꄦ㋇ꕢ㊺ꅳ㚿",
         "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7d4ꒂꁙ꤀絺蹚⑿謥㑚}\ua7e2꒠ꁽ꤀",
         var10008,
         var10009,
         var10010,
         (var1 | var2) - (var1 & var2)
      );
      var10005 = (int)5232351481140564216L;
      var2 = 958144196;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = 339955253;
      var1 = var10005;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = 353690824;
      var1 = 1399432557;
      var10008 = (var1 | var2) - (var1 & var2);
      var2 = -708741801;
      var1 = var10008;
      var10008 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1446431448;
      var1 = -1975856798;
      var10009 = (var1 | var2) & (~var1 | ~var2);
      var2 = -598700968;
      var1 = var10009;
      var10009 = (var1 | var2) & ~(var1 & var2);
      var2 = 1017870810;
      var1 = -1070804917;
      var10010 = var1 & ~var2 | ~var1 & var2;
      var2 = -351007924;
      var1 = var10010;
      var10010 = (var1 | var2) & (~var1 | ~var2);
      var10011 = (int)3428756533848149642L;
      var2 = 53575235;
      var1 = var10011;
      var10011 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1239248713;
      var1 = var10011;
      var1125[var10005] = c(
         "㋆昹㊻昹㋁晎㊸昼㊻戤㊾昰㛼昼㛼晏㛼昼㊼昴㛼昹㚩戳",
         "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7d4ꒂꁙ꤀絺蹚⑿謥㑚}\ua7e2꒠ꁽ꤀",
         var10008,
         var10009,
         var10010,
         var1 + var2 - 2 * (var1 & var2)
      );
      var2 = -179348931;
      var1 = 963199231;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = -869918008;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = 887756044;
      var1 = 2093944118;
      var10008 = (var1 | var2) & (~var1 | ~var2);
      var2 = -610718520;
      var1 = var10008;
      var10008 = var1 & ~var2 | ~var1 & var2;
      var10009 = (int)6266892493650115914L;
      var2 = 955907933;
      var1 = var10009;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var2 = 959741617;
      var1 = var10009;
      var10009 = (var1 | var2) - (var1 & var2);
      var10010 = (int)-8621331892511619962L;
      var2 = -376741508;
      var1 = var10010;
      var10010 = var1 & ~var2 | ~var1 & var2;
      var2 = -1596498667;
      var1 = var10010;
      var10010 = (var1 | var2) & ~(var1 & var2);
      var2 = -708037035;
      var1 = 963217810;
      var10011 = var1 + var2 - 2 * (var1 & var2);
      var2 = -320750971;
      var1 = var10011;
      var1125[var10005] = c(
         "㋆̅㊻̊㚨̎㊹\u074c㊰\u074c㋃\u074c㊰̌㊸\u074c㊾ͷ㊺̀㛼̅㚩\u070f",
         "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7d4ꒂꁙ꤀絺蹚⑿謥㑚}\ua7e2꒠ꁽ꤀",
         var10008,
         var10009,
         var10010,
         (var1 | var2) & ~(var1 & var2)
      );
      var2 = 1836992073;
      var1 = 1655928763;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var2 = 265105913;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var10008 = (int)-2534773414165424818L;
      var2 = 458994132;
      var1 = var10008;
      var10008 = (var1 | var2) - (var1 & var2);
      var2 = -25735064;
      var1 = var10008;
      var10008 = var1 & ~var2 | ~var1 & var2;
      var10009 = (int)693028518635976816L;
      var2 = -352624066;
      var1 = var10009;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var2 = -97348400;
      var1 = var10009;
      var10009 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1901710940;
      var1 = 1997268511;
      var10010 = (var1 | var2) & ~(var1 & var2);
      var2 = -480630847;
      var1 = var10010;
      var10010 = var1 & ~var2 | ~var1 & var2;
      var2 = 332195073;
      var1 = -491460524;
      var10011 = (var1 | var2) & (~var1 | ~var2);
      var2 = -246900113;
      var1 = var10011;
      var1125[var10005] = c(
         "㊼酸㋂酰㊺鄉㚨酶㊼锴㊰锴㋃锴㊰酴㊸锴㊵镡㚿", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7d4ꒂꁙ꤀絺蹚⑿謥㑚}\ua7e2꒠ꁽ꤀", var10008, var10009, var10010, (var1 | var2) & (~var1 | ~var2)
      );
      var10005 = (int)-5988366005999127062L;
      var2 = -731105697;
      var1 = var10005;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1224113223;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = -461626134;
      var1 = -605340539;
      var10008 = (var1 | var2) - (var1 & var2);
      var2 = -1406456675;
      var1 = var10008;
      var10008 = (var1 | var2) & ~(var1 & var2);
      var2 = -1213864423;
      var1 = -302078842;
      var10009 = (var1 | var2) - (var1 & var2);
      var2 = 1510601853;
      var1 = var10009;
      var10009 = var1 + var2 - 2 * (var1 & var2);
      var10010 = (int)6076445787185264983L;
      var2 = -904923242;
      var1 = var10010;
      var10010 = (var1 | var2) - (var1 & var2);
      var2 = 496054278;
      var1 = var10010;
      var10010 = (var1 | var2) - (var1 & var2);
      var2 = -1928683873;
      var1 = -31043155;
      var10011 = var1 & ~var2 | ~var1 & var2;
      var2 = 1930735692;
      var1 = var10011;
      var1125[var10005] = c(
         "㊸礱㊵祌㋂礴㚨祃㛼礹㊹絰㋎絰㋏礰㊸絰㊵紥㚿", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7d4ꒂꁙ꤀絺蹚⑿謥㑚}\ua7e2꒠ꁽ꤀", var10008, var10009, var10010, var1 + var2 - 2 * (var1 & var2)
      );
      var10005 = (int)-2559253136783564585L;
      var2 = -411255917;
      var1 = var10005;
      var10005 = (var1 | var2) - (var1 & var2);
      var2 = 80386889;
      var1 = var10005;
      var10005 = (var1 | var2) - (var1 & var2);
      var2 = 159419860;
      var1 = 914883732;
      var10008 = var1 & ~var2 | ~var1 & var2;
      var2 = -1397441102;
      var1 = var10008;
      var10008 = var1 & ~var2 | ~var1 & var2;
      var2 = -1076897438;
      var1 = -1668903033;
      var10009 = (var1 | var2) - (var1 & var2);
      var2 = 594816682;
      var1 = var10009;
      var10009 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1900981301;
      var1 = -985523746;
      var10010 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1552219591;
      var1 = var10010;
      var10010 = (var1 | var2) - (var1 & var2);
      var10011 = (int)-3751871176639615264L;
      var2 = 312470939;
      var1 = var10011;
      var10011 = var1 & ~var2 | ~var1 & var2;
      var2 = 467846032;
      var1 = var10011;
      var1125[var10005] = c(
         "㋍䚣㋁䚦㚨䚩㛼䚧㊹䋥㊾䛗㛼䛚㛼䛚㊻䚡㋇䚣㊰䋥㊵䊰㚿",
         "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7d4ꒂꁙ꤀絺蹚⑿謥㑚}\ua7e2꒠ꁽ꤀",
         var10008,
         var10009,
         var10010,
         var1 + var2 - 2 * (var1 & var2)
      );
      var10005 = (int)6895201926234021984L;
      var2 = -1753280656;
      var1 = var10005;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = 213626654;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var10008 = (int)1107447992995244973L;
      var2 = 2077304662;
      var1 = var10008;
      var10008 = var1 & ~var2 | ~var1 & var2;
      var2 = -304187383;
      var1 = var10008;
      var10008 = (var1 | var2) & ~(var1 & var2);
      var10009 = (int)-6861679980098990482L;
      var2 = -1473205174;
      var1 = var10009;
      var10009 = (var1 | var2) & ~(var1 & var2);
      var2 = 131114779;
      var1 = var10009;
      var10009 = var1 + var2 - 2 * (var1 & var2);
      var10010 = (int)3191230135768413291L;
      var2 = -1885390131;
      var1 = var10010;
      var10010 = (var1 | var2) & (~var1 | ~var2);
      var2 = 206866412;
      var1 = var10010;
      var10010 = (var1 | var2) & (~var1 | ~var2);
      var2 = -142637040;
      var1 = 1108013090;
      var10011 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1251641879;
      var1 = var10011;
      var1125[var10005] = c(
         "㋄ஒ㋎ச㊵௩㚨\u0b97㊼࿕㊰࿕㋃࿕㊰க㊸ྀ㚿",
         "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7d4ꒂꁙ꤀絺蹚⑿謥㑚}\ua7e2꒠ꁽ꤀",
         var10008,
         var10009,
         var10010,
         (var1 | var2) & (~var1 | ~var2)
      );
      var10005 = (int)2795623455386302343L;
      var2 = 854941743;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1158047833;
      var1 = var10005;
      var10005 = (var1 | var2) - (var1 & var2);
      var2 = 863121226;
      var1 = -92656526;
      var10008 = (var1 | var2) - (var1 & var2);
      var2 = 1521760202;
      var1 = var10008;
      var10008 = var1 & ~var2 | ~var1 & var2;
      var10009 = (int)-6217711927188504694L;
      var2 = -1057157082;
      var1 = var10009;
      var10009 = (var1 | var2) & ~(var1 & var2);
      var2 = 821323133;
      var1 = var10009;
      var10009 = var1 + var2 - 2 * (var1 & var2);
      var10010 = (int)5287633536149446433L;
      var2 = -1114869034;
      var1 = var10010;
      var10010 = var1 + var2 - 2 * (var1 & var2);
      var2 = 213281869;
      var1 = var10010;
      var10010 = var1 & ~var2 | ~var1 & var2;
      var2 = -59325084;
      var1 = 1982059436;
      var10011 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1975384667;
      var1 = var10011;
      var1125[var10005] = c(
         "㋀ᔧ㊺ᔪ㋀ᄷ㊰ᅣ㋃ᅣ㊾ᔣ㛼ᔡ㋇ᔪ㊺ᄶ㚿", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7d4ꒂꁙ꤀絺蹚⑿謥㑚}\ua7e2꒠ꁽ꤀", var10008, var10009, var10010, (var1 | var2) & ~(var1 & var2)
      );
      var2 = 492655818;
      var1 = -907039212;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var2 = -726467890;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var10008 = (int)1092832614647162596L;
      var2 = -556109066;
      var1 = var10008;
      var10008 = (var1 | var2) & ~(var1 & var2);
      var2 = 1583816928;
      var1 = var10008;
      var10008 = var1 + var2 - 2 * (var1 & var2);
      var2 = 384777939;
      var1 = 343112969;
      var10009 = (var1 | var2) & ~(var1 & var2);
      var2 = 46016436;
      var1 = var10009;
      var10009 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1416866090;
      var1 = -1651609145;
      var10010 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1030972338;
      var1 = var10010;
      var10010 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1545589726;
      var1 = -1169960096;
      var10011 = (var1 | var2) & (~var1 | ~var2);
      var2 = 430690888;
      var1 = var10011;
      var1125[var10005] = c(
         "㋄⭈㊽⭇㊵⽐㊹⼄㋎⼄㋏⼄㊵⭄㛼⭍㛼⭁㋇⭀㊺⽑㚿",
         "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7d4ꒂꁙ꤀絺蹚⑿謥㑚}\ua7e2꒠ꁽ꤀",
         var10008,
         var10009,
         var10010,
         (var1 | var2) & (~var1 | ~var2)
      );
      var2 = -1629777727;
      var1 = 464332461;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = -2055817603;
      var1 = var10005;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var10008 = (int)-8994659655643939203L;
      var2 = 1422402301;
      var1 = var10008;
      var10008 = (var1 | var2) & (~var1 | ~var2);
      var2 = 716843122;
      var1 = var10008;
      var10008 = var1 + var2 - 2 * (var1 & var2);
      var2 = 2087933711;
      var1 = -413138495;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var2 = -1690397050;
      var1 = var10009;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var2 = 1449728165;
      var1 = -781588817;
      var10010 = var1 & ~var2 | ~var1 & var2;
      var2 = -1829826413;
      var1 = var10010;
      var10010 = (var1 | var2) & (~var1 | ~var2);
      var10011 = (int)-5240685530833186639L;
      var2 = 1683832992;
      var1 = var10011;
      var10011 = (var1 | var2) - (var1 & var2);
      var2 = -815376139;
      var1 = var10011;
      var1125[var10005] = c(
         "㊲躣㊺軗㊰躯㊴誾㊾躪㛼躦㛼軕㛼躦㊼躮㛼躮㊺諪㊵調㚿",
         "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7d4ꒂꁙ꤀絺蹚⑿謥㑚}\ua7e2꒠ꁽ꤀",
         var10008,
         var10009,
         var10010,
         var1 + var2 - 2 * (var1 & var2)
      );
      var10005 = (int)-3661134502115034625L;
      var2 = 2129648746;
      var1 = var10005;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = 544105863;
      var1 = var10005;
      var10005 = (var1 | var2) - (var1 & var2);
      var10008 = (int)-163878096900916344L;
      var2 = 173508963;
      var1 = var10008;
      var10008 = var1 & ~var2 | ~var1 & var2;
      var2 = -1372895719;
      var1 = var10008;
      var10008 = (var1 | var2) - (var1 & var2);
      var10009 = (int)6332605717441221781L;
      var2 = 971272088;
      var1 = var10009;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var2 = 192461363;
      var1 = var10009;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var10010 = (int)-5721926739519739895L;
      var2 = 598267400;
      var1 = var10010;
      var10010 = (var1 | var2) - (var1 & var2);
      var2 = 1981176991;
      var1 = var10010;
      var10010 = (var1 | var2) - (var1 & var2);
      var2 = 1054724521;
      var1 = -1284425125;
      var10011 = (var1 | var2) - (var1 & var2);
      var2 = -1916837336;
      var1 = var10011;
      var1125[var10005] = c(
         "㊽迫㋀迩㋃输㋂辘㊽讀㊰诔㋃诔㊵诔㊾辔㛼迯㊸辒㚩讗",
         "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7d4ꒂꁙ꤀絺蹚⑿謥㑚}\ua7e2꒠ꁽ꤀",
         var10008,
         var10009,
         var10010,
         (var1 | var2) & (~var1 | ~var2)
      );
      var10005 = (int)2012032928400516746L;
      var2 = -775374377;
      var1 = var10005;
      var10005 = (var1 | var2) - (var1 & var2);
      var2 = 343613262;
      var1 = var10005;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1311351268;
      var1 = -188679405;
      var10008 = (var1 | var2) - (var1 & var2);
      var2 = -693464579;
      var1 = var10008;
      var10008 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1981877968;
      var1 = -1605834548;
      var10009 = var1 + var2 - 2 * (var1 & var2);
      var2 = -698445391;
      var1 = var10009;
      var10009 = (var1 | var2) - (var1 & var2);
      var10010 = (int)-4668954501028773349L;
      var2 = 1058472837;
      var1 = var10010;
      var10010 = (var1 | var2) - (var1 & var2);
      var2 = 1968541994;
      var1 = var10010;
      var10010 = (var1 | var2) - (var1 & var2);
      var10011 = (int)-7382559879497973764L;
      var2 = -1572804040;
      var1 = var10011;
      var10011 = var1 & ~var2 | ~var1 & var2;
      var2 = -752527987;
      var1 = var10011;
      var1125[var10005] = c(
         "㊽䙸㋀䘃㊺䈓㊰䉇㋃䉇㊾䘇㛼䘎㚩䈄", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7d4ꒂꁙ꤀絺蹚⑿謥㑚}\ua7e2꒠ꁽ꤀", var10008, var10009, var10010, var1 & ~var2 | ~var1 & var2
      );
      var2 = -1364622207;
      var1 = -23308337;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = 1345704794;
      var1 = var10005;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var10008 = (int)-138184189181997707L;
      var2 = 543117225;
      var1 = var10008;
      var10008 = (var1 | var2) & ~(var1 & var2);
      var2 = -103270866;
      var1 = var10008;
      var10008 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1787989250;
      var1 = 1804836375;
      var10009 = (var1 | var2) - (var1 & var2);
      var2 = 23233850;
      var1 = var10009;
      var10009 = (var1 | var2) & ~(var1 & var2);
      var10010 = (int)6467864248994624859L;
      var2 = -980377158;
      var1 = var10010;
      var10010 = (var1 | var2) - (var1 & var2);
      var2 = -97860354;
      var1 = var10010;
      var10010 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1255040838;
      var1 = 2044975901;
      var10011 = (var1 | var2) - (var1 & var2);
      var2 = -862249620;
      var1 = var10011;
      var1125[var10005] = c(
         "㊽壺㋀墂㊰墄㚨墉㛼壺㛼墇㊼峅㋇墁㊺峅㊵岐㚿", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7d4ꒂꁙ꤀絺蹚⑿謥㑚}\ua7e2꒠ꁽ꤀", var10008, var10009, var10010, var1 + var2 - 2 * (var1 & var2)
      );
      var2 = -600088376;
      var1 = -1818848083;
      var10005 = (var1 | var2) - (var1 & var2);
      var2 = 1336800368;
      var1 = var10005;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1477974322;
      var1 = -1558906638;
      var10008 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1756419378;
      var1 = var10008;
      var10008 = (var1 | var2) & ~(var1 & var2);
      var10009 = (int)27911509141574296L;
      var2 = -1019141674;
      var1 = var10009;
      var10009 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1621052433;
      var1 = var10009;
      var10009 = (var1 | var2) - (var1 & var2);
      var2 = -264696808;
      var1 = -1408711256;
      var10010 = (var1 | var2) - (var1 & var2);
      var2 = 1311208283;
      var1 = var10010;
      var10010 = (var1 | var2) & (~var1 | ~var2);
      var10011 = (int)8650117879261451410L;
      var2 = 1907963108;
      var1 = var10011;
      var10011 = (var1 | var2) - (var1 & var2);
      var2 = -215718003;
      var1 = var10011;
      var1125[var10005] = c(
         "㊲Ƽ㊺ǈ㚨Ʒ㊼\u05f5㋃\u05f5㊰\u05f5㊰Ƶ㊸\u05f5㊸Ƴ㛼Ƽ㚩ֶ",
         "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7d4ꒂꁙ꤀絺蹚⑿謥㑚}\ua7e2꒠ꁽ꤀",
         var10008,
         var10009,
         var10010,
         (var1 | var2) & ~(var1 & var2)
      );
      var10005 = (int)2864415523199050273L;
      var2 = 2027528089;
      var1 = var10005;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1916961362;
      var1 = var10005;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var10008 = (int)-1792149406098888774L;
      var2 = 1077351766;
      var1 = var10008;
      var10008 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1836628450;
      var1 = var10008;
      var10008 = var1 + var2 - 2 * (var1 & var2);
      var10009 = (int)3837954678899486764L;
      var2 = 1217164008;
      var1 = var10009;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var2 = 2071297177;
      var1 = var10009;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var10010 = (int)-507521561413076307L;
      var2 = 1109396833;
      var1 = var10010;
      var10010 = (var1 | var2) & ~(var1 & var2);
      var2 = 1698686780;
      var1 = var10010;
      var10010 = (var1 | var2) - (var1 & var2);
      var2 = -1408795914;
      var1 = 1963490246;
      var10011 = var1 + var2 - 2 * (var1 & var2);
      var2 = -653916215;
      var1 = var10011;
      var1125[var10005] = c(
         "㋀¾㊻¾㊹±㚨µ㊼ӷ㋃ӷ㊰ӷ㊰·㊸ӷ㊵Ң㚿", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7d4ꒂꁙ꤀絺蹚⑿謥㑚}\ua7e2꒠ꁽ꤀", var10008, var10009, var10010, (var1 | var2) & (~var1 | ~var2)
      );
      var2 = -1244883587;
      var1 = -405870565;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = 1375894897;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1704984042;
      var1 = 313841105;
      var10008 = (var1 | var2) - (var1 & var2);
      var2 = 459858741;
      var1 = var10008;
      var10008 = var1 & ~var2 | ~var1 & var2;
      var10009 = (int)2305890654327997512L;
      var2 = 1512711767;
      var1 = var10009;
      var10009 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1683887317;
      var1 = var10009;
      var10009 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1900007241;
      var1 = 993794705;
      var10010 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1323668838;
      var1 = var10010;
      var10010 = (var1 | var2) & ~(var1 & var2);
      var10011 = (int)-7609604749948743021L;
      var2 = -1927737188;
      var1 = var10011;
      var10011 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1820721815;
      var1 = var10011;
      var1125[var10005] = c(
         "㊰凜㊱綾㊷ﴼ㊾廊㛼襤㛼綾㛼襤㊼郎㛼郎㊺ﵨ㊵ﴽ㚿", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7d4ꒂꁙ꤀絺蹚⑿謥㑚}\ua7e2꒠ꁽ꤀", var10008, var10009, var10010, var1 & ~var2 | ~var1 & var2
      );
      var2 = 89416973;
      var1 = -33084555;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = -78426528;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var10008 = (int)-1136309445881927942L;
      var2 = 1509807844;
      var1 = var10008;
      var10008 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1727494932;
      var1 = var10008;
      var10008 = (var1 | var2) & ~(var1 & var2);
      var10009 = (int)5882280359459922507L;
      var2 = 1020240088;
      var1 = var10009;
      var10009 = var1 + var2 - 2 * (var1 & var2);
      var2 = 40950894;
      var1 = var10009;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var2 = 1453311384;
      var1 = 92809815;
      var10010 = var1 & ~var2 | ~var1 & var2;
      var2 = 1277854578;
      var1 = var10010;
      var10010 = (var1 | var2) - (var1 & var2);
      var10011 = (int)5097344341708985015L;
      var2 = -836679636;
      var1 = var10011;
      var10011 = (var1 | var2) & ~(var1 & var2);
      var2 = -822035198;
      var1 = var10011;
      var1125[var10005] = c(
         "㊲ꇓ㊻ꇟ㚨ꇕ㊼ꖗ㋃ꖗ㊰ꖗ㊰ꇗ㊸ꖗ㊸ꇑ㛼ꇞ㚩ꗔ",
         "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7d4ꒂꁙ꤀絺蹚⑿謥㑚}\ua7e2꒠ꁽ꤀",
         var10008,
         var10009,
         var10010,
         var1 + var2 - 2 * (var1 & var2)
      );
      var10005 = (int)-8017058325923288009L;
      var2 = -745459242;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var2 = 273686008;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var10008 = (int)2667552553434000418L;
      var2 = 1715575612;
      var1 = var10008;
      var10008 = var1 & ~var2 | ~var1 & var2;
      var2 = 182649836;
      var1 = var10008;
      var10008 = (var1 | var2) & ~(var1 & var2);
      var2 = -32699014;
      var1 = -897181493;
      var10009 = (var1 | var2) - (var1 & var2);
      var2 = 883905912;
      var1 = var10009;
      var10009 = (var1 | var2) - (var1 & var2);
      var10010 = (int)-3573255166213563197L;
      var2 = -2123862702;
      var1 = var10010;
      var10010 = (var1 | var2) & ~(var1 & var2);
      var2 = 793806121;
      var1 = var10010;
      var10010 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1428387192;
      var1 = -355720577;
      var10011 = var1 & ~var2 | ~var1 & var2;
      var2 = -1075487134;
      var1 = var10011;
      var1125[var10005] = c(
         "㋄༧㊽ཕ㊰༮㊼ି㊵୫㊰୫㋃ା㚿", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7d4ꒂꁙ꤀絺蹚⑿謥㑚}\ua7e2꒠ꁽ꤀", var10008, var10009, var10010, var1 & ~var2 | ~var1 & var2
      );
      var2 = -1157847095;
      var1 = -1060153082;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var2 = 2050227925;
      var1 = var10005;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = -1130411728;
      var1 = 767519447;
      var10008 = var1 & ~var2 | ~var1 & var2;
      var2 = 43783957;
      var1 = var10008;
      var10008 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1346965766;
      var1 = 1018215944;
      var10009 = (var1 | var2) & ~(var1 & var2);
      var2 = -1824720829;
      var1 = var10009;
      var10009 = (var1 | var2) & ~(var1 & var2);
      var2 = 1349821728;
      var1 = -2090744906;
      var10010 = var1 + var2 - 2 * (var1 & var2);
      var2 = -691048053;
      var1 = var10010;
      var10010 = (var1 | var2) - (var1 & var2);
      var10011 = (int)6258684237740839468L;
      var2 = 1138400312;
      var1 = var10011;
      var10011 = var1 & ~var2 | ~var1 & var2;
      var2 = 1008467801;
      var1 = var10011;
      var1125[var10005] = c(
         "㋅省㊻眇㊺猗㊵獃㊰獃㋃猖㚿", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7d4ꒂꁙ꤀絺蹚⑿謥㑚}\ua7e2꒠ꁽ꤀", var10008, var10009, var10010, (var1 | var2) - (var1 & var2)
      );
      var10005 = (int)7654132176516539672L;
      var2 = -1844439090;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = -684199219;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var10008 = (int)8411150258720582139L;
      var2 = -19357148;
      var1 = var10008;
      var10008 = (var1 | var2) & (~var1 | ~var2);
      var2 = -165855443;
      var1 = var10008;
      var10008 = (var1 | var2) & (~var1 | ~var2);
      var2 = 685777594;
      var1 = 87291041;
      var10009 = (var1 | var2) & (~var1 | ~var2);
      var2 = 770138112;
      var1 = var10009;
      var10009 = (var1 | var2) & (~var1 | ~var2);
      var10010 = (int)5522660304941028890L;
      var2 = -408992917;
      var1 = var10010;
      var10010 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1904219938;
      var1 = var10010;
      var10010 = (var1 | var2) & ~(var1 & var2);
      var2 = 442118918;
      var1 = 1260214668;
      var10011 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1365054525;
      var1 = var10011;
      var1125[var10005] = c(
         "㋅磻㊻磽㊲磻㋀磾㊴糭㊰粹㋃粹㊵糬㚿", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7d4ꒂꁙ꤀絺蹚⑿謥㑚}\ua7e2꒠ꁽ꤀", var10008, var10009, var10010, var1 + var2 - 2 * (var1 & var2)
      );
      var2 = 1410237560;
      var1 = -653521381;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1929213313;
      var1 = var10005;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1131757021;
      var1 = -1858861113;
      var10008 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1107103464;
      var1 = var10008;
      var10008 = var1 + var2 - 2 * (var1 & var2);
      var2 = 2103903485;
      var1 = -1943029242;
      var10009 = (var1 | var2) & ~(var1 & var2);
      var2 = -244428425;
      var1 = var10009;
      var10009 = (var1 | var2) & ~(var1 & var2);
      var2 = 791201529;
      var1 = -1361347527;
      var10010 = (var1 | var2) - (var1 & var2);
      var2 = -1701233021;
      var1 = var10010;
      var10010 = var1 + var2 - 2 * (var1 & var2);
      var2 = 556523860;
      var1 = -1798716435;
      var10011 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1242654063;
      var1 = var10011;
      var1125[var10005] = c(
         "㋀빤㊺븛㋂빪㋀멲㊾빦㛼빪㛼븙㛼빪㊼빢㛼븝㊸빠㛼빯㚩멥",
         "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7d4ꒂꁙ꤀絺蹚⑿謥㑚}\ua7e2꒠ꁽ꤀",
         var10008,
         var10009,
         var10010,
         (var1 | var2) - (var1 & var2)
      );
      var2 = -1852558971;
      var1 = 1535314918;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = -904447362;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var10008 = (int)-6028429675656269247L;
      var2 = 286671806;
      var1 = var10008;
      var10008 = var1 & ~var2 | ~var1 & var2;
      var2 = -406862579;
      var1 = var10008;
      var10008 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1803323120;
      var1 = -74526932;
      var10009 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1865927052;
      var1 = var10009;
      var10009 = (var1 | var2) & (~var1 | ~var2);
      var2 = 605970918;
      var1 = 1847491992;
      var10010 = (var1 | var2) - (var1 & var2);
      var2 = 1310199520;
      var1 = var10010;
      var10010 = (var1 | var2) - (var1 & var2);
      var10011 = (int)-3063515509903920913L;
      var2 = 632066239;
      var1 = var10011;
      var10011 = var1 + var2 - 2 * (var1 & var2);
      var2 = -641062884;
      var1 = var10011;
      var1125[var10005] = c(
         "㋀一㊳与㊻丆㊺䨖㊰䩂㋃䩂㊾丂㛼下㚩䨁", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7d4ꒂꁙ꤀絺蹚⑿謥㑚}\ua7e2꒠ꁽ꤀", var10008, var10009, var10010, var1 & ~var2 | ~var1 & var2
      );
      var2 = 1895684830;
      var1 = -565155616;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1364348384;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var2 = -1847093565;
      var1 = -1589843899;
      var10008 = (var1 | var2) & ~(var1 & var2);
      var2 = -1553511820;
      var1 = var10008;
      var10008 = (var1 | var2) - (var1 & var2);
      var10009 = (int)-944232364333184104L;
      var2 = -1646915385;
      var1 = var10009;
      var10009 = (var1 | var2) & ~(var1 & var2);
      var2 = 1203152018;
      var1 = var10009;
      var10009 = (var1 | var2) & ~(var1 & var2);
      var10010 = (int)-2622394669596637844L;
      var2 = -1391299945;
      var1 = var10010;
      var10010 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1852814718;
      var1 = var10010;
      var10010 = var1 + var2 - 2 * (var1 & var2);
      var10011 = (int)8937305675566608185L;
      var2 = -839012446;
      var1 = var10011;
      var10011 = (var1 | var2) & ~(var1 & var2);
      var2 = 885229810;
      var1 = var10011;
      var1125[var10005] = c(
         "㋂츫㊽츯㊵칛㋅츫㊺쨳㊾츧㛼치㛼츣㛼츫㊼츣㛼츫㛼츮㚩쨤",
         "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7d4ꒂꁙ꤀絺蹚⑿謥㑚}\ua7e2꒠ꁽ꤀",
         var10008,
         var10009,
         var10010,
         (var1 | var2) - (var1 & var2)
      );
      var10005 = (int)835017555967843160L;
      var2 = -164537853;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = -224607932;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var10008 = (int)-2874555088062691174L;
      var2 = 1162610665;
      var1 = var10008;
      var10008 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1984658305;
      var1 = var10008;
      var10008 = (var1 | var2) - (var1 & var2);
      var2 = -1321567469;
      var1 = 1635252300;
      var10009 = var1 + var2 - 2 * (var1 & var2);
      var2 = -797358515;
      var1 = var10009;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var10010 = (int)-7602451366136372741L;
      var2 = -9466050;
      var1 = var10010;
      var10010 = (var1 | var2) & ~(var1 & var2);
      var2 = -133704079;
      var1 = var10010;
      var10010 = var1 + var2 - 2 * (var1 & var2);
      var10011 = (int)-355155182402335652L;
      var2 = 1073600396;
      var1 = var10011;
      var10011 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1998739070;
      var1 = var10011;
      var1125[var10005] = c(
         "㊻诤㊺诮㊸诨㊱诬㋃诡㋁迴㊰辠㋃辠㊰诠㊸辠㊵迵㚿", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7d4ꒂꁙ꤀絺蹚⑿謥㑚}\ua7e2꒠ꁽ꤀", var10008, var10009, var10010, var1 & ~var2 | ~var1 & var2
      );
      var2 = 1125418226;
      var1 = -100827862;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = -1159071240;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var10008 = (int)-2102679519525448306L;
      var2 = 1487708022;
      var1 = var10008;
      var10008 = (var1 | var2) & (~var1 | ~var2);
      var2 = -652018166;
      var1 = var10008;
      var10008 = (var1 | var2) & (~var1 | ~var2);
      var10009 = (int)-3260891529549100560L;
      var2 = 1957639967;
      var1 = var10009;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var2 = 1054003653;
      var1 = var10009;
      var10009 = (var1 | var2) & ~(var1 & var2);
      var2 = -1081992772;
      var1 = 950607231;
      var10010 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1661582866;
      var1 = var10010;
      var10010 = (var1 | var2) & (~var1 | ~var2);
      var10011 = (int)7719379254024056709L;
      var2 = 882997113;
      var1 = var10011;
      var10011 = (var1 | var2) & ~(var1 & var2);
      var2 = 1711320890;
      var1 = var10011;
      var1125[var10005] = c(
         "㛥痌㛰痑㛮症㛩痂㛥", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7d4ꒂꁙ꤀絺蹚⑿謥㑚}\ua7e2꒠ꁽ꤀", var10008, var10009, var10010, (var1 | var2) - (var1 & var2)
      );
      var10005 = (int)-6964874687501425798L;
      var2 = 2003855336;
      var1 = var10005;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = -47299405;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var10008 = (int)-3760827555800603084L;
      var2 = 238594199;
      var1 = var10008;
      var10008 = (var1 | var2) & ~(var1 & var2);
      var2 = 512080465;
      var1 = var10008;
      var10008 = var1 + var2 - 2 * (var1 & var2);
      var10009 = (int)2570288096014101744L;
      var2 = 2076026725;
      var1 = var10009;
      var10009 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1098033543;
      var1 = var10009;
      var10009 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1866466178;
      var1 = -385657263;
      var10010 = (var1 | var2) - (var1 & var2);
      var2 = -2089933928;
      var1 = var10010;
      var10010 = (var1 | var2) & ~(var1 & var2);
      var10011 = (int)545474046688735134L;
      var2 = -723651974;
      var1 = var10011;
      var10011 = (var1 | var2) - (var1 & var2);
      var2 = -1216038036;
      var1 = var10011;
      var1125[var10005] = c(
         "㛣\ue49f㛬\ue49f㛳\ue48e㛩\ue49b㛬",
         "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7d4ꒂꁙ꤀絺蹚⑿謥㑚}\ua7e2꒠ꁽ꤀",
         var10008,
         var10009,
         var10010,
         (var1 | var2) & ~(var1 & var2)
      );
      var10005 = (int)6528393196560417159L;
      var2 = -576885138;
      var1 = var10005;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var2 = 647163851;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var2 = -731294239;
      var1 = -399693734;
      var10008 = (var1 | var2) & ~(var1 & var2);
      var2 = -1342682807;
      var1 = var10008;
      var10008 = var1 & ~var2 | ~var1 & var2;
      var2 = -161331556;
      var1 = -920320070;
      var10009 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1058662833;
      var1 = var10009;
      var10009 = (var1 | var2) - (var1 & var2);
      var2 = -106027087;
      var1 = 2084585545;
      var10010 = var1 & ~var2 | ~var1 & var2;
      var2 = -2030444466;
      var1 = var10010;
      var10010 = var1 + var2 - 2 * (var1 & var2);
      var2 = 410869078;
      var1 = -365497593;
      var10011 = (var1 | var2) - (var1 & var2);
      var2 = -233840798;
      var1 = var10011;
      var1125[var10005] = c(
         "㛮猤㛷猢㛯猥㛥", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7d4ꒂꁙ꤀絺蹚⑿謥㑚}\ua7e2꒠ꁽ꤀", var10008, var10009, var10010, (var1 | var2) - (var1 & var2)
      );
      var2 = -2007768350;
      var1 = -1621284828;
      var10005 = (var1 | var2) - (var1 & var2);
      var2 = 386845413;
      var1 = var10005;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var10008 = (int)-4754363386957434032L;
      var2 = -763732707;
      var1 = var10008;
      var10008 = (var1 | var2) - (var1 & var2);
      var2 = 847321791;
      var1 = var10008;
      var10008 = (var1 | var2) & ~(var1 & var2);
      var2 = 2121590251;
      var1 = 2075169838;
      var10009 = var1 + var2 - 2 * (var1 & var2);
      var2 = 100259146;
      var1 = var10009;
      var10009 = (var1 | var2) & (~var1 | ~var2);
      var2 = 674397446;
      var1 = -224413910;
      var10010 = (var1 | var2) & ~(var1 & var2);
      var2 = -607283450;
      var1 = var10010;
      var10010 = (var1 | var2) & ~(var1 & var2);
      var10011 = (int)7022975539433882677L;
      var2 = -1043313088;
      var1 = var10011;
      var10011 = (var1 | var2) & (~var1 | ~var2);
      var2 = -138025122;
      var1 = var10011;
      var1125[var10005] = c("㛡漫㛢漬㛺", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7d4ꒂꁙ꤀絺蹚⑿謥㑚}\ua7e2꒠ꁽ꤀", var10008, var10009, var10010, var1 & ~var2 | ~var1 & var2);
      var2 = -953182078;
      var1 = 1744906807;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1355894127;
      var1 = var10005;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var10008 = (int)-5445094142350424521L;
      var2 = -48903653;
      var1 = var10008;
      var10008 = var1 + var2 - 2 * (var1 & var2);
      var2 = 2047703262;
      var1 = var10008;
      var10008 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1464224620;
      var1 = -869891273;
      var10009 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1693731270;
      var1 = var10009;
      var10009 = (var1 | var2) & ~(var1 & var2);
      var10010 = (int)5875045616357483708L;
      var2 = -1700223256;
      var1 = var10010;
      var10010 = var1 & ~var2 | ~var1 & var2;
      var2 = -816111624;
      var1 = var10010;
      var10010 = var1 & ~var2 | ~var1 & var2;
      var10011 = (int)8117831481175407636L;
      var2 = -1289338828;
      var1 = var10011;
      var10011 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1720089309;
      var1 = var10011;
      var1125[var10005] = c("㛡䓤㛲䓦㛥䓡", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7d4ꒂꁙ꤀絺蹚⑿謥㑚}\ua7e2꒠ꁽ꤀", var10008, var10009, var10010, var1 & ~var2 | ~var1 & var2);
      var2 = -344382394;
      var1 = 2022688703;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var2 = -1812536356;
      var1 = var10005;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var10008 = (int)6085223812543736282L;
      var2 = 469279908;
      var1 = var10008;
      var10008 = (var1 | var2) & (~var1 | ~var2);
      var2 = -2060551796;
      var1 = var10008;
      var10008 = (var1 | var2) & (~var1 | ~var2);
      var10009 = (int)-8056527682567647775L;
      var2 = 14049538;
      var1 = var10009;
      var10009 = (var1 | var2) - (var1 & var2);
      var2 = 233519428;
      var1 = var10009;
      var10009 = (var1 | var2) - (var1 & var2);
      var10010 = (int)7550508379404733996L;
      var2 = 1650692137;
      var1 = var10010;
      var10010 = (var1 | var2) & ~(var1 & var2);
      var2 = -1841134000;
      var1 = var10010;
      var10010 = var1 + var2 - 2 * (var1 & var2);
      var10011 = (int)-3013250371047841665L;
      var2 = -740496756;
      var1 = var10011;
      var10011 = (var1 | var2) - (var1 & var2);
      var2 = 1301484720;
      var1 = var10011;
      var1125[var10005] = c(
         "㛮\udc44㛲\udc42㛵\udc5d㛴\udc50㛮",
         "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7d4ꒂꁙ꤀絺蹚⑿謥㑚}\ua7e2꒠ꁽ꤀",
         var10008,
         var10009,
         var10010,
         var1 + var2 - 2 * (var1 & var2)
      );
      var2 = -1648559545;
      var1 = -332739840;
      var10005 = (var1 | var2) - (var1 & var2);
      var2 = 1905668449;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var10008 = (int)-9091921922639223924L;
      var2 = 2091037497;
      var1 = var10008;
      var10008 = (var1 | var2) - (var1 & var2);
      var2 = 1553867847;
      var1 = var10008;
      var10008 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1818190660;
      var1 = 2059616494;
      var10009 = (var1 | var2) - (var1 & var2);
      var2 = -384888516;
      var1 = var10009;
      var10009 = (var1 | var2) & ~(var1 & var2);
      var10010 = (int)1067047577268284077L;
      var2 = -1669272170;
      var1 = var10010;
      var10010 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1265925587;
      var1 = var10010;
      var10010 = var1 + var2 - 2 * (var1 & var2);
      var10011 = (int)3461710654539646318L;
      var2 = 9674781;
      var1 = var10011;
      var10011 = (var1 | var2) & ~(var1 & var2);
      var2 = -674991239;
      var1 = var10011;
      var1125[var10005] = c(
         "㛲鐝㛬鐙㛫鐝", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7d4ꒂꁙ꤀絺蹚⑿謥㑚}\ua7e2꒠ꁽ꤀", var10008, var10009, var10010, (var1 | var2) & (~var1 | ~var2)
      );
      var10005 = (int)-81284244447964529L;
      var2 = -24396471;
      var1 = var10005;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = -178491423;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var10008 = (int)4512694355494998824L;
      var2 = 1329393001;
      var1 = var10008;
      var10008 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1146074445;
      var1 = var10008;
      var10008 = var1 & ~var2 | ~var1 & var2;
      var10009 = (int)-7399913874379736363L;
      var2 = 943412801;
      var1 = var10009;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var2 = -1660036821;
      var1 = var10009;
      var10009 = (var1 | var2) & ~(var1 & var2);
      var10010 = (int)6684732627162958001L;
      var2 = 853593061;
      var1 = var10010;
      var10010 = var1 + var2 - 2 * (var1 & var2);
      var2 = 193774745;
      var1 = var10010;
      var10010 = (var1 | var2) - (var1 & var2);
      var10011 = (int)-38524913920274025L;
      var2 = -613730148;
      var1 = var10011;
      var10011 = (var1 | var2) - (var1 & var2);
      var2 = -1514399920;
      var1 = var10011;
      var1125[var10005] = c(
         "㛷뱀㛬뱍", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7d4ꒂꁙ꤀絺蹚⑿謥㑚}\ua7e2꒠ꁽ꤀", var10008, var10009, var10010, (var1 | var2) & (~var1 | ~var2)
      );
      var2 = 2040356785;
      var1 = 1641811913;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var2 = 406933584;
      var1 = var10005;
      var10005 = (var1 | var2) - (var1 & var2);
      var2 = -556054469;
      var1 = -2097947886;
      var10008 = (var1 | var2) & (~var1 | ~var2);
      var2 = -812341285;
      var1 = var10008;
      var10008 = (var1 | var2) & ~(var1 & var2);
      var10009 = (int)-2566870067850922208L;
      var2 = -505750290;
      var1 = var10009;
      var10009 = (var1 | var2) & ~(var1 & var2);
      var2 = 213917419;
      var1 = var10009;
      var10009 = (var1 | var2) & (~var1 | ~var2);
      var2 = -943494787;
      var1 = 1076935563;
      var10010 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1902547628;
      var1 = var10010;
      var10010 = var1 + var2 - 2 * (var1 & var2);
      var10011 = (int)-8232948640553193946L;
      var2 = 986134972;
      var1 = var10011;
      var10011 = var1 & ~var2 | ~var1 & var2;
      var2 = -485184933;
      var1 = var10011;
      var1125[var10005] = c(
         "㛷㿆㛲㿀㛴", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7d4ꒂꁙ꤀絺蹚⑿謥㑚}\ua7e2꒠ꁽ꤀", var10008, var10009, var10010, (var1 | var2) & ~(var1 & var2)
      );
      var2 = -1712855423;
      var1 = -980292774;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = 1551240690;
      var1 = var10005;
      var10005 = (var1 | var2) - (var1 & var2);
      var10008 = (int)141583676945370079L;
      var2 = 1428148060;
      var1 = var10008;
      var10008 = var1 & ~var2 | ~var1 & var2;
      var2 = 1693544561;
      var1 = var10008;
      var10008 = (var1 | var2) & ~(var1 & var2);
      var10009 = (int)3741645812031374817L;
      var2 = 1638472555;
      var1 = var10009;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var2 = -591210654;
      var1 = var10009;
      var10009 = (var1 | var2) & ~(var1 & var2);
      var2 = 48568640;
      var1 = 1457134731;
      var10010 = (var1 | var2) - (var1 & var2);
      var2 = 1113302419;
      var1 = var10010;
      var10010 = (var1 | var2) & ~(var1 & var2);
      var10011 = (int)-2927423277665498356L;
      var2 = 704279909;
      var1 = var10011;
      var10011 = var1 + var2 - 2 * (var1 & var2);
      var2 = 712502509;
      var1 = var10011;
      var1125[var10005] = c(
         "㛣傗㛴傚㛯傀㛡傘", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7d4ꒂꁙ꤀絺蹚⑿謥㑚}\ua7e2꒠ꁽ꤀", var10008, var10009, var10010, var1 + var2 - 2 * (var1 & var2)
      );
      var2 = 725900827;
      var1 = -1194819292;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var2 = -1819484395;
      var1 = var10005;
      var10005 = (var1 | var2) - (var1 & var2);
      var10008 = (int)-1536790507598986522L;
      var2 = 1147389881;
      var1 = var10008;
      var10008 = var1 + var2 - 2 * (var1 & var2);
      var2 = 595669421;
      var1 = var10008;
      var10008 = (var1 | var2) & ~(var1 & var2);
      var10009 = (int)-1567193589319209498L;
      var2 = 265118569;
      var1 = var10009;
      var10009 = (var1 | var2) & ~(var1 & var2);
      var2 = -777253910;
      var1 = var10009;
      var10009 = (var1 | var2) & ~(var1 & var2);
      var10010 = (int)-3845431166984979902L;
      var2 = -95010412;
      var1 = var10010;
      var10010 = (var1 | var2) - (var1 & var2);
      var2 = -1395233477;
      var1 = var10010;
      var10010 = (var1 | var2) - (var1 & var2);
      var2 = 1550769081;
      var1 = 2089102461;
      var10011 = (var1 | var2) & (~var1 | ~var2);
      var2 = 550222277;
      var1 = var10011;
      var1125[var10005] = c(
         "㛥䰋㛣䰖㛬䰟㛥䰝㛴", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7d4ꒂꁙ꤀絺蹚⑿謥㑚}\ua7e2꒠ꁽ꤀", var10008, var10009, var10010, var1 + var2 - 2 * (var1 & var2)
      );
      var10005 = (int)-2692930995606433571L;
      var2 = -753926501;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var2 = 691187309;
      var1 = var10005;
      var10005 = (var1 | var2) - (var1 & var2);
      var2 = -358696823;
      var1 = 1939621158;
      var10008 = (var1 | var2) - (var1 & var2);
      var2 = 180275549;
      var1 = var10008;
      var10008 = (var1 | var2) - (var1 & var2);
      var2 = 854675164;
      var1 = -1365951326;
      var10009 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1673462260;
      var1 = var10009;
      var10009 = (var1 | var2) - (var1 & var2);
      var2 = 1371933048;
      var1 = 1892460058;
      var10010 = (var1 | var2) & ~(var1 & var2);
      var2 = 937463769;
      var1 = var10010;
      var10010 = var1 & ~var2 | ~var1 & var2;
      var2 = -245477984;
      var1 = -1055990362;
      var10011 = (var1 | var2) - (var1 & var2);
      var2 = 811255048;
      var1 = var10011;
      var1125[var10005] = c(
         "㛲圓㛣圗㛳圈㛡圎", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7d4ꒂꁙ꤀絺蹚⑿謥㑚}\ua7e2꒠ꁽ꤀", var10008, var10009, var10010, var1 + var2 - 2 * (var1 & var2)
      );
      var2 = -1217731071;
      var1 = 406469280;
      var10005 = (var1 | var2) - (var1 & var2);
      var2 = -1353655155;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var10008 = (int)-3413058819439121552L;
      var2 = -173768032;
      var1 = var10008;
      var10008 = var1 & ~var2 | ~var1 & var2;
      var2 = 1539939618;
      var1 = var10008;
      var10008 = var1 + var2 - 2 * (var1 & var2);
      var10009 = (int)-751312438191335035L;
      var2 = 96141965;
      var1 = var10009;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var2 = 1806534313;
      var1 = var10009;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var2 = 1828103061;
      var1 = 1874353989;
      var10010 = (var1 | var2) & ~(var1 & var2);
      var2 = 485807039;
      var1 = var10010;
      var10010 = var1 & ~var2 | ~var1 & var2;
      var2 = -1667860896;
      var1 = 1645768644;
      var10011 = (var1 | var2) - (var1 & var2);
      var2 = -21545063;
      var1 = var10011;
      var1125[var10005] = c(
         "㛣\u242e㛴␣㛡\u2439㛡␡", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7d4ꒂꁙ꤀絺蹚⑿謥㑚}\ua7e2꒠ꁽ꤀", var10008, var10009, var10010, var1 & ~var2 | ~var1 & var2
      );
      var2 = -1942564552;
      var1 = 301063077;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var2 = -1647899984;
      var1 = var10005;
      var10005 = (var1 | var2) - (var1 & var2);
      var2 = -1253081814;
      var1 = 1824438208;
      var10008 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1246625304;
      var1 = var10008;
      var10008 = var1 + var2 - 2 * (var1 & var2);
      var10009 = (int)-1360868431400139814L;
      var2 = -2143375705;
      var1 = var10009;
      var10009 = (var1 | var2) & ~(var1 & var2);
      var2 = -1339825278;
      var1 = var10009;
      var10009 = (var1 | var2) & ~(var1 & var2);
      var2 = -1549420529;
      var1 = -1769590705;
      var10010 = (var1 | var2) & ~(var1 & var2);
      var2 = 643626884;
      var1 = var10010;
      var10010 = var1 + var2 - 2 * (var1 & var2);
      var2 = -468363438;
      var1 = -385103739;
      var10011 = var1 + var2 - 2 * (var1 & var2);
      var2 = 221481036;
      var1 = var10011;
      var1125[var10005] = c("㛩ᖄ㛰ᖈ㛣ᖝ", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7d4ꒂꁙ꤀絺蹚⑿謥㑚}\ua7e2꒠ꁽ꤀", var10008, var10009, var10010, var1 & ~var2 | ~var1 & var2);
      var10005 = (int)1828425515403393497L;
      var2 = 1729486584;
      var1 = var10005;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = -118167793;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1959984011;
      var1 = 529764371;
      var10008 = (var1 | var2) & ~(var1 & var2);
      var2 = 117612692;
      var1 = var10008;
      var10008 = (var1 | var2) - (var1 & var2);
      var2 = 1783360792;
      var1 = -813151842;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var2 = -1510669758;
      var1 = var10009;
      var10009 = (var1 | var2) & (~var1 | ~var2);
      var10010 = (int)5026951271515386554L;
      var2 = -1802847859;
      var1 = var10010;
      var10010 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1457994023;
      var1 = var10010;
      var10010 = var1 & ~var2 | ~var1 & var2;
      var10011 = (int)-2678577119109996815L;
      var2 = 957517438;
      var1 = var10011;
      var10011 = (var1 | var2) & ~(var1 & var2);
      var2 = 2130411503;
      var1 = var10011;
      var1125[var10005] = c(
         "㛭浳㛴浻㛸", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7d4ꒂꁙ꤀絺蹚⑿謥㑚}\ua7e2꒠ꁽ꤀", var10008, var10009, var10010, var1 + var2 - 2 * (var1 & var2)
      );
      var2 = -724736502;
      var1 = -1676156515;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1222281144;
      var1 = var10005;
      var10005 = (var1 | var2) - (var1 & var2);
      var10008 = (int)1351828589456606829L;
      var2 = 78761780;
      var1 = var10008;
      var10008 = (var1 | var2) - (var1 & var2);
      var2 = 13286827;
      var1 = var10008;
      var10008 = var1 + var2 - 2 * (var1 & var2);
      var10009 = (int)-2809755957122125847L;
      var2 = -1816667471;
      var1 = var10009;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var2 = 1839390680;
      var1 = var10009;
      var10009 = (var1 | var2) & (~var1 | ~var2);
      var10010 = (int)120565596141056951L;
      var2 = -519613354;
      var1 = var10010;
      var10010 = (var1 | var2) & ~(var1 & var2);
      var2 = -1298548138;
      var1 = var10010;
      var10010 = (var1 | var2) & ~(var1 & var2);
      var10011 = (int)3952315749690587294L;
      var2 = 1356228671;
      var1 = var10011;
      var10011 = (var1 | var2) - (var1 & var2);
      var2 = -1129962563;
      var1 = var10011;
      var1125[var10005] = c(
         "㛩焀㛥焜㛴焇㛡", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7d4ꒂꁙ꤀絺蹚⑿謥㑚}\ua7e2꒠ꁽ꤀", var10008, var10009, var10010, (var1 | var2) & ~(var1 & var2)
      );
      var2 = 2072925711;
      var1 = -1454213556;
      var10005 = (var1 | var2) - (var1 & var2);
      var2 = -757325709;
      var1 = var10005;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = -1984283660;
      var1 = 1765438903;
      var10008 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1933343409;
      var1 = var10008;
      var10008 = (var1 | var2) & (~var1 | ~var2);
      var10009 = (int)1784590614209898816L;
      var2 = -1337686193;
      var1 = var10009;
      var10009 = (var1 | var2) & ~(var1 & var2);
      var2 = -318593568;
      var1 = var10009;
      var10009 = (var1 | var2) - (var1 & var2);
      var10010 = (int)7207976793479007213L;
      var2 = -826907691;
      var1 = var10010;
      var10010 = (var1 | var2) - (var1 & var2);
      var2 = -2099103312;
      var1 = var10010;
      var10010 = (var1 | var2) & ~(var1 & var2);
      var10011 = (int)3117287215155600893L;
      var2 = -1075416271;
      var1 = var10011;
      var10011 = (var1 | var2) - (var1 & var2);
      var2 = 2112944711;
      var1 = var10011;
      var1125[var10005] = c(
         "㛷횜㛸", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7d4ꒂꁙ꤀絺蹚⑿謥㑚}\ua7e2꒠ꁽ꤀", var10008, var10009, var10010, var1 + var2 - 2 * (var1 & var2)
      );
      var2 = -706106707;
      var1 = -631052123;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var2 = 260784697;
      var1 = var10005;
      var10005 = (var1 | var2) - (var1 & var2);
      var10008 = (int)6755988185670498176L;
      var2 = 1378171020;
      var1 = var10008;
      var10008 = var1 + var2 - 2 * (var1 & var2);
      var2 = 137968638;
      var1 = var10008;
      var10008 = (var1 | var2) - (var1 & var2);
      var10009 = (int)1060800059140517316L;
      var2 = 1235542797;
      var1 = var10009;
      var10009 = (var1 | var2) & (~var1 | ~var2);
      var2 = -950063375;
      var1 = var10009;
      var10009 = (var1 | var2) & (~var1 | ~var2);
      var10010 = (int)4519130448583852988L;
      var2 = -1993572135;
      var1 = var10010;
      var10010 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1905341353;
      var1 = var10010;
      var10010 = var1 & ~var2 | ~var1 & var2;
      var10011 = (int)6362632601857309267L;
      var2 = -1396571891;
      var1 = var10011;
      var10011 = (var1 | var2) & ~(var1 & var2);
      var2 = -1428352118;
      var1 = var10011;
      var1125[var10005] = c(
         "㛷⫃㛸⫕㛩⫂㛥", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7d4ꒂꁙ꤀絺蹚⑿謥㑚}\ua7e2꒠ꁽ꤀", var10008, var10009, var10010, (var1 | var2) & ~(var1 & var2)
      );
      var10005 = (int)-5732324026875619514L;
      var2 = 1546202378;
      var1 = var10005;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = 1821211262;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1839419332;
      var1 = 789962696;
      var10008 = (var1 | var2) - (var1 & var2);
      var2 = 787831558;
      var1 = var10008;
      var10008 = (var1 | var2) & ~(var1 & var2);
      var2 = -1271202912;
      var1 = -1730532670;
      var10009 = (var1 | var2) - (var1 & var2);
      var2 = 750754418;
      var1 = var10009;
      var10009 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1230327799;
      var1 = 255163040;
      var10010 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1422482411;
      var1 = var10010;
      var10010 = var1 & ~var2 | ~var1 & var2;
      var2 = -1642812259;
      var1 = 327443233;
      var10011 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1915364336;
      var1 = var10011;
      var1125[var10005] = c(
         "㛮ᆫ㛲ᆷ㛫", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7d4ꒂꁙ꤀絺蹚⑿謥㑚}\ua7e2꒠ꁽ꤀", var10008, var10009, var10010, (var1 | var2) - (var1 & var2)
      );
      var10005 = (int)-5835668985517423048L;
      var2 = 24513425;
      var1 = var10005;
      var10005 = (var1 | var2) - (var1 & var2);
      var2 = -233943654;
      var1 = var10005;
      var10005 = (var1 | var2) - (var1 & var2);
      var10008 = (int)5429970387527261134L;
      var2 = -1889696201;
      var1 = var10008;
      var10008 = var1 & ~var2 | ~var1 & var2;
      var2 = 1167223051;
      var1 = var10008;
      var10008 = var1 + var2 - 2 * (var1 & var2);
      var10009 = (int)-520592695728375005L;
      var2 = 1553650975;
      var1 = var10009;
      var10009 = var1 + var2 - 2 * (var1 & var2);
      var2 = -829803844;
      var1 = var10009;
      var10009 = var1 + var2 - 2 * (var1 & var2);
      var10010 = (int)7057934097568747377L;
      var2 = -1954412353;
      var1 = var10010;
      var10010 = (var1 | var2) & ~(var1 & var2);
      var2 = 1144705901;
      var1 = var10010;
      var10010 = (var1 | var2) & (~var1 | ~var2);
      var10011 = (int)4620417399003970538L;
      var2 = -801728117;
      var1 = var10011;
      var10011 = (var1 | var2) - (var1 & var2);
      var2 = 634685309;
      var1 = var10011;
      var1125[var10005] = c(
         "㛮望㛲朂㛡最", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7d4ꒂꁙ꤀絺蹚⑿謥㑚}\ua7e2꒠ꁽ꤀", var10008, var10009, var10010, (var1 | var2) & (~var1 | ~var2)
      );
      var10005 = (int)-1076065870473125306L;
      var2 = -868405017;
      var1 = var10005;
      var10005 = (var1 | var2) - (var1 & var2);
      var2 = 263852693;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1954965775;
      var1 = -1750043336;
      var10008 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1888102597;
      var1 = var10008;
      var10008 = var1 & ~var2 | ~var1 & var2;
      var10009 = (int)8424461606850675470L;
      var2 = -623350596;
      var1 = var10009;
      var10009 = (var1 | var2) & ~(var1 & var2);
      var2 = -2038114681;
      var1 = var10009;
      var10009 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1397127111;
      var1 = -1908347867;
      var10010 = var1 & ~var2 | ~var1 & var2;
      var2 = -60631948;
      var1 = var10010;
      var10010 = (var1 | var2) - (var1 & var2);
      var2 = 2115031244;
      var1 = 674984313;
      var10011 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1445552228;
      var1 = var10011;
      var1125[var10005] = c("㛲쏊㛣쏋", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7d4ꒂꁙ꤀絺蹚⑿謥㑚}\ua7e2꒠ꁽ꤀", var10008, var10009, var10010, (var1 | var2) - (var1 & var2));
      var10005 = (int)-7759196570271771299L;
      var2 = -172234106;
      var1 = var10005;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = -1153531922;
      var1 = var10005;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var10008 = (int)8472668676945595032L;
      var2 = -1201390088;
      var1 = var10008;
      var10008 = (var1 | var2) & ~(var1 & var2);
      var2 = -1355562094;
      var1 = var10008;
      var10008 = (var1 | var2) - (var1 & var2);
      var2 = 1751249031;
      var1 = 1010721231;
      var10009 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1413859165;
      var1 = var10009;
      var10009 = var1 + var2 - 2 * (var1 & var2);
      var10010 = (int)6414826154602254471L;
      var2 = 433492847;
      var1 = var10010;
      var10010 = (var1 | var2) & ~(var1 & var2);
      var2 = -1635169976;
      var1 = var10010;
      var10010 = (var1 | var2) & (~var1 | ~var2);
      var2 = 821534019;
      var1 = 444963106;
      var1125[var10005] = c(
         "㛦Ჶ㛮Ჳ㛡Ჺ", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7d4ꒂꁙ꤀絺蹚⑿謥㑚}\ua7e2꒠ꁽ꤀", var10008, var10009, var10010, (var1 & ~var2 | ~var1 & var2) ^ 712121040
      );
      var1125[-1057291328 ^ -502612581 ^ 586268269] = c(
         "㛦\uf63e㛵\uf635㛥\uf620",
         "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7d4ꒂꁙ꤀絺蹚⑿謥㑚}\ua7e2꒠ꁽ꤀",
         (int)-727509461740654849L ^ -369477980 ^ -1200591703,
         (int)-6695791105512093830L ^ -1804182638 ^ -1249626260,
         (int)1876684009740549451L ^ 1328668169 ^ -1610156692,
         461337760 ^ -638530456 ^ -1029616408
      );
      var1125[(int)-6918488437754524815L ^ 254319974 ^ -472508896] = c(
         "㛲ݨ㛫ݤ㛲",
         "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7d4ꒂꁙ꤀絺蹚⑿謥㑚}\ua7e2꒠ꁽ꤀",
         1594414976 ^ 142727192 ^ -1003144342,
         (int)3684671229727022684L ^ 349391418 ^ 88369329,
         -37371415 ^ -1017606701 ^ 734975607,
         (int)3751732709040636805L ^ -1386309781 ^ -610774627
      );
      var1125[(int)5500680974898972454L ^ -1689686097 ^ 1892886705] = c(
         "㛦㡤㛮㡥㛩㡼㛥",
         "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7d4ꒂꁙ꤀絺蹚⑿謥㑚}\ua7e2꒠ꁽ꤀",
         (int)4015306668042185694L ^ 724264525 ^ 1149122913,
         2012861016 ^ 1774670292 ^ 505213515,
         -1243337795 ^ -88466995 ^ 1177512812,
         (int)5115059212310815634L ^ -1120648632 ^ 131881913
      );
      var1125[-42559816 ^ 1064146897 ^ -1038417584] = c(
         "㛨ꆬ㛬ꆺ㛷ꆬ㛲ꆯ㛤",
         "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7d4ꒂꁙ꤀絺蹚⑿謥㑚}\ua7e2꒠ꁽ꤀",
         823148625 ^ -1669777102 ^ 1054166417,
         (int)8708708500302191397L ^ 1444238654 ^ -758819570,
         695971665 ^ 384739959 ^ 834952673,
         1073836329 ^ 1296106706 ^ 224777802
      );
      var1125[(int)-4493398219483352487L ^ -2145875923 ^ -582288818] = c(
         "㛷ὶ㛥",
         "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7d4ꒂꁙ꤀絺蹚⑿謥㑚}\ua7e2꒠ꁽ꤀",
         (int)-6552143013624095364L ^ 1300758175 ^ 224073489,
         -1732053745 ^ 1671484791 ^ -83790673,
         (int)-6879835702063458876L ^ -1974288908 ^ -636831509,
         (int)2434592941594095788L ^ -1844570886 ^ 841267493
      );
      var1125[(int)539831471134299940L ^ 900632859 ^ -702036476] = c(
         "㛨턖㛨",
         "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7d4ꒂꁙ꤀絺蹚⑿謥㑚}\ua7e2꒠ꁽ꤀",
         (int)-812122400318112301L ^ -2086332036 ^ -553676707,
         (int)9097551633642643599L ^ -355420334 ^ 1670176171,
         (int)-3023181545422606027L ^ 1790911270 ^ -1952586139,
         1325029936 ^ -1917656450 ^ -1015780516
      );
      var1125[-1304127989 ^ -864390406 ^ 2118051021] = c(
         "㛲ᤫ㛧ᤥ㛬\u192d㛫",
         "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7d4ꒂꁙ꤀絺蹚⑿謥㑚}\ua7e2꒠ꁽ꤀",
         2017368502 ^ -874680916 ^ 543146216,
         -1059027590 ^ 1694480937 ^ -1537315383,
         (int)574422330012685L ^ -341365015 ^ -54758923,
         -156112447 ^ -1004144621 ^ 850594532
      );
      var1125[197615393 ^ 131660576 ^ 203400252] = c(
         "㛴焐㛵焖㛤焝㛲焐㛡焛㛫",
         "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7d4ꒂꁙ꤀絺蹚⑿謥㑚}\ua7e2꒠ꁽ꤀",
         (int)5955625147013036873L ^ -1571067360 ^ 1727997339,
         (int)-6263706774873013038L ^ 1595789892 ^ -1387004680,
         -624467951 ^ -1515051548 ^ 1959659923,
         (int)-2600756255734725333L ^ -1794153959 ^ 1754895416
      );
      var1125[(int)2324915310635472938L ^ 1297402568 ^ 2048889564] = c(
         "㛬滛㛱彩㛩歹㛢爵㛵犯㛣杖",
         "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=\ua7d4ꒂꁙ꤀絺蹚⑿謥㑚}\ua7e2꒠ꁽ꤀",
         (int)-6261006395659557859L ^ -2108144862 ^ -341371955,
         1115453767 ^ -13953365 ^ -1119076341,
         -1303027970 ^ -64213200 ^ 1123371555,
         (int)6002513529944432330L ^ -181009892 ^ 1122411605
      );
      this.e = new HashSet<>(Arrays.asList(var1125));
   }

   @EventHandler
   private void a(PacketEvent var1) {
   }

   public static String c(String var0, String var1, int var2, int var3, int var4, int var5) {
      char[] var6 = var1.toCharArray();
      char[] var7 = new char[var6.length];
      int var18 = 1566429673;
      int var17 = 1420666029;
      int var10000 = (var17 | var18) & (~var17 | ~var18);
      var18 = 166753614;
      var17 = var10000;
      char[] var219 = new char[(var17 | var18) & ~(var17 & var18)];
      var18 = -1732504486;
      var17 = 222443543;
      int var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1778504627;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      int var10003 = (int)-6763866439608754779L;
      var18 = 1848057102;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 684214425;
      var17 = var10003;
      var219[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var10002 = (int)-2463623252124282077L;
      var18 = -1868163551;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -333757181;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var10003 = (int)8519695652489010632L;
      var18 = 1660511134;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -470458925;
      var17 = var10003;
      var219[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var18 = -750368459;
      var17 = -2059145572;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 1443211179;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 1752648590;
      var17 = -1344919112;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -945733200;
      var17 = var10003;
      var219[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var10002 = (int)9182937669456101243L;
      var18 = 1604477635;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1775869371;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var10003 = (int)-8986419752224268634L;
      var18 = 1881590004;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -2110255551;
      var17 = var10003;
      var219[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var18 = 1042013053;
      var17 = -1236958122;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -2007081169;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -1476042964;
      var17 = 1543028772;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -201519571;
      var17 = var10003;
      var219[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var18 = 1289154915;
      var17 = -1889823433;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1014143919;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)-8764972269882318966L;
      var18 = -1177826521;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1917341999;
      var17 = var10003;
      var219[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var10002 = (int)4179447778901009830L;
      var18 = 1228722298;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 864843226;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)4082564612788936749L;
      var18 = -1580508471;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 739652599;
      var17 = var10003;
      var219[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var10002 = (int)-1106922596545424383L;
      var18 = -1990434184;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -699206018;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -255668460;
      var17 = 229504874;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -43053988;
      var17 = var10003;
      var219[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var10002 = (int)6196758662876485130L;
      var18 = 523493389;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 346043919;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 1711547422;
      var17 = -1589208570;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -951929269;
      var17 = var10003;
      var219[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var10002 = (int)2977207864896595429L;
      var18 = 1414091232;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 769684492;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)-4692806682485218184L;
      var18 = 972080132;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -1424791720;
      var17 = var10003;
      var219[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      char[] var8 = var219;
      var10000 = (int)-8190651231644761585L;
      var18 = 889391889;
      var17 = var10000;
      var10000 = (var17 | var18) & (~var17 | ~var18);
      var18 = -5125868;
      var17 = var10000;
      char[] var222 = new char[var17 & ~var18 | ~var17 & var18];
      var18 = 1152500949;
      var17 = 1612146055;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 614900050;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1554390833;
      var17 = 1379777700;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 245099445;
      var17 = var10003;
      var222[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var18 = 1927048743;
      var17 = 877367870;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 1184365592;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 1429424399;
      var17 = 1780976857;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1058292181;
      var17 = var10003;
      var222[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var10002 = (int)-7705454528791422516L;
      var18 = -1291530854;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -646802348;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)-4917584623293106245L;
      var18 = 1698362284;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1970633916;
      var17 = var10003;
      var222[var10002] = (char)((var17 | var18) - (var17 & var18));
      var10002 = (int)-519708191453456138L;
      var18 = -1688329760;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -556762859;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var10003 = (int)290151159900786435L;
      var18 = -2047307866;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -722110297;
      var17 = var10003;
      var222[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var10002 = (int)7333350892620371378L;
      var18 = 2105477548;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 177298458;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)-96847971421431914L;
      var18 = -433527561;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -1675785439;
      var17 = var10003;
      var222[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var18 = 992958334;
      var17 = -2035258652;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1113637473;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)5145264573194960677L;
      var18 = -711436648;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1925738199;
      var17 = var10003;
      var222[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var18 = 1746088889;
      var17 = 1966892296;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 489641655;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -1446318235;
      var17 = -377825705;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1085324811;
      var17 = var10003;
      var222[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var18 = -2111998144;
      var17 = -1707607686;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 405442109;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)4127919548753386222L;
      var18 = -1025992188;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -1106341678;
      var17 = var10003;
      var222[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var18 = 1581562169;
      var17 = 1091671588;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 525676309;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1404668567;
      var17 = 673276038;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -2073585941;
      var17 = var10003;
      var222[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var18 = 1886676648;
      var17 = 157215617;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 2032831776;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var10003 = (int)4249879388884657725L;
      var18 = -393231379;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 2016843491;
      var17 = var10003;
      var222[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      char[] var9 = var222;
      var10000 = (int)-7728049156516743962L;
      var18 = 44764420;
      var17 = var10000;
      var10000 = var17 & ~var18 | ~var17 & var18;
      var18 = -1314588190;
      var17 = var10000;

      for (int var10 = (var17 | var18) & (~var17 | ~var18); var10 < var6.length; var10++) {
         char var277 = var6[var10];
         char var205 = var8[var10 % var8.length];
         char var106 = var277;
         var7[var10] = (char)((var106 | var205) - (var106 & var205));
      }

      char[] var19 = new char[var7.length];
      var18 = -895416384;
      var17 = -94571415;
      var10000 = (var17 | var18) & (~var17 | ~var18);
      var18 = 821949353;
      var17 = var10000;

      for (int var11 = (var17 | var18) & ~(var17 & var18); var11 < var6.length; var11++) {
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
      int var13 = (var17 & ~var18) - (~var17 & var18);
      char[] var14 = var0.toCharArray();
      char[] var15 = new char[var14.length];
      var18 = 336164533;
      var17 = 85587550;
      var10000 = var17 + var18 - 2 * (var17 & var18);
      var18 = 286294251;
      var17 = var10000;

      for (int var16 = var17 + var18 - 2 * (var17 & var18); var16 < var15.length; var16++) {
         int var10001 = (int)6597399978146925996L;
         var18 = -2039129879;
         var17 = var10001;
         var10001 = (var17 | var18) - (var17 & var18);
         var18 = -588556985;
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
               var10002 = var17 & ~var18 | ~var17 & var18;
               char var216 = var14[var16];
               var17 = var10002;
               var15[var16] = (char)(var17 & ~var216 | ~var17 & var216);
         }
      }

      return new String(var15);
   }
}
