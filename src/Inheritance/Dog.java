package Inheritance;

public class Dog extends Animal{
	int b;
	static int x;
	
	void methodOfChild() {
		System.out.println("Method of child this side");
	}
	
	static void methodOfChild2() {
		System.out.println("Static Method of child");
	}
}
