package Algorithms;

public class TwoDArraySum {
	
	public static void maxSumIn2DArray(int[][] arr) {
		
		int maxSum=0;
		
		for(int i=0; i<arr.length; i++) {
			
			int sum=0;
			
			for(int j=0; j<arr[0].length; j++) {
				sum+=arr[i][j];
			}
			
			maxSum=Math.max(maxSum, sum);
			
		}
		
		System.out.println("max sum among the rows is:"+maxSum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[][] arr= { {1,5},{7,3},{3,5}};
			int[][] arr2= { {1,2,3},{3,2,2}};
			maxSumIn2DArray(arr);
			maxSumIn2DArray(arr2);
	}

}
