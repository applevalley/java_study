package ch10;

import java.time.LocalDate;

class InputBlock {
	static String date;
	
	static {
		LocalDate nDate = LocalDate.now();
		date = nDate.toString();
	}
}

public class StaticBlock {

	public static void main(String[] args) {
		
//		System.out.println(date);
	}

}
