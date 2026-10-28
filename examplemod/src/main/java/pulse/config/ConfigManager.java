package pulse;




import pulse.module.ModuleRegistry;
import pulse.module.ClientModule;
import pulse.settings.BooleanSetting;
import pulse.settings.ColorSetting;
import pulse.settings.ItemToggleSetting;
import pulse.settings.KeySetting;
import pulse.settings.ModeSetting;
import pulse.settings.Setting;
import pulse.settings.SettingGroup;
import pulse.settings.SliderSetting;
import pulse.settings.TokenSetting;
import java.awt.Color;
import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import net.minecraft.client.MinecraftClient;
import org.apache.logging.log4j.Logger;
import ru.pulse.Pulse;

public class ConfigManager {
   private static final ConfigManager a = new ConfigManager();
   private static final int b = 30;
   private static final DateTimeFormatter c = DateTimeFormatter.ISO_LOCAL_DATE;
   private CloudConfigRepository d;
   private ScheduledExecutorService e;
   private volatile boolean f;

   private ConfigManager() {
      int var2 = -1143308605;
      int var1 = -2038234515;
      int var10001 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1029274798;
      var1 = var10001;
      this.f = pulse.Bool.from(var1 & ~var2 | ~var1 & var2);
   }

   public static ConfigManager a() {
      return a;
   }

   public void b() {
   }

   public void c() {
   }

   public void d() {
   }

   private void m() {
      if (this.e != null) {
         this.e.shutdown();
      }

      this.e = Executors.newSingleThreadScheduledExecutor(
         var0 -> {
            int var3 = -1871261215;
            int var2 = -1238660035;
            int var10005 = var2 & ~var3 | ~var2 & var3;
            var3 = 1613717799;
            var2 = var10005;
            var10005 = var2 + var3 - 2 * (var2 & var3);
            int var10006 = (int)-5177902764437511380L;
            var3 = 278040248;
            var2 = var10006;
            var10006 = var2 + var3 - 2 * (var2 & var3);
            var3 = 401631828;
            var2 = var10006;
            var10006 = (var2 | var3) - (var2 & var3);
            int var10007 = (int)1098311075563724411L;
            var3 = 867858711;
            var2 = var10007;
            var10007 = (var2 | var3) - (var2 & var3);
            var3 = -1848866419;
            var2 = var10007;
            var10007 = var2 & ~var3 | ~var2 & var3;
            var3 = 2005445650;
            var2 = -1410201667;
            int var10008 = (var2 | var3) & (~var2 | ~var3);
            var3 = -596797977;
            var2 = var10008;
            Thread var1 = new Thread(
               var0,
               a(
                  "гѓ…г‰™гѓ©г‰Ђгѓўг‰¶гѓ©г‰›гѓ г‰њгѓЎг‰ґгѓіг‰Ѓгѓ©г‰¦гѓ§г‰ѓгѓЈ",
                  "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘ґ}\ua7e8к’ікЃёк¤‚зґ№и№‰в‘¶и¬ёг‘ўvкћ©к’–кЃЅк¤ЉзµЈи№Ћ\u2459и¬ёг‘№t\ua7efк’ІкЃњк¤„зµёи№‹в‘Ѕи¬Іг‘Ґ",
                  var10005,
                  var10006,
                  var10007,
                  (var2 | var3) & (~var2 | ~var3)
               )
            );
            int var10001 = (int)8672727966462719763L;
            var3 = -306443468;
            var2 = var10001;
            var10001 = (var2 | var3) - (var2 & var3);
            var3 = 1193753638;
            var2 = var10001;
            var1.setDaemon(pulse.Bool.from((var2 | var3) - (var2 & var3)));
            return var1;
         }
      );
      this.e.scheduleAtFixedRate(() -> {
         if (this.d != null && this.d.i()) {
            try {
               ConfigState var1 = this.l();
               this.d.a(var1, null, null);
            } catch (Exception var2) {
            }
         }
      }, 30L, 30L, TimeUnit.SECONDS);
   }

   public void e() {
   }

   public void f() {
   }

   public void a(String var1, Runnable var2, Consumer<String> var3) {
      if (var2 != null) {
         var2.run();
      }
   }

   public void b(String var1, Runnable var2, Consumer<String> var3) {
      if (var1 != null) {
         CloudConfigRepository var4 = this.j();
         if (var4 != null) {
            try {
               Field var5 = CloudConfigRepository.class.getDeclaredField("i");
               var5.setAccessible(true);
               ((Map)var5.get(var4)).remove(var1);
            } catch (Throwable var7) {
            }
         }

         if (var2 != null) {
            var2.run();
         }
      }
   }

   public void a(String var1, String var2, Runnable var3, Consumer<String> var4) {
   }

   public boolean a(String var1) {
      return false;
   }

   public String g() {
      return "default";
   }

   public void h() {
   }

   public boolean i() {
      return true;
   }

   public CloudConfigRepository j() {
      if (this.d == null) {
         this.d = new CloudConfigRepository(AccountServiceClient.A());

         try {
            CloudConfigRepository.RemoteConfigRecord var1 = new CloudConfigRepository.RemoteConfigRecord();
            var1.b = "default";
            var1.c = "";
            var1.g = System.currentTimeMillis();
            Field var2 = CloudConfigRepository.class.getDeclaredField("i");
            var2.setAccessible(true);
            ((Map)var2.get(this.d)).put("default", var1);
         } catch (Throwable var4) {
         }
      }

      return this.d;
   }

   public void a(String var1, int var2, Integer var3, Integer var4, Consumer<String> var5, Consumer<String> var6) {
   }

   public void c(String var1, Runnable var2, Consumer<String> var3) {
      if (var1 != null && !var1.trim().isEmpty()) {
         CloudConfigRepository var4 = this.j();
         if (var4 != null) {
            String var5 = var1.trim();

            try {
               CloudConfigRepository.RemoteConfigRecord var6 = new CloudConfigRepository.RemoteConfigRecord();
               var6.b = var5;
               var6.c = "";
               var6.g = System.currentTimeMillis();
               Field var7 = CloudConfigRepository.class.getDeclaredField("i");
               var7.setAccessible(true);
               ((Map)var7.get(var4)).put(var5, var6);
            } catch (Throwable var9) {
            }

            if (var2 != null) {
               var2.run();
            }
         }
      }
   }

   public List<CloudConfigRepository.SharedConfigRecord> k() {
      return Collections.emptyList();
   }

   public void a(int var1, Consumer<ConfigState> var2, Consumer<String> var3) {
   }

   public ConfigState l() {
      return null;
   }

   public void a(ConfigState var1) {
   }

   private Map<String, ConfigState.ModuleState> n() {
      HashMap var1 = new HashMap();

      for (ClientModule var3 : ModuleRegistry.all()) {
         ConfigState.ModuleState var4 = new ConfigState.ModuleState();
         var4.a(var3.k());
         var4.a(var3.j());
         var4.a(this.a(var3.m()));
         var1.put(var3.g(), var4);
      }

      return var1;
   }

