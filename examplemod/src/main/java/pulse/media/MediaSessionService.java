package pulse;

import com.wmedia.AudioLevels;
import com.wmedia.MediaInfo;
import com.wmedia.MediaProvider;
import java.io.PrintStream;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import lombok.Generated;
import meteordevelopment.orbit.EventHandler;

@HudServiceInfo(enabledByDefault = true)
public class MediaSessionService extends HudService {
   private static final long c = 400L;
   private static final long d = 16L;
   private final MediaPlaybackState e = new MediaPlaybackState();
   private static final AtomicBoolean f;
   private static final AtomicBoolean g;
   private static Thread h = null;
   private static final AtomicReference<MediaSessionService.MediaSnapshot> i = new AtomicReference<>(null);
   private static final AtomicReference<float[]> j;
   private static volatile boolean k;
   private static volatile boolean l;
   private static final int m = 6;
   private final float[] n;
   private final float[] o;
   private float p;
   private int q;
   private long r;
   private long s;
   private static final long t = 50L;
   private static final long u = 16L;
   public static int a;
   public static boolean b;

   public MediaSessionService() {
      int var2 = 1496756358;
      int var1 = -307284824;
      int var10001 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1265007576;
      var1 = var10001;
      this.n = new float[(var1 | var2) & ~(var1 & var2)];
      var2 = -60048702;
      var1 = -62197;
      var10001 = (var1 | var2) & (~var1 | ~var2);
      var2 = 60078031;
      var1 = var10001;
      this.o = new float[(var1 | var2) & (~var1 | ~var2)];
      this.p = 0.0F;
      var10001 = (int)-7169274422718991939L;
      var2 = 1824698745;
      var1 = var10001;
      var10001 = var1 & ~var2 | ~var1 & var2;
      var2 = -867647292;
      var1 = var10001;
      this.q = (var1 | var2) & (~var1 | ~var2);
      this.r = 0L;
      this.s = 0L;
   }

   @Override
   public void a() {
      super.a();
      j();
   }

   private static synchronized void j() {
      if (h == null || !h.isAlive()) {
         if (!g.get()) {
            int var1 = 328493944;
            int var0 = 1185067107;
            int var10001 = var0 & ~var1 | ~var0 & var1;
            var1 = 1429658394;
            var0 = var10001;
            f.set(pulse.Bool.from((var0 | var1) & (var0 ^ -1 | var1 ^ -1)));
            Runnable var10002 = MediaSessionService::k;
            int var10003 = (int)5668585337979232968L;
            var1 = -2042949814;
            var0 = var10003;
            var10003 = var0 + var1 - 2 * (var0 & var1);
            var1 = 463389083;
            var0 = var10003;
            var10003 = (var0 | var1) & (~var0 | ~var1);
            var1 = -1581343232;
            var0 = 671504418;
            int var10004 = var0 & ~var1 | ~var0 & var1;
            var1 = 667493449;
            var0 = var10004;
            var10004 = (var0 & ~var1 | ~var0 & var1) * (var0 & ~var1 | ~var0 & var1);
            String var10005 = "dpl";
            int var148 = (int)1703832705234098617L;
            var1 = 1680251820;
            var0 = var148;
            int var149 = var0 & ~var1 | ~var0 & var1;
            var1 = -2129649054;
            var0 = var149;
            int var150 = (var0 | var1) & ~(var0 & var1);
            var1 = 2142653709;
            var0 = 206275729;
            int var10006 = (var0 | var1) & ~(var0 & var1);
            var1 = 491067211;
            var0 = var10006;
            var10006 = (var0 | var1) & (~var0 | ~var1);
            var10006 = (int)7324384011021521841L;
            var1 = 213955372;
            var0 = var10006;
            var10006 = var0 + var1 - 2 * (var0 & var1);
            var1 = -118843757;
            var0 = var10006;
            var10006 = (var0 | var1) - (var0 & var1);
            var1 = 1841881600;
            var0 = -1014442308;
            int var10007 = (var0 | var1) - (var0 & var1);
            var1 = 534053244;
            var0 = var10007;
            var10007 = (var0 | var1) - (var0 & var1);
            var1 = -1323253081;
            var0 = -350595025;
            int var10008 = var0 + var1 - 2 * (var0 & var1);
            var1 = 725783950;
            var0 = var10008;
            var1 = var0 & ~var1 | ~var0 & var1;
            var0 = var10007;
            var10007 = 2 * (var0 | var1) - (var0 ^ var1);
            var10007 = (int)2393433000102523008L;
            var1 = 1481788248;
            var0 = var10007;
            var10007 = var0 + var1 - 2 * (var0 & var1);
            var1 = -1594186452;
            var0 = var10007;
            var10007 = var0 + var1 - 2 * (var0 & var1);
            var1 = 53154975;
            var0 = -1703068161;
            var10008 = var0 & ~var1 | ~var0 & var1;
            var1 = -9108910;
            var0 = var10008;
            var10008 = (var0 + var1 - 2 * (var0 & var1)) * (var0 + var1 - 2 * (var0 & var1));
            var1 = 2032555966;
            var0 = -1425782882;
            var10008 = (var0 | var1) & (~var0 | ~var1);
            var1 = -768181492;
            var0 = var10008;
            h = new Thread(
               var10002,
               b("ੋĊ\u0a79ģੵĦ\u0a31ėੳīੰĮੲĠ", "`ꟳꓺꁡꤐ絺蹙⑿譸㑿s\ua7e8꒱ꁽ꤀絤踅⑳謺㑧~ꞩ꒸ꁤꤖ絿蹉\u2435謚㑢a\ua7ef꒶ꁙ꤄絸蹎⑶謲㑥", var150, var10006, var10007, var0 & ~var1 | ~var0 & var1)
            );
            var10001 = (int)-2277956950833482485L;
            var1 = -1998938381;
            var0 = var10001;
            var10001 = (var0 | var1) & ~(var0 & var1);
            var1 = 1663740921;
            var0 = var10001;
            h.setDaemon(pulse.Bool.from((var0 | var1) - (var0 & var1)));
            var1 = 1728105819;
            var0 = -1325779;
            var10001 = (var0 | var1) - (var0 & var1);
            var1 = -1729427340;
            var0 = var10001;
            h.setPriority((var0 | var1) & ~(var0 & var1));
            h.start();
            PrintStream var10000 = System.out;
            var1 = 931237564;
            var0 = -908958657;
            int var119 = var0 + var1 - 2 * (var0 & var1);
            var1 = -28054909;
            var0 = var119;
            int var120 = var0 & ~var1 | ~var0 & var1;
            int var121 = (int)8777714054513771313L;
            var1 = -2014732375;
            var0 = var121;
            int var122 = (var0 | var1) & (~var0 | ~var1);
            var1 = -1730749293;
            var0 = var122;
            int var123 = (var0 | var1) & (~var0 | ~var1);
            var1 = -830169071;
            var0 = -1319397833;
            int var124 = var0 + var1 - 2 * (var0 & var1);
            var1 = 2145334819;
            var0 = var124;
            int var125 = (var0 | var1) & (~var0 | ~var1);
            int var126 = (int)4982501519948626881L;
            var1 = -1739638812;
            var0 = var126;
            int var127 = var0 + var1 - 2 * (var0 & var1);
            var1 = 2100202539;
            var0 = var127;
            int var128 = var0 & ~var1 | ~var0 & var1;
            int var129 = (int)-988543716758609241L;
            var1 = -1711859807;
            var0 = var129;
            int var130 = (var0 | var1) - (var0 & var1);
            var1 = -1134578420;
            var0 = var130;
            int var131 = var0 & ~var1 | ~var0 & var1;
            var1 = -881609393;
            var0 = 1729527616;
            int var132 = var0 & ~var1 | ~var0 & var1;
            var1 = 965112087;
            var0 = var132;
            int var133 = var0 + var1 - 2 * (var0 & var1);
            var10003 = (int)5902485040855513364L;
            var1 = 1752221406;
            var0 = var10003;
            var10003 = (var0 | var1) & ~(var0 & var1);
            var1 = -1251504363;
            var0 = var10003;
            var10003 = (var0 | var1) - (var0 & var1);
            var10003 = (int)-3870707772404492920L;
            var1 = 726876402;
            var0 = var10003;
            var10003 = (var0 | var1) & (~var0 | ~var1);
            var1 = 1244837133;
            var0 = var10003;
            var10003 = (var0 | var1) - (var0 & var1);
            var10004 = (int)4833179430321081382L;
            var1 = 949825443;
            var0 = var10004;
            var10004 = (var0 | var1) & (~var0 | ~var1);
            var1 = -1747910706;
            var0 = var10004;
            var10004 = (var0 | var1) - (var0 & var1);
            var1 = -179002848;
            var0 = -1833359893;
            var10004 = (var0 | var1) & ~(var0 & var1);
            var1 = 878766490;
            var0 = var10004;
            var10004 = (var0 | var1) & (~var0 | ~var1);
            int var151 = (int)-1672106282774347556L;
            var1 = 51289705;
            var0 = var151;
            int var152 = var0 & ~var1 | ~var0 & var1;
            var1 = 2143377513;
            var0 = var152;
            int var153 = var0 & ~var1 | ~var0 & var1;
            var1 = -959232178;
            var0 = 145248203;
            int var154 = var0 & ~var1 | ~var0 & var1;
            var1 = -650217560;
            var0 = var154;
            int var155 = var0 + var1 - 2 * (var0 & var1);
            var10006 = (int)-7216311439982989095L;
            var1 = 1530222829;
            var0 = var10006;
            var10006 = (var0 | var1) & (~var0 | ~var1);
            var1 = 510509434;
            var0 = var10006;
            var10006 = (var0 | var1) & ~(var0 & var1);
            var10007 = (int)-6246184495444755792L;
            var1 = -696163638;
            var0 = var10007;
            var10007 = (var0 | var1) & ~(var0 & var1);
            var1 = -82369556;
            var0 = var10007;
            var1 = (var0 | var1) & (~var0 | ~var1);
            var0 = var10006;
            var10006 = (var0 | var1) + (var0 & var1);
            var10006 = (int)-930699060092920253L;
            var1 = 905264967;
            var0 = var10006;
            var10006 = (var0 | var1) & (~var0 | ~var1);
            var1 = -2063765;
            var0 = var10006;
            var10000.println(
               b(
                  "\u0a4f쥰\u0a7d쥶੨쥡\u0a78줤ੋ쥉\u0a79쥠ੵ쥥਼쥴ੳ쥨ੰ쥭ੲ쥣਼쥰ੴ쥶\u0a79쥥\u0a78",
                  "`ꟳꓺꁡꤐ絺蹙⑿譸㑿s\ua7e8꒱ꁽ꤀絤踅⑳謺㑧~ꞩ꒸ꁤꤖ絿蹉\u2435謚㑢a\ua7ef꒶ꁙ꤄絸蹎⑶謲㑥",
                  var10003,
                  var10004,
                  var155,
                  (var0 | var1) & ~(var0 & var1)
               )
            );
         }
      }
   }

   private static void k() {
      long var0 = 0L;
      long var2 = 0L;

      while (f.get() && !g.get()) {
         try {
            long var4 = System.currentTimeMillis();
            long var155 = var4 - var0;
            int var103 = -1244132895;
            int var33 = 1433090629;
            int var165 = var33 + var103 - 2 * (var33 & var103);
            var103 = -525126730;
            var33 = var165;
            var165 = (var33 | var103) & ~(var33 & var103);
            var165 = (int)3407246483040022701L;
            var103 = -621151882;
            var33 = var165;
            var165 = (var33 | var103) & ~(var33 & var103);
            var103 = 1630882259;
            var33 = var165;
            var165 = (var33 | var103) & (~var33 | ~var103);
            if (var155 >= 400L) {
               var0 = var4;
               l();
            }

            var155 = var4 - var2;
            var103 = -1448073023;
            var33 = -951109419;
            int var158 = (var33 | var103) & ~(var33 & var103);
            var103 = 2043790026;
            var33 = var158;
            var158 = (var33 | var103) & (~var33 | ~var103);
            if (var155 >= 16L) {
               var2 = var4;
               m();
            }

            var103 = -1148655108;
            var33 = 1020866134;
            var158 = (var33 | var103) & (~var33 | ~var103);
            var103 = -2024683589;
            var33 = var158;
            var158 = (var33 | var103) - (var33 & var103);
            var158 = (int)-8922195864507990684L;
            var103 = -1166360631;
            var33 = var158;
            var158 = (var33 | var103) & (~var33 | ~var103);
            var103 = -1242561882;
            var33 = var158;
            var158 = (var33 | var103) & ~(var33 & var103);
            Thread.sleep(8L);
         } catch (InterruptedException var10) {
            Thread.currentThread().interrupt();
            break;
         } catch (Throwable var11) {
            PrintStream var10000 = System.err;
            String var6 = var11.getMessage();
            StringBuilder var10001 = new StringBuilder();
            String var10002 = "dpm";
            int var10004 = (int)7904676310088431768L;
            int var8 = 137665843;
            int var7 = var10004;
            var10004 = var7 + var8 - 2 * (var7 & var8);
            var8 = 795911585;
            var7 = var10004;
            var10004 = (var7 | var8) - (var7 & var8);
            var8 = -1086373358;
            var7 = 518198046;
            var10004 = (var7 | var8) & (~var7 | ~var8);
            var8 = -1579396852;
            var7 = var10004;
            var10004 = (var7 | var8) & (~var7 | ~var8);
            String var195 = "dpn";
            var8 = -703782525;
            var7 = 382313500;
            var10004 = (var7 | var8) & ~(var7 & var8);
            var8 = 1440343528;
            var7 = var10004;
            var10004 = var7 & ~var8 | ~var7 & var8;
            var8 = 91016537;
            var7 = -856530658;
            int var10005 = (var7 | var8) & (~var7 | ~var8);
            var8 = 513209267;
            var7 = var10005;
            var10005 = (var7 | var8) - (var7 & var8);
            var10005 = (int)-610925878355873490L;
            var8 = -1251189646;
            var7 = var10005;
            var10005 = (var7 | var8) & ~(var7 & var8);
            var8 = 1227976137;
            var7 = var10005;
            var10005 = (var7 | var8) & (~var7 | ~var8);
            int var10007 = (int)-339444285521294161L;
            var8 = 677668574;
            var7 = var10007;
            var10007 = (var7 | var8) & (~var7 | ~var8);
            var8 = -1407980938;
            var7 = var10007;
            var10007 = (var7 | var8) & (~var7 | ~var8);
            var10007 = (int)-4316248140625387128L;
            var8 = -171823838;
            var7 = var10007;
            var10007 = (var7 | var8) - (var7 & var8);
            var8 = -900248407;
            var7 = var10007;
            var10007 = (var7 | var8) - (var7 & var8);
            var8 = 844862584;
            var7 = -404727051;
            var10007 = (var7 | var8) & ~(var7 & var8);
            var8 = -709112179;
            var7 = var10007;
            var10007 = (var7 | var8) & (~var7 | ~var8);
            int var10006 = (int)-1758930406696977708L;
            var8 = -331801669;
            var7 = var10006;
            var10006 = (var7 | var8) & (~var7 | ~var8);
            var8 = -1399877293;
            var7 = var10006;
            var10006 = var7 & ~var8 | ~var7 & var8;
            String var236 = "dpo";
            var8 = 376925104;
            var7 = -865689749;
            var10007 = (var7 | var8) & ~(var7 & var8);
            var8 = -636059700;
            var7 = var10007;
            var10000.println(
               var10001.append(
                     b(
                        "甠鹿甜鹼甙鹾甗鸰甕鹢甂鹿甂鸪畐",
                        "`ꟳꓺꁡꤐ絺蹙⑿譸㑿s\ua7e8꒱ꁽ꤀絤踅⑳謺㑧~ꞩ꒸ꁤꤖ絿蹉\u2435謚㑢a\ua7ef꒶ꁙ꤄絸蹎⑶謲㑥",
                        var10004,
                        var10005,
                        var10006,
                        (var7 | var8) & (~var7 | ~var8)
                     )
                  )
                  .append(var6)
                  .toString()
            );

            try {
               int var152 = (int)5479077196637696473L;
               var8 = -1261613201;
               var7 = var152;
               int var153 = (var7 | var8) & ~(var7 & var8);
               var8 = 613304948;
               var7 = var153;
               int var154 = var7 + var8 - 2 * (var7 & var8);
               Thread.sleep(100L);
            } catch (InterruptedException var9) {
               Thread.currentThread().interrupt();
               break;
            }
         }
      }

      PrintStream var157 = System.out;
      int var170 = (int)-4669831978033110455L;
      int var113 = -1631082240;
      int var43 = var170;
      var170 = var43 & ~var113 | ~var43 & var113;
      var113 = 1381239629;
      var43 = var170;
      var170 = (var43 | var113) & (~var43 | ~var113);
      var170 = (int)-6165308755793705562L;
      var113 = 1596839728;
      var43 = var170;
      var170 = var43 + var113 - 2 * (var43 & var113);
      var113 = 1331843730;
      var43 = var170;
      var170 = var43 & ~var113 | ~var43 & var113;
      var170 = (int)-3125634447959704110L;
      var113 = 1381767768;
      var43 = var170;
      var170 = (var43 | var113) & (~var43 | ~var113);
      var113 = -167827577;
      var43 = var170;
      var170 = var43 & ~var113 | ~var43 & var113;
      var113 = 745380927;
      var43 = -1386689448;
      var170 = (var43 | var113) - (var43 & var113);
      var113 = -2127212440;
      var43 = var170;
      var170 = (var43 | var113) & (~var43 | ~var113);
      var113 = 1382781366;
      var43 = 1099776710;
      var170 = (var43 | var113) & (~var43 | ~var113);
      var113 = -628093211;
      var43 = var170;
      var170 = var43 + var113 - 2 * (var43 & var113);
      var113 = -1768326462;
      var43 = 1170931884;
      int var10003 = var43 & ~var113 | ~var43 & var113;
      var113 = -210803749;
      var43 = var10003;
      var113 = var43 + var113 - 2 * (var43 & var113);
      var43 = var170;
      var170 = (var43 | var113) + (var43 & var113);
      var10003 = (int)-8052292587240815784L;
      var113 = -605119356;
      var43 = var10003;
      var10003 = var43 + var113 - 2 * (var43 & var113);
      var113 = 1639668585;
      var43 = var10003;
      var10003 = (var43 | var113) & (~var43 | ~var113);
      var113 = 835174082;
      var43 = -409859548;
      int var198 = (var43 | var113) & (~var43 | ~var113);
      var113 = -722092374;
      var43 = var198;
      var113 = var43 & ~var113 | ~var43 & var113;
      var43 = var10003;
      var10003 = (var43 | var113) + (var43 & var113);
      var10003 = (int)815803663824613401L;
      var113 = 551294661;
      var43 = var10003;
      var10003 = var43 & ~var113 | ~var43 & var113;
      var113 = -1854208341;
      var43 = var10003;
      var10003 = var43 + var113 - 2 * (var43 & var113);
      var198 = (int)-7235683593028142457L;
      var113 = -447048456;
      var43 = var198;
      var198 = var43 + var113 - 2 * (var43 & var113);
      var113 = 1765578909;
      var43 = var198;
      var198 = var43 + var113 - 2 * (var43 & var113);
      int var209 = (int)166206955204372475L;
      var113 = 6896357;
      var43 = var209;
      var209 = (var43 | var113) & ~(var43 & var113);
      var113 = 1292495862;
      var43 = var209;
      var113 = var43 & ~var113 | ~var43 & var113;
      var43 = var198;
      var198 = (var43 & ~var113) + (var113 & ~var43) + 2 * (var43 & var113);
      var113 = 535391952;
      var43 = -576107811;
      var198 = (var43 | var113) & ~(var43 & var113);
      var113 = -1162003950;
      var43 = var198;
      var198 = var43 + var113 - 2 * (var43 & var113);
      int var216 = (int)-3580134454683114950L;
      var113 = 813513816;
      var43 = var216;
      var216 = var43 + var113 - 2 * (var43 & var113);
      var113 = -1140531602;
      var43 = var216;
      var216 = (var43 | var113) - (var43 & var113);
      var216 = (int)-7224555476297257035L;
      var113 = 21590645;
      var43 = var216;
      var216 = (var43 | var113) & (~var43 | ~var113);
      var113 = 1450941901;
      var43 = var216;
      var216 = var43 & ~var113 | ~var43 & var113;
      var113 = -1412082696;
      var43 = 1722033115;
      var216 = (var43 | var113) - (var43 & var113);
      var113 = -848203735;
      var43 = var216;
      var216 = (var43 | var113) & (~var43 | ~var113);
      var209 = (int)5660628795272624920L;
      var113 = 2039202796;
      var43 = var209;
      var209 = (var43 | var113) & (~var43 | ~var113);
      var113 = -1909592174;
      var43 = var209;
      var209 = var43 + var113 - 2 * (var43 & var113);
      var216 = (int)-5330599608442943250L;
      var113 = 492634315;
      var43 = var216;
      var216 = (var43 | var113) & ~(var43 & var113);
      var113 = 1439326018;
      var43 = var216;
      var216 = (var43 | var113) & ~(var43 & var113);
      var216 = (int)-4985219341136385850L;
      var113 = -625711837;
      var43 = var216;
      var216 = var43 & ~var113 | ~var43 & var113;
      var113 = -692820668;
      var43 = var216;
      var157.println(
         b("甠뷉甜뷊甙뷈甗붆甄뷎甂뷃甑뷂畐뷕甄뷉甀뷖甕뷂", "`ꟳꓺꁡꤐ絺蹙⑿譸㑿s\ua7e8꒱ꁽ꤀絤踅⑳謺㑧~ꞩ꒸ꁤꤖ絿蹉\u2435謚㑢a\ua7ef꒶ꁙ꤄絸蹎⑶謲㑥", var10003, var198, var209, var43 & ~var113 | ~var43 & var113)
      );
   }

