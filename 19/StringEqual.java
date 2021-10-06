package ch19;

public class StringEqual {

	public static void main(String[] args) {

		String str1 = new String("Hey");
		String str2 = new String("Hey");
		
		if(str1 == str2) {
			System.out.println("같습니다.");
		}
		else {
			System.out.println("다릅니다.");
		}
		
		if(str1.equals(str2)) {
			System.out.println("내용이 같습니다.");
		}
		else {
			System.out.println("내용이 다릅니다.");
		}
	}

}
