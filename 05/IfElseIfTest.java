package ch15;

public class IfElseIfTest {

	public static void main(String[] args) {

		
		int age = 12;
		int charge;
		
		if (age < 8) {
			charge = 1000;
			System.out.println("미취학 아동");
		}
		else if (age < 14) {
			charge = 2000;
			System.out.println("초등학생");
		}
		else if (age < 20) {
			charge = 2500;
			System.out.println("중, 고등학생");
		}
		// 여기까지만 쓰면 문제가 생긴다. 변수 charge는 int형으로 선언은 되었지만 초기화가 되지 않았기 때문이다.
		// 이럴 때 default한 값을 주기 위해 else문도 넣는다. else문은 이러한 경우가 아닐 때는 쓰지 않을 수도 있다.
		else {                  
			charge = 3000;
			System.out.println("일반인");
		}
		
		System.out.println("입장료는" + charge + "원입니다.");
	}

}
