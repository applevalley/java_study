package ch17;

interface Pizza5 {
	void eat(String str);
}

class PineapplePizza implements Pizza5 {
	public void eat(String str) {
		System.out.println(str);
	}
}

class CheeseCrustPineapplePizza extends PineapplePizza {
	public void eat(String str) {
		super.eat("Let's eat pineapple pizza");
		super.eat(str);
		super.eat("no");
	}
}

public class InstanceOfInterface {

	public static void main(String[] args) {

		Pizza5 pz1 = new PineapplePizza();
		Pizza5 pz2 = new CheeseCrustPineapplePizza();
		
		if(pz1 instanceof Pizza5) {
			System.out.println("This is a pineapple pizza.");
		}
		
		System.out.println();
		
		if(pz2 instanceof Pizza5) {
			System.out.println("This is a cheese-crusted pineapple pizza.");
		}
	}

}
