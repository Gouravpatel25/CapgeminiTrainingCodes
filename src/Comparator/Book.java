package Comparator;

import java.util.Comparator;

public class Book implements Comparator{
	int id;
	String name;
	double price;
	
	public Book(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return id+" "+name+" "+price;
	}
	
	
	
	
	
}
