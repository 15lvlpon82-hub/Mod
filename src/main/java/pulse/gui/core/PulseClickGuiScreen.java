package pulse;


import pulse.client.MinecraftContext;
import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import lombok.Generated;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.math.MatrixStack;
import org.lwjgl.glfw.GLFW;
import ru.pulse.Pulse;

public class PulseClickGuiScreen extends Screen {
   private static final float c = 411.0F;
   private static final float d = 243.5F;
   private static final float e = 9.5F;
   private static final float f = 26.0F;
   private static final double g = 0.35;
   private final ClickGuiFrameOverlay h;
   private final PulseLogoOverlay i;
   private final DockPanelController j;
   private final ModuleSettingsOverlay k;
   private final Map<ClickGuiTabType, ClickGuiTab> l;
   private ClickGuiTabType m;
   private ClickGuiTabType n;
   private final AnimationState o;
   private boolean p;
   private int q;
   private int r;
   private int s;
   public static int a;
   public static boolean b;
   public int clickBtn;

   public PulseClickGuiScreen() {
      super(Text.literal("Pulse"));
      int var10001 = (int)4238756955846570841L;
      int var2 = -1207823029;
      int var1 = var10001;
      var10001 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1718439688;
      var1 = var10001;
      var10001 = (var1 & ~var2 | ~var1 & var2) * (var1 & ~var2 | ~var1 & var2);
      String var10002 = "oe";
      int var10003 = (int)7824752889645223123L;
      var2 = 1618751988;
      var1 = var10003;
      var10003 = (var1 | var2) & ~(var1 & var2);
      var2 = -268060259;
      var1 = var10003;
      var10003 = ((var1 | var2) & ~(var1 & var2)) * ((var1 | var2) & ~(var1 & var2));
      var10003 = (int)1953492787446923124L;
      var2 = 1101596416;
      var1 = var10003;
      var10003 = (var1 | var2) & (~var1 | ~var2);
      var2 = 639170797;
      var1 = var10003;
      var10003 = (var1 | var2) - (var1 & var2);
      int var10004 = (int)165084030889076005L;
      var2 = -692497197;
      var1 = var10004;
      var10004 = var1 & ~var2 | ~var1 & var2;
      var2 = 891546741;
      var1 = var10004;
      var10004 = (var1 | var2) & ~(var1 & var2);
      var2 = -1173972231;
      var1 = -1786948019;
      int var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = 7973347;
      var1 = var10005;
      var2 = (var1 | var2) & (~var1 | ~var2);
      var1 = var10004;
      var10004 = var1 - ~var2 - 1;
      var10004 = (int)-4693092815578552280L;
      var2 = -234347413;
      var1 = var10004;
      var10004 = (var1 | var2) - (var1 & var2);
      var2 = 380658819;
      var1 = var10004;
      var10004 = (var1 | var2) & ~(var1 & var2);
      String var74 = "of";
      var10005 = (int)5250269699391731833L;
      var2 = -1496580228;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = -906717000;
      var1 = var10005;
      var10005 = (var1 | var2) - (var1 & var2);
      int var10006 = (int)-5242253577067108180L;
      var2 = 21701775;
      var1 = var10006;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var2 = -369587778;
      var1 = var10006;
      var10006 = ((var1 | var2) - (var1 & var2)) * ((var1 | var2) - (var1 & var2));
      var10006 = (int)-2108326602330658010L;
      var2 = 689427794;
      var1 = var10006;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var2 = 211311553;
      var1 = var10006;
      String.valueOf(
         Text.literal(a("дЉЁкћ«дЉ‚кћ¤дЉЂкћЂдЉћкћ®", "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘ґ~\ua7efк’¶кЃєк¤‚зµЈи№ѓ\u2435и¬”г‘»{\ua7e5к’ѕкЃ–к¤ђзµїи№№в‘№и¬Ґг‘Іw\ua7e8", var10003, var10004, var10005, (var1 | var2) - (var1 & var2)))
      );
      this.clickBtn = 0;
      this.m = ClickGuiTabType.MODULES;
      this.n = null;
      this.o = new AnimationState();
      var10001 = (int)744516333908156285L;
      var2 = 109640681;
      var1 = var10001;
      var10001 = (var1 | var2) - (var1 & var2);
      var2 = 983213204;
      var1 = var10001;
      this.p = pulse.Bool.from((var1 | var2) & (~var1 | ~var2));
      var2 = 1634795398;
      var1 = -806848092;
      var10001 = (var1 | var2) & ~(var1 & var2);
      var2 = -1365735901;
      var1 = var10001;
      this.q = (var1 | var2) & ~(var1 & var2);
      var10001 = (int)3537592922638617421L;
      var2 = 258440398;
      var1 = var10001;
      var10001 = (var1 | var2) & (~var1 | ~var2);
      var2 = 648607619;
      var1 = var10001;
      this.r = (var1 | var2) & ~(var1 & var2);
      var2 = 395711461;
      var1 = -1462295222;
      var10001 = (var1 | var2) - (var1 & var2);
      var2 = -1086245201;
      var1 = var10001;
      this.s = var1 + var2 - 2 * (var1 & var2);
      this.h = new ClickGuiFrameOverlay();
      this.i = new PulseLogoOverlay();
      this.l = new HashMap<>();
      this.l.put(ClickGuiTabType.MODULES, new ModulesTab());
      this.l.put(ClickGuiTabType.MARKERS, new MarkersTab());
      this.l.put(ClickGuiTabType.FRIENDS, new FriendsTab());
      this.l.put(ClickGuiTabType.EVENTS, new EventsTab());
      this.l.put(ClickGuiTabType.CONFIGS, new ConfigsTab());
      this.j = new DockPanelController(this);
      this.k = new ModuleSettingsOverlay(this);
      this.o.d(1.0);
   }

