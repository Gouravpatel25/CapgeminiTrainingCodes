package lamdaExpressions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		/*
		ArrayList<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		 */

		  List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5));
		list.forEach(element -> System.out.print(element+" ")); //Lamda Expression to print
		
		Collections.sort(list, (n1,n2) -> n2-n1); //Lamda Expression to sort in descending order
		System.out.println();
		list.forEach(r -> System.out.print(r+" "));
	};
}

