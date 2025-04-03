package ObjectOverLoadingProcess;

public class Child extends Parent{
	int grade;
	
	Child(int grade,String name){
		super(name);
		this.grade=grade;
		System.out.println("Child constructor");
	}
}
