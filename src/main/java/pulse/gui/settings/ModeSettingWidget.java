package pulse;


import pulse.settings.ModeSetting;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.stream.Collectors;
import net.minecraft.client.util.math.MatrixStack;
import org.joml.Quaternionf;

public class ModeSettingWidget implements SettingWidget {
   private static final Set<ModeSettingWidget> d = Collections.newSetFromMap(new WeakHashMap<>());
   public static final float a = 25.0F;
   private static final float e = 8.0F;
   private static final float f = 17.0F;
   private static final float g = 6.0F;
   private static final float h = 20.0F;
   private static final float i = 7.5F;
   private static final float j = 6.0F;
   private static final float k = -2.0F;
   private static final float l = 7.5F;
   private static final float m = 6.0F;
   private static final float n = 1.5F;
   private static final float o = 15.0F;
   private static final Color p = pulse.Theme.U;
   private final String q;
   private final String[] r;
   private final boolean s;
   private final ModeSetting t;
   private int u;
   private final Set<Integer> v;
   private boolean w;
   private final AnimationState x;
   private final AnimationState y;
   private final MarqueeText z;
   private final List<AnimationState> A;
   private final List<Boolean> B;
   private boolean C;
   private boolean D;
   private boolean E;
   private float F;
   private float G;
   private float H;
   private float I;
   private float J;
   private float K;
   private float L;
   private float M;
   public static int b;
   public static boolean c;

   public ModeSettingWidget(ModeSetting var1) {
      int var10001 = (int)1410980259064862311L;
      int var3 = 685696400;
      int var2 = var10001;
      var10001 = var2 + var3 - 2 * (var2 & var3);
      var3 = -830950409;
      var2 = var10001;
      this.w = pulse.Bool.from((var2 | var3) & ~(var2 & var3));
      this.x = new AnimationState();
      this.y = new AnimationState();
      this.z = new MarqueeText();
      this.A = new ArrayList<>();
      this.B = new ArrayList<>();
      var3 = -285250469;
      var2 = -638806867;
      var10001 = (var2 | var3) & ~(var2 & var3);
      var3 = 924055798;
      var2 = var10001;
      this.C = pulse.Bool.from(var2 + var3 - 2 * (var2 & var3));
      var10001 = (int)2806094444908150008L;
      var3 = -1948242258;
      var2 = var10001;
      var10001 = (var2 | var3) & (~var2 | ~var3);
      var3 = 1225937494;
      var2 = var10001;
      this.D = pulse.Bool.from((var2 | var3) & (~var2 | ~var3));
      var3 = 1753750979;
      var2 = 1825757791;
      var10001 = var2 + var3 - 2 * (var2 & var3);
      var3 = 73058204;
      var2 = var10001;
      this.E = pulse.Bool.from((var2 | var3) - (var2 & var3));
      this.I = 1.0F;
      this.t = var1;
      this.q = var1.f();
      this.r = var1.a();
      this.s = var1.c();
      this.u = var1.k();
      this.v = new HashSet<>(var1.e());
      this.q();
      d.add(this);
   }

   public ModeSettingWidget(String var1, String[] var2, int var3) {
      this(var1, var2, var3, false);
   }

   public ModeSettingWidget(String var1, String[] var2, int var3, boolean var4) {
      int var6 = -2051313091;
      int var5 = -1757488538;
      int var10001 = (var5 | var6) & ~(var5 & var6);
      var6 = 310749275;
      var5 = var10001;
      this.w = pulse.Bool.from(var5 & ~var6 | ~var5 & var6);
      this.x = new AnimationState();
      this.y = new AnimationState();
      this.z = new MarqueeText();
      this.A = new ArrayList<>();
      this.B = new ArrayList<>();
      var10001 = (int)-7424530456625188353L;
      var6 = -704221047;
      var5 = var10001;
      var10001 = var5 + var6 - 2 * (var5 & var6);
      var6 = 583991670;
      var5 = var10001;
      this.C = pulse.Bool.from((var5 | var6) & (~var5 | ~var6));
      var10001 = (int)-2707779250798988784L;
      var6 = -56638904;
      var5 = var10001;
      var10001 = (var5 | var6) - (var5 & var6);
      var6 = -714330024;
      var5 = var10001;
      this.D = pulse.Bool.from((var5 | var6) - (var5 & var6));
      var10001 = (int)7511020176229944384L;
      var6 = 1016685129;
      var5 = var10001;
      var10001 = (var5 | var6) - (var5 & var6);
      var6 = 476261897;
      var5 = var10001;
      this.E = pulse.Bool.from((var5 | var6) & ~(var5 & var6));
      this.I = 1.0F;
      this.t = null;
      this.q = var1;
      this.r = var2;
      this.s = var4;
      var10001 = (int)130197646250054240L;
      var6 = -1360524366;
      var5 = var10001;
      var10001 = (var5 | var6) & ~(var5 & var6);
      var6 = 1773902290;
      var5 = var10001;
      var10001 = (var5 | var6) & ~(var5 & var6);
      int var10003 = var2.length;
      int var10004 = (int)-9100658891030848849L;
      var6 = -2096835305;
      var5 = var10004;
      var10004 = (var5 | var6) & (~var5 | ~var6);
      var6 = 958386105;
      var5 = var10004;
      var6 = var5 & ~var6 | ~var5 & var6;
      var5 = var10003;
      this.u = Math.max(var10001, Math.min(var3, (var5 & ~var6) - (~var5 & var6)));
      this.v = new HashSet<>();
      if (var4 && var3 >= 0 && var3 < var2.length) {
         this.v.add(var3);
      }

      this.q();
      d.add(this);
   }

   public ModeSettingWidget(String var1, String[] var2, String var3) {
      this(var1, var2, var3, false);
   }

   public ModeSettingWidget(String var1, String[] var2, String var3, boolean var4) {
      int var10001 = (int)-9156913727565244206L;
      int var7 = -1256410012;
      int var6 = var10001;
      var10001 = var6 + var7 - 2 * (var6 & var7);
      var7 = 1485827254;
      var6 = var10001;
      this.w = pulse.Bool.from((var6 | var7) & (~var6 | ~var7));
      this.x = new AnimationState();
      this.y = new AnimationState();
      this.z = new MarqueeText();
      this.A = new ArrayList<>();
      this.B = new ArrayList<>();
      var7 = 451452335;
      var6 = -449652636;
      var10001 = (var6 | var7) & ~(var6 & var7);
      var7 = -2472501;
      var6 = var10001;
      this.C = pulse.Bool.from(var6 + var7 - 2 * (var6 & var7));
      var10001 = (int)4539117802672636750L;
      var7 = -1781565549;
      var6 = var10001;
      var10001 = (var6 | var7) & ~(var6 & var7);
      var7 = 138097885;
      var6 = var10001;
      this.D = pulse.Bool.from((var6 | var7) & (~var6 | ~var7));
      var7 = -49873014;
      var6 = -999224865;
      var10001 = (var6 | var7) & ~(var6 & var7);
      var7 = 964163157;
      var6 = var10001;
      this.E = pulse.Bool.from((var6 | var7) & ~(var6 & var7));
      this.I = 1.0F;
      this.t = null;
      this.q = var1;
      this.r = var2;
      this.s = var4;
      var7 = 963584848;
      var6 = -1372161659;
      var10001 = (var6 | var7) & (~var6 | ~var7);
      var7 = -1755751723;
      var6 = var10001;
      this.u = var6 & ~var7 | ~var6 & var7;
      this.v = new HashSet<>();
      int var10000 = (int)9023996236728569624L;
      var7 = -1528747054;
      var6 = var10000;
      var10000 = (var6 | var7) & (~var6 | ~var7);
      var7 = -2075515702;
      var6 = var10000;

      for (int var5 = (var6 | var7) & ~(var6 & var7); var5 < var2.length; var5++) {
         if (var2[var5].equals(var3)) {
            this.u = var5;
            if (var4) {
               this.v.add(var5);
            }
            break;
         }
      }

      this.q();
      d.add(this);
   }

   public ModeSettingWidget(String var1, String[] var2, int[] var3) {
      int var10001 = (int)-7731494418054218639L;
      int var9 = -544093297;
      int var8 = var10001;
      var10001 = (var8 | var9) & ~(var8 & var9);
      var9 = -479741954;
      var8 = var10001;
      this.w = pulse.Bool.from((var8 | var9) & (~var8 | ~var9));
      this.x = new AnimationState();
      this.y = new AnimationState();
      this.z = new MarqueeText();
      this.A = new ArrayList<>();
      this.B = new ArrayList<>();
      var9 = -1259810241;
      var8 = 414897304;
      var10001 = var8 + var9 - 2 * (var8 & var9);
      var9 = -1403910489;
      var8 = var10001;
      this.C = pulse.Bool.from((var8 | var9) & ~(var8 & var9));
      var10001 = (int)-6104237884110199975L;
      var9 = 268625544;
      var8 = var10001;
      var10001 = var8 & ~var9 | ~var8 & var9;
      var9 = 2099496401;
      var8 = var10001;
      this.D = pulse.Bool.from(var8 & ~var9 | ~var8 & var9);
      var10001 = (int)-4938109546464038311L;
      var9 = 512214029;
      var8 = var10001;
      var10001 = (var8 | var9) - (var8 & var9);
      var9 = -1014204844;
      var8 = var10001;
      this.E = pulse.Bool.from((var8 | var9) & (~var8 | ~var9));
      this.I = 1.0F;
      this.t = null;
      this.q = var1;
      this.r = var2;
      var10001 = (int)-6818240493794381176L;
      var9 = 1122999110;
      var8 = var10001;
      var10001 = var8 + var9 - 2 * (var8 & var9);
      var9 = 2094803407;
      var8 = var10001;
      this.s = pulse.Bool.from(var8 & ~var9 | ~var8 & var9);
      if (var3.length <= 0) {
         var10001 = (int)2088166283462680625L;
         var9 = 1227589593;
         var8 = var10001;
         var10001 = var8 & ~var9 | ~var8 & var9;
         var9 = -1667880984;
         var8 = var10001;
         var10001 = (var8 | var9) & ~(var8 & var9);
      } else {
         int var10002 = (int)6157077930185080547L;
         var9 = -284381828;
         var8 = var10002;
         var10002 = (var8 | var9) & (~var8 | ~var9);
         var9 = 1813549983;
         var8 = var10002;
         var10001 = var3[var8 & ~var9 | ~var8 & var9];
      }

      this.u = var10001;
      this.v = new HashSet<>();
      int[] var4 = var3;
      int var5 = var4.length;
      var9 = -644330125;
      var8 = 1518720913;
      int var10000 = (var8 | var9) & (~var8 | ~var9);
      var9 = -2095211806;
      var8 = var10000;

      for (int var6 = var8 + var9 - 2 * (var8 & var9); var6 < var5; var6++) {
         int var7 = var4[var6];
         if (var7 >= 0 && var7 < var2.length) {
            this.v.add(var7);
         }
      }

      this.q();
      d.add(this);
   }

   public ModeSettingWidget(String var1, String[] var2, Set<String> var3) {
      int var10001 = (int)5622185408991468295L;
      int var6 = 1548432463;
      int var5 = var10001;
      var10001 = (var5 | var6) - (var5 & var6);
      var6 = -669438136;
      var5 = var10001;
      this.w = pulse.Bool.from((var5 | var6) & ~(var5 & var6));
      this.x = new AnimationState();
      this.y = new AnimationState();
      this.z = new MarqueeText();
      this.A = new ArrayList<>();
      this.B = new ArrayList<>();
      var6 = -1911371072;
      var5 = -408694394;
      var10001 = var5 + var6 - 2 * (var5 & var6);
      var6 = 1773214534;
      var5 = var10001;
      this.C = pulse.Bool.from((var5 | var6) & (~var5 | ~var6));
      var10001 = (int)7743540868239233192L;
      var6 = 672118546;
      var5 = var10001;
      var10001 = var5 + var6 - 2 * (var5 & var6);
      var6 = -1424939078;
      var5 = var10001;
      this.D = pulse.Bool.from(var5 + var6 - 2 * (var5 & var6));
      var10001 = (int)3183748215569092150L;
      var6 = -1471333177;
      var5 = var10001;
      var10001 = (var5 | var6) - (var5 & var6);
      var6 = -351620367;
      var5 = var10001;
      this.E = pulse.Bool.from(var5 + var6 - 2 * (var5 & var6));
      this.I = 1.0F;
      this.t = null;
      this.q = var1;
      this.r = var2;
      var6 = 536234211;
      var5 = 870106278;
      var10001 = var5 + var6 - 2 * (var5 & var6);
      var6 = 740985924;
      var5 = var10001;
      this.s = pulse.Bool.from((var5 | var6) & ~(var5 & var6));
      var6 = 2011234814;
      var5 = 881359104;
      var10001 = var5 + var6 - 2 * (var5 & var6);
      var6 = 1130985726;
      var5 = var10001;
      this.u = (var5 | var6) & (~var5 | ~var6);
      this.v = new HashSet<>();
      var6 = 1639222478;
      var5 = -481670606;
      int var10000 = var5 & ~var6 | ~var5 & var6;
      var6 = -2097232132;
      var5 = var10000;

      for (int var4 = (var5 | var6) - (var5 & var6); var4 < var2.length; var4++) {
         if (var3.contains(var2[var4])) {
            this.v.add(var4);
            var10000 = this.v.size();
            var6 = -1417786167;
            var5 = -419441115;
            var10001 = var5 & ~var6 | ~var5 & var6;
            var6 = 1300339437;
            var5 = var10001;
            if (var10000 == var5 + var6 - 2 * (var5 & var6)) {
               this.u = var4;
            }
         }
      }

      this.q();
      d.add(this);
   }

