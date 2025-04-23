package constructorReference;

public class DriverForCalciOperation {
	public static void main(String[] args) {
		
		Operation o= Calci :: new;
		o.operate();
	}
}
