package ch09;

class Dog2 {
	void Hello() {
		System.out.println("¾È³ç ³ª´Â ¸Û¸ÛÀÌ");
	}
}

class Cat2 {
	void Hello() {
		System.out.println("¾È³ç ³ª´Â ³ÉÀÌ");
	}
}

class Duck2 {
	void Hello() {
		System.out.println("²Ï¾×");
	}
}

class CallAnimal {
	Dog2 dog = new Dog2();
	Cat2 cat = new Cat2();
	Duck2 duck = new Duck2();
	
	void calling( ) {
		dog.Hello(); cat.Hello(); duck.Hello();
	}
}

class Animal2 {
	void callPet(CallAnimal callani) {
		callani.calling();
	}
}


public class CompCapsule {

	public static void main(String[] args) {
		
		Animal2 pet = new Animal2();
		pet.callPet(new CallAnimal());
	
	}

}