   private void q() {
      int var3 = 1814594470;
      int var2 = -1421982438;
      int var10000 = (var2 | var3) & ~(var2 & var3);
      var3 = -954808644;
      var2 = var10000;

      for (int var1 = var2 & ~var3 | ~var2 & var3; var1 < this.r.length; var1++) {
         this.A.add(new AnimationState());
         var3 = 1186018593;
         var2 = -334510791;
         int var10001 = var2 & ~var3 | ~var2 & var3;
         var3 = -1430327272;
         var2 = var10001;
         this.B.add(Boolean.valueOf(pulse.Bool.from(var2 + var3 - 2 * (var2 & var3))));
      }
   }

   @Override
   public String a() {
      return this.q;
   }

   @Override
   public float b() {
      int var2 = -909747826;
      int var1 = 854846660;
      int var10000 = (var1 | var2) - (var1 & var2);
      var2 = -2145577349;
      var1 = var10000;
      var10000 = (var1 & ~var2 | ~var1 & var2) * (var1 & ~var2 | ~var1 & var2);
      return 25.0F;
   }

   public boolean c() {
      return this.s;
   }

   public String e() {
      return this.r[this.u];
   }

   public int f() {
      return this.u;
   }

   public void a(int var1) {
      int var10001 = (int)5691554029637031261L;
      int var3 = -292243491;
      int var2 = var10001;
      var10001 = (var2 | var3) & (~var2 | ~var3);
      var3 = -220077440;
      var2 = var10001;
      var10001 = var2 & ~var3 | ~var2 & var3;
      int var10003 = this.r.length;
      int var10004 = (int)6792789146404788821L;
      var3 = 1939094091;
      var2 = var10004;
      var10004 = var2 + var3 - 2 * (var2 & var3);
      var3 = 1510088735;
      var2 = var10004;
      var3 = var2 & ~var3 | ~var2 & var3;
      var2 = var10003;
      this.u = Math.max(var10001, Math.min(var1, (var2 & ~var3) - (~var2 & var3)));
      if (this.s) {
         this.v.clear();
         this.v.add(this.u);
      }

      if (this.t != null) {
         this.t.a(Integer.valueOf(this.u));
      }
   }

   public void a(String var1) {
      int var6 = -1377108636;
      int var5 = -741225670;
      int var10000 = (var5 | var6) - (var5 & var6);
      var6 = 2117809758;
      var5 = var10000;

      for (int var2 = var5 + var6 - 2 * (var5 & var6); var2 < this.r.length; var2++) {
         if (this.r[var2].equals(var1)) {
            this.u = var2;
            if (this.s) {
               this.v.clear();
               this.v.add(var2);
            }

            if (this.t != null) {
               this.t.a(var1);
            }
            break;
         }

         var6 = 1545595453;
         var5 = -330011830;
         var10000 = (var5 | var6) - (var5 & var6);
         var6 = -443778167;
         var5 = var10000;
         var10000 = (var5 | var6) - (var5 & var6);
         var6 = -1909667234;
         var5 = -119660741;
         int var10001 = var5 & ~var6 | ~var5 & var6;
         var6 = 388361770;
         var5 = var10001;
         var6 = var5 + var6 - 2 * (var5 & var6);
         var5 = var10000;
         var10000 = (var5 & ~var6) + (var6 & ~var5) + 2 * (var5 & var6);
         var10000 = (int)170064204618994040L;
         var6 = 1289883147;
         var5 = var10000;
         var10000 = var5 + var6 - 2 * (var5 & var6);
         var6 = 1485555821;
         var5 = var10000;
         int var4 = var5 + var6 - 2 * (var5 & var6);
         b = var4;
         String var32 = "bsj";
         var10000 = (int)1281551640561702302L;
         var6 = -1448110606;
         var5 = var10000;
         var10000 = var5 + var6 - 2 * (var5 & var6);
         var6 = -983835806;
         var5 = var10000;
         if ((var5 & ~var6 | ~var5 & var6) <= b) {
            throw new IllegalStateException();
         }
      }
   }

   public Set<Integer> g() {
      return !this.s ? Collections.singleton(this.u) : new HashSet<>(this.v);
   }

   public Set<String> h() {
      return !this.s ? Collections.singleton(this.r[this.u]) : this.v.stream().map(var1 -> this.r[var1]).collect(Collectors.toSet());
   }

   public boolean b(int var1) {
      if (!this.s) {
         int var10;
         if (var1 != this.u) {
            int var3 = -750199494;
            int var2 = 619782038;
            var10 = var2 & ~var3 | ~var2 & var3;
            var3 = -138820948;
            var2 = var10;
            var10 = var2 & ~var3 | ~var2 & var3;
         } else {
            int var8 = -279229557;
            int var5 = 118752430;
            var10 = var5 & ~var8 | ~var5 & var8;
            var8 = -397455580;
            var5 = var10;
            var10 = (var5 | var8) - (var5 & var8);
         }

         return pulse.Bool.from(var10);
      } else {
         return this.v.contains(var1);
      }
   }

   public void c(int var1) {
      if (this.s && var1 >= 0 && var1 < this.r.length) {
         if (!this.v.contains(var1)) {
            this.v.add(var1);
         } else {
            this.v.remove(var1);
         }

         if (!this.v.isEmpty()) {
            this.u = this.v.iterator().next();
         }

         if (this.t != null) {
            this.t.b(var1);
         }
      }
   }

   public void a(Set<Integer> var1) {
      if (this.s) {
         if (c) {
            int var7 = 1129267605;
            int var6 = -1880816019;
            int var10000 = (var6 | var7) & ~(var6 & var7);
            var7 = -1920776788;
            var6 = var10000;
            var10000 = (var6 | var7) & (~var6 | ~var7);
            var7 = 1786105784;
            var6 = -656260416;
            int var10001 = var6 + var7 - 2 * (var6 & var7);
            var7 = 1168891779;
            var6 = var10001;
            var7 = (var6 | var7) - (var6 & var7);
            var6 = var10000;
            var10000 = (var6 | var7) + (var6 & var7);
            var7 = -1729065342;
            var6 = 961523977;
            var10000 = (var6 | var7) - (var6 & var7);
            var7 = -453899302;
            var6 = var10000;
            int var5 = var6 & ~var7 | ~var6 & var7;
            b = var5;
         }

         this.v.clear();

         for (int var3 : var1) {
            if (var3 >= 0 && var3 < this.r.length) {
               this.v.add(var3);
            }
         }

         if (!this.v.isEmpty()) {
            this.u = this.v.iterator().next();
         }

         if (this.t != null) {
            this.t.a(var1);
         }
      }
   }

   public void b(Set<String> var1) {
      if (this.s) {
         this.v.clear();
         int var10000 = (int)3238010196690368970L;
         int var4 = 30441337;
         int var3 = var10000;
         var10000 = (var3 | var4) - (var3 & var4);
         var4 = 1090651827;
         var3 = var10000;

         for (int var2 = (var3 | var4) - (var3 & var4); var2 < this.r.length; var2++) {
            if (var1.contains(this.r[var2])) {
               this.v.add(var2);
            }
         }

         if (!this.v.isEmpty()) {
            this.u = this.v.iterator().next();
         }
      }
   }

   public String[] i() {
      return this.r;
   }

   public boolean m() {
      return this.w;
   }

   public float n() {
      if (!this.w) {
         double var10000 = this.x.j();
         int var10001 = (int)5344700327036201356L;
         int var3 = 713744615;
         int var2 = var10001;
         var10001 = (var2 | var3) & (~var2 | ~var3);
         var3 = -181234750;
         var2 = var10001;
         var10001 = (var2 | var3) - (var2 & var3);
         if (var10000 < 0.01) {
            return 0.0F;
         }
      }

      float var1 = (float)this.x.j();
      return this.K + this.M * var1;
   }

   public boolean o() {
      if (!this.w) {
         double var10000 = this.x.j();
         int var10001 = (int)-5336929803493415165L;
         int var2 = -1687289739;
         int var1 = var10001;
         var10001 = (var1 | var2) - (var1 & var2);
         var2 = -1760840955;
         var1 = var10001;
         var10001 = var1 & ~var2 | ~var1 & var2;
         if (!(var10000 > 0.01)) {
            int var16 = (int)691011671391837776L;
            var2 = 356301612;
            var1 = var16;
            int var17 = var1 & ~var2 | ~var1 & var2;
            var2 = 768157052;
            var1 = var17;
            return pulse.Bool.from((var1 | var2) & (~var1 | ~var2));
         }
      }

      int var13 = (int)8194405115331783187L;
      int var9 = -362600974;
      int var4 = var13;
      var13 = var4 + var9 - 2 * (var4 & var9);
      var9 = -1231188000;
      var4 = var13;
      return pulse.Bool.from((var4 | var9) & ~(var4 & var9));
   }

