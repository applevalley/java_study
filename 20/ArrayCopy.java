package ch20;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {

		int[] arr1 = {1, 3, 5, 7, 9};
		
		int[] arr2 = Arrays.copyOf(arr1, arr1.length);
		int[] arr3 = Arrays.copyOf(arr1, 2);
		
		for(int i : arr2) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for(int i : arr3) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		int[] arr4 = Arrays.copyOfRange(arr1, 2, 5);
		
		for(int i : arr4) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		int[] arr5 = new int[5];
		System.arraycopy(arr1, 0, arr5, 0, arr1.length);
		
		for(int i: arr5) {
			System.out.print(i + " ");
		}
	}

}
