package ch11;

class Square {
	private int length;
	
	
	Square(int length) {
		// length = length;    in this area, length means parameter. not instance variable!
		this.length = length;  // Constructor can access to instance variable with "this" even inner method area.
	}
	
	void setSquare(int length) {
		this.length = length;
	}
	
	void squareArea() {
		System.out.println(length * 4);
	}
}

public class InstanceVariableAccessWithThis {

	public static void main(String[] args) {

		Square box = new Square(4);
		box.squareArea();
		
		box.setSquare(23);
		box.squareArea();
	}

}
