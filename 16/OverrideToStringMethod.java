package ch16;

class Chicken {
	public String toString() {
		System.out.println(super.toString());
		return "Fried Chicken";
	}
}

class TastyChicken extends Chicken {
	public String toString() {
		return "Tasty Fried Chicken";
	}
}
public class OverrideToStringMethod {

	public static void main(String[] args) {

		Chicken c1 = new Chicken();
		Chicken c2 = new TastyChicken();
		
		System.out.println(c1);
		System.out.println(c2);
	}

}
