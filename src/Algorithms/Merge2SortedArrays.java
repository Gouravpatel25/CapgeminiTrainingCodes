package Algorithms;

import java.util.TreeSet;

public class Merge2SortedArrays {
	
	public static void mergeArrays(int[] arr1,int[] arr2) {
		
		TreeSet<Integer> set=new TreeSet();
		
		for(int i:arr1) {
			set.add(i);
		}
		
		for(int i:arr2) {
			set.add(i);
		}
		
			System.out.println(set);
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1= {1,9,5};
		int[] arr2= {2,3,6,8};
		
		mergeArrays(arr1,arr2);
	}

}
