package ch17;

interface Pizza3 {
	void eat(String str);
	default void cheeseCrustPizza(String str) {};  // default method of interface
}
	
class ShrimpPizza implements Pizza3 {
	@Override
	public void eat(String str) {
		System.out.println("Shrimp");
		System.out.println(str);
	}
}

class HotChickenPizza implements Pizza3 {
	@Override
	public void eat(String str) {
		System.out.println("Hot-Chicken");
		System.out.println(str);
	}
	
	public void cheeseCrustPizza(String str) {
		System.out.println("Cheese-Crust Included");
		System.out.println(str);
	}
}

public class PizzaInterface3 {

	public static void main(String[] args) {

		String str = "yammy yammy pizza!";
		
		Pizza3 pz1 = new ShrimpPizza();
		Pizza3 pz2 = new HotChickenPizza();
		
		pz1.eat(str);
		System.out.println();
		pz2.eat(str);
		pz2.cheeseCrustPizza(str);
	}

}
