package ch12;

public class StringFormating {

	public static void main(String[] args) {

		int age = 29;
		double height = 182.0;
		String name = "applevalley";
		
		System.out.printf("�̸���: %s", name + "\n");
		System.out.printf("���̴� %d, Ű�� %f \n", age, height); // height �ڿ� + "\n"���� ���ϱ� ������ �߻��ߴ�!
		System.out.format("�ȳ��ϼ���, %s", name);
	}

}
