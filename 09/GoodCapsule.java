package ch09;

class MyAnimal {
	void myDog() {
		System.out.println("港港");
	}
	void myCat() {
		System.out.println("成成");
	}
	void myDuck() {
		System.out.println("蚕咀");
	}
	
	void pet() {
		myDog();
		myCat();
		myDuck();
	}
}

class MyPet {
	void allAnimal(MyAnimal animal) {
		animal.pet();
	}
}

public class GoodCapsule {

	public static void main(String[] args) {

		MyPet mp = new MyPet();
		mp.allAnimal(new MyAnimal());
	}

}
