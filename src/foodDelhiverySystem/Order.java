package foodDelhiverySystem;

import java.util.List;

public class Order {
	
	private Customer customer;
	private Resturant resturant;
	private List<String> customerItems;
	
	
	public Order(Customer customer, Resturant resturant, List<String> customeritems) throws Exception{
		this.customer=customer;
		this.resturant=resturant;
		this.customerItems=customeritems;
		
		placeOrder();
	}
	
	private void placeOrder() throws Exception{
		if(!customer.login()) {
			throw new Exception("Customer must be logged in to place an order");
		}
		
		else if(customerItems.size() > 5) {
			throw new OrderLimitExceedException();
		}
		
		for(String item:customerItems) {
			if(!resturant.hasItem(item)) {
				throw new MenuItemNotFoundException();
			}
		}
		
		
		System.out.println("Order placed Successfully for items: ");
		for(String item:customerItems) {
			System.out.println(item);
		}
		
		
	}
}
