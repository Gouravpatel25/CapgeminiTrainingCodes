package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Define custom annotation
@Target({ElementType.TYPE , ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface customAnnotations2 {
	
	int value() default 0;
	String value2() default "Hello";
}


