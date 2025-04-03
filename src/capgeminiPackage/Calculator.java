package capgeminiPackage;

public class Calculator {
	
	public void substract(int a,int b) {
		System.out.println(a-b);
	}
	public void substract(int a,int b,int c) {
		System.out.println(a-b-c);
	}
	
	public void multiply(int a,int b) {
		System.out.println(a*b);
	}
	
	public void multiply(int a,int b,int c) {
		System.out.println(a*b*c);
	}
	
	public void substract1(int a,char b) {
		System.out.println(a-b);
	}
	
	public void substract(int a,char b) {
		System.out.println(a*b);
	}
	
	public static void main(String[] args) {		
		Calculator c=new Calculator();
		
		c.substract(7,4);
		c.substract(9,5,2);
		c.multiply(0,5);
		c.multiply(1,5,2);
		c.substract(999,'a');
		c.multiply(1,'a');
	}
}
