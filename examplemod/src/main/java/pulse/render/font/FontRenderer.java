package pulse;

import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.ObjectList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.awt.Color;
import java.awt.Font;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.geom.AffineTransform;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat.DrawMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.joml.Matrix4f;
import org.lwjgl.opengl.GL11;

public class FontRenderer {
   private static final FontRenderContext a = new FontRenderContext(new AffineTransform(), true, true);
   private final Object2ObjectMap<Identifier, ObjectList<GlyphDrawEntry>> b = new Object2ObjectOpenHashMap();
   private final Object2ObjectMap<Identifier, ObjectList<GradientGlyphDrawEntry>> c = new Object2ObjectOpenHashMap();
   private final ObjectList<FontGlyphAtlas> d = new ObjectArrayList();
   private Font e;
   private float f;

   public void a(Font var1) {
      this.e = var1;
   }

   public void a(float var1) {
      this.f = var1;
   }

   public float a() {
      return this.f;
   }

   public Font b() {
      return this.e;
   }

   public FontRenderer(Font var1, float var2) {
      this.a(var1, var2);
   }

   private static void a(String var0, FontRenderer.GlyphPredicate var1) {
      int var2 = var0.length();

      for (int var3 = 0; var3 < var2; var3++) {
         char var4 = var0.charAt(var3);
         if (!var1.a(var3, var4)) {
            return;
         }
      }
   }

   @Contract(value = "-> new", pure = true)
   @NotNull
   public static Identifier c() {
      return Identifier.of("pulse", "temp/" + d());
   }

   private void a(Font var1, float var2) {
      this.f = var2;
      this.e = var1.deriveFont(var2 * 2.0F);
   }

   private static String d() {
      Random var0 = new Random();
      return IntStream.range(0, 32).mapToObj(var1 -> String.valueOf((char)(97 + var0.nextInt(26)))).collect(Collectors.joining());
   }

   private FontGlyphAtlas a(char var1, char var2) {
      FontGlyphAtlas var3 = new FontGlyphAtlas(var1, var2, this.e, c(), 5);
      this.d.add(var3);
      return var3;
   }

   private FontGlyph b(char var1) {
      ObjectListIterator var2 = this.d.iterator();

      while (var2.hasNext()) {
         FontGlyphAtlas var3 = (FontGlyphAtlas)var2.next();
         if (var3.b(var1)) {
            return var3.a(var1);
         }
      }

      char var4 = (char)a((int)var1);
      return this.a(var4, (char)(var4 + 256)).a(var1);
   }

   private static int a(int var0) {
      return 256 * (int)Math.floor(var0 / 256.0);
   }

   public void a(String var1, double var2, double var4, MatrixStack var6) {
      this.a(var1, var2, var4, Color.WHITE, var6);
   }

   public void a(String var1, double var2, double var4, Color var6, MatrixStack var7) {
      int var8 = var6.getRGB();
      this.a(var7, var1, var2, var4, var8);
   }

   public void a(String var1, double var2, double var4, Color var6, Color var7, MatrixStack var8) {
      float var9 = this.b(var1);
      this.a(var8, var1, var2, var4, var6.getRGB(), var7.getRGB(), var9);
   }

   public void b(String var1, double var2, double var4, Color var6, MatrixStack var7) {
      double var8 = this.a(var1);
      double var10 = var2 - var8 / 2.0;
      this.a(var1, var10, var4, var6, var7);
   }

   public void c(String var1, double var2, double var4, Color var6, MatrixStack var7) {
      double var8 = this.b(var1);
      double var10 = var4 - var8 / 2.0;
      this.a(var1, var2, var10, var6, var7);
   }