   private String r() {
      if (!this.s) {
         return this.r[this.u];
      }

      if (!this.v.isEmpty()) {
         ArrayList var1 = new ArrayList<>(this.v);
         Collections.sort(var1);
         StringBuilder var2 = new StringBuilder();
         int var76 = 122441767;
         int var28 = -2066445784;
         int var10000 = var28 & ~var76 | ~var28 & var76;
         var76 = -2087134705;
         var28 = var10000;

         for (int var3 = (var28 | var76) & (~var28 | ~var76); var3 < var1.size(); var3++) {
            if (var3 > 0) {
               String var104 = "bsm";
               var76 = -1688846071;
               var28 = -1583702143;
               int var117 = (var28 | var76) & (~var28 | ~var76);
               var76 = -1522445568;
               var28 = var117;
               var117 = var28 & ~var76 | ~var28 & var76;
               var76 = -1282354102;
               var28 = -850406128;
               int var123 = var28 & ~var76 | ~var28 & var76;
               var76 = -1806755989;
               var28 = var123;
               var76 = (var28 | var76) - (var28 & var76);
               var28 = var117;
               var117 = (var28 & ~var76) + (var76 & ~var28) + 2 * (var28 & var76);
               var76 = -1502494472;
               var28 = -746972443;
               var123 = var28 & ~var76 | ~var28 & var76;
               var76 = -237130980;
               var28 = var123;
               var123 = ((var28 | var76) - (var28 & var76)) * ((var28 | var76) - (var28 & var76));
               var76 = 1384426566;
               var28 = -442122860;
               var123 = (var28 | var76) & ~(var28 & var76);
               var76 = -1498161981;
               var28 = var123;
               var123 = (var28 | var76) & (~var28 | ~var76);
               var76 = -655977706;
               var28 = 1109753465;
               int var130 = (var28 | var76) & (~var28 | ~var76);
               var76 = 1871112043;
               var28 = var130;
               var130 = (var28 | var76) - (var28 & var76);
               var76 = -433229030;
               var28 = -1041886433;
               int var141 = var28 & ~var76 | ~var28 & var76;
               var76 = -1057905973;
               var28 = var141;
               var76 = (var28 | var76) & (~var28 | ~var76);
               var28 = var130;
               var130 = var28 - ~var76 - 1;
               var130 = (int)-4978933426222863728L;
               var76 = 427507357;
               var28 = var130;
               var130 = (var28 | var76) & ~(var28 & var76);
               var76 = -511931352;
               var28 = var130;
               var130 = (var28 | var76) & (~var28 | ~var76);
               var141 = (int)2130351664580187379L;
               var76 = -705233924;
               var28 = var141;
               var141 = (var28 | var76) & (~var28 | ~var76);
               var76 = -9887157;
               var28 = var141;
               var141 = var28 + var76 - 2 * (var28 & var76);
               var76 = 757542558;
               var28 = 948085754;
               var141 = (var28 | var76) & ~(var28 & var76);
               var76 = 158726551;
               var28 = var141;
               var141 = (var28 | var76) - (var28 & var76);
               var76 = 188891406;
               var28 = -1747134558;
               int var147 = (var28 | var76) & (~var28 | ~var76);
               var76 = 733923526;
               var28 = var147;
               var147 = ((var28 | var76) & ~(var28 & var76)) * ((var28 | var76) & ~(var28 & var76));
               var76 = -168401435;
               var28 = 1604933240;
               var147 = (var28 | var76) & (~var28 | ~var76);
               var76 = -1437953882;
               var28 = var147;
               var2.append(
                  a(
                     "⫤䓂",
                     "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謴㑸\u007f\ua7eb꒺ꁿꥊ絥蹏⑮謣㑾|\ua7e1꒦ꀾꤨ絹蹎⑿謄㑲fꟲ꒼ꁿ꤂絓蹆⑿謺㑲|ꟲ",
                     var123,
                     var130,
                     var141,
                     var28 + var76 - 2 * (var28 & var76)
                  )
               );
            }

            var2.append(this.r[((Integer)var1.get(var3)).intValue()]);
         }

         return var2.toString();
      } else {
         int var10001 = (int)2433081855590344608L;
         int var5 = -33471278;
         int var4 = var10001;
         var10001 = (var4 | var5) - (var4 & var5);
         var5 = -2115476616;
         var4 = var10001;
         var10001 = var4 + var5 - 2 * (var4 & var5);
         int var10002 = (int)-3304923701636668478L;
         var5 = -1564389600;
         var4 = var10002;
         var10002 = var4 + var5 - 2 * (var4 & var5);
         var5 = -252957455;
         var4 = var10002;
         var10002 = var4 & ~var5 | ~var4 & var5;
         var10002 = (int)3887149458306530925L;
         var5 = 1150907430;
         var4 = var10002;
         var10002 = (var4 | var5) & ~(var4 & var5);
         var5 = 531565124;
         var4 = var10002;
         var10002 = (var4 | var5) - (var4 & var5);
         var10002 = (int)-3177750083692768643L;
         var5 = -1517480617;
         var4 = var10002;
         var10002 = (var4 | var5) & (~var4 | ~var5);
         var5 = 17516331;
         var4 = var10002;
         var10002 = var4 & ~var5 | ~var4 & var5;
         var5 = 453019162;
         var4 = 22970070;
         var10002 = (var4 | var5) - (var4 & var5);
         var5 = -1014005989;
         var4 = var10002;
         var10002 = var4 & ~var5 | ~var4 & var5;
         var5 = -29736957;
         var4 = -349937804;
         var10002 = (var4 | var5) - (var4 & var5);
         var5 = 76337766;
         var4 = var10002;
         var10002 = var4 + var5 - 2 * (var4 & var5);
         String var10003 = "bsk";
         int var120 = (int)-5359090366968133937L;
         var5 = -1415793676;
         var4 = var120;
         int var121 = (var4 | var5) & (~var4 | ~var5);
         var5 = -1886485573;
         var4 = var121;
         int var122 = var4 + var5 - 2 * (var4 & var5);
         String var10004 = "bsl";
         var5 = 433439324;
         var4 = 878783131;
         int var128 = (var4 | var5) & (~var4 | ~var5);
         var5 = 889781102;
         var4 = var128;
         int var129 = (var4 | var5) & ~(var4 & var5);
         int var10005 = (int)-4121055173576554834L;
         var5 = 608898975;
         var4 = var10005;
         var10005 = var4 + var5 - 2 * (var4 & var5);
         var5 = 1022806859;
         var4 = var10005;
         var10005 = (var4 | var5) & (~var4 | ~var5);
         var5 = -54161018;
         var4 = 1018488240;
         int var10006 = (var4 | var5) & (~var4 | ~var5);
         var5 = 953653837;
         var4 = var10006;
         var5 = var4 & ~var5 | ~var4 & var5;
         var4 = var10005;
         var10005 = (var4 | var5) + (var4 & var5);
         var10005 = (int)-4840855263201625360L;
         var5 = -1384963497;
         var4 = var10005;
         var10005 = (var4 | var5) & (~var4 | ~var5);
         var5 = -1768269519;
         var4 = var10005;
         return a(
            "⫥", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謴㑸\u007f\ua7eb꒺ꁿꥊ絥蹏⑮謣㑾|\ua7e1꒦ꀾꤨ絹蹎⑿謄㑲fꟲ꒼ꁿ꤂絓蹆⑿謺㑲|ꟲ", var10002, var122, var129, var4 + var5 - 2 * (var4 & var5)
         );
      }
   }

   @Override
   public void a(MatrixStack var1, Renderer2D var2, float var3, float var4, float var5, int var6, int var7, float var8, float var9) {
      int var10001 = (int)2838444394027268163L;
      int var48 = -1336806876;
      int var47 = var10001;
      var10001 = var47 + var48 - 2 * (var47 & var48);
      var48 = -1931457943;
      var47 = var10001;
      FontRenderer var10 = FontManager.a[var47 + var48 - 2 * (var47 & var48)];
      var48 = -1781778016;
      var47 = -1207777300;
      int var10000 = (var47 | var48) & ~(var47 & var48);
      var48 = -1667933037;
      var47 = var10000;
      var10000 = (var47 & ~var48 | ~var47 & var48) * (var47 & ~var48 | ~var47 & var48);
      float var11 = 25.0F * var9;
      String var154 = "bsn";
      float var12 = 8.0F * var9;
      this.I = var9;
      boolean var13 = GuiInput.a(var3, var4, var5, var11, var6, var7);
      this.z.a(var13);
      if (this.w != this.D) {
         double var184;
         if (!this.w) {
            if (c) {
               int var10002 = (int)3287346801261353876L;
               var48 = -209900035;
               var47 = var10002;
               var10002 = (var47 | var48) - (var47 & var48);
               var48 = 1439577704;
               var47 = var10002;
               var10002 = var47 + var48 - 2 * (var47 & var48);
               var48 = 1098107040;
               var47 = -464361611;
               var10001 = var47 & ~var48 | ~var47 & var48;
               var48 = 1277610442;
               var47 = var10001;
               int var46 = var47 + var48 - 2 * (var47 & var48);
            }

            var184 = 0.0;
         } else {
            var184 = 1.0;
         }

         double var207;
         if (!this.w) {
            String var206 = "bsp";
            var207 = 0.15;
         } else {
            String var208 = "bso";
            var207 = 0.2;
         }

         this.x.a(var184, var207, pulse.Easing.h);
         if (this.w) {
            var10001 = (int)-2329347546595081170L;
            var48 = -873916529;
            var47 = var10001;
            var10001 = (var47 | var48) - (var47 & var48);
            var48 = -1523788896;
            var47 = var10001;
            this.E = pulse.Bool.from(var47 & ~var48 | ~var47 & var48);
         }

         this.D = this.w;
      }

      this.x.a();
      this.y.a();
      var10000 = (int)-8888247219026500235L;
      var48 = -288184211;
      var47 = var10000;
      var10000 = (var47 | var48) & (~var47 | ~var48);
      var48 = 719158961;
      var47 = var10000;
      var10000 = (var47 | var48) - (var47 & var48);
      var10001 = (int)-1908939549962565222L;
      var48 = 804245942;
      var47 = var10001;
      var10001 = (var47 | var48) - (var47 & var48);
      var48 = 1935393633;
      var47 = var10001;
      var48 = var47 & ~var48 | ~var47 & var48;
      var47 = var10000;
      var10000 = var47 - ~var48 - 1;
      int var14 = (int)(255.0F * var8);
      float var15 = 0.0F;
      String[] var16 = this.r;
      int var17 = var16.length;
      var10000 = (int)-4784761253295625515L;
      var48 = 724481005;
      var47 = var10000;
      var10000 = var47 + var48 - 2 * (var47 & var48);
      var48 = -2123605704;
      var47 = var10000;

      for (int var18 = (var47 | var48) & (~var47 | ~var48); var18 < var17; var18++) {
         String var19 = var16[var18];
         var15 = Math.max(var15, var10.a(var19));
      }

      var10000 = (int)3502808133082990367L;
      var48 = -1971407286;
      var47 = var10000;
      var10000 = (var47 | var48) & (~var47 | ~var48);
      var48 = 2119141309;
      var47 = var10000;
      var10000 = (var47 & ~var48 | ~var47 & var48) * (var47 & ~var48 | ~var47 & var48);
      float var49 = 6.0F * var9;
      var48 = 88440275;
      var47 = 966657072;
      var10001 = (var47 | var48) & (~var47 | ~var48);
      var48 = 1021016547;
      var47 = var10001;
      var10001 = (var47 | var48) & (~var47 | ~var48);
      float var50 = 20.0F * var9;
      var48 = 1557563706;
      var47 = 1330215988;
      var10000 = (var47 | var48) - (var47 & var48);
      var48 = 220314502;
      var47 = var10000;
      var10000 = (var47 | var48) & ~(var47 & var48);
      float var51 = 6.0F * var9;
      var10000 = (int)-2543105018288046179L;
      var48 = -1772187861;
      var47 = var10000;
      var10000 = (var47 | var48) - (var47 & var48);
      var48 = 773124255;
      var47 = var10000;
      var10000 = ((var47 | var48) & ~(var47 & var48)) * ((var47 | var48) & ~(var47 & var48));
      float var52 = 17.0F * var9;
      var10000 = (int)-5722077328604074182L;
      var48 = 587224096;
      var47 = var10000;
      var10000 = var47 & ~var48 | ~var47 & var48;
      var48 = 1048240430;
      var47 = var10000;
      var10000 = (var47 | var48) & ~(var47 & var48);
      float var20 = 7.5F * var9;
      float var21 = var15 * var9 + var50 + var51;
      float var22 = var21 + var49 * 2.0F;
      float var23 = var3 + var5 - var12 - var22 + 1.0F;
      float var172 = var23 - (var3 + var12);
      String var191 = "bsq";
      float var24 = var172 - 4.0F * var9;
      float var173 = var4 + var11 / 2.0F;
      float var192 = var10.b(this.q) * var9;
      var48 = -845261447;
      var47 = 666898808;
      int var209 = var47 & ~var48 | ~var47 & var48;
      var48 = 675536668;
      var47 = var209;
      var209 = (var47 | var48) - (var47 & var48);
      var48 = 960382361;
      var47 = -394527839;
      int var10003 = var47 & ~var48 | ~var47 & var48;
      var48 = -1330520558;
      var47 = var10003;
      var48 = var47 & ~var48 | ~var47 & var48;
      var47 = var209;
      var209 = 2 * (var47 | var48) - (var47 ^ var48);
      float var25 = var173 - var192 / 4.0F - 1.0F;
      this.z.a(var1, var2, var10, this.q, var3 + var12, var25, var24, var9, pulse.Theme.a, var8);
      String var26 = this.r();
      float var27 = var4 + var11 / 2.0F - var52 / 2.0F - 1.0F;
      this.F = var23;
      this.G = var27;
      this.H = var22;
      boolean var28 = GuiInput.a(var23, var27, var22, var52, var6, var7);
      if (var28 != this.C) {
         AnimationState var174 = this.y;
         double var197;
         if (!var28) {
            if (c) {
               var10001 = (int)-2676829709638654295L;
               var48 = 1617061948;
               var47 = var10001;
               var10001 = var47 & ~var48 | ~var47 & var48;
               var48 = -1599811947;
               var47 = var10001;
               var10001 = var47 + var48 - 2 * (var47 & var48);
               var48 = 175107722;
               var47 = -465036219;
               var209 = var47 & ~var48 | ~var47 & var48;
               var48 = -299371825;
               var47 = var209;
               var10001 /= (var47 | var48) - (var47 & var48);
            }

            var197 = 0.0;
         } else {
            var197 = 1.0;
         }

         var10003 = (int)668925458633503038L;
         var48 = -144088190;
         var47 = var10003;
         var10003 = var47 + var48 - 2 * (var47 & var48);
         var48 = -528887120;
         var47 = var10003;
         var10003 = var47 + var48 - 2 * (var47 & var48);
         var174.a(var197, 0.15, pulse.Easing.h);
         this.C = var28;
      }

      float var29 = (float)this.x.j();
      Color var30 = this.a(pulse.Theme.e, var8);
      Color var31 = this.a(pulse.Theme.f, var8);
      Color var32 = this.a(pulse.Theme.w, var8);
      float var33 = var20;
      float var34 = var20 * (1.0F - var29);
      var10003 = (int)-7992802333735156856L;
      var48 = -105437429;
      var47 = var10003;
      var10003 = var47 + var48 - 2 * (var47 & var48);
      var48 = -260397936;
      var47 = var10003;
      var10003 = (var47 | var48) & ~(var47 & var48);
      var48 = 1520683543;
      var47 = 1461534253;
      var10003 = (var47 | var48) & (~var47 | ~var48);
      var48 = 230618160;
      var47 = var10003;
      var10003 = var47 & ~var48 | ~var47 & var48;
      float var198 = var23 - 0.5F * var9;
      String var222 = "bsr";
      var2.a(var198, var27 - 0.5F * var9, var22 + var9, var52 + var9, var34, var34, var33, var33, var32, var32, var32, var32, var1);
      var2.a(var23, var27, var22, var52, var34, var34, var33, var33, var30, var30, var31, var31, var1);
      float var35 = var23 + var49;
      float var175 = var27 + var52 / 2.0F;
      float var199 = var10.b(var26) * var9;
      String var213 = "bss";
      float var36 = var175 - var199 / 4.0F - 1.0F;
      float var37 = var23 + var22 - var49 - var51;
      float var176 = var37 - var35;
      var48 = -609527420;
      var47 = -2141702577;
      var10001 = (var47 | var48) & (~var47 | ~var48);
      var48 = 1910755340;
      var47 = var10001;
      var10001 = ((var47 | var48) & (~var47 | ~var48)) * ((var47 | var48) & (~var47 | ~var48));
      float var38 = var176 - 4.0F * var9;
      var10000 = (int)3963778393580756133L;
      var48 = 135531197;
      var47 = var10000;
      var10000 = var47 & ~var48 | ~var47 & var48;
      var48 = 300317039;
      var47 = var10000;
      var10000 = ((var47 | var48) & (~var47 | ~var48)) * ((var47 | var48) & (~var47 | ~var48));
      float var39 = 15.0F * var9;
      var2.b().a(var35, var27, var38, var52, var1);
      Color var40 = pulse.Theme.a(pulse.Theme.aa, var14);
      var1.push();
      var1.translate(var35, var36, 0.0F);
      var1.scale(var9, var9, 1.0F);
      var1.translate(-var35, -var36, 0.0F);
      var10.a(var26, var35, var36, var40, var1);
      var1.pop();
      float var41 = var10.a(var26) * var9;
      if (var41 > var38 - var39) {
         float var42 = var35 + var38 - var39;
         var10001 = (int)4257023320863102053L;
         var48 = -1228970161;
         var47 = var10001;
         var10001 = var47 + var48 - 2 * (var47 & var48);
         var48 = 1847997226;
         var47 = var10001;
         Color var43 = pulse.Theme.a(pulse.Theme.e, (var47 | var48) & ~(var47 & var48));
         Color var44 = this.a(pulse.Theme.e, var8);
         var2.a(var42, var27, var39, var52, 0.0F, var43, var44, var43, var44, var1);
      }

      var2.b().a(var1);
      float var53 = var27 + var52 / 2.0F;
      var48 = 345668529;
      var47 = -1488361499;
      var10000 = var47 & ~var48 | ~var47 & var48;
      var48 = 22375406;
      var47 = var10000;
      var10000 = (var47 | var48) & ~(var47 & var48);
      float var54 = 1.5F * var9;
      this.a(var2, var37, var53, var51, var54, var29, var14, var1);
      if (var28) {
         GuiInput.g();
      }
   }

