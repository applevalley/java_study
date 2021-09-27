package ch17;

interface Pizza2 {
	int PRICE = 15000;  // 인터페이스 내의 모든 변수는 public, static, void가 선언된 것으로 간주 -> 상수라는 뜻!
	void eat(String str); // 인터페이스 내의 모든 메서드는 public이 선언된 것으로 간주 -> 명시적으로 선언하지 않아도 OK
}

interface CheeseCrustPizza extends Pizza2 { // interface extends Pizza2
	int PRICE = 17000;
	void crustPizza(String str);
}

// 인터페이스를 구현하는 클래스는 인터페이스 내의 모든 추상 메서드를 구현해야 한다. 
// 하나라도 구현되지 않는다면 해당 클래스를 대상으로는 인스턴스의 생성이 불가능!
class PotatoPizza implements CheeseCrustPizza {
	@Override
	public void eat(String str) {
		System.out.println("Potato");
		System.out.println(str);
	}

	public void crustPizza(String str) {
		System.out.println("chesse crust potato pizza");
		System.out.println(str);
	}
}

public class PizzaInterface2 {

	public static void main(String[] args) {

		String str = "Tasty Pizza! Yammy";
		System.out.println(Pizza2.PRICE);   // 인터페이스 내부의 상수에 접근
		System.out.println(CheeseCrustPizza.PRICE);
		
		CheeseCrustPizza pz1 = new PotatoPizza();
		
		pz1.eat(str);
		System.out.println();
		pz1.crustPizza(str);
	}

}
