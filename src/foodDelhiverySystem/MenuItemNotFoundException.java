package foodDelhiverySystem;

public class MenuItemNotFoundException extends Exception {
	static String message="Item is not present in the menu, order something else";
	
	MenuItemNotFoundException(){
		super(message);
	}
}
