package lamdaExpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LaptopDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Laptop> list=new ArrayList<>(); //Creation of List of Laptop type
		
		//Object creation and initialization
		Laptop l1=new Laptop(12,"HP");
		Laptop l2=new Laptop(900,"ASUS");
		Laptop l3=new Laptop(63,"ACER");
		Laptop l4=new Laptop(55,"MSI");
		Laptop l5=new Laptop(1,"Samsung");
		
		//Adding objects to the List
		list.add(l1);
		list.add(l2);
		list.add(l3);
		list.add(l4);
		list.add(l5);
		
		System.out.println("Without sorting: "+list);
		
		Collections.sort(list, (m1,m2) -> m2.getModelno() - m1.getModelno()); //Lambda Expression 1
		
		System.out.println("Sorting in descending order based on modelNo: "+list);
		
		Collections.sort(list, (m1,m2) -> m1.getBrand().compareTo(m2.getBrand())); //Lambda Expression 2
		
		System.out.println("Sorting based on string ASCII values: "+list);
		
	}

}
