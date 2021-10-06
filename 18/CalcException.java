package ch18;

public class CalcException {

	public static void sum1(int i) {
		sum2(i, 0);
	}
	
	public static void sum2(int i, int j) {
		int x = i / j;
	}
	
	public static void main(String[] args) {

		sum1(3);
		System.out.println("Bye Bye");
	}
	
}
