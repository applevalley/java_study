package ch20;

import java.util.Arrays;

class Num {
	private int num;
	
	public Num(int num) {
		this.num = num;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this.num == ((Num)obj).num) { // 형 변환하는 이유는? obj는 Object형이니까! Object의 멤버에만 접근한다.
			return true;
		}
		else return false;
	}
}

public class ArrayEqual {

	public static void main(String[] args) {

		String[] arr1 = {"a", "b", "c"};
		String[] arr2 = Arrays.copyOf(arr1, arr1.length);
		
		// System.out.println(arr1.equals(arr2));  // 별도의 오버라이딩 없이 이렇게만 하면 당연히 false! arr1과 arr2는 다른 인스턴스다
		System.out.println(Arrays.equals(arr1, arr2));  // true
		
		Num[] arr3 = new Num[3];
		Num[] arr4 = new Num[3];
		
		arr3[0] = new Num(1); arr4[0] = new Num(1);
		arr3[1] = new Num(2); arr4[1] = new Num(2);
		arr3[2] = new Num(3); arr4[2] = new Num(3);
		
		System.out.println(Arrays.equals(arr3, arr4)); // 여기서도 별도의 오버라이딩이 없다면 당연히 false! 
	}

}
