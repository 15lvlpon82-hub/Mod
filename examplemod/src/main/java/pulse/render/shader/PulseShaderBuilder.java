package pulse;

import java.io.InputStream;
import ru.pulse.Pulse;

public class PulseShaderBuilder {
   private final PulseShaderProgram program = new PulseShaderProgram();

   private PulseShaderBuilder() {
   }

   public static PulseShaderBuilder create() {
      return new PulseShaderBuilder();
   }

   public PulseShaderBuilder attach(String path, Stage stage) {
      InputStream stream = this.getClass().getResourceAsStream("/assets/pulse/shaders/".concat(path));
      if (stream == null) {
         Pulse.getLOGGER().error("Shader file not found: /assets/pulse/shaders/{}", path);
         return this;
      }

      this.program.a(ResourceTextReader.a(stream), stage.glType());
      return this;
   }

   public PulseShaderBuilder link() {
      this.program.c();
      return this;
   }

   public PulseShaderProgram build() {
      return this.program;
   }

   public enum Stage {
      VERTEX(35633),
      FRAGMENT(35632);

      private final int glType;

      public int glType() {
         return this.glType;
      }

      Stage(int glType) {
         this.glType = glType;
      }
   }
}
