package ch19;

class Car {
	String name;
	
	public Car(String name) {
		this.name = name;
	}
	
	@Override
	protected void finalize() throws Throwable {
		super.finalize();  // ���� Ŭ������ finalize �޼��� ȣ��
		System.out.println("�ڵ��� �غ�: " + name);
	}
}

public class Finalize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car punk = new Car("520D");
		punk.name = null;  // �����ϴ� �ν��Ͻ��� ������ �÷����� ������� �����.
		
//		System.gc();  
//		System.runFinalization();  // �� �� �޼��� ȣ���� ���� ������ �÷����� ������ ��û�� �� �ִ�.
	}

}
