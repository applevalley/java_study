package ch09;

class Dog2 {
	void Hello() {
		System.out.println("�ȳ� ���� �۸���");
	}
}

class Cat2 {
	void Hello() {
		System.out.println("�ȳ� ���� ����");
	}
}

class Duck2 {
	void Hello() {
		System.out.println("�Ͼ�");
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
