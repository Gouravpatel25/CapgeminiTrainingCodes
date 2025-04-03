package ArrayPackage;

import java.util.Scanner;

public class CeilOfANumber {
	
	public static void searchTheNo(int[] arr,int target) {
		int left=0,right=arr.length-1;
		int index=0;
		
		while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                System.out.println(mid); 
                return;
            } 
            else if (arr[mid] < target) {
                left = mid + 1; 
            } 
            else { 
                index = mid; 
                right = mid - 1;
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

/* 
  \\One more Approch
  	int left=0,right=arr.length-1;
		int index=0;
		
		while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] > target) {
               right=mid-1;
            } 
            else if (arr[mid] < target) {
                left = mid + 1; 
            } 
            else { 
               return mid;
            }
        }
        
        return left;
 */
 
