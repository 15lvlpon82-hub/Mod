package pulse;


import pulse.client.MinecraftContext;
import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Predicate;
import lombok.Generated;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.VillagerEntity;
import net.minecraft.entity.player.PlayerEntity;

public final class EntityFinder implements MinecraftContext {
   public static int a;
   public static boolean b;

   public static CopyOnWriteArrayList<Entity> a(Predicate<Entity> var0, EntityTargetType... var1) {
      CopyOnWriteArrayList<Entity> var2 = new CopyOnWriteArrayList<>();
      if (c.world == null) {
         return var2;
      }

      for (Entity var4 : c.world.getEntities()) {
         if (var0.test(var4) && !(var4 instanceof ClientPlayerEntity)) {
            if (var4 instanceof PlayerEntity && Arrays.stream(var1).anyMatch(var0x -> {
               int var9;
               if (var0x != EntityTargetType.PLAYER) {
                  int var2x = 319011309;
                  int var1x = 911986577;
                  var9 = var1x + var2x - 2 * (var1x & var2x);
                  var2x = 626554492;
                  var1x = var9;
                  var9 = (var1x | var2x) & ~(var1x & var2x);
               } else {
                  int var7 = -1982712545;
                  int var4x = 845014943;
                  var9 = var4x & ~var7 | ~var4x & var7;
                  var7 = -1148202367;
                  var4x = var9;
                  var9 = (var4x | var7) - (var4x & var7);
               }

               return pulse.Bool.from(var9);
            })) {
               var2.add(var4);
            }

            if (var4 instanceof VillagerEntity && Arrays.stream(var1).anyMatch(var0x -> {
               int var10;
               if (var0x != EntityTargetType.VILLAGERS) {
                  var10 = (int)-7677293440861771947L;
                  int var2x = -401544540;
                  int var1x = var10;
                  var10 = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = 1290767857;
                  var1x = var10;
                  var10 = var1x & ~var2x | ~var1x & var2x;
               } else {
                  int var7 = -1254142069;
                  int var4x = -947674765;
                  var10 = var4x & ~var7 | ~var4x & var7;
                  var7 = 1924984569;
                  var4x = var10;
                  var10 = var4x + var7 - 2 * (var4x & var7);
               }

               return pulse.Bool.from(var10);
            })) {
               var2.add(var4);
            }

            if (var4 instanceof AnimalEntity && Arrays.stream(var1).anyMatch(var0x -> {
               int var9;
               if (var0x != EntityTargetType.ANIMAL) {
                  int var2x = 1330944250;
                  int var1x = -473821735;
                  var9 = var1x + var2x - 2 * (var1x & var2x);
                  var2x = -1399417565;
                  var1x = var9;
                  var9 = (var1x | var2x) & (~var1x | ~var2x);
               } else {
                  int var7 = 1382395538;
                  int var4x = -1239645406;
                  var9 = (var4x | var7) & ~(var4x & var7);
                  var7 = -461820495;
                  var4x = var9;
                  var9 = (var4x | var7) - (var4x & var7);
               }

               return pulse.Bool.from(var9);
            })) {
               var2.add(var4);
            }

            if (var4 instanceof MobEntity && Arrays.stream(var1).anyMatch(var0x -> {
               int var10;
               if (var0x != EntityTargetType.MOBS) {
                  var10 = (int)7813914771092886848L;
                  int var2x = -1100027500;
                  int var1x = var10;
                  var10 = (var1x | var2x) & (~var1x | ~var2x);
                  var2x = 574995668;
                  var1x = var10;
                  var10 = var1x & ~var2x | ~var1x & var2x;
               } else {
                  var10 = (int)-7583597373638777411L;
                  int var7 = 49875966;
                  int var4x = var10;
                  var10 = (var4x | var7) - (var4x & var7);
                  var7 = 1247145538;
                  var4x = var10;
                  var10 = (var4x | var7) & (~var4x | ~var7);
               }

               return pulse.Bool.from(var10);
            })) {
               var2.add(var4);
            }

            if (var4 instanceof ItemEntity && Arrays.stream(var1).anyMatch(var0x -> {
               int var9;
               if (var0x != EntityTargetType.ITEMS) {
                  int var2x = -605533660;
                  int var1x = 1885592728;
                  var9 = (var1x | var2x) & ~(var1x & var2x);
                  var2x = -1416915268;
                  var1x = var9;
                  var9 = var1x & ~var2x | ~var1x & var2x;
               } else {
                  int var7 = 655886262;
                  int var4x = -1041334625;
                  var9 = (var4x | var7) - (var4x & var7);
                  var7 = -420054744;
                  var4x = var9;
                  var9 = (var4x | var7) & (~var4x | ~var7);
               }

               return pulse.Bool.from(var9);
            })) {
               var2.add(var4);
            }

            if (Arrays.stream(var1).anyMatch(var0x -> {
               int var55;
               if (var0x != EntityTargetType.ENTITY) {
                  var55 = (int)458928049896371728L;
                  int var4x = 400518984;
                  int var3 = var55;
                  var55 = var3 & ~var4x | ~var3 & var4x;
                  var4x = 819050059;
                  var3 = var55;
                  var55 = ((var3 | var4x) & (~var3 | ~var4x)) * ((var3 | var4x) & (~var3 | ~var4x));
                  var55 = (int)2161784319326112215L;
                  var4x = -1871631898;
                  var3 = var55;
                  var55 = (var3 | var4x) - (var3 & var4x);
                  var4x = 314123634;
                  var3 = var55;
                  int var2x = var3 & ~var4x | ~var3 & var4x;
                  a = var2x;
                  var4x = -494971977;
                  var3 = -1329677594;
                  var55 = (var3 | var4x) & ~(var3 & var4x);
                  var4x = -696615762;
                  var3 = var55;
                  var55 = var3 + var4x - 2 * (var3 & var4x);
                  int var10001 = (int)-2152114643069573961L;
                  var4x = -1507738894;
                  var3 = var10001;
                  var10001 = (var3 | var4x) & (~var3 | ~var4x);
                  var4x = -1648715409;
                  var3 = var10001;
                  var4x = (var3 | var4x) & ~(var3 & var4x);
                  var3 = var55;
                  var55 = 2 * (var3 | var4x) - (var3 ^ var4x);
                  var4x = -821752775;
                  var3 = -729507914;
                  var55 = var3 & ~var4x | ~var3 & var4x;
                  var4x = 250583364;
                  var3 = var55;
                  if (((var3 | var4x) & (~var3 | ~var4x)) < a) {
                     var55 = (int)8914534728733342159L;
                     var4x = -1352416890;
                     var3 = var55;
                     var55 = (var3 | var4x) & ~(var3 & var4x);
                     var4x = -843614353;
                     var3 = var55;
                     var55 = ((var3 | var4x) & (~var3 | ~var4x)) * ((var3 | var4x) & (~var3 | ~var4x));
                     var4x = -1152523503;
                     var3 = -847295251;
                     var55 = (var3 | var4x) & (~var3 | ~var4x);
                     var4x = 537592248;
                     var3 = var55;
                     var2x = (var3 | var4x) & (~var3 | ~var4x);
                  }

                  var4x = 723910001;
                  var3 = 89288373;
                  var55 = var3 & ~var4x | ~var3 & var4x;
                  var4x = 779588548;
                  var3 = var55;
                  var55 = (var3 | var4x) & ~(var3 & var4x);
               } else {
                  var55 = (int)9001413455540355828L;
                  int var40 = 947467282;
                  int var22 = var55;
                  var55 = var22 & ~var40 | ~var22 & var40;
                  var40 = -1650542873;
                  var22 = var55;
                  var55 = var22 & ~var40 | ~var22 & var40;
               }

               return pulse.Bool.from(var55);
            })) {
               var2.add(var4);
            }
         }
      }

      return var2;
   }

