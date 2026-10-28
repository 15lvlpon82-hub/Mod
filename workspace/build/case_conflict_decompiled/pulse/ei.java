/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1304
 *  net.minecraft.class_1664
 *  net.minecraft.class_1802
 *  net.minecraft.class_2960
 *  net.minecraft.class_310
 *  net.minecraft.class_742
 *  pulse.Bool
 *  pulse.CapeTextureCache
 *  ru.pulse.Pulse
 */
package pulse;

import net.minecraft.class_1304;
import net.minecraft.class_1664;
import net.minecraft.class_1802;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_742;
import pulse.Bool;
import pulse.CapeTextureCache;
import pulse.eP;
import pulse.em;
import ru.pulse.Pulse;

public class ei {
    public static int a;
    public static boolean b;

    private ei() {
    }

    public static class_2960 a(class_742 var0) {
        Integer var2;
        if (var0 == null) {
            return null;
        }
        class_310 var1 = class_310.method_1551();
        if (var1.field_1724 != null && var1.field_1724.method_5628() == var0.method_5628()) {
            eP var4 = Pulse.getUserInfo();
            if (var4 == null) {
                return null;
            }
            var2 = var4.b();
        } else {
            String var3 = var0.method_7334().getName();
            var2 = em.c().b(var3);
        }
        return var2 == null ? null : CapeTextureCache.getInstance().getCapeTexture(var2.intValue());
    }

    public static boolean b(class_742 var0) {
        if (var0 == null) {
            int var77 = 51728903;
            int var56 = -1998637553;
            int var30 = var77;
            var77 = (var30 | var56) - (var30 & var56);
            var56 = -1949670392;
            var30 = var77;
            return Bool.from((int)((var30 | var56) & (~var30 | ~var56)));
        }
        class_310 var1 = class_310.method_1551();
        if (var1.field_1724 == null) {
            int var54 = -774996471;
            int var28 = 1267077741;
            int var76 = (var28 | var54) & ~(var28 & var54);
            var54 = -1706529692;
            var28 = var76;
            return Bool.from((int)((var28 | var54) & ~(var28 & var54)));
        }
        if (ei.a(var0) == null) {
            int var74 = 319628441;
            int var52 = -931782330;
            int var26 = var74;
            var74 = (var26 | var52) & (~var26 | ~var52);
            var52 = -612694561;
            var26 = var74;
            return Bool.from((int)((var26 | var52) & ~(var26 & var52)));
        }
        if (!var0.method_5767() && var0.method_7348(class_1664.field_7559)) {
            int var3;
            int var33 = -311579984;
            int var7 = 901748893;
            int var59 = (var7 | var33) - (var7 & var33);
            var33 = -207728888;
            var7 = var59;
            var59 = (var7 | var33) - (var7 & var33);
            var33 = 789750487;
            var7 = -1233240408;
            int var10001 = (var7 | var33) - (var7 & var33);
            var33 = 1298769976;
            var7 = var10001;
            var33 = var7 + var33 - 2 * (var7 & var33);
            var7 = var59;
            var59 = (var7 ^ var33) + 2 * (var7 & var33);
            var33 = -1782584619;
            var7 = -1919271593;
            var59 = (var7 | var33) & (~var7 | ~var33);
            var33 = 417745115;
            var7 = var59;
            a = var3 = (var7 | var33) & ~(var7 & var33);
            var33 = -1801419306;
            var7 = 1129766111;
            var59 = var7 & ~var33 | ~var7 & var33;
            var33 = 1582360783;
            var7 = var59;
            var59 = ((var7 | var33) - (var7 & var33)) * ((var7 | var33) - (var7 & var33));
            var59 = -129486830;
            var33 = 803920614;
            var7 = var59;
            var59 = var7 & ~var33 | ~var7 & var33;
            if (((var7 = var59) | (var33 = -547999298)) - (var7 & var33) <= a) {
                var33 = -674685405;
                var7 = 661391944;
                var59 = (var7 | var33) & (~var7 | ~var33);
                var33 = -257616789;
                var7 = var59;
                var59 = var7 & ~var33 | ~var7 & var33;
                var33 = -931843807;
                var7 = -1022098808;
                var10001 = (var7 | var33) & (~var7 | ~var33);
                var33 = 190919593;
                var7 = var10001;
                var59 /= var7 & ~var33 | ~var7 & var33;
            }
            if (!var0.method_6118(class_1304.field_6174).method_7960() && var0.method_6118(class_1304.field_6174).method_7909() == class_1802.field_8833) {
                var59 = -1687204736;
                var33 = -938206088;
                var7 = var59;
                var59 = (var7 | var33) - (var7 & var33);
                var33 = 1400590584;
                var7 = var59;
                var59 = var7 & ~var33 | ~var7 & var33;
            } else {
                var33 = 921432865;
                var7 = -1186738625;
                var59 = (var7 | var33) & (~var7 | ~var33);
                var33 = -1884799713;
                var7 = var59;
                var59 = (var7 | var33) & (~var7 | ~var33);
            }
            return Bool.from((int)var59);
        }
        int var10000 = 1225418096;
        int var5 = -426644968;
        int var4 = var10000;
        var10000 = var4 + var5 - 2 * (var4 & var5);
        var5 = -1348759704;
        var4 = var10000;
        return Bool.from((int)(var4 + var5 - 2 * (var4 & var5)));
    }

