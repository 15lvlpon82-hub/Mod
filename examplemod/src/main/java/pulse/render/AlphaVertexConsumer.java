package pulse;

import net.minecraft.client.render.VertexConsumer;

public class AlphaVertexConsumer implements VertexConsumer {
   private final VertexConsumer delegate;
   private final float alphaMultiplier;

   public AlphaVertexConsumer(VertexConsumer delegate, float alphaMultiplier) {
      this.delegate = delegate;
      this.alphaMultiplier = alphaMultiplier;
   }

   public VertexConsumer vertex(float x, float y, float z) {
      this.delegate.vertex(x, y, z);
      return this;
   }

   public VertexConsumer color(int red, int green, int blue, int alpha) {
      this.delegate.color(red, green, blue, (int)(alpha * this.alphaMultiplier));
      return this;
   }

   public VertexConsumer texture(float u, float v) {
      this.delegate.texture(u, v);
      return this;
   }

   public VertexConsumer overlay(int u, int v) {
      this.delegate.overlay(u, v);
      return this;
   }

   public VertexConsumer light(int u, int v) {
      this.delegate.light(u, v);
      return this;
   }

   public VertexConsumer normal(float x, float y, float z) {
      this.delegate.normal(x, y, z);
      return this;
   }
}
