package collectionHashsetsortUsingComparator;


public class Book<T> implements Comparable<Book>{
	private int id;
	private String title;
	private double price;

	Book(int id,String title,double price){
		this.id=id;
		this.title=title;
		this.price=price;

	}

	public void  setId(int id) {
		this.id=id;
	}

	public int getId() {
		return this.id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	//Comparing or sorting based on id
	/*public int compareTo(Book b) {
			return this.id-b.id;
		}
	 */

	//Comparing or sorting based on id
	public int compareTo(Book b) {
		return this.title.compareTo(b.title);
	}




	@Override
	public String toString() {
		return this.id+" "+ this.title+" "+ this.price;
	}
}


