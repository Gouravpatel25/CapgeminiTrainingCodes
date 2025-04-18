package CollectionsStudent;

import java.util.Objects;

public class Student {
	private int id;
	private String name;
	private double percentage;
	
	
	
	public Student(int id, String name, double percentage) {
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}
	
	
	public int getInd() {
		return id;
	}
	public void setInd(int ind) {
		this.id = ind;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	
	@Override
	public String toString() {
		return this.id+" "+this.name+" "+this.percentage;
	}
	
	public boolean equals(Object obj) {
		Student s=(Student)obj;
		return this.name.equals(s.name) && this.id==s.id && this.percentage==s.percentage;
	}
	
	public int hashCode() {
		return Objects.hash(this.name,this.id,this.percentage);
	}
	
}
