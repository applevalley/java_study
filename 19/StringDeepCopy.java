package ch19;

class Tangsu implements Cloneable {
	private String name;
	private int price;
	
	public Tangsu(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
//	@Override
//	public Object clone() throws CloneNotSupportedException {
//		Tangsu small = (Tangsu)super.clone();    // clone �޼��� ȣ���� ���� ���纻 ����
//		small.name = new String(name);           // ���� ������ ���·� ���纻 �ϼ�
//		return small;                            // ���纻�� ���� �� ��ȯ
//	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();   // �� ���� �� �ո����̴�
	}
}

public class StringDeepCopy {

	public static void main(String[] args) {

	}

}
