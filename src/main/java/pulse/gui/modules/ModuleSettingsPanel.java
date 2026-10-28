package pulse;



import pulse.module.ClientModule;
import pulse.settings.BooleanSetting;
import pulse.settings.ColorSetting;
import pulse.settings.KeySetting;
import pulse.settings.ModeSetting;
import pulse.settings.Setting;
import pulse.settings.SliderSetting;
import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.RotationAxis;

public class ModuleSettingsPanel {
   public static final float a = 140.0F;
   public static final float b = 38.0F;
   public static final float c = 108.0F;
   public static final float d = 9.5F;
   public static final float e = 7.0F;
   private final AnimationState h = new AnimationState();
   private boolean i;
   private boolean j;
   private float k;
   private float l;
   private float m;
   private float n;
   private float o;
   private float p;
   private float q;
   private boolean r;
   private static final float s = 8.0F;
   private final SettingWidgetList t;
   private SliderSettingWidget u;
   private boolean v;
   public static int f;
   public static boolean g;

   public ModuleSettingsPanel() {
      int var10001 = (int)-4985615802732799898L;
      int var2 = -953590050;
      int var1 = var10001;
      var10001 = (var1 | var2) - (var1 & var2);
      var2 = 1688258232;
      var1 = var10001;
      this.i = pulse.Bool.from((var1 | var2) - (var1 & var2));
      var10001 = (int)-7635491274429541040L;
      var2 = -711998891;
      var1 = var10001;
      var10001 = var1 + var2 - 2 * (var1 & var2);
      var2 = 596088581;
      var1 = var10001;
      this.j = pulse.Bool.from((var1 | var2) & ~(var1 & var2));
      var2 = 1125687787;
      var1 = -2141840958;
      var10001 = (var1 | var2) & (~var1 | ~var2);
      var2 = 2064081726;
      var1 = var10001;
      var10001 = (var1 | var2) - (var1 & var2);
      var2 = 821870167;
      var1 = -700221687;
      int var10002 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1479382932;
      var1 = var10002;
      var2 = (var1 | var2) - (var1 & var2);
      var1 = var10001;
      var10001 = (var1 & ~var2) + (var2 & ~var1) + 2 * (var1 & var2);
      this.k = 140.0F;
      var2 = 825271378;
      var1 = 1825403779;
      var10001 = (var1 | var2) & ~(var1 & var2);
      var2 = 1576916944;
      var1 = var10001;
      this.r = pulse.Bool.from((var1 | var2) - (var1 & var2));
      var2 = -574887207;
      var1 = -1229852007;
      var10001 = (var1 | var2) & ~(var1 & var2);
      var2 = 1795823680;
      var1 = var10001;
      this.v = pulse.Bool.from((var1 | var2) & (~var1 | ~var2));
      this.t = new SettingWidgetList();
      SettingWidgetList var10000 = this.t;
      var2 = -1317868962;
      var1 = -1700262419;
      var10002 = var1 + var2 - 2 * (var1 & var2);
      var2 = 735766463;
      var1 = var10002;
      var10002 = var1 + var2 - 2 * (var1 & var2);
      var10002 = (int)-1767085040070172142L;
      var2 = -919894797;
      var1 = var10002;
      var10002 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1939760872;
      var1 = var10002;
      var10002 = var1 & ~var2 | ~var1 & var2;
      var2 = -1498182821;
      var1 = -2126088482;
      var10002 = var1 & ~var2 | ~var1 & var2;
      var2 = 670432644;
      var1 = var10002;
      var10002 = var1 & ~var2 | ~var1 & var2;
      var10002 = (int)-2175711138655142160L;
      var2 = 1570148810;
      var1 = var10002;
      var10002 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1930424107;
      var1 = var10002;
      var10002 = (var1 | var2) - (var1 & var2);
      var10000.b(7.0F);
      var2 = -1923110912;
      var1 = 2118640944;
      var10001 = var1 & ~var2 | ~var1 & var2;
      var2 = 1500515589;
      var1 = var10001;
      var10001 = var1 + var2 - 2 * (var1 & var2);
      this.t.a(108.0F);
      int var10003 = (int)5199402365583134660L;
      var2 = 1553741838;
      var1 = var10003;
      var10003 = var1 + var2 - 2 * (var1 & var2);
      var2 = 887314600;
      var1 = var10003;
      var10003 = (var1 | var2) - (var1 & var2);
      int var10004 = (int)-147022822932940519L;
      var2 = 1901260644;
      var1 = var10004;
      var10004 = var1 & ~var2 | ~var1 & var2;
      var2 = 688014256;
      var1 = var10004;
      var2 = (var1 | var2) - (var1 & var2);
      var1 = var10003;
      var10003 = (var1 & ~var2) + (var2 & ~var1) + 2 * (var1 & var2);
      var10004 = (int)-8807461898406544678L;
      var2 = -1929836414;
      var1 = var10004;
      var10004 = (var1 | var2) - (var1 & var2);
      var2 = -1039841094;
      var1 = var10004;
      var10004 = var1 + var2 - 2 * (var1 & var2);
      int var10005 = (int)-5410210367819364476L;
      var2 = 862718919;
      var1 = var10005;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1234434468;
      var1 = var10005;
      var2 = var1 + var2 - 2 * (var1 & var2);
      var1 = var10004;
      var10004 = (var1 | var2) + (var1 & var2);
      var10005 = (int)-1657183604635590315L;
      var2 = 1056772651;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = 249252452;
      var1 = var10005;
      var10005 = (var1 | var2) - (var1 & var2);
      var2 = -932931547;
      var1 = -443586381;
      int var10006 = (var1 | var2) - (var1 & var2);
      var2 = 634766588;
      var1 = var10006;
      var2 = (var1 | var2) - (var1 & var2);
      var1 = var10005;
      var10005 = (var1 ^ var2) + 2 * (var1 & var2);
      var2 = 1275177266;
      var1 = 1990686293;
      var10005 = (var1 | var2) - (var1 & var2);
      var2 = -2034225351;
      var1 = var10005;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var2 = 2016911622;
      var1 = -1151712886;
      var10006 = (var1 | var2) - (var1 & var2);
      var2 = -1660890384;
      var1 = var10006;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var10006 = (int)3767021265272751568L;
      var2 = -1880521764;
      var1 = var10006;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var2 = 2128292643;
      var1 = var10006;
      var10006 = (var1 | var2) & ~(var1 & var2);
      int var10007 = (int)956387185201453714L;
      var2 = -559413474;
      var1 = var10007;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var2 = -371748727;
      var1 = var10007;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      var2 = 699279506;
      var1 = 1931058573;
      int var10008 = (var1 | var2) & ~(var1 & var2);
      var2 = -1847605448;
      var1 = var10008;
      var2 = (var1 | var2) - (var1 & var2);
      var1 = var10007;
      var10007 = (var1 ^ var2) + 2 * (var1 & var2);
      var2 = 918756378;
      var1 = 202274222;
      var10007 = (var1 | var2) - (var1 & var2);
      var2 = 967896176;
      var1 = var10007;
      var10007 = (var1 | var2) & ~(var1 & var2);
      String var166 = "rs";
      var10008 = (int)-5787784761955966136L;
      var2 = -1291722368;
      var1 = var10008;
      var10008 = (var1 | var2) & (~var1 | ~var2);
      var2 = 942323863;
      var1 = var10008;
      String var140 = a(
         "\uf630簝\uf66d籥\uf66e簝\uf61d", "`ꟳꓺꁡꤐ絺蹙⑿譸㑿g\ua7e2ꓺꁒꤊ絻蹚⑵謹㑲|ꟲꒆꁴꤑ絢蹃⑴謰㑤B\ua7e7꒻ꁴ꤉", var10005, var10006, var10007, var1 & ~var2 | ~var1 & var2
      );
      var10007 = (int)-468354796763752345L;
      var2 = 805314772;
      var1 = var10007;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1537562342;
      var1 = var10007;
      var10007 = (var1 + var2 - 2 * (var1 & var2)) * (var1 + var2 - 2 * (var1 & var2));
      this.u = new SliderSettingWidget(var140, 1.0F, 1.0F, 2.0F, 0.1F);
      var10001 = (int)-2041226863039352914L;
      var2 = -1127752809;
      var1 = var10001;
      var10001 = (var1 | var2) - (var1 & var2);
      var2 = 508179512;
      var1 = var10001;
      this.u.a(pulse.Bool.from(var1 + var2 - 2 * (var1 & var2)));
      this.t.a(this.u);
      this.h.d(0.0);
   }

