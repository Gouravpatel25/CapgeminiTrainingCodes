package bookManagementSystem;

public class Librarian extends Person {
	
	Librarian(int id,String name){
		super(id,name);
	}
	
	@Override
	public void showRole() {
		System.out.println("Person is Librarian");
	}
}
