package ch12;

public class LogicalTest {

	public static void main(String[] args) {

		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 = num1 + 10) < 10) &&  ((i = i + 2) < 10);
		// ���� ���� false�̱⿡ ���� ���� ������ �ʴ´�
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		// and�� �ƴ� or���?
		
		int num2 = 10;
		int j = 2;
		boolean value2 = ((num2 = num2 + 10) < 10) ||  ((j = j + 2) < 10);
		// ���� ���� false������ �ϳ��� true���� ���� �Ǳ⿡ ���� �ױ��� �򰡸� �Ѵ�.
		// ���� ���� ���� (num2 = num2 + 10) > 10)���ٸ�, ���� ���� true�̱⿡ �ű⼭ ����ȴ�.
		System.out.println(value2);
		System.out.println(num2);
		System.out.println(j);
	}

}
