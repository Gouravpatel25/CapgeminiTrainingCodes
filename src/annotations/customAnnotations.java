package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE , ElementType.FIELD})
@Retention(RetentionPolicy.SOURCE)
public @interface customAnnotations {
	
	int value() default 0;
	String value2() default "Hello";
}
