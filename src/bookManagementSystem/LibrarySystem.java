package bookManagementSystem;

public class LibrarySystem {
	public static void main(String[] args) throws BookNotAvailableException {
		
		Library library =new Library();
		
		//adding books 
		library.addBook(new Book(1, "To Kill a Mockingbird", "Harper Lee", true));
		library.addBook(new Book(2, "1984", "George Orwell", true));
		library.addBook(new Book(3, "Pride and Prejudice", "Jane Austen", true));
		
		//adding members to library
		Member m1= new Member(101,"Ram");
		Member m2=new Member(169,"john");
		library.registerMember(m1);
		library.registerMember(m2);
		
		//Call showRole() on each member to demonstrate runtime polymorphism.
		m1.showRole();
		m2.showRole();
		
		//Call showAvailableBooks() to list all available books.
		library.showAvailableBooks();
		
		//Use the borrowBook() method to let a member borrow a book.
		library.borrowBook(169, 3);
		
		//Attempt to borrow the same book again to trigger and catch BookNotAvailableException.
		try {
			library.borrowBook(1, 3);
		}
		
		catch(Exception BookNotAvailableException) {
			//throw BookNotAvailableException; 
			System.out.println("Book not available");
		}
		
		//Use returnBook() to return a borrowed book.
		library.returnBook(3);
		
		System.out.println("===============================");
		library.showAvailableBooks();
		
		System.out.println("===============================");
		library.showBooksByAuthor("Harpen Lee");
		
		
		
		
		
	}
}	
