package ru.pulse;


import pulse.module.ModuleRegistry;
import java.awt.Desktop;
import java.net.URI;
import java.util.concurrent.ThreadFactory;
import lombok.Generated;
import net.fabricmc.api.ModInitializer;
import net.minecraft.client.gui.screen.Screen;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pulse.HudServiceRegistry;
import pulse.Renderer2D;
import pulse.Renderer2DImpl;
import pulse.ShaderLibrary;
import pulse.ClickGuiKeyBinding;
import pulse.IconTextureRegistry;
import pulse.UserInfo;
import pulse.PulseClickGuiScreen;

public class Pulse implements Runnable, ThreadFactory, ModInitializer {
   public static final String CLIENT_NAME = "pulse";
   public static final String CLIENT_VERSION = "2.0.1";
   private static final String[] BACKEND_URLS;
   private static final String[] API_URLS;
   private static final String[] MAIN_URLS;
   private static final Pulse instance = new Pulse();
   private static final Logger LOGGER;
   private static UserInfo userInfo = null;
   private static String cachedBackendUrl = null;
   private static int currentBackendIndex;
   private String backendUrl;
   private String pendingTokenToSave = null;
   private Renderer2D render;
   private Screen clickGui;
   private boolean init;
   private static boolean updateScreenShown;

   public Pulse() {
      int var10001 = (int)-848225191902171764L;
      int var2 = -938156408;
      int var1 = var10001;
      var10001 = (var1 | var2) - (var1 & var2);
      var2 = 1396110084;
      var1 = var10001;
      this.init = pulse.Bool.from(var1 & ~var2 | ~var1 & var2);
   }

   public void onInitialize() {
      ClickGuiKeyBinding.register();
      LOGGER.info("Pulse initialized without native protection");
   }

   @Override
   public void run() {
   }

   @Override
   public Thread newThread(Runnable var1) {
      return null;
   }

   private static void unlockCryptoPolicy() {
   }

   public void init() {
      IconTextureRegistry.load();
      ShaderLibrary.loadDefaultShaders();
      this.render = new Renderer2DImpl();
      HudServiceRegistry.a();
      ModuleRegistry.init();
      this.clickGui = new PulseClickGuiScreen();
      this.init = true;
      LOGGER.info("Pulse Java GUI initialized");
      Object var2 = null;
      runtimeBrandingTick();
   }

   private String loadTokenFromAnySource() {
      return "";
   }

   private String loadTokenFromJar() {
      return "";
   }

   public static void showMessage(String var0) {
   }

   public static void showAntivirusWarning() {
   }

   public static void showSystemMessage() {
   }

   public static void openYouTube() {
   }

   public static void checkAndShowUpdate(Screen var0) {
   }

   public static String getMainUrl() {
      String[] var0 = MAIN_URLS;
      int var1 = var0.length;
      int var10000 = (int)4507360181452921971L;
      int var5 = -1501899080;
      int var4 = var10000;
      var10000 = (var4 | var5) & (~var4 | ~var5);
      var5 = -1673065781;
      var4 = var10000;

      for (int var2 = var4 + var5 - 2 * (var4 & var5); var2 < var1; var2++) {
         String var3 = var0[var2];
         if (isUrlAccessible(var3)) {
            return var3;
         }
      }

      var5 = 1365582113;
      var4 = 616192889;
      int var10001 = var4 & ~var5 | ~var4 & var5;
      var5 = 1977580120;
      var4 = var10001;
      return MAIN_URLS[(var4 | var5) & (~var4 | ~var5)];
   }

   public static String getBackendUrl() {
      return cachedBackendUrl != null ? cachedBackendUrl : BACKEND_URLS[currentBackendIndex];
   }