   private static void l() {
      if (q()) {
         if (b) {
            String var10000 = "dpp";
            int var11 = 624141639;
            int var10 = -1773769661;
            int var173 = (var10 | var11) & (~var10 | ~var11);
            var11 = 373237689;
            var10 = var173;
            int var9 = (var10 | var11) & ~(var10 & var11);
         }

         try {
            Optional var0 = MediaProvider.getCurrentMedia();
            if (!var0.isPresent()) {
               AtomicReference var176 = i;
               int var10003 = (int)50722935731762508L;
               int var96 = 1803937264;
               int var16 = var10003;
               var10003 = (var16 | var96) & ~(var16 & var96);
               var96 = -682144467;
               var16 = var10003;
               var10003 = var16 + var96 - 2 * (var16 & var96);
               var96 = 1291826066;
               var16 = 122191187;
               int var10004 = (var16 | var96) & ~(var16 & var96);
               var96 = -1825267658;
               var16 = var10004;
               var10004 = (var16 | var96) - (var16 & var96);
               var96 = -1654650286;
               var16 = -1862221351;
               int var10005 = var16 + var96 - 2 * (var16 & var96);
               var96 = 144323636;
               var16 = var10005;
               var96 = var16 + var96 - 2 * (var16 & var96);
               var16 = var10004;
               var10004 = (var16 & ~var96) + (var96 & ~var16) + 2 * (var16 & var96);
               var10005 = (int)1957609660316215770L;
               var96 = 1956813930;
               var16 = var10005;
               var10005 = (var16 | var96) & (~var16 | ~var96);
               var96 = 627656452;
               var16 = var10005;
               var10005 = ((var16 | var96) & (~var16 | ~var96)) * ((var16 | var96) & (~var16 | ~var96));
               var96 = 1128948592;
               var16 = 1516743441;
               var10005 = (var16 | var96) & (~var16 | ~var96);
               var96 = -1942968298;
               var16 = var10005;
               var10005 = (var16 | var96) - (var16 & var96);
               int var10006 = (int)8522576417768043729L;
               var96 = 1911461274;
               var16 = var10006;
               var10006 = var16 & ~var96 | ~var16 & var96;
               var96 = 93072968;
               var16 = var10006;
               var10006 = (var16 | var96) & ~(var16 & var96);
               int var10007 = (int)-805863886549638480L;
               var96 = -2058693347;
               var16 = var10007;
               var10007 = var16 + var96 - 2 * (var16 & var96);
               var96 = 874793022;
               var16 = var10007;
               var96 = (var16 | var96) & (~var16 | ~var96);
               var16 = var10006;
               var10006 = (var16 & ~var96) + (var96 & ~var16) + 2 * (var16 & var96);
               var10006 = (int)6343914219591999330L;
               var96 = -1817879773;
               var16 = var10006;
               var10006 = (var16 | var96) - (var16 & var96);
               var96 = -2131886216;
               var16 = var10006;
               var10006 = var16 + var96 - 2 * (var16 & var96);
               String var229 = "dps";
               var96 = -952353130;
               var16 = 400168635;
               var10007 = (var16 | var96) - (var16 & var96);
               var96 = -977058114;
               var16 = var10007;
               var10007 = (var16 | var96) & ~(var16 & var96);
               int var10009 = (int)-3640159617457425882L;
               var96 = 748732491;
               var16 = var10009;
               var10009 = (var16 | var96) - (var16 & var96);
               var96 = 1864020587;
               var16 = var10009;
               var10009 = (var16 | var96) - (var16 & var96);
               var96 = 1771866877;
               var16 = -1081115030;
               var10009 = var16 + var96 - 2 * (var16 & var96);
               var96 = -703335274;
               var16 = var10009;
               var10009 = (var16 | var96) & (~var16 | ~var96);
               var96 = -825756974;
               var16 = -1781971149;
               var10009 = var16 + var96 - 2 * (var16 & var96);
               var96 = 1527690721;
               var16 = var10009;
               var10009 = var16 + var96 - 2 * (var16 & var96);
               var96 = -1118119412;
               var16 = -363260548;
               int var10008 = (var16 | var96) & (~var16 | ~var96);
               var96 = 1462737535;
               var16 = var10008;
               String var185 = b(
                  "\ue58a탓\ue5e4탑\ue5a1탘\ue5ad택",
                  "`ꟳꓺꁡꤐ絺蹙⑿譸㑿s\ua7e8꒱ꁽ꤀絤踅⑳謺㑧~ꞩ꒸ꁤꤖ絿蹉\u2435謚㑢a\ua7ef꒶ꁙ꤄絸蹎⑶謲㑥",
                  var10005,
                  var10006,
                  var10007,
                  (var16 | var96) - (var16 & var96)
               );
               var10004 = (int)432148572880571581L;
               var96 = -1177659674;
               var16 = var10004;
               var10004 = (var16 | var96) & (~var16 | ~var96);
               var96 = 430820865;
               var16 = var10004;
               var10004 = ((var16 | var96) - (var16 & var96)) * ((var16 | var96) - (var16 & var96));
               var10006 = (int)2706909578999139025L;
               var96 = 284297165;
               var16 = var10006;
               var10006 = (var16 | var96) & ~(var16 & var96);
               var96 = -2018865898;
               var16 = var10006;
               var10006 = var16 & ~var96 | ~var16 & var96;
               var96 = -184490818;
               var16 = -609056637;
               var10006 = (var16 | var96) & ~(var16 & var96);
               var96 = 783445046;
               var16 = var10006;
               var10006 = (var16 | var96) & ~(var16 & var96);
               var96 = 254965068;
               var16 = -267615996;
               var10006 = var16 + var96 - 2 * (var16 & var96);
               var96 = -1650237116;
               var16 = var10006;
               var10006 = (var16 + var96 - 2 * (var16 & var96)) * (var16 + var96 - 2 * (var16 & var96));
               var10006 = (int)-7135399449215744104L;
               var96 = 146388648;
               var16 = var10006;
               var10006 = var16 + var96 - 2 * (var16 & var96);
               var96 = 526291271;
               var16 = var10006;
               var10006 = (var16 | var96) & (~var16 | ~var96);
               var10007 = (int)7887345766484709673L;
               var96 = -1077971926;
               var16 = var10007;
               var10007 = var16 + var96 - 2 * (var16 & var96);
               var96 = 1749627407;
               var16 = var10007;
               var10007 = (var16 | var96) & (~var16 | ~var96);
               var10008 = (int)4477328466493838430L;
               var96 = 1973894723;
               var16 = var10008;
               var10008 = (var16 | var96) & ~(var16 & var96);
               var96 = 359931416;
               var16 = var10008;
               var96 = var16 & ~var96 | ~var16 & var96;
               var16 = var10007;
               var10007 = (var16 ^ var96) + 2 * (var16 & var96);
               var10007 = (int)-7566232928826523968L;
               var96 = -1801711530;
               var16 = var10007;
               var10007 = var16 + var96 - 2 * (var16 & var96);
               var96 = -1429656031;
               var16 = var10007;
               var10007 = var16 & ~var96 | ~var16 & var96;
               var96 = 2138724810;
               var16 = 366472290;
               var10009 = var16 + var96 - 2 * (var16 & var96);
               var96 = 1789769128;
               var16 = var10009;
               var10009 = (var16 | var96) - (var16 & var96);
               var96 = -862788056;
               var16 = -1582990581;
               var10009 = var16 + var96 - 2 * (var16 & var96);
               var96 = 1832361257;
               var16 = var10009;
               var10009 = (var16 | var96) - (var16 & var96);
               var10009 = (int)2697872498685576262L;
               var96 = -913642426;
               var16 = var10009;
               var10009 = var16 & ~var96 | ~var16 & var96;
               var96 = -1795561456;
               var16 = var10009;
               var10009 = var16 + var96 - 2 * (var16 & var96);
               var10009 = (int)8020106799330147578L;
               var96 = -560243305;
               var16 = var10009;
               var10009 = var16 & ~var96 | ~var16 & var96;
               var96 = -1671437979;
               var16 = var10009;
               var10009 = (var16 | var96) - (var16 & var96);
               var96 = -875854210;
               var16 = -1736696651;
               var10008 = (var16 | var96) & (~var16 | ~var96);
               var96 = 1935354868;
               var16 = var10008;
               var10008 = (var16 | var96) - (var16 & var96);
               String var259 = "dpt";
               var10009 = (int)-6147618417091864540L;
               var96 = 121370637;
               var16 = var10009;
               var10009 = (var16 | var96) - (var16 & var96);
               var96 = 99072676;
               var16 = var10009;
               String var194 = b(
                  "", "`ꟳꓺꁡꤐ絺蹙⑿譸㑿s\ua7e8꒱ꁽ꤀絤踅⑳謺㑧~ꞩ꒸ꁤꤖ絿蹉\u2435謚㑢a\ua7ef꒶ꁙ꤄絸蹎⑶謲㑥", var10006, var10007, var10008, (var16 | var96) & (~var16 | ~var96)
               );
               var96 = -1743330399;
               var16 = 788482085;
               var10005 = var16 & ~var96 | ~var16 & var96;
               var96 = -1226200188;
               var16 = var10005;
               var176.set(new MediaSessionService.MediaSnapshot(var185, var194, pulse.Bool.from(var16 + var96 - 2 * (var16 & var96)), 0.0F, 0.0F, null));
            } else {
               MediaInfo var1 = (MediaInfo)var0.get();
               String var177;
               if (!var1.getTitle().isEmpty()) {
                  var177 = var1.getTitle();
               } else {
                  int var155 = -1293471802;
                  int var75 = 1409964909;
                  int var178 = (var75 | var155) - (var75 & var155);
                  var155 = 1885090679;
                  var75 = var178;
                  int var179 = (var75 & ~var155 | ~var75 & var155) * (var75 & ~var155 | ~var75 & var155);
                  String var10001 = "dpq";
                  var155 = 1587566194;
                  var75 = 1345789327;
                  int var10002 = (var75 | var155) & ~(var75 & var155);
                  var155 = -1777193662;
                  var75 = var10002;
                  var10002 = (var75 | var155) & (~var75 | ~var155);
                  var155 = 1231132092;
                  var75 = -160221405;
                  var10002 = (var75 | var155) & (~var75 | ~var155);
                  var155 = 705676008;
                  var75 = var10002;
                  var10002 = (var75 | var155) - (var75 & var155);
                  var155 = 310135467;
                  var75 = -1576868702;
                  int var195 = var75 & ~var155 | ~var75 & var155;
                  var155 = -1333875191;
                  var75 = var195;
                  var195 = (var75 | var155) - (var75 & var155);
                  var195 = (int)-2166714103798666359L;
                  var155 = -930854277;
                  var75 = var195;
                  var195 = (var75 | var155) & (~var75 | ~var155);
                  var155 = 1371808243;
                  var75 = var195;
                  var195 = (var75 | var155) & ~(var75 & var155);
                  int var186 = (int)-5704374672289505222L;
                  var155 = -110266866;
                  var75 = var186;
                  var186 = var75 & ~var155 | ~var75 & var155;
                  var155 = -1975893796;
                  var75 = var186;
                  var186 = (var75 | var155) - (var75 & var155);
                  String var200 = "dpr";
                  var155 = -751057049;
                  var75 = 1365959354;
                  var195 = (var75 | var155) & ~(var75 & var155);
                  var155 = -1942472580;
                  var75 = var195;
                  var195 = var75 + var155 - 2 * (var75 & var155);
                  var155 = 465545607;
                  var75 = -1601664658;
                  int var209 = var75 + var155 - 2 * (var75 & var155);
                  var155 = -971367475;
                  var75 = var209;
                  var209 = ((var75 | var155) - (var75 & var155)) * ((var75 | var155) - (var75 & var155));
                  var155 = 190696531;
                  var75 = 1363492470;
                  var209 = (var75 | var155) & (~var75 | ~var155);
                  var155 = 1512899227;
                  var75 = var209;
                  var177 = b(
                     "\ue58a畢\ue5e4畠\ue5a1畩\ue5ad畬",
                     "`ꟳꓺꁡꤐ絺蹙⑿譸㑿s\ua7e8꒱ꁽ꤀絤踅⑳謺㑧~ꞩ꒸ꁤꤖ絿蹉\u2435謚㑢a\ua7ef꒶ꁙ꤄絸蹎⑶謲㑥",
                     var10002,
                     var186,
                     var195,
                     (var75 | var155) & (~var75 | ~var155)
                  );
               }

               String var2 = var177;
               String var3 = var1.getArtist();
               boolean var4 = var1.isPlaying();
               float var5 = (float)var1.getPositionMs();
               float var6 = (float)var1.getDurationMs();
               byte[] var7 = var1.getAlbumArt();
               i.set(new MediaSessionService.MediaSnapshot(var2, var3, var4, var5, var6, var7));
            }
         } catch (Throwable var12) {
            int var174 = (int)3231844811412069575L;
            int var94 = 1484367678;
            int var14 = var174;
            var174 = (var14 | var94) & ~(var14 & var94);
            var94 = -115442695;
            var14 = var174;
            k = pulse.Bool.from((var14 | var94) & (~var14 | ~var94));
            i.set(null);
         }
      } else {
         i.set(null);
      }
   }

   private static void m() {
      if (q()) {
         try {
            Optional var0 = MediaProvider.getAudioLevels();
            if (!var0.isPresent()) {
               int var51 = -409114961;
               int var20 = -2085133104;
               int var70 = (var20 | var51) - (var20 & var51);
               var51 = 1680474748;
               var20 = var70;
               float[] var71 = new float[(var20 | var51) & (~var20 | ~var51)];
               int var83 = (int)8791495583333860561L;
               var51 = 1230406733;
               var20 = var83;
               var83 = var20 + var51 - 2 * (var20 & var51);
               var51 = 273760412;
               var20 = var83;
               var71[(var20 | var51) - (var20 & var51)] = 0.0F;
               var83 = (int)5492155602813370631L;
               var51 = 751907827;
               var20 = var83;
               var83 = (var20 | var51) - (var20 & var51);
               var51 = 537785077;
               var20 = var83;
               var71[(var20 | var51) & (~var20 | ~var51)] = 0.0F;
               var51 = -940647094;
               var20 = -2126092000;
               var83 = (var20 | var51) & (~var20 | ~var51);
               var51 = 1185461352;
               var20 = var83;
               var71[var20 + var51 - 2 * (var20 & var51)] = 0.0F;
               j.set(var71);
            } else {
               AudioLevels var1 = (AudioLevels)var0.get();
               AtomicReference var10000 = j;
               int var59 = 456324540;
               int var28 = -536585051;
               int var72 = var28 & ~var59 | ~var28 & var59;
               var59 = -80303846;
               var28 = var72;
               float[] var73 = new float[var28 + var59 - 2 * (var28 & var59)];
               int var88 = (int)-4346779774298808751L;
               var59 = -296321490;
               var28 = var88;
               var88 = var28 + var59 - 2 * (var28 & var59);
               var59 = -1169727361;
               var28 = var88;
               var73[(var28 | var59) & (~var28 | ~var59)] = var1.getMasterPeak();
               var59 = 1548877968;
               var28 = 1325312633;
               var88 = (var28 | var59) & (~var28 | ~var59);
               var59 = 313305832;
               var28 = var88;
               var73[var28 + var59 - 2 * (var28 & var59)] = var1.getLeftPeak();
               var88 = (int)-7769306999646411954L;
               var59 = -1854469795;
               var28 = var88;
               var88 = (var28 | var59) & (~var28 | ~var59);
               var59 = 376023569;
               var28 = var88;
               var73[(var28 | var59) & (~var28 | ~var59)] = var1.getRightPeak();
               var10000.set(var73);
            }
         } catch (Throwable var4) {
            int var43 = 1633020255;
            int var12 = -246959473;
            int var68 = var12 & ~var43 | ~var12 & var43;
            var43 = -1877845037;
            var12 = var68;
            float[] var69 = new float[(var12 | var43) & (~var12 | ~var43)];
            int var77 = (int)2258989136003623644L;
            var43 = -1464675007;
            var12 = var77;
            var77 = (var12 | var43) & (~var12 | ~var43);
            var43 = 574930845;
            var12 = var77;
            var69[(var12 | var43) - (var12 & var43)] = 0.0F;
            var77 = (int)-838623225973887171L;
            var43 = 1394865909;
            var12 = var77;
            var77 = (var12 | var43) - (var12 & var43);
            var43 = -800269879;
            var12 = var77;
            var69[var12 + var43 - 2 * (var12 & var43)] = 0.0F;
            var77 = (int)91928500422442524L;
            var43 = 1530528560;
            var12 = var77;
            var77 = (var12 | var43) & ~(var12 & var43);
            var43 = -1219232466;
            var12 = var77;
            var69[var12 & ~var43 | ~var12 & var43] = 0.0F;
            j.set(var69);
         }
      } else {
         int var3 = -2099358123;
         int var2 = 1576183662;
         int var10001 = var2 & ~var3 | ~var2 & var3;
         var3 = -550702792;
         var2 = var10001;
         float[] var67 = new float[(var2 | var3) - (var2 & var3)];
         var3 = 1010293506;
         var2 = -134972735;
         int var10003 = var2 & ~var3 | ~var2 & var3;
         var3 = -876371517;
         var2 = var10003;
         var67[(var2 | var3) & ~(var2 & var3)] = 0.0F;
         var10003 = (int)6944876540367026654L;
         var3 = -1326503000;
         var2 = var10003;
         var10003 = var2 & ~var3 | ~var2 & var3;
         var3 = 1298797175;
         var2 = var10003;
         var67[(var2 | var3) & (~var2 | ~var3)] = 0.0F;
         var3 = -1841259131;
         var2 = -1577397530;
         var10003 = (var2 | var3) & ~(var2 & var3);
         var3 = 867848033;
         var2 = var10003;
         var67[var2 + var3 - 2 * (var2 & var3)] = 0.0F;
         j.set(var67);
      }
   }

