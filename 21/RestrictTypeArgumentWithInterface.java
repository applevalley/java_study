package ch21;

interface SourPork {
	public String eat();
}

class Order implements SourPork {
	public String toString() {
		return "May I take your order?";
	}
	
	@Override
	public String eat() {
		return "Yammy Yammy!";
	}
}

class FoodBox<T extends SourPork> {
	T obj;
	
	public void setThing(T o) {
		obj = o;
	}
	
	public T getThing() {
		System.out.println(obj.eat());
		return obj;
	}
}

public class RestrictTypeArgumentWithInterface {

	public static void main(String[] args) {

		FoodBox<Order> box1 = new FoodBox<>();
		box1.setThing(new Order());
		
		Order od = box1.getThing();
		System.out.println(od);
	}

}
