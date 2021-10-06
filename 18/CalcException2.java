package ch18;

public class CalcException2 {

	public static void sum1(int x) {
		sum2(x, 0);
	}
	
	public static void sum2(int i, int j) {
		int x = i / j;
	}
	
	public static void main(String[] args) {

		try {
			sum1(3);
		}
		catch(Throwable e) {
			e.printStackTrace();
		}
		
		System.out.println("Bye Bye");
	}

}
