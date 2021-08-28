package ch06;

public class Method2Param {

	public static void main(String[] args) {

		System.out.println("시작!");
		hihi(10, 140.2);
		hihi(24, 190.3);
		byebye();
	}
	
	public static void hihi(int age, double height) {
		if (age < 14) {
			System.out.println("나는 초등학생");
			System.out.println("나는 " + age + "살");
			System.out.println("나의 키는 " + height);
		}
		else if (age < 17) {
			System.out.println("나는 중학생");
		}
		else if (age < 20) {
			System.out.println("나는 고등학생");
		}
		else {
			System.out.println("나는 어른");
			System.out.println("키가 크네요 " + height);
		}
	}
	
	public static void byebye() {
		System.out.println("잘가!");
	}

}