   public void a(ClickGuiTabType var1) {
      if (this.m != var1) {
         ClickGuiTab var2 = this.a();
         if (var2 instanceof ModulesTab) {
            ((ModulesTab)var2).k();
         }

         if (var2 instanceof MarkersTab) {
            ((MarkersTab)var2).e();
         }

         this.n = this.m;
         this.m = var1;
         this.q = this.a(this.n, var1);
         int var10001 = (int)-8677857614893580533L;
         int var4 = -1124905440;
         int var3 = var10001;
         var10001 = var3 + var4 - 2 * (var3 & var4);
         var4 = 1076506922;
         var3 = var10001;
         this.p = pulse.Bool.from((var3 | var4) - (var3 & var4));
         this.o.d(0.0);
         AnimationState var10000 = this.o;
         var4 = -1832749492;
         var3 = -1488127733;
         int var10003 = var3 + var4 - 2 * (var3 & var4);
         var4 = 898535253;
         var3 = var10003;
         var10003 = var3 & ~var4 | ~var3 & var4;
         var10000.a(1.0, 0.35, pulse.Easing.n);
      }
   }

   public void a(ClickGuiTabType var1, int var2) {
      if (this.m != var1) {
         ClickGuiTab var3 = this.a();
         if (!(var3 instanceof ModulesTab)) {
            if (a != a) {
               throw new RuntimeException();
            }
         } else {
            ((ModulesTab)var3).k();
         }

         if (var3 instanceof MarkersTab) {
            ((MarkersTab)var3).e();
         }

         this.n = this.m;
         this.m = var1;
         this.q = var2;
         int var10001 = (int)-5863310942891809844L;
         int var5 = -325555336;
         int var4 = var10001;
         var10001 = var4 & ~var5 | ~var4 & var5;
         var5 = -706901835;
         var4 = var10001;
         this.p = pulse.Bool.from(var4 & ~var5 | ~var4 & var5);
         this.o.d(0.0);
         var5 = 1316771695;
         var4 = 1673143406;
         int var10002 = var4 & ~var5 | ~var4 & var5;
         var5 = -1411251798;
         var4 = var10002;
         var10002 = var4 + var5 - 2 * (var4 & var5);
         var5 = 685386794;
         var4 = 904019578;
         int var10003 = var4 + var5 - 2 * (var4 & var5);
         var5 = -1013140757;
         var4 = var10003;
         var5 = var4 + var5 - 2 * (var4 & var5);
         var4 = var10002;
         var10002 = 2 * (var4 | var5) - (var4 ^ var5);
         this.o.a(1.0, 0.35, pulse.Easing.n);
      }
   }

   private int a(ClickGuiTabType var1, ClickGuiTabType var2) {
      int var3 = var1.ordinal();
      int var4 = var2.ordinal();
      int var14;
      if (var4 <= var3) {
         var14 = (int)9184741611581618603L;
         int var6 = -13165284;
         int var5 = var14;
         var14 = var5 + var6 - 2 * (var5 & var6);
         var6 = 953867080;
         var5 = var14;
         var14 = (var5 | var6) - (var5 & var6);
      } else {
         int var11 = 1560819490;
         int var8 = 1154015078;
         var14 = var8 & ~var11 | ~var8 & var11;
         var11 = 432072773;
         var8 = var14;
         var14 = var8 & ~var11 | ~var8 & var11;
      }

      return var14;
   }

   public ClickGuiTab a() {
      return this.l.get(this.m);
   }

   public ClickGuiTab b() {
      return this.n != null ? this.l.get(this.n) : null;
   }

   private boolean isInsideClickGui(int mouseX, int mouseY, float originX, float originY) {
      return GuiInput.a(originX, originY, 411.0F, 243.5F, mouseX, mouseY);
   }

   private boolean isOverOpenSettings(int mouseX, int mouseY) {
      ClickGuiTab var3 = this.a();
      return var3 instanceof ModulesTab var4 && var4.hasOpenSettingsAt(mouseX, mouseY);
   }

   protected void init() {
      super.init();
      HudElementManager.a().a(true);
   }

   public void removed() {
      HudElementManager.a().a(false);
      super.removed();
   }

