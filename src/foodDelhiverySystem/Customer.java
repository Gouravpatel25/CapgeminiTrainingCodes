package foodDelhiverySystem;

import java.util.List;

public class Customer {
	private String name;
	private boolean isLoggedIn;
	
	Customer(String name,boolean isLoggedIn){
		this.name=name;
		this.isLoggedIn=false;
	}
	
	public void login() {
		this.isLoggedIn=true;
		System.out.println(name+" logged in succesfully");
	}
	
	public void logout() {
		this.isLoggedIn=false;
		System.out.println("Logged out successfully");
	}
	
	public void placeOrder(Resturant resturant,List<String> items) {
		if (!isLoggedIn) {
            System.out.println("Please login before placing an order.");
            return;
        }
        System.out.println(name + " is placing an order for " + items);
	}
}
