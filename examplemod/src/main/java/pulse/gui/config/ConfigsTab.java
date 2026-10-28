package pulse;


import pulse.client.MinecraftContext;
import java.awt.Color;
import java.lang.reflect.Method;
import java.time.LocalDateTime;
import java.util.function.Consumer;
import net.minecraft.client.util.math.MatrixStack;

public class ConfigsTab implements TabHost, ClickGuiTab {
   private static final String[] a;
   private static final float b = 19.0F;
   private static final float c = 48.0F;
   private static final float d = 117.5F;
   private static final float e = 15.0F;
   private static final float f = 8.0F;
   private static final float g = 8.0F;
   private int h;
   private int i;
   private int j;
   private final TabSelector k;
   private final SearchBox l;
   private final ConfigListPanel m;
   private final PanelFadeOverlay n;
   private final AnimationState o;
   private final AnimationState p;
   private final AnimationState q;
   private boolean r;
   private boolean s;
   private boolean t;

   public ConfigsTab() {
      int var2 = 749935578;
      int var1 = -652558433;
      int var10001 = var1 & ~var2 | ~var1 & var2;
      var2 = -173431739;
      var1 = var10001;
      this.h = var1 & ~var2 | ~var1 & var2;
      this.o = new AnimationState();
      this.p = new AnimationState();
      this.q = new AnimationState();
      var10001 = (int)-5526125937394199897L;
      var2 = -984282333;
      var1 = var10001;
      var10001 = (var1 | var2) & ~(var1 & var2);
      var2 = -790701692;
      var1 = var10001;
      this.r = pulse.Bool.from((var1 | var2) & (~var1 | ~var2));
      var10001 = (int)-8226870201405988714L;
      var2 = -584317225;
      var1 = var10001;
      var10001 = var1 & ~var2 | ~var1 & var2;
      var2 = 1658791489;
      var1 = var10001;
      this.s = pulse.Bool.from(var1 + var2 - 2 * (var1 & var2));
      var10001 = (int)2056367318143452517L;
      var2 = -563887270;
      var1 = var10001;
      var10001 = var1 & ~var2 | ~var1 & var2;
      var2 = -1681258945;
      var1 = var10001;
      this.t = pulse.Bool.from((var1 | var2) & (~var1 | ~var2));
      this.k = new TabSelector(this);
      this.l = new SearchBox(117.5F, 15.0F);
      this.m = new ConfigListPanel(this.l);
      var2 = 450199926;
      var1 = -1573366528;
      int var10003 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1192373137;
      var1 = var10003;
      this.n = new PanelFadeOverlay((var1 | var2) & (~var1 | ~var2), 10.0F, 7.5F);
      this.j();
   }

   private void h() {
      try {
         Method var1 = ConfigListPanel.class.getDeclaredMethod("j");
         var1.setAccessible(true);
         var1.invoke(this.m);
      } catch (Throwable var3) {
      }
   }

   public void e() {
      this.h();
   }

   private void i() {
   }

   private void j() {
      this.m.a(proxy_$1(this));
      this.m.b(proxy_$2(this));
      this.m.a(proxy_$3(this));
      this.m.c(proxy_$5(this));
      this.h();
   }

   private static Consumer<ConfigEntry> proxy_$1(ConfigsTab var0) {
      return var1 -> {
         ConfigManager var2 = ConfigManager.a();
         if (var2.i()) {
            var2.a(
               var1.a(),
               () -> {
                  for (ConfigEntry var3 : var0.m.a()) {
                     var3.a(var3.a().equals(var1.a()));
                  }
               },
               var3 -> ChatMessages.a(var0.a(var3))
            );
         } else {
            ChatMessages.a(var0.a((String)null));
         }
      };
   }

   private static Consumer<ConfigEntry> proxy_$2(ConfigsTab var0) {
      return var1 -> {
         ConfigManager var2 = ConfigManager.a();
         if (var2.i()) {
            var2.b(
               var1.a(),
               () -> {
               },
               var3 -> {
                  ChatMessages.a(var0.b(var3));
                  var0.e();
               }
            );
         } else {
            ChatMessages.a(var0.b((String)null));
         }
      };
   }

   private static ConfigListPanel.RenameCallback proxy_$3(ConfigsTab var0) {
      return (var1, var2, var3) -> {
         ConfigManager var4 = ConfigManager.a();
         if (var4.i()) {
            var4.a(
               var2,
               var3,
               () -> {
               },
               var5 -> {
                  var1.a(var2);
                  ChatMessages.a(var0.c(var5));
               }
            );
         } else {
            var1.a(var2);
            ChatMessages.a(var0.c((String)null));
         }
      };
   }

   private static Runnable proxy_$4(ConfigsTab var0, String var1, String var2) {
      return () -> var0.m.a(new ConfigEntry(var1, var2, LocalDateTime.now()));
   }

   private static Consumer<ConfigEntry> proxy_$5(ConfigsTab var0) {
      return var1 -> ChatMessages.a(var0.d(var1.a()));
   }

   @Override
   public String[] c() {
      return a;
   }

   @Override
   public int d() {
      return this.h;
   }

   @Override
   public void a(int var1) {
      if (var1 >= 0 && var1 < a.length && this.h != var1) {
         this.h = var1;
      }
   }

