package pulse;



import pulse.module.ClientModule;
import pulse.module.ModuleInfo;
import pulse.module.ModuleCategory;
import pulse.settings.KeySetting;
import java.util.Optional;
import java.util.function.Predicate;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.client.gui.screen.ingame.InventoryScreen;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.EquippableComponent;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.text.Text;

@ModuleInfo(a = "Elytra Swap", b = "Автоматически меняет нагрудник на элитры при падении", c = ModuleCategory.UTILITIES)
public class ElytraSwap extends ClientModule {
   private final KeySetting e;
   private boolean f;
   private int g;
   private boolean h;
   private int i;
   public static int a;
   public static boolean b;

   public ElytraSwap() {
      int var2 = 1938284801;
      int var1 = 761666888;
      int var10004 = var1 & ~var2 | ~var1 & var2;
      var2 = 1591868489;
      var1 = var10004;
      var10004 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1221526489;
      var1 = 552895523;
      var10004 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1748731883;
      var1 = var10004;
      var10004 = (var1 | var2) & ~(var1 & var2);
      var10004 = (int)2909072912716198885L;
      var2 = -571588308;
      var1 = var10004;
      var10004 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1774629571;
      var1 = var10004;
      var10004 = (var1 | var2) & ~(var1 & var2);
      var2 = 2101207875;
      var1 = 1339620184;
      var10004 = var1 & ~var2 | ~var1 & var2;
      var2 = -1687973680;
      var1 = var10004;
      var10004 = ((var1 | var2) - (var1 & var2)) * ((var1 | var2) - (var1 & var2));
      int var10005 = (int)2400106096889069551L;
      var2 = -857656266;
      var1 = var10005;
      var10005 = (var1 | var2) - (var1 & var2);
      var2 = 1275486540;
      var1 = var10005;
      var10005 = ((var1 | var2) - (var1 & var2)) * ((var1 | var2) - (var1 & var2));
      var2 = 1904177228;
      var1 = -408030668;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var2 = -1681676197;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      int var10006 = (int)4639514984118751115L;
      var2 = -89041102;
      var1 = var10006;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var2 = 1321877827;
      var1 = var10006;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var10006 = (int)-6020215333925152056L;
      var2 = -1029539034;
      var1 = var10006;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var2 = 1709167036;
      var1 = var10006;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var2 = -252684663;
      var1 = 520029971;
      int var10007 = var1 & ~var2 | ~var1 & var2;
      var2 = 1164080882;
      var1 = var10007;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var10007 = (int)259880610893846738L;
      var2 = -108812526;
      var1 = var10007;
      var10007 = (var1 | var2) & (~var1 | ~var2);
      var2 = 320619769;
      var1 = var10007;
      var10007 = (var1 | var2) - (var1 & var2);
      String var10008 = "cyy";
      var2 = -1457575587;
      var1 = -1610811495;
      int var92 = var1 & ~var2 | ~var1 & var2;
      var2 = 921001337;
      var1 = var92;
      String var10003 = c(
         "ⱋ藲Ɐ藰Ⱬ藿⡱薎Ᵽ藿Ɱ藿", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=ꟃ꒹ꁨꤑ絤蹋⑉謠㑶b\ua7cb꒺ꁵꤐ絺蹏", var10005, var10006, var10007, (var1 | var2) & ~(var1 & var2)
      );
      var2 = 2005562836;
      var1 = 1332314090;
      var10004 = (var1 | var2) & ~(var1 & var2);
      var2 = -954403391;
      var1 = var10004;
      this.e = new KeySetting(var10003, var1 & ~var2 | ~var1 & var2);
      var2 = 637247251;
      var1 = -825818370;
      int var10001 = var1 + var2 - 2 * (var1 & var2);
      var2 = -348348947;
      var1 = var10001;
      this.f = pulse.Bool.from((var1 | var2) - (var1 & var2));
      var10001 = (int)2006214383816644056L;
      var2 = -1596156510;
      var1 = var10001;
      var10001 = var1 & ~var2 | ~var1 & var2;
      var2 = -361299846;
      var1 = var10001;
      this.g = var1 + var2 - 2 * (var1 & var2);
      var2 = -2037836664;
      var1 = -573380942;
      var10001 = (var1 | var2) - (var1 & var2);
      var2 = 1532752442;
      var1 = var10001;
      this.h = pulse.Bool.from((var1 | var2) & (~var1 | ~var2));
      var10001 = (int)8444370774232687827L;
      var2 = -1755981774;
      var1 = var10001;
      var10001 = (var1 | var2) & (~var1 | ~var2);
      var2 = 176274657;
      var1 = var10001;
      this.i = (var1 | var2) - (var1 & var2);
   }

   @EventHandler
   public void a(KeyInputEvent var1) {
      if (c.player != null && c.world != null && c.currentScreen == null) {
         if (var1.a() == this.e.k()) {
            int var10000 = var1.c();
            int var10001 = (int)8114852000300167174L;
            int var3 = -137293599;
            int var2 = var10001;
            var10001 = (var2 | var3) & ~(var2 & var3);
            var3 = -1793892122;
            var2 = var10001;
            if (var10000 == var2 + var3 - 2 * (var2 & var3) && !this.f) {
               var3 = 82759842;
               var2 = 125534252;
               var10001 = (var2 | var3) & ~(var2 & var3);
               var3 = 60117135;
               var2 = var10001;
               this.f = pulse.Bool.from((var2 | var3) - (var2 & var3));
               var10001 = (int)-3125642765627001110L;
               var3 = -302782956;
               var2 = var10001;
               var10001 = (var2 | var3) & (~var2 | ~var3);
               var3 = -503607042;
               var2 = var10001;
               this.g = var2 & ~var3 | ~var2 & var3;
               var10001 = (int)-2775274068535147841L;
               var3 = -19411819;
               var2 = var10001;
               var10001 = var2 & ~var3 | ~var2 & var3;
               var3 = -1337209302;
               var2 = var10001;
               this.h = pulse.Bool.from(var2 & ~var3 | ~var2 & var3);
               var3 = 2091279660;
               var2 = 2080173939;
               var10001 = var2 + var3 - 2 * (var2 & var3);
               var3 = 123374175;
               var2 = var10001;
               this.i = (var2 | var3) & (~var2 | ~var3);
            }
         }
      }
   }

