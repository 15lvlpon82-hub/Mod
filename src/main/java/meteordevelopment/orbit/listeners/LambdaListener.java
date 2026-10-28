package meteordevelopment.orbit.listeners;

import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.function.Consumer;
import meteordevelopment.orbit.EventHandler;

public class LambdaListener implements IListener {
   private static boolean isJava1dot8;
   private static Constructor<Lookup> lookupConstructor;
   private static Method privateLookupInMethod;
   private final Class<?> target;
   private final boolean isStatic;
   private final int priority;
   private Consumer<Object> executor;

   public LambdaListener(LambdaListener.Factory var1, Class<?> var2, Object var3, Method var4) {
      this.target = var4.getParameters()[0].getType();
      this.isStatic = Modifier.isStatic(var4.getModifiers());
      this.priority = var4.getAnnotation(EventHandler.class).priority();

      try {
         String var5 = var4.getName();
         Lookup var6;
         if (isJava1dot8) {
            boolean var7 = lookupConstructor.isAccessible();
            lookupConstructor.setAccessible(true);
            var6 = lookupConstructor.newInstance(var2);
            lookupConstructor.setAccessible(var7);
         } else {
            var6 = var1.create(privateLookupInMethod, var2);
         }

         MethodType var12 = MethodType.methodType(void.class, var4.getParameters()[0].getType());
         MethodHandle var8;
         MethodType var9;
         if (this.isStatic) {
            var8 = var6.findStatic(var2, var5, var12);
            var9 = MethodType.methodType(Consumer.class);
         } else {
            var8 = var6.findVirtual(var2, var5, var12);
            var9 = MethodType.methodType(Consumer.class, var2);
         }

         MethodHandle var10 = LambdaMetafactory.metafactory(var6, "accept", var9, MethodType.methodType(void.class, Object.class), var8, var12).getTarget();
         if (this.isStatic) {
            this.executor = (Consumer)var10.invoke();
         } else {
            this.executor = (Consumer)var10.invoke((Object)var3);
         }
      } catch (Throwable var11) {
         var11.printStackTrace();
      }
   }

   @Override
   public void call(Object var1) {
      this.executor.accept(var1);
   }

   @Override
   public Class<?> getTarget() {
      return this.target;
   }

   @Override
   public int getPriority() {
      return this.priority;
   }

   @Override
   public boolean isStatic() {
      return this.isStatic;
   }

   static {
      try {
         isJava1dot8 = System.getProperty("java.version").startsWith("1.8");
         if (isJava1dot8) {
            lookupConstructor = Lookup.class.getDeclaredConstructor(Class.class);
         } else {
            privateLookupInMethod = MethodHandles.class.getDeclaredMethod("privateLookupIn", Class.class, Lookup.class);
         }
      } catch (NoSuchMethodException var1) {
         var1.printStackTrace();
      }
   }

   public interface Factory {
      Lookup create(Method var1, Class<?> var2) throws InvocationTargetException, IllegalAccessException;
   }
}
