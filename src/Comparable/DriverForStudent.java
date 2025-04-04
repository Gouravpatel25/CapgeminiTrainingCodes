package Comparable;

import java.util.Arrays;

public class DriverForStudent {
	
	public static void main(String[] args) {
		Student[] students= {
				new Student(1,"Ram",99.25),
				new Student(5,"Shyam",97.22),
				new Student(7,"Gochu",80.23),
				new Student(2,"Poka",88.3),
				
				
			};
			
			Arrays.sort(students);  // Arrays.sort is internally 
			
			for(Student student:students) {
				System.out.println(student);
			}
	}
}
