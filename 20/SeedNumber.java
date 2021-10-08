package ch20;

import java.util.Random;

public class SeedNumber {

	public static void main(String[] args) {

		Random random1 = new Random(1);
		
		for(int i = 0; i < 5; i++) {
			System.out.print(random1.nextInt(100) + "\n");
		}
		
		System.out.println();
		
		Random random2 = new Random(1);
		
		for(int i = 0; i < 5; i++) {
			System.out.print(random2.nextInt(100) + "\n");
		}
	}

}
