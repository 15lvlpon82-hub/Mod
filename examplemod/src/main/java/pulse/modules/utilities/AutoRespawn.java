package pulse;



import pulse.module.ClientModule;
import pulse.module.ModuleInfo;
import pulse.module.ModuleCategory;
import pulse.settings.BooleanSetting;
import pulse.settings.TokenSetting;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.client.gui.screen.DeathScreen;
import net.minecraft.client.gui.widget.ButtonWidget;

@ModuleInfo(a = "Auto Respawn", b = "Автоматически возрождает игрока после смерти", c = ModuleCategory.UTILITIES)
public class AutoRespawn extends ClientModule {
   private final BooleanSetting e;
   private final BooleanSetting f;
   private final TokenSetting g;
   private boolean h;
   private boolean i;
   private int j;
   public static int a;
   public static boolean b;

   public AutoRespawn() {
      int var2 = 992735400;
      int var1 = 516653748;
      int var10004 = (var1 | var2) - (var1 & var2);
      var2 = 635466261;
      var1 = var10004;
      var10004 = (var1 | var2) & (~var1 | ~var2);
      var10004 = (int)-2827392770341420329L;
      var2 = -113927723;
      var1 = var10004;
      var10004 = (var1 | var2) & ~(var1 & var2);
      var2 = -1837147390;
      var1 = var10004;
      var10004 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1542296817;
      var1 = 1265503473;
      var10004 = var1 & ~var2 | ~var1 & var2;
      var2 = -277059593;
      var1 = var10004;
      var10004 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1023506777;
      var1 = -503330311;
      var10004 = var1 + var2 - 2 * (var1 & var2);
      var2 = 587288414;
      var1 = var10004;
      var10004 = (var1 | var2) - (var1 & var2);
      String var278 = "caq";
      var2 = -1907275254;
      var1 = -1849764663;
      int var10005 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1066843333;
      var1 = var10005;
      var10005 = (var1 | var2) - (var1 & var2);
      var10005 = (int)-1350681659367707774L;
      var2 = 568294489;
      var1 = var10005;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var2 = 55714601;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      String var10006 = "car";
      var2 = 1374400029;
      var1 = 1016203445;
      int var327 = (var1 | var2) - (var1 & var2);
      var2 = 1134352728;
      var1 = var327;
      int var328 = (var1 | var2) & ~(var1 & var2);
      int var10007 = (int)3795867243377665681L;
      var2 = -1449516905;
      var1 = var10007;
      var10007 = (var1 | var2) & ~(var1 & var2);
      var2 = -172744102;
      var1 = var10007;
      var10007 = ((var1 | var2) & ~(var1 & var2)) * ((var1 | var2) & ~(var1 & var2));
      var10007 = (int)-8862732516207883636L;
      var2 = -821549282;
      var1 = var10007;
      var10007 = (var1 | var2) & ~(var1 & var2);
      var2 = 1972441920;
      var1 = var10007;
      var10007 = var1 & ~var2 | ~var1 & var2;
      int var10008 = (int)2558708235182359263L;
      var2 = -1423844946;
      var1 = var10008;
      var10008 = (var1 | var2) - (var1 & var2);
      var2 = -1266118112;
      var1 = var10008;
      var10008 = var1 + var2 - 2 * (var1 & var2);
      var2 = 689014066;
      var1 = 2011902265;
      int var10009 = var1 & ~var2 | ~var1 & var2;
      var2 = -1773433840;
      var1 = var10009;
      var2 = (var1 | var2) - (var1 & var2);
      var1 = var10008;
      var10008 = (var1 | var2) + (var1 & var2);
      var10008 = (int)4503194488532940903L;
      var2 = -576842413;
      var1 = var10008;
      var10008 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1641601608;
      var1 = var10008;
      String var10003 = c(
         "\uf290軌\uf2c2軀\uf6a0軌\uf2be軉\uf2c0軀\uf2b6車\uf2b5軃\uf2b8軋",
         "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=Ꟈ꒠ꁥꤊ組蹏⑩謧㑶e\ua7e8꒘ꁾ꤁絣蹆⑿",
         var10005,
         var328,
         var10007,
         (var1 | var2) & ~(var1 & var2)
      );
      var10004 = (int)6873342425406313275L;
      var2 = 632894038;
      var1 = var10004;
      var10004 = (var1 | var2) & ~(var1 & var2);
      var2 = -1275136465;
      var1 = var10004;
      var10004 = var1 + var2 - 2 * (var1 & var2);
      var10005 = (int)-2181053558161909747L;
      var2 = 1930448878;
      var1 = var10005;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = 580524848;
      var1 = var10005;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var10006 = "cas";
      int var330 = (int)-1275154642351568948L;
      var2 = -1745138763;
      var1 = var330;
      int var331 = var1 & ~var2 | ~var1 & var2;
      var2 = -1991804789;
      var1 = var331;
      int var332 = var1 & ~var2 | ~var1 & var2;
      String var352 = "cat";
      var2 = -415825708;
      var1 = -1392279774;
      var10007 = (var1 | var2) - (var1 & var2);
      var2 = 1691493633;
      var1 = var10007;
      var10007 = (var1 | var2) & ~(var1 & var2);
      String var378 = "cau";
      var10008 = (int)7802755747146240614L;
      var2 = 1005721251;
      var1 = var10008;
      var10008 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1015090458;
      var1 = var10008;
      var10008 = (var1 | var2) - (var1 & var2);
      var10009 = (int)950130398769472095L;
      var2 = 1425686478;
      var1 = var10009;
      var10009 = (var1 | var2) - (var1 & var2);
      var2 = 2034325595;
      var1 = var10009;
      var10009 = var1 + var2 - 2 * (var1 & var2);
      var10009 = (int)78054167548388105L;
      var2 = -140879104;
      var1 = var10009;
      var10009 = (var1 | var2) - (var1 & var2);
      var2 = -430580838;
      var1 = var10009;
      String var282 = c(
         "\uf290旓\uf2c2旟\uf2bc旑\uf2c2旙\uf2c7旔\uf2c1旛\uf2b8懁\uf2b2旟\uf2b7斡\uf2be旗\uf2b4旑\uf2c2断\uf2c1斮\uf6a0旞\uf2be斠\uf2bb旔\uf6a0斠\uf2bc旔\uf2c0斣\uf2b8",
         "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=Ꟈ꒠ꁥꤊ組蹏⑩謧㑶e\ua7e8꒘ꁾ꤁絣蹆⑿",
         var332,
         var10007,
         var10008,
         (var1 | var2) & (~var1 | ~var2)
      );
      var2 = 582419475;
      var1 = 575966956;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = 14912254;
      var1 = var10005;
      this.e = new BooleanSetting(var10003, var282, pulse.Bool.from(var1 + var2 - 2 * (var1 & var2)));
      var10003 = "cav";
      var2 = -1212483166;
      var1 = -415236423;
      var10005 = (var1 | var2) - (var1 & var2);
      var2 = 1350895376;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var10005 = (int)3871076296510940872L;
      var2 = -1693775552;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = 619917185;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      String var301 = "caw";
      var10005 = (int)-7837860918842037313L;
      var2 = 216459352;
      var1 = var10005;
      var10005 = (var1 | var2) - (var1 & var2);
      var2 = -1423182059;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var10006 = "cax";
      int var334 = (int)412452630565570565L;
      var2 = 1205552447;
      var1 = var334;
      int var335 = var1 + var2 - 2 * (var1 & var2);
      var2 = 448059392;
      var1 = var335;
      int var336 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1404035727;
      var1 = 299869125;
      var10007 = (var1 | var2) & (~var1 | ~var2);
      var2 = -448282773;
      var1 = var10007;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      var2 = 117664926;
      var1 = -1166068761;
      var10008 = (var1 | var2) & ~(var1 & var2);
      var2 = -667880361;
      var1 = var10008;
      var2 = (var1 | var2) - (var1 & var2);
      var1 = var10007;
      var10007 = 2 * (var1 | var2) - (var1 ^ var2);
      var2 = -1022868919;
      var1 = 1512332270;
      var10007 = (var1 | var2) & (~var1 | ~var2);
      var2 = -2117609339;
      var1 = var10007;
      var10007 = (var1 | var2) & (~var1 | ~var2);
      String var383 = "cay";
      var2 = 396032181;
      var1 = -1013568627;
      var10008 = (var1 | var2) & ~(var1 & var2);
      var2 = -734654738;
      var1 = var10008;
      var10003 = c(
         "\uf29e\udbe6\uf2bf\udbe4\uf2b0\udb96\uf2bb\udbeb\uf2c2\udbe8\uf6a0\udb9e\uf2be\udb98\uf2b0\udb99\uf2b4\udbe7\uf6a0\udb9b\uf2be\udbe5\uf2bb\udb91\uf6a0\udb96\uf2be\udb93\uf2c0\udb9a\uf2b6\udb90\uf2b5\udb99\uf2b8\udbeb",
         "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=Ꟈ꒠ꁥꤊ組蹏⑩謧㑶e\ua7e8꒘ꁾ꤁絣蹆⑿",
         var10005,
         var336,
         var10007,
         (var1 | var2) - (var1 & var2)
      );
      var2 = -2058120628;
      var1 = 1302775259;
      var10005 = (var1 | var2) - (var1 & var2);
      var2 = -923445371;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var10005 = (int)-7905253053630158820L;
      var2 = -772086904;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var2 = -1757967471;
      var1 = var10005;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = -1912937777;
      var1 = 1769983422;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = -461033607;
      var1 = var10005;
      var10005 = (var1 | var2) - (var1 & var2);
      var2 = -1297419434;
      var1 = 1939180285;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1052804680;
      var1 = var10005;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var10005 = (int)-9755519307248680L;
      var2 = -801300508;
      var1 = var10005;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = 1616804251;
      var1 = var10005;
      var10005 = (var1 | var2) - (var1 & var2);
      int var337 = (int)-4459613708724562285L;
      var2 = -735972251;
      var1 = var337;
      int var338 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1743872902;
      var1 = var338;
      int var339 = var1 + var2 - 2 * (var1 & var2);
      var2 = 35527385;
      var1 = -1419389344;
      int var340 = var1 & ~var2 | ~var1 & var2;
      var2 = 1798715467;
      var1 = var340;
      int var341 = (var1 | var2) - (var1 & var2);
      var2 = -1072074416;
      var1 = 109700605;
      var10007 = (var1 | var2) - (var1 & var2);
      var2 = 106465602;
      var1 = var10007;
      var10007 = ((var1 | var2) & ~(var1 & var2)) * ((var1 | var2) & ~(var1 & var2));
      var2 = -884092816;
      var1 = -2049834155;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1615511949;
      var1 = var10007;
      var10007 = (var1 | var2) & ~(var1 & var2);
      var2 = 138098994;
      var1 = 986036696;
      var10008 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1094760014;
      var1 = var10008;
      var10008 = (var1 | var2) - (var1 & var2);
      var2 = -2127243246;
      var1 = -1285556195;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var2 = -1868555229;
      var1 = var10009;
      var2 = (var1 | var2) & ~(var1 & var2);
      var1 = var10008;
      var10008 = (var1 & ~var2) + (var2 & ~var1) + 2 * (var1 & var2);
      var2 = 1749336608;
      var1 = 1259947298;
      var10008 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1033021517;
      var1 = var10008;
      var10008 = (var1 | var2) - (var1 & var2);
      String var404 = "caz";
      var10009 = (int)1817757229579193127L;
      var2 = -155500006;
      var1 = var10009;
      var10009 = (var1 | var2) & (~var1 | ~var2);
      var2 = 845484665;
      var1 = var10009;
      String var283 = c(
         "\uf29eᵴ\uf2bfᵶ\uf2b0ᴄ\uf2bbᵹ\uf2c2ᵺ\uf6a0ᴌ\uf2beᴊ\uf2b0ᴋ\uf2b4ᵵ\uf6a0ᴉ\uf2beᵷ\uf2bbᴃ\uf6a0ᴄ\uf2beᴁ\uf2c0ᴈ\uf2b6ᴂ\uf2b5ᴋ\uf2b8ᵹ",
         "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=Ꟈ꒠ꁥꤊ組蹏⑩謧㑶e\ua7e8꒘ꁾ꤁絣蹆⑿",
         var341,
         var10007,
         var10008,
         var1 & ~var2 | ~var1 & var2
      );
      var2 = -1241190027;
      var1 = 1617053171;
      var10005 = (var1 | var2) - (var1 & var2);
      var2 = -697912186;
      var1 = var10005;
      this.f = new BooleanSetting(var10003, var283, pulse.Bool.from((var1 | var2) & (var1 & var2 ^ -1)));
      var10003 = "cba";
      var10004 = (int)2855606793271246639L;
      var2 = -2131541775;
      var1 = var10004;
      var10004 = var1 + var2 - 2 * (var1 & var2);
      var2 = -2125225982;
      var1 = var10004;
      var10004 = ((var1 | var2) & (~var1 | ~var2)) * ((var1 | var2) & (~var1 | ~var2));
      var10005 = (int)-299917213383716629L;
      var2 = 1625262359;
      var1 = var10005;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = -584860793;
      var1 = var10005;
      var10005 = ((var1 | var2) & ~(var1 & var2)) * ((var1 | var2) & ~(var1 & var2));
      var10005 = (int)-1119408169172554693L;
      var2 = 951912807;
      var1 = var10005;
      var10005 = (var1 | var2) - (var1 & var2);
      var2 = -1891872338;
      var1 = var10005;
      var10005 = (var1 | var2) - (var1 & var2);
      var2 = 1762971984;
      var1 = 2118714122;
      int var342 = var1 + var2 - 2 * (var1 & var2);
      var2 = 571535799;
      var1 = var342;
      int var343 = (var1 | var2) - (var1 & var2);
      int var344 = (int)4037036909890789937L;
      var2 = -1769100617;
      var1 = var344;
      int var345 = var1 & ~var2 | ~var1 & var2;
      var2 = -1753626072;
      var1 = var345;
      int var346 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1524586872;
      var1 = 556012740;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      var2 = 2039471463;
      var1 = var10007;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1629396065;
      var1 = 523664522;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var2 = -1813204012;
      var1 = var10007;
      var10007 = (var1 | var2) & ~(var1 & var2);
      var2 = -1731762988;
      var1 = -1152239045;
      var10008 = var1 & ~var2 | ~var1 & var2;
      var2 = -1832649660;
      var1 = var10008;
      var10008 = (var1 | var2) - (var1 & var2);
      var2 = 1740931646;
      var1 = 2005462500;
      var10009 = (var1 | var2) - (var1 & var2);
      var2 = -66505643;
      var1 = var10009;
      var2 = var1 + var2 - 2 * (var1 & var2);
      var1 = var10008;
      var10008 = (var1 ^ var2) + 2 * (var1 & var2);
      var10008 = (int)-4712635202003261313L;
      var2 = 2020298058;
      var1 = var10008;
      var10008 = (var1 | var2) & ~(var1 & var2);
      var2 = -455250305;
      var1 = var10008;
      var10003 = c(
         "\uf29aആ\uf2bcഈ\uf2bdഌ\uf2b0",
         "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=Ꟈ꒠ꁥꤊ組蹏⑩謧㑶e\ua7e8꒘ꁾ꤁絣蹆⑿",
         var10005,
         var346,
         var10007,
         (var1 | var2) & ~(var1 & var2)
      );
      TokenSetting.TokenType var287 = TokenSetting.TokenType.COMMAND;
      var10005 = (int)-4558457997711157353L;
      var2 = -1794791669;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var2 = -1129518465;
      var1 = var10005;
      var10005 = (var1 + var2 - 2 * (var1 & var2)) * (var1 + var2 - 2 * (var1 & var2));
      var2 = -129534718;
      var1 = 1832277943;
      var10007 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1787747659;
      var1 = var10007;
      var10007 = (var1 | var2) - (var1 & var2);
      String var370 = "cbb";
      var2 = -534384381;
      var1 = 111571386;
      var10007 = (var1 | var2) - (var1 & var2);
      var2 = 617509963;
      var1 = var10007;
      var10007 = (var1 | var2) - (var1 & var2);
      var10009 = (int)1667197991713308349L;
      var2 = 1954306246;
      var1 = var10009;
      var10009 = (var1 | var2) - (var1 & var2);
      var2 = -164845973;
      var1 = var10009;
      var10009 = var1 & ~var2 | ~var1 & var2;
      var10008 = (int)7265332922350719485L;
      var2 = -2017813714;
      var1 = var10008;
      var10008 = (var1 | var2) & ~(var1 & var2);
      var2 = 49446263;
      var1 = var10008;
      var10008 = (var1 | var2) - (var1 & var2);
      int var10010 = (int)-287202071357968885L;
      var2 = 1635226501;
      var1 = var10010;
      var10010 = var1 & ~var2 | ~var1 & var2;
      var2 = -1132184163;
      var1 = var10010;
      var10010 = (var1 | var2) & ~(var1 & var2);
      var2 = -1571641170;
      var1 = 1454005347;
      var10010 = var1 + var2 - 2 * (var1 & var2);
      var2 = -185010994;
      var1 = var10010;
      var10010 = var1 + var2 - 2 * (var1 & var2);
      var10010 = (int)7280831202739893548L;
      var2 = -1077578168;
      var1 = var10010;
      var10010 = (var1 | var2) & ~(var1 & var2);
      var2 = -81706136;
      var1 = var10010;
      var10010 = (var1 | var2) - (var1 & var2);
      var10009 = (int)-3822522546672523623L;
      var2 = 1878718428;
      var1 = var10009;
      var10009 = (var1 | var2) & ~(var1 & var2);
      var2 = 1949549256;
      var1 = var10009;
      var10009 = (var1 | var2) - (var1 & var2);
      var2 = -1067305802;
      var1 = -1699841136;
      var10010 = var1 & ~var2 | ~var1 & var2;
      var2 = -597101395;
      var1 = var10010;
      var10010 = (var1 | var2) & ~(var1 & var2);
      var2 = 1320561328;
      var1 = 1034768211;
      var10010 = (var1 | var2) & ~(var1 & var2);
      var2 = 1932371363;
      var1 = var10010;
      this.g = new TokenSetting(
            var10003,
            var287,
            c(
               "\uf6af쉚\uf6ef쉟\uf6e5",
               "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=Ꟈ꒠ꁥꤊ組蹏⑩謧㑶e\ua7e8꒘ꁾ꤁絣蹆⑿",
               var10007,
               var10008,
               var10009,
               var1 + var2 - 2 * (var1 & var2)
            )
         )
         .a(this.f::k);
      int var10001 = (int)5127173210034247472L;
      var2 = 485115808;
      var1 = var10001;
      var10001 = var1 & ~var2 | ~var1 & var2;
      var2 = -2129145712;
      var1 = var10001;
      this.h = pulse.Bool.from((var1 | var2) - (var1 & var2));
   }