   @EventHandler
   public void a(ClientTickEvent var1) {
      if (c.player != null) {
         if (this.f) {
            if (this.i > 0) {
               int var214 = -1697988291;
               int var112 = -2094744501;
               int var285 = (var112 | var214) & ~(var112 & var214);
               var214 = 435060087;
               var112 = var285;
               var214 = (var112 | var214) - (var112 & var214);
               var112 = this.i;
               this.i = (var112 ^ var214) - 2 * (~var112 & var214);
               return;
            }

            int var9 = -549889358;
            int var8 = -322100435;
            int var10001 = (var8 | var9) - (var8 & var9);
            var9 = 871659928;
            var8 = var10001;
            var10001 = (var8 | var9) & ~(var8 & var9);
            var10001 = (int)7680606256014990156L;
            var9 = 430957077;
            var8 = var10001;
            var10001 = (var8 | var9) & (~var8 | ~var9);
            var9 = 616921416;
            var8 = var10001;
            var10001 = var8 + var9 - 2 * (var8 & var9);
            var9 = -1987060055;
            var8 = 2077215518;
            var10001 = (var8 | var9) - (var8 & var9);
            var9 = -230681156;
            var8 = var10001;
            var10001 = var8 + var9 - 2 * (var8 & var9);
            int var10000 = (int)-479650879131058823L;
            var9 = -1865280578;
            var8 = var10000;
            var10000 = (var8 | var9) - (var8 & var9);
            var9 = -1101343969;
            var8 = var10000;
            int var7 = var8 & ~var9 | ~var8 & var9;
            a = var7;
            var10000 = (int)643665027008885844L;
            var9 = 1856863703;
            var8 = var10000;
            var10000 = var8 + var9 - 2 * (var8 & var9);
            var9 = 830654939;
            var8 = var10000;
            var10000 = (var8 | var9) & ~(var8 & var9);
            var9 = -1175959260;
            var8 = -1796241870;
            var10001 = var8 & ~var9 | ~var8 & var9;
            var9 = -698304070;
            var8 = var10001;
            var9 = (var8 | var9) & ~(var8 & var9);
            var8 = var10000;
            var10000 = (var8 | var9) + (var8 & var9);
            var9 = 331782798;
            var8 = -624146907;
            var10000 = var8 + var9 - 2 * (var8 & var9);
            var9 = -1807578191;
            var8 = var10000;
            if ((var8 & ~var9 | ~var8 & var9) < a) {
               throw new RuntimeException();
            }

            switch (this.g) {
               case 0:
                  if (!c.player.getAbilities().creativeMode) {
                     boolean var2 = this.q();
                     if (!var2) {
                        Optional var3 = this.o();
                        if (!var3.isPresent()) {
                           ClientPlayerEntity var223 = c.player;
                           String var5 = this.g();
                           StringBuilder var250 = new StringBuilder().append(var5);
                           int var10002 = (int)-3894800852239683820L;
                           var9 = 297257634;
                           var8 = var10002;
                           var10002 = (var8 | var9) - (var8 & var9);
                           var9 = -603872481;
                           var8 = var10002;
                           var10002 = (var8 | var9) & (~var8 | ~var9);
                           int var10003 = (int)-1713416590657139866L;
                           var9 = 1931443145;
                           var8 = var10003;
                           var10003 = (var8 | var9) - (var8 & var9);
                           var9 = 1121486024;
                           var8 = var10003;
                           var10003 = (var8 + var9 - 2 * (var8 & var9)) * (var8 + var9 - 2 * (var8 & var9));
                           int var10005 = (int)-2581475116193240243L;
                           var9 = -1868557464;
                           var8 = var10005;
                           var10005 = (var8 | var9) & ~(var8 & var9);
                           var9 = -1905608652;
                           var8 = var10005;
                           var10005 = (var8 | var9) - (var8 & var9);
                           var10005 = (int)7304138005754305612L;
                           var9 = 2090837797;
                           var8 = var10005;
                           var10005 = var8 + var9 - 2 * (var8 & var9);
                           var9 = 1274411899;
                           var8 = var10005;
                           var10005 = (var8 | var9) - (var8 & var9);
                           var10005 = (int)690270026855216009L;
                           var9 = -1612916679;
                           var8 = var10005;
                           var10005 = (var8 | var9) - (var8 & var9);
                           var9 = 974203839;
                           var8 = var10005;
                           var10005 = (var8 | var9) & ~(var8 & var9);
                           int var10004 = (int)-4222519218988087619L;
                           var9 = -1243074769;
                           var8 = var10004;
                           var10004 = var8 + var9 - 2 * (var8 & var9);
                           var9 = -569539663;
                           var8 = var10004;
                           var10004 = var8 & ~var9 | ~var8 & var9;
                           var10005 = (int)-1210081331128848546L;
                           var9 = -409935691;
                           var8 = var10005;
                           var10005 = var8 + var9 - 2 * (var8 & var9);
                           var9 = 719701701;
                           var8 = var10005;
                           var10005 = (var8 & ~var9 | ~var8 & var9) * (var8 & ~var9 | ~var8 & var9);
                           var9 = 1208277040;
                           var8 = -642951480;
                           var10005 = var8 + var9 - 2 * (var8 & var9);
                           var9 = -68464874;
                           var8 = var10005;
                           var10005 = var8 & ~var9 | ~var8 & var9;
                           var9 = -17081245;
                           var8 = -75243003;
                           int var10006 = (var8 | var9) & ~(var8 & var9);
                           var9 = -321161303;
                           var8 = var10006;
                           var10006 = ((var8 | var9) - (var8 & var9)) * ((var8 | var9) - (var8 & var9));
                           var9 = 1798146641;
                           var8 = 336957254;
                           var10006 = var8 & ~var9 | ~var8 & var9;
                           var9 = 1751518761;
                           var8 = var10006;
                           var10006 = (var8 | var9) & (~var8 | ~var9);
                           String var10007 = "czb";
                           var9 = -645642200;
                           var8 = -875133082;
                           int var323 = var8 & ~var9 | ~var8 & var9;
                           var9 = 309217037;
                           var8 = var323;
                           Text var251 = Text.of(
                              var250.append(
                                    c(
                                       "░蟫↊菹↛菴▋菵⇩菷↞菶↞菶░蟫↖菾⇩蟫⇦菰↓莉⇫蟥",
                                       "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=ꟃ꒹ꁨꤑ絤蹋⑉謠㑶b\ua7cb꒺ꁵꤐ絺蹏",
                                       var10004,
                                       var10005,
                                       var10006,
                                       (var8 | var9) - (var8 & var9)
                                    )
                                 )
                                 .toString()
                           );
                           var10002 = (int)4697002942769354611L;
                           var9 = -250664368;
                           var8 = var10002;
                           var10002 = (var8 | var9) - (var8 & var9);
                           var9 = -1716224734;
                           var8 = var10002;
                           var223.sendMessage(var251, pulse.Bool.from((var8 | var9) - (var8 & var9)));
                           var10001 = (int)-8673299733034967241L;
                           var9 = 1841338513;
                           var8 = var10001;
                           var10001 = (var8 | var9) & (~var8 | ~var9);
                           var9 = -533379162;
                           var8 = var10001;
                           this.f = pulse.Bool.from(var8 + var9 - 2 * (var8 & var9));
                           return;
                        }
                     } else {
                        Optional var10 = this.p();
                        if (!var10.isPresent()) {
                           ClientPlayerEntity var229 = c.player;
                           String var4 = this.g();
                           StringBuilder var262 = new StringBuilder().append(var4);
                           String var282 = "cyz";
                           var9 = 1738502199;
                           var8 = 2030868357;
                           int var288 = (var8 | var9) - (var8 & var9);
                           var9 = 336706956;
                           var8 = var288;
                           var288 = var8 & ~var9 | ~var8 & var9;
                           int var292 = (int)4161633490585966506L;
                           var9 = 2116798977;
                           var8 = var292;
                           var292 = (var8 | var9) & (~var8 | ~var9);
                           var9 = -783098533;
                           var8 = var292;
                           var292 = (var8 & ~var9 | ~var8 & var9) * (var8 & ~var9 | ~var8 & var9);
                           var292 = (int)1740693268391238287L;
                           var9 = -827554688;
                           var8 = var292;
                           var292 = (var8 | var9) & (~var8 | ~var9);
                           var9 = -689818580;
                           var8 = var292;
                           var292 = var8 + var9 - 2 * (var8 & var9);
                           String var311 = "cza";
                           int var312 = (int)-6772440855312960219L;
                           var9 = -2093017829;
                           var8 = var312;
                           int var313 = (var8 | var9) & (~var8 | ~var9);
                           var9 = 1705895422;
                           var8 = var313;
                           int var314 = (var8 | var9) & ~(var8 & var9);
                           int var318 = (int)-7941601522195081437L;
                           var9 = 1736915506;
                           var8 = var318;
                           var318 = var8 + var9 - 2 * (var8 & var9);
                           var9 = -531998964;
                           var8 = var318;
                           var318 = var8 + var9 - 2 * (var8 & var9);
                           var9 = -1540320811;
                           var8 = -1830302539;
                           var318 = (var8 | var9) & (~var8 | ~var9);
                           var9 = 737004316;
                           var8 = var318;
                           var318 = var8 + var9 - 2 * (var8 & var9);
                           var9 = 1121696450;
                           var8 = 1644962049;
                           int var324 = var8 + var9 - 2 * (var8 & var9);
                           var9 = -2052134246;
                           var8 = var324;
                           var324 = (var8 | var9) - (var8 & var9);
                           var324 = (int)3256035209254413496L;
                           var9 = -622476393;
                           var8 = var324;
                           var324 = (var8 | var9) & (~var8 | ~var9);
                           var9 = 1560390458;
                           var8 = var324;
                           Text var263 = Text.of(
                              var262.append(
                                    c(
                                       "░䎽↊䞯↛䞢▋䞣⇩䞡↞䞠↞䞠░䎽↖䞨⇩䎽↖䞭↘䟝⇨䞩↖䞥↑䞭▅",
                                       "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=ꟃ꒹ꁨꤑ絤蹋⑉謠㑶b\ua7cb꒺ꁵꤐ絺蹏",
                                       var292,
                                       var314,
                                       var318,
                                       var8 + var9 - 2 * (var8 & var9)
                                    )
                                 )
                                 .toString()
                           );
                           int var283 = (int)3703135704450753374L;
                           var9 = 853840196;
                           var8 = var283;
                           int var284 = (var8 | var9) - (var8 & var9);
                           var9 = -1472269797;
                           var8 = var284;
                           var229.sendMessage(var263, pulse.Bool.from(var8 + var9 - 2 * (var8 & var9)));
                           var10001 = (int)1879506792778894119L;
                           var9 = 1132446353;
                           var8 = var10001;
                           var10001 = var8 & ~var9 | ~var8 & var9;
                           var9 = 335202742;
                           var8 = var10001;
                           this.f = pulse.Bool.from(var8 & ~var9 | ~var8 & var9);
                           return;
                        }
                     }

                     if (!(c.currentScreen instanceof InventoryScreen)) {
                        c.setScreen(new InventoryScreen(c.player));
                     }

                     var10001 = (int)-4856036063392181082L;
                     var9 = 1362939056;
                     var8 = var10001;
                     var10001 = var8 + var9 - 2 * (var8 & var9);
                     var9 = -1875306476;
                     var8 = var10001;
                     this.i = (var8 | var9) & (~var8 | ~var9);
                     var9 = 1750654393;
                     var8 = 1990666976;
                     var10001 = (var8 | var9) - (var8 & var9);
                     var9 = 520091480;
                     var8 = var10001;
                     this.g = (var8 | var9) & (~var8 | ~var9);
                     String var224 = "czc";
                     var10000 = (int)7128530975418547449L;
                     var9 = 735218655;
                     var8 = var10000;
                     var10000 = (var8 | var9) & (~var8 | ~var9);
                     var9 = 1981221382;
                     var8 = var10000;
                     var7 = var8 & ~var9 | ~var8 & var9;
                     a = var7;
                     var10001 = (int)-6920482635038768521L;
                     var9 = -937755328;
                     var8 = var10001;
                     var10001 = (var8 | var9) & ~(var8 & var9);
                     var9 = 2019278642;
                     var8 = var10001;
                     var10001 = var8 + var9 - 2 * (var8 & var9);
                     var9 = -1255787371;
                     var8 = 763306286;
                     var10001 = (var8 | var9) - (var8 & var9);
                     var9 = -1738992206;
                     var8 = var10001;
                     var10001 = (var8 | var9) & ~(var8 & var9);
                     var10000 = (int)8630052286799746198L;
                     var9 = 1035189248;
                     var8 = var10000;
                     var10000 = (var8 | var9) & (~var8 | ~var9);
                     var9 = -1619209700;
                     var8 = var10000;
                     if ((var8 | var9) - (var8 & var9) <= a) {
                        throw new IllegalStateException();
                     }
                  } else {
                     var10001 = (int)5402714208275801852L;
                     var9 = -1273144995;
                     var8 = var10001;
                     var10001 = var8 & ~var9 | ~var8 & var9;
                     var9 = 589397920;
                     var8 = var10001;
                     this.g = var8 + var9 - 2 * (var8 & var9);
                     var10000 = (int)-7784822928227826968L;
                     var9 = 946696692;
                     var8 = var10000;
                     var10000 = (var8 | var9) & ~(var8 & var9);
                     var9 = 490701042;
                     var8 = var10000;
                     var10000 = (var8 | var9) - (var8 & var9);
                     var10001 = (int)2225226048943931490L;
                     var9 = 635585422;
                     var8 = var10001;
                     var10001 = var8 & ~var9 | ~var8 & var9;
                     var9 = 95876509;
                     var8 = var10001;
                     var9 = var8 & ~var9 | ~var8 & var9;
                     var8 = var10000;
                     var10000 = (var8 ^ var9) + 2 * (var8 & var9);
                     var10000 = (int)-2469198487318301956L;
                     var9 = -1233390340;
                     var8 = var10000;
                     var10000 = var8 & ~var9 | ~var8 & var9;
                     var9 = 876650406;
                     var8 = var10000;
                     var7 = var8 + var9 - 2 * (var8 & var9);
                     var9 = -618788709;
                     var8 = 1462201221;
                     var10001 = var8 & ~var9 | ~var8 & var9;
                     var9 = -1942396141;
                     var8 = var10001;
                     var10001 = (var8 | var9) & (~var8 | ~var9);
                     var10001 = (int)4132342975776379086L;
                     var9 = -911500358;
                     var8 = var10001;
                     var10001 = (var8 | var9) - (var8 & var9);
                     var9 = 277924720;
                     var8 = var10001;
                     var10001 = (var8 | var9) & ~(var8 & var9);
                     var10001 = (int)7365672163590844487L;
                     var9 = -916839673;
                     var8 = var10001;
                     var10001 = var8 & ~var9 | ~var8 & var9;
                     var9 = 59413328;
                     var8 = var10001;
                     var10001 = var8 + var9 - 2 * (var8 & var9);
                     var9 = 1875729465;
                     var8 = 1081263944;
                     var10000 = var8 & ~var9 | ~var8 & var9;
                     var9 = 2019896190;
                     var8 = var10000;
                     if ((var8 | var9) - (var8 & var9) >= var7) {
                        throw new ExceptionInInitializerError();
                     }
                  }
                  break;
               case 1:
                  if (c.currentScreen instanceof InventoryScreen && !this.h) {
                     this.n();
                     var10001 = (int)7301946321714178489L;
                     var9 = 2099407703;
                     var8 = var10001;
                     var10001 = var8 + var9 - 2 * (var8 & var9);
                     var9 = 2140930799;
                     var8 = var10001;
                     this.h = pulse.Bool.from((var8 | var9) & (~var8 | ~var9));
                     var9 = -2070341336;
                     var8 = -1309338168;
                     var10001 = var8 & ~var9 | ~var8 & var9;
                     var9 = 896273634;
                     var8 = var10001;
                     this.i = var8 + var9 - 2 * (var8 & var9);
                     var9 = 1324500739;
                     var8 = -192164500;
                     var10001 = (var8 | var9) & (~var8 | ~var9);
                     var9 = -1166439827;
                     var8 = var10001;
                     this.g = (var8 | var9) - (var8 & var9);
                  }
                  break;
               case 2:
                  if (c.currentScreen instanceof InventoryScreen) {
                     c.player.closeHandledScreen();
                  }

                  var9 = -1904359814;
                  var8 = 541536905;
                  var10001 = var8 & ~var9 | ~var8 & var9;
                  var9 = -1371867917;
                  var8 = var10001;
                  this.f = pulse.Bool.from(var8 + var9 - 2 * (var8 & var9));
                  var9 = 1881167014;
                  var8 = -214256572;
                  var10001 = (var8 | var9) - (var8 & var9);
                  var9 = -2095390494;
                  var8 = var10001;
                  this.g = (var8 | var9) & ~(var8 & var9);
            }
         }
      }
   }

