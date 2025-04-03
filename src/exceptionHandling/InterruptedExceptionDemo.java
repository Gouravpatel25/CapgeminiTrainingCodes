package exceptionHandling;


public class InterruptedExceptionDemo {

	public static void printNumber() throws InterruptedException{
		for(int i=0;i<10;i++) {
			System.out.println(i);
			Thread.sleep(2000);
		}
	}
	
	public static void demo2() throws InterruptedException{ 
		printNumber();
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		demo2();

	}

}
