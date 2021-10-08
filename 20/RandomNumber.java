package ch20;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {

		Random random = new Random();
		
		for(int i = 0; i < 5; i++) {
			System.out.println(random.nextInt(10));
		}
		
		Random random2 = new Random(System.currentTimeMillis());
		
		for(int i = 0; i < 5; i++) {
			System.out.println(random2.nextInt(10));
		}
	}

}
