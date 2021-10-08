package ch20;

public class AutoBoxUnbox {

	public static void main(String[] args) {

		Character charV = 'A';
		Double doubleV = 3.15;
		
		System.out.println(charV);
		System.out.println(doubleV);
		System.out.println();
		
		char word1 = charV;
		double num1 = doubleV;
		
		System.out.println(word1);
		System.out.println(num1);
		System.out.println();
		
		Integer intV = 30;
		intV++;
		System.out.println(intV);
		
		intV += 4;
		System.out.println(intV);
		System.out.println();
		
		int x = intV -= 30;
		Integer intV2 = intV - 30;
		System.out.println(x);
		System.out.println(intV2);
	}
}
