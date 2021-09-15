package ch14;

class People {
	private String name;
	
	void introduceYou() {
		System.out.println("Hi, I'm " + name);
	}
}

class Student extends People {
	private int age;
	private String major;
	
	void introduceInfo() {
		introduceYou();
		System.out.println("I'm " + age + " years old.");
		System.out.println("my major is " + major);
	}
}

public class Inheritance {

	public static void main(String[] args) {
		
		Student kim = new Student();
		kim.introduceInfo();
	}

}
