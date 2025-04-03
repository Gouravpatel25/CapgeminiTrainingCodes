package ArrayPackage;

public class EvenNo2DArraySum {
	
	public static void sumOfEvenNo(int[][] arr) {
		int sum=0;

		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(arr[i][j]% 2== 0) {
					sum += arr[i][j];
				}
			}
		}
		
		System.out.println("Sum of even no is "+sum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr= {
				{1,2,3},
				{4,5,6}	
		};
		
		sumOfEvenNo(arr);
	}

}
