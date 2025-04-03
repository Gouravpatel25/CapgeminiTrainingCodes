package ArrayPackage;

public class SumColumnRowWise {
		
	public static void sumOfColumn(int[][] arr) {
		//int sum=0;

		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=0;j<arr[0].length;j++) {
				sum += arr[i][j];

			}
			System.out.println("Sum of "+i+" row is "+ sum);
			
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr= {
				{1,2,3},
				{4,5,6}	
		};

		sumOfColumn(arr);
	}

}
