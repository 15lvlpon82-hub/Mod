package pulse;



import pulse.module.ClientModule;
import pulse.module.ModuleInfo;
import pulse.module.ModuleCategory;
import pulse.settings.BooleanSetting;
import pulse.settings.SliderSetting;
import java.util.HashMap;
import java.util.Map;
import lombok.Generated;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.PotionContentsComponent;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PotionItem;
import net.minecraft.potion.Potion;
import net.minecraft.registry.entry.RegistryEntry;

@ModuleInfo(a = "Cooldowns", b = "Добавляет кастомный кулдаун на зелья исцеления", c = ModuleCategory.UTILITIES)
public class Cooldowns extends ClientModule {
   private final BooleanSetting e;
   private final BooleanSetting f;
   private final SliderSetting g;
   private final Map<Item, Long> h;
   public static int a;
   public static boolean b;

   public Cooldowns() {
      int var10004 = (int)3567149921313266360L;
      int var2 = 61097983;
      int var1 = var10004;
      var10004 = (var1 | var2) & (~var1 | ~var2);
      var2 = 869588302;
      var1 = var10004;
      var10004 = (var1 | var2) & ~(var1 & var2);
      var10004 = (int)4950322477488868407L;
      var2 = -1271386094;
      var1 = var10004;
      var10004 = var1 & ~var2 | ~var1 & var2;
      var2 = 241384485;
      var1 = var10004;
      var10004 = var1 + var2 - 2 * (var1 & var2);
      var2 = -246150327;
      var1 = 1772025940;
      var10004 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1731529957;
      var1 = var10004;
      var10004 = (var1 | var2) & (~var1 | ~var2);
      int var10005 = (int)-2810685495255003325L;
      var2 = -1575907018;
      var1 = var10005;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1511383452;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var10005 = (int)5580427752453473662L;
      var2 = -997991250;
      var1 = var10005;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = -1287956030;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var10005 = (int)7382767870040470157L;
      var2 = -385259165;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = 821472544;
      var1 = var10005;
      var10005 = ((var1 | var2) & ~(var1 & var2)) * ((var1 | var2) & ~(var1 & var2));
      var10005 = (int)-9063135697483242939L;
      var2 = -473745974;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var2 = -1061598866;
      var1 = var10005;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1940704319;
      var1 = 1403592134;
      int var10006 = var1 + var2 - 2 * (var1 & var2);
      var2 = 488617222;
      var1 = var10006;
      var10006 = (var1 & ~var2 | ~var1 & var2) * (var1 & ~var2 | ~var1 & var2);
      var2 = -154735314;
      var1 = 689291511;
      var10006 = (var1 | var2) - (var1 & var2);
      var2 = 1212894364;
      var1 = var10006;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      String var10007 = "epm";
      var2 = -1159604821;
      var1 = 552064039;
      int var202 = var1 & ~var2 | ~var1 & var2;
      var2 = -1935119774;
      var1 = var202;
      int var203 = (var1 | var2) - (var1 & var2);
      var2 = -1906973650;
      var1 = -1797697175;
      int var10008 = var1 + var2 - 2 * (var1 & var2);
      var2 = -602083463;
      var1 = var10008;
      var10008 = ((var1 | var2) & ~(var1 & var2)) * ((var1 | var2) & ~(var1 & var2));
      var10008 = (int)-7934745753650927457L;
      var2 = -1147545763;
      var1 = var10008;
      var10008 = (var1 | var2) - (var1 & var2);
      var2 = 1226178608;
      var1 = var10008;
      String var10003 = c(
         "ᢌ㧀ᢦ㦾ᢢ㧀ᢣ㦷\u18ad㦲ᣘ㦲ᢣ㧂ᣟ㶠ᢤ㦰ᢧ㦵ᣓ㦶ᢩ㦸", "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=Ʂ꒺ꁾ꤉絲蹅⑭謹㑤_\ua7e9꒱ꁤ꤉絳", var10005, var10006, var203, var1 & ~var2 | ~var1 & var2
      );
      var10004 = (int)-5138903099276729668L;
      var2 = 1106528770;
      var1 = var10004;
      var10004 = (var1 | var2) - (var1 & var2);
      var2 = -109008705;
      var1 = var10004;
      this.e = new BooleanSetting(var10003, pulse.Bool.from((var1 | var2) - (var1 & var2)));
      int var143 = (int)-6193712216877479446L;
      var2 = -1364971095;
      var1 = var143;
      int var144 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1282083849;
      var1 = var144;
      int var145 = var1 + var2 - 2 * (var1 & var2);
      var2 = -892481423;
      var1 = -1009533859;
      var10004 = (var1 | var2) & ~(var1 & var2);
      var2 = 358788789;
      var1 = var10004;
      var10004 = ((var1 | var2) & ~(var1 & var2)) * ((var1 | var2) & ~(var1 & var2));
      String var178 = "epn";
      var2 = -1908509902;
      var1 = 1010456116;
      var10005 = (var1 | var2) & ~(var1 & var2);
      var2 = -1725482009;
      var1 = var10005;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var10006 = (int)-1411332585676915295L;
      var2 = 1700969153;
      var1 = var10006;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var2 = -133971309;
      var1 = var10006;
      var10006 = (var1 + var2 - 2 * (var1 & var2)) * (var1 + var2 - 2 * (var1 & var2));
      var2 = -1024959070;
      var1 = 2132072933;
      var10006 = (var1 | var2) & ~(var1 & var2);
      var2 = 709973330;
      var1 = var10006;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1016722024;
      var1 = 642535725;
      var10008 = (var1 | var2) - (var1 & var2);
      var2 = 450208590;
      var1 = var10008;
      var10008 = (var1 | var2) & ~(var1 & var2);
      var2 = 158160173;
      var1 = -1791745056;
      int var204 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1644065009;
      var1 = var204;
      int var205 = var1 & ~var2 | ~var1 & var2;
      var10008 = (int)1194748523596489770L;
      var2 = -1886197448;
      var1 = var10008;
      var10008 = var1 & ~var2 | ~var1 & var2;
      var2 = 1257137455;
      var1 = var10008;
      var10008 = (var1 | var2) - (var1 & var2);
      var10008 = (int)-7882065383367767512L;
      var2 = 1040428060;
      var1 = var10008;
      var10008 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1238960630;
      var1 = var10008;
      var10003 = c(
         "ᢱꦎᢨꧼᢩꦎᲳꦂᲳꦯᢡꦏᲳ궘ᢋ꧱ᣕꦅᢨꦅ\u18aeꦈᢦ궙",
         "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=Ʂ꒺ꁾ꤉絲蹅⑭謹㑤_\ua7e9꒱ꁤ꤉絳",
         var10005,
         var10006,
         var205,
         (var1 | var2) & ~(var1 & var2)
      );
      var10004 = (int)-782835058525025899L;
      var2 = 608017207;
      var1 = var10004;
      var10004 = var1 & ~var2 | ~var1 & var2;
      var2 = 1457083043;
      var1 = var10004;
      this.f = new BooleanSetting(var10003, pulse.Bool.from(var1 + var2 - 2 * (var1 & var2)));
      var2 = 1708156927;
      var1 = -1614164272;
      var10004 = (var1 | var2) & (~var1 | ~var2);
      var2 = -98981592;
      var1 = var10004;
      var10004 = var1 + var2 - 2 * (var1 & var2);
      var10004 = (int)8290490848715407265L;
      var2 = 1659683592;
      var1 = var10004;
      var10004 = (var1 | var2) - (var1 & var2);
      var2 = -1392644293;
      var1 = var10004;
      var10004 = (var1 | var2) & ~(var1 & var2);
      var10005 = (int)-4548911148063506514L;
      var2 = -1964484633;
      var1 = var10005;
      var10005 = var1 + var2 - 2 * (var1 & var2);
      var2 = -1244724793;
      var1 = var10005;
      var2 = var1 & ~var2 | ~var1 & var2;
      var1 = var10004;
      var10004 = 2 * (var1 | var2) - (var1 ^ var2);
      String var183 = "epo";
      var10005 = (int)3278523555332448982L;
      var2 = 966656597;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var2 = -1914012062;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      String var198 = "epp";
      var10006 = (int)-581383901694682480L;
      var2 = 1220852957;
      var1 = var10006;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var2 = 705260067;
      var1 = var10006;
      var10006 = var1 & ~var2 | ~var1 & var2;
      var10008 = (int)4672007248451122803L;
      var2 = 1813642737;
      var1 = var10008;
      var10008 = (var1 | var2) & ~(var1 & var2);
      var2 = -1545385081;
      var1 = var10008;
      var10008 = (var1 | var2) & (~var1 | ~var2);
      var10008 = (int)-5903967831174282587L;
      var2 = 1563310340;
      var1 = var10008;
      var10008 = (var1 | var2) & ~(var1 & var2);
      var2 = -1666696276;
      var1 = var10008;
      var10008 = (var1 | var2) & (~var1 | ~var2);
      int var206 = (int)-1878364062908599582L;
      var2 = 508058387;
      var1 = var206;
      int var207 = var1 + var2 - 2 * (var1 & var2);
      var2 = 643174604;
      var1 = var207;
      int var208 = var1 & ~var2 | ~var1 & var2;
      var10008 = (int)1401754547116925740L;
      var2 = -1571238715;
      var1 = var10008;
      var10008 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1397175190;
      var1 = var10008;
      var10008 = (var1 + var2 - 2 * (var1 & var2)) * (var1 + var2 - 2 * (var1 & var2));
      var10008 = (int)-1870608183074099642L;
      var2 = 1396996041;
      var1 = var10008;
      var10008 = (var1 | var2) - (var1 & var2);
      var2 = -423841132;
      var1 = var10008;
      var10003 = c(
         "ᢳⵙᢤⵕᢦ\u2d29Ჳⴡᣓⵑᣗ\u2d2bᢣ⥉ᣑⵙᢪⵕᢦ\u2d29\u18adⵛ",
         "`ꟳꓺꁡꤐ絺蹙⑿譸㑺}\ua7e2꒠ꁽ꤀紹蹃⑷謧㑻=ꟳ꒡ꁸ꤉絿蹞⑳謲㑤=Ʂ꒺ꁾ꤉絲蹅⑭謹㑤_\ua7e9꒱ꁤ꤉絳",
         var10005,
         var10006,
         var208,
         var1 & ~var2 | ~var1 & var2
      );
      var10005 = (int)7269927720882373196L;
      var2 = 26066797;
      var1 = var10005;
      var10005 = (var1 | var2) & (~var1 | ~var2);
      var2 = -30588493;
      var1 = var10005;
      var10005 = (var1 & ~var2 | ~var1 & var2) * (var1 & ~var2 | ~var1 & var2);
      int var209 = (int)9000245013414167065L;
      var2 = 590304975;
      var1 = var209;
      int var210 = var1 + var2 - 2 * (var1 & var2);
      var2 = -787964824;
      var1 = var210;
      int var211 = (var1 | var2) & ~(var1 & var2);
      this.g = new SliderSetting(var10003, 1.0F, 0.5F, 2.0F, 0.1F);
      this.h = new HashMap<>();
   }

