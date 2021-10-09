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
		return this.popular - s.popular;  // �α⵵�� ���ٸ� 0�� ��ȯ������
	}
	
	@Override
	public String toString() {
		return name + "�� �α⵵�� : " + popular;
	}
}

public class CompareToSearch {

	public static void main(String[] args) {
		
		Sports[] sports = new Sports[5];
		sports[0] = new Sports("�౸", 30000);
		sports[1] = new Sports("��", 8000);
		sports[2] = new Sports("�߱�", 18000);
		sports[3] = new Sports("���", 25000);
		sports[4] = new Sports("���", 15000);

		Arrays.sort(sports);
		
		int idx = Arrays.binarySearch(sports, new Sports("���� �α⵵�� ���� �������� ", 15000));
		System.out.println(sports[idx]);
	}

}
