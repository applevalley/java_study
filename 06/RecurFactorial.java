package ch06;

public class RecurFactorial {

	public static void main(String[] args) {

		int num1 = 12;
		System.out.println(facto(num1));
	}

	public static int facto(int num1) {
		
		if (num1 == 1 | num1 == 2) {
			return num1;
		}
		else {
			return (num1 * facto(num1 - 1));
		}
	}
}
