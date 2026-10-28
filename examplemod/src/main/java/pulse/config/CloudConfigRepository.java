package pulse;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;
import net.minecraft.client.MinecraftClient;
import org.json.JSONArray;
import org.json.JSONObject;

public class CloudConfigRepository {
   private static int a;
   private static int b;
   private static int c;
   private static int d;
   private static int e;
   private static int f;
   private static int g;
   private final AccountServiceClient h;
   private final Map<String, CloudConfigRepository.RemoteConfigRecord> i = new ConcurrentHashMap<>();
   private final List<CloudConfigRepository.SharedConfigRecord> j = new ArrayList<>();
   private volatile ConfigState k;
   private volatile String l;
   private volatile int m;
   private volatile boolean n;
   private volatile boolean o;
   private volatile Runnable p;

   public CloudConfigRepository(AccountServiceClient var1) {
      this.h = var1;
   }

   public void a(JSONObject var1) {
   }

   public void a(ConfigState var1, Runnable var2, Consumer<String> var3) {
   }

   public void a(String var1, Runnable var2, Consumer<String> var3) {
   }

   public void a(ConfigState var1, String var2, Runnable var3, Consumer<String> var4) {
   }

   public void b(String var1, Runnable var2, Consumer<String> var3) {
   }

   public void a(String var1, String var2, Runnable var3, Consumer<String> var4) {
   }

   public void c(String var1, Runnable var2, Consumer<String> var3) {
   }

   public void a(String var1, int var2, Integer var3, Integer var4, Consumer<String> var5, Consumer<String> var6) {
   }

   public void d(String var1, Runnable var2, Consumer<String> var3) {
   }

   public List<CloudConfigRepository.SharedConfigRecord> a() {
      return Collections.emptyList();
   }

   public void a(int var1, Consumer<ConfigState> var2, Consumer<String> var3) {
   }

   public void a(Runnable var1) {
   }

   public void a(JSONArray var1) {
   }

   public ConfigState b() {
      return null;
   }

   public String c() {
      return "";
   }

   public int d() {
      return 0;
   }

   public List<String> e() {
      return Collections.emptyList();
   }

   public CloudConfigRepository.RemoteConfigRecord a(String var1) {
      return null;
   }

   public Collection<CloudConfigRepository.RemoteConfigRecord> f() {
      try {
         Field var1 = CloudConfigRepository.class.getDeclaredField("i");
         var1.setAccessible(true);
         Map var2 = (Map)var1.get(this);
         return new ArrayList<>(var2.values());
      } catch (Throwable var4) {
         return Collections.emptyList();
      }
   }

   public boolean g() {
      return false;
   }

   public void h() {
   }

   public boolean i() {
      return false;
   }

   public void a(ConfigState var1) {
   }

   public boolean b(ConfigState var1) {
      return false;
   }

   public void a(int var1) {
   }

   private boolean j() {
      int var9;
      if (this.h.a() && this.h.s() != null && this.h.q() != null) {
         int var7 = 660583142;
         int var4 = 1867843339;
         var9 = (var4 | var7) - (var4 & var7);
         var7 = 1208661484;
         var4 = var9;
         var9 = var4 & ~var7 | ~var4 & var7;
      } else {
         int var2 = -1974716871;
         int var1 = -624773622;
         var9 = (var1 | var2) - (var1 & var2);
         var2 = 1351516211;
         var1 = var9;
         var9 = var1 & ~var2 | ~var1 & var2;
      }

      return pulse.Bool.from(var9);
   }

   private void b(Runnable var1) {
      MinecraftClient.getInstance().execute(var1);
   }

   static {
      int var10000 = (int)7552274771070095547L;
      int var1 = 1633722344;
      int var0 = var10000;
      var10000 = (var0 | var1) & (~var0 | ~var1);
      var1 = -1633185979;
      var0 = var10000;
      a = (var0 | var1) & (~var0 | ~var1);
      var10000 = (int)-552841569332889075L;
      var1 = 827826059;
      var0 = var10000;
      var10000 = var0 & ~var1 | ~var0 & var1;
      var1 = -1551866479;
      var0 = var10000;
      b = var0 & ~var1 | ~var0 & var1;
      var10000 = (int)-6006777591422394886L;
      var1 = -113067054;
      var0 = var10000;
      var10000 = (var0 | var1) & ~(var0 & var1);
      var1 = -482384336;
      var0 = var10000;
      c = (var0 | var1) & ~(var0 & var1);
      var10000 = (int)8071960846320544726L;
      var1 = -773799146;
      var0 = var10000;
      var10000 = (var0 | var1) & (~var0 | ~var1);
      var1 = -1272125223;
      var0 = var10000;
      d = var0 + var1 - 2 * (var0 & var1);
      var10000 = (int)-612746348845838701L;
      var1 = 1611094715;
      var0 = var10000;
      var10000 = var0 & ~var1 | ~var0 & var1;
      var1 = 1403458610;
      var0 = var10000;
      e = (var0 | var1) & (~var0 | ~var1);
      var1 = -1658115379;
      var0 = 218189589;
      var10000 = var0 & ~var1 | ~var0 & var1;
      var1 = -1876269629;
      var0 = var10000;
      f = (var0 | var1) - (var0 & var1);
      var1 = 879363011;
      var0 = 918370557;
      var10000 = var0 & ~var1 | ~var0 & var1;
      var1 = 47659810;
      var0 = var10000;
      g = var0 & ~var1 | ~var0 & var1;
   }

