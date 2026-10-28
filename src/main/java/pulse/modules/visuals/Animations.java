package pulse;

import pulse.module.ClientModule;
import pulse.module.ModuleCategory;
import pulse.module.ModuleInfo;
import pulse.settings.BooleanSetting;
import pulse.settings.SettingGroup;
import pulse.settings.SliderSetting;

@ModuleInfo(a = "Animations", b = "Interface animations", c = ModuleCategory.VISUALS)
public class Animations extends ClientModule {
   private final SettingGroup playerListGroup;
   public final BooleanSetting a;
   public final SliderSetting b;

   private final SettingGroup chatGroup;
   public final BooleanSetting e;
   public final SliderSetting f;

   private final SettingGroup hotbarGroup;
   public final BooleanSetting g;
   public final SliderSetting h;

   private final SettingGroup cameraGroup;
   public final BooleanSetting i;
   public final SliderSetting j;

   private static PlayerListScaleAnimation playerListAnimation;
   private static ChatInputSlideAnimation chatInputAnimation;
   private static HotbarSelectionAnimation hotbarSelectionAnimation;
   private static PerspectiveDistanceAnimation perspectiveDistanceAnimation;

   public Animations() {
      this.playerListGroup = new SettingGroup("Player List");
      this.a = new BooleanSetting("Tab List", true);
      this.b = new SliderSetting("Tab Duration", 200.0F, 50.0F, 500.0F, 10.0F).a(this.a::a);

      this.chatGroup = new SettingGroup("Chat");
      this.e = new BooleanSetting("Chat Messages", true);
      this.f = new SliderSetting("Chat Duration", 200.0F, 50.0F, 500.0F, 10.0F).a(this.e::a);

      this.hotbarGroup = new SettingGroup("Hotbar");
      this.g = new BooleanSetting("Hotbar Selector", true);
      this.h = new SliderSetting("Hotbar Duration", 100.0F, 50.0F, 500.0F, 10.0F).a(this.g::a);

      this.cameraGroup = new SettingGroup("Camera");
      this.i = new BooleanSetting("Perspective", true);
      this.j = new SliderSetting("Perspective Duration", 300.0F, 50.0F, 1000.0F, 10.0F).a(this.i::a);
   }

   public static PlayerListScaleAnimation n() {
      if (playerListAnimation == null) {
         playerListAnimation = new PlayerListScaleAnimation();
      }

      return playerListAnimation;
   }

   public static ChatInputSlideAnimation o() {
      if (chatInputAnimation == null) {
         chatInputAnimation = new ChatInputSlideAnimation();
      }

      return chatInputAnimation;
   }

   public static HotbarSelectionAnimation p() {
      if (hotbarSelectionAnimation == null) {
         hotbarSelectionAnimation = new HotbarSelectionAnimation();
      }

      return hotbarSelectionAnimation;
   }

   public static PerspectiveDistanceAnimation q() {
      if (perspectiveDistanceAnimation == null) {
         perspectiveDistanceAnimation = new PerspectiveDistanceAnimation();
      }

      return perspectiveDistanceAnimation;
   }
}
