package pulse;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import net.minecraft.client.texture.NativeImage;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;
import ru.pulse.Pulse;

public final class IconTextureRegistry {
   public static final String WATER = "water";
   public static final String ARROW_V = "arrow_v";
   public static final String KEYBOARD = "keyboard";
   public static final String ICON = "icon";
   public static final String LIGHTNING = "lightning";
   public static final String PULSE_ICON = "pulse_icon";
   public static final String SEARCH = "search";
   public static final String ARROW = "arrow";
   public static final String UP_ARROW = "up_arrow";
   public static final String LOGO = "logo";
   public static final String CALENDAR = "calendar";
   public static final String DEATH = "death";
   public static final String DIAMOND = "diamond";
   public static final String FAST = "fast";
   public static final String HOME = "home";
   public static final String LOCKED = "locked";
   public static final String MOUNTAIN = "mountain";
   public static final String REPAIR = "repair";
   public static final String SHIELD = "shield";
   public static final String TRASH = "trash";
   public static final String PLAY = "play";
   public static final String SHARE = "share";
   public static final String SAVE = "save";
   public static final String PLUS = "plus";
   public static final String KEY = "key";
   public static final String EDIT = "edit";
   public static final String LOAD = "load";
   public static final String PULSE_ICO = "pulse_ico";

   private static final String DEFAULT_KEY = ICON;
   private static final Map<String, TextureInfo> TEXTURES = new HashMap<>();

   private IconTextureRegistry() {
   }

   public static void load() {
      if (!TEXTURES.isEmpty()) {
         return;
      }

      register("shadow", "textures/shadow.png");
      register("logo", "textures/logo.png");
      register("icon", "textures/icon.png");
      register("up_arrow", "textures/up_arrow.png");
      register("arrow", "textures/arrow.png");
      register("pulse", "textures/pulse.png");
      register("pulse_logo", "textures/pulse_logo.png");
      register("target", "textures/target.png");
      register("water", "textures/clickgui/pulse_water.png");
      register("pulse_water", "textures/clickgui/pulse_water.png");
      register("search", "textures/clickgui/search.png");
      register("keyboard", "textures/clickgui/keyboard.png");
      register("calendar", "textures/clickgui/calendar.png");
      register("death", "textures/clickgui/death.png");
      register("diamond", "textures/clickgui/diamond.png");
      register("fast", "textures/clickgui/fast.png");
      register("home", "textures/clickgui/home.png");
      register("locked", "textures/clickgui/locked.png");
      register("mountain", "textures/clickgui/mountain.png");
      register("repair", "textures/clickgui/repair.png");
      register("shield", "textures/clickgui/shield.png");
      register("trash", "textures/clickgui/trash.png");
      register("play", "textures/clickgui/play.png");
      register("share", "textures/clickgui/share.png");
      register("save", "textures/clickgui/save.png");
      register("plus", "textures/clickgui/plus.png");
      register("key", "textures/clickgui/key.png");
      register("edit", "textures/clickgui/edit.png");
      register("load", "textures/clickgui/load.png");
      register("pulse_ico", "textures/clickgui/pulse_ico.png");
      register("bell", "textures/clickgui/bell.png");
      register("warning", "textures/clickgui/warning.png");
      register("music", "textures/clickgui/music.png");
      register("arrows_left", "textures/clickgui/arrows_left.png");
      register("arrows_right", "textures/clickgui/arrows_right.png");
      register("pause", "textures/clickgui/pause.png");
      register("play_button", "textures/clickgui/play_button.png");
      register("potions", "textures/clickgui/potions.png");
      register("hotkeys", "textures/clickgui/hotkeys.png");
      register("cooldowns", "textures/clickgui/cooldowns.png");
      register("configs", "textures/clickgui/configs.png");
      register("events", "textures/clickgui/events.png");
      register("friends", "textures/clickgui/friends.png");
      register("hud", "textures/clickgui/hud.png");
      register("markers", "textures/clickgui/markers.png");
      register("modules", "textures/clickgui/modules.png");
      register("utilities", "textures/clickgui/utilities.png");
      register("visuals", "textures/clickgui/visuals.png");
      register("example_group", "textures/clickgui/example_group.png");

      registerPotionAliases();
   }

   public static Identifier get(String key) {
      TextureInfo texture = getInfo(key);
      return texture == null ? Identifier.of("pulse", "textures/icon.png") : texture.a();
   }

   @Nullable
   public static TextureInfo getInfo(String key) {
      load();
      TextureInfo texture = TEXTURES.get(normalizeKey(key));
      if (texture != null) {
         return texture;
      }

      return TEXTURES.get(DEFAULT_KEY);
   }

   private static void register(String key, String resourcePath) {
      Identifier id = Identifier.of("pulse", resourcePath);
      int width = 1;
      int height = 1;

      try (InputStream stream = IconTextureRegistry.class.getResourceAsStream("/assets/pulse/" + resourcePath)) {
         if (stream == null) {
            Pulse.getLOGGER().warn("Texture file not found: /assets/pulse/{}", resourcePath);
         } else {
            NativeImage image = NativeImage.read(stream);
            width = image.getWidth();
            height = image.getHeight();
            image.close();
         }
      } catch (IOException exception) {
         Pulse.getLOGGER().warn("Failed to read texture: /assets/pulse/{}", resourcePath, exception);
      }

      TEXTURES.put(key, new TextureInfo(id, width, height));
   }

   private static void registerPotionAliases() {
      String[] potionNames = {
         "absorption",
         "bad_omen",
         "blindness",
         "conduit_power",
         "dolphins_grace",
         "fire_resistance",
         "glowing",
         "haste",
         "health_boost",
         "hero_of_the_village",
         "hunger",
         "instant_damage",
         "instant_health",
         "invisibility",
         "jump_boost",
         "levitation",
         "luck",
         "mining_fatigue",
         "nausea",
         "night_vision",
         "poison",
         "regeneration",
         "resistance",
         "saturation",
         "slow_falling",
         "slowness",
         "speed",
         "strength",
         "unluck",
         "water_breathing",
         "weakness",
         "wither"
      };

      TextureInfo potions = TEXTURES.get("potions");
      for (String potionName : potionNames) {
         TEXTURES.put(potionName, potions);
      }
   }

   private static String normalizeKey(String key) {
      if (key == null || key.isBlank()) {
         return DEFAULT_KEY;
      }

      if (!key.matches("[a-z0-9_./-]+")) {
         return DEFAULT_KEY;
      }

      return key;
   }

   public static final class TextureInfo {
      private final Identifier identifier;
      private final int width;
      private final int height;

      public TextureInfo(Identifier identifier, int width, int height) {
         this.identifier = identifier;
         this.width = width;
         this.height = height;
      }

      public Identifier a() {
         return this.identifier;
      }

      public int b() {
         return this.width;
      }

      public int c() {
         return this.height;
      }
   }
}
