package ch09.innerpath;

public class Lunch {
	
	public void OrderLunch(ch09.SourPork x) {
		x.Order();
//		x.makeTangSu();       다른 패키지에서 default로 선언되었기에 호출 불가능함. 컴파일 에러!
	}
}
