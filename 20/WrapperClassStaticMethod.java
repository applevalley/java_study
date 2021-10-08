package ch20;

public class WrapperClassStaticMethod {

	public static void main(String[] args) {

		Double doubleV = 3.14;
		System.out.println(doubleV.doubleValue());
		System.out.println(doubleV.intValue());
		System.out.println();
		
		Double d1 = Double.valueOf(3.1);
		Double d2 = Double.valueOf("3.47");
		
		System.out.println("bigger: " + Double.max(d1, d2));
		System.out.println("smaller: " + Double.min(d1, d2));
		System.out.println("sum: " + Double.sum(d1, d2));
		System.out.println();
		
		System.out.println("binary(18): " + Integer.toBinaryString(18));
		System.out.println("octal(18): " + Integer.toOctalString(18));
		System.out.println("hex(18): " + Integer.toHexString(18));
	}

}
