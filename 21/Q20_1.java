package ch21;

class DBox<L, R> {
	private L left;
	private R right;
	public void set(L o, R r) {
		left = o;
		right = r;
	}
	
	public String toString() {
		return left + " & " + right;
	}
}

//class DDBox<U, D> {
//	private U up;
//	private D down;
//	
//	public void set(U u, D d) {
//		up = u;
//		down = d;
//	}
//	
//	public String toString() {
//		return up + " & " + down;
//	}
//}

public class Q20_1 {

	public static void main(String[] args) {

//		DBox<String, Integer> box1 = new DBox<>();
//		box1.set("Apple", 25);
//		DBox<String, Integer> box2 = new DBox<>();
//		box2.set("Orange", 33);
//		
//		DDBox<DBox<String, Integer>, DBox<String, Integer>> box3 = new DDBox<>();
//		box3.set(box1, box2);
//		System.out.println(box3);
		
		DBox<String, Integer> box1 = new DBox<>();
		box1.set("apple", 25);
		DBox<String, Integer> box2 = new DBox<>();
		box2.set("orange", 33);
		DBox<DBox<String, Integer>, DBox<String, Integer>> box3 = new DBox<>();
		box3.set(box1, box2);
		System.out.println(box3);
	}

}
