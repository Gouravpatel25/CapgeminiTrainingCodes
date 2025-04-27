package bookManagementSystem;

public class BookNotAvailableException extends Exception {
	
	static String s = "Book is not available.";
	BookNotAvailableException(){
		super(s);
	}
}
