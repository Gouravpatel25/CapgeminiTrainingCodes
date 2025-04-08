package Algorithms;

public class checkNumberwithEvenNumbers {
	
	public static boolean checkEvenCount(int n) {
		String s=String.valueOf(n);
		
		if(s.length() % 2 == 0) {
			return true;
		}
		
		return false;
	}
	
	public static int checkDigit(int[] arr) {
		int count=0;
		
		for(int i=0; i<arr.length; i++) {
			if(checkEvenCount(arr[i])) {
				count++;
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {12,343,2,6,7896};
		//int[] arr= {555,190,482,1771};
		
		System.out.println("Numbers with even no. of digits in array are: "+checkDigit(arr));
	}

}
