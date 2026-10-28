package pulse;

import java.util.Stack;
import net.minecraft.client.util.math.MatrixStack;

public class ScissorStack {
   private final Renderer2D a;
   private final Stack<ScissorStack.ScissorBounds> b = new Stack<>();

   public ScissorStack(Renderer2D var1) {
      this.a = var1;
   }

   public void a(float var1, float var2, float var3, float var4, MatrixStack var5) {
      this.a(var1, var2, var3, var4, 0.0F, var5);
   }

   public void a(float var1, float var2, float var3, float var4, float var5, MatrixStack var6) {
      if (this.b.isEmpty()) {
         this.b.push(new ScissorStack.ScissorBounds(var1, var2, var3, var4, var5));
         this.a.a(var1, var2, var3, var4, var5, var6);
      } else {
         ScissorStack.ScissorBounds var7 = this.b.peek();
         float var8 = Math.max(var7.a(), var1);
         float var9 = Math.max(var7.b(), var2);
         float var10 = Math.min(var7.a() + var7.c(), var1 + var3) - var8;
         float var11 = Math.min(var7.b() + var7.d(), var2 + var4) - var9;
         if (!(var10 <= 0.0F) && !(var11 <= 0.0F)) {
            this.a.a(var6);
            this.a.a(var8, var9, var10, var11, var5, var6);
            this.b.push(new ScissorStack.ScissorBounds(var8, var9, var10, var11, var5));
         } else {
            this.b.push(new ScissorStack.ScissorBounds(var7.a(), var7.b(), 0.0F, 0.0F, var5));
         }
      }
   }

   public void a(MatrixStack var1) {
      if (!this.b.isEmpty()) {
         this.b.pop();
         this.a.a(var1);
         if (!this.b.isEmpty()) {
            ScissorStack.ScissorBounds var2 = this.b.peek();
            this.a.a(var2.a(), var2.b(), var2.c(), var2.d(), var2.e(), var1);
         }
      }
   }

   private static class ScissorBounds {
      private final float a;
      private final float b;
      private final float c;
      private final float d;
      private final float e;

      public ScissorBounds(float var1, float var2, float var3, float var4, float var5) {
         this.a = var1;
         this.b = var2;
         this.c = var3;
         this.d = var4;
         this.e = var5;
      }

      public float a() {
         return this.a;
      }

      public float b() {
         return this.b;
      }

      public float c() {
         return this.c;
      }

      public float d() {
         return this.d;
      }

      public float e() {
         return this.e;
      }
   }
}
