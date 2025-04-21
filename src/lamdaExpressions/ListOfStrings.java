package lamdaExpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListOfStrings {
	public static void main(String[] args) {
		 List<String> list = new ArrayList<>(List.of("Apple", "banana", "Cheery", "MANgo"));
		 Collections.sort(list); //ascending
		 System.out.println(1+" "+list);
		 
		 Collections.sort(list, (s1,s2) -> s2.compareTo(s1)); //descending
		 System.out.println(2+" "+list);
		 
		 Collections.sort(list, (s1,s2) -> s1.length()-s2.length()); //sorting based on length
		 System.out.println(3+" "+list);
	}
}