   private void a(Renderer2D var1, float var2, float var3, float var4, float var5, float var6, int var7, MatrixStack var8) {
      Color var9 = pulse.Theme.a(pulse.Theme.aa, var7);
      int var10000 = (int)-2835660577670524668L;
      int var26 = 1476781800;
      int var25 = var10000;
      var10000 = (var25 | var26) - (var25 & var26);
      var26 = -209752894;
      var25 = var10000;
      var10000 = (var25 | var26) - (var25 & var26);
      int var10001 = (int)-3008752547794018527L;
      var26 = -1356908051;
      var25 = var10001;
      var10001 = var25 & ~var26 | ~var25 & var26;
      var26 = -3682646;
      var25 = var10001;
      var26 = (var25 | var26) & (~var25 | ~var26);
      var25 = var10000;
      var10000 = (var25 & ~var26) + (var26 & ~var25) + 2 * (var25 & var26);
      float var10 = 3.0F * this.I * (1.0F - var6);
      float var11 = var4 / 2.0F;
      float var10002 = var3 - var5 / 2.0F;
      var26 = -978485337;
      var25 = 400775899;
      int var10004 = var25 + var26 - 2 * (var25 & var26);
      var26 = 1418103664;
      var25 = var10004;
      var10004 = (var25 & ~var26 | ~var25 & var26) * (var25 & ~var26 | ~var25 & var26);
      var1.a(var2, var10002, var11 + 0.5F * this.I, var5, var9, var8);
      float var95 = var2 + var11;
      var26 = -955686849;
      var25 = 527411932;
      int var104 = var25 + var26 - 2 * (var25 & var26);
      var26 = 1174964428;
      var25 = var104;
      int var105 = (var25 | var26) - (var25 & var26);
      var26 = 1242766549;
      var25 = 1395956626;
      int var10003 = var25 & ~var26 | ~var25 & var26;
      var26 = -1334980932;
      var25 = var10003;
      var26 = (var25 | var26) & (~var25 | ~var26);
      var25 = var105;
      int var106 = (var25 & ~var26) + (var26 & ~var25) + 2 * (var25 & var26);
      float var96 = var95 - 0.5F * this.I;
      var10002 = var3 - var5 / 2.0F;
      var26 = -1894380336;
      var25 = 1425580402;
      var10004 = (var25 | var26) & ~(var25 & var26);
      var26 = -487641455;
      var25 = var10004;
      var10004 = ((var25 | var26) & ~(var25 & var26)) * ((var25 | var26) & ~(var25 & var26));
      var1.a(var96, var10002, var11 + 0.5F * this.I, var5, var9, var8);
      var26 = -1998852770;
      var25 = -849911056;
      var10001 = (var25 | var26) - (var25 & var26);
      var26 = 1661955049;
      var25 = var10001;
      var10001 = var25 + var26 - 2 * (var25 & var26);
      if (!(var10 > 0.1F)) {
         String var84 = "bst";
         var10000 = (int)-3211121500082619576L;
         var26 = 1490556769;
         var25 = var10000;
         var10000 = (var25 | var26) - (var25 & var26);
         var26 = 272379990;
         var25 = var10000;
         int var24 = (var25 | var26) & ~(var25 & var26);
         b = var24;
         var26 = 961125980;
         var25 = 1565476333;
         var10000 = (var25 | var26) & ~(var25 & var26);
         var26 = -1767474916;
         var25 = var10000;
         var10000 = (var25 | var26) & (~var25 | ~var26);
         var26 = -474745946;
         var25 = 103350839;
         var10000 = var25 & ~var26 | ~var25 & var26;
         var26 = -26155429;
         var25 = var10000;
         if ((var25 | var26) - (var25 & var26) <= b) {
            throw new RuntimeException();
         }
      } else {
         float var12 = var2;
         float var13 = var3 - var10 / 2.0F;
         float var14 = var2 + var11;
         float var15 = var3 + var10 / 2.0F;
         float var16 = var2 + var4;
         float var17 = var3 - var10 / 2.0F;
         float var18 = var5;
         float var19 = (float)Math.atan2(var15 - var13, var14 - var12);
         float var20 = (float)Math.atan2(var15 - var17, var14 - var16);
         double var90 = var14 - var12;
         var26 = -507532892;
         var25 = 1868872005;
         int var108 = (var25 | var26) & (~var25 | ~var26);
         var26 = -1898245904;
         var25 = var108;
         int var109 = var25 & ~var26 | ~var25 & var26;
         double var91 = Math.pow(var90, 2.0);
         double var99 = var15 - var13;
         String var110 = "bsu";
         float var21 = (float)Math.sqrt(var91 + Math.pow(var99, 2.0));
         double var92 = var16 - var14;
         var10001 = (int)8119210319245473377L;
         var26 = -1293789726;
         var25 = var10001;
         var10001 = var25 + var26 - 2 * (var25 & var26);
         var26 = 531132171;
         var25 = var10001;
         var10001 = ((var25 | var26) & (~var25 | ~var26)) * ((var25 | var26) & (~var25 | ~var26));
         double var93 = Math.pow(var92, 2.0);
         double var103 = var17 - var15;
         int var111 = (int)2905974052831930920L;
         var26 = 781377948;
         var25 = var111;
         int var112 = var25 & ~var26 | ~var25 & var26;
         var26 = -1175026133;
         var25 = var112;
         int var113 = ((var25 | var26) & (~var25 | ~var26)) * ((var25 | var26) & (~var25 | ~var26));
         float var22 = (float)Math.sqrt(var93 + Math.pow(var103, 2.0));
         var8.push();
         var8.translate(var12 + var21 / 2.0F, (var13 + var15) / 2.0F, 0.0F);
         var8.multiply(new Quaternionf().rotationZ(var19));
         var1.a(-var21 / 2.0F, -var18 / 2.0F, var21, var18, var9, var8);
         var8.pop();
         var8.push();
         var8.translate(var14 + (var16 - var14) / 2.0F, (var15 + var17) / 2.0F, 0.0F);
         var8.multiply(new Quaternionf().rotationZ(var20));
         var1.a(-var22 / 2.0F, -var18 / 2.0F, var22, var18, var9, var8);
         var8.pop();
      }
   }

