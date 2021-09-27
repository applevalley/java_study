package ch17;

interface Pizza2 {
	int PRICE = 15000;  // �������̽� ���� ��� ������ public, static, void�� ����� ������ ���� -> ������ ��!
	void eat(String str); // �������̽� ���� ��� �޼���� public�� ����� ������ ���� -> ��������� �������� �ʾƵ� OK
}

interface CheeseCrustPizza extends Pizza2 { // interface extends Pizza2
	int PRICE = 17000;
	void crustPizza(String str);
}

// �������̽��� �����ϴ� Ŭ������ �������̽� ���� ��� �߻� �޼��带 �����ؾ� �Ѵ�. 
// �ϳ��� �������� �ʴ´ٸ� �ش� Ŭ������ ������δ� �ν��Ͻ��� ������ �Ұ���!
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
		System.out.println(Pizza2.PRICE);   // �������̽� ������ ����� ����
		System.out.println(CheeseCrustPizza.PRICE);
		
		CheeseCrustPizza pz1 = new PotatoPizza();
		
		pz1.eat(str);
		System.out.println();
		pz1.crustPizza(str);
	}

}
