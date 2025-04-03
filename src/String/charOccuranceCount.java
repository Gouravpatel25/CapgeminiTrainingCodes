package String;

import java.util.Scanner;

public class charOccuranceCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		int count=0;
		String s="aabca";
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==ch) {
				count++;
			}
		}
		
		System.out.println("The character "+ch+" occured in the string "+count+" times");
		sc.close();
	}

}
