package ch13;

public class TwoDimensionArray {

	public static void main(String[] args) {

		int[][] arr1 = new int[5][5];
//		arr1[2] = new int[7];
		int num = 1;
		
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1[i].length; j++) {
				if((i + j) % 2 != 0) {
					arr1[i][j] = num;
				}
				else arr1[i][j] = 0;
			}
		}
		
		System.out.println();
		
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
		
		int[][] arr2 = {   // same for int[][] arr2 = new int[][] {...}
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9}
		};
		
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
