package Abstraction;

public class DriverForCalci {
	public static void main(String[] args) {
		Calci1Imple e1=new Calci1Imple();
		
		System.out.println("Addition"+e1.add(2, 8));
		System.out.println("Sub"+e1.sub(2, 8));
		System.out.println("Power"+e1.power(2, 8));
		
		System.out.println("===================");
		
		Calci2Imple e2=new Calci2Imple();
		System.out.println("Addition"+e2.add(2, 8));
		System.out.println("SUb"+e2.sub(2, 8));
		System.out.println("Square"+e2.square(2));
		System.out.println("Cube"+e2.cube(2));
	}
}
