package fileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class fileWriter {
	public static void main(String[] args) throws IOException {

		FileWriter f =new FileWriter("D:\\file Handling\\Demo\\xyz.txt");
		f.write("hi");
		f.write("\n");
		f.write('a');
		f.write("\n");
		f.write(99);
		f.flush();
		System.out.println("data written");
	}
}

