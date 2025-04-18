package genericsByGpt;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Team<Employee> normalStaff=new Team<>("Development team");
		
		Employee john=new Employee("John");
		Employee emma=new Employee("EMMA");
		
		normalStaff.addMember(john);
		normalStaff.addMember(emma);
		
		Team<Manager> managementteam=new Team<>("Management team");
		
		Manager alic=new Manager("ALICE");
		Manager Bob=new Manager("Bob");
		
		managementteam.addMember(Bob);
		managementteam.addMember(alic);
		
		
		normalStaff.showMember();
		managementteam.showMember();
	}

}
