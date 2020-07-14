package step3;

public class Friend {
	private String name; // 기본 초기화 null
	private int age; // 기본 초기화 0
	// 인스턴스 변수의 명시적 초기화
	private int money = 10000;
	
	public Friend(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getMoney() {
		return money;
	}
}
