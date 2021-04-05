package ch19;

public class ForTest {

	public static void main(String[] args) {

		int count = 1;
		int sum = 0;
		
		for (int i=0; i < 10; i++, count++) {
			sum += count;
			
		}
		System.out.println(sum);
		
		// while을 이용한 경우
		
		int num = 1;
		int total = 0;
		
		while (num <= 10) {
			total += num;
			num++;
		}
		System.out.println(total);
	}

}