   private Map<String, ConfigState.SettingState> a(List<Setting<?>> var1) {
      HashMap var2 = new HashMap();

      for (Setting var4 : var1) {
         if (!(var4 instanceof SettingGroup)) {
            ConfigState.SettingState var5 = new ConfigState.SettingState();
            if (var4 instanceof BooleanSetting) {
               int var9 = -995203090;
               int var8 = 1089210606;
               int var10003 = var8 + var9 - 2 * (var8 & var9);
               var9 = -1037020165;
               var8 = var10003;
               var10003 = var8 + var9 - 2 * (var8 & var9);
               var9 = -878076598;
               var8 = -1085657645;
               int var10004 = var8 & ~var9 | ~var8 & var9;
               var9 = 1779717929;
               var8 = var10004;
               var10004 = var8 + var9 - 2 * (var8 & var9);
               int var10005 = (int)-5456585853286197172L;
               var9 = -20692269;
               var8 = var10005;
               var10005 = var8 & ~var9 | ~var8 & var9;
               var9 = 1282350383;
               var8 = var10005;
               var10005 = (var8 | var9) & (~var8 | ~var9);
               var9 = -1877251865;
               var8 = 936881422;
               int var10006 = (var8 | var9) & (~var8 | ~var9);
               var9 = -1477071675;
               var8 = var10006;
               var5.a(a("зґђвЈЉзґќвЈ‰зґ—вЈ„зґњ", "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘ґ}\ua7e8к’ікЃёк¤‚зґ№и№‰в‘¶и¬ёг‘ўvкћ©к’–кЃЅк¤ЉзµЈи№Ћ\u2459и¬ёг‘№t\ua7efк’ІкЃњк¤„зµёи№‹в‘Ѕи¬Іг‘Ґ", var10003, var10004, var10005, (var8 | var9) - (var8 & var9)));
               var5.a(((BooleanSetting)var4).a());
            } else if (var4 instanceof SliderSetting) {
               int var82 = -676934989;
               int var19 = -1330247263;
               int var139 = var19 & ~var82 | ~var19 & var82;
               var82 = 560136169;
               var19 = var139;
               var139 = (var19 | var82) & (~var19 | ~var82);
               int var155 = (int)-2286010293601134845L;
               var82 = -851742716;
               var19 = var155;
               var155 = var19 + var82 - 2 * (var19 & var82);
               var82 = 583011328;
               var19 = var155;
               var155 = var19 + var82 - 2 * (var19 & var82);
               int var176 = (int)-8057091411070229712L;
               var82 = 1735744830;
               var19 = var176;
               var176 = (var19 | var82) & (~var19 | ~var82);
               var82 = -1158200410;
               var19 = var176;
               var176 = (var19 | var82) & ~(var19 & var82);
               var82 = 95843474;
               var19 = 216563600;
               int var193 = (var19 | var82) & ~(var19 & var82);
               var82 = 153053057;
               var19 = var193;
               var5.a(a("зґњвµїзґџ\u2d68зґ—\u2d78", "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘ґ}\ua7e8к’ікЃёк¤‚зґ№и№‰в‘¶и¬ёг‘ўvкћ©к’–кЃЅк¤ЉзµЈи№Ћ\u2459и¬ёг‘№t\ua7efк’ІкЃњк¤„зµёи№‹в‘Ѕи¬Іг‘Ґ", var139, var155, var176, var19 & ~var82 | ~var19 & var82));
               var5.a((float)((SliderSetting)var4).a());
            } else if (var4 instanceof ColorSetting var6) {
               int var90 = 1316912789;
               int var27 = 1298953867;
               int var141 = (var27 | var90) & (~var27 | ~var90);
               var90 = 1163932901;
               var27 = var141;
               var141 = (var27 | var90) & ~(var27 & var90);
               int var158 = (int)8613271895456464289L;
               var90 = -125211323;
               var27 = var158;
               var158 = var27 + var90 - 2 * (var27 & var90);
               var90 = -2067753219;
               var27 = var158;
               var158 = (var27 | var90) & (~var27 | ~var90);
               var90 = 2096779935;
               var27 = -218412820;
               int var179 = var27 + var90 - 2 * (var27 & var90);
               var90 = -1914491432;
               var27 = var179;
               var179 = (var27 | var90) & (~var27 | ~var90);
               int var194 = (int)-8998425854259803575L;
               var90 = 817874995;
               var27 = var194;
               var194 = (var27 | var90) - (var27 & var90);
               var90 = 1268336111;
               var27 = var194;
               var5.a(a("зґ‘и™ізґћи™ізґЂ", "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘ґ}\ua7e8к’ікЃёк¤‚зґ№и№‰в‘¶и¬ёг‘ўvкћ©к’–кЃЅк¤ЉзµЈи№Ћ\u2459и¬ёг‘№t\ua7efк’ІкЃњк¤„зµёи№‹в‘Ѕи¬Іг‘Ґ", var141, var158, var179, (var27 | var90) - (var27 & var90)));
               var5.a(var6.c());
               var5.b(var6.d());
               var5.c(var6.e());
            } else if (var4 instanceof KeySetting) {
               int var143 = (int)2584298828994424604L;
               int var98 = 2005030873;
               int var35 = var143;
               var143 = var35 & ~var98 | ~var35 & var98;
               var98 = -1906588610;
               var35 = var143;
               var143 = var35 & ~var98 | ~var35 & var98;
               int var161 = (int)-1410725057076722784L;
               var98 = 1060716122;
               var35 = var161;
               var161 = var35 & ~var98 | ~var35 & var98;
               var98 = -793406970;
               var35 = var161;
               var161 = var35 & ~var98 | ~var35 & var98;
               var98 = -1615503498;
               var35 = -455771052;
               int var181 = var35 + var98 - 2 * (var35 & var98);
               var98 = 1656225547;
               var35 = var181;
               var181 = (var35 | var98) & (~var35 | ~var98);
               int var196 = (int)-923418930696442722L;
               var98 = -554719175;
               var35 = var196;
               var196 = var35 & ~var98 | ~var35 & var98;
               var98 = -568773153;
               var35 = var196;
               var5.a(a("зґ™з‚”зґ‹", "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘ґ}\ua7e8к’ікЃёк¤‚зґ№и№‰в‘¶и¬ёг‘ўvкћ©к’–кЃЅк¤ЉзµЈи№Ћ\u2459и¬ёг‘№t\ua7efк’ІкЃњк¤„зµёи№‹в‘Ѕи¬Іг‘Ґ", var143, var161, var181, (var35 | var98) & ~(var35 & var98)));
               var5.a((int)((KeySetting)var4).a());
            } else if (var4 instanceof ModeSetting var10) {
               int var106 = 2080164255;
               int var43 = -58675841;
               int var146 = (var43 | var106) - (var43 & var106);
               var106 = -1056024549;
               var43 = var146;
               var146 = (var43 | var106) & (~var43 | ~var106);
               var106 = 500284817;
               var43 = 1657505076;
               int var164 = var43 + var106 - 2 * (var43 & var106);
               var106 = 1641309169;
               var43 = var164;
               var164 = var43 & ~var106 | ~var43 & var106;
               var106 = -1387651633;
               var43 = 1503439056;
               int var183 = var43 + var106 - 2 * (var43 & var106);
               var106 = -418472802;
               var43 = var183;
               var183 = var43 & ~var106 | ~var43 & var106;
               var106 = 838794143;
               var43 = -136530082;
               int var198 = var43 + var106 - 2 * (var43 & var106);
               var106 = -970092527;
               var43 = var198;
               var5.a(a("зґџйґ¶зґ–йґј", "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘ґ}\ua7e8к’ікЃёк¤‚зґ№и№‰в‘¶и¬ёг‘ўvкћ©к’–кЃЅк¤ЉзµЈи№Ћ\u2459и¬ёг‘№t\ua7efк’ІкЃњк¤„зµёи№‹в‘Ѕи¬Іг‘Ґ", var146, var164, var183, (var43 | var106) & (~var43 | ~var106)));
               var5.a(var10.k());
               if (var10.c()) {
                  Set<Integer> var7 = var10.e();
                  var5.a(var7.stream().mapToInt(Integer::intValue).toArray());
               }
            } else if (var4 instanceof TokenSetting) {
               int var114 = 1645336732;
               int var51 = -1698991413;
               int var148 = var51 + var114 - 2 * (var51 & var114);
               var114 = -1093101908;
               var51 = var148;
               var148 = (var51 | var114) & ~(var51 & var114);
               int var166 = (int)-8212765187286815304L;
               var114 = 434875248;
               var51 = var166;
               var166 = (var51 | var114) & (~var51 | ~var114);
               var114 = 1123376062;
               var51 = var166;
               var166 = (var51 | var114) & (~var51 | ~var114);
               int var185 = (int)-727119058535516561L;
               var114 = 748429714;
               var51 = var185;
               var185 = var51 + var114 - 2 * (var51 & var114);
               var114 = -1511837157;
               var51 = var185;
               var185 = (var51 | var114) & (~var51 | ~var114);
               int var199 = (int)-6072727348159780816L;
               var114 = 798065854;
               var51 = var199;
               var199 = var51 + var114 - 2 * (var51 & var114);
               var114 = -453234052;
               var51 = var199;
               var5.a(a("зґ›бј•зґ‚бјЋзґ†", "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘ґ}\ua7e8к’ікЃёк¤‚зґ№и№‰в‘¶и¬ёг‘ўvкћ©к’–кЃЅк¤ЉзµЈи№Ћ\u2459и¬ёг‘№t\ua7efк’ІкЃњк¤„зµёи№‹в‘Ѕи¬Іг‘Ґ", var148, var166, var185, (var51 | var114) & (~var51 | ~var114)));
               var5.a((Object)((TokenSetting)var4).a());
            } else {
               if (!(var4 instanceof ItemToggleSetting var11)) {
                  Logger var10000 = Pulse.getLOGGER();
                  int var130 = 370988814;
                  int var67 = -297968893;
                  int var152 = (var67 | var130) - (var67 & var130);
                  var130 = -1101811466;
                  var67 = var152;
                  var152 = (var67 | var130) - (var67 & var130);
                  var130 = -2075342997;
                  var67 = 1191582644;
                  int var172 = (var67 | var130) & (~var67 | ~var130);
                  var130 = -577798600;
                  var67 = var172;
                  var172 = (var67 | var130) & (~var67 | ~var130);
                  var130 = 383731583;
                  var67 = -1856351746;
                  int var191 = var67 + var130 - 2 * (var67 & var130);
                  var130 = -2143814923;
                  var67 = var191;
                  var191 = (var67 | var130) & ~(var67 & var130);
                  var130 = 1618428739;
                  var67 = 1949358883;
                  int var203 = (var67 | var130) & (~var67 | ~var130);
                  var130 = 339786755;
                  var67 = var203;
                  var10000.warn(
                     a(
                        "зґ©ж–©зґћж–…зґ‡ж–Ћзґ±ж–…зґњж–Њзґ›ж–Ќзґїж–‹зґњж–‹зґ•ж–ЏзґЂж–·зµ’ж–їзґњж–Ѓзґњж–…зґ…ж–„зµ’ж–™зґ—ж–ћзґ†ж–ѓзґњж–Ќзµ’ж–ћзґ‹ж–љзґ—ж—ђзµ’ж–‘зґЏж—Љзґ”ж–…зґЂж—ЉзґЃж–Џзґ†ж–ћзґ›ж–„зґ•ж—ђзµ’ж–‘зґЏ",
                        "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘ґ}\ua7e8к’ікЃёк¤‚зґ№и№‰в‘¶и¬ёг‘ўvкћ©к’–кЃЅк¤ЉзµЈи№Ћ\u2459и¬ёг‘№t\ua7efк’ІкЃњк¤„зµёи№‹в‘Ѕи¬Іг‘Ґ",
                        var152,
                        var172,
                        var191,
                        (var67 | var130) - (var67 & var130)
                     ),
                     var4.getClass().getSimpleName(),
                     var4.f()
                  );
                  continue;
               }

               int var122 = 448302545;
               int var59 = 1437971624;
               int var150 = (var59 | var122) - (var59 & var122);
               var122 = 159319426;
               var59 = var150;
               var150 = (var59 | var122) - (var59 & var122);
               int var169 = (int)-8228139583993492364L;
               var122 = 2711233;
               var59 = var169;
               var169 = var59 + var122 - 2 * (var59 & var122);
               var122 = -1956388422;
               var59 = var169;
               var169 = var59 & ~var122 | ~var59 & var122;
               int var188 = (int)-6459818359248609061L;
               var122 = -1063519340;
               var59 = var188;
               var188 = (var59 | var122) - (var59 & var122);
               var122 = 1356972607;
               var59 = var188;
               var188 = (var59 | var122) & (~var59 | ~var122);
               int var201 = (int)-2910193134896745393L;
               var122 = 1539058645;
               var59 = var201;
               var201 = (var59 | var122) & ~(var59 & var122);
               var122 = 1698245393;
               var59 = var201;
               var5.a(a("зґ›л•¶зґ—л•Їзґ±л•­зґћл•­зґЂ", "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘ґ}\ua7e8к’ікЃёк¤‚зґ№и№‰в‘¶и¬ёг‘ўvкћ©к’–кЃЅк¤ЉзµЈи№Ћ\u2459и¬ёг‘№t\ua7efк’ІкЃњк¤„зµёи№‹в‘Ѕи¬Іг‘Ґ", var150, var169, var188, (var59 | var122) & (~var59 | ~var122)));
               var5.a(var11.a());
               var5.a(var11.e());
            }

            var2.put(var4.f(), var5);
         }
      }

      return var2;
   }

