package relfectionAPI;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Driver2 {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		Class<Person> c= Person.class;
		
		Constructor<Person> cons=c.getDeclaredConstructor();  // c.getDeclaredConstructor(String.class, int.class)
		cons.setAccessible(true); 		//sets the private method as public
		Person p = cons.newInstance();  //creates object of the no arg. constructor
		System.out.println(p);
		
		
		Constructor<Person> conss=c.getDeclaredConstructor(String.class, int.class);
		Person p1 = cons.newInstance("dinga",10); //creates object of the parameterized constructor
		System.out.println(p1);
	}
}
