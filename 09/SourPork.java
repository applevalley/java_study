package ch09;

public class SourPork {    // public 선언 - 어디서든 인스턴스 호출 가능

	int charge;
	
	public void Order() {
		System.out.println("주문이 들어왔습니다.");
	}
	
	void makeTangSu() {   // default 선언
		System.out.println("탕수육을 만듭니다");
	}
	
	private void Pay() {
		System.out.println("계산해주세요!");
	}

}
