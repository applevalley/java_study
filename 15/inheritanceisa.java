package ch15;

// when two classes fulfill is-a relationship, we can expect that they could connected with inheritance relationship.
// child class has every characteristic of parent class.
// and child class has their own characteristic parent class don't have.

class ParentPig {
	protected int value;
	ParentPig (int value) {
		this.value = value;
	}
}

class Pork extends ParentPig {
	protected String part;
	
	Pork(int value, String part) {
		super(value);
		this.part = part;
	}
	
	public void Hi() {
		System.out.println("Hi, I was made with " + part);
	}
}

class Tangsu extends Pork {
	private int price;
	
	Tangsu(int value, String part, int price) {
		super(value, part);
		this.price = price;
	}
	
	public void Introduce() {
		Hi();
		System.out.println("the price is " + price);
	}
}

public class inheritanceisa {

	public static void main(String[] args) {

		Tangsu tang = new Tangsu(1, "loin", 18000);
		tang.Introduce();
		System.out.println();
		
		// reference from parent class can refer instance of child class!!
		// why?
		// class Tangsu inherit class Pork.
		// therefore, reference variable from class Pork can refer instance of class Tangsu. 
		// when inheritance relationship made with extends declaration, 
		// the next instance is created from child class, but it also made from parent class.
		
		Pork meat = new Tangsu(2, "picnic", 12000);
		meat.Hi(); // but we can't access to method defined in child class!
		System.out.println(meat.value);
		
		// reference variable meat actually refers instance of child class.
		// but it can't access method of child class!
		// in this case, things the reference variable can access are variable or method defined in parent class and variable and method from specific class inherited from parent class.
	
		// why?
		// Because restricting variable or method can access with type of reference variable makes codes simple!
	}

}
