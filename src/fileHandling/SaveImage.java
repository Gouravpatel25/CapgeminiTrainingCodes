package fileHandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SaveImage {

	public static void main(String[] args) throws IOException {
		// Corrected path with escaped backslashes
		String image = "C:\\Users\\ACER\\Downloads\\pexels-mikebirdy-112460.jpg";
		
		Path path = Paths.get(image);
		byte[] byte_array = Files.readAllBytes(path);
		
		FileOutputStream fos = new FileOutputStream("D:\\file Handling\\Demo\\newimage.jpg");
		fos.write(byte_array);
		fos.close(); // Make sure to close the stream
		
		System.out.println("Image saved");
	}
}