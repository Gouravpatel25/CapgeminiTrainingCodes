package Algorithms;

import java.util.Scanner;

public class linearSearch {

	public static int linear(int[] arr,int n) {
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==n) {
				return i;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int[] arr= {10,12,8,6,13,14};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the target value");
		int n=sc.nextInt();
		
		System.out.println("Target found at index:"+linear(arr,n));
	}

}
