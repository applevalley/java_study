package ch13;

class Employee {
	private String name;
	private String part;
	private String rank;
	
	Employee (String name, String part, String rank) {
		this.name = name;
		this.part = part;
		this.rank = rank;
	}
	
	Employee (String name, String rank) {
		this (name, "undefined", rank);
	}
	
	public String setPart(String part) {
		this.part = part;
		return part;
	}
	
	public String getPromote (String after) {
		this.rank = after;
		System.out.println(name + "��(��) " + after + "(��)�� �����Ͽ����ϴ�.");
		return after;
	}
	
	public String getName() {
		return name;
	}
	
	public String getPart() {
		return part;
	}
}

public class EnhancedFor {

	public static void main(String[] args) {

		double[] arr1 = {1.0, 4.0, 9.0, 25.0};
		
		for (double e: arr1) {
			e = Math.sqrt(e);
			System.out.println(e);
		}
		
		int sum = 0;
		
		for (int i=0; i<arr1.length; i++) {
			sum += (int)arr1[i];
		}
		
		System.out.println("�� ����: " + sum + "\n");
		
		Employee[] arr2 = new Employee[3];
		
		arr2[0] = new Employee("��ö��", "����1��", "����");
		arr2[1] = new Employee("�̿���", "����2��", "�븮");
		arr2[2] = new Employee("�ڿ���", "����");
		
		System.out.println(arr2[2].getPart());
		System.out.println(arr2[2].setPart("����2��"));
		System.out.println(arr2[2].getPromote("���"));
		
		System.out.println(arr2[2].getPart());
		
		for (Employee e:arr2) {
			if (e.getName() == "��ö��") {
				System.out.println(e.getName());
			}
		}
	}

}
