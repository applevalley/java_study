package ch19;

class Car {
	String name;
	
	public Car(String name) {
		this.name = name;
	}
	
	@Override
	protected void finalize() throws Throwable {
		super.finalize();  // 상위 클래스의 finalize 메서드 호출
		System.out.println("자동차 붕붕: " + name);
	}
}

public class Finalize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car punk = new Car("520D");
		punk.name = null;  // 참조하던 인스턴스를 가비지 컬렉션의 대상으로 만든다.
		
//		System.gc();  
//		System.runFinalization();  // 위 두 메서드 호출을 통해 가비지 컬렉션의 수행을 요청할 수 있다.
	}

}
