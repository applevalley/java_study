package ch11;

class Number {
	
	// in ordinary, declaration two or more methods have same name is not allowed.
	// but, if each of methods have different parameters, it allowed.
	// this situation called as method overloading!
	void myNumber(int n) {
		System.out.println(n);
	}
	
	void myNumber(int n1, int n2) {
		System.out.println(n1 + "\t" + n2);
	}
	
	void myNumber(double n1, double n2) {
		System.out.println(n1 + "\t" + n2);
	}
	
	int printNumber() {
		return 1;
	}
	
	// if two methods have same name have different type for return, method overloading will not allowed.
//	double printNumber() {
//		return 0.1;
//	}
}


public class OverloadingWithAnotherParameter {

	public static void main(String[] args) {

		Number num = new Number();
		num.myNumber(1);
		num.myNumber(4, 5);
		num.myNumber(0, ',');
		num.myNumber(0.24, 0.12);
		
		int x = num.printNumber();
		System.out.println(x);
	}

}