   public void a(ClientModule var1) {
      if (!this.v && var1 != null) {
         this.t.a();
         this.u = null;

         for (Setting var3 : var1.m()) {
            if (var3.m()) {
               SettingWidget var4 = this.a(var3);
               if (var4 != null) {
                  this.t.a(var4);
                  if (this.u == null && var4 instanceof SliderSettingWidget) {
                     String var10000 = var3.f();
                     int var10002 = (int)1538191749229365469L;
                     int var6 = -1654651728;
                     int var5 = var10002;
                     var10002 = var5 + var6 - 2 * (var5 & var6);
                     var6 = -1809789846;
                     var5 = var10002;
                     var10002 = (var5 | var6) & ~(var5 & var6);
                     var10002 = (int)6079932898862588941L;
                     var6 = -379638839;
                     var5 = var10002;
                     var10002 = (var5 | var6) & (~var5 | ~var6);
                     var6 = -541765692;
                     var5 = var10002;
                     var10002 = (var5 | var6) - (var5 & var6);
                     var6 = -460473541;
                     var5 = -1154981660;
                     var10002 = (var5 | var6) & ~(var5 & var6);
                     var6 = 455890175;
                     var5 = var10002;
                     var10002 = (var5 | var6) - (var5 & var6);
                     var6 = 2007051159;
                     var5 = 2015581861;
                     int var10003 = var5 + var6 - 2 * (var5 & var6);
                     var6 = 1950797442;
                     var5 = var10003;
                     var6 = (var5 | var6) & (~var5 | ~var6);
                     var5 = var10002;
                     var10002 = (var5 ^ var6) + 2 * (var5 & var6);
                     var6 = -1535659732;
                     var5 = -201641929;
                     var10003 = var5 & ~var6 | ~var5 & var6;
                     var6 = 1748263101;
                     var5 = var10003;
                     var10003 = ((var5 | var6) & ~(var5 & var6)) * ((var5 | var6) & ~(var5 & var6));
                     var6 = -1010034946;
                     var5 = -1771509107;
                     var10003 = (var5 | var6) & ~(var5 & var6);
                     var6 = -373158867;
                     var5 = var10003;
                     var10003 = (var5 | var6) & (~var5 | ~var6);
                     int var10005 = (int)-7685853386757549696L;
                     var6 = 1649893402;
                     var5 = var10005;
                     var10005 = (var5 | var6) & ~(var5 & var6);
                     var6 = -1933430369;
                     var5 = var10005;
                     var10005 = (var5 | var6) - (var5 & var6);
                     var6 = 92173650;
                     var5 = -46257536;
                     var10005 = (var5 | var6) - (var5 & var6);
                     var6 = -129998889;
                     var5 = var10005;
                     var10005 = (var5 | var6) - (var5 & var6);
                     var6 = -139687207;
                     var5 = -67804978;
                     var10005 = (var5 | var6) & (~var5 | ~var6);
                     var6 = 207219228;
                     var5 = var10005;
                     var10005 = (var5 | var6) - (var5 & var6);
                     int var10004 = (int)-6360248662325235124L;
                     var6 = -1969990231;
                     var5 = var10004;
                     var10004 = var5 + var6 - 2 * (var5 & var6);
                     var6 = 1209321482;
                     var5 = var10004;
                     var10004 = var5 & ~var6 | ~var5 & var6;
                     String var146 = "rt";
                     var6 = -615956408;
                     var5 = 1945077022;
                     var10005 = (var5 | var6) - (var5 & var6);
                     var6 = -1430628920;
                     var5 = var10005;
                     var10005 = (var5 | var6) & (~var5 | ~var6);
                     var6 = 644435472;
                     var5 = 1651056223;
                     int var10006 = var5 + var6 - 2 * (var5 & var6);
                     var6 = 370125909;
                     var5 = var10006;
                     var10006 = ((var5 | var6) - (var5 & var6)) * ((var5 | var6) - (var5 & var6));
                     var6 = 1611092783;
                     var5 = 1541176097;
                     var10006 = var5 + var6 - 2 * (var5 & var6);
                     var6 = 998770821;
                     var5 = var10006;
                     if (var10000.equals(
                        a("⭄﮽⬙\ufbc5⬚﮽⭩", "`ꟳꓺꁡꤐ絺蹙⑿譸㑿g\ua7e2ꓺꁒꤊ絻蹚⑵謹㑲|ꟲꒆꁴꤑ絢蹃⑴謰㑤B\ua7e7꒻ꁴ꤉", var10003, var10004, var10005, (var5 | var6) & ~(var5 & var6))
                     )) {
                        this.u = (SliderSettingWidget)var4;
                        var6 = -412482268;
                        var5 = 1616974254;
                        int var10001 = var5 + var6 - 2 * (var5 & var6);
                        var6 = -2029316981;
                        var5 = var10001;
                        this.u.a(pulse.Bool.from((var5 | var6) & (var5 ^ -1 | var6 ^ -1)));
                     }
                  }
               }
            }
         }

         if (this.u == null) {
            String var134 = "ru";
            int var90 = -1699876022;
            int var35 = 1954826792;
            int var138 = (var35 | var90) & ~(var35 & var90);
            var90 = 2100467247;
            var35 = var138;
            var138 = (var35 + var90 - 2 * (var35 & var90)) * (var35 + var90 - 2 * (var35 & var90));
            var90 = -418088101;
            var35 = 1275847589;
            int var149 = var35 & ~var90 | ~var35 & var90;
            var90 = 1332794668;
            var35 = var149;
            var149 = (var35 | var90) - (var35 & var90);
            int var157 = (int)-7424684504936143183L;
            var90 = 781974558;
            var35 = var157;
            var157 = (var35 | var90) - (var35 & var90);
            var90 = 1146995789;
            var35 = var157;
            var90 = (var35 | var90) - (var35 & var90);
            var35 = var149;
            var149 = (var35 ^ var90) + 2 * (var35 & var90);
            var149 = (int)-8453763055467684862L;
            var90 = 213564473;
            var35 = var149;
            var149 = (var35 | var90) & ~(var35 & var90);
            var90 = -816099227;
            var35 = var149;
            var149 = var35 & ~var90 | ~var35 & var90;
            var157 = (int)5300340521188367739L;
            var90 = 2094937703;
            var35 = var157;
            var157 = (var35 | var90) & (~var35 | ~var90);
            var90 = 1453423663;
            var35 = var157;
            var157 = (var35 | var90) - (var35 & var90);
            var90 = -1169518693;
            var35 = 1310720976;
            var157 = var35 + var90 - 2 * (var35 & var90);
            var90 = 271234771;
            var35 = var157;
            var157 = var35 & ~var90 | ~var35 & var90;
            var90 = 1915412007;
            var35 = -733285294;
            int var10007 = (var35 | var90) - (var35 & var90);
            var90 = -437318706;
            var35 = var10007;
            var10007 = ((var35 | var90) - (var35 & var90)) * ((var35 | var90) - (var35 & var90));
            var10007 = (int)-3662545112808781464L;
            var90 = 1419178245;
            var35 = var10007;
            var10007 = (var35 | var90) & (~var35 | ~var90);
            var90 = -1124473435;
            var35 = var10007;
            var10007 = (var35 | var90) - (var35 & var90);
            String var10008 = "rv";
            int var170 = (int)8989598288881743422L;
            var90 = 512825206;
            var35 = var170;
            int var171 = var35 & ~var90 | ~var35 & var90;
            var90 = -724628868;
            var35 = var171;
            var134 = a("⭄뀂⬙끺⬚뀂⭩", "`ꟳꓺꁡꤐ絺蹙⑿譸㑿g\ua7e2ꓺꁒꤊ絻蹚⑵謹㑲|ꟲꒆꁴꤑ絢蹃⑴謰㑤B\ua7e7꒻ꁴ꤉", var149, var157, var10007, (var35 | var90) & (~var35 | ~var90));
            var90 = -580146881;
            var35 = -954369258;
            var10007 = var35 + var90 - 2 * (var35 & var90);
            var90 = -1603158156;
            var35 = var10007;
            var10007 = (var35 | var90) & (~var35 | ~var90);
            this.u = new SliderSettingWidget(var134, 1.0F, 1.0F, 2.0F, 0.1F);
            int var117 = (int)8547687845541542447L;
            var90 = -1393635566;
            var35 = var117;
            var117 = (var35 | var90) & ~(var35 & var90);
            var90 = 2021897532;
            var35 = var117;
            this.u.a(pulse.Bool.from(var35 & (var90 ^ -1) | (var35 ^ -1) & var90));
            var117 = (int)-8985733763716435272L;
            var90 = -234604151;
            var35 = var117;
            var117 = (var35 | var90) & ~(var35 & var90);
            var90 = -445215951;
            var35 = var117;
            this.t.a((var35 | var90) & (~var35 | ~var90), this.u);
         }

         int var115 = -305249746;
         int var60 = -172496981;
         int var121 = (var60 | var115) - (var60 & var115);
         var115 = 410625412;
         var60 = var121;
         this.v = pulse.Bool.from(var60 & ~var115 | ~var60 & var115);
      }
   }

