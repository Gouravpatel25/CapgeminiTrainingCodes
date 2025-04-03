package capgeminiPackage;

import java.util.Scanner;

public class PositiveOrNegative {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		/*
		if(n<0) 
			System.out.println("Negative No");
	
		else {
			System.out.println("Pos No");
		}
		*/
		
		if(n%2 == 0) {
			System.out.println("Even No");
		}
		
		else {
			System.out.println("Odd No");
		}
	}
	
}