   private List<ConfigState.FriendHistoryState> o() {
      ArrayList var1 = new ArrayList();
      FriendsPanel var2 = this.v();
      if (var2 != null) {
         for (HistoryEntry var4 : var2.a()) {
            ConfigState.FriendHistoryState var5 = new ConfigState.FriendHistoryState();
            var5.a(var4.a());
            var5.b(var4.b().format(c));
            var1.add(var5);
         }
      }

      return var1;
   }

   private List<ConfigState.NotificationState> p() {
      ArrayList var1 = new ArrayList();

      for (Notification var3 : NotificationStore.a()) {
         if (!var3.j()) {
            ConfigState.NotificationState var4 = new ConfigState.NotificationState();
            var4.a(var3.a());
            var4.a(var3.b());
            var4.b(var3.c());
            var4.c(var3.d());
            var4.d(var3.e().getRGB());
            var4.b(var3.f().name());
            var4.a(var3.j());
            var4.a(var3.k());
            var4.e(var3.l());
            var4.b(var3.n());
            var1.add(var4);
         }
      }

      return var1;
   }

   private ConfigState.MarkerOptionsState q() {
      ConfigState.MarkerOptionsState var1 = new ConfigState.MarkerOptionsState();
      var1.a(MarkerOptions.a());
      var1.a(MarkerOptions.b());
      var1.b(MarkerOptions.c());
      var1.c(MarkerOptions.d());
      var1.d(MarkerOptions.e());
      return var1;
   }

   private Map<String, ConfigState.HudElementState> r() {
      HashMap var1 = new HashMap();
      HudElementManager var2 = HudElementManager.a();
      if (var2.i() != null) {
         int var10003 = (int)2444463098639038354L;
         int var4 = 2100608271;
         int var3 = var10003;
         var10003 = var3 + var4 - 2 * (var3 & var4);
         var4 = -1616333210;
         var3 = var10003;
         var10003 = (var3 | var4) - (var3 & var4);
         var4 = 1319296485;
         var3 = 1655977122;
         int var10004 = (var3 | var4) & (~var3 | ~var4);
         var4 = 660082716;
         var3 = var10004;
         var10004 = (var3 | var4) & (~var3 | ~var4);
         int var10005 = (int)-4779341557960362850L;
         var4 = 495467005;
         var3 = var10005;
         var10005 = (var3 | var4) & (~var3 | ~var4);
         var4 = -741580862;
         var3 = var10005;
         var10005 = var3 & ~var4 | ~var3 & var4;
         var4 = 411448205;
         var3 = -1693513227;
         int var10006 = var3 + var4 - 2 * (var3 & var4);
         var4 = -2086295873;
         var3 = var10006;
         var1.put(
            a("вЊ’иЊ±вЊ–иЊ·вЊЌиЊ°вЊ‘", "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘ґ}\ua7e8к’ікЃёк¤‚зґ№и№‰в‘¶и¬ёг‘ўvкћ©к’–кЃЅк¤ЉзµЈи№Ћ\u2459и¬ёг‘№t\ua7efк’ІкЃњк¤„зµёи№‹в‘Ѕи¬Іг‘Ґ", var10003, var10004, var10005, (var3 | var4) & (~var3 | ~var4)),
            this.a(var2.i())
         );
      }

      if (var2.j() != null) {
         int var69 = (int)414506143586847919L;
         int var43 = 238481716;
         int var12 = var69;
         var69 = (var12 | var43) & (~var12 | ~var43);
         var43 = 2113061216;
         var12 = var69;
         var69 = var12 + var43 - 2 * (var12 & var43);
         var43 = -647656905;
         var12 = -113321496;
         int var78 = var12 & ~var43 | ~var12 & var43;
         var43 = 721801517;
         var12 = var78;
         var78 = (var12 | var43) - (var12 & var43);
         var43 = -1836508219;
         var12 = -503115853;
         int var87 = (var12 | var43) & (~var12 | ~var43);
         var43 = 1724118660;
         var12 = var87;
         var87 = var12 + var43 - 2 * (var12 & var43);
         var43 = -1989721970;
         var12 = -1947320870;
         int var94 = (var12 | var43) & (~var12 | ~var43);
         var43 = 45439754;
         var12 = var94;
         var1.put(
            a("вЊЉг¦ЁвЊ–г¦¬вЊ‡г¦ѕвЊ‘", "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘ґ}\ua7e8к’ікЃёк¤‚зґ№и№‰в‘¶и¬ёг‘ўvкћ©к’–кЃЅк¤ЉзµЈи№Ћ\u2459и¬ёг‘№t\ua7efк’ІкЃњк¤„зµёи№‹в‘Ѕи¬Іг‘Ґ", var69, var78, var87, (var12 | var43) - (var12 & var43)), this.a(var2.j())
         );
      }

      if (var2.k() != null) {
         int var51 = 1178222866;
         int var20 = 73759385;
         int var72 = (var20 | var51) - (var20 & var51);
         var51 = 70059888;
         var20 = var72;
         var72 = var20 & ~var51 | ~var20 & var51;
         var51 = 286957648;
         var20 = 930554029;
         int var80 = (var20 | var51) & (~var20 | ~var51);
         var51 = 758519470;
         var20 = var80;
         var80 = var20 + var51 - 2 * (var20 & var51);
         int var89 = (int)6496114464294938093L;
         var51 = -69158365;
         var20 = var89;
         var89 = (var20 | var51) & (~var20 | ~var51);
         var51 = 239614884;
         var20 = var89;
         var89 = var20 + var51 - 2 * (var20 & var51);
         var51 = 1342964613;
         var20 = -378923650;
         int var95 = (var20 | var51) & ~(var20 & var51);
         var51 = -1184944316;
         var20 = var95;
         var1.put(
            a("вЊЃв™‰вЊЌв™ЉвЊ†в™‰вЊ•в™€вЊ‘", "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘ґ}\ua7e8к’ікЃёк¤‚зґ№и№‰в‘¶и¬ёг‘ўvкћ©к’–кЃЅк¤ЉзµЈи№Ћ\u2459и¬ёг‘№t\ua7efк’ІкЃњк¤„зµёи№‹в‘Ѕи¬Іг‘Ґ", var72, var80, var89, (var20 | var51) & ~(var20 & var51)),
            this.a(var2.k())
         );
      }

      if (var2.l() != null) {
         int var74 = (int)-5644025366991980055L;
         int var59 = 1918412883;
         int var28 = var74;
         var74 = var28 + var59 - 2 * (var28 & var59);
         var59 = 890023233;
         var28 = var74;
         var74 = var28 + var59 - 2 * (var28 & var59);
         int var82 = (int)-7780224007134454707L;
         var59 = -706353741;
         var28 = var82;
         var82 = var28 + var59 - 2 * (var28 & var59);
         var59 = 2064261020;
         var28 = var82;
         var82 = var28 + var59 - 2 * (var28 & var59);
         var59 = -1267924225;
         var28 = -366673730;
         int var92 = (var28 | var59) - (var28 & var59);
         var59 = 1319769366;
         var28 = var92;
         var92 = var28 & ~var59 | ~var28 & var59;
         int var96 = (int)4273886596398860863L;
         var59 = 1293529697;
         var28 = var96;
         var96 = (var28 | var59) - (var28 & var59);
         var59 = 1773482384;
         var28 = var96;
         var1.put(
            a("вЊ–н¶вЊђн°вЊ‡нЈвЊЄнўвЊ†", "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘ґ}\ua7e8к’ікЃёк¤‚зґ№и№‰в‘¶и¬ёг‘ўvкћ©к’–кЃЅк¤ЉзµЈи№Ћ\u2459и¬ёг‘№t\ua7efк’ІкЃњк¤„зµёи№‹в‘Ѕи¬Іг‘Ґ", var74, var82, var92, (var28 | var59) & ~(var28 & var59)),
            this.a(var2.l())
         );
      }

      return var1;
   }

