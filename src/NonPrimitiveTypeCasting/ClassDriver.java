package NonPrimitiveTypeCasting;

public class ClassDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ClassC c=(ClassC) new ClassB();
		System.out.println(c instanceof ClassA);
		// System.out.println(c instanceof ClassD); //compilation error as no connection
		System.out.println(c instanceof ClassB);
	}

}
