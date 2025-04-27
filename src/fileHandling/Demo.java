package fileHandling;

import java.io.File;
import java.io.IOException;

public class Demo {
	public static void main(String[] args) throws IOException {
		
		File f =new File("D:\\file Handling\\Demo\\firstFile.txt"); //This creates a File object that represents a path: D:\file Handling\Demo.
													//At this point, no folder is created yet. You're just creating an object that points to that path.
		boolean b = f.createNewFile(); //This actually attempts to create the directory at the path you specified.
										//It returns true if the directory was successfully created.
		System.out.println(b);
	}
}
