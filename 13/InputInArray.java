package ch13;

import java.util.Arrays;

public class InputInArray {

	public static void main(String[] args) {

		int[] arr1 = new int[5];
		
		for (int i = 0; i < 5; i++) {
			arr1[i] = i;
			System.out.print(arr1[i]);
		}
		System.out.println();
		
		
		int[] arr2 = new int[5];
		Arrays.fill(arr2, 3);
		Arrays.fill(arr2, 3, arr2.length, 10);
		System.arraycopy(arr1, 0, arr2, 0, 1);
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		
		for (int i=0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
	}

}