   public void render(DrawContext var1, int var2, int var3, float var4) {
      CustomHandShaderCapture.beginGuiRender();
      MatrixStack var5 = var1.getMatrices();
      GuiInput.h();
      int var10000 = (int)4030863140615932945L;
      int var23 = -1108223227;
      int var22 = var10000;
      var10000 = (var22 | var23) & ~(var22 & var23);
      var23 = -590881503;
      var22 = var10000;
      var10000 = (var22 & ~var23 | ~var22 & var23) * (var22 & ~var23 | ~var22 & var23);
      ScreenScale.a(2.0);
      ScreenPoint var6 = ScreenScale.a((double)var2, (double)var3);
      int var7 = var6.a();
      int var8 = var6.b();
      this.r = var7;
      this.s = var8;
      GuiLayerRegistry.a().b();
      GuiLayerRegistry.a().a(var7, var8);
      float var176 = MinecraftContext.d.getWidth();
      int var10002 = (int)-8111500303296604158L;
      var23 = -1113593860;
      var22 = var10002;
      var10002 = (var22 | var23) & (~var22 | ~var23);
      var23 = -552091661;
      var22 = var10002;
      var10002 = (var22 | var23) & (~var22 | ~var23);
      var10002 = (int)830056407220697663L;
      var23 = -442748814;
      var22 = var10002;
      var10002 = (var22 | var23) - (var22 & var23);
      var23 = 1785793117;
      var22 = var10002;
      var10002 = var22 & ~var23 | ~var22 & var23;
      float var177 = var176 / 4.0F;
      String var10001 = "og";
      float var9 = var177 - 205.5F;
      float var178 = MinecraftContext.d.getHeight();
      int var194 = (int)-2898031175679765415L;
      var23 = 225561102;
      var22 = var194;
      int var195 = (var22 | var23) & ~(var22 & var23);
      var23 = 1145470259;
      var22 = var195;
      int var196 = var22 & ~var23 | ~var22 & var23;
      float var179 = var178 / 4.0F;
      int var197 = (int)-3813039353317865766L;
      var23 = -1914592221;
      var22 = var197;
      int var198 = (var22 | var23) - (var22 & var23);
      var23 = -484931690;
      var22 = var198;
      int var199 = ((var22 | var23) - (var22 & var23)) * ((var22 | var23) - (var22 & var23));
      float var10 = var179 - 121.75F;
      Renderer2D var11 = Pulse.getInstance().getRender();
      var23 = 1900354766;
      var22 = 1785302310;
      var10000 = (var22 | var23) & ~(var22 & var23);
      var23 = -1928546972;
      var22 = var10000;
      var10000 = var22 & ~var23 | ~var22 & var23;
      var23 = 463820234;
      var22 = -1998232272;
      int var200 = (var22 | var23) & ~(var22 & var23);
      var23 = -808437846;
      var22 = var200;
      int var201 = ((var22 | var23) & (~var22 | ~var23)) * ((var22 | var23) & (~var22 | ~var23));
      var23 = -1937184833;
      var22 = -1162011362;
      int var10003 = var22 & ~var23 | ~var22 & var23;
      var23 = 909507249;
      var22 = var10003;
      var10003 = var22 & ~var23 | ~var22 & var23;
      var23 = 687507474;
      var22 = 148943385;
      var10003 = (var22 | var23) & (~var22 | ~var23);
      var23 = 538589703;
      var22 = var10003;
      var10003 = var22 & ~var23 | ~var22 & var23;
      var10002 = (int)-328999316688323758L;
      var23 = 1981608363;
      var22 = var10002;
      var10002 = var22 & ~var23 | ~var22 & var23;
      var23 = 1473284704;
      var22 = var10002;
      var10002 = (var22 | var23) & (~var22 | ~var23);
      var23 = 1981502642;
      var22 = 532282075;
      var10003 = var22 + var23 - 2 * (var22 & var23);
      var23 = 945575574;
      var22 = var10003;
      var10003 = ((var22 | var23) & ~(var22 & var23)) * ((var22 | var23) & ~(var22 & var23));
      var10003 = (int)-7992071535216618194L;
      var23 = -1808586517;
      var22 = var10003;
      var10003 = (var22 | var23) & (~var22 | ~var23);
      var23 = 123613579;
      var22 = var10003;
      var10003 = var22 + var23 - 2 * (var22 & var23);
      var23 = -1727995647;
      var22 = -940412852;
      int var10004 = (var22 | var23) - (var22 & var23);
      var23 = -1867340823;
      var22 = var10004;
      var10004 = var22 + var23 - 2 * (var22 & var23);
      var23 = -1918777043;
      var22 = 1379967409;
      int var10005 = (var22 | var23) & (~var22 | ~var23);
      var23 = 1380996805;
      var22 = var10005;
      var23 = (var22 | var23) & (~var22 | ~var23);
      var22 = var10004;
      var10004 = (var22 ^ var23) + 2 * (var22 & var23);
      var23 = -141598069;
      var22 = -1227910034;
      var10004 = var22 + var23 - 2 * (var22 & var23);
      var23 = 1243119457;
      var22 = var10004;
      var10004 = var22 & ~var23 | ~var22 & var23;
      var10005 = (int)1299822966235759583L;
      var23 = -969694049;
      var22 = var10005;
      var10005 = var22 + var23 - 2 * (var22 & var23);
      var23 = 521484033;
      var22 = var10005;
      var10005 = ((var22 | var23) & ~(var22 & var23)) * ((var22 | var23) & ~(var22 & var23));
      var23 = -1189841336;
      var22 = -1208422340;
      var10005 = (var22 | var23) - (var22 & var23);
      var23 = 247368028;
      var22 = var10005;
      Identifier var12 = IconTextureRegistry.get(
         a("п±§лЏЌп±µлЏЃп±»лЏ’", "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘ґ~\ua7efк’¶кЃєк¤‚зµЈи№ѓ\u2435и¬”г‘»{\ua7e5к’ѕкЃ–к¤ђзµїи№№в‘№и¬Ґг‘Іw\ua7e8", var10002, var10003, var10004, (var22 | var23) - (var22 & var23))
      );
      var10000 = (int)1949353423938964796L;
      var23 = -442124659;
      var22 = var10000;
      var10000 = (var22 | var23) & ~(var22 & var23);
      var23 = -2110293071;
      var22 = var10000;
      // The old client drew the PulseVisuals water texture over the entire GUI background.
      // Keep the GUI readable and let the panel/background rendering below own the screen.
      this.i.a(var5, var11, var9, var10, var7, var8);
      this.o.a();
      if (this.p) {
         if (!this.o.d()) {
            if (a != a) {
               throw new RuntimeException();
            }
         } else {
            int var202 = (int)4981414199994512487L;
            var23 = 1784088407;
            var22 = var202;
            int var203 = (var22 | var23) & ~(var22 & var23);
            var23 = 395670320;
            var22 = var203;
            this.p = pulse.Bool.from(var22 & ~var23 | ~var22 & var23);
            this.n = null;
         }
      }

      float var13 = (float)this.o.j();
      if (this.j.a() == DockPanelController.Dock.BOTTOM) {
         var23 = -1527396;
         var22 = -1906592504;
         var10000 = (var22 | var23) - (var22 & var23);
         var23 = 1907557524;
         var22 = var10000;
         var10000 = (var22 | var23) - (var22 & var23);
      } else {
         var10000 = (int)-6102462251475117846L;
         var23 = 403425408;
         var22 = var10000;
         var10000 = var22 & ~var23 | ~var22 & var23;
         var23 = 93556843;
         var22 = var10000;
         var10000 = var22 & ~var23 | ~var22 & var23;
      }

      int var14 = var10000;
      float var188 = MinecraftContext.d.getWidth();
      int var204 = (int)-8863401993122635545L;
      var23 = -1873218824;
      var22 = var204;
      int var205 = (var22 | var23) - (var22 & var23);
      var23 = 1012411188;
      var22 = var205;
      int var206 = (var22 | var23) & ~(var22 & var23);
      var10002 = (int)-2405124572948528990L;
      var23 = 97954521;
      var22 = var10002;
      var10002 = (var22 | var23) - (var22 & var23);
      var23 = 1414620194;
      var22 = var10002;
      var23 = (var22 | var23) - (var22 & var23);
      var22 = var206;
      int var207 = (var22 ^ var23) + 2 * (var22 & var23);
      float var15 = var188 / 4.0F;
      float var189 = MinecraftContext.d.getHeight();
      int var208 = (int)-8313319341217490800L;
      var23 = 959734710;
      var22 = var208;
      int var209 = var22 & ~var23 | ~var22 & var23;
      var23 = -512090049;
      var22 = var209;
      int var210 = var22 & ~var23 | ~var22 & var23;
      var23 = -1485194282;
      var22 = -1363730221;
      var10002 = (var22 | var23) & (~var22 | ~var23);
      var23 = -1841296857;
      var22 = var10002;
      var23 = (var22 | var23) & (~var22 | ~var23);
      var22 = var210;
      int var211 = var22 - ~var23 - 1;
      float var16 = var189 / 4.0F;
      int var212 = (int)-821490443938253809L;
      var23 = -929834654;
      var22 = var212;
      int var213 = var22 & ~var23 | ~var22 & var23;
      var23 = -1539585842;
      var22 = var213;
      int var214 = (var22 | var23) & (~var22 | ~var23);
      var23 = -2067819443;
      var22 = -1266771706;
      var10002 = (var22 | var23) & ~(var22 & var23);
      var23 = 744225582;
      var22 = var10002;
      var23 = var22 + var23 - 2 * (var22 & var23);
      var22 = var214;
      int var215 = (var22 & ~var23) + (var23 & ~var22) + 2 * (var22 & var23);
      float var190 = var15 + 205.5F;
      var23 = -293145457;
      var22 = -232921126;
      int var216 = (var22 | var23) - (var22 & var23);
      var23 = 1217715669;
      var22 = var216;
      int var217 = (var22 | var23) & ~(var22 & var23);
      var23 = 1176954115;
      var22 = -716856388;
      var10002 = var22 + var23 - 2 * (var22 & var23);
      var23 = -441065652;
      var22 = var10002;
      var23 = var22 + var23 - 2 * (var22 & var23);
      var22 = var217;
      int var218 = (var22 | var23) + (var22 & var23);
      float var17 = var190 + 50.0F;
      int var219 = (int)175750449091523053L;
      var23 = -1916953339;
      var22 = var219;
      int var220 = (var22 | var23) & ~(var22 & var23);
      var23 = 1269336226;
      var22 = var220;
      int var221 = (var22 | var23) & (~var22 | ~var23);
      var10002 = (int)7704501594328861040L;
      var23 = -1575635022;
      var22 = var10002;
      var10002 = (var22 | var23) - (var22 & var23);
      var23 = 2085266899;
      var22 = var10002;
      var23 = (var22 | var23) & ~(var22 & var23);
      var22 = var221;
      int var222 = (var22 | var23) + (var22 & var23);
      float var191 = var16 + 121.75F;
      var23 = 113050904;
      var22 = -899251765;
      int var223 = (var22 | var23) & ~(var22 & var23);
      var23 = -1898343398;
      var22 = var223;
      int var224 = ((var22 | var23) & (~var22 | ~var23)) * ((var22 | var23) & (~var22 | ~var23));
      float var18 = var191 + 50.0F;
      if (this.p && this.n != null) {
         ClickGuiTab var19 = this.b();
         if (var19 != null) {
            float var20 = 0.0F;
            float var21 = 0.0F;
            if (var14 == 0) {
               float var192 = var13 * var17;
               var22 = this.q;
               var20 = var192 * (~var22 + 1);
            } else {
               float var193 = var13 * var18;
               var22 = this.q;
               var21 = var193 * ~(var22 - 1);
            }

            this.a(var5, var11, var9 + var20, var10 + var21, var7, var8, var19);
         }
      }

      ClickGuiTab var26 = this.a();
      if (var26 != null) {
         if (!this.p) {
            this.a(var5, var11, var9, var10, var7, var8, var26);
         } else {
            float var27 = 0.0F;
            float var29 = 0.0F;
            if (var14 == 0) {
               var27 = (1.0F - var13) * var17 * this.q;
            } else {
               var29 = (1.0F - var13) * var18 * this.q;
            }

            this.a(var5, var11, var9 + var27, var10 + var29, var7, var8, var26);
         }
      }

      boolean var28 = this.j.d();
      if (!var28) {
         this.j.a(var5, var11, var9, var10, var7, var8);
         this.k.a(var5, var11, var9, var10, var7, var8);
         GuiInteractionState.a().a(var5, var11);
         if (var26 instanceof ModulesTab var30) {
            var30.a(var5, var11, var7, var8);
         }

         if (var26 instanceof MarkersTab var31) {
            var31.a(var5, var11, var7, var8);
         }

         if (var26 instanceof ConfigsTab var32) {
            var32.a(var5, var11);
         }

         this.k.a(var5, var11, var7, var8);
      } else {
         this.k.a(var5, var11, var9, var10, var7, var8);
         if (var26 instanceof ModulesTab var33) {
            var33.a(var5, var11, var7, var8);
         }

         GuiInteractionState.a().a(var5, var11);
         this.j.b(var5, var11, var9, var10, var7, var8);
         this.j.a(var5, var11, var9, var10, var7, var8);
         this.k.a(var5, var11, var7, var8);
      }

      GuiInput.i();
      super.render(var1, var2, var3, var4);
      ScreenScale.a();
      Object var25 = null;
      CustomHandShaderCapture.endGuiRender();
   }

