package ch09;

class MyAnimal {
	void myDog() {
		System.out.println("�۸�");
	}
	void myCat() {
		System.out.println("�ɳ�");
	}
	void myDuck() {
		System.out.println("�Ͼ�");
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
