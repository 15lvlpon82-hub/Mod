package pulse;

public class EventInfo {
   private final String c;
   private final int d;
   private final EventInfo.EventState e;
   private final EventInfo.EventKind f;
   private final EventInfo.Rarity g;
   private final String h;
   private int i;
   public static int a;
   public static boolean b;

   public EventInfo(String var1, int var2, EventInfo.EventState var3, EventInfo.EventKind var4, EventInfo.Rarity var5, String var6, int var7) {
      this.c = var1;
      this.d = var2;
      this.e = var3;
      this.f = var4;
      this.g = var5;
      this.h = var6;
      this.i = var7;
   }

   public static EventInfo a(String var0, int var1, int var2) {
      return new EventInfo(var0, var1, EventInfo.EventState.UPCOMING, null, null, null, var2);
   }

   public static EventInfo a(String var0, int var1, EventInfo.EventKind var2, EventInfo.Rarity var3, String var4, int var5) {
      return new EventInfo(var0, var1, EventInfo.EventState.CURRENT, var2, var3, var4, var5);
   }

   public static EventInfo a(String var0, int var1, EventInfo.Rarity var2, String var3, int var4) {
      return new EventInfo(var0, var1, EventInfo.EventState.MINE, EventInfo.EventKind.MINE, var2, var3, var4);
   }

   public String a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public EventInfo.EventState c() {
      return this.e;
   }

   public EventInfo.EventKind d() {
      return this.f;
   }

   public EventInfo.Rarity e() {
      return this.g;
   }

   public int f() {
      return this.i;
   }

   public void a(int var1) {
      this.i = var1;
   }