   private ConfigState.HudElementState a(HudElement var1) {
      return new ConfigState.HudElementState(var1.t().a(), var1.t().b(), var1.g());
   }

   private String s() {
      try {
         if (Pulse.getInstance().getClickGui() instanceof PulseClickGuiScreen) {
            PulseClickGuiScreen var1 = (PulseClickGuiScreen)Pulse.getInstance().getClickGui();
            DockPanelController var2 = var1.j();
            if (var2 != null) {
               return var2.a().name();
            }
         }
      } catch (Exception var5) {
         Logger var10000 = Pulse.getLOGGER();
         int var10003 = (int)6464446113012664001L;
         int var4 = 1565485309;
         int var3 = var10003;
         var10003 = (var3 | var4) & ~(var3 & var4);
         var4 = 1090196167;
         var3 = var10003;
         var10003 = var3 & ~var4 | ~var3 & var4;
         int var10004 = (int)-240369561663055556L;
         var4 = -1006816594;
         var3 = var10004;
         var10004 = (var3 | var4) - (var3 & var4);
         var4 = 120368531;
         var3 = var10004;
         var10004 = var3 & ~var4 | ~var3 & var4;
         int var10005 = (int)621126721964222386L;
         var4 = -1714519421;
         var3 = var10005;
         var10005 = (var3 | var4) & ~(var3 & var4);
         var4 = -204407738;
         var3 = var10005;
         var10005 = var3 & ~var4 | ~var3 & var4;
         int var10006 = (int)-8371754938051350775L;
         var4 = 374987011;
         var3 = var10006;
         var10006 = var3 + var4 - 2 * (var3 & var4);
         var4 = 1418155441;
         var3 = var10006;
         var10000.error(
            a(
               "\ud9f6мљ‘\ud9d9мљњ\ud9d5мљ”\ud990мљ„\ud9dfм›ђ\ud9d3мљ‘\ud9c0мљ„\ud9c5мљ‚\ud9d5м›ђ\ud9d3мљ‘\ud9c4мљ•\ud9d7мљџ\ud9c2мљ™\ud9d5мљѓ\ud990мљЂ\ud9dfмљѓ\ud9d9мљ„\ud9d9мљџ\ud9de",
               "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘ґ}\ua7e8к’ікЃёк¤‚зґ№и№‰в‘¶и¬ёг‘ўvкћ©к’–кЃЅк¤ЉзµЈи№Ћ\u2459и¬ёг‘№t\ua7efк’ІкЃњк¤„зµёи№‹в‘Ѕи¬Іг‘Ґ",
               var10003,
               var10004,
               var10005,
               (var3 | var4) & ~(var3 & var4)
            ),
            var5
         );
      }

      int var28 = -1456584544;
      int var13 = -908341482;
      int var10002 = (var13 | var28) & (~var13 | ~var28);
      var28 = 646429517;
      var13 = var10002;
      var10002 = (var13 | var28) & (~var13 | ~var28);
      var28 = -390474121;
      var13 = -1900091891;
      int var39 = (var13 | var28) & (~var13 | ~var28);
      var28 = -1667250103;
      var13 = var39;
      var39 = var13 + var28 - 2 * (var13 & var28);
      int var43 = (int)-2948586701944692846L;
      var28 = 590023096;
      var13 = var43;
      var43 = (var13 | var28) - (var13 & var28);
      var28 = 2062248274;
      var13 = var43;
      var43 = (var13 | var28) & (~var13 | ~var28);
      int var48 = (int)-4221251765976217432L;
      var28 = -764579325;
      var13 = var48;
      var48 = (var13 | var28) & (~var13 | ~var28);
      var28 = -1626869946;
      var13 = var48;
      return a("\ud9f2гѓ©\ud9e4гѓІ\ud9ffгѓ«", "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘ґ}\ua7e8к’ікЃёк¤‚зґ№и№‰в‘¶и¬ёг‘ўvкћ©к’–кЃЅк¤ЉзµЈи№Ћ\u2459и¬ёг‘№t\ua7efк’ІкЃњк¤„зµёи№‹в‘Ѕи¬Іг‘Ґ", var10002, var39, var43, (var13 | var28) & ~(var13 & var28));
   }

   private ConfigState.NotificationSettingsState t() {
      ConfigState.NotificationSettingsState var1 = new ConfigState.NotificationSettingsState();
      HudNotificationCenter var2 = HudNotificationCenter.a();
      if (var2 != null) {
         HudNotificationSettingsPanel var3 = var2.i();
         var1.a(var3.h());
         var1.b(var3.i());
         var1.c(var3.j());
         var1.d(var3.k());
         var1.e(var3.l());
      }

      return var1;
   }

   private void a(Map<String, ConfigState.ModuleState> var1) {
      if (var1 != null) {
         for (ClientModule var3 : ModuleRegistry.all()) {
            ConfigState.ModuleState var4 = (ConfigState.ModuleState)var1.get(var3.g());
            if (var4 != null) {
               var3.a(var4.b());
               var3.b(var4.a());
               this.a(var3.m(), var4.c());
            }
         }
      }
   }

