package pulse;

import net.minecraft.client.sound.Sound;
import net.minecraft.client.sound.SoundInstance;
import net.minecraft.client.sound.SoundManager;
import net.minecraft.client.sound.WeightedSoundSet;
import net.minecraft.client.sound.SoundInstance.AttenuationType;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.Identifier;

public class VolumeScaledSoundInstance implements SoundInstance {
   private final SoundInstance c;
   private final float d;
   public static int a;
   public static boolean b;

   public VolumeScaledSoundInstance(SoundInstance var1, float var2) {
      this.c = var1;
      this.d = var2;
   }

   public Identifier getId() {
      return this.c.getId();
   }

   public WeightedSoundSet getSoundSet(SoundManager var1) {
      return this.c.getSoundSet(var1);
   }

   public Sound getSound() {
      return this.c.getSound();
   }

   public SoundCategory getCategory() {
      return this.c.getCategory();
   }

   public boolean isRepeatable() {
      return this.c.isRepeatable();
   }

   public boolean isRelative() {
      return this.c.isRelative();
   }

   public int getRepeatDelay() {
      return this.c.getRepeatDelay();
   }

   public float getVolume() {
      return this.c.getVolume() * this.d;
   }

   public float getPitch() {
      return this.c.getPitch();
   }

   public double getX() {
      return this.c.getX();
   }

   public double getY() {
      return this.c.getY();
   }

   public double getZ() {
      return this.c.getZ();
   }

   public AttenuationType getAttenuationType() {
      return this.c.getAttenuationType();
   }

   public boolean shouldAlwaysPlay() {
      return this.c.shouldAlwaysPlay();
   }

   public boolean canPlay() {
      return this.c.canPlay();
   }

