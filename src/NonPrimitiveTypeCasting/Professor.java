package NonPrimitiveTypeCasting;

public class Professor extends Person{
	private String specialisation;
	
	Professor(String specialisation,String name,int age){
		super(name,age);
		this.specialisation=specialisation;
	}
	
	public String getSpecialisation() {
		return specialisation;
	}

	public void setSpecialisation(String specialisation) {
		this.specialisation = specialisation;
	}
	
	public void displayProfessorInfo() {
		super.displayInfo();
		System.out.println(this.specialisation);
	}
}
