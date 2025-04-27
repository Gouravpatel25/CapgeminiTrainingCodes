package bookManagementSystem;
import java.util.*;
import java.util.stream.Stream;

public class Library {
		List<Book> books =new ArrayList<Book>();
		
		HashMap<Integer,Member> map = new HashMap();
		
	
		public void addBook(Book book) {
			books.add(book);
		}
		
		public void registerMember(Member member) {
			map.put(member.getPersonId(), member);
		}
		
		
		
		public void borrowBook(int memberId,int bookId) throws BookNotAvailableException{
			Book b= books.stream().filter(book -> book.getId() == bookId).findFirst().orElse(null);
			
			if(b==null || !b.isAvailable()) {
				throw new BookNotAvailableException();
			}
			
			b.borrowBook();
			System.out.println("Member "+memberId+" borrowed book: "+ b.getTitle());
		}
		
		public void returnBook(int bookId) {
			Book b = books.stream().filter(book -> book.getId() == bookId).findFirst().orElse(null);
			
			if(b!=null) {
				b.returnBook();
				System.out.println("Book with ID: "+ bookId+" has been returned");
			}
			
			else {
				 System.out.println("Book with ID " + bookId + " not found.");
			}
		}
		
		public void showAvailableBooks() {
			
			List<Book> list = books.stream().filter(book -> book.isAvailable() == true).toList();
			list.forEach(System.out :: println);
		}
		
		public void showBooksByAuthor(String author) {
			List<String> list = books.stream().filter(book -> book.getAuthor().equalsIgnoreCase(author)).map(Book :: getTitle).toList();
			list.forEach(System.out :: println);
		}
		
		
	}