   public static String getDirectApiUrl() {
      String[] var0 = API_URLS;
      int var1 = var0.length;
      int var6 = 1307846916;
      int var5 = 1361460701;
      int var10000 = var5 & ~var6 | ~var5 & var6;
      var6 = 483529945;
      var5 = var10000;

      for (int var2 = var5 + var6 - 2 * (var5 & var6); var2 < var1; var2++) {
         String var3 = var0[var2];
         String var4 = var3;
         StringBuilder var29 = new StringBuilder().append(var4);
         var6 = -1915631399;
         var5 = -2057791635;
         int var10003 = var5 + var6 - 2 * (var5 & var6);
         var6 = 1007029251;
         var5 = var10003;
         var10003 = (var5 | var6) - (var5 & var6);
         int var10004 = (int)4248440870030773128L;
         var6 = 2091903239;
         var5 = var10004;
         var10004 = (var5 | var6) & (~var5 | ~var6);
         var6 = -1108132300;
         var5 = var10004;
         var10004 = (var5 | var6) & ~(var5 & var6);
         int var10005 = (int)-6507685781131269568L;
         var6 = 1322841308;
         var5 = var10005;
         var10005 = (var5 | var6) & ~(var5 & var6);
         var6 = -1462895682;
         var5 = var10005;
         var10005 = (var5 | var6) - (var5 & var6);
         var6 = 1876428386;
         var5 = -2141206102;
         int var10006 = var5 + var6 - 2 * (var5 & var6);
         var6 = -275115112;
         var5 = var10006;
         if (isUrlAccessible(
            var29.append(
                  decrypt(
                     "缬\uf085罶\uf090罫\uf0cb罧\uf081罵\uf08d罠\uf081缬\uf094罬\uf088罯\uf0db罰\uf090罢\uf090罦\uf0d9罷\uf081罰\uf090",
                     "`ꟳꓺꁡꤐ絺蹙⑿譸㑇g\ua7ea꒦ꁴ",
                     var10003,
                     var10004,
                     var10005,
                     (var5 | var6) - (var5 & var6)
                  )
               )
               .toString()
         )) {
            return var3;
         }
      }

      var6 = 1023064367;
      var5 = -1937443156;
      int var10001 = var5 & ~var6 | ~var5 & var6;
      var6 = -1333899389;
      var5 = var10001;
      return API_URLS[(var5 | var6) & (~var5 | ~var6)];
   }

   private static boolean isUrlAccessible(String var0) {
      return false;
   }

   public Renderer2D getRender() {
      return this.render;
   }

   public Screen getClickGui() {
      return this.clickGui;
   }

   @Generated
   public static Pulse getInstance() {
      return instance;
   }

   @Generated
   public static Logger getLOGGER() {
      return LOGGER;
   }

   @Generated
   public static UserInfo getUserInfo() {
      return userInfo;
   }

   @Generated
   public static void setUserInfo(UserInfo var0) {
      userInfo = var0;
   }

