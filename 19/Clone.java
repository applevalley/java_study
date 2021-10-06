package ch19;

class BMIPoint implements Cloneable {
	private double weight;
	private double height;
	
	public BMIPoint(double weight, double height) {
		this.weight = weight;
		this.height = height;
	}
	
	public void showInfo() {
		System.out.printf("[%f, %f]", weight, height, "\n");
	}
	
	public void calcBMI() {
		System.out.println(weight / (height * 2));
	}
	
//	@Override 
//	public Object clone() throws CloneNotSupportedException {
//		return super.clone();
//	}
	// Ŭ�������� BMIPoint�� ��, ��ȯ���� BMIPoint�� �޼��忡 ���ؼ��� �������̵� �������� ��ȯ���� ������ ����Ѵ�.
	@Override 
	public BMIPoint clone() throws CloneNotSupportedException {
		return (BMIPoint)(super.clone());
	}
}

public class Clone {

	public static void main(String[] args) {

		BMIPoint man = new BMIPoint(93.2, 178.9);
		BMIPoint woman;
		
		try {
//			woman = (BMIPoint)man.clone();      // ��ȯ���� Object�̱⿡ ����� �� ��ȯ�� �ʿ�
			woman = man.clone();   // ��ȯ���� ������ ��� ������� �� ��ȯ�� �ʿ����.
			man.calcBMI();
			woman.calcBMI();
		}
		catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
