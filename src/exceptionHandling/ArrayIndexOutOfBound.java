package exceptionHandling;
import java.lang.Exception;

public class ArrayIndexOutOfBound {
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,2,3,4,56,78};
		
		try {
			System.out.println(arr[90]);
			
			try {
				ArrayIndexOutOfBound a=new ArrayIndexOutOfBound();
				a=null;
				
				System.out.println(a);
			}
			
			catch(NullPointerException e) {
				e.printStackTrace();
				e.getMessage();
				System.out.println("Null Pointer exception has occured");
			}
		}
		
		catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index is out of bounds! Please check the array size.");
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println("============================================");
            try {
				ArrayIndexOutOfBound a=new ArrayIndexOutOfBound();
				a=null;
				
				System.out.println(a.getClass());
			}
			
			catch(NullPointerException e2) {
				e2.printStackTrace();
				e2.getMessage();
				System.out.println("Null Pointer exception has occured");
			}

	}


}
}

