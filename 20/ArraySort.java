package ch20;

import java.util.*;

public class ArraySort {

	public static void main(String[] args) {

		Random random = new Random();
		int[] arr1 = new int[5];
		double[] arr2 = new double[5];
		
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = random.nextInt(10);
		}
		
		for(int i = 0; i < arr2.length; i++) {
			arr2[i] = random.nextDouble();
		}
		
		// 정렬의 시간이다
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		for(int i : arr1) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for(double d : arr2) {
			System.out.print(d + " ");
		}
		System.out.println();
	}

}
