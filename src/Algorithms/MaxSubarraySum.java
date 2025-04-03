package Algorithms;

public class MaxSubarraySum {
	
	public static void maxSubArraySum(int[] arr) {
		int sum = 0, maxSum = Integer.MIN_VALUE;
		
		for (int right = 0; right < arr.length; right++) {
			sum += arr[right];  
			maxSum = Math.max(maxSum, sum);
			
			
			if (sum < 0) {
				sum = 0;
			}
		}
		
		System.out.println(maxSum);
	}
	
	public static void main(String[] args) {
		int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		maxSubArraySum(arr);
	}
}
