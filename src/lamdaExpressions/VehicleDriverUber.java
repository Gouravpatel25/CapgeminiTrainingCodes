package lamdaExpressions;

public class VehicleDriverUber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Process 1
		Vehicle car=new Vehicle() {
			public void start() {
				System.out.println("car is starting");
			}
		};
		
		Vehicle bike=new Vehicle() {
			public void start() {
				System.out.println("Bike is starting");
			}
		};
		*/
		/*
		 Process 2
		Vehicle car= () ->{
			System.out.println("car is starting");
		};
		
		Vehicle bike= () ->{
			System.out.println("bike is starting");
		};
		*/
		
		Vehicle car= () -> System.out.println("car is starting");
		
		Vehicle bike= () -> System.out.println("bike is starting");
		
		bike.start();
		car.start();
		
	}

}
