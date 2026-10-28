package pulse;

import java.util.List;
import net.minecraft.client.util.math.MatrixStack;

public class ModuleSettingsOverlay implements ClickGuiOverlay {
   private static final float MODULE_LIST_TOP_OFFSET = 48.0F;
   private static final float MODULE_LIST_BOTTOM_PADDING = 5.0F;

   private final PulseClickGuiScreen screen;
   private int mouseX;
   private int mouseY;

   public ModuleSettingsOverlay(PulseClickGuiScreen screen) {
      this.screen = screen;
   }

   @Override
   public void a(MatrixStack matrices, Renderer2D renderer, float x, float y, int mouseX, int mouseY) {
      ClickGuiTab activePanel = this.screen.a();
      if (!(activePanel instanceof ModulesTab modulesPanel) || activePanel.a() != ClickGuiTabType.MODULES) {
         return;
      }

      List<ModuleCard> moduleCards = modulesPanel.h();
      if (moduleCards.isEmpty()) {
         return;
      }

      this.mouseX = mouseX;
      this.mouseY = mouseY;

      float visibleTop = y + MODULE_LIST_TOP_OFFSET;
      float visibleBottom = PulseClickGuiScreen.e() - MODULE_LIST_TOP_OFFSET - MODULE_LIST_BOTTOM_PADDING;
      ModuleCard hoveredCard = findHoveredSettingsCard(moduleCards, mouseX, mouseY);

      for (ModuleCard moduleCard : moduleCards) {
         boolean renderAsFocused = hoveredCard == null || hoveredCard == moduleCard;
         moduleCard.a(matrices, renderer, x, y, mouseX, mouseY, visibleTop, visibleBottom, renderAsFocused);
      }
   }

   public void a(MatrixStack matrices, Renderer2D renderer, int mouseX, int mouseY) {
      ClickGuiTab activePanel = this.screen.a();
      if (!(activePanel instanceof ModulesTab modulesPanel) || activePanel.a() != ClickGuiTabType.MODULES) {
         return;
      }

      for (ModuleCard moduleCard : modulesPanel.h()) {
         moduleCard.a(matrices, renderer, mouseX, mouseY);
      }
   }

   @Override
   public void a(float x, float y, int mouseX, int mouseY) {
   }

   private ModuleCard findHoveredSettingsCard(List<ModuleCard> moduleCards, int mouseX, int mouseY) {
      for (ModuleCard moduleCard : moduleCards) {
         if (!moduleCard.f() && !moduleCard.g() && moduleCard.f(mouseX, mouseY)) {
            return moduleCard;
         }
      }

      return null;
   }
}
