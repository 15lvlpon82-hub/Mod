package meteordevelopment.orbit;

public class NoLambdaFactoryException extends RuntimeException {
   public NoLambdaFactoryException(Class<?> var1) {
      super("No registered lambda listener for '" + var1.getName() + "'.");
   }
}
