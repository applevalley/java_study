package ch20;

public class WrapperClass {

	public static void showData(Object obj) {
		System.out.println(obj);
	}
	
	public static void main(String[] args) {

		Integer intV = new Integer(10);  // creation of Wrapper Instance covers integer value 10
		showData(intV);
		showData(new Character('A'));
	}
}
