package java07;

class animal {
	// �ν��Ͻ� ������! ���� �����ʹ� �ٸ���!
	// �ν��Ͻ� ������ ���� Ŭ���� ���� �޼��� ���� ������ ������
	boolean status = false;
	
	public void birth() {
		System.out.println("�ȳ�!");
		status = true;
	}
	
	public void death() {
		System.out.println("�߰�..");
		status = false;
	}
	
	public void alive() {
		if (status) {
			System.out.println("����־��");
		}
		else {
			System.out.println("�׾����ϴ�");
		}
	}
}

public class ClassTest {

	public static void main(String[] args) {
		// Ŭ���� animal�� �ν��Ͻ��� ���� ���� dog�� �Ҵ�Ǿ���.
		// ���� ���� dog�� �����ϴ� ���� �ν��Ͻ��� �޸� �ּ� ��
		animal dog = new animal();
		// ���� ���� cat�� dog�� �Ҵ������� cat�� dog�� ���� �޸� �ּ� ���� �����Ѵ�. �� ���� ������ �ϳ��� �ν��Ͻ��� �����ϴ� ���̴�.
		animal cat = dog;
		dog.birth();
		check(dog);
		
		// ���� ������ null�� �����ϸ� �����ϴ� �ν��Ͻ����� ���谡 ��������.
		// cat = null;  �ּ� Ǯ�� �ٷ� �Ʒ��� Ŭ���� �޼��� ȣ�⿡�� ������ �� ��!
		cat.death();
		check(cat);
	}
	
	public static void check(animal name) {
		name.alive();
	}

}