   @EventHandler
   private void a(ClientTickEvent var1) {
      long var2 = System.currentTimeMillis();
      long var10000 = var2 - this.r;
      int var5 = 1681908727;
      int var4 = 1258896755;
      int var10002 = var4 & ~var5 | ~var4 & var5;
      var5 = 792125060;
      var4 = var10002;
      var10002 = (var4 | var5) - (var4 & var5);
      var10002 = (int)7829412916337632016L;
      var5 = 1782932003;
      var4 = var10002;
      var10002 = var4 & ~var5 | ~var4 & var5;
      var5 = -731020999;
      var4 = var10002;
      var10002 = (var4 | var5) & (~var4 | ~var5);
      var5 = -878967595;
      var4 = -182247469;
      var10002 = (var4 | var5) - (var4 & var5);
      var5 = 1052711702;
      var4 = var10002;
      var10002 = var4 + var5 - 2 * (var4 & var5);
      if (var10000 >= 50L) {
         this.r = var2;
         this.n();
      }

      var10000 = var2 - this.s;
      int var10001 = (int)4692740404619478715L;
      var5 = -800640111;
      var4 = var10001;
      var10001 = (var4 | var5) & ~(var4 & var5);
      var5 = -2027412741;
      var4 = var10001;
      var10001 = (var4 + var5 - 2 * (var4 & var5)) * (var4 + var5 - 2 * (var4 & var5));
      if (var10000 >= 16L) {
         this.s = var2;
         this.o();
      }
   }

   private void n() {
      MediaSessionService.MediaSnapshot var1 = i.get();
      if (var1 != null) {
         this.e.a(var1.a, var1.b, var1.c, var1.d, var1.e, var1.f);
      } else {
         MediaPlaybackState var10000 = this.e;
         int var3 = 51271499;
         int var2 = 1467258354;
         int var10002 = (var2 | var3) & ~(var2 & var3);
         var3 = 1417331391;
         var2 = var10002;
         var10002 = (var2 | var3) & (~var2 | ~var3);
         var3 = 161980953;
         var2 = 1911474337;
         var10002 = (var2 | var3) & (~var2 | ~var3);
         var3 = 2018077353;
         var2 = var10002;
         var10002 = (var2 | var3) & (~var2 | ~var3);
         var10002 = (int)5258540166059887353L;
         var3 = -983556774;
         var2 = var10002;
         var10002 = (var2 | var3) & ~(var2 & var3);
         var3 = -1382879486;
         var2 = var10002;
         var10002 = var2 + var3 - 2 * (var2 & var3);
         var3 = 1977471128;
         var2 = -489624372;
         int var10004 = var2 + var3 - 2 * (var2 & var3);
         var3 = -1760740270;
         var2 = var10004;
         var10004 = var2 & ~var3 | ~var2 & var3;
         var3 = 996246611;
         var2 = -1484008772;
         var10004 = (var2 | var3) & ~(var2 & var3);
         var3 = -1662363928;
         var2 = var10004;
         var10004 = var2 & ~var3 | ~var2 & var3;
         var3 = -1962181879;
         var2 = -412665922;
         int var10003 = (var2 | var3) - (var2 & var3);
         var3 = -110023488;
         var2 = var10003;
         var10003 = var2 & ~var3 | ~var2 & var3;
         int var10005 = (int)-3728762145700604376L;
         var3 = 925327746;
         var2 = var10005;
         var10005 = var2 + var3 - 2 * (var2 & var3);
         var3 = -1565460565;
         var2 = var10005;
         var10005 = var2 + var3 - 2 * (var2 & var3);
         var10004 = (int)-8962368526003874952L;
         var3 = 34096316;
         var2 = var10004;
         var10004 = (var2 | var3) & ~(var2 & var3);
         var3 = 622251389;
         var2 = var10004;
         var10004 = (var2 | var3) - (var2 & var3);
         var3 = 568791001;
         var2 = -1321506674;
         var10005 = (var2 | var3) - (var2 & var3);
         var3 = 1120262826;
         var2 = var10005;
         var10005 = (var2 | var3) - (var2 & var3);
         var3 = 1895912432;
         var2 = 1118939143;
         int var10006 = (var2 | var3) - (var2 & var3);
         var3 = 2146293446;
         var2 = var10006;
         var3 = (var2 | var3) & (~var2 | ~var3);
         var2 = var10005;
         var10005 = var2 - ~var3 - 1;
         var10005 = (int)-9103832899959897064L;
         var3 = 30437296;
         var2 = var10005;
         var10005 = (var2 | var3) & (~var2 | ~var3);
         var3 = 949071205;
         var2 = var10005;
         var10005 = var2 + var3 - 2 * (var2 & var3);
         int var10007 = (int)-3762533590214955116L;
         var3 = 1357060041;
         var2 = var10007;
         var10007 = var2 & ~var3 | ~var2 & var3;
         var3 = 991967323;
         var2 = var10007;
         var10007 = var2 + var3 - 2 * (var2 & var3);
         var10007 = (int)-3182833480386525206L;
         var3 = -405589866;
         var2 = var10007;
         var10007 = (var2 | var3) & ~(var2 & var3);
         var3 = -108759172;
         var2 = var10007;
         var10007 = (var2 | var3) - (var2 & var3);
         var10007 = (int)-388195610089533471L;
         var3 = 241645095;
         var2 = var10007;
         var10007 = var2 + var3 - 2 * (var2 & var3);
         var3 = 861436352;
         var2 = var10007;
         var10007 = (var2 | var3) - (var2 & var3);
         var10006 = (int)-5512225960547704812L;
         var3 = -167429466;
         var2 = var10006;
         var10006 = var2 & ~var3 | ~var2 & var3;
         var3 = 1441418775;
         var2 = var10006;
         String var10001 = b(
            "얤\uf157엊\uf155얏\uf15c얃\uf159",
            "`ꟳꓺꁡꤐ絺蹙⑿譸㑿s\ua7e8꒱ꁽ꤀絤踅⑳謺㑧~ꞩ꒸ꁤꤖ絿蹉\u2435謚㑢a\ua7ef꒶ꁙ꤄絸蹎⑶謲㑥",
            var10003,
            var10004,
            var10005,
            (var2 | var3) & ~(var2 & var3)
         );
         var10002 = (int)-1975883548007910202L;
         var3 = 1547932095;
         var2 = var10002;
         var10002 = var2 & ~var3 | ~var2 & var3;
         var3 = 509856342;
         var2 = var10002;
         var10002 = (var2 & ~var3 | ~var2 & var3) * (var2 & ~var3 | ~var2 & var3);
         var3 = 1503301401;
         var2 = -2070382516;
         var10003 = (var2 | var3) - (var2 & var3);
         var3 = -579673590;
         var2 = var10003;
         var10003 = ((var2 | var3) & ~(var2 & var3)) * ((var2 | var3) & ~(var2 & var3));
         var10004 = (int)3875598270541470004L;
         var3 = 783516752;
         var2 = var10004;
         var10004 = (var2 | var3) & ~(var2 & var3);
         var3 = -1810240287;
         var2 = var10004;
         var10004 = (var2 | var3) & ~(var2 & var3);
         var10004 = (int)4840580996533127729L;
         var3 = 407147564;
         var2 = var10004;
         var10004 = (var2 | var3) - (var2 & var3);
         var3 = -1719337366;
         var2 = var10004;
         var10004 = (var2 | var3) & (~var2 | ~var3);
         var3 = -1503273285;
         var2 = -1049983823;
         var10005 = (var2 | var3) - (var2 & var3);
         var3 = -1377232068;
         var2 = var10005;
         var10005 = var2 & ~var3 | ~var2 & var3;
         var10005 = (int)-8817352285966934709L;
         var3 = -1990471827;
         var2 = var10005;
         var10005 = (var2 | var3) - (var2 & var3);
         var3 = 743190777;
         var2 = var10005;
         var10005 = var2 + var3 - 2 * (var2 & var3);
         var10007 = (int)6675180511291658985L;
         var3 = -2036381036;
         var2 = var10007;
         var10007 = (var2 | var3) & (~var2 | ~var3);
         var3 = 1975064701;
         var2 = var10007;
         var10007 = var2 & ~var3 | ~var2 & var3;
         var3 = -2081160775;
         var2 = 1790760120;
         var10007 = (var2 | var3) & (~var2 | ~var3);
         var3 = -381102842;
         var2 = var10007;
         var10007 = (var2 | var3) & ~(var2 & var3);
         var3 = -1369892485;
         var2 = -1126377625;
         var10007 = (var2 | var3) - (var2 & var3);
         var3 = 310758934;
         var2 = var10007;
         var10007 = var2 & ~var3 | ~var2 & var3;
         var3 = 391038051;
         var2 = -805240574;
         var10006 = var2 + var3 - 2 * (var2 & var3);
         var3 = -713628010;
         var2 = var10006;
         var10006 = (var2 | var3) & (~var2 | ~var3);
         var3 = 1197265403;
         var2 = 542751325;
         int var10008 = (var2 | var3) & (~var2 | ~var3);
         var3 = 1728408503;
         var2 = var10008;
         var10008 = (var2 | var3) - (var2 & var3);
         var3 = 1942940630;
         var2 = 1832392388;
         var10007 = var2 & ~var3 | ~var2 & var3;
         var3 = 518087129;
         var2 = var10007;
         String var125 = b("", "`ꟳꓺꁡꤐ絺蹙⑿譸㑿s\ua7e8꒱ꁽ꤀絤踅⑳謺㑧~ꞩ꒸ꁤꤖ絿蹉\u2435謚㑢a\ua7ef꒶ꁙ꤄絸蹎⑶謲㑥", var10004, var10005, var10006, (var2 | var3) & (~var2 | ~var3));
         var3 = 2036109394;
         var2 = 1546601054;
         var10003 = (var2 | var3) - (var2 & var3);
         var3 = 628347404;
         var2 = var10003;
         var10000.a(var10001, var125, pulse.Bool.from((var2 | var3) - (var2 & var3)), 0.0F, 0.0F, null);
      }

      this.e.m();
   }

