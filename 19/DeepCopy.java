package ch19;

class BMIPoint3 implements Cloneable {
	private double weight;
	private double height;
	
	public BMIPoint3(double weight, double height) {
		this.weight = weight;
		this.height = height;
	}
	
	public void setInfo(double w, double h) {
		weight = w;
		height = h;
	}
	
	public void showInfo() {
		System.out.printf("[%f, %f]", weight, height, "\n");
	}
	
	public double calcBMI() {
		System.out.println("����� BMI��: " +  (weight / (height * 2)) * 100);
		return weight / (height * 2);
	}
	
	@Override 
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

class Grade2 implements Cloneable {
	private BMIPoint3 man;
	
	public Grade2(double w, double h) {
		man = new BMIPoint3(w, h);
	}
	
	public void changeInfo(double w, double h) {
		man.setInfo(w, h);
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		Grade2 copy = (Grade2)super.clone();
		copy.man = (BMIPoint3)man.clone();
		return copy;
	}
	
	public void showInfo() {
		if(man.calcBMI() >= 0.33) {
			System.out.println("�����Դϴ�.");
		}
		else {
			System.out.println("�����Դϴ�.");
		}
	}
}

public class DeepCopy {

	public static void main(String[] args) {
		
		Grade2 kim = new Grade2(120.2, 170.3);
		Grade2 lee;
		
		try {
			lee = (Grade2)kim.clone();  // �ν��Ͻ� ����
			kim.changeInfo(90.0, 171.0);   // ������ Ű ���� ����
			kim.showInfo();
			lee.showInfo();
		}
		catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