   private void a(List<Setting<?>> var1, Map<String, ConfigState.SettingState> var2) {
      if (var2 != null) {
         for (Setting var4 : var1) {
            ConfigState.SettingState var5 = (ConfigState.SettingState)var2.get(var4.f());
            if (var5 != null) {
               try {
                  if (var4 instanceof BooleanSetting) {
                     int var10002 = (int)6784291288667037399L;
                     int var92 = 290596598;
                     int var27 = var10002;
                     var10002 = var27 & ~var92 | ~var27 & var92;
                     var92 = 786859226;
                     var27 = var10002;
                     var10002 = (var27 | var92) & (~var27 | ~var92);
                     var92 = -99587582;
                     var27 = -280664202;
                     int var10003 = var27 + var92 - 2 * (var27 & var92);
                     var92 = -1315668287;
                     var27 = var10003;
                     var10003 = (var27 | var92) & (~var27 | ~var92);
                     var92 = -841299901;
                     var27 = 1858281392;
                     int var189 = (var27 | var92) - (var27 & var92);
                     var92 = -1186679781;
                     var27 = var189;
                     var189 = (var27 | var92) - (var27 & var92);
                     int var208 = (int)1437922667218968522L;
                     var92 = 1517056109;
                     var27 = var208;
                     var208 = (var27 | var92) - (var27 & var92);
                     var92 = 2018250414;
                     var27 = var208;
                     if (a("ж¤Ёл“—ж¤Ґл“”ж¤Їл“™ж¤¤", "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘ґ}\ua7e8к’ікЃёк¤‚зґ№и№‰в‘¶и¬ёг‘ўvкћ©к’–кЃЅк¤ЉзµЈи№Ћ\u2459и¬ёг‘№t\ua7efк’ІкЃњк¤„зµёи№‹в‘Ѕи¬Іг‘Ґ", var10002, var10003, var189, (var27 | var92) & ~(var27 & var92))
                        .equals(var5.a())) {
                        ((BooleanSetting)var4).a((Boolean)var5.b());
                        continue;
                     }
                  }

                  if (var4 instanceof SliderSetting) {
                     int var154 = (int)8742848537977353458L;
                     int var100 = 504928862;
                     int var35 = var154;
                     var154 = var35 + var100 - 2 * (var35 & var100);
                     var100 = 793006679;
                     var35 = var154;
                     var154 = (var35 | var100) & ~(var35 & var100);
                     int var170 = (int)91200231274749037L;
                     var100 = -2112782637;
                     var35 = var170;
                     var170 = var35 & ~var100 | ~var35 & var100;
                     var100 = -1438970093;
                     var35 = var170;
                     var170 = (var35 | var100) - (var35 & var100);
                     int var191 = (int)-2669509579950345110L;
                     var100 = -1266834828;
                     var35 = var191;
                     var191 = (var35 | var100) - (var35 & var100);
                     var100 = -482114599;
                     var35 = var191;
                     var191 = var35 + var100 - 2 * (var35 & var100);
                     var100 = 870675553;
                     var35 = 886489403;
                     int var210 = (var35 | var100) & (~var35 | ~var100);
                     var100 = 119074395;
                     var35 = var210;
                     if (a(
                           "ж¤¤\u0ec5ж¤§а»’ж¤Їа»‚",
                           "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘ґ}\ua7e8к’ікЃёк¤‚зґ№и№‰в‘¶и¬ёг‘ўvкћ©к’–кЃЅк¤ЉзµЈи№Ћ\u2459и¬ёг‘№t\ua7efк’ІкЃњк¤„зµёи№‹в‘Ѕи¬Іг‘Ґ",
                           var154,
                           var170,
                           var191,
                           var35 + var100 - 2 * (var35 & var100)
                        )
                        .equals(var5.a())) {
                        Object var19 = var5.b();
                        if (var19 instanceof Number) {
                           ((SliderSetting)var4).a(((Number)var19).floatValue());
                        }
                        continue;
                     }
                  }

                  if (var4 instanceof ColorSetting) {
                     int var108 = 852351897;
                     int var43 = 759078158;
                     int var157 = (var43 | var108) & (~var43 | ~var108);
                     var108 = 1501657708;
                     var43 = var157;
                     var157 = (var43 | var108) & ~(var43 & var108);
                     int var173 = (int)1866611257473702773L;
                     var108 = -266680113;
                     var43 = var173;
                     var173 = var43 & ~var108 | ~var43 & var108;
                     var108 = -742725087;
                     var43 = var173;
                     var173 = (var43 | var108) & ~(var43 & var108);
                     int var194 = (int)-7634104026557893201L;
                     var108 = 1055771622;
                     var43 = var194;
                     var194 = (var43 | var108) & ~(var43 & var108);
                     var108 = -354588274;
                     var43 = var194;
                     var194 = (var43 | var108) & (~var43 | ~var108);
                     int var211 = (int)2529528397418937150L;
                     var108 = -358413946;
                     var43 = var211;
                     var211 = (var43 | var108) & ~(var43 & var108);
                     var108 = 59741271;
                     var43 = var211;
                     if (a(
                           "ж¤©\uf331ж¤¦\uf331ж¤ё",
                           "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘ґ}\ua7e8к’ікЃёк¤‚зґ№и№‰в‘¶и¬ёг‘ўvкћ©к’–кЃЅк¤ЉзµЈи№Ћ\u2459и¬ёг‘№t\ua7efк’ІкЃњк¤„зµёи№‹в‘Ѕи¬Іг‘Ґ",
                           var157,
                           var173,
                           var194,
                           var43 + var108 - 2 * (var43 & var108)
                        )
                        .equals(var5.a())) {
                        ((ColorSetting)var4).a(var5.c(), var5.d(), var5.e());
                        continue;
                     }
                  }

                  if (var4 instanceof KeySetting) {
                     int var116 = -183118165;
                     int var51 = -1914742530;
                     int var159 = (var51 | var116) - (var51 & var116);
                     var116 = 1052291758;
                     var51 = var159;
                     var159 = var51 & ~var116 | ~var51 & var116;
                     int var176 = (int)5251696815419409996L;
                     var116 = -940448810;
                     var51 = var176;
                     var176 = (var51 | var116) & (~var51 | ~var116);
                     var116 = -1405413333;
                     var51 = var176;
                     var176 = (var51 | var116) & (~var51 | ~var116);
                     var116 = 1915142173;
                     var51 = 484221955;
                     int var197 = (var51 | var116) - (var51 & var116);
                     var116 = 1846594241;
                     var51 = var197;
                     var197 = (var51 | var116) & ~(var51 & var116);
                     var116 = -261374421;
                     var51 = 2076710119;
                     int var213 = var51 + var116 - 2 * (var51 & var116);
                     var116 = -1947860535;
                     var51 = var213;
                     if (a("ж¤Ўп»‘ж¤і", "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘ґ}\ua7e8к’ікЃёк¤‚зґ№и№‰в‘¶и¬ёг‘ўvкћ©к’–кЃЅк¤ЉзµЈи№Ћ\u2459и¬ёг‘№t\ua7efк’ІкЃњк¤„зµёи№‹в‘Ѕи¬Іг‘Ґ", var159, var176, var197, (var51 | var116) & (~var51 | ~var116))
                        .equals(var5.a())) {
                        Object var18 = var5.b();
                        if (var18 instanceof Number) {
                           ((KeySetting)var4).a(((Number)var18).intValue());
                        }
                        continue;
                     }
                  }

                  if (var4 instanceof ModeSetting) {
                     int var161 = (int)7563601803323327596L;
                     int var124 = 1528220787;
                     int var59 = var161;
                     var161 = var59 + var124 - 2 * (var59 & var124);
                     var124 = 687060196;
                     var59 = var161;
                     var161 = (var59 | var124) & (~var59 | ~var124);
                     int var179 = (int)-6247058692292342089L;
                     var124 = -1493461558;
                     var59 = var179;
                     var179 = (var59 | var124) & ~(var59 & var124);
                     var124 = -1194377127;
                     var59 = var179;
                     var179 = var59 + var124 - 2 * (var59 & var124);
                     var124 = 672424956;
                     var59 = -769363179;
                     int var199 = (var59 | var124) & ~(var59 & var124);
                     var124 = -531217493;
                     var59 = var199;
                     var199 = var59 + var124 - 2 * (var59 & var124);
                     var124 = -535402416;
                     var59 = 975899300;
                     int var214 = (var59 | var124) & ~(var59 & var124);
                     var124 = -629265780;
                     var59 = var214;
                     if (a("ж¤§б¶¦ж¤®б¶¬", "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘ґ}\ua7e8к’ікЃёк¤‚зґ№и№‰в‘¶и¬ёг‘ўvкћ©к’–кЃЅк¤ЉзµЈи№Ћ\u2459и¬ёг‘№t\ua7efк’ІкЃњк¤„зµёи№‹в‘Ѕи¬Іг‘Ґ", var161, var179, var199, var59 & ~var124 | ~var59 & var124)
                        .equals(var5.a())) {
                        ModeSetting var17 = (ModeSetting)var4;
                        Object var7 = var5.b();
                        if (var7 instanceof Number) {
                           var17.a(Integer.valueOf(((Number)var7).intValue()));
                        }

                        if (!var17.c() || var5.f() == null) {
                           continue;
                        }

                        HashSet var8 = new HashSet();
                        int[] var9 = var5.f();
                        int var10 = var9.length;
                        int var150 = (int)-8042203439139421742L;
                        var124 = 558882819;
                        var59 = var150;
                        var150 = var59 & ~var124 | ~var59 & var124;
                        var124 = -1809967;
                        var59 = var150;

                        for (int var11 = (var59 | var124) & ~(var59 & var124); var11 < var10; var11++) {
                           int var12 = var9[var11];
                           var8.add(var12);
                        }

                        var17.a(var8);
                        continue;
                     }
                  }

                  if (var4 instanceof TokenSetting) {
                     int var132 = 1297124153;
                     int var67 = -1010647938;
                     int var164 = (var67 | var132) & ~(var67 & var132);
                     var132 = -924841028;
                     var67 = var164;
                     var164 = var67 & ~var132 | ~var67 & var132;
                     int var182 = (int)13078343800224983L;
                     var132 = 1238757788;
                     var67 = var182;
                     var182 = (var67 | var132) & ~(var67 & var132);
                     var132 = -652764415;
                     var67 = var182;
                     var182 = var67 + var132 - 2 * (var67 & var132);
                     var132 = -1906712341;
                     var67 = -2061141988;
                     int var201 = (var67 | var132) & ~(var67 & var132);
                     var132 = 242298317;
                     var67 = var201;
                     var201 = (var67 | var132) & (~var67 | ~var132);
                     int var215 = (int)7703490076957977383L;
                     var132 = 480057737;
                     var67 = var215;
                     var215 = (var67 | var132) - (var67 & var132);
                     var132 = -479579856;
                     var67 = var215;
                     if (a("ж¤Јн™Ѓж¤єн™љж¤ѕ", "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘ґ}\ua7e8к’ікЃёк¤‚зґ№и№‰в‘¶и¬ёг‘ўvкћ©к’–кЃЅк¤ЉзµЈи№Ћ\u2459и¬ёг‘№t\ua7efк’ІкЃњк¤„зµёи№‹в‘Ѕи¬Іг‘Ґ", var164, var182, var201, (var67 | var132) - (var67 & var132))
                        .equals(var5.a())) {
                        ((TokenSetting)var4).a((String)var5.b());
                        continue;
                     }
                  }

                  if (var4 instanceof ItemToggleSetting) {
                     int var166 = (int)-8428341945032423020L;
                     int var140 = 396836552;
                     int var75 = var166;
                     var166 = var75 & ~var140 | ~var75 & var140;
                     var140 = 1359236007;
                     var75 = var166;
                     var166 = (var75 | var140) - (var75 & var140);
                     int var185 = (int)210648269034382961L;
                     var140 = -779416377;
                     var75 = var185;
                     var185 = var75 & ~var140 | ~var75 & var140;
                     var140 = 1700996193;
                     var75 = var185;
                     var185 = (var75 | var140) & ~(var75 & var140);
                     int var203 = (int)-5607780638618235220L;
                     var140 = 710273960;
                     var75 = var203;
                     var203 = (var75 | var140) & ~(var75 & var140);
                     var140 = 1374347485;
                     var75 = var203;
                     var203 = (var75 | var140) - (var75 & var140);
                     var140 = 1865746495;
                     var75 = -173052875;
                     int var217 = (var75 | var140) - (var75 & var140);
                     var140 = -1699031007;
                     var75 = var217;
                     if (a(
                           "ж¤Ј\ue9eeж¤Ї\ue9f7ж¤‰\ue9f5ж¤¦\ue9f5ж¤ё",
                           "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘ґ}\ua7e8к’ікЃёк¤‚зґ№и№‰в‘¶и¬ёг‘ўvкћ©к’–кЃЅк¤ЉзµЈи№Ћ\u2459и¬ёг‘№t\ua7efк’ІкЃњк¤„зµёи№‹в‘Ѕи¬Іг‘Ґ",
                           var166,
                           var185,
                           var203,
                           var75 + var140 - 2 * (var75 & var140)
                        )
                        .equals(var5.a())) {
                        ItemToggleSetting var6 = (ItemToggleSetting)var4;
                        if (var5.g() != null) {
                           var6.a(var5.g());
                        }

                        if (var5.h() != null) {
                           var6.a(new Color(var5.h()));
                        }
                     }
                  }
               } catch (Exception var16) {
                  Logger var10000 = Pulse.getLOGGER();
                  String var13 = var4.f();
                  StringBuilder var10001 = new StringBuilder();
                  int var15 = 1522439790;
                  int var14 = -1242949564;
                  int var10004 = (var14 | var15) & ~(var14 & var15);
                  var15 = -1457081647;
                  var14 = var10004;
                  var10004 = (var14 | var15) & ~(var14 & var15);
                  int var10005 = (int)1322430795777828988L;
                  var15 = 1124132742;
                  var14 = var10005;
                  var10005 = (var14 | var15) - (var14 & var15);
                  var15 = -1175730148;
                  var14 = var10005;
                  var10005 = var14 + var15 - 2 * (var14 & var15);
                  var15 = -1159941688;
                  var14 = -1365037305;
                  int var10006 = (var14 | var15) - (var14 & var15);
                  var15 = 108617887;
                  var14 = var10006;
                  var10006 = (var14 | var15) & ~(var14 & var15);
                  int var10007 = (int)4818584815839266236L;
                  var15 = 814453239;
                  var14 = var10007;
                  var10007 = (var14 | var15) & ~(var14 & var15);
                  var15 = 480141681;
                  var14 = var10007;
                  var10000.error(
                     var10001.append(
                           a(
                              "ж¤ЊжѓЄж¤Јжѓ§ж¤ЇжѓЇжҐЄжѓїж¤Ґж‚«ж¤«жѓ»ж¤єжѓ§ж¤іж‚«ж¤№жѓ®ж¤ѕжѓїж¤ЈжѓҐж¤­ж‚±жҐЄ",
                              "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘ґ}\ua7e8к’ікЃёк¤‚зґ№и№‰в‘¶и¬ёг‘ўvкћ©к’–кЃЅк¤ЉзµЈи№Ћ\u2459и¬ёг‘№t\ua7efк’ІкЃњк¤„зµёи№‹в‘Ѕи¬Іг‘Ґ",
                              var10004,
                              var10005,
                              var10006,
                              (var14 | var15) & ~(var14 & var15)
                           )
                        )
                        .append(var13)
                        .toString(),
                     var16
                  );
               }
            }
         }
      }
   }