   private void o() {
      int var21 = 1185833587;
      int var20 = -1679130329;
      int var10002 = (var20 | var21) - (var20 & var21);
      var21 = -582687915;
      var20 = var10002;
      var21 = (var20 | var21) - (var20 & var21);
      var20 = this.q;
      this.q = var20 - ~var21 - 1;
      float[] var1 = j.get();
      label49:
      if (var1 != null) {
         var21 = -1645942723;
         var20 = -1301013489;
         int var10001 = var20 + var21 - 2 * (var20 & var21);
         var21 = 798028850;
         var20 = var10001;
         if (var1[(var20 | var21) - (var20 & var21)] == 0.0F) {
            var10001 = (int)8158358513248856270L;
            var21 = -557080177;
            var20 = var10001;
            var10001 = var20 & ~var21 | ~var20 & var21;
            var21 = 313575744;
            var20 = var10001;
            if (var1[var20 + var21 - 2 * (var20 & var21)] == 0.0F) {
               var21 = 561053856;
               var20 = -234625578;
               var10001 = var20 + var21 - 2 * (var20 & var21);
               var21 = -747444876;
               var20 = var10001;
               if (var1[(var20 | var21) & ~(var20 & var21)] == 0.0F) {
                  break label49;
               }
            }
         }

         var10001 = (int)4717234209983858139L;
         var21 = 1240725480;
         var20 = var10001;
         var10001 = var20 + var21 - 2 * (var20 & var21);
         var21 = 698053171;
         var20 = var10001;
         float var2 = var1[(var20 | var21) - (var20 & var21)];
         var21 = -1337259940;
         var20 = 1513579212;
         var10001 = (var20 | var21) - (var20 & var21);
         var21 = -360945007;
         var20 = var10001;
         float var3 = var1[var20 + var21 - 2 * (var20 & var21)];
         var21 = 435938086;
         var20 = 608048302;
         var10001 = (var20 | var21) & ~(var20 & var21);
         var21 = 1036384138;
         var20 = var10001;
         float var4 = var1[(var20 | var21) - (var20 & var21)];
         float var5 = 0.0F;
         float var360 = this.p;
         int var10003 = (int)-424896182304711735L;
         var21 = 359385244;
         var20 = var10003;
         var10003 = var20 & ~var21 | ~var20 & var21;
         var21 = 1982141275;
         var20 = var10003;
         var10003 = (var20 | var21) - (var20 & var21);
         var10003 = (int)-2187127825031870434L;
         var21 = -1558086371;
         var20 = var10003;
         var10003 = (var20 | var21) & (~var20 | ~var21);
         var21 = 498808077;
         var20 = var10003;
         var10003 = var20 + var21 - 2 * (var20 & var21);
         if (var2 > var360 + 0.15F) {
            var5 = (var2 - this.p) * 2.0F;
         }

         var10002 = (int)-1402036200373220549L;
         var21 = 371929424;
         var20 = var10002;
         var10002 = (var20 | var21) & ~(var20 & var21);
         var21 = -481667034;
         var20 = var10002;
         var10002 = (var20 & ~var21 | ~var20 & var21) * (var20 & ~var21 | ~var20 & var21);
         float var361 = var2 * 0.7F;
         var10003 = (int)6361445334327467219L;
         var21 = -1746098458;
         var20 = var10003;
         var10003 = (var20 | var21) - (var20 & var21);
         var21 = -264420496;
         var20 = var10003;
         var10003 = (var20 | var21) - (var20 & var21);
         var21 = -1760233628;
         var20 = 1032209491;
         int var10004 = (var20 | var21) - (var20 & var21);
         var21 = -2083986818;
         var20 = var10004;
         var21 = (var20 | var21) & ~(var20 & var21);
         var20 = var10003;
         var10003 = 2 * (var20 | var21) - (var20 ^ var21);
         this.p = var361 + this.p * 0.3F;
         var21 = 684232647;
         var20 = -1559584024;
         var10001 = (var20 | var21) & ~(var20 & var21);
         var21 = -1950208705;
         var20 = var10001;
         var10001 = (var20 | var21) - (var20 & var21);
         var21 = -1181671923;
         var20 = 669195432;
         var10001 = (var20 | var21) & (~var20 | ~var21);
         var21 = -1636695392;
         var20 = var10001;
         var10001 = var20 + var21 - 2 * (var20 & var21);
         var10001 = (int)-2866582306953709687L;
         var21 = 916638170;
         var20 = var10001;
         var10001 = var20 & ~var21 | ~var20 & var21;
         var21 = 1412988510;
         var20 = var10001;
         var10001 = (var20 | var21) & (~var20 | ~var21);
         var10001 = (int)-8917841069975329523L;
         var21 = -169549534;
         var20 = var10001;
         var10001 = (var20 | var21) - (var20 & var21);
         var21 = 1499448352;
         var20 = var10001;
         var10001 = (var20 | var21) & (~var20 | ~var21);
         float var6 = 1.4F;
         float var7 = Math.min(var2 * var6, 1.0F);
         float var8 = Math.min(var3 * var6, 1.0F);
         float var9 = Math.min(var4 * var6, 1.0F);
         float var10 = this.q;
         double var10000 = var10;
         var10001 = (int)3025545341108987756L;
         var21 = -1520568443;
         var20 = var10001;
         var10001 = (var20 | var21) - (var20 & var21);
         var21 = 897614134;
         var20 = var10001;
         var10001 = (var20 | var21) & (~var20 | ~var21);
         var10000 = Math.sin(var10000 * 0.5);
         var10001 = (int)6276145591285263796L;
         var21 = -2077046642;
         var20 = var10001;
         var10001 = (var20 | var21) & ~(var20 & var21);
         var21 = -1875723757;
         var20 = var10001;
         var10001 = var20 + var21 - 2 * (var20 & var21);
         var10002 = (int)8884178281174197228L;
         var21 = 906622361;
         var20 = var10002;
         var10002 = (var20 | var21) & ~(var20 & var21);
         var21 = -1652806896;
         var20 = var10002;
         var21 = (var20 | var21) & (~var20 | ~var21);
         var20 = var10001;
         var10001 = (var20 & ~var21) + (var21 & ~var20) + 2 * (var20 & var21);
         var10000 *= 0.08;
         var21 = -1699895928;
         var20 = -749592886;
         var10001 = (var20 | var21) & ~(var20 & var21);
         var21 = -41022401;
         var20 = var10001;
         var10001 = var20 + var21 - 2 * (var20 & var21);
         float var11 = (float)(var10000 + 0.92);
         var10000 = var10;
         var21 = 386512912;
         var20 = 1249630671;
         var10002 = var20 & ~var21 | ~var20 & var21;
         var21 = 1567777231;
         var20 = var10002;
         var10002 = (var20 | var21) & ~(var20 & var21);
         var10000 = Math.sin(var10000 * 0.6 + 1.0);
         String var381 = "dpu";
         var10000 *= 0.08;
         var21 = 233998078;
         var20 = -28715514;
         var10001 = (var20 | var21) - (var20 & var21);
         var21 = 14523944;
         var20 = var10001;
         var10001 = (var20 | var21) & (~var20 | ~var21);
         var10002 = (int)5583311578942855725L;
         var21 = -1848437524;
         var20 = var10002;
         var10002 = (var20 | var21) - (var20 & var21);
         var21 = 1272444214;
         var20 = var10002;
         var21 = (var20 | var21) & ~(var20 & var21);
         var20 = var10001;
         var10001 = (var20 & ~var21) + (var21 & ~var20) + 2 * (var20 & var21);
         float var12 = (float)(var10000 + 0.92);
         var10000 = var10;
         var10001 = (int)4355557152652684553L;
         var21 = 637692918;
         var20 = var10001;
         var10001 = var20 + var21 - 2 * (var20 & var21);
         var21 = -1742759444;
         var20 = var10001;
         var10001 = (var20 | var21) - (var20 & var21);
         var10000 *= 0.7;
         var21 = 157746160;
         var20 = -343130532;
         var10001 = var20 & ~var21 | ~var20 & var21;
         var21 = 1497524144;
         var20 = var10001;
         var10001 = var20 & ~var21 | ~var20 & var21;
         var10000 = Math.sin(var10000 + 2.0);
         var10001 = (int)7286930549026843761L;
         var21 = 1476030658;
         var20 = var10001;
         var10001 = var20 + var21 - 2 * (var20 & var21);
         var21 = -1253230436;
         var20 = var10001;
         var10001 = ((var20 | var21) & (~var20 | ~var21)) * ((var20 | var21) & (~var20 | ~var21));
         var10000 *= 0.08;
         String var393 = "dpv";
         float var13 = (float)(var10000 + 0.92);
         var21 = 2138627375;
         var20 = 863159625;
         int var332 = (var20 | var21) - (var20 & var21);
         var21 = 1275730016;
         var20 = var332;
         float[] var333 = new float[var20 + var21 - 2 * (var20 & var21)];
         var10002 = (int)6042920363741666766L;
         var21 = 1897008401;
         var20 = var10002;
         var10002 = (var20 | var21) & ~(var20 & var21);
         var21 = -1478897441;
         var20 = var10002;
         var10002 = (var20 | var21) & ~(var20 & var21);
         var10004 = (int)5947363983914431719L;
         var21 = -373677033;
         var20 = var10004;
         var10004 = var20 + var21 - 2 * (var20 & var21);
         var21 = 648246980;
         var20 = var10004;
         var10004 = var20 + var21 - 2 * (var20 & var21);
         var21 = 1118595580;
         var20 = 1608047134;
         int var10005 = var20 + var21 - 2 * (var20 & var21);
         var21 = 1281946583;
         var20 = var10005;
         var21 = (var20 | var21) & (~var20 | ~var21);
         var20 = var10004;
         var10004 = 2 * (var20 | var21) - (var20 ^ var21);
         float var450 = var8 * 0.6F;
         var21 = -915351141;
         var20 = 558889986;
         var10005 = (var20 | var21) - (var20 & var21);
         var21 = 1284811473;
         var20 = var10005;
         var10005 = ((var20 | var21) & ~(var20 & var21)) * ((var20 | var21) & ~(var20 & var21));
         var333[var10002] = (var450 + var5 * 0.3F) * var11;
         var10002 = (int)8004167205043743901L;
         var21 = -858709854;
         var20 = var10002;
         var10002 = var20 + var21 - 2 * (var20 & var21);
         var21 = -1884844994;
         var20 = var10002;
         var10002 = var20 + var21 - 2 * (var20 & var21);
         var21 = 727275766;
         var20 = 130657549;
         var10004 = (var20 | var21) & (~var20 | ~var21);
         var21 = -1954007952;
         var20 = var10004;
         var10004 = var20 & ~var21 | ~var20 & var21;
         var21 = 332905727;
         var20 = -1082916231;
         var10005 = (var20 | var21) & ~(var20 & var21);
         var21 = -1873864359;
         var20 = var10005;
         var21 = var20 & ~var21 | ~var20 & var21;
         var20 = var10004;
         var10004 = (var20 & ~var21) + (var21 & ~var20) + 2 * (var20 & var21);
         float var451 = var8 * 0.85F;
         int var10006 = (int)-1277824700364408906L;
         var21 = -963892603;
         var20 = var10006;
         var10006 = (var20 | var21) & (~var20 | ~var21);
         var21 = 1325604149;
         var20 = var10006;
         var10006 = var20 & ~var21 | ~var20 & var21;
         float var452 = var451 + var7 * 0.3F;
         var10006 = (int)-8350352320699158489L;
         var21 = 1607220214;
         var20 = var10006;
         var10006 = (var20 | var21) & (~var20 | ~var21);
         var21 = 814877635;
         var20 = var10006;
         var10006 = var20 & ~var21 | ~var20 & var21;
         var21 = -1720923142;
         var20 = 1515241812;
         var10006 = var20 & ~var21 | ~var20 & var21;
         var21 = -1019475293;
         var20 = var10006;
         var10006 = (var20 | var21) & ~(var20 & var21);
         var10006 = (int)-3097738062969015643L;
         var21 = 2004681219;
         var20 = var10006;
         var10006 = var20 & ~var21 | ~var20 & var21;
         var21 = -1694797663;
         var20 = var10006;
         var10006 = var20 & ~var21 | ~var20 & var21;
         var333[var10002] = (var452 + var5 * 0.5F) * var12;
         var10002 = (int)-3344521610805115783L;
         var21 = -63040605;
         var20 = var10002;
         var10002 = (var20 | var21) & ~(var20 & var21);
         var21 = 1483085784;
         var20 = var10002;
         var10002 = var20 & ~var21 | ~var20 & var21;
         var21 = -249691176;
         var20 = 616701104;
         var10004 = (var20 | var21) & ~(var20 & var21);
         var21 = 1418867430;
         var20 = var10004;
         var10004 = var20 + var21 - 2 * (var20 & var21);
         float var453 = var8 * 0.5F;
         var21 = 1337345910;
         var20 = -1816015285;
         var10006 = (var20 | var21) - (var20 & var21);
         var21 = -596145872;
         var20 = var10006;
         var10006 = (var20 | var21) & (~var20 | ~var21);
         var21 = -1231627334;
         var20 = -934358857;
         var10006 = (var20 | var21) & ~(var20 & var21);
         var21 = 2128087838;
         var20 = var10006;
         var10006 = (var20 | var21) & (~var20 | ~var21);
         float var454 = var453 + var7 * 0.7F;
         var21 = -754585923;
         var20 = 1533345793;
         var10005 = (var20 | var21) & (~var20 | ~var21);
         var21 = 528514446;
         var20 = var10005;
         var10005 = ((var20 | var21) - (var20 & var21)) * ((var20 | var21) - (var20 & var21));
         var333[var10002] = (var454 + var5 * 0.7F) * var13;
         var10002 = (int)-621825084149887199L;
         var21 = -78745195;
         var20 = var10002;
         var10002 = (var20 | var21) - (var20 & var21);
         var21 = -1851785545;
         var20 = var10002;
         var10002 = (var20 | var21) & (~var20 | ~var21);
         var21 = -1761329117;
         var20 = -1792003566;
         var10004 = var20 + var21 - 2 * (var20 & var21);
         var21 = 823776963;
         var20 = var10004;
         var10004 = var20 + var21 - 2 * (var20 & var21);
         float var455 = var9 * 0.5F;
         var10005 = (int)-7489199283995939685L;
         var21 = 1827095512;
         var20 = var10005;
         var10005 = (var20 | var21) & (~var20 | ~var21);
         var21 = 2068849243;
         var20 = var10005;
         var10005 = var20 & ~var21 | ~var20 & var21;
         float var456 = var455 + var7 * 0.7F;
         var10006 = (int)-3933575082197010437L;
         var21 = -738387602;
         var20 = var10006;
         var10006 = (var20 | var21) & ~(var20 & var21);
         var21 = 330083997;
         var20 = var10006;
         var10006 = var20 & ~var21 | ~var20 & var21;
         var10006 = (int)5033239661920511632L;
         var21 = -1364945226;
         var20 = var10006;
         var10006 = (var20 | var21) & ~(var20 & var21);
         var21 = -2004258761;
         var20 = var10006;
         var10006 = (var20 | var21) & ~(var20 & var21);
         var333[var10002] = (var456 + var5 * 0.7F) * var11;
         var10002 = (int)-7752736456075666210L;
         var21 = 1992457505;
         var20 = var10002;
         var10002 = (var20 | var21) & ~(var20 & var21);
         var21 = -1398676997;
         var20 = var10002;
         var10002 = (var20 | var21) - (var20 & var21);
         var10004 = (int)8448675002379858061L;
         var21 = 1107060258;
         var20 = var10004;
         var10004 = (var20 | var21) & ~(var20 & var21);
         var21 = 2060750249;
         var20 = var10004;
         var10004 = ((var20 | var21) & (~var20 | ~var21)) * ((var20 | var21) & (~var20 | ~var21));
         float var457 = var9 * 0.85F;
         var10005 = (int)7785750806042172464L;
         var21 = 793405744;
         var20 = var10005;
         var10005 = (var20 | var21) & (~var20 | ~var21);
         var21 = -1473912547;
         var20 = var10005;
         var10005 = (var20 & ~var21 | ~var20 & var21) * (var20 & ~var21 | ~var20 & var21);
         float var458 = var457 + var7 * 0.3F;
         String var501 = "dpw";
         var333[var10002] = (var458 + var5 * 0.5F) * var13;
         var21 = -1378932784;
         var20 = 1510406872;
         var10002 = (var20 | var21) & (~var20 | ~var21);
         var21 = -137765619;
         var20 = var10002;
         var10002 = var20 + var21 - 2 * (var20 & var21);
         var10004 = (int)3345734147729481647L;
         var21 = -1181308245;
         var20 = var10004;
         var10004 = (var20 | var21) & (~var20 | ~var21);
         var21 = -1636586022;
         var20 = var10004;
         var10004 = var20 & ~var21 | ~var20 & var21;
         var10005 = (int)-7753469667078629435L;
         var21 = 327515389;
         var20 = var10005;
         var10005 = (var20 | var21) & (~var20 | ~var21);
         var21 = 630590063;
         var20 = var10005;
         var21 = var20 + var21 - 2 * (var20 & var21);
         var20 = var10004;
         var10004 = (var20 & ~var21) + (var21 & ~var20) + 2 * (var20 & var21);
         float var459 = var9 * 0.6F;
         String var504 = "dpx";
         var333[var10002] = (var459 + var5 * 0.3F) * var12;
         float[] var14 = var333;
         int var334 = (int)5185323579187184288L;
         var21 = -737956806;
         var20 = var334;
         int var335 = var20 & ~var21 | ~var20 & var21;
         var21 = -1427411302;
         var20 = var335;
         int var15 = (var20 | var21) - (var20 & var21);

         while (true) {
            var21 = -1023156479;
            var20 = -360812137;
            var10001 = (var20 | var21) - (var20 & var21);
            var21 = 696102544;
            var20 = var10001;
            if (var15 >= var20 + var21 - 2 * (var20 & var21)) {
               int var342 = (int)-6128020809044088986L;
               var21 = -41422241;
               var20 = var342;
               int var343 = (var20 | var21) & (~var20 | ~var21);
               var21 = 1118812593;
               var20 = var343;
               int var344 = ((var20 | var21) - (var20 & var21)) * ((var20 | var21) - (var20 & var21));
               int var345 = (int)4639351816333248746L;
               var21 = 48830105;
               var20 = var345;
               int var346 = var20 & ~var21 | ~var20 & var21;
               var21 = -1019715144;
               var20 = var346;
               int var19 = (var20 | var21) - (var20 & var21);
               a = var19;
               var10001 = (int)-6955775801210110642L;
               var21 = 904014571;
               var20 = var10001;
               var10001 = (var20 | var21) & ~(var20 & var21);
               var21 = 578738080;
               var20 = var10001;
               var10001 = var20 + var21 - 2 * (var20 & var21);
               var10001 = (int)4227835022708343396L;
               var21 = 1621442334;
               var20 = var10001;
               var10001 = (var20 | var21) & ~(var20 & var21);
               var21 = -103170711;
               var20 = var10001;
               var10001 = var20 & ~var21 | ~var20 & var21;
               var21 = 802519697;
               var20 = 724992661;
               var10001 = (var20 | var21) & ~(var20 & var21);
               var21 = 82049026;
               var20 = var10001;
               var10001 = (var20 | var21) & (~var20 | ~var21);
               int var347 = (int)6457321246420244248L;
               var21 = -1809740534;
               var20 = var347;
               int var348 = var20 & ~var21 | ~var20 & var21;
               var21 = -617584605;
               var20 = var348;
               if (((var20 | var21) & (~var20 | ~var21)) < a) {
                  var21 = -448810043;
                  var20 = -140183479;
                  int var349 = var20 & ~var21 | ~var20 & var21;
                  var21 = -450901739;
                  var20 = var349;
                  int var350 = ((var20 | var21) - (var20 & var21)) * ((var20 | var21) - (var20 & var21));
                  int var351 = (int)1189812096935700271L;
                  var21 = -452407371;
                  var20 = var351;
                  int var352 = var20 & ~var21 | ~var20 & var21;
                  var21 = -1176773124;
                  var20 = var352;
                  var19 = (var20 | var21) & ~(var20 & var21);
               }

               return;
            }

            float var16 = Math.min(var14[var15], 1.0F);
            if (!(var16 > this.n[var15])) {
               if (a != a) {
                  var21 = 1111941432;
                  var20 = 1477691659;
                  int var336 = (var20 | var21) & ~(var20 & var21);
                  var21 = 441788467;
                  var20 = var336;
                  int var337 = var20 & ~var21 | ~var20 & var21;
                  var21 = 1817001965;
                  var20 = 1527800967;
                  var10001 = var20 & ~var21 | ~var20 & var21;
                  var21 = 928865130;
                  var20 = var10001;
                  int var338 = var337 / (var20 + var21 - 2 * (var20 & var21));
               }

               float var431 = this.n[var15];
               String var460 = "dpy";
               float var432 = var431 * 0.6F;
               String var483 = "dpz";
               this.n[var15] = var432 + var16 * 0.4F;
            } else {
               float[] var339 = this.n;
               float var433 = this.n[var15];
               var21 = 44090991;
               var20 = -154073649;
               var10004 = (var20 | var21) & (~var20 | ~var21);
               var21 = -193870925;
               var20 = var10004;
               var10004 = (var20 | var21) - (var20 & var21);
               var21 = -1121809759;
               var20 = -1169119345;
               var10004 = var20 & ~var21 | ~var20 & var21;
               var21 = 124923170;
               var20 = var10004;
               var10004 = var20 & ~var21 | ~var20 & var21;
               float var434 = var433 * 0.1F;
               var21 = -1453652777;
               var20 = -1551330190;
               var10004 = (var20 | var21) & ~(var20 & var21);
               var21 = -1905242117;
               var20 = var10004;
               var10004 = ((var20 | var21) & (~var20 | ~var21)) * ((var20 | var21) & (~var20 | ~var21));
               var339[var15] = var434 + var16 * 0.9F;
            }

            if (!(this.n[var15] > this.o[var15])) {
               float var435 = this.o[var15];
               String var461 = "dqa";
               this.o[var15] = var435 * 0.92F;
            } else {
               this.o[var15] = this.n[var15];
            }

            float var340 = this.n[var15];
            var10002 = (int)8746357602902363502L;
            var21 = -91852888;
            var20 = var10002;
            var10002 = (var20 | var21) & ~(var20 & var21);
            var21 = -1257364788;
            var20 = var10002;
            var10002 = var20 & ~var21 | ~var20 & var21;
            var21 = -2061041496;
            var20 = -1100687862;
            var10002 = (var20 | var21) & ~(var20 & var21);
            var21 = 994301605;
            var20 = var10002;
            var10002 = (var20 | var21) - (var20 & var21);
            float var341 = var340 * 0.7F;
            float var396 = this.o[var15];
            var10003 = (int)-2417747670219329520L;
            var21 = -230890156;
            var20 = var10003;
            var10003 = (var20 | var21) & (~var20 | ~var21);
            var21 = 842044747;
            var20 = var10003;
            var10003 = var20 & ~var21 | ~var20 & var21;
            float var17 = var341 + var396 * 0.3F;
            this.e.H()[var15] = Math.min(var17, 1.0F);
            var15++;
         }
      }

      this.p();
   }

   private void p() {
      int var4 = -1979889653;
      int var3 = 876994251;
      int var10000 = (var3 | var4) & ~(var3 & var4);
      var4 = -1111976256;
      var3 = var10000;
      int var1 = var3 + var4 - 2 * (var3 & var4);

      while (true) {
         int var10001 = (int)4283001015643455001L;
         var4 = -1506739491;
         var3 = var10001;
         var10001 = (var3 | var4) & (~var3 | ~var4);
         var4 = -1742715710;
         var3 = var10001;
         if (var1 >= ((var3 | var4) & (~var3 | ~var4))) {
            return;
         }

         float var10002 = this.n[var1];
         String var10003 = "dqb";
         this.n[var1] = var10002 * 0.8F;
         var10002 = this.o[var1];
         var4 = 935409359;
         var3 = -369648868;
         int var40 = var3 + var4 - 2 * (var3 & var4);
         var4 = 1018582257;
         var3 = var40;
         int var41 = (var3 | var4) & ~(var3 & var4);
         this.o[var1] = var10002 * 0.85F;
         float var27 = this.n[var1];
         var4 = 692149979;
         var3 = 1229124345;
         int var32 = var3 & ~var4 | ~var3 & var4;
         var4 = 1610853419;
         var3 = var32;
         int var33 = var3 + var4 - 2 * (var3 & var4);
         int var34 = (int)-1293001123634005248L;
         var4 = 680256928;
         var3 = var34;
         int var35 = (var3 | var4) - (var3 & var4);
         var4 = 186048178;
         var3 = var35;
         int var36 = (var3 | var4) & (~var3 | ~var4);
         float var28 = var27 * 0.7F;
         float var30 = this.o[var1];
         int var37 = (int)340907887937703006L;
         var4 = 1023520519;
         var3 = var37;
         int var38 = var3 + var4 - 2 * (var3 & var4);
         var4 = -1663180731;
         var3 = var38;
         int var39 = (var3 | var4) & (~var3 | ~var4);
         float var2 = var28 + var30 * 0.3F;
         this.e.H()[var1] = var2;
         var1++;
      }
   }

   public void d() {
      int var62;
      if (this.e.c()) {
         int var3 = -2112931506;
         int var2 = -606197104;
         var62 = (var2 | var3) & ~(var2 & var3);
         var3 = 1506874334;
         var2 = var62;
         var62 = var2 + var3 - 2 * (var2 & var3);
      } else {
         int var34 = 1051834990;
         int var5 = 1619900432;
         var62 = (var5 | var34) & (~var5 | ~var34);
         var34 = 1580991103;
         var5 = var62;
         var62 = (var5 | var34) & (~var5 | ~var34);
      }

      int var1 = var62;
      this.e.a(pulse.Bool.from(var1));
      if (var1 != 0) {
         this.e.j();
      } else {
         this.e.i();
      }

      if (g()) {
         Runnable var10002 = () -> {
            try {
               MediaProvider.playPause();
            } catch (Throwable var1x) {
            }
         };
         int var36 = -973525316;
         int var7 = -2111280650;
         int var10003 = var7 + var36 - 2 * (var7 & var36);
         var36 = 1340081332;
         var7 = var10003;
         var10003 = ((var7 | var36) - (var7 & var36)) * ((var7 | var36) - (var7 & var36));
         int var10004 = (int)1631853103496551819L;
         var36 = -1526842592;
         var7 = var10004;
         var10004 = (var7 | var36) & (~var7 | ~var36);
         var36 = -1738534529;
         var7 = var10004;
         var10004 = (var7 | var36) - (var7 & var36);
         var36 = -704070106;
         var7 = 2130534328;
         int var10005 = (var7 | var36) & (~var7 | ~var36);
         var36 = 2099017042;
         var7 = var10005;
         var10005 = (var7 | var36) & (~var7 | ~var36);
         int var10006 = (int)1514856933724413992L;
         var36 = -1928161016;
         var7 = var10006;
         var10006 = var7 & ~var36 | ~var7 & var36;
         var36 = -2027505680;
         var7 = var10006;
         var36 = (var7 | var36) & ~(var7 & var36);
         var7 = var10005;
         var10005 = (var7 & ~var36) + (var36 & ~var7) + 2 * (var7 & var36);
         var10005 = (int)-2205083298023650622L;
         var36 = 695001508;
         var7 = var10005;
         var10005 = var7 + var36 - 2 * (var7 & var36);
         var36 = -715732207;
         var7 = var10005;
         var10005 = var7 + var36 - 2 * (var7 & var36);
         var10006 = (int)-6947264603583240437L;
         var36 = 630648733;
         var7 = var10006;
         var10006 = var7 + var36 - 2 * (var7 & var36);
         var36 = -1039229416;
         var7 = var10006;
         var10006 = (var7 & ~var36 | ~var7 & var36) * (var7 & ~var36 | ~var7 & var36);
         var10006 = (int)8527245828659610518L;
         var36 = 836022773;
         var7 = var10006;
         var10006 = (var7 | var36) & (~var7 | ~var36);
         var36 = 1398438378;
         var7 = var10006;
         var10006 = var7 & ~var36 | ~var7 & var36;
         var36 = 644099496;
         var7 = -746064943;
         int var10007 = (var7 | var36) & (~var7 | ~var36);
         var36 = -1844042927;
         var7 = var10007;
         var10007 = (var7 | var36) & ~(var7 & var36);
         int var10008 = (int)-7541555809210755799L;
         var36 = 238447832;
         var7 = var10008;
         var10008 = var7 & ~var36 | ~var7 & var36;
         var36 = 490157181;
         var7 = var10008;
         var36 = (var7 | var36) & (~var7 | ~var36);
         var7 = var10007;
         var10007 = var7 - ~var36 - 1;
         var36 = 1699912673;
         var7 = 257782836;
         var10007 = (var7 | var36) & ~(var7 & var36);
         var36 = 1264549409;
         var7 = var10007;
         var10007 = (var7 | var36) - (var7 & var36);
         var10008 = (int)-8047289404650258457L;
         var36 = -840160197;
         var7 = var10008;
         var10008 = var7 + var36 - 2 * (var7 & var36);
         var36 = -1577041464;
         var7 = var10008;
         var10008 = var7 + var36 - 2 * (var7 & var36);
         var10008 = (int)8295095177146708330L;
         var36 = -648396420;
         var7 = var10008;
         var10008 = (var7 | var36) & ~(var7 & var36);
         var36 = -1701966606;
         var7 = var10008;
         new Thread(
               var10002,
               b(
                  "ฎ銇\u0e3c銮ะ銫\u0e74銚ี銫ภ銚ุ銿ส銯",
                  "`ꟳꓺꁡꤐ絺蹙⑿譸㑿s\ua7e8꒱ꁽ꤀絤踅⑳謺㑧~ꞩ꒸ꁤꤖ絿蹉\u2435謚㑢a\ua7ef꒶ꁙ꤄絸蹎⑶謲㑥",
                  var10005,
                  var10006,
                  var10007,
                  var7 + var36 - 2 * (var7 & var36)
               )
            )
            .start();
      }
   }

