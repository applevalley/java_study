package ch18;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.BufferedWriter;
import java.io.IOException;

public class IOException2 {

	public static void method1() throws IOException {
		method2();
	}
	
	public static void method2() throws IOException {
		Path file = Paths.get("C:\\Users\\Rin\\Desktop\\java\\study\\src\\ch18\\Test.txt");
		BufferedWriter writer = null;
		writer = Files.newBufferedWriter(file);
		writer.write('A');
		
		if(writer != null) {
			writer.close();
		}
	}
	
	public static void main(String[] args) {

		try {
			method1();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
