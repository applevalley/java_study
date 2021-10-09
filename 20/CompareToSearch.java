package ch20;

import java.util.Arrays;

class Sports implements Comparable {
	private String name;
	private int popular;
	
	public Sports(String name, int popular) {
		this.name = name;
		this.popular = popular;
	}
	
	@Override
	public int compareTo(Object obj) { 
		Sports s = (Sports)obj;
		return this.popular - s.popular;  // 인기도가 같다면 0을 반환해주자
	}
	
	@Override
	public String toString() {
		return name + "의 인기도는 : " + popular;
	}
}

public class CompareToSearch {

	public static void main(String[] args) {
		
		Sports[] sports = new Sports[5];
		sports[0] = new Sports("축구", 30000);
		sports[1] = new Sports("농구", 8000);
		sports[2] = new Sports("야구", 18000);
		sports[3] = new Sports("양궁", 25000);
		sports[4] = new Sports("펜싱", 15000);

		Arrays.sort(sports);
		
		int idx = Arrays.binarySearch(sports, new Sports("같은 인기도를 가진 스포츠는 ", 15000));
		System.out.println(sports[idx]);
	}

}