   public void e() {
      if (g()) {
         Runnable var10002 = () -> {
            try {
               MediaProvider.next();
            } catch (Throwable var1x) {
            }
         };
         int var2 = -1443190456;
         int var1 = 1452870653;
         int var10003 = var1 & ~var2 | ~var1 & var2;
         var2 = 895378330;
         var1 = var10003;
         var10003 = (var1 | var2) & (~var1 | ~var2);
         int var10004 = (int)2604841201821895457L;
         var2 = -1846195998;
         var1 = var10004;
         var10004 = var1 & ~var2 | ~var1 & var2;
         var2 = -289495133;
         var1 = var10004;
         var2 = var1 + var2 - 2 * (var1 & var2);
         var1 = var10003;
         var10003 = var1 - ~var2 - 1;
         String var72 = "dqc";
         int var10006 = (int)7689027102735283209L;
         var2 = -1435947899;
         var1 = var10006;
         var10006 = (var1 | var2) & ~(var1 & var2);
         var2 = -863364964;
         var1 = var10006;
         var10006 = var1 + var2 - 2 * (var1 & var2);
         var10006 = (int)-7906577890085491693L;
         var2 = 1350360601;
         var1 = var10006;
         var10006 = (var1 | var2) & (~var1 | ~var2);
         var2 = -1878789619;
         var1 = var10006;
         var10006 = (var1 | var2) & ~(var1 & var2);
         var10006 = (int)7739839172992065953L;
         var2 = -1174121625;
         var1 = var10006;
         var10006 = (var1 | var2) & ~(var1 & var2);
         var2 = -690212140;
         var1 = var10006;
         var10006 = (var1 | var2) & (~var1 | ~var2);
         int var10005 = (int)3606594639267938012L;
         var2 = -1927611932;
         var1 = var10005;
         var10005 = (var1 | var2) & ~(var1 & var2);
         var2 = 1516447567;
         var1 = var10005;
         var10005 = var1 + var2 - 2 * (var1 & var2);
         var2 = 672550868;
         var1 = 1164111871;
         var10006 = (var1 | var2) & ~(var1 & var2);
         var2 = 1918336469;
         var1 = var10006;
         var10006 = (var1 | var2) - (var1 & var2);
         var2 = 1813258519;
         var1 = 801750892;
         int var10007 = (var1 | var2) & (~var1 | ~var2);
         var2 = -75927641;
         var1 = var10007;
         var2 = (var1 | var2) & (~var1 | ~var2);
         var1 = var10006;
         var10006 = 2 * (var1 | var2) - (var1 ^ var2);
         var2 = -1534086152;
         var1 = -381110251;
         var10006 = (var1 | var2) - (var1 & var2);
         var2 = -1869096561;
         var1 = var10006;
         var10006 = var1 + var2 - 2 * (var1 & var2);
         var2 = 1233705181;
         var1 = -321622568;
         var10007 = (var1 | var2) & ~(var1 & var2);
         var2 = -1180376193;
         var1 = var10007;
         var10007 = (var1 | var2) & (~var1 | ~var2);
         var2 = 1692032760;
         var1 = -141521247;
         int var10008 = (var1 | var2) - (var1 & var2);
         var2 = 1012814524;
         var1 = var10008;
         var2 = var1 + var2 - 2 * (var1 & var2);
         var1 = var10007;
         var10007 = (var1 ^ var2) + 2 * (var1 & var2);
         var10007 = (int)3524255660611063129L;
         var2 = 957857175;
         var1 = var10007;
         var10007 = (var1 | var2) - (var1 & var2);
         var2 = -465448758;
         var1 = var10007;
         var10007 = var1 + var2 - 2 * (var1 & var2);
         var2 = 1813600890;
         var1 = -450316999;
         var10008 = (var1 | var2) & ~(var1 & var2);
         var2 = 793835968;
         var1 = var10008;
         var10008 = var1 + var2 - 2 * (var1 & var2);
         int var10009 = (int)-5439794077007426164L;
         var2 = -1889625867;
         var1 = var10009;
         var10009 = (var1 | var2) & ~(var1 & var2);
         var2 = 250088152;
         var1 = var10009;
         var2 = (var1 | var2) & ~(var1 & var2);
         var1 = var10008;
         var10008 = (var1 ^ var2) + 2 * (var1 & var2);
         var2 = 2142739767;
         var1 = -293043309;
         var10008 = (var1 | var2) & (~var1 | ~var2);
         var2 = -1854077577;
         var1 = var10008;
         new Thread(
               var10002,
               b("㘸䶆㘊䶯㘆䶪㙂䶅㘊䶳㘛", "`ꟳꓺꁡꤐ絺蹙⑿譸㑿s\ua7e8꒱ꁽ꤀絤踅⑳謺㑧~ꞩ꒸ꁤꤖ絿蹉\u2435謚㑢a\ua7ef꒶ꁙ꤄絸蹎⑶謲㑥", var10005, var10006, var10007, (var1 | var2) - (var1 & var2))
            )
            .start();
      }
   }

   public void f() {
      if (g()) {
         Runnable var10002 = () -> {
            try {
               MediaProvider.previous();
            } catch (Throwable var1x) {
            }
         };
         int var10003 = (int)5787849781778761864L;
         int var2 = -2070404377;
         int var1 = var10003;
         var10003 = var1 + var2 - 2 * (var1 & var2);
         var2 = -86237761;
         var1 = var10003;
         var10003 = var1 + var2 - 2 * (var1 & var2);
         int var10005 = (int)-1710107304176558349L;
         var2 = 586251922;
         var1 = var10005;
         var10005 = (var1 | var2) & ~(var1 & var2);
         var2 = -2077220766;
         var1 = var10005;
         var10005 = (var1 | var2) & (~var1 | ~var2);
         var10005 = (int)-945627176636559356L;
         var2 = 216133461;
         var1 = var10005;
         var10005 = var1 + var2 - 2 * (var1 & var2);
         var2 = -1031880870;
         var1 = var10005;
         var10005 = (var1 | var2) & ~(var1 & var2);
         var10005 = (int)-2542880471692012006L;
         var2 = -1682988356;
         var1 = var10005;
         var10005 = (var1 | var2) & (~var1 | ~var2);
         var2 = 2077875423;
         var1 = var10005;
         var10005 = (var1 | var2) & ~(var1 & var2);
         var2 = 748233917;
         var1 = 338254296;
         var10005 = var1 & ~var2 | ~var1 & var2;
         var2 = -1381163758;
         var1 = var10005;
         var10005 = (var1 | var2) - (var1 & var2);
         String var10006 = "dqd";
         var2 = 573013432;
         var1 = -52847039;
         int var53 = var1 + var2 - 2 * (var1 & var2);
         var2 = 1514928425;
         var1 = var53;
         int var54 = var1 & ~var2 | ~var1 & var2;
         var2 = 752989412;
         var1 = -2105754294;
         int var10007 = var1 + var2 - 2 * (var1 & var2);
         var2 = 1062174684;
         var1 = var10007;
         var10007 = (var1 | var2) & ~(var1 & var2);
         var10007 = (int)640791825190177154L;
         var2 = 1276956638;
         var1 = var10007;
         var10007 = var1 & ~var2 | ~var1 & var2;
         var2 = 1554138985;
         var1 = var10007;
         var10007 = (var1 | var2) & ~(var1 & var2);
         int var10008 = (int)1021496471035600855L;
         var2 = 566287848;
         var1 = var10008;
         var10008 = (var1 | var2) - (var1 & var2);
         var2 = -1166024262;
         var1 = var10008;
         var10008 = var1 & ~var2 | ~var1 & var2;
         var2 = 1266486741;
         var1 = -706277878;
         var10008 = (var1 | var2) & (~var1 | ~var2);
         var2 = -1634782694;
         var1 = var10008;
         new Thread(
               var10002,
               b(
                  "\ue8b4뤜\ue886뤵\ue88a뤰\ue8ce뤁\ue891뤴\ue895뤸\ue88c뤤\ue890",
                  "`ꟳꓺꁡꤐ絺蹙⑿譸㑿s\ua7e8꒱ꁽ꤀絤踅⑳謺㑧~ꞩ꒸ꁤꤖ絿蹉\u2435謚㑢a\ua7ef꒶ꁙ꤄絸蹎⑶謲㑥",
                  var10005,
                  var54,
                  var10007,
                  (var1 | var2) & ~(var1 & var2)
               )
            )
            .start();
      }
   }

   public void a(float var1) {
      float var2 = var1 * this.e.s();
      this.e.a(var2);
   }

   public void b(float var1) {
      float var2 = var1 * this.e.s();
      this.e.b(var2);
   }

   public void c(float var1) {
      float var2 = var1 * this.e.s();
      this.e.b(var2);
      this.e.e();
      if (g()) {
         if (!(this.e.s() > 0.0F)) {
            int var10000 = (int)5110243350090359342L;
            int var8 = 538707674;
            int var7 = var10000;
            var10000 = (var7 | var8) - (var7 & var8);
            var8 = 175331098;
            var7 = var10000;
            var10000 = (var7 | var8) - (var7 & var8);
            var8 = -412240317;
            var7 = 336152446;
            int var10001 = (var7 | var8) - (var7 & var8);
            var8 = 654635545;
            var7 = var10001;
            var8 = var7 + var8 - 2 * (var7 & var8);
            var7 = var10000;
            var10000 = var7 - ~var8 - 1;
            var8 = 1327433908;
            var7 = 597981073;
            var10000 = var7 & ~var8 | ~var7 & var8;
            var8 = 73197854;
            var7 = var10000;
            int var6 = (var7 | var8) & (~var7 | ~var8);
            var10000 = (int)-3337630284676269075L;
            var8 = -1015843788;
            var7 = var10000;
            var10000 = var7 & ~var8 | ~var7 & var8;
            var8 = 667308515;
            var7 = var10000;
            var10000 = (var7 | var8) & ~(var7 & var8);
            var10000 = (int)7224611088682487487L;
            var8 = 497294672;
            var7 = var10000;
            var10000 = var7 & ~var8 | ~var7 & var8;
            var8 = -1270458977;
            var7 = var10000;
            if (var7 + var8 - 2 * (var7 & var8) >= var6) {
               throw new IllegalStateException();
            }
         } else {
            long var3 = (long)var2;
            Runnable var10002 = () -> {
               try {
                  MediaProvider.seek(var3);
               } catch (Throwable var3x) {
               }
            };
            int var10003 = (int)-3536240281265694698L;
            int var70 = 405760167;
            int var19 = var10003;
            var10003 = (var19 | var70) & ~(var19 & var70);
            var70 = -744981031;
            var19 = var10003;
            var10003 = var19 & ~var70 | ~var19 & var70;
            int var10005 = (int)-5265467997108192998L;
            var70 = 517624200;
            var19 = var10005;
            var10005 = (var19 | var70) & (~var19 | ~var70);
            var70 = 116910208;
            var19 = var10005;
            var10005 = (var19 | var70) & (~var19 | ~var70);
            var10005 = (int)-6946668083904790150L;
            var70 = -1656396420;
            var19 = var10005;
            var10005 = var19 & ~var70 | ~var19 & var70;
            var70 = 1527424002;
            var19 = var10005;
            var10005 = var19 + var70 - 2 * (var19 & var70);
            var70 = -440439537;
            var19 = 279902707;
            var10005 = var19 + var70 - 2 * (var19 & var70);
            var70 = -183397133;
            var19 = var10005;
            var10005 = var19 & ~var70 | ~var19 & var70;
            var70 = -1432024173;
            var19 = 1319765705;
            var10005 = (var19 | var70) & (~var19 | ~var70);
            var70 = -468775594;
            var19 = var10005;
            var10005 = var19 + var70 - 2 * (var19 & var70);
            var70 = -725268705;
            var19 = 1070020121;
            int var10006 = (var19 | var70) & ~(var19 & var70);
            var70 = -352161514;
            var19 = var10006;
            var10006 = var19 + var70 - 2 * (var19 & var70);
            var70 = -768256990;
            var19 = 714878723;
            var10006 = var19 & ~var70 | ~var19 & var70;
            var70 = -123110612;
            var19 = var10006;
            var10006 = var19 & ~var70 | ~var19 & var70;
            var70 = -1087283798;
            var19 = -2141646227;
            var10006 = (var19 | var70) - (var19 & var70);
            var70 = 1063800773;
            var19 = var10006;
            var10006 = (var19 | var70) & ~(var19 & var70);
            var10006 = (int)2339736319034192046L;
            var70 = 2064299421;
            var19 = var10006;
            var10006 = var19 + var70 - 2 * (var19 & var70);
            var70 = 1595295026;
            var19 = var10006;
            var10006 = var19 & ~var70 | ~var19 & var70;
            var70 = 1583473493;
            var19 = -1439224671;
            var10005 = var19 & ~var70 | ~var19 & var70;
            var70 = 1632350083;
            var19 = var10005;
            var10005 = var19 + var70 - 2 * (var19 & var70);
            var70 = 71065161;
            var19 = -2035278070;
            var10006 = (var19 | var70) - (var19 & var70);
            var70 = -2060709387;
            var19 = var10006;
            var10006 = (var19 | var70) - (var19 & var70);
            int var10007 = (int)-5493915800177477707L;
            var70 = 1990902163;
            var19 = var10007;
            var10007 = (var19 | var70) - (var19 & var70);
            var70 = -2119980211;
            var19 = var10007;
            var70 = (var19 | var70) & ~(var19 & var70);
            var19 = var10006;
            var10006 = var19 - ~var70 - 1;
            var10006 = (int)-8556133303063299087L;
            var70 = 1867863766;
            var19 = var10006;
            var10006 = var19 & ~var70 | ~var19 & var70;
            var70 = 1789757757;
            var19 = var10006;
            var10006 = (var19 | var70) & ~(var19 & var70);
            var10007 = (int)169491427155316389L;
            var70 = -1993730914;
            var19 = var10007;
            var10007 = (var19 | var70) & ~(var19 & var70);
            var70 = -1125783381;
            var19 = var10007;
            var10007 = var19 + var70 - 2 * (var19 & var70);
            var70 = -2030894921;
            var19 = 718632422;
            var10007 = (var19 | var70) & (~var19 | ~var70);
            var70 = -1273879797;
            var19 = var10007;
            var10007 = var19 + var70 - 2 * (var19 & var70);
            int var10009 = (int)4504409100826652423L;
            var70 = -455835482;
            var19 = var10009;
            var10009 = var19 + var70 - 2 * (var19 & var70);
            var70 = -585388125;
            var19 = var10009;
            var10009 = var19 + var70 - 2 * (var19 & var70);
            var70 = 1124942913;
            var19 = 1658673782;
            var10009 = (var19 | var70) & ~(var19 & var70);
            var70 = 567287335;
            var19 = var10009;
            var10009 = var19 + var70 - 2 * (var19 & var70);
            var70 = -1555281139;
            var19 = 862424689;
            var10009 = var19 + var70 - 2 * (var19 & var70);
            var70 = -1876179591;
            var19 = var10009;
            var10009 = (var19 | var70) - (var19 & var70);
            var70 = -1885779395;
            var19 = -756719827;
            var10009 = (var19 | var70) & ~(var19 & var70);
            var70 = 1568412953;
            var19 = var10009;
            var10009 = (var19 | var70) & ~(var19 & var70);
            int var10008 = (int)4725741056668341118L;
            var70 = 81556947;
            var19 = var10008;
            var10008 = var19 + var70 - 2 * (var19 & var70);
            var70 = -204221611;
            var19 = var10008;
            new Thread(
                  var10002,
                  b(
                     "ⶋ\uf81eⶹ\uf837ⶵ\uf832ⷱ\uf800ⶹ\uf836\u2db7",
                     "`ꟳꓺꁡꤐ絺蹙⑿譸㑿s\ua7e8꒱ꁽ꤀絤踅⑳謺㑧~ꞩ꒸ꁤꤖ絿蹉\u2435謚㑢a\ua7ef꒶ꁙ꤄絸蹎⑶謲㑥",
                     var10005,
                     var10006,
                     var10007,
                     var19 & ~var70 | ~var19 & var70
                  )
               )
               .start();
         }
      }
   }

