package ch11;

public class StringMethods {

	public static void main(String[] args) {

		// concat
		String str1 = new String("Hello, ");
		String str2 = ("World!");
		
		System.out.println(str1.concat(str2));
		
		String str3 = ("Java ");
		
		System.out.println(str1.concat(str3.concat(str2)) + "\n");   // nested concat
		
		// + and += calculation with String
		System.out.println(str1 + str2); // compiler turns this statement to System.out.println(str1.concat(str2));
		// so, we can use + operator anywhere.
		String plusstr = "Happy " + "Programming"; 
		System.out.println(plusstr);
		
		plusstr += "!!";
		System.out.println(plusstr);
		
		System.out.println("age: " + 29); // we can + calculation with String and other type
//		String age = "age: ".concat(29); it makes compile error! concat method takes reference value from String instance.
		String age = "age: ".concat(String.valueOf(29)); // correct! it fulfill condition of concat method.
		System.out.println(age);
		
		// substring
		String str4 = str1.concat(str3.concat(str2));
		
		System.out.println(str4.substring(7));     // it returns string instance from seventh index to end index from str4.
		System.out.println(str4.substring(7, 11) + "\n"); // range is -> start ~ (end - 1)
		
		// comparing
		String str5 = ("Elephant");
		String str6 = ("elephant");
		int comp;
		
		if (str5.equals(str6)) { // two instances have same String, it will return true.
			System.out.println("same String");
		}
		else {
			System.out.println("different String");
		}
		
		// it compare instances lexicographically.
		// most of cases, upper cases are located in front of lower cases.
		comp = str5.compareTo(str6); 
		
		if (comp == 0) {
			System.out.println("same String");
		}
		else if (comp < 0) { // if String of first instances located earlier than the other, the value lower than 0.
			System.out.println("Lexicographically front: " + str5);
		}
		else { 
			System.out.println("Lexicographically front: " + str6);
		}
		
		// this method regards upper case and lower case as same String!
		if (str5.compareToIgnoreCase(str6) == 0) {
			System.out.println("same String");
		}
		else {
			System.out.println("different String");
		}
		System.out.println();
		
		// another types to String
		long num1 = 12983391L;
		String str7 = String.valueOf(num1);
		System.out.println(str7);
		
		
	}

}
