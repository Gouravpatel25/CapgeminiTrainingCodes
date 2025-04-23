package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamFun2 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("apple","banana","cherry","arm","city","guava","kiwi","gun");
		Map<Integer,List<String>> map= list.stream().collect(Collectors.groupingBy(String::length));
		System.out.println(map);
		
		List<String> res= list.stream().map(s -> s.toUpperCase()).toList();  //Converting all strings to upper case
		System.out.println(res);
		
		String first = list.stream().filter(s -> s.charAt(0) == 'a').findFirst().get().toString();
		System.out.println(first);
	}
}
