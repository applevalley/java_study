package ch13;

class Employee {
	private String name;
	private String part;
	private String rank;
	
	Employee (String name, String part, String rank) {
		this.name = name;
		this.part = part;
		this.rank = rank;
	}
	
	Employee (String name, String rank) {
		this (name, "undefined", rank);
	}
	
	public String setPart(String part) {
		this.part = part;
		return part;
	}
	
	public String getPromote (String after) {
		this.rank = after;
		System.out.println(name + "ÀÌ(°¡) " + after + "(À¸)·Î ½ÂÁøÇÏ¿´½À´Ï´Ù.");
		return after;
	}
	
	public String getName() {
		return name;
	}
	
	public String getPart() {
		return part;
	}
}

public class EnhancedFor {

	public static void main(String[] args) {

		double[] arr1 = {1.0, 4.0, 9.0, 25.0};
		
		for (double e: arr1) {
			e = Math.sqrt(e);
			System.out.println(e);
		}
		
		int sum = 0;
		
		for (int i=0; i<arr1.length; i++) {
			sum += (int)arr1[i];
		}
		
		System.out.println("ÃÑ ÇÕÀº: " + sum + "\n");
		
		Employee[] arr2 = new Employee[3];
		
		arr2[0] = new Employee("±èÃ¶¼ö", "°³¹ß1ÆÀ", "°úÀå");
		arr2[1] = new Employee("ÀÌ¿µÈñ", "¿µ¾÷2ÆÀ", "´ë¸®");
		arr2[2] = new Employee("¹Ú¿µ½Ä", "ÀÎÅÏ");
		
		System.out.println(arr2[2].getPart());
		System.out.println(arr2[2].setPart("°³¹ß2ÆÀ"));
		System.out.println(arr2[2].getPromote("»ç¿ø"));
		
		System.out.println(arr2[2].getPart());
		
		for (Employee e:arr2) {
			if (e.getName() == "±èÃ¶¼ö") {
				System.out.println(e.getName());
			}
		}
	}

}
