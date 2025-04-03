package oopsCapgemini;

public class DriverEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1=new Employee("Gourav",9485982000l,2000);
		Employee e2=new Employee("Risha",77777777,890000);
		Employee e3=new Employee("PR",900000,35000);
		Employee e4=new Employee("Pookie");
		Employee e5=new Employee();
		
		
		System.out.println(e1.name+" "+e1.phno+" "+e1.salary);
		System.out.println(e2.name+" "+e2.phno+" "+e2.salary);
		System.out.println(e3.name+" "+e3.phno+" "+e3.salary);
		System.out.println(e4.name);
		System.out.println(e5.name+" ");
	}

}
