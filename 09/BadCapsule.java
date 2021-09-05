package ch09;

class Dog {
	void Hello() {
		System.out.println("¾È³ç ³ª´Â ¸Û¸ÛÀÌ");
	}
}

class Cat {
	void Hello() {
		System.out.println("¾È³ç ³ª´Â ³ÉÀÌ");
	}
}

class Duck {
	void Hello() {
		System.out.println("²Ï¾×");
	}
}

class Animal {
	void myDog(Dog dog) {
		dog.Hello();
	}
	
	void myCat(Cat cat) {
		cat.Hello();
	}
	void myDuck(Duck duck) {
		duck.Hello();
	}
}

public class BadCapsule {

	public static void main(String[] args) {

		Animal pet = new Animal();
		
		pet.myDog(new Dog());
		pet.myCat(new Cat());
		pet.myDuck(new Duck());
	}

}
