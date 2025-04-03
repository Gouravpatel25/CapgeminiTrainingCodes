package capgeminiPackage;

public class FibonacciSeries {
	public static void main(String[] args) {
		int n=8;
		
		int a=0,b=1,c=0;
		
		System.out.print(a +" "+b+" ");
		for(int i=2;i<=n;i++) {
			a=b;
			b=c;
			c=a+b;
			System.out.print(c+" ");
		}
	}
}
