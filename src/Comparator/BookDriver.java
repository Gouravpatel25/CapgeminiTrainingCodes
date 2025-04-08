package Comparator;

import java.util.Arrays;

public class BookDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book[] books= {
			new Book(2,"Harry Potter",399.62),
			new Book(8,"SHerlcok Homes",800.36),
			new Book(56,"Griffingles",200.56),
			
		};
		
		sortById sortId=new sortById();
		Arrays.sort(books,sortId);
		
		for(Book b:books) {
			System.out.println(b);
		}
		
	}

}
