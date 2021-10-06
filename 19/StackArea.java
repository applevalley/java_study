package ch19;

public class StackArea {

	public static void main(String[] args) {

		int weight = 100;
		double height = 1.80;
		System.out.println(BMI(weight, height));
	}
	
	public static double BMI(int weight, double height) {
		double result = (weight / (height * 2));
		return result;
	}

}
