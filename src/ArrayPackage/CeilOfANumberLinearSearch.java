package ArrayPackage;

import java.util.Scanner;

public class CeilOfANumberLinearSearch {
	
	public static void searchTheNo(int[] arr,int target) {

		int index=0;

		for(int i=0;i<arr.length;i++) {

			if(arr[i]>=target) {
				index=i;
				break;
			}

		}
		
		System.out.println(index); 

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int target=sc.nextInt();
		int[] arr= {2,5,7,9,12,24,42};
		
		searchTheNo(arr,target);
	}

}
