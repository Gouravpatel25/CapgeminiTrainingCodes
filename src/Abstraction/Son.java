package Abstraction;

public class Son implements Father,Mother{

	
	public static void main(String[] args) { 
	
			drink();
		
	}

	private static void drink() {
		// TODO Auto-generated method stub
		 Father.drink(); //can be called using Interface names
		 Mother.drink(); //can be called using Interface names
		 //drink()  ----> cannot be called directly as they are static type and both the 
		 				//interfaces Father and Mother has drink() in them.
		 
		 
	}
}
