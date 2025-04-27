package fileHandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {
	public static void main(String[] args) throws IOException {
		FileOutputStream f  = new FileOutputStream("D:\\file Handling\\Demo\\Employee");
		ObjectOutputStream o = new ObjectOutputStream(f);
		
		Employee employee =new Employee (101,"Nakan");//,200000.00);
		o.writeObject(employee);
		
		System.out.println("Employee saved to file");
	}
}
