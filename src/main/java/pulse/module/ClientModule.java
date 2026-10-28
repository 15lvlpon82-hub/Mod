package pulse.module;


import pulse.client.MinecraftContext;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import pulse.EventBusService;
import pulse.ConfigManager;
import pulse.HudServiceRegistry;
import pulse.HudNotificationCenter;
import pulse.settings.Setting;

public abstract class ClientModule implements MinecraftContext {
   private final String name;
   private final String description;
   private final ModuleCategory category;
   private int bindKey;
   private boolean subscribed;
   private boolean enabled;
   private final List<Setting<?>> settings = new ArrayList<>();

   public ClientModule() {
      this.bindKey = 0;
      this.enabled = false;

      ModuleInfo info = this.getClass().getAnnotation(ModuleInfo.class);
      if (info == null) {
         throw new IllegalStateException("Missing @ModuleInfo on " + this.getClass().getName());
      }

      this.name = info.a();
      this.description = info.b();
      this.category = info.c();
   }

   public String name() {
      return this.name;
   }

   public String description() {
      return this.description;
   }

   public ModuleCategory category() {
      return this.category;
   }

   public int bindKey() {
      return this.bindKey;
   }

   public void setBindKey(int bindKey) {
      if (this.bindKey != bindKey) {
         this.bindKey = bindKey;
         ConfigManager.a().h();
      }
   }

   public boolean isEnabled() {
      return this.enabled;
   }

   public void setEnabled(boolean enabled) {
      this.setEnabledState(enabled);
   }

   public void toggle() {
      this.setEnabled(!this.enabled);
   }

   public boolean isSubscribed() {
      return this.subscribed;
   }

   public boolean isActive() {
      return this.subscribed ? HudServiceRegistry.MODULE_ACCESS.a(this.name) : false;
   }

   public List<Setting<?>> settings() {
      return this.settings;
   }

   public void collectSettings() {
      this.settings.clear();
      for (Field field : this.getClass().getDeclaredFields()) {
         field.setAccessible(true);
         try {
            Object value = field.get(this);
            if (value instanceof Setting<?> setting) {
               this.settings.add(setting);
            }
         } catch (IllegalAccessException exception) {
            throw new IllegalStateException("Cannot read setting field " + field.getName(), exception);
         }
      }
   }

   public void setEnabledState(boolean enabled) {
      if (this.enabled != enabled) {
         this.enabled = enabled;
         ConfigManager.a().h();
      }

      if (!enabled || HudServiceRegistry.MODULE_ACCESS.a(this.name)) {
         this.setSubscribed(enabled);
      }
   }

   public void setSubscribed(boolean subscribed) {
      if (this.subscribed != subscribed) {
         this.subscribed = subscribed;
         if (subscribed) {
            this.onEnable();
         } else {
            this.onDisable();
         }

         HudNotificationCenter.a(this.name, subscribed);
      }
   }

   public void syncState() {
      this.setSubscribed(this.enabled);
   }

   public void onEnable() {
      EventBusService.EVENT_BUS.subscribe(this);
   }

   public void onDisable() {
      EventBusService.EVENT_BUS.unsubscribe(this);
   }

   public void a(int bindKey) {
      this.setBindKey(bindKey);
   }

   public boolean a() {
      return this.isEnabled();
   }

   public void a(boolean enabled) {
      this.setEnabled(enabled);
   }

   public void b() {
      this.collectSettings();
   }

   public void b(boolean enabled) {
      this.setEnabledState(enabled);
   }

   public void c(boolean subscribed) {
      this.setSubscribed(subscribed);
   }

   public void c() {
      this.syncState();
   }

   public void d() {
      this.toggle();
   }

   public void e() {
      this.onEnable();
   }

   public void f() {
      this.onDisable();
   }

   public String g() {
      return this.name();
   }

   public String h() {
      return this.description();
   }

   public ModuleCategory i() {
      return this.category();
   }

   public int j() {
      return this.bindKey();
   }

   public boolean k() {
      return this.isActive();
   }

   public boolean l() {
      return this.isSubscribed();
   }

   public List<Setting<?>> m() {
      return this.settings();
   }
}
