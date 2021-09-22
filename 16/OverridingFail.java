package ch16;

class Calc {
	public int pow(int a, int b) {
		return a * b;
	}
}

class NewCalc extends Calc {
//	@Override
	public double pow(double a, double b) {
		return a * b;
	}
}

public class OverridingFail {

	public static void main(String[] args) {

		Calc c1 = new NewCalc();
		System.out.println(c1.pow(3, 4));
	}

}
