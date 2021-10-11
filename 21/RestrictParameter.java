package ch21;

class ResBox<T extends Number> {
	private T obj;
	
	public void setValue(T o) {
		obj = o;
	}
	
	public T getValue() {
		return obj;
	}
	
	public int intValue() {
		return obj.intValue();
	}
}

public class RestrictParameter {

	public static void main(String[] args) {

		ResBox<Integer> box1 = new ResBox<>();
		box1.setValue(100);
		System.out.println(box1.intValue());
		
		ResBox<Double> box2 = new ResBox<>();
		
//		ResBox<String> box3 = new ResBox<>();  // ¿À·ù!
	}

}
