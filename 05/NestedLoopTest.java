package ch20;

public class NestedLoopTest {

	public static void main(String[] args) {
		
		// for
		
//		int dan = 2;
//		int count = 1;
//		
//		for(; dan <= 9; dan++) {
//			for(count=1; count<=9; count++) {
//				System.out.println(dan + "X" + count + " = " + dan*count);
//			}
//			System.out.println();
//		}
		
		// while
		
		int dan = 2;
		int count = 1;
		while(dan <= 9) {
			count = 1; // �� �κ��� ����� �ϴ� ������ �ʱ�ȭ ����! �̰� ������ 2�ܸ� ������ count�� 10�� �Ѿ ���������.
			while(count <= 9) {
				System.out.println(dan + "X" + count + " = " + dan*count);
				count++;
			}
			dan++;
			System.out.println();
		}
	}
}
