package pulse;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface HudServiceInfo {
   boolean enabledByDefault() default true;
}