   private SettingWidget a(Setting<?> var1) {
      if (!(var1 instanceof BooleanSetting)) {
         if (!(var1 instanceof SliderSetting)) {
            if (!(var1 instanceof ModeSetting)) {
               if (!(var1 instanceof ColorSetting)) {
                  return !(var1 instanceof KeySetting) ? null : new KeyBindSettingWidget((KeySetting)var1);
               } else {
                  return new ColorSettingWidget((ColorSetting)var1);
               }
            } else {
               return new ModeSettingWidget((ModeSetting)var1);
            }
         } else {
            return new SliderSettingWidget((SliderSetting)var1);
         }
      } else {
         return new BooleanSettingWidget((BooleanSetting)var1);
      }
   }

   @Deprecated
   public void a(SliderSetting var1) {
      if (!this.v) {
         this.t.b(this.u);
         this.u = new SliderSettingWidget(var1);
         int var10001 = (int)-6549437613274991575L;
         int var3 = 102175258;
         int var2 = var10001;
         var10001 = (var2 | var3) & ~(var2 & var3);
         var3 = -398563790;
         var2 = var10001;
         this.u.a(pulse.Bool.from(var2 + var3 - 2 * (var2 & var3)));
         var3 = 1643875158;
         var2 = -393657357;
         var10001 = (var2 | var3) - (var2 & var3);
         var3 = -1988966235;
         var2 = var10001;
         this.t.a(var2 & ~var3 | ~var2 & var3, this.u);
      }
   }

   public void a(float var1, float var2, float var3, float var4) {
      if (this.i && !this.j) {
         this.a();
      } else {
         this.n = var1;
         this.o = var2;
         this.p = var3;
         this.q = var4;
         float var5 = this.h();
         int var10001 = (int)-5325137985557781002L;
         int var10 = -921263157;
         int var9 = var10001;
         var10001 = (var9 | var10) & ~(var9 & var10);
         var10 = 795794558;
         var9 = var10001;
         var10001 = (var9 + var10 - 2 * (var9 & var10)) * (var9 + var10 - 2 * (var9 & var10));
         float var6 = var2 - 8.0F;
         if (!(var6 >= var5)) {
            var10 = 1417546297;
            var9 = -587729266;
            var10001 = (var9 | var10) & ~(var9 & var10);
            var10 = -2004222793;
            var9 = var10001;
            var10001 = (var9 | var10) & ~(var9 & var10);
         } else {
            var10001 = (int)7699844615495945514L;
            var10 = 1221104937;
            var9 = var10001;
            var10001 = (var9 | var10) - (var9 & var10);
            var10 = -1801480190;
            var9 = var10001;
            var10001 = (var9 | var10) & (~var9 | ~var10);
         }

         this.r = pulse.Bool.from(var10001);
         this.l = Math.round(var1 + var3 / 2.0F - this.k / 2.0F);
         if (!this.r) {
            String var10000 = "rw";
            var10 = 271851801;
            var9 = 1979931024;
            int var54 = (var9 | var10) & ~(var9 & var10);
            var10 = 1678443765;
            var9 = var54;
            int var8 = var9 & ~var10 | ~var9 & var10;
            f = var8;
            var10000 = "rx";
            int var56 = (int)-7675429636028889212L;
            var10 = -1598007883;
            var9 = var56;
            int var57 = (var9 | var10) - (var9 & var10);
            var10 = 1564056759;
            var9 = var57;
            if ((var9 & ~var10 | ~var9 & var10) <= f) {
               var10 = 1800047266;
               var9 = 601699857;
               int var58 = (var9 | var10) - (var9 & var10);
               var10 = -1170001056;
               var9 = var58;
               int var59 = (var9 + var10 - 2 * (var9 & var10)) * (var9 + var10 - 2 * (var9 & var10));
               var10 = -716237009;
               var9 = 306381747;
               int var60 = var9 & ~var10 | ~var9 & var10;
               var10 = -648152081;
               var9 = var60;
               var8 = var9 & ~var10 | ~var9 & var10;
               f = var8;
            }

            float var67 = var2 + var4;
            String var10002 = "ry";
            this.m = Math.round(var67 + 8.0F);
         } else {
            float var68 = var2 - var5;
            int var71 = (int)5091948480343473849L;
            var10 = -293502433;
            var9 = var71;
            var71 = var9 + var10 - 2 * (var9 & var10);
            var10 = 1094268777;
            var9 = var71;
            var71 = var9 & ~var10 | ~var9 & var10;
            this.m = Math.round(var68 - 8.0F);
         }

         var10 = 1823924201;
         var9 = 1046828584;
         var10001 = var9 & ~var10 | ~var9 & var10;
         var10 = 1389595072;
         var9 = var10001;
         this.i = pulse.Bool.from((var9 | var10) & ~(var9 & var10));
         var10 = -644824675;
         var9 = -1722193160;
         var10001 = (var9 | var10) & (~var9 | ~var10);
         var10 = 1086958437;
         var9 = var10001;
         this.j = pulse.Bool.from((var9 | var10) - (var9 & var10));
         int var74 = (int)-8500641989874310557L;
         var10 = -741195638;
         var9 = var74;
         var74 = (var9 | var10) - (var9 & var10);
         var10 = -1749336050;
         var9 = var74;
         var74 = (var9 + var10 - 2 * (var9 & var10)) * (var9 + var10 - 2 * (var9 & var10));
         this.h.a(1.0, 0.25, pulse.Easing.F);
      }
   }

