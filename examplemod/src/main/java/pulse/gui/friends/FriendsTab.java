package pulse;

import net.minecraft.client.util.math.MatrixStack;

public class FriendsTab implements TabHost, ClickGuiTab {
   private static final String[] a;
   private static final float b = 48.0F;
   private static final float c = 19.0F;
   private final TabSelector d = new TabSelector(this);
   private final FriendsPanel e = new FriendsPanel();
   private final PanelFadeOverlay f;
   private int g;
   private int h;

   public FriendsTab() {
      int var2 = -1243132596;
      int var1 = -1677021517;
      int var10003 = var1 & ~var2 | ~var1 & var2;
      var2 = 703456230;
      var1 = var10003;
      this.f = new PanelFadeOverlay((var1 | var2) & ~(var1 & var2), 10.0F, 7.5F);
   }

   @Override
   public String[] c() {
      return a;
   }

   @Override
   public int d() {
      int var2 = 1362226104;
      int var1 = -1943599267;
      int var10000 = var1 & ~var2 | ~var1 & var2;
      var2 = -585700123;
      var1 = var10000;
      return (var1 | var2) - (var1 & var2);
   }

   @Override
   public void a(int var1) {
   }

   @Override
   public void a(MatrixStack var1, Renderer2D var2, float var3, float var4, int var5, int var6) {
      this.g = var5;
      this.h = var6;
      float var7 = pulse.PulseClickGuiScreen.d();
      float var8 = pulse.PulseClickGuiScreen.e();
      this.f.a(var1, var2, var3, var4, var5, var6);
      this.e.a(var1, var2, var3, var4, var7, var8 - 48.0F - 5.0F, var5, var6, 1.0F);
   }

   @Override
   public void a(float var1, float var2, int var3, int var4) {
      this.e.a(var1, var2, pulse.PulseClickGuiScreen.d(), pulse.PulseClickGuiScreen.e() - 48.0F - 5.0F, var3, var4);
   }

   @Override
   public void b(float var1, float var2, int var3, int var4) {
   }

   @Override
   public void c(float var1, float var2, int var3, int var4) {
      this.e.a(var3, var4);
   }

   @Override
   public void a(float var1, float var2, int var3, int var4, double var5, double var7) {
      this.e.a(var3, var4, var5, var7);
   }

   @Override
   public void a(float var1) {
      this.e.a(var1, this.g, this.h);
   }

   @Override
   public boolean a(int var1, int var2, int var3) {
      return this.e.a(var1, var2, var3);
   }

   @Override
   public boolean b() {
      return this.e.c();
   }

   public boolean a(char var1, int var2) {
      return this.e.a(var1, var2);
   }

   @Override
   public ClickGuiTabType a() {
      return ClickGuiTabType.FRIENDS;
   }

   public FriendsPanel e() {
      return this.e;
   }

   static {
      int var1 = 312033308;
      int var0 = -50128190;
      int var10000 = (var0 | var1) & ~(var0 & var1);
      var1 = -275096865;
      var0 = var10000;
      String[] var24 = new String[(var0 | var1) & ~(var0 & var1)];
      int var10002 = (int)1889054756013250430L;
      var1 = 1530543261;
      var0 = var10002;
      var10002 = (var0 | var1) & (~var0 | ~var1);
      var1 = -430658589;
      var0 = var10002;
      var10002 = (var0 | var1) - (var0 & var1);
      var1 = -490932678;
      var0 = -1638743718;
      int var10005 = var0 & ~var1 | ~var0 & var1;
      var1 = -1998286332;
      var0 = var10005;
      var10005 = var0 & ~var1 | ~var0 & var1;
      var1 = -1965833853;
      var0 = 292423274;
      int var10006 = var0 + var1 - 2 * (var0 & var1);
      var1 = 462980548;
      var0 = var10006;
      var10006 = var0 + var1 - 2 * (var0 & var1);
      int var10007 = (int)-5858155516285360606L;
      var1 = -9916402;
      var0 = var10007;
      var10007 = var0 + var1 - 2 * (var0 & var1);
      var1 = 1686836215;
      var0 = var10007;
      var10007 = var0 + var1 - 2 * (var0 & var1);
      var1 = -848884313;
      var0 = -380410989;
      int var10008 = (var0 | var1) & (~var0 | ~var1);
      var1 = 607182868;
      var0 = var10008;
      var24[var10002] = b("꿬蒶꿵蓈꿳蒳꯭蒽꾍蓊꿺蒼꿴", "`ꟳꓺꁡꤐ絺蹙⑿譸㑴~\ua7ef꒶ꁺ꤂絣蹃\u2435謺㑲|ꟳꓺꁷꤗ絿蹏⑴謳㑤=Ꟁ꒧ꁸ꤀絸蹎⑩謚㑲|ꟳ", var10005, var10006, var10007, (var0 | var1) - (var0 & var1));
      a = var24;
   }

