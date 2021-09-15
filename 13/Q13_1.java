package ch13;

public class Q13_1 {
	
	public static int minValue(int[] arr) {
		int temp = arr[0];
		for (int i=0; i < arr.length; i++) {
			if (temp > arr[i]) {
				temp = arr[i];
			}
		}
		return temp;
	}
	
	public static int maxValue(int[] arr) {
		int temp = arr[0];
		for (int e: arr) {
			if (e > temp) {
				temp = e;
			}
		}
		return temp;
	}
	
	public static void main(String[] args) {

		int[] arr1 = {1, 4, 9, 16, 25};
		System.out.println(minValue(arr1));
		
		System.out.println(maxValue(arr1));
		
	}

}
