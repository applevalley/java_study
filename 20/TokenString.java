package ch20;

import java.util.StringTokenizer;

public class TokenString {

	public static void main(String[] args) {

		String str1 = "Tangsuyuk, Zzajangmyeon, Zzambbong";
		StringTokenizer token1 = new StringTokenizer(str1, ", ");
		
		while(token1.hasMoreTokens()) {
			System.out.print(token1.nextToken() + ' ');
		}
		System.out.println();
		
		StringTokenizer token2 = new StringTokenizer("bc@wj#er$ex%", "@#$%");
		
		while(token2.hasMoreTokens()) {
			System.out.print(token2.nextToken() + ' ');
		}
		System.out.println();
		
		StringTokenizer token3 = new StringTokenizer("bc@wj#er$ex%", "@#$%", true);
		
		while(token3.hasMoreTokens()) {
			System.out.print(token3.nextToken() + ' ');
		}
	}

}
