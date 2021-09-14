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

// StringBuilder�� Ŭ���� Call ��� public String toString() �޼��尡 ���ǵǾ� ����
public class StringCall {

	public static void main(String[] args) {

		StringBuilder str1 = new StringBuilder("hello");
		str1.append("hihihi");
		System.out.println(str1.toString());       // toString() �޼��尡 ��ȯ�ϴ� ���ڿ� ���
		System.out.println(str1);                  // �ν��Ͻ��� ���� ���� �Ѱܵ� ������ ��� �����
		
		Call callstr = new Call("Pizza");
		System.out.println(callstr.toString());
		System.out.println(callstr);
	}

}
