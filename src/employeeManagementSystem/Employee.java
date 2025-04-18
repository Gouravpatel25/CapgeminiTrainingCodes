package employeeManagementSystem;

public class Employee<T> implements Comparable<Employee>
 {
	private int id;
	private String name;
	private double salary;
	
	
	
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
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
	public void setSalary(double salary) {
		this.salary = salary;
	}



	@Override
	public String toString() {
		return this.getName()+" "+this.getSalary()+" "+this.getId();
	}



	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Employee e=(Employee) obj;
		return this.name.equals(e.name) && this.id==e.id && this.salary==e.salary;
	}
	
	//sorting based on id
	/*
	public int compareTo(Employee o) {
		return this.id - o.id;
	}
	*/
	
	//sorting based on salary
	/*
	public int compareTo(Employee o) {
		return (int) (this.salary - o.salary);
	}
	*/
	
	public int compareTo(Employee o) {
		return this.name.compareTo(o.name);
	}
}