   public static String b(String var0, String var1, int var2, int var3, int var4, int var5) {
      char[] var6 = var1.toCharArray();
      char[] var7 = new char[var6.length];
      int var10000 = (int)6353406605848032917L;
      int var18 = -1198486893;
      int var17 = var10000;
      var10000 = var17 + var18 - 2 * (var17 & var18);
      var18 = -677266420;
      var17 = var10000;
      char[] var220 = new char[(var17 | var18) & ~(var17 & var18)];
      int var10002 = (int)7681060949724600935L;
      var18 = -1675760876;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 1114141043;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      int var10003 = (int)-3966299170470792852L;
      var18 = -1737866323;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -1354532109;
      var17 = var10003;
      var220[var10002] = (char)((var17 | var18) - (var17 & var18));
      var18 = 1859163428;
      var17 = -878467813;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1519177666;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)-3891161432748597236L;
      var18 = 2016439208;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1969334305;
      var17 = var10003;
      var220[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var10002 = (int)2082498719568671883L;
      var18 = -1510565385;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -319935106;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -309520749;
      var17 = 729289409;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -957012012;
      var17 = var10003;
      var220[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var10002 = (int)-2543944410572283832L;
      var18 = 1282848685;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 990451686;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1579600345;
      var17 = -681361975;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1991939069;
      var17 = var10003;
      var220[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var10002 = (int)-5730553973684631289L;
      var18 = -22100747;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 788385270;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var10003 = (int)-559443057747015598L;
      var18 = 1833047195;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -1414738452;
      var17 = var10003;
      var220[var10002] = (char)((var17 | var18) - (var17 & var18));
      var10002 = (int)8985110938071845174L;
      var18 = -75267014;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -121877239;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 2120652916;
      var17 = -105712821;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -2016137539;
      var17 = var10003;
      var220[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var10002 = (int)-608474241115728962L;
      var18 = 105768139;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -853559437;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -1300299846;
      var17 = 1995688058;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -997376301;
      var17 = var10003;
      var220[var10002] = (char)((var17 | var18) - (var17 & var18));
      var18 = 2114337019;
      var17 = -644504697;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -1483498629;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 816982490;
      var17 = -1257493613;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -2051131797;
      var17 = var10003;
      var220[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var10002 = (int)-4334598561598635745L;
      var18 = -426673970;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 225442265;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)1491060208857844251L;
      var18 = 1393768993;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 1956788329;
      var17 = var10003;
      var220[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var10002 = (int)-9083028512164907657L;
      var18 = 454346570;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 884912692;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)2188623797255628400L;
      var18 = -1237832308;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -665105192;
      var17 = var10003;
      var220[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      char[] var8 = var220;
      var18 = 7603846;
      var17 = -1342491160;
      var10000 = (var17 | var18) & ~(var17 & var18);
      var18 = -1349569692;
      var17 = var10000;
      char[] var222 = new char[var17 + var18 - 2 * (var17 & var18)];
      var10002 = (int)-4905212221077551917L;
      var18 = -1756330490;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -644611371;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -266150932;
      var17 = 41104485;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -229529687;
      var17 = var10003;
      var222[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var10002 = (int)-1393363208794734904L;
      var18 = -291473320;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -1374648687;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var10003 = (int)4641459616611476420L;
      var18 = 486117087;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 462137624;
      var17 = var10003;
      var222[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var18 = 986957786;
      var17 = 1334793422;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 1969001238;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var10003 = (int)3491737239974322614L;
      var18 = -284532536;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -492386771;
      var17 = var10003;
      var222[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var10002 = (int)-5330145851715406933L;
      var18 = -1257806206;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 645682474;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 1193328259;
      var17 = 941521779;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 2134834674;
      var17 = var10003;
      var222[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var10002 = (int)-5942769492309058389L;
      var18 = -1073749561;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -1155777176;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1281869865;
      var17 = 1559140689;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -277440826;
      var17 = var10003;
      var222[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var10002 = (int)1096053082729780960L;
      var18 = -1973342641;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 829798570;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)6152287554375804758L;
      var18 = -1120907551;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -2020601565;
      var17 = var10003;
      var222[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var10002 = (int)5454069028503993775L;
      var18 = -9456733;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -1893790198;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var10003 = (int)1794128687330133634L;
      var18 = 1162449357;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1424986230;
      var17 = var10003;
      var222[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var10002 = (int)4170671094905685346L;
      var18 = -1195507003;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -966146144;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)3242154197270728619L;
      var18 = -1410555731;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 951172926;
      var17 = var10003;
      var222[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var10002 = (int)2900491699521317774L;
      var18 = -1901664888;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -1052176882;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 1940738313;
      var17 = -1320406119;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -1025384044;
      var17 = var10003;
      var222[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var10002 = (int)-2622851168256424157L;
      var18 = 363081543;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 1560258669;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -532606009;
      var17 = -1198484359;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 1490138253;
      var17 = var10003;
      var222[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      char[] var9 = var222;
      var18 = -441528502;
      var17 = -153974239;
      var10000 = var17 + var18 - 2 * (var17 & var18);
      var18 = 326911339;
      var17 = var10000;

      for (int var10 = (var17 | var18) & ~(var17 & var18); var10 < var6.length; var10++) {
         char var284 = var6[var10];
         char var205 = var8[var10 % var8.length];
         char var106 = var284;
         var7[var10] = (char)((var106 | var205) - (var106 & var205));
      }

      char[] var19 = new char[var7.length];
      var18 = 113499563;
      var17 = 578094934;
      var10000 = (var17 | var18) & (~var17 | ~var18);
      var18 = 615963389;
      var17 = var10000;

      for (int var11 = (var17 | var18) - (var17 & var18); var11 < var6.length; var11++) {
         char var285 = var7[var11];
         char var208 = var9[var11 % var9.length];
         char var109 = var285;
         var19[var11] = (char)((var109 | var208) & ~(var109 & var208));
      }

      String var20 = new String(var19);
      int var12 = var20.hashCode();
      var18 = var5;
      var17 = var3;
      var10000 = (var17 ^ var18) - 2 * (~var17 & var18);
      var18 = var2;
      var17 = var10000;
      int var13 = 2 * (var17 & ~var18) - (var17 ^ var18);
      char[] var14 = var0.toCharArray();
      char[] var15 = new char[var14.length];
      var10000 = (int)-7722745496157760986L;
      var18 = 63344467;
      var17 = var10000;
      var10000 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1493327221;
      var17 = var10000;

      for (int var16 = (var17 | var18) & ~(var17 & var18); var16 < var15.length; var16++) {
         var18 = -1822743692;
         var17 = -2098318304;
         int var10001 = (var17 | var18) & (~var17 | ~var18);
         var18 = 297080662;
         var17 = var10001;
         switch (var16 % ((var17 | var18) - (var17 & var18))) {
            case 0:
               var18 = var12;
               var17 = var13;
               var10002 = (var17 | var18) - (var17 & var18);
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
               var15[var16] = (char)(var17 + var216 - 2 * (var17 & var216));
         }
      }

      return new String(var15);
   }
}
