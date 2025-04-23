package generics;

public class ShapeDriver {
	public static void main(String[] args) {
		  Shape<Integer,String> s1=new Shape<>(123,"hi");
		  
		  int value=s1.getKey();
		  String str=s1.getValue();
		  
		  System.out.println(value);
		  System.out.println(str);
	}
}
