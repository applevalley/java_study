package ch20;

import java.util.Arrays;

class Num {
	private int num;
	
	public Num(int num) {
		this.num = num;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this.num == ((Num)obj).num) { // �� ��ȯ�ϴ� ������? obj�� Object���̴ϱ�! Object�� ������� �����Ѵ�.
			return true;
		}
		else return false;
	}
}

public class ArrayEqual {

	public static void main(String[] args) {

		String[] arr1 = {"a", "b", "c"};
		String[] arr2 = Arrays.copyOf(arr1, arr1.length);
		
		// System.out.println(arr1.equals(arr2));  // ������ �������̵� ���� �̷��Ը� �ϸ� �翬�� false! arr1�� arr2�� �ٸ� �ν��Ͻ���
		System.out.println(Arrays.equals(arr1, arr2));  // true
		
		Num[] arr3 = new Num[3];
		Num[] arr4 = new Num[3];
		
		arr3[0] = new Num(1); arr4[0] = new Num(1);
		arr3[1] = new Num(2); arr4[1] = new Num(2);
		arr3[2] = new Num(3); arr4[2] = new Num(3);
		
		System.out.println(Arrays.equals(arr3, arr4)); // ���⼭�� ������ �������̵��� ���ٸ� �翬�� false! 
	}

}
