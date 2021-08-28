package ch06;

import java.util.Scanner;

public class Q06_1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int first = scanner.nextInt();
		int second = scanner.nextInt();
		
		calc(first, second);
		
		abs(first, second);
	}
	
	public static void calc(int first, int second) {
		System.out.println("덧셈: " + (first + second));
		System.out.println("뺄셈: " + (first - second));
		System.out.println("곱셈: " + (first * second));
		System.out.println("몫: " + (int)(first / second));
		System.out.println("나머지: " + (first % second));
	}
	
	public static void abs(int first, int second) {
		if (first - second >= 0) {
			System.out.println(first - second);
		}
		else {
			System.out.println(-(first - second));
		}
	}

}