   private static boolean q() {
      if (!g.get()) {
         if (!l) {
            int var141 = (int)4488722213701847363L;
            int var74 = -1909862666;
            int var7 = var141;
            var141 = var7 + var74 - 2 * (var7 & var74);
            var74 = -1120712780;
            var7 = var141;
            l = pulse.Bool.from((var7 | var74) & (~var7 | ~var74));

            try {
               k = MediaProvider.isAvailable();
               PrintStream var145 = System.out;
               boolean var1 = k;
               StringBuilder var146 = new StringBuilder();
               var74 = -972216829;
               var7 = -1203604612;
               int var147 = (var7 | var74) & (~var7 | ~var74);
               var74 = 1241010916;
               var7 = var147;
               var147 = var7 & ~var74 | ~var7 & var74;
               int var10003 = (int)-852830856628396891L;
               var74 = 219309021;
               var7 = var10003;
               var10003 = var7 & ~var74 | ~var7 & var74;
               var74 = 1270625719;
               var7 = var10003;
               var74 = (var7 | var74) - (var7 & var74);
               var7 = var147;
               var147 = 2 * (var7 | var74) - (var7 ^ var74);
               var74 = 1029513045;
               var7 = 1027912453;
               int var161 = (var7 | var74) & (~var7 | ~var74);
               var74 = 1682526;
               var7 = var161;
               var161 = (var7 | var74) - (var7 & var74);
               var161 = (int)1663739860886908094L;
               var74 = -157612024;
               var7 = var161;
               var161 = var7 + var74 - 2 * (var7 & var74);
               var74 = 1481204924;
               var7 = var161;
               var161 = (var7 | var74) & (~var7 | ~var74);
               var74 = 231127427;
               var7 = -1791699018;
               var161 = (var7 | var74) & (~var7 | ~var74);
               var74 = -1728942554;
               var7 = var161;
               var161 = (var7 | var74) & (~var7 | ~var74);
               var74 = -1282361461;
               var7 = -1218456733;
               var161 = var7 & ~var74 | ~var7 & var74;
               var74 = 622549485;
               var7 = var161;
               var161 = var7 + var74 - 2 * (var7 & var74);
               int var177 = (int)1894181199498959974L;
               var74 = 288336951;
               var7 = var177;
               var177 = (var7 | var74) - (var7 & var74);
               var74 = -369125435;
               var7 = var177;
               var74 = (var7 | var74) & (~var7 | ~var74);
               var7 = var161;
               var161 = (var7 & ~var74) + (var74 & ~var7) + 2 * (var7 & var74);
               var161 = (int)3011418104239638433L;
               var74 = 1010338342;
               var7 = var161;
               var161 = (var7 | var74) & (~var7 | ~var74);
               var74 = 742895088;
               var7 = var161;
               var161 = (var7 | var74) & ~(var7 & var74);
               var74 = 208660509;
               var7 = 1608854772;
               var177 = var7 + var74 - 2 * (var7 & var74);
               var74 = 1173383267;
               var7 = var177;
               var177 = (var7 | var74) - (var7 & var74);
               var74 = -1170798425;
               var7 = -1206910719;
               int var190 = var7 + var74 - 2 * (var7 & var74);
               var74 = -382003547;
               var7 = var190;
               var74 = (var7 | var74) - (var7 & var74);
               var7 = var177;
               var177 = (var7 & ~var74) + (var74 & ~var7) + 2 * (var7 & var74);
               var74 = 1983769562;
               var7 = 1022434961;
               var177 = (var7 | var74) - (var7 & var74);
               var74 = 484912861;
               var7 = var177;
               var177 = (var7 | var74) & ~(var7 & var74);
               var74 = -1904058366;
               var7 = -1156112399;
               var190 = (var7 | var74) & ~(var7 & var74);
               var74 = 1374973752;
               var7 = var190;
               var190 = (var7 | var74) - (var7 & var74);
               var74 = 2115215849;
               var7 = -1358712465;
               int var201 = (var7 | var74) & ~(var7 & var74);
               var74 = 481769677;
               var7 = var201;
               var74 = (var7 | var74) & (~var7 | ~var74);
               var7 = var190;
               var190 = (var7 ^ var74) + 2 * (var7 & var74);
               var190 = (int)7525414024348626979L;
               var74 = 1489985273;
               var7 = var190;
               var190 = (var7 | var74) & (~var7 | ~var74);
               var74 = 1438028354;
               var7 = var190;
               var190 = (var7 | var74) & (~var7 | ~var74);
               var74 = -215376552;
               var7 = -1708776739;
               var201 = var7 + var74 - 2 * (var7 & var74);
               var74 = -2142121891;
               var7 = var201;
               var201 = ((var7 | var74) & (~var7 | ~var74)) * ((var7 | var74) & (~var7 | ~var74));
               var201 = (int)937434937889252177L;
               var74 = -1860983784;
               var7 = var201;
               var201 = (var7 | var74) - (var7 & var74);
               var74 = 1774175655;
               var7 = var201;
               var145.println(
                  var146.append(
                        b(
                           "頑窒頣窻頯窾顦窳頯窽頴窾頴窦顦窾頰窾頯窳頧窽頪窺顼竿",
                           "`ꟳꓺꁡꤐ絺蹙⑿譸㑿s\ua7e8꒱ꁽ꤀絤踅⑳謺㑧~ꞩ꒸ꁤꤖ絿蹉\u2435謚㑢a\ua7ef꒶ꁙ꤄絸蹎⑶謲㑥",
                           var161,
                           var177,
                           var190,
                           var7 + var74 - 2 * (var7 & var74)
                        )
                     )
                     .append(var1)
                     .toString()
               );
            } catch (Throwable var5) {
               PrintStream var143 = System.out;
               String var2 = var5.getMessage();
               StringBuilder var10001 = new StringBuilder();
               String var10002 = "dqe";
               int var10004 = (int)2820215749307169924L;
               var74 = -755276473;
               var7 = var10004;
               var10004 = (var7 | var74) & (~var7 | ~var74);
               var74 = -175040055;
               var7 = var10004;
               var10004 = var7 & ~var74 | ~var7 & var74;
               var10004 = (int)4972392736500855057L;
               var74 = -441581309;
               var7 = var10004;
               var10004 = var7 & ~var74 | ~var7 & var74;
               var74 = -1284263913;
               var7 = var10004;
               var10004 = (var7 | var74) & ~(var7 & var74);
               var74 = 513665334;
               var7 = 1260550919;
               var10004 = (var7 | var74) - (var7 & var74);
               var74 = -1447451723;
               var7 = var10004;
               var10004 = (var7 + var74 - 2 * (var7 & var74)) * (var7 + var74 - 2 * (var7 & var74));
               var10004 = (int)5594870819204519379L;
               var74 = 210846274;
               var7 = var10004;
               var10004 = (var7 | var74) & ~(var7 & var74);
               var74 = 1735292902;
               var7 = var10004;
               var10004 = var7 & ~var74 | ~var7 & var74;
               var74 = -1434861279;
               var7 = -2139020324;
               int var10005 = (var7 | var74) & ~(var7 & var74);
               var74 = -41597876;
               var7 = var10005;
               var10005 = (var7 | var74) - (var7 & var74);
               var74 = -1765254189;
               var7 = -1905329983;
               var10005 = (var7 | var74) & ~(var7 & var74);
               var74 = 1296754213;
               var7 = var10005;
               var10005 = (var7 | var74) & (~var7 | ~var74);
               int var10006 = (int)3722964210764767660L;
               var74 = 1435509881;
               var7 = var10006;
               var10006 = (var7 | var74) - (var7 & var74);
               var74 = 1069310133;
               var7 = var10006;
               var10006 = var7 + var74 - 2 * (var7 & var74);
               var74 = 1499925127;
               var7 = 1833611211;
               int var10007 = (var7 | var74) & ~(var7 & var74);
               var74 = 964834075;
               var7 = var10007;
               var74 = (var7 | var74) & ~(var7 & var74);
               var7 = var10006;
               var10006 = (var7 | var74) + (var7 & var74);
               var10006 = (int)7463697547591401741L;
               var74 = 1566194954;
               var7 = var10006;
               var10006 = (var7 | var74) - (var7 & var74);
               var74 = 1140707541;
               var7 = var10006;
               var10006 = var7 & ~var74 | ~var7 & var74;
               var74 = 1950635715;
               var7 = 1345302340;
               var10007 = (var7 | var74) - (var7 & var74);
               var74 = 285501194;
               var7 = var10007;
               var10007 = var7 & ~var74 | ~var7 & var74;
               var74 = 1618527573;
               var7 = 1750549673;
               int var10008 = (var7 | var74) & ~(var7 & var74);
               var74 = 1983381271;
               var7 = var10008;
               var74 = var7 & ~var74 | ~var7 & var74;
               var7 = var10007;
               var10007 = (var7 | var74) + (var7 & var74);
               var74 = 941155392;
               var7 = -2076658951;
               var10007 = (var7 | var74) - (var7 & var74);
               var74 = -1138640330;
               var7 = var10007;
               var143.println(
                  var10001.append(
                        b(
                           "頑ᓳ頣ᓚ頯ᓟ顦ᓒ頯ᓜ頴ᓟ頴ᓇ顦ᓛ頴ᓌ頩ᓌ顼ᒞ",
                           "`ꟳꓺꁡꤐ絺蹙⑿譸㑿s\ua7e8꒱ꁽ꤀絤踅⑳謺㑧~ꞩ꒸ꁤꤖ絿蹉\u2435謚㑢a\ua7ef꒶ꁙ꤄絸蹎⑶謲㑥",
                           var10004,
                           var10005,
                           var10006,
                           (var7 | var74) & ~(var7 & var74)
                        )
                     )
                     .append(var2)
                     .toString()
               );
               var74 = -179259064;
               var7 = -978547019;
               var141 = (var7 | var74) & ~(var7 & var74);
               var74 = 821835773;
               var7 = var141;
               k = pulse.Bool.from((var7 | var74) - (var7 & var74));
            }
         }

         return k;
      } else {
         int var10000 = (int)-5594494708919076285L;
         int var4 = 509705069;
         int var3 = var10000;
         var10000 = (var3 | var4) & (~var3 | ~var4);
         var4 = 527565102;
         var3 = var10000;
         return pulse.Bool.from((var3 | var4) - (var3 & var4));
      }
   }

   public static boolean g() {
      int var8;
      if (k && !g.get()) {
         int var6 = 1581894802;
         int var3 = 1682848517;
         var8 = (var3 | var6) - (var3 & var6);
         var6 = 973600662;
         var3 = var8;
         var8 = var3 + var6 - 2 * (var3 & var6);
      } else {
         int var1 = 218322747;
         int var0 = 1712999946;
         var8 = (var0 | var1) - (var0 & var1);
         var1 = 1796806961;
         var0 = var8;
         var8 = (var0 | var1) & ~(var0 & var1);
      }

      return pulse.Bool.from(var8);
   }

   public static synchronized void h() {
      int var3 = 1018270900;
      int var2 = 1069256298;
      int var10001 = (var2 | var3) - (var2 & var3);
      var3 = 50993887;
      var2 = var10001;
      if (!g.getAndSet(pulse.Bool.from((var2 | var3) - (var2 & var3)))) {
         var3 = -567964487;
         var2 = -258743233;
         var10001 = var2 & ~var3 | ~var2 & var3;
         var3 = 1847125418;
         var2 = var10001;
         var10001 = var2 + var3 - 2 * (var2 & var3);
         var3 = 850454858;
         var2 = 1731361116;
         int var10002 = (var2 | var3) & (~var2 | ~var3);
         var3 = 1141249288;
         var2 = var10002;
         var3 = (var2 | var3) & ~(var2 & var3);
         var2 = var10001;
         var10001 = 2 * (var2 | var3) - (var2 ^ var3);
         var3 = -1816296173;
         var2 = 592411407;
         var10002 = (var2 | var3) & ~(var2 & var3);
         var3 = -168363863;
         var2 = var10002;
         var10002 = var2 & ~var3 | ~var2 & var3;
         int var10003 = (int)-9209160678706675290L;
         var3 = 350013979;
         var2 = var10003;
         var10003 = var2 + var3 - 2 * (var2 & var3);
         var3 = -497783787;
         var2 = var10003;
         var3 = (var2 | var3) & ~(var2 & var3);
         var2 = var10002;
         var10002 = 2 * (var2 | var3) - (var2 ^ var3);
         var3 = -1022088363;
         var2 = -514925728;
         var10003 = (var2 | var3) & (~var2 | ~var3);
         var3 = -1692406965;
         var2 = var10003;
         var10003 = var2 & ~var3 | ~var2 & var3;
         int var10004 = (int)5353261068602597272L;
         var3 = 1200014675;
         var2 = var10004;
         var10004 = (var2 | var3) & (~var2 | ~var3);
         var3 = 721281442;
         var2 = var10004;
         var3 = (var2 | var3) - (var2 & var3);
         var2 = var10003;
         var10003 = (var2 | var3) + (var2 & var3);
         var10003 = (int)3069838521892539078L;
         var3 = 836315265;
         var2 = var10003;
         var10003 = var2 & ~var3 | ~var2 & var3;
         var3 = 1408451120;
         var2 = var10003;
         var10003 = var2 & ~var3 | ~var2 & var3;
         String var280 = "dqf";
         var3 = -426285368;
         var2 = 531158402;
         var10004 = (var2 | var3) & ~(var2 & var3);
         var3 = -1174640323;
         var2 = var10004;
         var10004 = (var2 | var3) - (var2 & var3);
         String var10005 = "dqg";
         int var295 = (int)-6078039582660824776L;
         var3 = 809533972;
         var2 = var295;
         int var296 = (var2 | var3) & (~var2 | ~var3);
         var3 = -314561811;
         var2 = var296;
         int var297 = (var2 | var3) & ~(var2 & var3);
         var3 = -1085351468;
         var2 = -329691933;
         int var10006 = var2 + var3 - 2 * (var2 & var3);
         var3 = -2058947901;
         var2 = var10006;
         var10006 = ((var2 | var3) - (var2 & var3)) * ((var2 | var3) - (var2 & var3));
         var10006 = (int)-6383909026622123514L;
         var3 = 144242245;
         var2 = var10006;
         var10006 = var2 + var3 - 2 * (var2 & var3);
         var3 = 1165969950;
         var2 = var10006;
         System.out
            .println(
               b(
                  "\ueb87斖\ueba1斊\ueba0斗\uebba料\uebf4斚\uebbb斉\uebba旞\ueb83斳\uebb1斚\uebbd斟\uebfa旐\uebfa",
                  "`ꟳꓺꁡꤐ絺蹙⑿譸㑿s\ua7e8꒱ꁽ꤀絤踅⑳謺㑧~ꞩ꒸ꁤꤖ絿蹉\u2435謚㑢a\ua7ef꒶ꁙ꤄絸蹎⑶謲㑥",
                  var10003,
                  var10004,
                  var297,
                  (var2 | var3) & ~(var2 & var3)
               )
            );
         var10001 = (int)-4856106975355637386L;
         var3 = -1259835124;
         var2 = var10001;
         var10001 = (var2 | var3) & (~var2 | ~var3);
         var3 = -230096774;
         var2 = var10001;
         f.set(pulse.Bool.from((var2 | var3) - (var2 & var3)));
         if (h != null) {
            h.interrupt();

            try {
               var10001 = (int)2092982200275589410L;
               var3 = -40117058;
               var2 = var10001;
               var10001 = var2 + var3 - 2 * (var2 & var3);
               var3 = -799462879;
               var2 = var10001;
               var10001 = var2 & ~var3 | ~var2 & var3;
               var3 = 870087996;
               var2 = 1827460944;
               var10002 = (var2 | var3) & ~(var2 & var3);
               var3 = -420773168;
               var2 = var10002;
               var3 = (var2 | var3) - (var2 & var3);
               var2 = var10001;
               var10001 = (var2 & ~var3) + (var3 & ~var2) + 2 * (var2 & var3);
               h.join(1000L);
            } catch (InterruptedException var5) {
            }

            h = null;
         }

         i.set(null);
         var3 = 592087048;
         var2 = 1908797125;
         var10001 = (var2 | var3) & ~(var2 & var3);
         var3 = 1385129678;
         var2 = var10001;
         float[] var240 = new float[var2 + var3 - 2 * (var2 & var3)];
         var3 = 31269580;
         var2 = -601867731;
         var10003 = (var2 | var3) - (var2 & var3);
         var3 = -570615583;
         var2 = var10003;
         var240[(var2 | var3) & (~var2 | ~var3)] = 0.0F;
         var3 = 313623883;
         var2 = 303126706;
         var10003 = (var2 | var3) & (~var2 | ~var3);
         var3 = 10542584;
         var2 = var10003;
         var240[(var2 | var3) - (var2 & var3)] = 0.0F;
         var3 = -1106260128;
         var2 = 436537996;
         var10003 = (var2 | var3) & (~var2 | ~var3);
         var3 = -1542797842;
         var2 = var10003;
         var240[var2 & ~var3 | ~var2 & var3] = 0.0F;
         j.set(var240);
         if (k) {
            try {
               MediaProvider.shutdown();
               PrintStream var228 = System.out;
               var3 = -1285074324;
               var2 = -540821961;
               var10001 = (var2 | var3) & (~var2 | ~var3);
               var3 = 2080660177;
               var2 = var10001;
               var10001 = var2 + var3 - 2 * (var2 & var3);
               var10002 = (int)-7479368081496662495L;
               var3 = -1482373778;
               var2 = var10002;
               var10002 = var2 + var3 - 2 * (var2 & var3);
               var3 = 1587222034;
               var2 = var10002;
               var10002 = (var2 + var3 - 2 * (var2 & var3)) * (var2 + var3 - 2 * (var2 & var3));
               var3 = -943617407;
               var2 = 1730226597;
               var10003 = var2 & ~var3 | ~var2 & var3;
               var3 = -1991943193;
               var2 = var10003;
               var10003 = var2 & ~var3 | ~var2 & var3;
               var3 = -561708205;
               var2 = 2038639318;
               var10004 = (var2 | var3) & ~(var2 & var3);
               var3 = 607943751;
               var2 = var10004;
               var3 = var2 & ~var3 | ~var2 & var3;
               var2 = var10003;
               var10003 = (var2 | var3) + (var2 & var3);
               var3 = 1268498793;
               var2 = -147640638;
               var10003 = (var2 | var3) & (~var2 | ~var3);
               var3 = 699764700;
               var2 = var10003;
               var10003 = var2 + var3 - 2 * (var2 & var3);
               String var287 = "dqh";
               var3 = 1441099248;
               var2 = -259052150;
               var10004 = (var2 | var3) & ~(var2 & var3);
               var3 = -441729868;
               var2 = var10004;
               var10004 = (var2 | var3) & (~var2 | ~var3);
               var3 = 1827841316;
               var2 = -1256920180;
               var10006 = (var2 | var3) & ~(var2 & var3);
               var3 = -639217991;
               var2 = var10006;
               var10006 = (var2 | var3) & (~var2 | ~var3);
               var3 = 1363659144;
               var2 = 587888329;
               int var312 = (var2 | var3) & ~(var2 & var3);
               var3 = 2106292066;
               var2 = var312;
               int var313 = var2 & ~var3 | ~var2 & var3;
               var3 = 1841168390;
               var2 = -139023571;
               var10006 = (var2 | var3) & (~var2 | ~var3);
               var3 = 403088173;
               var2 = var10006;
               var10006 = (var2 | var3) - (var2 & var3);
               var3 = -2052310297;
               var2 = -1912328186;
               var10006 = var2 + var3 - 2 * (var2 & var3);
               var3 = 196549205;
               var2 = var10006;
               var228.println(
                  b(
                     "\ueb99魲\uebb0魾\uebb5魇\ueba6魸\ueba2魾\uebb0魲\ueba6鬹\ueba7魿\ueba1魣\uebb0魸\ueba3魹\uebfc鬾\uebf4魴\uebb5魻\uebb8魲\uebb0",
                     "`ꟳꓺꁡꤐ絺蹙⑿譸㑿s\ua7e8꒱ꁽ꤀絤踅⑳謺㑧~ꞩ꒸ꁤꤖ絿蹉\u2435謚㑢a\ua7ef꒶ꁙ꤄絸蹎⑶謲㑥",
                     var10003,
                     var10004,
                     var313,
                     var2 & ~var3 | ~var2 & var3
                  )
               );
            } catch (Throwable var4) {
               PrintStream var10000 = System.err;
               String var1 = var4.getMessage();
               StringBuilder var241 = new StringBuilder();
               String var252 = "dqi";
               String var269 = "dqj";
               int var298 = (int)1255105191159362826L;
               var3 = 1903487787;
               var2 = var298;
               int var299 = (var2 | var3) - (var2 & var3);
               var3 = -205939151;
               var2 = var299;
               int var300 = (var2 | var3) & ~(var2 & var3);
               var3 = 229657036;
               var2 = -1090608360;
               int var301 = (var2 | var3) & (~var2 | ~var3);
               var3 = -1286673724;
               var2 = var301;
               int var302 = (var2 | var3) & ~(var2 & var3);
               var3 = -838409122;
               var2 = 421910723;
               int var303 = (var2 | var3) - (var2 & var3);
               var3 = -685556577;
               var2 = var303;
               int var304 = (var2 | var3) & (~var2 | ~var3);
               int var305 = (int)65623230638680168L;
               var3 = -1374758408;
               var2 = var305;
               int var306 = (var2 | var3) & (~var2 | ~var3);
               var3 = -1456098922;
               var2 = var306;
               int var307 = (var2 | var3) & ~(var2 & var3);
               var10004 = (int)6953152664629779847L;
               var3 = -232099433;
               var2 = var10004;
               var10004 = (var2 | var3) & ~(var2 & var3);
               var3 = 862358631;
               var2 = var10004;
               var10004 = var2 & ~var3 | ~var2 & var3;
               var3 = -1395795194;
               var2 = -1910981243;
               int var308 = (var2 | var3) & (~var2 | ~var3);
               var3 = 1304488111;
               var2 = var308;
               int var309 = (var2 + var3 - 2 * (var2 & var3)) * (var2 + var3 - 2 * (var2 & var3));
               var3 = 117673510;
               var2 = 1074690113;
               int var310 = (var2 | var3) & ~(var2 & var3);
               var3 = 131367358;
               var2 = var310;
               int var311 = (var2 | var3) & ~(var2 & var3);
               var10006 = (int)-1336927456458359024L;
               var3 = -1771884716;
               var2 = var10006;
               var10006 = var2 & ~var3 | ~var2 & var3;
               var3 = 1045192303;
               var2 = var10006;
               var10006 = var2 + var3 - 2 * (var2 & var3);
               var10006 = (int)8223444212584237858L;
               var3 = -725187037;
               var2 = var10006;
               var10006 = var2 & ~var3 | ~var2 & var3;
               var3 = -1067801715;
               var2 = var10006;
               var10006 = (var2 | var3) & (~var2 | ~var3);
               int var10007 = (int)-3654254722475138952L;
               var3 = 834109780;
               var2 = var10007;
               var10007 = (var2 | var3) & (~var2 | ~var3);
               var3 = -1432458444;
               var2 = var10007;
               var10007 = var2 + var3 - 2 * (var2 & var3);
               var3 = 629351706;
               var2 = -2076089935;
               int var10008 = (var2 | var3) - (var2 & var3);
               var3 = 1696077916;
               var2 = var10008;
               var3 = (var2 | var3) & (~var2 | ~var3);
               var2 = var10007;
               var10007 = (var2 & ~var3) + (var3 & ~var2) + 2 * (var2 & var3);
               var10007 = (int)2002918241585003492L;
               var3 = -813766800;
               var2 = var10007;
               var10007 = var2 + var3 - 2 * (var2 & var3);
               var3 = -1868916949;
               var2 = var10007;
               var10000.println(
                  var241.append(
                        b(
                           "\ueb91n\ueba6s\ueba6<\uebb0i\ueba6u\uebba{\uebf4o\uebbci\ueba0x\uebbbk\uebba&\uebf4",
                           "`ꟳꓺꁡꤐ絺蹙⑿譸㑿s\ua7e8꒱ꁽ꤀絤踅⑳謺㑧~ꞩ꒸ꁤꤖ絿蹉\u2435謚㑢a\ua7ef꒶ꁙ꤄絸蹎⑶謲㑥",
                           var10004,
                           var311,
                           var10006,
                           (var2 | var3) & (~var2 | ~var3)
                        )
                     )
                     .append(var1)
                     .toString()
               );
            }
         }

         var3 = -1168853049;
         var2 = -418205667;
         int var229 = (var2 | var3) & (~var2 | ~var3);
         var3 = 1564870618;
         var2 = var229;
         k = pulse.Bool.from((var2 | var3) & ~(var2 & var3));
         var10001 = (int)2614933768192547158L;
         var3 = -627334148;
         var2 = var10001;
         var10001 = (var2 | var3) & (~var2 | ~var3);
         var3 = -354219099;
         var2 = var10001;
         var10001 = (var2 | var3) & (~var2 | ~var3);
         var10002 = (int)3211806634663519955L;
         var3 = -2109537794;
         var2 = var10002;
         var10002 = (var2 | var3) & (~var2 | ~var3);
         var3 = -4001444;
         var2 = var10002;
         var3 = var2 + var3 - 2 * (var2 & var3);
         var2 = var10001;
         var10001 = (var2 ^ var3) + 2 * (var2 & var3);
         String var258 = "dqk";
         String var275 = "dql";
         var10003 = (int)3967950778959264398L;
         var3 = 1470750073;
         var2 = var10003;
         var10003 = var2 + var3 - 2 * (var2 & var3);
         var3 = 414009216;
         var2 = var10003;
         var10003 = (var2 | var3) - (var2 & var3);
         var3 = -1136209222;
         var2 = -633863040;
         var10004 = (var2 | var3) - (var2 & var3);
         var3 = 1301406720;
         var2 = var10004;
         var10004 = var2 & ~var3 | ~var2 & var3;
         var10004 = (int)-2547717298757338419L;
         var3 = 636431822;
         var2 = var10004;
         var10004 = (var2 | var3) & ~(var2 & var3);
         var3 = 506170547;
         var2 = var10004;
         var10004 = (var2 | var3) & ~(var2 & var3);
         int var314 = (int)-2826550566050383111L;
         var3 = 2046865015;
         var2 = var314;
         int var315 = (var2 | var3) & (~var2 | ~var3);
         var3 = -656764657;
         var2 = var315;
         int var316 = var2 & ~var3 | ~var2 & var3;
         int var317 = (int)-759624097407546016L;
         var3 = -493339304;
         var2 = var317;
         int var318 = var2 & ~var3 | ~var2 & var3;
         var3 = -1875999040;
         var2 = var318;
         int var319 = (var2 | var3) & ~(var2 & var3);
         var10006 = (int)4538900977676029558L;
         var3 = -1863699992;
         var2 = var10006;
         var10006 = (var2 | var3) & ~(var2 & var3);
         var3 = -780388237;
         var2 = var10006;
         var10006 = (var2 | var3) & ~(var2 & var3);
         int var345 = (int)-2074840994894274702L;
         var3 = 203260772;
         var2 = var345;
         var345 = (var2 | var3) - (var2 & var3);
         var3 = 1429525409;
         var2 = var345;
         var3 = var2 + var3 - 2 * (var2 & var3);
         var2 = var10006;
         var10006 = 2 * (var2 | var3) - (var2 ^ var3);
         var10006 = (int)-8517801930823487310L;
         var3 = 593882944;
         var2 = var10006;
         var10006 = var2 + var3 - 2 * (var2 & var3);
         var3 = -850382748;
         var2 = var10006;
         System.out
            .println(
               b(
                  "\ueb83摸\uebb1摑\uebbd摔\uebf4摆\uebbc摀\ueba0摑\uebbb摂\uebba搕\uebb7摚\uebb9摅\uebb8摐\ueba0摐",
                  "`ꟳꓺꁡꤐ絺蹙⑿譸㑿s\ua7e8꒱ꁽ꤀絤踅⑳謺㑧~ꞩ꒸ꁤꤖ絿蹉\u2435謚㑢a\ua7ef꒶ꁙ꤄絸蹎⑶謲㑥",
                  var10003,
                  var10004,
                  var319,
                  (var2 | var3) & ~(var2 & var3)
               )
            );
      }
   }

