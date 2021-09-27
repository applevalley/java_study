package ch17;

interface Pizza4 {
	static void eatPizza(String str) {
		System.out.println(str);
	}
	
	default void pizza(String word) {
		eatPizza(word);
	}
}

class CheesePizza implements Pizza4 {

}

public class PizzaInterface4 {

	public static void main(String[] args) {

		String str = "This is a delicious pizza";
		Pizza4 pz4 = new CheesePizza();
		pz4.pizza(str);
		
		Pizza4.eatPizza("happy happy");
	}

}