   @EventHandler
   public void a(PlayerDeathEvent var1) {
      if (var1.a() == c.player) {
         int var10001 = (int)3354441672821525809L;
         int var3 = -784489248;
         int var2 = var10001;
         var10001 = var2 & ~var3 | ~var2 & var3;
         var3 = 427223504;
         var2 = var10001;
         this.i = pulse.Bool.from(var2 & ~var3 | ~var2 & var3);
      }
   }

   @EventHandler
   public void a(ClientTickEvent var1) {
      if (c.player != null && c.world != null) {
         if (c.currentScreen instanceof DeathScreen) {
            int var10002 = (int)8595329910095522705L;
            int var6 = -1091431522;
            int var5 = var10002;
            var10002 = (var5 | var6) & ~(var5 & var6);
            var6 = -595937266;
            var5 = var10002;
            var6 = (var5 | var6) - (var5 & var6);
            var5 = this.j;
            this.j = 2 * (var5 | var6) - (var5 ^ var6);
         }

         if (this.i && !(c.currentScreen instanceof DeathScreen)) {
            int var10001 = (int)3342861435259811494L;
            int var27 = 1203047792;
            int var9 = var10001;
            var10001 = var9 + var27 - 2 * (var9 & var27);
            var27 = -642352184;
            var9 = var10001;
            if (c.player.age > ((var9 | var27) & (~var9 | ~var27))) {
               ChatMessages.a(this.g.a());
               var27 = 244003680;
               var9 = 134260295;
               var10001 = (var9 | var27) - (var9 & var27);
               var27 = 109810983;
               var9 = var10001;
               this.i = pulse.Bool.from(var9 + var27 - 2 * (var9 & var27));
               var10001 = (int)288800248621746353L;
               var27 = -1238964776;
               var9 = var10001;
               var10001 = var9 + var27 - 2 * (var9 & var27);
               var27 = 1879190889;
               var9 = var10001;
               this.j = (var9 | var27) & ~(var9 & var27);
            }
         }

         if (!(c.currentScreen instanceof DeathScreen var2)) {
            if (!this.h) {
               if (b) {
                  int var10000 = (int)-2077249466041494503L;
                  int var33 = -1248155736;
                  int var15 = var10000;
                  var10000 = (var15 | var33) - (var15 & var33);
                  var33 = 402347057;
                  var15 = var10000;
                  var10000 = var15 & ~var33 | ~var15 & var33;
                  var33 = -2025087149;
                  var15 = -1507726046;
                  var10000 = (var15 | var33) & ~(var15 & var33);
                  var33 = -874934350;
                  var15 = var10000;
                  int var4 = (var15 | var33) - (var15 & var33);
               }
            } else if (c.player.isAlive()) {
               int var37 = 791553723;
               int var19 = 2072330073;
               int var50 = var19 + var37 - 2 * (var19 & var37);
               var37 = 1420499426;
               var19 = var50;
               this.h = pulse.Bool.from(var19 & ~var37 | ~var19 & var37);
               if (this.f.k() && !this.g.a().isEmpty()) {
                  ChatMessages.a(this.g.a());
               }
            }
         } else {
            if (!this.h) {
               int var51 = (int)-407195565680436807L;
               int var39 = 945360028;
               int var21 = var51;
               var51 = var21 & ~var39 | ~var21 & var39;
               var39 = 1641665828;
               var21 = var51;
               this.h = pulse.Bool.from(var21 & ~var39 | ~var21 & var39);
            }

            if (this.e.k() && this.a(var2)) {
               c.player.requestRespawn();
               c.currentScreen = null;
               int var41 = -909755166;
               int var23 = -2056418352;
               int var53 = (var23 | var41) & ~(var23 & var41);
               var41 = 1286321970;
               var23 = var53;
               this.j = var23 + var41 - 2 * (var23 & var41);
            }
         }
      }
   }

