package ch14;

class Super1 {
	public Super1() {
		System.out.println("hello!!");
	}
}

class Sub1 extends Super1 {
	// if we create instance from child class, constructors from parent and child classes are declared.
	// Constructor of Parent class is called automatically before constructor of child class even without explicit declaration.
	// in this case, constructor from parent class do not take any arguments.
	Sub1() {
		System.out.println("apple");
	}
}

// even though two classes connected with inheritance relationship, member of parent class should be initialized with constructor of parent class.
// that's the reason why constructor of parent class called during creation of instance from child class!

// so, how to declare constructor from parent class explicitly in child class? 

class Super2 {
	Super2() {
		System.out.println("Constructor: Super2()");
	}
	Super2(int i) {
		System.out.println("Constructor: Super2(int i)");
	}
	Super2(String i, String j) {
		System.out.println("Constructor: Super2(String i, String j)");
	}
}

class Sub2 extends Super2 {
	Sub2() {
		System.out.println("Constructor: Sub2()");
	}
	Sub2(int i) {
		// if skip declaration constructor of parent class in constructor of child class, constructor declaration statement does not take any argument from parent class will be insert automatically.
		super(i); // it means declaration of constructor of parent class and this statement always located in first line in this area! 
		System.out.println("Constructor: Sub2(int i)");
	}
	Sub2(String i, String j) {
		// why this statement should be located before constructor of child class?
		super(i, j); // because constructor of parent class always run before child class's one! if it located after child class's one, it will cause compile error.
		System.out.println("Constructor: Sub2(String i, String j)");
	}
}


public class SuperSub {

	public static void main(String[] args) {

		Sub1 var1 = new Sub1();
		System.out.println();
		Sub2 var2 = new Sub2();
		Sub2 var3 = new Sub2(1);
		Sub2 var4 = new Sub2("hello", "world");
	}

}
