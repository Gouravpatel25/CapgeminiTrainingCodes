package NonPrimitiveTypeCasting;

public class Student extends Person {
	private int studentId;
	
	Student(int studentId,String name,int age){
		super(name,age);
		this.studentId=studentId;
	}
	
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public void displayStudentInfo() {
		super.displayInfo();
		System.out.println(this.getStudentId());
	}
}