   @Override
   public void f() {
      this.h.clear();
      super.f();
   }

   @EventHandler
   public void a(ItemUseFinishEvent var1) {
      if (!this.f.k()) {
         int var10000 = (int)7073170959026449004L;
         int var9 = 1956966070;
         int var8 = var10000;
         var10000 = (var8 | var9) - (var8 & var9);
         var9 = 788252810;
         var8 = var10000;
         var10000 = var8 + var9 - 2 * (var8 & var9);
         int var10001 = (int)7487641679050489130L;
         var9 = -783611805;
         var8 = var10001;
         var10001 = (var8 | var9) & ~(var8 & var9);
         var9 = -1883202984;
         var8 = var10001;
         var9 = (var8 | var9) & ~(var8 & var9);
         var8 = var10000;
         var10000 = (var8 & ~var9) + (var9 & ~var8) + 2 * (var8 & var9);
         var9 = -1076583809;
         var8 = -961499828;
         var10000 = var8 + var9 - 2 * (var8 & var9);
         var9 = 2119985231;
         var8 = var10000;
         int var7 = var8 + var9 - 2 * (var8 & var9);
         a = var7;
         var9 = 80059508;
         var8 = -320116919;
         var10000 = var8 & ~var9 | ~var8 & var9;
         var9 = -1741645525;
         var8 = var10000;
         var10000 = var8 & ~var9 | ~var8 & var9;
         var10000 = (int)4451386872826599187L;
         var9 = 704956494;
         var8 = var10000;
         var10000 = (var8 | var9) & (~var8 | ~var9);
         var9 = -1987939196;
         var8 = var10000;
         if (((var8 | var9) & ~(var8 & var9)) <= a) {
            throw new RuntimeException();
         }
      } else if (!CombatState.a().a()) {
         return;
      }

      ItemStack var2 = var1.d();
      if (a(var2)) {
         Item var3 = var2.getItem();
         long var4 = System.currentTimeMillis();
         this.h.put(var3, var4);
      }
   }