   @Override
   public void a(MatrixStack var1, Renderer2D var2, float var3, float var4, float var5, float var6, int var7, int var8, float var9, float var10) {
      if (!this.w) {
         double var10000 = this.x.j();
         int var45 = 655251372;
         int var44 = 334978523;
         int var10001 = (var44 | var45) & (~var44 | ~var45);
         var45 = -1356406997;
         var44 = var10001;
         var10001 = (var44 | var45) & ~(var44 & var45);
         int var10002 = (int)-774989707004230867L;
         var45 = -109346899;
         var44 = var10002;
         var10002 = (var44 | var45) - (var44 & var45);
         var45 = 1324074145;
         var44 = var10002;
         var45 = (var44 | var45) - (var44 & var45);
         var44 = var10001;
         var10001 = (var44 | var45) + (var44 & var45);
         if (var10000 < 0.01) {
            return;
         }
      }

      this.x.a();
      float var11 = (float)this.x.j();
      int var129 = 1248245545;
      int var55 = 1402210101;
      int var246 = (var55 | var129) & (~var55 | ~var129);
      var129 = 1397211261;
      var55 = var246;
      var246 = (var55 | var129) & (~var55 | ~var129);
      if (!(var11 < 0.01F)) {
         var129 = 7942993;
         var55 = -2119535359;
         var246 = (var55 | var129) - (var55 & var129);
         var129 = -2116860322;
         var55 = var246;
         FontRenderer var12 = FontManager.a[var55 & ~var129 | ~var55 & var129];
         int var199 = (int)8949735948460848788L;
         var129 = -750634358;
         var55 = var199;
         var199 = var55 + var129 - 2 * (var55 & var129);
         var129 = -1131312694;
         var55 = var199;
         var199 = (var55 + var129 - 2 * (var55 & var129)) * (var55 + var129 - 2 * (var55 & var129));
         float var13 = 6.0F * this.I;
         var129 = -246881700;
         var55 = -1225571426;
         var246 = (var55 | var129) & ~(var55 & var129);
         var129 = 1203478994;
         var55 = var246;
         var246 = (var55 | var129) & (~var55 | ~var129);
         float var14 = -2.0F * this.I;
         var129 = -1413568079;
         var55 = -1581528130;
         var199 = (var55 | var129) - (var55 & var129);
         var129 = 1178697166;
         var55 = var199;
         var199 = (var55 | var129) & ~(var55 & var129);
         float var15 = 7.5F * this.I;
         int var269 = (int)8929068606705439956L;
         var129 = 1371003149;
         var55 = var269;
         var269 = (var55 | var129) - (var55 & var129);
         var129 = -1133326887;
         var55 = var269;
         float var16 = var12.b(this.r[var55 + var129 - 2 * (var55 & var129)]) * this.I;
         float var204 = this.r.length * var16;
         var246 = this.r.length;
         var129 = -1765718243;
         var55 = 1285700535;
         var269 = (var55 | var129) - (var55 & var129);
         var129 = -631014229;
         var55 = var269;
         var129 = var55 + var129 - 2 * (var55 & var129);
         var55 = var246;
         float var17 = var204 + (2 * (var55 & ~var129) - (var55 ^ var129)) * var14;
         float var205 = var17 + var13 * 2.0F;
         String var252 = "bsv";
         float var18 = var205 - 8.0F;
         float var19 = this.H;
         float var20 = this.F;
         String var253 = "bsw";
         float var21 = this.G + 17.0F * this.I;
         this.J = var20;
         this.K = var21;
         this.L = var19;
         this.M = var18;
         if (this.E) {
            this.s();
            var246 = (int)-4616069967030862948L;
            var129 = 851313574;
            var55 = var246;
            var246 = (var55 | var129) - (var55 & var129);
            var129 = 1584969786;
            var55 = var246;
            this.E = pulse.Bool.from((var55 | var129) - (var55 & var129));
         }

         float var22 = var18 * var11;
         if (this.w) {
            var246 = (int)-5491744695201550844L;
            var129 = 1036414504;
            var55 = var246;
            var246 = (var55 | var129) & ~(var55 & var129);
            var129 = 1667162369;
            var55 = var246;
            var246 = (var55 | var129) - (var55 & var129);
            if (var11 > 0.5F) {
               GuiLayerRegistry.a().a(GuiLayerRegistry.Layer.DROPDOWN, var20, var21, var19, var22);
            }
         }

         Color var23 = this.a(pulse.Theme.e, var9 * var11);
         Color var24 = this.a(pulse.Theme.f, var9 * var11);
         Color var25 = this.a(pulse.Theme.w, var9 * var11);
         var269 = (int)4078003965371587197L;
         var129 = 1762571808;
         var55 = var269;
         var269 = (var55 | var129) - (var55 & var129);
         var129 = 1191825827;
         var55 = var269;
         var269 = (var55 | var129) & (~var55 | ~var129);
         float var259 = var20 - 0.5F * this.I;
         String var10003 = "bsx";
         var2.a(var259, var21 - 0.5F * this.I, var19 + this.I, var22 + this.I, var15 * var11, var15 * var11, 0.0F, 0.0F, var25, var25, var25, var25, var1);
         var2.a(var20, var21, var19, var22, var15 * var11, var15 * var11, 0.0F, 0.0F, var23, var23, var24, var24, var1);
         var246 = (int)-4444420509348924326L;
         var129 = 579038876;
         var55 = var246;
         var246 = (var55 | var129) - (var55 & var129);
         var129 = -1693353281;
         var55 = var246;
         var246 = (var55 | var129) & ~(var55 & var129);
         if (var11 > 0.3F) {
            var129 = -1970150873;
            var55 = -1532429111;
            var269 = var55 & ~var129 | ~var55 & var129;
            var129 = -1392935356;
            var55 = var269;
            var269 = var55 & ~var129 | ~var55 & var129;
            float var263 = var11 - 0.3F;
            var129 = 773315184;
            var55 = 912454345;
            int var278 = (var55 | var129) - (var55 & var129);
            var129 = 410331320;
            var55 = var278;
            int var279 = var55 + var129 - 2 * (var55 & var129);
            int var280 = (int)6879705682447031685L;
            var129 = 330350792;
            var55 = var280;
            int var281 = (var55 | var129) & (~var55 | ~var129);
            var129 = 583867742;
            var55 = var281;
            int var282 = (var55 | var129) - (var55 & var129);
            var129 = 2140538499;
            var55 = 705243733;
            int var283 = (var55 | var129) & ~(var55 & var129);
            var129 = 1436495056;
            var55 = var283;
            int var284 = (var55 | var129) - (var55 & var129);
            var129 = 134823997;
            var55 = -821480125;
            int var285 = var55 + var129 - 2 * (var55 & var129);
            var129 = -956271238;
            var55 = var285;
            int var286 = var55 + var129 - 2 * (var55 & var129);
            float var26 = Math.min(1.0F, var263 / 0.7F);
            var199 = (int)-8429419508888598987L;
            var129 = -1530646446;
            var55 = var199;
            var199 = var55 & ~var129 | ~var55 & var129;
            var129 = 1995335875;
            var55 = var199;
            var199 = (var55 + var129 - 2 * (var55 & var129)) * (var55 + var129 - 2 * (var55 & var129));
            int var27 = (int)(255.0F * var9 * var26);
            float var28 = var21 + var13 * var11;
            float var29 = var16 + var14;
            float var30 = var21 + var13 * var11;
            float var31 = var8 - var30;
            if (!(var29 > 0.0F)) {
               if (b != b) {
                  String var209 = "bsy";
                  var199 = (int)384268129088612459L;
                  var129 = 735518193;
                  var55 = var199;
                  var199 = var55 & ~var129 | ~var55 & var129;
                  var129 = -1066636327;
                  var55 = var199;
                  int var43 = (var55 | var129) & (~var55 | ~var129);
               }

               var199 = (int)-7935689435197624825L;
               var129 = 2007012601;
               var55 = var199;
               var199 = (var55 | var129) & ~(var55 & var129);
               var129 = 2137441537;
               var55 = var199;
               var199 = var55 & ~var129 | ~var55 & var129;
            } else {
               var199 = (int)(var31 / var29);
            }

            int var32 = var199;
            var199 = (int)-8134406160559194209L;
            var129 = 362863957;
            var55 = var199;
            var199 = (var55 | var129) - (var55 & var129);
            var129 = -255958326;
            var55 = var199;
            int var33 = (var55 | var129) & (~var55 | ~var129);
            if (var32 >= 0 && var32 < this.r.length) {
               float var34 = var30 + var32 * var29;
               float var35 = var8 - var34;
               if (var35 >= 0.0F && var35 < var16) {
                  var129 = 143386798;
                  var55 = 274492171;
                  var199 = (var55 | var129) - (var55 & var129);
                  var129 = 416777124;
                  var55 = var199;
                  var199 = var55 + var129 - 2 * (var55 & var129);
               } else {
                  var129 = -1945178276;
                  var55 = 1897157201;
                  var199 = var55 + var129 - 2 * (var55 & var129);
                  var129 = -48579315;
                  var55 = var199;
                  var199 = var55 + var129 - 2 * (var55 & var129);
               }

               var33 = var199;
            }

            if (var7 >= var20 && var7 <= var20 + var19) {
               var199 = (int)1405539573166113398L;
               var129 = -1669593877;
               var55 = var199;
               var199 = (var55 | var129) & (~var55 | ~var129);
               var129 = 472778396;
               var55 = var199;
               var199 = (var55 | var129) & ~(var55 & var129);
            } else {
               var199 = (int)-2798101232783161684L;
               var129 = -516937816;
               var55 = var199;
               var199 = (var55 | var129) & (~var55 | ~var129);
               var129 = 391160068;
               var55 = var199;
               var199 = var55 + var129 - 2 * (var55 & var129);
            }

            int var46 = var199;
            var199 = (int)2008550836611855263L;
            var129 = 1616953836;
            var55 = var199;
            var199 = (var55 | var129) & ~(var55 & var129);
            var129 = 2045833843;
            var55 = var199;

            for (int var47 = var55 & ~var129 | ~var55 & var129; var47 < this.r.length && !(var28 > var21 + var22); var47++) {
               boolean var36;
               label105: {
                  var36 = this.b(var47);
                  if (var46 != 0 && var33 != 0 && var47 == var32) {
                     var129 = 287686655;
                     var55 = -1224555603;
                     var246 = (var55 | var129) - (var55 & var129);
                     var129 = 665226519;
                     var55 = var246;
                     var246 = (var55 | var129) - (var55 & var129);
                     if (var11 > 0.8F && this.w) {
                        var129 = 1763779380;
                        var55 = 1439464866;
                        var199 = var55 + var129 - 2 * (var55 & var129);
                        var129 = 1022189207;
                        var55 = var199;
                        var199 = (var55 | var129) & ~(var55 & var129);
                        break label105;
                     }
                  }

                  var199 = (int)6721653232973588045L;
                  var129 = -2131285196;
                  var55 = var199;
                  var199 = (var55 | var129) - (var55 & var129);
                  var129 = 642256249;
                  var55 = var199;
                  var199 = (var55 | var129) - (var55 & var129);
               }

               int var37 = var199;
               if (pulse.Bool.from(var37) != this.B.get(var47)) {
                  AnimationState var231 = this.A.get(var47);
                  double var266 = var37 == 0 ? 0.0 : 1.0;
                  String var277 = "bsz";
                  var231.a(var266, 0.12, pulse.Easing.h);
                  this.B.set(var47, Boolean.valueOf(pulse.Bool.from(var37)));
               }

               this.A.get(var47).a();
               float var38 = (float)this.A.get(var47).j();
               Color var39;
               if (!var36) {
                  Color var40 = ColorUtils.a(pulse.Theme.b, p, var38);
                  var39 = pulse.Theme.a(var40, var27);
               } else {
                  var39 = pulse.Theme.a(pulse.Theme.aa, var27);
                  var199 = (int)-9105132288045427502L;
                  var129 = 625092946;
                  var55 = var199;
                  var199 = var55 & ~var129 | ~var55 & var129;
                  var129 = -1392487096;
                  var55 = var199;
                  var199 = (var55 | var129) & ~(var55 & var129);
                  var129 = -1709577910;
                  var55 = -373078985;
                  var246 = var55 + var129 - 2 * (var55 & var129);
                  var129 = -1872737325;
                  var55 = var246;
                  var129 = (var55 | var129) & (~var55 | ~var129);
                  var55 = var199;
                  var199 = (var55 ^ var129) + 2 * (var55 & var129);
                  var199 = (int)-7191303745719183684L;
                  var129 = -700778166;
                  var55 = var199;
                  var199 = (var55 | var129) & (~var55 | ~var129);
                  var129 = -1078937589;
                  var55 = var199;
                  int var49 = var55 + var129 - 2 * (var55 & var129);
                  b = var49;
                  var199 = (int)-5549569564788047770L;
                  var129 = -1089890368;
                  var55 = var199;
                  var199 = (var55 | var129) & ~(var55 & var129);
                  var129 = -1380928712;
                  var55 = var199;
                  var199 = ((var55 | var129) & ~(var55 & var129)) * ((var55 | var129) & ~(var55 & var129));
                  var129 = 1894221249;
                  var55 = -298042683;
                  var199 = var55 + var129 - 2 * (var55 & var129);
                  var129 = -494539965;
                  var55 = var199;
                  if (((var55 | var129) & ~(var55 & var129)) <= b) {
                     String var242 = "bta";
                     var129 = 2111637961;
                     var55 = -1848896871;
                     var199 = var55 & ~var129 | ~var55 & var129;
                     var129 = -2035196743;
                     var55 = var199;
                     var49 = (var55 | var129) & (~var55 | ~var129);
                     b = var49;
                  }
               }

               float var48 = var20 + var13;
               float var41 = var28;
               var1.push();
               var1.translate(var48, var41, 0.0F);
               var1.scale(this.I, this.I, 1.0F);
               var1.translate(-var48, -var41, 0.0F);
               var12.a(this.r[var47], var48, var41, var39, var1);
               var1.pop();
               if (var37 != 0 && this.w) {
                  GuiInput.g();
               }

               var28 += var16 + var14;
            }
         }
      }
   }

   @Override
   public boolean j() {
      if (!this.w) {
         double var10000 = this.x.j();
         int var2 = -1538610966;
         int var1 = -2060426538;
         int var10002 = var1 & ~var2 | ~var1 & var2;
         var2 = 561695283;
         var1 = var10002;
         var10002 = var1 & ~var2 | ~var1 & var2;
         var2 = 597986456;
         var1 = 917652026;
         var10002 = var1 & ~var2 | ~var1 & var2;
         var2 = 353816227;
         var1 = var10002;
         var10002 = (var1 | var2) & ~(var1 & var2);
         if (!(var10000 > 0.01)) {
            var2 = 1208377123;
            var1 = 587770968;
            int var20 = (var1 | var2) & ~(var1 & var2);
            var2 = 1796141947;
            var1 = var20;
            return pulse.Bool.from(var1 + var2 - 2 * (var1 & var2));
         }
      }

      int var17 = (int)4217712385127494326L;
      int var13 = -435875610;
      int var6 = var17;
      var17 = (var6 | var13) - (var6 & var13);
      var13 = -2041634223;
      var6 = var17;
      return pulse.Bool.from((var6 | var13) & ~(var6 & var13));
   }

   @Override
   public boolean a(float var1, float var2, float var3, int var4, int var5) {
      return this.d(var4, var5);
   }

   @Override
   public boolean b(float var1, float var2, float var3, int var4, int var5) {
      return this.d(var4, var5);
   }

