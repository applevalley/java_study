package ch13;

public class BitOperationTest {

	public static void main(String[] args) {

		int num1 = 5;
		int num2 = 10;
		
		System.out.println(num1 | num2);
		System.out.println(num1 & num2);
		System.out.println(num1 ^ num2);
		System.out.println( ~num1 );
		
		System.out.println(num1 << 2);  // num1 ���� �����ؿͼ� ��Ʈ ����Ʈ -> num1 ��ü�� ������ ����
		System.out.println(num1 <<= 2);  // �̷��� ���� �����ڸ� �ٿ��ָ� ���� num1 ���� ��ȭ�Ѵ�
		System.out.println(num1);

	}

}
