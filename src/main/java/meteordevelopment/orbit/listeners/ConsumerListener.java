package meteordevelopment.orbit.listeners;

import java.util.function.Consumer;

public class ConsumerListener<T> implements IListener {
   private final Class<T> target;
   private final int priority;
   private final Consumer<T> executor;

   public ConsumerListener(Class<T> var1, int var2, Consumer<T> var3) {
      this.target = var1;
      this.priority = var2;
      this.executor = var3;
   }

   public ConsumerListener(Class<T> var1, Consumer<T> var2) {
      this(var1, 0, var2);
   }

   @Override
   public void call(Object var1) {
      this.executor.accept((T)var1);
   }

   @Override
   public Class<T> getTarget() {
      return this.target;
   }

   @Override
   public int getPriority() {
      return this.priority;
   }

   @Override
   public boolean isStatic() {
      return false;
   }
}
