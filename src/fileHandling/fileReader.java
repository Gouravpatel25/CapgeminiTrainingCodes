package fileHandling;

import java.io.FileReader;
import java.io.IOException;

public class fileReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader f =new FileReader("D:\\\\file Handling\\\\Demo\\\\xyz.txt");
		
		int i = f.read();
		
		while(i != -1) {
			System.out.print((char) i);
			i=f.read();
		}
		
	}

}
