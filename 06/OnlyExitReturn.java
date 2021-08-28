package ch06;

public class OnlyExitReturn {

	public static void main(String[] args) {
		System.out.println(divide(4, 3));
		System.out.println(divide(5, 0));
	}
	
	public static int divide(int first, int second) {
		if (second == 0) {
			System.out.println("DividedByZeroError");
			return -1;
		}
		return (first / second);
	}

}
