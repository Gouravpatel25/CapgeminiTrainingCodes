package Comparator;

import java.util.Comparator;

public class sortById implements Comparator<Book>{

	@Override
	public int compare(Book b1, Book b2) {
		// TODO Auto-generated method stub
		return b1.id-b2.id;
	}
	
}
