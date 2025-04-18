package generics;

public class DriverClassOfFlightPassengerVipPassenger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Flight<Passenger> economyflight=new Flight<>("A123");
		
		Passenger John=new Passenger("John");
		economyflight.addPassenger(John);
		
		Flight<Passenger> VIPflight=new Flight<>("B456");
		
		Passenger Alice=new Passenger("Alice");
		VIPflight.addPassenger(Alice);
		
		economyflight.showPassenger();
		VIPflight.showPassenger();
	}

}
