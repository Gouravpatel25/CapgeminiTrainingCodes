package capgeminiPackage;
import java.util.Scanner;

public class InputClass {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//int a=sc.nextInt();
		//double b=sc.nextDouble();
		//boolean b=sc.nextBoolean();
		
		char ch=sc.nextLine().charAt(0);
		System.out.println(ch);
		
		String s = sc.next();
		System.out.println(s);
		sc.nextLine();
		
		String s1=sc.nextLine();
		System.out.println(s1);
		}
}
