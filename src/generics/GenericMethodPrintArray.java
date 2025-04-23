package generics;

public class GenericMethodPrintArray {
	static public <T> void printArray(T a[])
	{
		for(T i:a)
		{
			System.out.println(i+"\t");
		}

	}

	public static void main(String[] args) {
		Double a[]= {1.6,2.3,5.7,2.6222};
		printArray(a);
	}
}
