package ArrayPackage;

import java.lang.reflect.Array;

public class MaxElement2DArray {
	
	public static void methodArray(int[][] arr) {
		int max2=Integer.MIN_VALUE;
		int max2rowindex=0;

		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(arr[i][j]>max2) {
					max2=arr[i][j];
					max2rowindex=i;
				}
			}
		}


		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(i==max2rowindex) {
					System.out.print(arr[i][j]+" ");
				}
			}

		}
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr= {
				{1,1,5},
				{5,9,448},
				{6,77,9},
		};
		int max=Integer.MIN_VALUE;
		
		for(int[] i:arr) {
			for(int j:i) {
				max=Math.max(j, max);
			}
		}
		
		System.out.println("Max is "+max);
		
		methodArray(arr);
	}

}
