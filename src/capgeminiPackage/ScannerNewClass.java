package capgeminiPackage;

import java.util.Scanner;

public class ScannerNewClass {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int a=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter string");
		String s=sc.nextLine();
		
		System.out.println(a+" "+s);
	}
}
