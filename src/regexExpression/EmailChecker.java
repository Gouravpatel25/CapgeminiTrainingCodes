package regexExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailChecker {
	public static void main(String[] args) {
		
		String email="gouravpatel2003@gmail.com";
		String regex="^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
		
		Pattern pattern = Pattern.compile(regex);
		
		Matcher matcher = pattern.matcher(email);
		
		boolean res = matcher.matches();
		if(res) {
			System.out.println("Email is valid");
		}
		
		else {
			System.out.println("email not valid");
		}
		
	}
}
