package ch10;

class WayToAccess {
	static int num = 0;
	
	WayToAccess() {
		increaseNum();
	}
	
	void increaseNum() {
		num++;
	}
}

public class ClassVariableAccess {

	public static void main(String[] args) {

		WayToAccess access = new WayToAccess();  // reference variable access created
		System.out.println(WayToAccess.num);     // access via name of variable (inner class access) 
		access.num++;
		System.out.println(WayToAccess.num);     // access via name of instance (outer class access)
		WayToAccess.num++;
		System.out.println(WayToAccess.num);     // access via name of class (outer class access)
		System.out.println("num = " + WayToAccess.num);
	}

}
