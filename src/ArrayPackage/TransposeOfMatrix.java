package ArrayPackage;

public class TransposeOfMatrix {

	public static void transposeOfMatrix(int[][] arr) {
	
		int[][] arr2=new int[arr.length][arr[0].length];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				arr2[j][i]=arr[i][j];
			}
		}
		
		
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[0].length;j++) {
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}

	
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};

		transposeOfMatrix(arr);
	}

}

