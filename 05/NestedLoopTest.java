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
			count = 1; // 이 부분을 써줘야 하는 이유는 초기화 때문! 이게 없으면 2단만 나오고 count가 10이 넘어서 멈춰버린다.
			while(count <= 9) {
				System.out.println(dan + "X" + count + " = " + dan*count);
				count++;
			}
			dan++;
			System.out.println();
		}
	}
}