   private void b(List<ConfigState.FriendHistoryState> var1) {
      if (var1 != null) {
         FriendsPanel var2 = this.v();
         if (var2 != null) {
            var2.b();

            for (ConfigState.FriendHistoryState var4 : var1) {
               try {
                  LocalDate var5 = LocalDate.parse(var4.b(), c);
                  var2.a(new HistoryEntry(var4.a(), var5));
               } catch (Exception var6) {
                  var2.a(new HistoryEntry(var4.a()));
               }
            }
         }
      }
   }

   private void c(List<ConfigState.NotificationState> var1) {
      if (var1 != null) {
         NotificationStore.g().forEach(NotificationStore::b);

         for (ConfigState.NotificationState var3 : var1) {
            try {
               Notification.Icon var4 = Notification.Icon.valueOf(var3.f());
               Notification var5 = new Notification(var3.a(), var3.b(), var3.c(), var3.d(), new Color(var3.e()), var4);
               NotificationStore.a(var5);
            } catch (Exception var9) {
               Logger var10000 = Pulse.getLOGGER();
               String var6 = var3.a();
               StringBuilder var10001 = new StringBuilder();
               int var8 = 42703624;
               int var7 = 1973400060;
               int var10004 = (var7 | var8) & (~var7 | ~var8);
               var8 = 828773903;
               var7 = var10004;
               var10004 = var7 & ~var8 | ~var7 & var8;
               int var10005 = (int)1428981922477356316L;
               var8 = -1586591783;
               var7 = var10005;
               var10005 = (var7 | var8) & (~var7 | ~var8);
               var8 = 374018220;
               var7 = var10005;
               var10005 = var7 & ~var8 | ~var7 & var8;
               var8 = 1471089404;
               var7 = -1003405468;
               int var10006 = var7 + var8 - 2 * (var7 & var8);
               var8 = -1944829687;
               var7 = var10006;
               var10006 = var7 + var8 - 2 * (var7 & var8);
               int var10007 = (int)-3930353338972683226L;
               var8 = 1167578128;
               var7 = var10007;
               var10007 = (var7 | var8) & (~var7 | ~var8);
               var8 = 155215221;
               var7 = var10007;
               var10000.error(
                  var10001.append(
                        a(
                           "мІ–Ф‰мІ№Ф„мІµФЊмі°ФњмІїХ€мІ±ФмІ Ф„мІ©Х€мІЅФ‰мІўФѓмІµФљміЄХ€",
                           "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘ґ}\ua7e8к’ікЃёк¤‚зґ№и№‰в‘¶и¬ёг‘ўvкћ©к’–кЃЅк¤ЉзµЈи№Ћ\u2459и¬ёг‘№t\ua7efк’ІкЃњк¤„зµёи№‹в‘Ѕи¬Іг‘Ґ",
                           var10004,
                           var10005,
                           var10006,
                           (var7 | var8) - (var7 & var8)
                        )
                     )
                     .append(var6)
                     .toString(),
                  var9
               );
            }
         }
      }
   }

   private void a(ConfigState.MarkerOptionsState var1) {
      if (var1 != null) {
         MarkerOptions.a(var1.a());
         MarkerOptions.a(var1.b());
         MarkerOptions.b(var1.c());
         MarkerOptions.c(var1.d());
      }
   }

   private void b(Map<String, ConfigState.HudElementState> var1) {
      if (var1 != null) {
         HudElementManager var2 = HudElementManager.a();
         MinecraftClient var3 = MinecraftClient.getInstance();
         float var4 = (float)(var3.getWindow().getFramebufferWidth() / 2.0);
         float var5 = (float)(var3.getWindow().getFramebufferHeight() / 2.0);
         PotionsHudElement var10001 = var2.i();
         int var10005 = (int)-548879998886963621L;
         int var7 = 1307384377;
         int var6 = var10005;
         var10005 = (var6 | var7) & ~(var6 & var7);
         var7 = -1717981031;
         var6 = var10005;
         var10005 = (var6 | var7) & ~(var6 & var7);
         var7 = -1995266929;
         var6 = -119810814;
         int var10006 = (var6 | var7) & (~var6 | ~var7);
         var7 = 759997467;
         var6 = var10006;
         var10006 = (var6 | var7) & ~(var6 & var7);
         var7 = 1898564979;
         var6 = 843931181;
         int var10007 = var6 + var7 - 2 * (var6 & var7);
         var7 = 1175617246;
         var6 = var10007;
         var10007 = var6 & ~var7 | ~var6 & var7;
         var7 = -1743692311;
         var6 = -92356508;
         int var10008 = (var6 | var7) & ~(var6 & var7);
         var7 = 1650926935;
         var6 = var10008;
         this.a(
            var10001,
            (ConfigState.HudElementState)var1.get(
               a(
                  "\ue34aжќґ\ue34eжќІ\ue355жќµ\ue349",
                  "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘ґ}\ua7e8к’ікЃёк¤‚зґ№и№‰в‘¶и¬ёг‘ўvкћ©к’–кЃЅк¤ЉзµЈи№Ћ\u2459и¬ёг‘№t\ua7efк’ІкЃњк¤„зµёи№‹в‘Ѕи¬Іг‘Ґ",
                  var10005,
                  var10006,
                  var10007,
                  (var6 | var7) & (~var6 | ~var7)
               )
            ),
            var4,
            var5
         );
         HotkeysHudElement var70 = var2.j();
         var7 = 1082567198;
         var6 = 1275150973;
         var10005 = (var6 | var7) & (~var6 | ~var7);
         var7 = 1257624728;
         var6 = var10005;
         var10005 = var6 & ~var7 | ~var6 & var7;
         var7 = 1116037665;
         var6 = -228112622;
         var10006 = (var6 | var7) & ~(var6 & var7);
         var7 = -333343686;
         var6 = var10006;
         var10006 = (var6 | var7) & ~(var6 & var7);
         var7 = -67617450;
         var6 = 1001929956;
         var10007 = (var6 | var7) & ~(var6 & var7);
         var7 = -698598718;
         var6 = var10007;
         var10007 = (var6 | var7) & ~(var6 & var7);
         var10008 = (int)5022387485069269227L;
         var7 = -1942153080;
         var6 = var10008;
         var10008 = (var6 | var7) & (~var6 | ~var7);
         var7 = 1603294254;
         var6 = var10008;
         this.a(
            var70,
            (ConfigState.HudElementState)var1.get(
               a(
                  "\ue352дЇЈ\ue34eдЇ§\ue35fдЇµ\ue349",
                  "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘ґ}\ua7e8к’ікЃёк¤‚зґ№и№‰в‘¶и¬ёг‘ўvкћ©к’–кЃЅк¤ЉзµЈи№Ћ\u2459и¬ёг‘№t\ua7efк’ІкЃњк¤„зµёи№‹в‘Ѕи¬Іг‘Ґ",
                  var10005,
                  var10006,
                  var10007,
                  (var6 | var7) - (var6 & var7)
               )
            ),
            var4,
            var5
         );
         CooldownsHudElement var71 = var2.k();
         var7 = 1940328729;
         var6 = -966718090;
         var10005 = (var6 | var7) & ~(var6 & var7);
         var7 = -206298988;
         var6 = var10005;
         var10005 = var6 & ~var7 | ~var6 & var7;
         var7 = -1458138481;
         var6 = -1961217700;
         var10006 = (var6 | var7) - (var6 & var7);
         var7 = 2126213734;
         var6 = var10006;
         var10006 = var6 + var7 - 2 * (var6 & var7);
         var7 = -1439575337;
         var6 = -825236105;
         var10007 = var6 & ~var7 | ~var6 & var7;
         var7 = 1155171948;
         var6 = var10007;
         var10007 = (var6 | var7) & (~var6 | ~var7);
         var7 = 1224293390;
         var6 = -364971569;
         var10008 = (var6 | var7) & ~(var6 & var7);
         var7 = -1560448712;
         var6 = var10008;
         this.a(
            var71,
            (ConfigState.HudElementState)var1.get(
               a(
                  "\ue359ж­—\ue355ж­”\ue35eж­—\ue34dж­–\ue349",
                  "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘ґ}\ua7e8к’ікЃёк¤‚зґ№и№‰в‘¶и¬ёг‘ўvкћ©к’–кЃЅк¤ЉзµЈи№Ћ\u2459и¬ёг‘№t\ua7efк’ІкЃњк¤„зµёи№‹в‘Ѕи¬Іг‘Ґ",
                  var10005,
                  var10006,
                  var10007,
                  (var6 | var7) & ~(var6 & var7)
               )
            ),
            var4,
            var5
         );
         TargetHudElement var72 = var2.l();
         var10005 = (int)4514504137384485306L;
         var7 = -211210307;
         var6 = var10005;
         var10005 = (var6 | var7) & (~var6 | ~var7);
         var7 = -1597082884;
         var6 = var10005;
         var10005 = var6 + var7 - 2 * (var6 & var7);
         var7 = 1522656012;
         var6 = -1991419505;
         var10006 = (var6 | var7) & (~var6 | ~var7);
         var7 = -1895039615;
         var6 = var10006;
         var10006 = var6 + var7 - 2 * (var6 & var7);
         var7 = -854012582;
         var6 = -1074889068;
         var10007 = (var6 | var7) & (~var6 | ~var7);
         var7 = 1633970917;
         var6 = var10007;
         var10007 = var6 & ~var7 | ~var6 & var7;
         var7 = 1180778938;
         var6 = 189467584;
         var10008 = (var6 | var7) & ~(var6 & var7);
         var7 = 1293967420;
         var6 = var10008;
         this.a(
            var72,
            (ConfigState.HudElementState)var1.get(
               a(
                  "\ue34e\uf5e6\ue348\uf5e0\ue35f\uf5f3\ue372\uf5f2\ue35e",
                  "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘ґ}\ua7e8к’ікЃёк¤‚зґ№и№‰в‘¶и¬ёг‘ўvкћ©к’–кЃЅк¤ЉзµЈи№Ћ\u2459и¬ёг‘№t\ua7efк’ІкЃњк¤„зµёи№‹в‘Ѕи¬Іг‘Ґ",
                  var10005,
                  var10006,
                  var10007,
                  var6 + var7 - 2 * (var6 & var7)
               )
            ),
            var4,
            var5
         );
         var2.d();
      }
   }

