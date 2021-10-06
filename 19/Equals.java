package ch19;

class ChineseFood {
	private String menu;
	
	public ChineseFood(String menu) {
		this.menu = menu;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this.menu == ((ChineseFood)obj).menu) {
			return true;
		}
		else {
			return false;
		}
	}
}

public class Equals {

	public static void main(String[] args) {

		ChineseFood food1 = new ChineseFood("������");
		ChineseFood food2 = new ChineseFood("«��");
		ChineseFood food3 = new ChineseFood("������");
		
		if(food1.equals(food2)) {
			System.out.println("���� �޴��Դϴ�.");
		}
		else {
			System.out.println("�ٸ� �޴��Դϴ�.");
		}
		
		if(food1.equals(food3)) {
			System.out.println("���� �޴��Դϴ�.");
		}
		else {
			System.out.println("�ٸ� �޴��Դϴ�.");
		}
		
	}

}
