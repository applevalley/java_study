package ch06;

public class Q06_2 {

	public static void main(String[] args) {
		double half = 8.0;
		System.out.println(pi(half));
		
		for (int number = 1; number < 101; number++) {
			if (prime(number) == true) {
				System.out.println(number);
			}
		}
	}
	
	public static double pi(double half) {
		return ((half * half) * 3.14);
	}

	public static boolean prime(int number) {
		int check = 0;
		
		if (number == 1) {
			return false;
		}
		
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				check += 1;
			}
		}
		
		if (check == 2) {
			return true;
		}
		else {
			return false;
		}
	}
}