   private void a(HudElement var1, ConfigState.HudElementState var2, float var3, float var4) {
      if (var1 != null && var2 != null) {
         var1.t().a(var2.a());
         var1.t().b(var2.b());
         var1.b();
         float var5 = var1.t().a(var1.n(), var3);
         float var6 = var1.t().b(var1.o(), var4);
         var1.a(var5);
         var1.b(var6);
      }
   }

   private void b(String var1) {
      if (var1 != null) {
         try {
            DockPanelController.Dock var2 = DockPanelController.Dock.valueOf(var1);
            if (Pulse.getInstance().getClickGui() instanceof PulseClickGuiScreen) {
               PulseClickGuiScreen var3 = (PulseClickGuiScreen)Pulse.getInstance().getClickGui();
               DockPanelController var4 = var3.j();
               if (var4 != null) {
                  var4.a(var2);
               }
            }
         } catch (IllegalArgumentException var8) {
            Logger var40 = Pulse.getLOGGER();
            String var5 = var1;
            StringBuilder var10001 = new StringBuilder();
            int var32 = -1312447222;
            int var17 = 1152422009;
            int var44 = (var17 | var32) & ~(var17 & var32);
            var32 = -1291384440;
            var17 = var44;
            var44 = (var17 | var32) & ~(var17 & var32);
            int var48 = (int)-1901745115350516759L;
            var32 = 1974962057;
            var17 = var48;
            var48 = (var17 | var32) & (~var17 | ~var32);
            var32 = -1620129313;
            var17 = var48;
            var48 = var17 + var32 - 2 * (var17 & var32);
            int var52 = (int)4769729822286005943L;
            var32 = -1634810847;
            var17 = var52;
            var52 = (var17 | var32) & (~var17 | ~var32);
            var32 = 460775213;
            var17 = var52;
            var52 = (var17 | var32) & (~var17 | ~var32);
            var32 = -192176050;
            var17 = 729297751;
            int var10007 = var17 & ~var32 | ~var17 & var32;
            var32 = -539540920;
            var17 = var10007;
            var40.warn(
               var10001.append(
                     a(
                        "\udbddг™Њ\udbe3г™Њ\udbe7г™•\udbe6г‚\udbebг™ѓ\udbfcг™‡\udbefг™Ќ\udbfaг™‹\udbedг™‘\udba8г™’\udbe7г™‘\udbe1г™–\udbe1г™Ќ\udbe6г\udba8",
                        "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘ґ}\ua7e8к’ікЃёк¤‚зґ№и№‰в‘¶и¬ёг‘ўvкћ©к’–кЃЅк¤ЉзµЈи№Ћ\u2459и¬ёг‘№t\ua7efк’ІкЃњк¤„зµёи№‹в‘Ѕи¬Іг‘Ґ",
                        var44,
                        var48,
                        var52,
                        (var17 | var32) & (~var17 | ~var32)
                     )
                  )
                  .append(var5)
                  .toString()
            );
         } catch (Exception var9) {
            Logger var10000 = Pulse.getLOGGER();
            int var10003 = (int)-3641112613564349583L;
            int var7 = -966016615;
            int var6 = var10003;
            var10003 = (var6 | var7) & (~var6 | ~var7);
            var7 = 290749971;
            var6 = var10003;
            var10003 = (var6 | var7) - (var6 & var7);
            var7 = -216547430;
            var6 = -1643282686;
            int var10004 = (var6 | var7) & (~var6 | ~var7);
            var7 = 1036293583;
            var6 = var10004;
            var10004 = (var6 | var7) - (var6 & var7);
            int var10005 = (int)5020507172704975862L;
            var7 = 20255094;
            var6 = var10005;
            var10005 = (var6 | var7) - (var6 & var7);
            var7 = 1933040244;
            var6 = var10005;
            var10005 = var6 & ~var7 | ~var6 & var7;
            int var10006 = (int)-2344621468652023121L;
            var7 = -389730053;
            var6 = var10006;
            var10006 = (var6 | var7) & (~var6 | ~var7);
            var7 = -1125133635;
            var6 = var10006;
            var10000.error(
               a(
                  "\udbceнџ»\udbe1нџ¶\udbed\ud7fe\udba8нџ®\udbe7нћє\udbe9нџЄ\udbf8нџ¶\udbf1нћє\udbebнџ»\udbfc\ud7ff\udbefнџµ\udbfaнџі\udbedнџ©\udba8нџЄ\udbe7нџ©\udbe1нџ®\udbe1нџµ\udbe6",
                  "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘ґ}\ua7e8к’ікЃёк¤‚зґ№и№‰в‘¶и¬ёг‘ўvкћ©к’–кЃЅк¤ЉзµЈи№Ћ\u2459и¬ёг‘№t\ua7efк’ІкЃњк¤„зµёи№‹в‘Ѕи¬Іг‘Ґ",
                  var10003,
                  var10004,
                  var10005,
                  var6 + var7 - 2 * (var6 & var7)
               ),
               var9
            );
         }
      }
   }

   private void a(ConfigState.NotificationSettingsState var1) {
      if (var1 != null) {
         HudNotificationCenter var2 = HudNotificationCenter.a();
         if (var2 != null) {
            HudNotificationSettingsPanel var3 = var2.i();
            var3.a(var1.a());
            var3.b(var1.b());
            var3.c(var1.c());
            var3.d(var1.d());
            var3.e(var1.e());
         }
      }
   }

   private ConfigState.ClientColorState u() {
      ConfigState.ClientColorState var1 = new ConfigState.ClientColorState();
      ClientColor var2 = ModuleRegistry.CLIENT_COLOR;
      var1.a(var2.a.d());
      var1.a(var2.b.c());
      var1.b(var2.b.d());
      var1.c(var2.b.e());
      var1.d(var2.e.c());
      var1.e(var2.e.d());
      var1.f(var2.e.e());
      var1.g(var2.f.c());
      var1.h(var2.f.d());
      var1.i(var2.f.e());
      return var1;
   }

   private void a(ConfigState.ClientColorState var1) {
      if (var1 != null) {
         ClientColor var2 = ModuleRegistry.CLIENT_COLOR;
         String[] var3 = var2.a.a();
         int var10000 = (int)901962042270981159L;
         int var6 = -1408760130;
         int var5 = var10000;
         var10000 = (var5 | var6) & ~(var5 & var6);
         var6 = 1987746457;
         var5 = var10000;

         for (int var4 = (var5 | var6) & (~var5 | ~var6); var4 < var3.length; var4++) {
            if (var3[var4].equals(var1.a())) {
               var2.a.a(Integer.valueOf(var4));
               break;
            }
         }

         var2.b.a(var1.b(), var1.c(), var1.d());
         var2.e.a(var1.e(), var1.f(), var1.g());
         var2.f.a(var1.h(), var1.i(), var1.j());
      }
   }

