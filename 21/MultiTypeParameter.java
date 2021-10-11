package ch21;

class Choose<L, R> {
	private L left;
	private R right;
	
	public void setMenu(L l, R r) {
		left = l;
		right = r;
	}
	
	@Override
	public String toString() {
		return left + ": " + right;
	}
}
 
public class MultiTypeParameter {

	public static void main(String[] args) {

		Choose<String, Integer> box1 = new Choose<String, Integer>();
		box1.setMenu("ÅÁ¼öÀ°", 18000);
		System.out.println(box1.toString());
		
	}

}
