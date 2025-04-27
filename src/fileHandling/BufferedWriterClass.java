package fileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterClass {
	public static void main(String[] args) throws IOException {

		FileWriter fw =new FileWriter("D:\\file Handling\\Demo\\xyz.txt");
		BufferedWriter b =new BufferedWriter(fw);
		b.write("hi");
		b.write("\n");
		b.write('a');
		b.write("\n");
		b.write(99);
		b.flush();
		System.out.println("data written");
}
}
