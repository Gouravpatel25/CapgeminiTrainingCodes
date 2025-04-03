package Inheritance;

public class Vehicle {
	private String vehicleNumber;
	private String model;
	private String brand;
	private double rentalPricePerDay;
	private boolean isAvailable;
	
	public Vehicle(String vehicleNumber, String model, String brand, double rentalPricePerDay, boolean isAvailable) {
		this.vehicleNumber = vehicleNumber;
		this.model = model;
		this.brand = brand;
		this.rentalPricePerDay = rentalPricePerDay;
		this.isAvailable = isAvailable;
	}
	
	





	public String getVehicleNumber() {
		return vehicleNumber;
	}





	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}





	public String getModel() {
		return model;
	}





	public void setModel(String model) {
		this.model = model;
	}





	public String getBrand() {
		return brand;
	}





	public void setBrand(String brand) {
		this.brand = brand;
	}





	public double getRentalPricePerDay() {
		return rentalPricePerDay;
	}





	public void setRentalPricePerDay(double rentalPricePerDay) {
		this.rentalPricePerDay = rentalPricePerDay;
	}

	
	public boolean isAvailable() {
		return isAvailable;
	}





	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}





	public void rentVehicle() {
		if(isAvailable) {
			System.out.println("Available for rent");
		}
		
		else {
			System.out.println("Not available for rent");
		}
	}


	public void displayDetails() {
		System.out.println(this.getVehicleNumber());
		System.out.println(this.getBrand());
		System.out.println(this.getModel());
		System.out.println(this.getRentalPricePerDay());
		System.out.println(this.isAvailable());
		rentVehicle();
	}
	
}
