package ch09;

class Dog {
	void Hello() {
		System.out.println("�ȳ� ���� �۸���");
	}
}

class Cat {
	void Hello() {
		System.out.println("�ȳ� ���� ����");
	}
}

class Duck {
	void Hello() {
		System.out.println("�Ͼ�");
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
