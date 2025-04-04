package exceptionHandling;

import java.util.Scanner;

public class AgeChecker {
	
	public static void checkAge(int n) {
		if(n>=21) {
			System.out.println("U can marry....congosss");
		}
		
		else {
			//throw new InvalidAge(); //custom exception is being thrown.
			throw new InvalidAge("Wait guys,dont hurry!!");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner  sc=new Scanner(System.in);
		System.out.println("Enter the age");
		int age=sc.nextInt();
		checkAge(age);
	}

}
