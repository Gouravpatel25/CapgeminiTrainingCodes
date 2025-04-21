package collectionsHashMap;

import java.util.HashMap;
import java.util.Set;

public class hashMapUsingCustomObjects {
	public static void main(String[] args) {
		HashMap<Book,String> map=new HashMap<>();
		Book b1=new Book(1,"DSA",600);
		Book b2=new Book(10,"Java",5250);
		Book b3=new Book(7,"Python",906);
		
		map.put(b1, null);
		map.put(b2,null);
		map.put(b3, null);
		
		System.out.println(map.size());
		
		Set<Book> set=map.keySet();
		for(Book b:set) {
			System.out.println(b+" "+b.getId()+" "+b.getName()+" "+b.getPrice());
		}
	}
}
