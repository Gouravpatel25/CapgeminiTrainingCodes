package generics;

public class WildCards {
	public static void printBox(Box<? super Number> box)
	{
		int value=(int) box.getValue();
		System.out.println(value);
	}

	public static void main(String[] args) {
		Box<Number> b1=new Box<>(190);
		printBox(b1);
	}
}
