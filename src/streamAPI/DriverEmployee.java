package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class DriverEmployee {
	
	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(1, "abc", 28, 123, "F", "HR", "Blore", 2020));
		empList.add(new Employee(2, "xyz", 29, 120, "F", "HR", "Hyderabad", 2015));
		empList.add(new Employee(3, "efg", 30, 115, "M", "HR", "Chennai", 2014));
		empList.add(new Employee(4, "def", 32, 125, "F", "HR", "Chennai", 2013));
		empList.add(new Employee(5, "ijk", 22, 150, "F", "IT", "Noida", 2013));
		empList.add(new Employee(6, "mno", 27, 140, "M", "IT", "Gurugram", 2017));
		empList.add(new Employee(7, "uvw", 26, 130, "F", "IT", "Pune", 2016));
		empList.add(new Employee(8, "pqr", 23, 145, "M", "IT", "Trivandam", 2015));
		empList.add(new Employee(9, "stv", 25, 160, "M", "IT", "Blore", 2010));
		
		
		//empList.forEach(System.out :: println);
		
		Map<String, List<Employee>> map = empList.stream().collect(Collectors.groupingBy(Employee::getCity)); //Grouping  based on City
		
		
		
		for(String city:map.keySet()) {
			System.out.println(city + " "+ map.get(city));
		}
		
		
		
		System.out.println("=================================================================");
		Map<Integer, List<Employee>> map2 = empList.stream().collect(Collectors.groupingBy(Employee::getAge)); //Grouping based on the age 
		for(Integer age:map2.keySet()) {
			System.out.println(age + " "+ map2.get(age));
		}
		
		
		
		System.out.println();
		List<String> list= empList.stream().map(s -> s.getDeptName()).distinct().toList(); //printing department names from empList
		// or we can do is 
		// List<String> list= empList.stream().map(Employee :: getDeptName).distinct().toList();
		System.out.println("Department names : "+ list);
		
		
		System.out.println();
		List<Employee> list2=empList.stream().filter(i -> i.getAge() > 28).toList(); //employees with age > 28 
		list2.forEach(System.out :: println);
		
		
		System.out.println();
		Employee maxAge=empList.stream().max((e1,e2) -> e1.getAge() - e2.getAge()).get();  //finding the max Age 
		System.out.println("Max Age is : "+maxAge);
		
		
		System.out.println();
		Employee e= empList.stream().filter(i -> i.getGender() =="F").min((e1,e2) -> e1.getAge() - e2.getAge()).get(); //Finding the female employee with youngest age
		System.out.println("Youngest Female Employee : "+e);
		
	
		
		System.out.println();
		//Find the employees whose age is >25 and < 30
		List<Employee> ageList= empList.stream().filter(i -> i.getAge() > 25 && i.getAge() < 30).toList();
		System.out.println("Employees with age > 25 && < 30");
		ageList.forEach(System.out :: println);
		
		
		System.out.println();
		//  Find all employees from HR dept
		List<Employee> hrDeptList=empList.stream().filter(dept -> dept.getDeptName() == "HR").toList();
		hrDeptList.forEach(System.out :: println);
		
		
		
		System.out.println();
		//Find all employees who lives in Blore city , sort them by their name and print the name of employees
		List<Employee> empBloreCity=empList.stream().filter(city -> city.getCity() == "Blore").sorted((e1,e2) -> e1.getName().compareTo(e2.getName())).toList();
		empBloreCity.forEach(System.out ::println);
		
		
		System.out.println();
		//  find the total no of employees in the organization : use count() for solving
		long count =empList.stream().count();
		System.out.println("Total no of employees in organisation are: "+count);
		
		System.out.println();
		// Sort the employees based on age 
		List<Employee> sortedAsAge = empList.stream().sorted((e1,e2) -> e1.getAge() - e2.getAge()).toList();
		System.out.println("Employees sorted based on their age: ");
		sortedAsAge.forEach (System.out ::println);
		
		
		System.out.println();
		// Find the highest experienced employee in the organisation : use min() on joining year
		Employee highestExperienced = empList.stream().min((e1,e2) -> e1.getYearOfJoining() - e2.getYearOfJoining()).get();
		System.out.println("Highest Experienced employee in the organisation : ");
		System.out.println(highestExperienced);
		
		
		
		System.out.println();
		//  Find the highest salary in the organisation 
		Employee highestSalary = empList.stream().max((e1,e2) -> Long.compare(e1.getSalary(), e2.getSalary())).get();
		System.out.println("The highest salary in the organisation is: " + highestSalary.getSalary());
	}

	
}