   static {
      int var10000 = (int)-4670616546680705025L;
      int var1 = -905188063;
      int var0 = var10000;
      var10000 = var0 & ~var1 | ~var0 & var1;
      var1 = -419233061;
      var0 = var10000;
      String[] var217 = new String[var0 + var1 - 2 * (var0 & var1)];
      int var10002 = (int)2162477282061475795L;
      var1 = -678841826;
      var0 = var10002;
      var10002 = var0 + var1 - 2 * (var0 & var1);
      var1 = -1347818035;
      var0 = var10002;
      var10002 = (var0 | var1) & ~(var0 & var1);
      int var10005 = (int)-1898828573205794371L;
      var1 = 1743456270;
      var0 = var10005;
      var10005 = var0 + var1 - 2 * (var0 & var1);
      var1 = 1339075076;
      var0 = var10005;
      var10005 = var0 & ~var1 | ~var0 & var1;
      int var10006 = (int)-4222047388449565116L;
      var1 = -1024737187;
      var0 = var10006;
      var10006 = (var0 | var1) & (~var0 | ~var1);
      var1 = 10939037;
      var0 = var10006;
      var10006 = (var0 | var1) & (~var0 | ~var1);
      int var10007 = (int)3124653263949578387L;
      var1 = 1343739516;
      var0 = var10007;
      var10007 = var0 & ~var1 | ~var0 & var1;
      var1 = -407077283;
      var0 = var10007;
      var10007 = (var0 | var1) & (~var0 | ~var1);
      var1 = -1039740514;
      var0 = 1629763210;
      int var10008 = (var0 | var1) & ~(var0 & var1);
      var1 = -1559478992;
      var0 = var10008;
      var217[var10002] = decrypt("嵶퓹嵪퓽嵭풷崱풢嵼퓬嵽퓦嵻퓣嵺풹崰퓽嵫퓡嵭퓨嵨퓤嵭퓸嵿퓡嵭풣嵮퓿嵱", "`ꟳꓺꁡꤐ絺蹙⑿譸㑇g\ua7ea꒦ꁴ", var10005, var10006, var10007, (var0 | var1) & (~var0 | ~var1));
      var10002 = (int)1882655923522005794L;
      var1 = 583669859;
      var0 = var10002;
      var10002 = var0 & ~var1 | ~var0 & var1;
      var1 = 1360687936;
      var0 = var10002;
      var10002 = (var0 | var1) & ~(var0 & var1);
      var1 = 322334006;
      var0 = -752110014;
      var10005 = var0 + var1 - 2 * (var0 & var1);
      var1 = -191723325;
      var0 = var10005;
      var10005 = (var0 | var1) & (~var0 | ~var1);
      var10006 = (int)6487804139519288350L;
      var1 = 1812506334;
      var0 = var10006;
      var10006 = var0 & ~var1 | ~var0 & var1;
      var1 = 419002899;
      var0 = var10006;
      var10006 = (var0 | var1) & ~(var0 & var1);
      var10007 = (int)-4661698644573146768L;
      var1 = -20169709;
      var0 = var10007;
      var10007 = (var0 | var1) & ~(var0 & var1);
      var1 = -345949168;
      var0 = var10007;
      var10007 = (var0 | var1) - (var0 & var1);
      var1 = -1788183968;
      var0 = -1561456296;
      var10008 = var0 + var1 - 2 * (var0 & var1);
      var1 = 931265867;
      var0 = var10008;
      var217[var10002] = decrypt("嵶颮嵪颪嵭飠崱飵嵼颻嵽颱嵻颴嵺飴嵮颯嵲颩嵻颬嵷颩嵫颻嵲颩崰颪嵬颵", "`ꟳꓺꁡꤐ絺蹙⑿譸㑇g\ua7ea꒦ꁴ", var10005, var10006, var10007, (var0 | var1) & ~(var0 & var1));
      var1 = 1673104722;
      var0 = 2053135649;
      var10002 = (var0 | var1) - (var0 & var1);
      var1 = 433705073;
      var0 = var10002;
      var10002 = var0 & ~var1 | ~var0 & var1;
      var10005 = (int)-737078748483548828L;
      var1 = 2075516705;
      var0 = var10005;
      var10005 = (var0 | var1) & ~(var0 & var1);
      var1 = -568556046;
      var0 = var10005;
      var10005 = (var0 | var1) & (~var0 | ~var1);
      var1 = -1843659096;
      var0 = -644122106;
      var10006 = (var0 | var1) & ~(var0 & var1);
      var1 = -1958353385;
      var0 = var10006;
      var10006 = var0 & ~var1 | ~var0 & var1;
      var10007 = (int)6374756484784800144L;
      var1 = -1973686544;
      var0 = var10007;
      var10007 = var0 + var1 - 2 * (var0 & var1);
      var1 = -493351098;
      var0 = var10007;
      var10007 = var0 + var1 - 2 * (var0 & var1);
      var10008 = (int)-2154772958094359772L;
      var1 = -681822780;
      var0 = var10008;
      var10008 = (var0 | var1) - (var0 & var1);
      var1 = -363383111;
      var0 = var10008;
      var217[var10002] = decrypt(
         "嵶ຄ嵪\u0e80嵭໊崱ໟ嵼ຑ嵽ປ嵻ພ嵺ແ崰\u0e80嵫ຜ嵭ຕ嵨ນ嵭\u0e85嵿ຜ嵭ໞ嵮ຂ嵱", "`ꟳꓺꁡꤐ絺蹙⑿譸㑇g\ua7ea꒦ꁴ", var10005, var10006, var10007, (var0 | var1) & ~(var0 & var1)
      );
      var1 = -15489886;
      var0 = -2138848798;
      var10002 = var0 + var1 - 2 * (var0 & var1);
      var1 = 2140169539;
      var0 = var10002;
      var10002 = var0 & ~var1 | ~var0 & var1;
      var10005 = (int)1851347756230451103L;
      var1 = -2076297811;
      var0 = var10005;
      var10005 = (var0 | var1) - (var0 & var1);
      var1 = 90470789;
      var0 = var10005;
      var10005 = (var0 | var1) & ~(var0 & var1);
      var1 = 1147686974;
      var0 = 1235738558;
      var10006 = (var0 | var1) & (~var0 | ~var1);
      var1 = -851683925;
      var0 = var10006;
      var10006 = var0 + var1 - 2 * (var0 & var1);
      var1 = -576892745;
      var0 = 2130750443;
      var10007 = var0 & ~var1 | ~var0 & var1;
      var1 = -1475916435;
      var0 = var10007;
      var10007 = (var0 | var1) & (~var0 | ~var1);
      var1 = 314087451;
      var0 = 2106518065;
      var10008 = (var0 | var1) & ~(var0 & var1);
      var1 = 1870136801;
      var0 = var10008;
      var217[var10002] = decrypt("嵶礖嵪礒嵭祘崱祍嵼礃嵽礉嵻礌嵺祐崰礒嵫礎嵭礇嵨礋嵭礗嵿礎嵭祌嵮礐嵱", "`ꟳꓺꁡꤐ絺蹙⑿譸㑇g\ua7ea꒦ꁴ", var10005, var10006, var10007, (var0 | var1) & ~(var0 & var1));
      var10002 = (int)4243144958857736364L;
      var1 = -1683524424;
      var0 = var10002;
      var10002 = (var0 | var1) & (~var0 | ~var1);
      var1 = 2022900752;
      var0 = var10002;
      var10002 = (var0 | var1) & (~var0 | ~var1);
      var10005 = (int)-7687389294888724136L;
      var1 = 2037892442;
      var0 = var10005;
      var10005 = var0 + var1 - 2 * (var0 & var1);
      var1 = 972869557;
      var0 = var10005;
      var10005 = (var0 | var1) & ~(var0 & var1);
      var10006 = (int)4883760307003986906L;
      var1 = -1415034912;
      var0 = var10006;
      var10006 = (var0 | var1) & ~(var0 & var1);
      var1 = -799826356;
      var0 = var10006;
      var10006 = (var0 | var1) - (var0 & var1);
      var1 = -1301344139;
      var0 = 1032742318;
      var10007 = (var0 | var1) & ~(var0 & var1);
      var1 = -1908289165;
      var0 = var10007;
      var10007 = var0 + var1 - 2 * (var0 & var1);
      var10008 = (int)-2006994892228579686L;
      var1 = 344196128;
      var0 = var10008;
      var10008 = (var0 | var1) & ~(var0 & var1);
      var1 = 2047034028;
      var0 = var10008;
      var217[var10002] = decrypt("嵶曋嵪曏嵭暅崱暐嵼曞嵽曔嵻曑嵺暌崰曏嵫曓嵭曚嵨曖嵭曊嵿曓嵭暑嵮曍嵱", "`ꟳꓺꁡꤐ絺蹙⑿譸㑇g\ua7ea꒦ꁴ", var10005, var10006, var10007, (var0 | var1) & ~(var0 & var1));
      BACKEND_URLS = var217;
      var10000 = (int)3735711112459915392L;
      var1 = 1446812950;
      var0 = var10000;
      var10000 = var0 & ~var1 | ~var0 & var1;
      var1 = -2019848812;
      var0 = var10000;
      String[] var220 = new String[var0 & ~var1 | ~var0 & var1];
      var1 = -635890654;
      var0 = 969497315;
      var10002 = (var0 | var1) - (var0 & var1);
      var1 = -472887615;
      var0 = var10002;
      var10002 = (var0 | var1) & ~(var0 & var1);
      var10005 = (int)1379834858819967560L;
      var1 = 145755405;
      var0 = var10005;
      var10005 = var0 + var1 - 2 * (var0 & var1);
      var1 = 1821705458;
      var0 = var10005;
      var10005 = (var0 | var1) & ~(var0 & var1);
      var1 = -1834212239;
      var0 = 148747906;
      var10006 = var0 + var1 - 2 * (var0 & var1);
      var1 = 1520031349;
      var0 = var10006;
      var10006 = (var0 | var1) - (var0 & var1);
      var1 = 1316851060;
      var0 = -252962096;
      var10007 = var0 & ~var1 | ~var0 & var1;
      var1 = -1270937355;
      var0 = var10007;
      var10007 = (var0 | var1) & (~var0 | ~var1);
      var10008 = (int)-2298816449300601998L;
      var1 = -537953142;
      var0 = var10008;
      var10008 = (var0 | var1) & (~var0 | ~var1);
      var1 = -1473151522;
      var0 = var10008;
      var220[var10002] = decrypt(
         "嵶\uecfb嵪\uecff嵭\uecb5崱\ueca0嵿\uecff嵷\ueca1嵮\uecfa嵲\uecfc嵻\uecf9嵷\uecfc嵫\uecee嵲\uecfc崰\uecff嵬\uece0崱\uecee嵮\uece6",
         "`ꟳꓺꁡꤐ絺蹙⑿譸㑇g\ua7ea꒦ꁴ",
         var10005,
         var10006,
         var10007,
         (var0 | var1) & ~(var0 & var1)
      );
      var1 = -716273350;
      var0 = -1380547860;
      var10002 = (var0 | var1) - (var0 & var1);
      var1 = 2029521879;
      var0 = var10002;
      var10002 = (var0 | var1) - (var0 & var1);
      var10005 = (int)-4935293263103306533L;
      var1 = 2044041565;
      var0 = var10005;
      var10005 = var0 & ~var1 | ~var0 & var1;
      var1 = -1560043983;
      var0 = var10005;
      var10005 = (var0 | var1) - (var0 & var1);
      var1 = 2020649730;
      var0 = 940043074;
      var10006 = var0 + var1 - 2 * (var0 & var1);
      var1 = -2134495346;
      var0 = var10006;
      var10006 = (var0 | var1) & ~(var0 & var1);
      var10007 = (int)-2111895284356297225L;
      var1 = -1813757434;
      var0 = var10007;
      var10007 = var0 & ~var1 | ~var0 & var1;
      var1 = 62203479;
      var0 = var10007;
      var10007 = (var0 | var1) - (var0 & var1);
      var10008 = (int)-8948197793283040804L;
      var1 = 2086769701;
      var0 = var10008;
      var10008 = var0 + var1 - 2 * (var0 & var1);
      var1 = 1124302999;
      var0 = var10008;
      var220[var10002] = decrypt("嵶γ嵪η嵭Ͻ崱Ϩ嵻β嵿η嵷ϩ嵮β嵲δ嵻α嵷δ嵫Φ嵲δ崰η嵬Ψ崱Φ嵮ή", "`ꟳꓺꁡꤐ絺蹙⑿譸㑇g\ua7ea꒦ꁴ", var10005, var10006, var10007, var0 & ~var1 | ~var0 & var1);
      API_URLS = var220;
      var10000 = (int)-277333610187200398L;
      var1 = -1890038996;
      var0 = var10000;
      var10000 = (var0 | var1) & (~var0 | ~var1);
      var1 = -2015648932;
      var0 = var10000;
      String[] var223 = new String[var0 & ~var1 | ~var0 & var1];
      var1 = 1888815449;
      var0 = -861226629;
      var10002 = (var0 | var1) & (~var0 | ~var1);
      var1 = -1136676830;
      var0 = var10002;
      var10002 = var0 + var1 - 2 * (var0 & var1);
      var10005 = (int)5422275334661230860L;
      var1 = 118351334;
      var0 = var10005;
      var10005 = var0 & ~var1 | ~var0 & var1;
      var1 = 257615709;
      var0 = var10005;
      var10005 = var0 + var1 - 2 * (var0 & var1);
      var10006 = (int)-5980397913762584095L;
      var1 = 1795376006;
      var0 = var10006;
      var10006 = (var0 | var1) & ~(var0 & var1);
      var1 = -987850868;
      var0 = var10006;
      var10006 = (var0 | var1) - (var0 & var1);
      var1 = -289722658;
      var0 = 1014094121;
      var10007 = var0 & ~var1 | ~var0 & var1;
      var1 = -1062745358;
      var0 = var10007;
      var10007 = (var0 | var1) - (var0 & var1);
      var1 = 1586482791;
      var0 = 2066314450;
      var10008 = var0 + var1 - 2 * (var0 & var1);
      var1 = 631349566;
      var0 = var10008;
      var223[var10002] = decrypt("嵶ᕖ嵪ᕒ嵭ᔘ崱ᔍ嵮ᕗ嵲ᕑ嵻ᕔ嵷ᕑ嵫ᕃ嵲ᕑ崰ᕒ嵬ᕍ", "`ꟳꓺꁡꤐ絺蹙⑿譸㑇g\ua7ea꒦ꁴ", var10005, var10006, var10007, (var0 | var1) - (var0 & var1));
      var10002 = (int)-4164355644433852097L;
      var1 = -1464123825;
      var0 = var10002;
      var10002 = var0 + var1 - 2 * (var0 & var1);
      var1 = 1335601009;
      var0 = var10002;
      var10002 = var0 + var1 - 2 * (var0 & var1);
      var1 = -744336628;
      var0 = -1105127560;
      var10005 = (var0 | var1) - (var0 & var1);
      var1 = 1493964739;
      var0 = var10005;
      var10005 = (var0 | var1) & ~(var0 & var1);
      var1 = 488794614;
      var0 = -818322402;
      var10006 = (var0 | var1) - (var0 & var1);
      var1 = 317350426;
      var0 = var10006;
      var10006 = var0 + var1 - 2 * (var0 & var1);
      var10007 = (int)1175744116356766905L;
      var1 = -1344680480;
      var0 = var10007;
      var10007 = (var0 | var1) & (~var0 | ~var1);
      var1 = -1004852594;
      var0 = var10007;
      var10007 = (var0 | var1) - (var0 & var1);
      var1 = -6395656;
      var0 = -498305144;
      var10008 = var0 & ~var1 | ~var0 & var1;
      var1 = 496898786;
      var0 = var10008;
      var223[var10002] = decrypt("嵶͏嵪͋嵭́崱̔嵻͎崰͋嵫͗嵭͞嵨͒嵭͎嵿͗嵭̕嵮͉嵱", "`ꟳꓺꁡꤐ絺蹙⑿譸㑇g\ua7ea꒦ꁴ", var10005, var10006, var10007, (var0 | var1) & ~(var0 & var1));
      MAIN_URLS = var223;
      var1 = 338606930;
      var0 = -308740680;
      var10002 = (var0 | var1) & (~var0 | ~var1);
      var1 = -851896995;
      var0 = var10002;
      var10002 = var0 + var1 - 2 * (var0 & var1);
      var1 = 455301096;
      var0 = -1844618218;
      int var10003 = (var0 | var1) - (var0 & var1);
      var1 = 1239720288;
      var0 = var10003;
      var10003 = (var0 | var1) & ~(var0 & var1);
      int var10004 = (int)-8456267430455242251L;
      var1 = 1890096141;
      var0 = var10004;
      var10004 = (var0 | var1) & (~var0 | ~var1);
      var1 = 780520626;
      var0 = var10004;
      var10004 = var0 + var1 - 2 * (var0 & var1);
      var10005 = (int)-37149483425068224L;
      var1 = -1425622758;
      var0 = var10005;
      var10005 = (var0 | var1) - (var0 & var1);
      var1 = 2013264484;
      var0 = var10005;
      LOGGER = LogManager.getLogger(decrypt("嵮䛢嵲䛤嵻", "`ꟳꓺꁡꤐ絺蹙⑿譸㑇g\ua7ea꒦ꁴ", var10002, var10003, var10004, (var0 | var1) & ~(var0 & var1)));
      var10000 = (int)8070391845970745374L;
      var1 = 1952875735;
      var0 = var10000;
      var10000 = var0 & ~var1 | ~var0 & var1;
      var1 = 2100108489;
      var0 = var10000;
      currentBackendIndex = var0 + var1 - 2 * (var0 & var1);
      var1 = -535386620;
      var0 = -2004436772;
      var10000 = (var0 | var1) - (var0 & var1);
      var1 = 1754275544;
      var0 = var10000;
      updateScreenShown = pulse.Bool.from((var0 | var1) & (~var0 | ~var1));
   }

