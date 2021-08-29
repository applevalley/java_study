package java07;

public class StringClassTest {

	public static void main(String[] args) {
		String word1 = "Hello"; // 문자열의 선언과 동시에 word1이라는 참조 변수가 String 클래스의 인스턴스인 Hello를 참조하게 된다.
		String word2 = "World!";
		
		printMyString(word1); 
	}
	
	// 매개변수로 String 참조 변수를 선언해 문자열을 인자로 받는다
	public static void printMyString(String word) {
		System.out.println(word);
	}

}
