package step1.review;

class Animal{
	public void sleep() {
		System.out.println("자다");
	}
	public void eat() {
		System.out.println("먹다");
	}
}

class Person extends Animal{
	// 메서드 오버라이딩 : 부모 메서드를 자신에 맞게 재정의
	public void eat() {
		System.out.println("사람이 수저로 밥을 먹다");
	}
	// 자신의 독자적인 메서드
	public void study() {
		System.out.println("사람이 공부하다");
	}
}

public class TestPolymorphism {
	public static void main(String[] args) {
		// 부모타입의 변수에 자식 타입의 객체를 참조시킬수 있다.
		Animal a = new Person();
		// 이 경우 바로 접근하여 사용가능한 것은
		// 부모로부터 상속받은 멤버(변수, 메서드)와 오버라이딩한 메서드이다.
		a.sleep(); // 상속받은 거
		a.eat(); // 오버라이딩한 것
		// a.study(); // 독자적인것은 바로 접근이 불가능하다. 다운캐스팅이 필요하다.
		// 접근하기위해서는 Object Down Casting이 필요하다.
		((Person)a).study();
	}
}
