package Inheritance;

public class Car extends Vehicle {
	private int numberOfDoors;
	
	Car(int numberOfDoors,String vehicleNumber, String model, String brand, double rentalPricePerDay, boolean isAvailable){
		super(vehicleNumber,model,brand,rentalPricePerDay,isAvailable);
		this.numberOfDoors=numberOfDoors;
	}

	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}
	
	public void displayDetails() {
		super.displayDetails();
		System.out.println(this.numberOfDoors);
	}
}
