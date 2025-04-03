package Inheritance;

public class Bike extends Vehicle{
	private boolean hasGear;

	public Bike(boolean hasGear,String vehicleNumber, String model, String brand, double rentalPricePerDay, boolean isAvailable) {
		super(vehicleNumber,model,brand,rentalPricePerDay,isAvailable);
		this.hasGear = hasGear;
	}
	
	
	public boolean isHasGear() {
		return hasGear;
	}


	public void setHasGear(boolean hasGear) {
		this.hasGear = hasGear;
	}


	public void displayDetails(boolean hasGear) {
		super.displayDetails();
		System.out.println(this.hasGear);
	}
	
}