   public static String a(String var0, String var1, int var2, int var3, int var4, int var5) {
      char[] var6 = var1.toCharArray();
      char[] var7 = new char[var6.length];
      int var10000 = (int)-5959319748706548234L;
      int var18 = -1148356317;
      int var17 = var10000;
      var10000 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1863500577;
      var17 = var10000;
      char[] var220 = new char[var17 & ~var18 | ~var17 & var18];
      var18 = -2060453968;
      var17 = 1294196421;
      int var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -938727051;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 951276009;
      var17 = -1200847336;
      int var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -2132828221;
      var17 = var10003;
      var220[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var18 = -667272447;
      var17 = -155809439;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 780972641;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1108812422;
      var17 = 140321358;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -1246372687;
      var17 = var10003;
      var220[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var18 = 800423864;
      var17 = -473419919;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -864202549;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)-1036439159732603373L;
      var18 = 1254730448;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 505216837;
      var17 = var10003;
      var220[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var18 = -172042132;
      var17 = -1761544550;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1656631029;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var10003 = (int)809516206736351800L;
      var18 = 787663192;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1485009779;
      var17 = var10003;
      var220[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var10002 = (int)-9071237477833275152L;
      var18 = -614882165;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -1747964801;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -604092239;
      var17 = -712188622;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 242353318;
      var17 = var10003;
      var220[var10002] = (char)((var17 | var18) - (var17 & var18));
      var18 = -1877907269;
      var17 = 1247540482;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -632644164;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 2063637443;
      var17 = 177669003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 1905778122;
      var17 = var10003;
      var220[var10002] = (char)((var17 | var18) - (var17 & var18));
      var18 = 233867307;
      var17 = 810454695;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1035863690;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var10003 = (int)-6645228131477627849L;
      var18 = -2082906854;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1745782846;
      var17 = var10003;
      var220[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var10002 = (int)-1804593769835991214L;
      var18 = 246831270;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 129808371;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)3970523338429911586L;
      var18 = -1438668801;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 767345151;
      var17 = var10003;
      var220[var10002] = (char)((var17 | var18) - (var17 & var18));
      var10002 = (int)-37796203697151341L;
      var18 = 2057036163;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -362937576;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)-6010595016062602540L;
      var18 = -456700039;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 1310569982;
      var17 = var10003;
      var220[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var18 = 1832663397;
      var17 = 56391956;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 1851801720;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)-5557870259122964008L;
      var18 = -1108034409;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -2068790677;
      var17 = var10003;
      var220[var10002] = (char)((var17 | var18) - (var17 & var18));
      char[] var8 = var220;
      var10000 = (int)-1746098661365403363L;
      var18 = 1059513095;
      var17 = var10000;
      var10000 = (var17 | var18) & (~var17 | ~var18);
      var18 = -173977072;
      var17 = var10000;
      char[] var223 = new char[var17 + var18 - 2 * (var17 & var18)];
      var10002 = (int)57262123889358928L;
      var18 = 2013118198;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1585432230;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1830559075;
      var17 = -261762949;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 1652980422;
      var17 = var10003;
      var223[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var10002 = (int)5984751915942944583L;
      var18 = 1315944026;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -51271396;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -235861807;
      var17 = -521426108;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 286926742;
      var17 = var10003;
      var223[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var10002 = (int)8873935963483141724L;
      var18 = 1350083997;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 1317098435;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -652381403;
      var17 = 857664282;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -368894100;
      var17 = var10003;
      var223[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var18 = 1646794931;
      var17 = -302958212;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1881595444;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)-3155626286221845948L;
      var18 = -532513738;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1168039536;
      var17 = var10003;
      var223[var10002] = (char)((var17 | var18) - (var17 & var18));
      var18 = 973207959;
      var17 = 810159751;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 172750612;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var10003 = (int)7107117666785648987L;
      var18 = 1116131076;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1557162465;
      var17 = var10003;
      var223[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var10002 = (int)-4183587776085003906L;
      var18 = 1785692128;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 631639707;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 15094883;
      var17 = -371571155;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -381932838;
      var17 = var10003;
      var223[var10002] = (char)((var17 | var18) - (var17 & var18));
      var10002 = (int)3117603738394026035L;
      var18 = -1999215810;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -1716419829;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)6610650060363084154L;
      var18 = 969795113;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1080668054;
      var17 = var10003;
      var223[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var18 = -1174641637;
      var17 = 567160242;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -1741534802;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -1122954900;
      var17 = -234297268;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 1327098136;
      var17 = var10003;
      var223[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var10002 = (int)-971219983396942099L;
      var18 = 1594122322;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 2111385271;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 215022093;
      var17 = -531286306;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -326807593;
      var17 = var10003;
      var223[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var10002 = (int)7710041705449460126L;
      var18 = -530790562;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 10475209;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)5627239161140144976L;
      var18 = -1017409128;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 582437371;
      var17 = var10003;
      var223[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      char[] var9 = var223;
      var10000 = (int)-1717780432518274744L;
      var18 = -1266086404;
      var17 = var10000;
      var10000 = (var17 | var18) & ~(var17 & var18);
      var18 = -1993823052;
      var17 = var10000;

      for (int var10 = (var17 | var18) & (~var17 | ~var18); var10 < var6.length; var10++) {
         char var281 = var6[var10];
         char var205 = var8[var10 % var8.length];
         char var106 = var281;
         var7[var10] = (char)((var106 | var205) & (~var106 | ~var205));
      }

      char[] var19 = new char[var7.length];
      var10000 = (int)7656635621640594900L;
      var18 = -660898174;
      var17 = var10000;
      var10000 = (var17 | var18) - (var17 & var18);
      var18 = -622453930;
      var17 = var10000;

      for (int var11 = (var17 | var18) & ~(var17 & var18); var11 < var6.length; var11++) {
         char var282 = var7[var11];
         char var208 = var9[var11 % var9.length];
         char var109 = var282;
         var19[var11] = (char)(var109 + var208 - 2 * (var109 & var208));
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
      var10000 = (int)945732882820743491L;
      var18 = -420858227;
      var17 = var10000;
      var10000 = var17 & ~var18 | ~var17 & var18;
      var18 = 839251918;
      var17 = var10000;

      for (int var16 = (var17 | var18) & (~var17 | ~var18); var16 < var15.length; var16++) {
         int var10001 = (int)-810118225380511565L;
         var18 = -1682603000;
         var17 = var10001;
         var10001 = var17 & ~var18 | ~var17 & var18;
         var18 = -1112902471;
         var17 = var10001;
         switch (var16 % ((var17 | var18) & ~(var17 & var18))) {
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
               var10002 = (var17 | var18) & (~var17 | ~var18);
               char var216 = var14[var16];
               var17 = var10002;
               var15[var16] = (char)((var17 | var216) & ~(var17 & var216));
         }
      }

      return new String(var15);
   }

   public static class RemoteConfigRecord {
      public int a;
      public String b;
      public String c;
      public boolean d;
      public int e;
      public long f;
      public long g;

      public static CloudConfigRepository.RemoteConfigRecord a(JSONObject var0) {
         CloudConfigRepository.RemoteConfigRecord var1 = new CloudConfigRepository.RemoteConfigRecord();
         int var10004 = (int)4919529320149867096L;
         int var3 = -1101009724;
         int var2 = var10004;
         var10004 = (var2 | var3) & (~var2 | ~var3);
         var3 = 20324692;
         var2 = var10004;
         var10004 = var2 + var3 - 2 * (var2 & var3);
         var3 = -597813267;
         var2 = -1563866093;
         int var10005 = (var2 | var3) & ~(var2 & var3);
         var3 = 511408211;
         var2 = var10005;
         var10005 = (var2 | var3) & (~var2 | ~var3);
         int var10006 = (int)-5071132429573983082L;
         var3 = -67784316;
         var2 = var10006;
         var10006 = (var2 | var3) - (var2 & var3);
         var3 = -1574171684;
         var2 = var10006;
         var10006 = var2 & ~var3 | ~var2 & var3;
         var3 = 435665519;
         var2 = 1582042535;
         int var10007 = var2 & ~var3 | ~var2 & var3;
         var3 = 1206571003;
         var2 = var10007;
         String var10002 = a(
            "иђ“\uebe5", "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘ґ}\ua7e8к’ікЃёк¤‚зґ№и№‰в‘¶и¬ёг‘ўvкћ©к’–кЃЅк¤ЉзµЈи№Ћ\u2459и¬ёг‘№t\ua7efк’ІкЃ‚к¤Ђзµ¤и№њв‘іи¬ґг‘І6кџ…к’єкЃїк¤ѓзµїи№Ќ\u2457и¬Іг‘Јs", var10004, var10005, var10006, var2 + var3 - 2 * (var2 & var3)
         );
         int var10003 = (int)5838699354022431384L;
         var3 = 901565398;
         var2 = var10003;
         var10003 = (var2 | var3) - (var2 & var3);
         var3 = -2022473394;
         var2 = var10003;
         var1.a = var0.optInt(var10002, (var2 | var3) - (var2 & var3));
         var3 = -1790297830;
         var2 = -1296837869;
         var10004 = (var2 | var3) & ~(var2 & var3);
         var3 = -1925775935;
         var2 = var10004;
         var10004 = (var2 | var3) & ~(var2 & var3);
         var3 = -15133978;
         var2 = 957842427;
         var10005 = var2 + var3 - 2 * (var2 & var3);
         var3 = -1498101009;
         var2 = var10005;
         var10005 = (var2 | var3) & ~(var2 & var3);
         var10006 = (int)-5231027189345123135L;
         var3 = 1544590801;
         var2 = var10006;
         var10006 = (var2 | var3) - (var2 & var3);
         var3 = -851691141;
         var2 = var10006;
         var10006 = var2 + var3 - 2 * (var2 & var3);
         var10007 = (int)-8206584408713044643L;
         var3 = 1487277511;
         var2 = var10007;
         var10007 = var2 & ~var3 | ~var2 & var3;
         var3 = -1277173534;
         var2 = var10007;
         var10002 = a(
            "иђ”вЋ«иђ—вЋЇ", "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘ґ}\ua7e8к’ікЃёк¤‚зґ№и№‰в‘¶и¬ёг‘ўvкћ©к’–кЃЅк¤ЉзµЈи№Ћ\u2459и¬ёг‘№t\ua7efк’ІкЃ‚к¤Ђзµ¤и№њв‘іи¬ґг‘І6кџ…к’єкЃїк¤ѓзµїи№Ќ\u2457и¬Іг‘Јs", var10004, var10005, var10006, var2 & ~var3 | ~var2 & var3
         );
         var10005 = (int)-8631832039801482312L;
         var3 = -120994539;
         var2 = var10005;
         var10005 = var2 + var3 - 2 * (var2 & var3);
         var3 = 281723237;
         var2 = var10005;
         var10005 = (var2 | var3) & ~(var2 & var3);
         var3 = -972749827;
         var2 = -1405180212;
         var10006 = (var2 | var3) & ~(var2 & var3);
         var3 = 184379990;
         var2 = var10006;
         var10006 = var2 & ~var3 | ~var2 & var3;
         var3 = -2010073129;
         var2 = -1597722553;
         var10007 = (var2 | var3) & (~var2 | ~var3);
         var3 = 641056587;
         var2 = var10007;
         var10007 = (var2 | var3) - (var2 & var3);
         int var10008 = (int)-3217173569053756449L;
         var3 = -46402220;
         var2 = var10008;
         var10008 = var2 + var3 - 2 * (var2 & var3);
         var3 = -690903706;
         var2 = var10008;
         var1.b = var0.optString(
            var10002,
            a("", "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘ґ}\ua7e8к’ікЃёк¤‚зґ№и№‰в‘¶и¬ёг‘ўvкћ©к’–кЃЅк¤ЉзµЈи№Ћ\u2459и¬ёг‘№t\ua7efк’ІкЃ‚к¤Ђзµ¤и№њв‘іи¬ґг‘І6кџ…к’єкЃїк¤ѓзµїи№Ќ\u2457и¬Іг‘Јs", var10005, var10006, var10007, var2 + var3 - 2 * (var2 & var3))
         );
         var10004 = (int)-6946486325842325292L;
         var3 = -1067945381;
         var2 = var10004;
         var10004 = (var2 | var3) & (~var2 | ~var3);
         var3 = -174574265;
         var2 = var10004;
         var10004 = (var2 | var3) - (var2 & var3);
         var3 = -231429309;
         var2 = -325595084;
         var10005 = (var2 | var3) - (var2 & var3);
         var3 = 2114826025;
         var2 = var10005;
         var10005 = (var2 | var3) - (var2 & var3);
         var3 = -1896239447;
         var2 = 61960746;
         var10006 = var2 & ~var3 | ~var2 & var3;
         var3 = -1631816212;
         var2 = var10006;
         var10006 = (var2 | var3) - (var2 & var3);
         var10007 = (int)5464945499384462677L;
         var3 = -1922040592;
         var2 = var10007;
         var10007 = (var2 | var3) - (var2 & var3);
         var3 = -1428821695;
         var2 = var10007;
         var10002 = a(
            "иђ›л¬ЈиђЋл¬ѕиђ•л¬¤", "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘ґ}\ua7e8к’ікЃёк¤‚зґ№и№‰в‘¶и¬ёг‘ўvкћ©к’–кЃЅк¤ЉзµЈи№Ћ\u2459и¬ёг‘№t\ua7efк’ІкЃ‚к¤Ђзµ¤и№њв‘іи¬ґг‘І6кџ…к’єкЃїк¤ѓзµїи№Ќ\u2457и¬Іг‘Јs", var10004, var10005, var10006, var2 & ~var3 | ~var2 & var3
         );
         var10005 = (int)-7310686581684711542L;
         var3 = 65773403;
         var2 = var10005;
         var10005 = var2 & ~var3 | ~var2 & var3;
         var3 = 190007065;
         var2 = var10005;
         var10005 = var2 + var3 - 2 * (var2 & var3);
         var3 = -421252400;
         var2 = -685345953;
         var10006 = (var2 | var3) & ~(var2 & var3);
         var3 = 1359047659;
         var2 = var10006;
         var10006 = (var2 | var3) - (var2 & var3);
         var10007 = (int)4748971960101448212L;
         var3 = 707767327;
         var2 = var10007;
         var10007 = var2 & ~var3 | ~var2 & var3;
         var3 = 474513544;
         var2 = var10007;
         var10007 = (var2 | var3) - (var2 & var3);
         var10008 = (int)8722618723485566349L;
         var3 = 1975401990;
         var2 = var10008;
         var10008 = var2 & ~var3 | ~var2 & var3;
         var3 = -921631391;
         var2 = var10008;
         var1.c = var0.optString(
            var10002,
            a(
               "иђЇ\ued36иђ‘\ued36иђ•\ued2fиђ”",
               "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘ґ}\ua7e8к’ікЃёк¤‚зґ№и№‰в‘¶и¬ёг‘ўvкћ©к’–кЃЅк¤ЉзµЈи№Ћ\u2459и¬ёг‘№t\ua7efк’ІкЃ‚к¤Ђзµ¤и№њв‘іи¬ґг‘І6кџ…к’єкЃїк¤ѓзµїи№Ќ\u2457и¬Іг‘Јs",
               var10005,
               var10006,
               var10007,
               (var2 | var3) & ~(var2 & var3)
            )
         );
         var3 = -749269407;
         var2 = 358161259;
         var10004 = (var2 | var3) - (var2 & var3);
         var3 = 1824588482;
         var2 = var10004;
         var10004 = (var2 | var3) & (~var2 | ~var3);
         var10005 = (int)-718222666810578891L;
         var3 = 893533216;
         var2 = var10005;
         var10005 = (var2 | var3) & (~var2 | ~var3);
         var3 = 1726892938;
         var2 = var10005;
         var10005 = (var2 | var3) - (var2 & var3);
         var10006 = (int)3098034343443011568L;
         var3 = -818719863;
         var2 = var10006;
         var10006 = var2 & ~var3 | ~var2 & var3;
         var3 = -472749451;
         var2 = var10006;
         var10006 = var2 + var3 - 2 * (var2 & var3);
         var3 = -865176631;
         var2 = -1169173948;
         var10007 = var2 & ~var3 | ~var2 & var3;
         var3 = 1983452584;
         var2 = var10007;
         var10002 = a(
            "иђ“вџ¤иђ»вџґиђЋвџѕиђЊвџІ", "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘ґ}\ua7e8к’ікЃёк¤‚зґ№и№‰в‘¶и¬ёг‘ўvкћ©к’–кЃЅк¤ЉзµЈи№Ћ\u2459и¬ёг‘№t\ua7efк’ІкЃ‚к¤Ђзµ¤и№њв‘іи¬ґг‘І6кџ…к’єкЃїк¤ѓзµїи№Ќ\u2457и¬Іг‘Јs", var10004, var10005, var10006, var2 & ~var3 | ~var2 & var3
         );
         var10003 = (int)570417175034305666L;
         var3 = -597859974;
         var2 = var10003;
         var10003 = (var2 | var3) & ~(var2 & var3);
         var3 = -537985544;
         var2 = var10003;
         var1.d = var0.optBoolean(var10002, pulse.Bool.from(var2 & (var3 ^ -1) | (var2 ^ -1) & var3));
         var10004 = (int)-4170750072354163591L;
         var3 = 1607403336;
         var2 = var10004;
         var10004 = var2 + var3 - 2 * (var2 & var3);
         var3 = -681237255;
         var2 = var10004;
         var10004 = var2 + var3 - 2 * (var2 & var3);
         var3 = -364556308;
         var2 = -1255550042;
         var10005 = var2 + var3 - 2 * (var2 & var3);
         var3 = 1067963865;
         var2 = var10005;
         var10005 = (var2 | var3) & (~var2 | ~var3);
         var10006 = (int)-4151026459630118119L;
         var3 = -194780167;
         var2 = var10006;
         var10006 = (var2 | var3) - (var2 & var3);
         var3 = 1892252092;
         var2 = var10006;
         var10006 = (var2 | var3) & ~(var2 & var3);
         var3 = 1371165559;
         var2 = 1010407293;
         var10007 = var2 + var3 - 2 * (var2 & var3);
         var3 = 1840470547;
         var2 = var10007;
         var10002 = a(
            "иђЊ\u0dceиђ€а·иђ“а·„иђ”",
            "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘ґ}\ua7e8к’ікЃёк¤‚зґ№и№‰в‘¶и¬ёг‘ўvкћ©к’–кЃЅк¤ЉзµЈи№Ћ\u2459и¬ёг‘№t\ua7efк’ІкЃ‚к¤Ђзµ¤и№њв‘іи¬ґг‘І6кџ…к’єкЃїк¤ѓзµїи№Ќ\u2457и¬Іг‘Јs",
            var10004,
            var10005,
            var10006,
            (var2 | var3) & (~var2 | ~var3)
         );
         var3 = 924375492;
         var2 = -457518174;
         var10003 = (var2 | var3) - (var2 & var3);
         var3 = -744355225;
         var2 = var10003;
         var1.e = var0.optInt(var10002, var2 + var3 - 2 * (var2 & var3));
         var10004 = (int)-3308254429717671640L;
         var3 = 28571421;
         var2 = var10004;
         var10004 = var2 + var3 - 2 * (var2 & var3);
         var3 = 1768698365;
         var2 = var10004;
         var10004 = (var2 | var3) & (~var2 | ~var3);
         var10005 = (int)-6744202666611210099L;
         var3 = 318313396;
         var2 = var10005;
         var10005 = (var2 | var3) & ~(var2 & var3);
         var3 = 1096596025;
         var2 = var10005;
         var10005 = var2 + var3 - 2 * (var2 & var3);
         var3 = -1862734145;
         var2 = 1790824627;
         var10006 = (var2 | var3) & ~(var2 & var3);
         var3 = -429826282;
         var2 = var10006;
         var10006 = (var2 | var3) - (var2 & var3);
         var3 = -278769546;
         var2 = 1460272571;
         var10007 = (var2 | var3) & ~(var2 & var3);
         var3 = -1202792373;
         var2 = var10007;
         var1.f = var0.optLong(
            a(
               "иђЏ\ue644иђћ\ue655иђЋ\ue651иђћ\ue675иђЋ",
               "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘ґ}\ua7e8к’ікЃёк¤‚зґ№и№‰в‘¶и¬ёг‘ўvкћ©к’–кЃЅк¤ЉзµЈи№Ћ\u2459и¬ёг‘№t\ua7efк’ІкЃ‚к¤Ђзµ¤и№њв‘іи¬ґг‘І6кџ…к’єкЃїк¤ѓзµїи№Ќ\u2457и¬Іг‘Јs",
               var10004,
               var10005,
               var10006,
               (var2 | var3) - (var2 & var3)
            ),
            System.currentTimeMillis()
         );
         var10004 = (int)-5264437020757202390L;
         var3 = -1851320540;
         var2 = var10004;
         var10004 = (var2 | var3) - (var2 & var3);
         var3 = -1070470458;
         var2 = var10004;
         var10004 = (var2 | var3) & ~(var2 & var3);
         var10005 = (int)-6190275685628000102L;
         var3 = 816514702;
         var2 = var10005;
         var10005 = (var2 | var3) & ~(var2 & var3);
         var3 = -400936554;
         var2 = var10005;
         var10005 = (var2 | var3) & (~var2 | ~var3);
         var10006 = (int)-7823582334569362738L;
         var3 = -1415025937;
         var2 = var10006;
         var10006 = var2 & ~var3 | ~var2 & var3;
         var3 = -52177270;
         var2 = var10006;
         var10006 = var2 + var3 - 2 * (var2 & var3);
         var10007 = (int)4860584481356460740L;
         var3 = -1268500925;
         var2 = var10007;
         var10007 = (var2 | var3) & (~var2 | ~var3);
         var3 = -530624369;
         var2 = var10007;
         var1.g = var0.optLong(
            a(
               "иђ™мџ€иђџмџ›иђЋмџџиђћмџ»иђЋ",
               "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘ґ}\ua7e8к’ікЃёк¤‚зґ№и№‰в‘¶и¬ёг‘ўvкћ©к’–кЃЅк¤ЉзµЈи№Ћ\u2459и¬ёг‘№t\ua7efк’ІкЃ‚к¤Ђзµ¤и№њв‘іи¬ґг‘І6кџ…к’єкЃїк¤ѓзµїи№Ќ\u2457и¬Іг‘Јs",
               var10004,
               var10005,
               var10006,
               (var2 | var3) & (~var2 | ~var3)
            ),
            System.currentTimeMillis()
         );
         return var1;
      }

      public static String a(String var0, String var1, int var2, int var3, int var4, int var5) {
         char[] var6 = var1.toCharArray();
         char[] var7 = new char[var6.length];
         int var18 = 1628143881;
         int var17 = -1975260069;
         int var10000 = var17 + var18 - 2 * (var17 & var18);
         var18 = -347574952;
         var17 = var10000;
         char[] var219 = new char[(var17 | var18) & ~(var17 & var18)];
         var18 = -638885781;
         var17 = 604090387;
         int var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = -34942856;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         int var10003 = (int)2323545185639330362L;
         var18 = -1538721932;
         var17 = var10003;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = -2049880708;
         var17 = var10003;
         var219[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var10002 = (int)3306860623444898243L;
         var18 = 1367940490;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = 1067576392;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var10003 = (int)-5150706513548394249L;
         var18 = -1960409208;
         var17 = var10003;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = -1500584710;
         var17 = var10003;
         var219[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var10002 = (int)-4456228491546962697L;
         var18 = 1784549715;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = 1627407782;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var10003 = (int)-9005417265488117377L;
         var18 = 1977042758;
         var17 = var10003;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = -1044503105;
         var17 = var10003;
         var219[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var18 = 189424417;
         var17 = 1523692503;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = 1369166069;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = -8791308;
         var17 = -172858056;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = 181086175;
         var17 = var10003;
         var219[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var18 = -992758061;
         var17 = -918823447;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = 233335614;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var10003 = (int)-6456128153748173735L;
         var18 = 2040109435;
         var17 = var10003;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = 182977543;
         var17 = var10003;
         var219[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var18 = 1874167372;
         var17 = -1759774124;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = -122782691;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = -50928853;
         var17 = -876729183;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = 927500808;
         var17 = var10003;
         var219[var10002] = (char)((var17 | var18) - (var17 & var18));
         var10002 = (int)6614541434819665559L;
         var18 = -1706778690;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = 616808751;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var10003 = (int)-2786172308543249579L;
         var18 = -1608927422;
         var17 = var10003;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = -1306108668;
         var17 = var10003;
         var219[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var10002 = (int)-3076215788868037539L;
         var18 = -1355342652;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = 1931839646;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var10003 = (int)5023845417986809999L;
         var18 = 2060629104;
         var17 = var10003;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = 859922653;
         var17 = var10003;
         var219[var10002] = (char)((var17 | var18) - (var17 & var18));
         var10002 = (int)6285369970071766709L;
         var18 = 436310869;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = -1509386776;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var10003 = (int)2311826981661145518L;
         var18 = -1415078411;
         var17 = var10003;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = -2085295096;
         var17 = var10003;
         var219[var10002] = (char)((var17 | var18) - (var17 & var18));
         var10002 = (int)-1190793286231247206L;
         var18 = -1011636944;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = 1995936675;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var10003 = (int)-2964205690171856934L;
         var18 = 339498381;
         var17 = var10003;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = 673265011;
         var17 = var10003;
         var219[var10002] = (char)((var17 | var18) & ~(var17 & var18));
         char[] var8 = var219;
         var10000 = (int)-6006377090932678607L;
         var18 = -1643505731;
         var17 = var10000;
         var10000 = var17 + var18 - 2 * (var17 & var18);
         var18 = 2112092038;
         var17 = var10000;
         char[] var222 = new char[var17 & ~var18 | ~var17 & var18];
         var10002 = (int)-3739783093497661641L;
         var18 = -1092032919;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = -1981312674;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = 1671780474;
         var17 = -27679902;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = -1644383432;
         var17 = var10003;
         var222[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         var18 = 668240961;
         var17 = -1897579374;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = -1456361262;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var10003 = (int)-8572341793223901098L;
         var18 = -1898046532;
         var17 = var10003;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = 662249449;
         var17 = var10003;
         var222[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         var18 = -527958918;
         var17 = -1653186066;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = 2112986518;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var10003 = (int)-7013065828994058713L;
         var18 = -1401129935;
         var17 = var10003;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = -1608776379;
         var17 = var10003;
         var222[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var18 = 89454196;
         var17 = -814841567;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = -902138026;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var10003 = (int)-3461313568845289081L;
         var18 = -1321364724;
         var17 = var10003;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = 1367409289;
         var17 = var10003;
         var222[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         var18 = -709035097;
         var17 = 599389864;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = -167441141;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var10003 = (int)511542335116976259L;
         var18 = 678643380;
         var17 = var10003;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = 206298743;
         var17 = var10003;
         var222[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var18 = -1645738387;
         var17 = 2063569690;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = -417884814;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = 981767494;
         var17 = 19313294;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = 1000480604;
         var17 = var10003;
         var222[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var18 = 1458594225;
         var17 = -170424814;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = -1557665883;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = -37438868;
         var17 = 192892022;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = -155487965;
         var17 = var10003;
         var222[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var10002 = (int)4823324301189394254L;
         var18 = -1079713656;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = 658755521;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = -1039088585;
         var17 = -2121671352;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = 1134102855;
         var17 = var10003;
         var222[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         var18 = 1757115730;
         var17 = 1741849976;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = 258600994;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = -1525181265;
         var17 = 1409727427;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = -250499992;
         var17 = var10003;
         var222[var10002] = (char)((var17 | var18) - (var17 & var18));
         var18 = 407071226;
         var17 = -1518225967;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = -1111303134;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = -2011577518;
         var17 = 1239057434;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = -1044155269;
         var17 = var10003;
         var222[var10002] = (char)((var17 | var18) & ~(var17 & var18));
         char[] var9 = var222;
         var10000 = (int)8828659359768176006L;
         var18 = -1831586204;
         var17 = var10000;
         var10000 = var17 & ~var18 | ~var17 & var18;
         var18 = -952314910;
         var17 = var10000;

         for (int var10 = var17 + var18 - 2 * (var17 & var18); var10 < var6.length; var10++) {
            char var277 = var6[var10];
            char var205 = var8[var10 % var8.length];
            char var106 = var277;
            var7[var10] = (char)((var106 | var205) & (~var106 | ~var205));
         }

         char[] var19 = new char[var7.length];
         var18 = -1646375555;
         var17 = -1713088397;
         var10000 = (var17 | var18) & (~var17 | ~var18);
         var18 = 70915342;
         var17 = var10000;

         for (int var11 = var17 & ~var18 | ~var17 & var18; var11 < var6.length; var11++) {
            char var278 = var7[var11];
            char var208 = var9[var11 % var9.length];
            char var109 = var278;
            var19[var11] = (char)((var109 | var208) & (~var109 | ~var208));
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
         var10000 = (int)-3278887727623059909L;
         var18 = 208659014;
         var17 = var10000;
         var10000 = (var17 | var18) & ~(var17 & var18);
         var18 = -456383363;
         var17 = var10000;

         for (int var16 = (var17 | var18) & (~var17 | ~var18); var16 < var15.length; var16++) {
            int var10001 = (int)-6168388175986550880L;
            var18 = 2069017776;
            var17 = var10001;
            var10001 = var17 + var18 - 2 * (var17 & var18);
            var18 = -691494126;
            var17 = var10001;
            switch (var16 % (var17 & ~var18 | ~var17 & var18)) {
               case 0:
                  var18 = var12;
                  var17 = var13;
                  var10002 = (var17 | var18) - (var17 & var18);
                  char var218 = var14[var16];
                  var17 = var10002;
                  var15[var16] = (char)(var17 + var218 - 2 * (var17 & var218));
                  break;
               case 1:
                  var18 = var13;
                  var17 = var5;
                  var10002 = var17 + var18 - 2 * (var17 & var18);
                  char var216 = var14[var16];
                  var17 = var10002;
                  var15[var16] = (char)((var17 | var216) & (~var17 | ~var216));
            }
         }

         return new String(var15);
      }
   }

   public static class SharedConfigRecord {
      public int a;
      public String b;
      public String c;
      public String d;
      public String e;
      public int f;
      public long g;

      public static CloudConfigRepository.SharedConfigRecord a(JSONObject var0) {
         CloudConfigRepository.SharedConfigRecord var1 = new CloudConfigRepository.SharedConfigRecord();
         int var10004 = (int)1836113649364211749L;
         int var3 = -515365982;
         int var2 = var10004;
         var10004 = (var2 | var3) & ~(var2 & var3);
         var3 = 1803554842;
         var2 = var10004;
         var10004 = (var2 | var3) & ~(var2 & var3);
         int var10005 = (int)-3395742106732972307L;
         var3 = 1948099165;
         var2 = var10005;
         var10005 = (var2 | var3) - (var2 & var3);
         var3 = 307927036;
         var2 = var10005;
         var10005 = (var2 | var3) & ~(var2 & var3);
         var3 = 1449834611;
         var2 = 2040421054;
         int var10006 = var2 & ~var3 | ~var2 & var3;
         var3 = 799466988;
         var2 = var10006;
         var10006 = var2 & ~var3 | ~var2 & var3;
         int var10007 = (int)-3627254076423305486L;
         var3 = 1958261375;
         var2 = var10007;
         var10007 = (var2 | var3) & ~(var2 & var3);
         var3 = -1005914256;
         var2 = var10007;
         String var10002 = a(
            "гЎ†еЂ«",
            "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘ґ}\ua7e8к’ікЃёк¤‚зґ№и№‰в‘¶и¬ёг‘ўvкћ©к’–кЃЅк¤ЉзµЈи№Ћ\u2459и¬ёг‘№t\ua7efк’ІкЃ‚к¤Ђзµ¤и№њв‘іи¬ґг‘І6кџ–к’§кЃґк¤€зµїи№џв‘·и¬”г‘ё|\ua7e0к’јкЃ¶к¤Ёзµіи№ћв‘»",
            var10004,
            var10005,
            var10006,
            (var2 | var3) & (~var2 | ~var3)
         );
         int var10003 = (int)7085386765466857064L;
         var3 = 2085173156;
         var2 = var10003;
         var10003 = (var2 | var3) & (~var2 | ~var3);
         var3 = 1605294540;
         var2 = var10003;
         var1.a = var0.optInt(var10002, var2 & ~var3 | ~var2 & var3);
         var3 = -678012313;
         var2 = 1113214512;
         var10004 = (var2 | var3) & ~(var2 & var3);
         var3 = -761413686;
         var2 = var10004;
         var10004 = var2 & ~var3 | ~var2 & var3;
         var10005 = (int)3347857056684336827L;
         var3 = 1943351062;
         var2 = var10005;
         var10005 = (var2 | var3) & (~var2 | ~var3);
         var3 = -791947541;
         var2 = var10005;
         var10005 = var2 + var3 - 2 * (var2 & var3);
         var3 = -1850953521;
         var2 = 1515006418;
         var10006 = var2 & ~var3 | ~var2 & var3;
         var3 = -644434422;
         var2 = var10006;
         var10006 = var2 & ~var3 | ~var2 & var3;
         var3 = -369344236;
         var2 = 682820450;
         var10007 = var2 & ~var3 | ~var2 & var3;
         var3 = -1056825983;
         var2 = var10007;
         var10002 = a(
            "гЎЊм°·гЎЉм°¤гЎ›м°ЄгЎќм°‹гЎЋм°ЁгЎЉ",
            "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘ґ}\ua7e8к’ікЃёк¤‚зґ№и№‰в‘¶и¬ёг‘ўvкћ©к’–кЃЅк¤ЉзµЈи№Ћ\u2459и¬ёг‘№t\ua7efк’ІкЃ‚к¤Ђзµ¤и№њв‘іи¬ґг‘І6кџ–к’§кЃґк¤€зµїи№џв‘·и¬”г‘ё|\ua7e0к’јкЃ¶к¤Ёзµіи№ћв‘»",
            var10004,
            var10005,
            var10006,
            var2 + var3 - 2 * (var2 & var3)
         );
         var10005 = (int)3986782288402501142L;
         var3 = 735548231;
         var2 = var10005;
         var10005 = var2 + var3 - 2 * (var2 & var3);
         var3 = 1032517324;
         var2 = var10005;
         var10005 = var2 & ~var3 | ~var2 & var3;
         var3 = 1193629315;
         var2 = -1974347037;
         var10006 = (var2 | var3) & (~var2 | ~var3);
         var3 = 809656397;
         var2 = var10006;
         var10006 = (var2 | var3) - (var2 & var3);
         var10007 = (int)2777685878138929061L;
         var3 = 1640511991;
         var2 = var10007;
         var10007 = var2 + var3 - 2 * (var2 & var3);
         var3 = -2048938875;
         var2 = var10007;
         var10007 = (var2 | var3) & (~var2 | ~var3);
         int var10008 = (int)7903282849438540262L;
         var3 = -1146859813;
         var2 = var10008;
         var10008 = (var2 | var3) & ~(var2 & var3);
         var3 = 1803895779;
         var2 = var10008;
         var1.b = var0.optString(
            var10002,
            a(
               "гЎєгј‚гЎ„гј‚гЎЂгј›гЎЃ",
               "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘ґ}\ua7e8к’ікЃёк¤‚зґ№и№‰в‘¶и¬ёг‘ўvкћ©к’–кЃЅк¤ЉзµЈи№Ћ\u2459и¬ёг‘№t\ua7efк’ІкЃ‚к¤Ђзµ¤и№њв‘іи¬ґг‘І6кџ–к’§кЃґк¤€зµїи№џв‘·и¬”г‘ё|\ua7e0к’јкЃ¶к¤Ёзµіи№ћв‘»",
               var10005,
               var10006,
               var10007,
               (var2 | var3) & (~var2 | ~var3)
            )
         );
         var3 = -1323980019;
         var2 = -705135416;
         var10004 = (var2 | var3) & (~var2 | ~var3);
         var3 = 599555160;
         var2 = var10004;
         var10004 = var2 + var3 - 2 * (var2 & var3);
         var10005 = (int)-5763334741382949178L;
         var3 = 1256146683;
         var2 = var10005;
         var10005 = (var2 | var3) & ~(var2 & var3);
         var3 = 633198049;
         var2 = var10005;
         var10005 = (var2 | var3) - (var2 & var3);
         var10006 = (int)7489131811112403869L;
         var3 = -732180108;
         var2 = var10006;
         var10006 = (var2 | var3) & ~(var2 & var3);
         var3 = 591359635;
         var2 = var10006;
         var10006 = (var2 | var3) & ~(var2 & var3);
         var3 = -657154914;
         var2 = 2045169060;
         var10007 = var2 & ~var3 | ~var2 & var3;
         var3 = -1593731145;
         var2 = var10007;
         var10002 = a(
            "гЎЃе•ћгЎ‚е•љ",
            "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘ґ}\ua7e8к’ікЃёк¤‚зґ№и№‰в‘¶и¬ёг‘ўvкћ©к’–кЃЅк¤ЉзµЈи№Ћ\u2459и¬ёг‘№t\ua7efк’ІкЃ‚к¤Ђзµ¤и№њв‘іи¬ґг‘І6кџ–к’§кЃґк¤€зµїи№џв‘·и¬”г‘ё|\ua7e0к’јкЃ¶к¤Ёзµіи№ћв‘»",
            var10004,
            var10005,
            var10006,
            (var2 | var3) - (var2 & var3)
         );
         var10005 = (int)-3354229898166310080L;
         var3 = 114216188;
         var2 = var10005;
         var10005 = (var2 | var3) & (~var2 | ~var3);
         var3 = -1722676191;
         var2 = var10005;
         var10005 = (var2 | var3) & ~(var2 & var3);
         var3 = -1921882174;
         var2 = 1762271741;
         var10006 = var2 + var3 - 2 * (var2 & var3);
         var3 = 422441764;
         var2 = var10006;
         var10006 = (var2 | var3) - (var2 & var3);
         var3 = 412654139;
         var2 = -1441183933;
         var10007 = var2 & ~var3 | ~var2 & var3;
         var3 = -1532157651;
         var2 = var10007;
         var10007 = var2 & ~var3 | ~var2 & var3;
         var3 = -522181517;
         var2 = -248892413;
         var10008 = (var2 | var3) - (var2 & var3);
         var3 = 301098428;
         var2 = var10008;
         var1.c = var0.optString(
            var10002,
            a(
               "",
               "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘ґ}\ua7e8к’ікЃёк¤‚зґ№и№‰в‘¶и¬ёг‘ўvкћ©к’–кЃЅк¤ЉзµЈи№Ћ\u2459и¬ёг‘№t\ua7efк’ІкЃ‚к¤Ђзµ¤и№њв‘іи¬ґг‘І6кџ–к’§кЃґк¤€зµїи№џв‘·и¬”г‘ё|\ua7e0к’јкЃ¶к¤Ёзµіи№ћв‘»",
               var10005,
               var10006,
               var10007,
               (var2 | var3) & ~(var2 & var3)
            )
         );
         var10004 = (int)-2759323020443890786L;
         var3 = 1172759052;
         var2 = var10004;
         var10004 = var2 + var3 - 2 * (var2 & var3);
         var3 = 458555919;
         var2 = var10004;
         var10004 = (var2 | var3) & ~(var2 & var3);
         var10005 = (int)-483391836447975982L;
         var3 = -228381740;
         var2 = var10005;
         var10005 = var2 & ~var3 | ~var2 & var3;
         var3 = -1703744004;
         var2 = var10005;
         var10005 = var2 & ~var3 | ~var2 & var3;
         var3 = -1046784832;
         var2 = 2090249740;
         var10006 = var2 + var3 - 2 * (var2 & var3);
         var3 = -1429596630;
         var2 = var10006;
         var10006 = var2 & ~var3 | ~var2 & var3;
         var10007 = (int)6130030640625466693L;
         var3 = 1066813183;
         var2 = var10007;
         var10007 = (var2 | var3) & ~(var2 & var3);
         var3 = -1826017519;
         var2 = var10007;
         var10002 = a(
            "гЎ‹дќјгЎњдќєгЎќдќ°гЎџдќ­гЎ†дќ¶гЎЃ",
            "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘ґ}\ua7e8к’ікЃёк¤‚зґ№и№‰в‘¶и¬ёг‘ўvкћ©к’–кЃЅк¤ЉзµЈи№Ћ\u2459и¬ёг‘№t\ua7efк’ІкЃ‚к¤Ђзµ¤и№њв‘іи¬ґг‘І6кџ–к’§кЃґк¤€зµїи№џв‘·и¬”г‘ё|\ua7e0к’јкЃ¶к¤Ёзµіи№ћв‘»",
            var10004,
            var10005,
            var10006,
            var2 & ~var3 | ~var2 & var3
         );
         var3 = 1469889177;
         var2 = -1865114816;
         var10005 = var2 + var3 - 2 * (var2 & var3);
         var3 = -2145809852;
         var2 = var10005;
         var10005 = (var2 | var3) & (~var2 | ~var3);
         var3 = 1741411551;
         var2 = 559786075;
         var10006 = var2 & ~var3 | ~var2 & var3;
         var3 = -1146148276;
         var2 = var10006;
         var10006 = var2 + var3 - 2 * (var2 & var3);
         var3 = 1017264826;
         var2 = 1859054006;
         var10007 = var2 + var3 - 2 * (var2 & var3);
         var3 = 1492810034;
         var2 = var10007;
         var10007 = (var2 | var3) & (~var2 | ~var3);
         var3 = 1237422445;
         var2 = -568561031;
         var10008 = (var2 | var3) & ~(var2 & var3);
         var3 = -1748896659;
         var2 = var10008;
         var1.d = var0.optString(
            var10002,
            a(
               "",
               "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘ґ}\ua7e8к’ікЃёк¤‚зґ№и№‰в‘¶и¬ёг‘ўvкћ©к’–кЃЅк¤ЉзµЈи№Ћ\u2459и¬ёг‘№t\ua7efк’ІкЃ‚к¤Ђзµ¤и№њв‘іи¬ґг‘І6кџ–к’§кЃґк¤€зµїи№џв‘·и¬”г‘ё|\ua7e0к’јкЃ¶к¤Ёзµіи№ћв‘»",
               var10005,
               var10006,
               var10007,
               (var2 | var3) & (~var2 | ~var3)
            )
         );
         var3 = -2102177436;
         var2 = -532894799;
         var10004 = (var2 | var3) - (var2 & var3);
         var3 = 635326792;
         var2 = var10004;
         var10004 = (var2 | var3) & (~var2 | ~var3);
         var3 = 1172167209;
         var2 = 90154960;
         var10005 = var2 & ~var3 | ~var2 & var3;
         var3 = -1111020696;
         var2 = var10005;
         var10005 = (var2 | var3) - (var2 & var3);
         var3 = 612674284;
         var2 = -1460867118;
         var10006 = var2 & ~var3 | ~var2 & var3;
         var3 = -1727937880;
         var2 = var10006;
         var10006 = (var2 | var3) & (~var2 | ~var3);
         var3 = 195986761;
         var2 = 1627421810;
         var10007 = (var2 | var3) & (~var2 | ~var3);
         var3 = 1787227769;
         var2 = var10007;
         var1.e = var0.optString(
            a(
               "гЎџи’‚гЎЉи’†гЎ†и’•гЎи’№гЎ‚и’‘гЎ€и’•гЎєи’‚гЎѓ",
               "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘ґ}\ua7e8к’ікЃёк¤‚зґ№и№‰в‘¶и¬ёг‘ўvкћ©к’–кЃЅк¤ЉзµЈи№Ћ\u2459и¬ёг‘№t\ua7efк’ІкЃ‚к¤Ђзµ¤и№њв‘іи¬ґг‘І6кџ–к’§кЃґк¤€зµїи№џв‘·и¬”г‘ё|\ua7e0к’јкЃ¶к¤Ёзµіи№ћв‘»",
               var10004,
               var10005,
               var10006,
               (var2 | var3) - (var2 & var3)
            ),
            null
         );
         var3 = -1359459454;
         var2 = 1825610720;
         var10004 = (var2 | var3) - (var2 & var3);
         var3 = -2055635969;
         var2 = var10004;
         var10004 = var2 + var3 - 2 * (var2 & var3);
         var3 = -439132241;
         var2 = 1538582865;
         var10005 = var2 & ~var3 | ~var2 & var3;
         var3 = 1124999688;
         var2 = var10005;
         var10005 = var2 + var3 - 2 * (var2 & var3);
         var3 = -1256160384;
         var2 = 87161486;
         var10006 = (var2 | var3) & (~var2 | ~var3);
         var3 = -1328886098;
         var2 = var10006;
         var10006 = (var2 | var3) & ~(var2 & var3);
         var3 = 2011645996;
         var2 = -95795045;
         var10007 = var2 + var3 - 2 * (var2 & var3);
         var3 = -1914612464;
         var2 = var10007;
         var10002 = a(
            "гЎ‹м™єгЎм™»гЎѓм™єгЎЋм™±гЎњм™–гЎЂм™ гЎЃм™Ў",
            "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘ґ}\ua7e8к’ікЃёк¤‚зґ№и№‰в‘¶и¬ёг‘ўvкћ©к’–кЃЅк¤ЉзµЈи№Ћ\u2459и¬ёг‘№t\ua7efк’ІкЃ‚к¤Ђзµ¤и№њв‘іи¬ґг‘І6кџ–к’§кЃґк¤€зµїи№џв‘·и¬”г‘ё|\ua7e0к’јкЃ¶к¤Ёзµіи№ћв‘»",
            var10004,
            var10005,
            var10006,
            (var2 | var3) - (var2 & var3)
         );
         var3 = 1376766788;
         var2 = 1081962890;
         var10003 = (var2 | var3) & (~var2 | ~var3);
         var3 = 309508814;
         var2 = var10003;
         var1.f = var0.optInt(var10002, var2 & ~var3 | ~var2 & var3);
         var10004 = (int)-952668823570537612L;
         var3 = 1632648593;
         var2 = var10004;
         var10004 = var2 + var3 - 2 * (var2 & var3);
         var3 = -1199786632;
         var2 = var10004;
         var10004 = (var2 | var3) - (var2 & var3);
         var3 = -388408644;
         var2 = 585800014;
         var10005 = var2 + var3 - 2 * (var2 & var3);
         var3 = 923406486;
         var2 = var10005;
         var10005 = (var2 | var3) & (~var2 | ~var3);
         var3 = 1297702887;
         var2 = -2061929684;
         var10006 = (var2 | var3) & ~(var2 & var3);
         var3 = -748346298;
         var2 = var10006;
         var10006 = (var2 | var3) - (var2 & var3);
         var10007 = (int)-5911009741831738618L;
         var3 = -1476578724;
         var2 = var10007;
         var10007 = (var2 | var3) - (var2 & var3);
         var3 = -1914745521;
         var2 = var10007;
         var1.g = var0.optLong(
            a(
               "гЎџЯ’гЎќЯ„гЎ‡Я†гЎњЯ‚гЎ‹Я¦гЎ›",
               "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘ґ}\ua7e8к’ікЃёк¤‚зґ№и№‰в‘¶и¬ёг‘ўvкћ©к’–кЃЅк¤ЉзµЈи№Ћ\u2459и¬ёг‘№t\ua7efк’ІкЃ‚к¤Ђзµ¤и№њв‘іи¬ґг‘І6кџ–к’§кЃґк¤€зµїи№џв‘·и¬”г‘ё|\ua7e0к’јкЃ¶к¤Ёзµіи№ћв‘»",
               var10004,
               var10005,
               var10006,
               (var2 | var3) & ~(var2 & var3)
            ),
            System.currentTimeMillis()
         );
         return var1;
      }

      public static String a(String var0, String var1, int var2, int var3, int var4, int var5) {
         char[] var6 = var1.toCharArray();
         char[] var7 = new char[var6.length];
         int var18 = 578274239;
         int var17 = 538910298;
         int var10000 = (var17 | var18) & (~var17 | ~var18);
         var18 = 40426991;
         var17 = var10000;
         char[] var219 = new char[var17 + var18 - 2 * (var17 & var18)];
         var18 = -300310367;
         var17 = -326989092;
         int var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = 43723389;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         int var10003 = (int)7391097515085309732L;
         var18 = 217404945;
         var17 = var10003;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = -1306806009;
         var17 = var10003;
         var219[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var18 = 2101957894;
         var17 = -1630580518;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = -477755939;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = 119023314;
         var17 = 1361646538;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = 1446057629;
         var17 = var10003;
         var219[var10002] = (char)((var17 | var18) & ~(var17 & var18));
         var18 = -191153720;
         var17 = 1467633396;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = -1545504962;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var10003 = (int)-24309469055867440L;
         var18 = -335868956;
         var17 = var10003;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = 1204030898;
         var17 = var10003;
         var219[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var10002 = (int)-3941982863718705666L;
         var18 = 879221198;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = -1522971597;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var10003 = (int)2653025883949389728L;
         var18 = 1586160399;
         var17 = var10003;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = 1848782012;
         var17 = var10003;
         var219[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var18 = 1276009791;
         var17 = 1012061074;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = 1885114025;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = -149889934;
         var17 = -1554171387;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = 1414362962;
         var17 = var10003;
         var219[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var18 = 553228154;
         var17 = -854740538;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = -302766407;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var10003 = (int)-6510451814569711889L;
         var18 = -375238953;
         var17 = var10003;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = 1625583034;
         var17 = var10003;
         var219[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var18 = 1540204449;
         var17 = -762248184;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = -1990417489;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = 1725979779;
         var17 = -785129738;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = -1210872986;
         var17 = var10003;
         var219[var10002] = (char)((var17 | var18) - (var17 & var18));
         var18 = -1893757764;
         var17 = -625972854;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = 1437590833;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var10003 = (int)-2524500168694277513L;
         var18 = 1355758027;
         var17 = var10003;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = -2124458082;
         var17 = var10003;
         var219[var10002] = (char)((var17 | var18) - (var17 & var18));
         var10002 = (int)-4123027946271591013L;
         var18 = -1074529234;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = -930428483;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var10003 = (int)-7276936826778975517L;
         var18 = 773593362;
         var17 = var10003;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = -453143646;
         var17 = var10003;
         var219[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         var10002 = (int)-2911518289520667548L;
         var18 = 2112581141;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = -637912456;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = 26808649;
         var17 = 2036741534;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = 2029986803;
         var17 = var10003;
         var219[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         char[] var8 = var219;
         var10000 = (int)-2046799391769541673L;
         var18 = 498511636;
         var17 = var10000;
         var10000 = (var17 | var18) & ~(var17 & var18);
         var18 = 849472713;
         var17 = var10000;
         char[] var222 = new char[var17 & ~var18 | ~var17 & var18];
         var10002 = (int)-60438633020961160L;
         var18 = 1472136441;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = 2074888833;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = -2040038424;
         var17 = -1914059909;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = 193917107;
         var17 = var10003;
         var222[var10002] = (char)((var17 | var18) - (var17 & var18));
         var10002 = (int)7088696124039079528L;
         var18 = 711695310;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = 274873767;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var10003 = (int)8102221131808954163L;
         var18 = -1257593700;
         var17 = var10003;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = -1876363348;
         var17 = var10003;
         var222[var10002] = (char)((var17 | var18) & ~(var17 & var18));
         var10002 = (int)870277657425948432L;
         var18 = -1280370095;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = -1854261949;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = -1185357844;
         var17 = -1863184102;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = 699025829;
         var17 = var10003;
         var222[var10002] = (char)((var17 | var18) & ~(var17 & var18));
         var18 = 1133529496;
         var17 = -1771304573;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = -704888808;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var10003 = (int)3350916644113736681L;
         var18 = -91577209;
         var17 = var10003;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = -287473812;
         var17 = var10003;
         var222[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var18 = 682714392;
         var17 = -1507459316;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = -1902863856;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var10003 = (int)667943984005426983L;
         var18 = -1685016155;
         var17 = var10003;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = 588261058;
         var17 = var10003;
         var222[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var18 = 1021005117;
         var17 = 1839488533;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = 1367282477;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = -101012992;
         var17 = 1197374490;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = -1096487282;
         var17 = var10003;
         var222[var10002] = (char)((var17 | var18) - (var17 & var18));
         var10002 = (int)8270191417182700911L;
         var18 = 548695155;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = -316888806;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = 1058253452;
         var17 = 171539613;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = 891965736;
         var17 = var10003;
         var222[var10002] = (char)((var17 | var18) - (var17 & var18));
         var18 = 174547093;
         var17 = 1541556797;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = 1367681711;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = 1954584147;
         var17 = -299413409;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = -1700276684;
         var17 = var10003;
         var222[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var18 = 8430644;
         var17 = -1441214237;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = -1432849185;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = 2108254251;
         var17 = -1198830447;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = -987584578;
         var17 = var10003;
         var222[var10002] = (char)((var17 | var18) - (var17 & var18));
         var10002 = (int)-2759291476694778070L;
         var18 = 1666146442;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = 278355881;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = -123915705;
         var17 = 2015796698;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = -2135188306;
         var17 = var10003;
         var222[var10002] = (char)((var17 | var18) & ~(var17 & var18));
         char[] var9 = var222;
         var10000 = (int)-7359338230579153480L;
         var18 = 342538488;
         var17 = var10000;
         var10000 = (var17 | var18) & ~(var17 & var18);
         var18 = -66450112;
         var17 = var10000;

         for (int var10 = (var17 | var18) - (var17 & var18); var10 < var6.length; var10++) {
            char var276 = var6[var10];
            char var205 = var8[var10 % var8.length];
            char var106 = var276;
            var7[var10] = (char)((var106 | var205) & ~(var106 & var205));
         }

         char[] var19 = new char[var7.length];
         var18 = 724183336;
         var17 = -1278184441;
         var10000 = (var17 | var18) & ~(var17 & var18);
         var18 = -1728422609;
         var17 = var10000;

         for (int var11 = (var17 | var18) & (~var17 | ~var18); var11 < var6.length; var11++) {
            char var277 = var7[var11];
            char var208 = var9[var11 % var9.length];
            char var109 = var277;
            var19[var11] = (char)(var109 + var208 - 2 * (var109 & var208));
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
         var18 = -1430311967;
         var17 = 1043589506;
         var10000 = (var17 | var18) - (var17 & var18);
         var18 = -1802714525;
         var17 = var10000;

         for (int var16 = var17 & ~var18 | ~var17 & var18; var16 < var15.length; var16++) {
            int var10001 = (int)6512151470386250176L;
            var18 = 889927985;
            var17 = var10001;
            var10001 = var17 + var18 - 2 * (var17 & var18);
            var18 = 1591884019;
            var17 = var10001;
            switch (var16 % ((var17 | var18) & ~(var17 & var18))) {
               case 0:
                  var18 = var12;
                  var17 = var13;
                  var10002 = var17 & ~var18 | ~var17 & var18;
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
                  var15[var16] = (char)((var17 | var216) & (~var17 | ~var216));
            }
         }

         return new String(var15);
      }
   }
}