   private void a(MatrixStack var1, Renderer2D var2, float var3, float var4, int var5, int var6, ClickGuiTab var7) {
      this.h.a(var1, var2, var3, var4, var5, var6);
      this.h.b(var1, var2, var3, var4, var5, var6);
      if (var7 != null) {
         var7.a(var1, var2, var3, var4, var5, var6);
      }
   }

   public boolean mouseClicked(double param1, double nullx, int nullxx) {
      if (nullxx != 0 && nullxx != 1) {
         return false;
      }

      this.clickBtn = nullxx;
      ScreenPoint var6 = ScreenScale.a(param1, nullx);
      int var7 = var6.a();
      int var8 = var6.b();
      float var9 = MinecraftContext.d.getWidth() / 4.0F - 205.5F;
      float var10 = MinecraftContext.d.getHeight() / 4.0F - 121.75F;
      boolean var11 = this.isOverOpenSettings(var7, var8);
      if (!var11 && !this.isInsideClickGui(var7, var8, var9, var10) && HudElementManager.a().a(param1, nullx, nullxx)) {
         return true;
      }

      GuiLayerRegistry.a().a(var7, var8);
      this.j.a(var9, var10, var7, var8);
      ClickGuiTab var12 = this.a();
      if (var12 != null) {
         if (var12 instanceof ModulesTab) {
            if (var11 || var8 >= var10 + 48.0F) {
               var12.b(var9, var10, var7, var8);
            } else {
               var12.a(var9, var10, var7, var8);
            }
         } else {
            var12.a(var9, var10, var7, var8);
         }
      }

      return true;
   }

