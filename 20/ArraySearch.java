package ch20;

import java.util.Arrays;

public class ArraySearch {

	public static void main(String[] args) {

		int[] arr1 = {1, 2, 5, 7, 8, 0, 12};
		Arrays.sort(arr1);
		
		for(int i: arr1) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		int idx = Arrays.binarySearch(arr1, 8);  // arr1 안에 8이 있을까?
		System.out.println(idx);  // 찾았다!
	}

}
