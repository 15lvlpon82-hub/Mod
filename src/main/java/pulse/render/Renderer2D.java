package pulse;

import java.awt.Color;
import net.minecraft.client.util.Window;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;

public interface Renderer2D {
   default void a(float var1, float var2, float var3, float var4, Color var5, MatrixStack var6) {
      this.a(var1, var2, var3, var4, 0.0F, var5, var6);
   }

   void a(float var1, float var2, float var3, float var4, float var5, Color var6, MatrixStack var7);

   default void a(float var1, float var2, float var3, float var4, float var5, Color var6, Color var7, Color var8, Color var9, MatrixStack var10) {
      this.a(var1, var2, var3, var4, var5, var5, var5, var5, var6, var7, var8, var9, var10);
   }

   void a(
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      Color var9,
      Color var10,
      Color var11,
      Color var12,
      MatrixStack var13
   );

   void a(float var1, float var2, float var3, Color var4, MatrixStack var5);

   void a(float var1, float var2, float var3, float var4, float var5, float var6, Color var7, MatrixStack var8);

   default void b(float var1, float var2, float var3, float var4, float var5, Color var6, MatrixStack var7) {
      this.b(var1, var2, var3, var4, 0.0F, var5, var6, var7);
   }

   void a(float var1, float var2, float var3, float var4, MatrixStack var5);

   Window a();

   void b(float var1, float var2, float var3, float var4, float var5, float var6, Color var7, MatrixStack var8);

   void a(int var1, float var2, float var3, float var4, float var5, Color var6, MatrixStack var7);

   void a(Identifier var1, float var2, float var3, float var4, float var5, Color var6, MatrixStack var7);

   default void a(Identifier var1, float var2, float var3, float var4, float var5, float var6, Color var7, MatrixStack var8) {
      this.a(var1, var2, var3, var4, var5, var6, 0.0F, 0.0F, 1.0F, 1.0F, var7, var8);
   }

   void a(
      Identifier var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      Color var11,
      MatrixStack var12
   );

   default Color a(Color var1, float var2) {
      return new Color(var1.getRed(), var1.getGreen(), var1.getBlue(), MathHelper.clamp((int)(var2 * 255.0F), 0, 255));
   }

   default Color a(Color var1, int var2) {
      return new Color(var1.getRed(), var1.getGreen(), var1.getBlue(), MathHelper.clamp(var2, 0, 255));
   }

   void b(float var1, float var2, float var3, float var4, MatrixStack var5);

   default void a(float var1, float var2, float var3, float var4, float var5, MatrixStack var6) {
      this.b(var1, var2, var3, var4, var6);
   }

   void a(MatrixStack var1);

   ScissorStack b();

   void a(float var1, float var2, float var3, float var4, float var5, float var6, MatrixStack var7);

   void c(float var1, float var2, float var3, float var4, MatrixStack var5);

   void a(float var1, MatrixStack var2);
}
