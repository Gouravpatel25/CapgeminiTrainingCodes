package relfectionAPI;

public class Person {
	private String name;
	private int age;
	
	private Person() {
		System.out.println("no arg cons");
	}
	
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	public String getDetails() {
		return name+"\t"+age;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	private void task(String task) {
		System.out.println("Doing the task: " +task);
	}
	
	
}