   private boolean d(int var1, int var2) {
      int var10000 = (int)1700966732253774027L;
      int var22 = 1711296456;
      int var21 = var10000;
      var10000 = (var21 | var22) - (var21 & var22);
      var22 = -2003416296;
      var21 = var10000;
      var10000 = (var21 & ~var22 | ~var21 & var22) * (var21 & ~var22 | ~var21 & var22);
      float var3 = 17.0F * this.I;
      boolean var4 = GuiInput.a(this.F, this.G, this.H, var3, var1, var2);
      if (var4) {
         int var240;
         if (this.w) {
            var22 = 1376046425;
            var21 = -21010257;
            var240 = (var21 | var22) & ~(var21 & var22);
            var22 = -1170623439;
            var21 = var240;
            var240 = var21 + var22 - 2 * (var21 & var22);
            int var247 = (int)7459457031842095885L;
            var22 = 1533454412;
            var21 = var247;
            var247 = var21 + var22 - 2 * (var21 & var22);
            var22 = 1560008627;
            var21 = var247;
            var22 = var21 + var22 - 2 * (var21 & var22);
            var21 = var240;
            var240 = var21 - ~var22 - 1;
            var240 = (int)-4358323715443091039L;
            var22 = 222045845;
            var21 = var240;
            var240 = var21 + var22 - 2 * (var21 & var22);
            var22 = 1121188198;
            var21 = var240;
            int var25 = (var21 | var22) & (~var21 | ~var22);
            var22 = -905999495;
            var21 = -1009199994;
            var247 = (var21 | var22) & (~var21 | ~var22);
            var22 = 170352620;
            var21 = var247;
            var247 = (var21 | var22) & ~(var21 & var22);
            var22 = -162583786;
            var21 = 743001178;
            var247 = var21 + var22 - 2 * (var21 & var22);
            var22 = -637114532;
            var21 = var247;
            var247 = (var21 | var22) - (var21 & var22);
            var22 = -1909430514;
            var21 = -733589309;
            var240 = (var21 | var22) - (var21 & var22);
            var22 = 1958568537;
            var21 = var240;
            if ((var21 & ~var22 | ~var21 & var22) >= var25) {
               String var236 = "btb";
               var240 = (int)7130695348161034325L;
               var22 = -2031984366;
               var21 = var240;
               var240 = (var21 | var22) & ~(var21 & var22);
               var22 = 1443523832;
               var21 = var240;
               var25 = var21 & ~var22 | ~var21 & var22;
               b = var25;
            }

            var22 = -1246909017;
            var21 = 1317122926;
            var240 = (var21 | var22) - (var21 & var22);
            var22 = -80994615;
            var21 = var240;
            var240 = (var21 | var22) & ~(var21 & var22);
         } else {
            var22 = -1415463635;
            var21 = 1363075548;
            var240 = var21 + var22 - 2 * (var21 & var22);
            var22 = -90219280;
            var21 = var240;
            var240 = (var21 | var22) - (var21 & var22);
         }

         this.w = pulse.Bool.from(var240);
         var10000 = (int)6010378169022840431L;
         var22 = 329348509;
         var21 = var10000;
         var10000 = (var21 | var22) - (var21 & var22);
         var22 = -1577120781;
         var21 = var10000;
         return pulse.Bool.from(var21 & (var22 ^ -1) | (var21 ^ -1) & var22);
      } else {
         if (this.w) {
            double var181 = this.x.j();
            int var10001 = (int)-7899350186946220747L;
            var22 = -320605314;
            var21 = var10001;
            var10001 = (var21 | var22) & (~var21 | ~var22);
            var22 = -2106503159;
            var21 = var10001;
            var10001 = (var21 | var22) & (~var21 | ~var22);
            var22 = 264801959;
            var21 = -2027124493;
            int var10002 = var21 + var22 - 2 * (var21 & var22);
            var22 = 1990724228;
            var21 = var10002;
            var22 = (var21 | var22) & (~var21 | ~var22);
            var21 = var10001;
            var10001 = (var21 | var22) + (var21 & var22);
            if (var181 > 0.5) {
               var22 = 1684107236;
               var21 = -1734985684;
               var10001 = var21 + var22 - 2 * (var21 & var22);
               var22 = -50899002;
               var21 = var10001;
               FontRenderer var5 = FontManager.a[(var21 | var22) & ~(var21 & var22)];
               float var6 = (float)this.x.j();
               String var184 = "btc";
               float var7 = 6.0F * this.I;
               var10000 = (int)-3341953643762147035L;
               var22 = -1797438067;
               var21 = var10000;
               var10000 = (var21 | var22) & ~(var21 & var22);
               var22 = -1462946230;
               var21 = var10000;
               var10000 = (var21 | var22) & (~var21 | ~var22);
               var22 = -815483983;
               var21 = -1766103165;
               var10001 = var21 & ~var22 | ~var21 & var22;
               var22 = 1227090216;
               var21 = var10001;
               var22 = var21 + var22 - 2 * (var21 & var22);
               var21 = var10000;
               var10000 = 2 * (var21 | var22) - (var21 ^ var22);
               float var8 = -2.0F * this.I;
               var22 = -2072413251;
               var21 = 1316119948;
               var10002 = (var21 | var22) & (~var21 | ~var22);
               var22 = -905241039;
               var21 = var10002;
               float var9 = var5.b(this.r[var21 & ~var22 | ~var21 & var22]) * this.I;
               float var189 = this.G;
               var22 = 1439262639;
               var21 = 640035899;
               var10002 = var21 + var22 - 2 * (var21 & var22);
               var22 = 1945062295;
               var21 = var10002;
               var10002 = (var21 | var22) & ~(var21 & var22);
               var22 = -1903034018;
               var21 = -1999449560;
               var10002 = var21 + var22 - 2 * (var21 & var22);
               var22 = 104911738;
               var21 = var10002;
               var10002 = (var21 | var22) - (var21 & var22);
               float var10 = var189 + 17.0F * this.I;
               float var11 = this.M * var6;
               float var12 = var9 + var8;
               float var13 = var10 + var7 * var6;
               float var14 = var2 - var13;
               if (!(var12 > 0.0F)) {
                  var22 = -1383916751;
                  var21 = 748466318;
                  var10000 = (var21 | var22) & ~(var21 & var22);
                  var22 = 2128630848;
                  var21 = var10000;
                  var10000 = (var21 | var22) - (var21 & var22);
               } else {
                  var10000 = (int)(var14 / var12);
               }

               int var15 = var10000;
               var10000 = (int)7381366798665993049L;
               var22 = -993085269;
               var21 = var10000;
               var10000 = var21 & ~var22 | ~var21 & var22;
               var22 = 60290034;
               var21 = var10000;
               int var16 = var21 & ~var22 | ~var21 & var22;
               if (var15 < 0) {
                  var22 = 584299749;
                  var21 = 80672850;
                  var10001 = (var21 | var22) & (~var21 | ~var22);
                  var22 = 639454397;
                  var21 = var10001;
                  var10001 = (var21 | var22) - (var21 & var22);
                  var22 = -1692390575;
                  var21 = -1445596334;
                  var10001 = (var21 | var22) & ~(var21 & var22);
                  var22 = 854972416;
                  var21 = var10001;
                  var10001 = var21 & ~var22 | ~var21 & var22;
                  var22 = 280149098;
                  var21 = 1069798675;
                  var10001 = var21 & ~var22 | ~var21 & var22;
                  var22 = 795961727;
                  var21 = var10001;
                  var10001 = (var21 | var22) - (var21 & var22);
                  var22 = 1772932465;
                  var21 = -823345415;
                  var10001 = (var21 | var22) & ~(var21 & var22);
                  var22 = -1488948345;
                  var21 = var10001;
                  var10001 = (var21 | var22) - (var21 & var22);
                  var10000 = (int)8814596772122750284L;
                  var22 = -861777488;
                  var21 = var10000;
                  var10000 = (var21 | var22) & (~var21 | ~var22);
                  var22 = -1120595886;
                  var21 = var10000;
                  int var20 = (var21 | var22) - (var21 & var22);
                  b = var20;
                  var22 = -535729433;
                  var21 = -322919743;
                  var10000 = (var21 | var22) - (var21 & var22);
                  var22 = -1629447684;
                  var21 = var10000;
                  var10000 = (var21 | var22) - (var21 & var22);
                  var10000 = (int)-335806450018836528L;
                  var22 = 1104291401;
                  var21 = var10000;
                  var10000 = (var21 | var22) & (~var21 | ~var22);
                  var22 = 582465279;
                  var21 = var10000;
                  if ((var21 & ~var22 | ~var21 & var22) <= b) {
                     throw new IllegalAccessError();
                  }
               } else if (var15 < this.r.length) {
                  float var17 = var13 + var15 * var12;
                  float var18 = var2 - var17;
                  if (var18 >= 0.0F && var18 < var9) {
                     var10000 = (int)2632344298840458495L;
                     var22 = 394381871;
                     var21 = var10000;
                     var10000 = (var21 | var22) - (var21 & var22);
                     var22 = 2104020689;
                     var21 = var10000;
                     var10000 = (var21 | var22) - (var21 & var22);
                  } else {
                     var10000 = (int)-324171322643187893L;
                     var22 = -1871087833;
                     var21 = var10000;
                     var10000 = var21 + var22 - 2 * (var21 & var22);
                     var22 = -620593044;
                     var21 = var10000;
                     var10000 = var21 + var22 - 2 * (var21 & var22);
                  }

                  var16 = var10000;
               }

               if (var1 >= this.J && var1 <= this.J + this.L) {
                  var22 = -1141858185;
                  var21 = 1777490068;
                  var10000 = var21 + var22 - 2 * (var21 & var22);
                  var22 = -771557150;
                  var21 = var10000;
                  var10000 = (var21 | var22) - (var21 & var22);
               } else {
                  var22 = 1260639348;
                  var21 = -1881005968;
                  var10000 = (var21 | var22) - (var21 & var22);
                  var22 = -993922044;
                  var21 = var10000;
                  var10000 = (var21 | var22) & (~var21 | ~var22);
               }

               int var23 = var10000;
               if (var23 != 0 && var16 != 0 && var15 >= 0 && var15 < this.r.length) {
                  if (!this.s) {
                     if (var15 != this.u) {
                        this.u = var15;
                        if (this.t != null) {
                           this.t.a(Integer.valueOf(var15));
                        }
                     }

                     var10001 = (int)791332854471808264L;
                     var22 = 589125272;
                     var21 = var10001;
                     var10001 = var21 + var22 - 2 * (var21 & var22);
                     var22 = -84016240;
                     var21 = var10001;
                     this.w = pulse.Bool.from((var21 | var22) & ~(var21 & var22));
                  } else {
                     this.c(var15);
                  }

                  var10000 = (int)-6243481289333773912L;
                  var22 = -2134972688;
                  var21 = var10000;
                  var10000 = (var21 | var22) & (~var21 | ~var22);
                  var22 = 1137217369;
                  var21 = var10000;
                  return pulse.Bool.from((var21 | var22) & (var21 ^ -1 | var22 ^ -1));
               }

               boolean var24 = GuiInput.a(this.J, this.K, this.L, this.M, var1, var2);
               if (!var24) {
                  var22 = -1213184118;
                  var21 = -1234974766;
                  var10001 = (var21 | var22) - (var21 & var22);
                  var22 = 30638168;
                  var21 = var10001;
                  this.w = pulse.Bool.from(var21 + var22 - 2 * (var21 & var22));
               }

               var10000 = (int)-6431100177732290884L;
               var22 = 920980590;
               var21 = var10000;
               var10000 = (var21 | var22) & (~var21 | ~var22);
               var22 = 28687059;
               var21 = var10000;
               return pulse.Bool.from(var21 & (var22 ^ -1) | (var21 ^ -1) & var22);
            }
         }

         var10000 = (int)7041786249987991503L;
         var22 = -483580846;
         var21 = var10000;
         var10000 = (var21 | var22) & (~var21 | ~var22);
         var22 = -303135843;
         var21 = var10000;
         return pulse.Bool.from((var21 | var22) & (var21 & var22 ^ -1));
      }
   }

   @Override
   public boolean l() {
      if (!this.w) {
         double var10000 = this.x.j();
         int var4 = 23729729;
         int var3 = -1753926760;
         int var10001 = var3 + var4 - 2 * (var3 & var4);
         var4 = 949424069;
         var3 = var10001;
         var10001 = var3 & ~var4 | ~var3 & var4;
         var4 = -1049261403;
         var3 = -1654413284;
         int var10002 = (var3 | var4) & (~var3 | ~var4);
         var4 = 1877434823;
         var3 = var10002;
         var4 = (var3 | var4) & ~(var3 & var4);
         var3 = var10001;
         var10001 = (var3 ^ var4) + 2 * (var3 & var4);
         if (!(var10000 > 0.1)) {
            int var51 = (int)7403014364977916349L;
            var4 = 1817262379;
            var3 = var51;
            int var52 = (var3 | var4) - (var3 & var4);
            var4 = -3256170;
            var3 = var52;
            return pulse.Bool.from(var3 & ~var4 | ~var3 & var4);
         }
      }

      int var48 = (int)-480317082946577717L;
      int var31 = -1141649117;
      int var10 = var48;
      var48 = (var10 | var31) & (~var10 | ~var31);
      var31 = -795276311;
      var10 = var48;
      var48 = (var10 | var31) & ~(var10 & var31);
      var31 = 1021857061;
      var10 = -1083901281;
      int var55 = (var10 | var31) - (var10 & var31);
      var31 = -1717489229;
      var10 = var55;
      var55 = var10 + var31 - 2 * (var10 & var31);
      var55 = (int)757727208190051466L;
      var31 = 1913384283;
      var10 = var55;
      var55 = var10 & ~var31 | ~var10 & var31;
      var31 = -183510070;
      var10 = var55;
      int var2 = var10 & ~var31 | ~var10 & var31;
      b = var2;
      var31 = -569946573;
      var10 = -2138282183;
      var55 = (var10 | var31) - (var10 & var31);
      var31 = -1167410854;
      var10 = var55;
      var55 = (var10 | var31) & ~(var10 & var31);
      int var67 = (int)2175033773029416108L;
      var31 = 851694574;
      var10 = var67;
      var67 = (var10 | var31) & (~var10 | ~var31);
      var31 = -840365032;
      var10 = var67;
      var31 = (var10 | var31) & (~var10 | ~var31);
      var10 = var55;
      var55 = (var10 & ~var31) + (var31 & ~var10) + 2 * (var10 & var31);
      var55 = (int)465658657139574829L;
      var31 = -986557733;
      var10 = var55;
      var55 = var10 & ~var31 | ~var10 & var31;
      var31 = 1032857928;
      var10 = var55;
      if (((var10 | var31) & ~(var10 & var31)) <= b) {
         String var64 = "btd";
         var55 = (int)-2957879282595525818L;
         var31 = -1199396879;
         var10 = var55;
         var55 = (var10 | var31) & (~var10 | ~var31);
         var31 = -1534103789;
         var10 = var55;
         var2 = var10 & ~var31 | ~var10 & var31;
         b = var2;
      }

      return pulse.Bool.from(var48);
   }

