package ch08;

class DOG {
	public void Introduce() {
		System.out.println("Hi, I'm a dog");
	}
}

class CAT {
	public void Introduce() {
		System.out.println("Hi, I'm a cat");
	}
}
public class SayYourName {

	public static void main(String[] args) {

		DOG poodle = new DOG();
		CAT sham = new CAT();
		
		poodle.Introduce();
		sham.Introduce();
	}

}
