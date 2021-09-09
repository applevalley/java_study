package ch10;

class SimpleCube2 {
	static final int height = 10;
	
	static int volume(int x, int y) {  // we add static declaration! 
		return (x * y * height);       // so, we don't have to create instance.
	}
	
	static int axisX(int garo) {
		return garo;
	}
	
	static int axisY(int sero) {
		return sero;
	}
}

public class WithClassMethod {

	public static void main(String[] args) {
		
		System.out.println("정육면체의 부피: " + SimpleCube2.volume(3, 6) + "\n");
		System.out.println("정육면체의 가로 길이: " + SimpleCube2.axisX(5));
		System.out.println("정육면체의 세로 길이: " + SimpleCube2.axisY(10));
	}

}
