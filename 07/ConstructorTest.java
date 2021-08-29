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

	// 디폴트 생성자를 만드는 경우
	// 이렇게 하면 String 변수 값에는 null이, int 변수 값에는 0이 들어간다.
//	public CreateCharacter() {
//		
//	}
	
	// 생성자! 클래스의 이름과 동일하고, return과 반환형을 쓰지 않는다.
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
		System.out.println("이름: " + name);
		System.out.println("종족: " + type);
		System.out.println("나이: " + age);
		System.out.println("직업: " + job);
		System.out.println("레벨: " + level);
		System.out.println("힘: " + strength);
		System.out.println("민첩성: " + dexterity);
		System.out.println("지능: " + intelligence);
		System.out.println("행운: " + luck);
	}
}

public class ConstructorTest {

	public static void main(String[] args) {
		// 생성자 호출 시 매개변수로 전달된다! 해당 값들로 인스턴수 변수가 초기화된다.
		CreateCharacter kim = new CreateCharacter("kim", "human", "swordsman", 17);
 		kim.checkStatus();
 		kim.birthDay();
		kim.checkStatus();
		
	}

}

