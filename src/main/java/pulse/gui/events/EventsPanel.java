package pulse;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import net.minecraft.client.util.math.MatrixStack;
import org.json.JSONArray;
import org.json.JSONObject;

public class EventsPanel {
   private static final float a = 6.0F;
   private static final float b = 3.0F;
   private static final float c = 3.0F;
   private static final float d = 2.0F;
   private final List<EventInfo> e = new ArrayList<>();
   private final List<EventInfo> f = new ArrayList<>();
   private final List<EventInfo> g = new ArrayList<>();
   private final List<EventCard> h = new ArrayList<>();
   private final List<EventCard> i = new ArrayList<>();
   private final List<EventCard> j = new ArrayList<>();
   private final ScrollBar k;
   private final PanelFadeOverlay l;
   private int m;
   private String n;
   private float o;
   private float p;
   private float q;
   private float r;
   private Consumer<EventInfo> s;

   public EventsPanel() {
      int var2 = -1056297172;
      int var1 = 1068486301;
      int var10001 = (var1 | var2) - (var1 & var2);
      var2 = -22683215;
      var1 = var10001;
      this.m = (var1 | var2) - (var1 & var2);
      int var10003 = (int)-813849076798442858L;
      var2 = 1325058286;
      var1 = var10003;
      var10003 = (var1 | var2) - (var1 & var2);
      var2 = 2139951445;
      var1 = var10003;
      var10003 = (var1 | var2) & (~var1 | ~var2);
      int var10004 = (int)5785187579795224638L;
      var2 = -759894866;
      var1 = var10004;
      var10004 = var1 + var2 - 2 * (var1 & var2);
      var2 = 342383872;
      var1 = var10004;
      var10004 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1363487515;
      var1 = -430531189;
      int var10005 = (var1 | var2) - (var1 & var2);
      var2 = 1177933315;
      var1 = var10005;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var2 = 678514682;
      var1 = 618586876;
      int var10006 = var1 + var2 - 2 * (var1 & var2);
      var2 = 210843383;
      var1 = var10006;
      this.n = a("", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁴꤓ絳蹄⑮謤㐸W\ua7f0꒰ꁿꤑ絥蹦⑳謤㑣B\ua7e7꒻ꁴ꤉", var10003, var10004, var10005, (var1 | var2) - (var1 & var2));
      this.k = new ScrollBar(2.0F, 20.0F);
      this.k.b(10.0F);
      this.k.a(pulse.Theme.b);
      this.k.b(pulse.Theme.d);
      var2 = 762553567;
      var1 = -569648759;
      var10003 = (var1 | var2) & ~(var1 & var2);
      var2 = -210207409;
      var1 = var10003;
      this.l = new PanelFadeOverlay((var1 | var2) & ~(var1 & var2), 5.0F, 9.0F);
   }

   public void a(Consumer<EventInfo> var1) {
      this.s = var1;
   }

   public void a(EventInfo var1) {
      this.e.add(var1);
      EventCard var2 = new EventCard(var1);
      var2.a(this::d);
      this.h.add(var2);
   }

   public void b(EventInfo var1) {
      this.f.add(var1);
      EventCard var2 = new EventCard(var1);
      var2.a(this::d);
      this.i.add(var2);
   }

   public void c(EventInfo var1) {
      this.g.add(var1);
      EventCard var2 = new EventCard(var1);
      var2.a(this::d);
      this.j.add(var2);
   }

   public void a() {
      this.e.clear();
      this.f.clear();
      this.g.clear();
      this.h.clear();
      this.i.clear();
      this.j.clear();
      this.k.e();
   }

   public void b() {
      this.a(this.e, this.h);
      this.a(this.f, this.i);
      this.a(this.g, this.j);
   }

   private void a(List<EventInfo> var1, List<EventCard> var2) {
      int var10000 = var1.size();
      int var10001 = (int)-8627293965013858894L;
      int var9 = -1724887747;
      int var8 = var10001;
      var10001 = var8 + var9 - 2 * (var8 & var9);
      var9 = -1152776050;
      var8 = var10001;
      if (var10000 > var8 + var9 - 2 * (var8 & var9)) {
         ArrayList<int[]> var3 = new ArrayList<>();
         var9 = -841839859;
         var8 = 1667432884;
         var10000 = (var8 | var9) - (var8 & var9);
         var9 = -1364096327;
         var8 = var10000;

         for (int var4 = (var8 | var9) & (~var8 | ~var9); var4 < var1.size(); var4++) {
            var10001 = (int)3109267025592956625L;
            var9 = 1367226169;
            var8 = var10001;
            var10001 = (var8 | var9) & (~var8 | ~var9);
            var9 = -1926004246;
            var8 = var10001;
            int[] var41 = new int[(var8 | var9) & ~(var8 & var9)];
            int var10003 = (int)6470796592892950963L;
            var9 = -945126026;
            var8 = var10003;
            var10003 = (var8 | var9) & (~var8 | ~var9);
            var9 = 1788591301;
            var8 = var10003;
            var41[(var8 | var9) & ~(var8 & var9)] = var4;
            var10003 = (int)4542418314092569001L;
            var9 = -1548364674;
            var8 = var10003;
            var10003 = (var8 | var9) & (~var8 | ~var9);
            var9 = 1929557462;
            var8 = var10003;
            var41[(var8 | var9) & (~var8 | ~var9)] = ((EventInfo)var1.get(var4)).f();
            var3.add(var41);
         }

         var3.sort((var0, var1x) -> {
            int var10001x = (int)-1673455189811741364L;
            int var3x = -429161794;
            int var2x = var10001x;
            var10001x = var2x + var3x - 2 * (var2x & var3x);
            var3x = -505987085;
            var2x = var10001x;
            int var10000x = var0[(var2x | var3x) - (var2x & var3x)];
            var3x = -1638690771;
            var2x = 276872233;
            int var10002 = var2x & ~var3x | ~var2x & var3x;
            var3x = -1898763259;
            var2x = var10002;
            return Integer.compare(var10000x, var1x[var2x & ~var3x | ~var2x & var3x]);
         });
         ArrayList<EventInfo> var10 = new ArrayList<>();
         ArrayList<EventCard> var5 = new ArrayList<>();

         for (int[] var7 : var3) {
            var9 = -244899924;
            var8 = 642627439;
            int var45 = (var8 | var9) & (~var8 | ~var9);
            var9 = -685070141;
            var8 = var45;
            var10.add((EventInfo)var1.get(var7[(var8 | var9) & ~(var8 & var9)]));
            var9 = -201114137;
            var8 = 33004589;
            var45 = var8 & ~var9 | ~var8 & var9;
            var9 = -168517174;
            var8 = var45;
            var5.add((EventCard)var2.get(var7[var8 & ~var9 | ~var8 & var9]));
         }

         var1.clear();
         var1.addAll(var10);
         var2.clear();
         var2.addAll(var5);
      }
   }

   public void a(int var1, AccountServiceClient var2) {
   }

   private void a(List<EventInfo> var1, List<EventCard> var2, JSONArray var3, int var4) {
      int var10000 = var1.size();
      int var10 = 1794391486;
      int var9 = 219297779;
      int var10001 = (var9 | var10) - (var9 & var10);
      var10 = 1743129164;
      var9 = var10001;
      var10 = var9 & ~var10 | ~var9 & var10;
      var9 = var10000;

      for (int var5 = (var9 ^ var10) - 2 * (~var9 & var10); var5 >= 0; var5--) {
         EventInfo var6 = (EventInfo)var1.get(var5);
         int var7 = this.a(var3, var6.b());
         if (var7 > 0) {
            var10 = var4;
            var9 = var7;
            int var8 = 2 * (var9 & ~var10) - (var9 ^ var10);
            if (var8 <= 0) {
               var1.remove(var5);
               var2.remove(var5);
            } else {
               var6.a(var8);
            }
         }
      }
   }

   private int a(JSONArray var1, int var2) {
      try {
         int var8 = 1113903482;
         int var7 = 721660922;
         int var10000 = var7 & ~var8 | ~var7 & var8;
         var8 = 1768389248;
         var7 = var10000;

         for (int var3 = (var7 | var8) & ~(var7 & var8); var3 < var1.length(); var3++) {
            JSONObject var4 = var1.getJSONObject(var3);
            var8 = -612448764;
            var7 = 1325753416;
            int var10003 = (var7 | var8) & (~var7 | ~var8);
            var8 = 967461217;
            var7 = var10003;
            var10003 = var7 & ~var8 | ~var7 & var8;
            var8 = -1166128297;
            var7 = 251367459;
            int var10004 = (var7 | var8) - (var7 & var8);
            var8 = -1640885218;
            var7 = var10004;
            var10004 = (var7 | var8) & ~(var7 & var8);
            int var10005 = (int)-6649999835380076601L;
            var8 = -92990186;
            var7 = var10005;
            var10005 = (var7 | var8) & (~var7 | ~var8);
            var8 = -217733181;
            var7 = var10005;
            var10005 = var7 & ~var8 | ~var7 & var8;
            int var10006 = (int)-4871103789568305119L;
            var8 = -1196882842;
            var7 = var10006;
            var10006 = var7 & ~var8 | ~var7 & var8;
            var8 = -436028447;
            var7 = var10006;
            String var5 = var4.getString(
               a("韉᭔韈ᭇ韟ᭃ", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁴꤓ絳蹄⑮謤㐸W\ua7f0꒰ꁿꤑ絥蹦⑳謤㑣B\ua7e7꒻ꁴ꤉", var10003, var10004, var10005, (var7 | var8) & ~(var7 & var8))
            );
            var8 = -289902968;
            var7 = 1420019823;
            var10003 = var7 & ~var8 | ~var7 & var8;
            var8 = 399134154;
            var7 = var10003;
            var10003 = (var7 | var8) - (var7 & var8);
            var10004 = (int)-6279056893851001347L;
            var8 = 221704087;
            var7 = var10004;
            var10004 = (var7 | var8) & ~(var7 & var8);
            var8 = -92817761;
            var7 = var10004;
            var10004 = (var7 | var8) - (var7 & var8);
            var10005 = (int)2203751070525014862L;
            var8 = -1834508027;
            var7 = var10005;
            var10005 = (var7 | var8) & (~var7 | ~var8);
            var8 = -1104455660;
            var7 = var10005;
            var10005 = (var7 | var8) - (var7 & var8);
            var10006 = (int)-7473473687198832698L;
            var8 = 692226076;
            var7 = var10006;
            var10006 = (var7 | var8) - (var7 & var8);
            var8 = 1026536171;
            var7 = var10006;
            String var10001 = a(
               "韡ꇸ鞊ꆋ鞃ꇻ", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁴꤓ絳蹄⑮謤㐸W\ua7f0꒰ꁿꤑ絥蹦⑳謤㑣B\ua7e7꒻ꁴ꤉", var10003, var10004, var10005, (var7 | var8) & (~var7 | ~var8)
            );
            var8 = -269922087;
            var7 = 183971831;
            var10004 = (var7 | var8) & (~var7 | ~var8);
            var8 = 1221563395;
            var7 = var10004;
            var10004 = var7 & ~var8 | ~var7 & var8;
            var10005 = (int)1880986022427226422L;
            var8 = 1506751188;
            var7 = var10005;
            var10005 = (var7 | var8) & (~var7 | ~var8);
            var8 = 1026220991;
            var7 = var10005;
            var10005 = (var7 | var8) & ~(var7 & var8);
            var10006 = (int)-7880385394584518833L;
            var8 = -1245718078;
            var7 = var10006;
            var10006 = var7 & ~var8 | ~var7 & var8;
            var8 = -324614122;
            var7 = var10006;
            var10006 = (var7 | var8) & ~(var7 & var8);
            int var10007 = (int)-7880019652036232759L;
            var8 = 942390254;
            var7 = var10007;
            var10007 = var7 + var8 - 2 * (var7 & var8);
            var8 = 1364622014;
            var7 = var10007;
            int var6 = Integer.parseInt(
               var5.replaceAll(
                  var10001,
                  a("", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁴꤓ絳蹄⑮謤㐸W\ua7f0꒰ꁿꤑ絥蹦⑳謤㑣B\ua7e7꒻ꁴ꤉", var10004, var10005, var10006, (var7 | var8) & (~var7 | ~var8))
               )
            );
            if (var6 == var2) {
               var10003 = (int)2116766715983354229L;
               var8 = -1881270926;
               var7 = var10003;
               var10003 = var7 & ~var8 | ~var7 & var8;
               var8 = -796842198;
               var7 = var10003;
               var10003 = var7 + var8 - 2 * (var7 & var8);
               var8 = -1732455632;
               var7 = 868716361;
               var10004 = var7 + var8 - 2 * (var7 & var8);
               var8 = -2121511932;
               var7 = var10004;
               var10004 = (var7 | var8) & (~var7 | ~var8);
               var8 = 1890412959;
               var7 = 2096750024;
               var10005 = var7 & ~var8 | ~var7 & var8;
               var8 = 205550978;
               var7 = var10005;
               var10005 = var7 & ~var8 | ~var7 & var8;
               var8 = -634475727;
               var7 = -1449558823;
               var10006 = (var7 | var8) - (var7 & var8);
               var8 = 1944420177;
               var7 = var10006;
               return var4.getInt(
                  a(
                     "韎푇韗푋韩푋韙푁韔푊韉",
                     "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁴꤓ絳蹄⑮謤㐸W\ua7f0꒰ꁿꤑ絥蹦⑳謤㑣B\ua7e7꒻ꁴ꤉",
                     var10003,
                     var10004,
                     var10005,
                     (var7 | var8) & (~var7 | ~var8)
                  )
               );
            }
         }
      } catch (Exception var9) {
      }

      int var78 = 837095876;
      int var43 = -1198008904;
      int var80 = var43 & ~var78 | ~var43 & var78;
      var78 = 1988967299;
      var43 = var80;
      return (var43 | var78) & ~(var43 & var78);
   }

   private void d(EventInfo var1) {
      if (this.s != null) {
         this.s.accept(var1);
      }
   }

   public void a(int var1) {
      if (this.m != var1) {
         this.m = var1;
         this.k.e();
      }
   }

   public void a(String var1) {
      this.n = var1.toLowerCase().trim();
      this.k.e();
   }

   private List<EventCard> e() {
      List<EventCard> var1 = switch (this.m) {
         case 0 -> this.h;
         case 1 -> this.i;
         case 2 -> this.j;
         default -> this.h;
      };
      return this.n.isEmpty()
         ? new ArrayList<>(var1)
         : var1.stream()
            .filter(
               var1x -> {
                  EventInfo var2 = var1x.a();
                  int var12;
                  if (!var2.a().toLowerCase().contains(this.n)
                     && !String.valueOf(var2.b()).contains(this.n)
                     && (var2.i() == null || !var2.i().toLowerCase().contains(this.n))
                     && (var2.d() == null || !var2.d().a().toLowerCase().contains(this.n))
                     && (var2.e() == null || !var2.e().a().toLowerCase().contains(this.n))) {
                     var12 = (int)-1368799856516314881L;
                     int var9 = -1465242210;
                     int var6 = var12;
                     var12 = (var6 | var9) - (var6 & var9);
                     var9 = -149461663;
                     var6 = var12;
                     var12 = var6 & ~var9 | ~var6 & var9;
                  } else {
                     var12 = (int)107625265934206808L;
                     int var4 = -400237897;
                     int var3 = var12;
                     var12 = (var3 | var4) & ~(var3 & var4);
                     var4 = 418995694;
                     var3 = var12;
                     var12 = var3 & ~var4 | ~var3 & var4;
                  }

                  return pulse.Bool.from(var12);
               }
            )
            .collect(Collectors.toList());
   }

   public boolean c() {
      switch (this.m) {
         case 0:
            return this.e.isEmpty();
         case 1:
            return this.f.isEmpty();
         case 2:
            return this.g.isEmpty();
         default:
            int var2 = -844310942;
            int var1 = 238097261;
            int var10000 = (var1 | var2) & ~(var1 & var2);
            var2 = -1013070578;
            var1 = var10000;
            return pulse.Bool.from((var1 | var2) - (var1 & var2));
      }
   }

   public void a(MatrixStack var1, Renderer2D var2, float var3, float var4, float var5, float var6, int var7, int var8, float var9) {
      this.o = var3;
      this.p = var4;
      this.q = var5;
      this.r = var6;
      this.k.a();
      List<EventCard> var10 = this.e();
      if (var10.isEmpty()) {
         this.a(var1, var2, var3, var4, var5, var6);
      } else {
         float var11 = var4 + 3.0F;
         float var12 = var6 - 3.0F - 3.0F;
         float var13 = this.a(var10);
         int var42;
         if (var13 > var12) {
            int var22 = 1168485896;
            int var21 = 197966927;
            var42 = (var21 | var22) - (var21 & var22);
            var22 = 1315508806;
            var21 = var42;
            var42 = var21 + var22 - 2 * (var21 & var22);
         } else {
            var42 = (int)-876416470351330447L;
            int var34 = -856853219;
            int var25 = var42;
            var42 = var25 & ~var34 | ~var25 & var34;
            var34 = -712690068;
            var25 = var42;
            var42 = (var25 | var34) - (var25 & var34);
         }

         int var14 = var42;
         if (var14 == 0) {
            this.k.e();
         }

         var42 = (int)-6987080155016489137L;
         int var36 = 1699640352;
         int var27 = var42;
         var42 = (var27 | var36) & ~(var27 & var36);
         var36 = 1514267499;
         var27 = var42;
         int var15 = (var27 | var36) - (var27 & var36);
         ScissorStack var47 = var2.b();
         float var10002 = var4 + var15 / 2.0F;
         var36 = -1495165655;
         var27 = 227295905;
         int var10006 = var27 + var36 - 2 * (var27 & var36);
         var36 = -1418864758;
         var27 = var10006;
         var47.a(var3, var10002, var5, var6 - var15 * (var27 & ~var36 | ~var27 & var36), var1);
         float var16 = var11 - this.k.b();
         float var17 = var3 + 1.0F;
         float var18 = var5 - 2.0F;

         for (EventCard var20 : var10) {
            if (var16 + 36.5F >= var11 && var16 <= var11 + var12) {
               var20.a(var1, var2, var17, var16, var18, var7, var8, var9);
            }

            var16 += 42.5F;
         }

         var2.b().a(var1);
         if (var14 != 0) {
            float var23 = var3 + var5 + 18.0F;
            var36 = 863056343;
            var27 = -1125767059;
            int var10010 = var27 & ~var36 | ~var27 & var36;
            var36 = -1885922886;
            var27 = var10010;
            this.k.a(var1, var2, var23, var11, var12, var13, var12, var7, var8, pulse.Bool.from((var27 | var36) & (var27 & var36 ^ -1)));
         }

         this.l.a(var1, var2, var3, var4 + 1.5F, var5, var6, var9);
      }
   }

   private void a(MatrixStack var1, Renderer2D var2, float var3, float var4, float var5, float var6) {
      int var18 = -1790727020;
      int var17 = 432661144;
      int var10001 = (var17 | var18) & ~(var17 & var18);
      var18 = -1937093100;
      var17 = var10001;
      FontRenderer var7 = FontManager.b[var17 & ~var18 | ~var17 & var18];
      var18 = 920425571;
      var17 = 628551048;
      var10001 = (var17 | var18) - (var17 & var18);
      var18 = 329939428;
      var17 = var10001;
      FontRenderer var8 = FontManager.a[(var17 | var18) - (var17 & var18)];
      String var9;
      String var10;
      if (this.c()) {
         var18 = -979212460;
         var17 = -1257827630;
         int var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = -579559765;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = 1947086163;
         var17 = -972367859;
         int var10003 = (var17 | var18) - (var17 & var18);
         var18 = -385870296;
         var17 = var10003;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         int var10004 = (int)4653033728559373979L;
         var18 = -1488415376;
         var17 = var10004;
         var10004 = (var17 | var18) & ~(var17 & var18);
         var18 = 1433573550;
         var17 = var10004;
         var10004 = (var17 | var18) - (var17 & var18);
         var18 = -1763835701;
         var17 = 673123435;
         int var10005 = var17 & ~var18 | ~var17 & var18;
         var18 = -1090663825;
         var17 = var10005;
         var9 = a(
            "\ude4a\uf385\uda77\uf3f4\ude62\uf3f5\ude65\uf380\ude17\uf380\uda77\uf38a\ude69\uf38f\ude67\uf798\ude10\uf3f7\ude69\uf795\ude6a\uf380\ude15\uf795\ude6f\uf387\ude62\uf388\ude15\uf38b\ude65\uf795\uda6d\uf79d",
            "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁴꤓ絳蹄⑮謤㐸W\ua7f0꒰ꁿꤑ絥蹦⑳謤㑣B\ua7e7꒻ꁴ꤉",
            var10002,
            var10003,
            var10004,
            (var17 | var18) - (var17 & var18)
         );
         var18 = 112952481;
         var17 = -62161597;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = 1461785295;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var10003 = (int)7270108422072293288L;
         var18 = -1085564165;
         var17 = var10003;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = -1113031423;
         var17 = var10003;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var10004 = (int)-1468866524844131532L;
         var18 = -1936479633;
         var17 = var10004;
         var10004 = (var17 | var18) & (~var17 | ~var18);
         var18 = 453588050;
         var17 = var10004;
         var10004 = var17 + var18 - 2 * (var17 & var18);
         var10005 = (int)8056596047257691468L;
         var18 = -1991563115;
         var17 = var10005;
         var10005 = var17 & ~var18 | ~var17 & var18;
         var18 = -555917710;
         var17 = var10005;
         var10 = a(
            "\ude48⛯\ude63⛯\ude61⛥\ude6f⋱\ude6a⛤\ude6b⛬\ude69⛢\ude69⋽\uda77⚐\ude6d⛯\ude17⛯\uda77⛬\ude67⚖\ude6a⚒\ude15⚐\ude18",
            "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁴꤓ絳蹄⑮謤㐸W\ua7f0꒰ꁿꤑ絥蹦⑳謤㑣B\ua7e7꒻ꁴ꤉",
            var10002,
            var10003,
            var10004,
            var17 & ~var18 | ~var17 & var18
         );
      } else {
         var18 = 2014997691;
         var17 = 124520471;
         int var93 = var17 + var18 - 2 * (var17 & var18);
         var18 = -760770687;
         var17 = var93;
         var93 = (var17 | var18) & ~(var17 & var18);
         var18 = 653266812;
         var17 = 83358330;
         int var102 = var17 & ~var18 | ~var17 & var18;
         var18 = 2032121088;
         var17 = var102;
         var102 = var17 + var18 - 2 * (var17 & var18);
         int var111 = (int)-4899348420584412013L;
         var18 = 517018247;
         var17 = var111;
         var111 = var17 & ~var18 | ~var17 & var18;
         var18 = -589551247;
         var17 = var111;
         var111 = var17 + var18 - 2 * (var17 & var18);
         int var119 = (int)-5994059507329680030L;
         var18 = -248160051;
         var17 = var119;
         var119 = (var17 | var18) - (var17 & var18);
         var18 = 1047197424;
         var17 = var119;
         var9 = a(
            "\ude4aḝ\ude10Ḑ\ude64ḛ\uda77Ḙ\ude62ᨅ\ude6aḕ\ude6eḑ\ude62Ḙ\ude69",
            "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁴꤓ絳蹄⑮謤㐸W\ua7f0꒰ꁿꤑ絥蹦⑳謤㑣B\ua7e7꒻ꁴ꤉",
            var93,
            var102,
            var111,
            var17 & ~var18 | ~var17 & var18
         );
         var93 = (int)5084545576419344994L;
         var18 = 1589630796;
         var17 = var93;
         var93 = (var17 | var18) & (~var17 | ~var18);
         var18 = -844333565;
         var17 = var93;
         var93 = (var17 | var18) & (~var17 | ~var18);
         var18 = -1426739898;
         var17 = 2020399639;
         var102 = var17 + var18 - 2 * (var17 & var18);
         var18 = -2006934324;
         var17 = var102;
         var102 = (var17 | var18) & (~var17 | ~var18);
         var111 = (int)7608644056858935857L;
         var18 = -937158927;
         var17 = var111;
         var111 = (var17 | var18) - (var17 & var18);
         var18 = -897428091;
         var17 = var111;
         var111 = (var17 | var18) - (var17 & var18);
         var18 = -2080770754;
         var17 = 947702945;
         var119 = var17 & ~var18 | ~var17 & var18;
         var18 = -1145768087;
         var17 = var119;
         var10 = a(
            "\ude48﮲\ude68\ufbcc\ude69﮽\ude14﮵\uda77﮴\ude60ﮰ\ude62ﮱ\ude6f\ufbce\ude1bﾬ\ude60﮼\ude68\ufbcc\ude69\ufbcd",
            "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁴꤓ絳蹄⑮謤㐸W\ua7f0꒰ꁿꤑ絥蹦⑳謤㑣B\ua7e7꒻ꁴ꤉",
            var93,
            var102,
            var111,
            (var17 | var18) & (~var17 | ~var18)
         );
      }

      float var11 = var7.a(var9);
      float var12 = var8.a(var10);
      float var13 = var3 + (var5 - var11) / 2.0F;
      float var14 = var4 + var6 / 2.0F - 20.0F;
      float var15 = var3 + (var5 - var12) / 2.0F;
      float var16 = var14 + 15.0F;
      var7.a(var9, var13, var14, pulse.Theme.a, var1);
      var8.a(var10, var15, var16, pulse.Theme.b, var1);
   }

   private float a(List<EventCard> var1) {
      return var1.isEmpty() ? 0.0F : var1.size() * 42.5F - 6.0F;
   }

   public boolean a(float var1, float var2, float var3, float var4, int var5, int var6) {
      List<EventCard> var7 = this.e();
      if (var7.isEmpty()) {
         int var31 = 356571399;
         int var24 = -430973481;
         int var36 = (var24 | var31) - (var24 & var31);
         var31 = -217119536;
         var24 = var36;
         return pulse.Bool.from(var24 & (var31 ^ -1) | (var24 ^ -1) & var31);
      }

      float var8 = var2 + 3.0F;
      float var9 = var4 - 3.0F - 3.0F;
      float var10 = this.a(var7);
      if (var10 > var9) {
         float var11 = var1 + var3 + 18.0F;
         if (this.k.a(var11, var8, var9, var10, var9, var5, var6)) {
            int var29 = 1391763525;
            int var22 = 1478598740;
            int var35 = (var22 | var29) - (var22 & var29);
            var29 = 181731344;
            var22 = var35;
            return pulse.Bool.from((var22 | var29) - (var22 & var29));
         }
      }

      if (GuiInput.a(var1, var8, var3, var9, var5, var6)) {
         float var18 = var8 - this.k.b();
         float var12 = var1 + 1.0F;
         float var13 = var3 - 2.0F;

         for (EventCard var15 : var7) {
            if (var15.a(var12, var18, var13, var5, var6)) {
               int var10000 = (int)3560334039140583391L;
               int var17 = -1671206210;
               int var16 = var10000;
               var10000 = (var16 | var17) & (~var16 | ~var17);
               var17 = 1758965088;
               var16 = var10000;
               return pulse.Bool.from((var16 | var17) - (var16 & var17));
            }

            var18 += 42.5F;
         }
      }

      int var27 = -1221285996;
      int var20 = -1703643566;
      int var34 = (var20 | var27) - (var20 & var27);
      var27 = 759222726;
      var20 = var34;
      return pulse.Bool.from(var20 & (var27 ^ -1) | (var20 ^ -1) & var27);
   }

   public void a(int var1, int var2) {
      this.k.d();
   }

   public void a(int var1, int var2, double var3, double var5) {
      if (this.k.c()) {
         List<EventCard> var7 = this.e();
         float var8 = this.r - 3.0F - 3.0F;
         float var9 = this.a(var7);
         this.k.a(var2, var9, var8);
      }
   }

   public void a(float var1, int var2, int var3) {
      if (GuiInput.a(this.o, this.p, this.q, this.r, var2, var3)) {
         List<EventCard> var4 = this.e();
         float var5 = this.r - 3.0F - 3.0F;
         float var6 = this.a(var4);
         this.k.a(var1, var6, var5);
      }
   }

   public void d() {
      this.e.clear();
      this.f.clear();
      this.g.clear();
      this.h.clear();
      this.i.clear();
      this.j.clear();
      this.k.e();
   }

   public static String a(String var0, String var1, int var2, int var3, int var4, int var5) {
      char[] var6 = var1.toCharArray();
      char[] var7 = new char[var6.length];
      int var10000 = (int)2842594296917496426L;
      int var18 = 1552986000;
      int var17 = var10000;
      var10000 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1866383888;
      var17 = var10000;
      char[] var220 = new char[(var17 | var18) & ~(var17 & var18)];
      int var10002 = (int)-580098190812747200L;
      var18 = 1610874730;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1178495702;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 1986424397;
      var17 = 659929797;
      int var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1362336954;
      var17 = var10003;
      var220[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var18 = 1543276817;
      var17 = -510823185;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1166934529;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 1395169850;
      var17 = 872023180;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 1624423731;
      var17 = var10003;
      var220[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var10002 = (int)1036278967284182297L;
      var18 = 118310216;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -232527789;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)-3627323506220855791L;
      var18 = 1659473926;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 748797329;
      var17 = var10003;
      var220[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var18 = -1164163304;
      var17 = -746718619;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1776401790;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 174061528;
      var17 = 1944614358;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 2042042909;
      var17 = var10003;
      var220[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var10002 = (int)305043723089764808L;
      var18 = -12553303;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1661332891;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var10003 = (int)4982139979788121115L;
      var18 = -1141030087;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -8968697;
      var17 = var10003;
      var220[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var10002 = (int)-4157858473919468609L;
      var18 = 918945201;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 2104186379;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)1964755592067210533L;
      var18 = -1990569653;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -1761949204;
      var17 = var10003;
      var220[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var18 = 205402566;
      var17 = -2047210388;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1983627860;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)-5027826040652444193L;
      var18 = 1489241815;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -1632124389;
      var17 = var10003;
      var220[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var10002 = (int)-8988057976865807987L;
      var18 = 1625911512;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 1822773586;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 1989972165;
      var17 = -1241163313;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -1063650008;
      var17 = var10003;
      var220[var10002] = (char)((var17 | var18) - (var17 & var18));
      var10002 = (int)-5636076481245706797L;
      var18 = -1490196509;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1756896712;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var10003 = (int)6126463665983623374L;
      var18 = 1347316589;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -66784272;
      var17 = var10003;
      var220[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var10002 = (int)265349048613763146L;
      var18 = -1160257430;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1925945385;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var10003 = (int)1299432144881557975L;
      var18 = -1461865767;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 96343082;
      var17 = var10003;
      var220[var10002] = (char)((var17 | var18) - (var17 & var18));
      char[] var8 = var220;
      var10000 = (int)-611051710527044896L;
      var18 = 772624193;
      var17 = var10000;
      var10000 = var17 & ~var18 | ~var17 & var18;
      var18 = -1062646357;
      var17 = var10000;
      char[] var223 = new char[(var17 | var18) - (var17 & var18)];
      var18 = 793281992;
      var17 = 832231652;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 517102892;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)-6914496668074130020L;
      var18 = -1950773078;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1318576874;
      var17 = var10003;
      var223[var10002] = (char)((var17 | var18) - (var17 & var18));
      var18 = -724227157;
      var17 = 924561567;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -472999115;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 926372616;
      var17 = -1757562321;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -1609929436;
      var17 = var10003;
      var223[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var18 = -611030288;
      var17 = 1276282645;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -1752764953;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 1675509425;
      var17 = -1044068860;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -1575321626;
      var17 = var10003;
      var223[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var18 = -212088794;
      var17 = -398985657;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 460078690;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)8644850515344309898L;
      var18 = -1758043382;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1346725250;
      var17 = var10003;
      var223[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var18 = -1140791509;
      var17 = 232444060;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -1311098957;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1413921477;
      var17 = -2066091780;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 794856839;
      var17 = var10003;
      var223[var10002] = (char)((var17 | var18) - (var17 & var18));
      var10002 = (int)7814005909975991177L;
      var18 = -1950807229;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 55904463;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 121141798;
      var17 = -2020042177;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -2136942451;
      var17 = var10003;
      var223[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var10002 = (int)-1459396786623332671L;
      var18 = -1524250207;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 2011035494;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var10003 = (int)7958148730645455110L;
      var18 = 1115033110;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 2108663849;
      var17 = var10003;
      var223[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var10002 = (int)-2830831794641037176L;
      var18 = 919770102;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 458787705;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 1664105293;
      var17 = 1318081458;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 765491399;
      var17 = var10003;
      var223[var10002] = (char)((var17 | var18) - (var17 & var18));
      var18 = 184155532;
      var17 = 382887894;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 472619602;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1124212132;
      var17 = -1658726763;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 568113101;
      var17 = var10003;
      var223[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var18 = -1158327021;
      var17 = 2011892641;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -853647685;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)9155407958116686515L;
      var18 = 88537790;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -938306754;
      var17 = var10003;
      var223[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      char[] var9 = var223;
      var10000 = (int)6171098411734314423L;
      var18 = 644830051;
      var17 = var10000;
      var10000 = (var17 | var18) & ~(var17 & var18);
      var18 = 1728708308;
      var17 = var10000;

      for (int var10 = (var17 | var18) & (~var17 | ~var18); var10 < var6.length; var10++) {
         char var279 = var6[var10];
         char var205 = var8[var10 % var8.length];
         char var106 = var279;
         var7[var10] = (char)((var106 | var205) & (~var106 | ~var205));
      }

      char[] var19 = new char[var7.length];
      var10000 = (int)744072087580822047L;
      var18 = 200119196;
      var17 = var10000;
      var10000 = (var17 | var18) & (~var17 | ~var18);
      var18 = 409229699;
      var17 = var10000;

      for (int var11 = (var17 | var18) - (var17 & var18); var11 < var6.length; var11++) {
         char var280 = var7[var11];
         char var208 = var9[var11 % var9.length];
         char var109 = var280;
         var19[var11] = (char)(var109 + var208 - 2 * (var109 & var208));
      }

      String var20 = new String(var19);
      int var12 = var20.hashCode();
      var18 = var5;
      var17 = var3;
      var10000 = (var17 ^ var18) - 2 * (~var17 & var18);
      var18 = var2;
      var17 = var10000;
      int var13 = (var17 ^ var18) - 2 * (~var17 & var18);
      char[] var14 = var0.toCharArray();
      char[] var15 = new char[var14.length];
      var18 = 1676888012;
      var17 = 1460117435;
      var10000 = (var17 | var18) & (~var17 | ~var18);
      var18 = 888461431;
      var17 = var10000;

      for (int var16 = var17 + var18 - 2 * (var17 & var18); var16 < var15.length; var16++) {
         var18 = 123488161;
         var17 = 1856598691;
         int var10001 = (var17 | var18) - (var17 & var18);
         var18 = 1777677568;
         var17 = var10001;
         switch (var16 % ((var17 | var18) - (var17 & var18))) {
            case 0:
               var18 = var12;
               var17 = var13;
               var10002 = var17 & ~var18 | ~var17 & var18;
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
               var15[var16] = (char)((var17 | var216) - (var17 & var216));
         }
      }

      return new String(var15);
   }
}