   public void p() {
      if (this.w) {
         int var2 = 1909672744;
         int var1 = 544867775;
         int var10001 = (var1 | var2) & (~var1 | ~var2);
         var2 = 1370050199;
         var1 = var10001;
         this.w = pulse.Bool.from((var1 | var2) & (~var1 | ~var2));
      }
   }

   public boolean b(int var1, int var2) {
      int var10001 = (int)4018762377338864682L;
      int var7 = 1036343030;
      int var6 = var10001;
      var10001 = (var6 | var7) & ~(var6 & var7);
      var7 = 1010406106;
      var6 = var10001;
      var10001 = var6 & ~var7 | ~var6 & var7;
      float var3 = 17.0F * this.I;
      boolean var4 = GuiInput.a(this.F, this.G, this.H, var3, var1, var2);
      if (!this.w) {
         double var10000 = this.x.j();
         String var25 = "bte";
         if (!(var10000 > 0.1)) {
            return var4;
         }
      }

      boolean var5 = GuiInput.a(this.J, this.K, this.L, this.M, var1, var2);
      int var20;
      if (!var4 && !var5) {
         var20 = (int)5949095786948535396L;
         var7 = 1660455177;
         var6 = var20;
         var20 = (var6 | var7) - (var6 & var7);
         var7 = 1496296813;
         var6 = var20;
         var20 = (var6 | var7) & ~(var6 & var7);
      } else {
         var20 = (int)5352967777557188178L;
         var7 = 1546774146;
         var6 = var20;
         var20 = (var6 | var7) - (var6 & var7);
         var7 = 1197041873;
         var6 = var20;
         var20 = (var6 | var7) & ~(var6 & var7);
      }

      return pulse.Bool.from(var20);
   }

   public boolean c(int var1, int var2) {
      if (!this.w) {
         double var10000 = this.x.j();
         int var6 = -1540642768;
         int var5 = -1344638998;
         int var10002 = var5 & ~var6 | ~var5 & var6;
         var6 = 200394698;
         var5 = var10002;
         var10002 = var5 + var6 - 2 * (var5 & var6);
         var6 = -616429500;
         var5 = 1490173321;
         var10002 = (var5 | var6) & ~(var5 & var6);
         var6 = -2087701056;
         var5 = var10002;
         var10002 = var5 + var6 - 2 * (var5 & var6);
         var6 = 248569291;
         var5 = -1847123513;
         var10002 = (var5 | var6) & (~var5 | ~var6);
         var6 = -1623720950;
         var5 = var10002;
         var10002 = var5 + var6 - 2 * (var5 & var6);
         var10002 = (int)379031321936397607L;
         var6 = -152332737;
         var5 = var10002;
         var10002 = var5 + var6 - 2 * (var5 & var6);
         var6 = 1345295126;
         var5 = var10002;
         var10002 = var5 & ~var6 | ~var5 & var6;
         if (var10000 < 0.1) {
            int var25 = (int)-8959764194174065954L;
            var6 = 2000973384;
            var5 = var25;
            int var26 = (var5 | var6) - (var5 & var6);
            var6 = -642134890;
            var5 = var26;
            return pulse.Bool.from((var5 | var6) - (var5 & var6));
         }
      }

      float var3 = (float)this.x.j();
      float var4 = this.M * var3;
      return GuiInput.a(this.J, this.K, this.L, var4, var1, var2);
   }

   private boolean a(ModeSettingWidget var1) {
      if (var1 == this) {
         if (b != b) {
            int var10000 = (int)-3395404948573994813L;
            int var15 = -1206768779;
            int var14 = var10000;
            var10000 = (var14 | var15) & ~(var14 & var15);
            var15 = -474551370;
            var14 = var10000;
            var10000 = (var14 | var15) - (var14 & var15);
            var15 = -1752733652;
            var14 = -1117726461;
            int var10001 = (var14 | var15) & ~(var14 & var15);
            var15 = 719827247;
            var14 = var10001;
            var10000 /= (var14 | var15) & (~var14 | ~var15);
         }
      } else if (var1.w) {
         double var96 = var1.x.j();
         int var58 = -738436326;
         int var20 = 516274070;
         int var128 = var20 & ~var58 | ~var20 & var58;
         var58 = 1588063868;
         var20 = var128;
         var128 = (var20 | var58) - (var20 & var58);
         int var10002 = (int)1457553976485209334L;
         var58 = -1236996019;
         var20 = var10002;
         var10002 = (var20 | var58) & (~var20 | ~var58);
         var58 = 1273954651;
         var20 = var10002;
         var58 = var20 & ~var58 | ~var20 & var58;
         var20 = var128;
         var128 = 2 * (var20 | var58) - (var20 ^ var58);
         if (!(var96 < 0.1)) {
            var58 = -1950217916;
            var20 = -937466672;
            int var99 = var20 & ~var58 | ~var20 & var58;
            var58 = -1953380726;
            var20 = var99;
            int var100 = var20 & ~var58 | ~var20 & var58;
            int var101 = (int)-8648939518172284694L;
            var58 = -2048378594;
            var20 = var101;
            int var102 = (var20 | var58) & (~var20 | ~var58);
            var58 = -1951006941;
            var20 = var102;
            int var13 = (var20 | var58) - (var20 & var58);
            b = var13;
            int var103 = (int)-1512420449944030899L;
            var58 = -447561093;
            var20 = var103;
            int var104 = var20 & ~var58 | ~var20 & var58;
            var58 = 545044137;
            var20 = var104;
            int var105 = (var20 + var58 - 2 * (var20 & var58)) * (var20 + var58 - 2 * (var20 & var58));
            var58 = 1624500662;
            var20 = -1659640009;
            int var106 = (var20 | var58) & ~(var20 & var58);
            var58 = -250531659;
            var20 = var106;
            if (var20 + var58 - 2 * (var20 & var58) <= b) {
               var58 = 1124773581;
               var20 = 376394356;
               int var107 = (var20 | var58) - (var20 & var58);
               var58 = 1432747193;
               var20 = var107;
               int var108 = (var20 | var58) & ~(var20 & var58);
               var58 = -1536208995;
               var20 = 272226693;
               var128 = (var20 | var58) - (var20 & var58);
               var58 = -1269393896;
               var20 = var128;
               int var109 = var108 / (var20 & ~var58 | ~var20 & var58);
            }

            int var116;
            float var2;
            float var3;
            float var6;
            float var7;
            label50: {
               var2 = this.K;
               var3 = this.K + this.M;
               float var4 = this.J;
               float var5 = this.J + this.L;
               var6 = var1.K;
               var7 = var1.K + var1.M;
               float var8 = var1.J;
               float var9 = var1.J + var1.L;
               if (var4 < var9) {
                  if (var5 > var8) {
                     int var117 = (int)-3627909935652191887L;
                     var58 = -24603905;
                     var20 = var117;
                     int var118 = var20 + var58 - 2 * (var20 & var58);
                     var58 = 1860162447;
                     var20 = var118;
                     var116 = var20 + var58 - 2 * (var20 & var58);
                     break label50;
                  }

                  if (c) {
                     int var110 = (int)4700398745323288006L;
                     var58 = 1516150230;
                     var20 = var110;
                     int var111 = var20 & ~var58 | ~var20 & var58;
                     var58 = 456405270;
                     var20 = var111;
                     int var112 = (var20 | var58) & ~(var20 & var58);
                     int var113 = (int)-4789917531016489581L;
                     var58 = -786103245;
                     var20 = var113;
                     int var114 = (var20 | var58) & (~var20 | ~var58);
                     var58 = 301451261;
                     var20 = var114;
                     var13 = var20 & ~var58 | ~var20 & var58;
                     b = var13;
                  }
               }

               var58 = 233122463;
               var20 = -369808145;
               int var115 = var20 + var58 - 2 * (var20 & var58);
               var58 = -468711824;
               var20 = var115;
               var116 = var20 + var58 - 2 * (var20 & var58);
            }

            int var10 = var116;
            int var120;
            if (var2 < var7 && var3 > var6) {
               int var121 = (int)-7841087511370372698L;
               var58 = -117487112;
               var20 = var121;
               int var122 = (var20 | var58) & (~var20 | ~var58);
               var58 = 821764191;
               var20 = var122;
               var120 = (var20 | var58) & (~var20 | ~var58);
            } else {
               var58 = 1896907769;
               var20 = -1707873845;
               int var119 = (var20 | var58) - (var20 & var58);
               var58 = -350000590;
               var20 = var119;
               var120 = (var20 | var58) - (var20 & var58);
            }

            int var11 = var120;
            int var125;
            if (var10 != 0 && var11 != 0) {
               int var126 = (int)3867416310639335873L;
               var58 = -1985880320;
               var20 = var126;
               int var127 = (var20 | var58) & ~(var20 & var58);
               var58 = 1804879552;
               var20 = var127;
               var125 = var20 + var58 - 2 * (var20 & var58);
            } else {
               int var123 = (int)-7971813900375725158L;
               var58 = -677835889;
               var20 = var123;
               int var124 = (var20 | var58) - (var20 & var58);
               var58 = -1425252331;
               var20 = var124;
               var125 = (var20 | var58) - (var20 & var58);
            }

            return pulse.Bool.from(var125);
         }
      }

      int var97 = (int)3616015566851701394L;
      int var63 = -415534238;
      int var25 = var97;
      var97 = var25 & ~var63 | ~var25 & var63;
      var63 = 54594032;
      var25 = var97;
      return pulse.Bool.from(var25 + var63 - 2 * (var25 & var63));
   }

   private void s() {
      for (ModeSettingWidget var2 : d) {
         if (var2 != this && var2.w && this.a(var2)) {
            int var10001 = (int)5971404525589642532L;
            int var6 = 1766823135;
            int var5 = var10001;
            var10001 = var5 & ~var6 | ~var5 & var6;
            var6 = 1554098683;
            var5 = var10001;
            var2.w = pulse.Bool.from((var5 | var6) - (var5 & var6));
         }
      }

      if (c) {
         int var10000 = (int)7009903488198408772L;
         int var16 = -1210103608;
         int var8 = var10000;
         var10000 = (var8 | var16) & ~(var8 & var16);
         var16 = 69886088;
         var8 = var10000;
         var10000 = (var8 | var16) & (~var8 | ~var16);
         var16 = 835160337;
         var8 = 231290734;
         int var29 = (var8 | var16) & ~(var8 & var16);
         var16 = -1052367965;
         var8 = var29;
         var16 = (var8 | var16) & (~var8 | ~var16);
         var8 = var10000;
         var10000 = (var8 | var16) + (var8 & var16);
         var10000 = (int)4033701476135712651L;
         var16 = 2074971916;
         var8 = var10000;
         var10000 = (var8 | var16) & (~var8 | ~var16);
         var16 = -564110933;
         var8 = var10000;
         int var4 = var8 & ~var16 | ~var8 & var16;
      }
   }

   private Color a(Color var1, float var2) {
      int var10002 = var1.getRed();
      int var10003 = var1.getGreen();
      int var10004 = var1.getBlue();
      int var4 = -811465916;
      int var3 = -1020991711;
      int var10005 = (var3 | var4) & (~var3 | ~var4);
      var4 = 210166885;
      var3 = var10005;
      var10005 = (var3 | var4) & ~(var3 & var4);
      int var10006 = (int)-8014138457496820780L;
      var4 = 1620011202;
      var3 = var10006;
      var10006 = var3 & ~var4 | ~var3 & var4;
      var4 = -57308183;
      var3 = var10006;
      return new Color(var10002, var10003, var10004, Math.max(var10005, Math.min((var3 | var4) & (~var3 | ~var4), (int)(var1.getAlpha() * var2))));
   }

