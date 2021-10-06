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
	// 클래스명이 BMIPoint일 때, 반환형이 BMIPoint인 메서드에 대해서만 오버라이딩 과정에서 반환형의 수정을 허용한다.
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
//			woman = (BMIPoint)man.clone();      // 반환형이 Object이기에 명시적 형 변환이 필요
			woman = man.clone();   // 반환형을 수정한 경우 명시적인 형 변환이 필요없다.
			man.calcBMI();
			woman.calcBMI();
		}
		catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
