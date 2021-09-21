package ch16;

class RealFriend {
	private String name;
	private String major;
	private String telNum;
	
	RealFriend() {}
	
	RealFriend(String name, String major, String telNum) {
		this.name = name;
		this.major = major;
		this.telNum = telNum;
	}
	
	public void showInfo() {
		System.out.println("�̸�: " + name + " ����: " + major + " ��ȣ: " + telNum);
	}
}

class FakeFriend {
	private String name;
	private String part;
	private String telNum;
	
	FakeFriend() {}
	
	FakeFriend(String name, String part, String telNum) {
		this.name = name;
		this.part = part;
		this.telNum = telNum;
	}
	
	public void showInfo() {
		System.out.println("�̸�: " + name + " ����: " + part + " ��ȣ: " + telNum);
	}
}


public class Friendship {

	public static void main(String[] args) {
		
		RealFriend[] ref = new RealFriend[3];
		FakeFriend[] faf = new FakeFriend[3];
		
		int reNum = 0;
		int faNum = 0;
		
		ref[reNum++] = new RealFriend("��ö��", "�濵�а�", "010-0000-0000");
		ref[reNum++] = new RealFriend("�迵��", "��ȣ�а�", "010-1111-1111");
		
		faf[faNum++] = new FakeFriend("�ڿ�ö", "���� 1��", "010-2222-2222");
		faf[faNum++] = new FakeFriend("������", "�λ��", "010-3333-3333");
		
		for(int i = 0; i < reNum; i++) {
			ref[i].showInfo();
		}
		
		System.out.println();
		
		for(int i = 0; i < faNum; i++) {
			faf[i].showInfo();
		}
	}

}
