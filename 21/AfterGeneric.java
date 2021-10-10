package ch21;

class Tangsu2 {
	public String toString() {
		return "price is 18,000 won";
	}
}

class Box2<T> {
	private T obj;
	
	public T getThing() {
		return obj;
	}
	
	public void setThing(T obj) {
		this.obj = obj;
	}
}

public class AfterGeneric {

	public static void main(String[] args) {

		Box2<Tangsu2> tang = new Box2<Tangsu2>();
		tang.setThing(new Tangsu2());
		Tangsu2 ts2 = tang.getThing();
		System.out.println(ts2);
	}

}
