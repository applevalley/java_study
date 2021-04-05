package ch11;

public class OperatorTest {

	public static void main(String[] args) {

		int gameScore = 160;
		int gameScore2 = 160;
		
		int lastScore = ++gameScore; // gameScore += 1;
		int lastScore2 = gameScore2++;
		
		System.out.println(lastScore);
		System.out.println(gameScore);
		
		System.out.println(lastScore2);
		System.out.println(gameScore2);
	}

}
