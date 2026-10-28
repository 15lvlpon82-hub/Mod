package pulse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConfigState {
   public static final int a = 1;
   private int d;
   private ConfigProfile e;
   private Map<String, ConfigState.ModuleState> f;
   private List<ConfigState.FriendHistoryState> g;
   private List<ConfigState.NotificationState> h;
   private ConfigState.MarkerOptionsState i;
   private Map<String, ConfigState.HudElementState> j;
   private String k;
   private ConfigState.NotificationSettingsState l;
   private ConfigState.ClientColorState m;
   public static int b;
   public static boolean c;

   public ConfigState() {
      int var10001 = (int)-8022001425719756491L;
      int var2 = -722785114;
      int var1 = var10001;
      var10001 = (var1 | var2) & ~(var1 & var2);
      var2 = 2090915218;
      var1 = var10001;
      this.d = (var1 | var2) & ~(var1 & var2);
      this.f = new HashMap<>();
      this.g = new ArrayList<>();
      this.h = new ArrayList<>();
      this.i = new ConfigState.MarkerOptionsState();
      this.j = new HashMap<>();
      String var56 = "a";
      int var10002 = (int)-1717380100195347891L;
      var2 = 644883673;
      var1 = var10002;
      var10002 = (var1 | var2) - (var1 & var2);
      var2 = 1619697210;
      var1 = var10002;
      var10002 = (var1 | var2) - (var1 & var2);
      int var10003 = (int)8863562081763134247L;
      var2 = 1242888974;
      var1 = var10003;
      var10003 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1008714184;
      var1 = var10003;
      var2 = var1 + var2 - 2 * (var1 & var2);
      var1 = var10002;
      var10002 = (var1 ^ var2) + 2 * (var1 & var2);
      String var61 = "b";
      var10003 = (int)-7676625261718335515L;
      var2 = 694090177;
      var1 = var10003;
      var10003 = var1 & ~var2 | ~var1 & var2;
      var2 = -2139690893;
      var1 = var10003;
      var10003 = (var1 | var2) & ~(var1 & var2);
      String var10004 = "c";
      int var65 = (int)-6771462571888967732L;
      var2 = 2027088373;
      var1 = var65;
      int var66 = var1 & ~var2 | ~var1 & var2;
      var2 = 1823203018;
      var1 = var66;
      int var67 = (var1 | var2) & (~var1 | ~var2);
      int var10005 = (int)-6242194648388004416L;
      var2 = 1251685732;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = -22488000;
      var1 = var10005;
      var10005 = (var1 | var2) - (var1 & var2);
      var2 = -1629188867;
      var1 = 1202753648;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = -1067609115;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      int var10007 = (int)-4563002168251036537L;
      var2 = 488009894;
      var1 = var10007;
      var10007 = (var1 | var2) & ~(var1 & var2);
      var2 = 823737390;
      var1 = var10007;
      var10007 = (var1 | var2) & ~(var1 & var2);
      var2 = -500276254;
      var1 = 992397221;
      var10007 = (var1 | var2) & (~var1 | ~var2);
      var2 = -653745085;
      var1 = var10007;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      var10007 = (int)-5638631388112200476L;
      var2 = -377328000;
      var1 = var10007;
      var10007 = (var1 | var2) - (var1 & var2);
      var2 = 2109092463;
      var1 = var10007;
      var10007 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1981481414;
      var1 = 1790677577;
      var10007 = (var1 | var2) & (~var1 | ~var2);
      var2 = -480285584;
      var1 = var10007;
      var10007 = (var1 | var2) - (var1 & var2);
      var2 = -2074620319;
      var1 = 560445258;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1523549909;
      var1 = var10007;
      var10007 = var1 & ~var2 | ~var1 & var2;
      int var10006 = (int)212456253005053359L;
      var2 = 1228097633;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var2 = 1803836900;
      var1 = var10006;
      this.k = a("ᱧ⨗ᱱ⨌ᱪ⨕", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴}\ua7e8꒳ꁸ꤂紹蹩⑵謹㑱{\ua7e1꒑ꁰꤑ絷", var10003, var67, var10005, (var1 | var2) & (~var1 | ~var2));
      this.l = new ConfigState.NotificationSettingsState();
      this.m = new ConfigState.ClientColorState();
   }

   public ConfigState(ConfigProfile var1) {
      int var3 = -496100020;
      int var2 = -1515077013;
      int var10001 = var2 & ~var3 | ~var2 & var3;
      var3 = 1205853990;
      var2 = var10001;
      this.d = (var2 | var3) & (~var2 | ~var3);
      this.f = new HashMap<>();
      this.g = new ArrayList<>();
      this.h = new ArrayList<>();
      this.i = new ConfigState.MarkerOptionsState();
      this.j = new HashMap<>();
      var10001 = (int)-3693679154263398986L;
      var3 = -1809626649;
      var2 = var10001;
      var10001 = var2 + var3 - 2 * (var2 & var3);
      var3 = -762189104;
      var2 = var10001;
      var10001 = ((var2 | var3) & ~(var2 & var3)) * ((var2 | var3) & ~(var2 & var3));
      String var10002 = "d";
      int var10004 = (int)7017799962476853147L;
      var3 = 2011092827;
      var2 = var10004;
      var10004 = var2 + var3 - 2 * (var2 & var3);
      var3 = 1005609163;
      var2 = var10004;
      var10004 = var2 & ~var3 | ~var2 & var3;
      var10004 = (int)-7665672031718522441L;
      var3 = 355680771;
      var2 = var10004;
      var10004 = (var2 | var3) - (var2 & var3);
      var3 = -973732954;
      var2 = var10004;
      var10004 = var2 & ~var3 | ~var2 & var3;
      var3 = 1011534754;
      var2 = 1832051376;
      var10004 = (var2 | var3) & ~(var2 & var3);
      var3 = 1366829312;
      var2 = var10004;
      var10004 = (var2 | var3) & (~var2 | ~var3);
      var3 = -1346430193;
      var2 = -1973170390;
      var10004 = (var2 | var3) - (var2 & var3);
      var3 = 635229238;
      var2 = var10004;
      var10004 = var2 + var3 - 2 * (var2 & var3);
      var3 = -1007101094;
      var2 = 241056542;
      int var10003 = var2 & ~var3 | ~var2 & var3;
      var3 = 1576271379;
      var2 = var10003;
      var10003 = (var2 | var3) & ~(var2 & var3);
      int var10005 = (int)-745154170531964069L;
      var3 = 1451960028;
      var2 = var10005;
      var10005 = (var2 | var3) - (var2 & var3);
      var3 = -1946042998;
      var2 = var10005;
      var10005 = (var2 | var3) & (~var2 | ~var3);
      var10005 = (int)-3043312591544565274L;
      var3 = -601268021;
      var2 = var10005;
      var10005 = var2 + var3 - 2 * (var2 & var3);
      var3 = -1532354263;
      var2 = var10005;
      var10005 = var2 & ~var3 | ~var2 & var3;
      var3 = -65576689;
      var2 = 1365873642;
      var10005 = (var2 | var3) & (~var2 | ~var3);
      var3 = -1384189204;
      var2 = var10005;
      var10005 = var2 & ~var3 | ~var2 & var3;
      var3 = -1606405717;
      var2 = -1644921212;
      var10004 = (var2 | var3) - (var2 & var3);
      var3 = -1050826699;
      var2 = var10004;
      var10004 = (var2 | var3) & ~(var2 & var3);
      var3 = -286388299;
      var2 = -1432931003;
      var10005 = (var2 | var3) & (~var2 | ~var3);
      var3 = 1755340582;
      var2 = var10005;
      var10005 = (var2 | var3) - (var2 & var3);
      var10005 = (int)7096597822296690195L;
      var3 = 1372030965;
      var2 = var10005;
      var10005 = var2 + var3 - 2 * (var2 & var3);
      var3 = -275688722;
      var2 = var10005;
      var10005 = (var2 | var3) & (~var2 | ~var3);
      int var10007 = (int)-8132757678338384371L;
      var3 = 317443459;
      var2 = var10007;
      var10007 = (var2 | var3) & (~var2 | ~var3);
      var3 = 10785678;
      var2 = var10007;
      var10007 = (var2 | var3) - (var2 & var3);
      var3 = 463610775;
      var2 = 1562125207;
      var10007 = (var2 | var3) - (var2 & var3);
      var3 = 1186856969;
      var2 = var10007;
      var10007 = (var2 | var3) - (var2 & var3);
      var10007 = (int)7181532205428307138L;
      var3 = 1041390122;
      var2 = var10007;
      var10007 = var2 & ~var3 | ~var2 & var3;
      var3 = -242831623;
      var2 = var10007;
      var10007 = (var2 | var3) & (~var2 | ~var3);
      var3 = -1827733229;
      var2 = 1697407688;
      int var10006 = var2 & ~var3 | ~var2 & var3;
      var3 = -166353526;
      var2 = var10006;
      this.k = a("ᱧ쑬ᱱ쑷ᱪ쑮", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴}\ua7e8꒳ꁸ꤂紹蹩⑵謹㑱{\ua7e1꒑ꁰꤑ絷", var10003, var10004, var10005, (var2 | var3) & (~var2 | ~var3));
      this.l = new ConfigState.NotificationSettingsState();
      this.m = new ConfigState.ClientColorState();
      this.e = var1;
   }

   public int a() {
      return this.d;
   }

   public void a(int var1) {
      this.d = var1;
   }

   public ConfigProfile b() {
      return this.e;
   }

   public void a(ConfigProfile var1) {
      this.e = var1;
   }

   public Map<String, ConfigState.ModuleState> c() {
      return this.f;
   }

   public void a(Map<String, ConfigState.ModuleState> var1) {
      this.f = var1;
   }

   public List<ConfigState.FriendHistoryState> d() {
      return this.g;
   }

   public void a(List<ConfigState.FriendHistoryState> var1) {
      this.g = var1;
   }

   public List<ConfigState.NotificationState> e() {
      return this.h;
   }

   public void b(List<ConfigState.NotificationState> var1) {
      this.h = var1;
   }

   public ConfigState.MarkerOptionsState f() {
      return this.i;
   }

   public void a(ConfigState.MarkerOptionsState var1) {
      this.i = var1;
   }

   public Map<String, ConfigState.HudElementState> g() {
      return this.j;
   }

   public void b(Map<String, ConfigState.HudElementState> var1) {
      this.j = var1;
   }

   public String h() {
      return this.k;
   }

   public void a(String var1) {
      this.k = var1;
   }

   public ConfigState.NotificationSettingsState i() {
      return this.l;
   }

   public void a(ConfigState.NotificationSettingsState var1) {
      this.l = var1;
   }

   public ConfigState.ClientColorState j() {
      return this.m;
   }

   public void a(ConfigState.ClientColorState var1) {
      this.m = var1;
   }

   public static String a(String var0, String var1, int var2, int var3, int var4, int var5) {
      char[] var6 = var1.toCharArray();
      char[] var7 = new char[var6.length];
      int var20 = -1097796168;
      int var19 = -2093542246;
      int var10000 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1034412328;
      var19 = var10000;
      char[] var286 = new char[(var19 | var20) & ~(var19 & var20)];
      int var10002 = (int)-4354941888467202840L;
      var20 = -1784653536;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = -1647192632;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      int var10003 = (int)4598567400404477063L;
      var20 = -731015145;
      var19 = var10003;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = 1822504098;
      var19 = var10003;
      var286[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      var10002 = (int)7323071059267158356L;
      var20 = 298538008;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = 1364940109;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var10003 = (int)3107744232077461432L;
      var20 = -1268213611;
      var19 = var10003;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = 1775746216;
      var19 = var10003;
      var286[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      var20 = 1835146353;
      var19 = 1414575914;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = 959621977;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = -962299061;
      var19 = 214431531;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = -899436570;
      var19 = var10003;
      var286[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      var10002 = (int)6467932913906925920L;
      var20 = 643495303;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = 1377842404;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = 978130214;
      var19 = -422753520;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = 93290457;
      var19 = var10003;
      var10003 = (var19 | var20) - (var19 & var20);
      var10003 = (int)-4926761884490825760L;
      var20 = 195912328;
      var19 = var10003;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = 1179682171;
      var19 = var10003;
      var286[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      var20 = 1219539711;
      var19 = 1296642803;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = 100237320;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = 1871118016;
      var19 = 1865434281;
      int var10004 = var19 & ~var20 | ~var19 & var20;
      var20 = 11975273;
      var19 = var10004;
      var10004 = (var19 | var20) & (~var19 | ~var20);
      var20 = -2049529046;
      var19 = 2097492286;
      var10004 = (var19 | var20) & ~(var19 & var20);
      var20 = -120350177;
      var19 = var10004;
      var10004 = var19 + var20 - 2 * (var19 & var20);
      var20 = 724037999;
      var19 = 348632919;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1071699741;
      var19 = var10003;
      var286[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      var20 = 1966841692;
      var19 = -1539104737;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = -780615866;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var10003 = (int)-6402562319925673513L;
      var20 = -1031433326;
      var19 = var10003;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = -972924985;
      var19 = var10003;
      var286[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      var10002 = (int)6965679674777890849L;
      var20 = 864921410;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = 432461669;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = -374583733;
      var19 = -2068669374;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1830738714;
      var19 = var10003;
      var286[var10002] = (char)((var19 | var20) - (var19 & var20));
      var20 = 1131641356;
      var19 = -1567925896;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = -503831693;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = 231723614;
      var19 = 1247802108;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1200624768;
      var19 = var10003;
      var286[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      var20 = -1486355505;
      var19 = 1401472021;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = -186595374;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var10003 = (int)-6222933071101992795L;
      var20 = 766598376;
      var19 = var10003;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = -1906428898;
      var19 = var10003;
      var286[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      var20 = 652177507;
      var19 = 1480162143;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = 2129005365;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var10003 = (int)-156578440767472608L;
      var20 = 102597908;
      var19 = var10003;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = -594772464;
      var19 = var10003;
      var286[var10002] = (char)((var19 | var20) & ~(var19 & var20));
      char[] var8 = var286;
      var10000 = (int)-6035306696042125298L;
      var20 = 1489982632;
      var19 = var10000;
      var10000 = var19 & ~var20 | ~var19 & var20;
      var20 = 386940076;
      var19 = var10000;
      char[] var289 = new char[(var19 | var20) - (var19 & var20)];
      var20 = 179973141;
      var19 = 647220541;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = 740942120;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = 824703580;
      var19 = 329047516;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = 582709152;
      var19 = var10003;
      var289[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      var20 = -1979535980;
      var19 = -334118170;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = 1712811891;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = -662780363;
      var19 = -408965418;
      var10004 = (var19 | var20) & (~var19 | ~var20);
      var20 = 1071737075;
      var19 = var10004;
      var10004 = (var19 | var20) & (~var19 | ~var20);
      var20 = 898328735;
      var19 = -1461686366;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = -1653898434;
      var19 = var10003;
      var289[var10002] = (char)((var19 | var20) - (var19 & var20));
      var20 = -1321140244;
      var19 = -1045060095;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = 1895127535;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var10003 = (int)352820146097121810L;
      var20 = -1706927173;
      var19 = var10003;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1806687695;
      var19 = var10003;
      var10003 = (var19 + var20 - 2 * (var19 & var20)) * (var19 + var20 - 2 * (var19 & var20));
      var10003 = (int)-2930438437858746743L;
      var20 = -125171772;
      var19 = var10003;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = -1412571618;
      var19 = var10003;
      var289[var10002] = (char)((var19 | var20) & ~(var19 & var20));
      var20 = -1618498592;
      var19 = 211390485;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = -1826735114;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = -53071258;
      var19 = 1943819056;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = -1895147180;
      var19 = var10003;
      var289[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      var20 = -1467449309;
      var19 = 2059190933;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = -768326990;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = -1088284471;
      var19 = 96391151;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = -1164120218;
      var19 = var10003;
      var289[var10002] = (char)((var19 | var20) - (var19 & var20));
      var10002 = (int)5594166478356911756L;
      var20 = -1278167543;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = 1863065728;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var10003 = (int)7312846432976041677L;
      var20 = 1120898405;
      var19 = var10003;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = -1404353732;
      var19 = var10003;
      var289[var10002] = (char)((var19 | var20) - (var19 & var20));
      var10002 = (int)-758578190408278284L;
      var20 = 381153038;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = -1125322244;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = -1746436841;
      var19 = -1860566709;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = -993189166;
      var19 = var10003;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = -1252971709;
      var19 = 2124824952;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = -872944382;
      var19 = var10003;
      var289[var10002] = (char)((var19 | var20) - (var19 & var20));
      var20 = 1365835780;
      var19 = -41829197;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = -1394033488;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var10003 = (int)7210853514171166866L;
      var20 = -1261155563;
      var19 = var10003;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = 1264118719;
      var19 = var10003;
      var289[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      var10002 = (int)-2601855415890309271L;
      var20 = -1189728982;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = 1811456587;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1422956825;
      var19 = -1985625689;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = 1331976025;
      var19 = var10003;
      var10003 = ((var19 | var20) & ~(var19 & var20)) * ((var19 | var20) & ~(var19 & var20));
      var10003 = (int)-5397551079065625139L;
      var20 = 699608385;
      var19 = var10003;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = 855110536;
      var19 = var10003;
      var289[var10002] = (char)((var19 | var20) - (var19 & var20));
      var20 = -1651337113;
      var19 = -1940098742;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = 298772772;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = -55857743;
      var19 = -1948164588;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = 2001387670;
      var19 = var10003;
      var289[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      char[] var9 = var289;
      var10000 = (int)2815795552139802854L;
      var20 = -879640578;
      var19 = var10000;
      var10000 = (var19 | var20) & ~(var19 & var20);
      var20 = 117131032;
      var19 = var10000;

      for (int var10 = var19 + var20 - 2 * (var19 & var20); var10 < var6.length; var10++) {
         var10000 = (int)5146239081766454799L;
         var20 = 1432734659;
         var19 = var10000;
         var10000 = (var19 | var20) - (var19 & var20);
         var20 = 450610738;
         var19 = var10000;
         var10000 = (var19 | var20) & (~var19 | ~var20);
         int var10001 = (int)-3002441327937570484L;
         var20 = -486529624;
         var19 = var10001;
         var10001 = (var19 | var20) & ~(var19 & var20);
         var20 = -1075936151;
         var19 = var10001;
         var20 = (var19 | var20) & ~(var19 & var20);
         var19 = var10000;
         var10000 = 2 * (var19 | var20) - (var19 ^ var20);
         var10000 = (int)-586548085235877500L;
         var20 = -89430235;
         var19 = var10000;
         var10000 = var19 + var20 - 2 * (var19 & var20);
         var20 = 754687645;
         var19 = var10000;
         int var18 = (var19 | var20) & (~var19 | ~var20);
         b = var18;
         var10000 = (int)-8836079565262151595L;
         var20 = 1823025945;
         var19 = var10000;
         var10000 = (var19 | var20) - (var19 & var20);
         var20 = -632955358;
         var19 = var10000;
         var10000 = (var19 | var20) & ~(var19 & var20);
         var20 = 846997162;
         var19 = 2100339248;
         var10001 = (var19 | var20) & (~var19 | ~var20);
         var20 = 1522931615;
         var19 = var10001;
         var20 = (var19 | var20) & ~(var19 & var20);
         var19 = var10000;
         var10000 = (var19 | var20) + (var19 & var20);
         var10000 = (int)-8007487746303951617L;
         var20 = -1380812538;
         var19 = var10000;
         var10000 = var19 + var20 - 2 * (var19 & var20);
         var20 = 1166347749;
         var19 = var10000;
         if ((var19 | var20) - (var19 & var20) < b) {
            var10000 = (int)-145608088721262212L;
            var20 = 352943925;
            var19 = var10000;
            var10000 = (var19 | var20) & ~(var19 & var20);
            var20 = 684173317;
            var19 = var10000;
            var10000 = (var19 | var20) - (var19 & var20);
            var20 = -274669520;
            var19 = 1078344428;
            var10000 = (var19 | var20) & (~var19 | ~var20);
            var20 = -1355652399;
            var19 = var10000;
            var18 = var19 & ~var20 | ~var19 & var20;
            b = var18;
         }

         char var361 = var6[var10];
         char var272 = var8[var10 % var8.length];
         char var141 = var361;
         var7[var10] = (char)((var141 | var272) & ~(var141 & var272));
      }

      char[] var21 = new char[var7.length];
      var20 = -1608143322;
      var19 = -64173791;
      var10000 = (var19 | var20) & ~(var19 & var20);
      var20 = 1544120071;
      var19 = var10000;

      for (int var11 = (var19 | var20) - (var19 & var20); var11 < var6.length; var11++) {
         char var362 = var7[var11];
         char var275 = var9[var11 % var9.length];
         char var144 = var362;
         var21[var11] = (char)((var144 | var275) & ~(var144 & var275));
      }

      String var22 = new String(var21);
      int var12 = var22.hashCode();
      var20 = var5;
      var19 = var3;
      var10000 = var19 - var20;
      var20 = var2;
      var19 = var10000;
      int var13 = var19 + ~var20 + 1;
      char[] var14 = var0.toCharArray();
      char[] var15 = new char[var14.length];
      var10000 = (int)-4133384390300822199L;
      var20 = -771573338;
      var19 = var10000;
      var10000 = (var19 | var20) & (~var19 | ~var20);
      var20 = 1039871215;
      var19 = var10000;

      for (int var16 = var19 + var20 - 2 * (var19 & var20); var16 < var15.length; var16++) {
         var20 = 1399605711;
         var19 = -162487928;
         int var314 = var19 & ~var20 | ~var19 & var20;
         var20 = -1522735035;
         var19 = var314;
         switch (var16 % ((var19 | var20) & ~(var19 & var20))) {
            case 0:
               var20 = var12;
               var19 = var13;
               var10002 = var19 & ~var20 | ~var19 & var20;
               char var285 = var14[var16];
               var19 = var10002;
               var15[var16] = (char)(var19 & ~var285 | ~var19 & var285);
               break;
            case 1:
               var20 = var13;
               var19 = var5;
               var10002 = var19 & ~var20 | ~var19 & var20;
               char var283 = var14[var16];
               var19 = var10002;
               var15[var16] = (char)((var19 | var283) & ~(var19 & var283));
         }
      }

      return new String(var15);
   }

   public static class ClientColorState {
      private String c;
      private float d;
      private float e;
      private float f;
      private float g;
      private float h;
      private float i;
      private float j;
      private float k;
      private float l;
      public static int a;
      public static boolean b;

      public ClientColorState() {
         int var10001 = (int)5465789888316838375L;
         int var2 = 1215074220;
         int var1 = var10001;
         var10001 = var1 + var2 - 2 * (var1 & var2);
         var2 = 426106389;
         var1 = var10001;
         var10001 = ((var1 | var2) & (~var1 | ~var2)) * ((var1 | var2) & (~var1 | ~var2));
         int var10002 = (int)-6195593769737139488L;
         var2 = 824683383;
         var1 = var10002;
         var10002 = (var1 | var2) & ~(var1 & var2);
         var2 = -1581993173;
         var1 = var10002;
         var10002 = (var1 | var2) & (~var1 | ~var2);
         int var10003 = (int)-6399612742334825657L;
         var2 = 258435654;
         var1 = var10003;
         var10003 = var1 + var2 - 2 * (var1 & var2);
         var2 = 201423374;
         var1 = var10003;
         var2 = var1 & ~var2 | ~var1 & var2;
         var1 = var10002;
         var10002 = (var1 | var2) + (var1 & var2);
         String var78 = "epu";
         var2 = 536985;
         var1 = -2001191049;
         var10003 = (var1 | var2) & (~var1 | ~var2);
         var2 = 482470747;
         var1 = var10003;
         var10003 = var1 & ~var2 | ~var1 & var2;
         var2 = 1594031450;
         var1 = 434764911;
         int var10004 = (var1 | var2) - (var1 & var2);
         var2 = -1122172816;
         var1 = var10004;
         var10004 = var1 & ~var2 | ~var1 & var2;
         var10004 = (int)2305050753665652209L;
         var2 = -530261036;
         var1 = var10004;
         var10004 = (var1 | var2) - (var1 & var2);
         var2 = 1107042099;
         var1 = var10004;
         var10004 = var1 + var2 - 2 * (var1 & var2);
         String var10005 = "epv";
         var2 = -90816894;
         var1 = 913023808;
         int var85 = (var1 | var2) & ~(var1 & var2);
         var2 = -602386304;
         var1 = var85;
         int var86 = var1 & ~var2 | ~var1 & var2;
         int var10006 = (int)-5032577637171522102L;
         var2 = -1347225386;
         var1 = var10006;
         var10006 = (var1 | var2) & ~(var1 & var2);
         var2 = 1109593571;
         var1 = var10006;
         var10006 = (var1 | var2) & (~var1 | ~var2);
         var2 = 2070321629;
         var1 = -995018297;
         var10006 = (var1 | var2) - (var1 & var2);
         var2 = -1077704459;
         var1 = var10006;
         this.c = a(
            "\ue3e6⻟\ue3f7⻟\ue3ff⻚\ue3fa⻖\ue3fe",
            "`ꟳꓺꁡꤐ絺蹙⑿譸㑴}\ua7e8꒳ꁸ꤂紹蹩⑵謹㑱{\ua7e1꒑ꁰꤑ絷踎\u2459謻㑾w\ua7e8꒡ꁒꤊ絺蹅⑨謓㑶f\ua7e7",
            var10003,
            var10004,
            var86,
            (var1 | var2) & (~var1 | ~var2)
         );
         String var61 = "epw";
         this.d = 0.75F;
         var2 = 756547229;
         var1 = 208482057;
         var10001 = (var1 | var2) & ~(var1 & var2);
         var2 = -865513650;
         var1 = var10001;
         var10001 = (var1 & ~var2 | ~var1 & var2) * (var1 & ~var2 | ~var1 & var2);
         this.e = 0.81F;
         var10001 = (int)-5432918359807298947L;
         var2 = -730874222;
         var1 = var10001;
         var10001 = (var1 | var2) - (var1 & var2);
         var2 = 1738803260;
         var1 = var10001;
         var10001 = (var1 | var2) - (var1 & var2);
         this.f = 0.89F;
         this.g = 0.0F;
         this.h = 0.0F;
         this.i = 1.0F;
         var10001 = (int)7308023738196430865L;
         var2 = -1258281104;
         var1 = var10001;
         var10001 = (var1 | var2) & ~(var1 & var2);
         var2 = -522123597;
         var1 = var10001;
         var10001 = (var1 | var2) & ~(var1 & var2);
         this.j = 0.58F;
         var2 = 1424651445;
         var1 = 675600300;
         var10001 = var1 + var2 - 2 * (var1 & var2);
         var2 = 361172416;
         var1 = var10001;
         var10001 = ((var1 | var2) & ~(var1 & var2)) * ((var1 | var2) & ~(var1 & var2));
         this.k = 0.51F;
         var2 = -1495836100;
         var1 = -1465414224;
         var10001 = var1 & ~var2 | ~var1 & var2;
         var2 = 292321842;
         var1 = var10001;
         var10001 = var1 + var2 - 2 * (var1 & var2);
         this.l = 0.96F;
      }

      public String a() {
         return this.c;
      }

      public void a(String var1) {
         this.c = var1;
      }

      public float b() {
         return this.d;
      }

      public void a(float var1) {
         this.d = var1;
      }

      public float c() {
         return this.e;
      }

      public void b(float var1) {
         this.e = var1;
      }

      public float d() {
         return this.f;
      }

      public void c(float var1) {
         this.f = var1;
      }

      public float e() {
         return this.g;
      }

      public void d(float var1) {
         this.g = var1;
      }

      public float f() {
         return this.h;
      }

      public void e(float var1) {
         this.h = var1;
      }

      public float g() {
         return this.i;
      }

      public void f(float var1) {
         this.i = var1;
      }

      public float h() {
         return this.j;
      }

      public void g(float var1) {
         this.j = var1;
      }

      public float i() {
         return this.k;
      }

      public void h(float var1) {
         this.k = var1;
      }

      public float j() {
         return this.l;
      }

      public void i(float var1) {
         this.l = var1;
      }

      public static String a(String var0, String var1, int var2, int var3, int var4, int var5) {
         char[] var6 = var1.toCharArray();
         char[] var7 = new char[var6.length];
         int var20 = -1387146712;
         int var19 = -386263864;
         int var10000 = (var19 | var20) & (~var19 | ~var20);
         var20 = 1168885482;
         var19 = var10000;
         char[] var261 = new char[var19 & ~var20 | ~var19 & var20];
         int var10002 = (int)2678476833547651941L;
         var20 = 125365183;
         var19 = var10002;
         var10002 = var19 + var20 - 2 * (var19 & var20);
         var20 = 767582426;
         var19 = var10002;
         var10002 = var19 + var20 - 2 * (var19 & var20);
         int var10003 = (int)513818858779055962L;
         var20 = -537432913;
         var19 = var10003;
         var10003 = (var19 | var20) & ~(var19 & var20);
         var20 = 1134244807;
         var19 = var10003;
         var261[var10002] = (char)((var19 | var20) & ~(var19 & var20));
         var10002 = (int)-263281575586054890L;
         var20 = 135815702;
         var19 = var10002;
         var10002 = (var19 | var20) & ~(var19 & var20);
         var20 = 1129438977;
         var19 = var10002;
         var10002 = var19 & ~var20 | ~var19 & var20;
         var20 = -1803909160;
         var19 = -51515923;
         var10003 = (var19 | var20) - (var19 & var20);
         var20 = 1754745264;
         var19 = var10003;
         var261[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
         var10002 = (int)8346548284204367902L;
         var20 = 594736731;
         var19 = var10002;
         var10002 = var19 & ~var20 | ~var19 & var20;
         var20 = 1876375111;
         var19 = var10002;
         var10002 = (var19 | var20) & ~(var19 & var20);
         var20 = 859698442;
         var19 = -1008423105;
         var10003 = var19 + var20 - 2 * (var19 & var20);
         var20 = -254182989;
         var19 = var10003;
         var261[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
         var20 = -1052127226;
         var19 = 389519850;
         var10002 = (var19 | var20) - (var19 & var20);
         var20 = -696366609;
         var19 = var10002;
         var10002 = (var19 | var20) - (var19 & var20);
         var20 = -404602366;
         var19 = -2096441052;
         int var10004 = (var19 | var20) - (var19 & var20);
         var20 = 1692965674;
         var19 = var10004;
         var10004 = (var19 | var20) & ~(var19 & var20);
         var10004 = (int)-5935306307177504987L;
         var20 = 273316671;
         var19 = var10004;
         var10004 = var19 + var20 - 2 * (var19 & var20);
         var20 = 667345951;
         var19 = var10004;
         var10004 = var19 + var20 - 2 * (var19 & var20);
         var10004 = (int)805382167018845318L;
         var20 = 433181808;
         var19 = var10004;
         var10004 = var19 & ~var20 | ~var19 & var20;
         var20 = 1279680761;
         var19 = var10004;
         var10004 = (var19 | var20) - (var19 & var20);
         var10004 = (int)5510061981099189673L;
         var20 = 557118908;
         var19 = var10004;
         var10004 = (var19 | var20) & ~(var19 & var20);
         var20 = -2131128296;
         var19 = var10004;
         var10004 = var19 & ~var20 | ~var19 & var20;
         var10004 = (int)-6031794163486194776L;
         var20 = -1726634415;
         var19 = var10004;
         var10004 = var19 & ~var20 | ~var19 & var20;
         var20 = 506734072;
         var19 = var10004;
         var10004 = var19 & ~var20 | ~var19 & var20;
         var20 = -1143822426;
         var19 = -1849098709;
         var10003 = (var19 | var20) - (var19 & var20);
         var20 = 706396574;
         var19 = var10003;
         var261[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
         var20 = 1033837704;
         var19 = -1812813898;
         var10002 = var19 + var20 - 2 * (var19 & var20);
         var20 = -1368540358;
         var19 = var10002;
         var10002 = var19 & ~var20 | ~var19 & var20;
         String var331 = "epx";
         var20 = 845799639;
         var19 = 2086400590;
         var10003 = (var19 | var20) - (var19 & var20);
         var20 = 1311933372;
         var19 = var10003;
         var261[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
         var20 = 1154249675;
         var19 = 456244922;
         var10002 = (var19 | var20) & (~var19 | ~var20);
         var20 = 1610468724;
         var19 = var10002;
         var10002 = (var19 | var20) & ~(var19 & var20);
         var10003 = (int)2679745442415576898L;
         var20 = -688499601;
         var19 = var10003;
         var10003 = var19 + var20 - 2 * (var19 & var20);
         var20 = -112126289;
         var19 = var10003;
         var261[var10002] = (char)((var19 | var20) & ~(var19 & var20));
         var10002 = (int)-3855038672202298432L;
         var20 = -1396981748;
         var19 = var10002;
         var10002 = (var19 | var20) & ~(var19 & var20);
         var20 = 256297930;
         var19 = var10002;
         var10002 = var19 & ~var20 | ~var19 & var20;
         var20 = -1713062739;
         var19 = -2067297809;
         var10003 = var19 & ~var20 | ~var19 & var20;
         var20 = 488848465;
         var19 = var10003;
         var261[var10002] = (char)((var19 | var20) & ~(var19 & var20));
         var10002 = (int)4403966380799616568L;
         var20 = 1780263680;
         var19 = var10002;
         var10002 = (var19 | var20) - (var19 & var20);
         var20 = 2018397503;
         var19 = var10002;
         var10002 = (var19 | var20) & ~(var19 & var20);
         var20 = 511998363;
         var19 = 1710076181;
         var10003 = (var19 | var20) & ~(var19 & var20);
         var20 = 2070543532;
         var19 = var10003;
         var261[var10002] = (char)((var19 | var20) & ~(var19 & var20));
         var10002 = (int)2292918344925293835L;
         var20 = -1910460205;
         var19 = var10002;
         var10002 = (var19 | var20) - (var19 & var20);
         var20 = -1776345648;
         var19 = var10002;
         var10002 = (var19 | var20) & ~(var19 & var20);
         var10003 = (int)-5726923230259980023L;
         var20 = -1601294165;
         var19 = var10003;
         var10003 = (var19 | var20) & (~var19 | ~var20);
         var20 = -2065309199;
         var19 = var10003;
         var261[var10002] = (char)((var19 | var20) - (var19 & var20));
         var10002 = (int)-4839657869987891527L;
         var20 = -245250831;
         var19 = var10002;
         var10002 = (var19 | var20) & ~(var19 & var20);
         var20 = -510430655;
         var19 = var10002;
         var10002 = var19 + var20 - 2 * (var19 & var20);
         var20 = 1304661993;
         var19 = -1678915008;
         var10003 = (var19 | var20) & (~var19 | ~var20);
         var20 = -701611379;
         var19 = var10003;
         var261[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
         char[] var8 = var261;
         var10000 = (int)-8865084930852152484L;
         var20 = 1352108937;
         var19 = var10000;
         var10000 = var19 & ~var20 | ~var19 & var20;
         var20 = -797699873;
         var19 = var10000;
         char[] var264 = new char[(var19 | var20) - (var19 & var20)];
         var10002 = (int)5176067262952508444L;
         var20 = 1422649790;
         var19 = var10002;
         var10002 = (var19 | var20) & ~(var19 & var20);
         var20 = 958129570;
         var19 = var10002;
         var10002 = (var19 | var20) - (var19 & var20);
         var10003 = (int)2576561284871578279L;
         var20 = -198719512;
         var19 = var10003;
         var10003 = var19 + var20 - 2 * (var19 & var20);
         var20 = -1427313297;
         var19 = var10003;
         var264[var10002] = (char)((var19 | var20) & ~(var19 & var20));
         var10002 = (int)-5396873016261781596L;
         var20 = -577842827;
         var19 = var10002;
         var10002 = (var19 | var20) - (var19 & var20);
         var20 = 979207888;
         var19 = var10002;
         var10002 = (var19 | var20) & (~var19 | ~var20);
         var20 = 323033112;
         var19 = -2071116255;
         var10003 = (var19 | var20) - (var19 & var20);
         var20 = 1509691832;
         var19 = var10003;
         var10003 = (var19 + var20 - 2 * (var19 & var20)) * (var19 + var20 - 2 * (var19 & var20));
         var20 = -108333783;
         var19 = 177499255;
         var10003 = (var19 | var20) & (~var19 | ~var20);
         var20 = -216130211;
         var19 = var10003;
         var264[var10002] = (char)((var19 | var20) & ~(var19 & var20));
         var20 = 1330530857;
         var19 = -1077566516;
         var10002 = var19 & ~var20 | ~var19 & var20;
         var20 = -259266073;
         var19 = var10002;
         var10002 = (var19 | var20) & (~var19 | ~var20);
         var10003 = (int)-1934619165760432600L;
         var20 = 692100791;
         var19 = var10003;
         var10003 = var19 & ~var20 | ~var19 & var20;
         var20 = -159425482;
         var19 = var10003;
         var10003 = (var19 | var20) & ~(var19 & var20);
         var10003 = (int)2002016840509179724L;
         var20 = -1103454213;
         var19 = var10003;
         var10003 = (var19 | var20) & (~var19 | ~var20);
         var20 = 719085540;
         var19 = var10003;
         var264[var10002] = (char)((var19 | var20) - (var19 & var20));
         var20 = -2030011092;
         var19 = -1381957681;
         var10002 = (var19 | var20) - (var19 & var20);
         var20 = 715162336;
         var19 = var10002;
         var10002 = (var19 | var20) & ~(var19 & var20);
         var20 = -156373942;
         var19 = 1567688227;
         var10003 = (var19 | var20) - (var19 & var20);
         var20 = -1411591573;
         var19 = var10003;
         var264[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
         var20 = -1395885490;
         var19 = 318002173;
         var10002 = var19 & ~var20 | ~var19 & var20;
         var20 = -1103615561;
         var19 = var10002;
         var10002 = var19 + var20 - 2 * (var19 & var20);
         var10003 = (int)8196487859700352436L;
         var20 = 769382305;
         var19 = var10003;
         var10003 = (var19 | var20) - (var19 & var20);
         var20 = 1055271509;
         var19 = var10003;
         var264[var10002] = (char)((var19 | var20) - (var19 & var20));
         var10002 = (int)-2572584177419546450L;
         var20 = 549754807;
         var19 = var10002;
         var10002 = var19 & ~var20 | ~var19 & var20;
         var20 = 1054508828;
         var19 = var10002;
         var10002 = (var19 | var20) & ~(var19 & var20);
         var10003 = (int)4412231718786315823L;
         var20 = 1037283569;
         var19 = var10003;
         var10003 = (var19 | var20) & (~var19 | ~var20);
         var20 = 892059210;
         var19 = var10003;
         var264[var10002] = (char)((var19 | var20) & ~(var19 & var20));
         var20 = -1719315040;
         var19 = -1456664061;
         var10002 = (var19 | var20) & (~var19 | ~var20);
         var20 = 816334757;
         var19 = var10002;
         var10002 = var19 & ~var20 | ~var19 & var20;
         var20 = 671145242;
         var19 = 1576800754;
         var10003 = (var19 | var20) & (~var19 | ~var20);
         var20 = -274948100;
         var19 = var10003;
         var10003 = (var19 & ~var20 | ~var19 & var20) * (var19 & ~var20 | ~var19 & var20);
         var10003 = (int)-8154817286119619157L;
         var20 = -1980895481;
         var19 = var10003;
         var10003 = (var19 | var20) & (~var19 | ~var20);
         var20 = -313692779;
         var19 = var10003;
         var264[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
         var10002 = (int)4876645612414418930L;
         var20 = -1055403961;
         var19 = var10002;
         var10002 = (var19 | var20) - (var19 & var20);
         var20 = 242905010;
         var19 = var10002;
         var10002 = var19 & ~var20 | ~var19 & var20;
         var10003 = (int)3553664378743004303L;
         var20 = 553666956;
         var19 = var10003;
         var10003 = var19 & ~var20 | ~var19 & var20;
         var20 = -2131770053;
         var19 = var10003;
         var264[var10002] = (char)((var19 | var20) & ~(var19 & var20));
         var20 = 1564919185;
         var19 = -2051329816;
         var10002 = (var19 | var20) & (~var19 | ~var20);
         var20 = -654445199;
         var19 = var10002;
         var10002 = var19 + var20 - 2 * (var19 & var20);
         String var361 = "epy";
         var10003 = (int)-4859349702836789489L;
         var20 = 644372509;
         var19 = var10003;
         var10003 = var19 & ~var20 | ~var19 & var20;
         var20 = -714374122;
         var19 = var10003;
         var264[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
         var20 = 941830514;
         var19 = 1506392221;
         var10002 = (var19 | var20) & ~(var19 & var20);
         var20 = 1642760678;
         var19 = var10002;
         var10002 = var19 + var20 - 2 * (var19 & var20);
         var10003 = (int)1066765846983638880L;
         var20 = -1053036018;
         var19 = var10003;
         var10003 = (var19 | var20) & (~var19 | ~var20);
         var20 = 113360477;
         var19 = var10003;
         var264[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
         char[] var9 = var264;
         var20 = 1149493939;
         var19 = -1573101056;
         var10000 = (var19 | var20) & (~var19 | ~var20);
         var20 = -423657293;
         var19 = var10000;

         for (int var10 = (var19 | var20) & ~(var19 & var20); var10 < var6.length; var10++) {
            char var323 = var6[var10];
            char var243 = var8[var10 % var8.length];
            char var124 = var323;
            var7[var10] = (char)(var124 & ~var243 | ~var124 & var243);
         }

         char[] var21 = new char[var7.length];
         var10000 = (int)895439490998273871L;
         var20 = 1937609881;
         var19 = var10000;
         var10000 = (var19 | var20) & ~(var19 & var20);
         var20 = 2041746390;
         var19 = var10000;

         for (int var11 = (var19 | var20) & ~(var19 & var20); var11 < var6.length; var11++) {
            char var324 = var7[var11];
            char var246 = var9[var11 % var9.length];
            char var127 = var324;
            var21[var11] = (char)(var127 & ~var246 | ~var127 & var246);
         }

         String var22 = new String(var21);
         int var12 = var22.hashCode();
         var20 = var5;
         var19 = var3;
         var10000 = var19 - var20;
         var20 = var2;
         var19 = var10000;
         int var13 = (var19 & ~var20) - (~var19 & var20);
         char[] var14 = var0.toCharArray();
         char[] var15 = new char[var14.length];
         var20 = -176893555;
         var19 = 1375127797;
         var10000 = var19 & ~var20 | ~var19 & var20;
         var20 = -1534977672;
         var19 = var10000;

         for (int var16 = (var19 | var20) - (var19 & var20); var16 < var15.length; var16++) {
            var20 = -329671556;
            var19 = -1147236648;
            int var10001 = (var19 | var20) & ~(var19 & var20);
            var20 = 1472664230;
            var19 = var10001;
            switch (var16 % ((var19 | var20) & (~var19 | ~var20))) {
               case 0:
                  var20 = var12;
                  var19 = var13;
                  var10002 = var19 + var20 - 2 * (var19 & var20);
                  int var256 = var14[var16];
                  var19 = var10002;
                  var15[var16] = (char)((var19 | var256) & ~(var19 & var256));
                  if (b) {
                     var256 = -1561743724;
                     var19 = 1006985691;
                     var10000 = var19 & ~var256 | ~var19 & var256;
                     var256 = -19075190;
                     var19 = var10000;
                     var10000 = (var19 | var256) - (var19 & var256);
                     var256 = -2027320363;
                     var19 = 1147574995;
                     var10000 = var19 & ~var256 | ~var19 & var256;
                     var256 = -1920020237;
                     var19 = var10000;
                     int var18 = var19 & ~var256 | ~var19 & var256;
                     a = var18;
                  }
                  break;
               case 1:
                  var20 = var13;
                  var19 = var5;
                  var10002 = var19 + var20 - 2 * (var19 & var20);
                  char var254 = var14[var16];
                  var19 = var10002;
                  var15[var16] = (char)((var19 | var254) - (var19 & var254));
            }
         }

         return new String(var15);
      }
   }

   public static class FriendHistoryState {
      private String c;
      private String d;
      public static int a;
      public static boolean b;

      public FriendHistoryState() {
      }

      public FriendHistoryState(String var1, String var2) {
         this.c = var1;
         this.d = var2;
      }

      public String a() {
         return this.c;
      }

      public void a(String var1) {
         this.c = var1;
      }

      public String b() {
         return this.d;
      }

      public void b(String var1) {
         this.d = var1;
      }

      public static String a(String var0, String var1, int var2, int var3, int var4, int var5) {
         char[] var6 = var1.toCharArray();
         char[] var7 = new char[var6.length];
         int var18 = -1622783841;
         int var17 = -1795053488;
         int var10000 = var17 + var18 - 2 * (var17 & var18);
         var18 = 172482757;
         var17 = var10000;
         char[] var259 = new char[var17 & ~var18 | ~var17 & var18];
         var18 = -2086687674;
         var17 = -1195590936;
         int var10002 = (var17 | var18) - (var17 & var18);
         var18 = 992155310;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = -1936694653;
         var17 = -43779344;
         int var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = 1911803969;
         var17 = var10003;
         var259[var10002] = (char)((var17 | var18) & ~(var17 & var18));
         var18 = 1483445704;
         var17 = 1417737303;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = 216752542;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = 1669007055;
         var17 = 1050874262;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = 1574450396;
         var17 = var10003;
         var259[var10002] = (char)((var17 | var18) - (var17 & var18));
         var10002 = (int)4299416251477786880L;
         var18 = -504056695;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = -887835253;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = 941172576;
         var17 = 1059694004;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = 120627538;
         var17 = var10003;
         var259[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         var10002 = (int)7386685644345091196L;
         var18 = 781671354;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = 608042949;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var10003 = (int)5401703795604396167L;
         var18 = -1589305356;
         var17 = var10003;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = -779823758;
         var17 = var10003;
         var10003 = (var17 + var18 - 2 * (var17 & var18)) * (var17 + var18 - 2 * (var17 & var18));
         var18 = 382416449;
         var17 = 517241580;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = 136303806;
         var17 = var10003;
         var259[var10002] = (char)((var17 | var18) - (var17 & var18));
         var10002 = (int)1074749057672857873L;
         var18 = 2044840466;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = -1532558585;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var10003 = (int)3792755886986165750L;
         var18 = 952343206;
         var17 = var10003;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = 196904077;
         var17 = var10003;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = 1731650148;
         var17 = -425744462;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = -2119576333;
         var17 = var10003;
         var259[var10002] = (char)((var17 | var18) & ~(var17 & var18));
         var10002 = (int)4165939887885175667L;
         var18 = 1593269085;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = -604925909;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var10003 = (int)807584639418899109L;
         var18 = -1523308925;
         var17 = var10003;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = -1013679708;
         var17 = var10003;
         var259[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         var18 = 1732483279;
         var17 = -1400741591;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = -876480032;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = -887204723;
         var17 = -18316070;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = 905369924;
         var17 = var10003;
         var259[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var10002 = (int)9182062447305314491L;
         var18 = 1867556296;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = -1035537036;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = -1450883742;
         var17 = 475801790;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = -1244046850;
         var17 = var10003;
         var259[var10002] = (char)((var17 | var18) - (var17 & var18));
         var18 = 1569867908;
         var17 = -996449680;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = -1727452420;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var10003 = (int)-798694129243067092L;
         var18 = 1925305121;
         var17 = var10003;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = -1131989410;
         var17 = var10003;
         var259[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var10002 = (int)176342653646203741L;
         var18 = 1443551265;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = -614583435;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var10003 = (int)-2375484144256083778L;
         var18 = -414277887;
         var17 = var10003;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = 1397063835;
         var17 = var10003;
         var259[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         char[] var8 = var259;
         var10000 = (int)5496579145573273151L;
         var18 = 5657230;
         var17 = var10000;
         var10000 = var17 + var18 - 2 * (var17 & var18);
         var18 = 1541495995;
         var17 = var10000;
         char[] var262 = new char[(var17 | var18) - (var17 & var18)];
         var18 = 157758099;
         var17 = -222168749;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = -72954944;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = 969008306;
         var17 = 295867916;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = 677591710;
         var17 = var10003;
         var262[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var10002 = (int)-3044667980995609399L;
         var18 = 1192915362;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = 47861098;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = 508528495;
         var17 = 800070720;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = -1991208478;
         var17 = var10003;
         var10003 = (var17 + var18 - 2 * (var17 & var18)) * (var17 + var18 - 2 * (var17 & var18));
         var10003 = (int)-439574530991702887L;
         var18 = 2142311081;
         var17 = var10003;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = 2086644275;
         var17 = var10003;
         var262[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         var10002 = (int)-1315824125847815764L;
         var18 = -1775511254;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = 1104699524;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var10003 = (int)-7660410101240929133L;
         var18 = 1163814862;
         var17 = var10003;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = 254164623;
         var17 = var10003;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = 2074963528;
         var17 = 1224430912;
         int var10004 = (var17 | var18) & (~var17 | ~var18);
         var18 = -258762392;
         var17 = var10004;
         var18 = var17 & ~var18 | ~var17 & var18;
         var17 = var10003;
         var10003 = (var17 ^ var18) + 2 * (var17 & var18);
         var18 = 1972976548;
         var17 = -403593121;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = -1838672728;
         var17 = var10003;
         var262[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var10002 = (int)-2902370171060879459L;
         var18 = -525404;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = 214828090;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var10003 = (int)1230579907175947034L;
         var18 = -876250393;
         var17 = var10003;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = 288479743;
         var17 = var10003;
         var262[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         var10002 = (int)1960308265849200753L;
         var18 = -843002822;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = -2114655153;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var10003 = (int)868762384099634595L;
         var18 = 112238283;
         var17 = var10003;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = 348801832;
         var17 = var10003;
         var262[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var10002 = (int)-6519364356990650909L;
         var18 = 1969059649;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = -110640473;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = 1179763859;
         var17 = 207336808;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = 1242188143;
         var17 = var10003;
         var262[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var10002 = (int)-7243513503710851707L;
         var18 = 640162040;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = -1145449093;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = 653952422;
         var17 = 2119648198;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = 118120185;
         var17 = var10003;
         var10003 = (var17 | var18) - (var17 & var18);
         var10004 = (int)-4248913256917689456L;
         var18 = -1711965806;
         var17 = var10004;
         var10004 = var17 + var18 - 2 * (var17 & var18);
         var18 = 710815555;
         var17 = var10004;
         var18 = (var17 | var18) - (var17 & var18);
         var17 = var10003;
         var10003 = (var17 & ~var18) + (var18 & ~var17) + 2 * (var17 & var18);
         var18 = -1458129632;
         var17 = 1659593940;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = -872589619;
         var17 = var10003;
         var262[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var10002 = (int)-4489101304483146588L;
         var18 = 1762236192;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = -1333558397;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = -1171092247;
         var17 = 1786470032;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = -800472511;
         var17 = var10003;
         var262[var10002] = (char)((var17 | var18) & ~(var17 & var18));
         var10002 = (int)537049930570514367L;
         var18 = -1683574098;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = -1712648935;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         String var368 = "brv";
         var10003 = (int)-3788251645510745498L;
         var18 = -1378920615;
         var17 = var10003;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = -1606101445;
         var17 = var10003;
         var262[var10002] = (char)((var17 | var18) & ~(var17 & var18));
         var18 = 1043378621;
         var17 = -593488799;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = -493836843;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = -1203502764;
         var17 = 443096017;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = -1574098506;
         var17 = var10003;
         var262[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         char[] var9 = var262;
         var18 = 652131493;
         var17 = -1711823836;
         var10000 = (var17 | var18) & ~(var17 & var18);
         var18 = -1087825791;
         var17 = var10000;

         for (int var10 = (var17 | var18) & ~(var17 & var18); var10 < var6.length; var10++) {
            char var326 = var6[var10];
            char var241 = var8[var10 % var8.length];
            char var122 = var326;
            var7[var10] = (char)(var122 & ~var241 | ~var122 & var241);
         }

         char[] var19 = new char[var7.length];
         var18 = -2140315776;
         var17 = -1610440209;
         var10000 = (var17 | var18) & (~var17 | ~var18);
         var18 = 544210543;
         var17 = var10000;

         for (int var11 = (var17 | var18) & (~var17 | ~var18); var11 < var6.length; var11++) {
            char var327 = var7[var11];
            char var244 = var9[var11 % var9.length];
            char var125 = var327;
            var19[var11] = (char)((var125 | var244) - (var125 & var244));
         }

         String var20 = new String(var19);
         int var12 = var20.hashCode();
         var18 = var5;
         var17 = var3;
         var10000 = var17 + ~var18 + 1;
         var18 = var2;
         var17 = var10000;
         int var13 = var17 - var18;
         char[] var14 = var0.toCharArray();
         char[] var15 = new char[var14.length];
         var18 = -1105711483;
         var17 = 1505397596;
         var10000 = var17 & ~var18 | ~var17 & var18;
         var18 = -408771111;
         var17 = var10000;

         for (int var16 = (var17 | var18) - (var17 & var18); var16 < var15.length; var16++) {
            var18 = 1053104480;
            var17 = -1856314125;
            int var10001 = var17 & ~var18 | ~var17 & var18;
            var18 = -1348469359;
            var17 = var10001;
            switch (var16 % ((var17 | var18) & (~var17 | ~var18))) {
               case 0:
                  var18 = var12;
                  var17 = var13;
                  var10002 = (var17 | var18) & (~var17 | ~var18);
                  int var254 = var14[var16];
                  var17 = var10002;
                  var15[var16] = (char)((var17 | var254) & (~var17 | ~var254));
                  if (b) {
                     var10000 = (int)7438037158794725817L;
                     var254 = 355076717;
                     var17 = var10000;
                     var10000 = (var17 | var254) & (~var17 | ~var254);
                     var254 = 557286356;
                     var17 = var10000;
                     var10000 = (var17 | var254) - (var17 & var254);
                     var10001 = (int)7689720868280518450L;
                     var254 = -2139621539;
                     var17 = var10001;
                     var10001 = (var17 | var254) & ~(var17 & var254);
                     var254 = -944557969;
                     var17 = var10001;
                     var10000 /= (var17 | var254) - (var17 & var254);
                  }
                  break;
               case 1:
                  var18 = var13;
                  var17 = var5;
                  var10002 = (var17 | var18) & ~(var17 & var18);
                  char var252 = var14[var16];
                  var17 = var10002;
                  var15[var16] = (char)((var17 | var252) & ~(var17 & var252));
            }
         }

         return new String(var15);
      }
   }

   public static class HudElementState {
      private float c;
      private float d;
      private float e = 1.0F;
      public static int a;
      public static boolean b;

      public HudElementState() {
      }

      public HudElementState(float var1, float var2, float var3) {
         this.c = var1;
         this.d = var2;
         this.e = var3;
      }

      public float a() {
         return this.c;
      }

      public void a(float var1) {
         this.c = var1;
      }

      public float b() {
         return this.d;
      }

      public void b(float var1) {
         this.d = var1;
      }

      public float c() {
         return this.e;
      }

      public void c(float var1) {
         this.e = var1;
      }

      public static String a(String var0, String var1, int var2, int var3, int var4, int var5) {
         char[] var6 = var1.toCharArray();
         char[] var7 = new char[var6.length];
         int var10000 = (int)4396256071715055982L;
         int var18 = 1180198989;
         int var17 = var10000;
         var10000 = (var17 | var18) & (~var17 | ~var18);
         var18 = -1637711575;
         var17 = var10000;
         char[] var260 = new char[var17 + var18 - 2 * (var17 & var18)];
         var18 = -1733588402;
         var17 = 2077273515;
         int var10002 = (var17 | var18) - (var17 & var18);
         var18 = -478468123;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = 8686577;
         var17 = 601019711;
         int var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = 592844540;
         var17 = var10003;
         var260[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         var10002 = (int)2814015993393171614L;
         var18 = -643947977;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = 669642408;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = -1147090717;
         var17 = 1998084426;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = -860310996;
         var17 = var10003;
         var260[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         var18 = -658314376;
         var17 = 756611078;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = -170257540;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var10003 = (int)-5208540637242930272L;
         var18 = 50544344;
         var17 = var10003;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = -302917890;
         var17 = var10003;
         var260[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var18 = 1423671061;
         var17 = -1571781351;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = -158598641;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var10003 = (int)-1402042219778694065L;
         var18 = -1355336527;
         var17 = var10003;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = 600408429;
         var17 = var10003;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = 2039161245;
         var17 = 1379670158;
         int var10004 = var17 + var18 - 2 * (var17 & var18);
         var18 = 1258597654;
         var17 = var10004;
         var18 = var17 + var18 - 2 * (var17 & var18);
         var17 = var10003;
         var10003 = 2 * (var17 | var18) - (var17 ^ var18);
         var18 = -1358449444;
         var17 = 1068228163;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = -1867713908;
         var17 = var10003;
         var260[var10002] = (char)((var17 | var18) - (var17 & var18));
         var18 = -1503596003;
         var17 = -2807542;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = 1505090323;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = -1442496783;
         var17 = 1164846470;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = 215480085;
         var17 = var10003;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = -771334882;
         var17 = -2030284452;
         var10004 = (var17 | var18) & (~var17 | ~var18);
         var18 = 847892399;
         var17 = var10004;
         var18 = (var17 | var18) - (var17 & var18);
         var17 = var10003;
         var10003 = (var17 | var18) + (var17 & var18);
         var10003 = (int)-422180771656753747L;
         var18 = -884989867;
         var17 = var10003;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = -114905891;
         var17 = var10003;
         var260[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var18 = 1192357897;
         var17 = 785609324;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = 1774355040;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = -1084811587;
         var17 = -509974013;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = 1590507836;
         var17 = var10003;
         var260[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var10002 = (int)-7341296127932406399L;
         var18 = 38363135;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = 1172978296;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var10003 = (int)-7111494915072395917L;
         var18 = -727998172;
         var17 = var10003;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = 1099390276;
         var17 = var10003;
         var260[var10002] = (char)((var17 | var18) - (var17 & var18));
         var18 = 1261820887;
         var17 = -1638856557;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = -714812605;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = 623414321;
         var17 = 1454611711;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = 1939547372;
         var17 = var10003;
         var260[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var10002 = (int)-2916217784143007551L;
         var18 = 124795799;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = 1326091102;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = 1896401551;
         var17 = 1347759102;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = 559802658;
         var17 = var10003;
         var260[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         var18 = 2126334057;
         var17 = 609941359;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = 1525137167;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var10003 = (int)6687577527887169099L;
         var18 = 1760040785;
         var17 = var10003;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = 628201022;
         var17 = var10003;
         var260[var10002] = (char)((var17 | var18) & ~(var17 & var18));
         char[] var8 = var260;
         var18 = 325454930;
         var17 = 1925312361;
         var10000 = (var17 | var18) & (~var17 | ~var18);
         var18 = 1638392625;
         var17 = var10000;
         char[] var262 = new char[var17 + var18 - 2 * (var17 & var18)];
         var10002 = (int)-4460678315416357150L;
         var18 = 1139255756;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = -206151890;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = 1833683813;
         var17 = -1863742255;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = -39710828;
         var17 = var10003;
         var262[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var10002 = (int)-3517303922987341764L;
         var18 = -486267296;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = 1279544925;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = -23263383;
         var17 = -1187094491;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = 1528125821;
         var17 = var10003;
         var10003 = (var17 | var18) - (var17 & var18);
         var10003 = (int)8344973027683382073L;
         var18 = -1934096665;
         var17 = var10003;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = -1007668771;
         var17 = var10003;
         var262[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var18 = 449854408;
         var17 = 960911137;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = 597060843;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var10004 = (int)-459137885047069946L;
         var18 = -364768804;
         var17 = var10004;
         var10004 = var17 & ~var18 | ~var17 & var18;
         var18 = 1486516954;
         var17 = var10004;
         var10004 = (var17 | var18) & ~(var17 & var18);
         var18 = -833067882;
         var17 = 370971125;
         var10004 = var17 & ~var18 | ~var17 & var18;
         var18 = -666569364;
         var17 = var10004;
         var10004 = var17 & ~var18 | ~var17 & var18;
         var18 = -1748277868;
         var17 = 459396428;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = -1935001717;
         var17 = var10003;
         var262[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var18 = -2121951294;
         var17 = -89620072;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = 2066552409;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var10003 = (int)-800302371582704867L;
         var18 = 1636114776;
         var17 = var10003;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = -714335673;
         var17 = var10003;
         var262[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var18 = -1054872543;
         var17 = -1347543007;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = 1857145860;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = -1412191696;
         var17 = -1956572622;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = 548569154;
         var17 = var10003;
         var262[var10002] = (char)((var17 | var18) - (var17 & var18));
         var18 = 2142895809;
         var17 = 207180800;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = 1944103620;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = -1190745296;
         var17 = 1953725170;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = -847910570;
         var17 = var10003;
         var262[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var10002 = (int)-1016763926784735528L;
         var18 = 1265540468;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = 821959594;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = -2032578322;
         var17 = -940982599;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = -1263940659;
         var17 = var10003;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var10003 = (int)-47491266319063451L;
         var18 = -896491969;
         var17 = var10003;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = 797867875;
         var17 = var10003;
         var262[var10002] = (char)((var17 | var18) & ~(var17 & var18));
         var18 = -427048859;
         var17 = 407693714;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = -20502032;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = 1770208432;
         var17 = -2064375660;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = -310965220;
         var17 = var10003;
         var262[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var10002 = (int)454552696658134225L;
         var18 = -2087143217;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = 1939454998;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var10003 = (int)-6283911898689829184L;
         var18 = -1811130745;
         var17 = var10003;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = 60493717;
         var17 = var10003;
         var10003 = ((var17 | var18) & ~(var17 & var18)) * ((var17 | var18) & ~(var17 & var18));
         var18 = -29998451;
         var17 = 449024442;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = -453685197;
         var17 = var10003;
         var262[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var18 = -203798647;
         var17 = 1529483474;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = -1460644014;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = 2012940055;
         var17 = 1819618156;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = 462298952;
         var17 = var10003;
         var262[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         char[] var9 = var262;
         var18 = 678080777;
         var17 = 1379298414;
         var10000 = (var17 | var18) - (var17 & var18);
         var18 = 2052906343;
         var17 = var10000;

         for (int var10 = (var17 | var18) - (var17 & var18); var10 < var6.length; var10++) {
            char var316 = var6[var10];
            char var245 = var8[var10 % var8.length];
            char var126 = var316;
            var7[var10] = (char)((var126 | var245) & ~(var126 & var245));
         }

         char[] var19 = new char[var7.length];
         var10000 = (int)4911333971476883681L;
         var18 = 1445879626;
         var17 = var10000;
         var10000 = (var17 | var18) & (~var17 | ~var18);
         var18 = -1860274261;
         var17 = var10000;

         for (int var11 = var17 + var18 - 2 * (var17 & var18); var11 < var6.length; var11++) {
            char var317 = var7[var11];
            char var248 = var9[var11 % var9.length];
            char var129 = var317;
            var19[var11] = (char)((var129 | var248) & ~(var129 & var248));
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
         var10000 = (int)6096701908187457738L;
         var18 = 549077021;
         var17 = var10000;
         var10000 = var17 + var18 - 2 * (var17 & var18);
         var18 = 1380968663;
         var17 = var10000;

         for (int var16 = (var17 | var18) - (var17 & var18); var16 < var15.length; var16++) {
            int var10001 = (int)-3846206428904545668L;
            var18 = -1688093143;
            var17 = var10001;
            var10001 = (var17 | var18) - (var17 & var18);
            var18 = 322149463;
            var17 = var10001;
            switch (var16 % (var17 & ~var18 | ~var17 & var18)) {
               case 0:
                  var18 = var12;
                  var17 = var13;
                  var10002 = var17 & ~var18 | ~var17 & var18;
                  char var258 = var14[var16];
                  var17 = var10002;
                  var15[var16] = (char)((var17 | var258) - (var17 & var258));
                  break;
               case 1:
                  var18 = var13;
                  var17 = var5;
                  var10002 = (var17 | var18) & ~(var17 & var18);
                  char var256 = var14[var16];
                  var17 = var10002;
                  var15[var16] = (char)(var17 & ~var256 | ~var17 & var256);
            }
         }

         return new String(var15);
      }
   }

   public static class NotificationState {
      private String c;
      private int d;
      private int e;
      private int f;
      private int g;
      private String h;
      private boolean i;
      private long j;
      private int k;
      private long l;
      public static int a;
      public static boolean b;

      public String a() {
         return this.c;
      }

      public void a(String var1) {
         this.c = var1;
      }

      public int b() {
         return this.d;
      }

      public void a(int var1) {
         this.d = var1;
      }

      public int c() {
         return this.e;
      }

      public void b(int var1) {
         this.e = var1;
      }

      public int d() {
         return this.f;
      }

      public void c(int var1) {
         this.f = var1;
      }

      public int e() {
         return this.g;
      }

      public void d(int var1) {
         this.g = var1;
      }

      public String f() {
         return this.h;
      }

      public void b(String var1) {
         this.h = var1;
      }

      public boolean g() {
         return this.i;
      }

      public void a(boolean var1) {
         this.i = var1;
      }

      public long h() {
         return this.j;
      }

      public void a(long var1) {
         this.j = var1;
      }

      public int i() {
         return this.k;
      }

      public void e(int var1) {
         this.k = var1;
      }

      public long j() {
         return this.l;
      }

      public void b(long var1) {
         this.l = var1;
      }

      public static String a(String var0, String var1, int var2, int var3, int var4, int var5) {
         char[] var6 = var1.toCharArray();
         char[] var7 = new char[var6.length];
         int var10000 = (int)-2660647233190816297L;
         int var18 = 644425751;
         int var17 = var10000;
         var10000 = (var17 | var18) - (var17 & var18);
         var18 = 257965514;
         var17 = var10000;
         char[] var236 = new char[(var17 | var18) & ~(var17 & var18)];
         int var10002 = (int)4448460070864161861L;
         var18 = 1381353258;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = -1022637201;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         int var10003 = (int)4126654712620106704L;
         var18 = 1584903869;
         var17 = var10003;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = -1105314465;
         var17 = var10003;
         var236[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var18 = 235595382;
         var17 = -362761798;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = -462792755;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var10003 = (int)5669102367821632129L;
         var18 = -1198990971;
         var17 = var10003;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = -2049087359;
         var17 = var10003;
         var236[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var10002 = (int)-4626815696264076288L;
         var18 = -1986470302;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = -681395616;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = 1730524747;
         var17 = 1437187836;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = 848046897;
         var17 = var10003;
         var236[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var18 = 370181069;
         var17 = 1658679457;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = 1959654255;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         String var309 = "cxm";
         var10003 = (int)5340498397262123705L;
         var18 = 591349111;
         var17 = var10003;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = 1734725597;
         var17 = var10003;
         var236[var10002] = (char)((var17 | var18) - (var17 & var18));
         var10002 = (int)-404393671999234478L;
         var18 = 883038711;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = 1001637793;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         String var312 = "cxn";
         var18 = -1426969241;
         var17 = 175045322;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = -1600371064;
         var17 = var10003;
         var236[var10002] = (char)((var17 | var18) & ~(var17 & var18));
         var10002 = (int)-3111394330431997959L;
         var18 = 1711421465;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = 74289125;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = -2018994117;
         var17 = 1493970563;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = -559615174;
         var17 = var10003;
         var236[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var18 = -747953028;
         var17 = -1732781495;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = 1272774195;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = 64614367;
         var17 = -2001296927;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = -1955641555;
         var17 = var10003;
         var236[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         var10002 = (int)2974652767097053830L;
         var18 = -866168844;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = -1532187275;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var10003 = (int)9071772512576127589L;
         var18 = 674244788;
         var17 = var10003;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = 124837619;
         var17 = var10003;
         var236[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var10002 = (int)6247879487948545023L;
         var18 = 354271547;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = -1283286324;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var10003 = (int)-4043555862605898563L;
         var18 = -538458115;
         var17 = var10003;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = 67801875;
         var17 = var10003;
         var236[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var10002 = (int)3167855783605985609L;
         var18 = 1901869786;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = 1759271834;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var10003 = (int)-2237800270882442839L;
         var18 = 414082762;
         var17 = var10003;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = -1754722233;
         var17 = var10003;
         var236[var10002] = (char)((var17 | var18) & ~(var17 & var18));
         char[] var8 = var236;
         var18 = 1306285844;
         var17 = 1018961266;
         var10000 = (var17 | var18) - (var17 & var18);
         var18 = 1902135916;
         var17 = var10000;
         char[] var238 = new char[var17 & ~var18 | ~var17 & var18];
         var10002 = (int)3147228819486971557L;
         var18 = 1354501194;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = -1797743889;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var10003 = (int)6309189238573200003L;
         var18 = 1067532816;
         var17 = var10003;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = 1719564467;
         var17 = var10003;
         var238[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         var10002 = (int)-7339782157623301576L;
         var18 = -1614128549;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = 1775677538;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         String var324 = "cxo";
         var10003 = (int)-6482090801171829947L;
         var18 = -1442536169;
         var17 = var10003;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = 542591569;
         var17 = var10003;
         var238[var10002] = (char)((var17 | var18) & ~(var17 & var18));
         var18 = -1843129211;
         var17 = 1389732310;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = -1057901231;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var10003 = (int)-8729675693877516016L;
         var18 = 1726653006;
         var17 = var10003;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = 1814870132;
         var17 = var10003;
         var10003 = (var17 & ~var18 | ~var17 & var18) * (var17 & ~var18 | ~var17 & var18);
         var10003 = (int)-9124088571604869587L;
         var18 = -2109054449;
         var17 = var10003;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = -1677673615;
         var17 = var10003;
         var238[var10002] = (char)((var17 | var18) & ~(var17 & var18));
         var10002 = (int)2332262049479729720L;
         var18 = -1340067312;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = -1770188757;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = -942657169;
         var17 = -2116465;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = 940555746;
         var17 = var10003;
         var238[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var18 = -915540169;
         var17 = 593897510;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = -368320747;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var10003 = (int)-1606045765857541984L;
         var18 = 81696931;
         var17 = var10003;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = -1647042493;
         var17 = var10003;
         var238[var10002] = (char)((var17 | var18) & ~(var17 & var18));
         var18 = 2056427362;
         var17 = 414379921;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = 1646295286;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = -950649113;
         var17 = -1129260602;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = 2078728117;
         var17 = var10003;
         var238[var10002] = (char)((var17 | var18) - (var17 & var18));
         var18 = 1329159290;
         var17 = -1031082683;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = -1917603527;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         String var336 = "cxp";
         var18 = -471136127;
         var17 = 1551491284;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = -1080922260;
         var17 = var10003;
         var238[var10002] = (char)((var17 | var18) - (var17 & var18));
         var10002 = (int)-2500151031889863353L;
         var18 = 748656351;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = 805260191;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var10003 = (int)-3370880448605809030L;
         var18 = -75343842;
         var17 = var10003;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = -2096570788;
         var17 = var10003;
         var238[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         var10002 = (int)2187088057492930131L;
         var18 = -960678198;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = -505395055;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = 226286422;
         var17 = -1557500447;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = -301071470;
         var17 = var10003;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = -1711289633;
         var17 = 1807870434;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = -230776775;
         var17 = var10003;
         var238[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var18 = -1279025228;
         var17 = 720781728;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = -1724522979;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = -1046684007;
         var17 = 86083456;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = -994219478;
         var17 = var10003;
         var238[var10002] = (char)((var17 | var18) & ~(var17 & var18));
         char[] var9 = var238;
         var10000 = (int)8669976041802436286L;
         var18 = -834551185;
         var17 = var10000;
         var10000 = (var17 | var18) & (~var17 | ~var18);
         var18 = -2004235055;
         var17 = var10000;

         for (int var10 = (var17 | var18) & (~var17 | ~var18); var10 < var6.length; var10++) {
            char var301 = var6[var10];
            char var217 = var8[var10 % var8.length];
            char var110 = var301;
            var7[var10] = (char)((var110 | var217) - (var110 & var217));
         }

         char[] var19 = new char[var7.length];
         var10000 = (int)2621652373214497991L;
         var18 = -1693238022;
         var17 = var10000;
         var10000 = (var17 | var18) & (~var17 | ~var18);
         var18 = -451825603;
         var17 = var10000;
         int var11 = (var17 | var18) & (~var17 | ~var18);
         if (b) {
            var18 = -1184615898;
            var17 = -2061009121;
            var10000 = var17 & ~var18 | ~var17 & var18;
            var18 = 1011043641;
            var17 = var10000;
            var10000 = (var17 | var18) & ~(var17 & var18);
            var18 = -1322892229;
            var17 = -399445874;
            int var10001 = (var17 | var18) & ~(var17 & var18);
            var18 = 1494660277;
            var17 = var10001;
            var10000 /= (var17 | var18) & (~var17 | ~var18);
         }

         while (var11 < var6.length) {
            char var302 = var7[var11];
            char var224 = var9[var11 % var9.length];
            char var117 = var302;
            var19[var11] = (char)(var117 & ~var224 | ~var117 & var224);
            var11++;
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
         var10000 = (int)-6794929116606939836L;
         var18 = -14352805;
         var17 = var10000;
         var10000 = (var17 | var18) & (~var17 | ~var18);
         var18 = -846478561;
         var17 = var10000;

         for (int var16 = (var17 | var18) - (var17 & var18); var16 < var15.length; var16++) {
            var18 = -655262114;
            var17 = -272750319;
            int var249 = var17 & ~var18 | ~var17 & var18;
            var18 = 927946573;
            var17 = var249;
            switch (var16 % (var17 & ~var18 | ~var17 & var18)) {
               case 0:
                  var18 = var12;
                  var17 = var13;
                  var10002 = var17 + var18 - 2 * (var17 & var18);
                  char var234 = var14[var16];
                  var17 = var10002;
                  var15[var16] = (char)(var17 & ~var234 | ~var17 & var234);
                  break;
               case 1:
                  var18 = var13;
                  var17 = var5;
                  var10002 = var17 & ~var18 | ~var17 & var18;
                  char var232 = var14[var16];
                  var17 = var10002;
                  var15[var16] = (char)((var17 | var232) & ~(var17 & var232));
            }
         }

         return new String(var15);
      }
   }

   public static class MarkerOptionsState {
      private boolean c;
      private int d;
      private boolean e;
      private boolean f;
      private boolean g;
      public static int a;
      public static boolean b;

      public MarkerOptionsState() {
         int var10001 = (int)-7683473753977799863L;
         int var2 = -898938584;
         int var1 = var10001;
         var10001 = var1 + var2 - 2 * (var1 & var2);
         var2 = -1753812384;
         var1 = var10001;
         this.c = pulse.Bool.from((var1 | var2) - (var1 & var2));
         var10001 = (int)-1372744576744283063L;
         var2 = 1998630624;
         var1 = var10001;
         var10001 = var1 + var2 - 2 * (var1 & var2);
         var2 = -386889047;
         var1 = var10001;
         this.d = var1 & ~var2 | ~var1 & var2;
         var10001 = (int)-83678778926143110L;
         var2 = 355261167;
         var1 = var10001;
         var10001 = var1 & ~var2 | ~var1 & var2;
         var2 = 535999381;
         var1 = var10001;
         this.e = pulse.Bool.from((var1 | var2) & ~(var1 & var2));
         var10001 = (int)-430629271715462604L;
         var2 = -914289480;
         var1 = var10001;
         var10001 = (var1 | var2) & (~var1 | ~var2);
         var2 = -1274884467;
         var1 = var10001;
         this.f = pulse.Bool.from((var1 | var2) & ~(var1 & var2));
         var10001 = (int)-5530059917813958232L;
         var2 = -1851395435;
         var1 = var10001;
         var10001 = (var1 | var2) & ~(var1 & var2);
         var2 = 1974946621;
         var1 = var10001;
         this.g = pulse.Bool.from((var1 | var2) - (var1 & var2));
      }

      public boolean a() {
         return this.c;
      }

      public void a(boolean var1) {
         this.c = var1;
      }

      public int b() {
         return this.d;
      }

      public void a(int var1) {
         this.d = var1;
      }

      public boolean c() {
         return this.e;
      }

      public void b(boolean var1) {
         this.e = var1;
      }

      public boolean d() {
         return this.f;
      }

      public void c(boolean var1) {
         this.f = var1;
      }

      public boolean e() {
         return this.g;
      }

      public void d(boolean var1) {
         this.g = var1;
      }

      public static String a(String var0, String var1, int var2, int var3, int var4, int var5) {
         char[] var6 = var1.toCharArray();
         char[] var7 = new char[var6.length];
         int var18 = 646699363;
         int var17 = -632303468;
         int var10000 = (var17 | var18) & (~var17 | ~var18);
         var18 = -54261251;
         var17 = var10000;
         char[] var261 = new char[(var17 | var18) - (var17 & var18)];
         int var10002 = (int)829584864843540302L;
         var18 = 177713842;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = 110990844;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = 2079711987;
         var17 = 745078401;
         int var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = 1469928512;
         var17 = var10003;
         var261[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var18 = -1954980061;
         var17 = 340039792;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = -1623341230;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var10003 = (int)-4103091008888547704L;
         var18 = 215345502;
         var17 = var10003;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = 1657576531;
         var17 = var10003;
         var261[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var10002 = (int)8108519984803694751L;
         var18 = -1280099763;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = -1747815728;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = -339674104;
         var17 = -1017644944;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = 680994814;
         var17 = var10003;
         var261[var10002] = (char)((var17 | var18) & ~(var17 & var18));
         var10002 = (int)-7918856336152100866L;
         var18 = 736311288;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = 1806583813;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var10003 = (int)6552057001767379333L;
         var18 = -1700072151;
         var17 = var10003;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = -198540099;
         var17 = var10003;
         var10003 = (var17 | var18) - (var17 & var18);
         int var10004 = (int)2296475977604686448L;
         var18 = -1735055277;
         var17 = var10004;
         var10004 = var17 + var18 - 2 * (var17 & var18);
         var18 = -1909233824;
         var17 = var10004;
         var18 = (var17 | var18) & ~(var17 & var18);
         var17 = var10003;
         var10003 = var17 - ~var18 - 1;
         var10003 = (int)-8260484200272122973L;
         var18 = -408564226;
         var17 = var10003;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = 631832142;
         var17 = var10003;
         var261[var10002] = (char)((var17 | var18) - (var17 & var18));
         var18 = 1068290446;
         var17 = 377508964;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = 690783726;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = -983806375;
         var17 = 464558482;
         var10004 = (var17 | var18) & (~var17 | ~var18);
         var18 = -554903612;
         var17 = var10004;
         var10004 = (var17 | var18) - (var17 & var18);
         var18 = -554549751;
         var17 = -495283068;
         var10004 = (var17 | var18) & ~(var17 & var18);
         var18 = 1015589535;
         var17 = var10004;
         var10004 = (var17 | var18) & ~(var17 & var18);
         var18 = 1539811002;
         var17 = 1742673580;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = 1008214323;
         var17 = var10003;
         var261[var10002] = (char)((var17 | var18) - (var17 & var18));
         var10002 = (int)793365283335557185L;
         var18 = 1694098614;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = -156355342;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = 515424776;
         var17 = -1364425599;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = -1340865781;
         var17 = var10003;
         var261[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var10002 = (int)9051075666970833138L;
         var18 = 849116649;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = 2120617245;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = -1130232830;
         var17 = 2075505304;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = -954744951;
         var17 = var10003;
         var261[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var18 = -1062982270;
         var17 = 1448424445;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = -1762582920;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var10003 = (int)7509055631168682745L;
         var18 = -1946298051;
         var17 = var10003;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = 1569282022;
         var17 = var10003;
         var261[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         var18 = -696482137;
         var17 = -786119082;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = 123224313;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = -924713565;
         var17 = -1869390170;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = 1483909974;
         var17 = var10003;
         var261[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         var18 = 1126056818;
         var17 = -589776927;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = -1614351206;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var10003 = (int)5221435944931577496L;
         var18 = -708277107;
         var17 = var10003;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = 248694065;
         var17 = var10003;
         var261[var10002] = (char)((var17 | var18) & ~(var17 & var18));
         char[] var8 = var261;
         var18 = 181154924;
         var17 = -150495708;
         var10000 = var17 + var18 - 2 * (var17 & var18);
         var18 = -36984254;
         var17 = var10000;
         char[] var263 = new char[(var17 | var18) & (~var17 | ~var18)];
         var10002 = (int)-2684838111422063400L;
         var18 = -1949093271;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = -493687119;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = -195633;
         var17 = -1791073668;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = 1791175059;
         var17 = var10003;
         var263[var10002] = (char)((var17 | var18) - (var17 & var18));
         var10002 = (int)-7446564399534150187L;
         var18 = -1230030806;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = 1847416318;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = 800297518;
         var17 = 1471528438;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = 1103040960;
         var17 = var10003;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var10003 = (int)-3792700391604244751L;
         var18 = 587724259;
         var17 = var10003;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = -2114527471;
         var17 = var10003;
         var263[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var10002 = (int)-7867821822944894464L;
         var18 = -1243839252;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = 2056333038;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = -194515617;
         var17 = -393433156;
         var10004 = (var17 | var18) & ~(var17 & var18);
         var18 = 485180137;
         var17 = var10004;
         var10004 = (var17 | var18) - (var17 & var18);
         var10004 = (int)-3505214062598716712L;
         var18 = 1267345868;
         var17 = var10004;
         var10004 = (var17 | var18) & (~var17 | ~var18);
         var18 = -493638885;
         var17 = var10004;
         var10004 = var17 + var18 - 2 * (var17 & var18);
         var18 = 1966894085;
         var17 = -95709058;
         var10004 = (var17 | var18) - (var17 & var18);
         var18 = -1887964048;
         var17 = var10004;
         var10004 = (var17 | var18) & ~(var17 & var18);
         var18 = -1346740735;
         var17 = 74005259;
         var10004 = var17 & ~var18 | ~var17 & var18;
         var18 = -1412209408;
         var17 = var10004;
         var10004 = (var17 | var18) - (var17 & var18);
         var18 = -485772786;
         var17 = 1281515661;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = -1352051248;
         var17 = var10003;
         var263[var10002] = (char)((var17 | var18) & ~(var17 & var18));
         var18 = -612732542;
         var17 = 1520454115;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = -2116405150;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = 734499;
         var17 = -139227868;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = -138903547;
         var17 = var10003;
         var263[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         var10002 = (int)8726458611847936651L;
         var18 = 722119837;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = 1095931410;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var10003 = (int)-31566924230392018L;
         var18 = -1220863688;
         var17 = var10003;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = 27502166;
         var17 = var10003;
         var263[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var18 = -121841629;
         var17 = 196028797;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = -216796837;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var10003 = (int)-754661035822312198L;
         var18 = 1255402466;
         var17 = var10003;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = 52971404;
         var17 = var10003;
         var263[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var18 = -900697800;
         var17 = 384670953;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = -591532585;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = 1368793767;
         var17 = -236539335;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = -1963961765;
         var17 = var10003;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var10003 = (int)-2092984551593777110L;
         var18 = 1603139193;
         var17 = var10003;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = -296609430;
         var17 = var10003;
         var263[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         var18 = 1221408810;
         var17 = -1531744365;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = -327264322;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var10003 = (int)3018084866498192877L;
         var18 = 1481534894;
         var17 = var10003;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = 1238702203;
         var17 = var10003;
         var263[var10002] = (char)((var17 | var18) - (var17 & var18));
         var18 = 431531288;
         var17 = -1261725899;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = -1384959451;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         String var356 = "eix";
         var18 = 1752797310;
         var17 = 2109330991;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = 364954965;
         var17 = var10003;
         var263[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var18 = -982607973;
         var17 = -258172520;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = 905055754;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var10003 = (int)-1679549840492004637L;
         var18 = -1627469617;
         var17 = var10003;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = 135659807;
         var17 = var10003;
         var263[var10002] = (char)((var17 | var18) - (var17 & var18));
         char[] var9 = var263;
         var10000 = (int)1175344881690750922L;
         var18 = -1178858423;
         var17 = var10000;
         var10000 = var17 + var18 - 2 * (var17 & var18);
         var18 = -394517629;
         var17 = var10000;

         for (int var10 = var17 & ~var18 | ~var17 & var18; var10 < var6.length; var10++) {
            if (a != a) {
               throw new RuntimeException();
            }

            char var318 = var6[var10];
            char var247 = var8[var10 % var8.length];
            char var127 = var318;
            var7[var10] = (char)(var127 + var247 - 2 * (var127 & var247));
         }

         char[] var19 = new char[var7.length];
         var10000 = (int)-995632185597434653L;
         var18 = -1299690683;
         var17 = var10000;
         var10000 = (var17 | var18) & (~var17 | ~var18);
         var18 = -804474970;
         var17 = var10000;

         for (int var11 = (var17 | var18) & (~var17 | ~var18); var11 < var6.length; var11++) {
            char var319 = var7[var11];
            char var250 = var9[var11 % var9.length];
            char var130 = var319;
            var19[var11] = (char)((var130 | var250) - (var130 & var250));
         }

         String var20 = new String(var19);
         int var12 = var20.hashCode();
         var18 = var5;
         var17 = var3;
         var10000 = var17 - var18;
         var18 = var2;
         var17 = var10000;
         int var13 = 2 * (var17 & ~var18) - (var17 ^ var18);
         char[] var14 = var0.toCharArray();
         char[] var15 = new char[var14.length];
         var18 = -1630839868;
         var17 = -401819089;
         var10000 = (var17 | var18) - (var17 & var18);
         var18 = 1992810987;
         var17 = var10000;

         for (int var16 = (var17 | var18) & ~(var17 & var18); var16 < var15.length; var16++) {
            var18 = -533544144;
            var17 = -40445931;
            int var10001 = var17 + var18 - 2 * (var17 & var18);
            var18 = 497294119;
            var17 = var10001;
            switch (var16 % ((var17 | var18) & ~(var17 & var18))) {
               case 0:
                  var18 = var12;
                  var17 = var13;
                  var10002 = var17 + var18 - 2 * (var17 & var18);
                  char var260 = var14[var16];
                  var17 = var10002;
                  var15[var16] = (char)(var17 + var260 - 2 * (var17 & var260));
                  break;
               case 1:
                  var18 = var13;
                  var17 = var5;
                  var10002 = (var17 | var18) & ~(var17 & var18);
                  char var258 = var14[var16];
                  var17 = var10002;
                  var15[var16] = (char)(var17 & ~var258 | ~var17 & var258);
            }
         }

         return new String(var15);
      }
   }

   public static class ModuleState {
      private boolean c;
      private int d;
      private Map<String, ConfigState.SettingState> e = new HashMap<>();
      public static int a;
      public static boolean b;

      public ModuleState() {
      }

      public ModuleState(boolean var1, int var2) {
         this.c = var1;
         this.d = var2;
      }

      public boolean a() {
         return this.c;
      }

      public void a(boolean var1) {
         this.c = var1;
      }

      public int b() {
         return this.d;
      }

      public void a(int var1) {
         this.d = var1;
      }

      public Map<String, ConfigState.SettingState> c() {
         return this.e;
      }

      public void a(Map<String, ConfigState.SettingState> var1) {
         this.e = var1;
      }

      public static String a(String var0, String var1, int var2, int var3, int var4, int var5) {
         char[] var6 = var1.toCharArray();
         char[] var7 = new char[var6.length];
         int var20 = 847837117;
         int var19 = -557337828;
         int var10000 = var19 + var20 - 2 * (var19 & var20);
         var20 = -330349397;
         var19 = var10000;
         char[] var300 = new char[(var19 | var20) & ~(var19 & var20)];
         int var10002 = (int)7539414310744571585L;
         var20 = 623222884;
         var19 = var10002;
         var10002 = var19 + var20 - 2 * (var19 & var20);
         var20 = -1689739611;
         var19 = var10002;
         var10002 = var19 + var20 - 2 * (var19 & var20);
         int var10003 = (int)4597661942511363663L;
         var20 = 1092738501;
         var19 = var10003;
         var10003 = (var19 | var20) - (var19 & var20);
         var20 = 563704760;
         var19 = var10003;
         var300[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
         var20 = -139203061;
         var19 = 674503785;
         var10002 = (var19 | var20) & ~(var19 & var20);
         var20 = -544738717;
         var19 = var10002;
         var10002 = (var19 | var20) & ~(var19 & var20);
         var10003 = (int)2354274678266922042L;
         var20 = -816488685;
         var19 = var10003;
         var10003 = var19 & ~var20 | ~var19 & var20;
         var20 = 1654225068;
         var19 = var10003;
         var300[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
         var20 = 967227457;
         var19 = -586778188;
         var10002 = (var19 | var20) & ~(var19 & var20);
         var20 = -459226633;
         var19 = var10002;
         var10002 = (var19 | var20) - (var19 & var20);
         var10003 = (int)-2266256243215884100L;
         var20 = -1105579699;
         var19 = var10003;
         var10003 = (var19 | var20) - (var19 & var20);
         var20 = -1962855817;
         var19 = var10003;
         var300[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
         var20 = -653645690;
         var19 = -245870603;
         var10002 = var19 & ~var20 | ~var19 & var20;
         var20 = 676489072;
         var19 = var10002;
         var10002 = var19 + var20 - 2 * (var19 & var20);
         var20 = -1016149175;
         var19 = 1581657970;
         int var10004 = var19 + var20 - 2 * (var19 & var20);
         var20 = -1658264527;
         var19 = var10004;
         var10004 = var19 & ~var20 | ~var19 & var20;
         var20 = 1471078858;
         var19 = -1994129516;
         var10004 = var19 + var20 - 2 * (var19 & var20);
         var20 = -561177010;
         var19 = var10004;
         var10004 = (var19 | var20) & ~(var19 & var20);
         var10004 = (int)-3281580675725886066L;
         var20 = 1472171681;
         var19 = var10004;
         var10004 = var19 + var20 - 2 * (var19 & var20);
         var20 = 1177416492;
         var19 = var10004;
         var10004 = var19 & ~var20 | ~var19 & var20;
         var20 = 927443227;
         var19 = -197915612;
         var10003 = (var19 | var20) & (~var19 | ~var20);
         var20 = -1015857876;
         var19 = var10003;
         var300[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
         var10002 = (int)8566667744899035414L;
         var20 = 1709662124;
         var19 = var10002;
         var10002 = var19 & ~var20 | ~var19 & var20;
         var20 = 1718070974;
         var19 = var10002;
         var10002 = (var19 | var20) - (var19 & var20);
         var20 = 756303699;
         var19 = 1218543806;
         var10003 = (var19 | var20) & ~(var19 & var20);
         var20 = -1885268005;
         var19 = var10003;
         var10003 = (var19 | var20) & (~var19 | ~var20);
         var20 = 1027147839;
         var19 = -260462919;
         var10004 = (var19 | var20) & (~var19 | ~var20);
         var20 = -1237191847;
         var19 = var10004;
         var20 = (var19 | var20) & ~(var19 & var20);
         var19 = var10003;
         var10003 = (var19 & ~var20) + (var20 & ~var19) + 2 * (var19 & var20);
         var10003 = (int)-8983421946655032780L;
         var20 = 438368998;
         var19 = var10003;
         var10003 = (var19 | var20) - (var19 & var20);
         var20 = -401747465;
         var19 = var10003;
         var300[var10002] = (char)((var19 | var20) & ~(var19 & var20));
         var20 = -998158518;
         var19 = -1749435187;
         var10002 = (var19 | var20) - (var19 & var20);
         var20 = 1396241282;
         var19 = var10002;
         var10002 = (var19 | var20) & ~(var19 & var20);
         var10003 = (int)4931927850520605681L;
         var20 = -116172092;
         var19 = var10003;
         var10003 = var19 & ~var20 | ~var19 & var20;
         var20 = 489811127;
         var19 = var10003;
         var300[var10002] = (char)((var19 | var20) & ~(var19 & var20));
         var10002 = (int)8680803140567213414L;
         var20 = -2034158220;
         var19 = var10002;
         var10002 = (var19 | var20) - (var19 & var20);
         var20 = 542871572;
         var19 = var10002;
         var10002 = (var19 | var20) & (~var19 | ~var20);
         var10003 = (int)1540616805753467893L;
         var20 = -409859309;
         var19 = var10003;
         var10003 = (var19 | var20) & ~(var19 & var20);
         var20 = 1719448053;
         var19 = var10003;
         var300[var10002] = (char)((var19 | var20) - (var19 & var20));
         var20 = -267376979;
         var19 = -584056314;
         var10002 = (var19 | var20) & ~(var19 & var20);
         var20 = 757081260;
         var19 = var10002;
         var10002 = (var19 | var20) & (~var19 | ~var20);
         var20 = -1684789071;
         var19 = -396565334;
         var10003 = (var19 | var20) & (~var19 | ~var20);
         var20 = 1942550585;
         var19 = var10003;
         var300[var10002] = (char)((var19 | var20) & ~(var19 & var20));
         var10002 = (int)7102093634368954985L;
         var20 = 978810342;
         var19 = var10002;
         var10002 = (var19 | var20) - (var19 & var20);
         var20 = 340301703;
         var19 = var10002;
         var10002 = (var19 | var20) & ~(var19 & var20);
         var10003 = (int)-4578323764971954382L;
         var20 = -91662419;
         var19 = var10003;
         var10003 = (var19 | var20) - (var19 & var20);
         var20 = 144130252;
         var19 = var10003;
         var300[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
         var10002 = (int)-8093933355933730946L;
         var20 = 147533169;
         var19 = var10002;
         var10002 = var19 + var20 - 2 * (var19 & var20);
         var20 = 53041670;
         var19 = var10002;
         var10002 = (var19 | var20) - (var19 & var20);
         var20 = -1042982609;
         var19 = 1371872;
         var10003 = var19 & ~var20 | ~var19 & var20;
         var20 = -1044270869;
         var19 = var10003;
         var300[var10002] = (char)((var19 | var20) - (var19 & var20));
         char[] var8 = var300;
         var20 = 422083616;
         var19 = 1988126853;
         var10000 = (var19 | var20) - (var19 & var20);
         var20 = 1873286319;
         var19 = var10000;
         char[] var302 = new char[var19 + var20 - 2 * (var19 & var20)];
         var20 = 1445436650;
         var19 = 474351903;
         var10002 = var19 + var20 - 2 * (var19 & var20);
         var20 = 1247909365;
         var19 = var10002;
         var10002 = var19 & ~var20 | ~var19 & var20;
         var10003 = (int)-1921894671424547285L;
         var20 = 928201889;
         var19 = var10003;
         var10003 = (var19 | var20) - (var19 & var20);
         var20 = -1454021974;
         var19 = var10003;
         var302[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
         var20 = 1901717737;
         var19 = 2115210974;
         var10002 = var19 + var20 - 2 * (var19 & var20);
         var20 = 256534070;
         var19 = var10002;
         var10002 = (var19 | var20) - (var19 & var20);
         var20 = 1041742268;
         var19 = -322528080;
         var10003 = (var19 | var20) & ~(var19 & var20);
         var20 = -900429870;
         var19 = var10003;
         var10003 = (var19 + var20 - 2 * (var19 & var20)) * (var19 + var20 - 2 * (var19 & var20));
         var10003 = (int)5409489461766740977L;
         var20 = 948054027;
         var19 = var10003;
         var10003 = var19 & ~var20 | ~var19 & var20;
         var20 = 5371897;
         var19 = var10003;
         var302[var10002] = (char)((var19 | var20) - (var19 & var20));
         var20 = 934852441;
         var19 = 1286062524;
         var10002 = (var19 | var20) & (~var19 | ~var20);
         var20 = 2065659623;
         var19 = var10002;
         var10002 = (var19 | var20) & (~var19 | ~var20);
         var20 = 515892407;
         var19 = -1731994224;
         var10004 = var19 + var20 - 2 * (var19 & var20);
         var20 = -2038679261;
         var19 = var10004;
         var10004 = (var19 | var20) & ~(var19 & var20);
         var10004 = (int)2443390592110935022L;
         var20 = -1034521573;
         var19 = var10004;
         var10004 = (var19 | var20) & ~(var19 & var20);
         var20 = -2145660955;
         var19 = var10004;
         var10004 = (var19 | var20) & (~var19 | ~var20);
         var20 = -1579527447;
         var19 = -1396016456;
         var10004 = (var19 | var20) & ~(var19 & var20);
         var20 = 219162704;
         var19 = var10004;
         var10004 = (var19 | var20) - (var19 & var20);
         var10003 = (int)6502667081699990805L;
         var20 = -1542498630;
         var19 = var10003;
         var10003 = var19 & ~var20 | ~var19 & var20;
         var20 = -1118483204;
         var19 = var10003;
         var302[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
         var10002 = (int)-4404644460186121091L;
         var20 = 1264417439;
         var19 = var10002;
         var10002 = (var19 | var20) & (~var19 | ~var20);
         var20 = 267106017;
         var19 = var10002;
         var10002 = (var19 | var20) & ~(var19 & var20);
         var20 = -967428041;
         var19 = 1254406182;
         var10003 = (var19 | var20) & (~var19 | ~var20);
         var20 = -1936541677;
         var19 = var10003;
         var302[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
         var10002 = (int)1871267908878022646L;
         var20 = -637114631;
         var19 = var10002;
         var10002 = var19 & ~var20 | ~var19 & var20;
         var20 = 1984254219;
         var19 = var10002;
         var10002 = var19 + var20 - 2 * (var19 & var20);
         var10003 = (int)-2264046745096560533L;
         var20 = 1377399067;
         var19 = var10003;
         var10003 = (var19 | var20) & ~(var19 & var20);
         var20 = 1102752048;
         var19 = var10003;
         var302[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
         var20 = 497797745;
         var19 = 1467398103;
         var10002 = (var19 | var20) & ~(var19 & var20);
         var20 = 1256029603;
         var19 = var10002;
         var10002 = var19 + var20 - 2 * (var19 & var20);
         var10003 = (int)-7370115844124816839L;
         var20 = -880371461;
         var19 = var10003;
         var10003 = var19 + var20 - 2 * (var19 & var20);
         var20 = -17765802;
         var19 = var10003;
         var302[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
         var10002 = (int)-1074980048605203844L;
         var20 = -1511970405;
         var19 = var10002;
         var10002 = (var19 | var20) & ~(var19 & var20);
         var20 = -73393183;
         var19 = var10002;
         var10002 = (var19 | var20) & ~(var19 & var20);
         var20 = 274592299;
         var19 = -895612366;
         var10003 = (var19 | var20) - (var19 & var20);
         var20 = -1068294819;
         var19 = var10003;
         var10003 = var19 + var20 - 2 * (var19 & var20);
         var10003 = (int)-1700029088119871641L;
         var20 = 2000137618;
         var19 = var10003;
         var10003 = var19 & ~var20 | ~var19 & var20;
         var20 = 1509920204;
         var19 = var10003;
         var302[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
         var20 = -774725240;
         var19 = -672563609;
         var10002 = var19 + var20 - 2 * (var19 & var20);
         var20 = 104587240;
         var19 = var10002;
         var10002 = (var19 | var20) & (~var19 | ~var20);
         var20 = -2021192523;
         var19 = -535655858;
         var10003 = (var19 | var20) & ~(var19 & var20);
         var20 = 1737856707;
         var19 = var10003;
         var302[var10002] = (char)((var19 | var20) - (var19 & var20));
         var10002 = (int)4013582591711375454L;
         var20 = 389431362;
         var19 = var10002;
         var10002 = (var19 | var20) & ~(var19 & var20);
         var20 = 949202964;
         var19 = var10002;
         var10002 = var19 & ~var20 | ~var19 & var20;
         var10003 = (int)3860812141860806145L;
         var20 = -331650636;
         var19 = var10003;
         var10003 = (var19 | var20) - (var19 & var20);
         var20 = 2003122962;
         var19 = var10003;
         var10003 = (var19 | var20) & (~var19 | ~var20);
         var20 = -528787812;
         var19 = -1090547272;
         var10003 = (var19 | var20) & ~(var19 & var20);
         var20 = 1585726496;
         var19 = var10003;
         var302[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
         var20 = -1646183873;
         var19 = 1670418708;
         var10002 = (var19 | var20) - (var19 & var20);
         var20 = -26105054;
         var19 = var10002;
         var10002 = (var19 | var20) & ~(var19 & var20);
         var10003 = (int)4618313507778221671L;
         var20 = 445662707;
         var19 = var10003;
         var10003 = (var19 | var20) & (~var19 | ~var20);
         var20 = -2045632345;
         var19 = var10003;
         var302[var10002] = (char)((var19 | var20) - (var19 & var20));
         char[] var9 = var302;
         var10000 = (int)8545406117165466702L;
         var20 = -1720138069;
         var19 = var10000;
         var10000 = var19 & ~var20 | ~var19 & var20;
         var20 = 308396773;
         var19 = var10000;

         for (int var10 = (var19 | var20) & (~var19 | ~var20); var10 < var6.length; var10++) {
            char var372 = var6[var10];
            char var270 = var8[var10 % var8.length];
            char var132 = var372;
            var7[var10] = (char)((var132 | var270) & (~var132 | ~var270));
         }

         char[] var21 = new char[var7.length];
         var20 = 1785822178;
         var19 = 1715510618;
         var10000 = (var19 | var20) & ~(var19 & var20);
         var20 = 204596920;
         var19 = var10000;

         for (int var11 = (var19 | var20) & (~var19 | ~var20); var11 < var6.length; var11++) {
            char var373 = var7[var11];
            char var273 = var9[var11 % var9.length];
            char var135 = var373;
            var21[var11] = (char)(var135 & ~var273 | ~var135 & var273);
         }

         String var22 = new String(var21);
         int var12 = var22.hashCode();
         var20 = var5;
         var19 = var3;
         var10000 = var19 + ~var20 + 1;
         var20 = var2;
         var19 = var10000;
         int var13 = var19 - var20;
         char[] var14 = var0.toCharArray();
         char[] var15 = new char[var14.length];
         var10000 = (int)-3032237704756237152L;
         var20 = 976928123;
         var19 = var10000;
         var10000 = (var19 | var20) & (~var19 | ~var20);
         var20 = 1196413403;
         var19 = var10000;
         int var16 = var19 + var20 - 2 * (var19 & var20);
         var20 = 490264652;
         var19 = -237297217;
         var10000 = var19 + var20 - 2 * (var19 & var20);
         var20 = 675035872;
         var19 = var10000;
         var10000 = var19 & ~var20 | ~var19 & var20;
         var20 = -508232146;
         var19 = -1199897091;
         int var10001 = (var19 | var20) & (~var19 | ~var20);
         var20 = 808260791;
         var19 = var10001;
         var20 = (var19 | var20) & ~(var19 & var20);
         var19 = var10000;
         var10000 = (var19 & ~var20) + (var20 & ~var19) + 2 * (var19 & var20);
         var20 = 1254852649;
         var19 = 388259929;
         var10000 = var19 & ~var20 | ~var19 & var20;
         var20 = 1550944210;
         var19 = var10000;
         int var18 = var19 + var20 - 2 * (var19 & var20);
         a = var18;
         String var313 = "bwo";
         var20 = -1082682409;
         var19 = -1360514415;
         var10000 = var19 + var20 - 2 * (var19 & var20);
         var20 = 330913019;
         var19 = var10000;
         if (((var19 | var20) & ~(var19 & var20)) < a) {
            var10000 = (int)-6108447047862262351L;
            var20 = -51989638;
            var19 = var10000;
            var10000 = (var19 | var20) - (var19 & var20);
            var20 = 90579033;
            var19 = var10000;
            var10000 = var19 & ~var20 | ~var19 & var20;
            var10001 = (int)2014886454252834501L;
            var20 = 1277876522;
            var19 = var10001;
            var10001 = (var19 | var20) & ~(var19 & var20);
            var20 = -1237271053;
            var19 = var10001;
            var20 = (var19 | var20) - (var19 & var20);
            var19 = var10000;
            var10000 = (var19 ^ var20) + 2 * (var19 & var20);
            var10000 = (int)-8709468342744430758L;
            var20 = 676484100;
            var19 = var10000;
            var10000 = (var19 | var20) - (var19 & var20);
            var20 = -430674491;
            var19 = var10000;
            var18 = (var19 | var20) & (~var19 | ~var20);
         }

         for (; var16 < var15.length; var16++) {
            var20 = 1251503254;
            var19 = -1135983246;
            var10001 = (var19 | var20) - (var19 & var20);
            var20 = -153998874;
            var19 = var10001;
            switch (var16 % (var19 + var20 - 2 * (var19 & var20))) {
               case 0:
                  var20 = var12;
                  var19 = var13;
                  var10002 = (var19 | var20) & (~var19 | ~var20);
                  char var299 = var14[var16];
                  var19 = var10002;
                  var15[var16] = (char)((var19 | var299) & (~var19 | ~var299));
                  break;
               case 1:
                  var20 = var13;
                  var19 = var5;
                  var10002 = (var19 | var20) & ~(var19 & var20);
                  char var297 = var14[var16];
                  var19 = var10002;
                  var15[var16] = (char)((var19 | var297) & ~(var19 & var297));
            }
         }

         return new String(var15);
      }
   }

   public static class SettingState {
      private String c;
      private Object d;
      private Float e;
      private Float f;
      private Float g;
      private int[] h;
      private Boolean i;
      private Integer j;
      public static int a;
      public static boolean b;

      public SettingState() {
      }

      public SettingState(String var1, Object var2) {
         this.c = var1;
         this.d = var2;
      }

      public String a() {
         return this.c;
      }

      public void a(String var1) {
         this.c = var1;
      }

      public Object b() {
         return this.d;
      }

      public void a(Object var1) {
         this.d = var1;
      }

      public Float c() {
         return this.e;
      }

      public void a(Float var1) {
         this.e = var1;
      }

      public Float d() {
         return this.f;
      }

      public void b(Float var1) {
         this.f = var1;
      }

      public Float e() {
         return this.g;
      }

      public void c(Float var1) {
         this.g = var1;
      }

      public int[] f() {
         return this.h;
      }

      public void a(int[] var1) {
         this.h = var1;
      }

      public Boolean g() {
         return this.i;
      }

      public void a(Boolean var1) {
         this.i = var1;
      }

      public Integer h() {
         return this.j;
      }

      public void a(Integer var1) {
         this.j = var1;
      }

      public static String a(String var0, String var1, int var2, int var3, int var4, int var5) {
         char[] var6 = var1.toCharArray();
         char[] var7 = new char[var6.length];
         int var20 = 2063122761;
         int var19 = 1937295032;
         int var10000 = (var19 | var20) - (var19 & var20);
         var20 = 159385595;
         var19 = var10000;
         char[] var299 = new char[(var19 | var20) & (~var19 | ~var20)];
         int var10002 = (int)-6061803536562971769L;
         var20 = 638389781;
         var19 = var10002;
         var10002 = (var19 | var20) - (var19 & var20);
         var20 = -956820078;
         var19 = var10002;
         var10002 = (var19 | var20) & (~var19 | ~var20);
         var20 = -1922209803;
         var19 = 1518390618;
         int var10003 = (var19 | var20) & (~var19 | ~var20);
         var20 = -672275811;
         var19 = var10003;
         var299[var10002] = (char)((var19 | var20) - (var19 & var20));
         var20 = 1047822228;
         var19 = -2060737509;
         var10002 = var19 + var20 - 2 * (var19 & var20);
         var20 = -1151345778;
         var19 = var10002;
         var10002 = (var19 | var20) - (var19 & var20);
         var20 = -636733550;
         var19 = 211533598;
         var10003 = (var19 | var20) & (~var19 | ~var20);
         var20 = -694703351;
         var19 = var10003;
         var299[var10002] = (char)((var19 | var20) & ~(var19 & var20));
         var20 = -416480705;
         var19 = 800957421;
         var10002 = (var19 | var20) & ~(var19 & var20);
         var20 = -930045488;
         var19 = var10002;
         var10002 = (var19 | var20) & (~var19 | ~var20);
         var20 = 1417576011;
         var19 = 835280615;
         var10003 = (var19 | var20) & (~var19 | ~var20);
         var20 = 1706492714;
         var19 = var10003;
         var299[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
         var20 = 677409017;
         var19 = 157285795;
         var10002 = (var19 | var20) & (~var19 | ~var20);
         var20 = 557813081;
         var19 = var10002;
         var10002 = var19 + var20 - 2 * (var19 & var20);
         var20 = -1155111620;
         var19 = -536944073;
         var10003 = (var19 | var20) - (var19 & var20);
         var20 = -1657033594;
         var19 = var10003;
         var10003 = (var19 | var20) & (~var19 | ~var20);
         var20 = 1189368328;
         var19 = -1661844325;
         int var10004 = (var19 | var20) & (~var19 | ~var20);
         var20 = -1651515429;
         var19 = var10004;
         var20 = var19 + var20 - 2 * (var19 & var20);
         var19 = var10003;
         var10003 = 2 * (var19 | var20) - (var19 ^ var20);
         var20 = -94838909;
         var19 = 1550878539;
         var10003 = (var19 | var20) - (var19 & var20);
         var20 = -1507278629;
         var19 = var10003;
         var299[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
         var10002 = (int)1593763476097958817L;
         var20 = -2032550700;
         var19 = var10002;
         var10002 = (var19 | var20) & (~var19 | ~var20);
         var20 = 2115387249;
         var19 = var10002;
         var10002 = var19 + var20 - 2 * (var19 & var20);
         var20 = -1537162871;
         var19 = -219193144;
         var10003 = (var19 | var20) - (var19 & var20);
         var20 = 1250323581;
         var19 = var10003;
         var10003 = ((var19 | var20) - (var19 & var20)) * ((var19 | var20) - (var19 & var20));
         var20 = 436408420;
         var19 = 1502558469;
         var10003 = (var19 | var20) & ~(var19 & var20);
         var20 = 1133295684;
         var19 = var10003;
         var299[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
         var10002 = (int)8081816706345277686L;
         var20 = -463227876;
         var19 = var10002;
         var10002 = var19 & ~var20 | ~var19 & var20;
         var20 = 1172614383;
         var19 = var10002;
         var10002 = (var19 | var20) - (var19 & var20);
         var10003 = (int)8145403777129453683L;
         var20 = 725542759;
         var19 = var10003;
         var10003 = (var19 | var20) & ~(var19 & var20);
         var20 = 349420182;
         var19 = var10003;
         var299[var10002] = (char)((var19 | var20) & ~(var19 & var20));
         var20 = -1927888193;
         var19 = 334605628;
         var10002 = (var19 | var20) & (~var19 | ~var20);
         var20 = -1628999803;
         var19 = var10002;
         var10002 = (var19 | var20) & (~var19 | ~var20);
         var20 = 1067319369;
         var19 = 659957515;
         var10003 = var19 + var20 - 2 * (var19 & var20);
         var20 = 415772241;
         var19 = var10003;
         var299[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
         var20 = -685968575;
         var19 = -1847689737;
         var10002 = var19 + var20 - 2 * (var19 & var20);
         var20 = 1187155633;
         var19 = var10002;
         var10002 = var19 + var20 - 2 * (var19 & var20);
         var20 = 1289002935;
         var19 = -2105547174;
         var10003 = (var19 | var20) - (var19 & var20);
         var20 = -827634225;
         var19 = var10003;
         var299[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
         var10002 = (int)-9168063579122272033L;
         var20 = 63751232;
         var19 = var10002;
         var10002 = (var19 | var20) & (~var19 | ~var20);
         var20 = -738935657;
         var19 = var10002;
         var10002 = (var19 | var20) - (var19 & var20);
         var20 = 1515914528;
         var19 = 264435646;
         var10003 = var19 + var20 - 2 * (var19 & var20);
         var20 = 1436154573;
         var19 = var10003;
         var299[var10002] = (char)((var19 | var20) & ~(var19 & var20));
         var20 = 563008181;
         var19 = 543972260;
         var10002 = (var19 | var20) & ~(var19 & var20);
         var20 = 31623448;
         var19 = var10002;
         var10002 = (var19 | var20) & ~(var19 & var20);
         var20 = -1851254032;
         var19 = 1922805379;
         var10003 = (var19 | var20) & ~(var19 & var20);
         var20 = -483151017;
         var19 = var10003;
         var299[var10002] = (char)((var19 | var20) & ~(var19 & var20));
         char[] var8 = var299;
         var20 = 1092415385;
         var19 = 241992100;
         var10000 = (var19 | var20) & ~(var19 & var20);
         var20 = 1332768311;
         var19 = var10000;
         char[] var301 = new char[var19 & ~var20 | ~var19 & var20];
         var20 = 1567861512;
         var19 = 603655847;
         var10002 = (var19 | var20) - (var19 & var20);
         var20 = 2122884527;
         var19 = var10002;
         var10002 = (var19 | var20) - (var19 & var20);
         var20 = -1739238892;
         var19 = 113889419;
         var10003 = (var19 | var20) & (~var19 | ~var20);
         var20 = -1633891649;
         var19 = var10003;
         var301[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
         var10002 = (int)3066116125453131051L;
         var20 = -330838356;
         var19 = var10002;
         var10002 = var19 + var20 - 2 * (var19 & var20);
         var20 = -302197882;
         var19 = var10002;
         var10002 = (var19 | var20) - (var19 & var20);
         var20 = -52291446;
         var19 = 862049769;
         var10003 = var19 & ~var20 | ~var19 & var20;
         var20 = 30723799;
         var19 = var10003;
         var10003 = var19 + var20 - 2 * (var19 & var20);
         var20 = 246534795;
         var19 = 324577317;
         var10004 = var19 + var20 - 2 * (var19 & var20);
         var20 = -311149384;
         var19 = var10004;
         var20 = var19 + var20 - 2 * (var19 & var20);
         var19 = var10003;
         var10003 = (var19 ^ var20) + 2 * (var19 & var20);
         var10003 = (int)6866773095934253353L;
         var20 = 899081160;
         var19 = var10003;
         var10003 = (var19 | var20) & ~(var19 & var20);
         var20 = -171393310;
         var19 = var10003;
         var301[var10002] = (char)((var19 | var20) & ~(var19 & var20));
         var10002 = (int)7402401369970793320L;
         var20 = -1492323703;
         var19 = var10002;
         var10002 = (var19 | var20) - (var19 & var20);
         var20 = 720742883;
         var19 = var10002;
         var10002 = var19 + var20 - 2 * (var19 & var20);
         String var391 = "jy";
         var10003 = (int)-4103278840992494780L;
         var20 = 1666201425;
         var19 = var10003;
         var10003 = (var19 | var20) & (~var19 | ~var20);
         var20 = 1058323270;
         var19 = var10003;
         var301[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
         var20 = -1045495954;
         var19 = 1929905480;
         var10002 = (var19 | var20) & (~var19 | ~var20);
         var20 = -1297679835;
         var19 = var10002;
         var10002 = (var19 | var20) & (~var19 | ~var20);
         var20 = -1088750329;
         var19 = 217458815;
         var10003 = var19 & ~var20 | ~var19 & var20;
         var20 = -1276318342;
         var19 = var10003;
         var301[var10002] = (char)((var19 | var20) & ~(var19 & var20));
         var10002 = (int)9037518420818394747L;
         var20 = 1687027447;
         var19 = var10002;
         var10002 = (var19 | var20) & (~var19 | ~var20);
         var20 = -1755316088;
         var19 = var10002;
         var10002 = var19 & ~var20 | ~var19 & var20;
         var10003 = (int)4053733500710584876L;
         var20 = 1639873858;
         var19 = var10003;
         var10003 = (var19 | var20) & (~var19 | ~var20);
         var20 = 1246414638;
         var19 = var10003;
         var301[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
         var10002 = (int)-4730826462968128116L;
         var20 = 1600070210;
         var19 = var10002;
         var10002 = (var19 | var20) & (~var19 | ~var20);
         var20 = -1013219381;
         var19 = var10002;
         var10002 = var19 + var20 - 2 * (var19 & var20);
         var20 = 1209230337;
         var19 = -1859944980;
         var10003 = var19 & ~var20 | ~var19 & var20;
         var20 = -651157127;
         var19 = var10003;
         var301[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
         var20 = 782086196;
         var19 = -1959203404;
         var10002 = (var19 | var20) & ~(var19 & var20);
         var20 = -1515889274;
         var19 = var10002;
         var10002 = var19 & ~var20 | ~var19 & var20;
         var20 = 1564918225;
         var19 = -212671859;
         var10004 = var19 & ~var20 | ~var19 & var20;
         var20 = -1374411949;
         var19 = var10004;
         var10004 = var19 + var20 - 2 * (var19 & var20);
         var10004 = (int)-4255514201995303838L;
         var20 = 1222928469;
         var19 = var10004;
         var10004 = (var19 | var20) & (~var19 | ~var20);
         var20 = 227855419;
         var19 = var10004;
         var10004 = (var19 | var20) - (var19 & var20);
         var10004 = (int)-1592898287839777032L;
         var20 = 464176875;
         var19 = var10004;
         var10004 = var19 + var20 - 2 * (var19 & var20);
         var20 = 1179756569;
         var19 = var10004;
         var10004 = (var19 | var20) & ~(var19 & var20);
         var20 = 2060786522;
         var19 = -1925626120;
         var10004 = (var19 | var20) - (var19 & var20);
         var20 = -135504473;
         var19 = var10004;
         var10004 = (var19 | var20) - (var19 & var20);
         var10004 = (int)-3556752356063815136L;
         var20 = -447529820;
         var19 = var10004;
         var10004 = (var19 | var20) & ~(var19 & var20);
         var20 = 2073781903;
         var19 = var10004;
         var10004 = var19 + var20 - 2 * (var19 & var20);
         var20 = -1246969083;
         var19 = -935699015;
         var10003 = (var19 | var20) & ~(var19 & var20);
         var20 = 2106988933;
         var19 = var10003;
         var301[var10002] = (char)((var19 | var20) & ~(var19 & var20));
         var20 = 967400234;
         var19 = -1845821892;
         var10002 = (var19 | var20) - (var19 & var20);
         var20 = -1470913263;
         var19 = var10002;
         var10002 = (var19 | var20) & (~var19 | ~var20);
         var20 = 1376202444;
         var19 = 1062841523;
         var10003 = var19 + var20 - 2 * (var19 & var20);
         var20 = 1834914375;
         var19 = var10003;
         var301[var10002] = (char)((var19 | var20) & ~(var19 & var20));
         var20 = 764382831;
         var19 = 2124265474;
         var10002 = (var19 | var20) & (~var19 | ~var20);
         var20 = 1393702501;
         var19 = var10002;
         var10002 = var19 & ~var20 | ~var19 & var20;
         var10004 = (int)-3057304872902898180L;
         var20 = -1428156436;
         var19 = var10004;
         var10004 = (var19 | var20) - (var19 & var20);
         var20 = 846021123;
         var19 = var10004;
         var10004 = var19 & ~var20 | ~var19 & var20;
         var10004 = (int)5650196414530861605L;
         var20 = -1464322035;
         var19 = var10004;
         var10004 = var19 & ~var20 | ~var19 & var20;
         var20 = 1609826854;
         var19 = var10004;
         var10004 = (var19 | var20) & ~(var19 & var20);
         var20 = 1529526876;
         var19 = -1396969087;
         var10004 = var19 + var20 - 2 * (var19 & var20);
         var20 = -141472807;
         var19 = var10004;
         var10004 = (var19 | var20) & (~var19 | ~var20);
         var10003 = (int)-5835173366284720709L;
         var20 = -1282255613;
         var19 = var10003;
         var10003 = (var19 | var20) & ~(var19 & var20);
         var20 = -128601156;
         var19 = var10003;
         var301[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
         var10002 = (int)-4689611636737665319L;
         var20 = -433765586;
         var19 = var10002;
         var10002 = (var19 | var20) - (var19 & var20);
         var20 = -946612738;
         var19 = var10002;
         var10002 = (var19 | var20) - (var19 & var20);
         var20 = 1644043613;
         var19 = 954192554;
         var10003 = (var19 | var20) & ~(var19 & var20);
         var20 = 1495399620;
         var19 = var10003;
         var301[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
         char[] var9 = var301;
         var10000 = (int)-5633529580908036629L;
         var20 = -223180939;
         var19 = var10000;
         var10000 = var19 + var20 - 2 * (var19 & var20);
         var20 = 1356905118;
         var19 = var10000;
         int var10 = var19 + var20 - 2 * (var19 & var20);
         var20 = 710894700;
         var19 = -2028392675;
         var10000 = (var19 | var20) & ~(var19 & var20);
         var20 = -1428452202;
         var19 = var10000;
         var10000 = ((var19 | var20) & (~var19 | ~var20)) * ((var19 | var20) & (~var19 | ~var20));
         var10000 = (int)7028805941283362614L;
         var20 = -1874119714;
         var19 = var10000;
         var10000 = var19 + var20 - 2 * (var19 & var20);
         var20 = -829953046;
         var19 = var10000;
         int var18 = var19 & ~var20 | ~var19 & var20;
         var20 = 1342247621;
         var19 = -1619284601;
         var10000 = var19 + var20 - 2 * (var19 & var20);
         var20 = -123313431;
         var19 = var10000;
         var10000 = (var19 | var20) & (~var19 | ~var20);
         int var10001 = (int)-6155953759023141160L;
         var20 = 1167927367;
         var19 = var10001;
         var10001 = var19 & ~var20 | ~var19 & var20;
         var20 = -1225121018;
         var19 = var10001;
         var20 = (var19 | var20) - (var19 & var20);
         var19 = var10000;
         var10000 = (var19 ^ var20) + 2 * (var19 & var20);
         var20 = 1675164876;
         var19 = 357003341;
         var10000 = (var19 | var20) & (~var19 | ~var20);
         var20 = 1197594624;
         var19 = var10000;
         if ((var19 | var20) - (var19 & var20) >= var18) {
            throw new ExceptionInInitializerError();
         }

         while (var10 < var6.length) {
            char var366 = var6[var10];
            char var285 = var8[var10 % var8.length];
            char var147 = var366;
            var7[var10] = (char)(var147 & ~var285 | ~var147 & var285);
            var10++;
         }

         char[] var21 = new char[var7.length];
         var20 = 1314750;
         var19 = -1647778080;
         var10000 = (var19 | var20) - (var19 & var20);
         var20 = -1646466722;
         var19 = var10000;

         for (int var11 = (var19 | var20) & (~var19 | ~var20); var11 < var6.length; var11++) {
            char var367 = var7[var11];
            char var288 = var9[var11 % var9.length];
            char var150 = var367;
            var21[var11] = (char)(var150 & ~var288 | ~var150 & var288);
         }

         String var22 = new String(var21);
         int var12 = var22.hashCode();
         var20 = var5;
         var19 = var3;
         var10000 = var19 - var20;
         var20 = var2;
         var19 = var10000;
         int var13 = var19 + ~var20 + 1;
         char[] var14 = var0.toCharArray();
         char[] var15 = new char[var14.length];
         var10000 = (int)-4708801485892338399L;
         var20 = 720879247;
         var19 = var10000;
         var10000 = var19 + var20 - 2 * (var19 & var20);
         var20 = 427393966;
         var19 = var10000;

         for (int var16 = var19 & ~var20 | ~var19 & var20; var16 < var15.length; var16++) {
            var20 = 1661132387;
            var19 = -180033596;
            var10001 = var19 & ~var20 | ~var19 & var20;
            var20 = -1773782619;
            var19 = var10001;
            switch (var16 % (var19 + var20 - 2 * (var19 & var20))) {
               case 0:
                  var20 = var12;
                  var19 = var13;
                  var10002 = (var19 | var20) & (~var19 | ~var20);
                  char var298 = var14[var16];
                  var19 = var10002;
                  var15[var16] = (char)(var19 + var298 - 2 * (var19 & var298));
                  break;
               case 1:
                  var20 = var13;
                  var19 = var5;
                  var10002 = var19 & ~var20 | ~var19 & var20;
                  char var296 = var14[var16];
                  var19 = var10002;
                  var15[var16] = (char)(var19 + var296 - 2 * (var19 & var296));
            }
         }

         return new String(var15);
      }
   }

   public static class NotificationSettingsState {
      private boolean c;
      private boolean d;
      private boolean e;
      private boolean f;
      private boolean g;
      public static int a;
      public static boolean b;

      public NotificationSettingsState() {
         int var2 = -47154254;
         int var1 = 58498771;
         int var10001 = (var1 | var2) - (var1 & var2);
         var2 = -28514976;
         var1 = var10001;
         this.c = pulse.Bool.from(var1 + var2 - 2 * (var1 & var2));
         var10001 = (int)5891188555401124359L;
         var2 = 1780325843;
         var1 = var10001;
         var10001 = (var1 | var2) & (~var1 | ~var2);
         var2 = 1469728725;
         var1 = var10001;
         this.d = pulse.Bool.from((var1 | var2) - (var1 & var2));
         var2 = 1231419002;
         var1 = -2124622014;
         var10001 = var1 & ~var2 | ~var1 & var2;
         var2 = -935780039;
         var1 = var10001;
         this.e = pulse.Bool.from((var1 | var2) & (~var1 | ~var2));
         var10001 = (int)-4570446668414693406L;
         var2 = 565285459;
         var1 = var10001;
         var10001 = (var1 | var2) & (~var1 | ~var2);
         var2 = 1240980912;
         var1 = var10001;
         this.f = pulse.Bool.from((var1 | var2) & ~(var1 & var2));
         var10001 = (int)-5235042938214863394L;
         var2 = -2051620694;
         var1 = var10001;
         var10001 = (var1 | var2) & ~(var1 & var2);
         var2 = -1501565579;
         var1 = var10001;
         this.g = pulse.Bool.from(var1 & ~var2 | ~var1 & var2);
      }

      public boolean a() {
         return this.c;
      }

      public void a(boolean var1) {
         this.c = var1;
      }

      public boolean b() {
         return this.d;
      }

      public void b(boolean var1) {
         this.d = var1;
      }

      public boolean c() {
         return this.e;
      }

      public void c(boolean var1) {
         this.e = var1;
      }

      public boolean d() {
         return this.f;
      }

      public void d(boolean var1) {
         this.f = var1;
      }

      public boolean e() {
         return this.g;
      }

      public void e(boolean var1) {
         this.g = var1;
      }

      public static String a(String var0, String var1, int var2, int var3, int var4, int var5) {
         char[] var6 = var1.toCharArray();
         char[] var7 = new char[var6.length];
         int var18 = 1912455815;
         int var17 = 1219311391;
         int var10000 = (var17 | var18) - (var17 & var18);
         var18 = 961607058;
         var17 = var10000;
         char[] var235 = new char[var17 + var18 - 2 * (var17 & var18)];
         var18 = 1918416128;
         var17 = -2134412785;
         int var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = -224409841;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = -1328874815;
         var17 = -966018729;
         int var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = 1990265764;
         var17 = var10003;
         var235[var10002] = (char)((var17 | var18) & ~(var17 & var18));
         var10002 = (int)-6707221384459820671L;
         var18 = -925166850;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = 629502846;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = 1761839026;
         var17 = -654449693;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = -1308735532;
         var17 = var10003;
         var235[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var10002 = (int)-3439086848137166977L;
         var18 = -84662077;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = 1810159550;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = 1877312073;
         var17 = -1629821656;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = -247511833;
         var17 = var10003;
         var235[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var10002 = (int)8930539268626463727L;
         var18 = -615028543;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = -864070867;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var10003 = (int)3605725184288426831L;
         var18 = 1355107134;
         var17 = var10003;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = 1407658038;
         var17 = var10003;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = -121496022;
         var17 = -204151582;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = 186016475;
         var17 = var10003;
         var235[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         var10002 = (int)-987667170257770608L;
         var18 = -1162500437;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = -1295138497;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var10003 = (int)-8591260158726049590L;
         var18 = -110581214;
         var17 = var10003;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = -165143866;
         var17 = var10003;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = -698457833;
         var17 = 1539404177;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = -1918926429;
         var17 = var10003;
         var235[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         var10002 = (int)-2215670121981024834L;
         var18 = 43963373;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = 1564554838;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var10003 = (int)-8571510304986866349L;
         var18 = 1147494356;
         var17 = var10003;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = -556972283;
         var17 = var10003;
         var235[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         var18 = -1004123096;
         var17 = 836162925;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = -168781501;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var10003 = (int)6597182800153126073L;
         var18 = -833869460;
         var17 = var10003;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = 1732084934;
         var17 = var10003;
         var235[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var10002 = (int)7517690527744103164L;
         var18 = -1107017240;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = -477768941;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = 1907808464;
         var17 = 1292059913;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = 1018538491;
         var17 = var10003;
         var235[var10002] = (char)((var17 | var18) - (var17 & var18));
         var18 = -242403296;
         var17 = 2050409875;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = -1950614085;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var10003 = (int)-5446139772111271375L;
         var18 = 1306983633;
         var17 = var10003;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = 600358579;
         var17 = var10003;
         var235[var10002] = (char)((var17 | var18) - (var17 & var18));
         var10002 = (int)3971712111484063846L;
         var18 = 1165847469;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = 375569346;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var10003 = (int)5888014665021028595L;
         var18 = 1392165709;
         var17 = var10003;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = 505724058;
         var17 = var10003;
         var235[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         char[] var8 = var235;
         var18 = -1581433053;
         var17 = 1972847740;
         var10000 = var17 & ~var18 | ~var17 & var18;
         var18 = -735413419;
         var17 = var10000;
         char[] var237 = new char[(var17 | var18) - (var17 & var18)];
         var10002 = (int)527850798301206687L;
         var18 = -276727653;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = -257482748;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var10003 = (int)5320226399966315241L;
         var18 = -1596905511;
         var17 = var10003;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = -1233867504;
         var17 = var10003;
         var237[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var10002 = (int)5607669418112416367L;
         var18 = -844396930;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = -909968368;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         String var321 = "cvl";
         var10003 = (int)-7218956108008943922L;
         var18 = 201080392;
         var17 = var10003;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = -687786875;
         var17 = var10003;
         var237[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var18 = -1451716625;
         var17 = -1193536434;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = 296000419;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         String var324 = "cvm";
         var10003 = (int)5101158889257727989L;
         var18 = 2104467157;
         var17 = var10003;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = -328765837;
         var17 = var10003;
         var237[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var10002 = (int)5547216299773767703L;
         var18 = -688748901;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = 1186412175;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = -1735950807;
         var17 = -1313181744;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = 691874299;
         var17 = var10003;
         var237[var10002] = (char)((var17 | var18) & ~(var17 & var18));
         var18 = -906877449;
         var17 = 505418896;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = -674090653;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var10003 = (int)-7876016962414998123L;
         var18 = -1859523845;
         var17 = var10003;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = -1486594258;
         var17 = var10003;
         var237[var10002] = (char)((var17 | var18) - (var17 & var18));
         var18 = 244467210;
         var17 = -965229053;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = -924483572;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var10003 = (int)-8656694736760765513L;
         var18 = 1769191857;
         var17 = var10003;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = -284032366;
         var17 = var10003;
         var237[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var10002 = (int)2677830180316767731L;
         var18 = 381385486;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = 1814208251;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var10003 = (int)4233210012839631411L;
         var18 = 664257653;
         var17 = var10003;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = 1751401391;
         var17 = var10003;
         var10003 = (var17 + var18 - 2 * (var17 & var18)) * (var17 + var18 - 2 * (var17 & var18));
         var10003 = (int)-6150087905365551157L;
         var18 = -1180698158;
         var17 = var10003;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = -824317664;
         var17 = var10003;
         var237[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var18 = -841100243;
         var17 = 817808239;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = -43837627;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = 1894089856;
         var17 = 122137396;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = 2007121804;
         var17 = var10003;
         var237[var10002] = (char)((var17 | var18) & ~(var17 & var18));
         var10002 = (int)4047678212193567255L;
         var18 = 1290432508;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = 1040756195;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var10003 = (int)5941500505522802775L;
         var18 = 1135162810;
         var17 = var10003;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = 244024299;
         var17 = var10003;
         var10003 = ((var17 | var18) & (~var17 | ~var18)) * ((var17 | var18) & (~var17 | ~var18));
         var10003 = (int)-2675250958643529443L;
         var18 = -827136519;
         var17 = var10003;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = -1816846368;
         var17 = var10003;
         var237[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var10002 = (int)-8009581050962129087L;
         var18 = -766888795;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = 1408891885;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = -2034758551;
         var17 = -2134833050;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = 108607292;
         var17 = var10003;
         var237[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         char[] var9 = var237;
         var18 = 1633119712;
         var17 = -1458382858;
         var10000 = (var17 | var18) & (~var17 | ~var18);
         var18 = -934954474;
         var17 = var10000;

         for (int var10 = var17 & ~var18 | ~var17 & var18; var10 < var6.length; var10++) {
            char var296 = var6[var10];
            char var221 = var8[var10 % var8.length];
            char var114 = var296;
            var7[var10] = (char)(var114 & ~var221 | ~var114 & var221);
         }

         char[] var19 = new char[var7.length];
         var18 = -1701823930;
         var17 = 421668479;
         var10000 = (var17 | var18) - (var17 & var18);
         var18 = -2085479367;
         var17 = var10000;

         for (int var11 = (var17 | var18) - (var17 & var18); var11 < var6.length; var11++) {
            char var297 = var7[var11];
            char var224 = var9[var11 % var9.length];
            char var117 = var297;
            var19[var11] = (char)(var117 & ~var224 | ~var117 & var224);
         }

         String var20 = new String(var19);
         int var12 = var20.hashCode();
         var18 = var5;
         var17 = var3;
         var10000 = (var17 & ~var18) - (~var17 & var18);
         var18 = var2;
         var17 = var10000;
         int var13 = (var17 ^ var18) - 2 * (~var17 & var18);
         char[] var14 = var0.toCharArray();
         char[] var15 = new char[var14.length];
         var10000 = (int)-2425748413166956428L;
         var18 = -1404845561;
         var17 = var10000;
         var10000 = (var17 | var18) - (var17 & var18);
         var18 = 854889075;
         var17 = var10000;

         for (int var16 = var17 & ~var18 | ~var17 & var18; var16 < var15.length; var16++) {
            int var10001 = (int)-3540387523734771101L;
            var18 = -106708373;
            var17 = var10001;
            var10001 = (var17 | var18) - (var17 & var18);
            var18 = -382490614;
            var17 = var10001;
            switch (var16 % (var17 + var18 - 2 * (var17 & var18))) {
               case 0:
                  var18 = var12;
                  var17 = var13;
                  var10002 = var17 & ~var18 | ~var17 & var18;
                  char var234 = var14[var16];
                  var17 = var10002;
                  var15[var16] = (char)((var17 | var234) - (var17 & var234));
                  break;
               case 1:
                  var18 = var13;
                  var17 = var5;
                  var10002 = var17 & ~var18 | ~var17 & var18;
                  char var232 = var14[var16];
                  var17 = var10002;
                  var15[var16] = (char)((var17 | var232) & ~(var17 & var232));
            }
         }

         return new String(var15);
      }
   }
}