   public static boolean a(Entity var0) {
      if (c.world == null) {
         int var42 = 1395799296;
         int var24 = 1420568256;
         int var57 = var24 & ~var42 | ~var24 & var42;
         var42 = 127800256;
         var24 = var57;
         return pulse.Bool.from((var24 | var42) & (var24 ^ -1 | var42 ^ -1));
      }

      for (Entity var2 : c.world.getEntities()) {
         if (var2 == var0) {
            int var10000 = (int)-6891006179819261614L;
            int var6 = -1499317739;
            int var5 = var10000;
            var10000 = (var5 | var6) & ~(var5 & var6);
            var6 = 477875014;
            var5 = var10000;
            return pulse.Bool.from(var5 + var6 - 2 * (var5 & var6));
         }
      }

      String var45 = "cwq";
      int var27 = 943467787;
      int var9 = 819968722;
      int var46 = (var9 | var27) & ~(var9 & var27);
      var27 = 685854836;
      var9 = var46;
      int var4 = (var9 | var27) & ~(var9 & var27);
      a = var4;
      int var47 = (int)-8114361781187139813L;
      var27 = 1744683232;
      var9 = var47;
      int var48 = (var9 | var27) & (~var9 | ~var27);
      var27 = 1871275547;
      var9 = var48;
      int var49 = (var9 & ~var27 | ~var9 & var27) * (var9 & ~var27 | ~var9 & var27);
      var27 = 932255413;
      var9 = -1952538341;
      int var50 = (var9 | var27) & ~(var9 & var27);
      var27 = -922916206;
      var9 = var50;
      if (((var9 | var27) & ~(var9 & var27)) <= a) {
         var27 = 207534404;
         var9 = 279825226;
         int var51 = (var9 | var27) & (~var9 | ~var27);
         var27 = 1721379407;
         var9 = var51;
         int var52 = var9 + var27 - 2 * (var9 & var27);
         int var10001 = (int)126615066104731443L;
         var27 = 812673567;
         var9 = var10001;
         var10001 = (var9 | var27) & (~var9 | ~var27);
         var27 = 2002045654;
         var9 = var10001;
         var27 = (var9 | var27) & (~var9 | ~var27);
         var9 = var52;
         int var53 = 2 * (var9 | var27) - (var9 ^ var27);
         int var54 = (int)-164194398696481497L;
         var27 = 1665509259;
         var9 = var54;
         int var55 = (var9 | var27) & ~(var9 & var27);
         var27 = 2020757631;
         var9 = var55;
         var4 = (var9 | var27) - (var9 & var27);
         a = var4;
      }

      var27 = -1575866614;
      var9 = -150854130;
      int var56 = (var9 | var27) & ~(var9 & var27);
      var27 = 1427114244;
      var9 = var56;
      return pulse.Bool.from((var9 | var27) & (var9 & var27 ^ -1));
   }