   @Override
   public void a(MatrixStack var1, Renderer2D var2, float var3, float var4, int var5, int var6) {
      this.i = var5;
      this.j = var6;
      this.k.a(var1, var2, var3, var4, var5, var6);
      this.o.a();
      this.p.a();
      this.q.a();
      float var7 = pulse.PulseClickGuiScreen.d();
      float var8 = pulse.PulseClickGuiScreen.e();
      float var9 = var3 + var7 - 19.0F - 117.5F;
      float var10 = var4 + 19.0F - 3.0F;
      float var11 = var9 - 8.0F - 8.0F;
      float var12 = var4 + 19.0F + 3.5F - 3.0F;
      int var125;
      if (!pulse.GuiInteractionState.a().b() && !this.m.e()) {
         var125 = (int)-8859917537648070033L;
         int var75 = -674426208;
         int var24 = var125;
         var125 = (var24 | var75) - (var24 & var75);
         var75 = 720806095;
         var24 = var125;
         var125 = (var24 | var75) - (var24 & var75);
      } else {
         int var22 = 401930056;
         int var21 = 396379962;
         var125 = var21 & ~var22 | ~var21 & var22;
         var22 = 5550195;
         var21 = var125;
         var125 = (var21 | var22) - (var21 & var22);
      }

      int var13 = var125;
      if (var13 == 0 && GuiInput.a(var11 - 16.0F - 16.0F, var12, 8.0F, 8.0F, var5, var6)) {
         var125 = (int)6179885791312394390L;
         int var79 = -509190174;
         int var28 = var125;
         var125 = var28 + var79 - 2 * (var28 & var79);
         var79 = -1643190411;
         var28 = var125;
         var125 = (var28 | var79) - (var28 & var79);
      } else {
         int var77 = 2118646919;
         int var26 = 378484025;
         var125 = var26 & ~var77 | ~var26 & var77;
         var77 = 1757989310;
         var26 = var125;
         var125 = (var26 | var77) & (~var26 | ~var77);
      }

      int var14 = var125;
      if (var13 == 0 && GuiInput.a(var11 - 8.0F - 8.0F, var12, 8.0F, 8.0F, var5, var6)) {
         var125 = (int)8909413070339302780L;
         int var83 = -1933178994;
         int var32 = var125;
         var125 = (var32 | var83) - (var32 & var83);
         var83 = 839770867;
         var32 = var125;
         var125 = var32 + var83 - 2 * (var32 & var83);
      } else {
         int var81 = 212778214;
         int var30 = -443305723;
         var125 = var30 & ~var81 | ~var30 & var81;
         var81 = -381874717;
         var30 = var125;
         var125 = var30 & ~var81 | ~var30 & var81;
      }

      int var15 = var125;
      if (var13 == 0 && GuiInput.a(var11, var12, 8.0F, 8.0F, var5, var6)) {
         var125 = (int)-2165070885358319563L;
         int var87 = 208655272;
         int var36 = var125;
         var125 = var36 & ~var87 | ~var36 & var87;
         var87 = 952277916;
         var36 = var125;
         var125 = var36 & ~var87 | ~var36 & var87;
      } else {
         var125 = (int)2776463785295942123L;
         int var85 = -461008505;
         int var34 = var125;
         var125 = (var34 | var85) & (~var34 | ~var85);
         var85 = -758611860;
         var34 = var125;
         var125 = (var34 | var85) & (~var34 | ~var85);
      }

      int var16 = var125;
      this.a(this.o, pulse.Bool.from(var14), this.r, pulse.Bool.from(var13));
      int var141;
      if (var13 == 0 && var14 != 0) {
         int var91 = -1906183784;
         int var40 = -817131969;
         var141 = (var40 | var91) - (var40 & var91);
         var91 = 1093304230;
         var40 = var141;
         var141 = var40 + var91 - 2 * (var40 & var91);
      } else {
         int var89 = -1625219229;
         int var38 = 1540800197;
         var141 = var38 & ~var89 | ~var38 & var89;
         var89 = -990404186;
         var38 = var141;
         var141 = var38 & ~var89 | ~var38 & var89;
      }

      this.r = pulse.Bool.from(var141);
      this.a(this.p, pulse.Bool.from(var15), this.s, pulse.Bool.from(var13));
      if (var13 == 0 && var15 != 0) {
         var141 = (int)-8398384236608758018L;
         int var95 = -1723692944;
         int var44 = var141;
         var141 = (var44 | var95) & (~var44 | ~var95);
         var95 = 284382863;
         var44 = var141;
         var141 = var44 + var95 - 2 * (var44 & var95);
      } else {
         var141 = (int)-9033775100496917294L;
         int var93 = -1490140659;
         int var42 = var141;
         var141 = var42 & ~var93 | ~var42 & var93;
         var93 = 489852639;
         var42 = var141;
         var141 = (var42 | var93) - (var42 & var93);
      }

      this.s = pulse.Bool.from(var141);
      this.a(this.q, pulse.Bool.from(var16), this.t, pulse.Bool.from(var13));
      if (var13 == 0 && var16 != 0) {
         var141 = (int)5702388009167899486L;
         int var99 = -1861773269;
         int var48 = var141;
         var141 = var48 & ~var99 | ~var48 & var99;
         var99 = 417452916;
         var48 = var141;
         var141 = (var48 | var99) & ~(var48 & var99);
      } else {
         int var97 = 474413751;
         int var46 = 345834337;
         var141 = var46 + var97 - 2 * (var46 & var97);
         var97 = 148634070;
         var46 = var141;
         var141 = (var46 | var97) - (var46 & var97);
      }

      this.t = pulse.Bool.from(var141);
      float var10003 = var11 - 16.0F - 16.0F;
      float var10006 = (float)this.o.j();
      int var10009 = (int)6692400479388826723L;
      int var101 = 1764936947;
      int var50 = var10009;
      var10009 = (var50 | var101) & (~var50 | ~var101);
      var101 = 427333004;
      var50 = var10009;
      var10009 = (var50 | var101) & (~var50 | ~var101);
      var101 = 1331789019;
      var50 = -700793074;
      int var10010 = var50 & ~var101 | ~var50 & var101;
      var101 = -1804524856;
      var50 = var10010;
      var10010 = (var50 | var101) & (~var50 | ~var101);
      var101 = -479294698;
      var50 = -1426634898;
      int var10011 = (var50 | var101) - (var50 & var101);
      var101 = 1345921200;
      var50 = var10011;
      var10011 = (var50 | var101) & (~var50 | ~var101);
      int var10012 = (int)-1090352180391243305L;
      var101 = -529330048;
      var50 = var10012;
      var10012 = var50 + var101 - 2 * (var50 & var101);
      var101 = -405800132;
      var50 = var10012;
      this.a(
         var1,
         var2,
         var10003,
         var12,
         8.0F,
         var10006,
         b("\ue4eb뮙\ue4ee", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩謚㑲|ꟳ", var10009, var10010, var10011, (var50 | var101) & ~(var50 & var101))
      );
      var10003 = var11 - 8.0F - 8.0F;
      var10006 = (float)this.p.j();
      var101 = 834149869;
      var50 = -36216801;
      var10009 = (var50 | var101) - (var50 & var101);
      var101 = -2001020690;
      var50 = var10009;
      var10009 = var50 + var101 - 2 * (var50 & var101);
      var101 = 1277656207;
      var50 = 271015380;
      var10010 = (var50 | var101) - (var50 & var101);
      var101 = 1365544254;
      var50 = var10010;
      var10010 = (var50 | var101) & (~var50 | ~var101);
      var10011 = (int)-7900415478986730823L;
      var101 = -38139779;
      var50 = var10011;
      var10011 = (var50 | var101) - (var50 & var101);
      var101 = 940091028;
      var50 = var10011;
      var10011 = var50 + var101 - 2 * (var50 & var101);
      var10012 = (int)1285981717706976379L;
      var101 = -493779534;
      var50 = var10012;
      var10012 = (var50 | var101) - (var50 & var101);
      var101 = -314545030;
      var50 = var10012;
      this.a(
         var1,
         var2,
         var10003,
         var12,
         8.0F,
         var10006,
         b("\ue4f9葄\ue4fc葀", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩謚㑲|ꟳ", var10009, var10010, var10011, (var50 | var101) & (~var50 | ~var101))
      );
      var10006 = (float)this.q.j();
      var10009 = (int)4707681773284925007L;
      var101 = 1207270911;
      var50 = var10009;
      var10009 = var50 & ~var101 | ~var50 & var101;
      var101 = 1729775276;
      var50 = var10009;
      var10009 = (var50 | var101) & (~var50 | ~var101);
      var101 = -151078384;
      var50 = -138169486;
      var10010 = (var50 | var101) & ~(var50 & var101);
      var101 = 206540165;
      var50 = var10010;
      var10010 = (var50 | var101) & ~(var50 & var101);
      var101 = 757149238;
      var50 = 1543922690;
      var10011 = var50 & ~var101 | ~var50 & var101;
      var101 = 2070534087;
      var50 = var10011;
      var10011 = (var50 | var101) & (~var50 | ~var101);
      var10012 = (int)-2085914415120699286L;
      var101 = 1669633253;
      var50 = var10012;
      var10012 = var50 + var101 - 2 * (var50 & var101);
      var101 = 2097691322;
      var50 = var10012;
      this.a(
         var1,
         var2,
         var11,
         var12,
         8.0F,
         var10006,
         b("\ue4e1\udfc6\ue4f3", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩謚㑲|ꟳ", var10009, var10010, var10011, (var50 | var101) - (var50 & var101))
      );
      this.l.a(var1, var2, var9, var10, 117.5F, 15.0F, var5, var6);
      float var17 = var3 + 19.0F;
      float var18 = var4 + 48.0F;
      float var19 = var7 - 38.0F;
      float var20 = var8 - 48.0F - 9.5F;
      this.m.a(var1, var2, var17, var18, var19, var20 - 8.0F, var5, var6, 1.0F);
      this.n.a(var1, var2, var3, var4, var5, var6);
      if (var14 != 0 || var15 != 0 || var16 != 0) {
         GuiInput.g();
      }
   }

   private void a(AnimationState var1, boolean var2, boolean var3, boolean var4) {
      if (var4 && var3) {
         var1.a(0.0, 0.15, pulse.Easing.h);
      } else if (!var4 && var2 != var3) {
         var1.a(var2 ? 1.0 : 0.0, 0.15, pulse.Easing.h);
      }
   }

   private void a(MatrixStack var1, Renderer2D var2, float var3, float var4, float var5, float var6, String var7) {
      Color var8 = ColorUtils.a(pulse.Theme.b, pulse.Theme.d, var6);
      String var10 = var7;
      int var13 = 2119257575;
      int var12 = 872607329;
      int var10000 = (var12 | var13) & (~var12 | ~var13);
      var13 = -1246995335;
      var12 = var10000;
      int var11 = var12 & ~var13 | ~var12 & var13;
      switch (var10.hashCode()) {
         case 96417:
            int var145 = (int)1275521737846798016L;
            var13 = -129429979;
            var12 = var145;
            var145 = (var12 | var13) & ~(var12 & var13);
            var13 = -1959191047;
            var12 = var145;
            var145 = (var12 | var13) & ~(var12 & var13);
            int var159 = (int)-5681435126993199283L;
            var13 = 901311868;
            var12 = var159;
            var159 = (var12 | var13) & (~var12 | ~var13);
            var13 = -402229790;
            var12 = var159;
            var159 = (var12 | var13) & (~var12 | ~var13);
            var13 = 852704155;
            var12 = 1585301906;
            int var175 = (var12 | var13) & (~var12 | ~var13);
            var13 = 2083231548;
            var12 = var175;
            var175 = (var12 | var13) - (var12 & var13);
            int var183 = (int)5447331213544891704L;
            var13 = 170286051;
            var12 = var183;
            var183 = (var12 | var13) & (~var12 | ~var13);
            var13 = -1356852926;
            var12 = var183;
            if (var10.equals(b("ᙣ峣ᙦ", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩謚㑲|ꟳ", var145, var159, var175, (var12 | var13) & (~var12 | ~var13)))) {
               var10000 = (int)3225359188859667684L;
               var13 = -1345582886;
               var12 = var10000;
               var10000 = (var12 | var13) & (~var12 | ~var13);
               var13 = 1523174462;
               var12 = var10000;
               var11 = (var12 | var13) - (var12 & var13);
            }
            break;
         case 106079:
            var13 = -761508123;
            var12 = 605909225;
            int var143 = (var12 | var13) - (var12 & var13);
            var13 = -1303078128;
            var12 = var143;
            var143 = var12 & ~var13 | ~var12 & var13;
            int var156 = (int)6456847225233823820L;
            var13 = 60989414;
            var12 = var156;
            var156 = var12 & ~var13 | ~var12 & var13;
            var13 = 851618324;
            var12 = var156;
            var156 = (var12 | var13) & ~(var12 & var13);
            int var172 = (int)1519952906716655192L;
            var13 = -124637579;
            var12 = var172;
            var172 = var12 + var13 - 2 * (var12 & var13);
            var13 = 1103325674;
            var12 = var172;
            var172 = (var12 | var13) - (var12 & var13);
            var13 = 691618345;
            var12 = -1351932623;
            int var182 = (var12 | var13) & (~var12 | ~var13);
            var13 = -2040827236;
            var12 = var182;
            if (var10.equals(b("ᙩ\ua6ffᙻ", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩謚㑲|ꟳ", var143, var156, var172, var12 + var13 - 2 * (var12 & var13)))
               )
             {
               var13 = -1710695657;
               var12 = 1931258637;
               var10000 = var12 & ~var13 | ~var12 & var13;
               var13 = -384536552;
               var12 = var10000;
               var11 = var12 & ~var13 | ~var12 & var13;
            }
            break;
         case 3522941:
            var13 = 763754736;
            var12 = 16968307;
            int var10003 = (var12 | var13) - (var12 & var13);
            var13 = 1750251423;
            var12 = var10003;
            var10003 = var12 & ~var13 | ~var12 & var13;
            int var10004 = (int)1186859815452017136L;
            var13 = 1982468544;
            var12 = var10004;
            var10004 = (var12 | var13) & (~var12 | ~var13);
            var13 = -393682614;
            var12 = var10004;
            var10004 = (var12 | var13) - (var12 & var13);
            int var10005 = (int)4027646490765896982L;
            var13 = 268966264;
            var12 = var10005;
            var10005 = var12 + var13 - 2 * (var12 & var13);
            var13 = -1021978543;
            var12 = var10005;
            var10005 = (var12 | var13) - (var12 & var13);
            var13 = 933390722;
            var12 = -650047752;
            int var10006 = var12 + var13 - 2 * (var12 & var13);
            var13 = -287572422;
            var12 = var10006;
            if (var10.equals(b("ᙱ⨿ᙴ⨻", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩謚㑲|ꟳ", var10003, var10004, var10005, var12 & ~var13 | ~var12 & var13))) {
               var10000 = (int)-4794817214144079376L;
               var13 = -970491880;
               var12 = var10000;
               var10000 = var12 + var13 - 2 * (var12 & var13);
               var13 = 304407017;
               var12 = var10000;
               var11 = var12 & ~var13 | ~var12 & var13;
            }
      }

      String var9;
      switch (var11) {
         case 0:
            var13 = -1529378299;
            var12 = -2092046155;
            int var140 = (var12 | var13) & (~var12 | ~var13);
            var13 = 1666172844;
            var12 = var140;
            var140 = (var12 | var13) & (~var12 | ~var13);
            var13 = 1952912312;
            var12 = -1310584816;
            int var152 = (var12 | var13) & (~var12 | ~var13);
            var13 = -1727526700;
            var12 = var152;
            var152 = (var12 | var13) & (~var12 | ~var13);
            var13 = -1077588612;
            var12 = -795358475;
            int var168 = (var12 | var13) & (~var12 | ~var13);
            var13 = 1662094661;
            var12 = var168;
            var168 = (var12 | var13) - (var12 & var13);
            var13 = 271474501;
            var12 = 438728877;
            int var181 = (var12 | var13) & (~var12 | ~var13);
            var13 = 170300586;
            var12 = var181;
            var9 = b("＞", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩謚㑲|ꟳ", var140, var152, var168, var12 & ~var13 | ~var12 & var13);
            break;
         case 1:
            int var137 = (int)-5450147144436197012L;
            var13 = -461141850;
            var12 = var137;
            var137 = (var12 | var13) & (~var12 | ~var13);
            var13 = -99388202;
            var12 = var137;
            var137 = var12 + var13 - 2 * (var12 & var13);
            var13 = 2017683589;
            var12 = 806547391;
            int var150 = var12 + var13 - 2 * (var12 & var13);
            var13 = 339548695;
            var12 = var150;
            var150 = var12 + var13 - 2 * (var12 & var13);
            int var165 = (int)2771973219470829937L;
            var13 = 1616428704;
            var12 = var165;
            var165 = (var12 | var13) & (~var12 | ~var13);
            var13 = -1614649680;
            var12 = var165;
            var165 = (var12 | var13) & ~(var12 & var13);
            int var179 = (int)-1733683117322832981L;
            var13 = -998246731;
            var12 = var179;
            var179 = var12 & ~var13 | ~var12 & var13;
            var13 = 579912173;
            var12 = var179;
            var9 = b("Ｂ", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩謚㑲|ꟳ", var137, var150, var165, var12 & ~var13 | ~var12 & var13);
            break;
         case 2:
            int var10002 = (int)1921372441944648853L;
            var13 = 1182760223;
            var12 = var10002;
            var10002 = var12 & ~var13 | ~var12 & var13;
            var13 = 1509897366;
            var12 = var10002;
            var10002 = (var12 | var13) - (var12 & var13);
            var13 = -535847184;
            var12 = 1102485019;
            int var148 = var12 + var13 - 2 * (var12 & var13);
            var13 = -35161772;
            var12 = var148;
            var148 = (var12 | var13) - (var12 & var13);
            int var162 = (int)-2002589580255232190L;
            var13 = -475178068;
            var12 = var162;
            var162 = (var12 | var13) & ~(var12 & var13);
            var13 = -232153697;
            var12 = var162;
            var162 = var12 + var13 - 2 * (var12 & var13);
            int var177 = (int)7895591890059574657L;
            var13 = -1844954839;
            var12 = var177;
            var177 = (var12 | var13) & (~var12 | ~var13);
            var13 = 1484561709;
            var12 = var177;
            var9 = b("０", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩謚㑲|ꟳ", var10002, var148, var162, (var12 | var13) & ~(var12 & var13));
            break;
         default:
            return;
      }

      int var10001 = (int)-1013232308334587678L;
      var13 = 565955812;
      var12 = var10001;
      var10001 = (var12 | var13) & (~var12 | ~var13);
      var13 = 1535073288;
      var12 = var10001;
      FontRenderer var14 = FontManager.e[var12 + var13 - 2 * (var12 & var13)];
      var14.a(var9, var3, var4, var8, var1);
   }

   public void a(MatrixStack var1, Renderer2D var2) {
      float var3 = MinecraftContext.d.getWidth() / 2.0F;
      float var4 = MinecraftContext.d.getHeight() / 2.0F;
      this.m.a(var1, var2, var3, var4, this.i, this.j);
   }

   @Override
   public void a(float var1, float var2, int var3, int var4) {
      if (this.m.e()) {
         float var14 = pulse.PulseClickGuiScreen.d();
         float var15 = pulse.PulseClickGuiScreen.e();
         this.m.a(var1 + 19.0F, var2 + 48.0F, var14 - 38.0F, var15 - 48.0F - 9.5F - 8.0F, var3, var4);
      } else if (!this.l.a(var3, var4)) {
         this.k.a(var1, var2, var3, var4);
         float var5 = pulse.PulseClickGuiScreen.d();
         float var6 = pulse.PulseClickGuiScreen.e();
         float var7 = var1 + var5 - 19.0F - 117.5F;
         float var8 = var7 - 8.0F - 8.0F;
         float var9 = var2 + 19.0F + 3.5F - 3.0F;
         if (GuiInput.a(var8 - 16.0F - 16.0F, var9, 8.0F, 8.0F, var3, var4)) {
            this.k();
         } else if (GuiInput.a(var8 - 8.0F - 8.0F, var9, 8.0F, 8.0F, var3, var4)) {
            this.l();
         } else if (GuiInput.a(var8, var9, 8.0F, 8.0F, var3, var4)) {
            this.m();
         } else {
            float var10 = var1 + 19.0F;
            float var11 = var2 + 48.0F;
            float var12 = var5 - 38.0F;
            float var13 = var6 - 48.0F - 9.5F;
            this.m.a(var10, var11, var12, var13 - 8.0F, var3, var4);
         }
      }
   }

   private void k() {
      this.h();
   }

   private void l() {
      this.m.h();
   }

   private void m() {
      this.m.g();
   }

   @Override
   public void b(float var1, float var2, int var3, int var4) {
      this.a(var1, var2, var3, var4);
   }

   @Override
   public void c(float var1, float var2, int var3, int var4) {
      this.m.a(var3, var4);
   }

   @Override
   public void a(float var1, float var2, int var3, int var4, double var5, double var7) {
      this.m.a(var3, var4, var5, var7);
   }

   @Override
   public void a(float var1) {
      this.m.a(var1, this.i, this.j);
   }

   @Override
   public boolean a(int var1, int var2, int var3) {
      return this.l.c() ? this.l.a(var1, var2, var3) : this.m.a(var1, var2, var3);
   }

   @Override
   public boolean b() {
      int var10;
      if (!this.l.c() && !this.m.d()) {
         var10 = (int)-7194014354139958164L;
         int var7 = -1204868547;
         int var4 = var10;
         var10 = var4 + var7 - 2 * (var4 & var7);
         var7 = -1069408687;
         var4 = var10;
         var10 = (var4 | var7) - (var4 & var7);
      } else {
         var10 = (int)-7248176981413560304L;
         int var2 = 996137160;
         int var1 = var10;
         var10 = (var1 | var2) & (~var1 | ~var2);
         var2 = 586242265;
         var1 = var10;
         var10 = (var1 | var2) & (~var1 | ~var2);
      }

      return pulse.Bool.from(var10);
   }

   public boolean a(char var1, int var2) {
      return this.l.c() ? this.l.a(var1, var2) : this.m.a(var1, var2);
   }

   public boolean f() {
      return this.l.c();
   }

   public boolean g() {
      return this.m.e();
   }

   @Override
   public ClickGuiTabType a() {
      return ClickGuiTabType.CONFIGS;
   }

   private String a(String var1) {
      if (var1 == null) {
         int var250 = (int)-6168347384017858362L;
         int var225 = -1110295221;
         int var112 = var250;
         var250 = (var112 | var225) & ~(var112 & var225);
         var225 = -1251981167;
         var112 = var250;
         var250 = (var112 | var225) & (~var112 | ~var225);
         int var281 = (int)2297726624035812361L;
         var225 = 2133378908;
         var112 = var281;
         var281 = var112 + var225 - 2 * (var112 & var225);
         var225 = -1935548824;
         var112 = var281;
         var281 = var112 + var225 - 2 * (var112 & var225);
         int var311 = (int)-105259259592790503L;
         var225 = 1727111687;
         var112 = var311;
         var311 = (var112 | var225) & (~var112 | ~var225);
         var225 = -1868595672;
         var112 = var311;
         var311 = var112 & ~var225 | ~var112 & var225;
         var225 = -1806952177;
         var112 = -1020995558;
         int var338 = (var112 | var225) & (~var112 | ~var225);
         var225 = 1464556657;
         var112 = var338;
         return b(
            "쮼\uf3ec쾁\uf39a쮕\uf3e9쮚\uf3e7쯠\uf395쾁\uf3e6쮔\uf399쮔\uf3e3쮚\uf397쯦\uf3e1쯣\uf395쾁\uf3e3쮟\uf3e4쯥\uf3e1쮒\uf7f7",
            "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩謚㑲|ꟳ",
            var250,
            var281,
            var311,
            var112 + var225 - 2 * (var112 & var225)
         );
      }

      String var2 = var1;
      int var6 = -1795555346;
      int var5 = 861774311;
      int var10000 = (var5 | var6) & (~var5 | ~var6);
      var6 = 1482400246;
      var5 = var10000;
      int var3 = var5 + var6 - 2 * (var5 & var6);
      switch (var2.hashCode()) {
         case -1557786393:
            var6 = -599677316;
            var5 = 1420631844;
            int var260 = (var5 | var6) - (var5 & var6);
            var6 = -868672444;
            var5 = var260;
            var260 = (var5 | var6) & ~(var5 & var6);
            var6 = -795776092;
            var5 = 1036962252;
            int var290 = (var5 | var6) & (~var5 | ~var6);
            var6 = -831271650;
            var5 = var290;
            var290 = (var5 | var6) & (~var5 | ~var6);
            var6 = 1534252672;
            var5 = 1863687109;
            int var320 = (var5 | var6) & ~(var5 & var6);
            var6 = 818657385;
            var5 = var320;
            var320 = (var5 | var6) - (var5 & var6);
            var6 = -1286918976;
            var5 = 1384243550;
            int var342 = (var5 | var6) & (~var5 | ~var6);
            var6 = -504327677;
            var5 = var342;
            if (var2.equals(
               b("쿯㕏쿕㔀쿈㕎쿈㕔쿈㕁쿍㕉쿛㕅쿅", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩謚㑲|ꟳ", var260, var290, var320, (var5 | var6) & (~var5 | ~var6))
            )) {
               var6 = 865291446;
               var5 = -456765975;
               var10000 = (var5 | var6) - (var5 & var6);
               var6 = -682294946;
               var5 = var10000;
               var3 = (var5 | var6) - (var5 & var6);
            }
            break;
         case -1110739040:
            int var257 = (int)6814346664982111452L;
            var6 = -342820807;
            var5 = var257;
            var257 = (var5 | var6) - (var5 & var6);
            var6 = -1176159751;
            var5 = var257;
            var257 = var5 + var6 - 2 * (var5 & var6);
            var6 = 301760616;
            var5 = 639190724;
            int var288 = var5 + var6 - 2 * (var5 & var6);
            var6 = 354290086;
            var5 = var288;
            var288 = (var5 | var6) - (var5 & var6);
            var6 = -2107480687;
            var5 = 2047523129;
            int var318 = var5 & ~var6 | ~var5 & var6;
            var6 = -10000408;
            var5 = var318;
            var318 = (var5 | var6) & (~var5 | ~var6);
            var6 = 909927968;
            var5 = -604159629;
            int var341 = (var5 | var6) & ~(var5 & var6);
            var6 = -305620894;
            var5 = var341;
            if (var2.equals(b("쿯헣쾁헾쿄헿쿑헣쿏헿쿄", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩謚㑲|ꟳ", var257, var288, var318, (var5 | var6) & (~var5 | ~var6)))) {
               var6 = -1510134322;
               var5 = 1226613149;
               var10000 = var5 & ~var6 | ~var5 & var6;
               var6 = -320762800;
               var5 = var10000;
               var3 = (var5 | var6) & ~(var5 & var6);
            }
            break;
         case -532953636:
            int var254 = (int)4033857255992646552L;
            var6 = 1594888697;
            var5 = var254;
            var254 = (var5 | var6) - (var5 & var6);
            var6 = 1238855549;
            var5 = var254;
            var254 = var5 & ~var6 | ~var5 & var6;
            int var285 = (int)5424692280201441850L;
            var6 = 1075953824;
            var5 = var285;
            var285 = var5 & ~var6 | ~var5 & var6;
            var6 = 1513287335;
            var5 = var285;
            var285 = var5 & ~var6 | ~var5 & var6;
            var6 = 1051596862;
            var5 = 1663160108;
            int var316 = (var5 | var6) - (var5 & var6);
            var6 = 1358932033;
            var5 = var316;
            var316 = (var5 | var6) & ~(var5 & var6);
            var6 = -695225489;
            var5 = -809685387;
            int var340 = (var5 | var6) & (~var5 | ~var6);
            var6 = 419844478;
            var5 = var340;
            if (var2.equals(
               b("쿯ꚶ쿕\ua6f9쿂ꚶ쿏ꚷ쿄ꚺ쿕ꚼ쿅", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩謚㑲|ꟳ", var254, var285, var316, var5 + var6 - 2 * (var5 & var6))
            )) {
               var10000 = (int)-2574874492052635086L;
               var6 = -80758706;
               var5 = var10000;
               var10000 = (var5 | var6) - (var5 & var6);
               var6 = 1423096444;
               var5 = var10000;
               var3 = (var5 | var6) - (var5 & var6);
            }
            break;
         case 782165529:
            var6 = -1258428631;
            var5 = 633368166;
            int var10003 = (var5 | var6) & ~(var5 & var6);
            var6 = -706204589;
            var5 = var10003;
            var10003 = var5 + var6 - 2 * (var5 & var6);
            var6 = -902344678;
            var5 = -1729098166;
            int var10004 = var5 & ~var6 | ~var5 & var6;
            var6 = 1909519624;
            var5 = var10004;
            var10004 = (var5 | var6) & (~var5 | ~var6);
            int var10005 = (int)-4416777191885905595L;
            var6 = 162627147;
            var5 = var10005;
            var10005 = (var5 | var6) & ~(var5 & var6);
            var6 = -1909307930;
            var5 = var10005;
            var10005 = (var5 | var6) & (~var5 | ~var6);
            int var10006 = (int)-5130529635278218655L;
            var6 = -1456801578;
            var5 = var10006;
            var10006 = (var5 | var6) - (var5 & var6);
            var6 = 313522632;
            var5 = var10006;
            if (var2.equals(
               b(
                  "쿢\uf18d쿯\uf184쿨\uf185쿾\uf18c쿮\uf196쿾\uf184쿮\uf197쿯\uf186",
                  "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩謚㑲|ꟳ",
                  var10003,
                  var10004,
                  var10005,
                  (var5 | var6) - (var5 & var6)
               )
            )) {
               var10000 = (int)-7880357661338600507L;
               var6 = 177540211;
               var5 = var10000;
               var10000 = var5 & ~var6 | ~var5 & var6;
               var6 = 1987540916;
               var5 = var10000;
               var3 = (var5 | var6) & ~(var5 & var6);
            }
      }

      switch (var3) {
         case 0:
            var6 = 104038599;
            var5 = -1318410213;
            int var248 = var5 + var6 - 2 * (var5 & var6);
            var6 = -208892480;
            var5 = var248;
            var248 = (var5 | var6) - (var5 & var6);
            var6 = 2061205530;
            var5 = 1735678291;
            int var279 = var5 & ~var6 | ~var5 & var6;
            var6 = 1052715971;
            var5 = var279;
            var279 = (var5 | var6) & (~var5 | ~var6);
            var6 = -933803345;
            var5 = 47457992;
            int var309 = (var5 | var6) & ~(var5 & var6);
            var6 = -1000568110;
            var5 = var309;
            var309 = (var5 | var6) - (var5 & var6);
            var6 = -1544297578;
            var5 = -722764811;
            int var337 = var5 + var6 - 2 * (var5 & var6);
            var6 = 1996913362;
            var5 = var337;
            return b(
               "쮼谹쯣蠬쯠谲쮔谸쮙谱쮔谱쮙豃쾁豍쾁豍쮔豌쮓谹쯡谲쮝蠢쾁谓쯡谲쮓谹쯡豀쯣谹쾁谴쮜豎쮔豌쮜谹쯣蠡쮞谲쮕谶쮚豂쯦谹쮜谴쮔蠢",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩謚㑲|ꟳ",
               var248,
               var279,
               var309,
               (var5 | var6) & ~(var5 & var6)
            );
         case 1:
            var6 = -772243319;
            var5 = -851717165;
            int var246 = var5 & ~var6 | ~var5 & var6;
            var6 = 1477899846;
            var5 = var246;
            var246 = (var5 | var6) & ~(var5 & var6);
            var6 = -1282592314;
            var5 = 336407738;
            int var277 = (var5 | var6) - (var5 & var6);
            var6 = -2067698033;
            var5 = var277;
            var277 = var5 & ~var6 | ~var5 & var6;
            var6 = -1668623377;
            var5 = 585322032;
            int var307 = var5 & ~var6 | ~var5 & var6;
            var6 = -1137064278;
            var5 = var307;
            var307 = (var5 | var6) & ~(var5 & var6);
            int var335 = (int)-79255501501089291L;
            var6 = -417060788;
            var5 = var335;
            var335 = var5 & ~var6 | ~var5 & var6;
            var6 = 1977841059;
            var5 = var335;
            return b(
               "쮀\u0a92쯡ક쮙૦쾁ઝ쮟ચ쯥ટ쮒ઙ쮓ງ쮔૮쯰ງ쮜\u0a92쾁ટ쮜ટ쯧ટ쮑જ쮙ઐ쮙૧쮟ક쮑ચ쾏ງ쮾ઙ쮞૧쮟ખ쯢ઞ쯣\u0a92쾁ઘ쮟ઐ쮗\u0a92쾏",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩謚㑲|ꟳ",
               var246,
               var277,
               var307,
               (var5 | var6) - (var5 & var6)
            );
         case 2:
            int var243 = (int)2365025318960889134L;
            var6 = 2067583354;
            var5 = var243;
            var243 = (var5 | var6) & (~var5 | ~var6);
            var6 = 2057210184;
            var5 = var243;
            var243 = (var5 | var6) & ~(var5 & var6);
            int var274 = (int)5829072957867274528L;
            var6 = -2130194888;
            var5 = var274;
            var274 = (var5 | var6) & (~var5 | ~var6);
            var6 = 227682200;
            var5 = var274;
            var274 = (var5 | var6) - (var5 & var6);
            int var304 = (int)2554470833325530114L;
            var6 = -2044661691;
            var5 = var304;
            var304 = (var5 | var6) & ~(var5 & var6);
            var6 = -150644288;
            var5 = var304;
            var304 = var5 & ~var6 | ~var5 & var6;
            var6 = -434470323;
            var5 = 816712506;
            int var334 = (var5 | var6) & ~(var5 & var6);
            var6 = -695156272;
            var5 = var334;
            return b(
               "쮻☤쮜♞쮙☩쾁☧쮔∺쮜☪쮘☮쮔☧쾏∺쮳☤쮖☦쮟☬쮜☤쾍∺쮟☧쾁☫쯪☡쾁♙쮕☪쮚♋쮜∴",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩謚㑲|ꟳ",
               var243,
               var274,
               var304,
               (var5 | var6) & (~var5 | ~var6)
            );
         case 3:
            var6 = -282161705;
            var5 = -1013541034;
            int var241 = var5 + var6 - 2 * (var5 & var6);
            var6 = 1752022941;
            var5 = var241;
            var241 = (var5 | var6) - (var5 & var6);
            int var271 = (int)-215112871269605891L;
            var6 = 1235385294;
            var5 = var271;
            var271 = (var5 | var6) & ~(var5 & var6);
            var6 = -738351688;
            var5 = var271;
            var271 = var5 + var6 - 2 * (var5 & var6);
            var6 = -1773422311;
            var5 = 599500555;
            int var302 = (var5 | var6) & ~(var5 & var6);
            var6 = -1106954945;
            var5 = var302;
            var302 = (var5 | var6) & (~var5 | ~var6);
            int var332 = (int)9157607526301362372L;
            var6 = -1148856197;
            var5 = var332;
            var332 = var5 & ~var6 | ~var5 & var6;
            var6 = 372654861;
            var5 = var332;
            return b(
               "쮀ᴺ쯡ᴽ쮔ᵏ쾁ᴲ쮔\u192f쮟ᵍ쮓ᴺ쯦ᴿ쮔ᵍ쾏\u192f쮾ᴱ쮞ᵏ쮟ᴾ쯢ᴶ쯣ᴺ쾁ᴰ쮟ᴸ쮗ᴺ쾏",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩謚㑲|ꟳ",
               var241,
               var271,
               var302,
               (var5 | var6) & (~var5 | ~var6)
            );
         default:
            int var262 = (int)-6185586353150797250L;
            var6 = -2006485829;
            var5 = var262;
            var262 = (var5 | var6) & (~var5 | ~var6);
            var6 = -935097447;
            var5 = var262;
            var262 = var5 & ~var6 | ~var5 & var6;
            var6 = -2130146487;
            var5 = 1845642693;
            int var292 = (var5 | var6) & (~var5 | ~var6);
            var6 = -872351409;
            var5 = var292;
            var292 = (var5 | var6) & ~(var5 & var6);
            int var322 = (int)-2191858698725334637L;
            var6 = -1835740336;
            var5 = var322;
            var322 = (var5 | var6) & (~var5 | ~var6);
            var6 = -155853958;
            var5 = var322;
            var322 = (var5 | var6) - (var5 & var6);
            int var343 = (int)-7917710229171495466L;
            var6 = 99498077;
            var5 = var343;
            var343 = var5 + var6 - 2 * (var5 & var6);
            var6 = 372736609;
            var5 = var343;
            if (!var1.contains(b("쿕䴾쿌䴲쿎䴢쿕", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩謚㑲|ꟳ", var262, var292, var322, (var5 | var6) - (var5 & var6)))) {
               var6 = 278516545;
               var5 = 1735592253;
               var262 = var5 & ~var6 | ~var5 & var6;
               var6 = 859799392;
               var5 = var262;
               var262 = var5 & ~var6 | ~var5 & var6;
               var292 = (int)7275304839506637997L;
               var6 = 1676046272;
               var5 = var292;
               var292 = (var5 | var6) & ~(var5 & var6);
               var6 = -813278031;
               var5 = var292;
               var292 = var5 & ~var6 | ~var5 & var6;
               var322 = (int)-2916048548713302629L;
               var6 = 1019458025;
               var5 = var322;
               var322 = var5 + var6 - 2 * (var5 & var6);
               var6 = 1124348974;
               var5 = var322;
               var322 = (var5 | var6) & ~(var5 & var6);
               var343 = (int)-1679229180297074186L;
               var6 = -938275592;
               var5 = var343;
               var343 = (var5 | var6) - (var5 & var6);
               var6 = -740696819;
               var5 = var343;
               if (!var1.contains(b("쿵鋗쿌鋛쿎鋋쿕", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩謚㑲|ꟳ", var262, var292, var322, var5 + var6 - 2 * (var5 & var6)))
                  )
                {
                  String var4 = var1;
                  StringBuilder var239 = new StringBuilder();
                  var6 = -333508420;
                  var5 = 1323102891;
                  var262 = var5 + var6 - 2 * (var5 & var6);
                  var6 = -434747637;
                  var5 = var262;
                  var262 = var5 + var6 - 2 * (var5 & var6);
                  var292 = (int)1067201998229137969L;
                  var6 = 2085477945;
                  var5 = var292;
                  var292 = (var5 | var6) & ~(var5 & var6);
                  var6 = 1991828204;
                  var5 = var292;
                  var292 = (var5 | var6) & ~(var5 & var6);
                  var322 = (int)-7289460691611017135L;
                  var6 = -362193723;
                  var5 = var322;
                  var322 = var5 + var6 - 2 * (var5 & var6);
                  var6 = -1087607111;
                  var5 = var322;
                  var322 = (var5 | var6) & (~var5 | ~var6);
                  var343 = (int)-982264932167387791L;
                  var6 = 847860306;
                  var5 = var343;
                  var343 = (var5 | var6) - (var5 & var6);
                  var6 = -1470865368;
                  var5 = var343;
                  return var239.append(
                        b(
                           "쮼ꦃ쾁꧵쮕ꦆ쮚ꦈ쯠ꧺ쾁ꦉ쮔꧶쮔ꦌ쮚꧸쯦ꦎ쯣ꧺ쾁ꦌ쮟ꦋ쯥ꦎ쮒권쾁",
                           "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩謚㑲|ꟳ",
                           var262,
                           var292,
                           var322,
                           (var5 | var6) & (~var5 | ~var6)
                        )
                     )
                     .append(var4)
                     .toString();
               }
            }

            var6 = 283751866;
            var5 = -1562111502;
            int var10002 = var5 + var6 - 2 * (var5 & var6);
            var6 = -153616044;
            var5 = var10002;
            var10002 = (var5 | var6) & (~var5 | ~var6);
            var6 = -326173495;
            var5 = 394340424;
            var262 = (var5 | var6) & (~var5 | ~var6);
            var6 = -667105846;
            var5 = var262;
            var262 = (var5 | var6) & (~var5 | ~var6);
            var6 = -1896468479;
            var5 = -1504714777;
            var292 = (var5 | var6) - (var5 & var6);
            var6 = 558356836;
            var5 = var292;
            var292 = (var5 | var6) & (~var5 | ~var6);
            var6 = -1163809316;
            var5 = -848669868;
            var322 = var5 & ~var6 | ~var5 & var6;
            var6 = 2005598202;
            var5 = var322;
            return b(
               "쮾澏쮔濽쯪澇쮔濲쮟毯쮓澏쮔濳쯮毯쮟濹쮙濻쮑濲쮙澀쾏毯쮾澏쮟濽쮔澏쯭澍쮔毯쮙濲쯣濺쯡濲쮔澍쾌濰쮟濻쮛濴쯯澈쮔濲쮙濺쾏",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩謚㑲|ꟳ",
               var10002,
               var262,
               var292,
               var5 & ~var6 | ~var5 & var6
            );
      }
   }

   private String b(String var1) {
      if (var1 == null) {
         int var293 = (int)493000562060567215L;
         int var261 = -1343065581;
         int var130 = var293;
         var293 = (var130 | var261) & (~var130 | ~var261);
         var261 = -996674144;
         var130 = var293;
         var293 = (var130 | var261) & ~(var130 & var261);
         var261 = -641045504;
         var130 = -2025116012;
         int var326 = var130 & ~var261 | ~var130 & var261;
         var261 = 1068120210;
         var130 = var326;
         var326 = (var130 | var261) & (~var130 | ~var261);
         int var359 = (int)1065621885349810566L;
         var261 = -2040609418;
         var130 = var359;
         var359 = (var130 | var261) & (~var130 | ~var261);
         var261 = -512133467;
         var130 = var359;
         var359 = var130 + var261 - 2 * (var130 & var261);
         int var389 = (int)-4044166282682987605L;
         var261 = -360056346;
         var130 = var389;
         var389 = var130 & ~var261 | ~var130 & var261;
         var261 = -1231375351;
         var130 = var389;
         return b(
            "꾧쳗ꮚ첡꾎쳒꾁쳜꿻첮ꮚ첡꾎쳒꾁쳚꿸첮ꮚ쳘꾄쳟꿾쳚꾉죌",
            "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩謚㑲|ꟳ",
            var293,
            var326,
            var359,
            (var130 | var261) & (~var130 | ~var261)
         );
      }

      String var2 = var1;
      int var10000 = (int)-7382756612234923427L;
      int var6 = 970554833;
      int var5 = var10000;
      var10000 = var5 & ~var6 | ~var5 & var6;
      var6 = -827019149;
      var5 = var10000;
      int var3 = (var5 | var6) & (~var5 | ~var6);
      switch (var2.hashCode()) {
         case -1557786393:
            int var305 = (int)6812299844046206221L;
            var6 = -2022196215;
            var5 = var305;
            var305 = var5 + var6 - 2 * (var5 & var6);
            var6 = -1334793192;
            var5 = var305;
            var305 = (var5 | var6) - (var5 & var6);
            var6 = 1856480463;
            var5 = 203890038;
            int var337 = var5 & ~var6 | ~var5 & var6;
            var6 = 61942987;
            var5 = var337;
            var337 = (var5 | var6) - (var5 & var6);
            int var369 = (int)8348398496454510705L;
            var6 = 1595446878;
            var5 = var369;
            var369 = (var5 | var6) - (var5 & var6);
            var6 = 998223895;
            var5 = var369;
            var369 = var5 + var6 - 2 * (var5 & var6);
            int var396 = (int)7528973264123794661L;
            var6 = -1123209755;
            var5 = var396;
            var396 = (var5 | var6) & (~var5 | ~var6);
            var6 = -1635329872;
            var5 = var396;
            if (var2.equals(
               b(
                  "꯴\uef79ꯎ\uef36ꯓ\uef78ꯓ\uef62ꯓ\uef77ꯖ\uef7fꯀ\uef73ꯞ",
                  "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩謚㑲|ꟳ",
                  var305,
                  var337,
                  var369,
                  var5 + var6 - 2 * (var5 & var6)
               )
            )) {
               var10000 = (int)8781716479913227976L;
               var6 = -518953074;
               var5 = var10000;
               var10000 = (var5 | var6) & (~var5 | ~var6);
               var6 = -2038787769;
               var5 = var10000;
               var3 = (var5 | var6) & ~(var5 & var6);
            }
            break;
         case -1110739040:
            var6 = 2102426744;
            var5 = 1182576085;
            int var303 = (var5 | var6) & ~(var5 & var6);
            var6 = 2147054769;
            var5 = var303;
            var303 = var5 + var6 - 2 * (var5 & var6);
            var6 = -14282381;
            var5 = -385484535;
            int var335 = var5 + var6 - 2 * (var5 & var6);
            var6 = 1998500522;
            var5 = var335;
            var335 = (var5 | var6) - (var5 & var6);
            var6 = 2079458814;
            var5 = 1479406657;
            int var367 = var5 & ~var6 | ~var5 & var6;
            var6 = 629740945;
            var5 = var367;
            var367 = var5 + var6 - 2 * (var5 & var6);
            var6 = -1394913931;
            var5 = 1021132636;
            int var395 = var5 & ~var6 | ~var5 & var6;
            var6 = -1877813977;
            var5 = var395;
            if (var2.equals(
               b("꯴꧇ꮚ\ua9daꯟ\ua9dbꯊ꧇ꯔ\ua9dbꯟ", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩謚㑲|ꟳ", var303, var335, var367, (var5 | var6) & (~var5 | ~var6))
            )) {
               var10000 = (int)4961557273257148384L;
               var6 = 1930294226;
               var5 = var10000;
               var10000 = (var5 | var6) & (~var5 | ~var6);
               var6 = 103975990;
               var5 = var10000;
               var3 = (var5 | var6) & (~var5 | ~var6);
            }
            break;
         case -532953636:
            int var300 = (int)4366806711916276857L;
            var6 = -1164948320;
            var5 = var300;
            var300 = (var5 | var6) & ~(var5 & var6);
            var6 = -1932900923;
            var5 = var300;
            var300 = (var5 | var6) & (~var5 | ~var6);
            int var332 = (int)-7597039585264878681L;
            var6 = -1906827905;
            var5 = var332;
            var332 = (var5 | var6) & ~(var5 & var6);
            var6 = -1866227471;
            var5 = var332;
            var332 = var5 + var6 - 2 * (var5 & var6);
            var6 = 865502725;
            var5 = -887161392;
            int var365 = var5 & ~var6 | ~var5 & var6;
            var6 = -250424201;
            var5 = var365;
            var365 = var5 & ~var6 | ~var5 & var6;
            int var393 = (int)-8547321873990813532L;
            var6 = 747001343;
            var5 = var393;
            var393 = (var5 | var6) - (var5 & var6);
            var6 = -1554383044;
            var5 = var393;
            if (var2.equals(b("꯴岮ꯎ峡ꯙ岮ꯔ岯ꯟ岢ꯎ岤ꯞ", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩謚㑲|ꟳ", var300, var332, var365, var5 & ~var6 | ~var5 & var6))) {
               var6 = 361955108;
               var5 = -296926465;
               var10000 = (var5 | var6) - (var5 & var6);
               var6 = -69222949;
               var5 = var10000;
               var3 = (var5 | var6) & (~var5 | ~var6);
            }
            break;
         case 782165529:
            var6 = 890806022;
            var5 = -1844172949;
            int var298 = (var5 | var6) - (var5 & var6);
            var6 = -472310415;
            var5 = var298;
            var298 = var5 & ~var6 | ~var5 & var6;
            int var329 = (int)4911418790927244671L;
            var6 = 697948802;
            var5 = var329;
            var329 = (var5 | var6) & ~(var5 & var6);
            var6 = 278992821;
            var5 = var329;
            var329 = (var5 | var6) - (var5 & var6);
            var6 = 1048835791;
            var5 = -1488280791;
            int var363 = (var5 | var6) - (var5 & var6);
            var6 = -1652126495;
            var5 = var363;
            var363 = (var5 | var6) & (~var5 | ~var6);
            var6 = 469870051;
            var5 = 47573621;
            int var392 = (var5 | var6) & (~var5 | ~var6);
            var6 = 518050576;
            var5 = var392;
            if (var2.equals(
               b("꯹鉯꯴鉦꯳鉧ꯥ鉮꯵鉴ꯥ鉦꯵鉵꯴鉤", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩謚㑲|ꟳ", var298, var329, var363, (var5 | var6) - (var5 & var6))
            )) {
               var6 = 51935040;
               var5 = 2014443657;
               var10000 = (var5 | var6) & (~var5 | ~var6);
               var6 = 2064224202;
               var5 = var10000;
               var3 = var5 & ~var6 | ~var5 & var6;
            }
            break;
         case 1679399620:
            int var10003 = (int)507732353166560189L;
            var6 = 1816557931;
            var5 = var10003;
            var10003 = (var5 | var6) & ~(var5 & var6);
            var6 = -1075537974;
            var5 = var10003;
            var10003 = var5 & ~var6 | ~var5 & var6;
            var6 = -1530805151;
            var5 = 1553101141;
            int var10004 = (var5 | var6) & ~(var5 & var6);
            var6 = -1727022380;
            var5 = var10004;
            var10004 = (var5 | var6) & ~(var5 & var6);
            var6 = -1651102601;
            var5 = 416445979;
            int var10005 = var5 & ~var6 | ~var5 & var6;
            var6 = -2141366830;
            var5 = var10005;
            var10005 = (var5 | var6) - (var5 & var6);
            int var10006 = (int)322401160985624460L;
            var6 = -1287220852;
            var5 = var10006;
            var10006 = var5 + var6 - 2 * (var5 & var6);
            var6 = 1624076830;
            var5 = var10006;
            if (var2.equals(
               b(
                  "꯹務ꯔ勖ꯕ勌ꮚ勜ꯟ勔ꯟ勌ꯟ劘ꯛ勛ꯎ勑ꯌ勝ꮚ勛ꯕ勖ꯜ勑ꯝ",
                  "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩謚㑲|ꟳ",
                  var10003,
                  var10004,
                  var10005,
                  (var5 | var6) - (var5 & var6)
               )
            )) {
               var10000 = (int)6842220713699655332L;
               var6 = -1635497225;
               var5 = var10000;
               var10000 = (var5 | var6) & ~(var5 & var6);
               var6 = 1416066129;
               var5 = var10000;
               var3 = var5 & ~var6 | ~var5 & var6;
            }
      }

      switch (var3) {
         case 0:
            var6 = -1236430425;
            var5 = 1090530318;
            int var291 = (var5 | var6) & (~var5 | ~var6);
            var6 = -1281877835;
            var5 = var291;
            var291 = var5 + var6 - 2 * (var5 & var6);
            var6 = -367204992;
            var5 = 1329444919;
            int var324 = var5 & ~var6 | ~var5 & var6;
            var6 = -1005483142;
            var5 = var324;
            var324 = (var5 | var6) & ~(var5 & var6);
            var6 = 310057016;
            var5 = -1782994948;
            int var357 = (var5 | var6) & ~(var5 & var6);
            var6 = -2139511569;
            var5 = var357;
            var357 = (var5 | var6) - (var5 & var6);
            int var387 = (int)-5844739423976762843L;
            var6 = -1842885486;
            var5 = var387;
            var387 = (var5 | var6) - (var5 & var6);
            var6 = 2131443132;
            var5 = var387;
            return b(
               "꾧⦘꿸ⶍ꿻⦓꾏⦙꾂⦐꾏⦐꾂⧢ꮚ⧬ꮚ⧬꾏⧭꾈⦘꿺⦓꾆ⶃꮚ⦲꿺⦓꾈⦘꿺⧡꿸⦘ꮚ⦕꾇⧯꾏⧭꾇⦘꿸ⶀ꾅⦓꾎⦗꾁⧣꿽⦘꾇⦕꾏ⶃ",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩謚㑲|ꟳ",
               var291,
               var324,
               var357,
               var5 + var6 - 2 * (var5 & var6)
            );
         case 1:
            int var288 = (int)3070081155190603243L;
            var6 = -196845186;
            var5 = var288;
            var288 = (var5 | var6) - (var5 & var6);
            var6 = -565151351;
            var5 = var288;
            var288 = (var5 | var6) & (~var5 | ~var6);
            var6 = -1237421492;
            var5 = -75707230;
            int var322 = var5 & ~var6 | ~var5 & var6;
            var6 = 746272079;
            var5 = var322;
            var322 = (var5 | var6) & ~(var5 & var6);
            var6 = -1445405339;
            var5 = -6835164;
            int var355 = var5 & ~var6 | ~var5 & var6;
            var6 = 1348908852;
            var5 = var355;
            var355 = var5 + var6 - 2 * (var5 & var6);
            var6 = -1583567468;
            var5 = -1952029263;
            int var386 = (var5 | var6) - (var5 & var6);
            var6 = 707403770;
            var5 = var386;
            return b(
               "꾛\udd4c꿺\udd4b꾂\udd38ꮚ\udd43꾄\udd44꿾\udd41꾉\udd47꾈\ud959꾏\udd30꿫\ud959꾇\udd4cꮚ\udd41꾇\udd41꿼\udd41꾊\udd42꾂\udd4e꾂\udd39꾄\udd4b꾊\udd44ꮔ\ud959꾥\udd47꾅\udd39꾄\udd48꿹\udd40꿸\udd4cꮚ\udd46꾄\udd4e꾌\udd4cꮔ",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩謚㑲|ꟳ",
               var288,
               var322,
               var355,
               (var5 | var6) & (~var5 | ~var6)
            );
         case 2:
            var6 = 1124055906;
            var5 = -389773136;
            int var286 = (var5 | var6) & ~(var5 & var6);
            var6 = -286353714;
            var5 = var286;
            var286 = (var5 | var6) - (var5 & var6);
            var6 = 842175147;
            var5 = 984625558;
            int var320 = var5 + var6 - 2 * (var5 & var6);
            var6 = 1775646636;
            var5 = var320;
            var320 = var5 + var6 - 2 * (var5 & var6);
            var6 = -134201981;
            var5 = -1031265392;
            int var353 = (var5 | var6) - (var5 & var6);
            var6 = 812856971;
            var5 = var353;
            var353 = (var5 | var6) & (~var5 | ~var6);
            var6 = -1969128028;
            var5 = 800990831;
            int var385 = (var5 | var6) - (var5 & var6);
            var6 = -1523270908;
            var5 = var385;
            return b(
               "꾧\uea5c꾁\uea25꾍\uea26ꮚ\uea2a꾎\uea59꾁\uea51꿸\uea25ꮚ\uea59꾀\uea2b꾂\uea5b꾇\uea22꾃\uee49꾀\uea57꾇\uea2d꾂\uea5aꮔ\uee49꾛\uea54꾊\uea2e꾊\uea52꾊\uee49꾅\uea5c꿺\uea5c꾀\uea52꿴\uea2e꾂\uea2b꾏\uea28꿶\uee49꾇\uea59ꮚ\uea5d꿺\uea2a꾉\uea57꾃\uee47",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩謚㑲|ꟳ",
               var286,
               var320,
               var353,
               var5 + var6 - 2 * (var5 & var6)
            );
         case 3:
            var6 = -1622908293;
            var5 = -1590713242;
            int var284 = (var5 | var6) & ~(var5 & var6);
            var6 = 2059297537;
            var5 = var284;
            var284 = (var5 | var6) & ~(var5 & var6);
            var6 = -1513151113;
            var5 = 1361794724;
            int var318 = var5 + var6 - 2 * (var5 & var6);
            var6 = -1781653470;
            var5 = var318;
            var318 = (var5 | var6) & ~(var5 & var6);
            int var350 = (int)5242396701844703166L;
            var6 = 1690515695;
            var5 = var350;
            var350 = (var5 | var6) & (~var5 | ~var6);
            var6 = 427288416;
            var5 = var350;
            var350 = (var5 | var6) & (~var5 | ~var6);
            int var383 = (int)3271272019835421904L;
            var6 = 165063785;
            var5 = var383;
            var383 = (var5 | var6) & ~(var5 & var6);
            var6 = -132118378;
            var5 = var383;
            return b(
               "꾠ꪷ꾇\uaacd꾂ꪺꮚꪴ꾏꺩꾇ꪹ꾃ꪽ꾏ꪴꮔ꺩꾨ꪷ꾍ꪵ꾄꪿꾇ꪷꮖ꺩꾄ꪴꮚ\uaaca꾌ꪼꮚꪸ꿱ꪲꮚ\uaaca꾎ꪹ꾁\uaad8꾇꺧",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩謚㑲|ꟳ",
               var284,
               var318,
               var350,
               var5 + var6 - 2 * (var5 & var6)
            );
         case 4:
            int var281 = (int)1857789140771588924L;
            var6 = 1583044496;
            var5 = var281;
            var281 = (var5 | var6) - (var5 & var6);
            var6 = 1909078448;
            var5 = var281;
            var281 = (var5 | var6) - (var5 & var6);
            var6 = 1106274653;
            var5 = 240996233;
            int var316 = var5 + var6 - 2 * (var5 & var6);
            var6 = 786396406;
            var5 = var316;
            var316 = (var5 | var6) & (~var5 | ~var6);
            var6 = -184523062;
            var5 = -658331166;
            int var348 = var5 & ~var6 | ~var5 & var6;
            var6 = 767039165;
            var5 = var348;
            var348 = var5 & ~var6 | ~var5 & var6;
            int var381 = (int)4900291957347684997L;
            var6 = -91975075;
            var5 = var381;
            var381 = var5 + var6 - 2 * (var5 & var6);
            var6 = 2141494968;
            var5 = var381;
            return b(
               "꾛铳꿺铴꾏钆ꮚ铻꾏郦꾄钄꾈铳꿽银꾏钄ꮔ郦꾥铸꾅钆꾄铷꿹铿꿸铳ꮚ铹꾄铱꾌铳ꮔ",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩謚㑲|ꟳ",
               var281,
               var316,
               var348,
               var5 + var6 - 2 * (var5 & var6)
            );
         default:
            var6 = 1918890607;
            var5 = -1162928361;
            int var308 = (var5 | var6) & (~var5 | ~var6);
            var6 = -1943713692;
            var5 = var308;
            var308 = (var5 | var6) & (~var5 | ~var6);
            var6 = -866086577;
            var5 = 489002785;
            int var339 = (var5 | var6) - (var5 & var6);
            var6 = -1341645641;
            var5 = var339;
            var339 = (var5 | var6) & (~var5 | ~var6);
            int var372 = (int)-3812151454280133228L;
            var6 = 1433760747;
            var5 = var372;
            var372 = (var5 | var6) & ~(var5 & var6);
            var6 = 1830693596;
            var5 = var372;
            var372 = (var5 | var6) - (var5 & var6);
            int var398 = (int)8825172115809878516L;
            var6 = -516381601;
            var5 = var398;
            var398 = (var5 | var6) & (~var5 | ~var6);
            var6 = -174390596;
            var5 = var398;
            if (!var1.contains(b("ꯎ様ꯗ槔ꯕ槄ꯎ", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩謚㑲|ꟳ", var308, var339, var372, (var5 | var6) & ~(var5 & var6)))) {
               var6 = -310168130;
               var5 = 1260763769;
               var308 = (var5 | var6) & (~var5 | ~var6);
               var6 = -495768869;
               var5 = var308;
               var308 = (var5 | var6) & ~(var5 & var6);
               var6 = -1824017751;
               var5 = -1835825609;
               var339 = (var5 | var6) & (~var5 | ~var6);
               var6 = 1622832026;
               var5 = var339;
               var339 = (var5 | var6) & ~(var5 & var6);
               var372 = (int)-389046266035215749L;
               var6 = -398485702;
               var5 = var372;
               var372 = (var5 | var6) - (var5 & var6);
               var6 = -1658798573;
               var5 = var372;
               var372 = var5 & ~var6 | ~var5 & var6;
               var6 = 823953602;
               var5 = 262198618;
               var398 = (var5 | var6) - (var5 & var6);
               var6 = 1056558810;
               var5 = var398;
               if (!var1.contains(
                  b("\uabee鶍ꯗ鶁ꯕ鶑ꯎ", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩謚㑲|ꟳ", var308, var339, var372, (var5 | var6) & (~var5 | ~var6))
               )) {
                  String var4 = var1;
                  StringBuilder var278 = new StringBuilder();
                  var6 = -508668228;
                  var5 = -1475345433;
                  var308 = var5 + var6 - 2 * (var5 & var6);
                  var6 = 225177671;
                  var5 = var308;
                  var308 = var5 & ~var6 | ~var5 & var6;
                  var6 = 495733177;
                  var5 = 949482819;
                  var339 = (var5 | var6) & (~var5 | ~var6);
                  var6 = 1144348159;
                  var5 = var339;
                  var339 = (var5 | var6) - (var5 & var6);
                  var6 = -1298316694;
                  var5 = 578774986;
                  var372 = var5 & ~var6 | ~var5 & var6;
                  var6 = -1933690916;
                  var5 = var372;
                  var372 = (var5 | var6) & ~(var5 & var6);
                  var398 = (int)8272730716106017278L;
                  var6 = 1600331420;
                  var5 = var398;
                  var398 = var5 & ~var6 | ~var5 & var6;
                  var6 = 949189153;
                  var5 = var398;
                  return var278.append(
                        b(
                           "꾧⟐ꮚ➦꾎⟕꾁⟛꿻➩ꮚ➦꾎⟕꾁⟝꿸➩ꮚ⟟꾄⟘꿾⟝꾉⏟ꮚ",
                           "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩謚㑲|ꟳ",
                           var308,
                           var339,
                           var372,
                           (var5 | var6) & (~var5 | ~var6)
                        )
                     )
                     .append(var4)
                     .toString();
               }
            }

            int var10002 = (int)2000748131850589668L;
            var6 = 1204893545;
            var5 = var10002;
            var10002 = (var5 | var6) - (var5 & var6);
            var6 = 1358923665;
            var5 = var10002;
            var10002 = (var5 | var6) - (var5 & var6);
            var6 = -1839734917;
            var5 = -1449018425;
            var308 = (var5 | var6) - (var5 & var6);
            var6 = 1522395006;
            var5 = var308;
            var308 = (var5 | var6) & ~(var5 & var6);
            var339 = (int)4651729659426789577L;
            var6 = 948405107;
            var5 = var339;
            var339 = var5 + var6 - 2 * (var5 & var6);
            var6 = -1959387998;
            var5 = var339;
            var339 = var5 + var6 - 2 * (var5 & var6);
            var6 = -109145106;
            var5 = -39947270;
            var372 = var5 + var6 - 2 * (var5 & var6);
            var6 = 79835156;
            var5 = var372;
            return b(
               "꾥\udae6꾏\uda94꿱\udaee꾏\uda9b꾄\ude86꾈\udae6꾏\uda9a꿵\ude86꾄\uda90꾂\uda92꾊\uda9b꾂\udae9ꮔ\ude86꾥\udae6꾄\uda94꾏\udae6꿶\udae4꾏\ude86꾂\uda9b꿸\uda93꿺\uda9b꾏\udae4ꮗ\uda99꾄\uda92꾀\uda9d꿴\udae1꾏\uda9b꾂\uda93ꮔ",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩謚㑲|ꟳ",
               var10002,
               var308,
               var339,
               (var5 | var6) & (~var5 | ~var6)
            );
      }
   }

   private String c(String var1) {
      if (var1 == null) {
         int var390 = (int)7913234142692921456L;
         int var353 = 1215039888;
         int var176 = var390;
         var390 = (var176 | var353) & ~(var176 & var353);
         var353 = -552731396;
         var176 = var390;
         var390 = (var176 | var353) & ~(var176 & var353);
         int var441 = (int)-8181878616625361168L;
         var353 = -394917494;
         var176 = var441;
         var441 = (var176 | var353) - (var176 & var353);
         var353 = 274638628;
         var176 = var441;
         var441 = (var176 | var353) & (~var176 | ~var353);
         var353 = 1025579839;
         var176 = 1437730699;
         int var493 = (var176 | var353) & ~(var176 & var353);
         var353 = 1688808235;
         var176 = var493;
         var493 = (var176 | var353) & (~var176 | ~var353);
         var353 = 1825635485;
         var176 = 1672957912;
         int var533 = var176 + var353 - 2 * (var176 & var353);
         var353 = 256141578;
         var176 = var533;
         return b(
            "쇲뺉엏뻿쇛뺌쇔뺂솮뻰엏뺃쇚뻼쇚뺄쇓뺉쇒뺂쇝뺌솭뻰엏뺆쇑뺁솫뺄쇜몒",
            "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩謚㑲|ꟳ",
            var390,
            var441,
            var493,
            (var176 | var353) - (var176 & var353)
         );
      }

      String var2 = var1;
      int var6 = -1549205836;
      int var5 = -136302574;
      int var10000 = (var5 | var6) & ~(var5 & var6);
      var6 = -1414057639;
      var5 = var10000;
      int var3 = (var5 | var6) - (var5 & var6);
      switch (var2.hashCode()) {
         case -1557786393:
            int var410 = (int)-6084665102416271232L;
            var6 = -1412350607;
            var5 = var410;
            var410 = (var5 | var6) & (~var5 | ~var6);
            var6 = 642232557;
            var5 = var410;
            var410 = var5 & ~var6 | ~var5 & var6;
            int var462 = (int)2319716278706362336L;
            var6 = 654322684;
            var5 = var462;
            var462 = var5 + var6 - 2 * (var5 & var6);
            var6 = -125305284;
            var5 = var462;
            var462 = (var5 | var6) - (var5 & var6);
            var6 = 1377813524;
            var5 = -1032851628;
            int var513 = (var5 | var6) - (var5 & var6);
            var6 = -1729055156;
            var5 = var513;
            var513 = (var5 | var6) & ~(var5 & var6);
            var6 = 211564916;
            var5 = -1230266442;
            int var543 = (var5 | var6) & ~(var5 & var6);
            var6 = -1171301677;
            var5 = var543;
            if (var2.equals(b("얡鲍얛鳂얆鲌얆鲖얆鲃얃鲋얕鲇얋", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩謚㑲|ꟳ", var410, var462, var513, (var5 | var6) - (var5 & var6)))
               )
             {
               var6 = 275316384;
               var5 = 1726248244;
               var10000 = var5 & ~var6 | ~var5 & var6;
               var6 = 1988922261;
               var5 = var10000;
               var3 = var5 & ~var6 | ~var5 & var6;
            }
            break;
         case -1421100045:
            int var407 = (int)-2318475448380300406L;
            var6 = -336688045;
            var5 = var407;
            var407 = var5 + var6 - 2 * (var5 & var6);
            var6 = -1578579259;
            var5 = var407;
            var407 = (var5 | var6) & (~var5 | ~var6);
            var6 = -1352083434;
            var5 = -2117673806;
            int var460 = (var5 | var6) - (var5 & var6);
            var6 = -1294575798;
            var5 = var460;
            var460 = (var5 | var6) - (var5 & var6);
            int var510 = (int)1230084518291292879L;
            var6 = -778137621;
            var5 = var510;
            var510 = (var5 | var6) - (var5 & var6);
            var6 = -474668298;
            var5 = var510;
            var510 = var5 + var6 - 2 * (var5 & var6);
            var6 = -1602219303;
            var5 = 795654882;
            int var542 = var5 + var6 - 2 * (var5 & var6);
            var6 = -1879448092;
            var5 = var542;
            if (var2.equals(
               b(
                  "얦ⵢ얹\u2d6d얣ⵥ얫\u2d73얡\u2d6d얢\u2d69",
                  "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩謚㑲|ꟳ",
                  var407,
                  var460,
                  var510,
                  (var5 | var6) - (var5 & var6)
               )
            )) {
               var6 = -1810235487;
               var5 = 1986218978;
               var10000 = var5 + var6 - 2 * (var5 & var6);
               var6 = -495274939;
               var5 = var10000;
               var3 = var5 & ~var6 | ~var5 & var6;
            }
            break;
         case -1110739040:
            var6 = -1361193327;
            var5 = -553512268;
            int var405 = (var5 | var6) & ~(var5 & var6);
            var6 = 889872697;
            var5 = var405;
            var405 = var5 + var6 - 2 * (var5 & var6);
            int var457 = (int)-6966056975301048728L;
            var6 = 278993547;
            var5 = var457;
            var457 = var5 & ~var6 | ~var5 & var6;
            var6 = 977254774;
            var5 = var457;
            var457 = var5 & ~var6 | ~var5 & var6;
            int var507 = (int)-9051175733620557811L;
            var6 = -1225794865;
            var5 = var507;
            var507 = var5 + var6 - 2 * (var5 & var6);
            var6 = -1300881926;
            var5 = var507;
            var507 = (var5 | var6) - (var5 & var6);
            int var540 = (int)100626526968594413L;
            var6 = -2000593663;
            var5 = var540;
            var540 = (var5 | var6) - (var5 & var6);
            var6 = -2111832726;
            var5 = var540;
            if (var2.equals(b("얡缚엏缇얊缆얟缚얁缆얊", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩謚㑲|ꟳ", var405, var457, var507, (var5 | var6) - (var5 & var6)))) {
               var6 = 1336922570;
               var5 = -2123563674;
               var10000 = var5 & ~var6 | ~var5 & var6;
               var6 = -826069845;
               var5 = var10000;
               var3 = (var5 | var6) & (~var5 | ~var6);
            }
            break;
         case -1025179230:
            var6 = -1263443639;
            var5 = -727875968;
            int var403 = (var5 | var6) & (~var5 | ~var6);
            var6 = 620346069;
            var5 = var403;
            var403 = var5 & ~var6 | ~var5 & var6;
            int var454 = (int)1216253434419779159L;
            var6 = -133594574;
            var5 = var454;
            var454 = (var5 | var6) & ~(var5 & var6);
            var6 = -1611881598;
            var5 = var454;
            var454 = var5 & ~var6 | ~var5 & var6;
            var6 = 1678618702;
            var5 = 710136862;
            int var505 = (var5 | var6) & ~(var5 & var6);
            var6 = 1405625779;
            var5 = var505;
            var505 = var5 & ~var6 | ~var5 & var6;
            var6 = 1495210798;
            var5 = -2008652166;
            int var539 = var5 + var6 - 2 * (var5 & var6);
            var6 = -781464436;
            var5 = var539;
            if (var2.equals(
               b("얬텄얁텍얆테엏텊얃텙얊텊얋텒엏텎얗텂얜텟얜", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩謚㑲|ꟳ", var403, var454, var505, (var5 | var6) & (~var5 | ~var6))
            )) {
               var6 = -418114282;
               var5 = 857549646;
               var10000 = var5 + var6 - 2 * (var5 & var6);
               var6 = -737591716;
               var5 = var10000;
               var3 = var5 & ~var6 | ~var5 & var6;
            }
            break;
         case -532953636:
            int var400 = (int)-3473983757243371175L;
            var6 = 778602533;
            var5 = var400;
            var400 = var5 + var6 - 2 * (var5 & var6);
            var6 = -1464525728;
            var5 = var400;
            var400 = (var5 | var6) - (var5 & var6);
            int var451 = (int)7978290731680538017L;
            var6 = -1488678647;
            var5 = var451;
            var451 = var5 + var6 - 2 * (var5 & var6);
            var6 = 1805737560;
            var5 = var451;
            var451 = var5 + var6 - 2 * (var5 & var6);
            int var502 = (int)1492170421757151607L;
            var6 = 265232405;
            var5 = var502;
            var502 = var5 & ~var6 | ~var5 & var6;
            var6 = -1533147004;
            var5 = var502;
            var502 = (var5 | var6) & ~(var5 & var6);
            int var537 = (int)-1697251005036252376L;
            var6 = -681277485;
            var5 = var537;
            var537 = var5 & ~var6 | ~var5 & var6;
            var6 = -648939494;
            var5 = var537;
            if (var2.equals(b("얡걽얛갲얌걽얁걼얊걱얛걷얋", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩謚㑲|ꟳ", var400, var451, var502, (var5 | var6) & (~var5 | ~var6)))
               )
             {
               var6 = 380030101;
               var5 = -29965681;
               var10000 = (var5 | var6) & (~var5 | ~var6);
               var6 = -393212390;
               var5 = var10000;
               var3 = (var5 | var6) - (var5 & var6);
            }
            break;
         case 712150807:
            var6 = -2007908778;
            var5 = 581144781;
            int var398 = (var5 | var6) - (var5 & var6);
            var6 = -299398265;
            var5 = var398;
            var398 = var5 + var6 - 2 * (var5 & var6);
            int var448 = (int)4561309796260536044L;
            var6 = -1903935014;
            var5 = var448;
            var448 = var5 & ~var6 | ~var5 & var6;
            var6 = -695833317;
            var5 = var448;
            var448 = (var5 | var6) - (var5 & var6);
            int var499 = (int)-4828624381280368640L;
            var6 = 161574670;
            var5 = var499;
            var499 = var5 + var6 - 2 * (var5 & var6);
            var6 = 1356901433;
            var5 = var499;
            var499 = var5 + var6 - 2 * (var5 & var6);
            int var535 = (int)-842409924445097003L;
            var6 = 2107769486;
            var5 = var535;
            var535 = (var5 | var6) & (~var5 | ~var6);
            var6 = 1874124101;
            var5 = var535;
            if (var2.equals(
               b("얬ಌ얁ಃ얀ಙ엏ಟ얊ಃ얎ಀ얊್얎ಎ얛಄얙ಈ엏ಎ얀ಃ얉಄얈", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩謚㑲|ꟳ", var398, var448, var499, (var5 | var6) - (var5 & var6))
            )) {
               var6 = -1809168537;
               var5 = -728043571;
               var10000 = (var5 | var6) & ~(var5 & var6);
               var6 = 1085319336;
               var5 = var10000;
               var3 = (var5 | var6) - (var5 & var6);
            }
            break;
         case 782165529:
            int var395 = (int)-8828631525394514710L;
            var6 = -21915870;
            var5 = var395;
            var395 = var5 & ~var6 | ~var5 & var6;
            var6 = -428912940;
            var5 = var395;
            var395 = (var5 | var6) - (var5 & var6);
            int var445 = (int)-4631273863463864214L;
            var6 = -411341984;
            var5 = var445;
            var445 = (var5 | var6) & ~(var5 & var6);
            var6 = 360334582;
            var5 = var445;
            var445 = var5 & ~var6 | ~var5 & var6;
            var6 = 1924376305;
            var5 = -1399594322;
            int var497 = var5 + var6 - 2 * (var5 & var6);
            var6 = -549650225;
            var5 = var497;
            var497 = (var5 | var6) - (var5 & var6);
            var6 = 1090847541;
            var5 = 71012050;
            int var534 = (var5 | var6) & ~(var5 & var6);
            var6 = 1165351946;
            var5 = var534;
            if (var2.equals(
               b("얬ㅑ얡ㅘ얦ㅙ얰ㅐ얠ㅊ얰ㅘ얠ㅋ얡ㅚ", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩謚㑲|ꟳ", var395, var445, var497, (var5 | var6) - (var5 & var6))
            )) {
               var6 = 142779225;
               var5 = -355496652;
               var10000 = (var5 | var6) & ~(var5 & var6);
               var6 = -498258328;
               var5 = var10000;
               var3 = var5 + var6 - 2 * (var5 & var6);
            }
            break;
         case 996402675:
            int var10003 = (int)-5545314285028251048L;
            var6 = -665051845;
            var5 = var10003;
            var10003 = (var5 | var6) & (~var5 | ~var6);
            var6 = 1551127167;
            var5 = var10003;
            var10003 = var5 & ~var6 | ~var5 & var6;
            var6 = -383452388;
            var5 = -602455589;
            int var10004 = (var5 | var6) & (~var5 | ~var6);
            var6 = -1453625614;
            var5 = var10004;
            var10004 = (var5 | var6) & ~(var5 & var6);
            int var10005 = (int)5292238304186071692L;
            var6 = -489323999;
            var5 = var10005;
            var10005 = (var5 | var6) - (var5 & var6);
            var6 = 1357997513;
            var5 = var10005;
            var10005 = var5 + var6 - 2 * (var5 & var6);
            var6 = -487093647;
            var5 = -227154911;
            int var10006 = (var5 | var6) & (~var5 | ~var6);
            var6 = 277323894;
            var5 = var10006;
            if (var2.equals(
               b("얡꺔얢꺐얰꺁얮꺞얪꺛", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩謚㑲|ꟳ", var10003, var10004, var10005, (var5 | var6) & (~var5 | ~var6))
            )) {
               var10000 = (int)-266250056865910154L;
               var6 = 44415394;
               var5 = var10000;
               var10000 = var5 + var6 - 2 * (var5 & var6);
               var6 = -508441641;
               var5 = var10000;
               var3 = var5 + var6 - 2 * (var5 & var6);
            }
      }

      switch (var3) {
         case 0:
            var6 = 320008957;
            var5 = 688632236;
            int var388 = (var5 | var6) & ~(var5 & var6);
            var6 = 2127357517;
            var5 = var388;
            var388 = var5 & ~var6 | ~var5 & var6;
            int var438 = (int)3386999662119761705L;
            var6 = -1422348325;
            var5 = var438;
            var438 = (var5 | var6) & (~var5 | ~var6);
            var6 = 1413565477;
            var5 = var438;
            var438 = var5 & ~var6 | ~var5 & var6;
            var6 = 513670440;
            var5 = -327543537;
            int var491 = (var5 | var6) & ~(var5 & var6);
            var6 = -58801759;
            var5 = var491;
            var491 = (var5 | var6) & ~(var5 & var6);
            var6 = -2105562194;
            var5 = -1130793578;
            int var532 = (var5 | var6) & ~(var5 & var6);
            var6 = 1056706800;
            var5 = var532;
            return b(
               "쇲ꨎ솭긛솮ꨅ쇚ꨏ쇗ꨆ쇚ꨆ쇗ꩴ엏ꩺ엏ꩺ쇚ꩻ쇝ꨎ솯ꨅ쇓긕엏ꨤ솯ꨅ쇝ꨎ솯꩷솭ꨎ엏ꨃ쇒꩹쇚ꩻ쇒ꨎ솭긖쇐ꨅ쇛ꨁ쇔ꩵ솨ꨎ쇒ꨃ쇚긕",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩謚㑲|ꟳ",
               var388,
               var438,
               var491,
               var5 & ~var6 | ~var5 & var6
            );
         case 1:
            int var385 = (int)1251226301892363443L;
            var6 = -1950691520;
            var5 = var385;
            var385 = var5 & ~var6 | ~var5 & var6;
            var6 = -159060241;
            var5 = var385;
            var385 = (var5 | var6) - (var5 & var6);
            var6 = -1083562995;
            var5 = 429472342;
            int var436 = (var5 | var6) & (~var5 | ~var6);
            var6 = 978922575;
            var5 = var436;
            var436 = (var5 | var6) & (~var5 | ~var6);
            int var488 = (int)-7411269204074486462L;
            var6 = -469990542;
            var5 = var488;
            var488 = var5 & ~var6 | ~var5 & var6;
            var6 = 112701506;
            var5 = var488;
            var488 = (var5 | var6) & ~(var5 & var6);
            int var530 = (int)-2610774815753825061L;
            var6 = -719044578;
            var5 = var530;
            var530 = var5 + var6 - 2 * (var5 & var6);
            var6 = -485066560;
            var5 = var530;
            return b(
               "쇎䣃솯䣄쇗䢷엏䣌쇑䣋솫䣎쇜䣈쇝䳖쇚䢿솾䳖쇒䣃엏䣎쇒䣎솩䣎쇟䣍쇗䣁쇗䢶쇑䣄쇟䣋엁䳖쇰䣈쇐䢶쇑䣇솬䣏솭䣃엏䣉쇑䣁쇙䣃엁",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩謚㑲|ꟳ",
               var385,
               var436,
               var488,
               var5 & ~var6 | ~var5 & var6
            );
         case 2:
            int var382 = (int)8592335708731216739L;
            var6 = 1392785534;
            var5 = var382;
            var382 = var5 + var6 - 2 * (var5 & var6);
            var6 = -1710911999;
            var5 = var382;
            var382 = (var5 | var6) - (var5 & var6);
            int var433 = (int)-6358971037193865388L;
            var6 = 931749248;
            var5 = var433;
            var433 = var5 + var6 - 2 * (var5 & var6);
            var6 = -990704185;
            var5 = var433;
            var433 = var5 & ~var6 | ~var5 & var6;
            int var485 = (int)-5871954103589378176L;
            var6 = 405783879;
            var5 = var485;
            var485 = var5 & ~var6 | ~var5 & var6;
            var6 = -1792302266;
            var5 = var485;
            var485 = (var5 | var6) & ~(var5 & var6);
            var6 = -708428747;
            var5 = 1822002192;
            int var529 = var5 & ~var6 | ~var5 & var6;
            var6 = -1186131679;
            var5 = var529;
            return b(
               "쇲엂쇔얻쇘언엏었쇚얷쇚엏쇓엂쇒엉쇝엇솭얻엏엇쇕억쇗업쇒얼쇖쇗쇕엉쇒얳쇗엄엁쇗쇎엊쇟얰쇟엌쇟쇗쇐엂솯엂쇕엌송얰쇗억쇚얶솣쇗쇒엇엏엃솯어쇜엉쇖쇙",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩謚㑲|ꟳ",
               var382,
               var433,
               var485,
               (var5 | var6) & (~var5 | ~var6)
            );
         case 3:
         case 4:
            var6 = 1973601795;
            var5 = 870676165;
            int var380 = (var5 | var6) & (~var5 | ~var6);
            var6 = 43128282;
            var5 = var380;
            var380 = (var5 | var6) - (var5 & var6);
            int var430 = (int)-1067937846595941607L;
            var6 = -1185827099;
            var5 = var430;
            var430 = (var5 | var6) & (~var5 | ~var6);
            var6 = -293312733;
            var5 = var430;
            var430 = (var5 | var6) & (~var5 | ~var6);
            var6 = -257418257;
            var5 = -764760397;
            int var483 = (var5 | var6) - (var5 & var6);
            var6 = 659513464;
            var5 = var483;
            var483 = (var5 | var6) - (var5 & var6);
            var6 = 1750211941;
            var5 = -680653845;
            int var528 = var5 & ~var6 | ~var5 & var6;
            var6 = -1090338210;
            var5 = var528;
            return b(
               "쇵뀝쇒끧쇗뀐엏끢엏끡쇟뀙쇗뀟엏뀛쇓뀖쇒뀖쇓됃솬뀕쇚됃솮끠솦뀖솮끡쇝끠쇚끡엁",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩謚㑲|ꟳ",
               var380,
               var430,
               var483,
               var5 + var6 - 2 * (var5 & var6)
            );
         case 5:
            var6 = -236866249;
            var5 = 659557978;
            int var378 = var5 & ~var6 | ~var5 & var6;
            var6 = -1838932367;
            var5 = var378;
            var378 = (var5 | var6) & ~(var5 & var6);
            var6 = 833440806;
            var5 = 1417604094;
            int var428 = var5 & ~var6 | ~var5 & var6;
            var6 = -105344073;
            var5 = var428;
            var428 = (var5 | var6) & (~var5 | ~var6);
            int var480 = (int)3453228827653659103L;
            var6 = -158310200;
            var5 = var480;
            var480 = (var5 | var6) & (~var5 | ~var6);
            var6 = 1279000173;
            var5 = var480;
            var480 = (var5 | var6) & ~(var5 & var6);
            int var526 = (int)8465375448244055804L;
            var6 = -1191629750;
            var5 = var526;
            var526 = (var5 | var6) & (~var5 | ~var6);
            var6 = -635999018;
            var5 = var526;
            return b(
               "쇵䪭쇒䫗쇗䪠엏䪮쇚亳쇒䪣쇖䪧쇚䪮엁亳쇽䪭쇘䪯쇑䪥쇒䪭엃亳쇑䪮엏䪢솤䪨엏䫐쇛䪣쇔䫂쇒亽",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩謚㑲|ꟳ",
               var378,
               var428,
               var480,
               var5 & ~var6 | ~var5 & var6
            );
         case 6:
            int var375 = (int)-618237764769830349L;
            var6 = 1706756406;
            var5 = var375;
            var375 = var5 & ~var6 | ~var5 & var6;
            var6 = 1833371161;
            var5 = var375;
            var375 = var5 & ~var6 | ~var5 & var6;
            int var425 = (int)7744967536629336626L;
            var6 = -1592551638;
            var5 = var425;
            var425 = (var5 | var6) & (~var5 | ~var6);
            var6 = -1675330618;
            var5 = var425;
            var425 = var5 + var6 - 2 * (var5 & var6);
            var6 = -644314058;
            var5 = -280113683;
            int var478 = var5 & ~var6 | ~var5 & var6;
            var6 = 974253684;
            var5 = var478;
            var478 = (var5 | var6) & ~(var5 & var6);
            var6 = -1720957949;
            var5 = 175651090;
            int var525 = (var5 | var6) & ~(var5 & var6);
            var6 = -1824530978;
            var5 = var525;
            return b(
               "쇲쐉쇛쐂쇐쑿솮쑾쇗쐀쇑쐉엏쐄쇓쑳엏쐆쇑쐁솫쐄쇜쐌엁쀜쇷쑽쇐쐂쇔쑰쇘쑿쇖쑾쇚쀜솭쐂쇔쑰쇕쐂엏쐍솬쐆쇝쑷엃쀜솩쐄솫쑼솤쀜쇗쀜쇐쑼쇑쐍쇚쐇솤쀒",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩謚㑲|ꟳ",
               var375,
               var425,
               var478,
               (var5 | var6) & ~(var5 & var6)
            );
         case 7:
            int var372 = (int)2718245370387003139L;
            var6 = -323713048;
            var5 = var372;
            var372 = var5 + var6 - 2 * (var5 & var6);
            var6 = -1708829193;
            var5 = var372;
            var372 = (var5 | var6) - (var5 & var6);
            int var422 = (int)-7748741141147549073L;
            var6 = 1774670287;
            var5 = var422;
            var422 = var5 & ~var6 | ~var5 & var6;
            var6 = 1825744702;
            var5 = var422;
            var422 = var5 & ~var6 | ~var5 & var6;
            int var475 = (int)-5275809070116066095L;
            var6 = -1721791771;
            var5 = var475;
            var475 = (var5 | var6) & ~(var5 & var6);
            var6 = -139426890;
            var5 = var475;
            var475 = (var5 | var6) & (~var5 | ~var6);
            var6 = -176046761;
            var5 = 1283066005;
            int var524 = var5 + var6 - 2 * (var5 & var6);
            var6 = -1174447283;
            var5 = var524;
            return b(
               "쇎詉솯詎쇚証엏詁쇚蹜쇑訾쇝詉솨詌쇚訾엁蹜쇰詂쇐証쇑詍솬詅솭詉엏詃쇑詋쇙詉엁",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩謚㑲|ꟳ",
               var372,
               var422,
               var475,
               (var5 | var6) & ~(var5 & var6)
            );
         default:
            int var413 = (int)-2281641417296522303L;
            var6 = 1290035939;
            var5 = var413;
            var413 = var5 & ~var6 | ~var5 & var6;
            var6 = 822678590;
            var5 = var413;
            var413 = var5 + var6 - 2 * (var5 & var6);
            int var465 = (int)-4321799570672645658L;
            var6 = 522314068;
            var5 = var465;
            var465 = var5 & ~var6 | ~var5 & var6;
            var6 = -1272924493;
            var5 = var465;
            var465 = var5 & ~var6 | ~var5 & var6;
            int var515 = (int)-805469709767242018L;
            var6 = 1017954172;
            var5 = var515;
            var515 = (var5 | var6) & (~var5 | ~var6);
            var6 = 540660324;
            var5 = var515;
            var515 = (var5 | var6) & (~var5 | ~var6);
            int var544 = (int)774769163982953212L;
            var6 = -1276081933;
            var5 = var544;
            var544 = var5 & ~var6 | ~var5 & var6;
            var6 = -1846901251;
            var5 = var544;
            if (!var1.contains(b("얛㝨얂㝤얀㝴얛", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩謚㑲|ꟳ", var413, var465, var515, (var5 | var6) - (var5 & var6)))) {
               var6 = 924063222;
               var5 = 1005115412;
               var413 = (var5 | var6) & ~(var5 & var6);
               var6 = 1210673406;
               var5 = var413;
               var413 = (var5 | var6) & (~var5 | ~var6);
               var6 = -1955037045;
               var5 = -623480658;
               var465 = var5 + var6 - 2 * (var5 & var6);
               var6 = -853027114;
               var5 = var465;
               var465 = (var5 | var6) - (var5 & var6);
               var6 = 1454434875;
               var5 = 1070397133;
               var515 = var5 + var6 - 2 * (var5 & var6);
               var6 = 1636451750;
               var5 = var515;
               var515 = (var5 | var6) & ~(var5 & var6);
               var544 = (int)6307002584341259021L;
               var6 = -1888515168;
               var5 = var544;
               var544 = var5 & ~var6 | ~var5 & var6;
               var6 = -1301804983;
               var5 = var544;
               if (!var1.contains(b("얻䁾얂䁲얀䁢얛", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩謚㑲|ꟳ", var413, var465, var515, var5 + var6 - 2 * (var5 & var6)))
                  )
                {
                  String var4 = var1;
                  StringBuilder var370 = new StringBuilder();
                  var6 = 1493861940;
                  var5 = 2114320000;
                  var413 = (var5 | var6) - (var5 & var6);
                  var6 = 1675285928;
                  var5 = var413;
                  var413 = (var5 | var6) & (~var5 | ~var6);
                  var465 = (int)-839158625484247120L;
                  var6 = 1717015163;
                  var5 = var465;
                  var465 = var5 + var6 - 2 * (var5 & var6);
                  var6 = -486015116;
                  var5 = var465;
                  var465 = var5 & ~var6 | ~var5 & var6;
                  var6 = -1184332860;
                  var5 = 815055193;
                  var515 = (var5 | var6) & ~(var5 & var6);
                  var6 = -1919993421;
                  var5 = var515;
                  var515 = (var5 | var6) & (~var5 | ~var6);
                  var6 = -1722966282;
                  var5 = -1841385486;
                  var544 = (var5 | var6) & ~(var5 & var6);
                  var6 = 189386164;
                  var5 = var544;
                  return var370.append(
                        b(
                           "쇲顶엏頀쇛顳쇔顽솮頏엏顼쇚頃쇚须쇓顶쇒顽쇝顳솭頏엏项쇑顾솫须쇜鱹엏",
                           "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩謚㑲|ꟳ",
                           var413,
                           var465,
                           var515,
                           (var5 | var6) & ~(var5 & var6)
                        )
                     )
                     .append(var4)
                     .toString();
               }
            }

            var6 = -1615986948;
            var5 = 502025518;
            int var10002 = var5 & ~var6 | ~var5 & var6;
            var6 = -963373362;
            var5 = var10002;
            var10002 = (var5 | var6) - (var5 & var6);
            var6 = -376289898;
            var5 = 238589672;
            var413 = var5 + var6 - 2 * (var5 & var6);
            var6 = 2077368714;
            var5 = var413;
            var413 = (var5 | var6) & ~(var5 & var6);
            var6 = -1916582247;
            var5 = 1535607197;
            var465 = (var5 | var6) - (var5 & var6);
            var6 = -690205528;
            var5 = var465;
            var465 = (var5 | var6) - (var5 & var6);
            var515 = (int)-1789277495839638126L;
            var6 = -1288201591;
            var5 = var515;
            var515 = (var5 | var6) & ~(var5 & var6);
            var6 = 1153616894;
            var5 = var515;
            return b(
               "쇰衖쇚蠤솤衞쇚蠫쇑谶쇝衖쇚蠪솠谶쇑蠠쇗蠢쇟蠫쇗衙엁谶쇰衖쇑蠤쇚衖솣衔쇚谶쇗蠫솭蠣솯蠫쇚衔엂蠩쇑蠢쇕蠭송衑쇚蠫쇗蠣엁",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩謚㑲|ꟳ",
               var10002,
               var413,
               var465,
               (var5 | var6) & ~(var5 & var6)
            );
      }
   }

   private String d(String var1) {
      if (var1 == null) {
         int var333 = -241912362;
         int var166 = 1918871701;
         int var373 = var166 + var333 - 2 * (var166 & var333);
         var333 = -954288033;
         var166 = var373;
         var373 = (var166 | var333) - (var166 & var333);
         int var421 = (int)-3516759296942784485L;
         var333 = -1832612598;
         var166 = var421;
         var421 = (var166 | var333) & ~(var166 & var333);
         var333 = 1162505772;
         var166 = var421;
         var421 = (var166 | var333) & (~var166 | ~var333);
         int var467 = (int)-8921907289517689208L;
         var333 = 459141784;
         var166 = var467;
         var467 = (var166 | var333) & (~var166 | ~var333);
         var333 = 577858876;
         var166 = var467;
         var467 = var166 + var333 - 2 * (var166 & var333);
         int var504 = (int)-4830478423167859755L;
         var333 = 465660331;
         var166 = var504;
         var504 = var166 + var333 - 2 * (var166 & var333);
         var333 = -2010985902;
         var166 = var504;
         return b(
            "ﳴ溺\uf8c9連ﳝ里ﳒ裏ﲨ秊\uf8c9輦ﳗ燐ﳝ里ﲫ秊\uf8c9泥ﳗ理ﲭ李ﳚﷷ",
            "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩謚㑲|ꟳ",
            var373,
            var421,
            var467,
            var166 + var333 - 2 * (var166 & var333)
         );
      }

      String var2 = var1;
      int var10000 = (int)7772908313112557629L;
      int var6 = 241630933;
      int var5 = var10000;
      var10000 = var5 & ~var6 | ~var5 & var6;
      var6 = 1800943895;
      var5 = var10000;
      int var3 = (var5 | var6) & ~(var5 & var6);
      switch (var2.hashCode()) {
         case -1557786393:
            int var388 = (int)3325790498071510063L;
            var6 = -199888952;
            var5 = var388;
            var388 = var5 + var6 - 2 * (var5 & var6);
            var6 = -500451589;
            var5 = var388;
            var388 = var5 + var6 - 2 * (var5 & var6);
            int var435 = (int)-3251097097542128762L;
            var6 = 984317789;
            var5 = var435;
            var435 = (var5 | var6) & (~var5 | ~var6);
            var6 = -1901733885;
            var5 = var435;
            var435 = var5 + var6 - 2 * (var5 & var6);
            int var483 = (int)4699376304650416767L;
            var6 = 1855998444;
            var5 = var483;
            var483 = var5 & ~var6 | ~var5 & var6;
            var6 = -1339871143;
            var5 = var483;
            var483 = var5 & ~var6 | ~var5 & var6;
            var6 = -153893086;
            var5 = 1138590971;
            int var515 = (var5 | var6) - (var5 & var6);
            var6 = -1255192034;
            var5 = var515;
            if (var2.equals(
               b(
                  "\uf8a7呝\uf89d吒\uf880呜\uf880呆\uf880呓\uf885呛\uf893呗\uf88d",
                  "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩謚㑲|ꟳ",
                  var388,
                  var435,
                  var483,
                  var5 + var6 - 2 * (var5 & var6)
               )
            )) {
               var10000 = (int)-8948775423029076702L;
               var6 = 980682857;
               var5 = var10000;
               var10000 = (var5 | var6) & ~(var5 & var6);
               var6 = 1844385098;
               var5 = var10000;
               var3 = var5 + var6 - 2 * (var5 & var6);
            }
            break;
         case -1421100045:
            var6 = 478511092;
            var5 = -807800375;
            int var386 = (var5 | var6) & ~(var5 & var6);
            var6 = -1752618207;
            var5 = var386;
            var386 = var5 & ~var6 | ~var5 & var6;
            var6 = -1897567095;
            var5 = -1279041308;
            int var433 = (var5 | var6) & ~(var5 & var6);
            var6 = -1144014711;
            var5 = var433;
            var433 = var5 & ~var6 | ~var5 & var6;
            var6 = 275640407;
            var5 = 1091992381;
            int var481 = var5 + var6 - 2 * (var5 & var6);
            var6 = 1203915723;
            var5 = var481;
            var481 = (var5 | var6) & (~var5 | ~var6);
            var6 = 412342239;
            var5 = -1538462970;
            int var514 = (var5 | var6) & ~(var5 & var6);
            var6 = -1131311862;
            var5 = var514;
            if (var2.equals(
               b(
                  "\uf8a0\uec68\uf8bf\uec67\uf8a5\uec6f\uf8ad\uec79\uf8a7\uec67\uf8a4\uec63",
                  "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩謚㑲|ꟳ",
                  var386,
                  var433,
                  var481,
                  (var5 | var6) & ~(var5 & var6)
               )
            )) {
               var10000 = (int)-7057171934688215259L;
               var6 = 1218899930;
               var5 = var10000;
               var10000 = var5 + var6 - 2 * (var5 & var6);
               var6 = 1521193210;
               var5 = var10000;
               var3 = (var5 | var6) & (~var5 | ~var6);
            }
            break;
         case -1110739040:
            var6 = -197785657;
            var5 = 458562845;
            int var384 = var5 & ~var6 | ~var5 & var6;
            var6 = -1414086714;
            var5 = var384;
            var384 = var5 & ~var6 | ~var5 & var6;
            var6 = 942419382;
            var5 = 1726693117;
            int var431 = var5 + var6 - 2 * (var5 & var6);
            var6 = -664082039;
            var5 = var431;
            var431 = (var5 | var6) & ~(var5 & var6);
            var6 = -72432133;
            var5 = 1435857066;
            int var479 = (var5 | var6) - (var5 & var6);
            var6 = -1433438674;
            var5 = var479;
            var479 = var5 + var6 - 2 * (var5 & var6);
            int var512 = (int)9200573341010378776L;
            var6 = 1298017477;
            var5 = var512;
            var512 = (var5 | var6) - (var5 & var6);
            var6 = -1248421012;
            var5 = var512;
            if (var2.equals(
               b(
                  "\uf8a7ꨫ\uf8c9ꨶ\uf88c\uaa37\uf899ꨫ\uf887\uaa37\uf88c",
                  "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩謚㑲|ꟳ",
                  var384,
                  var431,
                  var479,
                  (var5 | var6) & ~(var5 & var6)
               )
            )) {
               var6 = -1376464775;
               var5 = -2028367001;
               var10000 = var5 + var6 - 2 * (var5 & var6);
               var6 = 720192280;
               var5 = var10000;
               var3 = (var5 | var6) - (var5 & var6);
            }
            break;
         case -1025179230:
            var6 = -1576858572;
            var5 = 79290188;
            int var382 = (var5 | var6) & ~(var5 & var6);
            var6 = -496011676;
            var5 = var382;
            var382 = (var5 | var6) - (var5 & var6);
            var6 = -257677298;
            var5 = 1150030704;
            int var429 = var5 & ~var6 | ~var5 & var6;
            var6 = 852286315;
            var5 = var429;
            var429 = (var5 | var6) & (~var5 | ~var6);
            var6 = -228222112;
            var5 = -548236981;
            int var477 = (var5 | var6) - (var5 & var6);
            var6 = 557853737;
            var5 = var477;
            var477 = (var5 | var6) & (~var5 | ~var6);
            int var510 = (int)-4428581902700696078L;
            var6 = 1884660537;
            var5 = var510;
            var510 = var5 + var6 - 2 * (var5 & var6);
            var6 = 1859212239;
            var5 = var510;
            if (var2.equals(
               b(
                  "\uf8aa肞\uf887肗\uf880肖\uf8c9肐\uf885肃\uf88c肐\uf88d肈\uf8c9肔\uf891肘\uf89a肅\uf89a",
                  "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩謚㑲|ꟳ",
                  var382,
                  var429,
                  var477,
                  var5 + var6 - 2 * (var5 & var6)
               )
            )) {
               var10000 = (int)-665745457514254202L;
               var6 = 417492355;
               var5 = var10000;
               var10000 = var5 & ~var6 | ~var5 & var6;
               var6 = -2031477497;
               var5 = var10000;
               var3 = (var5 | var6) & ~(var5 & var6);
            }
            break;
         case -532953636:
            int var379 = (int)-1090986950764986078L;
            var6 = -160512688;
            var5 = var379;
            var379 = (var5 | var6) - (var5 & var6);
            var6 = -1146461842;
            var5 = var379;
            var379 = (var5 | var6) - (var5 & var6);
            var6 = -1810723999;
            var5 = 1215656337;
            int var427 = (var5 | var6) & (~var5 | ~var6);
            var6 = 1521403054;
            var5 = var427;
            var427 = (var5 | var6) & ~(var5 & var6);
            int var474 = (int)-2613848607140724620L;
            var6 = -1740780131;
            var5 = var474;
            var474 = (var5 | var6) - (var5 & var6);
            var6 = -513072875;
            var5 = var474;
            var474 = var5 + var6 - 2 * (var5 & var6);
            int var508 = (int)-880492357926980715L;
            var6 = -134672397;
            var5 = var508;
            var508 = (var5 | var6) & (~var5 | ~var6);
            var6 = 1703397163;
            var5 = var508;
            if (var2.equals(
               b(
                  "\uf8a7曗\uf89d暘\uf88a曗\uf887曖\uf88c曛\uf89d曝\uf88d",
                  "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩謚㑲|ꟳ",
                  var379,
                  var427,
                  var474,
                  (var5 | var6) & (~var5 | ~var6)
               )
            )) {
               var10000 = (int)-1027728935344953725L;
               var6 = 922388141;
               var5 = var10000;
               var10000 = (var5 | var6) & (~var5 | ~var6);
               var6 = 1302667310;
               var5 = var10000;
               var3 = (var5 | var6) - (var5 & var6);
            }
            break;
         case 202578898:
            int var376 = (int)8273983453306541717L;
            var6 = 612428814;
            var5 = var376;
            var376 = var5 + var6 - 2 * (var5 & var6);
            var6 = 1671339911;
            var5 = var376;
            var376 = (var5 | var6) & (~var5 | ~var6);
            var6 = -1991155803;
            var5 = 526641365;
            int var425 = var5 & ~var6 | ~var5 & var6;
            var6 = 284370318;
            var5 = var425;
            var425 = (var5 | var6) & (~var5 | ~var6);
            int var471 = (int)9013149270408626465L;
            var6 = 1825097687;
            var5 = var471;
            var471 = (var5 | var6) & (~var5 | ~var6);
            var6 = -1226769794;
            var5 = var471;
            var471 = (var5 | var6) & ~(var5 & var6);
            int var506 = (int)-1315570249472974870L;
            var6 = 1188262299;
            var5 = var506;
            var506 = (var5 | var6) & ~(var5 & var6);
            var6 = 1306698140;
            var5 = var506;
            if (var2.equals(
               b(
                  "\uf8aa퉗\uf8a7퉞\uf8a5퉑\uf8aa퉌",
                  "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩謚㑲|ꟳ",
                  var376,
                  var425,
                  var471,
                  var5 + var6 - 2 * (var5 & var6)
               )
            )) {
               var10000 = (int)6999733960311260919L;
               var6 = 771380035;
               var5 = var10000;
               var10000 = (var5 | var6) - (var5 & var6);
               var6 = 1332549047;
               var5 = var10000;
               var3 = (var5 | var6) & ~(var5 & var6);
            }
            break;
         case 276697230:
            var6 = 2026335265;
            var5 = 772458316;
            int var10003 = (var5 | var6) & (~var5 | ~var6);
            var6 = 303566449;
            var5 = var10003;
            var10003 = (var5 | var6) - (var5 & var6);
            var6 = -490464009;
            var5 = -984402946;
            int var10004 = (var5 | var6) & ~(var5 & var6);
            var6 = -1589123057;
            var5 = var10004;
            var10004 = var5 & ~var6 | ~var5 & var6;
            var6 = -1950118305;
            var5 = 777717496;
            int var10005 = var5 + var6 - 2 * (var5 & var6);
            var6 = -1306121933;
            var5 = var10005;
            var10005 = var5 & ~var6 | ~var5 & var6;
            var6 = -1012451454;
            var5 = 891329302;
            int var10006 = (var5 | var6) & (~var5 | ~var6);
            var6 = -156078239;
            var5 = var10006;
            if (var2.equals(
               b(
                  "\uf8a5鹉\uf8a4鹉\uf8bd鹟\uf8bb鹅\uf8a8鹃\uf8a1鹅\uf8ad",
                  "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩謚㑲|ꟳ",
                  var10003,
                  var10004,
                  var10005,
                  var5 + var6 - 2 * (var5 & var6)
               )
            )) {
               var6 = -1442562424;
               var5 = -469472975;
               var10000 = (var5 | var6) & ~(var5 & var6);
               var6 = 1308645309;
               var5 = var10000;
               var3 = var5 & ~var6 | ~var5 & var6;
            }
      }

      switch (var3) {
         case 0:
            var6 = -679597584;
            var5 = -483719797;
            int var371 = (var5 | var6) - (var5 & var6);
            var6 = 1887471975;
            var5 = var371;
            var371 = (var5 | var6) & (~var5 | ~var6);
            var6 = -1278502267;
            var5 = 1725229908;
            int var419 = (var5 | var6) - (var5 & var6);
            var6 = 1406341212;
            var5 = var419;
            var419 = var5 & ~var6 | ~var5 & var6;
            var6 = 380996828;
            var5 = -220694505;
            int var465 = (var5 | var6) - (var5 & var6);
            var6 = -481515868;
            var5 = var465;
            var465 = (var5 | var6) - (var5 & var6);
            var6 = 1403653109;
            var5 = 1225105272;
            int var503 = var5 & ~var6 | ~var5 & var6;
            var6 = 446614257;
            var5 = var503;
            return b(
               "ﳴ\u07bcﲫΩﲨ\u07b7ﳜ\u07bdﳑ\u07b4ﳜ\u07b4ﳑ߆\uf8c9߈\uf8c9߈ﳜ߉ﳛ\u07bcﲩ\u07b7ﳕΧ\uf8c9ޖﲩ\u07b7ﳛ\u07bcﲩ߅ﲫ\u07bc\uf8c9ޱﳔߋﳜ߉ﳔ\u07bcﲫΤﳖ\u07b7ﳝ\u07b3ﳒ߇ﲮ\u07bcﳔޱﳜΧ",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩謚㑲|ꟳ",
               var371,
               var419,
               var465,
               (var5 | var6) - (var5 & var6)
            );
         case 1:
            int var368 = (int)-6529736421732527420L;
            var6 = -1285967439;
            var5 = var368;
            var368 = (var5 | var6) - (var5 & var6);
            var6 = -29374871;
            var5 = var368;
            var368 = var5 + var6 - 2 * (var5 & var6);
            var6 = -806066200;
            var5 = -1080069924;
            int var417 = (var5 | var6) & ~(var5 & var6);
            var6 = -155825510;
            var5 = var417;
            var417 = var5 & ~var6 | ~var5 & var6;
            int var462 = (int)-9155420495662116922L;
            var6 = -1348365658;
            var5 = var462;
            var462 = (var5 | var6) & (~var5 | ~var6);
            var6 = -1107976719;
            var5 = var462;
            var462 = var5 & ~var6 | ~var5 & var6;
            var6 = -1104268224;
            var5 = -645522657;
            int var502 = (var5 | var6) - (var5 & var6);
            var6 = 1743418818;
            var5 = var502;
            return b(
               "ﳈ͝ﲩ͚ﳑ̩\uf8c9͒ﳗ͕ﲭ͐ﳚ͖ﳛ݈ﳜ̡ﲸ݈ﳔ͝\uf8c9͐ﳔ͐ﲯ͐ﳙ͓ﳑ͟ﳑ̨ﳗ͚ﳙ͕\uf8c7݈ﳶ͖ﳖ̨ﳗ͙ﲪ͑ﲫ͝\uf8c9͗ﳗ͟ﳟ͝\uf8c7",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩謚㑲|ꟳ",
               var368,
               var417,
               var462,
               (var5 | var6) & (~var5 | ~var6)
            );
         case 2:
            int var365 = (int)-1923764600637857628L;
            var6 = -755675000;
            var5 = var365;
            var365 = (var5 | var6) & (~var5 | ~var6);
            var6 = 1570936112;
            var5 = var365;
            var365 = var5 + var6 - 2 * (var5 & var6);
            int var414 = (int)5832892230083177812L;
            var6 = -184124180;
            var5 = var414;
            var414 = (var5 | var6) & ~(var5 & var6);
            var6 = 950384054;
            var5 = var414;
            var414 = (var5 | var6) & (~var5 | ~var6);
            int var459 = (int)-3724772416154051833L;
            var6 = 669251045;
            var5 = var459;
            var459 = (var5 | var6) - (var5 & var6);
            var6 = -431574380;
            var5 = var459;
            var459 = var5 + var6 - 2 * (var5 & var6);
            var6 = 1237139820;
            var5 = 1763486115;
            int var501 = var5 & ~var6 | ~var5 & var6;
            var6 = 547571762;
            var5 = var501;
            return b(
               "ﳳ虜ﳔ樓ﳑ碌\uf8c9雷\uf8c9壘ﳙ爐ﳑ老\uf8c9擄ﳕ綠ﳔ綠ﳕﴨﲪ菉ﳜﴨﲨ屢ﲠ綠ﲨ壘ﳛ屢ﳜ壘\uf8c7",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩謚㑲|ꟳ",
               var365,
               var414,
               var459,
               (var5 | var6) - (var5 & var6)
            );
         case 3:
            var6 = -1452388645;
            var5 = -272246272;
            int var363 = var5 & ~var6 | ~var5 & var6;
            var6 = 41824711;
            var5 = var363;
            var363 = (var5 | var6) & ~(var5 & var6);
            var6 = -1946804634;
            var5 = 48563250;
            int var412 = var5 & ~var6 | ~var5 & var6;
            var6 = 264977231;
            var5 = var412;
            var412 = (var5 | var6) - (var5 & var6);
            int var456 = (int)-5826841040426144617L;
            var6 = -843631773;
            var5 = var456;
            var456 = (var5 | var6) - (var5 & var6);
            var6 = -553603033;
            var5 = var456;
            var456 = (var5 | var6) - (var5 & var6);
            int var499 = (int)7042088272254880811L;
            var6 = -34184201;
            var5 = var499;
            var499 = (var5 | var6) - (var5 & var6);
            var6 = -445042218;
            var5 = var499;
            return b(
               "ﳳ䟁ﳔ䞻ﳒ䟇ﳓ䞽\uf8c9䟍ﳜ䞿ﲨ䟇ﳐ䏑\uf8c9䟠ﳗ䟀ﲩ䟁ﳘ䞼ﳐ䞽ﳜ䏟ﳜ䞶ﲸ䏟ﲩ䟏ﳞ䏑",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩謚㑲|ꟳ",
               var363,
               var412,
               var456,
               (var5 | var6) & (~var5 | ~var6)
            );
         case 4:
            var6 = -464292184;
            var5 = 1161043237;
            int var361 = (var5 | var6) & ~(var5 & var6);
            var6 = -441266543;
            var5 = var361;
            var361 = var5 & ~var6 | ~var5 & var6;
            int var409 = (int)-4496562952473706662L;
            var6 = -364882907;
            var5 = var409;
            var409 = (var5 | var6) & (~var5 | ~var6);
            var6 = -412813466;
            var5 = var409;
            var409 = var5 & ~var6 | ~var5 & var6;
            int var453 = (int)6468765479820383358L;
            var6 = -1914935544;
            var5 = var453;
            var453 = (var5 | var6) - (var5 & var6);
            var6 = -666946468;
            var5 = var453;
            var453 = (var5 | var6) & (~var5 | ~var6);
            int var497 = (int)8608845441029134126L;
            var6 = 1396502778;
            var5 = var497;
            var497 = (var5 | var6) & ~(var5 & var6);
            var6 = 1976860380;
            var5 = var497;
            return b(
               "ﳽ胃ﲨ肿ﳑ胎ﳔ肾ﲫ蓝ﳒ胅ﳕ胅ﲫ蓝ﳓ胃ﳔ肹ﳑ胎ﳗ胏\uf8c7蓝ﳊ胉ﳙ胆ﳑ肿ﳜ蓝ﳔ胈ﳔ肾ﳟ胀ﲢ胈\uf8c9胇ﳗ胀ﲭ胅ﳚ胅\uf8c7",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩謚㑲|ꟳ",
               var361,
               var409,
               var453,
               (var5 | var6) - (var5 & var6)
            );
         case 5:
            var6 = 1757474599;
            var5 = -1232017455;
            int var359 = var5 & ~var6 | ~var5 & var6;
            var6 = -1702515222;
            var5 = var359;
            var359 = (var5 | var6) & (~var5 | ~var6);
            int var406 = (int)-4797012769384565872L;
            var6 = 491898839;
            var5 = var406;
            var406 = var5 & ~var6 | ~var5 & var6;
            var6 = -765519959;
            var5 = var406;
            var406 = var5 + var6 - 2 * (var5 & var6);
            int var450 = (int)-4752044080371262764L;
            var6 = -1033483324;
            var5 = var450;
            var450 = (var5 | var6) & (~var5 | ~var6);
            var6 = -715178437;
            var5 = var450;
            var450 = (var5 | var6) - (var5 & var6);
            var6 = 1759999153;
            var5 = -91789940;
            int var496 = var5 + var6 - 2 * (var5 & var6);
            var6 = -1843121696;
            var5 = var496;
            return b(
               "ﳴ礝ﳝ礖ﳖ祫ﲨ祪ﳑ礔ﳗ礝\uf8c9礐ﳕ祧\uf8c9礒ﳗ礕ﲭ礐ﳚ礘\uf8c7紈ﳱ祩ﳖ礖ﳒ祤ﳞ祫ﳐ祪ﳜ紈ﲫ礖ﳒ祤ﳓ礖\uf8c9礙ﲪ礒ﳛ祣\uf8c5紈ﲯ礐ﲭ票ﲢ紈ﳑ紈ﳖ票ﳗ礙ﳜ礓ﲢ紆",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩謚㑲|ꟳ",
               var359,
               var406,
               var450,
               (var5 | var6) & (~var5 | ~var6)
            );
         case 6:
            int var356 = (int)4471706707095446434L;
            var6 = -1668513701;
            var5 = var356;
            var356 = (var5 | var6) & (~var5 | ~var6);
            var6 = 8308453;
            var5 = var356;
            var356 = (var5 | var6) - (var5 & var6);
            int var403 = (int)6213584718621881197L;
            var6 = -1233007743;
            var5 = var403;
            var403 = (var5 | var6) & (~var5 | ~var6);
            var6 = 1596561200;
            var5 = var403;
            var403 = (var5 | var6) & (~var5 | ~var6);
            var6 = 489080970;
            var5 = -2011051062;
            int var448 = var5 & ~var6 | ~var5 & var6;
            var6 = -1689039422;
            var5 = var448;
            var448 = var5 & ~var6 | ~var5 & var6;
            var6 = -701206278;
            var5 = -1972023862;
            int var495 = var5 & ~var6 | ~var5 & var6;
            var6 = 1544344059;
            var5 = var495;
            return b(
               "ﳈ딋ﲩ딌ﳜ땾\uf8c9딃ﳜ넞ﳗ땼ﳛ딋ﲮ딎ﳜ땼\uf8c7넞ﳶ딀ﳖ땾ﳗ딏ﲪ딇ﲫ딋\uf8c9딁ﳗ딉ﳟ딋\uf8c7",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩謚㑲|ꟳ",
               var356,
               var403,
               var448,
               (var5 | var6) - (var5 & var6)
            );
         default:
            int var391 = (int)6215595407464573883L;
            var6 = -691484094;
            var5 = var391;
            var391 = (var5 | var6) & ~(var5 & var6);
            var6 = -77282075;
            var5 = var391;
            var391 = (var5 | var6) & (~var5 | ~var6);
            var6 = 16668045;
            var5 = 1855784642;
            int var438 = var5 & ~var6 | ~var5 & var6;
            var6 = -388139843;
            var5 = var438;
            var438 = (var5 | var6) - (var5 & var6);
            int var486 = (int)-8101403146095991130L;
            var6 = 1822475765;
            var5 = var486;
            var486 = (var5 | var6) & (~var5 | ~var6);
            var6 = -1781684447;
            var5 = var486;
            var486 = var5 + var6 - 2 * (var5 & var6);
            int var516 = (int)-3225565494405130824L;
            var6 = -1932890458;
            var5 = var516;
            var516 = (var5 | var6) - (var5 & var6);
            var6 = 1188093951;
            var5 = var516;
            if (!var1.contains(
               b("\uf89d祽\uf884祱\uf886祡\uf89d", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩謚㑲|ꟳ", var391, var438, var486, (var5 | var6) - (var5 & var6))
            )) {
               var391 = (int)-2663299377384123403L;
               var6 = 189977272;
               var5 = var391;
               var391 = (var5 | var6) & (~var5 | ~var6);
               var6 = -150510511;
               var5 = var391;
               var391 = (var5 | var6) & ~(var5 & var6);
               var438 = (int)-5130544331052335028L;
               var6 = 848545189;
               var5 = var438;
               var438 = (var5 | var6) - (var5 & var6);
               var6 = -1357525147;
               var5 = var438;
               var438 = (var5 | var6) - (var5 & var6);
               var6 = -1744195841;
               var5 = 71679501;
               var486 = (var5 | var6) & (~var5 | ~var6);
               var6 = -2085755559;
               var5 = var486;
               var486 = var5 + var6 - 2 * (var5 & var6);
               var6 = 1959332939;
               var5 = 743091989;
               var516 = (var5 | var6) & ~(var5 & var6);
               var6 = 1487004709;
               var5 = var516;
               if (!var1.contains(
                  b(
                     "\uf8bd\u1ae7\uf884\u1aeb\uf886\u1afb\uf89d",
                     "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩謚㑲|ꟳ",
                     var391,
                     var438,
                     var486,
                     (var5 | var6) & (~var5 | ~var6)
                  )
               )) {
                  String var4 = var1;
                  StringBuilder var354 = new StringBuilder();
                  var391 = (int)-3330585352667187216L;
                  var6 = 1984403749;
                  var5 = var391;
                  var391 = (var5 | var6) & (~var5 | ~var6);
                  var6 = -1430975543;
                  var5 = var391;
                  var391 = var5 & ~var6 | ~var5 & var6;
                  var438 = (int)-1740865550362450509L;
                  var6 = -1069161579;
                  var5 = var438;
                  var438 = (var5 | var6) - (var5 & var6);
                  var6 = 574764963;
                  var5 = var438;
                  var438 = var5 + var6 - 2 * (var5 & var6);
                  var6 = -746712723;
                  var5 = -1237337561;
                  var486 = (var5 | var6) & (~var5 | ~var6);
                  var6 = 1868839868;
                  var5 = var486;
                  var486 = var5 & ~var6 | ~var5 & var6;
                  var516 = (int)7259585189599761125L;
                  var6 = -1396791283;
                  var5 = var516;
                  var516 = (var5 | var6) & ~(var5 & var6);
                  var6 = -164113252;
                  var5 = var516;
                  return var354.append(
                        b(
                           "ﳴ\uf7b4\uf8c9\uf7c2ﳝ\uf7b1ﳒ\uf7bfﲨ\uf7cd\uf8c9\uf7c0ﳗ\uf7b6ﳝ\uf7b1ﲫ\uf7cd\uf8c9\uf7bbﳗ\uf7bcﲭ\uf7b9ﳚ\uf3bb\uf8c9",
                           "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩謚㑲|ꟳ",
                           var391,
                           var438,
                           var486,
                           var5 & ~var6 | ~var5 & var6
                        )
                     )
                     .append(var4)
                     .toString();
               }
            }

            var6 = 586390456;
            var5 = 322001134;
            int var10002 = var5 & ~var6 | ~var5 & var6;
            var6 = 1964467786;
            var5 = var10002;
            var10002 = var5 & ~var6 | ~var5 & var6;
            var391 = (int)1775230571492066514L;
            var6 = -1168498312;
            var5 = var391;
            var391 = (var5 | var6) & (~var5 | ~var6);
            var6 = -1529943373;
            var5 = var391;
            var391 = var5 & ~var6 | ~var5 & var6;
            var6 = -1708002195;
            var5 = 1086447482;
            var438 = (var5 | var6) - (var5 & var6);
            var6 = -995562641;
            var5 = var438;
            var438 = (var5 | var6) & (~var5 | ~var6);
            var486 = (int)7062769911394572919L;
            var6 = 1519141801;
            var5 = var486;
            var486 = (var5 | var6) & ~(var5 & var6);
            var6 = 679138774;
            var5 = var486;
            return b(
               "ﳶ喽ﳜ嗏ﲢ喵ﳜ嗀ﳗ凝ﳛ喽ﳜ嗁ﲦ凝ﳗ嗋ﳑ嗉ﳙ嗀ﳑ喲\uf8c7凝ﳶ喽ﳗ嗏ﳜ喽ﲥ喿ﳜ凝ﳑ嗀ﲫ嗈ﲩ嗀ﳜ喿\uf8c4嗂ﳗ嗉ﳓ嗆ﲧ喺ﳜ嗀ﳑ嗈\uf8c7",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩謚㑲|ꟳ",
               var10002,
               var391,
               var438,
               (var5 | var6) & (~var5 | ~var6)
            );
      }
   }

   static {
      int var1 = 437134567;
      int var0 = 2137981390;
      int var10000 = (var0 | var1) & ~(var0 & var1);
      var1 = 1700865320;
      var0 = var10000;
      String[] var24 = new String[(var0 | var1) & (~var0 | ~var1)];
      int var10002 = (int)-8779393558353894826L;
      var1 = -526154061;
      var0 = var10002;
      var10002 = var0 + var1 - 2 * (var0 & var1);
      var1 = 173352165;
      var0 = var10002;
      var10002 = var0 + var1 - 2 * (var0 & var1);
      var1 = 209458321;
      var0 = -2031526331;
      int var10005 = (var0 | var1) & (~var0 | ~var1);
      var1 = -834605112;
      var0 = var10005;
      var10005 = var0 + var1 - 2 * (var0 & var1);
      int var10006 = (int)8186764238667259409L;
      var1 = 1432890939;
      var0 = var10006;
      var10006 = (var0 | var1) - (var0 & var1);
      var1 = -1539830370;
      var0 = var10006;
      var10006 = (var0 | var1) & (~var0 | ~var1);
      var1 = -1754048999;
      var0 = -1063511409;
      int var10007 = var0 + var1 - 2 * (var0 & var1);
      var1 = 1153996232;
      var0 = var10007;
      var10007 = var0 + var1 - 2 * (var0 & var1);
      var1 = -1718260488;
      var0 = -1184800743;
      int var10008 = var0 + var1 - 2 * (var0 & var1);
      var1 = 552764686;
      var0 = var10008;
      var24[var10002] = b("꾯荸꾈茂꾍荵꿶茆꾅茀꾍荾", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁲꤊ絸蹌⑳謰㑤=Ʂ꒺ꁿ꤃絿蹍⑩謚㑲|ꟳ", var10005, var10006, var10007, var0 + var1 - 2 * (var0 & var1));
      a = var24;
   }

   public static String b(String var0, String var1, int var2, int var3, int var4, int var5) {
      char[] var6 = var1.toCharArray();
      char[] var7 = new char[var6.length];
      int var10000 = (int)-6846912508140779148L;
      int var18 = 1754876071;
      int var17 = var10000;
      var10000 = var17 + var18 - 2 * (var17 & var18);
      var18 = -661765671;
      var17 = var10000;
      char[] var220 = new char[(var17 | var18) & ~(var17 & var18)];
      int var10002 = (int)1838027927676058047L;
      var18 = -1971371041;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -31475104;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      int var10003 = (int)581893298875692955L;
      var18 = 247805862;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1584334863;
      var17 = var10003;
      var220[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var10002 = (int)2626063921443143409L;
      var18 = -318258975;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -166609391;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var10003 = (int)7275006326479211537L;
      var18 = 1033844499;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1457760121;
      var17 = var10003;
      var220[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var10002 = (int)2420148680407328827L;
      var18 = 1933639924;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -1945229107;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -382433677;
      var17 = 87424206;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -335455941;
      var17 = var10003;
      var220[var10002] = (char)((var17 | var18) - (var17 & var18));
      var10002 = (int)7237499602722104391L;
      var18 = -922338270;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 994973798;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var10003 = (int)4297207606332986831L;
      var18 = -420108506;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 56666874;
      var17 = var10003;
      var220[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var18 = 1624335220;
      var17 = -619920633;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1143103369;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)-1337269626219181661L;
      var18 = 1580368104;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1853577326;
      var17 = var10003;
      var220[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var10002 = (int)1854184730319834353L;
      var18 = -1060094848;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -159715212;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)3242827716963403304L;
      var18 = -226523875;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 1796916919;
      var17 = var10003;
      var220[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var18 = 2127347947;
      var17 = -1320656878;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -813391617;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -212477635;
      var17 = 480501943;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -269078375;
      var17 = var10003;
      var220[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var10002 = (int)8825073231831052267L;
      var18 = -322372071;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 819057141;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 990522362;
      var17 = 185826176;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 806970456;
      var17 = var10003;
      var220[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var18 = 2096523848;
      var17 = -951088304;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -1145446128;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 1931245775;
      var17 = 1786557491;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 425772207;
      var17 = var10003;
      var220[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var10002 = (int)-3831425092915930266L;
      var18 = 61526097;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -2104456386;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 130630353;
      var17 = 791863833;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 687581164;
      var17 = var10003;
      var220[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      char[] var8 = var220;
      var18 = 61091310;
      var17 = 1475825443;
      var10000 = var17 & ~var18 | ~var17 & var18;
      var18 = 1414750919;
      var17 = var10000;
      char[] var222 = new char[var17 & ~var18 | ~var17 & var18];
      var10002 = (int)2655862797056598527L;
      var18 = 774683593;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1352096310;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 341594389;
      var17 = -1459674814;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1130153865;
      var17 = var10003;
      var222[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var10002 = (int)-2497414088852161920L;
      var18 = -948006515;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -6837492;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var10003 = (int)-7047965680179989826L;
      var18 = 468142012;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 543027457;
      var17 = var10003;
      var222[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var18 = -144213671;
      var17 = -1680402001;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 1823498484;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)6577118901865423297L;
      var18 = 1644554070;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 758596036;
      var17 = var10003;
      var222[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var18 = -429124542;
      var17 = -874920154;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 766890855;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 1088290578;
      var17 = -1493391454;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -434020174;
      var17 = var10003;
      var222[var10002] = (char)((var17 | var18) - (var17 & var18));
      var18 = 1157307115;
      var17 = -598695325;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1733576564;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var10003 = (int)-3760702046160316267L;
      var18 = -1103602282;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -1094714045;
      var17 = var10003;
      var222[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var18 = -1249919314;
      var17 = -771622359;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 1736328322;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var10003 = (int)5161553347120527734L;
      var18 = 1315874116;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 1580623014;
      var17 = var10003;
      var222[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var10002 = (int)-6073613537514758999L;
      var18 = 1284151857;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1914222946;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)-3627512996011559069L;
      var18 = 480678210;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 1513627928;
      var17 = var10003;
      var222[var10002] = (char)((var17 | var18) - (var17 & var18));
      var18 = 147144704;
      var17 = 2135547904;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 2005704711;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 268997463;
      var17 = 1593895363;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1325951660;
      var17 = var10003;
      var222[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var10002 = (int)-6050368858950365652L;
      var18 = -1778998425;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -1344590525;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1632975674;
      var17 = 621749014;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -1146788652;
      var17 = var10003;
      var222[var10002] = (char)((var17 | var18) - (var17 & var18));
      var10002 = (int)-6580640960418286124L;
      var18 = -1168048609;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 1031867330;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var10003 = (int)5512739179621403804L;
      var18 = -1121283892;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1046679709;
      var17 = var10003;
      var222[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      char[] var9 = var222;
      var10000 = (int)-1528468365864581750L;
      var18 = 896126376;
      var17 = var10000;
      var10000 = (var17 | var18) - (var17 & var18);
      var18 = -1487828958;
      var17 = var10000;

      for (int var10 = (var17 | var18) & ~(var17 & var18); var10 < var6.length; var10++) {
         char var281 = var6[var10];
         char var205 = var8[var10 % var8.length];
         char var106 = var281;
         var7[var10] = (char)(var106 + var205 - 2 * (var106 & var205));
      }

      char[] var19 = new char[var7.length];
      var10000 = (int)7231384604320020L;
      var18 = 2031820072;
      var17 = var10000;
      var10000 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1752679364;
      var17 = var10000;

      for (int var11 = var17 & ~var18 | ~var17 & var18; var11 < var6.length; var11++) {
         char var282 = var7[var11];
         char var208 = var9[var11 % var9.length];
         char var109 = var282;
         var19[var11] = (char)((var109 | var208) & (~var109 | ~var208));
      }

      String var20 = new String(var19);
      int var12 = var20.hashCode();
      var18 = var5;
      var17 = var3;
      var10000 = var17 + ~var18 + 1;
      var18 = var2;
      var17 = var10000;
      int var13 = (var17 ^ var18) - 2 * (~var17 & var18);
      char[] var14 = var0.toCharArray();
      char[] var15 = new char[var14.length];
      var18 = -227322442;
      var17 = 1306829856;
      var10000 = (var17 | var18) & ~(var17 & var18);
      var18 = -1080561258;
      var17 = var10000;

      for (int var16 = var17 & ~var18 | ~var17 & var18; var16 < var15.length; var16++) {
         int var10001 = (int)4122015434565850666L;
         var18 = -1334475163;
         var17 = var10001;
         var10001 = (var17 | var18) & ~(var17 & var18);
         var18 = 2005667917;
         var17 = var10001;
         switch (var16 % (var17 & ~var18 | ~var17 & var18)) {
            case 0:
               var18 = var12;
               var17 = var13;
               var10002 = (var17 | var18) & ~(var17 & var18);
               char var218 = var14[var16];
               var17 = var10002;
               var15[var16] = (char)(var17 & ~var218 | ~var17 & var218);
               break;
            case 1:
               var18 = var13;
               var17 = var5;
               var10002 = (var17 | var18) - (var17 & var18);
               char var216 = var14[var16];
               var17 = var10002;
               var15[var16] = (char)((var17 | var216) & ~(var17 & var216));
         }
      }

      return new String(var15);
   }
}