   public void a() {
      if (this.i) {
         int var10001 = (int)2161204336959096453L;
         int var2 = -1995543316;
         int var1 = var10001;
         var10001 = (var1 | var2) - (var1 & var2);
         var2 = 1584753256;
         var1 = var10001;
         this.j = pulse.Bool.from(var1 + var2 - 2 * (var1 & var2));
         this.t.g();
         int var10002 = (int)-5232508228080802766L;
         var2 = 1162272416;
         var1 = var10002;
         var10002 = var1 + var2 - 2 * (var1 & var2);
         var2 = -1781120600;
         var1 = var10002;
         var10002 = (var1 | var2) - (var1 & var2);
         int var10003 = (int)-1910259981229018523L;
         var2 = -324165593;
         var1 = var10003;
         var10003 = (var1 | var2) & (~var1 | ~var2);
         var2 = -1236173412;
         var1 = var10003;
         var2 = (var1 | var2) & (~var1 | ~var2);
         var1 = var10002;
         var10002 = (var1 & ~var2) + (var2 & ~var1) + 2 * (var1 & var2);
         this.h.a(0.0, 0.15, pulse.Easing.g);
      }
   }

   public void b() {
      int var10001 = (int)7064184181529912091L;
      int var2 = -1727643799;
      int var1 = var10001;
      var10001 = var1 & ~var2 | ~var1 & var2;
      var2 = 2030050418;
      var1 = var10001;
      this.i = pulse.Bool.from(var1 + var2 - 2 * (var1 & var2));
      var2 = 1375671801;
      var1 = -408429694;
      var10001 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1235693957;
      var1 = var10001;
      this.j = pulse.Bool.from((var1 | var2) - (var1 & var2));
      this.h.d(0.0);
      this.t.g();
   }

   public boolean c() {
      return this.i;
   }

   public boolean d() {
      return this.j;
   }

   public boolean e() {
      if (this.i && !this.j) {
         double var10000 = this.h.j();
         int var10001 = (int)2106440155279864504L;
         int var2 = -84405864;
         int var1 = var10001;
         var10001 = (var1 | var2) - (var1 & var2);
         var2 = -1993647470;
         var1 = var10001;
         var10001 = (var1 | var2) - (var1 & var2);
         int var10002 = (int)-2744439306619785381L;
         var2 = -852551076;
         var1 = var10002;
         var10002 = var1 + var2 - 2 * (var1 & var2);
         var2 = -17308410;
         var1 = var10002;
         var2 = (var1 | var2) - (var1 & var2);
         var1 = var10001;
         var10001 = var1 - ~var2 - 1;
         if (var10000 > 0.5) {
            int var22 = (int)-5794722223854235625L;
            var2 = -842196189;
            var1 = var22;
            int var23 = var1 + var2 - 2 * (var1 & var2);
            var2 = 517360437;
            var1 = var23;
            return pulse.Bool.from((var1 | var2) & ~(var1 & var2));
         }
      }

      int var19 = (int)2909061068252761242L;
      int var15 = 1880540000;
      int var7 = var19;
      var19 = (var7 | var15) & (~var7 | ~var15);
      var15 = -2096558086;
      var7 = var19;
      return pulse.Bool.from((var7 | var15) - (var7 & var15));
   }

   public boolean f() {
      if (this.j && this.h.d()) {
         double var10000 = this.h.j();
         int var10002 = (int)9081375985188600807L;
         int var2 = -1463540647;
         int var1 = var10002;
         var10002 = var1 & ~var2 | ~var1 & var2;
         var2 = 1277812667;
         var1 = var10002;
         var10002 = (var1 | var2) & ~(var1 & var2);
         if (var10000 < 0.01) {
            int var16 = (int)2280649549386851320L;
            var2 = -872558793;
            var1 = var16;
            int var17 = (var1 | var2) & ~(var1 & var2);
            var2 = 1134980302;
            var1 = var17;
            return pulse.Bool.from((var1 | var2) - (var1 & var2));
         }
      }

      int var13 = (int)-7120168746026809693L;
      int var9 = -563199415;
      int var4 = var13;
      var13 = (var4 | var9) & ~(var4 & var9);
      var9 = 777356522;
      var4 = var13;
      return pulse.Bool.from(var4 + var9 - 2 * (var4 & var9));
   }

   public void g() {
      this.h.a();
      if (this.f()) {
         int var10001 = (int)1567010066493870518L;
         int var2 = 704730845;
         int var1 = var10001;
         var10001 = var1 & ~var2 | ~var1 & var2;
         var2 = 1322600299;
         var1 = var10001;
         this.i = pulse.Bool.from(var1 & ~var2 | ~var1 & var2);
         var2 = 1359594426;
         var1 = 1727364030;
         var10001 = (var1 | var2) & ~(var1 & var2);
         var2 = 939309060;
         var1 = var10001;
         this.j = pulse.Bool.from(var1 + var2 - 2 * (var1 & var2));
      }
   }

   public float h() {
      float var1 = this.t.m();
      int var10000 = (int)3190328807974635440L;
      int var3 = 1945023350;
      int var2 = var10000;
      var10000 = var2 + var3 - 2 * (var2 & var3);
      var3 = 1566932790;
      var2 = var10000;
      var10000 = ((var2 | var3) & (~var2 | ~var3)) * ((var2 | var3) & (~var2 | ~var3));
      String var10002 = "rz";
      return Math.max(38.0F, Math.min(var1, 108.0F));
   }

