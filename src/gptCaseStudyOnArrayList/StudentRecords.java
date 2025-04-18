package gptCaseStudyOnArrayList;

import java.util.*;

public class StudentRecords {
	
	static ArrayList<Student> list=new ArrayList<Student>();
	
	public static void addStudents(Student s) {
		
		for(Student existings:list) {
			if(existings.getrollNumber() == s.getrollNumber()) {
				System.out.println("Student already present with this roll number");
	            return;
			}
		}
		
		
		list.add(s);
		System.out.println("Student added successfully to the cohort");
	}
	
	public static void print() {
		for(Student s:list) {
			System.out.println(s);
		}
	}
	
	public static void sortByRollNumber() {
		Collections.sort(list);
		System.out.println("Sorted");
	}
	
	public static void searchByRollNumber(int rollNumber) {
		for(Student s:list) {
			if(s.getrollNumber()==rollNumber) {
				System.out.println("Student Found in the cohort");
				return;
			}
		}
		
		System.out.println("Student not found in the cohort");
	}
}