   public boolean mouseReleased(double var1, double var3, int var5) {
      if (var5 != 0) {
         return false;
      }

      if (HudElementManager.a().b(var1, var3, var5)) {
         return true;
      }

      ScreenPoint var6 = ScreenScale.a(var1, var3);
      int var7 = var6.a();
      int var8 = var6.b();
      int var11 = MinecraftContext.d.getWidth();
      int var12 = MinecraftContext.d.getHeight();
      float var13 = var11 / 4.0F - 205.5F;
      float var14 = var12 / 4.0F - 121.75F;
      GuiLayerRegistry.a().a(var7, var8);
      this.j.c(var13, var14, var7, var8);
      ClickGuiTab var15 = this.a();
      if (var15 != null) {
         var15.c(var13, var14, var7, var8);
      }

      return true;
   }

   public boolean mouseDragged(double var1, double var3, int var5, double var6, double var8) {
      if (var5 != 0) {
         return false;
      }

      HudElementManager.a().a(var1, var3, var6, var8);
      if (HudElementManager.a().b(var1, var3)) {
         return true;
      }

      ScreenPoint var10 = ScreenScale.a(var1, var3);
      int var11 = var10.a();
      int var12 = var10.b();
      float var13 = MinecraftContext.d.getWidth() / 4.0F - 205.5F;
      float var14 = MinecraftContext.d.getHeight() / 4.0F - 121.75F;

      try {
         this.j.a(var13, var14, var11, var12, var6, var8);
      } catch (Throwable var19) {
      }

      try {
         ClickGuiTab var16 = this.a();
         if (var16 != null) {
            var16.a(var13, var14, var11, var12, var6, var8);
         }
      } catch (Throwable var18) {
      }

      return true;
   }

   public boolean mouseScrolled(double var1, double var3, double var5, double var7) {
      ScreenPoint var9 = ScreenScale.a(var1, var3);
      int var10 = var9.a();
      int var11 = var9.b();
      GuiLayerRegistry.a().a(var10, var11);
      boolean var12 = false;
      float var13 = MinecraftContext.d.getWidth() / 4.0F - 205.5F;
      float var14 = MinecraftContext.d.getHeight() / 4.0F - 121.75F;
      double var15 = var7 != 0.0 ? var7 : var5;
      if (var15 == 0.0) {
         return false;
      }

      if (!this.isOverOpenSettings(var10, var11) && !this.isInsideClickGui(var10, var11, var13, var14) && HudElementManager.a().a(var1, var3, var15)) {
         return true;
      }

      try {
         ClickGuiTab var17 = this.a();
         if (var17 instanceof ModulesTab var16) {
            var16.a((float)var15, var10, var11);
            var12 = true;
         } else if (var17 != null) {
            var17.a((float)var15);
            var12 = true;
         }
      } catch (Throwable var19) {
      }

      try {
         if (this.j != null) {
            this.j.a(var13, var14, var10, var11, 0.0, -var15 * 20.0);
            var12 = true;
         }
      } catch (Throwable var18) {
      }

      return var12;
   }

   public boolean keyPressed(int param1, int nullx, int nullxx) {
      if (param1 == GLFW.GLFW_KEY_ESCAPE) {
         this.close();
         return true;
      }

      ClickGuiTab var4 = this.a();
      if (var4 != null) {
         try {
            Method var5 = var4.getClass().getMethod("a", int.class, int.class, int.class);
            Object var6 = var5.invoke(var4, param1, nullx, nullxx);
            if (var6 instanceof Boolean && (Boolean)var6) {
               return true;
            }
         } catch (Throwable var8) {
         }
      }

      return false;
   }

   public boolean shouldCloseOnEsc() {
      return true;
   }

   public boolean charTyped(char var1, int var2) {
      ClickGuiTab var3 = this.a();
      if (var3 instanceof ModulesTab && ((ModulesTab)var3).a(var1, var2)) {
         return true;
      } else if (var3 instanceof FriendsTab var4 && var4.a(var1, var2)) {
         return true;
      } else {
         return var3 instanceof EventsTab && ((EventsTab)var3).a(var1, var2) ? true : var3 instanceof ConfigsTab && ((ConfigsTab)var3).a(var1, var2);
      }
   }

   private void m() {
      ClickGuiTabType[] var1 = ClickGuiTabType.values();
      int var2 = this.m.ordinal();
      int var10001 = (int)6750197482900788890L;
      int var5 = 1432930659;
      int var4 = var10001;
      var10001 = var4 + var5 - 2 * (var4 & var5);
      var5 = -379494408;
      var4 = var10001;
      var5 = var4 & ~var5 | ~var4 & var5;
      var4 = var2;
      int var3 = ((var4 & ~var5) + (var5 & ~var4) + 2 * (var4 & var5)) % var1.length;
      ClickGuiTabType var15 = var1[var3];
      var5 = -1472713827;
      var4 = -505553546;
      int var10002 = var4 + var5 - 2 * (var4 & var5);
      var5 = 1239807722;
      var4 = var10002;
      this.a(var15, (var4 | var5) & ~(var4 & var5));
   }

   private void n() {
      ClickGuiTabType[] var1 = ClickGuiTabType.values();
      int var2 = this.m.ordinal();
      int var5 = 1652053254;
      int var4 = -1253872348;
      int var10001 = var4 + var5 - 2 * (var4 & var5);
      var5 = -683984861;
      var4 = var10001;
      var5 = var4 & ~var5 | ~var4 & var5;
      var4 = var2;
      int var10000 = var4 + ~var5 + 1;
      var5 = var1.length;
      var4 = var10000;
      int var3 = ((var4 | var5) + (var4 & var5)) % var1.length;
      ClickGuiTabType var16 = var1[var3];
      var5 = -748989844;
      var4 = -1516489420;
      int var10002 = (var4 | var5) - (var4 & var5);
      var5 = -1992779609;
      var4 = var10002;
      this.a(var16, var4 & ~var5 | ~var4 & var5);
   }