   private boolean a(DeathScreen var1) {
      try {
         for (Object var3 : var1.children()) {
            if (var3 instanceof ButtonWidget var4 && var4.active) {
               int var14 = -739895910;
               int var9 = -904379965;
               int var18 = (var9 | var14) & (~var9 | ~var14);
               var14 = 436098136;
               var9 = var18;
               return pulse.Bool.from((var9 | var14) & (var9 ^ -1 | var14 ^ -1));
            }
         }
      } catch (Exception var7) {
         int var6 = 2093257236;
         int var5 = 1122616286;
         int var10000 = var5 + var6 - 2 * (var5 & var6);
         var6 = 1043157450;
         var5 = var10000;
         return pulse.Bool.from(var5 + var6 - 2 * (var5 & var6));
      }

      int var19 = (int)5468857368241319179L;
      int var16 = 842808963;
      int var11 = var19;
      var19 = var11 & ~var16 | ~var11 & var16;
      var16 = 728830856;
      var11 = var19;
      return pulse.Bool.from(var11 + var16 - 2 * (var11 & var16));
   }

   @Override
   public void f() {
      super.f();
      int var2 = -581434901;
      int var1 = 444704632;
      int var10001 = (var1 | var2) - (var1 & var2);
      var2 = -942037357;
      var1 = var10001;
      this.h = pulse.Bool.from(var1 + var2 - 2 * (var1 & var2));
   }

