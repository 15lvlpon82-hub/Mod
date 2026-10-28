package pulse;

import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;

public class AlphaVertexConsumerProvider implements VertexConsumerProvider {
   private final VertexConsumerProvider delegate;
   private final float alphaMultiplier;

   public AlphaVertexConsumerProvider(VertexConsumerProvider delegate, float alphaMultiplier) {
      this.delegate = delegate;
      this.alphaMultiplier = alphaMultiplier;
   }

   public VertexConsumer getBuffer(RenderLayer layer) {
      return new AlphaVertexConsumer(this.delegate.getBuffer(layer), this.alphaMultiplier);
   }
}
