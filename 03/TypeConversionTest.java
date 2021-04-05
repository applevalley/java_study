package ch10;

public class TypeConversionTest {

	public static void main(String[] args) {
		
		byte bNum = 126;
		int iNum = bNum;  // �������� ���� �ڷ��� -> ū �ڷ���
		
		int iNum2 = 255;
//		byte bNum2 = iNum2;  // 255�� byte�� ������ �ʰ��Ѵ� -> ���� �߻�
		byte bNum2 = (byte)iNum2; // byte�� ����� ����ȯ -> ������ byte�� ������ �ʰ��ϴ� ��
		
		System.out.println(iNum);
		System.out.println(bNum2); // -1�̶�� �� ���.. ������ ���� �ʾҴ�
		
		double dNum = 3.14;
		int iNum3 = (int)dNum;
		
		System.out.println(iNum3); // �Ǽ��� ������ ��ȯ -> �Ǽ��ΰ� �߷�������
		
		double dNum2 = 1.3;
		float fNum = 0.9f; // f �ٿ�����Ѵ�
		
		int iNum4 = (int)dNum2 + (int)fNum; // ���� int�� ���� ��ȯ -> ������ 1�� 0�� ��������
		int iNum5 = (int)(dNum2 + fNum);  // �� �Ǽ��� ���� ���ϰ� int�� ��ȯ -> ������ 2�� ���´�
		
		System.out.println(iNum4);
		System.out.println(iNum5);
	}

}
