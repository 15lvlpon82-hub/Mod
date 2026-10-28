package pulse.client;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.util.Window;

public interface MinecraftContext {
   MinecraftClient CLIENT = MinecraftClient.getInstance();
   Window WINDOW = CLIENT.getWindow();

   MinecraftClient c = CLIENT;
   Window d = WINDOW;
}
