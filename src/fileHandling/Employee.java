package fileHandling;

import java.io.Serializable;

public class Employee implements Serializable {
	private int id;
	private String name;
	transient final double salary = 300000;

	
	
	public Employee(int id, String name){//, double salary) {
		this.id = id;
		this.name = name;
		
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
	
	public double getSalary() {
		return salary;
	}

	
	
	
}
