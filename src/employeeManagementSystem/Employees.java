package employeeManagementSystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class Employees {

	static ArrayList<Employee> list= new ArrayList<Employee>();

	public static void addEmployee(Employee emp) {
		list.add(emp);
		System.out.println("Employee added successfully");
	}

	public static void print() {
		/*
		for(Employee emp:list) {
			System.out.println(emp);
		}
		 */

		//Using Iterator
		/*
		Iterator<Employee> it=list.iterator();
		while(it.hasNext()) {
			Employee emp=it.next();
			System.out.println(emp);
		}
		*/
		
		//Using List Iterator printing in reverse manner 
		ListIterator<Employee> it=list.listIterator(list.size());
		while(it.hasPrevious()) {
			Employee emp=it.previous();
			System.out.println(emp);
		}
	}
	
	public static boolean searchObject(Employee emp) {
		 if(list.contains(emp)) {
			 return true;
		 }
		 return false;
	}
	
	public static boolean searchById(int idd) {
		for(Employee emp:list) {
			if(emp.getId()==idd) {
				return true;
			}
		}
		
		return false;
		
	}
	
	public static void deleteObject(Employee emp) {
		list.remove(emp);
		System.out.println("Removed the Employee Succesfully");
	}
	
	public static void deleteEmployeeById(Employee emp) {
		for(Employee e:list) {
			if(e.getId()==emp.getId()) {
				list.remove(emp);
			}
		}
		
		System.out.println("Removed the Employee Succesfully using id");
	}
	
	public static void updateById(int id,Scanner sc) {
		Employee old=null;
		for(Employee e:list) {
			if(e.getId()==id) {
				old=e;
			}
		}
		
		System.out.println("Enter the name and salary to update");
		old.setName(sc.next());
		old.setSalary(sc.nextDouble());
		System.out.println("Updated employee details");
	}
	
	public static void sort() {
		Collections.sort(list);
		System.out.println("Sorted successfully");
	}
}
