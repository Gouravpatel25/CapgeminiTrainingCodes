package fileHandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class printWriter {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		PrintWriter pw = new PrintWriter("D:\\\\file Handling\\\\Demo\\\\xyz.txt");
		pw.println(true);
		pw.println(10.8);
		pw.println("hi");
		pw.println('a');
		pw.println(1000);
		pw.flush();
		System.out.println("Data done");
	}

}
