package exceptionHandling;

public class InvalidMoney extends RuntimeException{
	 static String message="Enter amount greater than 0";
	
	InvalidMoney(){
		super(message);
	}
}