   public void a(MatrixStack var1, String var2, double var3, double var5, int var7) {
      var1.push();
      var3 = Math.round(var3 * 2.0) / 2.0;
      var5 = Math.round(var5 * 2.0) / 2.0;
      var1.translate(var3, var5, 0.0);
      var1.scale(0.5F, 0.5F, 0.5F);
      RenderSystem.enableBlend();
      FramebufferCapture.applyBlendState();
      Matrix4f var8 = var1.peek().getPositionMatrix();
      char[] var9 = var2.toCharArray();
      float[] var10 = this.c(var2);
      float var11 = 0.0F;
      int var12 = 0;

      for (int var13 = 0; var13 < var9.length; var13++) {
         char var14 = var9[var13];
         if (var14 == '\n') {
            var11 += this.b(var2.substring(var12, var13)) - 2.0F;
            var12 = var13 + 1;
            if (var12 < var9.length) {
               var10 = this.c(var2.substring(var12));
            }
         } else {
            FontGlyph var15 = this.b(var14);
            if (var15 != null && var15.e() != ' ') {
               Identifier var16 = var15.f().a;
               float var17 = var10[var13 - var12];
               GlyphDrawEntry var18 = new GlyphDrawEntry(var17, var11, var7, var15);
               ((ObjectList)this.b.computeIfAbsent(var16, var0 -> new ObjectArrayList())).add(var18);
            }
         }
      }

      this.a(var8);
      RenderSystem.disableBlend();
      this.b.clear();
      var1.pop();
   }

   public void a(MatrixStack var1, String var2, double var3, double var5, int var7, int var8, float var9) {
      var1.push();
      var3 = Math.round(var3 * 2.0) / 2.0;
      var5 = Math.round(var5 * 2.0) / 2.0;
      var1.translate(var3, var5, 0.0);
      var1.scale(0.5F, 0.5F, 0.5F);
      RenderSystem.enableBlend();
      FramebufferCapture.applyBlendState();
      Matrix4f var10 = var1.peek().getPositionMatrix();
      char[] var11 = var2.toCharArray();
      float[] var12 = this.c(var2);
      float var13 = var9;
      float var14 = 0.0F;
      int var15 = 0;

      for (int var16 = 0; var16 < var11.length; var16++) {
         char var17 = var11[var16];
         if (var17 == '\n') {
            var14 += this.b(var2.substring(var15, var16)) - 2.0F;
            var15 = var16 + 1;
            if (var15 < var11.length) {
               var12 = this.c(var2.substring(var15));
            }
         } else {
            FontGlyph var18 = this.b(var17);
            if (var18 != null && var18.e() != ' ') {
               Identifier var19 = var18.f().a;
               float var20 = var12[var16 - var15];
               GradientGlyphDrawEntry var21 = new GradientGlyphDrawEntry(var20, var14, var7, var8, var18, var13);
               ((ObjectList)this.c.computeIfAbsent(var19, var0 -> new ObjectArrayList())).add(var21);
            }
         }
      }

      this.b(var10);
      RenderSystem.disableBlend();
      this.c.clear();
      var1.pop();
   }

   private float[] c(String var1) {
      if (var1.isEmpty()) {
         return new float[0];
      }

      String var2 = var1.split("\n")[0];
      float[] var3 = new float[var2.length()];
      GlyphVector var4 = this.e.createGlyphVector(a, var2);
      var3[0] = 0.0F;
      float var5 = 0.0F;

      for (int var6 = 1; var6 < var2.length(); var6++) {
         float var7 = (float)var4.getGlyphPosition(var6 - 1).getX();
         float var8 = (float)var4.getGlyphPosition(var6).getX();
         float var9 = var8 - var7;
         var5 += Math.round(var9);
         var3[var6] = var5;
      }

      return var3;
   }

