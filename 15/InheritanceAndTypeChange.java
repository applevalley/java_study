package ch15;

class Noodle {
	
	Noodle() {
		
	}
	
	public void Introduce() {
		System.out.println("Noodle");
	}
}

class HotNoodle extends Noodle {
	
	HotNoodle() {
		
	}
	
	public void HotIntroduce() {
		System.out.println("Hot");
	}
}

class SpicyHotNoodle extends HotNoodle {
	
	SpicyHotNoodle() {
		
	}
	
	public void SpicyIntroduce() {
		System.out.println("Spicy");
	}
}

public class InheritanceAndTypeChange {

	public static void main(String[] args) {

		Noodle noodle1 = new HotNoodle();
		noodle1.Introduce(); // noodle1 only access to his method Introduce.
		
		System.out.println();
		
		HotNoodle noodle2 = new SpicyHotNoodle();
		noodle2.Introduce(); // noodle2 can access to method Introduce from class he inherited.
		noodle2.HotIntroduce(); // and also access to his method HotIntroduce.
		
		HotNoodle noodle3 = new HotNoodle();
		Noodle noodle4 = noodle3; // it works!
		
//		Noodle noodle5 = new HotNoodle();
//		HotNoodle noodle6 = noodle5;    it doesn't work! 
		
		// why?
		// because JVM judges possibility for substitution with type information of reference variable.
		
		// Noodle noodle5 = ...
		// in this case, we can't assure the instance noodle5 refers is instance from HotNoodle.
		// maybe it could be a instance from another class inherits class Noodle. so, it's not granted.
		// but if type of reference variable changed explicitly, substitution works.
		
		Noodle noodle5 = new HotNoodle();
		HotNoodle noodle6 = (HotNoodle)noodle5;
	}

}
