package ch17;

interface Pizza {
	public void eat(String menu);
}

class DPizza implements Pizza {
	@Override
	public void eat(String menu) {
		System.out.println("From D-Pizza");
		System.out.println(menu);
	}
}

class MPizza implements Pizza {
	@Override
	public void eat(String menu) {
		System.out.println("From M-Pizza");
		System.out.println(menu);
	}
}

public class PizzaInterface {

	public static void main(String[] args) {

		String menu = "Tasty Pizza";
		
		Pizza piz1 = new DPizza();
		piz1.eat(menu);
		System.out.println();
		
		Pizza piz2 = new MPizza();
		piz2.eat(menu);
		
	}

}
