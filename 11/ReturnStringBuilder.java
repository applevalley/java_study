package ch11;

public class ReturnStringBuilder {

	public static void main(String[] args) {

		StringBuilder str1 = new StringBuilder("123");
		StringBuilder str2 = str1.append("45678"); // it returns reference value of instance called append method!
		// so, str2 refers str1. reference value of str1 is 12345678.
		// after that statement, str1 and str2 refers same instance.
		
		str2.delete(0, 3);
		
		System.out.println(str1.toString());
		System.out.println(str2.toString());
		
		if (str1 == str2) {
			System.out.println("refers same instance");
		}
		else {
			System.out.println("refers another instance");
		}
	}

}
