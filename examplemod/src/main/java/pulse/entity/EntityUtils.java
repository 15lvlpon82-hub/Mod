package pulse;

import lombok.Generated;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.Vec3d;

public final class EntityUtils {
   public static int a;
   public static boolean b;

   public static Vec3d a(Entity var0, float var1) {
      Vec3d var2 = a(var0);
      return var2.add(var0.getPos().subtract(var2).multiply(var1));
   }

   public static Vec3d a(Entity var0) {
      return new Vec3d(var0.prevX, var0.prevY, var0.prevZ);
   }

   public static Vec3d b(Entity var0, float var1) {
      return a(var0, var1);
   }

   public static boolean a(LivingEntity var0) {
      if (!(var0 instanceof PlayerEntity var1)) {
         int var23 = (int)-783416467197090405L;
         int var18 = -1488972954;
         int var11 = var23;
         var23 = var11 + var18 - 2 * (var11 & var18);
         var18 = 382121725;
         var11 = var23;
         return pulse.Bool.from((var11 | var18) & (var11 ^ -1 | var18 ^ -1));
      } else {
         if (!var1.isInvisible()) {
            int var16 = 356936284;
            int var9 = 240999479;
            int var22 = (var9 | var16) - (var9 & var16);
            var16 = 454768235;
            var9 = var22;
            return pulse.Bool.from((var9 | var16) & (var9 & var16 ^ -1));
         }

         for (ItemStack var3 : var1.getArmorItems()) {
            if (!var3.isEmpty()) {
               int var10000 = (int)-4316800742020139539L;
               int var5 = -813787456;
               int var4 = var10000;
               var10000 = (var4 | var5) - (var4 & var5);
               var5 = 2059510573;
               var4 = var10000;
               return pulse.Bool.from(var4 & (var5 ^ -1) | (var4 ^ -1) & var5);
            }
         }

         int var14 = -1165778264;
         int var7 = -985660738;
         int var21 = (var7 | var14) - (var7 & var14);
         var14 = 2143526935;
         var7 = var21;
         return pulse.Bool.from((var7 | var14) & (var7 & var14 ^ -1));
      }
   }

   @Generated
   private EntityUtils() {
      String var10002 = "brh";
      String var10003 = "bri";
      int var2 = 102405439;
      int var1 = -698464608;
      int var10004 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1206956065;
      var1 = var10004;
      var10004 = ((var1 | var2) & ~(var1 & var2)) * ((var1 | var2) & ~(var1 & var2));
      var10004 = (int)5007341571072062432L;
      var2 = 487426009;
      var1 = var10004;
      var10004 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1626404215;
      var1 = var10004;
      var10004 = var1 + var2 - 2 * (var1 & var2);
      String var10005 = "brj";
      int var33 = (int)-2590298988381492170L;
      var2 = 1675201740;
      var1 = var33;
      int var34 = (var1 | var2) & ~(var1 & var2);
      var2 = -915822446;
      var1 = var34;
      int var35 = (var1 | var2) & ~(var1 & var2);
      int var10006 = (int)-1693401574389302000L;
      var2 = -909642518;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var2 = -907588728;
      var1 = var10006;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var10006 = (int)7079939326674044139L;
      var2 = 921813316;
      var1 = var10006;
      var10006 = (var1 | var2) - (var1 & var2);
      var2 = 1209985479;
      var1 = var10006;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      int var10007 = (int)2786010229578873710L;
      var2 = 798613290;
      var1 = var10007;
      var10007 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1631373325;
      var1 = var10007;
      var10007 = (var1 | var2) & ~(var1 & var2);
      var2 = -412315019;
      var1 = -728725186;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      var2 = 869212131;
      var1 = var10007;
      throw new UnsupportedOperationException(
         a("荨ڲ荕ک茜ڳ荏ۺ荝ۺ草ڮ荕ڶ荕ڮ荅ۺ荟ڶ荝ک荏ۺ荝ڴ荘ۺ荟ڻ荒ڴ荓ڮ茜ڸ荙ۺ荕ڴ荏ڮ荝ڴ荈ڳ荝ڮ荙ھ", "`ꟳꓺꁡꤐ絺蹙⑿譸㑢f\ua7ef꒹ꁢꥊ絓蹄⑮謾㑣kꟓ꒡ꁸ꤉絥", var10004, var35, var10006, (var1 | var2) & (~var1 | ~var2))
      );
   }

