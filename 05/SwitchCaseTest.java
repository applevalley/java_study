package ch16;

import java.util.Scanner;

public class SwitchCaseTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		
//		int day;
		// 각 조건에 해당했을 경우 break로 빠져나올 것! 안 그러면 모든 조건을 다 순회한다.
		// 하나씩 다 적어줄 경우
//		switch(month) {
//			case 1: day = 31;
//				break;
//			case 2: day = 28;
//				break;
//			case 3: day = 31;
//				break;
//			case 4: day = 30;
//				break;
//			case 5: day = 31;
//				break;
//			case 6: day = 30;
//				break;
//			case 7: day = 31;
//				break;
//			case 8: day = 31;
//				break;
//			case 9: day = 30;
//				break;
//			case 10: day = 31;
//				break;
//			case 11: day = 30;
//				break;
//			case 12: day = 31;
//				break;
//			default:
//				System.out.println("존재하지 않는 달입니다.");
//				day = -1;
//		}
		
		// 조금 더 간소화
//		switch(month) {
//			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
//				day = 31;
//				break;
//			case 2:
//				day = 28;
//				break;
//			case 4: case 6: case 9: case 11:
//				day = 30;
//				break;
//			default:
//				System.out.println("존재하지 않는 달입니다.");
//				day = -1;
//		}
		
		int day = switch(month) {
			case 1, 3, 5, 7, 8, 10, 12 -> {  // 수행할 문장이 더 있다면 중괄호
				System.out.println("이번 달은 31일까지입니다.");
				yield 31;
			}
			case 2 ->   // 이렇게 값만 내보낼수도 있다.
				28;
			case 4, 6, 9, 11 ->
				30;
			default -> {
				System.out.println("존재하지 않는 달입니다.");
				yield -1;
			}
		};
		System.out.println(month + "월은 " + day + "일입니다.");
	}

}
