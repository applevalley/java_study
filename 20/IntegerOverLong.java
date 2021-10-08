package ch20;

import java.math.BigInteger;

public class IntegerOverLong {

	public static void main(String[] args) {

		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		System.out.println();
		
		BigInteger big1 = new BigInteger("10000000000000000000");
		BigInteger big2 = new BigInteger("-9999999999999999999");
		
		BigInteger big3 = big1.add(big2);
		System.out.println("result of sum: " + big3);
		
		BigInteger big4 = big1.multiply(big2);
		System.out.println("result of multifly: " + big4);
		
		int num1 = big3.intValueExact();
		System.out.println(num1);
	}

}
