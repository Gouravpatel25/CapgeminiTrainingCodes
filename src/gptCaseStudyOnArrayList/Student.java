package gptCaseStudyOnArrayList;

public class Student<T> implements Comparable<Student>{
	private int rollNumber;
	private String name;
	private double marks;
	
	public Student(int rollNumber,String name, double marks){
		this.rollNumber=rollNumber;
		this.name=name;
		this.marks=marks;
	}
	
	public  void setrollNumber(int rollNumber) {
		this.rollNumber=rollNumber;
	}
	
	public int getrollNumber() {
		return rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	public int compareTo(Student s) {
		return this.rollNumber-s.rollNumber;
	}
	
	
	@Override
	public String toString() {
		return this.rollNumber+" "+this.name+" "+this.marks;
	}
}
