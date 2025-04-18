package CollectionsStudent;

import java.util.HashSet;

public class studentDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Student> set=new HashSet<Student>();
		
		Student s1=new Student(2,"Gourav",2612);
		Student s2=new Student(3,"Jeet",5961);
		Student s3=new Student(3,"Jeet",5961);
		
		set.add(s1);
		set.add(s2);
		set.add(s3);
		
		//If we don't override the toString(), hashCode() and the equals() method.
		System.out.println(set);
	}

}