   public static String a(String var0, String var1, int var2, int var3, int var4, int var5) {
      char[] var6 = var1.toCharArray();
      char[] var7 = new char[var6.length];
      int var20 = -348499056;
      int var19 = -486139076;
      int var10000 = (var19 | var20) & (~var19 | ~var20);
      var20 = 138168486;
      var19 = var10000;
      char[] var280 = new char[var19 & ~var20 | ~var19 & var20];
      int var10002 = (int)6385446140302704950L;
      var20 = 2007562429;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = -1433847413;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      int var10003 = (int)8727904567223439119L;
      var20 = -773650145;
      var19 = var10003;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = -213938654;
      var19 = var10003;
      var280[var10002] = (char)((var19 | var20) - (var19 & var20));
      var20 = -220575258;
      var19 = -1699939813;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1752609788;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var10003 = (int)-3347539423437766580L;
      var20 = 1515068792;
      var19 = var10003;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = 942571185;
      var19 = var10003;
      var280[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      var20 = -1684319378;
      var19 = 1645131007;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = -107616365;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var10003 = (int)-5416510232011445951L;
      var20 = 998952119;
      var19 = var10003;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = 1765443184;
      var19 = var10003;
      var280[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      var10002 = (int)8889095486272059237L;
      var20 = 21549452;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = -1869682966;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      String var369 = "bld";
      var10003 = (int)1522611634753239429L;
      var20 = 908354511;
      var19 = var10003;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = -1032650151;
      var19 = var10003;
      var280[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      var10002 = (int)7567143142884213918L;
      var20 = -2113924795;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = 371561951;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      String var372 = "ble";
      var10003 = (int)1440090251984038251L;
      var20 = 162521211;
      var19 = var10003;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = 1135450165;
      var19 = var10003;
      var280[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      var20 = -398795572;
      var19 = -260734902;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = 407854211;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = -113313428;
      var19 = -1628999442;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = 1742326784;
      var19 = var10003;
      var280[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      var20 = -350141593;
      var19 = -1490830394;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = 1275263143;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = 548870277;
      var19 = -338421072;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = -882701530;
      var19 = var10003;
      var280[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      var10002 = (int)-6280109270234557107L;
      var20 = -852732080;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = -1474018790;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = 214707979;
      var19 = -465453392;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = -393370215;
      var19 = var10003;
      var280[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      var10002 = (int)-2949995732391629892L;
      var20 = -862338236;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = 360261872;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var10003 = (int)6046281970159987096L;
      var20 = -1135522518;
      var19 = var10003;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = 1869442273;
      var19 = var10003;
      var280[var10002] = (char)((var19 | var20) & ~(var19 & var20));
      var10002 = (int)89135015263497027L;
      var20 = 1469817679;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = -1370503163;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = 1888228676;
      var19 = -1863382788;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = -530376036;
      var19 = var10003;
      var280[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      char[] var8 = var280;
      var20 = -1619776679;
      var19 = -995870709;
      var10000 = (var19 | var20) - (var19 & var20);
      var20 = 1540363096;
      var19 = var10000;
      char[] var282 = new char[(var19 | var20) & (~var19 | ~var20)];
      var10002 = (int)-1629849159604695373L;
      var20 = 1395785839;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1333333724;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = -518108850;
      var19 = -638987348;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = 955765442;
      var19 = var10003;
      var282[var10002] = (char)((var19 | var20) - (var19 & var20));
      var10002 = (int)4631581189174142395L;
      var20 = 1054371660;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = 1472416502;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      int var10004 = (int)-6611617389786214747L;
      var20 = 511591429;
      var19 = var10004;
      var10004 = (var19 | var20) & (~var19 | ~var20);
      var20 = -1803482452;
      var19 = var10004;
      var10004 = (var19 | var20) & ~(var19 & var20);
      var20 = -1319597961;
      var19 = -2109452944;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = 857489668;
      var19 = var10003;
      var282[var10002] = (char)((var19 | var20) - (var19 & var20));
      var10002 = (int)-9205687172942638818L;
      var20 = 823587370;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = 242524982;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      String var383 = "blf";
      var10003 = (int)-6500011894027534037L;
      var20 = -667209071;
      var19 = var10003;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = 748123369;
      var19 = var10003;
      var282[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      var20 = 933814484;
      var19 = 1206455116;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1883368347;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var10003 = (int)2399930421959670556L;
      var20 = 70584393;
      var19 = var10003;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = -625341609;
      var19 = var10003;
      var282[var10002] = (char)((var19 | var20) & ~(var19 & var20));
      var10002 = (int)1623107100391212581L;
      var20 = 1997041617;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = -1875645968;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var10003 = (int)-2761139360982178275L;
      var20 = 807746656;
      var19 = var10003;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1835786813;
      var19 = var10003;
      var282[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      var10002 = (int)5000274389092815373L;
      var20 = 1219645176;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = 1039015152;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = -1262856154;
      var19 = 578487247;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = -1765710979;
      var19 = var10003;
      var282[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      var20 = -1513932043;
      var19 = -927066895;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1836920322;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var10003 = (int)-6726451661543172749L;
      var20 = -1367098485;
      var19 = var10003;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1034372482;
      var19 = var10003;
      var10003 = ((var19 | var20) - (var19 & var20)) * ((var19 | var20) - (var19 & var20));
      var20 = 755721959;
      var19 = 107394694;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = 728586072;
      var19 = var10003;
      var282[var10002] = (char)((var19 | var20) & ~(var19 & var20));
      var10002 = (int)-8852668685438912554L;
      var20 = -1556920191;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = 1224949584;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var10003 = (int)-1133146990563829774L;
      var20 = 1650696705;
      var19 = var10003;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = -1220516405;
      var19 = var10003;
      var282[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      var10002 = (int)6890094481974677194L;
      var20 = -1837663915;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = -2138196073;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var10003 = (int)6815159227472710619L;
      var20 = -432418018;
      var19 = var10003;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = 1722811273;
      var19 = var10003;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var10004 = (int)-5229920910286401958L;
      var20 = -517802149;
      var19 = var10004;
      var10004 = var19 + var20 - 2 * (var19 & var20);
      var20 = -1014079880;
      var19 = var10004;
      var20 = (var19 | var20) & (~var19 | ~var20);
      var19 = var10003;
      var10003 = 2 * (var19 | var20) - (var19 ^ var20);
      var20 = -1666458968;
      var19 = 954462287;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = -1538741789;
      var19 = var10003;
      var282[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      var10002 = (int)1105981684332357265L;
      var20 = 296714419;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = 2132305451;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = 876006772;
      var19 = -1637370674;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = -1437513079;
      var19 = var10003;
      var282[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      char[] var9 = var282;
      var20 = 1584589175;
      var19 = 846043148;
      var10000 = var19 & ~var20 | ~var19 & var20;
      var20 = 1813999995;
      var19 = var10000;
      int var10 = (var19 | var20) - (var19 & var20);
      int var10001 = (int)-6680947831755688374L;
      var20 = -604749944;
      var19 = var10001;
      var10001 = (var19 | var20) & (~var19 | ~var20);
      var20 = -960689721;
      var19 = var10001;
      var10001 = (var19 | var20) - (var19 & var20);
      var10001 = (int)7184872789177019129L;
      var20 = -1338356595;
      var19 = var10001;
      var10001 = (var19 | var20) & ~(var19 & var20);
      var20 = -1551997315;
      var19 = var10001;
      var10001 = (var19 | var20) - (var19 & var20);
      var20 = -313637381;
      var19 = -948210598;
      var10001 = var19 + var20 - 2 * (var19 & var20);
      var20 = 708129184;
      var19 = var10001;
      var10001 = var19 & ~var20 | ~var19 & var20;
      var20 = -1861626074;
      var19 = -1855082232;
      var10000 = (var19 | var20) & (~var19 | ~var20);
      var20 = 292806491;
      var19 = var10000;
      int var18 = var19 + var20 - 2 * (var19 & var20);
      a = var18;
      var10001 = (int)2633815120151020264L;
      var20 = -809954692;
      var19 = var10001;
      var10001 = (var19 | var20) & ~(var19 & var20);
      var20 = 2132709526;
      var19 = var10001;
      var10001 = (var19 | var20) & (~var19 | ~var20);
      var20 = 256856026;
      var19 = 1907515205;
      var10001 = var19 + var20 - 2 * (var19 & var20);
      var20 = 2130514067;
      var19 = var10001;
      var10001 = var19 + var20 - 2 * (var19 & var20);
      var20 = -1898892891;
      var19 = -1103386403;
      var10001 = (var19 | var20) - (var19 & var20);
      var20 = 820681081;
      var19 = var10001;
      var10001 = (var19 | var20) - (var19 & var20);
      var20 = -1373270250;
      var19 = -984467692;
      var10000 = (var19 | var20) & (~var19 | ~var20);
      var20 = 606662427;
      var19 = var10000;
      if (var19 + var20 - 2 * (var19 & var20) < a) {
         var20 = -774861760;
         var19 = -323902995;
         var10000 = (var19 | var20) & (~var19 | ~var20);
         var20 = 559356645;
         var19 = var10000;
         var10000 = ((var19 | var20) & (~var19 | ~var20)) * ((var19 | var20) & (~var19 | ~var20));
         var20 = -709690087;
         var19 = 364324242;
         var10000 = (var19 | var20) & (~var19 | ~var20);
         var20 = 1889792025;
         var19 = var10000;
         var18 = var19 + var20 - 2 * (var19 & var20);
      }

      while (var10 < var6.length) {
         char var360 = var6[var10];
         char var266 = var8[var10 % var8.length];
         char var138 = var360;
         var7[var10] = (char)(var138 & ~var266 | ~var138 & var266);
         var10++;
      }

      char[] var21 = new char[var7.length];
      var20 = 1179495676;
      var19 = -1899245145;
      var10000 = var19 + var20 - 2 * (var19 & var20);
      var20 = -930710181;
      var19 = var10000;

      for (int var11 = (var19 | var20) & (~var19 | ~var20); var11 < var6.length; var11++) {
         char var361 = var7[var11];
         char var269 = var9[var11 % var9.length];
         char var141 = var361;
         var21[var11] = (char)((var141 | var269) & ~(var141 & var269));
      }

      String var22 = new String(var21);
      int var12 = var22.hashCode();
      var20 = var5;
      var19 = var3;
      var10000 = var19 - var20;
      var20 = var2;
      var19 = var10000;
      int var13 = (var19 ^ var20) - 2 * (~var19 & var20);
      char[] var14 = var0.toCharArray();
      char[] var15 = new char[var14.length];
      var20 = 609270195;
      var19 = -199008814;
      var10000 = (var19 | var20) & (~var19 | ~var20);
      var20 = -797711263;
      var19 = var10000;

      for (int var16 = (var19 | var20) - (var19 & var20); var16 < var15.length; var16++) {
         var20 = 1155438574;
         var19 = -1828541166;
         var10001 = (var19 | var20) & ~(var19 & var20);
         var20 = -673432834;
         var19 = var10001;
         switch (var16 % ((var19 | var20) & ~(var19 & var20))) {
            case 0:
               var20 = var12;
               var19 = var13;
               var10002 = var19 + var20 - 2 * (var19 & var20);
               char var279 = var14[var16];
               var19 = var10002;
               var15[var16] = (char)((var19 | var279) & ~(var19 & var279));
               break;
            case 1:
               var20 = var13;
               var19 = var5;
               var10002 = (var19 | var20) - (var19 & var20);
               char var277 = var14[var16];
               var19 = var10002;
               var15[var16] = (char)((var19 | var277) & (~var19 | ~var277));
         }
      }

      return new String(var15);
   }
}
