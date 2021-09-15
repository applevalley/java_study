package ch13;

public class Q13_2 {

	public static void addOneDArr(int[] arr, int add) {
		for(int i = 0; i < arr.length; i++) {
			arr[i] += add;
		}
	}
	
	public static void addTwoDArr(int[][] arr, int add) {
		for(int i = 0; i < arr.length; i++) {
			addOneDArr(arr[i], add);
		}
	}
	
//	public static int[][] changeArray(int[][] arr) {
//		int[][] newArr = new int[arr.length][];
//		newArr[0] = arr[arr.length - 1];
//		System.arraycopy(arr, 0, newArr, 1, arr.length - 1);
//		
//		return newArr;
//	}
	
	public static void shiftArray(int[][] arr) {
		int[] last = arr[arr.length - 1];
		
		for(int i = arr.length - 1; i > 0; i--) {
			arr[i] = arr[i - 1];
		}
		
		arr[0] = last;
	}
	
	public static void main(String[] args) {

		int[] arr1 = {0, 0, 0, 0, 0};
		addOneDArr(arr1, 5);
		
		for(int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		
		int[][] arr2 = {
				{1, 1, 1},
				{2, 2, 2},
				{3, 3, 3}
		};
		addTwoDArr(arr2, 5);
		
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
		
		
		int[][] arr3 = {
				{1, 2, 3},
				{4, 5, 6}, 
				{7, 8, 9}		
		};
		
		shiftArray(arr3);
		
		for(int i = 0; i < arr3.length; i++) {
			for(int j = 0; j < arr3[i].length; j++) {
				System.out.print(arr3[i][j]);
			}
			System.out.println();
		}
		
		// make new Array
//		int[][] arr4 = changeArray(arr3);
//		
//		for(int i = 0; i < arr4.length; i++) {
//			for(int j = 0; j < arr4[i].length; j++) {
//				System.out.print(arr4[i][j]);
//			}
//			System.out.println();
//		}
		
	}

}
