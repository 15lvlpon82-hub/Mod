package pulse;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;

public class ShaderRegistry {
   private final Map<String, PulseShaderProgram> programs = Maps.newLinkedHashMap();

   public void register(String name, PulseShaderProgram program) {
      this.programs.put(name, program);
   }

   public void replace(String name, PulseShaderProgram program) {
      this.programs.replace(name, program);
   }

   public Optional<PulseShaderProgram> find(String name) {
      return Optional.ofNullable(this.programs.get(name));
   }
}
