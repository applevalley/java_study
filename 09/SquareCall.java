package ch09;

class Triangle {  // default로 선언
	// 깡통
}

public class SquareCall {

	public static void main(String[] args) {

		// Square는 public으로 선언되어 있기에 어디에서든 인스턴스는 생성 가능
		ch08.square1.Square square = new ch08.square1.Square(4);
		System.out.println(square.size());          // 정사각형의 넓이를 반환
		
		Triangle tri = new Triangle(); // 같은 패키지 안에 있기 때문에 Triangle 클래스에 대한 인스턴스 생성에는 문제가 없다.
		
//		ch08.square1.Circle circle = new ch08.square1.Circle();      // default 선언이기 때문에 다른 패키지에서는 접근 불가
	}

}
