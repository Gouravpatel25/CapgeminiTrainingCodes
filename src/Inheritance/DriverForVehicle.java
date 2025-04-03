package Inheritance;

public class DriverForVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bike b=new Bike(true,"ABCD","XYZ","BWM",80.5,true);
		b.displayDetails(false);
		System.out.println("===========================");
		
		Car c=new Car(4,"A","X","CCM",80.5,true);
		c.displayDetails();
	}

}