   private void n() {
      boolean var1 = this.q();
      if (!var1) {
         String var10000 = "czd";
         int var146 = (int)-4478419561663535689L;
         int var8 = -1788412138;
         int var7 = var146;
         int var147 = var7 + var8 - 2 * (var7 & var8);
         var8 = 1418941727;
         var7 = var147;
         int var6 = var7 + var8 - 2 * (var7 & var8);
         a = var6;
         var8 = -1419006775;
         var7 = 1566320040;
         int var148 = (var7 | var8) & (~var7 | ~var8);
         var8 = 1533407903;
         var7 = var148;
         int var149 = (var7 | var8) - (var7 & var8);
         int var150 = (int)-3567352127898759419L;
         var8 = 2047709390;
         var7 = var150;
         int var151 = var7 + var8 - 2 * (var7 & var8);
         var8 = -1503886704;
         var7 = var151;
         if ((var7 | var8) - (var7 & var8) < a) {
            var8 = -1344181589;
            var7 = 451475870;
            int var152 = var7 & ~var8 | ~var7 & var8;
            var8 = -1257663691;
            var7 = var152;
            int var153 = (var7 | var8) & (~var7 | ~var8);
            var8 = -1278441201;
            var7 = 309641541;
            int var10001 = (var7 | var8) & (~var7 | ~var8);
            var8 = -1581758390;
            var7 = var10001;
            int var154 = var153 / ((var7 | var8) - (var7 & var8));
         }

         Optional var2 = this.o();
         if (var2.isPresent()) {
            this.b((Integer)var2.get());
            ClientPlayerEntity var155 = c.player;
            String var4 = this.g();
            StringBuilder var157 = new StringBuilder().append(var4);
            int var10002 = (int)-3904860238811875238L;
            var8 = -111340050;
            var7 = var10002;
            var10002 = (var7 | var8) & (~var7 | ~var8);
            var8 = 168312701;
            var7 = var10002;
            var10002 = var7 & ~var8 | ~var7 & var8;
            var8 = 502500411;
            var7 = 85126820;
            int var10003 = var7 + var8 - 2 * (var7 & var8);
            var8 = -696015760;
            var7 = var10003;
            var10003 = (var7 | var8) & ~(var7 & var8);
            int var10004 = (int)-8401861491332439447L;
            var8 = -1397798613;
            var7 = var10004;
            var10004 = (var7 | var8) & (~var7 | ~var8);
            var8 = -1248672777;
            var7 = var10004;
            var10004 = (var7 | var8) & (~var7 | ~var8);
            var8 = -1178507741;
            var7 = 681010204;
            int var10005 = (var7 | var8) - (var7 & var8);
            var8 = -33428508;
            var7 = var10005;
            var8 = var7 & ~var8 | ~var7 & var8;
            var7 = var10004;
            var10004 = (var7 | var8) + (var7 & var8);
            var8 = 47390924;
            var7 = 653524608;
            var10004 = (var7 | var8) & (~var7 | ~var8);
            var8 = 691139695;
            var7 = var10004;
            var10004 = var7 + var8 - 2 * (var7 & var8);
            int var10006 = (int)-4194965024432329639L;
            var8 = 912842679;
            var7 = var10006;
            var10006 = var7 + var8 - 2 * (var7 & var8);
            var8 = 2012034018;
            var7 = var10006;
            var10006 = (var7 | var8) - (var7 & var8);
            var10005 = (int)-7975025263903584782L;
            var8 = -719339071;
            var7 = var10005;
            var10005 = (var7 | var8) - (var7 & var8);
            var8 = -945574317;
            var7 = var10005;
            var10005 = (var7 | var8) & (~var7 | ~var8);
            var10006 = (int)-4488936491697553693L;
            var8 = 1720829576;
            var7 = var10006;
            var10006 = (var7 | var8) & (~var7 | ~var8);
            var8 = 746861564;
            var7 = var10006;
            var10006 = var7 & ~var8 | ~var7 & var8;
            var8 = -1801283822;
            var7 = -447619122;
            int var10007 = (var7 | var8) & ~(var7 & var8);
            var8 = 517478394;
            var7 = var10007;
            var8 = var7 & ~var8 | ~var7 & var8;
            var7 = var10006;
            var10006 = 2 * (var7 | var8) - (var7 ^ var8);
            var8 = -1587426823;
            var7 = 117788360;
            var10006 = var7 & ~var8 | ~var7 & var8;
            var8 = -1483865236;
            var7 = var10006;
            var10006 = (var7 | var8) & ~(var7 & var8);
            var10007 = (int)-4154247562373706023L;
            var8 = 1764905830;
            var7 = var10007;
            var10007 = var7 & ~var8 | ~var7 & var8;
            var8 = -1768940999;
            var7 = var10007;
            var10007 = (var7 | var8) - (var7 & var8);
            var8 = -420496719;
            var7 = -671411987;
            int var10008 = (var7 | var8) - (var7 & var8);
            var8 = 1329550712;
            var7 = var10008;
            var8 = var7 + var8 - 2 * (var7 & var8);
            var7 = var10007;
            var10007 = (var7 ^ var8) + 2 * (var7 & var8);
            var8 = -203719554;
            var7 = 1061110627;
            var10007 = (var7 | var8) & (~var7 | ~var8);
            var8 = -858481484;
            var7 = var10007;
            Text var158 = Text.of(
               var157.append(
                     c(
                        "ﺍ眝着猍廙猈戴眝\ufafa猆摒獿\ufaf7獶ﺙ",
                        "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=ꟃ꒹ꁨꤑ絤蹋⑉謠㑶b\ua7cb꒺ꁵꤐ絺蹏",
                        var10004,
                        var10005,
                        var10006,
                        (var7 | var8) - (var7 & var8)
                     )
                  )
                  .toString()
            );
            var8 = 297502628;
            var7 = 540478050;
            var10002 = (var7 | var8) & (~var7 | ~var8);
            var8 = 831294919;
            var7 = var10002;
            var155.sendMessage(var158, pulse.Bool.from((var7 | var8) - (var7 & var8)));
         }
      } else {
         Optional var9 = this.p();
         if (var9.isPresent()) {
            this.b((Integer)var9.get());
            ClientPlayerEntity var156 = c.player;
            String var3 = this.g();
            StringBuilder var159 = new StringBuilder().append(var3);
            String var164 = "cze";
            int var173 = (int)-4540084522961565907L;
            int var118 = 175068917;
            int var50 = var173;
            var173 = (var50 | var118) - (var50 & var118);
            var118 = 1288688087;
            var50 = var173;
            var173 = var50 & ~var118 | ~var50 & var118;
            var173 = (int)-3966852956602021056L;
            var118 = -701377272;
            var50 = var173;
            var173 = (var50 | var118) - (var50 & var118);
            var118 = 62299722;
            var50 = var173;
            var173 = (var50 | var118) & (~var50 | ~var118);
            var118 = -1814117532;
            var50 = -901248788;
            int var185 = var50 & ~var118 | ~var50 & var118;
            var118 = 1503054730;
            var50 = var185;
            var185 = var50 & ~var118 | ~var50 & var118;
            var185 = (int)-5010024476508520755L;
            var118 = -141503481;
            var50 = var185;
            var185 = var50 & ~var118 | ~var50 & var118;
            var118 = -1641895207;
            var50 = var185;
            var185 = var50 & ~var118 | ~var50 & var118;
            var173 = (int)-990743785410356409L;
            var118 = 793289262;
            var50 = var173;
            var173 = (var50 | var118) & (~var50 | ~var118);
            var118 = -1654058166;
            var50 = var173;
            var173 = (var50 | var118) & ~(var50 & var118);
            int var201 = (int)-8077562190633690430L;
            var118 = -868530133;
            var50 = var201;
            var201 = (var50 | var118) & (~var50 | ~var118);
            var118 = -870558997;
            var50 = var201;
            var201 = var50 + var118 - 2 * (var50 & var118);
            var118 = -1283763271;
            var50 = -1068552003;
            var201 = var50 & ~var118 | ~var50 & var118;
            var118 = 1932813056;
            var50 = var201;
            var201 = (var50 | var118) & (~var50 | ~var118);
            var118 = 110741997;
            var50 = -377262909;
            var201 = var50 & ~var118 | ~var50 & var118;
            var118 = -283466462;
            var50 = var201;
            var201 = var50 & ~var118 | ~var50 & var118;
            var185 = (int)274969092462199119L;
            var118 = -1973769357;
            var50 = var185;
            var185 = (var50 | var118) & (~var50 | ~var118);
            var118 = -152072638;
            var50 = var185;
            var185 = (var50 | var118) & ~(var50 & var118);
            int var215 = (int)7241947360362283644L;
            var118 = -1963594829;
            var50 = var215;
            var215 = var50 + var118 - 2 * (var50 & var118);
            var118 = -1299371553;
            var50 = var215;
            var215 = (var50 | var118) - (var50 & var118);
            var118 = 1946608046;
            var50 = -773704188;
            var201 = var50 + var118 - 2 * (var50 & var118);
            var118 = -1391224979;
            var50 = var201;
            var201 = (var50 | var118) & (~var50 | ~var118);
            var215 = (int)7305318173204115919L;
            var118 = -120174252;
            var50 = var215;
            var215 = (var50 | var118) - (var50 & var118);
            var118 = -1261321443;
            var50 = var215;
            var215 = (var50 & ~var118 | ~var50 & var118) * (var50 & ~var118 | ~var50 & var118);
            var118 = -1979499483;
            var50 = 407816030;
            var215 = var50 & ~var118 | ~var50 & var118;
            var118 = -1839391044;
            var50 = var215;
            Text var160 = Text.of(
               var159.append(
                     c(
                        "ﺍㅳ殺㕮\ufaf8㕨ﺗ㔞戴㕫\ufaf5㔓\ufafcㅽ",
                        "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=ꟃ꒹ꁨꤑ絤蹋⑉謠㑶b\ua7cb꒺ꁵꤐ絺蹏",
                        var173,
                        var185,
                        var201,
                        var50 + var118 - 2 * (var50 & var118)
                     )
                  )
                  .toString()
            );
            int var165 = (int)-6797703018573996616L;
            var118 = -937171881;
            var50 = var165;
            int var166 = (var50 | var118) - (var50 & var118);
            var118 = 426260974;
            var50 = var166;
            var156.sendMessage(var160, pulse.Bool.from(var50 + var118 - 2 * (var50 & var118)));
         }
      }
   }

