package ch11;

class NewEmployee {
	private String team;
	private String name;
	private int empNum;
	
	// two or more constructors could declared if they have different parameters.
	// it means we can overload constructors.
	NewEmployee(String tname, String ename, int number) {
		team = tname;
		name = ename;
		empNum = number;
	}
	
	NewEmployee(String tname, String ename) {
		team = tname;
		name = ename;
		empNum = 0;
	}
	
	// this!
	// it means another constructor overloaded.
	// this constructor just takes arguments, and send them to another constructor has same parameters.
	// in this case, constructor has tname, ename will work. and empNum from this instance will be 0.
	// with declaration constructor via this, we can reduce redundant code about initialization.
	NewEmployee(String ename) {
		this("undefined", ename);
	}
	
	void introduceNewEmployee() {
		System.out.println("team: " + team);
		System.out.println("name: " + name);
		
		if (empNum == 0) {
			System.out.println("employeeNum is not found." + "\n");
		}
		else {
			System.out.println("his employeeNum is: " + empNum + "\n");
		}
	}
}

public class OverloadingWithConstructor {

	public static void main(String[] args) {

		NewEmployee kim = new NewEmployee("Dev", "Dave Kim", 123213);
		NewEmployee lee = new NewEmployee("HR", "Susan Lee");
		
		kim.introduceNewEmployee();
		lee.introduceNewEmployee();
		
		NewEmployee park = new NewEmployee("John Park");
		park.introduceNewEmployee();
	}

}
