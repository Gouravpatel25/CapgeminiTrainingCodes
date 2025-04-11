package Algorithms;

import java.util.Scanner;

public class RemoveConsecutiveDuplicates {
	
	public static String removeConsecutive(String s) {
		StringBuilder ss=new StringBuilder();
		ss.append(s.charAt(0));
		for(int i=1; i<s.length(); i++) {
			if(s.charAt(i)!=s.charAt(i-1)) {
				ss.append(s.charAt(i));
			}
			
		}
		
		return ss.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		sc.nextLine();
		
		String s=String.valueOf(n);
		
		System.out.println(removeConsecutive(s));

	}

}
