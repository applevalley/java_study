package ch16;

class Friend {
	private String name;
	private String telNum;
	
	public Friend(String name, String telNum) {
		this.name = name;
		this.telNum = telNum;
	}
	
	public void showInfo() {
		System.out.print("이름: " + name + " 번호: " + telNum);
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
		System.out.println(" 전공: " + major);
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
		System.out.println(" 부서: " + part);
	}
}

public class ImprovedFriendship {

	public static void main(String[] args) {

		Friend[] fr = new Friend[4];
		int cnt = 0;
		
		fr[cnt++] = new RealFriends("김철수", "010-0000-0000", "경영학과");
		fr[cnt++] = new RealFriends("이영희", "010-1111-1111", "컴퓨터공학과");
		fr[cnt++] = new FakeFriends("박지성", "010-2222-2222", "체육학과");
		fr[cnt++] = new FakeFriends("오미란", "010-3333-3333", "실용음악과");
		
		for(int i = 0; i < fr.length; i++) {
			fr[i].showInfo();
		}

		
	}

}
