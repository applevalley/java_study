package ch18;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.BufferedWriter;
import java.io.IOException;

public class IOException3 {

	public static void main(String[] args) {

		Path file = Paths.get("C://java//src//ch18//Test.txt");
		BufferedWriter writer = null;
		
		try {
			writer = Files.newBufferedWriter(file);
			writer.write('A');
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(writer != null) {
					writer.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
