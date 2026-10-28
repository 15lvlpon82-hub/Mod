package pulse;




import pulse.module.ModuleRegistry;
import pulse.module.ClientModule;
import pulse.module.ModuleCategory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.client.util.math.MatrixStack;

public class ModulesTab implements TabHost, GuiEntrySource, ClickGuiTab {
   private static final String[] a;
   private static final ModuleCategory[] b;
   private static final float c = 117.5F;
   private static final float d = 15.0F;
   private static final float e = 19.0F;
   private static final float f = 19.0F;
   private static final float g = 15.0F;
   private static final float h = 4.0F;
   private int i;
   private final Map<ModuleCategory, List<ModulesTab.ModuleEntry>> j;
   private final List<ModulesTab.ModuleEntry> k;
   private final TabSelector l;
   private final ModuleGrid m;
   private final PanelFadeOverlay n;
   private final SearchBox o;
   private final SettingsIconButton p;
   private String q;
   private List<ModulesTab.ModuleEntry> r;
   private boolean s;

   public ModulesTab() {
      int var9 = -324145636;
      int var8 = -2010958351;
      int var10001 = (var8 | var9) & ~(var8 & var9);
      var9 = 1687084013;
      var8 = var10001;
      this.i = var8 & ~var9 | ~var8 & var9;
      int var10003 = (int)-6198440089719751734L;
      var9 = -558282561;
      var8 = var10003;
      var10003 = var8 & ~var9 | ~var8 & var9;
      var9 = -1007333827;
      var8 = var10003;
      var10003 = var8 & ~var9 | ~var8 & var9;
      var9 = -1429658405;
      var8 = 494025399;
      int var10004 = var8 + var9 - 2 * (var8 & var9);
      var9 = 2076934811;
      var8 = var10004;
      var10004 = (var8 | var9) & (~var8 | ~var9);
      var9 = 1502025353;
      var8 = 1906071997;
      int var10005 = (var8 | var9) & (~var8 | ~var9);
      var9 = 904991197;
      var8 = var10005;
      var10005 = var8 & ~var9 | ~var8 & var9;
      int var10006 = (int)5683486444866038845L;
      var9 = 468124058;
      var8 = var10006;
      var10006 = var8 + var9 - 2 * (var8 & var9);
      var9 = 1007431834;
      var8 = var10006;
      this.q = b("", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁼꤊ絲蹟⑶謲㑤=\ua7cb꒺ꁵꤐ絺蹏⑩謚㑲|ꟳ", var10003, var10004, var10005, var8 + var9 - 2 * (var8 & var9));
      var10001 = (int)-2144793809726170021L;
      var9 = -1694321331;
      var8 = var10001;
      var10001 = (var8 | var9) & (~var8 | ~var9);
      var9 = 1574054166;
      var8 = var10001;
      this.s = pulse.Bool.from(var8 & ~var9 | ~var8 & var9);
      this.j = new HashMap<>();
      this.k = new ArrayList<>();
      ModuleCategory[] var1 = ModuleCategory.values();
      int var2 = var1.length;
      var9 = -740426379;
      var8 = 974994859;
      int var10000 = (var8 | var9) & (~var8 | ~var9);
      var9 = -373243682;
      var8 = var10000;

      for (int var3 = var8 + var9 - 2 * (var8 & var9); var3 < var2; var3++) {
         ModuleCategory var4 = var1[var3];
         ArrayList<ModulesTab.ModuleEntry> var5 = new ArrayList<>();

         for (ClientModule var7 : ModuleRegistry.byCategory(var4)) {
            var5.add(new ModulesTab.ModuleEntry(var7));
         }

         var5.sort(Comparator.comparing(var0 -> var0.a().toLowerCase()));
         this.j.put(var4, var5);
         this.k.addAll(var5);
      }

      this.k.sort(Comparator.comparing(var0 -> var0.a().toLowerCase()));
      this.r = new ArrayList<>();
      this.l = new TabSelector(this);
      this.m = new ModuleGrid(this);
      this.n = new PanelFadeOverlay();
      this.o = new SearchBox(117.5F, 15.0F);
      this.o.a(this::a);
      this.p = new SettingsIconButton();
      this.p.a(var1x -> this.s());
   }

   private void s() {
   }

   private void a(String var1) {
      this.q = var1 == null ? "" : var1.toLowerCase().trim();
      if (!this.q.isEmpty()) {
         this.s = true;
         this.r = new ArrayList<>();

         for (int var2 = 0; var2 < this.k.size(); var2++) {
            ModulesTab.ModuleEntry var3 = this.k.get(var2);
            if (var3.a().toLowerCase().contains(this.q)) {
               this.r.add(var3);
            }
         }

         this.m.d();
      } else {
         this.s = false;
         if (this.r != null) {
            this.r.clear();
         }
      }
   }

   private boolean a(String var1, String var2) {
      String var3 = var1.toLowerCase();
      if (var3.contains(var2)) {
         int var90 = (int)-3427509272253018869L;
         int var84 = -1549633371;
         int var45 = var90;
         var90 = var45 + var84 - 2 * (var45 & var84);
         var84 = -1599982161;
         var45 = var90;
         return pulse.Bool.from((var45 | var84) - (var45 & var84));
      } else {
         int var10003 = (int)4458666709489734258L;
         int var7 = 710947980;
         int var6 = var10003;
         var10003 = (var6 | var7) & (~var6 | ~var7);
         var7 = -1151050826;
         var6 = var10003;
         var10003 = (var6 | var7) & ~(var6 & var7);
         var7 = 51120002;
         var6 = -1568134790;
         int var10004 = (var6 | var7) - (var6 & var7);
         var7 = -148678135;
         var6 = var10004;
         var10004 = (var6 | var7) & (~var6 | ~var7);
         var7 = 1869921174;
         var6 = 1019821320;
         int var10005 = var6 + var7 - 2 * (var6 & var7);
         var7 = 1312821011;
         var6 = var10005;
         var10005 = (var6 | var7) & ~(var6 & var7);
         int var10006 = (int)-5542007986148657305L;
         var7 = 1025382864;
         var6 = var10006;
         var10006 = var6 + var7 - 2 * (var6 & var7);
         var7 = 1312743513;
         var6 = var10006;
         String var10001 = b("嗓", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁼꤊ絲蹟⑶謲㑤=\ua7cb꒺ꁵꤐ絺蹏⑩謚㑲|ꟳ", var10003, var10004, var10005, (var6 | var7) - (var6 & var7));
         var7 = -865468997;
         var6 = -729825509;
         var10004 = (var6 | var7) & ~(var6 & var7);
         var7 = 1206714344;
         var6 = var10004;
         var10004 = var6 & ~var7 | ~var6 & var7;
         var10005 = (int)5484280748576403551L;
         var7 = -571422409;
         var6 = var10005;
         var10005 = (var6 | var7) & (~var6 | ~var7);
         var7 = 537607913;
         var6 = var10005;
         var10005 = (var6 | var7) - (var6 & var7);
         var10006 = (int)2628788098089586193L;
         var7 = 1073913114;
         var6 = var10006;
         var10006 = var6 & ~var7 | ~var6 & var7;
         var7 = -1348315479;
         var6 = var10006;
         var10006 = (var6 | var7) & (~var6 | ~var7);
         var7 = 33233292;
         var6 = 1571520963;
         int var10007 = var6 & ~var7 | ~var6 & var7;
         var7 = 1549269297;
         var6 = var10007;
         String var4 = var3.replace(
            var10001, b("", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁼꤊ絲蹟⑶謲㑤=\ua7cb꒺ꁵꤐ絺蹏⑩謚㑲|ꟳ", var10004, var10005, var10006, var6 + var7 - 2 * (var6 & var7))
         );
         var7 = -780314602;
         var6 = 163448704;
         var10003 = (var6 | var7) - (var6 & var7);
         var7 = -2026249506;
         var6 = var10003;
         var10003 = (var6 | var7) - (var6 & var7);
         var10004 = (int)7607635620612753572L;
         var7 = -537170291;
         var6 = var10004;
         var10004 = (var6 | var7) & ~(var6 & var7);
         var7 = -1303270805;
         var6 = var10004;
         var10004 = (var6 | var7) - (var6 & var7);
         var10005 = (int)6412906875551290287L;
         var7 = 1683148215;
         var6 = var10005;
         var10005 = (var6 | var7) & (~var6 | ~var7);
         var7 = -116224156;
         var6 = var10005;
         var10005 = (var6 | var7) & (~var6 | ~var7);
         var10006 = (int)8739163729813367243L;
         var7 = 581881185;
         var6 = var10006;
         var10006 = (var6 | var7) & ~(var6 & var7);
         var7 = 388743829;
         var6 = var10006;
         var10001 = b("嗓", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁼꤊ絲蹟⑶謲㑤=\ua7cb꒺ꁵꤐ絺蹏⑩謚㑲|ꟳ", var10003, var10004, var10005, (var6 | var7) - (var6 & var7));
         var10004 = (int)5169967478528758103L;
         var7 = 786377452;
         var6 = var10004;
         var10004 = (var6 | var7) - (var6 & var7);
         var7 = -1021131021;
         var6 = var10004;
         var10004 = var6 & ~var7 | ~var6 & var7;
         var7 = -1930817093;
         var6 = -1970307047;
         var10005 = (var6 | var7) - (var6 & var7);
         var7 = 1354879124;
         var6 = var10005;
         var10005 = var6 + var7 - 2 * (var6 & var7);
         var10006 = (int)-750012175084952987L;
         var7 = 1731358098;
         var6 = var10006;
         var10006 = (var6 | var7) - (var6 & var7);
         var7 = -436563063;
         var6 = var10006;
         var10006 = (var6 | var7) & (~var6 | ~var7);
         var7 = 674963180;
         var6 = 1766504134;
         var10007 = var6 + var7 - 2 * (var6 & var7);
         var7 = 1097413401;
         var6 = var10007;
         String var5 = var2.replace(
            var10001, b("", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁼꤊ絲蹟⑶謲㑤=\ua7cb꒺ꁵꤐ絺蹏⑩謚㑲|ꟳ", var10004, var10005, var10006, (var6 | var7) & ~(var6 & var7))
         );
         if (var4.contains(var5)) {
            int var88 = (int)-7434290175243946L;
            var7 = -862123886;
            var6 = var88;
            var88 = (var6 | var7) & (~var6 | ~var7);
            var7 = -1569750587;
            var6 = var88;
            return pulse.Bool.from(var6 + var7 - 2 * (var6 & var7));
         } else if (this.b(var3, var2)) {
            var7 = 1027623431;
            var6 = -1577003661;
            int var87 = var6 & ~var7 | ~var6 & var7;
            var7 = -1623154827;
            var6 = var87;
            return pulse.Bool.from((var6 | var7) & (var6 & var7 ^ -1));
         } else {
            int var10000 = (int)-6873001754192954878L;
            var7 = 735944077;
            var6 = var10000;
            var10000 = (var6 | var7) & (~var6 | ~var7);
            var7 = -1754486897;
            var6 = var10000;
            return pulse.Bool.from((var6 | var7) & (var6 & var7 ^ -1));
         }
      }
   }

   private boolean b(String var1, String var2) {
      int var10 = -2124196267;
      int var9 = -1944671612;
      int var10003 = var9 & ~var10 | ~var9 & var10;
      var10 = 1385120153;
      var9 = var10003;
      var10003 = (var9 | var10) & (~var9 | ~var10);
      int var10004 = (int)2534825157694601498L;
      var10 = -1274278827;
      var9 = var10004;
      var10004 = var9 & ~var10 | ~var9 & var10;
      var10 = -1327381304;
      var9 = var10004;
      var10004 = var9 + var10 - 2 * (var9 & var10);
      var10 = -353882710;
      var9 = 1901830731;
      int var10005 = (var9 | var10) & ~(var9 & var10);
      var10 = -1734351248;
      var9 = var10005;
      var10005 = var9 + var10 - 2 * (var9 & var10);
      var10 = -1732345884;
      var9 = -1213533092;
      int var10006 = (var9 | var10) & ~(var9 & var10);
      var10 = 789069975;
      var9 = var10006;
      String[] var3 = var1.split(
         b("푸", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁼꤊ絲蹟⑶謲㑤=\ua7cb꒺ꁵꤐ絺蹏⑩謚㑲|ꟳ", var10003, var10004, var10005, (var9 | var10) - (var9 & var10))
      );
      StringBuilder var4 = new StringBuilder();
      String[] var5 = var3;
      int var6 = var5.length;
      var10 = -508975611;
      var9 = -184282636;
      int var10000 = var9 & ~var10 | ~var9 & var10;
      var10 = 346929137;
      var9 = var10000;

      for (int var7 = var9 + var10 - 2 * (var9 & var10); var7 < var6; var7++) {
         String var8 = var5[var7];
         if (!var8.isEmpty()) {
            var10 = 447102086;
            var9 = 161914849;
            int var10002 = (var9 | var10) - (var9 & var10);
            var10 = 318808935;
            var9 = var10002;
            var4.append(var8.charAt(var9 + var10 - 2 * (var9 & var10)));
         }
      }

      String var65 = var4.toString();
      var10 = -1132556607;
      var9 = 1792051603;
      var10004 = (var9 | var10) & (~var9 | ~var10);
      var10 = -1990936038;
      var9 = var10004;
      var10004 = (var9 | var10) & ~(var9 & var10);
      var10005 = (int)368981431465750469L;
      var10 = 912838574;
      var9 = var10005;
      var10005 = (var9 | var10) & ~(var9 & var10);
      var10 = 407862694;
      var9 = var10005;
      var10005 = (var9 | var10) & ~(var9 & var10);
      var10 = -1803116821;
      var9 = -1913277966;
      var10006 = var9 & ~var10 | ~var9 & var10;
      var10 = 100609129;
      var9 = var10006;
      var10006 = var9 & ~var10 | ~var9 & var10;
      int var10007 = (int)-4835884369132908930L;
      var10 = 606914919;
      var9 = var10007;
      var10007 = (var9 | var10) & ~(var9 & var10);
      var10 = -1768705940;
      var9 = var10007;
      String var66 = b("푸", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁼꤊ絲蹟⑶謲㑤=\ua7cb꒺ꁵꤐ絺蹏⑩謚㑲|ꟳ", var10004, var10005, var10006, (var9 | var10) & (~var9 | ~var10));
      var10005 = (int)7997613619903571605L;
      var10 = -186681339;
      var9 = var10005;
      var10005 = (var9 | var10) & (~var9 | ~var10);
      var10 = 2047370200;
      var9 = var10005;
      var10005 = (var9 | var10) & (~var9 | ~var10);
      var10006 = (int)-3989408016300460597L;
      var10 = -57686786;
      var9 = var10006;
      var10006 = var9 & ~var10 | ~var9 & var10;
      var10 = 939746515;
      var9 = var10006;
      var10006 = var9 & ~var10 | ~var9 & var10;
      var10 = 1101401110;
      var9 = -912497137;
      var10007 = (var9 | var10) - (var9 & var10);
      var10 = -2085685577;
      var9 = var10007;
      var10007 = var9 & ~var10 | ~var9 & var10;
      var10 = 232840942;
      var9 = -188861880;
      int var10008 = var9 & ~var10 | ~var9 & var10;
      var10 = -111672536;
      var9 = var10008;
      return var65.contains(
         var2.replace(
            var66, b("", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁼꤊ絲蹟⑶謲㑤=\ua7cb꒺ꁵꤐ絺蹏⑩謚㑲|ꟳ", var10005, var10006, var10007, var9 + var10 - 2 * (var9 & var10))
         )
      );
   }

   public ModuleCategory g() {
      return b[this.i];
   }

   public void a(ModuleCategory var1) {
      int var4 = -2092047125;
      int var3 = 1794166584;
      int var10000 = (var3 | var4) & ~(var3 & var4);
      var4 = -373478445;
      var3 = var10000;

      for (int var2 = (var3 | var4) - (var3 & var4); var2 < b.length; var2++) {
         if (b[var2] == var1) {
            if (this.i != var2) {
               this.i = var2;
               this.m.d();
            }
            break;
         }
      }
   }

   @Override
   public String[] c() {
      return a;
   }

   @Override
   public int d() {
      return this.i;
   }

   @Override
   public void a(int var1) {
      if (var1 >= 0 && var1 < b.length && this.i != var1) {
         this.i = var1;
         this.m.d();
      }
   }

   @Override
   public List<? extends GuiEntry> e() {
      if (this.s) {
         return this.r != null && !this.r.isEmpty() ? this.r : Collections.emptyList();
      }

      List<ModulesTab.ModuleEntry> var1 = this.j.get(this.g());
      return var1 == null ? Collections.emptyList() : var1;
   }

   @Override
   public int f() {
      int var10000 = (int)-6679488703817944820L;
      int var2 = 798168344;
      int var1 = var10000;
      var10000 = (var1 | var2) & ~(var1 & var2);
      var2 = -534682602;
      var1 = var10000;
      return (var1 | var2) & (~var1 | ~var2);
   }

   public List<ModuleCard> h() {
      return this.m.a();
   }

   public boolean i() {
      for (ModuleCard var3 : this.m.a()) {
         if (!var3.f()) {
            int var5 = -1478541215;
            int var4 = -917460358;
            int var10000 = var4 + var5 - 2 * (var4 & var5);
            var5 = 1854925338;
            var4 = var10000;
            return pulse.Bool.from((var4 | var5) - (var4 & var5));
         }
      }

      int var10 = -1465003784;
      int var7 = 675283918;
      int var12 = (var7 | var10) & (~var7 | ~var10);
      var10 = -2131897546;
      var7 = var12;
      return pulse.Bool.from(var7 & (var10 ^ -1) | (var7 ^ -1) & var10);
   }

   public boolean j() {
      return this.m.j();
   }

   public void a(MatrixStack var1, Renderer2D var2) {
      this.m.a(var1, var2);
   }

   public void a(MatrixStack var1, Renderer2D var2, int var3, int var4) {
      this.m.a(var1, var2, var3, var4);
   }

   public void k() {
      this.m.e();
   }

   public void l() {
      this.m.f();
   }

   public void m() {
      this.m.g();
   }

   public void n() {
      this.m.h();
   }

   public void o() {
      this.m.i();
   }

   @Override
   public void a(MatrixStack var1, Renderer2D var2, float var3, float var4, int var5, int var6) {
      this.m.b();
      this.l.a(var1, var2, var3, var4, var5, var6);
      float var7 = pulse.PulseClickGuiScreen.d();
      float var8 = var3 + var7 - 19.0F - 15.0F;
      float var9 = var8 - 4.0F - 117.5F;
      float var10 = var4 + 19.0F - 3.0F;
      this.o.a(var1, var2, var9, var10, 117.5F, 15.0F, var5, var6);
      this.p.a(var1, var2, var8, var10, 15.0F, var5, var6);
      this.m.a(var1, var2, var3, var4, var5, var6);
      this.n.a(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void a(float var1, float var2, int var3, int var4) {
      this.m.b();
      if (!this.o.a(var3, var4)) {
         if (!this.p.a(var3, var4)) {
            if (!this.m.j() && !this.o.c()) {
               this.l.a(var1, var2, var3, var4);
            }

            this.m.a(var1, var2, var3, var4);
         }
      }
   }

   @Override
   public void b(float var1, float var2, int var3, int var4) {
      this.m.b(var1, var2, var3, var4);
   }

   @Override
   public void c(float var1, float var2, int var3, int var4) {
      this.m.c(var1, var2, var3, var4);
   }

   @Override
   public void a(float var1, float var2, int var3, int var4, double var5, double var7) {
      this.m.a(var1, var2, var3, var4, var5, var7);
   }

   @Override
   public void a(float var1) {
      this.m.a(var1);
   }

   public void a(float var1, int var2, int var3) {
      this.m.a(var1, var2, var3);
   }

   @Override
   public boolean a(int var1, int var2, int var3) {
      if (this.m.p()) {
         this.m.a(var1, var2, var3);
         return true;
      } else {
         return this.o.c() && this.o.a(var1, var2, var3) ? true : this.m.a(var1, var2, var3);
      }
   }

   @Override
   public boolean b() {
      int var9;
      if (!this.o.c() && !this.m.c()) {
         var9 = (int)-4651593753849958050L;
         int var7 = -10842553;
         int var4 = var9;
         var9 = var4 + var7 - 2 * (var4 & var7);
         var7 = -1191018727;
         var4 = var9;
         var9 = (var4 | var7) & (~var4 | ~var7);
      } else {
         int var2 = 1071032481;
         int var1 = 802705361;
         var9 = (var1 | var2) & (~var1 | ~var2);
         var2 = 269412209;
         var1 = var9;
         var9 = (var1 | var2) - (var1 & var2);
      }

      return pulse.Bool.from(var9);
   }

   public boolean a(char var1, int var2) {
      return this.o.c() ? this.o.a(var1, var2) : this.m.a(var1, var2);
   }

   public boolean p() {
      return this.o.c();
   }

   public boolean hasOpenSettingsAt(int var1, int var2) {
      return this.m.hasOpenSettingsAt(var1, var2);
   }

   public String q() {
      return this.q;
   }

   public boolean r() {
      return this.s;
   }

   @Override
   public ClickGuiTabType a() {
      return ClickGuiTabType.MODULES;
   }

   static {
      int var10000 = (int)4100800859266318579L;
      int var1 = 1785887642;
      int var0 = var10000;
      var10000 = (var0 | var1) & ~(var0 & var1);
      var1 = -446825622;
      var0 = var10000;
      String[] var81 = new String[(var0 | var1) - (var0 & var1)];
      var1 = 1600233001;
      var0 = 1463124937;
      int var10002 = (var0 | var1) & ~(var0 & var1);
      var1 = 139730400;
      var0 = var10002;
      var10002 = (var0 | var1) & (~var0 | ~var1);
      var1 = -476108213;
      var0 = 1214417895;
      int var10005 = var0 + var1 - 2 * (var0 & var1);
      var1 = -200860444;
      var0 = var10005;
      var10005 = (var0 | var1) & (~var0 | ~var1);
      int var10006 = (int)-5325998925601318690L;
      var1 = 162182993;
      var0 = var10006;
      var10006 = (var0 | var1) - (var0 & var1);
      var1 = -392433763;
      var0 = var10006;
      var10006 = (var0 | var1) & ~(var0 & var1);
      var1 = -1515497665;
      var0 = 1940541922;
      int var10007 = (var0 | var1) - (var0 & var1);
      var1 = -920300741;
      var0 = var10007;
      var10007 = (var0 | var1) - (var0 & var1);
      int var10008 = (int)-6244707417743518522L;
      var1 = -411797578;
      var0 = var10008;
      var10008 = var0 & ~var1 | ~var0 & var1;
      var1 = -1743038639;
      var0 = var10008;
      var81[var10002] = b("뎷뫡뎒뫽뎀뫤뎒", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁼꤊ絲蹟⑶謲㑤=\ua7cb꒺ꁵꤐ絺蹏⑩謚㑲|ꟳ", var10005, var10006, var10007, var0 + var1 - 2 * (var0 & var1));
      var10002 = (int)8287996991159914906L;
      var1 = -70521957;
      var0 = var10002;
      var10002 = var0 + var1 - 2 * (var0 & var1);
      var1 = -161728000;
      var0 = var10002;
      var10002 = (var0 | var1) - (var0 & var1);
      var10005 = (int)5677738873098149479L;
      var1 = 124261213;
      var0 = var10005;
      var10005 = var0 & ~var1 | ~var0 & var1;
      var1 = 182694002;
      var0 = var10005;
      var10005 = (var0 | var1) & (~var0 | ~var1);
      var1 = -1718543970;
      var0 = 1739776825;
      var10006 = var0 + var1 - 2 * (var0 & var1);
      var1 = 302080563;
      var0 = var10006;
      var10006 = (var0 | var1) - (var0 & var1);
      var1 = 171057470;
      var0 = 1355065529;
      var10007 = var0 & ~var1 | ~var0 & var1;
      var1 = 1252485425;
      var0 = var10007;
      var10007 = (var0 | var1) & (~var0 | ~var1);
      var1 = -1293087858;
      var0 = 1455188827;
      var10008 = (var0 | var1) - (var0 & var1);
      var1 = -465523594;
      var0 = var10008;
      var81[var10002] = b("뎩쉟뎥", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁼꤊ絲蹟⑶謲㑤=\ua7cb꒺ꁵꤐ絺蹏⑩謚㑲|ꟳ", var10005, var10006, var10007, (var0 | var1) - (var0 & var1));
      var10002 = (int)1567631648413433340L;
      var1 = -1516258431;
      var0 = var10002;
      var10002 = var0 + var1 - 2 * (var0 & var1);
      var1 = 331875967;
      var0 = var10002;
      var10002 = (var0 | var1) - (var0 & var1);
      var10005 = (int)-8439294714360032988L;
      var1 = 2017760195;
      var0 = var10005;
      var10005 = var0 & ~var1 | ~var0 & var1;
      var1 = -1945944145;
      var0 = var10005;
      var10005 = var0 + var1 - 2 * (var0 & var1);
      var1 = 1152690982;
      var0 = -1192002213;
      var10006 = var0 & ~var1 | ~var0 & var1;
      var1 = 275817558;
      var0 = var10006;
      var10006 = (var0 | var1) & (~var0 | ~var1);
      var10007 = (int)-885252469607367671L;
      var1 = -2002324845;
      var0 = var10007;
      var10007 = (var0 | var1) & (~var0 | ~var1);
      var1 = 594714124;
      var0 = var10007;
      var10007 = (var0 | var1) & (~var0 | ~var1);
      var1 = -910956174;
      var0 = 109980202;
      var10008 = (var0 | var1) & ~(var0 & var1);
      var1 = -820288158;
      var0 = var10008;
      var81[var10002] = b(
         "뎴꣧뎈ꣿ뎈꣧뎈ꣶ뎒", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁼꤊ絲蹟⑶謲㑤=\ua7cb꒺ꁵꤐ絺蹏⑩謚㑲|ꟳ", var10005, var10006, var10007, (var0 | var1) & (~var0 | ~var1)
      );
      a = var81;
      var10000 = (int)-2690554047234769789L;
      var1 = -732947220;
      var0 = var10000;
      var10000 = (var0 | var1) & ~(var0 & var1);
      var1 = -1312497556;
      var0 = var10000;
      ModuleCategory[] var84 = new ModuleCategory[var0 & ~var1 | ~var0 & var1];
      var1 = 807576853;
      var0 = -683175729;
      var10002 = (var0 | var1) & (~var0 | ~var1);
      var1 = -412797478;
      var0 = var10002;
      var84[var0 + var1 - 2 * (var0 & var1)] = ModuleCategory.VISUALS;
      var1 = 617916513;
      var0 = 145285228;
      var10002 = (var0 | var1) & ~(var0 & var1);
      var1 = 746342412;
      var0 = var10002;
      var84[var0 & ~var1 | ~var0 & var1] = ModuleCategory.HUD;
      var1 = -385042828;
      var0 = -747632549;
      var10002 = (var0 | var1) & ~(var0 & var1);
      var1 = 981253677;
      var0 = var10002;
      var84[(var0 | var1) & ~(var0 & var1)] = ModuleCategory.UTILITIES;
      b = var84;
   }

   public static String b(String var0, String var1, int var2, int var3, int var4, int var5) {
      char[] var6 = var1.toCharArray();
      char[] var7 = new char[var6.length];
      int var10000 = (int)1538243863228038010L;
      int var18 = -1565243327;
      int var17 = var10000;
      var10000 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1729491761;
      var17 = var10000;
      char[] var220 = new char[(var17 | var18) & ~(var17 & var18)];
      var18 = -205404283;
      var17 = 708457179;
      int var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -637799074;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      int var10003 = (int)-6622364000867267214L;
      var18 = -1058690782;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -367186846;
      var17 = var10003;
      var220[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var10002 = (int)5921886460185296461L;
      var18 = 467822655;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 812144243;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -245159937;
      var17 = 758480499;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -598312439;
      var17 = var10003;
      var220[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var10002 = (int)7140881127242776713L;
      var18 = -1095495693;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -1574121608;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1808340555;
      var17 = 1986730936;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 497167989;
      var17 = var10003;
      var220[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var18 = 1656491677;
      var17 = 2117674317;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 478489555;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)7911021185777782000L;
      var18 = -1089999397;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 467188024;
      var17 = var10003;
      var220[var10002] = (char)((var17 | var18) - (var17 & var18));
      var10002 = (int)-9099925338851306238L;
      var18 = 322933506;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 873367044;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 246386927;
      var17 = -839337670;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -1017661200;
      var17 = var10003;
      var220[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var10002 = (int)4449945882483576155L;
      var18 = -851988563;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -971840781;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -611517016;
      var17 = 1241448010;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1838004640;
      var17 = var10003;
      var220[var10002] = (char)((var17 | var18) - (var17 & var18));
      var18 = -931723210;
      var17 = -80295362;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 859947534;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 2066099422;
      var17 = 506898764;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 1695583361;
      var17 = var10003;
      var220[var10002] = (char)((var17 | var18) - (var17 & var18));
      var10002 = (int)8495338681459435226L;
      var18 = 1378141424;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 287482413;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 577983387;
      var17 = -137497751;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -708930352;
      var17 = var10003;
      var220[var10002] = (char)((var17 | var18) - (var17 & var18));
      var18 = 831712521;
      var17 = -2137360533;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -1324836246;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1828053908;
      var17 = -157060711;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1705600418;
      var17 = var10003;
      var220[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var18 = 665855248;
      var17 = -1156396934;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -1667043997;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)5535955758414195670L;
      var18 = -1393082998;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -730246792;
      var17 = var10003;
      var220[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      char[] var8 = var220;
      var18 = 745331926;
      var17 = 1061022123;
      var10000 = (var17 | var18) & ~(var17 & var18);
      var18 = 324089207;
      var17 = var10000;
      char[] var222 = new char[var17 & ~var18 | ~var17 & var18];
      var10002 = (int)-236586005604894995L;
      var18 = -180827259;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -63980184;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -378343024;
      var17 = -1152274266;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 1378027798;
      var17 = var10003;
      var222[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var18 = -422700162;
      var17 = 647634490;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1068235451;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 1863722454;
      var17 = 1802395877;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 75022640;
      var17 = var10003;
      var222[var10002] = (char)((var17 | var18) - (var17 & var18));
      var18 = 266134732;
      var17 = -624864110;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -719474596;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1029068186;
      var17 = -623140174;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -410161029;
      var17 = var10003;
      var222[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var18 = 706291810;
      var17 = -1054771264;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -348627039;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -310244323;
      var17 = -346688638;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 114804637;
      var17 = var10003;
      var222[var10002] = (char)((var17 | var18) - (var17 & var18));
      var18 = -657948075;
      var17 = 1259819339;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1814047974;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 1551060864;
      var17 = -478926601;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -1090035913;
      var17 = var10003;
      var222[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var18 = 487914492;
      var17 = -846292712;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -795188511;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)533368891348687994L;
      var18 = -2102002739;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -979312861;
      var17 = var10003;
      var222[var10002] = (char)((var17 | var18) - (var17 & var18));
      var10002 = (int)-1726067025342528670L;
      var18 = 1280882976;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 866728516;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -765041380;
      var17 = 560579302;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -217112381;
      var17 = var10003;
      var222[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var10002 = (int)744751873062491159L;
      var18 = -319156478;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 457726738;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1334808232;
      var17 = 1646000417;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -764700607;
      var17 = var10003;
      var222[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var18 = -1979368672;
      var17 = 355977692;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1624050956;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -1753998404;
      var17 = -1806700745;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 54228879;
      var17 = var10003;
      var222[var10002] = (char)((var17 | var18) - (var17 & var18));
      var18 = 870922000;
      var17 = -1436988553;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -1716487058;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1892003974;
      var17 = -1287505582;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 1014514971;
      var17 = var10003;
      var222[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      char[] var9 = var222;
      var10000 = (int)4336453403478292741L;
      var18 = 1703142302;
      var17 = var10000;
      var10000 = var17 + var18 - 2 * (var17 & var18);
      var18 = 2128124571;
      var17 = var10000;

      for (int var10 = var17 + var18 - 2 * (var17 & var18); var10 < var6.length; var10++) {
         char var277 = var6[var10];
         char var205 = var8[var10 % var8.length];
         char var106 = var277;
         var7[var10] = (char)(var106 + var205 - 2 * (var106 & var205));
      }

      char[] var19 = new char[var7.length];
      var10000 = (int)3785038791653823506L;
      var18 = 1262152913;
      var17 = var10000;
      var10000 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1453553859;
      var17 = var10000;

      for (int var11 = (var17 | var18) - (var17 & var18); var11 < var6.length; var11++) {
         char var278 = var7[var11];
         char var208 = var9[var11 % var9.length];
         char var109 = var278;
         var19[var11] = (char)((var109 | var208) & ~(var109 & var208));
      }

      String var20 = new String(var19);
      int var12 = var20.hashCode();
      var18 = var5;
      var17 = var3;
      var10000 = (var17 & ~var18) - (~var17 & var18);
      var18 = var2;
      var17 = var10000;
      int var13 = var17 + ~var18 + 1;
      char[] var14 = var0.toCharArray();
      char[] var15 = new char[var14.length];
      var18 = -314219011;
      var17 = -1930293815;
      var10000 = (var17 | var18) - (var17 & var18);
      var18 = 1639409716;
      var17 = var10000;

      for (int var16 = (var17 | var18) & (~var17 | ~var18); var16 < var15.length; var16++) {
         int var10001 = (int)-1418819982154549307L;
         var18 = 2032662874;
         var17 = var10001;
         var10001 = var17 + var18 - 2 * (var17 & var18);
         var18 = 710168221;
         var17 = var10001;
         switch (var16 % ((var17 | var18) & ~(var17 & var18))) {
            case 0:
               var18 = var12;
               var17 = var13;
               var10002 = (var17 | var18) & ~(var17 & var18);
               char var218 = var14[var16];
               var17 = var10002;
               var15[var16] = (char)((var17 | var218) & ~(var17 & var218));
               break;
            case 1:
               var18 = var13;
               var17 = var5;
               var10002 = var17 + var18 - 2 * (var17 & var18);
               char var216 = var14[var16];
               var17 = var10002;
               var15[var16] = (char)((var17 | var216) - (var17 & var216));
         }
      }

      return new String(var15);
   }

   public static class ModuleEntry implements GuiEntry {
      private final ClientModule a;

      public ModuleEntry(ClientModule var1) {
         this.a = var1;
      }

      @Override
      public String a() {
         return this.a.g();
      }

      @Override
      public boolean b() {
         return this.a.k();
      }

      @Override
      public void a(boolean var1) {
         this.a.b(var1);
      }

      public ModuleCategory i() {
         return this.a.i();
      }

      @Override
      public ClientModule e() {
         return this.a;
      }

      public static String b(String var0, String var1, int var2, int var3, int var4, int var5) {
         char[] var6 = var1.toCharArray();
         char[] var7 = new char[var6.length];
         int var18 = 435333612;
         int var17 = -762771760;
         int var10000 = var17 & ~var18 | ~var17 & var18;
         var18 = -881086666;
         var17 = var10000;
         char[] var219 = new char[var17 + var18 - 2 * (var17 & var18)];
         var18 = -1738003953;
         var17 = -947808530;
         int var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = 1609153761;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = 1439064607;
         var17 = 993522622;
         int var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = 1861343635;
         var17 = var10003;
         var219[var10002] = (char)((var17 | var18) - (var17 & var18));
         var10002 = (int)-7813010509129221789L;
         var18 = -396919454;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = -1599994880;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var10003 = (int)-4426623298377372107L;
         var18 = 135100534;
         var17 = var10003;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = 833811910;
         var17 = var10003;
         var219[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         var10002 = (int)-6938887701520211207L;
         var18 = -489187780;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = -732416825;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var10003 = (int)-7718966141059442107L;
         var18 = 1035869858;
         var17 = var10003;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = 895248225;
         var17 = var10003;
         var219[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var18 = 1022966520;
         var17 = -977392790;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = -112782959;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var10003 = (int)3882291488219214859L;
         var18 = 1788583057;
         var17 = var10003;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = 1733243017;
         var17 = var10003;
         var219[var10002] = (char)((var17 | var18) - (var17 & var18));
         var18 = -487887169;
         var17 = 933080752;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = -713637877;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = -1106695127;
         var17 = 1571021833;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = -475375355;
         var17 = var10003;
         var219[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var18 = -1838763398;
         var17 = 423333259;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = -1956823052;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var10003 = (int)-4409416115972612549L;
         var18 = -273337896;
         var17 = var10003;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = 2066000481;
         var17 = var10003;
         var219[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var10002 = (int)2484470898667599852L;
         var18 = 41825397;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = 2073985951;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var10003 = (int)6986472377390696080L;
         var18 = 60393111;
         var17 = var10003;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = 2095712532;
         var17 = var10003;
         var219[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var18 = -1899635409;
         var17 = 956538853;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = -1211743539;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var10003 = (int)-5065827894557546053L;
         var18 = -1942902365;
         var17 = var10003;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = 663778362;
         var17 = var10003;
         var219[var10002] = (char)((var17 | var18) - (var17 & var18));
         var18 = -399791124;
         var17 = -1358733392;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = 1193866324;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = 374716982;
         var17 = -268411000;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = -430576147;
         var17 = var10003;
         var219[var10002] = (char)((var17 | var18) - (var17 & var18));
         var18 = 790809058;
         var17 = -1744623448;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = -1222516413;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var10003 = (int)1013146595328290429L;
         var18 = -717607275;
         var17 = var10003;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = 852117452;
         var17 = var10003;
         var219[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         char[] var8 = var219;
         var18 = 1454314369;
         var17 = -2110572767;
         var10000 = (var17 | var18) & (~var17 | ~var18);
         var18 = -727964502;
         var17 = var10000;
         char[] var221 = new char[(var17 | var18) & ~(var17 & var18)];
         var10002 = (int)7101818478600301754L;
         var18 = 1021960181;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = 1085240143;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = -1142180298;
         var17 = -1068585973;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = 2074432029;
         var17 = var10003;
         var221[var10002] = (char)((var17 | var18) & ~(var17 & var18));
         var18 = 359064115;
         var17 = -784897474;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = -1001289716;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = 392681660;
         var17 = 1890920649;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = 1741845622;
         var17 = var10003;
         var221[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var18 = 1403475092;
         var17 = 244820160;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = 1563491414;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = -1800565370;
         var17 = 1347943806;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = -990185557;
         var17 = var10003;
         var221[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         var10002 = (int)-2723078816844624989L;
         var18 = -1915171652;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = -682817764;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var10003 = (int)2988491402434421418L;
         var18 = 623246371;
         var17 = var10003;
         var10003 = (var17 | var18) - (var17 & var18);
         var18 = -313760117;
         var17 = var10003;
         var221[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var10002 = (int)-5382010836249510766L;
         var18 = -1686523008;
         var17 = var10002;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = 1131597590;
         var17 = var10002;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var10003 = (int)-2433695860826111098L;
         var18 = -1574956178;
         var17 = var10003;
         var10003 = (var17 | var18) & ~(var17 & var18);
         var18 = -432068440;
         var17 = var10003;
         var221[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var18 = -845508916;
         var17 = -305048539;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = 541842156;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = -834509859;
         var17 = 1128257916;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = -1921154507;
         var17 = var10003;
         var221[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
         var10002 = (int)-1910861661073524844L;
         var18 = -679449236;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = 1397545726;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var10003 = (int)-8307774928032984542L;
         var18 = -303807715;
         var17 = var10003;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = -1051306490;
         var17 = var10003;
         var221[var10002] = (char)((var17 | var18) & ~(var17 & var18));
         var10002 = (int)-2634401985260904544L;
         var18 = 10525712;
         var17 = var10002;
         var10002 = (var17 | var18) - (var17 & var18);
         var18 = 542114743;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var18 = 881240381;
         var17 = 219146751;
         var10003 = (var17 | var18) & (~var17 | ~var18);
         var18 = 965300474;
         var17 = var10003;
         var221[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
         var18 = 1267592690;
         var17 = -937679571;
         var10002 = (var17 | var18) & (~var17 | ~var18);
         var18 = -2087597865;
         var17 = var10002;
         var10002 = (var17 | var18) & ~(var17 & var18);
         var10003 = (int)-2375580624990990406L;
         var18 = 1108420809;
         var17 = var10003;
         var10003 = var17 & ~var18 | ~var17 & var18;
         var18 = 1242375287;
         var17 = var10003;
         var221[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
         var18 = 164819221;
         var17 = -666224115;
         var10002 = var17 + var18 - 2 * (var17 & var18);
         var18 = -778515695;
         var17 = var10002;
         var10002 = var17 & ~var18 | ~var17 & var18;
         var18 = -532211669;
         var17 = 1049260673;
         var10003 = var17 + var18 - 2 * (var17 & var18);
         var18 = -556967527;
         var17 = var10003;
         var221[var10002] = (char)((var17 | var18) - (var17 & var18));
         char[] var9 = var221;
         var10000 = (int)-8068583735653770491L;
         var18 = 2048569880;
         var17 = var10000;
         var10000 = (var17 | var18) & (~var17 | ~var18);
         var18 = 163997981;
         var17 = var10000;

         for (int var10 = (var17 | var18) - (var17 & var18); var10 < var6.length; var10++) {
            char var275 = var6[var10];
            char var205 = var8[var10 % var8.length];
            char var106 = var275;
            var7[var10] = (char)((var106 | var205) - (var106 & var205));
         }

         char[] var19 = new char[var7.length];
         var18 = 1590911577;
         var17 = -33978485;
         var10000 = var17 & ~var18 | ~var17 & var18;
         var18 = -1557469742;
         var17 = var10000;

         for (int var11 = (var17 | var18) & (~var17 | ~var18); var11 < var6.length; var11++) {
            char var276 = var7[var11];
            char var208 = var9[var11 % var9.length];
            char var109 = var276;
            var19[var11] = (char)((var109 | var208) & ~(var109 & var208));
         }

         String var20 = new String(var19);
         int var12 = var20.hashCode();
         var18 = var5;
         var17 = var3;
         var10000 = 2 * (var17 & ~var18) - (var17 ^ var18);
         var18 = var2;
         var17 = var10000;
         int var13 = var17 - var18;
         char[] var14 = var0.toCharArray();
         char[] var15 = new char[var14.length];
         var18 = -2074290258;
         var17 = -233196463;
         var10000 = (var17 | var18) - (var17 & var18);
         var18 = 1984259071;
         var17 = var10000;

         for (int var16 = var17 + var18 - 2 * (var17 & var18); var16 < var15.length; var16++) {
            int var10001 = (int)7548926553245996552L;
            var18 = -1980240320;
            var17 = var10001;
            var10001 = (var17 | var18) & (~var17 | ~var18);
            var18 = -1068877750;
            var17 = var10001;
            switch (var16 % (var17 + var18 - 2 * (var17 & var18))) {
               case 0:
                  var18 = var12;
                  var17 = var13;
                  var10002 = (var17 | var18) & (~var17 | ~var18);
                  char var218 = var14[var16];
                  var17 = var10002;
                  var15[var16] = (char)(var17 + var218 - 2 * (var17 & var218));
                  break;
               case 1:
                  var18 = var13;
                  var17 = var5;
                  var10002 = (var17 | var18) - (var17 & var18);
                  char var216 = var14[var16];
                  var17 = var10002;
                  var15[var16] = (char)((var17 | var216) & (~var17 | ~var216));
            }
         }

         return new String(var15);
      }
   }
}