   private void b(int var1) {
      int var10000 = (int)-627267548692499084L;
      int var5 = 806226687;
      int var4 = var10000;
      var10000 = (var4 | var5) & ~(var4 & var5);
      var5 = -721174621;
      var4 = var10000;
      int var2 = (var4 | var5) & ~(var4 & var5);
      var10000 = (int)-5989797555010757018L;
      var5 = -11575785;
      var4 = var10000;
      var10000 = (var4 | var5) - (var4 & var5);
      var5 = 375111799;
      var4 = var10000;
      int var3 = var4 + var5 - 2 * (var4 & var5);
      c.interactionManager.clickSlot(c.player.currentScreenHandler.syncId, var1, var2, SlotActionType.SWAP, c.player);
      c.interactionManager.clickSlot(c.player.currentScreenHandler.syncId, var3, var2, SlotActionType.SWAP, c.player);
      c.interactionManager.clickSlot(c.player.currentScreenHandler.syncId, var1, var2, SlotActionType.SWAP, c.player);
   }

   private Optional<Integer> o() {
      Predicate<ItemStack> var10000 = var0 -> {
         int var9x;
         if (var0.getItem() != Items.ELYTRA) {
            int var2x = 120318488;
            int var1x = 991830863;
            var9x = (var1x | var2x) & ~(var1x & var2x);
            var2x = 1010157911;
            var1x = var9x;
            var9x = var1x & ~var2x | ~var1x & var2x;
         } else {
            int var7x = -251855709;
            int var4x = -1744714987;
            var9x = var4x & ~var7x | ~var4x & var7x;
            var7x = 1761427383;
            var4x = var9x;
            var9x = (var4x | var7x) - (var4x & var7x);
         }

         return pulse.Bool.from(var9x);
      };
      int var10001 = (int)-7673279339302194940L;
      int var2 = -1280654003;
      int var1 = var10001;
      var10001 = var1 + var2 - 2 * (var1 & var2);
      var2 = -853101496;
      var1 = var10001;
      var10001 = var1 & ~var2 | ~var1 & var2;
      var2 = -1224695706;
      var1 = -253964463;
      int var10002 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1205628727;
      var1 = var10002;
      return InventoryFinder.a(var10000, pulse.Bool.from(var10001), pulse.Bool.from(var1 & (var2 ^ -1) | (var1 ^ -1) & var2));
   }

