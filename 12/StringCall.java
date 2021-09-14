package ch12;

class Call {
	private String myStr;
	
	Call(String str) {
		this.myStr = str;
	}
	
	public String toString() {
		return myStr;
	}
	
	
}

// StringBuilder와 클래스 Call 모두 public String toString() 메서드가 정의되어 있음
public class StringCall {

	public static void main(String[] args) {

		StringBuilder str1 = new StringBuilder("hello");
		str1.append("hihihi");
		System.out.println(str1.toString());       // toString() 메서드가 반환하는 문자열 출력
		System.out.println(str1);                  // 인스턴스의 참조 값을 넘겨도 동일한 출력 결과가
		
		Call callstr = new Call("Pizza");
		System.out.println(callstr.toString());
		System.out.println(callstr);
	}

}