   @EventHandler
   public void a(ItemUseEvent var1) {
      if (c.player != null) {
         ItemStack var2 = var1.d().getStackInHand(var1.f());
         if (a(var2)) {
            Item var3 = var2.getItem();
            long var4 = System.currentTimeMillis();
            long var6 = this.h.getOrDefault(var3, 0L);
            int var10000 = (int)3817195525886930973L;
            int var13 = -1620716429;
            int var12 = var10000;
            var10000 = var12 & ~var13 | ~var12 & var13;
            var13 = -1871915621;
            var12 = var10000;
            var10000 = ((var12 | var13) & ~(var12 & var13)) * ((var12 | var13) & ~(var12 & var13));
            double var8 = 18500.0;
            long var10 = var4 - var6;
            if (var10 < var8) {
               var1.b();
            }
         }
      }
   }

   @EventHandler
   public void a(ClientTickEvent var1) {
      if (!this.f.k()) {
         int var5 = 432720992;
         int var4 = 1269868637;
         int var10000 = (var4 | var5) - (var4 & var5);
         var5 = 420236462;
         var4 = var10000;
         var10000 = (var4 | var5) - (var4 & var5);
         var5 = 958046295;
         var4 = 2053702779;
         int var10001 = (var4 | var5) - (var4 & var5);
         var5 = 159221895;
         var4 = var10001;
         var5 = var4 + var5 - 2 * (var4 & var5);
         var4 = var10000;
         var10000 = var4 - ~var5 - 1;
         var10000 = (int)4481723297676974855L;
         var5 = -1053216460;
         var4 = var10000;
         var10000 = var4 & ~var5 | ~var4 & var5;
         var5 = -875263211;
         var4 = var10000;
         int var3 = (var4 | var5) - (var4 & var5);
         a = var3;
         var5 = -466247584;
         var4 = 1615040230;
         var10000 = (var4 | var5) & ~(var4 & var5);
         var5 = -167830319;
         var4 = var10000;
         var10000 = (var4 | var5) & (~var4 | ~var5);
         var5 = -2057429562;
         var4 = -502272715;
         var10000 = var4 & ~var5 | ~var4 & var5;
         var5 = 1454262913;
         var4 = var10000;
         if (((var4 | var5) & ~(var4 & var5)) < a) {
            String var38 = "epq";
            var5 = 547063622;
            var4 = -1466510322;
            var10000 = (var4 | var5) & (~var4 | ~var5);
            var5 = -608991633;
            var4 = var10000;
            var3 = var4 & ~var5 | ~var4 & var5;
         }
      } else if (!CombatState.a().a()) {
         this.h.clear();
      }
   }

