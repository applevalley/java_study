package ch10;

class IncNum {
	static int increNum = 0; // class variable declaration -> every instance from this class will share this variable
	
	IncNum() {
		increNum++;
		System.out.println("value: " + increNum);
	}
}

class ConNum {
	int conNum = 0;  // instance variable declaration -> this instance will not shared in another instance
	
	ConNum() {
		conNum++;
		System.out.println("value: " + conNum);
	}
}

public class ClassVariable {

	public static void main(String[] args) {

		IncNum inc1 = new IncNum(); 
		IncNum inc2 = new IncNum();
		IncNum inc3 = new IncNum();
		
		System.out.println();
		
		ConNum con1 = new ConNum();
		ConNum con2 = new ConNum();
		ConNum con3 = new ConNum();
	}

}
