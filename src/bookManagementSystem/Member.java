package bookManagementSystem;

public class Member extends Person{
	
	Member(int id,String name){
		super(id,name);
	}
	
	
	
	@Override
	public void showRole() {
		System.out.println(super.pName +" is library Member");
	}
}
