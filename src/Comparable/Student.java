package Comparable;

public class Student implements Comparable{

	int rollno;
	String name;
	double percentage;
	
	public Student(int rollno, String name, double percentage) {
		this.rollno = rollno;
		this.name = name;
		this.percentage = percentage;
	}
	
	@Override
	public String toString() {
		return rollno+" "+name+" "+percentage;
	}
	
	
	@Override
	public int compareTo(Object o) {
			Student s=(Student) o;  // downcasting
			/*
			if(this.rollno > s.rollno) {
				return  1;
			}
			
			else if(this.rollno < s.rollno) {
				return  -1;
			}
			
			else {
				return 0;
			}
			
			// We can also write return this.rollno - s.rollno;  instead of the conditional statements
			
			 */
			
			return Double.compare(this.percentage, s.percentage);
		}
		
	}
