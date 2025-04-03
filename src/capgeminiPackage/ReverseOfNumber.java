package capgeminiPackage;

public class ReverseOfNumber {
	
	public static boolean palindromeNo(int n) {
		int temp=n;
		int s=0;
		
		while(temp !=0) {
			int rem=temp%10;
			s=s*10+rem;
			temp /=10;
		}
		
		if(s==n) {
			return true;
		}
		
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		int n=1211;
		
		System.out.println(palindromeNo(n));
	}
}
