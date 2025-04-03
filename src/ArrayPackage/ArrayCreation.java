package ArrayPackage;

public class ArrayCreation {
	
	public static void main(String[] args) {
		byte[] arr=new byte[10];
		System.out.println(arr);
		
		float[] arr2=new float[5];
		System.out.println(arr2);
		
		char[] ch=new char[10];
		System.out.println(ch);
		
		int[] arr3=new int[4];
		arr3[0]=10;
		arr3[2]=20;
		
		for(int i:arr3) {
			System.out.print(i+" ");
		}
	}
}
