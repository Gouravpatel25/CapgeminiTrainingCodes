package fileHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("D:\\file Handling\\Demo\\Employee");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Employee employee = (Employee) ois.readObject();
		System.out.println(employee.getId());
		System.out.println(employee.getName());
		System.out.println(employee.getSalary());
	}

}
