package ch11;

public class StringBuilderTest {

	public static void main(String[] args) {
		// creation of instance contains String abc
		StringBuilder mystr = new StringBuilder("abc");
		
		mystr.append("d"); // add String d in instance
		System.out.println(mystr.toString());
		
		mystr.delete(3, 4);   // delete from third element to (fourth - 1) element
		System.out.println(mystr.toString());
		
		mystr.replace(0, 3, "456");   // replace some elements in instance
		System.out.println(mystr.toString());
		
		mystr.reverse();   // reverse elements
		System.out.println(mystr.toString());
		
		String mystr2 = mystr.substring(0, 2);   // returns some elements to String
		System.out.println(mystr2); // just mystr2! this instance not in StringBuilder Class
		
	}

}
