package capgeminiPackage;

import java.util.Scanner;

public class FactorialOfNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int fact=1;
		
		for(int i=n; i>=1; i--) {
			fact *=i;
		}
		
		System.out.println(fact);
	}
}
