package capgeminiPackage;

import java.util.Scanner;

public class CharacterCheck {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		char ch=sc.next().charAt(0);
		
		if(ch=='+') {
			System.out.println("add"+""+ (a+b));
		}
		
		else if(ch=='-') {
			System.out.println("sub"+ " "+(a-b));
		}
		
		else if(ch=='*') {
			System.out.println("mul"+" " +(a*b));
		}
		
		else  {
			System.out.println("div"+ " "+ (a/b));
		}
	}
}
