package ch18;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.BufferedWriter;
import java.io.IOException;

public class IOException4 {

	public static void main(String[] args) {

		Path file = Paths.get("C://java//src//ch18//Test.txt");

		try(BufferedWriter writer = Files.newBufferedWriter(file)) {
			writer.write('A');
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
