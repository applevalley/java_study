package ch08;

public class SquareCalc {

	public static void main(String[] args) {

		// url이 square.com인 회사의 lazy팀에서 개발한 클래스 Square
		ch08.com.square.lazy.Square s1 = new ch08.com.square.lazy.Square(4);
		System.out.println("사각형의 넓이는 " + s1.size());
		
		// url이 square.com인 회사의 humble팀에서 개발한 클래스 square
		ch08.com.square.humble.Square s2 = new ch08.com.square.humble.Square(5);
		System.out.println("사각형 모든 변의 길이는 " + s2.length());
	}

}
