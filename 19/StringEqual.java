package ch19;

public class StringEqual {

	public static void main(String[] args) {

		String str1 = new String("Hey");
		String str2 = new String("Hey");
		
		if(str1 == str2) {
			System.out.println("�����ϴ�.");
		}
		else {
			System.out.println("�ٸ��ϴ�.");
		}
		
		if(str1.equals(str2)) {
			System.out.println("������ �����ϴ�.");
		}
		else {
			System.out.println("������ �ٸ��ϴ�.");
		}
	}

}
