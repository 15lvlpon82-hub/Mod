package pulse;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import meteordevelopment.orbit.EventBus;

public final class EventBusService {
   public static final EventBus EVENT_BUS = new EventBus();

   private EventBusService() {
   }

   static {
      EVENT_BUS.registerLambdaFactory("pulse", EventBusService::createLookup);
   }

   private static Lookup createLookup(Method privateLookupInMethod, Class<?> targetClass) throws InvocationTargetException, IllegalAccessException {
      return (Lookup)privateLookupInMethod.invoke(null, targetClass, MethodHandles.lookup());
   }
}

