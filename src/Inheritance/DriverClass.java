package Inheritance;

public class DriverClass {
	public static void main(String[] args) {
		
		Animal animal=new Animal();
		Dog b=new Dog();
		
		System.out.println(animal.a);
		System.out.println(animal.y);
		animal.methodOfParent();
		animal.methodOfParent2();
		
		
		System.out.println(b.x);
		System.out.println(b.a);
		b.methodOfChild();
		b.methodOfChild2();
		b.methodOfParent();
		
	}
}
