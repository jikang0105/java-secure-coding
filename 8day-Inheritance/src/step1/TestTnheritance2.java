package step1;

class Animal{
	private int age = 1;
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
}
// Person(sub class)은 Animal(super class)을 상속받는다.
// extends : 확장하다
class Person extends Animal{
	public void study() {
		System.out.println(getAge() + "살이 공부하다.");
	}
	
}

public class TestTnheritance2 {
	public static void main(String[] args) {
		Person p = new Person(); // 자식 객체를 생성
		// compile error : age변수는 private 접근 제어자로 선언되어있고
		// private은 자신의 클래스 내에서만 접근 가능하다.
		// 상속받았어도 클래스가 다르므로 직접적으로 접근하는 것이 불가능하다.
		//System.out.println(p.age);
		System.out.println(p.getAge());
	}
}
