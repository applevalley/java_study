package ch13;

import java.util.Scanner;

public class ConditionTest {

	public static void main(String[] args) {

//		Scanner scanner = new Scanner(System.in); // System.in -> ǥ�� �Է�
//		
//		int num = scanner.nextInt();
//		System.out.println(num);

		int max;
		System.out.println("�� ���� �Է¹޾� �� ū ���� ����մϴ�.\n");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("�Է� 1:");
		int num1 = scanner.nextInt();
		System.out.println("�Է� 2:");
		int num2 = scanner.nextInt();
		
		max = (num1 > num2)? num1 : num2;
		System.out.println(max);
		
	}

}
