package ch06;

public class MethodReturns {

	public static void main(String[] args) {
		int res;
		res = add(5, 8);
		System.out.println(res);
		System.out.println(half(8));
	}
	
	public static int add(int first, int second) {
		return (first + second);
	}
	
	public static double half(double number) {
		return (number * 0.5);
	}

}
