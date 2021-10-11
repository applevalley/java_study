package ch21;

class Animal<T> {
	private T obj;
	
	public void setValue(T o) {
		obj = o;
	}
	
	public T getValue() {
		return obj;
	}
}


class AnimalFarm {
	public static <T extends Number> Animal<T> AnimalSerialNumber(T o) {
		Animal<T> animal = new Animal<T>();
		animal.setValue(o);
		
		System.out.println("Input Name: " + o.intValue());
		return animal;
	}
}

class UnBox {
	public static <T extends Number> T showNumber(Animal<T> animal) {
		System.out.println("Output Name: " + animal.getValue());
		return animal.getValue();
	}
}

public class RestrictTypeArgumentInGenericMethod {

	public static void main(String[] args) {

		Animal<Integer> animal = AnimalFarm.AnimalSerialNumber(new Integer(3000));
		int n = UnBox.showNumber(animal);
		System.out.println("return: " + n);
		
	}

}
