package ch09;

class Triangle {  // default�� ����
	// ����
}

public class SquareCall {

	public static void main(String[] args) {

		// Square�� public���� ����Ǿ� �ֱ⿡ ��𿡼��� �ν��Ͻ��� ���� ����
		ch08.square1.Square square = new ch08.square1.Square(4);
		System.out.println(square.size());          // ���簢���� ���̸� ��ȯ
		
		Triangle tri = new Triangle(); // ���� ��Ű�� �ȿ� �ֱ� ������ Triangle Ŭ������ ���� �ν��Ͻ� �������� ������ ����.
		
//		ch08.square1.Circle circle = new ch08.square1.Circle();      // default �����̱� ������ �ٸ� ��Ű�������� ���� �Ұ�
	}

}