   public static String a(String var0, String var1, int var2, int var3, int var4, int var5) {
      char[] var6 = var1.toCharArray();
      char[] var7 = new char[var6.length];
      int var10000 = (int)1622413196380479429L;
      int var20 = -1852842253;
      int var19 = var10000;
      var10000 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1487257916;
      var19 = var10000;
      char[] var272 = new char[(var19 | var20) - (var19 & var20)];
      var20 = 1911573729;
      var19 = 206336598;
      int var10002 = (var19 | var20) - (var19 & var20);
      var20 = 2109488823;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      int var10003 = (int)4094925290737031911L;
      var20 = 1796028080;
      var19 = var10003;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = 1126802533;
      var19 = var10003;
      var272[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      var20 = -771117796;
      var19 = 2054182957;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = -1468402384;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var10003 = (int)4144581553634995639L;
      var20 = 1424555111;
      var19 = var10003;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = -1679543723;
      var19 = var10003;
      var272[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      var20 = -887369584;
      var19 = -732422034;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = 524546300;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = 1147163442;
      var19 = 1942592989;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = 933883241;
      var19 = var10003;
      var272[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      var20 = 887125258;
      var19 = 1181600248;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = 1921891569;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var10003 = (int)-2003442144657059117L;
      var20 = 1551125171;
      var19 = var10003;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = -1646747296;
      var19 = var10003;
      var10003 = (var19 & ~var20 | ~var19 & var20) * (var19 & ~var20 | ~var19 & var20);
      var10003 = (int)-7023462680112602741L;
      var20 = 898165157;
      var19 = var10003;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = -1222340547;
      var19 = var10003;
      var272[var10002] = (char)((var19 | var20) & ~(var19 & var20));
      var10002 = (int)-2194047116755315564L;
      var20 = -310451158;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = 1948954810;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      String var347 = "brk";
      var10003 = (int)2282888056849682898L;
      var20 = 1647653528;
      var19 = var10003;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = -927698321;
      var19 = var10003;
      var272[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      var20 = -487795511;
      var19 = -1690802925;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = 2043982303;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = 1714902369;
      var19 = 98594970;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = 1675059321;
      var19 = var10003;
      var272[var10002] = (char)((var19 | var20) & ~(var19 & var20));
      var20 = 827069735;
      var19 = -125951029;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = -919456022;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var10003 = (int)6296057930905059006L;
      var20 = 447535643;
      var19 = var10003;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = -1840468554;
      var19 = var10003;
      var272[var10002] = (char)((var19 | var20) - (var19 & var20));
      var20 = -1749733261;
      var19 = -1861513355;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = 113164033;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = 1626616735;
      var19 = -570022790;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = -1091427385;
      var19 = var10003;
      var272[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      var20 = -1946287179;
      var19 = -763072581;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = 1501195270;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = 750892942;
      var19 = -1560232869;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = -1883176058;
      var19 = var10003;
      var272[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      var20 = -436174027;
      var19 = -1080561655;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = 1503097653;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = -420778692;
      var19 = 697705611;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = -813871469;
      var19 = var10003;
      var272[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      char[] var8 = var272;
      var10000 = (int)1151160647461584098L;
      var20 = -2054777827;
      var19 = var10000;
      var10000 = (var19 | var20) & ~(var19 & var20);
      var20 = -86136587;
      var19 = var10000;
      char[] var275 = new char[var19 + var20 - 2 * (var19 & var20)];
      var10002 = (int)-5960352647066177878L;
      var20 = -1446371444;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = 1850061094;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = 671715964;
      var19 = -591873309;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = -189701953;
      var19 = var10003;
      var275[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      var20 = -1966446928;
      var19 = -1544198898;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = 691995583;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var10003 = (int)-8226840155543716518L;
      var20 = -885859913;
      var19 = var10003;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = 832188092;
      var19 = var10003;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = -1365222329;
      var19 = -746523699;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = 2099260297;
      var19 = var10003;
      var275[var10002] = (char)((var19 | var20) - (var19 & var20));
      var20 = 927382669;
      var19 = 970242910;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = 244451281;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = -636663534;
      var19 = 1319925203;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = 962086791;
      var19 = var10003;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = 358871167;
      var19 = 1987580857;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = 1662739605;
      var19 = var10003;
      var275[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      var20 = 1636346286;
      var19 = -2019482106;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = -433483861;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var10003 = (int)-2107933647072282933L;
      var20 = 1682132018;
      var19 = var10003;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = 1214956283;
      var19 = var10003;
      var275[var10002] = (char)((var19 | var20) - (var19 & var20));
      var20 = 970283100;
      var19 = -1060573888;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = -115493608;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var10003 = (int)6177401367384448408L;
      var20 = 646448652;
      var19 = var10003;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = 1602118612;
      var19 = var10003;
      var275[var10002] = (char)((var19 | var20) & ~(var19 & var20));
      var20 = 819531;
      var19 = -1272233001;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = -1272462695;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var10003 = (int)-7441932571520360669L;
      var20 = -1231703961;
      var19 = var10003;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = -292874288;
      var19 = var10003;
      var275[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      var10002 = (int)1573172442930991775L;
      var20 = -1180571694;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = -822856373;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = -1076585684;
      var19 = -1471211849;
      int var10004 = var19 + var20 - 2 * (var19 & var20);
      var20 = 396070280;
      var19 = var10004;
      var10004 = var19 & ~var20 | ~var19 & var20;
      var10004 = (int)8029524090152268323L;
      var20 = -224349595;
      var19 = var10004;
      var10004 = var19 + var20 - 2 * (var19 & var20);
      var20 = -698941367;
      var19 = var10004;
      var10004 = var19 & ~var20 | ~var19 & var20;
      var10004 = (int)-3586288026030525545L;
      var20 = -1840764211;
      var19 = var10004;
      var10004 = var19 & ~var20 | ~var19 & var20;
      var20 = 8296791;
      var19 = var10004;
      var10004 = var19 + var20 - 2 * (var19 & var20);
      var20 = -1022174878;
      var19 = -2087064761;
      var10004 = var19 & ~var20 | ~var19 & var20;
      var20 = 1082864162;
      var19 = var10004;
      var10004 = (var19 | var20) & ~(var19 & var20);
      var20 = -1852911430;
      var19 = 389517481;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = -2034645206;
      var19 = var10003;
      var275[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      var10002 = (int)2915079222751640435L;
      var20 = -1924473345;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = 829515403;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var10003 = (int)-4059382269501756078L;
      var20 = -590602456;
      var19 = var10003;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = -2045238718;
      var19 = var10003;
      var275[var10002] = (char)((var19 | var20) & ~(var19 & var20));
      var20 = 1853006446;
      var19 = -1304685967;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = -598822889;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = -1574414922;
      var19 = -1358353659;
      var10004 = var19 + var20 - 2 * (var19 & var20);
      var20 = 220298915;
      var19 = var10004;
      var10004 = (var19 | var20) & (~var19 | ~var20);
      var10003 = (int)1872264789747284423L;
      var20 = 305786815;
      var19 = var10003;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = 73586044;
      var19 = var10003;
      var275[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      var20 = -53701607;
      var19 = 886787832;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = -937960728;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = -963626988;
      var19 = 1933492191;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = -1246841608;
      var19 = var10003;
      var275[var10002] = (char)((var19 | var20) & ~(var19 & var20));
      char[] var9 = var275;
      var20 = 1671966960;
      var19 = -1496101445;
      var10000 = (var19 | var20) & ~(var19 & var20);
      var20 = -981762741;
      var19 = var10000;

      for (int var10 = (var19 | var20) & (~var19 | ~var20); var10 < var6.length; var10++) {
         char var334 = var6[var10];
         char var248 = var8[var10 % var8.length];
         char var124 = var334;
         var7[var10] = (char)((var124 | var248) - (var124 & var248));
      }

      char[] var21 = new char[var7.length];
      var20 = -1078226283;
      var19 = -143118676;
      var10000 = (var19 | var20) - (var19 & var20);
      var20 = 1220787257;
      var19 = var10000;

      for (int var11 = var19 + var20 - 2 * (var19 & var20); var11 < var6.length; var11++) {
         char var335 = var7[var11];
         char var251 = var9[var11 % var9.length];
         char var127 = var335;
         var21[var11] = (char)((var127 | var251) - (var127 & var251));
      }

      String var22 = new String(var21);
      int var12 = var22.hashCode();
      var20 = var5;
      var19 = var3;
      var10000 = var19 + ~var20 + 1;
      var20 = var2;
      var19 = var10000;
      int var13 = var19 + ~var20 + 1;
      char[] var14 = var0.toCharArray();
      char[] var15 = new char[var14.length];
      var20 = 1139048848;
      var19 = -1585893884;
      var10000 = var19 & ~var20 | ~var19 & var20;
      var20 = -492982380;
      var19 = var10000;
      int var16 = (var19 | var20) & ~(var19 & var20);
      if (b) {
         throw new IllegalAccessError();
      }

      for (; var16 < var15.length; var16++) {
         var20 = 1348663996;
         var19 = 1591363003;
         var10000 = (var19 | var20) - (var19 & var20);
         var20 = 1535463226;
         var19 = var10000;
         var10000 = (var19 | var20) & ~(var19 & var20);
         int var10001 = (int)5593971463699280080L;
         var20 = -627107206;
         var19 = var10001;
         var10001 = (var19 | var20) & (~var19 | ~var20);
         var20 = 1951346248;
         var19 = var10001;
         var20 = (var19 | var20) - (var19 & var20);
         var19 = var10000;
         var10000 = (var19 | var20) + (var19 & var20);
         var10000 = (int)3163291311673310623L;
         var20 = 1066378730;
         var19 = var10000;
         var10000 = var19 + var20 - 2 * (var19 & var20);
         var20 = 983671306;
         var19 = var10000;
         int var18 = var19 & ~var20 | ~var19 & var20;
         a = var18;
         String var285 = "brl";
         var10000 = (int)-3740584884331073157L;
         var20 = -276144967;
         var19 = var10000;
         var10000 = (var19 | var20) & ~(var19 & var20);
         var20 = 30465301;
         var19 = var10000;
         if (((var19 | var20) & (~var19 | ~var20)) < a) {
            throw new IllegalAccessError();
         }

         var10001 = (int)-1325216793753614000L;
         var20 = 136722191;
         var19 = var10001;
         var10001 = (var19 | var20) & ~(var19 & var20);
         var20 = -439796131;
         var19 = var10001;
         switch (var16 % ((var19 | var20) & (~var19 | ~var20))) {
            case 0:
               var20 = var12;
               var19 = var13;
               var10002 = var19 & ~var20 | ~var19 & var20;
               char var270 = var14[var16];
               var19 = var10002;
               var15[var16] = (char)((var19 | var270) & ~(var19 & var270));
               break;
            case 1:
               var20 = var13;
               var19 = var5;
               var10002 = var19 & ~var20 | ~var19 & var20;
               char var268 = var14[var16];
               var19 = var10002;
               var15[var16] = (char)((var19 | var268) & ~(var19 & var268));
         }
      }

      return new String(var15);
   }
}
