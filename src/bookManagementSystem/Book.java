package bookManagementSystem;

public class Book {
	private int id;
	private String title;
	private String author;
	private boolean isAvailable;
	
	Book(int id, String title, String author, boolean isAvailable){
		this.id=id;
		this.title=title;
		this.author=author;
		this.isAvailable=true;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + "]";
	}
	
	public void borrowBook() {
		isAvailable=false;
	}
	
	public void returnBook() {
		isAvailable=true;
	}

	
}
