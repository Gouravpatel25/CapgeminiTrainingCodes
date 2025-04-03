package NonPrimitiveTypeCasting;

public class Driver2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Student student=new Student(200,"Gourav",20);
		Professor professor=new Professor("AIML","Kavya",22);
		
		University u = new University(2);
		u.addPeople(student);
		u.addPeople(professor);
		
		u.displayPeople();
	}

}