   private Optional<Integer> p() {
      Predicate<ItemStack> var10000 = this::a;
      int var10001 = (int)-4783506787163043466L;
      int var2 = -727767269;
      int var1 = var10001;
      var10001 = var1 + var2 - 2 * (var1 & var2);
      var2 = 115682924;
      var1 = var10001;
      var10001 = (var1 | var2) & ~(var1 & var2);
      int var10002 = (int)-305804344169282065L;
      var2 = 287217244;
      var1 = var10002;
      var10002 = var1 & ~var2 | ~var1 & var2;
      var2 = -1508224077;
      var1 = var10002;
      return InventoryFinder.a(var10000, pulse.Bool.from(var10001), pulse.Bool.from((var1 | var2) & (var1 ^ -1 | var2 ^ -1)));
   }

   private boolean a(ItemStack var1) {
      if (var1.getItem() == Items.ELYTRA) {
         int var19 = (int)7107934023787842105L;
         int var13 = 1078049336;
         int var8 = var19;
         var19 = var8 & ~var13 | ~var8 & var13;
         var13 = -1903677439;
         var8 = var19;
         return pulse.Bool.from(var8 & (var13 ^ -1) | (var8 ^ -1) & var13);
      }

      EquippableComponent var2 = (EquippableComponent)var1.get(DataComponentTypes.EQUIPPABLE);
      int var16;
      if (var2 != null && var2.slot() == EquipmentSlot.CHEST) {
         var16 = (int)-4927150680845290805L;
         int var11 = -1253824728;
         int var6 = var16;
         var16 = var6 & ~var11 | ~var6 & var11;
         var11 = 740316642;
         var6 = var16;
         var16 = (var6 | var11) - (var6 & var11);
      } else {
         var16 = (int)-7718862968005610614L;
         int var4 = 2081859025;
         int var3 = var16;
         var16 = (var3 | var4) & ~(var3 & var4);
         var4 = -1643309477;
         var3 = var16;
         var16 = (var3 | var4) & ~(var3 & var4);
      }

      return pulse.Bool.from(var16);
   }