   public void c() {
      ClickGuiTab var1 = this.a();
      if (!(var1 instanceof ModulesTab var2)) {
         int var6 = 1436429573;
         int var5 = 1098013151;
         int var10001 = var5 + var6 - 2 * (var5 & var6);
         var6 = 351040712;
         var5 = var10001;
         var10001 = var5 + var6 - 2 * (var5 & var6);
         var10001 = (int)7663298475903510624L;
         var6 = -1607165057;
         var5 = var10001;
         var10001 = (var5 | var6) - (var5 & var6);
         var6 = 137491226;
         var5 = var10001;
         var10001 = (var5 | var6) & (~var5 | ~var6);
         var6 = -876339795;
         var5 = -1339323601;
         var10001 = (var5 | var6) - (var5 & var6);
         var6 = 2079299209;
         var5 = var10001;
         var10001 = (var5 | var6) - (var5 & var6);
         var10001 = (int)8687606147460156085L;
         var6 = 1745922955;
         var5 = var10001;
         var10001 = var5 + var6 - 2 * (var5 & var6);
         var6 = 2009882935;
         var5 = var10001;
         var10001 = (var5 | var6) & ~(var5 & var6);
         var6 = 728748315;
         var5 = 450469470;
         int var10000 = (var5 | var6) & ~(var5 & var6);
         var6 = 856631659;
         var5 = var10000;
         int var4 = (var5 | var6) - (var5 & var6);
         a = var4;
         var6 = -367859107;
         var5 = -1592273411;
         var10001 = (var5 | var6) & ~(var5 & var6);
         var6 = 1258635174;
         var5 = var10001;
         var10001 = (var5 | var6) & ~(var5 & var6);
         var10001 = (int)6503153094296788588L;
         var6 = -1045524091;
         var5 = var10001;
         var10001 = var5 & ~var6 | ~var5 & var6;
         var6 = 2015645679;
         var5 = var10001;
         var10001 = var5 + var6 - 2 * (var5 & var6);
         var10001 = (int)2774634063855691197L;
         var6 = 1808538702;
         var5 = var10001;
         var10001 = (var5 | var6) & ~(var5 & var6);
         var6 = -1776469509;
         var5 = var10001;
         var10001 = (var5 | var6) - (var5 & var6);
         var6 = -682463220;
         var5 = 381714257;
         var10001 = (var5 | var6) - (var5 & var6);
         var6 = -1047392433;
         var5 = var10001;
         var10001 = (var5 | var6) - (var5 & var6);
         var10000 = (int)5106064168041708934L;
         var6 = 1663555974;
         var5 = var10000;
         var10000 = var5 + var6 - 2 * (var5 & var6);
         var6 = -1340063355;
         var5 = var10000;
         if (var5 + var6 - 2 * (var5 & var6) < a) {
            var6 = -1712278717;
            var5 = 791865862;
            var10000 = var5 & ~var6 | ~var5 & var6;
            var6 = -1228777147;
            var5 = var10000;
            var10000 = (var5 | var6) - (var5 & var6);
            var10001 = (int)5301409501545448458L;
            var6 = 2076245428;
            var5 = var10001;
            var10001 = var5 & ~var6 | ~var5 & var6;
            var6 = -4212290;
            var5 = var10001;
            var10000 /= var5 & ~var6 | ~var5 & var6;
         }
      } else {
         var2.m();
         var2.n();
      }

      if (var1 instanceof MarkersTab) {
         ((MarkersTab)var1).e();
         ((MarkersTab)var1).f();
      }

      if (this.j.d()) {
         this.j.e();
      }

      GuiInteractionState var66 = GuiInteractionState.a();
      int var57 = 1694208556;
      int var30 = 1030552480;
      int var89 = (var30 | var57) & (~var30 | ~var57);
      var57 = 1503095180;
      var30 = var89;
      var66.a(pulse.Bool.from((var30 | var57) - (var30 & var57)));
      var66 = GuiInteractionState.a();
      var57 = 1321013995;
      var30 = 1976416436;
      var89 = (var30 | var57) - (var30 & var57);
      var57 = 997239391;
      var30 = var89;
      var66.c(pulse.Bool.from((var30 | var57) - (var30 & var57)));
      GuiInput.a();
   }

   private void o() {
      ClickGuiTab var1 = this.a();
      if (var1 instanceof ModulesTab) {
         ((ModulesTab)var1).o();
      }

      if (var1 instanceof MarkersTab) {
         ((MarkersTab)var1).e();
         ((MarkersTab)var1).f();
      }

      if (this.j.d()) {
         this.j.e();
      }
   }

   public void close() {
      this.o();
      GuiInteractionState.a().f();
      TokenSettingWidget.o();
      GuiInput.j();
      GuiInput.a();
      super.close();
   }

   public void renderBackground(DrawContext var1, int var2, int var3, float var4) {
   }

   public boolean shouldPause() {
      int var2 = -556124083;
      int var1 = -1769204466;
      int var10000 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1213607235;
      var1 = var10000;
      return pulse.Bool.from((var1 | var2) & (var1 & var2 ^ -1));
   }

   public static float d() {
      int var10000 = (int)3305443290056852904L;
      int var1 = 29678576;
      int var0 = var10000;
      var10000 = (var0 | var1) & (~var0 | ~var1);
      var1 = 562767238;
      var0 = var10000;
      var10000 = var0 + var1 - 2 * (var0 & var1);
      return 411.0F;
   }

   public static float e() {
      int var10000 = (int)4723491308151627214L;
      int var1 = 1328234594;
      int var0 = var10000;
      var10000 = (var0 | var1) & (~var0 | ~var1);
      var1 = -1946755357;
      var0 = var10000;
      var10000 = (var0 & ~var1 | ~var0 & var1) * (var0 & ~var1 | ~var0 & var1);
      return 243.5F;
   }

   public static float f() {
      int var10000 = (int)688903008223698169L;
      int var1 = 1670838480;
      int var0 = var10000;
      var10000 = var0 + var1 - 2 * (var0 & var1);
      var1 = -1177127763;
      var0 = var10000;
      var10000 = ((var0 | var1) & ~(var0 & var1)) * ((var0 | var1) & ~(var0 & var1));
      return 9.5F;
   }

   public static float g() {
      int var1 = 1832666400;
      int var0 = -1354471137;
      int var10000 = (var0 | var1) & (~var0 | ~var1);
      var1 = 1533539516;
      var0 = var10000;
      var10000 = ((var0 | var1) & ~(var0 & var1)) * ((var0 | var1) & ~(var0 & var1));
      return 26.0F;
   }

