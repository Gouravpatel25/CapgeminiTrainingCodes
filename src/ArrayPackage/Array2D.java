package ArrayPackage;

import java.util.Arrays;
import java.util.Scanner;

public class Array2D {
	
	public static void array2D(int r,int c,double[][] arr) {
		
		
		/*
		
			System.out.print("[");
			for(int j=0;j<c;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.print("]");
			System.out.println();
		}
		*/
		
		for(double[] a:arr) {
			System.out.print(Arrays.toString(a));
			System.out.println();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row");
		int row=sc.nextInt();
		
		System.out.println("enter col");
		int col=sc.nextInt();
		double[][] arr=new double[row][col];
		
		System.out.println("Enter elements");
		for(int i=0; i<row; i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]=sc.nextDouble();
			}
		}
		
		array2D(row,col,arr);

	}

}
