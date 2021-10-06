package ch19;

class Tangsu implements Cloneable {
	private String name;
	private int price;
	
	public Tangsu(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
//	@Override
//	public Object clone() throws CloneNotSupportedException {
//		Tangsu small = (Tangsu)super.clone();    // clone 메서드 호출을 통해 복사본 생성
//		small.name = new String(name);           // 깊은 복사의 형태로 복사본 완성
//		return small;                            // 복사본의 참조 값 반환
//	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();   // 이 쪽이 더 합리적이다
	}
}

public class StringDeepCopy {

	public static void main(String[] args) {

	}

}
