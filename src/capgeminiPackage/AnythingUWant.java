package capgeminiPackage;

import java.util.Scanner;

public class AnythingUWant {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int moneyGiven=sc.nextInt();
		
		if(moneyGiven >= 40) {
			System.out.println("Vanilla icecream given");
			// moneyGiven -=40;
		}
		
		else {
			System.out.println("Icecream not given");
		}
	}
}