   private FriendsPanel v() {
      try {
         if (Pulse.getInstance().getClickGui() instanceof PulseClickGuiScreen) {
            PulseClickGuiScreen var1 = (PulseClickGuiScreen)Pulse.getInstance().getClickGui();
            FriendsTab var2 = var1.h();
            if (var2 != null) {
               return var2.e();
            }
         }
      } catch (Exception var5) {
         Logger var10000 = Pulse.getLOGGER();
         int var4 = 1815447603;
         int var3 = -1417526812;
         int var10003 = var3 & ~var4 | ~var3 & var4;
         var4 = -2117733076;
         var3 = var10003;
         var10003 = (var3 | var4) & (~var3 | ~var4);
         int var10004 = (int)-4676539291655868558L;
         var4 = 1920720982;
         var3 = var10004;
         var10004 = var3 + var4 - 2 * (var3 & var4);
         var4 = 651759993;
         var3 = var10004;
         var10004 = (var3 | var4) & (~var3 | ~var4);
         var4 = 1233644940;
         var3 = -835420162;
         int var10005 = var3 + var4 - 2 * (var3 & var4);
         var4 = -2125530501;
         var3 = var10005;
         var10005 = (var3 | var4) & (~var3 | ~var4);
         int var10006 = (int)-7284489214164479002L;
         var4 = 1646166401;
         var3 = var10006;
         var10006 = var3 + var4 - 2 * (var3 & var4);
         var4 = -241967716;
         var3 = var10006;
         var10000.error(
            a(
               "ж·љ\udefdж·µ\udef0ж·№\udef8ж¶ј\udee8ж·і\udebcж·»\udef9ж·Ё\udebcж·љ\udeeeж·µ\udef9ж·І\udef8ж·Ї\uded0ж·µ\udeefж·Ё\udeccж·Ѕ\udef2ж·№\udef0",
               "`кџік“єкЃЎк¤ђзµєи№™в‘їи­ёг‘ґ}\ua7e8к’ікЃёк¤‚зґ№и№‰в‘¶и¬ёг‘ўvкћ©к’–кЃЅк¤ЉзµЈи№Ћ\u2459и¬ёг‘№t\ua7efк’ІкЃњк¤„зµёи№‹в‘Ѕи¬Іг‘Ґ",
               var10003,
               var10004,
               var10005,
               var3 + var4 - 2 * (var3 & var4)
            ),
            var5
         );
      }

      return null;
   }

   public static String a(String var0, String var1, int var2, int var3, int var4, int var5) {
      char[] var6 = var1.toCharArray();
      char[] var7 = new char[var6.length];
      int var18 = 1235589623;
      int var17 = 1864835754;
      int var10000 = var17 & ~var18 | ~var17 & var18;
      var18 = 646101847;
      var17 = var10000;
      char[] var219 = new char[var17 + var18 - 2 * (var17 & var18)];
      int var10002 = (int)-4184167284239206534L;
      var18 = -1898372584;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -2134551198;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -2077771322;
      var17 = 977631997;
      int var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -1100838135;
      var17 = var10003;
      var219[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var18 = 608251174;
      var17 = 15102779;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 614948380;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 1716842977;
      var17 = 1495868304;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1065218548;
      var17 = var10003;
      var219[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var18 = -1835565268;
      var17 = -817938385;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 1571307265;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)4976482422313558072L;
      var18 = -233743828;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1994971538;
      var17 = var10003;
      var219[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var18 = 872134724;
      var17 = 286259826;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 586433077;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 1177108673;
      var17 = -1082400534;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -112052168;
      var17 = var10003;
      var219[var10002] = (char)((var17 | var18) - (var17 & var18));
      var18 = -964669353;
      var17 = 1029947980;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = -68972001;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)-3289183156058429190L;
      var18 = -1541493907;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 166613682;
      var17 = var10003;
      var219[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var18 = -495740165;
      var17 = 173451903;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -400215935;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)8321793949433597652L;
      var18 = -102623741;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 1612602709;
      var17 = var10003;
      var219[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var10002 = (int)1957252075616212624L;
      var18 = -1779714408;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 451649550;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1479446087;
      var17 = -1836109608;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 895371378;
      var17 = var10003;
      var219[var10002] = (char)((var17 | var18) - (var17 & var18));
      var10002 = (int)-49010546034398297L;
      var18 = -1949354661;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1903157509;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var10003 = (int)-2581666367682172975L;
      var18 = -1183920959;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1356193586;
      var17 = var10003;
      var219[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var18 = -160721509;
      var17 = 1409016155;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = -1517259576;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -164439139;
      var17 = -1428810063;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 1558496639;
      var17 = var10003;
      var219[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var18 = 1473111205;
      var17 = 561597170;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1991552606;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)-2500875745389412233L;
      var18 = 1041978618;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -1095248983;
      var17 = var10003;
      var219[var10002] = (char)((var17 | var18) - (var17 & var18));
      char[] var8 = var219;
      var10000 = (int)-7004720900305841896L;
      var18 = -344518154;
      var17 = var10000;
      var10000 = (var17 | var18) - (var17 & var18);
      var18 = -1041039132;
      var17 = var10000;
      char[] var222 = new char[(var17 | var18) & ~(var17 & var18)];
      var18 = -1288124871;
      var17 = 322828524;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1610268971;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var18 = 254604672;
      var17 = -135224053;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -119793493;
      var17 = var10003;
      var222[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var18 = -1328889681;
      var17 = -768153847;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1660692391;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 490490470;
      var17 = 443067240;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 122971405;
      var17 = var10003;
      var222[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var10002 = (int)-3398555317793728598L;
      var18 = -860751682;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 298987286;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)-5010894055197745840L;
      var18 = -472693338;
      var17 = var10003;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = 989962149;
      var17 = var10003;
      var222[var10002] = (char)((var17 | var18) & ~(var17 & var18));
      var18 = 1828150796;
      var17 = -1542889600;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -922877553;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = 26333782;
      var17 = 1414443280;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = 1440701252;
      var17 = var10003;
      var222[var10002] = (char)((var17 | var18) - (var17 & var18));
      var18 = -1001657700;
      var17 = -1177705175;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = 2105954225;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)3952721839659129023L;
      var18 = -479760057;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = -5713480;
      var17 = var10003;
      var222[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var18 = -94358593;
      var17 = -1047304060;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = 1005804350;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var10003 = (int)-6322970462916396665L;
      var18 = -1973280049;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -621370404;
      var17 = var10003;
      var222[var10002] = (char)(var17 + var18 - 2 * (var17 & var18));
      var10002 = (int)-4241470305285909544L;
      var18 = -616100197;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 324525381;
      var17 = var10002;
      var10002 = (var17 | var18) & (~var17 | ~var18);
      var10003 = (int)8558204534397960422L;
      var18 = 1894817471;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = 857577824;
      var17 = var10003;
      var222[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var10002 = (int)-2064521484025023945L;
      var18 = -526248736;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -383473968;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var10003 = (int)-1609448757956334464L;
      var18 = 139793691;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var18 = -914052701;
      var17 = var10003;
      var222[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      var18 = 1205972784;
      var17 = -1608506692;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -406745724;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var10003 = (int)382796027277460022L;
      var18 = 1953703397;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 524182743;
      var17 = var10003;
      var222[var10002] = (char)((var17 | var18) & (~var17 | ~var18));
      var18 = -564597029;
      var17 = 804736219;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -240147959;
      var17 = var10002;
      var10002 = (var17 | var18) - (var17 & var18);
      var10003 = (int)7105896378370385308L;
      var18 = 960458135;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1161872584;
      var17 = var10003;
      var222[var10002] = (char)(var17 & ~var18 | ~var17 & var18);
      char[] var9 = var222;
      var10000 = (int)-4813099462787907325L;
      var18 = 42720973;
      var17 = var10000;
      var10000 = (var17 | var18) & (~var17 | ~var18);
      var18 = 426549198;
      var17 = var10000;

      for (int var10 = (var17 | var18) & (~var17 | ~var18); var10 < var6.length; var10++) {
         char var274 = var6[var10];
         char var205 = var8[var10 % var8.length];
         char var106 = var274;
         var7[var10] = (char)(var106 & ~var205 | ~var106 & var205);
      }

      char[] var19 = new char[var7.length];
      var10000 = (int)205599543281664929L;
      var18 = -788773010;
      var17 = var10000;
      var10000 = var17 + var18 - 2 * (var17 & var18);
      var18 = 800392399;
      var17 = var10000;

      for (int var11 = (var17 | var18) - (var17 & var18); var11 < var6.length; var11++) {
         char var275 = var7[var11];
         char var208 = var9[var11 % var9.length];
         char var109 = var275;
         var19[var11] = (char)(var109 + var208 - 2 * (var109 & var208));
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
      var18 = 7098647;
      var17 = -571402872;
      var10000 = (var17 | var18) & ~(var17 & var18);
      var18 = -576895841;
      var17 = var10000;

      for (int var16 = (var17 | var18) & (~var17 | ~var18); var16 < var15.length; var16++) {
         var18 = -1502229379;
         var17 = -1558238680;
         int var10001 = var17 + var18 - 2 * (var17 & var18);
         var18 = 90891863;
         var17 = var10001;
         switch (var16 % (var17 & ~var18 | ~var17 & var18)) {
            case 0:
               var18 = var12;
               var17 = var13;
               var10002 = var17 & ~var18 | ~var17 & var18;
               char var218 = var14[var16];
               var17 = var10002;
               var15[var16] = (char)((var17 | var218) & ~(var17 & var218));
               break;
            case 1:
               var18 = var13;
               var17 = var5;
               var10002 = var17 + var18 - 2 * (var17 & var18);
               char var216 = var14[var16];
               var17 = var10002;
               var15[var16] = (char)(var17 & ~var216 | ~var17 & var216);
         }
      }

      return new String(var15);
   }
}
