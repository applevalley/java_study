package ch10;

class House {
	static final int price = 10000;
	private int size;
	
	House(int si) {
		size = si;
	}
	
	void price() {
		int fullprice = (size * price);
		System.out.println("size x price = " + fullprice);
	}
	
}

public class UtilizeClassVariable {

	public static void main(String[] args) {

		House ho = new House(30);
		ho.price();
	}

}
