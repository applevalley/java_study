package java07;

class animal {
	// 인스턴스 변수임! 지역 변수와는 다르다!
	// 인스턴스 변수는 같은 클래스 안의 메서드 내에 접근이 가능함
	boolean status = false;
	
	public void birth() {
		System.out.println("안녕!");
		status = true;
	}
	
	public void death() {
		System.out.println("잘가..");
		status = false;
	}
	
	public void alive() {
		if (status) {
			System.out.println("살아있어요");
		}
		else {
			System.out.println("죽었습니다");
		}
	}
}

public class ClassTest {

	public static void main(String[] args) {
		// 클래스 animal의 인스턴스가 참조 변수 dog에 할당되었다.
		// 참조 변수 dog가 참조하는 값은 인스턴스의 메모리 주소 값
		animal dog = new animal();
		// 참조 변수 cat에 dog를 할당함으로 cat은 dog과 같은 메모리 주소 값을 참조한다. 두 참조 변수가 하나의 인스턴스를 참조하는 것이다.
		animal cat = dog;
		dog.birth();
		check(dog);
		
		// 참조 변수에 null을 대입하면 참조하던 인스턴스와의 관계가 끊어진다.
		// cat = null;  주석 풀면 바로 아래의 클래스 메서드 호출에서 오류가 날 것!
		cat.death();
		check(cat);
	}
	
	public static void check(animal name) {
		name.alive();
	}

}
