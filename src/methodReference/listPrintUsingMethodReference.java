package methodReference;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class listPrintUsingMethodReference {
	
	public static void main(String[] args) {
		List<Integer> list= Arrays.asList(1,0,2,3,5,4,2);
		
		//list.forEach( s -> System.out.println(s)); // Printing using lambda expression
		
		list.forEach(System.out :: println);
		
		// Collections.sort(list);  // traditonal sorting method
		
		
		Collections.sort(list, Integer :: compareTo); //Sorting using Method Reference
		
		list.forEach(System.out :: print);
	}
	
}
