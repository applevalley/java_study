package ch13;

public class BitOperationTest {

	public static void main(String[] args) {

		int num1 = 5;
		int num2 = 10;
		
		System.out.println(num1 | num2);
		System.out.println(num1 & num2);
		System.out.println(num1 ^ num2);
		System.out.println( ~num1 );
		
		System.out.println(num1 << 2);  // num1 값을 복사해와서 비트 시프트 -> num1 자체는 변하지 않음
		System.out.println(num1 <<= 2);  // 이렇게 대입 연산자를 붙여주면 원본 num1 값도 변화한다
		System.out.println(num1);

	}

}
