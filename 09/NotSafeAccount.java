package ch09;

class Account {
	
	int money = 0;
	
	public Account(int coin) {
		setAccount(coin);
	}
	
	public void setAccount(int coin) {
		if (coin < 0) {
			money = 0;
			return;
		}
		money = coin;
	}
	
	public int getMoney() {
		return money;
	}
	
	public int deposit(int coin) {
		if (coin < 0) {
			System.out.println("0���� �۽��ϴ�.");
			return money;
		}
		
		money += coin;
		System.out.println("�Աݵ� �ݾ��� " + coin);
		return money;
	}
}

public class NotSafeAccount {

	public static void main(String[] args) {

		Account a = new Account(10000);
		System.out.println(a.getMoney());
		
		a.setAccount(20000);
		System.out.println(a.getMoney());
		
		a.setAccount(-1000);
		System.out.println(a.getMoney());
		
		a.money = -5000;                // �ν��Ͻ� ������ ���� �����ص� �� ���ư���
		System.out.println(a.getMoney());
	}

}
