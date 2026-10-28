package meteordevelopment.orbit;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Function;
import meteordevelopment.orbit.listeners.IListener;
import meteordevelopment.orbit.listeners.LambdaListener;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EventBus implements IEventBus {
   private static final Logger LOGGER = LogManager.getLogger("Pulse");
   private final Map<Object, List<IListener>> listenerCache = new ConcurrentHashMap<>();
   private final Map<Class<?>, List<IListener>> staticListenerCache = new ConcurrentHashMap<>();
   private final Map<Class<?>, List<IListener>> listenerMap = new ConcurrentHashMap<>();
   private final List<EventBus.LambdaFactoryInfo> lambdaFactoryInfos = new ArrayList<>();

   @Override
   public void registerLambdaFactory(String var1, LambdaListener.Factory var2) {
      synchronized (this.lambdaFactoryInfos) {
         this.lambdaFactoryInfos.add(new EventBus.LambdaFactoryInfo(var1, var2));
      }
   }

   @Override
   public boolean isListening(Class<?> var1) {
      List<IListener> var2 = this.listenerMap.get(var1);
      return var2 != null && !var2.isEmpty();
   }

   @Override
   public <T> T post(T var1) {
      List<IListener> var2 = this.listenerMap.get(var1.getClass());
      if (var2 != null) {
         for (IListener var4 : var2) {
            try {
               var4.call(var1);
            } catch (Throwable var5) {
               LOGGER.error("Pulse event handler failed for {}", var1.getClass().getName(), var5);
            }
         }
      }

      return (T)var1;
   }

   @Override
   public <T extends ICancellable> T post(T var1) {
      List<IListener> var2 = this.listenerMap.get(var1.getClass());
      if (var2 != null) {
         var1.setCancelled(false);

         for (IListener var4 : var2) {
            try {
               var4.call(var1);
            } catch (Throwable var5) {
               LOGGER.error("Pulse event handler failed for {}", var1.getClass().getName(), var5);
            }

            if (var1.isCancelled()) {
               break;
            }
         }
      }

      return (T)var1;
   }

   @Override
   public void subscribe(Object var1) {
      this.subscribe(this.getListeners(var1.getClass(), var1), false);
   }

   @Override
   public void subscribe(Class<?> var1) {
      this.subscribe(this.getListeners(var1, null), true);
   }

   @Override
   public void subscribe(IListener var1) {
      this.subscribe(var1, false);
   }

   private void subscribe(List<IListener> var1, boolean var2) {
      for (IListener var4 : var1) {
         this.subscribe(var4, var2);
      }
   }

   private void subscribe(IListener var1, boolean var2) {
      if (var2) {
         if (var1.isStatic()) {
            this.insert(this.listenerMap.computeIfAbsent(var1.getTarget(), var0 -> new CopyOnWriteArrayList<>()), var1);
         }
      } else {
         this.insert(this.listenerMap.computeIfAbsent(var1.getTarget(), var0 -> new CopyOnWriteArrayList<>()), var1);
      }
   }

   private void insert(List<IListener> var1, IListener var2) {
      int var3 = 0;

      while (var3 < var1.size() && var2.getPriority() <= ((IListener)var1.get(var3)).getPriority()) {
         var3++;
      }

      var1.add(var3, var2);
   }

   @Override
   public void unsubscribe(Object var1) {
      this.unsubscribe(this.getListeners(var1.getClass(), var1), false);
   }

   @Override
   public void unsubscribe(Class<?> var1) {
      this.unsubscribe(this.getListeners(var1, null), true);
   }

   @Override
   public void unsubscribe(IListener var1) {
      this.unsubscribe(var1, false);
   }

   private void unsubscribe(List<IListener> var1, boolean var2) {
      for (IListener var4 : var1) {
         this.unsubscribe(var4, var2);
      }
   }

   private void unsubscribe(IListener var1, boolean var2) {
      List var3 = this.listenerMap.get(var1.getTarget());
      if (var3 != null) {
         if (var2) {
            if (var1.isStatic()) {
               var3.remove(var1);
            }
         } else {
            var3.remove(var1);
         }
      }
   }

   private List<IListener> getListeners(Class<?> var1, Object var2) {
      Function var3 = var3x -> {
         CopyOnWriteArrayList var4 = new CopyOnWriteArrayList();
         this.getListeners(var4, var1, var2);
         return var4;
      };
      if (var2 == null) {
         return this.staticListenerCache.computeIfAbsent(var1, var3);
      }

      for (Object var5 : this.listenerCache.keySet()) {
         if (var5 == var2) {
            return this.listenerCache.get(var2);
         }
      }

      List var6 = (List)var3.apply(var2);
      this.listenerCache.put(var2, var6);
      return var6;
   }

   private void getListeners(List<IListener> var1, Class<?> var2, Object var3) {
      for (Method var7 : var2.getDeclaredMethods()) {
         if (this.isValid(var7)) {
            var1.add(new LambdaListener(this.getLambdaFactory(var2), var2, var3, var7));
         }
      }

      if (var2.getSuperclass() != null) {
         this.getListeners(var1, var2.getSuperclass(), var3);
      }
   }

   private boolean isValid(Method var1) {
      if (!var1.isAnnotationPresent(EventHandler.class)) {
         return false;
      } else if (var1.getReturnType() != void.class) {
         return false;
      } else {
         return var1.getParameterCount() != 1 ? false : !var1.getParameters()[0].getType().isPrimitive();
      }
   }

   private LambdaListener.Factory getLambdaFactory(Class<?> var1) {
      synchronized (this.lambdaFactoryInfos) {
         for (EventBus.LambdaFactoryInfo var4 : this.lambdaFactoryInfos) {
            if (var1.getName().startsWith(var4.packagePrefix)) {
               return var4.factory;
            }
         }
      }

      throw new NoLambdaFactoryException(var1);
   }

   private static class LambdaFactoryInfo {
      public final String packagePrefix;
      public final LambdaListener.Factory factory;

      public LambdaFactoryInfo(String var1, LambdaListener.Factory var2) {
         this.packagePrefix = var1;
         this.factory = var2;
      }
   }
}
