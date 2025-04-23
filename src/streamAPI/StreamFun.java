package streamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamFun {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(7, 5, 6, 8, 4, 5, 2, 3, 1);
		
		List<Integer> res=list.stream().skip(2).toList();
		System.out.println(res);
		
		List<Integer> res2=list.stream().limit(3).toList();
		System.out.println(res2);
		
		List<Integer> res3=list.stream().limit(4).skip(2).toList(); //puts limit and skips 
		System.out.println(res3);
		
		List<Integer> res4=list.stream().sorted().toList();  //sorts 
		System.out.println(res4);
		
		List<Integer> res5=list.stream().sorted(Comparator.reverseOrder()).toList();  //prints sorted list in reverse order
		System.out.println(res5);
		
		List<Integer> res6=list.stream().sorted(Comparator.reverseOrder()).distinct().toList();  //duplicates getting removed
		System.out.println(res6);
		
		List<Integer> res7=list.stream().filter(i -> i % 2 == 0).toList();
		System.out.println(res7);
		
		List<Integer> res8=list.stream().filter(i -> i > 3).toList();
		System.out.println(res8);
		
		List<String> list2 = Arrays.asList("apple","banana","cherry","arm","city");
		List<String> list2res=list2.stream().filter(s -> s.charAt(0) == 'a').toList(); //filters the strings starting with 'a'
		System.out.println(list2res);
		
		
		List<String> list2res2=list2.stream().filter(s -> s.length() > 3).toList(); //filters the strings which have length > 3
		System.out.println(list2res2);
		
		List<Integer> list2res3=list.stream().map(n -> n+2).toList();  // Adds 2 to each element in the list
		System.out.println(list2res3);
		
		List<Integer> list2res4=list.stream().map(n -> n*2).toList();  // Multiplies 2 to each element in the list
		System.out.println(list2res4);
		
		
		List<String> list2ress=list2.stream().map(s -> s.concat("hi")).toList(); //concat's the strings  with "hi" 
		System.out.println(list2ress);
		
		Optional<Integer> ress2=list.stream().min( Integer ::compareTo);  //helps to retrieve the minimum no 
		System.out.println(ress2.get());
		
		int maxNum=list.stream().max( Integer ::compare).get(); // helps to retrieve max Number
		System.out.println(maxNum);
		
		int first =list.stream().findFirst().get(); //gets the first element from the list
		System.out.println(first);
	}
}