   @Override
   public boolean d() {
      int var53;
      if (this.t != null && !this.t.m()) {
         var53 = (int)7066552030575627966L;
         int var50 = 574246754;
         int var27 = var53;
         var53 = (var27 | var50) & (~var27 | ~var50);
         var50 = -1820540452;
         var27 = var53;
         var53 = var27 & ~var50 | ~var27 & var50;
      } else {
         var53 = (int)-3873373230352755942L;
         int var4 = -2089900094;
         int var3 = var53;
         var53 = (var3 | var4) & (~var3 | ~var4);
         var4 = 692040921;
         var3 = var53;
         var53 = (var3 | var4) - (var3 & var4);
         int var10002 = (int)-725138226013005367L;
         var4 = 1111182975;
         var3 = var10002;
         var10002 = (var3 | var4) & (~var3 | ~var4);
         var4 = 1531664295;
         var3 = var10002;
         var10002 = (var3 | var4) & (~var3 | ~var4);
         var10002 = (int)-8625222570336597200L;
         var4 = 1505719536;
         var3 = var10002;
         var10002 = var3 & ~var4 | ~var3 & var4;
         var4 = 332971970;
         var3 = var10002;
         var10002 = var3 + var4 - 2 * (var3 & var4);
         var10002 = (int)2949558238116332379L;
         var4 = -307055857;
         var3 = var10002;
         var10002 = var3 & ~var4 | ~var3 & var4;
         var4 = -17633199;
         var3 = var10002;
         var10002 = (var3 | var4) - (var3 & var4);
         var4 = -712795605;
         var3 = 616735079;
         int var10001 = var3 + var4 - 2 * (var3 & var4);
         var4 = -211861504;
         var3 = var10001;
         int var2 = (var3 | var4) & ~(var3 & var4);
         b = var2;
         var10001 = (int)7114242434410522336L;
         var4 = -1961449120;
         var3 = var10001;
         var10001 = (var3 | var4) - (var3 & var4);
         var4 = -619012217;
         var3 = var10001;
         var10001 = (var3 | var4) & (~var3 | ~var4);
         var10001 = (int)-1382016018821143276L;
         var4 = 61942282;
         var3 = var10001;
         var10001 = (var3 | var4) - (var3 & var4);
         var4 = -246774625;
         var3 = var10001;
         if (((var3 | var4) & (~var3 | ~var4)) < b) {
            var10002 = (int)-3367431451569030279L;
            var4 = -853561603;
            var3 = var10002;
            var10002 = (var3 | var4) & (~var3 | ~var4);
            var4 = 1721783687;
            var3 = var10002;
            var10002 = var3 + var4 - 2 * (var3 & var4);
            var4 = -1137858011;
            var3 = 1901900133;
            var10002 = (var3 | var4) & ~(var3 & var4);
            var4 = -848225460;
            var3 = var10002;
            var10002 = var3 + var4 - 2 * (var3 & var4);
            var4 = -1660156055;
            var3 = -1280622393;
            var10002 = var3 & ~var4 | ~var3 & var4;
            var4 = 782714798;
            var3 = var10002;
            var10002 = (var3 | var4) & ~(var3 & var4);
            var4 = -1232113447;
            var3 = 323800360;
            var10001 = var3 + var4 - 2 * (var3 & var4);
            var4 = 377252316;
            var3 = var10001;
            var2 = (var3 | var4) - (var3 & var4);
            b = var2;
         }
      }

      return pulse.Bool.from(var53);
   }

   public static String a(String var0, String var1, int var2, int var3, int var4, int var5) {
      char[] var6 = var1.toCharArray();
      char[] var7 = new char[var6.length];
      int var20 = -1511221027;
      int var19 = 1745519133;
      int var10000 = (var19 | var20) & ~(var19 & var20);
      var20 = -840557878;
      var19 = var10000;
      char[] var275 = new char[var19 + var20 - 2 * (var19 & var20)];
      var20 = 1034202781;
      var19 = 868551556;
      int var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = 241280281;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      int var10003 = (int)3012312820949392535L;
      var20 = -506048036;
      var19 = var10003;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = 484246905;
      var19 = var10003;
      var275[var10002] = (char)((var19 | var20) - (var19 & var20));
      var10002 = (int)-4531421655777408587L;
      var20 = 2061358676;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = 1295900640;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var10003 = (int)-5390762657346168988L;
      var20 = 257105662;
      var19 = var10003;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = -1155274209;
      var19 = var10003;
      var275[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      var20 = -768047217;
      var19 = -78478121;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = 694813530;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var10003 = (int)-941800422973819851L;
      var20 = -1471759097;
      var19 = var10003;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = -82597196;
      var19 = var10003;
      var275[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      var20 = 1329564860;
      var19 = 2073886678;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = 883127145;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var10003 = (int)7938884422857965838L;
      var20 = -514610894;
      var19 = var10003;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = 387084818;
      var19 = var10003;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var10003 = (int)-2562153476762414143L;
      var20 = 72859282;
      var19 = var10003;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = -639863488;
      var19 = var10003;
      var275[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      var20 = -2093150494;
      var19 = 1570445226;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = -559539892;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = 2124023489;
      var19 = -2047487319;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = -1293793459;
      var19 = var10003;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = -1324769244;
      var19 = -1734057288;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = 699225017;
      var19 = var10003;
      var275[var10002] = (char)((var19 | var20) & ~(var19 & var20));
      var20 = 234420342;
      var19 = -429325270;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = -342754215;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var10003 = (int)40185423215297138L;
      var20 = -1808861075;
      var19 = var10003;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = 1741373341;
      var19 = var10003;
      var275[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      var10002 = (int)1111568233823941645L;
      var20 = 1501126599;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = 30829516;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = -298753940;
      var19 = 1015020527;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = -766602608;
      var19 = var10003;
      var275[var10002] = (char)((var19 | var20) - (var19 & var20));
      var20 = -1258686385;
      var19 = -1188548842;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = 231855966;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = -277263249;
      var19 = 1473919990;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = -1197259845;
      var19 = var10003;
      var275[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      var10002 = (int)-1343998751887411723L;
      var20 = 773891631;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = -1458695214;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var10003 = (int)6384637406553923820L;
      var20 = 1664288300;
      var19 = var10003;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = -1100845421;
      var19 = var10003;
      var275[var10002] = (char)((var19 | var20) - (var19 & var20));
      var10002 = (int)-4711069331643820154L;
      var20 = -755976793;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = -439180760;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = -949516593;
      var19 = -880445964;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = 216200223;
      var19 = var10003;
      var275[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      char[] var8 = var275;
      var10000 = (int)6617292698488631197L;
      var20 = -2111031212;
      var19 = var10000;
      var10000 = var19 & ~var20 | ~var19 & var20;
      var20 = -1105242173;
      var19 = var10000;
      char[] var278 = new char[var19 + var20 - 2 * (var19 & var20)];
      var10002 = (int)3550580125685064644L;
      var20 = 1634250579;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = 1668123799;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var10003 = (int)635059381899715027L;
      var20 = -182885273;
      var19 = var10003;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = 1349537172;
      var19 = var10003;
      var278[var10002] = (char)((var19 | var20) - (var19 & var20));
      var10002 = (int)-8256774752606255371L;
      var20 = 1600734367;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = -2028682645;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1214701325;
      var19 = 24902206;
      int var10004 = (var19 | var20) & (~var19 | ~var20);
      var20 = 1226646833;
      var19 = var10004;
      var10004 = (var19 | var20) - (var19 & var20);
      var10004 = (int)4691992492361206860L;
      var20 = -1380357014;
      var19 = var10004;
      var10004 = (var19 | var20) & (~var19 | ~var20);
      var20 = -1371267040;
      var19 = var10004;
      var10004 = var19 & ~var20 | ~var19 & var20;
      var20 = -892217532;
      var19 = 314180758;
      var10004 = (var19 | var20) & ~(var19 & var20);
      var20 = -664022062;
      var19 = var10004;
      var10004 = (var19 | var20) & ~(var19 & var20);
      var20 = -612115757;
      var19 = -1959509180;
      var10004 = (var19 | var20) - (var19 & var20);
      var20 = 1354209682;
      var19 = var10004;
      var10004 = (var19 | var20) & (~var19 | ~var20);
      var10003 = (int)7244254592274048223L;
      var20 = -260733671;
      var19 = var10003;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = 1921623493;
      var19 = var10003;
      var278[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      var20 = 186414374;
      var19 = -131368511;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = -214496027;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = -666261302;
      var19 = 708747672;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = 1177226632;
      var19 = var10003;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = -521613758;
      var19 = 1310627876;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = -1359556299;
      var19 = var10003;
      var278[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      var10002 = (int)-7433171800469590718L;
      var20 = 1010594662;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = 1924357671;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var10003 = (int)13802217571821413L;
      var20 = 1595110588;
      var19 = var10003;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1818782683;
      var19 = var10003;
      var278[var10002] = (char)((var19 | var20) & ~(var19 & var20));
      var20 = -1978226239;
      var19 = 422420188;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = -1824835815;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var10003 = (int)-6220839908925592283L;
      var20 = 698166233;
      var19 = var10003;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = -965230916;
      var19 = var10003;
      var278[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      var20 = 1577139530;
      var19 = 737918960;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = 1979351743;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = -264343629;
      var19 = -994495319;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = 881288078;
      var19 = var10003;
      var278[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      var10002 = (int)1632312328549466673L;
      var20 = 1000855570;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = 571038245;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = 1808183314;
      var19 = 1361608686;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = -1943436754;
      var19 = var10003;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var10003 = (int)9140756591540460324L;
      var20 = 387598997;
      var19 = var10003;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = -1508993400;
      var19 = var10003;
      var278[var10002] = (char)((var19 | var20) - (var19 & var20));
      var20 = 1333308389;
      var19 = -1957460485;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = -1003803111;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = 388658341;
      var19 = 497474285;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = 176995952;
      var19 = var10003;
      var278[var10002] = (char)((var19 | var20) & ~(var19 & var20));
      var20 = -553087679;
      var19 = -733494321;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = 189746822;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var10003 = (int)9200020588193581849L;
      var20 = 1760967143;
      var19 = var10003;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = 135828770;
      var19 = var10003;
      var10003 = (var19 | var20) - (var19 & var20);
      var10004 = (int)5067297112871308159L;
      var20 = -875801972;
      var19 = var10004;
      var10004 = (var19 | var20) - (var19 & var20);
      var20 = 1350435037;
      var19 = var10004;
      var20 = (var19 | var20) - (var19 & var20);
      var19 = var10003;
      var10003 = 2 * (var19 | var20) - (var19 ^ var20);
      var10003 = (int)2796745745174201291L;
      var20 = -898833180;
      var19 = var10003;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = 912122923;
      var19 = var10003;
      var278[var10002] = (char)((var19 | var20) - (var19 & var20));
      var10002 = (int)-6093471572555017338L;
      var20 = -1853888631;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1033188358;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var10003 = (int)5576526677488209695L;
      var20 = -1329654457;
      var19 = var10003;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = 479439211;
      var19 = var10003;
      var278[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      char[] var9 = var278;
      var10000 = (int)6985910677229467987L;
      var20 = 703198134;
      var19 = var10000;
      var10000 = var19 & ~var20 | ~var19 & var20;
      var20 = 1429670629;
      var19 = var10000;
      int var10 = (var19 | var20) & ~(var19 & var20);
      String var281 = "btf";
      var20 = -276167029;
      var19 = -1475721982;
      var10000 = var19 & ~var20 | ~var19 & var20;
      var20 = 1616956218;
      var19 = var10000;
      int var18 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1710882283;
      var19 = -211124383;
      int var10001 = var19 & ~var20 | ~var19 & var20;
      var20 = -1768717694;
      var19 = var10001;
      var10001 = (var19 | var20) & (~var19 | ~var20);
      var10000 = (int)-4579760566933605387L;
      var20 = -1516298076;
      var19 = var10000;
      var10000 = (var19 | var20) - (var19 & var20);
      var20 = -1046358381;
      var19 = var10000;
      if (var19 + var20 - 2 * (var19 & var20) >= var18) {
         throw new RuntimeException();
      }

      while (var10 < var6.length) {
         char var340 = var6[var10];
         char var261 = var8[var10 % var8.length];
         char var135 = var340;
         var7[var10] = (char)((var135 | var261) - (var135 & var261));
         var10++;
      }

      char[] var21 = new char[var7.length];
      var10000 = (int)1930983247621554069L;
      var20 = 1690965058;
      var19 = var10000;
      var10000 = (var19 | var20) - (var19 & var20);
      var20 = 159149015;
      var19 = var10000;

      for (int var11 = var19 & ~var20 | ~var19 & var20; var11 < var6.length; var11++) {
         char var341 = var7[var11];
         char var264 = var9[var11 % var9.length];
         char var138 = var341;
         var21[var11] = (char)(var138 & ~var264 | ~var138 & var264);
      }

      String var22 = new String(var21);
      int var12 = var22.hashCode();
      var20 = var5;
      var19 = var3;
      var10000 = 2 * (var19 & ~var20) - (var19 ^ var20);
      var20 = var2;
      var19 = var10000;
      int var13 = (var19 & ~var20) - (~var19 & var20);
      char[] var14 = var0.toCharArray();
      char[] var15 = new char[var14.length];
      var10000 = (int)-6711685424145078093L;
      var20 = -738866400;
      var19 = var10000;
      var10000 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1650434963;
      var19 = var10000;

      for (int var16 = (var19 | var20) - (var19 & var20); var16 < var15.length; var16++) {
         var20 = -2020915231;
         var19 = 1668270841;
         var10001 = (var19 | var20) & ~(var19 & var20);
         var20 = -454783718;
         var19 = var10001;
         switch (var16 % ((var19 | var20) & ~(var19 & var20))) {
            case 0:
               var20 = var12;
               var19 = var13;
               var10002 = (var19 | var20) - (var19 & var20);
               char var274 = var14[var16];
               var19 = var10002;
               var15[var16] = (char)((var19 | var274) & (~var19 | ~var274));
               break;
            case 1:
               var20 = var13;
               var19 = var5;
               var10002 = (var19 | var20) & (~var19 | ~var20);
               char var272 = var14[var16];
               var19 = var10002;
               var15[var16] = (char)(var19 + var272 - 2 * (var19 & var272));
         }
      }

      return new String(var15);
   }
}
