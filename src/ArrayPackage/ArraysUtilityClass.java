package ArrayPackage;

import java.util.Arrays;

public class ArraysUtilityClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,53,89,56,24};
		int[] arr2=Arrays.copyOf(arr, 10);
		
		System.out.println(Arrays.toString(arr2));
		//for each loop
		
		int[] arr3=Arrays.copyOfRange(arr2, 1, 6);
		System.out.print(Arrays.toString(arr3));
		System.out.println();
		System.out.println(Arrays.binarySearch(arr, 24));
		
	}

}

