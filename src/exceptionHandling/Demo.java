package exceptionHandling;


public class Demo {
	public static int m1() {
		try {
			return 1;
		}

		catch(Exception e) {
			return 2;
		}
		
		finally {
			return 3; //finally block will always gets executed no matter 
			         //whatever happens in try and catch block.
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println(m1());
	}
}