   private boolean q() {
      ItemStack var1 = c.player.getEquippedStack(EquipmentSlot.CHEST);
      int var11;
      if (var1.getItem() != Items.ELYTRA) {
         var11 = (int)5785898946467820324L;
         int var3 = 1516582076;
         int var2 = var11;
         var11 = (var2 | var3) & ~(var2 & var3);
         var3 = -1998567528;
         var2 = var11;
         var11 = (var2 | var3) - (var2 & var3);
      } else {
         var11 = (int)477387163672995514L;
         int var8 = 2094884718;
         int var5 = var11;
         var11 = (var5 | var8) & ~(var5 & var8);
         var8 = -338558507;
         var5 = var11;
         var11 = (var5 | var8) & (~var5 | ~var8);
      }

      return pulse.Bool.from(var11);
   }

   @Override
   public void e() {
      super.e();
      int var10001 = (int)-4608367947518459019L;
      int var2 = -2105276982;
      int var1 = var10001;
      var10001 = (var1 | var2) - (var1 & var2);
      var2 = 391759551;
      var1 = var10001;
      this.f = pulse.Bool.from(var1 + var2 - 2 * (var1 & var2));
      var2 = 1815364238;
      var1 = 873120298;
      var10001 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1480491172;
      var1 = var10001;
      this.g = (var1 | var2) & ~(var1 & var2);
      var2 = 2141735025;
      var1 = 1193136030;
      var10001 = var1 & ~var2 | ~var1 & var2;
      var2 = 951420911;
      var1 = var10001;
      this.h = pulse.Bool.from(var1 & ~var2 | ~var1 & var2);
      var10001 = (int)-4924833744415225106L;
      var2 = 1462226672;
      var1 = var10001;
      var10001 = (var1 | var2) & (~var1 | ~var2);
      var2 = 828490782;
      var1 = var10001;
      this.i = (var1 | var2) & (~var1 | ~var2);
   }

