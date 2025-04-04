package exceptionHandling;

import java.util.Scanner;

public class Atm {
	
	public static void checkMoneyAndPin(double money,int pin,int userpin) {
		if(money<0) {
			throw new InvalidMoney();
		}
		
		else if(pin!=userpin) {
			throw new InvalidPin();
		}
		
		else {
			System.out.println("Successfull transaction");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int userpin=2806;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amout ");
		double money=sc.nextDouble();
		
		System.out.println("Enter the pin");
		int pin=sc.nextInt();
		checkMoneyAndPin(money,pin,userpin);
	}

}
