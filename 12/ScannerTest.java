package ch12;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {

		String dataSource = "1 2 3";
		Scanner scanner = new Scanner(dataSource); // Scanner 인스턴스를 만든다.
		Scanner sc2 = new Scanner(System.in);
		
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		
		int total = num1 + num2 + num3;
		System.out.printf("%d + %d + %d = %d \n", num1, num2, num3, total);
		
		int num4 = sc2.nextInt();
		int num5 = sc2.nextInt();
		int num6 = sc2.nextInt();
		
		int total2 = num4 + num5 + num6;
		System.out.printf("%d + %d + %d = %d \n", num4, num5, num6, total2);
	}

}
