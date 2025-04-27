package annotations;

import java.lang.reflect.Field;

@customAnnotations2(10)
public class DriverCustomAnnotations2 {
	 @customAnnotations2(value2 = "Age field")
	    int age;

	    public static void main(String[] args) {
	        try {
	            // Access the class annotation
	            Class<DriverCustomAnnotations2> obj = DriverCustomAnnotations2.class;
	            
	            // Check if the class has the annotation
	            if (obj.isAnnotationPresent(customAnnotations2.class)) {
	                customAnnotations2 ca = obj.getAnnotation(customAnnotations2.class);
	                System.out.println("Class Annotation -> value: " + ca.value() + ", value2: " + ca.value2());
	            }
	            
	            // Access the field annotation
	            Field field = obj.getDeclaredField("age");
	            if (field.isAnnotationPresent(customAnnotations2.class)) {
	                customAnnotations2 caField = field.getAnnotation(customAnnotations2.class);
	                System.out.println("Field Annotation -> value: " + caField.value() + ", value2: " + caField.value2());
	            }
	            
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}

