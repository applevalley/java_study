package ch21;

class Food<T> {
	private T obj;
	
	public void setThing(T o) {
		obj = o;
	}
	
	public T getThing() {
		return obj;
	}
	
}

class FoodOrder {
	public static <T> Food<T> makeFood(T o) {
		Food<T> food = new Food<T>();
		food.setThing(o);
		return food;
	}
}

public class GenericMethod {

	public static void main(String[] args) {

//		Food<String> foo = FoodOrder.<String>makeFood("zzazangmmyeon");
		Food<String> foo = FoodOrder.makeFood("zzambbong");
		System.out.println(foo.getThing());
	}

}
