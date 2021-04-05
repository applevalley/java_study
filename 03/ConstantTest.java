package ch10;

public class ConstantTest {

	public static void main(String[] args) {

		final int MAX_NUM = 100; // 이미 상수가 되었기에 정해진 값을 바꿀 수 없다.
		final int MIN_NUM;  // 상수를 선언했지만 값을 할당하지 않은 상태
		
		MIN_NUM = 0;
		
//		MAX_NUM = 20;
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
	}

}