   public static boolean a(ItemStack var0) {
      if (var0.getItem() instanceof PotionItem) {
         int var10001 = (int)961903440789497909L;
         int var29 = 368261888;
         int var8 = var10001;
         var10001 = var8 & ~var29 | ~var8 & var29;
         var29 = 1435030310;
         var8 = var10001;
         var10001 = (var8 | var29) & ~(var8 & var29);
         var29 = 64360999;
         var8 = -1286825865;
         var10001 = (var8 | var29) & ~(var8 & var29);
         var29 = -1332049328;
         var8 = var10001;
         var10001 = (var8 | var29) - (var8 & var29);
         var29 = -1623829368;
         var8 = -1945929002;
         int var49 = var8 + var29 - 2 * (var8 & var29);
         var29 = 2011921788;
         var8 = var49;
         int var3 = (var8 | var29) & ~(var8 & var29);
         a = var3;
         var29 = -2012836573;
         var8 = 1822861284;
         var49 = (var8 | var29) - (var8 & var29);
         var29 = 1686735852;
         var8 = var49;
         var49 = var8 + var29 - 2 * (var8 & var29);
         var29 = 1547867877;
         var8 = 107328440;
         var49 = (var8 | var29) & ~(var8 & var29);
         var29 = 885402306;
         var8 = var49;
         if (((var8 | var29) & ~(var8 & var29)) <= a) {
            var49 = (int)9073367181539290512L;
            var29 = -660009131;
            var8 = var49;
            var49 = var8 & ~var29 | ~var8 & var29;
            var29 = -2102597529;
            var8 = var49;
            var49 = (var8 | var29) - (var8 & var29);
            var29 = -1863754382;
            var8 = 409654230;
            var49 = var8 & ~var29 | ~var8 & var29;
            var29 = 2019823406;
            var8 = var49;
            var3 = var8 + var29 - 2 * (var8 & var29);
         }

         if (var0.contains(DataComponentTypes.POTION_CONTENTS)) {
            PotionContentsComponent var1 = (PotionContentsComponent)var0.get(DataComponentTypes.POTION_CONTENTS);
            if (var1 == null) {
               var49 = (int)2571249296479275529L;
               var29 = -1394547899;
               var8 = var49;
               var49 = (var8 | var29) & ~(var8 & var29);
               var29 = 494807372;
               var8 = var49;
               return pulse.Bool.from((var8 | var29) & (var8 ^ -1 | var29 ^ -1));
            } else if (var1.potion().isPresent() && ((Potion)((RegistryEntry)var1.potion().get()).value()).getEffects().stream().anyMatch(var0x -> {
               int var10x;
               if (var0x.getEffectType() != StatusEffects.INSTANT_HEALTH) {
                  var10x = (int)7120445716386867893L;
                  int var2 = -1949744747;
                  int var1x = var10x;
                  var10x = (var1x | var2) - (var1x & var2);
                  var2 = -1267094752;
                  var1x = var10x;
                  var10x = (var1x | var2) & ~(var1x & var2);
               } else {
                  var10x = (int)6297368367064333895L;
                  int var7x = -1514336202;
                  int var4x = var10x;
                  var10x = (var4x | var7x) & (~var4x | ~var7x);
                  var7x = -1625575824;
                  var4x = var10x;
                  var10x = (var4x | var7x) & ~(var4x & var7x);
               }

               return pulse.Bool.from(var10x);
            })) {
               var29 = -382734966;
               var8 = 781291918;
               var49 = (var8 | var29) - (var8 & var29);
               var29 = -943817723;
               var8 = var49;
               return pulse.Bool.from((var8 | var29) - (var8 & var29));
            } else {
               return var1.customEffects().stream().anyMatch(var0x -> {
                  int var9x;
                  if (var0x.getEffectType() != StatusEffects.INSTANT_HEALTH) {
                     int var2 = 1798221286;
                     int var1x = 1569117739;
                     var9x = (var1x | var2) & (~var1x | ~var2);
                     var2 = 917011405;
                     var1x = var9x;
                     var9x = var1x + var2 - 2 * (var1x & var2);
                  } else {
                     var9x = (int)-1496237610975654582L;
                     int var7x = -1024728524;
                     int var4x = var9x;
                     var9x = (var4x | var7x) & ~(var4x & var7x);
                     var7x = 953970559;
                     var4x = var9x;
                     var9x = var4x & ~var7x | ~var4x & var7x;
                  }

                  return pulse.Bool.from(var9x);
               });
            }
         } else {
            var29 = 1738598686;
            var8 = 589799570;
            var49 = (var8 | var29) & (~var8 | ~var29);
            var29 = 1149716876;
            var8 = var49;
            return pulse.Bool.from((var8 | var29) - (var8 & var29));
         }
      } else {
         int var5 = 243788644;
         int var4 = 1758144329;
         int var10000 = (var4 | var5) - (var4 & var5);
         var5 = 1716309037;
         var4 = var10000;
         return pulse.Bool.from((var4 | var5) - (var4 & var5));
      }
   }