   public static String c(String var0, String var1, int var2, int var3, int var4, int var5) {
      char[] var6 = var1.toCharArray();
      char[] var7 = new char[var6.length];
      int var10000 = (int)-3627369417756457566L;
      int var20 = 1648348339;
      int var19 = var10000;
      var10000 = (var19 | var20) - (var19 & var20);
      var20 = -742586085;
      var19 = var10000;
      char[] var322 = new char[(var19 | var20) & ~(var19 & var20)];
      int var10002 = (int)-510039123842217587L;
      var20 = 2145088466;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = -32621985;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      int var10003 = (int)-3001142544723555998L;
      var20 = -1912950679;
      var19 = var10003;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = 277492025;
      var19 = var10003;
      var322[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      var20 = 386666233;
      var19 = 1808226008;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = 2093701152;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var10003 = (int)-2932779117698022674L;
      var20 = 2145350164;
      var19 = var10003;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = 724718463;
      var19 = var10003;
      var322[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      var10002 = (int)-5332642893872413134L;
      var20 = 1864380592;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = -879135104;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = -198837382;
      var19 = -1769494599;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1654816581;
      var19 = var10003;
      var322[var10002] = (char)((var19 | var20) & ~(var19 & var20));
      var20 = 1732539197;
      var19 = -672959466;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = -1331230936;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var10003 = (int)3909523305694411540L;
      var20 = 20623211;
      var19 = var10003;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1920636069;
      var19 = var10003;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = 173193308;
      var19 = -378100786;
      int var10004 = (var19 | var20) & ~(var19 & var20);
      var20 = -951580620;
      var19 = var10004;
      var20 = var19 + var20 - 2 * (var19 & var20);
      var19 = var10003;
      var10003 = (var19 | var20) + (var19 & var20);
      var10003 = (int)830162878170788437L;
      var20 = 1362632361;
      var19 = var10003;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = 304968943;
      var19 = var10003;
      var322[var10002] = (char)((var19 | var20) & ~(var19 & var20));
      var10002 = (int)-2807816821517937219L;
      var20 = -1716717992;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = -1230871583;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = 607586430;
      var19 = -669311613;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = -334714420;
      var19 = var10003;
      var10003 = (var19 & ~var20 | ~var19 & var20) * (var19 & ~var20 | ~var19 & var20);
      var10003 = (int)-900025834945209456L;
      var20 = 975363794;
      var19 = var10003;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = -1320627097;
      var19 = var10003;
      var322[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      var10002 = (int)8794590038465642370L;
      var20 = -2040932894;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = -709416347;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = -1349588415;
      var19 = -2134046022;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = 792962425;
      var19 = var10003;
      var322[var10002] = (char)((var19 | var20) & ~(var19 & var20));
      var10002 = (int)2639001102371581295L;
      var20 = 1972528144;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = 824871289;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var10003 = (int)1729200118956129669L;
      var20 = -26478003;
      var19 = var10003;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1301974747;
      var19 = var10003;
      var322[var10002] = (char)((var19 | var20) - (var19 & var20));
      var20 = 338988288;
      var19 = 1972661301;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = 1637933362;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var10003 = (int)-6679722897442499426L;
      var20 = -1006628198;
      var19 = var10003;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = -1612336602;
      var19 = var10003;
      var322[var10002] = (char)((var19 | var20) & ~(var19 & var20));
      var10002 = (int)-8152190899483443436L;
      var20 = 993838372;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = -1809761736;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var10003 = (int)-3861514146585899548L;
      var20 = 186781377;
      var19 = var10003;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = -826799242;
      var19 = var10003;
      var322[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      var10002 = (int)6232464549890286632L;
      var20 = -1318334753;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = 34024190;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = 305718850;
      var19 = 1312483137;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = 1543636519;
      var19 = var10003;
      var322[var10002] = (char)((var19 | var20) - (var19 & var20));
      char[] var8 = var322;
      var20 = -1257185694;
      var19 = 126824443;
      var10000 = var19 & ~var20 | ~var19 & var20;
      var20 = -1298140781;
      var19 = var10000;
      char[] var324 = new char[var19 + var20 - 2 * (var19 & var20)];
      var20 = 1317570234;
      var19 = 642372890;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = 1757500320;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var10003 = (int)-5495943769113856062L;
      var20 = -747567797;
      var19 = var10003;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = 318978729;
      var19 = var10003;
      var324[var10002] = (char)((var19 | var20) - (var19 & var20));
      var10002 = (int)-5681205511845585439L;
      var20 = -1771894687;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = 1678824833;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = 1787169662;
      var19 = 2026846567;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = -749698278;
      var19 = var10003;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = 380530714;
      var19 = -450155687;
      var10004 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1149473341;
      var19 = var10004;
      var20 = var19 & ~var20 | ~var19 & var20;
      var19 = var10003;
      var10003 = (var19 & ~var20) + (var20 & ~var19) + 2 * (var19 & var20);
      var10003 = (int)1139379379055940263L;
      var20 = 329336151;
      var19 = var10003;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = 581506035;
      var19 = var10003;
      var324[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      var10002 = (int)-3191364582693189989L;
      var20 = 57387605;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = 279243980;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var10003 = (int)3156988271999745633L;
      var20 = -2042064913;
      var19 = var10003;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = -2015847739;
      var19 = var10003;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var10003 = (int)-5562446762834239363L;
      var20 = 1573830965;
      var19 = var10003;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = -1225775589;
      var19 = var10003;
      var324[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      var20 = 491833500;
      var19 = -50789766;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = -508966171;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = -910032251;
      var19 = 1939443136;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = -1168394425;
      var19 = var10003;
      var324[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      var10002 = (int)-3087580970696894348L;
      var20 = 228290917;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = 1338009877;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = -1164486043;
      var19 = 1498582145;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = -473567580;
      var19 = var10003;
      var324[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      var10002 = (int)4502800889434505996L;
      var20 = 1214055712;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = 492013097;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = -1817161408;
      var19 = -584920173;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = 1318238791;
      var19 = var10003;
      var324[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      var20 = 2082960130;
      var19 = -223688947;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = -1903315959;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      String var457 = "cbc";
      var10003 = (int)-2011923426825601495L;
      var20 = -645296022;
      var19 = var10003;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1431103866;
      var19 = var10003;
      var324[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      var20 = 1939019738;
      var19 = -241187910;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = -2113088409;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = -1253225573;
      var19 = 1135661134;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = -151155731;
      var19 = var10003;
      var324[var10002] = (char)((var19 | var20) - (var19 & var20));
      var20 = 66591890;
      var19 = 965729622;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = 980926924;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var10003 = (int)1766986783579378003L;
      var20 = -1617941845;
      var19 = var10003;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = 170769820;
      var19 = var10003;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = -1203905097;
      var19 = -614707449;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = 1667305908;
      var19 = var10003;
      var324[var10002] = (char)((var19 | var20) & ~(var19 & var20));
      var10002 = (int)-4961374223179405434L;
      var20 = -1902470978;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = -1157218511;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = -2101500068;
      var19 = -415802686;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = 1703595693;
      var19 = var10003;
      var324[var10002] = (char)((var19 | var20) & ~(var19 & var20));
      char[] var9 = var324;
      var20 = -1369241543;
      var19 = 1924186948;
      var10000 = (var19 | var20) & ~(var19 & var20);
      var20 = -590099587;
      var19 = var10000;
      int var10 = (var19 | var20) - (var19 & var20);
      int var10001 = (int)7922299756380435250L;
      var20 = -1744838028;
      var19 = var10001;
      var10001 = (var19 | var20) - (var19 & var20);
      var20 = -389557944;
      var19 = var10001;
      var10001 = (var19 | var20) & ~(var19 & var20);
      var20 = -370207461;
      var19 = -1701754740;
      var10001 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1937661319;
      var19 = var10001;
      var10001 = (var19 | var20) & (~var19 | ~var20);
      var10001 = (int)8825615736996236077L;
      var20 = 1990885427;
      var19 = var10001;
      var10001 = (var19 | var20) & (~var19 | ~var20);
      var20 = -647460073;
      var19 = var10001;
      var10001 = (var19 | var20) & ~(var19 & var20);
      var10000 = (int)-3558032782449320413L;
      var20 = 863440740;
      var19 = var10000;
      var10000 = (var19 | var20) & ~(var19 & var20);
      var20 = 1047882000;
      var19 = var10000;
      int var18 = var19 & ~var20 | ~var19 & var20;
      a = var18;
      var10001 = (int)9040360802584912628L;
      var20 = -445480679;
      var19 = var10001;
      var10001 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1644356585;
      var19 = var10001;
      var10001 = var19 & ~var20 | ~var19 & var20;
      var20 = -386974294;
      var19 = 317369362;
      var10001 = (var19 | var20) & ~(var19 & var20);
      var20 = -100298316;
      var19 = var10001;
      var10001 = var19 + var20 - 2 * (var19 & var20);
      var10001 = (int)-6275858231155319546L;
      var20 = -334943004;
      var19 = var10001;
      var10001 = (var19 | var20) & (~var19 | ~var20);
      var20 = 1666167270;
      var19 = var10001;
      var10001 = var19 & ~var20 | ~var19 & var20;
      var20 = 1515229376;
      var19 = -571317390;
      var10001 = (var19 | var20) - (var19 & var20);
      var20 = -2019363934;
      var19 = var10001;
      var10001 = (var19 | var20) & (~var19 | ~var20);
      var10000 = (int)8731317054540944236L;
      var20 = 831724802;
      var19 = var10000;
      var10000 = (var19 | var20) & (~var19 | ~var20);
      var20 = -597808470;
      var19 = var10000;
      if (((var19 | var20) & ~(var19 & var20)) < a) {
         var10000 = (int)7986694249591314172L;
         var20 = 1160226518;
         var19 = var10000;
         var10000 = (var19 | var20) & ~(var19 & var20);
         var20 = -467990287;
         var19 = var10000;
         var10000 = var19 + var20 - 2 * (var19 & var20);
         var20 = -625413671;
         var19 = -778531506;
         var10000 = (var19 | var20) & (~var19 | ~var20);
         var20 = -898734945;
         var19 = var10000;
         var18 = var19 + var20 - 2 * (var19 & var20);
         a = var18;
      }

      while (var10 < var6.length) {
         char var416 = var6[var10];
         char var296 = var8[var10 % var8.length];
         char var148 = var416;
         var7[var10] = (char)((var148 | var296) - (var148 & var296));
         var10++;
      }

      char[] var21 = new char[var7.length];
      var20 = -372328067;
      var19 = -2021711828;
      var10000 = (var19 | var20) & (~var19 | ~var20);
      var20 = 1857132881;
      var19 = var10000;
      int var11 = var19 & ~var20 | ~var19 & var20;
      var10001 = (int)8152212854773367490L;
      var20 = 1296283665;
      var19 = var10001;
      var10001 = var19 & ~var20 | ~var19 & var20;
      var20 = 1667267266;
      var19 = var10001;
      var10001 = (var19 | var20) & (~var19 | ~var20);
      var20 = -708702511;
      var19 = 1880026909;
      var10000 = (var19 | var20) & (~var19 | ~var20);
      var20 = -1659413815;
      var19 = var10000;
      var18 = var19 & ~var20 | ~var19 & var20;
      var20 = 1754157579;
      var19 = 546284754;
      var10000 = (var19 | var20) & (~var19 | ~var20);
      var20 = 1832615935;
      var19 = var10000;
      var10000 = (var19 | var20) - (var19 & var20);
      var20 = -1263882363;
      var19 = -1875849299;
      var10001 = (var19 | var20) - (var19 & var20);
      var20 = 1458446619;
      var19 = var10001;
      var20 = var19 & ~var20 | ~var19 & var20;
      var19 = var10000;
      var10000 = (var19 | var20) + (var19 & var20);
      var10000 = (int)6923408973921780858L;
      var20 = 1901914839;
      var19 = var10000;
      var10000 = (var19 | var20) & ~(var19 & var20);
      var20 = -209977801;
      var19 = var10000;
      if ((var19 | var20) - (var19 & var20) >= var18) {
         throw new IllegalAccessError();
      }

      while (var11 < var6.length) {
         char var417 = var7[var11];
         char var310 = var9[var11 % var9.length];
         char var162 = var417;
         var21[var11] = (char)((var162 | var310) & ~(var162 & var310));
         var11++;
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
      var20 = -1075348639;
      var19 = -983503581;
      var10000 = (var19 | var20) - (var19 & var20);
      var20 = 2055706178;
      var19 = var10000;

      for (int var16 = var19 + var20 - 2 * (var19 & var20); var16 < var15.length; var16++) {
         var20 = 846820590;
         var19 = -2071215908;
         var10001 = var19 & ~var20 | ~var19 & var20;
         var20 = -1225608144;
         var19 = var10001;
         switch (var16 % ((var19 | var20) - (var19 & var20))) {
            case 0:
               var20 = var12;
               var19 = var13;
               var10002 = (var19 | var20) - (var19 & var20);
               char var320 = var14[var16];
               var19 = var10002;
               var15[var16] = (char)((var19 | var320) - (var19 & var320));
               break;
            case 1:
               var20 = var13;
               var19 = var5;
               var10002 = (var19 | var20) & ~(var19 & var20);
               char var318 = var14[var16];
               var19 = var10002;
               var15[var16] = (char)(var19 + var318 - 2 * (var19 & var318));
         }
      }

      return new String(var15);
   }
}