   @Override
   public void f() {
      super.f();
   }

   public static String c(String var0, String var1, int var2, int var3, int var4, int var5) {
      char[] var6 = var1.toCharArray();
      char[] var7 = new char[var6.length];
      int var10000 = (int)-5820053073408352662L;
      int var18 = 1054208688;
      int var17 = var10000;
      var10000 = (var17 | var18) & ~(var17 & var18);
      var18 = -280564528;
      var17 = var10000;
      char[] var244 = new char[(var17 | var18) & (~var17 | ~var18)];
      int var10002 = (int)8409552114838169294L;
      var18 = -984948819;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 2019211619;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -485917756;
      var17 = 150963637;
      int var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -336153021;
      var17 = var10003;
      var244[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var18 = 1079351560;
      var17 = -911986930;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1980647929;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1449352594;
      var17 = 484623648;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1250016053;
      var17 = var10003;
      var244[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var18 = 44799874;
      var17 = -660410711;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -636913367;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 666516803;
      var17 = -430096419;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -1041817320;
      var17 = var10003;
      var244[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var10002 = (int)-3862847630519657972L;
      var18 = 447341669;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -1010598294;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -1374526117;
      var17 = 827370070;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1075235663;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1117963026;
      var17 = -530249335;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 1563995508;
      var17 = var10003;
      var244[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var18 = 581714643;
      var17 = -547476384;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -34443593;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -1278881988;
      var17 = -1140161262;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 113056892;
      var17 = var10003;
      var10003 = ((var17 | var18) & ~(var17 & var18)) * ((var17 | var18) & ~(var17 & var18));
      var18 = 219964471;
      var17 = -116563260;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -200173610;
      var17 = var10003;
      var244[var10002] = (char)((var17 | var18) - (var17 & var18));
      var10002 = (int)-318213824360790601L;
      var18 = -348140143;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -1620801501;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 1604309979;
      var17 = -335226425;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -1281667170;
      var17 = var10003;
      var244[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var18 = -40241612;
      var17 = -1577689871;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1550822083;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1246438767;
      var17 = -1727980011;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -750112151;
      var17 = var10003;
      var244[var10002] = (char)((var17 | var18) - (var17 & var18));
      var10002 = (int)-6290043960568990322L;
      var18 = 960400764;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 898578677;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var10003 = (int)4576583063092077556L;
      var18 = -22979462;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1374860372;
      var17 = var10003;
      var244[var10002] = (char)((var17 | var18) - (var17 & var18));
      var10002 = (int)-8683328929439125835L;
      var18 = 180817706;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 1177510295;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var10003 = (int)123692261433062671L;
      var18 = -396960545;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 813195651;
      var17 = var10003;
      var244[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var18 = -857459647;
      var17 = -594492370;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 276099174;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1623336130;
      var17 = 713167483;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1245720991;
      var17 = var10003;
      var244[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      char[] var8 = var244;
      var10000 = (int)-3574179628256958525L;
      var18 = -1149518149;
      var17 = var10000;
      var10000 = (var17 | var18) - (var17 & var18);
      var18 = 624286066;
      var17 = var10000;
      char[] var247 = new char[(var17 | var18) & ~(var17 & var18)];
      var10002 = (int)3010397602346401756L;
      var18 = -48842434;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -1784822046;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var10003 = (int)-6168656382624690083L;
      var18 = -1619362004;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1800382289;
      var17 = var10003;
      var247[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var10002 = (int)-3192271805896373645L;
      var18 = 130327030;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -1328944252;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      String var325 = "czf";
      var18 = 1367868007;
      var17 = -337654013;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1168684697;
      var17 = var10003;
      var247[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var10002 = (int)-5548182948229449335L;
      var18 = 502658934;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 269651709;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      String var327 = "czg";
      var10003 = (int)6084877683228080367L;
      var18 = 1323576678;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -999927078;
      var17 = var10003;
      var247[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var18 = 1662861675;
      var17 = -429128671;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -2056174263;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -1886605341;
      var17 = -1710151844;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 362655933;
      var17 = var10003;
      var247[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var10002 = (int)-773654280072016169L;
      var18 = -147674970;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -160799115;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1600753542;
      var17 = 97309239;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1520788977;
      var17 = var10003;
      var247[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var10002 = (int)-3305849028492389075L;
      var18 = -2124240944;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 1590080248;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -619138754;
      var17 = 1317017814;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -1785163396;
      var17 = var10003;
      var247[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var18 = -451919257;
      var17 = -1903631455;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1805164992;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)-2096351307947899056L;
      var18 = 268185529;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 787014011;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -520831823;
      var17 = 635440520;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -988531200;
      var17 = var10003;
      var247[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var18 = -1045422326;
      var17 = 935520483;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -160237586;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var10003 = (int)6347215393894782776L;
      var18 = -1104246215;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 802409785;
      var17 = var10003;
      var247[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var10002 = (int)-7293645305791142900L;
      var18 = -1985845275;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 1463665633;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      int var10004 = (int)1653677634320418812L;
      var18 = 657873154;
      var17 = var10004;
      var10004 = (var17 | var18) & (~var17 | ~var18);
      var18 = -644145423;
      var17 = var10004;
      var10004 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1651676468;
      var17 = -1303677758;
      var10004 = (var17 | var18) - (var17 & var18);
      var18 = -801512962;
      var17 = var10004;
      var10004 = (var17 | var18) & ~(var17 & var18);
      var18 = -1732155259;
      var17 = 536281367;
      var10004 = var17 & ~var18 | ~var17 & var18;
      var18 = -2026477153;
      var17 = var10004;
      var10004 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)5527035838861904976L;
      var18 = -99062640;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 640639940;
      var17 = var10003;
      var247[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var10002 = (int)354904608915319861L;
      var18 = -681513289;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 1357578891;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var10003 = (int)-1784076160457232101L;
      var18 = -671871301;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -331346797;
      var17 = var10003;
      var247[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      char[] var9 = var247;
      var18 = 1895775683;
      var17 = -69954053;
      var10000 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1960073160;
      var17 = var10000;

      for (int var10 = (var17 | var18) - (var17 & var18); var10 < var6.length; var10++) {
         char var304 = var6[var10];
         char var229 = var8[var10 % var8.length];
         char var118 = var304;
         var7[var10] = (char)((var118 | var229) & ~(var118 & var229));
      }

      char[] var19 = new char[var7.length];
      var18 = 726441337;
      var17 = -704651301;
      var10000 = var17 + var18 - 2 * (var17 & var18);
      var18 = -21806430;
      var17 = var10000;

      for (int var11 = var17 & ~var18 | ~var17 & var18; var11 < var6.length; var11++) {
         char var305 = var7[var11];
         char var232 = var9[var11 % var9.length];
         char var121 = var305;
         var19[var11] = (char)(var121 + var232 - 2 * (var121 & var232));
      }

      String var20 = new String(var19);
      int var12 = var20.hashCode();
      var18 = var5;
      var17 = var3;
      var10000 = 2 * (var17 & ~var18) - (var17 ^ var18);
      var18 = var2;
      var17 = var10000;
      int var13 = var17 + ~var18 + 1;
      char[] var14 = var0.toCharArray();
      char[] var15 = new char[var14.length];
      var10000 = (int)6938051167833382041L;
      var18 = 490900359;
      var17 = var10000;
      var10000 = (var17 | var18) - (var17 & var18);
      var18 = 24368926;
      var17 = var10000;

      for (int var16 = var17 & ~var18 | ~var17 & var18; var16 < var15.length; var16++) {
         if (b) {
            throw new IllegalStateException();
         }

         var18 = 692004508;
         var17 = 1238381554;
         int var10001 = (var17 | var18) & (~var17 | ~var18);
         var18 = 1626281324;
         var17 = var10001;
         switch (var16 % (var17 + var18 - 2 * (var17 & var18))) {
            case 0:
               var18 = var12;
               var17 = var13;
               var10002 = (var17 | var18) - (var17 & var18);
               char var242 = var14[var16];
               var17 = var10002;
               var15[var16] = (char)(var17 + var242 - 2 * (var17 & var242));
               break;
            case 1:
               var18 = var13;
               var17 = var5;
               var10002 = var17 & ~var18 | ~var17 & var18;
               char var240 = var14[var16];
               var17 = var10002;
               var15[var16] = (char)((var17 | var240) & (~var17 | ~var240));
         }
      }

      return new String(var15);
   }
}
