package ch10;

class NoInstance {
	static int num = 50;
	
	NoInstance() {
		num++;
		System.out.println("instance created: " + num);
	}
}

public class ClassWithoutInstance {

	public static void main(String[] args) {

		// method NoInstance() didn't run!
		// the result of an operation is 40. not 41!
		NoInstance.num -= 10;
		System.out.println(NoInstance.num);
		
		// reference instance created.
		// now, method NoInstance() work!
		// value of variable is 41.
//		NoInstance no1 = new NoInstance();
	}

}