    public static String a(String var0, String var1, int var2, int var3, int var4, int var5) {
        char[] var6 = var1.toCharArray();
        char[] var7 = new char[var6.length];
        int var10000 = 511123530;
        int var20 = 191909582;
        int var19 = var10000;
        var10000 = var19 & ~var20 | ~var19 & var20;
        var20 = 352808590;
        var19 = var10000;
        char[] var288 = new char[(var19 | var20) & (~var19 | ~var20)];
        var20 = -1402880968;
        var19 = 1148705843;
        int var10002 = (var19 | var20) & (~var19 | ~var20);
        var20 = -401186805;
        var19 = var10002;
        var10002 = (var19 | var20) - (var19 & var20);
        int var10003 = -1506036876;
        var20 = -951639450;
        var19 = var10003;
        var10003 = (var19 | var20) & (~var19 | ~var20);
        var20 = 1635572000;
        var19 = var10003;
        var288[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
        var20 = 1973163339;
        var19 = -1686039669;
        var10002 = var19 & ~var20 | ~var19 & var20;
        var20 = -300087615;
        var19 = var10002;
        var10002 = var19 & ~var20 | ~var19 & var20;
        var10003 = -1019948921;
        var20 = 1005922222;
        var19 = var10003;
        var10003 = (var19 | var20) - (var19 & var20);
        var20 = -121514836;
        var19 = var10003;
        var288[var10002] = (char)((var19 | var20) & ~(var19 & var20));
        var10002 = -1759636859;
        var20 = -455499401;
        var19 = var10002;
        var10002 = (var19 | var20) - (var19 & var20);
        var20 = 1942467568;
        var19 = var10002;
        var10002 = (var19 | var20) & ~(var19 & var20);
        var10003 = 1862109733;
        var20 = 116646975;
        var19 = var10003;
        var10003 = (var19 | var20) & ~(var19 & var20);
        var20 = 1745767836;
        var19 = var10003;
        var288[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
        var10002 = 1893840580;
        var20 = 725311839;
        var19 = var10002;
        var10002 = (var19 | var20) - (var19 & var20);
        var20 = 1541068696;
        var19 = var10002;
        var10002 = (var19 | var20) - (var19 & var20);
        var20 = -1550199967;
        var19 = 936642719;
        var10003 = (var19 | var20) & ~(var19 & var20);
        var20 = 565057275;
        var19 = var10003;
        var10003 = ((var19 | var20) - (var19 & var20)) * ((var19 | var20) - (var19 & var20));
        var10003 = -1520884405;
        var20 = 1943003512;
        var19 = var10003;
        var10003 = (var19 | var20) & (~var19 | ~var20);
        var20 = -694789088;
        var19 = var10003;
        var288[var10002] = (char)((var19 | var20) - (var19 & var20));
        var20 = 660622235;
        var19 = 1840986571;
        var10002 = var19 & ~var20 | ~var19 & var20;
        var20 = 1255895636;
        var19 = var10002;
        var10002 = var19 + var20 - 2 * (var19 & var20);
        "\u0017\ufffdt\ufffd@\ufffd".length();
        var20 = 1704345468;
        var19 = -542612083;
        int var10004 = (var19 | var20) - (var19 & var20);
        var20 = -1170318595;
        var19 = var10004;
        var10004 = (var19 | var20) & ~(var19 & var20);
        "\ufffdH".length();
        var10004 = -691652233;
        var20 = -227612716;
        var19 = var10004;
        var10004 = (var19 | var20) & ~(var19 & var20);
        var20 = 615046831;
        var19 = var10004;
        var10004 = var19 & ~var20 | ~var19 & var20;
        "ay\ufffd\u001f\ufffd\ufffd\u000f\u0725\ufffd7o\"C".length();
        var10004 = 1733154638;
        var20 = 1785383312;
        var19 = var10004;
        var10004 = (var19 | var20) & ~(var19 & var20);
        var20 = 220667603;
        var19 = var10004;
        var10004 = (var19 | var20) - (var19 & var20);
        var20 = 1710185749;
        var19 = -1031030455;
        var10003 = var19 + var20 - 2 * (var19 & var20);
        var20 = -1486588551;
        var19 = var10003;
        var288[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
        var20 = -582616064;
        var19 = -255497965;
        var10002 = (var19 | var20) & ~(var19 & var20);
        var20 = 763401494;
        var19 = var10002;
        var10002 = (var19 | var20) & (~var19 | ~var20);
        var20 = 890351099;
        var19 = 2060020564;
        var10003 = (var19 | var20) & (~var19 | ~var20);
        var20 = 1339589421;
        var19 = var10003;
        var288[var10002] = (char)((var19 | var20) - (var19 & var20));
        var20 = -1632565811;
        var19 = -113629790;
        var10002 = var19 & ~var20 | ~var19 & var20;
        var20 = 1737171049;
        var19 = var10002;
        var10002 = var19 + var20 - 2 * (var19 & var20);
        var20 = 526154935;
        var19 = -1055414223;
        var10003 = var19 & ~var20 | ~var19 & var20;
        var20 = -565453419;
        var19 = var10003;
        var288[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
        var10002 = -342786795;
        var20 = -508503969;
        var19 = var10002;
        var10002 = (var19 | var20) & (~var19 | ~var20);
        var20 = 169977165;
        var19 = var10002;
        var10002 = (var19 | var20) & ~(var19 & var20);
        var10003 = -491734969;
        var20 = 1141124806;
        var19 = var10003;
        var10003 = (var19 | var20) & ~(var19 & var20);
        var20 = -1498111325;
        var19 = var10003;
        var288[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
        var20 = -1621025271;
        var19 = -1330611530;
        var10002 = var19 & ~var20 | ~var19 & var20;
        var20 = 802251959;
        var19 = var10002;
        var10002 = (var19 | var20) & (~var19 | ~var20);
        var10003 = 1620271293;
        var20 = 1726251809;
        var19 = var10003;
        var10003 = var19 + var20 - 2 * (var19 & var20);
        var20 = 108522447;
        var19 = var10003;
        var288[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
        var10002 = 467598753;
        var20 = 162853959;
        var19 = var10002;
        var10002 = var19 & ~var20 | ~var19 & var20;
        var20 = 308939247;
        var19 = var10002;
        var10002 = var19 & ~var20 | ~var19 & var20;
        var10003 = 1888873812;
        var20 = 665706881;
        var19 = var10003;
        var10003 = (var19 | var20) - (var19 & var20);
        var20 = 1463290865;
        var19 = var10003;
        var288[var10002] = (char)((var19 | var20) - (var19 & var20));
        char[] var8 = var288;
        var20 = -1652167185;
        var19 = -391893780;
        var10000 = var19 & ~var20 | ~var19 & var20;
        var20 = 1965146377;
        var19 = var10000;
        char[] var290 = new char[(var19 | var20) & ~(var19 & var20)];
        var10002 = -1116690429;
        var20 = 107432404;
        var19 = var10002;
        var10002 = (var19 | var20) & (~var19 | ~var20);
        var20 = -1156062761;
        var19 = var10002;
        var10002 = (var19 | var20) & ~(var19 & var20);
        var20 = -86468270;
        var19 = 1800494466;
        var10003 = var19 & ~var20 | ~var19 & var20;
        var20 = -1853256464;
        var19 = var10003;
        var290[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
        var20 = 180310280;
        var19 = -1703483895;
        var10002 = var19 + var20 - 2 * (var19 & var20);
        var20 = -1865828608;
        var19 = var10002;
        var10002 = var19 & ~var20 | ~var19 & var20;
        var10003 = -226856763;
        var20 = 209629850;
        var19 = var10003;
        var10003 = (var19 | var20) & (~var19 | ~var20);
        var20 = -328575170;
        var19 = var10003;
        var10003 = ((var19 | var20) & ~(var19 & var20)) * ((var19 | var20) & ~(var19 & var20));
        var10003 = -1433297598;
        var20 = -372483931;
        var19 = var10003;
        var10003 = var19 + var20 - 2 * (var19 & var20);
        var20 = 1130185188;
        var19 = var10003;
        var290[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
        var20 = 1077258176;
        var19 = -1435542310;
        var10002 = (var19 | var20) - (var19 & var20);
        var20 = -363136232;
        var19 = var10002;
        var10002 = var19 & ~var20 | ~var19 & var20;
        var20 = 436523167;
        var19 = 1048119144;
        var10003 = (var19 | var20) - (var19 & var20);
        var20 = -436256653;
        var19 = var10003;
        var10003 = (var19 | var20) & ~(var19 & var20);
        var20 = 1909490786;
        var19 = 1452786303;
        var10004 = (var19 | var20) & ~(var19 & var20);
        var20 = 434255316;
        var19 = var10004;
        var20 = (var19 | var20) & ~(var19 & var20);
        var19 = var10003;
        var10003 = var19 - ~var20 - 1;
        var20 = 1877553547;
        var19 = -1195747713;
        var10003 = (var19 | var20) & ~(var19 & var20);
        var20 = -682368857;
        var19 = var10003;
        var290[var10002] = (char)((var19 | var20) & ~(var19 & var20));
        var10002 = -1811345446;
        var20 = 1233972534;
        var19 = var10002;
        var10002 = (var19 | var20) - (var19 & var20);
        var20 = -578428177;
        var19 = var10002;
        var10002 = var19 & ~var20 | ~var19 & var20;
        var20 = -1103901241;
        var19 = -1700226917;
        var10003 = (var19 | var20) & (~var19 | ~var20);
        var20 = 614165854;
        var19 = var10003;
        var290[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
        var20 = -1461942595;
        var19 = 354671759;
        var10002 = (var19 | var20) & ~(var19 & var20);
        var20 = -1107338698;
        var19 = var10002;
        var10002 = var19 + var20 - 2 * (var19 & var20);
        var10003 = 1032223956;
        var20 = 1755878731;
        var19 = var10003;
        var10003 = (var19 | var20) & ~(var19 & var20);
        var20 = 1429131743;
        var19 = var10003;
        var290[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
        var20 = 316476465;
        var19 = -58124336;
        var10002 = var19 & ~var20 | ~var19 & var20;
        var20 = -296477724;
        var19 = var10002;
        var10002 = var19 + var20 - 2 * (var19 & var20);
        var10003 = 716436842;
        var20 = 1644227465;
        var19 = var10003;
        var10003 = var19 & ~var20 | ~var19 & var20;
        var20 = 1219700343;
        var19 = var10003;
        var290[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
        var10002 = -273516414;
        var20 = -939452393;
        var19 = var10002;
        var10002 = var19 + var20 - 2 * (var19 & var20);
        var20 = 666067091;
        var19 = var10002;
        var10002 = (var19 | var20) - (var19 & var20);
        "Pj\u0015\ufffd\ufffd\ufffd\b\ufffdX\ufffdI\ufffdE<\ufffd\ufffdD\ufffd\ufffd".length();
        var20 = -282471129;
        var19 = -781029765;
        var10004 = var19 & ~var20 | ~var19 & var20;
        var20 = 1046199133;
        var19 = var10004;
        var10004 = (var19 | var20) - (var19 & var20);
        "H\b\ufffd\ufffd".length();
        var10004 = 283487705;
        var20 = -1013741135;
        var19 = var10004;
        var10004 = (var19 | var20) & (~var19 | ~var20);
        var20 = -747232134;
        var19 = var10004;
        var10004 = (var19 | var20) & (~var19 | ~var20);
        "k.\ufffd\u0001:\ufffdz`\ufffd]Rvg\"\ufffd\ufffd".length();
        var20 = -1235523639;
        var19 = 934579185;
        var10004 = var19 & ~var20 | ~var19 & var20;
        var20 = -2114982872;
        var19 = var10004;
        var10004 = (var19 | var20) & ~(var19 & var20);
        var10003 = 66270080;
        var20 = -527139701;
        var19 = var10003;
        var10003 = (var19 | var20) & ~(var19 & var20);
        var20 = -479737806;
        var19 = var10003;
        var290[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
        var10002 = 2092233762;
        var20 = -946995207;
        var19 = var10002;
        var10002 = (var19 | var20) - (var19 & var20);
        var20 = -1153889316;
        var19 = var10002;
        var10002 = var19 + var20 - 2 * (var19 & var20);
        var10003 = 1111811638;
        var20 = -812307723;
        var19 = var10003;
        var10003 = (var19 | var20) - (var19 & var20);
        var20 = -1915626245;
        var19 = var10003;
        var290[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
        var10002 = 1662591587;
        var20 = -1357146135;
        var19 = var10002;
        var10002 = var19 + var20 - 2 * (var19 & var20);
        var20 = -872237694;
        var19 = var10002;
        var10002 = (var19 | var20) & ~(var19 & var20);
        String var398 = "bli";
        var20 = 1074330927;
        var19 = 988909246;
        var10003 = var19 + var20 - 2 * (var19 & var20);
        var20 = 2063200405;
        var19 = var10003;
        var290[var10002] = (char)((var19 | var20) & ~(var19 & var20));
        var20 = 162384359;
        var19 = 1993579647;
        var10002 = (var19 | var20) - (var19 & var20);
        var20 = 2138985873;
        var19 = var10002;
        var10002 = (var19 | var20) & ~(var19 & var20);
        var10003 = -597249126;
        var20 = 1556241410;
        var19 = var10003;
        var10003 = var19 + var20 - 2 * (var19 & var20);
        var20 = -2136679253;
        var19 = var10003;
        var290[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
        char[] var9 = var290;
        var20 = 476808868;
        var19 = -1740935376;
        var10000 = var19 + var20 - 2 * (var19 & var20);
        var20 = -2075072108;
        var19 = var10000;
        for (int var10 = var19 & (var20 ^ 0xFFFFFFFF) | (var19 ^ 0xFFFFFFFF) & var20; var10 < var6.length; ++var10) {
            char var357 = var6[var10];
            char var261 = var8[var10 % var8.length];
            char var129 = var357;
            var7[var10] = (char)((var129 | var261) & ~(var129 & var261));
        }
        char[] var21 = new char[var7.length];
        var20 = 548150556;
        var19 = -2036915218;
        var10000 = var19 + var20 - 2 * (var19 & var20);
        var20 = -1506066702;
        var19 = var10000;
        for (int var11 = var19 + var20 - 2 * (var19 & var20); var11 < var6.length; ++var11) {
            char var358 = var7[var11];
            char var264 = var9[var11 % var9.length];
            char var132 = var358;
            var21[var11] = (char)((var132 | var264) - (var132 & var264));
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
        var20 = -1599672056;
        var19 = -1277755961;
        var10000 = var19 + var20 - 2 * (var19 & var20);
        var20 = 326110415;
        var19 = var10000;
        block6: for (int var16 = (var19 | var20) & (var19 & var20 ^ 0xFFFFFFFF); var16 < var15.length; ++var16) {
            var20 = 202096182;
            var19 = -210051964;
            int var10001 = var19 + var20 - 2 * (var19 & var20);
            var20 = -9346384;
            var19 = var10001;
            switch (var16 % ((var19 | var20) & ~(var19 & var20))) {
                case 0: {
                    int var18;
                    var20 = var12;
                    var19 = var13;
                    var10002 = var19 & ~var20 | ~var19 & var20;
                    int var274 = var14[var16];
                    var19 = var10002;
                    var15[var16] = (char)((var19 | var274) & (~var19 | ~var274));
                    var10000 = 1399973552;
                    var274 = 1385038906;
                    var19 = var10000;
                    var10000 = var19 & ~var274 | ~var19 & var274;
                    var274 = -1711772713;
                    var19 = var10000;
                    var10000 = ((var19 | var274) & (~var19 | ~var274)) * ((var19 | var274) & (~var19 | ~var274));
                    var10000 = 1487574299;
                    var274 = -135246893;
                    var19 = var10000;
                    var10000 = (var19 | var274) - (var19 & var274);
                    var274 = -1387052212;
                    var19 = var10000;
                    a = var18 = (var19 | var274) & ~(var19 & var274);
                    var10000 = -2759327;
                    var274 = -1995297415;
                    var19 = var10000;
                    var10000 = var19 + var274 - 2 * (var19 & var274);
                    var274 = 833179496;
                    var19 = var10000;
                    var10000 = ((var19 | var274) & (~var19 | ~var274)) * ((var19 | var274) & (~var19 | ~var274));
                    var274 = 1199820592;
                    var19 = 978955698;
                    var10000 = (var19 | var274) & (~var19 | ~var274);
                    var274 = 2027480501;
                    var19 = var10000;
                    if ((var19 | var274) - (var19 & var274) > a) continue block6;
                    var10000 = -1475814950;
                    var274 = -51784842;
                    var19 = var10000;
                    var10000 = (var19 | var274) & ~(var19 & var274);
                    var274 = 1424034476;
                    var19 = var10000;
                    var10000 = (var19 | var274) - (var19 & var274);
                    var274 = -1604160293;
                    var19 = -107348157;
                    var10001 = (var19 | var274) - (var19 & var274);
                    var274 = 1509657496;
                    var19 = var10001;
                    var10000 /= (var19 | var274) & ~(var19 & var274);
                    continue block6;
                }
                case 1: {
                    var20 = var13;
                    var19 = var5;
                    var10002 = var19 + var20 - 2 * (var19 & var20);
                    char var272 = var14[var16];
                    var19 = var10002;
                    var15[var16] = (char)((var19 | var272) & (~var19 | ~var272));
                }
            }
        }
        return new String(var15);
    }
}
