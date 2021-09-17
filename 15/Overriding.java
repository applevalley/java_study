package ch15;

class Beef {
	public void yamyam() {
		System.out.println("I like beef!");
	}
}

class GrilledBeef extends Beef{
	public void yamyam() {
		System.out.println("I like grilled beef!"); // override yamyam method of Beef class
	}
}

class GrilledBeefStake extends GrilledBeef {
	public void yamyam() {
		System.out.println("I like grilled beef stake!"); // override yamyam method of GrilledBeef class
	}
}


public class Overriding {

	public static void main(String[] args) {

		// defining again methods defined in parent class called method overriding.
	
		
		Beef b1 = new GrilledBeef();
		GrilledBeef b2 = new GrilledBeefStake();
		
		b1.yamyam();
		b2.yamyam();
	}

}
