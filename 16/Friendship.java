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
		System.out.println("이름: " + name + " 전공: " + major + " 번호: " + telNum);
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
		System.out.println("이름: " + name + " 전공: " + part + " 번호: " + telNum);
	}
}


public class Friendship {

	public static void main(String[] args) {
		
		RealFriend[] ref = new RealFriend[3];
		FakeFriend[] faf = new FakeFriend[3];
		
		int reNum = 0;
		int faNum = 0;
		
		ref[reNum++] = new RealFriend("김철수", "경영학과", "010-0000-0000");
		ref[reNum++] = new RealFriend("김영희", "간호학과", "010-1111-1111");
		
		faf[faNum++] = new FakeFriend("박영철", "개발 1팀", "010-2222-2222");
		faf[faNum++] = new FakeFriend("오영택", "인사과", "010-3333-3333");
		
		for(int i = 0; i < reNum; i++) {
			ref[i].showInfo();
		}
		
		System.out.println();
		
		for(int i = 0; i < faNum; i++) {
			faf[i].showInfo();
		}
	}

}