   private float c(Item var1) {
      long var2 = this.h.getOrDefault(var1, 0L);
      int var10000 = (int)4714730491196354455L;
      int var9 = 849430665;
      int var8 = var10000;
      var10000 = (var8 | var9) - (var8 & var9);
      var9 = -1034088819;
      var8 = var10000;
      var10000 = (var8 | var9) - (var8 & var9);
      double var4 = 18500.0;
      long var6 = System.currentTimeMillis() - var2;
      if (!(var6 >= var4)) {
         if (b) {
            var10000 = (int)6892793413254204274L;
            var9 = 1608704427;
            var8 = var10000;
            var10000 = (var8 | var9) & ~(var8 & var9);
            var9 = -1530287399;
            var8 = var10000;
            var10000 = (var8 | var9) & ~(var8 & var9);
            var9 = 111759217;
            var8 = -831205477;
            int var10001 = (var8 | var9) - (var8 & var9);
            var9 = -925007638;
            var8 = var10001;
            var10000 /= (var8 | var9) & ~(var8 & var9);
         }

         return 1.0F - (float)(var6 / var4);
      } else {
         this.h.remove(var1);
         return 0.0F;
      }
   }

   public float a(Item var1) {
      return this.c(var1);
   }

   public boolean b(Item var1) {
      if (!this.h.containsKey(var1)) {
         if (b) {
            throw new ExceptionInInitializerError();
         }
      } else if (this.a(var1) > 0.0F) {
         int var8 = 1585686999;
         int var5 = 938844178;
         int var12 = var5 + var8 - 2 * (var5 & var8);
         var8 = 1769343428;
         var5 = var12;
         return pulse.Bool.from(var5 & ~var8 | ~var5 & var8);
      }

      int var10000 = (int)-7347252798423622808L;
      int var3 = 593142545;
      int var2 = var10000;
      var10000 = (var2 | var3) - (var2 & var3);
      var3 = -106055559;
      var2 = var10000;
      return pulse.Bool.from((var2 | var3) & ~(var2 & var3));
   }

