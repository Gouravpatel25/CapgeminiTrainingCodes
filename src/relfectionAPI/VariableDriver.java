package relfectionAPI;

import java.lang.reflect.Field;

public class VariableDriver {
	public static void main(String[] args) throws NoSuchFieldException, SecurityException {
		Class<Person> c = Person.class;
		
		//get all variables
		Field[] all_varc = c.getDeclaredFields();
		for(Field field:all_varc) {
			System.out.println(field);
		}
		
		System.out.println("========================================================");
		//get specified variables
		Field f= c.getDeclaredField("age");
		System.out.println(f);
	}
}
