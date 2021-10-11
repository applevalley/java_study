package ch21;

class Value<T> {
	private T val;
	
	public void setValue(T t) {
		val = t;
	}
	
	public T getValue() {
		return val;
	}
}

public class WrapperGeneric {

	public static void main(String[] args) {

		Value<Integer> iVal = new Value<Integer>();
		iVal.setValue(100);
		int num1 =  iVal.getValue();
		System.out.println(num1);
	}

}
