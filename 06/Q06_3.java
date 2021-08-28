package ch06;

public class Q06_3 {

	public static void main(String[] args) {

		int num1 = 8;
		System.out.println(recur(num1));
	}
	
	public static int recur(int num1) {
		if (num1 == 1) {
			System.out.println("나누기 끝! 이제부터 반환 들어갑니다");
			return 1;
		}
		
		else {
			System.out.println("이제부터 " + num1 +" 을 반으로 나눠보겠습니다 ");
			int temp = recur((int) num1 / 2);
			System.out.println(temp);
			return temp;
		}
	}

}
