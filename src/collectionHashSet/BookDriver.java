package collectionHashSet;
import java.util.TreeSet;

public class BookDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Book> set=new TreeSet<Book>();
		Book b1=new Book(200,"DSA",856);
		Book b2=new Book(5,"Networks",690);
		
		set.add(b1);
		set.add(b2);
		
		System.out.println(set);
	}

}
