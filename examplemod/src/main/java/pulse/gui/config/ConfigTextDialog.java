package pulse;

import java.awt.Color;
import net.minecraft.client.util.math.MatrixStack;

public class ConfigTextDialog {
   private static final float a = 178.5F;
   private static final float b = 9.5F;
   private static final float c = 12.0F;
   private static final float d = 11.0F;
   private static final float e = 10.0F;
   private static final float f = 22.0F;
   private static final float g = 3.0F;
   private static final float h = 9.5F;
   private static final float i = 18.0F;
   private static final float j = 6.0F;
   private static final float k = 7.0F;
   private static final float l = 2.0F;
   private static final int m = 5;
   private boolean n;
   private String o;
   private String[] p;
   private ConfigEntry q;
   private boolean r;
   private final ScrollBar s;
   private final AnimationState t;
   private final AnimationState u;
   private final AnimationState v;
   private final AnimationState w;
   private boolean x;
   private boolean y;
   private Runnable z;

   public ConfigTextDialog() {
      int var2 = 1685922508;
      int var1 = 1999628792;
      int var10001 = var1 & ~var2 | ~var1 & var2;
      var2 = 324193076;
      var1 = var10001;
      this.n = pulse.Bool.from(var1 & ~var2 | ~var1 & var2);
      var2 = 140821300;
      var1 = -270052829;
      int var10003 = (var1 | var2) - (var1 & var2);
      var2 = 1363985008;
      var1 = var10003;
      var10003 = (var1 | var2) - (var1 & var2);
      var2 = 79285608;
      var1 = -1200050838;
      int var10004 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1617161442;
      var1 = var10004;
      var10004 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1509476986;
      var1 = 2071448773;
      int var10005 = var1 + var2 - 2 * (var1 & var2);
      var2 = -770195040;
      var1 = var10005;
      var10005 = (var1 | var2) - (var1 & var2);
      var2 = 1789755353;
      var1 = 1833794320;
      int var10006 = var1 + var2 - 2 * (var1 & var2);
      var2 = 131078538;
      var1 = var10006;
      this.o = a("", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍\u2451謲㑮@\ua7e3꒦ꁤ꤉絢蹧⑵謳㑶~", var10003, var10004, var10005, (var1 | var2) & ~(var1 & var2));
      var2 = -1809414813;
      var1 = 1229720900;
      var10001 = (var1 | var2) & (~var1 | ~var2);
      var2 = -580220889;
      var1 = var10001;
      this.p = new String[var1 & ~var2 | ~var1 & var2];
      var10001 = (int)8481084402782239321L;
      var2 = -1951915257;
      var1 = var10001;
      var10001 = var1 + var2 - 2 * (var1 & var2);
      var2 = -363275938;
      var1 = var10001;
      this.r = pulse.Bool.from((var1 | var2) & (~var1 | ~var2));
      this.s = new ScrollBar(2.0F, 20.0F);
      this.t = new AnimationState();
      this.u = new AnimationState();
      this.v = new AnimationState();
      this.w = new AnimationState();
      var10001 = (int)4348051796058834875L;
      var2 = -2005606002;
      var1 = var10001;
      var10001 = (var1 | var2) & ~(var1 & var2);
      var2 = -647829963;
      var1 = var10001;
      this.x = pulse.Bool.from((var1 | var2) & ~(var1 & var2));
      var2 = 751268458;
      var1 = -810601009;
      var10001 = (var1 | var2) & (~var1 | ~var2);
      var2 = -479705179;
      var1 = var10001;
      this.y = pulse.Bool.from(var1 & ~var2 | ~var1 & var2);
   }

   public void a(String var1, ConfigEntry var2) {
      String var3;
      label20: {
         this.q = var2;
         if (var2 != null) {
            var3 = var2.a();
            if (var3 != null) {
               break label20;
            }
         }

         var3 = var1;
      }

      if (var3 == null) {
         var3 = "";
      }

      this.o = var3;
      this.p = new String[]{var1 == null ? "" : var1};
      this.n = true;
      this.s.e();
      this.t.a(true, 1.0);
      this.u.a(true, 1.0);
      this.v.a(true, 1.0);
      this.w.a(true, 1.0);
   }

   private float e() {
      int var10000 = this.p.length;
      int var10001 = (int)-680709088620157877L;
      int var5 = 1898672095;
      int var4 = var10001;
      var10001 = var4 + var5 - 2 * (var4 & var5);
      var5 = -1337914479;
      var4 = var10001;
      int var1 = Math.min(var10000, var4 + var5 - 2 * (var4 & var5));
      float var2 = var1 * 25.0F - 3.0F;
      float var3 = 20.0F;
      return 11.0F + var3 + 10.0F + var2 + 10.0F + 18.0F + 11.0F;
   }

   private float f() {
      int var10000 = this.p.length;
      int var3 = 481312215;
      int var2 = -734239372;
      int var10001 = (var2 | var3) & (~var2 | ~var3);
      var3 = -930326362;
      var2 = var10001;
      int var1 = Math.min(var10000, var2 & ~var3 | ~var2 & var3);
      return var1 * 25.0F - 3.0F;
   }

   private float g() {
      return this.p.length * 25.0F - 3.0F;
   }

   private boolean h() {
      int var10000 = this.p.length;
      int var10001 = (int)6519986415174966373L;
      int var2 = 883679235;
      int var1 = var10001;
      var10001 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1672758173;
      var1 = var10001;
      if (var10000 > ((var1 | var2) & (~var1 | ~var2))) {
         var10000 = (int)-3921988981121036227L;
         var2 = -453577008;
         var1 = var10000;
         var10000 = var1 & ~var2 | ~var1 & var2;
         var2 = -71424276;
         var1 = var10000;
         var10000 = var1 + var2 - 2 * (var1 & var2);
      } else {
         var10000 = (int)-7150784150990486083L;
         var2 = 1483124412;
         var1 = var10000;
         var10000 = (var1 | var2) & ~(var1 & var2);
         var2 = 652126977;
         var1 = var10000;
         var10000 = (var1 | var2) & ~(var1 & var2);
      }

      return pulse.Bool.from(var10000);
   }

   public void a() {
   }

   public boolean b() {
      return this.n;
   }

   public boolean c() {
      int var10;
      if (this.n && !(this.t.j() < 0.01)) {
         var10 = (int)-2246077757551153416L;
         int var7 = 2107174982;
         int var4 = var10;
         var10 = (var4 | var7) - (var4 & var7);
         var7 = 2128158398;
         var4 = var10;
         var10 = var4 & ~var7 | ~var4 & var7;
      } else {
         var10 = (int)2762964345415074100L;
         int var2 = 1062117120;
         int var1 = var10;
         var10 = (var1 | var2) & (~var1 | ~var2);
         var2 = -792224203;
         var1 = var10;
         var10 = (var1 | var2) - (var1 & var2);
      }

      return pulse.Bool.from(var10);
   }

   public void a(Runnable var1) {
      this.z = var1;
   }

   public void a(MatrixStack var1, Renderer2D var2, float var3, float var4, int var5, int var6) {
      this.t.a();
      this.u.a();
      this.v.a();
      this.w.a();
      this.s.a();
      float var7 = (float)this.t.j();
      if (var7 < 0.01F) {
         if (this.n && this.t.d()) {
            int var230 = (int)-6751589660558801019L;
            int var218 = 1417477974;
            int var133 = var230;
            var230 = (var133 | var218) & ~(var133 & var218);
            var218 = -246564653;
            var133 = var230;
            this.n = pulse.Bool.from(var133 & ~var218 | ~var133 & var218);
            if (this.z != null) {
               this.z.run();
            }
         }
      } else {
         int var8 = (int)(255.0F * var7);
         float var9 = this.e();
         float var10 = (var3 - 178.5F) / 2.0F;
         float var11 = (var4 - var9) / 2.0F;
         float var12 = 0.9F + 0.1F * var7;
         float var13 = 178.5F * var12;
         float var14 = var9 * var12;
         float var15 = var10 + (178.5F - var13) / 2.0F;
         float var16 = var11 + (var9 - var14) / 2.0F;
         int var10002 = (int)788370009286200287L;
         int var43 = 406178636;
         int var42 = var10002;
         var10002 = (var42 | var43) & (~var42 | ~var43);
         var43 = -1423540094;
         var42 = var10002;
         var10002 = (var42 | var43) & ~(var42 & var43);
         var43 = -799919726;
         var42 = -148888545;
         int var10003 = (var42 | var43) & ~(var42 & var43);
         var43 = 661788060;
         var42 = var10003;
         var10003 = (var42 | var43) & ~(var42 & var43);
         var43 = 905844172;
         var42 = 1367345052;
         int var10004 = (var42 | var43) & (~var42 | ~var43);
         var43 = 1685983815;
         var42 = var10004;
         var10004 = (var42 | var43) & (~var42 | ~var43);
         int var10005 = (int)-2229507920039882036L;
         var43 = -449079190;
         var42 = var10005;
         var10005 = (var42 | var43) - (var42 & var43);
         var43 = 388090474;
         var42 = var10005;
         Color var17 = pulse.Theme.a(new Color(var10002, var10003, var10004, var42 + var43 - 2 * (var42 & var43)), var8);
         var10002 = (int)9148937775688229027L;
         var43 = -651262266;
         var42 = var10002;
         var10002 = (var42 | var43) & ~(var42 & var43);
         var43 = -920508824;
         var42 = var10002;
         var10002 = (var42 | var43) - (var42 & var43);
         var10003 = (int)2603982411439291983L;
         var43 = -393440330;
         var42 = var10003;
         var10003 = var42 + var43 - 2 * (var42 & var43);
         var43 = 62434804;
         var42 = var10003;
         var10003 = (var42 | var43) & (~var42 | ~var43);
         var43 = -262496485;
         var42 = 1880969969;
         var10004 = var42 & ~var43 | ~var42 & var43;
         var43 = -2142777861;
         var42 = var10004;
         var10004 = (var42 | var43) & ~(var42 & var43);
         var43 = 150905647;
         var42 = -1400853596;
         var10005 = var42 + var43 - 2 * (var42 & var43);
         var43 = -1535244217;
         var42 = var10005;
         Color var18 = pulse.Theme.a(new Color(var10002, var10003, var10004, (var42 | var43) & (~var42 | ~var43)), var8);
         var2.a(var15, var16, var13, var14, 9.5F * var12, var17, var17, var18, var18, var1);
         var43 = -1533858572;
         var42 = -762403939;
         int var10001 = var42 & ~var43 | ~var42 & var43;
         var43 = 1981648742;
         var42 = var10001;
         FontRenderer var19 = FontManager.b[(var42 | var43) - (var42 & var43)];
         var43 = 1789052326;
         var42 = -2048821369;
         var10001 = (var42 | var43) & ~(var42 & var43);
         var43 = -280776147;
         var42 = var10001;
         FontRenderer var20 = FontManager.a[(var42 | var43) - (var42 & var43)];
         int var10000 = this.p.length;
         var43 = -430664077;
         var42 = 235772385;
         var10001 = var42 & ~var43 | ~var42 & var43;
         var43 = -396816493;
         var42 = var10001;
         String var220;
         if (var10000 > (var42 & ~var43 | ~var42 & var43)) {
            var10002 = (int)6408537290515004687L;
            var43 = 1482917261;
            var42 = var10002;
            var10002 = (var42 | var43) & (~var42 | ~var43);
            var43 = -732861467;
            var42 = var10002;
            var10002 = var42 + var43 - 2 * (var42 & var43);
            var10003 = (int)-6993532254445840204L;
            var43 = 847538041;
            var42 = var10003;
            var10003 = (var42 | var43) & ~(var42 & var43);
            var43 = -2060890420;
            var42 = var10003;
            var10003 = var42 + var43 - 2 * (var42 & var43);
            var43 = -775252257;
            var42 = -470382989;
            var10004 = (var42 | var43) - (var42 & var43);
            var43 = 734604813;
            var42 = var10004;
            var10004 = (var42 | var43) & ~(var42 & var43);
            var43 = -352139307;
            var42 = 433664359;
            var10005 = var42 + var43 - 2 * (var42 & var43);
            var43 = -220943690;
            var42 = var10005;
            var220 = a(
               "᛫ᦩᚿ᧕ᛉᶲᚲ᧓ᛎᦧᚹ\u19afᛏᶲᚰ\u19acᛆᦦᛁ\u19afᚺ",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍\u2451謲㑮@\ua7e3꒦ꁤ꤉絢蹧⑵謳㑶~",
               var10002,
               var10003,
               var10004,
               var42 & ~var43 | ~var42 & var43
            );
         } else {
            var43 = -2059435649;
            var42 = -1664368421;
            var10002 = var42 + var43 - 2 * (var42 & var43);
            var43 = -1355083069;
            var42 = var10002;
            var10002 = var42 & ~var43 | ~var42 & var43;
            var10003 = (int)4223194776878932773L;
            var43 = -1689783028;
            var42 = var10003;
            var10003 = var42 & ~var43 | ~var42 & var43;
            var43 = -918768054;
            var42 = var10003;
            var10003 = var42 + var43 - 2 * (var42 & var43);
            var10004 = (int)929656513971684199L;
            var43 = 324427151;
            var42 = var10004;
            var10004 = (var42 | var43) - (var42 & var43);
            var43 = -2093241369;
            var42 = var10004;
            var10004 = var42 & ~var43 | ~var42 & var43;
            var43 = 1805267483;
            var42 = -1662506706;
            var10005 = var42 & ~var43 | ~var42 & var43;
            var43 = -147615661;
            var42 = var10005;
            var220 = a(
               "᛫컋ᚿ캷ዑ캳ᚰ컏ᛄ캸ᛌ컎ዑ캱ᛏ컇ᛅ컀ᛌ",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍\u2451謲㑮@\ua7e3꒦ꁤ꤉絢蹧⑵謳㑶~",
               var10002,
               var10003,
               var10004,
               (var42 | var43) & (~var42 | ~var43)
            );
         }

         String var21 = var220;
         float var22 = var19.a(var21);
         float var23 = var15 + (var13 - var22) / 2.0F;
         float var24 = var16 + 11.0F * var12;
         var19.a(var21, var23, var24, pulse.Theme.a(pulse.Theme.a, var8), var1);
         float var25 = var24 + var19.b(var21) / 2.0F - 6.0F;
         if (this.q != null) {
            String var221 = this.q.a();
            var10001 = this.p.length;
            var10002 = (int)-7102785521693959495L;
            var43 = 1945666392;
            var42 = var10002;
            var10002 = (var42 | var43) - (var42 & var43);
            var43 = 1281120736;
            var42 = var10002;
            String var229;
            if (var10001 > (var42 | var43) - (var42 & var43)) {
               int var39 = this.p.length;
               StringBuilder var227 = new StringBuilder();
               var43 = -1708705226;
               var42 = -1366598177;
               var10004 = (var42 | var43) & (~var42 | ~var43);
               var43 = -2107427698;
               var42 = var10004;
               var10004 = (var42 | var43) & ~(var42 & var43);
               var43 = 1440376227;
               var42 = 269337599;
               var10005 = var42 + var43 - 2 * (var42 & var43);
               var43 = 988937950;
               var42 = var10005;
               var10005 = var42 + var43 - 2 * (var42 & var43);
               var43 = -219720056;
               var42 = -887211783;
               int var10006 = (var42 | var43) & (~var42 | ~var43);
               var43 = 914643749;
               var42 = var10006;
               var10006 = (var42 | var43) - (var42 & var43);
               var43 = 2108360656;
               var42 = 1199039458;
               int var10007 = (var42 | var43) & ~(var42 & var43);
               var43 = 987178935;
               var42 = var10007;
               StringBuilder var228 = var227.append(
                     a(
                        "ዑ舻",
                        "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍\u2451謲㑮@\ua7e3꒦ꁤ꤉絢蹧⑵謳㑶~",
                        var10004,
                        var10005,
                        var10006,
                        (var42 | var43) & (~var42 | ~var43)
                     )
                  )
                  .append(var39);
               var43 = 269798457;
               var42 = 438418029;
               var10004 = var42 + var43 - 2 * (var42 & var43);
               var43 = -1124457165;
               var42 = var10004;
               var10004 = var42 + var43 - 2 * (var42 & var43);
               var43 = -729913974;
               var42 = -967516672;
               var10005 = (var42 | var43) & ~(var42 & var43);
               var43 = 1832352656;
               var42 = var10005;
               var10005 = var42 + var43 - 2 * (var42 & var43);
               var10006 = (int)294282397159232527L;
               var43 = -704634691;
               var42 = var10006;
               var10006 = var42 & ~var43 | ~var42 & var43;
               var43 = 740295082;
               var42 = var10006;
               var10006 = var42 & ~var43 | ~var42 & var43;
               var10007 = (int)5809377939811464573L;
               var43 = 1201655878;
               var42 = var10007;
               var10007 = (var42 | var43) - (var42 & var43);
               var43 = -1276178906;
               var42 = var10007;
               var229 = var228.append(
                     a(
                        "ዑ滃ᚳ檥ዘ",
                        "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍\u2451謲㑮@\ua7e3꒦ꁤ꤉絢蹧⑵謳㑶~",
                        var10004,
                        var10005,
                        var10006,
                        var42 & ~var43 | ~var42 & var43
                     )
                  )
                  .toString();
            } else {
               var10003 = (int)-1732452630909054238L;
               var43 = 1509613037;
               var42 = var10003;
               var10003 = var42 + var43 - 2 * (var42 & var43);
               var43 = 927734888;
               var42 = var10003;
               var10003 = (var42 | var43) - (var42 & var43);
               var10004 = (int)1703629266391686612L;
               var43 = 2064668199;
               var42 = var10004;
               var10004 = (var42 | var43) & ~(var42 & var43);
               var43 = -1609940839;
               var42 = var10004;
               var10004 = (var42 | var43) & (~var42 | ~var43);
               var43 = 876890421;
               var42 = 1195836050;
               var10005 = var42 + var43 - 2 * (var42 & var43);
               var43 = 1947463452;
               var42 = var10005;
               var10005 = (var42 | var43) & (~var42 | ~var43);
               int var299 = (int)-2453038073776248073L;
               var43 = -1186292676;
               var42 = var299;
               var299 = var42 + var43 - 2 * (var42 & var43);
               var43 = -649084762;
               var42 = var299;
               var229 = a(
                  "", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍\u2451謲㑮@\ua7e3꒦ꁤ꤉絢蹧⑵謳㑶~", var10003, var10004, var10005, var42 & ~var43 | ~var42 & var43
               );
            }

            String var41 = var229;
            String var40 = var221;
            StringBuilder var222 = new StringBuilder();
            var43 = 400242764;
            var42 = 1208951200;
            var10003 = (var42 | var43) & (~var42 | ~var43);
            var43 = -384087413;
            var42 = var10003;
            var10003 = var42 & ~var43 | ~var42 & var43;
            var10004 = (int)8104899188391785436L;
            var43 = 1630049572;
            var42 = var10004;
            var10004 = (var42 | var43) - (var42 & var43);
            var43 = -703458890;
            var42 = var10004;
            var10004 = var42 + var43 - 2 * (var42 & var43);
            var10005 = (int)1567679957754855365L;
            var43 = -2030649358;
            var42 = var10005;
            var10005 = (var42 | var43) - (var42 & var43);
            var43 = 455546380;
            var42 = var10005;
            var10005 = (var42 | var43) - (var42 & var43);
            var43 = -1423642585;
            var42 = -1533171879;
            int var301 = (var42 | var43) - (var42 & var43);
            var43 = 260699439;
            var42 = var301;
            String var26 = var222.append(
                  a(
                     "᛫\ue7f9ᛌ\ue783ᛉ\ue7f4ዋ\ue3e7",
                     "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍\u2451謲㑮@\ua7e3꒦ꁤ꤉絢蹧⑵謳㑶~",
                     var10003,
                     var10004,
                     var10005,
                     (var42 | var43) & ~(var42 & var43)
                  )
               )
               .append(var40)
               .append(var41)
               .toString();
            float var27 = var20.a(var26);
            float var28 = var15 + (var13 - var27) / 2.0F;
            var20.a(var26, var28, var25 + 8.0F, pulse.Theme.a(pulse.Theme.b, var8), var1);
         }

         float var44 = var15 + 12.0F * var12;
         float var45 = var13 - 24.0F * var12;
         var43 = 1840071658;
         var42 = 51282689;
         var10004 = (var42 | var43) & ~(var42 & var43);
         var43 = -663972980;
         var42 = var10004;
         var10004 = (var42 | var43) - (var42 & var43);
         var10005 = (int)-7963977830469088271L;
         var43 = 30177346;
         var42 = var10005;
         var10005 = (var42 | var43) & (~var42 | ~var43);
         var43 = -786434576;
         var42 = var10005;
         var10005 = var42 & ~var43 | ~var42 & var43;
         var43 = -1839254757;
         var42 = -293302436;
         int var302 = var42 + var43 - 2 * (var42 & var43);
         var43 = 1820354015;
         var42 = var302;
         var302 = (var42 | var43) & ~(var42 & var43);
         var43 = 483130836;
         var42 = -785583731;
         int var306 = var42 + var43 - 2 * (var42 & var43);
         var43 = -840647393;
         var42 = var306;
         float var46 = var25
            + var20.b(
               a(
                  "ኰ",
                  "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍\u2451謲㑮@\ua7e3꒦ꁤ꤉絢蹧⑵謳㑶~",
                  var10004,
                  var10005,
                  var302,
                  (var42 | var43) & (~var42 | ~var43)
               )
            )
            + 10.0F * var12;
         float var29 = this.f() * var12;
         float var30 = this.g() * var12;
         if (this.h()) {
            var2.b().a(var44, var46, var45 + 10.0F, var29, var1);
         }

         float var31 = this.s.b();
         var43 = 1873476930;
         var42 = 569425574;
         var10000 = (var42 | var43) & ~(var42 & var43);
         var43 = 1314538468;
         var42 = var10000;

         for (int var32 = (var42 | var43) - (var42 & var43); var32 < this.p.length; var32++) {
            float var33 = var46 + var32 * 25.0F * var12 - var31;
            if (var33 + 22.0F * var12 >= var46 && var33 <= var46 + var29) {
               this.a(var1, var2, var44, var33, var45, 22.0F * var12, var8, this.p[var32]);
            }
         }

         if (this.h()) {
            var2.b().a(var1);
            float var47 = var15 + var13 - 12.0F * var12 / 2.0F - 2.0F;
            var43 = -1677790659;
            var42 = 1144075051;
            int var10010 = (var42 | var43) & (~var42 | ~var43);
            var43 = -540032746;
            var42 = var10010;
            this.s.a(var1, var2, var47, var46, var29, var30, var29, var5, var6, pulse.Bool.from(var42 & (var43 ^ -1) | (var42 ^ -1) & var43));
         }

         float var48 = var46 + var29;
         float var49 = var48 + 10.0F * var12;
         float var34 = (var45 - 7.0F * var12) / 2.0F;
         float var35 = var44;
         float var36 = var44 + var34 + 7.0F * var12;
         boolean var37 = GuiInput.a(var35, var49, var34, 18.0F * var12, var5, var6);
         boolean var38 = GuiInput.a(var36, var49, var34, 18.0F * var12, var5, var6);
         if (var37 != this.x) {
            this.u.a(var37 ? 1.0 : 0.0, 0.15, pulse.Easing.h);
            this.x = var37;
         }

         if (var38 != this.y) {
            this.v.a(var38 ? 1.0 : 0.0, 0.15, pulse.Easing.h);
            this.y = var38;
         }

         this.a(var1, var2, var35, var49, var34, 18.0F * var12, var8);
         this.b(var1, var2, var36, var49, var34, 18.0F * var12, var8);
         if (var37 || var38) {
            GuiInput.g();
         }
      }
   }

   private void a(MatrixStack var1, Renderer2D var2, float var3, float var4, float var5, float var6, int var7, String var8) {
      Color var9 = pulse.Theme.b(pulse.Theme.q, var7 / 255.0F);
      Color var10 = pulse.Theme.b(pulse.Theme.n, var7 / 255.0F);
      var2.a(var3 - 0.5F, var4 - 0.5F, var5 + 1.0F, var6 + 1.0F, 9.5F, var9, var9, var10, var10, var1);
      int var21 = -676933928;
      int var20 = -313147624;
      int var10002 = var20 & ~var21 | ~var20 & var21;
      var21 = 989032908;
      var20 = var10002;
      var10002 = (var20 | var21) - (var20 & var21);
      var21 = -96813687;
      var20 = -55927371;
      int var10003 = var20 + var21 - 2 * (var20 & var21);
      var21 = 110108720;
      var20 = var10003;
      var10003 = var20 + var21 - 2 * (var20 & var21);
      int var10004 = (int)4624209922189989377L;
      var21 = 537212964;
      var20 = var10004;
      var10004 = var20 + var21 - 2 * (var20 & var21);
      var21 = -1291997647;
      var20 = var10004;
      var10004 = (var20 | var21) - (var20 & var21);
      int var10005 = (int)-3905980127377786645L;
      var21 = -754242434;
      var20 = var10005;
      var10005 = var20 + var21 - 2 * (var20 & var21);
      var21 = 81941516;
      var20 = var10005;
      Color var11 = pulse.Theme.a(new Color(var10002, var10003, var10004, var20 & ~var21 | ~var20 & var21), var7);
      var10002 = (int)-7668950128221322501L;
      var21 = -1940330773;
      var20 = var10002;
      var10002 = var20 & ~var21 | ~var20 & var21;
      var21 = -210344931;
      var20 = var10002;
      var10002 = (var20 | var21) & ~(var20 & var21);
      var10003 = (int)376685280714171339L;
      var21 = 269568393;
      var20 = var10003;
      var10003 = (var20 | var21) & ~(var20 & var21);
      var21 = 1292331599;
      var20 = var10003;
      var10003 = (var20 | var21) & (~var20 | ~var21);
      var21 = 4597666;
      var20 = -2075666079;
      var10004 = var20 & ~var21 | ~var20 & var21;
      var21 = -2080244013;
      var20 = var10004;
      var10004 = (var20 | var21) & (~var20 | ~var21);
      var10005 = (int)3370325366180697228L;
      var21 = -89505428;
      var20 = var10005;
      var10005 = var20 + var21 - 2 * (var20 & var21);
      var21 = -1374022279;
      var20 = var10005;
      Color var12 = pulse.Theme.a(new Color(var10002, var10003, var10004, (var20 | var21) & (~var20 | ~var21)), var7);
      var2.a(var3, var4, var5, var6, 9.5F, var11, var11, var12, var12, var1);
      var21 = 510916968;
      var20 = 141290635;
      int var10001 = (var20 | var21) - (var20 & var21);
      var21 = 370677231;
      var20 = var10001;
      FontRenderer var13 = FontManager.a[var20 + var21 - 2 * (var20 & var21)];
      float var14 = var4 + (var6 - var13.b(var8)) / 2.0F + 3.5F;
      String var15 = var8;
      float var16 = var13.a(var15);
      if (var16 > var5 - 16.0F) {
         while (true) {
            String var18 = var15;
            StringBuilder var98 = new StringBuilder().append(var18);
            var21 = 63633826;
            var20 = 2062944464;
            var10004 = (var20 | var21) - (var20 & var21);
            var21 = -806116843;
            var20 = var10004;
            var10004 = var20 & ~var21 | ~var20 & var21;
            var10005 = (int)5993570194184376873L;
            var21 = -182799998;
            var20 = var10005;
            var10005 = var20 + var21 - 2 * (var20 & var21);
            var21 = -1994520184;
            var20 = var10005;
            var10005 = (var20 | var21) - (var20 & var21);
            var21 = -532577855;
            var20 = 2081577020;
            int var10006 = (var20 | var21) & (~var20 | ~var21);
            var21 = -1758423023;
            var20 = var10006;
            var10006 = var20 & ~var21 | ~var20 & var21;
            var21 = 1159004973;
            var20 = 850680471;
            int var10007 = (var20 | var21) - (var20 & var21);
            var21 = 2007410833;
            var20 = var10007;
            if (!(
                  var13.a(
                        var98.append(
                              a(
                                 "뛘ᒔ뛘",
                                 "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍\u2451謲㑮@\ua7e3꒦ꁤ꤉絢蹧⑵謳㑶~",
                                 var10004,
                                 var10005,
                                 var10006,
                                 (var20 | var21) & ~(var20 & var21)
                              )
                           )
                           .toString()
                     )
                     > var5 - 16.0F
               )
               || var15.length() <= 0) {
               String var19 = var15;
               StringBuilder var10000 = new StringBuilder().append(var19);
               var10003 = (int)6456105690912460541L;
               var21 = 460752391;
               var20 = var10003;
               var10003 = (var20 | var21) & ~(var20 & var21);
               var21 = 781114269;
               var20 = var10003;
               var10003 = (var20 | var21) & ~(var20 & var21);
               var21 = 1720107065;
               var20 = 226092510;
               var10004 = (var20 | var21) & ~(var20 & var21);
               var21 = 256339111;
               var20 = var10004;
               var10004 = var20 & ~var21 | ~var20 & var21;
               var10005 = (int)7191250985466629529L;
               var21 = -1314684205;
               var20 = var10005;
               var10005 = (var20 | var21) & ~(var20 & var21);
               var21 = 597803588;
               var20 = var10005;
               var10005 = var20 & ~var21 | ~var20 & var21;
               var21 = -1324888032;
               var20 = -1269407140;
               var10006 = (var20 | var21) & ~(var20 & var21);
               var21 = 89367092;
               var20 = var10006;
               var15 = var10000.append(
                     a(
                        "뛘\uf5f7뛘",
                        "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍\u2451謲㑮@\ua7e3꒦ꁤ꤉絢蹧⑵謳㑶~",
                        var10003,
                        var10004,
                        var10005,
                        (var20 | var21) & (~var20 | ~var21)
                     )
                  )
                  .toString();
               break;
            }

            var21 = 1434427693;
            var20 = -2009118616;
            var10001 = var20 + var21 - 2 * (var20 & var21);
            var21 = -582948539;
            var20 = var10001;
            var10001 = (var20 | var21) - (var20 & var21);
            var10002 = var15.length();
            var10003 = (int)1627948511055959198L;
            var21 = -187697677;
            var20 = var10003;
            var10003 = (var20 | var21) & (~var20 | ~var21);
            var21 = 1590829420;
            var20 = var10003;
            var21 = (var20 | var21) & (~var20 | ~var21);
            var20 = var10002;
            var15 = var15.substring(var10001, 2 * (var20 & ~var21) - (var20 ^ var21));
         }
      }

      float var17 = var3 + (var5 - var13.a(var15)) / 2.0F;
      var13.a(var15, var17, var14, pulse.Theme.a(pulse.Theme.a, var7), var1);
   }

   private void a(MatrixStack var1, Renderer2D var2, float var3, float var4, float var5, float var6, int var7) {
      float var8 = (float)this.u.j();
      float var9 = (float)this.w.j();
      int var22 = -1647996132;
      int var21 = 978858009;
      int var10003 = var21 + var22 - 2 * (var21 & var22);
      var22 = -1482841305;
      var21 = var10003;
      var10003 = var21 & ~var22 | ~var21 & var22;
      int var10004 = (int)7916000154174319068L;
      var22 = 788699542;
      var21 = var10004;
      var10004 = (var21 | var22) & (~var21 | ~var22);
      var22 = 545124495;
      var21 = var10004;
      var10004 = (var21 | var22) & ~(var21 & var22);
      var22 = 1431820268;
      var21 = 1576276434;
      int var10005 = var21 + var22 - 2 * (var21 & var22);
      var22 = 144950880;
      var21 = var10005;
      Color var10 = ColorUtils.a(pulse.Theme.y, new Color(var10003, var10004, var21 & ~var22 | ~var21 & var22), var9);
      var10003 = (int)-2334960288168925197L;
      var22 = 1151830852;
      var21 = var10003;
      var10003 = (var21 | var22) & (~var21 | ~var22);
      var22 = 2007739553;
      var21 = var10003;
      var10003 = var21 + var22 - 2 * (var21 & var22);
      var22 = 1411207485;
      var21 = -1796764890;
      var10004 = (var21 | var22) & ~(var21 & var22);
      var22 = -1057301832;
      var21 = var10004;
      var10004 = (var21 | var22) & (~var21 | ~var22);
      var22 = -1429662547;
      var21 = 1870634045;
      var10005 = var21 & ~var22 | ~var21 & var22;
      var22 = -977893158;
      var21 = var10005;
      Color var11 = ColorUtils.a(pulse.Theme.z, new Color(var10003, var10004, (var21 | var22) & (~var21 | ~var22)), var9);
      var10003 = (int)-3856793771047581988L;
      var22 = 1406882375;
      var21 = var10003;
      var10003 = var21 + var22 - 2 * (var21 & var22);
      var22 = -1960946479;
      var21 = var10003;
      var10003 = var21 + var22 - 2 * (var21 & var22);
      var22 = -96877592;
      var21 = -665236830;
      var10004 = (var21 | var22) & ~(var21 & var22);
      var22 = 576752020;
      var21 = var10004;
      var10004 = (var21 | var22) & (~var21 | ~var22);
      var10005 = (int)-2641756844704954820L;
      var22 = -1912426163;
      var21 = var10005;
      var10005 = var21 + var22 - 2 * (var21 & var22);
      var22 = -161138703;
      var21 = var10005;
      Color var12 = ColorUtils.a(pulse.Theme.B, new Color(var10003, var10004, (var21 | var22) - (var21 & var22)), var9);
      var10003 = (int)3453316938085011367L;
      var22 = -1619839540;
      var21 = var10003;
      var10003 = (var21 | var22) - (var21 & var22);
      var22 = -266945975;
      var21 = var10003;
      var10003 = (var21 | var22) & ~(var21 & var22);
      var10004 = (int)-5198126919183984623L;
      var22 = 944329607;
      var21 = var10004;
      var10004 = var21 & ~var22 | ~var21 & var22;
      var22 = -1527919789;
      var21 = var10004;
      var10004 = (var21 | var22) - (var21 & var22);
      var10005 = (int)5129062096178489213L;
      var22 = 678167148;
      var21 = var10005;
      var10005 = (var21 | var22) & ~(var21 & var22);
      var22 = 433038671;
      var21 = var10005;
      Color var13 = ColorUtils.a(pulse.Theme.y, new Color(var10003, var10004, (var21 | var22) & (~var21 | ~var22)), var9);
      Color var14 = ColorUtils.a(var10, var12, var8);
      Color var15 = ColorUtils.a(var11, var13, var8);
      var14 = pulse.Theme.a(var14, var7);
      var15 = pulse.Theme.a(var15, var7);
      var2.a(var3, var4, var5, var6, 6.0F, var14, var14, var15, var15, var1);
      int var10001 = (int)666616216968895712L;
      var22 = -1269586255;
      var21 = var10001;
      var10001 = var21 + var22 - 2 * (var21 & var22);
      var22 = 1772206685;
      var21 = var10001;
      FontRenderer var16 = FontManager.a[var21 + var22 - 2 * (var21 & var22)];
      String var10000;
      if (this.r) {
         int var10002 = (int)7060451566307837313L;
         var22 = 165082329;
         var21 = var10002;
         var10002 = (var21 | var22) & (~var21 | ~var22);
         var22 = 347644479;
         var21 = var10002;
         var10002 = var21 & ~var22 | ~var21 & var22;
         var10003 = (int)-6824823504620884354L;
         var22 = 649927343;
         var21 = var10003;
         var10003 = (var21 | var22) - (var21 & var22);
         var22 = -292467968;
         var21 = var10003;
         var10003 = (var21 | var22) - (var21 & var22);
         var22 = -1967398383;
         var21 = -507747717;
         var10004 = var21 + var22 - 2 * (var21 & var22);
         var22 = 1896033167;
         var21 = var10004;
         var10004 = (var21 | var22) & (~var21 | ~var22);
         var22 = 1597378106;
         var21 = 1919789708;
         var10005 = var21 & ~var22 | ~var21 & var22;
         var22 = 761372571;
         var21 = var10005;
         var10000 = a(
            "晻ส晤ฯ晢๐晤ย晪อ晤",
            "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍\u2451謲㑮@\ua7e3꒦ꁤ꤉絢蹧⑵謳㑶~",
            var10002,
            var10003,
            var10004,
            var21 + var22 - 2 * (var21 & var22)
         );
      } else {
         var22 = 224839134;
         var21 = 200146436;
         int var110 = (var21 | var22) & ~(var21 & var22);
         var22 = -1337694019;
         var21 = var110;
         var110 = var21 + var22 - 2 * (var21 & var22);
         var22 = 596734872;
         var21 = 1082964428;
         var10003 = var21 + var22 - 2 * (var21 & var22);
         var22 = 861298796;
         var21 = var10003;
         var10003 = (var21 | var22) & (~var21 | ~var22);
         var10004 = (int)8824556944368773411L;
         var22 = 668244515;
         var21 = var10004;
         var10004 = var21 & ~var22 | ~var21 & var22;
         var22 = 1665421232;
         var21 = var10004;
         var10004 = var21 + var22 - 2 * (var21 & var22);
         var10005 = (int)5333799983504013735L;
         var22 = 1236262007;
         var21 = var10005;
         var10005 = (var21 | var22) & (~var21 | ~var22);
         var22 = 236863556;
         var21 = var10005;
         var10000 = a(
            "晀႗晥႑昚႗晨႙昘ქ",
            "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍\u2451謲㑮@\ua7e3꒦ꁤ꤉絢蹧⑵謳㑶~",
            var110,
            var10003,
            var10004,
            (var21 | var22) - (var21 & var22)
         );
      }

      String var17 = var10000;
      float var18 = var16.a(var17);
      float var19 = var3 + (var5 - var18) / 2.0F;
      float var20 = var4 + (var6 - var16.b(var17)) / 2.0F + 3.5F;
      var16.a(var17, var19, var20, pulse.Theme.a(pulse.Theme.aa, var7), var1);
   }

   private void b(MatrixStack var1, Renderer2D var2, float var3, float var4, float var5, float var6, int var7) {
      float var8 = (float)this.v.j();
      Color var9 = pulse.Theme.b(pulse.Theme.q, var7 / 255.0F);
      Color var10 = pulse.Theme.b(pulse.Theme.n, var7 / 255.0F);
      var2.a(var3 - 0.5F, var4 - 0.5F, var5 + 1.0F, var6 + 1.0F, 6.0F, var9, var9, var10, var10, var1);
      Color var11 = ColorUtils.a(pulse.Theme.e, pulse.Theme.I, var8);
      Color var12 = ColorUtils.a(pulse.Theme.f, pulse.Theme.J, var8);
      var11 = pulse.Theme.a(var11, var7);
      var12 = pulse.Theme.a(var12, var7);
      var2.a(var3, var4, var5, var6, 6.0F, var11, var11, var12, var12, var1);
      int var20 = -1083067604;
      int var19 = 2066059047;
      int var10001 = (var19 | var20) - (var19 & var20);
      var20 = -1001112569;
      var19 = var10001;
      FontRenderer var13 = FontManager.a[(var19 | var20) & ~(var19 & var20)];
      var20 = 212584182;
      var19 = -1282220220;
      int var10002 = (var19 | var20) - (var19 & var20);
      var20 = 167135957;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = -1577513712;
      var19 = -803995327;
      int var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = 1042885999;
      var19 = var10003;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = -672474033;
      var19 = -1392969574;
      int var10004 = (var19 | var20) & ~(var19 & var20);
      var20 = 1654276701;
      var19 = var10004;
      var10004 = (var19 | var20) - (var19 & var20);
      var20 = 1061147384;
      var19 = 2075550114;
      int var10005 = var19 & ~var20 | ~var19 & var20;
      var20 = 1154234713;
      var19 = var10005;
      String var14 = a(
         "ᒤ췧ᒉ춗ᓸ축ᓿ", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍\u2451謲㑮@\ua7e3꒦ꁤ꤉絢蹧⑵謳㑶~", var10002, var10003, var10004, (var19 | var20) - (var19 & var20)
      );
      float var15 = var13.a(var14);
      float var16 = var3 + (var5 - var15) / 2.0F;
      float var17 = var4 + (var6 - var13.b(var14)) / 2.0F + 3.5F;
      Color var18 = ColorUtils.a(pulse.Theme.b, pulse.Theme.a, var8);
      var13.a(var14, var16, var17, pulse.Theme.a(var18, var7), var1);
   }

   public boolean a(float var1, float var2, int var3, int var4) {
      return this.n;
   }

   public void a(float var1, int var2, int var3) {
      if (this.n && this.h()) {
         float var4 = this.f();
         float var5 = this.g();
         this.s.a(var1, var5, var4);
      }
   }

   public void a(int var1, int var2) {
      this.s.d();
   }

   public void a(int var1, int var2, double var3, double var5) {
      if (this.s.c()) {
         float var7 = this.f();
         float var8 = this.g();
         this.s.a(var2, var8, var7);
      }
   }

   public boolean a(int var1, int var2, int var3) {
      if (!this.n) {
         return false;
      }

      if (var1 != 259) {
         if (var1 != 257 && var1 != 335) {
            if (var1 != 256) {
               return true;
            }

            this.n = false;
            return true;
         } else {
            if (this.q != null) {
               this.q.a(this.o);
            }

            this.n = false;
            if (this.z != null) {
               this.z.run();
            }

            return true;
         }
      } else {
         if (this.o == null) {
            this.o = "";
         } else if (!this.o.isEmpty()) {
            this.o = this.o.substring(0, this.o.length() - 1);
            if (this.q != null) {
               this.q.a(this.o);
            }
         }

         return true;
      }
   }

   public boolean a(char var1, int var2) {
      if (!this.n) {
         return false;
      }

      if (var1 < ' ') {
         return true;
      }

      this.o = (this.o == null ? "" : this.o) + var1;
      if (this.q != null) {
         this.q.a(this.o);
      }

      return true;
   }

   public boolean d() {
      int var10000 = (int)3819661919961053983L;
      int var2 = -420832969;
      int var1 = var10000;
      var10000 = (var1 | var2) & ~(var1 & var2);
      var2 = -1145576920;
      var1 = var10000;
      return pulse.Bool.from((var1 | var2) & (var1 ^ -1 | var2 ^ -1));
   }

   public static String a(String var0, String var1, int var2, int var3, int var4, int var5) {
      char[] var6 = var1.toCharArray();
      char[] var7 = new char[var6.length];
      int var10000 = (int)-642281552342744582L;
      int var18 = 1571279888;
      int var17 = var10000;
      var10000 = var17 & ~var18 | ~var17 & var18;
      var18 = -1619733024;
      var17 = var10000;
      char[] var220 = new char[var17 + var18 - 2 * (var17 & var18)];
      var18 = 512364566;
      var17 = 236895772;
      int var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 278179338;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1599894388;
      var17 = -1531361230;
      int var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 68848780;
      var17 = var10003;
      var220[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var10002 = (int)6870344180580343277L;
      var18 = -1667841900;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 750722424;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 254003269;
      var17 = 1027094889;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 840684201;
      var17 = var10003;
      var220[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var18 = -682164096;
      var17 = -752946424;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 71955338;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 689143829;
      var17 = -1335382822;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -1720447159;
      var17 = var10003;
      var220[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var18 = 413359699;
      var17 = -1911806768;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1766884736;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -259550127;
      var17 = -398466108;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 414773126;
      var17 = var10003;
      var220[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var18 = -268379851;
      var17 = -667646935;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 674520344;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var10003 = (int)3700391468210690213L;
      var18 = 418592269;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 1214660493;
      var17 = var10003;
      var220[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var10002 = (int)-7318363691781925480L;
      var18 = -189057989;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -763108954;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -1657538151;
      var17 = -1994130272;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 336609467;
      var17 = var10003;
      var220[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var10002 = (int)-2459274074028810168L;
      var18 = 1908984073;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 501721415;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)-5989289291325594836L;
      var18 = 575696600;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1730987239;
      var17 = var10003;
      var220[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var18 = 1185140741;
      var17 = -324013908;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -1442045778;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 1275187442;
      var17 = -1007335332;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1879790452;
      var17 = var10003;
      var220[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var10002 = (int)-1378210095790616470L;
      var18 = 1853025351;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 553253925;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 1261571690;
      var17 = 283299338;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1540409395;
      var17 = var10003;
      var220[var10002] = (char)((var17 | var18) - (var17 & var18));
      var10002 = (int)5669538512555059362L;
      var18 = -59899972;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -447719657;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)6681216625290802097L;
      var18 = 222020513;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 1289729844;
      var17 = var10003;
      var220[var10002] = (char)((var17 | var18) - (var17 & var18));
      char[] var8 = var220;
      var10000 = (int)-4145495863440741886L;
      var18 = 1341932986;
      var17 = var10000;
      var10000 = (var17 | var18) - (var17 & var18);
      var18 = -1774243918;
      var17 = var10000;
      char[] var223 = new char[var17 + var18 - 2 * (var17 & var18)];
      var10002 = (int)-6499255531482946748L;
      var18 = -1938236439;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -653281107;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -1080805296;
      var17 = -733814971;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 1809231669;
      var17 = var10003;
      var223[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var10002 = (int)6849966014351541953L;
      var18 = 39841484;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 582215692;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var10003 = (int)2556232926805027715L;
      var18 = 1944767954;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -558587310;
      var17 = var10003;
      var223[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var10002 = (int)-5713163458605392739L;
      var18 = -1043697670;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 1675572069;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)-8344419595445460182L;
      var18 = 479761120;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1338886503;
      var17 = var10003;
      var223[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var10002 = (int)522035556266170081L;
      var18 = -1806625754;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 118440644;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -766318671;
      var17 = 2110374933;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1348789338;
      var17 = var10003;
      var223[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var10002 = (int)6786626455855099960L;
      var18 = -706556517;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 559955367;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 1607388220;
      var17 = 598021628;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 2087444864;
      var17 = var10003;
      var223[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var18 = 1194025035;
      var17 = -1836397905;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -710825247;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var10003 = (int)-1380283692171092510L;
      var18 = 2145014053;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -113576877;
      var17 = var10003;
      var223[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var10002 = (int)6253383684338977716L;
      var18 = 1232929428;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 1950517542;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)-2706690924295135596L;
      var18 = 1128425197;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -1344291008;
      var17 = var10003;
      var223[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var18 = -1910686998;
      var17 = 1700819872;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -344110771;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1589854581;
      var17 = 1753903619;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 910762830;
      var17 = var10003;
      var223[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var10002 = (int)3962766113327856011L;
      var18 = 130391021;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -686218642;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 132996371;
      var17 = 380628582;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 289550449;
      var17 = var10003;
      var223[var10002] = (char)((var17 | var18) - (var17 & var18));
      var18 = 2096570061;
      var17 = 267769729;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 1929562437;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1592766307;
      var17 = -142251386;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1452607784;
      var17 = var10003;
      var223[var10002] = (char)((var17 | var18) - (var17 & var18));
      char[] var9 = var223;
      var10000 = (int)1859580848181485328L;
      var18 = 1562479097;
      var17 = var10000;
      var10000 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1814325527;
      var17 = var10000;

      for (int var10 = var17 + var18 - 2 * (var17 & var18); var10 < var6.length; var10++) {
         char var281 = var6[var10];
         char var205 = var8[var10 % var8.length];
         char var106 = var281;
         var7[var10] = (char)(var106 & ~var205 | ~var106 & var205);
      }

      char[] var19 = new char[var7.length];
      var18 = 1107622451;
      var17 = 757058372;
      var10000 = var17 & ~var18 | ~var17 & var18;
      var18 = 1864053111;
      var17 = var10000;

      for (int var11 = (var17 | var18) & ~(var17 & var18); var11 < var6.length; var11++) {
         char var282 = var7[var11];
         char var208 = var9[var11 % var9.length];
         char var109 = var282;
         var19[var11] = (char)((var109 | var208) & ~(var109 & var208));
      }

      String var20 = new String(var19);
      int var12 = var20.hashCode();
      var18 = var5;
      var17 = var3;
      var10000 = (var17 & ~var18) - (~var17 & var18);
      var18 = var2;
      var17 = var10000;
      int var13 = (var17 & ~var18) - (~var17 & var18);
      char[] var14 = var0.toCharArray();
      char[] var15 = new char[var14.length];
      var18 = 367859394;
      var17 = -232181163;
      var10000 = var17 + var18 - 2 * (var17 & var18);
      var18 = -406575977;
      var17 = var10000;

      for (int var16 = (var17 | var18) & (~var17 | ~var18); var16 < var15.length; var16++) {
         int var10001 = (int)-421991661752203644L;
         var18 = -697312449;
         var17 = var10001;
         var10001 = var17 & ~var18 | ~var17 & var18;
         var18 = 293248441;
         var17 = var10001;
         switch (var16 % (var17 + var18 - 2 * (var17 & var18))) {
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
               var15[var16] = (char)(var17 & ~var216 | ~var17 & var216);
         }
      }

      return new String(var15);
   }
}
