package ch16;

class Friend {
	private String name;
	private String telNum;
	
	public Friend(String name, String telNum) {
		this.name = name;
		this.telNum = telNum;
	}
	
	public void showInfo() {
		System.out.print("�̸�: " + name + " ��ȣ: " + telNum);
	}
}

class RealFriends extends Friend {
	private String major;
	
	RealFriends(String name, String telNum, String major) {
		super(name, telNum);
		this.major = major;
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println(" ����: " + major);
	}
}

class FakeFriends extends Friend {
	private String part;
	
	FakeFriends(String name, String telNum, String part) {
		super(name, telNum);
		this.part = part;
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println(" �μ�: " + part);
	}
}

public class ImprovedFriendship {

	public static void main(String[] args) {

		Friend[] fr = new Friend[4];
		int cnt = 0;
		
		fr[cnt++] = new RealFriends("��ö��", "010-0000-0000", "�濵�а�");
		fr[cnt++] = new RealFriends("�̿���", "010-1111-1111", "��ǻ�Ͱ��а�");
		fr[cnt++] = new FakeFriends("������", "010-2222-2222", "ü���а�");
		fr[cnt++] = new FakeFriends("���̶�", "010-3333-3333", "�ǿ����ǰ�");
		
		for(int i = 0; i < fr.length; i++) {
			fr[i].showInfo();
		}

		
	}

}
