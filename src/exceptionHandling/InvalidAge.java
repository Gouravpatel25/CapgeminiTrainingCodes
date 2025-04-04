package exceptionHandling;

public class InvalidAge extends RuntimeException{
	//This is custom made Exception by the user.
	
	private static String message="Age is invalid";
	
	InvalidAge(){
		super(message);
	}
	
	InvalidAge(String message){
		super(message);
	}
}
