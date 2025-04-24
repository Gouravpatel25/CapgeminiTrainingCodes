package relfectionAPI;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodDriver1 {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, InvocationTargetException {
		Class<Person> p= Person.class;

		//return all the public methods of same and super class as array
		Method[] all_methods=p.getMethods();
		for(Method method:all_methods) {
			System.out.println(method);
		}

		System.out.println("==========================================");
		//return the methods at all level (public/private/protected) of same class as array
		Method[] all_methods2=p.getDeclaredMethods();
		for(Method method:all_methods2) {
			System.out.println(method);
		}


		System.out.println("=====================================================");
		Class<Object> p2=(Class<Object>) p.getSuperclass();   //helps the person class to access its superclass(Object Class) methods
		Method[] object_class_all_methods = p2.getDeclaredMethods();
		for(Method method:object_class_all_methods) {
			System.out.println(method);


			System.out.println("===============================================");
			Method m1 = p.getMethod("getDetails");  //to get public method with name getDetails
			System.out.println(m1);

			System.out.println("===============================================");
			Method m2 = p.getDeclaredMethod("getDetails");  //to get private or public  method with name getDetails
			System.out.println(m2);


			System.out.println("=======================================");
			Method m3 = p.getDeclaredMethod("task", String.class);
			m3.invoke(null, "Training");
			System.out.println(m3);


		}
	}
}
