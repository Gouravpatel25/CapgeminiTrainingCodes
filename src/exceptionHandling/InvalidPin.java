package exceptionHandling;

public class InvalidPin extends RuntimeException{
	static String message="Enter the valid pin";
	
	InvalidPin(){
		super(message);
	}
}
