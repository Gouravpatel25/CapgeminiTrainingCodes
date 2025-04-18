package generics;
import java.util.ArrayList;
import java.util.List;

public class Flight<T> {
	
	private String flightNumber;
	private List<T> passengers;
	
	public Flight(String flightNumber) {
		this.flightNumber=flightNumber;
		passengers=new ArrayList<>();
	}
	
	
	public void addPassenger(T passenger) {
		passengers.add(passenger);
	}
	
	public void showPassenger() {
		
		System.out.println("Flight Number:"+ flightNumber);
		for(T passenger: passengers) {
			System.out.println(passenger);
		}
	}
}
