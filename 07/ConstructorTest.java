package java07;

class CreateCharacter {
	String name;    
	String type;
	String job;
	int age;
	int level;
	int strength;
	int dexterity;
	int intelligence;
	int luck;

	// ����Ʈ �����ڸ� ����� ���
	// �̷��� �ϸ� String ���� ������ null��, int ���� ������ 0�� ����.
//	public CreateCharacter() {
//		
//	}
	
	// ������! Ŭ������ �̸��� �����ϰ�, return�� ��ȯ���� ���� �ʴ´�.
	public CreateCharacter(String chaName, String chaType, String chaJob, int chaAge) {
		name = chaName;
		type = chaType;
		job = chaJob;
		age = chaAge;
		level = 1;
		
		if (type == "human") {
			strength = 3;
			dexterity = 3;
			intelligence = 6;
			luck = 3;
		}
		
		else if (type == "elf") {
			strength = 3;
			dexterity = 6;
			intelligence = 3;
			luck = 3;
		}
		
		else if (type == "giant") {
			strength = 6;
			dexterity = 3;
			intelligence = 3;
			luck = 3;
		}
	}
	
	public int levelUp() {
		level += 1;
		
		return level;
	}
	
	public int birthDay() {
		age += 1;
		strength += 1;
		dexterity += 1;
		intelligence += 1;
		luck += 1;
		
		return age;
	}
	
	public void checkStatus() {
		System.out.println("�̸�: " + name);
		System.out.println("����: " + type);
		System.out.println("����: " + age);
		System.out.println("����: " + job);
		System.out.println("����: " + level);
		System.out.println("��: " + strength);
		System.out.println("��ø��: " + dexterity);
		System.out.println("����: " + intelligence);
		System.out.println("���: " + luck);
	}
}

public class ConstructorTest {

	public static void main(String[] args) {
		// ������ ȣ�� �� �Ű������� ���޵ȴ�! �ش� ����� �ν��ϼ� ������ �ʱ�ȭ�ȴ�.
		CreateCharacter kim = new CreateCharacter("kim", "human", "swordsman", 17);
 		kim.checkStatus();
 		kim.birthDay();
		kim.checkStatus();
		
	}

}

