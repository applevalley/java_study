package ch19;

class BMIPoint2 implements Cloneable {
	private double weight;
	private double height;
	
	public BMIPoint2(double weight, double height) {
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
		System.out.println("당신의 BMI는: " +  (weight / (height * 2)) * 100);
		return weight / (height * 2);
	}
	
	@Override 
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

class Grade implements Cloneable {
	private BMIPoint2 man;
	
	public Grade(double w, double h) {
		man = new BMIPoint2(w, h);
	}
	
	public void changeInfo(double w, double h) {
		man.setInfo(w, h);
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public void showInfo() {
		if(man.calcBMI() >= 0.33) {
			System.out.println("공익입니다.");
		}
		else {
			System.out.println("현역입니다.");
		}
	}
}

public class ShallowCopy {

	public static void main(String[] args) {

		Grade kim = new Grade(120.2, 170.3);
		Grade lee;
		
		try {
			lee = (Grade)kim.clone();  // 인스턴스 복사
			kim.changeInfo(90.0, 171.0);   // 몸무게 키 정보 수정
			kim.showInfo();
			lee.showInfo();
		}
		catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
