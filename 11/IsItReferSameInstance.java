package ch11;

public class IsItReferSameInstance {

	public static void main(String[] args) {

		String str1 = "My String";
		String str2 = "My String";
		
		String str3 = new String("Helloo");
		String str4 = new String("Helloo");
		
		// == calculation about reference variable compares reference value from reference variable.
		// in this case, two reference instance refer same String.
		// so, create one instance and share it to instance refer it.
		// the number of instance created reduce, and performances are increase!
		if (str1 == str2) {    // == if (str1.equals(str2))
			System.out.println("both variable refer same instance");
		}
		else {
			System.out.println("they refer another instance");
		}
		
		// instance from String class is immutable!
		// if the situation refer same instance make trouble, make String instance with new declaration.
		// the result of calculation will be false!
		if (str3 == str4) {
			System.out.println("both variable refer same instance");
		}
		else {
			System.out.println("they refer another instance");
		}
	}

}
