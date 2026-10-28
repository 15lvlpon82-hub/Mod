package pulse;


import pulse.client.MinecraftContext;
import net.minecraft.client.util.math.MatrixStack;

public class EventsTab implements TabHost, MinecraftContext, ClickGuiTab {
   private static final String[] a;
   private static final String[] b;
   private static final float e = 44.5F;
   private static final float f = 19.0F;
   private static final float g = 117.5F;
   private static final float h = 15.0F;
   private static final float i = 19.0F;
   private static final float j = 19.0F;
   private int k;
   private boolean l;
   private final TabSelector m;
   private final SearchBox n;
   private final EventsPanel o;
   private final PanelFadeOverlay p;
   private int q;
   private int r;
   private long s;

   public EventsTab() {
      int var10001 = (int)-7688224121253515913L;
      int var2 = -554854612;
      int var1 = var10001;
      var10001 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1779058085;
      var1 = var10001;
      this.k = (var1 | var2) & ~(var1 & var2);
      var10001 = (int)-7642702009139429925L;
      var2 = 700798725;
      var1 = var10001;
      var10001 = var1 & ~var2 | ~var1 & var2;
      var2 = -590271778;
      var1 = var10001;
      this.l = pulse.Bool.from((var1 | var2) & (~var1 | ~var2));
      this.s = 0L;
      this.m = new TabSelector(this);
      this.n = new SearchBox(117.5F, 15.0F);
      this.n.a(this::e);
      this.o = new EventsPanel();
      var2 = 458501561;
      var1 = 1058123559;
      int var10003 = (var1 | var2) - (var1 & var2);
      var2 = 608535175;
      var1 = var10003;
      this.p = new PanelFadeOverlay((var1 | var2) - (var1 & var2), 10.0F, 7.5F);
      this.o.a(this::a);
      this.e();
   }

   private void e() {
      this.o.b();
   }

   private void a(AccountServiceClient var1) {
   }

