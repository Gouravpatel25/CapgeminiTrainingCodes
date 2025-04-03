package ArrayPackage;

import java.util.Arrays;

public class BinarySearch {
	
	public static int binarySearch(int[] arr,int target) {
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int left=0,right=arr.length-1;
		
		while(left<=right) {
			int mid=(left+right)/2;
			
			if(arr[mid]==target) {
				return mid;
			}
			
			else if(arr[mid]<target) {
				left =mid+1;
			}
			
			else {
				right=mid-1;
			}
		}
		
		return -1;
	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {25,58,63,947,44,21,20,64,218};
		int target=64;
		System.out.println(binarySearch(arr,target));
		}
	}


