package employeeManagementSystem;

import java.util.Scanner;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		while(true) {
			System.out.println("Welcome to Employee Management System");
			System.out.println("1 - Add Employee\n2 - Print all Employees\n3 - Search Employeee\n4 - Search Employee By ID\n5 - Delete Employee \n6 - Delete Employee by ID\n7 - Update Employee\n8 - Sort Employee based on Id ");

			int choice=sc.nextInt();

			switch(choice) {
			case 1:{
				Employee emp=createEmployeeObject(sc);
				Employees.addEmployee(emp);
				break;
			}

			case 2:{
				Employees.print();
				break;
			}

			case 3:{
				Employee emp=createEmployeeObject(sc);
				boolean result=Employees.searchObject(emp);
				System.out.println("Employee found: "+result);
				break;
			}

			case 4:{
				System.out.println("Enter the ID to be searched:");
				int idd = sc.nextInt();
				boolean result = Employees.searchById(idd);  // Call the static method with class name

				if (result) {
					System.out.println("Employee found!");
				} else {
					System.out.println("Employee not found.");
				}
				break;
			}
			
			case 5:{
				Employee emp=createEmployeeObject(sc);
				Employees.deleteObject(emp);
				break;
			}
			
			case 6:{
				Employee emp=createEmployeeObject(sc);
				Employees.deleteEmployeeById(emp);
				break;
			}
			
			case 7:{
				System.out.println("Enter the id to be updated");
				int id=sc.nextInt();
				Employees.updateById(id,sc);
				break;
			}
			
			case 8:{
				Employees.sort();
				break;
			}
			default:
				System.exit(0);
			}

		}
	}


	private static Employee createEmployeeObject(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("Enter ID, name, Salary");
		Employee emp=new Employee(sc.nextInt(), sc.next(), sc.nextDouble());
		return emp;

	}

}
