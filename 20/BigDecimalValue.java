package ch20;

import java.math.BigDecimal;

public class BigDecimalValue {

	public static void main(String[] args) {

		BigDecimal big1 = new BigDecimal("3.14");
		BigDecimal big2 = new BigDecimal("0.1");
		
		System.out.println("result of sum: " + big1.add(big2));
		System.out.println("result of multiply: " + big1.multiply(big2));
		
		BigDecimal big3 = new BigDecimal(3.4);
		BigDecimal big4 = new BigDecimal(0.1);
		System.out.println(big3.add(big4));		
	}

}
