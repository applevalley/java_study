package ch14;

class Super3 {
	// protected declaration will grant child class to access to class variable.
	protected static int cnt = 0; // if this variable declared with private, child class can't access to this variable.
	
	public Super3() {
		cnt++;
	}
}

class Sub3 extends Super3 {
	// because of inheritance, this class calls constructor of parent class!
	public void showCnt() {
		System.out.println(cnt); // access to class variable in parent class
	}
}

public class InheritanceAndStatic {

	public static void main(String[] args) {
		
		Super3 var1 = new Super3(); // class variable cnt will be increased.
		Super3 var2 = new Super3();
		
		System.out.println(var2.cnt); // 2
		
		// during creation of instance, constructor of parent class will be called.
		// so, value of class variable will be increased.
		Sub3 var3 = new Sub3();
		var3.showCnt();
		
	}

}
