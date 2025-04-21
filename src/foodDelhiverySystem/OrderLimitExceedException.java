package foodDelhiverySystem;

public class OrderLimitExceedException extends Exception{
	
	static String message="Order limit exceeded, reduce the no of items";
	
	OrderLimitExceedException(){
		super(message);
	}
}