   @Generated
   public MediaPlaybackState i() {
      return this.e;
   }

   static {
      int var1 = 395751805;
      int var0 = -796834673;
      int var10002 = var0 & ~var1 | ~var0 & var1;
      var1 = -954731022;
      var0 = var10002;
      f = new AtomicBoolean(pulse.Bool.from(var0 & (var1 ^ -1) | (var0 ^ -1) & var1));
      var10002 = (int)-4291920399168373834L;
      var1 = -81294351;
      var0 = var10002;
      var10002 = var0 & ~var1 | ~var0 & var1;
      var1 = 142045255;
      var0 = var10002;
      g = new AtomicBoolean(pulse.Bool.from((var0 | var1) - (var0 & var1)));
      var1 = -1653313819;
      var0 = 620965091;
      var10002 = (var0 | var1) - (var0 & var1);
      var1 = -1200143867;
      var0 = var10002;
      float[] var37 = new float[var0 & ~var1 | ~var0 & var1];
      int var10004 = (int)4710642409434426111L;
      var1 = 1448874056;
      var0 = var10004;
      var10004 = (var0 | var1) & (~var0 | ~var1);
      var1 = 1617345207;
      var0 = var10004;
      var37[(var0 | var1) & (~var0 | ~var1)] = 0.0F;
      var10004 = (int)-4454134296462050665L;
      var1 = 1471393357;
      var0 = var10004;
      var10004 = (var0 | var1) - (var0 & var1);
      var1 = -2100488997;
      var0 = var10004;
      var37[var0 + var1 - 2 * (var0 & var1)] = 0.0F;
      var10004 = (int)-7861680582578966525L;
      var1 = 335741611;
      var0 = var10004;
      var10004 = (var0 | var1) & (~var0 | ~var1);
      var1 = -708283734;
      var0 = var10004;
      var37[(var0 | var1) & (~var0 | ~var1)] = 0.0F;
      j = new AtomicReference<>(var37);
      int var10000 = (int)-5625437169538540579L;
      var1 = -146316380;
      var0 = var10000;
      var10000 = var0 & ~var1 | ~var0 & var1;
      var1 = 203896953;
      var0 = var10000;
      k = pulse.Bool.from((var0 | var1) & (~var0 | ~var1));
      var1 = -824576905;
      var0 = 1989280097;
      var10000 = (var0 | var1) & (~var0 | ~var1);
      var1 = -1202981610;
      var0 = var10000;
      l = pulse.Bool.from((var0 | var1) - (var0 & var1));
   }

