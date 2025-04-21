package Inheritance;

public class DriverClass {
	public static void main(String[] args) {
		
		Animal animal=new Animal();
		Dog b=new Dog();
		
		System.out.println(animal.a);
		System.out.println(animal.y);
		animal.methodOfParent();
		animal.methodOfParent2();
		//animal.methodOfChild(); || gives compile time error as animal is parent class 
		//and cannot access child class methods directly without downcasting.
		
		System.out.println(b.x);
		System.out.println(b.a);
		b.methodOfChild();
		b.methodOfChild2();
		b.methodOfParent();
		b.methodOfParent2();
	}
}
