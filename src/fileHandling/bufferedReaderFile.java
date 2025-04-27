package fileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class bufferedReaderFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr =new FileReader("D:\\\\file Handling\\\\Demo\\\\xyz.txt");
		
		BufferedReader b =new BufferedReader(fr);
		
		String line = b.readLine();
		
		while(line != null) {
			System.out.println(line);
			line = b.readLine(); 
		}
	}

}
