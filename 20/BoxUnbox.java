package ch20;

public class BoxUnbox {

	public static void main(String[] args) {

		Integer intV = new Integer(30);
		Long longV = new Long(500L);
		Double doubleV = new Double(3.14);
		
		System.out.println(intV);
		System.out.println(longV);
		System.out.println();
		
		int num1 = intV.intValue();
		long num2 = longV.longValue();
		double num3 = doubleV.doubleValue();
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println();
		
		// how to increase value of Wrapper Instance?
		// instance from wrapper class can't amend it's value! 
		// we can change it's value through creation of new instance.
		intV = new Integer(intV.intValue() + 10);
		System.out.println(intV);
	}
}
