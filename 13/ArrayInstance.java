package ch13;

class EmptyBox {
	private String words;
	
	EmptyBox(String str) {
		this.words = str;
	}
	
	public String toString() {
		return words;
	}
}

public class ArrayInstance {

	static int sumArray(int[] arr) {
		int sum = 0;
		for (int i=0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}	
	
	static int[] makeNewArray(int num) {
		int[] arr = new int[num];
		return arr;
	}
	
	public static void main(String[] args) {

		int[] arr1 = new int[10];
		String[] arr2 = new String[20];
		
		System.out.println(arr1.length);
		System.out.println(arr2.length);
		
		EmptyBox[] arr3 = new EmptyBox[10];
		
		System.out.println(arr3.length);
		
		arr3[0] = new EmptyBox("Hello");
		System.out.println(arr3[0].toString());
		
		arr1[0] = 3;
		System.out.println(arr1[0]);
		
		for (int i=1; i < arr3.length; i++) {
			arr3[i] = new EmptyBox("Yes");
		}
		
		System.out.println();
		
		for (int i=0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}
		
		int[] arr4 = {1,2,3};
		System.out.println(arr4[0] + arr4[1]);
		
		int temp = sumArray(arr4);
		System.out.println(temp);
		
		int[] arr5 = makeNewArray(4);
		arr5[0] = 5;
		System.out.println(arr5[0]);
	}

}
