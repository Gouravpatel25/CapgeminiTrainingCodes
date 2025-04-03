package ArrayPackage;

public class SymmetricArray {
	
	public static boolean transposeOfMatrix(int[][] arr) {
		
		int[][] transposed=new int[arr.length][arr[0].length];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				transposed[j][i]=arr[i][j];
			}
		}
		
		for(int i=0;i<transposed.length;i++) {
			for(int j=0;j<transposed[0].length;j++) {
				if(transposed[i][j]!=arr[i][j]) {
					return false;
				}
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr= {
				{1,2,3},
				{2,4,5},
				{3,5,6}
		};

		System.out.println(transposeOfMatrix(arr));
	}

}
