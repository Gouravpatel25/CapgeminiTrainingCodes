package ObjectOverLoadingProcess;

public class DriverForChildAndParent {
	public static void main(String[] args) {


		Child c=new Child(10,"Ramu");
		System.out.println(c.name);
		System.out.println(c.grade);
	}
}
