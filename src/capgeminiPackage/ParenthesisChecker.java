package capgeminiPackage;

import java.util.*;

public class ParenthesisChecker {
	
	public static boolean isBalanced(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '[' || c == '{') {
                st.push(c);
            } else {
                if (st.isEmpty()) {
                    return false;
                }

                char top = st.pop();

                if ((c == ')' && top != '(') ||
                    (c == ']' && top != '[') ||
                    (c == '}' && top != '{')) {
                    return false;
                }
            }
        }

        return st.isEmpty();
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String expression = "{[()]}";
		 //String expression = "{";
        if (isBalanced(expression)) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }	

	}

}
