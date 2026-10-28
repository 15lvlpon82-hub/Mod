package pulse;



import pulse.module.ClientModule;
import pulse.module.ModuleInfo;
import pulse.module.ModuleCategory;
import pulse.settings.BooleanSetting;
import java.util.Optional;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.PotionContentsComponent;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.potion.Potion;
import net.minecraft.registry.entry.RegistryEntry;

@ModuleInfo(a = "Auto Potion", b = "Автоматически использует выбранные зелья", c = ModuleCategory.UTILITIES)
public class AutoPotion extends ClientModule {
   private final BooleanSetting e;
   private final BooleanSetting f;
   private boolean g;
   private int h;
   private boolean i;
   public static int a;
   public static boolean b;

   public AutoPotion() {
      int var2 = -984360535;
      int var1 = 1780520834;
      int var10003 = var1 & ~var2 | ~var1 & var2;
      var2 = 1649198892;
      var1 = var10003;
      var10003 = ((var1 | var2) - (var1 & var2)) * ((var1 | var2) - (var1 & var2));
      var2 = -304296660;
      var1 = 1660663378;
      int var10004 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1633079658;
      var1 = var10004;
      var10004 = var1 + var2 - 2 * (var1 & var2);
      var2 = 899711847;
      var1 = 1703111467;
      int var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1491654696;
      var1 = var10005;
      var2 = (var1 | var2) & (~var1 | ~var2);
      var1 = var10004;
      var10004 = var1 - ~var2 - 1;
      var2 = -1566433577;
      var1 = 303333641;
      var10005 = (var1 | var2) - (var1 & var2);
      var2 = -938602066;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var10005 = (int)-5049972679089044448L;
      var2 = 266565735;
      var1 = var10005;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var2 = -598175066;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      String var10006 = "ld";
      var2 = 764383304;
      var1 = 1667946069;
      int var142 = var1 + var2 - 2 * (var1 & var2);
      var2 = -2118086182;
      var1 = var142;
      int var143 = (var1 | var2) & ~(var1 & var2);
      String var10007 = "le";
      int var147 = (int)-5286988075992219202L;
      var2 = -353744324;
      var1 = var147;
      int var148 = (var1 | var2) & ~(var1 & var2);
      var2 = -1398199690;
      var1 = var148;
      int var149 = (var1 | var2) & ~(var1 & var2);
      var2 = 566813865;
      var1 = 180257966;
      int var10008 = (var1 | var2) & (~var1 | ~var2);
      var2 = 785177344;
      var1 = var10008;
      var10008 = (var1 | var2) & ~(var1 & var2);
      var10008 = (int)-8296866274791660999L;
      var2 = 980569159;
      var1 = var10008;
      var10008 = var1 & ~var2 | ~var1 & var2;
      var2 = -731281398;
      var1 = var10008;
      String var118 = c(
         "ꢎ″ꢡ‾ꢧ‾ꢯ‸꣒⁄\ua8df", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=Ꟈ꒠ꁥꤊ絆蹅⑮謾㑸|\ua7cb꒺ꁵꤐ絺蹏", var10005, var143, var149, (var1 | var2) & ~(var1 & var2)
      );
      var2 = 42926579;
      var1 = 486858910;
      var10004 = (var1 | var2) & ~(var1 & var2);
      var2 = 529260908;
      var1 = var10004;
      this.e = new BooleanSetting(var118, pulse.Bool.from(var1 & (var2 ^ -1) | (var1 ^ -1) & var2));
      var10003 = (int)5883446149208464334L;
      var2 = -1459423225;
      var1 = var10003;
      var10003 = (var1 | var2) & ~(var1 & var2);
      var2 = -934861085;
      var1 = var10003;
      var10003 = (var1 | var2) & (~var1 | ~var2);
      var2 = 370010341;
      var1 = 853597164;
      var10004 = (var1 | var2) & (~var1 | ~var2);
      var2 = 774395171;
      var1 = var10004;
      var2 = (var1 | var2) & ~(var1 & var2);
      var1 = var10003;
      var10003 = (var1 ^ var2) + 2 * (var1 & var2);
      var2 = 2137021349;
      var1 = 1946830707;
      var10004 = (var1 | var2) - (var1 & var2);
      var2 = 1007495824;
      var1 = var10004;
      var10004 = (var1 + var2 - 2 * (var1 & var2)) * (var1 + var2 - 2 * (var1 & var2));
      var10005 = (int)4840984645879102479L;
      var2 = 1134201062;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1150300793;
      var1 = var10005;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1907204422;
      var1 = -515306966;
      int var144 = (var1 | var2) - (var1 & var2);
      var2 = -218320452;
      var1 = var144;
      var2 = (var1 | var2) & (~var1 | ~var2);
      var1 = var10005;
      var10005 = var1 - ~var2 - 1;
      var2 = 1133079431;
      var1 = 1307726935;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1824035121;
      var1 = var10005;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      int var150 = (int)-2762271352895602642L;
      var2 = 1205145702;
      var1 = var150;
      int var151 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1296134054;
      var1 = var151;
      int var152 = (var1 | var2) & (~var1 | ~var2);
      var2 = 471688367;
      var1 = -2131230326;
      int var153 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1662687948;
      var1 = var153;
      int var154 = var1 & ~var2 | ~var1 & var2;
      int var155 = (int)4965423296285066082L;
      var2 = 605537740;
      var1 = var155;
      int var156 = (var1 | var2) - (var1 & var2);
      var2 = 848463524;
      var1 = var156;
      int var157 = (var1 | var2) & ~(var1 & var2);
      var2 = 2079611184;
      var1 = -805077972;
      int var158 = var1 & ~var2 | ~var1 & var2;
      var2 = -1409866470;
      var1 = var158;
      int var159 = var1 & ~var2 | ~var1 & var2;
      var2 = 1253661272;
      var1 = 702265897;
      int var145 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1404702683;
      var1 = var145;
      int var146 = (var1 | var2) - (var1 & var2);
      int var160 = (int)7185567906577835189L;
      var2 = -311738906;
      var1 = var160;
      int var161 = var1 & ~var2 | ~var1 & var2;
      var2 = 72686333;
      var1 = var161;
      int var162 = (var1 & ~var2 | ~var1 & var2) * (var1 & ~var2 | ~var1 & var2);
      int var163 = (int)1321034461996719626L;
      var2 = 256967614;
      var1 = var163;
      int var164 = var1 + var2 - 2 * (var1 & var2);
      var2 = 32268037;
      var1 = var164;
      int var165 = (var1 | var2) & (~var1 | ~var2);
      String var169 = "lf";
      var10008 = (int)-341112497206692062L;
      var2 = 480561350;
      var1 = var10008;
      var10008 = var1 & ~var2 | ~var1 & var2;
      var2 = -1423056667;
      var1 = var10008;
      String var123 = c("ꢲ奉ꢭ夳ꢭ夲꣑夿", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=Ꟈ꒠ꁥꤊ絆蹅⑮謾㑸|\ua7cb꒺ꁵꤐ絺蹏", var10005, var146, var165, (var1 | var2) - (var1 & var2));
      var2 = 1214900899;
      var1 = -1308331920;
      var10004 = var1 + var2 - 2 * (var1 & var2);
      var2 = -93480237;
      var1 = var10004;
      this.f = new BooleanSetting(var123, pulse.Bool.from(var1 & (var2 ^ -1) | (var1 ^ -1) & var2));
      var2 = -112503558;
      var1 = -812130991;
      int var10001 = (var1 | var2) & (~var1 | ~var2);
      var2 = -920422828;
      var1 = var10001;
      this.h = (var1 | var2) - (var1 & var2);
      var10001 = (int)-3677521012918082933L;
      var2 = -1389285154;
      var1 = var10001;
      var10001 = (var1 | var2) - (var1 & var2);
      var2 = 801804885;
      var1 = var10001;
      this.i = pulse.Bool.from(var1 & ~var2 | ~var1 & var2);
   }

   @EventHandler
   public void a(ClientTickEvent var1) {
      if (c.world != null && c.player != null) {
         if (!this.g) {
            this.i = c.options.useKey.isPressed();
         }

         int var10000 = (int)729435295163880878L;
         int var10 = -280748728;
         int var9 = var10000;
         var10000 = (var9 | var10) - (var9 & var10);
         var10 = 1448867609;
         var9 = var10000;
         int var2 = (var9 | var10) - (var9 & var10);
         var10 = 1633132167;
         var9 = -892204642;
         var10000 = (var9 | var10) & (~var9 | ~var10);
         var10 = 1417308390;
         var9 = var10000;
         int var3 = var9 & ~var10 | ~var9 & var10;
         if (this.e.k()) {
            label148: {
               label131:
               if (c.player.hasStatusEffect(StatusEffects.INVISIBILITY)) {
                  if (c.player.getStatusEffect(StatusEffects.INVISIBILITY) != null) {
                     var10000 = c.player.getStatusEffect(StatusEffects.INVISIBILITY).getDuration();
                     int var10001 = (int)4250720185241687733L;
                     var10 = -956547308;
                     var9 = var10001;
                     var10001 = var9 + var10 - 2 * (var9 & var10);
                     var10 = 2115365317;
                     var9 = var10001;
                     if (var10000 <= var9 + var10 - 2 * (var9 & var10)) {
                        break label131;
                     }
                  }

                  var10000 = (int)895569422003391162L;
                  var10 = -977122333;
                  var9 = var10000;
                  var10000 = (var9 | var10) - (var9 & var10);
                  var10 = 871661913;
                  var9 = var10000;
                  var10000 = (var9 | var10) - (var9 & var10);
                  break label148;
               }

               var10 = 319328277;
               var9 = 992029982;
               var10000 = (var9 | var10) & ~(var9 & var10);
               var10 = 673824010;
               var9 = var10000;
               var10000 = (var9 | var10) & ~(var9 & var10);
            }

            int var4 = var10000;
            if (var4 != 0) {
               var10 = -2145698905;
               var9 = -314689318;
               var10000 = (var9 | var10) - (var9 & var10);
               var10 = 1831142269;
               var9 = var10000;
               int var5 = var9 & ~var10 | ~var9 & var10;

               while (true) {
                  int var159 = (int)-7197370779396552660L;
                  var10 = -206752443;
                  var9 = var159;
                  var159 = var9 & ~var10 | ~var9 & var10;
                  var10 = 585629024;
                  var9 = var159;
                  if (var5 >= (var9 | var10) - (var9 & var10)) {
                     break;
                  }

                  ItemStack var6 = c.player.getInventory().getStack(var5);
                  if (!var6.isEmpty() && var6.getItem() == Items.POTION && this.a(var6, StatusEffects.INVISIBILITY)) {
                     var2 = var5;
                     break;
                  }

                  var5++;
               }
            }
         }

         if (this.f.k()) {
            label149: {
               label110:
               if (c.player.hasStatusEffect(StatusEffects.SPEED)) {
                  if (c.player.getStatusEffect(StatusEffects.SPEED) != null) {
                     var10000 = c.player.getStatusEffect(StatusEffects.SPEED).getDuration();
                     int var161 = (int)-1861695668321450259L;
                     var10 = -1795180519;
                     var9 = var161;
                     var161 = var9 + var10 - 2 * (var9 & var10);
                     var10 = -718356848;
                     var9 = var161;
                     if (var10000 <= (var9 & ~var10 | ~var9 & var10)) {
                        break label110;
                     }
                  }

                  var10000 = (int)6614813477450366336L;
                  var10 = -515807515;
                  var9 = var10000;
                  var10000 = var9 + var10 - 2 * (var9 & var10);
                  var10 = 2074368869;
                  var9 = var10000;
                  var10000 = var9 + var10 - 2 * (var9 & var10);
                  break label149;
               }

               var10000 = (int)-3473465912511331387L;
               var10 = 360998093;
               var9 = var10000;
               var10000 = (var9 | var10) & ~(var9 & var10);
               var10 = -187570423;
               var9 = var10000;
               var10000 = (var9 | var10) & ~(var9 & var10);
            }

            int var11 = var10000;
            if (var11 != 0) {
               var10 = -1210956508;
               var9 = -1342343183;
               var10000 = (var9 | var10) - (var9 & var10);
               var10 = 405746389;
               var9 = var10000;
               int var13 = var9 & ~var10 | ~var9 & var10;

               while (true) {
                  var10 = 1194079556;
                  var9 = 1996071075;
                  int var163 = (var9 | var10) & (~var9 | ~var10);
                  var10 = 836081134;
                  var9 = var163;
                  if (var13 >= (var9 | var10) - (var9 & var10)) {
                     break;
                  }

                  ItemStack var15 = c.player.getInventory().getStack(var13);
                  if (var15.isEmpty()) {
                     if (a != a) {
                        var10000 = (int)5190190964416493498L;
                        var10 = -919653897;
                        var9 = var10000;
                        var10000 = (var9 | var10) - (var9 & var10);
                        var10 = 659785293;
                        var9 = var10000;
                        var10000 = (var9 | var10) & ~(var9 & var10);
                        var163 = (int)-1733468339665265863L;
                        var10 = 65585604;
                        var9 = var163;
                        var163 = (var9 | var10) & ~(var9 & var10);
                        var10 = -1154131203;
                        var9 = var163;
                        var10000 /= (var9 | var10) & (~var9 | ~var10);
                     }
                  } else if (var15.getItem() == Items.POTION) {
                     if (this.a(var15, StatusEffects.SPEED)) {
                        var3 = var13;
                        break;
                     }

                     if (b) {
                        var10 = -1481174498;
                        var9 = 2028188644;
                        var10000 = (var9 | var10) - (var9 & var10);
                        var10 = -1455242414;
                        var9 = var10000;
                        var10000 = var9 & ~var10 | ~var9 & var10;
                        var163 = (int)8640585340778904964L;
                        var10 = -909622057;
                        var9 = var163;
                        var163 = (var9 | var10) & ~(var9 & var10);
                        var10 = 525826453;
                        var9 = var163;
                        var10 = (var9 | var10) & ~(var9 & var10);
                        var9 = var10000;
                        var10000 = (var9 & ~var10) + (var10 & ~var9) + 2 * (var9 & var10);
                        var10000 = (int)-1036954591634345015L;
                        var10 = 772508908;
                        var9 = var10000;
                        var10000 = (var9 | var10) & ~(var9 & var10);
                        var10 = 1558099912;
                        var9 = var10000;
                        int var8 = (var9 | var10) & (~var9 | ~var10);
                        a = var8;
                     }
                  }

                  var13++;
               }
            }
         }

         var10 = 10949645;
         var9 = 780381739;
         var10000 = (var9 | var10) & ~(var9 & var10);
         var10 = -774158887;
         var9 = var10000;
         int var12 = (var9 | var10) & ~(var9 & var10);
         var10 = -1074579421;
         var9 = -730034272;
         int var168 = (var9 | var10) & ~(var9 & var10);
         var10 = -1804580740;
         var9 = var168;
         if (var2 == var9 + var10 - 2 * (var9 & var10)) {
            var10 = -1441229425;
            var9 = -1999433755;
            var168 = var9 + var10 - 2 * (var9 & var10);
            var10 = -583768683;
            var9 = var168;
            if (var3 != (var9 | var10) - (var9 & var10)) {
               var12 = var3;
            }
         } else {
            var12 = var2;
         }

         var10 = 605025652;
         var9 = -123574060;
         var168 = (var9 | var10) - (var9 & var10);
         var10 = 592601695;
         var9 = var168;
         if (var12 == (var9 | var10) - (var9 & var10)) {
            var10000 = (int)3768085841065501237L;
            var10 = -316782012;
            var9 = var10000;
            var10000 = (var9 | var10) & (~var9 | ~var10);
            var10 = 1526540401;
            var9 = var10000;
            var10000 = var9 + var10 - 2 * (var9 & var10);
         } else {
            var10000 = (int)-1235718209461816857L;
            var10 = 829351616;
            var9 = var10000;
            var10000 = (var9 | var10) - (var9 & var10);
            var10 = -605743322;
            var9 = var10000;
            var10000 = var9 + var10 - 2 * (var9 & var10);
         }

         int var14 = var10000;
         if (var14 == 0) {
            if (this.g) {
               var10 = 64294335;
               var9 = -472733277;
               var168 = var9 + var10 - 2 * (var9 & var10);
               var10 = 536370147;
               var9 = var168;
               if (this.h != (var9 | var10) - (var9 & var10)) {
                  c.player.getInventory().selectedSlot = this.h;
                  var10 = 574915302;
                  var9 = 1373502225;
                  var168 = (var9 | var10) & (~var9 | ~var10);
                  var10 = -1939438072;
                  var9 = var168;
                  this.h = (var9 | var10) & (~var9 | ~var10);
               }

               c.options.useKey.setPressed(this.i);
               var168 = (int)12237007081011526L;
               var10 = 46257476;
               var9 = var168;
               var168 = (var9 | var10) & ~(var9 & var10);
               var10 = 1055697922;
               var9 = var168;
               this.g = pulse.Bool.from((var9 | var10) & (~var9 | ~var10));
            }
         } else {
            if (!this.g) {
               this.h = c.player.getInventory().selectedSlot;
            }

            c.player.getInventory().selectedSlot = var12;
            var10 = -1480558292;
            var9 = -751587266;
            var168 = var9 & ~var10 | ~var9 & var10;
            var10 = 1962133779;
            var9 = var168;
            c.options.useKey.setPressed(pulse.Bool.from(var9 & (var10 ^ -1) | (var9 ^ -1) & var10));
            var10 = 2015612694;
            var9 = -1711288712;
            var168 = (var9 | var10) & (~var9 | ~var10);
            var10 = -505675409;
            var9 = var168;
            this.g = pulse.Bool.from((var9 | var10) & ~(var9 & var10));
         }
      }
   }

   private boolean a(ItemStack var1, RegistryEntry<StatusEffect> var2) {
      PotionContentsComponent var3 = (PotionContentsComponent)var1.get(DataComponentTypes.POTION_CONTENTS);
      if (var3 == null) {
         int var16 = -1151009024;
         int var11 = 1114489710;
         int var20 = (var11 | var16) & (~var11 | ~var16);
         var16 = -116835218;
         var11 = var20;
         return pulse.Bool.from(var11 & (var16 ^ -1) | (var11 ^ -1) & var16);
      }

      for (StatusEffectInstance var5 : var3.customEffects()) {
         if (var5.getEffectType().equals(var2)) {
            int var10000 = (int)6598078116194674655L;
            int var7 = 320442775;
            int var6 = var10000;
            var10000 = (var6 | var7) & ~(var6 & var7);
            var7 = -1089046967;
            var6 = var10000;
            return pulse.Bool.from((var6 | var7) - (var6 & var7));
         }
      }

      Optional var19 = var3.potion().map(var1x -> ((Potion)var1x.value()).getEffects().stream().anyMatch(var1xx -> var1xx.getEffectType().equals(var2)));
      int var10001 = (int)2476041375563438909L;
      int var14 = 1021386098;
      int var9 = var10001;
      var10001 = (var9 | var14) & (~var9 | ~var14);
      var14 = 323077711;
      var9 = var10001;
      return ((Boolean)var19.orElse(Boolean.valueOf(pulse.Bool.from(var9 + var14 - 2 * (var9 & var14))))).booleanValue();
   }

   @Override
   public void f() {
      super.f();
      if (this.g) {
         c.options.useKey.setPressed(this.i);
      }

      int var10001 = (int)2690694398161252420L;
      int var2 = 334175859;
      int var1 = var10001;
      var10001 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1973162440;
      var1 = var10001;
      if (this.h != var1 + var2 - 2 * (var1 & var2)) {
         c.player.getInventory().selectedSlot = this.h;
      }

      var10001 = (int)1399769411397740293L;
      var2 = 1438731621;
      var1 = var10001;
      var10001 = (var1 | var2) - (var1 & var2);
      var2 = 1343269472;
      var1 = var10001;
      this.g = pulse.Bool.from((var1 | var2) - (var1 & var2));
      var2 = -1486671104;
      var1 = 1421586645;
      var10001 = (var1 | var2) - (var1 & var2);
      var2 = 203914282;
      var1 = var10001;
      this.h = (var1 | var2) & (~var1 | ~var2);
   }

   public static String c(String var0, String var1, int var2, int var3, int var4, int var5) {
      char[] var6 = var1.toCharArray();
      char[] var7 = new char[var6.length];
      int var10000 = (int)5752623480031332843L;
      int var18 = 1284590343;
      int var17 = var10000;
      var10000 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1052278042;
      var17 = var10000;
      char[] var264 = new char[(var17 | var18) & (~var17 | ~var18)];
      int var10002 = (int)-2090458244994708400L;
      var18 = -269626252;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -1499457500;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      int var10003 = (int)-1463075122728377341L;
      var18 = 1823996191;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 447206702;
      var17 = var10003;
      var264[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var18 = -1922180492;
      var17 = 2145082125;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -222920328;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -917521410;
      var17 = 1985827797;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -1089287250;
      var17 = var10003;
      var264[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var10002 = (int)-6574441266053997062L;
      var18 = -1678914953;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -943499377;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)-8301368585653645976L;
      var18 = 686433226;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -697496284;
      var17 = var10003;
      var264[var10002] = (char)((var17 | var18) - (var17 & var18));
      var18 = 145983796;
      var17 = -504781985;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -379966872;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      int var10004 = (int)-2534274505528990612L;
      var18 = -58030431;
      var17 = var10004;
      var10004 = var17 & ~var18 | ~var17 & var18;
      var18 = 1377247944;
      var17 = var10004;
      var10004 = (var17 | var18) & (~var17 | ~var18);
      var10004 = (int)8324246974652301221L;
      var18 = 2063985780;
      var17 = var10004;
      var10004 = (var17 | var18) & ~(var17 & var18);
      var18 = 1908462548;
      var17 = var10004;
      var10004 = var17 + var18 - 2 * (var17 & var18);
      var10004 = (int)-462572035536809123L;
      var18 = -1482254990;
      var17 = var10004;
      var10004 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1653995989;
      var17 = var10004;
      var10004 = (var17 | var18) - (var17 & var18);
      var10003 = (int)7565753899670196884L;
      var18 = 1396900181;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 2090716114;
      var17 = var10003;
      var264[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var10002 = (int)-6858665700555862654L;
      var18 = 136789966;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 1561424456;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 1633149773;
      var17 = -1534920705;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1844304452;
      var17 = var10003;
      var10003 = (var17 + var18 - 2 * (var17 & var18)) * (var17 + var18 - 2 * (var17 & var18));
      var18 = -757080883;
      var17 = 660063258;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -175601166;
      var17 = var10003;
      var264[var10002] = (char)((var17 | var18) - (var17 & var18));
      var18 = -476628932;
      var17 = 549190204;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1020476923;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var10003 = (int)7372928380881165577L;
      var18 = 244894765;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -2041981786;
      var17 = var10003;
      var264[var10002] = (char)((var17 | var18) - (var17 & var18));
      var10002 = (int)8103464411421304091L;
      var18 = 271724875;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -1392815018;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)-2177807527898600524L;
      var18 = -1060704984;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 1185435535;
      var17 = var10003;
      var264[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var10002 = (int)6657088433345261148L;
      var18 = -875147047;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 3260034;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)-4091665210796492826L;
      var18 = -815259102;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -1781620250;
      var17 = var10003;
      var264[var10002] = (char)((var17 | var18) - (var17 & var18));
      var18 = -870091123;
      var17 = 1008758130;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -268231689;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -407230676;
      var17 = 1070843358;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -664147295;
      var17 = var10003;
      var264[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var18 = -888718932;
      var17 = -1888926327;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1148091436;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var10003 = (int)-4375488642115530627L;
      var18 = -1438743144;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1916005695;
      var17 = var10003;
      var264[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      char[] var8 = var264;
      var18 = 1959542468;
      var17 = 2086453223;
      var10000 = (var17 | var18) & (~var17 | ~var18);
      var18 = 143687977;
      var17 = var10000;
      char[] var266 = new char[(var17 | var18) & (~var17 | ~var18)];
      var10002 = (int)7047602988360983878L;
      var18 = -1028047036;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 1032182274;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -1050651223;
      var17 = -1714380821;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1487962722;
      var17 = var10003;
      var266[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var18 = 1558709384;
      var17 = 1136877080;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 522934929;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var10003 = (int)6210974689305239623L;
      var18 = -1068432082;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 1183196137;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 227970057;
      var17 = 1161186618;
      var10004 = (var17 | var18) & ~(var17 & var18);
      var18 = 516945341;
      var17 = var10004;
      var18 = var17 + var18 - 2 * (var17 & var18);
      var17 = var10003;
      var10003 = (var17 & ~var18) + (var18 & ~var17) + 2 * (var17 & var18);
      var18 = 593670462;
      var17 = 807655266;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 323084895;
      var17 = var10003;
      var266[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var18 = -1271074584;
      var17 = 688973476;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -1658055090;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)-3812613761311535244L;
      var18 = -1490411365;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 1261796333;
      var17 = var10003;
      var10003 = (var17 + var18 - 2 * (var17 & var18)) * (var17 + var18 - 2 * (var17 & var18));
      var10003 = (int)-6834837212042587119L;
      var18 = -1778243237;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 815151641;
      var17 = var10003;
      var266[var10002] = (char)((var17 | var18) - (var17 & var18));
      var18 = -1783250171;
      var17 = -2123106798;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 348534036;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 705379258;
      var17 = 1704087754;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 1335448434;
      var17 = var10003;
      var266[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var10002 = (int)3262452142283769904L;
      var18 = 1920475735;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 1609656931;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -804125778;
      var17 = -1114616139;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 1837266267;
      var17 = var10003;
      var266[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var10002 = (int)-7696716039371918603L;
      var18 = -2052109989;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 226507691;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -329564842;
      var17 = 784894159;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1030517491;
      var17 = var10003;
      var266[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var18 = 479679906;
      var17 = 1005161855;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 662624475;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)-2096634850794382126L;
      var18 = -2046567129;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1987555750;
      var17 = var10003;
      var10003 = ((var17 | var18) & ~(var17 & var18)) * ((var17 | var18) & ~(var17 & var18));
      var18 = 763925307;
      var17 = -1962389632;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1501537406;
      var17 = var10003;
      var266[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var18 = 1937869964;
      var17 = 540290776;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 1404412499;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1392878249;
      var17 = -1223686334;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 468339245;
      var17 = var10003;
      var266[var10002] = (char)((var17 | var18) - (var17 & var18));
      var18 = -224817647;
      var17 = 679133848;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -622637951;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 210519342;
      var17 = -220618184;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1341967297;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var10004 = (int)-1043709387952625297L;
      var18 = -1334662711;
      var17 = var10004;
      var10004 = (var17 | var18) & ~(var17 & var18);
      var18 = -1574700096;
      var17 = var10004;
      var18 = (var17 | var18) & ~(var17 & var18);
      var17 = var10003;
      var10003 = (var17 | var18) + (var17 & var18);
      var18 = 1438973591;
      var17 = -246682576;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1534094941;
      var17 = var10003;
      var266[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var18 = -1414808233;
      var17 = 748482776;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -2026418810;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -904575455;
      var17 = -1364705391;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1690126979;
      var17 = var10003;
      var266[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      char[] var9 = var266;
      var10000 = (int)8630814529354014715L;
      var18 = 1190268627;
      var17 = var10000;
      var10000 = (var17 | var18) - (var17 & var18);
      var18 = 1721700648;
      var17 = var10000;

      for (int var10 = var17 & ~var18 | ~var17 & var18; var10 < var6.length; var10++) {
         char var320 = var6[var10];
         char var249 = var8[var10 % var8.length];
         char var128 = var320;
         var7[var10] = (char)(var128 + var249 - 2 * (var128 & var249));
      }

      char[] var19 = new char[var7.length];
      var18 = 888154312;
      var17 = 1405935147;
      var10000 = var17 & ~var18 | ~var17 & var18;
      var18 = 1732048611;
      var17 = var10000;

      for (int var11 = var17 + var18 - 2 * (var17 & var18); var11 < var6.length; var11++) {
         char var321 = var7[var11];
         char var252 = var9[var11 % var9.length];
         char var131 = var321;
         var19[var11] = (char)(var131 & ~var252 | ~var131 & var252);
      }

      String var20 = new String(var19);
      int var12 = var20.hashCode();
      var18 = var5;
      var17 = var3;
      var10000 = (var17 & ~var18) - (~var17 & var18);
      var18 = var2;
      var17 = var10000;
      int var13 = (var17 ^ var18) - 2 * (~var17 & var18);
      char[] var14 = var0.toCharArray();
      char[] var15 = new char[var14.length];
      var18 = -727992454;
      var17 = -447035223;
      var10000 = var17 + var18 - 2 * (var17 & var18);
      var18 = 834764755;
      var17 = var10000;

      for (int var16 = (var17 | var18) - (var17 & var18); var16 < var15.length; var16++) {
         int var10001 = (int)-1027091700585070340L;
         var18 = 959798694;
         var17 = var10001;
         var10001 = (var17 | var18) - (var17 & var18);
         var18 = 2077580632;
         var17 = var10001;
         switch (var16 % ((var17 | var18) & ~(var17 & var18))) {
            case 0:
               var18 = var12;
               var17 = var13;
               var10002 = var17 + var18 - 2 * (var17 & var18);
               char var262 = var14[var16];
               var17 = var10002;
               var15[var16] = (char)((var17 | var262) - (var17 & var262));
               break;
            case 1:
               var18 = var13;
               var17 = var5;
               var10002 = (var17 | var18) & (~var17 | ~var18);
               char var260 = var14[var16];
               var17 = var10002;
               var15[var16] = (char)((var17 | var260) - (var17 & var260));
         }
      }

      return new String(var15);
   }
}
