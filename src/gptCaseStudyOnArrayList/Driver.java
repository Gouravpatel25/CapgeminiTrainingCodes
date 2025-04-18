package gptCaseStudyOnArrayList;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to student management system");
		
		Student s1=new Student(1,"Gourav",90);
		Student s2=new Student(2,"Priya",100);
		Student s3=new Student(44,"Sidd",96);
		Student s4=new Student(91,"Sanjona",92);
		Student s5=new Student(6,"Debojit",90);
		Student s6=new Student(6,"Debojit",90);
		
		StudentRecords.addStudents(s1);
		StudentRecords.addStudents(s2);
		StudentRecords.addStudents(s3);
		StudentRecords.addStudents(s4);
		StudentRecords.addStudents(s5);
		StudentRecords.addStudents(s6);
		
		StudentRecords.print();
		
		StudentRecords.sortByRollNumber();
		
		StudentRecords.print();
		
		StudentRecords.searchByRollNumber(47);	
		
	}

}