   public static String b(String var0, String var1, int var2, int var3, int var4, int var5) {
      char[] var6 = var1.toCharArray();
      char[] var7 = new char[var6.length];
      int var20 = 1290994406;
      int var19 = 1311153931;
      int var10000 = (var19 | var20) - (var19 & var20);
      var20 = 47554023;
      var19 = var10000;
      char[] var278 = new char[var19 + var20 - 2 * (var19 & var20)];
      int var10002 = (int)-3895492689551634081L;
      var20 = 125714849;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = -1185246978;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = 2138805325;
      var19 = -1744461461;
      int var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = -411140844;
      var19 = var10003;
      var278[var10002] = (char)((var19 | var20) - (var19 & var20));
      var10002 = (int)682719068575629426L;
      var20 = -1329915328;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = -1687348685;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = 1484226492;
      var19 = 294009134;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = 1240556823;
      var19 = var10003;
      var278[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      var20 = -1989853659;
      var19 = -1959707743;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = 39060870;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var10003 = (int)-8603164833210325219L;
      var20 = -1815290494;
      var19 = var10003;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = -7251687;
      var19 = var10003;
      var278[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      var20 = 794420103;
      var19 = 794247129;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = 973917;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var10003 = (int)-6230945846546613530L;
      var20 = -1203936949;
      var19 = var10003;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = 1338210769;
      var19 = var10003;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = -1425724201;
      var19 = -1087163960;
      int var10004 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1967338945;
      var19 = var10004;
      var20 = var19 & ~var20 | ~var19 & var20;
      var19 = var10003;
      var10003 = var19 - ~var20 - 1;
      var20 = -1827861825;
      var19 = -340830071;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = 2023934501;
      var19 = var10003;
      var278[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      var10002 = (int)1322776356346915981L;
      var20 = 1716094729;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = 320760704;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = -936827363;
      var19 = -927989993;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = 584349740;
      var19 = var10003;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = -956615888;
      var19 = -312986964;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = 732139705;
      var19 = var10003;
      var278[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      var10002 = (int)-8415049183767512985L;
      var20 = 839306134;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = 404648948;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var10003 = (int)7576913866091067071L;
      var20 = -1219549249;
      var19 = var10003;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = -312896382;
      var19 = var10003;
      var278[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      var20 = -293927602;
      var19 = 1972627877;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = -1679233811;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var10003 = (int)-3154700385072273902L;
      var20 = -203220090;
      var19 = var10003;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = 1025094791;
      var19 = var10003;
      var278[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      var20 = 910249165;
      var19 = 1406537900;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = 1704418406;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var10003 = (int)5976023054082441339L;
      var20 = -1199802147;
      var19 = var10003;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = -1805824892;
      var19 = var10003;
      var278[var10002] = (char)((var19 | var20) & ~(var19 & var20));
      var20 = -378748178;
      var19 = -1612508996;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = 1989136986;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = -913450018;
      var19 = -86121819;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = 860893480;
      var19 = var10003;
      var278[var10002] = (char)((var19 | var20) & ~(var19 & var20));
      var20 = -1724605775;
      var19 = -229429482;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = 1801958830;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = -675690320;
      var19 = 922811229;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = -524733239;
      var19 = var10003;
      var278[var10002] = (char)((var19 | var20) & ~(var19 & var20));
      char[] var8 = var278;
      var10000 = (int)-4343588476162630813L;
      var20 = -77922531;
      var19 = var10000;
      var10000 = var19 & ~var20 | ~var19 & var20;
      var20 = -1467849612;
      var19 = var10000;
      char[] var281 = new char[(var19 | var20) & (~var19 | ~var20)];
      var20 = -1574870190;
      var19 = -69613120;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = 1509468818;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = -1875122517;
      var19 = 486034195;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = -1933318760;
      var19 = var10003;
      var281[var10002] = (char)((var19 | var20) - (var19 & var20));
      var10002 = (int)-4821391046075075239L;
      var20 = -796033723;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = -1073788899;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var10003 = (int)7377909073944077739L;
      var20 = 655551819;
      var19 = var10003;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = 1588858277;
      var19 = var10003;
      var10003 = ((var19 | var20) & ~(var19 & var20)) * ((var19 | var20) & ~(var19 & var20));
      var10003 = (int)8023365038496733754L;
      var20 = 1009050000;
      var19 = var10003;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = 315015081;
      var19 = var10003;
      var281[var10002] = (char)((var19 | var20) - (var19 & var20));
      var20 = 1314998574;
      var19 = -892427395;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = -2068845999;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = -636280438;
      var19 = 518879902;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = -1561264691;
      var19 = var10003;
      var10003 = (var19 & ~var20 | ~var19 & var20) * (var19 & ~var20 | ~var19 & var20);
      var20 = -91563695;
      var19 = 1818065249;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = -1764284573;
      var19 = var10003;
      var281[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      var20 = -33612598;
      var19 = -1574655555;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = 1608234356;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var10003 = (int)-7957113658350409981L;
      var20 = 90489476;
      var19 = var10003;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = 1241095557;
      var19 = var10003;
      var281[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      var10002 = (int)8258684280317120071L;
      var20 = 1609479780;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = -410437593;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = 37685110;
      var19 = 973269111;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = 943576897;
      var19 = var10003;
      var281[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      var20 = -1850367979;
      var19 = 2064988545;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = -358573679;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = -1532242832;
      var19 = -1069092858;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = 1693261026;
      var19 = var10003;
      var281[var10002] = (char)((var19 | var20) & ~(var19 & var20));
      var20 = -457653076;
      var19 = 1435618859;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = -1322710399;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var10003 = (int)5077018732030595730L;
      var20 = 2058555345;
      var19 = var10003;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = -1723973761;
      var19 = var10003;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = 881595446;
      var19 = -645783399;
      var10004 = (var19 | var20) - (var19 & var20);
      var20 = -234345595;
      var19 = var10004;
      var20 = (var19 | var20) & (~var19 | ~var20);
      var19 = var10003;
      var10003 = (var19 & ~var20) + (var20 & ~var19) + 2 * (var19 & var20);
      var10003 = (int)-4831342782968175463L;
      var20 = 380153166;
      var19 = var10003;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = 933285614;
      var19 = var10003;
      var281[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      var10002 = (int)-1000648310706200284L;
      var20 = 718704225;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = -1785352382;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var10003 = (int)-5669839649258371026L;
      var20 = -1734776042;
      var19 = var10003;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = -1809911040;
      var19 = var10003;
      var281[var10002] = (char)((var19 | var20) - (var19 & var20));
      var20 = -494508427;
      var19 = -655062505;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = 980610154;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var10003 = (int)-8757425315128451351L;
      var20 = 1868690753;
      var19 = var10003;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = -1680938721;
      var19 = var10003;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var10003 = (int)-1919748502927372018L;
      var20 = -1157066433;
      var19 = var10003;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = -739966155;
      var19 = var10003;
      var281[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      var10002 = (int)7488870793307595206L;
      var20 = -1906407649;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = -2051332400;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var10003 = (int)6556638883413031847L;
      var20 = -124503718;
      var19 = var10003;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = -1764953650;
      var19 = var10003;
      var281[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      char[] var9 = var281;
      var20 = -2073501006;
      var19 = 619451968;
      var10000 = (var19 | var20) - (var19 & var20);
      var20 = -1601899278;
      var19 = var10000;

      for (int var10 = (var19 | var20) & ~(var19 & var20); var10 < var6.length; var10++) {
         char var345 = var6[var10];
         char var254 = var8[var10 % var8.length];
         char var127 = var345;
         var7[var10] = (char)(var127 & ~var254 | ~var127 & var254);
      }

      char[] var21 = new char[var7.length];
      var20 = -1896313360;
      var19 = 9370534;
      var10000 = (var19 | var20) & ~(var19 & var20);
      var20 = -1904839082;
      var19 = var10000;

      for (int var11 = var19 & ~var20 | ~var19 & var20; var11 < var6.length; var11++) {
         char var346 = var7[var11];
         char var257 = var9[var11 % var9.length];
         char var130 = var346;
         var21[var11] = (char)((var130 | var257) & ~(var130 & var257));
      }

      String var22 = new String(var21);
      int var12 = var22.hashCode();
      var20 = var5;
      var19 = var3;
      var10000 = 2 * (var19 & ~var20) - (var19 ^ var20);
      var20 = var2;
      var19 = var10000;
      int var13 = var19 - var20;
      char[] var14 = var0.toCharArray();
      char[] var15 = new char[var14.length];
      var20 = 34456024;
      var19 = -481432468;
      var10000 = (var19 | var20) & (~var19 | ~var20);
      var20 = -515887692;
      var19 = var10000;
      int var16 = var19 & ~var20 | ~var19 & var20;
      var20 = -975107018;
      var19 = 215821007;
      int var10001 = var19 & ~var20 | ~var19 & var20;
      var20 = -918804751;
      var19 = var10001;
      var10001 = var19 + var20 - 2 * (var19 & var20);
      var10001 = (int)1897570767705775082L;
      var20 = 143409367;
      var19 = var10001;
      var10001 = (var19 | var20) & (~var19 | ~var20);
      var20 = 835246894;
      var19 = var10001;
      var10001 = (var19 | var20) & (~var19 | ~var20);
      var20 = 1647538721;
      var19 = 1957288274;
      var10000 = var19 + var20 - 2 * (var19 & var20);
      var20 = 401746615;
      var19 = var10000;
      int var18 = var19 + var20 - 2 * (var19 & var20);
      a = var18;
      String var287 = "dqm";
      var10000 = (int)-1698568769922562363L;
      var20 = -2112058455;
      var19 = var10000;
      var10000 = (var19 | var20) & ~(var19 & var20);
      var20 = -2088130148;
      var19 = var10000;
      if (((var19 | var20) & (~var19 | ~var20)) < a) {
         String var290 = "dqn";
         var20 = -1232017570;
         var19 = 1899826028;
         var10000 = (var19 | var20) & ~(var19 & var20);
         var20 = 1985266505;
         var19 = var10000;
         var18 = (var19 | var20) & ~(var19 & var20);
      }

      for (; var16 < var15.length; var16++) {
         var10001 = (int)4872125221250563834L;
         var20 = 776827131;
         var19 = var10001;
         var10001 = (var19 | var20) & ~(var19 & var20);
         var20 = 395382275;
         var19 = var10001;
         switch (var16 % (var19 & ~var20 | ~var19 & var20)) {
            case 0:
               var20 = var12;
               var19 = var13;
               var10002 = (var19 | var20) & ~(var19 & var20);
               char var277 = var14[var16];
               var19 = var10002;
               var15[var16] = (char)(var19 & ~var277 | ~var19 & var277);
               if (a != a) {
                  throw new IllegalAccessError();
               }
               break;
            case 1:
               var20 = var13;
               var19 = var5;
               var10002 = (var19 | var20) & ~(var19 & var20);
               char var275 = var14[var16];
               var19 = var10002;
               var15[var16] = (char)((var19 | var275) - (var19 & var275));
         }
      }

      return new String(var15);
   }

   private static class MediaSnapshot {
      final String a;
      final String b;
      final boolean c;
      final float d;
      final float e;
      final byte[] f;
      final long g;
      public static int h;
      public static boolean i;

      MediaSnapshot(String var1, String var2, boolean var3, float var4, float var5, byte[] var6) {
         this.a = var1;
         this.b = var2;
         this.c = var3;
         this.d = var4;
         this.e = var5;
         this.f = var6;
         this.g = System.currentTimeMillis();
      }

      public static String a(String var0, String var1, int var2, int var3, int var4, int var5) {
         char[] var6 = var1.toCharArray();
         char[] var7 = new char[var6.length];
         int var20 = 1362925548;
         int var19 = 1250719222;
         int var10000 = (var19 | var20) - (var19 & var20);
         var20 = 464577040;
         var19 = var10000;
         char[] var315 = new char[var19 & ~var20 | ~var19 & var20];
         int var10002 = (int)-2725702433439859173L;
         var20 = 1750833301;
         var19 = var10002;
         var10002 = (var19 | var20) & (~var19 | ~var20);
         var20 = 1799202446;
         var19 = var10002;
         var10002 = var19 & ~var20 | ~var19 & var20;
         var20 = 1031523750;
         var19 = -746581894;
         int var10003 = var19 + var20 - 2 * (var19 & var20);
         var20 = -285501970;
         var19 = var10003;
         var315[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
         var20 = -1169350809;
         var19 = 1127426421;
         var10002 = (var19 | var20) & ~(var19 & var20);
         var20 = -109169133;
         var19 = var10002;
         var10002 = (var19 | var20) - (var19 & var20);
         var20 = 673942239;
         var19 = 632140704;
         var10003 = (var19 | var20) & (~var19 | ~var20);
         var20 = 226892538;
         var19 = var10003;
         var315[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
         var20 = -1161396186;
         var19 = -1524368008;
         var10002 = (var19 | var20) & (~var19 | ~var20);
         var20 = 535133532;
         var19 = var10002;
         var10002 = var19 & ~var20 | ~var19 & var20;
         var20 = -1772420842;
         var19 = 744323359;
         var10003 = var19 & ~var20 | ~var19 & var20;
         var20 = -1173988465;
         var19 = var10003;
         var315[var10002] = (char)((var19 | var20) & ~(var19 & var20));
         var10002 = (int)5229959441541906406L;
         var20 = -283221720;
         var19 = var10002;
         var10002 = var19 & ~var20 | ~var19 & var20;
         var20 = -506437939;
         var19 = var10002;
         var10002 = (var19 | var20) & (~var19 | ~var20);
         int var10004 = (int)-9130261557904475177L;
         var20 = -736039599;
         var19 = var10004;
         var10004 = var19 + var20 - 2 * (var19 & var20);
         var20 = 1787958933;
         var19 = var10004;
         var10004 = var19 & ~var20 | ~var19 & var20;
         var20 = -643403358;
         var19 = -168484630;
         var10003 = var19 + var20 - 2 * (var19 & var20);
         var20 = 743688539;
         var19 = var10003;
         var315[var10002] = (char)((var19 | var20) - (var19 & var20));
         var10002 = (int)-87960978916829500L;
         var20 = -448880271;
         var19 = var10002;
         var10002 = (var19 | var20) & (~var19 | ~var20);
         var20 = 1286584241;
         var19 = var10002;
         var10002 = var19 + var20 - 2 * (var19 & var20);
         var10003 = (int)-7995955904165282033L;
         var20 = -1446286652;
         var19 = var10003;
         var10003 = (var19 | var20) & (~var19 | ~var20);
         var20 = -465442121;
         var19 = var10003;
         var10003 = (var19 | var20) & ~(var19 & var20);
         var20 = 1044104533;
         var19 = -1168685871;
         var10004 = (var19 | var20) & (~var19 | ~var20);
         var20 = -1621430568;
         var19 = var10004;
         var20 = var19 + var20 - 2 * (var19 & var20);
         var19 = var10003;
         var10003 = (var19 ^ var20) + 2 * (var19 & var20);
         var20 = 489411664;
         var19 = 1804264460;
         var10003 = var19 & ~var20 | ~var19 & var20;
         var20 = 1990304121;
         var19 = var10003;
         var315[var10002] = (char)((var19 | var20) & ~(var19 & var20));
         var10002 = (int)6636505965829912187L;
         var20 = 145113547;
         var19 = var10002;
         var10002 = (var19 | var20) & (~var19 | ~var20);
         var20 = -1414842443;
         var19 = var10002;
         var10002 = (var19 | var20) & ~(var19 & var20);
         var20 = -1201364535;
         var19 = 1427488931;
         var10003 = (var19 | var20) - (var19 & var20);
         var20 = -311352088;
         var19 = var10003;
         var315[var10002] = (char)((var19 | var20) - (var19 & var20));
         var10002 = (int)-4201455811719170535L;
         var20 = -472919221;
         var19 = var10002;
         var10002 = (var19 | var20) & (~var19 | ~var20);
         var20 = -248142508;
         var19 = var10002;
         var10002 = (var19 | var20) & (~var19 | ~var20);
         var20 = -829643667;
         var19 = -209318336;
         var10003 = var19 + var20 - 2 * (var19 & var20);
         var20 = 1024107326;
         var19 = var10003;
         var315[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
         var20 = -509664983;
         var19 = -200619059;
         var10002 = var19 & ~var20 | ~var19 & var20;
         var20 = 362146531;
         var19 = var10002;
         var10002 = (var19 | var20) - (var19 & var20);
         var20 = -858871254;
         var19 = 1194825316;
         var10003 = (var19 | var20) & ~(var19 & var20);
         var20 = -1946613652;
         var19 = var10003;
         var315[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
         var20 = 1644315856;
         var19 = 689580038;
         var10002 = (var19 | var20) - (var19 & var20);
         var20 = 1259891934;
         var19 = var10002;
         var10002 = var19 & ~var20 | ~var19 & var20;
         var10003 = (int)-4414138194888869604L;
         var20 = 850332749;
         var19 = var10003;
         var10003 = var19 + var20 - 2 * (var19 & var20);
         var20 = -628802302;
         var19 = var10003;
         var315[var10002] = (char)((var19 | var20) & ~(var19 & var20));
         var20 = 1929899311;
         var19 = 1884825636;
         var10002 = (var19 | var20) - (var19 & var20);
         var20 = 56608002;
         var19 = var10002;
         var10002 = var19 & ~var20 | ~var19 & var20;
         var10003 = (int)1363319746699807044L;
         var20 = -127832861;
         var19 = var10003;
         var10003 = var19 + var20 - 2 * (var19 & var20);
         var20 = -651156861;
         var19 = var10003;
         var315[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
         char[] var8 = var315;
         var10000 = (int)-1715160138867543017L;
         var20 = -697016095;
         var19 = var10000;
         var10000 = (var19 | var20) - (var19 & var20);
         var20 = 865572092;
         var19 = var10000;
         char[] var318 = new char[(var19 | var20) - (var19 & var20)];
         var10002 = (int)-7036629728113639147L;
         var20 = -1886850816;
         var19 = var10002;
         var10002 = (var19 | var20) & (~var19 | ~var20);
         var20 = -1336037355;
         var19 = var10002;
         var10002 = (var19 | var20) & ~(var19 & var20);
         var10003 = (int)-8067465717830086949L;
         var20 = 725487777;
         var19 = var10003;
         var10003 = var19 & ~var20 | ~var19 & var20;
         var20 = 1747375706;
         var19 = var10003;
         var318[var10002] = (char)((var19 | var20) & ~(var19 & var20));
         var20 = -2087520850;
         var19 = -2078628467;
         var10002 = var19 & ~var20 | ~var19 & var20;
         var20 = 126373922;
         var19 = var10002;
         var10002 = var19 + var20 - 2 * (var19 & var20);
         var10003 = (int)-2634038123577912926L;
         var20 = -1228615296;
         var19 = var10003;
         var10003 = var19 + var20 - 2 * (var19 & var20);
         var20 = 1333691015;
         var19 = var10003;
         var10003 = (var19 | var20) - (var19 & var20);
         var20 = 337057931;
         var19 = 439449868;
         var10003 = var19 + var20 - 2 * (var19 & var20);
         var20 = 237430148;
         var19 = var10003;
         var318[var10002] = (char)((var19 | var20) & ~(var19 & var20));
         var20 = 98811797;
         var19 = 1055327702;
         var10002 = (var19 | var20) & ~(var19 & var20);
         var20 = 990165569;
         var19 = var10002;
         var10002 = (var19 | var20) - (var19 & var20);
         var10003 = (int)-3243931272505272642L;
         var20 = -586906766;
         var19 = var10003;
         var10003 = var19 & ~var20 | ~var19 & var20;
         var20 = -2116017125;
         var19 = var10003;
         var10003 = (var19 | var20) & ~(var19 & var20);
         var10004 = (int)6541949746921247559L;
         var20 = -953819386;
         var19 = var10004;
         var10004 = var19 + var20 - 2 * (var19 & var20);
         var20 = 1015738491;
         var19 = var10004;
         var20 = var19 + var20 - 2 * (var19 & var20);
         var19 = var10003;
         var10003 = var19 - ~var20 - 1;
         var10003 = (int)3314667215819114471L;
         var20 = 254784862;
         var19 = var10003;
         var10003 = (var19 | var20) & ~(var19 & var20);
         var20 = 1420244458;
         var19 = var10003;
         var318[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
         var20 = 1333853970;
         var19 = -79424958;
         var10002 = var19 + var20 - 2 * (var19 & var20);
         var20 = -1262162605;
         var19 = var10002;
         var10002 = (var19 | var20) - (var19 & var20);
         var10003 = (int)-3051485763986110794L;
         var20 = -2134726020;
         var19 = var10003;
         var10003 = var19 & ~var20 | ~var19 & var20;
         var20 = -122628920;
         var19 = var10003;
         var318[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
         var20 = -1758094869;
         var19 = -574824250;
         var10002 = (var19 | var20) - (var19 & var20);
         var20 = 1250523433;
         var19 = var10002;
         var10002 = var19 & ~var20 | ~var19 & var20;
         var20 = -616967365;
         var19 = 245843965;
         var10003 = var19 + var20 - 2 * (var19 & var20);
         var20 = -711021434;
         var19 = var10003;
         var318[var10002] = (char)((var19 | var20) & ~(var19 & var20));
         var20 = -1233164220;
         var19 = -1143025203;
         var10002 = (var19 | var20) - (var19 & var20);
         var20 = 228702604;
         var19 = var10002;
         var10002 = (var19 | var20) & ~(var19 & var20);
         var20 = 1518881213;
         var19 = -665836242;
         var10003 = var19 & ~var20 | ~var19 & var20;
         var20 = -2099751929;
         var19 = var10003;
         var318[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
         var10002 = (int)410808385278468469L;
         var20 = -1458995831;
         var19 = var10002;
         var10002 = var19 + var20 - 2 * (var19 & var20);
         var20 = 1783569658;
         var19 = var10002;
         var10002 = (var19 | var20) & ~(var19 & var20);
         var10003 = (int)3146252872271449819L;
         var20 = -1824719818;
         var19 = var10003;
         var10003 = (var19 | var20) & (~var19 | ~var20);
         var20 = 1843146501;
         var19 = var10003;
         var10003 = var19 + var20 - 2 * (var19 & var20);
         var10004 = (int)-892124320024710172L;
         var20 = 894029081;
         var19 = var10004;
         var10004 = (var19 | var20) & (~var19 | ~var20);
         var20 = -1010605974;
         var19 = var10004;
         var20 = var19 & ~var20 | ~var19 & var20;
         var19 = var10003;
         var10003 = var19 - ~var20 - 1;
         var20 = -810342275;
         var19 = 1468104157;
         var10003 = (var19 | var20) & (~var19 | ~var20);
         var20 = -1741499751;
         var19 = var10003;
         var318[var10002] = (char)((var19 | var20) - (var19 & var20));
         var10002 = (int)-899808830122929710L;
         var20 = -1319109445;
         var19 = var10002;
         var10002 = var19 + var20 - 2 * (var19 & var20);
         var20 = 1536994670;
         var19 = var10002;
         var10002 = (var19 | var20) - (var19 & var20);
         var10003 = (int)4212861016165682176L;
         var20 = 517180379;
         var19 = var10003;
         var10003 = (var19 | var20) & (~var19 | ~var20);
         var20 = 443946979;
         var19 = var10003;
         var318[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
         var20 = 871994373;
         var19 = 419502257;
         var10002 = var19 & ~var20 | ~var19 & var20;
         var20 = 720932028;
         var19 = var10002;
         var10002 = var19 + var20 - 2 * (var19 & var20);
         var20 = -402120578;
         var19 = 342616421;
         var10003 = (var19 | var20) & ~(var19 & var20);
         var20 = -616783618;
         var19 = var10003;
         var10003 = ((var19 | var20) & ~(var19 & var20)) * ((var19 | var20) & ~(var19 & var20));
         var10003 = (int)8177578136077833097L;
         var20 = -261074935;
         var19 = var10003;
         var10003 = (var19 | var20) & ~(var19 & var20);
         var20 = 60506244;
         var19 = var10003;
         var318[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
         var10002 = (int)-5989757635950454100L;
         var20 = -644292455;
         var19 = var10002;
         var10002 = (var19 | var20) - (var19 & var20);
         var20 = -1813661124;
         var19 = var10002;
         var10002 = var19 + var20 - 2 * (var19 & var20);
         var20 = 1765730707;
         var19 = -665434494;
         var10003 = var19 & ~var20 | ~var19 & var20;
         var20 = -1318544350;
         var19 = var10003;
         var318[var10002] = (char)((var19 | var20) - (var19 & var20));
         char[] var9 = var318;
         var20 = 1034613328;
         var19 = -896806521;
         var10000 = (var19 | var20) - (var19 & var20);
         var20 = -148823081;
         var19 = var10000;

         for (int var10 = (var19 | var20) & (~var19 | ~var20); var10 < var6.length; var10++) {
            if (h != h) {
               int var10001 = (int)-3837467222316197030L;
               var20 = -1165093276;
               var19 = var10001;
               var10001 = var19 + var20 - 2 * (var19 & var20);
               var20 = 439176500;
               var19 = var10001;
               var10001 = var19 & ~var20 | ~var19 & var20;
               var20 = 1042027956;
               var19 = -1022022138;
               var10001 = var19 & ~var20 | ~var19 & var20;
               var20 = -49726559;
               var19 = var10001;
               var10001 = (var19 | var20) & (~var19 | ~var20);
               var20 = 1558923620;
               var19 = 411344010;
               var10001 = var19 + var20 - 2 * (var19 & var20);
               var20 = 1148179944;
               var19 = var10001;
               var10001 = (var19 | var20) - (var19 & var20);
               var20 = -1922394959;
               var19 = -1988212506;
               var10000 = (var19 | var20) & (~var19 | ~var20);
               var20 = 2120681929;
               var19 = var10000;
               int var18 = var19 & ~var20 | ~var19 & var20;
            }

            char var400 = var6[var10];
            char var284 = var8[var10 % var8.length];
            char var139 = var400;
            var7[var10] = (char)(var139 + var284 - 2 * (var139 & var284));
         }

         char[] var21 = new char[var7.length];
         var10000 = (int)3960239074721244852L;
         var20 = -46879472;
         var19 = var10000;
         var10000 = var19 + var20 - 2 * (var19 & var20);
         var20 = 928320420;
         var19 = var10000;

         for (int var11 = var19 & ~var20 | ~var19 & var20; var11 < var6.length; var11++) {
            char var401 = var7[var11];
            char var287 = var9[var11 % var9.length];
            char var142 = var401;
            var21[var11] = (char)((var142 | var287) - (var142 & var287));
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
         var20 = 120256613;
         var19 = -204477316;
         var10000 = var19 + var20 - 2 * (var19 & var20);
         var20 = -186313703;
         var19 = var10000;
         int var16 = var19 & ~var20 | ~var19 & var20;
         int var341 = (int)-7098373747389976637L;
         var20 = 2138568519;
         var19 = var341;
         var341 = var19 + var20 - 2 * (var19 & var20);
         var20 = 11229335;
         var19 = var341;
         var341 = var19 + var20 - 2 * (var19 & var20);
         var20 = -1119992202;
         var19 = -1579156470;
         var341 = (var19 | var20) & ~(var19 & var20);
         var20 = 484555378;
         var19 = var341;
         var341 = (var19 | var20) - (var19 & var20);
         var341 = (int)4127354286169477903L;
         var20 = 1135046987;
         var19 = var341;
         var341 = var19 & ~var20 | ~var19 & var20;
         var20 = 1257644621;
         var19 = var341;
         var341 = (var19 | var20) & (~var19 | ~var20);
         var10000 = (int)7797844566451340210L;
         var20 = -1408472319;
         var19 = var10000;
         var10000 = (var19 | var20) & (~var19 | ~var20);
         var20 = 1031238840;
         var19 = var10000;
         int var23 = var19 & ~var20 | ~var19 & var20;
         h = var23;
         var10000 = (int)-6302155541779291945L;
         var20 = 1380553368;
         var19 = var10000;
         var10000 = var19 + var20 - 2 * (var19 & var20);
         var20 = -114046029;
         var19 = var10000;
         var10000 = (var19 | var20) & ~(var19 & var20);
         var341 = (int)-2384587769625145085L;
         var20 = -438070863;
         var19 = var341;
         var341 = var19 + var20 - 2 * (var19 & var20);
         var20 = 16551292;
         var19 = var341;
         var20 = (var19 | var20) - (var19 & var20);
         var19 = var10000;
         var10000 = 2 * (var19 | var20) - (var19 ^ var20);
         var10000 = (int)-825410977613663489L;
         var20 = 1333357134;
         var19 = var10000;
         var10000 = var19 + var20 - 2 * (var19 & var20);
         var20 = -1730824434;
         var19 = var10000;
         if ((var19 | var20) - (var19 & var20) <= h) {
            String var333 = "dsj";
            var20 = -1014807054;
            var19 = 1597294956;
            var10000 = (var19 | var20) & (~var19 | ~var20);
            var20 = -1962329204;
            var19 = var10000;
            var23 = (var19 | var20) & (~var19 | ~var20);
         }

         for (; var16 < var15.length; var16++) {
            var20 = 617061927;
            var19 = -2068515016;
            var341 = (var19 | var20) & (~var19 | ~var20);
            var20 = -1603049187;
            var19 = var341;
            switch (var16 % (var19 + var20 - 2 * (var19 & var20))) {
               case 0:
                  var20 = var12;
                  var19 = var13;
                  var10002 = (var19 | var20) & (~var19 | ~var20);
                  char var314 = var14[var16];
                  var19 = var10002;
                  var15[var16] = (char)(var19 + var314 - 2 * (var19 & var314));
                  break;
               case 1:
                  var20 = var13;
                  var19 = var5;
                  var10002 = var19 + var20 - 2 * (var19 & var20);
                  char var312 = var14[var16];
                  var19 = var10002;
                  var15[var16] = (char)(var19 & ~var312 | ~var19 & var312);
            }
         }

         return new String(var15);
      }
   }
}
