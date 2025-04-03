package capgeminiPackage;

import java.util.Scanner;

public class AmstrongNo {
	
	public static void amstrongNo(int n) {
		int temp=n,digits=0;
		
		while(temp!=0) {
			digits++;
			temp /=10;
		}
		
		temp=n;
		int s=0;
		
		while(temp!=0) {
			int rem=temp%10;
			s +=Math.pow(rem, digits);
			temp /=10;
		}
		
		if(s==n) {
			System.out.println("Amstrong No");
		}
		
		else {
			System.out.println("not amstrong no");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		amstrongNo(n);
	}

}
