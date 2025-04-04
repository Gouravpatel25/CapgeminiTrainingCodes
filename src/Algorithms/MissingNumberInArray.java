package Algorithms;

public class MissingNumberInArray {
	
	public static void checkMissing(int[] arr) {
		int miss=Integer.MIN_VALUE;
		int n=arr.length;
		
		int expectedSum=n*(n+1)/2;
		int currentSum=0;
		
		for(int i:arr) {
			currentSum+=i;
		}
		
		System.out.println("missing number is "+ (expectedSum-currentSum));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {9,6,4,2,3,5,7,0,1};
		
		checkMissing(arr);

	}

}