   @Generated
   private EntityFinder() {
      int var10002 = (int)-5137208684597436565L;
      int var2 = 2014179635;
      int var1 = var10002;
      var10002 = (var1 | var2) & (~var1 | ~var2);
      var2 = -180001591;
      var1 = var10002;
      var10002 = var1 & ~var2 | ~var1 & var2;
      int var10003 = (int)-7280654203291400423L;
      var2 = 1190023787;
      var1 = var10003;
      var10003 = (var1 | var2) & ~(var1 & var2);
      var2 = -441105936;
      var1 = var10003;
      var10003 = (var1 + var2 - 2 * (var1 & var2)) * (var1 + var2 - 2 * (var1 & var2));
      var2 = 1519240000;
      var1 = 204016578;
      int var10004 = (var1 | var2) - (var1 & var2);
      var2 = 520679116;
      var1 = var10004;
      var10004 = (var1 | var2) & (~var1 | ~var2);
      var2 = -514817174;
      var1 = -546740615;
      int var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = 1260416980;
      var1 = var10005;
      var2 = (var1 | var2) & ~(var1 & var2);
      var1 = var10004;
      var10004 = (var1 & ~var2) + (var2 & ~var1) + 2 * (var1 & var2);
      var2 = -540325855;
      var1 = 1993167129;
      var10004 = var1 & ~var2 | ~var1 & var2;
      var2 = 1637661357;
      var1 = var10004;
      var10004 = (var1 | var2) - (var1 & var2);
      var10005 = (int)2298566860117537860L;
      var2 = 75090054;
      var1 = var10005;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1197541910;
      var1 = var10005;
      var10005 = (var1 | var2) - (var1 & var2);
      var2 = 944467737;
      var1 = 1862384108;
      int var10006 = (var1 | var2) & (~var1 | ~var2);
      var2 = 551991327;
      var1 = var10006;
      var2 = (var1 | var2) & (~var1 | ~var2);
      var1 = var10005;
      var10005 = (var1 & ~var2) + (var2 & ~var1) + 2 * (var1 & var2);
      var2 = -353385108;
      var1 = 179377435;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var2 = -714913385;
      var1 = var10005;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var2 = 763274060;
      var1 = 1904186109;
      var10006 = (var1 | var2) - (var1 & var2);
      var2 = -375468815;
      var1 = var10006;
      var10006 = ((var1 | var2) - (var1 & var2)) * ((var1 | var2) - (var1 & var2));
      var10006 = (int)-30416439097846246L;
      var2 = 790484587;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var2 = -644782144;
      var1 = var10006;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      String var10007 = "cwr";
      var2 = 1200749124;
      var1 = -411027418;
      int var68 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1605029445;
      var1 = var68;
      throw new UnsupportedOperationException(
         b(
            "ꆳ\uf1c3ꆎ\uf1d8ꇇ\uf1c2ꆔ\uf18bꆆ\uf18bꆒ\uf1dfꆎ\uf1c7ꆎ\uf1dfꆞ\uf18bꆄ\uf1c7ꆆ\uf1d8ꆔ\uf18bꆆ\uf1c5ꆃ\uf18bꆄ\uf1caꆉ\uf1c5ꆈ\uf1dfꇇ\uf1c9ꆂ\uf18bꆎ\uf1c5ꆔ\uf1dfꆆ\uf1c5ꆓ\uf1c2ꆆ\uf1dfꆂ\uf1cf",
            "`ꟳꓺꁡꤐ絺蹙⑿譸㑢f\ua7ef꒹ꁢꥊ絳蹄⑮謾㑣kꞩ꒐ꁿꤑ絿蹞④謑㑾|\ua7e2꒰ꁣ",
            var10004,
            var10005,
            var10006,
            (var1 | var2) & ~(var1 & var2)
         )
      );
   }

