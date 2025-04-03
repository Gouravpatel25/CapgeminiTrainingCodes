package Algorithms;

public class SumArray {
	
	public static void sumArray(int[] arr) {
		int sum=0;
		int[] arr2=new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			arr2[i]=sum;
		}
		
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,2,3,4};
		
		sumArray(arr);
	}

}