   private int a(String var1) {
      try {
         int var24 = -790975690;
         int var7 = 403189229;
         int var10003 = var7 & ~var24 | ~var7 & var24;
         var24 = -855331069;
         var7 = var10003;
         var10003 = (var7 | var24) - (var7 & var24);
         int var10004 = (int)8006164704678347581L;
         var24 = -333691723;
         var7 = var10004;
         var10004 = var7 + var24 - 2 * (var7 & var24);
         var24 = 1077108450;
         var7 = var10004;
         var10004 = (var7 | var24) & (~var7 | ~var24);
         int var10005 = (int)-2457380156851909633L;
         var24 = -709043218;
         var7 = var10005;
         var10005 = var7 + var24 - 2 * (var7 & var24);
         var24 = -1221796752;
         var7 = var10005;
         var10005 = var7 & ~var24 | ~var7 & var24;
         int var10006 = (int)-1619062114020893167L;
         var24 = -2022886936;
         var7 = var10006;
         var10006 = var7 & ~var24 | ~var7 & var24;
         var24 = 1730073386;
         var7 = var10006;
         String var10001 = b("ᬼา᭗แ᭞ั", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁴꤓ絳蹄⑮謤㐸W\ua7f0꒰ꁿꤑ絥蹧⑿謹㑢", var10003, var10004, var10005, var7 & ~var24 | ~var7 & var24);
         var10004 = (int)5224703471299543153L;
         var24 = -590993409;
         var7 = var10004;
         var10004 = (var7 | var24) & (~var7 | ~var24);
         var24 = -962638250;
         var7 = var10004;
         var10004 = (var7 | var24) & ~(var7 & var24);
         var24 = 958010245;
         var7 = -1268099784;
         var10005 = (var7 | var24) & (~var7 | ~var24);
         var24 = 1118914539;
         var7 = var10005;
         var10005 = (var7 | var24) & ~(var7 & var24);
         var10006 = (int)1753913765295538143L;
         var24 = 1047920856;
         var7 = var10006;
         var10006 = var7 + var24 - 2 * (var7 & var24);
         var24 = -966860212;
         var7 = var10006;
         var10006 = (var7 | var24) & (~var7 | ~var24);
         int var10007 = (int)-1086509112138870948L;
         var24 = 959911339;
         var7 = var10007;
         var10007 = (var7 | var24) & (~var7 | ~var24);
         var24 = 747994696;
         var7 = var10007;
         return Integer.parseInt(
            var1.replaceAll(
               var10001, b("", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁴꤓ絳蹄⑮謤㐸W\ua7f0꒰ꁿꤑ絥蹧⑿謹㑢", var10004, var10005, var10006, (var7 | var24) - (var7 & var24))
            )
         );
      } catch (Exception var5) {
         int var10000 = (int)4436948031063521691L;
         int var4 = 1627796253;
         int var3 = var10000;
         var10000 = (var3 | var4) & ~(var3 & var4);
         var4 = -1888564602;
         var3 = var10000;
         return var3 + var4 - 2 * (var3 & var4);
      }
   }

   private EventInfo.EventKind b(String var1) {
      if (var1 == null) {
         return EventInfo.EventKind.METEOR;
      }

      String var2 = var1.toLowerCase();
      int var10003 = (int)235421981207216704L;
      int var4 = 1074295726;
      int var3 = var10003;
      var10003 = (var3 | var4) & ~(var3 & var4);
      var4 = 804427830;
      var3 = var10003;
      var10003 = var3 + var4 - 2 * (var3 & var4);
      int var10004 = (int)-5726297191759301440L;
      var4 = 502369141;
      var3 = var10004;
      var10004 = (var3 | var4) & ~(var3 & var4);
      var4 = -782513373;
      var3 = var10004;
      var10004 = (var3 | var4) & ~(var3 & var4);
      var4 = 671175940;
      var3 = 1816887759;
      int var10005 = var3 + var4 - 2 * (var3 & var4);
      var4 = 1538796708;
      var3 = var10005;
      var10005 = var3 + var4 - 2 * (var3 & var4);
      var4 = -21678154;
      var3 = 584267299;
      int var10006 = (var3 | var4) & ~(var3 & var4);
      var4 = -600838024;
      var3 = var10006;
      if (!var2.contains(
         b("\uf535ⴌ\uf546ⴆ", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁴꤓ絳蹄⑮謤㐸W\ua7f0꒰ꁿꤑ絥蹧⑿謹㑢", var10003, var10004, var10005, var3 & ~var4 | ~var3 & var4)
      )) {
         var10003 = (int)701340654888525743L;
         var4 = 1050671238;
         var3 = var10003;
         var10003 = (var3 | var4) - (var3 & var4);
         var4 = 576868081;
         var3 = var10003;
         var10003 = (var3 | var4) - (var3 & var4);
         var4 = 1744555555;
         var3 = -1934796740;
         var10004 = var3 & ~var4 | ~var3 & var4;
         var4 = 823910117;
         var3 = var10004;
         var10004 = var3 + var4 - 2 * (var3 & var4);
         var4 = -1441662252;
         var3 = -2082633780;
         var10005 = var3 & ~var4 | ~var3 & var4;
         var4 = 548461440;
         var3 = var10005;
         var10005 = var3 + var4 - 2 * (var3 & var4);
         var4 = 1012587719;
         var3 = 2063331954;
         var10006 = (var3 | var4) & (~var3 | ~var4);
         var4 = 1183017188;
         var3 = var10006;
         if (!var2.contains(
            b("\uf16b黥\uf168黣\uf166黮", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁴꤓ絳蹄⑮謤㐸W\ua7f0꒰ꁿꤑ絥蹧⑿謹㑢", var10003, var10004, var10005, (var3 | var4) - (var3 & var4))
         )) {
            return EventInfo.EventKind.METEOR;
         }
      }

      return EventInfo.EventKind.BEACON;
   }

   private EventInfo.Rarity c(String var1) {
      if (var1 == null) {
         return EventInfo.Rarity.LEGENDARY;
      }

      String var2 = var1.toLowerCase();
      int var10003 = (int)-1900750479201047039L;
      int var4 = -1827773568;
      int var3 = var10003;
      var10003 = (var3 | var4) & ~(var3 & var4);
      var4 = 373892185;
      var3 = var10003;
      var10003 = (var3 | var4) - (var3 & var4);
      var4 = 1560501973;
      var3 = 779779187;
      int var10004 = (var3 | var4) - (var3 & var4);
      var4 = -1448473522;
      var3 = var10004;
      var10004 = (var3 | var4) - (var3 & var4);
      var4 = -815078984;
      var3 = 873579713;
      int var10005 = (var3 | var4) & (~var3 | ~var4);
      var4 = -264323981;
      var3 = var10005;
      var10005 = (var3 | var4) - (var3 & var4);
      int var10006 = (int)-2535316519717362598L;
      var4 = -1634054489;
      var3 = var10006;
      var10006 = (var3 | var4) & (~var3 | ~var4);
      var4 = 1201679407;
      var3 = var10006;
      if (!var2.contains(b("鏚ﳔ鎢ﳔ鎡ﳙ鎧ﳖ", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁴꤓ絳蹄⑮謤㐸W\ua7f0꒰ꁿꤑ絥蹧⑿謹㑢", var10003, var10004, var10005, (var3 | var4) - (var3 & var4)))
         )
       {
         var10003 = (int)6341274214646088047L;
         var4 = 1465859634;
         var3 = var10003;
         var10003 = var3 & ~var4 | ~var3 & var4;
         var4 = -1445325179;
         var3 = var10003;
         var10003 = (var3 | var4) & ~(var3 & var4);
         var4 = -793263740;
         var3 = -1510258571;
         var10004 = var3 + var4 - 2 * (var3 & var4);
         var4 = -1348030379;
         var3 = var10004;
         var10004 = var3 + var4 - 2 * (var3 & var4);
         var4 = 386003268;
         var3 = -1957870280;
         var10005 = (var3 | var4) - (var3 & var4);
         var4 = -1781311294;
         var3 = var10005;
         var10005 = var3 + var4 - 2 * (var3 & var4);
         var10006 = (int)-2792221049064554259L;
         var4 = -1322363592;
         var3 = var10006;
         var10006 = (var3 | var4) & (~var3 | ~var4);
         var4 = 1565492315;
         var3 = var10006;
         if (!var2.contains(
            b("鞋\uefc9鞒\uefd8鞏\uefd3", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁴꤓ絳蹄⑮謤㐸W\ua7f0꒰ꁿꤑ絥蹧⑿謹㑢", var10003, var10004, var10005, (var3 | var4) & (~var3 | ~var4))
         )) {
            var10003 = (int)-8313279046037646611L;
            var4 = -1649375712;
            var3 = var10003;
            var10003 = (var3 | var4) - (var3 & var4);
            var4 = 1314716949;
            var3 = var10003;
            var10003 = (var3 | var4) - (var3 & var4);
            var4 = -537634211;
            var3 = 440787516;
            var10004 = var3 + var4 - 2 * (var3 & var4);
            var4 = 525529143;
            var3 = var10004;
            var10004 = var3 & ~var4 | ~var3 & var4;
            var10005 = (int)5312931495853844834L;
            var4 = 225207153;
            var3 = var10005;
            var10005 = var3 & ~var4 | ~var3 & var4;
            var4 = -928525595;
            var3 = var10005;
            var10005 = (var3 | var4) & ~(var3 & var4);
            var10006 = (int)6098083436815753655L;
            var4 = -1611939190;
            var3 = var10006;
            var10006 = var3 & ~var4 | ~var3 & var4;
            var4 = 969409405;
            var3 = var10006;
            if (!var2.contains(
               b("鎫\uda45鏞\uda3c", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁴꤓ絳蹄⑮謤㐸W\ua7f0꒰ꁿꤑ絥蹧⑿謹㑢", var10003, var10004, var10005, (var3 | var4) & ~(var3 & var4))
            )) {
               var10003 = (int)-1507581119062732518L;
               var4 = -624376299;
               var3 = var10003;
               var10003 = var3 + var4 - 2 * (var3 & var4);
               var4 = 1865481943;
               var3 = var10003;
               var10003 = (var3 | var4) & (~var3 | ~var4);
               var10004 = (int)-2224734155384549565L;
               var4 = -1871885297;
               var3 = var10004;
               var10004 = (var3 | var4) & ~(var3 & var4);
               var4 = -299257407;
               var3 = var10004;
               var10004 = var3 + var4 - 2 * (var3 & var4);
               var4 = 262365187;
               var3 = 201880574;
               var10005 = (var3 | var4) & (~var3 | ~var4);
               var4 = 501362105;
               var3 = var10005;
               var10005 = (var3 | var4) & (~var3 | ~var4);
               var4 = 1478012862;
               var3 = -1280450704;
               var10006 = (var3 | var4) & ~(var3 & var4);
               var4 = -343377223;
               var3 = var10006;
               if (!var2.contains(
                  b("鞃됥鞏됽鞃", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁴꤓ絳蹄⑮謤㐸W\ua7f0꒰ꁿꤑ絥蹧⑿謹㑢", var10003, var10004, var10005, (var3 | var4) & ~(var3 & var4))
               )) {
                  var10003 = (int)4007547525679240415L;
                  var4 = -722176612;
                  var3 = var10003;
                  var10003 = (var3 | var4) - (var3 & var4);
                  var4 = 834209947;
                  var3 = var10003;
                  var10003 = (var3 | var4) & (~var3 | ~var4);
                  var4 = 445720649;
                  var3 = -2013123450;
                  var10004 = var3 + var4 - 2 * (var3 & var4);
                  var4 = 1215003433;
                  var3 = var10004;
                  var10004 = (var3 | var4) - (var3 & var4);
                  var10005 = (int)-2868943317886323903L;
                  var4 = -204397437;
                  var3 = var10005;
                  var10005 = var3 & ~var4 | ~var3 & var4;
                  var4 = 1398494040;
                  var3 = var10005;
                  var10005 = (var3 | var4) & ~(var3 & var4);
                  var10006 = (int)5806149820954944769L;
                  var4 = 2081444039;
                  var3 = var10006;
                  var10006 = (var3 | var4) & ~(var3 & var4);
                  var4 = -1963498986;
                  var3 = var10006;
                  if (!var2.contains(
                     b("鏗ⷐ鏕ⷞ鎤", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁴꤓ絳蹄⑮謤㐸W\ua7f0꒰ꁿꤑ絥蹧⑿謹㑢", var10003, var10004, var10005, var3 & ~var4 | ~var3 & var4)
                  )) {
                     var10003 = (int)5558438392129442395L;
                     var4 = -2144194150;
                     var3 = var10003;
                     var10003 = (var3 | var4) - (var3 & var4);
                     var4 = 153143833;
                     var3 = var10003;
                     var10003 = (var3 | var4) & ~(var3 & var4);
                     var4 = -643056081;
                     var3 = -1450696437;
                     var10004 = var3 & ~var4 | ~var3 & var4;
                     var4 = -1429593450;
                     var3 = var10004;
                     var10004 = (var3 | var4) & ~(var3 & var4);
                     var10005 = (int)-100296624190278419L;
                     var4 = 607466933;
                     var3 = var10005;
                     var10005 = var3 + var4 - 2 * (var3 & var4);
                     var4 = 1435436719;
                     var3 = var10005;
                     var10005 = var3 + var4 - 2 * (var3 & var4);
                     var10006 = (int)-5838587484568958842L;
                     var4 = 310231625;
                     var3 = var10006;
                     var10006 = (var3 | var4) & (~var3 | ~var4);
                     var4 = -502931629;
                     var3 = var10006;
                     if (!var2.contains(
                        b("鞔毋鞅毊", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁴꤓ絳蹄⑮謤㐸W\ua7f0꒰ꁿꤑ絥蹧⑿謹㑢", var10003, var10004, var10005, var3 + var4 - 2 * (var3 & var4))
                     )) {
                        return EventInfo.Rarity.LEGENDARY;
                     }
                  }

                  return EventInfo.Rarity.RICH;
               }
            }

            return EventInfo.Rarity.ELITE;
         }
      }

      return EventInfo.Rarity.MYTHIC;
   }

   private EventInfo.Rarity d(String var1) {
      return var1 != null && !var1.isEmpty() ? this.c(var1) : EventInfo.Rarity.LEGENDARY;
   }

   private void e(String var1) {
      this.o.a(var1);
   }

   private void a(EventInfo var1) {
   }

   private void f(String var1) {
   }

   @Override
   public String[] c() {
      return this.l ? a : b;
   }

   @Override
   public int d() {
      return this.k;
   }

   @Override
   public void a(int var1) {
      String[] var2 = this.c();
      if (var1 >= 0 && var1 < var2.length && this.k != var1) {
         this.k = var1;
         this.o.a(var1);
      }
   }

   @Override
   public void a(MatrixStack var1, Renderer2D var2, float var3, float var4, int var5, int var6) {
      this.q = var5;
      this.r = var6;
      this.e();
      this.m.a(var1, var2, var3, var4, var5, var6);
      float var7 = pulse.PulseClickGuiScreen.d();
      float var8 = pulse.PulseClickGuiScreen.e();
      float var9 = var3 + var7 - 19.0F - 117.5F;
      float var10 = var4 + 19.0F - 3.0F;
      this.n.a(var1, var2, var9, var10, 117.5F, 15.0F, var5, var6);
      float var11 = var3 + 19.0F;
      float var12 = var4 + 44.5F;
      float var13 = var7 - 38.0F;
      float var14 = var8 - 44.5F - 9.5F;
      this.o.a(var1, var2, var11, var12, var13, var14 - 8.0F, var5, var6, 1.0F);
      this.p.a(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void a(float var1, float var2, int var3, int var4) {
      if (!this.n.a(var3, var4)) {
         this.m.a(var1, var2, var3, var4);
         float var5 = pulse.PulseClickGuiScreen.d();
         float var6 = pulse.PulseClickGuiScreen.e();
         float var7 = var1 + 19.0F;
         float var8 = var2 + 44.5F;
         float var9 = var5 - 38.0F;
         float var10 = var6 - 44.5F - 9.5F;
         this.o.a(var7, var8, var9, var10 - 8.0F, var3, var4);
      }
   }

   @Override
   public void b(float var1, float var2, int var3, int var4) {
      this.a(var1, var2, var3, var4);
   }

   @Override
   public void c(float var1, float var2, int var3, int var4) {
      this.o.a(var3, var4);
   }

   @Override
   public void a(float var1, float var2, int var3, int var4, double var5, double var7) {
      this.o.a(var3, var4, var5, var7);
   }

   @Override
   public void a(float var1) {
      this.o.a(var1, this.q, this.r);
   }

   @Override
   public boolean a(int var1, int var2, int var3) {
      return this.n.a(var1, var2, var3);
   }

   @Override
   public boolean b() {
      return this.n.c();
   }

   public boolean a(char var1, int var2) {
      return this.n.a(var1, var2);
   }

   @Override
   public ClickGuiTabType a() {
      return ClickGuiTabType.EVENTS;
   }

   static {
      int var10000 = (int)-9136255406531724929L;
      int var1 = 10870150;
      int var0 = var10000;
      var10000 = var0 & ~var1 | ~var0 & var1;
      var1 = 483058938;
      var0 = var10000;
      String[] var109 = new String[(var0 | var1) & ~(var0 & var1)];
      int var10002 = (int)-8732240858969501864L;
      var1 = 1382458579;
      var0 = var10002;
      var10002 = var0 & ~var1 | ~var0 & var1;
      var1 = 295578507;
      var0 = var10002;
      var10002 = (var0 | var1) - (var0 & var1);
      var1 = 1230847380;
      var0 = -364250831;
      int var10005 = var0 + var1 - 2 * (var0 & var1);
      var1 = -1497174659;
      var0 = var10005;
      var10005 = (var0 | var1) & ~(var0 & var1);
      var1 = 1161878543;
      var0 = 1802306705;
      int var10006 = var0 & ~var1 | ~var0 & var1;
      var1 = -1076419607;
      var0 = var10006;
      var10006 = (var0 | var1) & ~(var0 & var1);
      int var10007 = (int)-7979854404188311069L;
      var1 = 1819911718;
      var0 = var10007;
      var10007 = (var0 | var1) & (~var0 | ~var1);
      var1 = -1191036912;
      var0 = var10007;
      var10007 = var0 + var1 - 2 * (var0 & var1);
      var1 = -1762523141;
      var0 = -2106393034;
      int var10008 = (var0 | var1) & (~var0 | ~var1);
      var1 = 344865595;
      var0 = var10008;
      var109[var10002] = b("⍓졪⍋제⌸졧⍄", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁴꤓ絳蹄⑮謤㐸W\ua7f0꒰ꁿꤑ絥蹧⑿謹㑢", var10005, var10006, var10007, (var0 | var1) & (~var0 | ~var1));
      var10002 = (int)4890489954094296956L;
      var1 = 2083562742;
      var0 = var10002;
      var10002 = var0 & ~var1 | ~var0 & var1;
      var1 = -1218933877;
      var0 = var10002;
      var10002 = (var0 | var1) & ~(var0 & var1);
      var10005 = (int)8867336967520389493L;
      var1 = 2028278222;
      var0 = var10005;
      var10005 = var0 + var1 - 2 * (var0 & var1);
      var1 = -645058205;
      var0 = var10005;
      var10005 = var0 & ~var1 | ~var0 & var1;
      var10006 = (int)-5139067751312350718L;
      var1 = 1937367724;
      var0 = var10006;
      var10006 = var0 & ~var1 | ~var0 & var1;
      var1 = 1329444992;
      var0 = var10006;
      var10006 = (var0 | var1) & (~var0 | ~var1);
      var1 = -1706035069;
      var0 = 1726780886;
      var10007 = var0 & ~var1 | ~var0 & var1;
      var1 = -284555755;
      var0 = var10007;
      var10007 = var0 & ~var1 | ~var0 & var1;
      var10008 = (int)-6616037522335146569L;
      var1 = -434634675;
      var0 = var10008;
      var10008 = var0 + var1 - 2 * (var0 & var1);
      var1 = -625319337;
      var0 = var10008;
      var109[var10002] = b(
         "⍮땄⍄따⌰땆⍏땋⌸딼⍄", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁴꤓ絳蹄⑮謤㐸W\ua7f0꒰ꁿꤑ絥蹧⑿謹㑢", var10005, var10006, var10007, var0 + var1 - 2 * (var0 & var1)
      );
      var1 = 1020625812;
      var0 = 1207063552;
      var10002 = (var0 | var1) - (var0 & var1);
      var1 = 2066208662;
      var0 = var10002;
      var10002 = (var0 | var1) - (var0 & var1);
      var10005 = (int)4279079047895532237L;
      var1 = -745568024;
      var0 = var10005;
      var10005 = var0 + var1 - 2 * (var0 & var1);
      var1 = 569959421;
      var0 = var10005;
      var10005 = (var0 | var1) & ~(var0 & var1);
      var10006 = (int)165289861510620366L;
      var1 = -5278383;
      var0 = var10006;
      var10006 = var0 & ~var1 | ~var0 & var1;
      var1 = -1242498658;
      var0 = var10006;
      var10006 = (var0 | var1) & ~(var0 & var1);
      var10007 = (int)-4207412164002992669L;
      var1 = -425211991;
      var0 = var10007;
      var10007 = var0 & ~var1 | ~var0 & var1;
      var1 = 1153438211;
      var0 = var10007;
      var10007 = (var0 | var1) - (var0 & var1);
      var10008 = (int)-5629622339998115574L;
      var1 = 672987000;
      var0 = var10008;
      var10008 = (var0 | var1) & (~var0 | ~var1);
      var1 = 619725298;
      var0 = var10008;
      var109[var10002] = b("⍙ꔙ⌴ꕫ⌺", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁴꤓ絳蹄⑮謤㐸W\ua7f0꒰ꁿꤑ絥蹧⑿謹㑢", var10005, var10006, var10007, var0 & ~var1 | ~var0 & var1);
      a = var109;
      var1 = 651163681;
      var0 = -628227891;
      var10000 = (var0 | var1) & ~(var0 & var1);
      var1 = -62785298;
      var0 = var10000;
      String[] var111 = new String[(var0 | var1) - (var0 & var1)];
      var1 = -1615815253;
      var0 = 1789622160;
      var10002 = (var0 | var1) - (var0 & var1);
      var1 = -182719941;
      var0 = var10002;
      var10002 = (var0 | var1) - (var0 & var1);
      var1 = -1988325865;
      var0 = 1221407759;
      var10005 = var0 + var1 - 2 * (var0 & var1);
      var1 = -999844928;
      var0 = var10005;
      var10005 = (var0 | var1) & ~(var0 & var1);
      var10006 = (int)-8214511003317256809L;
      var1 = -1290818042;
      var0 = var10006;
      var10006 = (var0 | var1) & (~var0 | ~var1);
      var1 = -358493067;
      var0 = var10006;
      var10006 = (var0 | var1) & (~var0 | ~var1);
      var1 = 1784008709;
      var0 = -517337054;
      var10007 = (var0 | var1) & ~(var0 & var1);
      var1 = -1651787078;
      var0 = var10007;
      var10007 = (var0 | var1) & ~(var0 & var1);
      var1 = 1402796913;
      var0 = -1843291613;
      var10008 = var0 + var1 - 2 * (var0 & var1);
      var1 = -1046745551;
      var0 = var10008;
      var111[var10002] = b("⍓藿⍋薉⌸藲⍄", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁴꤓ絳蹄⑮謤㐸W\ua7f0꒰ꁿꤑ絥蹧⑿謹㑢", var10005, var10006, var10007, (var0 | var1) & ~(var0 & var1));
      var1 = 1976422266;
      var0 = -1133614103;
      var10002 = var0 & ~var1 | ~var0 & var1;
      var1 = -912022382;
      var0 = var10002;
      var10002 = (var0 | var1) - (var0 & var1);
      var1 = 1703922395;
      var0 = -553212400;
      var10005 = (var0 | var1) & (~var0 | ~var1);
      var1 = -1084275437;
      var0 = var10005;
      var10005 = (var0 | var1) & (~var0 | ~var1);
      var10006 = (int)-407858974867095274L;
      var1 = 1774522680;
      var0 = var10006;
      var10006 = (var0 | var1) & ~(var0 & var1);
      var1 = -1531098428;
      var0 = var10006;
      var10006 = var0 + var1 - 2 * (var0 & var1);
      var1 = -149342026;
      var0 = -70240138;
      var10007 = (var0 | var1) & ~(var0 & var1);
      var1 = 271583204;
      var0 = var10007;
      var10007 = var0 + var1 - 2 * (var0 & var1);
      var10008 = (int)4991814942899380317L;
      var1 = 514901015;
      var0 = var10008;
      var10008 = (var0 | var1) - (var0 & var1);
      var1 = 917653027;
      var0 = var10008;
      var111[var10002] = b(
         "⍮ꢀ⍄ꣴ⌰ꢂ⍏ꢏ⌸꣸⍄", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁴꤓ絳蹄⑮謤㐸W\ua7f0꒰ꁿꤑ絥蹧⑿謹㑢", var10005, var10006, var10007, var0 + var1 - 2 * (var0 & var1)
      );
      b = var111;
   }

   public static String b(String var0, String var1, int var2, int var3, int var4, int var5) {
      char[] var6 = var1.toCharArray();
      char[] var7 = new char[var6.length];
      int var18 = -66323862;
      int var17 = 1651130388;
      int var10000 = var17 & ~var18 | ~var17 & var18;
      var18 = -1637762444;
      var17 = var10000;
      char[] var219 = new char[(var17 | var18) - (var17 & var18)];
      var18 = -1622271772;
      var17 = 1230742978;
      int var10002 = (var17 | var18) - (var17 & var18);
      var18 = -703218394;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      int var10003 = (int)-3433782127424178637L;
      var18 = -155704385;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -327967298;
      var17 = var10003;
      var219[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var10002 = (int)7837886816028531018L;
      var18 = 495774536;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 1586885123;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)-4214286879970948000L;
      var18 = 1245443877;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 2072369344;
      var17 = var10003;
      var219[var10002] = (char)((var17 | var18) - (var17 & var18));
      var10002 = (int)6393357435452098723L;
      var18 = 823232873;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -14155320;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)-1799106187446497820L;
      var18 = -968508077;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -1504783567;
      var17 = var10003;
      var219[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var18 = -1332268416;
      var17 = 239451921;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1093497454;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1996700134;
      var17 = -1745880253;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -521381194;
      var17 = var10003;
      var219[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var18 = 518896096;
      var17 = -741756665;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -853276445;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)-1594234187871939601L;
      var18 = 1475329033;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1326235965;
      var17 = var10003;
      var219[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var10002 = (int)1198194089863019198L;
      var18 = -1995755509;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1555379536;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)-7562380323579169106L;
      var18 = 800857568;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -1693143348;
      var17 = var10003;
      var219[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var10002 = (int)5074799624304850337L;
      var18 = 587644510;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -738243591;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)-4578868460498970755L;
      var18 = -1950575654;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1459319372;
      var17 = var10003;
      var219[var10002] = (char)((var17 | var18) - (var17 & var18));
      var10002 = (int)2750672604679391293L;
      var18 = -2048443971;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -2101907065;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1050842582;
      var17 = 1581070934;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1621072802;
      var17 = var10003;
      var219[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var10002 = (int)-6260395902952524043L;
      var18 = 94837000;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1720922101;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)5455246041901732491L;
      var18 = 686693649;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 285640649;
      var17 = var10003;
      var219[var10002] = (char)((var17 | var18) - (var17 & var18));
      var10002 = (int)3763436881871955489L;
      var18 = -1229247273;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 942656255;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1186040542;
      var17 = 683302753;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1846268569;
      var17 = var10003;
      var219[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      char[] var8 = var219;
      var18 = -94873270;
      var17 = -1282165965;
      var10000 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1238100595;
      var17 = var10000;
      char[] var221 = new char[(var17 | var18) & (~var17 | ~var18)];
      var18 = -629137975;
      var17 = 1463987158;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -1916619233;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)8584670280240553081L;
      var18 = 1177678603;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1582897326;
      var17 = var10003;
      var221[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var18 = 1704030530;
      var17 = -254129833;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -1790232556;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)1991435046398658238L;
      var18 = 312297337;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1220098620;
      var17 = var10003;
      var221[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var10002 = (int)4435467532933352143L;
      var18 = 1993204293;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -276256632;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1074159461;
      var17 = 225961099;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1299266749;
      var17 = var10003;
      var221[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var18 = -347841976;
      var17 = 56983528;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -400480861;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)8590761920698437419L;
      var18 = 1068444697;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 1182915376;
      var17 = var10003;
      var221[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var10002 = (int)7874903282807681744L;
      var18 = 816086325;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 1022054369;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var10003 = (int)8097313644142128930L;
      var18 = -2000955113;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 716705397;
      var17 = var10003;
      var221[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var18 = 598263430;
      var17 = 2022869612;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 1530547439;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 972773936;
      var17 = 1852319375;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1469269035;
      var17 = var10003;
      var221[var10002] = (char)((var17 | var18) - (var17 & var18));
      var10002 = (int)-6957911332361040695L;
      var18 = 2068118271;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -2068810192;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -1322400621;
      var17 = -1731697378;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 702883508;
      var17 = var10003;
      var221[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var10002 = (int)-1774223848915219792L;
      var18 = 1895349427;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 899249668;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -420069113;
      var17 = 2018256572;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1631946877;
      var17 = var10003;
      var221[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var18 = 2005008489;
      var17 = -76360008;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1930373415;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -364901762;
      var17 = -899996799;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 538684155;
      var17 = var10003;
      var221[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var18 = 56377597;
      var17 = -337858795;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -394203167;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1640247223;
      var17 = -1370464141;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -812352265;
      var17 = var10003;
      var221[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      char[] var9 = var221;
      var18 = 64855329;
      var17 = -2031310743;
      var10000 = var17 & ~var18 | ~var17 & var18;
      var18 = -2060372664;
      var17 = var10000;

      for (int var10 = (var17 | var18) - (var17 & var18); var10 < var6.length; var10++) {
         char var279 = var6[var10];
         char var205 = var8[var10 % var8.length];
         char var106 = var279;
         var7[var10] = (char)(var106 + var205 - 2 * (var106 & var205));
      }

      char[] var19 = new char[var7.length];
      var10000 = (int)-5343064216834875615L;
      var18 = -641942196;
      var17 = var10000;
      var10000 = var17 & ~var18 | ~var17 & var18;
      var18 = -1765252499;
      var17 = var10000;

      for (int var11 = (var17 | var18) & (~var17 | ~var18); var11 < var6.length; var11++) {
         char var280 = var7[var11];
         char var208 = var9[var11 % var9.length];
         char var109 = var280;
         var19[var11] = (char)((var109 | var208) & ~(var109 & var208));
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
      var10000 = (int)-5803426163180325796L;
      var18 = 335517168;
      var17 = var10000;
      var10000 = var17 + var18 - 2 * (var17 & var18);
      var18 = 345121196;
      var17 = var10000;

      for (int var16 = (var17 | var18) & (~var17 | ~var18); var16 < var15.length; var16++) {
         int var10001 = (int)2474858578697316907L;
         var18 = -1470094268;
         var17 = var10001;
         var10001 = var17 & ~var18 | ~var17 & var18;
         var18 = 2096418413;
         var17 = var10001;
         switch (var16 % ((var17 | var18) & (~var17 | ~var18))) {
            case 0:
               var18 = var12;
               var17 = var13;
               var10002 = var17 & ~var18 | ~var17 & var18;
               char var218 = var14[var16];
               var17 = var10002;
               var15[var16] = (char)((var17 | var218) & ~(var17 & var218));
               break;
            case 1:
               var18 = var13;
               var17 = var5;
               var10002 = (var17 | var18) & ~(var17 & var18);
               char var216 = var14[var16];
               var17 = var10002;
               var15[var16] = (char)(var17 + var216 - 2 * (var17 & var216));
         }
      }

      return new String(var15);
   }
}
