package ch10;

class Accumulator {
	static int sum = 0;
	
	static int add(int x) {
		return (sum += x);
	}
	
	static void showResult() {
		System.out.println("sum = " + sum);
	}
	
	public static void main(String[] args) {

		for(int i = 0; i < 10; i++) {
			Accumulator.add(i);
		}
		Accumulator.showResult();
	}
}

public class Q10_1 {

	public static void main(String[] args) {

		for(int i = 0; i < 10; i++) {
			Accumulator.add(i);
		
		Accumulator.showResult();
		}
	}

}
