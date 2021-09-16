package ch14;


class Department2 {
	String part; // if declared with private, child class will not initialize variable "part"
	
	Department2(String part) {
		this.part = part;
	}
	
	public String setPart(String part) {
		this.part = part;
		return part;
	}
	
	public void tellYourPart() {
		System.out.println("I'm working at " + part);
	}
}

class Employee2 extends Department2 {
	private String name;
	private int age;
	
	Employee2(String part, String name, int age) {
		// constructor of parent class initialized his member variable part.
		// so, in declaration of this constructor takes argument from parent class, constructor from parent class should be called with super statement.
		super(part);
		this.name = name;
		this.age = age;
	}
	
	public void tellYourInfo() {
		System.out.println("my name is " + name);
		System.out.println("I'm " + age + " years old.");
		tellYourPart();
	}
}

public class InheritanceWithConstructor2 {

	public static void main(String[] args) {

		Employee2 kim = new Employee2("HR", "kim", 24);
		kim.tellYourInfo();
	}

}