   public static String decrypt(String var0, String var1, int var2, int var3, int var4, int var5) {
      char[] var6 = var1.toCharArray();
      char[] var7 = new char[var6.length];
      int var10000 = (int)5046489542483224053L;
      int var18 = -1871064680;
      int var17 = var10000;
      var10000 = (var17 | var18) & (~var17 | ~var18);
      var18 = -837389209;
      var17 = var10000;
      char[] var220 = new char[var17 + var18 - 2 * (var17 & var18)];
      var18 = 2140085651;
      var17 = -1066998836;
      int var10002 = (var17 | var18) - (var17 & var18);
      var18 = -1075184033;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1771956668;
      var17 = -223820604;
      int var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1690999478;
      var17 = var10003;
      var220[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var10002 = (int)3366413297509869439L;
      var18 = -2106713568;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 1599356254;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var10003 = (int)-6176881549912017179L;
      var18 = 2024135139;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1921938301;
      var17 = var10003;
      var220[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var10002 = (int)-5366138504944192121L;
      var18 = 36464289;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -143846620;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)-5229548489822560473L;
      var18 = -696591630;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -838277549;
      var17 = var10003;
      var220[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var18 = -1561742574;
      var17 = 392401771;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -1249238918;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1575506911;
      var17 = 298111337;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -1277958821;
      var17 = var10003;
      var220[var10002] = (char)((var17 | var18) - (var17 & var18));
      var18 = 1489333897;
      var17 = -79909257;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -1543913222;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -783950109;
      var17 = -1969041485;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1541898357;
      var17 = var10003;
      var220[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var18 = -1749972525;
      var17 = -1964905593;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 491807313;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -1435828131;
      var17 = -1369863718;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 70437893;
      var17 = var10003;
      var220[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var18 = 2133770543;
      var17 = -181833393;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -1979207578;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1880883887;
      var17 = 307530878;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1648920514;
      var17 = var10003;
      var220[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var18 = 1664848626;
      var17 = -408977445;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -2069566162;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -7040581;
      var17 = -1275787671;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1281467376;
      var17 = var10003;
      var220[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var18 = -1823050687;
      var17 = 55060080;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1877061063;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var10003 = (int)8104883869596025271L;
      var18 = 1418181522;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1301754486;
      var17 = var10003;
      var220[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var10002 = (int)-8750310314810542266L;
      var18 = -1457925838;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -1839323523;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -1016875095;
      var17 = 1204335027;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -2069167810;
      var17 = var10003;
      var220[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      char[] var8 = var220;
      var18 = -104934434;
      var17 = -893753589;
      var10000 = var17 + var18 - 2 * (var17 & var18);
      var18 = 855946463;
      var17 = var10000;
      char[] var222 = new char[var17 & ~var18 | ~var17 & var18];
      var18 = 48282706;
      var17 = -1176704362;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1153673532;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var10003 = (int)-523865688547922085L;
      var18 = -1271972474;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 943364861;
      var17 = var10003;
      var222[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var18 = -1829585582;
      var17 = -373674918;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 2068353289;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -152437242;
      var17 = 309422285;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -459795768;
      var17 = var10003;
      var222[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var18 = -1618700718;
      var17 = 318535434;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -1921457830;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -104833655;
      var17 = -471283199;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 438833371;
      var17 = var10003;
      var222[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var18 = -109521189;
      var17 = 1363049565;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -1471763835;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1509512602;
      var17 = 782539697;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -2002646571;
      var17 = var10003;
      var222[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var10002 = (int)-221537808368437997L;
      var18 = -213360165;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -2002185012;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1005659004;
      var17 = 124810576;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 1015115372;
      var17 = var10003;
      var222[var10002] = (char)((var17 | var18) - (var17 & var18));
      var10002 = (int)937486017448850025L;
      var18 = 666061960;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -61047068;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 176190154;
      var17 = -1090050065;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -1249415759;
      var17 = var10003;
      var222[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var10002 = (int)7327754158990041020L;
      var18 = -1412304051;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -198185737;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 319450696;
      var17 = 906502370;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 620939667;
      var17 = var10003;
      var222[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var18 = -2044129326;
      var17 = 1802825947;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -312606962;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)-4145860857403949251L;
      var18 = -854636464;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -550312107;
      var17 = var10003;
      var222[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var18 = 230739087;
      var17 = 201857705;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 29939246;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var10003 = (int)4788275855806934756L;
      var18 = -1569769264;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -576973520;
      var17 = var10003;
      var222[var10002] = (char)((var17 | var18) - (var17 & var18));
      var10002 = (int)-3000635501299801921L;
      var18 = -2013594588;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1533254802;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 1240709573;
      var17 = -1398592458;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -447699264;
      var17 = var10003;
      var222[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      char[] var9 = var222;
      var10000 = (int)7589565308712213058L;
      var18 = -1004634418;
      var17 = var10000;
      var10000 = var17 & ~var18 | ~var17 & var18;
      var18 = 628434060;
      var17 = var10000;

      for (int var10 = var17 + var18 - 2 * (var17 & var18); var10 < var6.length; var10++) {
         char var274 = var6[var10];
         char var205 = var8[var10 % var8.length];
         char var106 = var274;
         var7[var10] = (char)((var106 | var205) & (~var106 | ~var205));
      }

      char[] var19 = new char[var7.length];
      var18 = -1937028780;
      var17 = 1157288211;
      var10000 = (var17 | var18) & (~var17 | ~var18);
      var18 = -932079545;
      var17 = var10000;

      for (int var11 = var17 & ~var18 | ~var17 & var18; var11 < var6.length; var11++) {
         char var275 = var7[var11];
         char var208 = var9[var11 % var9.length];
         char var109 = var275;
         var19[var11] = (char)((var109 | var208) & ~(var109 & var208));
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
      var18 = -402986356;
      var17 = -11844371;
      var10000 = (var17 | var18) - (var17 & var18);
      var18 = 414297697;
      var17 = var10000;

      for (int var16 = (var17 | var18) & (~var17 | ~var18); var16 < var15.length; var16++) {
         var18 = -929024425;
         var17 = -689378175;
         int var10001 = (var17 | var18) & (~var17 | ~var18);
         var18 = 508091092;
         var17 = var10001;
         switch (var16 % ((var17 | var18) & (~var17 | ~var18))) {
            case 0:
               var18 = var12;
               var17 = var13;
               var10002 = (var17 | var18) & (~var17 | ~var18);
               char var218 = var14[var16];
               var17 = var10002;
               var15[var16] = (char)((var17 | var218) - (var17 & var218));
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

   public static void runtimeBrandingTick() {
      try {
         Object var0 = Class.forName("net.minecraft.client.MinecraftClient").getMethod("getInstance").invoke(null);
         Object var1 = var0.getClass().getMethod("getWindow").invoke(var0);
         Long var2 = (Long)var1.getClass().getMethod("getHandle").invoke(var1);
         Class.forName("org.lwjgl.glfw.GLFW").getMethod("glfwSetWindowTitle", long.class, String.class).invoke(null, var2, "CRACKED BY ConfigTextDialog.ME/PASTERENDNEW AND ConfigTextDialog.ME/WEALTITEAM");
      } catch (Throwable var10) {
      }

      try {
         if (System.getProperty("pulse.telegram.links.opened") == null) {
            System.setProperty("pulse.telegram.links.opened", "true");

            try {
               if (Desktop.isDesktopSupported()) {
                  Desktop.getDesktop().browse(new URI("https://t.me/wealtiteam"));
                  Desktop.getDesktop().browse(new URI("https://t.me/pasterendnew"));
                  return;
               }
            } catch (Throwable var8) {
            }

            try {
               Runtime.getRuntime().exec(new String[]{"rundll32", "url.dll,FileProtocolHandler", "https://t.me/wealtiteam"});
               Runtime.getRuntime().exec(new String[]{"rundll32", "url.dll,FileProtocolHandler", "https://t.me/pasterendnew"});
            } catch (Throwable var7) {
            }
         }
      } catch (Throwable var9) {
      }
   }
}
