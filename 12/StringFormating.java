package ch12;

public class StringFormating {

	public static void main(String[] args) {

		int age = 29;
		double height = 182.0;
		String name = "applevalley";
		
		System.out.printf("이름은: %s", name + "\n");
		System.out.printf("나이는 %d, 키는 %f \n", age, height); // height 뒤에 + "\n"같이 쓰니까 오류가 발생했다!
		System.out.format("안녕하세요, %s", name);
	}

}
