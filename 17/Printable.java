package ch17;

interface Eatable {
	public void eat(String food);
}

// class Hamburger implements interface Eatable
class Hamburger implements Eatable {
	@Override
	public void eat(String food) {   // overriding eat method from interface Eatable
		System.out.println(food);
	}
}

public class Printable {

	public static void main(String[] args) {

		Eatable ham = new Hamburger(); // declaration Eatable type reference variable
		ham.eat("Let's eat Hamburger"); // calling abstract method in interface Eatable
	}

}
