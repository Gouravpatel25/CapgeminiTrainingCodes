package exceptionHandling;

public class InterruptedExceptionUsingTryCatch {

	public static void printNumber() {

		try {
			for(int i=0;i<10;i++) {
				System.out.println(i);
				Thread.sleep(2000);
			}
		}
		catch( InterruptedException e) {
			System.out.println(" InterruptedException occured");
			e.printStackTrace();
		}
	}

	public static void demo2() { 
		printNumber();
	}
	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		demo2();

	}
}
