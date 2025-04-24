package relfectionAPI;

import java.lang.reflect.Constructor;

public class Driver1 {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException {
		
		//To get the class Object 
		Class<Person> c= Person.class; // 1st way
		
		Class<Person> c2=(Class<Person>) new Person("Dinga",30).getClass();	//2nd way
		
		Class<Person> c3=(Class<Person>) Class.forName("relfectionAPI.Person"); //3rd way
		
		
		//getting specified constructor
		Constructor<Person> cons=c.getDeclaredConstructor();
		System.out.println(cons);
		
		Constructor<Person> cons2=c.getDeclaredConstructor(String.class, int.class);
		System.out.println(cons2);
		
		System.out.println("===============================================");
		
		//get All constructor even if it is public / private
		Constructor<?>[] all_cons=c.getDeclaredConstructors();
		for(Constructor<?> constructor : all_cons) {
			System.out.println(constructor);
		}
		
		
		//gets all the constrcutors which are public 
		System.out.println("============================================");
		Constructor<?>[] all_cons2=c.getConstructors();
		for(Constructor<?> constructor : all_cons2) {
			System.out.println(constructor);
		}
	}
}
