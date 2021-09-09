package ch11;

class printString {
	public static void printStr(String str) {
		System.out.println(str);
		System.out.println("문자열의 길이는: " + str.length());
	}
}

public class StringInstance {

	public static void main(String[] args) {

		String str1 = "Hello, World!";
		String str2 = new String("HiHi");
		
		System.out.println(str1);
		System.out.println(str1.length() + "\n");
		
		System.out.println(str2);
		System.out.println(str2.length() + "\n");
		
		// It looks like sending String to method. but it's not true!
		// method takes reference value from String instance made with "I love Java".
		printString.printStr("I love Java");
	}

}
