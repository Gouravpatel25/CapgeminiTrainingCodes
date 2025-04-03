package NonPrimitiveTypeCasting;

public class University {
	private Person[] people;
	private int count=0;
	
	public University(int numberOfPeople) {
		people=new Person[numberOfPeople];
	}
	
	void addPeople(Person person) {
		people[count]=person ;
		count++;
	}
	
	void displayPeople() {
		for (Person person : people) {
			if(person instanceof Student) {
				((Student)person).displayStudentInfo();
			}else
				((Professor)person).displayProfessorInfo();
		}
	}
	
	
}