   public String g() {
      int var4 = 1039021185;
      int var3 = 1375311282;
      int var10001 = (var3 | var4) & ~(var3 & var4);
      var4 = 1813487887;
      var3 = var10001;
      int var1 = this.i / ((var3 | var4) & ~(var3 & var4));
      var4 = -967420804;
      var3 = 1461868786;
      var10001 = var3 + var4 - 2 * (var3 & var4);
      var4 = -1854665550;
      var3 = var10001;
      int var2 = this.i % ((var3 | var4) & (~var3 | ~var4));
      String var10000 = "cls";
      var4 = 2080192568;
      var3 = 1025805141;
      var10001 = (var3 | var4) & (~var3 | ~var4);
      var4 = 2012455093;
      var3 = var10001;
      var10001 = ((var3 | var4) & (~var3 | ~var4)) * ((var3 | var4) & (~var3 | ~var4));
      var4 = -1193152010;
      var3 = 1406848439;
      int var10003 = var3 & ~var4 | ~var3 & var4;
      var4 = -348439484;
      var3 = var10003;
      var10003 = var3 & ~var4 | ~var3 & var4;
      var10003 = (int)-5519933895175051388L;
      var4 = 7589772;
      var3 = var10003;
      var10003 = (var3 | var4) & (~var3 | ~var4);
      var4 = 1107306503;
      var3 = var10003;
      var10003 = var3 & ~var4 | ~var3 & var4;
      var4 = -661314221;
      var3 = -939259360;
      var10003 = (var3 | var4) & (~var3 | ~var4);
      var4 = 277950328;
      var3 = var10003;
      var10003 = (var3 | var4) & ~(var3 & var4);
      var4 = 1155657688;
      var3 = 1399519472;
      int var10002 = (var3 | var4) & ~(var3 & var4);
      var4 = 349585040;
      var3 = var10002;
      var10002 = (var3 | var4) & (~var3 | ~var4);
      String var79 = "clt";
      var4 = -17219554;
      var3 = -1971902609;
      var10003 = (var3 | var4) & (~var3 | ~var4);
      var4 = 787333638;
      var3 = var10003;
      var10003 = var3 + var4 - 2 * (var3 & var4);
      String var10004 = "clu";
      var4 = 337541442;
      var3 = -617985280;
      int var85 = var3 & ~var4 | ~var3 & var4;
      var4 = -737706824;
      var3 = var85;
      int var86 = (var3 | var4) & ~(var3 & var4);
      int var10005 = (int)4350476707741995373L;
      var4 = 516411840;
      var3 = var10005;
      var10005 = var3 & ~var4 | ~var3 & var4;
      var4 = -1858710816;
      var3 = var10005;
      var10005 = var3 & ~var4 | ~var3 & var4;
      int var10006 = (int)-7905904002644766973L;
      var4 = 1862178698;
      var3 = var10006;
      var10006 = (var3 | var4) - (var3 & var4);
      var4 = -729763422;
      var3 = var10006;
      var4 = (var3 | var4) - (var3 & var4);
      var3 = var10005;
      var10005 = (var3 | var4) + (var3 & var4);
      var10005 = (int)-7734322174449005990L;
      var4 = -1779048064;
      var3 = var10005;
      var10005 = (var3 | var4) - (var3 & var4);
      var4 = 1887219222;
      var3 = var10005;
      var10000 = a("屮灛山瀚屻瀍尯", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁴꤓ絳蹄⑮謤㐸W\ua7f0꒰ꁿꤑ絓蹄⑮謥㑮", var10002, var10003, var86, (var3 | var4) & (~var3 | ~var4));
      var10001 = (int)-8603643962238580283L;
      var4 = 2081436319;
      var3 = var10001;
      var10001 = var3 + var4 - 2 * (var3 & var4);
      var4 = -54133928;
      var3 = var10001;
      Object[] var71 = new Object[(var3 | var4) - (var3 & var4)];
      var4 = 1466640882;
      var3 = -382886150;
      var10003 = (var3 | var4) & ~(var3 & var4);
      var4 = -1102661880;
      var3 = var10003;
      var71[(var3 | var4) & (~var3 | ~var4)] = var1;
      var10003 = (int)2956266749256844416L;
      var4 = -729144798;
      var3 = var10003;
      var10003 = var3 & ~var4 | ~var3 & var4;
      var4 = -565516637;
      var3 = var10003;
      var71[(var3 | var4) & (~var3 | ~var4)] = var2;
      return String.format(var10000, var71);
   }

   public String h() {
      int var2 = this.d;
      String var1 = this.c;
      StringBuilder var10000 = new StringBuilder().append(var1);
      int var4 = -1054501374;
      int var3 = 650856336;
      int var10001 = (var3 | var4) & ~(var3 & var4);
      var4 = 2093956896;
      var3 = var10001;
      var10001 = (var3 | var4) & ~(var3 & var4);
      int var10002 = (int)-5201194449726394510L;
      var4 = -595489928;
      var3 = var10002;
      var10002 = var3 + var4 - 2 * (var3 & var4);
      var4 = 5939177;
      var3 = var10002;
      var4 = (var3 | var4) & (~var3 | ~var4);
      var3 = var10001;
      var10001 = (var3 ^ var4) + 2 * (var3 & var4);
      var10002 = (int)-1501088776787797709L;
      var4 = 422369887;
      var3 = var10002;
      var10002 = var3 + var4 - 2 * (var3 & var4);
      var4 = 2093578160;
      var3 = var10002;
      var10002 = (var3 | var4) & ~(var3 & var4);
      var4 = -1639415364;
      var3 = -1926678377;
      int var10003 = (var3 | var4) & (~var3 | ~var4);
      var4 = -1011332093;
      var3 = var10003;
      var4 = var3 + var4 - 2 * (var3 & var4);
      var3 = var10002;
      var10002 = (var3 | var4) + (var3 & var4);
      String var64 = "clv";
      var10003 = (int)-7847347450176267208L;
      var4 = -1042830040;
      var3 = var10003;
      var10003 = (var3 | var4) & ~(var3 & var4);
      var4 = -240674648;
      var3 = var10003;
      var10003 = (var3 | var4) & (~var3 | ~var4);
      var4 = 728561233;
      var3 = 852654485;
      int var10004 = (var3 | var4) & ~(var3 & var4);
      var4 = 1601700258;
      var3 = var10004;
      var10004 = var3 + var4 - 2 * (var3 & var4);
      int var10005 = (int)-3083747457323681302L;
      var4 = -370947222;
      var3 = var10005;
      var10005 = (var3 | var4) & ~(var3 & var4);
      var4 = -1043773477;
      var3 = var10005;
      var4 = var3 + var4 - 2 * (var3 & var4);
      var3 = var10004;
      var10004 = var3 - ~var4 - 1;
      var4 = 155298422;
      var3 = 1065114679;
      var10004 = var3 & ~var4 | ~var3 & var4;
      var4 = -1292838495;
      var3 = var10004;
      var10004 = (var3 | var4) & ~(var3 & var4);
      String var73 = "clw";
      var4 = -1327948729;
      var3 = 307771929;
      var10005 = (var3 | var4) & ~(var3 & var4);
      var4 = -1427153870;
      var3 = var10005;
      var10005 = var3 + var4 - 2 * (var3 & var4);
      var4 = -228724367;
      var3 = 991904681;
      int var10007 = (var3 | var4) & ~(var3 & var4);
      var4 = -918375724;
      var3 = var10007;
      var10007 = (var3 | var4) & ~(var3 & var4);
      var10007 = (int)384344101949460824L;
      var4 = 673113965;
      var3 = var10007;
      var10007 = (var3 | var4) - (var3 & var4);
      var4 = -1943521729;
      var3 = var10007;
      var10007 = (var3 | var4) - (var3 & var4);
      var4 = 2131552817;
      var3 = -409577767;
      int var10006 = var3 & ~var4 | ~var3 & var4;
      var4 = -1735187639;
      var3 = var10006;
      return var10000.append(
            a("伟句伐句伟", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁴꤓ絳蹄⑮謤㐸W\ua7f0꒰ꁿꤑ絓蹄⑮謥㑮", var10003, var10004, var10005, (var3 | var4) & ~(var3 & var4))
         )
         .append(var2)
         .toString();
   }

   public String i() {
      return this.h;
   }

   public String j() {
      if (this.h != null) {
         if (!this.h.isEmpty()) {
            return this.h;
         }

         int var6 = -206093898;
         int var5 = 1813674997;
         int var10001 = (var5 | var6) - (var5 & var6);
         var6 = -1616037300;
         var5 = var10001;
         var10001 = (var5 | var6) & ~(var5 & var6);
         var10001 = (int)8557487021412774505L;
         var6 = 1076487669;
         var5 = var10001;
         var10001 = (var5 | var6) & (~var5 | ~var6);
         var6 = 24844181;
         var5 = var10001;
         var10001 = (var5 | var6) & (~var5 | ~var6);
         var6 = -897288827;
         var5 = -1623825863;
         int var10000 = (var5 | var6) & (~var5 | ~var6);
         var6 = 1396089079;
         var5 = var10000;
         int var4 = (var5 | var6) & (~var5 | ~var6);
         var10000 = (int)2456633852099576111L;
         var6 = -1321376783;
         var5 = var10000;
         var10000 = var5 + var6 - 2 * (var5 & var6);
         var6 = -7741915;
         var5 = var10000;
         var10000 = (var5 + var6 - 2 * (var5 & var6)) * (var5 + var6 - 2 * (var5 & var6));
         var6 = -1469911474;
         var5 = 1203627232;
         var10000 = (var5 | var6) & (~var5 | ~var6);
         var6 = -370285981;
         var5 = var10000;
         if (var5 + var6 - 2 * (var5 & var6) >= var4) {
            var6 = -1566116213;
            var5 = 441885250;
            var10000 = var5 + var6 - 2 * (var5 & var6);
            var6 = 296879295;
            var5 = var10000;
            var10000 = (var5 | var6) & ~(var5 & var6);
            var6 = 367959372;
            var5 = -1818565036;
            var10000 = var5 + var6 - 2 * (var5 & var6);
            var6 = 48579562;
            var5 = var10000;
            var4 = var5 & ~var6 | ~var5 & var6;
         }
      }

      if (this.f == null) {
         return this.c;
      } else if (this.g == null) {
         return this.f.a();
      } else if (this.e != EventInfo.EventState.MINE) {
         String var85 = this.f.a();
         String var2 = this.g.a();
         String var1 = var85;
         StringBuilder var86 = new StringBuilder().append(var1);
         String var91 = "clx";
         int var10002 = (int)-4620067823860135837L;
         int var56 = -1516020971;
         int var21 = var10002;
         var10002 = (var21 | var56) & ~(var21 & var56);
         var56 = -588089149;
         var21 = var10002;
         var10002 = (var21 + var56 - 2 * (var21 & var56)) * (var21 + var56 - 2 * (var21 & var56));
         var56 = 927192412;
         var21 = -1451655480;
         int var10004 = (var21 | var56) - (var21 & var56);
         var56 = -1640322159;
         var21 = var10004;
         var10004 = (var21 | var56) & (~var21 | ~var56);
         var10004 = (int)-1606294252383281363L;
         var56 = 154283975;
         var21 = var10004;
         var10004 = var21 & ~var56 | ~var21 & var56;
         var56 = 1489203439;
         var21 = var10004;
         var10004 = (var21 | var56) & ~(var21 & var56);
         var10004 = (int)8352208483321041221L;
         var56 = 527713845;
         var21 = var10004;
         var10004 = var21 + var56 - 2 * (var21 & var56);
         var56 = 86939506;
         var21 = var10004;
         var10004 = (var21 | var56) & ~(var21 & var56);
         int var10003 = (int)6734811519911239324L;
         var56 = -898056533;
         var21 = var10003;
         var10003 = var21 & ~var56 | ~var21 & var56;
         var56 = -660534897;
         var21 = var10003;
         var10003 = (var21 | var56) & (~var21 | ~var56);
         var10004 = (int)-1162070557748109024L;
         var56 = 1040428346;
         var21 = var10004;
         var10004 = (var21 | var56) & (~var21 | ~var56);
         var56 = 1229375691;
         var21 = var10004;
         var10004 = ((var21 | var56) & (~var21 | ~var56)) * ((var21 | var56) & (~var21 | ~var56));
         var56 = -563717077;
         var21 = -1438668838;
         var10004 = (var21 | var56) - (var21 & var56);
         var56 = 162136769;
         var21 = var10004;
         var10004 = var21 + var56 - 2 * (var21 & var56);
         int var10005 = (int)4157441563333794188L;
         var56 = 864360564;
         var21 = var10005;
         var10005 = var21 + var56 - 2 * (var21 & var56);
         var56 = -1633754085;
         var21 = var10005;
         var10005 = (var21 | var56) - (var21 & var56);
         var56 = 370723408;
         var21 = -1950960004;
         var10005 = (var21 | var56) & ~(var21 & var56);
         var56 = -1863239055;
         var21 = var10005;
         var10005 = var21 + var56 - 2 * (var21 & var56);
         var56 = -772975772;
         var21 = 695615601;
         int var10006 = var21 & ~var56 | ~var21 & var56;
         var56 = 802897775;
         var21 = var10006;
         var10006 = ((var21 | var56) & (~var21 | ~var56)) * ((var21 | var56) & (~var21 | ~var56));
         var56 = 213250627;
         var21 = -1168984062;
         var10006 = (var21 | var56) & ~(var21 & var56);
         var56 = -1230627721;
         var21 = var10006;
         return var86.append(
               a("僚བ僚", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁴꤓ絳蹄⑮謤㐸W\ua7f0꒰ꁿꤑ絓蹄⑮謥㑮", var10003, var10004, var10005, (var21 | var56) & ~(var21 & var56))
            )
            .append(var2)
            .toString();
      } else {
         return this.g.a();
      }
   }

   public static String a(String var0, String var1, int var2, int var3, int var4, int var5) {
      char[] var6 = var1.toCharArray();
      char[] var7 = new char[var6.length];
      int var10000 = (int)3803567721033717661L;
      int var18 = 1281251480;
      int var17 = var10000;
      var10000 = (var17 | var18) & (~var17 | ~var18);
      var18 = -419098865;
      var17 = var10000;
      char[] var266 = new char[(var17 | var18) & (~var17 | ~var18)];
      int var10002 = (int)-3697453458373118707L;
      var18 = -209808736;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -1688213587;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      int var10003 = (int)-3095220666608909279L;
      var18 = -1779573812;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 1689884639;
      var17 = var10003;
      var266[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var18 = -905425024;
      var17 = 1990440482;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -1129580125;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var10003 = (int)4063507916217345349L;
      var18 = 691731295;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -1994015329;
      var17 = var10003;
      var266[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var10002 = (int)7164163160231002675L;
      var18 = 1962614566;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1569104617;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)1227617815038816419L;
      var18 = -138189880;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -23645971;
      var17 = var10003;
      var266[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var18 = 38944462;
      var17 = -1514581279;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -1477743572;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -70826808;
      var17 = -1061938201;
      int var10004 = (var17 | var18) & ~(var17 & var18);
      var18 = 997416750;
      var17 = var10004;
      var10004 = var17 & ~var18 | ~var17 & var18;
      var18 = -1960342314;
      var17 = -1279668279;
      var10004 = (var17 | var18) - (var17 & var18);
      var18 = 949895956;
      var17 = var10004;
      var10004 = var17 + var18 - 2 * (var17 & var18);
      var18 = -610486961;
      var17 = 2004916863;
      var10004 = (var17 | var18) - (var17 & var18);
      var18 = -1407439044;
      var17 = var10004;
      var10004 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1456452207;
      var17 = -1774489037;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 1057728433;
      var17 = var10003;
      var266[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var10002 = (int)-4313578673847858168L;
      var18 = 180367336;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -531029020;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -1895035139;
      var17 = -1524747660;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1067099968;
      var17 = var10003;
      var10003 = ((var17 | var18) & (~var17 | ~var18)) * ((var17 | var18) & (~var17 | ~var18));
      var18 = 436301334;
      var17 = -203766063;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -371508766;
      var17 = var10003;
      var266[var10002] = (char)((var17 | var18) - (var17 & var18));
      var18 = 1010235051;
      var17 = 510255529;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 576657159;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)7575177048078379198L;
      var18 = 1564226770;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -1201989138;
      var17 = var10003;
      var266[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var10002 = (int)-22423654019283539L;
      var18 = -1482229079;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1808023806;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 1010607799;
      var17 = 314071597;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 780465545;
      var17 = var10003;
      var266[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var18 = 1161535540;
      var17 = -1665774790;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -645010679;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var10003 = (int)-5117843930122626090L;
      var18 = 2026390800;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -638670108;
      var17 = var10003;
      var266[var10002] = (char)((var17 | var18) - (var17 & var18));
      var10002 = (int)6180134092813613085L;
      var18 = 1109329720;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -261046483;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1709667362;
      var17 = -1417328990;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 832423215;
      var17 = var10003;
      var266[var10002] = (char)((var17 | var18) - (var17 & var18));
      var10002 = (int)1493161520089180190L;
      var18 = 1444550728;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1691832225;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)-6420260377870139313L;
      var18 = -1904749462;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1174328065;
      var17 = var10003;
      var266[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      char[] var8 = var266;
      var18 = -179647888;
      var17 = 478812981;
      var10000 = (var17 | var18) & ~(var17 & var18);
      var18 = -373239473;
      var17 = var10000;
      char[] var268 = new char[(var17 | var18) & ~(var17 & var18)];
      var18 = -1968089974;
      var17 = -543632873;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 1428784797;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1587108022;
      var17 = 1707357503;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -995960235;
      var17 = var10003;
      var268[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var18 = 545749380;
      var17 = 288904125;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 834611768;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -1808381459;
      var17 = -511830537;
      var10004 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1967676442;
      var17 = var10004;
      var10004 = (var17 | var18) & ~(var17 & var18);
      var10004 = (int)748214031274692476L;
      var18 = -960290644;
      var17 = var10004;
      var10004 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1194037288;
      var17 = var10004;
      var10004 = var17 + var18 - 2 * (var17 & var18);
      var10004 = (int)-2243132802401093223L;
      var18 = -229734848;
      var17 = var10004;
      var10004 = var17 & ~var18 | ~var17 & var18;
      var18 = 580239304;
      var17 = var10004;
      var10004 = var17 + var18 - 2 * (var17 & var18);
      var10004 = (int)6932112331543634485L;
      var18 = -793148522;
      var17 = var10004;
      var10004 = (var17 | var18) & ~(var17 & var18);
      var18 = -663035475;
      var17 = var10004;
      var10004 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1397988579;
      var17 = 1727392743;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 900133639;
      var17 = var10003;
      var268[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var10002 = (int)807169807706842262L;
      var18 = -476075992;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 1045875900;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      String var346 = "cly";
      var18 = 1414256083;
      var17 = -2052820063;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -772857567;
      var17 = var10003;
      var268[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var10002 = (int)-5400419620696387717L;
      var18 = -1585468509;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 388506843;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)820131642581838644L;
      var18 = -1536219455;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -1656031753;
      var17 = var10003;
      var268[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var18 = -876708993;
      var17 = -299837587;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 631155734;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var10003 = (int)-8076765049785951952L;
      var18 = -425860119;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 933888665;
      var17 = var10003;
      var268[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var18 = -1065197474;
      var17 = -1081543795;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 2131399638;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)8654571629694537905L;
      var18 = 1300420767;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 1520382138;
      var17 = var10003;
      var268[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var18 = -139191960;
      var17 = 1237194071;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -1106637767;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)2477737362204678147L;
      var18 = 329229295;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -841875539;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var10004 = (int)-7348415466071696154L;
      var18 = -398284686;
      var17 = var10004;
      var10004 = (var17 | var18) & ~(var17 & var18);
      var18 = 2045333884;
      var17 = var10004;
      var18 = (var17 | var18) & (~var17 | ~var18);
      var17 = var10003;
      var10003 = var17 - ~var18 - 1;
      var18 = 1648852407;
      var17 = 1405883383;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 831252857;
      var17 = var10003;
      var268[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var18 = -2142267071;
      var17 = 176583860;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -1966477838;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1646247191;
      var17 = -475694496;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -2118461617;
      var17 = var10003;
      var268[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var18 = -1801626416;
      var17 = 1139975020;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -680525900;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var10003 = (int)6362540578531052483L;
      var18 = 736560173;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1485186408;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var10003 = (int)6522237551703247360L;
      var18 = -1273797683;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -1913673015;
      var17 = var10003;
      var268[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var10002 = (int)6236178106853392353L;
      var18 = 951479431;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -1213852817;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)8584613127575570516L;
      var18 = -842854716;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -829475421;
      var17 = var10003;
      var268[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      char[] var9 = var268;
      var18 = 704436799;
      var17 = 937592766;
      var10000 = (var17 | var18) & ~(var17 & var18);
      var18 = 505306497;
      var17 = var10000;

      for (int var10 = (var17 | var18) & ~(var17 & var18); var10 < var6.length; var10++) {
         char var323 = var6[var10];
         char var251 = var8[var10 % var8.length];
         char var129 = var323;
         var7[var10] = (char)((var129 | var251) & ~(var129 & var251));
      }

      char[] var19 = new char[var7.length];
      var10000 = (int)-3247121985594714735L;
      var18 = 1584063059;
      var17 = var10000;
      var10000 = (var17 | var18) - (var17 & var18);
      var18 = 1278146498;
      var17 = var10000;

      for (int var11 = (var17 | var18) - (var17 & var18); var11 < var6.length; var11++) {
         char var324 = var7[var11];
         char var254 = var9[var11 % var9.length];
         char var132 = var324;
         var19[var11] = (char)((var132 | var254) & (~var132 | ~var254));
      }

      String var20 = new String(var19);
      int var12 = var20.hashCode();
      var18 = var5;
      var17 = var3;
      var10000 = 2 * (var17 & ~var18) - (var17 ^ var18);
      var18 = var2;
      var17 = var10000;
      int var13 = 2 * (var17 & ~var18) - (var17 ^ var18);
      char[] var14 = var0.toCharArray();
      char[] var15 = new char[var14.length];
      var18 = 995611162;
      var17 = 1389609401;
      var10000 = (var17 | var18) & ~(var17 & var18);
      var18 = 1770263459;
      var17 = var10000;

      for (int var16 = var17 & ~var18 | ~var17 & var18; var16 < var15.length; var16++) {
         int var10001 = (int)3909516918992220046L;
         var18 = -1994005170;
         var17 = var10001;
         var10001 = (var17 | var18) & ~(var17 & var18);
         var18 = 382520002;
         var17 = var10001;
         switch (var16 % ((var17 | var18) & ~(var17 & var18))) {
            case 0:
               var18 = var12;
               var17 = var13;
               var10002 = (var17 | var18) & (~var17 | ~var18);
               char var264 = var14[var16];
               var17 = var10002;
               var15[var16] = (char)(var17 & ~var264 | ~var17 & var264);
               break;
            case 1:
               var18 = var13;
               var17 = var5;
               var10002 = var17 & ~var18 | ~var17 & var18;
               char var262 = var14[var16];
               var17 = var10002;
               var15[var16] = (char)(var17 & ~var262 | ~var17 & var262);
         }
      }

      return new String(var15);
   }

   public enum EventKind {
      METEOR("\u041c\u0435\u0442\u0435\u043e\u0440"),
      BEACON("\u041c\u0430\u044f\u043a"),
      MINE("\u0428\u0430\u0445\u0442\u0430");

      private final String label;
      public static int d;
      public static boolean e;

      EventKind(String label) {
         this.label = label;
      }

      public String a() {
         return this.label;
      }

      public static String a(String value, String key, int seed1, int seed2, int seed3, int seed4) {
         return value;
      }
   }

   public enum EventState {
      CURRENT,
      UPCOMING,
      MINE;

      public static int d;
      public static boolean e;

      public static String a(String value, String key, int seed1, int seed2, int seed3, int seed4) {
         return value;
      }
   }

   public enum Rarity {
      LEGENDARY("\u041b\u0435\u0433\u0435\u043d\u0434\u0430\u0440\u043d\u0430\u044f"),
      ELITE("\u042d\u043b\u0438\u0442\u043d\u044b\u0439"),
      RICH("\u0411\u043e\u0433\u0430\u0442\u044b\u0439"),
      MYTHIC("\u041c\u0438\u0444\u0438\u0447\u0435\u0441\u043a\u0430\u044f");

      private final String label;
      public static int e;
      public static boolean f;

      Rarity(String label) {
         this.label = label;
      }

      public String a() {
         return this.label;
      }

      public static String a(String value, String key, int seed1, int seed2, int seed3, int seed4) {
         return value;
      }
   }
}
