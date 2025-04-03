package ObjectClass;

public class ObjectDriverClass {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1=new Student("Gourav",20,55.09);
		Student s2=new Student("Ram",52,90.66);
		System.out.println(s1.toString());
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s1.hashCode()==s2.hashCode());
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s1));
	}

}

