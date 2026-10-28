package pulse;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import net.minecraft.client.util.math.MatrixStack;

public class TabSelector implements ClickGuiOverlay {
   private final TabHost c;
   private static final float d = 19.0F;
   private static final float e = 35.5F;
   private static final float f = 6.0F;
   private static final Color g = pulse.Theme.N;
   private final Map<Integer, AnimationState> h = new HashMap<>();
   private final Map<Integer, AnimationState> i = new HashMap<>();
   private final Map<Integer, Boolean> j = new HashMap<>();
   private final Map<Integer, Boolean> k = new HashMap<>();
   private final Map<Integer, Float> l = new HashMap<>();
   private final Map<Integer, Float> m = new HashMap<>();
   private String[] n;
   public static int a;
   public static boolean b;

   public TabSelector(TabHost var1) {
      this.c = var1;
      this.a();
   }

   private void a() {
      String[] var1 = this.c.c();
      this.n = var1;
      int var2 = this.c.d();
      int var10001 = (int)-6791595305882919554L;
      int var9 = 1688286563;
      int var8 = var10001;
      var10001 = (var8 | var9) & (~var8 | ~var9);
      var9 = 436365331;
      var8 = var10001;
      FontRenderer var3 = FontManager.b[(var8 | var9) & (~var8 | ~var9)];
      var9 = -562001985;
      var8 = -1655083751;
      int var10000 = (var8 | var9) & ~(var8 & var9);
      var9 = 1138354854;
      var8 = var10000;

      for (int var4 = (var8 | var9) & ~(var8 & var9); var4 < var1.length; var4++) {
         this.h.put(var4, new AnimationState());
         this.i.put(var4, new AnimationState());
         Map var75 = this.j;
         Integer var85 = var4;
         var9 = 1070304849;
         var8 = 1889173819;
         int var10002 = var8 & ~var9 | ~var8 & var9;
         var9 = 1330712426;
         var8 = var10002;
         var75.put(var85, Boolean.valueOf(pulse.Bool.from((var8 | var9) - (var8 & var9))));
         if (var4 != var2) {
            if (a != a) {
               var10000 = (int)-6813219313468534878L;
               var9 = 690991905;
               var8 = var10000;
               var10000 = (var8 | var9) & (~var8 | ~var9);
               var9 = -892388221;
               var8 = var10000;
               var10000 = (var8 | var9) - (var8 & var9);
               int var86 = (int)-8105526861116013374L;
               var9 = 638838147;
               var8 = var86;
               var86 = (var8 | var9) & (~var8 | ~var9);
               var9 = -472325823;
               var8 = var86;
               var10000 /= (var8 | var9) & ~(var8 & var9);
            }

            var10000 = (int)2527058981314536774L;
            var9 = -1545078233;
            var8 = var10000;
            var10000 = (var8 | var9) - (var8 & var9);
            var9 = -2007933087;
            var8 = var10000;
            var10000 = (var8 | var9) & ~(var8 & var9);
         } else {
            var9 = -1681637977;
            var8 = 2042332446;
            var10000 = (var8 | var9) - (var8 & var9);
            var9 = -494946120;
            var8 = var10000;
            var10000 = (var8 | var9) & (~var8 | ~var9);
            String var88 = "wo";
            var9 = -1381751632;
            var8 = -816100595;
            int var89 = var8 + var9 - 2 * (var8 & var9);
            var9 = 1241362074;
            var8 = var89;
            int var7 = var8 & ~var9 | ~var8 & var9;
            a = var7;
            var10002 = (int)8620071698346211268L;
            var9 = 25502520;
            var8 = var10002;
            var10002 = (var8 | var9) & (~var8 | ~var9);
            var9 = -539503371;
            var8 = var10002;
            var10002 = (var8 | var9) - (var8 & var9);
            var9 = -22235505;
            var8 = -1511897299;
            var10002 = (var8 | var9) & ~(var8 & var9);
            var9 = 1531900333;
            var8 = var10002;
            var10002 = (var8 | var9) - (var8 & var9);
            var10002 = (int)2218895575419262349L;
            var9 = 762280099;
            var8 = var10002;
            var10002 = (var8 | var9) - (var8 & var9);
            var9 = 736259388;
            var8 = var10002;
            var10002 = var8 + var9 - 2 * (var8 & var9);
            var9 = 166836167;
            var8 = -707486116;
            var10002 = var8 + var9 - 2 * (var8 & var9);
            var9 = -601544294;
            var8 = var10002;
            var10002 = (var8 | var9) & (~var8 | ~var9);
            var9 = 56924340;
            var8 = -241408081;
            var89 = var8 + var9 - 2 * (var8 & var9);
            var9 = -2020008908;
            var8 = var89;
            if (((var8 | var9) & (~var8 | ~var9)) <= a) {
               var9 = 842548274;
               var8 = -1348072955;
               var89 = (var8 | var9) - (var8 & var9);
               var9 = -499562729;
               var8 = var89;
               var89 = var8 & ~var9 | ~var8 & var9;
               var10002 = (int)-1571076348690078716L;
               var9 = 393213509;
               var8 = var10002;
               var10002 = (var8 | var9) - (var8 & var9);
               var9 = -460337167;
               var8 = var10002;
               var9 = (var8 | var9) & (~var8 | ~var9);
               var8 = var89;
               var89 = (var8 | var9) + (var8 & var9);
               var9 = -1177620322;
               var8 = -2123275327;
               var89 = (var8 | var9) & (~var8 | ~var9);
               var9 = -709617184;
               var8 = var89;
               var7 = (var8 | var9) & ~(var8 & var9);
            }
         }

         int var5 = var10000;
         this.k.put(var4, Boolean.valueOf(pulse.Bool.from(var5)));
         this.h.get(var4).d(var5 == 0 ? 0.0 : 1.0);
         this.l.put(var4, var3.a(var1[var4]));
      }
   }

