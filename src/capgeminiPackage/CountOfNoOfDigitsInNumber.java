package capgeminiPackage;

// Product of the even and odd numbers present in
public class CountOfNoOfDigitsInNumber {
	public static void main(String[] args) {
		int n=167872;
		int temp=n;
		int countEven=0; 
		int countOdd=0;
		
		while(temp!=0) {
			int rem=temp%10;
			if(rem%2 ==0) {
				countEven++;
			}
			else {
				countOdd++;
			}
			temp /=10;
		}
		
		System.out.println("Product is "+(countEven*countOdd));
	}
}
