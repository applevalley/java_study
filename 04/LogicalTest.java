package ch12;

public class LogicalTest {

	public static void main(String[] args) {

		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 = num1 + 10) < 10) &&  ((i = i + 2) < 10);
		// 앞의 항이 false이기에 뒤의 항을 평가하지 않는다
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		// and가 아닌 or라면?
		
		int num2 = 10;
		int j = 2;
		boolean value2 = ((num2 = num2 + 10) < 10) ||  ((j = j + 2) < 10);
		// 앞의 항이 false이지만 하나만 true여도 참이 되기에 뒤의 항까지 평가를 한다.
		// 만약 앞의 항이 (num2 = num2 + 10) > 10)였다면, 앞의 항이 true이기에 거기서 종료된다.
		System.out.println(value2);
		System.out.println(num2);
		System.out.println(j);
	}

}