   public FriendsTab h() {
      ClickGuiTab var1 = this.l.get(ClickGuiTabType.FRIENDS);
      return !(var1 instanceof FriendsTab) ? null : (FriendsTab)var1;
   }

   public ConfigsTab i() {
      ClickGuiTab var1 = this.l.get(ClickGuiTabType.CONFIGS);
      return !(var1 instanceof ConfigsTab) ? null : (ConfigsTab)var1;
   }

   public DockPanelController j() {
      return this.j;
   }

   @Generated
   public ClickGuiTabType k() {
      return this.m;
   }

   @Generated
   public boolean l() {
      return this.p;
   }

   public static String a(String var0, String var1, int var2, int var3, int var4, int var5) {
      char[] var6 = var1.toCharArray();
      char[] var7 = new char[var6.length];
      int var10000 = (int)-8350538072026883906L;
      int var20 = 732046152;
      int var19 = var10000;
      var10000 = var19 & ~var20 | ~var19 & var20;
      var20 = -19629060;
      var19 = var10000;
      char[] var278 = new char[var19 + var20 - 2 * (var19 & var20)];
      int var10002 = (int)-6485999661158710290L;
      var20 = -1450029393;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = -1899590335;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      int var10003 = (int)-1088179119377609521L;
      var20 = -1442935690;
      var19 = var10003;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = -1870739317;
      var19 = var10003;
      var278[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      var20 = -1999981974;
      var19 = -146369256;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = 2139891571;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = -767075774;
      var19 = 518335149;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = -861777046;
      var19 = var10003;
      var278[var10002] = (char)((var19 | var20) - (var19 & var20));
      var20 = 780838144;
      var19 = 30103952;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = 792853650;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var10003 = (int)-4324575118309836601L;
      var20 = 2033478433;
      var19 = var10003;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = -711823264;
      var19 = var10003;
      var278[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      var20 = -1726896565;
      var19 = 532431740;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = -2035423948;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var10003 = (int)4635019534758567149L;
      var20 = 1689683786;
      var19 = var10003;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = 92852604;
      var19 = var10003;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1864033288;
      var19 = -1360891969;
      int var10004 = (var19 | var20) - (var19 & var20);
      var20 = -1399096272;
      var19 = var10004;
      var20 = (var19 | var20) - (var19 & var20);
      var19 = var10003;
      var10003 = 2 * (var19 | var20) - (var19 ^ var20);
      var10003 = (int)7340139836326856178L;
      var20 = 1345172160;
      var19 = var10003;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = -908464351;
      var19 = var10003;
      var278[var10002] = (char)((var19 | var20) & ~(var19 & var20));
      var20 = 1913269640;
      var19 = -1003060538;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = -1237536950;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = 1151578093;
      var19 = 1812255323;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = 272584633;
      var19 = var10003;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var10003 = (int)-3598925542080272190L;
      var20 = -1639055562;
      var19 = var10003;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = 225756881;
      var19 = var10003;
      var278[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      var10002 = (int)-5807167980443417770L;
      var20 = 1759393534;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = 645658029;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var10003 = (int)6708747220381151746L;
      var20 = 1981739854;
      var19 = var10003;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = 413893838;
      var19 = var10003;
      var278[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      var10002 = (int)942610125350683807L;
      var20 = 627071568;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = 374775497;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var10003 = (int)-555758203373859093L;
      var20 = 20993713;
      var19 = var10003;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = -878440119;
      var19 = var10003;
      var278[var10002] = (char)((var19 | var20) - (var19 & var20));
      var20 = 450369648;
      var19 = -299333150;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = -185560683;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1040944883;
      var19 = -1606690743;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = -1640996200;
      var19 = var10003;
      var278[var10002] = (char)((var19 | var20) & ~(var19 & var20));
      var20 = -1910310419;
      var19 = -1989718683;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = 122008704;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var10003 = (int)2186713622435038914L;
      var20 = 1953579659;
      var19 = var10003;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = 1187957786;
      var19 = var10003;
      var278[var10002] = (char)((var19 | var20) & ~(var19 & var20));
      var20 = 1185419342;
      var19 = 2040683085;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = 1057638922;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = -86523608;
      var19 = -1083175336;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = 1168623700;
      var19 = var10003;
      var278[var10002] = (char)((var19 | var20) & ~(var19 & var20));
      char[] var8 = var278;
      var10000 = (int)7826649592089267584L;
      var20 = -95612297;
      var19 = var10000;
      var10000 = (var19 | var20) & (~var19 | ~var20);
      var20 = -677191683;
      var19 = var10000;
      char[] var281 = new char[(var19 | var20) & ~(var19 & var20)];
      var10002 = (int)2798632363702136252L;
      var20 = -375608744;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = 2130446308;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = -992067546;
      var19 = -404466622;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = 591027268;
      var19 = var10003;
      var281[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      var10002 = (int)-2229711891235257274L;
      var20 = 1777009950;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = 1520320857;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = -583441868;
      var19 = -416309444;
      var10004 = (var19 | var20) - (var19 & var20);
      var20 = 974585114;
      var19 = var10004;
      var10004 = (var19 | var20) & (~var19 | ~var20);
      var10004 = (int)-4264932927513563789L;
      var20 = -1257684329;
      var19 = var10004;
      var10004 = var19 + var20 - 2 * (var19 & var20);
      var20 = -307843100;
      var19 = var10004;
      var10004 = var19 & ~var20 | ~var19 & var20;
      var10004 = (int)-3840677196618229411L;
      var20 = 631820165;
      var19 = var10004;
      var10004 = (var19 | var20) & ~(var19 & var20);
      var20 = 453531345;
      var19 = var10004;
      var10004 = var19 & ~var20 | ~var19 & var20;
      var10003 = (int)2654492247131196900L;
      var20 = -1054714390;
      var19 = var10003;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = -1200989171;
      var19 = var10003;
      var281[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      var20 = 1596648067;
      var19 = 1403791809;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = 210158400;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      String var375 = "ol";
      var20 = -2146379369;
      var19 = -390265091;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1756190777;
      var19 = var10003;
      var281[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      var10002 = (int)2888857061653959950L;
      var20 = 149710767;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = 506409634;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var10003 = (int)6440781510066876543L;
      var20 = -1335251961;
      var19 = var10003;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = 790176890;
      var19 = var10003;
      var281[var10002] = (char)((var19 | var20) & ~(var19 & var20));
      var10002 = (int)-4879218993092746728L;
      var20 = 1320722361;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = 31899045;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = 53262212;
      var19 = -23500534;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = -38410546;
      var19 = var10003;
      var281[var10002] = (char)((var19 | var20) - (var19 & var20));
      var10002 = (int)-9192100530718129132L;
      var20 = -876823119;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = 761362848;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1010642911;
      var19 = -332732862;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = -803737335;
      var19 = var10003;
      var281[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      var10002 = (int)4357512547649346152L;
      var20 = 661363846;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = 362399464;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var10003 = (int)-1297295222299204304L;
      var20 = -1374087022;
      var19 = var10003;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = 1098296234;
      var19 = var10003;
      var10003 = ((var19 | var20) - (var19 & var20)) * ((var19 | var20) - (var19 & var20));
      var10003 = (int)-62848294051643845L;
      var20 = -36813430;
      var19 = var10003;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = -1014940536;
      var19 = var10003;
      var281[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      var20 = -1684014040;
      var19 = 1145667730;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = -539591491;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = 1476828727;
      var19 = -855046801;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = -1794143392;
      var19 = var10003;
      var281[var10002] = (char)((var19 | var20) - (var19 & var20));
      var10002 = (int)-8034677868500909143L;
      var20 = -155510199;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = -1510696472;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var10003 = (int)-2740926930731935037L;
      var20 = 372983289;
      var19 = var10003;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = -1166782265;
      var19 = var10003;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = 1705928130;
      var19 = -1374167208;
      var10004 = (var19 | var20) & (~var19 | ~var20);
      var20 = -189093858;
      var19 = var10004;
      var20 = (var19 | var20) & (~var19 | ~var20);
      var19 = var10003;
      var10003 = (var19 & ~var20) + (var20 & ~var19) + 2 * (var19 & var20);
      var10003 = (int)-1858129993872703564L;
      var20 = 2120335654;
      var19 = var10003;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = -153698922;
      var19 = var10003;
      var281[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      var20 = 642977478;
      var19 = 1428772647;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = 1937398248;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = 532576287;
      var19 = -1140635843;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = -1547891695;
      var19 = var10003;
      var281[var10002] = (char)((var19 | var20) & ~(var19 & var20));
      char[] var9 = var281;
      var10000 = (int)-8177115402644798576L;
      var20 = 2031508467;
      var19 = var10000;
      var10000 = (var19 | var20) & (~var19 | ~var20);
      var20 = -387114909;
      var19 = var10000;

      for (int var10 = (var19 | var20) - (var19 & var20); var10 < var6.length; var10++) {
         var10000 = (int)-4715362341886157411L;
         var20 = -1331226326;
         var19 = var10000;
         var10000 = var19 & ~var20 | ~var19 & var20;
         var20 = 1243951532;
         var19 = var10000;
         var10000 = (var19 | var20) & ~(var19 & var20);
         var10000 = (int)1972679408391809398L;
         var20 = 340777872;
         var19 = var10000;
         var10000 = (var19 | var20) - (var19 & var20);
         var20 = 1119918983;
         var19 = var10000;
         int var18 = var19 & ~var20 | ~var19 & var20;
         a = var18;
         var20 = 549309752;
         var19 = -873615692;
         var10000 = var19 + var20 - 2 * (var19 & var20);
         var20 = 2113328405;
         var19 = var10000;
         var10000 = (var19 + var20 - 2 * (var19 & var20)) * (var19 + var20 - 2 * (var19 & var20));
         var10000 = (int)-7912185750899631645L;
         var20 = 260348387;
         var19 = var10000;
         var10000 = (var19 | var20) & (~var19 | ~var20);
         var20 = -792689939;
         var19 = var10000;
         if ((var19 | var20) - (var19 & var20) <= a) {
            throw new ExceptionInInitializerError();
         }

         char var346 = var6[var10];
         char var263 = var8[var10 % var8.length];
         char var136 = var346;
         var7[var10] = (char)((var136 | var263) & (~var136 | ~var263));
      }

      char[] var21 = new char[var7.length];
      var20 = -959998714;
      var19 = 379833809;
      var10000 = (var19 | var20) & (~var19 | ~var20);
      var20 = -798730025;
      var19 = var10000;

      for (int var11 = (var19 | var20) & (~var19 | ~var20); var11 < var6.length; var11++) {
         char var347 = var7[var11];
         char var266 = var9[var11 % var9.length];
         char var139 = var347;
         var21[var11] = (char)((var139 | var266) & ~(var139 & var266));
      }

      String var22 = new String(var21);
      int var12 = var22.hashCode();
      var20 = var5;
      var19 = var3;
      var10000 = (var19 & ~var20) - (~var19 & var20);
      var20 = var2;
      var19 = var10000;
      int var13 = 2 * (var19 & ~var20) - (var19 ^ var20);
      char[] var14 = var0.toCharArray();
      char[] var15 = new char[var14.length];
      var10000 = (int)-2141999659363504989L;
      var20 = 240183768;
      var19 = var10000;
      var10000 = (var19 | var20) & ~(var19 & var20);
      var20 = -1796110981;
      var19 = var10000;

      for (int var16 = var19 & ~var20 | ~var19 & var20; var16 < var15.length; var16++) {
         var20 = 1804792623;
         var19 = 788214299;
         int var10001 = var19 & ~var20 | ~var19 & var20;
         var20 = 1164558646;
         var19 = var10001;
         switch (var16 % ((var19 | var20) - (var19 & var20))) {
            case 0:
               var20 = var12;
               var19 = var13;
               var10002 = (var19 | var20) - (var19 & var20);
               char var276 = var14[var16];
               var19 = var10002;
               var15[var16] = (char)(var19 + var276 - 2 * (var19 & var276));
               break;
            case 1:
               var20 = var13;
               var19 = var5;
               var10002 = var19 + var20 - 2 * (var19 & var20);
               char var274 = var14[var16];
               var19 = var10002;
               var15[var16] = (char)(var19 + var274 - 2 * (var19 & var274));
         }
      }

      return new String(var15);
   }
}
