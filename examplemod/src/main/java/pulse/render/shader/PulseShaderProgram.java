package pulse;

import com.google.common.collect.Maps;
import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import java.nio.FloatBuffer;
import java.util.Map;
import net.minecraft.client.MinecraftClient;
import org.joml.Matrix4f;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL30;
import ru.pulse.Pulse;

public class PulseShaderProgram {
   private static final int a = 0;
   private static final int b = 1;
   private final int c;
   private boolean d = true;
   private static int e = -1;
   private static int f = -1;
   private static final FloatBuffer g = BufferUtils.createFloatBuffer(16);
   private final Map<String, Integer> h = Maps.newLinkedHashMap();

   public PulseShaderProgram() {
      this.c = GL30.glCreateProgram();
   }

   public int a() {
      return this.c;
   }

   public boolean b() {
      return this.d;
   }

   public void a(String var1, int var2) {
      int var3 = GL30.glCreateShader(var2);
      GL30.glShaderSource(var3, var1);
      GL30.glCompileShader(var3);
      int var4 = GL30.glGetShaderi(var3, 35713);
      if (var4 == 0) {
         Pulse.getLOGGER().error("Shader {} compile error: \n{}", var3, GL30.glGetShaderInfoLog(var3));
         this.d = false;
      } else {
         GL30.glAttachShader(this.c, var3);
      }
   }

   public void c() {
      GL30.glBindAttribLocation(this.c, 0, "Position");
      GL30.glBindAttribLocation(this.c, 1, "UV0");
      GL30.glLinkProgram(this.c);
      int var1 = GL30.glGetProgrami(this.c, 35714);
      if (var1 == 0) {
         Pulse.getLOGGER().error("Program {} link error: \n{}", this.c, GL30.glGetProgramInfoLog(this.c));
         this.d = false;
      }
   }

   public void d() {
      if (this.d) {
         GL30.glUseProgram(this.c);
         Matrix4f var1 = RenderSystem.getProjectionMatrix();
         Matrix4f var2 = RenderSystem.getModelViewMatrix();
         g.clear();
         var1.get(g);
         g.rewind();
         int var3 = this.a("ProjMat");
         if (var3 != -1) {
            GL30.glUniformMatrix4fv(var3, false, g);
         }

         g.clear();
         var2.get(g);
         g.rewind();
         int var4 = this.a("ModelViewMat");
         if (var4 != -1) {
            GL30.glUniformMatrix4fv(var4, false, g);
         }

         MinecraftClient var5 = MinecraftClient.getInstance();
         this.a("resolution", (float)var5.getWindow().getScaledWidth(), (float)var5.getWindow().getScaledHeight());
      }
   }

   public void e() {
      GL30.glUseProgram(0);
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
   }

   public static void a(float var0, float var1, float var2, float var3) {
      if (e == -1) {
         f();
      }

      float[] var4 = new float[]{
         var0,
         var1 + var3,
         0.0F,
         0.0F,
         1.0F,
         var0 + var2,
         var1 + var3,
         0.0F,
         1.0F,
         1.0F,
         var0 + var2,
         var1,
         0.0F,
         1.0F,
         0.0F,
         var0,
         var1 + var3,
         0.0F,
         0.0F,
         1.0F,
         var0 + var2,
         var1,
         0.0F,
         1.0F,
         0.0F,
         var0,
         var1,
         0.0F,
         0.0F,
         0.0F
      };
      int var5 = GL30.glGetInteger(34229);
      GL30.glBindVertexArray(e);
      GL30.glBindBuffer(34962, f);
      GL30.glBufferData(34962, var4, 35048);
      GL30.glDrawArrays(4, 0, 6);
      GL30.glBindVertexArray(var5);
   }

   public static void a(float[] var0, int var1) {
      if (e == -1) {
         f();
      }

      int var2 = GL30.glGetInteger(34229);
      GL30.glBindVertexArray(e);
      GL30.glBindBuffer(34962, f);
      GL30.glBufferData(34962, var0, 35048);
      GL30.glDrawArrays(4, 0, var1);
      GL30.glBindVertexArray(var2);
   }

   private static void f() {
      int var0 = GL30.glGetInteger(34229);
      e = GL30.glGenVertexArrays();
      f = GL30.glGenBuffers();
      GL30.glBindVertexArray(e);
      GL30.glBindBuffer(34962, f);
      byte var1 = 20;
      GL30.glEnableVertexAttribArray(0);
      GL30.glVertexAttribPointer(0, 3, 5126, false, var1, 0L);
      GL30.glEnableVertexAttribArray(1);
      GL30.glVertexAttribPointer(1, 2, 5126, false, var1, 12L);
      GL30.glBindVertexArray(var0);
   }

   public int a(String var1) {
      if (!this.h.containsKey(var1)) {
         this.h.put(var1, GL30.glGetUniformLocation(this.c, var1));
      }

      return this.h.get(var1);
   }

   public void a(String var1, float var2) {
      GL30.glUniform1f(this.a(var1), var2);
   }

   public void a(String var1, float var2, float var3) {
      GL30.glUniform2f(this.a(var1), var2, var3);
   }

   public void a(String var1, float var2, float var3, float var4) {
      GL30.glUniform3f(this.a(var1), var2, var3, var4);
   }

   public void a(String var1, float var2, float var3, float var4, float var5) {
      GL30.glUniform4f(this.a(var1), var2, var3, var4, var5);
   }

   public void a(String var1, Color var2) {
      GL30.glUniform4f(this.a(var1), var2.getRed() / 255.0F, var2.getGreen() / 255.0F, var2.getBlue() / 255.0F, var2.getAlpha() / 255.0F);
   }

   public void a(String var1, FloatBuffer var2) {
      GL30.glUniform1fv(this.a(var1), var2);
   }

   public void b(String var1, FloatBuffer var2) {
      RenderSystem.glUniform1(this.a(var1), var2);
   }

   public void b(String var1, int var2) {
      GL30.glUniform1i(this.a(var1), var2);
   }

   public void a(String var1, int var2, int var3) {
      GL30.glUniform2i(this.a(var1), var2, var3);
   }

   public void a(String var1, int var2, int var3, int var4) {
      GL30.glUniform3i(this.a(var1), var2, var3, var4);
   }

   public void a(String var1, int var2, int var3, int var4, int var5) {
      GL30.glUniform4i(this.a(var1), var2, var3, var4, var5);
   }

   public void c(String var1, FloatBuffer var2) {
      GL30.glUniformMatrix4fv(this.a(var1), false, var2);
   }

   public void a(String var1, float[] var2) {
      GL30.glUniformMatrix4fv(this.a(var1), false, var2);
   }
}