   public void a(MatrixStack var1, Renderer2D var2, int var3, int var4) {
      if (this.i) {
         this.g();
         float var5 = (float)this.h.j();
         int var32 = -1857835625;
         int var31 = -531850115;
         int var10002 = (var31 | var32) - (var31 & var32);
         var32 = 1896821240;
         var31 = var10002;
         var10002 = (var31 | var32) & (~var31 | ~var32);
         if (!(var5 < 0.01F)) {
            float var6 = this.h();
            this.l = Math.round(this.n + this.p / 2.0F - this.k / 2.0F);
            if (!this.r) {
               float var10001 = this.o + this.q;
               var10002 = (int)-8321505081733849754L;
               var32 = 831187288;
               var31 = var10002;
               var10002 = var31 & ~var32 | ~var31 & var32;
               var32 = -914185160;
               var31 = var10002;
               var10002 = (var31 | var32) & (~var31 | ~var32);
               var32 = -1285054428;
               var31 = -837724352;
               int var10003 = (var31 | var32) - (var31 & var32);
               var32 = -698362585;
               var31 = var10003;
               var32 = var31 + var32 - 2 * (var31 & var32);
               var31 = var10002;
               var10002 = (var31 | var32) + (var31 & var32);
               this.m = Math.round(var10001 + 8.0F);
            } else {
               float var244 = this.o - var6;
               var32 = -624209971;
               var31 = 1480301893;
               var10002 = (var31 | var32) & (~var31 | ~var32);
               var32 = 527276273;
               var31 = var10002;
               var10002 = ((var31 | var32) & (~var31 | ~var32)) * ((var31 | var32) & (~var31 | ~var32));
               this.m = Math.round(var244 - 8.0F);
            }

            float var7 = Math.max(0.0F, Math.min(1.0F, var5));
            int var10000 = (int)-5949492980159554361L;
            var32 = 887702349;
            var31 = var10000;
            var10000 = var31 & ~var32 | ~var31 & var32;
            var32 = 908307356;
            var31 = var10000;
            var10000 = (var31 | var32) & ~(var31 & var32);
            int var8 = (int)(255.0F * var7);
            float var9 = this.l + this.k / 2.0F;
            float var10 = this.m + var6 / 2.0F;
            float var11 = this.k * var7;
            float var12 = var6 * var7;
            if (!(var11 < 1.0F) && !(var12 < 1.0F)) {
               float var13 = var9 - var11 / 2.0F;
               float var14 = var10 - var12 / 2.0F;
               Color var15 = pulse.Theme.a(pulse.Theme.q, var8);
               Color var16 = pulse.Theme.a(pulse.Theme.r, var8);
               String var273 = "sa";
               float var245 = var13 - 0.5F * var7;
               var32 = -601397671;
               var31 = 1058471605;
               int var10004 = var31 + var32 - 2 * (var31 & var32);
               var32 = -483288852;
               var31 = var10004;
               var10004 = (var31 | var32) & ~(var31 & var32);
               var32 = -1270704144;
               var31 = -544824920;
               var10004 = var31 & ~var32 | ~var31 & var32;
               var32 = 1808021064;
               var31 = var10004;
               var10004 = (var31 | var32) & ~(var31 & var32);
               var10004 = (int)-4158243037728406405L;
               var32 = 885152093;
               var31 = var10004;
               var10004 = (var31 | var32) & ~(var31 & var32);
               var32 = 985095470;
               var31 = var10004;
               var10004 = (var31 | var32) & ~(var31 & var32);
               var32 = 763191371;
               var31 = -207331999;
               var10004 = var31 & ~var32 | ~var31 & var32;
               var32 = -556188359;
               var31 = var10004;
               var10004 = var31 + var32 - 2 * (var31 & var32);
               float var274 = var14 - 0.5F * var7;
               float var285 = var11 + var7;
               float var299 = var12 + var7;
               String var10005 = "sb";
               var2.a(var245, var274, var285, var299, 9.5F * var7, var15, var15, var16, var16, var1);
               Color var17 = pulse.Theme.a(pulse.Theme.e, var8);
               Color var18 = pulse.Theme.a(pulse.Theme.f, var8);
               int var305 = (int)4512491044504307563L;
               var32 = 661555137;
               var31 = var305;
               int var306 = var31 & ~var32 | ~var31 & var32;
               var32 = 827359622;
               var31 = var306;
               int var307 = var31 + var32 - 2 * (var31 & var32);
               var32 = 896187251;
               var31 = -1079875845;
               int var10006 = (var31 | var32) - (var31 & var32);
               var32 = -628755134;
               var31 = var10006;
               var32 = (var31 | var32) - (var31 & var32);
               var31 = var307;
               int var308 = var31 - ~var32 - 1;
               var2.a(var13, var14, var11, var12, 9.5F * var7, var17, var17, var18, var18, var1);
               var10000 = (int)-3836589590676189434L;
               var32 = 1802107240;
               var31 = var10000;
               var10000 = var31 + var32 - 2 * (var31 & var32);
               var32 = 262183508;
               var31 = var10000;
               var10000 = (var31 & ~var32 | ~var31 & var32) * (var31 & ~var32 | ~var31 & var32);
               int var246 = (int)8183058079188542369L;
               var32 = 1410177909;
               var31 = var246;
               int var247 = var31 + var32 - 2 * (var31 & var32);
               var32 = -1423359160;
               var31 = var247;
               int var248 = (var31 & ~var32 | ~var31 & var32) * (var31 & ~var32 | ~var31 & var32);
               var32 = -1935984465;
               var31 = -1375550708;
               var10002 = (var31 | var32) - (var31 & var32);
               var32 = -1574842838;
               var31 = var10002;
               var10002 = ((var31 | var32) & (~var31 | ~var32)) * ((var31 | var32) & (~var31 | ~var32));
               var32 = 1998848717;
               var31 = -1180501051;
               var10002 = (var31 | var32) - (var31 & var32);
               var32 = 1927285078;
               var31 = var10002;
               var10002 = (var31 | var32) & (~var31 | ~var32);
               int var286 = (int)-5119828884831581361L;
               var32 = -1950801612;
               var31 = var286;
               int var287 = var31 & ~var32 | ~var31 & var32;
               var32 = -1520306338;
               var31 = var287;
               int var288 = (var31 | var32) - (var31 & var32);
               var32 = 53953867;
               var31 = 1289538229;
               int var289 = var31 + var32 - 2 * (var31 & var32);
               var32 = -887034478;
               var31 = var289;
               int var290 = (var31 | var32) & ~(var31 & var32);
               var32 = -1434548635;
               var31 = 1927217590;
               var10004 = (var31 | var32) - (var31 & var32);
               var32 = -1870816614;
               var31 = var10004;
               var10004 = (var31 | var32) - (var31 & var32);
               int var309 = (int)3702742441219631922L;
               var32 = 2127463754;
               var31 = var309;
               int var310 = (var31 | var32) - (var31 & var32);
               var32 = -657025379;
               var31 = var310;
               var32 = var31 + var32 - 2 * (var31 & var32);
               var31 = var10004;
               var10004 = (var31 ^ var32) + 2 * (var31 & var32);
               var32 = -1236681468;
               var31 = -1035265796;
               var10004 = var31 & ~var32 | ~var31 & var32;
               var32 = 1863853145;
               var31 = var10004;
               var10004 = var31 & ~var32 | ~var31 & var32;
               var10005 = "sc";
               int var312 = (int)-2595427801310139236L;
               var32 = -102954805;
               var31 = var312;
               int var313 = (var31 | var32) - (var31 & var32);
               var32 = -1887939537;
               var31 = var313;
               IconTextureRegistry.TextureInfo var19 = IconTextureRegistry.getInfo(a("놩熜놺熁놿熱놾", "`ꟳꓺꁡꤐ絺蹙⑿譸㑿g\ua7e2ꓺꁒꤊ絻蹚⑵謹㑲|ꟲꒆꁴꤑ絢蹃⑴謰㑤B\ua7e7꒻ꁴ꤉", var10002, var290, var10004, (var31 | var32) & (~var31 | ~var32)));
               if (var19 != null) {
                  Identifier var20 = var19.a();
                  var10000 = (int)-2833173998183196415L;
                  var32 = -1105618096;
                  var31 = var10000;
                  var10000 = (var31 | var32) & (~var31 | ~var32);
                  var32 = -713866671;
                  var31 = var10000;
                  RenderSystem.setShaderTexture((var31 | var32) & ~(var31 & var32), var20);
                  float var21 = var19.b() / 2.0F * var7;
                  float var22 = var19.c() / 2.0F * var7;
                  float var23 = var13 + var11 / 2.0F;
                  float var24;
                  float var25;
                  if (!this.r) {
                     var24 = var14 - var21 / 2.0F - 1.0F;
                     var32 = 1523064322;
                     var31 = -287179175;
                     var10000 = (var31 | var32) & (~var31 | ~var32);
                     var32 = 119436080;
                     var31 = var10000;
                     var10000 = (var31 | var32) & ~(var31 & var32);
                     int var249 = (int)5350343358262493010L;
                     var32 = -1439998005;
                     var31 = var249;
                     int var250 = var31 & ~var32 | ~var31 & var32;
                     var32 = 1162125703;
                     var31 = var250;
                     var32 = var31 & ~var32 | ~var31 & var32;
                     var31 = var10000;
                     var10000 = (var31 ^ var32) + 2 * (var31 & var32);
                     var25 = -90.0F;
                  } else {
                     var24 = var14 + var12 + var21 / 2.0F + 1.0F;
                     String var221 = "sd";
                     var25 = 90.0F;
                  }

                  Color var26 = pulse.Theme.a(pulse.Theme.aa, var8);
                  var1.push();
                  var1.translate(var23, var24, 0.0F);
                  var1.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(var25));
                  var1.translate(-var23, -var24, 0.0F);
                  float var222 = var23 - var21 / 2.0F;
                  int var251 = (int)4674960012580300631L;
                  var32 = -688320030;
                  var31 = var251;
                  int var252 = var31 & ~var32 | ~var31 & var32;
                  var32 = 849590287;
                  var31 = var252;
                  int var253 = (var31 | var32) & (~var31 | ~var32);
                  var10002 = (int)-7059044750642700472L;
                  var32 = -528547044;
                  var31 = var10002;
                  var10002 = var31 & ~var32 | ~var31 & var32;
                  var32 = -824060533;
                  var31 = var10002;
                  var32 = var31 & ~var32 | ~var31 & var32;
                  var31 = var253;
                  int var254 = var31 - ~var32 - 1;
                  float var27 = var222 - 0.5F;
                  float var28 = var24 - var22 / 2.0F;
                  var2.a(var20, var27, var28, var21, var22, var26, var1);
                  var1.pop();
               }

               int var255 = (int)1880935201942952281L;
               var32 = 327934510;
               var31 = var255;
               int var256 = (var31 | var32) & ~(var31 & var32);
               var32 = -1910152995;
               var31 = var256;
               int var257 = ((var31 | var32) & ~(var31 & var32)) * ((var31 | var32) & ~(var31 & var32));
               if (!(var7 > 0.1F)) {
                  var10000 = (int)-1981677691707804081L;
                  var32 = 798658540;
                  var31 = var10000;
                  var10000 = var31 + var32 - 2 * (var31 & var32);
                  var32 = -832523828;
                  var31 = var10000;
                  var10000 = ((var31 | var32) & ~(var31 & var32)) * ((var31 | var32) & ~(var31 & var32));
                  var10000 = (int)3434623989305804685L;
                  var32 = -1465407372;
                  var31 = var10000;
                  var10000 = (var31 | var32) & ~(var31 & var32);
                  var32 = -1469918087;
                  var31 = var10000;
                  int var30 = (var31 | var32) & (~var31 | ~var32);
                  f = var30;
                  var10000 = (int)1812843242444139850L;
                  var32 = 1244388043;
                  var31 = var10000;
                  var10000 = (var31 | var32) & (~var31 | ~var32);
                  var32 = -959950988;
                  var31 = var10000;
                  var10000 = (var31 | var32) - (var31 & var32);
                  int var258 = (int)8275001168221567788L;
                  var32 = -397342542;
                  var31 = var258;
                  int var259 = var31 + var32 - 2 * (var31 & var32);
                  var32 = 862537655;
                  var31 = var259;
                  var32 = var31 & ~var32 | ~var31 & var32;
                  var31 = var10000;
                  var10000 = (var31 & ~var32) + (var32 & ~var31) + 2 * (var31 & var32);
                  var32 = -545681756;
                  var31 = 1809956269;
                  var10000 = (var31 | var32) - (var31 & var32);
                  var32 = -260996465;
                  var31 = var10000;
                  if (((var31 | var32) & ~(var31 & var32)) <= f) {
                     var10000 = (int)-2375163850231428436L;
                     var32 = 1165320769;
                     var31 = var10000;
                     var10000 = (var31 | var32) - (var31 & var32);
                     var32 = -1293014803;
                     var31 = var10000;
                     var10000 = (var31 | var32) - (var31 & var32);
                     var32 = 1461562092;
                     var31 = 2036870281;
                     int var260 = (var31 | var32) - (var31 & var32);
                     var32 = 779454053;
                     var31 = var260;
                     var10000 /= (var31 | var32) - (var31 & var32);
                  }
               } else {
                  var32 = 1220435793;
                  var31 = -142518362;
                  var10002 = (var31 | var32) & ~(var31 & var32);
                  var32 = -1086387978;
                  var31 = var10002;
                  var10002 = var31 + var32 - 2 * (var31 & var32);
                  var32 = -452954446;
                  var31 = -1548692250;
                  var10002 = (var31 | var32) - (var31 & var32);
                  var32 = 1185981023;
                  var31 = var10002;
                  var10002 = var31 & ~var32 | ~var31 & var32;
                  float var33 = var14 + 7.0F * var7;
                  int var261 = (int)1728507349381424744L;
                  var32 = 962839184;
                  var31 = var261;
                  int var262 = (var31 | var32) & (~var31 | ~var32);
                  var32 = 1765335781;
                  var31 = var262;
                  int var263 = (var31 + var32 - 2 * (var31 & var32)) * (var31 + var32 - 2 * (var31 & var32));
                  float var237 = var12 - 7.0F * var7;
                  var32 = -591122270;
                  var31 = -814146897;
                  int var264 = var31 + var32 - 2 * (var31 & var32);
                  var32 = -1780922651;
                  var31 = var264;
                  int var265 = var31 + var32 - 2 * (var31 & var32);
                  float var34 = var237 - 6.0F * var7;
                  if (var34 < 1.0F || var11 < 1.0F) {
                     return;
                  }

                  ScissorStack var238 = var2.b();
                  var32 = -465245393;
                  var31 = 19305984;
                  int var314 = (var31 | var32) & ~(var31 & var32);
                  var32 = 824766841;
                  var31 = var314;
                  int var315 = (var31 & ~var32 | ~var31 & var32) * (var31 & ~var32 | ~var31 & var32);
                  var238.a(var13, var33, var11, var34, 9.5F * var7, var1);
                  if (!this.j) {
                     var10000 = var3;
                  } else {
                     var32 = 1391009202;
                     var31 = 429174732;
                     var10000 = var31 + var32 - 2 * (var31 & var32);
                     var32 = -1266528895;
                     var31 = var10000;
                     var10000 = (var31 | var32) & ~(var31 & var32);
                  }

                  int var35 = var10000;
                  if (!this.j) {
                     var10000 = var4;
                  } else {
                     var10000 = (int)3795363584210051861L;
                     var32 = -42593500;
                     var31 = var10000;
                     var10000 = var31 & ~var32 | ~var31 & var32;
                     var32 = 885182414;
                     var31 = var10000;
                     var10000 = var31 & ~var32 | ~var31 & var32;
                  }

                  int var36 = var10000;
                  this.t.a(var1, var2, var13, var14, var11, var12, var35, var36, var7, var7);
                  var2.b().a(var1);
               }
            }
         }
      }
   }

   public boolean a(int var1, int var2) {
      if (this.i && !this.j) {
         double var10000 = this.h.j();
         int var4 = -767353133;
         int var3 = 961077041;
         int var10001 = var3 & ~var4 | ~var3 & var4;
         var4 = 1671505652;
         var3 = var10001;
         var10001 = var3 & ~var4 | ~var3 & var4;
         if (!(var10000 < 0.5)) {
            if (this.c(var1, var2)) {
               return this.t.a(this.l, this.m, this.k, this.h(), var1, var2);
            }

            int var17 = (int)-7265631149659356740L;
            var4 = 731062637;
            var3 = var17;
            int var18 = var3 + var4 - 2 * (var3 & var4);
            var4 = -199647023;
            var3 = var18;
            return pulse.Bool.from(var3 + var4 - 2 * (var3 & var4));
         }
      }

      int var15 = (int)-1614401950495483489L;
      int var11 = -294804477;
      int var6 = var15;
      var15 = (var6 | var11) & ~(var6 & var11);
      var11 = 778665372;
      var6 = var15;
      return pulse.Bool.from((var6 | var11) - (var6 & var11));
   }

   public void b(int var1, int var2) {
      if (this.i) {
         this.t.c(var1, var2);
      }
   }

   public void a(int var1, int var2, double var3, double var5) {
      if (this.i && !this.j) {
         this.t.a(this.h(), var1, var2, var3, var5);
      }
   }

   public boolean a(float var1, int var2, int var3) {
      if (!this.i || this.j) {
         int var43 = 848704953;
         int var25 = -405108104;
         int var58 = (var25 | var43) - (var25 & var43);
         var43 = -716390463;
         var25 = var58;
         return pulse.Bool.from(var25 + var43 - 2 * (var25 & var43));
      }

      if (!this.c(var2, var3)) {
         String var46 = "se";
         int var47 = (int)1375272062990232043L;
         int var28 = -139502561;
         int var10 = var47;
         int var48 = (var10 | var28) - (var10 & var28);
         var28 = 1289654050;
         var10 = var48;
         int var5 = (var10 | var28) - (var10 & var28);
         f = var5;
         var28 = -74912510;
         var10 = -1017230643;
         int var49 = var10 + var28 - 2 * (var10 & var28);
         var28 = 1594142546;
         var10 = var49;
         int var50 = (var10 | var28) & ~(var10 & var28);
         var28 = 1821244189;
         var10 = 220099157;
         int var51 = (var10 | var28) & ~(var10 & var28);
         var28 = 2140591001;
         var10 = var51;
         if (((var10 | var28) & (~var10 | ~var28)) < f) {
            int var52 = (int)-7855660288790165789L;
            var28 = -1193994166;
            var10 = var52;
            int var53 = (var10 | var28) & (~var10 | ~var28);
            var28 = 560208660;
            var10 = var53;
            int var54 = (var10 | var28) - (var10 & var28);
            int var10001 = (int)6518986949198187114L;
            var28 = 2081851947;
            var10 = var10001;
            var10001 = var10 & ~var28 | ~var10 & var28;
            var28 = -1358433025;
            var10 = var10001;
            var28 = var10 + var28 - 2 * (var10 & var28);
            var10 = var54;
            int var55 = 2 * (var10 | var28) - (var10 ^ var28);
            var28 = 885287704;
            var10 = 1938424311;
            int var56 = var10 + var28 - 2 * (var10 & var28);
            var28 = -1795216319;
            var10 = var56;
            var5 = (var10 | var28) & ~(var10 & var28);
         }

         var28 = -985325094;
         var10 = 1277923454;
         int var57 = (var10 | var28) - (var10 & var28);
         var28 = -1989234268;
         var10 = var57;
         return pulse.Bool.from((var10 | var28) & (var10 ^ -1 | var28 ^ -1));
      } else {
         this.t.a(var1, this.h());
         int var10000 = (int)3504289617042185660L;
         int var7 = 1395756494;
         int var6 = var10000;
         var10000 = var6 & ~var7 | ~var6 & var7;
         var7 = 1188171891;
         var6 = var10000;
         return pulse.Bool.from((var6 | var7) & (var6 & var7 ^ -1));
      }
   }

   public boolean c(int var1, int var2) {
      if (this.i) {
         double var10000 = this.h.j();
         int var4 = 935234306;
         int var3 = 1328803277;
         int var10001 = var3 + var4 - 2 * (var3 & var4);
         var4 = 1047933629;
         var3 = var10001;
         var10001 = (var3 | var4) - (var3 & var4);
         if (!(var10000 < 0.5)) {
            return GuiInput.a(this.l, this.m, this.k, this.h(), var1, var2);
         }
      }

      int var11 = (int)-3798222833845363360L;
      int var9 = 713962373;
      int var6 = var11;
      var11 = (var6 | var9) & ~(var6 & var9);
      var9 = -263147803;
      var6 = var11;
      return pulse.Bool.from(var6 + var9 - 2 * (var6 & var9));
   }

   public void b(float var1, float var2, float var3, float var4) {
      this.n = var1;
      this.o = var2;
      this.p = var3;
      this.q = var4;
   }

   public float i() {
      return this.u.e();
   }

   @Deprecated
   public void a(float var1) {
      this.u.a(Math.max(1.0F, Math.min(2.0F, var1)));
   }

   public void a(SettingWidget var1) {
      this.t.a(var1);
   }

   public SettingWidgetList j() {
      return this.t;
   }

   public static String a(String var0, String var1, int var2, int var3, int var4, int var5) {
      char[] var6 = var1.toCharArray();
      char[] var7 = new char[var6.length];
      int var20 = -1011600855;
      int var19 = 178797519;
      int var10000 = var19 & ~var20 | ~var19 & var20;
      var20 = -920909332;
      var19 = var10000;
      char[] var278 = new char[var19 & ~var20 | ~var19 & var20];
      int var10002 = (int)-1353711281848977275L;
      var20 = -854388497;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = 568387690;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = 41454900;
      var19 = 1226974046;
      int var10003 = (var19 | var20) - (var19 & var20);
      var20 = 1264248408;
      var19 = var10003;
      var278[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      var10002 = (int)-1153458137919051698L;
      var20 = -223007975;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = -1598553258;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = 1428628551;
      var19 = 1369643307;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = 75767529;
      var19 = var10003;
      var278[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      var20 = 1246833456;
      var19 = -30050433;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = -1268491187;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1986071022;
      var19 = 1040161438;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = 1268691190;
      var19 = var10003;
      var278[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      var20 = 2076122763;
      var19 = 53442577;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = 2022729369;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1385373201;
      var19 = 1835678566;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = -1052774999;
      var19 = var10003;
      var10003 = (var19 | var20) - (var19 & var20);
      var10003 = (int)-1454617667977035650L;
      var20 = 1364074498;
      var19 = var10003;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = 1232500847;
      var19 = var10003;
      var278[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      var10002 = (int)9050935840488108112L;
      var20 = 1162392072;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = 745374300;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = -780014550;
      var19 = 1449878508;
      int var10004 = (var19 | var20) & ~(var19 & var20);
      var20 = -2014670911;
      var19 = var10004;
      var10004 = (var19 | var20) - (var19 & var20);
      var10003 = (int)1105221779427047242L;
      var20 = -1683643350;
      var19 = var10003;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = -748486075;
      var19 = var10003;
      var278[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      var10002 = (int)-4215607077266615172L;
      var20 = -1217964938;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = 2038546447;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = 1907886097;
      var19 = 252434496;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = 2125698515;
      var19 = var10003;
      var278[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      var10002 = (int)3790295839388767349L;
      var20 = 1227305214;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = -1521507187;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var10003 = (int)-5441785912948804911L;
      var20 = 663723048;
      var19 = var10003;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = 1702471658;
      var19 = var10003;
      var278[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      var10002 = (int)-942035492562623794L;
      var20 = 1910621792;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = -1709218647;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var10003 = (int)6306457194241824711L;
      var20 = -1761585468;
      var19 = var10003;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = 587068705;
      var19 = var10003;
      var278[var10002] = (char)((var19 | var20) - (var19 & var20));
      var20 = -1899393635;
      var19 = 1386961982;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = -597503573;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var10003 = (int)6516568798527284230L;
      var20 = -827212500;
      var19 = var10003;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = 137187705;
      var19 = var10003;
      var278[var10002] = (char)((var19 | var20) & ~(var19 & var20));
      var20 = -2003570739;
      var19 = 1712295397;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = -291741151;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = -1306237257;
      var19 = 512840375;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = -1397411036;
      var19 = var10003;
      var278[var10002] = (char)((var19 | var20) & ~(var19 & var20));
      char[] var8 = var278;
      var10000 = (int)-4016491720759852978L;
      var20 = -1837680459;
      var19 = var10000;
      var10000 = (var19 | var20) - (var19 & var20);
      var20 = -21432079;
      var19 = var10000;
      char[] var281 = new char[(var19 | var20) & (~var19 | ~var20)];
      var20 = 1600982601;
      var19 = 284575305;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = 1335576576;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var10003 = (int)-6041321317727743667L;
      var20 = 277598660;
      var19 = var10003;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = 39602345;
      var19 = var10003;
      var281[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      var20 = -1136720211;
      var19 = 339362422;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = -1476049702;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      String var377 = "sf";
      var10003 = (int)-7593620075387232008L;
      var20 = -355573113;
      var19 = var10003;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = -980810116;
      var19 = var10003;
      var281[var10002] = (char)((var19 | var20) & ~(var19 & var20));
      var20 = -1552058114;
      var19 = 240846675;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = -1389985873;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = -1669229242;
      var19 = 355378986;
      var10004 = var19 & ~var20 | ~var19 & var20;
      var20 = -1985007007;
      var19 = var10004;
      var10004 = (var19 | var20) & (~var19 | ~var20);
      var10004 = (int)6669361299993230425L;
      var20 = -169526504;
      var19 = var10004;
      var10004 = (var19 | var20) - (var19 & var20);
      var20 = -919582911;
      var19 = var10004;
      var10004 = var19 & ~var20 | ~var19 & var20;
      var10004 = (int)4168610574027771929L;
      var20 = -294114626;
      var19 = var10004;
      var10004 = var19 & ~var20 | ~var19 & var20;
      var20 = -106628437;
      var19 = var10004;
      var10004 = var19 & ~var20 | ~var19 & var20;
      var20 = 1381109816;
      var19 = 1369338351;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = 63760004;
      var19 = var10003;
      var281[var10002] = (char)((var19 | var20) & ~(var19 & var20));
      var20 = 789627247;
      var19 = -2134347405;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = -1344753633;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var10003 = (int)5985417988089096495L;
      var20 = 950379225;
      var19 = var10003;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = -1930611724;
      var19 = var10003;
      var281[var10002] = (char)((var19 | var20) - (var19 & var20));
      var20 = -411621324;
      var19 = -1540669296;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = 1130129568;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var10003 = (int)9096450393012689560L;
      var20 = -1502965395;
      var19 = var10003;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = 1578202037;
      var19 = var10003;
      var281[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      var10002 = (int)6666939560247593356L;
      var20 = -1253891236;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = -1228035371;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = -307222759;
      var19 = -1801575635;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = 2033073312;
      var19 = var10003;
      var281[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      var20 = -1850680951;
      var19 = -1546378857;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = 845477912;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      String var386 = "sg";
      var10003 = (int)-8722268120591188861L;
      var20 = -1004875486;
      var19 = var10003;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = -1737954664;
      var19 = var10003;
      var281[var10002] = (char)((var19 | var20) - (var19 & var20));
      var10002 = (int)5993767743354868931L;
      var20 = -1023430138;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = 1512253122;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var10003 = (int)-5071239025607459588L;
      var20 = 878154204;
      var19 = var10003;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = -1077527272;
      var19 = var10003;
      var281[var10002] = (char)((var19 | var20) & ~(var19 & var20));
      var10002 = (int)-5033571032459335580L;
      var20 = -920849879;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1804360261;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1316562795;
      var19 = 1922595300;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = -5736410;
      var19 = var10003;
      var10003 = ((var19 | var20) - (var19 & var20)) * ((var19 | var20) - (var19 & var20));
      var20 = -1563756355;
      var19 = -157550812;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = 1414630557;
      var19 = var10003;
      var281[var10002] = (char)((var19 | var20) - (var19 & var20));
      var10002 = (int)-906109211368330934L;
      var20 = -1361748117;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = -1233439192;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var10003 = (int)-8922281671390682155L;
      var20 = 1638439712;
      var19 = var10003;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = -143717434;
      var19 = var10003;
      var281[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      char[] var9 = var281;
      var10000 = (int)-7015192513643353495L;
      var20 = 1242537923;
      var19 = var10000;
      var10000 = (var19 | var20) & ~(var19 & var20);
      var20 = -79596118;
      var19 = var10000;

      for (int var10 = (var19 | var20) - (var19 & var20); var10 < var6.length; var10++) {
         char var355 = var6[var10];
         char var248 = var8[var10 % var8.length];
         char var121 = var355;
         var7[var10] = (char)((var121 | var248) - (var121 & var248));
      }

      char[] var21 = new char[var7.length];
      var20 = -1137845341;
      var19 = 1534776520;
      var10000 = (var19 | var20) - (var19 & var20);
      var20 = -413724821;
      var19 = var10000;

      for (int var11 = var19 + var20 - 2 * (var19 & var20); var11 < var6.length; var11++) {
         char var356 = var7[var11];
         char var251 = var9[var11 % var9.length];
         char var124 = var356;
         var21[var11] = (char)((var124 | var251) - (var124 & var251));
      }

      String var22 = new String(var21);
      int var12 = var22.hashCode();
      var20 = var5;
      var19 = var3;
      var10000 = var19 + ~var20 + 1;
      var20 = var2;
      var19 = var10000;
      int var13 = (var19 & ~var20) - (~var19 & var20);
      char[] var14 = var0.toCharArray();
      char[] var15 = new char[var14.length];
      var10000 = (int)8223940751138595841L;
      var20 = 1850988493;
      var19 = var10000;
      var10000 = (var19 | var20) & ~(var19 & var20);
      var20 = 455766988;
      var19 = var10000;

      for (int var16 = var19 + var20 - 2 * (var19 & var20); var16 < var15.length; var16++) {
         String var288 = "sh";
         var10000 = (int)3017902760398189788L;
         var20 = 867571259;
         var19 = var10000;
         var10000 = (var19 | var20) - (var19 & var20);
         var20 = 543574234;
         var19 = var10000;
         int var18 = (var19 | var20) & (~var19 | ~var20);
         f = var18;
         var20 = 1713803212;
         var19 = -1828393243;
         var10000 = (var19 | var20) & ~(var19 & var20);
         var20 = 1030328005;
         var19 = var10000;
         var10000 = (var19 | var20) - (var19 & var20);
         int var10001 = (int)-4741350037936421678L;
         var20 = 973295352;
         var19 = var10001;
         var10001 = (var19 | var20) & (~var19 | ~var20);
         var20 = 1890192738;
         var19 = var10001;
         var20 = (var19 | var20) - (var19 & var20);
         var19 = var10000;
         var10000 = var19 - ~var20 - 1;
         var10000 = (int)5228852947232558324L;
         var20 = -1476506774;
         var19 = var10000;
         var10000 = (var19 | var20) & (~var19 | ~var20);
         var20 = -1403272874;
         var19 = var10000;
         if ((var19 | var20) - (var19 & var20) < f) {
            throw new ExceptionInInitializerError();
         }

         var10001 = (int)8138964956474626326L;
         var20 = -1184802224;
         var19 = var10001;
         var10001 = var19 + var20 - 2 * (var19 & var20);
         var20 = -949712060;
         var19 = var10001;
         switch (var16 % (var19 & ~var20 | ~var19 & var20)) {
            case 0:
               var20 = var12;
               var19 = var13;
               var10002 = var19 + var20 - 2 * (var19 & var20);
               int var270 = var14[var16];
               var19 = var10002;
               var15[var16] = (char)((var19 | var270) & ~(var19 & var270));
               if (g) {
                  var10000 = (int)-4367478285206777758L;
                  var270 = -1911013965;
                  var19 = var10000;
                  var10000 = (var19 | var270) - (var19 & var270);
                  var270 = 493938662;
                  var19 = var10000;
                  var10000 = (var19 | var270) & (~var19 | ~var270);
                  var10001 = (int)-1381966153212936318L;
                  var270 = 1034484569;
                  var19 = var10001;
                  var10001 = (var19 | var270) - (var19 & var270);
                  var270 = -609938971;
                  var19 = var10001;
                  var270 = var19 + var270 - 2 * (var19 & var270);
                  var19 = var10000;
                  var10000 = (var19 | var270) + (var19 & var270);
                  var270 = -534003933;
                  var19 = -1554554524;
                  var10000 = var19 + var270 - 2 * (var19 & var270);
                  var270 = 283664072;
                  var19 = var10000;
                  var18 = (var19 | var270) - (var19 & var270);
               }
               break;
            case 1:
               var20 = var13;
               var19 = var5;
               var10002 = (var19 | var20) & ~(var19 & var20);
               char var268 = var14[var16];
               var19 = var10002;
               var15[var16] = (char)((var19 | var268) & (~var19 | ~var268));
         }
      }

      return new String(var15);
   }
}
