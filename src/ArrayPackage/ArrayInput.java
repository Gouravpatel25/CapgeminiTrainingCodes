package ArrayPackage;

import java.util.Scanner;

public class ArrayInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();		int[] arr=new int[n];
	
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i:arr) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		System.out.println("reverse order is");
		for(int i=arr.length-1; i>=0; i--) {
			System.out.print((double) arr[i]+" ");
		}
	}

}
