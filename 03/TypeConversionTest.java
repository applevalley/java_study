package ch10;

public class TypeConversionTest {

	public static void main(String[] args) {
		
		byte bNum = 126;
		int iNum = bNum;  // 문제없음 작은 자료형 -> 큰 자료형
		
		int iNum2 = 255;
//		byte bNum2 = iNum2;  // 255는 byte의 범위를 초과한다 -> 문제 발생
		byte bNum2 = (byte)iNum2; // byte로 명시적 형변환 -> 여전히 byte의 범위를 초과하는 값
		
		System.out.println(iNum);
		System.out.println(bNum2); // -1이라는 값 출력.. 오류는 나지 않았다
		
		double dNum = 3.14;
		int iNum3 = (int)dNum;
		
		System.out.println(iNum3); // 실수를 정수로 변환 -> 실수부가 잘려나간다
		
		double dNum2 = 1.3;
		float fNum = 0.9f; // f 붙여줘야한다
		
		int iNum4 = (int)dNum2 + (int)fNum; // 먼저 int로 각각 변환 -> 정수부 1과 0이 더해진다
		int iNum5 = (int)(dNum2 + fNum);  // 두 실수를 먼저 더하고 int로 변환 -> 정수부 2가 남는다
		
		System.out.println(iNum4);
		System.out.println(iNum5);
	}

}
