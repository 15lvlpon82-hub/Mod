package pulse;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public class GuiLayerRegistry {
   private static final GuiLayerRegistry c = new GuiLayerRegistry();
   private final Map<GuiLayerRegistry.Layer, List<GuiLayerRegistry.LayerEntry>> d;
   private GuiLayerRegistry.Layer e;
   private int f;
   private int g;
   public static int a;
   public static boolean b;

   private GuiLayerRegistry() {
      int var10003 = (int)911795925173948096L;
      int var6 = -1320480552;
      int var5 = var10003;
      var10003 = (var5 | var6) & (~var5 | ~var6);
      var6 = -767623137;
      var5 = var10003;
      var10003 = var5 & ~var6 | ~var5 & var6;
      var6 = -1608575865;
      var5 = -1355750941;
      int var10004 = (var5 | var6) & (~var5 | ~var6);
      var6 = 2078127004;
      var5 = var10004;
      var6 = var5 + var6 - 2 * (var5 & var6);
      var5 = var10003;
      var10003 = (var5 | var6) + (var5 & var6);
      this.d = new EnumMap<>(GuiLayerRegistry.Layer.class);
      this.e = null;
      int var10001 = (int)-3074269812468794468L;
      var6 = 308509229;
      var5 = var10001;
      var10001 = var5 & ~var6 | ~var5 & var6;
      var6 = -562806351;
      var5 = var10001;
      this.f = (var5 | var6) & (~var5 | ~var6);
      var10001 = (int)-7334683329263996429L;
      var6 = 1476909138;
      var5 = var10001;
      var10001 = var5 + var6 - 2 * (var5 & var6);
      var6 = 725264801;
      var5 = var10001;
      this.g = var5 & ~var6 | ~var5 & var6;
      GuiLayerRegistry.Layer[] var1 = GuiLayerRegistry.Layer.values();
      int var2 = var1.length;
      var6 = -1761009172;
      var5 = -743441084;
      int var10000 = var5 + var6 - 2 * (var5 & var6);
      var6 = 1151786152;
      var5 = var10000;

      for (int var3 = (var5 | var6) - (var5 & var6); var3 < var2; var3++) {
         GuiLayerRegistry.Layer var4 = var1[var3];
         this.d.put(var4, new ArrayList<>());
      }
   }

   public static GuiLayerRegistry a() {
      return c;
   }

   public void b() {
      for (List var2 : this.d.values()) {
         var2.clear();
      }

      this.e = null;
   }

   public void a(int var1, int var2) {
      this.f = var1;
      this.g = var2;
      this.d();
   }

   public void a(GuiLayerRegistry.Layer var1, float var2, float var3, float var4, float var5) {
      this.a(var1, var2, var3, var4, var5, 0.0F);
   }

   public void a(GuiLayerRegistry.Layer var1, float var2, float var3, float var4, float var5, float var6) {
      this.d.get(var1).add(new GuiLayerRegistry.LayerEntry(var2, var3, var4, var5, var6));
      this.d();
   }

   public void a(GuiLayerRegistry.Layer var1) {
      this.d.get(var1).clear();
      this.d();
   }

   private void d() {
      this.e = null;
      int var10000 = (int)2814276453094990530L;
      int var10 = -301347145;
      int var9 = var10000;
      var10000 = (var9 | var10) & (~var9 | ~var10);
      var10 = -275836022;
      var9 = var10000;
      int var1 = var9 + var10 - 2 * (var9 & var10);
      GuiLayerRegistry.Layer[] var2 = GuiLayerRegistry.Layer.values();
      int var3 = var2.length;
      var10000 = (int)-6663613070780586060L;
      var10 = -920829285;
      var9 = var10000;
      var10000 = var9 + var10 - 2 * (var9 & var10);
      var10 = 1650746671;
      var9 = var10000;

      for (int var4 = (var9 | var10) - (var9 & var10); var4 < var3; var4++) {
         GuiLayerRegistry.Layer var5 = var2[var4];

         for (GuiLayerRegistry.LayerEntry var8 : this.d.get(var5)) {
            if (var8.a(this.f, this.g) && var5.a() > var1) {
               var1 = var5.a();
               this.e = var5;
            }
         }
      }
   }

   public boolean b(GuiLayerRegistry.Layer var1) {
      if (this.e == null) {
         int var18 = (int)-2212868269607629752L;
         int var12 = -1508540963;
         int var7 = var18;
         var18 = var7 & ~var12 | ~var7 & var12;
         var12 = -782716524;
         var7 = var18;
         return pulse.Bool.from(var7 & (var12 ^ -1) | (var7 ^ -1) & var12);
      }

      int var15;
      if (var1.a() < this.e.a()) {
         var15 = (int)-7269057135619619093L;
         int var3 = 4167282;
         int var2 = var15;
         var15 = (var2 | var3) & ~(var2 & var3);
         var3 = 1533038745;
         var2 = var15;
         var15 = var2 + var3 - 2 * (var2 & var3);
      } else {
         var15 = (int)2527459402853837989L;
         int var10 = -307205820;
         int var5 = var15;
         var15 = (var5 | var10) & (~var5 | ~var10);
         var10 = 2128774624;
         var5 = var15;
         var15 = (var5 | var10) & ~(var5 & var10);
      }

      return pulse.Bool.from(var15);
   }

   public boolean a(GuiLayerRegistry.Layer var1, double var2, double var4) {
      GuiLayerRegistry.Layer var6 = this.a(var2, var4);
      if (var6 == null) {
         int var31 = (int)4692577314043449012L;
         int var25 = -1403167763;
         int var16 = var31;
         var31 = (var16 | var25) & (~var16 | ~var25);
         var25 = -1061120680;
         var16 = var31;
         return pulse.Bool.from((var16 | var25) & (var16 & var25 ^ -1));
      }

      int var28;
      if (var1.a() < var6.a()) {
         var28 = (int)-882534746016693145L;
         int var8 = -506361548;
         int var7 = var28;
         var28 = (var7 | var8) - (var7 & var8);
         var8 = -395457197;
         var7 = var28;
         var28 = (var7 | var8) & (~var7 | ~var8);
      } else {
         var28 = (int)-416048985633404034L;
         int var19 = 697815771;
         int var10 = var28;
         var28 = var10 & ~var19 | ~var10 & var19;
         var19 = -876668508;
         var10 = var28;
         var28 = (var10 | var19) & (~var10 | ~var19);
         if (b) {
            var19 = -939152376;
            var10 = 412282718;
            int var10001 = var10 & ~var19 | ~var10 & var19;
            var19 = -795393194;
            var10 = var10001;
            var10001 = (var10 | var19) & (~var10 | ~var19);
            var19 = 2083958280;
            var10 = 1181235560;
            int var10002 = (var10 | var19) & (~var10 | ~var19);
            var19 = 979277664;
            var10 = var10002;
            var10001 /= (var10 | var19) - (var10 & var19);
         }
      }

      return pulse.Bool.from(var28);
   }

   public GuiLayerRegistry.Layer a(double var1, double var3) {
      GuiLayerRegistry.Layer var5 = null;
      int var17 = 650067837;
      int var16 = 115829868;
      int var10000 = (var16 | var17) & (~var16 | ~var17);
      var17 = -542659346;
      var16 = var10000;
      int var6 = (var16 | var17) - (var16 & var17);
      GuiLayerRegistry.Layer[] var7 = GuiLayerRegistry.Layer.values();
      int var8 = var7.length;
      var10000 = (int)5035437731424195825L;
      var17 = -877792043;
      var16 = var10000;
      var10000 = var16 & ~var17 | ~var16 & var17;
      var17 = -577855452;
      var16 = var10000;

      for (int var9 = (var16 | var17) & ~(var16 & var17); var9 < var8; var9++) {
         GuiLayerRegistry.Layer var10 = var7[var9];

         for (GuiLayerRegistry.LayerEntry var13 : this.d.get(var10)) {
            if (var13.a(var1, var3) && var10.a() > var6) {
               var6 = var10.a();
               var5 = var10;
            }
         }

         var10000 = (int)8756176592942042261L;
         var17 = -136207924;
         var16 = var10000;
         var10000 = (var16 | var17) & (~var16 | ~var17);
         var17 = -1783035343;
         var16 = var10000;
         var10000 = var16 + var17 - 2 * (var16 & var17);
         var10000 = (int)163765207404390600L;
         var17 = -1031956849;
         var16 = var10000;
         var10000 = var16 & ~var17 | ~var16 & var17;
         var17 = 1760598342;
         var16 = var10000;
         int var15 = (var16 | var17) & (~var16 | ~var17);
         a = var15;
         String var43 = "dpd";
         var10000 = (int)-4266321644418766016L;
         var17 = -1210590778;
         var16 = var10000;
         var10000 = (var16 | var17) & ~(var16 & var17);
         var17 = -622678189;
         var16 = var10000;
         if (((var16 | var17) & (~var16 | ~var17)) <= a) {
            throw new RuntimeException();
         }
      }

      return var5;
   }

   public GuiLayerRegistry.Layer c() {
      return this.e;
   }

   public boolean c(GuiLayerRegistry.Layer var1) {
      int var10;
      if (this.d.get(var1).isEmpty()) {
         int var3 = -681999900;
         int var2 = 978393092;
         var10 = (var2 | var3) & (~var2 | ~var3);
         var3 = -318203424;
         var2 = var10;
         var10 = (var2 | var3) & ~(var2 & var3);
      } else {
         int var8 = 1851761414;
         int var5 = 447174616;
         var10 = var5 + var8 - 2 * (var5 & var8);
         var8 = 1962472671;
         var5 = var10;
         var10 = var5 + var8 - 2 * (var5 & var8);
      }

      return pulse.Bool.from(var10);
   }

   public boolean d(GuiLayerRegistry.Layer var1) {
      GuiLayerRegistry.Layer[] var2 = GuiLayerRegistry.Layer.values();
      int var3 = var2.length;
      int var7 = 1915913353;
      int var6 = 1740574938;
      int var10000 = var6 & ~var7 | ~var6 & var7;
      var7 = 361600083;
      var6 = var10000;

      for (int var4 = (var6 | var7) & ~(var6 & var7); var4 < var3; var4++) {
         GuiLayerRegistry.Layer var5 = var2[var4];
         if (var5.a() > var1.a() && !this.d.get(var5).isEmpty()) {
            var10000 = (int)8232830759833144729L;
            var7 = -498414609;
            var6 = var10000;
            var10000 = (var6 | var7) - (var6 & var7);
            var7 = 92882551;
            var6 = var10000;
            return pulse.Bool.from((var6 | var7) - (var6 & var7));
         }
      }

      var7 = 975968558;
      var6 = 1215024766;
      var10000 = (var6 | var7) & ~(var6 & var7);
      var7 = 1917310800;
      var6 = var10000;
      return pulse.Bool.from(var6 + var7 - 2 * (var6 & var7));
   }

   public boolean b(GuiLayerRegistry.Layer var1, double var2, double var4) {
      for (GuiLayerRegistry.LayerEntry var8 : this.d.get(var1)) {
         if (var8.a(var2, var4)) {
            int var10 = 1483940557;
            int var9 = 721379812;
            int var10000 = var9 & ~var10 | ~var9 & var10;
            var10 = 1921794856;
            var9 = var10000;
            return pulse.Bool.from(var9 + var10 - 2 * (var9 & var10));
         }
      }

      int var15 = -1406458077;
      int var12 = -2009681837;
      int var17 = (var12 | var15) & ~(var12 & var15);
      var15 = 605919088;
      var12 = var17;
      return pulse.Bool.from((var12 | var15) & (var12 & var15 ^ -1));
   }

   public boolean c(GuiLayerRegistry.Layer var1, double var2, double var4) {
      GuiLayerRegistry.Layer[] var6 = GuiLayerRegistry.Layer.values();
      int var7 = var6.length;
      int var13 = 1297164909;
      int var12 = 1759097037;
      int var10000 = (var12 | var13) & ~(var12 & var13);
      var13 = 629709472;
      var12 = var10000;

      for (int var8 = (var12 | var13) & (~var12 | ~var13); var8 < var7; var8++) {
         GuiLayerRegistry.Layer var9 = var6[var8];
         if (var9.a() < var1.a()) {
            if (a != a) {
               var10000 = (int)9067700326100785322L;
               var13 = 1716194297;
               var12 = var10000;
               var10000 = var12 & ~var13 | ~var12 & var13;
               var13 = 653214743;
               var12 = var10000;
               var10000 = (var12 | var13) & ~(var12 & var13);
               var10000 = (int)6625250533527965123L;
               var13 = -2199617;
               var12 = var10000;
               var10000 = (var12 | var13) & (~var12 | ~var13);
               var13 = -512431359;
               var12 = var10000;
               int var11 = (var12 | var13) & (~var12 | ~var13);
            }
         } else if (this.b(var9, var2, var4)) {
            var13 = -115700733;
            var12 = -766122884;
            var10000 = var12 + var13 - 2 * (var12 & var13);
            var13 = 726624382;
            var12 = var10000;
            return pulse.Bool.from(var12 & (var13 ^ -1) | (var12 ^ -1) & var13);
         }
      }

      var10000 = (int)-2216598414699838680L;
      var13 = -890982811;
      var12 = var10000;
      var10000 = var12 & ~var13 | ~var12 & var13;
      var13 = -1459884723;
      var12 = var10000;
      return pulse.Bool.from((var12 | var13) - (var12 & var13));
   }

   public boolean d(GuiLayerRegistry.Layer var1, double var2, double var4) {
      GuiLayerRegistry.Layer var6 = this.a(var2, var4);
      if (var6 == null) {
         int var21 = (int)-645995324083627884L;
         int var17 = -775512458;
         int var12 = var21;
         var21 = (var12 | var17) & ~(var12 & var17);
         var17 = 883427042;
         var12 = var21;
         return pulse.Bool.from(var12 & (var17 ^ -1) | (var12 ^ -1) & var17);
      }

      int var19;
      if (var6.a() <= var1.a()) {
         int var8 = 1716439898;
         int var7 = 623237027;
         var19 = (var7 | var8) - (var7 & var8);
         var8 = 1131093241;
         var7 = var19;
         var19 = var7 & ~var8 | ~var7 & var8;
      } else {
         int var15 = -269613759;
         int var10 = 793816499;
         var19 = var10 + var15 - 2 * (var10 & var15);
         var15 = -1061246733;
         var10 = var19;
         var19 = (var10 | var15) - (var10 & var15);
      }

      return pulse.Bool.from(var19);
   }

   public static String a(String var0, String var1, int var2, int var3, int var4, int var5) {
      char[] var6 = var1.toCharArray();
      char[] var7 = new char[var6.length];
      int var20 = -1431512094;
      int var19 = -1592735351;
      int var10000 = var19 + var20 - 2 * (var19 & var20);
      var20 = 196874849;
      var19 = var10000;
      char[] var263 = new char[(var19 | var20) & ~(var19 & var20)];
      var20 = 2134005650;
      var19 = -2104276719;
      int var10002 = (var19 | var20) - (var19 & var20);
      var20 = -39772541;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      int var10003 = (int)-3930988017178079794L;
      var20 = -1137372956;
      var19 = var10003;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = 2147341592;
      var19 = var10003;
      var263[var10002] = (char)((var19 | var20) & ~(var19 & var20));
      var20 = -439673391;
      var19 = -808884077;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = 704804163;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = 859906104;
      var19 = -1473406822;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = -1687381209;
      var19 = var10003;
      var263[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      var10002 = (int)-930767747576627523L;
      var20 = 388893058;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = 711194429;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var10003 = (int)854228403249047778L;
      var20 = -380691047;
      var19 = var10003;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = 502945533;
      var19 = var10003;
      var263[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      var20 = -1234870227;
      var19 = 955891755;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = -1902338043;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var10003 = (int)787089847253241839L;
      var20 = -874839091;
      var19 = var10003;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = 773381268;
      var19 = var10003;
      var10003 = (var19 | var20) - (var19 & var20);
      int var10004 = (int)4404129190280472795L;
      var20 = 506007487;
      var19 = var10004;
      var10004 = (var19 | var20) & ~(var19 & var20);
      var20 = -1599163485;
      var19 = var10004;
      var20 = (var19 | var20) - (var19 & var20);
      var19 = var10003;
      var10003 = (var19 | var20) + (var19 & var20);
      var20 = 546906556;
      var19 = 119176441;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = 662947158;
      var19 = var10003;
      var263[var10002] = (char)((var19 | var20) - (var19 & var20));
      var20 = 1360413641;
      var19 = 1941870236;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = 581490001;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var10003 = (int)7192524487734205570L;
      var20 = 1959442276;
      var19 = var10003;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = 1223610630;
      var19 = var10003;
      var10003 = (var19 + var20 - 2 * (var19 & var20)) * (var19 + var20 - 2 * (var19 & var20));
      var10003 = (int)-6819114220105293003L;
      var20 = -1052708143;
      var19 = var10003;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = 982466753;
      var19 = var10003;
      var263[var10002] = (char)((var19 | var20) - (var19 & var20));
      var20 = -715836935;
      var19 = 974144777;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = -280660747;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var10003 = (int)-9076084406450110433L;
      var20 = 1422805819;
      var19 = var10003;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = -1629860186;
      var19 = var10003;
      var263[var10002] = (char)((var19 | var20) & ~(var19 & var20));
      var10002 = (int)-3495113071928020347L;
      var20 = 914547365;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = -412807130;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = -38191852;
      var19 = 496674042;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = -534540035;
      var19 = var10003;
      var263[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      var10002 = (int)6910577113827225780L;
      var20 = 1697400454;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = 196212277;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var10003 = (int)7001161649999391102L;
      var20 = -795654059;
      var19 = var10003;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = -1679928055;
      var19 = var10003;
      var263[var10002] = (char)((var19 | var20) - (var19 & var20));
      var10002 = (int)-1491251880174922326L;
      var20 = -1952209175;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1747579723;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = 1892837911;
      var19 = -1893711725;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = -908585;
      var19 = var10003;
      var263[var10002] = (char)((var19 | var20) - (var19 & var20));
      var20 = 184390682;
      var19 = -1482800860;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = -1385966281;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = -1357833987;
      var19 = -544075031;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1887636784;
      var19 = var10003;
      var263[var10002] = (char)((var19 | var20) - (var19 & var20));
      char[] var8 = var263;
      var10000 = (int)-6413687775164879725L;
      var20 = 1359133580;
      var19 = var10000;
      var10000 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1275762453;
      var19 = var10000;
      char[] var266 = new char[var19 & ~var20 | ~var19 & var20];
      var10002 = (int)-8481635534672158839L;
      var20 = 1784686972;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = 1407792885;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var10003 = (int)7473442725356338975L;
      var20 = -922725518;
      var19 = var10003;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = -954768307;
      var19 = var10003;
      var266[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      var20 = 1064021184;
      var19 = -301495882;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = -781441673;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = 1852664305;
      var19 = -581530552;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = -1876889544;
      var19 = var10003;
      var10003 = ((var19 | var20) & (~var19 | ~var20)) * ((var19 | var20) & (~var19 | ~var20));
      var20 = 1644174999;
      var19 = 565146845;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = 1135603273;
      var19 = var10003;
      var266[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      var20 = -1475015521;
      var19 = -1803777346;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1013548579;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      String var358 = "dpe";
      var20 = -1934542982;
      var19 = -875896435;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1199264164;
      var19 = var10003;
      var266[var10002] = (char)((var19 | var20) - (var19 & var20));
      var10002 = (int)8728296784849846322L;
      var20 = -1580338653;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = -890949102;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = -827553862;
      var19 = 1559381118;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = -1839268922;
      var19 = var10003;
      var266[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      var10002 = (int)1265786210426939298L;
      var20 = 1688928868;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = 2126439874;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var10003 = (int)-7667566539965592360L;
      var20 = 557282397;
      var19 = var10003;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = 479805637;
      var19 = var10003;
      var266[var10002] = (char)((var19 | var20) & ~(var19 & var20));
      var20 = 1142587645;
      var19 = 1039525692;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = 2045732804;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var10003 = (int)3299852968875382063L;
      var20 = 809321211;
      var19 = var10003;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = -2065125568;
      var19 = var10003;
      var266[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      var20 = 21650776;
      var19 = -184644214;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = -172699436;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      String var365 = "dpf";
      var20 = 1402418737;
      var19 = -735898044;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = -2018203828;
      var19 = var10003;
      var266[var10002] = (char)((var19 | var20) & ~(var19 & var20));
      var20 = -1475154944;
      var19 = 549989948;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = -1998929349;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var10003 = (int)-7042201724203253307L;
      var20 = -371276260;
      var19 = var10003;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = 971380705;
      var19 = var10003;
      var266[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      var20 = 1714861846;
      var19 = 223379999;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = 1801860353;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var10003 = (int)-2585996284585570707L;
      var20 = 94139992;
      var19 = var10003;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = 727423702;
      var19 = var10003;
      var10003 = (var19 | var20) - (var19 & var20);
      var10003 = (int)7762052350379261740L;
      var20 = -1340991787;
      var19 = var10003;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1615194877;
      var19 = var10003;
      var266[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      var20 = 1692206412;
      var19 = 136366040;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = 1828569757;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = 215486152;
      var19 = -1347522550;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = -1552527887;
      var19 = var10003;
      var266[var10002] = (char)((var19 | var20) & ~(var19 & var20));
      char[] var9 = var266;
      var20 = 1601519192;
      var19 = -1514645703;
      var10000 = var19 & ~var20 | ~var19 & var20;
      var20 = -87201439;
      var19 = var10000;

      for (int var10 = (var19 | var20) & ~(var19 & var20); var10 < var6.length; var10++) {
         char var328 = var6[var10];
         char var239 = var8[var10 % var8.length];
         char var119 = var328;
         var7[var10] = (char)(var119 + var239 - 2 * (var119 & var239));
      }

      char[] var21 = new char[var7.length];
      var20 = -333977529;
      var19 = -91809621;
      var10000 = (var19 | var20) - (var19 & var20);
      var20 = 378597612;
      var19 = var10000;

      for (int var11 = (var19 | var20) & (~var19 | ~var20); var11 < var6.length; var11++) {
         char var329 = var7[var11];
         char var242 = var9[var11 % var9.length];
         char var122 = var329;
         var21[var11] = (char)(var122 + var242 - 2 * (var122 & var242));
      }

      String var22 = new String(var21);
      int var12 = var22.hashCode();
      var20 = var5;
      var19 = var3;
      var10000 = (var19 ^ var20) - 2 * (~var19 & var20);
      var20 = var2;
      var19 = var10000;
      int var13 = (var19 & ~var20) - (~var19 & var20);
      char[] var14 = var0.toCharArray();
      char[] var15 = new char[var14.length];
      var20 = 1277180641;
      var19 = -2131809034;
      var10000 = (var19 | var20) & (~var19 | ~var20);
      var20 = -858843625;
      var19 = var10000;
      int var16 = var19 + var20 - 2 * (var19 & var20);
      var20 = -1350689057;
      var19 = -1216988855;
      var10000 = var19 & ~var20 | ~var19 & var20;
      var20 = 1917287970;
      var19 = var10000;
      var10000 = (var19 | var20) & (~var19 | ~var20);
      var10000 = (int)3346851758584418118L;
      var20 = -423935222;
      var19 = var10000;
      var10000 = var19 & ~var20 | ~var19 & var20;
      var20 = -475214829;
      var19 = var10000;
      int var18 = (var19 | var20) & ~(var19 & var20);
      a = var18;
      String var275 = "dpg";
      var20 = -533105656;
      var19 = 274759928;
      var10000 = (var19 | var20) & (~var19 | ~var20);
      var20 = -1992680301;
      var19 = var10000;
      if (var19 + var20 - 2 * (var19 & var20) < a) {
         var10000 = (int)6642253717771798958L;
         var20 = 734390627;
         var19 = var10000;
         var10000 = (var19 | var20) & ~(var19 & var20);
         var20 = 1074503885;
         var19 = var10000;
         var10000 = var19 & ~var20 | ~var19 & var20;
         var20 = -554496587;
         var19 = 396990168;
         int var10001 = (var19 | var20) & (~var19 | ~var20);
         var20 = -916808851;
         var19 = var10001;
         var10000 /= (var19 | var20) & ~(var19 & var20);
      }

      for (; var16 < var15.length; var16++) {
         var20 = -542535023;
         var19 = 848968667;
         int var281 = (var19 | var20) & ~(var19 & var20);
         var20 = -315381432;
         var19 = var281;
         switch (var16 % ((var19 | var20) - (var19 & var20))) {
            case 0:
               var20 = var12;
               var19 = var13;
               var10002 = (var19 | var20) & ~(var19 & var20);
               char var262 = var14[var16];
               var19 = var10002;
               var15[var16] = (char)((var19 | var262) - (var19 & var262));
               break;
            case 1:
               var20 = var13;
               var19 = var5;
               var10002 = var19 + var20 - 2 * (var19 & var20);
               char var260 = var14[var16];
               var19 = var10002;
               var15[var16] = (char)(var19 + var260 - 2 * (var19 & var260));
         }
      }

      return new String(var15);
   }

   private static class LayerEntry {
      final float a;
      final float b;
      final float c;
      final float d;
      final float e;
      public static int f;
      public static boolean g;

      LayerEntry(float var1, float var2, float var3, float var4, float var5) {
         this.a = var1;
         this.b = var2;
         this.c = var3;
         this.d = var4;
         this.e = var5;
      }

      boolean a(double var1, double var3) {
         int var13;
         if (var1 >= this.a && var1 <= this.a + this.c && var3 >= this.b && var3 <= this.b + this.d) {
            var13 = (int)-5196435053686429610L;
            int var11 = -1509411095;
            int var8 = var13;
            var13 = (var8 | var11) & ~(var8 & var11);
            var11 = 413785790;
            var8 = var13;
            var13 = var8 & ~var11 | ~var8 & var11;
         } else {
            int var6 = -819807504;
            int var5 = 330581647;
            var13 = var5 + var6 - 2 * (var5 & var6);
            var6 = -594084737;
            var5 = var13;
            var13 = var5 & ~var6 | ~var5 & var6;
         }

         return pulse.Bool.from(var13);
      }

      public static String a(String var0, String var1, int var2, int var3, int var4, int var5) {
         char[] var6 = var1.toCharArray();
         char[] var7 = new char[var6.length];
         int var18 = -604517462;
         int var17 = 499860222;
         int var10000 = (var17 | var18) & ~(var17 & var18);
         var18 = -969111202;
         var17 = var10000;
         char[] var239 = new char[var17 + var18 - 2 * (var17 & var18)];
         var18 = 1458221536;
         var17 = -845563502;
         int var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = -1686960014;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = 300382887;
         var17 = 1695037154;
         int var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = 1961821303;
         var17 = var10003;
         var239[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         var18 = 1207832271;
         var17 = 1897006391;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = 921439225;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = -987197148;
         var17 = -348783077;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = 773672122;
         var17 = var10003;
         var239[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var10002 = (int)-3971807479664822956L;
         var18 = 1634934996;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = 1797625218;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var10003 = (int)-2443930946654462176L;
         var18 = -131607806;
         var17 = var10003;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = 1563717540;
         var17 = var10003;
         var239[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var18 = 1370293982;
         var17 = -1622455938;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = -823767133;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = 752383418;
         var17 = 338015693;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = 1181872212;
         var17 = var10003;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = -885440562;
         var17 = -1280949186;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = 2023744483;
         var17 = var10003;
         var239[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var10002 = (int)-1987345993589061000L;
         var18 = -1860027139;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = -1216989567;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = -177489717;
         var17 = -1070823200;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = 828183814;
         var17 = var10003;
         var10003 = ((var17 | var18) & (~var17 | ~var18)) * ((var17 | var18) & (~var17 | ~var18));
         var10003 = (int)462921062299351188L;
         var18 = -1751270660;
         var17 = var10003;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = 1929057101;
         var17 = var10003;
         var239[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var10002 = (int)-4925694575299406532L;
         var18 = -1736144352;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = 263282457;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = 813926419;
         var17 = -1728130858;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = -1468195513;
         var17 = var10003;
         var239[var10002] = (char)((var17 | var18) & ~(var17 & var18));
         var18 = -1458935691;
         var17 = 1976285608;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = -591277605;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var10003 = (int)-7959342636334096208L;
         var18 = -348433369;
         var17 = var10003;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = 9715076;
         var17 = var10003;
         var239[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var10002 = (int)-4169888783506922744L;
         var18 = -784862841;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = 1125700232;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var10003 = (int)-7923012400621599617L;
         var18 = -680471856;
         var17 = var10003;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = -1029725555;
         var17 = var10003;
         var239[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var18 = 1450417359;
         var17 = 667212443;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = 1907836508;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = 1584341766;
         var17 = 456346599;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = 1163681970;
         var17 = var10003;
         var239[var10002] = (char)((var17 | var18) - (var17 & var18));
         var10002 = (int)-8526828127025540017L;
         var18 = 1223237863;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = -1824754527;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var10003 = (int)5414934909943744760L;
         var18 = 1398643171;
         var17 = var10003;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = 1045599807;
         var17 = var10003;
         var239[var10002] = (char)((var17 | var18) - (var17 & var18));
         char[] var8 = var239;
         var18 = -1215775435;
         var17 = 1134352222;
         var10000 = var17 & ~var18 | ~var17 & var18;
         var18 = -199988639;
         var17 = var10000;
         char[] var241 = new char[var17 & ~var18 | ~var17 & var18];
         var18 = -472071287;
         var17 = 426537469;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = -89083276;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = 1814454247;
         var17 = 1830252581;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = 20015074;
         var17 = var10003;
         var241[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var18 = 893221907;
         var17 = 1746460810;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = 1562746008;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = -913334495;
         var17 = 481030201;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = 899090063;
         var17 = var10003;
         var10003 = ((var17 | var18) & ~(var17 & var18)) * ((var17 | var18) & ~(var17 & var18));
         var10003 = (int)-4777051095827133706L;
         var18 = -596008138;
         var17 = var10003;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = 1261202883;
         var17 = var10003;
         var241[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var18 = 1962732835;
         var17 = -208661296;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = -2022901263;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         String var319 = "cap";
         var18 = 1410584218;
         var17 = -2031075391;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = -756845048;
         var17 = var10003;
         var241[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var10002 = (int)9126391967362925166L;
         var18 = -59988620;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = 63563545;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = -1225476597;
         var17 = -1596809432;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = 371593505;
         var17 = var10003;
         var241[var10002] = (char)((var17 | var18) - (var17 & var18));
         var18 = -1318459954;
         var17 = -2000326225;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = 967611493;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = 1651256161;
         var17 = 131735183;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = 1706429870;
         var17 = var10003;
         var241[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var18 = 1196023079;
         var17 = 1571349202;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = 450969584;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = 678070914;
         var17 = 1022908346;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = 345171372;
         var17 = var10003;
         var241[var10002] = (char)((var17 | var18) - (var17 & var18));
         var18 = -1944384345;
         var17 = -739042157;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = 1609044018;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         int var10004 = (int)-3803287507363068667L;
         var18 = -942656807;
         var17 = var10004;
         var10004 = (var17 | var18) - (var17 & var18);
         var18 = 1864480728;
         var17 = var10004;
         var10004 = (var17 | var18) - (var17 & var18);
         var10003 = (int)432922858211985196L;
         var18 = 288106510;
         var17 = var10003;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = -1410078693;
         var17 = var10003;
         var241[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         var18 = -1278860368;
         var17 = 633545066;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = -1778056483;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = 1698570659;
         var17 = 2109990663;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = 419288732;
         var17 = var10003;
         var241[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var18 = -1484271425;
         var17 = -1810062118;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = 865825901;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var10003 = (int)-2116370705439073365L;
         var18 = 1724052458;
         var17 = var10003;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = 1197775866;
         var17 = var10003;
         var10003 = (var17 & ~var18 | ~var17 & var18) * (var17 & ~var18 | ~var17 & var18);
         var10003 = (int)-7049914062205947228L;
         var18 = -384654800;
         var17 = var10003;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = -667102320;
         var17 = var10003;
         var241[var10002] = (char)((var17 | var18) & ~(var17 & var18));
         var10002 = (int)-30158495255220687L;
         var18 = 2102050671;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = 1578144087;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = -961116911;
         var17 = -545665252;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = 433027390;
         var17 = var10003;
         var241[var10002] = (char)((var17 | var18) - (var17 & var18));
         char[] var9 = var241;
         var18 = -1607719254;
         var17 = 910123093;
         var10000 = (var17 | var18) & (~var17 | ~var18);
         var18 = -1777121537;
         var17 = var10000;

         for (int var10 = (var17 | var18) & ~(var17 & var18); var10 < var6.length; var10++) {
            char var292 = var6[var10];
            char var225 = var8[var10 % var8.length];
            char var116 = var292;
            var7[var10] = (char)(var116 + var225 - 2 * (var116 & var225));
         }

         char[] var19 = new char[var7.length];
         var18 = 571241578;
         var17 = -251497376;
         var10000 = (var17 | var18) - (var17 & var18);
         var18 = -754057206;
         var17 = var10000;

         for (int var11 = (var17 | var18) & ~(var17 & var18); var11 < var6.length; var11++) {
            char var293 = var7[var11];
            char var228 = var9[var11 % var9.length];
            char var119 = var293;
            var19[var11] = (char)((var119 | var228) & (~var119 | ~var228));
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
         var18 = 39501541;
         var17 = -1200901063;
         var10000 = (var17 | var18) & (~var17 | ~var18);
         var18 = -1171191076;
         var17 = var10000;

         for (int var16 = var17 & ~var18 | ~var17 & var18; var16 < var15.length; var16++) {
            var18 = 1419950523;
            var17 = 31095194;
            int var10001 = var17 & ~var18 | ~var17 & var18;
            var18 = 1433976867;
            var17 = var10001;
            switch (var16 % (var17 & ~var18 | ~var17 & var18)) {
               case 0:
                  var18 = var12;
                  var17 = var13;
                  var10002 = (var17 | var18) - (var17 & var18);
                  char var238 = var14[var16];
                  var17 = var10002;
                  var15[var16] = (char)((var17 | var238) - (var17 & var238));
                  break;
               case 1:
                  var18 = var13;
                  var17 = var5;
                  var10002 = (var17 | var18) - (var17 & var18);
                  char var236 = var14[var16];
                  var17 = var10002;
                  var15[var16] = (char)((var17 | var236) - (var17 & var236));
            }
         }

         return new String(var15);
      }
   }

   public enum Layer {
      BACKGROUND(0),
      CATEGORIES(1),
      TABS(2),
      CONTENT(3),
      SCROLLBAR(4),
      SETTINGS_PANEL(5),
      DROPDOWN(6),
      KEYBIND_PANEL(7),
      MODAL_OVERLAY(8);

      private final int order;
      public static int j;
      public static boolean k;

      Layer(int order) {
         this.order = order;
      }

      public int a() {
         return this.order;
      }

      public static String a(String value, String key, int seed1, int seed2, int seed3, int seed4) {
         return value;
      }
   }
}