   public boolean n() {
      return this.e.k();
   }

   @Generated
   public BooleanSetting o() {
      return this.e;
   }

   @Generated
   public BooleanSetting p() {
      return this.f;
   }

   @Generated
   public SliderSetting q() {
      return this.g;
   }

   @Generated
   public Map<Item, Long> r() {
      return this.h;
   }

   public static String c(String var0, String var1, int var2, int var3, int var4, int var5) {
      char[] var6 = var1.toCharArray();
      char[] var7 = new char[var6.length];
      int var10000 = (int)4763346557448117094L;
      int var18 = 112428322;
      int var17 = var10000;
      var10000 = (var17 | var18) & ~(var17 & var18);
      var18 = -327819698;
      var17 = var10000;
      char[] var240 = new char[var17 & ~var18 | ~var17 & var18];
      var18 = 1837145406;
      var17 = -1844061058;
      int var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -6995648;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      int var10003 = (int)-5451782031856142078L;
      var18 = -422402181;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1870031285;
      var17 = var10003;
      var240[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var18 = 1219585154;
      var17 = 1881692763;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 949567192;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)-3585597653086720085L;
      var18 = -1594956753;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 748972033;
      var17 = var10003;
      var240[var10002] = (char)((var17 | var18) - (var17 & var18));
      var18 = -1025760448;
      var17 = 502457219;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -550584127;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)7167507928378479794L;
      var18 = 1403055261;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 141253545;
      var17 = var10003;
      var240[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var18 = -809676476;
      var17 = -153078956;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 962421267;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      String var306 = "epr";
      var10003 = (int)-8051904082040236771L;
      var18 = 761217219;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -584675891;
      var17 = var10003;
      var240[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var18 = -259579986;
      var17 = -1285906159;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 1138605755;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)5550383664370150985L;
      var18 = 1976696307;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 1110053179;
      var17 = var10003;
      var10003 = ((var17 | var18) & ~(var17 & var18)) * ((var17 | var18) & ~(var17 & var18));
      var10003 = (int)4917009462039352088L;
      var18 = -56843319;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 445325812;
      var17 = var10003;
      var240[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var18 = -430473429;
      var17 = 703262448;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -809659938;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1548837260;
      var17 = 252133928;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1398171170;
      var17 = var10003;
      var240[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var18 = 596000887;
      var17 = -738376037;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -260372758;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var10003 = (int)2830406618842872547L;
      var18 = -409348605;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 965928435;
      var17 = var10003;
      var240[var10002] = (char)((var17 | var18) - (var17 & var18));
      var18 = 1925499556;
      var17 = 1925339743;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 430332;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 86952754;
      var17 = 72860904;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 24722424;
      var17 = var10003;
      var240[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var18 = -1487440078;
      var17 = 973606481;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -1654687381;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var10003 = (int)2286420894167580559L;
      var18 = -278881178;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1669125190;
      var17 = var10003;
      var240[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var10002 = (int)4342964399843872532L;
      var18 = -852648313;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1508970906;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 613955198;
      var17 = 136293754;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = 747084832;
      var17 = var10003;
      var240[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      char[] var8 = var240;
      var10000 = (int)-7691886912630373887L;
      var18 = 691747052;
      var17 = var10000;
      var10000 = (var17 | var18) & (~var17 | ~var18);
      var18 = 285997799;
      var17 = var10000;
      char[] var243 = new char[var17 & ~var18 | ~var17 & var18];
      var10002 = (int)3048400849033443008L;
      var18 = 1540957379;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1871048189;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var10003 = (int)-2408652460676043646L;
      var18 = 629071903;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 460719293;
      var17 = var10003;
      var243[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var18 = 1764660783;
      var17 = -2140532286;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -381384724;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      String var323 = "eps";
      var10003 = (int)3302369088434617980L;
      var18 = -724181171;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -1514838734;
      var17 = var10003;
      var243[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var10002 = (int)3653370891998279706L;
      var18 = -815653473;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -2060638841;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 1115065753;
      var17 = 524595012;
      int var10004 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1563566799;
      var17 = var10004;
      var10004 = (var17 | var18) & ~(var17 & var18);
      var10004 = (int)7770261012985291544L;
      var18 = 1801830582;
      var17 = var10004;
      var10004 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1751901094;
      var17 = var10004;
      var10004 = var17 & ~var18 | ~var17 & var18;
      var18 = 434106830;
      var17 = -1677536811;
      var10004 = var17 & ~var18 | ~var17 & var18;
      var18 = -2049105894;
      var17 = var10004;
      var10004 = (var17 | var18) & ~(var17 & var18);
      var18 = 392723420;
      var17 = -319466193;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -73553504;
      var17 = var10003;
      var243[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var10002 = (int)2482987284119568442L;
      var18 = -363295230;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 1637535291;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -838874349;
      var17 = 94500568;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -933362231;
      var17 = var10003;
      var243[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var18 = -241425753;
      var17 = -1822975016;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 1657518459;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var10003 = (int)-8216603515454888572L;
      var18 = -951158205;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 509323143;
      var17 = var10003;
      var243[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var10002 = (int)75702058360406609L;
      var18 = 1722032016;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1611489852;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)-5280527060023927343L;
      var18 = -2116034091;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 1236288656;
      var17 = var10003;
      var243[var10002] = (char)((var17 | var18) - (var17 & var18));
      var10002 = (int)1634159618013397061L;
      var18 = -1010619419;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 1916349350;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      String var332 = "ept";
      var10003 = (int)-607768147436359585L;
      var18 = -145289821;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -48907579;
      var17 = var10003;
      var243[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var18 = 949207409;
      var17 = -1210871496;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1891610546;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -121543819;
      var17 = -985348352;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1032172621;
      var17 = var10003;
      var243[var10002] = (char)((var17 | var18) - (var17 & var18));
      var10002 = (int)7625694605367349966L;
      var18 = -666592468;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -1630795286;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -574047249;
      var17 = -144422481;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1253999785;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -597679150;
      var17 = 308135130;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -834837492;
      var17 = var10003;
      var243[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var18 = -1801984290;
      var17 = 716684862;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -1105176343;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 2039548574;
      var17 = 689577060;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 1351296457;
      var17 = var10003;
      var243[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      char[] var9 = var243;
      var10000 = (int)4586057184792841593L;
      var18 = 1245863472;
      var17 = var10000;
      var10000 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1635177289;
      var17 = var10000;

      for (int var10 = (var17 | var18) & (~var17 | ~var18); var10 < var6.length; var10++) {
         char var297 = var6[var10];
         char var225 = var8[var10 % var8.length];
         char var116 = var297;
         var7[var10] = (char)(var116 + var225 - 2 * (var116 & var225));
      }

      char[] var19 = new char[var7.length];
      var10000 = (int)-8306965460822506711L;
      var18 = 1672714487;
      var17 = var10000;
      var10000 = var17 & ~var18 | ~var17 & var18;
      var18 = -1852843042;
      var17 = var10000;

      for (int var11 = var17 + var18 - 2 * (var17 & var18); var11 < var6.length; var11++) {
         char var298 = var7[var11];
         char var228 = var9[var11 % var9.length];
         char var119 = var298;
         var19[var11] = (char)(var119 & ~var228 | ~var119 & var228);
      }

      String var20 = new String(var19);
      int var12 = var20.hashCode();
      var18 = var5;
      var17 = var3;
      var10000 = 2 * (var17 & ~var18) - (var17 ^ var18);
      var18 = var2;
      var17 = var10000;
      int var13 = 2 * (var17 & ~var18) - (var17 ^ var18);
      char[] var14 = var0.toCharArray();
      char[] var15 = new char[var14.length];
      var10000 = (int)-6491725199109924459L;
      var18 = -1684616755;
      var17 = var10000;
      var10000 = (var17 | var18) - (var17 & var18);
      var18 = -334557096;
      var17 = var10000;

      for (int var16 = var17 + var18 - 2 * (var17 & var18); var16 < var15.length; var16++) {
         var18 = 1929830790;
         var17 = 1672391912;
         int var10001 = (var17 | var18) & (~var17 | ~var18);
         var18 = 279465324;
         var17 = var10001;
         switch (var16 % ((var17 | var18) & ~(var17 & var18))) {
            case 0:
               var18 = var12;
               var17 = var13;
               var10002 = (var17 | var18) & (~var17 | ~var18);
               char var238 = var14[var16];
               var17 = var10002;
               var15[var16] = (char)(var17 + var238 - 2 * (var17 & var238));
               break;
            case 1:
               var18 = var13;
               var17 = var5;
               var10002 = var17 & ~var18 | ~var17 & var18;
               char var236 = var14[var16];
               var17 = var10002;
               var15[var16] = (char)((var17 | var236) - (var17 & var236));
         }
      }

      return new String(var15);
   }
}
