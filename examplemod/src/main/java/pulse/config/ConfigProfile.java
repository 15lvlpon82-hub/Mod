package pulse;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import ru.pulse.Pulse;

public class ConfigProfile {
   private static final DateTimeFormatter c;
   private static final String d = "pulse_config_v1";
   private final String e;
   private final int f;
   private final String g;
   private final long h;
   private String i;
   private String j;
   private long k;
   public static int a;
   public static boolean b;

   private ConfigProfile(String var1, String var2, int var3, String var4, long var5, String var7, long var8) {
      this.i = var1;
      this.e = var2;
      this.f = var3;
      this.g = var4;
      this.h = var5;
      this.j = var7;
      this.k = var8;
   }

   public static ConfigProfile a(String var0) {
      int var8 = -2132722252;
      int var7 = 823699259;
      int var10000 = (var7 | var8) & ~(var7 & var8);
      var8 = -515258945;
      var7 = var10000;
      var10000 = (var7 | var8) - (var7 & var8);
      int var10001 = (int)-4535081839782739791L;
      var8 = 1159862852;
      var7 = var10001;
      var10001 = (var7 | var8) - (var7 & var8);
      var8 = -2033384982;
      var7 = var10001;
      var8 = var7 & ~var8 | ~var7 & var8;
      var7 = var10000;
      var10000 = 2 * (var7 | var8) - (var7 ^ var8);
      var8 = -427479341;
      var7 = -2041211154;
      var10001 = var7 & ~var8 | ~var7 & var8;
      var8 = -1869162964;
      var7 = var10001;
      var10001 = (var7 + var8 - 2 * (var7 & var8)) * (var7 + var8 - 2 * (var7 & var8));
      var8 = 2073752937;
      var7 = -155069244;
      int var10003 = var7 & ~var8 | ~var7 & var8;
      var8 = -1923407448;
      var7 = var10003;
      var10003 = var7 & ~var8 | ~var7 & var8;
      var8 = 1646480678;
      var7 = -1115116559;
      var10003 = (var7 | var8) & (~var7 | ~var8);
      var8 = -542382395;
      var7 = var10003;
      var10003 = (var7 | var8) & (~var7 | ~var8);
      var8 = -1674984888;
      var7 = 1675225357;
      var10003 = (var7 | var8) & ~(var7 & var8);
      var8 = -1037493;
      var7 = var10003;
      var10003 = var7 & ~var8 | ~var7 & var8;
      var10003 = (int)-301633791835169478L;
      var8 = 1439364611;
      var7 = var10003;
      var10003 = var7 & ~var8 | ~var7 & var8;
      var8 = 1285810999;
      var7 = var10003;
      var10003 = (var7 | var8) & (~var7 | ~var8);
      var10003 = (int)217883320278122122L;
      var8 = -2143155365;
      var7 = var10003;
      var10003 = var7 + var8 - 2 * (var7 & var8);
      var8 = 871036352;
      var7 = var10003;
      var10003 = (var7 | var8) & (~var7 | ~var8);
      var8 = -1679894928;
      var7 = -474765719;
      int var10002 = (var7 | var8) - (var7 & var8);
      var8 = -58721467;
      var7 = var10002;
      var10002 = (var7 | var8) & (~var7 | ~var8);
      int var10004 = (int)4331362157452691383L;
      var8 = 241919960;
      var7 = var10004;
      var10004 = (var7 | var8) - (var7 & var8);
      var8 = 182640742;
      var7 = var10004;
      var10004 = var7 + var8 - 2 * (var7 & var8);
      var8 = -1319812600;
      var7 = -778638091;
      var10004 = (var7 | var8) & (~var7 | ~var8);
      var8 = 1623437050;
      var7 = var10004;
      var10004 = (var7 | var8) & (~var7 | ~var8);
      var8 = -1701006813;
      var7 = 1562173511;
      var10003 = (var7 | var8) - (var7 & var8);
      var8 = 1617998100;
      var7 = var10003;
      var10003 = (var7 | var8) & (~var7 | ~var8);
      var8 = 2012010687;
      var7 = -1607012554;
      var10004 = (var7 | var8) & ~(var7 & var8);
      var8 = 903871356;
      var7 = var10004;
      var10004 = (var7 | var8) - (var7 & var8);
      var10004 = (int)5769318615979979912L;
      var8 = -733451440;
      var7 = var10004;
      var10004 = (var7 | var8) - (var7 & var8);
      var8 = 308105281;
      var7 = var10004;
      var10004 = (var7 | var8) - (var7 & var8);
      var8 = -1789479009;
      var7 = -1595934068;
      int var10005 = var7 + var8 - 2 * (var7 & var8);
      var8 = -56478236;
      var7 = var10005;
      var10005 = (var7 | var8) & (~var7 | ~var8);
      var10005 = (int)8787706209174983138L;
      var8 = -1152716105;
      var7 = var10005;
      var10005 = var7 + var8 - 2 * (var7 & var8);
      var8 = 1461738053;
      var7 = var10005;
      String var1 = a("鐍♺鐳♺鐷♣鐶", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴}\ua7e8꒳ꁸ꤂紹蹩⑵謹㑱{\ua7e1꒘ꁴꤑ絷蹎⑻謣㑶", var10002, var10003, var10004, (var7 | var8) & (~var7 | ~var8));
      var8 = 1416888522;
      var7 = -26121862;
      var10000 = var7 & ~var8 | ~var7 & var8;
      var8 = -1442485840;
      var7 = var10000;
      int var2 = (var7 | var8) - (var7 & var8);
      UserInfo var3 = Pulse.getUserInfo();
      if (var3 != null) {
         var1 = var3.d();
         var2 = var3.c();
      }

      long var4 = System.currentTimeMillis();
      String var6 = a(var2, var4);
      int var10007 = (int)-2558452643577111787L;
      var8 = 505795169;
      var7 = var10007;
      var10007 = var7 + var8 - 2 * (var7 & var8);
      var8 = 1563457228;
      var7 = var10007;
      var10007 = ((var7 | var8) & (~var7 | ~var8)) * ((var7 | var8) & (~var7 | ~var8));
      int var10008 = (int)-7419393384787847036L;
      var8 = -1955724448;
      var7 = var10008;
      var10008 = (var7 | var8) - (var7 & var8);
      var8 = 1507277723;
      var7 = var10008;
      var10008 = (var7 | var8) & ~(var7 & var8);
      var8 = 1136881088;
      var7 = -480761630;
      int var10009 = var7 & ~var8 | ~var7 & var8;
      var8 = -1268901026;
      var7 = var10009;
      var8 = (var7 | var8) & (~var7 | ~var8);
      var7 = var10008;
      var10008 = 2 * (var7 | var8) - (var7 ^ var8);
      var8 = 1034200115;
      var7 = 519715723;
      int var10010 = (var7 | var8) & (~var7 | ~var8);
      var8 = 593403833;
      var7 = var10010;
      var10010 = (var7 | var8) & (~var7 | ~var8);
      var10010 = (int)-4243079959789805753L;
      var8 = -1284374919;
      var7 = var10010;
      var10010 = (var7 | var8) & (~var7 | ~var8);
      var8 = 1347920178;
      var7 = var10010;
      var10010 = (var7 | var8) - (var7 & var8);
      var10009 = (int)-1307430235704336205L;
      var8 = -2055498385;
      var7 = var10009;
      var10009 = var7 + var8 - 2 * (var7 & var8);
      var8 = -1319764352;
      var7 = var10009;
      var10009 = var7 + var8 - 2 * (var7 & var8);
      var10010 = (int)5894712902750797061L;
      var8 = -1482953451;
      var7 = var10010;
      var10010 = var7 + var8 - 2 * (var7 & var8);
      var8 = 18839928;
      var7 = var10010;
      var10010 = (var7 | var8) & (~var7 | ~var8);
      int var10011 = (int)7136481665149023546L;
      var8 = 1427455385;
      var7 = var10011;
      var10011 = var7 & ~var8 | ~var7 & var8;
      var8 = -326071946;
      var7 = var10011;
      var8 = (var7 | var8) & ~(var7 & var8);
      var7 = var10010;
      var10010 = (var7 & ~var8) + (var8 & ~var7) + 2 * (var7 & var8);
      var8 = -1148773094;
      var7 = 916065946;
      var10010 = (var7 | var8) & (~var7 | ~var8);
      var8 = 720792046;
      var7 = var10010;
      var10010 = var7 + var8 - 2 * (var7 & var8);
      var8 = -49768949;
      var7 = 430262706;
      var10011 = (var7 | var8) & (~var7 | ~var8);
      var8 = -389791611;
      var7 = var10011;
      var10011 = var7 & ~var8 | ~var7 & var8;
      var8 = -1970847378;
      var7 = 618283445;
      var10011 = var7 + var8 - 2 * (var7 & var8);
      var8 = -1232257350;
      var7 = var10011;
      var10011 = var7 & ~var8 | ~var7 & var8;
      int var10012 = (int)-3938306842222855428L;
      var8 = 736715661;
      var7 = var10012;
      var10012 = var7 & ~var8 | ~var7 & var8;
      var8 = -1076248188;
      var7 = var10012;
      var10012 = var7 & ~var8 | ~var7 & var8;
      var10012 = (int)6653571092149168401L;
      var8 = 1294642290;
      var7 = var10012;
      var10012 = var7 & ~var8 | ~var7 & var8;
      var8 = -1235249811;
      var7 = var10012;
      return new ConfigProfile(
         var0, var1, var2, var6, var4, a("", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴}\ua7e8꒳ꁸ꤂紹蹩⑵謹㑱{\ua7e1꒘ꁴꤑ絷蹎⑻謣㑶", var10009, var10010, var10011, var7 + var8 - 2 * (var7 & var8)), var4
      );
   }

   public static ConfigProfile a(String var0, String var1) {
      ConfigProfile var2 = a(var0);
      var2.j = var1;
      return var2;
   }

   public static ConfigProfile a(String var0, String var1, int var2, String var3, long var4, String var6, long var7) {
      return new ConfigProfile(var0, var1, var2, var3, var4, var6, var7);
   }

   private static String a(int var0, long var1) {
      try {
         long var10 = var1;
         int var9 = var0;
         StringBuilder var10000 = new StringBuilder();
         String var10001 = "dje";
         int var13 = 353617916;
         int var12 = 2100144224;
         int var10002 = var12 & ~var13 | ~var12 & var13;
         var13 = 446044185;
         var12 = var10002;
         var10002 = (var12 | var13) - (var12 & var13);
         int var10003 = (int)-3475093822271969900L;
         var13 = 172617126;
         var12 = var10003;
         var10003 = (var12 | var13) - (var12 & var13);
         var13 = -283056965;
         var12 = var10003;
         var10003 = (var12 | var13) & (~var12 | ~var13);
         int var10004 = (int)4494301815221264185L;
         var13 = -1086153915;
         var12 = var10004;
         var10004 = var12 + var13 - 2 * (var12 & var13);
         var13 = -1770649721;
         var12 = var10004;
         var13 = (var12 | var13) & (~var12 | ~var13);
         var12 = var10003;
         var10003 = (var12 | var13) + (var12 & var13);
         var13 = -1777103215;
         var12 = -1785120640;
         var10003 = var12 + var13 - 2 * (var12 & var13);
         var13 = -2020065971;
         var12 = var10003;
         var10003 = (var12 | var13) & ~(var12 & var13);
         var10004 = (int)4845110308617214909L;
         var13 = -1916472257;
         var12 = var10004;
         var10004 = var12 + var13 - 2 * (var12 & var13);
         var13 = -917204056;
         var12 = var10004;
         var10004 = (var12 | var13) - (var12 & var13);
         int var10005 = (int)-4457507301310490909L;
         var13 = -53812762;
         var12 = var10005;
         var10005 = var12 + var13 - 2 * (var12 & var13);
         var13 = 1939870133;
         var12 = var10005;
         var13 = var12 + var13 - 2 * (var12 & var13);
         var12 = var10004;
         var10004 = var12 - ~var13 - 1;
         var10004 = (int)720767807023508435L;
         var13 = 1530502403;
         var12 = var10004;
         var10004 = var12 + var13 - 2 * (var12 & var13);
         var13 = 1415831740;
         var12 = var10004;
         var10004 = (var12 | var13) & (~var12 | ~var13);
         int var10006 = (int)3664657638735944019L;
         var13 = -1401139356;
         var12 = var10006;
         var10006 = (var12 | var13) & (~var12 | ~var13);
         var13 = 1614501414;
         var12 = var10006;
         var10006 = (var12 | var13) & (~var12 | ~var13);
         var13 = 2120944607;
         var12 = 2146407081;
         var10006 = (var12 | var13) & ~(var12 & var13);
         var13 = 25467263;
         var12 = var10006;
         var10006 = var12 + var13 - 2 * (var12 & var13);
         var13 = 1440026461;
         var12 = -512602864;
         var10006 = (var12 | var13) - (var12 & var13);
         var13 = -1264106936;
         var12 = var10006;
         var10006 = (var12 | var13) - (var12 & var13);
         var10006 = (int)-5834307602019953334L;
         var13 = -1151491289;
         var12 = var10006;
         var10006 = (var12 | var13) & ~(var12 & var13);
         var13 = 73463401;
         var12 = var10006;
         var10006 = (var12 | var13) & ~(var12 & var13);
         var10005 = (int)-339882151728401847L;
         var13 = -965874190;
         var12 = var10005;
         var10005 = (var12 | var13) & ~(var12 & var13);
         var13 = 447882814;
         var12 = var10005;
         var10005 = var12 + var13 - 2 * (var12 & var13);
         String var269 = "djf";
         var13 = -1125154533;
         var12 = 1377183797;
         var10006 = var12 + var13 - 2 * (var12 & var13);
         var13 = -285590173;
         var12 = var10006;
         var10000 = var10000.append(
               a("緯拻緳拽緺拑緼拡緱拨緶择緀拸綮抴", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴}\ua7e8꒳ꁸ꤂紹蹩⑵謹㑱{\ua7e1꒘ꁴꤑ絷蹎⑻謣㑶", var10003, var10004, var10005, var12 & ~var13 | ~var12 & var13)
            )
            .append(var9);
         var13 = -1301734393;
         var12 = -1949397212;
         int var199 = (var12 | var13) & ~(var12 & var13);
         var13 = -1264033183;
         var12 = var199;
         int var200 = ((var12 | var13) & ~(var12 & var13)) * ((var12 | var13) & ~(var12 & var13));
         var10002 = (int)86062068340408775L;
         var13 = -1571800227;
         var12 = var10002;
         var10002 = (var12 | var13) - (var12 & var13);
         var13 = 178870960;
         var12 = var10002;
         var10002 = ((var12 | var13) & ~(var12 & var13)) * ((var12 | var13) & ~(var12 & var13));
         String var221 = "djg";
         var13 = 381010346;
         var12 = 1096218588;
         var10003 = (var12 | var13) & ~(var12 & var13);
         var13 = -739132118;
         var12 = var10003;
         var10003 = var12 & ~var13 | ~var12 & var13;
         var13 = 1904025102;
         var12 = -1862905563;
         var10004 = var12 + var13 - 2 * (var12 & var13);
         var13 = 837702542;
         var12 = var10004;
         var10004 = (var12 | var13) - (var12 & var13);
         var10005 = (int)161496961100788097L;
         var13 = 636980005;
         var12 = var10005;
         var10005 = (var12 | var13) & (~var12 | ~var13);
         var13 = 1804080799;
         var12 = var10005;
         var13 = var12 & ~var13 | ~var12 & var13;
         var12 = var10004;
         var10004 = (var12 & ~var13) + (var13 & ~var12) + 2 * (var12 & var13);
         var10004 = (int)8958289330278509620L;
         var13 = 1950601674;
         var12 = var10004;
         var10004 = (var12 | var13) & (~var12 | ~var13);
         var13 = -628096326;
         var12 = var10004;
         var10004 = (var12 | var13) - (var12 & var13);
         var13 = 2561324;
         var12 = 860723472;
         var10005 = (var12 | var13) - (var12 & var13);
         var13 = -1719830948;
         var12 = var10005;
         var10005 = (var12 | var13) & ~(var12 & var13);
         var10006 = (int)7208043323867548429L;
         var13 = -618744429;
         var12 = var10006;
         var10006 = (var12 | var13) & ~(var12 & var13);
         var13 = 1731122287;
         var12 = var10006;
         var13 = var12 + var13 - 2 * (var12 & var13);
         var12 = var10005;
         var10005 = 2 * (var12 | var13) - (var12 ^ var13);
         var10005 = (int)6221157829881451870L;
         var13 = -36051902;
         var12 = var10005;
         var10005 = (var12 | var13) - (var12 & var13);
         var13 = 719436785;
         var12 = var10005;
         var10005 = var12 & ~var13 | ~var12 & var13;
         int var10007 = (int)3638501040370509555L;
         var13 = 2115065124;
         var12 = var10007;
         var10007 = (var12 | var13) & ~(var12 & var13);
         var13 = 1413297106;
         var12 = var10007;
         var10007 = (var12 | var13) & ~(var12 & var13);
         var10007 = (int)2833677161675457547L;
         var13 = 1140879982;
         var12 = var10007;
         var10007 = (var12 | var13) & ~(var12 & var13);
         var13 = 835581546;
         var12 = var10007;
         var10007 = (var12 | var13) - (var12 & var13);
         var10007 = (int)-7490727644974320817L;
         var13 = -1873444473;
         var12 = var10007;
         var10007 = var12 & ~var13 | ~var12 & var13;
         var13 = 1817113281;
         var12 = var10007;
         var10007 = (var12 | var13) & ~(var12 & var13);
         var10006 = (int)551250954002991376L;
         var13 = 956621300;
         var12 = var10006;
         var10006 = (var12 | var13) & ~(var12 & var13);
         var13 = 1446516161;
         var12 = var10006;
         String var3 = var10000.append(a("綥", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴}\ua7e8꒳ꁸ꤂紹蹩⑵謹㑱{\ua7e1꒘ꁴꤑ絷蹎⑻謣㑶", var10003, var10004, var10005, var12 + var13 - 2 * (var12 & var13)))
            .append(var10)
            .toString();
         var13 = 991310988;
         var12 = 564012002;
         int var192 = (var12 | var13) & ~(var12 & var13);
         var13 = -1417022502;
         var12 = var192;
         int var193 = (var12 | var13) - (var12 & var13);
         int var201 = (int)4151881292181366001L;
         var13 = 1062466257;
         var12 = var201;
         int var202 = var12 + var13 - 2 * (var12 & var13);
         var13 = -1051888731;
         var12 = var202;
         int var203 = (var12 | var13) & ~(var12 & var13);
         var10002 = (int)-1845243644668139743L;
         var13 = 1385140002;
         var12 = var10002;
         var10002 = var12 & ~var13 | ~var12 & var13;
         var13 = -1251742036;
         var12 = var10002;
         var10002 = var12 & ~var13 | ~var12 & var13;
         var13 = 163921333;
         var12 = 244235876;
         var10002 = var12 + var13 - 2 * (var12 & var13);
         var13 = -2091317107;
         var12 = var10002;
         var10002 = (var12 | var13) - (var12 & var13);
         var13 = 1311748843;
         var12 = -51943594;
         var10003 = (var12 | var13) & ~(var12 & var13);
         var13 = 690528261;
         var12 = var10003;
         var10003 = ((var12 | var13) - (var12 & var13)) * ((var12 | var13) - (var12 & var13));
         var13 = 2132906145;
         var12 = -1913726333;
         var10003 = (var12 | var13) & ~(var12 & var13);
         var13 = -1841121823;
         var12 = var10003;
         var10003 = (var12 | var13) - (var12 & var13);
         var10004 = (int)6062857263630075580L;
         var13 = 396462725;
         var12 = var10004;
         var10004 = (var12 | var13) - (var12 & var13);
         var13 = 1563043744;
         var12 = var10004;
         var10004 = var12 & ~var13 | ~var12 & var13;
         var13 = 1291115906;
         var12 = 1538033985;
         var10004 = var12 + var13 - 2 * (var12 & var13);
         var13 = 265326382;
         var12 = var10004;
         var10004 = var12 & ~var13 | ~var12 & var13;
         var10006 = (int)2878991231978035449L;
         var13 = 1483856088;
         var12 = var10006;
         var10006 = var12 & ~var13 | ~var12 & var13;
         var13 = -973995988;
         var12 = var10006;
         var10006 = (var12 | var13) & ~(var12 & var13);
         var10006 = (int)2761973184776931881L;
         var13 = 1267187396;
         var12 = var10006;
         var10006 = (var12 | var13) & ~(var12 & var13);
         var13 = 374289636;
         var12 = var10006;
         var10006 = (var12 | var13) & (~var12 | ~var13);
         var13 = -1204776154;
         var12 = 1601158605;
         var10005 = var12 + var13 - 2 * (var12 & var13);
         var13 = -414952625;
         var12 = var10005;
         MessageDigest var4 = MessageDigest.getInstance(
            a("緌謯緞譊維譒綩", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴}\ua7e8꒳ꁸ꤂紹蹩⑵謹㑱{\ua7e1꒘ꁴꤑ絷蹎⑻謣㑶", var10002, var10003, var10004, (var12 | var13) & (~var12 | ~var13))
         );
         byte[] var5 = var4.digest(var3.getBytes(StandardCharsets.UTF_8));
         StringBuilder var6 = new StringBuilder();
         int var194 = (int)-3898915366602322454L;
         var13 = 1087048292;
         var12 = var194;
         int var195 = var12 & ~var13 | ~var12 & var13;
         var13 = -460306546;
         var12 = var195;
         int var7 = (var12 | var13) & (~var12 | ~var13);

         while (true) {
            var13 = -1001354674;
            var12 = -1791732570;
            int var204 = (var12 | var13) & (~var12 | ~var13);
            var13 = 1365565176;
            var12 = var204;
            if (var7 >= Math.min((var12 | var13) - (var12 & var13), var5.length)) {
               return var6.toString();
            }

            var13 = -1743359926;
            var12 = -184816799;
            int var196 = (var12 | var13) - (var12 & var13);
            var13 = 1827511252;
            var12 = var196;
            int var197 = (var12 | var13) & ~(var12 & var13);
            int var186 = var5[var7];
            var12 = var197;
            String var8 = Integer.toHexString((~var12 | var186) - ~var12);
            int var198 = var8.length();
            var186 = -2011180643;
            var12 = -1612582882;
            int var205 = (var12 | var186) & ~(var12 & var186);
            var186 = 402530690;
            var12 = var205;
            if (var198 == (var12 & ~var186 | ~var12 & var186)) {
               var186 = 195268388;
               var12 = -975217970;
               int var206 = var12 & ~var186 | ~var12 & var186;
               var186 = -830679590;
               var12 = var206;
               var6.append((char)((var12 | var186) & (~var12 | ~var186)));
            }

            var6.append(var8);
            var7++;
         }
      } catch (NoSuchAlgorithmException var14) {
         return String.valueOf(var0 + var1);
      }
   }

   public boolean a() {
      String var1 = a(this.f, this.h);
      return var1.equals(this.g);
   }

   public void b() {
      this.k = System.currentTimeMillis();
   }

   public String c() {
      return this.e;
   }

   public int d() {
      return this.f;
   }

   public String e() {
      return this.g;
   }

   public long f() {
      return this.h;
   }

   public LocalDateTime g() {
      return LocalDateTime.ofInstant(Instant.ofEpochMilli(this.h), ZoneId.systemDefault());
   }

   public String h() {
      return this.g().format(c);
   }

   public String i() {
      return this.i;
   }

   public void b(String var1) {
      this.i = var1;
      this.b();
   }

   public String j() {
      return this.j;
   }

   public void c(String var1) {
      this.j = var1;
      this.b();
   }

   public long k() {
      return this.k;
   }

   public LocalDateTime l() {
      return LocalDateTime.ofInstant(Instant.ofEpochMilli(this.k), ZoneId.systemDefault());
   }

   public String m() {
      return this.l().format(c);
   }

   static {
      int var1 = 1350923721;
      int var0 = 688769144;
      int var10000 = (var0 | var1) & (~var0 | ~var1);
      var1 = 1485491181;
      var0 = var10000;
      var10000 = (var0 | var1) - (var0 & var1);
      int var10001 = (int)6186326685838562269L;
      var1 = 639313991;
      var0 = var10001;
      var10001 = var0 & ~var1 | ~var0 & var1;
      var1 = 1625668091;
      var0 = var10001;
      var1 = (var0 | var1) & (~var0 | ~var1);
      var0 = var10000;
      var10000 = (var0 ^ var1) + 2 * (var0 & var1);
      var1 = 1468898860;
      var0 = 122982800;
      var10001 = (var0 | var1) - (var0 & var1);
      var1 = 160708875;
      var0 = var10001;
      var10001 = var0 + var1 - 2 * (var0 & var1);
      int var10002 = (int)-1796529106827833934L;
      var1 = -857927839;
      var0 = var10002;
      var10002 = var0 + var1 - 2 * (var0 & var1);
      var1 = -526805026;
      var0 = var10002;
      var1 = var0 + var1 - 2 * (var0 & var1);
      var0 = var10001;
      var10001 = (var0 | var1) + (var0 & var1);
      String var53 = "djh";
      var1 = -567893251;
      var0 = -397199764;
      var10002 = var0 & ~var1 | ~var0 & var1;
      var1 = -1301864499;
      var0 = var10002;
      var10002 = (var0 | var1) - (var0 & var1);
      String var10003 = "dji";
      var1 = -1785557610;
      var0 = 809101349;
      int var56 = var0 & ~var1 | ~var0 & var1;
      var1 = -1241879542;
      var0 = var56;
      int var57 = var0 & ~var1 | ~var0 & var1;
      String var10004 = "djj";
      int var58 = (int)-5148411440027724905L;
      var1 = 839900252;
      var0 = var58;
      int var59 = var0 + var1 - 2 * (var0 & var1);
      var1 = -1359212447;
      var0 = var59;
      int var60 = (var0 | var1) - (var0 & var1);
      int var10005 = (int)6182953991670938966L;
      var1 = -681782851;
      var0 = var10005;
      var10005 = var0 + var1 - 2 * (var0 & var1);
      var1 = -455400868;
      var0 = var10005;
      var10005 = (var0 | var1) & ~(var0 & var1);
      int var10006 = (int)2342233234032564771L;
      var1 = 596617308;
      var0 = var10006;
      var10006 = (var0 | var1) - (var0 & var1);
      var1 = -1608741400;
      var0 = var10006;
      var1 = var0 + var1 - 2 * (var0 & var1);
      var0 = var10005;
      var10005 = var0 - ~var1 - 1;
      var10005 = (int)7533192439034313333L;
      var1 = -1146834824;
      var0 = var10005;
      var10005 = (var0 | var1) & (~var0 | ~var1);
      var1 = -490691143;
      var0 = var10005;
      c = DateTimeFormatter.ofPattern(
         a("薑慹藛慐薸愳薌慤薌慤藕慕薽愧薘慰", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴}\ua7e8꒳ꁸ꤂紹蹩⑵謹㑱{\ua7e1꒘ꁴꤑ絷蹎⑻謣㑶", var10002, var57, var60, var0 + var1 - 2 * (var0 & var1))
      );
   }

   public static String a(String var0, String var1, int var2, int var3, int var4, int var5) {
      char[] var6 = var1.toCharArray();
      char[] var7 = new char[var6.length];
      int var20 = -1083389575;
      int var19 = 221527438;
      int var10000 = (var19 | var20) - (var19 & var20);
      var20 = -1302792963;
      var19 = var10000;
      char[] var263 = new char[(var19 | var20) & ~(var19 & var20)];
      var20 = 1029549143;
      var19 = -1970680782;
      int var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = -1210818459;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = -833060368;
      var19 = 936626733;
      int var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = -108330001;
      var19 = var10003;
      var263[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      var20 = 2133489326;
      var19 = -1738708357;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = -411624236;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = -762057478;
      var19 = 1664497986;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = -1314523587;
      var19 = var10003;
      var263[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      var20 = -365158226;
      var19 = -2119955191;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1805135269;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = 540565569;
      var19 = -265870966;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = -803249587;
      var19 = var10003;
      var263[var10002] = (char)((var19 | var20) & ~(var19 & var20));
      var10002 = (int)-3748864609904186106L;
      var20 = -1791738165;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = 1922339790;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var10003 = (int)7403231567697950635L;
      var20 = -966354391;
      var19 = var10003;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = 828155997;
      var19 = var10003;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = 1723128510;
      var19 = -233426779;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = -1801293304;
      var19 = var10003;
      var263[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      var10002 = (int)-5944040761779549681L;
      var20 = -337886479;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1819035898;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      String var339 = "djk";
      var10003 = (int)-5410187155719612266L;
      var20 = 1088292989;
      var19 = var10003;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = 2116878798;
      var19 = var10003;
      var263[var10002] = (char)((var19 | var20) - (var19 & var20));
      var20 = -1583162738;
      var19 = -620520763;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = 2057388110;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = -1799967852;
      var19 = 1229530713;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = -570439601;
      var19 = var10003;
      var263[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      var20 = -61116115;
      var19 = -1250847929;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = 1227547244;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = 799470000;
      var19 = 1442740061;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = 2052624382;
      var19 = var10003;
      var263[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      var20 = -1744247889;
      var19 = 317925577;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = -1963209887;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var10003 = (int)-7616888298524683546L;
      var20 = -497628619;
      var19 = var10003;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = 852339953;
      var19 = var10003;
      var263[var10002] = (char)((var19 | var20) & ~(var19 & var20));
      var10002 = (int)-6691188372446578588L;
      var20 = 23547078;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = 1853863082;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = 259043873;
      var19 = -991695135;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = -879537005;
      var19 = var10003;
      var263[var10002] = (char)((var19 | var20) & ~(var19 & var20));
      var10002 = (int)-1729672165826450471L;
      var20 = -1101691030;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = -329438022;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = -21232503;
      var19 = -1151866793;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = 1173089274;
      var19 = var10003;
      var263[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      char[] var8 = var263;
      var20 = 1763041366;
      var19 = -1975938742;
      var10000 = (var19 | var20) & ~(var19 & var20);
      var20 = -483626730;
      var19 = var10000;
      char[] var265 = new char[(var19 | var20) - (var19 & var20)];
      var10002 = (int)4943359759350663399L;
      var20 = 1968836805;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = -531326942;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var10003 = (int)8073737615854693825L;
      var20 = 1500614514;
      var19 = var10003;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = -1815369069;
      var19 = var10003;
      var265[var10002] = (char)((var19 | var20) - (var19 & var20));
      var20 = -1258127391;
      var19 = 1317238587;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = -75429669;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var10003 = (int)8929603994260206894L;
      var20 = -1020786353;
      var19 = var10003;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = 515010865;
      var19 = var10003;
      var10003 = ((var19 | var20) - (var19 & var20)) * ((var19 | var20) - (var19 & var20));
      var10003 = (int)-343604025676884480L;
      var20 = 623643593;
      var19 = var10003;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = -1358030390;
      var19 = var10003;
      var265[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      var10002 = (int)4040897692519791333L;
      var20 = -1606929371;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = 275664578;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1112150727;
      var19 = 36261444;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = 2060081508;
      var19 = var10003;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = -785216621;
      var19 = -1514160100;
      int var10004 = (var19 | var20) - (var19 & var20);
      var20 = -2093332561;
      var19 = var10004;
      var20 = var19 & ~var20 | ~var19 & var20;
      var19 = var10003;
      var10003 = (var19 | var20) + (var19 & var20);
      var10003 = (int)-612958839754322684L;
      var20 = -1856788925;
      var19 = var10003;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = 1607543828;
      var19 = var10003;
      var265[var10002] = (char)((var19 | var20) & ~(var19 & var20));
      var10002 = (int)-2733122224692294236L;
      var20 = 1265333044;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = 1981218451;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var10003 = (int)3125518267782227146L;
      var20 = -2093124977;
      var19 = var10003;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = -1994772921;
      var19 = var10003;
      var265[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      var10002 = (int)8696640732979561973L;
      var20 = 1785224990;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = 370727663;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var10003 = (int)1510717069883960580L;
      var20 = -1636758693;
      var19 = var10003;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1560043039;
      var19 = var10003;
      var265[var10002] = (char)((var19 | var20) - (var19 & var20));
      var10002 = (int)3096037235370815596L;
      var20 = -1138010949;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = -175921966;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = 1343774445;
      var19 = -1780096981;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = -973240750;
      var19 = var10003;
      var265[var10002] = (char)((var19 | var20) & ~(var19 & var20));
      var20 = 1579060111;
      var19 = 1165729727;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = 459609142;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      String var365 = "djl";
      var20 = -1378646739;
      var19 = -411568163;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = 1252324809;
      var19 = var10003;
      var265[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      var20 = -854019857;
      var19 = 1317109456;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = -2087072200;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = -658611211;
      var19 = -1965176280;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = 1382267365;
      var19 = var10003;
      var265[var10002] = (char)((var19 | var20) - (var19 & var20));
      var20 = 479343149;
      var19 = -450381118;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = -105543449;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var10003 = (int)6551881779924098671L;
      var20 = -1538517274;
      var19 = var10003;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1302547153;
      var19 = var10003;
      var10003 = (var19 + var20 - 2 * (var19 & var20)) * (var19 + var20 - 2 * (var19 & var20));
      var10003 = (int)-5937848752471643883L;
      var20 = 1773157670;
      var19 = var10003;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1667159863;
      var19 = var10003;
      var265[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      var10002 = (int)3609808910295032322L;
      var20 = -1513507446;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = -1461364863;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = -185406466;
      var19 = -584404991;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = 702048460;
      var19 = var10003;
      var265[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      char[] var9 = var265;
      var20 = -1062922636;
      var19 = -626894801;
      var10000 = (var19 | var20) & ~(var19 & var20);
      var20 = 436686427;
      var19 = var10000;

      for (int var10 = var19 & ~var20 | ~var19 & var20; var10 < var6.length; var10++) {
         char var329 = var6[var10];
         char var239 = var8[var10 % var8.length];
         char var119 = var329;
         var7[var10] = (char)((var119 | var239) - (var119 & var239));
      }

      char[] var21 = new char[var7.length];
      var20 = -562849261;
      var19 = 1777800615;
      var10000 = var19 + var20 - 2 * (var19 & var20);
      var20 = -1216049228;
      var19 = var10000;

      for (int var11 = var19 & ~var20 | ~var19 & var20; var11 < var6.length; var11++) {
         char var330 = var7[var11];
         char var242 = var9[var11 % var9.length];
         char var122 = var330;
         var21[var11] = (char)((var122 | var242) & (~var122 | ~var242));
      }

      String var22 = new String(var21);
      int var12 = var22.hashCode();
      var20 = var5;
      var19 = var3;
      var10000 = 2 * (var19 & ~var20) - (var19 ^ var20);
      var20 = var2;
      var19 = var10000;
      int var13 = (var19 ^ var20) - 2 * (~var19 & var20);
      char[] var14 = var0.toCharArray();
      char[] var15 = new char[var14.length];
      var20 = -689055835;
      var19 = -2145278738;
      var10000 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1456239435;
      var19 = var10000;

      for (int var16 = var19 & ~var20 | ~var19 & var20; var16 < var15.length; var16++) {
         var20 = 148414045;
         var19 = -1089759099;
         int var10001 = var19 & ~var20 | ~var19 & var20;
         var20 = -1210906918;
         var19 = var10001;
         switch (var16 % ((var19 | var20) - (var19 & var20))) {
            case 0:
               var20 = var12;
               var19 = var13;
               var10002 = var19 + var20 - 2 * (var19 & var20);
               int var252 = var14[var16];
               var19 = var10002;
               var15[var16] = (char)((var19 | var252) & ~(var19 & var252));
               var252 = -301965834;
               var19 = 43240573;
               var10001 = (var19 | var252) & ~(var19 & var252);
               var252 = -325873255;
               var19 = var10001;
               var10001 = var19 & ~var252 | ~var19 & var252;
               var252 = 154107706;
               var19 = -19304238;
               var10001 = (var19 | var252) & ~(var19 & var252);
               var252 = -134869012;
               var19 = var10001;
               var10001 = (var19 | var252) & ~(var19 & var252);
               var252 = 486210459;
               var19 = -1107969239;
               var10000 = (var19 | var252) & (~var19 | ~var252);
               var252 = -1184940361;
               var19 = var10000;
               int var18 = (var19 | var252) - (var19 & var252);
               a = var18;
               var10000 = (int)2952638209240437609L;
               var252 = 1798162054;
               var19 = var10000;
               var10000 = var19 + var252 - 2 * (var19 & var252);
               var252 = -893274255;
               var19 = var10000;
               var10000 = (var19 | var252) & ~(var19 & var252);
               var10000 = (int)-4769135564334098935L;
               var252 = -931042562;
               var19 = var10000;
               var10000 = var19 & ~var252 | ~var19 & var252;
               var252 = 173459601;
               var19 = var10000;
               if (var19 + var252 - 2 * (var19 & var252) <= a) {
                  throw new RuntimeException();
               }
               break;
            case 1:
               var20 = var13;
               var19 = var5;
               var10002 = (var19 | var20) & (~var19 | ~var20);
               char var250 = var14[var16];
               var19 = var10002;
               var15[var16] = (char)((var19 | var250) & ~(var19 & var250));
         }
      }

      return new String(var15);
   }
}
