package ch18;

import java.util.InputMismatchException;

import java.util.Scanner;

public class Exception2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		int people = sc.nextInt();
		int bigSize = 20000;
		int mediumSize = 18000;
		int smallSize = 15000;
		
		System.out.println("hello, this is chinese restaurant double dragon." + "\n");
		
		try {
			if(money > bigSize) {
				System.out.println("big size");
				System.out.println("Let's pay it");
				System.out.println("money to pay for each person is " + (bigSize / people));
				System.out.println("Here you are");
				
			}
			else if(money > mediumSize) {
				System.out.println("medium size");
				System.out.println("money to pay for each person is " + (mediumSize / people));
				System.out.println("Here you are");		
			}
			else if(money > smallSize) {
				System.out.println("small size");
				System.out.println("money to pay for each person is " + (smallSize / people));
				System.out.println("Here you are");		
			}
			else {
				System.out.println("go away");
			}
		}
		catch(ArithmeticException | InputMismatchException e){
			e.getMessage();
		}
		
	}

}
