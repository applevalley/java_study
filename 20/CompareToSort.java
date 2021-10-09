package ch20;

import java.util.Arrays;

class Menu implements Comparable {
	private String name;
	private int price;
	
	public Menu(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	@Override
	public int compareTo(Object obj) {
		Menu m = (Menu)obj;
		if(this.price > m.price) return 1;  // 1�� -1�� �ڹٲٸ� �������� ������ �ȴ�!
		else if(this.price < m.price) return -1;
		else return 0;
	}
	
	@Override
	public String toString() {
		return name + ": " + price;
	}
}
public class CompareToSort {

	public static void main(String[] args) {

		Menu[] menu = new Menu[3];
		menu[0] = new Menu("������", 15000);
		menu[1] = new Menu("¥���", 4000);
		menu[2] = new Menu("«��", 5500);
		
		Arrays.sort(menu);
		for(Menu m : menu) {
			System.out.print(m + " ");
		}
	}

}
