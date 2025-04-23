package generics;

public class BoxDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<Integer> b1=new Box<>(10);
		  int value=b1.getValue();
		  System.out.println(value);
		  
		  Box<String> b2=new Box<>("hi");
		  String value2=b2.getValue();
		  System.out.println(value2);
	}

}