   private void a(Matrix4f var1) {
      RenderSystem.setShader(ShaderProgramKeys.POSITION_TEX_COLOR);
      ObjectIterator var2 = this.b.keySet().iterator();

      while (var2.hasNext()) {
         Identifier var3 = (Identifier)var2.next();
         RenderSystem.setShaderTexture(0, var3);
         GL11.glTexParameteri(3553, 10241, 9728);
         GL11.glTexParameteri(3553, 10240, 9728);
         Tessellator var4 = Tessellator.getInstance();
         BufferBuilder var5 = var4.begin(DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
         ObjectListIterator var6 = ((ObjectList)this.b.get(var3)).iterator();

         while (var6.hasNext()) {
            GlyphDrawEntry var7 = (GlyphDrawEntry)var6.next();
            float var8 = var7.a();
            float var9 = var7.b();
            FontGlyph var10 = var7.d();
            FontGlyphAtlas var11 = var10.f();
            float var12 = var10.c();
            float var13 = var10.d();
            float var14 = (float)var10.a() / var11.b;
            float var15 = (float)var10.b() / var11.c;
            float var16 = (float)(var10.a() + var10.c()) / var11.b;
            float var17 = (float)(var10.b() + var10.d()) / var11.c;
            int var18 = var7.c();
            var5.vertex(var1, var8, var9 + var13, 0.0F).texture(var14, var17).color(var18);
            var5.vertex(var1, var8 + var12, var9 + var13, 0.0F).texture(var16, var17).color(var18);
            var5.vertex(var1, var8 + var12, var9, 0.0F).texture(var16, var15).color(var18);
            var5.vertex(var1, var8, var9, 0.0F).texture(var14, var15).color(var18);
         }

         BufferRenderer.drawWithGlobalProgram(var5.end());
      }
   }

   private void b(Matrix4f var1) {
      RenderSystem.setShader(ShaderProgramKeys.POSITION_TEX_COLOR);
      ObjectIterator var2 = this.c.keySet().iterator();

      while (var2.hasNext()) {
         Identifier var3 = (Identifier)var2.next();
         RenderSystem.setShaderTexture(0, var3);
         GL11.glTexParameteri(3553, 10241, 9728);
         GL11.glTexParameteri(3553, 10240, 9728);
         Tessellator var4 = Tessellator.getInstance();
         BufferBuilder var5 = var4.begin(DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
         ObjectListIterator var6 = ((ObjectList)this.c.get(var3)).iterator();

         while (var6.hasNext()) {
            GradientGlyphDrawEntry var7 = (GradientGlyphDrawEntry)var6.next();
            float var8 = var7.a();
            float var9 = var7.b();
            FontGlyph var10 = var7.e();
            FontGlyphAtlas var11 = var10.f();
            float var12 = var10.c();
            float var13 = var10.d();
            float var14 = (float)var10.a() / var11.b;
            float var15 = (float)var10.b() / var11.c;
            float var16 = (float)(var10.a() + var10.c()) / var11.b;
            float var17 = (float)(var10.b() + var10.d()) / var11.c;
            int var18 = var7.c();
            int var19 = var7.d();
            var5.vertex(var1, var8, var9 + var13, 0.0F).texture(var14, var17).color(var19);
            var5.vertex(var1, var8 + var12, var9 + var13, 0.0F).texture(var16, var17).color(var19);
            var5.vertex(var1, var8 + var12, var9, 0.0F).texture(var16, var15).color(var18);
            var5.vertex(var1, var8, var9, 0.0F).texture(var14, var15).color(var18);
         }

         BufferRenderer.drawWithGlobalProgram(var5.end());
      }
   }

   private Color a(Color var1, Color var2, float var3) {
      int var4 = (int)(var1.getRed() + (var2.getRed() - var1.getRed()) * var3);
      int var5 = (int)(var1.getGreen() + (var2.getGreen() - var1.getGreen()) * var3);
      int var6 = (int)(var1.getBlue() + (var2.getBlue() - var1.getBlue()) * var3);
      int var7 = (int)(var1.getAlpha() + (var2.getAlpha() - var1.getAlpha()) * var3);
      return new Color(var4, var5, var6, var7);
   }

   public void b(MatrixStack var1, String var2, double var3, double var5, int var7) {
      this.a(var1, var2, (float)(var3 - this.a(var2) / 2.0F), (float)var5, var7);
   }

   public float a(String var1) {
      if (var1.isEmpty()) {
         return 0.0F;
      }

      float var2 = 0.0F;

      for (String var6 : var1.split("\n")) {
         if (!var6.isEmpty()) {
            GlyphVector var7 = this.e.createGlyphVector(a, var6);
            float var8 = 0.0F;

            for (int var9 = 1; var9 <= var6.length(); var9++) {
               float var10 = (float)var7.getGlyphPosition(var9 - 1).getX();
               float var11 = (float)var7.getGlyphPosition(var9).getX();
               var8 += Math.round(var11 - var10);
            }

            var2 = Math.max(var2, var8);
         }
      }

      return (float)(Math.round(var2 / 2.0F * 2.0) / 2.0);
   }

   public float b(String var1) {
      float var2 = 0.0F;
      float var3 = 0.0F;

      for (char var7 : (var1.isEmpty() ? " " : var1).toCharArray()) {
         if (var7 == '\n') {
            var2 = var2 == 0.0F ? this.b(' ').d() : var2;
            var3 += var2;
            var2 = 0.0F;
         } else {
            FontGlyph var8 = this.b(var7);
            var2 = Math.max(var8 == null ? 0.0F : var8.d(), var2);
         }
      }

      return var2 + var3;
   }

   public float a(char var1) {
      GlyphVector var2 = this.e.createGlyphVector(a, String.valueOf(var1));
      float var3 = Math.round((float)var2.getGlyphPosition(1).getX());
      return (float)(Math.round(var3 / 2.0F * 2.0) / 2.0);
   }

   public float a(String var1, int var2) {
      if (!var1.isEmpty() && var2 > 0) {
         if (var2 > var1.length()) {
            var2 = var1.length();
         }

         GlyphVector var3 = this.e.createGlyphVector(a, var1);
         float var4 = 0.0F;

         for (int var5 = 1; var5 <= var2; var5++) {
            float var6 = (float)var3.getGlyphPosition(var5 - 1).getX();
            float var7 = (float)var3.getGlyphPosition(var5).getX();
            var4 += Math.round(var7 - var6);
         }

         return (float)(Math.round(var4 / 2.0F * 2.0) / 2.0);
      } else {
         return 0.0F;
      }
   }

   public int a(String var1, float var2) {
      if (!var1.isEmpty() && !(var2 <= 0.0F)) {
         GlyphVector var3 = this.e.createGlyphVector(a, var1);
         float var4 = var2 * 2.0F;
         float[] var5 = new float[var1.length() + 1];
         var5[0] = 0.0F;

         for (int var6 = 1; var6 <= var1.length(); var6++) {
            float var7 = (float)var3.getGlyphPosition(var6 - 1).getX();
            float var8 = (float)var3.getGlyphPosition(var6).getX();
            var5[var6] = var5[var6 - 1] + Math.round(var8 - var7);
         }

         for (int var9 = 0; var9 < var1.length(); var9++) {
            float var10 = (var5[var9] + var5[var9 + 1]) / 2.0F;
            if (var4 < var10) {
               return var9;
            }
         }

         return var1.length();
      } else {
         return 0;
      }
   }

   public String a(String var1, int var2, boolean var3) {
      return var3 ? this.c(var1, var2) : this.b(var1, var2);
   }

   public String b(String var1, int var2) {
      return var1.substring(0, this.d(var1, var2));
   }

   private int d(String var1, int var2) {
      if (var1.isEmpty()) {
         return 0;
      }

      GlyphVector var3 = this.e.createGlyphVector(a, var1);
      float var4 = var2 * 2.0F;
      float var5 = 0.0F;

      for (int var6 = 1; var6 <= var1.length(); var6++) {
         float var7 = (float)var3.getGlyphPosition(var6 - 1).getX();
         float var8 = (float)var3.getGlyphPosition(var6).getX();
         var5 += Math.round(var8 - var7);
         if (var5 > var4) {
            return var6 - 1;
         }
      }

      return var1.length();
   }

   public String c(String var1, int var2) {
      if (var1.isEmpty()) {
         return var1;
      }

      GlyphVector var3 = this.e.createGlyphVector(a, var1);
      float var4 = var2 * 2.0F;
      float[] var5 = new float[var1.length() + 1];
      var5[0] = 0.0F;

      for (int var6 = 1; var6 <= var1.length(); var6++) {
         float var7 = (float)var3.getGlyphPosition(var6 - 1).getX();
         float var8 = (float)var3.getGlyphPosition(var6).getX();
         var5[var6] = var5[var6 - 1] + Math.round(var8 - var7);
      }

      float var9 = var5[var1.length()];
      if (var9 <= var4) {
         return var1;
      }

      for (int var10 = 1; var10 < var1.length(); var10++) {
         float var11 = var9 - var5[var10];
         if (var11 <= var4) {
            return var1.substring(var10);
         }
      }

      return "";
   }

   @FunctionalInterface
   public interface GlyphPredicate {
      boolean a(int var1, char var2);
   }
}
