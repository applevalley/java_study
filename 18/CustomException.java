package ch18;

import java.util.Scanner;

class ReadWeightException extends Exception {
	public ReadWeightException() {
		super("it's not valid weight.");
	}
}

public class CustomException {
	
	public static void main(String[] args) {

		System.out.println("enter your weight: ");
		
		try {
			Integer weight = readWeight();
			System.out.printf("your weight: %d", weight);
		}
		catch(ReadWeightException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static int readWeight() throws ReadWeightException {
		Scanner scanner = new Scanner(System.in);
		Integer weight = scanner.nextInt();
		
		if(weight < 0) {
			throw new ReadWeightException();
		}
		
		return weight;
	}

}
