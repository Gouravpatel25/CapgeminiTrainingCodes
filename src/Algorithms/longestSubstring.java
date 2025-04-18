package Algorithms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class longestSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {100,4,200,1,3,2};
		
		Arrays.sort(arr);
		
		LinkedHashSet<Integer> set= new LinkedHashSet();
		
		for(int i:arr) {
			set.add(i);
		}
	
		
		int j=0;
		for(int i:set) {
			arr[j++]=i;
		}
		
		int count=1;
		int maxL=1;
		
		for(int i=1; i<set.size(); i++) {
			if(arr[i]==arr[i-1]) {
				continue;
			}
			
			else if(arr[i]==arr[i-1]+1) {
				count++;
			}
			else {
				count=1;
			}
		
			maxL=Math.max(maxL, count);
		}
		
		System.out.println(maxL);
	}

}
