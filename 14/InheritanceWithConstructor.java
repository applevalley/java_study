package ch14;


class Department {
	String part; // if declared with private, child class will not initialize variable "part"
	
//	Department(String part) {
//	}
	
	public String setPart(String part) {
		this.part = part;
		return part;
	}
	
	public void tellYourPart() {
		System.out.println("I'm working at " + part);
	}
}

class Employee extends Department {
	private String name;
	private int age;
	
//	Employee(String name, int age) {
	Employee(String part, String name, int age) {
		this.part = part;
		this.name = name;
		this.age = age;
	}
	
	public void tellYourInfo() {
		System.out.println("my name is " + name);
		System.out.println("I'm " + age + " years old.");
		tellYourPart();
	}
}

public class InheritanceWithConstructor {

	public static void main(String[] args) {

		Employee kim = new Employee("HR", "kim", 24);
		kim.tellYourInfo();
	}

}