   public static String b(String var0, String var1, int var2, int var3, int var4, int var5) {
      char[] var6 = var1.toCharArray();
      char[] var7 = new char[var6.length];
      int var20 = -1703097427;
      int var19 = -609844225;
      int var10000 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1104824408;
      var19 = var10000;
      char[] var273 = new char[var19 & ~var20 | ~var19 & var20];
      var20 = 242639362;
      var19 = -189585395;
      int var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = -87733745;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      int var10003 = (int)-5154181204330965058L;
      var20 = -1336003930;
      var19 = var10003;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = 528870698;
      var19 = var10003;
      var273[var10002] = (char)((var19 | var20) - (var19 & var20));
      var20 = -1618940114;
      var19 = -1000988542;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1540804525;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var10003 = (int)-2843980003887908887L;
      var20 = 1716231579;
      var19 = var10003;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = 1102694903;
      var19 = var10003;
      var273[var10002] = (char)((var19 | var20) - (var19 & var20));
      var10002 = (int)2966190471081694051L;
      var20 = -627073407;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1315343840;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = 1999443783;
      var19 = -150753178;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = -2144435033;
      var19 = var10003;
      var273[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      var20 = -1599349489;
      var19 = 995491181;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = -1677844383;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1180884727;
      var19 = -356205423;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1994984670;
      var19 = var10003;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var10003 = (int)-1051719258813599158L;
      var20 = -1412654821;
      var19 = var10003;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = -1388940478;
      var19 = var10003;
      var273[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      var10002 = (int)1004672891321529540L;
      var20 = -477224225;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = 287381023;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = 931434564;
      var19 = 54406237;
      int var10004 = var19 & ~var20 | ~var19 & var20;
      var20 = 884653075;
      var19 = var10004;
      var10004 = (var19 | var20) & ~(var19 & var20);
      var20 = -1714231165;
      var19 = 876192585;
      var10004 = (var19 | var20) & ~(var19 & var20);
      var20 = -1377088575;
      var19 = var10004;
      var10004 = var19 & ~var20 | ~var19 & var20;
      var20 = 1480205245;
      var19 = 1919659057;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = 709959337;
      var19 = var10003;
      var273[var10002] = (char)((var19 | var20) - (var19 & var20));
      var10002 = (int)7709384115723733178L;
      var20 = 655176281;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = -238175514;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var10003 = (int)-7915137578207469721L;
      var20 = 10910869;
      var19 = var10003;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = 239019632;
      var19 = var10003;
      var273[var10002] = (char)((var19 | var20) - (var19 & var20));
      var20 = -1846374991;
      var19 = 1524666206;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = -888012055;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var10003 = (int)-8550480152417024754L;
      var20 = 1468242962;
      var19 = var10003;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = -945532913;
      var19 = var10003;
      var273[var10002] = (char)((var19 | var20) & ~(var19 & var20));
      var10002 = (int)-8234691459890909486L;
      var20 = 1415580371;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = 1310876678;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = 1103663311;
      var19 = 1935678402;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = 849919791;
      var19 = var10003;
      var273[var10002] = (char)((var19 | var20) & ~(var19 & var20));
      var20 = 1708014296;
      var19 = 1888363264;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = 356522448;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var10003 = (int)2001780808338601071L;
      var20 = -1366610274;
      var19 = var10003;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = -1581493598;
      var19 = var10003;
      var273[var10002] = (char)((var19 | var20) - (var19 & var20));
      var10002 = (int)-4860387581152159237L;
      var20 = 1000393714;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = 689197568;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var10003 = (int)1248222265125409795L;
      var20 = -796708215;
      var19 = var10003;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = -1190420050;
      var19 = var10003;
      var273[var10002] = (char)((var19 | var20) - (var19 & var20));
      char[] var8 = var273;
      var20 = 1057287627;
      var19 = -1202237134;
      var10000 = (var19 | var20) & (~var19 | ~var20);
      var20 = -2024555277;
      var19 = var10000;
      char[] var275 = new char[var19 + var20 - 2 * (var19 & var20)];
      var10002 = (int)7186153076526590552L;
      var20 = -964559315;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = -176991115;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = -967543794;
      var19 = 1660776433;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = -1532406817;
      var19 = var10003;
      var275[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      var10002 = (int)-8648017632287428065L;
      var20 = 1640708494;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = 972704656;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var10003 = (int)-7479040896222290805L;
      var20 = -1403489536;
      var19 = var10003;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = -1617697686;
      var19 = var10003;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = -1087642540;
      var19 = 54128379;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = -1139634516;
      var19 = var10003;
      var275[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      var20 = -521910084;
      var19 = -70955968;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = 455148798;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = 108790318;
      var19 = -162888911;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = 248723368;
      var19 = var10003;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = -1598573225;
      var19 = 165801896;
      var10004 = var19 + var20 - 2 * (var19 & var20);
      var20 = -168773748;
      var19 = var10004;
      var20 = (var19 | var20) & ~(var19 & var20);
      var19 = var10003;
      var10003 = 2 * (var19 | var20) - (var19 ^ var20);
      var20 = -1256445151;
      var19 = 1232034359;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = -59509179;
      var19 = var10003;
      var275[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      var10002 = (int)215421882075008206L;
      var20 = -768049857;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = -1479200270;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var10003 = (int)-6100344304363650212L;
      var20 = 1869938637;
      var19 = var10003;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = 1973879955;
      var19 = var10003;
      var275[var10002] = (char)((var19 | var20) & ~(var19 & var20));
      var10002 = (int)2299327199437118395L;
      var20 = 1932937083;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = -1545495356;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = -1036641503;
      var19 = -267611208;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = 842707161;
      var19 = var10003;
      var275[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      var10002 = (int)2899273713852458525L;
      var20 = 1610658717;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = -1932716667;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = -822285989;
      var19 = -1239050243;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = 2027505202;
      var19 = var10003;
      var275[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      var20 = 1397798295;
      var19 = 962122981;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = 1778934132;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      String var374 = "cws";
      var10003 = (int)-2198136161750966038L;
      var20 = 612636284;
      var19 = var10003;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = -1168100945;
      var19 = var10003;
      var275[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      var20 = 1255435480;
      var19 = -1176597853;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = -217389444;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = -803457346;
      var19 = 1559603065;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = -1930853889;
      var19 = var10003;
      var275[var10002] = (char)((var19 | var20) - (var19 & var20));
      var10002 = (int)-7379001640747296522L;
      var20 = 774221284;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1478374682;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = -88067278;
      var19 = 289674422;
      var10004 = (var19 | var20) - (var19 & var20);
      var20 = -343660660;
      var19 = var10004;
      var10004 = (var19 | var20) - (var19 & var20);
      var10004 = (int)4660201116328322148L;
      var20 = 1819038048;
      var19 = var10004;
      var10004 = var19 + var20 - 2 * (var19 & var20);
      var20 = 348960004;
      var19 = var10004;
      var10004 = (var19 | var20) - (var19 & var20);
      var10004 = (int)5698992887397752593L;
      var20 = -160049587;
      var19 = var10004;
      var10004 = (var19 | var20) & ~(var19 & var20);
      var20 = -794310315;
      var19 = var10004;
      var10004 = var19 & ~var20 | ~var19 & var20;
      var10003 = (int)-6195127485560712194L;
      var20 = -1423774838;
      var19 = var10003;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = -1345881232;
      var19 = var10003;
      var275[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      var20 = 1972892689;
      var19 = -303615456;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = -1737439688;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = 596944365;
      var19 = 444656158;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = 957643968;
      var19 = var10003;
      var275[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      char[] var9 = var275;
      var10000 = (int)-6989631415296238591L;
      var20 = -875884195;
      var19 = var10000;
      var10000 = var19 & ~var20 | ~var19 & var20;
      var20 = 1737510236;
      var19 = var10000;

      for (int var10 = (var19 | var20) & ~(var19 & var20); var10 < var6.length; var10++) {
         char var339 = var6[var10];
         char var252 = var8[var10 % var8.length];
         char var127 = var339;
         var7[var10] = (char)((var127 | var252) & ~(var127 & var252));
      }

      char[] var21 = new char[var7.length];
      var10000 = (int)-7635501162866299209L;
      var20 = 806520439;
      var19 = var10000;
      var10000 = var19 + var20 - 2 * (var19 & var20);
      var20 = -1856558912;
      var19 = var10000;
      int var11 = (var19 | var20) & ~(var19 & var20);
      if (a != a) {
         var10000 = (int)6635990857483759392L;
         var20 = -422715124;
         var19 = var10000;
         var10000 = var19 & ~var20 | ~var19 & var20;
         var20 = 493518767;
         var19 = var10000;
         var10000 = (var19 | var20) & (~var19 | ~var20);
         var20 = 1443766323;
         var19 = 1393004241;
         int var10001 = (var19 | var20) - (var19 & var20);
         var20 = -616263421;
         var19 = var10001;
         var20 = (var19 | var20) - (var19 & var20);
         var19 = var10000;
         var10000 = (var19 ^ var20) + 2 * (var19 & var20);
         var20 = -1167902534;
         var19 = 1527454245;
         var10000 = var19 + var20 - 2 * (var19 & var20);
         var20 = -1366100909;
         var19 = var10000;
         int var18 = (var19 | var20) & (~var19 | ~var20);
      }

      while (var11 < var6.length) {
         char var340 = var7[var11];
         char var262 = var9[var11 % var9.length];
         char var137 = var340;
         var21[var11] = (char)(var137 & ~var262 | ~var137 & var262);
         var11++;
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
      var10000 = (int)2305566446137189790L;
      var20 = -798612955;
      var19 = var10000;
      var10000 = (var19 | var20) - (var19 & var20);
      var20 = 1953957819;
      var19 = var10000;

      for (int var16 = (var19 | var20) & ~(var19 & var20); var16 < var15.length; var16++) {
         var20 = 90044275;
         var19 = -1502369079;
         int var288 = (var19 | var20) & ~(var19 & var20);
         var20 = -1557242440;
         var19 = var288;
         switch (var16 % ((var19 | var20) & ~(var19 & var20))) {
            case 0:
               var20 = var12;
               var19 = var13;
               var10002 = var19 + var20 - 2 * (var19 & var20);
               char var272 = var14[var16];
               var19 = var10002;
               var15[var16] = (char)(var19 & ~var272 | ~var19 & var272);
               break;
            case 1:
               var20 = var13;
               var19 = var5;
               var10002 = var19 + var20 - 2 * (var19 & var20);
               char var270 = var14[var16];
               var19 = var10002;
               var15[var16] = (char)((var19 | var270) & (~var19 | ~var270));
         }
      }

      return new String(var15);
   }
}