   private void b() {
      String[] var1 = this.c.c();
      if (this.n != null && var1.length == this.n.length) {
         int var4 = 38740076;
         int var3 = -1014331321;
         int var10000 = (var3 | var4) & (~var3 | ~var4);
         var4 = -1044010965;
         var3 = var10000;

         for (int var2 = (var3 | var4) & ~(var3 & var4); var2 < var1.length; var2++) {
            if (!var1[var2].equals(this.n[var2])) {
               this.a();
               return;
            }
         }
      } else {
         this.a();
      }
   }

   @Override
   public void a(MatrixStack var1, Renderer2D var2, float var3, float var4, int var5, int var6) {
      this.b();
      float var7 = pulse.PulseClickGuiScreen.d();
      int var10001 = (int)-6154116820996800041L;
      int var28 = -1331854383;
      int var27 = var10001;
      var10001 = (var27 | var28) & (~var27 | ~var28);
      var28 = -1029225976;
      var27 = var10001;
      FontRenderer var8 = FontManager.b[(var27 | var28) & ~(var27 & var28)];
      String[] var9 = this.c.c();
      int var10 = this.c.d();
      if (var9.length != 0) {
         int var10002 = (int)2385800067387045003L;
         var28 = 1734427453;
         var27 = var10002;
         var10002 = var27 + var28 - 2 * (var27 & var28);
         var28 = 919893951;
         var27 = var10002;
         var10002 = (var27 | var28) & (~var27 | ~var28);
         var10002 = (int)-7843363950993666318L;
         var28 = 1079932094;
         var27 = var10002;
         var10002 = (var27 | var28) & ~(var27 & var28);
         var28 = 1363612045;
         var27 = var10002;
         var10002 = ((var27 | var28) & ~(var27 & var28)) * ((var27 | var28) & ~(var27 & var28));
         String var10003 = "wp";
         int var393 = (int)-7033541505880534185L;
         var28 = -600949345;
         var27 = var393;
         int var394 = var27 + var28 - 2 * (var27 & var28);
         var28 = -224603332;
         var27 = var394;
         int var395 = var27 + var28 - 2 * (var27 & var28);
         String var10004 = "wq";
         int var412 = (int)-4893293772426524048L;
         var28 = -421554701;
         var27 = var412;
         int var413 = var27 + var28 - 2 * (var27 & var28);
         var28 = 1920163738;
         var27 = var413;
         int var414 = (var27 | var28) & (~var27 | ~var28);
         int var10005 = (int)5750009055513266783L;
         var28 = 743230361;
         var27 = var10005;
         var10005 = var27 + var28 - 2 * (var27 & var28);
         var28 = 4239041;
         var27 = var10005;
         var10005 = ((var27 | var28) - (var27 & var28)) * ((var27 | var28) - (var27 & var28));
         var10005 = (int)3180690906129275536L;
         var28 = 657758879;
         var27 = var10005;
         var10005 = (var27 | var28) & ~(var27 & var28);
         var28 = -618851719;
         var27 = var10005;
         var10005 = (var27 | var28) & (~var27 | ~var28);
         int var10007 = (int)1660450464063046080L;
         var28 = -545940083;
         var27 = var10007;
         var10007 = var27 & ~var28 | ~var27 & var28;
         var28 = -1830167482;
         var27 = var10007;
         var10007 = (var27 | var28) & ~(var27 & var28);
         int var10006 = (int)-7090797880349329141L;
         var28 = 1447317082;
         var27 = var10006;
         var10006 = (var27 | var28) & ~(var27 & var28);
         var28 = 698693598;
         var27 = var10006;
         float var11 = var8.a(
            b("ﱍ", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謴㑸\u007f\ua7eb꒺ꁿꥊ終蹋⑸謤㑒~\ua7e3꒸ꁴꤋ絢", var395, var414, var10005, var27 & ~var28 | ~var27 & var28)
         );
         var10001 = (int)6723857322079268107L;
         var28 = -1758714102;
         var27 = var10001;
         var10001 = (var27 | var28) & ~(var27 & var28);
         var28 = 2029778733;
         var27 = var10001;
         var10001 = var27 + var28 - 2 * (var27 & var28);
         float var12 = var3 + 19.0F;
         var28 = 1082494367;
         var27 = -463695713;
         var10001 = var27 + var28 - 2 * (var27 & var28);
         var28 = -1087084704;
         var27 = var10001;
         var10001 = ((var27 | var28) - (var27 & var28)) * ((var27 | var28) - (var27 & var28));
         float var13 = var4 + 19.0F;
         int var10000 = (int)-4860437490516837131L;
         var28 = -514992477;
         var27 = var10000;
         var10000 = var27 + var28 - 2 * (var27 & var28);
         var28 = 2019029385;
         var27 = var10000;
         var10000 = ((var27 | var28) - (var27 & var28)) * ((var27 | var28) - (var27 & var28));
         float var14 = 7.0F;
         float var15 = 0.0F;
         var28 = -1248330615;
         var27 = 993377557;
         var10000 = var27 & ~var28 | ~var27 & var28;
         var28 = -1901968996;
         var27 = var10000;

         for (int var16 = (var27 | var28) & ~(var27 & var28); var16 < var9.length; var16++) {
            var15 += this.l.get(var16);
            var10001 = var9.length;
            var28 = -1256678483;
            var27 = -1304751474;
            var10002 = (var27 | var28) & ~(var27 & var28);
            var28 = 119769378;
            var27 = var10002;
            var28 = (var27 | var28) & (~var27 | ~var28);
            var27 = var10001;
            if (var16 < 2 * (var27 & ~var28) - (var27 ^ var28)) {
               var28 = 39387626;
               var27 = -960204959;
               var10002 = (var27 | var28) & (~var27 | ~var28);
               var28 = -996315510;
               var27 = var10002;
               var10002 = var27 + var28 - 2 * (var27 & var28);
               var15 += 12.0F + var11;
            }
         }

         GuiLayerRegistry.a().a(GuiLayerRegistry.Layer.TABS, var12, var13, var15, var14);
         boolean var30 = GuiInteractionState.a().b();
         if (GuiInput.a(GuiLayerRegistry.Layer.TABS, var5, var6) && !var30) {
            var10000 = (int)-8666116527126516204L;
            var28 = 1950581355;
            var27 = var10000;
            var10000 = (var27 | var28) - (var27 & var28);
            var28 = 1983442047;
            var27 = var10000;
            var10000 = var27 & ~var28 | ~var27 & var28;
         } else {
            var10000 = (int)8001719139786514701L;
            var28 = -799830652;
            var27 = var10000;
            var10000 = (var27 | var28) & (~var27 | ~var28);
            var28 = 2000219272;
            var27 = var10000;
            var10000 = var27 + var28 - 2 * (var27 & var28);
         }

         int var17 = var10000;
         var28 = -661659524;
         var27 = 14880396;
         var10000 = var27 + var28 - 2 * (var27 & var28);
         var28 = -663949584;
         var27 = var10000;
         int var18 = var27 + var28 - 2 * (var27 & var28);
         var28 = -225898148;
         var27 = 1351617290;
         var10000 = var27 + var28 - 2 * (var27 & var28);
         var28 = -1575413162;
         var27 = var10000;

         for (int var19 = var27 & ~var28 | ~var27 & var28; var19 < var9.length; var19++) {
            this.m.put(var19, var12);
            if (var19 != var10) {
               var28 = 1726730788;
               var27 = -1728106985;
               var10000 = (var27 | var28) & ~(var27 & var28);
               var28 = -32179149;
               var27 = var10000;
               var10000 = var27 & ~var28 | ~var27 & var28;
            } else {
               var28 = -591918523;
               var27 = -1766487267;
               var10000 = var27 + var28 - 2 * (var27 & var28);
               var28 = 1242399065;
               var27 = var10000;
               var10000 = var27 + var28 - 2 * (var27 & var28);
            }

            int var20 = var10000;
            if (var17 == 0 && GuiInput.a(var12, var13, this.l.get(var19), var14, var5, var6)) {
               var10000 = (int)847709845335085679L;
               var28 = -339223251;
               var27 = var10000;
               var10000 = var27 + var28 - 2 * (var27 & var28);
               var28 = 741187;
               var27 = var10000;
               var10000 = var27 & ~var28 | ~var27 & var28;
            } else {
               var28 = 187374854;
               var27 = 269562775;
               var10000 = (var27 | var28) & (~var27 | ~var28);
               var28 = 456797841;
               var27 = var10000;
               var10000 = var27 & ~var28 | ~var27 & var28;
            }

            int var21 = var10000;
            if (var21 != 0) {
               var10000 = var9.length;
               var10001 = (int)2879622589465770708L;
               var28 = 824759792;
               var27 = var10001;
               var10001 = (var27 | var28) & ~(var27 & var28);
               var28 = -849023195;
               var27 = var10001;
               if (var10000 > ((var27 | var28) & (~var27 | ~var28)) && var20 == 0) {
                  var10000 = (int)7067594688993931270L;
                  var28 = -1519351320;
                  var27 = var10000;
                  var10000 = var27 + var28 - 2 * (var27 & var28);
                  var28 = 547043823;
                  var27 = var10000;
                  var18 = (var27 | var28) - (var27 & var28);
               }
            }

            if (var17 != 0 && this.j.get(var19)) {
               AnimationState var326 = this.i.get(var19);
               var10002 = (int)-5266063005541699944L;
               var28 = -401533577;
               var27 = var10002;
               var10002 = (var27 | var28) & (~var27 | ~var28);
               var28 = 540014126;
               var27 = var10002;
               var10002 = ((var27 | var28) - (var27 & var28)) * ((var27 | var28) - (var27 & var28));
               var326.a(0.0, 0.15, pulse.Easing.h);
               Map var327 = this.j;
               Integer var348 = var19;
               var10002 = (int)-427422578492535208L;
               var28 = 492525208;
               var27 = var10002;
               var10002 = var27 + var28 - 2 * (var27 & var28);
               var28 = -224143168;
               var27 = var10002;
               var327.put(var348, Boolean.valueOf(pulse.Bool.from((var27 | var28) & (var27 & var28 ^ -1))));
            } else if (var17 != 0) {
               var28 = -99836799;
               var27 = 140941463;
               var10000 = (var27 | var28) & (~var27 | ~var28);
               var28 = 447337492;
               var27 = var10000;
               var10000 = ((var27 | var28) & ~(var27 & var28)) * ((var27 | var28) & ~(var27 & var28));
               var28 = -733517207;
               var27 = -385754397;
               var10000 = var27 & ~var28 | ~var27 & var28;
               var28 = 358007050;
               var27 = var10000;
               int var26 = var27 & ~var28 | ~var27 & var28;
               var10000 = (int)7772792700757736632L;
               var28 = 1540397378;
               var27 = var10000;
               var10000 = var27 + var28 - 2 * (var27 & var28);
               var28 = -846891505;
               var27 = var10000;
               var10000 = ((var27 | var28) - (var27 & var28)) * ((var27 | var28) - (var27 & var28));
               var10000 = (int)-444688169599043311L;
               var28 = -140641259;
               var27 = var10000;
               var10000 = var27 & ~var28 | ~var27 & var28;
               var28 = -399315213;
               var27 = var10000;
               if (((var27 | var28) & (~var27 | ~var28)) >= var26) {
                  throw new RuntimeException();
               }
            } else if (pulse.Bool.from(var21) != this.j.get(var19)) {
               AnimationState var325 = this.i.get(var19);
               double var347 = var21 == 0 ? 0.0 : 1.0;
               var28 = 1026436264;
               var27 = -1582865344;
               int var396 = (var27 | var28) - (var27 & var28);
               var28 = -1668724507;
               var27 = var396;
               int var397 = (var27 | var28) - (var27 & var28);
               int var398 = (int)3940216797137228112L;
               var28 = 732660614;
               var27 = var398;
               int var399 = (var27 | var28) - (var27 & var28);
               var28 = 684708561;
               var27 = var399;
               int var400 = var27 & ~var28 | ~var27 & var28;
               var28 = -2114375236;
               var27 = -1679756997;
               int var401 = (var27 | var28) & (~var27 | ~var28);
               var28 = 437895309;
               var27 = var401;
               int var402 = (var27 | var28) & ~(var27 & var28);
               var28 = 2004149042;
               var27 = -1203061934;
               int var403 = (var27 | var28) & (~var27 | ~var28);
               var28 = -817997726;
               var27 = var403;
               int var404 = var27 & ~var28 | ~var27 & var28;
               var325.a(var347, 0.15, pulse.Easing.h);
               this.j.put(var19, Boolean.valueOf(pulse.Bool.from(var21)));
            }

            if (pulse.Bool.from(var20) != this.k.get(var19)) {
               AnimationState var328 = this.h.get(var19);
               double var349 = var20 == 0 ? 0.0 : 1.0;
               var10002 = (int)-6683330729880725168L;
               var28 = 1907725689;
               var27 = var10002;
               var10002 = var27 + var28 - 2 * (var27 & var28);
               var28 = 150442696;
               var27 = var10002;
               var10002 = var27 & ~var28 | ~var27 & var28;
               int var405 = (int)-342627485924761807L;
               var28 = 957309760;
               var27 = var405;
               int var406 = (var27 | var28) - (var27 & var28);
               var28 = -1975983513;
               var27 = var406;
               var28 = (var27 | var28) & ~(var27 & var28);
               var27 = var10002;
               var10002 = (var27 | var28) + (var27 & var28);
               var328.a(var349, 0.2, pulse.Easing.h);
               this.k.put(var19, Boolean.valueOf(pulse.Bool.from(var20)));
            }

            this.h.get(var19).a();
            this.i.get(var19).a();
            float var22 = (float)this.h.get(var19).j();
            float var23 = (float)this.i.get(var19).j();
            var10000 = var9.length;
            var28 = -239964065;
            var27 = -1879604362;
            var10001 = (var27 | var28) & (~var27 | ~var28);
            var28 = 2118513448;
            var27 = var10001;
            Color var24;
            if (var10000 != (var27 & ~var28 | ~var27 & var28)) {
               var24 = ColorUtils.a(ColorUtils.a(pulse.Theme.b, g, var23 * (1.0F - var22)), pulse.Theme.aa, var22);
            } else {
               var24 = pulse.Theme.aa;
            }

            var8.a(var9[var19], var12, var13, var24, var1);
            var12 += this.l.get(var19);
            var10001 = var9.length;
            var10002 = (int)-8579842054271017412L;
            var28 = -640758109;
            var27 = var10002;
            var10002 = (var27 | var28) & ~(var27 & var28);
            var28 = -671543138;
            var27 = var10002;
            var28 = (var27 | var28) & ~(var27 & var28);
            var27 = var10001;
            if (var19 < 2 * (var27 & ~var28) - (var27 ^ var28)) {
               var28 = -1309640308;
               var27 = 1929745940;
               var10001 = var27 & ~var28 | ~var27 & var28;
               var28 = -1175943540;
               var27 = var10001;
               var10001 = var27 + var28 - 2 * (var27 & var28);
               var12 += 6.0F;
               var10002 = (int)2621631722881994112L;
               var28 = 1769267489;
               var27 = var10002;
               var10002 = (var27 | var28) - (var27 & var28);
               var28 = 523381924;
               var27 = var10002;
               var10002 = (var27 | var28) & (~var27 | ~var28);
               var10002 = (int)4049739373668974360L;
               var28 = -1964059433;
               var27 = var10002;
               var10002 = (var27 | var28) - (var27 & var28);
               var28 = -1969394752;
               var27 = var10002;
               var10002 = var27 + var28 - 2 * (var27 & var28);
               var28 = 860651711;
               var27 = 499519851;
               var10002 = (var27 | var28) & ~(var27 & var28);
               var28 = -1524380761;
               var27 = var10002;
               var10002 = ((var27 | var28) & (~var27 | ~var28)) * ((var27 | var28) & (~var27 | ~var28));
               var10003 = "wr";
               int var408 = (int)-1334583619665508586L;
               var28 = -779127890;
               var27 = var408;
               int var409 = (var27 | var28) & (~var27 | ~var28);
               var28 = 687049036;
               var27 = var409;
               int var410 = (var27 | var28) & (~var27 | ~var28);
               int var415 = (int)4006092278713665190L;
               var28 = -407925503;
               var27 = var415;
               int var416 = var27 & ~var28 | ~var27 & var28;
               var28 = -973282238;
               var27 = var416;
               int var417 = var27 & ~var28 | ~var27 & var28;
               var10005 = (int)-8610306758418032655L;
               var28 = -222913019;
               var27 = var10005;
               var10005 = (var27 | var28) & ~(var27 & var28);
               var28 = 706722203;
               var27 = var10005;
               var28 = (var27 | var28) & (~var27 | ~var28);
               var27 = var417;
               int var418 = (var27 ^ var28) + 2 * (var27 & var28);
               var28 = -1825962414;
               var27 = 798321860;
               int var419 = (var27 | var28) - (var27 & var28);
               var28 = 1223905105;
               var27 = var419;
               int var420 = (var27 | var28) & (~var27 | ~var28);
               var28 = -180089061;
               var27 = -1202010299;
               var10005 = var27 + var28 - 2 * (var27 & var28);
               var28 = 1827562618;
               var27 = var10005;
               var10005 = (var27 | var28) & (~var27 | ~var28);
               var10005 = (int)1007142362249968134L;
               var28 = -2068044051;
               var27 = var10005;
               var10005 = (var27 | var28) - (var27 & var28);
               var28 = -11799877;
               var27 = var10005;
               var10005 = var27 & ~var28 | ~var27 & var28;
               var28 = 2110190821;
               var27 = 969033732;
               var10007 = var27 & ~var28 | ~var27 & var28;
               var28 = 1141161188;
               var27 = var10007;
               var10007 = (var27 | var28) & (~var27 | ~var28);
               var10007 = (int)-4602593430928918936L;
               var28 = 787011681;
               var27 = var10007;
               var10007 = (var27 | var28) & ~(var27 & var28);
               var28 = -788025847;
               var27 = var10007;
               var10007 = (var27 | var28) & ~(var27 & var28);
               var10007 = (int)8571857932180042176L;
               var28 = 1469492835;
               var27 = var10007;
               var10007 = (var27 | var28) - (var27 & var28);
               var28 = -14540886;
               var27 = var10007;
               var10007 = (var27 | var28) - (var27 & var28);
               var10006 = (int)-2168579755914609882L;
               var28 = 538500632;
               var27 = var10006;
               var10006 = var27 & ~var28 | ~var27 & var28;
               var28 = -1110457597;
               var27 = var10006;
               var8.a(
                  b("ﱍ", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謴㑸\u007f\ua7eb꒺ꁿꥊ終蹋⑸謤㑒~\ua7e3꒸ꁴꤋ絢", var410, var420, var10005, (var27 | var28) & ~(var27 & var28)),
                  var12,
                  var13,
                  pulse.Theme.b,
                  var1
               );
               String var389 = "ws";
               var12 += var11 + 6.0F;
            }
         }

         if (var18 != 0) {
            if (var17 != 0) {
               var28 = -110924629;
               var27 = -1767568015;
               var10001 = (var27 | var28) & ~(var27 & var28);
               var28 = 1875272147;
               var27 = var10001;
               var10001 = var27 + var28 - 2 * (var27 & var28);
               var28 = -215051992;
               var27 = 1961944548;
               var10000 = (var27 | var28) - (var27 & var28);
               var28 = -869634256;
               var27 = var10000;
               int var32 = var27 & ~var28 | ~var27 & var28;
               a = var32;
               var10000 = (int)-199703850593403554L;
               var28 = -2085119915;
               var27 = var10000;
               var10000 = (var27 | var28) & ~(var27 & var28);
               var28 = -1592344128;
               var27 = var10000;
               var10000 = (var27 + var28 - 2 * (var27 & var28)) * (var27 + var28 - 2 * (var27 & var28));
               var28 = 1803377168;
               var27 = -1278987916;
               var10000 = (var27 | var28) - (var27 & var28);
               var28 = -2130712381;
               var27 = var10000;
               if (var27 + var28 - 2 * (var27 & var28) < a) {
                  var28 = 655486432;
                  var27 = 1404927803;
                  var10000 = var27 & ~var28 | ~var27 & var28;
                  var28 = 1957466843;
                  var27 = var10000;
                  var10000 = (var27 | var28) & ~(var27 & var28);
                  var10001 = (int)-4612620779860505073L;
                  var28 = -211342953;
                  var27 = var10001;
                  var10001 = var27 + var28 - 2 * (var27 & var28);
                  var28 = 397633432;
                  var27 = var10001;
                  var10000 /= var27 & ~var28 | ~var27 & var28;
               }
            } else {
               GuiInput.g();
            }
         }

         var28 = 1295886678;
         var27 = 1321400000;
         var10001 = (var27 | var28) & (~var27 | ~var28);
         var28 = -458861308;
         var27 = var10001;
         var10001 = var27 + var28 - 2 * (var27 & var28);
         float var31 = var4 + 35.5F;
         float var360 = (int)var3;
         var28 = 349768272;
         var27 = -1854146063;
         var10002 = (var27 | var28) & (~var27 | ~var28);
         var28 = -379121375;
         var27 = var10002;
         var10002 = ((var27 | var28) & (~var27 | ~var28)) * ((var27 | var28) & (~var27 | ~var28));
         float var361 = var360 + 19.0F;
         float var392 = (int)var31;
         var28 = 1754847362;
         var27 = -436937644;
         int var421 = (var27 | var28) & (~var27 | ~var28);
         var28 = 339463818;
         var27 = var421;
         int var422 = var27 + var28 - 2 * (var27 & var28);
         var28 = -367232192;
         var27 = 1405924012;
         var10005 = var27 & ~var28 | ~var27 & var28;
         var28 = 1768350946;
         var27 = var10005;
         var28 = (var27 | var28) - (var27 & var28);
         var27 = var422;
         int var423 = 2 * (var27 | var28) - (var27 ^ var28);
         float var411 = var7 - 38.0F;
         var10004 = "wt";
         var28 = -1318916903;
         var27 = -165983622;
         var10006 = (var27 | var28) & ~(var27 & var28);
         var28 = 1199154874;
         var27 = var10006;
         var2.a(var361, var392, var411, 0.5F, pulse.Theme.a(pulse.Theme.aa, (var27 | var28) - (var27 & var28)), var1);
      }
   }

   @Override
   public void a(float var1, float var2, int var3, int var4) {
      if (GuiInput.a(GuiLayerRegistry.Layer.TABS, var3, var4)) {
         if (!GuiInteractionState.a().b()) {
            String[] var5 = this.c.c();
            int var10000 = var5.length;
            int var10001 = (int)-5814660253963674019L;
            int var15 = -1500730473;
            int var14 = var10001;
            var10001 = var14 & ~var15 | ~var14 & var15;
            var15 = -698010165;
            var14 = var10001;
            if (var10000 > ((var14 | var15) & (~var14 | ~var15))) {
               var15 = -760786686;
               var14 = -702711466;
               var10001 = (var14 | var15) & ~(var14 & var15);
               var15 = 79308890;
               var14 = var10001;
               FontRenderer var6 = FontManager.b[(var14 | var15) & (~var14 | ~var15)];
               var10001 = (int)-844755630414159933L;
               var15 = -1257457162;
               var14 = var10001;
               var10001 = (var14 | var15) & ~(var14 & var15);
               var15 = -907472434;
               var14 = var10001;
               var10001 = (var14 | var15) & (~var14 | ~var15);
               float var7 = var2 + 19.0F;
               var10000 = (int)-4475353086963450515L;
               var15 = 606352793;
               var14 = var10000;
               var10000 = (var14 | var15) & ~(var14 & var15);
               var15 = 702008709;
               var14 = var10000;
               var10000 = var14 & ~var15 | ~var14 & var15;
               float var8 = 7.0F;
               var15 = -1401864032;
               var14 = -622413495;
               var10000 = var14 + var15 - 2 * (var14 & var15);
               var15 = 1989671401;
               var14 = var10000;

               for (int var9 = (var14 | var15) & ~(var14 & var15); var9 < var5.length; var9++) {
                  Float var10 = this.m.get(var9);
                  Float var11 = this.l.get(var9);
                  if (var10 != null && var11 != null) {
                     if (GuiInput.a(var10, var7, var11, var8, var3, var4)) {
                        this.c.a(var9);
                        break;
                     }

                     if (b) {
                        var15 = -409714340;
                        var14 = 1525590932;
                        var10000 = var14 + var15 - 2 * (var14 & var15);
                        var15 = 426221341;
                        var14 = var10000;
                        var10000 = ((var14 | var15) - (var14 & var15)) * ((var14 | var15) - (var14 & var15));
                        var10000 = (int)6481374012243049360L;
                        var15 = -2051061225;
                        var14 = var10000;
                        var10000 = var14 & ~var15 | ~var14 & var15;
                        var15 = 558550031;
                        var14 = var10000;
                        int var13 = (var14 | var15) & (~var14 | ~var15);
                        a = var13;
                     }
                  }
               }
            }
         }
      }
   }

   public static String b(String var0, String var1, int var2, int var3, int var4, int var5) {
      char[] var6 = var1.toCharArray();
      char[] var7 = new char[var6.length];
      int var20 = -1354564141;
      int var19 = -1305395252;
      int var10000 = (var19 | var20) & (~var19 | ~var20);
      var20 = 494125589;
      var19 = var10000;
      char[] var279 = new char[var19 & ~var20 | ~var19 & var20];
      int var10002 = (int)1291328919479935167L;
      var20 = -1836378601;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = -280922456;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      int var10003 = (int)-322902199146734528L;
      var20 = -147374019;
      var19 = var10003;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = -711093169;
      var19 = var10003;
      var279[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      var10002 = (int)-8911028693245509301L;
      var20 = -1740135322;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = 596534572;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var10003 = (int)5621142652357479074L;
      var20 = -1951918740;
      var19 = var10003;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = 1513667659;
      var19 = var10003;
      var279[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      var20 = 1791013700;
      var19 = -717536992;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = -1074007450;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = 1604836317;
      var19 = -1018147457;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = -1661487836;
      var19 = var10003;
      var279[var10002] = (char)((var19 | var20) - (var19 & var20));
      var10002 = (int)1121697777971533773L;
      var20 = -2015971227;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = 645935019;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = 174167947;
      var19 = 625794897;
      int var10004 = (var19 | var20) & ~(var19 & var20);
      var20 = 791496913;
      var19 = var10004;
      var10004 = (var19 | var20) - (var19 & var20);
      var10004 = (int)8636594098746759610L;
      var20 = -1625033595;
      var19 = var10004;
      var10004 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1646980406;
      var19 = var10004;
      var10004 = (var19 | var20) & (~var19 | ~var20);
      var20 = -1781413434;
      var19 = -240718697;
      var10004 = var19 & ~var20 | ~var19 & var20;
      var20 = 1685529940;
      var19 = var10004;
      var10004 = (var19 | var20) & (~var19 | ~var20);
      var20 = 1358221318;
      var19 = 1210447970;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = 416395383;
      var19 = var10003;
      var279[var10002] = (char)((var19 | var20) - (var19 & var20));
      var10002 = (int)4491085280392306845L;
      var20 = -641516565;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = 1342692210;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var10003 = (int)-2604616461887885609L;
      var20 = -1848511090;
      var19 = var10003;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = 527479405;
      var19 = var10003;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = -1108419154;
      var19 = 1424000561;
      var10004 = (var19 | var20) & (~var19 | ~var20);
      var20 = 648913843;
      var19 = var10004;
      var20 = var19 & ~var20 | ~var19 & var20;
      var19 = var10003;
      var10003 = (var19 & ~var20) + (var20 & ~var19) + 2 * (var19 & var20);
      var20 = -1329068265;
      var19 = 36989780;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = -1292042906;
      var19 = var10003;
      var279[var10002] = (char)((var19 | var20) & ~(var19 & var20));
      var20 = 698954614;
      var19 = 1496720151;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = 1889472612;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var10003 = (int)2047565665500952270L;
      var20 = -1322975666;
      var19 = var10003;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = 1667026178;
      var19 = var10003;
      var279[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      var10002 = (int)-5912532708532701636L;
      var20 = 108656105;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = -545373229;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = 547407312;
      var19 = 472475907;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1015653824;
      var19 = var10003;
      var279[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      var20 = -457460453;
      var19 = -1707625727;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = 2123105821;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = 1704196292;
      var19 = -1738953990;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = -37067236;
      var19 = var10003;
      var279[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      var20 = 1165959435;
      var19 = 271322501;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1431514246;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = 721949632;
      var19 = 1951786292;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = 1599995559;
      var19 = var10003;
      var279[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      var20 = 314140526;
      var19 = 257092476;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = 501976091;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = 957920104;
      var19 = 1524126109;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = 1673586129;
      var19 = var10003;
      var279[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      char[] var8 = var279;
      var20 = 1458177012;
      var19 = -543250482;
      var10000 = (var19 | var20) & (~var19 | ~var20);
      var20 = -1988844496;
      var19 = var10000;
      char[] var281 = new char[var19 + var20 - 2 * (var19 & var20)];
      var20 = -1513920127;
      var19 = 579727691;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = -2024892214;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = -2096623045;
      var19 = 105836975;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = -2058966092;
      var19 = var10003;
      var281[var10002] = (char)((var19 | var20) - (var19 & var20));
      var10002 = (int)-2711665233444501666L;
      var20 = 614425306;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = 1985799557;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var10003 = (int)-4133606512721448028L;
      var20 = 560958698;
      var19 = var10003;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = 520048977;
      var19 = var10003;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = 2123124880;
      var19 = -1792629593;
      var10004 = var19 & ~var20 | ~var19 & var20;
      var20 = 1523519075;
      var19 = var10004;
      var20 = var19 + var20 - 2 * (var19 & var20);
      var19 = var10003;
      var10003 = 2 * (var19 | var20) - (var19 ^ var20);
      var10003 = (int)603074214262845111L;
      var20 = -1506295277;
      var19 = var10003;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = -597497689;
      var19 = var10003;
      var281[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      var20 = 1633077024;
      var19 = -1357948102;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = -832988136;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = -525320063;
      var19 = 700189902;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = 27009325;
      var19 = var10003;
      var10003 = (var19 & ~var20 | ~var19 & var20) * (var19 & ~var20 | ~var19 & var20);
      var20 = 288801020;
      var19 = -1919864908;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = -1666750437;
      var19 = var10003;
      var281[var10002] = (char)((var19 | var20) - (var19 & var20));
      var10002 = (int)-5156326727096202764L;
      var20 = 1097865672;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = 2095321151;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var10003 = (int)-6810106819984541300L;
      var20 = -2110284052;
      var19 = var10003;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = 1114414946;
      var19 = var10003;
      var281[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      var20 = 1015595563;
      var19 = 1265299619;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = 2011312780;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = 1317633857;
      var19 = -1232905032;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = -133555271;
      var19 = var10003;
      var281[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      var10002 = (int)-7185231516390162851L;
      var20 = 161522079;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = 893378503;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = -211666951;
      var19 = -1503598424;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = 1426253765;
      var19 = var10003;
      var281[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      var10002 = (int)-3730438104973257034L;
      var20 = 2040150028;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = -1847136580;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var10003 = (int)-3453358075757515546L;
      var20 = -1186950742;
      var19 = var10003;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = 844911844;
      var19 = var10003;
      var10003 = (var19 & ~var20 | ~var19 & var20) * (var19 & ~var20 | ~var19 & var20);
      var10003 = (int)-8262238440509017114L;
      var20 = 605773362;
      var19 = var10003;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = -67491091;
      var19 = var10003;
      var281[var10002] = (char)((var19 | var20) - (var19 & var20));
      var10002 = (int)-5481288359683681159L;
      var20 = -2018900915;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = -1372057549;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = -866454039;
      var19 = -260381271;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = 1008730232;
      var19 = var10003;
      var281[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      var10002 = (int)-3508726701555164777L;
      var20 = -410368112;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = 1282022927;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var10003 = (int)3281811848083481848L;
      var20 = 2114099740;
      var19 = var10003;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = 943439199;
      var19 = var10003;
      var10003 = (var19 + var20 - 2 * (var19 & var20)) * (var19 + var20 - 2 * (var19 & var20));
      var20 = 269290533;
      var19 = 1818502303;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = 2087300030;
      var19 = var10003;
      var281[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      var20 = -311645770;
      var19 = -1718013621;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = 1962252532;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var10003 = (int)-11227736266046367L;
      var20 = 1436501237;
      var19 = var10003;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = -1515949145;
      var19 = var10003;
      var281[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      char[] var9 = var281;
      var20 = -1636264120;
      var19 = -556625273;
      var10000 = (var19 | var20) & ~(var19 & var20);
      var20 = 1084884431;
      var19 = var10000;
      int var10 = (var19 | var20) - (var19 & var20);
      if (b) {
         var10000 = (int)-5843622474232657736L;
         var20 = 1380806522;
         var19 = var10000;
         var10000 = (var19 | var20) - (var19 & var20);
         var20 = -58557088;
         var19 = var10000;
         var10000 = var19 + var20 - 2 * (var19 & var20);
         int var10001 = (int)3388980483972387263L;
         var20 = 911710243;
         var19 = var10001;
         var10001 = (var19 | var20) & ~(var19 & var20);
         var20 = -1113989149;
         var19 = var10001;
         var20 = (var19 | var20) & ~(var19 & var20);
         var19 = var10000;
         var10000 = (var19 | var20) + (var19 & var20);
         var20 = 161020622;
         var19 = 166063022;
         var10000 = (var19 | var20) & (~var19 | ~var20);
         var20 = 1626309372;
         var19 = var10000;
         int var18 = var19 + var20 - 2 * (var19 & var20);
      }

      while (var10 < var6.length) {
         char var346 = var6[var10];
         char var265 = var8[var10 % var8.length];
         char var137 = var346;
         var7[var10] = (char)(var137 + var265 - 2 * (var137 & var265));
         var10++;
      }

      char[] var21 = new char[var7.length];
      var10000 = (int)5242560780090987050L;
      var20 = -2025203083;
      var19 = var10000;
      var10000 = var19 & ~var20 | ~var19 & var20;
      var20 = 1442711647;
      var19 = var10000;

      for (int var11 = var19 + var20 - 2 * (var19 & var20); var11 < var6.length; var11++) {
         char var347 = var7[var11];
         char var268 = var9[var11 % var9.length];
         char var140 = var347;
         var21[var11] = (char)((var140 | var268) & (~var140 | ~var268));
      }

      String var22 = new String(var21);
      int var12 = var22.hashCode();
      var20 = var5;
      var19 = var3;
      var10000 = (var19 & ~var20) - (~var19 & var20);
      var20 = var2;
      var19 = var10000;
      int var13 = (var19 & ~var20) - (~var19 & var20);
      char[] var14 = var0.toCharArray();
      char[] var15 = new char[var14.length];
      var10000 = (int)4843485850966592316L;
      var20 = -2073157840;
      var19 = var10000;
      var10000 = (var19 | var20) - (var19 & var20);
      var20 = -1324313588;
      var19 = var10000;

      for (int var16 = (var19 | var20) - (var19 & var20); var16 < var15.length; var16++) {
         int var294 = (int)-4079156824077737814L;
         var20 = -330049526;
         var19 = var294;
         var294 = (var19 | var20) & (~var19 | ~var20);
         var20 = -101730142;
         var19 = var294;
         switch (var16 % (var19 + var20 - 2 * (var19 & var20))) {
            case 0:
               var20 = var12;
               var19 = var13;
               var10002 = var19 + var20 - 2 * (var19 & var20);
               char var278 = var14[var16];
               var19 = var10002;
               var15[var16] = (char)(var19 & ~var278 | ~var19 & var278);
               break;
            case 1:
               var20 = var13;
               var19 = var5;
               var10002 = (var19 | var20) - (var19 & var20);
               char var276 = var14[var16];
               var19 = var10002;
               var15[var16] = (char)((var19 | var276) & (~var19 | ~var276));
         }
      }

      return new String(var15);
   }
}
