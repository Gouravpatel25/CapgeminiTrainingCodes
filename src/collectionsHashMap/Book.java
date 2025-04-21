package collectionsHashMap;

public class Book {
	private int id;
	private String name;
	private double price;

	public Book(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Book)) return false;
		Book book = (Book) o;
		return id == book.id &&
				name.equals(book.name) &&
				Double.compare(book.price, price) == 0;
	}

	@Override
	public int hashCode() {
		int result = Integer.hashCode(id);
		result = 31 * result + name.hashCode();
		result = 31 * result + Double.hashCode(price);
		return result;
	}


}

