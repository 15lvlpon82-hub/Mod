package pulse;

import java.awt.Color;
import java.util.function.BiConsumer;
import net.minecraft.client.util.math.MatrixStack;

public class ConfigBoundsDialog {
   private static final float a = 178.5F;
   private static final float b = 155.0F;
   private static final float c = 9.5F;
   private static final float d = 12.0F;
   private static final float e = 11.0F;
   private static final float f = 11.5F;
   private static final float g = 2.5F;
   private static final float h = 22.0F;
   private static final float i = 9.5F;
   private static final float j = 31.5F;
   private static final float k = 18.0F;
   private static final float l = 6.0F;
   private static final float m = 7.0F;
   private static final float n = 18.0F;
   private boolean o;
   private ConfigEntry p;
   private final AnimationState q;
   private final AnimationState r;
   private final AnimationState s;
   private final AnimationState t;
   private boolean u;
   private boolean v;
   private boolean w;
   private boolean x;
   private final TextInput y;
   private final TextInput z;
   private BiConsumer<Integer, Integer> A;
   private Runnable B;

   public ConfigBoundsDialog() {
      int var10001 = (int)-5340023229402785725L;
      int var2 = 1564464286;
      int var1 = var10001;
      var10001 = var1 + var2 - 2 * (var1 & var2);
      var2 = 35851485;
      var1 = var10001;
      this.o = pulse.Bool.from((var1 | var2) & (~var1 | ~var2));
      this.q = new AnimationState();
      this.r = new AnimationState();
      this.s = new AnimationState();
      this.t = new AnimationState();
      var10001 = (int)4337965903419596561L;
      var2 = -887729187;
      var1 = var10001;
      var10001 = (var1 | var2) & ~(var1 & var2);
      var2 = -1174238004;
      var1 = var10001;
      this.u = pulse.Bool.from(var1 + var2 - 2 * (var1 & var2));
      var10001 = (int)-589657084197819836L;
      var2 = -1863457849;
      var1 = var10001;
      var10001 = var1 + var2 - 2 * (var1 & var2);
      var2 = 502614403;
      var1 = var10001;
      this.v = pulse.Bool.from((var1 | var2) - (var1 & var2));
      var10001 = (int)1988335190588797862L;
      var2 = 825709954;
      var1 = var10001;
      var10001 = (var1 | var2) & (~var1 | ~var2);
      var2 = 138634788;
      var1 = var10001;
      this.w = pulse.Bool.from((var1 | var2) & (~var1 | ~var2));
      var10001 = (int)3653917312227613349L;
      var2 = -932160625;
      var1 = var10001;
      var10001 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1636450602;
      var1 = var10001;
      this.x = pulse.Bool.from(var1 + var2 - 2 * (var1 & var2));
      TextInput.InputType var10003 = TextInput.InputType.INT;
      int var10006 = (int)2408920226238566993L;
      var2 = 1565992758;
      var1 = var10006;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var2 = 186255682;
      var1 = var10006;
      var10006 = var1 & ~var2 | ~var1 & var2;
      int var10007 = (int)-7031861204399263856L;
      var2 = 1331394833;
      var1 = var10007;
      var10007 = (var1 | var2) & ~(var1 & var2);
      var2 = -179474616;
      var1 = var10007;
      var10007 = (var1 | var2) - (var1 & var2);
      var2 = 1800543076;
      var1 = -62364509;
      int var10008 = (var1 | var2) & ~(var1 & var2);
      var2 = -1664721667;
      var1 = var10008;
      var10008 = (var1 | var2) & ~(var1 & var2);
      int var10009 = (int)-1844306107990415071L;
      var2 = -1261840137;
      var1 = var10009;
      var10009 = var1 + var2 - 2 * (var1 & var2);
      var2 = 2093812452;
      var1 = var10009;
      String var10004 = a(
         "", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍\u2451謲㑮Qꟴ꒰ꁰꤑ絿蹅⑴謚㑸v\ua7e7꒹", var10006, var10007, var10008, (var1 | var2) - (var1 & var2)
      );
      var10007 = (int)5838573240893825133L;
      var2 = 753401235;
      var1 = var10007;
      var10007 = (var1 | var2) & ~(var1 & var2);
      var2 = 17637851;
      var1 = var10007;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      var2 = -216696058;
      var1 = -445980489;
      var10008 = (var1 | var2) & (~var1 | ~var2);
      var2 = 442563525;
      var1 = var10008;
      var10008 = (var1 | var2) - (var1 & var2);
      var10009 = (int)7518883356070718347L;
      var2 = 846843284;
      var1 = var10009;
      var10009 = (var1 | var2) - (var1 & var2);
      var2 = 2063762400;
      var1 = var10009;
      var10009 = var1 & ~var2 | ~var1 & var2;
      int var10010 = (int)1096946372445927158L;
      var2 = 756871278;
      var1 = var10010;
      var10010 = (var1 | var2) & (~var1 | ~var2);
      var2 = -568449211;
      var1 = var10010;
      this.y = new TextInput(
         var10003,
         var10004,
         a("㹦", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍\u2451謲㑮Qꟴ꒰ꁰꤑ絿蹅⑴謚㑸v\ua7e7꒹", var10007, var10008, var10009, (var1 | var2) - (var1 & var2))
      );
      var2 = -275477259;
      var1 = 923024370;
      var10001 = (var1 | var2) - (var1 & var2);
      var2 = -661604607;
      var1 = var10001;
      this.y.a(var1 + var2 - 2 * (var1 & var2));
      this.y.a(9.5F, 0.0F, 0.0F, 9.5F);
      this.y.a(pulse.Theme.S, pulse.Theme.T);
      var2 = 1535583426;
      var1 = -1114234583;
      var10001 = (var1 | var2) - (var1 & var2);
      var2 = -435091990;
      var1 = var10001;
      this.y.a(pulse.Bool.from(var1 + var2 - 2 * (var1 & var2)));
      var10003 = TextInput.InputType.INT;
      var2 = -795383551;
      var1 = 1481751454;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var2 = 398454458;
      var1 = var10006;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var10007 = (int)9166136422814112062L;
      var2 = 1470047617;
      var1 = var10007;
      var10007 = (var1 | var2) & (~var1 | ~var2);
      var2 = 2130896519;
      var1 = var10007;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      var10008 = (int)2523705780209912648L;
      var2 = 1235054365;
      var1 = var10008;
      var10008 = var1 & ~var2 | ~var1 & var2;
      var2 = 1775369092;
      var1 = var10008;
      var10008 = (var1 | var2) & (~var1 | ~var2);
      var2 = 556504529;
      var1 = -1751356566;
      var10009 = (var1 | var2) - (var1 & var2);
      var2 = -1231543014;
      var1 = var10009;
      var10004 = a(
         "", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍\u2451謲㑮Qꟴ꒰ꁰꤑ絿蹅⑴謚㑸v\ua7e7꒹", var10006, var10007, var10008, (var1 | var2) & ~(var1 & var2)
      );
      var10007 = (int)-18057177964875108L;
      var2 = 1256412884;
      var1 = var10007;
      var10007 = (var1 | var2) & ~(var1 & var2);
      var2 = 1952159853;
      var1 = var10007;
      var10007 = (var1 | var2) - (var1 & var2);
      var2 = 754872213;
      var1 = -1405671674;
      var10008 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1960036734;
      var1 = var10008;
      var10008 = (var1 | var2) - (var1 & var2);
      var2 = -1660886424;
      var1 = -1488265666;
      var10009 = (var1 | var2) - (var1 & var2);
      var2 = 1058927142;
      var1 = var10009;
      var10009 = (var1 | var2) - (var1 & var2);
      var10010 = (int)2670881082494143959L;
      var2 = -616533342;
      var1 = var10010;
      var10010 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1410433039;
      var1 = var10010;
      this.z = new TextInput(
         var10003,
         var10004,
         a("㹦", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍\u2451謲㑮Qꟴ꒰ꁰꤑ絿蹅⑴謚㑸v\ua7e7꒹", var10007, var10008, var10009, (var1 | var2) - (var1 & var2))
      );
      var10001 = (int)-3398756254129804667L;
      var2 = 1435299987;
      var1 = var10001;
      var10001 = (var1 | var2) & ~(var1 & var2);
      var2 = -268936688;
      var1 = var10001;
      this.z.a(var1 & ~var2 | ~var1 & var2);
      this.z.a(9.5F);
      this.z.a(pulse.Theme.S, pulse.Theme.T);
      var10001 = (int)-681481464387858745L;
      var2 = -240024331;
      var1 = var10001;
      var10001 = var1 & ~var2 | ~var1 & var2;
      var2 = -208172493;
      var1 = var10001;
      this.z.a(pulse.Bool.from((var1 | var2) & (var1 & var2 ^ -1)));
   }

   public void a(ConfigEntry var1) {
   }

   public void a() {
   }

   public boolean b() {
      return this.o;
   }

   public boolean c() {
      int var10;
      if (this.o && !(this.q.j() < 0.01)) {
         int var7 = 1139480707;
         int var4 = 918650659;
         var10 = (var4 | var7) & (~var4 | ~var7);
         var7 = 1965713312;
         var4 = var10;
         var10 = var4 + var7 - 2 * (var4 & var7);
      } else {
         var10 = (int)4973190794978099534L;
         int var2 = 1718308509;
         int var1 = var10;
         var10 = (var1 | var2) - (var1 & var2);
         var2 = -1467822126;
         var1 = var10;
         var10 = (var1 | var2) & ~(var1 & var2);
      }

      return pulse.Bool.from(var10);
   }

   public ConfigEntry d() {
      return this.p;
   }

   public void a(BiConsumer<Integer, Integer> var1) {
      this.A = var1;
   }

   public void a(Runnable var1) {
      this.B = var1;
   }

   public void a(MatrixStack var1, Renderer2D var2, float var3, float var4, int var5, int var6) {
      this.q.a();
      this.r.a();
      this.s.a();
      this.t.a();
      float var7 = (float)this.q.j();
      if (var7 < 0.01F) {
         if (this.o && this.q.d()) {
            int var219 = (int)-2161772258339832316L;
            int var204 = 632407352;
            int var125 = var219;
            var219 = (var125 | var204) & ~(var125 & var204);
            var204 = -1913783492;
            var125 = var219;
            this.o = pulse.Bool.from((var125 | var204) - (var125 & var204));
            if (this.B != null) {
               this.B.run();
            }
         }
      } else {
         int var8 = (int)(255.0F * var7);
         float var9 = (var3 - 178.5F) / 2.0F;
         float var10 = (var4 - 155.0F) / 2.0F;
         float var11 = 0.9F + 0.1F * var7;
         float var12 = 178.5F * var11;
         float var13 = 155.0F * var11;
         float var14 = var9 + (178.5F - var12) / 2.0F;
         float var15 = var10 + (155.0F - var13) / 2.0F;
         int var43 = 2074512705;
         int var42 = 843573576;
         int var10002 = (var42 | var43) - (var42 & var43);
         var43 = 1239507992;
         var42 = var10002;
         var10002 = var42 & ~var43 | ~var42 & var43;
         var43 = 743401766;
         var42 = 26382474;
         int var10003 = var42 & ~var43 | ~var42 & var43;
         var43 = 769522109;
         var42 = var10003;
         var10003 = var42 & ~var43 | ~var42 & var43;
         var43 = -1983778526;
         var42 = -1262267006;
         int var10004 = (var42 | var43) - (var42 & var43);
         var43 = 1023583415;
         var42 = var10004;
         var10004 = var42 & ~var43 | ~var42 & var43;
         int var10005 = (int)5306477824399556590L;
         var43 = -1856141226;
         var42 = var10005;
         var10005 = var42 + var43 - 2 * (var42 & var43);
         var43 = -225495180;
         var42 = var10005;
         Color var16 = pulse.Theme.a(new Color(var10002, var10003, var10004, var42 + var43 - 2 * (var42 & var43)), var8);
         var10002 = (int)-2340861770616403956L;
         var43 = -201286921;
         var42 = var10002;
         var10002 = (var42 | var43) & (~var42 | ~var43);
         var43 = -903965962;
         var42 = var10002;
         var10002 = (var42 | var43) & (~var42 | ~var43);
         var43 = -1214917749;
         var42 = 1336263147;
         var10003 = var42 & ~var43 | ~var42 & var43;
         var43 = -131067283;
         var42 = var10003;
         var10003 = var42 + var43 - 2 * (var42 & var43);
         var10004 = (int)954955122769108202L;
         var43 = 1636187525;
         var42 = var10004;
         var10004 = (var42 | var43) - (var42 & var43);
         var43 = -2070830722;
         var42 = var10004;
         var10004 = var42 & ~var43 | ~var42 & var43;
         var43 = 857848225;
         var42 = -730140566;
         var10005 = var42 & ~var43 | ~var42 & var43;
         var43 = -413447929;
         var42 = var10005;
         Color var17 = pulse.Theme.a(new Color(var10002, var10003, var10004, (var42 | var43) - (var42 & var43)), var8);
         var2.a(var14, var15, var12, var13, 9.5F * var11, var16, var16, var17, var17, var1);
         int var10001 = (int)-2130936062636121383L;
         var43 = -848343391;
         var42 = var10001;
         var10001 = (var42 | var43) & (~var42 | ~var43);
         var43 = 1055812727;
         var42 = var10001;
         FontRenderer var18 = FontManager.b[(var42 | var43) & ~(var42 & var43)];
         var10001 = (int)-1708201563728854728L;
         var43 = -1293782707;
         var42 = var10001;
         var10001 = var42 + var43 - 2 * (var42 & var43);
         var43 = -540102535;
         var42 = var10001;
         FontRenderer var19 = FontManager.a[var42 + var43 - 2 * (var42 & var43)];
         var10001 = (int)-1933914477061373063L;
         var43 = 508739378;
         var42 = var10001;
         var10001 = (var42 | var43) & (~var42 | ~var43);
         var43 = -1768473529;
         var42 = var10001;
         FontRenderer var20 = FontManager.a[(var42 | var43) - (var42 & var43)];
         var10002 = (int)515396980411017806L;
         var43 = -1314421703;
         var42 = var10002;
         var10002 = var42 & ~var43 | ~var42 & var43;
         var43 = -2123656622;
         var42 = var10002;
         var10002 = var42 & ~var43 | ~var42 & var43;
         var43 = 1895160982;
         var42 = -517437364;
         var10003 = (var42 | var43) - (var42 & var43);
         var43 = -166997064;
         var42 = var10003;
         var10003 = var42 & ~var43 | ~var42 & var43;
         var10004 = (int)783242715270090293L;
         var43 = -1608982588;
         var42 = var10004;
         var10004 = (var42 | var43) & ~(var42 & var43);
         var43 = 1031621505;
         var42 = var10004;
         var10004 = (var42 | var43) - (var42 & var43);
         var43 = 980510265;
         var42 = -193405287;
         var10005 = var42 & ~var43 | ~var42 & var43;
         var43 = -837046009;
         var42 = var10005;
         String var21 = a(
            "禒䰏禄䰅禃䰌禋䰄經䰋禈䱿秴䰁",
            "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍\u2451謲㑮Qꟴ꒰ꁰꤑ絿蹅⑴謚㑸v\ua7e7꒹",
            var10002,
            var10003,
            var10004,
            (var42 | var43) & ~(var42 & var43)
         );
         float var22 = var18.a(var21);
         float var23 = var14 + (var12 - var22) / 2.0F;
         float var24 = var15 + 11.0F * var11;
         var18.a(var21, var23, var24, pulse.Theme.a(pulse.Theme.a, var8), var1);
         if (this.p != null) {
            String var41 = this.p.a();
            StringBuilder var10000 = new StringBuilder();
            var10003 = (int)7133586554750878915L;
            var43 = -938955147;
            var42 = var10003;
            var10003 = (var42 | var43) & ~(var42 & var43);
            var43 = 1293702803;
            var42 = var10003;
            var10003 = var42 & ~var43 | ~var42 & var43;
            var43 = 1302737773;
            var42 = 957797383;
            var10004 = var42 & ~var43 | ~var42 & var43;
            var43 = 324918674;
            var42 = var10004;
            var10004 = var42 + var43 - 2 * (var42 & var43);
            var43 = -343266898;
            var42 = 144036562;
            var10005 = var42 + var43 - 2 * (var42 & var43);
            var43 = -204023282;
            var42 = var10005;
            var10005 = var42 + var43 - 2 * (var42 & var43);
            var43 = -664316825;
            var42 = 1220875450;
            int var10006 = (var42 | var43) - (var42 & var43);
            var43 = -1869939232;
            var42 = var10006;
            String var25 = var10000.append(
                  a(
                     "禩\uf895禎\uf8ef禋\uf898綉ﲋ",
                     "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍\u2451謲㑮Qꟴ꒰ꁰꤑ絿蹅⑴謚㑸v\ua7e7꒹",
                     var10003,
                     var10004,
                     var10005,
                     (var42 | var43) & ~(var42 & var43)
                  )
               )
               .append(var41)
               .toString();
            float var26 = var19.a(var25);
            float var27 = var14 + (var12 - var26) / 2.0F;
            float var28 = var24 + var18.b(var21) - 6.5F;
            var19.a(var25, var27, var28, pulse.Theme.a(pulse.Theme.b, var8), var1);
         }

         float var44 = var14 + 12.0F * var11;
         float var45 = var12 - 24.0F * var11;
         float var46 = var24 + var18.b(var21) + 11.5F * var11 + 4.0F;
         var43 = -1505660038;
         var42 = -615695729;
         var10003 = var42 & ~var43 | ~var42 & var43;
         var43 = -495618608;
         var42 = var10003;
         var10003 = (var42 | var43) & (~var42 | ~var43);
         var10004 = (int)6513987170489143496L;
         var43 = -1208650014;
         var42 = var10004;
         var10004 = (var42 | var43) & (~var42 | ~var43);
         var43 = 2020288479;
         var42 = var10004;
         var10004 = (var42 | var43) & (~var42 | ~var43);
         var10005 = (int)-5293734649328000168L;
         var43 = -2140557594;
         var42 = var10005;
         var10005 = (var42 | var43) & ~(var42 & var43);
         var43 = -897765043;
         var42 = var10005;
         var10005 = (var42 | var43) & (~var42 | ~var43);
         int var276 = (int)1334250796711020388L;
         var43 = -1974541101;
         var42 = var276;
         var276 = var42 + var43 - 2 * (var42 & var43);
         var43 = 1096165261;
         var42 = var276;
         var20.a(
            a(
               "禩膒禈膔秴膙秲臮禁膒經膔秲膓禍膗秿膛禍膞禃膑禋膕",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍\u2451謲㑮Qꟴ꒰ꁰꤑ絿蹅⑴謚㑸v\ua7e7꒹",
               var10003,
               var10004,
               var10005,
               (var42 | var43) - (var42 & var43)
            ),
            var44,
            var46 - 7.0F,
            pulse.Theme.a(pulse.Theme.a, var8),
            var1
         );
         var10004 = (int)6297265411783924825L;
         var43 = 1550134244;
         var42 = var10004;
         var10004 = (var42 | var43) - (var42 & var43);
         var43 = -694154344;
         var42 = var10004;
         var10004 = var42 + var43 - 2 * (var42 & var43);
         var43 = -1082890156;
         var42 = 934911291;
         var10005 = var42 & ~var43 | ~var42 & var43;
         var43 = -282136192;
         var42 = var10005;
         var10005 = (var42 | var43) - (var42 & var43);
         var276 = (int)-4512068723596887640L;
         var43 = 1649830168;
         var42 = var276;
         var276 = (var42 | var43) & ~(var42 & var43);
         var43 = -1520155569;
         var42 = var276;
         var276 = var42 & ~var43 | ~var42 & var43;
         var43 = 535215787;
         var42 = 1292624549;
         int var10007 = (var42 | var43) - (var42 & var43);
         var43 = 1391713082;
         var42 = var10007;
         float var47 = var46
            + var20.b(
               a(
                  "緲",
                  "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍\u2451謲㑮Qꟴ꒰ꁰꤑ絿蹅⑴謚㑸v\ua7e7꒹",
                  var10004,
                  var10005,
                  var276,
                  (var42 | var43) - (var42 & var43)
               )
            )
            + 2.5F * var11;
         float var29 = var45 - 18.0F * var11 - 3.0F;
         int var206 = (int)3356437393566734001L;
         var43 = -486919188;
         var42 = var206;
         var206 = (var42 | var43) - (var42 & var43);
         var43 = 1486366035;
         var42 = var206;
         int var30 = (var42 | var43) - (var42 & var43);
         this.y.a(var1, var2, var44, var47 - var30, var29 + 3.0F, 22.0F * var11, var5, var6, var7);
         float var31 = var44 + var29 + 3.0F;
         if (!this.x && GuiInput.a(var31, var47 - var30, 18.0F * var11, 22.0F * var11, var5, var6)) {
            var43 = -71647290;
            var42 = -2048768024;
            var206 = (var42 | var43) & ~(var42 & var43);
            var43 = 2119759919;
            var42 = var206;
            var206 = var42 & ~var43 | ~var42 & var43;
         } else {
            var206 = (int)4318793362353187907L;
            var43 = 1551044523;
            var42 = var206;
            var206 = (var42 | var43) - (var42 & var43);
            var43 = 18047976;
            var42 = var206;
            var206 = (var42 | var43) & (~var42 | ~var43);
         }

         int var32 = var206;
         if (this.x && this.w) {
            this.t.a(0.0, 0.15, pulse.Easing.h);
            var10001 = (int)1045231931718293572L;
            var43 = -2111707247;
            var42 = var10001;
            var10001 = (var42 | var43) & ~(var42 & var43);
            var43 = -271106091;
            var42 = var10001;
            this.w = pulse.Bool.from((var42 | var43) & ~(var42 & var43));
         } else if (pulse.Bool.from(var32) != this.w) {
            this.t.a(var32 != 0 ? 1.0 : 0.0, 0.15, pulse.Easing.h);
            this.w = pulse.Bool.from(var32);
         }

         this.a(var1, var2, var31, var47 - var30, 18.0F * var11, 22.0F * var11, var8);
         float var33 = var47 + 22.0F * var11 + 31.5F * var11 - 40.0F;
         var43 = 1447384331;
         var42 = 706480558;
         var10003 = (var42 | var43) & ~(var42 & var43);
         var43 = -484417408;
         var42 = var10003;
         var10003 = (var42 | var43) - (var42 & var43);
         var43 = 1380805934;
         var42 = -151420393;
         var10004 = (var42 | var43) & ~(var42 & var43);
         var43 = -1017357887;
         var42 = var10004;
         var10004 = var42 + var43 - 2 * (var42 & var43);
         var10005 = (int)622151009993618909L;
         var43 = 1014925648;
         var42 = var10005;
         var10005 = (var42 | var43) - (var42 & var43);
         var43 = 1058883996;
         var42 = var10005;
         var10005 = (var42 | var43) & ~(var42 & var43);
         var276 = (int)-5024318481327137622L;
         var43 = 1352749694;
         var42 = var276;
         var276 = (var42 | var43) & ~(var42 & var43);
         var43 = 1117108201;
         var42 = var276;
         var20.a(
            a(
               "禩粕禈粓秴粞秲糩禁粕經粑禈糥秴粞禊",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍\u2451謲㑮Qꟴ꒰ꁰꤑ絿蹅⑴謚㑸v\ua7e7꒹",
               var10003,
               var10004,
               var10005,
               (var42 | var43) - (var42 & var43)
            ),
            var44,
            var33 + 7.0F,
            pulse.Theme.a(pulse.Theme.a, var8),
            var1
         );
         var10004 = (int)-4929707139305201546L;
         var43 = -962008053;
         var42 = var10004;
         var10004 = var42 & ~var43 | ~var42 & var43;
         var43 = -489656232;
         var42 = var10004;
         var10004 = var42 & ~var43 | ~var42 & var43;
         var10005 = (int)390346754565365644L;
         var43 = -1322525541;
         var42 = var10005;
         var10005 = var42 & ~var43 | ~var42 & var43;
         var43 = -873793879;
         var42 = var10005;
         var10005 = (var42 | var43) & (~var42 | ~var43);
         var276 = (int)1477020758781211234L;
         var43 = 1678894675;
         var42 = var276;
         var276 = (var42 | var43) - (var42 & var43);
         var43 = -2020717540;
         var42 = var276;
         var276 = (var42 | var43) & (~var42 | ~var43);
         var43 = -790936031;
         var42 = -1444086602;
         var10007 = var42 & ~var43 | ~var42 & var43;
         var43 = 2032353940;
         var42 = var10007;
         float var34 = var33
            + var20.b(
               a("緲", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍\u2451謲㑮Qꟴ꒰ꁰꤑ絿蹅⑴謚㑸v\ua7e7꒹", var10004, var10005, var276, var42 & ~var43 | ~var42 & var43)
            )
            + 2.5F * var11;
         this.z.a(var1, var2, var44, var34, var45, 22.0F * var11, var5, var6, var7);
         float var35 = var34 + 22.0F * var11 + 11.5F * var11;
         float var36 = (var45 - 7.0F * var11) / 2.0F;
         float var37 = var44;
         float var38 = var44 + var36 + 7.0F * var11;
         boolean var39 = GuiInput.a(var37, var35, var36, 18.0F * var11, var5, var6);
         boolean var40 = GuiInput.a(var38, var35, var36, 18.0F * var11, var5, var6);
         if (var39 != this.u) {
            this.r.a(var39 ? 1.0 : 0.0, 0.15, pulse.Easing.h);
            this.u = var39;
         }

         if (var40 != this.v) {
            this.s.a(var40 ? 1.0 : 0.0, 0.15, pulse.Easing.h);
            this.v = var40;
         }

         this.b(var1, var2, var37, var35, var36, 18.0F * var11, var8);
         this.c(var1, var2, var38, var35, var36, 18.0F * var11, var8);
         if (var39 || var40 || !this.x && var32 != 0) {
            GuiInput.g();
         }
      }
   }

   private void a(MatrixStack var1, Renderer2D var2, float var3, float var4, float var5, float var6, int var7) {
      float var8 = (float)this.t.j();
      Color var9 = pulse.Theme.b(pulse.Theme.q, var7 / 255.0F);
      Color var10 = pulse.Theme.b(pulse.Theme.n, var7 / 255.0F);
      var2.a(var3 - 0.5F, var4 - 0.5F, var5 + 1.0F, var6 + 1.0F, 9.5F, var9, var9, var10, var10, var1);
      int var20 = -1373668482;
      int var19 = -490929503;
      int var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = 1285716435;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      int var10003 = (int)-5819498435860715381L;
      var20 = 366893335;
      var19 = var10003;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = 2051731856;
      var19 = var10003;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = 1184348760;
      var19 = 1522641300;
      int var10004 = var19 & ~var20 | ~var19 & var20;
      var20 = 475403224;
      var19 = var10004;
      var10004 = (var19 | var20) & ~(var19 & var20);
      var20 = 1267346765;
      var19 = 127666831;
      int var10005 = (var19 | var20) - (var19 & var20);
      var20 = 1276520283;
      var19 = var10005;
      Color var11 = ColorUtils.a(new Color(var10002, var10003, var10004, var19 + var20 - 2 * (var19 & var20)), pulse.Theme.I, var8);
      var20 = -602385628;
      var19 = -1244089297;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = 1774249734;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var10003 = (int)5603566020671529960L;
      var20 = -389567341;
      var19 = var10003;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = -1319841930;
      var19 = var10003;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = -646131022;
      var19 = 222517407;
      var10004 = (var19 | var20) & ~(var19 & var20);
      var20 = -734033347;
      var19 = var10004;
      var10004 = var19 & ~var20 | ~var19 & var20;
      var20 = -1546970249;
      var19 = -374606016;
      var10005 = var19 & ~var20 | ~var19 & var20;
      var20 = 1247866030;
      var19 = var10005;
      Color var12 = ColorUtils.a(new Color(var10002, var10003, var10004, var19 + var20 - 2 * (var19 & var20)), pulse.Theme.J, var8);
      var11 = pulse.Theme.a(var11, var7);
      var12 = pulse.Theme.a(var12, var7);
      var2.a(var3, var4, var5, var6, 0.0F, 9.5F, 0.0F, 9.5F, var11, var11, var12, var12, var1);
      int var10001 = (int)-9162027849548771851L;
      var20 = -120446309;
      var19 = var10001;
      var10001 = var19 & ~var20 | ~var19 & var20;
      var20 = 1706749792;
      var19 = var10001;
      FontRenderer var13 = FontManager.b[var19 & ~var20 | ~var19 & var20];
      var20 = 110268734;
      var19 = 1196483244;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = -558149705;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var10003 = (int)2397769620402723590L;
      var20 = 662414364;
      var19 = var10003;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = 335931006;
      var19 = var10003;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = 984590669;
      var19 = 643124991;
      var10004 = var19 & ~var20 | ~var19 & var20;
      var20 = 248650537;
      var19 = var10004;
      var10004 = (var19 | var20) - (var19 & var20);
      var10005 = (int)-3615933373259172473L;
      var20 = -447078277;
      var19 = var10005;
      var10005 = (var19 | var20) & ~(var19 & var20);
      var20 = -1374774413;
      var19 = var10005;
      String var14 = a(
         "킋", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍\u2451謲㑮Qꟴ꒰ꁰꤑ絿蹅⑴謚㑸v\ua7e7꒹", var10002, var10003, var10004, var19 + var20 - 2 * (var19 & var20)
      );
      float var15 = var13.a(var14);
      float var16 = var3 + (var5 - var15) / 2.0F;
      float var17 = var4 + (var6 - var13.b(var14)) / 2.0F + 3.5F;
      Color var18 = ColorUtils.a(pulse.Theme.a, pulse.Theme.aa, var8);
      var13.a(var14, var16, var17, pulse.Theme.a(var18, var7), var1);
   }

   private void b(MatrixStack var1, Renderer2D var2, float var3, float var4, float var5, float var6, int var7) {
      float var8 = (float)this.r.j();
      Color var9 = ColorUtils.a(pulse.Theme.y, pulse.Theme.B, var8);
      Color var10 = ColorUtils.a(pulse.Theme.z, pulse.Theme.y, var8);
      var9 = pulse.Theme.a(var9, var7);
      var10 = pulse.Theme.a(var10, var7);
      var2.a(var3, var4, var5, var6, 6.0F, var9, var9, var10, var10, var1);
      int var17 = 607968261;
      int var16 = -2007781199;
      int var10001 = var16 + var17 - 2 * (var16 & var17);
      var17 = -1401983816;
      var16 = var10001;
      FontRenderer var11 = FontManager.a[(var16 | var17) & ~(var16 & var17)];
      var17 = -1817487820;
      var16 = -790090318;
      int var10002 = var16 & ~var17 | ~var16 & var17;
      var17 = -600160349;
      var16 = var10002;
      var10002 = (var16 | var17) & (~var16 | ~var17);
      int var10003 = (int)3389583645674018667L;
      var17 = 1300900208;
      var16 = var10003;
      var10003 = (var16 | var17) & ~(var16 & var17);
      var17 = 543838693;
      var16 = var10003;
      var10003 = var16 & ~var17 | ~var16 & var17;
      var17 = -1245117338;
      var16 = 1516953963;
      int var10004 = (var16 | var17) - (var16 & var17);
      var17 = -81575490;
      var16 = var10004;
      var10004 = var16 & ~var17 | ~var16 & var17;
      int var10005 = (int)-578378515831966597L;
      var17 = 1521851399;
      var16 = var10005;
      var10005 = (var16 | var17) - (var16 & var17);
      var17 = -1199083607;
      var16 = var10005;
      String var12 = a(
         "퐀\u2fef퐖\u2fe5퐑⾓푭",
         "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍\u2451謲㑮Qꟴ꒰ꁰꤑ絿蹅⑴謚㑸v\ua7e7꒹",
         var10002,
         var10003,
         var10004,
         var16 + var17 - 2 * (var16 & var17)
      );
      float var13 = var11.a(var12);
      float var14 = var3 + (var5 - var13) / 2.0F;
      float var15 = var4 + (var6 - var11.b(var12)) / 2.0F + 3.5F;
      var11.a(var12, var14, var15, pulse.Theme.a(pulse.Theme.aa, var7), var1);
   }

   private void c(MatrixStack var1, Renderer2D var2, float var3, float var4, float var5, float var6, int var7) {
      float var8 = (float)this.s.j();
      Color var9 = pulse.Theme.b(pulse.Theme.q, var7 / 255.0F);
      Color var10 = pulse.Theme.b(pulse.Theme.n, var7 / 255.0F);
      var2.a(var3 - 0.5F, var4 - 0.5F, var5 + 1.0F, var6 + 1.0F, 6.0F, var9, var9, var10, var10, var1);
      Color var11 = ColorUtils.a(pulse.Theme.e, pulse.Theme.I, var8);
      Color var12 = ColorUtils.a(pulse.Theme.f, pulse.Theme.J, var8);
      var11 = pulse.Theme.a(var11, var7);
      var12 = pulse.Theme.a(var12, var7);
      var2.a(var3, var4, var5, var6, 6.0F, var11, var11, var12, var12, var1);
      int var20 = -779778072;
      int var19 = 173271616;
      int var10001 = (var19 | var20) & (~var19 | ~var20);
      var20 = -606704220;
      var19 = var10001;
      FontRenderer var13 = FontManager.a[var19 + var20 - 2 * (var19 & var20)];
      int var10002 = (int)-1720397559079382399L;
      var20 = 697458386;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = 1282715766;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = 1012686344;
      var19 = 1112988108;
      int var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = -1420789460;
      var19 = var10003;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = 38890571;
      var19 = -1097519124;
      int var10004 = (var19 | var20) - (var19 & var20);
      var20 = -1379468191;
      var19 = var10004;
      var10004 = var19 + var20 - 2 * (var19 & var20);
      var20 = 125789690;
      var19 = 1344591916;
      int var10005 = (var19 | var20) & (~var19 | ~var20);
      var20 = 1466196503;
      var19 = var10005;
      String var14 = a(
         "\udb39㢁\udb1b㣶\udb1a㣳",
         "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍\u2451謲㑮Qꟴ꒰ꁰꤑ絿蹅⑴謚㑸v\ua7e7꒹",
         var10002,
         var10003,
         var10004,
         (var19 | var20) - (var19 & var20)
      );
      float var15 = var13.a(var14);
      float var16 = var3 + (var5 - var15) / 2.0F;
      float var17 = var4 + (var6 - var13.b(var14)) / 2.0F + 3.5F;
      Color var18 = ColorUtils.a(pulse.Theme.b, pulse.Theme.a, var8);
      var13.a(var14, var16, var17, pulse.Theme.a(var18, var7), var1);
   }

   public boolean a(float var1, float var2, int var3, int var4) {
      return false;
   }

   private int a(String var1) {
      try {
         return Integer.parseInt(var1);
      } catch (NumberFormatException var5) {
         int var10000 = (int)-286723850850662167L;
         int var4 = -1883748855;
         int var3 = var10000;
         var10000 = (var3 | var4) & ~(var3 & var4);
         var4 = -825078047;
         var3 = var10000;
         return (var3 | var4) & (~var3 | ~var4);
      }
   }

   public boolean a(int var1, int var2, int var3) {
      if (!this.o) {
         int var10 = -1125403734;
         int var7 = 1594492279;
         int var12 = (var7 | var10) & (~var7 | ~var10);
         var10 = -471746851;
         var7 = var12;
         return pulse.Bool.from((var7 | var10) & (var7 ^ -1 | var10 ^ -1));
      }

      if (this.y.d()) {
         return this.y.a(var1, var2, var3);
      }

      if (this.z.d()) {
         return this.z.a(var1, var2, var3);
      }

      int var5 = -33971406;
      int var4 = 652182395;
      int var10000 = (var4 | var5) & ~(var4 & var5);
      var5 = -618258359;
      var4 = var10000;
      return pulse.Bool.from((var4 | var5) - (var4 & var5));
   }

   public boolean a(char var1, int var2) {
      if (!this.o) {
         int var13 = -639285211;
         int var8 = 1509049215;
         int var18 = var8 & ~var13 | ~var8 & var13;
         var13 = -2145973414;
         var8 = var18;
         return pulse.Bool.from((var8 | var13) & (var8 ^ -1 | var13 ^ -1));
      }

      if (!Character.isDigit(var1)) {
         int var16 = (int)8489333185851427539L;
         int var11 = 442259369;
         int var6 = var16;
         var16 = var6 & ~var11 | ~var6 & var11;
         var11 = -1061134981;
         var6 = var16;
         return pulse.Bool.from(var6 + var11 - 2 * (var6 & var11));
      }

      if (this.y.d()) {
         return this.y.a(var1, var2);
      }

      if (this.z.d()) {
         return this.z.a(var1, var2);
      }

      int var10000 = (int)6688321305630807172L;
      int var4 = -1192036437;
      int var3 = var10000;
      var10000 = (var3 | var4) & (~var3 | ~var4);
      var4 = 893379375;
      var3 = var10000;
      return pulse.Bool.from(var3 + var4 - 2 * (var3 & var4));
   }

   public boolean e() {
      int var9;
      if (!this.o || !this.y.d() && !this.z.d()) {
         var9 = (int)4909388948461613026L;
         int var7 = -94313867;
         int var4 = var9;
         var9 = (var4 | var7) & ~(var4 & var7);
         var7 = 724077975;
         var4 = var9;
         var9 = (var4 | var7) - (var4 & var7);
      } else {
         int var2 = -215896449;
         int var1 = 1132191448;
         var9 = var1 + var2 - 2 * (var1 & var2);
         var2 = -1336250202;
         var1 = var9;
         var9 = (var1 | var2) & (~var1 | ~var2);
      }

      return pulse.Bool.from(var9);
   }

   public static String a(String var0, String var1, int var2, int var3, int var4, int var5) {
      char[] var6 = var1.toCharArray();
      char[] var7 = new char[var6.length];
      int var18 = -894508866;
      int var17 = -655337998;
      int var10000 = (var17 | var18) & (~var17 | ~var18);
      var18 = 308196678;
      var17 = var10000;
      char[] var219 = new char[var17 + var18 - 2 * (var17 & var18)];
      int var10002 = (int)-2054743627953157534L;
      var18 = -1831521156;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 495975966;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      int var10003 = (int)3573704428582871152L;
      var18 = -1605081840;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -172487342;
      var17 = var10003;
      var219[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var18 = 1171190836;
      var17 = 1815220110;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 704445371;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)6614727891483315148L;
      var18 = 1573789309;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -864717260;
      var17 = var10003;
      var219[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var10002 = (int)-4390160737066766655L;
      var18 = -791986996;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 143626767;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 798108851;
      var17 = 1606125270;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1881770467;
      var17 = var10003;
      var219[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var10002 = (int)-9100500641812405954L;
      var18 = -844119483;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 857826168;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -30985772;
      var17 = 413802354;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -426920267;
      var17 = var10003;
      var219[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var18 = 1698039736;
      var17 = -305482445;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -1996705137;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 591010269;
      var17 = -2051694732;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1500571764;
      var17 = var10003;
      var219[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var18 = 1022421164;
      var17 = -1120615875;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -2117850476;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -1696258099;
      var17 = -980299021;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1601482940;
      var17 = var10003;
      var219[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var18 = 1004266203;
      var17 = 779684538;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 362997863;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 410028326;
      var17 = -1827523268;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -1956465399;
      var17 = var10003;
      var219[var10002] = (char)((var17 | var18) - (var17 & var18));
      var18 = -2018494520;
      var17 = 1226966653;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -829279822;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var10003 = (int)3056441857562439292L;
      var18 = -1728502566;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 1683881604;
      var17 = var10003;
      var219[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var18 = 2005281390;
      var17 = 128329881;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 1881146111;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -249492052;
      var17 = 663436542;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -693487359;
      var17 = var10003;
      var219[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var10002 = (int)-1298680227651675016L;
      var18 = -1554811229;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 313322194;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 339434215;
      var17 = -1511619216;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1310861133;
      var17 = var10003;
      var219[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      char[] var8 = var219;
      var18 = 1499257474;
      var17 = -390566726;
      var10000 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1310411214;
      var17 = var10000;
      char[] var221 = new char[var17 + var18 - 2 * (var17 & var18)];
      var10002 = (int)5403664693385198446L;
      var18 = 1330556254;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -372910544;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -256919456;
      var17 = -1864195268;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 1615680380;
      var17 = var10003;
      var221[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var18 = 2128338217;
      var17 = 991580747;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1170313059;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var10003 = (int)7931199105345600722L;
      var18 = -74581468;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 1585988341;
      var17 = var10003;
      var221[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var18 = 1509221251;
      var17 = 2045449106;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 538963987;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var10003 = (int)-4736663957637809552L;
      var18 = -122270254;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 2945265;
      var17 = var10003;
      var221[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var10002 = (int)4837013338116548954L;
      var18 = -1214478911;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 1474292888;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)-213635035996260099L;
      var18 = 1620268444;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 1867388259;
      var17 = var10003;
      var221[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var10002 = (int)7808378695043261549L;
      var18 = 30458965;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 1947787324;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var10003 = (int)5550574799034171972L;
      var18 = 1808616513;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1885845061;
      var17 = var10003;
      var221[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var10002 = (int)3789413564787997620L;
      var18 = 1909455125;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 770949796;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 1888505513;
      var17 = 198830749;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 2068421792;
      var17 = var10003;
      var221[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var10002 = (int)8664249711927400646L;
      var18 = 1904758389;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1161746101;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var10003 = (int)3038173892118249340L;
      var18 = -656245549;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 225445014;
      var17 = var10003;
      var221[var10002] = (char)((var17 | var18) - (var17 & var18));
      var10002 = (int)7303858960337779255L;
      var18 = -1283036226;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 1476055438;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -1927584737;
      var17 = -639548097;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 1425682712;
      var17 = var10003;
      var221[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var18 = -1044769232;
      var17 = 1849898892;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -1342627404;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 725041204;
      var17 = -596344447;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -146586959;
      var17 = var10003;
      var221[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var18 = 827379796;
      var17 = 1983232282;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1197828423;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 265739978;
      var17 = 1964376192;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 2059464057;
      var17 = var10003;
      var221[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      char[] var9 = var221;
      var18 = 2017533390;
      var17 = -1815834025;
      var10000 = var17 & ~var18 | ~var17 & var18;
      var18 = -343568487;
      var17 = var10000;

      for (int var10 = (var17 | var18) & ~(var17 & var18); var10 < var6.length; var10++) {
         char var276 = var6[var10];
         char var205 = var8[var10 % var8.length];
         char var106 = var276;
         var7[var10] = (char)((var106 | var205) & (~var106 | ~var205));
      }

      char[] var19 = new char[var7.length];
      var10000 = (int)1473023681643375677L;
      var18 = -664541799;
      var17 = var10000;
      var10000 = var17 + var18 - 2 * (var17 & var18);
      var18 = 846498212;
      var17 = var10000;

      for (int var11 = var17 & ~var18 | ~var17 & var18; var11 < var6.length; var11++) {
         char var277 = var7[var11];
         char var208 = var9[var11 % var9.length];
         char var109 = var277;
         var19[var11] = (char)((var109 | var208) - (var109 & var208));
      }

      String var20 = new String(var19);
      int var12 = var20.hashCode();
      var18 = var5;
      var17 = var3;
      var10000 = var17 + ~var18 + 1;
      var18 = var2;
      var17 = var10000;
      int var13 = var17 - var18;
      char[] var14 = var0.toCharArray();
      char[] var15 = new char[var14.length];
      var18 = 1828096598;
      var17 = -343187120;
      var10000 = (var17 | var18) & ~(var17 & var18);
      var18 = -2021790970;
      var17 = var10000;

      for (int var16 = (var17 | var18) & ~(var17 & var18); var16 < var15.length; var16++) {
         var18 = -1470167536;
         var17 = 1800839496;
         int var10001 = (var17 | var18) & ~(var17 & var18);
         var18 = -1022777510;
         var17 = var10001;
         switch (var16 % ((var17 | var18) - (var17 & var18))) {
            case 0:
               var18 = var12;
               var17 = var13;
               var10002 = (var17 | var18) - (var17 & var18);
               char var218 = var14[var16];
               var17 = var10002;
               var15[var16] = (char)((var17 | var218) - (var17 & var218));
               break;
            case 1:
               var18 = var13;
               var17 = var5;
               var10002 = (var17 | var18) & (~var17 | ~var18);
               char var216 = var14[var16];
               var17 = var10002;
               var15[var16] = (char)(var17 & ~var216 | ~var17 & var216);
         }
      }

      return new String(var15);
   }
}
