package ch06;

public class MethodDef {

	public static void main(String[] args) {

		System.out.println("시작!");
		hihi(10);
		hihi(24);
		System.out.println("끝!");
	}
	
	public static void hihi(int age) {
		if (age < 14) {
			System.out.println("나는 초등학생");
		}
		else if (age < 17) {
			System.out.println("나는 중학생");
		}
		else if (age < 20) {
			System.out.println("나는 고등학생");
		}
		else {
			System.out.println("나는 어른");
		}
	}

}
