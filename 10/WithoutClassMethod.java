package ch10;

class SimpleCube {
	static final int height = 10;
	
	// every methods aren't refer or amend value of instance variable.
	// every methods just serve their function for outside of class.
	// so, the methods defined by class SimpleCube don't have to belong to instance.
	int volume(int x, int y) {
		return (x * y * height);
	}
	
	int axisX(int garo) {
		return garo;
	}
	
	int axisY(int sero) {
		return sero;
	}
}

public class WithoutClassMethod {

	public static void main(String[] args) {
		
		SimpleCube cb = new SimpleCube();
		
		System.out.println("정육면체의 부피: " + cb.volume(3, 6) + "\n");
		System.out.println("정육면체의 가로 길이: " + cb.axisX(5));
		System.out.println("정육면체의 세로 길이: " + cb.axisY(10));
	}

}
