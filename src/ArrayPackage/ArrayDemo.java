package ArrayPackage;

import java.util.Scanner;

public class ArrayDemo {
	
	public static void createArray() {
		
		System.out.println("Enter the size");
		int n=sc.nextInt();
		int[] arr=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		createArray();
	}

}
