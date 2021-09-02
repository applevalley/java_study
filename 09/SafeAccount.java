package ch09;

class GoodAccount {
	
	private int money = 0;
	
	public GoodAccount(int coin) {
		setAccount(coin);
	}
	
	public void setAccount(int coin) {
		if (coin < 0) {
			money = 0;
			return;
		}
		money = coin;
	}
	
	public int getAccount() {
		return money;
	}
	
	public int deposit(int coin) {
		if (coin < 0) {
			System.out.println("�Աݾ��� 0���� �۽��ϴ�.");
			return money;
		}
		
		money += coin;
		System.out.println("�Ա��Ͻ� �ݾ��� " + coin);
		return money;
	}
}

public class SafeAccount {

	public static void main(String[] args) {

		GoodAccount a = new GoodAccount(10000);
		System.out.println(a.getAccount());
		
		a.setAccount(20000);
		System.out.println(a.getAccount());
		
		a.setAccount(-1000);
		System.out.println(a.getAccount());
		
//		a.money = -5000;                 it causes compile error!
//		System.out.println(a.getAccount());
	}

}
