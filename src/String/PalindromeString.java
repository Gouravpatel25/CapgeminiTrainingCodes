package String;

public class PalindromeString {
	
	public static String checkPalin(String s) {
		int left=0,right=s.length()-1;
		
		while(left<right) {
			if(s.charAt(left)!=s.charAt(right)) {
				return "Not a palindromic String";
			}
			
			left++;
			right--;
		}
		return "Palindromic String";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="bob";
		
		System.out.println(checkPalin(s));
	}

}
