package methodReference;

public class Driver {
	public static void main(String[] args) {
		
		Operation o=Calci::add; // Method reference for  static method
		int res=o.operate(10,20);
		System.out.println(res);
		
		/* 
		Operation o=new Calci()::add;  // Method reference for non static method
		int res=o.operate(10,20);
		System.out.println(res);
		*/
		
	}
}
