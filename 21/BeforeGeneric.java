package ch21;

class Tangsu {
	public String toString() {
		return "price is 18,000 won";
	}
}

class TangsuBox {
	private Tangsu ts;
	
	public Tangsu getTangsu() {
		return ts;
	}
	
	public void setTangsu(Tangsu ts) {
		this.ts = ts;
	}
	 
}

class Box {
	private Object obj;
	
	public Object getThing() {
		return obj;
	}
	
	public void setThing(Object obj) {
		this.obj = obj;
	}
}

public class BeforeGeneric {

	public static void main(String[] args) {

		TangsuBox tang = new TangsuBox();
		
		tang.setTangsu(new Tangsu());
		
		Tangsu ts = tang.getTangsu();
		
		System.out.println(ts);
		
		Box tbox = new Box();
		
		tbox.setThing(new Tangsu());
		
		Tangsu ts2 = (Tangsu)tbox.getThing();
		
		System.out.println(ts2);
	}

}
