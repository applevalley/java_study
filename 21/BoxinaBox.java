package ch21;

class FirstBox<T> {
	private T obj;
	
	public void setValue(T val) {
		obj = val;
	}
	
	public T getValue() {
		return obj;
	}
}


public class BoxinaBox {

	public static void main(String[] args) {

		FirstBox<String> box1 = new FirstBox<>();
		box1.setValue("hello");
		
		FirstBox<FirstBox<String>> box2 = new FirstBox<>();
		box2.setValue(box1);
		
		FirstBox<FirstBox<FirstBox<String>>> box3 = new FirstBox<>();
		box3.setValue(box2);
		
		System.out.println(box3.getValue().getValue().getValue());
	}

}
