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

		ChineseFood food1 = new ChineseFood("탕수육");
		ChineseFood food2 = new ChineseFood("짬뽕");
		ChineseFood food3 = new ChineseFood("탕수육");
		
		if(food1.equals(food2)) {
			System.out.println("같은 메뉴입니다.");
		}
		else {
			System.out.println("다른 메뉴입니다.");
		}
		
		if(food1.equals(food3)) {
			System.out.println("같은 메뉴입니다.");
		}
		else {
			System.out.println("다른 메뉴입니다.");
		}
		
	}

}
